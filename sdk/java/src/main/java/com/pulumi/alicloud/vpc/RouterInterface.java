// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.RouterInterfaceArgs;
import com.pulumi.alicloud.vpc.inputs.RouterInterfaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a VPC router interface resource aim to build a connection between two VPCs.
 * 
 * &gt; **DEPRECATED:**  This resource  has been deprecated from version `1.199.0`. Please use new resource alicloud_express_connect_router_interface.
 * 
 * &gt; **NOTE:** Only one pair of connected router interfaces can exist between two routers. Up to 5 router interfaces can be created for each router and each account.
 * 
 * &gt; **NOTE:** The router interface is not connected when it is created. It can be connected by means of resource alicloud_router_interface_connection.
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
 *         var foo = new Network("foo", NetworkArgs.builder()
 *             .vpcName("tf_test_foo12345")
 *             .cidrBlock("172.16.0.0/12")
 *             .build());
 * 
 *         var interface_ = new RouterInterface("interface", RouterInterfaceArgs.builder()
 *             .oppositeRegion("cn-beijing")
 *             .routerType("VRouter")
 *             .routerId(foo.routerId())
 *             .role("InitiatingSide")
 *             .specification("Large.2")
 *             .name("test1")
 *             .description("test1")
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
 * The router interface can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:vpc/routerInterface:RouterInterface interface ri-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/routerInterface:RouterInterface")
public class RouterInterface extends com.pulumi.resources.CustomResource {
    /**
     * It has been deprecated from version 1.11.0.
     * 
     * @deprecated
     * Attribute &#39;opposite_access_point_id&#39; has been deprecated from version 1.11.0.
     * 
     */
    @Deprecated /* Attribute 'opposite_access_point_id' has been deprecated from version 1.11.0. */
    @Export(name="accessPointId", refs={String.class}, tree="[0]")
    private Output<String> accessPointId;

    /**
     * @return It has been deprecated from version 1.11.0.
     * 
     */
    public Output<String> accessPointId() {
        return this.accessPointId;
    }
    /**
     * Description of the router interface. It can be 2-256 characters long or left blank. It cannot start with http:// and https://.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the router interface. It can be 2-256 characters long or left blank. It cannot start with http:// and https://.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Used as the Packet Source IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_target_ip` must be specified at the same time.
     * 
     */
    @Export(name="healthCheckSourceIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> healthCheckSourceIp;

    /**
     * @return Used as the Packet Source IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_target_ip` must be specified at the same time.
     * 
     */
    public Output<Optional<String>> healthCheckSourceIp() {
        return Codegen.optional(this.healthCheckSourceIp);
    }
    /**
     * Used as the Packet Target IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_source_ip` must be specified at the same time.
     * 
     */
    @Export(name="healthCheckTargetIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> healthCheckTargetIp;

    /**
     * @return Used as the Packet Target IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_source_ip` must be specified at the same time.
     * 
     */
    public Output<Optional<String>> healthCheckTargetIp() {
        return Codegen.optional(this.healthCheckTargetIp);
    }
    /**
     * The billing method of the router interface. Valid values are &#34;PrePaid&#34; and &#34;PostPaid&#34;. Default to &#34;PostPaid&#34;. Router Interface doesn&#39;t support &#34;PrePaid&#34; when region and opposite_region are the same.
     * 
     */
    @Export(name="instanceChargeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceChargeType;

    /**
     * @return The billing method of the router interface. Valid values are &#34;PrePaid&#34; and &#34;PostPaid&#34;. Default to &#34;PostPaid&#34;. Router Interface doesn&#39;t support &#34;PrePaid&#34; when region and opposite_region are the same.
     * 
     */
    public Output<Optional<String>> instanceChargeType() {
        return Codegen.optional(this.instanceChargeType);
    }
    /**
     * Name of the router interface. Length must be 2-80 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted.
     * If it is not specified, the default value is interface ID. The name cannot start with http:// and https://.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the router interface. Length must be 2-80 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted.
     * If it is not specified, the default value is interface ID. The name cannot start with http:// and https://.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * It has been deprecated from version 1.11.0.
     * 
     * @deprecated
     * Attribute &#39;opposite_access_point_id&#39; has been deprecated from version 1.11.0.
     * 
     */
    @Deprecated /* Attribute 'opposite_access_point_id' has been deprecated from version 1.11.0. */
    @Export(name="oppositeAccessPointId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oppositeAccessPointId;

    /**
     * @return It has been deprecated from version 1.11.0.
     * 
     */
    public Output<Optional<String>> oppositeAccessPointId() {
        return Codegen.optional(this.oppositeAccessPointId);
    }
    /**
     * It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection&#39;s &#39;opposite_router_id&#39; instead.
     * 
     * @deprecated
     * Attribute &#39;opposite_interface_id&#39; has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection&#39;s &#39;opposite_interface_id&#39; instead.
     * 
     */
    @Deprecated /* Attribute 'opposite_interface_id' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_id' instead. */
    @Export(name="oppositeInterfaceId", refs={String.class}, tree="[0]")
    private Output<String> oppositeInterfaceId;

    /**
     * @return It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection&#39;s &#39;opposite_router_id&#39; instead.
     * 
     */
    public Output<String> oppositeInterfaceId() {
        return this.oppositeInterfaceId;
    }
    /**
     * It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection&#39;s &#39;opposite_interface_id&#39; instead.
     * 
     * @deprecated
     * Attribute &#39;opposite_interface_owner_id&#39; has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection&#39;s &#39;opposite_interface_owner_id&#39; instead.
     * 
     */
    @Deprecated /* Attribute 'opposite_interface_owner_id' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_owner_id' instead. */
    @Export(name="oppositeInterfaceOwnerId", refs={String.class}, tree="[0]")
    private Output<String> oppositeInterfaceOwnerId;

    /**
     * @return It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection&#39;s &#39;opposite_interface_id&#39; instead.
     * 
     */
    public Output<String> oppositeInterfaceOwnerId() {
        return this.oppositeInterfaceOwnerId;
    }
    /**
     * The Region of peer side.
     * 
     */
    @Export(name="oppositeRegion", refs={String.class}, tree="[0]")
    private Output<String> oppositeRegion;

    /**
     * @return The Region of peer side.
     * 
     */
    public Output<String> oppositeRegion() {
        return this.oppositeRegion;
    }
    /**
     * It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection&#39;s &#39;opposite_router_id&#39; instead.
     * 
     * @deprecated
     * Attribute &#39;opposite_router_id&#39; has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection&#39;s &#39;opposite_router_id&#39; instead.
     * 
     */
    @Deprecated /* Attribute 'opposite_router_id' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead. */
    @Export(name="oppositeRouterId", refs={String.class}, tree="[0]")
    private Output<String> oppositeRouterId;

    /**
     * @return It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection&#39;s &#39;opposite_router_id&#39; instead.
     * 
     */
    public Output<String> oppositeRouterId() {
        return this.oppositeRouterId;
    }
    /**
     * It has been deprecated from version 1.11.0. resource alicloud_router_interface_connection&#39;s &#39;opposite_router_type&#39; instead.
     * 
     * @deprecated
     * Attribute &#39;opposite_router_type&#39; has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection&#39;s &#39;opposite_router_type&#39; instead.
     * 
     */
    @Deprecated /* Attribute 'opposite_router_type' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_type' instead. */
    @Export(name="oppositeRouterType", refs={String.class}, tree="[0]")
    private Output<String> oppositeRouterType;

    /**
     * @return It has been deprecated from version 1.11.0. resource alicloud_router_interface_connection&#39;s &#39;opposite_router_type&#39; instead.
     * 
     */
    public Output<String> oppositeRouterType() {
        return this.oppositeRouterType;
    }
    /**
     * The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify &#34;period&#34; and you can do that via web console.
     * &gt; **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
     * 
     */
    @Export(name="period", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> period;

    /**
     * @return The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify &#34;period&#34; and you can do that via web console.
     * &gt; **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * The role the router interface plays. Optional value: `InitiatingSide`, `AcceptingSide`.
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    /**
     * @return The role the router interface plays. Optional value: `InitiatingSide`, `AcceptingSide`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * The Router ID.
     * 
     */
    @Export(name="routerId", refs={String.class}, tree="[0]")
    private Output<String> routerId;

    /**
     * @return The Router ID.
     * 
     */
    public Output<String> routerId() {
        return this.routerId;
    }
    /**
     * Router Type. Optional value: VRouter, VBR. Accepting side router interface type only be VRouter.
     * 
     */
    @Export(name="routerType", refs={String.class}, tree="[0]")
    private Output<String> routerType;

    /**
     * @return Router Type. Optional value: VRouter, VBR. Accepting side router interface type only be VRouter.
     * 
     */
    public Output<String> routerType() {
        return this.routerType;
    }
    /**
     * Specification of router interfaces. It is valid when `role` is `InitiatingSide`. Accepting side&#39;s role is default to set as &#39;Negative&#39;. For more about the specification, refer to [Router interface specification](https://www.alibabacloud.com/help/doc-detail/36037.htm).
     * 
     */
    @Export(name="specification", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> specification;

    /**
     * @return Specification of router interfaces. It is valid when `role` is `InitiatingSide`. Accepting side&#39;s role is default to set as &#39;Negative&#39;. For more about the specification, refer to [Router interface specification](https://www.alibabacloud.com/help/doc-detail/36037.htm).
     * 
     */
    public Output<Optional<String>> specification() {
        return Codegen.optional(this.specification);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouterInterface(java.lang.String name) {
        this(name, RouterInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouterInterface(java.lang.String name, RouterInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouterInterface(java.lang.String name, RouterInterfaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/routerInterface:RouterInterface", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RouterInterface(java.lang.String name, Output<java.lang.String> id, @Nullable RouterInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/routerInterface:RouterInterface", name, state, makeResourceOptions(options, id), false);
    }

    private static RouterInterfaceArgs makeArgs(RouterInterfaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RouterInterfaceArgs.Empty : args;
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
    public static RouterInterface get(java.lang.String name, Output<java.lang.String> id, @Nullable RouterInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouterInterface(name, id, state, options);
    }
}
