// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Resource Manager Auto Grouping Rule resource.
//
// Auto grouping rules of resource group.
//
// For information about Resource Manager Auto Grouping Rule and how to use it, see [What is Auto Grouping Rule](https://www.alibabacloud.com/help/en/resource-management/resource-group/developer-reference/api-resourcemanager-2020-03-31-createautogroupingrule-rg).
//
// > **NOTE:** Available since v1.246.0.
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
//			_, err := resourcemanager.NewAutoGroupingRule(ctx, "default", &resourcemanager.AutoGroupingRuleArgs{
//				RuleContents: resourcemanager.AutoGroupingRuleRuleContentArray{
//					&resourcemanager.AutoGroupingRuleRuleContentArgs{
//						TargetResourceGroupCondition: pulumi.String(`    {
//	        "children": [
//	      {
//	        "desired": "rg-aek*****sbvy",
//	        "featurePath": "$.resourceGroupId",
//	        "featureSource": "RESOURCE",
//	        "operator": "StringEquals"
//	      }
//	        ],
//	        "operator": "and"
//	    }
//
// `),
//
//						AutoGroupingScopeCondition: pulumi.String(`    {
//	        "children": [
//	      {
//	        "desired": "name_a",
//	        "featurePath": "$.resourceName",
//	        "featureSource": "RESOURCE",
//	        "operator": "StringEqualsAny"
//	      }
//	        ],
//	        "operator": "and"
//	    }
//
// `),
//
//					},
//				},
//				RuleDesc:              pulumi.String(name),
//				RuleType:              pulumi.String("custom_condition"),
//				RegionIdsScope:        pulumi.String("cn-hangzhou,cn-shanghai"),
//				ResourceIdsScope:      pulumi.String("imock-xxxxxx"),
//				ResourceGroupIdsScope: pulumi.String("rg-aek22*****3sbvz"),
//				ResourceTypesScope:    pulumi.String("ecs.instance,vpc.vpc"),
//				RuleName:              pulumi.String(name),
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
// Resource Manager Auto Grouping Rule can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:resourcemanager/autoGroupingRule:AutoGroupingRule example <id>
// ```
type AutoGroupingRule struct {
	pulumi.CustomResourceState

	// The IDs of regions to be excluded. Separate multiple IDs with commas (,).
	ExcludeRegionIdsScope pulumi.StringPtrOutput `pulumi:"excludeRegionIdsScope"`
	// The IDs of resource groups to be excluded. Separate multiple IDs with commas (,).
	ExcludeResourceGroupIdsScope pulumi.StringPtrOutput `pulumi:"excludeResourceGroupIdsScope"`
	// The IDs of resources to be excluded. Separate multiple IDs with commas (,).
	ExcludeResourceIdsScope pulumi.StringPtrOutput `pulumi:"excludeResourceIdsScope"`
	// The resource types to be excluded. Separate multiple resource types with commas (,).
	ExcludeResourceTypesScope pulumi.StringPtrOutput `pulumi:"excludeResourceTypesScope"`
	// The IDs of regions. Separate multiple IDs with commas (,).
	RegionIdsScope pulumi.StringPtrOutput `pulumi:"regionIdsScope"`
	// The IDs of resource groups. Separate multiple IDs with commas (,).
	ResourceGroupIdsScope pulumi.StringPtrOutput `pulumi:"resourceGroupIdsScope"`
	// The IDs of resources. Separate multiple IDs with commas (,).
	ResourceIdsScope pulumi.StringPtrOutput `pulumi:"resourceIdsScope"`
	// The resource types. Separate multiple resource types with commas (,).
	ResourceTypesScope pulumi.StringPtrOutput `pulumi:"resourceTypesScope"`
	// The content records of the rule. See `ruleContents` below.
	RuleContents AutoGroupingRuleRuleContentArrayOutput `pulumi:"ruleContents"`
	// The description of the rule.
	RuleDesc pulumi.StringPtrOutput `pulumi:"ruleDesc"`
	// The name of the rule.
	RuleName pulumi.StringOutput `pulumi:"ruleName"`
	// The type of the rule. Valid values:
	RuleType pulumi.StringOutput `pulumi:"ruleType"`
}

