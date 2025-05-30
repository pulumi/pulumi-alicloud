// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceDataDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceDataDiskArgs Empty = new InstanceDataDiskArgs();

    /**
     * The ID of the automatic snapshot policy applied to the system disk.
     * 
     */
    @Import(name="autoSnapshotPolicyId")
    private @Nullable Output<String> autoSnapshotPolicyId;

    /**
     * @return The ID of the automatic snapshot policy applied to the system disk.
     * 
     */
    public Optional<Output<String>> autoSnapshotPolicyId() {
        return Optional.ofNullable(this.autoSnapshotPolicyId);
    }

    /**
     * Specifies whether to enable the performance burst feature for the system disk. Valid values:
     * 
     */
    @Import(name="burstingEnabled")
    private @Nullable Output<Boolean> burstingEnabled;

    /**
     * @return Specifies whether to enable the performance burst feature for the system disk. Valid values:
     * 
     */
    public Optional<Output<Boolean>> burstingEnabled() {
        return Optional.ofNullable(this.burstingEnabled);
    }

    /**
     * The category of the disk:
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return The category of the disk:
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * Delete this data disk when the instance is destroyed. It only works on cloud, cloud_efficiency, cloud_essd, cloud_ssd disk. If the category of this data disk was ephemeral_ssd, please don&#39;t set this param. Default value: `true`.
     * 
     */
    @Import(name="deleteWithInstance")
    private @Nullable Output<Boolean> deleteWithInstance;

    /**
     * @return Delete this data disk when the instance is destroyed. It only works on cloud, cloud_efficiency, cloud_essd, cloud_ssd disk. If the category of this data disk was ephemeral_ssd, please don&#39;t set this param. Default value: `true`.
     * 
     */
    public Optional<Output<Boolean>> deleteWithInstance() {
        return Optional.ofNullable(this.deleteWithInstance);
    }

    /**
     * The description of the data disk.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the data disk.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The mount point of the data disk.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return The mount point of the data disk.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * Encrypted the data in this disk. Default value: `false`.
     * 
     */
    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    /**
     * @return Encrypted the data in this disk. Default value: `false`.
     * 
     */
    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * The KMS key ID corresponding to the Nth data disk.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The KMS key ID corresponding to the Nth data disk.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The name of the data disk.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the data disk.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The performance level of the ESSD used as data disk:
     * - `PL0`: A single ESSD can deliver up to 10,000 random read/write IOPS.
     * - `PL1`: A single ESSD can deliver up to 50,000 random read/write IOPS.
     * - `PL2`: A single ESSD can deliver up to 100,000 random read/write IOPS.
     * - `PL3`: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
     *   Default to `PL1`.
     * 
     */
    @Import(name="performanceLevel")
    private @Nullable Output<String> performanceLevel;

    /**
     * @return The performance level of the ESSD used as data disk:
     * - `PL0`: A single ESSD can deliver up to 10,000 random read/write IOPS.
     * - `PL1`: A single ESSD can deliver up to 50,000 random read/write IOPS.
     * - `PL2`: A single ESSD can deliver up to 100,000 random read/write IOPS.
     * - `PL3`: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
     *   Default to `PL1`.
     * 
     */
    public Optional<Output<String>> performanceLevel() {
        return Optional.ofNullable(this.performanceLevel);
    }

    /**
     * The provisioned read/write IOPS of the ESSD AutoPL disk to use as the data disk.
     * 
     */
    @Import(name="provisionedIops")
    private @Nullable Output<Integer> provisionedIops;

    /**
     * @return The provisioned read/write IOPS of the ESSD AutoPL disk to use as the data disk.
     * 
     */
    public Optional<Output<Integer>> provisionedIops() {
        return Optional.ofNullable(this.provisionedIops);
    }

    /**
     * The size of the data disk.
     * - cloud：[5, 2000]
     * - cloud_efficiency：[20, 32768]
     * - cloud_ssd：[20, 32768]
     * - cloud_essd：[20, 32768]
     * - ephemeral_ssd: [5, 800]
     * 
     */
    @Import(name="size", required=true)
    private Output<Integer> size;

    /**
     * @return The size of the data disk.
     * - cloud：[5, 2000]
     * - cloud_efficiency：[20, 32768]
     * - cloud_ssd：[20, 32768]
     * - cloud_essd：[20, 32768]
     * - ephemeral_ssd: [5, 800]
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }

    /**
     * The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<String> snapshotId;

    /**
     * @return The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
     * 
     */
    public Optional<Output<String>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    private InstanceDataDiskArgs() {}

    private InstanceDataDiskArgs(InstanceDataDiskArgs $) {
        this.autoSnapshotPolicyId = $.autoSnapshotPolicyId;
        this.burstingEnabled = $.burstingEnabled;
        this.category = $.category;
        this.deleteWithInstance = $.deleteWithInstance;
        this.description = $.description;
        this.device = $.device;
        this.encrypted = $.encrypted;
        this.kmsKeyId = $.kmsKeyId;
        this.name = $.name;
        this.performanceLevel = $.performanceLevel;
        this.provisionedIops = $.provisionedIops;
        this.size = $.size;
        this.snapshotId = $.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceDataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceDataDiskArgs $;

        public Builder() {
            $ = new InstanceDataDiskArgs();
        }

        public Builder(InstanceDataDiskArgs defaults) {
            $ = new InstanceDataDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoSnapshotPolicyId The ID of the automatic snapshot policy applied to the system disk.
         * 
         * @return builder
         * 
         */
        public Builder autoSnapshotPolicyId(@Nullable Output<String> autoSnapshotPolicyId) {
            $.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * @param autoSnapshotPolicyId The ID of the automatic snapshot policy applied to the system disk.
         * 
         * @return builder
         * 
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            return autoSnapshotPolicyId(Output.of(autoSnapshotPolicyId));
        }

        /**
         * @param burstingEnabled Specifies whether to enable the performance burst feature for the system disk. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder burstingEnabled(@Nullable Output<Boolean> burstingEnabled) {
            $.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * @param burstingEnabled Specifies whether to enable the performance burst feature for the system disk. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            return burstingEnabled(Output.of(burstingEnabled));
        }

        /**
         * @param category The category of the disk:
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category The category of the disk:
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param deleteWithInstance Delete this data disk when the instance is destroyed. It only works on cloud, cloud_efficiency, cloud_essd, cloud_ssd disk. If the category of this data disk was ephemeral_ssd, please don&#39;t set this param. Default value: `true`.
         * 
         * @return builder
         * 
         */
        public Builder deleteWithInstance(@Nullable Output<Boolean> deleteWithInstance) {
            $.deleteWithInstance = deleteWithInstance;
            return this;
        }

        /**
         * @param deleteWithInstance Delete this data disk when the instance is destroyed. It only works on cloud, cloud_efficiency, cloud_essd, cloud_ssd disk. If the category of this data disk was ephemeral_ssd, please don&#39;t set this param. Default value: `true`.
         * 
         * @return builder
         * 
         */
        public Builder deleteWithInstance(Boolean deleteWithInstance) {
            return deleteWithInstance(Output.of(deleteWithInstance));
        }

        /**
         * @param description The description of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param device The mount point of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device The mount point of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        /**
         * @param encrypted Encrypted the data in this disk. Default value: `false`.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        /**
         * @param encrypted Encrypted the data in this disk. Default value: `false`.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        /**
         * @param kmsKeyId The KMS key ID corresponding to the Nth data disk.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The KMS key ID corresponding to the Nth data disk.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param name The name of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param performanceLevel The performance level of the ESSD used as data disk:
         * - `PL0`: A single ESSD can deliver up to 10,000 random read/write IOPS.
         * - `PL1`: A single ESSD can deliver up to 50,000 random read/write IOPS.
         * - `PL2`: A single ESSD can deliver up to 100,000 random read/write IOPS.
         * - `PL3`: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
         *   Default to `PL1`.
         * 
         * @return builder
         * 
         */
        public Builder performanceLevel(@Nullable Output<String> performanceLevel) {
            $.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * @param performanceLevel The performance level of the ESSD used as data disk:
         * - `PL0`: A single ESSD can deliver up to 10,000 random read/write IOPS.
         * - `PL1`: A single ESSD can deliver up to 50,000 random read/write IOPS.
         * - `PL2`: A single ESSD can deliver up to 100,000 random read/write IOPS.
         * - `PL3`: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
         *   Default to `PL1`.
         * 
         * @return builder
         * 
         */
        public Builder performanceLevel(String performanceLevel) {
            return performanceLevel(Output.of(performanceLevel));
        }

        /**
         * @param provisionedIops The provisioned read/write IOPS of the ESSD AutoPL disk to use as the data disk.
         * 
         * @return builder
         * 
         */
        public Builder provisionedIops(@Nullable Output<Integer> provisionedIops) {
            $.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * @param provisionedIops The provisioned read/write IOPS of the ESSD AutoPL disk to use as the data disk.
         * 
         * @return builder
         * 
         */
        public Builder provisionedIops(Integer provisionedIops) {
            return provisionedIops(Output.of(provisionedIops));
        }

        /**
         * @param size The size of the data disk.
         * - cloud：[5, 2000]
         * - cloud_efficiency：[20, 32768]
         * - cloud_ssd：[20, 32768]
         * - cloud_essd：[20, 32768]
         * - ephemeral_ssd: [5, 800]
         * 
         * @return builder
         * 
         */
        public Builder size(Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the data disk.
         * - cloud：[5, 2000]
         * - cloud_efficiency：[20, 32768]
         * - cloud_ssd：[20, 32768]
         * - cloud_essd：[20, 32768]
         * - ephemeral_ssd: [5, 800]
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param snapshotId The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        public InstanceDataDiskArgs build() {
            if ($.size == null) {
                throw new MissingRequiredPropertyException("InstanceDataDiskArgs", "size");
            }
            return $;
        }
    }

}
