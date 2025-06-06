// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ens

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Ens Eip Instance Attachment resource.
//
// Bind an EIP to an instance.
//
// For information about Ens Eip Instance Attachment and how to use it, see [What is Eip Instance Attachment](https://www.alibabacloud.com/help/en/ens/developer-reference/api-ens-2017-11-10-associateenseipaddress).
//
// > **NOTE:** Available since v1.227.0.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ens"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			ensRegionId := "cn-chenzhou-telecom_unicom_cmcc"
//			if param := cfg.Get("ensRegionId"); param != "" {
//				ensRegionId = param
//			}
//			defaultXKjq1W, err := ens.NewInstance(ctx, "defaultXKjq1W", &ens.InstanceArgs{
//				SystemDisk: &ens.InstanceSystemDiskArgs{
//					Size:     pulumi.Int(20),
//					Category: pulumi.String("cloud_efficiency"),
//				},
//				SchedulingStrategy:     pulumi.String("Concentrate"),
//				ScheduleAreaLevel:      pulumi.String("Region"),
//				ImageId:                pulumi.String("centos_6_08_64_20G_alibase_20171208"),
//				PaymentType:            pulumi.String("Subscription"),
//				InstanceType:           pulumi.String("ens.sn1.stiny"),
//				Password:               pulumi.String("12345678abcABC"),
//				Status:                 pulumi.String("Running"),
//				Amount:                 pulumi.Int(1),
//				InternetChargeType:     pulumi.String("95BandwidthByMonth"),
//				InstanceName:           pulumi.String(name),
//				AutoUseCoupon:          pulumi.String("true"),
//				InstanceChargeStrategy: pulumi.String("PriceHighPriority"),
//				EnsRegionId:            pulumi.String(ensRegionId),
//				PeriodUnit:             pulumi.String("Month"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultsGsN4e, err := ens.NewEip(ctx, "defaultsGsN4e", &ens.EipArgs{
//				Bandwidth:          pulumi.Int(5),
//				EipName:            pulumi.String(name),
//				EnsRegionId:        pulumi.String(ensRegionId),
//				InternetChargeType: pulumi.String("95BandwidthByMonth"),
//				PaymentType:        pulumi.String("PayAsYouGo"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ens.NewEipInstanceAttachment(ctx, "default", &ens.EipInstanceAttachmentArgs{
//				InstanceId:   defaultXKjq1W.ID(),
//				AllocationId: defaultsGsN4e.ID(),
//				InstanceType: pulumi.String("EnsInstance"),
//				Standby:      pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Ens Eip Instance Attachment can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ens/eipInstanceAttachment:EipInstanceAttachment example <allocation_id>:<instance_id>:<instance_type>
// ```
type EipInstanceAttachment struct {
	pulumi.CustomResourceState

	// The first ID of the resource
	AllocationId pulumi.StringOutput `pulumi:"allocationId"`
	// Instance ID
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The type of the EIP instance. Value:
	// - `Nat`:NAT gateway.
	// - `SlbInstance`: Server Load Balancer (ELB).
	// - `NetworkInterface`: Secondary ENI.
	// - `EnsInstance` (default): The ENS instance.
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// Indicates whether the EIP is a backup EIP. Value:
	// - true: Spare.
	// - false: not standby.
	Standby pulumi.BoolPtrOutput `pulumi:"standby"`
	// The status of the EIP.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewEipInstanceAttachment registers a new resource with the given unique name, arguments, and options.
func NewEipInstanceAttachment(ctx *pulumi.Context,
	name string, args *EipInstanceAttachmentArgs, opts ...pulumi.ResourceOption) (*EipInstanceAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AllocationId == nil {
		return nil, errors.New("invalid value for required argument 'AllocationId'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EipInstanceAttachment
	err := ctx.RegisterResource("alicloud:ens/eipInstanceAttachment:EipInstanceAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEipInstanceAttachment gets an existing EipInstanceAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEipInstanceAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EipInstanceAttachmentState, opts ...pulumi.ResourceOption) (*EipInstanceAttachment, error) {
	var resource EipInstanceAttachment
	err := ctx.ReadResource("alicloud:ens/eipInstanceAttachment:EipInstanceAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EipInstanceAttachment resources.
type eipInstanceAttachmentState struct {
	// The first ID of the resource
	AllocationId *string `pulumi:"allocationId"`
	// Instance ID
	InstanceId *string `pulumi:"instanceId"`
	// The type of the EIP instance. Value:
	// - `Nat`:NAT gateway.
	// - `SlbInstance`: Server Load Balancer (ELB).
	// - `NetworkInterface`: Secondary ENI.
	// - `EnsInstance` (default): The ENS instance.
	InstanceType *string `pulumi:"instanceType"`
	// Indicates whether the EIP is a backup EIP. Value:
	// - true: Spare.
	// - false: not standby.
	Standby *bool `pulumi:"standby"`
	// The status of the EIP.
	Status *string `pulumi:"status"`
}

type EipInstanceAttachmentState struct {
	// The first ID of the resource
	AllocationId pulumi.StringPtrInput
	// Instance ID
	InstanceId pulumi.StringPtrInput
	// The type of the EIP instance. Value:
	// - `Nat`:NAT gateway.
	// - `SlbInstance`: Server Load Balancer (ELB).
	// - `NetworkInterface`: Secondary ENI.
	// - `EnsInstance` (default): The ENS instance.
	InstanceType pulumi.StringPtrInput
	// Indicates whether the EIP is a backup EIP. Value:
	// - true: Spare.
	// - false: not standby.
	Standby pulumi.BoolPtrInput
	// The status of the EIP.
	Status pulumi.StringPtrInput
}

func (EipInstanceAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*eipInstanceAttachmentState)(nil)).Elem()
}

type eipInstanceAttachmentArgs struct {
	// The first ID of the resource
	AllocationId string `pulumi:"allocationId"`
	// Instance ID
	InstanceId string `pulumi:"instanceId"`
	// The type of the EIP instance. Value:
	// - `Nat`:NAT gateway.
	// - `SlbInstance`: Server Load Balancer (ELB).
	// - `NetworkInterface`: Secondary ENI.
	// - `EnsInstance` (default): The ENS instance.
	InstanceType *string `pulumi:"instanceType"`
	// Indicates whether the EIP is a backup EIP. Value:
	// - true: Spare.
	// - false: not standby.
	Standby *bool `pulumi:"standby"`
}

// The set of arguments for constructing a EipInstanceAttachment resource.
type EipInstanceAttachmentArgs struct {
	// The first ID of the resource
	AllocationId pulumi.StringInput
	// Instance ID
	InstanceId pulumi.StringInput
	// The type of the EIP instance. Value:
	// - `Nat`:NAT gateway.
	// - `SlbInstance`: Server Load Balancer (ELB).
	// - `NetworkInterface`: Secondary ENI.
	// - `EnsInstance` (default): The ENS instance.
	InstanceType pulumi.StringPtrInput
	// Indicates whether the EIP is a backup EIP. Value:
	// - true: Spare.
	// - false: not standby.
	Standby pulumi.BoolPtrInput
}

func (EipInstanceAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eipInstanceAttachmentArgs)(nil)).Elem()
}

type EipInstanceAttachmentInput interface {
	pulumi.Input

	ToEipInstanceAttachmentOutput() EipInstanceAttachmentOutput
	ToEipInstanceAttachmentOutputWithContext(ctx context.Context) EipInstanceAttachmentOutput
}

func (*EipInstanceAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**EipInstanceAttachment)(nil)).Elem()
}

