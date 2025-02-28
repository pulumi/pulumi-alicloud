// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ebs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Ebs Disk Replica Pair resource.
//
// For information about Ebs Disk Replica Pair and how to use it, see [What is Disk Replica Pair](https://www.alibabacloud.com/help/en/ecs/developer-reference/api-ebs-2021-07-30-creatediskreplicapair).
//
// > **NOTE:** Available since v1.196.0.
//
// ## Import
//
// Ebs Disk Replica Pair can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ebs/diskReplicaPair:DiskReplicaPair example <id>
// ```
type DiskReplicaPair struct {
	pulumi.CustomResourceState

	// The bandwidth for asynchronous data replication between cloud disks. The unit is Kbps. Value range:-10240 Kbps: equal to 10 Mbps.-20480 Kbps: equal to 20 Mbps.-51200 Kbps: equal to 50 Mbps.-102400 Kbps: equal to 100 Mbps.Default value: 10240.This parameter cannot be specified when the ChargeType value is POSTPAY. The system value is 0, which indicates that the disk is dynamically allocated according to data write changes during asynchronous replication.
	Bandwidth pulumi.StringOutput `pulumi:"bandwidth"`
	// The creation time of the resource
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The description of the asynchronous replication relationship. 2 to 256 English or Chinese characters in length and cannot start with' http:// 'or' https.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the standby disk.
	DestinationDiskId pulumi.StringOutput `pulumi:"destinationDiskId"`
	// The ID of the region to which the disaster recovery site belongs.
	DestinationRegionId pulumi.StringOutput `pulumi:"destinationRegionId"`
	// The ID of the zone to which the disaster recovery site belongs.
	DestinationZoneId pulumi.StringOutput `pulumi:"destinationZoneId"`
	// The ID of the primary disk.
	DiskId pulumi.StringOutput `pulumi:"diskId"`
	// The name of the asynchronous replication relationship. The length must be 2 to 128 characters in length and must start with a letter or Chinese name. It cannot start with http:// or https. It can contain Chinese, English, numbers, half-width colons (:), underscores (_), half-width periods (.), or dashes (-).
	PairName pulumi.StringPtrOutput `pulumi:"pairName"`
	// The payment type of the resource
	PaymentType pulumi.StringPtrOutput `pulumi:"paymentType"`
	// The length of the purchase for the asynchronous replication relationship. When ChargeType=PrePay, this parameter is mandatory. The unit of duration is specified by PeriodUnit and takes on a range of values. When PeriodUnit=Week, this parameter takes values in the range `1`, `2`, `3` and `4`. When PeriodUnit=Month, the parameter takes on the values `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`, `48`, `60`.
	Period pulumi.StringPtrOutput `pulumi:"period"`
	// The units of asynchronous replication relationship purchase length. Valid values: `Week` and `Month`. Default value: `Month`.
	PeriodUnit pulumi.StringPtrOutput `pulumi:"periodUnit"`
	// The first ID of the resource.
	ReplicaPairId pulumi.StringOutput `pulumi:"replicaPairId"`
	// The ID of the resource group
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
	Rpo pulumi.StringOutput `pulumi:"rpo"`
	// The ID of the zone to which the production site belongs.
	SourceZoneId pulumi.StringOutput `pulumi:"sourceZoneId"`
	// The status of the resource
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewDiskReplicaPair registers a new resource with the given unique name, arguments, and options.
func NewDiskReplicaPair(ctx *pulumi.Context,
	name string, args *DiskReplicaPairArgs, opts ...pulumi.ResourceOption) (*DiskReplicaPair, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationDiskId == nil {
		return nil, errors.New("invalid value for required argument 'DestinationDiskId'")
	}
	if args.DestinationRegionId == nil {
		return nil, errors.New("invalid value for required argument 'DestinationRegionId'")
	}
	if args.DestinationZoneId == nil {
		return nil, errors.New("invalid value for required argument 'DestinationZoneId'")
	}
	if args.DiskId == nil {
		return nil, errors.New("invalid value for required argument 'DiskId'")
	}
	if args.SourceZoneId == nil {
		return nil, errors.New("invalid value for required argument 'SourceZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DiskReplicaPair
	err := ctx.RegisterResource("alicloud:ebs/diskReplicaPair:DiskReplicaPair", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDiskReplicaPair gets an existing DiskReplicaPair resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDiskReplicaPair(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DiskReplicaPairState, opts ...pulumi.ResourceOption) (*DiskReplicaPair, error) {
	var resource DiskReplicaPair
	err := ctx.ReadResource("alicloud:ebs/diskReplicaPair:DiskReplicaPair", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DiskReplicaPair resources.
type diskReplicaPairState struct {
	// The bandwidth for asynchronous data replication between cloud disks. The unit is Kbps. Value range:-10240 Kbps: equal to 10 Mbps.-20480 Kbps: equal to 20 Mbps.-51200 Kbps: equal to 50 Mbps.-102400 Kbps: equal to 100 Mbps.Default value: 10240.This parameter cannot be specified when the ChargeType value is POSTPAY. The system value is 0, which indicates that the disk is dynamically allocated according to data write changes during asynchronous replication.
	Bandwidth *string `pulumi:"bandwidth"`
	// The creation time of the resource
	CreateTime *string `pulumi:"createTime"`
	// The description of the asynchronous replication relationship. 2 to 256 English or Chinese characters in length and cannot start with' http:// 'or' https.
	Description *string `pulumi:"description"`
	// The ID of the standby disk.
	DestinationDiskId *string `pulumi:"destinationDiskId"`
	// The ID of the region to which the disaster recovery site belongs.
	DestinationRegionId *string `pulumi:"destinationRegionId"`
	// The ID of the zone to which the disaster recovery site belongs.
	DestinationZoneId *string `pulumi:"destinationZoneId"`
	// The ID of the primary disk.
	DiskId *string `pulumi:"diskId"`
	// The name of the asynchronous replication relationship. The length must be 2 to 128 characters in length and must start with a letter or Chinese name. It cannot start with http:// or https. It can contain Chinese, English, numbers, half-width colons (:), underscores (_), half-width periods (.), or dashes (-).
	PairName *string `pulumi:"pairName"`
	// The payment type of the resource
	PaymentType *string `pulumi:"paymentType"`
	// The length of the purchase for the asynchronous replication relationship. When ChargeType=PrePay, this parameter is mandatory. The unit of duration is specified by PeriodUnit and takes on a range of values. When PeriodUnit=Week, this parameter takes values in the range `1`, `2`, `3` and `4`. When PeriodUnit=Month, the parameter takes on the values `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`, `48`, `60`.
	Period *string `pulumi:"period"`
	// The units of asynchronous replication relationship purchase length. Valid values: `Week` and `Month`. Default value: `Month`.
	PeriodUnit *string `pulumi:"periodUnit"`
	// The first ID of the resource.
	ReplicaPairId *string `pulumi:"replicaPairId"`
	// The ID of the resource group
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
	Rpo *string `pulumi:"rpo"`
	// The ID of the zone to which the production site belongs.
	SourceZoneId *string `pulumi:"sourceZoneId"`
	// The status of the resource
	Status *string `pulumi:"status"`
}

type DiskReplicaPairState struct {
	// The bandwidth for asynchronous data replication between cloud disks. The unit is Kbps. Value range:-10240 Kbps: equal to 10 Mbps.-20480 Kbps: equal to 20 Mbps.-51200 Kbps: equal to 50 Mbps.-102400 Kbps: equal to 100 Mbps.Default value: 10240.This parameter cannot be specified when the ChargeType value is POSTPAY. The system value is 0, which indicates that the disk is dynamically allocated according to data write changes during asynchronous replication.
	Bandwidth pulumi.StringPtrInput
	// The creation time of the resource
	CreateTime pulumi.StringPtrInput
	// The description of the asynchronous replication relationship. 2 to 256 English or Chinese characters in length and cannot start with' http:// 'or' https.
	Description pulumi.StringPtrInput
	// The ID of the standby disk.
	DestinationDiskId pulumi.StringPtrInput
	// The ID of the region to which the disaster recovery site belongs.
	DestinationRegionId pulumi.StringPtrInput
	// The ID of the zone to which the disaster recovery site belongs.
	DestinationZoneId pulumi.StringPtrInput
	// The ID of the primary disk.
	DiskId pulumi.StringPtrInput
	// The name of the asynchronous replication relationship. The length must be 2 to 128 characters in length and must start with a letter or Chinese name. It cannot start with http:// or https. It can contain Chinese, English, numbers, half-width colons (:), underscores (_), half-width periods (.), or dashes (-).
	PairName pulumi.StringPtrInput
	// The payment type of the resource
	PaymentType pulumi.StringPtrInput
	// The length of the purchase for the asynchronous replication relationship. When ChargeType=PrePay, this parameter is mandatory. The unit of duration is specified by PeriodUnit and takes on a range of values. When PeriodUnit=Week, this parameter takes values in the range `1`, `2`, `3` and `4`. When PeriodUnit=Month, the parameter takes on the values `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`, `48`, `60`.
	Period pulumi.StringPtrInput
	// The units of asynchronous replication relationship purchase length. Valid values: `Week` and `Month`. Default value: `Month`.
	PeriodUnit pulumi.StringPtrInput
	// The first ID of the resource.
	ReplicaPairId pulumi.StringPtrInput
	// The ID of the resource group
	ResourceGroupId pulumi.StringPtrInput
	// The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
	Rpo pulumi.StringPtrInput
	// The ID of the zone to which the production site belongs.
	SourceZoneId pulumi.StringPtrInput
	// The status of the resource
	Status pulumi.StringPtrInput
}

func (DiskReplicaPairState) ElementType() reflect.Type {
	return reflect.TypeOf((*diskReplicaPairState)(nil)).Elem()
}

type diskReplicaPairArgs struct {
	// The bandwidth for asynchronous data replication between cloud disks. The unit is Kbps. Value range:-10240 Kbps: equal to 10 Mbps.-20480 Kbps: equal to 20 Mbps.-51200 Kbps: equal to 50 Mbps.-102400 Kbps: equal to 100 Mbps.Default value: 10240.This parameter cannot be specified when the ChargeType value is POSTPAY. The system value is 0, which indicates that the disk is dynamically allocated according to data write changes during asynchronous replication.
	Bandwidth *string `pulumi:"bandwidth"`
	// The description of the asynchronous replication relationship. 2 to 256 English or Chinese characters in length and cannot start with' http:// 'or' https.
	Description *string `pulumi:"description"`
	// The ID of the standby disk.
	DestinationDiskId string `pulumi:"destinationDiskId"`
	// The ID of the region to which the disaster recovery site belongs.
	DestinationRegionId string `pulumi:"destinationRegionId"`
	// The ID of the zone to which the disaster recovery site belongs.
	DestinationZoneId string `pulumi:"destinationZoneId"`
	// The ID of the primary disk.
	DiskId string `pulumi:"diskId"`
	// The name of the asynchronous replication relationship. The length must be 2 to 128 characters in length and must start with a letter or Chinese name. It cannot start with http:// or https. It can contain Chinese, English, numbers, half-width colons (:), underscores (_), half-width periods (.), or dashes (-).
	PairName *string `pulumi:"pairName"`
	// The payment type of the resource
	PaymentType *string `pulumi:"paymentType"`
	// The length of the purchase for the asynchronous replication relationship. When ChargeType=PrePay, this parameter is mandatory. The unit of duration is specified by PeriodUnit and takes on a range of values. When PeriodUnit=Week, this parameter takes values in the range `1`, `2`, `3` and `4`. When PeriodUnit=Month, the parameter takes on the values `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`, `48`, `60`.
	Period *string `pulumi:"period"`
	// The units of asynchronous replication relationship purchase length. Valid values: `Week` and `Month`. Default value: `Month`.
	PeriodUnit *string `pulumi:"periodUnit"`
	// The first ID of the resource.
	ReplicaPairId *string `pulumi:"replicaPairId"`
	// The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
	Rpo *string `pulumi:"rpo"`
	// The ID of the zone to which the production site belongs.
	SourceZoneId string `pulumi:"sourceZoneId"`
}

// The set of arguments for constructing a DiskReplicaPair resource.
type DiskReplicaPairArgs struct {
	// The bandwidth for asynchronous data replication between cloud disks. The unit is Kbps. Value range:-10240 Kbps: equal to 10 Mbps.-20480 Kbps: equal to 20 Mbps.-51200 Kbps: equal to 50 Mbps.-102400 Kbps: equal to 100 Mbps.Default value: 10240.This parameter cannot be specified when the ChargeType value is POSTPAY. The system value is 0, which indicates that the disk is dynamically allocated according to data write changes during asynchronous replication.
	Bandwidth pulumi.StringPtrInput
	// The description of the asynchronous replication relationship. 2 to 256 English or Chinese characters in length and cannot start with' http:// 'or' https.
	Description pulumi.StringPtrInput
	// The ID of the standby disk.
	DestinationDiskId pulumi.StringInput
	// The ID of the region to which the disaster recovery site belongs.
	DestinationRegionId pulumi.StringInput
	// The ID of the zone to which the disaster recovery site belongs.
	DestinationZoneId pulumi.StringInput
	// The ID of the primary disk.
	DiskId pulumi.StringInput
	// The name of the asynchronous replication relationship. The length must be 2 to 128 characters in length and must start with a letter or Chinese name. It cannot start with http:// or https. It can contain Chinese, English, numbers, half-width colons (:), underscores (_), half-width periods (.), or dashes (-).
	PairName pulumi.StringPtrInput
	// The payment type of the resource
	PaymentType pulumi.StringPtrInput
	// The length of the purchase for the asynchronous replication relationship. When ChargeType=PrePay, this parameter is mandatory. The unit of duration is specified by PeriodUnit and takes on a range of values. When PeriodUnit=Week, this parameter takes values in the range `1`, `2`, `3` and `4`. When PeriodUnit=Month, the parameter takes on the values `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`, `48`, `60`.
	Period pulumi.StringPtrInput
	// The units of asynchronous replication relationship purchase length. Valid values: `Week` and `Month`. Default value: `Month`.
	PeriodUnit pulumi.StringPtrInput
	// The first ID of the resource.
	ReplicaPairId pulumi.StringPtrInput
	// The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
	Rpo pulumi.StringPtrInput
	// The ID of the zone to which the production site belongs.
	SourceZoneId pulumi.StringInput
}

func (DiskReplicaPairArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*diskReplicaPairArgs)(nil)).Elem()
}

type DiskReplicaPairInput interface {
	pulumi.Input

	ToDiskReplicaPairOutput() DiskReplicaPairOutput
	ToDiskReplicaPairOutputWithContext(ctx context.Context) DiskReplicaPairOutput
}

func (*DiskReplicaPair) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskReplicaPair)(nil)).Elem()
}

func (i *DiskReplicaPair) ToDiskReplicaPairOutput() DiskReplicaPairOutput {
	return i.ToDiskReplicaPairOutputWithContext(context.Background())
}

func (i *DiskReplicaPair) ToDiskReplicaPairOutputWithContext(ctx context.Context) DiskReplicaPairOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskReplicaPairOutput)
}

