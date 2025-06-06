// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a RDS Custom Disk resource.
//
// RDS User dedicated host disk.
//
// For information about RDS Custom Disk and how to use it, see [What is Custom Disk](https://next.api.alibabacloud.com/document/Rds/2014-08-15/CreateRCDisk).
//
// > **NOTE:** Available since v1.247.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/rds"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			regionId := "cn-beijing"
//			if param := cfg.Get("regionId"); param != "" {
//				regionId = param
//			}
//			_, err := rds.NewCustomDisk(ctx, "default", &rds.CustomDiskArgs{
//				Description:        pulumi.String("zcc测试用例"),
//				ZoneId:             pulumi.String("cn-beijing-i"),
//				Size:               pulumi.Int(40),
//				PerformanceLevel:   pulumi.String("PL1"),
//				InstanceChargeType: pulumi.String("Postpaid"),
//				DiskCategory:       pulumi.String("cloud_essd"),
//				DiskName:           pulumi.String("custom_disk_001"),
//				AutoRenew:          pulumi.Bool(false),
//				Period:             pulumi.Int(1),
//				AutoPay:            pulumi.Bool(true),
//				PeriodUnit:         pulumi.String("1"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// RDS Custom Disk can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:rds/customDisk:CustomDisk example <id>
// ```
type CustomDisk struct {
	pulumi.CustomResourceState

	// Whether to pay automatically. Value range:
	AutoPay pulumi.BoolPtrOutput `pulumi:"autoPay"`
	// Whether to automatically renew. This parameter is passed in only when you create a data disk. Valid values:
	AutoRenew pulumi.BoolPtrOutput `pulumi:"autoRenew"`
	// Creation time.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The disk description. It must be 2 to 256 characters in length and cannot start with 'http:// 'or 'https.
	// Default value: empty.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The type of the data disk. Value range:
	DiskCategory pulumi.StringOutput `pulumi:"diskCategory"`
	// The disk name. It can be 2 to 128 characters in length. It supports letters in Unicode (including English, Chinese, and numbers). Can contain a colon (:), an underscore (_), a period (.), or a dash (-).
	// Default value: empty.
	DiskName pulumi.StringPtrOutput `pulumi:"diskName"`
	// Whether to pre-check the instance creation operation. Valid values:
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// The Payment type. Only `Postpaid`: Pay-As-You-Go is supported.
	InstanceChargeType pulumi.StringPtrOutput `pulumi:"instanceChargeType"`
	// When creating an ESSD cloud disk, set the performance level of the disk. Value range:
	// - `PL0`: The maximum random read/write IOPS 10000 for a single disk.
	// - `PL1` (default): The maximum number of random read/write IOPS 50000 for a single disk.
	// - `PL2`: maximum random read/write IOPS 100000 for a single disk.
	// - `PL3`: The maximum random read/write IOPS 1 million for a single disk.
	//
	// For more information about how to select an ESSD performance level, see ESSD cloud disk.
	PerformanceLevel pulumi.StringPtrOutput `pulumi:"performanceLevel"`
	// Reserved parameters, no need to fill in.
	Period pulumi.IntPtrOutput `pulumi:"period"`
	// Reserved parameters, no need to fill in.
	PeriodUnit pulumi.StringPtrOutput `pulumi:"periodUnit"`
	// The region ID. You can view the region ID through the DescribeRegions interface.
	RegionId pulumi.StringOutput `pulumi:"regionId"`
	// The ID of the resource group to which the disk belongs.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// Capacity size. Unit: GiB. You must pass in a parameter value for this parameter. Value range:
	Size pulumi.IntOutput `pulumi:"size"`
	// The snapshot used to create the cloud disk. Snapshots made on or before July 15, 2013 cannot be used to create cloud disks. The 'SnapshotId' parameter and the 'Size' parameter have the following limitations:
	// - If the snapshot capacity corresponding to the 'SnapshotId' parameter is greater than the set 'Size' parameter value, the actual size of the cloud disk created is the size of the specified snapshot.
	// - If the snapshot capacity corresponding to the 'SnapshotId' parameter is less than the set 'Size' parameter value, the size of the cloud disk created is the specified 'Size' parameter value.
	// - Snapshots are not supported for creating elastic temporary disks.
	SnapshotId pulumi.StringPtrOutput `pulumi:"snapshotId"`
	// Disk status. Value Description:_use: In use.
	Status pulumi.StringOutput `pulumi:"status"`
	// The method of expanding the disk. Value range:
	// offline (default): offline expansion. After the expansion, the instance must be restarted to take effect.
	// online: online expansion, which can be completed without restarting the instance.
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// The zone ID.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewCustomDisk registers a new resource with the given unique name, arguments, and options.
func NewCustomDisk(ctx *pulumi.Context,
	name string, args *CustomDiskArgs, opts ...pulumi.ResourceOption) (*CustomDisk, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DiskCategory == nil {
		return nil, errors.New("invalid value for required argument 'DiskCategory'")
	}
	if args.Size == nil {
		return nil, errors.New("invalid value for required argument 'Size'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CustomDisk
	err := ctx.RegisterResource("alicloud:rds/customDisk:CustomDisk", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomDisk gets an existing CustomDisk resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomDisk(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomDiskState, opts ...pulumi.ResourceOption) (*CustomDisk, error) {
	var resource CustomDisk
	err := ctx.ReadResource("alicloud:rds/customDisk:CustomDisk", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomDisk resources.
type customDiskState struct {
	// Whether to pay automatically. Value range:
	AutoPay *bool `pulumi:"autoPay"`
	// Whether to automatically renew. This parameter is passed in only when you create a data disk. Valid values:
	AutoRenew *bool `pulumi:"autoRenew"`
	// Creation time.
	CreateTime *string `pulumi:"createTime"`
	// The disk description. It must be 2 to 256 characters in length and cannot start with 'http:// 'or 'https.
	// Default value: empty.
	Description *string `pulumi:"description"`
	// The type of the data disk. Value range:
	DiskCategory *string `pulumi:"diskCategory"`
	// The disk name. It can be 2 to 128 characters in length. It supports letters in Unicode (including English, Chinese, and numbers). Can contain a colon (:), an underscore (_), a period (.), or a dash (-).
	// Default value: empty.
	DiskName *string `pulumi:"diskName"`
	// Whether to pre-check the instance creation operation. Valid values:
	DryRun *bool `pulumi:"dryRun"`
	// The Payment type. Only `Postpaid`: Pay-As-You-Go is supported.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// When creating an ESSD cloud disk, set the performance level of the disk. Value range:
	// - `PL0`: The maximum random read/write IOPS 10000 for a single disk.
	// - `PL1` (default): The maximum number of random read/write IOPS 50000 for a single disk.
	// - `PL2`: maximum random read/write IOPS 100000 for a single disk.
	// - `PL3`: The maximum random read/write IOPS 1 million for a single disk.
	//
	// For more information about how to select an ESSD performance level, see ESSD cloud disk.
	PerformanceLevel *string `pulumi:"performanceLevel"`
	// Reserved parameters, no need to fill in.
	Period *int `pulumi:"period"`
	// Reserved parameters, no need to fill in.
	PeriodUnit *string `pulumi:"periodUnit"`
	// The region ID. You can view the region ID through the DescribeRegions interface.
	RegionId *string `pulumi:"regionId"`
	// The ID of the resource group to which the disk belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Capacity size. Unit: GiB. You must pass in a parameter value for this parameter. Value range:
	Size *int `pulumi:"size"`
	// The snapshot used to create the cloud disk. Snapshots made on or before July 15, 2013 cannot be used to create cloud disks. The 'SnapshotId' parameter and the 'Size' parameter have the following limitations:
	// - If the snapshot capacity corresponding to the 'SnapshotId' parameter is greater than the set 'Size' parameter value, the actual size of the cloud disk created is the size of the specified snapshot.
	// - If the snapshot capacity corresponding to the 'SnapshotId' parameter is less than the set 'Size' parameter value, the size of the cloud disk created is the specified 'Size' parameter value.
	// - Snapshots are not supported for creating elastic temporary disks.
	SnapshotId *string `pulumi:"snapshotId"`
	// Disk status. Value Description:_use: In use.
	Status *string `pulumi:"status"`
	// The method of expanding the disk. Value range:
	// offline (default): offline expansion. After the expansion, the instance must be restarted to take effect.
	// online: online expansion, which can be completed without restarting the instance.
	Type *string `pulumi:"type"`
	// The zone ID.
	ZoneId *string `pulumi:"zoneId"`
}

type CustomDiskState struct {
	// Whether to pay automatically. Value range:
	AutoPay pulumi.BoolPtrInput
	// Whether to automatically renew. This parameter is passed in only when you create a data disk. Valid values:
	AutoRenew pulumi.BoolPtrInput
	// Creation time.
	CreateTime pulumi.StringPtrInput
	// The disk description. It must be 2 to 256 characters in length and cannot start with 'http:// 'or 'https.
	// Default value: empty.
	Description pulumi.StringPtrInput
	// The type of the data disk. Value range:
	DiskCategory pulumi.StringPtrInput
	// The disk name. It can be 2 to 128 characters in length. It supports letters in Unicode (including English, Chinese, and numbers). Can contain a colon (:), an underscore (_), a period (.), or a dash (-).
	// Default value: empty.
	DiskName pulumi.StringPtrInput
	// Whether to pre-check the instance creation operation. Valid values:
	DryRun pulumi.BoolPtrInput
	// The Payment type. Only `Postpaid`: Pay-As-You-Go is supported.
	InstanceChargeType pulumi.StringPtrInput
	// When creating an ESSD cloud disk, set the performance level of the disk. Value range:
	// - `PL0`: The maximum random read/write IOPS 10000 for a single disk.
	// - `PL1` (default): The maximum number of random read/write IOPS 50000 for a single disk.
	// - `PL2`: maximum random read/write IOPS 100000 for a single disk.
	// - `PL3`: The maximum random read/write IOPS 1 million for a single disk.
	//
	// For more information about how to select an ESSD performance level, see ESSD cloud disk.
	PerformanceLevel pulumi.StringPtrInput
	// Reserved parameters, no need to fill in.
	Period pulumi.IntPtrInput
	// Reserved parameters, no need to fill in.
	PeriodUnit pulumi.StringPtrInput
	// The region ID. You can view the region ID through the DescribeRegions interface.
	RegionId pulumi.StringPtrInput
	// The ID of the resource group to which the disk belongs.
	ResourceGroupId pulumi.StringPtrInput
	// Capacity size. Unit: GiB. You must pass in a parameter value for this parameter. Value range:
	Size pulumi.IntPtrInput
	// The snapshot used to create the cloud disk. Snapshots made on or before July 15, 2013 cannot be used to create cloud disks. The 'SnapshotId' parameter and the 'Size' parameter have the following limitations:
	// - If the snapshot capacity corresponding to the 'SnapshotId' parameter is greater than the set 'Size' parameter value, the actual size of the cloud disk created is the size of the specified snapshot.
	// - If the snapshot capacity corresponding to the 'SnapshotId' parameter is less than the set 'Size' parameter value, the size of the cloud disk created is the specified 'Size' parameter value.
	// - Snapshots are not supported for creating elastic temporary disks.
	SnapshotId pulumi.StringPtrInput
	// Disk status. Value Description:_use: In use.
	Status pulumi.StringPtrInput
	// The method of expanding the disk. Value range:
	// offline (default): offline expansion. After the expansion, the instance must be restarted to take effect.
	// online: online expansion, which can be completed without restarting the instance.
	Type pulumi.StringPtrInput
	// The zone ID.
	ZoneId pulumi.StringPtrInput
}

func (CustomDiskState) ElementType() reflect.Type {
	return reflect.TypeOf((*customDiskState)(nil)).Elem()
}

type customDiskArgs struct {
	// Whether to pay automatically. Value range:
	AutoPay *bool `pulumi:"autoPay"`
	// Whether to automatically renew. This parameter is passed in only when you create a data disk. Valid values:
	AutoRenew *bool `pulumi:"autoRenew"`
	// The disk description. It must be 2 to 256 characters in length and cannot start with 'http:// 'or 'https.
	// Default value: empty.
	Description *string `pulumi:"description"`
	// The type of the data disk. Value range:
	DiskCategory string `pulumi:"diskCategory"`
	// The disk name. It can be 2 to 128 characters in length. It supports letters in Unicode (including English, Chinese, and numbers). Can contain a colon (:), an underscore (_), a period (.), or a dash (-).
	// Default value: empty.
	DiskName *string `pulumi:"diskName"`
	// Whether to pre-check the instance creation operation. Valid values:
	DryRun *bool `pulumi:"dryRun"`
	// The Payment type. Only `Postpaid`: Pay-As-You-Go is supported.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// When creating an ESSD cloud disk, set the performance level of the disk. Value range:
	// - `PL0`: The maximum random read/write IOPS 10000 for a single disk.
	// - `PL1` (default): The maximum number of random read/write IOPS 50000 for a single disk.
	// - `PL2`: maximum random read/write IOPS 100000 for a single disk.
	// - `PL3`: The maximum random read/write IOPS 1 million for a single disk.
	//
	// For more information about how to select an ESSD performance level, see ESSD cloud disk.
	PerformanceLevel *string `pulumi:"performanceLevel"`
	// Reserved parameters, no need to fill in.
	Period *int `pulumi:"period"`
	// Reserved parameters, no need to fill in.
	PeriodUnit *string `pulumi:"periodUnit"`
	// Capacity size. Unit: GiB. You must pass in a parameter value for this parameter. Value range:
	Size int `pulumi:"size"`
	// The snapshot used to create the cloud disk. Snapshots made on or before July 15, 2013 cannot be used to create cloud disks. The 'SnapshotId' parameter and the 'Size' parameter have the following limitations:
	// - If the snapshot capacity corresponding to the 'SnapshotId' parameter is greater than the set 'Size' parameter value, the actual size of the cloud disk created is the size of the specified snapshot.
	// - If the snapshot capacity corresponding to the 'SnapshotId' parameter is less than the set 'Size' parameter value, the size of the cloud disk created is the specified 'Size' parameter value.
	// - Snapshots are not supported for creating elastic temporary disks.
	SnapshotId *string `pulumi:"snapshotId"`
	// The method of expanding the disk. Value range:
	// offline (default): offline expansion. After the expansion, the instance must be restarted to take effect.
	// online: online expansion, which can be completed without restarting the instance.
	Type *string `pulumi:"type"`
	// The zone ID.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a CustomDisk resource.
type CustomDiskArgs struct {
	// Whether to pay automatically. Value range:
	AutoPay pulumi.BoolPtrInput
	// Whether to automatically renew. This parameter is passed in only when you create a data disk. Valid values:
	AutoRenew pulumi.BoolPtrInput
	// The disk description. It must be 2 to 256 characters in length and cannot start with 'http:// 'or 'https.
	// Default value: empty.
	Description pulumi.StringPtrInput
	// The type of the data disk. Value range:
	DiskCategory pulumi.StringInput
	// The disk name. It can be 2 to 128 characters in length. It supports letters in Unicode (including English, Chinese, and numbers). Can contain a colon (:), an underscore (_), a period (.), or a dash (-).
	// Default value: empty.
	DiskName pulumi.StringPtrInput
	// Whether to pre-check the instance creation operation. Valid values:
	DryRun pulumi.BoolPtrInput
	// The Payment type. Only `Postpaid`: Pay-As-You-Go is supported.
	InstanceChargeType pulumi.StringPtrInput
	// When creating an ESSD cloud disk, set the performance level of the disk. Value range:
	// - `PL0`: The maximum random read/write IOPS 10000 for a single disk.
	// - `PL1` (default): The maximum number of random read/write IOPS 50000 for a single disk.
	// - `PL2`: maximum random read/write IOPS 100000 for a single disk.
	// - `PL3`: The maximum random read/write IOPS 1 million for a single disk.
	//
	// For more information about how to select an ESSD performance level, see ESSD cloud disk.
	PerformanceLevel pulumi.StringPtrInput
	// Reserved parameters, no need to fill in.
	Period pulumi.IntPtrInput
	// Reserved parameters, no need to fill in.
	PeriodUnit pulumi.StringPtrInput
	// Capacity size. Unit: GiB. You must pass in a parameter value for this parameter. Value range:
	Size pulumi.IntInput
	// The snapshot used to create the cloud disk. Snapshots made on or before July 15, 2013 cannot be used to create cloud disks. The 'SnapshotId' parameter and the 'Size' parameter have the following limitations:
	// - If the snapshot capacity corresponding to the 'SnapshotId' parameter is greater than the set 'Size' parameter value, the actual size of the cloud disk created is the size of the specified snapshot.
	// - If the snapshot capacity corresponding to the 'SnapshotId' parameter is less than the set 'Size' parameter value, the size of the cloud disk created is the specified 'Size' parameter value.
	// - Snapshots are not supported for creating elastic temporary disks.
	SnapshotId pulumi.StringPtrInput
	// The method of expanding the disk. Value range:
	// offline (default): offline expansion. After the expansion, the instance must be restarted to take effect.
	// online: online expansion, which can be completed without restarting the instance.
	Type pulumi.StringPtrInput
	// The zone ID.
	ZoneId pulumi.StringInput
}

func (CustomDiskArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customDiskArgs)(nil)).Elem()
}

type CustomDiskInput interface {
	pulumi.Input

	ToCustomDiskOutput() CustomDiskOutput
	ToCustomDiskOutputWithContext(ctx context.Context) CustomDiskOutput
}

func (*CustomDisk) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomDisk)(nil)).Elem()
}

func (i *CustomDisk) ToCustomDiskOutput() CustomDiskOutput {
	return i.ToCustomDiskOutputWithContext(context.Background())
}

func (i *CustomDisk) ToCustomDiskOutputWithContext(ctx context.Context) CustomDiskOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomDiskOutput)
}

// CustomDiskArrayInput is an input type that accepts CustomDiskArray and CustomDiskArrayOutput values.
// You can construct a concrete instance of `CustomDiskArrayInput` via:
//
//	CustomDiskArray{ CustomDiskArgs{...} }
type CustomDiskArrayInput interface {
	pulumi.Input

	ToCustomDiskArrayOutput() CustomDiskArrayOutput
	ToCustomDiskArrayOutputWithContext(context.Context) CustomDiskArrayOutput
}

type CustomDiskArray []CustomDiskInput

func (CustomDiskArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomDisk)(nil)).Elem()
}

