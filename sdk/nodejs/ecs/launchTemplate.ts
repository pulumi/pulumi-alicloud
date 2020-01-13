// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides an ECS Launch Template resource.
 * 
 * For information about Launch Template and how to use it, see [Launch Template](https://www.alibabacloud.com/help/doc-detail/73916.html).
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * 
 * const images = alicloud.ecs.getImages({
 *     owners: "system",
 * });
 * const instances = alicloud.ecs.getInstances();
 * const template = new alicloud.ecs.LaunchTemplate("template", {
 *     dataDisks: [
 *         {
 *             description: "test1",
 *             name: "disk1",
 *         },
 *         {
 *             description: "test2",
 *             name: "disk2",
 *         },
 *     ],
 *     description: "test1",
 *     hostName: "tf-test-host",
 *     imageId: images.images[0].id,
 *     instanceChargeType: "PrePaid",
 *     instanceName: "tf-instance-name",
 *     instanceType: instances.instances[0].instanceType,
 *     internetChargeType: "PayByBandwidth",
 *     internetMaxBandwidthIn: 5,
 *     internetMaxBandwidthOut: 0,
 *     ioOptimized: "none",
 *     keyPairName: "test-key-pair",
 *     networkInterfaces: {
 *         description: "hello1",
 *         name: "eth0",
 *         primaryIp: "10.0.0.2",
 *         securityGroupId: "xxxx",
 *         vswitchId: "xxxxxxx",
 *     },
 *     networkType: "vpc",
 *     ramRoleName: "xxxxx",
 *     resourceGroupId: "rg-zkdfjahg9zxncv0",
 *     securityEnhancementStrategy: "Active",
 *     securityGroupId: "sg-zxcvj0lasdf102350asdf9a",
 *     spotPriceLimit: 5,
 *     spotStrategy: "SpotWithPriceLimit",
 *     systemDiskCategory: "cloudSsd",
 *     systemDiskDescription: "test disk",
 *     systemDiskName: "hello",
 *     systemDiskSize: 40,
 *     tags: {
 *         tag1: "hello",
 *         tag2: "world",
 *     },
 *     userdata: "xxxxxxxxxxxxxx",
 *     vpcId: "vpc-asdfnbg0as8dfk1nb2",
 *     vswitchId: "sw-ljkngaksdjfj0nnasdf",
 *     zoneId: "beijing-a",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/launch_template.html.markdown.
 */
export class LaunchTemplate extends pulumi.CustomResource {
    /**
     * Get an existing LaunchTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LaunchTemplateState, opts?: pulumi.CustomResourceOptions): LaunchTemplate {
        return new LaunchTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/launchTemplate:LaunchTemplate';

    /**
     * Returns true if the given object is an instance of LaunchTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LaunchTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LaunchTemplate.__pulumiType;
    }

    /**
     * Instance auto release time. The time is presented using the ISO8601 standard and in UTC time. The format is  YYYY-MM-DDTHH:MM:SSZ.
     */
    public readonly autoReleaseTime!: pulumi.Output<string | undefined>;
    /**
     * The list of data disks created with instance.
     */
    public readonly dataDisks!: pulumi.Output<outputs.ecs.LaunchTemplateDataDisk[] | undefined>;
    /**
     * The description of the data disk.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Instance host name.It cannot start or end with a period (.) or a hyphen (-) and it cannot have two or more consecutive periods (.) or hyphens (-).For Windows: The host name can be [2, 15] characters in length. It can contain A-Z, a-z, numbers, periods (.), and hyphens (-). It cannot only contain numbers. For other operating systems: The host name can be [2, 64] characters in length. It can be segments separated by periods (.). It can contain A-Z, a-z, numbers, and hyphens (-).
     */
    public readonly hostName!: pulumi.Output<string | undefined>;
    /**
     * Image ID.
     */
    public readonly imageId!: pulumi.Output<string | undefined>;
    public readonly imageOwnerAlias!: pulumi.Output<string | undefined>;
    /**
     * Billing methods. Optional values:
     * - PrePaid: Monthly, or annual subscription. Make sure that your registered credit card is invalid or you have insufficient balance in your PayPal account. Otherwise, InvalidPayMethod error may occur.
     * - PostPaid: Pay-As-You-Go.
     */
    public readonly instanceChargeType!: pulumi.Output<string | undefined>;
    /**
     * The name of the instance. The name is a string of 2 to 128 characters. It must begin with an English or a Chinese character. It can contain A-Z, a-z, Chinese characters, numbers, periods (.), colons (:), underscores (_), and hyphens (-).
     */
    public readonly instanceName!: pulumi.Output<string | undefined>;
    /**
     * Instance type. For more information, call resourceAlicloudInstances to obtain the latest instance type list.
     */
    public readonly instanceType!: pulumi.Output<string | undefined>;
    /**
     * Internet bandwidth billing method. Optional values: PayByTraffic.
     */
    public readonly internetChargeType!: pulumi.Output<string | undefined>;
    /**
     * The maximum inbound bandwidth from the Internet network, measured in Mbit/s. Value range: [1, 200].
     */
    public readonly internetMaxBandwidthIn!: pulumi.Output<number>;
    /**
     * Maximum outbound bandwidth from the Internet, its unit of measurement is Mbit/s. Value range: [0, 100].
     */
    public readonly internetMaxBandwidthOut!: pulumi.Output<number | undefined>;
    /**
     * Whether it is an I/O-optimized instance or not. Optional values:
     * - none
     * - optimized
     */
    public readonly ioOptimized!: pulumi.Output<string | undefined>;
    /**
     * The name of the key pair.
     * - Ignore this parameter for Windows instances. It is null by default. Even if you enter this parameter, only the  Password content is used.
     * - The password logon method for Linux instances is set to forbidden upon initialization.
     */
    public readonly keyPairName!: pulumi.Output<string | undefined>;
    /**
     * The name of the data disk.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The list of network interfaces created with instance.
     */
    public readonly networkInterfaces!: pulumi.Output<outputs.ecs.LaunchTemplateNetworkInterfaces | undefined>;
    /**
     * Network type of the instance. Value options: Classic | VPC.
     */
    public readonly networkType!: pulumi.Output<string | undefined>;
    /**
     * The RAM role name of the instance. You can use the RAM API ListRoles to query instance RAM role names.
     */
    public readonly ramRoleName!: pulumi.Output<string | undefined>;
    public readonly resourceGroupId!: pulumi.Output<string | undefined>;
    /**
     * Whether or not to activate the security enhancement feature and install network security software free of charge. Optional values: Active | Deactive.
     */
    public readonly securityEnhancementStrategy!: pulumi.Output<string | undefined>;
    /**
     * The security group ID must be one in the same VPC.
     */
    public readonly securityGroupId!: pulumi.Output<string | undefined>;
    public readonly spotPriceLimit!: pulumi.Output<number | undefined>;
    /**
     * The spot strategy for a Pay-As-You-Go instance. This parameter is valid and required only when InstanceChargeType is set to PostPaid. Value range:
     * - NoSpot: Normal Pay-As-You-Go instance.
     * - SpotWithPriceLimit: Sets the maximum price for a spot instance.
     * - SpotAsPriceGo: The system automatically calculates the price. The maximum value is the Pay-As-You-Go price.
     */
    public readonly spotStrategy!: pulumi.Output<string | undefined>;
    /**
     * The category of the system disk. System disk type. Optional values:
     * - cloud: Basic cloud disk.
     * - cloud_efficiency: Ultra cloud disk.
     * - cloud_ssd: SSD cloud Disks.
     * - ephemeral_ssd: local SSD Disks
     * - cloud_essd: ESSD cloud Disks.
     */
    public readonly systemDiskCategory!: pulumi.Output<string | undefined>;
    /**
     * System disk description. It cannot begin with http:// or https://.
     */
    public readonly systemDiskDescription!: pulumi.Output<string | undefined>;
    /**
     * System disk name. The name is a string of 2 to 128 characters. It must begin with an English or a Chinese character. It can contain A-Z, a-z, Chinese characters, numbers, periods (.), colons (:), underscores (_), and hyphens (-).
     */
    public readonly systemDiskName!: pulumi.Output<string | undefined>;
    /**
     * Size of the system disk, measured in GB. Value range: [20, 500].
     */
    public readonly systemDiskSize!: pulumi.Output<number | undefined>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * User data of the instance, which is Base64-encoded. Size of the raw data cannot exceed 16 KB.
     */
    public readonly userdata!: pulumi.Output<string | undefined>;
    public readonly vpcId!: pulumi.Output<string | undefined>;
    /**
     * The VSwitch ID for ENI. The instance must be in the same zone of the same VPC network as the ENI, but they may belong to different VSwitches.
     */
    public readonly vswitchId!: pulumi.Output<string | undefined>;
    /**
     * The zone ID of the instance.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a LaunchTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: LaunchTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LaunchTemplateArgs | LaunchTemplateState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as LaunchTemplateState | undefined;
            inputs["autoReleaseTime"] = state ? state.autoReleaseTime : undefined;
            inputs["dataDisks"] = state ? state.dataDisks : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["hostName"] = state ? state.hostName : undefined;
            inputs["imageId"] = state ? state.imageId : undefined;
            inputs["imageOwnerAlias"] = state ? state.imageOwnerAlias : undefined;
            inputs["instanceChargeType"] = state ? state.instanceChargeType : undefined;
            inputs["instanceName"] = state ? state.instanceName : undefined;
            inputs["instanceType"] = state ? state.instanceType : undefined;
            inputs["internetChargeType"] = state ? state.internetChargeType : undefined;
            inputs["internetMaxBandwidthIn"] = state ? state.internetMaxBandwidthIn : undefined;
            inputs["internetMaxBandwidthOut"] = state ? state.internetMaxBandwidthOut : undefined;
            inputs["ioOptimized"] = state ? state.ioOptimized : undefined;
            inputs["keyPairName"] = state ? state.keyPairName : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            inputs["networkType"] = state ? state.networkType : undefined;
            inputs["ramRoleName"] = state ? state.ramRoleName : undefined;
            inputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            inputs["securityEnhancementStrategy"] = state ? state.securityEnhancementStrategy : undefined;
            inputs["securityGroupId"] = state ? state.securityGroupId : undefined;
            inputs["spotPriceLimit"] = state ? state.spotPriceLimit : undefined;
            inputs["spotStrategy"] = state ? state.spotStrategy : undefined;
            inputs["systemDiskCategory"] = state ? state.systemDiskCategory : undefined;
            inputs["systemDiskDescription"] = state ? state.systemDiskDescription : undefined;
            inputs["systemDiskName"] = state ? state.systemDiskName : undefined;
            inputs["systemDiskSize"] = state ? state.systemDiskSize : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["userdata"] = state ? state.userdata : undefined;
            inputs["vpcId"] = state ? state.vpcId : undefined;
            inputs["vswitchId"] = state ? state.vswitchId : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as LaunchTemplateArgs | undefined;
            inputs["autoReleaseTime"] = args ? args.autoReleaseTime : undefined;
            inputs["dataDisks"] = args ? args.dataDisks : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["hostName"] = args ? args.hostName : undefined;
            inputs["imageId"] = args ? args.imageId : undefined;
            inputs["imageOwnerAlias"] = args ? args.imageOwnerAlias : undefined;
            inputs["instanceChargeType"] = args ? args.instanceChargeType : undefined;
            inputs["instanceName"] = args ? args.instanceName : undefined;
            inputs["instanceType"] = args ? args.instanceType : undefined;
            inputs["internetChargeType"] = args ? args.internetChargeType : undefined;
            inputs["internetMaxBandwidthIn"] = args ? args.internetMaxBandwidthIn : undefined;
            inputs["internetMaxBandwidthOut"] = args ? args.internetMaxBandwidthOut : undefined;
            inputs["ioOptimized"] = args ? args.ioOptimized : undefined;
            inputs["keyPairName"] = args ? args.keyPairName : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            inputs["networkType"] = args ? args.networkType : undefined;
            inputs["ramRoleName"] = args ? args.ramRoleName : undefined;
            inputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            inputs["securityEnhancementStrategy"] = args ? args.securityEnhancementStrategy : undefined;
            inputs["securityGroupId"] = args ? args.securityGroupId : undefined;
            inputs["spotPriceLimit"] = args ? args.spotPriceLimit : undefined;
            inputs["spotStrategy"] = args ? args.spotStrategy : undefined;
            inputs["systemDiskCategory"] = args ? args.systemDiskCategory : undefined;
            inputs["systemDiskDescription"] = args ? args.systemDiskDescription : undefined;
            inputs["systemDiskName"] = args ? args.systemDiskName : undefined;
            inputs["systemDiskSize"] = args ? args.systemDiskSize : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["userdata"] = args ? args.userdata : undefined;
            inputs["vpcId"] = args ? args.vpcId : undefined;
            inputs["vswitchId"] = args ? args.vswitchId : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(LaunchTemplate.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LaunchTemplate resources.
 */
export interface LaunchTemplateState {
    /**
     * Instance auto release time. The time is presented using the ISO8601 standard and in UTC time. The format is  YYYY-MM-DDTHH:MM:SSZ.
     */
    readonly autoReleaseTime?: pulumi.Input<string>;
    /**
     * The list of data disks created with instance.
     */
    readonly dataDisks?: pulumi.Input<pulumi.Input<inputs.ecs.LaunchTemplateDataDisk>[]>;
    /**
     * The description of the data disk.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Instance host name.It cannot start or end with a period (.) or a hyphen (-) and it cannot have two or more consecutive periods (.) or hyphens (-).For Windows: The host name can be [2, 15] characters in length. It can contain A-Z, a-z, numbers, periods (.), and hyphens (-). It cannot only contain numbers. For other operating systems: The host name can be [2, 64] characters in length. It can be segments separated by periods (.). It can contain A-Z, a-z, numbers, and hyphens (-).
     */
    readonly hostName?: pulumi.Input<string>;
    /**
     * Image ID.
     */
    readonly imageId?: pulumi.Input<string>;
    readonly imageOwnerAlias?: pulumi.Input<string>;
    /**
     * Billing methods. Optional values:
     * - PrePaid: Monthly, or annual subscription. Make sure that your registered credit card is invalid or you have insufficient balance in your PayPal account. Otherwise, InvalidPayMethod error may occur.
     * - PostPaid: Pay-As-You-Go.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * The name of the instance. The name is a string of 2 to 128 characters. It must begin with an English or a Chinese character. It can contain A-Z, a-z, Chinese characters, numbers, periods (.), colons (:), underscores (_), and hyphens (-).
     */
    readonly instanceName?: pulumi.Input<string>;
    /**
     * Instance type. For more information, call resourceAlicloudInstances to obtain the latest instance type list.
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * Internet bandwidth billing method. Optional values: PayByTraffic.
     */
    readonly internetChargeType?: pulumi.Input<string>;
    /**
     * The maximum inbound bandwidth from the Internet network, measured in Mbit/s. Value range: [1, 200].
     */
    readonly internetMaxBandwidthIn?: pulumi.Input<number>;
    /**
     * Maximum outbound bandwidth from the Internet, its unit of measurement is Mbit/s. Value range: [0, 100].
     */
    readonly internetMaxBandwidthOut?: pulumi.Input<number>;
    /**
     * Whether it is an I/O-optimized instance or not. Optional values:
     * - none
     * - optimized
     */
    readonly ioOptimized?: pulumi.Input<string>;
    /**
     * The name of the key pair.
     * - Ignore this parameter for Windows instances. It is null by default. Even if you enter this parameter, only the  Password content is used.
     * - The password logon method for Linux instances is set to forbidden upon initialization.
     */
    readonly keyPairName?: pulumi.Input<string>;
    /**
     * The name of the data disk.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The list of network interfaces created with instance.
     */
    readonly networkInterfaces?: pulumi.Input<inputs.ecs.LaunchTemplateNetworkInterfaces>;
    /**
     * Network type of the instance. Value options: Classic | VPC.
     */
    readonly networkType?: pulumi.Input<string>;
    /**
     * The RAM role name of the instance. You can use the RAM API ListRoles to query instance RAM role names.
     */
    readonly ramRoleName?: pulumi.Input<string>;
    readonly resourceGroupId?: pulumi.Input<string>;
    /**
     * Whether or not to activate the security enhancement feature and install network security software free of charge. Optional values: Active | Deactive.
     */
    readonly securityEnhancementStrategy?: pulumi.Input<string>;
    /**
     * The security group ID must be one in the same VPC.
     */
    readonly securityGroupId?: pulumi.Input<string>;
    readonly spotPriceLimit?: pulumi.Input<number>;
    /**
     * The spot strategy for a Pay-As-You-Go instance. This parameter is valid and required only when InstanceChargeType is set to PostPaid. Value range:
     * - NoSpot: Normal Pay-As-You-Go instance.
     * - SpotWithPriceLimit: Sets the maximum price for a spot instance.
     * - SpotAsPriceGo: The system automatically calculates the price. The maximum value is the Pay-As-You-Go price.
     */
    readonly spotStrategy?: pulumi.Input<string>;
    /**
     * The category of the system disk. System disk type. Optional values:
     * - cloud: Basic cloud disk.
     * - cloud_efficiency: Ultra cloud disk.
     * - cloud_ssd: SSD cloud Disks.
     * - ephemeral_ssd: local SSD Disks
     * - cloud_essd: ESSD cloud Disks.
     */
    readonly systemDiskCategory?: pulumi.Input<string>;
    /**
     * System disk description. It cannot begin with http:// or https://.
     */
    readonly systemDiskDescription?: pulumi.Input<string>;
    /**
     * System disk name. The name is a string of 2 to 128 characters. It must begin with an English or a Chinese character. It can contain A-Z, a-z, Chinese characters, numbers, periods (.), colons (:), underscores (_), and hyphens (-).
     */
    readonly systemDiskName?: pulumi.Input<string>;
    /**
     * Size of the system disk, measured in GB. Value range: [20, 500].
     */
    readonly systemDiskSize?: pulumi.Input<number>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * User data of the instance, which is Base64-encoded. Size of the raw data cannot exceed 16 KB.
     */
    readonly userdata?: pulumi.Input<string>;
    readonly vpcId?: pulumi.Input<string>;
    /**
     * The VSwitch ID for ENI. The instance must be in the same zone of the same VPC network as the ENI, but they may belong to different VSwitches.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * The zone ID of the instance.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LaunchTemplate resource.
 */
export interface LaunchTemplateArgs {
    /**
     * Instance auto release time. The time is presented using the ISO8601 standard and in UTC time. The format is  YYYY-MM-DDTHH:MM:SSZ.
     */
    readonly autoReleaseTime?: pulumi.Input<string>;
    /**
     * The list of data disks created with instance.
     */
    readonly dataDisks?: pulumi.Input<pulumi.Input<inputs.ecs.LaunchTemplateDataDisk>[]>;
    /**
     * The description of the data disk.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Instance host name.It cannot start or end with a period (.) or a hyphen (-) and it cannot have two or more consecutive periods (.) or hyphens (-).For Windows: The host name can be [2, 15] characters in length. It can contain A-Z, a-z, numbers, periods (.), and hyphens (-). It cannot only contain numbers. For other operating systems: The host name can be [2, 64] characters in length. It can be segments separated by periods (.). It can contain A-Z, a-z, numbers, and hyphens (-).
     */
    readonly hostName?: pulumi.Input<string>;
    /**
     * Image ID.
     */
    readonly imageId?: pulumi.Input<string>;
    readonly imageOwnerAlias?: pulumi.Input<string>;
    /**
     * Billing methods. Optional values:
     * - PrePaid: Monthly, or annual subscription. Make sure that your registered credit card is invalid or you have insufficient balance in your PayPal account. Otherwise, InvalidPayMethod error may occur.
     * - PostPaid: Pay-As-You-Go.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * The name of the instance. The name is a string of 2 to 128 characters. It must begin with an English or a Chinese character. It can contain A-Z, a-z, Chinese characters, numbers, periods (.), colons (:), underscores (_), and hyphens (-).
     */
    readonly instanceName?: pulumi.Input<string>;
    /**
     * Instance type. For more information, call resourceAlicloudInstances to obtain the latest instance type list.
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * Internet bandwidth billing method. Optional values: PayByTraffic.
     */
    readonly internetChargeType?: pulumi.Input<string>;
    /**
     * The maximum inbound bandwidth from the Internet network, measured in Mbit/s. Value range: [1, 200].
     */
    readonly internetMaxBandwidthIn?: pulumi.Input<number>;
    /**
     * Maximum outbound bandwidth from the Internet, its unit of measurement is Mbit/s. Value range: [0, 100].
     */
    readonly internetMaxBandwidthOut?: pulumi.Input<number>;
    /**
     * Whether it is an I/O-optimized instance or not. Optional values:
     * - none
     * - optimized
     */
    readonly ioOptimized?: pulumi.Input<string>;
    /**
     * The name of the key pair.
     * - Ignore this parameter for Windows instances. It is null by default. Even if you enter this parameter, only the  Password content is used.
     * - The password logon method for Linux instances is set to forbidden upon initialization.
     */
    readonly keyPairName?: pulumi.Input<string>;
    /**
     * The name of the data disk.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The list of network interfaces created with instance.
     */
    readonly networkInterfaces?: pulumi.Input<inputs.ecs.LaunchTemplateNetworkInterfaces>;
    /**
     * Network type of the instance. Value options: Classic | VPC.
     */
    readonly networkType?: pulumi.Input<string>;
    /**
     * The RAM role name of the instance. You can use the RAM API ListRoles to query instance RAM role names.
     */
    readonly ramRoleName?: pulumi.Input<string>;
    readonly resourceGroupId?: pulumi.Input<string>;
    /**
     * Whether or not to activate the security enhancement feature and install network security software free of charge. Optional values: Active | Deactive.
     */
    readonly securityEnhancementStrategy?: pulumi.Input<string>;
    /**
     * The security group ID must be one in the same VPC.
     */
    readonly securityGroupId?: pulumi.Input<string>;
    readonly spotPriceLimit?: pulumi.Input<number>;
    /**
     * The spot strategy for a Pay-As-You-Go instance. This parameter is valid and required only when InstanceChargeType is set to PostPaid. Value range:
     * - NoSpot: Normal Pay-As-You-Go instance.
     * - SpotWithPriceLimit: Sets the maximum price for a spot instance.
     * - SpotAsPriceGo: The system automatically calculates the price. The maximum value is the Pay-As-You-Go price.
     */
    readonly spotStrategy?: pulumi.Input<string>;
    /**
     * The category of the system disk. System disk type. Optional values:
     * - cloud: Basic cloud disk.
     * - cloud_efficiency: Ultra cloud disk.
     * - cloud_ssd: SSD cloud Disks.
     * - ephemeral_ssd: local SSD Disks
     * - cloud_essd: ESSD cloud Disks.
     */
    readonly systemDiskCategory?: pulumi.Input<string>;
    /**
     * System disk description. It cannot begin with http:// or https://.
     */
    readonly systemDiskDescription?: pulumi.Input<string>;
    /**
     * System disk name. The name is a string of 2 to 128 characters. It must begin with an English or a Chinese character. It can contain A-Z, a-z, Chinese characters, numbers, periods (.), colons (:), underscores (_), and hyphens (-).
     */
    readonly systemDiskName?: pulumi.Input<string>;
    /**
     * Size of the system disk, measured in GB. Value range: [20, 500].
     */
    readonly systemDiskSize?: pulumi.Input<number>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * User data of the instance, which is Base64-encoded. Size of the raw data cannot exceed 16 KB.
     */
    readonly userdata?: pulumi.Input<string>;
    readonly vpcId?: pulumi.Input<string>;
    /**
     * The VSwitch ID for ENI. The instance must be in the same zone of the same VPC network as the ENI, but they may belong to different VSwitches.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * The zone ID of the instance.
     */
    readonly zoneId?: pulumi.Input<string>;
}