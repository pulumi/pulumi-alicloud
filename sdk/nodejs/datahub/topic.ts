// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * The topic is the basic unit of Datahub data source and is used to define one kind of data or stream. It contains a set of subscriptions. You can manage the datahub source of an application by using topics. [Refer to details](https://www.alibabacloud.com/help/en/datahub/latest/nerbcz).
 *
 * > **NOTE:** Available since v1.19.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf_example";
 * const example = new alicloud.datahub.Project("example", {
 *     name: name,
 *     comment: "created by terraform",
 * });
 * const exampleBlob = new alicloud.datahub.Topic("example_blob", {
 *     name: `${name}_blob`,
 *     projectName: example.name,
 *     recordType: "BLOB",
 *     shardCount: 3,
 *     lifeCycle: 7,
 *     comment: "created by terraform",
 * });
 * const exampleTuple = new alicloud.datahub.Topic("example_tuple", {
 *     name: `${name}_tuple`,
 *     projectName: example.name,
 *     recordType: "TUPLE",
 *     recordSchema: {
 *         bigint_field: "BIGINT",
 *         timestamp_field: "TIMESTAMP",
 *         string_field: "STRING",
 *         double_field: "DOUBLE",
 *         boolean_field: "BOOLEAN",
 *     },
 *     shardCount: 3,
 *     lifeCycle: 7,
 *     comment: "created by terraform",
 * });
 * ```
 *
 * ## Import
 *
 * Datahub topic can be imported using the ID, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:datahub/topic:Topic example tf_datahub_project:tf_datahub_topic
 * ```
 */
export class Topic extends pulumi.CustomResource {
    /**
     * Get an existing Topic resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TopicState, opts?: pulumi.CustomResourceOptions): Topic {
        return new Topic(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:datahub/topic:Topic';

    /**
     * Returns true if the given object is an instance of Topic.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Topic {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Topic.__pulumiType;
    }

    /**
     * Comment of the datahub topic. It cannot be longer than 255 characters.
     *
     * **Notes:** Currently `lifeCycle` can not be modified and it will be supported in the next future.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
     */
    public /*out*/ readonly lastModifyTime!: pulumi.Output<string>;
    /**
     * How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
     */
    public readonly lifeCycle!: pulumi.Output<number | undefined>;
    /**
     * The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the datahub project that this topic belongs to. It is case-insensitive.
     */
    public readonly projectName!: pulumi.Output<string>;
    /**
     * Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
     * - BIGINT
     * - STRING
     * - BOOLEAN
     * - DOUBLE
     * - TIMESTAMP
     */
    public readonly recordSchema!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
     */
    public readonly recordType!: pulumi.Output<string | undefined>;
    /**
     * The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
     */
    public readonly shardCount!: pulumi.Output<number | undefined>;

    /**
     * Create a Topic resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TopicArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TopicArgs | TopicState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TopicState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["lastModifyTime"] = state ? state.lastModifyTime : undefined;
            resourceInputs["lifeCycle"] = state ? state.lifeCycle : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectName"] = state ? state.projectName : undefined;
            resourceInputs["recordSchema"] = state ? state.recordSchema : undefined;
            resourceInputs["recordType"] = state ? state.recordType : undefined;
            resourceInputs["shardCount"] = state ? state.shardCount : undefined;
        } else {
            const args = argsOrState as TopicArgs | undefined;
            if ((!args || args.projectName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectName'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["lifeCycle"] = args ? args.lifeCycle : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectName"] = args ? args.projectName : undefined;
            resourceInputs["recordSchema"] = args ? args.recordSchema : undefined;
            resourceInputs["recordType"] = args ? args.recordType : undefined;
            resourceInputs["shardCount"] = args ? args.shardCount : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["lastModifyTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Topic.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Topic resources.
 */
export interface TopicState {
    /**
     * Comment of the datahub topic. It cannot be longer than 255 characters.
     *
     * **Notes:** Currently `lifeCycle` can not be modified and it will be supported in the next future.
     */
    comment?: pulumi.Input<string>;
    /**
     * Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
     */
    lastModifyTime?: pulumi.Input<string>;
    /**
     * How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
     */
    lifeCycle?: pulumi.Input<number>;
    /**
     * The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the datahub project that this topic belongs to. It is case-insensitive.
     */
    projectName?: pulumi.Input<string>;
    /**
     * Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
     * - BIGINT
     * - STRING
     * - BOOLEAN
     * - DOUBLE
     * - TIMESTAMP
     */
    recordSchema?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
     */
    recordType?: pulumi.Input<string>;
    /**
     * The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
     */
    shardCount?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Topic resource.
 */
export interface TopicArgs {
    /**
     * Comment of the datahub topic. It cannot be longer than 255 characters.
     *
     * **Notes:** Currently `lifeCycle` can not be modified and it will be supported in the next future.
     */
    comment?: pulumi.Input<string>;
    /**
     * How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
     */
    lifeCycle?: pulumi.Input<number>;
    /**
     * The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the datahub project that this topic belongs to. It is case-insensitive.
     */
    projectName: pulumi.Input<string>;
    /**
     * Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
     * - BIGINT
     * - STRING
     * - BOOLEAN
     * - DOUBLE
     * - TIMESTAMP
     */
    recordSchema?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
     */
    recordType?: pulumi.Input<string>;
    /**
     * The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
     */
    shardCount?: pulumi.Input<number>;
}
