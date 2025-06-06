// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databasefilesystem

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type InstanceEcsList struct {
	// The ID of the ECS instance.
	EcsId *string `pulumi:"ecsId"`
}

// InstanceEcsListInput is an input type that accepts InstanceEcsListArgs and InstanceEcsListOutput values.
// You can construct a concrete instance of `InstanceEcsListInput` via:
//
//	InstanceEcsListArgs{...}
type InstanceEcsListInput interface {
	pulumi.Input

	ToInstanceEcsListOutput() InstanceEcsListOutput
	ToInstanceEcsListOutputWithContext(context.Context) InstanceEcsListOutput
}

type InstanceEcsListArgs struct {
	// The ID of the ECS instance.
	EcsId pulumi.StringPtrInput `pulumi:"ecsId"`
}

func (InstanceEcsListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*InstanceEcsList)(nil)).Elem()
}

func (i InstanceEcsListArgs) ToInstanceEcsListOutput() InstanceEcsListOutput {
	return i.ToInstanceEcsListOutputWithContext(context.Background())
}

func (i InstanceEcsListArgs) ToInstanceEcsListOutputWithContext(ctx context.Context) InstanceEcsListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceEcsListOutput)
}

// InstanceEcsListArrayInput is an input type that accepts InstanceEcsListArray and InstanceEcsListArrayOutput values.
// You can construct a concrete instance of `InstanceEcsListArrayInput` via:
//
//	InstanceEcsListArray{ InstanceEcsListArgs{...} }
type InstanceEcsListArrayInput interface {
	pulumi.Input

	ToInstanceEcsListArrayOutput() InstanceEcsListArrayOutput
	ToInstanceEcsListArrayOutputWithContext(context.Context) InstanceEcsListArrayOutput
}

type InstanceEcsListArray []InstanceEcsListInput

func (InstanceEcsListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InstanceEcsList)(nil)).Elem()
}

func (i InstanceEcsListArray) ToInstanceEcsListArrayOutput() InstanceEcsListArrayOutput {
	return i.ToInstanceEcsListArrayOutputWithContext(context.Background())
}

func (i InstanceEcsListArray) ToInstanceEcsListArrayOutputWithContext(ctx context.Context) InstanceEcsListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceEcsListArrayOutput)
}

type InstanceEcsListOutput struct{ *pulumi.OutputState }

func (InstanceEcsListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*InstanceEcsList)(nil)).Elem()
}

func (o InstanceEcsListOutput) ToInstanceEcsListOutput() InstanceEcsListOutput {
	return o
}

func (o InstanceEcsListOutput) ToInstanceEcsListOutputWithContext(ctx context.Context) InstanceEcsListOutput {
	return o
}

// The ID of the ECS instance.
func (o InstanceEcsListOutput) EcsId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v InstanceEcsList) *string { return v.EcsId }).(pulumi.StringPtrOutput)
}

type InstanceEcsListArrayOutput struct{ *pulumi.OutputState }

func (InstanceEcsListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InstanceEcsList)(nil)).Elem()
}

func (o InstanceEcsListArrayOutput) ToInstanceEcsListArrayOutput() InstanceEcsListArrayOutput {
	return o
}

func (o InstanceEcsListArrayOutput) ToInstanceEcsListArrayOutputWithContext(ctx context.Context) InstanceEcsListArrayOutput {
	return o
}

func (o InstanceEcsListArrayOutput) Index(i pulumi.IntInput) InstanceEcsListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) InstanceEcsList {
		return vs[0].([]InstanceEcsList)[vs[1].(int)]
	}).(InstanceEcsListOutput)
}

type GetAutoSnapShotPoliciesAutoSnapShotPolicy struct {
	// The number of database file systems set by the automatic snapshot policy.
	AppliedDbfsNumber int `pulumi:"appliedDbfsNumber"`
	// The creation time of the resource
	CreateTime string `pulumi:"createTime"`
	// The ID of the policy.
	Id string `pulumi:"id"`
	// Last modification time of automatic snapshot policy
	LastModified string `pulumi:"lastModified"`
	// Automatic snapshot policy ID
	PolicyId string `pulumi:"policyId"`
	// Automatic snapshot policy name
	PolicyName string `pulumi:"policyName"`
	// A collection of automatic snapshots performed on several days of the week.
	RepeatWeekdays []string `pulumi:"repeatWeekdays"`
	// Automatic snapshot retention days
	RetentionDays int `pulumi:"retentionDays"`
	// Automatic snapshot policy status
	Status string `pulumi:"status"`
	// Automatic snapshot policy status details
	StatusDetail string `pulumi:"statusDetail"`
	// The set of times at which the snapshot is taken on the day the automatic snapshot is executed.
	TimePoints []string `pulumi:"timePoints"`
}

