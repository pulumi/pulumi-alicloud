// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a RDS Custom resource.
//
// Dedicated RDS User host.
//
// For information about RDS Custom and how to use it, see [What is Custom](https://www.alibabacloud.com/help/en/).
//
// > **NOTE:** Available since v1.235.0.
//
// ## Import
//
// RDS Custom can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:rds/custom:Custom example <id>
// ```
type Custom struct {
	pulumi.CustomResourceState

	// Represents the number of instances created
	Amount pulumi.IntOutput `pulumi:"amount"`
	// Whether to pay automatically. Value range:
	AutoPay pulumi.BoolPtrOutput `pulumi:"autoPay"`
	// Whether the instance is automatically renewed. Valid values: true/false. The default is false.
	AutoRenew pulumi.BoolPtrOutput `pulumi:"autoRenew"`
	// Whether to allow joining the ACK cluster. When this parameter is set to `1`, the created instance can be added to the ACK cluster through The `AttachRCInstances` API to efficiently manage container applications.
	CreateMode pulumi.StringPtrOutput `pulumi:"createMode"`
	// Data disk See `dataDisk` below.
	DataDisks CustomDataDiskArrayOutput `pulumi:"dataDisks"`
	// The ID of the deployment set.
	DeploymentSetId pulumi.StringPtrOutput `pulumi:"deploymentSetId"`
	// Instance description. It must be 2 to 256 characters in length and cannot start with http:// or https.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Instance configuration type, value range:
	//
	// > **NOTE:**  This parameter does not need to be uploaded, and the system can automatically determine whether to upgrade or downgrade. If you want to upload, please follow the following logic rules.
	// - `Up` (default): upgrade the instance specification. Please ensure that your account balance is sufficient.
	// - `Down`: Downgrade instance specifications. When the instance type set to InstanceType is lower than the current instance type, set Direction = down.
	Direction pulumi.StringPtrOutput `pulumi:"direction"`
	// Whether to pre-check the operation of creating an instance. Valid values:
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// Whether to forcibly release the running instance. Value: true/false
	Force pulumi.BoolPtrOutput `pulumi:"force"`
	// Whether to force shutdown. Value range:
	ForceStop pulumi.BoolPtrOutput `pulumi:"forceStop"`
	// The instance host name.
	HostName pulumi.StringPtrOutput `pulumi:"hostName"`
	// The ID of the image used by the instance.
	ImageId pulumi.StringPtrOutput `pulumi:"imageId"`
	// The Payment type. Currently, only `Prepaid` (package year and month) types are supported.
	InstanceChargeType pulumi.StringPtrOutput `pulumi:"instanceChargeType"`
	// The type of the created RDS Custom dedicated host instance.
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// Reserved parameters are not supported.
	InternetChargeType pulumi.StringPtrOutput `pulumi:"internetChargeType"`
	// Reserved parameters are not supported.
	InternetMaxBandwidthOut pulumi.IntPtrOutput `pulumi:"internetMaxBandwidthOut"`
	// Reserved parameters are not supported.
	IoOptimized pulumi.StringPtrOutput `pulumi:"ioOptimized"`
	// The key pair name. Only flyer names are supported.
	KeyPairName pulumi.StringPtrOutput `pulumi:"keyPairName"`
	// The account and password of the instance.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// Prepaid renewal duration, unit: Month/Year.
	Period pulumi.IntPtrOutput `pulumi:"period"`
	// The unit of duration of the year-to-month billing method. Value range:
	// - `Year`: Year
	// - `Month` (default): Month
	PeriodUnit pulumi.StringPtrOutput `pulumi:"periodUnit"`
	// The region ID. Callable DescribeRegions to get.
	RegionId pulumi.StringOutput `pulumi:"regionId"`
	// The ID of the resource group
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// Reserved parameters are not supported.
	SecurityEnhancementStrategy pulumi.StringPtrOutput `pulumi:"securityEnhancementStrategy"`
	// Security group list
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// The status of the resource
	Status pulumi.StringOutput `pulumi:"status"`
	// System disk specifications. See `systemDisk` below.
	SystemDisk CustomSystemDiskPtrOutput `pulumi:"systemDisk"`
	// The tag of the resource
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The ID of the virtual switch. The zone in which the vSwitch is located must correspond to the zone ID entered in ZoneId.
	//
	// The network type InstanceNetworkType must be VPC.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
	// The zone ID  of the resource
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewCustom registers a new resource with the given unique name, arguments, and options.
func NewCustom(ctx *pulumi.Context,
	name string, args *CustomArgs, opts ...pulumi.ResourceOption) (*Custom, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Amount == nil {
		return nil, errors.New("invalid value for required argument 'Amount'")
	}
	if args.InstanceType == nil {
		return nil, errors.New("invalid value for required argument 'InstanceType'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Custom
	err := ctx.RegisterResource("alicloud:rds/custom:Custom", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustom gets an existing Custom resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustom(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomState, opts ...pulumi.ResourceOption) (*Custom, error) {
	var resource Custom
	err := ctx.ReadResource("alicloud:rds/custom:Custom", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Custom resources.
type customState struct {
	// Represents the number of instances created
	Amount *int `pulumi:"amount"`
	// Whether to pay automatically. Value range:
	AutoPay *bool `pulumi:"autoPay"`
	// Whether the instance is automatically renewed. Valid values: true/false. The default is false.
	AutoRenew *bool `pulumi:"autoRenew"`
	// Whether to allow joining the ACK cluster. When this parameter is set to `1`, the created instance can be added to the ACK cluster through The `AttachRCInstances` API to efficiently manage container applications.
	CreateMode *string `pulumi:"createMode"`
	// Data disk See `dataDisk` below.
	DataDisks []CustomDataDisk `pulumi:"dataDisks"`
	// The ID of the deployment set.
	DeploymentSetId *string `pulumi:"deploymentSetId"`
	// Instance description. It must be 2 to 256 characters in length and cannot start with http:// or https.
	Description *string `pulumi:"description"`
	// Instance configuration type, value range:
	//
	// > **NOTE:**  This parameter does not need to be uploaded, and the system can automatically determine whether to upgrade or downgrade. If you want to upload, please follow the following logic rules.
	// - `Up` (default): upgrade the instance specification. Please ensure that your account balance is sufficient.
	// - `Down`: Downgrade instance specifications. When the instance type set to InstanceType is lower than the current instance type, set Direction = down.
	Direction *string `pulumi:"direction"`
	// Whether to pre-check the operation of creating an instance. Valid values:
	DryRun *bool `pulumi:"dryRun"`
	// Whether to forcibly release the running instance. Value: true/false
	Force *bool `pulumi:"force"`
	// Whether to force shutdown. Value range:
	ForceStop *bool `pulumi:"forceStop"`
	// The instance host name.
	HostName *string `pulumi:"hostName"`
	// The ID of the image used by the instance.
	ImageId *string `pulumi:"imageId"`
	// The Payment type. Currently, only `Prepaid` (package year and month) types are supported.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// The type of the created RDS Custom dedicated host instance.
	InstanceType *string `pulumi:"instanceType"`
	// Reserved parameters are not supported.
	InternetChargeType *string `pulumi:"internetChargeType"`
	// Reserved parameters are not supported.
	InternetMaxBandwidthOut *int `pulumi:"internetMaxBandwidthOut"`
	// Reserved parameters are not supported.
	IoOptimized *string `pulumi:"ioOptimized"`
	// The key pair name. Only flyer names are supported.
	KeyPairName *string `pulumi:"keyPairName"`
	// The account and password of the instance.
	Password *string `pulumi:"password"`
	// Prepaid renewal duration, unit: Month/Year.
	Period *int `pulumi:"period"`
	// The unit of duration of the year-to-month billing method. Value range:
	// - `Year`: Year
	// - `Month` (default): Month
	PeriodUnit *string `pulumi:"periodUnit"`
	// The region ID. Callable DescribeRegions to get.
	RegionId *string `pulumi:"regionId"`
	// The ID of the resource group
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Reserved parameters are not supported.
	SecurityEnhancementStrategy *string `pulumi:"securityEnhancementStrategy"`
	// Security group list
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The status of the resource
	Status *string `pulumi:"status"`
	// System disk specifications. See `systemDisk` below.
	SystemDisk *CustomSystemDisk `pulumi:"systemDisk"`
	// The tag of the resource
	Tags map[string]string `pulumi:"tags"`
	// The ID of the virtual switch. The zone in which the vSwitch is located must correspond to the zone ID entered in ZoneId.
	//
	// The network type InstanceNetworkType must be VPC.
	VswitchId *string `pulumi:"vswitchId"`
	// The zone ID  of the resource
	ZoneId *string `pulumi:"zoneId"`
}

type CustomState struct {
	// Represents the number of instances created
	Amount pulumi.IntPtrInput
	// Whether to pay automatically. Value range:
	AutoPay pulumi.BoolPtrInput
	// Whether the instance is automatically renewed. Valid values: true/false. The default is false.
	AutoRenew pulumi.BoolPtrInput
	// Whether to allow joining the ACK cluster. When this parameter is set to `1`, the created instance can be added to the ACK cluster through The `AttachRCInstances` API to efficiently manage container applications.
	CreateMode pulumi.StringPtrInput
	// Data disk See `dataDisk` below.
	DataDisks CustomDataDiskArrayInput
	// The ID of the deployment set.
	DeploymentSetId pulumi.StringPtrInput
	// Instance description. It must be 2 to 256 characters in length and cannot start with http:// or https.
	Description pulumi.StringPtrInput
	// Instance configuration type, value range:
	//
	// > **NOTE:**  This parameter does not need to be uploaded, and the system can automatically determine whether to upgrade or downgrade. If you want to upload, please follow the following logic rules.
	// - `Up` (default): upgrade the instance specification. Please ensure that your account balance is sufficient.
	// - `Down`: Downgrade instance specifications. When the instance type set to InstanceType is lower than the current instance type, set Direction = down.
	Direction pulumi.StringPtrInput
	// Whether to pre-check the operation of creating an instance. Valid values:
	DryRun pulumi.BoolPtrInput
	// Whether to forcibly release the running instance. Value: true/false
	Force pulumi.BoolPtrInput
	// Whether to force shutdown. Value range:
	ForceStop pulumi.BoolPtrInput
	// The instance host name.
	HostName pulumi.StringPtrInput
	// The ID of the image used by the instance.
	ImageId pulumi.StringPtrInput
	// The Payment type. Currently, only `Prepaid` (package year and month) types are supported.
	InstanceChargeType pulumi.StringPtrInput
	// The type of the created RDS Custom dedicated host instance.
	InstanceType pulumi.StringPtrInput
	// Reserved parameters are not supported.
	InternetChargeType pulumi.StringPtrInput
	// Reserved parameters are not supported.
	InternetMaxBandwidthOut pulumi.IntPtrInput
	// Reserved parameters are not supported.
	IoOptimized pulumi.StringPtrInput
	// The key pair name. Only flyer names are supported.
	KeyPairName pulumi.StringPtrInput
	// The account and password of the instance.
	Password pulumi.StringPtrInput
	// Prepaid renewal duration, unit: Month/Year.
	Period pulumi.IntPtrInput
	// The unit of duration of the year-to-month billing method. Value range:
	// - `Year`: Year
	// - `Month` (default): Month
	PeriodUnit pulumi.StringPtrInput
	// The region ID. Callable DescribeRegions to get.
	RegionId pulumi.StringPtrInput
	// The ID of the resource group
	ResourceGroupId pulumi.StringPtrInput
	// Reserved parameters are not supported.
	SecurityEnhancementStrategy pulumi.StringPtrInput
	// Security group list
	SecurityGroupIds pulumi.StringArrayInput
	// The status of the resource
	Status pulumi.StringPtrInput
	// System disk specifications. See `systemDisk` below.
	SystemDisk CustomSystemDiskPtrInput
	// The tag of the resource
	Tags pulumi.StringMapInput
	// The ID of the virtual switch. The zone in which the vSwitch is located must correspond to the zone ID entered in ZoneId.
	//
	// The network type InstanceNetworkType must be VPC.
	VswitchId pulumi.StringPtrInput
	// The zone ID  of the resource
	ZoneId pulumi.StringPtrInput
}

func (CustomState) ElementType() reflect.Type {
	return reflect.TypeOf((*customState)(nil)).Elem()
}

type customArgs struct {
	// Represents the number of instances created
	Amount int `pulumi:"amount"`
	// Whether to pay automatically. Value range:
	AutoPay *bool `pulumi:"autoPay"`
	// Whether the instance is automatically renewed. Valid values: true/false. The default is false.
	AutoRenew *bool `pulumi:"autoRenew"`
	// Whether to allow joining the ACK cluster. When this parameter is set to `1`, the created instance can be added to the ACK cluster through The `AttachRCInstances` API to efficiently manage container applications.
	CreateMode *string `pulumi:"createMode"`
	// Data disk See `dataDisk` below.
	DataDisks []CustomDataDisk `pulumi:"dataDisks"`
	// The ID of the deployment set.
	DeploymentSetId *string `pulumi:"deploymentSetId"`
	// Instance description. It must be 2 to 256 characters in length and cannot start with http:// or https.
	Description *string `pulumi:"description"`
	// Instance configuration type, value range:
	//
	// > **NOTE:**  This parameter does not need to be uploaded, and the system can automatically determine whether to upgrade or downgrade. If you want to upload, please follow the following logic rules.
	// - `Up` (default): upgrade the instance specification. Please ensure that your account balance is sufficient.
	// - `Down`: Downgrade instance specifications. When the instance type set to InstanceType is lower than the current instance type, set Direction = down.
	Direction *string `pulumi:"direction"`
	// Whether to pre-check the operation of creating an instance. Valid values:
	DryRun *bool `pulumi:"dryRun"`
	// Whether to forcibly release the running instance. Value: true/false
	Force *bool `pulumi:"force"`
	// Whether to force shutdown. Value range:
	ForceStop *bool `pulumi:"forceStop"`
	// The instance host name.
	HostName *string `pulumi:"hostName"`
	// The ID of the image used by the instance.
	ImageId *string `pulumi:"imageId"`
	// The Payment type. Currently, only `Prepaid` (package year and month) types are supported.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// The type of the created RDS Custom dedicated host instance.
	InstanceType string `pulumi:"instanceType"`
	// Reserved parameters are not supported.
	InternetChargeType *string `pulumi:"internetChargeType"`
	// Reserved parameters are not supported.
	InternetMaxBandwidthOut *int `pulumi:"internetMaxBandwidthOut"`
	// Reserved parameters are not supported.
	IoOptimized *string `pulumi:"ioOptimized"`
	// The key pair name. Only flyer names are supported.
	KeyPairName *string `pulumi:"keyPairName"`
	// The account and password of the instance.
	Password *string `pulumi:"password"`
	// Prepaid renewal duration, unit: Month/Year.
	Period *int `pulumi:"period"`
	// The unit of duration of the year-to-month billing method. Value range:
	// - `Year`: Year
	// - `Month` (default): Month
	PeriodUnit *string `pulumi:"periodUnit"`
	// The ID of the resource group
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Reserved parameters are not supported.
	SecurityEnhancementStrategy *string `pulumi:"securityEnhancementStrategy"`
	// Security group list
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The status of the resource
	Status *string `pulumi:"status"`
	// System disk specifications. See `systemDisk` below.
	SystemDisk *CustomSystemDisk `pulumi:"systemDisk"`
	// The tag of the resource
	Tags map[string]string `pulumi:"tags"`
	// The ID of the virtual switch. The zone in which the vSwitch is located must correspond to the zone ID entered in ZoneId.
	//
	// The network type InstanceNetworkType must be VPC.
	VswitchId string `pulumi:"vswitchId"`
	// The zone ID  of the resource
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Custom resource.
type CustomArgs struct {
	// Represents the number of instances created
	Amount pulumi.IntInput
	// Whether to pay automatically. Value range:
	AutoPay pulumi.BoolPtrInput
	// Whether the instance is automatically renewed. Valid values: true/false. The default is false.
	AutoRenew pulumi.BoolPtrInput
	// Whether to allow joining the ACK cluster. When this parameter is set to `1`, the created instance can be added to the ACK cluster through The `AttachRCInstances` API to efficiently manage container applications.
	CreateMode pulumi.StringPtrInput
	// Data disk See `dataDisk` below.
	DataDisks CustomDataDiskArrayInput
	// The ID of the deployment set.
	DeploymentSetId pulumi.StringPtrInput
	// Instance description. It must be 2 to 256 characters in length and cannot start with http:// or https.
	Description pulumi.StringPtrInput
	// Instance configuration type, value range:
	//
	// > **NOTE:**  This parameter does not need to be uploaded, and the system can automatically determine whether to upgrade or downgrade. If you want to upload, please follow the following logic rules.
	// - `Up` (default): upgrade the instance specification. Please ensure that your account balance is sufficient.
	// - `Down`: Downgrade instance specifications. When the instance type set to InstanceType is lower than the current instance type, set Direction = down.
	Direction pulumi.StringPtrInput
	// Whether to pre-check the operation of creating an instance. Valid values:
	DryRun pulumi.BoolPtrInput
	// Whether to forcibly release the running instance. Value: true/false
	Force pulumi.BoolPtrInput
	// Whether to force shutdown. Value range:
	ForceStop pulumi.BoolPtrInput
	// The instance host name.
	HostName pulumi.StringPtrInput
	// The ID of the image used by the instance.
	ImageId pulumi.StringPtrInput
	// The Payment type. Currently, only `Prepaid` (package year and month) types are supported.
	InstanceChargeType pulumi.StringPtrInput
	// The type of the created RDS Custom dedicated host instance.
	InstanceType pulumi.StringInput
	// Reserved parameters are not supported.
	InternetChargeType pulumi.StringPtrInput
	// Reserved parameters are not supported.
	InternetMaxBandwidthOut pulumi.IntPtrInput
	// Reserved parameters are not supported.
	IoOptimized pulumi.StringPtrInput
	// The key pair name. Only flyer names are supported.
	KeyPairName pulumi.StringPtrInput
	// The account and password of the instance.
	Password pulumi.StringPtrInput
	// Prepaid renewal duration, unit: Month/Year.
	Period pulumi.IntPtrInput
	// The unit of duration of the year-to-month billing method. Value range:
	// - `Year`: Year
	// - `Month` (default): Month
	PeriodUnit pulumi.StringPtrInput
	// The ID of the resource group
	ResourceGroupId pulumi.StringPtrInput
	// Reserved parameters are not supported.
	SecurityEnhancementStrategy pulumi.StringPtrInput
	// Security group list
	SecurityGroupIds pulumi.StringArrayInput
	// The status of the resource
	Status pulumi.StringPtrInput
	// System disk specifications. See `systemDisk` below.
	SystemDisk CustomSystemDiskPtrInput
	// The tag of the resource
	Tags pulumi.StringMapInput
	// The ID of the virtual switch. The zone in which the vSwitch is located must correspond to the zone ID entered in ZoneId.
	//
	// The network type InstanceNetworkType must be VPC.
	VswitchId pulumi.StringInput
	// The zone ID  of the resource
	ZoneId pulumi.StringPtrInput
}

func (CustomArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customArgs)(nil)).Elem()
}

type CustomInput interface {
	pulumi.Input

	ToCustomOutput() CustomOutput
	ToCustomOutputWithContext(ctx context.Context) CustomOutput
}

func (*Custom) ElementType() reflect.Type {
	return reflect.TypeOf((**Custom)(nil)).Elem()
}

func (i *Custom) ToCustomOutput() CustomOutput {
	return i.ToCustomOutputWithContext(context.Background())
}

func (i *Custom) ToCustomOutputWithContext(ctx context.Context) CustomOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomOutput)
}

// CustomArrayInput is an input type that accepts CustomArray and CustomArrayOutput values.
// You can construct a concrete instance of `CustomArrayInput` via:
//
//	CustomArray{ CustomArgs{...} }
type CustomArrayInput interface {
	pulumi.Input

	ToCustomArrayOutput() CustomArrayOutput
	ToCustomArrayOutputWithContext(context.Context) CustomArrayOutput
}

type CustomArray []CustomInput

func (CustomArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Custom)(nil)).Elem()
}

func (i CustomArray) ToCustomArrayOutput() CustomArrayOutput {
	return i.ToCustomArrayOutputWithContext(context.Background())
}

func (i CustomArray) ToCustomArrayOutputWithContext(ctx context.Context) CustomArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomArrayOutput)
}

