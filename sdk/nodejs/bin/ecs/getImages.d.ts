import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides available image resources. It contains user's private images, system images provided by Alibaba Cloud,
 * other public images and the ones available on the image market.
 */
export declare function getImages(args?: GetImagesArgs, opts?: pulumi.InvokeOptions): Promise<GetImagesResult>;
/**
 * A collection of arguments for invoking getImages.
 */
export interface GetImagesArgs {
    /**
     * If more than one result are returned, select the most recent one.
     */
    readonly mostRecent?: boolean;
    /**
     * A regex string to filter resulting images by name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Filter results by a specific image owner. Valid items are `system`, `self`, `others`, `marketplace`.
     */
    readonly owners?: string;
}
/**
 * A collection of values returned by getImages.
 */
export interface GetImagesResult {
    /**
     * A list of images. Each element contains the following attributes:
     */
    readonly images: {
        architecture: string;
        creationTime: string;
        description: string;
        diskDeviceMappings: {
            device: string;
            size: string;
            snapshotId: string;
        }[];
        id: string;
        imageId: string;
        imageOwnerAlias: string;
        imageVersion: string;
        isCopied: boolean;
        isSelfShared: string;
        isSubscribed: boolean;
        isSupportIoOptimized: boolean;
        name: string;
        osName: string;
        osType: string;
        platform: string;
        productCode: string;
        progress: string;
        size: number;
        state: string;
        status: string;
        tags?: {
            [key: string]: any;
        };
        usage: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
