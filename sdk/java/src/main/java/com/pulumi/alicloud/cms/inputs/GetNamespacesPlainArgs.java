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


public final class GetNamespacesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNamespacesPlainArgs Empty = new GetNamespacesPlainArgs();

    /**
     * A list of Namespace IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Namespace IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The keywords of the `namespace` or `description` of the namespace.
     * 
     */
    @Import(name="keyword")
    private @Nullable String keyword;

    /**
     * @return The keywords of the `namespace` or `description` of the namespace.
     * 
     */
    public Optional<String> keyword() {
        return Optional.ofNullable(this.keyword);
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

    private GetNamespacesPlainArgs() {}

    private GetNamespacesPlainArgs(GetNamespacesPlainArgs $) {
        this.ids = $.ids;
        this.keyword = $.keyword;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNamespacesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNamespacesPlainArgs $;

        public Builder() {
            $ = new GetNamespacesPlainArgs();
        }

        public Builder(GetNamespacesPlainArgs defaults) {
            $ = new GetNamespacesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Namespace IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
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
        public Builder keyword(@Nullable String keyword) {
            $.keyword = keyword;
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

        public GetNamespacesPlainArgs build() {
            return $;
        }
    }

}
