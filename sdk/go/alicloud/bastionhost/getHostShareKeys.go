// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bastionhost

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Bastionhost Host Share Keys of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.165.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/bastionhost"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := bastionhost.GetHostShareKeys(ctx, &bastionhost.GetHostShareKeysArgs{
//				InstanceId: "example_value",
//				Ids: []string{
//					"example_value-1",
//					"example_value-2",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("bastionhostHostShareKeyId1", ids.Keys[0].Id)
//			nameRegex, err := bastionhost.GetHostShareKeys(ctx, &bastionhost.GetHostShareKeysArgs{
//				InstanceId: "example_value",
//				NameRegex:  pulumi.StringRef("^my-HostShareKey"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("bastionhostHostShareKeyId2", nameRegex.Keys[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetHostShareKeys(ctx *pulumi.Context, args *GetHostShareKeysArgs, opts ...pulumi.InvokeOption) (*GetHostShareKeysResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetHostShareKeysResult
	err := ctx.Invoke("alicloud:bastionhost/getHostShareKeys:getHostShareKeys", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHostShareKeys.
type GetHostShareKeysArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Host Share Key IDs.
	Ids []string `pulumi:"ids"`
	// The ID of the Bastion instance.
	InstanceId string `pulumi:"instanceId"`
	// A regex string to filter results by Host Share Key name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getHostShareKeys.
type GetHostShareKeysResult struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                `pulumi:"id"`
	Ids        []string              `pulumi:"ids"`
	InstanceId string                `pulumi:"instanceId"`
	Keys       []GetHostShareKeysKey `pulumi:"keys"`
	NameRegex  *string               `pulumi:"nameRegex"`
	Names      []string              `pulumi:"names"`
	OutputFile *string               `pulumi:"outputFile"`
}

func GetHostShareKeysOutput(ctx *pulumi.Context, args GetHostShareKeysOutputArgs, opts ...pulumi.InvokeOption) GetHostShareKeysResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetHostShareKeysResultOutput, error) {
			args := v.(GetHostShareKeysArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:bastionhost/getHostShareKeys:getHostShareKeys", args, GetHostShareKeysResultOutput{}, options).(GetHostShareKeysResultOutput), nil
		}).(GetHostShareKeysResultOutput)
}

// A collection of arguments for invoking getHostShareKeys.
type GetHostShareKeysOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Host Share Key IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The ID of the Bastion instance.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// A regex string to filter results by Host Share Key name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetHostShareKeysOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostShareKeysArgs)(nil)).Elem()
}

// A collection of values returned by getHostShareKeys.
type GetHostShareKeysResultOutput struct{ *pulumi.OutputState }

func (GetHostShareKeysResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostShareKeysResult)(nil)).Elem()
}

func (o GetHostShareKeysResultOutput) ToGetHostShareKeysResultOutput() GetHostShareKeysResultOutput {
	return o
}

func (o GetHostShareKeysResultOutput) ToGetHostShareKeysResultOutputWithContext(ctx context.Context) GetHostShareKeysResultOutput {
	return o
}

func (o GetHostShareKeysResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetHostShareKeysResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetHostShareKeysResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostShareKeysResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetHostShareKeysResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHostShareKeysResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetHostShareKeysResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostShareKeysResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

func (o GetHostShareKeysResultOutput) Keys() GetHostShareKeysKeyArrayOutput {
	return o.ApplyT(func(v GetHostShareKeysResult) []GetHostShareKeysKey { return v.Keys }).(GetHostShareKeysKeyArrayOutput)
}

func (o GetHostShareKeysResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostShareKeysResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetHostShareKeysResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHostShareKeysResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetHostShareKeysResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostShareKeysResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHostShareKeysResultOutput{})
}