// CustomMapInput is an input type that accepts CustomMap and CustomMapOutput values.
// You can construct a concrete instance of `CustomMapInput` via:
//
//	CustomMap{ "key": CustomArgs{...} }
type CustomMapInput interface {
	pulumi.Input

	ToCustomMapOutput() CustomMapOutput
	ToCustomMapOutputWithContext(context.Context) CustomMapOutput
}

type CustomMap map[string]CustomInput

func (CustomMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Custom)(nil)).Elem()
}

func (i CustomMap) ToCustomMapOutput() CustomMapOutput {
	return i.ToCustomMapOutputWithContext(context.Background())
}

func (i CustomMap) ToCustomMapOutputWithContext(ctx context.Context) CustomMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomMapOutput)
}

type CustomOutput struct{ *pulumi.OutputState }

func (CustomOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Custom)(nil)).Elem()
}

func (o CustomOutput) ToCustomOutput() CustomOutput {
	return o
}

func (o CustomOutput) ToCustomOutputWithContext(ctx context.Context) CustomOutput {
	return o
}

// Represents the number of instances created
func (o CustomOutput) Amount() pulumi.IntOutput {
	return o.ApplyT(func(v *Custom) pulumi.IntOutput { return v.Amount }).(pulumi.IntOutput)
}