// DiskReplicaPairArrayInput is an input type that accepts DiskReplicaPairArray and DiskReplicaPairArrayOutput values.
// You can construct a concrete instance of `DiskReplicaPairArrayInput` via:
//
//	DiskReplicaPairArray{ DiskReplicaPairArgs{...} }
type DiskReplicaPairArrayInput interface {
	pulumi.Input

	ToDiskReplicaPairArrayOutput() DiskReplicaPairArrayOutput
	ToDiskReplicaPairArrayOutputWithContext(context.Context) DiskReplicaPairArrayOutput
}

type DiskReplicaPairArray []DiskReplicaPairInput

func (DiskReplicaPairArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiskReplicaPair)(nil)).Elem()
}

func (i DiskReplicaPairArray) ToDiskReplicaPairArrayOutput() DiskReplicaPairArrayOutput {
	return i.ToDiskReplicaPairArrayOutputWithContext(context.Background())
}

func (i DiskReplicaPairArray) ToDiskReplicaPairArrayOutputWithContext(ctx context.Context) DiskReplicaPairArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskReplicaPairArrayOutput)
}

// DiskReplicaPairMapInput is an input type that accepts DiskReplicaPairMap and DiskReplicaPairMapOutput values.
// You can construct a concrete instance of `DiskReplicaPairMapInput` via:
//
//	DiskReplicaPairMap{ "key": DiskReplicaPairArgs{...} }
type DiskReplicaPairMapInput interface {
	pulumi.Input

	ToDiskReplicaPairMapOutput() DiskReplicaPairMapOutput
	ToDiskReplicaPairMapOutputWithContext(context.Context) DiskReplicaPairMapOutput
}

