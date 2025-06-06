// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Wafv3 Domain resource.
 *
 * For information about Wafv3 Domain and how to use it, see [What is Domain](https://www.alibabacloud.com/help/en/web-application-firewall/latest/api-waf-openapi-2021-10-01-createdomain).
 *
 * > **NOTE:** Available since v1.200.0.
 *
 * ## Import
 *
 * Wafv3 Domain can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:wafv3/domain:Domain example <instance_id>:<domain>
 * ```
 */
export class Domain extends pulumi.CustomResource {
    /**
     * Get an existing Domain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainState, opts?: pulumi.CustomResourceOptions): Domain {
        return new Domain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:wafv3/domain:Domain';

    /**
     * Returns true if the given object is an instance of Domain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Domain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Domain.__pulumiType;
    }

    /**
     * The access type of the WAF instance. Value: **share** (default): CNAME access.
     */
    public readonly accessType!: pulumi.Output<string | undefined>;
    /**
     * The name of the domain name to query.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * WAF instance ID
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * Configure listening information. See `listen` below.
     */
    public readonly listen!: pulumi.Output<outputs.wafv3.DomainListen>;
    /**
     * Configure forwarding information. See `redirect` below.
     */
    public readonly redirect!: pulumi.Output<outputs.wafv3.DomainRedirect>;
    /**
     * The ID of the resource group.
     */
    public /*out*/ readonly resourceManagerResourceGroupId!: pulumi.Output<string>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a Domain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainArgs | DomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainState | undefined;
            resourceInputs["accessType"] = state ? state.accessType : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["listen"] = state ? state.listen : undefined;
            resourceInputs["redirect"] = state ? state.redirect : undefined;
            resourceInputs["resourceManagerResourceGroupId"] = state ? state.resourceManagerResourceGroupId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as DomainArgs | undefined;
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.listen === undefined) && !opts.urn) {
                throw new Error("Missing required property 'listen'");
            }
            if ((!args || args.redirect === undefined) && !opts.urn) {
                throw new Error("Missing required property 'redirect'");
            }
            resourceInputs["accessType"] = args ? args.accessType : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["listen"] = args ? args.listen : undefined;
            resourceInputs["redirect"] = args ? args.redirect : undefined;
            resourceInputs["resourceManagerResourceGroupId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Domain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Domain resources.
 */
export interface DomainState {
    /**
     * The access type of the WAF instance. Value: **share** (default): CNAME access.
     */
    accessType?: pulumi.Input<string>;
    /**
     * The name of the domain name to query.
     */
    domain?: pulumi.Input<string>;
    /**
     * WAF instance ID
     */
    instanceId?: pulumi.Input<string>;
    /**
     * Configure listening information. See `listen` below.
     */
    listen?: pulumi.Input<inputs.wafv3.DomainListen>;
    /**
     * Configure forwarding information. See `redirect` below.
     */
    redirect?: pulumi.Input<inputs.wafv3.DomainRedirect>;
    /**
     * The ID of the resource group.
     */
    resourceManagerResourceGroupId?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Domain resource.
 */
export interface DomainArgs {
    /**
     * The access type of the WAF instance. Value: **share** (default): CNAME access.
     */
    accessType?: pulumi.Input<string>;
    /**
     * The name of the domain name to query.
     */
    domain: pulumi.Input<string>;
    /**
     * WAF instance ID
     */
    instanceId: pulumi.Input<string>;
    /**
     * Configure listening information. See `listen` below.
     */
    listen: pulumi.Input<inputs.wafv3.DomainListen>;
    /**
     * Configure forwarding information. See `redirect` below.
     */
    redirect: pulumi.Input<inputs.wafv3.DomainRedirect>;
}
