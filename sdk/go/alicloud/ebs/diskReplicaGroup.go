// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ebs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Elastic Block Storage(EBS) Disk Replica Group resource.
//
// consistent replica group.
//
// For information about Elastic Block Storage(EBS) Disk Replica Group and how to use it, see [What is Disk Replica Group](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/creatediskreplicagroup).
//
// > **NOTE:** Available since v1.187.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ebs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_default, err := alicloud.GetRegions(ctx, &alicloud.GetRegionsArgs{
//				Current: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetRegions, err := ebs.GetRegions(ctx, &ebs.GetRegionsArgs{
//				RegionId: pulumi.StringRef(_default.Regions[0].Id),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = ebs.NewDiskReplicaGroup(ctx, "default", &ebs.DiskReplicaGroupArgs{
//				SourceRegionId:      pulumi.String(_default.Regions[0].Id),
//				SourceZoneId:        pulumi.String(defaultGetRegions.Regions[0].Zones[0].ZoneId),
//				DestinationRegionId: pulumi.String(_default.Regions[0].Id),
//				DestinationZoneId:   pulumi.String(defaultGetRegions.Regions[0].Zones[1].ZoneId),
//				GroupName:           pulumi.String(name),
//				Description:         pulumi.String(name),
//				Rpo:                 pulumi.Int(900),
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
// Elastic Block Storage(EBS) Disk Replica Group can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ebs/diskReplicaGroup:DiskReplicaGroup example <id>
// ```
type DiskReplicaGroup struct {
	pulumi.CustomResourceState

	// The description of the consistent replication group.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the region to which the disaster recovery site belongs.
	DestinationRegionId pulumi.StringOutput `pulumi:"destinationRegionId"`
	// The ID of the zone to which the disaster recovery site belongs.
	DestinationZoneId pulumi.StringOutput `pulumi:"destinationZoneId"`
	// Consistent replication group name.
	DiskReplicaGroupName pulumi.StringOutput `pulumi:"diskReplicaGroupName"`
	// . Field 'group_name' has been deprecated from provider version 1.245.0. New field 'disk_replica_group_name' instead.
	//
	// Deprecated: Field 'group_name' has been deprecated since provider version 1.245.0. New field 'disk_replica_group_name' instead.
	GroupName pulumi.StringOutput `pulumi:"groupName"`
	// Whether to synchronize immediately. Value range:
	// - true: Start data synchronization immediately.
	// - false: Data Synchronization starts after the RPO time period.
	//
	// Default value: false.
	OneShot pulumi.BoolPtrOutput `pulumi:"oneShot"`
	// List of replication pair IDs contained in a consistent replication group.
	PairIds pulumi.StringArrayOutput `pulumi:"pairIds"`
	// resource group ID of enterprise
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// Specifies whether to enable the reverse replication sub-feature. Valid values: true and false. Default value: true.
	ReverseReplicate pulumi.BoolPtrOutput `pulumi:"reverseReplicate"`
	// The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
	Rpo pulumi.IntPtrOutput `pulumi:"rpo"`
	// The ID of the region to which the production site belongs.
	SourceRegionId pulumi.StringOutput `pulumi:"sourceRegionId"`
	// The ID of the zone to which the production site belongs.
	SourceZoneId pulumi.StringOutput `pulumi:"sourceZoneId"`
	// The status of the consistent replication group. Possible values:
	// - invalid: invalid. This state indicates that there is an exception to the replication pair in the consistent replication group.
	// - creating: creating.
	// - created: created.
	// - create_failed: creation failed.
	// - manual_syncing: in a single synchronization. If it is the first single synchronization, this status is also displayed in the synchronization.
	// - syncing: synchronization. This state is the first time data is copied asynchronously between the master and slave disks.
	// - normal: normal. When data replication is completed within the current cycle of asynchronous replication, it will be in this state.
	// - stopping: stopping.
	// - stopped: stopped.
	// - stop_failed: Stop failed.
	// - Failover: failover.
	// - Failed: failover completed.
	// - failover_failed: failover failed.
	// - Reprotection: In reverse copy operation.
	// - reprotect_failed: reverse replication failed.
	// - deleting: deleting.
	// - delete_failed: delete failed.
	// - deleted: deleted.
	Status pulumi.StringOutput `pulumi:"status"`
	// The tag of the resource
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewDiskReplicaGroup registers a new resource with the given unique name, arguments, and options.
func NewDiskReplicaGroup(ctx *pulumi.Context,
	name string, args *DiskReplicaGroupArgs, opts ...pulumi.ResourceOption) (*DiskReplicaGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationRegionId == nil {
		return nil, errors.New("invalid value for required argument 'DestinationRegionId'")
	}
	if args.DestinationZoneId == nil {
		return nil, errors.New("invalid value for required argument 'DestinationZoneId'")
	}
	if args.SourceRegionId == nil {
		return nil, errors.New("invalid value for required argument 'SourceRegionId'")
	}
	if args.SourceZoneId == nil {
		return nil, errors.New("invalid value for required argument 'SourceZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DiskReplicaGroup
	err := ctx.RegisterResource("alicloud:ebs/diskReplicaGroup:DiskReplicaGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDiskReplicaGroup gets an existing DiskReplicaGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDiskReplicaGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DiskReplicaGroupState, opts ...pulumi.ResourceOption) (*DiskReplicaGroup, error) {
	var resource DiskReplicaGroup
	err := ctx.ReadResource("alicloud:ebs/diskReplicaGroup:DiskReplicaGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DiskReplicaGroup resources.
type diskReplicaGroupState struct {
	// The description of the consistent replication group.
	Description *string `pulumi:"description"`
	// The ID of the region to which the disaster recovery site belongs.
	DestinationRegionId *string `pulumi:"destinationRegionId"`
	// The ID of the zone to which the disaster recovery site belongs.
	DestinationZoneId *string `pulumi:"destinationZoneId"`
	// Consistent replication group name.
	DiskReplicaGroupName *string `pulumi:"diskReplicaGroupName"`
	// . Field 'group_name' has been deprecated from provider version 1.245.0. New field 'disk_replica_group_name' instead.
	//
	// Deprecated: Field 'group_name' has been deprecated since provider version 1.245.0. New field 'disk_replica_group_name' instead.
	GroupName *string `pulumi:"groupName"`
	// Whether to synchronize immediately. Value range:
	// - true: Start data synchronization immediately.
	// - false: Data Synchronization starts after the RPO time period.
	//
	// Default value: false.
	OneShot *bool `pulumi:"oneShot"`
	// List of replication pair IDs contained in a consistent replication group.
	PairIds []string `pulumi:"pairIds"`
	// resource group ID of enterprise
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Specifies whether to enable the reverse replication sub-feature. Valid values: true and false. Default value: true.
	ReverseReplicate *bool `pulumi:"reverseReplicate"`
	// The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
	Rpo *int `pulumi:"rpo"`
	// The ID of the region to which the production site belongs.
	SourceRegionId *string `pulumi:"sourceRegionId"`
	// The ID of the zone to which the production site belongs.
	SourceZoneId *string `pulumi:"sourceZoneId"`
	// The status of the consistent replication group. Possible values:
	// - invalid: invalid. This state indicates that there is an exception to the replication pair in the consistent replication group.
	// - creating: creating.
	// - created: created.
	// - create_failed: creation failed.
	// - manual_syncing: in a single synchronization. If it is the first single synchronization, this status is also displayed in the synchronization.
	// - syncing: synchronization. This state is the first time data is copied asynchronously between the master and slave disks.
	// - normal: normal. When data replication is completed within the current cycle of asynchronous replication, it will be in this state.
	// - stopping: stopping.
	// - stopped: stopped.
	// - stop_failed: Stop failed.
	// - Failover: failover.
	// - Failed: failover completed.
	// - failover_failed: failover failed.
	// - Reprotection: In reverse copy operation.
	// - reprotect_failed: reverse replication failed.
	// - deleting: deleting.
	// - delete_failed: delete failed.
	// - deleted: deleted.
	Status *string `pulumi:"status"`
	// The tag of the resource
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	Tags map[string]string `pulumi:"tags"`
}

type DiskReplicaGroupState struct {
	// The description of the consistent replication group.
	Description pulumi.StringPtrInput
	// The ID of the region to which the disaster recovery site belongs.
	DestinationRegionId pulumi.StringPtrInput
	// The ID of the zone to which the disaster recovery site belongs.
	DestinationZoneId pulumi.StringPtrInput
	// Consistent replication group name.
	DiskReplicaGroupName pulumi.StringPtrInput
	// . Field 'group_name' has been deprecated from provider version 1.245.0. New field 'disk_replica_group_name' instead.
	//
	// Deprecated: Field 'group_name' has been deprecated since provider version 1.245.0. New field 'disk_replica_group_name' instead.
	GroupName pulumi.StringPtrInput
	// Whether to synchronize immediately. Value range:
	// - true: Start data synchronization immediately.
	// - false: Data Synchronization starts after the RPO time period.
	//
	// Default value: false.
	OneShot pulumi.BoolPtrInput
	// List of replication pair IDs contained in a consistent replication group.
	PairIds pulumi.StringArrayInput
	// resource group ID of enterprise
	ResourceGroupId pulumi.StringPtrInput
	// Specifies whether to enable the reverse replication sub-feature. Valid values: true and false. Default value: true.
	ReverseReplicate pulumi.BoolPtrInput
	// The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
	Rpo pulumi.IntPtrInput
	// The ID of the region to which the production site belongs.
	SourceRegionId pulumi.StringPtrInput
	// The ID of the zone to which the production site belongs.
	SourceZoneId pulumi.StringPtrInput
	// The status of the consistent replication group. Possible values:
	// - invalid: invalid. This state indicates that there is an exception to the replication pair in the consistent replication group.
	// - creating: creating.
	// - created: created.
	// - create_failed: creation failed.
	// - manual_syncing: in a single synchronization. If it is the first single synchronization, this status is also displayed in the synchronization.
	// - syncing: synchronization. This state is the first time data is copied asynchronously between the master and slave disks.
	// - normal: normal. When data replication is completed within the current cycle of asynchronous replication, it will be in this state.
	// - stopping: stopping.
	// - stopped: stopped.
	// - stop_failed: Stop failed.
	// - Failover: failover.
	// - Failed: failover completed.
	// - failover_failed: failover failed.
	// - Reprotection: In reverse copy operation.
	// - reprotect_failed: reverse replication failed.
	// - deleting: deleting.
	// - delete_failed: delete failed.
	// - deleted: deleted.
	Status pulumi.StringPtrInput
	// The tag of the resource
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	Tags pulumi.StringMapInput
}

func (DiskReplicaGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*diskReplicaGroupState)(nil)).Elem()
}

type diskReplicaGroupArgs struct {
	// The description of the consistent replication group.
	Description *string `pulumi:"description"`
	// The ID of the region to which the disaster recovery site belongs.
	DestinationRegionId string `pulumi:"destinationRegionId"`
	// The ID of the zone to which the disaster recovery site belongs.
	DestinationZoneId string `pulumi:"destinationZoneId"`
	// Consistent replication group name.
	DiskReplicaGroupName *string `pulumi:"diskReplicaGroupName"`
	// . Field 'group_name' has been deprecated from provider version 1.245.0. New field 'disk_replica_group_name' instead.
	//
	// Deprecated: Field 'group_name' has been deprecated since provider version 1.245.0. New field 'disk_replica_group_name' instead.
	GroupName *string `pulumi:"groupName"`
	// Whether to synchronize immediately. Value range:
	// - true: Start data synchronization immediately.
	// - false: Data Synchronization starts after the RPO time period.
	//
	// Default value: false.
	OneShot *bool `pulumi:"oneShot"`
	// List of replication pair IDs contained in a consistent replication group.
	PairIds []string `pulumi:"pairIds"`
	// resource group ID of enterprise
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Specifies whether to enable the reverse replication sub-feature. Valid values: true and false. Default value: true.
	ReverseReplicate *bool `pulumi:"reverseReplicate"`
	// The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
	Rpo *int `pulumi:"rpo"`
	// The ID of the region to which the production site belongs.
	SourceRegionId string `pulumi:"sourceRegionId"`
	// The ID of the zone to which the production site belongs.
	SourceZoneId string `pulumi:"sourceZoneId"`
	// The status of the consistent replication group. Possible values:
	// - invalid: invalid. This state indicates that there is an exception to the replication pair in the consistent replication group.
	// - creating: creating.
	// - created: created.
	// - create_failed: creation failed.
	// - manual_syncing: in a single synchronization. If it is the first single synchronization, this status is also displayed in the synchronization.
	// - syncing: synchronization. This state is the first time data is copied asynchronously between the master and slave disks.
	// - normal: normal. When data replication is completed within the current cycle of asynchronous replication, it will be in this state.
	// - stopping: stopping.
	// - stopped: stopped.
	// - stop_failed: Stop failed.
	// - Failover: failover.
	// - Failed: failover completed.
	// - failover_failed: failover failed.
	// - Reprotection: In reverse copy operation.
	// - reprotect_failed: reverse replication failed.
	// - deleting: deleting.
	// - delete_failed: delete failed.
	// - deleted: deleted.
	Status *string `pulumi:"status"`
	// The tag of the resource
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a DiskReplicaGroup resource.
type DiskReplicaGroupArgs struct {
	// The description of the consistent replication group.
	Description pulumi.StringPtrInput
	// The ID of the region to which the disaster recovery site belongs.
	DestinationRegionId pulumi.StringInput
	// The ID of the zone to which the disaster recovery site belongs.
	DestinationZoneId pulumi.StringInput
	// Consistent replication group name.
	DiskReplicaGroupName pulumi.StringPtrInput
	// . Field 'group_name' has been deprecated from provider version 1.245.0. New field 'disk_replica_group_name' instead.
	//
	// Deprecated: Field 'group_name' has been deprecated since provider version 1.245.0. New field 'disk_replica_group_name' instead.
	GroupName pulumi.StringPtrInput
	// Whether to synchronize immediately. Value range:
	// - true: Start data synchronization immediately.
	// - false: Data Synchronization starts after the RPO time period.
	//
	// Default value: false.
	OneShot pulumi.BoolPtrInput
	// List of replication pair IDs contained in a consistent replication group.
	PairIds pulumi.StringArrayInput
	// resource group ID of enterprise
	ResourceGroupId pulumi.StringPtrInput
	// Specifies whether to enable the reverse replication sub-feature. Valid values: true and false. Default value: true.
	ReverseReplicate pulumi.BoolPtrInput
	// The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
	Rpo pulumi.IntPtrInput
	// The ID of the region to which the production site belongs.
	SourceRegionId pulumi.StringInput
	// The ID of the zone to which the production site belongs.
	SourceZoneId pulumi.StringInput
	// The status of the consistent replication group. Possible values:
	// - invalid: invalid. This state indicates that there is an exception to the replication pair in the consistent replication group.
	// - creating: creating.
	// - created: created.
	// - create_failed: creation failed.
	// - manual_syncing: in a single synchronization. If it is the first single synchronization, this status is also displayed in the synchronization.
	// - syncing: synchronization. This state is the first time data is copied asynchronously between the master and slave disks.
	// - normal: normal. When data replication is completed within the current cycle of asynchronous replication, it will be in this state.
	// - stopping: stopping.
	// - stopped: stopped.
	// - stop_failed: Stop failed.
	// - Failover: failover.
	// - Failed: failover completed.
	// - failover_failed: failover failed.
	// - Reprotection: In reverse copy operation.
	// - reprotect_failed: reverse replication failed.
	// - deleting: deleting.
	// - delete_failed: delete failed.
	// - deleted: deleted.
	Status pulumi.StringPtrInput
	// The tag of the resource
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	Tags pulumi.StringMapInput
}

func (DiskReplicaGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*diskReplicaGroupArgs)(nil)).Elem()
}

type DiskReplicaGroupInput interface {
	pulumi.Input

	ToDiskReplicaGroupOutput() DiskReplicaGroupOutput
	ToDiskReplicaGroupOutputWithContext(ctx context.Context) DiskReplicaGroupOutput
}

func (*DiskReplicaGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskReplicaGroup)(nil)).Elem()
}

func (i *DiskReplicaGroup) ToDiskReplicaGroupOutput() DiskReplicaGroupOutput {
	return i.ToDiskReplicaGroupOutputWithContext(context.Background())
}

func (i *DiskReplicaGroup) ToDiskReplicaGroupOutputWithContext(ctx context.Context) DiskReplicaGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskReplicaGroupOutput)
}