type DiskReplicaPairMap map[string]DiskReplicaPairInput

func (DiskReplicaPairMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiskReplicaPair)(nil)).Elem()
}

func (i DiskReplicaPairMap) ToDiskReplicaPairMapOutput() DiskReplicaPairMapOutput {
	return i.ToDiskReplicaPairMapOutputWithContext(context.Background())
}

func (i DiskReplicaPairMap) ToDiskReplicaPairMapOutputWithContext(ctx context.Context) DiskReplicaPairMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskReplicaPairMapOutput)
}

type DiskReplicaPairOutput struct{ *pulumi.OutputState }

func (DiskReplicaPairOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskReplicaPair)(nil)).Elem()
}

func (o DiskReplicaPairOutput) ToDiskReplicaPairOutput() DiskReplicaPairOutput {
	return o
}

func (o DiskReplicaPairOutput) ToDiskReplicaPairOutputWithContext(ctx context.Context) DiskReplicaPairOutput {
	return o
}

// The bandwidth for asynchronous data replication between cloud disks. The unit is Kbps. Value range:-10240 Kbps: equal to 10 Mbps.-20480 Kbps: equal to 20 Mbps.-51200 Kbps: equal to 50 Mbps.-102400 Kbps: equal to 100 Mbps.Default value: 10240.This parameter cannot be specified when the ChargeType value is POSTPAY. The system value is 0, which indicates that the disk is dynamically allocated according to data write changes during asynchronous replication.
func (o DiskReplicaPairOutput) Bandwidth() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringOutput { return v.Bandwidth }).(pulumi.StringOutput)
}

