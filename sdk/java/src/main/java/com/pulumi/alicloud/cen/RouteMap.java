// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.RouteMapArgs;
import com.pulumi.alicloud.cen.inputs.RouteMapState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This topic provides an overview of the route map function of Cloud Enterprise Networks (CENs).
 * You can use the route map function to filter routes and modify route attributes.
 * By doing so, you can manage the communication between networks attached to a CEN.
 * 
 * For information about CEN Route Map and how to use it, see [Manage CEN Route Map](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-cbn-2017-09-12-createcenroutemap).
 * 
 * &gt; **NOTE:** Available since v1.82.0.
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
 * import com.pulumi.alicloud.cen.Instance;
 * import com.pulumi.alicloud.cen.InstanceArgs;
 * import com.pulumi.alicloud.cen.InstanceAttachment;
 * import com.pulumi.alicloud.cen.InstanceAttachmentArgs;
 * import com.pulumi.alicloud.cen.RouteMap;
 * import com.pulumi.alicloud.cen.RouteMapArgs;
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
 *         final var sourceRegion = config.get("sourceRegion").orElse("cn-hangzhou");
 *         final var destinationRegion = config.get("destinationRegion").orElse("cn-shanghai");
 *         var exampleHz = new Network("exampleHz", NetworkArgs.builder()
 *             .vpcName("tf_example")
 *             .cidrBlock("192.168.0.0/16")
 *             .build());
 * 
 *         var exampleSh = new Network("exampleSh", NetworkArgs.builder()
 *             .vpcName("tf_example")
 *             .cidrBlock("172.16.0.0/12")
 *             .build());
 * 
 *         var example = new Instance("example", InstanceArgs.builder()
 *             .cenInstanceName("tf_example")
 *             .description("an example for cen")
 *             .build());
 * 
 *         var exampleHzInstanceAttachment = new InstanceAttachment("exampleHzInstanceAttachment", InstanceAttachmentArgs.builder()
 *             .instanceId(example.id())
 *             .childInstanceId(exampleHz.id())
 *             .childInstanceType("VPC")
 *             .childInstanceRegionId(sourceRegion)
 *             .build());
 * 
 *         var exampleShInstanceAttachment = new InstanceAttachment("exampleShInstanceAttachment", InstanceAttachmentArgs.builder()
 *             .instanceId(example.id())
 *             .childInstanceId(exampleSh.id())
 *             .childInstanceType("VPC")
 *             .childInstanceRegionId(destinationRegion)
 *             .build());
 * 
 *         var default_ = new RouteMap("default", RouteMapArgs.builder()
 *             .cenRegionId(sourceRegion)
 *             .cenId(example.id())
 *             .description("tf_example")
 *             .priority(1)
 *             .transmitDirection("RegionIn")
 *             .mapResult("Permit")
 *             .nextPriority(1)
 *             .sourceRegionIds(sourceRegion)
 *             .sourceInstanceIds(exampleHzInstanceAttachment.childInstanceId())
 *             .sourceInstanceIdsReverseMatch(false)
 *             .destinationInstanceIds(exampleShInstanceAttachment.childInstanceId())
 *             .destinationInstanceIdsReverseMatch(false)
 *             .sourceRouteTableIds(exampleHz.routeTableId())
 *             .destinationRouteTableIds(exampleSh.routeTableId())
 *             .sourceChildInstanceTypes("VPC")
 *             .destinationChildInstanceTypes("VPC")
 *             .destinationCidrBlocks(exampleSh.cidrBlock())
 *             .cidrMatchMode("Include")
 *             .routeTypes("System")
 *             .matchAsns("65501")
 *             .asPathMatchMode("Include")
 *             .matchCommunitySets("65501:1")
 *             .communityMatchMode("Include")
 *             .communityOperateMode("Additive")
 *             .operateCommunitySets("65501:1")
 *             .preference(20)
 *             .prependAsPaths("65501")
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
 * CEN RouteMap can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cen/routeMap:RouteMap default &lt;cen_id&gt;:&lt;route_map_id&gt;.
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/routeMap:RouteMap")
public class RouteMap extends com.pulumi.resources.CustomResource {
    /**
     * A match statement. It indicates the mode in which the AS path attribute is matched. Valid values: [&#34;Include&#34;, &#34;Complete&#34;].
     * 
     */
    @Export(name="asPathMatchMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> asPathMatchMode;

    /**
     * @return A match statement. It indicates the mode in which the AS path attribute is matched. Valid values: [&#34;Include&#34;, &#34;Complete&#34;].
     * 
     */
    public Output<Optional<String>> asPathMatchMode() {
        return Codegen.optional(this.asPathMatchMode);
    }
    /**
     * The ID of the CEN instance.
     * 
     */
    @Export(name="cenId", refs={String.class}, tree="[0]")
    private Output<String> cenId;

    /**
     * @return The ID of the CEN instance.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }
    /**
     * The ID of the region to which the CEN instance belongs.
     * 
     */
    @Export(name="cenRegionId", refs={String.class}, tree="[0]")
    private Output<String> cenRegionId;

    /**
     * @return The ID of the region to which the CEN instance belongs.
     * 
     */
    public Output<String> cenRegionId() {
        return this.cenRegionId;
    }
    /**
     * A match statement. It indicates the mode in which the prefix attribute is matched. Valid values: [&#34;Include&#34;, &#34;Complete&#34;].
     * 
     */
    @Export(name="cidrMatchMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cidrMatchMode;

    /**
     * @return A match statement. It indicates the mode in which the prefix attribute is matched. Valid values: [&#34;Include&#34;, &#34;Complete&#34;].
     * 
     */
    public Output<Optional<String>> cidrMatchMode() {
        return Codegen.optional(this.cidrMatchMode);
    }
    /**
     * A match statement. It indicates the mode in which the community attribute is matched. Valid values: [&#34;Include&#34;, &#34;Complete&#34;].
     * 
     */
    @Export(name="communityMatchMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> communityMatchMode;

    /**
     * @return A match statement. It indicates the mode in which the community attribute is matched. Valid values: [&#34;Include&#34;, &#34;Complete&#34;].
     * 
     */
    public Output<Optional<String>> communityMatchMode() {
        return Codegen.optional(this.communityMatchMode);
    }
    /**
     * An action statement. It indicates the mode in which the community attribute is operated. Valid values: [&#34;Additive&#34;, &#34;Replace&#34;].
     * 
     */
    @Export(name="communityOperateMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> communityOperateMode;

    /**
     * @return An action statement. It indicates the mode in which the community attribute is operated. Valid values: [&#34;Additive&#34;, &#34;Replace&#34;].
     * 
     */
    public Output<Optional<String>> communityOperateMode() {
        return Codegen.optional(this.communityOperateMode);
    }
    /**
     * The description of the route map.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the route map.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A match statement that indicates the list of destination instance types. Valid values: [&#34;VPC&#34;, &#34;VBR&#34;, &#34;CCN&#34;, &#34;VPN&#34;].
     * 
     */
    @Export(name="destinationChildInstanceTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> destinationChildInstanceTypes;

    /**
     * @return A match statement that indicates the list of destination instance types. Valid values: [&#34;VPC&#34;, &#34;VBR&#34;, &#34;CCN&#34;, &#34;VPN&#34;].
     * 
     */
    public Output<Optional<List<String>>> destinationChildInstanceTypes() {
        return Codegen.optional(this.destinationChildInstanceTypes);
    }
    /**
     * A match statement that indicates the prefix list. The prefix is in the CIDR format. You can enter a maximum of 32 CIDR blocks.
     * 
     */
    @Export(name="destinationCidrBlocks", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> destinationCidrBlocks;

    /**
     * @return A match statement that indicates the prefix list. The prefix is in the CIDR format. You can enter a maximum of 32 CIDR blocks.
     * 
     */
    public Output<Optional<List<String>>> destinationCidrBlocks() {
        return Codegen.optional(this.destinationCidrBlocks);
    }
    /**
     * A match statement that indicates the list of IDs of the destination instances.
     * 
     */
    @Export(name="destinationInstanceIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> destinationInstanceIds;

    /**
     * @return A match statement that indicates the list of IDs of the destination instances.
     * 
     */
    public Output<Optional<List<String>>> destinationInstanceIds() {
        return Codegen.optional(this.destinationInstanceIds);
    }
    /**
     * Indicates whether to enable the reverse match method for the DestinationInstanceIds match condition. Valid values: [&#34;false&#34;, &#34;true&#34;]. Default to &#34;false&#34;.
     * 
     */
    @Export(name="destinationInstanceIdsReverseMatch", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> destinationInstanceIdsReverseMatch;

    /**
     * @return Indicates whether to enable the reverse match method for the DestinationInstanceIds match condition. Valid values: [&#34;false&#34;, &#34;true&#34;]. Default to &#34;false&#34;.
     * 
     */
    public Output<Optional<Boolean>> destinationInstanceIdsReverseMatch() {
        return Codegen.optional(this.destinationInstanceIdsReverseMatch);
    }
    /**
     * A match statement that indicates the list of IDs of the destination route tables. You can enter a maximum of 32 route table IDs.
     * 
     */
    @Export(name="destinationRouteTableIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> destinationRouteTableIds;

    /**
     * @return A match statement that indicates the list of IDs of the destination route tables. You can enter a maximum of 32 route table IDs.
     * 
     */
    public Output<Optional<List<String>>> destinationRouteTableIds() {
        return Codegen.optional(this.destinationRouteTableIds);
    }
    /**
     * The action that is performed to a route if the route matches all the match conditions. Valid values: [&#34;Permit&#34;, &#34;Deny&#34;].
     * 
     */
    @Export(name="mapResult", refs={String.class}, tree="[0]")
    private Output<String> mapResult;

    /**
     * @return The action that is performed to a route if the route matches all the match conditions. Valid values: [&#34;Permit&#34;, &#34;Deny&#34;].
     * 
     */
    public Output<String> mapResult() {
        return this.mapResult;
    }
    /**
     * A match statement that indicates the AS path list. The AS path is a well-known mandatory attribute, which describes the numbers of the ASs that a BGP route passes through during transmission.
     * 
     */
    @Export(name="matchAsns", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> matchAsns;

    /**
     * @return A match statement that indicates the AS path list. The AS path is a well-known mandatory attribute, which describes the numbers of the ASs that a BGP route passes through during transmission.
     * 
     */
    public Output<Optional<List<String>>> matchAsns() {
        return Codegen.optional(this.matchAsns);
    }
    /**
     * A match statement that indicates the community set. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
     * 
     */
    @Export(name="matchCommunitySets", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> matchCommunitySets;

    /**
     * @return A match statement that indicates the community set. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
     * 
     */
    public Output<Optional<List<String>>> matchCommunitySets() {
        return Codegen.optional(this.matchCommunitySets);
    }
    /**
     * The priority of the next route map that is associated with the current route map. Value range: 1 to 100.
     * 
     */
    @Export(name="nextPriority", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> nextPriority;

    /**
     * @return The priority of the next route map that is associated with the current route map. Value range: 1 to 100.
     * 
     */
    public Output<Optional<Integer>> nextPriority() {
        return Codegen.optional(this.nextPriority);
    }
    /**
     * An action statement that operates the community attribute. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
     * 
     */
    @Export(name="operateCommunitySets", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> operateCommunitySets;

    /**
     * @return An action statement that operates the community attribute. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
     * 
     */
    public Output<Optional<List<String>>> operateCommunitySets() {
        return Codegen.optional(this.operateCommunitySets);
    }
    /**
     * An action statement that modifies the priority of the route. Value range: 1 to 100. The default priority of a route is 50. A lower value indicates a higher preference.
     * 
     */
    @Export(name="preference", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> preference;

    /**
     * @return An action statement that modifies the priority of the route. Value range: 1 to 100. The default priority of a route is 50. A lower value indicates a higher preference.
     * 
     */
    public Output<Optional<Integer>> preference() {
        return Codegen.optional(this.preference);
    }
    /**
     * An action statement that indicates an AS path is prepended when the regional gateway receives or advertises a route.
     * 
     */
    @Export(name="prependAsPaths", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> prependAsPaths;

    /**
     * @return An action statement that indicates an AS path is prepended when the regional gateway receives or advertises a route.
     * 
     */
    public Output<Optional<List<String>>> prependAsPaths() {
        return Codegen.optional(this.prependAsPaths);
    }
    /**
     * The priority of the route map. Value range: 1 to 100. A lower value indicates a higher priority.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output<Integer> priority;

    /**
     * @return The priority of the route map. Value range: 1 to 100. A lower value indicates a higher priority.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * ID of the RouteMap. It is available in 1.161.0+.
     * 
     */
    @Export(name="routeMapId", refs={String.class}, tree="[0]")
    private Output<String> routeMapId;

    /**
     * @return ID of the RouteMap. It is available in 1.161.0+.
     * 
     */
    public Output<String> routeMapId() {
        return this.routeMapId;
    }
    /**
     * A match statement that indicates the list of route types. Valid values: [&#34;System&#34;, &#34;Custom&#34;, &#34;BGP&#34;].
     * 
     */
    @Export(name="routeTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> routeTypes;

    /**
     * @return A match statement that indicates the list of route types. Valid values: [&#34;System&#34;, &#34;Custom&#34;, &#34;BGP&#34;].
     * 
     */
    public Output<Optional<List<String>>> routeTypes() {
        return Codegen.optional(this.routeTypes);
    }
    /**
     * A match statement that indicates the list of source instance types. Valid values: [&#34;VPC&#34;, &#34;VBR&#34;, &#34;CCN&#34;].
     * 
     */
    @Export(name="sourceChildInstanceTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sourceChildInstanceTypes;

    /**
     * @return A match statement that indicates the list of source instance types. Valid values: [&#34;VPC&#34;, &#34;VBR&#34;, &#34;CCN&#34;].
     * 
     */
    public Output<Optional<List<String>>> sourceChildInstanceTypes() {
        return Codegen.optional(this.sourceChildInstanceTypes);
    }
    /**
     * A match statement that indicates the list of IDs of the source instances.
     * 
     */
    @Export(name="sourceInstanceIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sourceInstanceIds;

    /**
     * @return A match statement that indicates the list of IDs of the source instances.
     * 
     */
    public Output<Optional<List<String>>> sourceInstanceIds() {
        return Codegen.optional(this.sourceInstanceIds);
    }
    /**
     * Indicates whether to enable the reverse match method for the SourceInstanceIds match condition. Valid values: [&#34;false&#34;, &#34;true&#34;]. Default to &#34;false&#34;.
     * 
     */
    @Export(name="sourceInstanceIdsReverseMatch", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> sourceInstanceIdsReverseMatch;

    /**
     * @return Indicates whether to enable the reverse match method for the SourceInstanceIds match condition. Valid values: [&#34;false&#34;, &#34;true&#34;]. Default to &#34;false&#34;.
     * 
     */
    public Output<Optional<Boolean>> sourceInstanceIdsReverseMatch() {
        return Codegen.optional(this.sourceInstanceIdsReverseMatch);
    }
    /**
     * A match statement that indicates the list of IDs of the source regions. You can enter a maximum of 32 region IDs.
     * 
     */
    @Export(name="sourceRegionIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sourceRegionIds;

    /**
     * @return A match statement that indicates the list of IDs of the source regions. You can enter a maximum of 32 region IDs.
     * 
     */
    public Output<Optional<List<String>>> sourceRegionIds() {
        return Codegen.optional(this.sourceRegionIds);
    }
    /**
     * A match statement that indicates the list of IDs of the source route tables. You can enter a maximum of 32 route table IDs.
     * 
     */
    @Export(name="sourceRouteTableIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sourceRouteTableIds;

    /**
     * @return A match statement that indicates the list of IDs of the source route tables. You can enter a maximum of 32 route table IDs.
     * 
     */
    public Output<Optional<List<String>>> sourceRouteTableIds() {
        return Codegen.optional(this.sourceRouteTableIds);
    }
    /**
     * (Computed) The status of route map. Valid values: [&#34;Creating&#34;, &#34;Active&#34;, &#34;Deleting&#34;].
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return (Computed) The status of route map. Valid values: [&#34;Creating&#34;, &#34;Active&#34;, &#34;Deleting&#34;].
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The routing table ID of the forwarding router. If you do not enter the routing table ID, the routing policy is automatically associated with the default routing table of the forwarding router.
     * 
     */
    @Export(name="transitRouterRouteTableId", refs={String.class}, tree="[0]")
    private Output<String> transitRouterRouteTableId;

    /**
     * @return The routing table ID of the forwarding router. If you do not enter the routing table ID, the routing policy is automatically associated with the default routing table of the forwarding router.
     * 
     */
    public Output<String> transitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }
    /**
     * The direction in which the route map is applied. Valid values: [&#34;RegionIn&#34;, &#34;RegionOut&#34;].
     * 
     */
    @Export(name="transmitDirection", refs={String.class}, tree="[0]")
    private Output<String> transmitDirection;

    /**
     * @return The direction in which the route map is applied. Valid values: [&#34;RegionIn&#34;, &#34;RegionOut&#34;].
     * 
     */
    public Output<String> transmitDirection() {
        return this.transmitDirection;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteMap(java.lang.String name) {
        this(name, RouteMapArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteMap(java.lang.String name, RouteMapArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteMap(java.lang.String name, RouteMapArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/routeMap:RouteMap", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RouteMap(java.lang.String name, Output<java.lang.String> id, @Nullable RouteMapState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/routeMap:RouteMap", name, state, makeResourceOptions(options, id), false);
    }

    private static RouteMapArgs makeArgs(RouteMapArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RouteMapArgs.Empty : args;
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
    public static RouteMap get(java.lang.String name, Output<java.lang.String> id, @Nullable RouteMapState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouteMap(name, id, state, options);
    }
}
