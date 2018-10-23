import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides the server load balancer attachments of the current Alibaba Cloud user.
 */
export declare function getAttachments(args: GetAttachmentsArgs, opts?: pulumi.InvokeOptions): Promise<GetAttachmentsResult>;
/**
 * A collection of arguments for invoking getAttachments.
 */
export interface GetAttachmentsArgs {
    /**
     * List of attached ECS instance IDs.
     */
    readonly instanceIds?: string[];
    /**
     * ID of the SLB with attachments.
     */
    readonly loadBalancerId: string;
}
/**
 * A collection of values returned by getAttachments.
 */
export interface GetAttachmentsResult {
    /**
     * A list of SLB attachments. Each element contains the following attributes:
     */
    readonly slbAttachments: {
        instanceId: string;
        weight: number;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
