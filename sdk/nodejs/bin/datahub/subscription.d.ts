import * as pulumi from "@pulumi/pulumi";
/**
 * The subscription is the basic unit of resource usage in Datahub Service under Publish/Subscribe model. You can manage the relationships between user and topics by using subscriptions. [Refer to details](https://help.aliyun.com/document_detail/47440.html).
 */
export declare class Subscription extends pulumi.CustomResource {
    /**
     * Get an existing Subscription resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubscriptionState): Subscription;
    /**
     * Comment of the datahub subscription. It cannot be longer than 255 characters.
     */
    readonly comment: pulumi.Output<string | undefined>;
    /**
     * Create time of the datahub subscription. It is a human-readable string rather than 64-bits UTC.
     */
    readonly createTime: pulumi.Output<string>;
    /**
     * Last modify time of the datahub subscription. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
     */
    readonly lastModifyTime: pulumi.Output<string>;
    /**
     * The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    readonly projectName: pulumi.Output<string>;
    /**
     * The identidy of the subscritpion, generate from server side.
     */
    readonly subId: pulumi.Output<string>;
    /**
     * The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    readonly topicName: pulumi.Output<string>;
    /**
     * Create a Subscription resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubscriptionArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Subscription resources.
 */
export interface SubscriptionState {
    /**
     * Comment of the datahub subscription. It cannot be longer than 255 characters.
     */
    readonly comment?: pulumi.Input<string>;
    /**
     * Create time of the datahub subscription. It is a human-readable string rather than 64-bits UTC.
     */
    readonly createTime?: pulumi.Input<string>;
    /**
     * Last modify time of the datahub subscription. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
     */
    readonly lastModifyTime?: pulumi.Input<string>;
    /**
     * The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    readonly projectName?: pulumi.Input<string>;
    /**
     * The identidy of the subscritpion, generate from server side.
     */
    readonly subId?: pulumi.Input<string>;
    /**
     * The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    readonly topicName?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Subscription resource.
 */
export interface SubscriptionArgs {
    /**
     * Comment of the datahub subscription. It cannot be longer than 255 characters.
     */
    readonly comment?: pulumi.Input<string>;
    /**
     * The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    readonly projectName: pulumi.Input<string>;
    /**
     * The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    readonly topicName: pulumi.Input<string>;
}
