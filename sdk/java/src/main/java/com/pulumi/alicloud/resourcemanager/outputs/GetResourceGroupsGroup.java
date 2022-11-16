// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.alicloud.resourcemanager.outputs.GetResourceGroupsGroupRegionStatus;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResourceGroupsGroup {
    /**
     * @return The ID of the Alibaba Cloud account to which the resource group belongs.
     * 
     */
    private final String accountId;
    /**
     * @return The display name of the resource group.
     * 
     */
    private final String displayName;
    /**
     * @return The ID of the resource group.
     * 
     */
    private final String id;
    /**
     * @return The unique identifier of the resource group.
     * 
     */
    private final String name;
    private final List<GetResourceGroupsGroupRegionStatus> regionStatuses;
    /**
     * @return (Available in v1.114.0+) The unique identifier of the resource group.
     * 
     */
    private final String resourceGroupName;
    /**
     * @return The status of the resource group. Possible values:`Creating`,`Deleted`,`Deleting`(Available 1.114.0+) `OK` and `PendingDelete`.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetResourceGroupsGroup(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("regionStatuses") List<GetResourceGroupsGroupRegionStatus> regionStatuses,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("status") String status) {
        this.accountId = accountId;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.regionStatuses = regionStatuses;
        this.resourceGroupName = resourceGroupName;
        this.status = status;
    }

    /**
     * @return The ID of the Alibaba Cloud account to which the resource group belongs.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The display name of the resource group.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The ID of the resource group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The unique identifier of the resource group.
     * 
     */
    public String name() {
        return this.name;
    }
    public List<GetResourceGroupsGroupRegionStatus> regionStatuses() {
        return this.regionStatuses;
    }
    /**
     * @return (Available in v1.114.0+) The unique identifier of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The status of the resource group. Possible values:`Creating`,`Deleted`,`Deleting`(Available 1.114.0+) `OK` and `PendingDelete`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceGroupsGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String displayName;
        private String id;
        private String name;
        private List<GetResourceGroupsGroupRegionStatus> regionStatuses;
        private String resourceGroupName;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.regionStatuses = defaults.regionStatuses;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.status = defaults.status;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder regionStatuses(List<GetResourceGroupsGroupRegionStatus> regionStatuses) {
            this.regionStatuses = Objects.requireNonNull(regionStatuses);
            return this;
        }
        public Builder regionStatuses(GetResourceGroupsGroupRegionStatus... regionStatuses) {
            return regionStatuses(List.of(regionStatuses));
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetResourceGroupsGroup build() {
            return new GetResourceGroupsGroup(accountId, displayName, id, name, regionStatuses, resourceGroupName, status);
        }
    }
}