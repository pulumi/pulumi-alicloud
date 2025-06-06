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

// Provides a Resource Manager Saved Query resource. ResourceCenter Saved Query.
//
// For information about Resource Manager Saved Query and how to use it, see [What is Saved Query](https://www.alibabacloud.com/help/zh/resource-management/developer-reference/api-resourcecenter-2022-12-01-createsavedquery).
//
// > **NOTE:** Available since v1.212.0.
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
//			_, err := resourcemanager.NewSavedQuery(ctx, "default", &resourcemanager.SavedQueryArgs{
//				Description:    pulumi.String(name),
//				Expression:     pulumi.String("select * from resources limit 1;"),
//				SavedQueryName: pulumi.String(name),
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
// Resource Manager Saved Query can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:resourcemanager/savedQuery:SavedQuery example <id>
// ```
type SavedQuery struct {
	pulumi.CustomResourceState

	// The creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Query Description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Query Expression.
	Expression pulumi.StringOutput `pulumi:"expression"`
	// The name of the resource.
	SavedQueryName pulumi.StringOutput `pulumi:"savedQueryName"`
}

// NewSavedQuery registers a new resource with the given unique name, arguments, and options.
func NewSavedQuery(ctx *pulumi.Context,
	name string, args *SavedQueryArgs, opts ...pulumi.ResourceOption) (*SavedQuery, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Expression == nil {
		return nil, errors.New("invalid value for required argument 'Expression'")
	}
	if args.SavedQueryName == nil {
		return nil, errors.New("invalid value for required argument 'SavedQueryName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SavedQuery
	err := ctx.RegisterResource("alicloud:resourcemanager/savedQuery:SavedQuery", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSavedQuery gets an existing SavedQuery resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSavedQuery(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SavedQueryState, opts ...pulumi.ResourceOption) (*SavedQuery, error) {
	var resource SavedQuery
	err := ctx.ReadResource("alicloud:resourcemanager/savedQuery:SavedQuery", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SavedQuery resources.
type savedQueryState struct {
	// The creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// Query Description.
	Description *string `pulumi:"description"`
	// Query Expression.
	Expression *string `pulumi:"expression"`
	// The name of the resource.
	SavedQueryName *string `pulumi:"savedQueryName"`
}

type SavedQueryState struct {
	// The creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// Query Description.
	Description pulumi.StringPtrInput
	// Query Expression.
	Expression pulumi.StringPtrInput
	// The name of the resource.
	SavedQueryName pulumi.StringPtrInput
}

func (SavedQueryState) ElementType() reflect.Type {
	return reflect.TypeOf((*savedQueryState)(nil)).Elem()
}

type savedQueryArgs struct {
	// Query Description.
	Description *string `pulumi:"description"`
	// Query Expression.
	Expression string `pulumi:"expression"`
	// The name of the resource.
	SavedQueryName string `pulumi:"savedQueryName"`
}

// The set of arguments for constructing a SavedQuery resource.
type SavedQueryArgs struct {
	// Query Description.
	Description pulumi.StringPtrInput
	// Query Expression.
	Expression pulumi.StringInput
	// The name of the resource.
	SavedQueryName pulumi.StringInput
}

func (SavedQueryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*savedQueryArgs)(nil)).Elem()
}

type SavedQueryInput interface {
	pulumi.Input

	ToSavedQueryOutput() SavedQueryOutput
	ToSavedQueryOutputWithContext(ctx context.Context) SavedQueryOutput
}

func (*SavedQuery) ElementType() reflect.Type {
	return reflect.TypeOf((**SavedQuery)(nil)).Elem()
}

func (i *SavedQuery) ToSavedQueryOutput() SavedQueryOutput {
	return i.ToSavedQueryOutputWithContext(context.Background())
}

func (i *SavedQuery) ToSavedQueryOutputWithContext(ctx context.Context) SavedQueryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SavedQueryOutput)
}

// SavedQueryArrayInput is an input type that accepts SavedQueryArray and SavedQueryArrayOutput values.
// You can construct a concrete instance of `SavedQueryArrayInput` via:
//
//	SavedQueryArray{ SavedQueryArgs{...} }
type SavedQueryArrayInput interface {
	pulumi.Input

	ToSavedQueryArrayOutput() SavedQueryArrayOutput
	ToSavedQueryArrayOutputWithContext(context.Context) SavedQueryArrayOutput
}

type SavedQueryArray []SavedQueryInput

func (SavedQueryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SavedQuery)(nil)).Elem()
}

