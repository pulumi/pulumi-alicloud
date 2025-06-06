// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ga

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Global Accelerator (GA) Ip Sets of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.113.0.
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
//			example, err := ga.GetIpSets(ctx, &ga.GetIpSetsArgs{
//				AcceleratorId: "example_value",
//				Ids: []string{
//					"example_value",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstGaIpSetId", example.Sets[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetIpSets(ctx *pulumi.Context, args *GetIpSetsArgs, opts ...pulumi.InvokeOption) (*GetIpSetsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetIpSetsResult
	err := ctx.Invoke("alicloud:ga/getIpSets:getIpSets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIpSets.
type GetIpSetsArgs struct {
	// The ID of the Global Accelerator (GA) instance.
	AcceleratorId string `pulumi:"acceleratorId"`
	// A list of Ip Set IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the acceleration region. Valid values: `active`, `deleting`, `init`, `updating`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getIpSets.
type GetIpSetsResult struct {
	AcceleratorId string `pulumi:"acceleratorId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of Ga Ip Sets. Each element contains the following attributes:
	Sets []GetIpSetsSet `pulumi:"sets"`
	// The status of the acceleration region.
	Status *string `pulumi:"status"`
}

func GetIpSetsOutput(ctx *pulumi.Context, args GetIpSetsOutputArgs, opts ...pulumi.InvokeOption) GetIpSetsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetIpSetsResultOutput, error) {
			args := v.(GetIpSetsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:ga/getIpSets:getIpSets", args, GetIpSetsResultOutput{}, options).(GetIpSetsResultOutput), nil
		}).(GetIpSetsResultOutput)
}

// A collection of arguments for invoking getIpSets.
type GetIpSetsOutputArgs struct {
	// The ID of the Global Accelerator (GA) instance.
	AcceleratorId pulumi.StringInput `pulumi:"acceleratorId"`
	// A list of Ip Set IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the acceleration region. Valid values: `active`, `deleting`, `init`, `updating`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetIpSetsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIpSetsArgs)(nil)).Elem()
}

// A collection of values returned by getIpSets.
type GetIpSetsResultOutput struct{ *pulumi.OutputState }

func (GetIpSetsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIpSetsResult)(nil)).Elem()
}

func (o GetIpSetsResultOutput) ToGetIpSetsResultOutput() GetIpSetsResultOutput {
	return o
}

func (o GetIpSetsResultOutput) ToGetIpSetsResultOutputWithContext(ctx context.Context) GetIpSetsResultOutput {
	return o
}

func (o GetIpSetsResultOutput) AcceleratorId() pulumi.StringOutput {
	return o.ApplyT(func(v GetIpSetsResult) string { return v.AcceleratorId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetIpSetsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetIpSetsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetIpSetsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetIpSetsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetIpSetsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetIpSetsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of Ga Ip Sets. Each element contains the following attributes:
func (o GetIpSetsResultOutput) Sets() GetIpSetsSetArrayOutput {
	return o.ApplyT(func(v GetIpSetsResult) []GetIpSetsSet { return v.Sets }).(GetIpSetsSetArrayOutput)
}

// The status of the acceleration region.
func (o GetIpSetsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetIpSetsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetIpSetsResultOutput{})
}
