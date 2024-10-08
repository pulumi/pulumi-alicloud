// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.alicloud.ess.outputs.GetScalingRulesRule;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScalingRulesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of scaling rule ids.
     * 
     */
    private List<String> ids;
    private @Nullable String nameRegex;
    /**
     * @return A list of scaling rule names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return A list of scaling rules. Each element contains the following attributes:
     * 
     */
    private List<GetScalingRulesRule> rules;
    /**
     * @return ID of the scaling group.
     * 
     */
    private @Nullable String scalingGroupId;
    /**
     * @return Type of the scaling rule.
     * 
     */
    private @Nullable String type;

    private GetScalingRulesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of scaling rule ids.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of scaling rule names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of scaling rules. Each element contains the following attributes:
     * 
     */
    public List<GetScalingRulesRule> rules() {
        return this.rules;
    }
    /**
     * @return ID of the scaling group.
     * 
     */
    public Optional<String> scalingGroupId() {
        return Optional.ofNullable(this.scalingGroupId);
    }
    /**
     * @return Type of the scaling rule.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScalingRulesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetScalingRulesRule> rules;
        private @Nullable String scalingGroupId;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetScalingRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.rules = defaults.rules;
    	      this.scalingGroupId = defaults.scalingGroupId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetScalingRulesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetScalingRulesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetScalingRulesResult", "names");
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
        public Builder rules(List<GetScalingRulesRule> rules) {
            if (rules == null) {
              throw new MissingRequiredPropertyException("GetScalingRulesResult", "rules");
            }
            this.rules = rules;
            return this;
        }
        public Builder rules(GetScalingRulesRule... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder scalingGroupId(@Nullable String scalingGroupId) {

            this.scalingGroupId = scalingGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public GetScalingRulesResult build() {
            final var _resultValue = new GetScalingRulesResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.rules = rules;
            _resultValue.scalingGroupId = scalingGroupId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
