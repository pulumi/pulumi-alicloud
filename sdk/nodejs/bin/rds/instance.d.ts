import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an RDS instance resource. A DB instance is an isolated database
 * environment in the cloud. A DB instance can contain multiple user-created
 * databases.
 */
export declare class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState): Instance;
    /**
     * It has been deprecated from version 1.5.0. If you want to allocate public connection string, please use new resource `alicloud_db_connection`.
     */
    readonly allocatePublicConnection: pulumi.Output<boolean | undefined>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_backup_policy` field 'retention_period' replaces it.
     */
    readonly backupRetentionPeriod: pulumi.Output<number | undefined>;
    /**
     * RDS database connection string.
     */
    readonly connectionString: pulumi.Output<string>;
    /**
     * (Deprecated from version 1.5.0).
     */
    readonly connections: pulumi.Output<{
        connectionString: string;
        ipAddress?: string;
        ipType: string;
    }[]>;
    /**
     * It has been deprecated from version 1.5.0 and use 'instance_type' to replace.
     */
    readonly dbInstanceClass: pulumi.Output<string | undefined>;
    /**
     * It has been deprecated from version 1.5.0. If you want to set public connection, please use new resource `alicloud_db_connection`. Default to Intranet.
     */
    readonly dbInstanceNetType: pulumi.Output<string | undefined>;
    /**
     * It has been deprecated from version 1.5.0 and use 'instance_storage' to replace.
     */
    readonly dbInstanceStorage: pulumi.Output<number | undefined>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_database` replaces it.
     */
    readonly dbMappings: pulumi.Output<{
        characterSetName: string;
        dbDescription?: string;
        dbName: string;
    }[]>;
    /**
     * Database type. Value options: MySQL, SQLServer, PostgreSQL, and PPAS.
     */
    readonly engine: pulumi.Output<string>;
    /**
     * Database version. Value options:
     * - 5.5/5.6/5.7 for MySQL
     * - 2008r2/2012 for SQLServer
     * - 9.4/10.0 for PostgreSQL
     * - 9.3 for PPAS
     */
    readonly engineVersion: pulumi.Output<string>;
    /**
     * Valid values are `Prepaid`, `Postpaid`, Default to `Postpaid`.
     */
    readonly instanceChargeType: pulumi.Output<string | undefined>;
    /**
     * The name of DB instance. It a string of 2 to 256 characters.
     */
    readonly instanceName: pulumi.Output<string | undefined>;
    /**
     * It has been deprecated from version 1.5.0. If you want to create instances in VPC network, this parameter must be set.
     */
    readonly instanceNetworkType: pulumi.Output<string | undefined>;
    /**
     * User-defined DB instance storage space. Value range:
     * - [5, 2000] for MySQL/PostgreSQL/PPAS HA dual node edition;
     * - [20,1000] for MySQL 5.7 basic single node edition;
     * - [10, 2000] for SQL Server 2008R2;
     * - [20,2000] for SQL Server 2012 basic single node edition
     * Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
     */
    readonly instanceStorage: pulumi.Output<number>;
    /**
     * DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
     */
    readonly instanceType: pulumi.Output<string>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_account` field 'name' replaces it.
     */
    readonly masterUserName: pulumi.Output<string | undefined>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_account` field 'password' replaces it.
     */
    readonly masterUserPassword: pulumi.Output<string | undefined>;
    /**
     * It has been deprecated from version 1.8.1, and `zone_id` can support multiple zone.
     */
    readonly multiAz: pulumi.Output<boolean | undefined>;
    /**
     * The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
     */
    readonly period: pulumi.Output<number | undefined>;
    /**
     * RDS database connection port.
     */
    readonly port: pulumi.Output<string>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_backup_policy` field 'backup_period' replaces it.
     */
    readonly preferredBackupPeriods: pulumi.Output<string[] | undefined>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_backup_policy` field 'backup_time' replaces it.
     */
    readonly preferredBackupTime: pulumi.Output<string | undefined>;
    /**
     * List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     */
    readonly securityIps: pulumi.Output<string[]>;
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     */
    readonly vswitchId: pulumi.Output<string | undefined>;
    /**
     * The Zone to launch the DB instance. From version 1.8.1, it supports multiple zone.
     * If it is a multi-zone and `vswitch_id` is specified, the vswitch must in the one of them.
     * The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `alicloud_zones`.
     */
    readonly zoneId: pulumi.Output<string>;
    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * It has been deprecated from version 1.5.0. If you want to allocate public connection string, please use new resource `alicloud_db_connection`.
     */
    readonly allocatePublicConnection?: pulumi.Input<boolean>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_backup_policy` field 'retention_period' replaces it.
     */
    readonly backupRetentionPeriod?: pulumi.Input<number>;
    /**
     * RDS database connection string.
     */
    readonly connectionString?: pulumi.Input<string>;
    /**
     * (Deprecated from version 1.5.0).
     */
    readonly connections?: pulumi.Input<pulumi.Input<{
        connectionString: pulumi.Input<string>;
        ipAddress?: pulumi.Input<string>;
        ipType: pulumi.Input<string>;
    }>[]>;
    /**
     * It has been deprecated from version 1.5.0 and use 'instance_type' to replace.
     */
    readonly dbInstanceClass?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.5.0. If you want to set public connection, please use new resource `alicloud_db_connection`. Default to Intranet.
     */
    readonly dbInstanceNetType?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.5.0 and use 'instance_storage' to replace.
     */
    readonly dbInstanceStorage?: pulumi.Input<number>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_database` replaces it.
     */
    readonly dbMappings?: pulumi.Input<pulumi.Input<{
        characterSetName: pulumi.Input<string>;
        dbDescription?: pulumi.Input<string>;
        dbName: pulumi.Input<string>;
    }>[]>;
    /**
     * Database type. Value options: MySQL, SQLServer, PostgreSQL, and PPAS.
     */
    readonly engine?: pulumi.Input<string>;
    /**
     * Database version. Value options:
     * - 5.5/5.6/5.7 for MySQL
     * - 2008r2/2012 for SQLServer
     * - 9.4/10.0 for PostgreSQL
     * - 9.3 for PPAS
     */
    readonly engineVersion?: pulumi.Input<string>;
    /**
     * Valid values are `Prepaid`, `Postpaid`, Default to `Postpaid`.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * The name of DB instance. It a string of 2 to 256 characters.
     */
    readonly instanceName?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.5.0. If you want to create instances in VPC network, this parameter must be set.
     */
    readonly instanceNetworkType?: pulumi.Input<string>;
    /**
     * User-defined DB instance storage space. Value range:
     * - [5, 2000] for MySQL/PostgreSQL/PPAS HA dual node edition;
     * - [20,1000] for MySQL 5.7 basic single node edition;
     * - [10, 2000] for SQL Server 2008R2;
     * - [20,2000] for SQL Server 2012 basic single node edition
     * Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
     */
    readonly instanceStorage?: pulumi.Input<number>;
    /**
     * DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_account` field 'name' replaces it.
     */
    readonly masterUserName?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_account` field 'password' replaces it.
     */
    readonly masterUserPassword?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.8.1, and `zone_id` can support multiple zone.
     */
    readonly multiAz?: pulumi.Input<boolean>;
    /**
     * The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * RDS database connection port.
     */
    readonly port?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_backup_policy` field 'backup_period' replaces it.
     */
    readonly preferredBackupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_backup_policy` field 'backup_time' replaces it.
     */
    readonly preferredBackupTime?: pulumi.Input<string>;
    /**
     * List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     */
    readonly securityIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * The Zone to launch the DB instance. From version 1.8.1, it supports multiple zone.
     * If it is a multi-zone and `vswitch_id` is specified, the vswitch must in the one of them.
     * The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `alicloud_zones`.
     */
    readonly zoneId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * It has been deprecated from version 1.5.0. If you want to allocate public connection string, please use new resource `alicloud_db_connection`.
     */
    readonly allocatePublicConnection?: pulumi.Input<boolean>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_backup_policy` field 'retention_period' replaces it.
     */
    readonly backupRetentionPeriod?: pulumi.Input<number>;
    /**
     * (Deprecated from version 1.5.0).
     */
    readonly connections?: pulumi.Input<pulumi.Input<{
        connectionString: pulumi.Input<string>;
        ipAddress?: pulumi.Input<string>;
        ipType: pulumi.Input<string>;
    }>[]>;
    /**
     * It has been deprecated from version 1.5.0 and use 'instance_type' to replace.
     */
    readonly dbInstanceClass?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.5.0. If you want to set public connection, please use new resource `alicloud_db_connection`. Default to Intranet.
     */
    readonly dbInstanceNetType?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.5.0 and use 'instance_storage' to replace.
     */
    readonly dbInstanceStorage?: pulumi.Input<number>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_database` replaces it.
     */
    readonly dbMappings?: pulumi.Input<pulumi.Input<{
        characterSetName: pulumi.Input<string>;
        dbDescription?: pulumi.Input<string>;
        dbName: pulumi.Input<string>;
    }>[]>;
    /**
     * Database type. Value options: MySQL, SQLServer, PostgreSQL, and PPAS.
     */
    readonly engine: pulumi.Input<string>;
    /**
     * Database version. Value options:
     * - 5.5/5.6/5.7 for MySQL
     * - 2008r2/2012 for SQLServer
     * - 9.4/10.0 for PostgreSQL
     * - 9.3 for PPAS
     */
    readonly engineVersion: pulumi.Input<string>;
    /**
     * Valid values are `Prepaid`, `Postpaid`, Default to `Postpaid`.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * The name of DB instance. It a string of 2 to 256 characters.
     */
    readonly instanceName?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.5.0. If you want to create instances in VPC network, this parameter must be set.
     */
    readonly instanceNetworkType?: pulumi.Input<string>;
    /**
     * User-defined DB instance storage space. Value range:
     * - [5, 2000] for MySQL/PostgreSQL/PPAS HA dual node edition;
     * - [20,1000] for MySQL 5.7 basic single node edition;
     * - [10, 2000] for SQL Server 2008R2;
     * - [20,2000] for SQL Server 2012 basic single node edition
     * Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
     */
    readonly instanceStorage: pulumi.Input<number>;
    /**
     * DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
     */
    readonly instanceType: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_account` field 'name' replaces it.
     */
    readonly masterUserName?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_account` field 'password' replaces it.
     */
    readonly masterUserPassword?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.8.1, and `zone_id` can support multiple zone.
     */
    readonly multiAz?: pulumi.Input<boolean>;
    /**
     * The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_backup_policy` field 'backup_period' replaces it.
     */
    readonly preferredBackupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * It has been deprecated from version 1.5.0. New resource `alicloud_db_backup_policy` field 'backup_time' replaces it.
     */
    readonly preferredBackupTime?: pulumi.Input<string>;
    /**
     * List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     */
    readonly securityIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * The Zone to launch the DB instance. From version 1.8.1, it supports multiple zone.
     * If it is a multi-zone and `vswitch_id` is specified, the vswitch must in the one of them.
     * The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `alicloud_zones`.
     */
    readonly zoneId?: pulumi.Input<string>;
}
