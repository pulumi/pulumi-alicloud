// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Ros Change Sets of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.105.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ros.getChangeSets({
 *     stackId: "example_value",
 *     ids: ["example_value"],
 *     nameRegex: "the_resource_name",
 * });
 * export const firstRosChangeSetId = example.then(example => example.sets[0].id);
 * ```
 */
export function getChangeSets(args: GetChangeSetsArgs, opts?: pulumi.InvokeOptions): Promise<GetChangeSetsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:ros/getChangeSets:getChangeSets", {
        "changeSetName": args.changeSetName,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "stackId": args.stackId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getChangeSets.
 */
export interface GetChangeSetsArgs {
    /**
     * The name of the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
     */
    readonly changeSetName?: string;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    readonly enableDetails?: boolean;
    /**
     * A list of Change Set IDs.
     */
    readonly ids?: string[];
    /**
     * A regex string to filter results by Change Set name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The ID of the stack for which you want to create the change set. ROS generates the change set by comparing the stack information with the information that you submit, such as a modified template or different inputs.
     */
    readonly stackId: string;
    /**
     * The status of the change set.
     */
    readonly status?: string;
}

/**
 * A collection of values returned by getChangeSets.
 */
export interface GetChangeSetsResult {
    readonly changeSetName?: string;
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly sets: outputs.ros.GetChangeSetsSet[];
    readonly stackId: string;
    readonly status?: string;
}