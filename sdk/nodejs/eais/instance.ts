// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a EAIS Instance resource.
 *
 * For information about EAIS Instance and how to use it, see [What is Instance](https://help.aliyun.com/document_detail/185066.html).
 *
 * > **NOTE:** Available in v1.137.0+.
 *
 * ## Import
 *
 * EAIS Instance can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:eais/instance:Instance example <id>
 * ```
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance {
        return new Instance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:eais/instance:Instance';

    /**
     * Returns true if the given object is an instance of Instance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Instance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Instance.__pulumiType;
    }

    /**
     * Whether to force deletion when the instance status does not meet the deletion conditions. Valid values: `true` and `false`.
     */
    public readonly force!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the instance.
     */
    public readonly instanceName!: pulumi.Output<string | undefined>;
    /**
     * The type of the resource. Valid values: `eais.ei-a6.4xlarge`, `eais.ei-a6.2xlarge`, `eais.ei-a6.xlarge`, `eais.ei-a6.large`, `eais.ei-a6.medium`.
     */
    public readonly instanceType!: pulumi.Output<string>;
    /**
     * The ID of the security group.
     */
    public readonly securityGroupId!: pulumi.Output<string>;
    /**
     * The status of the resource. Valid values: `Attaching`, `Available`, `Detaching`, `InUse`, `Starting`, `Unavailable`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The ID of the vswitch.
     */
    public readonly vswitchId!: pulumi.Output<string>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceState | undefined;
            resourceInputs["force"] = state ? state.force : undefined;
            resourceInputs["instanceName"] = state ? state.instanceName : undefined;
            resourceInputs["instanceType"] = state ? state.instanceType : undefined;
            resourceInputs["securityGroupId"] = state ? state.securityGroupId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if ((!args || args.instanceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceType'");
            }
            if ((!args || args.securityGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityGroupId'");
            }
            if ((!args || args.vswitchId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vswitchId'");
            }
            resourceInputs["force"] = args ? args.force : undefined;
            resourceInputs["instanceName"] = args ? args.instanceName : undefined;
            resourceInputs["instanceType"] = args ? args.instanceType : undefined;
            resourceInputs["securityGroupId"] = args ? args.securityGroupId : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Instance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * Whether to force deletion when the instance status does not meet the deletion conditions. Valid values: `true` and `false`.
     */
    force?: pulumi.Input<boolean>;
    /**
     * The name of the instance.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * The type of the resource. Valid values: `eais.ei-a6.4xlarge`, `eais.ei-a6.2xlarge`, `eais.ei-a6.xlarge`, `eais.ei-a6.large`, `eais.ei-a6.medium`.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * The ID of the security group.
     */
    securityGroupId?: pulumi.Input<string>;
    /**
     * The status of the resource. Valid values: `Attaching`, `Available`, `Detaching`, `InUse`, `Starting`, `Unavailable`.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the vswitch.
     */
    vswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * Whether to force deletion when the instance status does not meet the deletion conditions. Valid values: `true` and `false`.
     */
    force?: pulumi.Input<boolean>;
    /**
     * The name of the instance.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * The type of the resource. Valid values: `eais.ei-a6.4xlarge`, `eais.ei-a6.2xlarge`, `eais.ei-a6.xlarge`, `eais.ei-a6.large`, `eais.ei-a6.medium`.
     */
    instanceType: pulumi.Input<string>;
    /**
     * The ID of the security group.
     */
    securityGroupId: pulumi.Input<string>;
    /**
     * The ID of the vswitch.
     */
    vswitchId: pulumi.Input<string>;
}