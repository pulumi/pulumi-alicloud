// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetContainerGroupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContainerGroupsArgs Empty = new GetContainerGroupsArgs();

    /**
     * The name of ContainerGroup.
     * 
     */
    @Import(name="containerGroupName")
    private @Nullable Output<String> containerGroupName;

    /**
     * @return The name of ContainerGroup.
     * 
     */
    public Optional<Output<String>> containerGroupName() {
        return Optional.ofNullable(this.containerGroupName);
    }

    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Output<Boolean> enableDetails;

    /**
     * @return Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    public Optional<Output<Boolean>> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Container Group IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Container Group IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The maximum number of resources returned in the response. Default value is `20`. Maximum value: `20`. The number of returned results is no greater than the specified number.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return The maximum number of resources returned in the response. Default value is `20`. Maximum value: `20`. The number of returned results is no greater than the specified number.
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * A regex string to filter results by Container Group name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Container Group name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The ID of the resource group to which the container group belongs. If you have not specified a resource group for the container group, it is added to the default resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group to which the container group belongs. If you have not specified a resource group for the container group, it is added to the default resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The status of container.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of container.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tags attached to the container group. Each tag is a key-value pair. You can attach up to 20 tags to a container group.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return The tags attached to the container group. Each tag is a key-value pair. You can attach up to 20 tags to a container group.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The vswitch id.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The vswitch id.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    @Import(name="withEvent")
    private @Nullable Output<Boolean> withEvent;

    public Optional<Output<Boolean>> withEvent() {
        return Optional.ofNullable(this.withEvent);
    }

    /**
     * The IDs of the zones where the container groups are deployed. If this parameter is not set, the system automatically selects the zones. By default, no value is specified.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The IDs of the zones where the container groups are deployed. If this parameter is not set, the system automatically selects the zones. By default, no value is specified.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetContainerGroupsArgs() {}

    private GetContainerGroupsArgs(GetContainerGroupsArgs $) {
        this.containerGroupName = $.containerGroupName;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.limit = $.limit;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
        this.tags = $.tags;
        this.vswitchId = $.vswitchId;
        this.withEvent = $.withEvent;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContainerGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContainerGroupsArgs $;

        public Builder() {
            $ = new GetContainerGroupsArgs();
        }

        public Builder(GetContainerGroupsArgs defaults) {
            $ = new GetContainerGroupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerGroupName The name of ContainerGroup.
         * 
         * @return builder
         * 
         */
        public Builder containerGroupName(@Nullable Output<String> containerGroupName) {
            $.containerGroupName = containerGroupName;
            return this;
        }

        /**
         * @param containerGroupName The name of ContainerGroup.
         * 
         * @return builder
         * 
         */
        public Builder containerGroupName(String containerGroupName) {
            return containerGroupName(Output.of(containerGroupName));
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Output<Boolean> enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(Boolean enableDetails) {
            return enableDetails(Output.of(enableDetails));
        }

        /**
         * @param ids A list of Container Group IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Container Group IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Container Group IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param limit The maximum number of resources returned in the response. Default value is `20`. Maximum value: `20`. The number of returned results is no greater than the specified number.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit The maximum number of resources returned in the response. Default value is `20`. Maximum value: `20`. The number of returned results is no greater than the specified number.
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param nameRegex A regex string to filter results by Container Group name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Container Group name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param resourceGroupId The ID of the resource group to which the container group belongs. If you have not specified a resource group for the container group, it is added to the default resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group to which the container group belongs. If you have not specified a resource group for the container group, it is added to the default resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param status The status of container.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of container.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags The tags attached to the container group. Each tag is a key-value pair. You can attach up to 20 tags to a container group.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags attached to the container group. Each tag is a key-value pair. You can attach up to 20 tags to a container group.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vswitchId The vswitch id.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The vswitch id.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public Builder withEvent(@Nullable Output<Boolean> withEvent) {
            $.withEvent = withEvent;
            return this;
        }

        public Builder withEvent(Boolean withEvent) {
            return withEvent(Output.of(withEvent));
        }

        /**
         * @param zoneId The IDs of the zones where the container groups are deployed. If this parameter is not set, the system automatically selects the zones. By default, no value is specified.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The IDs of the zones where the container groups are deployed. If this parameter is not set, the system automatically selects the zones. By default, no value is specified.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetContainerGroupsArgs build() {
            return $;
        }
    }

}