// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ecp Instances of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.158.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.ecp.getZones({});
 * const defaultGetInstanceTypes = alicloud.ecp.getInstanceTypes({});
 * const countSize = _default.then(_default => _default.zones).length;
 * const zoneId = pulumi.all([_default, countSize]).apply(([_default, countSize]) => _default.zones[countSize - 1].zoneId);
 * const instanceTypeCountSize = defaultGetInstanceTypes.then(defaultGetInstanceTypes => defaultGetInstanceTypes.instanceTypes).length;
 * const instanceType = pulumi.all([defaultGetInstanceTypes, instanceTypeCountSize]).apply(([defaultGetInstanceTypes, instanceTypeCountSize]) => defaultGetInstanceTypes.instanceTypes[instanceTypeCountSize - 1].instanceType);
 * const defaultGetNetworks = alicloud.vpc.getNetworks({
 *     nameRegex: "default-NODELETING",
 * });
 * const defaultGetSwitches = defaultGetNetworks.then(defaultGetNetworks => alicloud.vpc.getSwitchesOutput({
 *     vpcId: defaultGetNetworks.ids?.[0],
 *     zoneId: zoneId,
 * }));
 * const group = new alicloud.ecs.SecurityGroup("group", {
 *     name: name,
 *     vpcId: defaultGetNetworks.then(defaultGetNetworks => defaultGetNetworks.ids?.[0]),
 * });
 * const defaultKeyPair = new alicloud.ecp.KeyPair("default", {
 *     keyPairName: name,
 *     publicKeyBody: "ssh-rsa AAAAB3Nza12345678qwertyuudsfsg",
 * });
 * const defaultInstance = new alicloud.ecp.Instance("default", {
 *     instanceName: name,
 *     description: name,
 *     force: true,
 *     keyPairName: defaultKeyPair.keyPairName,
 *     vswitchId: defaultGetSwitches.apply(defaultGetSwitches => defaultGetSwitches.ids?.[0]),
 *     imageId: "android_9_0_0_release_2851157_20211201.vhd",
 *     instanceType: pulumi.all([defaultGetInstanceTypes, instanceTypeCountSize]).apply(([defaultGetInstanceTypes, instanceTypeCountSize]) => defaultGetInstanceTypes.instanceTypes[instanceTypeCountSize - 1].instanceType),
 *     paymentType: "PayAsYouGo",
 * });
 * ```
 */
export function getInstances(args?: GetInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstancesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecp/getInstances:getInstances", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "imageId": args.imageId,
        "instanceName": args.instanceName,
        "instanceType": args.instanceType,
        "keyPairName": args.keyPairName,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "paymentType": args.paymentType,
        "resolution": args.resolution,
        "status": args.status,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesArgs {
    enableDetails?: boolean;
    /**
     * A list of Ecp Instances IDs.
     */
    ids?: string[];
    /**
     * The ID Of The Image.
     */
    imageId?: string;
    /**
     * The name of the instance. It must be 2 to 128 characters in length and must start with an
     * uppercase letter or Chinese. It cannot start with http:// or https. It can contain Chinese, English, numbers,
     * half-width colons (:), underscores (_), half-width periods (.), or dashes (-). The default value is the InstanceId of
     * the instance.
     */
    instanceName?: string;
    /**
     * Instance Type.
     */
    instanceType?: string;
    /**
     * The name of the key pair of the mobile phone instance.
     */
    keyPairName?: string;
    /**
     * A regex string to filter results by mobile phone name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The payment type.Valid values: `PayAsYouGo`,`Subscription`
     */
    paymentType?: string;
    /**
     * The selected resolution for the cloud mobile phone instance.
     */
    resolution?: string;
    /**
     * Instance status. Valid values: `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`
     * .
     */
    status?: string;
    zoneId?: string;
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
    readonly ids: string[];
    readonly imageId?: string;
    readonly instanceName?: string;
    readonly instanceType?: string;
    readonly instances: outputs.ecp.GetInstancesInstance[];
    readonly keyPairName?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly paymentType?: string;
    readonly resolution?: string;
    readonly status?: string;
    readonly zoneId?: string;
}
/**
 * This data source provides the Ecp Instances of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.158.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.ecp.getZones({});
 * const defaultGetInstanceTypes = alicloud.ecp.getInstanceTypes({});
 * const countSize = _default.then(_default => _default.zones).length;
 * const zoneId = pulumi.all([_default, countSize]).apply(([_default, countSize]) => _default.zones[countSize - 1].zoneId);
 * const instanceTypeCountSize = defaultGetInstanceTypes.then(defaultGetInstanceTypes => defaultGetInstanceTypes.instanceTypes).length;
 * const instanceType = pulumi.all([defaultGetInstanceTypes, instanceTypeCountSize]).apply(([defaultGetInstanceTypes, instanceTypeCountSize]) => defaultGetInstanceTypes.instanceTypes[instanceTypeCountSize - 1].instanceType);
 * const defaultGetNetworks = alicloud.vpc.getNetworks({
 *     nameRegex: "default-NODELETING",
 * });
 * const defaultGetSwitches = defaultGetNetworks.then(defaultGetNetworks => alicloud.vpc.getSwitchesOutput({
 *     vpcId: defaultGetNetworks.ids?.[0],
 *     zoneId: zoneId,
 * }));
 * const group = new alicloud.ecs.SecurityGroup("group", {
 *     name: name,
 *     vpcId: defaultGetNetworks.then(defaultGetNetworks => defaultGetNetworks.ids?.[0]),
 * });
 * const defaultKeyPair = new alicloud.ecp.KeyPair("default", {
 *     keyPairName: name,
 *     publicKeyBody: "ssh-rsa AAAAB3Nza12345678qwertyuudsfsg",
 * });
 * const defaultInstance = new alicloud.ecp.Instance("default", {
 *     instanceName: name,
 *     description: name,
 *     force: true,
 *     keyPairName: defaultKeyPair.keyPairName,
 *     vswitchId: defaultGetSwitches.apply(defaultGetSwitches => defaultGetSwitches.ids?.[0]),
 *     imageId: "android_9_0_0_release_2851157_20211201.vhd",
 *     instanceType: pulumi.all([defaultGetInstanceTypes, instanceTypeCountSize]).apply(([defaultGetInstanceTypes, instanceTypeCountSize]) => defaultGetInstanceTypes.instanceTypes[instanceTypeCountSize - 1].instanceType),
 *     paymentType: "PayAsYouGo",
 * });
 * ```
 */
