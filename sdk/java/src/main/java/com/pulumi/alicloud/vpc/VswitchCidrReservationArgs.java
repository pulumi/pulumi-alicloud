// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VswitchCidrReservationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VswitchCidrReservationArgs Empty = new VswitchCidrReservationArgs();

    /**
     * Reserved network segment CIdrBlock.
     * 
     */
    @Import(name="cidrReservationCidr")
    private @Nullable Output<String> cidrReservationCidr;

    /**
     * @return Reserved network segment CIdrBlock.
     * 
     */
    public Optional<Output<String>> cidrReservationCidr() {
        return Optional.ofNullable(this.cidrReservationCidr);
    }

    /**
     * The description of the reserved CIDR block.
     * 
     */
    @Import(name="cidrReservationDescription")
    private @Nullable Output<String> cidrReservationDescription;

    /**
     * @return The description of the reserved CIDR block.
     * 
     */
    public Optional<Output<String>> cidrReservationDescription() {
        return Optional.ofNullable(this.cidrReservationDescription);
    }

    /**
     * Reserved segment mask.
     * 
     */
    @Import(name="cidrReservationMask")
    private @Nullable Output<String> cidrReservationMask;

    /**
     * @return Reserved segment mask.
     * 
     */
    public Optional<Output<String>> cidrReservationMask() {
        return Optional.ofNullable(this.cidrReservationMask);
    }

    /**
     * Reserved CIDR Block Type.Valid values: `Prefix`. Default value: Prefix.
     * 
     */
    @Import(name="cidrReservationType")
    private @Nullable Output<String> cidrReservationType;

    /**
     * @return Reserved CIDR Block Type.Valid values: `Prefix`. Default value: Prefix.
     * 
     */
    public Optional<Output<String>> cidrReservationType() {
        return Optional.ofNullable(this.cidrReservationType);
    }

    /**
     * Reserved ip version of network segment, valid values: `IPv4`, `IPv6`, default IPv4.
     * 
     */
    @Import(name="ipVersion")
    private @Nullable Output<String> ipVersion;

    /**
     * @return Reserved ip version of network segment, valid values: `IPv4`, `IPv6`, default IPv4.
     * 
     */
    public Optional<Output<String>> ipVersion() {
        return Optional.ofNullable(this.ipVersion);
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="vswitchCidrReservationName")
    private @Nullable Output<String> vswitchCidrReservationName;

    /**
     * @return The name of the resource.
     * 
     */
    public Optional<Output<String>> vswitchCidrReservationName() {
        return Optional.ofNullable(this.vswitchCidrReservationName);
    }

    /**
     * The Id of the switch instance.
     * 
     */
    @Import(name="vswitchId", required=true)
    private Output<String> vswitchId;

    /**
     * @return The Id of the switch instance.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    private VswitchCidrReservationArgs() {}

    private VswitchCidrReservationArgs(VswitchCidrReservationArgs $) {
        this.cidrReservationCidr = $.cidrReservationCidr;
        this.cidrReservationDescription = $.cidrReservationDescription;
        this.cidrReservationMask = $.cidrReservationMask;
        this.cidrReservationType = $.cidrReservationType;
        this.ipVersion = $.ipVersion;
        this.vswitchCidrReservationName = $.vswitchCidrReservationName;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VswitchCidrReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VswitchCidrReservationArgs $;

        public Builder() {
            $ = new VswitchCidrReservationArgs();
        }

        public Builder(VswitchCidrReservationArgs defaults) {
            $ = new VswitchCidrReservationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrReservationCidr Reserved network segment CIdrBlock.
         * 
         * @return builder
         * 
         */
        public Builder cidrReservationCidr(@Nullable Output<String> cidrReservationCidr) {
            $.cidrReservationCidr = cidrReservationCidr;
            return this;
        }

        /**
         * @param cidrReservationCidr Reserved network segment CIdrBlock.
         * 
         * @return builder
         * 
         */
        public Builder cidrReservationCidr(String cidrReservationCidr) {
            return cidrReservationCidr(Output.of(cidrReservationCidr));
        }

        /**
         * @param cidrReservationDescription The description of the reserved CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder cidrReservationDescription(@Nullable Output<String> cidrReservationDescription) {
            $.cidrReservationDescription = cidrReservationDescription;
            return this;
        }

        /**
         * @param cidrReservationDescription The description of the reserved CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder cidrReservationDescription(String cidrReservationDescription) {
            return cidrReservationDescription(Output.of(cidrReservationDescription));
        }

        /**
         * @param cidrReservationMask Reserved segment mask.
         * 
         * @return builder
         * 
         */
        public Builder cidrReservationMask(@Nullable Output<String> cidrReservationMask) {
            $.cidrReservationMask = cidrReservationMask;
            return this;
        }

        /**
         * @param cidrReservationMask Reserved segment mask.
         * 
         * @return builder
         * 
         */
        public Builder cidrReservationMask(String cidrReservationMask) {
            return cidrReservationMask(Output.of(cidrReservationMask));
        }

        /**
         * @param cidrReservationType Reserved CIDR Block Type.Valid values: `Prefix`. Default value: Prefix.
         * 
         * @return builder
         * 
         */
        public Builder cidrReservationType(@Nullable Output<String> cidrReservationType) {
            $.cidrReservationType = cidrReservationType;
            return this;
        }

        /**
         * @param cidrReservationType Reserved CIDR Block Type.Valid values: `Prefix`. Default value: Prefix.
         * 
         * @return builder
         * 
         */
        public Builder cidrReservationType(String cidrReservationType) {
            return cidrReservationType(Output.of(cidrReservationType));
        }

        /**
         * @param ipVersion Reserved ip version of network segment, valid values: `IPv4`, `IPv6`, default IPv4.
         * 
         * @return builder
         * 
         */
        public Builder ipVersion(@Nullable Output<String> ipVersion) {
            $.ipVersion = ipVersion;
            return this;
        }

        /**
         * @param ipVersion Reserved ip version of network segment, valid values: `IPv4`, `IPv6`, default IPv4.
         * 
         * @return builder
         * 
         */
        public Builder ipVersion(String ipVersion) {
            return ipVersion(Output.of(ipVersion));
        }

        /**
         * @param vswitchCidrReservationName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder vswitchCidrReservationName(@Nullable Output<String> vswitchCidrReservationName) {
            $.vswitchCidrReservationName = vswitchCidrReservationName;
            return this;
        }

        /**
         * @param vswitchCidrReservationName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder vswitchCidrReservationName(String vswitchCidrReservationName) {
            return vswitchCidrReservationName(Output.of(vswitchCidrReservationName));
        }

        /**
         * @param vswitchId The Id of the switch instance.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The Id of the switch instance.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public VswitchCidrReservationArgs build() {
            if ($.vswitchId == null) {
                throw new MissingRequiredPropertyException("VswitchCidrReservationArgs", "vswitchId");
            }
            return $;
        }
    }

}
