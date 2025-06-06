// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cr

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the CR Vpc Endpoint Linked Vpcs of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.199.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cr"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := cr.GetVpcEndpointLinkedVpcs(ctx, &cr.GetVpcEndpointLinkedVpcsArgs{
//				Ids: []string{
//					"example_id",
//				},
//				InstanceId: "your_cr_instance_id",
//				ModuleName: "Registry",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("alicloudCrVpcEndpointLinkedVpcsId1", ids.VpcEndpointLinkedVpcs[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetVpcEndpointLinkedVpcs(ctx *pulumi.Context, args *GetVpcEndpointLinkedVpcsArgs, opts ...pulumi.InvokeOption) (*GetVpcEndpointLinkedVpcsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVpcEndpointLinkedVpcsResult
	err := ctx.Invoke("alicloud:cr/getVpcEndpointLinkedVpcs:getVpcEndpointLinkedVpcs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpcEndpointLinkedVpcs.
type GetVpcEndpointLinkedVpcsArgs struct {
	// A list of CR Vpc Endpoint Linked Vpc IDs.
	Ids []string `pulumi:"ids"`
	// The ID of the instance.
	InstanceId string `pulumi:"instanceId"`
	// The name of the module that you want to access. Valid Values:
	// - `Registry`: the image repository.
	// - `Chart`: a Helm chart.
	ModuleName string `pulumi:"moduleName"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the Vpc Endpoint Linked Vpc. Valid Values: `CREATING`, `RUNNING`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getVpcEndpointLinkedVpcs.
type GetVpcEndpointLinkedVpcsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
	// The ID of the instance.
	InstanceId string `pulumi:"instanceId"`
	// The name of the module that you want to access.
	ModuleName string  `pulumi:"moduleName"`
	OutputFile *string `pulumi:"outputFile"`
	// The status of the Vpc Endpoint Linked Vpc.
	Status *string `pulumi:"status"`
	// A list of CR Vpc Endpoint Linked Vpcs. Each element contains the following attributes:
	VpcEndpointLinkedVpcs []GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc `pulumi:"vpcEndpointLinkedVpcs"`
}

func GetVpcEndpointLinkedVpcsOutput(ctx *pulumi.Context, args GetVpcEndpointLinkedVpcsOutputArgs, opts ...pulumi.InvokeOption) GetVpcEndpointLinkedVpcsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetVpcEndpointLinkedVpcsResultOutput, error) {
			args := v.(GetVpcEndpointLinkedVpcsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:cr/getVpcEndpointLinkedVpcs:getVpcEndpointLinkedVpcs", args, GetVpcEndpointLinkedVpcsResultOutput{}, options).(GetVpcEndpointLinkedVpcsResultOutput), nil
		}).(GetVpcEndpointLinkedVpcsResultOutput)
}

// A collection of arguments for invoking getVpcEndpointLinkedVpcs.
type GetVpcEndpointLinkedVpcsOutputArgs struct {
	// A list of CR Vpc Endpoint Linked Vpc IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The ID of the instance.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// The name of the module that you want to access. Valid Values:
	// - `Registry`: the image repository.
	// - `Chart`: a Helm chart.
	ModuleName pulumi.StringInput `pulumi:"moduleName"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the Vpc Endpoint Linked Vpc. Valid Values: `CREATING`, `RUNNING`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetVpcEndpointLinkedVpcsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcEndpointLinkedVpcsArgs)(nil)).Elem()
}

// A collection of values returned by getVpcEndpointLinkedVpcs.
type GetVpcEndpointLinkedVpcsResultOutput struct{ *pulumi.OutputState }

func (GetVpcEndpointLinkedVpcsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcEndpointLinkedVpcsResult)(nil)).Elem()
}

func (o GetVpcEndpointLinkedVpcsResultOutput) ToGetVpcEndpointLinkedVpcsResultOutput() GetVpcEndpointLinkedVpcsResultOutput {
	return o
}

func (o GetVpcEndpointLinkedVpcsResultOutput) ToGetVpcEndpointLinkedVpcsResultOutputWithContext(ctx context.Context) GetVpcEndpointLinkedVpcsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetVpcEndpointLinkedVpcsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcEndpointLinkedVpcsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVpcEndpointLinkedVpcsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVpcEndpointLinkedVpcsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// The ID of the instance.
func (o GetVpcEndpointLinkedVpcsResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcEndpointLinkedVpcsResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

// The name of the module that you want to access.
func (o GetVpcEndpointLinkedVpcsResultOutput) ModuleName() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcEndpointLinkedVpcsResult) string { return v.ModuleName }).(pulumi.StringOutput)
}

func (o GetVpcEndpointLinkedVpcsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointLinkedVpcsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The status of the Vpc Endpoint Linked Vpc.
func (o GetVpcEndpointLinkedVpcsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointLinkedVpcsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// A list of CR Vpc Endpoint Linked Vpcs. Each element contains the following attributes:
func (o GetVpcEndpointLinkedVpcsResultOutput) VpcEndpointLinkedVpcs() GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpcArrayOutput {
	return o.ApplyT(func(v GetVpcEndpointLinkedVpcsResult) []GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc {
		return v.VpcEndpointLinkedVpcs
	}).(GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpcArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVpcEndpointLinkedVpcsResultOutput{})
}