// GetAutoSnapShotPoliciesAutoSnapShotPolicyInput is an input type that accepts GetAutoSnapShotPoliciesAutoSnapShotPolicyArgs and GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput values.
// You can construct a concrete instance of `GetAutoSnapShotPoliciesAutoSnapShotPolicyInput` via:
//
//	GetAutoSnapShotPoliciesAutoSnapShotPolicyArgs{...}
type GetAutoSnapShotPoliciesAutoSnapShotPolicyInput interface {
	pulumi.Input

	ToGetAutoSnapShotPoliciesAutoSnapShotPolicyOutput() GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput
	ToGetAutoSnapShotPoliciesAutoSnapShotPolicyOutputWithContext(context.Context) GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput
}

type GetAutoSnapShotPoliciesAutoSnapShotPolicyArgs struct {
	// The number of database file systems set by the automatic snapshot policy.
	AppliedDbfsNumber pulumi.IntInput `pulumi:"appliedDbfsNumber"`
	// The creation time of the resource
	CreateTime pulumi.StringInput `pulumi:"createTime"`
	// The ID of the policy.
	Id pulumi.StringInput `pulumi:"id"`
	// Last modification time of automatic snapshot policy
	LastModified pulumi.StringInput `pulumi:"lastModified"`
	// Automatic snapshot policy ID
	PolicyId pulumi.StringInput `pulumi:"policyId"`
	// Automatic snapshot policy name
	PolicyName pulumi.StringInput `pulumi:"policyName"`
	// A collection of automatic snapshots performed on several days of the week.
	RepeatWeekdays pulumi.StringArrayInput `pulumi:"repeatWeekdays"`
	// Automatic snapshot retention days
	RetentionDays pulumi.IntInput `pulumi:"retentionDays"`
	// Automatic snapshot policy status
	Status pulumi.StringInput `pulumi:"status"`
	// Automatic snapshot policy status details
	StatusDetail pulumi.StringInput `pulumi:"statusDetail"`
	// The set of times at which the snapshot is taken on the day the automatic snapshot is executed.
	TimePoints pulumi.StringArrayInput `pulumi:"timePoints"`
}

func (GetAutoSnapShotPoliciesAutoSnapShotPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAutoSnapShotPoliciesAutoSnapShotPolicy)(nil)).Elem()
}

func (i GetAutoSnapShotPoliciesAutoSnapShotPolicyArgs) ToGetAutoSnapShotPoliciesAutoSnapShotPolicyOutput() GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput {
	return i.ToGetAutoSnapShotPoliciesAutoSnapShotPolicyOutputWithContext(context.Background())
}

func (i GetAutoSnapShotPoliciesAutoSnapShotPolicyArgs) ToGetAutoSnapShotPoliciesAutoSnapShotPolicyOutputWithContext(ctx context.Context) GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput)
}

// GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayInput is an input type that accepts GetAutoSnapShotPoliciesAutoSnapShotPolicyArray and GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput values.
// You can construct a concrete instance of `GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayInput` via:
//
//	GetAutoSnapShotPoliciesAutoSnapShotPolicyArray{ GetAutoSnapShotPoliciesAutoSnapShotPolicyArgs{...} }
type GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayInput interface {
	pulumi.Input

	ToGetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput() GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput
	ToGetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutputWithContext(context.Context) GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput
}

type GetAutoSnapShotPoliciesAutoSnapShotPolicyArray []GetAutoSnapShotPoliciesAutoSnapShotPolicyInput

func (GetAutoSnapShotPoliciesAutoSnapShotPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAutoSnapShotPoliciesAutoSnapShotPolicy)(nil)).Elem()
}

func (i GetAutoSnapShotPoliciesAutoSnapShotPolicyArray) ToGetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput() GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput {
	return i.ToGetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutputWithContext(context.Background())
}

func (i GetAutoSnapShotPoliciesAutoSnapShotPolicyArray) ToGetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutputWithContext(ctx context.Context) GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput)
}

type GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput struct{ *pulumi.OutputState }

func (GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAutoSnapShotPoliciesAutoSnapShotPolicy)(nil)).Elem()
}

func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) ToGetAutoSnapShotPoliciesAutoSnapShotPolicyOutput() GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput {
	return o
}

func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) ToGetAutoSnapShotPoliciesAutoSnapShotPolicyOutputWithContext(ctx context.Context) GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput {
	return o
}

