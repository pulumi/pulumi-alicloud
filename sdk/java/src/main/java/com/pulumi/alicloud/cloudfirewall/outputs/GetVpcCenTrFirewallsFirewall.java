// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.outputs;

import com.pulumi.alicloud.cloudfirewall.outputs.GetVpcCenTrFirewallsFirewallIpsConfig;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpcCenTrFirewallsFirewall {
    /**
     * @return The ID of the CEN instance.
     * 
     */
    private String cenId;
    /**
     * @return The name of the CEN instance.
     * 
     */
    private String cenName;
    /**
     * @return Firewall ID
     * 
     */
    private String firewallId;
    /**
     * @return The name of Cloud Firewall.
     * 
     */
    private String firewallName;
    /**
     * @return The status of the VPC boundary firewall. Value:-**opened**: opened-**closed**: closed-**notconfigured**: indicates that the VPC boundary firewall has not been configured yet.-**configured**: indicates that the VPC boundary firewall has been configured.-**creating**: indicates that a VPC boundary firewall is being created.-**opening**: indicates that the VPC border firewall is being enabled.-**deleting**: indicates that the VPC boundary firewall is being deleted.&gt; If this parameter is not set, the VPC boundary firewall in all states is queried.
     * 
     */
    private String firewallSwitchStatus;
    /**
     * @return The ID of the resource supplied above.
     * 
     */
    private String id;
    /**
     * @return IPS configuration information.
     * 
     */
    private GetVpcCenTrFirewallsFirewallIpsConfig ipsConfig;
    /**
     * @return Whether the wall can be opened automatically. Value:-**passed**: can automatically open the wall-**failed**: The wall cannot be opened automatically-**unknown**: unknown status
     * 
     */
    private String precheckStatus;
    /**
     * @return The region ID of the transit router instance.
     * 
     */
    private String regionNo;
    /**
     * @return Geographically open. Value:-**enable**: enabled, indicating that the VPC border firewall can be configured for the region.-**disable**: Not enabled, indicating that the VPC boundary firewall is not allowed for the region.
     * 
     */
    private String regionStatus;
    /**
     * @return The operation result code of creating the VPC boundary firewall. Value:-**RegionDisable**: indicates that the region where the network instance is located is not supported by the VPC border firewall. You cannot create a VPC border firewall.-**Empty string**, indicating that the network instance can create a VPC firewall.
     * 
     */
    private String resultCode;
    /**
     * @return The routing pattern. Value: managed: indicates automatic mode
     * 
     */
    private String routeMode;
    /**
     * @return The ID of the transit router instance.
     * 
     */
    private String transitRouterId;

    private GetVpcCenTrFirewallsFirewall() {}
    /**
     * @return The ID of the CEN instance.
     * 
     */
    public String cenId() {
        return this.cenId;
    }
    /**
     * @return The name of the CEN instance.
     * 
     */
    public String cenName() {
        return this.cenName;
    }
    /**
     * @return Firewall ID
     * 
     */
    public String firewallId() {
        return this.firewallId;
    }
    /**
     * @return The name of Cloud Firewall.
     * 
     */
    public String firewallName() {
        return this.firewallName;
    }
    /**
     * @return The status of the VPC boundary firewall. Value:-**opened**: opened-**closed**: closed-**notconfigured**: indicates that the VPC boundary firewall has not been configured yet.-**configured**: indicates that the VPC boundary firewall has been configured.-**creating**: indicates that a VPC boundary firewall is being created.-**opening**: indicates that the VPC border firewall is being enabled.-**deleting**: indicates that the VPC boundary firewall is being deleted.&gt; If this parameter is not set, the VPC boundary firewall in all states is queried.
     * 
     */
    public String firewallSwitchStatus() {
        return this.firewallSwitchStatus;
    }
    /**
     * @return The ID of the resource supplied above.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return IPS configuration information.
     * 
     */
    public GetVpcCenTrFirewallsFirewallIpsConfig ipsConfig() {
        return this.ipsConfig;
    }
    /**
     * @return Whether the wall can be opened automatically. Value:-**passed**: can automatically open the wall-**failed**: The wall cannot be opened automatically-**unknown**: unknown status
     * 
     */
    public String precheckStatus() {
        return this.precheckStatus;
    }
    /**
     * @return The region ID of the transit router instance.
     * 
     */
    public String regionNo() {
        return this.regionNo;
    }
    /**
     * @return Geographically open. Value:-**enable**: enabled, indicating that the VPC border firewall can be configured for the region.-**disable**: Not enabled, indicating that the VPC boundary firewall is not allowed for the region.
     * 
     */
    public String regionStatus() {
        return this.regionStatus;
    }
    /**
     * @return The operation result code of creating the VPC boundary firewall. Value:-**RegionDisable**: indicates that the region where the network instance is located is not supported by the VPC border firewall. You cannot create a VPC border firewall.-**Empty string**, indicating that the network instance can create a VPC firewall.
     * 
     */
    public String resultCode() {
        return this.resultCode;
    }
    /**
     * @return The routing pattern. Value: managed: indicates automatic mode
     * 
     */
    public String routeMode() {
        return this.routeMode;
    }
    /**
     * @return The ID of the transit router instance.
     * 
     */
    public String transitRouterId() {
        return this.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcCenTrFirewallsFirewall defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cenId;
        private String cenName;
        private String firewallId;
        private String firewallName;
        private String firewallSwitchStatus;
        private String id;
        private GetVpcCenTrFirewallsFirewallIpsConfig ipsConfig;
        private String precheckStatus;
        private String regionNo;
        private String regionStatus;
        private String resultCode;
        private String routeMode;
        private String transitRouterId;
        public Builder() {}
        public Builder(GetVpcCenTrFirewallsFirewall defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cenId = defaults.cenId;
    	      this.cenName = defaults.cenName;
    	      this.firewallId = defaults.firewallId;
    	      this.firewallName = defaults.firewallName;
    	      this.firewallSwitchStatus = defaults.firewallSwitchStatus;
    	      this.id = defaults.id;
    	      this.ipsConfig = defaults.ipsConfig;
    	      this.precheckStatus = defaults.precheckStatus;
    	      this.regionNo = defaults.regionNo;
    	      this.regionStatus = defaults.regionStatus;
    	      this.resultCode = defaults.resultCode;
    	      this.routeMode = defaults.routeMode;
    	      this.transitRouterId = defaults.transitRouterId;
        }

        @CustomType.Setter
        public Builder cenId(String cenId) {
            if (cenId == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewall", "cenId");
            }
            this.cenId = cenId;
            return this;
        }
        @CustomType.Setter
        public Builder cenName(String cenName) {
            if (cenName == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewall", "cenName");
            }
            this.cenName = cenName;
            return this;
        }
        @CustomType.Setter
        public Builder firewallId(String firewallId) {
            if (firewallId == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewall", "firewallId");
            }
            this.firewallId = firewallId;
            return this;
        }
        @CustomType.Setter
        public Builder firewallName(String firewallName) {
            if (firewallName == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewall", "firewallName");
            }
            this.firewallName = firewallName;
            return this;
        }
        @CustomType.Setter
        public Builder firewallSwitchStatus(String firewallSwitchStatus) {
            if (firewallSwitchStatus == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewall", "firewallSwitchStatus");
            }
            this.firewallSwitchStatus = firewallSwitchStatus;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewall", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipsConfig(GetVpcCenTrFirewallsFirewallIpsConfig ipsConfig) {
            if (ipsConfig == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewall", "ipsConfig");
            }
            this.ipsConfig = ipsConfig;
            return this;
        }
        @CustomType.Setter
        public Builder precheckStatus(String precheckStatus) {
            if (precheckStatus == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewall", "precheckStatus");
            }
            this.precheckStatus = precheckStatus;
            return this;
        }
        @CustomType.Setter
        public Builder regionNo(String regionNo) {
            if (regionNo == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewall", "regionNo");
            }
            this.regionNo = regionNo;
            return this;
        }
        @CustomType.Setter
        public Builder regionStatus(String regionStatus) {
            if (regionStatus == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewall", "regionStatus");
            }
            this.regionStatus = regionStatus;
            return this;
        }
        @CustomType.Setter
        public Builder resultCode(String resultCode) {
            if (resultCode == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewall", "resultCode");
            }
            this.resultCode = resultCode;
            return this;
        }
        @CustomType.Setter
        public Builder routeMode(String routeMode) {
            if (routeMode == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewall", "routeMode");
            }
            this.routeMode = routeMode;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterId(String transitRouterId) {
            if (transitRouterId == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewall", "transitRouterId");
            }
            this.transitRouterId = transitRouterId;
            return this;
        }
        public GetVpcCenTrFirewallsFirewall build() {
            final var _resultValue = new GetVpcCenTrFirewallsFirewall();
            _resultValue.cenId = cenId;
            _resultValue.cenName = cenName;
            _resultValue.firewallId = firewallId;
            _resultValue.firewallName = firewallName;
            _resultValue.firewallSwitchStatus = firewallSwitchStatus;
            _resultValue.id = id;
            _resultValue.ipsConfig = ipsConfig;
            _resultValue.precheckStatus = precheckStatus;
            _resultValue.regionNo = regionNo;
            _resultValue.regionStatus = regionStatus;
            _resultValue.resultCode = resultCode;
            _resultValue.routeMode = routeMode;
            _resultValue.transitRouterId = transitRouterId;
            return _resultValue;
        }
    }
}
