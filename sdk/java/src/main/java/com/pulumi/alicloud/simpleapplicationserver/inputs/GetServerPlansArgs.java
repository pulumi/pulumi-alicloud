// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.simpleapplicationserver.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerPlansArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerPlansArgs Empty = new GetServerPlansArgs();

    /**
     * The peak bandwidth. Unit: Mbit/s.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<Integer> bandwidth;

    /**
     * @return The peak bandwidth. Unit: Mbit/s.
     * 
     */
    public Optional<Output<Integer>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * The number of CPU cores.
     * 
     */
    @Import(name="core")
    private @Nullable Output<Integer> core;

    /**
     * @return The number of CPU cores.
     * 
     */
    public Optional<Output<Integer>> core() {
        return Optional.ofNullable(this.core);
    }

    /**
     * The size of the enhanced SSD (ESSD). Unit: GB.
     * 
     */
    @Import(name="diskSize")
    private @Nullable Output<Integer> diskSize;

    /**
     * @return The size of the enhanced SSD (ESSD). Unit: GB.
     * 
     */
    public Optional<Output<Integer>> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }

    /**
     * The monthly data transfer quota. Unit: GB.
     * 
     */
    @Import(name="flow")
    private @Nullable Output<Integer> flow;

    /**
     * @return The monthly data transfer quota. Unit: GB.
     * 
     */
    public Optional<Output<Integer>> flow() {
        return Optional.ofNullable(this.flow);
    }

    /**
     * A list of Instance Plan IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Instance Plan IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The memory size. Unit: GB.
     * 
     */
    @Import(name="memory")
    private @Nullable Output<Integer> memory;

    /**
     * @return The memory size. Unit: GB.
     * 
     */
    public Optional<Output<Integer>> memory() {
        return Optional.ofNullable(this.memory);
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
     * The platform of Plan supported. Valid values: [&#34;Linux&#34;, &#34;Windows&#34;].
     * 
     */
    @Import(name="platform")
    private @Nullable Output<String> platform;

    /**
     * @return The platform of Plan supported. Valid values: [&#34;Linux&#34;, &#34;Windows&#34;].
     * 
     */
    public Optional<Output<String>> platform() {
        return Optional.ofNullable(this.platform);
    }

    private GetServerPlansArgs() {}

    private GetServerPlansArgs(GetServerPlansArgs $) {
        this.bandwidth = $.bandwidth;
        this.core = $.core;
        this.diskSize = $.diskSize;
        this.flow = $.flow;
        this.ids = $.ids;
        this.memory = $.memory;
        this.outputFile = $.outputFile;
        this.platform = $.platform;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerPlansArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerPlansArgs $;

        public Builder() {
            $ = new GetServerPlansArgs();
        }

        public Builder(GetServerPlansArgs defaults) {
            $ = new GetServerPlansArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidth The peak bandwidth. Unit: Mbit/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The peak bandwidth. Unit: Mbit/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param core The number of CPU cores.
         * 
         * @return builder
         * 
         */
        public Builder core(@Nullable Output<Integer> core) {
            $.core = core;
            return this;
        }

        /**
         * @param core The number of CPU cores.
         * 
         * @return builder
         * 
         */
        public Builder core(Integer core) {
            return core(Output.of(core));
        }

        /**
         * @param diskSize The size of the enhanced SSD (ESSD). Unit: GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSize(@Nullable Output<Integer> diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        /**
         * @param diskSize The size of the enhanced SSD (ESSD). Unit: GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSize(Integer diskSize) {
            return diskSize(Output.of(diskSize));
        }

        /**
         * @param flow The monthly data transfer quota. Unit: GB.
         * 
         * @return builder
         * 
         */
        public Builder flow(@Nullable Output<Integer> flow) {
            $.flow = flow;
            return this;
        }

        /**
         * @param flow The monthly data transfer quota. Unit: GB.
         * 
         * @return builder
         * 
         */
        public Builder flow(Integer flow) {
            return flow(Output.of(flow));
        }

        /**
         * @param ids A list of Instance Plan IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Instance Plan IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Instance Plan IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param memory The memory size. Unit: GB.
         * 
         * @return builder
         * 
         */
        public Builder memory(@Nullable Output<Integer> memory) {
            $.memory = memory;
            return this;
        }

        /**
         * @param memory The memory size. Unit: GB.
         * 
         * @return builder
         * 
         */
        public Builder memory(Integer memory) {
            return memory(Output.of(memory));
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
         * @param platform The platform of Plan supported. Valid values: [&#34;Linux&#34;, &#34;Windows&#34;].
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<String> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform The platform of Plan supported. Valid values: [&#34;Linux&#34;, &#34;Windows&#34;].
         * 
         * @return builder
         * 
         */
        public Builder platform(String platform) {
            return platform(Output.of(platform));
        }

        public GetServerPlansArgs build() {
            return $;
        }
    }

}