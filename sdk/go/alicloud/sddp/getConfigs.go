// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sddp

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Sddp Configs of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.133.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/sddp"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// defaultConfig, err := sddp.NewConfig(ctx, "default", &sddp.ConfigArgs{
// Code: pulumi.String("access_failed_cnt"),
// Value: pulumi.String("10"),
// })
// if err != nil {
// return err
// }
// _default := sddp.GetConfigsOutput(ctx, sddp.GetConfigsOutputArgs{
// Ids: pulumi.StringArray{
// defaultConfig.ID(),
// },
// OutputFile: pulumi.String("./t.json"),
// }, nil);
// ctx.Export("sddpConfigId", _default.ApplyT(func(_default sddp.GetConfigsResult) (interface{}, error) {
// return _default.Ids, nil
// }).(pulumi.Interface{}Output))
// return nil
// })
// }
// ```
func GetConfigs(ctx *pulumi.Context, args *GetConfigsArgs, opts ...pulumi.InvokeOption) (*GetConfigsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetConfigsResult
	err := ctx.Invoke("alicloud:sddp/getConfigs:getConfigs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConfigs.
type GetConfigsArgs struct {
	// A list of Config IDs.
	Ids  []string `pulumi:"ids"`
	Lang *string  `pulumi:"lang"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getConfigs.
type GetConfigsResult struct {
	// A list of Sddp Configs. Each element contains the following attributes:
	Configs []GetConfigsConfig `pulumi:"configs"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	Lang       *string  `pulumi:"lang"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetConfigsOutput(ctx *pulumi.Context, args GetConfigsOutputArgs, opts ...pulumi.InvokeOption) GetConfigsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetConfigsResultOutput, error) {
			args := v.(GetConfigsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:sddp/getConfigs:getConfigs", args, GetConfigsResultOutput{}, options).(GetConfigsResultOutput), nil
		}).(GetConfigsResultOutput)
}

// A collection of arguments for invoking getConfigs.
type GetConfigsOutputArgs struct {
	// A list of Config IDs.
	Ids  pulumi.StringArrayInput `pulumi:"ids"`
	Lang pulumi.StringPtrInput   `pulumi:"lang"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetConfigsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConfigsArgs)(nil)).Elem()
}

// A collection of values returned by getConfigs.
type GetConfigsResultOutput struct{ *pulumi.OutputState }

func (GetConfigsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConfigsResult)(nil)).Elem()
}

func (o GetConfigsResultOutput) ToGetConfigsResultOutput() GetConfigsResultOutput {
	return o
}

func (o GetConfigsResultOutput) ToGetConfigsResultOutputWithContext(ctx context.Context) GetConfigsResultOutput {
	return o
}

// A list of Sddp Configs. Each element contains the following attributes:
func (o GetConfigsResultOutput) Configs() GetConfigsConfigArrayOutput {
	return o.ApplyT(func(v GetConfigsResult) []GetConfigsConfig { return v.Configs }).(GetConfigsConfigArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetConfigsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetConfigsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetConfigsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetConfigsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetConfigsResultOutput) Lang() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetConfigsResult) *string { return v.Lang }).(pulumi.StringPtrOutput)
}

func (o GetConfigsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetConfigsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetConfigsResultOutput{})
}
