// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a RAM User Group Attachment resource.
 *
 * For information about RAM User Group Attachment and how to use it, see [What is User Group Attachment](https://next.api.alibabacloud.com/document/Ram/2015-05-01/AddUserToGroup).
 *
 * > **NOTE:** Available since v1.245.0.
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
 * const _default = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const defaultUser = new alicloud.ram.User("default", {
 *     name: `terraform-example-${_default.result}`,
 *     displayName: `terraform-example-${_default.result}`,
 * });
 * const defaultGroup = new alicloud.ram.Group("default", {name: `terraform-example-${_default.result}`});
 * const defaultUserGroupAttachment = new alicloud.ram.UserGroupAttachment("default", {
 *     groupName: defaultGroup.id,
 *     userName: defaultUser.name,
 * });
 * ```
 *
 * ## Import
 *
 * RAM User Group Attachment can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:ram/userGroupAttachment:UserGroupAttachment example <group_name>:<user_name>
 * ```
 */
export class UserGroupAttachment extends pulumi.CustomResource {
    /**
     * Get an existing UserGroupAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserGroupAttachmentState, opts?: pulumi.CustomResourceOptions): UserGroupAttachment {
        return new UserGroupAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ram/userGroupAttachment:UserGroupAttachment';

    /**
     * Returns true if the given object is an instance of UserGroupAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserGroupAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserGroupAttachment.__pulumiType;
    }

    /**
     * The name of group.
     */
    public readonly groupName!: pulumi.Output<string>;
    /**
     * The name of user.
     */
    public readonly userName!: pulumi.Output<string>;

    /**
     * Create a UserGroupAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserGroupAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserGroupAttachmentArgs | UserGroupAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserGroupAttachmentState | undefined;
            resourceInputs["groupName"] = state ? state.groupName : undefined;
            resourceInputs["userName"] = state ? state.userName : undefined;
        } else {
            const args = argsOrState as UserGroupAttachmentArgs | undefined;
            if ((!args || args.groupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupName'");
            }
            if ((!args || args.userName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userName'");
            }
            resourceInputs["groupName"] = args ? args.groupName : undefined;
            resourceInputs["userName"] = args ? args.userName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UserGroupAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserGroupAttachment resources.
 */
export interface UserGroupAttachmentState {
    /**
     * The name of group.
     */
    groupName?: pulumi.Input<string>;
    /**
     * The name of user.
     */
    userName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserGroupAttachment resource.
 */
export interface UserGroupAttachmentArgs {
    /**
     * The name of group.
     */
    groupName: pulumi.Input<string>;
    /**
     * The name of user.
     */
    userName: pulumi.Input<string>;
}
