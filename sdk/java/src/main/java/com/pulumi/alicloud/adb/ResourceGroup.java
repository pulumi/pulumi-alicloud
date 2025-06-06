// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.adb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.adb.ResourceGroupArgs;
import com.pulumi.alicloud.adb.inputs.ResourceGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a AnalyticDB for MySQL (ADB) Resource Group resource.
 * 
 * For information about AnalyticDB for MySQL (ADB) Resource Group and how to use it, see [What is Resource Group](https://www.alibabacloud.com/help/en/analyticdb-for-mysql/latest/api-doc-adb-2019-03-15-api-doc-createdbresourcegroup).
 * 
 * &gt; **NOTE:** Available since v1.195.0.
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
 * import com.pulumi.alicloud.adb.AdbFunctions;
 * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetResourceGroupsArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.adb.DBCluster;
 * import com.pulumi.alicloud.adb.DBClusterArgs;
 * import com.pulumi.alicloud.adb.ResourceGroup;
 * import com.pulumi.alicloud.adb.ResourceGroupArgs;
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
 *         final var name = config.get("name").orElse("tf_example");
 *         final var default = AdbFunctions.getZones(GetZonesArgs.builder()
 *             .build());
 * 
 *         final var defaultGetResourceGroups = ResourcemanagerFunctions.getResourceGroups(GetResourceGroupsArgs.builder()
 *             .status("OK")
 *             .build());
 * 
 *         var defaultNetwork = new Network("defaultNetwork", NetworkArgs.builder()
 *             .vpcName(name)
 *             .cidrBlock("10.4.0.0/16")
 *             .build());
 * 
 *         var defaultSwitch = new Switch("defaultSwitch", SwitchArgs.builder()
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock("10.4.0.0/24")
 *             .zoneId(default_.zones()[0].id())
 *             .vswitchName(name)
 *             .build());
 * 
 *         var defaultDBCluster = new DBCluster("defaultDBCluster", DBClusterArgs.builder()
 *             .computeResource("48Core192GB")
 *             .dbClusterCategory("MixedStorage")
 *             .dbClusterVersion("3.0")
 *             .dbNodeClass("E32")
 *             .dbNodeStorage(100)
 *             .description(name)
 *             .elasticIoResource(1)
 *             .maintainTime("04:00Z-05:00Z")
 *             .mode("flexible")
 *             .paymentType("PayAsYouGo")
 *             .resourceGroupId(defaultGetResourceGroups.ids()[0])
 *             .securityIps(            
 *                 "10.168.1.12",
 *                 "10.168.1.11")
 *             .vpcId(defaultNetwork.id())
 *             .vswitchId(defaultSwitch.id())
 *             .zoneId(default_.zones()[0].id())
 *             .tags(Map.ofEntries(
 *                 Map.entry("Created", "TF"),
 *                 Map.entry("For", "example")
 *             ))
 *             .build());
 * 
 *         var defaultResourceGroup = new ResourceGroup("defaultResourceGroup", ResourceGroupArgs.builder()
 *             .groupName("TF_EXAMPLE")
 *             .groupType("batch")
 *             .nodeNum(0)
 *             .dbClusterId(defaultDBCluster.id())
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
 * Adb Resource Group can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:adb/resourceGroup:ResourceGroup example &lt;db_cluster_id&gt;:&lt;group_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:adb/resourceGroup:ResourceGroup")
public class ResourceGroup extends com.pulumi.resources.CustomResource {
    /**
     * The time when the resource group was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The time when the resource group was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The ID of the DBCluster.
     * 
     */
    @Export(name="dbClusterId", refs={String.class}, tree="[0]")
    private Output<String> dbClusterId;

    /**
     * @return The ID of the DBCluster.
     * 
     */
    public Output<String> dbClusterId() {
        return this.dbClusterId;
    }
    /**
     * The name of the resource group. The `group_name` can be up to 255 characters in length and can contain digits, uppercase letters, hyphens (-), and underscores (_). It must start with a digit or uppercase letter.
     * 
     */
    @Export(name="groupName", refs={String.class}, tree="[0]")
    private Output<String> groupName;

    /**
     * @return The name of the resource group. The `group_name` can be up to 255 characters in length and can contain digits, uppercase letters, hyphens (-), and underscores (_). It must start with a digit or uppercase letter.
     * 
     */
    public Output<String> groupName() {
        return this.groupName;
    }
    /**
     * The query execution mode. Default value: `interactive`. Valid values: `interactive`, `batch`.
     * 
     */
    @Export(name="groupType", refs={String.class}, tree="[0]")
    private Output<String> groupType;

    /**
     * @return The query execution mode. Default value: `interactive`. Valid values: `interactive`, `batch`.
     * 
     */
    public Output<String> groupType() {
        return this.groupType;
    }
    /**
     * The number of nodes.
     * 
     */
    @Export(name="nodeNum", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> nodeNum;

    /**
     * @return The number of nodes.
     * 
     */
    public Output<Optional<Integer>> nodeNum() {
        return Codegen.optional(this.nodeNum);
    }
    /**
     * The time when the resource group was updated.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The time when the resource group was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * The database accounts that are associated with the resource group.
     * 
     */
    @Export(name="user", refs={String.class}, tree="[0]")
    private Output<String> user;

    /**
     * @return The database accounts that are associated with the resource group.
     * 
     */
    public Output<String> user() {
        return this.user;
    }
    /**
     * The database accounts with which to associate the resource group.
     * 
     */
    @Export(name="users", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> users;

    /**
     * @return The database accounts with which to associate the resource group.
     * 
     */
    public Output<Optional<List<String>>> users() {
        return Codegen.optional(this.users);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceGroup(java.lang.String name) {
        this(name, ResourceGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceGroup(java.lang.String name, ResourceGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceGroup(java.lang.String name, ResourceGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:adb/resourceGroup:ResourceGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ResourceGroup(java.lang.String name, Output<java.lang.String> id, @Nullable ResourceGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:adb/resourceGroup:ResourceGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static ResourceGroupArgs makeArgs(ResourceGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ResourceGroupArgs.Empty : args;
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
    public static ResourceGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable ResourceGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceGroup(name, id, state, options);
    }
}
