// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package redis

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Redis Tair Instance can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:redis/tairInstance:TairInstance example <id>
//
// ```
type TairInstance struct {
	pulumi.CustomResourceState

	// Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values: true(enables auto-renewal), false(disables auto-renewal).
	AutoRenew pulumi.StringPtrOutput `pulumi:"autoRenew"`
	// The subscription duration that is supported by auto-renewal. Unit: months. Valid values: 1, 2, 3, 6, and 12. This parameter is required only if the AutoRenew parameter is set to true.
	AutoRenewPeriod pulumi.StringPtrOutput `pulumi:"autoRenewPeriod"`
	// The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The time when to change the configurations. Default value: Immediately. Valid values: Immediately (The configurations are immediately changed), MaintainTime (The configurations are changed within the maintenance window).
	EffectiveTime pulumi.StringPtrOutput `pulumi:"effectiveTime"`
	// The database engine version of the instance. Default value: 1.0. The default version is developed by Alibaba Cloud and compatible with Redis 5.0.
	EngineVersion pulumi.StringOutput `pulumi:"engineVersion"`
	// Specifies whether to forcefully change the configurations of the instance. Default value: true. Valid values: false (The system does not forcefully change the configurations), true (The system forcefully changes the configurations).
	ForceUpgrade pulumi.BoolPtrOutput `pulumi:"forceUpgrade"`
	// The instance type of the instance. For more information, see [Instance types](https://www.alibabacloud.com/help/en/apsaradb-for-redis/latest/instance-types).
	InstanceClass pulumi.StringOutput `pulumi:"instanceClass"`
	// The storage medium of the instance. Valid values: tair_rdb, tair_scm, tair_essd.
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// The password that is used to connect to the instance. The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include ! @ # $ % ^ & * ( ) _ + - =.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// The subscription duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24,36, and 60. This parameter is required only if you set the PaymentType parameter to Subscription.
	Period pulumi.IntPtrOutput `pulumi:"period"`
	// The Tair service port. The service port of the instance. Valid values: 1024 to 65535. Default value: 6379.
	Port pulumi.IntOutput `pulumi:"port"`
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The ID of the secondary zone.This parameter is returned only if the instance is deployed in two zones.
	SecondaryZoneId pulumi.StringPtrOutput `pulumi:"secondaryZoneId"`
	// The number of data nodes in the instance. When 1 is passed, it means that the instance created is a standard architecture with only one data node. You can create an instance in the standard architecture that contains only a single data node. 2 to 32: You can create an instance in the cluster architecture that contains the specified number of data nodes. Only persistent memory-optimized instances can use the cluster architecture. Therefore, you can set this parameter to an integer from 2 to 32 only if you set the InstanceType parameter to tair_scm.
	ShardCount pulumi.IntOutput `pulumi:"shardCount"`
	// The status of the instance. Valid values: Normal, Creating, Changing, Inactive, Flushing, Released, Transforming, Unavailable, Error, Migrating, and upgrading, networkModifying, SSLModifying, and MajorVersionUpgrading.
	Status pulumi.StringOutput `pulumi:"status"`
	// The name of the resource.
	TairInstanceName pulumi.StringPtrOutput `pulumi:"tairInstanceName"`
	// The ID of the virtual private cloud (VPC).
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
	// The ID of the vSwitch to which the instance is connected.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
	// The zone ID of the instance.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewTairInstance registers a new resource with the given unique name, arguments, and options.
func NewTairInstance(ctx *pulumi.Context,
	name string, args *TairInstanceArgs, opts ...pulumi.ResourceOption) (*TairInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceClass == nil {
		return nil, errors.New("invalid value for required argument 'InstanceClass'")
	}
	if args.InstanceType == nil {
		return nil, errors.New("invalid value for required argument 'InstanceType'")
	}
	if args.ShardCount == nil {
		return nil, errors.New("invalid value for required argument 'ShardCount'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	var resource TairInstance
	err := ctx.RegisterResource("alicloud:redis/tairInstance:TairInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTairInstance gets an existing TairInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTairInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TairInstanceState, opts ...pulumi.ResourceOption) (*TairInstance, error) {
	var resource TairInstance
	err := ctx.ReadResource("alicloud:redis/tairInstance:TairInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TairInstance resources.
type tairInstanceState struct {
	// Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values: true(enables auto-renewal), false(disables auto-renewal).
	AutoRenew *string `pulumi:"autoRenew"`
	// The subscription duration that is supported by auto-renewal. Unit: months. Valid values: 1, 2, 3, 6, and 12. This parameter is required only if the AutoRenew parameter is set to true.
	AutoRenewPeriod *string `pulumi:"autoRenewPeriod"`
	// The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	CreateTime *string `pulumi:"createTime"`
	// The time when to change the configurations. Default value: Immediately. Valid values: Immediately (The configurations are immediately changed), MaintainTime (The configurations are changed within the maintenance window).
	EffectiveTime *string `pulumi:"effectiveTime"`
	// The database engine version of the instance. Default value: 1.0. The default version is developed by Alibaba Cloud and compatible with Redis 5.0.
	EngineVersion *string `pulumi:"engineVersion"`
	// Specifies whether to forcefully change the configurations of the instance. Default value: true. Valid values: false (The system does not forcefully change the configurations), true (The system forcefully changes the configurations).
	ForceUpgrade *bool `pulumi:"forceUpgrade"`
	// The instance type of the instance. For more information, see [Instance types](https://www.alibabacloud.com/help/en/apsaradb-for-redis/latest/instance-types).
	InstanceClass *string `pulumi:"instanceClass"`
	// The storage medium of the instance. Valid values: tair_rdb, tair_scm, tair_essd.
	InstanceType *string `pulumi:"instanceType"`
	// The password that is used to connect to the instance. The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include ! @ # $ % ^ & * ( ) _ + - =.
	Password *string `pulumi:"password"`
	// Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
	PaymentType *string `pulumi:"paymentType"`
	// The subscription duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24,36, and 60. This parameter is required only if you set the PaymentType parameter to Subscription.
	Period *int `pulumi:"period"`
	// The Tair service port. The service port of the instance. Valid values: 1024 to 65535. Default value: 6379.
	Port *int `pulumi:"port"`
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The ID of the secondary zone.This parameter is returned only if the instance is deployed in two zones.
	SecondaryZoneId *string `pulumi:"secondaryZoneId"`
	// The number of data nodes in the instance. When 1 is passed, it means that the instance created is a standard architecture with only one data node. You can create an instance in the standard architecture that contains only a single data node. 2 to 32: You can create an instance in the cluster architecture that contains the specified number of data nodes. Only persistent memory-optimized instances can use the cluster architecture. Therefore, you can set this parameter to an integer from 2 to 32 only if you set the InstanceType parameter to tair_scm.
	ShardCount *int `pulumi:"shardCount"`
	// The status of the instance. Valid values: Normal, Creating, Changing, Inactive, Flushing, Released, Transforming, Unavailable, Error, Migrating, and upgrading, networkModifying, SSLModifying, and MajorVersionUpgrading.
	Status *string `pulumi:"status"`
	// The name of the resource.
	TairInstanceName *string `pulumi:"tairInstanceName"`
	// The ID of the virtual private cloud (VPC).
	VpcId *string `pulumi:"vpcId"`
	// The ID of the vSwitch to which the instance is connected.
	VswitchId *string `pulumi:"vswitchId"`
	// The zone ID of the instance.
	ZoneId *string `pulumi:"zoneId"`
}

type TairInstanceState struct {
	// Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values: true(enables auto-renewal), false(disables auto-renewal).
	AutoRenew pulumi.StringPtrInput
	// The subscription duration that is supported by auto-renewal. Unit: months. Valid values: 1, 2, 3, 6, and 12. This parameter is required only if the AutoRenew parameter is set to true.
	AutoRenewPeriod pulumi.StringPtrInput
	// The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	CreateTime pulumi.StringPtrInput
	// The time when to change the configurations. Default value: Immediately. Valid values: Immediately (The configurations are immediately changed), MaintainTime (The configurations are changed within the maintenance window).
	EffectiveTime pulumi.StringPtrInput
	// The database engine version of the instance. Default value: 1.0. The default version is developed by Alibaba Cloud and compatible with Redis 5.0.
	EngineVersion pulumi.StringPtrInput
	// Specifies whether to forcefully change the configurations of the instance. Default value: true. Valid values: false (The system does not forcefully change the configurations), true (The system forcefully changes the configurations).
	ForceUpgrade pulumi.BoolPtrInput
	// The instance type of the instance. For more information, see [Instance types](https://www.alibabacloud.com/help/en/apsaradb-for-redis/latest/instance-types).
	InstanceClass pulumi.StringPtrInput
	// The storage medium of the instance. Valid values: tair_rdb, tair_scm, tair_essd.
	InstanceType pulumi.StringPtrInput
	// The password that is used to connect to the instance. The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include ! @ # $ % ^ & * ( ) _ + - =.
	Password pulumi.StringPtrInput
	// Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
	PaymentType pulumi.StringPtrInput
	// The subscription duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24,36, and 60. This parameter is required only if you set the PaymentType parameter to Subscription.
	Period pulumi.IntPtrInput
	// The Tair service port. The service port of the instance. Valid values: 1024 to 65535. Default value: 6379.
	Port pulumi.IntPtrInput
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The ID of the secondary zone.This parameter is returned only if the instance is deployed in two zones.
	SecondaryZoneId pulumi.StringPtrInput
	// The number of data nodes in the instance. When 1 is passed, it means that the instance created is a standard architecture with only one data node. You can create an instance in the standard architecture that contains only a single data node. 2 to 32: You can create an instance in the cluster architecture that contains the specified number of data nodes. Only persistent memory-optimized instances can use the cluster architecture. Therefore, you can set this parameter to an integer from 2 to 32 only if you set the InstanceType parameter to tair_scm.
	ShardCount pulumi.IntPtrInput
	// The status of the instance. Valid values: Normal, Creating, Changing, Inactive, Flushing, Released, Transforming, Unavailable, Error, Migrating, and upgrading, networkModifying, SSLModifying, and MajorVersionUpgrading.
	Status pulumi.StringPtrInput
	// The name of the resource.
	TairInstanceName pulumi.StringPtrInput
	// The ID of the virtual private cloud (VPC).
	VpcId pulumi.StringPtrInput
	// The ID of the vSwitch to which the instance is connected.
	VswitchId pulumi.StringPtrInput
	// The zone ID of the instance.
	ZoneId pulumi.StringPtrInput
}

func (TairInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*tairInstanceState)(nil)).Elem()
}

type tairInstanceArgs struct {
	// Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values: true(enables auto-renewal), false(disables auto-renewal).
	AutoRenew *string `pulumi:"autoRenew"`
	// The subscription duration that is supported by auto-renewal. Unit: months. Valid values: 1, 2, 3, 6, and 12. This parameter is required only if the AutoRenew parameter is set to true.
	AutoRenewPeriod *string `pulumi:"autoRenewPeriod"`
	// The time when to change the configurations. Default value: Immediately. Valid values: Immediately (The configurations are immediately changed), MaintainTime (The configurations are changed within the maintenance window).
	EffectiveTime *string `pulumi:"effectiveTime"`
	// The database engine version of the instance. Default value: 1.0. The default version is developed by Alibaba Cloud and compatible with Redis 5.0.
	EngineVersion *string `pulumi:"engineVersion"`
	// Specifies whether to forcefully change the configurations of the instance. Default value: true. Valid values: false (The system does not forcefully change the configurations), true (The system forcefully changes the configurations).
	ForceUpgrade *bool `pulumi:"forceUpgrade"`
	// The instance type of the instance. For more information, see [Instance types](https://www.alibabacloud.com/help/en/apsaradb-for-redis/latest/instance-types).
	InstanceClass string `pulumi:"instanceClass"`
	// The storage medium of the instance. Valid values: tair_rdb, tair_scm, tair_essd.
	InstanceType string `pulumi:"instanceType"`
	// The password that is used to connect to the instance. The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include ! @ # $ % ^ & * ( ) _ + - =.
	Password *string `pulumi:"password"`
	// Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
	PaymentType *string `pulumi:"paymentType"`
	// The subscription duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24,36, and 60. This parameter is required only if you set the PaymentType parameter to Subscription.
	Period *int `pulumi:"period"`
	// The Tair service port. The service port of the instance. Valid values: 1024 to 65535. Default value: 6379.
	Port *int `pulumi:"port"`
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The ID of the secondary zone.This parameter is returned only if the instance is deployed in two zones.
	SecondaryZoneId *string `pulumi:"secondaryZoneId"`
	// The number of data nodes in the instance. When 1 is passed, it means that the instance created is a standard architecture with only one data node. You can create an instance in the standard architecture that contains only a single data node. 2 to 32: You can create an instance in the cluster architecture that contains the specified number of data nodes. Only persistent memory-optimized instances can use the cluster architecture. Therefore, you can set this parameter to an integer from 2 to 32 only if you set the InstanceType parameter to tair_scm.
	ShardCount int `pulumi:"shardCount"`
	// The name of the resource.
	TairInstanceName *string `pulumi:"tairInstanceName"`
	// The ID of the virtual private cloud (VPC).
	VpcId string `pulumi:"vpcId"`
	// The ID of the vSwitch to which the instance is connected.
	VswitchId string `pulumi:"vswitchId"`
	// The zone ID of the instance.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a TairInstance resource.
type TairInstanceArgs struct {
	// Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values: true(enables auto-renewal), false(disables auto-renewal).
	AutoRenew pulumi.StringPtrInput
	// The subscription duration that is supported by auto-renewal. Unit: months. Valid values: 1, 2, 3, 6, and 12. This parameter is required only if the AutoRenew parameter is set to true.
	AutoRenewPeriod pulumi.StringPtrInput
	// The time when to change the configurations. Default value: Immediately. Valid values: Immediately (The configurations are immediately changed), MaintainTime (The configurations are changed within the maintenance window).
	EffectiveTime pulumi.StringPtrInput
	// The database engine version of the instance. Default value: 1.0. The default version is developed by Alibaba Cloud and compatible with Redis 5.0.
	EngineVersion pulumi.StringPtrInput
	// Specifies whether to forcefully change the configurations of the instance. Default value: true. Valid values: false (The system does not forcefully change the configurations), true (The system forcefully changes the configurations).
	ForceUpgrade pulumi.BoolPtrInput
	// The instance type of the instance. For more information, see [Instance types](https://www.alibabacloud.com/help/en/apsaradb-for-redis/latest/instance-types).
	InstanceClass pulumi.StringInput
	// The storage medium of the instance. Valid values: tair_rdb, tair_scm, tair_essd.
	InstanceType pulumi.StringInput
	// The password that is used to connect to the instance. The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include ! @ # $ % ^ & * ( ) _ + - =.
	Password pulumi.StringPtrInput
	// Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
	PaymentType pulumi.StringPtrInput
	// The subscription duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24,36, and 60. This parameter is required only if you set the PaymentType parameter to Subscription.
	Period pulumi.IntPtrInput
	// The Tair service port. The service port of the instance. Valid values: 1024 to 65535. Default value: 6379.
	Port pulumi.IntPtrInput
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The ID of the secondary zone.This parameter is returned only if the instance is deployed in two zones.
	SecondaryZoneId pulumi.StringPtrInput
	// The number of data nodes in the instance. When 1 is passed, it means that the instance created is a standard architecture with only one data node. You can create an instance in the standard architecture that contains only a single data node. 2 to 32: You can create an instance in the cluster architecture that contains the specified number of data nodes. Only persistent memory-optimized instances can use the cluster architecture. Therefore, you can set this parameter to an integer from 2 to 32 only if you set the InstanceType parameter to tair_scm.
	ShardCount pulumi.IntInput
	// The name of the resource.
	TairInstanceName pulumi.StringPtrInput
	// The ID of the virtual private cloud (VPC).
	VpcId pulumi.StringInput
	// The ID of the vSwitch to which the instance is connected.
	VswitchId pulumi.StringInput
	// The zone ID of the instance.
	ZoneId pulumi.StringInput
}

func (TairInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tairInstanceArgs)(nil)).Elem()
}

type TairInstanceInput interface {
	pulumi.Input

	ToTairInstanceOutput() TairInstanceOutput
	ToTairInstanceOutputWithContext(ctx context.Context) TairInstanceOutput
}

func (*TairInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**TairInstance)(nil)).Elem()
}

func (i *TairInstance) ToTairInstanceOutput() TairInstanceOutput {
	return i.ToTairInstanceOutputWithContext(context.Background())
}

func (i *TairInstance) ToTairInstanceOutputWithContext(ctx context.Context) TairInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TairInstanceOutput)
}

