// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.adb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final BackupPolicyState Empty = new BackupPolicyState();

    /**
     * Cluster backup retention days, Fixed for 7 days, not modified.
     * 
     */
    @Import(name="backupRetentionPeriod")
    private @Nullable Output<String> backupRetentionPeriod;

    /**
     * @return Cluster backup retention days, Fixed for 7 days, not modified.
     * 
     */
    public Optional<Output<String>> backupRetentionPeriod() {
        return Optional.ofNullable(this.backupRetentionPeriod);
    }

    /**
     * The Id of cluster that can run database.
     * 
     */
    @Import(name="dbClusterId")
    private @Nullable Output<String> dbClusterId;

    /**
     * @return The Id of cluster that can run database.
     * 
     */
    public Optional<Output<String>> dbClusterId() {
        return Optional.ofNullable(this.dbClusterId);
    }

    /**
     * ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
     * 
     */
    @Import(name="preferredBackupPeriods")
    private @Nullable Output<List<String>> preferredBackupPeriods;

    /**
     * @return ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
     * 
     */
    public Optional<Output<List<String>>> preferredBackupPeriods() {
        return Optional.ofNullable(this.preferredBackupPeriods);
    }

    /**
     * ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
     * 
     */
    @Import(name="preferredBackupTime")
    private @Nullable Output<String> preferredBackupTime;

    /**
     * @return ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
     * 
     */
    public Optional<Output<String>> preferredBackupTime() {
        return Optional.ofNullable(this.preferredBackupTime);
    }

    private BackupPolicyState() {}

    private BackupPolicyState(BackupPolicyState $) {
        this.backupRetentionPeriod = $.backupRetentionPeriod;
        this.dbClusterId = $.dbClusterId;
        this.preferredBackupPeriods = $.preferredBackupPeriods;
        this.preferredBackupTime = $.preferredBackupTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyState $;

        public Builder() {
            $ = new BackupPolicyState();
        }

        public Builder(BackupPolicyState defaults) {
            $ = new BackupPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupRetentionPeriod Cluster backup retention days, Fixed for 7 days, not modified.
         * 
         * @return builder
         * 
         */
        public Builder backupRetentionPeriod(@Nullable Output<String> backupRetentionPeriod) {
            $.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * @param backupRetentionPeriod Cluster backup retention days, Fixed for 7 days, not modified.
         * 
         * @return builder
         * 
         */
        public Builder backupRetentionPeriod(String backupRetentionPeriod) {
            return backupRetentionPeriod(Output.of(backupRetentionPeriod));
        }

        /**
         * @param dbClusterId The Id of cluster that can run database.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterId(@Nullable Output<String> dbClusterId) {
            $.dbClusterId = dbClusterId;
            return this;
        }

        /**
         * @param dbClusterId The Id of cluster that can run database.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterId(String dbClusterId) {
            return dbClusterId(Output.of(dbClusterId));
        }

        /**
         * @param preferredBackupPeriods ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupPeriods(@Nullable Output<List<String>> preferredBackupPeriods) {
            $.preferredBackupPeriods = preferredBackupPeriods;
            return this;
        }

        /**
         * @param preferredBackupPeriods ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupPeriods(List<String> preferredBackupPeriods) {
            return preferredBackupPeriods(Output.of(preferredBackupPeriods));
        }

        /**
         * @param preferredBackupPeriods ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupPeriods(String... preferredBackupPeriods) {
            return preferredBackupPeriods(List.of(preferredBackupPeriods));
        }

        /**
         * @param preferredBackupTime ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupTime(@Nullable Output<String> preferredBackupTime) {
            $.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * @param preferredBackupTime ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            return preferredBackupTime(Output.of(preferredBackupTime));
        }

        public BackupPolicyState build() {
            return $;
        }
    }

}
