// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VswitchArgs extends com.pulumi.resources.ResourceArgs {

    public static final VswitchArgs Empty = new VswitchArgs();

    /**
     * The CIDR block of the vSwitch.
     * 
     */
    @Import(name="cidrBlock", required=true)
    private Output<String> cidrBlock;

    /**
     * @return The CIDR block of the vSwitch.
     * 
     */
    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }

    /**
     * The description of the vSwitch.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the vSwitch.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * ENS Region ID.
     * 
     */
    @Import(name="ensRegionId", required=true)
    private Output<String> ensRegionId;

    /**
     * @return ENS Region ID.
     * 
     */
    public Output<String> ensRegionId() {
        return this.ensRegionId;
    }

    /**
     * The ID of the network to which the vSwitch that you want to create belongs.
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return The ID of the network to which the vSwitch that you want to create belongs.
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * The name of the vSwitch.
     * 
     */
    @Import(name="vswitchName")
    private @Nullable Output<String> vswitchName;

    /**
     * @return The name of the vSwitch.
     * 
     */
    public Optional<Output<String>> vswitchName() {
        return Optional.ofNullable(this.vswitchName);
    }

    private VswitchArgs() {}

    private VswitchArgs(VswitchArgs $) {
        this.cidrBlock = $.cidrBlock;
        this.description = $.description;
        this.ensRegionId = $.ensRegionId;
        this.networkId = $.networkId;
        this.vswitchName = $.vswitchName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VswitchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VswitchArgs $;

        public Builder() {
            $ = new VswitchArgs();
        }

        public Builder(VswitchArgs defaults) {
            $ = new VswitchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrBlock The CIDR block of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock The CIDR block of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        /**
         * @param description The description of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ensRegionId ENS Region ID.
         * 
         * @return builder
         * 
         */
        public Builder ensRegionId(Output<String> ensRegionId) {
            $.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * @param ensRegionId ENS Region ID.
         * 
         * @return builder
         * 
         */
        public Builder ensRegionId(String ensRegionId) {
            return ensRegionId(Output.of(ensRegionId));
        }

        /**
         * @param networkId The ID of the network to which the vSwitch that you want to create belongs.
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId The ID of the network to which the vSwitch that you want to create belongs.
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param vswitchName The name of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchName(@Nullable Output<String> vswitchName) {
            $.vswitchName = vswitchName;
            return this;
        }

        /**
         * @param vswitchName The name of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchName(String vswitchName) {
            return vswitchName(Output.of(vswitchName));
        }

        public VswitchArgs build() {
            if ($.cidrBlock == null) {
                throw new MissingRequiredPropertyException("VswitchArgs", "cidrBlock");
            }
            if ($.ensRegionId == null) {
                throw new MissingRequiredPropertyException("VswitchArgs", "ensRegionId");
            }
            return $;
        }
    }

}
