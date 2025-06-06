// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ddos

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Ddos Basic defense threshold resource.
//
// For information about Ddos Basic Antiddos and how to use it, see [What is Defense Threshold](https://www.alibabacloud.com/help/en/ddos-protection/latest/modifydefensethreshold).
//
// > **NOTE:** Available since v1.168.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ddos"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_default, err := ecs.NewEipAddress(ctx, "default", &ecs.EipAddressArgs{
//				AddressName:        pulumi.String(name),
//				Isp:                pulumi.String("BGP"),
//				InternetChargeType: pulumi.String("PayByBandwidth"),
//				PaymentType:        pulumi.String("PayAsYouGo"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ddos.NewBasicDefenseThreshold(ctx, "default", &ddos.BasicDefenseThresholdArgs{
//				InstanceId:   _default.ID(),
//				DdosType:     pulumi.String("defense"),
//				InstanceType: pulumi.String("eip"),
//				Bps:          pulumi.Int(390),
//				Pps:          pulumi.Int(90000),
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
// Ddos Basic Antiddos can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ddos/basicDefenseThreshold:BasicDefenseThreshold example <instance_id>:<instance_type>:<ddos_type>
// ```
type BasicDefenseThreshold struct {
	pulumi.CustomResourceState

	// Specifies the traffic scrubbing threshold. Unit: Mbit/s. The traffic scrubbing threshold cannot exceed the peak inbound or outbound Internet traffic, whichever is larger, of the asset.
	Bps pulumi.IntOutput `pulumi:"bps"`
	// The type of the threshold to query. Valid values: `defense`,`blackhole`.
	DdosType pulumi.StringOutput `pulumi:"ddosType"`
	// The ID of the instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The instance type of the public IP address asset. Value: `ecs`,`slb`,`eip`.
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// The Internet IP address.
	InternetIp pulumi.StringOutput `pulumi:"internetIp"`
	// Whether it is the system default threshold. Value:
	IsAuto pulumi.BoolOutput `pulumi:"isAuto"`
	// The maximum traffic scrubbing threshold. Unit: Mbit/s.
	MaxBps pulumi.IntOutput `pulumi:"maxBps"`
	// The maximum packet scrubbing threshold. Unit: pps.
	MaxPps pulumi.IntOutput `pulumi:"maxPps"`
	// The current message number cleaning threshold. Unit: pps.
	Pps pulumi.IntOutput `pulumi:"pps"`
}

