// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Cen Inter Region Traffic Qos Policies of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.195.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := cen.GetInterRegionTrafficQosPolicies(ctx, &cen.GetInterRegionTrafficQosPoliciesArgs{
//				Ids: []string{
//					"example_id",
//				},
//				TransitRouterId:           "your_transit_router_id",
//				TransitRouterAttachmentId: "your_transit_router_attachment_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("cenInterRegionTrafficQosPolicyId0", ids.Policies[0].Id)
//			nameRegex, err := cen.GetInterRegionTrafficQosPolicies(ctx, &cen.GetInterRegionTrafficQosPoliciesArgs{
//				NameRegex:                 pulumi.StringRef("^my-name"),
//				TransitRouterId:           "your_transit_router_id",
//				TransitRouterAttachmentId: "your_transit_router_attachment_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("cenInterRegionTrafficQosPolicyId1", nameRegex.Policies[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetInterRegionTrafficQosPolicies(ctx *pulumi.Context, args *GetInterRegionTrafficQosPoliciesArgs, opts ...pulumi.InvokeOption) (*GetInterRegionTrafficQosPoliciesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInterRegionTrafficQosPoliciesResult
	err := ctx.Invoke("alicloud:cen/getInterRegionTrafficQosPolicies:getInterRegionTrafficQosPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInterRegionTrafficQosPolicies.
type GetInterRegionTrafficQosPoliciesArgs struct {
	// A list of Inter Region Traffic Qos Policy IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Inter Region Traffic Qos Policy name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the traffic scheduling policy. Valid Value: `Creating`, `Active`, `Modifying`, `Deleting`, `Deleted`.
	Status *string `pulumi:"status"`
	// The description of the QoS policy.
	TrafficQosPolicyDescription *string `pulumi:"trafficQosPolicyDescription"`
	// The ID of the QoS policy.
	TrafficQosPolicyId *string `pulumi:"trafficQosPolicyId"`
	// The name of the QoS policy.
	TrafficQosPolicyName *string `pulumi:"trafficQosPolicyName"`
	// The ID of the inter-region connection.
	TransitRouterAttachmentId string `pulumi:"transitRouterAttachmentId"`
	// The ID of the transit router.
	TransitRouterId string `pulumi:"transitRouterId"`
}

// A collection of values returned by getInterRegionTrafficQosPolicies.
type GetInterRegionTrafficQosPoliciesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string   `pulumi:"id"`
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of Inter Region Traffic Qos Policy names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of Cen Inter Region Traffic Qos Policies. Each element contains the following attributes:
	Policies []GetInterRegionTrafficQosPoliciesPolicy `pulumi:"policies"`
	// The status of the Inter Region Traffic Qos Policy.
	Status                      *string `pulumi:"status"`
	TrafficQosPolicyDescription *string `pulumi:"trafficQosPolicyDescription"`
	TrafficQosPolicyId          *string `pulumi:"trafficQosPolicyId"`
	TrafficQosPolicyName        *string `pulumi:"trafficQosPolicyName"`
	// The ID of the inter-region connection.
	TransitRouterAttachmentId string `pulumi:"transitRouterAttachmentId"`
	// The ID of the transit router.
	TransitRouterId string `pulumi:"transitRouterId"`
}

func GetInterRegionTrafficQosPoliciesOutput(ctx *pulumi.Context, args GetInterRegionTrafficQosPoliciesOutputArgs, opts ...pulumi.InvokeOption) GetInterRegionTrafficQosPoliciesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetInterRegionTrafficQosPoliciesResultOutput, error) {
			args := v.(GetInterRegionTrafficQosPoliciesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:cen/getInterRegionTrafficQosPolicies:getInterRegionTrafficQosPolicies", args, GetInterRegionTrafficQosPoliciesResultOutput{}, options).(GetInterRegionTrafficQosPoliciesResultOutput), nil
		}).(GetInterRegionTrafficQosPoliciesResultOutput)
}

