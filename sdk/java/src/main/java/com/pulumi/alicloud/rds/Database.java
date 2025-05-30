// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.rds.DatabaseArgs;
import com.pulumi.alicloud.rds.inputs.DatabaseState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an RDS database resource. A DB database deployed in a DB instance. A DB instance can own multiple databases, see [What is DB Database](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-createdatabase).
 * 
 * &gt; **NOTE:** Available since v1.5.0.
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
 * import com.pulumi.alicloud.rds.RdsFunctions;
 * import com.pulumi.alicloud.rds.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.rds.Instance;
 * import com.pulumi.alicloud.rds.InstanceArgs;
 * import com.pulumi.alicloud.rds.Database;
 * import com.pulumi.alicloud.rds.DatabaseArgs;
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
 *         final var default = RdsFunctions.getZones(GetZonesArgs.builder()
 *             .engine("MySQL")
 *             .engineVersion("5.6")
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
 *         var defaultInstance = new Instance("defaultInstance", InstanceArgs.builder()
 *             .engine("MySQL")
 *             .engineVersion("5.6")
 *             .instanceType("rds.mysql.s1.small")
 *             .instanceStorage(10)
 *             .vswitchId(defaultSwitch.id())
 *             .instanceName(name)
 *             .build());
 * 
 *         var defaultDatabase = new Database("defaultDatabase", DatabaseArgs.builder()
 *             .instanceId(defaultInstance.id())
 *             .name(name)
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
 * RDS database can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:rds/database:Database example &#34;rm-12345:tf_database&#34;
 * ```
 * 
 */
@ResourceType(type="alicloud:rds/database:Database")
public class Database extends com.pulumi.resources.CustomResource {
    /**
     * Character set. The value range is limited to the following:
     * - MySQL: [ utf8, gbk, latin1, utf8mb4 ] \(`utf8mb4` only supports versions 5.5 and 5.6\).
     * - SQLServer: [ Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ]
     * - PostgreSQL: Valid values for PostgreSQL databases: a value in the `character set,&lt;Collate&gt;,&lt;Ctype&gt;` format. Example: `UTF8,C,en_US.utf8`.
     * &gt; - Valid values for the character set : [ KOI8U, UTF8, WIN866, WIN874, WIN1250, WIN1251, WIN1252, WIN1253, WIN1254, WIN1255, WIN1256, WIN1257, WIN1258, EUC_CN, EUC_KR, EUC_TW, EUC_JP, EUC_JIS_2004, KOI8R, MULE_INTERNAL, LATIN1, LATIN2, LATIN3, LATIN4, LATIN5, LATIN6, LATIN7, LATIN8, LATIN9, LATIN10, ISO_8859_5, ISO_8859_6, ISO_8859_7, ISO_8859_8, SQL_ASCII ]
     * &gt; - Valid values for the Collate field: You can execute the `SELECT DISTINCT collname FROM pg_collation;` statement to obtain the field value. The default value is `C`.
     * &gt; - Valid values for the Ctype field: You can execute the `SELECT DISTINCT collctype FROM pg_collation;` statement to obtain the field value. The default value is `en_US.utf8`.
     * - MariaDB: [ utf8, gbk, latin1, utf8mb4 ]
     * 
     * More details refer to [API Docs](https://www.alibabacloud.com/help/zh/doc-detail/26258.htm)
     * 
     */
    @Export(name="characterSet", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> characterSet;

    /**
     * @return Character set. The value range is limited to the following:
     * - MySQL: [ utf8, gbk, latin1, utf8mb4 ] \(`utf8mb4` only supports versions 5.5 and 5.6\).
     * - SQLServer: [ Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ]
     * - PostgreSQL: Valid values for PostgreSQL databases: a value in the `character set,&lt;Collate&gt;,&lt;Ctype&gt;` format. Example: `UTF8,C,en_US.utf8`.
     * &gt; - Valid values for the character set : [ KOI8U, UTF8, WIN866, WIN874, WIN1250, WIN1251, WIN1252, WIN1253, WIN1254, WIN1255, WIN1256, WIN1257, WIN1258, EUC_CN, EUC_KR, EUC_TW, EUC_JP, EUC_JIS_2004, KOI8R, MULE_INTERNAL, LATIN1, LATIN2, LATIN3, LATIN4, LATIN5, LATIN6, LATIN7, LATIN8, LATIN9, LATIN10, ISO_8859_5, ISO_8859_6, ISO_8859_7, ISO_8859_8, SQL_ASCII ]
     * &gt; - Valid values for the Collate field: You can execute the `SELECT DISTINCT collname FROM pg_collation;` statement to obtain the field value. The default value is `C`.
     * &gt; - Valid values for the Ctype field: You can execute the `SELECT DISTINCT collctype FROM pg_collation;` statement to obtain the field value. The default value is `en_US.utf8`.
     * - MariaDB: [ utf8, gbk, latin1, utf8mb4 ]
     * 
     * More details refer to [API Docs](https://www.alibabacloud.com/help/zh/doc-detail/26258.htm)
     * 
     */
    public Output<Optional<String>> characterSet() {
        return Codegen.optional(this.characterSet);
    }
    /**
     * Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     * 
     * &gt; **NOTE:** The value of &#34;name&#34; or &#34;character_set&#34;  does not support modification.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     * 
     * &gt; **NOTE:** The value of &#34;name&#34; or &#34;character_set&#34;  does not support modification.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The Id of instance that can run database.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The Id of instance that can run database.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The name of the database.
     * * &gt; **NOTE:**
     * The name must be 2 to 64 characters in length.
     * The name must start with a lowercase letter and end with a lowercase letter or digit.
     * The name can contain lowercase letters, digits, underscores (_), and hyphens (-).
     * The name must be unique within the instance.
     * For more information about invalid characters, see [Forbidden keywords table](https://help.aliyun.com/zh/rds/developer-reference/forbidden-keywords?spm=api-workbench.api_explorer.0.0.20e15f16d1z52p).
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the database.
     * * &gt; **NOTE:**
     * The name must be 2 to 64 characters in length.
     * The name must start with a lowercase letter and end with a lowercase letter or digit.
     * The name can contain lowercase letters, digits, underscores (_), and hyphens (-).
     * The name must be unique within the instance.
     * For more information about invalid characters, see [Forbidden keywords table](https://help.aliyun.com/zh/rds/developer-reference/forbidden-keywords?spm=api-workbench.api_explorer.0.0.20e15f16d1z52p).
     * 
     */
    public Output<String> name() {
        return this.name;
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
        super("alicloud:rds/database:Database", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Database(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/database:Database", name, state, makeResourceOptions(options, id), false);
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
