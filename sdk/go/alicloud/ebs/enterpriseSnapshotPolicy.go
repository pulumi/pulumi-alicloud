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

// Provides a EBS Enterprise Snapshot Policy resource. enterprise snapshot policy.
//
// For information about EBS Enterprise Snapshot Policy and how to use it, see [What is Enterprise Snapshot Policy](https://next.api.aliyun.com/api/ebs/2021-07-30/CreateEnterpriseSnapshotPolicy).
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
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
//			_, err := ecs.NewEcsDisk(ctx, "defaultJkW46o", &ecs.EcsDiskArgs{
//				Category:         pulumi.String("cloud_essd"),
//				Description:      pulumi.String("esp-attachment-test"),
//				ZoneId:           pulumi.String("cn-hangzhou-i"),
//				PerformanceLevel: pulumi.String("PL1"),
//				Size:             pulumi.Int(20),
//				DiskName:         pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ebs.NewEnterpriseSnapshotPolicy(ctx, "defaultPE3jjR", &ebs.EnterpriseSnapshotPolicyArgs{
//				Status: pulumi.String("DISABLED"),
//				Desc:   pulumi.String("DESC"),
//				Schedule: &ebs.EnterpriseSnapshotPolicyScheduleArgs{
//					CronExpression: pulumi.String("0 0 0 1 * ?"),
//				},
//				EnterpriseSnapshotPolicyName: pulumi.String(name),
//				TargetType:                   pulumi.String("DISK"),
//				RetainRule: &ebs.EnterpriseSnapshotPolicyRetainRuleArgs{
//					TimeInterval: pulumi.Int(120),
//					TimeUnit:     pulumi.String("DAYS"),
//				},
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
// EBS Enterprise Snapshot Policy can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ebs/enterpriseSnapshotPolicy:EnterpriseSnapshotPolicy example <id>
// ```
type EnterpriseSnapshotPolicy struct {
	pulumi.CustomResourceState

	// The creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Snapshot replication information. See `crossRegionCopyInfo` below.
	CrossRegionCopyInfo EnterpriseSnapshotPolicyCrossRegionCopyInfoOutput `pulumi:"crossRegionCopyInfo"`
	// Description information representing the resource.
	Desc pulumi.StringPtrOutput `pulumi:"desc"`
	// The name of the resource.
	EnterpriseSnapshotPolicyName pulumi.StringOutput `pulumi:"enterpriseSnapshotPolicyName"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// Snapshot retention policy representing resources. See `retainRule` below.
	RetainRule EnterpriseSnapshotPolicyRetainRuleOutput `pulumi:"retainRule"`
	// The scheduling plan that represents the resource. See `schedule` below.
	Schedule EnterpriseSnapshotPolicyScheduleOutput `pulumi:"schedule"`
	// Snapshot special retention rules. See `specialRetainRules` below.
	SpecialRetainRules EnterpriseSnapshotPolicySpecialRetainRulesOutput `pulumi:"specialRetainRules"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// Snapshot storage policy. See `storageRule` below.
	StorageRule EnterpriseSnapshotPolicyStorageRulePtrOutput `pulumi:"storageRule"`
	// The tag of the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Represents the target type of resource binding.
	TargetType pulumi.StringOutput `pulumi:"targetType"`
}

