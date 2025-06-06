// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package expressconnect

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Express Connect Traffic Qos resource. Express Connect Traffic QoS Policy.
//
// For information about Express Connect Traffic Qos and how to use it, see [What is Traffic Qos](https://next.api.alibabacloud.com/document/Vpc/2016-04-28/CreateExpressConnectTrafficQos).
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
//			_, err := expressconnect.GetPhysicalConnections(ctx, &expressconnect.GetPhysicalConnectionsArgs{
//				NameRegex: pulumi.StringRef("preserved-NODELETING"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = expressconnect.NewTrafficQos(ctx, "createQos", &expressconnect.TrafficQosArgs{
//				QosName:        pulumi.String(name),
//				QosDescription: pulumi.String("terraform-example"),
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
// Express Connect Traffic Qos can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:expressconnect/trafficQos:TrafficQos example <id>
// ```
type TrafficQos struct {
	pulumi.CustomResourceState

	// The description of the QoS policy.  The length is **0** to **256** characters and cannot start with 'http:// 'or 'https.
	QosDescription pulumi.StringPtrOutput `pulumi:"qosDescription"`
	// The name of the QoS policy.  The length is **0** to **128** characters and cannot start with 'http:// 'or 'https.
	QosName pulumi.StringPtrOutput `pulumi:"qosName"`
	// The status of the QoS policy. Value:
	// > **NOTE:**  QoS in the configuration state will restrict the creation, update, and deletion of most QoS policies, QoS queues, and QoS rules.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewTrafficQos registers a new resource with the given unique name, arguments, and options.
func NewTrafficQos(ctx *pulumi.Context,
	name string, args *TrafficQosArgs, opts ...pulumi.ResourceOption) (*TrafficQos, error) {
	if args == nil {
		args = &TrafficQosArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TrafficQos
	err := ctx.RegisterResource("alicloud:expressconnect/trafficQos:TrafficQos", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTrafficQos gets an existing TrafficQos resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTrafficQos(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TrafficQosState, opts ...pulumi.ResourceOption) (*TrafficQos, error) {
	var resource TrafficQos
	err := ctx.ReadResource("alicloud:expressconnect/trafficQos:TrafficQos", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TrafficQos resources.
type trafficQosState struct {
	// The description of the QoS policy.  The length is **0** to **256** characters and cannot start with 'http:// 'or 'https.
	QosDescription *string `pulumi:"qosDescription"`
	// The name of the QoS policy.  The length is **0** to **128** characters and cannot start with 'http:// 'or 'https.
	QosName *string `pulumi:"qosName"`
	// The status of the QoS policy. Value:
	// > **NOTE:**  QoS in the configuration state will restrict the creation, update, and deletion of most QoS policies, QoS queues, and QoS rules.
	Status *string `pulumi:"status"`
}

type TrafficQosState struct {
	// The description of the QoS policy.  The length is **0** to **256** characters and cannot start with 'http:// 'or 'https.
	QosDescription pulumi.StringPtrInput
	// The name of the QoS policy.  The length is **0** to **128** characters and cannot start with 'http:// 'or 'https.
	QosName pulumi.StringPtrInput
	// The status of the QoS policy. Value:
	// > **NOTE:**  QoS in the configuration state will restrict the creation, update, and deletion of most QoS policies, QoS queues, and QoS rules.
	Status pulumi.StringPtrInput
}

func (TrafficQosState) ElementType() reflect.Type {
	return reflect.TypeOf((*trafficQosState)(nil)).Elem()
}

type trafficQosArgs struct {
	// The description of the QoS policy.  The length is **0** to **256** characters and cannot start with 'http:// 'or 'https.
	QosDescription *string `pulumi:"qosDescription"`
	// The name of the QoS policy.  The length is **0** to **128** characters and cannot start with 'http:// 'or 'https.
	QosName *string `pulumi:"qosName"`
}

// The set of arguments for constructing a TrafficQos resource.
type TrafficQosArgs struct {
	// The description of the QoS policy.  The length is **0** to **256** characters and cannot start with 'http:// 'or 'https.
	QosDescription pulumi.StringPtrInput
	// The name of the QoS policy.  The length is **0** to **128** characters and cannot start with 'http:// 'or 'https.
	QosName pulumi.StringPtrInput
}

func (TrafficQosArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*trafficQosArgs)(nil)).Elem()
}

type TrafficQosInput interface {
	pulumi.Input

	ToTrafficQosOutput() TrafficQosOutput
	ToTrafficQosOutputWithContext(ctx context.Context) TrafficQosOutput
}

func (*TrafficQos) ElementType() reflect.Type {
	return reflect.TypeOf((**TrafficQos)(nil)).Elem()
}

func (i *TrafficQos) ToTrafficQosOutput() TrafficQosOutput {
	return i.ToTrafficQosOutputWithContext(context.Background())
}

func (i *TrafficQos) ToTrafficQosOutputWithContext(ctx context.Context) TrafficQosOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrafficQosOutput)
}

// TrafficQosArrayInput is an input type that accepts TrafficQosArray and TrafficQosArrayOutput values.
// You can construct a concrete instance of `TrafficQosArrayInput` via:
//
//	TrafficQosArray{ TrafficQosArgs{...} }
type TrafficQosArrayInput interface {
	pulumi.Input

	ToTrafficQosArrayOutput() TrafficQosArrayOutput
	ToTrafficQosArrayOutputWithContext(context.Context) TrafficQosArrayOutput
}

type TrafficQosArray []TrafficQosInput

func (TrafficQosArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrafficQos)(nil)).Elem()
}

