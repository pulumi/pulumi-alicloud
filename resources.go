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
	"strings"
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/pulumi/pulumi-terraform-bridge/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/tokens"
	"github.com/terraform-providers/terraform-provider-alicloud/alicloud"
)

// all of the AliCloud token components used below.
const (
	// packages:
	alicloudPkg = "alicloud"
	// modules:
	alicloudMod      = "index"
	actionTrailMod   = "ActionTrail"
	aliKafaMod       = "AliKafka"
	apiGatewayMod    = "ApiGateway"
	casMod           = "Cas"
	cdnMod           = "Cdn"
	cenMod           = "Cen"
	cloudConnectMod  = "CloudConnect"
	cmsMod           = "Cms"
	crMod            = "CR"
	csMod            = "CS"
	datahubMod       = "Datahub"
	ddsMod           = "Dds"
	ddosMod          = "Ddos"
	dnsMod           = "Dns"
	drdsMod          = "Drds"
	ecsMod           = "Ecs"
	elasticsearchMod = "ElasticSearch"
	emrMod           = "Emr"
	essMod           = "Ess"
	fcMod            = "FC"
	gpdbMod          = "Gpdb"
	kmsMod           = "Kms"
	kvstoreMod       = "KVStore"
	logMod           = "Log"
	marketPlaceMod   = "MarketPlace"
	mongoDbMod       = "MongoDB"
	mnsMod           = "Mns"
	nasMod           = "Nas"
	ossMod           = "Oss"
	otsMod           = "Ots"
	polarDbMod       = "PolarDB"
	pvtzMod          = "Pvtz"
	ramMod           = "Ram"
	rocketMqMod      = "RocketMQ"
	rdsMod           = "Rds"
	sagMod           = "Sag"
	slbMod           = "Slb"
	vpcMod           = "Vpc"
	vpnMod           = "Vpn"
	yundunMod        = "Yundun"
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
	const alicloudName = "name"

	p := alicloud.Provider().(*schema.Provider)

	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "alicloud",
		Description: "A Pulumi package for creating and managing AliCloud resources.",
		Keywords:    []string{"pulumi", "alicloud"},
		Homepage:    "https://pulumi.io",
		License:     "Apache-2.0",
		Repository:  "https://github.com/pulumi/pulumi-alicloud",
		Config: map[string]*tfbridge.SchemaInfo{
			"access_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"ALICLOUD_ACCESS_KEY"},
				},
			},
			"secret_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"ALICLOUD_SECRET_KEY"},
				},
			},
			"security_token": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"ALICLOUD_SECURITY_TOKEN"},
				},
			},
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
			"account_id": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"ALICLOUD_ACCOUNT_ID"},
				},
			},
			"shared_credentials_file": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"ALICLOUD_SHARED_CREDENTIALS_FILE"},
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
			"alicloud_actiontrail": {Tok: resource(actionTrailMod, "Trail")},

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

			// Api Gateway
			"alicloud_api_gateway_group":          {Tok: resource(apiGatewayMod, "Group")},
			"alicloud_api_gateway_api":            {Tok: resource(apiGatewayMod, "Api")},
			"alicloud_api_gateway_app":            {Tok: resource(apiGatewayMod, "App")},
			"alicloud_api_gateway_app_attachment": {Tok: resource(apiGatewayMod, "AppAttachment")},
			"alicloud_api_gateway_vpc_access":     {Tok: resource(apiGatewayMod, "VpcAccess")},

			// Cas
			"alicloud_cas_certificate": {Tok: resource(casMod, "Certificate")},

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

			// CloudConnect
			"alicloud_cloud_connect_network":            {Tok: resource(cloudConnectMod, "Network")},
			"alicloud_cloud_connect_network_attachment": {Tok: resource(cloudConnectMod, "NetworkAttachment")},
			"alicloud_cloud_connect_network_grant":      {Tok: resource(cloudConnectMod, "NetworkGrant")},

			// CMS
			"alicloud_cms_alarm": {Tok: resource(cmsMod, "Alarm")},

			// CR
			"alicloud_cr_repo":      {Tok: resource(crMod, "Repo")},
			"alicloud_cr_namespace": {Tok: resource(crMod, "Namespace")},

			// CS
			"alicloud_container_cluster":        {Tok: resource(csMod, "Cluster")},
			"alicloud_cs_application":           {Tok: resource(csMod, "Application")},
			"alicloud_cs_kubernetes":            {Tok: resource(csMod, "Kubernetes")},
			"alicloud_cs_swarm":                 {Tok: resource(csMod, "Swarm")},
			"alicloud_cs_kubernetes_autoscaler": {Tok: resource(csMod, "KubernetesAutoscaler")},
			"alicloud_cs_managed_kubernetes":    {Tok: resource(csMod, "ManagedKubernetes")},
			"alicloud_cs_serverless_kubernetes": {Tok: resource(csMod, "ServerlessKubernetes")},

			// DataHub
			"alicloud_datahub_project":      {Tok: resource(datahubMod, "Project")},
			"alicloud_datahub_subscription": {Tok: resource(datahubMod, "Subscription")},
			"alicloud_datahub_topic":        {Tok: resource(datahubMod, "Topic")},

			// DB
			"alicloud_db_account":                         {Tok: resource(rdsMod, "Account")},
			"alicloud_db_account_privilege":               {Tok: resource(rdsMod, "AccountPrivilege")},
			"alicloud_db_backup_policy":                   {Tok: resource(rdsMod, "BackupPolicy")},
			"alicloud_db_connection":                      {Tok: resource(rdsMod, "Connection")},
			"alicloud_db_database":                        {Tok: resource(rdsMod, "Database")},
			"alicloud_db_instance":                        {Tok: resource(rdsMod, "Instance")},
			"alicloud_db_read_write_splitting_connection": {Tok: resource(rdsMod, "ReadWriteSplittingConnection")},
			"alicloud_db_readonly_instance":               {Tok: resource(rdsMod, "ReadOnlyInstance")},

			// DNS
			"alicloud_dns":        {Tok: resource(dnsMod, "Domain")},
			"alicloud_dns_group":  {Tok: resource(dnsMod, "Group")},
			"alicloud_dns_record": {Tok: resource(dnsMod, "Record")},

			// DDos
			"alicloud_ddosbgp_instance": {Tok: resource(dnsMod, "DdosBgpInstance")},
			"alicloud_ddoscoo_instance": {Tok: resource(dnsMod, "DdosCooInstance")},

			// Drds
			"alicloud_drds_instance": {Tok: resource(drdsMod, "Instance")},

			// ECS
			"alicloud_disk":                   {Tok: resource(ecsMod, "Disk")},
			"alicloud_disk_attachment":        {Tok: resource(ecsMod, "DiskAttachment")},
			"alicloud_launch_template":        {Tok: resource(ecsMod, "LaunchTemplate")},
			"alicloud_eip":                    {Tok: resource(ecsMod, "Eip")},
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

			// ESS
			"alicloud_ess_alarm":      {Tok: resource(essMod, "Alarm")},
			"alicloud_ess_attachment": {Tok: resource(essMod, "Attachment")},
			"alicloud_ess_lifecycle_hook": {
				Tok: resource(essMod, "LifecycleHook"),
				Docs: &tfbridge.DocInfo{
					Source: "alicloud_ess_lifecycle_hook",
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

			// FC
			"alicloud_fc_function": {Tok: resource(fcMod, "Function")},
			"alicloud_fc_service":  {Tok: resource(fcMod, "Service")},
			"alicloud_fc_trigger":  {Tok: resource(fcMod, "Trigger")},

			// Gpdb
			"alicloud_gpdb_connection": {Tok: resource(gpdbMod, "Connection")},
			"alicloud_gpdb_instance":   {Tok: resource(gpdbMod, "Instance")},

			// KMS
			"alicloud_kms_key":        {Tok: resource(kmsMod, "Key")},
			"alicloud_kms_ciphertext": {Tok: resource(kmsMod, "Ciphertext")},

			// KVStore
			"alicloud_kvstore_backup_policy": {Tok: resource(kvstoreMod, "BackupPolicy")},
			"alicloud_kvstore_instance":      {Tok: resource(kvstoreMod, "Instance")},
			"alicloud_kvstore_account":       {Tok: resource(kvstoreMod, "Account")},

			// Log
			"alicloud_log_machine_group":  {Tok: resource(logMod, "MachineGroup")},
			"alicloud_log_project":        {Tok: resource(logMod, "Project")},
			"alicloud_log_store":          {Tok: resource(logMod, "Store")},
			"alicloud_log_store_index":    {Tok: resource(logMod, "StoreIndex")},
			"alicloud_logtail_attachment": {Tok: resource(logMod, "LogTailAttachment")},
			"alicloud_logtail_config":     {Tok: resource(logMod, "LogTailConfig")},

			// Marketplace
			"alicloud_market_order": {Tok: resource(marketPlaceMod, "Order")},

			// MongoDb
			"alicloud_mongodb_instance":          {Tok: resource(mongoDbMod, "Instance")},
			"alicloud_mongodb_sharding_instance": {Tok: resource(mongoDbMod, "ShardingInstance")},

			// Mns
			"alicloud_mns_queue":              {Tok: resource(mnsMod, "Queue")},
			"alicloud_mns_topic":              {Tok: resource(mnsMod, "Topic")},
			"alicloud_mns_topic_subscription": {Tok: resource(mnsMod, "TopicSubscription")},

			// Nas
			"alicloud_nas_access_group": {Tok: resource(nasMod, "AccessGroup")},
			"alicloud_nas_access_rule":  {Tok: resource(nasMod, "AccessRule")},
			"alicloud_nas_file_system":  {Tok: resource(nasMod, "FileSystem")},
			"alicloud_nas_mount_target": {Tok: resource(nasMod, "MountTarget")},

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

			// Pvtz
			"alicloud_pvtz_zone":            {Tok: resource(pvtzMod, "Zone")},
			"alicloud_pvtz_zone_attachment": {Tok: resource(pvtzMod, "ZoneAttachment")},
			"alicloud_pvtz_zone_record":     {Tok: resource(pvtzMod, "ZoneRecord")},

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

			// RocketMQ
			"alicloud_ons_group":    {Tok: resource(rocketMqMod, "Group")},
			"alicloud_ons_instance": {Tok: resource(rocketMqMod, "Instance")},
			"alicloud_ons_topic": {
				Tok: resource(rocketMqMod, "Topic"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"topic": {
						CSharpName: "TopicName",
					},
				},
			},

			// Sag
			"alicloud_sag_acl":         {Tok: resource(rocketMqMod, "Acl")},
			"alicloud_sag_acl_rule":    {Tok: resource(rocketMqMod, "AclRule")},
			"alicloud_sag_client_user": {Tok: resource(rocketMqMod, "ClientUser")},
			"alicloud_sag_dnat_entry":  {Tok: resource(rocketMqMod, "DnatEntry")},
			"alicloud_sag_qos":         {Tok: resource(rocketMqMod, "Qos")},
			"alicloud_sag_qos_car":     {Tok: resource(rocketMqMod, "QosCar")},
			"alicloud_sag_qos_policy":  {Tok: resource(rocketMqMod, "QosPolicy")},
			"alicloud_sag_snat_entry":  {Tok: resource(rocketMqMod, "SnatEntry")},

			// Slb
			"alicloud_slb":                {Tok: resource(slbMod, "LoadBalancer")},
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

			// VPN
			"alicloud_ssl_vpn_client_cert":  {Tok: resource(vpnMod, "SslVpnClientCert")},
			"alicloud_ssl_vpn_server":       {Tok: resource(vpnMod, "SslVpnServer")},
			"alicloud_vpn_connection":       {Tok: resource(vpnMod, "Connection")},
			"alicloud_vpn_customer_gateway": {Tok: resource(vpnMod, "CustomerGateway")},
			"alicloud_vpn_gateway":          {Tok: resource(vpnMod, "Gateway")},
			"alicloud_vpn_route_entry":      {Tok: resource(vpnMod, "RouteEntry")},

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
			"alicloud_actiontrails": {Tok: dataSource(actionTrailMod, "getTrails")},

			// AliKafka
			"alicloud_alikafka_consumer_groups": {Tok: dataSource(actionTrailMod, "getConsumerGroups")},
			"alicloud_alikafka_instances":       {Tok: dataSource(actionTrailMod, "getInstances")},
			"alicloud_alikafka_sasl_acls":       {Tok: dataSource(actionTrailMod, "getSaslAcls")},
			"alicloud_alikafka_sasl_users":      {Tok: dataSource(actionTrailMod, "getSaslUsers")},
			"alicloud_alikafka_topics":          {Tok: dataSource(actionTrailMod, "getTopics")},

			// ApiGateway
			"alicloud_api_gateway_groups": {Tok: dataSource(apiGatewayMod, "getGroups")},
			"alicloud_api_gateway_apis":   {Tok: dataSource(apiGatewayMod, "getApis")},
			"alicloud_api_gateway_apps":   {Tok: dataSource(apiGatewayMod, "getApps")},

			// Cas
			"alicloud_cas_certificates": {Tok: dataSource(casMod, "getCertificates")},

			// Cen
			"alicloud_cen_bandwidth_limits":     {Tok: dataSource(cenMod, "getBandwidthLimits")},
			"alicloud_cen_bandwidth_packages":   {Tok: dataSource(cenMod, "getBandwidthPackages")},
			"alicloud_cen_instances":            {Tok: dataSource(cenMod, "getInstances")},
			"alicloud_cen_route_entries":        {Tok: dataSource(cenMod, "getRouteEntries")},
			"alicloud_cen_region_route_entries": {Tok: dataSource(cenMod, "getRegionRouteEntries")},

			// CloudConnect
			"alicloud_cloud_connect_networks": {Tok: dataSource(cloudConnectMod, "getNetworks")},

			// Cr
			"alicloud_cr_namespaces": {Tok: dataSource(crMod, "getNamespaces")},
			"alicloud_cr_repos":      {Tok: dataSource(crMod, "getRepos")},

			// Cs
			"alicloud_cs_kubernetes_clusters":            {Tok: dataSource(csMod, "getKubernetesClusters")},
			"alicloud_cs_managed_kubernetes_clusters":    {Tok: dataSource(csMod, "getManagedKubernetesClusters")},
			"alicloud_cs_serverless_kubernetes_clusters": {Tok: dataSource(csMod, "getServerlessKubernetesClusters")},

			// Dds
			"alicloud_mongo_instances": {Tok: dataSource(ddsMod, "getMongoInstances")},

			// Ddos
			"alicloud_ddoscoo_instances": {Tok: dataSource(ddosMod, "getDdosCooInstances")},
			"alicloud_ddosbgp_instances": {Tok: dataSource(ddosMod, "getDdosBgpInstances")},

			// Dns
			"alicloud_dns_domain_groups":    {Tok: dataSource(dnsMod, "getDomainGroups")},
			"alicloud_dns_domain_records":   {Tok: dataSource(dnsMod, "getDomainRecords")},
			"alicloud_dns_domains":          {Tok: dataSource(dnsMod, "getDomains")},
			"alicloud_dns_groups":           {Tok: dataSource(dnsMod, "getGroups")},
			"alicloud_dns_records":          {Tok: dataSource(dnsMod, "getRecords")},
			"alicloud_dns_resolution_lines": {Tok: dataSource(dnsMod, "getResolutionLines")},

			// Drds
			"alicloud_drds_instances": {Tok: dataSource(drdsMod, "getInstances")},

			// Ecs
			"alicloud_images":                 {Tok: dataSource(ecsMod, "getImages")},
			"alicloud_instance_types":         {Tok: dataSource(ecsMod, "getInstanceTypes")},
			"alicloud_instances":              {Tok: dataSource(ecsMod, "getInstances")},
			"alicloud_key_pairs":              {Tok: dataSource(ecsMod, "getKeyPairs")},
			"alicloud_security_group_rules":   {Tok: dataSource(ecsMod, "getSecurityGroupRules")},
			"alicloud_security_groups":        {Tok: dataSource(ecsMod, "getSecurityGroups")},
			"alicloud_disks":                  {Tok: dataSource(ecsMod, "getDisks")},
			"alicloud_eips":                   {Tok: dataSource(ecsMod, "getEips")},
			"alicloud_instance_type_families": {Tok: dataSource(ecsMod, "getInstanceTypeFamilies")},
			"alicloud_network_interfaces":     {Tok: dataSource(ecsMod, "getNetworkInterfaces")},
			"alicloud_snapshots":              {Tok: dataSource(ecsMod, "getSnapshots")},

			// Elasticsearch
			"alicloud_elasticsearch_instances": {Tok: dataSource(elasticsearchMod, "getInstances")},

			// Emr
			"alicloud_emr_disk_types":     {Tok: dataSource(emrMod, "getDiskTypes")},
			"alicloud_emr_instance_types": {Tok: dataSource(emrMod, "getInstanceTypes")},
			"alicloud_emr_main_versions":  {Tok: dataSource(emrMod, "getMainVersions")},

			// Ess
			"alicloud_ess_scaling_configurations": {Tok: dataSource(essMod, "getScalingConfigurations")},
			"alicloud_ess_scaling_groups":         {Tok: dataSource(essMod, "getScalingGroups")},
			"alicloud_ess_scaling_rules":          {Tok: dataSource(essMod, "getScalingRules")},

			// Fc
			"alicloud_fc_functions": {Tok: dataSource(fcMod, "getFunctions")},
			"alicloud_fc_services":  {Tok: dataSource(fcMod, "getServices")},
			"alicloud_fc_triggers":  {Tok: dataSource(fcMod, "getTriggers")},

			// Gpdb
			"alicloud_gpdb_instances": {Tok: dataSource(gpdbMod, "getInstances")},

			// Kms
			"alicloud_kms_ciphertext": {Tok: dataSource(kmsMod, "getCiphertext")},
			"alicloud_kms_plaintext":  {Tok: dataSource(kmsMod, "getPlaintext")},
			"alicloud_kms_keys":       {Tok: dataSource(kmsMod, "getKeys")},

			// KvStore
			"alicloud_kvstore_instances":        {Tok: dataSource(kvstoreMod, "getInstances")},
			"alicloud_kvstore_instance_classes": {Tok: dataSource(kvstoreMod, "getInstanceClasses")},
			"alicloud_kvstore_instance_engines": {Tok: dataSource(kvstoreMod, "getInstanceEngines")},

			// Marketplace
			"alicloud_market_products": {Tok: dataSource(marketPlaceMod, "getProducts")},
			"alicloud_market_product":  {Tok: dataSource(marketPlaceMod, "getProduct")},

			// Mns
			"alicloud_mns_queues":              {Tok: dataSource(mnsMod, "getQueues")},
			"alicloud_mns_topic_subscriptions": {Tok: dataSource(mnsMod, "getTopicSubscriptions")},
			"alicloud_mns_topics":              {Tok: dataSource(mnsMod, "getTopics")},

			// Mongo
			"alicloud_mongodb_instances": {Tok: dataSource(mongoDbMod, "getInstances")},

			// Nas
			"alicloud_nas_access_groups": {Tok: dataSource(nasMod, "getAccessGroups")},
			"alicloud_nas_access_rules":  {Tok: dataSource(nasMod, "getAccessRules")},
			"alicloud_nas_file_systems":  {Tok: dataSource(nasMod, "getFileSystems")},
			"alicloud_nas_mount_targets": {Tok: dataSource(nasMod, "getMountTargets")},
			"alicloud_nas_protocols":     {Tok: dataSource(nasMod, "getProtocols")},

			// Oss
			"alicloud_oss_bucket_objects": {Tok: dataSource(ossMod, "getBucketObjects")},
			"alicloud_oss_buckets":        {Tok: dataSource(ossMod, "getBuckets")},

			// Ots
			"alicloud_ots_instance_attachments": {Tok: dataSource(ossMod, "getInstanceAttachments")},
			"alicloud_ots_instances":            {Tok: dataSource(ossMod, "getInstances")},
			"alicloud_ots_tables":               {Tok: dataSource(ossMod, "getTables")},

			// PolarDb
			"alicloud_polardb_clusters":  {Tok: dataSource(polarDbMod, "getClusters")},
			"alicloud_polardb_endpoints": {Tok: dataSource(polarDbMod, "getEndpoints")},
			"alicloud_polardb_accounts":  {Tok: dataSource(polarDbMod, "getAccounts")},
			"alicloud_polardb_databases": {Tok: dataSource(polarDbMod, "getDatabases")},

			// Pvtr
			"alicloud_pvtz_zone_records": {Tok: dataSource(pvtzMod, "getZoneRecords")},
			"alicloud_pvtz_zones":        {Tok: dataSource(pvtzMod, "getZones")},

			// Ram
			"alicloud_ram_account_alias":   {Tok: dataSource(ramMod, "getAccountAlias")},
			"alicloud_ram_account_aliases": {Tok: dataSource(ramMod, "getAccountAliases")},
			"alicloud_ram_groups":          {Tok: dataSource(ramMod, "getGroups")},
			"alicloud_ram_policies":        {Tok: dataSource(ramMod, "getPolicies")},
			"alicloud_ram_roles":           {Tok: dataSource(ramMod, "getRoles")},
			"alicloud_ram_users":           {Tok: dataSource(ramMod, "getUsers")},

			// Rds
			"alicloud_db_instances":        {Tok: dataSource(rdsMod, "getInstances")},
			"alicloud_db_instance_classes": {Tok: dataSource(rdsMod, "getInstanceClasses")},
			"alicloud_db_instance_engines": {Tok: dataSource(rdsMod, "getInstanceEngines")},

			// RocketMq
			"alicloud_ons_groups":    {Tok: dataSource(rocketMqMod, "getGroups")},
			"alicloud_ons_instances": {Tok: dataSource(rocketMqMod, "getInstances")},
			"alicloud_ons_topics":    {Tok: dataSource(rocketMqMod, "getTopics")},

			// Sag
			"alicloud_sag_acls": {Tok: dataSource(sagMod, "getAcls")},

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

			// Vpc
			"alicloud_vpcs":                      {Tok: dataSource(vpcMod, "getNetworks")},
			"alicloud_router_interfaces":         {Tok: dataSource(vpcMod, "getRouterInterfaces")},
			"alicloud_forward_entries":           {Tok: dataSource(vpcMod, "getForwardEntries")},
			"alicloud_nat_gateways":              {Tok: dataSource(vpcMod, "getNatGateways")},
			"alicloud_route_entries":             {Tok: dataSource(vpcMod, "getRouteEntries")},
			"alicloud_route_tables":              {Tok: dataSource(vpcMod, "getRouteTables")},
			"alicloud_snat_entries":              {Tok: dataSource(vpcMod, "getSnatEntries")},
			"alicloud_common_bandwidth_packages": {Tok: dataSource(vpcMod, "getCommonBandwidthPackages")},

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
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
			},
			Dependencies: map[string]string{
				"@pulumi/pulumi": "feature-2.0",
			},
			Overlay: &tfbridge.OverlayInfo{
				Files:   []string{},
				Modules: map[string]*tfbridge.OverlayInfo{},
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=1.0.0,<2.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "1.7.0-preview",
				"System.Collections.Immutable": "1.6.0",
			},
			Namespaces: namespaceMap,
		},
	}

	// For all resources with name properties, we will add an auto-name property.  Make sure to skip those that
	// already have a name mapping entry, since those may have custom overrides set above (e.g., for length).
	for resname, res := range prov.Resources {
		if schema := p.ResourcesMap[resname]; schema != nil {
			// Only apply auto-name to input properties (Optional || Required) named `name`
			if tfs, has := schema.Schema[alicloudName]; has && (tfs.Optional || tfs.Required) {
				if _, hasfield := res.Fields[alicloudName]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					res.Fields[alicloudName] = tfbridge.AutoName(alicloudName, 255)
				}
			}
		}
	}

	return prov
}
