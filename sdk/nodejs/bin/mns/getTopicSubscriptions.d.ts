import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of MNS topic subscriptions in an Alibaba Cloud account according to the specified parameters.
 */
export declare function getTopicSubscriptions(args: GetTopicSubscriptionsArgs, opts?: pulumi.InvokeOptions): Promise<GetTopicSubscriptionsResult>;
/**
 * A collection of arguments for invoking getTopicSubscriptions.
 */
export interface GetTopicSubscriptionsArgs {
    /**
     * A string to filter resulting subscriptions of the topic by their name prefixs.
     */
    readonly namePrefix?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
     */
    readonly topicName: string;
}
/**
 * A collection of values returned by getTopicSubscriptions.
 */
export interface GetTopicSubscriptionsResult {
    /**
     * A list of users. Each element contains the following attributes:
     */
    readonly subscriptions: {
        endpoint: string;
        filterTag: string;
        id: string;
        name: string;
        notifyContentFormat: string;
        notifyStrategy: string;
        topicName: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
