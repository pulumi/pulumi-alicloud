// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **DEPRECATED:** This datasource has been renamed to ecs.getEcsSnapshots from version 1.120.0.
//
// Use this data source to get a list of snapshot according to the specified filters in an Alibaba Cloud account.
//
// For information about snapshot and how to use it, see [Snapshot](https://www.alibabacloud.com/help/doc-detail/25460.html).
//
// > **NOTE:**  Available in 1.40.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ecs.GetSnapshots(ctx, &ecs.GetSnapshotsArgs{
//				Ids: []string{
//					"s-123456890abcdef",
//				},
//				NameRegex: pulumi.StringRef("tf-testAcc-snapshot"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Argument Reference
//
// The following arguments are supported:
//
// * `instanceId` - (Optional) The specified instance ID.
// * `diskId` - (Optional) The specified disk ID.
// * `encrypted` - (Optional) Queries the encrypted snapshots. Optional values: `true`: Encrypted snapshots. `false`: No encryption attribute limit. Default value: `false`.
// * `ids` - (Optional)  A list of snapshot IDs.
// * `nameRegex` - (Optional) A regex string to filter results by snapshot name.
// * `status` - (Optional) The specified snapshot status. Default value: `all`. Optional values:
//   - progressing: The snapshots are being created.
//   - accomplished: The snapshots are ready to use.
//   - failed: The snapshot creation failed.
//   - all: All status.
//
// * `type` - (Optional) The snapshot category. Default value: `all`. Optional values:
//   - auto: Auto snapshots.
//   - user: Manual snapshots.
//   - all: Auto and manual snapshots.
//
// * `sourceDiskType` - (Optional) The type of source disk:
//   - System: The snapshots are created for system disks.
//   - Data: The snapshots are created for data disks.
//
// * `usage` - (Optional) The usage of the snapshot:
//   - image: The snapshots are used to create custom images.
//   - disk: The snapshots are used to CreateDisk.
//   - mage_disk: The snapshots are used to create custom images and data disks.
//   - none: The snapshots are not used yet.
//
// * `tags` - (Optional) A map of tags assigned to snapshots.
// * `outputFile` - (Optional) The name of output file that saves the filter results.
func GetSnapshots(ctx *pulumi.Context, args *GetSnapshotsArgs, opts ...pulumi.InvokeOption) (*GetSnapshotsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSnapshotsResult
	err := ctx.Invoke("alicloud:ecs/getSnapshots:getSnapshots", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSnapshots.
type GetSnapshotsArgs struct {
	Category *string `pulumi:"category"`
	DryRun   *bool   `pulumi:"dryRun"`
	// Whether the snapshot is encrypted or not.
	Encrypted *bool `pulumi:"encrypted"`
	// A list of snapshot IDs.
	Ids             []string `pulumi:"ids"`
	KmsKeyId        *string  `pulumi:"kmsKeyId"`
	NameRegex       *string  `pulumi:"nameRegex"`
	OutputFile      *string  `pulumi:"outputFile"`
	ResourceGroupId *string  `pulumi:"resourceGroupId"`
	SnapshotLinkId  *string  `pulumi:"snapshotLinkId"`
	SnapshotName    *string  `pulumi:"snapshotName"`
	SnapshotType    *string  `pulumi:"snapshotType"`
	// Source disk attribute. Value range: `System`,`Data`.
	SourceDiskType *string `pulumi:"sourceDiskType"`
	// The snapshot status. Value range: `progressing`, `accomplished` and `failed`.
	Status *string `pulumi:"status"`
	// A map of tags assigned to the snapshot.
	Tags map[string]string `pulumi:"tags"`
	Type *string           `pulumi:"type"`
	// Whether the snapshots are used to create resources or not. Value range: `image`, `disk`, `imageDisk` and `none`.
	Usage *string `pulumi:"usage"`
}

// A collection of values returned by getSnapshots.
type GetSnapshotsResult struct {
	Category *string `pulumi:"category"`
	DryRun   *bool   `pulumi:"dryRun"`
	// Whether the snapshot is encrypted or not.
	Encrypted *bool `pulumi:"encrypted"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of snapshot IDs.
	Ids       []string `pulumi:"ids"`
	KmsKeyId  *string  `pulumi:"kmsKeyId"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of snapshots names.
	Names           []string `pulumi:"names"`
	OutputFile      *string  `pulumi:"outputFile"`
	ResourceGroupId *string  `pulumi:"resourceGroupId"`
	SnapshotLinkId  *string  `pulumi:"snapshotLinkId"`
	SnapshotName    *string  `pulumi:"snapshotName"`
	SnapshotType    *string  `pulumi:"snapshotType"`
	// A list of snapshots. Each element contains the following attributes:
	Snapshots []GetSnapshotsSnapshot `pulumi:"snapshots"`
	// Source disk attribute. Value range: `System`,`Data`.
	SourceDiskType *string `pulumi:"sourceDiskType"`
	// The snapshot status. Value range: `progressing`, `accomplished` and `failed`.
	Status *string `pulumi:"status"`
	// A map of tags assigned to the snapshot.
	Tags map[string]string `pulumi:"tags"`
	Type *string           `pulumi:"type"`
	// Whether the snapshots are used to create resources or not. Value range: `image`, `disk`, `imageDisk` and `none`.
	Usage *string `pulumi:"usage"`
}

func GetSnapshotsOutput(ctx *pulumi.Context, args GetSnapshotsOutputArgs, opts ...pulumi.InvokeOption) GetSnapshotsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSnapshotsResultOutput, error) {
			args := v.(GetSnapshotsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:ecs/getSnapshots:getSnapshots", args, GetSnapshotsResultOutput{}, options).(GetSnapshotsResultOutput), nil
		}).(GetSnapshotsResultOutput)
}

