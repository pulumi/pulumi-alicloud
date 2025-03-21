// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.TransitRouteTableAggregationArgs;
import com.pulumi.alicloud.cen.inputs.TransitRouteTableAggregationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Enterprise Network (CEN) Transit Route Table Aggregation resource.
 * 
 * For information about Cloud Enterprise Network (CEN) Transit Route Table Aggregation and how to use it, see [What is Transit Route Table Aggregation](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtransitroutetableaggregation).
 * 
 * &gt; **NOTE:** Available since v1.202.0.
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
 * import com.pulumi.alicloud.cen.Instance;
 * import com.pulumi.alicloud.cen.InstanceArgs;
 * import com.pulumi.alicloud.cen.TransitRouter;
 * import com.pulumi.alicloud.cen.TransitRouterArgs;
 * import com.pulumi.alicloud.cen.TransitRouterRouteTable;
 * import com.pulumi.alicloud.cen.TransitRouterRouteTableArgs;
 * import com.pulumi.alicloud.cen.TransitRouteTableAggregation;
 * import com.pulumi.alicloud.cen.TransitRouteTableAggregationArgs;
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
 *         var example = new Instance("example", InstanceArgs.builder()
 *             .cenInstanceName("tf_example")
 *             .description("an example for cen")
 *             .build());
 * 
 *         var exampleTransitRouter = new TransitRouter("exampleTransitRouter", TransitRouterArgs.builder()
 *             .transitRouterName("tf_example")
 *             .cenId(example.id())
 *             .build());
 * 
 *         var exampleTransitRouterRouteTable = new TransitRouterRouteTable("exampleTransitRouterRouteTable", TransitRouterRouteTableArgs.builder()
 *             .transitRouterId(exampleTransitRouter.transitRouterId())
 *             .build());
 * 
 *         var exampleTransitRouteTableAggregation = new TransitRouteTableAggregation("exampleTransitRouteTableAggregation", TransitRouteTableAggregationArgs.builder()
 *             .transitRouteTableId(exampleTransitRouterRouteTable.transitRouterRouteTableId())
 *             .transitRouteTableAggregationCidr("10.0.0.0/8")
 *             .transitRouteTableAggregationScope("VPC")
 *             .transitRouteTableAggregationName("tf_example")
 *             .transitRouteTableAggregationDescription("tf_example")
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
 * Cloud Enterprise Network (CEN) Transit Route Table Aggregation can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cen/transitRouteTableAggregation:TransitRouteTableAggregation example &lt;transit_route_table_id&gt;:&lt;transit_route_table_aggregation_cidr&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/transitRouteTableAggregation:TransitRouteTableAggregation")
public class TransitRouteTableAggregation extends com.pulumi.resources.CustomResource {
    /**
     * The status of the Transit Route Table Aggregation.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the Transit Route Table Aggregation.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The destination CIDR block of the aggregate route. CIDR blocks that start with `0` or `100.64`. Multicast CIDR blocks, including `224.0.0.1` to `239.255.255.254`.
     * 
     */
    @Export(name="transitRouteTableAggregationCidr", refs={String.class}, tree="[0]")
    private Output<String> transitRouteTableAggregationCidr;

    /**
     * @return The destination CIDR block of the aggregate route. CIDR blocks that start with `0` or `100.64`. Multicast CIDR blocks, including `224.0.0.1` to `239.255.255.254`.
     * 
     */
    public Output<String> transitRouteTableAggregationCidr() {
        return this.transitRouteTableAggregationCidr;
    }
    /**
     * The description of the aggregate route.
     * 
     */
    @Export(name="transitRouteTableAggregationDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transitRouteTableAggregationDescription;

    /**
     * @return The description of the aggregate route.
     * 
     */
    public Output<Optional<String>> transitRouteTableAggregationDescription() {
        return Codegen.optional(this.transitRouteTableAggregationDescription);
    }
    /**
     * The name of the aggregate route.
     * 
     */
    @Export(name="transitRouteTableAggregationName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transitRouteTableAggregationName;

    /**
     * @return The name of the aggregate route.
     * 
     */
    public Output<Optional<String>> transitRouteTableAggregationName() {
        return Codegen.optional(this.transitRouteTableAggregationName);
    }
    /**
     * The scope of networks that you want to advertise the aggregate route. Valid Value: `VPC`.
     * 
     */
    @Export(name="transitRouteTableAggregationScope", refs={String.class}, tree="[0]")
    private Output<String> transitRouteTableAggregationScope;

    /**
     * @return The scope of networks that you want to advertise the aggregate route. Valid Value: `VPC`.
     * 
     */
    public Output<String> transitRouteTableAggregationScope() {
        return this.transitRouteTableAggregationScope;
    }
    /**
     * The ID of the route table of the Enterprise Edition transit router.
     * 
     */
    @Export(name="transitRouteTableId", refs={String.class}, tree="[0]")
    private Output<String> transitRouteTableId;

    /**
     * @return The ID of the route table of the Enterprise Edition transit router.
     * 
     */
    public Output<String> transitRouteTableId() {
        return this.transitRouteTableId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitRouteTableAggregation(java.lang.String name) {
        this(name, TransitRouteTableAggregationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitRouteTableAggregation(java.lang.String name, TransitRouteTableAggregationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitRouteTableAggregation(java.lang.String name, TransitRouteTableAggregationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouteTableAggregation:TransitRouteTableAggregation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TransitRouteTableAggregation(java.lang.String name, Output<java.lang.String> id, @Nullable TransitRouteTableAggregationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouteTableAggregation:TransitRouteTableAggregation", name, state, makeResourceOptions(options, id), false);
    }

    private static TransitRouteTableAggregationArgs makeArgs(TransitRouteTableAggregationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TransitRouteTableAggregationArgs.Empty : args;
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
    public static TransitRouteTableAggregation get(java.lang.String name, Output<java.lang.String> id, @Nullable TransitRouteTableAggregationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitRouteTableAggregation(name, id, state, options);
    }
}
