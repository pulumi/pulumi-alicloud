// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ess.AttachmentArgs;
import com.pulumi.alicloud.ess.inputs.AttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Attaches several ECS instances to a specified scaling group or remove them from it.
 * 
 * &gt; **NOTE:** ECS instances can be attached or remove only when the scaling group is active, and it has no scaling activity in progress.
 * 
 * &gt; **NOTE:** There are two types ECS instances in a scaling group: &#34;AutoCreated&#34; and &#34;Attached&#34;. The total number of them can not larger than the scaling group &#34;MaxSize&#34;.
 * 
 * &gt; **NOTE:** Available since v1.6.0.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.random.integer;
 * import com.pulumi.random.integerArgs;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.ecs.inputs.GetInstanceTypesArgs;
 * import com.pulumi.alicloud.ecs.inputs.GetImagesArgs;
 * import com.pulumi.alicloud.vpc.VpcFunctions;
 * import com.pulumi.alicloud.vpc.inputs.GetNetworksArgs;
 * import com.pulumi.alicloud.vpc.inputs.GetSwitchesArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroupRule;
 * import com.pulumi.alicloud.ecs.SecurityGroupRuleArgs;
 * import com.pulumi.alicloud.ess.ScalingGroup;
 * import com.pulumi.alicloud.ess.ScalingGroupArgs;
 * import com.pulumi.alicloud.ess.ScalingConfiguration;
 * import com.pulumi.alicloud.ess.ScalingConfigurationArgs;
 * import com.pulumi.alicloud.ecs.Instance;
 * import com.pulumi.alicloud.ecs.InstanceArgs;
 * import com.pulumi.alicloud.ess.Attachment;
 * import com.pulumi.alicloud.ess.AttachmentArgs;
 * import com.pulumi.codegen.internal.KeyedValue;
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
 *         final var name = config.get("name").orElse("terraform-example");
 *         var defaultInteger = new Integer("defaultInteger", IntegerArgs.builder()
 *             .min(10000)
 *             .max(99999)
 *             .build());
 * 
 *         final var myName = String.format("%s-%s", name,defaultInteger.result());
 * 
 *         final var default = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableDiskCategory("cloud_efficiency")
 *             .availableResourceCreation("VSwitch")
 *             .build());
 * 
 *         final var defaultGetInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .availabilityZone(default_.zones()[0].id())
 *             .cpuCoreCount(2)
 *             .memorySize(4)
 *             .build());
 * 
 *         final var defaultGetImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex("^ubuntu_18.*64")
 *             .mostRecent(true)
 *             .owners("system")
 *             .build());
 * 
 *         final var defaultGetNetworks = VpcFunctions.getNetworks(GetNetworksArgs.builder()
 *             .nameRegex("^default-NODELETING$")
 *             .cidrBlock("10.4.0.0/16")
 *             .build());
 * 
 *         final var defaultGetSwitches = VpcFunctions.getSwitches(GetSwitchesArgs.builder()
 *             .cidrBlock("10.4.0.0/24")
 *             .vpcId(defaultGetNetworks.ids()[0])
 *             .zoneId(default_.zones()[0].id())
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup("defaultSecurityGroup", SecurityGroupArgs.builder()
 *             .vpcId(defaultGetNetworks.ids()[0])
 *             .build());
 * 
 *         var defaultSecurityGroupRule = new SecurityGroupRule("defaultSecurityGroupRule", SecurityGroupRuleArgs.builder()
 *             .type("ingress")
 *             .ipProtocol("tcp")
 *             .nicType("intranet")
 *             .policy("accept")
 *             .portRange("22/22")
 *             .priority(1)
 *             .securityGroupId(defaultSecurityGroup.id())
 *             .cidrIp("172.16.0.0/24")
 *             .build());
 * 
 *         var defaultScalingGroup = new ScalingGroup("defaultScalingGroup", ScalingGroupArgs.builder()
 *             .minSize(0)
 *             .maxSize(2)
 *             .scalingGroupName(myName)
 *             .removalPolicies(            
 *                 "OldestInstance",
 *                 "NewestInstance")
 *             .vswitchIds(defaultGetSwitches.ids()[0])
 *             .build());
 * 
 *         var defaultScalingConfiguration = new ScalingConfiguration("defaultScalingConfiguration", ScalingConfigurationArgs.builder()
 *             .scalingGroupId(defaultScalingGroup.id())
 *             .imageId(defaultGetImages.images()[0].id())
 *             .instanceType(defaultGetInstanceTypes.instanceTypes()[0].id())
 *             .securityGroupId(defaultSecurityGroup.id())
 *             .forceDelete(true)
 *             .active(true)
 *             .enable(true)
 *             .build());
 * 
 *         for (var i = 0; i < 2; i++) {
 *             new Instance("defaultInstance-" + i, InstanceArgs.builder()
 *                 .imageId(defaultGetImages.images()[0].id())
 *                 .instanceType(defaultGetInstanceTypes.instanceTypes()[0].id())
 *                 .securityGroups(defaultSecurityGroup.id())
 *                 .internetChargeType("PayByTraffic")
 *                 .internetMaxBandwidthOut(10)
 *                 .instanceChargeType("PostPaid")
 *                 .systemDiskCategory("cloud_efficiency")
 *                 .vswitchId(defaultGetSwitches.ids()[0])
 *                 .instanceName(name)
 *                 .build());
 * 
 *         
 * }
 *         var defaultAttachment = new Attachment("defaultAttachment", AttachmentArgs.builder()
 *             .scalingGroupId(defaultScalingGroup.id())
 *             .instanceIds(            
 *                 defaultInstance[0].id(),
 *                 defaultInstance[1].id())
 *             .force(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ESS attachment can be imported using the id or scaling group id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ess/attachment:Attachment example asg-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:ess/attachment:Attachment")
public class Attachment extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether the scaling group manages the lifecycles of the instances that are manually added to the scaling group.
     * 
     */
    @Export(name="entrusted", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> entrusted;

    /**
     * @return Specifies whether the scaling group manages the lifecycles of the instances that are manually added to the scaling group.
     * 
     */
    public Output<Optional<Boolean>> entrusted() {
        return Codegen.optional(this.entrusted);
    }
    /**
     * Whether to remove forcibly &#34;AutoCreated&#34; ECS instances in order to release scaling group capacity &#34;MaxSize&#34; for attaching ECS instances. Default to false.
     * 
     */
    @Export(name="force", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return Whether to remove forcibly &#34;AutoCreated&#34; ECS instances in order to release scaling group capacity &#34;MaxSize&#34; for attaching ECS instances. Default to false.
     * 
     */
    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
     * 
     */
    @Export(name="instanceIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> instanceIds;

    /**
     * @return ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
     * 
     */
    public Output<List<String>> instanceIds() {
        return this.instanceIds;
    }
    /**
     * Specifies whether to trigger a lifecycle hook for the scaling group to which instances are being added.
     * 
     */
    @Export(name="lifecycleHook", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> lifecycleHook;

    /**
     * @return Specifies whether to trigger a lifecycle hook for the scaling group to which instances are being added.
     * 
     */
    public Output<Optional<Boolean>> lifecycleHook() {
        return Codegen.optional(this.lifecycleHook);
    }
    /**
     * The weight of ECS instance N or elastic container instance N as a backend server of the associated Server Load Balancer (SLB) instance. Valid values of N: 1 to 20. Valid values of this parameter: 1 to 100.
     * 
     * &gt; **NOTE:** &#34;AutoCreated&#34; ECS instance will be deleted after it is removed from scaling group, but &#34;Attached&#34; will be not.
     * 
     * &gt; **NOTE:** Restrictions on attaching ECS instances:
     * 
     * - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
     * - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
     * - The attached ECS instances must in the running state.
     * - The attached ECS instances has not been attached to other scaling groups.
     * - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
     * 
     */
    @Export(name="loadBalancerWeights", refs={List.class,Integer.class}, tree="[0,1]")
    private Output<List<Integer>> loadBalancerWeights;

    /**
     * @return The weight of ECS instance N or elastic container instance N as a backend server of the associated Server Load Balancer (SLB) instance. Valid values of N: 1 to 20. Valid values of this parameter: 1 to 100.
     * 
     * &gt; **NOTE:** &#34;AutoCreated&#34; ECS instance will be deleted after it is removed from scaling group, but &#34;Attached&#34; will be not.
     * 
     * &gt; **NOTE:** Restrictions on attaching ECS instances:
     * 
     * - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
     * - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
     * - The attached ECS instances must in the running state.
     * - The attached ECS instances has not been attached to other scaling groups.
     * - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
     * 
     */
    public Output<List<Integer>> loadBalancerWeights() {
        return this.loadBalancerWeights;
    }
    /**
     * ID of the scaling group of a scaling configuration.
     * 
     */
    @Export(name="scalingGroupId", refs={String.class}, tree="[0]")
    private Output<String> scalingGroupId;

    /**
     * @return ID of the scaling group of a scaling configuration.
     * 
     */
    public Output<String> scalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Attachment(java.lang.String name) {
        this(name, AttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Attachment(java.lang.String name, AttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Attachment(java.lang.String name, AttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/attachment:Attachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Attachment(java.lang.String name, Output<java.lang.String> id, @Nullable AttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/attachment:Attachment", name, state, makeResourceOptions(options, id), false);
    }

    private static AttachmentArgs makeArgs(AttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AttachmentArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static Attachment get(java.lang.String name, Output<java.lang.String> id, @Nullable AttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Attachment(name, id, state, options);
    }
}
