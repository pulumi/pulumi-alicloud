// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databasefilesystem

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DBFS Dbfs Instance resource. An instance of a database file system is equivalent to a file system and can store data of file types.
//
// For information about DBFS Dbfs Instance and how to use it, see [What is Dbfs Instance](https://next.api.alibabacloud.com/document/DBFS/2020-04-18/CreateDbfs).
//
// > **NOTE:** Need to contact us open whitelist before you can use the resource.
//
// > **NOTE:** Available since v1.136.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/databasefilesystem"
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
//			_, err := databasefilesystem.NewInstance(ctx, "example", &databasefilesystem.InstanceArgs{
//				Category:         pulumi.String("standard"),
//				ZoneId:           pulumi.String("cn-hangzhou-i"),
//				PerformanceLevel: pulumi.String("PL1"),
//				FsName:           pulumi.String(name),
//				Size:             pulumi.Int(100),
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
// DBFS Dbfs Instance can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:databasefilesystem/instance:Instance example <id>
// ```
type Instance struct {
	pulumi.CustomResourceState

	// The number of CPU cores and the upper limit of memory used by the database file storage instance.
	AdvancedFeatures pulumi.StringOutput `pulumi:"advancedFeatures"`
	// Category of database file system.
	Category pulumi.StringOutput `pulumi:"category"`
	// The creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Whether to delete the original snapshot after creating DBFS using the snapshot.
	DeleteSnapshot pulumi.BoolPtrOutput `pulumi:"deleteSnapshot"`
	// The collection of ECS instances mounted to the Database file system. See `ecsList` below.  **NOTE:** Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS. See `ecsList` below.
	//
	// Deprecated: Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.
	EcsLists InstanceEcsListArrayOutput `pulumi:"ecsLists"`
	// Whether to create DBFS in RAID mode. If created in RAID mode, the capacity is at least 66GB.Valid values: true or false. Default value: false.
	EnableRaid pulumi.BoolPtrOutput `pulumi:"enableRaid"`
	// Whether to encrypt DBFS.Valid values: true or false. Default value: false.
	Encryption pulumi.BoolPtrOutput `pulumi:"encryption"`
	// Database file system name.
	FsName pulumi.StringOutput `pulumi:"fsName"`
	// . Field 'instance_name' has been deprecated from provider version 1.212.0. New field 'fs_name' instead.
	//
	// Deprecated: Field 'instance_name' has been deprecated since provider version 1.212.0. New field 'fs_name' instead.
	InstanceName pulumi.StringOutput `pulumi:"instanceName"`
	// Instance type. Value range:
	// - dbfs.small
	// - dbfs.medium
	// - dbfs.large (default)
	InstanceType pulumi.StringPtrOutput `pulumi:"instanceType"`
	// The ID of the KMS key used by DBFS.
	KmsKeyId pulumi.StringPtrOutput `pulumi:"kmsKeyId"`
	// When you create a DBFS instance, set the performance level of the DBFS instance. Value range:
	// - PL0: single disk maximum random read-write IOPS 10000
	// - PL1: highest random read-write IOPS 50000 per disk (default)
	// - PL2: single disk maximum random read-write IOPS 100000
	// - PL3: single disk maximum random read-write IOPS 1 million.
	PerformanceLevel pulumi.StringOutput `pulumi:"performanceLevel"`
	// Number of strips. Required when the EnableRaid parameter is true.Value range: Currently, only 8 stripes are supported.
	RaidStripeUnitNumber pulumi.IntPtrOutput `pulumi:"raidStripeUnitNumber"`
	// Size of database file system, unit GiB.
	Size pulumi.IntOutput `pulumi:"size"`
	// The ID of the snapshot used to create the DBFS instance.
	SnapshotId pulumi.StringOutput `pulumi:"snapshotId"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The usage scenario of DBFS. Value range:
	// - MySQL 5.7
	// - PostgreSQL
	// - MongoDB.
	UsedScene pulumi.StringPtrOutput `pulumi:"usedScene"`
	// The ID of the zone to which the database file system belongs.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewInstance registers a new resource with the given unique name, arguments, and options.
func NewInstance(ctx *pulumi.Context,
	name string, args *InstanceArgs, opts ...pulumi.ResourceOption) (*Instance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Category == nil {
		return nil, errors.New("invalid value for required argument 'Category'")
	}
	if args.Size == nil {
		return nil, errors.New("invalid value for required argument 'Size'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Instance
	err := ctx.RegisterResource("alicloud:databasefilesystem/instance:Instance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstance gets an existing Instance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceState, opts ...pulumi.ResourceOption) (*Instance, error) {
	var resource Instance
	err := ctx.ReadResource("alicloud:databasefilesystem/instance:Instance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Instance resources.
type instanceState struct {
	// The number of CPU cores and the upper limit of memory used by the database file storage instance.
	AdvancedFeatures *string `pulumi:"advancedFeatures"`
	// Category of database file system.
	Category *string `pulumi:"category"`
	// The creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// Whether to delete the original snapshot after creating DBFS using the snapshot.
	DeleteSnapshot *bool `pulumi:"deleteSnapshot"`
	// The collection of ECS instances mounted to the Database file system. See `ecsList` below.  **NOTE:** Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS. See `ecsList` below.
	//
	// Deprecated: Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.
	EcsLists []InstanceEcsList `pulumi:"ecsLists"`
	// Whether to create DBFS in RAID mode. If created in RAID mode, the capacity is at least 66GB.Valid values: true or false. Default value: false.
	EnableRaid *bool `pulumi:"enableRaid"`
	// Whether to encrypt DBFS.Valid values: true or false. Default value: false.
	Encryption *bool `pulumi:"encryption"`
	// Database file system name.
	FsName *string `pulumi:"fsName"`
	// . Field 'instance_name' has been deprecated from provider version 1.212.0. New field 'fs_name' instead.
	//
	// Deprecated: Field 'instance_name' has been deprecated since provider version 1.212.0. New field 'fs_name' instead.
	InstanceName *string `pulumi:"instanceName"`
	// Instance type. Value range:
	// - dbfs.small
	// - dbfs.medium
	// - dbfs.large (default)
	InstanceType *string `pulumi:"instanceType"`
	// The ID of the KMS key used by DBFS.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// When you create a DBFS instance, set the performance level of the DBFS instance. Value range:
	// - PL0: single disk maximum random read-write IOPS 10000
	// - PL1: highest random read-write IOPS 50000 per disk (default)
	// - PL2: single disk maximum random read-write IOPS 100000
	// - PL3: single disk maximum random read-write IOPS 1 million.
	PerformanceLevel *string `pulumi:"performanceLevel"`
	// Number of strips. Required when the EnableRaid parameter is true.Value range: Currently, only 8 stripes are supported.
	RaidStripeUnitNumber *int `pulumi:"raidStripeUnitNumber"`
	// Size of database file system, unit GiB.
	Size *int `pulumi:"size"`
	// The ID of the snapshot used to create the DBFS instance.
	SnapshotId *string `pulumi:"snapshotId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	Tags map[string]string `pulumi:"tags"`
	// The usage scenario of DBFS. Value range:
	// - MySQL 5.7
	// - PostgreSQL
	// - MongoDB.
	UsedScene *string `pulumi:"usedScene"`
	// The ID of the zone to which the database file system belongs.
	ZoneId *string `pulumi:"zoneId"`
}

