// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClassDetailsResult {
    /**
     * @return The RDS edition of the instance. Valid values:
     * * **Basic**: Basic Edition.
     * * **HighAvailability**: High-availability Edition.
     * * **AlwaysOn**: Cluster Edition.
     * * **Finance**: Enterprise Edition.
     * 
     */
    private String category;
    private String classCode;
    /**
     * @return The specification family.
     * 
     */
    private String classGroup;
    private String commodityCode;
    /**
     * @return The number of CPU cores corresponding to the instance specification. Unit: pieces.
     * 
     */
    private String cpu;
    /**
     * @return The storage type of the instance. Valid values:
     * * **local_ssd**: specifies to use local SSDs.
     * * **cloud_ssd**: specifies to use standard SSDs.
     * * **cloud_essd**: specifies to use enhanced SSDs (ESSDs).
     * * **cloud_essd2**: specifies to use enhanced SSDs (ESSDs).
     * * **cloud_essd3**: specifies to use enhanced SSDs (ESSDs).
     * 
     */
    private String dbInstanceStorageType;
    private String engine;
    private String engineVersion;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The architecture of the instance type.
     * 
     */
    private String instructionSetArch;
    /**
     * @return The maximum number of connections.
     * 
     */
    private String maxConnections;
    /**
     * @return The maximum IO bandwidth corresponding to the instance specification. Unit: Mbps.
     * 
     */
    private String maxIombps;
    /**
     * @return The maximum IOPS of the instance.
     * 
     */
    private String maxIops;
    /**
     * @return The memory capacity that is supported by the instance type. Unit: GB.
     * 
     */
    private String memoryClass;
    /**
     * @return The fee that you must pay for the instance type. Unit: cent (RMB).
     * 
     */
    private String referencePrice;

    private GetClassDetailsResult() {}
    /**
     * @return The RDS edition of the instance. Valid values:
     * * **Basic**: Basic Edition.
     * * **HighAvailability**: High-availability Edition.
     * * **AlwaysOn**: Cluster Edition.
     * * **Finance**: Enterprise Edition.
     * 
     */
    public String category() {
        return this.category;
    }
    public String classCode() {
        return this.classCode;
    }
    /**
     * @return The specification family.
     * 
     */
    public String classGroup() {
        return this.classGroup;
    }
    public String commodityCode() {
        return this.commodityCode;
    }
    /**
     * @return The number of CPU cores corresponding to the instance specification. Unit: pieces.
     * 
     */
    public String cpu() {
        return this.cpu;
    }
    /**
     * @return The storage type of the instance. Valid values:
     * * **local_ssd**: specifies to use local SSDs.
     * * **cloud_ssd**: specifies to use standard SSDs.
     * * **cloud_essd**: specifies to use enhanced SSDs (ESSDs).
     * * **cloud_essd2**: specifies to use enhanced SSDs (ESSDs).
     * * **cloud_essd3**: specifies to use enhanced SSDs (ESSDs).
     * 
     */
    public String dbInstanceStorageType() {
        return this.dbInstanceStorageType;
    }
    public String engine() {
        return this.engine;
    }
    public String engineVersion() {
        return this.engineVersion;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The architecture of the instance type.
     * 
     */
    public String instructionSetArch() {
        return this.instructionSetArch;
    }
    /**
     * @return The maximum number of connections.
     * 
     */
    public String maxConnections() {
        return this.maxConnections;
    }
    /**
     * @return The maximum IO bandwidth corresponding to the instance specification. Unit: Mbps.
     * 
     */
    public String maxIombps() {
        return this.maxIombps;
    }
    /**
     * @return The maximum IOPS of the instance.
     * 
     */
    public String maxIops() {
        return this.maxIops;
    }
    /**
     * @return The memory capacity that is supported by the instance type. Unit: GB.
     * 
     */
    public String memoryClass() {
        return this.memoryClass;
    }
    /**
     * @return The fee that you must pay for the instance type. Unit: cent (RMB).
     * 
     */
    public String referencePrice() {
        return this.referencePrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClassDetailsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String category;
        private String classCode;
        private String classGroup;
        private String commodityCode;
        private String cpu;
        private String dbInstanceStorageType;
        private String engine;
        private String engineVersion;
        private String id;
        private String instructionSetArch;
        private String maxConnections;
        private String maxIombps;
        private String maxIops;
        private String memoryClass;
        private String referencePrice;
        public Builder() {}
        public Builder(GetClassDetailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.classCode = defaults.classCode;
    	      this.classGroup = defaults.classGroup;
    	      this.commodityCode = defaults.commodityCode;
    	      this.cpu = defaults.cpu;
    	      this.dbInstanceStorageType = defaults.dbInstanceStorageType;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.instructionSetArch = defaults.instructionSetArch;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxIombps = defaults.maxIombps;
    	      this.maxIops = defaults.maxIops;
    	      this.memoryClass = defaults.memoryClass;
    	      this.referencePrice = defaults.referencePrice;
        }

        @CustomType.Setter
        public Builder category(String category) {
            if (category == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "category");
            }
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder classCode(String classCode) {
            if (classCode == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "classCode");
            }
            this.classCode = classCode;
            return this;
        }
        @CustomType.Setter
        public Builder classGroup(String classGroup) {
            if (classGroup == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "classGroup");
            }
            this.classGroup = classGroup;
            return this;
        }
        @CustomType.Setter
        public Builder commodityCode(String commodityCode) {
            if (commodityCode == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "commodityCode");
            }
            this.commodityCode = commodityCode;
            return this;
        }
        @CustomType.Setter
        public Builder cpu(String cpu) {
            if (cpu == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "cpu");
            }
            this.cpu = cpu;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceStorageType(String dbInstanceStorageType) {
            if (dbInstanceStorageType == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "dbInstanceStorageType");
            }
            this.dbInstanceStorageType = dbInstanceStorageType;
            return this;
        }
        @CustomType.Setter
        public Builder engine(String engine) {
            if (engine == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "engine");
            }
            this.engine = engine;
            return this;
        }
        @CustomType.Setter
        public Builder engineVersion(String engineVersion) {
            if (engineVersion == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "engineVersion");
            }
            this.engineVersion = engineVersion;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instructionSetArch(String instructionSetArch) {
            if (instructionSetArch == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "instructionSetArch");
            }
            this.instructionSetArch = instructionSetArch;
            return this;
        }
        @CustomType.Setter
        public Builder maxConnections(String maxConnections) {
            if (maxConnections == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "maxConnections");
            }
            this.maxConnections = maxConnections;
            return this;
        }
        @CustomType.Setter
        public Builder maxIombps(String maxIombps) {
            if (maxIombps == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "maxIombps");
            }
            this.maxIombps = maxIombps;
            return this;
        }
        @CustomType.Setter
        public Builder maxIops(String maxIops) {
            if (maxIops == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "maxIops");
            }
            this.maxIops = maxIops;
            return this;
        }
        @CustomType.Setter
        public Builder memoryClass(String memoryClass) {
            if (memoryClass == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "memoryClass");
            }
            this.memoryClass = memoryClass;
            return this;
        }
        @CustomType.Setter
        public Builder referencePrice(String referencePrice) {
            if (referencePrice == null) {
              throw new MissingRequiredPropertyException("GetClassDetailsResult", "referencePrice");
            }
            this.referencePrice = referencePrice;
            return this;
        }
        public GetClassDetailsResult build() {
            final var _resultValue = new GetClassDetailsResult();
            _resultValue.category = category;
            _resultValue.classCode = classCode;
            _resultValue.classGroup = classGroup;
            _resultValue.commodityCode = commodityCode;
            _resultValue.cpu = cpu;
            _resultValue.dbInstanceStorageType = dbInstanceStorageType;
            _resultValue.engine = engine;
            _resultValue.engineVersion = engineVersion;
            _resultValue.id = id;
            _resultValue.instructionSetArch = instructionSetArch;
            _resultValue.maxConnections = maxConnections;
            _resultValue.maxIombps = maxIombps;
            _resultValue.maxIops = maxIops;
            _resultValue.memoryClass = memoryClass;
            _resultValue.referencePrice = referencePrice;
            return _resultValue;
        }
    }
}