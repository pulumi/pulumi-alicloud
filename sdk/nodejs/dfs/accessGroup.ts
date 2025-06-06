// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a DFS Access Group resource.
 *
 * For information about DFS Access Group and how to use it, see [What is Access Group](https://www.alibabacloud.com/help/en/aibaba-cloud-storage-services/latest/apsara-file-storage-for-hdfs).
 *
 * > **NOTE:** Available since v1.133.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const _default = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const defaultAccessGroup = new alicloud.dfs.AccessGroup("default", {
 *     accessGroupName: `tf-example-${_default.result}`,
 *     networkType: "VPC",
 * });
 * ```
 *
 * ## Import
 *
 * DFS Access Group can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:dfs/accessGroup:AccessGroup example <id>
 * ```
 */
export class AccessGroup extends pulumi.CustomResource {
    /**
     * Get an existing AccessGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessGroupState, opts?: pulumi.CustomResourceOptions): AccessGroup {
        return new AccessGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:dfs/accessGroup:AccessGroup';

    /**
     * Returns true if the given object is an instance of AccessGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessGroup.__pulumiType;
    }

    /**
     * The permission group name. The naming rules are as follows: The length is 6~64 characters. Globally unique and cannot be an empty string. English letters are supported and can contain numbers, underscores (_), and dashes (-).
     */
    public readonly accessGroupName!: pulumi.Output<string>;
    /**
     * The creation time of the permission group resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The permission group description.  No more than 32 characters in length.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The permission group type. Only VPC (VPC) is supported.
     */
    public readonly networkType!: pulumi.Output<string>;

    /**
     * Create a AccessGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessGroupArgs | AccessGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessGroupState | undefined;
            resourceInputs["accessGroupName"] = state ? state.accessGroupName : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["networkType"] = state ? state.networkType : undefined;
        } else {
            const args = argsOrState as AccessGroupArgs | undefined;
            if ((!args || args.accessGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessGroupName'");
            }
            if ((!args || args.networkType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkType'");
            }
            resourceInputs["accessGroupName"] = args ? args.accessGroupName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["networkType"] = args ? args.networkType : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessGroup resources.
 */
export interface AccessGroupState {
    /**
     * The permission group name. The naming rules are as follows: The length is 6~64 characters. Globally unique and cannot be an empty string. English letters are supported and can contain numbers, underscores (_), and dashes (-).
     */
    accessGroupName?: pulumi.Input<string>;
    /**
     * The creation time of the permission group resource.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The permission group description.  No more than 32 characters in length.
     */
    description?: pulumi.Input<string>;
    /**
     * The permission group type. Only VPC (VPC) is supported.
     */
    networkType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessGroup resource.
 */
export interface AccessGroupArgs {
    /**
     * The permission group name. The naming rules are as follows: The length is 6~64 characters. Globally unique and cannot be an empty string. English letters are supported and can contain numbers, underscores (_), and dashes (-).
     */
    accessGroupName: pulumi.Input<string>;
    /**
     * The permission group description.  No more than 32 characters in length.
     */
    description?: pulumi.Input<string>;
    /**
     * The permission group type. Only VPC (VPC) is supported.
     */
    networkType: pulumi.Input<string>;
}
