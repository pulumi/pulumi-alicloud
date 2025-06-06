// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list of ALIKAFKA Instances in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:** Available in 1.59.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const instanceName = config.get("instanceName") || "alikafkaInstanceName";
 * const _default = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("default", {cidrBlock: "172.16.0.0/12"});
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 * });
 * const defaultInstance = new alicloud.alikafka.Instance("default", {
 *     name: instanceName,
 *     partitionNum: 50,
 *     diskType: 1,
 *     diskSize: 500,
 *     deployType: 4,
 *     ioMax: 20,
 *     vswitchId: defaultSwitch.id,
 * });
 * const instancesDs = alicloud.actiontrail.getInstances({
 *     nameRegex: "alikafkaInstanceName",
 *     outputFile: "instances.txt",
 * });
 * export const firstInstanceName = instancesDs.then(instancesDs => instancesDs.instances?.[0]?.name);
 * ```
 */
export function getInstances(args?: GetInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstancesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:actiontrail/getInstances:getInstances", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesArgs {
    enableDetails?: boolean;
    /**
     * A list of instance IDs to filter results.
     */
    ids?: string[];
    /**
     * A regex string to filter results by the instance name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getInstances.
 */
export interface GetInstancesResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of instance IDs.
     */
    readonly ids: string[];
    /**
     * A list of instances. Each element contains the following attributes:
     */
    readonly instances: outputs.actiontrail.GetInstancesInstance[];
    readonly nameRegex?: string;
    /**
     * A list of instance names.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides a list of ALIKAFKA Instances in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:** Available in 1.59.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const instanceName = config.get("instanceName") || "alikafkaInstanceName";
 * const _default = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("default", {cidrBlock: "172.16.0.0/12"});
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 * });
 * const defaultInstance = new alicloud.alikafka.Instance("default", {
 *     name: instanceName,
 *     partitionNum: 50,
 *     diskType: 1,
 *     diskSize: 500,
 *     deployType: 4,
 *     ioMax: 20,
 *     vswitchId: defaultSwitch.id,
 * });
 * const instancesDs = alicloud.actiontrail.getInstances({
 *     nameRegex: "alikafkaInstanceName",
 *     outputFile: "instances.txt",
 * });
 * export const firstInstanceName = instancesDs.then(instancesDs => instancesDs.instances?.[0]?.name);
 * ```
 */
export function getInstancesOutput(args?: GetInstancesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetInstancesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:actiontrail/getInstances:getInstances", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesOutputArgs {
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of instance IDs to filter results.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by the instance name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
