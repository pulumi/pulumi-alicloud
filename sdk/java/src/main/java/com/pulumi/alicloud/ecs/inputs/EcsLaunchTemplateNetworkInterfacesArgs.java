// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EcsLaunchTemplateNetworkInterfacesArgs extends com.pulumi.resources.ResourceArgs {

    public static final EcsLaunchTemplateNetworkInterfacesArgs Empty = new EcsLaunchTemplateNetworkInterfacesArgs();

    /**
     * Specifies whether to release ENI N when the instance is released. Valid values: `true`, `false`.
     * 
     */
    @Import(name="deleteOnRelease")
    private @Nullable Output<Boolean> deleteOnRelease;

    /**
     * @return Specifies whether to release ENI N when the instance is released. Valid values: `true`, `false`.
     * 
     */
    public Optional<Output<Boolean>> deleteOnRelease() {
        return Optional.ofNullable(this.deleteOnRelease);
    }

    /**
     * The ENI description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The ENI description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ENI name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The ENI name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The primary private IP address of the ENI.
     * 
     */
    @Import(name="primaryIp")
    private @Nullable Output<String> primaryIp;

    /**
     * @return The primary private IP address of the ENI.
     * 
     */
    public Optional<Output<String>> primaryIp() {
        return Optional.ofNullable(this.primaryIp);
    }

    /**
     * The security group ID must be one in the same VPC.
     * 
     */
    @Import(name="securityGroupId")
    private @Nullable Output<String> securityGroupId;

    /**
     * @return The security group ID must be one in the same VPC.
     * 
     */
    public Optional<Output<String>> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }

    /**
     * The VSwitch ID for ENI. The instance must be in the same zone of the same VPC network as the ENI, but they may belong to different VSwitches.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The VSwitch ID for ENI. The instance must be in the same zone of the same VPC network as the ENI, but they may belong to different VSwitches.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private EcsLaunchTemplateNetworkInterfacesArgs() {}

    private EcsLaunchTemplateNetworkInterfacesArgs(EcsLaunchTemplateNetworkInterfacesArgs $) {
        this.deleteOnRelease = $.deleteOnRelease;
        this.description = $.description;
        this.name = $.name;
        this.primaryIp = $.primaryIp;
        this.securityGroupId = $.securityGroupId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EcsLaunchTemplateNetworkInterfacesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EcsLaunchTemplateNetworkInterfacesArgs $;

        public Builder() {
            $ = new EcsLaunchTemplateNetworkInterfacesArgs();
        }

        public Builder(EcsLaunchTemplateNetworkInterfacesArgs defaults) {
            $ = new EcsLaunchTemplateNetworkInterfacesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteOnRelease Specifies whether to release ENI N when the instance is released. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder deleteOnRelease(@Nullable Output<Boolean> deleteOnRelease) {
            $.deleteOnRelease = deleteOnRelease;
            return this;
        }

        /**
         * @param deleteOnRelease Specifies whether to release ENI N when the instance is released. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder deleteOnRelease(Boolean deleteOnRelease) {
            return deleteOnRelease(Output.of(deleteOnRelease));
        }

        /**
         * @param description The ENI description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The ENI description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The ENI name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The ENI name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primaryIp The primary private IP address of the ENI.
         * 
         * @return builder
         * 
         */
        public Builder primaryIp(@Nullable Output<String> primaryIp) {
            $.primaryIp = primaryIp;
            return this;
        }

        /**
         * @param primaryIp The primary private IP address of the ENI.
         * 
         * @return builder
         * 
         */
        public Builder primaryIp(String primaryIp) {
            return primaryIp(Output.of(primaryIp));
        }

        /**
         * @param securityGroupId The security group ID must be one in the same VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(@Nullable Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * @param securityGroupId The security group ID must be one in the same VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        /**
         * @param vswitchId The VSwitch ID for ENI. The instance must be in the same zone of the same VPC network as the ENI, but they may belong to different VSwitches.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The VSwitch ID for ENI. The instance must be in the same zone of the same VPC network as the ENI, but they may belong to different VSwitches.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public EcsLaunchTemplateNetworkInterfacesArgs build() {
            return $;
        }
    }

}
