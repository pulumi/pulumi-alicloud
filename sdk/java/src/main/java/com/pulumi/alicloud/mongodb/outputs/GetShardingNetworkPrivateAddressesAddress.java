// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mongodb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetShardingNetworkPrivateAddressesAddress {
    /**
     * @return The db instance id.
     * 
     */
    private String dbInstanceId;
    /**
     * @return The remaining duration of the classic network address. Unit: `seconds`.
     * 
     */
    private String expiredTime;
    /**
     * @return The IP address of the instance.
     * 
     */
    private String ipAddress;
    /**
     * @return The endpoint of the instance.
     * 
     */
    private String networkAddress;
    /**
     * @return The type of the network.
     * 
     */
    private String networkType;
    /**
     * @return The ID of the `mongos`, `shard`, or `Configserver` node in the sharded cluster instance.
     * 
     */
    private String nodeId;
    /**
     * @return The type of the node.
     * 
     */
    private String nodeType;
    /**
     * @return The port number.
     * 
     */
    private String port;
    /**
     * @return The role of the node.
     * 
     */
    private String role;
    /**
     * @return The ID of the VPC.
     * 
     */
    private String vpcId;
    /**
     * @return The vSwitch ID of the VPC.
     * 
     */
    private String vswitchId;

    private GetShardingNetworkPrivateAddressesAddress() {}
    /**
     * @return The db instance id.
     * 
     */
    public String dbInstanceId() {
        return this.dbInstanceId;
    }
    /**
     * @return The remaining duration of the classic network address. Unit: `seconds`.
     * 
     */
    public String expiredTime() {
        return this.expiredTime;
    }
    /**
     * @return The IP address of the instance.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return The endpoint of the instance.
     * 
     */
    public String networkAddress() {
        return this.networkAddress;
    }
    /**
     * @return The type of the network.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return The ID of the `mongos`, `shard`, or `Configserver` node in the sharded cluster instance.
     * 
     */
    public String nodeId() {
        return this.nodeId;
    }
    /**
     * @return The type of the node.
     * 
     */
    public String nodeType() {
        return this.nodeType;
    }
    /**
     * @return The port number.
     * 
     */
    public String port() {
        return this.port;
    }
    /**
     * @return The role of the node.
     * 
     */
    public String role() {
        return this.role;
    }
    /**
     * @return The ID of the VPC.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The vSwitch ID of the VPC.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetShardingNetworkPrivateAddressesAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dbInstanceId;
        private String expiredTime;
        private String ipAddress;
        private String networkAddress;
        private String networkType;
        private String nodeId;
        private String nodeType;
        private String port;
        private String role;
        private String vpcId;
        private String vswitchId;
        public Builder() {}
        public Builder(GetShardingNetworkPrivateAddressesAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbInstanceId = defaults.dbInstanceId;
    	      this.expiredTime = defaults.expiredTime;
    	      this.ipAddress = defaults.ipAddress;
    	      this.networkAddress = defaults.networkAddress;
    	      this.networkType = defaults.networkType;
    	      this.nodeId = defaults.nodeId;
    	      this.nodeType = defaults.nodeType;
    	      this.port = defaults.port;
    	      this.role = defaults.role;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder dbInstanceId(String dbInstanceId) {
            if (dbInstanceId == null) {
              throw new MissingRequiredPropertyException("GetShardingNetworkPrivateAddressesAddress", "dbInstanceId");
            }
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder expiredTime(String expiredTime) {
            if (expiredTime == null) {
              throw new MissingRequiredPropertyException("GetShardingNetworkPrivateAddressesAddress", "expiredTime");
            }
            this.expiredTime = expiredTime;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            if (ipAddress == null) {
              throw new MissingRequiredPropertyException("GetShardingNetworkPrivateAddressesAddress", "ipAddress");
            }
            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder networkAddress(String networkAddress) {
            if (networkAddress == null) {
              throw new MissingRequiredPropertyException("GetShardingNetworkPrivateAddressesAddress", "networkAddress");
            }
            this.networkAddress = networkAddress;
            return this;
        }
        @CustomType.Setter
        public Builder networkType(String networkType) {
            if (networkType == null) {
              throw new MissingRequiredPropertyException("GetShardingNetworkPrivateAddressesAddress", "networkType");
            }
            this.networkType = networkType;
            return this;
        }
        @CustomType.Setter
        public Builder nodeId(String nodeId) {
            if (nodeId == null) {
              throw new MissingRequiredPropertyException("GetShardingNetworkPrivateAddressesAddress", "nodeId");
            }
            this.nodeId = nodeId;
            return this;
        }
        @CustomType.Setter
        public Builder nodeType(String nodeType) {
            if (nodeType == null) {
              throw new MissingRequiredPropertyException("GetShardingNetworkPrivateAddressesAddress", "nodeType");
            }
            this.nodeType = nodeType;
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetShardingNetworkPrivateAddressesAddress", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder role(String role) {
            if (role == null) {
              throw new MissingRequiredPropertyException("GetShardingNetworkPrivateAddressesAddress", "role");
            }
            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetShardingNetworkPrivateAddressesAddress", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            if (vswitchId == null) {
              throw new MissingRequiredPropertyException("GetShardingNetworkPrivateAddressesAddress", "vswitchId");
            }
            this.vswitchId = vswitchId;
            return this;
        }
        public GetShardingNetworkPrivateAddressesAddress build() {
            final var _resultValue = new GetShardingNetworkPrivateAddressesAddress();
            _resultValue.dbInstanceId = dbInstanceId;
            _resultValue.expiredTime = expiredTime;
            _resultValue.ipAddress = ipAddress;
            _resultValue.networkAddress = networkAddress;
            _resultValue.networkType = networkType;
            _resultValue.nodeId = nodeId;
            _resultValue.nodeType = nodeType;
            _resultValue.port = port;
            _resultValue.role = role;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchId = vswitchId;
            return _resultValue;
        }
    }
}