// NewAutoGroupingRule registers a new resource with the given unique name, arguments, and options.
func NewAutoGroupingRule(ctx *pulumi.Context,
	name string, args *AutoGroupingRuleArgs, opts ...pulumi.ResourceOption) (*AutoGroupingRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RuleContents == nil {
		return nil, errors.New("invalid value for required argument 'RuleContents'")
	}
	if args.RuleName == nil {
		return nil, errors.New("invalid value for required argument 'RuleName'")
	}
	if args.RuleType == nil {
		return nil, errors.New("invalid value for required argument 'RuleType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AutoGroupingRule
	err := ctx.RegisterResource("alicloud:resourcemanager/autoGroupingRule:AutoGroupingRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAutoGroupingRule gets an existing AutoGroupingRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAutoGroupingRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AutoGroupingRuleState, opts ...pulumi.ResourceOption) (*AutoGroupingRule, error) {
	var resource AutoGroupingRule
	err := ctx.ReadResource("alicloud:resourcemanager/autoGroupingRule:AutoGroupingRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AutoGroupingRule resources.
type autoGroupingRuleState struct {
	// The IDs of regions to be excluded. Separate multiple IDs with commas (,).
	ExcludeRegionIdsScope *string `pulumi:"excludeRegionIdsScope"`
	// The IDs of resource groups to be excluded. Separate multiple IDs with commas (,).
	ExcludeResourceGroupIdsScope *string `pulumi:"excludeResourceGroupIdsScope"`
	// The IDs of resources to be excluded. Separate multiple IDs with commas (,).
	ExcludeResourceIdsScope *string `pulumi:"excludeResourceIdsScope"`
	// The resource types to be excluded. Separate multiple resource types with commas (,).
	ExcludeResourceTypesScope *string `pulumi:"excludeResourceTypesScope"`
	// The IDs of regions. Separate multiple IDs with commas (,).
	RegionIdsScope *string `pulumi:"regionIdsScope"`
	// The IDs of resource groups. Separate multiple IDs with commas (,).
	ResourceGroupIdsScope *string `pulumi:"resourceGroupIdsScope"`
	// The IDs of resources. Separate multiple IDs with commas (,).
	ResourceIdsScope *string `pulumi:"resourceIdsScope"`
	// The resource types. Separate multiple resource types with commas (,).
	ResourceTypesScope *string `pulumi:"resourceTypesScope"`
	// The content records of the rule. See `ruleContents` below.
	RuleContents []AutoGroupingRuleRuleContent `pulumi:"ruleContents"`
	// The description of the rule.
	RuleDesc *string `pulumi:"ruleDesc"`
	// The name of the rule.
	RuleName *string `pulumi:"ruleName"`
	// The type of the rule. Valid values:
	RuleType *string `pulumi:"ruleType"`
}

type AutoGroupingRuleState struct {
	// The IDs of regions to be excluded. Separate multiple IDs with commas (,).
	ExcludeRegionIdsScope pulumi.StringPtrInput
	// The IDs of resource groups to be excluded. Separate multiple IDs with commas (,).
	ExcludeResourceGroupIdsScope pulumi.StringPtrInput
	// The IDs of resources to be excluded. Separate multiple IDs with commas (,).
	ExcludeResourceIdsScope pulumi.StringPtrInput
	// The resource types to be excluded. Separate multiple resource types with commas (,).
	ExcludeResourceTypesScope pulumi.StringPtrInput
	// The IDs of regions. Separate multiple IDs with commas (,).
	RegionIdsScope pulumi.StringPtrInput
	// The IDs of resource groups. Separate multiple IDs with commas (,).
	ResourceGroupIdsScope pulumi.StringPtrInput
	// The IDs of resources. Separate multiple IDs with commas (,).
	ResourceIdsScope pulumi.StringPtrInput
	// The resource types. Separate multiple resource types with commas (,).
	ResourceTypesScope pulumi.StringPtrInput
	// The content records of the rule. See `ruleContents` below.
	RuleContents AutoGroupingRuleRuleContentArrayInput
	// The description of the rule.
	RuleDesc pulumi.StringPtrInput
	// The name of the rule.
	RuleName pulumi.StringPtrInput
	// The type of the rule. Valid values:
	RuleType pulumi.StringPtrInput
}

func (AutoGroupingRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*autoGroupingRuleState)(nil)).Elem()
}

type autoGroupingRuleArgs struct {
	// The IDs of regions to be excluded. Separate multiple IDs with commas (,).
	ExcludeRegionIdsScope *string `pulumi:"excludeRegionIdsScope"`
	// The IDs of resource groups to be excluded. Separate multiple IDs with commas (,).
	ExcludeResourceGroupIdsScope *string `pulumi:"excludeResourceGroupIdsScope"`
	// The IDs of resources to be excluded. Separate multiple IDs with commas (,).
	ExcludeResourceIdsScope *string `pulumi:"excludeResourceIdsScope"`
	// The resource types to be excluded. Separate multiple resource types with commas (,).
	ExcludeResourceTypesScope *string `pulumi:"excludeResourceTypesScope"`
	// The IDs of regions. Separate multiple IDs with commas (,).
	RegionIdsScope *string `pulumi:"regionIdsScope"`
	// The IDs of resource groups. Separate multiple IDs with commas (,).
	ResourceGroupIdsScope *string `pulumi:"resourceGroupIdsScope"`
	// The IDs of resources. Separate multiple IDs with commas (,).
	ResourceIdsScope *string `pulumi:"resourceIdsScope"`
	// The resource types. Separate multiple resource types with commas (,).
	ResourceTypesScope *string `pulumi:"resourceTypesScope"`
	// The content records of the rule. See `ruleContents` below.
	RuleContents []AutoGroupingRuleRuleContent `pulumi:"ruleContents"`
	// The description of the rule.
	RuleDesc *string `pulumi:"ruleDesc"`
	// The name of the rule.
	RuleName string `pulumi:"ruleName"`
	// The type of the rule. Valid values:
	RuleType string `pulumi:"ruleType"`
}

// The set of arguments for constructing a AutoGroupingRule resource.
type AutoGroupingRuleArgs struct {
	// The IDs of regions to be excluded. Separate multiple IDs with commas (,).
	ExcludeRegionIdsScope pulumi.StringPtrInput
	// The IDs of resource groups to be excluded. Separate multiple IDs with commas (,).
	ExcludeResourceGroupIdsScope pulumi.StringPtrInput
	// The IDs of resources to be excluded. Separate multiple IDs with commas (,).
	ExcludeResourceIdsScope pulumi.StringPtrInput
	// The resource types to be excluded. Separate multiple resource types with commas (,).
	ExcludeResourceTypesScope pulumi.StringPtrInput
	// The IDs of regions. Separate multiple IDs with commas (,).
	RegionIdsScope pulumi.StringPtrInput
	// The IDs of resource groups. Separate multiple IDs with commas (,).
	ResourceGroupIdsScope pulumi.StringPtrInput
	// The IDs of resources. Separate multiple IDs with commas (,).
	ResourceIdsScope pulumi.StringPtrInput
	// The resource types. Separate multiple resource types with commas (,).
	ResourceTypesScope pulumi.StringPtrInput
	// The content records of the rule. See `ruleContents` below.
	RuleContents AutoGroupingRuleRuleContentArrayInput
	// The description of the rule.
	RuleDesc pulumi.StringPtrInput
	// The name of the rule.
	RuleName pulumi.StringInput
	// The type of the rule. Valid values:
	RuleType pulumi.StringInput
}

func (AutoGroupingRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*autoGroupingRuleArgs)(nil)).Elem()
}

type AutoGroupingRuleInput interface {
	pulumi.Input

	ToAutoGroupingRuleOutput() AutoGroupingRuleOutput
	ToAutoGroupingRuleOutputWithContext(ctx context.Context) AutoGroupingRuleOutput
}

func (*AutoGroupingRule) ElementType() reflect.Type {
	return reflect.TypeOf((**AutoGroupingRule)(nil)).Elem()
}

func (i *AutoGroupingRule) ToAutoGroupingRuleOutput() AutoGroupingRuleOutput {
	return i.ToAutoGroupingRuleOutputWithContext(context.Background())
}

func (i *AutoGroupingRule) ToAutoGroupingRuleOutputWithContext(ctx context.Context) AutoGroupingRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutoGroupingRuleOutput)
}

