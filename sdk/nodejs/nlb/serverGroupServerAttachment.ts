// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Network Load Balancer (NLB) Server Group Server Attachment resource.
 *
 * Network Server Load Balancer.
 *
 * For information about Network Load Balancer (NLB) Server Group Server Attachment and how to use it, see [What is Server Group Server Attachment](https://www.alibabacloud.com/help/en/server-load-balancer/latest/addserverstoservergroup-nlb).
 *
 * > **NOTE:** Available since v1.192.0.
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
 * const name = config.get("name") || "tf-example";
 * const _default = alicloud.resourcemanager.getResourceGroups({});
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: name,
 *     cidrBlock: "10.4.0.0/16",
 * });
 * const defaultServerGroup = new alicloud.nlb.ServerGroup("default", {
 *     resourceGroupId: _default.then(_default => _default.ids?.[0]),
 *     serverGroupName: name,
 *     serverGroupType: "Ip",
 *     connectionDrainTimeout: 10,
 *     connectionDrainEnabled: true,
 *     vpcId: defaultNetwork.id,
 *     scheduler: "Wrr",
 *     protocol: "TCP",
 *     healthCheck: {
 *         healthCheckEnabled: false,
 *     },
 *     addressIpVersion: "Ipv4",
 * });
 * const defaultServerGroupServerAttachment = new alicloud.nlb.ServerGroupServerAttachment("default", {
 *     serverType: "Ip",
 *     serverId: "10.0.0.0",
 *     description: name,
 *     port: 80,
 *     serverGroupId: defaultServerGroup.id,
 *     weight: 100,
 *     serverIp: "10.0.0.0",
 * });
 * ```
 *
 * ## Import
 *
 * Network Load Balancer (NLB) Server Group Server Attachment can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:nlb/serverGroupServerAttachment:ServerGroupServerAttachment example <server_group_id>_<server_id>_<server_ip>_<server_type>_<port>
 * ```
 */
