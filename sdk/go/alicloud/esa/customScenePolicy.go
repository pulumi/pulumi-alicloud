// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package esa

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ESA Custom Scene Policy resource.
//
// For information about ESA Custom Scene Policy and how to use it, see [What is Custom Scene Policy](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateCustomScenePolicy).
//
// > **NOTE:** Available since v1.253.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/esa"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "bcd58610.com"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_default, err := esa.GetSites(ctx, &esa.GetSitesArgs{
//				PlanSubscribeType: pulumi.StringRef("enterpriseplan"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultSite, err := esa.NewSite(ctx, "default", &esa.SiteArgs{
//				SiteName:          pulumi.String(name),
//				InstanceId:        pulumi.String(_default.Sites[0].InstanceId),
//				Coverage:          pulumi.String("overseas"),
//				AccessType:        pulumi.String("NS"),
//				VersionManagement: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = esa.NewCustomScenePolicy(ctx, "default", &esa.CustomScenePolicyArgs{
//				EndTime:               pulumi.String("2025-08-07T17:00:00Z"),
//				CreateTime:            pulumi.String("2025-07-07T17:00:00Z"),
//				SiteIds:               defaultSite.ID(),
//				Template:              pulumi.String("promotion"),
//				CustomScenePolicyName: pulumi.String("example-policy"),
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
// ESA Custom Scene Policy can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:esa/customScenePolicy:CustomScenePolicy example <id>
// ```
type CustomScenePolicy struct {
	pulumi.CustomResourceState

	// The time when the policy takes effect.
	// The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The policy name.
	CustomScenePolicyName pulumi.StringOutput `pulumi:"customScenePolicyName"`
	// The time when the policy expires.
	// The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	EndTime pulumi.StringOutput `pulumi:"endTime"`
	// The IDs of websites associated.
	SiteIds pulumi.StringOutput `pulumi:"siteIds"`
	// Policy effective status. Valid values: `Disabled`, `Running`.
	Status pulumi.StringOutput `pulumi:"status"`
	// The name of the policy template. Valid value:
	Template pulumi.StringOutput `pulumi:"template"`
}

