// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Eipanycast Anycast Eip Address Attachment resource.
 *
 * For information about Eipanycast Anycast Eip Address Attachment and how to use it, see [What is Anycast Eip Address Attachment](https://help.aliyun.com/document_detail/171857.html).
 *
 * > **NOTE:** Available in v1.113.0+.
 *
 * > **NOTE:** The following regions support currently while Slb instance support bound.
 * [eu-west-1-gb33-a01,cn-hongkong-am4-c04,ap-southeast-os30-a01,us-west-ot7-a01,ap-south-in73-a01,ap-southeast-my88-a01]
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const exampleAnycastEipAddress = new alicloud.eipanycast.AnycastEipAddress("exampleAnycastEipAddress", {serviceLocation: "international"});
 * const exampleAnycastEipAddressAttachment = new alicloud.eipanycast.AnycastEipAddressAttachment("exampleAnycastEipAddressAttachment", {
 *     anycastId: exampleAnycastEipAddress.id,
 *     bindInstanceId: "lb-j6chlcr8lffy7********",
 *     bindInstanceRegionId: "cn-hongkong",
 *     bindInstanceType: "SlbInstance",
 * });
 * ```
 *
 * ## Import
 *
 * Eipanycast Anycast Eip Address Attachment can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:eipanycast/anycastEipAddressAttachment:AnycastEipAddressAttachment example `anycast_id`:`bind_instance_id`:`bind_instance_region_id`:`bind_instance_type`
 * ```
 */
export class AnycastEipAddressAttachment extends pulumi.CustomResource {
    /**
     * Get an existing AnycastEipAddressAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AnycastEipAddressAttachmentState, opts?: pulumi.CustomResourceOptions): AnycastEipAddressAttachment {
        return new AnycastEipAddressAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:eipanycast/anycastEipAddressAttachment:AnycastEipAddressAttachment';

    /**
     * Returns true if the given object is an instance of AnycastEipAddressAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AnycastEipAddressAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AnycastEipAddressAttachment.__pulumiType;
    }

    /**
     * The ID of Anycast EIP.
     */
    public readonly anycastId!: pulumi.Output<string>;
    /**
     * The ID of bound instance.
     */
    public readonly bindInstanceId!: pulumi.Output<string>;
    /**
     * The region ID of bound instance.
     */
    public readonly bindInstanceRegionId!: pulumi.Output<string>;
    /**
     * The type of bound instance. Valid value: `SlbInstance`.
     */
    public readonly bindInstanceType!: pulumi.Output<string>;
    /**
     * The time of bound instance.
     */
    public /*out*/ readonly bindTime!: pulumi.Output<string>;

    /**
     * Create a AnycastEipAddressAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AnycastEipAddressAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AnycastEipAddressAttachmentArgs | AnycastEipAddressAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AnycastEipAddressAttachmentState | undefined;
            inputs["anycastId"] = state ? state.anycastId : undefined;
            inputs["bindInstanceId"] = state ? state.bindInstanceId : undefined;
            inputs["bindInstanceRegionId"] = state ? state.bindInstanceRegionId : undefined;
            inputs["bindInstanceType"] = state ? state.bindInstanceType : undefined;
            inputs["bindTime"] = state ? state.bindTime : undefined;
        } else {
            const args = argsOrState as AnycastEipAddressAttachmentArgs | undefined;
            if ((!args || args.anycastId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'anycastId'");
            }
            if ((!args || args.bindInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bindInstanceId'");
            }
            if ((!args || args.bindInstanceRegionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bindInstanceRegionId'");
            }
            if ((!args || args.bindInstanceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bindInstanceType'");
            }
            inputs["anycastId"] = args ? args.anycastId : undefined;
            inputs["bindInstanceId"] = args ? args.bindInstanceId : undefined;
            inputs["bindInstanceRegionId"] = args ? args.bindInstanceRegionId : undefined;
            inputs["bindInstanceType"] = args ? args.bindInstanceType : undefined;
            inputs["bindTime"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AnycastEipAddressAttachment.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AnycastEipAddressAttachment resources.
 */
export interface AnycastEipAddressAttachmentState {
    /**
     * The ID of Anycast EIP.
     */
    readonly anycastId?: pulumi.Input<string>;
    /**
     * The ID of bound instance.
     */
    readonly bindInstanceId?: pulumi.Input<string>;
    /**
     * The region ID of bound instance.
     */
    readonly bindInstanceRegionId?: pulumi.Input<string>;
    /**
     * The type of bound instance. Valid value: `SlbInstance`.
     */
    readonly bindInstanceType?: pulumi.Input<string>;
    /**
     * The time of bound instance.
     */
    readonly bindTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AnycastEipAddressAttachment resource.
 */
export interface AnycastEipAddressAttachmentArgs {
    /**
     * The ID of Anycast EIP.
     */
    readonly anycastId: pulumi.Input<string>;
    /**
     * The ID of bound instance.
     */
    readonly bindInstanceId: pulumi.Input<string>;
    /**
     * The region ID of bound instance.
     */
    readonly bindInstanceRegionId: pulumi.Input<string>;
    /**
     * The type of bound instance. Valid value: `SlbInstance`.
     */
    readonly bindInstanceType: pulumi.Input<string>;
}