// The number of database file systems set by the automatic snapshot policy.
func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) AppliedDbfsNumber() pulumi.IntOutput {
	return o.ApplyT(func(v GetAutoSnapShotPoliciesAutoSnapShotPolicy) int { return v.AppliedDbfsNumber }).(pulumi.IntOutput)
}

// The creation time of the resource
func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetAutoSnapShotPoliciesAutoSnapShotPolicy) string { return v.CreateTime }).(pulumi.StringOutput)
}

// The ID of the policy.
func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAutoSnapShotPoliciesAutoSnapShotPolicy) string { return v.Id }).(pulumi.StringOutput)
}

// Last modification time of automatic snapshot policy
func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) LastModified() pulumi.StringOutput {
	return o.ApplyT(func(v GetAutoSnapShotPoliciesAutoSnapShotPolicy) string { return v.LastModified }).(pulumi.StringOutput)
}

// Automatic snapshot policy ID
func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) PolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAutoSnapShotPoliciesAutoSnapShotPolicy) string { return v.PolicyId }).(pulumi.StringOutput)
}

// Automatic snapshot policy name
func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) PolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v GetAutoSnapShotPoliciesAutoSnapShotPolicy) string { return v.PolicyName }).(pulumi.StringOutput)
}

// A collection of automatic snapshots performed on several days of the week.
func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) RepeatWeekdays() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAutoSnapShotPoliciesAutoSnapShotPolicy) []string { return v.RepeatWeekdays }).(pulumi.StringArrayOutput)
}

// Automatic snapshot retention days
func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) RetentionDays() pulumi.IntOutput {
	return o.ApplyT(func(v GetAutoSnapShotPoliciesAutoSnapShotPolicy) int { return v.RetentionDays }).(pulumi.IntOutput)
}

// Automatic snapshot policy status
func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetAutoSnapShotPoliciesAutoSnapShotPolicy) string { return v.Status }).(pulumi.StringOutput)
}

// Automatic snapshot policy status details
func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) StatusDetail() pulumi.StringOutput {
	return o.ApplyT(func(v GetAutoSnapShotPoliciesAutoSnapShotPolicy) string { return v.StatusDetail }).(pulumi.StringOutput)
}

// The set of times at which the snapshot is taken on the day the automatic snapshot is executed.
func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput) TimePoints() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAutoSnapShotPoliciesAutoSnapShotPolicy) []string { return v.TimePoints }).(pulumi.StringArrayOutput)
}

type GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput struct{ *pulumi.OutputState }

func (GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAutoSnapShotPoliciesAutoSnapShotPolicy)(nil)).Elem()
}

func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput) ToGetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput() GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput {
	return o
}

func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput) ToGetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutputWithContext(ctx context.Context) GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput {
	return o
}

func (o GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput) Index(i pulumi.IntInput) GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetAutoSnapShotPoliciesAutoSnapShotPolicy {
		return vs[0].([]GetAutoSnapShotPoliciesAutoSnapShotPolicy)[vs[1].(int)]
	}).(GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput)
}

type GetInstancesInstance struct {
	// the number of nodes of the Database file system.
	AttachNodeNumber int `pulumi:"attachNodeNumber"`
	// The type of the Database file system. Valid values: `standard`.
	Category string `pulumi:"category"`
	// The create time of the Database file system.
	CreateTime string `pulumi:"createTime"`
	// The cluster ID of the Database file system.
	DbfsClusterId string `pulumi:"dbfsClusterId"`
	// The collection of ECS instances mounted to the Database file system.
	EcsLists []GetInstancesInstanceEcsList `pulumi:"ecsLists"`
	// Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
	EnableRaid bool `pulumi:"enableRaid"`
	// Whether to encrypt the Database file system. Valid values: `true` and `false`.
	Encryption bool `pulumi:"encryption"`
	// The ID of the Instance.
	Id string `pulumi:"id"`
	// The ID of the Database File System
	InstanceId string `pulumi:"instanceId"`
	// The name of the Database file system.
	InstanceName string `pulumi:"instanceName"`
	// The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
	KmsKeyId string `pulumi:"kmsKeyId"`
	// Thr payment type of the Database file system. Valid value: `PayAsYouGo`.
	PaymentType string `pulumi:"paymentType"`
	// The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
	PerformanceLevel string `pulumi:"performanceLevel"`
	// The number of strip . When `enableRaid` parameter is set to `true` will transfer. This parameter is valid When `enableRaid` parameter is set to `true`.
	RaidStripeUnitNumber string `pulumi:"raidStripeUnitNumber"`
	// The size Of the Database file system. Unit: GiB.
	Size int `pulumi:"size"`
	// The status of the Database file system.
	Status string `pulumi:"status"`
	// The Zone ID of the Database file system.
	ZoneId string `pulumi:"zoneId"`
}

