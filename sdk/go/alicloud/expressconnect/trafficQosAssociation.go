// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package expressconnect

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Express Connect Traffic Qos Association resource. Express Connect QoS associated resources.
//
// For information about Express Connect Traffic Qos Association and how to use it, see [What is Traffic Qos Association](https://next.api.alibabacloud.com/document/Vpc/2016-04-28/ModifyExpressConnectTrafficQos).
//
// > **NOTE:** Available since v1.224.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/expressconnect"
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
//			_default, err := expressconnect.GetPhysicalConnections(ctx, &expressconnect.GetPhysicalConnectionsArgs{
//				NameRegex: pulumi.StringRef("preserved-NODELETING"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			createQos, err := expressconnect.NewTrafficQos(ctx, "createQos", &expressconnect.TrafficQosArgs{
//				QosName:        pulumi.String(name),
//				QosDescription: pulumi.String("terraform-example"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = expressconnect.NewTrafficQosAssociation(ctx, "associateQos", &expressconnect.TrafficQosAssociationArgs{
//				InstanceId:   pulumi.String(_default.Ids[1]),
//				QosId:        createQos.ID(),
//				InstanceType: pulumi.String("PHYSICALCONNECTION"),
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
// Express Connect Traffic Qos Association can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:expressconnect/trafficQosAssociation:TrafficQosAssociation example <qos_id>:<instance_id>:<instance_type>
// ```
type TrafficQosAssociation struct {
	pulumi.CustomResourceState

	// The ID of the associated instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The type of the associated instance. Value: **physical connection** physical connection.
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// The QoS policy ID.
	QosId pulumi.StringOutput `pulumi:"qosId"`
	// The status of the associated instance. Value:
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewTrafficQosAssociation registers a new resource with the given unique name, arguments, and options.
func NewTrafficQosAssociation(ctx *pulumi.Context,
	name string, args *TrafficQosAssociationArgs, opts ...pulumi.ResourceOption) (*TrafficQosAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.QosId == nil {
		return nil, errors.New("invalid value for required argument 'QosId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TrafficQosAssociation
	err := ctx.RegisterResource("alicloud:expressconnect/trafficQosAssociation:TrafficQosAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTrafficQosAssociation gets an existing TrafficQosAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTrafficQosAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TrafficQosAssociationState, opts ...pulumi.ResourceOption) (*TrafficQosAssociation, error) {
	var resource TrafficQosAssociation
	err := ctx.ReadResource("alicloud:expressconnect/trafficQosAssociation:TrafficQosAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TrafficQosAssociation resources.
type trafficQosAssociationState struct {
	// The ID of the associated instance.
	InstanceId *string `pulumi:"instanceId"`
	// The type of the associated instance. Value: **physical connection** physical connection.
	InstanceType *string `pulumi:"instanceType"`
	// The QoS policy ID.
	QosId *string `pulumi:"qosId"`
	// The status of the associated instance. Value:
	Status *string `pulumi:"status"`
}

type TrafficQosAssociationState struct {
	// The ID of the associated instance.
	InstanceId pulumi.StringPtrInput
	// The type of the associated instance. Value: **physical connection** physical connection.
	InstanceType pulumi.StringPtrInput
	// The QoS policy ID.
	QosId pulumi.StringPtrInput
	// The status of the associated instance. Value:
	Status pulumi.StringPtrInput
}

func (TrafficQosAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*trafficQosAssociationState)(nil)).Elem()
}

type trafficQosAssociationArgs struct {
	// The ID of the associated instance.
	InstanceId *string `pulumi:"instanceId"`
	// The type of the associated instance. Value: **physical connection** physical connection.
	InstanceType *string `pulumi:"instanceType"`
	// The QoS policy ID.
	QosId string `pulumi:"qosId"`
}

// The set of arguments for constructing a TrafficQosAssociation resource.
type TrafficQosAssociationArgs struct {
	// The ID of the associated instance.
	InstanceId pulumi.StringPtrInput
	// The type of the associated instance. Value: **physical connection** physical connection.
	InstanceType pulumi.StringPtrInput
	// The QoS policy ID.
	QosId pulumi.StringInput
}

func (TrafficQosAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*trafficQosAssociationArgs)(nil)).Elem()
}

type TrafficQosAssociationInput interface {
	pulumi.Input

	ToTrafficQosAssociationOutput() TrafficQosAssociationOutput
	ToTrafficQosAssociationOutputWithContext(ctx context.Context) TrafficQosAssociationOutput
}

func (*TrafficQosAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**TrafficQosAssociation)(nil)).Elem()
}

func (i *TrafficQosAssociation) ToTrafficQosAssociationOutput() TrafficQosAssociationOutput {
	return i.ToTrafficQosAssociationOutputWithContext(context.Background())
}

func (i *TrafficQosAssociation) ToTrafficQosAssociationOutputWithContext(ctx context.Context) TrafficQosAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrafficQosAssociationOutput)
}