// A collection of arguments for invoking getInterRegionTrafficQosPolicies.
type GetInterRegionTrafficQosPoliciesOutputArgs struct {
	// A list of Inter Region Traffic Qos Policy IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Inter Region Traffic Qos Policy name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the traffic scheduling policy. Valid Value: `Creating`, `Active`, `Modifying`, `Deleting`, `Deleted`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The description of the QoS policy.
	TrafficQosPolicyDescription pulumi.StringPtrInput `pulumi:"trafficQosPolicyDescription"`
	// The ID of the QoS policy.
	TrafficQosPolicyId pulumi.StringPtrInput `pulumi:"trafficQosPolicyId"`
	// The name of the QoS policy.
	TrafficQosPolicyName pulumi.StringPtrInput `pulumi:"trafficQosPolicyName"`
	// The ID of the inter-region connection.
	TransitRouterAttachmentId pulumi.StringInput `pulumi:"transitRouterAttachmentId"`
	// The ID of the transit router.
	TransitRouterId pulumi.StringInput `pulumi:"transitRouterId"`
}

func (GetInterRegionTrafficQosPoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInterRegionTrafficQosPoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getInterRegionTrafficQosPolicies.
type GetInterRegionTrafficQosPoliciesResultOutput struct{ *pulumi.OutputState }

func (GetInterRegionTrafficQosPoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInterRegionTrafficQosPoliciesResult)(nil)).Elem()
}

func (o GetInterRegionTrafficQosPoliciesResultOutput) ToGetInterRegionTrafficQosPoliciesResultOutput() GetInterRegionTrafficQosPoliciesResultOutput {
	return o
}

func (o GetInterRegionTrafficQosPoliciesResultOutput) ToGetInterRegionTrafficQosPoliciesResultOutputWithContext(ctx context.Context) GetInterRegionTrafficQosPoliciesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetInterRegionTrafficQosPoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInterRegionTrafficQosPoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetInterRegionTrafficQosPoliciesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetInterRegionTrafficQosPoliciesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetInterRegionTrafficQosPoliciesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInterRegionTrafficQosPoliciesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of Inter Region Traffic Qos Policy names.
func (o GetInterRegionTrafficQosPoliciesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetInterRegionTrafficQosPoliciesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetInterRegionTrafficQosPoliciesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInterRegionTrafficQosPoliciesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of Cen Inter Region Traffic Qos Policies. Each element contains the following attributes:
func (o GetInterRegionTrafficQosPoliciesResultOutput) Policies() GetInterRegionTrafficQosPoliciesPolicyArrayOutput {
	return o.ApplyT(func(v GetInterRegionTrafficQosPoliciesResult) []GetInterRegionTrafficQosPoliciesPolicy {
		return v.Policies
	}).(GetInterRegionTrafficQosPoliciesPolicyArrayOutput)
}

// The status of the Inter Region Traffic Qos Policy.
func (o GetInterRegionTrafficQosPoliciesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInterRegionTrafficQosPoliciesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetInterRegionTrafficQosPoliciesResultOutput) TrafficQosPolicyDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInterRegionTrafficQosPoliciesResult) *string { return v.TrafficQosPolicyDescription }).(pulumi.StringPtrOutput)
}

func (o GetInterRegionTrafficQosPoliciesResultOutput) TrafficQosPolicyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInterRegionTrafficQosPoliciesResult) *string { return v.TrafficQosPolicyId }).(pulumi.StringPtrOutput)
}

func (o GetInterRegionTrafficQosPoliciesResultOutput) TrafficQosPolicyName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInterRegionTrafficQosPoliciesResult) *string { return v.TrafficQosPolicyName }).(pulumi.StringPtrOutput)
}

// The ID of the inter-region connection.
func (o GetInterRegionTrafficQosPoliciesResultOutput) TransitRouterAttachmentId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInterRegionTrafficQosPoliciesResult) string { return v.TransitRouterAttachmentId }).(pulumi.StringOutput)
}

// The ID of the transit router.
func (o GetInterRegionTrafficQosPoliciesResultOutput) TransitRouterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInterRegionTrafficQosPoliciesResult) string { return v.TransitRouterId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInterRegionTrafficQosPoliciesResultOutput{})
}