// NewBasicDefenseThreshold registers a new resource with the given unique name, arguments, and options.
func NewBasicDefenseThreshold(ctx *pulumi.Context,
	name string, args *BasicDefenseThresholdArgs, opts ...pulumi.ResourceOption) (*BasicDefenseThreshold, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DdosType == nil {
		return nil, errors.New("invalid value for required argument 'DdosType'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.InstanceType == nil {
		return nil, errors.New("invalid value for required argument 'InstanceType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BasicDefenseThreshold
	err := ctx.RegisterResource("alicloud:ddos/basicDefenseThreshold:BasicDefenseThreshold", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBasicDefenseThreshold gets an existing BasicDefenseThreshold resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBasicDefenseThreshold(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BasicDefenseThresholdState, opts ...pulumi.ResourceOption) (*BasicDefenseThreshold, error) {
	var resource BasicDefenseThreshold
	err := ctx.ReadResource("alicloud:ddos/basicDefenseThreshold:BasicDefenseThreshold", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BasicDefenseThreshold resources.
type basicDefenseThresholdState struct {
	// Specifies the traffic scrubbing threshold. Unit: Mbit/s. The traffic scrubbing threshold cannot exceed the peak inbound or outbound Internet traffic, whichever is larger, of the asset.
	Bps *int `pulumi:"bps"`
	// The type of the threshold to query. Valid values: `defense`,`blackhole`.
	DdosType *string `pulumi:"ddosType"`
	// The ID of the instance.
	InstanceId *string `pulumi:"instanceId"`
	// The instance type of the public IP address asset. Value: `ecs`,`slb`,`eip`.
	InstanceType *string `pulumi:"instanceType"`
	// The Internet IP address.
	InternetIp *string `pulumi:"internetIp"`
	// Whether it is the system default threshold. Value:
	IsAuto *bool `pulumi:"isAuto"`
	// The maximum traffic scrubbing threshold. Unit: Mbit/s.
	MaxBps *int `pulumi:"maxBps"`
	// The maximum packet scrubbing threshold. Unit: pps.
	MaxPps *int `pulumi:"maxPps"`
	// The current message number cleaning threshold. Unit: pps.
	Pps *int `pulumi:"pps"`
}

type BasicDefenseThresholdState struct {
	// Specifies the traffic scrubbing threshold. Unit: Mbit/s. The traffic scrubbing threshold cannot exceed the peak inbound or outbound Internet traffic, whichever is larger, of the asset.
	Bps pulumi.IntPtrInput
	// The type of the threshold to query. Valid values: `defense`,`blackhole`.
	DdosType pulumi.StringPtrInput
	// The ID of the instance.
	InstanceId pulumi.StringPtrInput
	// The instance type of the public IP address asset. Value: `ecs`,`slb`,`eip`.
	InstanceType pulumi.StringPtrInput
	// The Internet IP address.
	InternetIp pulumi.StringPtrInput
	// Whether it is the system default threshold. Value:
	IsAuto pulumi.BoolPtrInput
	// The maximum traffic scrubbing threshold. Unit: Mbit/s.
	MaxBps pulumi.IntPtrInput
	// The maximum packet scrubbing threshold. Unit: pps.
	MaxPps pulumi.IntPtrInput
	// The current message number cleaning threshold. Unit: pps.
	Pps pulumi.IntPtrInput
}

func (BasicDefenseThresholdState) ElementType() reflect.Type {
	return reflect.TypeOf((*basicDefenseThresholdState)(nil)).Elem()
}

type basicDefenseThresholdArgs struct {
	// Specifies the traffic scrubbing threshold. Unit: Mbit/s. The traffic scrubbing threshold cannot exceed the peak inbound or outbound Internet traffic, whichever is larger, of the asset.
	Bps *int `pulumi:"bps"`
	// The type of the threshold to query. Valid values: `defense`,`blackhole`.
	DdosType string `pulumi:"ddosType"`
	// The ID of the instance.
	InstanceId string `pulumi:"instanceId"`
	// The instance type of the public IP address asset. Value: `ecs`,`slb`,`eip`.
	InstanceType string `pulumi:"instanceType"`
	// The Internet IP address.
	InternetIp *string `pulumi:"internetIp"`
	// Whether it is the system default threshold. Value:
	IsAuto *bool `pulumi:"isAuto"`
	// The current message number cleaning threshold. Unit: pps.
	Pps *int `pulumi:"pps"`
}

// The set of arguments for constructing a BasicDefenseThreshold resource.
type BasicDefenseThresholdArgs struct {
	// Specifies the traffic scrubbing threshold. Unit: Mbit/s. The traffic scrubbing threshold cannot exceed the peak inbound or outbound Internet traffic, whichever is larger, of the asset.
	Bps pulumi.IntPtrInput
	// The type of the threshold to query. Valid values: `defense`,`blackhole`.
	DdosType pulumi.StringInput
	// The ID of the instance.
	InstanceId pulumi.StringInput
	// The instance type of the public IP address asset. Value: `ecs`,`slb`,`eip`.
	InstanceType pulumi.StringInput
	// The Internet IP address.
	InternetIp pulumi.StringPtrInput
	// Whether it is the system default threshold. Value:
	IsAuto pulumi.BoolPtrInput
	// The current message number cleaning threshold. Unit: pps.
	Pps pulumi.IntPtrInput
}

func (BasicDefenseThresholdArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*basicDefenseThresholdArgs)(nil)).Elem()
}

type BasicDefenseThresholdInput interface {
	pulumi.Input

	ToBasicDefenseThresholdOutput() BasicDefenseThresholdOutput
	ToBasicDefenseThresholdOutputWithContext(ctx context.Context) BasicDefenseThresholdOutput
}

func (*BasicDefenseThreshold) ElementType() reflect.Type {
	return reflect.TypeOf((**BasicDefenseThreshold)(nil)).Elem()
}

func (i *BasicDefenseThreshold) ToBasicDefenseThresholdOutput() BasicDefenseThresholdOutput {
	return i.ToBasicDefenseThresholdOutputWithContext(context.Background())
}

func (i *BasicDefenseThreshold) ToBasicDefenseThresholdOutputWithContext(ctx context.Context) BasicDefenseThresholdOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BasicDefenseThresholdOutput)
}

// BasicDefenseThresholdArrayInput is an input type that accepts BasicDefenseThresholdArray and BasicDefenseThresholdArrayOutput values.
// You can construct a concrete instance of `BasicDefenseThresholdArrayInput` via:
//
//	BasicDefenseThresholdArray{ BasicDefenseThresholdArgs{...} }
type BasicDefenseThresholdArrayInput interface {
	pulumi.Input

	ToBasicDefenseThresholdArrayOutput() BasicDefenseThresholdArrayOutput
	ToBasicDefenseThresholdArrayOutputWithContext(context.Context) BasicDefenseThresholdArrayOutput
}

type BasicDefenseThresholdArray []BasicDefenseThresholdInput

func (BasicDefenseThresholdArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BasicDefenseThreshold)(nil)).Elem()
}

func (i BasicDefenseThresholdArray) ToBasicDefenseThresholdArrayOutput() BasicDefenseThresholdArrayOutput {
	return i.ToBasicDefenseThresholdArrayOutputWithContext(context.Background())
}

func (i BasicDefenseThresholdArray) ToBasicDefenseThresholdArrayOutputWithContext(ctx context.Context) BasicDefenseThresholdArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BasicDefenseThresholdArrayOutput)
}

