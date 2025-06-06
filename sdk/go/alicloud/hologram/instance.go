// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hologram

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Hologram Instance can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:hologram/instance:Instance example <id>
// ```
type Instance struct {
	pulumi.CustomResourceState

	// Whether to pay automatically. The default value is true. Value:
	// - true: automatic payment
	// - false: only generate orders, not pay
	// > **NOTE:**  The default value is true. If the balance of your payment method is insufficient, you can set the parameter AutoPay to false, and an unpaid order will be generated. You can log in to the user Center to pay by yourself.
	AutoPay pulumi.BoolPtrOutput `pulumi:"autoPay"`
	// Instance low-frequency storage space. Unit: GB.
	// > **NOTE:**  PayAsYouGo (PostPaid) instances ignore this parameter.
	ColdStorageSize pulumi.IntPtrOutput `pulumi:"coldStorageSize"`
	// Instance specifications. Value:
	// - 8 cores 32 GB (number of compute nodes: 1)
	// - 16 cores 64 GB (number of compute nodes: 1)
	// - 32 core 128 GB (number of compute nodes: 2)
	// - 64 core 256 GB (number of compute nodes: 4)
	// - 96 core 384 GB (number of computing nodes: 6)
	// - 128 core 512 GB (number of compute nodes: 8)
	// > **NOTE:** Just fill in the audit number. Please submit a work order application for purchasing 1024 or above specifications. Shared instance types do not need to specify specifications. The specification of - 8 core 32GB (number of computing nodes: 1) is only for experience use and cannot be used for production.
	Cpu pulumi.IntOutput `pulumi:"cpu"`
	// The creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The buying cycle. Buy for 2 months. If the Payment type is PayAsYouGo (PostPaid), you do not need to specify it.
	Duration pulumi.IntPtrOutput `pulumi:"duration"`
	// List of domain names. See `endpoints` below.
	Endpoints InstanceEndpointArrayOutput `pulumi:"endpoints"`
	// Number of gateway nodes.
	GatewayCount pulumi.IntPtrOutput `pulumi:"gatewayCount"`
	// Initialize the database and split multiple database names ",".
	InitialDatabases pulumi.StringPtrOutput `pulumi:"initialDatabases"`
	// The name of the resource.
	InstanceName pulumi.StringOutput `pulumi:"instanceName"`
	// The instance type. Value:
	// - Standard: Universal.
	// - Follower: Read-only slave instance.
	// - Warehouse: calculation group type.
	// - Shared: Shared.
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// The ID of the primary instance.
	LeaderInstanceId pulumi.StringPtrOutput `pulumi:"leaderInstanceId"`
	// The payment type of the resource.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// Billing cycle. Value:
	// - Month: monthly billing
	// - Hour: hourly billing
	// > **NOTE:**  Subscription instances (PrePaid) only supports Month. PayAsYouGo instances (PostPaid) only supports Hour. The Shared type is automatically set to Hour without specifying it.
	PricingCycle pulumi.StringPtrOutput `pulumi:"pricingCycle"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// Change matching type. Value:
	// - UPGRADE: UPGRADE
	// - DOWNGRADE: Downgrading
	// > **NOTE:** The upgrade specification cannot be less than the original specification. A blank field indicates that the original specification remains unchanged. On this basis, at least one specification is larger than the original specification. The downgrading specification cannot be greater than the original specification. A blank field indicates that the original specification remains unchanged. On this basis, at least one specification is smaller than the original specification.
	ScaleType pulumi.StringPtrOutput `pulumi:"scaleType"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// The standard storage space of the instance. Unit: GB.
	// > **NOTE:**  PayAsYouGo instances (PostPaid) ignore this parameter.
	StorageSize pulumi.IntPtrOutput `pulumi:"storageSize"`
	// Instance tag.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The zone Id. Refer to "Instructions for Use".
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewInstance registers a new resource with the given unique name, arguments, and options.
func NewInstance(ctx *pulumi.Context,
	name string, args *InstanceArgs, opts ...pulumi.ResourceOption) (*Instance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceName == nil {
		return nil, errors.New("invalid value for required argument 'InstanceName'")
	}
	if args.InstanceType == nil {
		return nil, errors.New("invalid value for required argument 'InstanceType'")
	}
	if args.PaymentType == nil {
		return nil, errors.New("invalid value for required argument 'PaymentType'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Instance
	err := ctx.RegisterResource("alicloud:hologram/instance:Instance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstance gets an existing Instance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceState, opts ...pulumi.ResourceOption) (*Instance, error) {
	var resource Instance
	err := ctx.ReadResource("alicloud:hologram/instance:Instance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Instance resources.
type instanceState struct {
	// Whether to pay automatically. The default value is true. Value:
	// - true: automatic payment
	// - false: only generate orders, not pay
	// > **NOTE:**  The default value is true. If the balance of your payment method is insufficient, you can set the parameter AutoPay to false, and an unpaid order will be generated. You can log in to the user Center to pay by yourself.
	AutoPay *bool `pulumi:"autoPay"`
	// Instance low-frequency storage space. Unit: GB.
	// > **NOTE:**  PayAsYouGo (PostPaid) instances ignore this parameter.
	ColdStorageSize *int `pulumi:"coldStorageSize"`
	// Instance specifications. Value:
	// - 8 cores 32 GB (number of compute nodes: 1)
	// - 16 cores 64 GB (number of compute nodes: 1)
	// - 32 core 128 GB (number of compute nodes: 2)
	// - 64 core 256 GB (number of compute nodes: 4)
	// - 96 core 384 GB (number of computing nodes: 6)
	// - 128 core 512 GB (number of compute nodes: 8)
	// > **NOTE:** Just fill in the audit number. Please submit a work order application for purchasing 1024 or above specifications. Shared instance types do not need to specify specifications. The specification of - 8 core 32GB (number of computing nodes: 1) is only for experience use and cannot be used for production.
	Cpu *int `pulumi:"cpu"`
	// The creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// The buying cycle. Buy for 2 months. If the Payment type is PayAsYouGo (PostPaid), you do not need to specify it.
	Duration *int `pulumi:"duration"`
	// List of domain names. See `endpoints` below.
	Endpoints []InstanceEndpoint `pulumi:"endpoints"`
	// Number of gateway nodes.
	GatewayCount *int `pulumi:"gatewayCount"`
	// Initialize the database and split multiple database names ",".
	InitialDatabases *string `pulumi:"initialDatabases"`
	// The name of the resource.
	InstanceName *string `pulumi:"instanceName"`
	// The instance type. Value:
	// - Standard: Universal.
	// - Follower: Read-only slave instance.
	// - Warehouse: calculation group type.
	// - Shared: Shared.
	InstanceType *string `pulumi:"instanceType"`
	// The ID of the primary instance.
	LeaderInstanceId *string `pulumi:"leaderInstanceId"`
	// The payment type of the resource.
	PaymentType *string `pulumi:"paymentType"`
	// Billing cycle. Value:
	// - Month: monthly billing
	// - Hour: hourly billing
	// > **NOTE:**  Subscription instances (PrePaid) only supports Month. PayAsYouGo instances (PostPaid) only supports Hour. The Shared type is automatically set to Hour without specifying it.
	PricingCycle *string `pulumi:"pricingCycle"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Change matching type. Value:
	// - UPGRADE: UPGRADE
	// - DOWNGRADE: Downgrading
	// > **NOTE:** The upgrade specification cannot be less than the original specification. A blank field indicates that the original specification remains unchanged. On this basis, at least one specification is larger than the original specification. The downgrading specification cannot be greater than the original specification. A blank field indicates that the original specification remains unchanged. On this basis, at least one specification is smaller than the original specification.
	ScaleType *string `pulumi:"scaleType"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The standard storage space of the instance. Unit: GB.
	// > **NOTE:**  PayAsYouGo instances (PostPaid) ignore this parameter.
	StorageSize *int `pulumi:"storageSize"`
	// Instance tag.
	Tags map[string]string `pulumi:"tags"`
	// The zone Id. Refer to "Instructions for Use".
	ZoneId *string `pulumi:"zoneId"`
}

type InstanceState struct {
	// Whether to pay automatically. The default value is true. Value:
	// - true: automatic payment
	// - false: only generate orders, not pay
	// > **NOTE:**  The default value is true. If the balance of your payment method is insufficient, you can set the parameter AutoPay to false, and an unpaid order will be generated. You can log in to the user Center to pay by yourself.
	AutoPay pulumi.BoolPtrInput
	// Instance low-frequency storage space. Unit: GB.
	// > **NOTE:**  PayAsYouGo (PostPaid) instances ignore this parameter.
	ColdStorageSize pulumi.IntPtrInput
	// Instance specifications. Value:
	// - 8 cores 32 GB (number of compute nodes: 1)
	// - 16 cores 64 GB (number of compute nodes: 1)
	// - 32 core 128 GB (number of compute nodes: 2)
	// - 64 core 256 GB (number of compute nodes: 4)
	// - 96 core 384 GB (number of computing nodes: 6)
	// - 128 core 512 GB (number of compute nodes: 8)
	// > **NOTE:** Just fill in the audit number. Please submit a work order application for purchasing 1024 or above specifications. Shared instance types do not need to specify specifications. The specification of - 8 core 32GB (number of computing nodes: 1) is only for experience use and cannot be used for production.
	Cpu pulumi.IntPtrInput
	// The creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// The buying cycle. Buy for 2 months. If the Payment type is PayAsYouGo (PostPaid), you do not need to specify it.
	Duration pulumi.IntPtrInput
	// List of domain names. See `endpoints` below.
	Endpoints InstanceEndpointArrayInput
	// Number of gateway nodes.
	GatewayCount pulumi.IntPtrInput
	// Initialize the database and split multiple database names ",".
	InitialDatabases pulumi.StringPtrInput
	// The name of the resource.
	InstanceName pulumi.StringPtrInput
	// The instance type. Value:
	// - Standard: Universal.
	// - Follower: Read-only slave instance.
	// - Warehouse: calculation group type.
	// - Shared: Shared.
	InstanceType pulumi.StringPtrInput
	// The ID of the primary instance.
	LeaderInstanceId pulumi.StringPtrInput
	// The payment type of the resource.
	PaymentType pulumi.StringPtrInput
	// Billing cycle. Value:
	// - Month: monthly billing
	// - Hour: hourly billing
	// > **NOTE:**  Subscription instances (PrePaid) only supports Month. PayAsYouGo instances (PostPaid) only supports Hour. The Shared type is automatically set to Hour without specifying it.
	PricingCycle pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// Change matching type. Value:
	// - UPGRADE: UPGRADE
	// - DOWNGRADE: Downgrading
	// > **NOTE:** The upgrade specification cannot be less than the original specification. A blank field indicates that the original specification remains unchanged. On this basis, at least one specification is larger than the original specification. The downgrading specification cannot be greater than the original specification. A blank field indicates that the original specification remains unchanged. On this basis, at least one specification is smaller than the original specification.
	ScaleType pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The standard storage space of the instance. Unit: GB.
	// > **NOTE:**  PayAsYouGo instances (PostPaid) ignore this parameter.
	StorageSize pulumi.IntPtrInput
	// Instance tag.
	Tags pulumi.StringMapInput
	// The zone Id. Refer to "Instructions for Use".
	ZoneId pulumi.StringPtrInput
}

func (InstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceState)(nil)).Elem()
}

type instanceArgs struct {
	// Whether to pay automatically. The default value is true. Value:
	// - true: automatic payment
	// - false: only generate orders, not pay
	// > **NOTE:**  The default value is true. If the balance of your payment method is insufficient, you can set the parameter AutoPay to false, and an unpaid order will be generated. You can log in to the user Center to pay by yourself.
	AutoPay *bool `pulumi:"autoPay"`
	// Instance low-frequency storage space. Unit: GB.
	// > **NOTE:**  PayAsYouGo (PostPaid) instances ignore this parameter.
	ColdStorageSize *int `pulumi:"coldStorageSize"`
	// Instance specifications. Value:
	// - 8 cores 32 GB (number of compute nodes: 1)
	// - 16 cores 64 GB (number of compute nodes: 1)
	// - 32 core 128 GB (number of compute nodes: 2)
	// - 64 core 256 GB (number of compute nodes: 4)
	// - 96 core 384 GB (number of computing nodes: 6)
	// - 128 core 512 GB (number of compute nodes: 8)
	// > **NOTE:** Just fill in the audit number. Please submit a work order application for purchasing 1024 or above specifications. Shared instance types do not need to specify specifications. The specification of - 8 core 32GB (number of computing nodes: 1) is only for experience use and cannot be used for production.
	Cpu *int `pulumi:"cpu"`
	// The buying cycle. Buy for 2 months. If the Payment type is PayAsYouGo (PostPaid), you do not need to specify it.
	Duration *int `pulumi:"duration"`
	// List of domain names. See `endpoints` below.
	Endpoints []InstanceEndpoint `pulumi:"endpoints"`
	// Number of gateway nodes.
	GatewayCount *int `pulumi:"gatewayCount"`
	// Initialize the database and split multiple database names ",".
	InitialDatabases *string `pulumi:"initialDatabases"`
	// The name of the resource.
	InstanceName string `pulumi:"instanceName"`
	// The instance type. Value:
	// - Standard: Universal.
	// - Follower: Read-only slave instance.
	// - Warehouse: calculation group type.
	// - Shared: Shared.
	InstanceType string `pulumi:"instanceType"`
	// The ID of the primary instance.
	LeaderInstanceId *string `pulumi:"leaderInstanceId"`
	// The payment type of the resource.
	PaymentType string `pulumi:"paymentType"`
	// Billing cycle. Value:
	// - Month: monthly billing
	// - Hour: hourly billing
	// > **NOTE:**  Subscription instances (PrePaid) only supports Month. PayAsYouGo instances (PostPaid) only supports Hour. The Shared type is automatically set to Hour without specifying it.
	PricingCycle *string `pulumi:"pricingCycle"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Change matching type. Value:
	// - UPGRADE: UPGRADE
	// - DOWNGRADE: Downgrading
	// > **NOTE:** The upgrade specification cannot be less than the original specification. A blank field indicates that the original specification remains unchanged. On this basis, at least one specification is larger than the original specification. The downgrading specification cannot be greater than the original specification. A blank field indicates that the original specification remains unchanged. On this basis, at least one specification is smaller than the original specification.
	ScaleType *string `pulumi:"scaleType"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The standard storage space of the instance. Unit: GB.
	// > **NOTE:**  PayAsYouGo instances (PostPaid) ignore this parameter.
	StorageSize *int `pulumi:"storageSize"`
	// Instance tag.
	Tags map[string]string `pulumi:"tags"`
	// The zone Id. Refer to "Instructions for Use".
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Instance resource.
type InstanceArgs struct {
	// Whether to pay automatically. The default value is true. Value:
	// - true: automatic payment
	// - false: only generate orders, not pay
	// > **NOTE:**  The default value is true. If the balance of your payment method is insufficient, you can set the parameter AutoPay to false, and an unpaid order will be generated. You can log in to the user Center to pay by yourself.
	AutoPay pulumi.BoolPtrInput
	// Instance low-frequency storage space. Unit: GB.
	// > **NOTE:**  PayAsYouGo (PostPaid) instances ignore this parameter.
	ColdStorageSize pulumi.IntPtrInput
	// Instance specifications. Value:
	// - 8 cores 32 GB (number of compute nodes: 1)
	// - 16 cores 64 GB (number of compute nodes: 1)
	// - 32 core 128 GB (number of compute nodes: 2)
	// - 64 core 256 GB (number of compute nodes: 4)
	// - 96 core 384 GB (number of computing nodes: 6)
	// - 128 core 512 GB (number of compute nodes: 8)
	// > **NOTE:** Just fill in the audit number. Please submit a work order application for purchasing 1024 or above specifications. Shared instance types do not need to specify specifications. The specification of - 8 core 32GB (number of computing nodes: 1) is only for experience use and cannot be used for production.
	Cpu pulumi.IntPtrInput
	// The buying cycle. Buy for 2 months. If the Payment type is PayAsYouGo (PostPaid), you do not need to specify it.
	Duration pulumi.IntPtrInput
	// List of domain names. See `endpoints` below.
	Endpoints InstanceEndpointArrayInput
	// Number of gateway nodes.
	GatewayCount pulumi.IntPtrInput
	// Initialize the database and split multiple database names ",".
	InitialDatabases pulumi.StringPtrInput
	// The name of the resource.
	InstanceName pulumi.StringInput
	// The instance type. Value:
	// - Standard: Universal.
	// - Follower: Read-only slave instance.
	// - Warehouse: calculation group type.
	// - Shared: Shared.
	InstanceType pulumi.StringInput
	// The ID of the primary instance.
	LeaderInstanceId pulumi.StringPtrInput
	// The payment type of the resource.
	PaymentType pulumi.StringInput
	// Billing cycle. Value:
	// - Month: monthly billing
	// - Hour: hourly billing
	// > **NOTE:**  Subscription instances (PrePaid) only supports Month. PayAsYouGo instances (PostPaid) only supports Hour. The Shared type is automatically set to Hour without specifying it.
	PricingCycle pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// Change matching type. Value:
	// - UPGRADE: UPGRADE
	// - DOWNGRADE: Downgrading
	// > **NOTE:** The upgrade specification cannot be less than the original specification. A blank field indicates that the original specification remains unchanged. On this basis, at least one specification is larger than the original specification. The downgrading specification cannot be greater than the original specification. A blank field indicates that the original specification remains unchanged. On this basis, at least one specification is smaller than the original specification.
	ScaleType pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The standard storage space of the instance. Unit: GB.
	// > **NOTE:**  PayAsYouGo instances (PostPaid) ignore this parameter.
	StorageSize pulumi.IntPtrInput
	// Instance tag.
	Tags pulumi.StringMapInput
	// The zone Id. Refer to "Instructions for Use".
	ZoneId pulumi.StringInput
}

func (InstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceArgs)(nil)).Elem()
}

type InstanceInput interface {
	pulumi.Input

	ToInstanceOutput() InstanceOutput
	ToInstanceOutputWithContext(ctx context.Context) InstanceOutput
}

func (*Instance) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (i *Instance) ToInstanceOutput() InstanceOutput {
	return i.ToInstanceOutputWithContext(context.Background())
}

func (i *Instance) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceOutput)
}

// InstanceArrayInput is an input type that accepts InstanceArray and InstanceArrayOutput values.
// You can construct a concrete instance of `InstanceArrayInput` via:
//
//	InstanceArray{ InstanceArgs{...} }
type InstanceArrayInput interface {
	pulumi.Input

	ToInstanceArrayOutput() InstanceArrayOutput
	ToInstanceArrayOutputWithContext(context.Context) InstanceArrayOutput
}

type InstanceArray []InstanceInput

func (InstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (i InstanceArray) ToInstanceArrayOutput() InstanceArrayOutput {
	return i.ToInstanceArrayOutputWithContext(context.Background())
}

func (i InstanceArray) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceArrayOutput)
}

