// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package edas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of EDAS application in an Alibaba Cloud account according to the specified filters.
//
// > **NOTE:** Available in 1.82.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/edas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			applications, err := edas.GetApplications(ctx, &edas.GetApplicationsArgs{
//				Ids: []string{
//					"xxx",
//				},
//				OutputFile: pulumi.StringRef("application.txt"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstApplicationName", applications.Applications[0].AppName)
//			return nil
//		})
//	}
//
// ```
func GetApplications(ctx *pulumi.Context, args *GetApplicationsArgs, opts ...pulumi.InvokeOption) (*GetApplicationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetApplicationsResult
	err := ctx.Invoke("alicloud:edas/getApplications:getApplications", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplications.
type GetApplicationsArgs struct {
	// An ids string to filter results by the application id.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by the application name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getApplications.
type GetApplicationsResult struct {
	// A list of applications.
	Applications []GetApplicationsApplication `pulumi:"applications"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of application IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of applications names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetApplicationsOutput(ctx *pulumi.Context, args GetApplicationsOutputArgs, opts ...pulumi.InvokeOption) GetApplicationsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetApplicationsResultOutput, error) {
			args := v.(GetApplicationsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:edas/getApplications:getApplications", args, GetApplicationsResultOutput{}, options).(GetApplicationsResultOutput), nil
		}).(GetApplicationsResultOutput)
}

// A collection of arguments for invoking getApplications.
type GetApplicationsOutputArgs struct {
	// An ids string to filter results by the application id.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by the application name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetApplicationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetApplicationsArgs)(nil)).Elem()
}

// A collection of values returned by getApplications.
type GetApplicationsResultOutput struct{ *pulumi.OutputState }

func (GetApplicationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetApplicationsResult)(nil)).Elem()
}

func (o GetApplicationsResultOutput) ToGetApplicationsResultOutput() GetApplicationsResultOutput {
	return o
}

func (o GetApplicationsResultOutput) ToGetApplicationsResultOutputWithContext(ctx context.Context) GetApplicationsResultOutput {
	return o
}

// A list of applications.
func (o GetApplicationsResultOutput) Applications() GetApplicationsApplicationArrayOutput {
	return o.ApplyT(func(v GetApplicationsResult) []GetApplicationsApplication { return v.Applications }).(GetApplicationsApplicationArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetApplicationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetApplicationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of application IDs.
func (o GetApplicationsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetApplicationsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetApplicationsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApplicationsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of applications names.
func (o GetApplicationsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetApplicationsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetApplicationsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApplicationsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetApplicationsResultOutput{})
}
