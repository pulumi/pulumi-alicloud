// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceDataDisk {
    /**
     * @return The ID of the automatic snapshot policy applied to the system disk.
     * 
     */
    private final @Nullable String autoSnapshotPolicyId;
    /**
     * @return The category of the disk:
     * - `cloud`: The general cloud disk.
     * - `cloud_efficiency`: The efficiency cloud disk.
     * - `cloud_ssd`: The SSD cloud disk.
     * - `cloud_essd`: The ESSD cloud disk.
     * - `ephemeral_ssd`: The local SSD disk.
     *   Default to `cloud_efficiency`.
     * 
     */
    private final @Nullable String category;
    /**
     * @return Delete this data disk when the instance is destroyed. It only works on cloud, cloud_efficiency, cloud_essd, cloud_ssd disk. If the category of this data disk was ephemeral_ssd, please don&#39;t set this param. Default value: `true`.
     * 
     */
    private final @Nullable Boolean deleteWithInstance;
    /**
     * @return The description of the data disk.
     * 
     */
    private final @Nullable String description;
    /**
     * @return -(Optional, Bool, ForceNew) Encrypted the data in this disk. Default value: `false`.
     * 
     */
    private final @Nullable Boolean encrypted;
    /**
     * @return The KMS key ID corresponding to the Nth data disk.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * @return The name of the data disk.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The performance level of the ESSD used as data disk:
     * - `PL0`: A single ESSD can deliver up to 10,000 random read/write IOPS.
     * - `PL1`: A single ESSD can deliver up to 50,000 random read/write IOPS.
     * - `PL2`: A single ESSD can deliver up to 100,000 random read/write IOPS.
     * - `PL3`: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
     *   Default to `PL1`.
     * 
     */
    private final @Nullable String performanceLevel;
    /**
     * @return The size of the data disk.
     * - cloud：[5, 2000]
     * - cloud_efficiency：[20, 32768]
     * - cloud_ssd：[20, 32768]
     * - cloud_essd：[20, 32768]
     * - ephemeral_ssd: [5, 800]
     * 
     */
    private final Integer size;
    /**
     * @return The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
     * 
     */
    private final @Nullable String snapshotId;

    @CustomType.Constructor
    private InstanceDataDisk(
        @CustomType.Parameter("autoSnapshotPolicyId") @Nullable String autoSnapshotPolicyId,
        @CustomType.Parameter("category") @Nullable String category,
        @CustomType.Parameter("deleteWithInstance") @Nullable Boolean deleteWithInstance,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encrypted") @Nullable Boolean encrypted,
        @CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("performanceLevel") @Nullable String performanceLevel,
        @CustomType.Parameter("size") Integer size,
        @CustomType.Parameter("snapshotId") @Nullable String snapshotId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        this.category = category;
        this.deleteWithInstance = deleteWithInstance;
        this.description = description;
        this.encrypted = encrypted;
        this.kmsKeyId = kmsKeyId;
        this.name = name;
        this.performanceLevel = performanceLevel;
        this.size = size;
        this.snapshotId = snapshotId;
    }

    /**
     * @return The ID of the automatic snapshot policy applied to the system disk.
     * 
     */
    public Optional<String> autoSnapshotPolicyId() {
        return Optional.ofNullable(this.autoSnapshotPolicyId);
    }
    /**
     * @return The category of the disk:
     * - `cloud`: The general cloud disk.
     * - `cloud_efficiency`: The efficiency cloud disk.
     * - `cloud_ssd`: The SSD cloud disk.
     * - `cloud_essd`: The ESSD cloud disk.
     * - `ephemeral_ssd`: The local SSD disk.
     *   Default to `cloud_efficiency`.
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    /**
     * @return Delete this data disk when the instance is destroyed. It only works on cloud, cloud_efficiency, cloud_essd, cloud_ssd disk. If the category of this data disk was ephemeral_ssd, please don&#39;t set this param. Default value: `true`.
     * 
     */
    public Optional<Boolean> deleteWithInstance() {
        return Optional.ofNullable(this.deleteWithInstance);
    }
    /**
     * @return The description of the data disk.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return -(Optional, Bool, ForceNew) Encrypted the data in this disk. Default value: `false`.
     * 
     */
    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * @return The KMS key ID corresponding to the Nth data disk.
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * @return The name of the data disk.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The performance level of the ESSD used as data disk:
     * - `PL0`: A single ESSD can deliver up to 10,000 random read/write IOPS.
     * - `PL1`: A single ESSD can deliver up to 50,000 random read/write IOPS.
     * - `PL2`: A single ESSD can deliver up to 100,000 random read/write IOPS.
     * - `PL3`: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
     *   Default to `PL1`.
     * 
     */
    public Optional<String> performanceLevel() {
        return Optional.ofNullable(this.performanceLevel);
    }
    /**
     * @return The size of the data disk.
     * - cloud：[5, 2000]
     * - cloud_efficiency：[20, 32768]
     * - cloud_ssd：[20, 32768]
     * - cloud_essd：[20, 32768]
     * - ephemeral_ssd: [5, 800]
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
     * 
     */
    public Optional<String> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceDataDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String autoSnapshotPolicyId;
        private @Nullable String category;
        private @Nullable Boolean deleteWithInstance;
        private @Nullable String description;
        private @Nullable Boolean encrypted;
        private @Nullable String kmsKeyId;
        private @Nullable String name;
        private @Nullable String performanceLevel;
        private Integer size;
        private @Nullable String snapshotId;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceDataDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoSnapshotPolicyId = defaults.autoSnapshotPolicyId;
    	      this.category = defaults.category;
    	      this.deleteWithInstance = defaults.deleteWithInstance;
    	      this.description = defaults.description;
    	      this.encrypted = defaults.encrypted;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.name = defaults.name;
    	      this.performanceLevel = defaults.performanceLevel;
    	      this.size = defaults.size;
    	      this.snapshotId = defaults.snapshotId;
        }

        public Builder autoSnapshotPolicyId(@Nullable String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        public Builder deleteWithInstance(@Nullable Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder performanceLevel(@Nullable String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }        public InstanceDataDisk build() {
            return new InstanceDataDisk(autoSnapshotPolicyId, category, deleteWithInstance, description, encrypted, kmsKeyId, name, performanceLevel, size, snapshotId);
        }
    }
}