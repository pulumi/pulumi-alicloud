// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a EBS Enterprise Snapshot Policy Attachment resource. Enterprise-level snapshot policy cloud disk binding relationship.
 *
 * For information about EBS Enterprise Snapshot Policy Attachment and how to use it, see [What is Enterprise Snapshot Policy Attachment](https://www.alibabacloud.com/help/en/).
 *
 * > **NOTE:** Available since v1.215.0.
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
 * const defaultJkW46o = new alicloud.ecs.EcsDisk("defaultJkW46o", {
 *     category: "cloud_essd",
 *     description: "esp-attachment-test",
 *     zoneId: "cn-hangzhou-i",
 *     performanceLevel: "PL1",
 *     size: 20,
 *     diskName: name,
 * });
 * const defaultPE3jjR = new alicloud.ebs.EnterpriseSnapshotPolicy("defaultPE3jjR", {
 *     status: "DISABLED",
 *     desc: "DESC",
 *     schedule: {
 *         cronExpression: "0 0 0 1 * ?",
 *     },
 *     enterpriseSnapshotPolicyName: name,
 *     targetType: "DISK",
 *     retainRule: {
 *         timeInterval: 120,
 *         timeUnit: "DAYS",
 *     },
 * });
 * const _default = new alicloud.ebs.EnterpriseSnapshotPolicyAttachment("default", {
 *     policyId: defaultPE3jjR.id,
 *     diskId: defaultJkW46o.id,
 * });
 * ```
 *
 * ## Import
 *
 * EBS Enterprise Snapshot Policy Attachment can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:ebs/enterpriseSnapshotPolicyAttachment:EnterpriseSnapshotPolicyAttachment example <policy_id>:<disk_id>
 * ```
 */
export class EnterpriseSnapshotPolicyAttachment extends pulumi.CustomResource {
    /**
     * Get an existing EnterpriseSnapshotPolicyAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnterpriseSnapshotPolicyAttachmentState, opts?: pulumi.CustomResourceOptions): EnterpriseSnapshotPolicyAttachment {
        return new EnterpriseSnapshotPolicyAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ebs/enterpriseSnapshotPolicyAttachment:EnterpriseSnapshotPolicyAttachment';

    /**
     * Returns true if the given object is an instance of EnterpriseSnapshotPolicyAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EnterpriseSnapshotPolicyAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EnterpriseSnapshotPolicyAttachment.__pulumiType;
    }

    /**
     * Cloud Disk ID.
     */
    public readonly diskId!: pulumi.Output<string>;
    /**
     * the enterprise snapshot policy id.
     */
    public readonly policyId!: pulumi.Output<string>;

    /**
     * Create a EnterpriseSnapshotPolicyAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnterpriseSnapshotPolicyAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnterpriseSnapshotPolicyAttachmentArgs | EnterpriseSnapshotPolicyAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnterpriseSnapshotPolicyAttachmentState | undefined;
            resourceInputs["diskId"] = state ? state.diskId : undefined;
            resourceInputs["policyId"] = state ? state.policyId : undefined;
        } else {
            const args = argsOrState as EnterpriseSnapshotPolicyAttachmentArgs | undefined;
            if ((!args || args.policyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyId'");
            }
            resourceInputs["diskId"] = args ? args.diskId : undefined;
            resourceInputs["policyId"] = args ? args.policyId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EnterpriseSnapshotPolicyAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EnterpriseSnapshotPolicyAttachment resources.
 */
export interface EnterpriseSnapshotPolicyAttachmentState {
    /**
     * Cloud Disk ID.
     */
    diskId?: pulumi.Input<string>;
    /**
     * the enterprise snapshot policy id.
     */
    policyId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EnterpriseSnapshotPolicyAttachment resource.
 */
export interface EnterpriseSnapshotPolicyAttachmentArgs {
    /**
     * Cloud Disk ID.
     */
    diskId?: pulumi.Input<string>;
    /**
     * the enterprise snapshot policy id.
     */
    policyId: pulumi.Input<string>;
}