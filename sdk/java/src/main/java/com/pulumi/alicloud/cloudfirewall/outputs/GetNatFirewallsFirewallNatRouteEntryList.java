// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNatFirewallsFirewallNatRouteEntryList {
    /**
     * @return The destination network segment of the default route.
     * 
     */
    private String destinationCidr;
    /**
     * @return The next hop address of the original NAT gateway.
     * 
     */
    private String nexthopId;
    /**
     * @return The network type of the next hop. Value: NatGateway : NAT Gateway.
     * 
     */
    private String nexthopType;
    /**
     * @return The route table where the default route of the NAT gateway is located.
     * 
     */
    private String routeTableId;

    private GetNatFirewallsFirewallNatRouteEntryList() {}
    /**
     * @return The destination network segment of the default route.
     * 
     */
    public String destinationCidr() {
        return this.destinationCidr;
    }
    /**
     * @return The next hop address of the original NAT gateway.
     * 
     */
    public String nexthopId() {
        return this.nexthopId;
    }
    /**
     * @return The network type of the next hop. Value: NatGateway : NAT Gateway.
     * 
     */
    public String nexthopType() {
        return this.nexthopType;
    }
    /**
     * @return The route table where the default route of the NAT gateway is located.
     * 
     */
    public String routeTableId() {
        return this.routeTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatFirewallsFirewallNatRouteEntryList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destinationCidr;
        private String nexthopId;
        private String nexthopType;
        private String routeTableId;
        public Builder() {}
        public Builder(GetNatFirewallsFirewallNatRouteEntryList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationCidr = defaults.destinationCidr;
    	      this.nexthopId = defaults.nexthopId;
    	      this.nexthopType = defaults.nexthopType;
    	      this.routeTableId = defaults.routeTableId;
        }

        @CustomType.Setter
        public Builder destinationCidr(String destinationCidr) {
            if (destinationCidr == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewallNatRouteEntryList", "destinationCidr");
            }
            this.destinationCidr = destinationCidr;
            return this;
        }
        @CustomType.Setter
        public Builder nexthopId(String nexthopId) {
            if (nexthopId == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewallNatRouteEntryList", "nexthopId");
            }
            this.nexthopId = nexthopId;
            return this;
        }
        @CustomType.Setter
        public Builder nexthopType(String nexthopType) {
            if (nexthopType == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewallNatRouteEntryList", "nexthopType");
            }
            this.nexthopType = nexthopType;
            return this;
        }
        @CustomType.Setter
        public Builder routeTableId(String routeTableId) {
            if (routeTableId == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewallNatRouteEntryList", "routeTableId");
            }
            this.routeTableId = routeTableId;
            return this;
        }
        public GetNatFirewallsFirewallNatRouteEntryList build() {
            final var _resultValue = new GetNatFirewallsFirewallNatRouteEntryList();
            _resultValue.destinationCidr = destinationCidr;
            _resultValue.nexthopId = nexthopId;
            _resultValue.nexthopType = nexthopType;
            _resultValue.routeTableId = routeTableId;
            return _resultValue;
        }
    }
}
