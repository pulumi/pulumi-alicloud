// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Vpc Traffic Mirror Filter Ingress Rules of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.141.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := vpc.GetTrafficMirrorFilterIngressRules(ctx, &vpc.GetTrafficMirrorFilterIngressRulesArgs{
//				TrafficMirrorFilterId: "example_traffic_mirror_filter_id",
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcTrafficMirrorFilterIngressRuleId1", ids.Rules[0].Id)
//			status, err := vpc.GetTrafficMirrorFilterIngressRules(ctx, &vpc.GetTrafficMirrorFilterIngressRulesArgs{
//				TrafficMirrorFilterId: "example_traffic_mirror_filter_id",
//				Ids: []string{
//					"example_id",
//				},
//				Status: pulumi.StringRef("Created"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcTrafficMirrorFilterIngressRuleId2", status.Rules[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetTrafficMirrorFilterIngressRules(ctx *pulumi.Context, args *GetTrafficMirrorFilterIngressRulesArgs, opts ...pulumi.InvokeOption) (*GetTrafficMirrorFilterIngressRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTrafficMirrorFilterIngressRulesResult
	err := ctx.Invoke("alicloud:vpc/getTrafficMirrorFilterIngressRules:getTrafficMirrorFilterIngressRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTrafficMirrorFilterIngressRules.
type GetTrafficMirrorFilterIngressRulesArgs struct {
	// A list of Traffic Mirror Filter Ingress Rule IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the resource. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`.
	Status *string `pulumi:"status"`
	// The ID of the Traffic Mirror Filter.
	TrafficMirrorFilterId string `pulumi:"trafficMirrorFilterId"`
}

// A collection of values returned by getTrafficMirrorFilterIngressRules.
type GetTrafficMirrorFilterIngressRulesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id                    string                                   `pulumi:"id"`
	Ids                   []string                                 `pulumi:"ids"`
	OutputFile            *string                                  `pulumi:"outputFile"`
	Rules                 []GetTrafficMirrorFilterIngressRulesRule `pulumi:"rules"`
	Status                *string                                  `pulumi:"status"`
	TrafficMirrorFilterId string                                   `pulumi:"trafficMirrorFilterId"`
}

func GetTrafficMirrorFilterIngressRulesOutput(ctx *pulumi.Context, args GetTrafficMirrorFilterIngressRulesOutputArgs, opts ...pulumi.InvokeOption) GetTrafficMirrorFilterIngressRulesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetTrafficMirrorFilterIngressRulesResultOutput, error) {
			args := v.(GetTrafficMirrorFilterIngressRulesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:vpc/getTrafficMirrorFilterIngressRules:getTrafficMirrorFilterIngressRules", args, GetTrafficMirrorFilterIngressRulesResultOutput{}, options).(GetTrafficMirrorFilterIngressRulesResultOutput), nil
		}).(GetTrafficMirrorFilterIngressRulesResultOutput)
}

// A collection of arguments for invoking getTrafficMirrorFilterIngressRules.
type GetTrafficMirrorFilterIngressRulesOutputArgs struct {
	// A list of Traffic Mirror Filter Ingress Rule IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the resource. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The ID of the Traffic Mirror Filter.
	TrafficMirrorFilterId pulumi.StringInput `pulumi:"trafficMirrorFilterId"`
}

func (GetTrafficMirrorFilterIngressRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTrafficMirrorFilterIngressRulesArgs)(nil)).Elem()
}

// A collection of values returned by getTrafficMirrorFilterIngressRules.
type GetTrafficMirrorFilterIngressRulesResultOutput struct{ *pulumi.OutputState }

func (GetTrafficMirrorFilterIngressRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTrafficMirrorFilterIngressRulesResult)(nil)).Elem()
}

func (o GetTrafficMirrorFilterIngressRulesResultOutput) ToGetTrafficMirrorFilterIngressRulesResultOutput() GetTrafficMirrorFilterIngressRulesResultOutput {
	return o
}

func (o GetTrafficMirrorFilterIngressRulesResultOutput) ToGetTrafficMirrorFilterIngressRulesResultOutputWithContext(ctx context.Context) GetTrafficMirrorFilterIngressRulesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetTrafficMirrorFilterIngressRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTrafficMirrorFilterIngressRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTrafficMirrorFilterIngressRulesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTrafficMirrorFilterIngressRulesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetTrafficMirrorFilterIngressRulesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorFilterIngressRulesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetTrafficMirrorFilterIngressRulesResultOutput) Rules() GetTrafficMirrorFilterIngressRulesRuleArrayOutput {
	return o.ApplyT(func(v GetTrafficMirrorFilterIngressRulesResult) []GetTrafficMirrorFilterIngressRulesRule {
		return v.Rules
	}).(GetTrafficMirrorFilterIngressRulesRuleArrayOutput)
}

func (o GetTrafficMirrorFilterIngressRulesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorFilterIngressRulesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetTrafficMirrorFilterIngressRulesResultOutput) TrafficMirrorFilterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetTrafficMirrorFilterIngressRulesResult) string { return v.TrafficMirrorFilterId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTrafficMirrorFilterIngressRulesResultOutput{})
}