// AutoGroupingRuleArrayInput is an input type that accepts AutoGroupingRuleArray and AutoGroupingRuleArrayOutput values.
// You can construct a concrete instance of `AutoGroupingRuleArrayInput` via:
//
//	AutoGroupingRuleArray{ AutoGroupingRuleArgs{...} }
type AutoGroupingRuleArrayInput interface {
	pulumi.Input

	ToAutoGroupingRuleArrayOutput() AutoGroupingRuleArrayOutput
	ToAutoGroupingRuleArrayOutputWithContext(context.Context) AutoGroupingRuleArrayOutput
}

type AutoGroupingRuleArray []AutoGroupingRuleInput

func (AutoGroupingRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutoGroupingRule)(nil)).Elem()
}

func (i AutoGroupingRuleArray) ToAutoGroupingRuleArrayOutput() AutoGroupingRuleArrayOutput {
	return i.ToAutoGroupingRuleArrayOutputWithContext(context.Background())
}

func (i AutoGroupingRuleArray) ToAutoGroupingRuleArrayOutputWithContext(ctx context.Context) AutoGroupingRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutoGroupingRuleArrayOutput)
}

// AutoGroupingRuleMapInput is an input type that accepts AutoGroupingRuleMap and AutoGroupingRuleMapOutput values.
// You can construct a concrete instance of `AutoGroupingRuleMapInput` via:
//
//	AutoGroupingRuleMap{ "key": AutoGroupingRuleArgs{...} }
type AutoGroupingRuleMapInput interface {
	pulumi.Input

	ToAutoGroupingRuleMapOutput() AutoGroupingRuleMapOutput
	ToAutoGroupingRuleMapOutputWithContext(context.Context) AutoGroupingRuleMapOutput
}

