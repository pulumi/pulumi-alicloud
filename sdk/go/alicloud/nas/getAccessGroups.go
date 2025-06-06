// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides user-available access groups. Use when you can create mount points
//
// > NOTE: Available in 1.35.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/nas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := nas.GetAccessGroups(ctx, &nas.GetAccessGroupsArgs{
//				NameRegex:       pulumi.StringRef("^foo"),
//				AccessGroupType: pulumi.StringRef("Classic"),
//				Description:     pulumi.StringRef("tf-testAccAccessGroupsdatasource"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("alicloudNasAccessGroupsId", example.Groups[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetAccessGroups(ctx *pulumi.Context, args *GetAccessGroupsArgs, opts ...pulumi.InvokeOption) (*GetAccessGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAccessGroupsResult
	err := ctx.Invoke("alicloud:nas/getAccessGroups:getAccessGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccessGroups.
type GetAccessGroupsArgs struct {
	// The name of access group.
	AccessGroupName *string `pulumi:"accessGroupName"`
	// Filter results by a specific AccessGroupType.
	AccessGroupType *string `pulumi:"accessGroupType"`
	// Filter results by a specific Description.
	Description *string `pulumi:"description"`
	// The type of file system. Valid values: `standard` and `extreme`. Default to `standard`.
	FileSystemType *string `pulumi:"fileSystemType"`
	// A regex string to filter AccessGroups by name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Field `type` has been deprecated from version 1.95.0. Use `accessGroupType` instead.
	//
	// Deprecated: Field 'type' has been deprecated from provider version 1.95.0. New field 'access_group_type' replaces it.
	Type *string `pulumi:"type"`
	// Specifies whether the time to return is in UTC. Valid values: true and false.
	UseutcDateTime *bool `pulumi:"useutcDateTime"`
}

// A collection of values returned by getAccessGroups.
type GetAccessGroupsResult struct {
	// (Available in 1.95.0+) The name of the AccessGroup.
	AccessGroupName *string `pulumi:"accessGroupName"`
	// (Available in 1.95.0+) The type of the AccessGroup.
	AccessGroupType *string `pulumi:"accessGroupType"`
	// Description of the AccessGroup.
	Description    *string `pulumi:"description"`
	FileSystemType *string `pulumi:"fileSystemType"`
	// A list of AccessGroups. Each element contains the following attributes:
	Groups []GetAccessGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of AccessGroup IDs, the value is set to `names`. After version 1.95.0 the item value as `<access_group_id>:<file_system_type>`.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of AccessGroup names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// (Deprecated in v1.95.0+) AccessGroupType of the AccessGroup. The Field replace by `accessGroupType` after version 1.95.0.
	//
	// Deprecated: Field 'type' has been deprecated from provider version 1.95.0. New field 'access_group_type' replaces it.
	Type           *string `pulumi:"type"`
	UseutcDateTime *bool   `pulumi:"useutcDateTime"`
}

func GetAccessGroupsOutput(ctx *pulumi.Context, args GetAccessGroupsOutputArgs, opts ...pulumi.InvokeOption) GetAccessGroupsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetAccessGroupsResultOutput, error) {
			args := v.(GetAccessGroupsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:nas/getAccessGroups:getAccessGroups", args, GetAccessGroupsResultOutput{}, options).(GetAccessGroupsResultOutput), nil
		}).(GetAccessGroupsResultOutput)
}

// A collection of arguments for invoking getAccessGroups.
type GetAccessGroupsOutputArgs struct {
	// The name of access group.
	AccessGroupName pulumi.StringPtrInput `pulumi:"accessGroupName"`
	// Filter results by a specific AccessGroupType.
	AccessGroupType pulumi.StringPtrInput `pulumi:"accessGroupType"`
	// Filter results by a specific Description.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// The type of file system. Valid values: `standard` and `extreme`. Default to `standard`.
	FileSystemType pulumi.StringPtrInput `pulumi:"fileSystemType"`
	// A regex string to filter AccessGroups by name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Field `type` has been deprecated from version 1.95.0. Use `accessGroupType` instead.
	//
	// Deprecated: Field 'type' has been deprecated from provider version 1.95.0. New field 'access_group_type' replaces it.
	Type pulumi.StringPtrInput `pulumi:"type"`
	// Specifies whether the time to return is in UTC. Valid values: true and false.
	UseutcDateTime pulumi.BoolPtrInput `pulumi:"useutcDateTime"`
}

func (GetAccessGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccessGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getAccessGroups.
type GetAccessGroupsResultOutput struct{ *pulumi.OutputState }

func (GetAccessGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccessGroupsResult)(nil)).Elem()
}

func (o GetAccessGroupsResultOutput) ToGetAccessGroupsResultOutput() GetAccessGroupsResultOutput {
	return o
}

func (o GetAccessGroupsResultOutput) ToGetAccessGroupsResultOutputWithContext(ctx context.Context) GetAccessGroupsResultOutput {
	return o
}

// (Available in 1.95.0+) The name of the AccessGroup.
func (o GetAccessGroupsResultOutput) AccessGroupName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccessGroupsResult) *string { return v.AccessGroupName }).(pulumi.StringPtrOutput)
}

// (Available in 1.95.0+) The type of the AccessGroup.
func (o GetAccessGroupsResultOutput) AccessGroupType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccessGroupsResult) *string { return v.AccessGroupType }).(pulumi.StringPtrOutput)
}

// Description of the AccessGroup.
func (o GetAccessGroupsResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccessGroupsResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

func (o GetAccessGroupsResultOutput) FileSystemType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccessGroupsResult) *string { return v.FileSystemType }).(pulumi.StringPtrOutput)
}

// A list of AccessGroups. Each element contains the following attributes:
func (o GetAccessGroupsResultOutput) Groups() GetAccessGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetAccessGroupsResult) []GetAccessGroupsGroup { return v.Groups }).(GetAccessGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAccessGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of AccessGroup IDs, the value is set to `names`. After version 1.95.0 the item value as `<access_group_id>:<file_system_type>`.
func (o GetAccessGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAccessGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetAccessGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccessGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of AccessGroup names.
func (o GetAccessGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAccessGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetAccessGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccessGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// (Deprecated in v1.95.0+) AccessGroupType of the AccessGroup. The Field replace by `accessGroupType` after version 1.95.0.
//
// Deprecated: Field 'type' has been deprecated from provider version 1.95.0. New field 'access_group_type' replaces it.
func (o GetAccessGroupsResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccessGroupsResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func (o GetAccessGroupsResultOutput) UseutcDateTime() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetAccessGroupsResult) *bool { return v.UseutcDateTime }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccessGroupsResultOutput{})
}