// DiskReplicaGroupArrayInput is an input type that accepts DiskReplicaGroupArray and DiskReplicaGroupArrayOutput values.
// You can construct a concrete instance of `DiskReplicaGroupArrayInput` via:
//
//	DiskReplicaGroupArray{ DiskReplicaGroupArgs{...} }
type DiskReplicaGroupArrayInput interface {
	pulumi.Input

	ToDiskReplicaGroupArrayOutput() DiskReplicaGroupArrayOutput
	ToDiskReplicaGroupArrayOutputWithContext(context.Context) DiskReplicaGroupArrayOutput
}

type DiskReplicaGroupArray []DiskReplicaGroupInput

func (DiskReplicaGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiskReplicaGroup)(nil)).Elem()
}

func (i DiskReplicaGroupArray) ToDiskReplicaGroupArrayOutput() DiskReplicaGroupArrayOutput {
	return i.ToDiskReplicaGroupArrayOutputWithContext(context.Background())
}

func (i DiskReplicaGroupArray) ToDiskReplicaGroupArrayOutputWithContext(ctx context.Context) DiskReplicaGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskReplicaGroupArrayOutput)
}

// DiskReplicaGroupMapInput is an input type that accepts DiskReplicaGroupMap and DiskReplicaGroupMapOutput values.
// You can construct a concrete instance of `DiskReplicaGroupMapInput` via:
//
//	DiskReplicaGroupMap{ "key": DiskReplicaGroupArgs{...} }
type DiskReplicaGroupMapInput interface {
	pulumi.Input

	ToDiskReplicaGroupMapOutput() DiskReplicaGroupMapOutput
	ToDiskReplicaGroupMapOutputWithContext(context.Context) DiskReplicaGroupMapOutput
}