// TairInstanceArrayInput is an input type that accepts TairInstanceArray and TairInstanceArrayOutput values.
// You can construct a concrete instance of `TairInstanceArrayInput` via:
//
//	TairInstanceArray{ TairInstanceArgs{...} }
type TairInstanceArrayInput interface {
	pulumi.Input

	ToTairInstanceArrayOutput() TairInstanceArrayOutput
	ToTairInstanceArrayOutputWithContext(context.Context) TairInstanceArrayOutput
}

type TairInstanceArray []TairInstanceInput

func (TairInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TairInstance)(nil)).Elem()
}

func (i TairInstanceArray) ToTairInstanceArrayOutput() TairInstanceArrayOutput {
	return i.ToTairInstanceArrayOutputWithContext(context.Background())
}

func (i TairInstanceArray) ToTairInstanceArrayOutputWithContext(ctx context.Context) TairInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TairInstanceArrayOutput)
}

// TairInstanceMapInput is an input type that accepts TairInstanceMap and TairInstanceMapOutput values.
// You can construct a concrete instance of `TairInstanceMapInput` via:
//
//	TairInstanceMap{ "key": TairInstanceArgs{...} }
type TairInstanceMapInput interface {
	pulumi.Input

	ToTairInstanceMapOutput() TairInstanceMapOutput
	ToTairInstanceMapOutputWithContext(context.Context) TairInstanceMapOutput
}

