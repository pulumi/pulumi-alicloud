// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.compute.outputs;

import com.pulumi.alicloud.compute.outputs.GetNestServiceInstancesFilter;
import com.pulumi.alicloud.compute.outputs.GetNestServiceInstancesServiceInstance;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNestServiceInstancesResult {
    private @Nullable List<GetNestServiceInstancesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    /**
     * @return A list of Service Instance names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return A list of Service Instances. Each element contains the following attributes:
     * 
     */
    private List<GetNestServiceInstancesServiceInstance> serviceInstances;
    /**
     * @return The status of the Service Instance.
     * 
     */
    private @Nullable String status;
    /**
     * @return The tag of the Service Instance.
     * 
     */
    private @Nullable Map<String,String> tags;

    private GetNestServiceInstancesResult() {}
    public List<GetNestServiceInstancesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
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
    /**
     * @return A list of Service Instance names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of Service Instances. Each element contains the following attributes:
     * 
     */
    public List<GetNestServiceInstancesServiceInstance> serviceInstances() {
        return this.serviceInstances;
    }
    /**
     * @return The status of the Service Instance.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The tag of the Service Instance.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNestServiceInstancesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetNestServiceInstancesFilter> filters;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetNestServiceInstancesServiceInstance> serviceInstances;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        public Builder() {}
        public Builder(GetNestServiceInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.serviceInstances = defaults.serviceInstances;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetNestServiceInstancesFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetNestServiceInstancesFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNestServiceInstancesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetNestServiceInstancesResult", "ids");
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
              throw new MissingRequiredPropertyException("GetNestServiceInstancesResult", "names");
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
        public Builder serviceInstances(List<GetNestServiceInstancesServiceInstance> serviceInstances) {
            if (serviceInstances == null) {
              throw new MissingRequiredPropertyException("GetNestServiceInstancesResult", "serviceInstances");
            }
            this.serviceInstances = serviceInstances;
            return this;
        }
        public Builder serviceInstances(GetNestServiceInstancesServiceInstance... serviceInstances) {
            return serviceInstances(List.of(serviceInstances));
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {

            this.tags = tags;
            return this;
        }
        public GetNestServiceInstancesResult build() {
            final var _resultValue = new GetNestServiceInstancesResult();
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.serviceInstances = serviceInstances;
            _resultValue.status = status;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
