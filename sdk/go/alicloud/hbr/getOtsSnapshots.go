// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Hbr Ots Snapshots of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.164.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/hbr"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := hbr.GetOtsSnapshots(ctx, &hbr.GetOtsSnapshotsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetOtsSnapshots(ctx *pulumi.Context, args *GetOtsSnapshotsArgs, opts ...pulumi.InvokeOption) (*GetOtsSnapshotsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetOtsSnapshotsResult
	err := ctx.Invoke("alicloud:hbr/getOtsSnapshots:getOtsSnapshots", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOtsSnapshots.
type GetOtsSnapshotsArgs struct {
	// The end time of the backup. This value must be a UNIX timestamp. Unit: milliseconds
	EndTime *string  `pulumi:"endTime"`
	Ids     []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The start time of the backup. This value must be a UNIX timestamp. Unit: milliseconds.
	StartTime *string `pulumi:"startTime"`
}

// A collection of values returned by getOtsSnapshots.
type GetOtsSnapshotsResult struct {
	EndTime *string `pulumi:"endTime"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                    `pulumi:"id"`
	Ids        []string                  `pulumi:"ids"`
	OutputFile *string                   `pulumi:"outputFile"`
	Snapshots  []GetOtsSnapshotsSnapshot `pulumi:"snapshots"`
	StartTime  *string                   `pulumi:"startTime"`
}

func GetOtsSnapshotsOutput(ctx *pulumi.Context, args GetOtsSnapshotsOutputArgs, opts ...pulumi.InvokeOption) GetOtsSnapshotsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetOtsSnapshotsResultOutput, error) {
			args := v.(GetOtsSnapshotsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:hbr/getOtsSnapshots:getOtsSnapshots", args, GetOtsSnapshotsResultOutput{}, options).(GetOtsSnapshotsResultOutput), nil
		}).(GetOtsSnapshotsResultOutput)
}

// A collection of arguments for invoking getOtsSnapshots.
type GetOtsSnapshotsOutputArgs struct {
	// The end time of the backup. This value must be a UNIX timestamp. Unit: milliseconds
	EndTime pulumi.StringPtrInput   `pulumi:"endTime"`
	Ids     pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The start time of the backup. This value must be a UNIX timestamp. Unit: milliseconds.
	StartTime pulumi.StringPtrInput `pulumi:"startTime"`
}

func (GetOtsSnapshotsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOtsSnapshotsArgs)(nil)).Elem()
}

// A collection of values returned by getOtsSnapshots.
type GetOtsSnapshotsResultOutput struct{ *pulumi.OutputState }

func (GetOtsSnapshotsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOtsSnapshotsResult)(nil)).Elem()
}

func (o GetOtsSnapshotsResultOutput) ToGetOtsSnapshotsResultOutput() GetOtsSnapshotsResultOutput {
	return o
}

func (o GetOtsSnapshotsResultOutput) ToGetOtsSnapshotsResultOutputWithContext(ctx context.Context) GetOtsSnapshotsResultOutput {
	return o
}

func (o GetOtsSnapshotsResultOutput) EndTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetOtsSnapshotsResult) *string { return v.EndTime }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetOtsSnapshotsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetOtsSnapshotsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetOtsSnapshotsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetOtsSnapshotsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetOtsSnapshotsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetOtsSnapshotsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetOtsSnapshotsResultOutput) Snapshots() GetOtsSnapshotsSnapshotArrayOutput {
	return o.ApplyT(func(v GetOtsSnapshotsResult) []GetOtsSnapshotsSnapshot { return v.Snapshots }).(GetOtsSnapshotsSnapshotArrayOutput)
}

func (o GetOtsSnapshotsResultOutput) StartTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetOtsSnapshotsResult) *string { return v.StartTime }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetOtsSnapshotsResultOutput{})
}
