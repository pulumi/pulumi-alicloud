// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pvtz.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetZonesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZonesPlainArgs Empty = new GetZonesPlainArgs();

    /**
     * Default to `false`. Set it to true can output more details.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `false`. Set it to true can output more details.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of zone IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of zone IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * keyword for zone name.
     * 
     */
    @Import(name="keyword")
    private @Nullable String keyword;

    /**
     * @return keyword for zone name.
     * 
     */
    public Optional<String> keyword() {
        return Optional.ofNullable(this.keyword);
    }

    /**
     * User language.
     * 
     */
    @Import(name="lang")
    private @Nullable String lang;

    /**
     * @return User language.
     * 
     */
    public Optional<String> lang() {
        return Optional.ofNullable(this.lang);
    }

    @Import(name="nameRegex")
    private @Nullable String nameRegex;

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

    /**
     * query_region_id for zone regionId.
     * 
     */
    @Import(name="queryRegionId")
    private @Nullable String queryRegionId;

    /**
     * @return query_region_id for zone regionId.
     * 
     */
    public Optional<String> queryRegionId() {
        return Optional.ofNullable(this.queryRegionId);
    }

    /**
     * query_vpc_id for zone vpcId.
     * 
     */
    @Import(name="queryVpcId")
    private @Nullable String queryVpcId;

    /**
     * @return query_vpc_id for zone vpcId.
     * 
     */
    public Optional<String> queryVpcId() {
        return Optional.ofNullable(this.queryVpcId);
    }

    /**
     * resource_group_id for zone resourceGroupId.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return resource_group_id for zone resourceGroupId.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * Search mode. Value:
     * - LIKE: fuzzy search.
     * - EXACT: precise search. It is not filled in by default.
     * 
     */
    @Import(name="searchMode")
    private @Nullable String searchMode;

    /**
     * @return Search mode. Value:
     * - LIKE: fuzzy search.
     * - EXACT: precise search. It is not filled in by default.
     * 
     */
    public Optional<String> searchMode() {
        return Optional.ofNullable(this.searchMode);
    }

    private GetZonesPlainArgs() {}

    private GetZonesPlainArgs(GetZonesPlainArgs $) {
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.keyword = $.keyword;
        this.lang = $.lang;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.queryRegionId = $.queryRegionId;
        this.queryVpcId = $.queryVpcId;
        this.resourceGroupId = $.resourceGroupId;
        this.searchMode = $.searchMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZonesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZonesPlainArgs $;

        public Builder() {
            $ = new GetZonesPlainArgs();
        }

        public Builder(GetZonesPlainArgs defaults) {
            $ = new GetZonesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableDetails Default to `false`. Set it to true can output more details.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of zone IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of zone IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param keyword keyword for zone name.
         * 
         * @return builder
         * 
         */
        public Builder keyword(@Nullable String keyword) {
            $.keyword = keyword;
            return this;
        }

        /**
         * @param lang User language.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable String lang) {
            $.lang = lang;
            return this;
        }

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

        /**
         * @param queryRegionId query_region_id for zone regionId.
         * 
         * @return builder
         * 
         */
        public Builder queryRegionId(@Nullable String queryRegionId) {
            $.queryRegionId = queryRegionId;
            return this;
        }

        /**
         * @param queryVpcId query_vpc_id for zone vpcId.
         * 
         * @return builder
         * 
         */
        public Builder queryVpcId(@Nullable String queryVpcId) {
            $.queryVpcId = queryVpcId;
            return this;
        }

        /**
         * @param resourceGroupId resource_group_id for zone resourceGroupId.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param searchMode Search mode. Value:
         * - LIKE: fuzzy search.
         * - EXACT: precise search. It is not filled in by default.
         * 
         * @return builder
         * 
         */
        public Builder searchMode(@Nullable String searchMode) {
            $.searchMode = searchMode;
            return this;
        }

        public GetZonesPlainArgs build() {
            return $;
        }
    }

}
