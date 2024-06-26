// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPermissionPermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPermissionPermissionArgs Empty = new UserPermissionPermissionArgs();

    /**
     * Whether the grant object is a RAM role.
     * 
     */
    @Import(name="isCustom")
    private @Nullable Output<Boolean> isCustom;

    /**
     * @return Whether the grant object is a RAM role.
     * 
     */
    public Optional<Output<Boolean>> isCustom() {
        return Optional.ofNullable(this.isCustom);
    }

    /**
     * Whether the grant object is an entity.
     * 
     */
    @Import(name="isRamRole")
    private @Nullable Output<Boolean> isRamRole;

    /**
     * @return Whether the grant object is an entity.
     * 
     */
    public Optional<Output<Boolean>> isRamRole() {
        return Optional.ofNullable(this.isRamRole);
    }

    /**
     * The permission name. Valid values: `istio-admin`, `istio-ops`, `istio-readonly`.
     * - `istio-admin`:  The administrator.
     * - `istio-ops`: The administrator of the service mesh resource.
     * - `istio-readonly`: The read only permission.
     * 
     */
    @Import(name="roleName")
    private @Nullable Output<String> roleName;

    /**
     * @return The permission name. Valid values: `istio-admin`, `istio-ops`, `istio-readonly`.
     * - `istio-admin`:  The administrator.
     * - `istio-ops`: The administrator of the service mesh resource.
     * - `istio-readonly`: The read only permission.
     * 
     */
    public Optional<Output<String>> roleName() {
        return Optional.ofNullable(this.roleName);
    }

    /**
     * The role type. Valid Value: `custom`.
     * 
     */
    @Import(name="roleType")
    private @Nullable Output<String> roleType;

    /**
     * @return The role type. Valid Value: `custom`.
     * 
     */
    public Optional<Output<String>> roleType() {
        return Optional.ofNullable(this.roleType);
    }

    /**
     * The service mesh id.
     * 
     */
    @Import(name="serviceMeshId")
    private @Nullable Output<String> serviceMeshId;

    /**
     * @return The service mesh id.
     * 
     */
    public Optional<Output<String>> serviceMeshId() {
        return Optional.ofNullable(this.serviceMeshId);
    }

    private UserPermissionPermissionArgs() {}

    private UserPermissionPermissionArgs(UserPermissionPermissionArgs $) {
        this.isCustom = $.isCustom;
        this.isRamRole = $.isRamRole;
        this.roleName = $.roleName;
        this.roleType = $.roleType;
        this.serviceMeshId = $.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPermissionPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPermissionPermissionArgs $;

        public Builder() {
            $ = new UserPermissionPermissionArgs();
        }

        public Builder(UserPermissionPermissionArgs defaults) {
            $ = new UserPermissionPermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isCustom Whether the grant object is a RAM role.
         * 
         * @return builder
         * 
         */
        public Builder isCustom(@Nullable Output<Boolean> isCustom) {
            $.isCustom = isCustom;
            return this;
        }

        /**
         * @param isCustom Whether the grant object is a RAM role.
         * 
         * @return builder
         * 
         */
        public Builder isCustom(Boolean isCustom) {
            return isCustom(Output.of(isCustom));
        }

        /**
         * @param isRamRole Whether the grant object is an entity.
         * 
         * @return builder
         * 
         */
        public Builder isRamRole(@Nullable Output<Boolean> isRamRole) {
            $.isRamRole = isRamRole;
            return this;
        }

        /**
         * @param isRamRole Whether the grant object is an entity.
         * 
         * @return builder
         * 
         */
        public Builder isRamRole(Boolean isRamRole) {
            return isRamRole(Output.of(isRamRole));
        }

        /**
         * @param roleName The permission name. Valid values: `istio-admin`, `istio-ops`, `istio-readonly`.
         * - `istio-admin`:  The administrator.
         * - `istio-ops`: The administrator of the service mesh resource.
         * - `istio-readonly`: The read only permission.
         * 
         * @return builder
         * 
         */
        public Builder roleName(@Nullable Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName The permission name. Valid values: `istio-admin`, `istio-ops`, `istio-readonly`.
         * - `istio-admin`:  The administrator.
         * - `istio-ops`: The administrator of the service mesh resource.
         * - `istio-readonly`: The read only permission.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        /**
         * @param roleType The role type. Valid Value: `custom`.
         * 
         * @return builder
         * 
         */
        public Builder roleType(@Nullable Output<String> roleType) {
            $.roleType = roleType;
            return this;
        }

        /**
         * @param roleType The role type. Valid Value: `custom`.
         * 
         * @return builder
         * 
         */
        public Builder roleType(String roleType) {
            return roleType(Output.of(roleType));
        }

        /**
         * @param serviceMeshId The service mesh id.
         * 
         * @return builder
         * 
         */
        public Builder serviceMeshId(@Nullable Output<String> serviceMeshId) {
            $.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * @param serviceMeshId The service mesh id.
         * 
         * @return builder
         * 
         */
        public Builder serviceMeshId(String serviceMeshId) {
            return serviceMeshId(Output.of(serviceMeshId));
        }

        public UserPermissionPermissionArgs build() {
            return $;
        }
    }

}