// BasicDefenseThresholdMapInput is an input type that accepts BasicDefenseThresholdMap and BasicDefenseThresholdMapOutput values.
// You can construct a concrete instance of `BasicDefenseThresholdMapInput` via:
//
//	BasicDefenseThresholdMap{ "key": BasicDefenseThresholdArgs{...} }
type BasicDefenseThresholdMapInput interface {
	pulumi.Input

	ToBasicDefenseThresholdMapOutput() BasicDefenseThresholdMapOutput
	ToBasicDefenseThresholdMapOutputWithContext(context.Context) BasicDefenseThresholdMapOutput
}

type BasicDefenseThresholdMap map[string]BasicDefenseThresholdInput

func (BasicDefenseThresholdMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BasicDefenseThreshold)(nil)).Elem()
}

func (i BasicDefenseThresholdMap) ToBasicDefenseThresholdMapOutput() BasicDefenseThresholdMapOutput {
	return i.ToBasicDefenseThresholdMapOutputWithContext(context.Background())
}

func (i BasicDefenseThresholdMap) ToBasicDefenseThresholdMapOutputWithContext(ctx context.Context) BasicDefenseThresholdMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BasicDefenseThresholdMapOutput)
}

type BasicDefenseThresholdOutput struct{ *pulumi.OutputState }

func (BasicDefenseThresholdOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BasicDefenseThreshold)(nil)).Elem()
}

func (o BasicDefenseThresholdOutput) ToBasicDefenseThresholdOutput() BasicDefenseThresholdOutput {
	return o
}

func (o BasicDefenseThresholdOutput) ToBasicDefenseThresholdOutputWithContext(ctx context.Context) BasicDefenseThresholdOutput {
	return o
}

// Specifies the traffic scrubbing threshold. Unit: Mbit/s. The traffic scrubbing threshold cannot exceed the peak inbound or outbound Internet traffic, whichever is larger, of the asset.
func (o BasicDefenseThresholdOutput) Bps() pulumi.IntOutput {
	return o.ApplyT(func(v *BasicDefenseThreshold) pulumi.IntOutput { return v.Bps }).(pulumi.IntOutput)
}

// The type of the threshold to query. Valid values: `defense`,`blackhole`.
func (o BasicDefenseThresholdOutput) DdosType() pulumi.StringOutput {
	return o.ApplyT(func(v *BasicDefenseThreshold) pulumi.StringOutput { return v.DdosType }).(pulumi.StringOutput)
}