// InstanceMapInput is an input type that accepts InstanceMap and InstanceMapOutput values.
// You can construct a concrete instance of `InstanceMapInput` via:
//
//	InstanceMap{ "key": InstanceArgs{...} }
type InstanceMapInput interface {
	pulumi.Input

	ToInstanceMapOutput() InstanceMapOutput
	ToInstanceMapOutputWithContext(context.Context) InstanceMapOutput
}

type InstanceMap map[string]InstanceInput

func (InstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (i InstanceMap) ToInstanceMapOutput() InstanceMapOutput {
	return i.ToInstanceMapOutputWithContext(context.Background())
}

func (i InstanceMap) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceMapOutput)
}

type InstanceOutput struct{ *pulumi.OutputState }

func (InstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (o InstanceOutput) ToInstanceOutput() InstanceOutput {
	return o
}

func (o InstanceOutput) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return o
}

// Whether to pay automatically. The default value is true. Value:
// - true: automatic payment
// - false: only generate orders, not pay
// > **NOTE:**  The default value is true. If the balance of your payment method is insufficient, you can set the parameter AutoPay to false, and an unpaid order will be generated. You can log in to the user Center to pay by yourself.
func (o InstanceOutput) AutoPay() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.BoolPtrOutput { return v.AutoPay }).(pulumi.BoolPtrOutput)
}

