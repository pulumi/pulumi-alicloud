// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gwlb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerGroupServer {
    /**
     * @return (Optional, Computed, Int) The port that is used by the backend server.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return The server group ID.
     * 
     */
    private @Nullable String serverGroupId;
    /**
     * @return The backend server ID.
     * 
     * - If the server group is of the `Instance` type, set this parameter to the IDs of servers of the `Ecs`, `Eni`, or `Eci` type.
     * - If the server group is of the `Ip` type, set ServerId to IP addresses.
     * 
     */
    private String serverId;
    /**
     * @return The IP address of the backend server.
     * 
     */
    private @Nullable String serverIp;
    /**
     * @return The type of the backend server. Valid values:
     * 
     * - `Ecs`: Elastic Compute Service (ECS) instance
     * - `Eni`: elastic network interface (ENI)
     * - `Eci`: elastic container instance
     * - `Ip`: IP address
     * 
     */
    private String serverType;
    /**
     * @return Indicates the status of the backend server.
     * 
     */
    private @Nullable String status;

    private ServerGroupServer() {}
    /**
     * @return (Optional, Computed, Int) The port that is used by the backend server.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The server group ID.
     * 
     */
    public Optional<String> serverGroupId() {
        return Optional.ofNullable(this.serverGroupId);
    }
    /**
     * @return The backend server ID.
     * 
     * - If the server group is of the `Instance` type, set this parameter to the IDs of servers of the `Ecs`, `Eni`, or `Eci` type.
     * - If the server group is of the `Ip` type, set ServerId to IP addresses.
     * 
     */
    public String serverId() {
        return this.serverId;
    }
    /**
     * @return The IP address of the backend server.
     * 
     */
    public Optional<String> serverIp() {
        return Optional.ofNullable(this.serverIp);
    }
    /**
     * @return The type of the backend server. Valid values:
     * 
     * - `Ecs`: Elastic Compute Service (ECS) instance
     * - `Eni`: elastic network interface (ENI)
     * - `Eci`: elastic container instance
     * - `Ip`: IP address
     * 
     */
    public String serverType() {
        return this.serverType;
    }
    /**
     * @return Indicates the status of the backend server.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerGroupServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer port;
        private @Nullable String serverGroupId;
        private String serverId;
        private @Nullable String serverIp;
        private String serverType;
        private @Nullable String status;
        public Builder() {}
        public Builder(ServerGroupServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.serverGroupId = defaults.serverGroupId;
    	      this.serverId = defaults.serverId;
    	      this.serverIp = defaults.serverIp;
    	      this.serverType = defaults.serverType;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder serverGroupId(@Nullable String serverGroupId) {

            this.serverGroupId = serverGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder serverId(String serverId) {
            if (serverId == null) {
              throw new MissingRequiredPropertyException("ServerGroupServer", "serverId");
            }
            this.serverId = serverId;
            return this;
        }
        @CustomType.Setter
        public Builder serverIp(@Nullable String serverIp) {

            this.serverIp = serverIp;
            return this;
        }
        @CustomType.Setter
        public Builder serverType(String serverType) {
            if (serverType == null) {
              throw new MissingRequiredPropertyException("ServerGroupServer", "serverType");
            }
            this.serverType = serverType;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public ServerGroupServer build() {
            final var _resultValue = new ServerGroupServer();
            _resultValue.port = port;
            _resultValue.serverGroupId = serverGroupId;
            _resultValue.serverId = serverId;
            _resultValue.serverIp = serverIp;
            _resultValue.serverType = serverType;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
