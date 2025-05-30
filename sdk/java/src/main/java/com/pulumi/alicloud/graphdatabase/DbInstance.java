// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.graphdatabase;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.graphdatabase.DbInstanceArgs;
import com.pulumi.alicloud.graphdatabase.inputs.DbInstanceState;
import com.pulumi.alicloud.graphdatabase.outputs.DbInstanceDbInstanceIpArray;
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
 * Provides a Graph Database Db Instance resource.
 * 
 * For information about Graph Database Db Instance and how to use it, see [What is Db Instance](https://www.alibabacloud.com/help/en/graph-compute/latest/placeholder).
 * 
 * &gt; **NOTE:** Available since v1.136.0.
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
 * import com.pulumi.alicloud.graphdatabase.DbInstance;
 * import com.pulumi.alicloud.graphdatabase.DbInstanceArgs;
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
 *         var example = new DbInstance("example", DbInstanceArgs.builder()
 *             .dbNodeClass("gdb.r.2xlarge")
 *             .dbInstanceNetworkType("vpc")
 *             .dbVersion("1.0")
 *             .dbInstanceCategory("HA")
 *             .dbInstanceStorageType("cloud_ssd")
 *             .dbNodeStorage(50)
 *             .paymentType("PayAsYouGo")
 *             .dbInstanceDescription(name)
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
 * Graph Database Db Instance can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:graphdatabase/dbInstance:DbInstance example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:graphdatabase/dbInstance:DbInstance")
public class DbInstance extends com.pulumi.resources.CustomResource {
    /**
     * (Available in 1.196.0+)  The connection string of the instance.
     * 
     */
    @Export(name="connectionString", refs={String.class}, tree="[0]")
    private Output<String> connectionString;

    /**
     * @return (Available in 1.196.0+)  The connection string of the instance.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }
    /**
     * The category of the db instance. Valid values: `HA`, `SINGLE`(Available in 1.173.0+).
     * 
     */
    @Export(name="dbInstanceCategory", refs={String.class}, tree="[0]")
    private Output<String> dbInstanceCategory;

    /**
     * @return The category of the db instance. Valid values: `HA`, `SINGLE`(Available in 1.173.0+).
     * 
     */
    public Output<String> dbInstanceCategory() {
        return this.dbInstanceCategory;
    }
    /**
     * According to the practical example or notes.
     * 
     */
    @Export(name="dbInstanceDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dbInstanceDescription;

    /**
     * @return According to the practical example or notes.
     * 
     */
    public Output<Optional<String>> dbInstanceDescription() {
        return Codegen.optional(this.dbInstanceDescription);
    }
    /**
     * IP ADDRESS whitelist for the instance group list. See `db_instance_ip_array` below.
     * 
     */
    @Export(name="dbInstanceIpArrays", refs={List.class,DbInstanceDbInstanceIpArray.class}, tree="[0,1]")
    private Output<List<DbInstanceDbInstanceIpArray>> dbInstanceIpArrays;

    /**
     * @return IP ADDRESS whitelist for the instance group list. See `db_instance_ip_array` below.
     * 
     */
    public Output<List<DbInstanceDbInstanceIpArray>> dbInstanceIpArrays() {
        return this.dbInstanceIpArrays;
    }
    /**
     * The network type of the db instance. Valid values: `vpc`.
     * 
     */
    @Export(name="dbInstanceNetworkType", refs={String.class}, tree="[0]")
    private Output<String> dbInstanceNetworkType;

    /**
     * @return The network type of the db instance. Valid values: `vpc`.
     * 
     */
    public Output<String> dbInstanceNetworkType() {
        return this.dbInstanceNetworkType;
    }
    /**
     * Disk storage type. Valid values: `cloud_essd`, `cloud_ssd`. Modification is not supported.
     * 
     */
    @Export(name="dbInstanceStorageType", refs={String.class}, tree="[0]")
    private Output<String> dbInstanceStorageType;

    /**
     * @return Disk storage type. Valid values: `cloud_essd`, `cloud_ssd`. Modification is not supported.
     * 
     */
    public Output<String> dbInstanceStorageType() {
        return this.dbInstanceStorageType;
    }
    /**
     * The class of the db node. Valid values: `gdb.r.xlarge`, `gdb.r.2xlarge`, `gdb.r.4xlarge`, `gdb.r.8xlarge`, `gdb.r.16xlarge`, `gdb.r.xlarge_basic`, `gdb.r.2xlarge_basic`, `gdb.r.4xlarge_basic`, `gdb.r.8xlarge_basic`, `gdb.r.16xlarge_basic`.
     * 
     */
    @Export(name="dbNodeClass", refs={String.class}, tree="[0]")
    private Output<String> dbNodeClass;

    /**
     * @return The class of the db node. Valid values: `gdb.r.xlarge`, `gdb.r.2xlarge`, `gdb.r.4xlarge`, `gdb.r.8xlarge`, `gdb.r.16xlarge`, `gdb.r.xlarge_basic`, `gdb.r.2xlarge_basic`, `gdb.r.4xlarge_basic`, `gdb.r.8xlarge_basic`, `gdb.r.16xlarge_basic`.
     * 
     */
    public Output<String> dbNodeClass() {
        return this.dbNodeClass;
    }
    /**
     * Instance storage space, which is measured in GB.
     * 
     */
    @Export(name="dbNodeStorage", refs={Integer.class}, tree="[0]")
    private Output<Integer> dbNodeStorage;

    /**
     * @return Instance storage space, which is measured in GB.
     * 
     */
    public Output<Integer> dbNodeStorage() {
        return this.dbNodeStorage;
    }
    /**
     * Kernel Version. Valid values: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
     * 
     */
    @Export(name="dbVersion", refs={String.class}, tree="[0]")
    private Output<String> dbVersion;

    /**
     * @return Kernel Version. Valid values: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
     * 
     */
    public Output<String> dbVersion() {
        return this.dbVersion;
    }
    /**
     * The paymen type of the resource. Valid values: `PayAsYouGo`.
     * 
     */
    @Export(name="paymentType", refs={String.class}, tree="[0]")
    private Output<String> paymentType;

    /**
     * @return The paymen type of the resource. Valid values: `PayAsYouGo`.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }
    /**
     * (Available in 1.196.0+) The connection port of the instance.
     * 
     */
    @Export(name="port", refs={String.class}, tree="[0]")
    private Output<String> port;

    /**
     * @return (Available in 1.196.0+) The connection port of the instance.
     * 
     */
    public Output<String> port() {
        return this.port;
    }
    /**
     * Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * ID of the VPC.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return ID of the VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The ID of attaching vswitch to instance.
     * 
     */
    @Export(name="vswitchId", refs={String.class}, tree="[0]")
    private Output<String> vswitchId;

    /**
     * @return The ID of attaching vswitch to instance.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }
    /**
     * The zone ID of the resource.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone ID of the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DbInstance(java.lang.String name) {
        this(name, DbInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DbInstance(java.lang.String name, DbInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DbInstance(java.lang.String name, DbInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:graphdatabase/dbInstance:DbInstance", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DbInstance(java.lang.String name, Output<java.lang.String> id, @Nullable DbInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:graphdatabase/dbInstance:DbInstance", name, state, makeResourceOptions(options, id), false);
    }

    private static DbInstanceArgs makeArgs(DbInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DbInstanceArgs.Empty : args;
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
    public static DbInstance get(java.lang.String name, Output<java.lang.String> id, @Nullable DbInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DbInstance(name, id, state, options);
    }
}
