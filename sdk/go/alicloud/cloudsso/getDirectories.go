// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudsso

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Cloud Sso Directories of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.135.0+.
//
// > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cloudsso"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := cloudsso.GetDirectories(ctx, &cloudsso.GetDirectoriesArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("cloudSsoDirectoryId1", ids.Directories[0].Id)
//			nameRegex, err := cloudsso.GetDirectories(ctx, &cloudsso.GetDirectoriesArgs{
//				NameRegex: pulumi.StringRef("^my-Directory"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("cloudSsoDirectoryId2", nameRegex.Directories[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetDirectories(ctx *pulumi.Context, args *GetDirectoriesArgs, opts ...pulumi.InvokeOption) (*GetDirectoriesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDirectoriesResult
	err := ctx.Invoke("alicloud:cloudsso/getDirectories:getDirectories", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDirectories.
type GetDirectoriesArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Directory IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Directory name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getDirectories.
type GetDirectoriesResult struct {
	Directories   []GetDirectoriesDirectory `pulumi:"directories"`
	EnableDetails *bool                     `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetDirectoriesOutput(ctx *pulumi.Context, args GetDirectoriesOutputArgs, opts ...pulumi.InvokeOption) GetDirectoriesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetDirectoriesResultOutput, error) {
			args := v.(GetDirectoriesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:cloudsso/getDirectories:getDirectories", args, GetDirectoriesResultOutput{}, options).(GetDirectoriesResultOutput), nil
		}).(GetDirectoriesResultOutput)
}

// A collection of arguments for invoking getDirectories.
type GetDirectoriesOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Directory IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Directory name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetDirectoriesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDirectoriesArgs)(nil)).Elem()
}

// A collection of values returned by getDirectories.
type GetDirectoriesResultOutput struct{ *pulumi.OutputState }

func (GetDirectoriesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDirectoriesResult)(nil)).Elem()
}

func (o GetDirectoriesResultOutput) ToGetDirectoriesResultOutput() GetDirectoriesResultOutput {
	return o
}

func (o GetDirectoriesResultOutput) ToGetDirectoriesResultOutputWithContext(ctx context.Context) GetDirectoriesResultOutput {
	return o
}

func (o GetDirectoriesResultOutput) Directories() GetDirectoriesDirectoryArrayOutput {
	return o.ApplyT(func(v GetDirectoriesResult) []GetDirectoriesDirectory { return v.Directories }).(GetDirectoriesDirectoryArrayOutput)
}

func (o GetDirectoriesResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDirectoriesResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDirectoriesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDirectoriesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDirectoriesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDirectoriesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDirectoriesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDirectoriesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetDirectoriesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDirectoriesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetDirectoriesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDirectoriesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDirectoriesResultOutput{})
}
