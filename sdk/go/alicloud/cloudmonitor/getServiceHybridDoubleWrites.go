// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudmonitor

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Cloud Monitor Service Hybrid Double Writes of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.220.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cloudmonitor"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := alicloud.GetAccount(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			source, err := cms.NewNamespace(ctx, "source", &cms.NamespaceArgs{
//				Namespace: pulumi.String("your-source-namespace"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultNamespace, err := cms.NewNamespace(ctx, "default", &cms.NamespaceArgs{
//				Namespace: pulumi.String("your-namespace"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultServiceHybridDoubleWrite, err := cloudmonitor.NewServiceHybridDoubleWrite(ctx, "default", &cloudmonitor.ServiceHybridDoubleWriteArgs{
//				SourceNamespace: source.ID(),
//				SourceUserId:    pulumi.String(_default.Id),
//				Namespace:       defaultNamespace.ID(),
//				UserId:          pulumi.String(_default.Id),
//			})
//			if err != nil {
//				return err
//			}
//			ids := cloudmonitor.GetServiceHybridDoubleWritesOutput(ctx, cloudmonitor.GetServiceHybridDoubleWritesOutputArgs{
//				Ids: pulumi.StringArray{
//					defaultServiceHybridDoubleWrite.ID(),
//				},
//			}, nil)
//			ctx.Export("cloudMonitorServiceHybridDoubleWritesId1", ids.ApplyT(func(ids cloudmonitor.GetServiceHybridDoubleWritesResult) (*string, error) {
//				return &ids.HybridDoubleWrites[0].Id, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
func GetServiceHybridDoubleWrites(ctx *pulumi.Context, args *GetServiceHybridDoubleWritesArgs, opts ...pulumi.InvokeOption) (*GetServiceHybridDoubleWritesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServiceHybridDoubleWritesResult
	err := ctx.Invoke("alicloud:cloudmonitor/getServiceHybridDoubleWrites:getServiceHybridDoubleWrites", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceHybridDoubleWrites.
type GetServiceHybridDoubleWritesArgs struct {
	// A list of Hybrid Double Write IDs.
	Ids []string `pulumi:"ids"`
	// Target Namespace.
	Namespace *string `pulumi:"namespace"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Source Namespace.
	SourceNamespace *string `pulumi:"sourceNamespace"`
	// Source UserId.
	SourceUserId *string `pulumi:"sourceUserId"`
	// Target UserId.
	UserId *string `pulumi:"userId"`
}

// A collection of values returned by getServiceHybridDoubleWrites.
type GetServiceHybridDoubleWritesResult struct {
	// A list of Hybrid Double Writes. Each element contains the following attributes:
	HybridDoubleWrites []GetServiceHybridDoubleWritesHybridDoubleWrite `pulumi:"hybridDoubleWrites"`
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
	// Target Namespace.
	Namespace  *string `pulumi:"namespace"`
	OutputFile *string `pulumi:"outputFile"`
	// Source Namespace.
	SourceNamespace *string `pulumi:"sourceNamespace"`
	// Source UserId.
	SourceUserId *string `pulumi:"sourceUserId"`
	// Target UserId.
	UserId *string `pulumi:"userId"`
}

func GetServiceHybridDoubleWritesOutput(ctx *pulumi.Context, args GetServiceHybridDoubleWritesOutputArgs, opts ...pulumi.InvokeOption) GetServiceHybridDoubleWritesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetServiceHybridDoubleWritesResultOutput, error) {
			args := v.(GetServiceHybridDoubleWritesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:cloudmonitor/getServiceHybridDoubleWrites:getServiceHybridDoubleWrites", args, GetServiceHybridDoubleWritesResultOutput{}, options).(GetServiceHybridDoubleWritesResultOutput), nil
		}).(GetServiceHybridDoubleWritesResultOutput)
}

// A collection of arguments for invoking getServiceHybridDoubleWrites.
type GetServiceHybridDoubleWritesOutputArgs struct {
	// A list of Hybrid Double Write IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// Target Namespace.
	Namespace pulumi.StringPtrInput `pulumi:"namespace"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Source Namespace.
	SourceNamespace pulumi.StringPtrInput `pulumi:"sourceNamespace"`
	// Source UserId.
	SourceUserId pulumi.StringPtrInput `pulumi:"sourceUserId"`
	// Target UserId.
	UserId pulumi.StringPtrInput `pulumi:"userId"`
}

func (GetServiceHybridDoubleWritesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceHybridDoubleWritesArgs)(nil)).Elem()
}

// A collection of values returned by getServiceHybridDoubleWrites.
type GetServiceHybridDoubleWritesResultOutput struct{ *pulumi.OutputState }

func (GetServiceHybridDoubleWritesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceHybridDoubleWritesResult)(nil)).Elem()
}

func (o GetServiceHybridDoubleWritesResultOutput) ToGetServiceHybridDoubleWritesResultOutput() GetServiceHybridDoubleWritesResultOutput {
	return o
}

func (o GetServiceHybridDoubleWritesResultOutput) ToGetServiceHybridDoubleWritesResultOutputWithContext(ctx context.Context) GetServiceHybridDoubleWritesResultOutput {
	return o
}

// A list of Hybrid Double Writes. Each element contains the following attributes:
func (o GetServiceHybridDoubleWritesResultOutput) HybridDoubleWrites() GetServiceHybridDoubleWritesHybridDoubleWriteArrayOutput {
	return o.ApplyT(func(v GetServiceHybridDoubleWritesResult) []GetServiceHybridDoubleWritesHybridDoubleWrite {
		return v.HybridDoubleWrites
	}).(GetServiceHybridDoubleWritesHybridDoubleWriteArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServiceHybridDoubleWritesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceHybridDoubleWritesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServiceHybridDoubleWritesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServiceHybridDoubleWritesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// Target Namespace.
func (o GetServiceHybridDoubleWritesResultOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceHybridDoubleWritesResult) *string { return v.Namespace }).(pulumi.StringPtrOutput)
}

func (o GetServiceHybridDoubleWritesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceHybridDoubleWritesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// Source Namespace.
func (o GetServiceHybridDoubleWritesResultOutput) SourceNamespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceHybridDoubleWritesResult) *string { return v.SourceNamespace }).(pulumi.StringPtrOutput)
}

// Source UserId.
func (o GetServiceHybridDoubleWritesResultOutput) SourceUserId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceHybridDoubleWritesResult) *string { return v.SourceUserId }).(pulumi.StringPtrOutput)
}

// Target UserId.
func (o GetServiceHybridDoubleWritesResultOutput) UserId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceHybridDoubleWritesResult) *string { return v.UserId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServiceHybridDoubleWritesResultOutput{})
}
