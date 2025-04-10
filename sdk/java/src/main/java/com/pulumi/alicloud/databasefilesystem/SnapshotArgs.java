// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.databasefilesystem;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * The description of the snapshot. The `description` must be `2` to `256` characters in length. It cannot start with `http://` or `https://`. **NOTE:** From version 1.233.1, `description` can be modified.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the snapshot. The `description` must be `2` to `256` characters in length. It cannot start with `http://` or `https://`. **NOTE:** From version 1.233.1, `description` can be modified.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies whether to force delete the snapshot. Valid values:
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return Specifies whether to force delete the snapshot. Valid values:
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * The ID of the Database File System.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The ID of the Database File System.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * The retention period of the snapshot. Valid values: `1` to `65536`.
     * 
     */
    @Import(name="retentionDays")
    private @Nullable Output<Integer> retentionDays;

    /**
     * @return The retention period of the snapshot. Valid values: `1` to `65536`.
     * 
     */
    public Optional<Output<Integer>> retentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }

    /**
     * The name of the snapshot. The `snapshot_name` must be `2` to `128` characters in length. It must start with a large or small letter or Chinese, and cannot start with `http://`, `https://`, `auto` or `dbfs-auto`. It can contain numbers, colons (:), underscores (_), or hyphens (-). **NOTE:** From version 1.233.1, `snapshot_name` can be modified.
     * 
     */
    @Import(name="snapshotName")
    private @Nullable Output<String> snapshotName;

    /**
     * @return The name of the snapshot. The `snapshot_name` must be `2` to `128` characters in length. It must start with a large or small letter or Chinese, and cannot start with `http://`, `https://`, `auto` or `dbfs-auto`. It can contain numbers, colons (:), underscores (_), or hyphens (-). **NOTE:** From version 1.233.1, `snapshot_name` can be modified.
     * 
     */
    public Optional<Output<String>> snapshotName() {
        return Optional.ofNullable(this.snapshotName);
    }

    private SnapshotArgs() {}

    private SnapshotArgs(SnapshotArgs $) {
        this.description = $.description;
        this.force = $.force;
        this.instanceId = $.instanceId;
        this.retentionDays = $.retentionDays;
        this.snapshotName = $.snapshotName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotArgs $;

        public Builder() {
            $ = new SnapshotArgs();
        }

        public Builder(SnapshotArgs defaults) {
            $ = new SnapshotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the snapshot. The `description` must be `2` to `256` characters in length. It cannot start with `http://` or `https://`. **NOTE:** From version 1.233.1, `description` can be modified.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the snapshot. The `description` must be `2` to `256` characters in length. It cannot start with `http://` or `https://`. **NOTE:** From version 1.233.1, `description` can be modified.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param force Specifies whether to force delete the snapshot. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force Specifies whether to force delete the snapshot. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param instanceId The ID of the Database File System.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the Database File System.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param retentionDays The retention period of the snapshot. Valid values: `1` to `65536`.
         * 
         * @return builder
         * 
         */
        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            $.retentionDays = retentionDays;
            return this;
        }

        /**
         * @param retentionDays The retention period of the snapshot. Valid values: `1` to `65536`.
         * 
         * @return builder
         * 
         */
        public Builder retentionDays(Integer retentionDays) {
            return retentionDays(Output.of(retentionDays));
        }

        /**
         * @param snapshotName The name of the snapshot. The `snapshot_name` must be `2` to `128` characters in length. It must start with a large or small letter or Chinese, and cannot start with `http://`, `https://`, `auto` or `dbfs-auto`. It can contain numbers, colons (:), underscores (_), or hyphens (-). **NOTE:** From version 1.233.1, `snapshot_name` can be modified.
         * 
         * @return builder
         * 
         */
        public Builder snapshotName(@Nullable Output<String> snapshotName) {
            $.snapshotName = snapshotName;
            return this;
        }

        /**
         * @param snapshotName The name of the snapshot. The `snapshot_name` must be `2` to `128` characters in length. It must start with a large or small letter or Chinese, and cannot start with `http://`, `https://`, `auto` or `dbfs-auto`. It can contain numbers, colons (:), underscores (_), or hyphens (-). **NOTE:** From version 1.233.1, `snapshot_name` can be modified.
         * 
         * @return builder
         * 
         */
        public Builder snapshotName(String snapshotName) {
            return snapshotName(Output.of(snapshotName));
        }

        public SnapshotArgs build() {
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("SnapshotArgs", "instanceId");
            }
            return $;
        }
    }

}