type DiskReplicaGroupMap map[string]DiskReplicaGroupInput

func (DiskReplicaGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiskReplicaGroup)(nil)).Elem()
}

func (i DiskReplicaGroupMap) ToDiskReplicaGroupMapOutput() DiskReplicaGroupMapOutput {
	return i.ToDiskReplicaGroupMapOutputWithContext(context.Background())
}

func (i DiskReplicaGroupMap) ToDiskReplicaGroupMapOutputWithContext(ctx context.Context) DiskReplicaGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskReplicaGroupMapOutput)
}

type DiskReplicaGroupOutput struct{ *pulumi.OutputState }

func (DiskReplicaGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskReplicaGroup)(nil)).Elem()
}

func (o DiskReplicaGroupOutput) ToDiskReplicaGroupOutput() DiskReplicaGroupOutput {
	return o
}

func (o DiskReplicaGroupOutput) ToDiskReplicaGroupOutputWithContext(ctx context.Context) DiskReplicaGroupOutput {
	return o
}

// The description of the consistent replication group.
func (o DiskReplicaGroupOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ID of the region to which the disaster recovery site belongs.
func (o DiskReplicaGroupOutput) DestinationRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.StringOutput { return v.DestinationRegionId }).(pulumi.StringOutput)
}

// The ID of the zone to which the disaster recovery site belongs.
func (o DiskReplicaGroupOutput) DestinationZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.StringOutput { return v.DestinationZoneId }).(pulumi.StringOutput)
}

