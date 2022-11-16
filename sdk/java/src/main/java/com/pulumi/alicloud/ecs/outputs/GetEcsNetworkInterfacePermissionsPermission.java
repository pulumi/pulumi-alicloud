// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEcsNetworkInterfacePermissionsPermission {
    /**
     * @return Alibaba Cloud Partner (Certified ISV) account ID or individual user ID.
     * 
     */
    private final String accountId;
    /**
     * @return The ID of the Network Interface Permission.
     * 
     */
    private final String id;
    /**
     * @return The ID of the network interface.
     * 
     */
    private final String networkInterfaceId;
    /**
     * @return The ID of the Network Interface Permissions.
     * 
     */
    private final String networkInterfacePermissionId;
    /**
     * @return The permissions of the Network Interface.
     * 
     */
    private final String permission;
    /**
     * @return Alibaba Cloud service name.
     * 
     */
    private final String serviceName;
    /**
     * @return The Status of the Network Interface Permissions.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetEcsNetworkInterfacePermissionsPermission(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("networkInterfaceId") String networkInterfaceId,
        @CustomType.Parameter("networkInterfacePermissionId") String networkInterfacePermissionId,
        @CustomType.Parameter("permission") String permission,
        @CustomType.Parameter("serviceName") String serviceName,
        @CustomType.Parameter("status") String status) {
        this.accountId = accountId;
        this.id = id;
        this.networkInterfaceId = networkInterfaceId;
        this.networkInterfacePermissionId = networkInterfacePermissionId;
        this.permission = permission;
        this.serviceName = serviceName;
        this.status = status;
    }

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

    public static final class Builder {
        private String accountId;
        private String id;
        private String networkInterfaceId;
        private String networkInterfacePermissionId;
        private String permission;
        private String serviceName;
        private String status;

        public Builder() {
    	      // Empty
        }

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

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        public Builder networkInterfacePermissionId(String networkInterfacePermissionId) {
            this.networkInterfacePermissionId = Objects.requireNonNull(networkInterfacePermissionId);
            return this;
        }
        public Builder permission(String permission) {
            this.permission = Objects.requireNonNull(permission);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetEcsNetworkInterfacePermissionsPermission build() {
            return new GetEcsNetworkInterfacePermissionsPermission(accountId, id, networkInterfaceId, networkInterfacePermissionId, permission, serviceName, status);
        }
    }
}