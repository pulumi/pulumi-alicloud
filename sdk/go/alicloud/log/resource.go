// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package log

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Log resource is a meta store service provided by log service, resource can be used to define meta store's table structure.
//
// For information about SLS Resource and how to use it, see [Resource management](https://www.alibabacloud.com/help/en/doc-detail/207732.html)
//
// > **NOTE:** Available since v1.162.0. log resource region should be set a main region: cn-heyuan.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/log"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := log.NewResource(ctx, "example", &log.ResourceArgs{
//				Type:        pulumi.String("userdefine"),
//				Name:        pulumi.String("user.tf.resource"),
//				Description: pulumi.String("user tf resource desc"),
//				ExtInfo:     pulumi.String("{}"),
//				Schema: pulumi.String(`    {
//	      "schema": [
//	        {
//	          "column": "col1",
//	          "desc": "col1   desc",
//	          "ext_info": {
//	          },
//	          "required": true,
//	          "type": "string"
//	        },
//	        {
//	          "column": "col2",
//	          "desc": "col2   desc",
//	          "ext_info": "optional",
//	          "required": true,
//	          "type": "string"
//	        }
//	      ]
//	    }
//
// `),
//
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
// Log resource can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:log/resource:Resource example <id>
// ```
type Resource struct {
	pulumi.CustomResourceState

	// The meta store's description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ext info of meta store.
	ExtInfo pulumi.StringPtrOutput `pulumi:"extInfo"`
	// The meta store's name, can be used as table name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The meta store's schema info, which is json string format, used to define table's fields.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// The meta store's type, userdefine e.g.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewResource registers a new resource with the given unique name, arguments, and options.
func NewResource(ctx *pulumi.Context,
	name string, args *ResourceArgs, opts ...pulumi.ResourceOption) (*Resource, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Resource
	err := ctx.RegisterResource("alicloud:log/resource:Resource", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResource gets an existing Resource resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResource(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceState, opts ...pulumi.ResourceOption) (*Resource, error) {
	var resource Resource
	err := ctx.ReadResource("alicloud:log/resource:Resource", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Resource resources.
type resourceState struct {
	// The meta store's description.
	Description *string `pulumi:"description"`
	// The ext info of meta store.
	ExtInfo *string `pulumi:"extInfo"`
	// The meta store's name, can be used as table name.
	Name *string `pulumi:"name"`
	// The meta store's schema info, which is json string format, used to define table's fields.
	Schema *string `pulumi:"schema"`
	// The meta store's type, userdefine e.g.
	Type *string `pulumi:"type"`
}

type ResourceState struct {
	// The meta store's description.
	Description pulumi.StringPtrInput
	// The ext info of meta store.
	ExtInfo pulumi.StringPtrInput
	// The meta store's name, can be used as table name.
	Name pulumi.StringPtrInput
	// The meta store's schema info, which is json string format, used to define table's fields.
	Schema pulumi.StringPtrInput
	// The meta store's type, userdefine e.g.
	Type pulumi.StringPtrInput
}

func (ResourceState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceState)(nil)).Elem()
}

type resourceArgs struct {
	// The meta store's description.
	Description *string `pulumi:"description"`
	// The ext info of meta store.
	ExtInfo *string `pulumi:"extInfo"`
	// The meta store's name, can be used as table name.
	Name *string `pulumi:"name"`
	// The meta store's schema info, which is json string format, used to define table's fields.
	Schema string `pulumi:"schema"`
	// The meta store's type, userdefine e.g.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a Resource resource.
type ResourceArgs struct {
	// The meta store's description.
	Description pulumi.StringPtrInput
	// The ext info of meta store.
	ExtInfo pulumi.StringPtrInput
	// The meta store's name, can be used as table name.
	Name pulumi.StringPtrInput
	// The meta store's schema info, which is json string format, used to define table's fields.
	Schema pulumi.StringInput
	// The meta store's type, userdefine e.g.
	Type pulumi.StringInput
}

func (ResourceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceArgs)(nil)).Elem()
}

type ResourceInput interface {
	pulumi.Input

	ToResourceOutput() ResourceOutput
	ToResourceOutputWithContext(ctx context.Context) ResourceOutput
}

func (*Resource) ElementType() reflect.Type {
	return reflect.TypeOf((**Resource)(nil)).Elem()
}

func (i *Resource) ToResourceOutput() ResourceOutput {
	return i.ToResourceOutputWithContext(context.Background())
}

func (i *Resource) ToResourceOutputWithContext(ctx context.Context) ResourceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceOutput)
}

