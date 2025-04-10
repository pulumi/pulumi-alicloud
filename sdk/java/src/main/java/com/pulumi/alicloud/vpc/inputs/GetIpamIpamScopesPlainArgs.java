// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpamIpamScopesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpamIpamScopesPlainArgs Empty = new GetIpamIpamScopesPlainArgs();

    /**
     * A list of Ipam Scope IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Ipam Scope IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The id of the Ipam instance.
     * 
     */
    @Import(name="ipamId")
    private @Nullable String ipamId;

    /**
     * @return The id of the Ipam instance.
     * 
     */
    public Optional<String> ipamId() {
        return Optional.ofNullable(this.ipamId);
    }

    /**
     * The first ID of the resource.
     * 
     */
    @Import(name="ipamScopeId")
    private @Nullable String ipamScopeId;

    /**
     * @return The first ID of the resource.
     * 
     */
    public Optional<String> ipamScopeId() {
        return Optional.ofNullable(this.ipamScopeId);
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="ipamScopeName")
    private @Nullable String ipamScopeName;

    /**
     * @return The name of the resource.
     * 
     */
    public Optional<String> ipamScopeName() {
        return Optional.ofNullable(this.ipamScopeName);
    }

    /**
     * IPAM scope of action type:**private**.&gt; Currently, only the role scope of the private network is supported.
     * 
     */
    @Import(name="ipamScopeType")
    private @Nullable String ipamScopeType;

    /**
     * @return IPAM scope of action type:**private**.&gt; Currently, only the role scope of the private network is supported.
     * 
     */
    public Optional<String> ipamScopeType() {
        return Optional.ofNullable(this.ipamScopeType);
    }

    /**
     * A regex string to filter results by Group Metric Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Group Metric Rule name.
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

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The tag of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return The tag of the resource.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetIpamIpamScopesPlainArgs() {}

    private GetIpamIpamScopesPlainArgs(GetIpamIpamScopesPlainArgs $) {
        this.ids = $.ids;
        this.ipamId = $.ipamId;
        this.ipamScopeId = $.ipamScopeId;
        this.ipamScopeName = $.ipamScopeName;
        this.ipamScopeType = $.ipamScopeType;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.resourceGroupId = $.resourceGroupId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpamIpamScopesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpamIpamScopesPlainArgs $;

        public Builder() {
            $ = new GetIpamIpamScopesPlainArgs();
        }

        public Builder(GetIpamIpamScopesPlainArgs defaults) {
            $ = new GetIpamIpamScopesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Ipam Scope IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Ipam Scope IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param ipamId The id of the Ipam instance.
         * 
         * @return builder
         * 
         */
        public Builder ipamId(@Nullable String ipamId) {
            $.ipamId = ipamId;
            return this;
        }

        /**
         * @param ipamScopeId The first ID of the resource.
         * 
         * @return builder
         * 
         */
        public Builder ipamScopeId(@Nullable String ipamScopeId) {
            $.ipamScopeId = ipamScopeId;
            return this;
        }

        /**
         * @param ipamScopeName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder ipamScopeName(@Nullable String ipamScopeName) {
            $.ipamScopeName = ipamScopeName;
            return this;
        }

        /**
         * @param ipamScopeType IPAM scope of action type:**private**.&gt; Currently, only the role scope of the private network is supported.
         * 
         * @return builder
         * 
         */
        public Builder ipamScopeType(@Nullable String ipamScopeType) {
            $.ipamScopeType = ipamScopeType;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Group Metric Rule name.
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

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param tags The tag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetIpamIpamScopesPlainArgs build() {
            return $;
        }
    }

}
