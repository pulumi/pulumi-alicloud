// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransitRouterMulticastDomainMembersMember {
    /**
     * @return The IP address of the multicast group to which the multicast member belongs. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
     * 
     */
    private String groupIpAddress;
    /**
     * @return The `key` of the resource supplied above.The value is formulated as `&lt;transit_router_multicast_domain_id&gt;:&lt;group_ip_address&gt;:&lt;network_interface_id&gt;`.
     * 
     */
    private String id;
    /**
     * @return The ID of the ENI.
     * 
     */
    private String networkInterfaceId;
    /**
     * @return The status of the resource
     * 
     */
    private String status;
    /**
     * @return The ID of the multicast domain to which the multicast member belongs.
     * 
     */
    private String transitRouterMulticastDomainId;
    /**
     * @return The VPC to which the ENI of the multicast member belongs. This field is mandatory for VPCs owned by another accounts.
     * 
     */
    private String vpcId;

    private GetTransitRouterMulticastDomainMembersMember() {}
    /**
     * @return The IP address of the multicast group to which the multicast member belongs. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
     * 
     */
    public String groupIpAddress() {
        return this.groupIpAddress;
    }
    /**
     * @return The `key` of the resource supplied above.The value is formulated as `&lt;transit_router_multicast_domain_id&gt;:&lt;group_ip_address&gt;:&lt;network_interface_id&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the ENI.
     * 
     */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * @return The status of the resource
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the multicast domain to which the multicast member belongs.
     * 
     */
    public String transitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }
    /**
     * @return The VPC to which the ENI of the multicast member belongs. This field is mandatory for VPCs owned by another accounts.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRouterMulticastDomainMembersMember defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String groupIpAddress;
        private String id;
        private String networkInterfaceId;
        private String status;
        private String transitRouterMulticastDomainId;
        private String vpcId;
        public Builder() {}
        public Builder(GetTransitRouterMulticastDomainMembersMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIpAddress = defaults.groupIpAddress;
    	      this.id = defaults.id;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.status = defaults.status;
    	      this.transitRouterMulticastDomainId = defaults.transitRouterMulticastDomainId;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder groupIpAddress(String groupIpAddress) {
            if (groupIpAddress == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainMembersMember", "groupIpAddress");
            }
            this.groupIpAddress = groupIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainMembersMember", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceId(String networkInterfaceId) {
            if (networkInterfaceId == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainMembersMember", "networkInterfaceId");
            }
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainMembersMember", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            if (transitRouterMulticastDomainId == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainMembersMember", "transitRouterMulticastDomainId");
            }
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainMembersMember", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        public GetTransitRouterMulticastDomainMembersMember build() {
            final var _resultValue = new GetTransitRouterMulticastDomainMembersMember();
            _resultValue.groupIpAddress = groupIpAddress;
            _resultValue.id = id;
            _resultValue.networkInterfaceId = networkInterfaceId;
            _resultValue.status = status;
            _resultValue.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            _resultValue.vpcId = vpcId;
            return _resultValue;
        }
    }
}
