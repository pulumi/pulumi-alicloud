// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Application Load Balancer (ALB) Load Balancer Zone Shifted Attachment resource.
 *
 * Application load balancer start-stop zone.
 *
 * For information about Application Load Balancer (ALB) Load Balancer Zone Shifted Attachment and how to use it, see [What is Load Balancer Zone Shifted Attachment](https://www.alibabacloud.com/help/en/).
 *
 * > **NOTE:** Available since v1.242.0.
 *
 * ## Import
 *
 * Application Load Balancer (ALB) Load Balancer Zone Shifted Attachment can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:alb/loadBalancerZoneShiftedAttachment:LoadBalancerZoneShiftedAttachment example <load_balancer_id>:<vswitch_id>:<zone_id>
 * ```
 */
export class LoadBalancerZoneShiftedAttachment extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancerZoneShiftedAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerZoneShiftedAttachmentState, opts?: pulumi.CustomResourceOptions): LoadBalancerZoneShiftedAttachment {
        return new LoadBalancerZoneShiftedAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:alb/loadBalancerZoneShiftedAttachment:LoadBalancerZoneShiftedAttachment';

    /**
     * Returns true if the given object is an instance of LoadBalancerZoneShiftedAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadBalancerZoneShiftedAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadBalancerZoneShiftedAttachment.__pulumiType;
    }

    /**
     * The ID of the load balancing instance.
     */
    public readonly loadBalancerId!: pulumi.Output<string>;
    /**
     * Availability zone status. Value:
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The VSwitch corresponding to the zone. By default, each zone uses one VSwitch and one subnet.
     */
    public readonly vswitchId!: pulumi.Output<string>;
    /**
     * The ID of the zone.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a LoadBalancerZoneShiftedAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadBalancerZoneShiftedAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerZoneShiftedAttachmentArgs | LoadBalancerZoneShiftedAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadBalancerZoneShiftedAttachmentState | undefined;
            resourceInputs["loadBalancerId"] = state ? state.loadBalancerId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as LoadBalancerZoneShiftedAttachmentArgs | undefined;
            if ((!args || args.loadBalancerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadBalancerId'");
            }
            if ((!args || args.vswitchId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vswitchId'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["loadBalancerId"] = args ? args.loadBalancerId : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoadBalancerZoneShiftedAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancerZoneShiftedAttachment resources.
 */
export interface LoadBalancerZoneShiftedAttachmentState {
    /**
     * The ID of the load balancing instance.
     */
    loadBalancerId?: pulumi.Input<string>;
    /**
     * Availability zone status. Value:
     */
    status?: pulumi.Input<string>;
    /**
     * The VSwitch corresponding to the zone. By default, each zone uses one VSwitch and one subnet.
     */
    vswitchId?: pulumi.Input<string>;
    /**
     * The ID of the zone.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LoadBalancerZoneShiftedAttachment resource.
 */
export interface LoadBalancerZoneShiftedAttachmentArgs {
    /**
     * The ID of the load balancing instance.
     */
    loadBalancerId: pulumi.Input<string>;
    /**
     * The VSwitch corresponding to the zone. By default, each zone uses one VSwitch and one subnet.
     */
    vswitchId: pulumi.Input<string>;
    /**
     * The ID of the zone.
     */
    zoneId: pulumi.Input<string>;
}
