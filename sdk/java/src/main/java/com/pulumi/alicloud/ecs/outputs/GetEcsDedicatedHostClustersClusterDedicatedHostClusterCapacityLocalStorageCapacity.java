// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacity {
    /**
     * @return The available capacity of the local disk. Unit: `GiB`.
     * 
     */
    private final Integer availableDisk;
    /**
     * @return The category of the data disk. Valid values:`cloud`, `cloud_efficiency`, `cloud_ssd`, `ephemeral_ssd`, `cloud_essd`.
     * 
     */
    private final String dataDiskCategory;
    /**
     * @return The total capacity of the local disk. Unit: `GiB`.
     * 
     */
    private final Integer totalDisk;

    @CustomType.Constructor
    private GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacity(
        @CustomType.Parameter("availableDisk") Integer availableDisk,
        @CustomType.Parameter("dataDiskCategory") String dataDiskCategory,
        @CustomType.Parameter("totalDisk") Integer totalDisk) {
        this.availableDisk = availableDisk;
        this.dataDiskCategory = dataDiskCategory;
        this.totalDisk = totalDisk;
    }

    /**
     * @return The available capacity of the local disk. Unit: `GiB`.
     * 
     */
    public Integer availableDisk() {
        return this.availableDisk;
    }
    /**
     * @return The category of the data disk. Valid values:`cloud`, `cloud_efficiency`, `cloud_ssd`, `ephemeral_ssd`, `cloud_essd`.
     * 
     */
    public String dataDiskCategory() {
        return this.dataDiskCategory;
    }
    /**
     * @return The total capacity of the local disk. Unit: `GiB`.
     * 
     */
    public Integer totalDisk() {
        return this.totalDisk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer availableDisk;
        private String dataDiskCategory;
        private Integer totalDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableDisk = defaults.availableDisk;
    	      this.dataDiskCategory = defaults.dataDiskCategory;
    	      this.totalDisk = defaults.totalDisk;
        }

        public Builder availableDisk(Integer availableDisk) {
            this.availableDisk = Objects.requireNonNull(availableDisk);
            return this;
        }
        public Builder dataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = Objects.requireNonNull(dataDiskCategory);
            return this;
        }
        public Builder totalDisk(Integer totalDisk) {
            this.totalDisk = Objects.requireNonNull(totalDisk);
            return this;
        }        public GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacity build() {
            return new GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacity(availableDisk, dataDiskCategory, totalDisk);
        }
    }
}