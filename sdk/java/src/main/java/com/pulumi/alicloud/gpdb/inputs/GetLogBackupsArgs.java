// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLogBackupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogBackupsArgs Empty = new GetLogBackupsArgs();

    /**
     * The ID of the Master node of the instance.
     * 
     */
    @Import(name="dbInstanceId", required=true)
    private Output<String> dbInstanceId;

    /**
     * @return The ID of the Master node of the instance.
     * 
     */
    public Output<String> dbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * The query end time, which must be greater than the query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return The query end time, which must be greater than the query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * A list of Logbackup IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Logbackup IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Current page number.
     * 
     */
    @Import(name="pageNumber")
    private @Nullable Output<Integer> pageNumber;

    /**
     * @return Current page number.
     * 
     */
    public Optional<Output<Integer>> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    /**
     * Number of records per page.
     * 
     */
    @Import(name="pageSize")
    private @Nullable Output<Integer> pageSize;

    /**
     * @return Number of records per page.
     * 
     */
    public Optional<Output<Integer>> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * The query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private GetLogBackupsArgs() {}

    private GetLogBackupsArgs(GetLogBackupsArgs $) {
        this.dbInstanceId = $.dbInstanceId;
        this.endTime = $.endTime;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogBackupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogBackupsArgs $;

        public Builder() {
            $ = new GetLogBackupsArgs();
        }

        public Builder(GetLogBackupsArgs defaults) {
            $ = new GetLogBackupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbInstanceId The ID of the Master node of the instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(Output<String> dbInstanceId) {
            $.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * @param dbInstanceId The ID of the Master node of the instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(String dbInstanceId) {
            return dbInstanceId(Output.of(dbInstanceId));
        }

        /**
         * @param endTime The query end time, which must be greater than the query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The query end time, which must be greater than the query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param ids A list of Logbackup IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Logbackup IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Logbackup IDs.
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
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param pageNumber Current page number.
         * 
         * @return builder
         * 
         */
        public Builder pageNumber(@Nullable Output<Integer> pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        /**
         * @param pageNumber Current page number.
         * 
         * @return builder
         * 
         */
        public Builder pageNumber(Integer pageNumber) {
            return pageNumber(Output.of(pageNumber));
        }

        /**
         * @param pageSize Number of records per page.
         * 
         * @return builder
         * 
         */
        public Builder pageSize(@Nullable Output<Integer> pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        /**
         * @param pageSize Number of records per page.
         * 
         * @return builder
         * 
         */
        public Builder pageSize(Integer pageSize) {
            return pageSize(Output.of(pageSize));
        }

        /**
         * @param startTime The query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public GetLogBackupsArgs build() {
            if ($.dbInstanceId == null) {
                throw new MissingRequiredPropertyException("GetLogBackupsArgs", "dbInstanceId");
            }
            return $;
        }
    }

}