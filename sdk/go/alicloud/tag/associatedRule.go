// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package tag

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a TAG Associated Rule resource.
//
// For information about TAG Associated Rule and how to use it, see [What is Associated Rule](https://www.alibabacloud.com/help/en/resource-management/tag/developer-reference/api-tag-2018-08-28-createassociatedresourcerules).
//
// > **NOTE:** Available since v1.244.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/tag"
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
//			_, err := tag.NewAssociatedRule(ctx, "default", &tag.AssociatedRuleArgs{
//				Status:                pulumi.String("Enable"),
//				AssociatedSettingName: pulumi.String("rule:AttachEni-DetachEni-TagInstance:Ecs-Instance:Ecs-Eni"),
//				TagKeys: pulumi.StringArray{
//					pulumi.String("user"),
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
// TAG Associated Rule can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:tag/associatedRule:AssociatedRule example <id>
// ```
type AssociatedRule struct {
	pulumi.CustomResourceState

	// The setting name of the associated resource tag rule. For specific values, see the Rule Setting Name column in [Resources that Support Associated Resource Tag Settings](https://www.alibabacloud.com/help/en/resource-management/tag/user-guide/associated-resource-label-settings)
	AssociatedSettingName pulumi.StringOutput `pulumi:"associatedSettingName"`
	// Whether to enable the associated resource tag rule. Valid values: `Enable`, `Disable`.
	Status pulumi.StringOutput `pulumi:"status"`
	// List of tag keys for the associated resource tag rule.
	TagKeys pulumi.StringArrayOutput `pulumi:"tagKeys"`
}

// NewAssociatedRule registers a new resource with the given unique name, arguments, and options.
func NewAssociatedRule(ctx *pulumi.Context,
	name string, args *AssociatedRuleArgs, opts ...pulumi.ResourceOption) (*AssociatedRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AssociatedSettingName == nil {
		return nil, errors.New("invalid value for required argument 'AssociatedSettingName'")
	}
	if args.Status == nil {
		return nil, errors.New("invalid value for required argument 'Status'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AssociatedRule
	err := ctx.RegisterResource("alicloud:tag/associatedRule:AssociatedRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAssociatedRule gets an existing AssociatedRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAssociatedRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AssociatedRuleState, opts ...pulumi.ResourceOption) (*AssociatedRule, error) {
	var resource AssociatedRule
	err := ctx.ReadResource("alicloud:tag/associatedRule:AssociatedRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AssociatedRule resources.
type associatedRuleState struct {
	// The setting name of the associated resource tag rule. For specific values, see the Rule Setting Name column in [Resources that Support Associated Resource Tag Settings](https://www.alibabacloud.com/help/en/resource-management/tag/user-guide/associated-resource-label-settings)
	AssociatedSettingName *string `pulumi:"associatedSettingName"`
	// Whether to enable the associated resource tag rule. Valid values: `Enable`, `Disable`.
	Status *string `pulumi:"status"`
	// List of tag keys for the associated resource tag rule.
	TagKeys []string `pulumi:"tagKeys"`
}

type AssociatedRuleState struct {
	// The setting name of the associated resource tag rule. For specific values, see the Rule Setting Name column in [Resources that Support Associated Resource Tag Settings](https://www.alibabacloud.com/help/en/resource-management/tag/user-guide/associated-resource-label-settings)
	AssociatedSettingName pulumi.StringPtrInput
	// Whether to enable the associated resource tag rule. Valid values: `Enable`, `Disable`.
	Status pulumi.StringPtrInput
	// List of tag keys for the associated resource tag rule.
	TagKeys pulumi.StringArrayInput
}

func (AssociatedRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*associatedRuleState)(nil)).Elem()
}

type associatedRuleArgs struct {
	// The setting name of the associated resource tag rule. For specific values, see the Rule Setting Name column in [Resources that Support Associated Resource Tag Settings](https://www.alibabacloud.com/help/en/resource-management/tag/user-guide/associated-resource-label-settings)
	AssociatedSettingName string `pulumi:"associatedSettingName"`
	// Whether to enable the associated resource tag rule. Valid values: `Enable`, `Disable`.
	Status string `pulumi:"status"`
	// List of tag keys for the associated resource tag rule.
	TagKeys []string `pulumi:"tagKeys"`
}

// The set of arguments for constructing a AssociatedRule resource.
type AssociatedRuleArgs struct {
	// The setting name of the associated resource tag rule. For specific values, see the Rule Setting Name column in [Resources that Support Associated Resource Tag Settings](https://www.alibabacloud.com/help/en/resource-management/tag/user-guide/associated-resource-label-settings)
	AssociatedSettingName pulumi.StringInput
	// Whether to enable the associated resource tag rule. Valid values: `Enable`, `Disable`.
	Status pulumi.StringInput
	// List of tag keys for the associated resource tag rule.
	TagKeys pulumi.StringArrayInput
}

func (AssociatedRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*associatedRuleArgs)(nil)).Elem()
}

type AssociatedRuleInput interface {
	pulumi.Input

	ToAssociatedRuleOutput() AssociatedRuleOutput
	ToAssociatedRuleOutputWithContext(ctx context.Context) AssociatedRuleOutput
}

func (*AssociatedRule) ElementType() reflect.Type {
	return reflect.TypeOf((**AssociatedRule)(nil)).Elem()
}

func (i *AssociatedRule) ToAssociatedRuleOutput() AssociatedRuleOutput {
	return i.ToAssociatedRuleOutputWithContext(context.Background())
}

func (i *AssociatedRule) ToAssociatedRuleOutputWithContext(ctx context.Context) AssociatedRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssociatedRuleOutput)
}