func (i *EipInstanceAttachment) ToEipInstanceAttachmentOutput() EipInstanceAttachmentOutput {
	return i.ToEipInstanceAttachmentOutputWithContext(context.Background())
}

func (i *EipInstanceAttachment) ToEipInstanceAttachmentOutputWithContext(ctx context.Context) EipInstanceAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EipInstanceAttachmentOutput)
}

// EipInstanceAttachmentArrayInput is an input type that accepts EipInstanceAttachmentArray and EipInstanceAttachmentArrayOutput values.
// You can construct a concrete instance of `EipInstanceAttachmentArrayInput` via:
//
//	EipInstanceAttachmentArray{ EipInstanceAttachmentArgs{...} }
type EipInstanceAttachmentArrayInput interface {
	pulumi.Input

	ToEipInstanceAttachmentArrayOutput() EipInstanceAttachmentArrayOutput
	ToEipInstanceAttachmentArrayOutputWithContext(context.Context) EipInstanceAttachmentArrayOutput
}

type EipInstanceAttachmentArray []EipInstanceAttachmentInput

func (EipInstanceAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EipInstanceAttachment)(nil)).Elem()
}

func (i EipInstanceAttachmentArray) ToEipInstanceAttachmentArrayOutput() EipInstanceAttachmentArrayOutput {
	return i.ToEipInstanceAttachmentArrayOutputWithContext(context.Background())
}

func (i EipInstanceAttachmentArray) ToEipInstanceAttachmentArrayOutputWithContext(ctx context.Context) EipInstanceAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EipInstanceAttachmentArrayOutput)
}