// The creation time of the resource
func (o DiskReplicaPairOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The description of the asynchronous replication relationship. 2 to 256 English or Chinese characters in length and cannot start with' http:// 'or' https.
func (o DiskReplicaPairOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ID of the standby disk.
func (o DiskReplicaPairOutput) DestinationDiskId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringOutput { return v.DestinationDiskId }).(pulumi.StringOutput)
}

// The ID of the region to which the disaster recovery site belongs.
func (o DiskReplicaPairOutput) DestinationRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringOutput { return v.DestinationRegionId }).(pulumi.StringOutput)
}

// The ID of the zone to which the disaster recovery site belongs.
func (o DiskReplicaPairOutput) DestinationZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringOutput { return v.DestinationZoneId }).(pulumi.StringOutput)
}

// The ID of the primary disk.
func (o DiskReplicaPairOutput) DiskId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringOutput { return v.DiskId }).(pulumi.StringOutput)
}

// The name of the asynchronous replication relationship. The length must be 2 to 128 characters in length and must start with a letter or Chinese name. It cannot start with http:// or https. It can contain Chinese, English, numbers, half-width colons (:), underscores (_), half-width periods (.), or dashes (-).
func (o DiskReplicaPairOutput) PairName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringPtrOutput { return v.PairName }).(pulumi.StringPtrOutput)
}