type TairInstanceMap map[string]TairInstanceInput

func (TairInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TairInstance)(nil)).Elem()
}

func (i TairInstanceMap) ToTairInstanceMapOutput() TairInstanceMapOutput {
	return i.ToTairInstanceMapOutputWithContext(context.Background())
}

func (i TairInstanceMap) ToTairInstanceMapOutputWithContext(ctx context.Context) TairInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TairInstanceMapOutput)
}

type TairInstanceOutput struct{ *pulumi.OutputState }

func (TairInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TairInstance)(nil)).Elem()
}

func (o TairInstanceOutput) ToTairInstanceOutput() TairInstanceOutput {
	return o
}

func (o TairInstanceOutput) ToTairInstanceOutputWithContext(ctx context.Context) TairInstanceOutput {
	return o
}

// Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values: true(enables auto-renewal), false(disables auto-renewal).
func (o TairInstanceOutput) AutoRenew() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringPtrOutput { return v.AutoRenew }).(pulumi.StringPtrOutput)
}

// The subscription duration that is supported by auto-renewal. Unit: months. Valid values: 1, 2, 3, 6, and 12. This parameter is required only if the AutoRenew parameter is set to true.
func (o TairInstanceOutput) AutoRenewPeriod() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringPtrOutput { return v.AutoRenewPeriod }).(pulumi.StringPtrOutput)
}

