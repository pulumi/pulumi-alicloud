// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.inputs;

import com.pulumi.alicloud.cloudfirewall.inputs.FirewallVpcFirewallCenLocalVpcArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallVpcFirewallCenState extends com.pulumi.resources.ResourceArgs {

    public static final FirewallVpcFirewallCenState Empty = new FirewallVpcFirewallCenState();

    /**
     * The ID of the CEN instance.
     * 
     */
    @Import(name="cenId")
    private @Nullable Output<String> cenId;

    /**
     * @return The ID of the CEN instance.
     * 
     */
    public Optional<Output<String>> cenId() {
        return Optional.ofNullable(this.cenId);
    }

    /**
     * Intercommunication type, value: expressconnect: Express Channel cen: Cloud Enterprise Network
     * 
     */
    @Import(name="connectType")
    private @Nullable Output<String> connectType;

    /**
     * @return Intercommunication type, value: expressconnect: Express Channel cen: Cloud Enterprise Network
     * 
     */
    public Optional<Output<String>> connectType() {
        return Optional.ofNullable(this.connectType);
    }

    /**
     * The language type of the requested and received messages. Valid values:
     * 
     */
    @Import(name="lang")
    private @Nullable Output<String> lang;

    /**
     * @return The language type of the requested and received messages. Valid values:
     * 
     */
    public Optional<Output<String>> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * The details of the VPC. See `local_vpc` below.
     * 
     */
    @Import(name="localVpc")
    private @Nullable Output<FirewallVpcFirewallCenLocalVpcArgs> localVpc;

    /**
     * @return The details of the VPC. See `local_vpc` below.
     * 
     */
    public Optional<Output<FirewallVpcFirewallCenLocalVpcArgs>> localVpc() {
        return Optional.ofNullable(this.localVpc);
    }

    /**
     * The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
     * 
     */
    @Import(name="memberUid")
    private @Nullable Output<String> memberUid;

    /**
     * @return The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
     * 
     */
    public Optional<Output<String>> memberUid() {
        return Optional.ofNullable(this.memberUid);
    }

    /**
     * Firewall switch status.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Firewall switch status.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * VPC firewall ID
     * 
     */
    @Import(name="vpcFirewallId")
    private @Nullable Output<String> vpcFirewallId;

    /**
     * @return VPC firewall ID
     * 
     */
    public Optional<Output<String>> vpcFirewallId() {
        return Optional.ofNullable(this.vpcFirewallId);
    }

    /**
     * The name of the VPC firewall instance.
     * 
     */
    @Import(name="vpcFirewallName")
    private @Nullable Output<String> vpcFirewallName;

    /**
     * @return The name of the VPC firewall instance.
     * 
     */
    public Optional<Output<String>> vpcFirewallName() {
        return Optional.ofNullable(this.vpcFirewallName);
    }

    /**
     * The ID of the region to which the VPC is created.
     * 
     */
    @Import(name="vpcRegion")
    private @Nullable Output<String> vpcRegion;

    /**
     * @return The ID of the region to which the VPC is created.
     * 
     */
    public Optional<Output<String>> vpcRegion() {
        return Optional.ofNullable(this.vpcRegion);
    }

    private FirewallVpcFirewallCenState() {}

    private FirewallVpcFirewallCenState(FirewallVpcFirewallCenState $) {
        this.cenId = $.cenId;
        this.connectType = $.connectType;
        this.lang = $.lang;
        this.localVpc = $.localVpc;
        this.memberUid = $.memberUid;
        this.status = $.status;
        this.vpcFirewallId = $.vpcFirewallId;
        this.vpcFirewallName = $.vpcFirewallName;
        this.vpcRegion = $.vpcRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallVpcFirewallCenState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallVpcFirewallCenState $;

        public Builder() {
            $ = new FirewallVpcFirewallCenState();
        }

        public Builder(FirewallVpcFirewallCenState defaults) {
            $ = new FirewallVpcFirewallCenState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cenId The ID of the CEN instance.
         * 
         * @return builder
         * 
         */
        public Builder cenId(@Nullable Output<String> cenId) {
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
         * @param connectType Intercommunication type, value: expressconnect: Express Channel cen: Cloud Enterprise Network
         * 
         * @return builder
         * 
         */
        public Builder connectType(@Nullable Output<String> connectType) {
            $.connectType = connectType;
            return this;
        }

        /**
         * @param connectType Intercommunication type, value: expressconnect: Express Channel cen: Cloud Enterprise Network
         * 
         * @return builder
         * 
         */
        public Builder connectType(String connectType) {
            return connectType(Output.of(connectType));
        }

        /**
         * @param lang The language type of the requested and received messages. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable Output<String> lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param lang The language type of the requested and received messages. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder lang(String lang) {
            return lang(Output.of(lang));
        }

        /**
         * @param localVpc The details of the VPC. See `local_vpc` below.
         * 
         * @return builder
         * 
         */
        public Builder localVpc(@Nullable Output<FirewallVpcFirewallCenLocalVpcArgs> localVpc) {
            $.localVpc = localVpc;
            return this;
        }

        /**
         * @param localVpc The details of the VPC. See `local_vpc` below.
         * 
         * @return builder
         * 
         */
        public Builder localVpc(FirewallVpcFirewallCenLocalVpcArgs localVpc) {
            return localVpc(Output.of(localVpc));
        }

        /**
         * @param memberUid The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
         * 
         * @return builder
         * 
         */
        public Builder memberUid(@Nullable Output<String> memberUid) {
            $.memberUid = memberUid;
            return this;
        }

        /**
         * @param memberUid The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
         * 
         * @return builder
         * 
         */
        public Builder memberUid(String memberUid) {
            return memberUid(Output.of(memberUid));
        }

        /**
         * @param status Firewall switch status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Firewall switch status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vpcFirewallId VPC firewall ID
         * 
         * @return builder
         * 
         */
        public Builder vpcFirewallId(@Nullable Output<String> vpcFirewallId) {
            $.vpcFirewallId = vpcFirewallId;
            return this;
        }

        /**
         * @param vpcFirewallId VPC firewall ID
         * 
         * @return builder
         * 
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            return vpcFirewallId(Output.of(vpcFirewallId));
        }

        /**
         * @param vpcFirewallName The name of the VPC firewall instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcFirewallName(@Nullable Output<String> vpcFirewallName) {
            $.vpcFirewallName = vpcFirewallName;
            return this;
        }

        /**
         * @param vpcFirewallName The name of the VPC firewall instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcFirewallName(String vpcFirewallName) {
            return vpcFirewallName(Output.of(vpcFirewallName));
        }

        /**
         * @param vpcRegion The ID of the region to which the VPC is created.
         * 
         * @return builder
         * 
         */
        public Builder vpcRegion(@Nullable Output<String> vpcRegion) {
            $.vpcRegion = vpcRegion;
            return this;
        }

        /**
         * @param vpcRegion The ID of the region to which the VPC is created.
         * 
         * @return builder
         * 
         */
        public Builder vpcRegion(String vpcRegion) {
            return vpcRegion(Output.of(vpcRegion));
        }

        public FirewallVpcFirewallCenState build() {
            return $;
        }
    }

}