// NewCustomScenePolicy registers a new resource with the given unique name, arguments, and options.
func NewCustomScenePolicy(ctx *pulumi.Context,
	name string, args *CustomScenePolicyArgs, opts ...pulumi.ResourceOption) (*CustomScenePolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CreateTime == nil {
		return nil, errors.New("invalid value for required argument 'CreateTime'")
	}
	if args.CustomScenePolicyName == nil {
		return nil, errors.New("invalid value for required argument 'CustomScenePolicyName'")
	}
	if args.EndTime == nil {
		return nil, errors.New("invalid value for required argument 'EndTime'")
	}
	if args.SiteIds == nil {
		return nil, errors.New("invalid value for required argument 'SiteIds'")
	}
	if args.Template == nil {
		return nil, errors.New("invalid value for required argument 'Template'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CustomScenePolicy
	err := ctx.RegisterResource("alicloud:esa/customScenePolicy:CustomScenePolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomScenePolicy gets an existing CustomScenePolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomScenePolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomScenePolicyState, opts ...pulumi.ResourceOption) (*CustomScenePolicy, error) {
	var resource CustomScenePolicy
	err := ctx.ReadResource("alicloud:esa/customScenePolicy:CustomScenePolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomScenePolicy resources.
type customScenePolicyState struct {
	// The time when the policy takes effect.
	// The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	CreateTime *string `pulumi:"createTime"`
	// The policy name.
	CustomScenePolicyName *string `pulumi:"customScenePolicyName"`
	// The time when the policy expires.
	// The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	EndTime *string `pulumi:"endTime"`
	// The IDs of websites associated.
	SiteIds *string `pulumi:"siteIds"`
	// Policy effective status. Valid values: `Disabled`, `Running`.
	Status *string `pulumi:"status"`
	// The name of the policy template. Valid value:
	Template *string `pulumi:"template"`
}

type CustomScenePolicyState struct {
	// The time when the policy takes effect.
	// The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	CreateTime pulumi.StringPtrInput
	// The policy name.
	CustomScenePolicyName pulumi.StringPtrInput
	// The time when the policy expires.
	// The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	EndTime pulumi.StringPtrInput
	// The IDs of websites associated.
	SiteIds pulumi.StringPtrInput
	// Policy effective status. Valid values: `Disabled`, `Running`.
	Status pulumi.StringPtrInput
	// The name of the policy template. Valid value:
	Template pulumi.StringPtrInput
}

func (CustomScenePolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*customScenePolicyState)(nil)).Elem()
}

type customScenePolicyArgs struct {
	// The time when the policy takes effect.
	// The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	CreateTime string `pulumi:"createTime"`
	// The policy name.
	CustomScenePolicyName string `pulumi:"customScenePolicyName"`
	// The time when the policy expires.
	// The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	EndTime string `pulumi:"endTime"`
	// The IDs of websites associated.
	SiteIds string `pulumi:"siteIds"`
	// Policy effective status. Valid values: `Disabled`, `Running`.
	Status *string `pulumi:"status"`
	// The name of the policy template. Valid value:
	Template string `pulumi:"template"`
}

// The set of arguments for constructing a CustomScenePolicy resource.
type CustomScenePolicyArgs struct {
	// The time when the policy takes effect.
	// The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	CreateTime pulumi.StringInput
	// The policy name.
	CustomScenePolicyName pulumi.StringInput
	// The time when the policy expires.
	// The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	EndTime pulumi.StringInput
	// The IDs of websites associated.
	SiteIds pulumi.StringInput
	// Policy effective status. Valid values: `Disabled`, `Running`.
	Status pulumi.StringPtrInput
	// The name of the policy template. Valid value:
	Template pulumi.StringInput
}

func (CustomScenePolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customScenePolicyArgs)(nil)).Elem()
}

type CustomScenePolicyInput interface {
	pulumi.Input

	ToCustomScenePolicyOutput() CustomScenePolicyOutput
	ToCustomScenePolicyOutputWithContext(ctx context.Context) CustomScenePolicyOutput
}

func (*CustomScenePolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomScenePolicy)(nil)).Elem()
}

func (i *CustomScenePolicy) ToCustomScenePolicyOutput() CustomScenePolicyOutput {
	return i.ToCustomScenePolicyOutputWithContext(context.Background())
}

func (i *CustomScenePolicy) ToCustomScenePolicyOutputWithContext(ctx context.Context) CustomScenePolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomScenePolicyOutput)
}

// CustomScenePolicyArrayInput is an input type that accepts CustomScenePolicyArray and CustomScenePolicyArrayOutput values.
// You can construct a concrete instance of `CustomScenePolicyArrayInput` via:
//
//	CustomScenePolicyArray{ CustomScenePolicyArgs{...} }
type CustomScenePolicyArrayInput interface {
	pulumi.Input

	ToCustomScenePolicyArrayOutput() CustomScenePolicyArrayOutput
	ToCustomScenePolicyArrayOutputWithContext(context.Context) CustomScenePolicyArrayOutput
}

type CustomScenePolicyArray []CustomScenePolicyInput

func (CustomScenePolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomScenePolicy)(nil)).Elem()
}

func (i CustomScenePolicyArray) ToCustomScenePolicyArrayOutput() CustomScenePolicyArrayOutput {
	return i.ToCustomScenePolicyArrayOutputWithContext(context.Background())
}

func (i CustomScenePolicyArray) ToCustomScenePolicyArrayOutputWithContext(ctx context.Context) CustomScenePolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomScenePolicyArrayOutput)
}

// CustomScenePolicyMapInput is an input type that accepts CustomScenePolicyMap and CustomScenePolicyMapOutput values.
// You can construct a concrete instance of `CustomScenePolicyMapInput` via:
//
//	CustomScenePolicyMap{ "key": CustomScenePolicyArgs{...} }
type CustomScenePolicyMapInput interface {
	pulumi.Input

	ToCustomScenePolicyMapOutput() CustomScenePolicyMapOutput
	ToCustomScenePolicyMapOutputWithContext(context.Context) CustomScenePolicyMapOutput
}