// NewEnterpriseSnapshotPolicy registers a new resource with the given unique name, arguments, and options.
func NewEnterpriseSnapshotPolicy(ctx *pulumi.Context,
	name string, args *EnterpriseSnapshotPolicyArgs, opts ...pulumi.ResourceOption) (*EnterpriseSnapshotPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnterpriseSnapshotPolicyName == nil {
		return nil, errors.New("invalid value for required argument 'EnterpriseSnapshotPolicyName'")
	}
	if args.RetainRule == nil {
		return nil, errors.New("invalid value for required argument 'RetainRule'")
	}
	if args.Schedule == nil {
		return nil, errors.New("invalid value for required argument 'Schedule'")
	}
	if args.TargetType == nil {
		return nil, errors.New("invalid value for required argument 'TargetType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EnterpriseSnapshotPolicy
	err := ctx.RegisterResource("alicloud:ebs/enterpriseSnapshotPolicy:EnterpriseSnapshotPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEnterpriseSnapshotPolicy gets an existing EnterpriseSnapshotPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEnterpriseSnapshotPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EnterpriseSnapshotPolicyState, opts ...pulumi.ResourceOption) (*EnterpriseSnapshotPolicy, error) {
	var resource EnterpriseSnapshotPolicy
	err := ctx.ReadResource("alicloud:ebs/enterpriseSnapshotPolicy:EnterpriseSnapshotPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EnterpriseSnapshotPolicy resources.
type enterpriseSnapshotPolicyState struct {
	// The creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// Snapshot replication information. See `crossRegionCopyInfo` below.
	CrossRegionCopyInfo *EnterpriseSnapshotPolicyCrossRegionCopyInfo `pulumi:"crossRegionCopyInfo"`
	// Description information representing the resource.
	Desc *string `pulumi:"desc"`
	// The name of the resource.
	EnterpriseSnapshotPolicyName *string `pulumi:"enterpriseSnapshotPolicyName"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Snapshot retention policy representing resources. See `retainRule` below.
	RetainRule *EnterpriseSnapshotPolicyRetainRule `pulumi:"retainRule"`
	// The scheduling plan that represents the resource. See `schedule` below.
	Schedule *EnterpriseSnapshotPolicySchedule `pulumi:"schedule"`
	// Snapshot special retention rules. See `specialRetainRules` below.
	SpecialRetainRules *EnterpriseSnapshotPolicySpecialRetainRules `pulumi:"specialRetainRules"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// Snapshot storage policy. See `storageRule` below.
	StorageRule *EnterpriseSnapshotPolicyStorageRule `pulumi:"storageRule"`
	// The tag of the resource.
	Tags map[string]string `pulumi:"tags"`
	// Represents the target type of resource binding.
	TargetType *string `pulumi:"targetType"`
}

type EnterpriseSnapshotPolicyState struct {
	// The creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// Snapshot replication information. See `crossRegionCopyInfo` below.
	CrossRegionCopyInfo EnterpriseSnapshotPolicyCrossRegionCopyInfoPtrInput
	// Description information representing the resource.
	Desc pulumi.StringPtrInput
	// The name of the resource.
	EnterpriseSnapshotPolicyName pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// Snapshot retention policy representing resources. See `retainRule` below.
	RetainRule EnterpriseSnapshotPolicyRetainRulePtrInput
	// The scheduling plan that represents the resource. See `schedule` below.
	Schedule EnterpriseSnapshotPolicySchedulePtrInput
	// Snapshot special retention rules. See `specialRetainRules` below.
	SpecialRetainRules EnterpriseSnapshotPolicySpecialRetainRulesPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// Snapshot storage policy. See `storageRule` below.
	StorageRule EnterpriseSnapshotPolicyStorageRulePtrInput
	// The tag of the resource.
	Tags pulumi.StringMapInput
	// Represents the target type of resource binding.
	TargetType pulumi.StringPtrInput
}

func (EnterpriseSnapshotPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*enterpriseSnapshotPolicyState)(nil)).Elem()
}

type enterpriseSnapshotPolicyArgs struct {
	// Snapshot replication information. See `crossRegionCopyInfo` below.
	CrossRegionCopyInfo *EnterpriseSnapshotPolicyCrossRegionCopyInfo `pulumi:"crossRegionCopyInfo"`
	// Description information representing the resource.
	Desc *string `pulumi:"desc"`
	// The name of the resource.
	EnterpriseSnapshotPolicyName string `pulumi:"enterpriseSnapshotPolicyName"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Snapshot retention policy representing resources. See `retainRule` below.
	RetainRule EnterpriseSnapshotPolicyRetainRule `pulumi:"retainRule"`
	// The scheduling plan that represents the resource. See `schedule` below.
	Schedule EnterpriseSnapshotPolicySchedule `pulumi:"schedule"`
	// Snapshot special retention rules. See `specialRetainRules` below.
	SpecialRetainRules *EnterpriseSnapshotPolicySpecialRetainRules `pulumi:"specialRetainRules"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// Snapshot storage policy. See `storageRule` below.
	StorageRule *EnterpriseSnapshotPolicyStorageRule `pulumi:"storageRule"`
	// The tag of the resource.
	Tags map[string]string `pulumi:"tags"`
	// Represents the target type of resource binding.
	TargetType string `pulumi:"targetType"`
}

// The set of arguments for constructing a EnterpriseSnapshotPolicy resource.
type EnterpriseSnapshotPolicyArgs struct {
	// Snapshot replication information. See `crossRegionCopyInfo` below.
	CrossRegionCopyInfo EnterpriseSnapshotPolicyCrossRegionCopyInfoPtrInput
	// Description information representing the resource.
	Desc pulumi.StringPtrInput
	// The name of the resource.
	EnterpriseSnapshotPolicyName pulumi.StringInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// Snapshot retention policy representing resources. See `retainRule` below.
	RetainRule EnterpriseSnapshotPolicyRetainRuleInput
	// The scheduling plan that represents the resource. See `schedule` below.
	Schedule EnterpriseSnapshotPolicyScheduleInput
	// Snapshot special retention rules. See `specialRetainRules` below.
	SpecialRetainRules EnterpriseSnapshotPolicySpecialRetainRulesPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// Snapshot storage policy. See `storageRule` below.
	StorageRule EnterpriseSnapshotPolicyStorageRulePtrInput
	// The tag of the resource.
	Tags pulumi.StringMapInput
	// Represents the target type of resource binding.
	TargetType pulumi.StringInput
}

func (EnterpriseSnapshotPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*enterpriseSnapshotPolicyArgs)(nil)).Elem()
}

type EnterpriseSnapshotPolicyInput interface {
	pulumi.Input

	ToEnterpriseSnapshotPolicyOutput() EnterpriseSnapshotPolicyOutput
	ToEnterpriseSnapshotPolicyOutputWithContext(ctx context.Context) EnterpriseSnapshotPolicyOutput
}

func (*EnterpriseSnapshotPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**EnterpriseSnapshotPolicy)(nil)).Elem()
}

