// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnapshotsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSnapshotsArgs Empty = new GetSnapshotsArgs();

    /**
     * The ID of the file system.
     * 
     */
    @Import(name="fileSystemId")
    private @Nullable Output<String> fileSystemId;

    /**
     * @return The ID of the file system.
     * 
     */
    public Optional<Output<String>> fileSystemId() {
        return Optional.ofNullable(this.fileSystemId);
    }

    /**
     * A list of Snapshot IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Snapshot IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Snapshot name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Snapshot name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
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
     * The name of the snapshot.
     * 
     */
    @Import(name="snapshotName")
    private @Nullable Output<String> snapshotName;

    /**
     * @return The name of the snapshot.
     * 
     */
    public Optional<Output<String>> snapshotName() {
        return Optional.ofNullable(this.snapshotName);
    }

    /**
     * Status. Valid values: `accomplished`, `failed`, `progressing`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status. Valid values: `accomplished`, `failed`, `progressing`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetSnapshotsArgs() {}

    private GetSnapshotsArgs(GetSnapshotsArgs $) {
        this.fileSystemId = $.fileSystemId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.snapshotName = $.snapshotName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSnapshotsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSnapshotsArgs $;

        public Builder() {
            $ = new GetSnapshotsArgs();
        }

        public Builder(GetSnapshotsArgs defaults) {
            $ = new GetSnapshotsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileSystemId The ID of the file system.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(@Nullable Output<String> fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * @param fileSystemId The ID of the file system.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(String fileSystemId) {
            return fileSystemId(Output.of(fileSystemId));
        }

        /**
         * @param ids A list of Snapshot IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Snapshot IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
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
         * @param nameRegex A regex string to filter results by Snapshot name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Snapshot name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
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
         * @param snapshotName The name of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotName(@Nullable Output<String> snapshotName) {
            $.snapshotName = snapshotName;
            return this;
        }

        /**
         * @param snapshotName The name of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotName(String snapshotName) {
            return snapshotName(Output.of(snapshotName));
        }

        /**
         * @param status Status. Valid values: `accomplished`, `failed`, `progressing`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status. Valid values: `accomplished`, `failed`, `progressing`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetSnapshotsArgs build() {
            return $;
        }
    }

}