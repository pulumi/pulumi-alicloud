// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.inputs;

import com.pulumi.alicloud.cloudfirewall.inputs.FirewallVpcFirewallCenLocalVpcEniListArgs;
import com.pulumi.alicloud.cloudfirewall.inputs.FirewallVpcFirewallCenLocalVpcVpcCidrTableListArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallVpcFirewallCenLocalVpcArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallVpcFirewallCenLocalVpcArgs Empty = new FirewallVpcFirewallCenLocalVpcArgs();

    /**
     * The connection ID of the network instance.
     * 
     */
    @Import(name="attachmentId")
    private @Nullable Output<String> attachmentId;

    /**
     * @return The connection ID of the network instance.
     * 
     */
    public Optional<Output<String>> attachmentId() {
        return Optional.ofNullable(this.attachmentId);
    }

    /**
     * The connection name of the network instance.
     * 
     */
    @Import(name="attachmentName")
    private @Nullable Output<String> attachmentName;

    /**
     * @return The connection name of the network instance.
     * 
     */
    public Optional<Output<String>> attachmentName() {
        return Optional.ofNullable(this.attachmentName);
    }

    /**
     * The list of network segments protected by the VPC firewall.
     * 
     */
    @Import(name="defendCidrLists")
    private @Nullable Output<List<String>> defendCidrLists;

    /**
     * @return The list of network segments protected by the VPC firewall.
     * 
     */
    public Optional<Output<List<String>>> defendCidrLists() {
        return Optional.ofNullable(this.defendCidrLists);
    }

    /**
     * List of elastic network cards.
     * 
     */
    @Import(name="eniLists")
    private @Nullable Output<List<FirewallVpcFirewallCenLocalVpcEniListArgs>> eniLists;

    /**
     * @return List of elastic network cards.
     * 
     */
    public Optional<Output<List<FirewallVpcFirewallCenLocalVpcEniListArgs>>> eniLists() {
        return Optional.ofNullable(this.eniLists);
    }

    /**
     * The ID of the vSwitch specified when the routing mode is manual mode.
     * 
     */
    @Import(name="manualVswitchId")
    private @Nullable Output<String> manualVswitchId;

    /**
     * @return The ID of the vSwitch specified when the routing mode is manual mode.
     * 
     */
    public Optional<Output<String>> manualVswitchId() {
        return Optional.ofNullable(this.manualVswitchId);
    }

    /**
     * The ID of the VPC instance that created the VPC firewall.
     * 
     */
    @Import(name="networkInstanceId", required=true)
    private Output<String> networkInstanceId;

    /**
     * @return The ID of the VPC instance that created the VPC firewall.
     * 
     */
    public Output<String> networkInstanceId() {
        return this.networkInstanceId;
    }

    /**
     * The name of the network instance.
     * 
     */
    @Import(name="networkInstanceName")
    private @Nullable Output<String> networkInstanceName;

    /**
     * @return The name of the network instance.
     * 
     */
    public Optional<Output<String>> networkInstanceName() {
        return Optional.ofNullable(this.networkInstanceName);
    }

    /**
     * The type of the network instance. Value: **VPC * *.
     * 
     */
    @Import(name="networkInstanceType")
    private @Nullable Output<String> networkInstanceType;

    /**
     * @return The type of the network instance. Value: **VPC * *.
     * 
     */
    public Optional<Output<String>> networkInstanceType() {
        return Optional.ofNullable(this.networkInstanceType);
    }

    /**
     * The UID of the Alibaba Cloud account to which the VPC belongs.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    /**
     * @return The UID of the Alibaba Cloud account to which the VPC belongs.
     * 
     */
    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * The region ID of the VPC.
     * 
     */
    @Import(name="regionNo")
    private @Nullable Output<String> regionNo;

    /**
     * @return The region ID of the VPC.
     * 
     */
    public Optional<Output<String>> regionNo() {
        return Optional.ofNullable(this.regionNo);
    }

    /**
     * Routing mode,. Value:-auto: indicates automatic mode.-manual: indicates manual mode.
     * 
     */
    @Import(name="routeMode")
    private @Nullable Output<String> routeMode;

    /**
     * @return Routing mode,. Value:-auto: indicates automatic mode.-manual: indicates manual mode.
     * 
     */
    public Optional<Output<String>> routeMode() {
        return Optional.ofNullable(this.routeMode);
    }

    /**
     * Whether routing mode supports manual mode. Value:-**1**: Supported.-**0**: Not supported.
     * 
     */
    @Import(name="supportManualMode")
    private @Nullable Output<String> supportManualMode;

    /**
     * @return Whether routing mode supports manual mode. Value:-**1**: Supported.-**0**: Not supported.
     * 
     */
    public Optional<Output<String>> supportManualMode() {
        return Optional.ofNullable(this.supportManualMode);
    }

    /**
     * The ID of the CEN-TR instance.
     * 
     */
    @Import(name="transitRouterId")
    private @Nullable Output<String> transitRouterId;

    /**
     * @return The ID of the CEN-TR instance.
     * 
     */
    public Optional<Output<String>> transitRouterId() {
        return Optional.ofNullable(this.transitRouterId);
    }

    /**
     * The version of the cloud enterprise network forwarding router (CEN-TR). Value:-**Basic**: Basic Edition.-**Enterprise**: Enterprise Edition.
     * 
     */
    @Import(name="transitRouterType")
    private @Nullable Output<String> transitRouterType;

    /**
     * @return The version of the cloud enterprise network forwarding router (CEN-TR). Value:-**Basic**: Basic Edition.-**Enterprise**: Enterprise Edition.
     * 
     */
    public Optional<Output<String>> transitRouterType() {
        return Optional.ofNullable(this.transitRouterType);
    }

    /**
     * The VPC network segment list.
     * 
     */
    @Import(name="vpcCidrTableLists")
    private @Nullable Output<List<FirewallVpcFirewallCenLocalVpcVpcCidrTableListArgs>> vpcCidrTableLists;

    /**
     * @return The VPC network segment list.
     * 
     */
    public Optional<Output<List<FirewallVpcFirewallCenLocalVpcVpcCidrTableListArgs>>> vpcCidrTableLists() {
        return Optional.ofNullable(this.vpcCidrTableLists);
    }

    /**
     * The ID of the VPC instance.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the VPC instance.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The instance name of the VPC.
     * 
     */
    @Import(name="vpcName")
    private @Nullable Output<String> vpcName;

    /**
     * @return The instance name of the VPC.
     * 
     */
    public Optional<Output<String>> vpcName() {
        return Optional.ofNullable(this.vpcName);
    }

    private FirewallVpcFirewallCenLocalVpcArgs() {}

    private FirewallVpcFirewallCenLocalVpcArgs(FirewallVpcFirewallCenLocalVpcArgs $) {
        this.attachmentId = $.attachmentId;
        this.attachmentName = $.attachmentName;
        this.defendCidrLists = $.defendCidrLists;
        this.eniLists = $.eniLists;
        this.manualVswitchId = $.manualVswitchId;
        this.networkInstanceId = $.networkInstanceId;
        this.networkInstanceName = $.networkInstanceName;
        this.networkInstanceType = $.networkInstanceType;
        this.ownerId = $.ownerId;
        this.regionNo = $.regionNo;
        this.routeMode = $.routeMode;
        this.supportManualMode = $.supportManualMode;
        this.transitRouterId = $.transitRouterId;
        this.transitRouterType = $.transitRouterType;
        this.vpcCidrTableLists = $.vpcCidrTableLists;
        this.vpcId = $.vpcId;
        this.vpcName = $.vpcName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallVpcFirewallCenLocalVpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallVpcFirewallCenLocalVpcArgs $;

        public Builder() {
            $ = new FirewallVpcFirewallCenLocalVpcArgs();
        }

        public Builder(FirewallVpcFirewallCenLocalVpcArgs defaults) {
            $ = new FirewallVpcFirewallCenLocalVpcArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attachmentId The connection ID of the network instance.
         * 
         * @return builder
         * 
         */
        public Builder attachmentId(@Nullable Output<String> attachmentId) {
            $.attachmentId = attachmentId;
            return this;
        }

        /**
         * @param attachmentId The connection ID of the network instance.
         * 
         * @return builder
         * 
         */
        public Builder attachmentId(String attachmentId) {
            return attachmentId(Output.of(attachmentId));
        }

        /**
         * @param attachmentName The connection name of the network instance.
         * 
         * @return builder
         * 
         */
        public Builder attachmentName(@Nullable Output<String> attachmentName) {
            $.attachmentName = attachmentName;
            return this;
        }

        /**
         * @param attachmentName The connection name of the network instance.
         * 
         * @return builder
         * 
         */
        public Builder attachmentName(String attachmentName) {
            return attachmentName(Output.of(attachmentName));
        }

        /**
         * @param defendCidrLists The list of network segments protected by the VPC firewall.
         * 
         * @return builder
         * 
         */
        public Builder defendCidrLists(@Nullable Output<List<String>> defendCidrLists) {
            $.defendCidrLists = defendCidrLists;
            return this;
        }

        /**
         * @param defendCidrLists The list of network segments protected by the VPC firewall.
         * 
         * @return builder
         * 
         */
        public Builder defendCidrLists(List<String> defendCidrLists) {
            return defendCidrLists(Output.of(defendCidrLists));
        }

        /**
         * @param defendCidrLists The list of network segments protected by the VPC firewall.
         * 
         * @return builder
         * 
         */
        public Builder defendCidrLists(String... defendCidrLists) {
            return defendCidrLists(List.of(defendCidrLists));
        }

        /**
         * @param eniLists List of elastic network cards.
         * 
         * @return builder
         * 
         */
        public Builder eniLists(@Nullable Output<List<FirewallVpcFirewallCenLocalVpcEniListArgs>> eniLists) {
            $.eniLists = eniLists;
            return this;
        }

        /**
         * @param eniLists List of elastic network cards.
         * 
         * @return builder
         * 
         */
        public Builder eniLists(List<FirewallVpcFirewallCenLocalVpcEniListArgs> eniLists) {
            return eniLists(Output.of(eniLists));
        }

        /**
         * @param eniLists List of elastic network cards.
         * 
         * @return builder
         * 
         */
        public Builder eniLists(FirewallVpcFirewallCenLocalVpcEniListArgs... eniLists) {
            return eniLists(List.of(eniLists));
        }

        /**
         * @param manualVswitchId The ID of the vSwitch specified when the routing mode is manual mode.
         * 
         * @return builder
         * 
         */
        public Builder manualVswitchId(@Nullable Output<String> manualVswitchId) {
            $.manualVswitchId = manualVswitchId;
            return this;
        }

        /**
         * @param manualVswitchId The ID of the vSwitch specified when the routing mode is manual mode.
         * 
         * @return builder
         * 
         */
        public Builder manualVswitchId(String manualVswitchId) {
            return manualVswitchId(Output.of(manualVswitchId));
        }

        /**
         * @param networkInstanceId The ID of the VPC instance that created the VPC firewall.
         * 
         * @return builder
         * 
         */
        public Builder networkInstanceId(Output<String> networkInstanceId) {
            $.networkInstanceId = networkInstanceId;
            return this;
        }

        /**
         * @param networkInstanceId The ID of the VPC instance that created the VPC firewall.
         * 
         * @return builder
         * 
         */
        public Builder networkInstanceId(String networkInstanceId) {
            return networkInstanceId(Output.of(networkInstanceId));
        }

        /**
         * @param networkInstanceName The name of the network instance.
         * 
         * @return builder
         * 
         */
        public Builder networkInstanceName(@Nullable Output<String> networkInstanceName) {
            $.networkInstanceName = networkInstanceName;
            return this;
        }

        /**
         * @param networkInstanceName The name of the network instance.
         * 
         * @return builder
         * 
         */
        public Builder networkInstanceName(String networkInstanceName) {
            return networkInstanceName(Output.of(networkInstanceName));
        }

        /**
         * @param networkInstanceType The type of the network instance. Value: **VPC * *.
         * 
         * @return builder
         * 
         */
        public Builder networkInstanceType(@Nullable Output<String> networkInstanceType) {
            $.networkInstanceType = networkInstanceType;
            return this;
        }

        /**
         * @param networkInstanceType The type of the network instance. Value: **VPC * *.
         * 
         * @return builder
         * 
         */
        public Builder networkInstanceType(String networkInstanceType) {
            return networkInstanceType(Output.of(networkInstanceType));
        }

        /**
         * @param ownerId The UID of the Alibaba Cloud account to which the VPC belongs.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        /**
         * @param ownerId The UID of the Alibaba Cloud account to which the VPC belongs.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        /**
         * @param regionNo The region ID of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder regionNo(@Nullable Output<String> regionNo) {
            $.regionNo = regionNo;
            return this;
        }

        /**
         * @param regionNo The region ID of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder regionNo(String regionNo) {
            return regionNo(Output.of(regionNo));
        }

        /**
         * @param routeMode Routing mode,. Value:-auto: indicates automatic mode.-manual: indicates manual mode.
         * 
         * @return builder
         * 
         */
        public Builder routeMode(@Nullable Output<String> routeMode) {
            $.routeMode = routeMode;
            return this;
        }

        /**
         * @param routeMode Routing mode,. Value:-auto: indicates automatic mode.-manual: indicates manual mode.
         * 
         * @return builder
         * 
         */
        public Builder routeMode(String routeMode) {
            return routeMode(Output.of(routeMode));
        }

        /**
         * @param supportManualMode Whether routing mode supports manual mode. Value:-**1**: Supported.-**0**: Not supported.
         * 
         * @return builder
         * 
         */
        public Builder supportManualMode(@Nullable Output<String> supportManualMode) {
            $.supportManualMode = supportManualMode;
            return this;
        }

        /**
         * @param supportManualMode Whether routing mode supports manual mode. Value:-**1**: Supported.-**0**: Not supported.
         * 
         * @return builder
         * 
         */
        public Builder supportManualMode(String supportManualMode) {
            return supportManualMode(Output.of(supportManualMode));
        }

        /**
         * @param transitRouterId The ID of the CEN-TR instance.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(@Nullable Output<String> transitRouterId) {
            $.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * @param transitRouterId The ID of the CEN-TR instance.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(String transitRouterId) {
            return transitRouterId(Output.of(transitRouterId));
        }

        /**
         * @param transitRouterType The version of the cloud enterprise network forwarding router (CEN-TR). Value:-**Basic**: Basic Edition.-**Enterprise**: Enterprise Edition.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterType(@Nullable Output<String> transitRouterType) {
            $.transitRouterType = transitRouterType;
            return this;
        }

        /**
         * @param transitRouterType The version of the cloud enterprise network forwarding router (CEN-TR). Value:-**Basic**: Basic Edition.-**Enterprise**: Enterprise Edition.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterType(String transitRouterType) {
            return transitRouterType(Output.of(transitRouterType));
        }

        /**
         * @param vpcCidrTableLists The VPC network segment list.
         * 
         * @return builder
         * 
         */
        public Builder vpcCidrTableLists(@Nullable Output<List<FirewallVpcFirewallCenLocalVpcVpcCidrTableListArgs>> vpcCidrTableLists) {
            $.vpcCidrTableLists = vpcCidrTableLists;
            return this;
        }

        /**
         * @param vpcCidrTableLists The VPC network segment list.
         * 
         * @return builder
         * 
         */
        public Builder vpcCidrTableLists(List<FirewallVpcFirewallCenLocalVpcVpcCidrTableListArgs> vpcCidrTableLists) {
            return vpcCidrTableLists(Output.of(vpcCidrTableLists));
        }

        /**
         * @param vpcCidrTableLists The VPC network segment list.
         * 
         * @return builder
         * 
         */
        public Builder vpcCidrTableLists(FirewallVpcFirewallCenLocalVpcVpcCidrTableListArgs... vpcCidrTableLists) {
            return vpcCidrTableLists(List.of(vpcCidrTableLists));
        }

        /**
         * @param vpcId The ID of the VPC instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vpcName The instance name of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcName(@Nullable Output<String> vpcName) {
            $.vpcName = vpcName;
            return this;
        }

        /**
         * @param vpcName The instance name of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcName(String vpcName) {
            return vpcName(Output.of(vpcName));
        }

        public FirewallVpcFirewallCenLocalVpcArgs build() {
            if ($.networkInstanceId == null) {
                throw new MissingRequiredPropertyException("FirewallVpcFirewallCenLocalVpcArgs", "networkInstanceId");
            }
            return $;
        }
    }

}