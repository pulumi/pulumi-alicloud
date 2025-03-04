// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.inputs;

import com.pulumi.alicloud.hbr.inputs.GetServerBackupPlansFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerBackupPlansArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerBackupPlansArgs Empty = new GetServerBackupPlansArgs();

    /**
     * The filters.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetServerBackupPlansFilterArgs>> filters;

    /**
     * @return The filters.
     * 
     */
    public Optional<Output<List<GetServerBackupPlansFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A list of Server Backup Plan IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Server Backup Plan IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
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

    private GetServerBackupPlansArgs() {}

    private GetServerBackupPlansArgs(GetServerBackupPlansArgs $) {
        this.filters = $.filters;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerBackupPlansArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerBackupPlansArgs $;

        public Builder() {
            $ = new GetServerBackupPlansArgs();
        }

        public Builder(GetServerBackupPlansArgs defaults) {
            $ = new GetServerBackupPlansArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters The filters.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetServerBackupPlansFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters The filters.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetServerBackupPlansFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters The filters.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetServerBackupPlansFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param ids A list of Server Backup Plan IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Server Backup Plan IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Server Backup Plan IDs.
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

        public GetServerBackupPlansArgs build() {
            return $;
        }
    }

}