// Consistent replication group name.
func (o DiskReplicaGroupOutput) DiskReplicaGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.StringOutput { return v.DiskReplicaGroupName }).(pulumi.StringOutput)
}

// . Field 'group_name' has been deprecated from provider version 1.245.0. New field 'disk_replica_group_name' instead.
//
// Deprecated: Field 'group_name' has been deprecated since provider version 1.245.0. New field 'disk_replica_group_name' instead.
func (o DiskReplicaGroupOutput) GroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.StringOutput { return v.GroupName }).(pulumi.StringOutput)
}

// Whether to synchronize immediately. Value range:
// - true: Start data synchronization immediately.
// - false: Data Synchronization starts after the RPO time period.
//
// Default value: false.
func (o DiskReplicaGroupOutput) OneShot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.BoolPtrOutput { return v.OneShot }).(pulumi.BoolPtrOutput)
}

// List of replication pair IDs contained in a consistent replication group.
func (o DiskReplicaGroupOutput) PairIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.StringArrayOutput { return v.PairIds }).(pulumi.StringArrayOutput)
}

// resource group ID of enterprise
func (o DiskReplicaGroupOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// Specifies whether to enable the reverse replication sub-feature. Valid values: true and false. Default value: true.
func (o DiskReplicaGroupOutput) ReverseReplicate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.BoolPtrOutput { return v.ReverseReplicate }).(pulumi.BoolPtrOutput)
}

