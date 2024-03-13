// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dfs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VscMountPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final VscMountPointArgs Empty = new VscMountPointArgs();

    /**
     * Mount point alias prefix, which is used as the prefix for generating VSC mount point aliases.
     * 
     */
    @Import(name="aliasPrefix")
    private @Nullable Output<String> aliasPrefix;

    /**
     * @return Mount point alias prefix, which is used as the prefix for generating VSC mount point aliases.
     * 
     */
    public Optional<Output<String>> aliasPrefix() {
        return Optional.ofNullable(this.aliasPrefix);
    }

    /**
     * The description of the Mount point.  The length is 0 to 100 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Mount point.  The length is 0 to 100 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the HDFS file system resource associated with the VSC mount point.
     * 
     */
    @Import(name="fileSystemId", required=true)
    private Output<String> fileSystemId;

    /**
     * @return The ID of the HDFS file system resource associated with the VSC mount point.
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }

    private VscMountPointArgs() {}

    private VscMountPointArgs(VscMountPointArgs $) {
        this.aliasPrefix = $.aliasPrefix;
        this.description = $.description;
        this.fileSystemId = $.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VscMountPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VscMountPointArgs $;

        public Builder() {
            $ = new VscMountPointArgs();
        }

        public Builder(VscMountPointArgs defaults) {
            $ = new VscMountPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliasPrefix Mount point alias prefix, which is used as the prefix for generating VSC mount point aliases.
         * 
         * @return builder
         * 
         */
        public Builder aliasPrefix(@Nullable Output<String> aliasPrefix) {
            $.aliasPrefix = aliasPrefix;
            return this;
        }

        /**
         * @param aliasPrefix Mount point alias prefix, which is used as the prefix for generating VSC mount point aliases.
         * 
         * @return builder
         * 
         */
        public Builder aliasPrefix(String aliasPrefix) {
            return aliasPrefix(Output.of(aliasPrefix));
        }

        /**
         * @param description The description of the Mount point.  The length is 0 to 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Mount point.  The length is 0 to 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fileSystemId The ID of the HDFS file system resource associated with the VSC mount point.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(Output<String> fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * @param fileSystemId The ID of the HDFS file system resource associated with the VSC mount point.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(String fileSystemId) {
            return fileSystemId(Output.of(fileSystemId));
        }

        public VscMountPointArgs build() {
            if ($.fileSystemId == null) {
                throw new MissingRequiredPropertyException("VscMountPointArgs", "fileSystemId");
            }
            return $;
        }
    }

}