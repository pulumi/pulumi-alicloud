// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancersBalancerZoneMapping {
    /**
     * @return The ID of the elastic IP address (EIP).
     * 
     */
    private String allocationId;
    /**
     * @return The ID of the elastic network interface (ENI) attached to the NLB instance.
     * 
     */
    private String eniId;
    /**
     * @return The IPv6 address of the NLB instance.
     * 
     */
    private String ipv6Address;
    /**
     * @return The private IPv4 address used by the NLB instance.
     * 
     */
    private String privateIpv4Address;
    /**
     * @return The public IPv4 address used by the NLB instance.
     * 
     */
    private String publicIpv4Address;
    /**
     * @return The ID of the vSwitch. By default, you can specify one vSwitch (subnet) in each zone of the NLB instance.
     * 
     */
    private String vswitchId;
    /**
     * @return The name of the zone.
     * 
     */
    private String zoneId;

    private GetLoadBalancersBalancerZoneMapping() {}
    /**
     * @return The ID of the elastic IP address (EIP).
     * 
     */
    public String allocationId() {
        return this.allocationId;
    }
    /**
     * @return The ID of the elastic network interface (ENI) attached to the NLB instance.
     * 
     */
    public String eniId() {
        return this.eniId;
    }
    /**
     * @return The IPv6 address of the NLB instance.
     * 
     */
    public String ipv6Address() {
        return this.ipv6Address;
    }
    /**
     * @return The private IPv4 address used by the NLB instance.
     * 
     */
    public String privateIpv4Address() {
        return this.privateIpv4Address;
    }
    /**
     * @return The public IPv4 address used by the NLB instance.
     * 
     */
    public String publicIpv4Address() {
        return this.publicIpv4Address;
    }
    /**
     * @return The ID of the vSwitch. By default, you can specify one vSwitch (subnet) in each zone of the NLB instance.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }
    /**
     * @return The name of the zone.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersBalancerZoneMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String allocationId;
        private String eniId;
        private String ipv6Address;
        private String privateIpv4Address;
        private String publicIpv4Address;
        private String vswitchId;
        private String zoneId;
        public Builder() {}
        public Builder(GetLoadBalancersBalancerZoneMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.eniId = defaults.eniId;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.privateIpv4Address = defaults.privateIpv4Address;
    	      this.publicIpv4Address = defaults.publicIpv4Address;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder allocationId(String allocationId) {
            if (allocationId == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancerZoneMapping", "allocationId");
            }
            this.allocationId = allocationId;
            return this;
        }
        @CustomType.Setter
        public Builder eniId(String eniId) {
            if (eniId == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancerZoneMapping", "eniId");
            }
            this.eniId = eniId;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Address(String ipv6Address) {
            if (ipv6Address == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancerZoneMapping", "ipv6Address");
            }
            this.ipv6Address = ipv6Address;
            return this;
        }
        @CustomType.Setter
        public Builder privateIpv4Address(String privateIpv4Address) {
            if (privateIpv4Address == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancerZoneMapping", "privateIpv4Address");
            }
            this.privateIpv4Address = privateIpv4Address;
            return this;
        }
        @CustomType.Setter
        public Builder publicIpv4Address(String publicIpv4Address) {
            if (publicIpv4Address == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancerZoneMapping", "publicIpv4Address");
            }
            this.publicIpv4Address = publicIpv4Address;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            if (vswitchId == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancerZoneMapping", "vswitchId");
            }
            this.vswitchId = vswitchId;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancerZoneMapping", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetLoadBalancersBalancerZoneMapping build() {
            final var _resultValue = new GetLoadBalancersBalancerZoneMapping();
            _resultValue.allocationId = allocationId;
            _resultValue.eniId = eniId;
            _resultValue.ipv6Address = ipv6Address;
            _resultValue.privateIpv4Address = privateIpv4Address;
            _resultValue.publicIpv4Address = publicIpv4Address;
            _resultValue.vswitchId = vswitchId;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