// A collection of arguments for invoking getSnapshots.
type GetSnapshotsOutputArgs struct {
	Category pulumi.StringPtrInput `pulumi:"category"`
	DryRun   pulumi.BoolPtrInput   `pulumi:"dryRun"`
	// Whether the snapshot is encrypted or not.
	Encrypted pulumi.BoolPtrInput `pulumi:"encrypted"`
	// A list of snapshot IDs.
	Ids             pulumi.StringArrayInput `pulumi:"ids"`
	KmsKeyId        pulumi.StringPtrInput   `pulumi:"kmsKeyId"`
	NameRegex       pulumi.StringPtrInput   `pulumi:"nameRegex"`
	OutputFile      pulumi.StringPtrInput   `pulumi:"outputFile"`
	ResourceGroupId pulumi.StringPtrInput   `pulumi:"resourceGroupId"`
	SnapshotLinkId  pulumi.StringPtrInput   `pulumi:"snapshotLinkId"`
	SnapshotName    pulumi.StringPtrInput   `pulumi:"snapshotName"`
	SnapshotType    pulumi.StringPtrInput   `pulumi:"snapshotType"`
	// Source disk attribute. Value range: `System`,`Data`.
	SourceDiskType pulumi.StringPtrInput `pulumi:"sourceDiskType"`
	// The snapshot status. Value range: `progressing`, `accomplished` and `failed`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// A map of tags assigned to the snapshot.
	Tags pulumi.StringMapInput `pulumi:"tags"`
	Type pulumi.StringPtrInput `pulumi:"type"`
	// Whether the snapshots are used to create resources or not. Value range: `image`, `disk`, `imageDisk` and `none`.
	Usage pulumi.StringPtrInput `pulumi:"usage"`
}

func (GetSnapshotsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotsArgs)(nil)).Elem()
}

// A collection of values returned by getSnapshots.
type GetSnapshotsResultOutput struct{ *pulumi.OutputState }

func (GetSnapshotsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotsResult)(nil)).Elem()
}

func (o GetSnapshotsResultOutput) ToGetSnapshotsResultOutput() GetSnapshotsResultOutput {
	return o
}

func (o GetSnapshotsResultOutput) ToGetSnapshotsResultOutputWithContext(ctx context.Context) GetSnapshotsResultOutput {
	return o
}

func (o GetSnapshotsResultOutput) Category() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.Category }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *bool { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// Whether the snapshot is encrypted or not.
func (o GetSnapshotsResultOutput) Encrypted() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *bool { return v.Encrypted }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSnapshotsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of snapshot IDs.
func (o GetSnapshotsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSnapshotsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSnapshotsResultOutput) KmsKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.KmsKeyId }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of snapshots names.
func (o GetSnapshotsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSnapshotsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetSnapshotsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) SnapshotLinkId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.SnapshotLinkId }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) SnapshotName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.SnapshotName }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) SnapshotType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.SnapshotType }).(pulumi.StringPtrOutput)
}

// A list of snapshots. Each element contains the following attributes:
func (o GetSnapshotsResultOutput) Snapshots() GetSnapshotsSnapshotArrayOutput {
	return o.ApplyT(func(v GetSnapshotsResult) []GetSnapshotsSnapshot { return v.Snapshots }).(GetSnapshotsSnapshotArrayOutput)
}

// Source disk attribute. Value range: `System`,`Data`.
func (o GetSnapshotsResultOutput) SourceDiskType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.SourceDiskType }).(pulumi.StringPtrOutput)
}

// The snapshot status. Value range: `progressing`, `accomplished` and `failed`.
func (o GetSnapshotsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// A map of tags assigned to the snapshot.
func (o GetSnapshotsResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetSnapshotsResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func (o GetSnapshotsResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

// Whether the snapshots are used to create resources or not. Value range: `image`, `disk`, `imageDisk` and `none`.
func (o GetSnapshotsResultOutput) Usage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.Usage }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSnapshotsResultOutput{})
}
