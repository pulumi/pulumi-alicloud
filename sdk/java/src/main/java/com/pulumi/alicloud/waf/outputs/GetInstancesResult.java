// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.waf.outputs;

import com.pulumi.alicloud.waf.outputs.GetInstancesInstance;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstancesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Optional) A list of WAF instance IDs.
     * 
     */
    private List<String> ids;
    private @Nullable String instanceSource;
    /**
     * @return A list of WAF instances. Each element contains the following attributes:
     * 
     */
    private List<GetInstancesInstance> instances;
    private @Nullable String outputFile;
    private @Nullable String resourceGroupId;
    /**
     * @return Indicates whether the WAF instance has expired.
     * 
     */
    private @Nullable Integer status;

    private GetInstancesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Optional) A list of WAF instance IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> instanceSource() {
        return Optional.ofNullable(this.instanceSource);
    }
    /**
     * @return A list of WAF instances. Each element contains the following attributes:
     * 
     */
    public List<GetInstancesInstance> instances() {
        return this.instances;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }
    /**
     * @return Indicates whether the WAF instance has expired.
     * 
     */
    public Optional<Integer> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String instanceSource;
        private List<GetInstancesInstance> instances;
        private @Nullable String outputFile;
        private @Nullable String resourceGroupId;
        private @Nullable Integer status;
        public Builder() {}
        public Builder(GetInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceSource = defaults.instanceSource;
    	      this.instances = defaults.instances;
    	      this.outputFile = defaults.outputFile;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInstancesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetInstancesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instanceSource(@Nullable String instanceSource) {

            this.instanceSource = instanceSource;
            return this;
        }
        @CustomType.Setter
        public Builder instances(List<GetInstancesInstance> instances) {
            if (instances == null) {
              throw new MissingRequiredPropertyException("GetInstancesResult", "instances");
            }
            this.instances = instances;
            return this;
        }
        public Builder instances(GetInstancesInstance... instances) {
            return instances(List.of(instances));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(@Nullable String resourceGroupId) {

            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable Integer status) {

            this.status = status;
            return this;
        }
        public GetInstancesResult build() {
            final var _resultValue = new GetInstancesResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceSource = instanceSource;
            _resultValue.instances = instances;
            _resultValue.outputFile = outputFile;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}