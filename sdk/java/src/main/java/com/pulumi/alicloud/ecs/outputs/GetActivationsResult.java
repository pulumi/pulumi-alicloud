// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetActivationsActivation;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetActivationsResult {
    private List<GetActivationsActivation> activations;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String instanceName;
    private @Nullable String outputFile;
    private @Nullable Integer pageNumber;
    private @Nullable Integer pageSize;
    private Integer totalCount;

    private GetActivationsResult() {}
    public List<GetActivationsActivation> activations() {
        return this.activations;
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
    public Optional<String> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }
    public Integer totalCount() {
        return this.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActivationsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetActivationsActivation> activations;
        private String id;
        private List<String> ids;
        private @Nullable String instanceName;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private Integer totalCount;
        public Builder() {}
        public Builder(GetActivationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activations = defaults.activations;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceName = defaults.instanceName;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.totalCount = defaults.totalCount;
        }

        @CustomType.Setter
        public Builder activations(List<GetActivationsActivation> activations) {
            if (activations == null) {
              throw new MissingRequiredPropertyException("GetActivationsResult", "activations");
            }
            this.activations = activations;
            return this;
        }
        public Builder activations(GetActivationsActivation... activations) {
            return activations(List.of(activations));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetActivationsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetActivationsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instanceName(@Nullable String instanceName) {

            this.instanceName = instanceName;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder pageNumber(@Nullable Integer pageNumber) {

            this.pageNumber = pageNumber;
            return this;
        }
        @CustomType.Setter
        public Builder pageSize(@Nullable Integer pageSize) {

            this.pageSize = pageSize;
            return this;
        }
        @CustomType.Setter
        public Builder totalCount(Integer totalCount) {
            if (totalCount == null) {
              throw new MissingRequiredPropertyException("GetActivationsResult", "totalCount");
            }
            this.totalCount = totalCount;
            return this;
        }
        public GetActivationsResult build() {
            final var _resultValue = new GetActivationsResult();
            _resultValue.activations = activations;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceName = instanceName;
            _resultValue.outputFile = outputFile;
            _resultValue.pageNumber = pageNumber;
            _resultValue.pageSize = pageSize;
            _resultValue.totalCount = totalCount;
            return _resultValue;
        }
    }
}