// Instance low-frequency storage space. Unit: GB.
// > **NOTE:**  PayAsYouGo (PostPaid) instances ignore this parameter.
func (o InstanceOutput) ColdStorageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntPtrOutput { return v.ColdStorageSize }).(pulumi.IntPtrOutput)
}

// Instance specifications. Value:
// - 8 cores 32 GB (number of compute nodes: 1)
// - 16 cores 64 GB (number of compute nodes: 1)
// - 32 core 128 GB (number of compute nodes: 2)
// - 64 core 256 GB (number of compute nodes: 4)
// - 96 core 384 GB (number of computing nodes: 6)
// - 128 core 512 GB (number of compute nodes: 8)
// > **NOTE:** Just fill in the audit number. Please submit a work order application for purchasing 1024 or above specifications. Shared instance types do not need to specify specifications. The specification of - 8 core 32GB (number of computing nodes: 1) is only for experience use and cannot be used for production.
func (o InstanceOutput) Cpu() pulumi.IntOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntOutput { return v.Cpu }).(pulumi.IntOutput)
}

// The creation time of the resource.
func (o InstanceOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The buying cycle. Buy for 2 months. If the Payment type is PayAsYouGo (PostPaid), you do not need to specify it.
func (o InstanceOutput) Duration() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntPtrOutput { return v.Duration }).(pulumi.IntPtrOutput)
}

