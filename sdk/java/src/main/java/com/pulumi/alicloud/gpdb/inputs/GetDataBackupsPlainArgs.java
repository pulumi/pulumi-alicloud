// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDataBackupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataBackupsPlainArgs Empty = new GetDataBackupsPlainArgs();

    /**
     * Backup mode.Full Backup Value Description:-**Automated**: The system is automatically backed up.-**Manual**: Manual backup.Recovery point value description:-**Automated**: The recovery point after a full backup.-**Manual**: The recovery point triggered manually by the user.-**Period**: The recovery point triggered periodically because of the backup policy.
     * 
     */
    @Import(name="backupMode")
    private @Nullable String backupMode;

    /**
     * @return Backup mode.Full Backup Value Description:-**Automated**: The system is automatically backed up.-**Manual**: Manual backup.Recovery point value description:-**Automated**: The recovery point after a full backup.-**Manual**: The recovery point triggered manually by the user.-**Period**: The recovery point triggered periodically because of the backup policy.
     * 
     */
    public Optional<String> backupMode() {
        return Optional.ofNullable(this.backupMode);
    }

    /**
     * The first ID of the resource
     * 
     */
    @Import(name="dataBackupId")
    private @Nullable String dataBackupId;

    /**
     * @return The first ID of the resource
     * 
     */
    public Optional<String> dataBackupId() {
        return Optional.ofNullable(this.dataBackupId);
    }

    /**
     * The backup type. Value Description:-**DATA**: Full backup.-**RESTOREPOI**: Recoverable point.
     * 
     */
    @Import(name="dataType")
    private @Nullable String dataType;

    /**
     * @return The backup type. Value Description:-**DATA**: Full backup.-**RESTOREPOI**: Recoverable point.
     * 
     */
    public Optional<String> dataType() {
        return Optional.ofNullable(this.dataType);
    }

    /**
     * The instance ID.
     * 
     */
    @Import(name="dbInstanceId", required=true)
    private String dbInstanceId;

    /**
     * @return The instance ID.
     * 
     */
    public String dbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * The query end time, which must be greater than the query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
     * 
     */
    @Import(name="endTime")
    private @Nullable String endTime;

    /**
     * @return The query end time, which must be greater than the query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
     * 
     */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * A list of Databackup IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Databackup IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Current page number.
     * 
     */
    @Import(name="pageNumber")
    private @Nullable Integer pageNumber;

    /**
     * @return Current page number.
     * 
     */
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    /**
     * Number of records per page.
     * 
     */
    @Import(name="pageSize")
    private @Nullable Integer pageSize;

    /**
     * @return Number of records per page.
     * 
     */
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * The query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
     * 
     */
    @Import(name="startTime")
    private @Nullable String startTime;

    /**
     * @return The query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * Backup set status. Value Description:-Success: The backup has been completed.-Failed: Backup Failed.If not, return all.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Backup set status. Value Description:-Success: The backup has been completed.-Failed: Backup Failed.If not, return all.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetDataBackupsPlainArgs() {}

    private GetDataBackupsPlainArgs(GetDataBackupsPlainArgs $) {
        this.backupMode = $.backupMode;
        this.dataBackupId = $.dataBackupId;
        this.dataType = $.dataType;
        this.dbInstanceId = $.dbInstanceId;
        this.endTime = $.endTime;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.startTime = $.startTime;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataBackupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataBackupsPlainArgs $;

        public Builder() {
            $ = new GetDataBackupsPlainArgs();
        }

        public Builder(GetDataBackupsPlainArgs defaults) {
            $ = new GetDataBackupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupMode Backup mode.Full Backup Value Description:-**Automated**: The system is automatically backed up.-**Manual**: Manual backup.Recovery point value description:-**Automated**: The recovery point after a full backup.-**Manual**: The recovery point triggered manually by the user.-**Period**: The recovery point triggered periodically because of the backup policy.
         * 
         * @return builder
         * 
         */
        public Builder backupMode(@Nullable String backupMode) {
            $.backupMode = backupMode;
            return this;
        }

        /**
         * @param dataBackupId The first ID of the resource
         * 
         * @return builder
         * 
         */
        public Builder dataBackupId(@Nullable String dataBackupId) {
            $.dataBackupId = dataBackupId;
            return this;
        }

        /**
         * @param dataType The backup type. Value Description:-**DATA**: Full backup.-**RESTOREPOI**: Recoverable point.
         * 
         * @return builder
         * 
         */
        public Builder dataType(@Nullable String dataType) {
            $.dataType = dataType;
            return this;
        }

        /**
         * @param dbInstanceId The instance ID.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(String dbInstanceId) {
            $.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * @param endTime The query end time, which must be greater than the query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable String endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param ids A list of Databackup IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Databackup IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param pageNumber Current page number.
         * 
         * @return builder
         * 
         */
        public Builder pageNumber(@Nullable Integer pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        /**
         * @param pageSize Number of records per page.
         * 
         * @return builder
         * 
         */
        public Builder pageSize(@Nullable Integer pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        /**
         * @param startTime The query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable String startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param status Backup set status. Value Description:-Success: The backup has been completed.-Failed: Backup Failed.If not, return all.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetDataBackupsPlainArgs build() {
            if ($.dbInstanceId == null) {
                throw new MissingRequiredPropertyException("GetDataBackupsPlainArgs", "dbInstanceId");
            }
            return $;
        }
    }

}