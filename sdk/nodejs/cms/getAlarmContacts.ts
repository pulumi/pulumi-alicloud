// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a list of alarm contact owned by an Alibaba Cloud account.
 *
 * > **NOTE:** Available in v1.99.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * export = async () => {
 *     const example = await alicloud.cms.getAlarmContacts({
 *         ids: ["tf-testAccCmsAlarmContact"],
 *     });
 *     return {
 *         "first-contact": _this.contacts,
 *     };
 * }
 * ```
 */
export function getAlarmContacts(args?: GetAlarmContactsArgs, opts?: pulumi.InvokeOptions): Promise<GetAlarmContactsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cms/getAlarmContacts:getAlarmContacts", {
        "chanelType": args.chanelType,
        "chanelValue": args.chanelValue,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlarmContacts.
 */
export interface GetAlarmContactsArgs {
    /**
     * The alarm notification method. Alarm notifications can be sent by using `Email` or `DingWebHook`.
     */
    chanelType?: string;
    /**
     * The alarm notification target.
     */
    chanelValue?: string;
    /**
     * A list of alarm contact IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by alarm contact name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`). 
     *
     * > **NOTE:** Specify at least one of the following alarm notification targets: phone number, email address, webhook URL of the DingTalk chatbot, and TradeManager ID.
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getAlarmContacts.
 */
export interface GetAlarmContactsResult {
    readonly chanelType?: string;
    readonly chanelValue?: string;
    /**
     * A list of alarm contacts. Each element contains the following attributes:
     */
    readonly contacts: outputs.cms.GetAlarmContactsContact[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of alarm contact IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of alarm contact names.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * Provides a list of alarm contact owned by an Alibaba Cloud account.
 *
 * > **NOTE:** Available in v1.99.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * export = async () => {
 *     const example = await alicloud.cms.getAlarmContacts({
 *         ids: ["tf-testAccCmsAlarmContact"],
 *     });
 *     return {
 *         "first-contact": _this.contacts,
 *     };
 * }
 * ```
 */
export function getAlarmContactsOutput(args?: GetAlarmContactsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAlarmContactsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:cms/getAlarmContacts:getAlarmContacts", {
        "chanelType": args.chanelType,
        "chanelValue": args.chanelValue,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlarmContacts.
 */
export interface GetAlarmContactsOutputArgs {
    /**
     * The alarm notification method. Alarm notifications can be sent by using `Email` or `DingWebHook`.
     */
    chanelType?: pulumi.Input<string>;
    /**
     * The alarm notification target.
     */
    chanelValue?: pulumi.Input<string>;
    /**
     * A list of alarm contact IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by alarm contact name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`). 
     *
     * > **NOTE:** Specify at least one of the following alarm notification targets: phone number, email address, webhook URL of the DingTalk chatbot, and TradeManager ID.
     */
    outputFile?: pulumi.Input<string>;
}
