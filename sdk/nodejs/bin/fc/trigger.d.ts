import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a Alicloud Function Compute Trigger resource. Based on trigger, execute your code in response to events in Alibaba Cloud.
 *  For information about Service and how to use it, see [What is Function Compute](https://www.alibabacloud.com/help/doc-detail/52895.htm).
 *
 * -> **NOTE:** The resource requires a provider field 'account_id'. [See account_id](https://www.terraform.io/docs/providers/alicloud/index.html#account_id).
 */
export declare class Trigger extends pulumi.CustomResource {
    /**
     * Get an existing Trigger resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TriggerState): Trigger;
    /**
     * The config of Function Compute trigger. See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
     */
    readonly config: pulumi.Output<string>;
    /**
     * The Function Compute function name.
     */
    readonly function: pulumi.Output<string>;
    /**
     * The date this resource was last modified.
     */
    readonly lastModified: pulumi.Output<string>;
    /**
     * The Function Compute trigger name. It is the only in one service and is conflict with "name_prefix".
     */
    readonly name: pulumi.Output<string>;
    /**
     * Setting a prefix to get a only trigger name. It is conflict with "name".
     */
    readonly namePrefix: pulumi.Output<string | undefined>;
    /**
     * RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is "acs:ram::$account-id:role/$role-name". See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
     */
    readonly role: pulumi.Output<string | undefined>;
    /**
     * The Function Compute service name.
     */
    readonly service: pulumi.Output<string>;
    /**
     * Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
     */
    readonly sourceArn: pulumi.Output<string | undefined>;
    /**
     * The Type of the trigger. Valid values: ["oss", "log", "timer", "http"].
     */
    readonly type: pulumi.Output<string>;
    /**
     * Create a Trigger resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TriggerArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Trigger resources.
 */
export interface TriggerState {
    /**
     * The config of Function Compute trigger. See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
     */
    readonly config?: pulumi.Input<string>;
    /**
     * The Function Compute function name.
     */
    readonly function?: pulumi.Input<string>;
    /**
     * The date this resource was last modified.
     */
    readonly lastModified?: pulumi.Input<string>;
    /**
     * The Function Compute trigger name. It is the only in one service and is conflict with "name_prefix".
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Setting a prefix to get a only trigger name. It is conflict with "name".
     */
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is "acs:ram::$account-id:role/$role-name". See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
     */
    readonly role?: pulumi.Input<string>;
    /**
     * The Function Compute service name.
     */
    readonly service?: pulumi.Input<string>;
    /**
     * Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
     */
    readonly sourceArn?: pulumi.Input<string>;
    /**
     * The Type of the trigger. Valid values: ["oss", "log", "timer", "http"].
     */
    readonly type?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Trigger resource.
 */
export interface TriggerArgs {
    /**
     * The config of Function Compute trigger. See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
     */
    readonly config: pulumi.Input<string>;
    /**
     * The Function Compute function name.
     */
    readonly function: pulumi.Input<string>;
    /**
     * The Function Compute trigger name. It is the only in one service and is conflict with "name_prefix".
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Setting a prefix to get a only trigger name. It is conflict with "name".
     */
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is "acs:ram::$account-id:role/$role-name". See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
     */
    readonly role?: pulumi.Input<string>;
    /**
     * The Function Compute service name.
     */
    readonly service: pulumi.Input<string>;
    /**
     * Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
     */
    readonly sourceArn?: pulumi.Input<string>;
    /**
     * The Type of the trigger. Valid values: ["oss", "log", "timer", "http"].
     */
    readonly type: pulumi.Input<string>;
}
