// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BasicIpSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BasicIpSetArgs Empty = new BasicIpSetArgs();

    /**
     * The ID of the acceleration region.
     * 
     */
    @Import(name="accelerateRegionId", required=true)
    private Output<String> accelerateRegionId;

    /**
     * @return The ID of the acceleration region.
     * 
     */
    public Output<String> accelerateRegionId() {
        return this.accelerateRegionId;
    }

    /**
     * The ID of the basic GA instance.
     * 
     */
    @Import(name="acceleratorId", required=true)
    private Output<String> acceleratorId;

    /**
     * @return The ID of the basic GA instance.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }

    /**
     * The bandwidth of the acceleration region. Unit: Mbit/s.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<Integer> bandwidth;

    /**
     * @return The bandwidth of the acceleration region. Unit: Mbit/s.
     * 
     */
    public Optional<Output<Integer>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * The line type of the elastic IP address (EIP) in the acceleration region. Default value: `BGP`. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`.
     * 
     */
    @Import(name="ispType")
    private @Nullable Output<String> ispType;

    /**
     * @return The line type of the elastic IP address (EIP) in the acceleration region. Default value: `BGP`. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`.
     * 
     */
    public Optional<Output<String>> ispType() {
        return Optional.ofNullable(this.ispType);
    }

    private BasicIpSetArgs() {}

    private BasicIpSetArgs(BasicIpSetArgs $) {
        this.accelerateRegionId = $.accelerateRegionId;
        this.acceleratorId = $.acceleratorId;
        this.bandwidth = $.bandwidth;
        this.ispType = $.ispType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicIpSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicIpSetArgs $;

        public Builder() {
            $ = new BasicIpSetArgs();
        }

        public Builder(BasicIpSetArgs defaults) {
            $ = new BasicIpSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accelerateRegionId The ID of the acceleration region.
         * 
         * @return builder
         * 
         */
        public Builder accelerateRegionId(Output<String> accelerateRegionId) {
            $.accelerateRegionId = accelerateRegionId;
            return this;
        }

        /**
         * @param accelerateRegionId The ID of the acceleration region.
         * 
         * @return builder
         * 
         */
        public Builder accelerateRegionId(String accelerateRegionId) {
            return accelerateRegionId(Output.of(accelerateRegionId));
        }

        /**
         * @param acceleratorId The ID of the basic GA instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(Output<String> acceleratorId) {
            $.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * @param acceleratorId The ID of the basic GA instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(String acceleratorId) {
            return acceleratorId(Output.of(acceleratorId));
        }

        /**
         * @param bandwidth The bandwidth of the acceleration region. Unit: Mbit/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The bandwidth of the acceleration region. Unit: Mbit/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param ispType The line type of the elastic IP address (EIP) in the acceleration region. Default value: `BGP`. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`.
         * 
         * @return builder
         * 
         */
        public Builder ispType(@Nullable Output<String> ispType) {
            $.ispType = ispType;
            return this;
        }

        /**
         * @param ispType The line type of the elastic IP address (EIP) in the acceleration region. Default value: `BGP`. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`.
         * 
         * @return builder
         * 
         */
        public Builder ispType(String ispType) {
            return ispType(Output.of(ispType));
        }

        public BasicIpSetArgs build() {
            if ($.accelerateRegionId == null) {
                throw new MissingRequiredPropertyException("BasicIpSetArgs", "accelerateRegionId");
            }
            if ($.acceleratorId == null) {
                throw new MissingRequiredPropertyException("BasicIpSetArgs", "acceleratorId");
            }
            return $;
        }
    }

}