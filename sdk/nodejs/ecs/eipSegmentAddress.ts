// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a EIP Segment Address resource.
 *
 * For information about EIP Segment Address and how to use it, see [What is Segment Address](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/allocateeipsegmentaddress).
 *
 * > **NOTE:** Available since v1.207.0.
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
 * const _default = new alicloud.ecs.EipSegmentAddress("default", {
 *     bandwidth: "5",
 *     eipMask: "28",
 *     internetChargeType: "PayByBandwidth",
 *     isp: "BGP",
 *     netmode: "public",
 * });
 * ```
 *
 * ## Import
 *
 * EIP Segment Address can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ecs/eipSegmentAddress:EipSegmentAddress example <id>
 * ```
 */
export class EipSegmentAddress extends pulumi.CustomResource {
    /**
     * Get an existing EipSegmentAddress resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EipSegmentAddressState, opts?: pulumi.CustomResourceOptions): EipSegmentAddress {
        return new EipSegmentAddress(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/eipSegmentAddress:EipSegmentAddress';

    /**
     * Returns true if the given object is an instance of EipSegmentAddress.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EipSegmentAddress {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EipSegmentAddress.__pulumiType;
    }

    /**
     * The peak bandwidth of the EIP. Unit: Mbps. When the value of instancargetype is PostPaid and the value of InternetChargeType is PayByBandwidth, the range of Bandwidth is 1 to 500. If the value of instancargetype is PostPaid and the value of InternetChargeType is PayByTraffic, the range of Bandwidth is 1 to 200. When instancargetype is set to PrePaid, the range of Bandwidth is 1 to 1000. The default value is 5 Mbps.
     */
    public readonly bandwidth!: pulumi.Output<string | undefined>;
    /**
     * The time when the contiguous Elastic IP address group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Mask of consecutive EIPs. Value:28: For a single call, the system will allocate 16 consecutive EIPs.27: For a single call, the system will allocate 32 consecutive EIPs.26: For a single call, the system will allocate 64 consecutive EIPs.25: For a single call, the system will allocate 128 consecutive EIPs.24: For a single call, the system will allocate 256 consecutive EIPs.
     */
    public readonly eipMask!: pulumi.Output<string>;
    /**
     * Continuous EIP billing method, valid values:
     * - **PayByBandwidth** (default): Billing based on fixed bandwidth.
     * - **PayByTraffic**: Billing by usage flow.
     */
    public readonly internetChargeType!: pulumi.Output<string | undefined>;
    /**
     * Line type. Valid values:
     * - **BGP** (default):BGP (multi-line) line. BGP (multi-line) EIP is supported in all regions.
     * - **BGP_PRO** :BGP (multi-line)_boutique line. Currently, only Hong Kong, Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), the Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions support BGP (multi-line)_boutique route EIP.
     * For more information about BGP (multi-line) lines and BGP (multi-line) premium lines, see EIP line types.
     * If you are a whitelist user with single-line bandwidth, you can also select the following types:
     * - **ChinaTelecom** : China Telecom
     * - **ChinaUnicom** : China Unicom
     * - **ChinaMobile** : China Mobile
     * - **ChinaTelecom_L2** : China Telecom L2
     * - **ChinaUnicom_L2** : China Unicom L2
     * - **ChinaMobile_L2** : China Mobile L2
     * If you are a user of Hangzhou Financial Cloud, this field is required. The value is `BGP_FinanceCloud`.
     */
    public readonly isp!: pulumi.Output<string | undefined>;
    /**
     * The network type. Set the value to **public**.
     */
    public readonly netmode!: pulumi.Output<string | undefined>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a EipSegmentAddress resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EipSegmentAddressArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EipSegmentAddressArgs | EipSegmentAddressState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EipSegmentAddressState | undefined;
            resourceInputs["bandwidth"] = state ? state.bandwidth : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["eipMask"] = state ? state.eipMask : undefined;
            resourceInputs["internetChargeType"] = state ? state.internetChargeType : undefined;
            resourceInputs["isp"] = state ? state.isp : undefined;
            resourceInputs["netmode"] = state ? state.netmode : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as EipSegmentAddressArgs | undefined;
            if ((!args || args.eipMask === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eipMask'");
            }
            resourceInputs["bandwidth"] = args ? args.bandwidth : undefined;
            resourceInputs["eipMask"] = args ? args.eipMask : undefined;
            resourceInputs["internetChargeType"] = args ? args.internetChargeType : undefined;
            resourceInputs["isp"] = args ? args.isp : undefined;
            resourceInputs["netmode"] = args ? args.netmode : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EipSegmentAddress.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EipSegmentAddress resources.
 */
export interface EipSegmentAddressState {
    /**
     * The peak bandwidth of the EIP. Unit: Mbps. When the value of instancargetype is PostPaid and the value of InternetChargeType is PayByBandwidth, the range of Bandwidth is 1 to 500. If the value of instancargetype is PostPaid and the value of InternetChargeType is PayByTraffic, the range of Bandwidth is 1 to 200. When instancargetype is set to PrePaid, the range of Bandwidth is 1 to 1000. The default value is 5 Mbps.
     */
    bandwidth?: pulumi.Input<string>;
    /**
     * The time when the contiguous Elastic IP address group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Mask of consecutive EIPs. Value:28: For a single call, the system will allocate 16 consecutive EIPs.27: For a single call, the system will allocate 32 consecutive EIPs.26: For a single call, the system will allocate 64 consecutive EIPs.25: For a single call, the system will allocate 128 consecutive EIPs.24: For a single call, the system will allocate 256 consecutive EIPs.
     */
    eipMask?: pulumi.Input<string>;
    /**
     * Continuous EIP billing method, valid values:
     * - **PayByBandwidth** (default): Billing based on fixed bandwidth.
     * - **PayByTraffic**: Billing by usage flow.
     */
    internetChargeType?: pulumi.Input<string>;
    /**
     * Line type. Valid values:
     * - **BGP** (default):BGP (multi-line) line. BGP (multi-line) EIP is supported in all regions.
     * - **BGP_PRO** :BGP (multi-line)_boutique line. Currently, only Hong Kong, Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), the Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions support BGP (multi-line)_boutique route EIP.
     * For more information about BGP (multi-line) lines and BGP (multi-line) premium lines, see EIP line types.
     * If you are a whitelist user with single-line bandwidth, you can also select the following types:
     * - **ChinaTelecom** : China Telecom
     * - **ChinaUnicom** : China Unicom
     * - **ChinaMobile** : China Mobile
     * - **ChinaTelecom_L2** : China Telecom L2
     * - **ChinaUnicom_L2** : China Unicom L2
     * - **ChinaMobile_L2** : China Mobile L2
     * If you are a user of Hangzhou Financial Cloud, this field is required. The value is `BGP_FinanceCloud`.
     */
    isp?: pulumi.Input<string>;
    /**
     * The network type. Set the value to **public**.
     */
    netmode?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EipSegmentAddress resource.
 */
export interface EipSegmentAddressArgs {
    /**
     * The peak bandwidth of the EIP. Unit: Mbps. When the value of instancargetype is PostPaid and the value of InternetChargeType is PayByBandwidth, the range of Bandwidth is 1 to 500. If the value of instancargetype is PostPaid and the value of InternetChargeType is PayByTraffic, the range of Bandwidth is 1 to 200. When instancargetype is set to PrePaid, the range of Bandwidth is 1 to 1000. The default value is 5 Mbps.
     */
    bandwidth?: pulumi.Input<string>;
    /**
     * Mask of consecutive EIPs. Value:28: For a single call, the system will allocate 16 consecutive EIPs.27: For a single call, the system will allocate 32 consecutive EIPs.26: For a single call, the system will allocate 64 consecutive EIPs.25: For a single call, the system will allocate 128 consecutive EIPs.24: For a single call, the system will allocate 256 consecutive EIPs.
     */
    eipMask: pulumi.Input<string>;
    /**
     * Continuous EIP billing method, valid values:
     * - **PayByBandwidth** (default): Billing based on fixed bandwidth.
     * - **PayByTraffic**: Billing by usage flow.
     */
    internetChargeType?: pulumi.Input<string>;
    /**
     * Line type. Valid values:
     * - **BGP** (default):BGP (multi-line) line. BGP (multi-line) EIP is supported in all regions.
     * - **BGP_PRO** :BGP (multi-line)_boutique line. Currently, only Hong Kong, Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), the Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions support BGP (multi-line)_boutique route EIP.
     * For more information about BGP (multi-line) lines and BGP (multi-line) premium lines, see EIP line types.
     * If you are a whitelist user with single-line bandwidth, you can also select the following types:
     * - **ChinaTelecom** : China Telecom
     * - **ChinaUnicom** : China Unicom
     * - **ChinaMobile** : China Mobile
     * - **ChinaTelecom_L2** : China Telecom L2
     * - **ChinaUnicom_L2** : China Unicom L2
     * - **ChinaMobile_L2** : China Mobile L2
     * If you are a user of Hangzhou Financial Cloud, this field is required. The value is `BGP_FinanceCloud`.
     */
    isp?: pulumi.Input<string>;
    /**
     * The network type. Set the value to **public**.
     */
    netmode?: pulumi.Input<string>;
}