func (i SavedQueryArray) ToSavedQueryArrayOutput() SavedQueryArrayOutput {
	return i.ToSavedQueryArrayOutputWithContext(context.Background())
}

func (i SavedQueryArray) ToSavedQueryArrayOutputWithContext(ctx context.Context) SavedQueryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SavedQueryArrayOutput)
}

// SavedQueryMapInput is an input type that accepts SavedQueryMap and SavedQueryMapOutput values.
// You can construct a concrete instance of `SavedQueryMapInput` via:
//
//	SavedQueryMap{ "key": SavedQueryArgs{...} }
type SavedQueryMapInput interface {
	pulumi.Input

	ToSavedQueryMapOutput() SavedQueryMapOutput
	ToSavedQueryMapOutputWithContext(context.Context) SavedQueryMapOutput
}

type SavedQueryMap map[string]SavedQueryInput

func (SavedQueryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SavedQuery)(nil)).Elem()
}

func (i SavedQueryMap) ToSavedQueryMapOutput() SavedQueryMapOutput {
	return i.ToSavedQueryMapOutputWithContext(context.Background())
}

func (i SavedQueryMap) ToSavedQueryMapOutputWithContext(ctx context.Context) SavedQueryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SavedQueryMapOutput)
}

type SavedQueryOutput struct{ *pulumi.OutputState }

func (SavedQueryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SavedQuery)(nil)).Elem()
}

func (o SavedQueryOutput) ToSavedQueryOutput() SavedQueryOutput {
	return o
}

func (o SavedQueryOutput) ToSavedQueryOutputWithContext(ctx context.Context) SavedQueryOutput {
	return o
}

// The creation time of the resource.
func (o SavedQueryOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *SavedQuery) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Query Description.
func (o SavedQueryOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SavedQuery) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Query Expression.
func (o SavedQueryOutput) Expression() pulumi.StringOutput {
	return o.ApplyT(func(v *SavedQuery) pulumi.StringOutput { return v.Expression }).(pulumi.StringOutput)
}

// The name of the resource.
func (o SavedQueryOutput) SavedQueryName() pulumi.StringOutput {
	return o.ApplyT(func(v *SavedQuery) pulumi.StringOutput { return v.SavedQueryName }).(pulumi.StringOutput)
}

type SavedQueryArrayOutput struct{ *pulumi.OutputState }

func (SavedQueryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SavedQuery)(nil)).Elem()
}

func (o SavedQueryArrayOutput) ToSavedQueryArrayOutput() SavedQueryArrayOutput {
	return o
}

func (o SavedQueryArrayOutput) ToSavedQueryArrayOutputWithContext(ctx context.Context) SavedQueryArrayOutput {
	return o
}

func (o SavedQueryArrayOutput) Index(i pulumi.IntInput) SavedQueryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SavedQuery {
		return vs[0].([]*SavedQuery)[vs[1].(int)]
	}).(SavedQueryOutput)
}

type SavedQueryMapOutput struct{ *pulumi.OutputState }

func (SavedQueryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SavedQuery)(nil)).Elem()
}

func (o SavedQueryMapOutput) ToSavedQueryMapOutput() SavedQueryMapOutput {
	return o
}

func (o SavedQueryMapOutput) ToSavedQueryMapOutputWithContext(ctx context.Context) SavedQueryMapOutput {
	return o
}

func (o SavedQueryMapOutput) MapIndex(k pulumi.StringInput) SavedQueryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SavedQuery {
		return vs[0].(map[string]*SavedQuery)[vs[1].(string)]
	}).(SavedQueryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SavedQueryInput)(nil)).Elem(), &SavedQuery{})
	pulumi.RegisterInputType(reflect.TypeOf((*SavedQueryArrayInput)(nil)).Elem(), SavedQueryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SavedQueryMapInput)(nil)).Elem(), SavedQueryMap{})
	pulumi.RegisterOutputType(SavedQueryOutput{})
	pulumi.RegisterOutputType(SavedQueryArrayOutput{})
	pulumi.RegisterOutputType(SavedQueryMapOutput{})
}
