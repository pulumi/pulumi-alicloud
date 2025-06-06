// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides CEN Bandwidth Packages available to the user.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := cen.GetBandwidthPackages(ctx, &cen.GetBandwidthPackagesArgs{
//				InstanceId: pulumi.StringRef("cen-id1"),
//				NameRegex:  pulumi.StringRef("^foo"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstCenBandwidthPackageId", example.Packages[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetBandwidthPackages(ctx *pulumi.Context, args *GetBandwidthPackagesArgs, opts ...pulumi.InvokeOption) (*GetBandwidthPackagesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetBandwidthPackagesResult
	err := ctx.Invoke("alicloud:cen/getBandwidthPackages:getBandwidthPackages", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBandwidthPackages.
type GetBandwidthPackagesArgs struct {
	// Limit search to a list of specific CEN Bandwidth Package IDs.
	Ids []string `pulumi:"ids"`
	// Indicates whether to include renewal data. Valid values: `true`: Return renewal data in the response. `false`: Do not return renewal data in the response.
	IncludeReservationData *bool `pulumi:"includeReservationData"`
	// ID of a CEN instance.
	InstanceId *string `pulumi:"instanceId"`
	// A regex string to filter CEN Bandwidth Package by name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Status of the CEN Bandwidth Package in CEN instance, Valid value: `Idle` and `InUse`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getBandwidthPackages.
type GetBandwidthPackagesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of specific CEN Bandwidth Package IDs.
	Ids                    []string `pulumi:"ids"`
	IncludeReservationData *bool    `pulumi:"includeReservationData"`
	// The ID of the CEN instance that are associated with the bandwidth package.
	InstanceId *string `pulumi:"instanceId"`
	NameRegex  *string `pulumi:"nameRegex"`
	// (Available in 1.98.0+) - A list of CEN Bandwidth Package Names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of CEN bandwidth package. Each element contains the following attributes:
	Packages []GetBandwidthPackagesPackage `pulumi:"packages"`
	// Status of the CEN Bandwidth Package in CEN instance, including `Idle` and `InUse`.
	Status *string `pulumi:"status"`
}

func GetBandwidthPackagesOutput(ctx *pulumi.Context, args GetBandwidthPackagesOutputArgs, opts ...pulumi.InvokeOption) GetBandwidthPackagesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetBandwidthPackagesResultOutput, error) {
			args := v.(GetBandwidthPackagesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:cen/getBandwidthPackages:getBandwidthPackages", args, GetBandwidthPackagesResultOutput{}, options).(GetBandwidthPackagesResultOutput), nil
		}).(GetBandwidthPackagesResultOutput)
}

// A collection of arguments for invoking getBandwidthPackages.
type GetBandwidthPackagesOutputArgs struct {
	// Limit search to a list of specific CEN Bandwidth Package IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// Indicates whether to include renewal data. Valid values: `true`: Return renewal data in the response. `false`: Do not return renewal data in the response.
	IncludeReservationData pulumi.BoolPtrInput `pulumi:"includeReservationData"`
	// ID of a CEN instance.
	InstanceId pulumi.StringPtrInput `pulumi:"instanceId"`
	// A regex string to filter CEN Bandwidth Package by name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Status of the CEN Bandwidth Package in CEN instance, Valid value: `Idle` and `InUse`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetBandwidthPackagesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBandwidthPackagesArgs)(nil)).Elem()
}

// A collection of values returned by getBandwidthPackages.
type GetBandwidthPackagesResultOutput struct{ *pulumi.OutputState }

func (GetBandwidthPackagesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBandwidthPackagesResult)(nil)).Elem()
}

func (o GetBandwidthPackagesResultOutput) ToGetBandwidthPackagesResultOutput() GetBandwidthPackagesResultOutput {
	return o
}

func (o GetBandwidthPackagesResultOutput) ToGetBandwidthPackagesResultOutputWithContext(ctx context.Context) GetBandwidthPackagesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetBandwidthPackagesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of specific CEN Bandwidth Package IDs.
func (o GetBandwidthPackagesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetBandwidthPackagesResultOutput) IncludeReservationData() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) *bool { return v.IncludeReservationData }).(pulumi.BoolPtrOutput)
}

// The ID of the CEN instance that are associated with the bandwidth package.
func (o GetBandwidthPackagesResultOutput) InstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) *string { return v.InstanceId }).(pulumi.StringPtrOutput)
}

func (o GetBandwidthPackagesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// (Available in 1.98.0+) - A list of CEN Bandwidth Package Names.
func (o GetBandwidthPackagesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetBandwidthPackagesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of CEN bandwidth package. Each element contains the following attributes:
func (o GetBandwidthPackagesResultOutput) Packages() GetBandwidthPackagesPackageArrayOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) []GetBandwidthPackagesPackage { return v.Packages }).(GetBandwidthPackagesPackageArrayOutput)
}

// Status of the CEN Bandwidth Package in CEN instance, including `Idle` and `InUse`.
func (o GetBandwidthPackagesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBandwidthPackagesResultOutput{})
}
