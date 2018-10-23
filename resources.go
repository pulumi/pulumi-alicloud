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
	"unicode"

	"github.com/hashicorp/terraform/helper/schema"
	"github.com/pulumi/pulumi-terraform/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/tokens"
	"github.com/terraform-providers/terraform-provider-alicloud/alicloud"
)

// all of the AliCloud token components used below.
const (
	// packages:
	alicloudPkg = "alicloud"
	// modules:
	alicloudMod   = "index"
	apiGatewayMod = "apigateway"
	cdnMod        = "cdn"
	cenMod        = "cen"
	cmsMod        = "cms"
	csMod         = "cs"
	datahubMod    = "datahub"
	ddsMod        = "dds"
	dnsMod        = "dns"
	ecsMod        = "ecs"
	essMod        = "ess"
	fcMod         = "fc"
	kmsMod        = "kms"
	kvstoreMod    = "kvstore"
	logMod        = "log"
	mnsMod        = "mns"
	ossMod        = "oss"
	otsMod        = "ots"
	pvtzMod       = "pvtz"
	ramMod        = "ram"
	rdsMod        = "rds"
	slbMod        = "slb"
	vpcMod        = "vpc"
	vpnMod        = "vpn"
)

// alicloudMember manufactures a type token for the AliCloud package and the given module and type.
func alicloudMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(alicloudPkg + ":" + mod + ":" + mem)
}

// alicloudType manufactures a type token for the AliCloud package and the given module and type.
func alicloudType(mod string, typ string) tokens.Type {
	return tokens.Type(alicloudMember(mod, typ))
}

// alicloudDataSource manufactures a standard resource token given a module and resource name.  It automatically uses
// the AliCloud package and names the file by simply lower casing the data source's first character.
func alicloudDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return alicloudMember(mod+"/"+fn, res)
}

