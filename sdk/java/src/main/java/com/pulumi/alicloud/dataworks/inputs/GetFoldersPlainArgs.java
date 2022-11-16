// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFoldersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFoldersPlainArgs Empty = new GetFoldersPlainArgs();

    /**
     * A list of Folder IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Folder IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The parent folder path.
     * 
     */
    @Import(name="parentFolderPath", required=true)
    private String parentFolderPath;

    /**
     * @return The parent folder path.
     * 
     */
    public String parentFolderPath() {
        return this.parentFolderPath;
    }

    /**
     * The ID of the project.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The ID of the project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetFoldersPlainArgs() {}

    private GetFoldersPlainArgs(GetFoldersPlainArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.parentFolderPath = $.parentFolderPath;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFoldersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFoldersPlainArgs $;

        public Builder() {
            $ = new GetFoldersPlainArgs();
        }

        public Builder(GetFoldersPlainArgs defaults) {
            $ = new GetFoldersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Folder IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Folder IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param parentFolderPath The parent folder path.
         * 
         * @return builder
         * 
         */
        public Builder parentFolderPath(String parentFolderPath) {
            $.parentFolderPath = parentFolderPath;
            return this;
        }

        /**
         * @param projectId The ID of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetFoldersPlainArgs build() {
            $.parentFolderPath = Objects.requireNonNull($.parentFolderPath, "expected parameter 'parentFolderPath' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}