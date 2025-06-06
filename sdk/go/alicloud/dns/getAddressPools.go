// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Alidns Address Pools of the current Alibaba Cloud user.
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
//			ids, err := dns.GetAddressPools(ctx, &dns.GetAddressPoolsArgs{
//				InstanceId: "example_value",
//				Ids: []string{
//					"example_value-1",
//					"example_value-2",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("alidnsAddressPoolId1", ids.Pools[0].Id)
//			nameRegex, err := dns.GetAddressPools(ctx, &dns.GetAddressPoolsArgs{
//				InstanceId: "example_value",
//				NameRegex:  pulumi.StringRef("^my-AddressPool"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("alidnsAddressPoolId2", nameRegex.Pools[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetAddressPools(ctx *pulumi.Context, args *GetAddressPoolsArgs, opts ...pulumi.InvokeOption) (*GetAddressPoolsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAddressPoolsResult
	err := ctx.Invoke("alicloud:dns/getAddressPools:getAddressPools", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAddressPools.
type GetAddressPoolsArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Address Pool IDs.
	Ids []string `pulumi:"ids"`
	// The id of the instance.
	InstanceId string `pulumi:"instanceId"`
	// A regex string to filter results by Address Pool name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getAddressPools.
type GetAddressPoolsResult struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                `pulumi:"id"`
	Ids        []string              `pulumi:"ids"`
	InstanceId string                `pulumi:"instanceId"`
	NameRegex  *string               `pulumi:"nameRegex"`
	Names      []string              `pulumi:"names"`
	OutputFile *string               `pulumi:"outputFile"`
	Pools      []GetAddressPoolsPool `pulumi:"pools"`
}

func GetAddressPoolsOutput(ctx *pulumi.Context, args GetAddressPoolsOutputArgs, opts ...pulumi.InvokeOption) GetAddressPoolsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetAddressPoolsResultOutput, error) {
			args := v.(GetAddressPoolsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:dns/getAddressPools:getAddressPools", args, GetAddressPoolsResultOutput{}, options).(GetAddressPoolsResultOutput), nil
		}).(GetAddressPoolsResultOutput)
}

// A collection of arguments for invoking getAddressPools.
type GetAddressPoolsOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Address Pool IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The id of the instance.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// A regex string to filter results by Address Pool name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetAddressPoolsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAddressPoolsArgs)(nil)).Elem()
}

// A collection of values returned by getAddressPools.
type GetAddressPoolsResultOutput struct{ *pulumi.OutputState }

func (GetAddressPoolsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAddressPoolsResult)(nil)).Elem()
}

func (o GetAddressPoolsResultOutput) ToGetAddressPoolsResultOutput() GetAddressPoolsResultOutput {
	return o
}

func (o GetAddressPoolsResultOutput) ToGetAddressPoolsResultOutputWithContext(ctx context.Context) GetAddressPoolsResultOutput {
	return o
}

func (o GetAddressPoolsResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetAddressPoolsResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAddressPoolsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAddressPoolsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAddressPoolsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAddressPoolsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetAddressPoolsResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAddressPoolsResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

func (o GetAddressPoolsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAddressPoolsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetAddressPoolsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAddressPoolsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetAddressPoolsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAddressPoolsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetAddressPoolsResultOutput) Pools() GetAddressPoolsPoolArrayOutput {
	return o.ApplyT(func(v GetAddressPoolsResult) []GetAddressPoolsPool { return v.Pools }).(GetAddressPoolsPoolArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAddressPoolsResultOutput{})
}
