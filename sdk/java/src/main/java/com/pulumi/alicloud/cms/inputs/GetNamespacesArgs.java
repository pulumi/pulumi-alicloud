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


public final class GetNamespacesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNamespacesArgs Empty = new GetNamespacesArgs();

    /**
     * A list of Namespace IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Namespace IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The keywords of the `namespace` or `description` of the namespace.
     * 
     */
    @Import(name="keyword")
    private @Nullable Output<String> keyword;

    /**
     * @return The keywords of the `namespace` or `description` of the namespace.
     * 
     */
    public Optional<Output<String>> keyword() {
        return Optional.ofNullable(this.keyword);
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

    private GetNamespacesArgs() {}

    private GetNamespacesArgs(GetNamespacesArgs $) {
        this.ids = $.ids;
        this.keyword = $.keyword;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNamespacesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNamespacesArgs $;

        public Builder() {
            $ = new GetNamespacesArgs();
        }

        public Builder(GetNamespacesArgs defaults) {
            $ = new GetNamespacesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Namespace IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Namespace IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Namespace IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param keyword The keywords of the `namespace` or `description` of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder keyword(@Nullable Output<String> keyword) {
            $.keyword = keyword;
            return this;
        }

        /**
         * @param keyword The keywords of the `namespace` or `description` of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder keyword(String keyword) {
            return keyword(Output.of(keyword));
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

        public GetNamespacesArgs build() {
            return $;
        }
    }

}