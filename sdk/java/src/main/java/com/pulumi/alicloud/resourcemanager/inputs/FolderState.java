// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FolderState extends com.pulumi.resources.ResourceArgs {

    public static final FolderState Empty = new FolderState();

    /**
     * The name of the folder. The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).
     * 
     */
    @Import(name="folderName")
    private @Nullable Output<String> folderName;

    /**
     * @return The name of the folder. The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).
     * 
     */
    public Optional<Output<String>> folderName() {
        return Optional.ofNullable(this.folderName);
    }

    /**
     * The ID of the parent folder. If not set, the system default value will be used.
     * 
     */
    @Import(name="parentFolderId")
    private @Nullable Output<String> parentFolderId;

    /**
     * @return The ID of the parent folder. If not set, the system default value will be used.
     * 
     */
    public Optional<Output<String>> parentFolderId() {
        return Optional.ofNullable(this.parentFolderId);
    }

    private FolderState() {}

    private FolderState(FolderState $) {
        this.folderName = $.folderName;
        this.parentFolderId = $.parentFolderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderState $;

        public Builder() {
            $ = new FolderState();
        }

        public Builder(FolderState defaults) {
            $ = new FolderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param folderName The name of the folder. The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder folderName(@Nullable Output<String> folderName) {
            $.folderName = folderName;
            return this;
        }

        /**
         * @param folderName The name of the folder. The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder folderName(String folderName) {
            return folderName(Output.of(folderName));
        }

        /**
         * @param parentFolderId The ID of the parent folder. If not set, the system default value will be used.
         * 
         * @return builder
         * 
         */
        public Builder parentFolderId(@Nullable Output<String> parentFolderId) {
            $.parentFolderId = parentFolderId;
            return this;
        }

        /**
         * @param parentFolderId The ID of the parent folder. If not set, the system default value will be used.
         * 
         * @return builder
         * 
         */
        public Builder parentFolderId(String parentFolderId) {
            return parentFolderId(Output.of(parentFolderId));
        }

        public FolderState build() {
            return $;
        }
    }

}