// GetInstancesInstanceInput is an input type that accepts GetInstancesInstanceArgs and GetInstancesInstanceOutput values.
// You can construct a concrete instance of `GetInstancesInstanceInput` via:
//
//	GetInstancesInstanceArgs{...}
type GetInstancesInstanceInput interface {
	pulumi.Input

	ToGetInstancesInstanceOutput() GetInstancesInstanceOutput
	ToGetInstancesInstanceOutputWithContext(context.Context) GetInstancesInstanceOutput
}

type GetInstancesInstanceArgs struct {
	// the number of nodes of the Database file system.
	AttachNodeNumber pulumi.IntInput `pulumi:"attachNodeNumber"`
	// The type of the Database file system. Valid values: `standard`.
	Category pulumi.StringInput `pulumi:"category"`
	// The create time of the Database file system.
	CreateTime pulumi.StringInput `pulumi:"createTime"`
	// The cluster ID of the Database file system.
	DbfsClusterId pulumi.StringInput `pulumi:"dbfsClusterId"`
	// The collection of ECS instances mounted to the Database file system.
	EcsLists GetInstancesInstanceEcsListArrayInput `pulumi:"ecsLists"`
	// Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
	EnableRaid pulumi.BoolInput `pulumi:"enableRaid"`
	// Whether to encrypt the Database file system. Valid values: `true` and `false`.
	Encryption pulumi.BoolInput `pulumi:"encryption"`
	// The ID of the Instance.
	Id pulumi.StringInput `pulumi:"id"`
	// The ID of the Database File System
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// The name of the Database file system.
	InstanceName pulumi.StringInput `pulumi:"instanceName"`
	// The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
	KmsKeyId pulumi.StringInput `pulumi:"kmsKeyId"`
	// Thr payment type of the Database file system. Valid value: `PayAsYouGo`.
	PaymentType pulumi.StringInput `pulumi:"paymentType"`
	// The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
	PerformanceLevel pulumi.StringInput `pulumi:"performanceLevel"`
	// The number of strip . When `enableRaid` parameter is set to `true` will transfer. This parameter is valid When `enableRaid` parameter is set to `true`.
	RaidStripeUnitNumber pulumi.StringInput `pulumi:"raidStripeUnitNumber"`
	// The size Of the Database file system. Unit: GiB.
	Size pulumi.IntInput `pulumi:"size"`
	// The status of the Database file system.
	Status pulumi.StringInput `pulumi:"status"`
	// The Zone ID of the Database file system.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (GetInstancesInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstance)(nil)).Elem()
}

func (i GetInstancesInstanceArgs) ToGetInstancesInstanceOutput() GetInstancesInstanceOutput {
	return i.ToGetInstancesInstanceOutputWithContext(context.Background())
}

func (i GetInstancesInstanceArgs) ToGetInstancesInstanceOutputWithContext(ctx context.Context) GetInstancesInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceOutput)
}

// GetInstancesInstanceArrayInput is an input type that accepts GetInstancesInstanceArray and GetInstancesInstanceArrayOutput values.
// You can construct a concrete instance of `GetInstancesInstanceArrayInput` via:
//
//	GetInstancesInstanceArray{ GetInstancesInstanceArgs{...} }
type GetInstancesInstanceArrayInput interface {
	pulumi.Input

	ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput
	ToGetInstancesInstanceArrayOutputWithContext(context.Context) GetInstancesInstanceArrayOutput
}

type GetInstancesInstanceArray []GetInstancesInstanceInput

func (GetInstancesInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstance)(nil)).Elem()
}

func (i GetInstancesInstanceArray) ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput {
	return i.ToGetInstancesInstanceArrayOutputWithContext(context.Background())
}

func (i GetInstancesInstanceArray) ToGetInstancesInstanceArrayOutputWithContext(ctx context.Context) GetInstancesInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceArrayOutput)
}

type GetInstancesInstanceOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstance)(nil)).Elem()
}

func (o GetInstancesInstanceOutput) ToGetInstancesInstanceOutput() GetInstancesInstanceOutput {
	return o
}

func (o GetInstancesInstanceOutput) ToGetInstancesInstanceOutputWithContext(ctx context.Context) GetInstancesInstanceOutput {
	return o
}

// the number of nodes of the Database file system.
func (o GetInstancesInstanceOutput) AttachNodeNumber() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstancesInstance) int { return v.AttachNodeNumber }).(pulumi.IntOutput)
}

