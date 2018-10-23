import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a ECS instance resource.
 *
 * ~> **NOTE:** You can launch an ECS instance for a VPC network via specifying parameter `vswitch_id`. One instance can only belong to one VSwitch.
 *
 * ~> **NOTE:** If a VSwitchId is specified for creating an instance, SecurityGroupId and VSwitchId must belong to one VPC.
 *
 * ~> **NOTE:** Several instance types have outdated in some regions and availability zones, such as `ecs.t1.*`, `ecs.s2.*`, `ecs.n1.*` and so on. If you want to keep them, you should set `is_outdated` to true. For more about the upgraded instance type, refer to `alicloud_instance_types` datasource.
 *
 * ~> **NOTE:** At present, 'PrePaid' instance cannot be deleted and must wait it to be outdated and release it automatically.
 *
 * ~> **NOTE:** The resource supports modifying instance charge type from 'PrePaid' to 'PostPaid' from version 1.9.6.
 *  However, at present, this modification has some limitation about CPU core count in one month, so strongly recommand that `Don't modify instance charge type frequentlly in one month`.
 */
export declare class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState): Instance;
    /**
     * It has been deprecated from version "1.7.0". Setting "internet_max_bandwidth_out" larger than 0 can allocate a public ip address for an instance.
     */
    readonly allocatePublicIp: pulumi.Output<boolean | undefined>;
    /**
     * Auto renewal period of an instance, in the unit of month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid value:
     * - [1, 2, 3, 6, 12] when `period_unit` in "Month"
     * - [1, 2, 3] when `period_unit` in "Week"
     */
    readonly autoRenewPeriod: pulumi.Output<number | undefined>;
    /**
     * The Zone to start the instance in. It is ignored and will be computed when set `vswitch_id`.
     */
    readonly availabilityZone: pulumi.Output<string>;
    /**
     * Description of the instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * Whether to pre-detection. When it is true, only pre-detection and not actually modify the payment type operation. It is valid when `instance_charge_type` is 'PrePaid'. Default to false.
     */
    readonly dryRun: pulumi.Output<boolean | undefined>;
    /**
     * If it is true, the "PrePaid" instance will be change to "PostPaid" and then deleted forcibly.
     * However, because of changing instance charge type has CPU core count quota limitation, so strongly recommand that "Don't modify instance charge type frequentlly in one month".
     */
    readonly forceDelete: pulumi.Output<boolean | undefined>;
    /**
     * Host name of the ECS, which is a string of at least two characters. “hostname” cannot start or end with “.” or “-“. In addition, two or more consecutive “.” or “-“ symbols are not allowed. On Windows, the host name can contain a maximum of 15 characters, which can be a combination of uppercase/lowercase letters, numerals, and “-“. The host name cannot contain dots (“.”) or contain only numeric characters.
     * On other OSs such as Linux, the host name can contain a maximum of 30 characters, which can be segments separated by dots (“.”), where each segment can contain uppercase/lowercase letters, numerals, or “_“. When it is changed, the instance will reboot to make the change take effect.
     */
    readonly hostName: pulumi.Output<string>;
    /**
     * The Image to use for the instance. ECS instance's image can be replaced via changing 'image_id'. When it is changed, the instance will reboot to make the change take effect.
     */
    readonly imageId: pulumi.Output<string>;
    /**
     * Whether to change instance disks charge type when changing instance charge type.
     */
    readonly includeDataDisks: pulumi.Output<boolean | undefined>;
    /**
     * Valid values are `PrePaid`, `PostPaid`, The default is `PostPaid`.
     */
    readonly instanceChargeType: pulumi.Output<string | undefined>;
    /**
     * The name of the ECS. This instance_name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. If not specified,
     * Terraform will autogenerate a default name is `ECS-Instance`.
     */
    readonly instanceName: pulumi.Output<string | undefined>;
    /**
     * The type of instance to start.
     */
    readonly instanceType: pulumi.Output<string>;
    /**
     * Internet charge type of the instance, Valid values are `PayByBandwidth`, `PayByTraffic`. Default is `PayByTraffic`. At present, 'PrePaid' instance cannot change the value to "PayByBandwidth" from "PayByTraffic".
     */
    readonly internetChargeType: pulumi.Output<string | undefined>;
    /**
     * Maximum incoming bandwidth from the public network, measured in Mbps (Mega bit per second). Value range: [1, 200]. If this value is not specified, then automatically sets it to 200 Mbps.
     */
    readonly internetMaxBandwidthIn: pulumi.Output<number>;
    /**
     * Maximum outgoing bandwidth to the public network, measured in Mbps (Mega bit per second). Value range:  [0, 100]. Default to 0 Mbps.
     */
    readonly internetMaxBandwidthOut: pulumi.Output<number | undefined>;
    /**
     * It has been deprecated on instance resource. All the launched alicloud instances will be I/O optimized.
     */
    readonly ioOptimized: pulumi.Output<string | undefined>;
    /**
     * Whether to use outdated instance type. Default to false.
     */
    readonly isOutdated: pulumi.Output<boolean | undefined>;
    /**
     * The name of key pair that can login ECS instance successfully without password. If it is specified, the password would be invalid.
     */
    readonly keyName: pulumi.Output<string>;
    /**
     * Password to an instance is a string of 8 to 30 characters. It must contain uppercase/lowercase letters and numerals, but cannot contain special symbols. When it is changed, the instance will reboot to make the change take effect.
     */
    readonly password: pulumi.Output<string | undefined>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values:
     * - [1-9, 12, 24, 36, 48, 60] when `period_unit` in "Month"
     * - [1-3] when `period_unit` in "Week"
     */
    readonly period: pulumi.Output<number | undefined>;
    /**
     * The duration unit that you will buy the resource. It is valid when `instance_charge_type` is 'PrePaid'. Valid value: ["Week", "Month"]. Default to "Month".
     */
    readonly periodUnit: pulumi.Output<string | undefined>;
    /**
     * Instance private IP address can be specified when you creating new instance. It is valid when `vswitch_id` is specified.
     */
    readonly privateIp: pulumi.Output<string>;
    /**
     * The instance public ip.
     */
    readonly publicIp: pulumi.Output<string>;
    /**
     * Whether to renew an ECS instance automatically or not. It is valid when `instance_charge_type` is `PrePaid`. Default to "Normal". Valid values:
     * - `AutoRenewal`: Enable auto renewal.
     * - `Normal`: Disable auto renewal.
     * - `NotRenewal`: No renewal any longer. After you specify this value, Alibaba Cloud stop sending notification of instance expiry, and only gives a brief reminder on the third day before the instance expiry.
     */
    readonly renewalStatus: pulumi.Output<string | undefined>;
    /**
     * Instance RAM role name. The name is provided and maintained by RAM. You can use `alicloud_ram_role` to create a new one.
     */
    readonly roleName: pulumi.Output<string>;
    /**
     * A list of security group ids to associate with.
     */
    readonly securityGroups: pulumi.Output<string[]>;
    /**
     * The hourly price threshold of a instance, and it takes effect only when parameter 'spot_strategy' is 'SpotWithPriceLimit'. Three decimals is allowed at most.
     */
    readonly spotPriceLimit: pulumi.Output<number | undefined>;
    /**
     * The spot strategy of a Pay-As-You-Go instance, and it takes effect only when parameter `instance_charge_type` is 'PostPaid'. Value range:
     * - NoSpot: A regular Pay-As-You-Go instance.
     * - SpotWithPriceLimit: A price threshold for a spot instance
     * - SpotAsPriceGo: A price that is based on the highest Pay-As-You-Go instance
     */
    readonly spotStrategy: pulumi.Output<string | undefined>;
    /**
     * The instance status.
     */
    readonly status: pulumi.Output<string>;
    readonly subnetId: pulumi.Output<string>;
    /**
     * Valid values are `cloud_efficiency`, `cloud_ssd` and `cloud`. `cloud` only is used to some none I/O optimized instance. Default to `cloud_efficiency`.
     */
    readonly systemDiskCategory: pulumi.Output<string | undefined>;
    /**
     * Size of the system disk, value range: 40GB ~ 500GB. Default is 40GB. ECS instance's system disk can be reset when replacing system disk.
     */
    readonly systemDiskSize: pulumi.Output<number | undefined>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags: pulumi.Output<{
        [key: string]: any;
    } | undefined>;
    /**
     * User-defined data to customize the startup behaviors of an ECS instance and to pass data into an ECS instance.
     */
    readonly userData: pulumi.Output<string | undefined>;
    /**
     * The virtual switch ID to launch in VPC. If you want to create instances in VPC network, this parameter must be set.
     */
    readonly vswitchId: pulumi.Output<string | undefined>;
    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * It has been deprecated from version "1.7.0". Setting "internet_max_bandwidth_out" larger than 0 can allocate a public ip address for an instance.
     */
    readonly allocatePublicIp?: pulumi.Input<boolean>;
    /**
     * Auto renewal period of an instance, in the unit of month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid value:
     * - [1, 2, 3, 6, 12] when `period_unit` in "Month"
     * - [1, 2, 3] when `period_unit` in "Week"
     */
    readonly autoRenewPeriod?: pulumi.Input<number>;
    /**
     * The Zone to start the instance in. It is ignored and will be computed when set `vswitch_id`.
     */
    readonly availabilityZone?: pulumi.Input<string>;
    /**
     * Description of the instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether to pre-detection. When it is true, only pre-detection and not actually modify the payment type operation. It is valid when `instance_charge_type` is 'PrePaid'. Default to false.
     */
    readonly dryRun?: pulumi.Input<boolean>;
    /**
     * If it is true, the "PrePaid" instance will be change to "PostPaid" and then deleted forcibly.
     * However, because of changing instance charge type has CPU core count quota limitation, so strongly recommand that "Don't modify instance charge type frequentlly in one month".
     */
    readonly forceDelete?: pulumi.Input<boolean>;
    /**
     * Host name of the ECS, which is a string of at least two characters. “hostname” cannot start or end with “.” or “-“. In addition, two or more consecutive “.” or “-“ symbols are not allowed. On Windows, the host name can contain a maximum of 15 characters, which can be a combination of uppercase/lowercase letters, numerals, and “-“. The host name cannot contain dots (“.”) or contain only numeric characters.
     * On other OSs such as Linux, the host name can contain a maximum of 30 characters, which can be segments separated by dots (“.”), where each segment can contain uppercase/lowercase letters, numerals, or “_“. When it is changed, the instance will reboot to make the change take effect.
     */
    readonly hostName?: pulumi.Input<string>;
    /**
     * The Image to use for the instance. ECS instance's image can be replaced via changing 'image_id'. When it is changed, the instance will reboot to make the change take effect.
     */
    readonly imageId?: pulumi.Input<string>;
    /**
     * Whether to change instance disks charge type when changing instance charge type.
     */
    readonly includeDataDisks?: pulumi.Input<boolean>;
    /**
     * Valid values are `PrePaid`, `PostPaid`, The default is `PostPaid`.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * The name of the ECS. This instance_name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. If not specified,
     * Terraform will autogenerate a default name is `ECS-Instance`.
     */
    readonly instanceName?: pulumi.Input<string>;
    /**
     * The type of instance to start.
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * Internet charge type of the instance, Valid values are `PayByBandwidth`, `PayByTraffic`. Default is `PayByTraffic`. At present, 'PrePaid' instance cannot change the value to "PayByBandwidth" from "PayByTraffic".
     */
    readonly internetChargeType?: pulumi.Input<string>;
    /**
     * Maximum incoming bandwidth from the public network, measured in Mbps (Mega bit per second). Value range: [1, 200]. If this value is not specified, then automatically sets it to 200 Mbps.
     */
    readonly internetMaxBandwidthIn?: pulumi.Input<number>;
    /**
     * Maximum outgoing bandwidth to the public network, measured in Mbps (Mega bit per second). Value range:  [0, 100]. Default to 0 Mbps.
     */
    readonly internetMaxBandwidthOut?: pulumi.Input<number>;
    /**
     * It has been deprecated on instance resource. All the launched alicloud instances will be I/O optimized.
     */
    readonly ioOptimized?: pulumi.Input<string>;
    /**
     * Whether to use outdated instance type. Default to false.
     */
    readonly isOutdated?: pulumi.Input<boolean>;
    /**
     * The name of key pair that can login ECS instance successfully without password. If it is specified, the password would be invalid.
     */
    readonly keyName?: pulumi.Input<string>;
    /**
     * Password to an instance is a string of 8 to 30 characters. It must contain uppercase/lowercase letters and numerals, but cannot contain special symbols. When it is changed, the instance will reboot to make the change take effect.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values:
     * - [1-9, 12, 24, 36, 48, 60] when `period_unit` in "Month"
     * - [1-3] when `period_unit` in "Week"
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The duration unit that you will buy the resource. It is valid when `instance_charge_type` is 'PrePaid'. Valid value: ["Week", "Month"]. Default to "Month".
     */
    readonly periodUnit?: pulumi.Input<string>;
    /**
     * Instance private IP address can be specified when you creating new instance. It is valid when `vswitch_id` is specified.
     */
    readonly privateIp?: pulumi.Input<string>;
    /**
     * The instance public ip.
     */
    readonly publicIp?: pulumi.Input<string>;
    /**
     * Whether to renew an ECS instance automatically or not. It is valid when `instance_charge_type` is `PrePaid`. Default to "Normal". Valid values:
     * - `AutoRenewal`: Enable auto renewal.
     * - `Normal`: Disable auto renewal.
     * - `NotRenewal`: No renewal any longer. After you specify this value, Alibaba Cloud stop sending notification of instance expiry, and only gives a brief reminder on the third day before the instance expiry.
     */
    readonly renewalStatus?: pulumi.Input<string>;
    /**
     * Instance RAM role name. The name is provided and maintained by RAM. You can use `alicloud_ram_role` to create a new one.
     */
    readonly roleName?: pulumi.Input<string>;
    /**
     * A list of security group ids to associate with.
     */
    readonly securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The hourly price threshold of a instance, and it takes effect only when parameter 'spot_strategy' is 'SpotWithPriceLimit'. Three decimals is allowed at most.
     */
    readonly spotPriceLimit?: pulumi.Input<number>;
    /**
     * The spot strategy of a Pay-As-You-Go instance, and it takes effect only when parameter `instance_charge_type` is 'PostPaid'. Value range:
     * - NoSpot: A regular Pay-As-You-Go instance.
     * - SpotWithPriceLimit: A price threshold for a spot instance
     * - SpotAsPriceGo: A price that is based on the highest Pay-As-You-Go instance
     */
    readonly spotStrategy?: pulumi.Input<string>;
    /**
     * The instance status.
     */
    readonly status?: pulumi.Input<string>;
    readonly subnetId?: pulumi.Input<string>;
    /**
     * Valid values are `cloud_efficiency`, `cloud_ssd` and `cloud`. `cloud` only is used to some none I/O optimized instance. Default to `cloud_efficiency`.
     */
    readonly systemDiskCategory?: pulumi.Input<string>;
    /**
     * Size of the system disk, value range: 40GB ~ 500GB. Default is 40GB. ECS instance's system disk can be reset when replacing system disk.
     */
    readonly systemDiskSize?: pulumi.Input<number>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{
        [key: string]: any;
    }>;
    /**
     * User-defined data to customize the startup behaviors of an ECS instance and to pass data into an ECS instance.
     */
    readonly userData?: pulumi.Input<string>;
    /**
     * The virtual switch ID to launch in VPC. If you want to create instances in VPC network, this parameter must be set.
     */
    readonly vswitchId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * It has been deprecated from version "1.7.0". Setting "internet_max_bandwidth_out" larger than 0 can allocate a public ip address for an instance.
     */
    readonly allocatePublicIp?: pulumi.Input<boolean>;
    /**
     * Auto renewal period of an instance, in the unit of month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid value:
     * - [1, 2, 3, 6, 12] when `period_unit` in "Month"
     * - [1, 2, 3] when `period_unit` in "Week"
     */
    readonly autoRenewPeriod?: pulumi.Input<number>;
    /**
     * The Zone to start the instance in. It is ignored and will be computed when set `vswitch_id`.
     */
    readonly availabilityZone?: pulumi.Input<string>;
    /**
     * Description of the instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether to pre-detection. When it is true, only pre-detection and not actually modify the payment type operation. It is valid when `instance_charge_type` is 'PrePaid'. Default to false.
     */
    readonly dryRun?: pulumi.Input<boolean>;
    /**
     * If it is true, the "PrePaid" instance will be change to "PostPaid" and then deleted forcibly.
     * However, because of changing instance charge type has CPU core count quota limitation, so strongly recommand that "Don't modify instance charge type frequentlly in one month".
     */
    readonly forceDelete?: pulumi.Input<boolean>;
    /**
     * Host name of the ECS, which is a string of at least two characters. “hostname” cannot start or end with “.” or “-“. In addition, two or more consecutive “.” or “-“ symbols are not allowed. On Windows, the host name can contain a maximum of 15 characters, which can be a combination of uppercase/lowercase letters, numerals, and “-“. The host name cannot contain dots (“.”) or contain only numeric characters.
     * On other OSs such as Linux, the host name can contain a maximum of 30 characters, which can be segments separated by dots (“.”), where each segment can contain uppercase/lowercase letters, numerals, or “_“. When it is changed, the instance will reboot to make the change take effect.
     */
    readonly hostName?: pulumi.Input<string>;
    /**
     * The Image to use for the instance. ECS instance's image can be replaced via changing 'image_id'. When it is changed, the instance will reboot to make the change take effect.
     */
    readonly imageId: pulumi.Input<string>;
    /**
     * Whether to change instance disks charge type when changing instance charge type.
     */
    readonly includeDataDisks?: pulumi.Input<boolean>;
    /**
     * Valid values are `PrePaid`, `PostPaid`, The default is `PostPaid`.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * The name of the ECS. This instance_name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. If not specified,
     * Terraform will autogenerate a default name is `ECS-Instance`.
     */
    readonly instanceName?: pulumi.Input<string>;
    /**
     * The type of instance to start.
     */
    readonly instanceType: pulumi.Input<string>;
    /**
     * Internet charge type of the instance, Valid values are `PayByBandwidth`, `PayByTraffic`. Default is `PayByTraffic`. At present, 'PrePaid' instance cannot change the value to "PayByBandwidth" from "PayByTraffic".
     */
    readonly internetChargeType?: pulumi.Input<string>;
    /**
     * Maximum incoming bandwidth from the public network, measured in Mbps (Mega bit per second). Value range: [1, 200]. If this value is not specified, then automatically sets it to 200 Mbps.
     */
    readonly internetMaxBandwidthIn?: pulumi.Input<number>;
    /**
     * Maximum outgoing bandwidth to the public network, measured in Mbps (Mega bit per second). Value range:  [0, 100]. Default to 0 Mbps.
     */
    readonly internetMaxBandwidthOut?: pulumi.Input<number>;
    /**
     * It has been deprecated on instance resource. All the launched alicloud instances will be I/O optimized.
     */
    readonly ioOptimized?: pulumi.Input<string>;
    /**
     * Whether to use outdated instance type. Default to false.
     */
    readonly isOutdated?: pulumi.Input<boolean>;
    /**
     * The name of key pair that can login ECS instance successfully without password. If it is specified, the password would be invalid.
     */
    readonly keyName?: pulumi.Input<string>;
    /**
     * Password to an instance is a string of 8 to 30 characters. It must contain uppercase/lowercase letters and numerals, but cannot contain special symbols. When it is changed, the instance will reboot to make the change take effect.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values:
     * - [1-9, 12, 24, 36, 48, 60] when `period_unit` in "Month"
     * - [1-3] when `period_unit` in "Week"
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The duration unit that you will buy the resource. It is valid when `instance_charge_type` is 'PrePaid'. Valid value: ["Week", "Month"]. Default to "Month".
     */
    readonly periodUnit?: pulumi.Input<string>;
    /**
     * Instance private IP address can be specified when you creating new instance. It is valid when `vswitch_id` is specified.
     */
    readonly privateIp?: pulumi.Input<string>;
    /**
     * Whether to renew an ECS instance automatically or not. It is valid when `instance_charge_type` is `PrePaid`. Default to "Normal". Valid values:
     * - `AutoRenewal`: Enable auto renewal.
     * - `Normal`: Disable auto renewal.
     * - `NotRenewal`: No renewal any longer. After you specify this value, Alibaba Cloud stop sending notification of instance expiry, and only gives a brief reminder on the third day before the instance expiry.
     */
    readonly renewalStatus?: pulumi.Input<string>;
    /**
     * Instance RAM role name. The name is provided and maintained by RAM. You can use `alicloud_ram_role` to create a new one.
     */
    readonly roleName?: pulumi.Input<string>;
    /**
     * A list of security group ids to associate with.
     */
    readonly securityGroups: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The hourly price threshold of a instance, and it takes effect only when parameter 'spot_strategy' is 'SpotWithPriceLimit'. Three decimals is allowed at most.
     */
    readonly spotPriceLimit?: pulumi.Input<number>;
    /**
     * The spot strategy of a Pay-As-You-Go instance, and it takes effect only when parameter `instance_charge_type` is 'PostPaid'. Value range:
     * - NoSpot: A regular Pay-As-You-Go instance.
     * - SpotWithPriceLimit: A price threshold for a spot instance
     * - SpotAsPriceGo: A price that is based on the highest Pay-As-You-Go instance
     */
    readonly spotStrategy?: pulumi.Input<string>;
    readonly subnetId?: pulumi.Input<string>;
    /**
     * Valid values are `cloud_efficiency`, `cloud_ssd` and `cloud`. `cloud` only is used to some none I/O optimized instance. Default to `cloud_efficiency`.
     */
    readonly systemDiskCategory?: pulumi.Input<string>;
    /**
     * Size of the system disk, value range: 40GB ~ 500GB. Default is 40GB. ECS instance's system disk can be reset when replacing system disk.
     */
    readonly systemDiskSize?: pulumi.Input<number>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{
        [key: string]: any;
    }>;
    /**
     * User-defined data to customize the startup behaviors of an ECS instance and to pass data into an ECS instance.
     */
    readonly userData?: pulumi.Input<string>;
    /**
     * The virtual switch ID to launch in VPC. If you want to create instances in VPC network, this parameter must be set.
     */
    readonly vswitchId?: pulumi.Input<string>;
}
