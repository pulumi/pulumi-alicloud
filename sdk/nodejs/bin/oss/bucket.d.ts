import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a resource to create a oss bucket and set its attribution.
 *
 * ~> **NOTE:** The bucket namespace is shared by all users of the OSS system. Please set bucket name as unique as possible.
 *
 */
export declare class Bucket extends pulumi.CustomResource {
    /**
     * Get an existing Bucket resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketState): Bucket;
    /**
     * The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Defaults to "private".
     */
    readonly acl: pulumi.Output<string | undefined>;
    /**
     * The name of the bucket. If omitted, Terraform will assign a random and unique name.
     */
    readonly bucket: pulumi.Output<string | undefined>;
    readonly corsRules: pulumi.Output<{
        allowedHeaders?: string[];
        allowedMethods: string[];
        allowedOrigins: string[];
        exposeHeaders?: string[];
        maxAgeSeconds?: number;
    }[] | undefined>;
    /**
     * The creation date of the bucket.
     */
    readonly creationDate: pulumi.Output<string>;
    /**
     * The extranet access endpoint of the bucket.
     */
    readonly extranetEndpoint: pulumi.Output<string>;
    /**
     * The intranet access endpoint of the bucket.
     */
    readonly intranetEndpoint: pulumi.Output<string>;
    /**
     * A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
     */
    readonly lifecycleRules: pulumi.Output<{
        enabled: boolean;
        expirations: {
            date?: string;
            days?: number;
        }[];
        id: string;
        prefix: string;
    }[] | undefined>;
    /**
     * The location of the bucket.
     */
    readonly location: pulumi.Output<string>;
    /**
     * A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
     */
    readonly logging: pulumi.Output<{
        targetBucket: string;
        targetPrefix?: string;
    } | undefined>;
    /**
     * The flag of using logging enable container. Defaults true.
     */
    readonly loggingIsenable: pulumi.Output<boolean | undefined>;
    /**
     * The bucket owner.
     */
    readonly owner: pulumi.Output<string>;
    /**
     * The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
     */
    readonly refererConfig: pulumi.Output<{
        allowEmpty?: boolean;
        referers: string[];
    }>;
    /**
     * The bucket storage type.
     */
    readonly storageClass: pulumi.Output<string>;
    /**
     * A website object(documented below).
     */
    readonly website: pulumi.Output<{
        errorDocument?: string;
        indexDocument: string;
    } | undefined>;
    /**
     * Create a Bucket resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BucketArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Bucket resources.
 */
export interface BucketState {
    /**
     * The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Defaults to "private".
     */
    readonly acl?: pulumi.Input<string>;
    /**
     * The name of the bucket. If omitted, Terraform will assign a random and unique name.
     */
    readonly bucket?: pulumi.Input<string>;
    readonly corsRules?: pulumi.Input<pulumi.Input<{
        allowedHeaders?: pulumi.Input<pulumi.Input<string>[]>;
        allowedMethods: pulumi.Input<pulumi.Input<string>[]>;
        allowedOrigins: pulumi.Input<pulumi.Input<string>[]>;
        exposeHeaders?: pulumi.Input<pulumi.Input<string>[]>;
        maxAgeSeconds?: pulumi.Input<number>;
    }>[]>;
    /**
     * The creation date of the bucket.
     */
    readonly creationDate?: pulumi.Input<string>;
    /**
     * The extranet access endpoint of the bucket.
     */
    readonly extranetEndpoint?: pulumi.Input<string>;
    /**
     * The intranet access endpoint of the bucket.
     */
    readonly intranetEndpoint?: pulumi.Input<string>;
    /**
     * A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
     */
    readonly lifecycleRules?: pulumi.Input<pulumi.Input<{
        enabled: pulumi.Input<boolean>;
        expirations: pulumi.Input<pulumi.Input<{
            date?: pulumi.Input<string>;
            days?: pulumi.Input<number>;
        }>[]>;
        id?: pulumi.Input<string>;
        prefix: pulumi.Input<string>;
    }>[]>;
    /**
     * The location of the bucket.
     */
    readonly location?: pulumi.Input<string>;
    /**
     * A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
     */
    readonly logging?: pulumi.Input<{
        targetBucket: pulumi.Input<string>;
        targetPrefix?: pulumi.Input<string>;
    }>;
    /**
     * The flag of using logging enable container. Defaults true.
     */
    readonly loggingIsenable?: pulumi.Input<boolean>;
    /**
     * The bucket owner.
     */
    readonly owner?: pulumi.Input<string>;
    /**
     * The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
     */
    readonly refererConfig?: pulumi.Input<{
        allowEmpty?: pulumi.Input<boolean>;
        referers: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    /**
     * The bucket storage type.
     */
    readonly storageClass?: pulumi.Input<string>;
    /**
     * A website object(documented below).
     */
    readonly website?: pulumi.Input<{
        errorDocument?: pulumi.Input<string>;
        indexDocument: pulumi.Input<string>;
    }>;
}
/**
 * The set of arguments for constructing a Bucket resource.
 */
export interface BucketArgs {
    /**
     * The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Defaults to "private".
     */
    readonly acl?: pulumi.Input<string>;
    /**
     * The name of the bucket. If omitted, Terraform will assign a random and unique name.
     */
    readonly bucket?: pulumi.Input<string>;
    readonly corsRules?: pulumi.Input<pulumi.Input<{
        allowedHeaders?: pulumi.Input<pulumi.Input<string>[]>;
        allowedMethods: pulumi.Input<pulumi.Input<string>[]>;
        allowedOrigins: pulumi.Input<pulumi.Input<string>[]>;
        exposeHeaders?: pulumi.Input<pulumi.Input<string>[]>;
        maxAgeSeconds?: pulumi.Input<number>;
    }>[]>;
    /**
     * A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
     */
    readonly lifecycleRules?: pulumi.Input<pulumi.Input<{
        enabled: pulumi.Input<boolean>;
        expirations: pulumi.Input<pulumi.Input<{
            date?: pulumi.Input<string>;
            days?: pulumi.Input<number>;
        }>[]>;
        id?: pulumi.Input<string>;
        prefix: pulumi.Input<string>;
    }>[]>;
    /**
     * A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
     */
    readonly logging?: pulumi.Input<{
        targetBucket: pulumi.Input<string>;
        targetPrefix?: pulumi.Input<string>;
    }>;
    /**
     * The flag of using logging enable container. Defaults true.
     */
    readonly loggingIsenable?: pulumi.Input<boolean>;
    /**
     * The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
     */
    readonly refererConfig?: pulumi.Input<{
        allowEmpty?: pulumi.Input<boolean>;
        referers: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    /**
     * A website object(documented below).
     */
    readonly website?: pulumi.Input<{
        errorDocument?: pulumi.Input<string>;
        indexDocument: pulumi.Input<string>;
    }>;
}
