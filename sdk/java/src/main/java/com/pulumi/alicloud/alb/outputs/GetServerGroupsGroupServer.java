// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerGroupsGroupServer {
    /**
     * @return The description of the server.
     * 
     */
    private final String description;
    /**
     * @return The port that is used by the server. Valid values: `1` to `65535`.
     * 
     */
    private final Integer port;
    /**
     * @return The ID of the ECS instance, ENI instance or ECI instance.
     * 
     */
    private final String serverId;
    /**
     * @return The IP address of the ENI instance when it is in the inclusive ENI mode.
     * 
     */
    private final String serverIp;
    /**
     * @return The type of the server. The type of the server. Valid values: `Ecs`, `Eni` and `Eci`.
     * 
     */
    private final String serverType;
    /**
     * @return The status of the resource. Valid values: `Provisioning`, `Available` and `Configuring`.
     * 
     */
    private final String status;
    /**
     * @return The weight of the server.  Valid values: `0` to `100`. Default value: `100`. If the value is set to `0`, no requests are forwarded to the server.
     * 
     */
    private final Integer weight;

    @CustomType.Constructor
    private GetServerGroupsGroupServer(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("serverId") String serverId,
        @CustomType.Parameter("serverIp") String serverIp,
        @CustomType.Parameter("serverType") String serverType,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("weight") Integer weight) {
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
    public String description() {
        return this.description;
    }
    /**
     * @return The port that is used by the server. Valid values: `1` to `65535`.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The ID of the ECS instance, ENI instance or ECI instance.
     * 
     */
    public String serverId() {
        return this.serverId;
    }
    /**
     * @return The IP address of the ENI instance when it is in the inclusive ENI mode.
     * 
     */
    public String serverIp() {
        return this.serverIp;
    }
    /**
     * @return The type of the server. The type of the server. Valid values: `Ecs`, `Eni` and `Eci`.
     * 
     */
    public String serverType() {
        return this.serverType;
    }
    /**
     * @return The status of the resource. Valid values: `Provisioning`, `Available` and `Configuring`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The weight of the server.  Valid values: `0` to `100`. Default value: `100`. If the value is set to `0`, no requests are forwarded to the server.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerGroupsGroupServer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private Integer port;
        private String serverId;
        private String serverIp;
        private String serverType;
        private String status;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerGroupsGroupServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.port = defaults.port;
    	      this.serverId = defaults.serverId;
    	      this.serverIp = defaults.serverIp;
    	      this.serverType = defaults.serverType;
    	      this.status = defaults.status;
    	      this.weight = defaults.weight;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder serverId(String serverId) {
            this.serverId = Objects.requireNonNull(serverId);
            return this;
        }
        public Builder serverIp(String serverIp) {
            this.serverIp = Objects.requireNonNull(serverIp);
            return this;
        }
        public Builder serverType(String serverType) {
            this.serverType = Objects.requireNonNull(serverType);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public GetServerGroupsGroupServer build() {
            return new GetServerGroupsGroupServer(description, port, serverId, serverIp, serverType, status, weight);
        }
    }
}