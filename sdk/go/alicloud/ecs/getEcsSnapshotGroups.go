// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Ecs Snapshot Groups of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.160.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := ecs.GetEcsSnapshotGroups(ctx, &ecs.GetEcsSnapshotGroupsArgs{
//				Ids: []string{
//					"example-id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("ecsSnapshotGroupId1", ids.Groups[0].Id)
//			nameRegex, err := ecs.GetEcsSnapshotGroups(ctx, &ecs.GetEcsSnapshotGroupsArgs{
//				NameRegex: pulumi.StringRef("^my-SnapshotGroup"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("ecsSnapshotGroupId2", nameRegex.Groups[0].Id)
//			status, err := ecs.GetEcsSnapshotGroups(ctx, &ecs.GetEcsSnapshotGroupsArgs{
//				Status: pulumi.StringRef("accomplished"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("ecsSnapshotGroupId3", status.Groups[0].Id)
//			instanceId, err := ecs.GetEcsSnapshotGroups(ctx, &ecs.GetEcsSnapshotGroupsArgs{
//				InstanceId: pulumi.StringRef("example-instance_id"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("ecsSnapshotGroupId4", instanceId.Groups[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetEcsSnapshotGroups(ctx *pulumi.Context, args *GetEcsSnapshotGroupsArgs, opts ...pulumi.InvokeOption) (*GetEcsSnapshotGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEcsSnapshotGroupsResult
	err := ctx.Invoke("alicloud:ecs/getEcsSnapshotGroups:getEcsSnapshotGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEcsSnapshotGroups.
type GetEcsSnapshotGroupsArgs struct {
	// A list of Snapshot Group IDs.
	Ids []string `pulumi:"ids"`
	// The ID of the instance.
	InstanceId *string `pulumi:"instanceId"`
	// A regex string to filter results by Snapshot Group name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The name of the snapshot-consistent group.
	SnapshotGroupName *string `pulumi:"snapshotGroupName"`
	// The state of snapshot-consistent group. Valid Values: `accomplished`, `failed` and `progressing`.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the snapshot group.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getEcsSnapshotGroups.
type GetEcsSnapshotGroupsResult struct {
	Groups []GetEcsSnapshotGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id                string            `pulumi:"id"`
	Ids               []string          `pulumi:"ids"`
	InstanceId        *string           `pulumi:"instanceId"`
	NameRegex         *string           `pulumi:"nameRegex"`
	Names             []string          `pulumi:"names"`
	OutputFile        *string           `pulumi:"outputFile"`
	SnapshotGroupName *string           `pulumi:"snapshotGroupName"`
	Status            *string           `pulumi:"status"`
	Tags              map[string]string `pulumi:"tags"`
}

func GetEcsSnapshotGroupsOutput(ctx *pulumi.Context, args GetEcsSnapshotGroupsOutputArgs, opts ...pulumi.InvokeOption) GetEcsSnapshotGroupsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetEcsSnapshotGroupsResultOutput, error) {
			args := v.(GetEcsSnapshotGroupsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:ecs/getEcsSnapshotGroups:getEcsSnapshotGroups", args, GetEcsSnapshotGroupsResultOutput{}, options).(GetEcsSnapshotGroupsResultOutput), nil
		}).(GetEcsSnapshotGroupsResultOutput)
}

// A collection of arguments for invoking getEcsSnapshotGroups.
type GetEcsSnapshotGroupsOutputArgs struct {
	// A list of Snapshot Group IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The ID of the instance.
	InstanceId pulumi.StringPtrInput `pulumi:"instanceId"`
	// A regex string to filter results by Snapshot Group name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The name of the snapshot-consistent group.
	SnapshotGroupName pulumi.StringPtrInput `pulumi:"snapshotGroupName"`
	// The state of snapshot-consistent group. Valid Values: `accomplished`, `failed` and `progressing`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// A mapping of tags to assign to the snapshot group.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (GetEcsSnapshotGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEcsSnapshotGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getEcsSnapshotGroups.
type GetEcsSnapshotGroupsResultOutput struct{ *pulumi.OutputState }

func (GetEcsSnapshotGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEcsSnapshotGroupsResult)(nil)).Elem()
}

func (o GetEcsSnapshotGroupsResultOutput) ToGetEcsSnapshotGroupsResultOutput() GetEcsSnapshotGroupsResultOutput {
	return o
}

func (o GetEcsSnapshotGroupsResultOutput) ToGetEcsSnapshotGroupsResultOutputWithContext(ctx context.Context) GetEcsSnapshotGroupsResultOutput {
	return o
}

func (o GetEcsSnapshotGroupsResultOutput) Groups() GetEcsSnapshotGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetEcsSnapshotGroupsResult) []GetEcsSnapshotGroupsGroup { return v.Groups }).(GetEcsSnapshotGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEcsSnapshotGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEcsSnapshotGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetEcsSnapshotGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEcsSnapshotGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetEcsSnapshotGroupsResultOutput) InstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEcsSnapshotGroupsResult) *string { return v.InstanceId }).(pulumi.StringPtrOutput)
}

func (o GetEcsSnapshotGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEcsSnapshotGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetEcsSnapshotGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEcsSnapshotGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetEcsSnapshotGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEcsSnapshotGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetEcsSnapshotGroupsResultOutput) SnapshotGroupName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEcsSnapshotGroupsResult) *string { return v.SnapshotGroupName }).(pulumi.StringPtrOutput)
}

func (o GetEcsSnapshotGroupsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEcsSnapshotGroupsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetEcsSnapshotGroupsResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetEcsSnapshotGroupsResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEcsSnapshotGroupsResultOutput{})
}
