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


public final class GetSlsGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSlsGroupsPlainArgs Empty = new GetSlsGroupsPlainArgs();

    /**
     * A list of Sls Group IDs. Its element value is same as Sls Group Name.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Sls Group IDs. Its element value is same as Sls Group Name.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The keywords of the `sls_group_name` or `sls_group_description` of the Sls Group.
     * 
     */
    @Import(name="keyword")
    private @Nullable String keyword;

    /**
     * @return The keywords of the `sls_group_name` or `sls_group_description` of the Sls Group.
     * 
     */
    public Optional<String> keyword() {
        return Optional.ofNullable(this.keyword);
    }

    /**
     * A regex string to filter results by Sls Group name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Sls Group name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
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

    private GetSlsGroupsPlainArgs() {}

    private GetSlsGroupsPlainArgs(GetSlsGroupsPlainArgs $) {
        this.ids = $.ids;
        this.keyword = $.keyword;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSlsGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSlsGroupsPlainArgs $;

        public Builder() {
            $ = new GetSlsGroupsPlainArgs();
        }

        public Builder(GetSlsGroupsPlainArgs defaults) {
            $ = new GetSlsGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Sls Group IDs. Its element value is same as Sls Group Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Sls Group IDs. Its element value is same as Sls Group Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param keyword The keywords of the `sls_group_name` or `sls_group_description` of the Sls Group.
         * 
         * @return builder
         * 
         */
        public Builder keyword(@Nullable String keyword) {
            $.keyword = keyword;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Sls Group name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
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

        public GetSlsGroupsPlainArgs build() {
            return $;
        }
    }

}