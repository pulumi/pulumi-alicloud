// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ebs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a EBS Replica Group Drill resource.
//
// For information about EBS Replica Group Drill and how to use it, see [What is Replica Group Drill](https://www.alibabacloud.com/help/en/).
//
// > **NOTE:** Available since v1.215.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ebs"
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
//			_, err := ebs.NewReplicaGroupDrill(ctx, "default", &ebs.ReplicaGroupDrillArgs{
//				GroupId: pulumi.String("pg-m1H9aaOUIGsDUwgZ"),
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
// EBS Replica Group Drill can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ebs/replicaGroupDrill:ReplicaGroupDrill example <group_id>:<replica_group_drill_id>
//
// ```
type ReplicaGroupDrill struct {
	pulumi.CustomResourceState

	// The ID of the replication group. You can use the describediskreplicaggroups interface to query the asynchronous replication group list to obtain the value of the replication group ID input parameter.
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// The first ID of the resource.
	ReplicaGroupDrillId pulumi.StringOutput `pulumi:"replicaGroupDrillId"`
	// Walkthrough status. _failed: Execution failed._failed: Cleanup failed.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewReplicaGroupDrill registers a new resource with the given unique name, arguments, and options.
func NewReplicaGroupDrill(ctx *pulumi.Context,
	name string, args *ReplicaGroupDrillArgs, opts ...pulumi.ResourceOption) (*ReplicaGroupDrill, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ReplicaGroupDrill
	err := ctx.RegisterResource("alicloud:ebs/replicaGroupDrill:ReplicaGroupDrill", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReplicaGroupDrill gets an existing ReplicaGroupDrill resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReplicaGroupDrill(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReplicaGroupDrillState, opts ...pulumi.ResourceOption) (*ReplicaGroupDrill, error) {
	var resource ReplicaGroupDrill
	err := ctx.ReadResource("alicloud:ebs/replicaGroupDrill:ReplicaGroupDrill", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ReplicaGroupDrill resources.
type replicaGroupDrillState struct {
	// The ID of the replication group. You can use the describediskreplicaggroups interface to query the asynchronous replication group list to obtain the value of the replication group ID input parameter.
	GroupId *string `pulumi:"groupId"`
	// The first ID of the resource.
	ReplicaGroupDrillId *string `pulumi:"replicaGroupDrillId"`
	// Walkthrough status. _failed: Execution failed._failed: Cleanup failed.
	Status *string `pulumi:"status"`
}

type ReplicaGroupDrillState struct {
	// The ID of the replication group. You can use the describediskreplicaggroups interface to query the asynchronous replication group list to obtain the value of the replication group ID input parameter.
	GroupId pulumi.StringPtrInput
	// The first ID of the resource.
	ReplicaGroupDrillId pulumi.StringPtrInput
	// Walkthrough status. _failed: Execution failed._failed: Cleanup failed.
	Status pulumi.StringPtrInput
}

func (ReplicaGroupDrillState) ElementType() reflect.Type {
	return reflect.TypeOf((*replicaGroupDrillState)(nil)).Elem()
}

type replicaGroupDrillArgs struct {
	// The ID of the replication group. You can use the describediskreplicaggroups interface to query the asynchronous replication group list to obtain the value of the replication group ID input parameter.
	GroupId string `pulumi:"groupId"`
}

// The set of arguments for constructing a ReplicaGroupDrill resource.
type ReplicaGroupDrillArgs struct {
	// The ID of the replication group. You can use the describediskreplicaggroups interface to query the asynchronous replication group list to obtain the value of the replication group ID input parameter.
	GroupId pulumi.StringInput
}

func (ReplicaGroupDrillArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*replicaGroupDrillArgs)(nil)).Elem()
}

type ReplicaGroupDrillInput interface {
	pulumi.Input

	ToReplicaGroupDrillOutput() ReplicaGroupDrillOutput
	ToReplicaGroupDrillOutputWithContext(ctx context.Context) ReplicaGroupDrillOutput
}

func (*ReplicaGroupDrill) ElementType() reflect.Type {
	return reflect.TypeOf((**ReplicaGroupDrill)(nil)).Elem()
}

func (i *ReplicaGroupDrill) ToReplicaGroupDrillOutput() ReplicaGroupDrillOutput {
	return i.ToReplicaGroupDrillOutputWithContext(context.Background())
}

func (i *ReplicaGroupDrill) ToReplicaGroupDrillOutputWithContext(ctx context.Context) ReplicaGroupDrillOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReplicaGroupDrillOutput)
}

// ReplicaGroupDrillArrayInput is an input type that accepts ReplicaGroupDrillArray and ReplicaGroupDrillArrayOutput values.
// You can construct a concrete instance of `ReplicaGroupDrillArrayInput` via:
//
//	ReplicaGroupDrillArray{ ReplicaGroupDrillArgs{...} }
type ReplicaGroupDrillArrayInput interface {
	pulumi.Input

	ToReplicaGroupDrillArrayOutput() ReplicaGroupDrillArrayOutput
	ToReplicaGroupDrillArrayOutputWithContext(context.Context) ReplicaGroupDrillArrayOutput
}

type ReplicaGroupDrillArray []ReplicaGroupDrillInput

func (ReplicaGroupDrillArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReplicaGroupDrill)(nil)).Elem()
}

