// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ddos

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of Anti-DDoS Advanced instances in an Alibaba Cloud account according to the specified filters.
//
// > **NOTE:** Available in v1.183.0+ .
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ddos"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// cfg := config.New(ctx, "")
// name := "tf-example";
// if param := cfg.Get("name"); param != ""{
// name = param
// }
// _, err := ddos.NewDdosBgpInstance(ctx, "instance", &ddos.DdosBgpInstanceArgs{
// Name: pulumi.String(name),
// BaseBandwidth: pulumi.Int(20),
// Bandwidth: pulumi.Int(-1),
// IpCount: pulumi.Int(100),
// IpType: pulumi.String("IPv4"),
// NormalBandwidth: pulumi.Int(100),
// Type: pulumi.String("Enterprise"),
// })
// if err != nil {
// return err
// }
// instance, err := ddos.GetDdosBgpInstances(ctx, &ddos.GetDdosBgpInstancesArgs{
// NameRegex: pulumi.StringRef("ddosbgp"),
// }, nil);
// if err != nil {
// return err
// }
// ctx.Export("instance", pulumi.StringArray(%!v(PANIC=Format method: fatal: A failure has occurred: unlowered splat expression @ example.pp:21,11-25)))
// return nil
// })
// }
// ```
func GetDdosBgpInstances(ctx *pulumi.Context, args *GetDdosBgpInstancesArgs, opts ...pulumi.InvokeOption) (*GetDdosBgpInstancesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDdosBgpInstancesResult
	err := ctx.Invoke("alicloud:ddos/getDdosBgpInstances:getDdosBgpInstances", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDdosBgpInstances.
type GetDdosBgpInstancesArgs struct {
	// A list of instance IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by the instance name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getDdosBgpInstances.
type GetDdosBgpInstancesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of instance IDs.
	Ids []string `pulumi:"ids"`
	// A list of apis. Each element contains the following attributes:
	Instances []GetDdosBgpInstancesInstance `pulumi:"instances"`
	NameRegex *string                       `pulumi:"nameRegex"`
	// A list of instance names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetDdosBgpInstancesOutput(ctx *pulumi.Context, args GetDdosBgpInstancesOutputArgs, opts ...pulumi.InvokeOption) GetDdosBgpInstancesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetDdosBgpInstancesResultOutput, error) {
			args := v.(GetDdosBgpInstancesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:ddos/getDdosBgpInstances:getDdosBgpInstances", args, GetDdosBgpInstancesResultOutput{}, options).(GetDdosBgpInstancesResultOutput), nil
		}).(GetDdosBgpInstancesResultOutput)
}

// A collection of arguments for invoking getDdosBgpInstances.
type GetDdosBgpInstancesOutputArgs struct {
	// A list of instance IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by the instance name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetDdosBgpInstancesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDdosBgpInstancesArgs)(nil)).Elem()
}

// A collection of values returned by getDdosBgpInstances.
type GetDdosBgpInstancesResultOutput struct{ *pulumi.OutputState }

func (GetDdosBgpInstancesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDdosBgpInstancesResult)(nil)).Elem()
}

func (o GetDdosBgpInstancesResultOutput) ToGetDdosBgpInstancesResultOutput() GetDdosBgpInstancesResultOutput {
	return o
}

func (o GetDdosBgpInstancesResultOutput) ToGetDdosBgpInstancesResultOutputWithContext(ctx context.Context) GetDdosBgpInstancesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetDdosBgpInstancesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDdosBgpInstancesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of instance IDs.
func (o GetDdosBgpInstancesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDdosBgpInstancesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// A list of apis. Each element contains the following attributes:
func (o GetDdosBgpInstancesResultOutput) Instances() GetDdosBgpInstancesInstanceArrayOutput {
	return o.ApplyT(func(v GetDdosBgpInstancesResult) []GetDdosBgpInstancesInstance { return v.Instances }).(GetDdosBgpInstancesInstanceArrayOutput)
}

func (o GetDdosBgpInstancesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDdosBgpInstancesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of instance names.
func (o GetDdosBgpInstancesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDdosBgpInstancesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetDdosBgpInstancesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDdosBgpInstancesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDdosBgpInstancesResultOutput{})
}
