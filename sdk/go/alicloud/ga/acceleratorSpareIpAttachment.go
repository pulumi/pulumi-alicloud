// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ga

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Global Accelerator (GA) Accelerator Spare Ip Attachment resource.
//
// For information about Global Accelerator (GA) Accelerator Spare Ip Attachment and how to use it, see [What is Accelerator Spare Ip Attachment](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createspareips).
//
// > **NOTE:** Available since v1.167.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ga"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := ga.NewAccelerator(ctx, "default", &ga.AcceleratorArgs{
//				Duration:        pulumi.Int(1),
//				Spec:            pulumi.String("1"),
//				AcceleratorName: pulumi.String("terraform-example"),
//				AutoUseCoupon:   pulumi.Bool(true),
//				Description:     pulumi.String("terraform-example"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultBandwidthPackage, err := ga.NewBandwidthPackage(ctx, "default", &ga.BandwidthPackageArgs{
//				Bandwidth:            pulumi.Int(100),
//				Type:                 pulumi.String("Basic"),
//				BandwidthType:        pulumi.String("Basic"),
//				PaymentType:          pulumi.String("PayAsYouGo"),
//				BillingType:          pulumi.String("PayBy95"),
//				Ratio:                pulumi.Int(30),
//				BandwidthPackageName: pulumi.String("terraform-example"),
//				AutoPay:              pulumi.Bool(true),
//				AutoUseCoupon:        pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			defaultBandwidthPackageAttachment, err := ga.NewBandwidthPackageAttachment(ctx, "default", &ga.BandwidthPackageAttachmentArgs{
//				AcceleratorId:      _default.ID(),
//				BandwidthPackageId: defaultBandwidthPackage.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ga.NewAcceleratorSpareIpAttachment(ctx, "default", &ga.AcceleratorSpareIpAttachmentArgs{
//				AcceleratorId: defaultBandwidthPackageAttachment.AcceleratorId,
//				SpareIp:       pulumi.String("127.0.0.1"),
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
// Global Accelerator (GA) Accelerator Spare Ip Attachment can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ga/acceleratorSpareIpAttachment:AcceleratorSpareIpAttachment example <accelerator_id>:<spare_ip>
// ```
type AcceleratorSpareIpAttachment struct {
	pulumi.CustomResourceState

	// The ID of the global acceleration instance.
	AcceleratorId pulumi.StringOutput `pulumi:"acceleratorId"`
	// The dry run.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// The standby IP address of CNAME. When the acceleration area is abnormal, the traffic is switched to the standby IP address.
	SpareIp pulumi.StringOutput `pulumi:"spareIp"`
	// The status of the standby CNAME IP address.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewAcceleratorSpareIpAttachment registers a new resource with the given unique name, arguments, and options.
func NewAcceleratorSpareIpAttachment(ctx *pulumi.Context,
	name string, args *AcceleratorSpareIpAttachmentArgs, opts ...pulumi.ResourceOption) (*AcceleratorSpareIpAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AcceleratorId == nil {
		return nil, errors.New("invalid value for required argument 'AcceleratorId'")
	}
	if args.SpareIp == nil {
		return nil, errors.New("invalid value for required argument 'SpareIp'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AcceleratorSpareIpAttachment
	err := ctx.RegisterResource("alicloud:ga/acceleratorSpareIpAttachment:AcceleratorSpareIpAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAcceleratorSpareIpAttachment gets an existing AcceleratorSpareIpAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAcceleratorSpareIpAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AcceleratorSpareIpAttachmentState, opts ...pulumi.ResourceOption) (*AcceleratorSpareIpAttachment, error) {
	var resource AcceleratorSpareIpAttachment
	err := ctx.ReadResource("alicloud:ga/acceleratorSpareIpAttachment:AcceleratorSpareIpAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AcceleratorSpareIpAttachment resources.
type acceleratorSpareIpAttachmentState struct {
	// The ID of the global acceleration instance.
	AcceleratorId *string `pulumi:"acceleratorId"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// The standby IP address of CNAME. When the acceleration area is abnormal, the traffic is switched to the standby IP address.
	SpareIp *string `pulumi:"spareIp"`
	// The status of the standby CNAME IP address.
	Status *string `pulumi:"status"`
}

type AcceleratorSpareIpAttachmentState struct {
	// The ID of the global acceleration instance.
	AcceleratorId pulumi.StringPtrInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// The standby IP address of CNAME. When the acceleration area is abnormal, the traffic is switched to the standby IP address.
	SpareIp pulumi.StringPtrInput
	// The status of the standby CNAME IP address.
	Status pulumi.StringPtrInput
}

func (AcceleratorSpareIpAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*acceleratorSpareIpAttachmentState)(nil)).Elem()
}

type acceleratorSpareIpAttachmentArgs struct {
	// The ID of the global acceleration instance.
	AcceleratorId string `pulumi:"acceleratorId"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// The standby IP address of CNAME. When the acceleration area is abnormal, the traffic is switched to the standby IP address.
	SpareIp string `pulumi:"spareIp"`
}

// The set of arguments for constructing a AcceleratorSpareIpAttachment resource.
type AcceleratorSpareIpAttachmentArgs struct {
	// The ID of the global acceleration instance.
	AcceleratorId pulumi.StringInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// The standby IP address of CNAME. When the acceleration area is abnormal, the traffic is switched to the standby IP address.
	SpareIp pulumi.StringInput
}

func (AcceleratorSpareIpAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*acceleratorSpareIpAttachmentArgs)(nil)).Elem()
}

type AcceleratorSpareIpAttachmentInput interface {
	pulumi.Input

	ToAcceleratorSpareIpAttachmentOutput() AcceleratorSpareIpAttachmentOutput
	ToAcceleratorSpareIpAttachmentOutputWithContext(ctx context.Context) AcceleratorSpareIpAttachmentOutput
}

func (*AcceleratorSpareIpAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**AcceleratorSpareIpAttachment)(nil)).Elem()
}

func (i *AcceleratorSpareIpAttachment) ToAcceleratorSpareIpAttachmentOutput() AcceleratorSpareIpAttachmentOutput {
	return i.ToAcceleratorSpareIpAttachmentOutputWithContext(context.Background())
}

func (i *AcceleratorSpareIpAttachment) ToAcceleratorSpareIpAttachmentOutputWithContext(ctx context.Context) AcceleratorSpareIpAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AcceleratorSpareIpAttachmentOutput)
}

