// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the ECS instance type families of Alibaba Cloud.
//
// > **NOTE:** Available in 1.54.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := ecs.GetInstanceTypeFamilies(ctx, &ecs.GetInstanceTypeFamiliesArgs{
//				InstanceChargeType: pulumi.StringRef("PrePaid"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstInstanceTypeFamilyId", _default.Families[0].Id)
//			ctx.Export("instanceIds", _default.Ids)
//			return nil
//		})
//	}
//
// ```
func GetInstanceTypeFamilies(ctx *pulumi.Context, args *GetInstanceTypeFamiliesArgs, opts ...pulumi.InvokeOption) (*GetInstanceTypeFamiliesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstanceTypeFamiliesResult
	err := ctx.Invoke("alicloud:ecs/getInstanceTypeFamilies:getInstanceTypeFamilies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceTypeFamilies.
type GetInstanceTypeFamiliesArgs struct {
	// The generation of the instance type family, Valid values: `ecs-1`, `ecs-2`, `ecs-3`, `ecs-4`, `ecs-5`, `ecs-6`. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.htm).
	Generation *string `pulumi:"generation"`
	// Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Filter the results by ECS spot type. Valid values: `NoSpot`, `SpotWithPriceLimit` and `SpotAsPriceGo`. Default to `NoSpot`.
	SpotStrategy *string `pulumi:"spotStrategy"`
	// The Zone to launch the instance.
	ZoneId *string `pulumi:"zoneId"`
}

// A collection of values returned by getInstanceTypeFamilies.
type GetInstanceTypeFamiliesResult struct {
	Families []GetInstanceTypeFamiliesFamily `pulumi:"families"`
	// The generation of the instance type family.
	Generation *string `pulumi:"generation"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of instance type family IDs.
	Ids                []string `pulumi:"ids"`
	InstanceChargeType *string  `pulumi:"instanceChargeType"`
	OutputFile         *string  `pulumi:"outputFile"`
	SpotStrategy       *string  `pulumi:"spotStrategy"`
	ZoneId             *string  `pulumi:"zoneId"`
}

func GetInstanceTypeFamiliesOutput(ctx *pulumi.Context, args GetInstanceTypeFamiliesOutputArgs, opts ...pulumi.InvokeOption) GetInstanceTypeFamiliesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetInstanceTypeFamiliesResultOutput, error) {
			args := v.(GetInstanceTypeFamiliesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:ecs/getInstanceTypeFamilies:getInstanceTypeFamilies", args, GetInstanceTypeFamiliesResultOutput{}, options).(GetInstanceTypeFamiliesResultOutput), nil
		}).(GetInstanceTypeFamiliesResultOutput)
}

// A collection of arguments for invoking getInstanceTypeFamilies.
type GetInstanceTypeFamiliesOutputArgs struct {
	// The generation of the instance type family, Valid values: `ecs-1`, `ecs-2`, `ecs-3`, `ecs-4`, `ecs-5`, `ecs-6`. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.htm).
	Generation pulumi.StringPtrInput `pulumi:"generation"`
	// Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
	InstanceChargeType pulumi.StringPtrInput `pulumi:"instanceChargeType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Filter the results by ECS spot type. Valid values: `NoSpot`, `SpotWithPriceLimit` and `SpotAsPriceGo`. Default to `NoSpot`.
	SpotStrategy pulumi.StringPtrInput `pulumi:"spotStrategy"`
	// The Zone to launch the instance.
	ZoneId pulumi.StringPtrInput `pulumi:"zoneId"`
}

func (GetInstanceTypeFamiliesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceTypeFamiliesArgs)(nil)).Elem()
}

// A collection of values returned by getInstanceTypeFamilies.
type GetInstanceTypeFamiliesResultOutput struct{ *pulumi.OutputState }

func (GetInstanceTypeFamiliesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceTypeFamiliesResult)(nil)).Elem()
}

func (o GetInstanceTypeFamiliesResultOutput) ToGetInstanceTypeFamiliesResultOutput() GetInstanceTypeFamiliesResultOutput {
	return o
}

func (o GetInstanceTypeFamiliesResultOutput) ToGetInstanceTypeFamiliesResultOutputWithContext(ctx context.Context) GetInstanceTypeFamiliesResultOutput {
	return o
}

func (o GetInstanceTypeFamiliesResultOutput) Families() GetInstanceTypeFamiliesFamilyArrayOutput {
	return o.ApplyT(func(v GetInstanceTypeFamiliesResult) []GetInstanceTypeFamiliesFamily { return v.Families }).(GetInstanceTypeFamiliesFamilyArrayOutput)
}

// The generation of the instance type family.
func (o GetInstanceTypeFamiliesResultOutput) Generation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypeFamiliesResult) *string { return v.Generation }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetInstanceTypeFamiliesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceTypeFamiliesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of instance type family IDs.
func (o GetInstanceTypeFamiliesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetInstanceTypeFamiliesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetInstanceTypeFamiliesResultOutput) InstanceChargeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypeFamiliesResult) *string { return v.InstanceChargeType }).(pulumi.StringPtrOutput)
}

func (o GetInstanceTypeFamiliesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypeFamiliesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetInstanceTypeFamiliesResultOutput) SpotStrategy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypeFamiliesResult) *string { return v.SpotStrategy }).(pulumi.StringPtrOutput)
}

func (o GetInstanceTypeFamiliesResultOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypeFamiliesResult) *string { return v.ZoneId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceTypeFamiliesResultOutput{})
}
