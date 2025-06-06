// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ess.SuspendProcessArgs;
import com.pulumi.alicloud.ess.inputs.SuspendProcessState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Suspend/Resume processes to a specified scaling group.
 * 
 * For information about scaling group suspend process, see [SuspendProcesses](https://www.alibabacloud.com/help/en/auto-scaling/latest/suspendprocesses).
 * 
 * &gt; **NOTE:** Available since v1.166.0.
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
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ess.ScalingGroup;
 * import com.pulumi.alicloud.ess.ScalingGroupArgs;
 * import com.pulumi.alicloud.ess.ScalingConfiguration;
 * import com.pulumi.alicloud.ess.ScalingConfigurationArgs;
 * import com.pulumi.alicloud.ess.SuspendProcess;
 * import com.pulumi.alicloud.ess.SuspendProcessArgs;
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
 *         var defaultNetwork = new Network("defaultNetwork", NetworkArgs.builder()
 *             .vpcName(myName)
 *             .cidrBlock("172.16.0.0/16")
 *             .build());
 * 
 *         var defaultSwitch = new Switch("defaultSwitch", SwitchArgs.builder()
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock("172.16.0.0/24")
 *             .zoneId(default_.zones()[0].id())
 *             .vswitchName(myName)
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup("defaultSecurityGroup", SecurityGroupArgs.builder()
 *             .name(myName)
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultScalingGroup = new ScalingGroup("defaultScalingGroup", ScalingGroupArgs.builder()
 *             .minSize(1)
 *             .maxSize(1)
 *             .scalingGroupName(myName)
 *             .vswitchIds(defaultSwitch.id())
 *             .removalPolicies("OldestInstance")
 *             .defaultCooldown(200)
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
 *         var defaultSuspendProcess = new SuspendProcess("defaultSuspendProcess", SuspendProcessArgs.builder()
 *             .scalingGroupId(defaultScalingConfiguration.scalingGroupId())
 *             .process("ScaleIn")
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
 * ESS suspend process can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ess/suspendProcess:SuspendProcess example asg-xxx:sgp-xxx:5000
 * ```
 * 
 */
@ResourceType(type="alicloud:ess/suspendProcess:SuspendProcess")
public class SuspendProcess extends com.pulumi.resources.CustomResource {
    /**
     * Activity type N that you want to suspend. Valid values are: `SCALE_OUT`,`SCALE_IN`,`HealthCheck`,`AlarmNotification` and `ScheduledAction`.
     * 
     */
    @Export(name="process", refs={String.class}, tree="[0]")
    private Output<String> process;

    /**
     * @return Activity type N that you want to suspend. Valid values are: `SCALE_OUT`,`SCALE_IN`,`HealthCheck`,`AlarmNotification` and `ScheduledAction`.
     * 
     */
    public Output<String> process() {
        return this.process;
    }
    /**
     * ID of the scaling group.
     * 
     */
    @Export(name="scalingGroupId", refs={String.class}, tree="[0]")
    private Output<String> scalingGroupId;

    /**
     * @return ID of the scaling group.
     * 
     */
    public Output<String> scalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SuspendProcess(java.lang.String name) {
        this(name, SuspendProcessArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SuspendProcess(java.lang.String name, SuspendProcessArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SuspendProcess(java.lang.String name, SuspendProcessArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/suspendProcess:SuspendProcess", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SuspendProcess(java.lang.String name, Output<java.lang.String> id, @Nullable SuspendProcessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/suspendProcess:SuspendProcess", name, state, makeResourceOptions(options, id), false);
    }

    private static SuspendProcessArgs makeArgs(SuspendProcessArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SuspendProcessArgs.Empty : args;
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
    public static SuspendProcess get(java.lang.String name, Output<java.lang.String> id, @Nullable SuspendProcessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SuspendProcess(name, id, state, options);
    }
}
