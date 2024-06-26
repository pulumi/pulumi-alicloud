// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLinkedRoleState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLinkedRoleState Empty = new ServiceLinkedRoleState();

    /**
     * The Alibaba Cloud Resource Name (ARN) of the role.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the role.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
     * 
     */
    @Import(name="customSuffix")
    private @Nullable Output<String> customSuffix;

    /**
     * @return The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
     * 
     */
    public Optional<Output<String>> customSuffix() {
        return Optional.ofNullable(this.customSuffix);
    }

    /**
     * The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the role.
     * 
     */
    @Import(name="roleId")
    private @Nullable Output<String> roleId;

    /**
     * @return The ID of the role.
     * 
     */
    public Optional<Output<String>> roleId() {
        return Optional.ofNullable(this.roleId);
    }

    /**
     * The name of the role.
     * 
     */
    @Import(name="roleName")
    private @Nullable Output<String> roleName;

    /**
     * @return The name of the role.
     * 
     */
    public Optional<Output<String>> roleName() {
        return Optional.ofNullable(this.roleName);
    }

    /**
     * The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    private ServiceLinkedRoleState() {}

    private ServiceLinkedRoleState(ServiceLinkedRoleState $) {
        this.arn = $.arn;
        this.customSuffix = $.customSuffix;
        this.description = $.description;
        this.roleId = $.roleId;
        this.roleName = $.roleName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLinkedRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLinkedRoleState $;

        public Builder() {
            $ = new ServiceLinkedRoleState();
        }

        public Builder(ServiceLinkedRoleState defaults) {
            $ = new ServiceLinkedRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Alibaba Cloud Resource Name (ARN) of the role.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Alibaba Cloud Resource Name (ARN) of the role.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param customSuffix The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
         * 
         * @return builder
         * 
         */
        public Builder customSuffix(@Nullable Output<String> customSuffix) {
            $.customSuffix = customSuffix;
            return this;
        }

        /**
         * @param customSuffix The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
         * 
         * @return builder
         * 
         */
        public Builder customSuffix(String customSuffix) {
            return customSuffix(Output.of(customSuffix));
        }

        /**
         * @param description The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param roleId The ID of the role.
         * 
         * @return builder
         * 
         */
        public Builder roleId(@Nullable Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId The ID of the role.
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        /**
         * @param roleName The name of the role.
         * 
         * @return builder
         * 
         */
        public Builder roleName(@Nullable Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName The name of the role.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        /**
         * @param serviceName The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ServiceLinkedRoleState build() {
            return $;
        }
    }

}
