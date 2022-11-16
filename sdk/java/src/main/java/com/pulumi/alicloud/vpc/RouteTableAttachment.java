// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.RouteTableAttachmentArgs;
import com.pulumi.alicloud.vpc.inputs.RouteTableAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.vpc.RouteTable;
 * import com.pulumi.alicloud.vpc.RouteTableArgs;
 * import com.pulumi.alicloud.vpc.RouteTableAttachment;
 * import com.pulumi.alicloud.vpc.RouteTableAttachmentArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;route-table-attachment-example-name&#34;);
 *         var fooNetwork = new Network(&#34;fooNetwork&#34;, NetworkArgs.builder()        
 *             .cidrBlock(&#34;172.16.0.0/12&#34;)
 *             .build());
 * 
 *         final var default = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var fooSwitch = new Switch(&#34;fooSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(fooNetwork.id())
 *             .cidrBlock(&#34;172.16.0.0/21&#34;)
 *             .zoneId(default_.zones()[0].id())
 *             .build());
 * 
 *         var fooRouteTable = new RouteTable(&#34;fooRouteTable&#34;, RouteTableArgs.builder()        
 *             .vpcId(fooNetwork.id())
 *             .routeTableName(name)
 *             .description(&#34;route_table_attachment&#34;)
 *             .build());
 * 
 *         var fooRouteTableAttachment = new RouteTableAttachment(&#34;fooRouteTableAttachment&#34;, RouteTableAttachmentArgs.builder()        
 *             .vswitchId(fooSwitch.id())
 *             .routeTableId(fooRouteTable.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * The route table attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpc/routeTableAttachment:RouteTableAttachment foo vtb-abc123456:vsw-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/routeTableAttachment:RouteTableAttachment")
public class RouteTableAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The route_table_id of the route table attachment, the field can&#39;t be changed.
     * 
     */
    @Export(name="routeTableId", type=String.class, parameters={})
    private Output<String> routeTableId;

    /**
     * @return The route_table_id of the route table attachment, the field can&#39;t be changed.
     * 
     */
    public Output<String> routeTableId() {
        return this.routeTableId;
    }
    /**
     * The vswitch_id of the route table attachment, the field can&#39;t be changed.
     * 
     */
    @Export(name="vswitchId", type=String.class, parameters={})
    private Output<String> vswitchId;

    /**
     * @return The vswitch_id of the route table attachment, the field can&#39;t be changed.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteTableAttachment(String name) {
        this(name, RouteTableAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteTableAttachment(String name, RouteTableAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteTableAttachment(String name, RouteTableAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/routeTableAttachment:RouteTableAttachment", name, args == null ? RouteTableAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RouteTableAttachment(String name, Output<String> id, @Nullable RouteTableAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/routeTableAttachment:RouteTableAttachment", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static RouteTableAttachment get(String name, Output<String> id, @Nullable RouteTableAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouteTableAttachment(name, id, state, options);
    }
}