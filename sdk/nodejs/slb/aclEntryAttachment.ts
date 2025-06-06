// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * > **NOTE:** Available since v1.162.0.
 *
 * > **NOTE:** The maximum number of entries per acl is 300.
 *
 * For information about acl entry attachment and how to use it, see [Configure an acl entry](https://www.alibabacloud.com/help/en/doc-detail/70023.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const attachment = new alicloud.slb.Acl("attachment", {
 *     name: "forSlbAclEntryAttachment",
 *     ipVersion: "ipv4",
 * });
 * const attachmentAclEntryAttachment = new alicloud.slb.AclEntryAttachment("attachment", {
 *     aclId: attachment.id,
 *     entry: "168.10.10.0/24",
 *     comment: "second",
 * });
 * ```
 *
 * ## Import
 *
 * Acl entry attachment can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:slb/aclEntryAttachment:AclEntryAttachment example <acl_id>:<entry>
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
    public static readonly __pulumiType = 'alicloud:slb/aclEntryAttachment:AclEntryAttachment';

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
     * The comment of the entry.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The CIDR blocks.
     */
    public readonly entry!: pulumi.Output<string>;

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
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["entry"] = state ? state.entry : undefined;
        } else {
            const args = argsOrState as AclEntryAttachmentArgs | undefined;
            if ((!args || args.aclId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aclId'");
            }
            if ((!args || args.entry === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entry'");
            }
            resourceInputs["aclId"] = args ? args.aclId : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["entry"] = args ? args.entry : undefined;
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
     * The comment of the entry.
     */
    comment?: pulumi.Input<string>;
    /**
     * The CIDR blocks.
     */
    entry?: pulumi.Input<string>;
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
     * The comment of the entry.
     */
    comment?: pulumi.Input<string>;
    /**
     * The CIDR blocks.
     */
    entry: pulumi.Input<string>;
}
