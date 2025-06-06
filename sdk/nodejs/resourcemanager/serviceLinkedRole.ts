// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Resource Manager Service Linked Role.
 *
 * For information about Resource Manager Service Linked Role and how to use it, see [What is Service Linked Role.](https://www.alibabacloud.com/help/en/doc-detail/171226.htm).
 *
 * > **NOTE:** Available since v1.157.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.resourcemanager.ServiceLinkedRole("default", {serviceName: "ops.elasticsearch.aliyuncs.com"});
 * ```
 *
 * ## Import
 *
 * Resource Manager Service Linked Role can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:resourcemanager/serviceLinkedRole:ServiceLinkedRole default <service_name>:<role_name>
 * ```
 */
export class ServiceLinkedRole extends pulumi.CustomResource {
    /**
     * Get an existing ServiceLinkedRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceLinkedRoleState, opts?: pulumi.CustomResourceOptions): ServiceLinkedRole {
        return new ServiceLinkedRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:resourcemanager/serviceLinkedRole:ServiceLinkedRole';

    /**
     * Returns true if the given object is an instance of ServiceLinkedRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceLinkedRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceLinkedRole.__pulumiType;
    }

    /**
     * The Alibaba Cloud Resource Name (ARN) of the role.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
     */
    public readonly customSuffix!: pulumi.Output<string | undefined>;
    /**
     * The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The ID of the role.
     */
    public /*out*/ readonly roleId!: pulumi.Output<string>;
    /**
     * The name of the role.
     */
    public /*out*/ readonly roleName!: pulumi.Output<string>;
    /**
     * The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
     */
    public readonly serviceName!: pulumi.Output<string>;

    /**
     * Create a ServiceLinkedRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceLinkedRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceLinkedRoleArgs | ServiceLinkedRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceLinkedRoleState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["customSuffix"] = state ? state.customSuffix : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["roleId"] = state ? state.roleId : undefined;
            resourceInputs["roleName"] = state ? state.roleName : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
        } else {
            const args = argsOrState as ServiceLinkedRoleArgs | undefined;
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            resourceInputs["customSuffix"] = args ? args.customSuffix : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["roleId"] = undefined /*out*/;
            resourceInputs["roleName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceLinkedRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceLinkedRole resources.
 */
export interface ServiceLinkedRoleState {
    /**
     * The Alibaba Cloud Resource Name (ARN) of the role.
     */
    arn?: pulumi.Input<string>;
    /**
     * The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
     */
    customSuffix?: pulumi.Input<string>;
    /**
     * The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the role.
     */
    roleId?: pulumi.Input<string>;
    /**
     * The name of the role.
     */
    roleName?: pulumi.Input<string>;
    /**
     * The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
     */
    serviceName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceLinkedRole resource.
 */
export interface ServiceLinkedRoleArgs {
    /**
     * The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
     */
    customSuffix?: pulumi.Input<string>;
    /**
     * The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
     */
    description?: pulumi.Input<string>;
    /**
     * The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
     */
    serviceName: pulumi.Input<string>;
}
