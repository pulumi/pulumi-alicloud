// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEcsImageComponentsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEcsImageComponentsPlainArgs Empty = new GetEcsImageComponentsPlainArgs();

    /**
     * A list of Image Component IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Image Component IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The name of the component.
     * 
     */
    @Import(name="imageComponentName")
    private @Nullable String imageComponentName;

    /**
     * @return The name of the component.
     * 
     */
    public Optional<String> imageComponentName() {
        return Optional.ofNullable(this.imageComponentName);
    }

    /**
     * A regex string to filter results by Image Component name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Image Component name.
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
     * Mirror component type. Valid values: `SELF` or `ALIYUN`. Possible values:
     * - SELF: The custom image component you created.
     * - ALIYUN: System components provided by Alibaba Cloud.
     * 
     */
    @Import(name="owner")
    private @Nullable String owner;

    /**
     * @return Mirror component type. Valid values: `SELF` or `ALIYUN`. Possible values:
     * - SELF: The custom image component you created.
     * - ALIYUN: System components provided by Alibaba Cloud.
     * 
     */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
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
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,Object> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Map<String,Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetEcsImageComponentsPlainArgs() {}

    private GetEcsImageComponentsPlainArgs(GetEcsImageComponentsPlainArgs $) {
        this.ids = $.ids;
        this.imageComponentName = $.imageComponentName;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.owner = $.owner;
        this.resourceGroupId = $.resourceGroupId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEcsImageComponentsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEcsImageComponentsPlainArgs $;

        public Builder() {
            $ = new GetEcsImageComponentsPlainArgs();
        }

        public Builder(GetEcsImageComponentsPlainArgs defaults) {
            $ = new GetEcsImageComponentsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Image Component IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Image Component IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param imageComponentName The name of the component.
         * 
         * @return builder
         * 
         */
        public Builder imageComponentName(@Nullable String imageComponentName) {
            $.imageComponentName = imageComponentName;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Image Component name.
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
         * @param owner Mirror component type. Valid values: `SELF` or `ALIYUN`. Possible values:
         * - SELF: The custom image component you created.
         * - ALIYUN: System components provided by Alibaba Cloud.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable String owner) {
            $.owner = owner;
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
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,Object> tags) {
            $.tags = tags;
            return this;
        }

        public GetEcsImageComponentsPlainArgs build() {
            return $;
        }
    }

}