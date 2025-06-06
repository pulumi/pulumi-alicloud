// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Vpc Ipam Ipam Scope resource.
 *
 * IP Address Management Scope.
 *
 * For information about Vpc Ipam Ipam Scope and how to use it, see [What is Ipam Scope](https://next.api.alibabacloud.com/document/VpcIpam/2023-02-28/CreateIpamScope).
 *
 * > **NOTE:** Available since v1.234.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const defaultIpam = new alicloud.vpc.IpamIpam("defaultIpam", {
 *     operatingRegionLists: ["cn-hangzhou"],
 *     ipamName: name,
 * });
 * const _default = new alicloud.vpc.IpamIpamScope("default", {
 *     ipamScopeName: name,
 *     ipamId: defaultIpam.id,
 *     ipamScopeDescription: "This is a ipam scope.",
 *     ipamScopeType: "private",
 * });
 * ```
 *
 * ## Import
 *
 * Vpc Ipam Ipam Scope can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:vpc/ipamIpamScope:IpamIpamScope example <id>
 * ```
 */
export class IpamIpamScope extends pulumi.CustomResource {
    /**
     * Get an existing IpamIpamScope resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IpamIpamScopeState, opts?: pulumi.CustomResourceOptions): IpamIpamScope {
        return new IpamIpamScope(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/ipamIpamScope:IpamIpamScope';

    /**
     * Returns true if the given object is an instance of IpamIpamScope.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IpamIpamScope {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IpamIpamScope.__pulumiType;
    }

    /**
     * The creation time of the resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The id of the Ipam instance.
     */
    public readonly ipamId!: pulumi.Output<string>;
    /**
     * The description of the IPAM's scope of action.
     * It must be 2 to 256 characters in length and must start with a lowercase letter, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
     */
    public readonly ipamScopeDescription!: pulumi.Output<string | undefined>;
    /**
     * The name of the resource.
     */
    public readonly ipamScopeName!: pulumi.Output<string | undefined>;
    /**
     * IPAM scope of action type:
     * `private`.
     *
     *
     * > **NOTE:**  Currently, only the role scope of the private network is supported.
     */
    public readonly ipamScopeType!: pulumi.Output<string | undefined>;
    /**
     * The region ID of the resource.
     */
    public /*out*/ readonly regionId!: pulumi.Output<string>;
    /**
     * The ID of the resource group.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The tag of the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a IpamIpamScope resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IpamIpamScopeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IpamIpamScopeArgs | IpamIpamScopeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IpamIpamScopeState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["ipamId"] = state ? state.ipamId : undefined;
            resourceInputs["ipamScopeDescription"] = state ? state.ipamScopeDescription : undefined;
            resourceInputs["ipamScopeName"] = state ? state.ipamScopeName : undefined;
            resourceInputs["ipamScopeType"] = state ? state.ipamScopeType : undefined;
            resourceInputs["regionId"] = state ? state.regionId : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as IpamIpamScopeArgs | undefined;
            if ((!args || args.ipamId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipamId'");
            }
            resourceInputs["ipamId"] = args ? args.ipamId : undefined;
            resourceInputs["ipamScopeDescription"] = args ? args.ipamScopeDescription : undefined;
            resourceInputs["ipamScopeName"] = args ? args.ipamScopeName : undefined;
            resourceInputs["ipamScopeType"] = args ? args.ipamScopeType : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["regionId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IpamIpamScope.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IpamIpamScope resources.
 */
export interface IpamIpamScopeState {
    /**
     * The creation time of the resource.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The id of the Ipam instance.
     */
    ipamId?: pulumi.Input<string>;
    /**
     * The description of the IPAM's scope of action.
     * It must be 2 to 256 characters in length and must start with a lowercase letter, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
     */
    ipamScopeDescription?: pulumi.Input<string>;
    /**
     * The name of the resource.
     */
    ipamScopeName?: pulumi.Input<string>;
    /**
     * IPAM scope of action type:
     * `private`.
     *
     *
     * > **NOTE:**  Currently, only the role scope of the private network is supported.
     */
    ipamScopeType?: pulumi.Input<string>;
    /**
     * The region ID of the resource.
     */
    regionId?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * The tag of the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a IpamIpamScope resource.
 */
export interface IpamIpamScopeArgs {
    /**
     * The id of the Ipam instance.
     */
    ipamId: pulumi.Input<string>;
    /**
     * The description of the IPAM's scope of action.
     * It must be 2 to 256 characters in length and must start with a lowercase letter, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
     */
    ipamScopeDescription?: pulumi.Input<string>;
    /**
     * The name of the resource.
     */
    ipamScopeName?: pulumi.Input<string>;
    /**
     * IPAM scope of action type:
     * `private`.
     *
     *
     * > **NOTE:**  Currently, only the role scope of the private network is supported.
     */
    ipamScopeType?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The tag of the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
