// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMasterSlaveServerGroupsGroupServer {
    /**
     * @return ID of the attached ECS instance.
     * 
     */
    private String instanceId;
    /**
     * @return (Removed from v1.63.0) Determine if the server is executing.
     * 
     */
    private Integer isBackup;
    /**
     * @return The port used by the master slave server group.
     * 
     */
    private Integer port;
    /**
     * @return The server type of the attached ECS instance.
     * 
     */
    private String serverType;
    /**
     * @return Weight associated to the ECS instance.
     * 
     */
    private Integer weight;

    private GetMasterSlaveServerGroupsGroupServer() {}
    /**
     * @return ID of the attached ECS instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return (Removed from v1.63.0) Determine if the server is executing.
     * 
     */
    public Integer isBackup() {
        return this.isBackup;
    }
    /**
     * @return The port used by the master slave server group.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The server type of the attached ECS instance.
     * 
     */
    public String serverType() {
        return this.serverType;
    }
    /**
     * @return Weight associated to the ECS instance.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMasterSlaveServerGroupsGroupServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instanceId;
        private Integer isBackup;
        private Integer port;
        private String serverType;
        private Integer weight;
        public Builder() {}
        public Builder(GetMasterSlaveServerGroupsGroupServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.isBackup = defaults.isBackup;
    	      this.port = defaults.port;
    	      this.serverType = defaults.serverType;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetMasterSlaveServerGroupsGroupServer", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder isBackup(Integer isBackup) {
            if (isBackup == null) {
              throw new MissingRequiredPropertyException("GetMasterSlaveServerGroupsGroupServer", "isBackup");
            }
            this.isBackup = isBackup;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetMasterSlaveServerGroupsGroupServer", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder serverType(String serverType) {
            if (serverType == null) {
              throw new MissingRequiredPropertyException("GetMasterSlaveServerGroupsGroupServer", "serverType");
            }
            this.serverType = serverType;
            return this;
        }
        @CustomType.Setter
        public Builder weight(Integer weight) {
            if (weight == null) {
              throw new MissingRequiredPropertyException("GetMasterSlaveServerGroupsGroupServer", "weight");
            }
            this.weight = weight;
            return this;
        }
        public GetMasterSlaveServerGroupsGroupServer build() {
            final var _resultValue = new GetMasterSlaveServerGroupsGroupServer();
            _resultValue.instanceId = instanceId;
            _resultValue.isBackup = isBackup;
            _resultValue.port = port;
            _resultValue.serverType = serverType;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}