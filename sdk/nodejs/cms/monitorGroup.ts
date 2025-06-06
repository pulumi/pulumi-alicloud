// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Monitor Service Monitor Group resource.
 *
 * For information about Cloud Monitor Service Monitor Group and how to use it, see [What is Monitor Group](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createmonitorgroup).
 *
 * > **NOTE:** Available since v1.113.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.cms.MonitorGroup("example", {monitorGroupName: "tf-example-accmonitorgroup"});
 * const default2 = new alicloud.cms.MonitorGroup("default2", {
 *     contactGroups: ["your_contact_groups"],
 *     resourceGroupId: "your_resource_group_id",
 *     resourceGroupName: "resource_group_name",
 *     tags: {
 *         Created: "TF",
 *         For: "Acceptance-example",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Monitor Service Monitor Group can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cms/monitorGroup:MonitorGroup example <id>
 * ```
 */
export class MonitorGroup extends pulumi.CustomResource {
    /**
     * Get an existing MonitorGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MonitorGroupState, opts?: pulumi.CustomResourceOptions): MonitorGroup {
        return new MonitorGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cms/monitorGroup:MonitorGroup';

    /**
     * Returns true if the given object is an instance of MonitorGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MonitorGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MonitorGroup.__pulumiType;
    }

    /**
     * The alert group to which alert notifications will be sent.
     */
    public readonly contactGroups!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the application group.
     */
    public readonly monitorGroupName!: pulumi.Output<string>;
    /**
     * The ID of the resource group.
     */
    public readonly resourceGroupId!: pulumi.Output<string | undefined>;
    /**
     * The name of the resource group.
     */
    public readonly resourceGroupName!: pulumi.Output<string | undefined>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a MonitorGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: MonitorGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MonitorGroupArgs | MonitorGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MonitorGroupState | undefined;
            resourceInputs["contactGroups"] = state ? state.contactGroups : undefined;
            resourceInputs["monitorGroupName"] = state ? state.monitorGroupName : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as MonitorGroupArgs | undefined;
            resourceInputs["contactGroups"] = args ? args.contactGroups : undefined;
            resourceInputs["monitorGroupName"] = args ? args.monitorGroupName : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MonitorGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MonitorGroup resources.
 */
export interface MonitorGroupState {
    /**
     * The alert group to which alert notifications will be sent.
     */
    contactGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the application group.
     */
    monitorGroupName?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The name of the resource group.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a MonitorGroup resource.
 */
export interface MonitorGroupArgs {
    /**
     * The alert group to which alert notifications will be sent.
     */
    contactGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the application group.
     */
    monitorGroupName?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The name of the resource group.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
