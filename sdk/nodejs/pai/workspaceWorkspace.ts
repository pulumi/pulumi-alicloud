// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a P A I Workspace Workspace resource.
 *
 * For information about P A I Workspace Workspace and how to use it, see [What is Workspace](https://www.alibabacloud.com/help/en/).
 *
 * > **NOTE:** Available since v1.233.0.
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
 * const name = config.get("name") || "terraform_example";
 * const _default = new alicloud.pai.WorkspaceWorkspace("default", {
 *     description: name,
 *     workspaceName: name,
 *     displayName: name,
 *     envTypes: ["prod"],
 * });
 * ```
 *
 * ## Import
 *
 * P A I Workspace Workspace can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:pai/workspaceWorkspace:WorkspaceWorkspace example <id>
 * ```
 */
export class WorkspaceWorkspace extends pulumi.CustomResource {
    /**
     * Get an existing WorkspaceWorkspace resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkspaceWorkspaceState, opts?: pulumi.CustomResourceOptions): WorkspaceWorkspace {
        return new WorkspaceWorkspace(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:pai/workspaceWorkspace:WorkspaceWorkspace';

    /**
     * Returns true if the given object is an instance of WorkspaceWorkspace.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkspaceWorkspace {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkspaceWorkspace.__pulumiType;
    }

    /**
     * The UTC time when the workspace is created. The time format is ISO8601.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Workspace description, no more than 80 characters.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * Environments contained in the workspace:
     * - Simple mode only production environment (prod).
     * - Standard mode includes development environment (dev) and production environment (prod).
     */
    public readonly envTypes!: pulumi.Output<string[]>;
    /**
     * Workspace state, possible values:
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The workspace name. The format is as follows:
     * - 3 to 23 characters in length and can contain letters, underscores, or numbers.
     * - Must start with a large or small letter.
     * - Unique in the current region.
     */
    public readonly workspaceName!: pulumi.Output<string>;

    /**
     * Create a WorkspaceWorkspace resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkspaceWorkspaceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkspaceWorkspaceArgs | WorkspaceWorkspaceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkspaceWorkspaceState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["envTypes"] = state ? state.envTypes : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["workspaceName"] = state ? state.workspaceName : undefined;
        } else {
            const args = argsOrState as WorkspaceWorkspaceArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.envTypes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'envTypes'");
            }
            if ((!args || args.workspaceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workspaceName'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["envTypes"] = args ? args.envTypes : undefined;
            resourceInputs["workspaceName"] = args ? args.workspaceName : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkspaceWorkspace.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkspaceWorkspace resources.
 */
export interface WorkspaceWorkspaceState {
    /**
     * The UTC time when the workspace is created. The time format is ISO8601.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Workspace description, no more than 80 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Environments contained in the workspace:
     * - Simple mode only production environment (prod).
     * - Standard mode includes development environment (dev) and production environment (prod).
     */
    envTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Workspace state, possible values:
     */
    status?: pulumi.Input<string>;
    /**
     * The workspace name. The format is as follows:
     * - 3 to 23 characters in length and can contain letters, underscores, or numbers.
     * - Must start with a large or small letter.
     * - Unique in the current region.
     */
    workspaceName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkspaceWorkspace resource.
 */
export interface WorkspaceWorkspaceArgs {
    /**
     * Workspace description, no more than 80 characters.
     */
    description: pulumi.Input<string>;
    /**
     * It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Environments contained in the workspace:
     * - Simple mode only production environment (prod).
     * - Standard mode includes development environment (dev) and production environment (prod).
     */
    envTypes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The workspace name. The format is as follows:
     * - 3 to 23 characters in length and can contain letters, underscores, or numbers.
     * - Must start with a large or small letter.
     * - Unique in the current region.
     */
    workspaceName: pulumi.Input<string>;
}