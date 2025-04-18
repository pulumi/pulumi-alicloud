// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudphoneinstance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupState extends com.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * The number of instance groups. The default value is 1 and the maximum value is 100.
     * 
     */
    @Import(name="amount")
    private @Nullable Output<Integer> amount;

    /**
     * @return The number of instance groups. The default value is 1 and the maximum value is 100.
     * 
     */
    public Optional<Output<Integer>> amount() {
        return Optional.ofNullable(this.amount);
    }

    /**
     * Whether to pay automatically. The default is false.
     * 
     */
    @Import(name="autoPay")
    private @Nullable Output<Boolean> autoPay;

    /**
     * @return Whether to pay automatically. The default is false.
     * 
     */
    public Optional<Output<Boolean>> autoPay() {
        return Optional.ofNullable(this.autoPay);
    }

    /**
     * Whether to enable automatic renewal. The default is false.
     * 
     */
    @Import(name="autoRenew")
    private @Nullable Output<Boolean> autoRenew;

    /**
     * @return Whether to enable automatic renewal. The default is false.
     * 
     */
    public Optional<Output<Boolean>> autoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }

    /**
     * The billing type.
     * 
     */
    @Import(name="chargeType")
    private @Nullable Output<String> chargeType;

    /**
     * @return The billing type.
     * 
     */
    public Optional<Output<String>> chargeType() {
        return Optional.ofNullable(this.chargeType);
    }

    /**
     * Whether to enable GPU acceleration. The default value is false.
     * - true: On.
     * - false: closed.
     * 
     */
    @Import(name="gpuAcceleration")
    private @Nullable Output<Boolean> gpuAcceleration;

    /**
     * @return Whether to enable GPU acceleration. The default value is false.
     * - true: On.
     * - false: closed.
     * 
     */
    public Optional<Output<Boolean>> gpuAcceleration() {
        return Optional.ofNullable(this.gpuAcceleration);
    }

    /**
     * The image ID.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return The image ID.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    /**
     * The instance group name
     * 
     * &gt; **NOTE:** &gt;
     * 
     * &gt; **NOTE:** - The instance group name must be no more than 30 characters in length. Start with an uppercase/lowercase letter or Chinese. It cannot start with http:// or https://. Only Chinese, English, numbers, half-width colons (:), underscores (_), periods (.), or hyphens (-) are supported.
     * 
     */
    @Import(name="instanceGroupName")
    private @Nullable Output<String> instanceGroupName;

    /**
     * @return The instance group name
     * 
     * &gt; **NOTE:** &gt;
     * 
     * &gt; **NOTE:** - The instance group name must be no more than 30 characters in length. Start with an uppercase/lowercase letter or Chinese. It cannot start with http:// or https://. Only Chinese, English, numbers, half-width colons (:), underscores (_), periods (.), or hyphens (-) are supported.
     * 
     */
    public Optional<Output<String>> instanceGroupName() {
        return Optional.ofNullable(this.instanceGroupName);
    }

    /**
     * Instance group specifications.
     * 
     */
    @Import(name="instanceGroupSpec")
    private @Nullable Output<String> instanceGroupSpec;

    /**
     * @return Instance group specifications.
     * 
     */
    public Optional<Output<String>> instanceGroupSpec() {
        return Optional.ofNullable(this.instanceGroupSpec);
    }

    /**
     * The number of instances in the instance group. The maximum value is 100.
     * 
     */
    @Import(name="numberOfInstances")
    private @Nullable Output<Integer> numberOfInstances;

    /**
     * @return The number of instances in the instance group. The maximum value is 100.
     * 
     */
    public Optional<Output<Integer>> numberOfInstances() {
        return Optional.ofNullable(this.numberOfInstances);
    }

    /**
     * The network ID.
     * - Create a shared network instance: Network ID is optional. Enter the network ID whose type is **Shared Network** on the [cloud mobile phone console&gt; Network](https://wya.wuying.aliyun.com/network) page. If the console does not have a shared network, you can fill it in. A shared network is automatically created when the instance group is created.
     * - Create a VPC instance: the network ID is required. Enter the network ID of `VPC` on the [cloud mobile phone console&gt; Network](https://wya.wuying.aliyun.com/network) page. If the console does not have a VPC network, you need to create a network first.
     * 
     */
    @Import(name="officeSiteId")
    private @Nullable Output<String> officeSiteId;

    /**
     * @return The network ID.
     * - Create a shared network instance: Network ID is optional. Enter the network ID whose type is **Shared Network** on the [cloud mobile phone console&gt; Network](https://wya.wuying.aliyun.com/network) page. If the console does not have a shared network, you can fill it in. A shared network is automatically created when the instance group is created.
     * - Create a VPC instance: the network ID is required. Enter the network ID of `VPC` on the [cloud mobile phone console&gt; Network](https://wya.wuying.aliyun.com/network) page. If the console does not have a VPC network, you need to create a network first.
     * 
     */
    public Optional<Output<String>> officeSiteId() {
        return Optional.ofNullable(this.officeSiteId);
    }

    /**
     * The duration of the resource purchase. The unit is specified by PeriodUnit.
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return The duration of the resource purchase. The unit is specified by PeriodUnit.
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The unit of time for purchasing resources.
     * 
     */
    @Import(name="periodUnit")
    private @Nullable Output<String> periodUnit;

    /**
     * @return The unit of time for purchasing resources.
     * 
     */
    public Optional<Output<String>> periodUnit() {
        return Optional.ofNullable(this.periodUnit);
    }

    /**
     * The policy ID. You can query the list of policies by calling ListPolicyGroups.
     * 
     */
    @Import(name="policyGroupId")
    private @Nullable Output<String> policyGroupId;

    /**
     * @return The policy ID. You can query the list of policies by calling ListPolicyGroups.
     * 
     */
    public Optional<Output<String>> policyGroupId() {
        return Optional.ofNullable(this.policyGroupId);
    }

    /**
     * Instance group status
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Instance group status
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The vSwitch ID.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The vSwitch ID.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private GroupState() {}

    private GroupState(GroupState $) {
        this.amount = $.amount;
        this.autoPay = $.autoPay;
        this.autoRenew = $.autoRenew;
        this.chargeType = $.chargeType;
        this.gpuAcceleration = $.gpuAcceleration;
        this.imageId = $.imageId;
        this.instanceGroupName = $.instanceGroupName;
        this.instanceGroupSpec = $.instanceGroupSpec;
        this.numberOfInstances = $.numberOfInstances;
        this.officeSiteId = $.officeSiteId;
        this.period = $.period;
        this.periodUnit = $.periodUnit;
        this.policyGroupId = $.policyGroupId;
        this.status = $.status;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupState $;

        public Builder() {
            $ = new GroupState();
        }

        public Builder(GroupState defaults) {
            $ = new GroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param amount The number of instance groups. The default value is 1 and the maximum value is 100.
         * 
         * @return builder
         * 
         */
        public Builder amount(@Nullable Output<Integer> amount) {
            $.amount = amount;
            return this;
        }

        /**
         * @param amount The number of instance groups. The default value is 1 and the maximum value is 100.
         * 
         * @return builder
         * 
         */
        public Builder amount(Integer amount) {
            return amount(Output.of(amount));
        }

        /**
         * @param autoPay Whether to pay automatically. The default is false.
         * 
         * @return builder
         * 
         */
        public Builder autoPay(@Nullable Output<Boolean> autoPay) {
            $.autoPay = autoPay;
            return this;
        }

        /**
         * @param autoPay Whether to pay automatically. The default is false.
         * 
         * @return builder
         * 
         */
        public Builder autoPay(Boolean autoPay) {
            return autoPay(Output.of(autoPay));
        }

        /**
         * @param autoRenew Whether to enable automatic renewal. The default is false.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(@Nullable Output<Boolean> autoRenew) {
            $.autoRenew = autoRenew;
            return this;
        }

        /**
         * @param autoRenew Whether to enable automatic renewal. The default is false.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(Boolean autoRenew) {
            return autoRenew(Output.of(autoRenew));
        }

        /**
         * @param chargeType The billing type.
         * 
         * @return builder
         * 
         */
        public Builder chargeType(@Nullable Output<String> chargeType) {
            $.chargeType = chargeType;
            return this;
        }

        /**
         * @param chargeType The billing type.
         * 
         * @return builder
         * 
         */
        public Builder chargeType(String chargeType) {
            return chargeType(Output.of(chargeType));
        }

        /**
         * @param gpuAcceleration Whether to enable GPU acceleration. The default value is false.
         * - true: On.
         * - false: closed.
         * 
         * @return builder
         * 
         */
        public Builder gpuAcceleration(@Nullable Output<Boolean> gpuAcceleration) {
            $.gpuAcceleration = gpuAcceleration;
            return this;
        }

        /**
         * @param gpuAcceleration Whether to enable GPU acceleration. The default value is false.
         * - true: On.
         * - false: closed.
         * 
         * @return builder
         * 
         */
        public Builder gpuAcceleration(Boolean gpuAcceleration) {
            return gpuAcceleration(Output.of(gpuAcceleration));
        }

        /**
         * @param imageId The image ID.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The image ID.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param instanceGroupName The instance group name
         * 
         * &gt; **NOTE:** &gt;
         * 
         * &gt; **NOTE:** - The instance group name must be no more than 30 characters in length. Start with an uppercase/lowercase letter or Chinese. It cannot start with http:// or https://. Only Chinese, English, numbers, half-width colons (:), underscores (_), periods (.), or hyphens (-) are supported.
         * 
         * @return builder
         * 
         */
        public Builder instanceGroupName(@Nullable Output<String> instanceGroupName) {
            $.instanceGroupName = instanceGroupName;
            return this;
        }

        /**
         * @param instanceGroupName The instance group name
         * 
         * &gt; **NOTE:** &gt;
         * 
         * &gt; **NOTE:** - The instance group name must be no more than 30 characters in length. Start with an uppercase/lowercase letter or Chinese. It cannot start with http:// or https://. Only Chinese, English, numbers, half-width colons (:), underscores (_), periods (.), or hyphens (-) are supported.
         * 
         * @return builder
         * 
         */
        public Builder instanceGroupName(String instanceGroupName) {
            return instanceGroupName(Output.of(instanceGroupName));
        }

        /**
         * @param instanceGroupSpec Instance group specifications.
         * 
         * @return builder
         * 
         */
        public Builder instanceGroupSpec(@Nullable Output<String> instanceGroupSpec) {
            $.instanceGroupSpec = instanceGroupSpec;
            return this;
        }

        /**
         * @param instanceGroupSpec Instance group specifications.
         * 
         * @return builder
         * 
         */
        public Builder instanceGroupSpec(String instanceGroupSpec) {
            return instanceGroupSpec(Output.of(instanceGroupSpec));
        }

        /**
         * @param numberOfInstances The number of instances in the instance group. The maximum value is 100.
         * 
         * @return builder
         * 
         */
        public Builder numberOfInstances(@Nullable Output<Integer> numberOfInstances) {
            $.numberOfInstances = numberOfInstances;
            return this;
        }

        /**
         * @param numberOfInstances The number of instances in the instance group. The maximum value is 100.
         * 
         * @return builder
         * 
         */
        public Builder numberOfInstances(Integer numberOfInstances) {
            return numberOfInstances(Output.of(numberOfInstances));
        }

        /**
         * @param officeSiteId The network ID.
         * - Create a shared network instance: Network ID is optional. Enter the network ID whose type is **Shared Network** on the [cloud mobile phone console&gt; Network](https://wya.wuying.aliyun.com/network) page. If the console does not have a shared network, you can fill it in. A shared network is automatically created when the instance group is created.
         * - Create a VPC instance: the network ID is required. Enter the network ID of `VPC` on the [cloud mobile phone console&gt; Network](https://wya.wuying.aliyun.com/network) page. If the console does not have a VPC network, you need to create a network first.
         * 
         * @return builder
         * 
         */
        public Builder officeSiteId(@Nullable Output<String> officeSiteId) {
            $.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * @param officeSiteId The network ID.
         * - Create a shared network instance: Network ID is optional. Enter the network ID whose type is **Shared Network** on the [cloud mobile phone console&gt; Network](https://wya.wuying.aliyun.com/network) page. If the console does not have a shared network, you can fill it in. A shared network is automatically created when the instance group is created.
         * - Create a VPC instance: the network ID is required. Enter the network ID of `VPC` on the [cloud mobile phone console&gt; Network](https://wya.wuying.aliyun.com/network) page. If the console does not have a VPC network, you need to create a network first.
         * 
         * @return builder
         * 
         */
        public Builder officeSiteId(String officeSiteId) {
            return officeSiteId(Output.of(officeSiteId));
        }

        /**
         * @param period The duration of the resource purchase. The unit is specified by PeriodUnit.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The duration of the resource purchase. The unit is specified by PeriodUnit.
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param periodUnit The unit of time for purchasing resources.
         * 
         * @return builder
         * 
         */
        public Builder periodUnit(@Nullable Output<String> periodUnit) {
            $.periodUnit = periodUnit;
            return this;
        }

        /**
         * @param periodUnit The unit of time for purchasing resources.
         * 
         * @return builder
         * 
         */
        public Builder periodUnit(String periodUnit) {
            return periodUnit(Output.of(periodUnit));
        }

        /**
         * @param policyGroupId The policy ID. You can query the list of policies by calling ListPolicyGroups.
         * 
         * @return builder
         * 
         */
        public Builder policyGroupId(@Nullable Output<String> policyGroupId) {
            $.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * @param policyGroupId The policy ID. You can query the list of policies by calling ListPolicyGroups.
         * 
         * @return builder
         * 
         */
        public Builder policyGroupId(String policyGroupId) {
            return policyGroupId(Output.of(policyGroupId));
        }

        /**
         * @param status Instance group status
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Instance group status
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vswitchId The vSwitch ID.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The vSwitch ID.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public GroupState build() {
            return $;
        }
    }

}
