// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a CEN transit router resource that associate the transitRouter with the CEN instance.[What is Cen Transit Router](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtransitrouter)
 *
 * > **NOTE:** Available since v1.126.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.cen.Instance("example", {
 *     cenInstanceName: "tf_example",
 *     description: "an example for cen",
 * });
 * const exampleTransitRouter = new alicloud.cen.TransitRouter("example", {
 *     transitRouterName: "tf_example",
 *     cenId: example.id,
 * });
 * ```
 *
 * ## Import
 *
 * CEN instance can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cen/transitRouter:TransitRouter default cen-*****:tr-*******
 * ```
 */
export class TransitRouter extends pulumi.CustomResource {
    /**
     * Get an existing TransitRouter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TransitRouterState, opts?: pulumi.CustomResourceOptions): TransitRouter {
        return new TransitRouter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cen/transitRouter:TransitRouter';

    /**
     * Returns true if the given object is an instance of TransitRouter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TransitRouter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TransitRouter.__pulumiType;
    }

    /**
     * The ID of the CEN.
     */
    public readonly cenId!: pulumi.Output<string>;
    /**
     * The dry run.
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * The associating status of the Transit Router.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values: `false`, `true`. Default Value: `false`. The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-listtransitrouteravailableresource) to query the regions that support multicast.
     */
    public readonly supportMulticast!: pulumi.Output<boolean | undefined>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The description of the transit router.
     */
    public readonly transitRouterDescription!: pulumi.Output<string | undefined>;
    /**
     * The transit router id of the transit router.
     */
    public /*out*/ readonly transitRouterId!: pulumi.Output<string>;
    /**
     * The name of the transit router.
     */
    public readonly transitRouterName!: pulumi.Output<string | undefined>;
    /**
     * The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a TransitRouter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TransitRouterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TransitRouterArgs | TransitRouterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TransitRouterState | undefined;
            resourceInputs["cenId"] = state ? state.cenId : undefined;
            resourceInputs["dryRun"] = state ? state.dryRun : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["supportMulticast"] = state ? state.supportMulticast : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["transitRouterDescription"] = state ? state.transitRouterDescription : undefined;
            resourceInputs["transitRouterId"] = state ? state.transitRouterId : undefined;
            resourceInputs["transitRouterName"] = state ? state.transitRouterName : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as TransitRouterArgs | undefined;
            if ((!args || args.cenId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cenId'");
            }
            resourceInputs["cenId"] = args ? args.cenId : undefined;
            resourceInputs["dryRun"] = args ? args.dryRun : undefined;
            resourceInputs["supportMulticast"] = args ? args.supportMulticast : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["transitRouterDescription"] = args ? args.transitRouterDescription : undefined;
            resourceInputs["transitRouterName"] = args ? args.transitRouterName : undefined;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["transitRouterId"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TransitRouter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TransitRouter resources.
 */
export interface TransitRouterState {
    /**
     * The ID of the CEN.
     */
    cenId?: pulumi.Input<string>;
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The associating status of the Transit Router.
     */
    status?: pulumi.Input<string>;
    /**
     * Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values: `false`, `true`. Default Value: `false`. The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-listtransitrouteravailableresource) to query the regions that support multicast.
     */
    supportMulticast?: pulumi.Input<boolean>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The description of the transit router.
     */
    transitRouterDescription?: pulumi.Input<string>;
    /**
     * The transit router id of the transit router.
     */
    transitRouterId?: pulumi.Input<string>;
    /**
     * The name of the transit router.
     */
    transitRouterName?: pulumi.Input<string>;
    /**
     * The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TransitRouter resource.
 */
export interface TransitRouterArgs {
    /**
     * The ID of the CEN.
     */
    cenId: pulumi.Input<string>;
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values: `false`, `true`. Default Value: `false`. The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-listtransitrouteravailableresource) to query the regions that support multicast.
     */
    supportMulticast?: pulumi.Input<boolean>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The description of the transit router.
     */
    transitRouterDescription?: pulumi.Input<string>;
    /**
     * The name of the transit router.
     */
    transitRouterName?: pulumi.Input<string>;
}
