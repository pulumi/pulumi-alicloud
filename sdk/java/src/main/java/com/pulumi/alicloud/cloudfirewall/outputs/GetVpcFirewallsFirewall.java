// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.outputs;

import com.pulumi.alicloud.cloudfirewall.outputs.GetVpcFirewallsFirewallLocalVpc;
import com.pulumi.alicloud.cloudfirewall.outputs.GetVpcFirewallsFirewallPeerVpc;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVpcFirewallsFirewall {
    /**
     * @return Bandwidth specifications for high-speed channels. Unit: Mbps.
     * 
     */
    private Integer bandwidth;
    /**
     * @return The communication type of the VPC firewall. Valid value: **expressconnect**, which indicates Express Connect.
     * 
     */
    private String connectType;
    /**
     * @return The name of the VPC firewall instance and the value same as `vpc_firewall_id`.
     * 
     */
    private String id;
    /**
     * @return The details of the local VPC.
     * 
     */
    private List<GetVpcFirewallsFirewallLocalVpc> localVpcs;
    /**
     * @return The details of the peer VPC.
     * 
     */
    private List<GetVpcFirewallsFirewallPeerVpc> peerVpcs;
    /**
     * @return The region is open. Value:-**enable**: is enabled, indicating that VPC firewall can be configured in this region.-**disable**: indicates that VPC firewall cannot be configured in this region.
     * 
     */
    private String regionStatus;
    /**
     * @return The status of the resource
     * 
     */
    private String status;
    /**
     * @return The ID of the VPC firewall instance.
     * 
     */
    private String vpcFirewallId;
    /**
     * @return The name of the VPC firewall instance.
     * 
     */
    private String vpcFirewallName;

    private GetVpcFirewallsFirewall() {}
    /**
     * @return Bandwidth specifications for high-speed channels. Unit: Mbps.
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return The communication type of the VPC firewall. Valid value: **expressconnect**, which indicates Express Connect.
     * 
     */
    public String connectType() {
        return this.connectType;
    }
    /**
     * @return The name of the VPC firewall instance and the value same as `vpc_firewall_id`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The details of the local VPC.
     * 
     */
    public List<GetVpcFirewallsFirewallLocalVpc> localVpcs() {
        return this.localVpcs;
    }
    /**
     * @return The details of the peer VPC.
     * 
     */
    public List<GetVpcFirewallsFirewallPeerVpc> peerVpcs() {
        return this.peerVpcs;
    }
    /**
     * @return The region is open. Value:-**enable**: is enabled, indicating that VPC firewall can be configured in this region.-**disable**: indicates that VPC firewall cannot be configured in this region.
     * 
     */
    public String regionStatus() {
        return this.regionStatus;
    }
    /**
     * @return The status of the resource
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the VPC firewall instance.
     * 
     */
    public String vpcFirewallId() {
        return this.vpcFirewallId;
    }
    /**
     * @return The name of the VPC firewall instance.
     * 
     */
    public String vpcFirewallName() {
        return this.vpcFirewallName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcFirewallsFirewall defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer bandwidth;
        private String connectType;
        private String id;
        private List<GetVpcFirewallsFirewallLocalVpc> localVpcs;
        private List<GetVpcFirewallsFirewallPeerVpc> peerVpcs;
        private String regionStatus;
        private String status;
        private String vpcFirewallId;
        private String vpcFirewallName;
        public Builder() {}
        public Builder(GetVpcFirewallsFirewall defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.connectType = defaults.connectType;
    	      this.id = defaults.id;
    	      this.localVpcs = defaults.localVpcs;
    	      this.peerVpcs = defaults.peerVpcs;
    	      this.regionStatus = defaults.regionStatus;
    	      this.status = defaults.status;
    	      this.vpcFirewallId = defaults.vpcFirewallId;
    	      this.vpcFirewallName = defaults.vpcFirewallName;
        }

        @CustomType.Setter
        public Builder bandwidth(Integer bandwidth) {
            if (bandwidth == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallsFirewall", "bandwidth");
            }
            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder connectType(String connectType) {
            if (connectType == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallsFirewall", "connectType");
            }
            this.connectType = connectType;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallsFirewall", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder localVpcs(List<GetVpcFirewallsFirewallLocalVpc> localVpcs) {
            if (localVpcs == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallsFirewall", "localVpcs");
            }
            this.localVpcs = localVpcs;
            return this;
        }
        public Builder localVpcs(GetVpcFirewallsFirewallLocalVpc... localVpcs) {
            return localVpcs(List.of(localVpcs));
        }
        @CustomType.Setter
        public Builder peerVpcs(List<GetVpcFirewallsFirewallPeerVpc> peerVpcs) {
            if (peerVpcs == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallsFirewall", "peerVpcs");
            }
            this.peerVpcs = peerVpcs;
            return this;
        }
        public Builder peerVpcs(GetVpcFirewallsFirewallPeerVpc... peerVpcs) {
            return peerVpcs(List.of(peerVpcs));
        }
        @CustomType.Setter
        public Builder regionStatus(String regionStatus) {
            if (regionStatus == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallsFirewall", "regionStatus");
            }
            this.regionStatus = regionStatus;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallsFirewall", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder vpcFirewallId(String vpcFirewallId) {
            if (vpcFirewallId == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallsFirewall", "vpcFirewallId");
            }
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }
        @CustomType.Setter
        public Builder vpcFirewallName(String vpcFirewallName) {
            if (vpcFirewallName == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallsFirewall", "vpcFirewallName");
            }
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }
        public GetVpcFirewallsFirewall build() {
            final var _resultValue = new GetVpcFirewallsFirewall();
            _resultValue.bandwidth = bandwidth;
            _resultValue.connectType = connectType;
            _resultValue.id = id;
            _resultValue.localVpcs = localVpcs;
            _resultValue.peerVpcs = peerVpcs;
            _resultValue.regionStatus = regionStatus;
            _resultValue.status = status;
            _resultValue.vpcFirewallId = vpcFirewallId;
            _resultValue.vpcFirewallName = vpcFirewallName;
            return _resultValue;
        }
    }
}