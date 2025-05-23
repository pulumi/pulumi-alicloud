// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.gpdb.RemoteAdbDataSourceArgs;
import com.pulumi.alicloud.gpdb.inputs.RemoteAdbDataSourceState;
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
 * Provides a GPDB Remote ADB Data Source resource.
 * 
 * RemoteADBDataSource is the data external table call method between greenplums, which will be used for data external table access between ADB-PG.
 * 
 * For information about GPDB Remote ADB Data Source and how to use it, see [What is Remote ADB Data Source](https://www.alibabacloud.com/help/en/analyticdb/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-createremoteadbdatasource).
 * 
 * &gt; **NOTE:** Available since v1.227.0.
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
 * import com.pulumi.alicloud.gpdb.Account;
 * import com.pulumi.alicloud.gpdb.AccountArgs;
 * import com.pulumi.alicloud.gpdb.RemoteAdbDataSource;
 * import com.pulumi.alicloud.gpdb.RemoteAdbDataSourceArgs;
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
 *         var default4Mf0nY = new Network("default4Mf0nY", NetworkArgs.builder()
 *             .cidrBlock("192.168.0.0/16")
 *             .build());
 * 
 *         var defaultwSAVpf = new Switch("defaultwSAVpf", SwitchArgs.builder()
 *             .vpcId(default4Mf0nY.id())
 *             .zoneId("cn-beijing-h")
 *             .cidrBlock("192.168.1.0/24")
 *             .build());
 * 
 *         var defaultEtEzMF = new Instance("defaultEtEzMF", InstanceArgs.builder()
 *             .instanceSpec("2C8G")
 *             .description(name)
 *             .segNodeNum(2)
 *             .segStorageType("cloud_essd")
 *             .instanceNetworkType("VPC")
 *             .dbInstanceCategory("Basic")
 *             .paymentType("PayAsYouGo")
 *             .sslEnabled(0)
 *             .engineVersion("6.0")
 *             .zoneId("cn-beijing-h")
 *             .vswitchId(defaultwSAVpf.id())
 *             .storageSize(50)
 *             .masterCu(4)
 *             .vpcId(default4Mf0nY.id())
 *             .dbInstanceMode("StorageElastic")
 *             .engine("gpdb")
 *             .build());
 * 
 *         var defaultEY7t9t = new Instance("defaultEY7t9t", InstanceArgs.builder()
 *             .instanceSpec("2C8G")
 *             .description(name)
 *             .segNodeNum(2)
 *             .segStorageType("cloud_essd")
 *             .instanceNetworkType("VPC")
 *             .dbInstanceCategory("Basic")
 *             .paymentType("PayAsYouGo")
 *             .sslEnabled(0)
 *             .engineVersion("6.0")
 *             .zoneId("cn-beijing-h")
 *             .vswitchId(defaultwSAVpf.id())
 *             .storageSize(50)
 *             .masterCu(4)
 *             .vpcId(default4Mf0nY.id())
 *             .dbInstanceMode("StorageElastic")
 *             .engine("gpdb")
 *             .build());
 * 
 *         var default26qpEo = new Account("default26qpEo", AccountArgs.builder()
 *             .accountDescription("example_001")
 *             .dbInstanceId(defaultEtEzMF.id())
 *             .accountName("example_001")
 *             .accountPassword("example_001")
 *             .build());
 * 
 *         var defaultwXePof = new Account("defaultwXePof", AccountArgs.builder()
 *             .accountDescription("example_001")
 *             .dbInstanceId(defaultEY7t9t.id())
 *             .accountName("example_001")
 *             .accountPassword("example_001")
 *             .build());
 * 
 *         var defaultRemoteAdbDataSource = new RemoteAdbDataSource("defaultRemoteAdbDataSource", RemoteAdbDataSourceArgs.builder()
 *             .remoteDatabase("example_001")
 *             .managerUserName("example_001")
 *             .userName("example_001")
 *             .remoteDbInstanceId(defaultwXePof.dbInstanceId())
 *             .localDatabase("example_001")
 *             .dataSourceName("myexample")
 *             .userPassword("example_001")
 *             .managerUserPassword("example_001")
 *             .localDbInstanceId(defaultEtEzMF.id())
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
 * GPDB Remote ADB Data Source can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:gpdb/remoteAdbDataSource:RemoteAdbDataSource example &lt;local_db_instance_id&gt;:&lt;remote_adb_data_source_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:gpdb/remoteAdbDataSource:RemoteAdbDataSource")
public class RemoteAdbDataSource extends com.pulumi.resources.CustomResource {
    /**
     * Data Source Name
     * 
     */
    @Export(name="dataSourceName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataSourceName;

    /**
     * @return Data Source Name
     * 
     */
    public Output<Optional<String>> dataSourceName() {
        return Codegen.optional(this.dataSourceName);
    }
    /**
     * The database of the local instance which connection data.
     * 
     */
    @Export(name="localDatabase", refs={String.class}, tree="[0]")
    private Output<String> localDatabase;

    /**
     * @return The database of the local instance which connection data.
     * 
     */
    public Output<String> localDatabase() {
        return this.localDatabase;
    }
    /**
     * The instanceId of the local instance which connection data.
     * 
     */
    @Export(name="localDbInstanceId", refs={String.class}, tree="[0]")
    private Output<String> localDbInstanceId;

    /**
     * @return The instanceId of the local instance which connection data.
     * 
     */
    public Output<String> localDbInstanceId() {
        return this.localDbInstanceId;
    }
    /**
     * The Management user name of the local instance.
     * 
     */
    @Export(name="managerUserName", refs={String.class}, tree="[0]")
    private Output<String> managerUserName;

    /**
     * @return The Management user name of the local instance.
     * 
     */
    public Output<String> managerUserName() {
        return this.managerUserName;
    }
    /**
     * Password of the Manager user of the local instance
     * 
     */
    @Export(name="managerUserPassword", refs={String.class}, tree="[0]")
    private Output<String> managerUserPassword;

    /**
     * @return Password of the Manager user of the local instance
     * 
     */
    public Output<String> managerUserPassword() {
        return this.managerUserPassword;
    }
    /**
     * The first ID of the resource
     * 
     */
    @Export(name="remoteAdbDataSourceId", refs={Integer.class}, tree="[0]")
    private Output<Integer> remoteAdbDataSourceId;

    /**
     * @return The first ID of the resource
     * 
     */
    public Output<Integer> remoteAdbDataSourceId() {
        return this.remoteAdbDataSourceId;
    }
    /**
     * The database of the remote instance which provide data.
     * 
     */
    @Export(name="remoteDatabase", refs={String.class}, tree="[0]")
    private Output<String> remoteDatabase;

    /**
     * @return The database of the remote instance which provide data.
     * 
     */
    public Output<String> remoteDatabase() {
        return this.remoteDatabase;
    }
    /**
     * The instanceId of the remote instance which provide data.
     * 
     */
    @Export(name="remoteDbInstanceId", refs={String.class}, tree="[0]")
    private Output<String> remoteDbInstanceId;

    /**
     * @return The instanceId of the remote instance which provide data.
     * 
     */
    public Output<String> remoteDbInstanceId() {
        return this.remoteDbInstanceId;
    }
    /**
     * The status of the resource
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The user name used to connect to the remote instance
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output<String> userName;

    /**
     * @return The user name used to connect to the remote instance
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }
    /**
     * The user password used to connect to the remote instance
     * 
     */
    @Export(name="userPassword", refs={String.class}, tree="[0]")
    private Output<String> userPassword;

    /**
     * @return The user password used to connect to the remote instance
     * 
     */
    public Output<String> userPassword() {
        return this.userPassword;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RemoteAdbDataSource(java.lang.String name) {
        this(name, RemoteAdbDataSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RemoteAdbDataSource(java.lang.String name, RemoteAdbDataSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RemoteAdbDataSource(java.lang.String name, RemoteAdbDataSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gpdb/remoteAdbDataSource:RemoteAdbDataSource", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RemoteAdbDataSource(java.lang.String name, Output<java.lang.String> id, @Nullable RemoteAdbDataSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gpdb/remoteAdbDataSource:RemoteAdbDataSource", name, state, makeResourceOptions(options, id), false);
    }

    private static RemoteAdbDataSourceArgs makeArgs(RemoteAdbDataSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RemoteAdbDataSourceArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "managerUserPassword",
                "userPassword"
            ))
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
    public static RemoteAdbDataSource get(java.lang.String name, Output<java.lang.String> id, @Nullable RemoteAdbDataSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RemoteAdbDataSource(name, id, state, options);
    }
}