func (i CustomDiskArray) ToCustomDiskArrayOutput() CustomDiskArrayOutput {
	return i.ToCustomDiskArrayOutputWithContext(context.Background())
}

func (i CustomDiskArray) ToCustomDiskArrayOutputWithContext(ctx context.Context) CustomDiskArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomDiskArrayOutput)
}

// CustomDiskMapInput is an input type that accepts CustomDiskMap and CustomDiskMapOutput values.
// You can construct a concrete instance of `CustomDiskMapInput` via:
//
//	CustomDiskMap{ "key": CustomDiskArgs{...} }
type CustomDiskMapInput interface {
	pulumi.Input

	ToCustomDiskMapOutput() CustomDiskMapOutput
	ToCustomDiskMapOutputWithContext(context.Context) CustomDiskMapOutput
}

type CustomDiskMap map[string]CustomDiskInput

func (CustomDiskMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomDisk)(nil)).Elem()
}

func (i CustomDiskMap) ToCustomDiskMapOutput() CustomDiskMapOutput {
	return i.ToCustomDiskMapOutputWithContext(context.Background())
}

func (i CustomDiskMap) ToCustomDiskMapOutputWithContext(ctx context.Context) CustomDiskMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomDiskMapOutput)
}

type CustomDiskOutput struct{ *pulumi.OutputState }

