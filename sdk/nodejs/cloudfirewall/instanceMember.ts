// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Firewall Instance Member resource.
 *
 * For information about Cloud Firewall Instance Member and how to use it, see [What is Instance Member](https://www.alibabacloud.com/help/en/server-load-balancer/latest/createloadbalancer).
 *
 * > **NOTE:** Available in v1.194.0+.
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
 * const name = config.get("name") || "AliyunTerraform";
 * const defaultAccount = new alicloud.resourcemanager.Account("defaultAccount", {displayName: name});
 * const defaultInstanceMember = new alicloud.cloudfirewall.InstanceMember("defaultInstanceMember", {
 *     memberDesc: name,
 *     memberUid: defaultAccount.id,
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Firewall Instance Member can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cloudfirewall/instanceMember:InstanceMember example <id>
 * ```
 */
export class InstanceMember extends pulumi.CustomResource {
    /**
     * Get an existing InstanceMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceMemberState, opts?: pulumi.CustomResourceOptions): InstanceMember {
        return new InstanceMember(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudfirewall/instanceMember:InstanceMember';

    /**
     * Returns true if the given object is an instance of InstanceMember.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstanceMember {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstanceMember.__pulumiType;
    }

    /**
     * When the cloud firewall member account was added.> use second-level timestamp format.
     */
    public /*out*/ readonly createTime!: pulumi.Output<number>;
    /**
     * Remarks of cloud firewall member accounts.
     */
    public readonly memberDesc!: pulumi.Output<string | undefined>;
    /**
     * The name of the cloud firewall member account.
     */
    public /*out*/ readonly memberDisplayName!: pulumi.Output<string>;
    /**
     * The UID of the cloud firewall member account.
     */
    public readonly memberUid!: pulumi.Output<string>;
    /**
     * The last modification time of the cloud firewall member account.> use second-level timestamp format.
     */
    public /*out*/ readonly modifyTime!: pulumi.Output<number>;
    /**
     * The resource attribute field that represents the resource status.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a InstanceMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceMemberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceMemberArgs | InstanceMemberState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceMemberState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["memberDesc"] = state ? state.memberDesc : undefined;
            resourceInputs["memberDisplayName"] = state ? state.memberDisplayName : undefined;
            resourceInputs["memberUid"] = state ? state.memberUid : undefined;
            resourceInputs["modifyTime"] = state ? state.modifyTime : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as InstanceMemberArgs | undefined;
            if ((!args || args.memberUid === undefined) && !opts.urn) {
                throw new Error("Missing required property 'memberUid'");
            }
            resourceInputs["memberDesc"] = args ? args.memberDesc : undefined;
            resourceInputs["memberUid"] = args ? args.memberUid : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["memberDisplayName"] = undefined /*out*/;
            resourceInputs["modifyTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InstanceMember.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstanceMember resources.
 */
export interface InstanceMemberState {
    /**
     * When the cloud firewall member account was added.> use second-level timestamp format.
     */
    createTime?: pulumi.Input<number>;
    /**
     * Remarks of cloud firewall member accounts.
     */
    memberDesc?: pulumi.Input<string>;
    /**
     * The name of the cloud firewall member account.
     */
    memberDisplayName?: pulumi.Input<string>;
    /**
     * The UID of the cloud firewall member account.
     */
    memberUid?: pulumi.Input<string>;
    /**
     * The last modification time of the cloud firewall member account.> use second-level timestamp format.
     */
    modifyTime?: pulumi.Input<number>;
    /**
     * The resource attribute field that represents the resource status.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InstanceMember resource.
 */
export interface InstanceMemberArgs {
    /**
     * Remarks of cloud firewall member accounts.
     */
    memberDesc?: pulumi.Input<string>;
    /**
     * The UID of the cloud firewall member account.
     */
    memberUid: pulumi.Input<string>;
}