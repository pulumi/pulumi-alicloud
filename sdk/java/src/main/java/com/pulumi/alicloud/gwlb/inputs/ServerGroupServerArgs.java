// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gwlb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerGroupServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerGroupServerArgs Empty = new ServerGroupServerArgs();

    /**
     * (Optional, Computed, Int) The port that is used by the backend server.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return (Optional, Computed, Int) The port that is used by the backend server.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The server group ID.
     * 
     */
    @Import(name="serverGroupId")
    private @Nullable Output<String> serverGroupId;

    /**
     * @return The server group ID.
     * 
     */
    public Optional<Output<String>> serverGroupId() {
        return Optional.ofNullable(this.serverGroupId);
    }

    /**
     * The backend server ID.
     * 
     * - If the server group is of the `Instance` type, set this parameter to the IDs of servers of the `Ecs`, `Eni`, or `Eci` type.
     * - If the server group is of the `Ip` type, set ServerId to IP addresses.
     * 
     */
    @Import(name="serverId", required=true)
    private Output<String> serverId;

    /**
     * @return The backend server ID.
     * 
     * - If the server group is of the `Instance` type, set this parameter to the IDs of servers of the `Ecs`, `Eni`, or `Eci` type.
     * - If the server group is of the `Ip` type, set ServerId to IP addresses.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }

    /**
     * The IP address of the backend server.
     * 
     */
    @Import(name="serverIp")
    private @Nullable Output<String> serverIp;

    /**
     * @return The IP address of the backend server.
     * 
     */
    public Optional<Output<String>> serverIp() {
        return Optional.ofNullable(this.serverIp);
    }

    /**
     * The type of the backend server. Valid values:
     * 
     * - `Ecs`: Elastic Compute Service (ECS) instance
     * - `Eni`: elastic network interface (ENI)
     * - `Eci`: elastic container instance
     * - `Ip`: IP address
     * 
     */
    @Import(name="serverType", required=true)
    private Output<String> serverType;

    /**
     * @return The type of the backend server. Valid values:
     * 
     * - `Ecs`: Elastic Compute Service (ECS) instance
     * - `Eni`: elastic network interface (ENI)
     * - `Eci`: elastic container instance
     * - `Ip`: IP address
     * 
     */
    public Output<String> serverType() {
        return this.serverType;
    }

    /**
     * Indicates the status of the backend server.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Indicates the status of the backend server.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private ServerGroupServerArgs() {}

    private ServerGroupServerArgs(ServerGroupServerArgs $) {
        this.port = $.port;
        this.serverGroupId = $.serverGroupId;
        this.serverId = $.serverId;
        this.serverIp = $.serverIp;
        this.serverType = $.serverType;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerGroupServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerGroupServerArgs $;

        public Builder() {
            $ = new ServerGroupServerArgs();
        }

        public Builder(ServerGroupServerArgs defaults) {
            $ = new ServerGroupServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port (Optional, Computed, Int) The port that is used by the backend server.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port (Optional, Computed, Int) The port that is used by the backend server.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param serverGroupId The server group ID.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupId(@Nullable Output<String> serverGroupId) {
            $.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * @param serverGroupId The server group ID.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupId(String serverGroupId) {
            return serverGroupId(Output.of(serverGroupId));
        }

        /**
         * @param serverId The backend server ID.
         * 
         * - If the server group is of the `Instance` type, set this parameter to the IDs of servers of the `Ecs`, `Eni`, or `Eci` type.
         * - If the server group is of the `Ip` type, set ServerId to IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder serverId(Output<String> serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverId The backend server ID.
         * 
         * - If the server group is of the `Instance` type, set this parameter to the IDs of servers of the `Ecs`, `Eni`, or `Eci` type.
         * - If the server group is of the `Ip` type, set ServerId to IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder serverId(String serverId) {
            return serverId(Output.of(serverId));
        }

        /**
         * @param serverIp The IP address of the backend server.
         * 
         * @return builder
         * 
         */
        public Builder serverIp(@Nullable Output<String> serverIp) {
            $.serverIp = serverIp;
            return this;
        }

        /**
         * @param serverIp The IP address of the backend server.
         * 
         * @return builder
         * 
         */
        public Builder serverIp(String serverIp) {
            return serverIp(Output.of(serverIp));
        }

        /**
         * @param serverType The type of the backend server. Valid values:
         * 
         * - `Ecs`: Elastic Compute Service (ECS) instance
         * - `Eni`: elastic network interface (ENI)
         * - `Eci`: elastic container instance
         * - `Ip`: IP address
         * 
         * @return builder
         * 
         */
        public Builder serverType(Output<String> serverType) {
            $.serverType = serverType;
            return this;
        }

        /**
         * @param serverType The type of the backend server. Valid values:
         * 
         * - `Ecs`: Elastic Compute Service (ECS) instance
         * - `Eni`: elastic network interface (ENI)
         * - `Eci`: elastic container instance
         * - `Ip`: IP address
         * 
         * @return builder
         * 
         */
        public Builder serverType(String serverType) {
            return serverType(Output.of(serverType));
        }

        /**
         * @param status Indicates the status of the backend server.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Indicates the status of the backend server.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public ServerGroupServerArgs build() {
            if ($.serverId == null) {
                throw new MissingRequiredPropertyException("ServerGroupServerArgs", "serverId");
            }
            if ($.serverType == null) {
                throw new MissingRequiredPropertyException("ServerGroupServerArgs", "serverType");
            }
            return $;
        }
    }

}
