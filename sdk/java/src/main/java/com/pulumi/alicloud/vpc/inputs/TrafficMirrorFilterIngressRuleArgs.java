// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrafficMirrorFilterIngressRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorFilterIngressRuleArgs Empty = new TrafficMirrorFilterIngressRuleArgs();

    @Import(name="action", required=true)
    private Output<String> action;

    public Output<String> action() {
        return this.action;
    }

    @Import(name="destinationCidrBlock")
    private @Nullable Output<String> destinationCidrBlock;

    public Optional<Output<String>> destinationCidrBlock() {
        return Optional.ofNullable(this.destinationCidrBlock);
    }

    @Import(name="destinationPortRange")
    private @Nullable Output<String> destinationPortRange;

    public Optional<Output<String>> destinationPortRange() {
        return Optional.ofNullable(this.destinationPortRange);
    }

    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    @Import(name="protocol", required=true)
    private Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol;
    }

    @Import(name="sourceCidrBlock")
    private @Nullable Output<String> sourceCidrBlock;

    public Optional<Output<String>> sourceCidrBlock() {
        return Optional.ofNullable(this.sourceCidrBlock);
    }

    @Import(name="sourcePortRange")
    private @Nullable Output<String> sourcePortRange;

    public Optional<Output<String>> sourcePortRange() {
        return Optional.ofNullable(this.sourcePortRange);
    }

    @Import(name="trafficMirrorFilterRuleStatus")
    private @Nullable Output<String> trafficMirrorFilterRuleStatus;

    public Optional<Output<String>> trafficMirrorFilterRuleStatus() {
        return Optional.ofNullable(this.trafficMirrorFilterRuleStatus);
    }

    private TrafficMirrorFilterIngressRuleArgs() {}

    private TrafficMirrorFilterIngressRuleArgs(TrafficMirrorFilterIngressRuleArgs $) {
        this.action = $.action;
        this.destinationCidrBlock = $.destinationCidrBlock;
        this.destinationPortRange = $.destinationPortRange;
        this.priority = $.priority;
        this.protocol = $.protocol;
        this.sourceCidrBlock = $.sourceCidrBlock;
        this.sourcePortRange = $.sourcePortRange;
        this.trafficMirrorFilterRuleStatus = $.trafficMirrorFilterRuleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficMirrorFilterIngressRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficMirrorFilterIngressRuleArgs $;

        public Builder() {
            $ = new TrafficMirrorFilterIngressRuleArgs();
        }

        public Builder(TrafficMirrorFilterIngressRuleArgs defaults) {
            $ = new TrafficMirrorFilterIngressRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder destinationCidrBlock(@Nullable Output<String> destinationCidrBlock) {
            $.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        public Builder destinationCidrBlock(String destinationCidrBlock) {
            return destinationCidrBlock(Output.of(destinationCidrBlock));
        }

        public Builder destinationPortRange(@Nullable Output<String> destinationPortRange) {
            $.destinationPortRange = destinationPortRange;
            return this;
        }

        public Builder destinationPortRange(String destinationPortRange) {
            return destinationPortRange(Output.of(destinationPortRange));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder sourceCidrBlock(@Nullable Output<String> sourceCidrBlock) {
            $.sourceCidrBlock = sourceCidrBlock;
            return this;
        }

        public Builder sourceCidrBlock(String sourceCidrBlock) {
            return sourceCidrBlock(Output.of(sourceCidrBlock));
        }

        public Builder sourcePortRange(@Nullable Output<String> sourcePortRange) {
            $.sourcePortRange = sourcePortRange;
            return this;
        }

        public Builder sourcePortRange(String sourcePortRange) {
            return sourcePortRange(Output.of(sourcePortRange));
        }

        public Builder trafficMirrorFilterRuleStatus(@Nullable Output<String> trafficMirrorFilterRuleStatus) {
            $.trafficMirrorFilterRuleStatus = trafficMirrorFilterRuleStatus;
            return this;
        }

        public Builder trafficMirrorFilterRuleStatus(String trafficMirrorFilterRuleStatus) {
            return trafficMirrorFilterRuleStatus(Output.of(trafficMirrorFilterRuleStatus));
        }

        public TrafficMirrorFilterIngressRuleArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("TrafficMirrorFilterIngressRuleArgs", "action");
            }
            if ($.protocol == null) {
                throw new MissingRequiredPropertyException("TrafficMirrorFilterIngressRuleArgs", "protocol");
            }
            return $;
        }
    }

}