// List of domain names. See `endpoints` below.
func (o InstanceOutput) Endpoints() InstanceEndpointArrayOutput {
	return o.ApplyT(func(v *Instance) InstanceEndpointArrayOutput { return v.Endpoints }).(InstanceEndpointArrayOutput)
}

// Number of gateway nodes.
func (o InstanceOutput) GatewayCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntPtrOutput { return v.GatewayCount }).(pulumi.IntPtrOutput)
}

// Initialize the database and split multiple database names ",".
func (o InstanceOutput) InitialDatabases() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.InitialDatabases }).(pulumi.StringPtrOutput)
}

// The name of the resource.
func (o InstanceOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.InstanceName }).(pulumi.StringOutput)
}

// The instance type. Value:
// - Standard: Universal.
// - Follower: Read-only slave instance.
// - Warehouse: calculation group type.
// - Shared: Shared.
func (o InstanceOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

// The ID of the primary instance.
func (o InstanceOutput) LeaderInstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.LeaderInstanceId }).(pulumi.StringPtrOutput)
}

// The payment type of the resource.
func (o InstanceOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// Billing cycle. Value:
// - Month: monthly billing
// - Hour: hourly billing
// > **NOTE:**  Subscription instances (PrePaid) only supports Month. PayAsYouGo instances (PostPaid) only supports Hour. The Shared type is automatically set to Hour without specifying it.
func (o InstanceOutput) PricingCycle() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.PricingCycle }).(pulumi.StringPtrOutput)
}

