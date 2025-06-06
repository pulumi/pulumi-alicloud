// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package directmail

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Direct Mail Receivers resource.
//
// For information about Direct Mail Receivers and how to use it, see [What is Direct Mail Receivers](https://www.alibabacloud.com/help/en/doc-detail/29414.htm).
//
// > **NOTE:** Available since v1.125.0.
//
// ## Import
//
// Direct Mail Receivers can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:directmail/receivers:Receivers example <id>
// ```
type Receivers struct {
	pulumi.CustomResourceState

	// The description of receivers and 1-50 characters in length.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The alias of receivers. Must email address and less than 30 characters in length.
	ReceiversAlias pulumi.StringOutput `pulumi:"receiversAlias"`
	// The name of the resource. The length that cannot be repeated is 1-30 characters.
	ReceiversName pulumi.StringOutput `pulumi:"receiversName"`
	// The status of the resource. `0` means uploading, `1` means upload completed.
	Status pulumi.IntOutput `pulumi:"status"`
}

// NewReceivers registers a new resource with the given unique name, arguments, and options.
func NewReceivers(ctx *pulumi.Context,
	name string, args *ReceiversArgs, opts ...pulumi.ResourceOption) (*Receivers, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ReceiversAlias == nil {
		return nil, errors.New("invalid value for required argument 'ReceiversAlias'")
	}
	if args.ReceiversName == nil {
		return nil, errors.New("invalid value for required argument 'ReceiversName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Receivers
	err := ctx.RegisterResource("alicloud:directmail/receivers:Receivers", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReceivers gets an existing Receivers resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReceivers(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReceiversState, opts ...pulumi.ResourceOption) (*Receivers, error) {
	var resource Receivers
	err := ctx.ReadResource("alicloud:directmail/receivers:Receivers", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Receivers resources.
type receiversState struct {
	// The description of receivers and 1-50 characters in length.
	Description *string `pulumi:"description"`
	// The alias of receivers. Must email address and less than 30 characters in length.
	ReceiversAlias *string `pulumi:"receiversAlias"`
	// The name of the resource. The length that cannot be repeated is 1-30 characters.
	ReceiversName *string `pulumi:"receiversName"`
	// The status of the resource. `0` means uploading, `1` means upload completed.
	Status *int `pulumi:"status"`
}

type ReceiversState struct {
	// The description of receivers and 1-50 characters in length.
	Description pulumi.StringPtrInput
	// The alias of receivers. Must email address and less than 30 characters in length.
	ReceiversAlias pulumi.StringPtrInput
	// The name of the resource. The length that cannot be repeated is 1-30 characters.
	ReceiversName pulumi.StringPtrInput
	// The status of the resource. `0` means uploading, `1` means upload completed.
	Status pulumi.IntPtrInput
}

func (ReceiversState) ElementType() reflect.Type {
	return reflect.TypeOf((*receiversState)(nil)).Elem()
}

type receiversArgs struct {
	// The description of receivers and 1-50 characters in length.
	Description *string `pulumi:"description"`
	// The alias of receivers. Must email address and less than 30 characters in length.
	ReceiversAlias string `pulumi:"receiversAlias"`
	// The name of the resource. The length that cannot be repeated is 1-30 characters.
	ReceiversName string `pulumi:"receiversName"`
}

// The set of arguments for constructing a Receivers resource.
type ReceiversArgs struct {
	// The description of receivers and 1-50 characters in length.
	Description pulumi.StringPtrInput
	// The alias of receivers. Must email address and less than 30 characters in length.
	ReceiversAlias pulumi.StringInput
	// The name of the resource. The length that cannot be repeated is 1-30 characters.
	ReceiversName pulumi.StringInput
}

func (ReceiversArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*receiversArgs)(nil)).Elem()
}

type ReceiversInput interface {
	pulumi.Input

	ToReceiversOutput() ReceiversOutput
	ToReceiversOutputWithContext(ctx context.Context) ReceiversOutput
}

func (*Receivers) ElementType() reflect.Type {
	return reflect.TypeOf((**Receivers)(nil)).Elem()
}

func (i *Receivers) ToReceiversOutput() ReceiversOutput {
	return i.ToReceiversOutputWithContext(context.Background())
}

func (i *Receivers) ToReceiversOutputWithContext(ctx context.Context) ReceiversOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReceiversOutput)
}

// ReceiversArrayInput is an input type that accepts ReceiversArray and ReceiversArrayOutput values.
// You can construct a concrete instance of `ReceiversArrayInput` via:
//
//	ReceiversArray{ ReceiversArgs{...} }
type ReceiversArrayInput interface {
	pulumi.Input

	ToReceiversArrayOutput() ReceiversArrayOutput
	ToReceiversArrayOutputWithContext(context.Context) ReceiversArrayOutput
}

type ReceiversArray []ReceiversInput

func (ReceiversArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Receivers)(nil)).Elem()
}