// The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
func (o DiskReplicaGroupOutput) Rpo() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.IntPtrOutput { return v.Rpo }).(pulumi.IntPtrOutput)
}

// The ID of the region to which the production site belongs.
func (o DiskReplicaGroupOutput) SourceRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.StringOutput { return v.SourceRegionId }).(pulumi.StringOutput)
}

// The ID of the zone to which the production site belongs.
func (o DiskReplicaGroupOutput) SourceZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.StringOutput { return v.SourceZoneId }).(pulumi.StringOutput)
}

// The status of the consistent replication group. Possible values:
// - invalid: invalid. This state indicates that there is an exception to the replication pair in the consistent replication group.
// - creating: creating.
// - created: created.
// - create_failed: creation failed.
// - manual_syncing: in a single synchronization. If it is the first single synchronization, this status is also displayed in the synchronization.
// - syncing: synchronization. This state is the first time data is copied asynchronously between the master and slave disks.
// - normal: normal. When data replication is completed within the current cycle of asynchronous replication, it will be in this state.
// - stopping: stopping.
// - stopped: stopped.
// - stop_failed: Stop failed.
// - Failover: failover.
// - Failed: failover completed.
// - failover_failed: failover failed.
// - Reprotection: In reverse copy operation.
// - reprotect_failed: reverse replication failed.
// - deleting: deleting.
// - delete_failed: delete failed.
// - deleted: deleted.
func (o DiskReplicaGroupOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tag of the resource
//
// The following arguments will be discarded. Please use new fields as soon as possible:
func (o DiskReplicaGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DiskReplicaGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type DiskReplicaGroupArrayOutput struct{ *pulumi.OutputState }

func (DiskReplicaGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiskReplicaGroup)(nil)).Elem()
}

