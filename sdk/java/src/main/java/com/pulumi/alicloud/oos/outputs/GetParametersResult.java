// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oos.outputs;

import com.pulumi.alicloud.oos.outputs.GetParametersParameter;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetParametersResult {
    private @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String parameterName;
    private List<GetParametersParameter> parameters;
    private @Nullable String resourceGroupId;
    private @Nullable String sortField;
    private @Nullable String sortOrder;
    private @Nullable Map<String,Object> tags;
    private @Nullable String type;

    private GetParametersResult() {}
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
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> parameterName() {
        return Optional.ofNullable(this.parameterName);
    }
    public List<GetParametersParameter> parameters() {
        return this.parameters;
    }
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }
    public Optional<String> sortField() {
        return Optional.ofNullable(this.sortField);
    }
    public Optional<String> sortOrder() {
        return Optional.ofNullable(this.sortOrder);
    }
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetParametersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String parameterName;
        private List<GetParametersParameter> parameters;
        private @Nullable String resourceGroupId;
        private @Nullable String sortField;
        private @Nullable String sortOrder;
        private @Nullable Map<String,Object> tags;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetParametersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.parameterName = defaults.parameterName;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.sortField = defaults.sortField;
    	      this.sortOrder = defaults.sortOrder;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {

            this.enableDetails = enableDetails;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetParametersResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetParametersResult", "ids");
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
              throw new MissingRequiredPropertyException("GetParametersResult", "names");
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
        public Builder parameterName(@Nullable String parameterName) {

            this.parameterName = parameterName;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(List<GetParametersParameter> parameters) {
            if (parameters == null) {
              throw new MissingRequiredPropertyException("GetParametersResult", "parameters");
            }
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(GetParametersParameter... parameters) {
            return parameters(List.of(parameters));
        }
        @CustomType.Setter
        public Builder resourceGroupId(@Nullable String resourceGroupId) {

            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder sortField(@Nullable String sortField) {

            this.sortField = sortField;
            return this;
        }
        @CustomType.Setter
        public Builder sortOrder(@Nullable String sortOrder) {

            this.sortOrder = sortOrder;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,Object> tags) {

            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public GetParametersResult build() {
            final var _resultValue = new GetParametersResult();
            _resultValue.enableDetails = enableDetails;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.parameterName = parameterName;
            _resultValue.parameters = parameters;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.sortField = sortField;
            _resultValue.sortOrder = sortOrder;
            _resultValue.tags = tags;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}