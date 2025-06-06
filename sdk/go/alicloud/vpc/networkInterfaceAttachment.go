// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **DEPRECATED:** This resource has been renamed to ecs.EcsNetworkInterfaceAttachment from version 1.123.1.
//
// Provides an Alicloud ECS Elastic Network Interface Attachment as a resource to attach ENI to or detach ENI from ECS Instances.
//
// For information about Elastic Network Interface and how to use it, see [Elastic Network Interface](https://www.alibabacloud.com/help/doc-detail/58496.html).
//
// ## Import
//
// Network Interfaces Attachment resource can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:vpc/networkInterfaceAttachment:NetworkInterfaceAttachment eni eni-abc123456789000:i-abc123456789000
// ```
type NetworkInterfaceAttachment struct {
	pulumi.CustomResourceState

	// The instance ID to attach.
	InstanceId       pulumi.StringOutput `pulumi:"instanceId"`
	NetworkCardIndex pulumi.IntPtrOutput `pulumi:"networkCardIndex"`
	// The ENI ID to attach.
	NetworkInterfaceId               pulumi.StringOutput    `pulumi:"networkInterfaceId"`
	TrunkNetworkInstanceId           pulumi.StringPtrOutput `pulumi:"trunkNetworkInstanceId"`
	WaitForNetworkConfigurationReady pulumi.BoolPtrOutput   `pulumi:"waitForNetworkConfigurationReady"`
}

// NewNetworkInterfaceAttachment registers a new resource with the given unique name, arguments, and options.
func NewNetworkInterfaceAttachment(ctx *pulumi.Context,
	name string, args *NetworkInterfaceAttachmentArgs, opts ...pulumi.ResourceOption) (*NetworkInterfaceAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.NetworkInterfaceId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkInterfaceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NetworkInterfaceAttachment
	err := ctx.RegisterResource("alicloud:vpc/networkInterfaceAttachment:NetworkInterfaceAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkInterfaceAttachment gets an existing NetworkInterfaceAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkInterfaceAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkInterfaceAttachmentState, opts ...pulumi.ResourceOption) (*NetworkInterfaceAttachment, error) {
	var resource NetworkInterfaceAttachment
	err := ctx.ReadResource("alicloud:vpc/networkInterfaceAttachment:NetworkInterfaceAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkInterfaceAttachment resources.
type networkInterfaceAttachmentState struct {
	// The instance ID to attach.
	InstanceId       *string `pulumi:"instanceId"`
	NetworkCardIndex *int    `pulumi:"networkCardIndex"`
	// The ENI ID to attach.
	NetworkInterfaceId               *string `pulumi:"networkInterfaceId"`
	TrunkNetworkInstanceId           *string `pulumi:"trunkNetworkInstanceId"`
	WaitForNetworkConfigurationReady *bool   `pulumi:"waitForNetworkConfigurationReady"`
}

type NetworkInterfaceAttachmentState struct {
	// The instance ID to attach.
	InstanceId       pulumi.StringPtrInput
	NetworkCardIndex pulumi.IntPtrInput
	// The ENI ID to attach.
	NetworkInterfaceId               pulumi.StringPtrInput
	TrunkNetworkInstanceId           pulumi.StringPtrInput
	WaitForNetworkConfigurationReady pulumi.BoolPtrInput
}

func (NetworkInterfaceAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkInterfaceAttachmentState)(nil)).Elem()
}

type networkInterfaceAttachmentArgs struct {
	// The instance ID to attach.
	InstanceId       string `pulumi:"instanceId"`
	NetworkCardIndex *int   `pulumi:"networkCardIndex"`
	// The ENI ID to attach.
	NetworkInterfaceId               string  `pulumi:"networkInterfaceId"`
	TrunkNetworkInstanceId           *string `pulumi:"trunkNetworkInstanceId"`
	WaitForNetworkConfigurationReady *bool   `pulumi:"waitForNetworkConfigurationReady"`
}

// The set of arguments for constructing a NetworkInterfaceAttachment resource.
type NetworkInterfaceAttachmentArgs struct {
	// The instance ID to attach.
	InstanceId       pulumi.StringInput
	NetworkCardIndex pulumi.IntPtrInput
	// The ENI ID to attach.
	NetworkInterfaceId               pulumi.StringInput
	TrunkNetworkInstanceId           pulumi.StringPtrInput
	WaitForNetworkConfigurationReady pulumi.BoolPtrInput
}

func (NetworkInterfaceAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkInterfaceAttachmentArgs)(nil)).Elem()
}

