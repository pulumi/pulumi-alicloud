// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * The subscription is the basic unit of resource usage in Datahub Service under Publish/Subscribe model. You can manage the relationships between user and topics by using subscriptions. [Refer to details](https://www.alibabacloud.com/help/en/datahub/latest/nerbcz).
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
 * const name = config.get("name") || "terraform_example";
 * const example = new alicloud.datahub.Project("example", {
 *     name: name,
 *     comment: "created by terraform",
 * });
 * const exampleTopic = new alicloud.datahub.Topic("example", {
 *     name: name,
 *     projectName: example.name,
 *     recordType: "BLOB",
 *     shardCount: 3,
 *     lifeCycle: 7,
 *     comment: "created by terraform",
 * });
 * const exampleSubscription = new alicloud.datahub.Subscription("example", {
 *     projectName: example.name,
 *     topicName: exampleTopic.name,
 *     comment: "created by terraform",
 * });
 * ```
 *
 * ## Import
 *
 * Datahub subscription can be imported using the ID, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:datahub/subscription:Subscription example tf_datahub_project:tf_datahub_topic:1539073399567UgCzY
 * ```
 */
export class Subscription extends pulumi.CustomResource {
    /**
     * Get an existing Subscription resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubscriptionState, opts?: pulumi.CustomResourceOptions): Subscription {
        return new Subscription(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:datahub/subscription:Subscription';

    /**
     * Returns true if the given object is an instance of Subscription.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Subscription {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Subscription.__pulumiType;
    }

    /**
     * Comment of the datahub subscription. It cannot be longer than 255 characters.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Create time of the datahub subscription. It is a human-readable string rather than 64-bits UTC.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Last modify time of the datahub subscription. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
     */
    public /*out*/ readonly lastModifyTime!: pulumi.Output<string>;
    /**
     * The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    public readonly projectName!: pulumi.Output<string>;
    /**
     * The identidy of the subscription, generate from server side.
     */
    public /*out*/ readonly subId!: pulumi.Output<string>;
    /**
     * The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    public readonly topicName!: pulumi.Output<string>;

    /**
     * Create a Subscription resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubscriptionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SubscriptionArgs | SubscriptionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SubscriptionState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["lastModifyTime"] = state ? state.lastModifyTime : undefined;
            resourceInputs["projectName"] = state ? state.projectName : undefined;
            resourceInputs["subId"] = state ? state.subId : undefined;
            resourceInputs["topicName"] = state ? state.topicName : undefined;
        } else {
            const args = argsOrState as SubscriptionArgs | undefined;
            if ((!args || args.projectName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectName'");
            }
            if ((!args || args.topicName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'topicName'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["projectName"] = args ? args.projectName : undefined;
            resourceInputs["topicName"] = args ? args.topicName : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["lastModifyTime"] = undefined /*out*/;
            resourceInputs["subId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Subscription.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Subscription resources.
 */
export interface SubscriptionState {
    /**
     * Comment of the datahub subscription. It cannot be longer than 255 characters.
     */
    comment?: pulumi.Input<string>;
    /**
     * Create time of the datahub subscription. It is a human-readable string rather than 64-bits UTC.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Last modify time of the datahub subscription. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
     */
    lastModifyTime?: pulumi.Input<string>;
    /**
     * The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    projectName?: pulumi.Input<string>;
    /**
     * The identidy of the subscription, generate from server side.
     */
    subId?: pulumi.Input<string>;
    /**
     * The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    topicName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Subscription resource.
 */
export interface SubscriptionArgs {
    /**
     * Comment of the datahub subscription. It cannot be longer than 255 characters.
     */
    comment?: pulumi.Input<string>;
    /**
     * The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    projectName: pulumi.Input<string>;
    /**
     * The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    topicName: pulumi.Input<string>;
}
