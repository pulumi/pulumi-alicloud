// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides availability zones for RDS that can be accessed by an Alibaba Cloud account within the region configured in the provider.
//
// > **NOTE:** Available since v1.73.0.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/rds"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rds.GetZones(ctx, &rds.GetZonesArgs{
//				Engine:                pulumi.StringRef("MySQL"),
//				EngineVersion:         pulumi.StringRef("8.0"),
//				InstanceChargeType:    pulumi.StringRef("PostPaid"),
//				Category:              pulumi.StringRef("Basic"),
//				DbInstanceStorageType: pulumi.StringRef("cloud_essd"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetZones(ctx *pulumi.Context, args *GetZonesArgs, opts ...pulumi.InvokeOption) (*GetZonesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetZonesResult
	err := ctx.Invoke("alicloud:rds/getZones:getZones", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZones.
type GetZonesArgs struct {
	// DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`, `serverlessBasic`, `serverlessStandard`, `serverlessHa`, `cluster`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
	Category *string `pulumi:"category"`
	// The DB instance storage space required by the user. Valid values: "cloudSsd", "localSsd", "cloudEssd", "cloudEssd2", "cloudEssd3".
	DbInstanceStorageType *string `pulumi:"dbInstanceStorageType"`
	// Database type. Valid values: "MySQL", "SQLServer", "PostgreSQL", "MariaDB". If not set, it will match all of engines.
	Engine *string `pulumi:"engine"`
	// Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
	EngineVersion *string `pulumi:"engineVersion"`
	// Filter the results by a specific instance charge type. Valid values: `PrePaid` and `PostPaid` and `Serverless`. Default to `PostPaid`.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// It has been deprecated from version 1.137.0 and using `multiZone` instead.
	//
	// Deprecated: It has been deprecated from version 1.137.0 and using `multiZone` instead.
	Multi *bool `pulumi:"multi"`
	// Indicate whether the zones can be used in a multi AZ configuration. Default to `false`. Multi AZ is usually used to launch RDS instances.
	MultiZone *bool `pulumi:"multiZone"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getZones.
type GetZonesResult struct {
	Category              *string `pulumi:"category"`
	DbInstanceStorageType *string `pulumi:"dbInstanceStorageType"`
	Engine                *string `pulumi:"engine"`
	EngineVersion         *string `pulumi:"engineVersion"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of zone IDs.
	Ids                []string `pulumi:"ids"`
	InstanceChargeType *string  `pulumi:"instanceChargeType"`
	// Deprecated: It has been deprecated from version 1.137.0 and using `multiZone` instead.
	Multi      *bool   `pulumi:"multi"`
	MultiZone  *bool   `pulumi:"multiZone"`
	OutputFile *string `pulumi:"outputFile"`
	// A list of availability zones. Each element contains the following attributes:
	Zones []GetZonesZone `pulumi:"zones"`
}

func GetZonesOutput(ctx *pulumi.Context, args GetZonesOutputArgs, opts ...pulumi.InvokeOption) GetZonesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetZonesResultOutput, error) {
			args := v.(GetZonesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:rds/getZones:getZones", args, GetZonesResultOutput{}, options).(GetZonesResultOutput), nil
		}).(GetZonesResultOutput)
}

// A collection of arguments for invoking getZones.
type GetZonesOutputArgs struct {
	// DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`, `serverlessBasic`, `serverlessStandard`, `serverlessHa`, `cluster`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
	Category pulumi.StringPtrInput `pulumi:"category"`
	// The DB instance storage space required by the user. Valid values: "cloudSsd", "localSsd", "cloudEssd", "cloudEssd2", "cloudEssd3".
	DbInstanceStorageType pulumi.StringPtrInput `pulumi:"dbInstanceStorageType"`
	// Database type. Valid values: "MySQL", "SQLServer", "PostgreSQL", "MariaDB". If not set, it will match all of engines.
	Engine pulumi.StringPtrInput `pulumi:"engine"`
	// Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
	EngineVersion pulumi.StringPtrInput `pulumi:"engineVersion"`
	// Filter the results by a specific instance charge type. Valid values: `PrePaid` and `PostPaid` and `Serverless`. Default to `PostPaid`.
	InstanceChargeType pulumi.StringPtrInput `pulumi:"instanceChargeType"`
	// It has been deprecated from version 1.137.0 and using `multiZone` instead.
	//
	// Deprecated: It has been deprecated from version 1.137.0 and using `multiZone` instead.
	Multi pulumi.BoolPtrInput `pulumi:"multi"`
	// Indicate whether the zones can be used in a multi AZ configuration. Default to `false`. Multi AZ is usually used to launch RDS instances.
	MultiZone pulumi.BoolPtrInput `pulumi:"multiZone"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetZonesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesArgs)(nil)).Elem()
}

// A collection of values returned by getZones.
type GetZonesResultOutput struct{ *pulumi.OutputState }

func (GetZonesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesResult)(nil)).Elem()
}

func (o GetZonesResultOutput) ToGetZonesResultOutput() GetZonesResultOutput {
	return o
}

func (o GetZonesResultOutput) ToGetZonesResultOutputWithContext(ctx context.Context) GetZonesResultOutput {
	return o
}

func (o GetZonesResultOutput) Category() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *string { return v.Category }).(pulumi.StringPtrOutput)
}

func (o GetZonesResultOutput) DbInstanceStorageType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *string { return v.DbInstanceStorageType }).(pulumi.StringPtrOutput)
}

func (o GetZonesResultOutput) Engine() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *string { return v.Engine }).(pulumi.StringPtrOutput)
}

func (o GetZonesResultOutput) EngineVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *string { return v.EngineVersion }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetZonesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of zone IDs.
func (o GetZonesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetZonesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetZonesResultOutput) InstanceChargeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *string { return v.InstanceChargeType }).(pulumi.StringPtrOutput)
}

// Deprecated: It has been deprecated from version 1.137.0 and using `multiZone` instead.
func (o GetZonesResultOutput) Multi() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *bool { return v.Multi }).(pulumi.BoolPtrOutput)
}

func (o GetZonesResultOutput) MultiZone() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *bool { return v.MultiZone }).(pulumi.BoolPtrOutput)
}

func (o GetZonesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of availability zones. Each element contains the following attributes:
func (o GetZonesResultOutput) Zones() GetZonesZoneArrayOutput {
	return o.ApplyT(func(v GetZonesResult) []GetZonesZone { return v.Zones }).(GetZonesZoneArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetZonesResultOutput{})
}
