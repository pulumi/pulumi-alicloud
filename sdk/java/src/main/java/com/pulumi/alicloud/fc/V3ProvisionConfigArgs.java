// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc;

import com.pulumi.alicloud.fc.inputs.V3ProvisionConfigScheduledActionArgs;
import com.pulumi.alicloud.fc.inputs.V3ProvisionConfigTargetTrackingPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V3ProvisionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final V3ProvisionConfigArgs Empty = new V3ProvisionConfigArgs();

    /**
     * Whether the CPU is always allocated. The default value is true.
     * 
     */
    @Import(name="alwaysAllocateCpu")
    private @Nullable Output<Boolean> alwaysAllocateCpu;

    /**
     * @return Whether the CPU is always allocated. The default value is true.
     * 
     */
    public Optional<Output<Boolean>> alwaysAllocateCpu() {
        return Optional.ofNullable(this.alwaysAllocateCpu);
    }

    /**
     * Whether to always assign GPU to function instance
     * 
     */
    @Import(name="alwaysAllocateGpu")
    private @Nullable Output<Boolean> alwaysAllocateGpu;

    /**
     * @return Whether to always assign GPU to function instance
     * 
     */
    public Optional<Output<Boolean>> alwaysAllocateGpu() {
        return Optional.ofNullable(this.alwaysAllocateGpu);
    }

    /**
     * The name of the function. If this parameter is not specified, the provisioned configurations of all functions are listed.
     * 
     */
    @Import(name="functionName", required=true)
    private Output<String> functionName;

    /**
     * @return The name of the function. If this parameter is not specified, the provisioned configurations of all functions are listed.
     * 
     */
    public Output<String> functionName() {
        return this.functionName;
    }

    /**
     * The function alias or LATEST.
     * 
     */
    @Import(name="qualifier")
    private @Nullable Output<String> qualifier;

    /**
     * @return The function alias or LATEST.
     * 
     */
    public Optional<Output<String>> qualifier() {
        return Optional.ofNullable(this.qualifier);
    }

    /**
     * Timing policy configuration See `scheduled_actions` below.
     * 
     */
    @Import(name="scheduledActions")
    private @Nullable Output<List<V3ProvisionConfigScheduledActionArgs>> scheduledActions;

    /**
     * @return Timing policy configuration See `scheduled_actions` below.
     * 
     */
    public Optional<Output<List<V3ProvisionConfigScheduledActionArgs>>> scheduledActions() {
        return Optional.ofNullable(this.scheduledActions);
    }

    /**
     * Number of reserved target resources. The value range is [0,10000].
     * 
     */
    @Import(name="target")
    private @Nullable Output<Integer> target;

    /**
     * @return Number of reserved target resources. The value range is [0,10000].
     * 
     */
    public Optional<Output<Integer>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * Metric tracking scaling policy configuration See `target_tracking_policies` below.
     * 
     */
    @Import(name="targetTrackingPolicies")
    private @Nullable Output<List<V3ProvisionConfigTargetTrackingPolicyArgs>> targetTrackingPolicies;

    /**
     * @return Metric tracking scaling policy configuration See `target_tracking_policies` below.
     * 
     */
    public Optional<Output<List<V3ProvisionConfigTargetTrackingPolicyArgs>>> targetTrackingPolicies() {
        return Optional.ofNullable(this.targetTrackingPolicies);
    }

    private V3ProvisionConfigArgs() {}

    private V3ProvisionConfigArgs(V3ProvisionConfigArgs $) {
        this.alwaysAllocateCpu = $.alwaysAllocateCpu;
        this.alwaysAllocateGpu = $.alwaysAllocateGpu;
        this.functionName = $.functionName;
        this.qualifier = $.qualifier;
        this.scheduledActions = $.scheduledActions;
        this.target = $.target;
        this.targetTrackingPolicies = $.targetTrackingPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V3ProvisionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V3ProvisionConfigArgs $;

        public Builder() {
            $ = new V3ProvisionConfigArgs();
        }

        public Builder(V3ProvisionConfigArgs defaults) {
            $ = new V3ProvisionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alwaysAllocateCpu Whether the CPU is always allocated. The default value is true.
         * 
         * @return builder
         * 
         */
        public Builder alwaysAllocateCpu(@Nullable Output<Boolean> alwaysAllocateCpu) {
            $.alwaysAllocateCpu = alwaysAllocateCpu;
            return this;
        }

        /**
         * @param alwaysAllocateCpu Whether the CPU is always allocated. The default value is true.
         * 
         * @return builder
         * 
         */
        public Builder alwaysAllocateCpu(Boolean alwaysAllocateCpu) {
            return alwaysAllocateCpu(Output.of(alwaysAllocateCpu));
        }

        /**
         * @param alwaysAllocateGpu Whether to always assign GPU to function instance
         * 
         * @return builder
         * 
         */
        public Builder alwaysAllocateGpu(@Nullable Output<Boolean> alwaysAllocateGpu) {
            $.alwaysAllocateGpu = alwaysAllocateGpu;
            return this;
        }

        /**
         * @param alwaysAllocateGpu Whether to always assign GPU to function instance
         * 
         * @return builder
         * 
         */
        public Builder alwaysAllocateGpu(Boolean alwaysAllocateGpu) {
            return alwaysAllocateGpu(Output.of(alwaysAllocateGpu));
        }

        /**
         * @param functionName The name of the function. If this parameter is not specified, the provisioned configurations of all functions are listed.
         * 
         * @return builder
         * 
         */
        public Builder functionName(Output<String> functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param functionName The name of the function. If this parameter is not specified, the provisioned configurations of all functions are listed.
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            return functionName(Output.of(functionName));
        }

        /**
         * @param qualifier The function alias or LATEST.
         * 
         * @return builder
         * 
         */
        public Builder qualifier(@Nullable Output<String> qualifier) {
            $.qualifier = qualifier;
            return this;
        }

        /**
         * @param qualifier The function alias or LATEST.
         * 
         * @return builder
         * 
         */
        public Builder qualifier(String qualifier) {
            return qualifier(Output.of(qualifier));
        }

        /**
         * @param scheduledActions Timing policy configuration See `scheduled_actions` below.
         * 
         * @return builder
         * 
         */
        public Builder scheduledActions(@Nullable Output<List<V3ProvisionConfigScheduledActionArgs>> scheduledActions) {
            $.scheduledActions = scheduledActions;
            return this;
        }

        /**
         * @param scheduledActions Timing policy configuration See `scheduled_actions` below.
         * 
         * @return builder
         * 
         */
        public Builder scheduledActions(List<V3ProvisionConfigScheduledActionArgs> scheduledActions) {
            return scheduledActions(Output.of(scheduledActions));
        }

        /**
         * @param scheduledActions Timing policy configuration See `scheduled_actions` below.
         * 
         * @return builder
         * 
         */
        public Builder scheduledActions(V3ProvisionConfigScheduledActionArgs... scheduledActions) {
            return scheduledActions(List.of(scheduledActions));
        }

        /**
         * @param target Number of reserved target resources. The value range is [0,10000].
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<Integer> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Number of reserved target resources. The value range is [0,10000].
         * 
         * @return builder
         * 
         */
        public Builder target(Integer target) {
            return target(Output.of(target));
        }

        /**
         * @param targetTrackingPolicies Metric tracking scaling policy configuration See `target_tracking_policies` below.
         * 
         * @return builder
         * 
         */
        public Builder targetTrackingPolicies(@Nullable Output<List<V3ProvisionConfigTargetTrackingPolicyArgs>> targetTrackingPolicies) {
            $.targetTrackingPolicies = targetTrackingPolicies;
            return this;
        }

        /**
         * @param targetTrackingPolicies Metric tracking scaling policy configuration See `target_tracking_policies` below.
         * 
         * @return builder
         * 
         */
        public Builder targetTrackingPolicies(List<V3ProvisionConfigTargetTrackingPolicyArgs> targetTrackingPolicies) {
            return targetTrackingPolicies(Output.of(targetTrackingPolicies));
        }

        /**
         * @param targetTrackingPolicies Metric tracking scaling policy configuration See `target_tracking_policies` below.
         * 
         * @return builder
         * 
         */
        public Builder targetTrackingPolicies(V3ProvisionConfigTargetTrackingPolicyArgs... targetTrackingPolicies) {
            return targetTrackingPolicies(List.of(targetTrackingPolicies));
        }

        public V3ProvisionConfigArgs build() {
            if ($.functionName == null) {
                throw new MissingRequiredPropertyException("V3ProvisionConfigArgs", "functionName");
            }
            return $;
        }
    }

}