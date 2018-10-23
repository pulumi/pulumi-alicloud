import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides the objects of an OSS bucket.
 */
export declare function getBucketObjects(args: GetBucketObjectsArgs, opts?: pulumi.InvokeOptions): Promise<GetBucketObjectsResult>;
/**
 * A collection of arguments for invoking getBucketObjects.
 */
export interface GetBucketObjectsArgs {
    /**
     * Name of the bucket that contains the objects to find.
     */
    readonly bucketName: string;
    /**
     * Filter results by the given key prefix (such as "path/to/folder/logs-").
     */
    readonly keyPrefix?: string;
    /**
     * A regex string to filter results by key.
     */
    readonly keyRegex?: string;
}
/**
 * A collection of values returned by getBucketObjects.
 */
export interface GetBucketObjectsResult {
    /**
     * A list of bucket objects. Each element contains the following attributes:
     */
    readonly objects: {
        acl: string;
        cacheControl: string;
        contentDisposition: string;
        contentEncoding: string;
        contentLength: string;
        contentMd5: string;
        contentType: string;
        etag: string;
        expires: string;
        key: string;
        lastModificationTime: string;
        serverSideEncryption: string;
        storageClass: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
