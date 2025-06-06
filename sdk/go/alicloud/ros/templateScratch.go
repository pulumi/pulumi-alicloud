// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ros

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ROS Template Scratch resource.
//
// For information about ROS Template Scratch and how to use it, see [What is Template Scratch](https://www.alibabacloud.com/help/zh/doc-detail/352074.html).
//
// > **NOTE:** Available since v1.151.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ros"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := resourcemanager.GetResourceGroups(ctx, &resourcemanager.GetResourceGroupsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = ros.NewTemplateScratch(ctx, "example", &ros.TemplateScratchArgs{
//				Description:         pulumi.String("tf_testacc"),
//				TemplateScratchType: pulumi.String("ResourceImport"),
//				PreferenceParameters: ros.TemplateScratchPreferenceParameterArray{
//					&ros.TemplateScratchPreferenceParameterArgs{
//						ParameterKey:   pulumi.String("DeletionPolicy"),
//						ParameterValue: pulumi.String("Retain"),
//					},
//				},
//				SourceResourceGroup: &ros.TemplateScratchSourceResourceGroupArgs{
//					ResourceGroupId: pulumi.String(_default.Ids[0]),
//					ResourceTypeFilters: pulumi.StringArray{
//						pulumi.String("ALIYUN::ECS::VPC"),
//					},
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
// ROS Template Scratch can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ros/templateScratch:TemplateScratch example <id>
// ```
type TemplateScratch struct {
	pulumi.CustomResourceState

	// The Description of the Template Scratch.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The execution mode. Valid Values: `Async` or `Sync`.
	ExecutionMode pulumi.StringPtrOutput `pulumi:"executionMode"`
	// Logical ID generation strategy. Valid Values: `LongTypePrefixAndIndexSuffix`, `LongTypePrefixAndHashSuffix` and `ShortTypePrefixAndHashSuffix`.
	LogicalIdStrategy pulumi.StringOutput `pulumi:"logicalIdStrategy"`
	// Priority parameter. See the following `Block preferenceParameters`.
	PreferenceParameters TemplateScratchPreferenceParameterArrayOutput `pulumi:"preferenceParameters"`
	// Source resource grouping. See the following `Block sourceResourceGroup`.
	SourceResourceGroup TemplateScratchSourceResourceGroupPtrOutput `pulumi:"sourceResourceGroup"`
	// Source resource. See the following `Block sourceResources`.
	SourceResources TemplateScratchSourceResourceArrayOutput `pulumi:"sourceResources"`
	// Source tag. See the following `Block sourceTag`.
	SourceTag TemplateScratchSourceTagPtrOutput `pulumi:"sourceTag"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// The type of the Template scan. Valid Values: `ResourceImport` or `ArchitectureReplication`.
	TemplateScratchType pulumi.StringOutput `pulumi:"templateScratchType"`
}

// NewTemplateScratch registers a new resource with the given unique name, arguments, and options.
func NewTemplateScratch(ctx *pulumi.Context,
	name string, args *TemplateScratchArgs, opts ...pulumi.ResourceOption) (*TemplateScratch, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.TemplateScratchType == nil {
		return nil, errors.New("invalid value for required argument 'TemplateScratchType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TemplateScratch
	err := ctx.RegisterResource("alicloud:ros/templateScratch:TemplateScratch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTemplateScratch gets an existing TemplateScratch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTemplateScratch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TemplateScratchState, opts ...pulumi.ResourceOption) (*TemplateScratch, error) {
	var resource TemplateScratch
	err := ctx.ReadResource("alicloud:ros/templateScratch:TemplateScratch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TemplateScratch resources.
type templateScratchState struct {
	// The Description of the Template Scratch.
	Description *string `pulumi:"description"`
	// The execution mode. Valid Values: `Async` or `Sync`.
	ExecutionMode *string `pulumi:"executionMode"`
	// Logical ID generation strategy. Valid Values: `LongTypePrefixAndIndexSuffix`, `LongTypePrefixAndHashSuffix` and `ShortTypePrefixAndHashSuffix`.
	LogicalIdStrategy *string `pulumi:"logicalIdStrategy"`
	// Priority parameter. See the following `Block preferenceParameters`.
	PreferenceParameters []TemplateScratchPreferenceParameter `pulumi:"preferenceParameters"`
	// Source resource grouping. See the following `Block sourceResourceGroup`.
	SourceResourceGroup *TemplateScratchSourceResourceGroup `pulumi:"sourceResourceGroup"`
	// Source resource. See the following `Block sourceResources`.
	SourceResources []TemplateScratchSourceResource `pulumi:"sourceResources"`
	// Source tag. See the following `Block sourceTag`.
	SourceTag *TemplateScratchSourceTag `pulumi:"sourceTag"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The type of the Template scan. Valid Values: `ResourceImport` or `ArchitectureReplication`.
	TemplateScratchType *string `pulumi:"templateScratchType"`
}

