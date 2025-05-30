// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcCenTrFirewallArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcCenTrFirewallArgs Empty = new VpcCenTrFirewallArgs();

    /**
     * The ID of the CEN instance.
     * 
     */
    @Import(name="cenId", required=true)
    private Output<String> cenId;

    /**
     * @return The ID of the CEN instance.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }

    /**
     * Firewall description.
     * 
     */
    @Import(name="firewallDescription")
    private @Nullable Output<String> firewallDescription;

    /**
     * @return Firewall description.
     * 
     */
    public Optional<Output<String>> firewallDescription() {
        return Optional.ofNullable(this.firewallDescription);
    }

    /**
     * The name of Cloud Firewall.
     * 
     */
    @Import(name="firewallName", required=true)
    private Output<String> firewallName;

    /**
     * @return The name of Cloud Firewall.
     * 
     */
    public Output<String> firewallName() {
        return this.firewallName;
    }

    /**
     * Required in automatic mode, the CIDR of subnet used to store the firewall ENI in the firewall VPC.
     * 
     */
    @Import(name="firewallSubnetCidr", required=true)
    private Output<String> firewallSubnetCidr;

    /**
     * @return Required in automatic mode, the CIDR of subnet used to store the firewall ENI in the firewall VPC.
     * 
     */
    public Output<String> firewallSubnetCidr() {
        return this.firewallSubnetCidr;
    }

    /**
     * Required in automatic mode,  th CIDR of firewall VPC.
     * 
     */
    @Import(name="firewallVpcCidr", required=true)
    private Output<String> firewallVpcCidr;

    /**
     * @return Required in automatic mode,  th CIDR of firewall VPC.
     * 
     */
    public Output<String> firewallVpcCidr() {
        return this.firewallVpcCidr;
    }

    /**
     * The region ID of the transit router instance.
     * 
     */
    @Import(name="regionNo", required=true)
    private Output<String> regionNo;

    /**
     * @return The region ID of the transit router instance.
     * 
     */
    public Output<String> regionNo() {
        return this.regionNo;
    }

    /**
     * The routing pattern. Value: managed: indicates automatic mode
     * 
     */
    @Import(name="routeMode", required=true)
    private Output<String> routeMode;

    /**
     * @return The routing pattern. Value: managed: indicates automatic mode
     * 
     */
    public Output<String> routeMode() {
        return this.routeMode;
    }

    /**
     * Required in automatic mode, the primary CIDR of network used to connect to the TR in the firewall VPC.
     * 
     */
    @Import(name="trAttachmentMasterCidr", required=true)
    private Output<String> trAttachmentMasterCidr;

    /**
     * @return Required in automatic mode, the primary CIDR of network used to connect to the TR in the firewall VPC.
     * 
     */
    public Output<String> trAttachmentMasterCidr() {
        return this.trAttachmentMasterCidr;
    }

    /**
     * The primary zone of the switch.
     * 
     */
    @Import(name="trAttachmentMasterZone")
    private @Nullable Output<String> trAttachmentMasterZone;

    /**
     * @return The primary zone of the switch.
     * 
     */
    public Optional<Output<String>> trAttachmentMasterZone() {
        return Optional.ofNullable(this.trAttachmentMasterZone);
    }

    /**
     * Required in automatic mode, the the secondary CIDR of the subnet in the firewall VPC used to connect to TR.
     * 
     */
    @Import(name="trAttachmentSlaveCidr", required=true)
    private Output<String> trAttachmentSlaveCidr;

    /**
     * @return Required in automatic mode, the the secondary CIDR of the subnet in the firewall VPC used to connect to TR.
     * 
     */
    public Output<String> trAttachmentSlaveCidr() {
        return this.trAttachmentSlaveCidr;
    }

    /**
     * Switch standby area.
     * 
     */
    @Import(name="trAttachmentSlaveZone")
    private @Nullable Output<String> trAttachmentSlaveZone;

    /**
     * @return Switch standby area.
     * 
     */
    public Optional<Output<String>> trAttachmentSlaveZone() {
        return Optional.ofNullable(this.trAttachmentSlaveZone);
    }

    /**
     * The ID of the transit router instance.
     * 
     */
    @Import(name="transitRouterId", required=true)
    private Output<String> transitRouterId;

    /**
     * @return The ID of the transit router instance.
     * 
     */
    public Output<String> transitRouterId() {
        return this.transitRouterId;
    }

    private VpcCenTrFirewallArgs() {}

    private VpcCenTrFirewallArgs(VpcCenTrFirewallArgs $) {
        this.cenId = $.cenId;
        this.firewallDescription = $.firewallDescription;
        this.firewallName = $.firewallName;
        this.firewallSubnetCidr = $.firewallSubnetCidr;
        this.firewallVpcCidr = $.firewallVpcCidr;
        this.regionNo = $.regionNo;
        this.routeMode = $.routeMode;
        this.trAttachmentMasterCidr = $.trAttachmentMasterCidr;
        this.trAttachmentMasterZone = $.trAttachmentMasterZone;
        this.trAttachmentSlaveCidr = $.trAttachmentSlaveCidr;
        this.trAttachmentSlaveZone = $.trAttachmentSlaveZone;
        this.transitRouterId = $.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcCenTrFirewallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcCenTrFirewallArgs $;

        public Builder() {
            $ = new VpcCenTrFirewallArgs();
        }

        public Builder(VpcCenTrFirewallArgs defaults) {
            $ = new VpcCenTrFirewallArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cenId The ID of the CEN instance.
         * 
         * @return builder
         * 
         */
        public Builder cenId(Output<String> cenId) {
            $.cenId = cenId;
            return this;
        }

        /**
         * @param cenId The ID of the CEN instance.
         * 
         * @return builder
         * 
         */
        public Builder cenId(String cenId) {
            return cenId(Output.of(cenId));
        }

        /**
         * @param firewallDescription Firewall description.
         * 
         * @return builder
         * 
         */
        public Builder firewallDescription(@Nullable Output<String> firewallDescription) {
            $.firewallDescription = firewallDescription;
            return this;
        }

        /**
         * @param firewallDescription Firewall description.
         * 
         * @return builder
         * 
         */
        public Builder firewallDescription(String firewallDescription) {
            return firewallDescription(Output.of(firewallDescription));
        }

        /**
         * @param firewallName The name of Cloud Firewall.
         * 
         * @return builder
         * 
         */
        public Builder firewallName(Output<String> firewallName) {
            $.firewallName = firewallName;
            return this;
        }

        /**
         * @param firewallName The name of Cloud Firewall.
         * 
         * @return builder
         * 
         */
        public Builder firewallName(String firewallName) {
            return firewallName(Output.of(firewallName));
        }

        /**
         * @param firewallSubnetCidr Required in automatic mode, the CIDR of subnet used to store the firewall ENI in the firewall VPC.
         * 
         * @return builder
         * 
         */
        public Builder firewallSubnetCidr(Output<String> firewallSubnetCidr) {
            $.firewallSubnetCidr = firewallSubnetCidr;
            return this;
        }

        /**
         * @param firewallSubnetCidr Required in automatic mode, the CIDR of subnet used to store the firewall ENI in the firewall VPC.
         * 
         * @return builder
         * 
         */
        public Builder firewallSubnetCidr(String firewallSubnetCidr) {
            return firewallSubnetCidr(Output.of(firewallSubnetCidr));
        }

        /**
         * @param firewallVpcCidr Required in automatic mode,  th CIDR of firewall VPC.
         * 
         * @return builder
         * 
         */
        public Builder firewallVpcCidr(Output<String> firewallVpcCidr) {
            $.firewallVpcCidr = firewallVpcCidr;
            return this;
        }

        /**
         * @param firewallVpcCidr Required in automatic mode,  th CIDR of firewall VPC.
         * 
         * @return builder
         * 
         */
        public Builder firewallVpcCidr(String firewallVpcCidr) {
            return firewallVpcCidr(Output.of(firewallVpcCidr));
        }

        /**
         * @param regionNo The region ID of the transit router instance.
         * 
         * @return builder
         * 
         */
        public Builder regionNo(Output<String> regionNo) {
            $.regionNo = regionNo;
            return this;
        }

        /**
         * @param regionNo The region ID of the transit router instance.
         * 
         * @return builder
         * 
         */
        public Builder regionNo(String regionNo) {
            return regionNo(Output.of(regionNo));
        }

        /**
         * @param routeMode The routing pattern. Value: managed: indicates automatic mode
         * 
         * @return builder
         * 
         */
        public Builder routeMode(Output<String> routeMode) {
            $.routeMode = routeMode;
            return this;
        }

        /**
         * @param routeMode The routing pattern. Value: managed: indicates automatic mode
         * 
         * @return builder
         * 
         */
        public Builder routeMode(String routeMode) {
            return routeMode(Output.of(routeMode));
        }

        /**
         * @param trAttachmentMasterCidr Required in automatic mode, the primary CIDR of network used to connect to the TR in the firewall VPC.
         * 
         * @return builder
         * 
         */
        public Builder trAttachmentMasterCidr(Output<String> trAttachmentMasterCidr) {
            $.trAttachmentMasterCidr = trAttachmentMasterCidr;
            return this;
        }

        /**
         * @param trAttachmentMasterCidr Required in automatic mode, the primary CIDR of network used to connect to the TR in the firewall VPC.
         * 
         * @return builder
         * 
         */
        public Builder trAttachmentMasterCidr(String trAttachmentMasterCidr) {
            return trAttachmentMasterCidr(Output.of(trAttachmentMasterCidr));
        }

        /**
         * @param trAttachmentMasterZone The primary zone of the switch.
         * 
         * @return builder
         * 
         */
        public Builder trAttachmentMasterZone(@Nullable Output<String> trAttachmentMasterZone) {
            $.trAttachmentMasterZone = trAttachmentMasterZone;
            return this;
        }

        /**
         * @param trAttachmentMasterZone The primary zone of the switch.
         * 
         * @return builder
         * 
         */
        public Builder trAttachmentMasterZone(String trAttachmentMasterZone) {
            return trAttachmentMasterZone(Output.of(trAttachmentMasterZone));
        }

        /**
         * @param trAttachmentSlaveCidr Required in automatic mode, the the secondary CIDR of the subnet in the firewall VPC used to connect to TR.
         * 
         * @return builder
         * 
         */
        public Builder trAttachmentSlaveCidr(Output<String> trAttachmentSlaveCidr) {
            $.trAttachmentSlaveCidr = trAttachmentSlaveCidr;
            return this;
        }

        /**
         * @param trAttachmentSlaveCidr Required in automatic mode, the the secondary CIDR of the subnet in the firewall VPC used to connect to TR.
         * 
         * @return builder
         * 
         */
        public Builder trAttachmentSlaveCidr(String trAttachmentSlaveCidr) {
            return trAttachmentSlaveCidr(Output.of(trAttachmentSlaveCidr));
        }

        /**
         * @param trAttachmentSlaveZone Switch standby area.
         * 
         * @return builder
         * 
         */
        public Builder trAttachmentSlaveZone(@Nullable Output<String> trAttachmentSlaveZone) {
            $.trAttachmentSlaveZone = trAttachmentSlaveZone;
            return this;
        }

        /**
         * @param trAttachmentSlaveZone Switch standby area.
         * 
         * @return builder
         * 
         */
        public Builder trAttachmentSlaveZone(String trAttachmentSlaveZone) {
            return trAttachmentSlaveZone(Output.of(trAttachmentSlaveZone));
        }

        /**
         * @param transitRouterId The ID of the transit router instance.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(Output<String> transitRouterId) {
            $.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * @param transitRouterId The ID of the transit router instance.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(String transitRouterId) {
            return transitRouterId(Output.of(transitRouterId));
        }

        public VpcCenTrFirewallArgs build() {
            if ($.cenId == null) {
                throw new MissingRequiredPropertyException("VpcCenTrFirewallArgs", "cenId");
            }
            if ($.firewallName == null) {
                throw new MissingRequiredPropertyException("VpcCenTrFirewallArgs", "firewallName");
            }
            if ($.firewallSubnetCidr == null) {
                throw new MissingRequiredPropertyException("VpcCenTrFirewallArgs", "firewallSubnetCidr");
            }
            if ($.firewallVpcCidr == null) {
                throw new MissingRequiredPropertyException("VpcCenTrFirewallArgs", "firewallVpcCidr");
            }
            if ($.regionNo == null) {
                throw new MissingRequiredPropertyException("VpcCenTrFirewallArgs", "regionNo");
            }
            if ($.routeMode == null) {
                throw new MissingRequiredPropertyException("VpcCenTrFirewallArgs", "routeMode");
            }
            if ($.trAttachmentMasterCidr == null) {
                throw new MissingRequiredPropertyException("VpcCenTrFirewallArgs", "trAttachmentMasterCidr");
            }
            if ($.trAttachmentSlaveCidr == null) {
                throw new MissingRequiredPropertyException("VpcCenTrFirewallArgs", "trAttachmentSlaveCidr");
            }
            if ($.transitRouterId == null) {
                throw new MissingRequiredPropertyException("VpcCenTrFirewallArgs", "transitRouterId");
            }
            return $;
        }
    }

}
