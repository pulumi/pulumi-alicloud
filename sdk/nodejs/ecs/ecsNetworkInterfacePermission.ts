// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ECS Network Interface Permission resource.
 *
 * For information about ECS Network Interface Permission and how to use it, see [What is Network Interface Permission](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/elastic-network-interfaces-overview).
 *
 * > **NOTE:** Available in v1.166.0+.
 *
 * ## Import
 *
 * ECS Network Interface Permission can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:ecs/ecsNetworkInterfacePermission:EcsNetworkInterfacePermission example <id>
 * ```
 */
export class EcsNetworkInterfacePermission extends pulumi.CustomResource {
    /**
     * Get an existing EcsNetworkInterfacePermission resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EcsNetworkInterfacePermissionState, opts?: pulumi.CustomResourceOptions): EcsNetworkInterfacePermission {
        return new EcsNetworkInterfacePermission(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/ecsNetworkInterfacePermission:EcsNetworkInterfacePermission';

    /**
     * Returns true if the given object is an instance of EcsNetworkInterfacePermission.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EcsNetworkInterfacePermission {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EcsNetworkInterfacePermission.__pulumiType;
    }

    /**
     * Alibaba Cloud Partner (Certified ISV) account ID or individual user ID.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Whether to force deletion of Network Interface Permission. Default value: `true`.
     */
    public readonly force!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the network interface.
     */
    public readonly networkInterfaceId!: pulumi.Output<string>;
    /**
     * The permissions of the Network Interface. Valid values: `InstanceAttach`. `InstanceAttach`: Allows authorized users to mount your ENI to the other ECS instance. The ECS instance must be in the same zone as the ENI.
     */
    public readonly permission!: pulumi.Output<string>;
    /**
     * The Status of the Network Interface Permissions. Valid values: `Pending`, `Granted`, `Revoking`, `Revoked`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a EcsNetworkInterfacePermission resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EcsNetworkInterfacePermissionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EcsNetworkInterfacePermissionArgs | EcsNetworkInterfacePermissionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EcsNetworkInterfacePermissionState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["force"] = state ? state.force : undefined;
            resourceInputs["networkInterfaceId"] = state ? state.networkInterfaceId : undefined;
            resourceInputs["permission"] = state ? state.permission : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as EcsNetworkInterfacePermissionArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.networkInterfaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkInterfaceId'");
            }
            if ((!args || args.permission === undefined) && !opts.urn) {
                throw new Error("Missing required property 'permission'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["force"] = args ? args.force : undefined;
            resourceInputs["networkInterfaceId"] = args ? args.networkInterfaceId : undefined;
            resourceInputs["permission"] = args ? args.permission : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EcsNetworkInterfacePermission.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EcsNetworkInterfacePermission resources.
 */
export interface EcsNetworkInterfacePermissionState {
    /**
     * Alibaba Cloud Partner (Certified ISV) account ID or individual user ID.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Whether to force deletion of Network Interface Permission. Default value: `true`.
     */
    force?: pulumi.Input<boolean>;
    /**
     * The ID of the network interface.
     */
    networkInterfaceId?: pulumi.Input<string>;
    /**
     * The permissions of the Network Interface. Valid values: `InstanceAttach`. `InstanceAttach`: Allows authorized users to mount your ENI to the other ECS instance. The ECS instance must be in the same zone as the ENI.
     */
    permission?: pulumi.Input<string>;
    /**
     * The Status of the Network Interface Permissions. Valid values: `Pending`, `Granted`, `Revoking`, `Revoked`.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EcsNetworkInterfacePermission resource.
 */
export interface EcsNetworkInterfacePermissionArgs {
    /**
     * Alibaba Cloud Partner (Certified ISV) account ID or individual user ID.
     */
    accountId: pulumi.Input<string>;
    /**
     * Whether to force deletion of Network Interface Permission. Default value: `true`.
     */
    force?: pulumi.Input<boolean>;
    /**
     * The ID of the network interface.
     */
    networkInterfaceId: pulumi.Input<string>;
    /**
     * The permissions of the Network Interface. Valid values: `InstanceAttach`. `InstanceAttach`: Allows authorized users to mount your ENI to the other ECS instance. The ECS instance must be in the same zone as the ENI.
     */
    permission: pulumi.Input<string>;
}