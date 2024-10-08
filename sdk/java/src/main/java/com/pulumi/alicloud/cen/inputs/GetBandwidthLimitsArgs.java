// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBandwidthLimitsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBandwidthLimitsArgs Empty = new GetBandwidthLimitsArgs();

    /**
     * A list of CEN instances IDs.
     * 
     */
    @Import(name="instanceIds")
    private @Nullable Output<List<String>> instanceIds;

    /**
     * @return A list of CEN instances IDs.
     * 
     */
    public Optional<Output<List<String>>> instanceIds() {
        return Optional.ofNullable(this.instanceIds);
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

    private GetBandwidthLimitsArgs() {}

    private GetBandwidthLimitsArgs(GetBandwidthLimitsArgs $) {
        this.instanceIds = $.instanceIds;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBandwidthLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBandwidthLimitsArgs $;

        public Builder() {
            $ = new GetBandwidthLimitsArgs();
        }

        public Builder(GetBandwidthLimitsArgs defaults) {
            $ = new GetBandwidthLimitsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceIds A list of CEN instances IDs.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(@Nullable Output<List<String>> instanceIds) {
            $.instanceIds = instanceIds;
            return this;
        }

        /**
         * @param instanceIds A list of CEN instances IDs.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(List<String> instanceIds) {
            return instanceIds(Output.of(instanceIds));
        }

        /**
         * @param instanceIds A list of CEN instances IDs.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(String... instanceIds) {
            return instanceIds(List.of(instanceIds));
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

        public GetBandwidthLimitsArgs build() {
            return $;
        }
    }

}
