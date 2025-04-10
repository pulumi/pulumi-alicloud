// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.RouterInterfaceConnectionArgs;
import com.pulumi.alicloud.vpc.inputs.RouterInterfaceConnectionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **DEPRECATED:**  This resource has been deprecated from version `1.199.0`. Please use new resource alicloud_express_connect_router_interface.
 * 
 * Provides a VPC router interface connection resource to connect two router interfaces which are in two different VPCs.
 * After that, all of the two router interfaces will be active.
 * 
 * &gt; **NOTE:** At present, Router interface does not support changing opposite router interface, the connection delete action is only deactivating it to inactive, not modifying the connection to empty.
 * 
 * &gt; **NOTE:** If you want to changing opposite router interface, you can delete router interface and re-build them.
 * 
 * &gt; **NOTE:** A integrated router interface connection tunnel requires both InitiatingSide and AcceptingSide configuring opposite router interface.
 * 
 * &gt; **NOTE:** Please remember to add a `depends_on` clause in the router interface connection from the InitiatingSide to the AcceptingSide, because the connection from the AcceptingSide to the InitiatingSide must be done first.
 * 
 * ## Example Usage
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
 * import com.pulumi.alicloud.vpc.RouterInterface;
 * import com.pulumi.alicloud.vpc.RouterInterfaceArgs;
 * import com.pulumi.alicloud.vpc.RouterInterfaceConnection;
 * import com.pulumi.alicloud.vpc.RouterInterfaceConnectionArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         final var region = config.get("region").orElse("cn-hangzhou");
 *         final var name = config.get("name").orElse("alicloudRouterInterfaceConnectionBasic");
 *         var foo = new Network("foo", NetworkArgs.builder()
 *             .vpcName(name)
 *             .cidrBlock("172.16.0.0/12")
 *             .build());
 * 
 *         var bar = new Network("bar", NetworkArgs.builder()
 *             .vpcName(name)
 *             .cidrBlock("192.168.0.0/16")
 *             .build());
 * 
 *         var initiate = new RouterInterface("initiate", RouterInterfaceArgs.builder()
 *             .oppositeRegion(region)
 *             .routerType("VRouter")
 *             .routerId(foo.routerId())
 *             .role("InitiatingSide")
 *             .specification("Large.2")
 *             .name(name)
 *             .description(name)
 *             .instanceChargeType("PostPaid")
 *             .build());
 * 
 *         var opposite = new RouterInterface("opposite", RouterInterfaceArgs.builder()
 *             .oppositeRegion(region)
 *             .routerType("VRouter")
 *             .routerId(bar.routerId())
 *             .role("AcceptingSide")
 *             .specification("Large.1")
 *             .name(String.format("%s-opposite", name))
 *             .description(String.format("%s-opposite", name))
 *             .build());
 * 
 *         var barRouterInterfaceConnection = new RouterInterfaceConnection("barRouterInterfaceConnection", RouterInterfaceConnectionArgs.builder()
 *             .interfaceId(opposite.id())
 *             .oppositeInterfaceId(initiate.id())
 *             .build());
 * 
 *         // A integrated router interface connection tunnel requires both InitiatingSide and AcceptingSide configuring opposite router interface.
 *         var fooRouterInterfaceConnection = new RouterInterfaceConnection("fooRouterInterfaceConnection", RouterInterfaceConnectionArgs.builder()
 *             .interfaceId(initiate.id())
 *             .oppositeInterfaceId(opposite.id())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(barRouterInterfaceConnection)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * The router interface connection can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection foo ri-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection")
public class RouterInterfaceConnection extends com.pulumi.resources.CustomResource {
    /**
     * One side router interface ID.
     * 
     */
    @Export(name="interfaceId", refs={String.class}, tree="[0]")
    private Output<String> interfaceId;

    /**
     * @return One side router interface ID.
     * 
     */
    public Output<String> interfaceId() {
        return this.interfaceId;
    }
    /**
     * Another side router interface ID. It must belong the specified &#34;opposite_interface_owner_id&#34; account.
     * 
     */
    @Export(name="oppositeInterfaceId", refs={String.class}, tree="[0]")
    private Output<String> oppositeInterfaceId;

    /**
     * @return Another side router interface ID. It must belong the specified &#34;opposite_interface_owner_id&#34; account.
     * 
     */
    public Output<String> oppositeInterfaceId() {
        return this.oppositeInterfaceId;
    }
    /**
     * Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info &gt; Account Management to check the account ID. Default to Provider account_id.
     * 
     */
    @Export(name="oppositeInterfaceOwnerId", refs={String.class}, tree="[0]")
    private Output<String> oppositeInterfaceOwnerId;

    /**
     * @return Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info &gt; Account Management to check the account ID. Default to Provider account_id.
     * 
     */
    public Output<String> oppositeInterfaceOwnerId() {
        return this.oppositeInterfaceOwnerId;
    }
    /**
     * Another side router ID. It must belong the specified &#34;opposite_interface_owner_id&#34; account. It is valid when field &#34;opposite_interface_owner_id&#34; is specified.
     * 
     */
    @Export(name="oppositeRouterId", refs={String.class}, tree="[0]")
    private Output<String> oppositeRouterId;

    /**
     * @return Another side router ID. It must belong the specified &#34;opposite_interface_owner_id&#34; account. It is valid when field &#34;opposite_interface_owner_id&#34; is specified.
     * 
     */
    public Output<String> oppositeRouterId() {
        return this.oppositeRouterId;
    }
    /**
     * Another side router Type. Optional value: VRouter, VBR. It is valid when field &#34;opposite_interface_owner_id&#34; is specified.
     * 
     * &gt; **NOTE:** The value of &#34;opposite_interface_owner_id&#34; or &#34;account_id&#34; must be main account and not be sub account.
     * 
     */
    @Export(name="oppositeRouterType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oppositeRouterType;

    /**
     * @return Another side router Type. Optional value: VRouter, VBR. It is valid when field &#34;opposite_interface_owner_id&#34; is specified.
     * 
     * &gt; **NOTE:** The value of &#34;opposite_interface_owner_id&#34; or &#34;account_id&#34; must be main account and not be sub account.
     * 
     */
    public Output<Optional<String>> oppositeRouterType() {
        return Codegen.optional(this.oppositeRouterType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouterInterfaceConnection(java.lang.String name) {
        this(name, RouterInterfaceConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouterInterfaceConnection(java.lang.String name, RouterInterfaceConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouterInterfaceConnection(java.lang.String name, RouterInterfaceConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RouterInterfaceConnection(java.lang.String name, Output<java.lang.String> id, @Nullable RouterInterfaceConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection", name, state, makeResourceOptions(options, id), false);
    }

    private static RouterInterfaceConnectionArgs makeArgs(RouterInterfaceConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RouterInterfaceConnectionArgs.Empty : args;
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
    public static RouterInterfaceConnection get(java.lang.String name, Output<java.lang.String> id, @Nullable RouterInterfaceConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouterInterfaceConnection(name, id, state, options);
    }
}
