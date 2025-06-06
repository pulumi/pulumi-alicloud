// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a RDC Organization resource.
 *
 * For information about RDC Organization and how to use it, see [What is Organization](https://www.alibabacloud.com/help/en/yunxiao/product-overview/what-is-cloud-effect).
 *
 * > **NOTE:** Available since v1.137.0.
 *
 * > **DEPRECATED:** This resource has been deprecated from version `1.238.0`.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.rdc.Organization("example", {
 *     organizationName: "example_value",
 *     source: "example_value",
 * });
 * ```
 *
 * ## Import
 *
 * RDC Organization can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:rdc/organization:Organization example <id>
 * ```
 */
export class Organization extends pulumi.CustomResource {
    /**
     * Get an existing Organization resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationState, opts?: pulumi.CustomResourceOptions): Organization {
        return new Organization(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:rdc/organization:Organization';

    /**
     * Returns true if the given object is an instance of Organization.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Organization {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Organization.__pulumiType;
    }

    /**
     * The desired member count.
     */
    public readonly desiredMemberCount!: pulumi.Output<number | undefined>;
    /**
     * Company name.
     */
    public readonly organizationName!: pulumi.Output<string>;
    /**
     * User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
     */
    public readonly realPk!: pulumi.Output<string | undefined>;
    /**
     * This is organization source information
     */
    public readonly source!: pulumi.Output<string>;

    /**
     * Create a Organization resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationArgs | OrganizationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationState | undefined;
            resourceInputs["desiredMemberCount"] = state ? state.desiredMemberCount : undefined;
            resourceInputs["organizationName"] = state ? state.organizationName : undefined;
            resourceInputs["realPk"] = state ? state.realPk : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
        } else {
            const args = argsOrState as OrganizationArgs | undefined;
            if ((!args || args.organizationName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationName'");
            }
            if ((!args || args.source === undefined) && !opts.urn) {
                throw new Error("Missing required property 'source'");
            }
            resourceInputs["desiredMemberCount"] = args ? args.desiredMemberCount : undefined;
            resourceInputs["organizationName"] = args ? args.organizationName : undefined;
            resourceInputs["realPk"] = args ? args.realPk : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Organization.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Organization resources.
 */
export interface OrganizationState {
    /**
     * The desired member count.
     */
    desiredMemberCount?: pulumi.Input<number>;
    /**
     * Company name.
     */
    organizationName?: pulumi.Input<string>;
    /**
     * User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
     */
    realPk?: pulumi.Input<string>;
    /**
     * This is organization source information
     */
    source?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Organization resource.
 */
export interface OrganizationArgs {
    /**
     * The desired member count.
     */
    desiredMemberCount?: pulumi.Input<number>;
    /**
     * Company name.
     */
    organizationName: pulumi.Input<string>;
    /**
     * User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
     */
    realPk?: pulumi.Input<string>;
    /**
     * This is organization source information
     */
    source: pulumi.Input<string>;
}