// The type of the Database file system. Valid values: `standard`.
func (o GetInstancesInstanceOutput) Category() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Category }).(pulumi.StringOutput)
}

// The create time of the Database file system.
func (o GetInstancesInstanceOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.CreateTime }).(pulumi.StringOutput)
}

// The cluster ID of the Database file system.
func (o GetInstancesInstanceOutput) DbfsClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.DbfsClusterId }).(pulumi.StringOutput)
}

// The collection of ECS instances mounted to the Database file system.
func (o GetInstancesInstanceOutput) EcsLists() GetInstancesInstanceEcsListArrayOutput {
	return o.ApplyT(func(v GetInstancesInstance) []GetInstancesInstanceEcsList { return v.EcsLists }).(GetInstancesInstanceEcsListArrayOutput)
}

// Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
func (o GetInstancesInstanceOutput) EnableRaid() pulumi.BoolOutput {
	return o.ApplyT(func(v GetInstancesInstance) bool { return v.EnableRaid }).(pulumi.BoolOutput)
}

// Whether to encrypt the Database file system. Valid values: `true` and `false`.
func (o GetInstancesInstanceOutput) Encryption() pulumi.BoolOutput {
	return o.ApplyT(func(v GetInstancesInstance) bool { return v.Encryption }).(pulumi.BoolOutput)
}

// The ID of the Instance.
func (o GetInstancesInstanceOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Id }).(pulumi.StringOutput)
}

// The ID of the Database File System
func (o GetInstancesInstanceOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.InstanceId }).(pulumi.StringOutput)
}

// The name of the Database file system.
func (o GetInstancesInstanceOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.InstanceName }).(pulumi.StringOutput)
}

// The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
func (o GetInstancesInstanceOutput) KmsKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.KmsKeyId }).(pulumi.StringOutput)
}

// Thr payment type of the Database file system. Valid value: `PayAsYouGo`.
func (o GetInstancesInstanceOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.PaymentType }).(pulumi.StringOutput)
}

// The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
func (o GetInstancesInstanceOutput) PerformanceLevel() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.PerformanceLevel }).(pulumi.StringOutput)
}

// The number of strip . When `enableRaid` parameter is set to `true` will transfer. This parameter is valid When `enableRaid` parameter is set to `true`.
func (o GetInstancesInstanceOutput) RaidStripeUnitNumber() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.RaidStripeUnitNumber }).(pulumi.StringOutput)
}

// The size Of the Database file system. Unit: GiB.
func (o GetInstancesInstanceOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstancesInstance) int { return v.Size }).(pulumi.IntOutput)
}

// The status of the Database file system.
func (o GetInstancesInstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Status }).(pulumi.StringOutput)
}

// The Zone ID of the Database file system.
func (o GetInstancesInstanceOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.ZoneId }).(pulumi.StringOutput)
}

type GetInstancesInstanceArrayOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstance)(nil)).Elem()
}

func (o GetInstancesInstanceArrayOutput) ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput {
	return o
}

func (o GetInstancesInstanceArrayOutput) ToGetInstancesInstanceArrayOutputWithContext(ctx context.Context) GetInstancesInstanceArrayOutput {
	return o
}

func (o GetInstancesInstanceArrayOutput) Index(i pulumi.IntInput) GetInstancesInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetInstancesInstance {
		return vs[0].([]GetInstancesInstance)[vs[1].(int)]
	}).(GetInstancesInstanceOutput)
}

type GetInstancesInstanceEcsList struct {
	// The ID of the ECS instance.
	EcsId string `pulumi:"ecsId"`
}

// GetInstancesInstanceEcsListInput is an input type that accepts GetInstancesInstanceEcsListArgs and GetInstancesInstanceEcsListOutput values.
// You can construct a concrete instance of `GetInstancesInstanceEcsListInput` via:
//
//	GetInstancesInstanceEcsListArgs{...}
type GetInstancesInstanceEcsListInput interface {
	pulumi.Input

	ToGetInstancesInstanceEcsListOutput() GetInstancesInstanceEcsListOutput
	ToGetInstancesInstanceEcsListOutputWithContext(context.Context) GetInstancesInstanceEcsListOutput
}

type GetInstancesInstanceEcsListArgs struct {
	// The ID of the ECS instance.
	EcsId pulumi.StringInput `pulumi:"ecsId"`
}

func (GetInstancesInstanceEcsListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstanceEcsList)(nil)).Elem()
}

func (i GetInstancesInstanceEcsListArgs) ToGetInstancesInstanceEcsListOutput() GetInstancesInstanceEcsListOutput {
	return i.ToGetInstancesInstanceEcsListOutputWithContext(context.Background())
}

