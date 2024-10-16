// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Container Registry Enterprise Edition Sync Rule resource.
 *
 * For information about Container Registry Enterprise Edition Sync Rule and how to use it, see [What is Sync Rule](https://www.alibabacloud.com/help/en/acr/developer-reference/api-cr-2018-12-01-createreposyncrule)
 *
 * > **NOTE:** Available since v1.90.0.
 *
 * > **NOTE:** You need to set your registry password in Container Registry Enterprise Edition console before use this resource.
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
 * const name = config.get("name") || "terraform-example";
 * const default = alicloud.getRegions({
 *     current: true,
 * });
 * const defaultInteger = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const source = new alicloud.cr.RegistryEnterpriseInstance("source", {
 *     paymentType: "Subscription",
 *     period: 1,
 *     renewPeriod: 0,
 *     renewalStatus: "ManualRenewal",
 *     instanceType: "Advanced",
 *     instanceName: `${name}-source-${defaultInteger.result}`,
 * });
 * const target = new alicloud.cr.RegistryEnterpriseInstance("target", {
 *     paymentType: "Subscription",
 *     period: 1,
 *     renewPeriod: 0,
 *     renewalStatus: "ManualRenewal",
 *     instanceType: "Advanced",
 *     instanceName: `${name}-target-${defaultInteger.result}`,
 * });
 * const sourceRegistryEnterpriseNamespace = new alicloud.cs.RegistryEnterpriseNamespace("source", {
 *     instanceId: source.id,
 *     name: `${name}-${defaultInteger.result}`,
 *     autoCreate: false,
 *     defaultVisibility: "PUBLIC",
 * });
 * const targetRegistryEnterpriseNamespace = new alicloud.cs.RegistryEnterpriseNamespace("target", {
 *     instanceId: target.id,
 *     name: `${name}-${defaultInteger.result}`,
 *     autoCreate: false,
 *     defaultVisibility: "PUBLIC",
 * });
 * const sourceRegistryEnterpriseRepo = new alicloud.cs.RegistryEnterpriseRepo("source", {
 *     instanceId: source.id,
 *     namespace: sourceRegistryEnterpriseNamespace.name,
 *     name: `${name}-${defaultInteger.result}`,
 *     summary: "this is summary of my new repo",
 *     repoType: "PUBLIC",
 * });
 * const targetRegistryEnterpriseRepo = new alicloud.cs.RegistryEnterpriseRepo("target", {
 *     instanceId: target.id,
 *     namespace: targetRegistryEnterpriseNamespace.name,
 *     name: `${name}-${defaultInteger.result}`,
 *     summary: "this is summary of my new repo",
 *     repoType: "PUBLIC",
 * });
 * const defaultRegistryEnterpriseSyncRule = new alicloud.cs.RegistryEnterpriseSyncRule("default", {
 *     instanceId: source.id,
 *     namespaceName: sourceRegistryEnterpriseNamespace.name,
 *     name: `${name}-${defaultInteger.result}`,
 *     targetInstanceId: target.id,
 *     targetNamespaceName: targetRegistryEnterpriseNamespace.name,
 *     targetRegionId: _default.then(_default => _default.regions?.[0]?.id),
 *     tagFilter: ".*",
 *     repoName: sourceRegistryEnterpriseRepo.name,
 *     targetRepoName: targetRegistryEnterpriseRepo.name,
 * });
 * ```
 *
 * ## Import
 *
 * Container Registry Enterprise Edition Sync Rule can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cs/registryEnterpriseSyncRule:RegistryEnterpriseSyncRule example <instance_id>:<namespace_name>:<rule_id>
 * ```
 */
export class RegistryEnterpriseSyncRule extends pulumi.CustomResource {
    /**
     * Get an existing RegistryEnterpriseSyncRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegistryEnterpriseSyncRuleState, opts?: pulumi.CustomResourceOptions): RegistryEnterpriseSyncRule {
        return new RegistryEnterpriseSyncRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cs/registryEnterpriseSyncRule:RegistryEnterpriseSyncRule';

    /**
     * Returns true if the given object is an instance of RegistryEnterpriseSyncRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RegistryEnterpriseSyncRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RegistryEnterpriseSyncRule.__pulumiType;
    }

    /**
     * The ID of the Container Registry Enterprise Edition source instance.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The name of the sync rule.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The namespace name of the source instance.
     */
    public readonly namespaceName!: pulumi.Output<string>;
    /**
     * The image repository name of the source instance.
     */
    public readonly repoName!: pulumi.Output<string | undefined>;
    /**
     * The ID of the sync rule.
     */
    public /*out*/ readonly ruleId!: pulumi.Output<string>;
    /**
     * The synchronization direction.
     */
    public /*out*/ readonly syncDirection!: pulumi.Output<string>;
    /**
     * The synchronization scope.
     */
    public /*out*/ readonly syncScope!: pulumi.Output<string>;
    /**
     * The regular expression used to filter image tags.
     */
    public readonly tagFilter!: pulumi.Output<string>;
    /**
     * The ID of the destination instance.
     */
    public readonly targetInstanceId!: pulumi.Output<string>;
    /**
     * The namespace name of the destination instance.
     */
    public readonly targetNamespaceName!: pulumi.Output<string>;
    /**
     * The region ID of the destination instance.
     */
    public readonly targetRegionId!: pulumi.Output<string>;
    /**
     * The image repository name of the destination instance.
     */
    public readonly targetRepoName!: pulumi.Output<string | undefined>;

    /**
     * Create a RegistryEnterpriseSyncRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegistryEnterpriseSyncRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RegistryEnterpriseSyncRuleArgs | RegistryEnterpriseSyncRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RegistryEnterpriseSyncRuleState | undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namespaceName"] = state ? state.namespaceName : undefined;
            resourceInputs["repoName"] = state ? state.repoName : undefined;
            resourceInputs["ruleId"] = state ? state.ruleId : undefined;
            resourceInputs["syncDirection"] = state ? state.syncDirection : undefined;
            resourceInputs["syncScope"] = state ? state.syncScope : undefined;
            resourceInputs["tagFilter"] = state ? state.tagFilter : undefined;
            resourceInputs["targetInstanceId"] = state ? state.targetInstanceId : undefined;
            resourceInputs["targetNamespaceName"] = state ? state.targetNamespaceName : undefined;
            resourceInputs["targetRegionId"] = state ? state.targetRegionId : undefined;
            resourceInputs["targetRepoName"] = state ? state.targetRepoName : undefined;
        } else {
            const args = argsOrState as RegistryEnterpriseSyncRuleArgs | undefined;
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.namespaceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'namespaceName'");
            }
            if ((!args || args.tagFilter === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tagFilter'");
            }
            if ((!args || args.targetInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetInstanceId'");
            }
            if ((!args || args.targetNamespaceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetNamespaceName'");
            }
            if ((!args || args.targetRegionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetRegionId'");
            }
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespaceName"] = args ? args.namespaceName : undefined;
            resourceInputs["repoName"] = args ? args.repoName : undefined;
            resourceInputs["tagFilter"] = args ? args.tagFilter : undefined;
            resourceInputs["targetInstanceId"] = args ? args.targetInstanceId : undefined;
            resourceInputs["targetNamespaceName"] = args ? args.targetNamespaceName : undefined;
            resourceInputs["targetRegionId"] = args ? args.targetRegionId : undefined;
            resourceInputs["targetRepoName"] = args ? args.targetRepoName : undefined;
            resourceInputs["ruleId"] = undefined /*out*/;
            resourceInputs["syncDirection"] = undefined /*out*/;
            resourceInputs["syncScope"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RegistryEnterpriseSyncRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RegistryEnterpriseSyncRule resources.
 */
export interface RegistryEnterpriseSyncRuleState {
    /**
     * The ID of the Container Registry Enterprise Edition source instance.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The name of the sync rule.
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace name of the source instance.
     */
    namespaceName?: pulumi.Input<string>;
    /**
     * The image repository name of the source instance.
     */
    repoName?: pulumi.Input<string>;
    /**
     * The ID of the sync rule.
     */
    ruleId?: pulumi.Input<string>;
    /**
     * The synchronization direction.
     */
    syncDirection?: pulumi.Input<string>;
    /**
     * The synchronization scope.
     */
    syncScope?: pulumi.Input<string>;
    /**
     * The regular expression used to filter image tags.
     */
    tagFilter?: pulumi.Input<string>;
    /**
     * The ID of the destination instance.
     */
    targetInstanceId?: pulumi.Input<string>;
    /**
     * The namespace name of the destination instance.
     */
    targetNamespaceName?: pulumi.Input<string>;
    /**
     * The region ID of the destination instance.
     */
    targetRegionId?: pulumi.Input<string>;
    /**
     * The image repository name of the destination instance.
     */
    targetRepoName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RegistryEnterpriseSyncRule resource.
 */
export interface RegistryEnterpriseSyncRuleArgs {
    /**
     * The ID of the Container Registry Enterprise Edition source instance.
     */
    instanceId: pulumi.Input<string>;
    /**
     * The name of the sync rule.
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace name of the source instance.
     */
    namespaceName: pulumi.Input<string>;
    /**
     * The image repository name of the source instance.
     */
    repoName?: pulumi.Input<string>;
    /**
     * The regular expression used to filter image tags.
     */
    tagFilter: pulumi.Input<string>;
    /**
     * The ID of the destination instance.
     */
    targetInstanceId: pulumi.Input<string>;
    /**
     * The namespace name of the destination instance.
     */
    targetNamespaceName: pulumi.Input<string>;
    /**
     * The region ID of the destination instance.
     */
    targetRegionId: pulumi.Input<string>;
    /**
     * The image repository name of the destination instance.
     */
    targetRepoName?: pulumi.Input<string>;
}
