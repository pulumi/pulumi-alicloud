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


public final class MountPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final MountPointArgs Empty = new MountPointArgs();

    /**
     * The id of the permission group associated with the Mount point, which is used to set the access permissions of the Mount point.
     * 
     */
    @Import(name="accessGroupId", required=true)
    private Output<String> accessGroupId;

    /**
     * @return The id of the permission group associated with the Mount point, which is used to set the access permissions of the Mount point.
     * 
     */
    public Output<String> accessGroupId() {
        return this.accessGroupId;
    }

    /**
     * The mount point alias prefix, which specifies the mount point alias prefix.
     * 
     */
    @Import(name="aliasPrefix")
    private @Nullable Output<String> aliasPrefix;

    /**
     * @return The mount point alias prefix, which specifies the mount point alias prefix.
     * 
     */
    public Optional<Output<String>> aliasPrefix() {
        return Optional.ofNullable(this.aliasPrefix);
    }

    /**
     * The description of the Mount point.  No more than 32 characters in length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Mount point.  No more than 32 characters in length.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique file system identifier, used to retrieve specified file system resources.
     * 
     */
    @Import(name="fileSystemId", required=true)
    private Output<String> fileSystemId;

    /**
     * @return Unique file system identifier, used to retrieve specified file system resources.
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * The network type of the Mount point.  Only VPC (VPC) is supported.
     * 
     */
    @Import(name="networkType", required=true)
    private Output<String> networkType;

    /**
     * @return The network type of the Mount point.  Only VPC (VPC) is supported.
     * 
     */
    public Output<String> networkType() {
        return this.networkType;
    }

    /**
     * Mount point status. Value: Inactive: Disable mount points Active: Activate the mount point.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Mount point status. Value: Inactive: Disable mount points Active: Activate the mount point.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the VPC. Specifies the VPC environment to which the mount point belongs.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC. Specifies the VPC environment to which the mount point belongs.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     * VSwitch ID, which specifies the VSwitch resource used to create the mount point.
     * 
     */
    @Import(name="vswitchId", required=true)
    private Output<String> vswitchId;

    /**
     * @return VSwitch ID, which specifies the VSwitch resource used to create the mount point.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    private MountPointArgs() {}

    private MountPointArgs(MountPointArgs $) {
        this.accessGroupId = $.accessGroupId;
        this.aliasPrefix = $.aliasPrefix;
        this.description = $.description;
        this.fileSystemId = $.fileSystemId;
        this.networkType = $.networkType;
        this.status = $.status;
        this.vpcId = $.vpcId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MountPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MountPointArgs $;

        public Builder() {
            $ = new MountPointArgs();
        }

        public Builder(MountPointArgs defaults) {
            $ = new MountPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessGroupId The id of the permission group associated with the Mount point, which is used to set the access permissions of the Mount point.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupId(Output<String> accessGroupId) {
            $.accessGroupId = accessGroupId;
            return this;
        }

        /**
         * @param accessGroupId The id of the permission group associated with the Mount point, which is used to set the access permissions of the Mount point.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupId(String accessGroupId) {
            return accessGroupId(Output.of(accessGroupId));
        }

        /**
         * @param aliasPrefix The mount point alias prefix, which specifies the mount point alias prefix.
         * 
         * @return builder
         * 
         */
        public Builder aliasPrefix(@Nullable Output<String> aliasPrefix) {
            $.aliasPrefix = aliasPrefix;
            return this;
        }

        /**
         * @param aliasPrefix The mount point alias prefix, which specifies the mount point alias prefix.
         * 
         * @return builder
         * 
         */
        public Builder aliasPrefix(String aliasPrefix) {
            return aliasPrefix(Output.of(aliasPrefix));
        }

        /**
         * @param description The description of the Mount point.  No more than 32 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Mount point.  No more than 32 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fileSystemId Unique file system identifier, used to retrieve specified file system resources.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(Output<String> fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * @param fileSystemId Unique file system identifier, used to retrieve specified file system resources.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(String fileSystemId) {
            return fileSystemId(Output.of(fileSystemId));
        }

        /**
         * @param networkType The network type of the Mount point.  Only VPC (VPC) is supported.
         * 
         * @return builder
         * 
         */
        public Builder networkType(Output<String> networkType) {
            $.networkType = networkType;
            return this;
        }

        /**
         * @param networkType The network type of the Mount point.  Only VPC (VPC) is supported.
         * 
         * @return builder
         * 
         */
        public Builder networkType(String networkType) {
            return networkType(Output.of(networkType));
        }

        /**
         * @param status Mount point status. Value: Inactive: Disable mount points Active: Activate the mount point.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Mount point status. Value: Inactive: Disable mount points Active: Activate the mount point.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vpcId The ID of the VPC. Specifies the VPC environment to which the mount point belongs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC. Specifies the VPC environment to which the mount point belongs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vswitchId VSwitch ID, which specifies the VSwitch resource used to create the mount point.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId VSwitch ID, which specifies the VSwitch resource used to create the mount point.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public MountPointArgs build() {
            if ($.accessGroupId == null) {
                throw new MissingRequiredPropertyException("MountPointArgs", "accessGroupId");
            }
            if ($.fileSystemId == null) {
                throw new MissingRequiredPropertyException("MountPointArgs", "fileSystemId");
            }
            if ($.networkType == null) {
                throw new MissingRequiredPropertyException("MountPointArgs", "networkType");
            }
            if ($.vpcId == null) {
                throw new MissingRequiredPropertyException("MountPointArgs", "vpcId");
            }
            if ($.vswitchId == null) {
                throw new MissingRequiredPropertyException("MountPointArgs", "vswitchId");
            }
            return $;
        }
    }

}