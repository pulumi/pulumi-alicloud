// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Alidns Access Strategies of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.152.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := dns.GetAccessStrategies(ctx, &dns.GetAccessStrategiesArgs{
//				InstanceId:   "example_value",
//				StrategyMode: "example_value",
//				Ids: []string{
//					"example_value-1",
//					"example_value-2",
//				},
//				NameRegex: pulumi.StringRef("the_resource_name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("alidnsAccessStrategyId1", ids.Strategies[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetAccessStrategies(ctx *pulumi.Context, args *GetAccessStrategiesArgs, opts ...pulumi.InvokeOption) (*GetAccessStrategiesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAccessStrategiesResult
	err := ctx.Invoke("alicloud:dns/getAccessStrategies:getAccessStrategies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccessStrategies.
type GetAccessStrategiesArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Access Strategy IDs.
	Ids []string `pulumi:"ids"`
	// The Id of the associated instance.
	InstanceId string `pulumi:"instanceId"`
	// The lang.
	Lang *string `pulumi:"lang"`
	// A regex string to filter results by Access Strategy name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The type of the access policy. Valid values:
	// - `GEO`: based on geographic location.
	// - `LATENCY`: Based on delay.
	StrategyMode string `pulumi:"strategyMode"`
}

// A collection of values returned by getAccessStrategies.
type GetAccessStrategiesResult struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id           string                        `pulumi:"id"`
	Ids          []string                      `pulumi:"ids"`
	InstanceId   string                        `pulumi:"instanceId"`
	Lang         *string                       `pulumi:"lang"`
	NameRegex    *string                       `pulumi:"nameRegex"`
	Names        []string                      `pulumi:"names"`
	OutputFile   *string                       `pulumi:"outputFile"`
	Strategies   []GetAccessStrategiesStrategy `pulumi:"strategies"`
	StrategyMode string                        `pulumi:"strategyMode"`
}

func GetAccessStrategiesOutput(ctx *pulumi.Context, args GetAccessStrategiesOutputArgs, opts ...pulumi.InvokeOption) GetAccessStrategiesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetAccessStrategiesResultOutput, error) {
			args := v.(GetAccessStrategiesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:dns/getAccessStrategies:getAccessStrategies", args, GetAccessStrategiesResultOutput{}, options).(GetAccessStrategiesResultOutput), nil
		}).(GetAccessStrategiesResultOutput)
}

// A collection of arguments for invoking getAccessStrategies.
type GetAccessStrategiesOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Access Strategy IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The Id of the associated instance.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// The lang.
	Lang pulumi.StringPtrInput `pulumi:"lang"`
	// A regex string to filter results by Access Strategy name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The type of the access policy. Valid values:
	// - `GEO`: based on geographic location.
	// - `LATENCY`: Based on delay.
	StrategyMode pulumi.StringInput `pulumi:"strategyMode"`
}

func (GetAccessStrategiesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccessStrategiesArgs)(nil)).Elem()
}

// A collection of values returned by getAccessStrategies.
type GetAccessStrategiesResultOutput struct{ *pulumi.OutputState }

func (GetAccessStrategiesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccessStrategiesResult)(nil)).Elem()
}

func (o GetAccessStrategiesResultOutput) ToGetAccessStrategiesResultOutput() GetAccessStrategiesResultOutput {
	return o
}

func (o GetAccessStrategiesResultOutput) ToGetAccessStrategiesResultOutputWithContext(ctx context.Context) GetAccessStrategiesResultOutput {
	return o
}

func (o GetAccessStrategiesResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetAccessStrategiesResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAccessStrategiesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessStrategiesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAccessStrategiesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAccessStrategiesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetAccessStrategiesResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessStrategiesResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

func (o GetAccessStrategiesResultOutput) Lang() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccessStrategiesResult) *string { return v.Lang }).(pulumi.StringPtrOutput)
}

func (o GetAccessStrategiesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccessStrategiesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetAccessStrategiesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAccessStrategiesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetAccessStrategiesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccessStrategiesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetAccessStrategiesResultOutput) Strategies() GetAccessStrategiesStrategyArrayOutput {
	return o.ApplyT(func(v GetAccessStrategiesResult) []GetAccessStrategiesStrategy { return v.Strategies }).(GetAccessStrategiesStrategyArrayOutput)
}

func (o GetAccessStrategiesResultOutput) StrategyMode() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessStrategiesResult) string { return v.StrategyMode }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccessStrategiesResultOutput{})
}
