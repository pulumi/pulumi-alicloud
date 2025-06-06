// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskState extends com.pulumi.resources.ResourceArgs {

    public static final DiskState Empty = new DiskState();

    /**
     * The category of the disk. Valid values: `cloud_efficiency` (high-efficiency cloud disk), `cloud_ssd` (full Flash cloud disk), `local_hdd` (local HDD), `local_ssd` (local ssd).
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return The category of the disk. Valid values: `cloud_efficiency` (high-efficiency cloud disk), `cloud_ssd` (full Flash cloud disk), `local_hdd` (local HDD), `local_ssd` (local ssd).
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * The time when the disk was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time when the disk was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The name of the disk.
     * 
     */
    @Import(name="diskName")
    private @Nullable Output<String> diskName;

    /**
     * @return The name of the disk.
     * 
     */
    public Optional<Output<String>> diskName() {
        return Optional.ofNullable(this.diskName);
    }

    /**
     * Specifies whether to encrypt the new system disk. Valid values: `true`, `false`(default).
     * 
     */
    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    /**
     * @return Specifies whether to encrypt the new system disk. Valid values: `true`, `false`(default).
     * 
     */
    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * The ID of the edge node.
     * 
     */
    @Import(name="ensRegionId")
    private @Nullable Output<String> ensRegionId;

    /**
     * @return The ID of the edge node.
     * 
     */
    public Optional<Output<String>> ensRegionId() {
        return Optional.ofNullable(this.ensRegionId);
    }

    /**
     * The ID of the KMS key used by the cloud disk. If `encrypted` is set to `true`, the service default key is used when KMSKeyId is empty.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The ID of the KMS key used by the cloud disk. If `encrypted` is set to `true`, the service default key is used when KMSKeyId is empty.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The billing method of the instance. Valid values: `PayAsYouGo`.
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return The billing method of the instance. Valid values: `PayAsYouGo`.
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The size of the disk instance. Unit: GiB.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return The size of the disk instance. Unit: GiB.
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The ID of the snapshot used to create the cloud disk.
     * 
     * The SnapshotId and Size parameters have the following limitations:
     * - If the snapshot capacity corresponding to the `snapshot_id` parameter is greater than the specified `size` parameter, the Size of the cloud disk created is the Size of the specified snapshot.
     * - If the snapshot capacity corresponding to the `snapshot_id` parameter is less than the set `size` parameter value, the Size of the cloud disk created is the specified `size` parameter value.
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<String> snapshotId;

    /**
     * @return The ID of the snapshot used to create the cloud disk.
     * 
     * The SnapshotId and Size parameters have the following limitations:
     * - If the snapshot capacity corresponding to the `snapshot_id` parameter is greater than the specified `size` parameter, the Size of the cloud disk created is the Size of the specified snapshot.
     * - If the snapshot capacity corresponding to the `snapshot_id` parameter is less than the set `size` parameter value, the Size of the cloud disk created is the specified `size` parameter value.
     * 
     */
    public Optional<Output<String>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    /**
     * The status of the disk.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the disk.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The label to which the instance is bound.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The label to which the instance is bound.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DiskState() {}

    private DiskState(DiskState $) {
        this.category = $.category;
        this.createTime = $.createTime;
        this.diskName = $.diskName;
        this.encrypted = $.encrypted;
        this.ensRegionId = $.ensRegionId;
        this.kmsKeyId = $.kmsKeyId;
        this.paymentType = $.paymentType;
        this.size = $.size;
        this.snapshotId = $.snapshotId;
        this.status = $.status;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskState $;

        public Builder() {
            $ = new DiskState();
        }

        public Builder(DiskState defaults) {
            $ = new DiskState(Objects.requireNonNull(defaults));
        }

        /**
         * @param category The category of the disk. Valid values: `cloud_efficiency` (high-efficiency cloud disk), `cloud_ssd` (full Flash cloud disk), `local_hdd` (local HDD), `local_ssd` (local ssd).
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category The category of the disk. Valid values: `cloud_efficiency` (high-efficiency cloud disk), `cloud_ssd` (full Flash cloud disk), `local_hdd` (local HDD), `local_ssd` (local ssd).
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param createTime The time when the disk was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time when the disk was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param diskName The name of the disk.
         * 
         * @return builder
         * 
         */
        public Builder diskName(@Nullable Output<String> diskName) {
            $.diskName = diskName;
            return this;
        }

        /**
         * @param diskName The name of the disk.
         * 
         * @return builder
         * 
         */
        public Builder diskName(String diskName) {
            return diskName(Output.of(diskName));
        }

        /**
         * @param encrypted Specifies whether to encrypt the new system disk. Valid values: `true`, `false`(default).
         * 
         * @return builder
         * 
         */
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        /**
         * @param encrypted Specifies whether to encrypt the new system disk. Valid values: `true`, `false`(default).
         * 
         * @return builder
         * 
         */
        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        /**
         * @param ensRegionId The ID of the edge node.
         * 
         * @return builder
         * 
         */
        public Builder ensRegionId(@Nullable Output<String> ensRegionId) {
            $.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * @param ensRegionId The ID of the edge node.
         * 
         * @return builder
         * 
         */
        public Builder ensRegionId(String ensRegionId) {
            return ensRegionId(Output.of(ensRegionId));
        }

        /**
         * @param kmsKeyId The ID of the KMS key used by the cloud disk. If `encrypted` is set to `true`, the service default key is used when KMSKeyId is empty.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The ID of the KMS key used by the cloud disk. If `encrypted` is set to `true`, the service default key is used when KMSKeyId is empty.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param paymentType The billing method of the instance. Valid values: `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The billing method of the instance. Valid values: `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param size The size of the disk instance. Unit: GiB.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the disk instance. Unit: GiB.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param snapshotId The ID of the snapshot used to create the cloud disk.
         * 
         * The SnapshotId and Size parameters have the following limitations:
         * - If the snapshot capacity corresponding to the `snapshot_id` parameter is greater than the specified `size` parameter, the Size of the cloud disk created is the Size of the specified snapshot.
         * - If the snapshot capacity corresponding to the `snapshot_id` parameter is less than the set `size` parameter value, the Size of the cloud disk created is the specified `size` parameter value.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId The ID of the snapshot used to create the cloud disk.
         * 
         * The SnapshotId and Size parameters have the following limitations:
         * - If the snapshot capacity corresponding to the `snapshot_id` parameter is greater than the specified `size` parameter, the Size of the cloud disk created is the Size of the specified snapshot.
         * - If the snapshot capacity corresponding to the `snapshot_id` parameter is less than the set `size` parameter value, the Size of the cloud disk created is the specified `size` parameter value.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        /**
         * @param status The status of the disk.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the disk.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags The label to which the instance is bound.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The label to which the instance is bound.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DiskState build() {
            return $;
        }
    }

}
