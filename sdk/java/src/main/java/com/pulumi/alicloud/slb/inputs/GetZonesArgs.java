// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetZonesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZonesArgs Empty = new GetZonesArgs();

    /**
     * Filter the results by a slb instance address version. Can be either `ipv4`, or `ipv6`.
     * 
     */
    @Import(name="availableSlbAddressIpVersion")
    private @Nullable Output<String> availableSlbAddressIpVersion;

    /**
     * @return Filter the results by a slb instance address version. Can be either `ipv4`, or `ipv6`.
     * 
     */
    public Optional<Output<String>> availableSlbAddressIpVersion() {
        return Optional.ofNullable(this.availableSlbAddressIpVersion);
    }

    /**
     * Filter the results by a slb instance network type. Valid values:
     * * vpc: an internal SLB instance that is deployed in a virtual private cloud (VPC).
     * * classic_internet: a public-facing SLB instance.
     * * classic_intranet: an internal SLB instance that is deployed in a classic network.
     * 
     */
    @Import(name="availableSlbAddressType")
    private @Nullable Output<String> availableSlbAddressType;

    /**
     * @return Filter the results by a slb instance network type. Valid values:
     * * vpc: an internal SLB instance that is deployed in a virtual private cloud (VPC).
     * * classic_internet: a public-facing SLB instance.
     * * classic_intranet: an internal SLB instance that is deployed in a classic network.
     * 
     */
    public Optional<Output<String>> availableSlbAddressType() {
        return Optional.ofNullable(this.availableSlbAddressType);
    }

    /**
     * Default to false and only output `id` in the `zones` block. Set it to true can output more details.
     * 
     * @deprecated
     * The parameter enable_details has been deprecated from version v1.154.0+
     * 
     */
    @Deprecated /* The parameter enable_details has been deprecated from version v1.154.0+ */
    @Import(name="enableDetails")
    private @Nullable Output<Boolean> enableDetails;

    /**
     * @return Default to false and only output `id` in the `zones` block. Set it to true can output more details.
     * 
     * @deprecated
     * The parameter enable_details has been deprecated from version v1.154.0+
     * 
     */
    @Deprecated /* The parameter enable_details has been deprecated from version v1.154.0+ */
    public Optional<Output<Boolean>> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * The primary zone.
     * 
     */
    @Import(name="masterZoneId")
    private @Nullable Output<String> masterZoneId;

    /**
     * @return The primary zone.
     * 
     */
    public Optional<Output<String>> masterZoneId() {
        return Optional.ofNullable(this.masterZoneId);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The secondary zone.
     * 
     */
    @Import(name="slaveZoneId")
    private @Nullable Output<String> slaveZoneId;

    /**
     * @return The secondary zone.
     * 
     */
    public Optional<Output<String>> slaveZoneId() {
        return Optional.ofNullable(this.slaveZoneId);
    }

    private GetZonesArgs() {}

    private GetZonesArgs(GetZonesArgs $) {
        this.availableSlbAddressIpVersion = $.availableSlbAddressIpVersion;
        this.availableSlbAddressType = $.availableSlbAddressType;
        this.enableDetails = $.enableDetails;
        this.masterZoneId = $.masterZoneId;
        this.outputFile = $.outputFile;
        this.slaveZoneId = $.slaveZoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZonesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZonesArgs $;

        public Builder() {
            $ = new GetZonesArgs();
        }

        public Builder(GetZonesArgs defaults) {
            $ = new GetZonesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availableSlbAddressIpVersion Filter the results by a slb instance address version. Can be either `ipv4`, or `ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder availableSlbAddressIpVersion(@Nullable Output<String> availableSlbAddressIpVersion) {
            $.availableSlbAddressIpVersion = availableSlbAddressIpVersion;
            return this;
        }

        /**
         * @param availableSlbAddressIpVersion Filter the results by a slb instance address version. Can be either `ipv4`, or `ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder availableSlbAddressIpVersion(String availableSlbAddressIpVersion) {
            return availableSlbAddressIpVersion(Output.of(availableSlbAddressIpVersion));
        }

        /**
         * @param availableSlbAddressType Filter the results by a slb instance network type. Valid values:
         * * vpc: an internal SLB instance that is deployed in a virtual private cloud (VPC).
         * * classic_internet: a public-facing SLB instance.
         * * classic_intranet: an internal SLB instance that is deployed in a classic network.
         * 
         * @return builder
         * 
         */
        public Builder availableSlbAddressType(@Nullable Output<String> availableSlbAddressType) {
            $.availableSlbAddressType = availableSlbAddressType;
            return this;
        }

        /**
         * @param availableSlbAddressType Filter the results by a slb instance network type. Valid values:
         * * vpc: an internal SLB instance that is deployed in a virtual private cloud (VPC).
         * * classic_internet: a public-facing SLB instance.
         * * classic_intranet: an internal SLB instance that is deployed in a classic network.
         * 
         * @return builder
         * 
         */
        public Builder availableSlbAddressType(String availableSlbAddressType) {
            return availableSlbAddressType(Output.of(availableSlbAddressType));
        }

        /**
         * @param enableDetails Default to false and only output `id` in the `zones` block. Set it to true can output more details.
         * 
         * @return builder
         * 
         * @deprecated
         * The parameter enable_details has been deprecated from version v1.154.0+
         * 
         */
        @Deprecated /* The parameter enable_details has been deprecated from version v1.154.0+ */
        public Builder enableDetails(@Nullable Output<Boolean> enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param enableDetails Default to false and only output `id` in the `zones` block. Set it to true can output more details.
         * 
         * @return builder
         * 
         * @deprecated
         * The parameter enable_details has been deprecated from version v1.154.0+
         * 
         */
        @Deprecated /* The parameter enable_details has been deprecated from version v1.154.0+ */
        public Builder enableDetails(Boolean enableDetails) {
            return enableDetails(Output.of(enableDetails));
        }

        /**
         * @param masterZoneId The primary zone.
         * 
         * @return builder
         * 
         */
        public Builder masterZoneId(@Nullable Output<String> masterZoneId) {
            $.masterZoneId = masterZoneId;
            return this;
        }

        /**
         * @param masterZoneId The primary zone.
         * 
         * @return builder
         * 
         */
        public Builder masterZoneId(String masterZoneId) {
            return masterZoneId(Output.of(masterZoneId));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param slaveZoneId The secondary zone.
         * 
         * @return builder
         * 
         */
        public Builder slaveZoneId(@Nullable Output<String> slaveZoneId) {
            $.slaveZoneId = slaveZoneId;
            return this;
        }

        /**
         * @param slaveZoneId The secondary zone.
         * 
         * @return builder
         * 
         */
        public Builder slaveZoneId(String slaveZoneId) {
            return slaveZoneId(Output.of(slaveZoneId));
        }

        public GetZonesArgs build() {
            return $;
        }
    }

}