// ResourceArrayInput is an input type that accepts ResourceArray and ResourceArrayOutput values.
// You can construct a concrete instance of `ResourceArrayInput` via:
//
//	ResourceArray{ ResourceArgs{...} }
type ResourceArrayInput interface {
	pulumi.Input

	ToResourceArrayOutput() ResourceArrayOutput
	ToResourceArrayOutputWithContext(context.Context) ResourceArrayOutput
}

type ResourceArray []ResourceInput

func (ResourceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Resource)(nil)).Elem()
}

func (i ResourceArray) ToResourceArrayOutput() ResourceArrayOutput {
	return i.ToResourceArrayOutputWithContext(context.Background())
}

func (i ResourceArray) ToResourceArrayOutputWithContext(ctx context.Context) ResourceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceArrayOutput)
}

// ResourceMapInput is an input type that accepts ResourceMap and ResourceMapOutput values.
// You can construct a concrete instance of `ResourceMapInput` via:
//
//	ResourceMap{ "key": ResourceArgs{...} }
type ResourceMapInput interface {
	pulumi.Input

	ToResourceMapOutput() ResourceMapOutput
	ToResourceMapOutputWithContext(context.Context) ResourceMapOutput
}

type ResourceMap map[string]ResourceInput

func (ResourceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Resource)(nil)).Elem()
}

func (i ResourceMap) ToResourceMapOutput() ResourceMapOutput {
	return i.ToResourceMapOutputWithContext(context.Background())
}

func (i ResourceMap) ToResourceMapOutputWithContext(ctx context.Context) ResourceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceMapOutput)
}

type ResourceOutput struct{ *pulumi.OutputState }

func (ResourceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Resource)(nil)).Elem()
}

func (o ResourceOutput) ToResourceOutput() ResourceOutput {
	return o
}

func (o ResourceOutput) ToResourceOutputWithContext(ctx context.Context) ResourceOutput {
	return o
}

// The meta store's description.
func (o ResourceOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Resource) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ext info of meta store.
func (o ResourceOutput) ExtInfo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Resource) pulumi.StringPtrOutput { return v.ExtInfo }).(pulumi.StringPtrOutput)
}

// The meta store's name, can be used as table name.
func (o ResourceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Resource) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The meta store's schema info, which is json string format, used to define table's fields.
func (o ResourceOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Resource) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// The meta store's type, userdefine e.g.
func (o ResourceOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Resource) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ResourceArrayOutput struct{ *pulumi.OutputState }

func (ResourceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Resource)(nil)).Elem()
}

func (o ResourceArrayOutput) ToResourceArrayOutput() ResourceArrayOutput {
	return o
}

func (o ResourceArrayOutput) ToResourceArrayOutputWithContext(ctx context.Context) ResourceArrayOutput {
	return o
}

func (o ResourceArrayOutput) Index(i pulumi.IntInput) ResourceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Resource {
		return vs[0].([]*Resource)[vs[1].(int)]
	}).(ResourceOutput)
}

type ResourceMapOutput struct{ *pulumi.OutputState }

func (ResourceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Resource)(nil)).Elem()
}

func (o ResourceMapOutput) ToResourceMapOutput() ResourceMapOutput {
	return o
}

func (o ResourceMapOutput) ToResourceMapOutputWithContext(ctx context.Context) ResourceMapOutput {
	return o
}

func (o ResourceMapOutput) MapIndex(k pulumi.StringInput) ResourceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Resource {
		return vs[0].(map[string]*Resource)[vs[1].(string)]
	}).(ResourceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceInput)(nil)).Elem(), &Resource{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceArrayInput)(nil)).Elem(), ResourceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceMapInput)(nil)).Elem(), ResourceMap{})
	pulumi.RegisterOutputType(ResourceOutput{})
	pulumi.RegisterOutputType(ResourceArrayOutput{})
	pulumi.RegisterOutputType(ResourceMapOutput{})
}
