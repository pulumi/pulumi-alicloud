import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides the OSS buckets of the current Alibaba Cloud user.
 */
export declare function getBuckets(args?: GetBucketsArgs, opts?: pulumi.InvokeOptions): Promise<GetBucketsResult>;
/**
 * A collection of arguments for invoking getBuckets.
 */
export interface GetBucketsArgs {
    /**
     * A regex string to filter results by bucket name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getBuckets.
 */
export interface GetBucketsResult {
    /**
     * A list of buckets. Each element contains the following attributes:
     */
    readonly buckets: {
        acl: string;
        corsRules: {
            allowedHeaders: string[];
            allowedMethods: string[];
            allowedOrigins: string[];
            exposeHeaders: string[];
            maxAgeSeconds: number;
        }[];
        creationDate: string;
        extranetEndpoint: string;
        intranetEndpoint: string;
        lifecycleRules: {
            enabled: boolean;
            expiration: {
                date?: string;
                days?: number;
            };
            id: string;
            prefix: string;
        }[];
        location: string;
        logging: {
            targetBucket: string;
            targetPrefix: string;
        };
        name: string;
        owner: string;
        refererConfig: {
            allowEmpty: boolean;
            referers: string[];
        };
        storageClass: string;
        website: {
            errorDocument: string;
            indexDocument: string;
        };
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
