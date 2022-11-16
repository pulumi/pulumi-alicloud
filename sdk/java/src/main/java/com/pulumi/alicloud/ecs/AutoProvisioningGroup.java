// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.AutoProvisioningGroupArgs;
import com.pulumi.alicloud.ecs.inputs.AutoProvisioningGroupState;
import com.pulumi.alicloud.ecs.outputs.AutoProvisioningGroupLaunchTemplateConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECS auto provisioning group resource which is a solution that uses preemptive instances and pay_as_you_go instances to rapidly deploy clusters.
 * 
 * &gt; **NOTE:** Available in 1.79.0+
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.ecs.inputs.GetImagesArgs;
 * import com.pulumi.alicloud.ecs.EcsLaunchTemplate;
 * import com.pulumi.alicloud.ecs.EcsLaunchTemplateArgs;
 * import com.pulumi.alicloud.ecs.AutoProvisioningGroup;
 * import com.pulumi.alicloud.ecs.AutoProvisioningGroupArgs;
 * import com.pulumi.alicloud.ecs.inputs.AutoProvisioningGroupLaunchTemplateConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;auto_provisioning_group&#34;);
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableDiskCategory(&#34;cloud_efficiency&#34;)
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;172.16.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock(&#34;172.16.0.0/24&#34;)
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .vswitchName(name)
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup(&#34;defaultSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         final var defaultImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex(&#34;^ubuntu_18.*64&#34;)
 *             .mostRecent(true)
 *             .owners(&#34;system&#34;)
 *             .build());
 * 
 *         var template = new EcsLaunchTemplate(&#34;template&#34;, EcsLaunchTemplateArgs.builder()        
 *             .imageId(defaultImages.applyValue(getImagesResult -&gt; getImagesResult.images()[0].id()))
 *             .instanceType(&#34;ecs.n1.tiny&#34;)
 *             .securityGroupId(defaultSecurityGroup.id())
 *             .build());
 * 
 *         var defaultAutoProvisioningGroup = new AutoProvisioningGroup(&#34;defaultAutoProvisioningGroup&#34;, AutoProvisioningGroupArgs.builder()        
 *             .launchTemplateId(template.id())
 *             .totalTargetCapacity(&#34;4&#34;)
 *             .payAsYouGoTargetCapacity(&#34;1&#34;)
 *             .spotTargetCapacity(&#34;2&#34;)
 *             .launchTemplateConfigs(AutoProvisioningGroupLaunchTemplateConfigArgs.builder()
 *                 .instanceType(&#34;ecs.n1.small&#34;)
 *                 .vswitchId(defaultSwitch.id())
 *                 .weightedCapacity(&#34;2&#34;)
 *                 .maxPrice(&#34;2&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Block config
 * 
 * The config mapping supports the following:
 * * `instance_type` - (Optional) The instance type of the Nth extended configurations of the launch template.
 * * `max_price` - (Required) The maximum price of the instance type specified in the Nth extended configurations of the launch template.
 * * `vswitch_id` - (Required) The ID of the VSwitch in the Nth extended configurations of the launch template.
 * * `weighted_capacity` - (Required) The weight of the instance type specified in the Nth extended configurations of the launch template.
 * * `priority` - (Optional) The priority of the instance type specified in the Nth extended configurations of the launch template. A value of 0 indicates the highest priority.
 * 
 * ## Import
 * 
 * ECS auto provisioning group can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/autoProvisioningGroup:AutoProvisioningGroup example asg-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/autoProvisioningGroup:AutoProvisioningGroup")
public class AutoProvisioningGroup extends com.pulumi.resources.CustomResource {
    /**
     * The name of the auto provisioning group to be created. It must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-)
     * 
     */
    @Export(name="autoProvisioningGroupName", type=String.class, parameters={})
    private Output<String> autoProvisioningGroupName;

    /**
     * @return The name of the auto provisioning group to be created. It must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-)
     * 
     */
    public Output<String> autoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }
    /**
     * The type of the auto provisioning group. Valid values:`request` and `maintain`,Default value: `maintain`.
     * 
     */
    @Export(name="autoProvisioningGroupType", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoProvisioningGroupType;

    /**
     * @return The type of the auto provisioning group. Valid values:`request` and `maintain`,Default value: `maintain`.
     * 
     */
    public Output<Optional<String>> autoProvisioningGroupType() {
        return Codegen.optional(this.autoProvisioningGroupType);
    }
    /**
     * The type of supplemental instances. When the total value of `PayAsYouGoTargetCapacity` and `SpotTargetCapacity` is smaller than the value of TotalTargetCapacity, the auto provisioning group will create instances of the specified type to meet the capacity requirements. Valid values:`PayAsYouGo`: Pay-as-you-go instances; `Spot`: Preemptible instances, Default value: `Spot`.
     * 
     */
    @Export(name="defaultTargetCapacityType", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultTargetCapacityType;

    /**
     * @return The type of supplemental instances. When the total value of `PayAsYouGoTargetCapacity` and `SpotTargetCapacity` is smaller than the value of TotalTargetCapacity, the auto provisioning group will create instances of the specified type to meet the capacity requirements. Valid values:`PayAsYouGo`: Pay-as-you-go instances; `Spot`: Preemptible instances, Default value: `Spot`.
     * 
     */
    public Output<Optional<String>> defaultTargetCapacityType() {
        return Codegen.optional(this.defaultTargetCapacityType);
    }
    /**
     * The description of the auto provisioning group.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the auto provisioning group.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The shutdown policy for excess preemptible instances followed when the capacity of the auto provisioning group exceeds the target capacity. Valid values: `no-termination` and `termination`,Default value: `no-termination`.
     * 
     */
    @Export(name="excessCapacityTerminationPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> excessCapacityTerminationPolicy;

    /**
     * @return The shutdown policy for excess preemptible instances followed when the capacity of the auto provisioning group exceeds the target capacity. Valid values: `no-termination` and `termination`,Default value: `no-termination`.
     * 
     */
    public Output<Optional<String>> excessCapacityTerminationPolicy() {
        return Codegen.optional(this.excessCapacityTerminationPolicy);
    }
    /**
     * DataDisk mappings to attach to ecs instance. See Block config below for details.
     * 
     */
    @Export(name="launchTemplateConfigs", type=List.class, parameters={AutoProvisioningGroupLaunchTemplateConfig.class})
    private Output<List<AutoProvisioningGroupLaunchTemplateConfig>> launchTemplateConfigs;

    /**
     * @return DataDisk mappings to attach to ecs instance. See Block config below for details.
     * 
     */
    public Output<List<AutoProvisioningGroupLaunchTemplateConfig>> launchTemplateConfigs() {
        return this.launchTemplateConfigs;
    }
    /**
     * The ID of the instance launch template associated with the auto provisioning group.
     * 
     */
    @Export(name="launchTemplateId", type=String.class, parameters={})
    private Output<String> launchTemplateId;

    /**
     * @return The ID of the instance launch template associated with the auto provisioning group.
     * 
     */
    public Output<String> launchTemplateId() {
        return this.launchTemplateId;
    }
    /**
     * The version of the instance launch template associated with the auto provisioning group.
     * 
     */
    @Export(name="launchTemplateVersion", type=String.class, parameters={})
    private Output<String> launchTemplateVersion;

    /**
     * @return The version of the instance launch template associated with the auto provisioning group.
     * 
     */
    public Output<String> launchTemplateVersion() {
        return this.launchTemplateVersion;
    }
    /**
     * The global maximum price for preemptible instances in the auto provisioning group. If both the `MaxSpotPrice` and `LaunchTemplateConfig.N.MaxPrice` parameters are specified, the maximum price is the lower value of the two.
     * 
     */
    @Export(name="maxSpotPrice", type=Double.class, parameters={})
    private Output<Double> maxSpotPrice;

    /**
     * @return The global maximum price for preemptible instances in the auto provisioning group. If both the `MaxSpotPrice` and `LaunchTemplateConfig.N.MaxPrice` parameters are specified, the maximum price is the lower value of the two.
     * 
     */
    public Output<Double> maxSpotPrice() {
        return this.maxSpotPrice;
    }
    /**
     * The scale-out policy for pay-as-you-go instances. Valid values: `lowest-price` and `prioritized`,Default value: `lowest-price`.
     * 
     */
    @Export(name="payAsYouGoAllocationStrategy", type=String.class, parameters={})
    private Output</* @Nullable */ String> payAsYouGoAllocationStrategy;

    /**
     * @return The scale-out policy for pay-as-you-go instances. Valid values: `lowest-price` and `prioritized`,Default value: `lowest-price`.
     * 
     */
    public Output<Optional<String>> payAsYouGoAllocationStrategy() {
        return Codegen.optional(this.payAsYouGoAllocationStrategy);
    }
    /**
     * The target capacity of pay-as-you-go instances in the auto provisioning group.
     * 
     */
    @Export(name="payAsYouGoTargetCapacity", type=String.class, parameters={})
    private Output</* @Nullable */ String> payAsYouGoTargetCapacity;

    /**
     * @return The target capacity of pay-as-you-go instances in the auto provisioning group.
     * 
     */
    public Output<Optional<String>> payAsYouGoTargetCapacity() {
        return Codegen.optional(this.payAsYouGoTargetCapacity);
    }
    /**
     * The scale-out policy for preemptible instances. Valid values:`lowest-price` and `diversified`,Default value: `lowest-price`.
     * 
     */
    @Export(name="spotAllocationStrategy", type=String.class, parameters={})
    private Output</* @Nullable */ String> spotAllocationStrategy;

    /**
     * @return The scale-out policy for preemptible instances. Valid values:`lowest-price` and `diversified`,Default value: `lowest-price`.
     * 
     */
    public Output<Optional<String>> spotAllocationStrategy() {
        return Codegen.optional(this.spotAllocationStrategy);
    }
    /**
     * The default behavior after preemptible instances are shut down. Valid values: `stop` and `terminate`,Default value: `stop`.
     * 
     */
    @Export(name="spotInstanceInterruptionBehavior", type=String.class, parameters={})
    private Output</* @Nullable */ String> spotInstanceInterruptionBehavior;

    /**
     * @return The default behavior after preemptible instances are shut down. Valid values: `stop` and `terminate`,Default value: `stop`.
     * 
     */
    public Output<Optional<String>> spotInstanceInterruptionBehavior() {
        return Codegen.optional(this.spotInstanceInterruptionBehavior);
    }
    /**
     * This parameter takes effect when the `SpotAllocationStrategy` parameter is set to `lowest-price`. The auto provisioning group selects instance types of the lowest cost to create instances.
     * 
     */
    @Export(name="spotInstancePoolsToUseCount", type=Integer.class, parameters={})
    private Output<Integer> spotInstancePoolsToUseCount;

    /**
     * @return This parameter takes effect when the `SpotAllocationStrategy` parameter is set to `lowest-price`. The auto provisioning group selects instance types of the lowest cost to create instances.
     * 
     */
    public Output<Integer> spotInstancePoolsToUseCount() {
        return this.spotInstancePoolsToUseCount;
    }
    /**
     * The target capacity of preemptible instances in the auto provisioning group.
     * 
     */
    @Export(name="spotTargetCapacity", type=String.class, parameters={})
    private Output</* @Nullable */ String> spotTargetCapacity;

    /**
     * @return The target capacity of preemptible instances in the auto provisioning group.
     * 
     */
    public Output<Optional<String>> spotTargetCapacity() {
        return Codegen.optional(this.spotTargetCapacity);
    }
    /**
     * Specifies whether to release instances of the auto provisioning group. Valid values:`false` and `true`, default value: `false`.
     * 
     */
    @Export(name="terminateInstances", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> terminateInstances;

    /**
     * @return Specifies whether to release instances of the auto provisioning group. Valid values:`false` and `true`, default value: `false`.
     * 
     */
    public Output<Optional<Boolean>> terminateInstances() {
        return Codegen.optional(this.terminateInstances);
    }
    /**
     * The shutdown policy for preemptible instances when the auto provisioning group expires. Valid values: `false` and `true`, default value: `false`.
     * 
     */
    @Export(name="terminateInstancesWithExpiration", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> terminateInstancesWithExpiration;

    /**
     * @return The shutdown policy for preemptible instances when the auto provisioning group expires. Valid values: `false` and `true`, default value: `false`.
     * 
     */
    public Output<Optional<Boolean>> terminateInstancesWithExpiration() {
        return Codegen.optional(this.terminateInstancesWithExpiration);
    }
    /**
     * The total target capacity of the auto provisioning group. The target capacity consists of the following three parts:PayAsYouGoTargetCapacity,SpotTargetCapacity and the supplemental capacity besides PayAsYouGoTargetCapacity and SpotTargetCapacity.
     * 
     */
    @Export(name="totalTargetCapacity", type=String.class, parameters={})
    private Output<String> totalTargetCapacity;

    /**
     * @return The total target capacity of the auto provisioning group. The target capacity consists of the following three parts:PayAsYouGoTargetCapacity,SpotTargetCapacity and the supplemental capacity besides PayAsYouGoTargetCapacity and SpotTargetCapacity.
     * 
     */
    public Output<String> totalTargetCapacity() {
        return this.totalTargetCapacity;
    }
    /**
     * The time when the auto provisioning group is started. The period of time between this point in time and the point in time specified by the `valid_until` parameter is the effective time period of the auto provisioning group.By default, an auto provisioning group is immediately started after creation.
     * 
     */
    @Export(name="validFrom", type=String.class, parameters={})
    private Output<String> validFrom;

    /**
     * @return The time when the auto provisioning group is started. The period of time between this point in time and the point in time specified by the `valid_until` parameter is the effective time period of the auto provisioning group.By default, an auto provisioning group is immediately started after creation.
     * 
     */
    public Output<String> validFrom() {
        return this.validFrom;
    }
    /**
     * The time when the auto provisioning group expires. The period of time between this point in time and the point in time specified by the `valid_from` parameter is the effective time period of the auto provisioning group.By default, an auto provisioning group never expires.
     * 
     */
    @Export(name="validUntil", type=String.class, parameters={})
    private Output<String> validUntil;

    /**
     * @return The time when the auto provisioning group expires. The period of time between this point in time and the point in time specified by the `valid_from` parameter is the effective time period of the auto provisioning group.By default, an auto provisioning group never expires.
     * 
     */
    public Output<String> validUntil() {
        return this.validUntil;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutoProvisioningGroup(String name) {
        this(name, AutoProvisioningGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutoProvisioningGroup(String name, AutoProvisioningGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoProvisioningGroup(String name, AutoProvisioningGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/autoProvisioningGroup:AutoProvisioningGroup", name, args == null ? AutoProvisioningGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutoProvisioningGroup(String name, Output<String> id, @Nullable AutoProvisioningGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/autoProvisioningGroup:AutoProvisioningGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AutoProvisioningGroup get(String name, Output<String> id, @Nullable AutoProvisioningGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutoProvisioningGroup(name, id, state, options);
    }
}