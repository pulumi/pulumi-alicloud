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


public final class StateConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final StateConfigurationState Empty = new StateConfigurationState();

    /**
     * Configuration mode. Valid values: `ApplyAndAutoCorrect`, `ApplyAndMonitor`, `ApplyOnly`.
     * 
     */
    @Import(name="configureMode")
    private @Nullable Output<String> configureMode;

    /**
     * @return Configuration mode. Valid values: `ApplyAndAutoCorrect`, `ApplyAndMonitor`, `ApplyOnly`.
     * 
     */
    public Optional<Output<String>> configureMode() {
        return Optional.ofNullable(this.configureMode);
    }

    /**
     * The description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The parameter of the Template. This field is in the format of JSON strings. For detailed definition instructions, please refer to [Metadata types that are supported by a configuration list](https://www.alibabacloud.com/help/en/doc-detail/208276.html).
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<String> parameters;

    /**
     * @return The parameter of the Template. This field is in the format of JSON strings. For detailed definition instructions, please refer to [Metadata types that are supported by a configuration list](https://www.alibabacloud.com/help/en/doc-detail/208276.html).
     * 
     */
    public Optional<Output<String>> parameters() {
        return Optional.ofNullable(this.parameters);
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
     * Timing expression.
     * 
     */
    @Import(name="scheduleExpression")
    private @Nullable Output<String> scheduleExpression;

    /**
     * @return Timing expression.
     * 
     */
    public Optional<Output<String>> scheduleExpression() {
        return Optional.ofNullable(this.scheduleExpression);
    }

    /**
     * Timing type. Valid values: `rate`.
     * 
     */
    @Import(name="scheduleType")
    private @Nullable Output<String> scheduleType;

    /**
     * @return Timing type. Valid values: `rate`.
     * 
     */
    public Optional<Output<String>> scheduleType() {
        return Optional.ofNullable(this.scheduleType);
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

    /**
     * The Target resources.  This field is in the format of JSON strings. For detailed definition instructions, please refer to [Parameter](https://www.alibabacloud.com/help/en/doc-detail/120674.html).
     * 
     */
    @Import(name="targets")
    private @Nullable Output<String> targets;

    /**
     * @return The Target resources.  This field is in the format of JSON strings. For detailed definition instructions, please refer to [Parameter](https://www.alibabacloud.com/help/en/doc-detail/120674.html).
     * 
     */
    public Optional<Output<String>> targets() {
        return Optional.ofNullable(this.targets);
    }

    /**
     * The name of the template.
     * 
     */
    @Import(name="templateName")
    private @Nullable Output<String> templateName;

    /**
     * @return The name of the template.
     * 
     */
    public Optional<Output<String>> templateName() {
        return Optional.ofNullable(this.templateName);
    }

    /**
     * The version number. If you do not specify this parameter, the system uses the latest version.
     * 
     */
    @Import(name="templateVersion")
    private @Nullable Output<String> templateVersion;

    /**
     * @return The version number. If you do not specify this parameter, the system uses the latest version.
     * 
     */
    public Optional<Output<String>> templateVersion() {
        return Optional.ofNullable(this.templateVersion);
    }

    private StateConfigurationState() {}

    private StateConfigurationState(StateConfigurationState $) {
        this.configureMode = $.configureMode;
        this.description = $.description;
        this.parameters = $.parameters;
        this.resourceGroupId = $.resourceGroupId;
        this.scheduleExpression = $.scheduleExpression;
        this.scheduleType = $.scheduleType;
        this.tags = $.tags;
        this.targets = $.targets;
        this.templateName = $.templateName;
        this.templateVersion = $.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StateConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StateConfigurationState $;

        public Builder() {
            $ = new StateConfigurationState();
        }

        public Builder(StateConfigurationState defaults) {
            $ = new StateConfigurationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configureMode Configuration mode. Valid values: `ApplyAndAutoCorrect`, `ApplyAndMonitor`, `ApplyOnly`.
         * 
         * @return builder
         * 
         */
        public Builder configureMode(@Nullable Output<String> configureMode) {
            $.configureMode = configureMode;
            return this;
        }

        /**
         * @param configureMode Configuration mode. Valid values: `ApplyAndAutoCorrect`, `ApplyAndMonitor`, `ApplyOnly`.
         * 
         * @return builder
         * 
         */
        public Builder configureMode(String configureMode) {
            return configureMode(Output.of(configureMode));
        }

        /**
         * @param description The description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param parameters The parameter of the Template. This field is in the format of JSON strings. For detailed definition instructions, please refer to [Metadata types that are supported by a configuration list](https://www.alibabacloud.com/help/en/doc-detail/208276.html).
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The parameter of the Template. This field is in the format of JSON strings. For detailed definition instructions, please refer to [Metadata types that are supported by a configuration list](https://www.alibabacloud.com/help/en/doc-detail/208276.html).
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
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
         * @param scheduleExpression Timing expression.
         * 
         * @return builder
         * 
         */
        public Builder scheduleExpression(@Nullable Output<String> scheduleExpression) {
            $.scheduleExpression = scheduleExpression;
            return this;
        }

        /**
         * @param scheduleExpression Timing expression.
         * 
         * @return builder
         * 
         */
        public Builder scheduleExpression(String scheduleExpression) {
            return scheduleExpression(Output.of(scheduleExpression));
        }

        /**
         * @param scheduleType Timing type. Valid values: `rate`.
         * 
         * @return builder
         * 
         */
        public Builder scheduleType(@Nullable Output<String> scheduleType) {
            $.scheduleType = scheduleType;
            return this;
        }

        /**
         * @param scheduleType Timing type. Valid values: `rate`.
         * 
         * @return builder
         * 
         */
        public Builder scheduleType(String scheduleType) {
            return scheduleType(Output.of(scheduleType));
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

        /**
         * @param targets The Target resources.  This field is in the format of JSON strings. For detailed definition instructions, please refer to [Parameter](https://www.alibabacloud.com/help/en/doc-detail/120674.html).
         * 
         * @return builder
         * 
         */
        public Builder targets(@Nullable Output<String> targets) {
            $.targets = targets;
            return this;
        }

        /**
         * @param targets The Target resources.  This field is in the format of JSON strings. For detailed definition instructions, please refer to [Parameter](https://www.alibabacloud.com/help/en/doc-detail/120674.html).
         * 
         * @return builder
         * 
         */
        public Builder targets(String targets) {
            return targets(Output.of(targets));
        }

        /**
         * @param templateName The name of the template.
         * 
         * @return builder
         * 
         */
        public Builder templateName(@Nullable Output<String> templateName) {
            $.templateName = templateName;
            return this;
        }

        /**
         * @param templateName The name of the template.
         * 
         * @return builder
         * 
         */
        public Builder templateName(String templateName) {
            return templateName(Output.of(templateName));
        }

        /**
         * @param templateVersion The version number. If you do not specify this parameter, the system uses the latest version.
         * 
         * @return builder
         * 
         */
        public Builder templateVersion(@Nullable Output<String> templateVersion) {
            $.templateVersion = templateVersion;
            return this;
        }

        /**
         * @param templateVersion The version number. If you do not specify this parameter, the system uses the latest version.
         * 
         * @return builder
         * 
         */
        public Builder templateVersion(String templateVersion) {
            return templateVersion(Output.of(templateVersion));
        }

        public StateConfigurationState build() {
            return $;
        }
    }

}