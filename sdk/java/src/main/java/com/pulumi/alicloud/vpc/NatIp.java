// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.NatIpArgs;
import com.pulumi.alicloud.vpc.inputs.NatIpState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a VPC Nat Ip resource.
 * 
 * For information about VPC Nat Ip and how to use it, see [What is Nat Ip](https://www.alibabacloud.com/help/doc-detail/281976.htm).
 * 
 * &gt; **NOTE:** Available since v1.136.0.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.vpc.NatGateway;
 * import com.pulumi.alicloud.vpc.NatGatewayArgs;
 * import com.pulumi.alicloud.vpc.NatIpCidr;
 * import com.pulumi.alicloud.vpc.NatIpCidrArgs;
 * import com.pulumi.alicloud.vpc.NatIp;
 * import com.pulumi.alicloud.vpc.NatIpArgs;
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
 *         final var example = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation("VSwitch")
 *             .build());
 * 
 *         var exampleNetwork = new Network("exampleNetwork", NetworkArgs.builder()
 *             .vpcName("terraform-example")
 *             .cidrBlock("172.16.0.0/12")
 *             .build());
 * 
 *         var exampleSwitch = new Switch("exampleSwitch", SwitchArgs.builder()
 *             .vpcId(exampleNetwork.id())
 *             .cidrBlock("172.16.0.0/21")
 *             .zoneId(example.zones()[0].id())
 *             .vswitchName("terraform-example")
 *             .build());
 * 
 *         var exampleNatGateway = new NatGateway("exampleNatGateway", NatGatewayArgs.builder()
 *             .vpcId(exampleNetwork.id())
 *             .internetChargeType("PayByLcu")
 *             .natGatewayName("terraform-example")
 *             .description("terraform-example")
 *             .natType("Enhanced")
 *             .vswitchId(exampleSwitch.id())
 *             .networkType("intranet")
 *             .build());
 * 
 *         var exampleNatIpCidr = new NatIpCidr("exampleNatIpCidr", NatIpCidrArgs.builder()
 *             .natIpCidr("192.168.0.0/16")
 *             .natGatewayId(exampleNatGateway.id())
 *             .natIpCidrDescription("terraform-example")
 *             .natIpCidrName("terraform-example")
 *             .build());
 * 
 *         var exampleNatIp = new NatIp("exampleNatIp", NatIpArgs.builder()
 *             .natIp("192.168.0.37")
 *             .natGatewayId(exampleNatGateway.id())
 *             .natIpDescription("example_value")
 *             .natIpName("example_value")
 *             .natIpCidr(exampleNatIpCidr.natIpCidr())
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
 * VPC Nat Ip can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:vpc/natIp:NatIp example &lt;nat_gateway_id&gt;:&lt;nat_ip_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/natIp:NatIp")
public class NatIp extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to check the validity of the request without actually making the request.
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> dryRun;

    /**
     * @return Specifies whether to check the validity of the request without actually making the request.
     * 
     */
    public Output<Boolean> dryRun() {
        return this.dryRun;
    }
    /**
     * The ID of the Virtual Private Cloud (VPC) NAT gateway for which you want to create the NAT IP address.
     * 
     */
    @Export(name="natGatewayId", refs={String.class}, tree="[0]")
    private Output<String> natGatewayId;

    /**
     * @return The ID of the Virtual Private Cloud (VPC) NAT gateway for which you want to create the NAT IP address.
     * 
     */
    public Output<String> natGatewayId() {
        return this.natGatewayId;
    }
    /**
     * The NAT IP address that you want to create. If you do not specify an IP address, the system selects a random IP address from the specified CIDR block.
     * 
     */
    @Export(name="natIp", refs={String.class}, tree="[0]")
    private Output<String> natIp;

    /**
     * @return The NAT IP address that you want to create. If you do not specify an IP address, the system selects a random IP address from the specified CIDR block.
     * 
     */
    public Output<String> natIp() {
        return this.natIp;
    }
    /**
     * NAT IP ADDRESS of the address segment.
     * 
     */
    @Export(name="natIpCidr", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> natIpCidr;

    /**
     * @return NAT IP ADDRESS of the address segment.
     * 
     */
    public Output<Optional<String>> natIpCidr() {
        return Codegen.optional(this.natIpCidr);
    }
    /**
     * The ID of the CIDR block to which the NAT IP address belongs.
     * 
     */
    @Export(name="natIpCidrId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> natIpCidrId;

    /**
     * @return The ID of the CIDR block to which the NAT IP address belongs.
     * 
     */
    public Output<Optional<String>> natIpCidrId() {
        return Codegen.optional(this.natIpCidrId);
    }
    /**
     * NAT IP ADDRESS description of information. Length is from `2` to `256` characters, must start with a letter or the Chinese at the beginning, but not at the`  http:// ` Or `https://` at the beginning.
     * 
     */
    @Export(name="natIpDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> natIpDescription;

    /**
     * @return NAT IP ADDRESS description of information. Length is from `2` to `256` characters, must start with a letter or the Chinese at the beginning, but not at the`  http:// ` Or `https://` at the beginning.
     * 
     */
    public Output<Optional<String>> natIpDescription() {
        return Codegen.optional(this.natIpDescription);
    }
    /**
     * Ihe ID of the Nat Ip.
     * 
     */
    @Export(name="natIpId", refs={String.class}, tree="[0]")
    private Output<String> natIpId;

    /**
     * @return Ihe ID of the Nat Ip.
     * 
     */
    public Output<String> natIpId() {
        return this.natIpId;
    }
    /**
     * NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
     * 
     */
    @Export(name="natIpName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> natIpName;

    /**
     * @return NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
     * 
     */
    public Output<Optional<String>> natIpName() {
        return Codegen.optional(this.natIpName);
    }
    /**
     * The status of the NAT IP address. Valid values: `Available`, `Deleting`, `Creating` and `Deleted`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the NAT IP address. Valid values: `Available`, `Deleting`, `Creating` and `Deleted`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NatIp(java.lang.String name) {
        this(name, NatIpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NatIp(java.lang.String name, NatIpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NatIp(java.lang.String name, NatIpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/natIp:NatIp", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NatIp(java.lang.String name, Output<java.lang.String> id, @Nullable NatIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/natIp:NatIp", name, state, makeResourceOptions(options, id), false);
    }

    private static NatIpArgs makeArgs(NatIpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NatIpArgs.Empty : args;
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
    public static NatIp get(java.lang.String name, Output<java.lang.String> id, @Nullable NatIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NatIp(name, id, state, options);
    }
}
