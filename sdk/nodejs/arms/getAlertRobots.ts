// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Arms Alert Robots of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.237.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.arms.AlertRobot("default", {
 *     alertRobotName: "my-AlertRobot",
 *     robotType: "wechat",
 *     robotAddr: "https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=1c704e23",
 * });
 * const nameRegex = alicloud.arms.getAlertRobotsOutput({
 *     alertRobotName: _default.alertRobotName,
 * });
 * export const armsAlertRobotId = nameRegex.apply(nameRegex => nameRegex.robots?.[0]?.id);
 * ```
 */
export function getAlertRobots(args?: GetAlertRobotsArgs, opts?: pulumi.InvokeOptions): Promise<GetAlertRobotsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:arms/getAlertRobots:getAlertRobots", {
        "alertRobotName": args.alertRobotName,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "robotType": args.robotType,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlertRobots.
 */
export interface GetAlertRobotsArgs {
    /**
     * The robot name.
     */
    alertRobotName?: string;
    /**
     * A list of Alert Robot IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Alert Robot name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The robot type.
     */
    robotType?: string;
}

/**
 * A collection of values returned by getAlertRobots.
 */
export interface GetAlertRobotsResult {
    readonly alertRobotName?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Alert Robot IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Alert Robot names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The type of the robot.
     */
    readonly robotType?: string;
    /**
     * A list of Arms Alert Robots. Each element contains the following attributes:
     */
    readonly robots: outputs.arms.GetAlertRobotsRobot[];
}
/**
 * This data source provides the Arms Alert Robots of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.237.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.arms.AlertRobot("default", {
 *     alertRobotName: "my-AlertRobot",
 *     robotType: "wechat",
 *     robotAddr: "https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=1c704e23",
 * });
 * const nameRegex = alicloud.arms.getAlertRobotsOutput({
 *     alertRobotName: _default.alertRobotName,
 * });
 * export const armsAlertRobotId = nameRegex.apply(nameRegex => nameRegex.robots?.[0]?.id);
 * ```
 */
export function getAlertRobotsOutput(args?: GetAlertRobotsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAlertRobotsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:arms/getAlertRobots:getAlertRobots", {
        "alertRobotName": args.alertRobotName,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "robotType": args.robotType,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlertRobots.
 */
export interface GetAlertRobotsOutputArgs {
    /**
     * The robot name.
     */
    alertRobotName?: pulumi.Input<string>;
    /**
     * A list of Alert Robot IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Alert Robot name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The robot type.
     */
    robotType?: pulumi.Input<string>;
}