// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerGroupServer {
    /**
     * @return The description of the server.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The port that is used by the server. Valid values: `1` to `65535`.
     * 
     */
    private final @Nullable Integer port;
    /**
     * @return The ID of the ECS instance, ENI instance or ECI instance.
     * 
     */
    private final @Nullable String serverId;
    /**
     * @return The IP address of the ENI instance when it is in the inclusive ENI mode.
     * 
     */
    private final @Nullable String serverIp;
    /**
     * @return The type of the server. The type of the server. Valid values: `Ecs`, `Eni` and `Eci`.
     * 
     */
    private final @Nullable String serverType;
    /**
     * @return The status of the resource.
     * 
     */
    private final @Nullable String status;
    /**
     * @return The weight of the server. Valid values: `0` to `100`. Default value: `100`. If the value is set to `0`, no
     * requests are forwarded to the server.
     * 
     */
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private ServerGroupServer(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("serverId") @Nullable String serverId,
        @CustomType.Parameter("serverIp") @Nullable String serverIp,
        @CustomType.Parameter("serverType") @Nullable String serverType,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.description = description;
        this.port = port;
        this.serverId = serverId;
        this.serverIp = serverIp;
        this.serverType = serverType;
        this.status = status;
        this.weight = weight;
    }

    /**
     * @return The description of the server.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The port that is used by the server. Valid values: `1` to `65535`.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The ID of the ECS instance, ENI instance or ECI instance.
     * 
     */
    public Optional<String> serverId() {
        return Optional.ofNullable(this.serverId);
    }
    /**
     * @return The IP address of the ENI instance when it is in the inclusive ENI mode.
     * 
     */
    public Optional<String> serverIp() {
        return Optional.ofNullable(this.serverIp);
    }
    /**
     * @return The type of the server. The type of the server. Valid values: `Ecs`, `Eni` and `Eci`.
     * 
     */
    public Optional<String> serverType() {
        return Optional.ofNullable(this.serverType);
    }
    /**
     * @return The status of the resource.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The weight of the server. Valid values: `0` to `100`. Default value: `100`. If the value is set to `0`, no
     * requests are forwarded to the server.
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerGroupServer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Integer port;
        private @Nullable String serverId;
        private @Nullable String serverIp;
        private @Nullable String serverType;
        private @Nullable String status;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerGroupServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.port = defaults.port;
    	      this.serverId = defaults.serverId;
    	      this.serverIp = defaults.serverIp;
    	      this.serverType = defaults.serverType;
    	      this.status = defaults.status;
    	      this.weight = defaults.weight;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder serverId(@Nullable String serverId) {
            this.serverId = serverId;
            return this;
        }
        public Builder serverIp(@Nullable String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public Builder serverType(@Nullable String serverType) {
            this.serverType = serverType;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public ServerGroupServer build() {
            return new ServerGroupServer(description, port, serverId, serverIp, serverType, status, weight);
        }
    }
}