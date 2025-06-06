// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Api Gateway Model resource.
//
// For information about Api Gateway Model and how to use it, see [What is Model](https://www.alibabacloud.com/help/en/api-gateway/latest/api-cloudapi-2016-07-14-createmodel).
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/apigateway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := apigateway.NewGroup(ctx, "default", &apigateway.GroupArgs{
//				Name:        pulumi.String("example_value"),
//				Description: pulumi.String("example_value"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = apigateway.NewModel(ctx, "default", &apigateway.ModelArgs{
//				GroupId:     _default.ID(),
//				ModelName:   pulumi.String("example_value"),
//				Schema:      pulumi.String("{\"type\":\"object\",\"properties\":{\"id\":{\"format\":\"int64\",\"maximum\":100,\"exclusiveMaximum\":true,\"type\":\"integer\"},\"name\":{\"maxLength\":10,\"type\":\"string\"}}}"),
//				Description: pulumi.String("example_value"),
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
// Api Gateway Model can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:apigateway/model:Model example <group_id>:<model_name>
// ```
type Model struct {
	pulumi.CustomResourceState

	// The description of the model.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The group of the model belongs to.
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// The name of the model.
	ModelName pulumi.StringOutput `pulumi:"modelName"`
	// The schema of the model.
	Schema pulumi.StringOutput `pulumi:"schema"`
}

// NewModel registers a new resource with the given unique name, arguments, and options.
func NewModel(ctx *pulumi.Context,
	name string, args *ModelArgs, opts ...pulumi.ResourceOption) (*Model, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	if args.ModelName == nil {
		return nil, errors.New("invalid value for required argument 'ModelName'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Model
	err := ctx.RegisterResource("alicloud:apigateway/model:Model", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetModel gets an existing Model resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetModel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ModelState, opts ...pulumi.ResourceOption) (*Model, error) {
	var resource Model
	err := ctx.ReadResource("alicloud:apigateway/model:Model", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Model resources.
type modelState struct {
	// The description of the model.
	Description *string `pulumi:"description"`
	// The group of the model belongs to.
	GroupId *string `pulumi:"groupId"`
	// The name of the model.
	ModelName *string `pulumi:"modelName"`
	// The schema of the model.
	Schema *string `pulumi:"schema"`
}

type ModelState struct {
	// The description of the model.
	Description pulumi.StringPtrInput
	// The group of the model belongs to.
	GroupId pulumi.StringPtrInput
	// The name of the model.
	ModelName pulumi.StringPtrInput
	// The schema of the model.
	Schema pulumi.StringPtrInput
}

func (ModelState) ElementType() reflect.Type {
	return reflect.TypeOf((*modelState)(nil)).Elem()
}

type modelArgs struct {
	// The description of the model.
	Description *string `pulumi:"description"`
	// The group of the model belongs to.
	GroupId string `pulumi:"groupId"`
	// The name of the model.
	ModelName string `pulumi:"modelName"`
	// The schema of the model.
	Schema string `pulumi:"schema"`
}

// The set of arguments for constructing a Model resource.
type ModelArgs struct {
	// The description of the model.
	Description pulumi.StringPtrInput
	// The group of the model belongs to.
	GroupId pulumi.StringInput
	// The name of the model.
	ModelName pulumi.StringInput
	// The schema of the model.
	Schema pulumi.StringInput
}

func (ModelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*modelArgs)(nil)).Elem()
}

type ModelInput interface {
	pulumi.Input

	ToModelOutput() ModelOutput
	ToModelOutputWithContext(ctx context.Context) ModelOutput
}

func (*Model) ElementType() reflect.Type {
	return reflect.TypeOf((**Model)(nil)).Elem()
}

func (i *Model) ToModelOutput() ModelOutput {
	return i.ToModelOutputWithContext(context.Background())
}

func (i *Model) ToModelOutputWithContext(ctx context.Context) ModelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelOutput)
}

// ModelArrayInput is an input type that accepts ModelArray and ModelArrayOutput values.
// You can construct a concrete instance of `ModelArrayInput` via:
//
//	ModelArray{ ModelArgs{...} }
type ModelArrayInput interface {
	pulumi.Input

	ToModelArrayOutput() ModelArrayOutput
	ToModelArrayOutputWithContext(context.Context) ModelArrayOutput
}

type ModelArray []ModelInput

func (ModelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Model)(nil)).Elem()
}

func (i ModelArray) ToModelArrayOutput() ModelArrayOutput {
	return i.ToModelArrayOutputWithContext(context.Background())
}

func (i ModelArray) ToModelArrayOutputWithContext(ctx context.Context) ModelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelArrayOutput)
}

// ModelMapInput is an input type that accepts ModelMap and ModelMapOutput values.
// You can construct a concrete instance of `ModelMapInput` via:
//
//	ModelMap{ "key": ModelArgs{...} }
type ModelMapInput interface {
	pulumi.Input

	ToModelMapOutput() ModelMapOutput
	ToModelMapOutputWithContext(context.Context) ModelMapOutput
}

type ModelMap map[string]ModelInput

func (ModelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Model)(nil)).Elem()
}

func (i ModelMap) ToModelMapOutput() ModelMapOutput {
	return i.ToModelMapOutputWithContext(context.Background())
}

func (i ModelMap) ToModelMapOutputWithContext(ctx context.Context) ModelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelMapOutput)
}

type ModelOutput struct{ *pulumi.OutputState }

func (ModelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Model)(nil)).Elem()
}

func (o ModelOutput) ToModelOutput() ModelOutput {
	return o
}

func (o ModelOutput) ToModelOutputWithContext(ctx context.Context) ModelOutput {
	return o
}

// The description of the model.
func (o ModelOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Model) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The group of the model belongs to.
func (o ModelOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Model) pulumi.StringOutput { return v.GroupId }).(pulumi.StringOutput)
}

// The name of the model.
func (o ModelOutput) ModelName() pulumi.StringOutput {
	return o.ApplyT(func(v *Model) pulumi.StringOutput { return v.ModelName }).(pulumi.StringOutput)
}

// The schema of the model.
func (o ModelOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Model) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

type ModelArrayOutput struct{ *pulumi.OutputState }

func (ModelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Model)(nil)).Elem()
}

func (o ModelArrayOutput) ToModelArrayOutput() ModelArrayOutput {
	return o
}

func (o ModelArrayOutput) ToModelArrayOutputWithContext(ctx context.Context) ModelArrayOutput {
	return o
}

func (o ModelArrayOutput) Index(i pulumi.IntInput) ModelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Model {
		return vs[0].([]*Model)[vs[1].(int)]
	}).(ModelOutput)
}

type ModelMapOutput struct{ *pulumi.OutputState }

func (ModelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Model)(nil)).Elem()
}

func (o ModelMapOutput) ToModelMapOutput() ModelMapOutput {
	return o
}

func (o ModelMapOutput) ToModelMapOutputWithContext(ctx context.Context) ModelMapOutput {
	return o
}

func (o ModelMapOutput) MapIndex(k pulumi.StringInput) ModelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Model {
		return vs[0].(map[string]*Model)[vs[1].(string)]
	}).(ModelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ModelInput)(nil)).Elem(), &Model{})
	pulumi.RegisterInputType(reflect.TypeOf((*ModelArrayInput)(nil)).Elem(), ModelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ModelMapInput)(nil)).Elem(), ModelMap{})
	pulumi.RegisterOutputType(ModelOutput{})
	pulumi.RegisterOutputType(ModelArrayOutput{})
	pulumi.RegisterOutputType(ModelMapOutput{})
}