func (i GetInstancesInstanceEcsListArgs) ToGetInstancesInstanceEcsListOutputWithContext(ctx context.Context) GetInstancesInstanceEcsListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceEcsListOutput)
}

// GetInstancesInstanceEcsListArrayInput is an input type that accepts GetInstancesInstanceEcsListArray and GetInstancesInstanceEcsListArrayOutput values.
// You can construct a concrete instance of `GetInstancesInstanceEcsListArrayInput` via:
//
//	GetInstancesInstanceEcsListArray{ GetInstancesInstanceEcsListArgs{...} }
type GetInstancesInstanceEcsListArrayInput interface {
	pulumi.Input

	ToGetInstancesInstanceEcsListArrayOutput() GetInstancesInstanceEcsListArrayOutput
	ToGetInstancesInstanceEcsListArrayOutputWithContext(context.Context) GetInstancesInstanceEcsListArrayOutput
}

type GetInstancesInstanceEcsListArray []GetInstancesInstanceEcsListInput

func (GetInstancesInstanceEcsListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstanceEcsList)(nil)).Elem()
}

func (i GetInstancesInstanceEcsListArray) ToGetInstancesInstanceEcsListArrayOutput() GetInstancesInstanceEcsListArrayOutput {
	return i.ToGetInstancesInstanceEcsListArrayOutputWithContext(context.Background())
}

func (i GetInstancesInstanceEcsListArray) ToGetInstancesInstanceEcsListArrayOutputWithContext(ctx context.Context) GetInstancesInstanceEcsListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceEcsListArrayOutput)
}

type GetInstancesInstanceEcsListOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceEcsListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstanceEcsList)(nil)).Elem()
}

func (o GetInstancesInstanceEcsListOutput) ToGetInstancesInstanceEcsListOutput() GetInstancesInstanceEcsListOutput {
	return o
}

func (o GetInstancesInstanceEcsListOutput) ToGetInstancesInstanceEcsListOutputWithContext(ctx context.Context) GetInstancesInstanceEcsListOutput {
	return o
}

// The ID of the ECS instance.
func (o GetInstancesInstanceEcsListOutput) EcsId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstanceEcsList) string { return v.EcsId }).(pulumi.StringOutput)
}

type GetInstancesInstanceEcsListArrayOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceEcsListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstanceEcsList)(nil)).Elem()
}

func (o GetInstancesInstanceEcsListArrayOutput) ToGetInstancesInstanceEcsListArrayOutput() GetInstancesInstanceEcsListArrayOutput {
	return o
}

func (o GetInstancesInstanceEcsListArrayOutput) ToGetInstancesInstanceEcsListArrayOutputWithContext(ctx context.Context) GetInstancesInstanceEcsListArrayOutput {
	return o
}

func (o GetInstancesInstanceEcsListArrayOutput) Index(i pulumi.IntInput) GetInstancesInstanceEcsListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetInstancesInstanceEcsList {
		return vs[0].([]GetInstancesInstanceEcsList)[vs[1].(int)]
	}).(GetInstancesInstanceEcsListOutput)
}

type GetSnapshotsSnapshot struct {
	// The type of the Snapshot.
	Category string `pulumi:"category"`
	// The creation time of the snapshot.
	CreateTime string `pulumi:"createTime"`
	// The description of the snapshot.
	Description string `pulumi:"description"`
	// The ID of the Snapshot.
	Id string `pulumi:"id"`
	// The ID of the database file system.
	InstanceId string `pulumi:"instanceId"`
	// The last modification time of the snapshot.
	LastModifiedTime string `pulumi:"lastModifiedTime"`
	// The progress of the snapshot.
	Progress string `pulumi:"progress"`
	// The remaining completion time of the snapshot being created, in seconds.
	RemainTime int `pulumi:"remainTime"`
	// The retention days of the snapshot.
	RetentionDays int `pulumi:"retentionDays"`
	// The ID of the snapshot.
	SnapshotId string `pulumi:"snapshotId"`
	// The name of the snapshot.
	SnapshotName string `pulumi:"snapshotName"`
	// The creation of the snapshot.
	SnapshotType string `pulumi:"snapshotType"`
	// Source database file system capacity.
	SourceFsSize int `pulumi:"sourceFsSize"`
	// The status of the snapshot. Possible values: `progressing`, `accomplished`, `failed`.
	Status string `pulumi:"status"`
}

