// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a ROS Stack Instance resource.
 *
 * For information about ROS Stack Instance and how to use it, see [What is Stack Instance](https://www.alibabacloud.com/help/en/doc-detail/151338.html).
 *
 * > **NOTE:** Available since v1.145.0.
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
 * const name = config.get("name") || "tf-example";
 * const _this = alicloud.getAccount({});
 * const _default = alicloud.ros.getRegions({});
 * const defaultStackGroup = new alicloud.ros.StackGroup("default", {
 *     stackGroupName: name,
 *     templateBody: "{\"ROSTemplateFormatVersion\":\"2015-09-01\", \"Parameters\": {\"VpcName\": {\"Type\": \"String\"},\"InstanceType\": {\"Type\": \"String\"}}}",
 *     description: "test for stack groups",
 *     parameters: [
 *         {
 *             parameterKey: "VpcName",
 *             parameterValue: "VpcName",
 *         },
 *         {
 *             parameterKey: "InstanceType",
 *             parameterValue: "InstanceType",
 *         },
 *     ],
 * });
 * const example = new alicloud.ros.StackInstance("example", {
 *     stackGroupName: defaultStackGroup.stackGroupName,
 *     stackInstanceAccountId: _this.then(_this => _this.id),
 *     stackInstanceRegionId: _default.then(_default => _default.regions?.[0]?.regionId),
 *     operationPreferences: "{\"FailureToleranceCount\": 1, \"MaxConcurrentCount\": 2}",
 *     timeoutInMinutes: "60",
 *     operationDescription: "tf-example",
 *     retainStacks: true,
 *     parameterOverrides: [{
 *         parameterValue: "VpcName",
 *         parameterKey: "VpcName",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * ROS Stack Instance can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:ros/stackInstance:StackInstance example <stack_group_name>:<stack_instance_account_id>:<stack_instance_region_id>
 * ```
 */
export class StackInstance extends pulumi.CustomResource {
    /**
     * Get an existing StackInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StackInstanceState, opts?: pulumi.CustomResourceOptions): StackInstance {
        return new StackInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ros/stackInstance:StackInstance';

    /**
     * Returns true if the given object is an instance of StackInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StackInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StackInstance.__pulumiType;
    }

    /**
     * The operation description.
     */
    public readonly operationDescription!: pulumi.Output<string | undefined>;
    /**
     * The operation preferences. The operation settings. The following fields are supported:
     * * `FailureToleranceCount` The maximum number of stack group operation failures that can occur. In a stack group operation, if the total number of failures does not exceed the FailureToleranceCount value, the operation succeeds. Otherwise, the operation fails. If the FailureToleranceCount parameter is not specified, the default value 0 is used. You cannot specify both FailureToleranceCount and FailureTolerancePercentage. Valid values: `0` to `20`.
     * * `FailureTolerancePercentage`: The percentage of stack group operation failures that can occur. In a stack group operation, if the percentage of failures does not exceed the FailureTolerancePercentage value, the operation succeeds. Otherwise, the operation fails. You cannot specify both FailureToleranceCount and FailureTolerancePercentage. Valid values: `0` to `100`.
     * * `MaxConcurrentCount`: The maximum number of accounts within which to perform this operation at one time. You cannot specify both MaxConcurrentCount and MaxConcurrentPercentage. Valid values: `1` to `20`.
     * * `MaxConcurrentPercentage`: The maximum percentage of accounts within which to perform this operation at one time. You cannot specify both MaxConcurrentCount and MaxConcurrentPercentage. Valid values: `1` to `100`
     */
    public readonly operationPreferences!: pulumi.Output<string | undefined>;
    /**
     * ParameterOverrides. See the following `Block parameterOverrides`.
     */
    public readonly parameterOverrides!: pulumi.Output<outputs.ros.StackInstanceParameterOverride[] | undefined>;
    /**
     * Specifies whether to retain the stack corresponding to the stack instance.Default value `false`. **NOTE:** When `retainStacks` is `true`, the stack is retained. If the stack is retained, the corresponding stack is not deleted when the stack instance is deleted from the stack group.
     */
    public readonly retainStacks!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the stack group.
     */
    public readonly stackGroupName!: pulumi.Output<string>;
    /**
     * The account to which the stack instance belongs.
     */
    public readonly stackInstanceAccountId!: pulumi.Output<string>;
    /**
     * The region of the stack instance.
     */
    public readonly stackInstanceRegionId!: pulumi.Output<string>;
    /**
     * The status of the stack instance. Valid values: `CURRENT` or `OUTDATED`. 
     * * `CURRENT`: The stack corresponding to the stack instance is up to date with the stack group.
     * * `OUTDATED`: The stack corresponding to the stack instance is not up to date with the stack group. The `OUTDATED` state has the following possible causes:
     * * When the CreateStackInstances operation is called to create stack instances, the corresponding stacks fail to be created.
     * * When the UpdateStackInstances or UpdateStackGroup operation is called to update stack instances, the corresponding stacks fail to be updated, or only some of the stack instances are updated.
     * * The create or update operation is not complete.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The timeout period that is specified for the stack creation request. Default value: `60`. Unit: `minutes`.
     */
    public readonly timeoutInMinutes!: pulumi.Output<string | undefined>;

    /**
     * Create a StackInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StackInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StackInstanceArgs | StackInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StackInstanceState | undefined;
            resourceInputs["operationDescription"] = state ? state.operationDescription : undefined;
            resourceInputs["operationPreferences"] = state ? state.operationPreferences : undefined;
            resourceInputs["parameterOverrides"] = state ? state.parameterOverrides : undefined;
            resourceInputs["retainStacks"] = state ? state.retainStacks : undefined;
            resourceInputs["stackGroupName"] = state ? state.stackGroupName : undefined;
            resourceInputs["stackInstanceAccountId"] = state ? state.stackInstanceAccountId : undefined;
            resourceInputs["stackInstanceRegionId"] = state ? state.stackInstanceRegionId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["timeoutInMinutes"] = state ? state.timeoutInMinutes : undefined;
        } else {
            const args = argsOrState as StackInstanceArgs | undefined;
            if ((!args || args.stackGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'stackGroupName'");
            }
            if ((!args || args.stackInstanceAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'stackInstanceAccountId'");
            }
            if ((!args || args.stackInstanceRegionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'stackInstanceRegionId'");
            }
            resourceInputs["operationDescription"] = args ? args.operationDescription : undefined;
            resourceInputs["operationPreferences"] = args ? args.operationPreferences : undefined;
            resourceInputs["parameterOverrides"] = args?.parameterOverrides ? pulumi.secret(args.parameterOverrides) : undefined;
            resourceInputs["retainStacks"] = args ? args.retainStacks : undefined;
            resourceInputs["stackGroupName"] = args ? args.stackGroupName : undefined;
            resourceInputs["stackInstanceAccountId"] = args ? args.stackInstanceAccountId : undefined;
            resourceInputs["stackInstanceRegionId"] = args ? args.stackInstanceRegionId : undefined;
            resourceInputs["timeoutInMinutes"] = args ? args.timeoutInMinutes : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["parameterOverrides"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(StackInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StackInstance resources.
 */
export interface StackInstanceState {
    /**
     * The operation description.
     */
    operationDescription?: pulumi.Input<string>;
    /**
     * The operation preferences. The operation settings. The following fields are supported:
     * * `FailureToleranceCount` The maximum number of stack group operation failures that can occur. In a stack group operation, if the total number of failures does not exceed the FailureToleranceCount value, the operation succeeds. Otherwise, the operation fails. If the FailureToleranceCount parameter is not specified, the default value 0 is used. You cannot specify both FailureToleranceCount and FailureTolerancePercentage. Valid values: `0` to `20`.
     * * `FailureTolerancePercentage`: The percentage of stack group operation failures that can occur. In a stack group operation, if the percentage of failures does not exceed the FailureTolerancePercentage value, the operation succeeds. Otherwise, the operation fails. You cannot specify both FailureToleranceCount and FailureTolerancePercentage. Valid values: `0` to `100`.
     * * `MaxConcurrentCount`: The maximum number of accounts within which to perform this operation at one time. You cannot specify both MaxConcurrentCount and MaxConcurrentPercentage. Valid values: `1` to `20`.
     * * `MaxConcurrentPercentage`: The maximum percentage of accounts within which to perform this operation at one time. You cannot specify both MaxConcurrentCount and MaxConcurrentPercentage. Valid values: `1` to `100`
     */
    operationPreferences?: pulumi.Input<string>;
    /**
     * ParameterOverrides. See the following `Block parameterOverrides`.
     */
    parameterOverrides?: pulumi.Input<pulumi.Input<inputs.ros.StackInstanceParameterOverride>[]>;
    /**
     * Specifies whether to retain the stack corresponding to the stack instance.Default value `false`. **NOTE:** When `retainStacks` is `true`, the stack is retained. If the stack is retained, the corresponding stack is not deleted when the stack instance is deleted from the stack group.
     */
    retainStacks?: pulumi.Input<boolean>;
    /**
     * The name of the stack group.
     */
    stackGroupName?: pulumi.Input<string>;
    /**
     * The account to which the stack instance belongs.
     */
    stackInstanceAccountId?: pulumi.Input<string>;
    /**
     * The region of the stack instance.
     */
    stackInstanceRegionId?: pulumi.Input<string>;
    /**
     * The status of the stack instance. Valid values: `CURRENT` or `OUTDATED`. 
     * * `CURRENT`: The stack corresponding to the stack instance is up to date with the stack group.
     * * `OUTDATED`: The stack corresponding to the stack instance is not up to date with the stack group. The `OUTDATED` state has the following possible causes:
     * * When the CreateStackInstances operation is called to create stack instances, the corresponding stacks fail to be created.
     * * When the UpdateStackInstances or UpdateStackGroup operation is called to update stack instances, the corresponding stacks fail to be updated, or only some of the stack instances are updated.
     * * The create or update operation is not complete.
     */
    status?: pulumi.Input<string>;
    /**
     * The timeout period that is specified for the stack creation request. Default value: `60`. Unit: `minutes`.
     */
    timeoutInMinutes?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StackInstance resource.
 */
export interface StackInstanceArgs {
    /**
     * The operation description.
     */
    operationDescription?: pulumi.Input<string>;
    /**
     * The operation preferences. The operation settings. The following fields are supported:
     * * `FailureToleranceCount` The maximum number of stack group operation failures that can occur. In a stack group operation, if the total number of failures does not exceed the FailureToleranceCount value, the operation succeeds. Otherwise, the operation fails. If the FailureToleranceCount parameter is not specified, the default value 0 is used. You cannot specify both FailureToleranceCount and FailureTolerancePercentage. Valid values: `0` to `20`.
     * * `FailureTolerancePercentage`: The percentage of stack group operation failures that can occur. In a stack group operation, if the percentage of failures does not exceed the FailureTolerancePercentage value, the operation succeeds. Otherwise, the operation fails. You cannot specify both FailureToleranceCount and FailureTolerancePercentage. Valid values: `0` to `100`.
     * * `MaxConcurrentCount`: The maximum number of accounts within which to perform this operation at one time. You cannot specify both MaxConcurrentCount and MaxConcurrentPercentage. Valid values: `1` to `20`.
     * * `MaxConcurrentPercentage`: The maximum percentage of accounts within which to perform this operation at one time. You cannot specify both MaxConcurrentCount and MaxConcurrentPercentage. Valid values: `1` to `100`
     */
    operationPreferences?: pulumi.Input<string>;
    /**
     * ParameterOverrides. See the following `Block parameterOverrides`.
     */
    parameterOverrides?: pulumi.Input<pulumi.Input<inputs.ros.StackInstanceParameterOverride>[]>;
    /**
     * Specifies whether to retain the stack corresponding to the stack instance.Default value `false`. **NOTE:** When `retainStacks` is `true`, the stack is retained. If the stack is retained, the corresponding stack is not deleted when the stack instance is deleted from the stack group.
     */
    retainStacks?: pulumi.Input<boolean>;
    /**
     * The name of the stack group.
     */
    stackGroupName: pulumi.Input<string>;
    /**
     * The account to which the stack instance belongs.
     */
    stackInstanceAccountId: pulumi.Input<string>;
    /**
     * The region of the stack instance.
     */
    stackInstanceRegionId: pulumi.Input<string>;
    /**
     * The timeout period that is specified for the stack creation request. Default value: `60`. Unit: `minutes`.
     */
    timeoutInMinutes?: pulumi.Input<string>;
}