type TemplateScratchState struct {
	// The Description of the Template Scratch.
	Description pulumi.StringPtrInput
	// The execution mode. Valid Values: `Async` or `Sync`.
	ExecutionMode pulumi.StringPtrInput
	// Logical ID generation strategy. Valid Values: `LongTypePrefixAndIndexSuffix`, `LongTypePrefixAndHashSuffix` and `ShortTypePrefixAndHashSuffix`.
	LogicalIdStrategy pulumi.StringPtrInput
	// Priority parameter. See the following `Block preferenceParameters`.
	PreferenceParameters TemplateScratchPreferenceParameterArrayInput
	// Source resource grouping. See the following `Block sourceResourceGroup`.
	SourceResourceGroup TemplateScratchSourceResourceGroupPtrInput
	// Source resource. See the following `Block sourceResources`.
	SourceResources TemplateScratchSourceResourceArrayInput
	// Source tag. See the following `Block sourceTag`.
	SourceTag TemplateScratchSourceTagPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The type of the Template scan. Valid Values: `ResourceImport` or `ArchitectureReplication`.
	TemplateScratchType pulumi.StringPtrInput
}

func (TemplateScratchState) ElementType() reflect.Type {
	return reflect.TypeOf((*templateScratchState)(nil)).Elem()
}

type templateScratchArgs struct {
	// The Description of the Template Scratch.
	Description *string `pulumi:"description"`
	// The execution mode. Valid Values: `Async` or `Sync`.
	ExecutionMode *string `pulumi:"executionMode"`
	// Logical ID generation strategy. Valid Values: `LongTypePrefixAndIndexSuffix`, `LongTypePrefixAndHashSuffix` and `ShortTypePrefixAndHashSuffix`.
	LogicalIdStrategy *string `pulumi:"logicalIdStrategy"`
	// Priority parameter. See the following `Block preferenceParameters`.
	PreferenceParameters []TemplateScratchPreferenceParameter `pulumi:"preferenceParameters"`
	// Source resource grouping. See the following `Block sourceResourceGroup`.
	SourceResourceGroup *TemplateScratchSourceResourceGroup `pulumi:"sourceResourceGroup"`
	// Source resource. See the following `Block sourceResources`.
	SourceResources []TemplateScratchSourceResource `pulumi:"sourceResources"`
	// Source tag. See the following `Block sourceTag`.
	SourceTag *TemplateScratchSourceTag `pulumi:"sourceTag"`
	// The type of the Template scan. Valid Values: `ResourceImport` or `ArchitectureReplication`.
	TemplateScratchType string `pulumi:"templateScratchType"`
}

// The set of arguments for constructing a TemplateScratch resource.
type TemplateScratchArgs struct {
	// The Description of the Template Scratch.
	Description pulumi.StringPtrInput
	// The execution mode. Valid Values: `Async` or `Sync`.
	ExecutionMode pulumi.StringPtrInput
	// Logical ID generation strategy. Valid Values: `LongTypePrefixAndIndexSuffix`, `LongTypePrefixAndHashSuffix` and `ShortTypePrefixAndHashSuffix`.
	LogicalIdStrategy pulumi.StringPtrInput
	// Priority parameter. See the following `Block preferenceParameters`.
	PreferenceParameters TemplateScratchPreferenceParameterArrayInput
	// Source resource grouping. See the following `Block sourceResourceGroup`.
	SourceResourceGroup TemplateScratchSourceResourceGroupPtrInput
	// Source resource. See the following `Block sourceResources`.
	SourceResources TemplateScratchSourceResourceArrayInput
	// Source tag. See the following `Block sourceTag`.
	SourceTag TemplateScratchSourceTagPtrInput
	// The type of the Template scan. Valid Values: `ResourceImport` or `ArchitectureReplication`.
	TemplateScratchType pulumi.StringInput
}

