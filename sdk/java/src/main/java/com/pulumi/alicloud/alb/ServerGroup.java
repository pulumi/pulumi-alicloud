// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.alb.ServerGroupArgs;
import com.pulumi.alicloud.alb.inputs.ServerGroupState;
import com.pulumi.alicloud.alb.outputs.ServerGroupConnectionDrainConfig;
import com.pulumi.alicloud.alb.outputs.ServerGroupHealthCheckConfig;
import com.pulumi.alicloud.alb.outputs.ServerGroupServer;
import com.pulumi.alicloud.alb.outputs.ServerGroupSlowStartConfig;
import com.pulumi.alicloud.alb.outputs.ServerGroupStickySessionConfig;
import com.pulumi.alicloud.alb.outputs.ServerGroupUchConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Application Load Balancer (ALB) Server Group resource.
 * 
 * For information about Application Load Balancer (ALB) Server Group and how to use it, see [What is Server Group](https://www.alibabacloud.com/help/en/slb/application-load-balancer/developer-reference/api-alb-2020-06-16-createservergroup).
 * 
 * &gt; **NOTE:** Available since v1.131.0.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.ecs.inputs.GetInstanceTypesArgs;
 * import com.pulumi.alicloud.ecs.inputs.GetImagesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ecs.Instance;
 * import com.pulumi.alicloud.ecs.InstanceArgs;
 * import com.pulumi.alicloud.alb.ServerGroup;
 * import com.pulumi.alicloud.alb.ServerGroupArgs;
 * import com.pulumi.alicloud.alb.inputs.ServerGroupStickySessionConfigArgs;
 * import com.pulumi.alicloud.alb.inputs.ServerGroupHealthCheckConfigArgs;
 * import com.pulumi.alicloud.alb.inputs.ServerGroupServerArgs;
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
 *         final var name = config.get("name").orElse("terraform-example");
 *         final var example = ResourcemanagerFunctions.getResourceGroups(GetResourceGroupsArgs.builder()
 *             .build());
 * 
 *         final var exampleGetZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation("Instance")
 *             .build());
 * 
 *         final var exampleGetInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .availabilityZone(exampleGetZones.zones()[0].id())
 *             .cpuCoreCount(1)
 *             .memorySize(2)
 *             .build());
 * 
 *         final var exampleGetImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex("^ubuntu_18.*64")
 *             .owners("system")
 *             .build());
 * 
 *         var exampleNetwork = new Network("exampleNetwork", NetworkArgs.builder()
 *             .vpcName(name)
 *             .cidrBlock("10.4.0.0/16")
 *             .build());
 * 
 *         var exampleSwitch = new Switch("exampleSwitch", SwitchArgs.builder()
 *             .vswitchName(name)
 *             .cidrBlock("10.4.0.0/16")
 *             .vpcId(exampleNetwork.id())
 *             .zoneId(exampleGetZones.zones()[0].id())
 *             .build());
 * 
 *         var exampleSecurityGroup = new SecurityGroup("exampleSecurityGroup", SecurityGroupArgs.builder()
 *             .name(name)
 *             .description(name)
 *             .vpcId(exampleNetwork.id())
 *             .build());
 * 
 *         var exampleInstance = new Instance("exampleInstance", InstanceArgs.builder()
 *             .availabilityZone(exampleGetZones.zones()[0].id())
 *             .instanceName(name)
 *             .imageId(exampleGetImages.images()[0].id())
 *             .instanceType(exampleGetInstanceTypes.instanceTypes()[0].id())
 *             .securityGroups(exampleSecurityGroup.id())
 *             .vswitchId(exampleSwitch.id())
 *             .build());
 * 
 *         var exampleServerGroup = new ServerGroup("exampleServerGroup", ServerGroupArgs.builder()
 *             .protocol("HTTP")
 *             .vpcId(exampleNetwork.id())
 *             .serverGroupName(name)
 *             .resourceGroupId(example.groups()[0].id())
 *             .stickySessionConfig(ServerGroupStickySessionConfigArgs.builder()
 *                 .stickySessionEnabled(true)
 *                 .cookie("tf-example")
 *                 .stickySessionType("Server")
 *                 .build())
 *             .healthCheckConfig(ServerGroupHealthCheckConfigArgs.builder()
 *                 .healthCheckConnectPort(46325)
 *                 .healthCheckEnabled(true)
 *                 .healthCheckHost("tf-example.com")
 *                 .healthCheckCodes(                
 *                     "http_2xx",
 *                     "http_3xx",
 *                     "http_4xx")
 *                 .healthCheckHttpVersion("HTTP1.1")
 *                 .healthCheckInterval(2)
 *                 .healthCheckMethod("HEAD")
 *                 .healthCheckPath("/tf-example")
 *                 .healthCheckProtocol("HTTP")
 *                 .healthCheckTimeout(5)
 *                 .healthyThreshold(3)
 *                 .unhealthyThreshold(3)
 *                 .build())
 *             .servers(ServerGroupServerArgs.builder()
 *                 .description(name)
 *                 .port(80)
 *                 .serverId(exampleInstance.id())
 *                 .serverIp(exampleInstance.privateIp())
 *                 .serverType("Ecs")
 *                 .weight(10)
 *                 .build())
 *             .tags(Map.of("Created", "TF"))
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
 * Application Load Balancer (ALB) Server Group can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:alb/serverGroup:ServerGroup example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:alb/serverGroup:ServerGroup")
public class ServerGroup extends com.pulumi.resources.CustomResource {
    /**
     * Elegant interrupt configuration. See `connection_drain_config` below.
     * 
     */
    @Export(name="connectionDrainConfig", refs={ServerGroupConnectionDrainConfig.class}, tree="[0]")
    private Output<ServerGroupConnectionDrainConfig> connectionDrainConfig;

    /**
     * @return Elegant interrupt configuration. See `connection_drain_config` below.
     * 
     */
    public Output<ServerGroupConnectionDrainConfig> connectionDrainConfig() {
        return this.connectionDrainConfig;
    }
    /**
     * The creation time of the resource
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the resource
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Indicates whether cross-zone load balancing is enabled for the server group. Valid values:
     * 
     */
    @Export(name="crossZoneEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> crossZoneEnabled;

    /**
     * @return Indicates whether cross-zone load balancing is enabled for the server group. Valid values:
     * 
     */
    public Output<Boolean> crossZoneEnabled() {
        return this.crossZoneEnabled;
    }
    /**
     * Whether to PreCheck only this request. Value:
     * true: Send a check request,
     * false (default): Send a normal request.
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Whether to PreCheck only this request. Value:
     * true: Send a check request,
     * false (default): Send a normal request.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The configuration of health checks See `health_check_config` below.
     * 
     */
    @Export(name="healthCheckConfig", refs={ServerGroupHealthCheckConfig.class}, tree="[0]")
    private Output<ServerGroupHealthCheckConfig> healthCheckConfig;

    /**
     * @return The configuration of health checks See `health_check_config` below.
     * 
     */
    public Output<ServerGroupHealthCheckConfig> healthCheckConfig() {
        return this.healthCheckConfig;
    }
    /**
     * The ID of the resource group to which you want to transfer the cloud resource.
     * 
     * &gt; **NOTE:**   You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see [What is resource management?](https://www.alibabacloud.com/help/en/doc-detail/94475.html)
     * 
     */
    @Export(name="healthCheckTemplateId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> healthCheckTemplateId;

    /**
     * @return The ID of the resource group to which you want to transfer the cloud resource.
     * 
     * &gt; **NOTE:**   You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see [What is resource management?](https://www.alibabacloud.com/help/en/doc-detail/94475.html)
     * 
     */
    public Output<Optional<String>> healthCheckTemplateId() {
        return Codegen.optional(this.healthCheckTemplateId);
    }
    /**
     * Enable Ipv6
     * 
     */
    @Export(name="ipv6Enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipv6Enabled;

    /**
     * @return Enable Ipv6
     * 
     */
    public Output<Optional<Boolean>> ipv6Enabled() {
        return Codegen.optional(this.ipv6Enabled);
    }
    /**
     * The backend protocol. Valid values:
     * 
     * *   `HTTP`: allows you to associate an HTTPS, HTTP, or QUIC listener with the server group. This is the default value.
     * 
     * *   `HTTPS`: allows you to associate HTTPS listeners with backend servers.
     * 
     * *   `gRPC`: allows you to associate an HTTPS or QUIC listener with the server group.
     * 
     * &gt; **NOTE:**   You do not need to specify a backend protocol if you set `ServerGroupType` to `Fc`.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output<String> protocol;

    /**
     * @return The backend protocol. Valid values:
     * 
     * *   `HTTP`: allows you to associate an HTTPS, HTTP, or QUIC listener with the server group. This is the default value.
     * 
     * *   `HTTPS`: allows you to associate HTTPS listeners with backend servers.
     * 
     * *   `gRPC`: allows you to associate an HTTPS or QUIC listener with the server group.
     * 
     * &gt; **NOTE:**   You do not need to specify a backend protocol if you set `ServerGroupType` to `Fc`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * Elegant interrupt configuration.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return Elegant interrupt configuration.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The scheduling algorithm. Valid values:
     * 
     * *   `Wrr` (default): The weighted round-robin algorithm is used. Backend servers that have higher weights receive more requests than those that have lower weights.
     * 
     * *   `Wlc`: The weighted least connections algorithm is used. Requests are distributed based on the weights and the number of connections to backend servers. If two backend servers have the same weight, the backend server that has fewer connections is expected to receive more requests.
     * 
     * *   `Sch`: The consistent hashing algorithm is used. Requests from the same source IP address are distributed to the same backend server.
     * 
     * &gt; **NOTE:**  This parameter takes effect when the `ServerGroupType` parameter is set to `Instance` or `Ip`.
     * 
     */
    @Export(name="scheduler", refs={String.class}, tree="[0]")
    private Output<String> scheduler;

    /**
     * @return The scheduling algorithm. Valid values:
     * 
     * *   `Wrr` (default): The weighted round-robin algorithm is used. Backend servers that have higher weights receive more requests than those that have lower weights.
     * 
     * *   `Wlc`: The weighted least connections algorithm is used. Requests are distributed based on the weights and the number of connections to backend servers. If two backend servers have the same weight, the backend server that has fewer connections is expected to receive more requests.
     * 
     * *   `Sch`: The consistent hashing algorithm is used. Requests from the same source IP address are distributed to the same backend server.
     * 
     * &gt; **NOTE:**  This parameter takes effect when the `ServerGroupType` parameter is set to `Instance` or `Ip`.
     * 
     */
    public Output<String> scheduler() {
        return this.scheduler;
    }
    /**
     * The name of the server group. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
     * 
     */
    @Export(name="serverGroupName", refs={String.class}, tree="[0]")
    private Output<String> serverGroupName;

    /**
     * @return The name of the server group. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
     * 
     */
    public Output<String> serverGroupName() {
        return this.serverGroupName;
    }
    /**
     * The type of server group. Valid values:
     * 
     * - `Instance` (default): allows you to add servers by specifying `Ecs`, `Eni`, or `Eci`.
     * - `Ip`: allows you to add servers by specifying IP addresses.
     * - `Fc`: allows you to add servers by specifying functions of Function Compute.
     * 
     */
    @Export(name="serverGroupType", refs={String.class}, tree="[0]")
    private Output<String> serverGroupType;

    /**
     * @return The type of server group. Valid values:
     * 
     * - `Instance` (default): allows you to add servers by specifying `Ecs`, `Eni`, or `Eci`.
     * - `Ip`: allows you to add servers by specifying IP addresses.
     * - `Fc`: allows you to add servers by specifying functions of Function Compute.
     * 
     */
    public Output<String> serverGroupType() {
        return this.serverGroupType;
    }
    /**
     * List of servers. See `servers` below.
     * 
     */
    @Export(name="servers", refs={List.class,ServerGroupServer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServerGroupServer>> servers;

    /**
     * @return List of servers. See `servers` below.
     * 
     */
    public Output<Optional<List<ServerGroupServer>>> servers() {
        return Codegen.optional(this.servers);
    }
    /**
     * Only applicable to the ALB Ingress scenario, indicating the K8s Service name corresponding to the server group.
     * 
     */
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceName;

    /**
     * @return Only applicable to the ALB Ingress scenario, indicating the K8s Service name corresponding to the server group.
     * 
     */
    public Output<Optional<String>> serviceName() {
        return Codegen.optional(this.serviceName);
    }
    /**
     * Slow start configuration. See `slow_start_config` below.
     * 
     */
    @Export(name="slowStartConfig", refs={ServerGroupSlowStartConfig.class}, tree="[0]")
    private Output<ServerGroupSlowStartConfig> slowStartConfig;

    /**
     * @return Slow start configuration. See `slow_start_config` below.
     * 
     */
    public Output<ServerGroupSlowStartConfig> slowStartConfig() {
        return this.slowStartConfig;
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
     * The configuration of health checks See `sticky_session_config` below.
     * 
     */
    @Export(name="stickySessionConfig", refs={ServerGroupStickySessionConfig.class}, tree="[0]")
    private Output</* @Nullable */ ServerGroupStickySessionConfig> stickySessionConfig;

    /**
     * @return The configuration of health checks See `sticky_session_config` below.
     * 
     */
    public Output<Optional<ServerGroupStickySessionConfig>> stickySessionConfig() {
        return Codegen.optional(this.stickySessionConfig);
    }
    /**
     * The creation time of the resource
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The creation time of the resource
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Url consistency hash parameter configuration See `uch_config` below.
     * 
     */
    @Export(name="uchConfig", refs={ServerGroupUchConfig.class}, tree="[0]")
    private Output</* @Nullable */ ServerGroupUchConfig> uchConfig;

    /**
     * @return Url consistency hash parameter configuration See `uch_config` below.
     * 
     */
    public Output<Optional<ServerGroupUchConfig>> uchConfig() {
        return Codegen.optional(this.uchConfig);
    }
    /**
     * Specifies whether to enable persistent TCP connections.
     * 
     */
    @Export(name="upstreamKeepaliveEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> upstreamKeepaliveEnabled;

    /**
     * @return Specifies whether to enable persistent TCP connections.
     * 
     */
    public Output<Optional<Boolean>> upstreamKeepaliveEnabled() {
        return Codegen.optional(this.upstreamKeepaliveEnabled);
    }
    /**
     * The ID of the virtual private cloud (VPC). You can add only servers that are deployed in the specified VPC to the server group.
     * 
     * &gt; **NOTE:**   This parameter takes effect when the `ServerGroupType` parameter is set to `Instance` or `Ip`.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vpcId;

    /**
     * @return The ID of the virtual private cloud (VPC). You can add only servers that are deployed in the specified VPC to the server group.
     * 
     * &gt; **NOTE:**   This parameter takes effect when the `ServerGroupType` parameter is set to `Instance` or `Ip`.
     * 
     */
    public Output<Optional<String>> vpcId() {
        return Codegen.optional(this.vpcId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerGroup(java.lang.String name) {
        this(name, ServerGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerGroup(java.lang.String name, ServerGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerGroup(java.lang.String name, ServerGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:alb/serverGroup:ServerGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ServerGroup(java.lang.String name, Output<java.lang.String> id, @Nullable ServerGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:alb/serverGroup:ServerGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static ServerGroupArgs makeArgs(ServerGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServerGroupArgs.Empty : args;
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
    public static ServerGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable ServerGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerGroup(name, id, state, options);
    }
}
