// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.EcsNetworkInterfaceArgs;
import com.pulumi.alicloud.ecs.inputs.EcsNetworkInterfaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECS Network Interface resource.
 * 
 * For information about ECS Network Interface and how to use it, see [What is Network Interface](https://www.alibabacloud.com/help/en/doc-detail/58504.htm).
 * 
 * &gt; **NOTE:** Available since v1.123.1.
 * 
 * &gt; **NOTE** Only one of `private_ip_addresses` or `secondary_private_ip_address_count` can be specified when assign private IPs.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetResourceGroupsArgs;
 * import com.pulumi.alicloud.ecs.EcsNetworkInterface;
 * import com.pulumi.alicloud.ecs.EcsNetworkInterfaceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var name = config.get("name").orElse("tf-example");
 *         var defaultNetwork = new Network("defaultNetwork", NetworkArgs.builder()
 *             .vpcName(name)
 *             .cidrBlock("192.168.0.0/24")
 *             .build());
 * 
 *         final var default = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation("VSwitch")
 *             .build());
 * 
 *         var defaultSwitch = new Switch("defaultSwitch", SwitchArgs.builder()
 *             .vswitchName(name)
 *             .cidrBlock("192.168.0.0/24")
 *             .zoneId(default_.zones()[0].id())
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup("defaultSecurityGroup", SecurityGroupArgs.builder()
 *             .name(name)
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         final var defaultGetResourceGroups = ResourcemanagerFunctions.getResourceGroups(GetResourceGroupsArgs.builder()
 *             .status("OK")
 *             .build());
 * 
 *         var defaultEcsNetworkInterface = new EcsNetworkInterface("defaultEcsNetworkInterface", EcsNetworkInterfaceArgs.builder()
 *             .networkInterfaceName(name)
 *             .vswitchId(defaultSwitch.id())
 *             .securityGroupIds(defaultSecurityGroup.id())
 *             .description("Basic test")
 *             .primaryIpAddress("192.168.0.2")
 *             .tags(Map.ofEntries(
 *                 Map.entry("Created", "TF"),
 *                 Map.entry("For", "Test")
 *             ))
 *             .resourceGroupId(defaultGetResourceGroups.ids()[0])
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ECS Network Interface can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ecs/ecsNetworkInterface:EcsNetworkInterface example eni-abcd12345
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/ecsNetworkInterface:EcsNetworkInterface")
public class EcsNetworkInterface extends com.pulumi.resources.CustomResource {
    /**
     * The description of the ENI. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the ENI. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The type of the ENI. Default value: `Secondary`. Valid values: `Secondary`, `Trunk`.
     * 
     */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output<String> instanceType;

    /**
     * @return The type of the ENI. Default value: `Secondary`. Valid values: `Secondary`, `Trunk`.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * The number of IPv4 prefixes that can be automatically created by ECS. Valid values: 1 to 10. **NOTE:** You cannot specify both the `ipv4_prefixes` and `ipv4_prefix_count` parameters.
     * 
     */
    @Export(name="ipv4PrefixCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> ipv4PrefixCount;

    /**
     * @return The number of IPv4 prefixes that can be automatically created by ECS. Valid values: 1 to 10. **NOTE:** You cannot specify both the `ipv4_prefixes` and `ipv4_prefix_count` parameters.
     * 
     */
    public Output<Integer> ipv4PrefixCount() {
        return this.ipv4PrefixCount;
    }
    /**
     * A list of IPv4 prefixes to be assigned to the ENI. Support up to 10.
     * 
     */
    @Export(name="ipv4Prefixes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ipv4Prefixes;

    /**
     * @return A list of IPv4 prefixes to be assigned to the ENI. Support up to 10.
     * 
     */
    public Output<List<String>> ipv4Prefixes() {
        return this.ipv4Prefixes;
    }
    /**
     * The number of IPv6 addresses to randomly generate for the primary ENI. Valid values: 1 to 10. **NOTE:** You cannot specify both the `ipv6_addresses` and `ipv6_address_count` parameters.
     * 
     */
    @Export(name="ipv6AddressCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> ipv6AddressCount;

    /**
     * @return The number of IPv6 addresses to randomly generate for the primary ENI. Valid values: 1 to 10. **NOTE:** You cannot specify both the `ipv6_addresses` and `ipv6_address_count` parameters.
     * 
     */
    public Output<Integer> ipv6AddressCount() {
        return this.ipv6AddressCount;
    }
    /**
     * A list of IPv6 address to be assigned to the primary ENI. Support up to 10.
     * 
     */
    @Export(name="ipv6Addresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ipv6Addresses;

    /**
     * @return A list of IPv6 address to be assigned to the primary ENI. Support up to 10.
     * 
     */
    public Output<List<String>> ipv6Addresses() {
        return this.ipv6Addresses;
    }
    /**
     * The MAC address of the ENI.
     * 
     */
    @Export(name="mac", refs={String.class}, tree="[0]")
    private Output<String> mac;

    /**
     * @return The MAC address of the ENI.
     * 
     */
    public Output<String> mac() {
        return this.mac;
    }
    /**
     * Field `name` has been deprecated from provider version 1.123.1. New field `network_interface_name` instead
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.123.1. New field &#39;network_interface_name&#39; instead
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.123.1. New field 'network_interface_name' instead */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Field `name` has been deprecated from provider version 1.123.1. New field `network_interface_name` instead
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the ENI. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with http:// or https://.
     * 
     */
    @Export(name="networkInterfaceName", refs={String.class}, tree="[0]")
    private Output<String> networkInterfaceName;

    /**
     * @return The name of the ENI. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with http:// or https://.
     * 
     */
    public Output<String> networkInterfaceName() {
        return this.networkInterfaceName;
    }
    /**
     * The communication mode of the ENI. Default value: `Standard`. Valid values: `Standard`, `HighPerformance`.
     * 
     */
    @Export(name="networkInterfaceTrafficMode", refs={String.class}, tree="[0]")
    private Output<String> networkInterfaceTrafficMode;

    /**
     * @return The communication mode of the ENI. Default value: `Standard`. Valid values: `Standard`, `HighPerformance`.
     * 
     */
    public Output<String> networkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }
    /**
     * The primary private IP address of the ENI. The specified IP address must be available within the CIDR block of the VSwitch. If this parameter is not specified, an available IP address is assigned from the VSwitch CIDR block at random.
     * 
     */
    @Export(name="primaryIpAddress", refs={String.class}, tree="[0]")
    private Output<String> primaryIpAddress;

    /**
     * @return The primary private IP address of the ENI. The specified IP address must be available within the CIDR block of the VSwitch. If this parameter is not specified, an available IP address is assigned from the VSwitch CIDR block at random.
     * 
     */
    public Output<String> primaryIpAddress() {
        return this.primaryIpAddress;
    }
    /**
     * Field `private_ip` has been deprecated from provider version 1.123.1. New field `primary_ip_address` instead
     * 
     * @deprecated
     * Field &#39;private_ip&#39; has been deprecated from provider version 1.123.1. New field &#39;primary_ip_address&#39; instead
     * 
     */
    @Deprecated /* Field 'private_ip' has been deprecated from provider version 1.123.1. New field 'primary_ip_address' instead */
    @Export(name="privateIp", refs={String.class}, tree="[0]")
    private Output<String> privateIp;

    /**
     * @return Field `private_ip` has been deprecated from provider version 1.123.1. New field `primary_ip_address` instead
     * 
     */
    public Output<String> privateIp() {
        return this.privateIp;
    }
    /**
     * Specifies secondary private IP address N of the ENI. This IP address must be an available IP address within the CIDR block of the VSwitch to which the ENI belongs.
     * 
     */
    @Export(name="privateIpAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> privateIpAddresses;

    /**
     * @return Specifies secondary private IP address N of the ENI. This IP address must be an available IP address within the CIDR block of the VSwitch to which the ENI belongs.
     * 
     */
    public Output<List<String>> privateIpAddresses() {
        return this.privateIpAddresses;
    }
    /**
     * Field `private_ips` has been deprecated from provider version 1.123.1. New field `private_ip_addresses` instead
     * 
     * @deprecated
     * Field &#39;private_ips&#39; has been deprecated from provider version 1.123.1. New field &#39;private_ip_addresses&#39; instead
     * 
     */
    @Deprecated /* Field 'private_ips' has been deprecated from provider version 1.123.1. New field 'private_ip_addresses' instead */
    @Export(name="privateIps", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> privateIps;

    /**
     * @return Field `private_ips` has been deprecated from provider version 1.123.1. New field `private_ip_addresses` instead
     * 
     */
    public Output<List<String>> privateIps() {
        return this.privateIps;
    }
    /**
     * Field `private_ips_count` has been deprecated from provider version 1.123.1. New field `secondary_private_ip_address_count` instead
     * 
     * @deprecated
     * Field &#39;private_ips_count&#39; has been deprecated from provider version 1.123.1. New field &#39;secondary_private_ip_address_count&#39; instead
     * 
     */
    @Deprecated /* Field 'private_ips_count' has been deprecated from provider version 1.123.1. New field 'secondary_private_ip_address_count' instead */
    @Export(name="privateIpsCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> privateIpsCount;

    /**
     * @return Field `private_ips_count` has been deprecated from provider version 1.123.1. New field `secondary_private_ip_address_count` instead
     * 
     */
    public Output<Integer> privateIpsCount() {
        return this.privateIpsCount;
    }
    /**
     * The queue number of the ENI.
     * 
     */
    @Export(name="queueNumber", refs={Integer.class}, tree="[0]")
    private Output<Integer> queueNumber;

    /**
     * @return The queue number of the ENI.
     * 
     */
    public Output<Integer> queueNumber() {
        return this.queueNumber;
    }
    /**
     * The resource group id.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resourceGroupId;

    /**
     * @return The resource group id.
     * 
     */
    public Output<Optional<String>> resourceGroupId() {
        return Codegen.optional(this.resourceGroupId);
    }
    /**
     * The number of private IP addresses that can be automatically created by ECS.
     * 
     */
    @Export(name="secondaryPrivateIpAddressCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> secondaryPrivateIpAddressCount;

    /**
     * @return The number of private IP addresses that can be automatically created by ECS.
     * 
     */
    public Output<Integer> secondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }
    /**
     * The ID of security group N. The security groups and the ENI must belong to the same VPC. The valid values of N are based on the maximum number of security groups to which an ENI can be added. **NOTE:** Either `security_group_ids` or `security_groups` must be set with valid security group IDs.
     * 
     */
    @Export(name="securityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroupIds;

    /**
     * @return The ID of security group N. The security groups and the ENI must belong to the same VPC. The valid values of N are based on the maximum number of security groups to which an ENI can be added. **NOTE:** Either `security_group_ids` or `security_groups` must be set with valid security group IDs.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * Field `security_groups` has been deprecated from provider version 1.123.1. New field `security_group_ids` instead. **NOTE:** Either `security_group_ids` or `security_groups` must be set with valid security group IDs.
     * 
     * @deprecated
     * Field &#39;security_groups&#39; has been deprecated from provider version 1.123.1. New field &#39;security_group_ids&#39; instead
     * 
     */
    @Deprecated /* Field 'security_groups' has been deprecated from provider version 1.123.1. New field 'security_group_ids' instead */
    @Export(name="securityGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroups;

    /**
     * @return Field `security_groups` has been deprecated from provider version 1.123.1. New field `security_group_ids` instead. **NOTE:** Either `security_group_ids` or `security_groups` must be set with valid security group IDs.
     * 
     */
    public Output<List<String>> securityGroups() {
        return this.securityGroups;
    }
    /**
     * Indicates whether the source and destination IP address check feature is enabled. To improve network security, enable this feature. Default value: `false`. Valid values: `true`, `false`.
     * 
     */
    @Export(name="sourceDestCheck", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> sourceDestCheck;

    /**
     * @return Indicates whether the source and destination IP address check feature is enabled. To improve network security, enable this feature. Default value: `false`. Valid values: `true`, `false`.
     * 
     */
    public Output<Optional<Boolean>> sourceDestCheck() {
        return Codegen.optional(this.sourceDestCheck);
    }
    /**
     * The status of the ENI.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the ENI.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the VSwitch in the specified VPC. The private IP addresses assigned to the ENI must be available IP addresses within the CIDR block of the VSwitch.
     * 
     */
    @Export(name="vswitchId", refs={String.class}, tree="[0]")
    private Output<String> vswitchId;

    /**
     * @return The ID of the VSwitch in the specified VPC. The private IP addresses assigned to the ENI must be available IP addresses within the CIDR block of the VSwitch.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcsNetworkInterface(java.lang.String name) {
        this(name, EcsNetworkInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcsNetworkInterface(java.lang.String name, EcsNetworkInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcsNetworkInterface(java.lang.String name, EcsNetworkInterfaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsNetworkInterface:EcsNetworkInterface", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EcsNetworkInterface(java.lang.String name, Output<java.lang.String> id, @Nullable EcsNetworkInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsNetworkInterface:EcsNetworkInterface", name, state, makeResourceOptions(options, id), false);
    }

    private static EcsNetworkInterfaceArgs makeArgs(EcsNetworkInterfaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EcsNetworkInterfaceArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EcsNetworkInterface get(java.lang.String name, Output<java.lang.String> id, @Nullable EcsNetworkInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcsNetworkInterface(name, id, state, options);
    }
}