func (o DiskReplicaGroupArrayOutput) ToDiskReplicaGroupArrayOutput() DiskReplicaGroupArrayOutput {
	return o
}

func (o DiskReplicaGroupArrayOutput) ToDiskReplicaGroupArrayOutputWithContext(ctx context.Context) DiskReplicaGroupArrayOutput {
	return o
}

func (o DiskReplicaGroupArrayOutput) Index(i pulumi.IntInput) DiskReplicaGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DiskReplicaGroup {
		return vs[0].([]*DiskReplicaGroup)[vs[1].(int)]
	}).(DiskReplicaGroupOutput)
}

type DiskReplicaGroupMapOutput struct{ *pulumi.OutputState }

func (DiskReplicaGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiskReplicaGroup)(nil)).Elem()
}

func (o DiskReplicaGroupMapOutput) ToDiskReplicaGroupMapOutput() DiskReplicaGroupMapOutput {
	return o
}

func (o DiskReplicaGroupMapOutput) ToDiskReplicaGroupMapOutputWithContext(ctx context.Context) DiskReplicaGroupMapOutput {
	return o
}

func (o DiskReplicaGroupMapOutput) MapIndex(k pulumi.StringInput) DiskReplicaGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DiskReplicaGroup {
		return vs[0].(map[string]*DiskReplicaGroup)[vs[1].(string)]
	}).(DiskReplicaGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DiskReplicaGroupInput)(nil)).Elem(), &DiskReplicaGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskReplicaGroupArrayInput)(nil)).Elem(), DiskReplicaGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskReplicaGroupMapInput)(nil)).Elem(), DiskReplicaGroupMap{})
	pulumi.RegisterOutputType(DiskReplicaGroupOutput{})
	pulumi.RegisterOutputType(DiskReplicaGroupArrayOutput{})
	pulumi.RegisterOutputType(DiskReplicaGroupMapOutput{})
}