// TrafficQosAssociationArrayInput is an input type that accepts TrafficQosAssociationArray and TrafficQosAssociationArrayOutput values.
// You can construct a concrete instance of `TrafficQosAssociationArrayInput` via:
//
//	TrafficQosAssociationArray{ TrafficQosAssociationArgs{...} }
type TrafficQosAssociationArrayInput interface {
	pulumi.Input

	ToTrafficQosAssociationArrayOutput() TrafficQosAssociationArrayOutput
	ToTrafficQosAssociationArrayOutputWithContext(context.Context) TrafficQosAssociationArrayOutput
}

type TrafficQosAssociationArray []TrafficQosAssociationInput

func (TrafficQosAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrafficQosAssociation)(nil)).Elem()
}

func (i TrafficQosAssociationArray) ToTrafficQosAssociationArrayOutput() TrafficQosAssociationArrayOutput {
	return i.ToTrafficQosAssociationArrayOutputWithContext(context.Background())
}

func (i TrafficQosAssociationArray) ToTrafficQosAssociationArrayOutputWithContext(ctx context.Context) TrafficQosAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrafficQosAssociationArrayOutput)
}

// TrafficQosAssociationMapInput is an input type that accepts TrafficQosAssociationMap and TrafficQosAssociationMapOutput values.
// You can construct a concrete instance of `TrafficQosAssociationMapInput` via:
//
//	TrafficQosAssociationMap{ "key": TrafficQosAssociationArgs{...} }
type TrafficQosAssociationMapInput interface {
	pulumi.Input

	ToTrafficQosAssociationMapOutput() TrafficQosAssociationMapOutput
	ToTrafficQosAssociationMapOutputWithContext(context.Context) TrafficQosAssociationMapOutput
}

type TrafficQosAssociationMap map[string]TrafficQosAssociationInput

func (TrafficQosAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrafficQosAssociation)(nil)).Elem()
}

func (i TrafficQosAssociationMap) ToTrafficQosAssociationMapOutput() TrafficQosAssociationMapOutput {
	return i.ToTrafficQosAssociationMapOutputWithContext(context.Background())
}

func (i TrafficQosAssociationMap) ToTrafficQosAssociationMapOutputWithContext(ctx context.Context) TrafficQosAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrafficQosAssociationMapOutput)
}

type TrafficQosAssociationOutput struct{ *pulumi.OutputState }

func (TrafficQosAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TrafficQosAssociation)(nil)).Elem()
}

func (o TrafficQosAssociationOutput) ToTrafficQosAssociationOutput() TrafficQosAssociationOutput {
	return o
}

func (o TrafficQosAssociationOutput) ToTrafficQosAssociationOutputWithContext(ctx context.Context) TrafficQosAssociationOutput {
	return o
}

// The ID of the associated instance.
func (o TrafficQosAssociationOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *TrafficQosAssociation) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The type of the associated instance. Value: **physical connection** physical connection.
func (o TrafficQosAssociationOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *TrafficQosAssociation) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

// The QoS policy ID.
func (o TrafficQosAssociationOutput) QosId() pulumi.StringOutput {
	return o.ApplyT(func(v *TrafficQosAssociation) pulumi.StringOutput { return v.QosId }).(pulumi.StringOutput)
}

// The status of the associated instance. Value:
func (o TrafficQosAssociationOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *TrafficQosAssociation) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type TrafficQosAssociationArrayOutput struct{ *pulumi.OutputState }

func (TrafficQosAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrafficQosAssociation)(nil)).Elem()
}

func (o TrafficQosAssociationArrayOutput) ToTrafficQosAssociationArrayOutput() TrafficQosAssociationArrayOutput {
	return o
}

func (o TrafficQosAssociationArrayOutput) ToTrafficQosAssociationArrayOutputWithContext(ctx context.Context) TrafficQosAssociationArrayOutput {
	return o
}

func (o TrafficQosAssociationArrayOutput) Index(i pulumi.IntInput) TrafficQosAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TrafficQosAssociation {
		return vs[0].([]*TrafficQosAssociation)[vs[1].(int)]
	}).(TrafficQosAssociationOutput)
}

type TrafficQosAssociationMapOutput struct{ *pulumi.OutputState }

func (TrafficQosAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrafficQosAssociation)(nil)).Elem()
}

func (o TrafficQosAssociationMapOutput) ToTrafficQosAssociationMapOutput() TrafficQosAssociationMapOutput {
	return o
}

func (o TrafficQosAssociationMapOutput) ToTrafficQosAssociationMapOutputWithContext(ctx context.Context) TrafficQosAssociationMapOutput {
	return o
}

func (o TrafficQosAssociationMapOutput) MapIndex(k pulumi.StringInput) TrafficQosAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TrafficQosAssociation {
		return vs[0].(map[string]*TrafficQosAssociation)[vs[1].(string)]
	}).(TrafficQosAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TrafficQosAssociationInput)(nil)).Elem(), &TrafficQosAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrafficQosAssociationArrayInput)(nil)).Elem(), TrafficQosAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrafficQosAssociationMapInput)(nil)).Elem(), TrafficQosAssociationMap{})
	pulumi.RegisterOutputType(TrafficQosAssociationOutput{})
	pulumi.RegisterOutputType(TrafficQosAssociationArrayOutput{})
	pulumi.RegisterOutputType(TrafficQosAssociationMapOutput{})
}