// Whether to pay automatically. Value range:
func (o CustomOutput) AutoPay() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.BoolPtrOutput { return v.AutoPay }).(pulumi.BoolPtrOutput)
}

// Whether the instance is automatically renewed. Valid values: true/false. The default is false.
func (o CustomOutput) AutoRenew() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.BoolPtrOutput { return v.AutoRenew }).(pulumi.BoolPtrOutput)
}

// Whether to allow joining the ACK cluster. When this parameter is set to `1`, the created instance can be added to the ACK cluster through The `AttachRCInstances` API to efficiently manage container applications.
func (o CustomOutput) CreateMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.CreateMode }).(pulumi.StringPtrOutput)
}

// Data disk See `dataDisk` below.
func (o CustomOutput) DataDisks() CustomDataDiskArrayOutput {
	return o.ApplyT(func(v *Custom) CustomDataDiskArrayOutput { return v.DataDisks }).(CustomDataDiskArrayOutput)
}

// The ID of the deployment set.
func (o CustomOutput) DeploymentSetId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.DeploymentSetId }).(pulumi.StringPtrOutput)
}

// Instance description. It must be 2 to 256 characters in length and cannot start with http:// or https.
func (o CustomOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Instance configuration type, value range:
//
// > **NOTE:**  This parameter does not need to be uploaded, and the system can automatically determine whether to upgrade or downgrade. If you want to upload, please follow the following logic rules.
// - `Up` (default): upgrade the instance specification. Please ensure that your account balance is sufficient.
// - `Down`: Downgrade instance specifications. When the instance type set to InstanceType is lower than the current instance type, set Direction = down.
func (o CustomOutput) Direction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.Direction }).(pulumi.StringPtrOutput)
}