func (CustomDiskOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomDisk)(nil)).Elem()
}

func (o CustomDiskOutput) ToCustomDiskOutput() CustomDiskOutput {
	return o
}

func (o CustomDiskOutput) ToCustomDiskOutputWithContext(ctx context.Context) CustomDiskOutput {
	return o
}

// Whether to pay automatically. Value range:
func (o CustomDiskOutput) AutoPay() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.BoolPtrOutput { return v.AutoPay }).(pulumi.BoolPtrOutput)
}

// Whether to automatically renew. This parameter is passed in only when you create a data disk. Valid values:
func (o CustomDiskOutput) AutoRenew() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.BoolPtrOutput { return v.AutoRenew }).(pulumi.BoolPtrOutput)
}

// Creation time.
func (o CustomDiskOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The disk description. It must be 2 to 256 characters in length and cannot start with 'http:// 'or 'https.
// Default value: empty.
func (o CustomDiskOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The type of the data disk. Value range:
func (o CustomDiskOutput) DiskCategory() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.StringOutput { return v.DiskCategory }).(pulumi.StringOutput)
}

// The disk name. It can be 2 to 128 characters in length. It supports letters in Unicode (including English, Chinese, and numbers). Can contain a colon (:), an underscore (_), a period (.), or a dash (-).
// Default value: empty.
func (o CustomDiskOutput) DiskName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.StringPtrOutput { return v.DiskName }).(pulumi.StringPtrOutput)
}

