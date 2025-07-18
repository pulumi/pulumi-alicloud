// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUdmSnapshotsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUdmSnapshotsPlainArgs Empty = new GetUdmSnapshotsPlainArgs();

    /**
     * Cloud disk ID. This field is valid only when SourceType = UDM_ECS_DISK.
     * 
     */
    @Import(name="diskId")
    private @Nullable String diskId;

    /**
     * @return Cloud disk ID. This field is valid only when SourceType = UDM_ECS_DISK.
     * 
     */
    public Optional<String> diskId() {
        return Optional.ofNullable(this.diskId);
    }

    /**
     * End Time
     * 
     */
    @Import(name="endTime", required=true)
    private Integer endTime;

    /**
     * @return End Time
     * 
     */
    public Integer endTime() {
        return this.endTime;
    }

    /**
     * A list of Udm Snapshot IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Udm Snapshot IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * ECS instance ID
     * 
     */
    @Import(name="instanceId", required=true)
    private String instanceId;

    /**
     * @return ECS instance ID
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * The ID of the backup job that creates the snapshot.
     * 
     */
    @Import(name="jobId")
    private @Nullable String jobId;

    /**
     * @return The ID of the backup job that creates the snapshot.
     * 
     */
    public Optional<String> jobId() {
        return Optional.ofNullable(this.jobId);
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
     * Data source type. Only UDM_ECS and UDM_ECS_DISK are supported.
     * 
     */
    @Import(name="sourceType", required=true)
    private String sourceType;

    /**
     * @return Data source type. Only UDM_ECS and UDM_ECS_DISK are supported.
     * 
     */
    public String sourceType() {
        return this.sourceType;
    }

    /**
     * Start Time
     * 
     */
    @Import(name="startTime", required=true)
    private Integer startTime;

    /**
     * @return Start Time
     * 
     */
    public Integer startTime() {
        return this.startTime;
    }

    private GetUdmSnapshotsPlainArgs() {}

    private GetUdmSnapshotsPlainArgs(GetUdmSnapshotsPlainArgs $) {
        this.diskId = $.diskId;
        this.endTime = $.endTime;
        this.ids = $.ids;
        this.instanceId = $.instanceId;
        this.jobId = $.jobId;
        this.outputFile = $.outputFile;
        this.sourceType = $.sourceType;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUdmSnapshotsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUdmSnapshotsPlainArgs $;

        public Builder() {
            $ = new GetUdmSnapshotsPlainArgs();
        }

        public Builder(GetUdmSnapshotsPlainArgs defaults) {
            $ = new GetUdmSnapshotsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskId Cloud disk ID. This field is valid only when SourceType = UDM_ECS_DISK.
         * 
         * @return builder
         * 
         */
        public Builder diskId(@Nullable String diskId) {
            $.diskId = diskId;
            return this;
        }

        /**
         * @param endTime End Time
         * 
         * @return builder
         * 
         */
        public Builder endTime(Integer endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param ids A list of Udm Snapshot IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Udm Snapshot IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param instanceId ECS instance ID
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param jobId The ID of the backup job that creates the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder jobId(@Nullable String jobId) {
            $.jobId = jobId;
            return this;
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
         * @param sourceType Data source type. Only UDM_ECS and UDM_ECS_DISK are supported.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(String sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        /**
         * @param startTime Start Time
         * 
         * @return builder
         * 
         */
        public Builder startTime(Integer startTime) {
            $.startTime = startTime;
            return this;
        }

        public GetUdmSnapshotsPlainArgs build() {
            if ($.endTime == null) {
                throw new MissingRequiredPropertyException("GetUdmSnapshotsPlainArgs", "endTime");
            }
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("GetUdmSnapshotsPlainArgs", "instanceId");
            }
            if ($.sourceType == null) {
                throw new MissingRequiredPropertyException("GetUdmSnapshotsPlainArgs", "sourceType");
            }
            if ($.startTime == null) {
                throw new MissingRequiredPropertyException("GetUdmSnapshotsPlainArgs", "startTime");
            }
            return $;
        }
    }

}
