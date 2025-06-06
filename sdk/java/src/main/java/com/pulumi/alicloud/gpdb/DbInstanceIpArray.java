// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.gpdb.DbInstanceIpArrayArgs;
import com.pulumi.alicloud.gpdb.inputs.DbInstanceIpArrayState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a GPDB DB Instance IP Array resource.
 * 
 * Whitelist IP Group.
 * 
 * For information about GPDB DB Instance IP Array and how to use it, see [What is DB Instance IP Array](https://www.alibabacloud.com/help/en/).
 * 
 * &gt; **NOTE:** Available since v1.231.0.
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
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.gpdb.Instance;
 * import com.pulumi.alicloud.gpdb.InstanceArgs;
 * import com.pulumi.alicloud.gpdb.DbInstanceIpArray;
 * import com.pulumi.alicloud.gpdb.DbInstanceIpArrayArgs;
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
 *         final var default = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation("VSwitch")
 *             .build());
 * 
 *         var defaultNpLRa1 = new Network("defaultNpLRa1", NetworkArgs.builder()
 *             .cidrBlock("192.168.0.0/16")
 *             .build());
 * 
 *         var defaultwLA5v4 = new Switch("defaultwLA5v4", SwitchArgs.builder()
 *             .vpcId(defaultNpLRa1.id())
 *             .zoneId("cn-beijing-h")
 *             .cidrBlock("192.168.1.0/24")
 *             .build());
 * 
 *         var defaultHKdDs3 = new Instance("defaultHKdDs3", InstanceArgs.builder()
 *             .instanceSpec("2C8G")
 *             .segNodeNum(2)
 *             .segStorageType("cloud_essd")
 *             .instanceNetworkType("VPC")
 *             .dbInstanceCategory("Basic")
 *             .paymentType("PayAsYouGo")
 *             .sslEnabled(0)
 *             .engineVersion("6.0")
 *             .zoneId("cn-beijing-h")
 *             .vswitchId(defaultwLA5v4.id())
 *             .storageSize(50)
 *             .masterCu(4)
 *             .vpcId(defaultNpLRa1.id())
 *             .dbInstanceMode("StorageElastic")
 *             .engine("gpdb")
 *             .description(name)
 *             .build());
 * 
 *         var defaultDbInstanceIpArray = new DbInstanceIpArray("defaultDbInstanceIpArray", DbInstanceIpArrayArgs.builder()
 *             .dbInstanceIpArrayAttribute("taffyFish")
 *             .securityIpLists(            
 *                 "12.34.56.78",
 *                 "11.45.14.0",
 *                 "19.19.81.0")
 *             .dbInstanceIpArrayName("taffy")
 *             .dbInstanceId(defaultHKdDs3.id())
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
 * GPDB DB Instance IP Array can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:gpdb/dbInstanceIpArray:DbInstanceIpArray example &lt;db_instance_id&gt;:&lt;db_instance_ip_array_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:gpdb/dbInstanceIpArray:DbInstanceIpArray")
public class DbInstanceIpArray extends com.pulumi.resources.CustomResource {
    /**
     * The instance ID.
     * 
     * &gt; **NOTE:**  You can call the [DescribeDBInstances](https://www.alibabacloud.com/help/en/doc-detail/86911.html) operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
     * 
     */
    @Export(name="dbInstanceId", refs={String.class}, tree="[0]")
    private Output<String> dbInstanceId;

    /**
     * @return The instance ID.
     * 
     * &gt; **NOTE:**  You can call the [DescribeDBInstances](https://www.alibabacloud.com/help/en/doc-detail/86911.html) operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
     * 
     */
    public Output<String> dbInstanceId() {
        return this.dbInstanceId;
    }
    /**
     * The default is empty. To distinguish between different attribute values, the console does not display groups with the &#39;hidden&#39; attribute.
     * 
     */
    @Export(name="dbInstanceIpArrayAttribute", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dbInstanceIpArrayAttribute;

    /**
     * @return The default is empty. To distinguish between different attribute values, the console does not display groups with the &#39;hidden&#39; attribute.
     * 
     */
    public Output<Optional<String>> dbInstanceIpArrayAttribute() {
        return Codegen.optional(this.dbInstanceIpArrayAttribute);
    }
    /**
     * The name of the IP address whitelist. If you do not specify this parameter, the default whitelist is queried.
     * 
     * &gt; **NOTE:**   Each instance supports up to 50 IP address whitelists.
     * 
     */
    @Export(name="dbInstanceIpArrayName", refs={String.class}, tree="[0]")
    private Output<String> dbInstanceIpArrayName;

    /**
     * @return The name of the IP address whitelist. If you do not specify this parameter, the default whitelist is queried.
     * 
     * &gt; **NOTE:**   Each instance supports up to 50 IP address whitelists.
     * 
     */
    public Output<String> dbInstanceIpArrayName() {
        return this.dbInstanceIpArrayName;
    }
    /**
     * The method of modification. Valid values:
     * 
     * - `Cover`: overwrites the whitelist.
     * - `Append`: appends data to the whitelist.
     * - `Delete`: deletes the whitelist.
     * 
     */
    @Export(name="modifyMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> modifyMode;

    /**
     * @return The method of modification. Valid values:
     * 
     * - `Cover`: overwrites the whitelist.
     * - `Append`: appends data to the whitelist.
     * - `Delete`: deletes the whitelist.
     * 
     */
    public Output<Optional<String>> modifyMode() {
        return Codegen.optional(this.modifyMode);
    }
    /**
     * The IP address whitelist contains a maximum of 1000 IP addresses separated by commas in the following three formats:
     * - 0.0.0.0/0
     * - 10.23.12.24(IP)
     * - 10.23.12.24/24(CIDR mode, Classless Inter-Domain Routing, &#39;/24&#39; indicates the length of the prefix in the address, and the range is &#39;[1,32]&#39;)
     * 
     */
    @Export(name="securityIpLists", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityIpLists;

    /**
     * @return The IP address whitelist contains a maximum of 1000 IP addresses separated by commas in the following three formats:
     * - 0.0.0.0/0
     * - 10.23.12.24(IP)
     * - 10.23.12.24/24(CIDR mode, Classless Inter-Domain Routing, &#39;/24&#39; indicates the length of the prefix in the address, and the range is &#39;[1,32]&#39;)
     * 
     */
    public Output<List<String>> securityIpLists() {
        return this.securityIpLists;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DbInstanceIpArray(java.lang.String name) {
        this(name, DbInstanceIpArrayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DbInstanceIpArray(java.lang.String name, DbInstanceIpArrayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DbInstanceIpArray(java.lang.String name, DbInstanceIpArrayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gpdb/dbInstanceIpArray:DbInstanceIpArray", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DbInstanceIpArray(java.lang.String name, Output<java.lang.String> id, @Nullable DbInstanceIpArrayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gpdb/dbInstanceIpArray:DbInstanceIpArray", name, state, makeResourceOptions(options, id), false);
    }

    private static DbInstanceIpArrayArgs makeArgs(DbInstanceIpArrayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DbInstanceIpArrayArgs.Empty : args;
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
    public static DbInstanceIpArray get(java.lang.String name, Output<java.lang.String> id, @Nullable DbInstanceIpArrayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DbInstanceIpArray(name, id, state, options);
    }
}