// Whether to pre-check the instance creation operation. Valid values:
func (o CustomDiskOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// The Payment type. Only `Postpaid`: Pay-As-You-Go is supported.
func (o CustomDiskOutput) InstanceChargeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.StringPtrOutput { return v.InstanceChargeType }).(pulumi.StringPtrOutput)
}

// When creating an ESSD cloud disk, set the performance level of the disk. Value range:
// - `PL0`: The maximum random read/write IOPS 10000 for a single disk.
// - `PL1` (default): The maximum number of random read/write IOPS 50000 for a single disk.
// - `PL2`: maximum random read/write IOPS 100000 for a single disk.
// - `PL3`: The maximum random read/write IOPS 1 million for a single disk.
//
// For more information about how to select an ESSD performance level, see ESSD cloud disk.
func (o CustomDiskOutput) PerformanceLevel() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.StringPtrOutput { return v.PerformanceLevel }).(pulumi.StringPtrOutput)
}

// Reserved parameters, no need to fill in.
func (o CustomDiskOutput) Period() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.IntPtrOutput { return v.Period }).(pulumi.IntPtrOutput)
}

// Reserved parameters, no need to fill in.
func (o CustomDiskOutput) PeriodUnit() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.StringPtrOutput { return v.PeriodUnit }).(pulumi.StringPtrOutput)
}