type InstanceState struct {
	// The number of CPU cores and the upper limit of memory used by the database file storage instance.
	AdvancedFeatures pulumi.StringPtrInput
	// Category of database file system.
	Category pulumi.StringPtrInput
	// The creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// Whether to delete the original snapshot after creating DBFS using the snapshot.
	DeleteSnapshot pulumi.BoolPtrInput
	// The collection of ECS instances mounted to the Database file system. See `ecsList` below.  **NOTE:** Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS. See `ecsList` below.
	//
	// Deprecated: Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.
	EcsLists InstanceEcsListArrayInput
	// Whether to create DBFS in RAID mode. If created in RAID mode, the capacity is at least 66GB.Valid values: true or false. Default value: false.
	EnableRaid pulumi.BoolPtrInput
	// Whether to encrypt DBFS.Valid values: true or false. Default value: false.
	Encryption pulumi.BoolPtrInput
	// Database file system name.
	FsName pulumi.StringPtrInput
	// . Field 'instance_name' has been deprecated from provider version 1.212.0. New field 'fs_name' instead.
	//
	// Deprecated: Field 'instance_name' has been deprecated since provider version 1.212.0. New field 'fs_name' instead.
	InstanceName pulumi.StringPtrInput
	// Instance type. Value range:
	// - dbfs.small
	// - dbfs.medium
	// - dbfs.large (default)
	InstanceType pulumi.StringPtrInput
	// The ID of the KMS key used by DBFS.
	KmsKeyId pulumi.StringPtrInput
	// When you create a DBFS instance, set the performance level of the DBFS instance. Value range:
	// - PL0: single disk maximum random read-write IOPS 10000
	// - PL1: highest random read-write IOPS 50000 per disk (default)
	// - PL2: single disk maximum random read-write IOPS 100000
	// - PL3: single disk maximum random read-write IOPS 1 million.
	PerformanceLevel pulumi.StringPtrInput
	// Number of strips. Required when the EnableRaid parameter is true.Value range: Currently, only 8 stripes are supported.
	RaidStripeUnitNumber pulumi.IntPtrInput
	// Size of database file system, unit GiB.
	Size pulumi.IntPtrInput
	// The ID of the snapshot used to create the DBFS instance.
	SnapshotId pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	Tags pulumi.StringMapInput
	// The usage scenario of DBFS. Value range:
	// - MySQL 5.7
	// - PostgreSQL
	// - MongoDB.
	UsedScene pulumi.StringPtrInput
	// The ID of the zone to which the database file system belongs.
	ZoneId pulumi.StringPtrInput
}

