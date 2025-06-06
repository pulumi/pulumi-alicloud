// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fnf

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Fnf Schedules of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.105.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/fnf"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := fnf.GetSchedules(ctx, &fnf.GetSchedulesArgs{
//				FlowName: "example_value",
//				Ids: []string{
//					"example_value",
//				},
//				NameRegex: pulumi.StringRef("the_resource_name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstFnfScheduleId", example.Schedules[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetSchedules(ctx *pulumi.Context, args *GetSchedulesArgs, opts ...pulumi.InvokeOption) (*GetSchedulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSchedulesResult
	err := ctx.Invoke("alicloud:fnf/getSchedules:getSchedules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchedules.
type GetSchedulesArgs struct {
	// The name of the flow bound to the time-based schedule you want to create.
	FlowName string `pulumi:"flowName"`
	// A list of Schedule IDs.
	Ids []string `pulumi:"ids"`
	// The number of resource queries.
	Limit *int `pulumi:"limit"`
	// A regex string to filter results by Schedule name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getSchedules.
type GetSchedulesResult struct {
	FlowName string `pulumi:"flowName"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                 `pulumi:"id"`
	Ids        []string               `pulumi:"ids"`
	Limit      *int                   `pulumi:"limit"`
	NameRegex  *string                `pulumi:"nameRegex"`
	Names      []string               `pulumi:"names"`
	OutputFile *string                `pulumi:"outputFile"`
	Schedules  []GetSchedulesSchedule `pulumi:"schedules"`
}

func GetSchedulesOutput(ctx *pulumi.Context, args GetSchedulesOutputArgs, opts ...pulumi.InvokeOption) GetSchedulesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSchedulesResultOutput, error) {
			args := v.(GetSchedulesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:fnf/getSchedules:getSchedules", args, GetSchedulesResultOutput{}, options).(GetSchedulesResultOutput), nil
		}).(GetSchedulesResultOutput)
}

// A collection of arguments for invoking getSchedules.
type GetSchedulesOutputArgs struct {
	// The name of the flow bound to the time-based schedule you want to create.
	FlowName pulumi.StringInput `pulumi:"flowName"`
	// A list of Schedule IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The number of resource queries.
	Limit pulumi.IntPtrInput `pulumi:"limit"`
	// A regex string to filter results by Schedule name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetSchedulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSchedulesArgs)(nil)).Elem()
}

// A collection of values returned by getSchedules.
type GetSchedulesResultOutput struct{ *pulumi.OutputState }

func (GetSchedulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSchedulesResult)(nil)).Elem()
}

func (o GetSchedulesResultOutput) ToGetSchedulesResultOutput() GetSchedulesResultOutput {
	return o
}

func (o GetSchedulesResultOutput) ToGetSchedulesResultOutputWithContext(ctx context.Context) GetSchedulesResultOutput {
	return o
}

func (o GetSchedulesResultOutput) FlowName() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchedulesResult) string { return v.FlowName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSchedulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchedulesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSchedulesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSchedulesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSchedulesResultOutput) Limit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetSchedulesResult) *int { return v.Limit }).(pulumi.IntPtrOutput)
}

func (o GetSchedulesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSchedulesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetSchedulesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSchedulesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetSchedulesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSchedulesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetSchedulesResultOutput) Schedules() GetSchedulesScheduleArrayOutput {
	return o.ApplyT(func(v GetSchedulesResult) []GetSchedulesSchedule { return v.Schedules }).(GetSchedulesScheduleArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSchedulesResultOutput{})
}