// The region ID. You can view the region ID through the DescribeRegions interface.
func (o CustomDiskOutput) RegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.StringOutput { return v.RegionId }).(pulumi.StringOutput)
}

// The ID of the resource group to which the disk belongs.
func (o CustomDiskOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// Capacity size. Unit: GiB. You must pass in a parameter value for this parameter. Value range:
func (o CustomDiskOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.IntOutput { return v.Size }).(pulumi.IntOutput)
}

// The snapshot used to create the cloud disk. Snapshots made on or before July 15, 2013 cannot be used to create cloud disks. The 'SnapshotId' parameter and the 'Size' parameter have the following limitations:
// - If the snapshot capacity corresponding to the 'SnapshotId' parameter is greater than the set 'Size' parameter value, the actual size of the cloud disk created is the size of the specified snapshot.
// - If the snapshot capacity corresponding to the 'SnapshotId' parameter is less than the set 'Size' parameter value, the size of the cloud disk created is the specified 'Size' parameter value.
// - Snapshots are not supported for creating elastic temporary disks.
func (o CustomDiskOutput) SnapshotId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.StringPtrOutput { return v.SnapshotId }).(pulumi.StringPtrOutput)
}

// Disk status. Value Description:_use: In use.
func (o CustomDiskOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The method of expanding the disk. Value range:
// offline (default): offline expansion. After the expansion, the instance must be restarted to take effect.
// online: online expansion, which can be completed without restarting the instance.
func (o CustomDiskOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

// The zone ID.
func (o CustomDiskOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomDisk) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type CustomDiskArrayOutput struct{ *pulumi.OutputState }

func (CustomDiskArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomDisk)(nil)).Elem()
}

