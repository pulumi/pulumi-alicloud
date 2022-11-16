// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.simpleapplicationserver.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerPlansPlan {
    /**
     * @return The peak bandwidth. Unit: Mbit/s.
     * 
     */
    private final Integer bandwidth;
    /**
     * @return The number of CPU cores.
     * 
     */
    private final Integer core;
    /**
     * @return The size of the enhanced SSD (ESSD). Unit: GB.
     * 
     */
    private final Integer diskSize;
    /**
     * @return The monthly data transfer quota. Unit: GB.
     * 
     */
    private final Integer flow;
    /**
     * @return The ID of the Instance Plan.
     * 
     */
    private final String id;
    /**
     * @return The memory size. Unit: GB.
     * 
     */
    private final Integer memory;
    /**
     * @return The ID of the Instance Plan.
     * 
     */
    private final String planId;
    /**
     * @return The platform of Plan supported.
     * 
     */
    private final String supportPlatform;

    @CustomType.Constructor
    private GetServerPlansPlan(
        @CustomType.Parameter("bandwidth") Integer bandwidth,
        @CustomType.Parameter("core") Integer core,
        @CustomType.Parameter("diskSize") Integer diskSize,
        @CustomType.Parameter("flow") Integer flow,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("memory") Integer memory,
        @CustomType.Parameter("planId") String planId,
        @CustomType.Parameter("supportPlatform") String supportPlatform) {
        this.bandwidth = bandwidth;
        this.core = core;
        this.diskSize = diskSize;
        this.flow = flow;
        this.id = id;
        this.memory = memory;
        this.planId = planId;
        this.supportPlatform = supportPlatform;
    }

    /**
     * @return The peak bandwidth. Unit: Mbit/s.
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return The number of CPU cores.
     * 
     */
    public Integer core() {
        return this.core;
    }
    /**
     * @return The size of the enhanced SSD (ESSD). Unit: GB.
     * 
     */
    public Integer diskSize() {
        return this.diskSize;
    }
    /**
     * @return The monthly data transfer quota. Unit: GB.
     * 
     */
    public Integer flow() {
        return this.flow;
    }
    /**
     * @return The ID of the Instance Plan.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The memory size. Unit: GB.
     * 
     */
    public Integer memory() {
        return this.memory;
    }
    /**
     * @return The ID of the Instance Plan.
     * 
     */
    public String planId() {
        return this.planId;
    }
    /**
     * @return The platform of Plan supported.
     * 
     */
    public String supportPlatform() {
        return this.supportPlatform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerPlansPlan defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bandwidth;
        private Integer core;
        private Integer diskSize;
        private Integer flow;
        private String id;
        private Integer memory;
        private String planId;
        private String supportPlatform;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerPlansPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.core = defaults.core;
    	      this.diskSize = defaults.diskSize;
    	      this.flow = defaults.flow;
    	      this.id = defaults.id;
    	      this.memory = defaults.memory;
    	      this.planId = defaults.planId;
    	      this.supportPlatform = defaults.supportPlatform;
        }

        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        public Builder core(Integer core) {
            this.core = Objects.requireNonNull(core);
            return this;
        }
        public Builder diskSize(Integer diskSize) {
            this.diskSize = Objects.requireNonNull(diskSize);
            return this;
        }
        public Builder flow(Integer flow) {
            this.flow = Objects.requireNonNull(flow);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder memory(Integer memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }
        public Builder planId(String planId) {
            this.planId = Objects.requireNonNull(planId);
            return this;
        }
        public Builder supportPlatform(String supportPlatform) {
            this.supportPlatform = Objects.requireNonNull(supportPlatform);
            return this;
        }        public GetServerPlansPlan build() {
            return new GetServerPlansPlan(bandwidth, core, diskSize, flow, id, memory, planId, supportPlatform);
        }
    }
}