// The payment type of the resource
func (o DiskReplicaPairOutput) PaymentType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringPtrOutput { return v.PaymentType }).(pulumi.StringPtrOutput)
}

// The length of the purchase for the asynchronous replication relationship. When ChargeType=PrePay, this parameter is mandatory. The unit of duration is specified by PeriodUnit and takes on a range of values. When PeriodUnit=Week, this parameter takes values in the range `1`, `2`, `3` and `4`. When PeriodUnit=Month, the parameter takes on the values `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`, `48`, `60`.
func (o DiskReplicaPairOutput) Period() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringPtrOutput { return v.Period }).(pulumi.StringPtrOutput)
}

// The units of asynchronous replication relationship purchase length. Valid values: `Week` and `Month`. Default value: `Month`.
func (o DiskReplicaPairOutput) PeriodUnit() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringPtrOutput { return v.PeriodUnit }).(pulumi.StringPtrOutput)
}

// The first ID of the resource.
func (o DiskReplicaPairOutput) ReplicaPairId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringOutput { return v.ReplicaPairId }).(pulumi.StringOutput)
}

// The ID of the resource group
func (o DiskReplicaPairOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
func (o DiskReplicaPairOutput) Rpo() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringOutput { return v.Rpo }).(pulumi.StringOutput)
}

