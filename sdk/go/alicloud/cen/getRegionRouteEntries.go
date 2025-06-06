// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides CEN Regional Route Entries available to the user.
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
//			entry, err := cen.GetRegionRouteEntries(ctx, &cen.GetRegionRouteEntriesArgs{
//				InstanceId: "cen-id1",
//				RegionId:   "cn-beijing",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstRegionRouteEntriesRouteEntryCidrBlock", entry.Entries[0].CidrBlock)
//			return nil
//		})
//	}
//
// ```
func GetRegionRouteEntries(ctx *pulumi.Context, args *GetRegionRouteEntriesArgs, opts ...pulumi.InvokeOption) (*GetRegionRouteEntriesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRegionRouteEntriesResult
	err := ctx.Invoke("alicloud:cen/getRegionRouteEntries:getRegionRouteEntries", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRegionRouteEntries.
type GetRegionRouteEntriesArgs struct {
	// ID of the CEN instance.
	InstanceId string  `pulumi:"instanceId"`
	OutputFile *string `pulumi:"outputFile"`
	// ID of the region.
	RegionId string `pulumi:"regionId"`
}

// A collection of values returned by getRegionRouteEntries.
type GetRegionRouteEntriesResult struct {
	// A list of CEN Route Entries. Each element contains the following attributes:
	Entries []GetRegionRouteEntriesEntry `pulumi:"entries"`
	// The provider-assigned unique ID for this managed resource.
	Id         string  `pulumi:"id"`
	InstanceId string  `pulumi:"instanceId"`
	OutputFile *string `pulumi:"outputFile"`
	RegionId   string  `pulumi:"regionId"`
}

func GetRegionRouteEntriesOutput(ctx *pulumi.Context, args GetRegionRouteEntriesOutputArgs, opts ...pulumi.InvokeOption) GetRegionRouteEntriesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetRegionRouteEntriesResultOutput, error) {
			args := v.(GetRegionRouteEntriesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:cen/getRegionRouteEntries:getRegionRouteEntries", args, GetRegionRouteEntriesResultOutput{}, options).(GetRegionRouteEntriesResultOutput), nil
		}).(GetRegionRouteEntriesResultOutput)
}

// A collection of arguments for invoking getRegionRouteEntries.
type GetRegionRouteEntriesOutputArgs struct {
	// ID of the CEN instance.
	InstanceId pulumi.StringInput    `pulumi:"instanceId"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// ID of the region.
	RegionId pulumi.StringInput `pulumi:"regionId"`
}

func (GetRegionRouteEntriesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegionRouteEntriesArgs)(nil)).Elem()
}

// A collection of values returned by getRegionRouteEntries.
type GetRegionRouteEntriesResultOutput struct{ *pulumi.OutputState }

func (GetRegionRouteEntriesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegionRouteEntriesResult)(nil)).Elem()
}

func (o GetRegionRouteEntriesResultOutput) ToGetRegionRouteEntriesResultOutput() GetRegionRouteEntriesResultOutput {
	return o
}

func (o GetRegionRouteEntriesResultOutput) ToGetRegionRouteEntriesResultOutputWithContext(ctx context.Context) GetRegionRouteEntriesResultOutput {
	return o
}

// A list of CEN Route Entries. Each element contains the following attributes:
func (o GetRegionRouteEntriesResultOutput) Entries() GetRegionRouteEntriesEntryArrayOutput {
	return o.ApplyT(func(v GetRegionRouteEntriesResult) []GetRegionRouteEntriesEntry { return v.Entries }).(GetRegionRouteEntriesEntryArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRegionRouteEntriesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionRouteEntriesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetRegionRouteEntriesResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionRouteEntriesResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

func (o GetRegionRouteEntriesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRegionRouteEntriesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetRegionRouteEntriesResultOutput) RegionId() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionRouteEntriesResult) string { return v.RegionId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRegionRouteEntriesResultOutput{})
}
