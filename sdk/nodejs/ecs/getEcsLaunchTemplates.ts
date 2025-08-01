// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ecs Launch Templates of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.120.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.getZones({
 *     availableDiskCategory: "cloud_efficiency",
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultGetInstanceTypes = _default.then(_default => alicloud.ecs.getInstanceTypes({
 *     availabilityZone: _default.zones?.[0]?.id,
 * }));
 * const defaultGetImages = alicloud.ecs.getImages({
 *     nameRegex: "^ubuntu_18.*64",
 *     owners: "system",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: "terraform-example",
 *     cidrBlock: "172.17.3.0/24",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vswitchName: "terraform-example",
 *     cidrBlock: "172.17.3.0/24",
 *     vpcId: defaultNetwork.id,
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 * });
 * const defaultSecurityGroup = new alicloud.ecs.SecurityGroup("default", {
 *     name: "terraform-example",
 *     vpcId: defaultNetwork.id,
 * });
 * const defaultEcsLaunchTemplate = new alicloud.ecs.EcsLaunchTemplate("default", {
 *     launchTemplateName: "terraform-example",
 *     description: "terraform-example",
 *     imageId: defaultGetImages.then(defaultGetImages => defaultGetImages.images?.[0]?.id),
 *     hostName: "terraform-example",
 *     instanceChargeType: "PrePaid",
 *     instanceName: "terraform-example",
 *     instanceType: defaultGetInstanceTypes.then(defaultGetInstanceTypes => defaultGetInstanceTypes.instanceTypes?.[0]?.id),
 *     internetChargeType: "PayByBandwidth",
 *     internetMaxBandwidthIn: 5,
 *     internetMaxBandwidthOut: 5,
 *     ioOptimized: "optimized",
 *     keyPairName: "key_pair_name",
 *     ramRoleName: "ram_role_name",
 *     networkType: "vpc",
 *     securityEnhancementStrategy: "Active",
 *     spotPriceLimit: 5,
 *     spotStrategy: "SpotWithPriceLimit",
 *     securityGroupIds: [defaultSecurityGroup.id],
 *     systemDisk: {
 *         category: "cloud_ssd",
 *         description: "Test For Terraform",
 *         name: "terraform-example",
 *         size: 40,
 *         deleteWithInstance: false,
 *     },
 *     userData: "xxxxxxx",
 *     vswitchId: defaultSwitch.id,
 *     vpcId: defaultNetwork.id,
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     templateTags: {
 *         Create: "Terraform",
 *         For: "example",
 *     },
 *     networkInterfaces: {
 *         name: "eth0",
 *         description: "hello1",
 *         primaryIp: "10.0.0.2",
 *         securityGroupId: defaultSecurityGroup.id,
 *         vswitchId: defaultSwitch.id,
 *     },
 *     dataDisks: [
 *         {
 *             name: "disk1",
 *             description: "description",
 *             deleteWithInstance: true,
 *             category: "cloud",
 *             encrypted: false,
 *             performanceLevel: "PL0",
 *             size: 20,
 *         },
 *         {
 *             name: "disk2",
 *             description: "description2",
 *             deleteWithInstance: true,
 *             category: "cloud",
 *             encrypted: false,
 *             performanceLevel: "PL0",
 *             size: 20,
 *         },
 *     ],
 * });
 * const ids = alicloud.ecs.getEcsLaunchTemplatesOutput({
 *     ids: [defaultEcsLaunchTemplate.id],
 * });
 * export const ecsLaunchTemplateId0 = ids.apply(ids => ids.templates?.[0]?.id);
 * ```
 */
export function getEcsLaunchTemplates(args?: GetEcsLaunchTemplatesArgs, opts?: pulumi.InvokeOptions): Promise<GetEcsLaunchTemplatesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecs/getEcsLaunchTemplates:getEcsLaunchTemplates", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "launchTemplateName": args.launchTemplateName,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "templateResourceGroupId": args.templateResourceGroupId,
        "templateTags": args.templateTags,
    }, opts);
}

/**
 * A collection of arguments for invoking getEcsLaunchTemplates.
 */
export interface GetEcsLaunchTemplatesArgs {
    /**
     * Whether to query the detailed list of resource attributes. Default value: `false`.
     */
    enableDetails?: boolean;
    /**
     * A list of Launch Template IDs.
     */
    ids?: string[];
    /**
     * The name of the launch template.
     */
    launchTemplateName?: string;
    /**
     * A regex string to filter results by Launch Template name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the Resource Group.
     */
    templateResourceGroupId?: string;
    /**
     * The tags of the launch template.
     */
    templateTags?: {[key: string]: string};
}

/**
 * A collection of values returned by getEcsLaunchTemplates.
 */
export interface GetEcsLaunchTemplatesResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    /**
     * The name of the Launch Template.
     */
    readonly launchTemplateName?: string;
    readonly nameRegex?: string;
    /**
     * A list of Launch Template names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly templateResourceGroupId?: string;
    /**
     * The tags of the launch template.
     * > **NOTE:** Except for the fields `id`, `launchTemplateId`, `launchTemplateName`, `defaultVersionNumber`, `latestVersionNumber`, `createdBy`, `modifiedTime`, `resourceGroupId`, `templateTags`, all other fields take effect only if `enableDetails` is set to `true`.
     */
    readonly templateTags?: {[key: string]: string};
    /**
     * A list of Ecs Launch Templates. Each element contains the following attributes:
     */
    readonly templates: outputs.ecs.GetEcsLaunchTemplatesTemplate[];
}
/**
 * This data source provides the Ecs Launch Templates of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.120.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.getZones({
 *     availableDiskCategory: "cloud_efficiency",
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultGetInstanceTypes = _default.then(_default => alicloud.ecs.getInstanceTypes({
 *     availabilityZone: _default.zones?.[0]?.id,
 * }));
 * const defaultGetImages = alicloud.ecs.getImages({
 *     nameRegex: "^ubuntu_18.*64",
 *     owners: "system",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: "terraform-example",
 *     cidrBlock: "172.17.3.0/24",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vswitchName: "terraform-example",
 *     cidrBlock: "172.17.3.0/24",
 *     vpcId: defaultNetwork.id,
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 * });
 * const defaultSecurityGroup = new alicloud.ecs.SecurityGroup("default", {
 *     name: "terraform-example",
 *     vpcId: defaultNetwork.id,
 * });
 * const defaultEcsLaunchTemplate = new alicloud.ecs.EcsLaunchTemplate("default", {
 *     launchTemplateName: "terraform-example",
 *     description: "terraform-example",
 *     imageId: defaultGetImages.then(defaultGetImages => defaultGetImages.images?.[0]?.id),
 *     hostName: "terraform-example",
 *     instanceChargeType: "PrePaid",
 *     instanceName: "terraform-example",
 *     instanceType: defaultGetInstanceTypes.then(defaultGetInstanceTypes => defaultGetInstanceTypes.instanceTypes?.[0]?.id),
 *     internetChargeType: "PayByBandwidth",
 *     internetMaxBandwidthIn: 5,
 *     internetMaxBandwidthOut: 5,
 *     ioOptimized: "optimized",
 *     keyPairName: "key_pair_name",
 *     ramRoleName: "ram_role_name",
 *     networkType: "vpc",
 *     securityEnhancementStrategy: "Active",
 *     spotPriceLimit: 5,
 *     spotStrategy: "SpotWithPriceLimit",
 *     securityGroupIds: [defaultSecurityGroup.id],
 *     systemDisk: {
 *         category: "cloud_ssd",
 *         description: "Test For Terraform",
 *         name: "terraform-example",
 *         size: 40,
 *         deleteWithInstance: false,
 *     },
 *     userData: "xxxxxxx",
 *     vswitchId: defaultSwitch.id,
 *     vpcId: defaultNetwork.id,
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     templateTags: {
 *         Create: "Terraform",
 *         For: "example",
 *     },
 *     networkInterfaces: {
 *         name: "eth0",
 *         description: "hello1",
 *         primaryIp: "10.0.0.2",
 *         securityGroupId: defaultSecurityGroup.id,
 *         vswitchId: defaultSwitch.id,
 *     },
 *     dataDisks: [
 *         {
 *             name: "disk1",
 *             description: "description",
 *             deleteWithInstance: true,
 *             category: "cloud",
 *             encrypted: false,
 *             performanceLevel: "PL0",
 *             size: 20,
 *         },
 *         {
 *             name: "disk2",
 *             description: "description2",
 *             deleteWithInstance: true,
 *             category: "cloud",
 *             encrypted: false,
 *             performanceLevel: "PL0",
 *             size: 20,
 *         },
 *     ],
 * });
 * const ids = alicloud.ecs.getEcsLaunchTemplatesOutput({
 *     ids: [defaultEcsLaunchTemplate.id],
 * });
 * export const ecsLaunchTemplateId0 = ids.apply(ids => ids.templates?.[0]?.id);
 * ```
 */
export function getEcsLaunchTemplatesOutput(args?: GetEcsLaunchTemplatesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetEcsLaunchTemplatesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:ecs/getEcsLaunchTemplates:getEcsLaunchTemplates", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "launchTemplateName": args.launchTemplateName,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "templateResourceGroupId": args.templateResourceGroupId,
        "templateTags": args.templateTags,
    }, opts);
}

/**
 * A collection of arguments for invoking getEcsLaunchTemplates.
 */
export interface GetEcsLaunchTemplatesOutputArgs {
    /**
     * Whether to query the detailed list of resource attributes. Default value: `false`.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Launch Template IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the launch template.
     */
    launchTemplateName?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Launch Template name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the Resource Group.
     */
    templateResourceGroupId?: pulumi.Input<string>;
    /**
     * The tags of the launch template.
     */
    templateTags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
