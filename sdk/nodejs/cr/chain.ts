// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a CR Chain resource.
 *
 * For information about CR Chain and how to use it, see [What is Chain](https://www.alibabacloud.com/help/en/acr/developer-reference/api-cr-2018-12-01-createchain).
 *
 * > **NOTE:** Available since v1.161.0.
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
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-example";
 * const _default = new random.index.Integer("default", {
 *     min: 100000,
 *     max: 999999,
 * });
 * const defaultRegistryEnterpriseInstance = new alicloud.cr.RegistryEnterpriseInstance("default", {
 *     paymentType: "Subscription",
 *     period: 1,
 *     renewPeriod: 0,
 *     renewalStatus: "ManualRenewal",
 *     instanceType: "Advanced",
 *     instanceName: `${name}-${_default.result}`,
 * });
 * const defaultRegistryEnterpriseNamespace = new alicloud.cs.RegistryEnterpriseNamespace("default", {
 *     instanceId: defaultRegistryEnterpriseInstance.id,
 *     name: `${name}-${_default.result}`,
 *     autoCreate: false,
 *     defaultVisibility: "PUBLIC",
 * });
 * const defaultRegistryEnterpriseRepo = new alicloud.cs.RegistryEnterpriseRepo("default", {
 *     instanceId: defaultRegistryEnterpriseInstance.id,
 *     namespace: defaultRegistryEnterpriseNamespace.name,
 *     name: `${name}-${_default.result}`,
 *     summary: "this is summary of my new repo",
 *     repoType: "PUBLIC",
 *     detail: "this is a public repo",
 * });
 * const defaultChain = new alicloud.cr.Chain("default", {
 *     chainConfigs: [{
 *         nodes: [
 *             {
 *                 nodeConfigs: [{
 *                     denyPolicies: [{}],
 *                 }],
 *                 enable: true,
 *                 nodeName: "DOCKER_IMAGE_BUILD",
 *             },
 *             {
 *                 nodeConfigs: [{
 *                     denyPolicies: [{}],
 *                 }],
 *                 enable: true,
 *                 nodeName: "DOCKER_IMAGE_PUSH",
 *             },
 *             {
 *                 enable: true,
 *                 nodeName: "VULNERABILITY_SCANNING",
 *                 nodeConfigs: [{
 *                     denyPolicies: [{
 *                         issueLevel: "MEDIUM",
 *                         issueCount: "1",
 *                         action: "BLOCK_DELETE_TAG",
 *                         logic: "AND",
 *                     }],
 *                 }],
 *             },
 *             {
 *                 nodeConfigs: [{
 *                     denyPolicies: [{}],
 *                 }],
 *                 enable: true,
 *                 nodeName: "ACTIVATE_REPLICATION",
 *             },
 *             {
 *                 nodeConfigs: [{
 *                     denyPolicies: [{}],
 *                 }],
 *                 enable: true,
 *                 nodeName: "TRIGGER",
 *             },
 *             {
 *                 nodeConfigs: [{
 *                     denyPolicies: [{}],
 *                 }],
 *                 enable: false,
 *                 nodeName: "SNAPSHOT",
 *             },
 *             {
 *                 nodeConfigs: [{
 *                     denyPolicies: [{}],
 *                 }],
 *                 enable: false,
 *                 nodeName: "TRIGGER_SNAPSHOT",
 *             },
 *         ],
 *         routers: [
 *             {
 *                 froms: [{
 *                     nodeName: "DOCKER_IMAGE_BUILD",
 *                 }],
 *                 tos: [{
 *                     nodeName: "DOCKER_IMAGE_PUSH",
 *                 }],
 *             },
 *             {
 *                 froms: [{
 *                     nodeName: "DOCKER_IMAGE_PUSH",
 *                 }],
 *                 tos: [{
 *                     nodeName: "VULNERABILITY_SCANNING",
 *                 }],
 *             },
 *             {
 *                 froms: [{
 *                     nodeName: "VULNERABILITY_SCANNING",
 *                 }],
 *                 tos: [{
 *                     nodeName: "ACTIVATE_REPLICATION",
 *                 }],
 *             },
 *             {
 *                 froms: [{
 *                     nodeName: "ACTIVATE_REPLICATION",
 *                 }],
 *                 tos: [{
 *                     nodeName: "TRIGGER",
 *                 }],
 *             },
 *             {
 *                 froms: [{
 *                     nodeName: "VULNERABILITY_SCANNING",
 *                 }],
 *                 tos: [{
 *                     nodeName: "SNAPSHOT",
 *                 }],
 *             },
 *             {
 *                 froms: [{
 *                     nodeName: "SNAPSHOT",
 *                 }],
 *                 tos: [{
 *                     nodeName: "TRIGGER_SNAPSHOT",
 *                 }],
 *             },
 *         ],
 *     }],
 *     chainName: `${name}-${_default.result}`,
 *     description: name,
 *     instanceId: defaultRegistryEnterpriseNamespace.instanceId,
 *     repoName: defaultRegistryEnterpriseRepo.name,
 *     repoNamespaceName: defaultRegistryEnterpriseNamespace.name,
 * });
 * ```
 *
 * ## Import
 *
 * CR Chain can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cr/chain:Chain example <instance_id>:<chain_id>
 * ```
 */
export class Chain extends pulumi.CustomResource {
    /**
     * Get an existing Chain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ChainState, opts?: pulumi.CustomResourceOptions): Chain {
        return new Chain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cr/chain:Chain';

    /**
     * Returns true if the given object is an instance of Chain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Chain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Chain.__pulumiType;
    }

    /**
     * The configuration of delivery chain. See `chainConfig` below. **NOTE:** This parameter must specify the correct value, otherwise the created resource will be incorrect.
     */
    public readonly chainConfigs!: pulumi.Output<outputs.cr.ChainChainConfig[] | undefined>;
    /**
     * Delivery chain ID.
     */
    public /*out*/ readonly chainId!: pulumi.Output<string>;
    /**
     * The name of delivery chain. The length of the name is 1-64 characters, lowercase English letters and numbers, and the separators "_", "-", "." can be used, noted that the separator cannot be at the first or last position.
     */
    public readonly chainName!: pulumi.Output<string>;
    /**
     * The description delivery chain.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The ID of CR Enterprise Edition instance.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The name of CR Enterprise Edition repository. **NOTE:** This parameter must specify a correct value, otherwise the created resource will be incorrect.
     */
    public readonly repoName!: pulumi.Output<string | undefined>;
    /**
     * The name of CR Enterprise Edition namespace. **NOTE:** This parameter must specify the correct value, otherwise the created resource will be incorrect.
     */
    public readonly repoNamespaceName!: pulumi.Output<string | undefined>;

    /**
     * Create a Chain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ChainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ChainArgs | ChainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ChainState | undefined;
            resourceInputs["chainConfigs"] = state ? state.chainConfigs : undefined;
            resourceInputs["chainId"] = state ? state.chainId : undefined;
            resourceInputs["chainName"] = state ? state.chainName : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["repoName"] = state ? state.repoName : undefined;
            resourceInputs["repoNamespaceName"] = state ? state.repoNamespaceName : undefined;
        } else {
            const args = argsOrState as ChainArgs | undefined;
            if ((!args || args.chainName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'chainName'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            resourceInputs["chainConfigs"] = args ? args.chainConfigs : undefined;
            resourceInputs["chainName"] = args ? args.chainName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["repoName"] = args ? args.repoName : undefined;
            resourceInputs["repoNamespaceName"] = args ? args.repoNamespaceName : undefined;
            resourceInputs["chainId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Chain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Chain resources.
 */
export interface ChainState {
    /**
     * The configuration of delivery chain. See `chainConfig` below. **NOTE:** This parameter must specify the correct value, otherwise the created resource will be incorrect.
     */
    chainConfigs?: pulumi.Input<pulumi.Input<inputs.cr.ChainChainConfig>[]>;
    /**
     * Delivery chain ID.
     */
    chainId?: pulumi.Input<string>;
    /**
     * The name of delivery chain. The length of the name is 1-64 characters, lowercase English letters and numbers, and the separators "_", "-", "." can be used, noted that the separator cannot be at the first or last position.
     */
    chainName?: pulumi.Input<string>;
    /**
     * The description delivery chain.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of CR Enterprise Edition instance.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The name of CR Enterprise Edition repository. **NOTE:** This parameter must specify a correct value, otherwise the created resource will be incorrect.
     */
    repoName?: pulumi.Input<string>;
    /**
     * The name of CR Enterprise Edition namespace. **NOTE:** This parameter must specify the correct value, otherwise the created resource will be incorrect.
     */
    repoNamespaceName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Chain resource.
 */
export interface ChainArgs {
    /**
     * The configuration of delivery chain. See `chainConfig` below. **NOTE:** This parameter must specify the correct value, otherwise the created resource will be incorrect.
     */
    chainConfigs?: pulumi.Input<pulumi.Input<inputs.cr.ChainChainConfig>[]>;
    /**
     * The name of delivery chain. The length of the name is 1-64 characters, lowercase English letters and numbers, and the separators "_", "-", "." can be used, noted that the separator cannot be at the first or last position.
     */
    chainName: pulumi.Input<string>;
    /**
     * The description delivery chain.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of CR Enterprise Edition instance.
     */
    instanceId: pulumi.Input<string>;
    /**
     * The name of CR Enterprise Edition repository. **NOTE:** This parameter must specify a correct value, otherwise the created resource will be incorrect.
     */
    repoName?: pulumi.Input<string>;
    /**
     * The name of CR Enterprise Edition namespace. **NOTE:** This parameter must specify the correct value, otherwise the created resource will be incorrect.
     */
    repoNamespaceName?: pulumi.Input<string>;
}
