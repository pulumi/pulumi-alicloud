// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHybridMonitorSlsTasksArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHybridMonitorSlsTasksArgs Empty = new GetHybridMonitorSlsTasksArgs();

    /**
     * A list of Hybrid Monitor Sls Task IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Hybrid Monitor Sls Task IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The keyword that is used to search for metric import tasks.
     * 
     */
    @Import(name="keyword")
    private @Nullable Output<String> keyword;

    /**
     * @return The keyword that is used to search for metric import tasks.
     * 
     */
    public Optional<Output<String>> keyword() {
        return Optional.ofNullable(this.keyword);
    }

    /**
     * The name of the namespace.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The name of the namespace.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
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

    @Import(name="pageNumber")
    private @Nullable Output<Integer> pageNumber;

    public Optional<Output<Integer>> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Output<Integer> pageSize;

    public Optional<Output<Integer>> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    private GetHybridMonitorSlsTasksArgs() {}

    private GetHybridMonitorSlsTasksArgs(GetHybridMonitorSlsTasksArgs $) {
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
    public static Builder builder(GetHybridMonitorSlsTasksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHybridMonitorSlsTasksArgs $;

        public Builder() {
            $ = new GetHybridMonitorSlsTasksArgs();
        }

        public Builder(GetHybridMonitorSlsTasksArgs defaults) {
            $ = new GetHybridMonitorSlsTasksArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Hybrid Monitor Sls Task IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Hybrid Monitor Sls Task IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
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
        public Builder keyword(@Nullable Output<String> keyword) {
            $.keyword = keyword;
            return this;
        }

        /**
         * @param keyword The keyword that is used to search for metric import tasks.
         * 
         * @return builder
         * 
         */
        public Builder keyword(String keyword) {
            return keyword(Output.of(keyword));
        }

        /**
         * @param namespace The name of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The name of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
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

        public Builder pageNumber(@Nullable Output<Integer> pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageNumber(Integer pageNumber) {
            return pageNumber(Output.of(pageNumber));
        }

        public Builder pageSize(@Nullable Output<Integer> pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            return pageSize(Output.of(pageSize));
        }

        public GetHybridMonitorSlsTasksArgs build() {
            return $;
        }
    }

}