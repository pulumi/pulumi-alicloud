// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetDedicatedHostsHostCapacity;
import com.pulumi.alicloud.ecs.outputs.GetDedicatedHostsHostNetworkAttribute;
import com.pulumi.alicloud.ecs.outputs.GetDedicatedHostsHostOperationLock;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDedicatedHostsHost {
    /**
     * @return The policy used to migrate the instances from the dedicated host when the dedicated host fails or needs to be repaired online.
     * 
     */
    private String actionOnMaintenance;
    /**
     * @return Specifies whether to add the dedicated host to the resource pool for automatic deployment.
     * 
     */
    private String autoPlacement;
    /**
     * @return The automatic release time of the dedicated host.
     * 
     */
    private String autoReleaseTime;
    /**
     * @return (Available in 1.123.1+) A collection of proprietary host performance indicators.
     * 
     */
    private List<GetDedicatedHostsHostCapacity> capacities;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private Integer cores;
    /**
     * @return (Available in 1.123.1+) CPU oversold ratio.
     * 
     */
    private Double cpuOverCommitRatio;
    /**
     * @return The ID of ECS Dedicated Host.
     * 
     */
    private String dedicatedHostId;
    /**
     * @return The name of ECS Dedicated Host.
     * 
     */
    private String dedicatedHostName;
    /**
     * @return The type of the dedicated host.
     * 
     */
    private String dedicatedHostType;
    /**
     * @return The description of the dedicated host.
     * 
     */
    private String description;
    /**
     * @return The expiration time of the subscription dedicated host.
     * 
     */
    private String expiredTime;
    /**
     * @return The GPU model.
     * 
     */
    private String gpuSpec;
    /**
     * @return ID of the ECS Dedicated Host.
     * 
     */
    private String id;
    /**
     * @return The machine code of the dedicated host.
     * 
     */
    private String machineId;
    /**
     * @return dedicated host network parameters. contains the following attributes:
     * 
     */
    private List<GetDedicatedHostsHostNetworkAttribute> networkAttributes;
    /**
     * @return The reason why the dedicated host resource is locked.
     * 
     */
    private List<GetDedicatedHostsHostOperationLock> operationLocks;
    /**
     * @return The billing method of the dedicated host.
     * 
     */
    private String paymentType;
    /**
     * @return The number of physical GPUs.
     * 
     */
    private Integer physicalGpus;
    /**
     * @return The ID of the resource group to which the ECS Dedicated Host belongs.
     * 
     */
    private String resourceGroupId;
    /**
     * @return The unit of the subscription billing method.
     * 
     */
    private String saleCycle;
    /**
     * @return The number of physical CPUs.
     * 
     */
    private Integer sockets;
    /**
     * @return The status of the ECS Dedicated Host. validate value: `Available`, `Creating`, `PermanentFailure`, `Released`, `UnderAssessment`.
     * 
     */
    private String status;
    /**
     * @return (Available in 1.123.1+) A custom instance type family supported by a dedicated host.
     * 
     */
    private List<String> supportedCustomInstanceTypeFamilies;
    /**
     * @return (Available in 1.123.1+) ECS instance type family supported by the dedicated host.
     * 
     */
    private List<String> supportedInstanceTypeFamilies;
    /**
     * @return The list of ECS instance
     * 
     */
    private List<String> supportedInstanceTypesLists;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private Map<String,Object> tags;
    /**
     * @return The zone ID of the ECS Dedicated Host.
     * 
     */
    private String zoneId;

    private GetDedicatedHostsHost() {}
    /**
     * @return The policy used to migrate the instances from the dedicated host when the dedicated host fails or needs to be repaired online.
     * 
     */
    public String actionOnMaintenance() {
        return this.actionOnMaintenance;
    }
    /**
     * @return Specifies whether to add the dedicated host to the resource pool for automatic deployment.
     * 
     */
    public String autoPlacement() {
        return this.autoPlacement;
    }
    /**
     * @return The automatic release time of the dedicated host.
     * 
     */
    public String autoReleaseTime() {
        return this.autoReleaseTime;
    }
    /**
     * @return (Available in 1.123.1+) A collection of proprietary host performance indicators.
     * 
     */
    public List<GetDedicatedHostsHostCapacity> capacities() {
        return this.capacities;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Integer cores() {
        return this.cores;
    }
    /**
     * @return (Available in 1.123.1+) CPU oversold ratio.
     * 
     */
    public Double cpuOverCommitRatio() {
        return this.cpuOverCommitRatio;
    }
    /**
     * @return The ID of ECS Dedicated Host.
     * 
     */
    public String dedicatedHostId() {
        return this.dedicatedHostId;
    }
    /**
     * @return The name of ECS Dedicated Host.
     * 
     */
    public String dedicatedHostName() {
        return this.dedicatedHostName;
    }
    /**
     * @return The type of the dedicated host.
     * 
     */
    public String dedicatedHostType() {
        return this.dedicatedHostType;
    }
    /**
     * @return The description of the dedicated host.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The expiration time of the subscription dedicated host.
     * 
     */
    public String expiredTime() {
        return this.expiredTime;
    }
    /**
     * @return The GPU model.
     * 
     */
    public String gpuSpec() {
        return this.gpuSpec;
    }
    /**
     * @return ID of the ECS Dedicated Host.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The machine code of the dedicated host.
     * 
     */
    public String machineId() {
        return this.machineId;
    }
    /**
     * @return dedicated host network parameters. contains the following attributes:
     * 
     */
    public List<GetDedicatedHostsHostNetworkAttribute> networkAttributes() {
        return this.networkAttributes;
    }
    /**
     * @return The reason why the dedicated host resource is locked.
     * 
     */
    public List<GetDedicatedHostsHostOperationLock> operationLocks() {
        return this.operationLocks;
    }
    /**
     * @return The billing method of the dedicated host.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return The number of physical GPUs.
     * 
     */
    public Integer physicalGpus() {
        return this.physicalGpus;
    }
    /**
     * @return The ID of the resource group to which the ECS Dedicated Host belongs.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The unit of the subscription billing method.
     * 
     */
    public String saleCycle() {
        return this.saleCycle;
    }
    /**
     * @return The number of physical CPUs.
     * 
     */
    public Integer sockets() {
        return this.sockets;
    }
    /**
     * @return The status of the ECS Dedicated Host. validate value: `Available`, `Creating`, `PermanentFailure`, `Released`, `UnderAssessment`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return (Available in 1.123.1+) A custom instance type family supported by a dedicated host.
     * 
     */
    public List<String> supportedCustomInstanceTypeFamilies() {
        return this.supportedCustomInstanceTypeFamilies;
    }
    /**
     * @return (Available in 1.123.1+) ECS instance type family supported by the dedicated host.
     * 
     */
    public List<String> supportedInstanceTypeFamilies() {
        return this.supportedInstanceTypeFamilies;
    }
    /**
     * @return The list of ECS instance
     * 
     */
    public List<String> supportedInstanceTypesLists() {
        return this.supportedInstanceTypesLists;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return The zone ID of the ECS Dedicated Host.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedHostsHost defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String actionOnMaintenance;
        private String autoPlacement;
        private String autoReleaseTime;
        private List<GetDedicatedHostsHostCapacity> capacities;
        private Integer cores;
        private Double cpuOverCommitRatio;
        private String dedicatedHostId;
        private String dedicatedHostName;
        private String dedicatedHostType;
        private String description;
        private String expiredTime;
        private String gpuSpec;
        private String id;
        private String machineId;
        private List<GetDedicatedHostsHostNetworkAttribute> networkAttributes;
        private List<GetDedicatedHostsHostOperationLock> operationLocks;
        private String paymentType;
        private Integer physicalGpus;
        private String resourceGroupId;
        private String saleCycle;
        private Integer sockets;
        private String status;
        private List<String> supportedCustomInstanceTypeFamilies;
        private List<String> supportedInstanceTypeFamilies;
        private List<String> supportedInstanceTypesLists;
        private Map<String,Object> tags;
        private String zoneId;
        public Builder() {}
        public Builder(GetDedicatedHostsHost defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionOnMaintenance = defaults.actionOnMaintenance;
    	      this.autoPlacement = defaults.autoPlacement;
    	      this.autoReleaseTime = defaults.autoReleaseTime;
    	      this.capacities = defaults.capacities;
    	      this.cores = defaults.cores;
    	      this.cpuOverCommitRatio = defaults.cpuOverCommitRatio;
    	      this.dedicatedHostId = defaults.dedicatedHostId;
    	      this.dedicatedHostName = defaults.dedicatedHostName;
    	      this.dedicatedHostType = defaults.dedicatedHostType;
    	      this.description = defaults.description;
    	      this.expiredTime = defaults.expiredTime;
    	      this.gpuSpec = defaults.gpuSpec;
    	      this.id = defaults.id;
    	      this.machineId = defaults.machineId;
    	      this.networkAttributes = defaults.networkAttributes;
    	      this.operationLocks = defaults.operationLocks;
    	      this.paymentType = defaults.paymentType;
    	      this.physicalGpus = defaults.physicalGpus;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.saleCycle = defaults.saleCycle;
    	      this.sockets = defaults.sockets;
    	      this.status = defaults.status;
    	      this.supportedCustomInstanceTypeFamilies = defaults.supportedCustomInstanceTypeFamilies;
    	      this.supportedInstanceTypeFamilies = defaults.supportedInstanceTypeFamilies;
    	      this.supportedInstanceTypesLists = defaults.supportedInstanceTypesLists;
    	      this.tags = defaults.tags;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder actionOnMaintenance(String actionOnMaintenance) {
            if (actionOnMaintenance == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "actionOnMaintenance");
            }
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }
        @CustomType.Setter
        public Builder autoPlacement(String autoPlacement) {
            if (autoPlacement == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "autoPlacement");
            }
            this.autoPlacement = autoPlacement;
            return this;
        }
        @CustomType.Setter
        public Builder autoReleaseTime(String autoReleaseTime) {
            if (autoReleaseTime == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "autoReleaseTime");
            }
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        @CustomType.Setter
        public Builder capacities(List<GetDedicatedHostsHostCapacity> capacities) {
            if (capacities == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "capacities");
            }
            this.capacities = capacities;
            return this;
        }
        public Builder capacities(GetDedicatedHostsHostCapacity... capacities) {
            return capacities(List.of(capacities));
        }
        @CustomType.Setter
        public Builder cores(Integer cores) {
            if (cores == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "cores");
            }
            this.cores = cores;
            return this;
        }
        @CustomType.Setter
        public Builder cpuOverCommitRatio(Double cpuOverCommitRatio) {
            if (cpuOverCommitRatio == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "cpuOverCommitRatio");
            }
            this.cpuOverCommitRatio = cpuOverCommitRatio;
            return this;
        }
        @CustomType.Setter
        public Builder dedicatedHostId(String dedicatedHostId) {
            if (dedicatedHostId == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "dedicatedHostId");
            }
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        @CustomType.Setter
        public Builder dedicatedHostName(String dedicatedHostName) {
            if (dedicatedHostName == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "dedicatedHostName");
            }
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        @CustomType.Setter
        public Builder dedicatedHostType(String dedicatedHostType) {
            if (dedicatedHostType == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "dedicatedHostType");
            }
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder expiredTime(String expiredTime) {
            if (expiredTime == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "expiredTime");
            }
            this.expiredTime = expiredTime;
            return this;
        }
        @CustomType.Setter
        public Builder gpuSpec(String gpuSpec) {
            if (gpuSpec == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "gpuSpec");
            }
            this.gpuSpec = gpuSpec;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder machineId(String machineId) {
            if (machineId == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "machineId");
            }
            this.machineId = machineId;
            return this;
        }
        @CustomType.Setter
        public Builder networkAttributes(List<GetDedicatedHostsHostNetworkAttribute> networkAttributes) {
            if (networkAttributes == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "networkAttributes");
            }
            this.networkAttributes = networkAttributes;
            return this;
        }
        public Builder networkAttributes(GetDedicatedHostsHostNetworkAttribute... networkAttributes) {
            return networkAttributes(List.of(networkAttributes));
        }
        @CustomType.Setter
        public Builder operationLocks(List<GetDedicatedHostsHostOperationLock> operationLocks) {
            if (operationLocks == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "operationLocks");
            }
            this.operationLocks = operationLocks;
            return this;
        }
        public Builder operationLocks(GetDedicatedHostsHostOperationLock... operationLocks) {
            return operationLocks(List.of(operationLocks));
        }
        @CustomType.Setter
        public Builder paymentType(String paymentType) {
            if (paymentType == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "paymentType");
            }
            this.paymentType = paymentType;
            return this;
        }
        @CustomType.Setter
        public Builder physicalGpus(Integer physicalGpus) {
            if (physicalGpus == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "physicalGpus");
            }
            this.physicalGpus = physicalGpus;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            if (resourceGroupId == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "resourceGroupId");
            }
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder saleCycle(String saleCycle) {
            if (saleCycle == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "saleCycle");
            }
            this.saleCycle = saleCycle;
            return this;
        }
        @CustomType.Setter
        public Builder sockets(Integer sockets) {
            if (sockets == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "sockets");
            }
            this.sockets = sockets;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder supportedCustomInstanceTypeFamilies(List<String> supportedCustomInstanceTypeFamilies) {
            if (supportedCustomInstanceTypeFamilies == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "supportedCustomInstanceTypeFamilies");
            }
            this.supportedCustomInstanceTypeFamilies = supportedCustomInstanceTypeFamilies;
            return this;
        }
        public Builder supportedCustomInstanceTypeFamilies(String... supportedCustomInstanceTypeFamilies) {
            return supportedCustomInstanceTypeFamilies(List.of(supportedCustomInstanceTypeFamilies));
        }
        @CustomType.Setter
        public Builder supportedInstanceTypeFamilies(List<String> supportedInstanceTypeFamilies) {
            if (supportedInstanceTypeFamilies == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "supportedInstanceTypeFamilies");
            }
            this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
            return this;
        }
        public Builder supportedInstanceTypeFamilies(String... supportedInstanceTypeFamilies) {
            return supportedInstanceTypeFamilies(List.of(supportedInstanceTypeFamilies));
        }
        @CustomType.Setter
        public Builder supportedInstanceTypesLists(List<String> supportedInstanceTypesLists) {
            if (supportedInstanceTypesLists == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "supportedInstanceTypesLists");
            }
            this.supportedInstanceTypesLists = supportedInstanceTypesLists;
            return this;
        }
        public Builder supportedInstanceTypesLists(String... supportedInstanceTypesLists) {
            return supportedInstanceTypesLists(List.of(supportedInstanceTypesLists));
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetDedicatedHostsHost", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetDedicatedHostsHost build() {
            final var _resultValue = new GetDedicatedHostsHost();
            _resultValue.actionOnMaintenance = actionOnMaintenance;
            _resultValue.autoPlacement = autoPlacement;
            _resultValue.autoReleaseTime = autoReleaseTime;
            _resultValue.capacities = capacities;
            _resultValue.cores = cores;
            _resultValue.cpuOverCommitRatio = cpuOverCommitRatio;
            _resultValue.dedicatedHostId = dedicatedHostId;
            _resultValue.dedicatedHostName = dedicatedHostName;
            _resultValue.dedicatedHostType = dedicatedHostType;
            _resultValue.description = description;
            _resultValue.expiredTime = expiredTime;
            _resultValue.gpuSpec = gpuSpec;
            _resultValue.id = id;
            _resultValue.machineId = machineId;
            _resultValue.networkAttributes = networkAttributes;
            _resultValue.operationLocks = operationLocks;
            _resultValue.paymentType = paymentType;
            _resultValue.physicalGpus = physicalGpus;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.saleCycle = saleCycle;
            _resultValue.sockets = sockets;
            _resultValue.status = status;
            _resultValue.supportedCustomInstanceTypeFamilies = supportedCustomInstanceTypeFamilies;
            _resultValue.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
            _resultValue.supportedInstanceTypesLists = supportedInstanceTypesLists;
            _resultValue.tags = tags;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}