// The ID of the resource group.
func (o InstanceOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// Change matching type. Value:
// - UPGRADE: UPGRADE
// - DOWNGRADE: Downgrading
// > **NOTE:** The upgrade specification cannot be less than the original specification. A blank field indicates that the original specification remains unchanged. On this basis, at least one specification is larger than the original specification. The downgrading specification cannot be greater than the original specification. A blank field indicates that the original specification remains unchanged. On this basis, at least one specification is smaller than the original specification.
func (o InstanceOutput) ScaleType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.ScaleType }).(pulumi.StringPtrOutput)
}

// The status of the resource.
func (o InstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The standard storage space of the instance. Unit: GB.
// > **NOTE:**  PayAsYouGo instances (PostPaid) ignore this parameter.
func (o InstanceOutput) StorageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntPtrOutput { return v.StorageSize }).(pulumi.IntPtrOutput)
}

// Instance tag.
func (o InstanceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The zone Id. Refer to "Instructions for Use".
func (o InstanceOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type InstanceArrayOutput struct{ *pulumi.OutputState }

func (InstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (o InstanceArrayOutput) ToInstanceArrayOutput() InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) Index(i pulumi.IntInput) InstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].([]*Instance)[vs[1].(int)]
	}).(InstanceOutput)
}

type InstanceMapOutput struct{ *pulumi.OutputState }

func (InstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (o InstanceMapOutput) ToInstanceMapOutput() InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) MapIndex(k pulumi.StringInput) InstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].(map[string]*Instance)[vs[1].(string)]
	}).(InstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceInput)(nil)).Elem(), &Instance{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceArrayInput)(nil)).Elem(), InstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceMapInput)(nil)).Elem(), InstanceMap{})
	pulumi.RegisterOutputType(InstanceOutput{})
	pulumi.RegisterOutputType(InstanceArrayOutput{})
	pulumi.RegisterOutputType(InstanceMapOutput{})
}
