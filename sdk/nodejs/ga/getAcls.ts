// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Ga Acls of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.150.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.ga.getAcls({});
 * export const gaAclId1 = ids.then(ids => ids.acls?[0]?.id);
 * const nameRegex = alicloud.ga.getAcls({
 *     nameRegex: "^my-Acl",
 * });
 * export const gaAclId2 = nameRegex.then(nameRegex => nameRegex.acls?[0]?.id);
 * ```
 */
export function getAcls(args?: GetAclsArgs, opts?: pulumi.InvokeOptions): Promise<GetAclsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:ga/getAcls:getAcls", {
        "aclName": args.aclName,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getAcls.
 */
export interface GetAclsArgs {
    /**
     * The name of the acl.
     */
    aclName?: string;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Acl IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Acl name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The status of the resource.
     */
    status?: string;
}

/**
 * A collection of values returned by getAcls.
 */
export interface GetAclsResult {
    readonly aclName?: string;
    readonly acls: outputs.ga.GetAclsAcl[];
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly status?: string;
}

export function getAclsOutput(args?: GetAclsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAclsResult> {
    return pulumi.output(args).apply(a => getAcls(a, opts))
}

/**
 * A collection of arguments for invoking getAcls.
 */
export interface GetAclsOutputArgs {
    /**
     * The name of the acl.
     */
    aclName?: pulumi.Input<string>;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Acl IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Acl name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
}