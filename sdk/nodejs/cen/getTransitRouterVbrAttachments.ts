// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides CEN Transit Router VBR Attachments available to the user.[What is Cen Transit Router VBR Attachments](https://help.aliyun.com/document_detail/261226.html)
 *
 * > **NOTE:** Available in 1.126.0+
 */
export function getTransitRouterVbrAttachments(args: GetTransitRouterVbrAttachmentsArgs, opts?: pulumi.InvokeOptions): Promise<GetTransitRouterVbrAttachmentsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:cen/getTransitRouterVbrAttachments:getTransitRouterVbrAttachments", {
        "cenId": args.cenId,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "status": args.status,
        "transitRouterId": args.transitRouterId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransitRouterVbrAttachments.
 */
export interface GetTransitRouterVbrAttachmentsArgs {
    /**
     * ID of the CEN instance.
     */
    cenId: string;
    /**
     * A list of resource id. The element value is same as `transitRouterId`.
     */
    ids?: string[];
    outputFile?: string;
    /**
     * The status of the resource. Valid values `Attached`, `Attaching` and `Detaching`.
     */
    status?: string;
    /**
     * ID of the transit router.
     */
    transitRouterId?: string;
}

/**
 * A collection of values returned by getTransitRouterVbrAttachments.
 */
export interface GetTransitRouterVbrAttachmentsResult {
    /**
     * A list of CEN Transit Router VBR Attachments. Each element contains the following attributes:
     */
    readonly attachments: outputs.cen.GetTransitRouterVbrAttachmentsAttachment[];
    readonly cenId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of CEN Transit Router VBR attachment IDs.
     */
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * The status of the transit router attachment.
     */
    readonly status?: string;
    readonly transitRouterId?: string;
}

export function getTransitRouterVbrAttachmentsOutput(args: GetTransitRouterVbrAttachmentsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTransitRouterVbrAttachmentsResult> {
    return pulumi.output(args).apply(a => getTransitRouterVbrAttachments(a, opts))
}

/**
 * A collection of arguments for invoking getTransitRouterVbrAttachments.
 */
export interface GetTransitRouterVbrAttachmentsOutputArgs {
    /**
     * ID of the CEN instance.
     */
    cenId: pulumi.Input<string>;
    /**
     * A list of resource id. The element value is same as `transitRouterId`.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the resource. Valid values `Attached`, `Attaching` and `Detaching`.
     */
    status?: pulumi.Input<string>;
    /**
     * ID of the transit router.
     */
    transitRouterId?: pulumi.Input<string>;
}