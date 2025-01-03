// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.polardb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.polardb.DatabaseArgs;
import com.pulumi.alicloud.polardb.inputs.DatabaseState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a PolarDB database resource. A database deployed in a PolarDB cluster. A PolarDB cluster can own multiple databases.
 * 
 * &gt; **NOTE:** Available since v1.66.0.
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
 * import com.pulumi.alicloud.polardb.PolardbFunctions;
 * import com.pulumi.alicloud.polardb.inputs.GetNodeClassesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.polardb.Cluster;
 * import com.pulumi.alicloud.polardb.ClusterArgs;
 * import com.pulumi.alicloud.polardb.Database;
 * import com.pulumi.alicloud.polardb.DatabaseArgs;
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
 *         final var default = PolardbFunctions.getNodeClasses(GetNodeClassesArgs.builder()
 *             .dbType("MySQL")
 *             .dbVersion("8.0")
 *             .payType("PostPaid")
 *             .category("Normal")
 *             .build());
 * 
 *         var defaultNetwork = new Network("defaultNetwork", NetworkArgs.builder()
 *             .vpcName("terraform-example")
 *             .cidrBlock("172.16.0.0/16")
 *             .build());
 * 
 *         var defaultSwitch = new Switch("defaultSwitch", SwitchArgs.builder()
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock("172.16.0.0/24")
 *             .zoneId(default_.classes()[0].zoneId())
 *             .vswitchName("terraform-example")
 *             .build());
 * 
 *         var defaultCluster = new Cluster("defaultCluster", ClusterArgs.builder()
 *             .dbType("MySQL")
 *             .dbVersion("8.0")
 *             .dbNodeClass(default_.classes()[0].supportedEngines()[0].availableResources()[0].dbNodeClass())
 *             .payType("PostPaid")
 *             .vswitchId(defaultSwitch.id())
 *             .description("terraform-example")
 *             .build());
 * 
 *         var defaultDatabase = new Database("defaultDatabase", DatabaseArgs.builder()
 *             .dbClusterId(defaultCluster.id())
 *             .dbName("terraform-example")
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
 * PolarDB database can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:polardb/database:Database example &#34;pc-12345:tf_database&#34;
 * ```
 * 
 */
@ResourceType(type="alicloud:polardb/database:Database")
public class Database extends com.pulumi.resources.CustomResource {
    /**
     * Account name authorized to access the database. Only supports PostgreSQL.
     * 
     */
    @Export(name="accountName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountName;

    /**
     * @return Account name authorized to access the database. Only supports PostgreSQL.
     * 
     */
    public Output<Optional<String>> accountName() {
        return Codegen.optional(this.accountName);
    }
    /**
     * Character set. The value range is limited to the following: [ utf8, gbk, latin1, utf8mb4, Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ], default is &#34;utf8&#34; \(`utf8mb4` only supports versions 5.5 and 5.6\).
     * 
     */
    @Export(name="characterSetName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> characterSetName;

    /**
     * @return Character set. The value range is limited to the following: [ utf8, gbk, latin1, utf8mb4, Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ], default is &#34;utf8&#34; \(`utf8mb4` only supports versions 5.5 and 5.6\).
     * 
     */
    public Output<Optional<String>> characterSetName() {
        return Codegen.optional(this.characterSetName);
    }
    /**
     * The Id of cluster that can run database.
     * 
     */
    @Export(name="dbClusterId", refs={String.class}, tree="[0]")
    private Output<String> dbClusterId;

    /**
     * @return The Id of cluster that can run database.
     * 
     */
    public Output<String> dbClusterId() {
        return this.dbClusterId;
    }
    /**
     * Database description. It must start with a Chinese character or English letter, cannot start with &#34;http://&#34; or &#34;https://&#34;. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length must be 2-256 characters.
     * 
     */
    @Export(name="dbDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dbDescription;

    /**
     * @return Database description. It must start with a Chinese character or English letter, cannot start with &#34;http://&#34; or &#34;https://&#34;. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length must be 2-256 characters.
     * 
     */
    public Output<Optional<String>> dbDescription() {
        return Codegen.optional(this.dbDescription);
    }
    /**
     * Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letterand have no more than 64 characters.
     * 
     */
    @Export(name="dbName", refs={String.class}, tree="[0]")
    private Output<String> dbName;

    /**
     * @return Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letterand have no more than 64 characters.
     * 
     */
    public Output<String> dbName() {
        return this.dbName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(java.lang.String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(java.lang.String name, DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(java.lang.String name, DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:polardb/database:Database", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Database(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:polardb/database:Database", name, state, makeResourceOptions(options, id), false);
    }

    private static DatabaseArgs makeArgs(DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DatabaseArgs.Empty : args;
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
    public static Database get(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, state, options);
    }
}
