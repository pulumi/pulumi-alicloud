// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sddp.outputs;

import com.pulumi.alicloud.sddp.outputs.GetDataLimitsLimit;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDataLimitsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private List<GetDataLimitsLimit> limits;
    private @Nullable String outputFile;
    private @Nullable String parentId;
    private @Nullable String resourceType;

    private GetDataLimitsResult() {}
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
    public List<GetDataLimitsLimit> limits() {
        return this.limits;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> parentId() {
        return Optional.ofNullable(this.parentId);
    }
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataLimitsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private List<GetDataLimitsLimit> limits;
        private @Nullable String outputFile;
        private @Nullable String parentId;
        private @Nullable String resourceType;
        public Builder() {}
        public Builder(GetDataLimitsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.limits = defaults.limits;
    	      this.outputFile = defaults.outputFile;
    	      this.parentId = defaults.parentId;
    	      this.resourceType = defaults.resourceType;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder limits(List<GetDataLimitsLimit> limits) {
            if (limits == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsResult", "limits");
            }
            this.limits = limits;
            return this;
        }
        public Builder limits(GetDataLimitsLimit... limits) {
            return limits(List.of(limits));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder parentId(@Nullable String parentId) {

            this.parentId = parentId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(@Nullable String resourceType) {

            this.resourceType = resourceType;
            return this;
        }
        public GetDataLimitsResult build() {
            final var _resultValue = new GetDataLimitsResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.limits = limits;
            _resultValue.outputFile = outputFile;
            _resultValue.parentId = parentId;
            _resultValue.resourceType = resourceType;
            return _resultValue;
        }
    }
}