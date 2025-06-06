// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a VPC Network Acl resource. Network Access Control List (ACL) is a Network Access Control function in VPC. You can customize the network ACL rules and bind the network ACL to the switch to control the traffic of ECS instances in the switch.
 *
 * For information about VPC Network Acl and how to use it, see [What is Network Acl](https://www.alibabacloud.com/help/en/ens/latest/createnetworkacl).
 *
 * > **NOTE:** Available since v1.43.0.
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
 * const _default = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const example = new alicloud.vpc.Network("example", {
 *     vpcName: name,
 *     cidrBlock: "10.4.0.0/16",
 * });
 * const exampleSwitch = new alicloud.vpc.Switch("example", {
 *     vswitchName: name,
 *     cidrBlock: "10.4.0.0/24",
 *     vpcId: example.id,
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 * });
 * const exampleNetworkAcl = new alicloud.vpc.NetworkAcl("example", {
 *     vpcId: example.id,
 *     networkAclName: name,
 *     description: name,
 *     ingressAclEntries: [{
 *         description: `${name}-ingress`,
 *         networkAclEntryName: `${name}-ingress`,
 *         sourceCidrIp: "10.0.0.0/24",
 *         policy: "accept",
 *         port: "20/80",
 *         protocol: "tcp",
 *     }],
 *     egressAclEntries: [{
 *         description: `${name}-egress`,
 *         networkAclEntryName: `${name}-egress`,
 *         destinationCidrIp: "10.0.0.0/24",
 *         policy: "accept",
 *         port: "20/80",
 *         protocol: "tcp",
 *     }],
 *     resources: [{
 *         resourceId: exampleSwitch.id,
 *         resourceType: "VSwitch",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * VPC Network Acl can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:vpc/networkAcl:NetworkAcl example <id>
 * ```
 */
export class NetworkAcl extends pulumi.CustomResource {
    /**
     * Get an existing NetworkAcl resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkAclState, opts?: pulumi.CustomResourceOptions): NetworkAcl {
        return new NetworkAcl(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/networkAcl:NetworkAcl';

    /**
     * Returns true if the given object is an instance of NetworkAcl.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkAcl {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkAcl.__pulumiType;
    }

    /**
     * The creation time of the resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The description of the network ACL.  The description must be 1 to 256 characters in length and cannot start with http:// or https.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Out direction rule information. See `egressAclEntries` below.
     */
    public readonly egressAclEntries!: pulumi.Output<outputs.vpc.NetworkAclEgressAclEntry[]>;
    /**
     * Inward direction rule information. See `ingressAclEntries` below.
     */
    public readonly ingressAclEntries!: pulumi.Output<outputs.vpc.NetworkAclIngressAclEntry[]>;
    /**
     * . Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
     *
     * @deprecated Field 'name' has been deprecated since provider version 1.122.0. New field 'network_acl_name' instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the network ACL.  The name must be 1 to 128 characters in length and cannot start with http:// or https.
     */
    public readonly networkAclName!: pulumi.Output<string>;
    /**
     * The associated resource. See `resources` below.
     */
    public readonly resources!: pulumi.Output<outputs.vpc.NetworkAclResource[]>;
    /**
     * SOURCE NetworkAcl specified by CopyNetworkAclEntries.
     */
    public readonly sourceNetworkAclId!: pulumi.Output<string | undefined>;
    /**
     * The state of the network ACL.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The tags of this resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The ID of the associated VPC.
     *
     * The following arguments will be discarded. Please use new fields as soon as possible:
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a NetworkAcl resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkAclArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkAclArgs | NetworkAclState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkAclState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["egressAclEntries"] = state ? state.egressAclEntries : undefined;
            resourceInputs["ingressAclEntries"] = state ? state.ingressAclEntries : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkAclName"] = state ? state.networkAclName : undefined;
            resourceInputs["resources"] = state ? state.resources : undefined;
            resourceInputs["sourceNetworkAclId"] = state ? state.sourceNetworkAclId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as NetworkAclArgs | undefined;
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["egressAclEntries"] = args ? args.egressAclEntries : undefined;
            resourceInputs["ingressAclEntries"] = args ? args.ingressAclEntries : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkAclName"] = args ? args.networkAclName : undefined;
            resourceInputs["resources"] = args ? args.resources : undefined;
            resourceInputs["sourceNetworkAclId"] = args ? args.sourceNetworkAclId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkAcl.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkAcl resources.
 */
export interface NetworkAclState {
    /**
     * The creation time of the resource.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The description of the network ACL.  The description must be 1 to 256 characters in length and cannot start with http:// or https.
     */
    description?: pulumi.Input<string>;
    /**
     * Out direction rule information. See `egressAclEntries` below.
     */
    egressAclEntries?: pulumi.Input<pulumi.Input<inputs.vpc.NetworkAclEgressAclEntry>[]>;
    /**
     * Inward direction rule information. See `ingressAclEntries` below.
     */
    ingressAclEntries?: pulumi.Input<pulumi.Input<inputs.vpc.NetworkAclIngressAclEntry>[]>;
    /**
     * . Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
     *
     * @deprecated Field 'name' has been deprecated since provider version 1.122.0. New field 'network_acl_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the network ACL.  The name must be 1 to 128 characters in length and cannot start with http:// or https.
     */
    networkAclName?: pulumi.Input<string>;
    /**
     * The associated resource. See `resources` below.
     */
    resources?: pulumi.Input<pulumi.Input<inputs.vpc.NetworkAclResource>[]>;
    /**
     * SOURCE NetworkAcl specified by CopyNetworkAclEntries.
     */
    sourceNetworkAclId?: pulumi.Input<string>;
    /**
     * The state of the network ACL.
     */
    status?: pulumi.Input<string>;
    /**
     * The tags of this resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the associated VPC.
     *
     * The following arguments will be discarded. Please use new fields as soon as possible:
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NetworkAcl resource.
 */
export interface NetworkAclArgs {
    /**
     * The description of the network ACL.  The description must be 1 to 256 characters in length and cannot start with http:// or https.
     */
    description?: pulumi.Input<string>;
    /**
     * Out direction rule information. See `egressAclEntries` below.
     */
    egressAclEntries?: pulumi.Input<pulumi.Input<inputs.vpc.NetworkAclEgressAclEntry>[]>;
    /**
     * Inward direction rule information. See `ingressAclEntries` below.
     */
    ingressAclEntries?: pulumi.Input<pulumi.Input<inputs.vpc.NetworkAclIngressAclEntry>[]>;
    /**
     * . Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
     *
     * @deprecated Field 'name' has been deprecated since provider version 1.122.0. New field 'network_acl_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the network ACL.  The name must be 1 to 128 characters in length and cannot start with http:// or https.
     */
    networkAclName?: pulumi.Input<string>;
    /**
     * The associated resource. See `resources` below.
     */
    resources?: pulumi.Input<pulumi.Input<inputs.vpc.NetworkAclResource>[]>;
    /**
     * SOURCE NetworkAcl specified by CopyNetworkAclEntries.
     */
    sourceNetworkAclId?: pulumi.Input<string>;
    /**
     * The tags of this resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the associated VPC.
     *
     * The following arguments will be discarded. Please use new fields as soon as possible:
     */
    vpcId: pulumi.Input<string>;
}
