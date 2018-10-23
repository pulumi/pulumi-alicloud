import * as pulumi from "@pulumi/pulumi";
/**
 * Log Service provides the LogSearch/Analytics function to query and analyze large amounts of logs in real time.
 * You can use this function by enabling the index and field statistics. [Refer to details](https://www.alibabacloud.com/help/doc-detail/43772.htm)
 */
export declare class StoreIndex extends pulumi.CustomResource {
    /**
     * Get an existing StoreIndex resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StoreIndexState): StoreIndex;
    /**
     * List configurations of field search index. Valid item as follows:
     */
    readonly fieldSearches: pulumi.Output<{
        alias?: string;
        caseSensitive?: boolean;
        enableAnalytics?: boolean;
        includeChinese?: boolean;
        name: string;
        token?: string;
        type?: string;
    }[] | undefined>;
    /**
     * The configuration of full text index. Valid item as follows:
     */
    readonly fullText: pulumi.Output<{
        caseSensitive?: boolean;
        includeChinese?: boolean;
        token?: string;
    } | undefined>;
    /**
     * The log store name to the query index belongs.
     */
    readonly logstore: pulumi.Output<string>;
    /**
     * The project name to the log store belongs.
     */
    readonly project: pulumi.Output<string>;
    /**
     * Create a StoreIndex resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StoreIndexArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering StoreIndex resources.
 */
export interface StoreIndexState {
    /**
     * List configurations of field search index. Valid item as follows:
     */
    readonly fieldSearches?: pulumi.Input<pulumi.Input<{
        alias?: pulumi.Input<string>;
        caseSensitive?: pulumi.Input<boolean>;
        enableAnalytics?: pulumi.Input<boolean>;
        includeChinese?: pulumi.Input<boolean>;
        name: pulumi.Input<string>;
        token?: pulumi.Input<string>;
        type?: pulumi.Input<string>;
    }>[]>;
    /**
     * The configuration of full text index. Valid item as follows:
     */
    readonly fullText?: pulumi.Input<{
        caseSensitive?: pulumi.Input<boolean>;
        includeChinese?: pulumi.Input<boolean>;
        token?: pulumi.Input<string>;
    }>;
    /**
     * The log store name to the query index belongs.
     */
    readonly logstore?: pulumi.Input<string>;
    /**
     * The project name to the log store belongs.
     */
    readonly project?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a StoreIndex resource.
 */
export interface StoreIndexArgs {
    /**
     * List configurations of field search index. Valid item as follows:
     */
    readonly fieldSearches?: pulumi.Input<pulumi.Input<{
        alias?: pulumi.Input<string>;
        caseSensitive?: pulumi.Input<boolean>;
        enableAnalytics?: pulumi.Input<boolean>;
        includeChinese?: pulumi.Input<boolean>;
        name: pulumi.Input<string>;
        token?: pulumi.Input<string>;
        type?: pulumi.Input<string>;
    }>[]>;
    /**
     * The configuration of full text index. Valid item as follows:
     */
    readonly fullText?: pulumi.Input<{
        caseSensitive?: pulumi.Input<boolean>;
        includeChinese?: pulumi.Input<boolean>;
        token?: pulumi.Input<string>;
    }>;
    /**
     * The log store name to the query index belongs.
     */
    readonly logstore: pulumi.Input<string>;
    /**
     * The project name to the log store belongs.
     */
    readonly project: pulumi.Input<string>;
}