func (i TrafficQosArray) ToTrafficQosArrayOutput() TrafficQosArrayOutput {
	return i.ToTrafficQosArrayOutputWithContext(context.Background())
}

func (i TrafficQosArray) ToTrafficQosArrayOutputWithContext(ctx context.Context) TrafficQosArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrafficQosArrayOutput)
}

// TrafficQosMapInput is an input type that accepts TrafficQosMap and TrafficQosMapOutput values.
// You can construct a concrete instance of `TrafficQosMapInput` via:
//
//	TrafficQosMap{ "key": TrafficQosArgs{...} }
type TrafficQosMapInput interface {
	pulumi.Input

	ToTrafficQosMapOutput() TrafficQosMapOutput
	ToTrafficQosMapOutputWithContext(context.Context) TrafficQosMapOutput
}

type TrafficQosMap map[string]TrafficQosInput

func (TrafficQosMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrafficQos)(nil)).Elem()
}

func (i TrafficQosMap) ToTrafficQosMapOutput() TrafficQosMapOutput {
	return i.ToTrafficQosMapOutputWithContext(context.Background())
}

func (i TrafficQosMap) ToTrafficQosMapOutputWithContext(ctx context.Context) TrafficQosMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrafficQosMapOutput)
}

type TrafficQosOutput struct{ *pulumi.OutputState }

func (TrafficQosOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TrafficQos)(nil)).Elem()
}

func (o TrafficQosOutput) ToTrafficQosOutput() TrafficQosOutput {
	return o
}

func (o TrafficQosOutput) ToTrafficQosOutputWithContext(ctx context.Context) TrafficQosOutput {
	return o
}

// The description of the QoS policy.  The length is **0** to **256** characters and cannot start with 'http:// 'or 'https.
func (o TrafficQosOutput) QosDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TrafficQos) pulumi.StringPtrOutput { return v.QosDescription }).(pulumi.StringPtrOutput)
}

// The name of the QoS policy.  The length is **0** to **128** characters and cannot start with 'http:// 'or 'https.
func (o TrafficQosOutput) QosName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TrafficQos) pulumi.StringPtrOutput { return v.QosName }).(pulumi.StringPtrOutput)
}

// The status of the QoS policy. Value:
// > **NOTE:**  QoS in the configuration state will restrict the creation, update, and deletion of most QoS policies, QoS queues, and QoS rules.
func (o TrafficQosOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *TrafficQos) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type TrafficQosArrayOutput struct{ *pulumi.OutputState }

func (TrafficQosArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrafficQos)(nil)).Elem()
}

func (o TrafficQosArrayOutput) ToTrafficQosArrayOutput() TrafficQosArrayOutput {
	return o
}

func (o TrafficQosArrayOutput) ToTrafficQosArrayOutputWithContext(ctx context.Context) TrafficQosArrayOutput {
	return o
}

func (o TrafficQosArrayOutput) Index(i pulumi.IntInput) TrafficQosOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TrafficQos {
		return vs[0].([]*TrafficQos)[vs[1].(int)]
	}).(TrafficQosOutput)
}

type TrafficQosMapOutput struct{ *pulumi.OutputState }

func (TrafficQosMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrafficQos)(nil)).Elem()
}

func (o TrafficQosMapOutput) ToTrafficQosMapOutput() TrafficQosMapOutput {
	return o
}

func (o TrafficQosMapOutput) ToTrafficQosMapOutputWithContext(ctx context.Context) TrafficQosMapOutput {
	return o
}

func (o TrafficQosMapOutput) MapIndex(k pulumi.StringInput) TrafficQosOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TrafficQos {
		return vs[0].(map[string]*TrafficQos)[vs[1].(string)]
	}).(TrafficQosOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TrafficQosInput)(nil)).Elem(), &TrafficQos{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrafficQosArrayInput)(nil)).Elem(), TrafficQosArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrafficQosMapInput)(nil)).Elem(), TrafficQosMap{})
	pulumi.RegisterOutputType(TrafficQosOutput{})
	pulumi.RegisterOutputType(TrafficQosArrayOutput{})
	pulumi.RegisterOutputType(TrafficQosMapOutput{})
}