// GetSnapshotsSnapshotInput is an input type that accepts GetSnapshotsSnapshotArgs and GetSnapshotsSnapshotOutput values.
// You can construct a concrete instance of `GetSnapshotsSnapshotInput` via:
//
//	GetSnapshotsSnapshotArgs{...}
type GetSnapshotsSnapshotInput interface {
	pulumi.Input

	ToGetSnapshotsSnapshotOutput() GetSnapshotsSnapshotOutput
	ToGetSnapshotsSnapshotOutputWithContext(context.Context) GetSnapshotsSnapshotOutput
}

type GetSnapshotsSnapshotArgs struct {
	// The type of the Snapshot.
	Category pulumi.StringInput `pulumi:"category"`
	// The creation time of the snapshot.
	CreateTime pulumi.StringInput `pulumi:"createTime"`
	// The description of the snapshot.
	Description pulumi.StringInput `pulumi:"description"`
	// The ID of the Snapshot.
	Id pulumi.StringInput `pulumi:"id"`
	// The ID of the database file system.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// The last modification time of the snapshot.
	LastModifiedTime pulumi.StringInput `pulumi:"lastModifiedTime"`
	// The progress of the snapshot.
	Progress pulumi.StringInput `pulumi:"progress"`
	// The remaining completion time of the snapshot being created, in seconds.
	RemainTime pulumi.IntInput `pulumi:"remainTime"`
	// The retention days of the snapshot.
	RetentionDays pulumi.IntInput `pulumi:"retentionDays"`
	// The ID of the snapshot.
	SnapshotId pulumi.StringInput `pulumi:"snapshotId"`
	// The name of the snapshot.
	SnapshotName pulumi.StringInput `pulumi:"snapshotName"`
	// The creation of the snapshot.
	SnapshotType pulumi.StringInput `pulumi:"snapshotType"`
	// Source database file system capacity.
	SourceFsSize pulumi.IntInput `pulumi:"sourceFsSize"`
	// The status of the snapshot. Possible values: `progressing`, `accomplished`, `failed`.
	Status pulumi.StringInput `pulumi:"status"`
}

func (GetSnapshotsSnapshotArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotsSnapshot)(nil)).Elem()
}

func (i GetSnapshotsSnapshotArgs) ToGetSnapshotsSnapshotOutput() GetSnapshotsSnapshotOutput {
	return i.ToGetSnapshotsSnapshotOutputWithContext(context.Background())
}

func (i GetSnapshotsSnapshotArgs) ToGetSnapshotsSnapshotOutputWithContext(ctx context.Context) GetSnapshotsSnapshotOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSnapshotsSnapshotOutput)
}

// GetSnapshotsSnapshotArrayInput is an input type that accepts GetSnapshotsSnapshotArray and GetSnapshotsSnapshotArrayOutput values.
// You can construct a concrete instance of `GetSnapshotsSnapshotArrayInput` via:
//
//	GetSnapshotsSnapshotArray{ GetSnapshotsSnapshotArgs{...} }
type GetSnapshotsSnapshotArrayInput interface {
	pulumi.Input

	ToGetSnapshotsSnapshotArrayOutput() GetSnapshotsSnapshotArrayOutput
	ToGetSnapshotsSnapshotArrayOutputWithContext(context.Context) GetSnapshotsSnapshotArrayOutput
}

type GetSnapshotsSnapshotArray []GetSnapshotsSnapshotInput

func (GetSnapshotsSnapshotArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSnapshotsSnapshot)(nil)).Elem()
}

func (i GetSnapshotsSnapshotArray) ToGetSnapshotsSnapshotArrayOutput() GetSnapshotsSnapshotArrayOutput {
	return i.ToGetSnapshotsSnapshotArrayOutputWithContext(context.Background())
}

func (i GetSnapshotsSnapshotArray) ToGetSnapshotsSnapshotArrayOutputWithContext(ctx context.Context) GetSnapshotsSnapshotArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSnapshotsSnapshotArrayOutput)
}

type GetSnapshotsSnapshotOutput struct{ *pulumi.OutputState }

func (GetSnapshotsSnapshotOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotsSnapshot)(nil)).Elem()
}

func (o GetSnapshotsSnapshotOutput) ToGetSnapshotsSnapshotOutput() GetSnapshotsSnapshotOutput {
	return o
}

func (o GetSnapshotsSnapshotOutput) ToGetSnapshotsSnapshotOutputWithContext(ctx context.Context) GetSnapshotsSnapshotOutput {
	return o
}

// The type of the Snapshot.
func (o GetSnapshotsSnapshotOutput) Category() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) string { return v.Category }).(pulumi.StringOutput)
}

// The creation time of the snapshot.
func (o GetSnapshotsSnapshotOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) string { return v.CreateTime }).(pulumi.StringOutput)
}

