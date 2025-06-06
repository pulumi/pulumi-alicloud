// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package arms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Arms Prometheus Alert Rules of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.136.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/arms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := arms.GetPrometheusAlertRules(ctx, &arms.GetPrometheusAlertRulesArgs{
//				ClusterId: "example_value",
//				Ids: []string{
//					"example_value-1",
//					"example_value-2",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("armsPrometheusAlertRuleId1", ids.Rules[0].Id)
//			nameRegex, err := arms.GetPrometheusAlertRules(ctx, &arms.GetPrometheusAlertRulesArgs{
//				ClusterId: "example_value",
//				NameRegex: pulumi.StringRef("^my-PrometheusAlertRule"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("armsPrometheusAlertRuleId2", nameRegex.Rules[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetPrometheusAlertRules(ctx *pulumi.Context, args *GetPrometheusAlertRulesArgs, opts ...pulumi.InvokeOption) (*GetPrometheusAlertRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPrometheusAlertRulesResult
	err := ctx.Invoke("alicloud:arms/getPrometheusAlertRules:getPrometheusAlertRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrometheusAlertRules.
type GetPrometheusAlertRulesArgs struct {
	// The ID of the cluster.
	ClusterId string `pulumi:"clusterId"`
	// A list of Prometheus Alert Rule IDs.
	Ids              []string `pulumi:"ids"`
	MatchExpressions *string  `pulumi:"matchExpressions"`
	// A regex string to filter results by Prometheus Alert Rule name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the resource. Valid values: `0`, `1`.
	Status *int `pulumi:"status"`
	// The type of the alert rule.
	Type *string `pulumi:"type"`
}

// A collection of values returned by getPrometheusAlertRules.
type GetPrometheusAlertRulesResult struct {
	ClusterId string `pulumi:"clusterId"`
	// The provider-assigned unique ID for this managed resource.
	Id               string                        `pulumi:"id"`
	Ids              []string                      `pulumi:"ids"`
	MatchExpressions *string                       `pulumi:"matchExpressions"`
	NameRegex        *string                       `pulumi:"nameRegex"`
	Names            []string                      `pulumi:"names"`
	OutputFile       *string                       `pulumi:"outputFile"`
	Rules            []GetPrometheusAlertRulesRule `pulumi:"rules"`
	Status           *int                          `pulumi:"status"`
	Type             *string                       `pulumi:"type"`
}

func GetPrometheusAlertRulesOutput(ctx *pulumi.Context, args GetPrometheusAlertRulesOutputArgs, opts ...pulumi.InvokeOption) GetPrometheusAlertRulesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetPrometheusAlertRulesResultOutput, error) {
			args := v.(GetPrometheusAlertRulesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:arms/getPrometheusAlertRules:getPrometheusAlertRules", args, GetPrometheusAlertRulesResultOutput{}, options).(GetPrometheusAlertRulesResultOutput), nil
		}).(GetPrometheusAlertRulesResultOutput)
}

// A collection of arguments for invoking getPrometheusAlertRules.
type GetPrometheusAlertRulesOutputArgs struct {
	// The ID of the cluster.
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// A list of Prometheus Alert Rule IDs.
	Ids              pulumi.StringArrayInput `pulumi:"ids"`
	MatchExpressions pulumi.StringPtrInput   `pulumi:"matchExpressions"`
	// A regex string to filter results by Prometheus Alert Rule name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the resource. Valid values: `0`, `1`.
	Status pulumi.IntPtrInput `pulumi:"status"`
	// The type of the alert rule.
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (GetPrometheusAlertRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPrometheusAlertRulesArgs)(nil)).Elem()
}

// A collection of values returned by getPrometheusAlertRules.
type GetPrometheusAlertRulesResultOutput struct{ *pulumi.OutputState }

func (GetPrometheusAlertRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPrometheusAlertRulesResult)(nil)).Elem()
}

func (o GetPrometheusAlertRulesResultOutput) ToGetPrometheusAlertRulesResultOutput() GetPrometheusAlertRulesResultOutput {
	return o
}

func (o GetPrometheusAlertRulesResultOutput) ToGetPrometheusAlertRulesResultOutputWithContext(ctx context.Context) GetPrometheusAlertRulesResultOutput {
	return o
}

func (o GetPrometheusAlertRulesResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPrometheusAlertRulesResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPrometheusAlertRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPrometheusAlertRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetPrometheusAlertRulesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPrometheusAlertRulesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetPrometheusAlertRulesResultOutput) MatchExpressions() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPrometheusAlertRulesResult) *string { return v.MatchExpressions }).(pulumi.StringPtrOutput)
}

func (o GetPrometheusAlertRulesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPrometheusAlertRulesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetPrometheusAlertRulesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPrometheusAlertRulesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetPrometheusAlertRulesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPrometheusAlertRulesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetPrometheusAlertRulesResultOutput) Rules() GetPrometheusAlertRulesRuleArrayOutput {
	return o.ApplyT(func(v GetPrometheusAlertRulesResult) []GetPrometheusAlertRulesRule { return v.Rules }).(GetPrometheusAlertRulesRuleArrayOutput)
}

func (o GetPrometheusAlertRulesResultOutput) Status() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetPrometheusAlertRulesResult) *int { return v.Status }).(pulumi.IntPtrOutput)
}

func (o GetPrometheusAlertRulesResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPrometheusAlertRulesResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPrometheusAlertRulesResultOutput{})
}
