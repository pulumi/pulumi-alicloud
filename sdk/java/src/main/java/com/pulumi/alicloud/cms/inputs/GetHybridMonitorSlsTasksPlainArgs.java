// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHybridMonitorSlsTasksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHybridMonitorSlsTasksPlainArgs Empty = new GetHybridMonitorSlsTasksPlainArgs();

    /**
     * A list of Hybrid Monitor Sls Task IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Hybrid Monitor Sls Task IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The keyword that is used to search for metric import tasks.
     * 
     */
    @Import(name="keyword")
    private @Nullable String keyword;

    /**
     * @return The keyword that is used to search for metric import tasks.
     * 
     */
    public Optional<String> keyword() {
        return Optional.ofNullable(this.keyword);
    }

    /**
     * The name of the namespace.
     * 
     */
    @Import(name="namespace")
    private @Nullable String namespace;

    /**
     * @return The name of the namespace.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
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

    @Import(name="pageNumber")
    private @Nullable Integer pageNumber;

    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Integer pageSize;

    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    private GetHybridMonitorSlsTasksPlainArgs() {}

    private GetHybridMonitorSlsTasksPlainArgs(GetHybridMonitorSlsTasksPlainArgs $) {
        this.ids = $.ids;
        this.keyword = $.keyword;
        this.namespace = $.namespace;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHybridMonitorSlsTasksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHybridMonitorSlsTasksPlainArgs $;

        public Builder() {
            $ = new GetHybridMonitorSlsTasksPlainArgs();
        }

        public Builder(GetHybridMonitorSlsTasksPlainArgs defaults) {
            $ = new GetHybridMonitorSlsTasksPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Hybrid Monitor Sls Task IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Hybrid Monitor Sls Task IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param keyword The keyword that is used to search for metric import tasks.
         * 
         * @return builder
         * 
         */
        public Builder keyword(@Nullable String keyword) {
            $.keyword = keyword;
            return this;
        }

        /**
         * @param namespace The name of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable String namespace) {
            $.namespace = namespace;
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

        public Builder pageNumber(@Nullable Integer pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageSize(@Nullable Integer pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        public GetHybridMonitorSlsTasksPlainArgs build() {
            return $;
        }
    }

}
