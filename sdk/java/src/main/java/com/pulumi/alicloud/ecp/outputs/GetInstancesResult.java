// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecp.outputs;

import com.pulumi.alicloud.ecp.outputs.GetInstancesInstance;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstancesResult {
    private @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String imageId;
    private @Nullable String instanceName;
    private @Nullable String instanceType;
    private List<GetInstancesInstance> instances;
    private @Nullable String keyPairName;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String paymentType;
    private @Nullable String resolution;
    private @Nullable String status;
    private @Nullable String zoneId;

    private GetInstancesResult() {}
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
    public Optional<String> imageId() {
        return Optional.ofNullable(this.imageId);
    }
    public Optional<String> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    public List<GetInstancesInstance> instances() {
        return this.instances;
    }
    public Optional<String> keyPairName() {
        return Optional.ofNullable(this.keyPairName);
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
    public Optional<String> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }
    public Optional<String> resolution() {
        return Optional.ofNullable(this.resolution);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String imageId;
        private @Nullable String instanceName;
        private @Nullable String instanceType;
        private List<GetInstancesInstance> instances;
        private @Nullable String keyPairName;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String paymentType;
        private @Nullable String resolution;
        private @Nullable String status;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(GetInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.imageId = defaults.imageId;
    	      this.instanceName = defaults.instanceName;
    	      this.instanceType = defaults.instanceType;
    	      this.instances = defaults.instances;
    	      this.keyPairName = defaults.keyPairName;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.paymentType = defaults.paymentType;
    	      this.resolution = defaults.resolution;
    	      this.status = defaults.status;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {

            this.enableDetails = enableDetails;
            return this;
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
        public Builder imageId(@Nullable String imageId) {

            this.imageId = imageId;
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(@Nullable String instanceName) {

            this.instanceName = instanceName;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {

            this.instanceType = instanceType;
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
        public Builder keyPairName(@Nullable String keyPairName) {

            this.keyPairName = keyPairName;
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
              throw new MissingRequiredPropertyException("GetInstancesResult", "names");
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
        public Builder paymentType(@Nullable String paymentType) {

            this.paymentType = paymentType;
            return this;
        }
        @CustomType.Setter
        public Builder resolution(@Nullable String resolution) {

            this.resolution = resolution;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {

            this.zoneId = zoneId;
            return this;
        }
        public GetInstancesResult build() {
            final var _resultValue = new GetInstancesResult();
            _resultValue.enableDetails = enableDetails;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.imageId = imageId;
            _resultValue.instanceName = instanceName;
            _resultValue.instanceType = instanceType;
            _resultValue.instances = instances;
            _resultValue.keyPairName = keyPairName;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.paymentType = paymentType;
            _resultValue.resolution = resolution;
            _resultValue.status = status;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
