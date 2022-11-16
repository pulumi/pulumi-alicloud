// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.outputs;

import com.pulumi.alicloud.rds.outputs.GetInstanceClassesInstanceClass;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceClassesResult {
    private final @Nullable String category;
    private final @Nullable String commodityCode;
    private final @Nullable String dbInstanceClass;
    private final @Nullable String dbInstanceId;
    private final @Nullable String dbInstanceStorageType;
    private final @Nullable String engine;
    private final @Nullable String engineVersion;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return (Available in 1.60.0+) A list of Rds instance class codes.
     * 
     */
    private final List<String> ids;
    private final @Nullable String instanceChargeType;
    /**
     * @return A list of Rds available resource. Each element contains the following attributes:
     * 
     */
    private final List<GetInstanceClassesInstanceClass> instanceClasses;
    private final @Nullable Boolean multiZone;
    private final @Nullable String outputFile;
    private final @Nullable String sortedBy;
    private final @Nullable String storageType;
    private final @Nullable String zoneId;

    @CustomType.Constructor
    private GetInstanceClassesResult(
        @CustomType.Parameter("category") @Nullable String category,
        @CustomType.Parameter("commodityCode") @Nullable String commodityCode,
        @CustomType.Parameter("dbInstanceClass") @Nullable String dbInstanceClass,
        @CustomType.Parameter("dbInstanceId") @Nullable String dbInstanceId,
        @CustomType.Parameter("dbInstanceStorageType") @Nullable String dbInstanceStorageType,
        @CustomType.Parameter("engine") @Nullable String engine,
        @CustomType.Parameter("engineVersion") @Nullable String engineVersion,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instanceChargeType") @Nullable String instanceChargeType,
        @CustomType.Parameter("instanceClasses") List<GetInstanceClassesInstanceClass> instanceClasses,
        @CustomType.Parameter("multiZone") @Nullable Boolean multiZone,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("sortedBy") @Nullable String sortedBy,
        @CustomType.Parameter("storageType") @Nullable String storageType,
        @CustomType.Parameter("zoneId") @Nullable String zoneId) {
        this.category = category;
        this.commodityCode = commodityCode;
        this.dbInstanceClass = dbInstanceClass;
        this.dbInstanceId = dbInstanceId;
        this.dbInstanceStorageType = dbInstanceStorageType;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.id = id;
        this.ids = ids;
        this.instanceChargeType = instanceChargeType;
        this.instanceClasses = instanceClasses;
        this.multiZone = multiZone;
        this.outputFile = outputFile;
        this.sortedBy = sortedBy;
        this.storageType = storageType;
        this.zoneId = zoneId;
    }

    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    public Optional<String> commodityCode() {
        return Optional.ofNullable(this.commodityCode);
    }
    public Optional<String> dbInstanceClass() {
        return Optional.ofNullable(this.dbInstanceClass);
    }
    public Optional<String> dbInstanceId() {
        return Optional.ofNullable(this.dbInstanceId);
    }
    public Optional<String> dbInstanceStorageType() {
        return Optional.ofNullable(this.dbInstanceStorageType);
    }
    public Optional<String> engine() {
        return Optional.ofNullable(this.engine);
    }
    public Optional<String> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Available in 1.60.0+) A list of Rds instance class codes.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> instanceChargeType() {
        return Optional.ofNullable(this.instanceChargeType);
    }
    /**
     * @return A list of Rds available resource. Each element contains the following attributes:
     * 
     */
    public List<GetInstanceClassesInstanceClass> instanceClasses() {
        return this.instanceClasses;
    }
    public Optional<Boolean> multiZone() {
        return Optional.ofNullable(this.multiZone);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> sortedBy() {
        return Optional.ofNullable(this.sortedBy);
    }
    public Optional<String> storageType() {
        return Optional.ofNullable(this.storageType);
    }
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceClassesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String category;
        private @Nullable String commodityCode;
        private @Nullable String dbInstanceClass;
        private @Nullable String dbInstanceId;
        private @Nullable String dbInstanceStorageType;
        private @Nullable String engine;
        private @Nullable String engineVersion;
        private String id;
        private List<String> ids;
        private @Nullable String instanceChargeType;
        private List<GetInstanceClassesInstanceClass> instanceClasses;
        private @Nullable Boolean multiZone;
        private @Nullable String outputFile;
        private @Nullable String sortedBy;
        private @Nullable String storageType;
        private @Nullable String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceClassesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.commodityCode = defaults.commodityCode;
    	      this.dbInstanceClass = defaults.dbInstanceClass;
    	      this.dbInstanceId = defaults.dbInstanceId;
    	      this.dbInstanceStorageType = defaults.dbInstanceStorageType;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceChargeType = defaults.instanceChargeType;
    	      this.instanceClasses = defaults.instanceClasses;
    	      this.multiZone = defaults.multiZone;
    	      this.outputFile = defaults.outputFile;
    	      this.sortedBy = defaults.sortedBy;
    	      this.storageType = defaults.storageType;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        public Builder commodityCode(@Nullable String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public Builder dbInstanceClass(@Nullable String dbInstanceClass) {
            this.dbInstanceClass = dbInstanceClass;
            return this;
        }
        public Builder dbInstanceId(@Nullable String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public Builder dbInstanceStorageType(@Nullable String dbInstanceStorageType) {
            this.dbInstanceStorageType = dbInstanceStorageType;
            return this;
        }
        public Builder engine(@Nullable String engine) {
            this.engine = engine;
            return this;
        }
        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder instanceChargeType(@Nullable String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public Builder instanceClasses(List<GetInstanceClassesInstanceClass> instanceClasses) {
            this.instanceClasses = Objects.requireNonNull(instanceClasses);
            return this;
        }
        public Builder instanceClasses(GetInstanceClassesInstanceClass... instanceClasses) {
            return instanceClasses(List.of(instanceClasses));
        }
        public Builder multiZone(@Nullable Boolean multiZone) {
            this.multiZone = multiZone;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder sortedBy(@Nullable String sortedBy) {
            this.sortedBy = sortedBy;
            return this;
        }
        public Builder storageType(@Nullable String storageType) {
            this.storageType = storageType;
            return this;
        }
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }        public GetInstanceClassesResult build() {
            return new GetInstanceClassesResult(category, commodityCode, dbInstanceClass, dbInstanceId, dbInstanceStorageType, engine, engineVersion, id, ids, instanceChargeType, instanceClasses, multiZone, outputFile, sortedBy, storageType, zoneId);
        }
    }
}