func (i *EnterpriseSnapshotPolicy) ToEnterpriseSnapshotPolicyOutput() EnterpriseSnapshotPolicyOutput {
	return i.ToEnterpriseSnapshotPolicyOutputWithContext(context.Background())
}

func (i *EnterpriseSnapshotPolicy) ToEnterpriseSnapshotPolicyOutputWithContext(ctx context.Context) EnterpriseSnapshotPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnterpriseSnapshotPolicyOutput)
}

// EnterpriseSnapshotPolicyArrayInput is an input type that accepts EnterpriseSnapshotPolicyArray and EnterpriseSnapshotPolicyArrayOutput values.
// You can construct a concrete instance of `EnterpriseSnapshotPolicyArrayInput` via:
//
//	EnterpriseSnapshotPolicyArray{ EnterpriseSnapshotPolicyArgs{...} }
type EnterpriseSnapshotPolicyArrayInput interface {
	pulumi.Input

	ToEnterpriseSnapshotPolicyArrayOutput() EnterpriseSnapshotPolicyArrayOutput
	ToEnterpriseSnapshotPolicyArrayOutputWithContext(context.Context) EnterpriseSnapshotPolicyArrayOutput
}

type EnterpriseSnapshotPolicyArray []EnterpriseSnapshotPolicyInput

func (EnterpriseSnapshotPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnterpriseSnapshotPolicy)(nil)).Elem()
}

func (i EnterpriseSnapshotPolicyArray) ToEnterpriseSnapshotPolicyArrayOutput() EnterpriseSnapshotPolicyArrayOutput {
	return i.ToEnterpriseSnapshotPolicyArrayOutputWithContext(context.Background())
}

