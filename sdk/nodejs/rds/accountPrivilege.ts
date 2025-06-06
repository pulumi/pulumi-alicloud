// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an RDS account privilege resource and used to grant several database some access privilege. A database can be granted by multiple account, see [What is DB Account Privilege](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-grantaccountprivilege).
 *
 * > **NOTE:** At present, a database can only have one database owner.
 *
 * > **NOTE:** Available since v1.5.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf_example";
 * const _default = alicloud.rds.getZones({
 *     engine: "MySQL",
 *     engineVersion: "5.6",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: name,
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     vswitchName: name,
 * });
 * const instance = new alicloud.rds.Instance("instance", {
 *     engine: "MySQL",
 *     engineVersion: "5.6",
 *     instanceType: "rds.mysql.s1.small",
 *     instanceStorage: 10,
 *     vswitchId: defaultSwitch.id,
 *     instanceName: name,
 * });
 * const db: alicloud.rds.Database[] = [];
 * for (const range = {value: 0}; range.value < 2; range.value++) {
 *     db.push(new alicloud.rds.Database(`db-${range.value}`, {
 *         instanceId: instance.id,
 *         name: `${name}_${range.value}`,
 *         description: "from terraform",
 *     }));
 * }
 * const account = new alicloud.rds.Account("account", {
 *     dbInstanceId: instance.id,
 *     accountName: "tfexample",
 *     accountPassword: "Example12345",
 *     accountDescription: "from terraform",
 * });
 * const privilege = new alicloud.rds.AccountPrivilege("privilege", {
 *     instanceId: instance.id,
 *     accountName: account.accountName,
 *     privilege: "ReadOnly",
 *     dbNames: db.map(__item => __item.name),
 * });
 * ```
 *
 * ## Import
 *
 * RDS account privilege can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:rds/accountPrivilege:AccountPrivilege example "rm-12345:tf_account:ReadOnly"
 * ```
 */
export class AccountPrivilege extends pulumi.CustomResource {
    /**
     * Get an existing AccountPrivilege resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountPrivilegeState, opts?: pulumi.CustomResourceOptions): AccountPrivilege {
        return new AccountPrivilege(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:rds/accountPrivilege:AccountPrivilege';

    /**
     * Returns true if the given object is an instance of AccountPrivilege.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccountPrivilege {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccountPrivilege.__pulumiType;
    }

    /**
     * A specified account name.
     */
    public readonly accountName!: pulumi.Output<string>;
    /**
     * List of specified database name.
     */
    public readonly dbNames!: pulumi.Output<string[]>;
    /**
     * The Id of instance in which account belongs.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The privilege of one account access database. Valid values: 
     * - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
     * - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
     * - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
     * Default to "ReadOnly".
     */
    public readonly privilege!: pulumi.Output<string | undefined>;

    /**
     * Create a AccountPrivilege resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountPrivilegeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccountPrivilegeArgs | AccountPrivilegeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccountPrivilegeState | undefined;
            resourceInputs["accountName"] = state ? state.accountName : undefined;
            resourceInputs["dbNames"] = state ? state.dbNames : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["privilege"] = state ? state.privilege : undefined;
        } else {
            const args = argsOrState as AccountPrivilegeArgs | undefined;
            if ((!args || args.accountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountName'");
            }
            if ((!args || args.dbNames === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbNames'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            resourceInputs["accountName"] = args ? args.accountName : undefined;
            resourceInputs["dbNames"] = args ? args.dbNames : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["privilege"] = args ? args.privilege : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccountPrivilege.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccountPrivilege resources.
 */
export interface AccountPrivilegeState {
    /**
     * A specified account name.
     */
    accountName?: pulumi.Input<string>;
    /**
     * List of specified database name.
     */
    dbNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Id of instance in which account belongs.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The privilege of one account access database. Valid values: 
     * - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
     * - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
     * - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
     * Default to "ReadOnly".
     */
    privilege?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccountPrivilege resource.
 */
export interface AccountPrivilegeArgs {
    /**
     * A specified account name.
     */
    accountName: pulumi.Input<string>;
    /**
     * List of specified database name.
     */
    dbNames: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Id of instance in which account belongs.
     */
    instanceId: pulumi.Input<string>;
    /**
     * The privilege of one account access database. Valid values: 
     * - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
     * - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
     * - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
     * Default to "ReadOnly".
     */
    privilege?: pulumi.Input<string>;
}
