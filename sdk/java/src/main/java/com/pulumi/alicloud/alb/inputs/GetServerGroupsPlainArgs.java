// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerGroupsPlainArgs Empty = new GetServerGroupsPlainArgs();

    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Server Group IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Server Group IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Server Group name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Server Group name.
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
     * The server group ids.
     * 
     */
    @Import(name="serverGroupIds")
    private @Nullable List<String> serverGroupIds;

    /**
     * @return The server group ids.
     * 
     */
    public Optional<List<String>> serverGroupIds() {
        return Optional.ofNullable(this.serverGroupIds);
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="serverGroupName")
    private @Nullable String serverGroupName;

    /**
     * @return The name of the resource.
     * 
     */
    public Optional<String> serverGroupName() {
        return Optional.ofNullable(this.serverGroupName);
    }

    /**
     * The status of the resource.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the resource.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A map of tags assigned to the group.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,Object> tags;

    /**
     * @return A map of tags assigned to the group.
     * 
     */
    public Optional<Map<String,Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the VPC that you want to access.
     * 
     */
    @Import(name="vpcId")
    private @Nullable String vpcId;

    /**
     * @return The ID of the VPC that you want to access.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private GetServerGroupsPlainArgs() {}

    private GetServerGroupsPlainArgs(GetServerGroupsPlainArgs $) {
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.resourceGroupId = $.resourceGroupId;
        this.serverGroupIds = $.serverGroupIds;
        this.serverGroupName = $.serverGroupName;
        this.status = $.status;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerGroupsPlainArgs $;

        public Builder() {
            $ = new GetServerGroupsPlainArgs();
        }

        public Builder(GetServerGroupsPlainArgs defaults) {
            $ = new GetServerGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of Server Group IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Server Group IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Server Group name.
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
         * @param serverGroupIds The server group ids.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupIds(@Nullable List<String> serverGroupIds) {
            $.serverGroupIds = serverGroupIds;
            return this;
        }

        /**
         * @param serverGroupIds The server group ids.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupIds(String... serverGroupIds) {
            return serverGroupIds(List.of(serverGroupIds));
        }

        /**
         * @param serverGroupName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupName(@Nullable String serverGroupName) {
            $.serverGroupName = serverGroupName;
            return this;
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param tags A map of tags assigned to the group.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,Object> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC that you want to access.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable String vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public GetServerGroupsPlainArgs build() {
            return $;
        }
    }

}