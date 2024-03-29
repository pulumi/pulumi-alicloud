// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PluginAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final PluginAttachmentState Empty = new PluginAttachmentState();

    /**
     * The api_id that plugin attaches to.
     * 
     */
    @Import(name="apiId")
    private @Nullable Output<String> apiId;

    /**
     * @return The api_id that plugin attaches to.
     * 
     */
    public Optional<Output<String>> apiId() {
        return Optional.ofNullable(this.apiId);
    }

    /**
     * The group that the api belongs to.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The group that the api belongs to.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The plugin that attaches to the api.
     * 
     */
    @Import(name="pluginId")
    private @Nullable Output<String> pluginId;

    /**
     * @return The plugin that attaches to the api.
     * 
     */
    public Optional<Output<String>> pluginId() {
        return Optional.ofNullable(this.pluginId);
    }

    /**
     * Stage that the plugin attaches to.
     * 
     */
    @Import(name="stageName")
    private @Nullable Output<String> stageName;

    /**
     * @return Stage that the plugin attaches to.
     * 
     */
    public Optional<Output<String>> stageName() {
        return Optional.ofNullable(this.stageName);
    }

    private PluginAttachmentState() {}

    private PluginAttachmentState(PluginAttachmentState $) {
        this.apiId = $.apiId;
        this.groupId = $.groupId;
        this.pluginId = $.pluginId;
        this.stageName = $.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PluginAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PluginAttachmentState $;

        public Builder() {
            $ = new PluginAttachmentState();
        }

        public Builder(PluginAttachmentState defaults) {
            $ = new PluginAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId The api_id that plugin attaches to.
         * 
         * @return builder
         * 
         */
        public Builder apiId(@Nullable Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId The api_id that plugin attaches to.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param groupId The group that the api belongs to.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The group that the api belongs to.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param pluginId The plugin that attaches to the api.
         * 
         * @return builder
         * 
         */
        public Builder pluginId(@Nullable Output<String> pluginId) {
            $.pluginId = pluginId;
            return this;
        }

        /**
         * @param pluginId The plugin that attaches to the api.
         * 
         * @return builder
         * 
         */
        public Builder pluginId(String pluginId) {
            return pluginId(Output.of(pluginId));
        }

        /**
         * @param stageName Stage that the plugin attaches to.
         * 
         * @return builder
         * 
         */
        public Builder stageName(@Nullable Output<String> stageName) {
            $.stageName = stageName;
            return this;
        }

        /**
         * @param stageName Stage that the plugin attaches to.
         * 
         * @return builder
         * 
         */
        public Builder stageName(String stageName) {
            return stageName(Output.of(stageName));
        }

        public PluginAttachmentState build() {
            return $;
        }
    }

}