func (InstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceState)(nil)).Elem()
}

type instanceArgs struct {
	// The number of CPU cores and the upper limit of memory used by the database file storage instance.
	AdvancedFeatures *string `pulumi:"advancedFeatures"`
	// Category of database file system.
	Category string `pulumi:"category"`
	// Whether to delete the original snapshot after creating DBFS using the snapshot.
	DeleteSnapshot *bool `pulumi:"deleteSnapshot"`
	// The collection of ECS instances mounted to the Database file system. See `ecsList` below.  **NOTE:** Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS. See `ecsList` below.
	//
	// Deprecated: Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.
	EcsLists []InstanceEcsList `pulumi:"ecsLists"`
	// Whether to create DBFS in RAID mode. If created in RAID mode, the capacity is at least 66GB.Valid values: true or false. Default value: false.
	EnableRaid *bool `pulumi:"enableRaid"`
	// Whether to encrypt DBFS.Valid values: true or false. Default value: false.
	Encryption *bool `pulumi:"encryption"`
	// Database file system name.
	FsName *string `pulumi:"fsName"`
	// . Field 'instance_name' has been deprecated from provider version 1.212.0. New field 'fs_name' instead.
	//
	// Deprecated: Field 'instance_name' has been deprecated since provider version 1.212.0. New field 'fs_name' instead.
	InstanceName *string `pulumi:"instanceName"`
	// Instance type. Value range:
	// - dbfs.small
	// - dbfs.medium
	// - dbfs.large (default)
	InstanceType *string `pulumi:"instanceType"`
	// The ID of the KMS key used by DBFS.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// When you create a DBFS instance, set the performance level of the DBFS instance. Value range:
	// - PL0: single disk maximum random read-write IOPS 10000
	// - PL1: highest random read-write IOPS 50000 per disk (default)
	// - PL2: single disk maximum random read-write IOPS 100000
	// - PL3: single disk maximum random read-write IOPS 1 million.
	PerformanceLevel *string `pulumi:"performanceLevel"`
	// Number of strips. Required when the EnableRaid parameter is true.Value range: Currently, only 8 stripes are supported.
	RaidStripeUnitNumber *int `pulumi:"raidStripeUnitNumber"`
	// Size of database file system, unit GiB.
	Size int `pulumi:"size"`
	// The ID of the snapshot used to create the DBFS instance.
	SnapshotId *string `pulumi:"snapshotId"`
	// A mapping of tags to assign to the resource.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	Tags map[string]string `pulumi:"tags"`
	// The usage scenario of DBFS. Value range:
	// - MySQL 5.7
	// - PostgreSQL
	// - MongoDB.
	UsedScene *string `pulumi:"usedScene"`
	// The ID of the zone to which the database file system belongs.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Instance resource.
type InstanceArgs struct {
	// The number of CPU cores and the upper limit of memory used by the database file storage instance.
	AdvancedFeatures pulumi.StringPtrInput
	// Category of database file system.
	Category pulumi.StringInput
	// Whether to delete the original snapshot after creating DBFS using the snapshot.
	DeleteSnapshot pulumi.BoolPtrInput
	// The collection of ECS instances mounted to the Database file system. See `ecsList` below.  **NOTE:** Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS. See `ecsList` below.
	//
	// Deprecated: Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.
	EcsLists InstanceEcsListArrayInput
	// Whether to create DBFS in RAID mode. If created in RAID mode, the capacity is at least 66GB.Valid values: true or false. Default value: false.
	EnableRaid pulumi.BoolPtrInput
	// Whether to encrypt DBFS.Valid values: true or false. Default value: false.
	Encryption pulumi.BoolPtrInput
	// Database file system name.
	FsName pulumi.StringPtrInput
	// . Field 'instance_name' has been deprecated from provider version 1.212.0. New field 'fs_name' instead.
	//
	// Deprecated: Field 'instance_name' has been deprecated since provider version 1.212.0. New field 'fs_name' instead.
	InstanceName pulumi.StringPtrInput
	// Instance type. Value range:
	// - dbfs.small
	// - dbfs.medium
	// - dbfs.large (default)
	InstanceType pulumi.StringPtrInput
	// The ID of the KMS key used by DBFS.
	KmsKeyId pulumi.StringPtrInput
	// When you create a DBFS instance, set the performance level of the DBFS instance. Value range:
	// - PL0: single disk maximum random read-write IOPS 10000
	// - PL1: highest random read-write IOPS 50000 per disk (default)
	// - PL2: single disk maximum random read-write IOPS 100000
	// - PL3: single disk maximum random read-write IOPS 1 million.
	PerformanceLevel pulumi.StringPtrInput
	// Number of strips. Required when the EnableRaid parameter is true.Value range: Currently, only 8 stripes are supported.
	RaidStripeUnitNumber pulumi.IntPtrInput
	// Size of database file system, unit GiB.
	Size pulumi.IntInput
	// The ID of the snapshot used to create the DBFS instance.
	SnapshotId pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	Tags pulumi.StringMapInput
	// The usage scenario of DBFS. Value range:
	// - MySQL 5.7
	// - PostgreSQL
	// - MongoDB.
	UsedScene pulumi.StringPtrInput
	// The ID of the zone to which the database file system belongs.
	ZoneId pulumi.StringInput
}

func (InstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceArgs)(nil)).Elem()
}

