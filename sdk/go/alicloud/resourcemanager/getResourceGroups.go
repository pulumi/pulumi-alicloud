// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides resource groups of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.84.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := resourcemanager.GetResourceGroups(ctx, &resourcemanager.GetResourceGroupsArgs{
//				NameRegex: pulumi.StringRef("tf"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstResourceGroupId", example.Groups[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetResourceGroups(ctx *pulumi.Context, args *GetResourceGroupsArgs, opts ...pulumi.InvokeOption) (*GetResourceGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetResourceGroupsResult
	err := ctx.Invoke("alicloud:resourcemanager/getResourceGroups:getResourceGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getResourceGroups.
type GetResourceGroupsArgs struct {
	// Set it to true can output more details. Default value: `false`.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of resource group IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by resource group identifier.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the resource group. Valid values: `Creating`, `Deleted`, `Deleting`, `OK` and `PendingDelete`. **NOTE:** From version 1.114.0, `status` can be set to `Deleting`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getResourceGroups.
type GetResourceGroupsResult struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of resource groups. Each element contains the following attributes:
	Groups []GetResourceGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of resource group IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of resource group identifiers.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the regional resource group.
	Status *string `pulumi:"status"`
}

func GetResourceGroupsOutput(ctx *pulumi.Context, args GetResourceGroupsOutputArgs, opts ...pulumi.InvokeOption) GetResourceGroupsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetResourceGroupsResultOutput, error) {
			args := v.(GetResourceGroupsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:resourcemanager/getResourceGroups:getResourceGroups", args, GetResourceGroupsResultOutput{}, options).(GetResourceGroupsResultOutput), nil
		}).(GetResourceGroupsResultOutput)
}

// A collection of arguments for invoking getResourceGroups.
type GetResourceGroupsOutputArgs struct {
	// Set it to true can output more details. Default value: `false`.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of resource group IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by resource group identifier.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the resource group. Valid values: `Creating`, `Deleted`, `Deleting`, `OK` and `PendingDelete`. **NOTE:** From version 1.114.0, `status` can be set to `Deleting`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetResourceGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourceGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getResourceGroups.
type GetResourceGroupsResultOutput struct{ *pulumi.OutputState }

func (GetResourceGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourceGroupsResult)(nil)).Elem()
}

func (o GetResourceGroupsResultOutput) ToGetResourceGroupsResultOutput() GetResourceGroupsResultOutput {
	return o
}

func (o GetResourceGroupsResultOutput) ToGetResourceGroupsResultOutputWithContext(ctx context.Context) GetResourceGroupsResultOutput {
	return o
}

func (o GetResourceGroupsResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetResourceGroupsResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// A list of resource groups. Each element contains the following attributes:
func (o GetResourceGroupsResultOutput) Groups() GetResourceGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetResourceGroupsResult) []GetResourceGroupsGroup { return v.Groups }).(GetResourceGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetResourceGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetResourceGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of resource group IDs.
func (o GetResourceGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetResourceGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetResourceGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetResourceGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of resource group identifiers.
func (o GetResourceGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetResourceGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetResourceGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetResourceGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The status of the regional resource group.
func (o GetResourceGroupsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetResourceGroupsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetResourceGroupsResultOutput{})
}
