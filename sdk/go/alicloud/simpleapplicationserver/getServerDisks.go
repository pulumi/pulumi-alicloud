// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package simpleapplicationserver

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Simple Application Server Disks of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.143.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/simpleapplicationserver"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		ids, err := simpleapplicationserver.GetServerDisks(ctx, &simpleapplicationserver.GetServerDisksArgs{
// 			Ids: []string{
// 				"example_id",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("simpleApplicationServerDiskId1", ids.Disks[0].Id)
// 		opt0 := "^my-Disk"
// 		nameRegex, err := simpleapplicationserver.GetServerDisks(ctx, &simpleapplicationserver.GetServerDisksArgs{
// 			NameRegex: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("simpleApplicationServerDiskId2", nameRegex.Disks[0].Id)
// 		opt1 := "In_use"
// 		status, err := simpleapplicationserver.GetServerDisks(ctx, &simpleapplicationserver.GetServerDisksArgs{
// 			Status: &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("simpleApplicationServerDiskId3", status.Disks[0].Id)
// 		opt2 := "example_value"
// 		instanceId, err := simpleapplicationserver.GetServerDisks(ctx, &simpleapplicationserver.GetServerDisksArgs{
// 			InstanceId: &opt2,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("simpleApplicationServerDiskId4", instanceId.Disks[0].Id)
// 		opt3 := "System"
// 		diskType, err := simpleapplicationserver.GetServerDisks(ctx, &simpleapplicationserver.GetServerDisksArgs{
// 			DiskType: &opt3,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("simpleApplicationServerDiskId5", diskType.Disks[0].Id)
// 		return nil
// 	})
// }
// ```
func GetServerDisks(ctx *pulumi.Context, args *GetServerDisksArgs, opts ...pulumi.InvokeOption) (*GetServerDisksResult, error) {
	var rv GetServerDisksResult
	err := ctx.Invoke("alicloud:simpleapplicationserver/getServerDisks:getServerDisks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServerDisks.
type GetServerDisksArgs struct {
	// The type of the disk. Possible values: `System`, `Data`.
	DiskType *string `pulumi:"diskType"`
	// A list of Disk IDs.
	Ids []string `pulumi:"ids"`
	// Alibaba Cloud simple application server instance ID.
	InstanceId *string `pulumi:"instanceId"`
	// A regex string to filter results by Disk name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The status of the disk. Valid values: `ReIniting`, `Creating`, `In_Use`, `Available`, `Attaching`, `Detaching`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getServerDisks.
type GetServerDisksResult struct {
	DiskType *string              `pulumi:"diskType"`
	Disks    []GetServerDisksDisk `pulumi:"disks"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	InstanceId *string  `pulumi:"instanceId"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	Status     *string  `pulumi:"status"`
}

func GetServerDisksOutput(ctx *pulumi.Context, args GetServerDisksOutputArgs, opts ...pulumi.InvokeOption) GetServerDisksResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServerDisksResult, error) {
			args := v.(GetServerDisksArgs)
			r, err := GetServerDisks(ctx, &args, opts...)
			return *r, err
		}).(GetServerDisksResultOutput)
}

// A collection of arguments for invoking getServerDisks.
type GetServerDisksOutputArgs struct {
	// The type of the disk. Possible values: `System`, `Data`.
	DiskType pulumi.StringPtrInput `pulumi:"diskType"`
	// A list of Disk IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// Alibaba Cloud simple application server instance ID.
	InstanceId pulumi.StringPtrInput `pulumi:"instanceId"`
	// A regex string to filter results by Disk name.
	NameRegex  pulumi.StringPtrInput `pulumi:"nameRegex"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the disk. Valid values: `ReIniting`, `Creating`, `In_Use`, `Available`, `Attaching`, `Detaching`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetServerDisksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerDisksArgs)(nil)).Elem()
}

// A collection of values returned by getServerDisks.
type GetServerDisksResultOutput struct{ *pulumi.OutputState }

func (GetServerDisksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerDisksResult)(nil)).Elem()
}

func (o GetServerDisksResultOutput) ToGetServerDisksResultOutput() GetServerDisksResultOutput {
	return o
}

func (o GetServerDisksResultOutput) ToGetServerDisksResultOutputWithContext(ctx context.Context) GetServerDisksResultOutput {
	return o
}

func (o GetServerDisksResultOutput) DiskType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerDisksResult) *string { return v.DiskType }).(pulumi.StringPtrOutput)
}

func (o GetServerDisksResultOutput) Disks() GetServerDisksDiskArrayOutput {
	return o.ApplyT(func(v GetServerDisksResult) []GetServerDisksDisk { return v.Disks }).(GetServerDisksDiskArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServerDisksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServerDisksResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServerDisksResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServerDisksResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetServerDisksResultOutput) InstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerDisksResult) *string { return v.InstanceId }).(pulumi.StringPtrOutput)
}

func (o GetServerDisksResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerDisksResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetServerDisksResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServerDisksResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetServerDisksResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerDisksResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetServerDisksResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerDisksResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServerDisksResultOutput{})
}