type AutoGroupingRuleMap map[string]AutoGroupingRuleInput

func (AutoGroupingRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutoGroupingRule)(nil)).Elem()
}

func (i AutoGroupingRuleMap) ToAutoGroupingRuleMapOutput() AutoGroupingRuleMapOutput {
	return i.ToAutoGroupingRuleMapOutputWithContext(context.Background())
}

func (i AutoGroupingRuleMap) ToAutoGroupingRuleMapOutputWithContext(ctx context.Context) AutoGroupingRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutoGroupingRuleMapOutput)
}

type AutoGroupingRuleOutput struct{ *pulumi.OutputState }

func (AutoGroupingRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AutoGroupingRule)(nil)).Elem()
}

func (o AutoGroupingRuleOutput) ToAutoGroupingRuleOutput() AutoGroupingRuleOutput {
	return o
}

func (o AutoGroupingRuleOutput) ToAutoGroupingRuleOutputWithContext(ctx context.Context) AutoGroupingRuleOutput {
	return o
}

// The IDs of regions to be excluded. Separate multiple IDs with commas (,).
func (o AutoGroupingRuleOutput) ExcludeRegionIdsScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutoGroupingRule) pulumi.StringPtrOutput { return v.ExcludeRegionIdsScope }).(pulumi.StringPtrOutput)
}

// The IDs of resource groups to be excluded. Separate multiple IDs with commas (,).
func (o AutoGroupingRuleOutput) ExcludeResourceGroupIdsScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutoGroupingRule) pulumi.StringPtrOutput { return v.ExcludeResourceGroupIdsScope }).(pulumi.StringPtrOutput)
}

// The IDs of resources to be excluded. Separate multiple IDs with commas (,).
func (o AutoGroupingRuleOutput) ExcludeResourceIdsScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutoGroupingRule) pulumi.StringPtrOutput { return v.ExcludeResourceIdsScope }).(pulumi.StringPtrOutput)
}

// The resource types to be excluded. Separate multiple resource types with commas (,).
func (o AutoGroupingRuleOutput) ExcludeResourceTypesScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutoGroupingRule) pulumi.StringPtrOutput { return v.ExcludeResourceTypesScope }).(pulumi.StringPtrOutput)
}

