// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.simpleapplicationserver.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerSnapshotsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerSnapshotsPlainArgs Empty = new GetServerSnapshotsPlainArgs();

    /**
     * The ID of the disk.
     * 
     */
    @Import(name="diskId")
    private @Nullable String diskId;

    /**
     * @return The ID of the disk.
     * 
     */
    public Optional<String> diskId() {
        return Optional.ofNullable(this.diskId);
    }

    /**
     * A list of Snapshot IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Snapshot IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The ID of the simple application server.
     * 
     */
    @Import(name="instanceId")
    private @Nullable String instanceId;

    /**
     * @return The ID of the simple application server.
     * 
     */
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * A regex string to filter results by Snapshot name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Snapshot name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
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
     * The status of the snapshots. Valid values: `Progressing`, `Accomplished` and `Failed`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the snapshots. Valid values: `Progressing`, `Accomplished` and `Failed`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetServerSnapshotsPlainArgs() {}

    private GetServerSnapshotsPlainArgs(GetServerSnapshotsPlainArgs $) {
        this.diskId = $.diskId;
        this.ids = $.ids;
        this.instanceId = $.instanceId;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerSnapshotsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerSnapshotsPlainArgs $;

        public Builder() {
            $ = new GetServerSnapshotsPlainArgs();
        }

        public Builder(GetServerSnapshotsPlainArgs defaults) {
            $ = new GetServerSnapshotsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskId The ID of the disk.
         * 
         * @return builder
         * 
         */
        public Builder diskId(@Nullable String diskId) {
            $.diskId = diskId;
            return this;
        }

        /**
         * @param ids A list of Snapshot IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Snapshot IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param instanceId The ID of the simple application server.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Snapshot name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
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
         * @param status The status of the snapshots. Valid values: `Progressing`, `Accomplished` and `Failed`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetServerSnapshotsPlainArgs build() {
            return $;
        }
    }

}