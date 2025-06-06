// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mse

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Mse Gateways of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.157.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/mse"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := mse.GetGateways(ctx, &mse.GetGatewaysArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("mseGatewayId1", ids.Gateways[0].Id)
//			nameRegex, err := mse.GetGateways(ctx, &mse.GetGatewaysArgs{
//				NameRegex: pulumi.StringRef("^my-Gateway"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("mseGatewayId2", nameRegex.Gateways[0].Id)
//			status, err := mse.GetGateways(ctx, &mse.GetGatewaysArgs{
//				Status: pulumi.StringRef("2"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("mseGatewayId3", status.Gateways[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetGateways(ctx *pulumi.Context, args *GetGatewaysArgs, opts ...pulumi.InvokeOption) (*GetGatewaysResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGatewaysResult
	err := ctx.Invoke("alicloud:mse/getGateways:getGateways", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGateways.
type GetGatewaysArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// The name of the Gateway.
	GatewayName *string `pulumi:"gatewayName"`
	// A list of Gateway IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Gateway name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the gateway. Valid values: `0`, `1`, `2`, `3`, `4`, `6`, `8`, `9`, `10`, `11`, `12`, `13`.
	Status *string `pulumi:"status"`
	// The ID of the VPC.
	VpcId *string `pulumi:"vpcId"`
}

// A collection of values returned by getGateways.
type GetGatewaysResult struct {
	EnableDetails *bool                `pulumi:"enableDetails"`
	GatewayName   *string              `pulumi:"gatewayName"`
	Gateways      []GetGatewaysGateway `pulumi:"gateways"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	Status     *string  `pulumi:"status"`
	VpcId      *string  `pulumi:"vpcId"`
}

func GetGatewaysOutput(ctx *pulumi.Context, args GetGatewaysOutputArgs, opts ...pulumi.InvokeOption) GetGatewaysResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetGatewaysResultOutput, error) {
			args := v.(GetGatewaysArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:mse/getGateways:getGateways", args, GetGatewaysResultOutput{}, options).(GetGatewaysResultOutput), nil
		}).(GetGatewaysResultOutput)
}

// A collection of arguments for invoking getGateways.
type GetGatewaysOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// The name of the Gateway.
	GatewayName pulumi.StringPtrInput `pulumi:"gatewayName"`
	// A list of Gateway IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Gateway name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the gateway. Valid values: `0`, `1`, `2`, `3`, `4`, `6`, `8`, `9`, `10`, `11`, `12`, `13`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The ID of the VPC.
	VpcId pulumi.StringPtrInput `pulumi:"vpcId"`
}

func (GetGatewaysOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewaysArgs)(nil)).Elem()
}

// A collection of values returned by getGateways.
type GetGatewaysResultOutput struct{ *pulumi.OutputState }

func (GetGatewaysResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewaysResult)(nil)).Elem()
}

func (o GetGatewaysResultOutput) ToGetGatewaysResultOutput() GetGatewaysResultOutput {
	return o
}

func (o GetGatewaysResultOutput) ToGetGatewaysResultOutputWithContext(ctx context.Context) GetGatewaysResultOutput {
	return o
}

func (o GetGatewaysResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

func (o GetGatewaysResultOutput) GatewayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *string { return v.GatewayName }).(pulumi.StringPtrOutput)
}

func (o GetGatewaysResultOutput) Gateways() GetGatewaysGatewayArrayOutput {
	return o.ApplyT(func(v GetGatewaysResult) []GetGatewaysGateway { return v.Gateways }).(GetGatewaysGatewayArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGatewaysResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewaysResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetGatewaysResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetGatewaysResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetGatewaysResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetGatewaysResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetGatewaysResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetGatewaysResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetGatewaysResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetGatewaysResultOutput) VpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *string { return v.VpcId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGatewaysResultOutput{})
}
