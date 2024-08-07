// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoProvisioningGroupLaunchTemplateConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoProvisioningGroupLaunchTemplateConfigArgs Empty = new AutoProvisioningGroupLaunchTemplateConfigArgs();

    /**
     * The instance type of the Nth extended configurations of the launch template.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The instance type of the Nth extended configurations of the launch template.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The maximum price of the instance type specified in the Nth extended configurations of the launch template.
     * 
     */
    @Import(name="maxPrice", required=true)
    private Output<String> maxPrice;

    /**
     * @return The maximum price of the instance type specified in the Nth extended configurations of the launch template.
     * 
     */
    public Output<String> maxPrice() {
        return this.maxPrice;
    }

    /**
     * The priority of the instance type specified in the Nth extended configurations of the launch template. A value of 0 indicates the highest priority.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<String> priority;

    /**
     * @return The priority of the instance type specified in the Nth extended configurations of the launch template. A value of 0 indicates the highest priority.
     * 
     */
    public Optional<Output<String>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The ID of the VSwitch in the Nth extended configurations of the launch template.
     * 
     */
    @Import(name="vswitchId", required=true)
    private Output<String> vswitchId;

    /**
     * @return The ID of the VSwitch in the Nth extended configurations of the launch template.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     * The weight of the instance type specified in the Nth extended configurations of the launch template.
     * 
     */
    @Import(name="weightedCapacity", required=true)
    private Output<String> weightedCapacity;

    /**
     * @return The weight of the instance type specified in the Nth extended configurations of the launch template.
     * 
     */
    public Output<String> weightedCapacity() {
        return this.weightedCapacity;
    }

    private AutoProvisioningGroupLaunchTemplateConfigArgs() {}

    private AutoProvisioningGroupLaunchTemplateConfigArgs(AutoProvisioningGroupLaunchTemplateConfigArgs $) {
        this.instanceType = $.instanceType;
        this.maxPrice = $.maxPrice;
        this.priority = $.priority;
        this.vswitchId = $.vswitchId;
        this.weightedCapacity = $.weightedCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoProvisioningGroupLaunchTemplateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoProvisioningGroupLaunchTemplateConfigArgs $;

        public Builder() {
            $ = new AutoProvisioningGroupLaunchTemplateConfigArgs();
        }

        public Builder(AutoProvisioningGroupLaunchTemplateConfigArgs defaults) {
            $ = new AutoProvisioningGroupLaunchTemplateConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceType The instance type of the Nth extended configurations of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The instance type of the Nth extended configurations of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param maxPrice The maximum price of the instance type specified in the Nth extended configurations of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder maxPrice(Output<String> maxPrice) {
            $.maxPrice = maxPrice;
            return this;
        }

        /**
         * @param maxPrice The maximum price of the instance type specified in the Nth extended configurations of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder maxPrice(String maxPrice) {
            return maxPrice(Output.of(maxPrice));
        }

        /**
         * @param priority The priority of the instance type specified in the Nth extended configurations of the launch template. A value of 0 indicates the highest priority.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<String> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the instance type specified in the Nth extended configurations of the launch template. A value of 0 indicates the highest priority.
         * 
         * @return builder
         * 
         */
        public Builder priority(String priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param vswitchId The ID of the VSwitch in the Nth extended configurations of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The ID of the VSwitch in the Nth extended configurations of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        /**
         * @param weightedCapacity The weight of the instance type specified in the Nth extended configurations of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder weightedCapacity(Output<String> weightedCapacity) {
            $.weightedCapacity = weightedCapacity;
            return this;
        }

        /**
         * @param weightedCapacity The weight of the instance type specified in the Nth extended configurations of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder weightedCapacity(String weightedCapacity) {
            return weightedCapacity(Output.of(weightedCapacity));
        }

        public AutoProvisioningGroupLaunchTemplateConfigArgs build() {
            if ($.maxPrice == null) {
                throw new MissingRequiredPropertyException("AutoProvisioningGroupLaunchTemplateConfigArgs", "maxPrice");
            }
            if ($.vswitchId == null) {
                throw new MissingRequiredPropertyException("AutoProvisioningGroupLaunchTemplateConfigArgs", "vswitchId");
            }
            if ($.weightedCapacity == null) {
                throw new MissingRequiredPropertyException("AutoProvisioningGroupLaunchTemplateConfigArgs", "weightedCapacity");
            }
            return $;
        }
    }

}