// The ID of the zone to which the production site belongs.
func (o DiskReplicaPairOutput) SourceZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringOutput { return v.SourceZoneId }).(pulumi.StringOutput)
}

// The status of the resource
func (o DiskReplicaPairOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaPair) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type DiskReplicaPairArrayOutput struct{ *pulumi.OutputState }

func (DiskReplicaPairArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiskReplicaPair)(nil)).Elem()
}

func (o DiskReplicaPairArrayOutput) ToDiskReplicaPairArrayOutput() DiskReplicaPairArrayOutput {
	return o
}

func (o DiskReplicaPairArrayOutput) ToDiskReplicaPairArrayOutputWithContext(ctx context.Context) DiskReplicaPairArrayOutput {
	return o
}

func (o DiskReplicaPairArrayOutput) Index(i pulumi.IntInput) DiskReplicaPairOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DiskReplicaPair {
		return vs[0].([]*DiskReplicaPair)[vs[1].(int)]
	}).(DiskReplicaPairOutput)
}

type DiskReplicaPairMapOutput struct{ *pulumi.OutputState }

func (DiskReplicaPairMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiskReplicaPair)(nil)).Elem()
}

func (o DiskReplicaPairMapOutput) ToDiskReplicaPairMapOutput() DiskReplicaPairMapOutput {
	return o
}

func (o DiskReplicaPairMapOutput) ToDiskReplicaPairMapOutputWithContext(ctx context.Context) DiskReplicaPairMapOutput {
	return o
}

func (o DiskReplicaPairMapOutput) MapIndex(k pulumi.StringInput) DiskReplicaPairOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DiskReplicaPair {
		return vs[0].(map[string]*DiskReplicaPair)[vs[1].(string)]
	}).(DiskReplicaPairOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DiskReplicaPairInput)(nil)).Elem(), &DiskReplicaPair{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskReplicaPairArrayInput)(nil)).Elem(), DiskReplicaPairArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskReplicaPairMapInput)(nil)).Elem(), DiskReplicaPairMap{})
	pulumi.RegisterOutputType(DiskReplicaPairOutput{})
	pulumi.RegisterOutputType(DiskReplicaPairArrayOutput{})
	pulumi.RegisterOutputType(DiskReplicaPairMapOutput{})
}