// AcceleratorSpareIpAttachmentArrayInput is an input type that accepts AcceleratorSpareIpAttachmentArray and AcceleratorSpareIpAttachmentArrayOutput values.
// You can construct a concrete instance of `AcceleratorSpareIpAttachmentArrayInput` via:
//
//	AcceleratorSpareIpAttachmentArray{ AcceleratorSpareIpAttachmentArgs{...} }
type AcceleratorSpareIpAttachmentArrayInput interface {
	pulumi.Input

	ToAcceleratorSpareIpAttachmentArrayOutput() AcceleratorSpareIpAttachmentArrayOutput
	ToAcceleratorSpareIpAttachmentArrayOutputWithContext(context.Context) AcceleratorSpareIpAttachmentArrayOutput
}

type AcceleratorSpareIpAttachmentArray []AcceleratorSpareIpAttachmentInput

func (AcceleratorSpareIpAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AcceleratorSpareIpAttachment)(nil)).Elem()
}

func (i AcceleratorSpareIpAttachmentArray) ToAcceleratorSpareIpAttachmentArrayOutput() AcceleratorSpareIpAttachmentArrayOutput {
	return i.ToAcceleratorSpareIpAttachmentArrayOutputWithContext(context.Background())
}

func (i AcceleratorSpareIpAttachmentArray) ToAcceleratorSpareIpAttachmentArrayOutputWithContext(ctx context.Context) AcceleratorSpareIpAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AcceleratorSpareIpAttachmentArrayOutput)
}

// AcceleratorSpareIpAttachmentMapInput is an input type that accepts AcceleratorSpareIpAttachmentMap and AcceleratorSpareIpAttachmentMapOutput values.
// You can construct a concrete instance of `AcceleratorSpareIpAttachmentMapInput` via:
//
//	AcceleratorSpareIpAttachmentMap{ "key": AcceleratorSpareIpAttachmentArgs{...} }
type AcceleratorSpareIpAttachmentMapInput interface {
	pulumi.Input

	ToAcceleratorSpareIpAttachmentMapOutput() AcceleratorSpareIpAttachmentMapOutput
	ToAcceleratorSpareIpAttachmentMapOutputWithContext(context.Context) AcceleratorSpareIpAttachmentMapOutput
}

type AcceleratorSpareIpAttachmentMap map[string]AcceleratorSpareIpAttachmentInput

func (AcceleratorSpareIpAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AcceleratorSpareIpAttachment)(nil)).Elem()
}

