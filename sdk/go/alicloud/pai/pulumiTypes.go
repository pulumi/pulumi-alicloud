// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type WorkspaceDatasetLabel struct {
	// The key of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
	Key *string `pulumi:"key"`
	// The value of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
	Value *string `pulumi:"value"`
}

// WorkspaceDatasetLabelInput is an input type that accepts WorkspaceDatasetLabelArgs and WorkspaceDatasetLabelOutput values.
// You can construct a concrete instance of `WorkspaceDatasetLabelInput` via:
//
//	WorkspaceDatasetLabelArgs{...}
type WorkspaceDatasetLabelInput interface {
	pulumi.Input

	ToWorkspaceDatasetLabelOutput() WorkspaceDatasetLabelOutput
	ToWorkspaceDatasetLabelOutputWithContext(context.Context) WorkspaceDatasetLabelOutput
}

type WorkspaceDatasetLabelArgs struct {
	// The key of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
	Key pulumi.StringPtrInput `pulumi:"key"`
	// The value of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
	Value pulumi.StringPtrInput `pulumi:"value"`
}

func (WorkspaceDatasetLabelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkspaceDatasetLabel)(nil)).Elem()
}

func (i WorkspaceDatasetLabelArgs) ToWorkspaceDatasetLabelOutput() WorkspaceDatasetLabelOutput {
	return i.ToWorkspaceDatasetLabelOutputWithContext(context.Background())
}

func (i WorkspaceDatasetLabelArgs) ToWorkspaceDatasetLabelOutputWithContext(ctx context.Context) WorkspaceDatasetLabelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceDatasetLabelOutput)
}

// WorkspaceDatasetLabelArrayInput is an input type that accepts WorkspaceDatasetLabelArray and WorkspaceDatasetLabelArrayOutput values.
// You can construct a concrete instance of `WorkspaceDatasetLabelArrayInput` via:
//
//	WorkspaceDatasetLabelArray{ WorkspaceDatasetLabelArgs{...} }
type WorkspaceDatasetLabelArrayInput interface {
	pulumi.Input

	ToWorkspaceDatasetLabelArrayOutput() WorkspaceDatasetLabelArrayOutput
	ToWorkspaceDatasetLabelArrayOutputWithContext(context.Context) WorkspaceDatasetLabelArrayOutput
}

type WorkspaceDatasetLabelArray []WorkspaceDatasetLabelInput

func (WorkspaceDatasetLabelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]WorkspaceDatasetLabel)(nil)).Elem()
}

func (i WorkspaceDatasetLabelArray) ToWorkspaceDatasetLabelArrayOutput() WorkspaceDatasetLabelArrayOutput {
	return i.ToWorkspaceDatasetLabelArrayOutputWithContext(context.Background())
}

func (i WorkspaceDatasetLabelArray) ToWorkspaceDatasetLabelArrayOutputWithContext(ctx context.Context) WorkspaceDatasetLabelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceDatasetLabelArrayOutput)
}

type WorkspaceDatasetLabelOutput struct{ *pulumi.OutputState }

func (WorkspaceDatasetLabelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkspaceDatasetLabel)(nil)).Elem()
}

func (o WorkspaceDatasetLabelOutput) ToWorkspaceDatasetLabelOutput() WorkspaceDatasetLabelOutput {
	return o
}

func (o WorkspaceDatasetLabelOutput) ToWorkspaceDatasetLabelOutputWithContext(ctx context.Context) WorkspaceDatasetLabelOutput {
	return o
}

// The key of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
func (o WorkspaceDatasetLabelOutput) Key() pulumi.StringPtrOutput {
	return o.ApplyT(func(v WorkspaceDatasetLabel) *string { return v.Key }).(pulumi.StringPtrOutput)
}

// The value of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
func (o WorkspaceDatasetLabelOutput) Value() pulumi.StringPtrOutput {
	return o.ApplyT(func(v WorkspaceDatasetLabel) *string { return v.Value }).(pulumi.StringPtrOutput)
}

type WorkspaceDatasetLabelArrayOutput struct{ *pulumi.OutputState }

func (WorkspaceDatasetLabelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]WorkspaceDatasetLabel)(nil)).Elem()
}

func (o WorkspaceDatasetLabelArrayOutput) ToWorkspaceDatasetLabelArrayOutput() WorkspaceDatasetLabelArrayOutput {
	return o
}

func (o WorkspaceDatasetLabelArrayOutput) ToWorkspaceDatasetLabelArrayOutputWithContext(ctx context.Context) WorkspaceDatasetLabelArrayOutput {
	return o
}

func (o WorkspaceDatasetLabelArrayOutput) Index(i pulumi.IntInput) WorkspaceDatasetLabelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) WorkspaceDatasetLabel {
		return vs[0].([]WorkspaceDatasetLabel)[vs[1].(int)]
	}).(WorkspaceDatasetLabelOutput)
}

type WorkspaceDatasetversionLabel struct {
	// The key of the tags
	Key *string `pulumi:"key"`
	// The value of the tags
	Value *string `pulumi:"value"`
}

// WorkspaceDatasetversionLabelInput is an input type that accepts WorkspaceDatasetversionLabelArgs and WorkspaceDatasetversionLabelOutput values.
// You can construct a concrete instance of `WorkspaceDatasetversionLabelInput` via:
//
//	WorkspaceDatasetversionLabelArgs{...}
type WorkspaceDatasetversionLabelInput interface {
	pulumi.Input

	ToWorkspaceDatasetversionLabelOutput() WorkspaceDatasetversionLabelOutput
	ToWorkspaceDatasetversionLabelOutputWithContext(context.Context) WorkspaceDatasetversionLabelOutput
}

