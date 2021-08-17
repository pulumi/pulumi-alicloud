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
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	"github.com/aliyun/terraform-provider-alicloud/alicloud"
	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/pulumi/pulumi-alicloud/provider/v3/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the AliCloud token components used below.
const (
	// packages:
	alicloudPkg = "alicloud"
	// modules:
	alicloudMod            = "index"
	actionTrailMod         = "ActionTrail"
	adbMod                 = "Adb"
	albMod                 = "Alb"
	aliKafaMod             = "AliKafka"
	amqpMod                = "Amqp"
	apiGatewayMod          = "ApiGateway"
	armsMod                = "Arms"
	brainMod               = "Brain"
	casMod                 = "Cas"
	cassandraMod           = "Cassandra"
	cdnMod                 = "Cdn"
	cenMod                 = "Cen"
	cloudConnectMod        = "CloudConnect"
	cloudFirewallMod       = "CloudFirewall"
	cloudStorageGatewayMod = "CloudStorageGateway"
	cmsMod                 = "Cms"
	cfgMod                 = "Cfg"
	crMod                  = "CR"
	csMod                  = "CS"
	datahubMod             = "Datahub"
	dataWorksMod           = "DataWorks"
	dcdnMod                = "Dcdn"
	ddsMod                 = "Dds"
	ddosMod                = "Ddos"
	directMailMod          = "DirectMail"
	dmsMod                 = "Dms"
	dnsMod                 = "Dns"
	drdsMod                = "Drds"
	eciMod                 = "Eci"
	ecpMod                 = "Ecp"
	ecsMod                 = "Ecs"
	edasMod                = "Edas"
	edsMod                 = "Eds"
	eipAnyCastMod          = "EipAnycast"
	elasticsearchMod       = "ElasticSearch"
	emrMod                 = "Emr"
	essMod                 = "Ess"
	eventBridgeMod         = "EventBridge"
	fcMod                  = "FC"
	fnfMod                 = "FNF"
	gaMod                  = "Ga"
	gpdbMod                = "Gpdb"
	hbaseMod               = "Hbase"
	hbrMod                 = "Hbr"
	iotMod                 = "Iot"
	kmsMod                 = "Kms"
	kvstoreMod             = "KVStore"
	logMod                 = "Log"
	marketPlaceMod         = "MarketPlace"
	maxComputeMod          = "MaxCompute"
	mongoDbMod             = "MongoDB"
	mnsMod                 = "Mns"
	mseMod                 = "Mse"
	nasMod                 = "Nas"
	oosMod                 = "Oos"
	ossMod                 = "Oss"
	otsMod                 = "Ots"
	polarDbMod             = "PolarDB"
	privateLinkMod         = "PrivateLink"
	pvtzMod                = "Pvtz"
	quotasMod              = "Quotas"
	ramMod                 = "Ram"
	resourceManagerMod     = "ResourceManager"
	rocketMqMod            = "RocketMQ"
	rosMod                 = "Ros"
	rdsMod                 = "Rds"
	saeMod                 = "Sae"
	sagMod                 = "Sag"
	scdnMod                = "Scdn"
	slbMod                 = "Slb"
	tsdbMod                = "Tsdb"
	vpcMod                 = "Vpc"
	vsMod                  = "VideoSurveillance"
	vpnMod                 = "Vpn"
	wafMod                 = "Waf"
	yundunMod              = "Yundun"
)

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
		P:           p,
		Name:        "alicloud",
		Description: "A Pulumi package for creating and managing AliCloud resources.",
		Keywords:    []string{"pulumi", "alicloud"},
		Homepage:    "https://pulumi.io",
		License:     "Apache-2.0",
		GitHubOrg:   "aliyun",
		Repository:  "https://github.com/pulumi/pulumi-alicloud",
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
			// ActionTrail
			"alicloud_actiontrail_trail": {Tok: resource(actionTrailMod, "Trail")},
			"alicloud_actiontrail": {
				Tok:                resource(actionTrailMod, "TrailDeprecated"),
				DeprecationMessage: "Resource renamed to `Trail`",
			},

			// Adb
			"alicloud_adb_account":       {Tok: resource(adbMod, "Account")},
			"alicloud_adb_backup_policy": {Tok: resource(adbMod, "BackupPolicy")},
			"alicloud_adb_cluster":       {Tok: resource(adbMod, "Cluster")},
			"alicloud_adb_connection":    {Tok: resource(adbMod, "Connection")},
			"alicloud_adb_db_cluster":    {Tok: resource(adbMod, "DBCluster")},

			// Alb
			"alicloud_alb_security_policy": {Tok: resource(albMod, "SecurityPolicy")},
			"alicloud_alb_server_group":    {Tok: resource(albMod, "ServerGroup")},

			// AliKafka
			"alicloud_alikafka_consumer_group": {Tok: resource(aliKafaMod, "ConsumerGroup")},
			"alicloud_alikafka_instance":       {Tok: resource(aliKafaMod, "Instance")},
			"alicloud_alikafka_sasl_acl":       {Tok: resource(aliKafaMod, "SaslAcl")},
			"alicloud_alikafka_sasl_user":      {Tok: resource(aliKafaMod, "SaslUser")},
			"alicloud_alikafka_topic": {
				Tok: resource(aliKafaMod, "Topic"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"topic": {
						CSharpName: "TopicName",
					},
				},
			},

			// amqp
			"alicloud_amqp_virtual_host": {Tok: resource(amqpMod, "VirtualHost")},
			"alicloud_amqp_queue":        {Tok: resource(amqpMod, "Queue")},
			"alicloud_amqp_instance":     {Tok: resource(amqpMod, "Instance")},
			"alicloud_amqp_exchange":     {Tok: resource(amqpMod, "Exchange")},

			// Api Gateway
			"alicloud_api_gateway_group":          {Tok: resource(apiGatewayMod, "Group")},
			"alicloud_api_gateway_api":            {Tok: resource(apiGatewayMod, "Api")},
			"alicloud_api_gateway_app":            {Tok: resource(apiGatewayMod, "App")},
			"alicloud_api_gateway_app_attachment": {Tok: resource(apiGatewayMod, "AppAttachment")},
			"alicloud_api_gateway_vpc_access":     {Tok: resource(apiGatewayMod, "VpcAccess")},

			// Arms
			"alicloud_arms_alert_contact":       {Tok: resource(armsMod, "AlertContact")},
			"alicloud_arms_alert_contact_group": {Tok: resource(armsMod, "AlertContactGroup")},

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

			//CDN
			"alicloud_cdn_domain":        {Tok: resource(cdnMod, "Domain")},
			"alicloud_cdn_domain_config": {Tok: resource(cdnMod, "DomainConfig")},
			"alicloud_cdn_domain_new":    {Tok: resource(cdnMod, "DomainNew")},

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
			"alicloud_cen_instance":                     {Tok: resource(cenMod, "Instance")},
			"alicloud_cen_instance_attachment":          {Tok: resource(cenMod, "InstanceAttachment")},
			"alicloud_cen_route_entry":                  {Tok: resource(cenMod, "RouteEntry")},
			"alicloud_cen_instance_grant":               {Tok: resource(cenMod, "InstanceGrant")},
			"alicloud_cen_flowlog":                      {Tok: resource(cenMod, "FlowLog")},
			"alicloud_cen_route_map":                    {Tok: resource(cenMod, "RouteMap")},
			"alicloud_cen_private_zone":                 {Tok: resource(cenMod, "PrivateZone")},
			"alicloud_cen_vbr_health_check":             {Tok: resource(cenMod, "VbrHealthCheck")},
			"alicloud_cen_route_service":                {Tok: resource(cenMod, "RouteService")},
			"alicloud_cen_transit_router":               {Tok: resource(cenMod, "TransitRouter")},
			"alicloud_cen_transit_router_route_table":   {Tok: resource(cenMod, "TransitRouterRouteTable")},
			"alicloud_cen_transit_router_route_table_association": {
				Tok: resource(cenMod, "TransitRouterRouteTableAssociation"),
			},
			"alicloud_cen_transit_router_route_table_propagation": {
				Tok: resource(cenMod, "TransitRouterRouteTablePropagation"),
			},
			"alicloud_cen_transit_router_route_entry":     {Tok: resource(cenMod, "TransitRouterRouteEntry")},
			"alicloud_cen_transit_router_vbr_attachment":  {Tok: resource(cenMod, "TransitRouterVbrAttachment")},
			"alicloud_cen_transit_router_vpc_attachment":  {Tok: resource(cenMod, "TransitRouterVpcAttachment")},
			"alicloud_cen_transit_router_peer_attachment": {Tok: resource(cenMod, "TransitRouterPeerAttachment")},

			// CloudConnect
			"alicloud_cloud_connect_network":            {Tok: resource(cloudConnectMod, "Network")},
			"alicloud_cloud_connect_network_attachment": {Tok: resource(cloudConnectMod, "NetworkAttachment")},
			"alicloud_cloud_connect_network_grant":      {Tok: resource(cloudConnectMod, "NetworkGrant")},

			// CloudFirewall
			"alicloud_cloud_firewall_control_policy":       {Tok: resource(cloudFirewallMod, "ControlPolicy")},
			"alicloud_cloud_firewall_control_policy_order": {Tok: resource(cloudFirewallMod, "ControlPolicyOrder")},

			// CloudStorageGateway
			"alicloud_cloud_storage_gateway_storage_bundle": {Tok: resource(cloudStorageGatewayMod, "StorageBundle")},

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

			// Config
			"alicloud_config_configuration_recorder":    {Tok: resource(cfgMod, "ConfigurationRecorder")},
			"alicloud_config_delivery_channel":          {Tok: resource(cfgMod, "DeliveryChannel")},
			"alicloud_config_rule":                      {Tok: resource(cfgMod, "Rule")},
			"alicloud_config_aggregate_compliance_pack": {Tok: resource(cfgMod, "AggregateCompliancePack")},
			"alicloud_config_aggregate_config_rule":     {Tok: resource(cfgMod, "AggregateConfigRule")},
			"alicloud_config_aggregator":                {Tok: resource(cfgMod, "Aggregator")},
			"alicloud_config_compliance_pack":           {Tok: resource(cfgMod, "CompliancePack")},

			// CR
			"alicloud_cr_repo":        {Tok: resource(crMod, "Repo")},
			"alicloud_cr_namespace":   {Tok: resource(crMod, "Namespace")},
			"alicloud_cr_ee_instance": {Tok: resource(crMod, "RegistryEnterpriseInstance")},

			// CS
			"alicloud_container_cluster":         {Tok: resource(csMod, "Cluster")},
			"alicloud_cs_application":            {Tok: resource(csMod, "Application")},
			"alicloud_cs_kubernetes":             {Tok: resource(csMod, "Kubernetes")},
			"alicloud_cs_swarm":                  {Tok: resource(csMod, "Swarm")},
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

			// DataHub
			"alicloud_datahub_project":      {Tok: resource(datahubMod, "Project")},
			"alicloud_datahub_subscription": {Tok: resource(datahubMod, "Subscription")},
			"alicloud_datahub_topic":        {Tok: resource(datahubMod, "Topic")},

			// Dataworks
			"alicloud_data_works_folder": {Tok: resource(dataWorksMod, "Folder")},

			// DB
			"alicloud_db_account":                         {Tok: resource(rdsMod, "Account")},
			"alicloud_db_account_privilege":               {Tok: resource(rdsMod, "AccountPrivilege")},
			"alicloud_db_backup_policy":                   {Tok: resource(rdsMod, "BackupPolicy")},
			"alicloud_db_connection":                      {Tok: resource(rdsMod, "Connection")},
			"alicloud_db_database":                        {Tok: resource(rdsMod, "Database")},
			"alicloud_db_instance":                        {Tok: resource(rdsMod, "Instance")},
			"alicloud_db_read_write_splitting_connection": {Tok: resource(rdsMod, "ReadWriteSplittingConnection")},
			"alicloud_db_readonly_instance":               {Tok: resource(rdsMod, "ReadOnlyInstance")},
			"alicloud_rds_parameter_group":                {Tok: resource(rdsMod, "RdsParameterGroup")},
			"alicloud_rds_account":                        {Tok: resource(rdsMod, "RdsAccount")},

			// DCDN
			"alicloud_dcdn_domain":        {Tok: resource(dcdnMod, "Domain")},
			"alicloud_dcdn_domain_config": {Tok: resource(dcdnMod, "DomainConfig")},

			// DDOS
			"alicloud_ddoscoo_scheduler_rule":  {Tok: resource(ddosMod, "SchedulerRule")},
			"alicloud_ddoscoo_domain_resource": {Tok: resource(ddosMod, "DomainResource")},
			"alicloud_ddoscoo_port":            {Tok: resource(ddosMod, "Port")},

			// Direct Mail
			"alicloud_direct_mail_receivers": {Tok: resource(directMailMod, "Receivers")},

			// DMS
			"alicloud_dms_enterprise_instance": {Tok: resource(dmsMod, "EnterpriseInstance")},
			"alicloud_dms_enterprise_user":     {Tok: resource(dmsMod, "EnterpriseUser")},

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

			// Drds
			"alicloud_drds_instance": {Tok: resource(drdsMod, "Instance")},

			// Eci
			"alicloud_eci_openapi_image_cache": {Tok: resource(eciMod, "OpenApiImageCache")},
			"alicloud_eci_image_cache":         {Tok: resource(eciMod, "ImageCache")},
			"alicloud_eci_container_group":     {Tok: resource(eciMod, "ContainerGroup")},

			// Ecp
			"alicloud_ecp_key_pair": {Tok: resource(ecpMod, "KeyPair")},

			// ECS
			"alicloud_auto_provisioning_group": {Tok: resource(ecsMod, "AutoProvisioningGroup")},
			"alicloud_disk":                    {Tok: resource(ecsMod, "Disk")},
			"alicloud_disk_attachment":         {Tok: resource(ecsMod, "DiskAttachment")},
			"alicloud_launch_template":         {Tok: resource(ecsMod, "LaunchTemplate")},
			"alicloud_eip": {
				Tok:                resource(ecsMod, "Eip"),
				DeprecationMessage: "This resource has been deprecated in favour of the EipAddress resource",
			},
			"alicloud_eip_address":            {Tok: resource(ecsMod, "EipAddress")},
			"alicloud_eip_association":        {Tok: resource(ecsMod, "EipAssociation")},
			"alicloud_instance":               {Tok: resource(ecsMod, "Instance")},
			"alicloud_key_pair":               {Tok: resource(ecsMod, "KeyPair")},
			"alicloud_key_pair_attachment":    {Tok: resource(ecsMod, "KeyPairAttachment")},
			"alicloud_image":                  {Tok: resource(ecsMod, "Image")},
			"alicloud_image_copy":             {Tok: resource(ecsMod, "ImageCopy")},
			"alicloud_image_export":           {Tok: resource(ecsMod, "ImageExport")},
			"alicloud_image_share_permission": {Tok: resource(ecsMod, "ImageSharePermission")},
			"alicloud_security_group":         {Tok: resource(ecsMod, "SecurityGroup")},
			"alicloud_security_group_rule":    {Tok: resource(ecsMod, "SecurityGroupRule")},
			"alicloud_reserved_instance":      {Tok: resource(ecsMod, "ReservedInstance")},
			"alicloud_snapshot":               {Tok: resource(ecsMod, "Snapshot")},
			"alicloud_snapshot_policy":        {Tok: resource(ecsMod, "SnapshotPolicy")},
			"alicloud_copy_image":             {Tok: resource(ecsMod, "CopyImage")},
			"alicloud_image_import":           {Tok: resource(ecsMod, "ImageImport")},
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
			"alicloud_ecs_launch_template":                 {Tok: resource(ecsMod, "EcsLaunchTemplate")},
			"alicloud_ecs_key_pair":                        {Tok: resource(ecsMod, "EcsKeyPair")},
			"alicloud_ecs_key_pair_attachment":             {Tok: resource(ecsMod, "EcsKeyPairAttachment")},
			"alicloud_ecs_auto_snapshot_policy_attachment": {Tok: resource(ecsMod, "EcsAutoSnapshotPolicyAttachment")},
			"alicloud_ecs_disk":                            {Tok: resource(ecsMod, "EcsDisk")},
			"alicloud_ecs_disk_attachment":                 {Tok: resource(ecsMod, "EcsDiskAttachment")},
			"alicloud_ecs_network_interface":               {Tok: resource(ecsMod, "EcsNetworkInterface")},
			"alicloud_ecs_network_interface_attachment":    {Tok: resource(ecsMod, "EcsNetworkInterfaceAttachment")},

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

			// Eds
			"alicloud_ecd_policy_group": {Tok: resource(edsMod, "EcdPolicyGroup")},

			// EipAnycast
			"alicloud_eipanycast_anycast_eip_address":            {Tok: resource(eipAnyCastMod, "AnycastEipAddress")},
			"alicloud_eipanycast_anycast_eip_address_attachment": {Tok: resource(eipAnyCastMod, "AnycastEipAddressAttachment")},

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
			"alicloud_event_bridge_event_bus":    {Tok: resource(eventBridgeMod, "EventBus")},
			"alicloud_event_bridge_schema_group": {Tok: resource(eventBridgeMod, "SchemaGroup")},
			"alicloud_event_bridge_rule":         {Tok: resource(eventBridgeMod, "Rule")},
			"alicloud_event_bridge_slr":          {Tok: resource(eventBridgeMod, "Slr")},
			"alicloud_event_bridge_event_source": {Tok: resource(eventBridgeMod, "EventSource")},

			// FC
			"alicloud_fc_function":                     {Tok: resource(fcMod, "Function")},
			"alicloud_fc_service":                      {Tok: resource(fcMod, "Service")},
			"alicloud_fc_trigger":                      {Tok: resource(fcMod, "Trigger")},
			"alicloud_fc_custom_domain":                {Tok: resource(fcMod, "CustomDomain")},
			"alicloud_fc_function_async_invoke_config": {Tok: resource(fcMod, "FunctionAsyncInvokeConfig")},
			"alicloud_fc_alias":                        {Tok: resource(fcMod, "Alias")},

			// FNF
			"alicloud_fnf_schedule": {Tok: resource(fnfMod, "Schedule")},
			"alicloud_fnf_flow":     {Tok: resource(fnfMod, "Flow")},

			// Ga
			"alicloud_ga_listener":                     {Tok: resource(gaMod, "Listener")},
			"alicloud_ga_accelerator":                  {Tok: resource(gaMod, "Accelerator")},
			"alicloud_ga_bandwidth_package":            {Tok: resource(gaMod, "BandwidthPackage")},
			"alicloud_ga_endpoint_group":               {Tok: resource(gaMod, "EndpointGroup")},
			"alicloud_ga_ip_set":                       {Tok: resource(gaMod, "IpSet")},
			"alicloud_ga_bandwidth_package_attachment": {Tok: resource(gaMod, "BandwidthPackageAttachment")},
			"alicloud_ga_forwarding_rule":              {Tok: resource(gaMod, "ForwardingRule")},

			// Gpdb
			"alicloud_gpdb_connection":       {Tok: resource(gpdbMod, "Connection")},
			"alicloud_gpdb_instance":         {Tok: resource(gpdbMod, "Instance")},
			"alicloud_gpdb_elastic_instance": {Tok: resource(gpdbMod, "ElasticInstance")},

			// Hbase
			"alicloud_hbase_instance": {Tok: resource(hbaseMod, "Instance")},

			// Hbr
			"alicloud_hbr_vault":           {Tok: resource(hbrMod, "Vault")},
			"alicloud_hbr_oss_backup_plan": {Tok: resource(hbrMod, "OssBackupPlan")},

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

			// Log
			"alicloud_log_machine_group":  {Tok: resource(logMod, "MachineGroup")},
			"alicloud_log_project":        {Tok: resource(logMod, "Project")},
			"alicloud_log_store":          {Tok: resource(logMod, "Store")},
			"alicloud_log_store_index":    {Tok: resource(logMod, "StoreIndex")},
			"alicloud_logtail_attachment": {Tok: resource(logMod, "LogTailAttachment")},
			"alicloud_logtail_config":     {Tok: resource(logMod, "LogTailConfig")},
			"alicloud_log_alert":          {Tok: resource(logMod, "Alert")},
			"alicloud_log_audit":          {Tok: resource(logMod, "Audit")},
			"alicloud_log_dashboard":      {Tok: resource(logMod, "Dashboard")},
			"alicloud_log_etl":            {Tok: resource(logMod, "Etl")},
			"alicloud_log_oss_shipper":    {Tok: resource(logMod, "OssShipper")},

			// Marketplace
			"alicloud_market_order": {Tok: resource(marketPlaceMod, "Order")},

			// MaxCompute
			"alicloud_maxcompute_project": {Tok: resource(maxComputeMod, "Project")},

			// MongoDb
			"alicloud_mongodb_instance":          {Tok: resource(mongoDbMod, "Instance")},
			"alicloud_mongodb_sharding_instance": {Tok: resource(mongoDbMod, "ShardingInstance")},

			// Mns
			"alicloud_mns_queue":              {Tok: resource(mnsMod, "Queue")},
			"alicloud_mns_topic":              {Tok: resource(mnsMod, "Topic")},
			"alicloud_mns_topic_subscription": {Tok: resource(mnsMod, "TopicSubscription")},

			// Mse
			"alicloud_mse_cluster": {Tok: resource(mseMod, "Cluster")},

			// Nas
			"alicloud_nas_access_group": {Tok: resource(nasMod, "AccessGroup")},
			"alicloud_nas_access_rule":  {Tok: resource(nasMod, "AccessRule")},
			"alicloud_nas_file_system":  {Tok: resource(nasMod, "FileSystem")},
			"alicloud_nas_mount_target": {Tok: resource(nasMod, "MountTarget")},

			// Oos
			"alicloud_oos_template":  {Tok: resource(oosMod, "Template")},
			"alicloud_oos_execution": {Tok: resource(oosMod, "Execution")},

			// Oss
			"alicloud_oss_bucket": {
				Tok: resource(ossMod, "Bucket"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"bucket": {
						CSharpName: "BucketName",
					},
				},
			},
			"alicloud_oss_bucket_object":       {Tok: resource(ossMod, "BucketObject")},
			"alicloud_ots_instance":            {Tok: resource(otsMod, "Instance")},
			"alicloud_ots_instance_attachment": {Tok: resource(otsMod, "InstanceAttachment")},
			"alicloud_ots_table":               {Tok: resource(otsMod, "Table")},

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
			"alicloud_polardb_backup_policy":    {Tok: resource(polarDbMod, "BackupPolicy")},
			"alicloud_polardb_cluster":          {Tok: resource(polarDbMod, "Cluster")},
			"alicloud_polardb_database":         {Tok: resource(polarDbMod, "Database")},
			"alicloud_polardb_endpoint_address": {Tok: resource(polarDbMod, "EndpointAddress")},
			"alicloud_polardb_endpoint":         {Tok: resource(polarDbMod, "Endpoint")},

			// Pvtz
			"alicloud_pvtz_zone":            {Tok: resource(pvtzMod, "Zone")},
			"alicloud_pvtz_zone_attachment": {Tok: resource(pvtzMod, "ZoneAttachment")},
			"alicloud_pvtz_zone_record":     {Tok: resource(pvtzMod, "ZoneRecord")},

			// Quotas
			"alicloud_quotas_application_info":  {Tok: resource(quotasMod, "ApplicationInfo")},
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
			"alicloud_ram_alias":                   {Tok: resource(ramMod, "Alias")},
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

			// RocketMQ
			"alicloud_ons_group":    {Tok: resource(rocketMqMod, "Group")},
			"alicloud_ons_instance": {Tok: resource(rocketMqMod, "Instance")},
			"alicloud_ons_topic": {
				Tok: resource(rocketMqMod, "Topic"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"topic": {
						CSharpName: "TopicDeprecated",
					},
				},
			},

			// ros
			"alicloud_ros_change_set":  {Tok: resource(rosMod, "ChangeSet")},
			"alicloud_ros_stack_group": {Tok: resource(rosMod, "StackGroup")},
			"alicloud_ros_stack":       {Tok: resource(rosMod, "Stack")},
			"alicloud_ros_template":    {Tok: resource(rosMod, "Template")},

			// Sae
			"alicloud_sae_namespace":  {Tok: resource(saeMod, "Namespace")},
			"alicloud_sae_config_map": {Tok: resource(saeMod, "ConfigMap")},

			// Sag
			"alicloud_sag_acl":         {Tok: resource(rocketMqMod, "Acl")},
			"alicloud_sag_acl_rule":    {Tok: resource(rocketMqMod, "AclRule")},
			"alicloud_sag_client_user": {Tok: resource(rocketMqMod, "ClientUser")},
			"alicloud_sag_dnat_entry":  {Tok: resource(rocketMqMod, "DnatEntry")},
			"alicloud_sag_qos":         {Tok: resource(rocketMqMod, "Qos")},
			"alicloud_sag_qos_car":     {Tok: resource(rocketMqMod, "QosCar")},
			"alicloud_sag_qos_policy":  {Tok: resource(rocketMqMod, "QosPolicy")},
			"alicloud_sag_snat_entry":  {Tok: resource(rocketMqMod, "SnatEntry")},

			// Scdn
			"alicloud_scdn_domain_config": {Tok: resource(scdnMod, "DomainConfig")},
			"alicloud_scdn_domain":        {Tok: resource(scdnMod, "Domain")},

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
			"alicloud_slb_load_balancer": {Tok: resource(slbMod, "ApplicationLoadBalancer")},

			// Tsdb
			"alicloud_tsdb_instance": {Tok: resource(tsdbMod, "Instance")},

			// VPC
			"alicloud_subnet":                       {Tok: resource(vpcMod, "Subnet")},
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
			"alicloud_route_entry":                         {Tok: resource(vpcMod, "RouteEntry")},
			"alicloud_route_table":                         {Tok: resource(vpcMod, "RouteTable")},
			"alicloud_route_table_attachment":              {Tok: resource(vpcMod, "RouteTableAttachment")},
			"alicloud_router_interface":                    {Tok: resource(vpcMod, "RouterInterface")},
			"alicloud_router_interface_connection":         {Tok: resource(vpcMod, "RouterInterfaceConnection")},
			"alicloud_nat_gateway":                         {Tok: resource(vpcMod, "NatGateway")},
			"alicloud_forward_entry":                       {Tok: resource(vpcMod, "ForwardEntry")},
			"alicloud_havip":                               {Tok: resource(vpcMod, "HAVip")},
			"alicloud_havip_attachment":                    {Tok: resource(vpcMod, "HAVipAttachment")},
			"alicloud_common_bandwidth_package":            {Tok: resource(vpcMod, "CommonBandwithPackage")},
			"alicloud_common_bandwidth_package_attachment": {Tok: resource(vpcMod, "CommonBandwithPackageAttachment")},
			"alicloud_vpc_flow_log":                        {Tok: resource(vpcMod, "FlowLog")},

			// VPN
			"alicloud_ssl_vpn_client_cert":  {Tok: resource(vpnMod, "SslVpnClientCert")},
			"alicloud_ssl_vpn_server":       {Tok: resource(vpnMod, "SslVpnServer")},
			"alicloud_vpn_connection":       {Tok: resource(vpnMod, "Connection")},
			"alicloud_vpn_customer_gateway": {Tok: resource(vpnMod, "CustomerGateway")},
			"alicloud_vpn_gateway":          {Tok: resource(vpnMod, "Gateway")},
			"alicloud_vpn_route_entry":      {Tok: resource(vpnMod, "RouteEntry")},

			// Waf
			"alicloud_waf_domain": {
				Tok: resource(wafMod, "Domain"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"domain": {
						CSharpName: "DomainDeprecated",
					},
				},
			},
			"alicloud_waf_instance": {Tok: resource(wafMod, "Instance")},

			// Yundun
			"alicloud_yundun_bastionhost_instance": {Tok: resource(yundunMod, "BastionHostInstance")},
			"alicloud_yundun_dbaudit_instance":     {Tok: resource(yundunMod, "DBAuditInstance")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"alicloud_account":             {Tok: dataSource(alicloudMod, "getAccount")},
			"alicloud_zones":               {Tok: dataSource(alicloudMod, "getZones")},
			"alicloud_regions":             {Tok: dataSource(alicloudMod, "getRegions")},
			"alicloud_caller_identity":     {Tok: dataSource(alicloudMod, "getCallerIdentity")},
			"alicloud_file_crc64_checksum": {Tok: dataSource(alicloudMod, "getFileCrc64Checksum")},

			// ActionTrail
			"alicloud_actiontrails": {
				Tok:                dataSource(actionTrailMod, "getTrailsDeprecated"),
				DeprecationMessage: "DataSource has been renamed to `getTrails`",
			},
			"alicloud_actiontrail_trails": {Tok: dataSource(actionTrailMod, "getTrails")},

			// AliKafka
			"alicloud_alikafka_consumer_groups": {Tok: dataSource(actionTrailMod, "getConsumerGroups")},
			"alicloud_alikafka_instances":       {Tok: dataSource(actionTrailMod, "getInstances")},
			"alicloud_alikafka_sasl_acls":       {Tok: dataSource(actionTrailMod, "getSaslAcls")},
			"alicloud_alikafka_sasl_users":      {Tok: dataSource(actionTrailMod, "getSaslUsers")},
			"alicloud_alikafka_topics":          {Tok: dataSource(actionTrailMod, "getTopics")},

			// Alb
			"alicloud_alb_security_policies": {Tok: dataSource(albMod, "getSecurityPolicies")},
			"alicloud_alb_server_groups":     {Tok: dataSource(albMod, "getServerGroups")},

			// amqp
			"alicloud_amqp_virtual_hosts": {Tok: dataSource(amqpMod, "getVirtualHosts")},
			"alicloud_amqp_queues":        {Tok: dataSource(amqpMod, "getQueues")},
			"alicloud_amqp_instances":     {Tok: dataSource(amqpMod, "getInstances")},
			"alicloud_amqp_exchanges":     {Tok: dataSource(amqpMod, "getExchanges")},

			// ApiGateway
			"alicloud_api_gateway_groups":  {Tok: dataSource(apiGatewayMod, "getGroups")},
			"alicloud_api_gateway_apis":    {Tok: dataSource(apiGatewayMod, "getApis")},
			"alicloud_api_gateway_apps":    {Tok: dataSource(apiGatewayMod, "getApps")},
			"alicloud_api_gateway_service": {Tok: dataSource(apiGatewayMod, "getService")},

			// Arms
			"alicloud_arms_alert_contacts":       {Tok: dataSource(armsMod, "getAlertContacts")},
			"alicloud_arms_alert_contact_groups": {Tok: dataSource(armsMod, "getAlertContactGroups")},

			// Brain
			"alicloud_brain_industrial_pid_projects":      {Tok: dataSource(brainMod, "getIndustrialPidProjects")},
			"alicloud_brain_industrial_pid_organizations": {Tok: dataSource(brainMod, "getIndustrialPidOrganizations")},
			"alicloud_brain_industrial_service":           {Tok: dataSource(brainMod, "getIndustrialSerice")},
			"alicloud_brain_industrial_pid_loops":         {Tok: dataSource(brainMod, "getIndustrialPidLoops")},

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

			// Cdn
			"alicloud_cdn_service": {Tok: dataSource(cdnMod, "getService")},

			// Cen
			"alicloud_cen_bandwidth_limits":            {Tok: dataSource(cenMod, "getBandwidthLimits")},
			"alicloud_cen_bandwidth_packages":          {Tok: dataSource(cenMod, "getBandwidthPackages")},
			"alicloud_cen_instances":                   {Tok: dataSource(cenMod, "getInstances")},
			"alicloud_cen_route_entries":               {Tok: dataSource(cenMod, "getRouteEntries")},
			"alicloud_cen_region_route_entries":        {Tok: dataSource(cenMod, "getRegionRouteEntries")},
			"alicloud_cen_flowlogs":                    {Tok: dataSource(cenMod, "getFlowlogs")},
			"alicloud_cen_route_maps":                  {Tok: dataSource(cenMod, "getRouteMaps")},
			"alicloud_cen_private_zones":               {Tok: dataSource(cenMod, "getPrivateZones")},
			"alicloud_cen_instance_attachments":        {Tok: dataSource(cenMod, "getInstanceAttachments")},
			"alicloud_cen_vbr_health_checks":           {Tok: dataSource(cenMod, "getVbrHealthChecks")},
			"alicloud_cen_route_services":              {Tok: dataSource(cenMod, "getRouteServices")},
			"alicloud_cen_transit_routers":             {Tok: dataSource(cenMod, "getTransitRouters")},
			"alicloud_cen_transit_router_route_tables": {Tok: dataSource(cenMod, "getTransitRouterRouteTables")},
			"alicloud_cen_transit_router_route_table_associations": {
				Tok: dataSource(cenMod, "getTransitRouterRouteTableAssociations"),
			},
			"alicloud_cen_transit_router_route_table_propagations": {
				Tok: dataSource(cenMod, "getTransitRouterRouteTablePropagations"),
			},
			"alicloud_cen_transit_router_route_entries":    {Tok: dataSource(cenMod, "getTransitRouterRouteEntries")},
			"alicloud_cen_transit_router_vbr_attachments":  {Tok: dataSource(cenMod, "getTransitRouterVbrAttachments")},
			"alicloud_cen_transit_router_vpc_attachments":  {Tok: dataSource(cenMod, "getTransitRouterVpcAttachments")},
			"alicloud_cen_transit_router_peer_attachments": {Tok: dataSource(cenMod, "getTransitRouterPeerAttachments")},

			// CloudConnect
			"alicloud_cloud_connect_networks": {Tok: dataSource(cloudConnectMod, "getNetworks")},

			// Cloudfirewall
			"alicloud_cloud_firewall_control_policies": {Tok: dataSource(cloudFirewallMod, "getControlPolicies")},

			// CloudStorageGateway
			"alicloud_cloud_storage_gateway_storage_bundles": {
				Tok: dataSource(cloudStorageGatewayMod, "getStorageBundles"),
			},
			"alicloud_cloud_storage_gateway_service": {Tok: dataSource(cloudStorageGatewayMod, "getService")},

			// CMS
			"alicloud_cms_alarm_contacts":            {Tok: dataSource(cmsMod, "getAlarmContacts")},
			"alicloud_cms_alarm_contact_groups":      {Tok: dataSource(cmsMod, "getAlarmContactGroups")},
			"alicloud_cms_group_metric_rules":        {Tok: dataSource(cmsMod, "getGroupMetricRules")},
			"alicloud_cms_service":                   {Tok: dataSource(cmsMod, "getService")},
			"alicloud_cms_monitor_groups":            {Tok: dataSource(cmsMod, "getMonitorGroups")},
			"alicloud_cms_monitor_group_instanceses": {Tok: dataSource(cmsMod, "getMonitorGroupInstances")},

			// Config
			"alicloud_config_configuration_recorders":    {Tok: dataSource(cfgMod, "getConfigurationRecorders")},
			"alicloud_config_delivery_channels":          {Tok: dataSource(cfgMod, "getDeliveryChannels")},
			"alicloud_config_rules":                      {Tok: dataSource(cfgMod, "getRules")},
			"alicloud_config_aggregate_compliance_packs": {Tok: dataSource(cfgMod, "getAggregateCompliancePacks")},
			"alicloud_config_aggregate_config_rules":     {Tok: dataSource(cfgMod, "getAggregateConfigRules")},
			"alicloud_config_aggregators":                {Tok: dataSource(cfgMod, "getAggregators")},
			"alicloud_config_compliance_packs":           {Tok: dataSource(cfgMod, "getCompliancePacks")},

			// Cr
			"alicloud_cr_namespaces": {Tok: dataSource(crMod, "getNamespaces")},
			"alicloud_cr_repos":      {Tok: dataSource(crMod, "getRepos")},
			"alicloud_cr_service":    {Tok: dataSource(crMod, "getService")},

			// Cs
			"alicloud_cs_kubernetes_clusters":            {Tok: dataSource(csMod, "getKubernetesClusters")},
			"alicloud_cs_edge_kubernetes_clusters":       {Tok: dataSource(csMod, "getEdgeKubernetesClusters")},
			"alicloud_cs_managed_kubernetes_clusters":    {Tok: dataSource(csMod, "getManagedKubernetesClusters")},
			"alicloud_cs_serverless_kubernetes_clusters": {Tok: dataSource(csMod, "getServerlessKubernetesClusters")},
			"alicloud_cr_ee_instances":                   {Tok: dataSource(csMod, "getRegistryEnterpriseInstances")},
			"alicloud_cr_ee_namespaces":                  {Tok: dataSource(csMod, "getRegistryEnterpriseNamespaces")},
			"alicloud_cr_ee_repos":                       {Tok: dataSource(csMod, "getRegistryEnterpriseRepos")},
			"alicloud_cr_ee_sync_rules":                  {Tok: dataSource(csMod, "getRegistryEnterpriseSyncRules")},
			"alicloud_ack_service":                       {Tok: dataSource(csMod, "getAckService")},
			"alicloud_cs_kubernetes_permissions":         {Tok: dataSource(csMod, "getKubernetesPermission")},

			// Datahub
			"alicloud_datahub_service": {Tok: dataSource(datahubMod, "getService")},

			// DataWorks
			"alicloud_dataworks_service":  {Tok: dataSource(dataWorksMod, "getService")},
			"alicloud_data_works_folders": {Tok: dataSource(dataWorksMod, "getFolders")},

			// Dcdn
			"alicloud_dcdn_domains": {Tok: dataSource(dcdnMod, "getDomains")},
			"alicloud_dcdn_service": {Tok: dataSource(dcdnMod, "getService")},

			// Dds
			"alicloud_mongo_instances": {Tok: dataSource(ddsMod, "getMongoInstances")},

			// Ddos
			"alicloud_ddoscoo_instances":        {Tok: dataSource(ddosMod, "getDdosCooInstances")},
			"alicloud_ddosbgp_instances":        {Tok: dataSource(ddosMod, "getDdosBgpInstances")},
			"alicloud_ddoscoo_domain_resources": {Tok: dataSource(ddosMod, "getDdosCooDomainResources")},
			"alicloud_ddoscoo_ports":            {Tok: dataSource(ddosMod, "getDdosCooPorts")},

			// Direct Mail
			"alicloud_direct_mail_receiverses": {Tok: dataSource(directMailMod, "getReceivers")},

			// Dms
			"alicloud_dms_enterprise_instances": {Tok: dataSource(dmsMod, "getEnterpriseInstances")},
			"alicloud_dms_enterprise_users":     {Tok: dataSource(dmsMod, "getEnterpriseUsers")},

			// Dns
			"alicloud_dns_domain_groups":    {Tok: dataSource(dnsMod, "getDomainGroups")},
			"alicloud_dns_domain_records":   {Tok: dataSource(dnsMod, "getDomainRecords")},
			"alicloud_dns_domains":          {Tok: dataSource(dnsMod, "getDomains")},
			"alicloud_dns_groups":           {Tok: dataSource(dnsMod, "getGroups")},
			"alicloud_dns_records":          {Tok: dataSource(dnsMod, "getRecords")},
			"alicloud_dns_resolution_lines": {Tok: dataSource(dnsMod, "getResolutionLines")},
			"alicloud_dns_domain_txt_guid":  {Tok: dataSource(dnsMod, "getDomainTxtGuid")},
			"alicloud_dns_instances":        {Tok: dataSource(dnsMod, "getInstances")},
			"alicloud_alidns_domain_groups": {Tok: dataSource(dnsMod, "getAlidnsDomainGroups")},
			"alicloud_alidns_records":       {Tok: dataSource(dnsMod, "getAlidnsRecords")},
			"alicloud_alidns_domains":       {Tok: dataSource(dnsMod, "getAlidnsDomains")},
			"alicloud_alidns_instances":     {Tok: dataSource(dnsMod, "getAlidnsInstances")},

			// Drds
			"alicloud_drds_instances": {Tok: dataSource(drdsMod, "getInstances")},

			// Eci
			"alicloud_eci_image_caches":     {Tok: dataSource(eciMod, "getImageCaches")},
			"alicloud_eci_container_groups": {Tok: dataSource(eciMod, "getContainerGroups")},

			// Ecp
			"alicloud_ecp_key_pairs": {Tok: dataSource(ecpMod, "getKeyPairs")},

			// Ecs
			"alicloud_images":               {Tok: dataSource(ecsMod, "getImages")},
			"alicloud_instance_types":       {Tok: dataSource(ecsMod, "getInstanceTypes")},
			"alicloud_instances":            {Tok: dataSource(ecsMod, "getInstances")},
			"alicloud_key_pairs":            {Tok: dataSource(ecsMod, "getKeyPairs")},
			"alicloud_security_group_rules": {Tok: dataSource(ecsMod, "getSecurityGroupRules")},
			"alicloud_security_groups":      {Tok: dataSource(ecsMod, "getSecurityGroups")},
			"alicloud_disks":                {Tok: dataSource(ecsMod, "getDisks")},
			"alicloud_eips": {
				Tok:                dataSource(ecsMod, "getEips"),
				DeprecationMessage: "This function has been deprecated in favour of the getEipAddresses function",
			},
			"alicloud_eip_addresses":              {Tok: dataSource(ecsMod, "getEipAddresses")},
			"alicloud_instance_type_families":     {Tok: dataSource(ecsMod, "getInstanceTypeFamilies")},
			"alicloud_network_interfaces":         {Tok: dataSource(ecsMod, "getNetworkInterfaces")},
			"alicloud_snapshots":                  {Tok: dataSource(ecsMod, "getSnapshots")},
			"alicloud_ecs_dedicated_hosts":        {Tok: dataSource(ecsMod, "getDedicatedHosts")},
			"alicloud_ecs_hpc_clusters":           {Tok: dataSource(ecsMod, "getHpcClusters")},
			"alicloud_ecs_commands":               {Tok: dataSource(ecsMod, "getCommands")},
			"alicloud_ecs_auto_snapshot_policies": {Tok: dataSource(ecsMod, "getAutoSnapshotPolicies")},
			"alicloud_ecs_snapshots":              {Tok: dataSource(ecsMod, "getEcsSnapshots")},
			"alicloud_ecs_launch_templates":       {Tok: dataSource(ecsMod, "getEcsLaunchTemplates")},
			"alicloud_ecs_key_pairs":              {Tok: dataSource(ecsMod, "getEcsKeyPairs")},
			"alicloud_ecs_disks":                  {Tok: dataSource(ecsMod, "getEcsDisks")},
			"alicloud_ecs_network_interfaces":     {Tok: dataSource(ecsMod, "getEcsNetworkInterfaces")},

			// Edas
			"alicloud_edas_applications":  {Tok: dataSource(edasMod, "getApplications")},
			"alicloud_edas_deploy_groups": {Tok: dataSource(edasMod, "getDeployGroups")},
			"alicloud_edas_clusters":      {Tok: dataSource(edasMod, "getClusters")},
			"alicloud_edas_service":       {Tok: dataSource(edasMod, "getService")},

			// Eds
			"alicloud_ecd_policy_groups": {Tok: dataSource(edsMod, "getPolicyGroups")},

			// EipAnycast
			"alicloud_eipanycast_anycast_eip_addresses": {Tok: dataSource(eipAnyCastMod, "getAnycastEipAddresses")},

			// Elasticsearch
			"alicloud_elasticsearch_instances": {Tok: dataSource(elasticsearchMod, "getInstances")},
			"alicloud_elasticsearch_zones":     {Tok: dataSource(elasticsearchMod, "getZones")},

			// Emr
			"alicloud_emr_disk_types":     {Tok: dataSource(emrMod, "getDiskTypes")},
			"alicloud_emr_instance_types": {Tok: dataSource(emrMod, "getInstanceTypes")},
			"alicloud_emr_main_versions":  {Tok: dataSource(emrMod, "getMainVersions")},

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

			// Fc
			"alicloud_fc_functions":      {Tok: dataSource(fcMod, "getFunctions")},
			"alicloud_fc_services":       {Tok: dataSource(fcMod, "getServices")},
			"alicloud_fc_triggers":       {Tok: dataSource(fcMod, "getTriggers")},
			"alicloud_fc_zones":          {Tok: dataSource(fcMod, "getZones")},
			"alicloud_fc_custom_domains": {Tok: dataSource(fcMod, "getCustomDomains")},
			"alicloud_fc_service":        {Tok: dataSource(fcMod, "getService")},

			// FNF
			"alicloud_fnf_schedules": {Tok: dataSource(fnfMod, "getSchedules")},
			"alicloud_fnf_flows":     {Tok: dataSource(fnfMod, "getFlows")},
			"alicloud_fnf_service":   {Tok: dataSource(fnfMod, "getService")},

			// Ga
			"alicloud_ga_listeners":          {Tok: dataSource(gaMod, "getListeners")},
			"alicloud_ga_accelerators":       {Tok: dataSource(gaMod, "getAccelerators")},
			"alicloud_ga_bandwidth_packages": {Tok: dataSource(gaMod, "getBandwidthPackages")},
			"alicloud_ga_endpoint_groups":    {Tok: dataSource(gaMod, "getEndpointGroups")},
			"alicloud_ga_ip_sets":            {Tok: dataSource(gaMod, "getIpSets")},
			"alicloud_ga_forwarding_rules":   {Tok: dataSource(gaMod, "getForwardingRules")},

			// Gpdb
			"alicloud_gpdb_instances": {Tok: dataSource(gpdbMod, "getInstances")},
			"alicloud_gpdb_zones":     {Tok: dataSource(gpdbMod, "getZones")},

			// Hbase
			"alicloud_hbase_instances":      {Tok: dataSource(hbaseMod, "getInstances")},
			"alicloud_hbase_zones":          {Tok: dataSource(hbaseMod, "getZones")},
			"alicloud_hbase_instance_types": {Tok: dataSource(hbaseMod, "getInstanceTypes")},

			// hbr
			"alicloud_hbr_vaults":           {Tok: dataSource(hbrMod, "getVaults")},
			"alicloud_hbr_oss_backup_plans": {Tok: dataSource(hbrMod, "getOssBackupPlans")},

			// iot
			"alicloud_iot_service": {Tok: dataSource(iotMod, "getService")},

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

			// Log
			"alicloud_log_service":  {Tok: dataSource(logMod, "getService")},
			"alicloud_log_projects": {Tok: dataSource(logMod, "getProjects")},
			"alicloud_log_stores":   {Tok: dataSource(logMod, "getStores")},

			// Marketplace
			"alicloud_market_products": {Tok: dataSource(marketPlaceMod, "getProducts")},
			"alicloud_market_product":  {Tok: dataSource(marketPlaceMod, "getProduct")},

			// MaxCompute
			"alicloud_maxcompute_service": {Tok: dataSource(maxComputeMod, "getService")},

			// Mns
			"alicloud_mns_queues":              {Tok: dataSource(mnsMod, "getQueues")},
			"alicloud_mns_topic_subscriptions": {Tok: dataSource(mnsMod, "getTopicSubscriptions")},
			"alicloud_mns_topics":              {Tok: dataSource(mnsMod, "getTopics")},
			"alicloud_mns_service":             {Tok: dataSource(mnsMod, "getService")},

			// Mongo
			"alicloud_mongodb_instances": {Tok: dataSource(mongoDbMod, "getInstances")},
			"alicloud_mongodb_zones":     {Tok: dataSource(mongoDbMod, "getZones")},

			// Mse
			"alicloud_mse_clusters": {Tok: dataSource(mseMod, "getClusters")},

			// Nas
			"alicloud_nas_access_groups": {Tok: dataSource(nasMod, "getAccessGroups")},
			"alicloud_nas_access_rules":  {Tok: dataSource(nasMod, "getAccessRules")},
			"alicloud_nas_file_systems":  {Tok: dataSource(nasMod, "getFileSystems")},
			"alicloud_nas_mount_targets": {Tok: dataSource(nasMod, "getMountTargets")},
			"alicloud_nas_protocols":     {Tok: dataSource(nasMod, "getProtocols")},
			"alicloud_nas_service":       {Tok: dataSource(nasMod, "getService")},

			// Oos
			"alicloud_oos_templates":  {Tok: dataSource(oosMod, "getTemplates")},
			"alicloud_oos_executions": {Tok: dataSource(oosMod, "getExecutions")},

			// Oss
			"alicloud_oss_bucket_objects": {Tok: dataSource(ossMod, "getBucketObjects")},
			"alicloud_oss_buckets":        {Tok: dataSource(ossMod, "getBuckets")},
			"alicloud_oss_service":        {Tok: dataSource(ossMod, "getService")},

			// Ots
			"alicloud_ots_service": {Tok: dataSource(otsMod, "getService")},

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
			"alicloud_polardb_clusters":     {Tok: dataSource(polarDbMod, "getClusters")},
			"alicloud_polardb_endpoints":    {Tok: dataSource(polarDbMod, "getEndpoints")},
			"alicloud_polardb_accounts":     {Tok: dataSource(polarDbMod, "getAccounts")},
			"alicloud_polardb_databases":    {Tok: dataSource(polarDbMod, "getDatabases")},
			"alicloud_polardb_zones":        {Tok: dataSource(polarDbMod, "getZones")},
			"alicloud_polardb_node_classes": {Tok: dataSource(polarDbMod, "getNodeClasses")},

			// Pvtr
			"alicloud_pvtz_zone_records": {Tok: dataSource(pvtzMod, "getZoneRecords")},
			"alicloud_pvtz_zones":        {Tok: dataSource(pvtzMod, "getZones")},
			"alicloud_pvtz_service":      {Tok: dataSource(pvtzMod, "getService")},

			// quotas
			"alicloud_quotas_quotas":             {Tok: dataSource(quotasMod, "getQuotas")},
			"alicloud_quotas_application_infos":  {Tok: dataSource(quotasMod, "getApplicationInfos")},
			"alicloud_quotas_quota_alarms":       {Tok: dataSource(quotasMod, "getQuotaAlarms")},
			"alicloud_quotas_quota_applications": {Tok: dataSource(quotasMod, "getQuotaApplications")},

			// Ram
			"alicloud_ram_account_alias":   {Tok: dataSource(ramMod, "getAccountAlias")},
			"alicloud_ram_account_aliases": {Tok: dataSource(ramMod, "getAccountAliases")},
			"alicloud_ram_groups":          {Tok: dataSource(ramMod, "getGroups")},
			"alicloud_ram_policies":        {Tok: dataSource(ramMod, "getPolicies")},
			"alicloud_ram_roles":           {Tok: dataSource(ramMod, "getRoles")},
			"alicloud_ram_users":           {Tok: dataSource(ramMod, "getUsers")},
			"alicloud_ram_saml_providers":  {Tok: dataSource(ramMod, "getSamlProviders")},

			// Rds
			"alicloud_db_instances":         {Tok: dataSource(rdsMod, "getInstances")},
			"alicloud_db_instance_classes":  {Tok: dataSource(rdsMod, "getInstanceClasses")},
			"alicloud_db_instance_engines":  {Tok: dataSource(rdsMod, "getInstanceEngines")},
			"alicloud_db_zones":             {Tok: dataSource(rdsMod, "getZones")},
			"alicloud_rds_parameter_groups": {Tok: dataSource(rdsMod, "getRdsParameterGroups")},
			"alicloud_rds_accounts":         {Tok: dataSource(rdsMod, "getAccounts")},

			// ResourceManager
			"alicloud_resource_manager_folders":          {Tok: dataSource(resourceManagerMod, "getFolders")},
			"alicloud_resource_manager_resource_groups":  {Tok: dataSource(resourceManagerMod, "getResourceGroups")},
			"alicloud_resource_manager_policy_versions":  {Tok: dataSource(resourceManagerMod, "getPolicyVersions")},
			"alicloud_resource_manager_handshakes":       {Tok: dataSource(resourceManagerMod, "getHandshakes")},
			"alicloud_resource_manager_accounts":         {Tok: dataSource(resourceManagerMod, "getAccounts")},
			"alicloud_resource_manager_roles":            {Tok: dataSource(resourceManagerMod, "getRoles")},
			"alicloud_resource_manager_policies":         {Tok: dataSource(resourceManagerMod, "getPolicies")},
			"alicloud_resource_manager_shared_resources": {Tok: dataSource(resourceManagerMod, "getSharedResources")},
			"alicloud_resource_manager_shared_targets":   {Tok: dataSource(resourceManagerMod, "getSharedTargets")},
			"alicloud_resource_manager_resource_shares":  {Tok: dataSource(resourceManagerMod, "getResourceShares")},
			"alicloud_resource_manager_control_policies": {Tok: dataSource(resourceManagerMod, "getControlPolicies")},
			"alicloud_resource_manager_control_policy_attachments": {
				Tok: dataSource(resourceManagerMod, "getControlPolicyAttachments"),
			},
			"alicloud_resource_manager_resource_directories": {
				Tok: dataSource(resourceManagerMod, "getResourceDirectories"),
			},
			"alicloud_resource_manager_policy_attachments": {
				Tok: dataSource(resourceManagerMod, "getPolicyAttachments"),
			},

			// RocketMq
			"alicloud_ons_groups":    {Tok: dataSource(rocketMqMod, "getGroups")},
			"alicloud_ons_instances": {Tok: dataSource(rocketMqMod, "getInstances")},
			"alicloud_ons_topics":    {Tok: dataSource(rocketMqMod, "getTopics")},
			"alicloud_ons_service":   {Tok: dataSource(rocketMqMod, "getService")},

			//Ros
			"alicloud_ros_change_sets":  {Tok: dataSource(rosMod, "getChangeSets")},
			"alicloud_ros_stack_groups": {Tok: dataSource(rosMod, "getStackGroups")},
			"alicloud_ros_stacks":       {Tok: dataSource(rosMod, "getStacks")},
			"alicloud_ros_templates":    {Tok: dataSource(rosMod, "getTemplates")},

			// Sae
			"alicloud_sae_service":     {Tok: dataSource(saeMod, "getService")},
			"alicloud_sae_namespaces":  {Tok: dataSource(saeMod, "getNamespaces")},
			"alicloud_sae_config_maps": {Tok: dataSource(saeMod, "getConfigMaps")},

			// Sag
			"alicloud_sag_acls": {Tok: dataSource(sagMod, "getAcls")},

			// Scdn
			"alicloud_scdn_domains": {Tok: dataSource(scdnMod, "getDomains")},

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

			//
			"alicloud_tsdb_instances": {Tok: dataSource(tsdbMod, "getInstances")},
			"alicloud_tsdb_zones":     {Tok: dataSource(tsdbMod, "getZones")},

			// Vpc
			"alicloud_vpcs":                         {Tok: dataSource(vpcMod, "getNetworks")},
			"alicloud_router_interfaces":            {Tok: dataSource(vpcMod, "getRouterInterfaces")},
			"alicloud_forward_entries":              {Tok: dataSource(vpcMod, "getForwardEntries")},
			"alicloud_nat_gateways":                 {Tok: dataSource(vpcMod, "getNatGateways")},
			"alicloud_route_entries":                {Tok: dataSource(vpcMod, "getRouteEntries")},
			"alicloud_route_tables":                 {Tok: dataSource(vpcMod, "getRouteTables")},
			"alicloud_snat_entries":                 {Tok: dataSource(vpcMod, "getSnatEntries")},
			"alicloud_common_bandwidth_packages":    {Tok: dataSource(vpcMod, "getCommonBandwidthPackages")},
			"alicloud_enhanced_nat_available_zones": {Tok: dataSource(vpcMod, "getEnhancedNatAvailableZones")},
			"alicloud_havips":                       {Tok: dataSource(vpcMod, "getHavips")},
			"alicloud_vpc_flow_logs":                {Tok: dataSource(vpcMod, "getVpcFlowLogs")},
			"alicloud_network_acls":                 {Tok: dataSource(vpcMod, "getNetworkAcls")},

			// Video Surveillance
			"alicloud_vs_service": {Tok: dataSource(vsMod, "getService")},

			// Vpn
			"alicloud_vpn_connections":       {Tok: dataSource(vpnMod, "getConnections")},
			"alicloud_vpn_customer_gateways": {Tok: dataSource(vpnMod, "getCustomerGateways")},
			"alicloud_vpn_gateways":          {Tok: dataSource(vpnMod, "getGateways")},
			"alicloud_vswitches":             {Tok: dataSource(vpcMod, "getSwitches")},
			"alicloud_ssl_vpn_client_certs":  {Tok: dataSource(vpcMod, "getSslVpnClientCerts")},
			"alicloud_ssl_vpn_servers":       {Tok: dataSource(vpcMod, "getSslVpnServers")},

			// Yundun
			"alicloud_yundun_bastionhost_instances": {Tok: dataSource(yundunMod, "getBastionHostInstances")},
			"alicloud_yundun_dbaudit_instance":      {Tok: dataSource(yundunMod, "getDBAuditInstance")},

			// Adb
			"alicloud_adb_clusters":    {Tok: dataSource(adbMod, "getClusters")},
			"alicloud_adb_zones":       {Tok: dataSource(adbMod, "getZones")},
			"alicloud_adb_db_clusters": {Tok: dataSource(adbMod, "getDBClusters")},

			// Waf
			"alicloud_waf_domains":   {Tok: dataSource(wafMod, "getDomains")},
			"alicloud_waf_instances": {Tok: dataSource(wafMod, "getInstances")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
			},
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", alicloudPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				alicloudPkg,
			),
			GenerateResourceContainerTypes: true,
		},

		CSharp: &tfbridge.CSharpInfo{
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

	prov.SetAutonaming(255, "-")

	return prov
}
