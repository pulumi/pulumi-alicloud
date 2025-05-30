// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.nlb.ServerGroupServerAttachmentArgs;
import com.pulumi.alicloud.nlb.inputs.ServerGroupServerAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Network Load Balancer (NLB) Server Group Server Attachment resource.
 * 
 * Network Server Load Balancer.
 * 
 * For information about Network Load Balancer (NLB) Server Group Server Attachment and how to use it, see [What is Server Group Server Attachment](https://www.alibabacloud.com/help/en/server-load-balancer/latest/addserverstoservergroup-nlb).
 * 
 * &gt; **NOTE:** Available since v1.192.0.
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
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetResourceGroupsArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.nlb.ServerGroup;
 * import com.pulumi.alicloud.nlb.ServerGroupArgs;
 * import com.pulumi.alicloud.nlb.inputs.ServerGroupHealthCheckArgs;
 * import com.pulumi.alicloud.nlb.ServerGroupServerAttachment;
 * import com.pulumi.alicloud.nlb.ServerGroupServerAttachmentArgs;
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
 *         final var default = ResourcemanagerFunctions.getResourceGroups(GetResourceGroupsArgs.builder()
 *             .build());
 * 
 *         var defaultNetwork = new Network("defaultNetwork", NetworkArgs.builder()
 *             .vpcName(name)
 *             .cidrBlock("10.4.0.0/16")
 *             .build());
 * 
 *         var defaultServerGroup = new ServerGroup("defaultServerGroup", ServerGroupArgs.builder()
 *             .resourceGroupId(default_.ids()[0])
 *             .serverGroupName(name)
 *             .serverGroupType("Ip")
 *             .connectionDrainTimeout(10)
 *             .connectionDrainEnabled(true)
 *             .vpcId(defaultNetwork.id())
 *             .scheduler("Wrr")
 *             .protocol("TCP")
 *             .healthCheck(ServerGroupHealthCheckArgs.builder()
 *                 .healthCheckEnabled(false)
 *                 .build())
 *             .addressIpVersion("Ipv4")
 *             .build());
 * 
 *         var defaultServerGroupServerAttachment = new ServerGroupServerAttachment("defaultServerGroupServerAttachment", ServerGroupServerAttachmentArgs.builder()
 *             .serverType("Ip")
 *             .serverId("10.0.0.0")
 *             .description(name)
 *             .port(80)
 *             .serverGroupId(defaultServerGroup.id())
 *             .weight(100)
 *             .serverIp("10.0.0.0")
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
 * Network Load Balancer (NLB) Server Group Server Attachment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:nlb/serverGroupServerAttachment:ServerGroupServerAttachment example &lt;server_group_id&gt;_&lt;server_id&gt;_&lt;server_ip&gt;_&lt;server_type&gt;_&lt;port&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:nlb/serverGroupServerAttachment:ServerGroupServerAttachment")
public class ServerGroupServerAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The description of the servers.
     * The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs ({@literal @}), underscores (\_), and hyphens (-).
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the servers.
     * The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs ({@literal @}), underscores (\_), and hyphens (-).
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The port that is used by the backend server. Valid values: `1` to `65535`.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output<Integer> port;

    /**
     * @return The port that is used by the backend server. Valid values: `1` to `65535`.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * The ID of the server group.
     * 
     */
    @Export(name="serverGroupId", refs={String.class}, tree="[0]")
    private Output<String> serverGroupId;

    /**
     * @return The ID of the server group.
     * 
     */
    public Output<String> serverGroupId() {
        return this.serverGroupId;
    }
    /**
     * The ID of the server.
     * 
     * - If the server group type is `Instance`, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. These backend servers are specified by `Ecs`, `Eni`, or `Eci`.
     * - If the server group type is `Ip`, set the ServerId parameter to an IP address.
     * 
     */
    @Export(name="serverId", refs={String.class}, tree="[0]")
    private Output<String> serverId;

    /**
     * @return The ID of the server.
     * 
     * - If the server group type is `Instance`, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. These backend servers are specified by `Ecs`, `Eni`, or `Eci`.
     * - If the server group type is `Ip`, set the ServerId parameter to an IP address.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }
    /**
     * The IP address of the server. If the server group type is `Ip`, set the ServerId parameter to an IP address.
     * 
     */
    @Export(name="serverIp", refs={String.class}, tree="[0]")
    private Output<String> serverIp;

    /**
     * @return The IP address of the server. If the server group type is `Ip`, set the ServerId parameter to an IP address.
     * 
     */
    public Output<String> serverIp() {
        return this.serverIp;
    }
    /**
     * The type of the backend server. Valid values:
     * 
     * - `Ecs`: ECS instance
     * - `Eni`: ENI
     * - `Eci`: an elastic container instance
     * - `Ip`: an IP address
     * 
     */
    @Export(name="serverType", refs={String.class}, tree="[0]")
    private Output<String> serverType;

    /**
     * @return The type of the backend server. Valid values:
     * 
     * - `Ecs`: ECS instance
     * - `Eni`: ENI
     * - `Eci`: an elastic container instance
     * - `Ip`: an IP address
     * 
     */
    public Output<String> serverType() {
        return this.serverType;
    }
    /**
     * The status of the resource
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The weight of the backend server. Valid values: `0` to `100`. Default value: `100`. If the weight of a backend server is set to `0`, no requests are forwarded to the backend server.
     * 
     */
    @Export(name="weight", refs={Integer.class}, tree="[0]")
    private Output<Integer> weight;

    /**
     * @return The weight of the backend server. Valid values: `0` to `100`. Default value: `100`. If the weight of a backend server is set to `0`, no requests are forwarded to the backend server.
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }
    /**
     * The zone ID of the server.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone ID of the server.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerGroupServerAttachment(java.lang.String name) {
        this(name, ServerGroupServerAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerGroupServerAttachment(java.lang.String name, ServerGroupServerAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerGroupServerAttachment(java.lang.String name, ServerGroupServerAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nlb/serverGroupServerAttachment:ServerGroupServerAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ServerGroupServerAttachment(java.lang.String name, Output<java.lang.String> id, @Nullable ServerGroupServerAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nlb/serverGroupServerAttachment:ServerGroupServerAttachment", name, state, makeResourceOptions(options, id), false);
    }

    private static ServerGroupServerAttachmentArgs makeArgs(ServerGroupServerAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServerGroupServerAttachmentArgs.Empty : args;
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
    public static ServerGroupServerAttachment get(java.lang.String name, Output<java.lang.String> id, @Nullable ServerGroupServerAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerGroupServerAttachment(name, id, state, options);
    }
}