// Whether to pre-check the operation of creating an instance. Valid values:
func (o CustomOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// Whether to forcibly release the running instance. Value: true/false
func (o CustomOutput) Force() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.BoolPtrOutput { return v.Force }).(pulumi.BoolPtrOutput)
}

// Whether to force shutdown. Value range:
func (o CustomOutput) ForceStop() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.BoolPtrOutput { return v.ForceStop }).(pulumi.BoolPtrOutput)
}

// The instance host name.
func (o CustomOutput) HostName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.HostName }).(pulumi.StringPtrOutput)
}

// The ID of the image used by the instance.
func (o CustomOutput) ImageId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.ImageId }).(pulumi.StringPtrOutput)
}

// The Payment type. Currently, only `Prepaid` (package year and month) types are supported.
func (o CustomOutput) InstanceChargeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.InstanceChargeType }).(pulumi.StringPtrOutput)
}

// The type of the created RDS Custom dedicated host instance.
func (o CustomOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

// Reserved parameters are not supported.
func (o CustomOutput) InternetChargeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.InternetChargeType }).(pulumi.StringPtrOutput)
}

// Reserved parameters are not supported.
func (o CustomOutput) InternetMaxBandwidthOut() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.IntPtrOutput { return v.InternetMaxBandwidthOut }).(pulumi.IntPtrOutput)
}

