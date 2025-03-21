// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.simpleapplicationserver.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerPlansPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerPlansPlainArgs Empty = new GetServerPlansPlainArgs();

    /**
     * The peak bandwidth. Unit: Mbit/s.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Integer bandwidth;

    /**
     * @return The peak bandwidth. Unit: Mbit/s.
     * 
     */
    public Optional<Integer> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * The number of CPU cores.
     * 
     */
    @Import(name="core")
    private @Nullable Integer core;

    /**
     * @return The number of CPU cores.
     * 
     */
    public Optional<Integer> core() {
        return Optional.ofNullable(this.core);
    }

    /**
     * The size of the enhanced SSD (ESSD). Unit: GB.
     * 
     */
    @Import(name="diskSize")
    private @Nullable Integer diskSize;

    /**
     * @return The size of the enhanced SSD (ESSD). Unit: GB.
     * 
     */
    public Optional<Integer> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }

    /**
     * The monthly data transfer quota. Unit: GB.
     * 
     */
    @Import(name="flow")
    private @Nullable Integer flow;

    /**
     * @return The monthly data transfer quota. Unit: GB.
     * 
     */
    public Optional<Integer> flow() {
        return Optional.ofNullable(this.flow);
    }

    /**
     * A list of Instance Plan IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Instance Plan IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The memory size. Unit: GB.
     * 
     */
    @Import(name="memory")
    private @Nullable Double memory;

    /**
     * @return The memory size. Unit: GB.
     * 
     */
    public Optional<Double> memory() {
        return Optional.ofNullable(this.memory);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The platform of Plan supported. Valid values: [&#34;Linux&#34;, &#34;Windows&#34;].
     * 
     */
    @Import(name="platform")
    private @Nullable String platform;

    /**
     * @return The platform of Plan supported. Valid values: [&#34;Linux&#34;, &#34;Windows&#34;].
     * 
     */
    public Optional<String> platform() {
        return Optional.ofNullable(this.platform);
    }

    private GetServerPlansPlainArgs() {}

    private GetServerPlansPlainArgs(GetServerPlansPlainArgs $) {
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
    public static Builder builder(GetServerPlansPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerPlansPlainArgs $;

        public Builder() {
            $ = new GetServerPlansPlainArgs();
        }

        public Builder(GetServerPlansPlainArgs defaults) {
            $ = new GetServerPlansPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidth The peak bandwidth. Unit: Mbit/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Integer bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param core The number of CPU cores.
         * 
         * @return builder
         * 
         */
        public Builder core(@Nullable Integer core) {
            $.core = core;
            return this;
        }

        /**
         * @param diskSize The size of the enhanced SSD (ESSD). Unit: GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSize(@Nullable Integer diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        /**
         * @param flow The monthly data transfer quota. Unit: GB.
         * 
         * @return builder
         * 
         */
        public Builder flow(@Nullable Integer flow) {
            $.flow = flow;
            return this;
        }

        /**
         * @param ids A list of Instance Plan IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
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
        public Builder memory(@Nullable Double memory) {
            $.memory = memory;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param platform The platform of Plan supported. Valid values: [&#34;Linux&#34;, &#34;Windows&#34;].
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable String platform) {
            $.platform = platform;
            return this;
        }

        public GetServerPlansPlainArgs build() {
            return $;
        }
    }

}