export class ServerGroupServerAttachment extends pulumi.CustomResource {
    /**
     * Get an existing ServerGroupServerAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerGroupServerAttachmentState, opts?: pulumi.CustomResourceOptions): ServerGroupServerAttachment {
        return new ServerGroupServerAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:nlb/serverGroupServerAttachment:ServerGroupServerAttachment';

    /**
     * Returns true if the given object is an instance of ServerGroupServerAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerGroupServerAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerGroupServerAttachment.__pulumiType;
    }

    /**
     * The description of the servers.
     * The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (\_), and hyphens (-).
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The port that is used by the backend server. Valid values: `1` to `65535`.
     */
    public readonly port!: pulumi.Output<number>;
    /**
     * The ID of the server group.
     */
    public readonly serverGroupId!: pulumi.Output<string>;
    /**
     * The ID of the server.
     *
     * - If the server group type is `Instance`, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. These backend servers are specified by `Ecs`, `Eni`, or `Eci`.
     * - If the server group type is `Ip`, set the ServerId parameter to an IP address.
     */
    public readonly serverId!: pulumi.Output<string>;
    /**
     * The IP address of the server. If the server group type is `Ip`, set the ServerId parameter to an IP address.
     */
    public readonly serverIp!: pulumi.Output<string>;
    /**
     * The type of the backend server. Valid values:
     *
     * - `Ecs`: ECS instance
     * - `Eni`: ENI
     * - `Eci`: an elastic container instance
     * - `Ip`: an IP address
     */
    public readonly serverType!: pulumi.Output<string>;
    /**
     * The status of the resource
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The weight of the backend server. Valid values: `0` to `100`. Default value: `100`. If the weight of a backend server is set to `0`, no requests are forwarded to the backend server.
     */
    public readonly weight!: pulumi.Output<number>;
    /**
     * The zone ID of the server.
     */
    public /*out*/ readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a ServerGroupServerAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerGroupServerAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerGroupServerAttachmentArgs | ServerGroupServerAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerGroupServerAttachmentState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["serverGroupId"] = state ? state.serverGroupId : undefined;
            resourceInputs["serverId"] = state ? state.serverId : undefined;
            resourceInputs["serverIp"] = state ? state.serverIp : undefined;
            resourceInputs["serverType"] = state ? state.serverType : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["weight"] = state ? state.weight : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ServerGroupServerAttachmentArgs | undefined;
            if ((!args || args.serverGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverGroupId'");
            }
            if ((!args || args.serverId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverId'");
            }
            if ((!args || args.serverType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverType'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["serverGroupId"] = args ? args.serverGroupId : undefined;
            resourceInputs["serverId"] = args ? args.serverId : undefined;
            resourceInputs["serverIp"] = args ? args.serverIp : undefined;
            resourceInputs["serverType"] = args ? args.serverType : undefined;
            resourceInputs["weight"] = args ? args.weight : undefined;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["zoneId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServerGroupServerAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerGroupServerAttachment resources.
 */
export interface ServerGroupServerAttachmentState {
    /**
     * The description of the servers.
     * The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (\_), and hyphens (-).
     */
    description?: pulumi.Input<string>;
    /**
     * The port that is used by the backend server. Valid values: `1` to `65535`.
     */
    port?: pulumi.Input<number>;
    /**
     * The ID of the server group.
     */
    serverGroupId?: pulumi.Input<string>;
    /**
     * The ID of the server.
     *
     * - If the server group type is `Instance`, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. These backend servers are specified by `Ecs`, `Eni`, or `Eci`.
     * - If the server group type is `Ip`, set the ServerId parameter to an IP address.
     */
    serverId?: pulumi.Input<string>;
    /**
     * The IP address of the server. If the server group type is `Ip`, set the ServerId parameter to an IP address.
     */
    serverIp?: pulumi.Input<string>;
    /**
     * The type of the backend server. Valid values:
     *
     * - `Ecs`: ECS instance
     * - `Eni`: ENI
     * - `Eci`: an elastic container instance
     * - `Ip`: an IP address
     */
    serverType?: pulumi.Input<string>;
    /**
     * The status of the resource
     */
    status?: pulumi.Input<string>;
    /**
     * The weight of the backend server. Valid values: `0` to `100`. Default value: `100`. If the weight of a backend server is set to `0`, no requests are forwarded to the backend server.
     */
    weight?: pulumi.Input<number>;
    /**
     * The zone ID of the server.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServerGroupServerAttachment resource.
 */
export interface ServerGroupServerAttachmentArgs {
    /**
     * The description of the servers.
     * The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (\_), and hyphens (-).
     */
    description?: pulumi.Input<string>;
    /**
     * The port that is used by the backend server. Valid values: `1` to `65535`.
     */
    port?: pulumi.Input<number>;
    /**
     * The ID of the server group.
     */
    serverGroupId: pulumi.Input<string>;
    /**
     * The ID of the server.
     *
     * - If the server group type is `Instance`, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. These backend servers are specified by `Ecs`, `Eni`, or `Eci`.
     * - If the server group type is `Ip`, set the ServerId parameter to an IP address.
     */
    serverId: pulumi.Input<string>;
    /**
     * The IP address of the server. If the server group type is `Ip`, set the ServerId parameter to an IP address.
     */
    serverIp?: pulumi.Input<string>;
    /**
     * The type of the backend server. Valid values:
     *
     * - `Ecs`: ECS instance
     * - `Eni`: ENI
     * - `Eci`: an elastic container instance
     * - `Ip`: an IP address
     */
    serverType: pulumi.Input<string>;
    /**
     * The weight of the backend server. Valid values: `0` to `100`. Default value: `100`. If the weight of a backend server is set to `0`, no requests are forwarded to the backend server.
     */
    weight?: pulumi.Input<number>;
}