// EipInstanceAttachmentMapInput is an input type that accepts EipInstanceAttachmentMap and EipInstanceAttachmentMapOutput values.
// You can construct a concrete instance of `EipInstanceAttachmentMapInput` via:
//
//	EipInstanceAttachmentMap{ "key": EipInstanceAttachmentArgs{...} }
type EipInstanceAttachmentMapInput interface {
	pulumi.Input

	ToEipInstanceAttachmentMapOutput() EipInstanceAttachmentMapOutput
	ToEipInstanceAttachmentMapOutputWithContext(context.Context) EipInstanceAttachmentMapOutput
}

type EipInstanceAttachmentMap map[string]EipInstanceAttachmentInput

func (EipInstanceAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EipInstanceAttachment)(nil)).Elem()
}

func (i EipInstanceAttachmentMap) ToEipInstanceAttachmentMapOutput() EipInstanceAttachmentMapOutput {
	return i.ToEipInstanceAttachmentMapOutputWithContext(context.Background())
}

func (i EipInstanceAttachmentMap) ToEipInstanceAttachmentMapOutputWithContext(ctx context.Context) EipInstanceAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EipInstanceAttachmentMapOutput)
}

type EipInstanceAttachmentOutput struct{ *pulumi.OutputState }

func (EipInstanceAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EipInstanceAttachment)(nil)).Elem()
}

func (o EipInstanceAttachmentOutput) ToEipInstanceAttachmentOutput() EipInstanceAttachmentOutput {
	return o
}

func (o EipInstanceAttachmentOutput) ToEipInstanceAttachmentOutputWithContext(ctx context.Context) EipInstanceAttachmentOutput {
	return o
}

// The first ID of the resource
func (o EipInstanceAttachmentOutput) AllocationId() pulumi.StringOutput {
	return o.ApplyT(func(v *EipInstanceAttachment) pulumi.StringOutput { return v.AllocationId }).(pulumi.StringOutput)
}

// Instance ID
func (o EipInstanceAttachmentOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *EipInstanceAttachment) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The type of the EIP instance. Value:
// - `Nat`:NAT gateway.
// - `SlbInstance`: Server Load Balancer (ELB).
// - `NetworkInterface`: Secondary ENI.
// - `EnsInstance` (default): The ENS instance.
func (o EipInstanceAttachmentOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *EipInstanceAttachment) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

// Indicates whether the EIP is a backup EIP. Value:
// - true: Spare.
// - false: not standby.
func (o EipInstanceAttachmentOutput) Standby() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EipInstanceAttachment) pulumi.BoolPtrOutput { return v.Standby }).(pulumi.BoolPtrOutput)
}

// The status of the EIP.
func (o EipInstanceAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *EipInstanceAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type EipInstanceAttachmentArrayOutput struct{ *pulumi.OutputState }

func (EipInstanceAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EipInstanceAttachment)(nil)).Elem()
}

func (o EipInstanceAttachmentArrayOutput) ToEipInstanceAttachmentArrayOutput() EipInstanceAttachmentArrayOutput {
	return o
}

func (o EipInstanceAttachmentArrayOutput) ToEipInstanceAttachmentArrayOutputWithContext(ctx context.Context) EipInstanceAttachmentArrayOutput {
	return o
}

func (o EipInstanceAttachmentArrayOutput) Index(i pulumi.IntInput) EipInstanceAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EipInstanceAttachment {
		return vs[0].([]*EipInstanceAttachment)[vs[1].(int)]
	}).(EipInstanceAttachmentOutput)
}

type EipInstanceAttachmentMapOutput struct{ *pulumi.OutputState }

func (EipInstanceAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EipInstanceAttachment)(nil)).Elem()
}

func (o EipInstanceAttachmentMapOutput) ToEipInstanceAttachmentMapOutput() EipInstanceAttachmentMapOutput {
	return o
}

func (o EipInstanceAttachmentMapOutput) ToEipInstanceAttachmentMapOutputWithContext(ctx context.Context) EipInstanceAttachmentMapOutput {
	return o
}

func (o EipInstanceAttachmentMapOutput) MapIndex(k pulumi.StringInput) EipInstanceAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EipInstanceAttachment {
		return vs[0].(map[string]*EipInstanceAttachment)[vs[1].(string)]
	}).(EipInstanceAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EipInstanceAttachmentInput)(nil)).Elem(), &EipInstanceAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*EipInstanceAttachmentArrayInput)(nil)).Elem(), EipInstanceAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EipInstanceAttachmentMapInput)(nil)).Elem(), EipInstanceAttachmentMap{})
	pulumi.RegisterOutputType(EipInstanceAttachmentOutput{})
	pulumi.RegisterOutputType(EipInstanceAttachmentArrayOutput{})
	pulumi.RegisterOutputType(EipInstanceAttachmentMapOutput{})
}
