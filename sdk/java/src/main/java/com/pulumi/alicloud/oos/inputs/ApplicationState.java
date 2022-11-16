// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oos.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationState extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationState Empty = new ApplicationState();

    /**
     * The name of the application.
     * 
     */
    @Import(name="applicationName")
    private @Nullable Output<String> applicationName;

    /**
     * @return The name of the application.
     * 
     */
    public Optional<Output<String>> applicationName() {
        return Optional.ofNullable(this.applicationName);
    }

    /**
     * Application group description information.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Application group description information.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The tag of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return The tag of the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ApplicationState() {}

    private ApplicationState(ApplicationState $) {
        this.applicationName = $.applicationName;
        this.description = $.description;
        this.resourceGroupId = $.resourceGroupId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationState $;

        public Builder() {
            $ = new ApplicationState();
        }

        public Builder(ApplicationState defaults) {
            $ = new ApplicationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationName The name of the application.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(@Nullable Output<String> applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        /**
         * @param applicationName The name of the application.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(String applicationName) {
            return applicationName(Output.of(applicationName));
        }

        /**
         * @param description Application group description information.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Application group description information.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param tags The tag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public ApplicationState build() {
            return $;
        }
    }

}