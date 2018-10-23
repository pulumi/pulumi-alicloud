import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an RDS database resource. A DB database deployed in a DB instance. A DB instance can own multiple databases.
 *
 * ~> **NOTE:** At present, it does not support creating 'PostgreSQL' and 'PPAS' database. You have to login RDS instance to create manually.
 */
export declare class Database extends pulumi.CustomResource {
    /**
     * Get an existing Database resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseState): Database;
    /**
     * Character set. The value range is limited to the following:
     * - MySQL: [ utf8, gbk, latin1, utf8mb4 ] \(`utf8mb4` only supports versions 5.5 and 5.6\).
     * - SQLServer: [ Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ]
     */
    readonly characterSet: pulumi.Output<string | undefined>;
    /**
     * Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The Id of instance that can run database.
     */
    readonly instanceId: pulumi.Output<string>;
    /**
     * Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter
     * and have no more than 64 characters.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Create a Database resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Database resources.
 */
export interface DatabaseState {
    /**
     * Character set. The value range is limited to the following:
     * - MySQL: [ utf8, gbk, latin1, utf8mb4 ] \(`utf8mb4` only supports versions 5.5 and 5.6\).
     * - SQLServer: [ Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ]
     */
    readonly characterSet?: pulumi.Input<string>;
    /**
     * Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The Id of instance that can run database.
     */
    readonly instanceId?: pulumi.Input<string>;
    /**
     * Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter
     * and have no more than 64 characters.
     */
    readonly name?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Database resource.
 */
export interface DatabaseArgs {
    /**
     * Character set. The value range is limited to the following:
     * - MySQL: [ utf8, gbk, latin1, utf8mb4 ] \(`utf8mb4` only supports versions 5.5 and 5.6\).
     * - SQLServer: [ Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ]
     */
    readonly characterSet?: pulumi.Input<string>;
    /**
     * Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The Id of instance that can run database.
     */
    readonly instanceId: pulumi.Input<string>;
    /**
     * Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter
     * and have no more than 64 characters.
     */
    readonly name?: pulumi.Input<string>;
}
