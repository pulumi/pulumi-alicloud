// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.rds.AccountPrivilegeArgs;
import com.pulumi.alicloud.rds.inputs.AccountPrivilegeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an RDS account privilege resource and used to grant several database some access privilege. A database can be granted by multiple account, see [What is DB Account Privilege](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-grantaccountprivilege).
 * 
 * &gt; **NOTE:** At present, a database can only have one database owner.
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
 * import com.pulumi.alicloud.rds.Account;
 * import com.pulumi.alicloud.rds.AccountArgs;
 * import com.pulumi.alicloud.rds.AccountPrivilege;
 * import com.pulumi.alicloud.rds.AccountPrivilegeArgs;
 * import com.pulumi.codegen.internal.KeyedValue;
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
 *         var instance = new Instance("instance", InstanceArgs.builder()
 *             .engine("MySQL")
 *             .engineVersion("5.6")
 *             .instanceType("rds.mysql.s1.small")
 *             .instanceStorage(10)
 *             .vswitchId(defaultSwitch.id())
 *             .instanceName(name)
 *             .build());
 * 
 *         for (var i = 0; i < 2; i++) {
 *             new Database("db-" + i, DatabaseArgs.builder()
 *                 .instanceId(instance.id())
 *                 .name(String.format("%s_%s", name,range.value()))
 *                 .description("from terraform")
 *                 .build());
 * 
 *         
 * }
 *         var account = new Account("account", AccountArgs.builder()
 *             .dbInstanceId(instance.id())
 *             .accountName("tfexample")
 *             .accountPassword("Example12345")
 *             .accountDescription("from terraform")
 *             .build());
 * 
 *         var privilege = new AccountPrivilege("privilege", AccountPrivilegeArgs.builder()
 *             .instanceId(instance.id())
 *             .accountName(account.accountName())
 *             .privilege("ReadOnly")
 *             .dbNames(db.stream().map(element -> element.name()).collect(toList()))
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
 * RDS account privilege can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:rds/accountPrivilege:AccountPrivilege example &#34;rm-12345:tf_account:ReadOnly&#34;
 * ```
 * 
 */
@ResourceType(type="alicloud:rds/accountPrivilege:AccountPrivilege")
public class AccountPrivilege extends com.pulumi.resources.CustomResource {
    /**
     * A specified account name.
     * 
     */
    @Export(name="accountName", refs={String.class}, tree="[0]")
    private Output<String> accountName;

    /**
     * @return A specified account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }
    /**
     * List of specified database name.
     * 
     */
    @Export(name="dbNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dbNames;

    /**
     * @return List of specified database name.
     * 
     */
    public Output<List<String>> dbNames() {
        return this.dbNames;
    }
    /**
     * The Id of instance in which account belongs.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The Id of instance in which account belongs.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The privilege of one account access database. Valid values:
     * - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
     * - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
     * - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
     *   Default to &#34;ReadOnly&#34;.
     * 
     */
    @Export(name="privilege", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privilege;

    /**
     * @return The privilege of one account access database. Valid values:
     * - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
     * - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
     * - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
     *   Default to &#34;ReadOnly&#34;.
     * 
     */
    public Output<Optional<String>> privilege() {
        return Codegen.optional(this.privilege);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountPrivilege(java.lang.String name) {
        this(name, AccountPrivilegeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountPrivilege(java.lang.String name, AccountPrivilegeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountPrivilege(java.lang.String name, AccountPrivilegeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/accountPrivilege:AccountPrivilege", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AccountPrivilege(java.lang.String name, Output<java.lang.String> id, @Nullable AccountPrivilegeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/accountPrivilege:AccountPrivilege", name, state, makeResourceOptions(options, id), false);
    }

    private static AccountPrivilegeArgs makeArgs(AccountPrivilegeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AccountPrivilegeArgs.Empty : args;
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
    public static AccountPrivilege get(java.lang.String name, Output<java.lang.String> id, @Nullable AccountPrivilegeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccountPrivilege(name, id, state, options);
    }
}