// The ID of the instance.
func (o BasicDefenseThresholdOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *BasicDefenseThreshold) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The instance type of the public IP address asset. Value: `ecs`,`slb`,`eip`.
func (o BasicDefenseThresholdOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *BasicDefenseThreshold) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

// The Internet IP address.
func (o BasicDefenseThresholdOutput) InternetIp() pulumi.StringOutput {
	return o.ApplyT(func(v *BasicDefenseThreshold) pulumi.StringOutput { return v.InternetIp }).(pulumi.StringOutput)
}

// Whether it is the system default threshold. Value:
func (o BasicDefenseThresholdOutput) IsAuto() pulumi.BoolOutput {
	return o.ApplyT(func(v *BasicDefenseThreshold) pulumi.BoolOutput { return v.IsAuto }).(pulumi.BoolOutput)
}

// The maximum traffic scrubbing threshold. Unit: Mbit/s.
func (o BasicDefenseThresholdOutput) MaxBps() pulumi.IntOutput {
	return o.ApplyT(func(v *BasicDefenseThreshold) pulumi.IntOutput { return v.MaxBps }).(pulumi.IntOutput)
}

// The maximum packet scrubbing threshold. Unit: pps.
func (o BasicDefenseThresholdOutput) MaxPps() pulumi.IntOutput {
	return o.ApplyT(func(v *BasicDefenseThreshold) pulumi.IntOutput { return v.MaxPps }).(pulumi.IntOutput)
}

// The current message number cleaning threshold. Unit: pps.
func (o BasicDefenseThresholdOutput) Pps() pulumi.IntOutput {
	return o.ApplyT(func(v *BasicDefenseThreshold) pulumi.IntOutput { return v.Pps }).(pulumi.IntOutput)
}

type BasicDefenseThresholdArrayOutput struct{ *pulumi.OutputState }

func (BasicDefenseThresholdArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BasicDefenseThreshold)(nil)).Elem()
}

func (o BasicDefenseThresholdArrayOutput) ToBasicDefenseThresholdArrayOutput() BasicDefenseThresholdArrayOutput {
	return o
}

func (o BasicDefenseThresholdArrayOutput) ToBasicDefenseThresholdArrayOutputWithContext(ctx context.Context) BasicDefenseThresholdArrayOutput {
	return o
}

func (o BasicDefenseThresholdArrayOutput) Index(i pulumi.IntInput) BasicDefenseThresholdOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BasicDefenseThreshold {
		return vs[0].([]*BasicDefenseThreshold)[vs[1].(int)]
	}).(BasicDefenseThresholdOutput)
}

type BasicDefenseThresholdMapOutput struct{ *pulumi.OutputState }

func (BasicDefenseThresholdMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BasicDefenseThreshold)(nil)).Elem()
}

func (o BasicDefenseThresholdMapOutput) ToBasicDefenseThresholdMapOutput() BasicDefenseThresholdMapOutput {
	return o
}

func (o BasicDefenseThresholdMapOutput) ToBasicDefenseThresholdMapOutputWithContext(ctx context.Context) BasicDefenseThresholdMapOutput {
	return o
}

func (o BasicDefenseThresholdMapOutput) MapIndex(k pulumi.StringInput) BasicDefenseThresholdOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BasicDefenseThreshold {
		return vs[0].(map[string]*BasicDefenseThreshold)[vs[1].(string)]
	}).(BasicDefenseThresholdOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BasicDefenseThresholdInput)(nil)).Elem(), &BasicDefenseThreshold{})
	pulumi.RegisterInputType(reflect.TypeOf((*BasicDefenseThresholdArrayInput)(nil)).Elem(), BasicDefenseThresholdArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BasicDefenseThresholdMapInput)(nil)).Elem(), BasicDefenseThresholdMap{})
	pulumi.RegisterOutputType(BasicDefenseThresholdOutput{})
	pulumi.RegisterOutputType(BasicDefenseThresholdArrayOutput{})
	pulumi.RegisterOutputType(BasicDefenseThresholdMapOutput{})
}
