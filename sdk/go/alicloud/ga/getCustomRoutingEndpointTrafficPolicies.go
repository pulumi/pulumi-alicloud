// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ga

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Global Accelerator (GA) Custom Routing Endpoint Traffic Policies of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.197.0.
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
//			ids, err := ga.GetCustomRoutingEndpointTrafficPolicies(ctx, &ga.GetCustomRoutingEndpointTrafficPoliciesArgs{
//				Ids: []string{
//					"example_id",
//				},
//				AcceleratorId: "your_accelerator_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("gaCustomRoutingEndpointTrafficPoliciesId1", ids.CustomRoutingEndpointTrafficPolicies[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetCustomRoutingEndpointTrafficPolicies(ctx *pulumi.Context, args *GetCustomRoutingEndpointTrafficPoliciesArgs, opts ...pulumi.InvokeOption) (*GetCustomRoutingEndpointTrafficPoliciesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCustomRoutingEndpointTrafficPoliciesResult
	err := ctx.Invoke("alicloud:ga/getCustomRoutingEndpointTrafficPolicies:getCustomRoutingEndpointTrafficPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCustomRoutingEndpointTrafficPolicies.
type GetCustomRoutingEndpointTrafficPoliciesArgs struct {
	// The ID of the GA instance to which the traffic policies belong.
	AcceleratorId string `pulumi:"acceleratorId"`
	// The IP addresses of the traffic policies.
	Address *string `pulumi:"address"`
	// The ID of the endpoint group to which the traffic policies belong.
	EndpointGroupId *string `pulumi:"endpointGroupId"`
	// The ID of the endpoint to which the traffic policies belong.
	EndpointId *string `pulumi:"endpointId"`
	// A list of Custom Routing Endpoint Traffic Policy IDs.
	Ids []string `pulumi:"ids"`
	// The ID of the listener to which the traffic policies belong.
	ListenerId *string `pulumi:"listenerId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
}

// A collection of values returned by getCustomRoutingEndpointTrafficPolicies.
type GetCustomRoutingEndpointTrafficPoliciesResult struct {
	// The ID of the GA instance to which the endpoint belongs.
	AcceleratorId string `pulumi:"acceleratorId"`
	// The IP address of the traffic policy.
	Address *string `pulumi:"address"`
	// A list of Custom Routing Endpoint Traffic Policies. Each element contains the following attributes:
	CustomRoutingEndpointTrafficPolicies []GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicy `pulumi:"customRoutingEndpointTrafficPolicies"`
	// The ID of the Custom Routing Endpoint Group.
	EndpointGroupId *string `pulumi:"endpointGroupId"`
	// The ID of the Custom Routing Endpoint.
	EndpointId *string `pulumi:"endpointId"`
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
	// The ID of the custom routing listener to which the endpoint belongs.
	ListenerId *string `pulumi:"listenerId"`
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
}

func GetCustomRoutingEndpointTrafficPoliciesOutput(ctx *pulumi.Context, args GetCustomRoutingEndpointTrafficPoliciesOutputArgs, opts ...pulumi.InvokeOption) GetCustomRoutingEndpointTrafficPoliciesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetCustomRoutingEndpointTrafficPoliciesResultOutput, error) {
			args := v.(GetCustomRoutingEndpointTrafficPoliciesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:ga/getCustomRoutingEndpointTrafficPolicies:getCustomRoutingEndpointTrafficPolicies", args, GetCustomRoutingEndpointTrafficPoliciesResultOutput{}, options).(GetCustomRoutingEndpointTrafficPoliciesResultOutput), nil
		}).(GetCustomRoutingEndpointTrafficPoliciesResultOutput)
}

// A collection of arguments for invoking getCustomRoutingEndpointTrafficPolicies.
type GetCustomRoutingEndpointTrafficPoliciesOutputArgs struct {
	// The ID of the GA instance to which the traffic policies belong.
	AcceleratorId pulumi.StringInput `pulumi:"acceleratorId"`
	// The IP addresses of the traffic policies.
	Address pulumi.StringPtrInput `pulumi:"address"`
	// The ID of the endpoint group to which the traffic policies belong.
	EndpointGroupId pulumi.StringPtrInput `pulumi:"endpointGroupId"`
	// The ID of the endpoint to which the traffic policies belong.
	EndpointId pulumi.StringPtrInput `pulumi:"endpointId"`
	// A list of Custom Routing Endpoint Traffic Policy IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The ID of the listener to which the traffic policies belong.
	ListenerId pulumi.StringPtrInput `pulumi:"listenerId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
}

func (GetCustomRoutingEndpointTrafficPoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCustomRoutingEndpointTrafficPoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getCustomRoutingEndpointTrafficPolicies.
type GetCustomRoutingEndpointTrafficPoliciesResultOutput struct{ *pulumi.OutputState }

func (GetCustomRoutingEndpointTrafficPoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCustomRoutingEndpointTrafficPoliciesResult)(nil)).Elem()
}

func (o GetCustomRoutingEndpointTrafficPoliciesResultOutput) ToGetCustomRoutingEndpointTrafficPoliciesResultOutput() GetCustomRoutingEndpointTrafficPoliciesResultOutput {
	return o
}

func (o GetCustomRoutingEndpointTrafficPoliciesResultOutput) ToGetCustomRoutingEndpointTrafficPoliciesResultOutputWithContext(ctx context.Context) GetCustomRoutingEndpointTrafficPoliciesResultOutput {
	return o
}

// The ID of the GA instance to which the endpoint belongs.
func (o GetCustomRoutingEndpointTrafficPoliciesResultOutput) AcceleratorId() pulumi.StringOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointTrafficPoliciesResult) string { return v.AcceleratorId }).(pulumi.StringOutput)
}

// The IP address of the traffic policy.
func (o GetCustomRoutingEndpointTrafficPoliciesResultOutput) Address() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointTrafficPoliciesResult) *string { return v.Address }).(pulumi.StringPtrOutput)
}

// A list of Custom Routing Endpoint Traffic Policies. Each element contains the following attributes:
func (o GetCustomRoutingEndpointTrafficPoliciesResultOutput) CustomRoutingEndpointTrafficPolicies() GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicyArrayOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointTrafficPoliciesResult) []GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicy {
		return v.CustomRoutingEndpointTrafficPolicies
	}).(GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicyArrayOutput)
}

// The ID of the Custom Routing Endpoint Group.
func (o GetCustomRoutingEndpointTrafficPoliciesResultOutput) EndpointGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointTrafficPoliciesResult) *string { return v.EndpointGroupId }).(pulumi.StringPtrOutput)
}

// The ID of the Custom Routing Endpoint.
func (o GetCustomRoutingEndpointTrafficPoliciesResultOutput) EndpointId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointTrafficPoliciesResult) *string { return v.EndpointId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetCustomRoutingEndpointTrafficPoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointTrafficPoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetCustomRoutingEndpointTrafficPoliciesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointTrafficPoliciesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// The ID of the custom routing listener to which the endpoint belongs.
func (o GetCustomRoutingEndpointTrafficPoliciesResultOutput) ListenerId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointTrafficPoliciesResult) *string { return v.ListenerId }).(pulumi.StringPtrOutput)
}

func (o GetCustomRoutingEndpointTrafficPoliciesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointTrafficPoliciesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetCustomRoutingEndpointTrafficPoliciesResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointTrafficPoliciesResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetCustomRoutingEndpointTrafficPoliciesResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointTrafficPoliciesResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCustomRoutingEndpointTrafficPoliciesResultOutput{})
}