func (i EnterpriseSnapshotPolicyArray) ToEnterpriseSnapshotPolicyArrayOutputWithContext(ctx context.Context) EnterpriseSnapshotPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnterpriseSnapshotPolicyArrayOutput)
}

// EnterpriseSnapshotPolicyMapInput is an input type that accepts EnterpriseSnapshotPolicyMap and EnterpriseSnapshotPolicyMapOutput values.
// You can construct a concrete instance of `EnterpriseSnapshotPolicyMapInput` via:
//
//	EnterpriseSnapshotPolicyMap{ "key": EnterpriseSnapshotPolicyArgs{...} }
type EnterpriseSnapshotPolicyMapInput interface {
	pulumi.Input

	ToEnterpriseSnapshotPolicyMapOutput() EnterpriseSnapshotPolicyMapOutput
	ToEnterpriseSnapshotPolicyMapOutputWithContext(context.Context) EnterpriseSnapshotPolicyMapOutput
}

type EnterpriseSnapshotPolicyMap map[string]EnterpriseSnapshotPolicyInput

func (EnterpriseSnapshotPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnterpriseSnapshotPolicy)(nil)).Elem()
}

func (i EnterpriseSnapshotPolicyMap) ToEnterpriseSnapshotPolicyMapOutput() EnterpriseSnapshotPolicyMapOutput {
	return i.ToEnterpriseSnapshotPolicyMapOutputWithContext(context.Background())
}

func (i EnterpriseSnapshotPolicyMap) ToEnterpriseSnapshotPolicyMapOutputWithContext(ctx context.Context) EnterpriseSnapshotPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnterpriseSnapshotPolicyMapOutput)
}

type EnterpriseSnapshotPolicyOutput struct{ *pulumi.OutputState }

func (EnterpriseSnapshotPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EnterpriseSnapshotPolicy)(nil)).Elem()
}

func (o EnterpriseSnapshotPolicyOutput) ToEnterpriseSnapshotPolicyOutput() EnterpriseSnapshotPolicyOutput {
	return o
}

func (o EnterpriseSnapshotPolicyOutput) ToEnterpriseSnapshotPolicyOutputWithContext(ctx context.Context) EnterpriseSnapshotPolicyOutput {
	return o
}

// The creation time of the resource.
func (o EnterpriseSnapshotPolicyOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseSnapshotPolicy) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Snapshot replication information. See `crossRegionCopyInfo` below.
func (o EnterpriseSnapshotPolicyOutput) CrossRegionCopyInfo() EnterpriseSnapshotPolicyCrossRegionCopyInfoOutput {
	return o.ApplyT(func(v *EnterpriseSnapshotPolicy) EnterpriseSnapshotPolicyCrossRegionCopyInfoOutput {
		return v.CrossRegionCopyInfo
	}).(EnterpriseSnapshotPolicyCrossRegionCopyInfoOutput)
}

// Description information representing the resource.
func (o EnterpriseSnapshotPolicyOutput) Desc() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnterpriseSnapshotPolicy) pulumi.StringPtrOutput { return v.Desc }).(pulumi.StringPtrOutput)
}

// The name of the resource.
func (o EnterpriseSnapshotPolicyOutput) EnterpriseSnapshotPolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseSnapshotPolicy) pulumi.StringOutput { return v.EnterpriseSnapshotPolicyName }).(pulumi.StringOutput)
}

// The ID of the resource group.
func (o EnterpriseSnapshotPolicyOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseSnapshotPolicy) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// Snapshot retention policy representing resources. See `retainRule` below.
func (o EnterpriseSnapshotPolicyOutput) RetainRule() EnterpriseSnapshotPolicyRetainRuleOutput {
	return o.ApplyT(func(v *EnterpriseSnapshotPolicy) EnterpriseSnapshotPolicyRetainRuleOutput { return v.RetainRule }).(EnterpriseSnapshotPolicyRetainRuleOutput)
}

// The scheduling plan that represents the resource. See `schedule` below.
func (o EnterpriseSnapshotPolicyOutput) Schedule() EnterpriseSnapshotPolicyScheduleOutput {
	return o.ApplyT(func(v *EnterpriseSnapshotPolicy) EnterpriseSnapshotPolicyScheduleOutput { return v.Schedule }).(EnterpriseSnapshotPolicyScheduleOutput)
}

