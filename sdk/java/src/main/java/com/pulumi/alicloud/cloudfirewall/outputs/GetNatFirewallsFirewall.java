// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.outputs;

import com.pulumi.alicloud.cloudfirewall.outputs.GetNatFirewallsFirewallNatRouteEntryList;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNatFirewallsFirewall {
    /**
     * @return Alibaba Cloud account ID
     * 
     */
    private Integer aliUid;
    /**
     * @return The ID of the resource supplied above.
     * 
     */
    private String id;
    /**
     * @return Member Account ID
     * 
     */
    private Integer memberUid;
    /**
     * @return NAT gateway ID
     * 
     */
    private String natGatewayId;
    /**
     * @return NAT Gateway name
     * 
     */
    private String natGatewayName;
    /**
     * @return The list of routes to be switched by the NAT gateway.
     * 
     */
    private List<GetNatFirewallsFirewallNatRouteEntryList> natRouteEntryLists;
    /**
     * @return NAT firewall ID
     * 
     */
    private String proxyId;
    /**
     * @return NAT firewall name
     * 
     */
    private String proxyName;
    /**
     * @return Whether strict mode is enabled1-Enable strict mode0-Disable strict mode
     * 
     */
    private Integer strictMode;
    /**
     * @return The ID of the VPC instance.
     * 
     */
    private String vpcId;

    private GetNatFirewallsFirewall() {}
    /**
     * @return Alibaba Cloud account ID
     * 
     */
    public Integer aliUid() {
        return this.aliUid;
    }
    /**
     * @return The ID of the resource supplied above.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Member Account ID
     * 
     */
    public Integer memberUid() {
        return this.memberUid;
    }
    /**
     * @return NAT gateway ID
     * 
     */
    public String natGatewayId() {
        return this.natGatewayId;
    }
    /**
     * @return NAT Gateway name
     * 
     */
    public String natGatewayName() {
        return this.natGatewayName;
    }
    /**
     * @return The list of routes to be switched by the NAT gateway.
     * 
     */
    public List<GetNatFirewallsFirewallNatRouteEntryList> natRouteEntryLists() {
        return this.natRouteEntryLists;
    }
    /**
     * @return NAT firewall ID
     * 
     */
    public String proxyId() {
        return this.proxyId;
    }
    /**
     * @return NAT firewall name
     * 
     */
    public String proxyName() {
        return this.proxyName;
    }
    /**
     * @return Whether strict mode is enabled1-Enable strict mode0-Disable strict mode
     * 
     */
    public Integer strictMode() {
        return this.strictMode;
    }
    /**
     * @return The ID of the VPC instance.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatFirewallsFirewall defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer aliUid;
        private String id;
        private Integer memberUid;
        private String natGatewayId;
        private String natGatewayName;
        private List<GetNatFirewallsFirewallNatRouteEntryList> natRouteEntryLists;
        private String proxyId;
        private String proxyName;
        private Integer strictMode;
        private String vpcId;
        public Builder() {}
        public Builder(GetNatFirewallsFirewall defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliUid = defaults.aliUid;
    	      this.id = defaults.id;
    	      this.memberUid = defaults.memberUid;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.natGatewayName = defaults.natGatewayName;
    	      this.natRouteEntryLists = defaults.natRouteEntryLists;
    	      this.proxyId = defaults.proxyId;
    	      this.proxyName = defaults.proxyName;
    	      this.strictMode = defaults.strictMode;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder aliUid(Integer aliUid) {
            if (aliUid == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewall", "aliUid");
            }
            this.aliUid = aliUid;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewall", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder memberUid(Integer memberUid) {
            if (memberUid == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewall", "memberUid");
            }
            this.memberUid = memberUid;
            return this;
        }
        @CustomType.Setter
        public Builder natGatewayId(String natGatewayId) {
            if (natGatewayId == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewall", "natGatewayId");
            }
            this.natGatewayId = natGatewayId;
            return this;
        }
        @CustomType.Setter
        public Builder natGatewayName(String natGatewayName) {
            if (natGatewayName == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewall", "natGatewayName");
            }
            this.natGatewayName = natGatewayName;
            return this;
        }
        @CustomType.Setter
        public Builder natRouteEntryLists(List<GetNatFirewallsFirewallNatRouteEntryList> natRouteEntryLists) {
            if (natRouteEntryLists == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewall", "natRouteEntryLists");
            }
            this.natRouteEntryLists = natRouteEntryLists;
            return this;
        }
        public Builder natRouteEntryLists(GetNatFirewallsFirewallNatRouteEntryList... natRouteEntryLists) {
            return natRouteEntryLists(List.of(natRouteEntryLists));
        }
        @CustomType.Setter
        public Builder proxyId(String proxyId) {
            if (proxyId == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewall", "proxyId");
            }
            this.proxyId = proxyId;
            return this;
        }
        @CustomType.Setter
        public Builder proxyName(String proxyName) {
            if (proxyName == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewall", "proxyName");
            }
            this.proxyName = proxyName;
            return this;
        }
        @CustomType.Setter
        public Builder strictMode(Integer strictMode) {
            if (strictMode == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewall", "strictMode");
            }
            this.strictMode = strictMode;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetNatFirewallsFirewall", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        public GetNatFirewallsFirewall build() {
            final var _resultValue = new GetNatFirewallsFirewall();
            _resultValue.aliUid = aliUid;
            _resultValue.id = id;
            _resultValue.memberUid = memberUid;
            _resultValue.natGatewayId = natGatewayId;
            _resultValue.natGatewayName = natGatewayName;
            _resultValue.natRouteEntryLists = natRouteEntryLists;
            _resultValue.proxyId = proxyId;
            _resultValue.proxyName = proxyName;
            _resultValue.strictMode = strictMode;
            _resultValue.vpcId = vpcId;
            return _resultValue;
        }
    }
}