type NetworkInterfaceAttachmentInput interface {
	pulumi.Input

	ToNetworkInterfaceAttachmentOutput() NetworkInterfaceAttachmentOutput
	ToNetworkInterfaceAttachmentOutputWithContext(ctx context.Context) NetworkInterfaceAttachmentOutput
}

func (*NetworkInterfaceAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkInterfaceAttachment)(nil)).Elem()
}

func (i *NetworkInterfaceAttachment) ToNetworkInterfaceAttachmentOutput() NetworkInterfaceAttachmentOutput {
	return i.ToNetworkInterfaceAttachmentOutputWithContext(context.Background())
}

func (i *NetworkInterfaceAttachment) ToNetworkInterfaceAttachmentOutputWithContext(ctx context.Context) NetworkInterfaceAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkInterfaceAttachmentOutput)
}

// NetworkInterfaceAttachmentArrayInput is an input type that accepts NetworkInterfaceAttachmentArray and NetworkInterfaceAttachmentArrayOutput values.
// You can construct a concrete instance of `NetworkInterfaceAttachmentArrayInput` via:
//
//	NetworkInterfaceAttachmentArray{ NetworkInterfaceAttachmentArgs{...} }
type NetworkInterfaceAttachmentArrayInput interface {
	pulumi.Input

	ToNetworkInterfaceAttachmentArrayOutput() NetworkInterfaceAttachmentArrayOutput
	ToNetworkInterfaceAttachmentArrayOutputWithContext(context.Context) NetworkInterfaceAttachmentArrayOutput
}

type NetworkInterfaceAttachmentArray []NetworkInterfaceAttachmentInput

func (NetworkInterfaceAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkInterfaceAttachment)(nil)).Elem()
}

func (i NetworkInterfaceAttachmentArray) ToNetworkInterfaceAttachmentArrayOutput() NetworkInterfaceAttachmentArrayOutput {
	return i.ToNetworkInterfaceAttachmentArrayOutputWithContext(context.Background())
}

func (i NetworkInterfaceAttachmentArray) ToNetworkInterfaceAttachmentArrayOutputWithContext(ctx context.Context) NetworkInterfaceAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkInterfaceAttachmentArrayOutput)
}

// NetworkInterfaceAttachmentMapInput is an input type that accepts NetworkInterfaceAttachmentMap and NetworkInterfaceAttachmentMapOutput values.
// You can construct a concrete instance of `NetworkInterfaceAttachmentMapInput` via:
//
//	NetworkInterfaceAttachmentMap{ "key": NetworkInterfaceAttachmentArgs{...} }
type NetworkInterfaceAttachmentMapInput interface {
	pulumi.Input

	ToNetworkInterfaceAttachmentMapOutput() NetworkInterfaceAttachmentMapOutput
	ToNetworkInterfaceAttachmentMapOutputWithContext(context.Context) NetworkInterfaceAttachmentMapOutput
}

type NetworkInterfaceAttachmentMap map[string]NetworkInterfaceAttachmentInput

func (NetworkInterfaceAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkInterfaceAttachment)(nil)).Elem()
}

func (i NetworkInterfaceAttachmentMap) ToNetworkInterfaceAttachmentMapOutput() NetworkInterfaceAttachmentMapOutput {
	return i.ToNetworkInterfaceAttachmentMapOutputWithContext(context.Background())
}

func (i NetworkInterfaceAttachmentMap) ToNetworkInterfaceAttachmentMapOutputWithContext(ctx context.Context) NetworkInterfaceAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkInterfaceAttachmentMapOutput)
}

