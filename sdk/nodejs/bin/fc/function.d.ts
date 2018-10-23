import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a Alicloud Function Compute Function resource. Function allows you to trigger execution of code in response to events in Alibaba Cloud. The Function itself includes source code and runtime configuration.
 *  For information about Service and how to use it, see [What is Function Compute](https://www.alibabacloud.com/help/doc-detail/52895.htm).
 *
 * -> **NOTE:** The resource requires a provider field 'account_id'. [See account_id](https://www.terraform.io/docs/providers/alicloud/index.html#account_id).
 */
export declare class Function extends pulumi.CustomResource {
    /**
     * Get an existing Function resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FunctionState): Function;
    /**
     * The Function Compute function description.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The path to the function's deployment package within the local filesystem. It is conflict with the `oss_`-prefixed options.
     */
    readonly filename: pulumi.Output<string | undefined>;
    /**
     * The function [entry point](https://www.alibabacloud.com/help/doc-detail/62213.htm) in your code.
     */
    readonly handler: pulumi.Output<string>;
    /**
     * The date this resource was last modified.
     */
    readonly lastModified: pulumi.Output<string>;
    /**
     * Amount of memory in MB your Function can use at runtime. Defaults to `128`. Limits to [128, 3072].
     */
    readonly memorySize: pulumi.Output<number | undefined>;
    /**
     * The Function Compute function name. It is the only in one service and is conflict with "name_prefix".
     */
    readonly name: pulumi.Output<string>;
    /**
     * Setting a prefix to get a only function name. It is conflict with "name".
     */
    readonly namePrefix: pulumi.Output<string | undefined>;
    /**
     * The OSS bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same Alibaba Cloud region where you are creating the function.
     */
    readonly ossBucket: pulumi.Output<string | undefined>;
    /**
     * The OSS key of an object containing the function's deployment package. Conflicts with `filename`.
     */
    readonly ossKey: pulumi.Output<string | undefined>;
    /**
     * See [Runtimes][https://www.alibabacloud.com/help/doc-detail/52077.htm] for valid values.
     */
    readonly runtime: pulumi.Output<string>;
    /**
     * The Function Compute service name.
     */
    readonly service: pulumi.Output<string>;
    /**
     * The amount of time your Function has to run in seconds.
     */
    readonly timeout: pulumi.Output<number | undefined>;
    /**
     * Create a Function resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FunctionArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Function resources.
 */
export interface FunctionState {
    /**
     * The Function Compute function description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The path to the function's deployment package within the local filesystem. It is conflict with the `oss_`-prefixed options.
     */
    readonly filename?: pulumi.Input<string>;
    /**
     * The function [entry point](https://www.alibabacloud.com/help/doc-detail/62213.htm) in your code.
     */
    readonly handler?: pulumi.Input<string>;
    /**
     * The date this resource was last modified.
     */
    readonly lastModified?: pulumi.Input<string>;
    /**
     * Amount of memory in MB your Function can use at runtime. Defaults to `128`. Limits to [128, 3072].
     */
    readonly memorySize?: pulumi.Input<number>;
    /**
     * The Function Compute function name. It is the only in one service and is conflict with "name_prefix".
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Setting a prefix to get a only function name. It is conflict with "name".
     */
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * The OSS bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same Alibaba Cloud region where you are creating the function.
     */
    readonly ossBucket?: pulumi.Input<string>;
    /**
     * The OSS key of an object containing the function's deployment package. Conflicts with `filename`.
     */
    readonly ossKey?: pulumi.Input<string>;
    /**
     * See [Runtimes][https://www.alibabacloud.com/help/doc-detail/52077.htm] for valid values.
     */
    readonly runtime?: pulumi.Input<string>;
    /**
     * The Function Compute service name.
     */
    readonly service?: pulumi.Input<string>;
    /**
     * The amount of time your Function has to run in seconds.
     */
    readonly timeout?: pulumi.Input<number>;
}
/**
 * The set of arguments for constructing a Function resource.
 */
export interface FunctionArgs {
    /**
     * The Function Compute function description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The path to the function's deployment package within the local filesystem. It is conflict with the `oss_`-prefixed options.
     */
    readonly filename?: pulumi.Input<string>;
    /**
     * The function [entry point](https://www.alibabacloud.com/help/doc-detail/62213.htm) in your code.
     */
    readonly handler: pulumi.Input<string>;
    /**
     * Amount of memory in MB your Function can use at runtime. Defaults to `128`. Limits to [128, 3072].
     */
    readonly memorySize?: pulumi.Input<number>;
    /**
     * The Function Compute function name. It is the only in one service and is conflict with "name_prefix".
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Setting a prefix to get a only function name. It is conflict with "name".
     */
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * The OSS bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same Alibaba Cloud region where you are creating the function.
     */
    readonly ossBucket?: pulumi.Input<string>;
    /**
     * The OSS key of an object containing the function's deployment package. Conflicts with `filename`.
     */
    readonly ossKey?: pulumi.Input<string>;
    /**
     * See [Runtimes][https://www.alibabacloud.com/help/doc-detail/52077.htm] for valid values.
     */
    readonly runtime: pulumi.Input<string>;
    /**
     * The Function Compute service name.
     */
    readonly service: pulumi.Input<string>;
    /**
     * The amount of time your Function has to run in seconds.
     */
    readonly timeout?: pulumi.Input<number>;
}
