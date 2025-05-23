// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.edas;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.edas.DeployGroupArgs;
import com.pulumi.alicloud.edas.inputs.DeployGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an EDAS deploy group resource, see [What is EDAS Deploy Group](https://www.alibabacloud.com/help/en/edas/developer-reference/api-edas-2017-08-01-insertdeploygroup).
 * 
 * &gt; **NOTE:** Available since v1.82.0.
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
 * import com.pulumi.random.integer;
 * import com.pulumi.random.integerArgs;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetRegionsArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.edas.Cluster;
 * import com.pulumi.alicloud.edas.ClusterArgs;
 * import com.pulumi.alicloud.edas.Application;
 * import com.pulumi.alicloud.edas.ApplicationArgs;
 * import com.pulumi.alicloud.edas.DeployGroup;
 * import com.pulumi.alicloud.edas.DeployGroupArgs;
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
 *         var defaultInteger = new Integer("defaultInteger", IntegerArgs.builder()
 *             .min(10000)
 *             .max(99999)
 *             .build());
 * 
 *         final var default = AlicloudFunctions.getRegions(GetRegionsArgs.builder()
 *             .current(true)
 *             .build());
 * 
 *         var defaultNetwork = new Network("defaultNetwork", NetworkArgs.builder()
 *             .vpcName(String.format("%s-%s", name,defaultInteger.result()))
 *             .cidrBlock("10.4.0.0/16")
 *             .build());
 * 
 *         var defaultCluster = new Cluster("defaultCluster", ClusterArgs.builder()
 *             .clusterName(String.format("%s-%s", name,defaultInteger.result()))
 *             .clusterType(2)
 *             .networkMode(2)
 *             .logicalRegionId(default_.regions()[0].id())
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultApplication = new Application("defaultApplication", ApplicationArgs.builder()
 *             .applicationName(String.format("%s-%s", name,defaultInteger.result()))
 *             .clusterId(defaultCluster.id())
 *             .packageType("JAR")
 *             .build());
 * 
 *         var defaultDeployGroup = new DeployGroup("defaultDeployGroup", DeployGroupArgs.builder()
 *             .appId(defaultApplication.id())
 *             .groupName(String.format("%s-%s", name,defaultInteger.result()))
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
 * EDAS deploy group can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:edas/deployGroup:DeployGroup group app_id:group_name:group_id
 * ```
 * 
 */
@ResourceType(type="alicloud:edas/deployGroup:DeployGroup")
public class DeployGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the application that you want to deploy.
     * 
     */
    @Export(name="appId", refs={String.class}, tree="[0]")
    private Output<String> appId;

    /**
     * @return The ID of the application that you want to deploy.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * The name of the instance group that you want to create.
     * 
     */
    @Export(name="groupName", refs={String.class}, tree="[0]")
    private Output<String> groupName;

    /**
     * @return The name of the instance group that you want to create.
     * 
     */
    public Output<String> groupName() {
        return this.groupName;
    }
    /**
     * The type of the instance group that you want to create. Valid values: 0: Default group. 1: Phased release is disabled for traffic management. 2: Phased release is enabled for traffic management.
     * 
     */
    @Export(name="groupType", refs={Integer.class}, tree="[0]")
    private Output<Integer> groupType;

    /**
     * @return The type of the instance group that you want to create. Valid values: 0: Default group. 1: Phased release is disabled for traffic management. 2: Phased release is enabled for traffic management.
     * 
     */
    public Output<Integer> groupType() {
        return this.groupType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeployGroup(java.lang.String name) {
        this(name, DeployGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeployGroup(java.lang.String name, DeployGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeployGroup(java.lang.String name, DeployGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:edas/deployGroup:DeployGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DeployGroup(java.lang.String name, Output<java.lang.String> id, @Nullable DeployGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:edas/deployGroup:DeployGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static DeployGroupArgs makeArgs(DeployGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DeployGroupArgs.Empty : args;
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
    public static DeployGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable DeployGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeployGroup(name, id, state, options);
    }
}
