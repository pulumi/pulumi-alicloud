// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Alidns Gtm Instances of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.151.0+.
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
//			ids, err := dns.GetGtmInstances(ctx, &dns.GetGtmInstancesArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("alidnsGtmInstanceId1", ids.Instances[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetGtmInstances(ctx *pulumi.Context, args *GetGtmInstancesArgs, opts ...pulumi.InvokeOption) (*GetGtmInstancesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGtmInstancesResult
	err := ctx.Invoke("alicloud:dns/getGtmInstances:getGtmInstances", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGtmInstances.
type GetGtmInstancesArgs struct {
	// A list of Gtm Instance IDs.
	Ids []string `pulumi:"ids"`
	// The lang.
	Lang *string `pulumi:"lang"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
}

// A collection of values returned by getGtmInstances.
type GetGtmInstancesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id              string                    `pulumi:"id"`
	Ids             []string                  `pulumi:"ids"`
	Instances       []GetGtmInstancesInstance `pulumi:"instances"`
	Lang            *string                   `pulumi:"lang"`
	OutputFile      string                    `pulumi:"outputFile"`
	ResourceGroupId *string                   `pulumi:"resourceGroupId"`
}

func GetGtmInstancesOutput(ctx *pulumi.Context, args GetGtmInstancesOutputArgs, opts ...pulumi.InvokeOption) GetGtmInstancesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetGtmInstancesResultOutput, error) {
			args := v.(GetGtmInstancesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:dns/getGtmInstances:getGtmInstances", args, GetGtmInstancesResultOutput{}, options).(GetGtmInstancesResultOutput), nil
		}).(GetGtmInstancesResultOutput)
}

// A collection of arguments for invoking getGtmInstances.
type GetGtmInstancesOutputArgs struct {
	// A list of Gtm Instance IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The lang.
	Lang pulumi.StringPtrInput `pulumi:"lang"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
}

func (GetGtmInstancesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGtmInstancesArgs)(nil)).Elem()
}

// A collection of values returned by getGtmInstances.
type GetGtmInstancesResultOutput struct{ *pulumi.OutputState }

func (GetGtmInstancesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGtmInstancesResult)(nil)).Elem()
}

func (o GetGtmInstancesResultOutput) ToGetGtmInstancesResultOutput() GetGtmInstancesResultOutput {
	return o
}

func (o GetGtmInstancesResultOutput) ToGetGtmInstancesResultOutputWithContext(ctx context.Context) GetGtmInstancesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetGtmInstancesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGtmInstancesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetGtmInstancesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetGtmInstancesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetGtmInstancesResultOutput) Instances() GetGtmInstancesInstanceArrayOutput {
	return o.ApplyT(func(v GetGtmInstancesResult) []GetGtmInstancesInstance { return v.Instances }).(GetGtmInstancesInstanceArrayOutput)
}

func (o GetGtmInstancesResultOutput) Lang() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGtmInstancesResult) *string { return v.Lang }).(pulumi.StringPtrOutput)
}

func (o GetGtmInstancesResultOutput) OutputFile() pulumi.StringOutput {
	return o.ApplyT(func(v GetGtmInstancesResult) string { return v.OutputFile }).(pulumi.StringOutput)
}

func (o GetGtmInstancesResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGtmInstancesResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGtmInstancesResultOutput{})
}