// Reserved parameters are not supported.
func (o CustomOutput) IoOptimized() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.IoOptimized }).(pulumi.StringPtrOutput)
}

// The key pair name. Only flyer names are supported.
func (o CustomOutput) KeyPairName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.KeyPairName }).(pulumi.StringPtrOutput)
}

// The account and password of the instance.
func (o CustomOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// Prepaid renewal duration, unit: Month/Year.
func (o CustomOutput) Period() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.IntPtrOutput { return v.Period }).(pulumi.IntPtrOutput)
}

// The unit of duration of the year-to-month billing method. Value range:
// - `Year`: Year
// - `Month` (default): Month
func (o CustomOutput) PeriodUnit() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.PeriodUnit }).(pulumi.StringPtrOutput)
}

// The region ID. Callable DescribeRegions to get.
func (o CustomOutput) RegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringOutput { return v.RegionId }).(pulumi.StringOutput)
}

// The ID of the resource group
func (o CustomOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// Reserved parameters are not supported.
func (o CustomOutput) SecurityEnhancementStrategy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.SecurityEnhancementStrategy }).(pulumi.StringPtrOutput)
}

// Security group list
func (o CustomOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringArrayOutput { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

// The status of the resource
func (o CustomOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// System disk specifications. See `systemDisk` below.
func (o CustomOutput) SystemDisk() CustomSystemDiskPtrOutput {
	return o.ApplyT(func(v *Custom) CustomSystemDiskPtrOutput { return v.SystemDisk }).(CustomSystemDiskPtrOutput)
}

// The tag of the resource
func (o CustomOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The ID of the virtual switch. The zone in which the vSwitch is located must correspond to the zone ID entered in ZoneId.
//
// The network type InstanceNetworkType must be VPC.
func (o CustomOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringOutput { return v.VswitchId }).(pulumi.StringOutput)
}

// The zone ID  of the resource
func (o CustomOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Custom) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type CustomArrayOutput struct{ *pulumi.OutputState }

func (CustomArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Custom)(nil)).Elem()
}

func (o CustomArrayOutput) ToCustomArrayOutput() CustomArrayOutput {
	return o
}

func (o CustomArrayOutput) ToCustomArrayOutputWithContext(ctx context.Context) CustomArrayOutput {
	return o
}

func (o CustomArrayOutput) Index(i pulumi.IntInput) CustomOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Custom {
		return vs[0].([]*Custom)[vs[1].(int)]
	}).(CustomOutput)
}

type CustomMapOutput struct{ *pulumi.OutputState }

func (CustomMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Custom)(nil)).Elem()
}

func (o CustomMapOutput) ToCustomMapOutput() CustomMapOutput {
	return o
}

func (o CustomMapOutput) ToCustomMapOutputWithContext(ctx context.Context) CustomMapOutput {
	return o
}

func (o CustomMapOutput) MapIndex(k pulumi.StringInput) CustomOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Custom {
		return vs[0].(map[string]*Custom)[vs[1].(string)]
	}).(CustomOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomInput)(nil)).Elem(), &Custom{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomArrayInput)(nil)).Elem(), CustomArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomMapInput)(nil)).Elem(), CustomMap{})
	pulumi.RegisterOutputType(CustomOutput{})
	pulumi.RegisterOutputType(CustomArrayOutput{})
	pulumi.RegisterOutputType(CustomMapOutput{})
}
