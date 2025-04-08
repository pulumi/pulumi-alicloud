// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package alicloud

import (
	"bytes"
	"fmt"
	"path"
	"strings"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/aliyun/terraform-provider-alicloud/alicloud"
	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens/fallbackstrat"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-alicloud/provider/v3/pkg/version"
)

// all of the AliCloud token components used below.
const (
	// packages:
	alicloudPkg = "alicloud"
	// modules:
	alicloudMod            = "index"
	ackOneMod              = "AckOne"
	actionTrailMod         = "ActionTrail"
	adbMod                 = "Adb"
	albMod                 = "Alb"
	aliKafaMod             = "AliKafka"
	amqpMod                = "Amqp"
	apiGatewayMod          = "ApiGateway"
	armsMod                = "Arms"
	bastionHostMod         = "BastionHost"
	bpMod                  = "Bp"
	brainMod               = "Brain"
	bssMod                 = "Bss"
	casMod                 = "Cas"
	cassandraMod           = "Cassandra"
	cddcMod                = "Cddc"
	cdnMod                 = "Cdn"
	cenMod                 = "Cen"
	cfgMod                 = "Cfg"
	clickHouseMod          = "ClickHouse"
	cloudAuthMod           = "CloudAuth"
	cloudConnectMod        = "CloudConnect"
	cloudControlMod        = "CloudControl"
	cloudFirewallMod       = "CloudFirewall"
	cloudMonitorMod        = "CloudMonitor"
	cloudSsoMod            = "CloudSso"
	cloudStorageGatewayMod = "CloudStorageGateway"
	cmsMod                 = "Cms"
	computeMod             = "Compute"
	crMod                  = "CR"
	csMod                  = "CS"
	dasMod                 = "Das"
	dataWorksMod           = "DataWorks"
	databaseFilesystemMod  = "DatabaseFilesystem"
	databaseGatewayMod     = "DatabaseGateway"
	datahubMod             = "Datahub"
	dbsMod                 = "DBS"
	dcdnMod                = "Dcdn"
	ddosMod                = "Ddos"
	ddsMod                 = "Dds"
	dfsMod                 = "Dfs"
	directMailMod          = "DirectMail"
	dmsMod                 = "Dms"
	dnsMod                 = "Dns"
	drdsMod                = "Drds"
	dtsMod                 = "Dts"
	eaisMod                = "Eais"
	ebsMod                 = "Ebs"
	eciMod                 = "Eci"
	ecpMod                 = "Ecp"
	ecsMod                 = "Ecs"
	edasMod                = "Edas"
	edsMod                 = "Eds"
	ehpcMod                = "Ehpc"
	eipAnyCastMod          = "EipAnycast"
	elasticsearchMod       = "ElasticSearch"
	emrMod                 = "Emr"
	ensMod                 = "Ens"
	esaMod                 = "Esa"
	essMod                 = "Ess"
	eventBridgeMod         = "EventBridge"
	expressConnectMod      = "ExpressConnect"
	fcMod                  = "FC"
	fnfMod                 = "FNF"
	gaMod                  = "Ga"
	gpdbMod                = "Gpdb"
	graphDatabaseMod       = "GraphDatabase"
	gwlbMod                = "Gwlb"
	hbaseMod               = "Hbase"
	hbrMod                 = "Hbr"
	hologramMod            = "Hologram"
	immMod                 = "Imm"
	impMod                 = "Imp"
	imsMod                 = "Ims"
	iotMod                 = "Iot"
	kmsMod                 = "Kms"
	kvstoreMod             = "KVStore"
	lindormMod             = "Lindorm"
	logMod                 = "Log"
	marketPlaceMod         = "MarketPlace"
	maxComputeMod          = "MaxCompute"
	messageMod             = "Message"
	mhubMod                = "Mhub"
	mnsMod                 = "Mns"
	mongoDbMod             = "MongoDB"
	mseMod                 = "Mse"
	nasMod                 = "Nas"
	nlbMod                 = "Nlb"
	oosMod                 = "Oos"
	openSearchMod          = "OpenSearch"
	ossMod                 = "Oss"
	otsMod                 = "Ots"
	polarDbMod             = "PolarDB"
	privateLinkMod         = "PrivateLink"
	pvtzMod                = "Pvtz"
	quickBiMod             = "QuickBI"
	quotasMod              = "Quotas"
	ramMod                 = "Ram"
	rdcMod                 = "Rdc"
	rdsMod                 = "Rds"
	redisMod               = "Redis"
	resourceManagerMod     = "ResourceManager"
	rocketMqMod            = "RocketMQ"
	rosMod                 = "Ros"
	saeMod                 = "Sae"
	sagMod                 = "Sag"
	sasMod                 = "SimpleApplicationServer"
	scdnMod                = "Scdn"
	schedulerXMod          = "SchedulerX"
	sddpMod                = "Sddp"
	securityCenterMod      = "SecurityCenter"
	selectDbMod            = "SelectDB"
	serviceCatalogMod      = "ServiceCatalog"
	serviceMeshMod         = "ServiceMesh"
	slbMod                 = "Slb"
	slsMod                 = "Sls"
	smsMod                 = "Sms"
	tagMod                 = "Tag"
	threatDetectionMod     = "ThreatDetection"
	tsdbMod                = "Tsdb"
	vodMod                 = "Vod"
	vpcMod                 = "Vpc"
	vpnMod                 = "Vpn"
	vsMod                  = "VideoSurveillance"
	wafMod                 = "Waf"
	wafv3Mod               = "Wafv3"
	yundunMod              = "Yundun"
)

// A mapping between the terraform prefix and the pulumi module name.
// This mapping is used by x.TokensKnownModules to compute module names.
var mappedMods = map[string]string{
	"ack_one":               ackOneMod,
	"actiontrail":           actionTrailMod,
	"adb":                   adbMod,
	"alb":                   albMod,
	"aligreen":              "Aligreen",
	"alikafa":               aliKafaMod,
	"amqp":                  amqpMod,
	"api_gateway":           apiGatewayMod,
	"apig":                  "Apig",
	"arms":                  armsMod,
	"audit":                 "Audit",
	"bastionhost":           bastionHostMod,
	"bp":                    bpMod,
	"brain":                 brainMod,
	"bss":                   bssMod,
	"cas":                   casMod,
	"cassandra":             cassandraMod,
	"cddc":                  cddcMod,
	"cdn":                   cdnMod,
	"cen":                   cenMod,
	"cfg":                   cfgMod,
	"chatbot":               "Chatbot",
	"clickhouse":            clickHouseMod,
	"cloud_connect":         cloudConnectMod,
	"cloud_control":         cloudControlMod,
	"cloud_firewall":        cloudFirewallMod,
	"cloud_monitor":         cloudMonitorMod,
	"cloud_sso":             cloudSsoMod,
	"cloud_storage_gateway": cloudStorageGatewayMod,
	"cloudauth":             cloudAuthMod,
	"cms":                   cmsMod,
	"compute":               computeMod,
	"cr":                    crMod,
	"cs":                    csMod,
	"das":                   dasMod,
	"data_works":            dataWorksMod,
	"database_gateway":      databaseGatewayMod,
	"datahub":               datahubMod,
	"dbfs":                  databaseFilesystemMod,
	"dbs":                   dbsMod,
	"dcdn":                  dcdnMod,
	"ddos":                  ddosMod,
	"dds":                   ddsMod,
	"dfs":                   dfsMod,
	"direct_mail":           directMailMod,
	"dms":                   dmsMod,
	"dns":                   dnsMod,
	"drds":                  drdsMod,
	"dts":                   dtsMod,
	"eais":                  eaisMod,
	"ebs":                   ebsMod,
	"eci":                   eciMod,
	"ecp":                   ecpMod,
	"ecs":                   ecsMod,
	"edas":                  edasMod,
	"eds":                   edsMod,
	"eflo":                  "Eflo",
	"ehpc":                  ehpcMod,
	"eipanycast":            eipAnyCastMod,
	"elasticsearch":         elasticsearchMod,
	"emr":                   emrMod,
	"emrv2":                 "Emrv2",
	"ens":                   ensMod,
	"esa":                   esaMod,
	"ess":                   essMod,
	"event_bridge":          eventBridgeMod,
	"express_connect":       expressConnectMod,
	"fc":                    fcMod,
	"fnf":                   fnfMod,
	"ga":                    gaMod,
	"governance":            "Governance",
	"gpdb":                  gpdbMod,
	"gwlb":                  gwlbMod,
	"graph_database":        graphDatabaseMod,
	"hbase":                 hbaseMod,
	"hbr":                   hbrMod,
	"hologram":              hologramMod,
	"imm":                   immMod,
	"imp":                   impMod,
	"ims":                   imsMod,
	"iot":                   iotMod,
	"kms":                   kmsMod,
	"kvstore":               kvstoreMod,
	"lindorm":               lindormMod,
	"live":                  "Live",
	"log":                   logMod,
	"market":                marketPlaceMod,
	"maxcompute":            maxComputeMod,
	"max_compute":           maxComputeMod,
	"message":               messageMod,
	"mhub":                  mhubMod,
	"mns":                   mnsMod,
	"mongodb":               mongoDbMod,
	"mse":                   mseMod,
	"nas":                   nasMod,
	"nlb":                   nlbMod,
	"ocean":                 "Ocean",
	"ons":                   rocketMqMod,
	"oos":                   oosMod,
	"open_search":           openSearchMod,
	"oss":                   ossMod,
	"ots":                   otsMod,
	"pai":                   "Pai",
	"polardb":               polarDbMod,
	"privatelink":           privateLinkMod,
	"pvtz":                  pvtzMod,
	"quick_bi":              quickBiMod,
	"quotas":                quotasMod,
	"ram":                   ramMod,
	"rdc":                   rdcMod,
	"rds":                   rdsMod,
	"realtime_compute":      "RealtimeCompute",
	"redis":                 redisMod,
	"resource_manager":      resourceManagerMod,
	"rocketmq":              rocketMqMod,
	"ros":                   rosMod,
	"sae":                   saeMod,
	"sag":                   sagMod,
	"sas":                   sasMod,
	"scdn":                  scdnMod,
	"schedulerx":            schedulerXMod,
	"sddp":                  sddpMod,
	"security_center":       securityCenterMod,
	"selectdb":              selectDbMod,
	"service_catalog":       serviceCatalogMod,
	"service_mesh":          serviceMeshMod,
	"slb":                   slbMod,
	"sls":                   slsMod,
	"sms":                   smsMod,
	"tag":                   tagMod,
	"threat_detection":      threatDetectionMod,
	"tsdb":                  tsdbMod,
	"vod":                   vodMod,
	"vpc":                   vpcMod,
	"vpn":                   vpnMod,
	"vs":                    vsMod,
	"waf":                   wafMod,
	"wafv3":                 wafv3Mod,
	"yundun":                yundunMod,
}

var namespaceMap = map[string]string{
	"alicloud": "AliCloud",
}

// alicloudMember manufactures a type token for the AliCloud package and the given module, file name, and type.
func alicloudMember(moduleTitle string, fn string, mem string) tokens.ModuleMember {
	moduleName := strings.ToLower(moduleTitle)
	namespaceMap[moduleName] = moduleTitle
	if fn != "" {
		moduleName += "/" + fn
	}
	return tokens.ModuleMember(alicloudPkg + ":" + moduleName + ":" + mem)
}

// alicloudType manufactures a type token for the AWS package and the given module, file name, and type.
func alicloudType(mod string, fn string, typ string) tokens.Type {
	return tokens.Type(alicloudMember(mod, fn, typ))
}

// alicloudTypeDefaultFile manufactures a standard resource token given a module and resource name.  It automatically
// uses the package and names the file by simply lower casing the type's first character.
func alicloudTypeDefaultFile(mod string, typ string) tokens.Type {
	fn := string(unicode.ToLower(rune(typ[0]))) + typ[1:]
	return alicloudType(mod, fn, typ)
}

// dataSource manufactures a standard resource token given a module and resource name.  It automatically uses the AWS
// package and names the file by simply lower casing the data source's first character.
func dataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return alicloudMember(mod, fn, res)
}

// resource manufactures a standard resource token given a module and resource name.
func resource(mod string, res string) tokens.Type {
	return alicloudTypeDefaultFile(mod, res)
}