// Snapshot special retention rules. See `specialRetainRules` below.
func (o EnterpriseSnapshotPolicyOutput) SpecialRetainRules() EnterpriseSnapshotPolicySpecialRetainRulesOutput {
	return o.ApplyT(func(v *EnterpriseSnapshotPolicy) EnterpriseSnapshotPolicySpecialRetainRulesOutput {
		return v.SpecialRetainRules
	}).(EnterpriseSnapshotPolicySpecialRetainRulesOutput)
}

// The status of the resource.
func (o EnterpriseSnapshotPolicyOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseSnapshotPolicy) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Snapshot storage policy. See `storageRule` below.
func (o EnterpriseSnapshotPolicyOutput) StorageRule() EnterpriseSnapshotPolicyStorageRulePtrOutput {
	return o.ApplyT(func(v *EnterpriseSnapshotPolicy) EnterpriseSnapshotPolicyStorageRulePtrOutput { return v.StorageRule }).(EnterpriseSnapshotPolicyStorageRulePtrOutput)
}

// The tag of the resource.
func (o EnterpriseSnapshotPolicyOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EnterpriseSnapshotPolicy) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Represents the target type of resource binding.
func (o EnterpriseSnapshotPolicyOutput) TargetType() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseSnapshotPolicy) pulumi.StringOutput { return v.TargetType }).(pulumi.StringOutput)
}

type EnterpriseSnapshotPolicyArrayOutput struct{ *pulumi.OutputState }

func (EnterpriseSnapshotPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnterpriseSnapshotPolicy)(nil)).Elem()
}

func (o EnterpriseSnapshotPolicyArrayOutput) ToEnterpriseSnapshotPolicyArrayOutput() EnterpriseSnapshotPolicyArrayOutput {
	return o
}

func (o EnterpriseSnapshotPolicyArrayOutput) ToEnterpriseSnapshotPolicyArrayOutputWithContext(ctx context.Context) EnterpriseSnapshotPolicyArrayOutput {
	return o
}

func (o EnterpriseSnapshotPolicyArrayOutput) Index(i pulumi.IntInput) EnterpriseSnapshotPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EnterpriseSnapshotPolicy {
		return vs[0].([]*EnterpriseSnapshotPolicy)[vs[1].(int)]
	}).(EnterpriseSnapshotPolicyOutput)
}

type EnterpriseSnapshotPolicyMapOutput struct{ *pulumi.OutputState }

func (EnterpriseSnapshotPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnterpriseSnapshotPolicy)(nil)).Elem()
}

func (o EnterpriseSnapshotPolicyMapOutput) ToEnterpriseSnapshotPolicyMapOutput() EnterpriseSnapshotPolicyMapOutput {
	return o
}

func (o EnterpriseSnapshotPolicyMapOutput) ToEnterpriseSnapshotPolicyMapOutputWithContext(ctx context.Context) EnterpriseSnapshotPolicyMapOutput {
	return o
}

func (o EnterpriseSnapshotPolicyMapOutput) MapIndex(k pulumi.StringInput) EnterpriseSnapshotPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EnterpriseSnapshotPolicy {
		return vs[0].(map[string]*EnterpriseSnapshotPolicy)[vs[1].(string)]
	}).(EnterpriseSnapshotPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EnterpriseSnapshotPolicyInput)(nil)).Elem(), &EnterpriseSnapshotPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnterpriseSnapshotPolicyArrayInput)(nil)).Elem(), EnterpriseSnapshotPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnterpriseSnapshotPolicyMapInput)(nil)).Elem(), EnterpriseSnapshotPolicyMap{})
	pulumi.RegisterOutputType(EnterpriseSnapshotPolicyOutput{})
	pulumi.RegisterOutputType(EnterpriseSnapshotPolicyArrayOutput{})
	pulumi.RegisterOutputType(EnterpriseSnapshotPolicyMapOutput{})
}
