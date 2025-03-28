// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserPermissionPermission {
    /**
     * @return Whether the grant object is a RAM role.
     * 
     */
    private @Nullable Boolean isCustom;
    /**
     * @return Whether the grant object is an entity.
     * 
     */
    private @Nullable Boolean isRamRole;
    /**
     * @return The permission name. Valid values: `istio-admin`, `istio-ops`, `istio-readonly`.
     * - `istio-admin`:  The administrator.
     * - `istio-ops`: The administrator of the service mesh resource.
     * - `istio-readonly`: The read only permission.
     * 
     */
    private @Nullable String roleName;
    /**
     * @return The role type. Valid Value: `custom`.
     * 
     */
    private @Nullable String roleType;
    /**
     * @return The service mesh id.
     * 
     */
    private @Nullable String serviceMeshId;

    private UserPermissionPermission() {}
    /**
     * @return Whether the grant object is a RAM role.
     * 
     */
    public Optional<Boolean> isCustom() {
        return Optional.ofNullable(this.isCustom);
    }
    /**
     * @return Whether the grant object is an entity.
     * 
     */
    public Optional<Boolean> isRamRole() {
        return Optional.ofNullable(this.isRamRole);
    }
    /**
     * @return The permission name. Valid values: `istio-admin`, `istio-ops`, `istio-readonly`.
     * - `istio-admin`:  The administrator.
     * - `istio-ops`: The administrator of the service mesh resource.
     * - `istio-readonly`: The read only permission.
     * 
     */
    public Optional<String> roleName() {
        return Optional.ofNullable(this.roleName);
    }
    /**
     * @return The role type. Valid Value: `custom`.
     * 
     */
    public Optional<String> roleType() {
        return Optional.ofNullable(this.roleType);
    }
    /**
     * @return The service mesh id.
     * 
     */
    public Optional<String> serviceMeshId() {
        return Optional.ofNullable(this.serviceMeshId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPermissionPermission defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean isCustom;
        private @Nullable Boolean isRamRole;
        private @Nullable String roleName;
        private @Nullable String roleType;
        private @Nullable String serviceMeshId;
        public Builder() {}
        public Builder(UserPermissionPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCustom = defaults.isCustom;
    	      this.isRamRole = defaults.isRamRole;
    	      this.roleName = defaults.roleName;
    	      this.roleType = defaults.roleType;
    	      this.serviceMeshId = defaults.serviceMeshId;
        }

        @CustomType.Setter
        public Builder isCustom(@Nullable Boolean isCustom) {

            this.isCustom = isCustom;
            return this;
        }
        @CustomType.Setter
        public Builder isRamRole(@Nullable Boolean isRamRole) {

            this.isRamRole = isRamRole;
            return this;
        }
        @CustomType.Setter
        public Builder roleName(@Nullable String roleName) {

            this.roleName = roleName;
            return this;
        }
        @CustomType.Setter
        public Builder roleType(@Nullable String roleType) {

            this.roleType = roleType;
            return this;
        }
        @CustomType.Setter
        public Builder serviceMeshId(@Nullable String serviceMeshId) {

            this.serviceMeshId = serviceMeshId;
            return this;
        }
        public UserPermissionPermission build() {
            final var _resultValue = new UserPermissionPermission();
            _resultValue.isCustom = isCustom;
            _resultValue.isRamRole = isRamRole;
            _resultValue.roleName = roleName;
            _resultValue.roleType = roleType;
            _resultValue.serviceMeshId = serviceMeshId;
            return _resultValue;
        }
    }
}
