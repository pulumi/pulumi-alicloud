// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.alicloud.dns.outputs.GetAccessStrategiesStrategyDefaultAddrPool;
import com.pulumi.alicloud.dns.outputs.GetAccessStrategiesStrategyFailoverAddrPool;
import com.pulumi.alicloud.dns.outputs.GetAccessStrategiesStrategyLine;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccessStrategiesStrategy {
    /**
     * @return The primary/secondary switchover policy for address pool groups.
     * 
     */
    private final String accessMode;
    /**
     * @return The first ID of the resource.
     * 
     */
    private final String accessStrategyId;
    /**
     * @return The time when the access policy was created.
     * 
     */
    private final String createTime;
    /**
     * @return The timestamp that indicates when the access policy was created.
     * 
     */
    private final String createTimestamp;
    /**
     * @return The type of the primary address pool.
     * 
     */
    private final String defaultAddrPoolType;
    /**
     * @return The address pools in the primary address pool group.
     * 
     */
    private final List<GetAccessStrategiesStrategyDefaultAddrPool> defaultAddrPools;
    /**
     * @return The number of addresses currently available in the primary address pool.
     * 
     */
    private final Integer defaultAvailableAddrNum;
    /**
     * @return Indicates whether scheduling optimization for latency resolution was enabled for the primary address pool group.
     * 
     */
    private final String defaultLatencyOptimization;
    /**
     * @return The load balancing policy of the primary address pool group.
     * 
     */
    private final String defaultLbaStrategy;
    /**
     * @return The maximum number of addresses returned by the primary address pool set.
     * 
     */
    private final Integer defaultMaxReturnAddrNum;
    /**
     * @return The minimum number of available addresses for the primary address pool set.
     * 
     */
    private final Integer defaultMinAvailableAddrNum;
    /**
     * @return The type of the active address pool group.
     * 
     */
    private final String effectiveAddrPoolGroupType;
    /**
     * @return The type of the secondary address pool.
     * 
     */
    private final String failoverAddrPoolType;
    /**
     * @return The address pools in the secondary address pool group.
     * 
     */
    private final List<GetAccessStrategiesStrategyFailoverAddrPool> failoverAddrPools;
    /**
     * @return The number of available addresses in the standby address pool.
     * 
     */
    private final Integer failoverAvailableAddrNum;
    /**
     * @return Indicates whether scheduling optimization for latency resolution was enabled for the secondary address pool group.
     * 
     */
    private final String failoverLatencyOptimization;
    /**
     * @return The load balancing policy of the secondary address pool group.
     * 
     */
    private final String failoverLbaStrategy;
    /**
     * @return The maximum number of returned addresses in the standby address pool.
     * 
     */
    private final Integer failoverMaxReturnAddrNum;
    /**
     * @return The minimum number of available addresses in the standby address pool.
     * 
     */
    private final Integer failoverMinAvailableAddrNum;
    /**
     * @return The ID of the Access Strategy.
     * 
     */
    private final String id;
    /**
     * @return The Id of the associated instance.
     * 
     */
    private final String instanceId;
    /**
     * @return List of source regions.
     * 
     */
    private final List<GetAccessStrategiesStrategyLine> lines;
    /**
     * @return The type of the access policy.
     * 
     */
    private final String strategyMode;
    /**
     * @return The name of the access policy.
     * 
     */
    private final String strategyName;

    @CustomType.Constructor
    private GetAccessStrategiesStrategy(
        @CustomType.Parameter("accessMode") String accessMode,
        @CustomType.Parameter("accessStrategyId") String accessStrategyId,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("createTimestamp") String createTimestamp,
        @CustomType.Parameter("defaultAddrPoolType") String defaultAddrPoolType,
        @CustomType.Parameter("defaultAddrPools") List<GetAccessStrategiesStrategyDefaultAddrPool> defaultAddrPools,
        @CustomType.Parameter("defaultAvailableAddrNum") Integer defaultAvailableAddrNum,
        @CustomType.Parameter("defaultLatencyOptimization") String defaultLatencyOptimization,
        @CustomType.Parameter("defaultLbaStrategy") String defaultLbaStrategy,
        @CustomType.Parameter("defaultMaxReturnAddrNum") Integer defaultMaxReturnAddrNum,
        @CustomType.Parameter("defaultMinAvailableAddrNum") Integer defaultMinAvailableAddrNum,
        @CustomType.Parameter("effectiveAddrPoolGroupType") String effectiveAddrPoolGroupType,
        @CustomType.Parameter("failoverAddrPoolType") String failoverAddrPoolType,
        @CustomType.Parameter("failoverAddrPools") List<GetAccessStrategiesStrategyFailoverAddrPool> failoverAddrPools,
        @CustomType.Parameter("failoverAvailableAddrNum") Integer failoverAvailableAddrNum,
        @CustomType.Parameter("failoverLatencyOptimization") String failoverLatencyOptimization,
        @CustomType.Parameter("failoverLbaStrategy") String failoverLbaStrategy,
        @CustomType.Parameter("failoverMaxReturnAddrNum") Integer failoverMaxReturnAddrNum,
        @CustomType.Parameter("failoverMinAvailableAddrNum") Integer failoverMinAvailableAddrNum,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("lines") List<GetAccessStrategiesStrategyLine> lines,
        @CustomType.Parameter("strategyMode") String strategyMode,
        @CustomType.Parameter("strategyName") String strategyName) {
        this.accessMode = accessMode;
        this.accessStrategyId = accessStrategyId;
        this.createTime = createTime;
        this.createTimestamp = createTimestamp;
        this.defaultAddrPoolType = defaultAddrPoolType;
        this.defaultAddrPools = defaultAddrPools;
        this.defaultAvailableAddrNum = defaultAvailableAddrNum;
        this.defaultLatencyOptimization = defaultLatencyOptimization;
        this.defaultLbaStrategy = defaultLbaStrategy;
        this.defaultMaxReturnAddrNum = defaultMaxReturnAddrNum;
        this.defaultMinAvailableAddrNum = defaultMinAvailableAddrNum;
        this.effectiveAddrPoolGroupType = effectiveAddrPoolGroupType;
        this.failoverAddrPoolType = failoverAddrPoolType;
        this.failoverAddrPools = failoverAddrPools;
        this.failoverAvailableAddrNum = failoverAvailableAddrNum;
        this.failoverLatencyOptimization = failoverLatencyOptimization;
        this.failoverLbaStrategy = failoverLbaStrategy;
        this.failoverMaxReturnAddrNum = failoverMaxReturnAddrNum;
        this.failoverMinAvailableAddrNum = failoverMinAvailableAddrNum;
        this.id = id;
        this.instanceId = instanceId;
        this.lines = lines;
        this.strategyMode = strategyMode;
        this.strategyName = strategyName;
    }

    /**
     * @return The primary/secondary switchover policy for address pool groups.
     * 
     */
    public String accessMode() {
        return this.accessMode;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String accessStrategyId() {
        return this.accessStrategyId;
    }
    /**
     * @return The time when the access policy was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The timestamp that indicates when the access policy was created.
     * 
     */
    public String createTimestamp() {
        return this.createTimestamp;
    }
    /**
     * @return The type of the primary address pool.
     * 
     */
    public String defaultAddrPoolType() {
        return this.defaultAddrPoolType;
    }
    /**
     * @return The address pools in the primary address pool group.
     * 
     */
    public List<GetAccessStrategiesStrategyDefaultAddrPool> defaultAddrPools() {
        return this.defaultAddrPools;
    }
    /**
     * @return The number of addresses currently available in the primary address pool.
     * 
     */
    public Integer defaultAvailableAddrNum() {
        return this.defaultAvailableAddrNum;
    }
    /**
     * @return Indicates whether scheduling optimization for latency resolution was enabled for the primary address pool group.
     * 
     */
    public String defaultLatencyOptimization() {
        return this.defaultLatencyOptimization;
    }
    /**
     * @return The load balancing policy of the primary address pool group.
     * 
     */
    public String defaultLbaStrategy() {
        return this.defaultLbaStrategy;
    }
    /**
     * @return The maximum number of addresses returned by the primary address pool set.
     * 
     */
    public Integer defaultMaxReturnAddrNum() {
        return this.defaultMaxReturnAddrNum;
    }
    /**
     * @return The minimum number of available addresses for the primary address pool set.
     * 
     */
    public Integer defaultMinAvailableAddrNum() {
        return this.defaultMinAvailableAddrNum;
    }
    /**
     * @return The type of the active address pool group.
     * 
     */
    public String effectiveAddrPoolGroupType() {
        return this.effectiveAddrPoolGroupType;
    }
    /**
     * @return The type of the secondary address pool.
     * 
     */
    public String failoverAddrPoolType() {
        return this.failoverAddrPoolType;
    }
    /**
     * @return The address pools in the secondary address pool group.
     * 
     */
    public List<GetAccessStrategiesStrategyFailoverAddrPool> failoverAddrPools() {
        return this.failoverAddrPools;
    }
    /**
     * @return The number of available addresses in the standby address pool.
     * 
     */
    public Integer failoverAvailableAddrNum() {
        return this.failoverAvailableAddrNum;
    }
    /**
     * @return Indicates whether scheduling optimization for latency resolution was enabled for the secondary address pool group.
     * 
     */
    public String failoverLatencyOptimization() {
        return this.failoverLatencyOptimization;
    }
    /**
     * @return The load balancing policy of the secondary address pool group.
     * 
     */
    public String failoverLbaStrategy() {
        return this.failoverLbaStrategy;
    }
    /**
     * @return The maximum number of returned addresses in the standby address pool.
     * 
     */
    public Integer failoverMaxReturnAddrNum() {
        return this.failoverMaxReturnAddrNum;
    }
    /**
     * @return The minimum number of available addresses in the standby address pool.
     * 
     */
    public Integer failoverMinAvailableAddrNum() {
        return this.failoverMinAvailableAddrNum;
    }
    /**
     * @return The ID of the Access Strategy.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Id of the associated instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return List of source regions.
     * 
     */
    public List<GetAccessStrategiesStrategyLine> lines() {
        return this.lines;
    }
    /**
     * @return The type of the access policy.
     * 
     */
    public String strategyMode() {
        return this.strategyMode;
    }
    /**
     * @return The name of the access policy.
     * 
     */
    public String strategyName() {
        return this.strategyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessStrategiesStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessMode;
        private String accessStrategyId;
        private String createTime;
        private String createTimestamp;
        private String defaultAddrPoolType;
        private List<GetAccessStrategiesStrategyDefaultAddrPool> defaultAddrPools;
        private Integer defaultAvailableAddrNum;
        private String defaultLatencyOptimization;
        private String defaultLbaStrategy;
        private Integer defaultMaxReturnAddrNum;
        private Integer defaultMinAvailableAddrNum;
        private String effectiveAddrPoolGroupType;
        private String failoverAddrPoolType;
        private List<GetAccessStrategiesStrategyFailoverAddrPool> failoverAddrPools;
        private Integer failoverAvailableAddrNum;
        private String failoverLatencyOptimization;
        private String failoverLbaStrategy;
        private Integer failoverMaxReturnAddrNum;
        private Integer failoverMinAvailableAddrNum;
        private String id;
        private String instanceId;
        private List<GetAccessStrategiesStrategyLine> lines;
        private String strategyMode;
        private String strategyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessStrategiesStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessMode = defaults.accessMode;
    	      this.accessStrategyId = defaults.accessStrategyId;
    	      this.createTime = defaults.createTime;
    	      this.createTimestamp = defaults.createTimestamp;
    	      this.defaultAddrPoolType = defaults.defaultAddrPoolType;
    	      this.defaultAddrPools = defaults.defaultAddrPools;
    	      this.defaultAvailableAddrNum = defaults.defaultAvailableAddrNum;
    	      this.defaultLatencyOptimization = defaults.defaultLatencyOptimization;
    	      this.defaultLbaStrategy = defaults.defaultLbaStrategy;
    	      this.defaultMaxReturnAddrNum = defaults.defaultMaxReturnAddrNum;
    	      this.defaultMinAvailableAddrNum = defaults.defaultMinAvailableAddrNum;
    	      this.effectiveAddrPoolGroupType = defaults.effectiveAddrPoolGroupType;
    	      this.failoverAddrPoolType = defaults.failoverAddrPoolType;
    	      this.failoverAddrPools = defaults.failoverAddrPools;
    	      this.failoverAvailableAddrNum = defaults.failoverAvailableAddrNum;
    	      this.failoverLatencyOptimization = defaults.failoverLatencyOptimization;
    	      this.failoverLbaStrategy = defaults.failoverLbaStrategy;
    	      this.failoverMaxReturnAddrNum = defaults.failoverMaxReturnAddrNum;
    	      this.failoverMinAvailableAddrNum = defaults.failoverMinAvailableAddrNum;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.lines = defaults.lines;
    	      this.strategyMode = defaults.strategyMode;
    	      this.strategyName = defaults.strategyName;
        }

        public Builder accessMode(String accessMode) {
            this.accessMode = Objects.requireNonNull(accessMode);
            return this;
        }
        public Builder accessStrategyId(String accessStrategyId) {
            this.accessStrategyId = Objects.requireNonNull(accessStrategyId);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder createTimestamp(String createTimestamp) {
            this.createTimestamp = Objects.requireNonNull(createTimestamp);
            return this;
        }
        public Builder defaultAddrPoolType(String defaultAddrPoolType) {
            this.defaultAddrPoolType = Objects.requireNonNull(defaultAddrPoolType);
            return this;
        }
        public Builder defaultAddrPools(List<GetAccessStrategiesStrategyDefaultAddrPool> defaultAddrPools) {
            this.defaultAddrPools = Objects.requireNonNull(defaultAddrPools);
            return this;
        }
        public Builder defaultAddrPools(GetAccessStrategiesStrategyDefaultAddrPool... defaultAddrPools) {
            return defaultAddrPools(List.of(defaultAddrPools));
        }
        public Builder defaultAvailableAddrNum(Integer defaultAvailableAddrNum) {
            this.defaultAvailableAddrNum = Objects.requireNonNull(defaultAvailableAddrNum);
            return this;
        }
        public Builder defaultLatencyOptimization(String defaultLatencyOptimization) {
            this.defaultLatencyOptimization = Objects.requireNonNull(defaultLatencyOptimization);
            return this;
        }
        public Builder defaultLbaStrategy(String defaultLbaStrategy) {
            this.defaultLbaStrategy = Objects.requireNonNull(defaultLbaStrategy);
            return this;
        }
        public Builder defaultMaxReturnAddrNum(Integer defaultMaxReturnAddrNum) {
            this.defaultMaxReturnAddrNum = Objects.requireNonNull(defaultMaxReturnAddrNum);
            return this;
        }
        public Builder defaultMinAvailableAddrNum(Integer defaultMinAvailableAddrNum) {
            this.defaultMinAvailableAddrNum = Objects.requireNonNull(defaultMinAvailableAddrNum);
            return this;
        }
        public Builder effectiveAddrPoolGroupType(String effectiveAddrPoolGroupType) {
            this.effectiveAddrPoolGroupType = Objects.requireNonNull(effectiveAddrPoolGroupType);
            return this;
        }
        public Builder failoverAddrPoolType(String failoverAddrPoolType) {
            this.failoverAddrPoolType = Objects.requireNonNull(failoverAddrPoolType);
            return this;
        }
        public Builder failoverAddrPools(List<GetAccessStrategiesStrategyFailoverAddrPool> failoverAddrPools) {
            this.failoverAddrPools = Objects.requireNonNull(failoverAddrPools);
            return this;
        }
        public Builder failoverAddrPools(GetAccessStrategiesStrategyFailoverAddrPool... failoverAddrPools) {
            return failoverAddrPools(List.of(failoverAddrPools));
        }
        public Builder failoverAvailableAddrNum(Integer failoverAvailableAddrNum) {
            this.failoverAvailableAddrNum = Objects.requireNonNull(failoverAvailableAddrNum);
            return this;
        }
        public Builder failoverLatencyOptimization(String failoverLatencyOptimization) {
            this.failoverLatencyOptimization = Objects.requireNonNull(failoverLatencyOptimization);
            return this;
        }
        public Builder failoverLbaStrategy(String failoverLbaStrategy) {
            this.failoverLbaStrategy = Objects.requireNonNull(failoverLbaStrategy);
            return this;
        }
        public Builder failoverMaxReturnAddrNum(Integer failoverMaxReturnAddrNum) {
            this.failoverMaxReturnAddrNum = Objects.requireNonNull(failoverMaxReturnAddrNum);
            return this;
        }
        public Builder failoverMinAvailableAddrNum(Integer failoverMinAvailableAddrNum) {
            this.failoverMinAvailableAddrNum = Objects.requireNonNull(failoverMinAvailableAddrNum);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder lines(List<GetAccessStrategiesStrategyLine> lines) {
            this.lines = Objects.requireNonNull(lines);
            return this;
        }
        public Builder lines(GetAccessStrategiesStrategyLine... lines) {
            return lines(List.of(lines));
        }
        public Builder strategyMode(String strategyMode) {
            this.strategyMode = Objects.requireNonNull(strategyMode);
            return this;
        }
        public Builder strategyName(String strategyName) {
            this.strategyName = Objects.requireNonNull(strategyName);
            return this;
        }        public GetAccessStrategiesStrategy build() {
            return new GetAccessStrategiesStrategy(accessMode, accessStrategyId, createTime, createTimestamp, defaultAddrPoolType, defaultAddrPools, defaultAvailableAddrNum, defaultLatencyOptimization, defaultLbaStrategy, defaultMaxReturnAddrNum, defaultMinAvailableAddrNum, effectiveAddrPoolGroupType, failoverAddrPoolType, failoverAddrPools, failoverAvailableAddrNum, failoverLatencyOptimization, failoverLbaStrategy, failoverMaxReturnAddrNum, failoverMinAvailableAddrNum, id, instanceId, lines, strategyMode, strategyName);
        }
    }
}