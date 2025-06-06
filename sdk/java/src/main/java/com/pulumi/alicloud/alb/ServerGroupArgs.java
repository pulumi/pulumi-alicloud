// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb;

import com.pulumi.alicloud.alb.inputs.ServerGroupConnectionDrainConfigArgs;
import com.pulumi.alicloud.alb.inputs.ServerGroupHealthCheckConfigArgs;
import com.pulumi.alicloud.alb.inputs.ServerGroupServerArgs;
import com.pulumi.alicloud.alb.inputs.ServerGroupSlowStartConfigArgs;
import com.pulumi.alicloud.alb.inputs.ServerGroupStickySessionConfigArgs;
import com.pulumi.alicloud.alb.inputs.ServerGroupUchConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerGroupArgs Empty = new ServerGroupArgs();

    /**
     * Elegant interrupt configuration. See `connection_drain_config` below.
     * 
     */
    @Import(name="connectionDrainConfig")
    private @Nullable Output<ServerGroupConnectionDrainConfigArgs> connectionDrainConfig;

    /**
     * @return Elegant interrupt configuration. See `connection_drain_config` below.
     * 
     */
    public Optional<Output<ServerGroupConnectionDrainConfigArgs>> connectionDrainConfig() {
        return Optional.ofNullable(this.connectionDrainConfig);
    }

    /**
     * Indicates whether cross-zone load balancing is enabled for the server group. Valid values:
     * 
     */
    @Import(name="crossZoneEnabled")
    private @Nullable Output<Boolean> crossZoneEnabled;

    /**
     * @return Indicates whether cross-zone load balancing is enabled for the server group. Valid values:
     * 
     */
    public Optional<Output<Boolean>> crossZoneEnabled() {
        return Optional.ofNullable(this.crossZoneEnabled);
    }

    /**
     * Whether to PreCheck only this request. Value:
     * true: Send a check request,
     * false (default): Send a normal request.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Whether to PreCheck only this request. Value:
     * true: Send a check request,
     * false (default): Send a normal request.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The configuration of health checks See `health_check_config` below.
     * 
     */
    @Import(name="healthCheckConfig", required=true)
    private Output<ServerGroupHealthCheckConfigArgs> healthCheckConfig;

    /**
     * @return The configuration of health checks See `health_check_config` below.
     * 
     */
    public Output<ServerGroupHealthCheckConfigArgs> healthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * The ID of the resource group to which you want to transfer the cloud resource.
     * 
     * &gt; **NOTE:**   You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see [What is resource management?](https://www.alibabacloud.com/help/en/doc-detail/94475.html)
     * 
     */
    @Import(name="healthCheckTemplateId")
    private @Nullable Output<String> healthCheckTemplateId;

    /**
     * @return The ID of the resource group to which you want to transfer the cloud resource.
     * 
     * &gt; **NOTE:**   You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see [What is resource management?](https://www.alibabacloud.com/help/en/doc-detail/94475.html)
     * 
     */
    public Optional<Output<String>> healthCheckTemplateId() {
        return Optional.ofNullable(this.healthCheckTemplateId);
    }

    /**
     * Enable Ipv6
     * 
     */
    @Import(name="ipv6Enabled")
    private @Nullable Output<Boolean> ipv6Enabled;

    /**
     * @return Enable Ipv6
     * 
     */
    public Optional<Output<Boolean>> ipv6Enabled() {
        return Optional.ofNullable(this.ipv6Enabled);
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
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

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
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Elegant interrupt configuration.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return Elegant interrupt configuration.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
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
    @Import(name="scheduler")
    private @Nullable Output<String> scheduler;

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
    public Optional<Output<String>> scheduler() {
        return Optional.ofNullable(this.scheduler);
    }

    /**
     * The name of the server group. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
     * 
     */
    @Import(name="serverGroupName", required=true)
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
    @Import(name="serverGroupType")
    private @Nullable Output<String> serverGroupType;

    /**
     * @return The type of server group. Valid values:
     * 
     * - `Instance` (default): allows you to add servers by specifying `Ecs`, `Eni`, or `Eci`.
     * - `Ip`: allows you to add servers by specifying IP addresses.
     * - `Fc`: allows you to add servers by specifying functions of Function Compute.
     * 
     */
    public Optional<Output<String>> serverGroupType() {
        return Optional.ofNullable(this.serverGroupType);
    }

    /**
     * List of servers. See `servers` below.
     * 
     */
    @Import(name="servers")
    private @Nullable Output<List<ServerGroupServerArgs>> servers;

    /**
     * @return List of servers. See `servers` below.
     * 
     */
    public Optional<Output<List<ServerGroupServerArgs>>> servers() {
        return Optional.ofNullable(this.servers);
    }

    /**
     * Only applicable to the ALB Ingress scenario, indicating the K8s Service name corresponding to the server group.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return Only applicable to the ALB Ingress scenario, indicating the K8s Service name corresponding to the server group.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * Slow start configuration. See `slow_start_config` below.
     * 
     */
    @Import(name="slowStartConfig")
    private @Nullable Output<ServerGroupSlowStartConfigArgs> slowStartConfig;

    /**
     * @return Slow start configuration. See `slow_start_config` below.
     * 
     */
    public Optional<Output<ServerGroupSlowStartConfigArgs>> slowStartConfig() {
        return Optional.ofNullable(this.slowStartConfig);
    }

    /**
     * The configuration of health checks See `sticky_session_config` below.
     * 
     */
    @Import(name="stickySessionConfig")
    private @Nullable Output<ServerGroupStickySessionConfigArgs> stickySessionConfig;

    /**
     * @return The configuration of health checks See `sticky_session_config` below.
     * 
     */
    public Optional<Output<ServerGroupStickySessionConfigArgs>> stickySessionConfig() {
        return Optional.ofNullable(this.stickySessionConfig);
    }

    /**
     * The creation time of the resource
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The creation time of the resource
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Url consistency hash parameter configuration See `uch_config` below.
     * 
     */
    @Import(name="uchConfig")
    private @Nullable Output<ServerGroupUchConfigArgs> uchConfig;

    /**
     * @return Url consistency hash parameter configuration See `uch_config` below.
     * 
     */
    public Optional<Output<ServerGroupUchConfigArgs>> uchConfig() {
        return Optional.ofNullable(this.uchConfig);
    }

    /**
     * Specifies whether to enable persistent TCP connections.
     * 
     */
    @Import(name="upstreamKeepaliveEnabled")
    private @Nullable Output<Boolean> upstreamKeepaliveEnabled;

    /**
     * @return Specifies whether to enable persistent TCP connections.
     * 
     */
    public Optional<Output<Boolean>> upstreamKeepaliveEnabled() {
        return Optional.ofNullable(this.upstreamKeepaliveEnabled);
    }

    /**
     * The ID of the virtual private cloud (VPC). You can add only servers that are deployed in the specified VPC to the server group.
     * 
     * &gt; **NOTE:**   This parameter takes effect when the `ServerGroupType` parameter is set to `Instance` or `Ip`.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the virtual private cloud (VPC). You can add only servers that are deployed in the specified VPC to the server group.
     * 
     * &gt; **NOTE:**   This parameter takes effect when the `ServerGroupType` parameter is set to `Instance` or `Ip`.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private ServerGroupArgs() {}

    private ServerGroupArgs(ServerGroupArgs $) {
        this.connectionDrainConfig = $.connectionDrainConfig;
        this.crossZoneEnabled = $.crossZoneEnabled;
        this.dryRun = $.dryRun;
        this.healthCheckConfig = $.healthCheckConfig;
        this.healthCheckTemplateId = $.healthCheckTemplateId;
        this.ipv6Enabled = $.ipv6Enabled;
        this.protocol = $.protocol;
        this.resourceGroupId = $.resourceGroupId;
        this.scheduler = $.scheduler;
        this.serverGroupName = $.serverGroupName;
        this.serverGroupType = $.serverGroupType;
        this.servers = $.servers;
        this.serviceName = $.serviceName;
        this.slowStartConfig = $.slowStartConfig;
        this.stickySessionConfig = $.stickySessionConfig;
        this.tags = $.tags;
        this.uchConfig = $.uchConfig;
        this.upstreamKeepaliveEnabled = $.upstreamKeepaliveEnabled;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerGroupArgs $;

        public Builder() {
            $ = new ServerGroupArgs();
        }

        public Builder(ServerGroupArgs defaults) {
            $ = new ServerGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionDrainConfig Elegant interrupt configuration. See `connection_drain_config` below.
         * 
         * @return builder
         * 
         */
        public Builder connectionDrainConfig(@Nullable Output<ServerGroupConnectionDrainConfigArgs> connectionDrainConfig) {
            $.connectionDrainConfig = connectionDrainConfig;
            return this;
        }

        /**
         * @param connectionDrainConfig Elegant interrupt configuration. See `connection_drain_config` below.
         * 
         * @return builder
         * 
         */
        public Builder connectionDrainConfig(ServerGroupConnectionDrainConfigArgs connectionDrainConfig) {
            return connectionDrainConfig(Output.of(connectionDrainConfig));
        }

        /**
         * @param crossZoneEnabled Indicates whether cross-zone load balancing is enabled for the server group. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder crossZoneEnabled(@Nullable Output<Boolean> crossZoneEnabled) {
            $.crossZoneEnabled = crossZoneEnabled;
            return this;
        }

        /**
         * @param crossZoneEnabled Indicates whether cross-zone load balancing is enabled for the server group. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder crossZoneEnabled(Boolean crossZoneEnabled) {
            return crossZoneEnabled(Output.of(crossZoneEnabled));
        }

        /**
         * @param dryRun Whether to PreCheck only this request. Value:
         * true: Send a check request,
         * false (default): Send a normal request.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Whether to PreCheck only this request. Value:
         * true: Send a check request,
         * false (default): Send a normal request.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param healthCheckConfig The configuration of health checks See `health_check_config` below.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckConfig(Output<ServerGroupHealthCheckConfigArgs> healthCheckConfig) {
            $.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * @param healthCheckConfig The configuration of health checks See `health_check_config` below.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckConfig(ServerGroupHealthCheckConfigArgs healthCheckConfig) {
            return healthCheckConfig(Output.of(healthCheckConfig));
        }

        /**
         * @param healthCheckTemplateId The ID of the resource group to which you want to transfer the cloud resource.
         * 
         * &gt; **NOTE:**   You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see [What is resource management?](https://www.alibabacloud.com/help/en/doc-detail/94475.html)
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTemplateId(@Nullable Output<String> healthCheckTemplateId) {
            $.healthCheckTemplateId = healthCheckTemplateId;
            return this;
        }

        /**
         * @param healthCheckTemplateId The ID of the resource group to which you want to transfer the cloud resource.
         * 
         * &gt; **NOTE:**   You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see [What is resource management?](https://www.alibabacloud.com/help/en/doc-detail/94475.html)
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTemplateId(String healthCheckTemplateId) {
            return healthCheckTemplateId(Output.of(healthCheckTemplateId));
        }

        /**
         * @param ipv6Enabled Enable Ipv6
         * 
         * @return builder
         * 
         */
        public Builder ipv6Enabled(@Nullable Output<Boolean> ipv6Enabled) {
            $.ipv6Enabled = ipv6Enabled;
            return this;
        }

        /**
         * @param ipv6Enabled Enable Ipv6
         * 
         * @return builder
         * 
         */
        public Builder ipv6Enabled(Boolean ipv6Enabled) {
            return ipv6Enabled(Output.of(ipv6Enabled));
        }

        /**
         * @param protocol The backend protocol. Valid values:
         * 
         * *   `HTTP`: allows you to associate an HTTPS, HTTP, or QUIC listener with the server group. This is the default value.
         * 
         * *   `HTTPS`: allows you to associate HTTPS listeners with backend servers.
         * 
         * *   `gRPC`: allows you to associate an HTTPS or QUIC listener with the server group.
         * 
         * &gt; **NOTE:**   You do not need to specify a backend protocol if you set `ServerGroupType` to `Fc`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The backend protocol. Valid values:
         * 
         * *   `HTTP`: allows you to associate an HTTPS, HTTP, or QUIC listener with the server group. This is the default value.
         * 
         * *   `HTTPS`: allows you to associate HTTPS listeners with backend servers.
         * 
         * *   `gRPC`: allows you to associate an HTTPS or QUIC listener with the server group.
         * 
         * &gt; **NOTE:**   You do not need to specify a backend protocol if you set `ServerGroupType` to `Fc`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param resourceGroupId Elegant interrupt configuration.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId Elegant interrupt configuration.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param scheduler The scheduling algorithm. Valid values:
         * 
         * *   `Wrr` (default): The weighted round-robin algorithm is used. Backend servers that have higher weights receive more requests than those that have lower weights.
         * 
         * *   `Wlc`: The weighted least connections algorithm is used. Requests are distributed based on the weights and the number of connections to backend servers. If two backend servers have the same weight, the backend server that has fewer connections is expected to receive more requests.
         * 
         * *   `Sch`: The consistent hashing algorithm is used. Requests from the same source IP address are distributed to the same backend server.
         * 
         * &gt; **NOTE:**  This parameter takes effect when the `ServerGroupType` parameter is set to `Instance` or `Ip`.
         * 
         * @return builder
         * 
         */
        public Builder scheduler(@Nullable Output<String> scheduler) {
            $.scheduler = scheduler;
            return this;
        }

        /**
         * @param scheduler The scheduling algorithm. Valid values:
         * 
         * *   `Wrr` (default): The weighted round-robin algorithm is used. Backend servers that have higher weights receive more requests than those that have lower weights.
         * 
         * *   `Wlc`: The weighted least connections algorithm is used. Requests are distributed based on the weights and the number of connections to backend servers. If two backend servers have the same weight, the backend server that has fewer connections is expected to receive more requests.
         * 
         * *   `Sch`: The consistent hashing algorithm is used. Requests from the same source IP address are distributed to the same backend server.
         * 
         * &gt; **NOTE:**  This parameter takes effect when the `ServerGroupType` parameter is set to `Instance` or `Ip`.
         * 
         * @return builder
         * 
         */
        public Builder scheduler(String scheduler) {
            return scheduler(Output.of(scheduler));
        }

        /**
         * @param serverGroupName The name of the server group. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupName(Output<String> serverGroupName) {
            $.serverGroupName = serverGroupName;
            return this;
        }

        /**
         * @param serverGroupName The name of the server group. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupName(String serverGroupName) {
            return serverGroupName(Output.of(serverGroupName));
        }

        /**
         * @param serverGroupType The type of server group. Valid values:
         * 
         * - `Instance` (default): allows you to add servers by specifying `Ecs`, `Eni`, or `Eci`.
         * - `Ip`: allows you to add servers by specifying IP addresses.
         * - `Fc`: allows you to add servers by specifying functions of Function Compute.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupType(@Nullable Output<String> serverGroupType) {
            $.serverGroupType = serverGroupType;
            return this;
        }

        /**
         * @param serverGroupType The type of server group. Valid values:
         * 
         * - `Instance` (default): allows you to add servers by specifying `Ecs`, `Eni`, or `Eci`.
         * - `Ip`: allows you to add servers by specifying IP addresses.
         * - `Fc`: allows you to add servers by specifying functions of Function Compute.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupType(String serverGroupType) {
            return serverGroupType(Output.of(serverGroupType));
        }

        /**
         * @param servers List of servers. See `servers` below.
         * 
         * @return builder
         * 
         */
        public Builder servers(@Nullable Output<List<ServerGroupServerArgs>> servers) {
            $.servers = servers;
            return this;
        }

        /**
         * @param servers List of servers. See `servers` below.
         * 
         * @return builder
         * 
         */
        public Builder servers(List<ServerGroupServerArgs> servers) {
            return servers(Output.of(servers));
        }

        /**
         * @param servers List of servers. See `servers` below.
         * 
         * @return builder
         * 
         */
        public Builder servers(ServerGroupServerArgs... servers) {
            return servers(List.of(servers));
        }

        /**
         * @param serviceName Only applicable to the ALB Ingress scenario, indicating the K8s Service name corresponding to the server group.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Only applicable to the ALB Ingress scenario, indicating the K8s Service name corresponding to the server group.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param slowStartConfig Slow start configuration. See `slow_start_config` below.
         * 
         * @return builder
         * 
         */
        public Builder slowStartConfig(@Nullable Output<ServerGroupSlowStartConfigArgs> slowStartConfig) {
            $.slowStartConfig = slowStartConfig;
            return this;
        }

        /**
         * @param slowStartConfig Slow start configuration. See `slow_start_config` below.
         * 
         * @return builder
         * 
         */
        public Builder slowStartConfig(ServerGroupSlowStartConfigArgs slowStartConfig) {
            return slowStartConfig(Output.of(slowStartConfig));
        }

        /**
         * @param stickySessionConfig The configuration of health checks See `sticky_session_config` below.
         * 
         * @return builder
         * 
         */
        public Builder stickySessionConfig(@Nullable Output<ServerGroupStickySessionConfigArgs> stickySessionConfig) {
            $.stickySessionConfig = stickySessionConfig;
            return this;
        }

        /**
         * @param stickySessionConfig The configuration of health checks See `sticky_session_config` below.
         * 
         * @return builder
         * 
         */
        public Builder stickySessionConfig(ServerGroupStickySessionConfigArgs stickySessionConfig) {
            return stickySessionConfig(Output.of(stickySessionConfig));
        }

        /**
         * @param tags The creation time of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The creation time of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param uchConfig Url consistency hash parameter configuration See `uch_config` below.
         * 
         * @return builder
         * 
         */
        public Builder uchConfig(@Nullable Output<ServerGroupUchConfigArgs> uchConfig) {
            $.uchConfig = uchConfig;
            return this;
        }

        /**
         * @param uchConfig Url consistency hash parameter configuration See `uch_config` below.
         * 
         * @return builder
         * 
         */
        public Builder uchConfig(ServerGroupUchConfigArgs uchConfig) {
            return uchConfig(Output.of(uchConfig));
        }

        /**
         * @param upstreamKeepaliveEnabled Specifies whether to enable persistent TCP connections.
         * 
         * @return builder
         * 
         */
        public Builder upstreamKeepaliveEnabled(@Nullable Output<Boolean> upstreamKeepaliveEnabled) {
            $.upstreamKeepaliveEnabled = upstreamKeepaliveEnabled;
            return this;
        }

        /**
         * @param upstreamKeepaliveEnabled Specifies whether to enable persistent TCP connections.
         * 
         * @return builder
         * 
         */
        public Builder upstreamKeepaliveEnabled(Boolean upstreamKeepaliveEnabled) {
            return upstreamKeepaliveEnabled(Output.of(upstreamKeepaliveEnabled));
        }

        /**
         * @param vpcId The ID of the virtual private cloud (VPC). You can add only servers that are deployed in the specified VPC to the server group.
         * 
         * &gt; **NOTE:**   This parameter takes effect when the `ServerGroupType` parameter is set to `Instance` or `Ip`.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the virtual private cloud (VPC). You can add only servers that are deployed in the specified VPC to the server group.
         * 
         * &gt; **NOTE:**   This parameter takes effect when the `ServerGroupType` parameter is set to `Instance` or `Ip`.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public ServerGroupArgs build() {
            if ($.healthCheckConfig == null) {
                throw new MissingRequiredPropertyException("ServerGroupArgs", "healthCheckConfig");
            }
            if ($.serverGroupName == null) {
                throw new MissingRequiredPropertyException("ServerGroupArgs", "serverGroupName");
            }
            return $;
        }
    }

}
