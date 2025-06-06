// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.TransitRouterPrefixListAssociationArgs;
import com.pulumi.alicloud.cen.inputs.TransitRouterPrefixListAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Enterprise Network (CEN) Transit Router Prefix List Association resource.
 * 
 * For information about Cloud Enterprise Network (CEN) Transit Router Prefix List Association and how to use it, see [What is Transit Router Prefix List Association](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/createtransitrouterprefixlistassociation).
 * 
 * &gt; **NOTE:** Available since v1.188.0.
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
 * import com.pulumi.alicloud.vpc.PrefixList;
 * import com.pulumi.alicloud.vpc.PrefixListArgs;
 * import com.pulumi.alicloud.vpc.inputs.PrefixListEntryArgs;
 * import com.pulumi.alicloud.cen.Instance;
 * import com.pulumi.alicloud.cen.InstanceArgs;
 * import com.pulumi.alicloud.cen.TransitRouter;
 * import com.pulumi.alicloud.cen.TransitRouterArgs;
 * import com.pulumi.alicloud.cen.TransitRouterRouteTable;
 * import com.pulumi.alicloud.cen.TransitRouterRouteTableArgs;
 * import com.pulumi.alicloud.cen.TransitRouterPrefixListAssociation;
 * import com.pulumi.alicloud.cen.TransitRouterPrefixListAssociationArgs;
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
 *         final var default = AlicloudFunctions.getAccount(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var example = new PrefixList("example", PrefixListArgs.builder()
 *             .entrys(PrefixListEntryArgs.builder()
 *                 .cidr("192.168.0.0/16")
 *                 .build())
 *             .build());
 * 
 *         var exampleInstance = new Instance("exampleInstance", InstanceArgs.builder()
 *             .cenInstanceName("tf_example")
 *             .description("an example for cen")
 *             .build());
 * 
 *         var exampleTransitRouter = new TransitRouter("exampleTransitRouter", TransitRouterArgs.builder()
 *             .transitRouterName("tf_example")
 *             .cenId(exampleInstance.id())
 *             .build());
 * 
 *         var exampleTransitRouterRouteTable = new TransitRouterRouteTable("exampleTransitRouterRouteTable", TransitRouterRouteTableArgs.builder()
 *             .transitRouterId(exampleTransitRouter.transitRouterId())
 *             .build());
 * 
 *         var exampleTransitRouterPrefixListAssociation = new TransitRouterPrefixListAssociation("exampleTransitRouterPrefixListAssociation", TransitRouterPrefixListAssociationArgs.builder()
 *             .prefixListId(example.id())
 *             .transitRouterId(exampleTransitRouter.transitRouterId())
 *             .transitRouterTableId(exampleTransitRouterRouteTable.transitRouterRouteTableId())
 *             .nextHop("BlackHole")
 *             .nextHopType("BlackHole")
 *             .ownerUid(default_.id())
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
 * Cloud Enterprise Network (CEN) Transit Router Prefix List Association can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cen/transitRouterPrefixListAssociation:TransitRouterPrefixListAssociation default &lt;prefix_list_id&gt;:&lt;transit_router_id&gt;:&lt;transit_router_table_id&gt;:&lt;next_hop&gt;.
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/transitRouterPrefixListAssociation:TransitRouterPrefixListAssociation")
public class TransitRouterPrefixListAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the next hop. **NOTE:** If `next_hop` is set to `BlackHole`, you must set this parameter to `BlackHole`.
     * 
     */
    @Export(name="nextHop", refs={String.class}, tree="[0]")
    private Output<String> nextHop;

    /**
     * @return The ID of the next hop. **NOTE:** If `next_hop` is set to `BlackHole`, you must set this parameter to `BlackHole`.
     * 
     */
    public Output<String> nextHop() {
        return this.nextHop;
    }
    /**
     * The type of the next hop. Valid values:
     * - `BlackHole`: Specifies that all the CIDR blocks in the prefix list are blackhole routes. Packets destined for the CIDR blocks are dropped.
     * - `VPC`: Specifies that the next hop of the CIDR blocks in the prefix list is a virtual private cloud (VPC) connection.
     * - `VBR`: Specifies that the next hop of the CIDR blocks in the prefix list is a virtual border router (VBR) connection.
     * - `TR`: Specifies that the next hop of the CIDR blocks in the prefix list is an inter-region connection.
     * 
     */
    @Export(name="nextHopType", refs={String.class}, tree="[0]")
    private Output<String> nextHopType;

    /**
     * @return The type of the next hop. Valid values:
     * - `BlackHole`: Specifies that all the CIDR blocks in the prefix list are blackhole routes. Packets destined for the CIDR blocks are dropped.
     * - `VPC`: Specifies that the next hop of the CIDR blocks in the prefix list is a virtual private cloud (VPC) connection.
     * - `VBR`: Specifies that the next hop of the CIDR blocks in the prefix list is a virtual border router (VBR) connection.
     * - `TR`: Specifies that the next hop of the CIDR blocks in the prefix list is an inter-region connection.
     * 
     */
    public Output<String> nextHopType() {
        return this.nextHopType;
    }
    /**
     * The ID of the Alibaba Cloud account to which the prefix list belongs.
     * 
     */
    @Export(name="ownerUid", refs={Integer.class}, tree="[0]")
    private Output<Integer> ownerUid;

    /**
     * @return The ID of the Alibaba Cloud account to which the prefix list belongs.
     * 
     */
    public Output<Integer> ownerUid() {
        return this.ownerUid;
    }
    /**
     * The ID of the prefix list.
     * 
     */
    @Export(name="prefixListId", refs={String.class}, tree="[0]")
    private Output<String> prefixListId;

    /**
     * @return The ID of the prefix list.
     * 
     */
    public Output<String> prefixListId() {
        return this.prefixListId;
    }
    /**
     * The status of the prefix list.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the prefix list.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The ID of the transit router.
     * 
     */
    @Export(name="transitRouterId", refs={String.class}, tree="[0]")
    private Output<String> transitRouterId;

    /**
     * @return The ID of the transit router.
     * 
     */
    public Output<String> transitRouterId() {
        return this.transitRouterId;
    }
    /**
     * The ID of the route table of the transit router.
     * 
     */
    @Export(name="transitRouterTableId", refs={String.class}, tree="[0]")
    private Output<String> transitRouterTableId;

    /**
     * @return The ID of the route table of the transit router.
     * 
     */
    public Output<String> transitRouterTableId() {
        return this.transitRouterTableId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitRouterPrefixListAssociation(java.lang.String name) {
        this(name, TransitRouterPrefixListAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitRouterPrefixListAssociation(java.lang.String name, TransitRouterPrefixListAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitRouterPrefixListAssociation(java.lang.String name, TransitRouterPrefixListAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterPrefixListAssociation:TransitRouterPrefixListAssociation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TransitRouterPrefixListAssociation(java.lang.String name, Output<java.lang.String> id, @Nullable TransitRouterPrefixListAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterPrefixListAssociation:TransitRouterPrefixListAssociation", name, state, makeResourceOptions(options, id), false);
    }

    private static TransitRouterPrefixListAssociationArgs makeArgs(TransitRouterPrefixListAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TransitRouterPrefixListAssociationArgs.Empty : args;
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
    public static TransitRouterPrefixListAssociation get(java.lang.String name, Output<java.lang.String> id, @Nullable TransitRouterPrefixListAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitRouterPrefixListAssociation(name, id, state, options);
    }
}