func (TemplateScratchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*templateScratchArgs)(nil)).Elem()
}

type TemplateScratchInput interface {
	pulumi.Input

	ToTemplateScratchOutput() TemplateScratchOutput
	ToTemplateScratchOutputWithContext(ctx context.Context) TemplateScratchOutput
}

func (*TemplateScratch) ElementType() reflect.Type {
	return reflect.TypeOf((**TemplateScratch)(nil)).Elem()
}

func (i *TemplateScratch) ToTemplateScratchOutput() TemplateScratchOutput {
	return i.ToTemplateScratchOutputWithContext(context.Background())
}

func (i *TemplateScratch) ToTemplateScratchOutputWithContext(ctx context.Context) TemplateScratchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TemplateScratchOutput)
}

// TemplateScratchArrayInput is an input type that accepts TemplateScratchArray and TemplateScratchArrayOutput values.
// You can construct a concrete instance of `TemplateScratchArrayInput` via:
//
//	TemplateScratchArray{ TemplateScratchArgs{...} }
type TemplateScratchArrayInput interface {
	pulumi.Input

	ToTemplateScratchArrayOutput() TemplateScratchArrayOutput
	ToTemplateScratchArrayOutputWithContext(context.Context) TemplateScratchArrayOutput
}

type TemplateScratchArray []TemplateScratchInput

func (TemplateScratchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TemplateScratch)(nil)).Elem()
}

func (i TemplateScratchArray) ToTemplateScratchArrayOutput() TemplateScratchArrayOutput {
	return i.ToTemplateScratchArrayOutputWithContext(context.Background())
}

func (i TemplateScratchArray) ToTemplateScratchArrayOutputWithContext(ctx context.Context) TemplateScratchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TemplateScratchArrayOutput)
}

// TemplateScratchMapInput is an input type that accepts TemplateScratchMap and TemplateScratchMapOutput values.
// You can construct a concrete instance of `TemplateScratchMapInput` via:
//
//	TemplateScratchMap{ "key": TemplateScratchArgs{...} }
type TemplateScratchMapInput interface {
	pulumi.Input

	ToTemplateScratchMapOutput() TemplateScratchMapOutput
	ToTemplateScratchMapOutputWithContext(context.Context) TemplateScratchMapOutput
}

type TemplateScratchMap map[string]TemplateScratchInput

func (TemplateScratchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TemplateScratch)(nil)).Elem()
}

func (i TemplateScratchMap) ToTemplateScratchMapOutput() TemplateScratchMapOutput {
	return i.ToTemplateScratchMapOutputWithContext(context.Background())
}

func (i TemplateScratchMap) ToTemplateScratchMapOutputWithContext(ctx context.Context) TemplateScratchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TemplateScratchMapOutput)
}

type TemplateScratchOutput struct{ *pulumi.OutputState }

func (TemplateScratchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TemplateScratch)(nil)).Elem()
}

func (o TemplateScratchOutput) ToTemplateScratchOutput() TemplateScratchOutput {
	return o
}

func (o TemplateScratchOutput) ToTemplateScratchOutputWithContext(ctx context.Context) TemplateScratchOutput {
	return o
}

// The Description of the Template Scratch.
func (o TemplateScratchOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TemplateScratch) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The execution mode. Valid Values: `Async` or `Sync`.
func (o TemplateScratchOutput) ExecutionMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TemplateScratch) pulumi.StringPtrOutput { return v.ExecutionMode }).(pulumi.StringPtrOutput)
}

