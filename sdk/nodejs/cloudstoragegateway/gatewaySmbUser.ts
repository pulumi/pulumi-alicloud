// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Storage Gateway Gateway SMB User resource.
 *
 * For information about Cloud Storage Gateway Gateway SMB User and how to use it, see [What is Gateway SMB User](https://www.alibabacloud.com/help/en/cloud-storage-gateway/latest/creategatewaysmbuser).
 *
 * > **NOTE:** Available since v1.142.0.
 *
 * ## Import
 *
 * Cloud Storage Gateway Gateway SMB User can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cloudstoragegateway/gatewaySmbUser:GatewaySmbUser example <gateway_id>:<username>
 * ```
 */
export class GatewaySmbUser extends pulumi.CustomResource {
    /**
     * Get an existing GatewaySmbUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GatewaySmbUserState, opts?: pulumi.CustomResourceOptions): GatewaySmbUser {
        return new GatewaySmbUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudstoragegateway/gatewaySmbUser:GatewaySmbUser';

    /**
     * Returns true if the given object is an instance of GatewaySmbUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GatewaySmbUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GatewaySmbUser.__pulumiType;
    }

    /**
     * The Gateway ID of the Gateway SMB User.
     */
    public readonly gatewayId!: pulumi.Output<string>;
    /**
     * The password of the Gateway SMB User.
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * The username of the Gateway SMB User.
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a GatewaySmbUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GatewaySmbUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GatewaySmbUserArgs | GatewaySmbUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GatewaySmbUserState | undefined;
            resourceInputs["gatewayId"] = state ? state.gatewayId : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as GatewaySmbUserArgs | undefined;
            if ((!args || args.gatewayId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'gatewayId'");
            }
            if ((!args || args.password === undefined) && !opts.urn) {
                throw new Error("Missing required property 'password'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["gatewayId"] = args ? args.gatewayId : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(GatewaySmbUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GatewaySmbUser resources.
 */
export interface GatewaySmbUserState {
    /**
     * The Gateway ID of the Gateway SMB User.
     */
    gatewayId?: pulumi.Input<string>;
    /**
     * The password of the Gateway SMB User.
     */
    password?: pulumi.Input<string>;
    /**
     * The username of the Gateway SMB User.
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GatewaySmbUser resource.
 */
export interface GatewaySmbUserArgs {
    /**
     * The Gateway ID of the Gateway SMB User.
     */
    gatewayId: pulumi.Input<string>;
    /**
     * The password of the Gateway SMB User.
     */
    password: pulumi.Input<string>;
    /**
     * The username of the Gateway SMB User.
     */
    username: pulumi.Input<string>;
}
