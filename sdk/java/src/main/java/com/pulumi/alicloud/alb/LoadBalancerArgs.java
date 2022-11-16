// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb;

import com.pulumi.alicloud.alb.inputs.LoadBalancerAccessLogConfigArgs;
import com.pulumi.alicloud.alb.inputs.LoadBalancerLoadBalancerBillingConfigArgs;
import com.pulumi.alicloud.alb.inputs.LoadBalancerModificationProtectionConfigArgs;
import com.pulumi.alicloud.alb.inputs.LoadBalancerZoneMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerArgs Empty = new LoadBalancerArgs();

    /**
     * The Access Logging Configuration Structure.
     * 
     */
    @Import(name="accessLogConfig")
    private @Nullable Output<LoadBalancerAccessLogConfigArgs> accessLogConfig;

    /**
     * @return The Access Logging Configuration Structure.
     * 
     */
    public Optional<Output<LoadBalancerAccessLogConfigArgs>> accessLogConfig() {
        return Optional.ofNullable(this.accessLogConfig);
    }

    /**
     * The method in which IP addresses are assigned. Valid values: `Fixed` and `Dynamic`. Default value: `Dynamic`.
     * *`Fixed`: The ALB instance uses a fixed IP address.
     * *`Dynamic`: An IP address is dynamically assigned to each zone of the ALB instance.
     * 
     */
    @Import(name="addressAllocatedMode")
    private @Nullable Output<String> addressAllocatedMode;

    /**
     * @return The method in which IP addresses are assigned. Valid values: `Fixed` and `Dynamic`. Default value: `Dynamic`.
     * *`Fixed`: The ALB instance uses a fixed IP address.
     * *`Dynamic`: An IP address is dynamically assigned to each zone of the ALB instance.
     * 
     */
    public Optional<Output<String>> addressAllocatedMode() {
        return Optional.ofNullable(this.addressAllocatedMode);
    }

    /**
     * The type of IP address that the ALB instance uses to provide services. Valid values: `Intranet`, `Internet`.
     * 
     */
    @Import(name="addressType", required=true)
    private Output<String> addressType;

    /**
     * @return The type of IP address that the ALB instance uses to provide services. Valid values: `Intranet`, `Internet`.
     * 
     */
    public Output<String> addressType() {
        return this.addressType;
    }

    /**
     * The deletion protection enabled. Valid values: `true` and `false`. Default value: `false`.
     * 
     */
    @Import(name="deletionProtectionEnabled")
    private @Nullable Output<Boolean> deletionProtectionEnabled;

    /**
     * @return The deletion protection enabled. Valid values: `true` and `false`. Default value: `false`.
     * 
     */
    public Optional<Output<Boolean>> deletionProtectionEnabled() {
        return Optional.ofNullable(this.deletionProtectionEnabled);
    }

    /**
     * Specifies whether to precheck the API request. Valid values: `true` and `false`.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether to precheck the API request. Valid values: `true` and `false`.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The configuration of the billing method.
     * 
     */
    @Import(name="loadBalancerBillingConfig", required=true)
    private Output<LoadBalancerLoadBalancerBillingConfigArgs> loadBalancerBillingConfig;

    /**
     * @return The configuration of the billing method.
     * 
     */
    public Output<LoadBalancerLoadBalancerBillingConfigArgs> loadBalancerBillingConfig() {
        return this.loadBalancerBillingConfig;
    }

    /**
     * The edition of the ALB instance. Different editions have different limits and billing methods.  Valid values: `Basic` and `Standard`.
     * 
     */
    @Import(name="loadBalancerEdition", required=true)
    private Output<String> loadBalancerEdition;

    /**
     * @return The edition of the ALB instance. Different editions have different limits and billing methods.  Valid values: `Basic` and `Standard`.
     * 
     */
    public Output<String> loadBalancerEdition() {
        return this.loadBalancerEdition;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="loadBalancerName", required=true)
    private Output<String> loadBalancerName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> loadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * Modify the Protection Configuration.
     * 
     */
    @Import(name="modificationProtectionConfig")
    private @Nullable Output<LoadBalancerModificationProtectionConfigArgs> modificationProtectionConfig;

    /**
     * @return Modify the Protection Configuration.
     * 
     */
    public Optional<Output<LoadBalancerModificationProtectionConfigArgs>> modificationProtectionConfig() {
        return Optional.ofNullable(this.modificationProtectionConfig);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the virtual private cloud (VPC) where the ALB instance is deployed.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The ID of the virtual private cloud (VPC) where the ALB instance is deployed.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     * The zones and vSwitches. You must specify at least two zones.
     * 
     */
    @Import(name="zoneMappings", required=true)
    private Output<List<LoadBalancerZoneMappingArgs>> zoneMappings;

    /**
     * @return The zones and vSwitches. You must specify at least two zones.
     * 
     */
    public Output<List<LoadBalancerZoneMappingArgs>> zoneMappings() {
        return this.zoneMappings;
    }

    private LoadBalancerArgs() {}

    private LoadBalancerArgs(LoadBalancerArgs $) {
        this.accessLogConfig = $.accessLogConfig;
        this.addressAllocatedMode = $.addressAllocatedMode;
        this.addressType = $.addressType;
        this.deletionProtectionEnabled = $.deletionProtectionEnabled;
        this.dryRun = $.dryRun;
        this.loadBalancerBillingConfig = $.loadBalancerBillingConfig;
        this.loadBalancerEdition = $.loadBalancerEdition;
        this.loadBalancerName = $.loadBalancerName;
        this.modificationProtectionConfig = $.modificationProtectionConfig;
        this.resourceGroupId = $.resourceGroupId;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
        this.zoneMappings = $.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerArgs $;

        public Builder() {
            $ = new LoadBalancerArgs();
        }

        public Builder(LoadBalancerArgs defaults) {
            $ = new LoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLogConfig The Access Logging Configuration Structure.
         * 
         * @return builder
         * 
         */
        public Builder accessLogConfig(@Nullable Output<LoadBalancerAccessLogConfigArgs> accessLogConfig) {
            $.accessLogConfig = accessLogConfig;
            return this;
        }

        /**
         * @param accessLogConfig The Access Logging Configuration Structure.
         * 
         * @return builder
         * 
         */
        public Builder accessLogConfig(LoadBalancerAccessLogConfigArgs accessLogConfig) {
            return accessLogConfig(Output.of(accessLogConfig));
        }

        /**
         * @param addressAllocatedMode The method in which IP addresses are assigned. Valid values: `Fixed` and `Dynamic`. Default value: `Dynamic`.
         * *`Fixed`: The ALB instance uses a fixed IP address.
         * *`Dynamic`: An IP address is dynamically assigned to each zone of the ALB instance.
         * 
         * @return builder
         * 
         */
        public Builder addressAllocatedMode(@Nullable Output<String> addressAllocatedMode) {
            $.addressAllocatedMode = addressAllocatedMode;
            return this;
        }

        /**
         * @param addressAllocatedMode The method in which IP addresses are assigned. Valid values: `Fixed` and `Dynamic`. Default value: `Dynamic`.
         * *`Fixed`: The ALB instance uses a fixed IP address.
         * *`Dynamic`: An IP address is dynamically assigned to each zone of the ALB instance.
         * 
         * @return builder
         * 
         */
        public Builder addressAllocatedMode(String addressAllocatedMode) {
            return addressAllocatedMode(Output.of(addressAllocatedMode));
        }

        /**
         * @param addressType The type of IP address that the ALB instance uses to provide services. Valid values: `Intranet`, `Internet`.
         * 
         * @return builder
         * 
         */
        public Builder addressType(Output<String> addressType) {
            $.addressType = addressType;
            return this;
        }

        /**
         * @param addressType The type of IP address that the ALB instance uses to provide services. Valid values: `Intranet`, `Internet`.
         * 
         * @return builder
         * 
         */
        public Builder addressType(String addressType) {
            return addressType(Output.of(addressType));
        }

        /**
         * @param deletionProtectionEnabled The deletion protection enabled. Valid values: `true` and `false`. Default value: `false`.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtectionEnabled(@Nullable Output<Boolean> deletionProtectionEnabled) {
            $.deletionProtectionEnabled = deletionProtectionEnabled;
            return this;
        }

        /**
         * @param deletionProtectionEnabled The deletion protection enabled. Valid values: `true` and `false`. Default value: `false`.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtectionEnabled(Boolean deletionProtectionEnabled) {
            return deletionProtectionEnabled(Output.of(deletionProtectionEnabled));
        }

        /**
         * @param dryRun Specifies whether to precheck the API request. Valid values: `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether to precheck the API request. Valid values: `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param loadBalancerBillingConfig The configuration of the billing method.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBillingConfig(Output<LoadBalancerLoadBalancerBillingConfigArgs> loadBalancerBillingConfig) {
            $.loadBalancerBillingConfig = loadBalancerBillingConfig;
            return this;
        }

        /**
         * @param loadBalancerBillingConfig The configuration of the billing method.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBillingConfig(LoadBalancerLoadBalancerBillingConfigArgs loadBalancerBillingConfig) {
            return loadBalancerBillingConfig(Output.of(loadBalancerBillingConfig));
        }

        /**
         * @param loadBalancerEdition The edition of the ALB instance. Different editions have different limits and billing methods.  Valid values: `Basic` and `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerEdition(Output<String> loadBalancerEdition) {
            $.loadBalancerEdition = loadBalancerEdition;
            return this;
        }

        /**
         * @param loadBalancerEdition The edition of the ALB instance. Different editions have different limits and billing methods.  Valid values: `Basic` and `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerEdition(String loadBalancerEdition) {
            return loadBalancerEdition(Output.of(loadBalancerEdition));
        }

        /**
         * @param loadBalancerName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(Output<String> loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * @param loadBalancerName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(String loadBalancerName) {
            return loadBalancerName(Output.of(loadBalancerName));
        }

        /**
         * @param modificationProtectionConfig Modify the Protection Configuration.
         * 
         * @return builder
         * 
         */
        public Builder modificationProtectionConfig(@Nullable Output<LoadBalancerModificationProtectionConfigArgs> modificationProtectionConfig) {
            $.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }

        /**
         * @param modificationProtectionConfig Modify the Protection Configuration.
         * 
         * @return builder
         * 
         */
        public Builder modificationProtectionConfig(LoadBalancerModificationProtectionConfigArgs modificationProtectionConfig) {
            return modificationProtectionConfig(Output.of(modificationProtectionConfig));
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId The ID of the virtual private cloud (VPC) where the ALB instance is deployed.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the virtual private cloud (VPC) where the ALB instance is deployed.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param zoneMappings The zones and vSwitches. You must specify at least two zones.
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(Output<List<LoadBalancerZoneMappingArgs>> zoneMappings) {
            $.zoneMappings = zoneMappings;
            return this;
        }

        /**
         * @param zoneMappings The zones and vSwitches. You must specify at least two zones.
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(List<LoadBalancerZoneMappingArgs> zoneMappings) {
            return zoneMappings(Output.of(zoneMappings));
        }

        /**
         * @param zoneMappings The zones and vSwitches. You must specify at least two zones.
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(LoadBalancerZoneMappingArgs... zoneMappings) {
            return zoneMappings(List.of(zoneMappings));
        }

        public LoadBalancerArgs build() {
            $.addressType = Objects.requireNonNull($.addressType, "expected parameter 'addressType' to be non-null");
            $.loadBalancerBillingConfig = Objects.requireNonNull($.loadBalancerBillingConfig, "expected parameter 'loadBalancerBillingConfig' to be non-null");
            $.loadBalancerEdition = Objects.requireNonNull($.loadBalancerEdition, "expected parameter 'loadBalancerEdition' to be non-null");
            $.loadBalancerName = Objects.requireNonNull($.loadBalancerName, "expected parameter 'loadBalancerName' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            $.zoneMappings = Objects.requireNonNull($.zoneMappings, "expected parameter 'zoneMappings' to be non-null");
            return $;
        }
    }

}