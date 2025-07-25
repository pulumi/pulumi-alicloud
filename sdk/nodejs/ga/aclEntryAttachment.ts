// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Global Accelerator (GA) Acl Entry Attachment resource.
 *
 * For information about Global Accelerator (GA) Acl Entry Attachment and how to use it, see [What is Acl Entry Attachment](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-addentriestoacl).
 *
 * > **NOTE:** Available since v1.190.0.
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
 * const name = config.get("name") || "terraform-example";
 * const _default = new alicloud.ga.Acl("default", {
 *     addressIpVersion: "IPv4",
 *     aclName: name,
 * });
 * const defaultAclEntryAttachment = new alicloud.ga.AclEntryAttachment("default", {
 *     aclId: _default.id,
 *     entry: "192.168.1.1/32",
 *     entryDescription: name,
 * });
 * ```
 *
 * ## Import
 *
 * Global Accelerator (GA) Acl Entry Attachment can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:ga/aclEntryAttachment:AclEntryAttachment example <acl_id>:<entry>
 * ```
 */
export class AclEntryAttachment extends pulumi.CustomResource {
    /**
     * Get an existing AclEntryAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AclEntryAttachmentState, opts?: pulumi.CustomResourceOptions): AclEntryAttachment {
        return new AclEntryAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ga/aclEntryAttachment:AclEntryAttachment';

    /**
     * Returns true if the given object is an instance of AclEntryAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AclEntryAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AclEntryAttachment.__pulumiType;
    }

    /**
     * The ID of the Acl.
     */
    public readonly aclId!: pulumi.Output<string>;
    /**
     * The entry (IP address or CIDR block) that you want to add.
     */
    public readonly entry!: pulumi.Output<string>;
    /**
     * The description of the entry. The description must be `1` to `256` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
     */
    public readonly entryDescription!: pulumi.Output<string | undefined>;
    /**
     * The status of the Acl Entry Attachment.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a AclEntryAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AclEntryAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AclEntryAttachmentArgs | AclEntryAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AclEntryAttachmentState | undefined;
            resourceInputs["aclId"] = state ? state.aclId : undefined;
            resourceInputs["entry"] = state ? state.entry : undefined;
            resourceInputs["entryDescription"] = state ? state.entryDescription : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as AclEntryAttachmentArgs | undefined;
            if ((!args || args.aclId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aclId'");
            }
            if ((!args || args.entry === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entry'");
            }
            resourceInputs["aclId"] = args ? args.aclId : undefined;
            resourceInputs["entry"] = args ? args.entry : undefined;
            resourceInputs["entryDescription"] = args ? args.entryDescription : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AclEntryAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AclEntryAttachment resources.
 */
export interface AclEntryAttachmentState {
    /**
     * The ID of the Acl.
     */
    aclId?: pulumi.Input<string>;
    /**
     * The entry (IP address or CIDR block) that you want to add.
     */
    entry?: pulumi.Input<string>;
    /**
     * The description of the entry. The description must be `1` to `256` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
     */
    entryDescription?: pulumi.Input<string>;
    /**
     * The status of the Acl Entry Attachment.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AclEntryAttachment resource.
 */
export interface AclEntryAttachmentArgs {
    /**
     * The ID of the Acl.
     */
    aclId: pulumi.Input<string>;
    /**
     * The entry (IP address or CIDR block) that you want to add.
     */
    entry: pulumi.Input<string>;
    /**
     * The description of the entry. The description must be `1` to `256` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
     */
    entryDescription?: pulumi.Input<string>;
}
