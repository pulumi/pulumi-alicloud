// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MountTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MountTargetArgs Empty = new MountTargetArgs();

    /**
     * The name of the permission group that applies to the mount target.
     * 
     */
    @Import(name="accessGroupName")
    private @Nullable Output<String> accessGroupName;

    /**
     * @return The name of the permission group that applies to the mount target.
     * 
     */
    public Optional<Output<String>> accessGroupName() {
        return Optional.ofNullable(this.accessGroupName);
    }

    /**
     * The ID of the file system.
     * 
     */
    @Import(name="fileSystemId", required=true)
    private Output<String> fileSystemId;

    /**
     * @return The ID of the file system.
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * mount target network type. Valid values: `VPC`. The classic network&#39;s mount targets are not supported.
     * 
     */
    @Import(name="networkType")
    private @Nullable Output<String> networkType;

    /**
     * @return mount target network type. Valid values: `VPC`. The classic network&#39;s mount targets are not supported.
     * 
     */
    public Optional<Output<String>> networkType() {
        return Optional.ofNullable(this.networkType);
    }

    /**
     * The ID of security group.
     * 
     */
    @Import(name="securityGroupId")
    private @Nullable Output<String> securityGroupId;

    /**
     * @return The ID of security group.
     * 
     */
    public Optional<Output<String>> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }

    /**
     * Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of VPC.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The ID of the VSwitch in the VPC where the mount target resides.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The ID of the VSwitch in the VPC where the mount target resides.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private MountTargetArgs() {}

    private MountTargetArgs(MountTargetArgs $) {
        this.accessGroupName = $.accessGroupName;
        this.fileSystemId = $.fileSystemId;
        this.networkType = $.networkType;
        this.securityGroupId = $.securityGroupId;
        this.status = $.status;
        this.vpcId = $.vpcId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MountTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MountTargetArgs $;

        public Builder() {
            $ = new MountTargetArgs();
        }

        public Builder(MountTargetArgs defaults) {
            $ = new MountTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessGroupName The name of the permission group that applies to the mount target.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupName(@Nullable Output<String> accessGroupName) {
            $.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * @param accessGroupName The name of the permission group that applies to the mount target.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupName(String accessGroupName) {
            return accessGroupName(Output.of(accessGroupName));
        }

        /**
         * @param fileSystemId The ID of the file system.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(Output<String> fileSystemId) {
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
         * @param networkType mount target network type. Valid values: `VPC`. The classic network&#39;s mount targets are not supported.
         * 
         * @return builder
         * 
         */
        public Builder networkType(@Nullable Output<String> networkType) {
            $.networkType = networkType;
            return this;
        }

        /**
         * @param networkType mount target network type. Valid values: `VPC`. The classic network&#39;s mount targets are not supported.
         * 
         * @return builder
         * 
         */
        public Builder networkType(String networkType) {
            return networkType(Output.of(networkType));
        }

        /**
         * @param securityGroupId The ID of security group.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(@Nullable Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * @param securityGroupId The ID of security group.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        /**
         * @param status Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vpcId The ID of VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vswitchId The ID of the VSwitch in the VPC where the mount target resides.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The ID of the VSwitch in the VPC where the mount target resides.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public MountTargetArgs build() {
            if ($.fileSystemId == null) {
                throw new MissingRequiredPropertyException("MountTargetArgs", "fileSystemId");
            }
            return $;
        }
    }

}