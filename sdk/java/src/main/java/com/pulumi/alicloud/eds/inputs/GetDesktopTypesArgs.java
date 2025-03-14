// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDesktopTypesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDesktopTypesArgs Empty = new GetDesktopTypesArgs();

    /**
     * The CPU cores.
     * 
     */
    @Import(name="cpuCount")
    private @Nullable Output<Integer> cpuCount;

    /**
     * @return The CPU cores.
     * 
     */
    public Optional<Output<Integer>> cpuCount() {
        return Optional.ofNullable(this.cpuCount);
    }

    /**
     * The GPU cores.
     * 
     */
    @Import(name="gpuCount")
    private @Nullable Output<Double> gpuCount;

    /**
     * @return The GPU cores.
     * 
     */
    public Optional<Output<Double>> gpuCount() {
        return Optional.ofNullable(this.gpuCount);
    }

    /**
     * A list of Desktop Type IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Desktop Type IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The Specification family. Valid values: `eds.graphics`, `eds.hf`, `eds.general`, `ecd.graphics`, `ecd.performance`, `ecd.advanced`, `ecd.basic`.
     * 
     */
    @Import(name="instanceTypeFamily")
    private @Nullable Output<String> instanceTypeFamily;

    /**
     * @return The Specification family. Valid values: `eds.graphics`, `eds.hf`, `eds.general`, `ecd.graphics`, `ecd.performance`, `ecd.advanced`, `ecd.basic`.
     * 
     */
    public Optional<Output<String>> instanceTypeFamily() {
        return Optional.ofNullable(this.instanceTypeFamily);
    }

    /**
     * The Memory size. Unit: MiB.
     * 
     */
    @Import(name="memorySize")
    private @Nullable Output<Integer> memorySize;

    /**
     * @return The Memory size. Unit: MiB.
     * 
     */
    public Optional<Output<Integer>> memorySize() {
        return Optional.ofNullable(this.memorySize);
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
     * The status of the resource. Valid values: `SUFFICIENT`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource. Valid values: `SUFFICIENT`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetDesktopTypesArgs() {}

    private GetDesktopTypesArgs(GetDesktopTypesArgs $) {
        this.cpuCount = $.cpuCount;
        this.gpuCount = $.gpuCount;
        this.ids = $.ids;
        this.instanceTypeFamily = $.instanceTypeFamily;
        this.memorySize = $.memorySize;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDesktopTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDesktopTypesArgs $;

        public Builder() {
            $ = new GetDesktopTypesArgs();
        }

        public Builder(GetDesktopTypesArgs defaults) {
            $ = new GetDesktopTypesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpuCount The CPU cores.
         * 
         * @return builder
         * 
         */
        public Builder cpuCount(@Nullable Output<Integer> cpuCount) {
            $.cpuCount = cpuCount;
            return this;
        }

        /**
         * @param cpuCount The CPU cores.
         * 
         * @return builder
         * 
         */
        public Builder cpuCount(Integer cpuCount) {
            return cpuCount(Output.of(cpuCount));
        }

        /**
         * @param gpuCount The GPU cores.
         * 
         * @return builder
         * 
         */
        public Builder gpuCount(@Nullable Output<Double> gpuCount) {
            $.gpuCount = gpuCount;
            return this;
        }

        /**
         * @param gpuCount The GPU cores.
         * 
         * @return builder
         * 
         */
        public Builder gpuCount(Double gpuCount) {
            return gpuCount(Output.of(gpuCount));
        }

        /**
         * @param ids A list of Desktop Type IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Desktop Type IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Desktop Type IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param instanceTypeFamily The Specification family. Valid values: `eds.graphics`, `eds.hf`, `eds.general`, `ecd.graphics`, `ecd.performance`, `ecd.advanced`, `ecd.basic`.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypeFamily(@Nullable Output<String> instanceTypeFamily) {
            $.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * @param instanceTypeFamily The Specification family. Valid values: `eds.graphics`, `eds.hf`, `eds.general`, `ecd.graphics`, `ecd.performance`, `ecd.advanced`, `ecd.basic`.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            return instanceTypeFamily(Output.of(instanceTypeFamily));
        }

        /**
         * @param memorySize The Memory size. Unit: MiB.
         * 
         * @return builder
         * 
         */
        public Builder memorySize(@Nullable Output<Integer> memorySize) {
            $.memorySize = memorySize;
            return this;
        }

        /**
         * @param memorySize The Memory size. Unit: MiB.
         * 
         * @return builder
         * 
         */
        public Builder memorySize(Integer memorySize) {
            return memorySize(Output.of(memorySize));
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
         * @param status The status of the resource. Valid values: `SUFFICIENT`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource. Valid values: `SUFFICIENT`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetDesktopTypesArgs build() {
            return $;
        }
    }

}
