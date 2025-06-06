// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list Container Registry Enterprise Edition namespaces on Alibaba Cloud.
//
// > **NOTE:** Available in v1.86.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Declare the data source
//			myNamespaces, err := cs.GetRegistryEnterpriseNamespaces(ctx, &cs.GetRegistryEnterpriseNamespacesArgs{
//				InstanceId: "cri-xxx",
//				NameRegex:  pulumi.StringRef("my-namespace"),
//				OutputFile: pulumi.StringRef("my-namespace-json"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("output", myNamespaces.Namespaces)
//			return nil
//		})
//	}
//
// ```
func GetRegistryEnterpriseNamespaces(ctx *pulumi.Context, args *GetRegistryEnterpriseNamespacesArgs, opts ...pulumi.InvokeOption) (*GetRegistryEnterpriseNamespacesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRegistryEnterpriseNamespacesResult
	err := ctx.Invoke("alicloud:cs/getRegistryEnterpriseNamespaces:getRegistryEnterpriseNamespaces", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRegistryEnterpriseNamespaces.
type GetRegistryEnterpriseNamespacesArgs struct {
	// A list of ids to filter results by namespace id. Each item formats as `<instance_id>:<namespace_name>`.
	Ids []string `pulumi:"ids"`
	// ID of Container Registry Enterprise Edition instance.
	InstanceId string `pulumi:"instanceId"`
	// A regex string to filter results by namespace name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getRegistryEnterpriseNamespaces.
type GetRegistryEnterpriseNamespacesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of matched Container Registry Enterprise Edition namespaces. Each item formats as `<instance_id>:<namespace_name>`. Before 1.161.0, its element is a namespace uuid.
	Ids []string `pulumi:"ids"`
	// ID of Container Registry Enterprise Edition instance.
	InstanceId string  `pulumi:"instanceId"`
	NameRegex  *string `pulumi:"nameRegex"`
	// A list of namespace names.
	Names []string `pulumi:"names"`
	// A list of matched Container Registry Enterprise Edition namespaces. Each element contains the following attributes:
	Namespaces []GetRegistryEnterpriseNamespacesNamespace `pulumi:"namespaces"`
	OutputFile *string                                    `pulumi:"outputFile"`
}

func GetRegistryEnterpriseNamespacesOutput(ctx *pulumi.Context, args GetRegistryEnterpriseNamespacesOutputArgs, opts ...pulumi.InvokeOption) GetRegistryEnterpriseNamespacesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetRegistryEnterpriseNamespacesResultOutput, error) {
			args := v.(GetRegistryEnterpriseNamespacesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:cs/getRegistryEnterpriseNamespaces:getRegistryEnterpriseNamespaces", args, GetRegistryEnterpriseNamespacesResultOutput{}, options).(GetRegistryEnterpriseNamespacesResultOutput), nil
		}).(GetRegistryEnterpriseNamespacesResultOutput)
}

// A collection of arguments for invoking getRegistryEnterpriseNamespaces.
type GetRegistryEnterpriseNamespacesOutputArgs struct {
	// A list of ids to filter results by namespace id. Each item formats as `<instance_id>:<namespace_name>`.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// ID of Container Registry Enterprise Edition instance.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// A regex string to filter results by namespace name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetRegistryEnterpriseNamespacesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegistryEnterpriseNamespacesArgs)(nil)).Elem()
}

// A collection of values returned by getRegistryEnterpriseNamespaces.
type GetRegistryEnterpriseNamespacesResultOutput struct{ *pulumi.OutputState }

func (GetRegistryEnterpriseNamespacesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegistryEnterpriseNamespacesResult)(nil)).Elem()
}

func (o GetRegistryEnterpriseNamespacesResultOutput) ToGetRegistryEnterpriseNamespacesResultOutput() GetRegistryEnterpriseNamespacesResultOutput {
	return o
}

func (o GetRegistryEnterpriseNamespacesResultOutput) ToGetRegistryEnterpriseNamespacesResultOutputWithContext(ctx context.Context) GetRegistryEnterpriseNamespacesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetRegistryEnterpriseNamespacesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegistryEnterpriseNamespacesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of matched Container Registry Enterprise Edition namespaces. Each item formats as `<instance_id>:<namespace_name>`. Before 1.161.0, its element is a namespace uuid.
func (o GetRegistryEnterpriseNamespacesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRegistryEnterpriseNamespacesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// ID of Container Registry Enterprise Edition instance.
func (o GetRegistryEnterpriseNamespacesResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegistryEnterpriseNamespacesResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

func (o GetRegistryEnterpriseNamespacesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRegistryEnterpriseNamespacesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of namespace names.
func (o GetRegistryEnterpriseNamespacesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRegistryEnterpriseNamespacesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

// A list of matched Container Registry Enterprise Edition namespaces. Each element contains the following attributes:
func (o GetRegistryEnterpriseNamespacesResultOutput) Namespaces() GetRegistryEnterpriseNamespacesNamespaceArrayOutput {
	return o.ApplyT(func(v GetRegistryEnterpriseNamespacesResult) []GetRegistryEnterpriseNamespacesNamespace {
		return v.Namespaces
	}).(GetRegistryEnterpriseNamespacesNamespaceArrayOutput)
}

func (o GetRegistryEnterpriseNamespacesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRegistryEnterpriseNamespacesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRegistryEnterpriseNamespacesResultOutput{})
}
