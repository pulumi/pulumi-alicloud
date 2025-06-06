// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ess.LifecycleHookArgs;
import com.pulumi.alicloud.ess.inputs.LifecycleHookState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ESS lifecycle hook resource. More about Ess lifecycle hook, see [LifecycleHook](https://www.alibabacloud.com/help/doc-detail/73839.htm).
 * 
 * &gt; **NOTE:** Available since v1.13.0.
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
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ess.ScalingGroup;
 * import com.pulumi.alicloud.ess.ScalingGroupArgs;
 * import com.pulumi.alicloud.ess.LifecycleHook;
 * import com.pulumi.alicloud.ess.LifecycleHookArgs;
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
 *         var default2 = new Switch("default2", SwitchArgs.builder()
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock("172.16.1.0/24")
 *             .zoneId(default_.zones()[0].id())
 *             .vswitchName(String.format("%s-bar", name))
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
 *             .defaultCooldown(200)
 *             .removalPolicies(            
 *                 "OldestInstance",
 *                 "NewestInstance")
 *             .vswitchIds(            
 *                 defaultSwitch.id(),
 *                 default2.id())
 *             .build());
 * 
 *         var defaultLifecycleHook = new LifecycleHook("defaultLifecycleHook", LifecycleHookArgs.builder()
 *             .scalingGroupId(defaultScalingGroup.id())
 *             .name(myName)
 *             .lifecycleTransition("SCALE_OUT")
 *             .heartbeatTimeout(400)
 *             .notificationMetadata("example")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Module Support
 * 
 * You can use to the existing autoscaling module
 * to create a lifecycle hook, scaling group and configuration one-click.
 * 
 * ## Import
 * 
 * Ess lifecycle hook can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ess/lifecycleHook:LifecycleHook example ash-l12345
 * ```
 * 
 */
@ResourceType(type="alicloud:ess/lifecycleHook:LifecycleHook")
public class LifecycleHook extends com.pulumi.resources.CustomResource {
    /**
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses. Applicable value: CONTINUE, ABANDON, ROLLBACK, default value: CONTINUE.
     * 
     */
    @Export(name="defaultResult", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultResult;

    /**
     * @return Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses. Applicable value: CONTINUE, ABANDON, ROLLBACK, default value: CONTINUE.
     * 
     */
    public Output<Optional<String>> defaultResult() {
        return Codegen.optional(this.defaultResult);
    }
    /**
     * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the default_result parameter. Default value: 600.
     * 
     */
    @Export(name="heartbeatTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> heartbeatTimeout;

    /**
     * @return Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the default_result parameter. Default value: 600.
     * 
     */
    public Output<Optional<Integer>> heartbeatTimeout() {
        return Codegen.optional(this.heartbeatTimeout);
    }
    /**
     * Type of Scaling activity attached to lifecycle hook. Supported value: SCALE_OUT, SCALE_IN.
     * 
     */
    @Export(name="lifecycleTransition", refs={String.class}, tree="[0]")
    private Output<String> lifecycleTransition;

    /**
     * @return Type of Scaling activity attached to lifecycle hook. Supported value: SCALE_OUT, SCALE_IN.
     * 
     */
    public Output<String> lifecycleTransition() {
        return this.lifecycleTransition;
    }
    /**
     * The name of the lifecycle hook, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is lifecycle hook id.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the lifecycle hook, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is lifecycle hook id.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Arn of notification target.
     * 
     */
    @Export(name="notificationArn", refs={String.class}, tree="[0]")
    private Output<String> notificationArn;

    /**
     * @return The Arn of notification target.
     * 
     */
    public Output<String> notificationArn() {
        return this.notificationArn;
    }
    /**
     * Additional information that you want to include when Auto Scaling sends a message to the notification target.
     * 
     */
    @Export(name="notificationMetadata", refs={String.class}, tree="[0]")
    private Output<String> notificationMetadata;

    /**
     * @return Additional information that you want to include when Auto Scaling sends a message to the notification target.
     * 
     */
    public Output<String> notificationMetadata() {
        return this.notificationMetadata;
    }
    /**
     * The ID of the Auto Scaling group to which you want to assign the lifecycle hook.
     * 
     */
    @Export(name="scalingGroupId", refs={String.class}, tree="[0]")
    private Output<String> scalingGroupId;

    /**
     * @return The ID of the Auto Scaling group to which you want to assign the lifecycle hook.
     * 
     */
    public Output<String> scalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LifecycleHook(java.lang.String name) {
        this(name, LifecycleHookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LifecycleHook(java.lang.String name, LifecycleHookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LifecycleHook(java.lang.String name, LifecycleHookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/lifecycleHook:LifecycleHook", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LifecycleHook(java.lang.String name, Output<java.lang.String> id, @Nullable LifecycleHookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/lifecycleHook:LifecycleHook", name, state, makeResourceOptions(options, id), false);
    }

    private static LifecycleHookArgs makeArgs(LifecycleHookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LifecycleHookArgs.Empty : args;
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
    public static LifecycleHook get(java.lang.String name, Output<java.lang.String> id, @Nullable LifecycleHookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LifecycleHook(name, id, state, options);
    }
}