// The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
func (o TairInstanceOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The time when to change the configurations. Default value: Immediately. Valid values: Immediately (The configurations are immediately changed), MaintainTime (The configurations are changed within the maintenance window).
func (o TairInstanceOutput) EffectiveTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringPtrOutput { return v.EffectiveTime }).(pulumi.StringPtrOutput)
}

// The database engine version of the instance. Default value: 1.0. The default version is developed by Alibaba Cloud and compatible with Redis 5.0.
func (o TairInstanceOutput) EngineVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringOutput { return v.EngineVersion }).(pulumi.StringOutput)
}

// Specifies whether to forcefully change the configurations of the instance. Default value: true. Valid values: false (The system does not forcefully change the configurations), true (The system forcefully changes the configurations).
func (o TairInstanceOutput) ForceUpgrade() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.BoolPtrOutput { return v.ForceUpgrade }).(pulumi.BoolPtrOutput)
}

// The instance type of the instance. For more information, see [Instance types](https://www.alibabacloud.com/help/en/apsaradb-for-redis/latest/instance-types).
func (o TairInstanceOutput) InstanceClass() pulumi.StringOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringOutput { return v.InstanceClass }).(pulumi.StringOutput)
}

// The storage medium of the instance. Valid values: tair_rdb, tair_scm, tair_essd.
func (o TairInstanceOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

// The password that is used to connect to the instance. The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include ! @ # $ % ^ & * ( ) _ + - =.
func (o TairInstanceOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
func (o TairInstanceOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// The subscription duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24,36, and 60. This parameter is required only if you set the PaymentType parameter to Subscription.
func (o TairInstanceOutput) Period() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.IntPtrOutput { return v.Period }).(pulumi.IntPtrOutput)
}

// The Tair service port. The service port of the instance. Valid values: 1024 to 65535. Default value: 6379.
func (o TairInstanceOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.IntOutput { return v.Port }).(pulumi.IntOutput)
}

