// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Cloud Storage Gateway Gateway SMB Users of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.142.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.vpc.getNetworks({
 *     nameRegex: "default-NODELETING",
 * });
 * const defaultGetSwitches = _default.then(_default => alicloud.vpc.getSwitches({
 *     vpcId: _default.ids?.[0],
 * }));
 * const example = new alicloud.cloudstoragegateway.StorageBundle("example", {storageBundleName: "example_value"});
 * const defaultGateway = new alicloud.cloudstoragegateway.Gateway("default", {
 *     description: "tf-acctestDesalone",
 *     gatewayClass: "Standard",
 *     type: "File",
 *     paymentType: "PayAsYouGo",
 *     vswitchId: defaultGetSwitches.then(defaultGetSwitches => defaultGetSwitches.ids?.[0]),
 *     releaseAfterExpiration: false,
 *     publicNetworkBandwidth: 40,
 *     storageBundleId: example.id,
 *     location: "Cloud",
 *     gatewayName: "example_value",
 * });
 * const defaultGatewaySmbUser = new alicloud.cloudstoragegateway.GatewaySmbUser("default", {
 *     username: "your_username",
 *     password: "password",
 *     gatewayId: defaultGateway.id,
 * });
 * const ids = alicloud.cloudstoragegateway.getGatewaySmbUsersOutput({
 *     gatewayId: defaultGateway.id,
 *     ids: [defaultGatewaySmbUser.id],
 * });
 * export const cloudStorageGatewayGatewaySmbUserId1 = ids.apply(ids => ids.users?.[0]?.id);
 * ```
 */
export function getGatewaySmbUsers(args: GetGatewaySmbUsersArgs, opts?: pulumi.InvokeOptions): Promise<GetGatewaySmbUsersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cloudstoragegateway/getGatewaySmbUsers:getGatewaySmbUsers", {
        "gatewayId": args.gatewayId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getGatewaySmbUsers.
 */
export interface GetGatewaySmbUsersArgs {
    /**
     * The Gateway ID.
     */
    gatewayId: string;
    /**
     * A list of Gateway SMB User IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Gateway SMB username.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getGatewaySmbUsers.
 */
export interface GetGatewaySmbUsersResult {
    readonly gatewayId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly outputFile?: string;
    readonly users: outputs.cloudstoragegateway.GetGatewaySmbUsersUser[];
}
/**
 * This data source provides the Cloud Storage Gateway Gateway SMB Users of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.142.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.vpc.getNetworks({
 *     nameRegex: "default-NODELETING",
 * });
 * const defaultGetSwitches = _default.then(_default => alicloud.vpc.getSwitches({
 *     vpcId: _default.ids?.[0],
 * }));
 * const example = new alicloud.cloudstoragegateway.StorageBundle("example", {storageBundleName: "example_value"});
 * const defaultGateway = new alicloud.cloudstoragegateway.Gateway("default", {
 *     description: "tf-acctestDesalone",
 *     gatewayClass: "Standard",
 *     type: "File",
 *     paymentType: "PayAsYouGo",
 *     vswitchId: defaultGetSwitches.then(defaultGetSwitches => defaultGetSwitches.ids?.[0]),
 *     releaseAfterExpiration: false,
 *     publicNetworkBandwidth: 40,
 *     storageBundleId: example.id,
 *     location: "Cloud",
 *     gatewayName: "example_value",
 * });
 * const defaultGatewaySmbUser = new alicloud.cloudstoragegateway.GatewaySmbUser("default", {
 *     username: "your_username",
 *     password: "password",
 *     gatewayId: defaultGateway.id,
 * });
 * const ids = alicloud.cloudstoragegateway.getGatewaySmbUsersOutput({
 *     gatewayId: defaultGateway.id,
 *     ids: [defaultGatewaySmbUser.id],
 * });
 * export const cloudStorageGatewayGatewaySmbUserId1 = ids.apply(ids => ids.users?.[0]?.id);
 * ```
 */
export function getGatewaySmbUsersOutput(args: GetGatewaySmbUsersOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGatewaySmbUsersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:cloudstoragegateway/getGatewaySmbUsers:getGatewaySmbUsers", {
        "gatewayId": args.gatewayId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getGatewaySmbUsers.
 */
export interface GetGatewaySmbUsersOutputArgs {
    /**
     * The Gateway ID.
     */
    gatewayId: pulumi.Input<string>;
    /**
     * A list of Gateway SMB User IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Gateway SMB username.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
