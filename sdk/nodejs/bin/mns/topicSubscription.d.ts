import * as pulumi from "@pulumi/pulumi";
export declare class TopicSubscription extends pulumi.CustomResource {
    /**
     * Get an existing TopicSubscription resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TopicSubscriptionState): TopicSubscription;
    /**
     * The endpoint has three format. Available values format:
     * - HTTP Format: http://xxx.com/xxx
     * - Queue Format: acs:mns:{REGION}:{AccountID}:queues/{QueueName}
     * - Email Format: mail:directmail:{MailAddress}
     */
    readonly endpoint: pulumi.Output<string>;
    /**
     * The length should be shorter than 16.
     */
    readonly filterTag: pulumi.Output<string | undefined>;
    /**
     * Two topics subscription on a single account in the same topic cannot have the same name. A topic subscription name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users. the attribute has two value SIMPLIFIED or XML.Default value to SIMPLIFIED .
     */
    readonly notifyContentFormat: pulumi.Output<string | undefined>;
    /**
     * The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails. the attribute has two value EXPONENTIAL_DECAY_RETR or BACKOFF_RETRY. Default value to BACKOFF_RETRY .
     */
    readonly notifyStrategy: pulumi.Output<string | undefined>;
    readonly topicName: pulumi.Output<string>;
    /**
     * Create a TopicSubscription resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TopicSubscriptionArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering TopicSubscription resources.
 */
export interface TopicSubscriptionState {
    /**
     * The endpoint has three format. Available values format:
     * - HTTP Format: http://xxx.com/xxx
     * - Queue Format: acs:mns:{REGION}:{AccountID}:queues/{QueueName}
     * - Email Format: mail:directmail:{MailAddress}
     */
    readonly endpoint?: pulumi.Input<string>;
    /**
     * The length should be shorter than 16.
     */
    readonly filterTag?: pulumi.Input<string>;
    /**
     * Two topics subscription on a single account in the same topic cannot have the same name. A topic subscription name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users. the attribute has two value SIMPLIFIED or XML.Default value to SIMPLIFIED .
     */
    readonly notifyContentFormat?: pulumi.Input<string>;
    /**
     * The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails. the attribute has two value EXPONENTIAL_DECAY_RETR or BACKOFF_RETRY. Default value to BACKOFF_RETRY .
     */
    readonly notifyStrategy?: pulumi.Input<string>;
    readonly topicName?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a TopicSubscription resource.
 */
export interface TopicSubscriptionArgs {
    /**
     * The endpoint has three format. Available values format:
     * - HTTP Format: http://xxx.com/xxx
     * - Queue Format: acs:mns:{REGION}:{AccountID}:queues/{QueueName}
     * - Email Format: mail:directmail:{MailAddress}
     */
    readonly endpoint: pulumi.Input<string>;
    /**
     * The length should be shorter than 16.
     */
    readonly filterTag?: pulumi.Input<string>;
    /**
     * Two topics subscription on a single account in the same topic cannot have the same name. A topic subscription name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users. the attribute has two value SIMPLIFIED or XML.Default value to SIMPLIFIED .
     */
    readonly notifyContentFormat?: pulumi.Input<string>;
    /**
     * The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails. the attribute has two value EXPONENTIAL_DECAY_RETR or BACKOFF_RETRY. Default value to BACKOFF_RETRY .
     */
    readonly notifyStrategy?: pulumi.Input<string>;
    readonly topicName: pulumi.Input<string>;
}
