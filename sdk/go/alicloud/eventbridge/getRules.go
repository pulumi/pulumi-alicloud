// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eventbridge

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Event Bridge Rules of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.129.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eventbridge"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := eventbridge.GetRules(ctx, &eventbridge.GetRulesArgs{
//				EventBusName: "example_value",
//				Ids: []string{
//					"example_value",
//				},
//				NameRegex: pulumi.StringRef("the_resource_name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstEventBridgeRuleId", example.Rules[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetRules(ctx *pulumi.Context, args *GetRulesArgs, opts ...pulumi.InvokeOption) (*GetRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRulesResult
	err := ctx.Invoke("alicloud:eventbridge/getRules:getRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRules.
type GetRulesArgs struct {
	// The name of event bus.
	EventBusName string `pulumi:"eventBusName"`
	// A list of Rule IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Rule name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The rule name prefix.
	RuleNamePrefix *string `pulumi:"ruleNamePrefix"`
	// Rule status, either Enable or Disable. Valid values: `DISABLE`, `ENABLE`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getRules.
type GetRulesResult struct {
	EventBusName string `pulumi:"eventBusName"`
	// The provider-assigned unique ID for this managed resource.
	Id             string         `pulumi:"id"`
	Ids            []string       `pulumi:"ids"`
	NameRegex      *string        `pulumi:"nameRegex"`
	Names          []string       `pulumi:"names"`
	OutputFile     *string        `pulumi:"outputFile"`
	RuleNamePrefix *string        `pulumi:"ruleNamePrefix"`
	Rules          []GetRulesRule `pulumi:"rules"`
	Status         *string        `pulumi:"status"`
}

func GetRulesOutput(ctx *pulumi.Context, args GetRulesOutputArgs, opts ...pulumi.InvokeOption) GetRulesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetRulesResultOutput, error) {
			args := v.(GetRulesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:eventbridge/getRules:getRules", args, GetRulesResultOutput{}, options).(GetRulesResultOutput), nil
		}).(GetRulesResultOutput)
}

// A collection of arguments for invoking getRules.
type GetRulesOutputArgs struct {
	// The name of event bus.
	EventBusName pulumi.StringInput `pulumi:"eventBusName"`
	// A list of Rule IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Rule name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The rule name prefix.
	RuleNamePrefix pulumi.StringPtrInput `pulumi:"ruleNamePrefix"`
	// Rule status, either Enable or Disable. Valid values: `DISABLE`, `ENABLE`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRulesArgs)(nil)).Elem()
}

// A collection of values returned by getRules.
type GetRulesResultOutput struct{ *pulumi.OutputState }

func (GetRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRulesResult)(nil)).Elem()
}

func (o GetRulesResultOutput) ToGetRulesResultOutput() GetRulesResultOutput {
	return o
}

func (o GetRulesResultOutput) ToGetRulesResultOutputWithContext(ctx context.Context) GetRulesResultOutput {
	return o
}

func (o GetRulesResultOutput) EventBusName() pulumi.StringOutput {
	return o.ApplyT(func(v GetRulesResult) string { return v.EventBusName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetRulesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRulesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetRulesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetRulesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRulesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetRulesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetRulesResultOutput) RuleNamePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *string { return v.RuleNamePrefix }).(pulumi.StringPtrOutput)
}

func (o GetRulesResultOutput) Rules() GetRulesRuleArrayOutput {
	return o.ApplyT(func(v GetRulesResult) []GetRulesRule { return v.Rules }).(GetRulesRuleArrayOutput)
}

func (o GetRulesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRulesResultOutput{})
}
