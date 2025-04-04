// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BasicIpSetState extends com.pulumi.resources.ResourceArgs {

    public static final BasicIpSetState Empty = new BasicIpSetState();

    /**
     * The ID of the acceleration region.
     * 
     */
    @Import(name="accelerateRegionId")
    private @Nullable Output<String> accelerateRegionId;

    /**
     * @return The ID of the acceleration region.
     * 
     */
    public Optional<Output<String>> accelerateRegionId() {
        return Optional.ofNullable(this.accelerateRegionId);
    }

    /**
     * The ID of the basic GA instance.
     * 
     */
    @Import(name="acceleratorId")
    private @Nullable Output<String> acceleratorId;

    /**
     * @return The ID of the basic GA instance.
     * 
     */
    public Optional<Output<String>> acceleratorId() {
        return Optional.ofNullable(this.acceleratorId);
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

    /**
     * The status of the Basic Ip Set instance.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the Basic Ip Set instance.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private BasicIpSetState() {}

    private BasicIpSetState(BasicIpSetState $) {
        this.accelerateRegionId = $.accelerateRegionId;
        this.acceleratorId = $.acceleratorId;
        this.bandwidth = $.bandwidth;
        this.ispType = $.ispType;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicIpSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicIpSetState $;

        public Builder() {
            $ = new BasicIpSetState();
        }

        public Builder(BasicIpSetState defaults) {
            $ = new BasicIpSetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accelerateRegionId The ID of the acceleration region.
         * 
         * @return builder
         * 
         */
        public Builder accelerateRegionId(@Nullable Output<String> accelerateRegionId) {
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
        public Builder acceleratorId(@Nullable Output<String> acceleratorId) {
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

        /**
         * @param status The status of the Basic Ip Set instance.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the Basic Ip Set instance.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public BasicIpSetState build() {
            return $;
        }
    }

}