func (i ReceiversArray) ToReceiversArrayOutput() ReceiversArrayOutput {
	return i.ToReceiversArrayOutputWithContext(context.Background())
}

func (i ReceiversArray) ToReceiversArrayOutputWithContext(ctx context.Context) ReceiversArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReceiversArrayOutput)
}

// ReceiversMapInput is an input type that accepts ReceiversMap and ReceiversMapOutput values.
// You can construct a concrete instance of `ReceiversMapInput` via:
//
//	ReceiversMap{ "key": ReceiversArgs{...} }
type ReceiversMapInput interface {
	pulumi.Input

	ToReceiversMapOutput() ReceiversMapOutput
	ToReceiversMapOutputWithContext(context.Context) ReceiversMapOutput
}

type ReceiversMap map[string]ReceiversInput

func (ReceiversMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Receivers)(nil)).Elem()
}

func (i ReceiversMap) ToReceiversMapOutput() ReceiversMapOutput {
	return i.ToReceiversMapOutputWithContext(context.Background())
}

func (i ReceiversMap) ToReceiversMapOutputWithContext(ctx context.Context) ReceiversMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReceiversMapOutput)
}

type ReceiversOutput struct{ *pulumi.OutputState }

func (ReceiversOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Receivers)(nil)).Elem()
}

func (o ReceiversOutput) ToReceiversOutput() ReceiversOutput {
	return o
}

func (o ReceiversOutput) ToReceiversOutputWithContext(ctx context.Context) ReceiversOutput {
	return o
}

// The description of receivers and 1-50 characters in length.
func (o ReceiversOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Receivers) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The alias of receivers. Must email address and less than 30 characters in length.
func (o ReceiversOutput) ReceiversAlias() pulumi.StringOutput {
	return o.ApplyT(func(v *Receivers) pulumi.StringOutput { return v.ReceiversAlias }).(pulumi.StringOutput)
}

// The name of the resource. The length that cannot be repeated is 1-30 characters.
func (o ReceiversOutput) ReceiversName() pulumi.StringOutput {
	return o.ApplyT(func(v *Receivers) pulumi.StringOutput { return v.ReceiversName }).(pulumi.StringOutput)
}

// The status of the resource. `0` means uploading, `1` means upload completed.
func (o ReceiversOutput) Status() pulumi.IntOutput {
	return o.ApplyT(func(v *Receivers) pulumi.IntOutput { return v.Status }).(pulumi.IntOutput)
}

type ReceiversArrayOutput struct{ *pulumi.OutputState }

func (ReceiversArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Receivers)(nil)).Elem()
}

func (o ReceiversArrayOutput) ToReceiversArrayOutput() ReceiversArrayOutput {
	return o
}

func (o ReceiversArrayOutput) ToReceiversArrayOutputWithContext(ctx context.Context) ReceiversArrayOutput {
	return o
}

func (o ReceiversArrayOutput) Index(i pulumi.IntInput) ReceiversOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Receivers {
		return vs[0].([]*Receivers)[vs[1].(int)]
	}).(ReceiversOutput)
}

type ReceiversMapOutput struct{ *pulumi.OutputState }

func (ReceiversMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Receivers)(nil)).Elem()
}

func (o ReceiversMapOutput) ToReceiversMapOutput() ReceiversMapOutput {
	return o
}

func (o ReceiversMapOutput) ToReceiversMapOutputWithContext(ctx context.Context) ReceiversMapOutput {
	return o
}

func (o ReceiversMapOutput) MapIndex(k pulumi.StringInput) ReceiversOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Receivers {
		return vs[0].(map[string]*Receivers)[vs[1].(string)]
	}).(ReceiversOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReceiversInput)(nil)).Elem(), &Receivers{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReceiversArrayInput)(nil)).Elem(), ReceiversArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReceiversMapInput)(nil)).Elem(), ReceiversMap{})
	pulumi.RegisterOutputType(ReceiversOutput{})
	pulumi.RegisterOutputType(ReceiversArrayOutput{})
	pulumi.RegisterOutputType(ReceiversMapOutput{})
}
