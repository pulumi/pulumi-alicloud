// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provide  a data source to retrieve the type of protocol used to create NAS file system.
//
// > **NOTE:** Available in 1.42.0
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/nas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := nas.GetProtocols(ctx, &nas.GetProtocolsArgs{
//				Type:       "Performance",
//				ZoneId:     pulumi.StringRef("cn-beijing-e"),
//				OutputFile: pulumi.StringRef("protocols.txt"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("nasProtocolsProtocol", _default.Protocols[0])
//			return nil
//		})
//	}
//
// ```
func GetProtocols(ctx *pulumi.Context, args *GetProtocolsArgs, opts ...pulumi.InvokeOption) (*GetProtocolsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetProtocolsResult
	err := ctx.Invoke("alicloud:nas/getProtocols:getProtocols", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProtocols.
type GetProtocolsArgs struct {
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The file system type. Valid Values: `Performance` and `Capacity`.
	Type string `pulumi:"type"`
	// String to filter results by zone id.
	ZoneId *string `pulumi:"zoneId"`
}

// A collection of values returned by getProtocols.
type GetProtocolsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string  `pulumi:"id"`
	OutputFile *string `pulumi:"outputFile"`
	// A list of supported protocol type..
	Protocols []string `pulumi:"protocols"`
	Type      string   `pulumi:"type"`
	ZoneId    *string  `pulumi:"zoneId"`
}

func GetProtocolsOutput(ctx *pulumi.Context, args GetProtocolsOutputArgs, opts ...pulumi.InvokeOption) GetProtocolsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetProtocolsResultOutput, error) {
			args := v.(GetProtocolsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:nas/getProtocols:getProtocols", args, GetProtocolsResultOutput{}, options).(GetProtocolsResultOutput), nil
		}).(GetProtocolsResultOutput)
}

// A collection of arguments for invoking getProtocols.
type GetProtocolsOutputArgs struct {
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The file system type. Valid Values: `Performance` and `Capacity`.
	Type pulumi.StringInput `pulumi:"type"`
	// String to filter results by zone id.
	ZoneId pulumi.StringPtrInput `pulumi:"zoneId"`
}

func (GetProtocolsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProtocolsArgs)(nil)).Elem()
}

// A collection of values returned by getProtocols.
type GetProtocolsResultOutput struct{ *pulumi.OutputState }

func (GetProtocolsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProtocolsResult)(nil)).Elem()
}

func (o GetProtocolsResultOutput) ToGetProtocolsResultOutput() GetProtocolsResultOutput {
	return o
}

func (o GetProtocolsResultOutput) ToGetProtocolsResultOutputWithContext(ctx context.Context) GetProtocolsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetProtocolsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProtocolsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetProtocolsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProtocolsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of supported protocol type..
func (o GetProtocolsResultOutput) Protocols() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetProtocolsResult) []string { return v.Protocols }).(pulumi.StringArrayOutput)
}

func (o GetProtocolsResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetProtocolsResult) string { return v.Type }).(pulumi.StringOutput)
}

func (o GetProtocolsResultOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProtocolsResult) *string { return v.ZoneId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProtocolsResultOutput{})
}
