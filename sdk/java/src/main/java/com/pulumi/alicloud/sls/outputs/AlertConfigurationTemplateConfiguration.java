// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sls.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertConfigurationTemplateConfiguration {
    /**
     * @return Template Annotations.
     * 
     */
    private @Nullable Map<String,String> annotations;
    /**
     * @return Template Language.
     * 
     */
    private @Nullable String lang;
    /**
     * @return Template ID.
     * 
     */
    private @Nullable String templateId;
    /**
     * @return Template Variables.
     * 
     */
    private @Nullable Map<String,String> tokens;
    private @Nullable String type;
    /**
     * @return Template Version.
     * 
     */
    private @Nullable String version;

    private AlertConfigurationTemplateConfiguration() {}
    /**
     * @return Template Annotations.
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations == null ? Map.of() : this.annotations;
    }
    /**
     * @return Template Language.
     * 
     */
    public Optional<String> lang() {
        return Optional.ofNullable(this.lang);
    }
    /**
     * @return Template ID.
     * 
     */
    public Optional<String> templateId() {
        return Optional.ofNullable(this.templateId);
    }
    /**
     * @return Template Variables.
     * 
     */
    public Map<String,String> tokens() {
        return this.tokens == null ? Map.of() : this.tokens;
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Template Version.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertConfigurationTemplateConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> annotations;
        private @Nullable String lang;
        private @Nullable String templateId;
        private @Nullable Map<String,String> tokens;
        private @Nullable String type;
        private @Nullable String version;
        public Builder() {}
        public Builder(AlertConfigurationTemplateConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.lang = defaults.lang;
    	      this.templateId = defaults.templateId;
    	      this.tokens = defaults.tokens;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder annotations(@Nullable Map<String,String> annotations) {

            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder lang(@Nullable String lang) {

            this.lang = lang;
            return this;
        }
        @CustomType.Setter
        public Builder templateId(@Nullable String templateId) {

            this.templateId = templateId;
            return this;
        }
        @CustomType.Setter
        public Builder tokens(@Nullable Map<String,String> tokens) {

            this.tokens = tokens;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        public AlertConfigurationTemplateConfiguration build() {
            final var _resultValue = new AlertConfigurationTemplateConfiguration();
            _resultValue.annotations = annotations;
            _resultValue.lang = lang;
            _resultValue.templateId = templateId;
            _resultValue.tokens = tokens;
            _resultValue.type = type;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
