// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.edas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClustersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClustersArgs Empty = new GetClustersArgs();

    /**
     * An ids string to filter results by the cluster id.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return An ids string to filter results by the cluster id.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * ID of the namespace in EDAS.
     * 
     */
    @Import(name="logicalRegionId", required=true)
    private Output<String> logicalRegionId;

    /**
     * @return ID of the namespace in EDAS.
     * 
     */
    public Output<String> logicalRegionId() {
        return this.logicalRegionId;
    }

    /**
     * A regex string to filter results by the cluster name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by the cluster name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
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

    private GetClustersArgs() {}

    private GetClustersArgs(GetClustersArgs $) {
        this.ids = $.ids;
        this.logicalRegionId = $.logicalRegionId;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClustersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClustersArgs $;

        public Builder() {
            $ = new GetClustersArgs();
        }

        public Builder(GetClustersArgs defaults) {
            $ = new GetClustersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids An ids string to filter results by the cluster id.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids An ids string to filter results by the cluster id.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids An ids string to filter results by the cluster id.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param logicalRegionId ID of the namespace in EDAS.
         * 
         * @return builder
         * 
         */
        public Builder logicalRegionId(Output<String> logicalRegionId) {
            $.logicalRegionId = logicalRegionId;
            return this;
        }

        /**
         * @param logicalRegionId ID of the namespace in EDAS.
         * 
         * @return builder
         * 
         */
        public Builder logicalRegionId(String logicalRegionId) {
            return logicalRegionId(Output.of(logicalRegionId));
        }

        /**
         * @param nameRegex A regex string to filter results by the cluster name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by the cluster name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
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

        public GetClustersArgs build() {
            if ($.logicalRegionId == null) {
                throw new MissingRequiredPropertyException("GetClustersArgs", "logicalRegionId");
            }
            return $;
        }
    }

}