func (i ReplicaGroupDrillArray) ToReplicaGroupDrillArrayOutput() ReplicaGroupDrillArrayOutput {
	return i.ToReplicaGroupDrillArrayOutputWithContext(context.Background())
}

func (i ReplicaGroupDrillArray) ToReplicaGroupDrillArrayOutputWithContext(ctx context.Context) ReplicaGroupDrillArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReplicaGroupDrillArrayOutput)
}

// ReplicaGroupDrillMapInput is an input type that accepts ReplicaGroupDrillMap and ReplicaGroupDrillMapOutput values.
// You can construct a concrete instance of `ReplicaGroupDrillMapInput` via:
//
//	ReplicaGroupDrillMap{ "key": ReplicaGroupDrillArgs{...} }
type ReplicaGroupDrillMapInput interface {
	pulumi.Input

	ToReplicaGroupDrillMapOutput() ReplicaGroupDrillMapOutput
	ToReplicaGroupDrillMapOutputWithContext(context.Context) ReplicaGroupDrillMapOutput
}

type ReplicaGroupDrillMap map[string]ReplicaGroupDrillInput

func (ReplicaGroupDrillMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReplicaGroupDrill)(nil)).Elem()
}

func (i ReplicaGroupDrillMap) ToReplicaGroupDrillMapOutput() ReplicaGroupDrillMapOutput {
	return i.ToReplicaGroupDrillMapOutputWithContext(context.Background())
}

func (i ReplicaGroupDrillMap) ToReplicaGroupDrillMapOutputWithContext(ctx context.Context) ReplicaGroupDrillMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReplicaGroupDrillMapOutput)
}

type ReplicaGroupDrillOutput struct{ *pulumi.OutputState }

func (ReplicaGroupDrillOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ReplicaGroupDrill)(nil)).Elem()
}

func (o ReplicaGroupDrillOutput) ToReplicaGroupDrillOutput() ReplicaGroupDrillOutput {
	return o
}

func (o ReplicaGroupDrillOutput) ToReplicaGroupDrillOutputWithContext(ctx context.Context) ReplicaGroupDrillOutput {
	return o
}

// The ID of the replication group. You can use the describediskreplicaggroups interface to query the asynchronous replication group list to obtain the value of the replication group ID input parameter.
func (o ReplicaGroupDrillOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *ReplicaGroupDrill) pulumi.StringOutput { return v.GroupId }).(pulumi.StringOutput)
}

// The first ID of the resource.
func (o ReplicaGroupDrillOutput) ReplicaGroupDrillId() pulumi.StringOutput {
	return o.ApplyT(func(v *ReplicaGroupDrill) pulumi.StringOutput { return v.ReplicaGroupDrillId }).(pulumi.StringOutput)
}

// Walkthrough status. _failed: Execution failed._failed: Cleanup failed.
func (o ReplicaGroupDrillOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ReplicaGroupDrill) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type ReplicaGroupDrillArrayOutput struct{ *pulumi.OutputState }

func (ReplicaGroupDrillArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReplicaGroupDrill)(nil)).Elem()
}

func (o ReplicaGroupDrillArrayOutput) ToReplicaGroupDrillArrayOutput() ReplicaGroupDrillArrayOutput {
	return o
}

func (o ReplicaGroupDrillArrayOutput) ToReplicaGroupDrillArrayOutputWithContext(ctx context.Context) ReplicaGroupDrillArrayOutput {
	return o
}

func (o ReplicaGroupDrillArrayOutput) Index(i pulumi.IntInput) ReplicaGroupDrillOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ReplicaGroupDrill {
		return vs[0].([]*ReplicaGroupDrill)[vs[1].(int)]
	}).(ReplicaGroupDrillOutput)
}

type ReplicaGroupDrillMapOutput struct{ *pulumi.OutputState }

func (ReplicaGroupDrillMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReplicaGroupDrill)(nil)).Elem()
}

func (o ReplicaGroupDrillMapOutput) ToReplicaGroupDrillMapOutput() ReplicaGroupDrillMapOutput {
	return o
}

func (o ReplicaGroupDrillMapOutput) ToReplicaGroupDrillMapOutputWithContext(ctx context.Context) ReplicaGroupDrillMapOutput {
	return o
}

func (o ReplicaGroupDrillMapOutput) MapIndex(k pulumi.StringInput) ReplicaGroupDrillOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ReplicaGroupDrill {
		return vs[0].(map[string]*ReplicaGroupDrill)[vs[1].(string)]
	}).(ReplicaGroupDrillOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReplicaGroupDrillInput)(nil)).Elem(), &ReplicaGroupDrill{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReplicaGroupDrillArrayInput)(nil)).Elem(), ReplicaGroupDrillArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReplicaGroupDrillMapInput)(nil)).Elem(), ReplicaGroupDrillMap{})
	pulumi.RegisterOutputType(ReplicaGroupDrillOutput{})
	pulumi.RegisterOutputType(ReplicaGroupDrillArrayOutput{})
	pulumi.RegisterOutputType(ReplicaGroupDrillMapOutput{})
}