type NetworkInterfaceAttachmentOutput struct{ *pulumi.OutputState }

func (NetworkInterfaceAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkInterfaceAttachment)(nil)).Elem()
}

func (o NetworkInterfaceAttachmentOutput) ToNetworkInterfaceAttachmentOutput() NetworkInterfaceAttachmentOutput {
	return o
}

func (o NetworkInterfaceAttachmentOutput) ToNetworkInterfaceAttachmentOutputWithContext(ctx context.Context) NetworkInterfaceAttachmentOutput {
	return o
}

// The instance ID to attach.
func (o NetworkInterfaceAttachmentOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkInterfaceAttachment) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

func (o NetworkInterfaceAttachmentOutput) NetworkCardIndex() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *NetworkInterfaceAttachment) pulumi.IntPtrOutput { return v.NetworkCardIndex }).(pulumi.IntPtrOutput)
}

// The ENI ID to attach.
func (o NetworkInterfaceAttachmentOutput) NetworkInterfaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkInterfaceAttachment) pulumi.StringOutput { return v.NetworkInterfaceId }).(pulumi.StringOutput)
}

func (o NetworkInterfaceAttachmentOutput) TrunkNetworkInstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NetworkInterfaceAttachment) pulumi.StringPtrOutput { return v.TrunkNetworkInstanceId }).(pulumi.StringPtrOutput)
}

func (o NetworkInterfaceAttachmentOutput) WaitForNetworkConfigurationReady() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *NetworkInterfaceAttachment) pulumi.BoolPtrOutput { return v.WaitForNetworkConfigurationReady }).(pulumi.BoolPtrOutput)
}

type NetworkInterfaceAttachmentArrayOutput struct{ *pulumi.OutputState }

func (NetworkInterfaceAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkInterfaceAttachment)(nil)).Elem()
}

func (o NetworkInterfaceAttachmentArrayOutput) ToNetworkInterfaceAttachmentArrayOutput() NetworkInterfaceAttachmentArrayOutput {
	return o
}

func (o NetworkInterfaceAttachmentArrayOutput) ToNetworkInterfaceAttachmentArrayOutputWithContext(ctx context.Context) NetworkInterfaceAttachmentArrayOutput {
	return o
}

func (o NetworkInterfaceAttachmentArrayOutput) Index(i pulumi.IntInput) NetworkInterfaceAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NetworkInterfaceAttachment {
		return vs[0].([]*NetworkInterfaceAttachment)[vs[1].(int)]
	}).(NetworkInterfaceAttachmentOutput)
}

type NetworkInterfaceAttachmentMapOutput struct{ *pulumi.OutputState }

func (NetworkInterfaceAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkInterfaceAttachment)(nil)).Elem()
}

func (o NetworkInterfaceAttachmentMapOutput) ToNetworkInterfaceAttachmentMapOutput() NetworkInterfaceAttachmentMapOutput {
	return o
}

func (o NetworkInterfaceAttachmentMapOutput) ToNetworkInterfaceAttachmentMapOutputWithContext(ctx context.Context) NetworkInterfaceAttachmentMapOutput {
	return o
}

func (o NetworkInterfaceAttachmentMapOutput) MapIndex(k pulumi.StringInput) NetworkInterfaceAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NetworkInterfaceAttachment {
		return vs[0].(map[string]*NetworkInterfaceAttachment)[vs[1].(string)]
	}).(NetworkInterfaceAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkInterfaceAttachmentInput)(nil)).Elem(), &NetworkInterfaceAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkInterfaceAttachmentArrayInput)(nil)).Elem(), NetworkInterfaceAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkInterfaceAttachmentMapInput)(nil)).Elem(), NetworkInterfaceAttachmentMap{})
	pulumi.RegisterOutputType(NetworkInterfaceAttachmentOutput{})
	pulumi.RegisterOutputType(NetworkInterfaceAttachmentArrayOutput{})
	pulumi.RegisterOutputType(NetworkInterfaceAttachmentMapOutput{})
}
