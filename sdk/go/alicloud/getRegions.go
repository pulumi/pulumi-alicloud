// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package alicloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides Alibaba Cloud regions.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			currentRegionDs, err := alicloud.GetRegions(ctx, &alicloud.GetRegionsArgs{
//				Current: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("currentRegionId", currentRegionDs.Regions[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetRegions(ctx *pulumi.Context, args *GetRegionsArgs, opts ...pulumi.InvokeOption) (*GetRegionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRegionsResult
	err := ctx.Invoke("alicloud:index/getRegions:getRegions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRegions.
type GetRegionsArgs struct {
	// Set to true to match only the region configured in the provider.
	Current *bool `pulumi:"current"`
	// The name of the region to select, such as `eu-central-1`.
	Name *string `pulumi:"name"`
	// File name where to save data source results (after running `pulumi preview`).
	//
	// > **NOTE:** You will get an error if you set `current` to true and `name` to a different value from the one you configured in the provider.
	// It is better to either use `name` or `current`, but not both at the same time.
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getRegions.
type GetRegionsResult struct {
	Current bool `pulumi:"current"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of region IDs.
	Ids        []string `pulumi:"ids"`
	Name       string   `pulumi:"name"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of regions. Each element contains the following attributes:
	Regions []GetRegionsRegion `pulumi:"regions"`
}

func GetRegionsOutput(ctx *pulumi.Context, args GetRegionsOutputArgs, opts ...pulumi.InvokeOption) GetRegionsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetRegionsResultOutput, error) {
			args := v.(GetRegionsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:index/getRegions:getRegions", args, GetRegionsResultOutput{}, options).(GetRegionsResultOutput), nil
		}).(GetRegionsResultOutput)
}

// A collection of arguments for invoking getRegions.
type GetRegionsOutputArgs struct {
	// Set to true to match only the region configured in the provider.
	Current pulumi.BoolPtrInput `pulumi:"current"`
	// The name of the region to select, such as `eu-central-1`.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// File name where to save data source results (after running `pulumi preview`).
	//
	// > **NOTE:** You will get an error if you set `current` to true and `name` to a different value from the one you configured in the provider.
	// It is better to either use `name` or `current`, but not both at the same time.
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetRegionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegionsArgs)(nil)).Elem()
}

// A collection of values returned by getRegions.
type GetRegionsResultOutput struct{ *pulumi.OutputState }

func (GetRegionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegionsResult)(nil)).Elem()
}

func (o GetRegionsResultOutput) ToGetRegionsResultOutput() GetRegionsResultOutput {
	return o
}

func (o GetRegionsResultOutput) ToGetRegionsResultOutputWithContext(ctx context.Context) GetRegionsResultOutput {
	return o
}

func (o GetRegionsResultOutput) Current() pulumi.BoolOutput {
	return o.ApplyT(func(v GetRegionsResult) bool { return v.Current }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRegionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of region IDs.
func (o GetRegionsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRegionsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetRegionsResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionsResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetRegionsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRegionsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of regions. Each element contains the following attributes:
func (o GetRegionsResultOutput) Regions() GetRegionsRegionArrayOutput {
	return o.ApplyT(func(v GetRegionsResult) []GetRegionsRegion { return v.Regions }).(GetRegionsRegionArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRegionsResultOutput{})
}
