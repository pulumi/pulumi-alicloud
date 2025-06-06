// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cloudfirewall.FirewallVpcFirewallArgs;
import com.pulumi.alicloud.cloudfirewall.inputs.FirewallVpcFirewallState;
import com.pulumi.alicloud.cloudfirewall.outputs.FirewallVpcFirewallLocalVpc;
import com.pulumi.alicloud.cloudfirewall.outputs.FirewallVpcFirewallPeerVpc;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Firewall Vpc Firewall resource.
 * 
 * For information about Cloud Firewall Vpc Firewall and how to use it, see [What is Vpc Firewall](https://www.alibabacloud.com/help/en/cloud-firewall/developer-reference/api-cloudfw-2017-12-07-createvpcfirewallconfigure).
 * 
 * &gt; **NOTE:** Available since v1.194.0.
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
 * import com.pulumi.alicloud.cloudfirewall.FirewallVpcFirewall;
 * import com.pulumi.alicloud.cloudfirewall.FirewallVpcFirewallArgs;
 * import com.pulumi.alicloud.cloudfirewall.inputs.FirewallVpcFirewallLocalVpcArgs;
 * import com.pulumi.alicloud.cloudfirewall.inputs.FirewallVpcFirewallPeerVpcArgs;
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
 *         final var current = AlicloudFunctions.getAccount(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var default_ = new FirewallVpcFirewall("default", FirewallVpcFirewallArgs.builder()
 *             .vpcFirewallName("tf-example")
 *             .memberUid(current.id())
 *             .localVpc(FirewallVpcFirewallLocalVpcArgs.builder()
 *                 .vpcId("vpc-bp1d065m6hzn1xbw8ibfd")
 *                 .regionNo("cn-hangzhou")
 *                 .localVpcCidrTableLists(FirewallVpcFirewallLocalVpcLocalVpcCidrTableListArgs.builder()
 *                     .localRouteTableId("vtb-bp1lj0ddg846856chpzrv")
 *                     .localRouteEntryLists(FirewallVpcFirewallLocalVpcLocalVpcCidrTableListLocalRouteEntryListArgs.builder()
 *                         .localNextHopInstanceId("ri-bp1uobww3aputjlwwkyrh")
 *                         .localDestinationCidr("10.1.0.0/16")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .peerVpc(FirewallVpcFirewallPeerVpcArgs.builder()
 *                 .vpcId("vpc-bp1gcmm64o3caox84v0nz")
 *                 .regionNo("cn-hangzhou")
 *                 .peerVpcCidrTableLists(FirewallVpcFirewallPeerVpcPeerVpcCidrTableListArgs.builder()
 *                     .peerRouteTableId("vtb-bp1f516f2hh4sok1ig9b5")
 *                     .peerRouteEntryLists(FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListArgs.builder()
 *                         .peerDestinationCidr("10.0.0.0/16")
 *                         .peerNextHopInstanceId("ri-bp1thhtgf6ydr2or52l3n")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .status("open")
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
 * Cloud Firewall Vpc Firewall can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cloudfirewall/firewallVpcFirewall:FirewallVpcFirewall example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cloudfirewall/firewallVpcFirewall:FirewallVpcFirewall")
public class FirewallVpcFirewall extends com.pulumi.resources.CustomResource {
    /**
     * Bandwidth specifications for high-speed channels. Unit: Mbps.
     * 
     */
    @Export(name="bandwidth", refs={Integer.class}, tree="[0]")
    private Output<Integer> bandwidth;

    /**
     * @return Bandwidth specifications for high-speed channels. Unit: Mbps.
     * 
     */
    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }
    /**
     * The communication type of the VPC firewall.
     * 
     */
    @Export(name="connectType", refs={String.class}, tree="[0]")
    private Output<String> connectType;

    /**
     * @return The communication type of the VPC firewall.
     * 
     */
    public Output<String> connectType() {
        return this.connectType;
    }
    /**
     * The language type of the requested and received messages. Valid values:
     * 
     */
    @Export(name="lang", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lang;

    /**
     * @return The language type of the requested and received messages. Valid values:
     * 
     */
    public Output<Optional<String>> lang() {
        return Codegen.optional(this.lang);
    }
    /**
     * The details of the local VPC. See `local_vpc` below.
     * 
     */
    @Export(name="localVpc", refs={FirewallVpcFirewallLocalVpc.class}, tree="[0]")
    private Output<FirewallVpcFirewallLocalVpc> localVpc;

    /**
     * @return The details of the local VPC. See `local_vpc` below.
     * 
     */
    public Output<FirewallVpcFirewallLocalVpc> localVpc() {
        return this.localVpc;
    }
    /**
     * The UID of the Alibaba Cloud member account.
     * 
     */
    @Export(name="memberUid", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> memberUid;

    /**
     * @return The UID of the Alibaba Cloud member account.
     * 
     */
    public Output<Optional<String>> memberUid() {
        return Codegen.optional(this.memberUid);
    }
    /**
     * The details of the peer VPC. See `peer_vpc` below.
     * 
     */
    @Export(name="peerVpc", refs={FirewallVpcFirewallPeerVpc.class}, tree="[0]")
    private Output<FirewallVpcFirewallPeerVpc> peerVpc;

    /**
     * @return The details of the peer VPC. See `peer_vpc` below.
     * 
     */
    public Output<FirewallVpcFirewallPeerVpc> peerVpc() {
        return this.peerVpc;
    }
    /**
     * The region is open.
     * 
     */
    @Export(name="regionStatus", refs={String.class}, tree="[0]")
    private Output<String> regionStatus;

    /**
     * @return The region is open.
     * 
     */
    public Output<String> regionStatus() {
        return this.regionStatus;
    }
    /**
     * The status of the resource. Valid values:
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource. Valid values:
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The ID of the VPC firewall instance.
     * 
     */
    @Export(name="vpcFirewallId", refs={String.class}, tree="[0]")
    private Output<String> vpcFirewallId;

    /**
     * @return The ID of the VPC firewall instance.
     * 
     */
    public Output<String> vpcFirewallId() {
        return this.vpcFirewallId;
    }
    /**
     * The name of the VPC firewall instance.
     * 
     */
    @Export(name="vpcFirewallName", refs={String.class}, tree="[0]")
    private Output<String> vpcFirewallName;

    /**
     * @return The name of the VPC firewall instance.
     * 
     */
    public Output<String> vpcFirewallName() {
        return this.vpcFirewallName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallVpcFirewall(java.lang.String name) {
        this(name, FirewallVpcFirewallArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallVpcFirewall(java.lang.String name, FirewallVpcFirewallArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallVpcFirewall(java.lang.String name, FirewallVpcFirewallArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudfirewall/firewallVpcFirewall:FirewallVpcFirewall", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FirewallVpcFirewall(java.lang.String name, Output<java.lang.String> id, @Nullable FirewallVpcFirewallState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudfirewall/firewallVpcFirewall:FirewallVpcFirewall", name, state, makeResourceOptions(options, id), false);
    }

    private static FirewallVpcFirewallArgs makeArgs(FirewallVpcFirewallArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FirewallVpcFirewallArgs.Empty : args;
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
    public static FirewallVpcFirewall get(java.lang.String name, Output<java.lang.String> id, @Nullable FirewallVpcFirewallState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallVpcFirewall(name, id, state, options);
    }
}
