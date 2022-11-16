// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BandwidthPackageAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final BandwidthPackageAttachmentState Empty = new BandwidthPackageAttachmentState();

    /**
     * The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
     * 
     */
    @Import(name="acceleratorId")
    private @Nullable Output<String> acceleratorId;

    /**
     * @return The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
     * 
     */
    public Optional<Output<String>> acceleratorId() {
        return Optional.ofNullable(this.acceleratorId);
    }

    /**
     * Accelerators bound with current Bandwidth Package.
     * 
     */
    @Import(name="accelerators")
    private @Nullable Output<List<String>> accelerators;

    /**
     * @return Accelerators bound with current Bandwidth Package.
     * 
     */
    public Optional<Output<List<String>>> accelerators() {
        return Optional.ofNullable(this.accelerators);
    }

    /**
     * The ID of the bandwidth plan to disassociate.
     * 
     */
    @Import(name="bandwidthPackageId")
    private @Nullable Output<String> bandwidthPackageId;

    /**
     * @return The ID of the bandwidth plan to disassociate.
     * 
     */
    public Optional<Output<String>> bandwidthPackageId() {
        return Optional.ofNullable(this.bandwidthPackageId);
    }

    /**
     * State of Bandwidth Package.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return State of Bandwidth Package.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private BandwidthPackageAttachmentState() {}

    private BandwidthPackageAttachmentState(BandwidthPackageAttachmentState $) {
        this.acceleratorId = $.acceleratorId;
        this.accelerators = $.accelerators;
        this.bandwidthPackageId = $.bandwidthPackageId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BandwidthPackageAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BandwidthPackageAttachmentState $;

        public Builder() {
            $ = new BandwidthPackageAttachmentState();
        }

        public Builder(BandwidthPackageAttachmentState defaults) {
            $ = new BandwidthPackageAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorId The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(@Nullable Output<String> acceleratorId) {
            $.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * @param acceleratorId The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(String acceleratorId) {
            return acceleratorId(Output.of(acceleratorId));
        }

        /**
         * @param accelerators Accelerators bound with current Bandwidth Package.
         * 
         * @return builder
         * 
         */
        public Builder accelerators(@Nullable Output<List<String>> accelerators) {
            $.accelerators = accelerators;
            return this;
        }

        /**
         * @param accelerators Accelerators bound with current Bandwidth Package.
         * 
         * @return builder
         * 
         */
        public Builder accelerators(List<String> accelerators) {
            return accelerators(Output.of(accelerators));
        }

        /**
         * @param accelerators Accelerators bound with current Bandwidth Package.
         * 
         * @return builder
         * 
         */
        public Builder accelerators(String... accelerators) {
            return accelerators(List.of(accelerators));
        }

        /**
         * @param bandwidthPackageId The ID of the bandwidth plan to disassociate.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageId(@Nullable Output<String> bandwidthPackageId) {
            $.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * @param bandwidthPackageId The ID of the bandwidth plan to disassociate.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            return bandwidthPackageId(Output.of(bandwidthPackageId));
        }

        /**
         * @param status State of Bandwidth Package.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status State of Bandwidth Package.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public BandwidthPackageAttachmentState build() {
            return $;
        }
    }

}