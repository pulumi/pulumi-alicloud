// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.EcsInvocationArgs;
import com.pulumi.alicloud.ecs.inputs.EcsInvocationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECS Invocation resource.
 * 
 * For information about ECS Invocation and how to use it, see [What is Invocation](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/invokecommand#t9958.html).
 * 
 * &gt; **NOTE:** Available since v1.168.0.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
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
 * import com.pulumi.alicloud.ecs.SecurityGroupRule;
 * import com.pulumi.alicloud.ecs.SecurityGroupRuleArgs;
 * import com.pulumi.alicloud.ecs.Instance;
 * import com.pulumi.alicloud.ecs.InstanceArgs;
 * import com.pulumi.alicloud.ecs.Command;
 * import com.pulumi.alicloud.ecs.CommandArgs;
 * import com.pulumi.alicloud.ecs.EcsInvocation;
 * import com.pulumi.alicloud.ecs.EcsInvocationArgs;
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
 *         final var name = config.get("name").orElse("tf-example");
 *         final var default = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableDiskCategory("cloud_efficiency")
 *             .availableResourceCreation("VSwitch")
 *             .build());
 * 
 *         final var defaultGetInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .availabilityZone(default_.zones()[0].id())
 *             .cpuCoreCount(2)
 *             .memorySize(8)
 *             .instanceTypeFamily("ecs.g6")
 *             .build());
 * 
 *         final var defaultGetImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex("^ubuntu_18.*64")
 *             .mostRecent(true)
 *             .owners("system")
 *             .build());
 * 
 *         var defaultNetwork = new Network("defaultNetwork", NetworkArgs.builder()
 *             .vpcName(name)
 *             .cidrBlock("172.16.0.0/16")
 *             .build());
 * 
 *         var defaultSwitch = new Switch("defaultSwitch", SwitchArgs.builder()
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock("172.16.0.0/24")
 *             .zoneId(default_.zones()[0].id())
 *             .vswitchName(name)
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup("defaultSecurityGroup", SecurityGroupArgs.builder()
 *             .securityGroupName(name)
 *             .vpcId(defaultNetwork.id())
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
 *         var defaultInstance = new Instance("defaultInstance", InstanceArgs.builder()
 *             .vswitchId(defaultSwitch.id())
 *             .imageId(defaultGetImages.images()[0].id())
 *             .instanceType(defaultGetInstanceTypes.instanceTypes()[0].id())
 *             .systemDiskCategory("cloud_efficiency")
 *             .internetChargeType("PayByTraffic")
 *             .internetMaxBandwidthOut(5)
 *             .securityGroups(defaultSecurityGroup.id())
 *             .instanceName(name)
 *             .build());
 * 
 *         var defaultCommand = new Command("defaultCommand", CommandArgs.builder()
 *             .name(name)
 *             .commandContent("ZWNobyBoZWxsbyx7e25hbWV9fQ==")
 *             .description("For Terraform Test")
 *             .type("RunShellScript")
 *             .workingDir("/root")
 *             .enableParameter(true)
 *             .build());
 * 
 *         var defaultEcsInvocation = new EcsInvocation("defaultEcsInvocation", EcsInvocationArgs.builder()
 *             .commandId(defaultCommand.id())
 *             .instanceIds(defaultInstance.id())
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
 * ECS Invocation can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ecs/ecsInvocation:EcsInvocation example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/ecsInvocation:EcsInvocation")
public class EcsInvocation extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the command.
     * 
     */
    @Export(name="commandId", refs={String.class}, tree="[0]")
    private Output<String> commandId;

    /**
     * @return The ID of the command.
     * 
     */
    public Output<String> commandId() {
        return this.commandId;
    }
    /**
     * The schedule on which the recurring execution of the command takes place. Take note of the following items:
     * * The interval between two consecutive executions must be 10 seconds or longer. The minimum interval cannot be less than the timeout period of the execution.
     * * When you set Timed to true, you must specify Frequency.
     * * The value of the Frequency parameter is a cron expression. For more information, see [Cron expression](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/cron-expression).
     * 
     */
    @Export(name="frequency", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> frequency;

    /**
     * @return The schedule on which the recurring execution of the command takes place. Take note of the following items:
     * * The interval between two consecutive executions must be 10 seconds or longer. The minimum interval cannot be less than the timeout period of the execution.
     * * When you set Timed to true, you must specify Frequency.
     * * The value of the Frequency parameter is a cron expression. For more information, see [Cron expression](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/cron-expression).
     * 
     */
    public Output<Optional<String>> frequency() {
        return Codegen.optional(this.frequency);
    }
    /**
     * The list of instances to execute the command. You can specify up to 50 instance IDs.
     * 
     */
    @Export(name="instanceIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> instanceIds;

    /**
     * @return The list of instances to execute the command. You can specify up to 50 instance IDs.
     * 
     */
    public Output<List<String>> instanceIds() {
        return this.instanceIds;
    }
    /**
     * The key-value pairs of custom parameters to be passed in when the custom parameter feature is enabled.  Number of custom parameters: 0 to 10.
     * 
     */
    @Export(name="parameters", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return The key-value pairs of custom parameters to be passed in when the custom parameter feature is enabled.  Number of custom parameters: 0 to 10.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * Specifies how to run the command. Valid values: `Once`, `Period`, `NextRebootOnly`, `EveryReboot`. Default value: When `timed` is set to false and Frequency is not specified, the default value of `repeat_mode` is `Once`. When `Timed` is set to true and Frequency is specified, `period` is used as the value of RepeatMode regardless of whether `repeat_mode` is specified.
     * 
     */
    @Export(name="repeatMode", refs={String.class}, tree="[0]")
    private Output<String> repeatMode;

    /**
     * @return Specifies how to run the command. Valid values: `Once`, `Period`, `NextRebootOnly`, `EveryReboot`. Default value: When `timed` is set to false and Frequency is not specified, the default value of `repeat_mode` is `Once`. When `Timed` is set to true and Frequency is specified, `period` is used as the value of RepeatMode regardless of whether `repeat_mode` is specified.
     * 
     */
    public Output<String> repeatMode() {
        return this.repeatMode;
    }
    /**
     * The status of the resource.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Specifies whether to periodically run the command. Default value: `false`.
     * 
     */
    @Export(name="timed", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> timed;

    /**
     * @return Specifies whether to periodically run the command. Default value: `false`.
     * 
     */
    public Output<Boolean> timed() {
        return this.timed;
    }
    /**
     * The username that is used to run the command on the ECS instance.
     * * For Linux instances, the root username is used.
     * * For Windows instances, the System username is used.
     * * You can also specify other usernames that already exist in the ECS instance to run the command. It is more secure to run Cloud Assistant commands as a regular user. For more information, see [Configure a regular user to run Cloud Assistant commands](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/run-cloud-assistant-commands-as-a-regular-user).
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return The username that is used to run the command on the ECS instance.
     * * For Linux instances, the root username is used.
     * * For Windows instances, the System username is used.
     * * You can also specify other usernames that already exist in the ECS instance to run the command. It is more secure to run Cloud Assistant commands as a regular user. For more information, see [Configure a regular user to run Cloud Assistant commands](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/run-cloud-assistant-commands-as-a-regular-user).
     * 
     */
    public Output<String> username() {
        return this.username;
    }
    /**
     * The name of the password used to run the command on a Windows instance.
     * 
     */
    @Export(name="windowsPasswordName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> windowsPasswordName;

    /**
     * @return The name of the password used to run the command on a Windows instance.
     * 
     */
    public Output<Optional<String>> windowsPasswordName() {
        return Codegen.optional(this.windowsPasswordName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcsInvocation(java.lang.String name) {
        this(name, EcsInvocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcsInvocation(java.lang.String name, EcsInvocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcsInvocation(java.lang.String name, EcsInvocationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsInvocation:EcsInvocation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EcsInvocation(java.lang.String name, Output<java.lang.String> id, @Nullable EcsInvocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsInvocation:EcsInvocation", name, state, makeResourceOptions(options, id), false);
    }

    private static EcsInvocationArgs makeArgs(EcsInvocationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EcsInvocationArgs.Empty : args;
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
    public static EcsInvocation get(java.lang.String name, Output<java.lang.String> id, @Nullable EcsInvocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcsInvocation(name, id, state, options);
    }
}