export function getInstancesOutput(args?: GetInstancesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetInstancesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:ecp/getInstances:getInstances", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "imageId": args.imageId,
        "instanceName": args.instanceName,
        "instanceType": args.instanceType,
        "keyPairName": args.keyPairName,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "paymentType": args.paymentType,
        "resolution": args.resolution,
        "status": args.status,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesOutputArgs {
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Ecp Instances IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID Of The Image.
     */
    imageId?: pulumi.Input<string>;
    /**
     * The name of the instance. It must be 2 to 128 characters in length and must start with an
     * uppercase letter or Chinese. It cannot start with http:// or https. It can contain Chinese, English, numbers,
     * half-width colons (:), underscores (_), half-width periods (.), or dashes (-). The default value is the InstanceId of
     * the instance.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * Instance Type.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * The name of the key pair of the mobile phone instance.
     */
    keyPairName?: pulumi.Input<string>;
    /**
     * A regex string to filter results by mobile phone name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The payment type.Valid values: `PayAsYouGo`,`Subscription`
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The selected resolution for the cloud mobile phone instance.
     */
    resolution?: pulumi.Input<string>;
    /**
     * Instance status. Valid values: `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`
     * .
     */
    status?: pulumi.Input<string>;
    zoneId?: pulumi.Input<string>;
}