type InstanceInput interface {
	pulumi.Input

	ToInstanceOutput() InstanceOutput
	ToInstanceOutputWithContext(ctx context.Context) InstanceOutput
}

func (*Instance) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (i *Instance) ToInstanceOutput() InstanceOutput {
	return i.ToInstanceOutputWithContext(context.Background())
}

func (i *Instance) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceOutput)
}

// InstanceArrayInput is an input type that accepts InstanceArray and InstanceArrayOutput values.
// You can construct a concrete instance of `InstanceArrayInput` via:
//
//	InstanceArray{ InstanceArgs{...} }
type InstanceArrayInput interface {
	pulumi.Input

	ToInstanceArrayOutput() InstanceArrayOutput
	ToInstanceArrayOutputWithContext(context.Context) InstanceArrayOutput
}

type InstanceArray []InstanceInput

func (InstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (i InstanceArray) ToInstanceArrayOutput() InstanceArrayOutput {
	return i.ToInstanceArrayOutputWithContext(context.Background())
}

func (i InstanceArray) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceArrayOutput)
}

// InstanceMapInput is an input type that accepts InstanceMap and InstanceMapOutput values.
// You can construct a concrete instance of `InstanceMapInput` via:
//
//	InstanceMap{ "key": InstanceArgs{...} }
type InstanceMapInput interface {
	pulumi.Input

	ToInstanceMapOutput() InstanceMapOutput
	ToInstanceMapOutputWithContext(context.Context) InstanceMapOutput
}

type InstanceMap map[string]InstanceInput

func (InstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (i InstanceMap) ToInstanceMapOutput() InstanceMapOutput {
	return i.ToInstanceMapOutputWithContext(context.Background())
}

func (i InstanceMap) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceMapOutput)
}

type InstanceOutput struct{ *pulumi.OutputState }

func (InstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (o InstanceOutput) ToInstanceOutput() InstanceOutput {
	return o
}

func (o InstanceOutput) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return o
}

// The number of CPU cores and the upper limit of memory used by the database file storage instance.
func (o InstanceOutput) AdvancedFeatures() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.AdvancedFeatures }).(pulumi.StringOutput)
}

// Category of database file system.
func (o InstanceOutput) Category() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.Category }).(pulumi.StringOutput)
}

