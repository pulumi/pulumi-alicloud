// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKubernetesNodePoolsNodepoolDataDisk {
    /**
     * @return Whether to automatically mount the data disk. Valid values: true and false.
     * 
     */
    private String autoFormat;
    /**
     * @return The ID of the automatic snapshot policy that you want to apply to the system disk.
     * 
     */
    private String autoSnapshotPolicyId;
    /**
     * @return Whether the data disk is enabled with Burst (performance Burst). This is configured when the disk type is cloud_auto.
     * 
     */
    private Boolean burstingEnabled;
    /**
     * @return The type of data disk. Default value: `cloud_efficiency`. Valid values:- `cloud`: basic disk.- `cloud_efficiency`: ultra disk.- `cloud_ssd`: standard SSD.- `cloud_essd`: Enterprise SSD (ESSD).- `cloud_auto`: ESSD AutoPL disk.- `cloud_essd_entry`: ESSD Entry disk.- `elastic_ephemeral_disk_premium`: premium elastic ephemeral disk.- `elastic_ephemeral_disk_standard`: standard elastic ephemeral disk.
     * 
     */
    private String category;
    /**
     * @return The mount target of data disk N. Valid values of N: 1 to 16. If you do not specify this parameter, the system automatically assigns a mount target when Auto Scaling creates ECS instances. The name of the mount target ranges from /dev/xvdb to /dev/xvdz.
     * 
     */
    private String device;
    /**
     * @return Specifies whether to encrypt data disks. Valid values: true and false. Default to `false`.
     * 
     */
    private String encrypted;
    /**
     * @return The type of the mounted file system. Works when auto_format is true. Optional value: `ext4`, `xfs`.
     * 
     */
    private String fileSystem;
    /**
     * @return The kms key id used to encrypt the data disk. It takes effect when `encrypted` is true.
     * 
     */
    private String kmsKeyId;
    /**
     * @return The Mount path. Works when auto_format is true.
     * 
     */
    private String mountTarget;
    /**
     * @return The length is 2~128 English or Chinese characters. It must start with an uppercase or lowr letter or a Chinese character and cannot start with http:// or https. Can contain numbers, colons (:), underscores (_), or dashes (-). It will be overwritten if auto_format is set.
     * 
     */
    private String name;
    /**
     * @return Worker node data disk performance level, when `category` values `cloud_essd`, the optional values are `PL0`, `PL1`, `PL2` or `PL3`, but the specific performance level is related to the disk capacity. For more information, see [Enhanced SSDs](https://www.alibabacloud.com/help/doc-detail/122389.htm). Default is `PL1`.
     * 
     */
    private String performanceLevel;
    /**
     * @return The read/write IOPS preconfigured for the data disk, which is configured when the disk type is cloud_auto.
     * 
     */
    private Integer provisionedIops;
    /**
     * @return The size of a data disk, Its valid value range [40~32768] in GB. Default to `40`.
     * 
     */
    private Integer size;
    /**
     * @return The ID of the snapshot that you want to use to create data disk N. Valid values of N: 1 to 16. If you specify this parameter, DataDisk.N.Size is ignored. The size of the disk is the same as the size of the specified snapshot. If you specify a snapshot that is created on or before July 15, 2013, the operation fails and InvalidSnapshot.TooOld is returned.
     * 
     */
    private String snapshotId;

    private GetKubernetesNodePoolsNodepoolDataDisk() {}
    /**
     * @return Whether to automatically mount the data disk. Valid values: true and false.
     * 
     */
    public String autoFormat() {
        return this.autoFormat;
    }
    /**
     * @return The ID of the automatic snapshot policy that you want to apply to the system disk.
     * 
     */
    public String autoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }
    /**
     * @return Whether the data disk is enabled with Burst (performance Burst). This is configured when the disk type is cloud_auto.
     * 
     */
    public Boolean burstingEnabled() {
        return this.burstingEnabled;
    }
    /**
     * @return The type of data disk. Default value: `cloud_efficiency`. Valid values:- `cloud`: basic disk.- `cloud_efficiency`: ultra disk.- `cloud_ssd`: standard SSD.- `cloud_essd`: Enterprise SSD (ESSD).- `cloud_auto`: ESSD AutoPL disk.- `cloud_essd_entry`: ESSD Entry disk.- `elastic_ephemeral_disk_premium`: premium elastic ephemeral disk.- `elastic_ephemeral_disk_standard`: standard elastic ephemeral disk.
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return The mount target of data disk N. Valid values of N: 1 to 16. If you do not specify this parameter, the system automatically assigns a mount target when Auto Scaling creates ECS instances. The name of the mount target ranges from /dev/xvdb to /dev/xvdz.
     * 
     */
    public String device() {
        return this.device;
    }
    /**
     * @return Specifies whether to encrypt data disks. Valid values: true and false. Default to `false`.
     * 
     */
    public String encrypted() {
        return this.encrypted;
    }
    /**
     * @return The type of the mounted file system. Works when auto_format is true. Optional value: `ext4`, `xfs`.
     * 
     */
    public String fileSystem() {
        return this.fileSystem;
    }
    /**
     * @return The kms key id used to encrypt the data disk. It takes effect when `encrypted` is true.
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * @return The Mount path. Works when auto_format is true.
     * 
     */
    public String mountTarget() {
        return this.mountTarget;
    }
    /**
     * @return The length is 2~128 English or Chinese characters. It must start with an uppercase or lowr letter or a Chinese character and cannot start with http:// or https. Can contain numbers, colons (:), underscores (_), or dashes (-). It will be overwritten if auto_format is set.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Worker node data disk performance level, when `category` values `cloud_essd`, the optional values are `PL0`, `PL1`, `PL2` or `PL3`, but the specific performance level is related to the disk capacity. For more information, see [Enhanced SSDs](https://www.alibabacloud.com/help/doc-detail/122389.htm). Default is `PL1`.
     * 
     */
    public String performanceLevel() {
        return this.performanceLevel;
    }
    /**
     * @return The read/write IOPS preconfigured for the data disk, which is configured when the disk type is cloud_auto.
     * 
     */
    public Integer provisionedIops() {
        return this.provisionedIops;
    }
    /**
     * @return The size of a data disk, Its valid value range [40~32768] in GB. Default to `40`.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return The ID of the snapshot that you want to use to create data disk N. Valid values of N: 1 to 16. If you specify this parameter, DataDisk.N.Size is ignored. The size of the disk is the same as the size of the specified snapshot. If you specify a snapshot that is created on or before July 15, 2013, the operation fails and InvalidSnapshot.TooOld is returned.
     * 
     */
    public String snapshotId() {
        return this.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesNodePoolsNodepoolDataDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoFormat;
        private String autoSnapshotPolicyId;
        private Boolean burstingEnabled;
        private String category;
        private String device;
        private String encrypted;
        private String fileSystem;
        private String kmsKeyId;
        private String mountTarget;
        private String name;
        private String performanceLevel;
        private Integer provisionedIops;
        private Integer size;
        private String snapshotId;
        public Builder() {}
        public Builder(GetKubernetesNodePoolsNodepoolDataDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoFormat = defaults.autoFormat;
    	      this.autoSnapshotPolicyId = defaults.autoSnapshotPolicyId;
    	      this.burstingEnabled = defaults.burstingEnabled;
    	      this.category = defaults.category;
    	      this.device = defaults.device;
    	      this.encrypted = defaults.encrypted;
    	      this.fileSystem = defaults.fileSystem;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.mountTarget = defaults.mountTarget;
    	      this.name = defaults.name;
    	      this.performanceLevel = defaults.performanceLevel;
    	      this.provisionedIops = defaults.provisionedIops;
    	      this.size = defaults.size;
    	      this.snapshotId = defaults.snapshotId;
        }

        @CustomType.Setter
        public Builder autoFormat(String autoFormat) {
            if (autoFormat == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "autoFormat");
            }
            this.autoFormat = autoFormat;
            return this;
        }
        @CustomType.Setter
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            if (autoSnapshotPolicyId == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "autoSnapshotPolicyId");
            }
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder burstingEnabled(Boolean burstingEnabled) {
            if (burstingEnabled == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "burstingEnabled");
            }
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder category(String category) {
            if (category == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "category");
            }
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder device(String device) {
            if (device == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "device");
            }
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(String encrypted) {
            if (encrypted == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "encrypted");
            }
            this.encrypted = encrypted;
            return this;
        }
        @CustomType.Setter
        public Builder fileSystem(String fileSystem) {
            if (fileSystem == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "fileSystem");
            }
            this.fileSystem = fileSystem;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyId(String kmsKeyId) {
            if (kmsKeyId == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "kmsKeyId");
            }
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder mountTarget(String mountTarget) {
            if (mountTarget == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "mountTarget");
            }
            this.mountTarget = mountTarget;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder performanceLevel(String performanceLevel) {
            if (performanceLevel == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "performanceLevel");
            }
            this.performanceLevel = performanceLevel;
            return this;
        }
        @CustomType.Setter
        public Builder provisionedIops(Integer provisionedIops) {
            if (provisionedIops == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "provisionedIops");
            }
            this.provisionedIops = provisionedIops;
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "size");
            }
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            if (snapshotId == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolDataDisk", "snapshotId");
            }
            this.snapshotId = snapshotId;
            return this;
        }
        public GetKubernetesNodePoolsNodepoolDataDisk build() {
            final var _resultValue = new GetKubernetesNodePoolsNodepoolDataDisk();
            _resultValue.autoFormat = autoFormat;
            _resultValue.autoSnapshotPolicyId = autoSnapshotPolicyId;
            _resultValue.burstingEnabled = burstingEnabled;
            _resultValue.category = category;
            _resultValue.device = device;
            _resultValue.encrypted = encrypted;
            _resultValue.fileSystem = fileSystem;
            _resultValue.kmsKeyId = kmsKeyId;
            _resultValue.mountTarget = mountTarget;
            _resultValue.name = name;
            _resultValue.performanceLevel = performanceLevel;
            _resultValue.provisionedIops = provisionedIops;
            _resultValue.size = size;
            _resultValue.snapshotId = snapshotId;
            return _resultValue;
        }
    }
}
