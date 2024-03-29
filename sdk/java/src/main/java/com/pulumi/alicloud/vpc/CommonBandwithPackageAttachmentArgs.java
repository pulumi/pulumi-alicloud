// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CommonBandwithPackageAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final CommonBandwithPackageAttachmentArgs Empty = new CommonBandwithPackageAttachmentArgs();

    /**
     * The maximum bandwidth for the EIP. This value cannot be larger than the maximum bandwidth of the EIP bandwidth plan. Unit: Mbit/s.
     * 
     */
    @Import(name="bandwidthPackageBandwidth")
    private @Nullable Output<String> bandwidthPackageBandwidth;

    /**
     * @return The maximum bandwidth for the EIP. This value cannot be larger than the maximum bandwidth of the EIP bandwidth plan. Unit: Mbit/s.
     * 
     */
    public Optional<Output<String>> bandwidthPackageBandwidth() {
        return Optional.ofNullable(this.bandwidthPackageBandwidth);
    }

    /**
     * The bandwidth_package_id of the common bandwidth package attachment, the field can&#39;t be changed.
     * 
     */
    @Import(name="bandwidthPackageId", required=true)
    private Output<String> bandwidthPackageId;

    /**
     * @return The bandwidth_package_id of the common bandwidth package attachment, the field can&#39;t be changed.
     * 
     */
    public Output<String> bandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * Whether to cancel the maximum bandwidth configuration for the EIP. Default: false.
     * 
     */
    @Import(name="cancelCommonBandwidthPackageIpBandwidth")
    private @Nullable Output<Boolean> cancelCommonBandwidthPackageIpBandwidth;

    /**
     * @return Whether to cancel the maximum bandwidth configuration for the EIP. Default: false.
     * 
     */
    public Optional<Output<Boolean>> cancelCommonBandwidthPackageIpBandwidth() {
        return Optional.ofNullable(this.cancelCommonBandwidthPackageIpBandwidth);
    }

    /**
     * The instance_id of the common bandwidth package attachment, the field can&#39;t be changed.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The instance_id of the common bandwidth package attachment, the field can&#39;t be changed.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * IP type. Set the value to **EIP**, which indicates that the EIP is added to the Internet shared bandwidth.
     * 
     */
    @Import(name="ipType")
    private @Nullable Output<String> ipType;

    /**
     * @return IP type. Set the value to **EIP**, which indicates that the EIP is added to the Internet shared bandwidth.
     * 
     */
    public Optional<Output<String>> ipType() {
        return Optional.ofNullable(this.ipType);
    }

    private CommonBandwithPackageAttachmentArgs() {}

    private CommonBandwithPackageAttachmentArgs(CommonBandwithPackageAttachmentArgs $) {
        this.bandwidthPackageBandwidth = $.bandwidthPackageBandwidth;
        this.bandwidthPackageId = $.bandwidthPackageId;
        this.cancelCommonBandwidthPackageIpBandwidth = $.cancelCommonBandwidthPackageIpBandwidth;
        this.instanceId = $.instanceId;
        this.ipType = $.ipType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CommonBandwithPackageAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CommonBandwithPackageAttachmentArgs $;

        public Builder() {
            $ = new CommonBandwithPackageAttachmentArgs();
        }

        public Builder(CommonBandwithPackageAttachmentArgs defaults) {
            $ = new CommonBandwithPackageAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidthPackageBandwidth The maximum bandwidth for the EIP. This value cannot be larger than the maximum bandwidth of the EIP bandwidth plan. Unit: Mbit/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageBandwidth(@Nullable Output<String> bandwidthPackageBandwidth) {
            $.bandwidthPackageBandwidth = bandwidthPackageBandwidth;
            return this;
        }

        /**
         * @param bandwidthPackageBandwidth The maximum bandwidth for the EIP. This value cannot be larger than the maximum bandwidth of the EIP bandwidth plan. Unit: Mbit/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageBandwidth(String bandwidthPackageBandwidth) {
            return bandwidthPackageBandwidth(Output.of(bandwidthPackageBandwidth));
        }

        /**
         * @param bandwidthPackageId The bandwidth_package_id of the common bandwidth package attachment, the field can&#39;t be changed.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageId(Output<String> bandwidthPackageId) {
            $.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * @param bandwidthPackageId The bandwidth_package_id of the common bandwidth package attachment, the field can&#39;t be changed.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            return bandwidthPackageId(Output.of(bandwidthPackageId));
        }

        /**
         * @param cancelCommonBandwidthPackageIpBandwidth Whether to cancel the maximum bandwidth configuration for the EIP. Default: false.
         * 
         * @return builder
         * 
         */
        public Builder cancelCommonBandwidthPackageIpBandwidth(@Nullable Output<Boolean> cancelCommonBandwidthPackageIpBandwidth) {
            $.cancelCommonBandwidthPackageIpBandwidth = cancelCommonBandwidthPackageIpBandwidth;
            return this;
        }

        /**
         * @param cancelCommonBandwidthPackageIpBandwidth Whether to cancel the maximum bandwidth configuration for the EIP. Default: false.
         * 
         * @return builder
         * 
         */
        public Builder cancelCommonBandwidthPackageIpBandwidth(Boolean cancelCommonBandwidthPackageIpBandwidth) {
            return cancelCommonBandwidthPackageIpBandwidth(Output.of(cancelCommonBandwidthPackageIpBandwidth));
        }

        /**
         * @param instanceId The instance_id of the common bandwidth package attachment, the field can&#39;t be changed.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The instance_id of the common bandwidth package attachment, the field can&#39;t be changed.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param ipType IP type. Set the value to **EIP**, which indicates that the EIP is added to the Internet shared bandwidth.
         * 
         * @return builder
         * 
         */
        public Builder ipType(@Nullable Output<String> ipType) {
            $.ipType = ipType;
            return this;
        }

        /**
         * @param ipType IP type. Set the value to **EIP**, which indicates that the EIP is added to the Internet shared bandwidth.
         * 
         * @return builder
         * 
         */
        public Builder ipType(String ipType) {
            return ipType(Output.of(ipType));
        }

        public CommonBandwithPackageAttachmentArgs build() {
            if ($.bandwidthPackageId == null) {
                throw new MissingRequiredPropertyException("CommonBandwithPackageAttachmentArgs", "bandwidthPackageId");
            }
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("CommonBandwithPackageAttachmentArgs", "instanceId");
            }
            return $;
        }
    }

}
