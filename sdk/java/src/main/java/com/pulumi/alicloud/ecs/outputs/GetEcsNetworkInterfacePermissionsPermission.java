// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEcsNetworkInterfacePermissionsPermission {
    /**
     * @return Alibaba Cloud Partner (Certified ISV) account ID or individual user ID.
     * 
     */
    private String accountId;
    /**
     * @return The ID of the Network Interface Permission.
     * 
     */
    private String id;
    /**
     * @return The ID of the network interface.
     * 
     */
    private String networkInterfaceId;
    /**
     * @return The ID of the Network Interface Permissions.
     * 
     */
    private String networkInterfacePermissionId;
    /**
     * @return The permissions of the Network Interface.
     * 
     */
    private String permission;
    /**
     * @return Alibaba Cloud service name.
     * 
     */
    private String serviceName;
    /**
     * @return The Status of the Network Interface Permissions.
     * 
     */
    private String status;

    private GetEcsNetworkInterfacePermissionsPermission() {}
    /**
     * @return Alibaba Cloud Partner (Certified ISV) account ID or individual user ID.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The ID of the Network Interface Permission.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the network interface.
     * 
     */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * @return The ID of the Network Interface Permissions.
     * 
     */
    public String networkInterfacePermissionId() {
        return this.networkInterfacePermissionId;
    }
    /**
     * @return The permissions of the Network Interface.
     * 
     */
    public String permission() {
        return this.permission;
    }
    /**
     * @return Alibaba Cloud service name.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return The Status of the Network Interface Permissions.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsNetworkInterfacePermissionsPermission defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String id;
        private String networkInterfaceId;
        private String networkInterfacePermissionId;
        private String permission;
        private String serviceName;
        private String status;
        public Builder() {}
        public Builder(GetEcsNetworkInterfacePermissionsPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.id = defaults.id;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.networkInterfacePermissionId = defaults.networkInterfacePermissionId;
    	      this.permission = defaults.permission;
    	      this.serviceName = defaults.serviceName;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetEcsNetworkInterfacePermissionsPermission", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEcsNetworkInterfacePermissionsPermission", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceId(String networkInterfaceId) {
            if (networkInterfaceId == null) {
              throw new MissingRequiredPropertyException("GetEcsNetworkInterfacePermissionsPermission", "networkInterfaceId");
            }
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfacePermissionId(String networkInterfacePermissionId) {
            if (networkInterfacePermissionId == null) {
              throw new MissingRequiredPropertyException("GetEcsNetworkInterfacePermissionsPermission", "networkInterfacePermissionId");
            }
            this.networkInterfacePermissionId = networkInterfacePermissionId;
            return this;
        }
        @CustomType.Setter
        public Builder permission(String permission) {
            if (permission == null) {
              throw new MissingRequiredPropertyException("GetEcsNetworkInterfacePermissionsPermission", "permission");
            }
            this.permission = permission;
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            if (serviceName == null) {
              throw new MissingRequiredPropertyException("GetEcsNetworkInterfacePermissionsPermission", "serviceName");
            }
            this.serviceName = serviceName;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetEcsNetworkInterfacePermissionsPermission", "status");
            }
            this.status = status;
            return this;
        }
        public GetEcsNetworkInterfacePermissionsPermission build() {
            final var _resultValue = new GetEcsNetworkInterfacePermissionsPermission();
            _resultValue.accountId = accountId;
            _resultValue.id = id;
            _resultValue.networkInterfaceId = networkInterfaceId;
            _resultValue.networkInterfacePermissionId = networkInterfacePermissionId;
            _resultValue.permission = permission;
            _resultValue.serviceName = serviceName;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}