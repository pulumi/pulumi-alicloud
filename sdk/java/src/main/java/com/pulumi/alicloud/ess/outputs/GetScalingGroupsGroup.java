// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetScalingGroupsGroup {
    /**
     * @return Number of active instances in scaling group.
     * 
     */
    private Integer activeCapacity;
    /**
     * @return Active scaling configuration for scaling group.
     * 
     */
    private String activeScalingConfiguration;
    /**
     * @return Default cooldown time of scaling group.
     * 
     */
    private Integer cooldownTime;
    /**
     * @return Creation time of scaling group.
     * 
     */
    private String creationTime;
    /**
     * @return Db instances id which the ECS instance attached to.
     * 
     */
    private List<String> dbInstanceIds;
    /**
     * @return Whether the scaling group deletion protection is enabled.
     * 
     */
    private Boolean groupDeletionProtection;
    /**
     * @return The health check method of the scaling group.
     * 
     */
    private String healthCheckType;
    /**
     * @return ID of the scaling group.
     * 
     */
    private String id;
    /**
     * @return Active launch template ID for scaling group.
     * 
     */
    private String launchTemplateId;
    /**
     * @return Version of active launch template.
     * 
     */
    private String launchTemplateVersion;
    /**
     * @return Lifecycle state of scaling group.
     * 
     */
    private String lifecycleState;
    /**
     * @return Slb instances id which the ECS instance attached to.
     * 
     */
    private List<String> loadBalancerIds;
    /**
     * @return The maximum number of ECS instances.
     * 
     */
    private Integer maxSize;
    /**
     * @return The minimum number of ECS instances.
     * 
     */
    private Integer minSize;
    /**
     * @return The modification time.
     * 
     */
    private String modificationTime;
    /**
     * @return Name of the scaling group.
     * 
     */
    private String name;
    /**
     * @return Number of pending instances in scaling group.
     * 
     */
    private Integer pendingCapacity;
    /**
     * @return Region ID the scaling group belongs to.
     * 
     */
    private String regionId;
    /**
     * @return Removal policy used to select the ECS instance to remove from the scaling group.
     * 
     */
    private List<String> removalPolicies;
    /**
     * @return Number of removing instances in scaling group.
     * 
     */
    private Integer removingCapacity;
    /**
     * @return The Process in suspension.
     * 
     */
    private List<String> suspendedProcesses;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private @Nullable Map<String,Object> tags;
    /**
     * @return Number of instances in scaling group.
     * 
     */
    private Integer totalCapacity;
    /**
     * @return The number of all ECS instances in the scaling group.
     * 
     */
    private Integer totalInstanceCount;
    /**
     * @return The ID of the VPC to which the scaling group belongs.
     * 
     */
    private String vpcId;
    /**
     * @return The ID of the vSwitch to which the scaling group belongs.
     * 
     */
    private String vswitchId;
    /**
     * @return Vswitches id in which the ECS instance launched.
     * 
     */
    private List<String> vswitchIds;

    private GetScalingGroupsGroup() {}
    /**
     * @return Number of active instances in scaling group.
     * 
     */
    public Integer activeCapacity() {
        return this.activeCapacity;
    }
    /**
     * @return Active scaling configuration for scaling group.
     * 
     */
    public String activeScalingConfiguration() {
        return this.activeScalingConfiguration;
    }
    /**
     * @return Default cooldown time of scaling group.
     * 
     */
    public Integer cooldownTime() {
        return this.cooldownTime;
    }
    /**
     * @return Creation time of scaling group.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return Db instances id which the ECS instance attached to.
     * 
     */
    public List<String> dbInstanceIds() {
        return this.dbInstanceIds;
    }
    /**
     * @return Whether the scaling group deletion protection is enabled.
     * 
     */
    public Boolean groupDeletionProtection() {
        return this.groupDeletionProtection;
    }
    /**
     * @return The health check method of the scaling group.
     * 
     */
    public String healthCheckType() {
        return this.healthCheckType;
    }
    /**
     * @return ID of the scaling group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Active launch template ID for scaling group.
     * 
     */
    public String launchTemplateId() {
        return this.launchTemplateId;
    }
    /**
     * @return Version of active launch template.
     * 
     */
    public String launchTemplateVersion() {
        return this.launchTemplateVersion;
    }
    /**
     * @return Lifecycle state of scaling group.
     * 
     */
    public String lifecycleState() {
        return this.lifecycleState;
    }
    /**
     * @return Slb instances id which the ECS instance attached to.
     * 
     */
    public List<String> loadBalancerIds() {
        return this.loadBalancerIds;
    }
    /**
     * @return The maximum number of ECS instances.
     * 
     */
    public Integer maxSize() {
        return this.maxSize;
    }
    /**
     * @return The minimum number of ECS instances.
     * 
     */
    public Integer minSize() {
        return this.minSize;
    }
    /**
     * @return The modification time.
     * 
     */
    public String modificationTime() {
        return this.modificationTime;
    }
    /**
     * @return Name of the scaling group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Number of pending instances in scaling group.
     * 
     */
    public Integer pendingCapacity() {
        return this.pendingCapacity;
    }
    /**
     * @return Region ID the scaling group belongs to.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return Removal policy used to select the ECS instance to remove from the scaling group.
     * 
     */
    public List<String> removalPolicies() {
        return this.removalPolicies;
    }
    /**
     * @return Number of removing instances in scaling group.
     * 
     */
    public Integer removingCapacity() {
        return this.removingCapacity;
    }
    /**
     * @return The Process in suspension.
     * 
     */
    public List<String> suspendedProcesses() {
        return this.suspendedProcesses;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Number of instances in scaling group.
     * 
     */
    public Integer totalCapacity() {
        return this.totalCapacity;
    }
    /**
     * @return The number of all ECS instances in the scaling group.
     * 
     */
    public Integer totalInstanceCount() {
        return this.totalInstanceCount;
    }
    /**
     * @return The ID of the VPC to which the scaling group belongs.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The ID of the vSwitch to which the scaling group belongs.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }
    /**
     * @return Vswitches id in which the ECS instance launched.
     * 
     */
    public List<String> vswitchIds() {
        return this.vswitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScalingGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer activeCapacity;
        private String activeScalingConfiguration;
        private Integer cooldownTime;
        private String creationTime;
        private List<String> dbInstanceIds;
        private Boolean groupDeletionProtection;
        private String healthCheckType;
        private String id;
        private String launchTemplateId;
        private String launchTemplateVersion;
        private String lifecycleState;
        private List<String> loadBalancerIds;
        private Integer maxSize;
        private Integer minSize;
        private String modificationTime;
        private String name;
        private Integer pendingCapacity;
        private String regionId;
        private List<String> removalPolicies;
        private Integer removingCapacity;
        private List<String> suspendedProcesses;
        private @Nullable Map<String,Object> tags;
        private Integer totalCapacity;
        private Integer totalInstanceCount;
        private String vpcId;
        private String vswitchId;
        private List<String> vswitchIds;
        public Builder() {}
        public Builder(GetScalingGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeCapacity = defaults.activeCapacity;
    	      this.activeScalingConfiguration = defaults.activeScalingConfiguration;
    	      this.cooldownTime = defaults.cooldownTime;
    	      this.creationTime = defaults.creationTime;
    	      this.dbInstanceIds = defaults.dbInstanceIds;
    	      this.groupDeletionProtection = defaults.groupDeletionProtection;
    	      this.healthCheckType = defaults.healthCheckType;
    	      this.id = defaults.id;
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateVersion = defaults.launchTemplateVersion;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.loadBalancerIds = defaults.loadBalancerIds;
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
    	      this.modificationTime = defaults.modificationTime;
    	      this.name = defaults.name;
    	      this.pendingCapacity = defaults.pendingCapacity;
    	      this.regionId = defaults.regionId;
    	      this.removalPolicies = defaults.removalPolicies;
    	      this.removingCapacity = defaults.removingCapacity;
    	      this.suspendedProcesses = defaults.suspendedProcesses;
    	      this.tags = defaults.tags;
    	      this.totalCapacity = defaults.totalCapacity;
    	      this.totalInstanceCount = defaults.totalInstanceCount;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
    	      this.vswitchIds = defaults.vswitchIds;
        }

        @CustomType.Setter
        public Builder activeCapacity(Integer activeCapacity) {
            if (activeCapacity == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "activeCapacity");
            }
            this.activeCapacity = activeCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder activeScalingConfiguration(String activeScalingConfiguration) {
            if (activeScalingConfiguration == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "activeScalingConfiguration");
            }
            this.activeScalingConfiguration = activeScalingConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder cooldownTime(Integer cooldownTime) {
            if (cooldownTime == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "cooldownTime");
            }
            this.cooldownTime = cooldownTime;
            return this;
        }
        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            if (creationTime == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "creationTime");
            }
            this.creationTime = creationTime;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceIds(List<String> dbInstanceIds) {
            if (dbInstanceIds == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "dbInstanceIds");
            }
            this.dbInstanceIds = dbInstanceIds;
            return this;
        }
        public Builder dbInstanceIds(String... dbInstanceIds) {
            return dbInstanceIds(List.of(dbInstanceIds));
        }
        @CustomType.Setter
        public Builder groupDeletionProtection(Boolean groupDeletionProtection) {
            if (groupDeletionProtection == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "groupDeletionProtection");
            }
            this.groupDeletionProtection = groupDeletionProtection;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckType(String healthCheckType) {
            if (healthCheckType == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "healthCheckType");
            }
            this.healthCheckType = healthCheckType;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder launchTemplateId(String launchTemplateId) {
            if (launchTemplateId == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "launchTemplateId");
            }
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        @CustomType.Setter
        public Builder launchTemplateVersion(String launchTemplateVersion) {
            if (launchTemplateVersion == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "launchTemplateVersion");
            }
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        @CustomType.Setter
        public Builder lifecycleState(String lifecycleState) {
            if (lifecycleState == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "lifecycleState");
            }
            this.lifecycleState = lifecycleState;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerIds(List<String> loadBalancerIds) {
            if (loadBalancerIds == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "loadBalancerIds");
            }
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }
        public Builder loadBalancerIds(String... loadBalancerIds) {
            return loadBalancerIds(List.of(loadBalancerIds));
        }
        @CustomType.Setter
        public Builder maxSize(Integer maxSize) {
            if (maxSize == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "maxSize");
            }
            this.maxSize = maxSize;
            return this;
        }
        @CustomType.Setter
        public Builder minSize(Integer minSize) {
            if (minSize == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "minSize");
            }
            this.minSize = minSize;
            return this;
        }
        @CustomType.Setter
        public Builder modificationTime(String modificationTime) {
            if (modificationTime == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "modificationTime");
            }
            this.modificationTime = modificationTime;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder pendingCapacity(Integer pendingCapacity) {
            if (pendingCapacity == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "pendingCapacity");
            }
            this.pendingCapacity = pendingCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            if (regionId == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "regionId");
            }
            this.regionId = regionId;
            return this;
        }
        @CustomType.Setter
        public Builder removalPolicies(List<String> removalPolicies) {
            if (removalPolicies == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "removalPolicies");
            }
            this.removalPolicies = removalPolicies;
            return this;
        }
        public Builder removalPolicies(String... removalPolicies) {
            return removalPolicies(List.of(removalPolicies));
        }
        @CustomType.Setter
        public Builder removingCapacity(Integer removingCapacity) {
            if (removingCapacity == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "removingCapacity");
            }
            this.removingCapacity = removingCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder suspendedProcesses(List<String> suspendedProcesses) {
            if (suspendedProcesses == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "suspendedProcesses");
            }
            this.suspendedProcesses = suspendedProcesses;
            return this;
        }
        public Builder suspendedProcesses(String... suspendedProcesses) {
            return suspendedProcesses(List.of(suspendedProcesses));
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,Object> tags) {

            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder totalCapacity(Integer totalCapacity) {
            if (totalCapacity == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "totalCapacity");
            }
            this.totalCapacity = totalCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder totalInstanceCount(Integer totalInstanceCount) {
            if (totalInstanceCount == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "totalInstanceCount");
            }
            this.totalInstanceCount = totalInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            if (vswitchId == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "vswitchId");
            }
            this.vswitchId = vswitchId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchIds(List<String> vswitchIds) {
            if (vswitchIds == null) {
              throw new MissingRequiredPropertyException("GetScalingGroupsGroup", "vswitchIds");
            }
            this.vswitchIds = vswitchIds;
            return this;
        }
        public Builder vswitchIds(String... vswitchIds) {
            return vswitchIds(List.of(vswitchIds));
        }
        public GetScalingGroupsGroup build() {
            final var _resultValue = new GetScalingGroupsGroup();
            _resultValue.activeCapacity = activeCapacity;
            _resultValue.activeScalingConfiguration = activeScalingConfiguration;
            _resultValue.cooldownTime = cooldownTime;
            _resultValue.creationTime = creationTime;
            _resultValue.dbInstanceIds = dbInstanceIds;
            _resultValue.groupDeletionProtection = groupDeletionProtection;
            _resultValue.healthCheckType = healthCheckType;
            _resultValue.id = id;
            _resultValue.launchTemplateId = launchTemplateId;
            _resultValue.launchTemplateVersion = launchTemplateVersion;
            _resultValue.lifecycleState = lifecycleState;
            _resultValue.loadBalancerIds = loadBalancerIds;
            _resultValue.maxSize = maxSize;
            _resultValue.minSize = minSize;
            _resultValue.modificationTime = modificationTime;
            _resultValue.name = name;
            _resultValue.pendingCapacity = pendingCapacity;
            _resultValue.regionId = regionId;
            _resultValue.removalPolicies = removalPolicies;
            _resultValue.removingCapacity = removingCapacity;
            _resultValue.suspendedProcesses = suspendedProcesses;
            _resultValue.tags = tags;
            _resultValue.totalCapacity = totalCapacity;
            _resultValue.totalInstanceCount = totalInstanceCount;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchId = vswitchId;
            _resultValue.vswitchIds = vswitchIds;
            return _resultValue;
        }
    }
}