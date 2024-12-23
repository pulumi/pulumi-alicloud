// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerZoneMapping {
    /**
     * @return The ID of the elastic IP address (EIP) that is associated with the Internet-facing NLB instance. You can specify one EIP for each zone. You must add at least two zones. You can add a maximum of 10 zones.
     * 
     */
    private @Nullable String allocationId;
    /**
     * @return The ID of the elastic network interface (ENI).
     * 
     */
    private @Nullable String eniId;
    /**
     * @return The IPv6 address of the NLB instance.
     * 
     */
    private @Nullable String ipv6Address;
    /**
     * @return The private IP address. You must add at least two zones. You can add a maximum of 10 zones.
     * 
     */
    private @Nullable String privateIpv4Address;
    /**
     * @return Public IPv4 address of a network-based server load balancer instance.
     * 
     */
    private @Nullable String publicIpv4Address;
    /**
     * @return Zone Status
     * 
     */
    private @Nullable String status;
    /**
     * @return The vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone of an NLB instance. You must add at least two zones. You can add a maximum of 10 zones.
     * 
     */
    private String vswitchId;
    /**
     * @return The ID of the zone of the NLB instance. You must add at least two zones. You can add a maximum of 10 zones.
     * 
     * You can call the [DescribeZones](https://www.alibabacloud.com/help/en/doc-detail/443890.html) operation to query the most recent zone list.
     * 
     */
    private String zoneId;

    private LoadBalancerZoneMapping() {}
    /**
     * @return The ID of the elastic IP address (EIP) that is associated with the Internet-facing NLB instance. You can specify one EIP for each zone. You must add at least two zones. You can add a maximum of 10 zones.
     * 
     */
    public Optional<String> allocationId() {
        return Optional.ofNullable(this.allocationId);
    }
    /**
     * @return The ID of the elastic network interface (ENI).
     * 
     */
    public Optional<String> eniId() {
        return Optional.ofNullable(this.eniId);
    }
    /**
     * @return The IPv6 address of the NLB instance.
     * 
     */
    public Optional<String> ipv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }
    /**
     * @return The private IP address. You must add at least two zones. You can add a maximum of 10 zones.
     * 
     */
    public Optional<String> privateIpv4Address() {
        return Optional.ofNullable(this.privateIpv4Address);
    }
    /**
     * @return Public IPv4 address of a network-based server load balancer instance.
     * 
     */
    public Optional<String> publicIpv4Address() {
        return Optional.ofNullable(this.publicIpv4Address);
    }
    /**
     * @return Zone Status
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone of an NLB instance. You must add at least two zones. You can add a maximum of 10 zones.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }
    /**
     * @return The ID of the zone of the NLB instance. You must add at least two zones. You can add a maximum of 10 zones.
     * 
     * You can call the [DescribeZones](https://www.alibabacloud.com/help/en/doc-detail/443890.html) operation to query the most recent zone list.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerZoneMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String allocationId;
        private @Nullable String eniId;
        private @Nullable String ipv6Address;
        private @Nullable String privateIpv4Address;
        private @Nullable String publicIpv4Address;
        private @Nullable String status;
        private String vswitchId;
        private String zoneId;
        public Builder() {}
        public Builder(LoadBalancerZoneMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.eniId = defaults.eniId;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.privateIpv4Address = defaults.privateIpv4Address;
    	      this.publicIpv4Address = defaults.publicIpv4Address;
    	      this.status = defaults.status;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder allocationId(@Nullable String allocationId) {

            this.allocationId = allocationId;
            return this;
        }
        @CustomType.Setter
        public Builder eniId(@Nullable String eniId) {

            this.eniId = eniId;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Address(@Nullable String ipv6Address) {

            this.ipv6Address = ipv6Address;
            return this;
        }
        @CustomType.Setter
        public Builder privateIpv4Address(@Nullable String privateIpv4Address) {

            this.privateIpv4Address = privateIpv4Address;
            return this;
        }
        @CustomType.Setter
        public Builder publicIpv4Address(@Nullable String publicIpv4Address) {

            this.publicIpv4Address = publicIpv4Address;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            if (vswitchId == null) {
              throw new MissingRequiredPropertyException("LoadBalancerZoneMapping", "vswitchId");
            }
            this.vswitchId = vswitchId;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("LoadBalancerZoneMapping", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public LoadBalancerZoneMapping build() {
            final var _resultValue = new LoadBalancerZoneMapping();
            _resultValue.allocationId = allocationId;
            _resultValue.eniId = eniId;
            _resultValue.ipv6Address = ipv6Address;
            _resultValue.privateIpv4Address = privateIpv4Address;
            _resultValue.publicIpv4Address = publicIpv4Address;
            _resultValue.status = status;
            _resultValue.vswitchId = vswitchId;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