// The ID of the resource group to which the instance belongs.
func (o TairInstanceOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The ID of the secondary zone.This parameter is returned only if the instance is deployed in two zones.
func (o TairInstanceOutput) SecondaryZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringPtrOutput { return v.SecondaryZoneId }).(pulumi.StringPtrOutput)
}

// The number of data nodes in the instance. When 1 is passed, it means that the instance created is a standard architecture with only one data node. You can create an instance in the standard architecture that contains only a single data node. 2 to 32: You can create an instance in the cluster architecture that contains the specified number of data nodes. Only persistent memory-optimized instances can use the cluster architecture. Therefore, you can set this parameter to an integer from 2 to 32 only if you set the InstanceType parameter to tair_scm.
func (o TairInstanceOutput) ShardCount() pulumi.IntOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.IntOutput { return v.ShardCount }).(pulumi.IntOutput)
}

// The status of the instance. Valid values: Normal, Creating, Changing, Inactive, Flushing, Released, Transforming, Unavailable, Error, Migrating, and upgrading, networkModifying, SSLModifying, and MajorVersionUpgrading.
func (o TairInstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The name of the resource.
func (o TairInstanceOutput) TairInstanceName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringPtrOutput { return v.TairInstanceName }).(pulumi.StringPtrOutput)
}

