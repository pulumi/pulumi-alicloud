// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.selectdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDbClustersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDbClustersPlainArgs Empty = new GetDbClustersPlainArgs();

    /**
     * A list of DBCluster IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of DBCluster IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
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

    private GetDbClustersPlainArgs() {}

    private GetDbClustersPlainArgs(GetDbClustersPlainArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbClustersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbClustersPlainArgs $;

        public Builder() {
            $ = new GetDbClustersPlainArgs();
        }

        public Builder(GetDbClustersPlainArgs defaults) {
            $ = new GetDbClustersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of DBCluster IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of DBCluster IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
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

        public GetDbClustersPlainArgs build() {
            return $;
        }
    }

}