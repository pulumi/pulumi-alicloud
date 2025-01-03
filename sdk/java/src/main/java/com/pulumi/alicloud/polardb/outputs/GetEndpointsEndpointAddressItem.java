// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.polardb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEndpointsEndpointAddressItem {
    /**
     * @return Connection instance string.
     * 
     */
    private String connectionString;
    /**
     * @return The ip address of connection string.
     * 
     */
    private String ipAddress;
    /**
     * @return IP network type:`Public` or `Private`.
     * 
     */
    private String netType;
    /**
     * @return Intranet connection port.
     * 
     */
    private String port;
    /**
     * @return ID of the VPC the instance belongs to.
     * 
     */
    private String vpcId;
    /**
     * @return ID of the vSwitch the cluster belongs to.
     * 
     */
    private String vswitchId;

    private GetEndpointsEndpointAddressItem() {}
    /**
     * @return Connection instance string.
     * 
     */
    public String connectionString() {
        return this.connectionString;
    }
    /**
     * @return The ip address of connection string.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return IP network type:`Public` or `Private`.
     * 
     */
    public String netType() {
        return this.netType;
    }
    /**
     * @return Intranet connection port.
     * 
     */
    public String port() {
        return this.port;
    }
    /**
     * @return ID of the VPC the instance belongs to.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return ID of the vSwitch the cluster belongs to.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointsEndpointAddressItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connectionString;
        private String ipAddress;
        private String netType;
        private String port;
        private String vpcId;
        private String vswitchId;
        public Builder() {}
        public Builder(GetEndpointsEndpointAddressItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.ipAddress = defaults.ipAddress;
    	      this.netType = defaults.netType;
    	      this.port = defaults.port;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder connectionString(String connectionString) {
            if (connectionString == null) {
              throw new MissingRequiredPropertyException("GetEndpointsEndpointAddressItem", "connectionString");
            }
            this.connectionString = connectionString;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            if (ipAddress == null) {
              throw new MissingRequiredPropertyException("GetEndpointsEndpointAddressItem", "ipAddress");
            }
            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder netType(String netType) {
            if (netType == null) {
              throw new MissingRequiredPropertyException("GetEndpointsEndpointAddressItem", "netType");
            }
            this.netType = netType;
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetEndpointsEndpointAddressItem", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetEndpointsEndpointAddressItem", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            if (vswitchId == null) {
              throw new MissingRequiredPropertyException("GetEndpointsEndpointAddressItem", "vswitchId");
            }
            this.vswitchId = vswitchId;
            return this;
        }
        public GetEndpointsEndpointAddressItem build() {
            final var _resultValue = new GetEndpointsEndpointAddressItem();
            _resultValue.connectionString = connectionString;
            _resultValue.ipAddress = ipAddress;
            _resultValue.netType = netType;
            _resultValue.port = port;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchId = vswitchId;
            return _resultValue;
        }
    }
}
