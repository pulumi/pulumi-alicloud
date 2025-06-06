// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Api Gateway Plugins of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.187.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/apigateway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := apigateway.GetPlugins(ctx, &apigateway.GetPluginsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("apiGatewayPluginId1", ids.Plugins[0].Id)
//			nameRegex, err := apigateway.GetPlugins(ctx, &apigateway.GetPluginsArgs{
//				NameRegex: pulumi.StringRef("^my-Plugin"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("apiGatewayPluginId2", nameRegex.Plugins[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetPlugins(ctx *pulumi.Context, args *GetPluginsArgs, opts ...pulumi.InvokeOption) (*GetPluginsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPluginsResult
	err := ctx.Invoke("alicloud:apigateway/getPlugins:getPlugins", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPlugins.
type GetPluginsArgs struct {
	// A list of Plugin IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Plugin name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
	PluginName *string `pulumi:"pluginName"`
	// The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
	PluginType *string `pulumi:"pluginType"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getPlugins.
type GetPluginsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string             `pulumi:"id"`
	Ids        []string           `pulumi:"ids"`
	NameRegex  *string            `pulumi:"nameRegex"`
	Names      []string           `pulumi:"names"`
	OutputFile *string            `pulumi:"outputFile"`
	PageNumber *int               `pulumi:"pageNumber"`
	PageSize   *int               `pulumi:"pageSize"`
	PluginName *string            `pulumi:"pluginName"`
	PluginType *string            `pulumi:"pluginType"`
	Plugins    []GetPluginsPlugin `pulumi:"plugins"`
	Tags       map[string]string  `pulumi:"tags"`
}

func GetPluginsOutput(ctx *pulumi.Context, args GetPluginsOutputArgs, opts ...pulumi.InvokeOption) GetPluginsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetPluginsResultOutput, error) {
			args := v.(GetPluginsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:apigateway/getPlugins:getPlugins", args, GetPluginsResultOutput{}, options).(GetPluginsResultOutput), nil
		}).(GetPluginsResultOutput)
}

// A collection of arguments for invoking getPlugins.
type GetPluginsOutputArgs struct {
	// A list of Plugin IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Plugin name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
	PluginName pulumi.StringPtrInput `pulumi:"pluginName"`
	// The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
	PluginType pulumi.StringPtrInput `pulumi:"pluginType"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (GetPluginsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPluginsArgs)(nil)).Elem()
}

// A collection of values returned by getPlugins.
type GetPluginsResultOutput struct{ *pulumi.OutputState }

func (GetPluginsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPluginsResult)(nil)).Elem()
}

func (o GetPluginsResultOutput) ToGetPluginsResultOutput() GetPluginsResultOutput {
	return o
}

func (o GetPluginsResultOutput) ToGetPluginsResultOutputWithContext(ctx context.Context) GetPluginsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetPluginsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPluginsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetPluginsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPluginsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetPluginsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPluginsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetPluginsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPluginsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetPluginsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPluginsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetPluginsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetPluginsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetPluginsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetPluginsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func (o GetPluginsResultOutput) PluginName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPluginsResult) *string { return v.PluginName }).(pulumi.StringPtrOutput)
}

func (o GetPluginsResultOutput) PluginType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPluginsResult) *string { return v.PluginType }).(pulumi.StringPtrOutput)
}

func (o GetPluginsResultOutput) Plugins() GetPluginsPluginArrayOutput {
	return o.ApplyT(func(v GetPluginsResult) []GetPluginsPlugin { return v.Plugins }).(GetPluginsPluginArrayOutput)
}

func (o GetPluginsResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetPluginsResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPluginsResultOutput{})
}