func (i AcceleratorSpareIpAttachmentMap) ToAcceleratorSpareIpAttachmentMapOutput() AcceleratorSpareIpAttachmentMapOutput {
	return i.ToAcceleratorSpareIpAttachmentMapOutputWithContext(context.Background())
}

func (i AcceleratorSpareIpAttachmentMap) ToAcceleratorSpareIpAttachmentMapOutputWithContext(ctx context.Context) AcceleratorSpareIpAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AcceleratorSpareIpAttachmentMapOutput)
}

type AcceleratorSpareIpAttachmentOutput struct{ *pulumi.OutputState }

func (AcceleratorSpareIpAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AcceleratorSpareIpAttachment)(nil)).Elem()
}

func (o AcceleratorSpareIpAttachmentOutput) ToAcceleratorSpareIpAttachmentOutput() AcceleratorSpareIpAttachmentOutput {
	return o
}

func (o AcceleratorSpareIpAttachmentOutput) ToAcceleratorSpareIpAttachmentOutputWithContext(ctx context.Context) AcceleratorSpareIpAttachmentOutput {
	return o
}

// The ID of the global acceleration instance.
func (o AcceleratorSpareIpAttachmentOutput) AcceleratorId() pulumi.StringOutput {
	return o.ApplyT(func(v *AcceleratorSpareIpAttachment) pulumi.StringOutput { return v.AcceleratorId }).(pulumi.StringOutput)
}

// The dry run.
func (o AcceleratorSpareIpAttachmentOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AcceleratorSpareIpAttachment) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// The standby IP address of CNAME. When the acceleration area is abnormal, the traffic is switched to the standby IP address.
func (o AcceleratorSpareIpAttachmentOutput) SpareIp() pulumi.StringOutput {
	return o.ApplyT(func(v *AcceleratorSpareIpAttachment) pulumi.StringOutput { return v.SpareIp }).(pulumi.StringOutput)
}

// The status of the standby CNAME IP address.
func (o AcceleratorSpareIpAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *AcceleratorSpareIpAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type AcceleratorSpareIpAttachmentArrayOutput struct{ *pulumi.OutputState }

func (AcceleratorSpareIpAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AcceleratorSpareIpAttachment)(nil)).Elem()
}

func (o AcceleratorSpareIpAttachmentArrayOutput) ToAcceleratorSpareIpAttachmentArrayOutput() AcceleratorSpareIpAttachmentArrayOutput {
	return o
}

func (o AcceleratorSpareIpAttachmentArrayOutput) ToAcceleratorSpareIpAttachmentArrayOutputWithContext(ctx context.Context) AcceleratorSpareIpAttachmentArrayOutput {
	return o
}

func (o AcceleratorSpareIpAttachmentArrayOutput) Index(i pulumi.IntInput) AcceleratorSpareIpAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AcceleratorSpareIpAttachment {
		return vs[0].([]*AcceleratorSpareIpAttachment)[vs[1].(int)]
	}).(AcceleratorSpareIpAttachmentOutput)
}

type AcceleratorSpareIpAttachmentMapOutput struct{ *pulumi.OutputState }

func (AcceleratorSpareIpAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AcceleratorSpareIpAttachment)(nil)).Elem()
}

func (o AcceleratorSpareIpAttachmentMapOutput) ToAcceleratorSpareIpAttachmentMapOutput() AcceleratorSpareIpAttachmentMapOutput {
	return o
}

func (o AcceleratorSpareIpAttachmentMapOutput) ToAcceleratorSpareIpAttachmentMapOutputWithContext(ctx context.Context) AcceleratorSpareIpAttachmentMapOutput {
	return o
}

func (o AcceleratorSpareIpAttachmentMapOutput) MapIndex(k pulumi.StringInput) AcceleratorSpareIpAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AcceleratorSpareIpAttachment {
		return vs[0].(map[string]*AcceleratorSpareIpAttachment)[vs[1].(string)]
	}).(AcceleratorSpareIpAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AcceleratorSpareIpAttachmentInput)(nil)).Elem(), &AcceleratorSpareIpAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*AcceleratorSpareIpAttachmentArrayInput)(nil)).Elem(), AcceleratorSpareIpAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AcceleratorSpareIpAttachmentMapInput)(nil)).Elem(), AcceleratorSpareIpAttachmentMap{})
	pulumi.RegisterOutputType(AcceleratorSpareIpAttachmentOutput{})
	pulumi.RegisterOutputType(AcceleratorSpareIpAttachmentArrayOutput{})
	pulumi.RegisterOutputType(AcceleratorSpareIpAttachmentMapOutput{})
}