type WorkspaceDatasetversionLabelArgs struct {
	// The key of the tags
	Key pulumi.StringPtrInput `pulumi:"key"`
	// The value of the tags
	Value pulumi.StringPtrInput `pulumi:"value"`
}

func (WorkspaceDatasetversionLabelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkspaceDatasetversionLabel)(nil)).Elem()
}

func (i WorkspaceDatasetversionLabelArgs) ToWorkspaceDatasetversionLabelOutput() WorkspaceDatasetversionLabelOutput {
	return i.ToWorkspaceDatasetversionLabelOutputWithContext(context.Background())
}

func (i WorkspaceDatasetversionLabelArgs) ToWorkspaceDatasetversionLabelOutputWithContext(ctx context.Context) WorkspaceDatasetversionLabelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceDatasetversionLabelOutput)
}

// WorkspaceDatasetversionLabelArrayInput is an input type that accepts WorkspaceDatasetversionLabelArray and WorkspaceDatasetversionLabelArrayOutput values.
// You can construct a concrete instance of `WorkspaceDatasetversionLabelArrayInput` via:
//
//	WorkspaceDatasetversionLabelArray{ WorkspaceDatasetversionLabelArgs{...} }
type WorkspaceDatasetversionLabelArrayInput interface {
	pulumi.Input

	ToWorkspaceDatasetversionLabelArrayOutput() WorkspaceDatasetversionLabelArrayOutput
	ToWorkspaceDatasetversionLabelArrayOutputWithContext(context.Context) WorkspaceDatasetversionLabelArrayOutput
}

type WorkspaceDatasetversionLabelArray []WorkspaceDatasetversionLabelInput

func (WorkspaceDatasetversionLabelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]WorkspaceDatasetversionLabel)(nil)).Elem()
}

func (i WorkspaceDatasetversionLabelArray) ToWorkspaceDatasetversionLabelArrayOutput() WorkspaceDatasetversionLabelArrayOutput {
	return i.ToWorkspaceDatasetversionLabelArrayOutputWithContext(context.Background())
}

func (i WorkspaceDatasetversionLabelArray) ToWorkspaceDatasetversionLabelArrayOutputWithContext(ctx context.Context) WorkspaceDatasetversionLabelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceDatasetversionLabelArrayOutput)
}

type WorkspaceDatasetversionLabelOutput struct{ *pulumi.OutputState }

func (WorkspaceDatasetversionLabelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkspaceDatasetversionLabel)(nil)).Elem()
}

func (o WorkspaceDatasetversionLabelOutput) ToWorkspaceDatasetversionLabelOutput() WorkspaceDatasetversionLabelOutput {
	return o
}

func (o WorkspaceDatasetversionLabelOutput) ToWorkspaceDatasetversionLabelOutputWithContext(ctx context.Context) WorkspaceDatasetversionLabelOutput {
	return o
}

// The key of the tags
func (o WorkspaceDatasetversionLabelOutput) Key() pulumi.StringPtrOutput {
	return o.ApplyT(func(v WorkspaceDatasetversionLabel) *string { return v.Key }).(pulumi.StringPtrOutput)
}

// The value of the tags
func (o WorkspaceDatasetversionLabelOutput) Value() pulumi.StringPtrOutput {
	return o.ApplyT(func(v WorkspaceDatasetversionLabel) *string { return v.Value }).(pulumi.StringPtrOutput)
}

type WorkspaceDatasetversionLabelArrayOutput struct{ *pulumi.OutputState }

func (WorkspaceDatasetversionLabelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]WorkspaceDatasetversionLabel)(nil)).Elem()
}

func (o WorkspaceDatasetversionLabelArrayOutput) ToWorkspaceDatasetversionLabelArrayOutput() WorkspaceDatasetversionLabelArrayOutput {
	return o
}

func (o WorkspaceDatasetversionLabelArrayOutput) ToWorkspaceDatasetversionLabelArrayOutputWithContext(ctx context.Context) WorkspaceDatasetversionLabelArrayOutput {
	return o
}

func (o WorkspaceDatasetversionLabelArrayOutput) Index(i pulumi.IntInput) WorkspaceDatasetversionLabelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) WorkspaceDatasetversionLabel {
		return vs[0].([]WorkspaceDatasetversionLabel)[vs[1].(int)]
	}).(WorkspaceDatasetversionLabelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceDatasetLabelInput)(nil)).Elem(), WorkspaceDatasetLabelArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceDatasetLabelArrayInput)(nil)).Elem(), WorkspaceDatasetLabelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceDatasetversionLabelInput)(nil)).Elem(), WorkspaceDatasetversionLabelArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceDatasetversionLabelArrayInput)(nil)).Elem(), WorkspaceDatasetversionLabelArray{})
	pulumi.RegisterOutputType(WorkspaceDatasetLabelOutput{})
	pulumi.RegisterOutputType(WorkspaceDatasetLabelArrayOutput{})
	pulumi.RegisterOutputType(WorkspaceDatasetversionLabelOutput{})
	pulumi.RegisterOutputType(WorkspaceDatasetversionLabelArrayOutput{})
}