// The ID of the virtual private cloud (VPC).
func (o TairInstanceOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

// The ID of the vSwitch to which the instance is connected.
func (o TairInstanceOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringOutput { return v.VswitchId }).(pulumi.StringOutput)
}

// The zone ID of the instance.
func (o TairInstanceOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *TairInstance) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type TairInstanceArrayOutput struct{ *pulumi.OutputState }

func (TairInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TairInstance)(nil)).Elem()
}

func (o TairInstanceArrayOutput) ToTairInstanceArrayOutput() TairInstanceArrayOutput {
	return o
}

func (o TairInstanceArrayOutput) ToTairInstanceArrayOutputWithContext(ctx context.Context) TairInstanceArrayOutput {
	return o
}

func (o TairInstanceArrayOutput) Index(i pulumi.IntInput) TairInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TairInstance {
		return vs[0].([]*TairInstance)[vs[1].(int)]
	}).(TairInstanceOutput)
}

type TairInstanceMapOutput struct{ *pulumi.OutputState }

func (TairInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TairInstance)(nil)).Elem()
}

func (o TairInstanceMapOutput) ToTairInstanceMapOutput() TairInstanceMapOutput {
	return o
}

func (o TairInstanceMapOutput) ToTairInstanceMapOutputWithContext(ctx context.Context) TairInstanceMapOutput {
	return o
}

func (o TairInstanceMapOutput) MapIndex(k pulumi.StringInput) TairInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TairInstance {
		return vs[0].(map[string]*TairInstance)[vs[1].(string)]
	}).(TairInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TairInstanceInput)(nil)).Elem(), &TairInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*TairInstanceArrayInput)(nil)).Elem(), TairInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TairInstanceMapInput)(nil)).Elem(), TairInstanceMap{})
	pulumi.RegisterOutputType(TairInstanceOutput{})
	pulumi.RegisterOutputType(TairInstanceArrayOutput{})
	pulumi.RegisterOutputType(TairInstanceMapOutput{})
}