type CustomScenePolicyMap map[string]CustomScenePolicyInput

func (CustomScenePolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomScenePolicy)(nil)).Elem()
}

func (i CustomScenePolicyMap) ToCustomScenePolicyMapOutput() CustomScenePolicyMapOutput {
	return i.ToCustomScenePolicyMapOutputWithContext(context.Background())
}

func (i CustomScenePolicyMap) ToCustomScenePolicyMapOutputWithContext(ctx context.Context) CustomScenePolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomScenePolicyMapOutput)
}

type CustomScenePolicyOutput struct{ *pulumi.OutputState }

func (CustomScenePolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomScenePolicy)(nil)).Elem()
}

func (o CustomScenePolicyOutput) ToCustomScenePolicyOutput() CustomScenePolicyOutput {
	return o
}

func (o CustomScenePolicyOutput) ToCustomScenePolicyOutputWithContext(ctx context.Context) CustomScenePolicyOutput {
	return o
}

// The time when the policy takes effect.
// The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
func (o CustomScenePolicyOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomScenePolicy) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The policy name.
func (o CustomScenePolicyOutput) CustomScenePolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomScenePolicy) pulumi.StringOutput { return v.CustomScenePolicyName }).(pulumi.StringOutput)
}

// The time when the policy expires.
// The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
func (o CustomScenePolicyOutput) EndTime() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomScenePolicy) pulumi.StringOutput { return v.EndTime }).(pulumi.StringOutput)
}

// The IDs of websites associated.
func (o CustomScenePolicyOutput) SiteIds() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomScenePolicy) pulumi.StringOutput { return v.SiteIds }).(pulumi.StringOutput)
}

// Policy effective status. Valid values: `Disabled`, `Running`.
func (o CustomScenePolicyOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomScenePolicy) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The name of the policy template. Valid value:
func (o CustomScenePolicyOutput) Template() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomScenePolicy) pulumi.StringOutput { return v.Template }).(pulumi.StringOutput)
}

type CustomScenePolicyArrayOutput struct{ *pulumi.OutputState }

func (CustomScenePolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomScenePolicy)(nil)).Elem()
}

func (o CustomScenePolicyArrayOutput) ToCustomScenePolicyArrayOutput() CustomScenePolicyArrayOutput {
	return o
}

func (o CustomScenePolicyArrayOutput) ToCustomScenePolicyArrayOutputWithContext(ctx context.Context) CustomScenePolicyArrayOutput {
	return o
}

func (o CustomScenePolicyArrayOutput) Index(i pulumi.IntInput) CustomScenePolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomScenePolicy {
		return vs[0].([]*CustomScenePolicy)[vs[1].(int)]
	}).(CustomScenePolicyOutput)
}

type CustomScenePolicyMapOutput struct{ *pulumi.OutputState }

func (CustomScenePolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomScenePolicy)(nil)).Elem()
}

func (o CustomScenePolicyMapOutput) ToCustomScenePolicyMapOutput() CustomScenePolicyMapOutput {
	return o
}

func (o CustomScenePolicyMapOutput) ToCustomScenePolicyMapOutputWithContext(ctx context.Context) CustomScenePolicyMapOutput {
	return o
}

func (o CustomScenePolicyMapOutput) MapIndex(k pulumi.StringInput) CustomScenePolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomScenePolicy {
		return vs[0].(map[string]*CustomScenePolicy)[vs[1].(string)]
	}).(CustomScenePolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomScenePolicyInput)(nil)).Elem(), &CustomScenePolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomScenePolicyArrayInput)(nil)).Elem(), CustomScenePolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomScenePolicyMapInput)(nil)).Elem(), CustomScenePolicyMap{})
	pulumi.RegisterOutputType(CustomScenePolicyOutput{})
	pulumi.RegisterOutputType(CustomScenePolicyArrayOutput{})
	pulumi.RegisterOutputType(CustomScenePolicyMapOutput{})
}
