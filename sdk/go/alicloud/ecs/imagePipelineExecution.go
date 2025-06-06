// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// ECS Image Pipeline Execution can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ecs/imagePipelineExecution:ImagePipelineExecution example <id>
// ```
type ImagePipelineExecution struct {
	pulumi.CustomResourceState

	// The time when the image build task was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The ID of the image template.
	ImagePipelineId pulumi.StringOutput `pulumi:"imagePipelineId"`
	// The status of the image build task. Valid values:
	// - CANCELLED: canceled. The build process has been canceled.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewImagePipelineExecution registers a new resource with the given unique name, arguments, and options.
func NewImagePipelineExecution(ctx *pulumi.Context,
	name string, args *ImagePipelineExecutionArgs, opts ...pulumi.ResourceOption) (*ImagePipelineExecution, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ImagePipelineId == nil {
		return nil, errors.New("invalid value for required argument 'ImagePipelineId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ImagePipelineExecution
	err := ctx.RegisterResource("alicloud:ecs/imagePipelineExecution:ImagePipelineExecution", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetImagePipelineExecution gets an existing ImagePipelineExecution resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetImagePipelineExecution(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ImagePipelineExecutionState, opts ...pulumi.ResourceOption) (*ImagePipelineExecution, error) {
	var resource ImagePipelineExecution
	err := ctx.ReadResource("alicloud:ecs/imagePipelineExecution:ImagePipelineExecution", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ImagePipelineExecution resources.
type imagePipelineExecutionState struct {
	// The time when the image build task was created.
	CreateTime *string `pulumi:"createTime"`
	// The ID of the image template.
	ImagePipelineId *string `pulumi:"imagePipelineId"`
	// The status of the image build task. Valid values:
	// - CANCELLED: canceled. The build process has been canceled.
	Status *string `pulumi:"status"`
}

type ImagePipelineExecutionState struct {
	// The time when the image build task was created.
	CreateTime pulumi.StringPtrInput
	// The ID of the image template.
	ImagePipelineId pulumi.StringPtrInput
	// The status of the image build task. Valid values:
	// - CANCELLED: canceled. The build process has been canceled.
	Status pulumi.StringPtrInput
}

func (ImagePipelineExecutionState) ElementType() reflect.Type {
	return reflect.TypeOf((*imagePipelineExecutionState)(nil)).Elem()
}

type imagePipelineExecutionArgs struct {
	// The ID of the image template.
	ImagePipelineId string `pulumi:"imagePipelineId"`
	// The status of the image build task. Valid values:
	// - CANCELLED: canceled. The build process has been canceled.
	Status *string `pulumi:"status"`
}

// The set of arguments for constructing a ImagePipelineExecution resource.
type ImagePipelineExecutionArgs struct {
	// The ID of the image template.
	ImagePipelineId pulumi.StringInput
	// The status of the image build task. Valid values:
	// - CANCELLED: canceled. The build process has been canceled.
	Status pulumi.StringPtrInput
}

func (ImagePipelineExecutionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*imagePipelineExecutionArgs)(nil)).Elem()
}

type ImagePipelineExecutionInput interface {
	pulumi.Input

	ToImagePipelineExecutionOutput() ImagePipelineExecutionOutput
	ToImagePipelineExecutionOutputWithContext(ctx context.Context) ImagePipelineExecutionOutput
}

func (*ImagePipelineExecution) ElementType() reflect.Type {
	return reflect.TypeOf((**ImagePipelineExecution)(nil)).Elem()
}

func (i *ImagePipelineExecution) ToImagePipelineExecutionOutput() ImagePipelineExecutionOutput {
	return i.ToImagePipelineExecutionOutputWithContext(context.Background())
}

func (i *ImagePipelineExecution) ToImagePipelineExecutionOutputWithContext(ctx context.Context) ImagePipelineExecutionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImagePipelineExecutionOutput)
}

// ImagePipelineExecutionArrayInput is an input type that accepts ImagePipelineExecutionArray and ImagePipelineExecutionArrayOutput values.
// You can construct a concrete instance of `ImagePipelineExecutionArrayInput` via:
//
//	ImagePipelineExecutionArray{ ImagePipelineExecutionArgs{...} }
type ImagePipelineExecutionArrayInput interface {
	pulumi.Input

	ToImagePipelineExecutionArrayOutput() ImagePipelineExecutionArrayOutput
	ToImagePipelineExecutionArrayOutputWithContext(context.Context) ImagePipelineExecutionArrayOutput
}

type ImagePipelineExecutionArray []ImagePipelineExecutionInput

func (ImagePipelineExecutionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ImagePipelineExecution)(nil)).Elem()
}

func (i ImagePipelineExecutionArray) ToImagePipelineExecutionArrayOutput() ImagePipelineExecutionArrayOutput {
	return i.ToImagePipelineExecutionArrayOutputWithContext(context.Background())
}

func (i ImagePipelineExecutionArray) ToImagePipelineExecutionArrayOutputWithContext(ctx context.Context) ImagePipelineExecutionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImagePipelineExecutionArrayOutput)
}

