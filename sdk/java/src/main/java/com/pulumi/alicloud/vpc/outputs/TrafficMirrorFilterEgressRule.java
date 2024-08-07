// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TrafficMirrorFilterEgressRule {
    private String action;
    private @Nullable String destinationCidrBlock;
    private @Nullable String destinationPortRange;
    private @Nullable Integer priority;
    private String protocol;
    private @Nullable String sourceCidrBlock;
    private @Nullable String sourcePortRange;
    private @Nullable String trafficMirrorFilterRuleStatus;

    private TrafficMirrorFilterEgressRule() {}
    public String action() {
        return this.action;
    }
    public Optional<String> destinationCidrBlock() {
        return Optional.ofNullable(this.destinationCidrBlock);
    }
    public Optional<String> destinationPortRange() {
        return Optional.ofNullable(this.destinationPortRange);
    }
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    public String protocol() {
        return this.protocol;
    }
    public Optional<String> sourceCidrBlock() {
        return Optional.ofNullable(this.sourceCidrBlock);
    }
    public Optional<String> sourcePortRange() {
        return Optional.ofNullable(this.sourcePortRange);
    }
    public Optional<String> trafficMirrorFilterRuleStatus() {
        return Optional.ofNullable(this.trafficMirrorFilterRuleStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficMirrorFilterEgressRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private @Nullable String destinationCidrBlock;
        private @Nullable String destinationPortRange;
        private @Nullable Integer priority;
        private String protocol;
        private @Nullable String sourceCidrBlock;
        private @Nullable String sourcePortRange;
        private @Nullable String trafficMirrorFilterRuleStatus;
        public Builder() {}
        public Builder(TrafficMirrorFilterEgressRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.destinationPortRange = defaults.destinationPortRange;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.sourceCidrBlock = defaults.sourceCidrBlock;
    	      this.sourcePortRange = defaults.sourcePortRange;
    	      this.trafficMirrorFilterRuleStatus = defaults.trafficMirrorFilterRuleStatus;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("TrafficMirrorFilterEgressRule", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder destinationCidrBlock(@Nullable String destinationCidrBlock) {

            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder destinationPortRange(@Nullable String destinationPortRange) {

            this.destinationPortRange = destinationPortRange;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable Integer priority) {

            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("TrafficMirrorFilterEgressRule", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder sourceCidrBlock(@Nullable String sourceCidrBlock) {

            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePortRange(@Nullable String sourcePortRange) {

            this.sourcePortRange = sourcePortRange;
            return this;
        }
        @CustomType.Setter
        public Builder trafficMirrorFilterRuleStatus(@Nullable String trafficMirrorFilterRuleStatus) {

            this.trafficMirrorFilterRuleStatus = trafficMirrorFilterRuleStatus;
            return this;
        }
        public TrafficMirrorFilterEgressRule build() {
            final var _resultValue = new TrafficMirrorFilterEgressRule();
            _resultValue.action = action;
            _resultValue.destinationCidrBlock = destinationCidrBlock;
            _resultValue.destinationPortRange = destinationPortRange;
            _resultValue.priority = priority;
            _resultValue.protocol = protocol;
            _resultValue.sourceCidrBlock = sourceCidrBlock;
            _resultValue.sourcePortRange = sourcePortRange;
            _resultValue.trafficMirrorFilterRuleStatus = trafficMirrorFilterRuleStatus;
            return _resultValue;
        }
    }
}
