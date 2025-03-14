// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.alicloud.dns.outputs.GetGtmInstancesInstance;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGtmInstancesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private List<GetGtmInstancesInstance> instances;
    private @Nullable String lang;
    private String outputFile;
    private @Nullable String resourceGroupId;

    private GetGtmInstancesResult() {}
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
    public List<GetGtmInstancesInstance> instances() {
        return this.instances;
    }
    public Optional<String> lang() {
        return Optional.ofNullable(this.lang);
    }
    public String outputFile() {
        return this.outputFile;
    }
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGtmInstancesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private List<GetGtmInstancesInstance> instances;
        private @Nullable String lang;
        private String outputFile;
        private @Nullable String resourceGroupId;
        public Builder() {}
        public Builder(GetGtmInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instances = defaults.instances;
    	      this.lang = defaults.lang;
    	      this.outputFile = defaults.outputFile;
    	      this.resourceGroupId = defaults.resourceGroupId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGtmInstancesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetGtmInstancesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instances(List<GetGtmInstancesInstance> instances) {
            if (instances == null) {
              throw new MissingRequiredPropertyException("GetGtmInstancesResult", "instances");
            }
            this.instances = instances;
            return this;
        }
        public Builder instances(GetGtmInstancesInstance... instances) {
            return instances(List.of(instances));
        }
        @CustomType.Setter
        public Builder lang(@Nullable String lang) {

            this.lang = lang;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(String outputFile) {
            if (outputFile == null) {
              throw new MissingRequiredPropertyException("GetGtmInstancesResult", "outputFile");
            }
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(@Nullable String resourceGroupId) {

            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public GetGtmInstancesResult build() {
            final var _resultValue = new GetGtmInstancesResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instances = instances;
            _resultValue.lang = lang;
            _resultValue.outputFile = outputFile;
            _resultValue.resourceGroupId = resourceGroupId;
            return _resultValue;
        }
    }
}
