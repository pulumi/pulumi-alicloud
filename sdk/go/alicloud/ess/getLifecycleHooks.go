// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ess

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides available lifecycle hook resources.
//
// > **NOTE:** Available in 1.72.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ess"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ds, err := ess.GetLifecycleHooks(ctx, &ess.GetLifecycleHooksArgs{
//				ScalingGroupId: pulumi.StringRef("scaling_group_id"),
//				NameRegex:      pulumi.StringRef("lifecyclehook_name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstLifecycleHook", ds.Hooks[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetLifecycleHooks(ctx *pulumi.Context, args *GetLifecycleHooksArgs, opts ...pulumi.InvokeOption) (*GetLifecycleHooksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLifecycleHooksResult
	err := ctx.Invoke("alicloud:ess/getLifecycleHooks:getLifecycleHooks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLifecycleHooks.
type GetLifecycleHooksArgs struct {
	// A list of lifecycle hook IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter resulting lifecycle hook by name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Scaling group id the lifecycle hooks belong to.
	ScalingGroupId *string `pulumi:"scalingGroupId"`
}

// A collection of values returned by getLifecycleHooks.
type GetLifecycleHooksResult struct {
	// A list of lifecycle hooks. Each element contains the following attributes:
	Hooks []GetLifecycleHooksHook `pulumi:"hooks"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of lifecycle hook ids.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of lifecycle hook names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// ID of the scaling group.
	ScalingGroupId *string `pulumi:"scalingGroupId"`
}

func GetLifecycleHooksOutput(ctx *pulumi.Context, args GetLifecycleHooksOutputArgs, opts ...pulumi.InvokeOption) GetLifecycleHooksResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetLifecycleHooksResultOutput, error) {
			args := v.(GetLifecycleHooksArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:ess/getLifecycleHooks:getLifecycleHooks", args, GetLifecycleHooksResultOutput{}, options).(GetLifecycleHooksResultOutput), nil
		}).(GetLifecycleHooksResultOutput)
}

// A collection of arguments for invoking getLifecycleHooks.
type GetLifecycleHooksOutputArgs struct {
	// A list of lifecycle hook IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter resulting lifecycle hook by name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Scaling group id the lifecycle hooks belong to.
	ScalingGroupId pulumi.StringPtrInput `pulumi:"scalingGroupId"`
}

func (GetLifecycleHooksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLifecycleHooksArgs)(nil)).Elem()
}

// A collection of values returned by getLifecycleHooks.
type GetLifecycleHooksResultOutput struct{ *pulumi.OutputState }

func (GetLifecycleHooksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLifecycleHooksResult)(nil)).Elem()
}

func (o GetLifecycleHooksResultOutput) ToGetLifecycleHooksResultOutput() GetLifecycleHooksResultOutput {
	return o
}

func (o GetLifecycleHooksResultOutput) ToGetLifecycleHooksResultOutputWithContext(ctx context.Context) GetLifecycleHooksResultOutput {
	return o
}

// A list of lifecycle hooks. Each element contains the following attributes:
func (o GetLifecycleHooksResultOutput) Hooks() GetLifecycleHooksHookArrayOutput {
	return o.ApplyT(func(v GetLifecycleHooksResult) []GetLifecycleHooksHook { return v.Hooks }).(GetLifecycleHooksHookArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetLifecycleHooksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLifecycleHooksResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of lifecycle hook ids.
func (o GetLifecycleHooksResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLifecycleHooksResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetLifecycleHooksResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLifecycleHooksResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of lifecycle hook names.
func (o GetLifecycleHooksResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLifecycleHooksResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetLifecycleHooksResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLifecycleHooksResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// ID of the scaling group.
func (o GetLifecycleHooksResultOutput) ScalingGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLifecycleHooksResult) *string { return v.ScalingGroupId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLifecycleHooksResultOutput{})
}
