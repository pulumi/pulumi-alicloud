// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacity;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacity {
    /**
     * @return The available memory size. Unit: `GiB`.
     * 
     */
    private final Integer availableMemory;
    /**
     * @return The number of available vCPUs.
     * 
     */
    private final Integer availableVcpus;
    /**
     * @return The local storage.
     * 
     */
    private final List<GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacity> localStorageCapacities;
    /**
     * @return The total memory size. Unit: `GiB`.
     * 
     */
    private final Integer totalMemory;
    /**
     * @return The total number of vCPUs.
     * 
     */
    private final Integer totalVcpus;

    @CustomType.Constructor
    private GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacity(
        @CustomType.Parameter("availableMemory") Integer availableMemory,
        @CustomType.Parameter("availableVcpus") Integer availableVcpus,
        @CustomType.Parameter("localStorageCapacities") List<GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacity> localStorageCapacities,
        @CustomType.Parameter("totalMemory") Integer totalMemory,
        @CustomType.Parameter("totalVcpus") Integer totalVcpus) {
        this.availableMemory = availableMemory;
        this.availableVcpus = availableVcpus;
        this.localStorageCapacities = localStorageCapacities;
        this.totalMemory = totalMemory;
        this.totalVcpus = totalVcpus;
    }

    /**
     * @return The available memory size. Unit: `GiB`.
     * 
     */
    public Integer availableMemory() {
        return this.availableMemory;
    }
    /**
     * @return The number of available vCPUs.
     * 
     */
    public Integer availableVcpus() {
        return this.availableVcpus;
    }
    /**
     * @return The local storage.
     * 
     */
    public List<GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacity> localStorageCapacities() {
        return this.localStorageCapacities;
    }
    /**
     * @return The total memory size. Unit: `GiB`.
     * 
     */
    public Integer totalMemory() {
        return this.totalMemory;
    }
    /**
     * @return The total number of vCPUs.
     * 
     */
    public Integer totalVcpus() {
        return this.totalVcpus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer availableMemory;
        private Integer availableVcpus;
        private List<GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacity> localStorageCapacities;
        private Integer totalMemory;
        private Integer totalVcpus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableMemory = defaults.availableMemory;
    	      this.availableVcpus = defaults.availableVcpus;
    	      this.localStorageCapacities = defaults.localStorageCapacities;
    	      this.totalMemory = defaults.totalMemory;
    	      this.totalVcpus = defaults.totalVcpus;
        }

        public Builder availableMemory(Integer availableMemory) {
            this.availableMemory = Objects.requireNonNull(availableMemory);
            return this;
        }
        public Builder availableVcpus(Integer availableVcpus) {
            this.availableVcpus = Objects.requireNonNull(availableVcpus);
            return this;
        }
        public Builder localStorageCapacities(List<GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacity> localStorageCapacities) {
            this.localStorageCapacities = Objects.requireNonNull(localStorageCapacities);
            return this;
        }
        public Builder localStorageCapacities(GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacity... localStorageCapacities) {
            return localStorageCapacities(List.of(localStorageCapacities));
        }
        public Builder totalMemory(Integer totalMemory) {
            this.totalMemory = Objects.requireNonNull(totalMemory);
            return this;
        }
        public Builder totalVcpus(Integer totalVcpus) {
            this.totalVcpus = Objects.requireNonNull(totalVcpus);
            return this;
        }        public GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacity build() {
            return new GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacity(availableMemory, availableVcpus, localStorageCapacities, totalMemory, totalVcpus);
        }
    }
}