// Logical ID generation strategy. Valid Values: `LongTypePrefixAndIndexSuffix`, `LongTypePrefixAndHashSuffix` and `ShortTypePrefixAndHashSuffix`.
func (o TemplateScratchOutput) LogicalIdStrategy() pulumi.StringOutput {
	return o.ApplyT(func(v *TemplateScratch) pulumi.StringOutput { return v.LogicalIdStrategy }).(pulumi.StringOutput)
}

// Priority parameter. See the following `Block preferenceParameters`.
func (o TemplateScratchOutput) PreferenceParameters() TemplateScratchPreferenceParameterArrayOutput {
	return o.ApplyT(func(v *TemplateScratch) TemplateScratchPreferenceParameterArrayOutput { return v.PreferenceParameters }).(TemplateScratchPreferenceParameterArrayOutput)
}

// Source resource grouping. See the following `Block sourceResourceGroup`.
func (o TemplateScratchOutput) SourceResourceGroup() TemplateScratchSourceResourceGroupPtrOutput {
	return o.ApplyT(func(v *TemplateScratch) TemplateScratchSourceResourceGroupPtrOutput { return v.SourceResourceGroup }).(TemplateScratchSourceResourceGroupPtrOutput)
}

// Source resource. See the following `Block sourceResources`.
func (o TemplateScratchOutput) SourceResources() TemplateScratchSourceResourceArrayOutput {
	return o.ApplyT(func(v *TemplateScratch) TemplateScratchSourceResourceArrayOutput { return v.SourceResources }).(TemplateScratchSourceResourceArrayOutput)
}

// Source tag. See the following `Block sourceTag`.
func (o TemplateScratchOutput) SourceTag() TemplateScratchSourceTagPtrOutput {
	return o.ApplyT(func(v *TemplateScratch) TemplateScratchSourceTagPtrOutput { return v.SourceTag }).(TemplateScratchSourceTagPtrOutput)
}

// The status of the resource.
func (o TemplateScratchOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *TemplateScratch) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The type of the Template scan. Valid Values: `ResourceImport` or `ArchitectureReplication`.
func (o TemplateScratchOutput) TemplateScratchType() pulumi.StringOutput {
	return o.ApplyT(func(v *TemplateScratch) pulumi.StringOutput { return v.TemplateScratchType }).(pulumi.StringOutput)
}

type TemplateScratchArrayOutput struct{ *pulumi.OutputState }

func (TemplateScratchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TemplateScratch)(nil)).Elem()
}

func (o TemplateScratchArrayOutput) ToTemplateScratchArrayOutput() TemplateScratchArrayOutput {
	return o
}

func (o TemplateScratchArrayOutput) ToTemplateScratchArrayOutputWithContext(ctx context.Context) TemplateScratchArrayOutput {
	return o
}

func (o TemplateScratchArrayOutput) Index(i pulumi.IntInput) TemplateScratchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TemplateScratch {
		return vs[0].([]*TemplateScratch)[vs[1].(int)]
	}).(TemplateScratchOutput)
}

type TemplateScratchMapOutput struct{ *pulumi.OutputState }

func (TemplateScratchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TemplateScratch)(nil)).Elem()
}

func (o TemplateScratchMapOutput) ToTemplateScratchMapOutput() TemplateScratchMapOutput {
	return o
}

func (o TemplateScratchMapOutput) ToTemplateScratchMapOutputWithContext(ctx context.Context) TemplateScratchMapOutput {
	return o
}

func (o TemplateScratchMapOutput) MapIndex(k pulumi.StringInput) TemplateScratchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TemplateScratch {
		return vs[0].(map[string]*TemplateScratch)[vs[1].(string)]
	}).(TemplateScratchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TemplateScratchInput)(nil)).Elem(), &TemplateScratch{})
	pulumi.RegisterInputType(reflect.TypeOf((*TemplateScratchArrayInput)(nil)).Elem(), TemplateScratchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TemplateScratchMapInput)(nil)).Elem(), TemplateScratchMap{})
	pulumi.RegisterOutputType(TemplateScratchOutput{})
	pulumi.RegisterOutputType(TemplateScratchArrayOutput{})
	pulumi.RegisterOutputType(TemplateScratchMapOutput{})
}
