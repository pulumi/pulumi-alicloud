// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package privatelink

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Privatelink Vpc Endpoint Connections of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.110.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/privatelink"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := privatelink.GetVpcEndpointConnections(ctx, &privatelink.GetVpcEndpointConnectionsArgs{
//				ServiceId: "example_value",
//				Status:    pulumi.StringRef("Connected"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstPrivatelinkVpcEndpointConnectionId", example.Connections[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetVpcEndpointConnections(ctx *pulumi.Context, args *GetVpcEndpointConnectionsArgs, opts ...pulumi.InvokeOption) (*GetVpcEndpointConnectionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVpcEndpointConnectionsResult
	err := ctx.Invoke("alicloud:privatelink/getVpcEndpointConnections:getVpcEndpointConnections", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpcEndpointConnections.
type GetVpcEndpointConnectionsArgs struct {
	// The ID of the Vpc Endpoint.
	EndpointId *string `pulumi:"endpointId"`
	// The endpoint owner id.
	EndpointOwnerId *int `pulumi:"endpointOwnerId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the Vpc Endpoint Service.
	ServiceId string `pulumi:"serviceId"`
	// The status of Vpc Endpoint Connection. Valid Values: `Connected`, `Connecting`, `Deleted`, `Deleting`, `Disconnected`, `Disconnecting`, `Pending` and `ServiceDeleted`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getVpcEndpointConnections.
type GetVpcEndpointConnectionsResult struct {
	// A list of Privatelink Vpc Endpoint Connections. Each element contains the following attributes:
	Connections []GetVpcEndpointConnectionsConnection `pulumi:"connections"`
	// The ID of the Vpc Endpoint.
	EndpointId      *string `pulumi:"endpointId"`
	EndpointOwnerId *int    `pulumi:"endpointOwnerId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Vpc Endpoint Connection IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	ServiceId  string   `pulumi:"serviceId"`
	// The status of Vpc Endpoint Connection.
	Status *string `pulumi:"status"`
}

func GetVpcEndpointConnectionsOutput(ctx *pulumi.Context, args GetVpcEndpointConnectionsOutputArgs, opts ...pulumi.InvokeOption) GetVpcEndpointConnectionsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetVpcEndpointConnectionsResultOutput, error) {
			args := v.(GetVpcEndpointConnectionsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:privatelink/getVpcEndpointConnections:getVpcEndpointConnections", args, GetVpcEndpointConnectionsResultOutput{}, options).(GetVpcEndpointConnectionsResultOutput), nil
		}).(GetVpcEndpointConnectionsResultOutput)
}

// A collection of arguments for invoking getVpcEndpointConnections.
type GetVpcEndpointConnectionsOutputArgs struct {
	// The ID of the Vpc Endpoint.
	EndpointId pulumi.StringPtrInput `pulumi:"endpointId"`
	// The endpoint owner id.
	EndpointOwnerId pulumi.IntPtrInput `pulumi:"endpointOwnerId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the Vpc Endpoint Service.
	ServiceId pulumi.StringInput `pulumi:"serviceId"`
	// The status of Vpc Endpoint Connection. Valid Values: `Connected`, `Connecting`, `Deleted`, `Deleting`, `Disconnected`, `Disconnecting`, `Pending` and `ServiceDeleted`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetVpcEndpointConnectionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcEndpointConnectionsArgs)(nil)).Elem()
}

// A collection of values returned by getVpcEndpointConnections.
type GetVpcEndpointConnectionsResultOutput struct{ *pulumi.OutputState }

func (GetVpcEndpointConnectionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcEndpointConnectionsResult)(nil)).Elem()
}

func (o GetVpcEndpointConnectionsResultOutput) ToGetVpcEndpointConnectionsResultOutput() GetVpcEndpointConnectionsResultOutput {
	return o
}

func (o GetVpcEndpointConnectionsResultOutput) ToGetVpcEndpointConnectionsResultOutputWithContext(ctx context.Context) GetVpcEndpointConnectionsResultOutput {
	return o
}

// A list of Privatelink Vpc Endpoint Connections. Each element contains the following attributes:
func (o GetVpcEndpointConnectionsResultOutput) Connections() GetVpcEndpointConnectionsConnectionArrayOutput {
	return o.ApplyT(func(v GetVpcEndpointConnectionsResult) []GetVpcEndpointConnectionsConnection { return v.Connections }).(GetVpcEndpointConnectionsConnectionArrayOutput)
}

// The ID of the Vpc Endpoint.
func (o GetVpcEndpointConnectionsResultOutput) EndpointId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointConnectionsResult) *string { return v.EndpointId }).(pulumi.StringPtrOutput)
}

func (o GetVpcEndpointConnectionsResultOutput) EndpointOwnerId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointConnectionsResult) *int { return v.EndpointOwnerId }).(pulumi.IntPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVpcEndpointConnectionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcEndpointConnectionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Vpc Endpoint Connection IDs.
func (o GetVpcEndpointConnectionsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVpcEndpointConnectionsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetVpcEndpointConnectionsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointConnectionsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetVpcEndpointConnectionsResultOutput) ServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcEndpointConnectionsResult) string { return v.ServiceId }).(pulumi.StringOutput)
}

// The status of Vpc Endpoint Connection.
func (o GetVpcEndpointConnectionsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointConnectionsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVpcEndpointConnectionsResultOutput{})
}