func (o CustomDiskArrayOutput) ToCustomDiskArrayOutput() CustomDiskArrayOutput {
	return o
}

func (o CustomDiskArrayOutput) ToCustomDiskArrayOutputWithContext(ctx context.Context) CustomDiskArrayOutput {
	return o
}

func (o CustomDiskArrayOutput) Index(i pulumi.IntInput) CustomDiskOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomDisk {
		return vs[0].([]*CustomDisk)[vs[1].(int)]
	}).(CustomDiskOutput)
}

type CustomDiskMapOutput struct{ *pulumi.OutputState }

func (CustomDiskMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomDisk)(nil)).Elem()
}

func (o CustomDiskMapOutput) ToCustomDiskMapOutput() CustomDiskMapOutput {
	return o
}

func (o CustomDiskMapOutput) ToCustomDiskMapOutputWithContext(ctx context.Context) CustomDiskMapOutput {
	return o
}

func (o CustomDiskMapOutput) MapIndex(k pulumi.StringInput) CustomDiskOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomDisk {
		return vs[0].(map[string]*CustomDisk)[vs[1].(string)]
	}).(CustomDiskOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomDiskInput)(nil)).Elem(), &CustomDisk{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomDiskArrayInput)(nil)).Elem(), CustomDiskArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomDiskMapInput)(nil)).Elem(), CustomDiskMap{})
	pulumi.RegisterOutputType(CustomDiskOutput{})
	pulumi.RegisterOutputType(CustomDiskArrayOutput{})
	pulumi.RegisterOutputType(CustomDiskMapOutput{})
}