// The description of the snapshot.
func (o GetSnapshotsSnapshotOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) string { return v.Description }).(pulumi.StringOutput)
}

// The ID of the Snapshot.
func (o GetSnapshotsSnapshotOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) string { return v.Id }).(pulumi.StringOutput)
}

// The ID of the database file system.
func (o GetSnapshotsSnapshotOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) string { return v.InstanceId }).(pulumi.StringOutput)
}

// The last modification time of the snapshot.
func (o GetSnapshotsSnapshotOutput) LastModifiedTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) string { return v.LastModifiedTime }).(pulumi.StringOutput)
}

// The progress of the snapshot.
func (o GetSnapshotsSnapshotOutput) Progress() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) string { return v.Progress }).(pulumi.StringOutput)
}

// The remaining completion time of the snapshot being created, in seconds.
func (o GetSnapshotsSnapshotOutput) RemainTime() pulumi.IntOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) int { return v.RemainTime }).(pulumi.IntOutput)
}

// The retention days of the snapshot.
func (o GetSnapshotsSnapshotOutput) RetentionDays() pulumi.IntOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) int { return v.RetentionDays }).(pulumi.IntOutput)
}

// The ID of the snapshot.
func (o GetSnapshotsSnapshotOutput) SnapshotId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) string { return v.SnapshotId }).(pulumi.StringOutput)
}

// The name of the snapshot.
func (o GetSnapshotsSnapshotOutput) SnapshotName() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) string { return v.SnapshotName }).(pulumi.StringOutput)
}

// The creation of the snapshot.
func (o GetSnapshotsSnapshotOutput) SnapshotType() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) string { return v.SnapshotType }).(pulumi.StringOutput)
}

// Source database file system capacity.
func (o GetSnapshotsSnapshotOutput) SourceFsSize() pulumi.IntOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) int { return v.SourceFsSize }).(pulumi.IntOutput)
}

// The status of the snapshot. Possible values: `progressing`, `accomplished`, `failed`.
func (o GetSnapshotsSnapshotOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsSnapshot) string { return v.Status }).(pulumi.StringOutput)
}

type GetSnapshotsSnapshotArrayOutput struct{ *pulumi.OutputState }

func (GetSnapshotsSnapshotArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSnapshotsSnapshot)(nil)).Elem()
}

func (o GetSnapshotsSnapshotArrayOutput) ToGetSnapshotsSnapshotArrayOutput() GetSnapshotsSnapshotArrayOutput {
	return o
}

func (o GetSnapshotsSnapshotArrayOutput) ToGetSnapshotsSnapshotArrayOutputWithContext(ctx context.Context) GetSnapshotsSnapshotArrayOutput {
	return o
}

func (o GetSnapshotsSnapshotArrayOutput) Index(i pulumi.IntInput) GetSnapshotsSnapshotOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetSnapshotsSnapshot {
		return vs[0].([]GetSnapshotsSnapshot)[vs[1].(int)]
	}).(GetSnapshotsSnapshotOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceEcsListInput)(nil)).Elem(), InstanceEcsListArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceEcsListArrayInput)(nil)).Elem(), InstanceEcsListArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAutoSnapShotPoliciesAutoSnapShotPolicyInput)(nil)).Elem(), GetAutoSnapShotPoliciesAutoSnapShotPolicyArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayInput)(nil)).Elem(), GetAutoSnapShotPoliciesAutoSnapShotPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetInstancesInstanceInput)(nil)).Elem(), GetInstancesInstanceArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetInstancesInstanceArrayInput)(nil)).Elem(), GetInstancesInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetInstancesInstanceEcsListInput)(nil)).Elem(), GetInstancesInstanceEcsListArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetInstancesInstanceEcsListArrayInput)(nil)).Elem(), GetInstancesInstanceEcsListArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetSnapshotsSnapshotInput)(nil)).Elem(), GetSnapshotsSnapshotArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetSnapshotsSnapshotArrayInput)(nil)).Elem(), GetSnapshotsSnapshotArray{})
	pulumi.RegisterOutputType(InstanceEcsListOutput{})
	pulumi.RegisterOutputType(InstanceEcsListArrayOutput{})
	pulumi.RegisterOutputType(GetAutoSnapShotPoliciesAutoSnapShotPolicyOutput{})
	pulumi.RegisterOutputType(GetAutoSnapShotPoliciesAutoSnapShotPolicyArrayOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceArrayOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceEcsListOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceEcsListArrayOutput{})
	pulumi.RegisterOutputType(GetSnapshotsSnapshotOutput{})
	pulumi.RegisterOutputType(GetSnapshotsSnapshotArrayOutput{})
}
