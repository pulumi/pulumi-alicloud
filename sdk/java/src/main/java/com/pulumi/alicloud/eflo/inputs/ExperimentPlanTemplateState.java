// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eflo.inputs;

import com.pulumi.alicloud.eflo.inputs.ExperimentPlanTemplateTemplatePipelineArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExperimentPlanTemplateState extends com.pulumi.resources.ResourceArgs {

    public static final ExperimentPlanTemplateState Empty = new ExperimentPlanTemplateState();

    /**
     * The creation time of the resource.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Used to indicate the privacy level of the content or information. It can have the following optional parameters:
     * - private: Indicates that the content is private and restricted to specific users or permission groups. Private content is usually not publicly displayed, and only authorized users can view or edit it.
     * - public: Indicates that the content is public and can be accessed by anyone. Public content is usually viewable by all users and is suitable for sharing information or resources
     * 
     */
    @Import(name="privacyLevel")
    private @Nullable Output<String> privacyLevel;

    /**
     * @return Used to indicate the privacy level of the content or information. It can have the following optional parameters:
     * - private: Indicates that the content is private and restricted to specific users or permission groups. Private content is usually not publicly displayed, and only authorized users can view or edit it.
     * - public: Indicates that the content is public and can be accessed by anyone. Public content is usually viewable by all users and is suitable for sharing information or resources
     * 
     */
    public Optional<Output<String>> privacyLevel() {
        return Optional.ofNullable(this.privacyLevel);
    }

    /**
     * Describe the purpose of this template.
     * 
     */
    @Import(name="templateDescription")
    private @Nullable Output<String> templateDescription;

    /**
     * @return Describe the purpose of this template.
     * 
     */
    public Optional<Output<String>> templateDescription() {
        return Optional.ofNullable(this.templateDescription);
    }

    /**
     * The ID of the template.
     * 
     */
    @Import(name="templateId")
    private @Nullable Output<String> templateId;

    /**
     * @return The ID of the template.
     * 
     */
    public Optional<Output<String>> templateId() {
        return Optional.ofNullable(this.templateId);
    }

    /**
     * Help users identify and select specific templates.
     * 
     */
    @Import(name="templateName")
    private @Nullable Output<String> templateName;

    /**
     * @return Help users identify and select specific templates.
     * 
     */
    public Optional<Output<String>> templateName() {
        return Optional.ofNullable(this.templateName);
    }

    /**
     * Representative Template Pipeline. See `template_pipeline` below.
     * 
     */
    @Import(name="templatePipelines")
    private @Nullable Output<List<ExperimentPlanTemplateTemplatePipelineArgs>> templatePipelines;

    /**
     * @return Representative Template Pipeline. See `template_pipeline` below.
     * 
     */
    public Optional<Output<List<ExperimentPlanTemplateTemplatePipelineArgs>>> templatePipelines() {
        return Optional.ofNullable(this.templatePipelines);
    }

    private ExperimentPlanTemplateState() {}

    private ExperimentPlanTemplateState(ExperimentPlanTemplateState $) {
        this.createTime = $.createTime;
        this.privacyLevel = $.privacyLevel;
        this.templateDescription = $.templateDescription;
        this.templateId = $.templateId;
        this.templateName = $.templateName;
        this.templatePipelines = $.templatePipelines;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExperimentPlanTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExperimentPlanTemplateState $;

        public Builder() {
            $ = new ExperimentPlanTemplateState();
        }

        public Builder(ExperimentPlanTemplateState defaults) {
            $ = new ExperimentPlanTemplateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The creation time of the resource.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation time of the resource.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param privacyLevel Used to indicate the privacy level of the content or information. It can have the following optional parameters:
         * - private: Indicates that the content is private and restricted to specific users or permission groups. Private content is usually not publicly displayed, and only authorized users can view or edit it.
         * - public: Indicates that the content is public and can be accessed by anyone. Public content is usually viewable by all users and is suitable for sharing information or resources
         * 
         * @return builder
         * 
         */
        public Builder privacyLevel(@Nullable Output<String> privacyLevel) {
            $.privacyLevel = privacyLevel;
            return this;
        }

        /**
         * @param privacyLevel Used to indicate the privacy level of the content or information. It can have the following optional parameters:
         * - private: Indicates that the content is private and restricted to specific users or permission groups. Private content is usually not publicly displayed, and only authorized users can view or edit it.
         * - public: Indicates that the content is public and can be accessed by anyone. Public content is usually viewable by all users and is suitable for sharing information or resources
         * 
         * @return builder
         * 
         */
        public Builder privacyLevel(String privacyLevel) {
            return privacyLevel(Output.of(privacyLevel));
        }

        /**
         * @param templateDescription Describe the purpose of this template.
         * 
         * @return builder
         * 
         */
        public Builder templateDescription(@Nullable Output<String> templateDescription) {
            $.templateDescription = templateDescription;
            return this;
        }

        /**
         * @param templateDescription Describe the purpose of this template.
         * 
         * @return builder
         * 
         */
        public Builder templateDescription(String templateDescription) {
            return templateDescription(Output.of(templateDescription));
        }

        /**
         * @param templateId The ID of the template.
         * 
         * @return builder
         * 
         */
        public Builder templateId(@Nullable Output<String> templateId) {
            $.templateId = templateId;
            return this;
        }

        /**
         * @param templateId The ID of the template.
         * 
         * @return builder
         * 
         */
        public Builder templateId(String templateId) {
            return templateId(Output.of(templateId));
        }

        /**
         * @param templateName Help users identify and select specific templates.
         * 
         * @return builder
         * 
         */
        public Builder templateName(@Nullable Output<String> templateName) {
            $.templateName = templateName;
            return this;
        }

        /**
         * @param templateName Help users identify and select specific templates.
         * 
         * @return builder
         * 
         */
        public Builder templateName(String templateName) {
            return templateName(Output.of(templateName));
        }

        /**
         * @param templatePipelines Representative Template Pipeline. See `template_pipeline` below.
         * 
         * @return builder
         * 
         */
        public Builder templatePipelines(@Nullable Output<List<ExperimentPlanTemplateTemplatePipelineArgs>> templatePipelines) {
            $.templatePipelines = templatePipelines;
            return this;
        }

        /**
         * @param templatePipelines Representative Template Pipeline. See `template_pipeline` below.
         * 
         * @return builder
         * 
         */
        public Builder templatePipelines(List<ExperimentPlanTemplateTemplatePipelineArgs> templatePipelines) {
            return templatePipelines(Output.of(templatePipelines));
        }

        /**
         * @param templatePipelines Representative Template Pipeline. See `template_pipeline` below.
         * 
         * @return builder
         * 
         */
        public Builder templatePipelines(ExperimentPlanTemplateTemplatePipelineArgs... templatePipelines) {
            return templatePipelines(List.of(templatePipelines));
        }

        public ExperimentPlanTemplateState build() {
            return $;
        }
    }

}