// The creation time of the resource.
func (o InstanceOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Whether to delete the original snapshot after creating DBFS using the snapshot.
func (o InstanceOutput) DeleteSnapshot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.BoolPtrOutput { return v.DeleteSnapshot }).(pulumi.BoolPtrOutput)
}

// The collection of ECS instances mounted to the Database file system. See `ecsList` below.  **NOTE:** Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS. See `ecsList` below.
//
// Deprecated: Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.
func (o InstanceOutput) EcsLists() InstanceEcsListArrayOutput {
	return o.ApplyT(func(v *Instance) InstanceEcsListArrayOutput { return v.EcsLists }).(InstanceEcsListArrayOutput)
}

// Whether to create DBFS in RAID mode. If created in RAID mode, the capacity is at least 66GB.Valid values: true or false. Default value: false.
func (o InstanceOutput) EnableRaid() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.BoolPtrOutput { return v.EnableRaid }).(pulumi.BoolPtrOutput)
}

// Whether to encrypt DBFS.Valid values: true or false. Default value: false.
func (o InstanceOutput) Encryption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.BoolPtrOutput { return v.Encryption }).(pulumi.BoolPtrOutput)
}

// Database file system name.
func (o InstanceOutput) FsName() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.FsName }).(pulumi.StringOutput)
}

// . Field 'instance_name' has been deprecated from provider version 1.212.0. New field 'fs_name' instead.
//
// Deprecated: Field 'instance_name' has been deprecated since provider version 1.212.0. New field 'fs_name' instead.
func (o InstanceOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.InstanceName }).(pulumi.StringOutput)
}

// Instance type. Value range:
// - dbfs.small
// - dbfs.medium
// - dbfs.large (default)
func (o InstanceOutput) InstanceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.InstanceType }).(pulumi.StringPtrOutput)
}

// The ID of the KMS key used by DBFS.
func (o InstanceOutput) KmsKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.KmsKeyId }).(pulumi.StringPtrOutput)
}

// When you create a DBFS instance, set the performance level of the DBFS instance. Value range:
// - PL0: single disk maximum random read-write IOPS 10000
// - PL1: highest random read-write IOPS 50000 per disk (default)
// - PL2: single disk maximum random read-write IOPS 100000
// - PL3: single disk maximum random read-write IOPS 1 million.
func (o InstanceOutput) PerformanceLevel() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.PerformanceLevel }).(pulumi.StringOutput)
}

// Number of strips. Required when the EnableRaid parameter is true.Value range: Currently, only 8 stripes are supported.
func (o InstanceOutput) RaidStripeUnitNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntPtrOutput { return v.RaidStripeUnitNumber }).(pulumi.IntPtrOutput)
}

// Size of database file system, unit GiB.
func (o InstanceOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntOutput { return v.Size }).(pulumi.IntOutput)
}

// The ID of the snapshot used to create the DBFS instance.
func (o InstanceOutput) SnapshotId() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.SnapshotId }).(pulumi.StringOutput)
}

// The status of the resource.
func (o InstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
//
// The following arguments will be discarded. Please use new fields as soon as possible:
func (o InstanceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The usage scenario of DBFS. Value range:
// - MySQL 5.7
// - PostgreSQL
// - MongoDB.
func (o InstanceOutput) UsedScene() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.UsedScene }).(pulumi.StringPtrOutput)
}

// The ID of the zone to which the database file system belongs.
func (o InstanceOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type InstanceArrayOutput struct{ *pulumi.OutputState }

func (InstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (o InstanceArrayOutput) ToInstanceArrayOutput() InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) Index(i pulumi.IntInput) InstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].([]*Instance)[vs[1].(int)]
	}).(InstanceOutput)
}

type InstanceMapOutput struct{ *pulumi.OutputState }

func (InstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (o InstanceMapOutput) ToInstanceMapOutput() InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) MapIndex(k pulumi.StringInput) InstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].(map[string]*Instance)[vs[1].(string)]
	}).(InstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceInput)(nil)).Elem(), &Instance{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceArrayInput)(nil)).Elem(), InstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceMapInput)(nil)).Elem(), InstanceMap{})
	pulumi.RegisterOutputType(InstanceOutput{})
	pulumi.RegisterOutputType(InstanceArrayOutput{})
	pulumi.RegisterOutputType(InstanceMapOutput{})
}