// ImagePipelineExecutionMapInput is an input type that accepts ImagePipelineExecutionMap and ImagePipelineExecutionMapOutput values.
// You can construct a concrete instance of `ImagePipelineExecutionMapInput` via:
//
//	ImagePipelineExecutionMap{ "key": ImagePipelineExecutionArgs{...} }
type ImagePipelineExecutionMapInput interface {
	pulumi.Input

	ToImagePipelineExecutionMapOutput() ImagePipelineExecutionMapOutput
	ToImagePipelineExecutionMapOutputWithContext(context.Context) ImagePipelineExecutionMapOutput
}

type ImagePipelineExecutionMap map[string]ImagePipelineExecutionInput

func (ImagePipelineExecutionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ImagePipelineExecution)(nil)).Elem()
}

func (i ImagePipelineExecutionMap) ToImagePipelineExecutionMapOutput() ImagePipelineExecutionMapOutput {
	return i.ToImagePipelineExecutionMapOutputWithContext(context.Background())
}

func (i ImagePipelineExecutionMap) ToImagePipelineExecutionMapOutputWithContext(ctx context.Context) ImagePipelineExecutionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImagePipelineExecutionMapOutput)
}

type ImagePipelineExecutionOutput struct{ *pulumi.OutputState }

func (ImagePipelineExecutionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ImagePipelineExecution)(nil)).Elem()
}

func (o ImagePipelineExecutionOutput) ToImagePipelineExecutionOutput() ImagePipelineExecutionOutput {
	return o
}

func (o ImagePipelineExecutionOutput) ToImagePipelineExecutionOutputWithContext(ctx context.Context) ImagePipelineExecutionOutput {
	return o
}

// The time when the image build task was created.
func (o ImagePipelineExecutionOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ImagePipelineExecution) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The ID of the image template.
func (o ImagePipelineExecutionOutput) ImagePipelineId() pulumi.StringOutput {
	return o.ApplyT(func(v *ImagePipelineExecution) pulumi.StringOutput { return v.ImagePipelineId }).(pulumi.StringOutput)
}

// The status of the image build task. Valid values:
// - CANCELLED: canceled. The build process has been canceled.
func (o ImagePipelineExecutionOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ImagePipelineExecution) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type ImagePipelineExecutionArrayOutput struct{ *pulumi.OutputState }

func (ImagePipelineExecutionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ImagePipelineExecution)(nil)).Elem()
}

func (o ImagePipelineExecutionArrayOutput) ToImagePipelineExecutionArrayOutput() ImagePipelineExecutionArrayOutput {
	return o
}

func (o ImagePipelineExecutionArrayOutput) ToImagePipelineExecutionArrayOutputWithContext(ctx context.Context) ImagePipelineExecutionArrayOutput {
	return o
}

func (o ImagePipelineExecutionArrayOutput) Index(i pulumi.IntInput) ImagePipelineExecutionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ImagePipelineExecution {
		return vs[0].([]*ImagePipelineExecution)[vs[1].(int)]
	}).(ImagePipelineExecutionOutput)
}

type ImagePipelineExecutionMapOutput struct{ *pulumi.OutputState }

func (ImagePipelineExecutionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ImagePipelineExecution)(nil)).Elem()
}

func (o ImagePipelineExecutionMapOutput) ToImagePipelineExecutionMapOutput() ImagePipelineExecutionMapOutput {
	return o
}

func (o ImagePipelineExecutionMapOutput) ToImagePipelineExecutionMapOutputWithContext(ctx context.Context) ImagePipelineExecutionMapOutput {
	return o
}

func (o ImagePipelineExecutionMapOutput) MapIndex(k pulumi.StringInput) ImagePipelineExecutionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ImagePipelineExecution {
		return vs[0].(map[string]*ImagePipelineExecution)[vs[1].(string)]
	}).(ImagePipelineExecutionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ImagePipelineExecutionInput)(nil)).Elem(), &ImagePipelineExecution{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImagePipelineExecutionArrayInput)(nil)).Elem(), ImagePipelineExecutionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImagePipelineExecutionMapInput)(nil)).Elem(), ImagePipelineExecutionMap{})
	pulumi.RegisterOutputType(ImagePipelineExecutionOutput{})
	pulumi.RegisterOutputType(ImagePipelineExecutionArrayOutput{})
	pulumi.RegisterOutputType(ImagePipelineExecutionMapOutput{})
}