// Provider returns additional overlaid schema and metadata associated with the alicloud package.
func Provider() tfbridge.ProviderInfo {
	p := shimv1.NewProvider(alicloud.Provider().(*schema.Provider))

	prov := tfbridge.ProviderInfo{
		P:            p,
		Name:         "alicloud",
		DisplayName:  "Alibaba Cloud",
		Description:  "A Pulumi package for creating and managing AliCloud resources.",
		Keywords:     []string{"pulumi", "alicloud"},
		Homepage:     "https://pulumi.io",
		License:      "Apache-2.0",
		GitHubOrg:    "aliyun",
		Repository:   "https://github.com/pulumi/pulumi-alicloud",
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		DocRules:     &tfbridge.DocRuleInfo{EditRules: docEditRules},
		Config: map[string]*tfbridge.SchemaInfo{
			"ecs_role_name": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"ALICLOUD_ECS_ROLE_NAME"},
				},
			},
			"region": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"ALICLOUD_REGION"},
				},
			},
			"profile": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"ALICLOUD_PROFILE"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			// Mainmod
			"alicloud_msc_sub_contact":      {Tok: resource(alicloudMod, "MscSubContract")},
			"alicloud_msc_sub_subscription": {Tok: resource(alicloudMod, "MscSubSubscription")},
			"alicloud_msc_sub_webhook":      {Tok: resource(alicloudMod, "MscSubWebhook")},

			// ActionTrail
			"alicloud_actiontrail_trail":                {Tok: resource(actionTrailMod, "Trail")},
			"alicloud_actiontrail_history_delivery_job": {Tok: resource(actionTrailMod, "HistoryDeliveryJob")},
			"alicloud_actiontrail": {
				Tok:                resource(actionTrailMod, "TrailDeprecated"),
				DeprecationMessage: "Resource renamed to `Trail`",
			},

			// Adb
			"alicloud_adb_account":                 {Tok: resource(adbMod, "Account")},
			"alicloud_adb_backup_policy":           {Tok: resource(adbMod, "BackupPolicy")},
			"alicloud_adb_cluster":                 {Tok: resource(adbMod, "Cluster")},
			"alicloud_adb_connection":              {Tok: resource(adbMod, "Connection")},
			"alicloud_adb_db_cluster":              {Tok: resource(adbMod, "DBCluster")},
			"alicloud_adb_db_cluster_lake_version": {Tok: resource(adbMod, "DBClusterLakeVersion")},
			"alicloud_adb_resource_group":          {Tok: resource(adbMod, "ResourceGroup")},

			// Alb
			"alicloud_alb_ascript":         {Tok: resource(albMod, "AScript")},
			"alicloud_alb_security_policy": {Tok: resource(albMod, "SecurityPolicy")},
			"alicloud_alb_server_group":    {Tok: resource(albMod, "ServerGroup")},
			"alicloud_alb_load_balancer":   {Tok: resource(albMod, "LoadBalancer")},
			"alicloud_alb_rule":            {Tok: resource(albMod, "Rule")},
			"alicloud_alb_acl":             {Tok: resource(albMod, "Acl")},
			"alicloud_alb_listener": {
				Tok: resource(albMod, "Listener"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// This property was deprecated in favor of x_forwarded_for_config, and continuing to generate a
					// binding causes the .NET SDK to not compile, so we skip:
					"xforwarded_for_config": {
						Omit: true,
					},
				},
			},
			"alicloud_alb_health_check_template":                      {Tok: resource(albMod, "HealthCheckTemplate")},
			"alicloud_alb_listener_additional_certificate_attachment": {Tok: resource(albMod, "ListenerAdditionalCertificateAttachment")},
			"alicloud_alb_listener_acl_attachment":                    {Tok: resource(albMod, "ListenerAclAttachment")},
			"alicloud_alb_acl_entry_attachment":                       {Tok: resource(albMod, "AclEntryAttachment")},

			// AliKafka
			"alicloud_alikafka_consumer_group":                 {Tok: resource(aliKafaMod, "ConsumerGroup")},
			"alicloud_alikafka_instance":                       {Tok: resource(aliKafaMod, "Instance")},
			"alicloud_alikafka_sasl_acl":                       {Tok: resource(aliKafaMod, "SaslAcl")},
			"alicloud_alikafka_sasl_user":                      {Tok: resource(aliKafaMod, "SaslUser")},
			"alicloud_alikafka_instance_allowed_ip_attachment": {Tok: resource(aliKafaMod, "InstanceAllowedIpAttachment")},
			"alicloud_alikafka_topic": {
				Tok: resource(aliKafaMod, "Topic"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"topic": {
						CSharpName: "TopicName",
					},
				},
			},

			// amqp
			"alicloud_amqp_binding":        {Tok: resource(amqpMod, "Binding")},
			"alicloud_amqp_exchange":       {Tok: resource(amqpMod, "Exchange")},
			"alicloud_amqp_instance":       {Tok: resource(amqpMod, "Instance")},
			"alicloud_amqp_queue":          {Tok: resource(amqpMod, "Queue")},
			"alicloud_amqp_static_account": {Tok: resource(amqpMod, "StaticAccount")},
			"alicloud_amqp_virtual_host":   {Tok: resource(amqpMod, "VirtualHost")},

			// Api Gateway
			"alicloud_api_gateway_api":            {Tok: resource(apiGatewayMod, "Api")},
			"alicloud_api_gateway_app":            {Tok: resource(apiGatewayMod, "App")},
			"alicloud_api_gateway_app_attachment": {Tok: resource(apiGatewayMod, "AppAttachment")},
			"alicloud_api_gateway_backend":        {Tok: resource(apiGatewayMod, "Backend")},
			"alicloud_api_gateway_log_config":     {Tok: resource(apiGatewayMod, "LogConfig")},
			"alicloud_api_gateway_model":          {Tok: resource(apiGatewayMod, "Model")},
			"alicloud_api_gateway_plugin":         {Tok: resource(apiGatewayMod, "Plugin")},
			"alicloud_api_gateway_vpc_access":     {Tok: resource(apiGatewayMod, "VpcAccess")},
			"alicloud_api_gateway_group":          {Tok: resource(apiGatewayMod, "Group")},

			// Arms
			"alicloud_arms_alert_contact":         {Tok: resource(armsMod, "AlertContact")},
			"alicloud_arms_alert_contact_group":   {Tok: resource(armsMod, "AlertContactGroup")},
			"alicloud_arms_dispatch_rule":         {Tok: resource(armsMod, "DispatchRule")},
			"alicloud_arms_prometheus_alert_rule": {Tok: resource(armsMod, "PrometheusAlertRule")},

			// Bp
			"alicloud_bp_studio_application": {Tok: resource(bpMod, "StudioApplication")},

			// BastionHost
			"alicloud_bastionhost_user_group":                               {Tok: resource(bastionHostMod, "UserGroup")},
			"alicloud_bastionhost_instance":                                 {Tok: resource(bastionHostMod, "Instance")},
			"alicloud_bastionhost_user":                                     {Tok: resource(bastionHostMod, "User")},
			"alicloud_bastionhost_user_attachment":                          {Tok: resource(bastionHostMod, "UserAttachment")},
			"alicloud_bastionhost_host_group":                               {Tok: resource(bastionHostMod, "HostGroup")},
			"alicloud_bastionhost_host_group_account_user_group_attachment": {Tok: resource(bastionHostMod, "HostGroupAccountUserGroupAttachment")},
			"alicloud_bastionhost_host_group_account_user_attachment":       {Tok: resource(bastionHostMod, "HostGroupAccountUserAttachment")},
			"alicloud_bastionhost_host_account_user_attachment":             {Tok: resource(bastionHostMod, "HostAccountUserAttachment")},
			"alicloud_bastionhost_host_account_user_group_attachment":       {Tok: resource(bastionHostMod, "HostAccountUserGroupAttachment")},
			"alicloud_bastionhost_host_attachment":                          {Tok: resource(bastionHostMod, "HostAttachment")},
			"alicloud_bastionhost_host_account":                             {Tok: resource(bastionHostMod, "HostAccount")},
			"alicloud_bastionhost_host":                                     {Tok: resource(bastionHostMod, "Host")},
			"alicloud_bastionhost_host_account_share_key_attachment":        {Tok: resource(bastionHostMod, "HostAccountShareKeyAttachment")},
			"alicloud_bastionhost_host_share_key":                           {Tok: resource(bastionHostMod, "HostShareKey")},

			// Brain
			"alicloud_brain_industrial_pid_project":      {Tok: resource(brainMod, "IndustrialPidProject")},
			"alicloud_brain_industrial_pid_organization": {Tok: resource(brainMod, "IndustrialPidOrganization")},
			"alicloud_brain_industrial_pid_loop":         {Tok: resource(brainMod, "IndustrialPidLoop")},

			// Cas
			"alicloud_cas_certificate": {
				Tok:                resource(casMod, "Certificate"),
				DeprecationMessage: "This resource has been deprecated in favour of ServiceCertificate",
			},
			"alicloud_ssl_certificates_service_certificate": {Tok: resource(casMod, "ServiceCertificate")},

			// Cassandra
			"alicloud_cassandra_cluster":     {Tok: resource(cassandraMod, "Cluster")},
			"alicloud_cassandra_data_center": {Tok: resource(cassandraMod, "DataCenter")},
			"alicloud_cassandra_backup_plan": {Tok: resource(cassandraMod, "BackupPlan")},

			// CDDC
			"alicloud_cddc_dedicated_host_group":   {Tok: resource(cddcMod, "DedicatedHostGroup")},
			"alicloud_cddc_dedicated_host":         {Tok: resource(cddcMod, "DedicatedHost")},
			"alicloud_cddc_dedicated_host_account": {Tok: resource(cddcMod, "DedicatedHostAccount")},

			// CDN
			"alicloud_cdn_domain": {
				Tok:  resource(cdnMod, "Domain"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_cdn_domain_config":          {Tok: resource(cdnMod, "DomainConfig")},
			"alicloud_cdn_domain_new":             {Tok: resource(cdnMod, "DomainNew")},
			"alicloud_cdn_real_time_log_delivery": {Tok: resource(cdnMod, "RealTimeLogDelivery")},
			"alicloud_cdn_fc_trigger":             {Tok: resource(cdnMod, "FcTrigger")},

			// CEN
			"alicloud_cen_bandwidth_limit": {
				Tok: resource(cenMod, "BandwidthLimit"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"bandwidth_limit": {
						CSharpName: "Limit",
					},
				},
			},
			"alicloud_cen_bandwidth_package":            {Tok: resource(cenMod, "BandwidthPackage")},
			"alicloud_cen_bandwidth_package_attachment": {Tok: resource(cenMod, "BandwidthPackageAttachment")},
			"alicloud_cen_child_instance_route_entry_to_attachment": {
				Tok: resource(cenMod, "ChildInstanceRouteEntryToAttachment"),
			},
			"alicloud_cen_instance":                                    {Tok: resource(cenMod, "Instance")},
			"alicloud_cen_instance_attachment":                         {Tok: resource(cenMod, "InstanceAttachment")},
			"alicloud_cen_inter_region_traffic_qos_policy":             {Tok: resource(cenMod, "InterRegionTrafficQosPolicy")},
			"alicloud_cen_inter_region_traffic_qos_queue":              {Tok: resource(cenMod, "InterRegionTrafficQosQueue")},
			"alicloud_cen_route_entry":                                 {Tok: resource(cenMod, "RouteEntry")},
			"alicloud_cen_instance_grant":                              {Tok: resource(cenMod, "InstanceGrant")},
			"alicloud_cen_flowlog":                                     {Tok: resource(cenMod, "FlowLog")},
			"alicloud_cen_route_map":                                   {Tok: resource(cenMod, "RouteMap")},
			"alicloud_cen_private_zone":                                {Tok: resource(cenMod, "PrivateZone")},
			"alicloud_cen_vbr_health_check":                            {Tok: resource(cenMod, "VbrHealthCheck")},
			"alicloud_cen_route_service":                               {Tok: resource(cenMod, "RouteService")},
			"alicloud_cen_transit_router":                              {Tok: resource(cenMod, "TransitRouter")},
			"alicloud_cen_transit_router_cidr":                         {Tok: resource(cenMod, "TransitRouterCidr")},
			"alicloud_cen_transit_router_grant_attachment":             {Tok: resource(cenMod, "TransitRouterGrantAttachment")},
			"alicloud_cen_transit_router_multicast_domain":             {Tok: resource(cenMod, "TransitRouterMulticastDomain")},
			"alicloud_cen_transit_router_multicast_domain_association": {Tok: resource(cenMod, "TransitRouterMulticastDomainAssociation")},
			"alicloud_cen_transit_router_multicast_domain_member":      {Tok: resource(cenMod, "TransitRouterMulticastDomainMember")},
			"alicloud_cen_transit_router_multicast_domain_peer_member": {Tok: resource(cenMod, "TransitRouterMulticastDomainPeerMember")},
			"alicloud_cen_transit_router_multicast_domain_source":      {Tok: resource(cenMod, "TransitRouterMulticastDomainSource")},
			"alicloud_cen_transit_router_prefix_list_association":      {Tok: resource(cenMod, "TransitRouterPrefixListAssociation")},
			"alicloud_cen_transit_router_route_table":                  {Tok: resource(cenMod, "TransitRouterRouteTable")},
			"alicloud_cen_transit_router_route_table_association": {
				Tok: resource(cenMod, "TransitRouterRouteTableAssociation"),
			},
			"alicloud_cen_transit_router_route_table_propagation": {
				Tok: resource(cenMod, "TransitRouterRouteTablePropagation"),
			},
			"alicloud_cen_transit_router_route_entry":     {Tok: resource(cenMod, "TransitRouterRouteEntry")},
			"alicloud_cen_transit_router_vbr_attachment":  {Tok: resource(cenMod, "TransitRouterVbrAttachment")},
			"alicloud_cen_transit_router_vpc_attachment":  {Tok: resource(cenMod, "TransitRouterVpcAttachment")},
			"alicloud_cen_transit_router_vpn_attachment":  {Tok: resource(cenMod, "TransitRouterVpnAttachment")},
			"alicloud_cen_transit_router_peer_attachment": {Tok: resource(cenMod, "TransitRouterPeerAttachment")},
			"alicloud_cen_traffic_marking_policy":         {Tok: resource(cenMod, "TrafficMarkingPolicy")},

			// Clickhouse
			"alicloud_click_house_db_cluster":    {Tok: resource(clickHouseMod, "DbCluster")},
			"alicloud_click_house_account":       {Tok: resource(clickHouseMod, "Account")},
			"alicloud_click_house_backup_policy": {Tok: resource(clickHouseMod, "BackupPolicy")},

			// Cloudauth
			"alicloud_cloudauth_face_config": {Tok: resource(cloudAuthMod, "FaceConfig")},

			// CloudConnect
			"alicloud_cloud_connect_network":            {Tok: resource(cloudConnectMod, "Network")},
			"alicloud_cloud_connect_network_attachment": {Tok: resource(cloudConnectMod, "NetworkAttachment")},
			"alicloud_cloud_connect_network_grant":      {Tok: resource(cloudConnectMod, "NetworkGrant")},

			// CloudFirewall
			"alicloud_cloud_firewall_control_policy":              {Tok: resource(cloudFirewallMod, "ControlPolicy")},
			"alicloud_cloud_firewall_control_policy_order":        {Tok: resource(cloudFirewallMod, "ControlPolicyOrder")},
			"alicloud_cloud_firewall_instance":                    {Tok: resource(cloudFirewallMod, "Instance")},
			"alicloud_cloud_firewall_instance_member":             {Tok: resource(cloudFirewallMod, "InstanceMember")},
			"alicloud_cloud_firewall_address_book":                {Tok: resource(cloudFirewallMod, "AddressBook")},
			"alicloud_cloud_firewall_vpc_firewall":                {Tok: resource(cloudFirewallMod, "FirewallVpcFirewall")},
			"alicloud_cloud_firewall_vpc_firewall_cen":            {Tok: resource(cloudFirewallMod, "FirewallVpcFirewallCen")},
			"alicloud_cloud_firewall_vpc_firewall_control_policy": {Tok: resource(cloudFirewallMod, "FirewallVpcFirewallControlPolicy")},

			// CloudStorageGateway
			"alicloud_cloud_storage_gateway_storage_bundle": {Tok: resource(cloudStorageGatewayMod, "StorageBundle")},
			"alicloud_cloud_storage_gateway_gateway":        {Tok: resource(cloudStorageGatewayMod, "Gateway")},
			"alicloud_cloud_storage_gateway_express_sync":   {Tok: resource(cloudStorageGatewayMod, "ExpressSync")},
			"alicloud_cloud_storage_gateway_express_sync_share_attachment": {
				Tok: resource(cloudStorageGatewayMod, "ExpressSyncShareAttachment"),
			},
			"alicloud_cloud_storage_gateway_gateway_block_volume": {
				Tok: resource(cloudStorageGatewayMod, "GatewayBlockVolume"),
			},
			"alicloud_cloud_storage_gateway_gateway_cache_disk": {
				Tok: resource(cloudStorageGatewayMod, "GatewayCacheDisk"),
			},
			"alicloud_cloud_storage_gateway_gateway_file_share": {
				Tok: resource(cloudStorageGatewayMod, "GatewayFileShare"),
			},
			"alicloud_cloud_storage_gateway_gateway_logging": {
				Tok: resource(cloudStorageGatewayMod, "GatewayLogging"),
			},
			"alicloud_cloud_storage_gateway_gateway_smb_user": {
				Tok: resource(cloudStorageGatewayMod, "GatewaySmbUser"),
			},

			// cloudSso
			"alicloud_cloud_sso_directory":                         {Tok: resource(cloudSsoMod, "Directory")},
			"alicloud_cloud_sso_scim_server_credential":            {Tok: resource(cloudSsoMod, "ScimServerCredential")},
			"alicloud_cloud_sso_group":                             {Tok: resource(cloudSsoMod, "Group")},
			"alicloud_cloud_sso_access_configuration":              {Tok: resource(cloudSsoMod, "AccessConfiguration")},
			"alicloud_cloud_sso_user":                              {Tok: resource(cloudSsoMod, "User")},
			"alicloud_cloud_sso_user_attachment":                   {Tok: resource(cloudSsoMod, "UserAttachment")},
			"alicloud_cloud_sso_access_assignment":                 {Tok: resource(cloudSsoMod, "AccessManagement")},
			"alicloud_cloud_sso_access_configuration_provisioning": {Tok: resource(cloudSsoMod, "AccessConfigurationProvisioning")},

			// CMS
			"alicloud_cms_alarm":               {Tok: resource(cmsMod, "Alarm")},
			"alicloud_cms_alarm_contact":       {Tok: resource(cmsMod, "AlarmContact")},
			"alicloud_cms_alarm_contact_group": {Tok: resource(cmsMod, "AlarmContactGroup")},
			"alicloud_cms_site_monitor": {
				Tok: resource(cmsMod, "SiteMonitor"),
				Docs: &tfbridge.DocInfo{
					Source: "cms_sitemonitor.markdown",
				},
			},
			"alicloud_cms_group_metric_rule":       {Tok: resource(cmsMod, "GroupMetricRule")},
			"alicloud_cms_monitor_group":           {Tok: resource(cmsMod, "MonitorGroup")},
			"alicloud_cms_monitor_group_instances": {Tok: resource(cmsMod, "MonitorGroupInstances")},
			"alicloud_cms_metric_rule_black_list":  {Tok: resource(cmsMod, "MetricRuleBlackList")},
			"alicloud_cms_metric_rule_template":    {Tok: resource(cmsMod, "MetricRuleTemplate")},
			"alicloud_cms_dynamic_tag_group":       {Tok: resource(cmsMod, "DynamicTagGroup")},
			"alicloud_cms_namespace": {
				Tok: resource(cmsMod, "Namespace"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"namespace": {
						CSharpName: "NamespaceName",
					},
				},
			},
			"alicloud_cms_sls_group":               {Tok: resource(cmsMod, "SlsGroup")},
			"alicloud_cms_hybrid_monitor_fc_task":  {Tok: resource(cmsMod, "HybridMonitorFcTask")},
			"alicloud_cms_hybrid_monitor_sls_task": {Tok: resource(cmsMod, "HybridMonitorSlsTask")},
			"alicloud_cms_event_rule":              {Tok: resource(cmsMod, "EventRule")},

			// Config
			"alicloud_config_configuration_recorder":    {Tok: resource(cfgMod, "ConfigurationRecorder")},
			"alicloud_config_delivery_channel":          {Tok: resource(cfgMod, "DeliveryChannel")},
			"alicloud_config_rule":                      {Tok: resource(cfgMod, "Rule")},
			"alicloud_config_aggregate_compliance_pack": {Tok: resource(cfgMod, "AggregateCompliancePack")},
			"alicloud_config_aggregate_config_rule":     {Tok: resource(cfgMod, "AggregateConfigRule")},
			"alicloud_config_aggregator":                {Tok: resource(cfgMod, "Aggregator")},
			"alicloud_config_compliance_pack":           {Tok: resource(cfgMod, "CompliancePack")},
			"alicloud_config_delivery":                  {Tok: resource(cfgMod, "Delivery")},
			"alicloud_config_aggregate_delivery":        {Tok: resource(cfgMod, "AggregateDelivery")},
			"alicloud_config_remediation":               {Tok: resource(cfgMod, "Remediation")},

			// CR
			"alicloud_cr_repo":                {Tok: resource(crMod, "Repo")},
			"alicloud_cr_namespace":           {Tok: resource(crMod, "Namespace")},
			"alicloud_cr_ee_instance":         {Tok: resource(crMod, "RegistryEnterpriseInstance")},
			"alicloud_cr_endpoint_acl_policy": {Tok: resource(crMod, "EndpointAclPolicy")},
			"alicloud_cr_chart_namespace":     {Tok: resource(crMod, "ChartNamespace")},
			"alicloud_cr_chart_repository":    {Tok: resource(crMod, "ChartRepository")},
			"alicloud_cr_chain":               {Tok: resource(crMod, "Chain")},

			// CS
			"alicloud_container_cluster": {
				Tok:  resource(csMod, "Cluster"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_cs_application": {
				Tok:  resource(csMod, "Application"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_cs_kubernetes": {Tok: resource(csMod, "Kubernetes")},
			"alicloud_cs_swarm": {
				Tok:  resource(csMod, "Swarm"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_cs_kubernetes_autoscaler":  {Tok: resource(csMod, "KubernetesAutoscaler")},
			"alicloud_cs_managed_kubernetes":     {Tok: resource(csMod, "ManagedKubernetes")},
			"alicloud_cs_serverless_kubernetes":  {Tok: resource(csMod, "ServerlessKubernetes")},
			"alicloud_cr_ee_repo":                {Tok: resource(csMod, "RegistryEnterpriseRepo")},
			"alicloud_cr_ee_namespace":           {Tok: resource(csMod, "RegistryEnterpriseNamespace")},
			"alicloud_cr_ee_sync_rule":           {Tok: resource(csMod, "RegistryEnterpriseSyncRule")},
			"alicloud_cs_kubernetes_node_pool":   {Tok: resource(csMod, "NodePool")},
			"alicloud_cs_edge_kubernetes":        {Tok: resource(csMod, "EdgeKubernetes")},
			"alicloud_cs_kubernetes_permissions": {Tok: resource(csMod, "KubernetesPermission")},
			"alicloud_cs_autoscaling_config":     {Tok: resource(csMod, "AutoscalingConfig")},
			"alicloud_cs_kubernetes_addon":       {Tok: resource(csMod, "KubernetesAddon")},

			// Das
			"alicloud_das_switch_das_pro": {Tok: resource(dasMod, "SwitchDasPro")},

			// DataHub
			"alicloud_datahub_project":      {Tok: resource(datahubMod, "Project")},
			"alicloud_datahub_subscription": {Tok: resource(datahubMod, "Subscription")},
			"alicloud_datahub_topic":        {Tok: resource(datahubMod, "Topic")},

			// Dataworks
			"alicloud_data_works_folder": {Tok: resource(dataWorksMod, "Folder")},

			// Database Filesystem
			"alicloud_dbfs_instance":            {Tok: resource(databaseFilesystemMod, "Instance")},
			"alicloud_dbfs_instance_attachment": {Tok: resource(databaseFilesystemMod, "InstanceAttachment")},
			"alicloud_dbfs_service_linked_role": {Tok: resource(databaseFilesystemMod, "ServiceLinkedRole")},
			"alicloud_dbfs_snapshot":            {Tok: resource(databaseFilesystemMod, "Snapshot")},

			// Database Gateway
			"alicloud_database_gateway_gateway": {Tok: resource(databaseGatewayMod, "Gateway")},

			// DB
			"alicloud_db_account":                         {Tok: resource(rdsMod, "Account")},
			"alicloud_db_account_privilege":               {Tok: resource(rdsMod, "AccountPrivilege")},
			"alicloud_db_backup_policy":                   {Tok: resource(rdsMod, "BackupPolicy")},
			"alicloud_db_connection":                      {Tok: resource(rdsMod, "Connection")},
			"alicloud_db_database":                        {Tok: resource(rdsMod, "Database")},
			"alicloud_db_instance":                        {Tok: resource(rdsMod, "Instance")},
			"alicloud_db_read_write_splitting_connection": {Tok: resource(rdsMod, "ReadWriteSplittingConnection")},
			"alicloud_db_readonly_instance":               {Tok: resource(rdsMod, "ReadOnlyInstance")},
			"alicloud_rds_account":                        {Tok: resource(rdsMod, "RdsAccount")},
			"alicloud_rds_backup":                         {Tok: resource(rdsMod, "RdsBackup")},
			"alicloud_rds_clone_db_instance":              {Tok: resource(rdsMod, "RdsCloneDbInstance")},
			"alicloud_rds_db_proxy":                       {Tok: resource(rdsMod, "RdsDbProxy")},
			"alicloud_rds_instance_cross_backup_policy":   {Tok: resource(rdsMod, "RdsInstanceCrossBackupPolicy")},
			"alicloud_rds_parameter_group":                {Tok: resource(rdsMod, "RdsParameterGroup")},
			"alicloud_rds_service_linked_role":            {Tok: resource(rdsMod, "RdsServiceLinkedRole")},
			"alicloud_rds_upgrade_db_instance":            {Tok: resource(rdsMod, "RdsUpgradeDbInstance")},

			// DBS
			"alicloud_dbs_backup_plan": {Tok: resource(dbsMod, "BackupPlan")},

			// DCDN
			"alicloud_dcdn_domain_config":                {Tok: resource(dcdnMod, "DomainConfig")},
			"alicloud_dcdn_ipa_domain":                   {Tok: resource(dcdnMod, "IpaDomain")},
			"alicloud_dcdn_waf_domain":                   {Tok: resource(dcdnMod, "WafDomain")},
			"alicloud_dcdn_waf_policy":                   {Tok: resource(dcdnMod, "WafPolicy")},
			"alicloud_dcdn_waf_policy_domain_attachment": {Tok: resource(dcdnMod, "WafPolicyDomainAttachment")},
			"alicloud_dcdn_domain":                       {Tok: resource(dcdnMod, "Domain")},

			// DDOS
			"alicloud_ddos_basic_defense_threshold": {Tok: resource(ddosMod, "BasicDefenseThreshold")},
			"alicloud_ddos_basic_threshold":         {Tok: resource(ddosMod, "BasicThreshold")},
			"alicloud_ddosbgp_ip":                   {Tok: resource(ddosMod, "BgpIp")},
			"alicloud_ddoscoo_domain_resource":      {Tok: resource(ddosMod, "DomainResource")},
			"alicloud_ddoscoo_port":                 {Tok: resource(ddosMod, "Port")},
			"alicloud_ddoscoo_scheduler_rule":       {Tok: resource(ddosMod, "SchedulerRule")},

			// Dfs
			"alicloud_dfs_access_group": {Tok: resource(dfsMod, "AccessGroup")},
			"alicloud_dfs_file_system":  {Tok: resource(dfsMod, "FileSystem")},
			"alicloud_dfs_access_rule":  {Tok: resource(dfsMod, "AccessRule")},
			"alicloud_dfs_mount_point":  {Tok: resource(dfsMod, "MountPoint")},

			// Direct Mail
			"alicloud_direct_mail_receivers":    {Tok: resource(directMailMod, "Receivers")},
			"alicloud_direct_mail_mail_address": {Tok: resource(directMailMod, "MailAddress")},
			"alicloud_direct_mail_domain":       {Tok: resource(directMailMod, "Domain")},
			"alicloud_direct_mail_tag":          {Tok: resource(directMailMod, "Tag")},

			// DMS
			"alicloud_dms_enterprise_instance":       {Tok: resource(dmsMod, "EnterpriseInstance")},
			"alicloud_dms_enterprise_logic_database": {Tok: resource(dmsMod, "EnterpriseLogicDatabase")},
			"alicloud_dms_enterprise_proxy":          {Tok: resource(dmsMod, "EnterpriseProxy")},
			"alicloud_dms_enterprise_proxy_access":   {Tok: resource(dmsMod, "EnterpriseProxyAccess")},
			"alicloud_dms_enterprise_user":           {Tok: resource(dmsMod, "EnterpriseUser")},

			// DNS
			"alicloud_dns": {
				Tok:                resource(dnsMod, "Domain"),
				DeprecationMessage: "This resource has been deprecated in favour of DnsDomain",
			},
			"alicloud_dns_group":                {Tok: resource(dnsMod, "Group")},
			"alicloud_dns_record":               {Tok: resource(dnsMod, "Record")},
			"alicloud_dns_domain_attachment":    {Tok: resource(dnsMod, "DomainAttachment")},
			"alicloud_dns_instance":             {Tok: resource(dnsMod, "Instance")},
			"alicloud_dns_domain":               {Tok: resource(dnsMod, "DnsDomain")},
			"alicloud_alidns_domain_group":      {Tok: resource(dnsMod, "DomainGroup")},
			"alicloud_alidns_record":            {Tok: resource(dnsMod, "AlidnsRecord")},
			"alicloud_alidns_domain":            {Tok: resource(dnsMod, "AlidnsDomain")},
			"alicloud_alidns_instance":          {Tok: resource(dnsMod, "AlidnsInstance")},
			"alicloud_alidns_domain_attachment": {Tok: resource(dnsMod, "AlidnsDomainAttachment")},
			"alicloud_alidns_custom_line":       {Tok: resource(dnsMod, "CustomLine")},
			"alicloud_alidns_gtm_instance":      {Tok: resource(dnsMod, "GtmInstance")},
			"alicloud_alidns_monitor_config":    {Tok: resource(dnsMod, "MonitorConfig")},
			"alicloud_alidns_address_pool":      {Tok: resource(dnsMod, "AddressPool")},
			"alicloud_alidns_access_strategy":   {Tok: resource(dnsMod, "AccessStrategy")},

			// Drds
			"alicloud_drds_instance": {Tok: resource(drdsMod, "Instance")},

			// Dts
			"alicloud_dts_job_monitor_rule":         {Tok: resource(dtsMod, "JobMonitorRule")},
			"alicloud_dts_migration_instance":       {Tok: resource(dtsMod, "MigrationInstance")},
			"alicloud_dts_migration_job":            {Tok: resource(dtsMod, "MigrationJob")},
			"alicloud_dts_subscription_job":         {Tok: resource(dtsMod, "SubscriptionJob")},
			"alicloud_dts_synchronization_instance": {Tok: resource(dtsMod, "SynchronizationInstance")},
			"alicloud_dts_synchronization_job":      {Tok: resource(dtsMod, "SynchronizationJob")},
			"alicloud_dts_consumer_channel":         {Tok: resource(dtsMod, "ConsumerChannel")},

			// Eais
			"alicloud_eais_instance": {Tok: resource(eaisMod, "Instance")},

			// Ebs
			"alicloud_ebs_dedicated_block_storage_cluster": {Tok: resource(ebsMod, "DedicatedBlockStorageCluster")},
			"alicloud_ebs_disk_replica_group":              {Tok: resource(ebsMod, "DiskReplicaGroup")},
			"alicloud_ebs_disk_replica_pair":               {Tok: resource(ebsMod, "DiskReplicaPair")},

			// Eci
			"alicloud_eci_openapi_image_cache": {
				Tok:  resource(eciMod, "OpenApiImageCache"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_eci_image_cache":     {Tok: resource(eciMod, "ImageCache")},
			"alicloud_eci_container_group": {Tok: resource(eciMod, "ContainerGroup")},
			"alicloud_eci_virtual_node":    {Tok: resource(eciMod, "VirtualNode")},

			// Ecp
			"alicloud_ecp_instance": {Tok: resource(ecpMod, "Instance")},
			"alicloud_ecp_key_pair": {Tok: resource(ecpMod, "KeyPair")},

			// ECS
			"alicloud_auto_provisioning_group":  {Tok: resource(ecsMod, "AutoProvisioningGroup")},
			"alicloud_ecs_capacity_reservation": {Tok: resource(ecsMod, "CapacityReservation")},
			"alicloud_disk":                     {Tok: resource(ecsMod, "Disk")},
			"alicloud_disk_attachment":          {Tok: resource(ecsMod, "DiskAttachment")},
			"alicloud_launch_template":          {Tok: resource(ecsMod, "LaunchTemplate")},
			"alicloud_eip": {
				Tok:                resource(ecsMod, "Eip"),
				DeprecationMessage: "This resource has been deprecated in favour of the EipAddress resource",
			},
			"alicloud_eip_address":              {Tok: resource(ecsMod, "EipAddress")},
			"alicloud_eip_association":          {Tok: resource(ecsMod, "EipAssociation")},
			"alicloud_eip_segment_address":      {Tok: resource(ecsMod, "EipSegmentAddress")},
			"alicloud_ecs_elasticity_assurance": {Tok: resource(ecsMod, "ElasticityAssurance")},
			"alicloud_instance":                 {Tok: resource(ecsMod, "Instance")},
			"alicloud_key_pair":                 {Tok: resource(ecsMod, "KeyPair")},
			"alicloud_key_pair_attachment":      {Tok: resource(ecsMod, "KeyPairAttachment")},
			"alicloud_image":                    {Tok: resource(ecsMod, "Image")},
			"alicloud_image_copy":               {Tok: resource(ecsMod, "ImageCopy")},
			"alicloud_image_export":             {Tok: resource(ecsMod, "ImageExport")},
			"alicloud_image_share_permission":   {Tok: resource(ecsMod, "ImageSharePermission")},
			"alicloud_security_group":           {Tok: resource(ecsMod, "SecurityGroup")},
			"alicloud_security_group_rule":      {Tok: resource(ecsMod, "SecurityGroupRule")},
			"alicloud_reserved_instance":        {Tok: resource(ecsMod, "ReservedInstance")},
			"alicloud_snapshot":                 {Tok: resource(ecsMod, "Snapshot")},
			"alicloud_snapshot_policy":          {Tok: resource(ecsMod, "SnapshotPolicy")},
			"alicloud_copy_image": {
				Tok:  resource(ecsMod, "CopyImage"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_image_import": {Tok: resource(ecsMod, "ImageImport")},
			"alicloud_ecs_dedicated_host": {
				Tok: resource(ecsMod, "DedicatedHost"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"network_attributes": {
						MaxItemsOne: tfbridge.False(),
						Name:        "networkAttributes",
					},
				},
			},
			"alicloud_ecs_hpc_cluster":                     {Tok: resource(ecsMod, "HpcCluster")},
			"alicloud_ecs_command":                         {Tok: resource(ecsMod, "Command")},
			"alicloud_ecs_auto_snapshot_policy":            {Tok: resource(ecsMod, "AutoSnapshotPolicy")},
			"alicloud_ecs_snapshot":                        {Tok: resource(ecsMod, "EcsSnapshot")},
			"alicloud_ecs_storage_capacity_unit":           {Tok: resource(ecsMod, "StorageCapacityUnit")},
			"alicloud_ecs_launch_template":                 {Tok: resource(ecsMod, "EcsLaunchTemplate")},
			"alicloud_ecs_key_pair":                        {Tok: resource(ecsMod, "EcsKeyPair")},
			"alicloud_ecs_key_pair_attachment":             {Tok: resource(ecsMod, "EcsKeyPairAttachment")},
			"alicloud_ecs_auto_snapshot_policy_attachment": {Tok: resource(ecsMod, "EcsAutoSnapshotPolicyAttachment")},
			"alicloud_ecs_disk":                            {Tok: resource(ecsMod, "EcsDisk")},
			"alicloud_ecs_disk_attachment":                 {Tok: resource(ecsMod, "EcsDiskAttachment")},
			"alicloud_ecs_network_interface":               {Tok: resource(ecsMod, "EcsNetworkInterface")},
			"alicloud_ecs_network_interface_attachment":    {Tok: resource(ecsMod, "EcsNetworkInterfaceAttachment")},
			"alicloud_ecs_deployment_set":                  {Tok: resource(ecsMod, "EcsDeploymentSet")},
			"alicloud_ecs_dedicated_host_cluster":          {Tok: resource(ecsMod, "EcsDedicatedHostCluster")},
			"alicloud_ecs_session_manager_status":          {Tok: resource(ecsMod, "EcsSessionManagerStatus")},
			"alicloud_ecs_prefix_list":                     {Tok: resource(ecsMod, "EcsPrefixList")},
			"alicloud_ecs_image_component":                 {Tok: resource(ecsMod, "EcsImageComponent")},
			"alicloud_ecs_snapshot_group":                  {Tok: resource(ecsMod, "EcsSnapshotGroup")},
			"alicloud_ecs_image_pipeline":                  {Tok: resource(ecsMod, "EcsImagePipeline")},
			"alicloud_ecs_invocation":                      {Tok: resource(ecsMod, "EcsInvocation")},
			"alicloud_ecs_network_interface_permission":    {Tok: resource(ecsMod, "EcsNetworkInterfacePermission")},
			"alicloud_ecs_instance_set":                    {Tok: resource(ecsMod, "EcsInstanceSet")},
			"alicloud_ecs_activation":                      {Tok: resource(ecsMod, "Activation")},

			// Edas
			"alicloud_edas_application":                 {Tok: resource(edasMod, "Application")},
			"alicloud_edas_deploy_group":                {Tok: resource(edasMod, "DeployGroup")},
			"alicloud_edas_application_scale":           {Tok: resource(edasMod, "ApplicationScale")},
			"alicloud_edas_slb_attachment":              {Tok: resource(edasMod, "SlbAttachment")},
			"alicloud_edas_cluster":                     {Tok: resource(edasMod, "Cluster")},
			"alicloud_edas_instance_cluster_attachment": {Tok: resource(edasMod, "InstanceClusterAttachment")},
			"alicloud_edas_application_deployment":      {Tok: resource(edasMod, "ApplicationDeployment")},
			"alicloud_edas_k8s_cluster":                 {Tok: resource(edasMod, "K8sCluster")},
			"alicloud_edas_k8s_application":             {Tok: resource(edasMod, "K8sApplication")},
			"alicloud_edas_namespace":                   {Tok: resource(edasMod, "Namespace")},
			"alicloud_edas_k8s_slb_attachment":          {Tok: resource(edasMod, "K8sSlbAttachment")},

			// Eds
			"alicloud_ecd_policy_group":             {Tok: resource(edsMod, "EcdPolicyGroup")},
			"alicloud_ecd_simple_office_site":       {Tok: resource(edsMod, "SimpleOfficeSite")},
			"alicloud_ecd_nas_file_system":          {Tok: resource(edsMod, "NasFileSystem")},
			"alicloud_ecd_desktop":                  {Tok: resource(edsMod, "Desktop")},
			"alicloud_ecd_network_package":          {Tok: resource(edsMod, "NetworkPackage")},
			"alicloud_ecd_user":                     {Tok: resource(edsMod, "User")},
			"alicloud_ecd_image":                    {Tok: resource(edsMod, "Image")},
			"alicloud_ecd_command":                  {Tok: resource(edsMod, "Command")},
			"alicloud_ecd_snapshot":                 {Tok: resource(edsMod, "Snapshot")},
			"alicloud_ecd_bundle":                   {Tok: resource(edsMod, "Bundle")},
			"alicloud_ecd_ad_connector_directory":   {Tok: resource(edsMod, "AdConnectorDirectory")},
			"alicloud_ecd_ram_directory":            {Tok: resource(edsMod, "RamDirectory")},
			"alicloud_ecd_ad_connector_office_site": {Tok: resource(edsMod, "AdConnectorOfficeSite")},
			"alicloud_ecd_custom_property":          {Tok: resource(edsMod, "CustomProperty")},

			// Ehpc
			"alicloud_ehpc_job_template": {Tok: resource(ehpcMod, "JobTemplate")},
			"alicloud_ehpc_cluster":      {Tok: resource(ehpcMod, "Cluster")},

			// EipAnycast
			"alicloud_eipanycast_anycast_eip_address":            {Tok: resource(eipAnyCastMod, "AnycastEipAddress")},
			"alicloud_eipanycast_anycast_eip_address_attachment": {Tok: resource(eipAnyCastMod, "AnycastEipAddressAttachment")},

			// Ens
			"alicloud_ens_key_pair": {Tok: resource(ensMod, "KeyPair")},

			// ESS
			"alicloud_ess_alarm":      {Tok: resource(essMod, "Alarm")},
			"alicloud_ess_attachment": {Tok: resource(essMod, "Attachment")},
			"alicloud_ess_lifecycle_hook": {
				Tok: resource(essMod, "LifecycleHook"),
				Docs: &tfbridge.DocInfo{
					Source: "ess_scaling_lifecycle_hook.html.markdown",
				},
			},
			"alicloud_ess_scaling_configuration":       {Tok: resource(essMod, "ScalingConfiguration")},
			"alicloud_ess_scaling_group":               {Tok: resource(essMod, "ScalingGroup")},
			"alicloud_ess_scaling_rule":                {Tok: resource(essMod, "ScalingRule")},
			"alicloud_ess_schedule":                    {Tok: resource(essMod, "Schedule")},
			"alicloud_ess_notification":                {Tok: resource(essMod, "Notification")},
			"alicloud_ess_scalinggroup_vserver_groups": {Tok: resource(essMod, "ScalingGroupVServerGroups")},
			"alicloud_ess_scheduled_task":              {Tok: resource(essMod, "ScheduledTask")},
			"alicloud_ess_alb_server_group_attachment": {Tok: resource(essMod, "AlbServerGroupAttachment")},
			"alicloud_ess_eci_scaling_configuration":   {Tok: resource(essMod, "EciScalingConfiguration")},
			"alicloud_ess_suspend_process":             {Tok: resource(essMod, "SuspendProcess")},

			// ElasticSearch
			"alicloud_elasticsearch_instance": {
				Tok: resource(elasticsearchMod, "Instance"),
				Docs: &tfbridge.DocInfo{
					Source: "elasticsearch.html.markdown",
				},
			},

			// EMR
			"alicloud_emr_cluster": {Tok: resource(emrMod, "Cluster")},

			// Eventbridge
			"alicloud_event_bridge_event_bus": {Tok: resource(eventBridgeMod, "EventBus")},
			"alicloud_event_bridge_rule":      {Tok: resource(eventBridgeMod, "Rule")},
			"alicloud_event_bridge_slr": {
				Tok:  resource(eventBridgeMod, "Slr"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_event_bridge_event_source":        {Tok: resource(eventBridgeMod, "EventSource")},
			"alicloud_event_bridge_service_linked_role": {Tok: resource(eventBridgeMod, "ServiceLinkedRole")},

			// ExpressConnect
			"alicloud_express_connect_grant_rule_to_cen":           {Tok: resource(expressConnectMod, "GrantRuleToCen")},
			"alicloud_express_connect_physical_connection":         {Tok: resource(expressConnectMod, "PhysicalConnection")},
			"alicloud_express_connect_vbr_pconn_association":       {Tok: resource(expressConnectMod, "VbrPconnAssociation")},
			"alicloud_express_connect_virtual_border_router":       {Tok: resource(expressConnectMod, "VirtualBorderRouter")},
			"alicloud_express_connect_virtual_physical_connection": {Tok: resource(expressConnectMod, "VirtualPhysicalConnection")},

			// FC
			"alicloud_fc_function":                     {Tok: resource(fcMod, "Function")},
			"alicloud_fc_service":                      {Tok: resource(fcMod, "Service")},
			"alicloud_fc_trigger":                      {Tok: resource(fcMod, "Trigger")},
			"alicloud_fc_custom_domain":                {Tok: resource(fcMod, "CustomDomain")},
			"alicloud_fc_function_async_invoke_config": {Tok: resource(fcMod, "FunctionAsyncInvokeConfig")},
			"alicloud_fc_alias":                        {Tok: resource(fcMod, "Alias")},
			"alicloud_fc_layer_version":                {Tok: resource(fcMod, "LayerVersion")},

			// FNF
			"alicloud_fnf_schedule":  {Tok: resource(fnfMod, "Schedule")},
			"alicloud_fnf_flow":      {Tok: resource(fnfMod, "Flow")},
			"alicloud_fnf_execution": {Tok: resource(fnfMod, "Execution")},

			// Ga
			"alicloud_ga_domain": {
				Tok: resource(gaMod, "Domain"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"domain": {
						CSharpName: "AcceleratedDomain",
					},
				},
			},

			// Gpdb
			"alicloud_gpdb_connection":       {Tok: resource(gpdbMod, "Connection")},
			"alicloud_gpdb_instance":         {Tok: resource(gpdbMod, "Instance")},
			"alicloud_gpdb_elastic_instance": {Tok: resource(gpdbMod, "ElasticInstance")},
			"alicloud_gpdb_account":          {Tok: resource(gpdbMod, "Account")},
			"alicloud_gpdb_db_instance_plan": {Tok: resource(gpdbMod, "DbInstancePlan")},

			// Graph Database
			"alicloud_graph_database_db_instance": {Tok: resource(graphDatabaseMod, "DbInstance")},

			// Hbase
			"alicloud_hbase_instance": {Tok: resource(hbaseMod, "Instance")},

			// Hbr
			"alicloud_hbr_vault":              {Tok: resource(hbrMod, "Vault")},
			"alicloud_hbr_oss_backup_plan":    {Tok: resource(hbrMod, "OssBackupPlan")},
			"alicloud_hbr_nas_backup_plan":    {Tok: resource(hbrMod, "NasBackupPlan")},
			"alicloud_hbr_ecs_backup_plan":    {Tok: resource(hbrMod, "EcsBackupPlan")},
			"alicloud_hbr_ecs_backup_client":  {Tok: resource(hbrMod, "EcsBackupClient")},
			"alicloud_hbr_restore_job":        {Tok: resource(hbrMod, "RestoreJob")},
			"alicloud_hbr_server_backup_plan": {Tok: resource(hbrMod, "ServerBackupPlan")},
			"alicloud_hbr_replication_vault":  {Tok: resource(hbrMod, "ReplicationVault")},
			"alicloud_hbr_ots_backup_plan":    {Tok: resource(hbrMod, "OtsBackupPlan")},
			"alicloud_hbr_hana_instance":      {Tok: resource(hbrMod, "HanaInstance")},
			"alicloud_hbr_hana_backup_plan":   {Tok: resource(hbrMod, "HanaBackupPlan")},

			// Iot
			"alicloud_iot_device_group": {Tok: resource(iotMod, "DeviceGroup")},

			// Imm
			"alicloud_imm_project": {
				Tok: resource(immMod, "Project"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"project": {
						CSharpName: "ProjectName",
					},
				},
			},

			// Imp
			"alicloud_imp_app_template": {Tok: resource(impMod, "AppTemplate")},

			// KMS
			"alicloud_kms_key": {
				Tok: resource(kmsMod, "Key"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"key_state": {
						CSharpName: "KeyStatus",
					},
				},
			},
			"alicloud_kms_key_version": {Tok: resource(kmsMod, "KeyVersion")},
			"alicloud_kms_ciphertext":  {Tok: resource(kmsMod, "Ciphertext")},
			"alicloud_kms_secret":      {Tok: resource(kmsMod, "Secret")},
			"alicloud_kms_alias":       {Tok: resource(kmsMod, "Alias")},

			// KVStore
			"alicloud_kvstore_backup_policy":    {Tok: resource(kvstoreMod, "BackupPolicy")},
			"alicloud_kvstore_instance":         {Tok: resource(kvstoreMod, "Instance")},
			"alicloud_kvstore_account":          {Tok: resource(kvstoreMod, "Account")},
			"alicloud_kvstore_connection":       {Tok: resource(kvstoreMod, "Connection")},
			"alicloud_kvstore_audit_log_config": {Tok: resource(kvstoreMod, "AuditLogConfig")},

			// Lindorm
			"alicloud_lindorm_instance": {Tok: resource(lindormMod, "Instance")},

			// Log
			"alicloud_log_machine_group":   {Tok: resource(logMod, "MachineGroup")},
			"alicloud_log_project":         {Tok: resource(logMod, "Project")},
			"alicloud_log_store":           {Tok: resource(logMod, "Store")},
			"alicloud_log_store_index":     {Tok: resource(logMod, "StoreIndex")},
			"alicloud_logtail_attachment":  {Tok: resource(logMod, "LogTailAttachment")},
			"alicloud_logtail_config":      {Tok: resource(logMod, "LogTailConfig")},
			"alicloud_log_alert":           {Tok: resource(logMod, "Alert")},
			"alicloud_log_audit":           {Tok: resource(logMod, "Audit")},
			"alicloud_log_dashboard":       {Tok: resource(logMod, "Dashboard")},
			"alicloud_log_etl":             {Tok: resource(logMod, "Etl")},
			"alicloud_log_oss_shipper":     {Tok: resource(logMod, "OssShipper")},
			"alicloud_log_ingestion":       {Tok: resource(logMod, "Ingestion")},
			"alicloud_log_resource":        {Tok: resource(logMod, "Resource")},
			"alicloud_log_resource_record": {Tok: resource(logMod, "ResourceRecord")},
			"alicloud_log_oss_export":      {Tok: resource(logMod, "OssExport")},

			// Marketplace
			"alicloud_market_order": {Tok: resource(marketPlaceMod, "Order")},

			// MaxCompute
			"alicloud_maxcompute_project": {Tok: resource(maxComputeMod, "Project")},

			// Message
			"alicloud_message_service_queue":        {Tok: resource(messageMod, "ServiceQueue")},
			"alicloud_message_service_subscription": {Tok: resource(messageMod, "ServiceSubscription")},
			"alicloud_message_service_topic":        {Tok: resource(messageMod, "ServiceTopic")},

			// MHub
			"alicloud_mhub_product": {Tok: resource(mhubMod, "Product")},
			"alicloud_mhub_app":     {Tok: resource(mhubMod, "App")},

			// MongoDb
			"alicloud_mongodb_instance":                         {Tok: resource(mongoDbMod, "Instance")},
			"alicloud_mongodb_sharding_instance":                {Tok: resource(mongoDbMod, "ShardingInstance")},
			"alicloud_mongodb_audit_policy":                     {Tok: resource(mongoDbMod, "AuditPolicy")},
			"alicloud_mongodb_account":                          {Tok: resource(mongoDbMod, "Account")},
			"alicloud_mongodb_serverless_instance":              {Tok: resource(mongoDbMod, "ServerlessInstance")},
			"alicloud_mongodb_sharding_network_public_address":  {Tok: resource(mongoDbMod, "ShardingNetworkPublicAddress")},
			"alicloud_mongodb_sharding_network_private_address": {Tok: resource(mongoDbMod, "ShardingNetworkPrivateAddress")},

			// Mns
			"alicloud_mns_queue":              {Tok: resource(mnsMod, "Queue")},
			"alicloud_mns_topic":              {Tok: resource(mnsMod, "Topic")},
			"alicloud_mns_topic_subscription": {Tok: resource(mnsMod, "TopicSubscription")},

			// Mse
			"alicloud_mse_cluster":          {Tok: resource(mseMod, "Cluster")},
			"alicloud_mse_gateway":          {Tok: resource(mseMod, "Gateway")},
			"alicloud_mse_znode":            {Tok: resource(mseMod, "Znode")},
			"alicloud_mse_engine_namespace": {Tok: resource(mseMod, "EngineNamespace")},

			// Nas
			"alicloud_nas_access_group":         {Tok: resource(nasMod, "AccessGroup")},
			"alicloud_nas_access_rule":          {Tok: resource(nasMod, "AccessRule")},
			"alicloud_nas_auto_snapshot_policy": {Tok: resource(nasMod, "AutoSnapshotPolicy")},
			"alicloud_nas_data_flow":            {Tok: resource(nasMod, "DataFlow")},
			"alicloud_nas_file_system":          {Tok: resource(nasMod, "FileSystem")},
			"alicloud_nas_fileset":              {Tok: resource(nasMod, "Fileset")},
			"alicloud_nas_lifecycle_policy":     {Tok: resource(nasMod, "LifecyclePolicy")},
			"alicloud_nas_mount_target":         {Tok: resource(nasMod, "MountTarget")},
			"alicloud_nas_recycle_bin":          {Tok: resource(nasMod, "RecycleBin")},
			"alicloud_nas_smb_acl_attachment":   {Tok: resource(nasMod, "SmbAclAttachment")},
			"alicloud_nas_snapshot":             {Tok: resource(nasMod, "Snapshot")},

			// Nlb
			"alicloud_nlb_listener":                       {Tok: resource(nlbMod, "Listener")},
			"alicloud_nlb_load_balancer":                  {Tok: resource(nlbMod, "LoadBalancer")},
			"alicloud_nlb_security_policy":                {Tok: resource(nlbMod, "SecurityPolicy")},
			"alicloud_nlb_server_group":                   {Tok: resource(nlbMod, "ServerGroup")},
			"alicloud_nlb_server_group_server_attachment": {Tok: resource(nlbMod, "ServerGroupServerAttachment")},

			// Oos
			"alicloud_oos_template":            {Tok: resource(oosMod, "Template")},
			"alicloud_oos_execution":           {Tok: resource(oosMod, "Execution")},
			"alicloud_oos_application":         {Tok: resource(oosMod, "Application")},
			"alicloud_oos_application_group":   {Tok: resource(oosMod, "ApplicationGroup")},
			"alicloud_oos_patch_baseline":      {Tok: resource(oosMod, "PatchBaseline")},
			"alicloud_oos_service_setting":     {Tok: resource(oosMod, "ServiceSetting")},
			"alicloud_oos_parameter":           {Tok: resource(oosMod, "Parameter")},
			"alicloud_oos_secret_parameter":    {Tok: resource(oosMod, "SecretParameter")},
			"alicloud_oos_state_configuration": {Tok: resource(oosMod, "StateConfiguration")},

			// OpenSearch
			"alicloud_open_search_app_group": {Tok: resource(openSearchMod, "AppGroup")},

			// Oss
			"alicloud_oss_bucket": {
				Tok: resource(ossMod, "Bucket"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"bucket": {
						CSharpName: "BucketName",
					},
				},
			},
			"alicloud_oss_bucket_object":      {Tok: resource(ossMod, "BucketObject")},
			"alicloud_oss_bucket_replication": {Tok: resource(ossMod, "BucketReplication")},

			// OTS Mod
			"alicloud_ots_instance":            {Tok: resource(otsMod, "Instance")},
			"alicloud_ots_instance_attachment": {Tok: resource(otsMod, "InstanceAttachment")},
			"alicloud_ots_search_index":        {Tok: resource(otsMod, "SearchIndex")},
			"alicloud_ots_secondary_index":     {Tok: resource(otsMod, "SecondaryIndex")},
			"alicloud_ots_table":               {Tok: resource(otsMod, "Table")},
			"alicloud_ots_tunnel":              {Tok: resource(otsMod, "Tunnel")},

			// PrivateLink
			"alicloud_privatelink_vpc_endpoint":         {Tok: resource(privateLinkMod, "VpcEndpoint")},
			"alicloud_privatelink_vpc_endpoint_service": {Tok: resource(privateLinkMod, "VpcEndpointService")},
			"alicloud_privatelink_vpc_endpoint_zone":    {Tok: resource(privateLinkMod, "VpcEndpointZone")},
			"alicloud_privatelink_vpc_endpoint_service_resource": {
				Tok: resource(privateLinkMod, "VpcEndpointServiceResource"),
			},
			"alicloud_privatelink_vpc_endpoint_service_user": {
				Tok: resource(privateLinkMod, "VpcEndpointServiceUser"),
			},
			"alicloud_privatelink_vpc_endpoint_connection": {
				Tok: resource(privateLinkMod, "VpcEndpointServiceConnection"),
			},

			// PolarDB
			"alicloud_polardb_account": {Tok: resource(polarDbMod, "Account")},
			"alicloud_polardb_account_privilege": {
				Tok: resource(polarDbMod, "AccountPrivilege"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_privilege": {
						CSharpName: "Privilege",
					},
				},
			},
			"alicloud_polardb_backup_policy":           {Tok: resource(polarDbMod, "BackupPolicy")},
			"alicloud_polardb_cluster":                 {Tok: resource(polarDbMod, "Cluster")},
			"alicloud_polardb_database":                {Tok: resource(polarDbMod, "Database")},
			"alicloud_polardb_endpoint":                {Tok: resource(polarDbMod, "Endpoint")},
			"alicloud_polardb_endpoint_address":        {Tok: resource(polarDbMod, "EndpointAddress")},
			"alicloud_polardb_global_database_network": {Tok: resource(polarDbMod, "GlobalDatabaseNetwork")},
			"alicloud_polardb_parameter_group":         {Tok: resource(polarDbMod, "ParameterGroup")},

			// Pvtz
			"alicloud_pvtz_zone":                   {Tok: resource(pvtzMod, "Zone")},
			"alicloud_pvtz_zone_attachment":        {Tok: resource(pvtzMod, "ZoneAttachment")},
			"alicloud_pvtz_zone_record":            {Tok: resource(pvtzMod, "ZoneRecord")},
			"alicloud_pvtz_user_vpc_authorization": {Tok: resource(pvtzMod, "UserVpcAuthorization")},
			"alicloud_pvtz_endpoint":               {Tok: resource(pvtzMod, "Endpoint")},
			"alicloud_pvtz_rule":                   {Tok: resource(pvtzMod, "Rule")},
			"alicloud_pvtz_rule_attachment":        {Tok: resource(pvtzMod, "RuleAttachment")},

			// QuickBI
			"alicloud_quick_bi_user": {Tok: resource(quickBiMod, "User")},

			// Quotas
			"alicloud_quotas_application_info": {
				Tok:  resource(quotasMod, "ApplicationInfo"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_quotas_quota_alarm":       {Tok: resource(quotasMod, "QuotaAlarm")},
			"alicloud_quotas_quota_application": {Tok: resource(quotasMod, "QuotaApplication")},

			// Ram
			"alicloud_ram_access_key": {Tok: resource(ramMod, "AccessKey")},
			"alicloud_ram_account_alias": {
				Tok: resource(ramMod, "AccountAlias"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_alias": {
						CSharpName: "Alias",
					},
				},
			},
			"alicloud_ram_alias": {
				Tok:  resource(ramMod, "Alias"),
				Docs: &tfbridge.DocInfo{Markdown: []byte{' '}},
			},
			"alicloud_ram_group":                   {Tok: resource(ramMod, "Group")},
			"alicloud_ram_group_membership":        {Tok: resource(ramMod, "GroupMembership")},
			"alicloud_ram_group_policy_attachment": {Tok: resource(ramMod, "GroupPolicyAttachment")},
			"alicloud_ram_login_profile":           {Tok: resource(ramMod, "LoginProfile")},
			"alicloud_ram_policy":                  {Tok: resource(ramMod, "Policy")},
			"alicloud_ram_role":                    {Tok: resource(ramMod, "Role")},
			"alicloud_ram_role_attachment":         {Tok: resource(ramMod, "RoleAttachment")},
			"alicloud_ram_role_policy_attachment":  {Tok: resource(ramMod, "RolePolicyAttachment")},
			"alicloud_ram_user":                    {Tok: resource(ramMod, "User")},
			"alicloud_ram_user_policy_attachment":  {Tok: resource(ramMod, "UserPolicyAttachment")},
			"alicloud_ram_account_password_policy": {Tok: resource(ramMod, "AccountPasswordPolicy")},
			"alicloud_ram_saml_provider":           {Tok: resource(ramMod, "SamlProvider")},
			"alicloud_ram_security_preference":     {Tok: resource(ramMod, "SecurityPreference")},

			// Rdc
			"alicloud_rdc_organization": {Tok: resource(rdcMod, "Organization")},

			// ResourceManager
			"alicloud_resource_manager_handshake":          {Tok: resource(resourceManagerMod, "Handshake")},
			"alicloud_resource_manager_folder":             {Tok: resource(resourceManagerMod, "Folder")},
			"alicloud_resource_manager_resource_group":     {Tok: resource(resourceManagerMod, "ResourceGroup")},
			"alicloud_resource_manager_role":               {Tok: resource(resourceManagerMod, "Role")},
			"alicloud_resource_manager_account":            {Tok: resource(resourceManagerMod, "Account")},
			"alicloud_resource_manager_policy":             {Tok: resource(resourceManagerMod, "Policy")},
			"alicloud_resource_manager_resource_directory": {Tok: resource(resourceManagerMod, "ResourceDirectory")},
			"alicloud_resource_manager_policy_version":     {Tok: resource(resourceManagerMod, "PolicyVersion")},
			"alicloud_resource_manager_policy_attachment":  {Tok: resource(resourceManagerMod, "PolicyAttachment")},
			"alicloud_resource_manager_shared_resource":    {Tok: resource(resourceManagerMod, "SharedResource")},
			"alicloud_resource_manager_shared_target":      {Tok: resource(resourceManagerMod, "SharedTarget")},
			"alicloud_resource_manager_resource_share":     {Tok: resource(resourceManagerMod, "ResourceShare")},
			"alicloud_resource_manager_control_policy":     {Tok: resource(resourceManagerMod, "ControlPolicy")},
			"alicloud_resource_manager_control_policy_attachment": {
				Tok: resource(resourceManagerMod, "ControlPolicyAttachment"),
			},
			"alicloud_resource_manager_service_linked_role":     {Tok: resource(resourceManagerMod, "ServiceLinkedRole")},
			"alicloud_resource_manager_delegated_administrator": {Tok: resource(resourceManagerMod, "DelegatedAdministrator")},

			// RocketMQ
			//
			// During the next major update, we should rename alicloud_ons_*
			// to alicloud:ons:* to avoid conflicts with
			// alicloud_rocketmq_*. Right now the two namespaces are merged,
			// which introduces issues.
			//
			// We cannot disentangle them without a breaking change.
			"alicloud_rocketmq_instance": {Tok: resource(rocketMqMod, "RocketMQInstance")},
			"alicloud_rocketmq_topic":    {Tok: resource(rocketMqMod, "RocketMQTopic")},
			"alicloud_ons_group":         {Tok: resource(rocketMqMod, "Group")},
			"alicloud_ons_instance":      {Tok: resource(rocketMqMod, "Instance")},
			"alicloud_ons_topic": {
				Tok: resource(rocketMqMod, "Topic"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"topic": {
						CSharpName: "TopicDeprecated",
					},
				},
			},

			// ros
			"alicloud_ros_change_set":       {Tok: resource(rosMod, "ChangeSet")},
			"alicloud_ros_stack_group":      {Tok: resource(rosMod, "StackGroup")},
			"alicloud_ros_stack":            {Tok: resource(rosMod, "Stack")},
			"alicloud_ros_template":         {Tok: resource(rosMod, "Template")},
			"alicloud_ros_stack_instance":   {Tok: resource(rosMod, "StackInstance")},
			"alicloud_ros_template_scratch": {Tok: resource(rosMod, "TemplateScratch")},

			// Sae
			"alicloud_sae_namespace":                {Tok: resource(saeMod, "Namespace")},
			"alicloud_sae_config_map":               {Tok: resource(saeMod, "ConfigMap")},
			"alicloud_sae_application":              {Tok: resource(saeMod, "Application")},
			"alicloud_sae_ingress":                  {Tok: resource(saeMod, "Ingress")},
			"alicloud_sae_application_scaling_rule": {Tok: resource(saeMod, "ApplicationScalingRule")},
			"alicloud_sae_grey_tag_route":           {Tok: resource(saeMod, "GreyTagRoute")},
			"alicloud_sae_load_balancer_internet":   {Tok: resource(saeMod, "LoadBalancerInternet")},
			"alicloud_sae_load_balancer_intranet":   {Tok: resource(saeMod, "LoadBalancerIntranet")},

			// All above need remapped :/
			"alicloud_smartag_flow_log": {Tok: resource(sagMod, "SmartagFlowLog")},

			// ServiceMesh
			"alicloud_service_mesh_service_mesh":       {Tok: resource(serviceMeshMod, "ServiceMesh")},
			"alicloud_service_mesh_user_permission":    {Tok: resource(serviceMeshMod, "UserPermission")},
			"alicloud_service_mesh_extension_provider": {Tok: resource(serviceMeshMod, "ExtensionProvider")},

			// ServiceCatalog
			"alicloud_service_catalog_provisioned_product": {Tok: resource(serviceCatalogMod, "ProvisionedProduct")},

			// Sas
			"alicloud_simple_application_server_instance":      {Tok: resource(sasMod, "Instance")},
			"alicloud_simple_application_server_custom_image":  {Tok: resource(sasMod, "CustomImage")},
			"alicloud_simple_application_server_firewall_rule": {Tok: resource(sasMod, "FirewallRule")},
			"alicloud_simple_application_server_snapshot":      {Tok: resource(sasMod, "Snapshot")},

			// Scdn
			"alicloud_scdn_domain_config": {Tok: resource(scdnMod, "DomainConfig")},
			"alicloud_scdn_domain":        {Tok: resource(scdnMod, "Domain")},

			// SchedulerX
			"alicloud_schedulerx_namespace": {Tok: resource(schedulerXMod, "Namespace")},

			// Sddp
			"alicloud_sddp_rule":       {Tok: resource(sddpMod, "Rule")},
			"alicloud_sddp_config":     {Tok: resource(sddpMod, "Config")},
			"alicloud_sddp_instance":   {Tok: resource(sddpMod, "Instance")},
			"alicloud_sddp_data_limit": {Tok: resource(sddpMod, "DataLimit")},

			// Security Center
			"alicloud_security_center_group":               {Tok: resource(securityCenterMod, "Group")},
			"alicloud_security_center_service_linked_role": {Tok: resource(securityCenterMod, "ServiceLinkedRole")},

			// Slb
			"alicloud_slb": {
				Tok:                resource(slbMod, "LoadBalancer"),
				DeprecationMessage: "This resource has been deprecated in favour of the ApplicationLoadBalancer resource",
			},
			"alicloud_slb_acl":            {Tok: resource(slbMod, "Acl")},
			"alicloud_slb_attachment":     {Tok: resource(slbMod, "Attachment")},
			"alicloud_slb_listener":       {Tok: resource(slbMod, "Listener")},
			"alicloud_slb_rule":           {Tok: resource(slbMod, "Rule")},
			"alicloud_slb_server_group":   {Tok: resource(slbMod, "ServerGroup")},
			"alicloud_slb_backend_server": {Tok: resource(slbMod, "BackendServer")},
			"alicloud_slb_ca_certificate": {
				Tok: resource(slbMod, "CaCertificate"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"ca_certificate": {
						CSharpName: "Certificate",
					},
				},
			},
			"alicloud_slb_domain_extension":          {Tok: resource(slbMod, "DomainExtension")},
			"alicloud_slb_master_slave_server_group": {Tok: resource(slbMod, "MasterSlaveServerGroup")},
			"alicloud_slb_server_certificate": {
				Tok: resource(slbMod, "ServerCertificate"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"server_certificate": {
						CSharpName: "Certificate",
					},
				},
			},
			"alicloud_slb_load_balancer":                  {Tok: resource(slbMod, "ApplicationLoadBalancer")},
			"alicloud_slb_tls_cipher_policy":              {Tok: resource(slbMod, "TlsCipherPolicy")},
			"alicloud_slb_acl_entry_attachment":           {Tok: resource(slbMod, "AclEntryAttachment")},
			"alicloud_slb_server_group_server_attachment": {Tok: resource(slbMod, "ServerGroupServerAttachment")},

			// sms
			"alicloud_sms_short_url": {Tok: resource(smsMod, "ShortUrl")},

			// ThreatDetection
			"alicloud_threat_detection_web_lock_config":       {Tok: resource(threatDetectionMod, "WebLockConfig")},
			"alicloud_threat_detection_vul_whitelist":         {Tok: resource(threatDetectionMod, "VulWhitelist")},
			"alicloud_threat_detection_honeypot_probe":        {Tok: resource(threatDetectionMod, "HoneypotProbe")},
			"alicloud_threat_detection_honeypot_preset":       {Tok: resource(threatDetectionMod, "HoneypotPreset")},
			"alicloud_threat_detection_honeypot_node":         {Tok: resource(threatDetectionMod, "HoneypotNode")},
			"alicloud_threat_detection_honey_pot":             {Tok: resource(threatDetectionMod, "HoneyPot")},
			"alicloud_threat_detection_baseline_strategy":     {Tok: resource(threatDetectionMod, "BaselineStrategy")},
			"alicloud_threat_detection_backup_policy":         {Tok: resource(threatDetectionMod, "BackupPolicy")},
			"alicloud_threat_detection_anti_brute_force_rule": {Tok: resource(threatDetectionMod, "AntiBruteForceRule")},

			// Tsdb
			"alicloud_tsdb_instance": {Tok: resource(tsdbMod, "Instance")},

			// VPC
			"alicloud_subnet": {
				Tok:                resource(vpcMod, "Subnet"),
				Docs:               &tfbridge.DocInfo{AllowMissing: true},
				DeprecationMessage: "This resource has been deprecated and replaced by the Switch resource.",
			},
			"alicloud_vpc":                          {Tok: resource(vpcMod, "Network")},
			"alicloud_vswitch":                      {Tok: resource(vpcMod, "Switch")},
			"alicloud_network_acl":                  {Tok: resource(vpcMod, "NetworkAcl")},
			"alicloud_network_acl_attachment":       {Tok: resource(vpcMod, "NetworkAclAttachment")},
			"alicloud_network_acl_entries":          {Tok: resource(vpcMod, "NetworkAclEntries")},
			"alicloud_network_interface":            {Tok: resource(vpcMod, "NetworkInterface")},
			"alicloud_network_interface_attachment": {Tok: resource(vpcMod, "NetworkInterfaceAttachment")},
			"alicloud_snat_entry": {
				Tok: resource(vpcMod, "SnatEntry"),
				Docs: &tfbridge.DocInfo{
					Source: "snat.html.markdown",
				},
			},
			"alicloud_route_entry":                 {Tok: resource(vpcMod, "RouteEntry")},
			"alicloud_route_table":                 {Tok: resource(vpcMod, "RouteTable")},
			"alicloud_route_table_attachment":      {Tok: resource(vpcMod, "RouteTableAttachment")},
			"alicloud_router_interface":            {Tok: resource(vpcMod, "RouterInterface")},
			"alicloud_router_interface_connection": {Tok: resource(vpcMod, "RouterInterfaceConnection")},
			"alicloud_nat_gateway":                 {Tok: resource(vpcMod, "NatGateway")},
			"alicloud_forward_entry":               {Tok: resource(vpcMod, "ForwardEntry")},
			"alicloud_havip":                       {Tok: resource(vpcMod, "HAVip")},
			"alicloud_havip_attachment":            {Tok: resource(vpcMod, "HAVipAttachment")},
			// There's an unfortunate namespace collision interfering with Typescript class name requirements.
			// For context, see https://github.com/pulumi/pulumi-alicloud/issues/409.
			"alicloud_vpc_ha_vip":                          {Tok: resource(vpcMod, "HaVipv2")},
			"alicloud_common_bandwidth_package":            {Tok: resource(vpcMod, "CommonBandwithPackage")},
			"alicloud_common_bandwidth_package_attachment": {Tok: resource(vpcMod, "CommonBandwithPackageAttachment")},
			"alicloud_vpc_flow_log":                        {Tok: resource(vpcMod, "FlowLog")},
			"alicloud_vpc_dhcp_options_set":                {Tok: resource(vpcMod, "DhcpOptionsSet")},
			"alicloud_vpc_nat_ip_cidr": {
				Tok: resource(vpcMod, "NatIpCidr"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"nat_ip_cidr": {
						CSharpName: "NatIpCidrBlock",
					},
				},
			},
			"alicloud_vpc_nat_ip": {
				Tok: resource(vpcMod, "NatIp"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"nat_ip": {
						CSharpName: "NatIpAddress",
					},
				},
			},
			"alicloud_vpc_ipv6_address": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"ipv6_address": {CSharpName: "Address"},
				},
			},
			"alicloud_vpc_bgp_group":                      {Tok: resource(vpcMod, "BgpGroup")},
			"alicloud_vpc_bgp_network":                    {Tok: resource(vpcMod, "BgpNetwork")},
			"alicloud_vpc_bgp_peer":                       {Tok: resource(vpcMod, "BgpPeer")},
			"alicloud_vpc_dhcp_options_set_attachment":    {Tok: resource(vpcMod, "DhcpOptionsSetAttachment")},
			"alicloud_vpc_gateway_route_table_attachment": {Tok: resource(vpcMod, "GatewayRouteTableAttachment")},
			"alicloud_vpc_ipv4_cidr_block":                {Tok: resource(vpcMod, "Ipv4CidrBlock")},
			"alicloud_vpc_ipv4_gateway":                   {Tok: resource(vpcMod, "Ipv4Gateway")},
			"alicloud_vpc_ipv6_egress_rule":               {Tok: resource(vpcMod, "Ipv6EgressRule")},
			"alicloud_vpc_ipv6_gateway":                   {Tok: resource(vpcMod, "Ipv6Gateway")},
			"alicloud_vpc_ipv6_internet_bandwidth":        {Tok: resource(vpcMod, "Ipv6InternetBandwidth")},
			// This resource came after "alicloud_network_acl_attachment", which is why it has the "Vpc" prefix
			"alicloud_vpc_network_acl_attachment":             {Tok: resource(vpcMod, "VpcNetworkAclAttachment")},
			"alicloud_vpc_peer_connection":                    {Tok: resource(vpcMod, "PeerConnection")},
			"alicloud_vpc_peer_connection_accepter":           {Tok: resource(vpcMod, "PeerConnectionAccepter")},
			"alicloud_vpc_prefix_list":                        {Tok: resource(vpcMod, "PrefixList")},
			"alicloud_vpc_public_ip_address_pool":             {Tok: resource(vpcMod, "PublicIpAddressPool")},
			"alicloud_vpc_public_ip_address_pool_cidr_block":  {Tok: resource(vpcMod, "PublicIpAddressPoolCidrBlock")},
			"alicloud_vpc_traffic_mirror_filter":              {Tok: resource(vpcMod, "TrafficMirrorFilter")},
			"alicloud_vpc_traffic_mirror_filter_egress_rule":  {Tok: resource(vpcMod, "TrafficMirrorFilterEgressRule")},
			"alicloud_vpc_traffic_mirror_filter_ingress_rule": {Tok: resource(vpcMod, "TrafficMirrorFilterIngressRule")},
			"alicloud_vpc_traffic_mirror_session":             {Tok: resource(vpcMod, "TrafficMirrorSession")},
			"alicloud_vpc_vbr_ha":                             {Tok: resource(vpcMod, "VbrHa")},

			// Vod
			"alicloud_vod_domain":          {Tok: resource(vodMod, "Domain")},
			"alicloud_vod_editing_project": {Tok: resource(vodMod, "EditingProject")},

			// VPN
			"alicloud_ssl_vpn_client_cert":        {Tok: resource(vpnMod, "SslVpnClientCert")},
			"alicloud_ssl_vpn_server":             {Tok: resource(vpnMod, "SslVpnServer")},
			"alicloud_vpn_connection":             {Tok: resource(vpnMod, "Connection")},
			"alicloud_vpn_customer_gateway":       {Tok: resource(vpnMod, "CustomerGateway")},
			"alicloud_vpn_gateway":                {Tok: resource(vpnMod, "Gateway")},
			"alicloud_vpn_gateway_vco_route":      {Tok: resource(vpnMod, "GatewayVcoRoute")},
			"alicloud_vpn_gateway_vpn_attachment": {Tok: resource(vpnMod, "GatewayVpnAttachment")},
			"alicloud_vpn_ipsec_server":           {Tok: resource(vpnMod, "IpsecServer")},
			"alicloud_vpn_pbr_route_entry":        {Tok: resource(vpnMod, "PbrRouteEntry")},
			"alicloud_vpn_route_entry":            {Tok: resource(vpnMod, "RouteEntry")},

			// Vs
			"alicloud_video_surveillance_system_group": {Tok: resource(vsMod, "SystemGroup")},

			// Waf
			"alicloud_waf_domain": {
				Tok: resource(wafMod, "Domain"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"domain": {
						CSharpName: "DomainDeprecated",
					},
				},
			},
			"alicloud_waf_instance":          {Tok: resource(wafMod, "Instance")},
			"alicloud_waf_protection_module": {Tok: resource(wafMod, "ProtectionModule")},
			"alicloud_waf_certificate": {
				Tok: resource(wafMod, "Certificate"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"certificate": {
						CSharpName: "CertificateContents",
					},
				},
			},

			// WafV3
			"alicloud_wafv3_domain": {
				Tok: resource(wafv3Mod, "Domain"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"domain": {
						CSharpName: "DomainName",
					},
				},
			},

			// Yundun
			"alicloud_yundun_bastionhost_instance": {
				Tok:  resource(yundunMod, "BastionHostInstance"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_yundun_dbaudit_instance": {Tok: resource(yundunMod, "DBAuditInstance")},

			"alicloud_esa_certificate": {
				Tok: resource(esaMod, "Certificate"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"certificate": {CSharpName: "CertificateValue"},
				},
			},

			"alicloud_esa_kv_namespace": {
				Tok: resource(esaMod, "KvNamespace"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"kv_namespace": {CSharpName: "NamespaceValue"},
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"alicloud_account":                              {Tok: dataSource(alicloudMod, "getAccount")},
			"alicloud_zones":                                {Tok: dataSource(alicloudMod, "getZones")},
			"alicloud_regions":                              {Tok: dataSource(alicloudMod, "getRegions")},
			"alicloud_caller_identity":                      {Tok: dataSource(alicloudMod, "getCallerIdentity")},
			"alicloud_file_crc64_checksum":                  {Tok: dataSource(alicloudMod, "getFileCrc64Checksum")},
			"alicloud_msc_sub_contacts":                     {Tok: dataSource(alicloudMod, "getMscSubContacts")},
			"alicloud_msc_sub_subscriptions":                {Tok: dataSource(alicloudMod, "getMscSubSubscriptions")},
			"alicloud_msc_sub_webhooks":                     {Tok: dataSource(alicloudMod, "getMscSubWebhooks")},
			"alicloud_msc_sub_contact_verification_message": {Tok: dataSource(alicloudMod, "getMscSubContactVerificationMessage")},

			// ActionTrail
			"alicloud_actiontrails": {
				Tok:                dataSource(actionTrailMod, "getTrailsDeprecated"),
				DeprecationMessage: "DataSource has been renamed to `getTrails`",
			},
			"alicloud_actiontrail_trails":                {Tok: dataSource(actionTrailMod, "getTrails")},
			"alicloud_actiontrail_history_delivery_jobs": {Tok: dataSource(actionTrailMod, "getHistoryDeliveryJobs")},

			// AliKafka
			"alicloud_alikafka_consumer_groups": {Tok: dataSource(actionTrailMod, "getConsumerGroups")},
			"alicloud_alikafka_instances":       {Tok: dataSource(actionTrailMod, "getInstances")},
			"alicloud_alikafka_sasl_acls":       {Tok: dataSource(actionTrailMod, "getSaslAcls")},
			"alicloud_alikafka_sasl_users":      {Tok: dataSource(actionTrailMod, "getSaslUsers")},
			"alicloud_alikafka_topics":          {Tok: dataSource(actionTrailMod, "getTopics")},

			// Alb
			"alicloud_alb_acls":                     {Tok: dataSource(albMod, "getAcls")},
			"alicloud_alb_ascripts":                 {Tok: dataSource(albMod, "getAscripts")},
			"alicloud_alb_health_check_templates":   {Tok: dataSource(albMod, "getHealthCheckTemplates")},
			"alicloud_alb_listeners":                {Tok: dataSource(albMod, "getListeners")},
			"alicloud_alb_load_balancers":           {Tok: dataSource(albMod, "getLoadBalancers")},
			"alicloud_alb_rules":                    {Tok: dataSource(albMod, "getRules")},
			"alicloud_alb_server_groups":            {Tok: dataSource(albMod, "getServerGroups")},
			"alicloud_alb_system_security_policies": {Tok: dataSource(albMod, "getSystemSecurityPolicies")},
			"alicloud_alb_zones":                    {Tok: dataSource(albMod, "getZones")},
			"alicloud_alb_security_policies":        {Tok: dataSource(albMod, "getSecurityPolicies")},

			// amqp
			"alicloud_amqp_bindings":        {Tok: dataSource(amqpMod, "getBindings")},
			"alicloud_amqp_exchanges":       {Tok: dataSource(amqpMod, "getExchanges")},
			"alicloud_amqp_instances":       {Tok: dataSource(amqpMod, "getInstances")},
			"alicloud_amqp_queues":          {Tok: dataSource(amqpMod, "getQueues")},
			"alicloud_amqp_static_accounts": {Tok: dataSource(amqpMod, "getStaticAccounts")},
			"alicloud_amqp_virtual_hosts":   {Tok: dataSource(amqpMod, "getVirtualHosts")},

			// ApiGateway
			"alicloud_api_gateway_groups":      {Tok: dataSource(apiGatewayMod, "getGroups")},
			"alicloud_api_gateway_apis":        {Tok: dataSource(apiGatewayMod, "getApis")},
			"alicloud_api_gateway_apps":        {Tok: dataSource(apiGatewayMod, "getApps")},
			"alicloud_api_gateway_service":     {Tok: dataSource(apiGatewayMod, "getService")},
			"alicloud_api_gateway_backends":    {Tok: dataSource(apiGatewayMod, "getBackends")},
			"alicloud_api_gateway_plugins":     {Tok: dataSource(apiGatewayMod, "getPlugins")},
			"alicloud_api_gateway_models":      {Tok: dataSource(apiGatewayMod, "getModels")},
			"alicloud_api_gateway_log_configs": {Tok: dataSource(apiGatewayMod, "getLogConfigs")},

			// Arms
			"alicloud_arms_alert_contacts":         {Tok: dataSource(armsMod, "getAlertContacts")},
			"alicloud_arms_alert_contact_groups":   {Tok: dataSource(armsMod, "getAlertContactGroups")},
			"alicloud_arms_dispatch_rules":         {Tok: dataSource(armsMod, "getDispatchRules")},
			"alicloud_arms_prometheus_alert_rules": {Tok: dataSource(armsMod, "getPrometheusAlertRules")},

			// Bp
			"alicloud_bp_studio_applications": {Tok: dataSource(bpMod, "getStudioApplications")},

			// BastionHost
			"alicloud_bastionhost_user_groups":     {Tok: dataSource(bastionHostMod, "getUserGroups")},
			"alicloud_bastionhost_instances":       {Tok: dataSource(bastionHostMod, "getInstances")},
			"alicloud_bastionhost_users":           {Tok: dataSource(bastionHostMod, "getUsers")},
			"alicloud_bastionhost_host_groups":     {Tok: dataSource(bastionHostMod, "getHostGroups")},
			"alicloud_bastionhost_host_accounts":   {Tok: dataSource(bastionHostMod, "getHostAccounts")},
			"alicloud_bastionhost_hosts":           {Tok: dataSource(bastionHostMod, "getHosts")},
			"alicloud_bastionhost_host_share_keys": {Tok: dataSource(bastionHostMod, "getHostShareKeys")},

			// Brain
			"alicloud_brain_industrial_pid_projects":      {Tok: dataSource(brainMod, "getIndustrialPidProjects")},
			"alicloud_brain_industrial_pid_organizations": {Tok: dataSource(brainMod, "getIndustrialPidOrganizations")},
			"alicloud_brain_industrial_service":           {Tok: dataSource(brainMod, "getIndustrialSerice")},
			"alicloud_brain_industrial_pid_loops":         {Tok: dataSource(brainMod, "getIndustrialPidLoops")},

			// Bss
			"alicloud_bss_open_api_products": {
				Tok:  dataSource(bssMod, "getOpenApiProducts"),
				Docs: &tfbridge.DocInfo{Source: "bss_openapi_products.html.markdown"},
			},
			"alicloud_bss_open_api_pricing_modules": {Tok: dataSource(bssMod, "getOpenApiPricingModules")},

			// Cas
			"alicloud_cas_certificates": {
				Tok:                dataSource(casMod, "getCertificates"),
				DeprecationMessage: "This resource has been deprecated in favour of getServiceCertificates",
			},
			"alicloud_ssl_certificates_service_certificates": {Tok: dataSource(casMod, "getServiceCertificates")},

			// Cassandra
			"alicloud_cassandra_clusters":     {Tok: dataSource(cassandraMod, "getClusters")},
			"alicloud_cassandra_data_centers": {Tok: dataSource(cassandraMod, "getDataCenters")},
			"alicloud_cassandra_zones":        {Tok: dataSource(cassandraMod, "getZones")},
			"alicloud_cassandra_backup_plans": {Tok: dataSource(cassandraMod, "getBackupPlans")},

			// Cddc
			"alicloud_cddc_dedicated_host_groups":   {Tok: dataSource(cddcMod, "getDedicatedHostGroups")},
			"alicloud_cddc_dedicated_hosts":         {Tok: dataSource(cddcMod, "getDedicatedHosts")},
			"alicloud_cddc_zones":                   {Tok: dataSource(cddcMod, "getZones")},
			"alicloud_cddc_host_ecs_level_infos":    {Tok: dataSource(cddcMod, "getHostEcsLevelInfos")},
			"alicloud_cddc_dedicated_host_accounts": {Tok: dataSource(cddcMod, "getDedicatedHostAccounts")},

			// Cdn
			"alicloud_cdn_service":                  {Tok: dataSource(cdnMod, "getService")},
			"alicloud_cdn_real_time_log_deliveries": {Tok: dataSource(cdnMod, "getRealTimeLogDeliveries")},
			"alicloud_cdn_ip_info":                  {Tok: dataSource(cdnMod, "getIpInfo")},
			"alicloud_cdn_blocked_regions":          {Tok: dataSource(cdnMod, "getBlockedRegions")},

			// Cen
			"alicloud_cen_bandwidth_limits":                             {Tok: dataSource(cenMod, "getBandwidthLimits")},
			"alicloud_cen_bandwidth_packages":                           {Tok: dataSource(cenMod, "getBandwidthPackages")},
			"alicloud_cen_child_instance_route_entry_to_attachments":    {Tok: dataSource(cenMod, "getChildInstanceRouteEntryToAttachments")},
			"alicloud_cen_flowlogs":                                     {Tok: dataSource(cenMod, "getFlowlogs")},
			"alicloud_cen_instance_attachments":                         {Tok: dataSource(cenMod, "getInstanceAttachments")},
			"alicloud_cen_instances":                                    {Tok: dataSource(cenMod, "getInstances")},
			"alicloud_cen_inter_region_traffic_qos_policies":            {Tok: dataSource(cenMod, "getInterRegionTrafficQosPolicies")},
			"alicloud_cen_inter_region_traffic_qos_queues":              {Tok: dataSource(cenMod, "getInterRegionTrafficQosQueues")},
			"alicloud_cen_private_zones":                                {Tok: dataSource(cenMod, "getPrivateZones")},
			"alicloud_cen_region_route_entries":                         {Tok: dataSource(cenMod, "getRegionRouteEntries")},
			"alicloud_cen_route_entries":                                {Tok: dataSource(cenMod, "getRouteEntries")},
			"alicloud_cen_route_maps":                                   {Tok: dataSource(cenMod, "getRouteMaps")},
			"alicloud_cen_route_services":                               {Tok: dataSource(cenMod, "getRouteServices")},
			"alicloud_cen_transit_router_cidrs":                         {Tok: dataSource(cenMod, "getTransitRouterCidrs")},
			"alicloud_cen_transit_router_multicast_domain_associations": {Tok: dataSource(cenMod, "getTransitRouterMulticastDomainAssociations")},
			"alicloud_cen_transit_router_multicast_domain_members":      {Tok: dataSource(cenMod, "getTransitRouterMulticastDomainMembers")},
			"alicloud_cen_transit_router_multicast_domain_peer_members": {Tok: dataSource(cenMod, "getTransitRouterMulticastDomainPeerMembers")},
			"alicloud_cen_transit_router_multicast_domain_sources":      {Tok: dataSource(cenMod, "getTransitRouterMulticastDomainSources")},
			"alicloud_cen_transit_router_multicast_domains":             {Tok: dataSource(cenMod, "getTransitRouterMulticastDomains")},
			"alicloud_cen_transit_router_prefix_list_associations":      {Tok: dataSource(cenMod, "getTransitRouterPrefixListAssociations")},
			"alicloud_cen_transit_router_route_tables":                  {Tok: dataSource(cenMod, "getTransitRouterRouteTables")},
			"alicloud_cen_transit_router_vpn_attachments":               {Tok: dataSource(cenMod, "getTransitRouterVpnAttachments")},
			"alicloud_cen_transit_routers":                              {Tok: dataSource(cenMod, "getTransitRouters")},
			"alicloud_cen_vbr_health_checks":                            {Tok: dataSource(cenMod, "getVbrHealthChecks")},
			"alicloud_cen_transit_router_route_table_associations": {
				Tok: dataSource(cenMod, "getTransitRouterRouteTableAssociations"),
			},
			"alicloud_cen_transit_router_route_table_propagations": {
				Tok: dataSource(cenMod, "getTransitRouterRouteTablePropagations"),
			},
			"alicloud_cen_transit_router_route_entries":       {Tok: dataSource(cenMod, "getTransitRouterRouteEntries")},
			"alicloud_cen_transit_router_vbr_attachments":     {Tok: dataSource(cenMod, "getTransitRouterVbrAttachments")},
			"alicloud_cen_transit_router_vpc_attachments":     {Tok: dataSource(cenMod, "getTransitRouterVpcAttachments")},
			"alicloud_cen_transit_router_peer_attachments":    {Tok: dataSource(cenMod, "getTransitRouterPeerAttachments")},
			"alicloud_cen_transit_router_service":             {Tok: dataSource(cenMod, "getTransitRouterService")},
			"alicloud_cen_transit_router_available_resources": {Tok: dataSource(cenMod, "getTransitRouterAvailableResources")},
			"alicloud_cen_traffic_marking_policies":           {Tok: dataSource(cenMod, "getTrafficMarkingPolicies")},

			// Clickhouse
			"alicloud_click_house_db_clusters":     {Tok: dataSource(clickHouseMod, "getDbClusters")},
			"alicloud_click_house_accounts":        {Tok: dataSource(clickHouseMod, "getAccounts")},
			"alicloud_click_house_regions":         {Tok: dataSource(clickHouseMod, "getRegions")},
			"alicloud_click_house_backup_policies": {Tok: dataSource(clickHouseMod, "getBackupPolicies")},

			// CloudAuth
			"alicloud_cloudauth_face_configs": {Tok: dataSource(cloudAuthMod, "getFaceConfigs")},

			// CloudConnect
			"alicloud_cloud_connect_networks": {Tok: dataSource(cloudConnectMod, "getNetworks")},

			// Cloudfirewall
			"alicloud_cloud_firewall_address_books":                 {Tok: dataSource(cloudFirewallMod, "getAddressBooks")},
			"alicloud_cloud_firewall_control_policies":              {Tok: dataSource(cloudFirewallMod, "getControlPolicies")},
			"alicloud_cloud_firewall_instance_members":              {Tok: dataSource(cloudFirewallMod, "getInstanceMembers")},
			"alicloud_cloud_firewall_instances":                     {Tok: dataSource(cloudFirewallMod, "getInstances")},
			"alicloud_cloud_firewall_vpc_firewall_cens":             {Tok: dataSource(cloudFirewallMod, "getVpcFirewallCens")},
			"alicloud_cloud_firewall_vpc_firewall_control_policies": {Tok: dataSource(cloudFirewallMod, "getVpcFirewallControlPolicies")},
			"alicloud_cloud_firewall_vpc_firewalls":                 {Tok: dataSource(cloudFirewallMod, "getVpcFirewalls")},

			// CloudStorageGateway
			"alicloud_cloud_storage_gateway_storage_bundles": {
				Tok:  dataSource(cloudStorageGatewayMod, "getStorageBundles"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_cloud_storage_gateway_service":               {Tok: dataSource(cloudStorageGatewayMod, "getService")},
			"alicloud_cloud_storage_gateway_gateways":              {Tok: dataSource(cloudStorageGatewayMod, "getGateways")},
			"alicloud_cloud_storage_gateway_express_syncs":         {Tok: dataSource(cloudStorageGatewayMod, "getExpressSyncs")},
			"alicloud_cloud_storage_gateway_gateway_block_volumes": {Tok: dataSource(cloudStorageGatewayMod, "getGatewayBlockVolumes")},
			"alicloud_cloud_storage_gateway_gateway_cache_disks":   {Tok: dataSource(cloudStorageGatewayMod, "getGatewayCacheDisks")},
			"alicloud_cloud_storage_gateway_gateway_file_shares":   {Tok: dataSource(cloudStorageGatewayMod, "getGatewayFileShares")},
			"alicloud_cloud_storage_gateway_gateway_smb_users":     {Tok: dataSource(cloudStorageGatewayMod, "getGatewaySmbUsers")},
			"alicloud_cloud_storage_gateway_stocks":                {Tok: dataSource(cloudStorageGatewayMod, "getStocks")},

			// CloudSSO
			"alicloud_cloud_sso_access_assignments":      {Tok: dataSource(cloudSsoMod, "getAccessAssignments")},
			"alicloud_cloud_sso_access_configurations":   {Tok: dataSource(cloudSsoMod, "getAccessConfigurations")},
			"alicloud_cloud_sso_directories":             {Tok: dataSource(cloudSsoMod, "getDirectories")},
			"alicloud_cloud_sso_groups":                  {Tok: dataSource(cloudSsoMod, "getGroups")},
			"alicloud_cloud_sso_scim_server_credentials": {Tok: dataSource(cloudSsoMod, "getScimServerCredentials")},
			"alicloud_cloud_sso_service":                 {Tok: dataSource(cloudSsoMod, "getService")},
			"alicloud_cloud_sso_users":                   {Tok: dataSource(cloudSsoMod, "getUsers")},

			// CMS
			"alicloud_cms_alarm_contacts":       {Tok: dataSource(cmsMod, "getAlarmContacts")},
			"alicloud_cms_alarm_contact_groups": {Tok: dataSource(cmsMod, "getAlarmContactGroups")},
			"alicloud_cms_group_metric_rules":   {Tok: dataSource(cmsMod, "getGroupMetricRules")},
			"alicloud_cms_service":              {Tok: dataSource(cmsMod, "getService")},
			"alicloud_cms_monitor_groups":       {Tok: dataSource(cmsMod, "getMonitorGroups")},
			"alicloud_cms_monitor_group_instanceses": {
				Tok:  dataSource(cmsMod, "getMonitorGroupInstances"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_cms_metric_rule_black_lists":  {Tok: dataSource(cmsMod, "getMetricRuleBlackLists")},
			"alicloud_cms_metric_rule_templates":    {Tok: dataSource(cmsMod, "getMetricRuleTemplates")},
			"alicloud_cms_dynamic_tag_groups":       {Tok: dataSource(cmsMod, "getDynamicTagGroups")},
			"alicloud_cms_namespaces":               {Tok: dataSource(cmsMod, "getNamespaces")},
			"alicloud_cms_sls_groups":               {Tok: dataSource(cmsMod, "getSlsGroups")},
			"alicloud_cms_hybrid_monitor_datas":     {Tok: dataSource(cmsMod, "getHybridMonitorDatas")},
			"alicloud_cms_hybrid_monitor_fc_tasks":  {Tok: dataSource(cmsMod, "getHybridMonitorFcTasks")},
			"alicloud_cms_hybrid_monitor_sls_tasks": {Tok: dataSource(cmsMod, "getHybridMonitorSlsTasks")},
			"alicloud_cms_event_rules":              {Tok: dataSource(cmsMod, "getEventRules")},

			// Config
			"alicloud_config_configuration_recorders":    {Tok: dataSource(cfgMod, "getConfigurationRecorders")},
			"alicloud_config_delivery_channels":          {Tok: dataSource(cfgMod, "getDeliveryChannels")},
			"alicloud_config_rules":                      {Tok: dataSource(cfgMod, "getRules")},
			"alicloud_config_aggregate_compliance_packs": {Tok: dataSource(cfgMod, "getAggregateCompliancePacks")},
			"alicloud_config_aggregate_config_rules":     {Tok: dataSource(cfgMod, "getAggregateConfigRules")},
			"alicloud_config_aggregators":                {Tok: dataSource(cfgMod, "getAggregators")},
			"alicloud_config_compliance_packs":           {Tok: dataSource(cfgMod, "getCompliancePacks")},
			"alicloud_config_deliveries":                 {Tok: dataSource(cfgMod, "getDeliveries")},
			"alicloud_config_aggregate_deliveries":       {Tok: dataSource(cfgMod, "getAggregateDeliveries")},

			// Cr
			"alicloud_cr_namespaces":            {Tok: dataSource(crMod, "getNamespaces")},
			"alicloud_cr_repos":                 {Tok: dataSource(crMod, "getRepos")},
			"alicloud_cr_service":               {Tok: dataSource(crMod, "getService")},
			"alicloud_cr_endpoint_acl_service":  {Tok: dataSource(crMod, "getEndpointAclService")},
			"alicloud_cr_endpoint_acl_policies": {Tok: dataSource(crMod, "getEndpointAclPolicies")},
			"alicloud_cr_chart_repositories":    {Tok: dataSource(crMod, "getChartRepositories")},
			"alicloud_cr_chart_namespaces":      {Tok: dataSource(crMod, "getChartNamespaces")},
			"alicloud_cr_chains":                {Tok: dataSource(crMod, "getChains")},

			// Cs
			"alicloud_ack_service":                       {Tok: dataSource(csMod, "getAckService")},
			"alicloud_cr_ee_instances":                   {Tok: dataSource(csMod, "getRegistryEnterpriseInstances")},
			"alicloud_cr_ee_namespaces":                  {Tok: dataSource(csMod, "getRegistryEnterpriseNamespaces")},
			"alicloud_cr_ee_repos":                       {Tok: dataSource(csMod, "getRegistryEnterpriseRepos")},
			"alicloud_cr_ee_sync_rules":                  {Tok: dataSource(csMod, "getRegistryEnterpriseSyncRules")},
			"alicloud_cs_cluster_credential":             {Tok: dataSource(csMod, "getClusterCredential")},
			"alicloud_cs_edge_kubernetes_clusters":       {Tok: dataSource(csMod, "getEdgeKubernetesClusters")},
			"alicloud_cs_kubernetes_addon_metadata":      {Tok: dataSource(csMod, "getKubernetesAddonMetadata")},
			"alicloud_cs_kubernetes_addons":              {Tok: dataSource(csMod, "getKubernetesAddons")},
			"alicloud_cs_kubernetes_clusters":            {Tok: dataSource(csMod, "getKubernetesClusters")},
			"alicloud_cs_kubernetes_permissions":         {Tok: dataSource(csMod, "getKubernetesPermission")},
			"alicloud_cs_kubernetes_version":             {Tok: dataSource(csMod, "getKubernetesVersion")},
			"alicloud_cs_managed_kubernetes_clusters":    {Tok: dataSource(csMod, "getManagedKubernetesClusters")},
			"alicloud_cs_serverless_kubernetes_clusters": {Tok: dataSource(csMod, "getServerlessKubernetesClusters")},

			// Database Filesystem
			"alicloud_dbfs_instances": {Tok: dataSource(databaseFilesystemMod, "getInstances")},
			"alicloud_dbfs_snapshots": {Tok: dataSource(databaseFilesystemMod, "getSnapshots")},

			// Database Gateway
			"alicloud_database_gateway_gateways": {Tok: dataSource(databaseGatewayMod, "getGateways")},

			// DBS
			"alicloud_dbs_backup_plans": {Tok: dataSource(dbsMod, "getBackupPlans")},

			// Datahub
			"alicloud_datahub_service": {Tok: dataSource(datahubMod, "getService")},

			// DataWorks
			"alicloud_data_works_folders": {Tok: dataSource(dataWorksMod, "getFolders")},
			"alicloud_data_works_service": {Tok: dataSource(dataWorksMod, "getService")},

			// Dcdn
			"alicloud_dcdn_domains":      {Tok: dataSource(dcdnMod, "getDomains")},
			"alicloud_dcdn_ipa_domains":  {Tok: dataSource(dcdnMod, "getIpaDomains")},
			"alicloud_dcdn_service":      {Tok: dataSource(dcdnMod, "getService")},
			"alicloud_dcdn_waf_domains":  {Tok: dataSource(dcdnMod, "getWafDomains")},
			"alicloud_dcdn_waf_policies": {Tok: dataSource(dcdnMod, "getWafPolicies")},

			// Dds
			"alicloud_mongo_instances": {
				Tok:  dataSource(ddsMod, "getMongoInstances"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},

			// Ddos
			"alicloud_ddoscoo_instances":        {Tok: dataSource(ddosMod, "getDdosCooInstances")},
			"alicloud_ddosbgp_instances":        {Tok: dataSource(ddosMod, "getDdosBgpInstances")},
			"alicloud_ddoscoo_domain_resources": {Tok: dataSource(ddosMod, "getDdosCooDomainResources")},
			"alicloud_ddoscoo_ports":            {Tok: dataSource(ddosMod, "getDdosCooPorts")},
			"alicloud_ddosbgp_ips":              {Tok: dataSource(ddosMod, "getDdosBgpIps")},

			// Dfs
			"alicloud_dfs_access_groups": {Tok: dataSource(dfsMod, "getAccessGroups")},
			"alicloud_dfs_zones":         {Tok: dataSource(dfsMod, "getZones")},
			"alicloud_dfs_file_systems":  {Tok: dataSource(dfsMod, "getFileSystems")},
			"alicloud_dfs_access_rules":  {Tok: dataSource(dfsMod, "getAccessRules")},
			"alicloud_dfs_mount_points":  {Tok: dataSource(dfsMod, "getMountPoints")},

			// Direct Mail
			"alicloud_direct_mail_receiverses":    {Tok: dataSource(directMailMod, "getReceivers")},
			"alicloud_direct_mail_mail_addresses": {Tok: dataSource(directMailMod, "getMailAddresses")},
			"alicloud_direct_mail_domains":        {Tok: dataSource(directMailMod, "getDomains")},
			"alicloud_direct_mail_tags":           {Tok: dataSource(directMailMod, "getTags")},

			// Dms
			"alicloud_dms_enterprise_databases":       {Tok: dataSource(dmsMod, "getEnterpriseDatabases")},
			"alicloud_dms_enterprise_instances":       {Tok: dataSource(dmsMod, "getEnterpriseInstances")},
			"alicloud_dms_enterprise_logic_databases": {Tok: dataSource(dmsMod, "getEnterpriseLogicDatabases")},
			"alicloud_dms_enterprise_proxies":         {Tok: dataSource(dmsMod, "getEnterpriseProxies")},
			"alicloud_dms_enterprise_proxy_accesses":  {Tok: dataSource(dmsMod, "getEnterpriseProxyAccesses")},
			"alicloud_dms_enterprise_users":           {Tok: dataSource(dmsMod, "getEnterpriseUsers")},
			"alicloud_dms_user_tenants":               {Tok: dataSource(dmsMod, "getUserTenants")},

			// Dns
			"alicloud_dns_domain_groups":        {Tok: dataSource(dnsMod, "getDomainGroups")},
			"alicloud_dns_domain_records":       {Tok: dataSource(dnsMod, "getDomainRecords")},
			"alicloud_dns_domains":              {Tok: dataSource(dnsMod, "getDomains")},
			"alicloud_dns_groups":               {Tok: dataSource(dnsMod, "getGroups")},
			"alicloud_dns_records":              {Tok: dataSource(dnsMod, "getRecords")},
			"alicloud_dns_resolution_lines":     {Tok: dataSource(dnsMod, "getResolutionLines")},
			"alicloud_dns_domain_txt_guid":      {Tok: dataSource(dnsMod, "getDomainTxtGuid")},
			"alicloud_dns_instances":            {Tok: dataSource(dnsMod, "getInstances")},
			"alicloud_alidns_domain_groups":     {Tok: dataSource(dnsMod, "getAlidnsDomainGroups")},
			"alicloud_alidns_records":           {Tok: dataSource(dnsMod, "getAlidnsRecords")},
			"alicloud_alidns_domains":           {Tok: dataSource(dnsMod, "getAlidnsDomains")},
			"alicloud_alidns_instances":         {Tok: dataSource(dnsMod, "getAlidnsInstances")},
			"alicloud_alidns_gtm_instances":     {Tok: dataSource(dnsMod, "getGtmInstances")},
			"alicloud_alidns_custom_lines":      {Tok: dataSource(dnsMod, "getCustomLines")},
			"alicloud_alidns_address_pools":     {Tok: dataSource(dnsMod, "getAddressPools")},
			"alicloud_alidns_access_strategies": {Tok: dataSource(dnsMod, "getAccessStrategies")},

			// Drds
			"alicloud_drds_instances": {Tok: dataSource(drdsMod, "getInstances")},

			// Dts
			"alicloud_dts_subscription_jobs":    {Tok: dataSource(dtsMod, "getSubscriptionJobs")},
			"alicloud_dts_synchronization_jobs": {Tok: dataSource(dtsMod, "getSynchronizationJobs")},
			"alicloud_dts_consumer_channels":    {Tok: dataSource(dtsMod, "getConsumerChannels")},
			"alicloud_dts_migration_jobs":       {Tok: dataSource(dtsMod, "getMigrationJobs")},

			// Eais
			"alicloud_eais_instances": {Tok: dataSource(eaisMod, "getInstances")},

			// Ebs
			"alicloud_ebs_dedicated_block_storage_clusters": {Tok: dataSource(ebsMod, "getDedicatedBlockStorageClusters")},
			"alicloud_ebs_disk_replica_groups":              {Tok: dataSource(ebsMod, "getDiskReplicaGroups")},
			"alicloud_ebs_disk_replica_pairs":               {Tok: dataSource(ebsMod, "getDiskReplicaPairs")},
			"alicloud_ebs_regions":                          {Tok: dataSource(ebsMod, "getRegions")},

			// Eci
			"alicloud_eci_image_caches":     {Tok: dataSource(eciMod, "getImageCaches")},
			"alicloud_eci_container_groups": {Tok: dataSource(eciMod, "getContainerGroups")},
			"alicloud_eci_virtual_nodes":    {Tok: dataSource(eciMod, "getVirtualNodes")},
			"alicloud_eci_zones":            {Tok: dataSource(eciMod, "getZones")},

			// Ecp
			"alicloud_ecp_key_pairs":      {Tok: dataSource(ecpMod, "getKeyPairs")},
			"alicloud_ecp_instance_types": {Tok: dataSource(ecpMod, "getInstanceTypes")},
			"alicloud_ecp_instances":      {Tok: dataSource(ecpMod, "getInstances")},
			"alicloud_ecp_zones":          {Tok: dataSource(ecpMod, "getZones")},

			// Ecs
			"alicloud_disks":                             {Tok: dataSource(ecsMod, "getDisks")},
			"alicloud_ecs_activations":                   {Tok: dataSource(ecsMod, "getActivations")},
			"alicloud_ecs_auto_snapshot_policies":        {Tok: dataSource(ecsMod, "getAutoSnapshotPolicies")},
			"alicloud_ecs_capacity_reservations":         {Tok: dataSource(ecsMod, "getCapacityReservations")},
			"alicloud_ecs_commands":                      {Tok: dataSource(ecsMod, "getCommands")},
			"alicloud_ecs_dedicated_host_clusters":       {Tok: dataSource(ecsMod, "getEcsDedicatedHostClusters")},
			"alicloud_ecs_dedicated_hosts":               {Tok: dataSource(ecsMod, "getDedicatedHosts")},
			"alicloud_ecs_deployment_sets":               {Tok: dataSource(ecsMod, "getEcsDeploymentSets")},
			"alicloud_ecs_disks":                         {Tok: dataSource(ecsMod, "getEcsDisks")},
			"alicloud_ecs_elasticity_assurances":         {Tok: dataSource(ecsMod, "getElasticityAssurances")},
			"alicloud_ecs_hpc_clusters":                  {Tok: dataSource(ecsMod, "getHpcClusters")},
			"alicloud_ecs_image_components":              {Tok: dataSource(ecsMod, "getEcsImageComponents")},
			"alicloud_ecs_image_pipelines":               {Tok: dataSource(ecsMod, "getEcsImagePipeline")},
			"alicloud_ecs_invocations":                   {Tok: dataSource(ecsMod, "getEcsInvocations")},
			"alicloud_ecs_key_pairs":                     {Tok: dataSource(ecsMod, "getEcsKeyPairs")},
			"alicloud_ecs_launch_templates":              {Tok: dataSource(ecsMod, "getEcsLaunchTemplates")},
			"alicloud_ecs_network_interface_permissions": {Tok: dataSource(ecsMod, "getEcsNetworkInterfacePermissions")},
			"alicloud_ecs_network_interfaces":            {Tok: dataSource(ecsMod, "getEcsNetworkInterfaces")},
			"alicloud_ecs_prefix_lists":                  {Tok: dataSource(ecsMod, "getEcsPrefixLists")},
			"alicloud_ecs_snapshot_groups":               {Tok: dataSource(ecsMod, "getEcsSnapshotGroups")},
			"alicloud_ecs_snapshots":                     {Tok: dataSource(ecsMod, "getEcsSnapshots")},
			"alicloud_ecs_storage_capacity_units":        {Tok: dataSource(ecsMod, "getEcsStorageCapacityUnits")},
			"alicloud_eip_addresses":                     {Tok: dataSource(ecsMod, "getEipAddresses")},
			"alicloud_eips": {
				Tok:                dataSource(ecsMod, "getEips"),
				DeprecationMessage: "This function has been deprecated in favour of the getEipAddresses function",
			},
			"alicloud_images":                 {Tok: dataSource(ecsMod, "getImages")},
			"alicloud_instance_keywords":      {Tok: dataSource(ecsMod, "getInstanceKeywords")},
			"alicloud_instance_type_families": {Tok: dataSource(ecsMod, "getInstanceTypeFamilies")},
			"alicloud_instance_types":         {Tok: dataSource(ecsMod, "getInstanceTypes")},
			"alicloud_instances":              {Tok: dataSource(ecsMod, "getInstances")},
			"alicloud_key_pairs":              {Tok: dataSource(ecsMod, "getKeyPairs")},
			"alicloud_network_interfaces":     {Tok: dataSource(ecsMod, "getNetworkInterfaces")},
			"alicloud_security_group_rules":   {Tok: dataSource(ecsMod, "getSecurityGroupRules")},
			"alicloud_security_groups":        {Tok: dataSource(ecsMod, "getSecurityGroups")},
			"alicloud_snapshots":              {Tok: dataSource(ecsMod, "getSnapshots")},

			// Edas
			"alicloud_edas_applications":  {Tok: dataSource(edasMod, "getApplications")},
			"alicloud_edas_deploy_groups": {Tok: dataSource(edasMod, "getDeployGroups")},
			"alicloud_edas_clusters":      {Tok: dataSource(edasMod, "getClusters")},
			"alicloud_edas_service":       {Tok: dataSource(edasMod, "getService")},
			"alicloud_edas_namespaces":    {Tok: dataSource(edasMod, "getNamespaces")},

			// Eds
			"alicloud_ecd_policy_groups":             {Tok: dataSource(edsMod, "getPolicyGroups")},
			"alicloud_ecd_simple_office_sites":       {Tok: dataSource(edsMod, "getSimpleOfficeSites")},
			"alicloud_ecd_nas_file_systems":          {Tok: dataSource(edsMod, "getNasFileSystems")},
			"alicloud_ecd_bundles":                   {Tok: dataSource(edsMod, "getBundles")},
			"alicloud_ecd_desktops":                  {Tok: dataSource(edsMod, "getDesktops")},
			"alicloud_ecd_network_packages":          {Tok: dataSource(edsMod, "getNetworkPackages")},
			"alicloud_ecd_users":                     {Tok: dataSource(edsMod, "getUsers")},
			"alicloud_ecd_images":                    {Tok: dataSource(edsMod, "getImages")},
			"alicloud_ecd_commands":                  {Tok: dataSource(edsMod, "getCommands")},
			"alicloud_ecd_snapshots":                 {Tok: dataSource(edsMod, "getSnapshots")},
			"alicloud_ecd_desktop_types":             {Tok: dataSource(edsMod, "getDesktopTypes")},
			"alicloud_ecd_ad_connector_directories":  {Tok: dataSource(edsMod, "getAdConnectorDirectories")},
			"alicloud_ecd_ram_directories":           {Tok: dataSource(edsMod, "getRamDirectories")},
			"alicloud_ecd_zones":                     {Tok: dataSource(edsMod, "getZones")},
			"alicloud_ecd_ad_connector_office_sites": {Tok: dataSource(edsMod, "getAdConnectorOfficeSites")},
			"alicloud_ecd_custom_properties":         {Tok: dataSource(edsMod, "getCustomProperties")},

			// Ehpc
			"alicloud_ehpc_job_templates": {Tok: dataSource(ehpcMod, "getJobTemplates")},
			"alicloud_ehpc_clusters":      {Tok: dataSource(ehpcMod, "getClusters")},

			// EipAnycast
			"alicloud_eipanycast_anycast_eip_addresses": {Tok: dataSource(eipAnyCastMod, "getAnycastEipAddresses")},

			// Elasticsearch
			"alicloud_elasticsearch_instances": {
				Tok:  dataSource(elasticsearchMod, "getInstances"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_elasticsearch_zones": {Tok: dataSource(elasticsearchMod, "getZones")},

			// Emr
			"alicloud_emr_disk_types":     {Tok: dataSource(emrMod, "getDiskTypes")},
			"alicloud_emr_instance_types": {Tok: dataSource(emrMod, "getInstanceTypes")},
			"alicloud_emr_main_versions":  {Tok: dataSource(emrMod, "getMainVersions")},
			"alicloud_emr_clusters":       {Tok: dataSource(emrMod, "getClusters")},

			// Ens
			"alicloud_ens_key_pairs": {Tok: dataSource(ensMod, "getKeyPairs")},

			// Ess
			"alicloud_ess_scaling_configurations": {Tok: dataSource(essMod, "getScalingConfigurations")},
			"alicloud_ess_scaling_groups":         {Tok: dataSource(essMod, "getScalingGroups")},
			"alicloud_ess_scaling_rules":          {Tok: dataSource(essMod, "getScalingRules")},
			"alicloud_ess_alarms":                 {Tok: dataSource(essMod, "getAlarms")},
			"alicloud_ess_notifications":          {Tok: dataSource(essMod, "getNotifications")},
			"alicloud_ess_scheduled_tasks":        {Tok: dataSource(essMod, "getScheduledTasks")},
			"alicloud_ess_lifecycle_hooks":        {Tok: dataSource(essMod, "getLifecycleHooks")},

			// event bridge
			"alicloud_event_bridge_service":       {Tok: dataSource(eventBridgeMod, "getService")},
			"alicloud_event_bridge_event_buses":   {Tok: dataSource(eventBridgeMod, "getEventBuses")},
			"alicloud_event_bridge_rules":         {Tok: dataSource(eventBridgeMod, "getRules")},
			"alicloud_event_bridge_event_sources": {Tok: dataSource(eventBridgeMod, "getEventSources")},

			// Express Connect
			"alicloud_express_connect_access_points":      {Tok: dataSource(expressConnectMod, "getAccessPoints")},
			"alicloud_express_connect_grant_rule_to_cens": {Tok: dataSource(expressConnectMod, "getGrantRuleToCens")},
			"alicloud_express_connect_physical_connection_service": {
				Tok: dataSource(expressConnectMod, "getPhysicalConnectionService"),
			},
			"alicloud_express_connect_physical_connections":         {Tok: dataSource(expressConnectMod, "getPhysicalConnections")},
			"alicloud_express_connect_vbr_pconn_associations":       {Tok: dataSource(expressConnectMod, "getVbrPconnAssociations")},
			"alicloud_express_connect_virtual_border_routers":       {Tok: dataSource(expressConnectMod, "getVirtualBorderRouters")},
			"alicloud_express_connect_virtual_physical_connections": {Tok: dataSource(expressConnectMod, "getVirtualPhysicalConnections")},

			// Fc
			"alicloud_fc_functions":      {Tok: dataSource(fcMod, "getFunctions")},
			"alicloud_fc_services":       {Tok: dataSource(fcMod, "getServices")},
			"alicloud_fc_triggers":       {Tok: dataSource(fcMod, "getTriggers")},
			"alicloud_fc_zones":          {Tok: dataSource(fcMod, "getZones")},
			"alicloud_fc_custom_domains": {Tok: dataSource(fcMod, "getCustomDomains")},
			"alicloud_fc_service":        {Tok: dataSource(fcMod, "getService")},

			// FNF
			"alicloud_fnf_schedules":  {Tok: dataSource(fnfMod, "getSchedules")},
			"alicloud_fnf_flows":      {Tok: dataSource(fnfMod, "getFlows")},
			"alicloud_fnf_service":    {Tok: dataSource(fnfMod, "getService")},
			"alicloud_fnf_executions": {Tok: dataSource(fnfMod, "getExecutions")},

			// Ga
			"alicloud_ga_accelerator_spare_ip_attachments":       {Tok: dataSource(gaMod, "getAcceleratorSpareIpAttachments")},
			"alicloud_ga_accelerators":                           {Tok: dataSource(gaMod, "getAccelerators")},
			"alicloud_ga_acls":                                   {Tok: dataSource(gaMod, "getAcls")},
			"alicloud_ga_additional_certificates":                {Tok: dataSource(gaMod, "getAdditionalCertificates")},
			"alicloud_ga_bandwidth_packages":                     {Tok: dataSource(gaMod, "getBandwidthPackages")},
			"alicloud_ga_basic_accelerate_ip_endpoint_relations": {Tok: dataSource(gaMod, "getBasicAccelerateIpEndpointRelations")},
			"alicloud_ga_basic_accelerate_ips":                   {Tok: dataSource(gaMod, "getBasicAccelerateIps")},
			"alicloud_ga_basic_accelerators":                     {Tok: dataSource(gaMod, "getBasicAccelerators")},
			"alicloud_ga_basic_endpoints":                        {Tok: dataSource(gaMod, "getBasicEndpoints")},
			"alicloud_ga_endpoint_groups":                        {Tok: dataSource(gaMod, "getEndpointGroups")},
			"alicloud_ga_forwarding_rules":                       {Tok: dataSource(gaMod, "getForwardingRules")},
			"alicloud_ga_ip_sets":                                {Tok: dataSource(gaMod, "getIpSets")},
			"alicloud_ga_listeners":                              {Tok: dataSource(gaMod, "getListeners")},

			// Gpdb
			"alicloud_gpdb_accounts":          {Tok: dataSource(gpdbMod, "getAccounts")},
			"alicloud_gpdb_db_instance_plans": {Tok: dataSource(gpdbMod, "getDbInstancePlans")},
			"alicloud_gpdb_instances":         {Tok: dataSource(gpdbMod, "getInstances")},
			"alicloud_gpdb_zones":             {Tok: dataSource(gpdbMod, "getZones")},

			// Graph Database
			"alicloud_graph_database_db_instances": {Tok: dataSource(graphDatabaseMod, "getDbInstances")},

			// Hbase
			"alicloud_hbase_instances":      {Tok: dataSource(hbaseMod, "getInstances")},
			"alicloud_hbase_zones":          {Tok: dataSource(hbaseMod, "getZones")},
			"alicloud_hbase_instance_types": {Tok: dataSource(hbaseMod, "getInstanceTypes")},

			// hbr
			"alicloud_hbr_backup_jobs":               {Tok: dataSource(hbrMod, "getBackupJobs")},
			"alicloud_hbr_ecs_backup_clients":        {Tok: dataSource(hbrMod, "getEcsBackupClients")},
			"alicloud_hbr_ecs_backup_plans":          {Tok: dataSource(hbrMod, "getEcsBackupPlans")},
			"alicloud_hbr_hana_backup_plans":         {Tok: dataSource(hbrMod, "getHanaBackupPlans")},
			"alicloud_hbr_hana_instances":            {Tok: dataSource(hbrMod, "getHanaInstances")},
			"alicloud_hbr_nas_backup_plans":          {Tok: dataSource(hbrMod, "getNasBackupPlans")},
			"alicloud_hbr_oss_backup_plans":          {Tok: dataSource(hbrMod, "getOssBackupPlans")},
			"alicloud_hbr_ots_backup_plans":          {Tok: dataSource(hbrMod, "getOtsBackupPlans")},
			"alicloud_hbr_ots_snapshots":             {Tok: dataSource(hbrMod, "getOtsSnapshots")},
			"alicloud_hbr_replication_vault_regions": {Tok: dataSource(hbrMod, "getReplicationVaultRegions")},
			"alicloud_hbr_restore_jobs":              {Tok: dataSource(hbrMod, "getRestoreJobs")},
			"alicloud_hbr_server_backup_plans":       {Tok: dataSource(hbrMod, "getServerBackupPlans")},
			"alicloud_hbr_service":                   {Tok: dataSource(hbrMod, "getService")},
			"alicloud_hbr_snapshots":                 {Tok: dataSource(hbrMod, "getSnapshots")},
			"alicloud_hbr_vaults":                    {Tok: dataSource(hbrMod, "getVaults")},

			// iot
			"alicloud_iot_service":       {Tok: dataSource(iotMod, "getService")},
			"alicloud_iot_device_groups": {Tok: dataSource(iotMod, "getDeviceGroups")},

			// Imm
			"alicloud_imm_projects": {Tok: dataSource(immMod, "getProjects")},

			// Imp
			"alicloud_imp_app_templates": {Tok: dataSource(impMod, "getAppTemplates")},

			// Kms
			"alicloud_kms_ciphertext":      {Tok: dataSource(kmsMod, "getCiphertext")},
			"alicloud_kms_plaintext":       {Tok: dataSource(kmsMod, "getPlaintext")},
			"alicloud_kms_keys":            {Tok: dataSource(kmsMod, "getKeys")},
			"alicloud_kms_aliases":         {Tok: dataSource(kmsMod, "getAliases")},
			"alicloud_kms_key_versions":    {Tok: dataSource(kmsMod, "getKeyVersions")},
			"alicloud_kms_secrets":         {Tok: dataSource(kmsMod, "getSecrets")},
			"alicloud_kms_secret_versions": {Tok: dataSource(kmsMod, "getSecretVersions")},
			"alicloud_kms_service":         {Tok: dataSource(kmsMod, "getService")},

			// KvStore
			"alicloud_kvstore_instances":        {Tok: dataSource(kvstoreMod, "getInstances")},
			"alicloud_kvstore_instance_classes": {Tok: dataSource(kvstoreMod, "getInstanceClasses")},
			"alicloud_kvstore_instance_engines": {Tok: dataSource(kvstoreMod, "getInstanceEngines")},
			"alicloud_kvstore_zones":            {Tok: dataSource(kvstoreMod, "getZones")},
			"alicloud_kvstore_connections":      {Tok: dataSource(kvstoreMod, "getConnections")},
			"alicloud_kvstore_accounts":         {Tok: dataSource(kvstoreMod, "getAccounts")},
			"alicloud_kvstore_permission":       {Tok: dataSource(kvstoreMod, "getPermission")},

			// Lindorm
			"alicloud_lindorm_instances": {Tok: dataSource(lindormMod, "getInstances")},

			// Log
			"alicloud_log_service":        {Tok: dataSource(logMod, "getService")},
			"alicloud_log_projects":       {Tok: dataSource(logMod, "getProjects")},
			"alicloud_log_stores":         {Tok: dataSource(logMod, "getStores")},
			"alicloud_log_alert_resource": {Tok: dataSource(logMod, "getAlertResource")},

			// Marketplace
			"alicloud_market_products": {Tok: dataSource(marketPlaceMod, "getProducts")},
			"alicloud_market_product":  {Tok: dataSource(marketPlaceMod, "getProduct")},

			// Message
			"alicloud_message_service_queues":        {Tok: dataSource(messageMod, "getServiceQueues")},
			"alicloud_message_service_subscriptions": {Tok: dataSource(messageMod, "getServiceSubscriptions")},
			"alicloud_message_service_topics":        {Tok: dataSource(messageMod, "getServiceTopics")},

			// MaxCompute
			"alicloud_maxcompute_projects": {Tok: dataSource(maxComputeMod, "getProjects")},
			"alicloud_maxcompute_service":  {Tok: dataSource(maxComputeMod, "getService")},

			// MHub
			"alicloud_mhub_products": {Tok: dataSource(mhubMod, "getProducts")},
			"alicloud_mhub_apps":     {Tok: dataSource(mhubMod, "getApps")},

			// Mns
			"alicloud_mns_queues":              {Tok: dataSource(mnsMod, "getQueues")},
			"alicloud_mns_topic_subscriptions": {Tok: dataSource(mnsMod, "getTopicSubscriptions")},
			"alicloud_mns_topics":              {Tok: dataSource(mnsMod, "getTopics")},
			"alicloud_mns_service":             {Tok: dataSource(mnsMod, "getService")},

			// Mongo
			"alicloud_mongodb_instances":                          {Tok: dataSource(mongoDbMod, "getInstances")},
			"alicloud_mongodb_zones":                              {Tok: dataSource(mongoDbMod, "getZones")},
			"alicloud_mongodb_serverless_instances":               {Tok: dataSource(mongoDbMod, "getServerlessInstances")},
			"alicloud_mongodb_accounts":                           {Tok: dataSource(mongoDbMod, "getAccounts")},
			"alicloud_mongodb_audit_policies":                     {Tok: dataSource(mongoDbMod, "getAuditPolicies")},
			"alicloud_mongodb_sharding_network_public_addresses":  {Tok: dataSource(mongoDbMod, "getShardingNetworkPublicAddresses")},
			"alicloud_mongodb_sharding_network_private_addresses": {Tok: dataSource(mongoDbMod, "getShardingNetworkPrivateAddresses")},

			// Mse
			"alicloud_mse_clusters":          {Tok: dataSource(mseMod, "getClusters")},
			"alicloud_mse_gateways":          {Tok: dataSource(mseMod, "getGateways")},
			"alicloud_mse_znodes":            {Tok: dataSource(mseMod, "getZnodes")},
			"alicloud_mse_engine_namespaces": {Tok: dataSource(mseMod, "getEngineNamespaces")},

			// Nas
			"alicloud_nas_access_groups":          {Tok: dataSource(nasMod, "getAccessGroups")},
			"alicloud_nas_access_rules":           {Tok: dataSource(nasMod, "getAccessRules")},
			"alicloud_nas_file_systems":           {Tok: dataSource(nasMod, "getFileSystems")},
			"alicloud_nas_mount_targets":          {Tok: dataSource(nasMod, "getMountTargets")},
			"alicloud_nas_protocols":              {Tok: dataSource(nasMod, "getProtocols")},
			"alicloud_nas_service":                {Tok: dataSource(nasMod, "getService")},
			"alicloud_nas_zones":                  {Tok: dataSource(nasMod, "getZones")},
			"alicloud_nas_snapshots":              {Tok: dataSource(nasMod, "getSnapshots")},
			"alicloud_nas_lifecycle_policies":     {Tok: dataSource(nasMod, "getLifecyclePolicies")},
			"alicloud_nas_filesets":               {Tok: dataSource(nasMod, "getFilesets")},
			"alicloud_nas_data_flows":             {Tok: dataSource(nasMod, "getDataFlows")},
			"alicloud_nas_auto_snapshot_policies": {Tok: dataSource(nasMod, "getAutoSnapshotPolicies")},

			// Oos
			"alicloud_oos_templates":            {Tok: dataSource(oosMod, "getTemplates")},
			"alicloud_oos_executions":           {Tok: dataSource(oosMod, "getExecutions")},
			"alicloud_oos_applications":         {Tok: dataSource(oosMod, "getApplications")},
			"alicloud_oos_patch_baselines":      {Tok: dataSource(oosMod, "getPatchBaselines")},
			"alicloud_oos_application_groups":   {Tok: dataSource(oosMod, "getApplicationGroups")},
			"alicloud_oos_secret_parameters":    {Tok: dataSource(oosMod, "getSecretParameters")},
			"alicloud_oos_state_configurations": {Tok: dataSource(oosMod, "getStateConfigurations")},
			"alicloud_oos_parameters":           {Tok: dataSource(oosMod, "getParameters")},

			// Nlb
			"alicloud_nlb_listeners":                       {Tok: dataSource(nlbMod, "getListeners")},
			"alicloud_nlb_load_balancers":                  {Tok: dataSource(nlbMod, "getLoadBalancers")},
			"alicloud_nlb_security_policies":               {Tok: dataSource(nlbMod, "getSecurityPolicies")},
			"alicloud_nlb_server_group_server_attachments": {Tok: dataSource(nlbMod, "getServerGroupServerAttachments")},
			"alicloud_nlb_server_groups":                   {Tok: dataSource(nlbMod, "getServerGroups")},
			"alicloud_nlb_zones":                           {Tok: dataSource(nlbMod, "getZones")},

			// OpenSearch
			"alicloud_open_search_app_groups": {Tok: dataSource(openSearchMod, "getAppGroups")},

			// Oss
			"alicloud_oss_bucket_objects": {Tok: dataSource(ossMod, "getBucketObjects")},
			"alicloud_oss_buckets":        {Tok: dataSource(ossMod, "getBuckets")},
			"alicloud_oss_service":        {Tok: dataSource(ossMod, "getService")},

			// Ots
			"alicloud_ots_search_indexes": {
				Tok:  dataSource(otsMod, "getSearchIndexes"),
				Docs: &tfbridge.DocInfo{Source: "ots_search_index.html.markdown"},
			},
			"alicloud_ots_secondary_indexes": {Tok: dataSource(otsMod, "getSecondaryIndexes")},
			"alicloud_ots_service":           {Tok: dataSource(otsMod, "getService")},
			"alicloud_ots_tunnels":           {Tok: dataSource(otsMod, "getTunnels")},

			// PrivateLink
			"alicloud_privatelink_vpc_endpoints":      {Tok: dataSource(privateLinkMod, "getVpcEndpoints")},
			"alicloud_privatelink_service":            {Tok: dataSource(privateLinkMod, "getService")},
			"alicloud_privatelink_vpc_endpoint_zones": {Tok: dataSource(privateLinkMod, "getVpcEndpointZones")},
			"alicloud_privatelink_vpc_endpoint_services": {
				Tok: dataSource(privateLinkMod, "getVpcEndpointServices"),
			},
			"alicloud_privatelink_vpc_endpoint_service_resources": {
				Tok: dataSource(privateLinkMod, "getVpcEndpointServiceResources"),
			},
			"alicloud_privatelink_vpc_endpoint_service_users": {
				Tok: dataSource(privateLinkMod, "getVpcEndpointServiceUsers"),
			},
			"alicloud_privatelink_vpc_endpoint_connections": {
				Tok: dataSource(privateLinkMod, "getVpcEndpointConnections"),
			},

			// PolarDb
			"alicloud_polardb_clusters":                 {Tok: dataSource(polarDbMod, "getClusters")},
			"alicloud_polardb_endpoints":                {Tok: dataSource(polarDbMod, "getEndpoints")},
			"alicloud_polardb_accounts":                 {Tok: dataSource(polarDbMod, "getAccounts")},
			"alicloud_polardb_databases":                {Tok: dataSource(polarDbMod, "getDatabases")},
			"alicloud_polardb_zones":                    {Tok: dataSource(polarDbMod, "getZones")},
			"alicloud_polardb_node_classes":             {Tok: dataSource(polarDbMod, "getNodeClasses")},
			"alicloud_polardb_global_database_networks": {Tok: dataSource(polarDbMod, "getGlobalDatabaseNetworks")},
			"alicloud_polardb_parameter_groups":         {Tok: dataSource(polarDbMod, "getParameterGroups")},

			// Pvtr
			"alicloud_pvtz_zone_records":   {Tok: dataSource(pvtzMod, "getZoneRecords")},
			"alicloud_pvtz_zones":          {Tok: dataSource(pvtzMod, "getZones")},
			"alicloud_pvtz_service":        {Tok: dataSource(pvtzMod, "getService")},
			"alicloud_pvtz_endpoints":      {Tok: dataSource(pvtzMod, "getEndpoints")},
			"alicloud_pvtz_resolver_zones": {Tok: dataSource(pvtzMod, "getResolverZones")},
			"alicloud_pvtz_rules":          {Tok: dataSource(pvtzMod, "getRules")},

			// quickbi
			"alicloud_quick_bi_users": {Tok: dataSource(quickBiMod, "getUsers")},

			// quotas
			"alicloud_quotas_quotas": {Tok: dataSource(quotasMod, "getQuotas")},
			"alicloud_quotas_application_infos": {
				Tok:  dataSource(quotasMod, "getApplicationInfos"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_quotas_quota_alarms":       {Tok: dataSource(quotasMod, "getQuotaAlarms")},
			"alicloud_quotas_quota_applications": {Tok: dataSource(quotasMod, "getQuotaApplications")},

			// Ram
			"alicloud_ram_account_alias": {
				Tok:  dataSource(ramMod, "getAccountAlias"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_ram_account_aliases": {
				Tok:  dataSource(ramMod, "getAccountAliases"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_ram_groups":          {Tok: dataSource(ramMod, "getGroups")},
			"alicloud_ram_policies":        {Tok: dataSource(ramMod, "getPolicies")},
			"alicloud_ram_policy_document": {Tok: dataSource(ramMod, "getPolicyDocument")},
			"alicloud_ram_roles":           {Tok: dataSource(ramMod, "getRoles")},
			"alicloud_ram_saml_providers":  {Tok: dataSource(ramMod, "getSamlProviders")},
			"alicloud_ram_users":           {Tok: dataSource(ramMod, "getUsers")},

			// Rdc
			"alicloud_rdc_organizations": {Tok: dataSource(rdcMod, "getOrganizations")},

			// Rds
			"alicloud_db_instance_class_infos":   {Tok: dataSource(rdsMod, "getInstanceClassInfos")},
			"alicloud_db_instance_classes":       {Tok: dataSource(rdsMod, "getInstanceClasses")},
			"alicloud_db_instance_engines":       {Tok: dataSource(rdsMod, "getInstanceEngines")},
			"alicloud_db_instances":              {Tok: dataSource(rdsMod, "getInstances")},
			"alicloud_db_zones":                  {Tok: dataSource(rdsMod, "getZones")},
			"alicloud_rds_accounts":              {Tok: dataSource(rdsMod, "getAccounts")},
			"alicloud_rds_backups":               {Tok: dataSource(rdsMod, "getRdsBackups")},
			"alicloud_rds_cross_region_backups":  {Tok: dataSource(rdsMod, "getCrossRegionBackups")},
			"alicloud_rds_cross_regions":         {Tok: dataSource(rdsMod, "getCrossRegions")},
			"alicloud_rds_modify_parameter_logs": {Tok: dataSource(rdsMod, "getModifyParameterLogs")},
			"alicloud_rds_parameter_groups": {
				Tok:  dataSource(rdsMod, "getRdsParameterGroups"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},

			// ResourceManager
			"alicloud_resource_manager_account_deletion_check_task": {Tok: dataSource(resourceManagerMod, "getAccountDeletionCheckTask")},
			"alicloud_resource_manager_folders":                     {Tok: dataSource(resourceManagerMod, "getFolders")},
			"alicloud_resource_manager_resource_groups":             {Tok: dataSource(resourceManagerMod, "getResourceGroups")},
			"alicloud_resource_manager_policy_versions":             {Tok: dataSource(resourceManagerMod, "getPolicyVersions")},
			"alicloud_resource_manager_handshakes":                  {Tok: dataSource(resourceManagerMod, "getHandshakes")},
			"alicloud_resource_manager_accounts":                    {Tok: dataSource(resourceManagerMod, "getAccounts")},
			"alicloud_resource_manager_roles":                       {Tok: dataSource(resourceManagerMod, "getRoles")},
			"alicloud_resource_manager_policies":                    {Tok: dataSource(resourceManagerMod, "getPolicies")},
			"alicloud_resource_manager_shared_resources":            {Tok: dataSource(resourceManagerMod, "getSharedResources")},
			"alicloud_resource_manager_shared_targets":              {Tok: dataSource(resourceManagerMod, "getSharedTargets")},
			"alicloud_resource_manager_resource_shares":             {Tok: dataSource(resourceManagerMod, "getResourceShares")},
			"alicloud_resource_manager_control_policies":            {Tok: dataSource(resourceManagerMod, "getControlPolicies")},
			"alicloud_resource_manager_control_policy_attachments": {
				Tok: dataSource(resourceManagerMod, "getControlPolicyAttachments"),
			},
			"alicloud_resource_manager_resource_directories": {
				Tok: dataSource(resourceManagerMod, "getResourceDirectories"),
			},
			"alicloud_resource_manager_policy_attachments": {
				Tok: dataSource(resourceManagerMod, "getPolicyAttachments"),
			},
			"alicloud_resource_manager_delegated_administrators": {
				Tok: dataSource(resourceManagerMod, "getDelegatedAdministrators"),
			},

			// RocketMq
			"alicloud_ons_groups":    {Tok: dataSource(rocketMqMod, "getGroups")},
			"alicloud_ons_instances": {Tok: dataSource(rocketMqMod, "getInstances")},
			"alicloud_ons_topics":    {Tok: dataSource(rocketMqMod, "getTopics")},
			"alicloud_ons_service":   {Tok: dataSource(rocketMqMod, "getService")},

			// Ros
			"alicloud_ros_change_sets":        {Tok: dataSource(rosMod, "getChangeSets")},
			"alicloud_ros_stack_groups":       {Tok: dataSource(rosMod, "getStackGroups")},
			"alicloud_ros_stacks":             {Tok: dataSource(rosMod, "getStacks")},
			"alicloud_ros_templates":          {Tok: dataSource(rosMod, "getTemplates")},
			"alicloud_ros_stack_instances":    {Tok: dataSource(rosMod, "getStackInstances")},
			"alicloud_ros_regions":            {Tok: dataSource(rosMod, "getRegions")},
			"alicloud_ros_template_scratches": {Tok: dataSource(rosMod, "getTemplateScratches")},

			// Sae
			"alicloud_sae_service":                   {Tok: dataSource(saeMod, "getService")},
			"alicloud_sae_namespaces":                {Tok: dataSource(saeMod, "getNamespaces")},
			"alicloud_sae_config_maps":               {Tok: dataSource(saeMod, "getConfigMaps")},
			"alicloud_sae_applications":              {Tok: dataSource(saeMod, "getApplications")},
			"alicloud_sae_ingresses":                 {Tok: dataSource(saeMod, "getIngresses")},
			"alicloud_sae_instance_specifications":   {Tok: dataSource(saeMod, "getInstanceSpecifications")},
			"alicloud_sae_application_scaling_rules": {Tok: dataSource(saeMod, "getApplicationScalingRules")},
			"alicloud_sae_grey_tag_routes":           {Tok: dataSource(saeMod, "getGreyTagRoutes")},

			// Sag
			"alicloud_sag_acls":          {Tok: dataSource(sagMod, "getAcls")},
			"alicloud_smartag_flow_logs": {Tok: dataSource(sagMod, "getSmartagFlowLogs")},

			// ServiceCatalog
			"alicloud_service_catalog_launch_options":       {Tok: dataSource(serviceCatalogMod, "getLaunchOptions")},
			"alicloud_service_catalog_product_as_end_users": {Tok: dataSource(serviceCatalogMod, "getProductAsEndUsers")},
			"alicloud_service_catalog_product_versions":     {Tok: dataSource(serviceCatalogMod, "getProductVersions")},
			"alicloud_service_catalog_provisioned_products": {Tok: dataSource(serviceCatalogMod, "getProvisionedProducts")},

			// Sas
			"alicloud_simple_application_server_instances":      {Tok: dataSource(sasMod, "getInstances")},
			"alicloud_simple_application_server_images":         {Tok: dataSource(sasMod, "getImages")},
			"alicloud_simple_application_server_plans":          {Tok: dataSource(sasMod, "getServerPlans")},
			"alicloud_simple_application_server_custom_images":  {Tok: dataSource(sasMod, "getServerCustomImages")},
			"alicloud_simple_application_server_disks":          {Tok: dataSource(sasMod, "getServerDisks")},
			"alicloud_simple_application_server_firewall_rules": {Tok: dataSource(sasMod, "getServerFirewallRules")},
			"alicloud_simple_application_server_snapshots":      {Tok: dataSource(sasMod, "getServerSnapshots")},

			// Scdn
			"alicloud_scdn_domains": {Tok: dataSource(scdnMod, "getDomains")},

			// SchedulerX
			"alicloud_schedulerx_namespaces": {Tok: dataSource(schedulerXMod, "getNamespaces")},

			// sddp
			"alicloud_sddp_rules":       {Tok: dataSource(sddpMod, "getRules")},
			"alicloud_sddp_configs":     {Tok: dataSource(sddpMod, "getConfigs")},
			"alicloud_sddp_instances":   {Tok: dataSource(sddpMod, "getInstances")},
			"alicloud_sddp_data_limits": {Tok: dataSource(sddpMod, "getDataLimits")},

			// Security Center
			"alicloud_security_center_groups": {Tok: dataSource(securityCenterMod, "getGroups")},

			// Service Mesh
			"alicloud_service_mesh_extension_providers": {Tok: dataSource(serviceMeshMod, "getExtensionProviders")},
			"alicloud_service_mesh_service_meshes":      {Tok: dataSource(serviceMeshMod, "getServiceMeshes")},
			"alicloud_service_mesh_versions":            {Tok: dataSource(serviceMeshMod, "getVersions")},

			// Slb
			"alicloud_slb_attachments":                {Tok: dataSource(slbMod, "getAttachments")},
			"alicloud_slb_listeners":                  {Tok: dataSource(slbMod, "getListeners")},
			"alicloud_slb_rules":                      {Tok: dataSource(slbMod, "getRules")},
			"alicloud_slb_server_groups":              {Tok: dataSource(slbMod, "getServerGroups")},
			"alicloud_slbs":                           {Tok: dataSource(slbMod, "getLoadBalancers")},
			"alicloud_slb_acls":                       {Tok: dataSource(slbMod, "getAcls")},
			"alicloud_slb_backend_servers":            {Tok: dataSource(slbMod, "getBackendServers")},
			"alicloud_slb_ca_certificates":            {Tok: dataSource(slbMod, "getCaCertificates")},
			"alicloud_slb_domain_extensions":          {Tok: dataSource(slbMod, "getDomainExtensions")},
			"alicloud_slb_master_slave_server_groups": {Tok: dataSource(slbMod, "getMasterSlaveServerGroups")},
			"alicloud_slb_server_certificates":        {Tok: dataSource(slbMod, "getServerCertificates")},
			"alicloud_slb_zones":                      {Tok: dataSource(slbMod, "getZones")},
			"alicloud_slb_load_balancers":             {Tok: dataSource(slbMod, "getApplicationLoadBalancers")},
			"alicloud_slb_tls_cipher_policies":        {Tok: dataSource(slbMod, "getTlsCipherPolicies")},

			// ThreatDetection
			"alicloud_threat_detection_anti_brute_force_rules": {Tok: dataSource(threatDetectionMod, "getAntiBruteForceRules")},
			"alicloud_threat_detection_assets":                 {Tok: dataSource(threatDetectionMod, "getAssets")},
			"alicloud_threat_detection_backup_policies":        {Tok: dataSource(threatDetectionMod, "getBackupPolicies")},
			"alicloud_threat_detection_baseline_strategies":    {Tok: dataSource(threatDetectionMod, "getBaselineStrategies")},
			"alicloud_threat_detection_honey_pots":             {Tok: dataSource(threatDetectionMod, "getHoneyPots")},
			"alicloud_threat_detection_honeypot_images":        {Tok: dataSource(threatDetectionMod, "getHoneypotImages")},
			"alicloud_threat_detection_honeypot_nodes":         {Tok: dataSource(threatDetectionMod, "getHoneypotNodes")},
			"alicloud_threat_detection_honeypot_presets":       {Tok: dataSource(threatDetectionMod, "getHoneypotPresets")},
			"alicloud_threat_detection_honeypot_probes":        {Tok: dataSource(threatDetectionMod, "getHoneypotProbes")},
			"alicloud_threat_detection_log_shipper":            {Tok: dataSource(threatDetectionMod, "getLogShipper")},
			"alicloud_threat_detection_vul_whitelists":         {Tok: dataSource(threatDetectionMod, "getVulWhitelists")},
			"alicloud_threat_detection_web_lock_configs":       {Tok: dataSource(threatDetectionMod, "getWebLockConfigs")},

			// Tag
			"alicloud_tag_meta_tags": {Tok: dataSource(tagMod, "getMetaTags")},

			// tsdb
			"alicloud_tsdb_instances": {Tok: dataSource(tsdbMod, "getInstances")},
			"alicloud_tsdb_zones":     {Tok: dataSource(tsdbMod, "getZones")},

			// Vpc
			"alicloud_vpcs":                      {Tok: dataSource(vpcMod, "getNetworks")},
			"alicloud_router_interfaces":         {Tok: dataSource(vpcMod, "getRouterInterfaces")},
			"alicloud_forward_entries":           {Tok: dataSource(vpcMod, "getForwardEntries")},
			"alicloud_nat_gateways":              {Tok: dataSource(vpcMod, "getNatGateways")},
			"alicloud_route_entries":             {Tok: dataSource(vpcMod, "getRouteEntries")},
			"alicloud_route_tables":              {Tok: dataSource(vpcMod, "getRouteTables")},
			"alicloud_snat_entries":              {Tok: dataSource(vpcMod, "getSnatEntries")},
			"alicloud_common_bandwidth_packages": {Tok: dataSource(vpcMod, "getCommonBandwidthPackages")},
			"alicloud_enhanced_nat_available_zones": {
				Tok:  dataSource(vpcMod, "getEnhancedNatAvailableZones"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_havips":                     {Tok: dataSource(vpcMod, "getHavips")},
			"alicloud_vpc_flow_logs":              {Tok: dataSource(vpcMod, "getVpcFlowLogs")},
			"alicloud_network_acls":               {Tok: dataSource(vpcMod, "getNetworkAcls")},
			"alicloud_vpc_dhcp_options_sets":      {Tok: dataSource(vpcMod, "getDhcpOptionsSets")},
			"alicloud_vpc_nat_ip_cidrs":           {Tok: dataSource(vpcMod, "getNatIpCidrs")},
			"alicloud_vpc_nat_ips":                {Tok: dataSource(vpcMod, "getNatIps")},
			"alicloud_vpc_traffic_mirror_filters": {Tok: dataSource(vpcMod, "getTrafficMirrorFilters")},
			"alicloud_vpc_traffic_mirror_filter_egress_rules": {
				Tok: dataSource(vpcMod, "getTrafficMirrorFilterEgressRules"),
			},
			"alicloud_vpc_traffic_mirror_filter_ingress_rules": {
				Tok: dataSource(vpcMod, "getTrafficMirrorFilterIngressRules"),
			},
			"alicloud_vpc_bgp_groups":                         {Tok: dataSource(vpcMod, "getBgpGroups")},
			"alicloud_vpc_bgp_networks":                       {Tok: dataSource(vpcMod, "getBgpNetworks")},
			"alicloud_vpc_bgp_peers":                          {Tok: dataSource(vpcMod, "getBgpPeers")},
			"alicloud_vpc_ipv4_gateways":                      {Tok: dataSource(vpcMod, "getIpv4Gateways")},
			"alicloud_vpc_ipv6_addresses":                     {Tok: dataSource(vpcMod, "getIpv6Addresses")},
			"alicloud_vpc_ipv6_egress_rules":                  {Tok: dataSource(vpcMod, "getIpv6EgressRules")},
			"alicloud_vpc_ipv6_gateways":                      {Tok: dataSource(vpcMod, "getIpv6Gateways")},
			"alicloud_vpc_ipv6_internet_bandwidths":           {Tok: dataSource(vpcMod, "getIpv6InternetBandwidths")},
			"alicloud_vpc_peer_connections":                   {Tok: dataSource(vpcMod, "getPeerConnections")},
			"alicloud_vpc_prefix_lists":                       {Tok: dataSource(vpcMod, "getPrefixLists")},
			"alicloud_vpc_public_ip_address_pool_cidr_blocks": {Tok: dataSource(vpcMod, "getPublicIpAddressPoolCidrBlocks")},
			"alicloud_vpc_public_ip_address_pools":            {Tok: dataSource(vpcMod, "getPublicIpAddressPools")},
			"alicloud_vpc_traffic_mirror_service":             {Tok: dataSource(vpcMod, "getTrafficMirrorService")},
			"alicloud_vpc_traffic_mirror_sessions":            {Tok: dataSource(vpcMod, "getTrafficMirrorSessions")},

			// Vod
			"alicloud_vod_domains": {Tok: dataSource(vodMod, "getDomains")},

			// Video Surveillance
			"alicloud_vs_service":                       {Tok: dataSource(vsMod, "getService")},
			"alicloud_video_surveillance_system_groups": {Tok: dataSource(vsMod, "getSystemGroups")},

			// Vpn
			"alicloud_ssl_vpn_client_certs":        {Tok: dataSource(vpcMod, "getSslVpnClientCerts")},
			"alicloud_ssl_vpn_servers":             {Tok: dataSource(vpcMod, "getSslVpnServers")},
			"alicloud_vpn_connections":             {Tok: dataSource(vpnMod, "getConnections")},
			"alicloud_vpn_customer_gateways":       {Tok: dataSource(vpnMod, "getCustomerGateways")},
			"alicloud_vpn_gateway_vco_routes":      {Tok: dataSource(vpnMod, "getGatewayVcoRoutes")},
			"alicloud_vpn_gateway_vpn_attachments": {Tok: dataSource(vpnMod, "getGatewayVpnAttachments")},
			"alicloud_vpn_gateways":                {Tok: dataSource(vpnMod, "getGateways")},
			"alicloud_vpn_ipsec_servers":           {Tok: dataSource(vpcMod, "getIpsecServers")},
			"alicloud_vpn_pbr_route_entries":       {Tok: dataSource(vpcMod, "getPbrRouteEntries")},
			"alicloud_vswitches":                   {Tok: dataSource(vpcMod, "getSwitches")},

			// Yundun
			"alicloud_yundun_bastionhost_instances": {
				Tok:  dataSource(yundunMod, "getBastionHostInstances"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"alicloud_yundun_dbaudit_instance": {
				Tok:  dataSource(yundunMod, "getDBAuditInstance"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},

			// Adb
			"alicloud_adb_db_cluster_lake_versions": {Tok: dataSource(adbMod, "getDBClusterLakeVersions")},
			"alicloud_adb_db_clusters":              {Tok: dataSource(adbMod, "getDBClusters")},
			"alicloud_adb_resource_groups":          {Tok: dataSource(adbMod, "getResourceGroups")},
			"alicloud_adb_zones":                    {Tok: dataSource(adbMod, "getZones")},
			"alicloud_adb_clusters":                 {Tok: dataSource(adbMod, "getClusters")},

			// Waf
			"alicloud_waf_domains":      {Tok: dataSource(wafMod, "getDomains")},
			"alicloud_waf_instances":    {Tok: dataSource(wafMod, "getInstances")},
			"alicloud_waf_certificates": {Tok: dataSource(wafMod, "getCertificates")},
		},
		IgnoreMappings: []string{
			"alicloud_cms_monitor_group_instances",
			"alicloud_dataworks_service",
		},
		SkipExamples: func(args tfbridge.SkipExamplesArgs) bool {
			// Blocked by https://github.com/pulumi/pulumi/issues/13886
			return args.Token == "alicloud:fc/service:Service" || args.Token == "alicloud:fc/v2Function:V2Function"
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
			},

			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,

			PyProject: struct{ Enabled bool }{true},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", alicloudPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				alicloudPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},

		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
	}
	prov.RenameResourceWithAlias("alicloud_ddosbgp_instance", resource(dnsMod, "DdosBgpInstance"),
		resource(ddosMod, "DdosBgpInstance"), dnsMod, ddosMod, nil)
	prov.RenameResourceWithAlias("alicloud_ddoscoo_instance", resource(dnsMod, "DdosCooInstance"),
		resource(ddosMod, "DdosCooInstance"), dnsMod, ddosMod, nil)

	prov.RenameDataSource("alicloud_ots_instance_attachments", dataSource(ossMod, "getInstanceAttachments"),
		dataSource(otsMod, "getInstanceAttachments"), ossMod, otsMod, nil)
	prov.RenameDataSource("alicloud_ots_instances", dataSource(ossMod, "getInstances"),
		dataSource(otsMod, "getInstances"), ossMod, otsMod, nil)
	prov.RenameDataSource("alicloud_ots_tables", dataSource(ossMod, "getTables"),
		dataSource(otsMod, "getTables"), ossMod, otsMod, nil)

	strat, err := fallbackstrat.MappedModulesWithInferredFallback(&prov, "alicloud_", "", mappedMods,
		func(mod, name string) (string, error) {
			return resource(mod, name).String(), nil
		})
	if err != nil {
		panic(err)
	}
	prov.MustComputeTokens(strat)

	prov.SetAutonaming(255, "-")

	prov.MustApplyAutoAliases()

	return prov
}

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(
		defaults,
		removeContent(versionNote, "index.html.markdown"),
		removeContent(configurationSource, "index.html.markdown"),
		skipUserAgentSection,
	)
}

// Removes a User Agent section that includes TF User Agent instructions.
var skipUserAgentSection = tfbridge.DocsEdit{
	Path: "index.html.markdown",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
			return headerText == "Custom User-Agent Information"
		})
	},
}

// Removes a reference to TF version and compatibility
var (
	versionNote         = []byte("-> **Note:** From version 1.50.0, the provider start to support Terraform 0.12.x.")
	configurationSource = []byte("* `configuration_source` - (Optional, Available since 1.56.0) Use a string to " +
		"mark a configuration file source, like `terraform-alicloud-modules/terraform-alicloud-ecs-instance` or " +
		"`terraform-provider-alicloud/examples/vpc`.\nThe length should not more than 128(Before 1.207.2, it " +
		"should not more than 64). Since the version 1.145.0, it supports to be set by environment variable " +
		"`TF_APPEND_USER_AGENT`. See `Custom User-Agent Information`.")
)

// Helper func to remove a content byte from a file
func removeContent(text []byte, path string) tfbridge.DocsEdit {
	return tfbridge.DocsEdit{
		Path: path,
		Edit: func(_ string, content []byte) ([]byte, error) {
			contentSplit := bytes.Split(content, text)
			content = bytes.Join(contentSplit, []byte(" "))
			return content, nil
		},
	}
}

//go:embed cmd/pulumi-resource-alicloud/bridge-metadata.json
var metadata []byte