// The IDs of regions. Separate multiple IDs with commas (,).
func (o AutoGroupingRuleOutput) RegionIdsScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutoGroupingRule) pulumi.StringPtrOutput { return v.RegionIdsScope }).(pulumi.StringPtrOutput)
}

// The IDs of resource groups. Separate multiple IDs with commas (,).
func (o AutoGroupingRuleOutput) ResourceGroupIdsScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutoGroupingRule) pulumi.StringPtrOutput { return v.ResourceGroupIdsScope }).(pulumi.StringPtrOutput)
}

// The IDs of resources. Separate multiple IDs with commas (,).
func (o AutoGroupingRuleOutput) ResourceIdsScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutoGroupingRule) pulumi.StringPtrOutput { return v.ResourceIdsScope }).(pulumi.StringPtrOutput)
}

// The resource types. Separate multiple resource types with commas (,).
func (o AutoGroupingRuleOutput) ResourceTypesScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutoGroupingRule) pulumi.StringPtrOutput { return v.ResourceTypesScope }).(pulumi.StringPtrOutput)
}

// The content records of the rule. See `ruleContents` below.
func (o AutoGroupingRuleOutput) RuleContents() AutoGroupingRuleRuleContentArrayOutput {
	return o.ApplyT(func(v *AutoGroupingRule) AutoGroupingRuleRuleContentArrayOutput { return v.RuleContents }).(AutoGroupingRuleRuleContentArrayOutput)
}

// The description of the rule.
func (o AutoGroupingRuleOutput) RuleDesc() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutoGroupingRule) pulumi.StringPtrOutput { return v.RuleDesc }).(pulumi.StringPtrOutput)
}

// The name of the rule.
func (o AutoGroupingRuleOutput) RuleName() pulumi.StringOutput {
	return o.ApplyT(func(v *AutoGroupingRule) pulumi.StringOutput { return v.RuleName }).(pulumi.StringOutput)
}

// The type of the rule. Valid values:
func (o AutoGroupingRuleOutput) RuleType() pulumi.StringOutput {
	return o.ApplyT(func(v *AutoGroupingRule) pulumi.StringOutput { return v.RuleType }).(pulumi.StringOutput)
}

type AutoGroupingRuleArrayOutput struct{ *pulumi.OutputState }

func (AutoGroupingRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutoGroupingRule)(nil)).Elem()
}

func (o AutoGroupingRuleArrayOutput) ToAutoGroupingRuleArrayOutput() AutoGroupingRuleArrayOutput {
	return o
}

func (o AutoGroupingRuleArrayOutput) ToAutoGroupingRuleArrayOutputWithContext(ctx context.Context) AutoGroupingRuleArrayOutput {
	return o
}

func (o AutoGroupingRuleArrayOutput) Index(i pulumi.IntInput) AutoGroupingRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AutoGroupingRule {
		return vs[0].([]*AutoGroupingRule)[vs[1].(int)]
	}).(AutoGroupingRuleOutput)
}

type AutoGroupingRuleMapOutput struct{ *pulumi.OutputState }

func (AutoGroupingRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutoGroupingRule)(nil)).Elem()
}

func (o AutoGroupingRuleMapOutput) ToAutoGroupingRuleMapOutput() AutoGroupingRuleMapOutput {
	return o
}

func (o AutoGroupingRuleMapOutput) ToAutoGroupingRuleMapOutputWithContext(ctx context.Context) AutoGroupingRuleMapOutput {
	return o
}

func (o AutoGroupingRuleMapOutput) MapIndex(k pulumi.StringInput) AutoGroupingRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AutoGroupingRule {
		return vs[0].(map[string]*AutoGroupingRule)[vs[1].(string)]
	}).(AutoGroupingRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AutoGroupingRuleInput)(nil)).Elem(), &AutoGroupingRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutoGroupingRuleArrayInput)(nil)).Elem(), AutoGroupingRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutoGroupingRuleMapInput)(nil)).Elem(), AutoGroupingRuleMap{})
	pulumi.RegisterOutputType(AutoGroupingRuleOutput{})
	pulumi.RegisterOutputType(AutoGroupingRuleArrayOutput{})
	pulumi.RegisterOutputType(AutoGroupingRuleMapOutput{})
}
