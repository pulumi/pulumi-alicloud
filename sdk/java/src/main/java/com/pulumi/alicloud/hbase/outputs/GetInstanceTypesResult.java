// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbase.outputs;

import com.pulumi.alicloud.hbase.outputs.GetInstanceTypesCoreInstanceType;
import com.pulumi.alicloud.hbase.outputs.GetInstanceTypesMasterInstanceType;
import com.pulumi.alicloud.hbase.outputs.GetInstanceTypesType;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceTypesResult {
    private @Nullable String chargeType;
    /**
     * @return (Available in 1.115.0+) A list of core instance types. Each element contains the following attributes:
     * 
     */
    private List<GetInstanceTypesCoreInstanceType> coreInstanceTypes;
    private @Nullable String diskType;
    /**
     * @return Name of the engine.
     * 
     */
    private @Nullable String engine;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of instance types type IDs.
     * 
     */
    private List<String> ids;
    /**
     * @return Name of the instance type.
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return (Available in 1.115.0+) A list of master instance types. Each element contains the following attributes:
     * 
     */
    private List<GetInstanceTypesMasterInstanceType> masterInstanceTypes;
    private @Nullable String outputFile;
    private @Nullable String regionId;
    /**
     * @return (Deprecated) A list of instance types. Each element contains the following attributes:
     * 
     */
    private List<GetInstanceTypesType> types;
    /**
     * @return The version of the engine.
     * 
     */
    private @Nullable String version;
    private @Nullable String zoneId;

    private GetInstanceTypesResult() {}
    public Optional<String> chargeType() {
        return Optional.ofNullable(this.chargeType);
    }
    /**
     * @return (Available in 1.115.0+) A list of core instance types. Each element contains the following attributes:
     * 
     */
    public List<GetInstanceTypesCoreInstanceType> coreInstanceTypes() {
        return this.coreInstanceTypes;
    }
    public Optional<String> diskType() {
        return Optional.ofNullable(this.diskType);
    }
    /**
     * @return Name of the engine.
     * 
     */
    public Optional<String> engine() {
        return Optional.ofNullable(this.engine);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of instance types type IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return Name of the instance type.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return (Available in 1.115.0+) A list of master instance types. Each element contains the following attributes:
     * 
     */
    public List<GetInstanceTypesMasterInstanceType> masterInstanceTypes() {
        return this.masterInstanceTypes;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> regionId() {
        return Optional.ofNullable(this.regionId);
    }
    /**
     * @return (Deprecated) A list of instance types. Each element contains the following attributes:
     * 
     */
    public List<GetInstanceTypesType> types() {
        return this.types;
    }
    /**
     * @return The version of the engine.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String chargeType;
        private List<GetInstanceTypesCoreInstanceType> coreInstanceTypes;
        private @Nullable String diskType;
        private @Nullable String engine;
        private String id;
        private List<String> ids;
        private @Nullable String instanceType;
        private List<GetInstanceTypesMasterInstanceType> masterInstanceTypes;
        private @Nullable String outputFile;
        private @Nullable String regionId;
        private List<GetInstanceTypesType> types;
        private @Nullable String version;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(GetInstanceTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chargeType = defaults.chargeType;
    	      this.coreInstanceTypes = defaults.coreInstanceTypes;
    	      this.diskType = defaults.diskType;
    	      this.engine = defaults.engine;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceType = defaults.instanceType;
    	      this.masterInstanceTypes = defaults.masterInstanceTypes;
    	      this.outputFile = defaults.outputFile;
    	      this.regionId = defaults.regionId;
    	      this.types = defaults.types;
    	      this.version = defaults.version;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder chargeType(@Nullable String chargeType) {

            this.chargeType = chargeType;
            return this;
        }
        @CustomType.Setter
        public Builder coreInstanceTypes(List<GetInstanceTypesCoreInstanceType> coreInstanceTypes) {
            if (coreInstanceTypes == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesResult", "coreInstanceTypes");
            }
            this.coreInstanceTypes = coreInstanceTypes;
            return this;
        }
        public Builder coreInstanceTypes(GetInstanceTypesCoreInstanceType... coreInstanceTypes) {
            return coreInstanceTypes(List.of(coreInstanceTypes));
        }
        @CustomType.Setter
        public Builder diskType(@Nullable String diskType) {

            this.diskType = diskType;
            return this;
        }
        @CustomType.Setter
        public Builder engine(@Nullable String engine) {

            this.engine = engine;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {

            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder masterInstanceTypes(List<GetInstanceTypesMasterInstanceType> masterInstanceTypes) {
            if (masterInstanceTypes == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesResult", "masterInstanceTypes");
            }
            this.masterInstanceTypes = masterInstanceTypes;
            return this;
        }
        public Builder masterInstanceTypes(GetInstanceTypesMasterInstanceType... masterInstanceTypes) {
            return masterInstanceTypes(List.of(masterInstanceTypes));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder regionId(@Nullable String regionId) {

            this.regionId = regionId;
            return this;
        }
        @CustomType.Setter
        public Builder types(List<GetInstanceTypesType> types) {
            if (types == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesResult", "types");
            }
            this.types = types;
            return this;
        }
        public Builder types(GetInstanceTypesType... types) {
            return types(List.of(types));
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {

            this.zoneId = zoneId;
            return this;
        }
        public GetInstanceTypesResult build() {
            final var _resultValue = new GetInstanceTypesResult();
            _resultValue.chargeType = chargeType;
            _resultValue.coreInstanceTypes = coreInstanceTypes;
            _resultValue.diskType = diskType;
            _resultValue.engine = engine;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceType = instanceType;
            _resultValue.masterInstanceTypes = masterInstanceTypes;
            _resultValue.outputFile = outputFile;
            _resultValue.regionId = regionId;
            _resultValue.types = types;
            _resultValue.version = version;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}