// alicloudResource manufactures a standard resource token given a module and resource name.  It automatically uses the
// AliCloud package and names the file by simply lower casing the resource's first character.
func alicloudResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return alicloudType(mod+"/"+fn, res)
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
		License:     "Apache 2.0",
		Repository:  "https://github.com/pulumi/pulumi-alicloud",
		Config:      map[string]*tfbridge.SchemaInfo{},
		Resources: map[string]*tfbridge.ResourceInfo{
			"alicloud_api_gateway_group":                {Tok: alicloudResource(apiGatewayMod, "Group")},
			"alicloud_cdn_domain":                       {Tok: alicloudResource(cdnMod, "Domain")},
			"alicloud_cen_bandwidth_limit":              {Tok: alicloudResource(cenMod, "BandwidthLimit")},
			"alicloud_cen_bandwidth_package":            {Tok: alicloudResource(cenMod, "BandwidthPackage")},
			"alicloud_cen_bandwidth_package_attachment": {Tok: alicloudResource(cenMod, "BandwidthPackageAttachment")},
			"alicloud_cen_instance":                     {Tok: alicloudResource(cenMod, "Instance")},
			"alicloud_cen_instance_attachment":          {Tok: alicloudResource(cenMod, "InstanceAttachment")},
			"alicloud_cen_route_entry":                  {Tok: alicloudResource(cenMod, "RouteEntry")},
			"alicloud_cms_alarm":                        {Tok: alicloudResource(cmsMod, "Alarm")},
			"alicloud_container_cluster":                {Tok: alicloudResource(csMod, "Cluster")},
			"alicloud_cs_application":                   {Tok: alicloudResource(csMod, "Application")},
			"alicloud_cs_kubernetes":                    {Tok: alicloudResource(csMod, "Kubernetes")},
			"alicloud_cs_swarm":                         {Tok: alicloudResource(csMod, "Swarm")},
			"alicloud_datahub_project":                  {Tok: alicloudResource(datahubMod, "Project")},
			"alicloud_datahub_subscription":             {Tok: alicloudResource(datahubMod, "Subscription")},
			"alicloud_datahub_topic":                    {Tok: alicloudResource(datahubMod, "Topic")},
			"alicloud_db_account":                       {Tok: alicloudResource(rdsMod, "Account")},
			"alicloud_db_account_privilege":             {Tok: alicloudResource(rdsMod, "AccountPrivilege")},
			"alicloud_db_backup_policy":                 {Tok: alicloudResource(rdsMod, "BackupPolicy")},
			"alicloud_db_connection":                    {Tok: alicloudResource(rdsMod, "Connection")},
			"alicloud_db_database":                      {Tok: alicloudResource(rdsMod, "Database")},
			"alicloud_db_instance":                      {Tok: alicloudResource(rdsMod, "Instance")},
			"alicloud_disk":                             {Tok: alicloudResource(ecsMod, "Disk")},
			"alicloud_disk_attachment":                  {Tok: alicloudResource(ecsMod, "DiskAttachment")},
			"alicloud_dns":                              {Tok: alicloudResource(dnsMod, "Domain")},
			"alicloud_dns_group":                        {Tok: alicloudResource(dnsMod, "Group")},
			"alicloud_dns_record":                       {Tok: alicloudResource(dnsMod, "Record")},
			"alicloud_eip":                              {Tok: alicloudResource(ecsMod, "Eip")},
			"alicloud_eip_association":                  {Tok: alicloudResource(ecsMod, "EipAssociation")},
			"alicloud_ess_alarm":                        {Tok: alicloudResource(essMod, "Alarm")},
			"alicloud_ess_attachment":                   {Tok: alicloudResource(essMod, "Attachment")},
			"alicloud_ess_lifecycle_hook":               {Tok: alicloudResource(essMod, "LifecycleHook")},
			"alicloud_ess_scaling_configuration":        {Tok: alicloudResource(essMod, "ScalingConfiguration")},
			"alicloud_ess_scaling_group":                {Tok: alicloudResource(essMod, "ScalingGroup")},
			"alicloud_ess_scaling_rule":                 {Tok: alicloudResource(essMod, "ScalingRule")},
			"alicloud_ess_schedule":                     {Tok: alicloudResource(essMod, "Schedule")},
			"alicloud_fc_function":                      {Tok: alicloudResource(fcMod, "Function")},
			"alicloud_fc_service":                       {Tok: alicloudResource(fcMod, "Service")},
			"alicloud_fc_trigger":                       {Tok: alicloudResource(fcMod, "Trigger")},
			"alicloud_forward_entry":                    {Tok: alicloudResource(vpcMod, "ForwardEntry")},
			"alicloud_havip":                            {Tok: alicloudResource(vpcMod, "HaVip")},
			"alicloud_havip_attachment":                 {Tok: alicloudResource(vpcMod, "HaVipAttachment")},
			"alicloud_instance":                         {Tok: alicloudResource(ecsMod, "Instance")},
			"alicloud_key_pair":                         {Tok: alicloudResource(ecsMod, "KeyPair")},
			"alicloud_key_pair_attachment":              {Tok: alicloudResource(ecsMod, "KeyPairAttachment")},
			"alicloud_kms_key":                          {Tok: alicloudResource(kmsMod, "Key")},
			"alicloud_kvstore_backup_policy":            {Tok: alicloudResource(kvstoreMod, "BackupPolicy")},
			"alicloud_kvstore_instance":                 {Tok: alicloudResource(kvstoreMod, "Instance")},
			"alicloud_log_machine_group":                {Tok: alicloudResource(logMod, "MachineGroup")},
			"alicloud_log_project":                      {Tok: alicloudResource(logMod, "Project")},
			"alicloud_log_store":                        {Tok: alicloudResource(logMod, "Store")},
			"alicloud_log_store_index":                  {Tok: alicloudResource(logMod, "StoreIndex")},
			"alicloud_mns_queue":                        {Tok: alicloudResource(mnsMod, "Queue")},
			"alicloud_mns_topic":                        {Tok: alicloudResource(mnsMod, "Topic")},
			"alicloud_mns_topic_subscription":           {Tok: alicloudResource(mnsMod, "TopicSubscription")},
			"alicloud_nat_gateway":                      {Tok: alicloudResource(vpcMod, "NatGateway")},
			"alicloud_oss_bucket":                       {Tok: alicloudResource(ossMod, "Bucket")},
			"alicloud_oss_bucket_object":                {Tok: alicloudResource(ossMod, "BucketObject")},
			"alicloud_ots_instance":                     {Tok: alicloudResource(otsMod, "Instance")},
			"alicloud_ots_instance_attachment":          {Tok: alicloudResource(otsMod, "InstanceAttachment")},
			"alicloud_ots_table":                        {Tok: alicloudResource(otsMod, "Table")},
			"alicloud_pvtz_zone":                        {Tok: alicloudResource(pvtzMod, "Zone")},
			"alicloud_pvtz_zone_attachment":             {Tok: alicloudResource(pvtzMod, "ZoneAttachment")},
			"alicloud_pvtz_zone_record":                 {Tok: alicloudResource(pvtzMod, "ZoneRecord")},
			"alicloud_ram_access_key":                   {Tok: alicloudResource(ramMod, "AccessKey")},
			"alicloud_ram_account_alias":                {Tok: alicloudResource(ramMod, "AccountAlias")},
			"alicloud_ram_alias":                        {Tok: alicloudResource(ramMod, "Alias")},
			"alicloud_ram_group":                        {Tok: alicloudResource(ramMod, "Group")},
			"alicloud_ram_group_membership":             {Tok: alicloudResource(ramMod, "GroupMembership")},
			"alicloud_ram_group_policy_attachment":      {Tok: alicloudResource(ramMod, "GroupPolicyAttachment")},
			"alicloud_ram_login_profile":                {Tok: alicloudResource(ramMod, "LoginProfile")},
			"alicloud_ram_policy":                       {Tok: alicloudResource(ramMod, "Policy")},
			"alicloud_ram_role":                         {Tok: alicloudResource(ramMod, "Role")},
			"alicloud_ram_role_attachment":              {Tok: alicloudResource(ramMod, "RoleAttachment")},
			"alicloud_ram_role_policy_attachment":       {Tok: alicloudResource(ramMod, "RolePolicyAttachment")},
			"alicloud_ram_user":                         {Tok: alicloudResource(ramMod, "User")},
			"alicloud_ram_user_policy_attachment":       {Tok: alicloudResource(ramMod, "UserPolicyAttachment")},
			"alicloud_route_entry":                      {Tok: alicloudResource(vpcMod, "RouteEntry")},
			"alicloud_route_table":                      {Tok: alicloudResource(vpcMod, "RouteTable")},
			"alicloud_route_table_attachment":           {Tok: alicloudResource(vpcMod, "RouteTableAttachment")},
			"alicloud_router_interface":                 {Tok: alicloudResource(vpcMod, "RouterInterface")},
			"alicloud_router_interface_connection":      {Tok: alicloudResource(vpcMod, "RouterInterfaceConnection")},
			"alicloud_security_group":                   {Tok: alicloudResource(ecsMod, "SecurityGroup")},
			"alicloud_security_group_rule":              {Tok: alicloudResource(ecsMod, "SecurityGroupRule")},
			"alicloud_slb":                              {Tok: alicloudResource(slbMod, "LoadBalancer")},
			"alicloud_slb_acl":                          {Tok: alicloudResource(slbMod, "Acl")},
			"alicloud_slb_attachment":                   {Tok: alicloudResource(slbMod, "Attachment")},
			"alicloud_slb_listener":                     {Tok: alicloudResource(slbMod, "Listener")},
			"alicloud_slb_rule":                         {Tok: alicloudResource(slbMod, "Rule")},
			"alicloud_slb_server_group":                 {Tok: alicloudResource(slbMod, "ServerGroup")},
			"alicloud_snat_entry":                       {Tok: alicloudResource(vpcMod, "SnatEntry")},
			"alicloud_ssl_vpn_client_cert":              {Tok: alicloudResource(vpnMod, "SslVpnClientCert")},
			"alicloud_ssl_vpn_server":                   {Tok: alicloudResource(vpnMod, "SslVpnServer")},
			"alicloud_subnet":                           {Tok: alicloudResource(vpcMod, "Subnet")},
			"alicloud_vpc":                              {Tok: alicloudResource(vpcMod, "Network")},
			"alicloud_vpn_connection":                   {Tok: alicloudResource(vpnMod, "Connection")},
			"alicloud_vpn_customer_gateway":             {Tok: alicloudResource(vpnMod, "CustomerGateway")},
			"alicloud_vpn_gateway":                      {Tok: alicloudResource(vpnMod, "Gateway")},
			"alicloud_vswitch":                          {Tok: alicloudResource(vpcMod, "Switch")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"alicloud_account":                 {Tok: alicloudDataSource(alicloudMod, "getAccount")},
			"alicloud_api_gateway_groups":      {Tok: alicloudDataSource(apiGatewayMod, "getGroups")},
			"alicloud_cen_bandwidth_limits":    {Tok: alicloudDataSource(cenMod, "getBandwidthLimits")},
			"alicloud_cen_bandwidth_packages":  {Tok: alicloudDataSource(cenMod, "getBandwidthPackages")},
			"alicloud_cen_instances":           {Tok: alicloudDataSource(cenMod, "getInstances")},
			"alicloud_cen_route_entries":       {Tok: alicloudDataSource(cenMod, "getRouteEntries")},
			"alicloud_db_instances":            {Tok: alicloudDataSource(rdsMod, "getInstances")},
			"alicloud_disks":                   {Tok: alicloudDataSource(ecsMod, "getDisks")},
			"alicloud_dns_domain_groups":       {Tok: alicloudDataSource(dnsMod, "getDomainGroups")},
			"alicloud_dns_domain_records":      {Tok: alicloudDataSource(dnsMod, "getDomainRecords")},
			"alicloud_dns_domains":             {Tok: alicloudDataSource(dnsMod, "getDomains")},
			"alicloud_dns_groups":              {Tok: alicloudDataSource(dnsMod, "getGroups")},
			"alicloud_dns_records":             {Tok: alicloudDataSource(dnsMod, "getRecords")},
			"alicloud_eips":                    {Tok: alicloudDataSource(ecsMod, "getEips")},
			"alicloud_fc_functions":            {Tok: alicloudDataSource(fcMod, "getFunctions")},
			"alicloud_fc_services":             {Tok: alicloudDataSource(fcMod, "getServices")},
			"alicloud_fc_triggers":             {Tok: alicloudDataSource(fcMod, "getTriggers")},
			"alicloud_images":                  {Tok: alicloudDataSource(ecsMod, "getImages")},
			"alicloud_instance_types":          {Tok: alicloudDataSource(ecsMod, "getInstanceTypes")},
			"alicloud_instances":               {Tok: alicloudDataSource(ecsMod, "getInstances")},
			"alicloud_key_pairs":               {Tok: alicloudDataSource(ecsMod, "getKeyPairs")},
			"alicloud_kms_keys":                {Tok: alicloudDataSource(kmsMod, "getKeys")},
			"alicloud_kvstore_instances":       {Tok: alicloudDataSource(kvstoreMod, "getInstances")},
			"alicloud_mns_queues":              {Tok: alicloudDataSource(mnsMod, "getQueues")},
			"alicloud_mns_topic_subscriptions": {Tok: alicloudDataSource(mnsMod, "getTopicSubscriptions")},
			"alicloud_mns_topics":              {Tok: alicloudDataSource(mnsMod, "getTopics")},
			"alicloud_mongo_instances":         {Tok: alicloudDataSource(ddsMod, "getMongoInstances")},
			"alicloud_oss_bucket_objects":      {Tok: alicloudDataSource(ossMod, "getBucketObjects")},
			"alicloud_oss_buckets":             {Tok: alicloudDataSource(ossMod, "getBuckets")},
			"alicloud_pvtz_zone_records":       {Tok: alicloudDataSource(pvtzMod, "getZoneRecords")},
			"alicloud_pvtz_zones":              {Tok: alicloudDataSource(pvtzMod, "getZones")},
			"alicloud_ram_account_alias":       {Tok: alicloudDataSource(ramMod, "getAccountAlias")},
			"alicloud_ram_account_aliases":     {Tok: alicloudDataSource(ramMod, "getAccountAliases")},
			"alicloud_ram_groups":              {Tok: alicloudDataSource(ramMod, "getGroups")},
			"alicloud_ram_policies":            {Tok: alicloudDataSource(ramMod, "getPolicies")},
			"alicloud_ram_roles":               {Tok: alicloudDataSource(ramMod, "getRoles")},
			"alicloud_ram_users":               {Tok: alicloudDataSource(ramMod, "getUsers")},
			"alicloud_regions":                 {Tok: alicloudDataSource(alicloudMod, "getRegions")},
			"alicloud_router_interfaces":       {Tok: alicloudDataSource(vpcMod, "getRouterInterfaces")},
			"alicloud_security_group_rules":    {Tok: alicloudDataSource(ecsMod, "getSecurityGroupRules")},
			"alicloud_security_groups":         {Tok: alicloudDataSource(ecsMod, "getSecurityGroups")},
			"alicloud_slb_attachments":         {Tok: alicloudDataSource(slbMod, "getAttachments")},
			"alicloud_slb_listeners":           {Tok: alicloudDataSource(slbMod, "getListeners")},
			"alicloud_slb_rules":               {Tok: alicloudDataSource(slbMod, "getRules")},
			"alicloud_slb_server_groups":       {Tok: alicloudDataSource(slbMod, "getServerGroups")},
			"alicloud_slbs":                    {Tok: alicloudDataSource(slbMod, "getLoadBalancers")},
			"alicloud_vpcs":                    {Tok: alicloudDataSource(vpcMod, "getNetworks")},
			"alicloud_vpn_connections":         {Tok: alicloudDataSource(vpnMod, "getConnections")},
			"alicloud_vpn_customer_gateways":   {Tok: alicloudDataSource(vpnMod, "getCustomerGateways")},
			"alicloud_vpn_gateways":            {Tok: alicloudDataSource(vpnMod, "getGateways")},
			"alicloud_vswitches":               {Tok: alicloudDataSource(vpcMod, "getSwitches")},
			"alicloud_zones":                   {Tok: alicloudDataSource(alicloudMod, "getZones")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
			},
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^0.15.3-dev",
			},
			Overlay: &tfbridge.OverlayInfo{
				Files:   []string{},
				Modules: map[string]*tfbridge.OverlayInfo{},
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=0.15.1,<0.16.0",
			},
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
