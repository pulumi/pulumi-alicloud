// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package adb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Adb DBCluster Lake Versions of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.190.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/adb"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := adb.GetZones(ctx, &adb.GetZonesArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetNetworks, err := vpc.GetNetworks(ctx, &vpc.GetNetworksArgs{
//				NameRegex: pulumi.StringRef("^default-NODELETING$"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetSwitches, err := vpc.GetSwitches(ctx, &vpc.GetSwitchesArgs{
//				VpcId:  pulumi.StringRef(defaultGetNetworks.Ids[0]),
//				ZoneId: pulumi.StringRef(_default.Ids[0]),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultDBClusterLakeVersion, err := adb.NewDBClusterLakeVersion(ctx, "default", &adb.DBClusterLakeVersionArgs{
//				DbClusterVersion:           pulumi.String("5.0"),
//				VpcId:                      pulumi.String(defaultGetNetworks.Ids[0]),
//				VswitchId:                  pulumi.String(defaultGetSwitches.Ids[0]),
//				ZoneId:                     pulumi.String(_default.Ids[0]),
//				ComputeResource:            pulumi.String("16ACU"),
//				StorageResource:            pulumi.String("0ACU"),
//				PaymentType:                pulumi.String("PayAsYouGo"),
//				EnableDefaultResourceGroup: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			ids := adb.GetDBClusterLakeVersionsOutput(ctx, adb.GetDBClusterLakeVersionsOutputArgs{
//				Ids: pulumi.StringArray{
//					defaultDBClusterLakeVersion.ID(),
//				},
//			}, nil)
//			ctx.Export("adbDbClusterLakeVersionId1", ids.ApplyT(func(ids adb.GetDBClusterLakeVersionsResult) (*string, error) {
//				return &ids.Versions[0].Id, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
func GetDBClusterLakeVersions(ctx *pulumi.Context, args *GetDBClusterLakeVersionsArgs, opts ...pulumi.InvokeOption) (*GetDBClusterLakeVersionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDBClusterLakeVersionsResult
	err := ctx.Invoke("alicloud:adb/getDBClusterLakeVersions:getDBClusterLakeVersions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDBClusterLakeVersions.
type GetDBClusterLakeVersionsArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of DBCluster IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource. Valid values: `Preparing`, `Creating`, `Restoring`, `Running`, `Deleting`, `ClassChanging`, `NetAddressCreating`, `NetAddressDeleting`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getDBClusterLakeVersions.
type GetDBClusterLakeVersionsResult struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	PageNumber *int     `pulumi:"pageNumber"`
	PageSize   *int     `pulumi:"pageSize"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// A list of Adb Db Clusters. Each element contains the following attributes:
	Versions []GetDBClusterLakeVersionsVersion `pulumi:"versions"`
}

func GetDBClusterLakeVersionsOutput(ctx *pulumi.Context, args GetDBClusterLakeVersionsOutputArgs, opts ...pulumi.InvokeOption) GetDBClusterLakeVersionsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetDBClusterLakeVersionsResultOutput, error) {
			args := v.(GetDBClusterLakeVersionsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:adb/getDBClusterLakeVersions:getDBClusterLakeVersions", args, GetDBClusterLakeVersionsResultOutput{}, options).(GetDBClusterLakeVersionsResultOutput), nil
		}).(GetDBClusterLakeVersionsResultOutput)
}

// A collection of arguments for invoking getDBClusterLakeVersions.
type GetDBClusterLakeVersionsOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of DBCluster IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// The status of the resource. Valid values: `Preparing`, `Creating`, `Restoring`, `Running`, `Deleting`, `ClassChanging`, `NetAddressCreating`, `NetAddressDeleting`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetDBClusterLakeVersionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDBClusterLakeVersionsArgs)(nil)).Elem()
}

// A collection of values returned by getDBClusterLakeVersions.
type GetDBClusterLakeVersionsResultOutput struct{ *pulumi.OutputState }

func (GetDBClusterLakeVersionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDBClusterLakeVersionsResult)(nil)).Elem()
}

func (o GetDBClusterLakeVersionsResultOutput) ToGetDBClusterLakeVersionsResultOutput() GetDBClusterLakeVersionsResultOutput {
	return o
}

func (o GetDBClusterLakeVersionsResultOutput) ToGetDBClusterLakeVersionsResultOutputWithContext(ctx context.Context) GetDBClusterLakeVersionsResultOutput {
	return o
}

func (o GetDBClusterLakeVersionsResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDBClusterLakeVersionsResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDBClusterLakeVersionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDBClusterLakeVersionsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDBClusterLakeVersionsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDBClusterLakeVersionsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDBClusterLakeVersionsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDBClusterLakeVersionsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetDBClusterLakeVersionsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetDBClusterLakeVersionsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetDBClusterLakeVersionsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetDBClusterLakeVersionsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

// The ID of the resource group.
func (o GetDBClusterLakeVersionsResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDBClusterLakeVersionsResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// The status of the resource.
func (o GetDBClusterLakeVersionsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDBClusterLakeVersionsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// A list of Adb Db Clusters. Each element contains the following attributes:
func (o GetDBClusterLakeVersionsResultOutput) Versions() GetDBClusterLakeVersionsVersionArrayOutput {
	return o.ApplyT(func(v GetDBClusterLakeVersionsResult) []GetDBClusterLakeVersionsVersion { return v.Versions }).(GetDBClusterLakeVersionsVersionArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDBClusterLakeVersionsResultOutput{})
}
