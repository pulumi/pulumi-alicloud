// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.BgpNetworkArgs;
import com.pulumi.alicloud.vpc.inputs.BgpNetworkState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a VPC Bgp Network resource.
 * 
 * For information about VPC Bgp Network and how to use it, see [What is Bgp Network](https://www.alibabacloud.com/help/en/doc-detail/91267.html).
 * 
 * &gt; **NOTE:** Available since v1.153.0.
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
 * import com.pulumi.alicloud.expressconnect.ExpressconnectFunctions;
 * import com.pulumi.alicloud.expressconnect.inputs.GetPhysicalConnectionsArgs;
 * import com.pulumi.random.integer;
 * import com.pulumi.random.integerArgs;
 * import com.pulumi.alicloud.expressconnect.VirtualBorderRouter;
 * import com.pulumi.alicloud.expressconnect.VirtualBorderRouterArgs;
 * import com.pulumi.alicloud.vpc.BgpNetwork;
 * import com.pulumi.alicloud.vpc.BgpNetworkArgs;
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
 *         final var example = ExpressconnectFunctions.getPhysicalConnections(GetPhysicalConnectionsArgs.builder()
 *             .nameRegex("^preserved-NODELETING")
 *             .build());
 * 
 *         var vlanId = new Integer("vlanId", IntegerArgs.builder()
 *             .max(2999)
 *             .min(1)
 *             .build());
 * 
 *         var exampleVirtualBorderRouter = new VirtualBorderRouter("exampleVirtualBorderRouter", VirtualBorderRouterArgs.builder()
 *             .localGatewayIp("10.0.0.1")
 *             .peerGatewayIp("10.0.0.2")
 *             .peeringSubnetMask("255.255.255.252")
 *             .physicalConnectionId(example.connections()[0].id())
 *             .virtualBorderRouterName(name)
 *             .vlanId(vlanId.id())
 *             .minRxInterval(1000)
 *             .minTxInterval(1000)
 *             .detectMultiplier(10)
 *             .build());
 * 
 *         var exampleBgpNetwork = new BgpNetwork("exampleBgpNetwork", BgpNetworkArgs.builder()
 *             .dstCidrBlock("192.168.0.0/24")
 *             .routerId(exampleVirtualBorderRouter.id())
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
 * VPC Bgp Network can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:vpc/bgpNetwork:BgpNetwork example &lt;router_id&gt;:&lt;dst_cidr_block&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/bgpNetwork:BgpNetwork")
public class BgpNetwork extends com.pulumi.resources.CustomResource {
    /**
     * The CIDR block of the virtual private cloud (VPC) or vSwitch that you want to connect to a data center.
     * 
     */
    @Export(name="dstCidrBlock", refs={String.class}, tree="[0]")
    private Output<String> dstCidrBlock;

    /**
     * @return The CIDR block of the virtual private cloud (VPC) or vSwitch that you want to connect to a data center.
     * 
     */
    public Output<String> dstCidrBlock() {
        return this.dstCidrBlock;
    }
    /**
     * The ID of the vRouter associated with the router interface.
     * 
     */
    @Export(name="routerId", refs={String.class}, tree="[0]")
    private Output<String> routerId;

    /**
     * @return The ID of the vRouter associated with the router interface.
     * 
     */
    public Output<String> routerId() {
        return this.routerId;
    }
    /**
     * The state of the advertised BGP network.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The state of the advertised BGP network.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BgpNetwork(java.lang.String name) {
        this(name, BgpNetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BgpNetwork(java.lang.String name, BgpNetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BgpNetwork(java.lang.String name, BgpNetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/bgpNetwork:BgpNetwork", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private BgpNetwork(java.lang.String name, Output<java.lang.String> id, @Nullable BgpNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/bgpNetwork:BgpNetwork", name, state, makeResourceOptions(options, id), false);
    }

    private static BgpNetworkArgs makeArgs(BgpNetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BgpNetworkArgs.Empty : args;
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
    public static BgpNetwork get(java.lang.String name, Output<java.lang.String> id, @Nullable BgpNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BgpNetwork(name, id, state, options);
    }
}
