// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetEcsLaunchTemplatesTemplate;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEcsLaunchTemplatesResult {
    private @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    /**
     * @return The name of the Launch Template.
     * 
     */
    private @Nullable String launchTemplateName;
    private @Nullable String nameRegex;
    /**
     * @return A list of Launch Template names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String templateResourceGroupId;
    /**
     * @return The tags of the launch template.
     * &gt; **NOTE:** Except for the fields `id`, `launch_template_id`, `launch_template_name`, `default_version_number`, `latest_version_number`, `created_by`, `modified_time`, `resource_group_id`, `template_tags`, all other fields take effect only if `enable_details` is set to `true`.
     * 
     */
    private @Nullable Map<String,String> templateTags;
    /**
     * @return A list of Ecs Launch Templates. Each element contains the following attributes:
     * 
     */
    private List<GetEcsLaunchTemplatesTemplate> templates;

    private GetEcsLaunchTemplatesResult() {}
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return The name of the Launch Template.
     * 
     */
    public Optional<String> launchTemplateName() {
        return Optional.ofNullable(this.launchTemplateName);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of Launch Template names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> templateResourceGroupId() {
        return Optional.ofNullable(this.templateResourceGroupId);
    }
    /**
     * @return The tags of the launch template.
     * &gt; **NOTE:** Except for the fields `id`, `launch_template_id`, `launch_template_name`, `default_version_number`, `latest_version_number`, `created_by`, `modified_time`, `resource_group_id`, `template_tags`, all other fields take effect only if `enable_details` is set to `true`.
     * 
     */
    public Map<String,String> templateTags() {
        return this.templateTags == null ? Map.of() : this.templateTags;
    }
    /**
     * @return A list of Ecs Launch Templates. Each element contains the following attributes:
     * 
     */
    public List<GetEcsLaunchTemplatesTemplate> templates() {
        return this.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsLaunchTemplatesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String launchTemplateName;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String templateResourceGroupId;
        private @Nullable Map<String,String> templateTags;
        private List<GetEcsLaunchTemplatesTemplate> templates;
        public Builder() {}
        public Builder(GetEcsLaunchTemplatesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.templateResourceGroupId = defaults.templateResourceGroupId;
    	      this.templateTags = defaults.templateTags;
    	      this.templates = defaults.templates;
        }

        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {

            this.enableDetails = enableDetails;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEcsLaunchTemplatesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetEcsLaunchTemplatesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder launchTemplateName(@Nullable String launchTemplateName) {

            this.launchTemplateName = launchTemplateName;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetEcsLaunchTemplatesResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder templateResourceGroupId(@Nullable String templateResourceGroupId) {

            this.templateResourceGroupId = templateResourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder templateTags(@Nullable Map<String,String> templateTags) {

            this.templateTags = templateTags;
            return this;
        }
        @CustomType.Setter
        public Builder templates(List<GetEcsLaunchTemplatesTemplate> templates) {
            if (templates == null) {
              throw new MissingRequiredPropertyException("GetEcsLaunchTemplatesResult", "templates");
            }
            this.templates = templates;
            return this;
        }
        public Builder templates(GetEcsLaunchTemplatesTemplate... templates) {
            return templates(List.of(templates));
        }
        public GetEcsLaunchTemplatesResult build() {
            final var _resultValue = new GetEcsLaunchTemplatesResult();
            _resultValue.enableDetails = enableDetails;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.launchTemplateName = launchTemplateName;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.templateResourceGroupId = templateResourceGroupId;
            _resultValue.templateTags = templateTags;
            _resultValue.templates = templates;
            return _resultValue;
        }
    }
}