// AssociatedRuleArrayInput is an input type that accepts AssociatedRuleArray and AssociatedRuleArrayOutput values.
// You can construct a concrete instance of `AssociatedRuleArrayInput` via:
//
//	AssociatedRuleArray{ AssociatedRuleArgs{...} }
type AssociatedRuleArrayInput interface {
	pulumi.Input

	ToAssociatedRuleArrayOutput() AssociatedRuleArrayOutput
	ToAssociatedRuleArrayOutputWithContext(context.Context) AssociatedRuleArrayOutput
}

type AssociatedRuleArray []AssociatedRuleInput

func (AssociatedRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AssociatedRule)(nil)).Elem()
}

func (i AssociatedRuleArray) ToAssociatedRuleArrayOutput() AssociatedRuleArrayOutput {
	return i.ToAssociatedRuleArrayOutputWithContext(context.Background())
}

func (i AssociatedRuleArray) ToAssociatedRuleArrayOutputWithContext(ctx context.Context) AssociatedRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssociatedRuleArrayOutput)
}

// AssociatedRuleMapInput is an input type that accepts AssociatedRuleMap and AssociatedRuleMapOutput values.
// You can construct a concrete instance of `AssociatedRuleMapInput` via:
//
//	AssociatedRuleMap{ "key": AssociatedRuleArgs{...} }
type AssociatedRuleMapInput interface {
	pulumi.Input

	ToAssociatedRuleMapOutput() AssociatedRuleMapOutput
	ToAssociatedRuleMapOutputWithContext(context.Context) AssociatedRuleMapOutput
}

type AssociatedRuleMap map[string]AssociatedRuleInput

func (AssociatedRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AssociatedRule)(nil)).Elem()
}

func (i AssociatedRuleMap) ToAssociatedRuleMapOutput() AssociatedRuleMapOutput {
	return i.ToAssociatedRuleMapOutputWithContext(context.Background())
}

func (i AssociatedRuleMap) ToAssociatedRuleMapOutputWithContext(ctx context.Context) AssociatedRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssociatedRuleMapOutput)
}

type AssociatedRuleOutput struct{ *pulumi.OutputState }

func (AssociatedRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AssociatedRule)(nil)).Elem()
}

func (o AssociatedRuleOutput) ToAssociatedRuleOutput() AssociatedRuleOutput {
	return o
}

func (o AssociatedRuleOutput) ToAssociatedRuleOutputWithContext(ctx context.Context) AssociatedRuleOutput {
	return o
}

// The setting name of the associated resource tag rule. For specific values, see the Rule Setting Name column in [Resources that Support Associated Resource Tag Settings](https://www.alibabacloud.com/help/en/resource-management/tag/user-guide/associated-resource-label-settings)
func (o AssociatedRuleOutput) AssociatedSettingName() pulumi.StringOutput {
	return o.ApplyT(func(v *AssociatedRule) pulumi.StringOutput { return v.AssociatedSettingName }).(pulumi.StringOutput)
}

// Whether to enable the associated resource tag rule. Valid values: `Enable`, `Disable`.
func (o AssociatedRuleOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *AssociatedRule) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// List of tag keys for the associated resource tag rule.
func (o AssociatedRuleOutput) TagKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AssociatedRule) pulumi.StringArrayOutput { return v.TagKeys }).(pulumi.StringArrayOutput)
}

type AssociatedRuleArrayOutput struct{ *pulumi.OutputState }

func (AssociatedRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AssociatedRule)(nil)).Elem()
}

func (o AssociatedRuleArrayOutput) ToAssociatedRuleArrayOutput() AssociatedRuleArrayOutput {
	return o
}

func (o AssociatedRuleArrayOutput) ToAssociatedRuleArrayOutputWithContext(ctx context.Context) AssociatedRuleArrayOutput {
	return o
}

func (o AssociatedRuleArrayOutput) Index(i pulumi.IntInput) AssociatedRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AssociatedRule {
		return vs[0].([]*AssociatedRule)[vs[1].(int)]
	}).(AssociatedRuleOutput)
}

type AssociatedRuleMapOutput struct{ *pulumi.OutputState }

func (AssociatedRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AssociatedRule)(nil)).Elem()
}

func (o AssociatedRuleMapOutput) ToAssociatedRuleMapOutput() AssociatedRuleMapOutput {
	return o
}

func (o AssociatedRuleMapOutput) ToAssociatedRuleMapOutputWithContext(ctx context.Context) AssociatedRuleMapOutput {
	return o
}

func (o AssociatedRuleMapOutput) MapIndex(k pulumi.StringInput) AssociatedRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AssociatedRule {
		return vs[0].(map[string]*AssociatedRule)[vs[1].(string)]
	}).(AssociatedRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AssociatedRuleInput)(nil)).Elem(), &AssociatedRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssociatedRuleArrayInput)(nil)).Elem(), AssociatedRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssociatedRuleMapInput)(nil)).Elem(), AssociatedRuleMap{})
	pulumi.RegisterOutputType(AssociatedRuleOutput{})
	pulumi.RegisterOutputType(AssociatedRuleArrayOutput{})
	pulumi.RegisterOutputType(AssociatedRuleMapOutput{})
}
