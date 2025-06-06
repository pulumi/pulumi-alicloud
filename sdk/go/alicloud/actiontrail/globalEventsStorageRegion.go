// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package actiontrail

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Global events storage region resource.
//
// For information about global events storage region and how to use it, see [What is Global Events Storage Region](https://next.api.alibabacloud.com/api/Actiontrail/2020-07-06/UpdateGlobalEventsStorageRegion).
//
// > **NOTE:** Available since v1.201.0.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/actiontrail"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := actiontrail.NewGlobalEventsStorageRegion(ctx, "foo", &actiontrail.GlobalEventsStorageRegionArgs{
//				StorageRegion: pulumi.String("cn-hangzhou"),
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
// Global events storage region not can be imported.
type GlobalEventsStorageRegion struct {
	pulumi.CustomResourceState

	// Global Events Storage Region.
	StorageRegion pulumi.StringOutput `pulumi:"storageRegion"`
}

// NewGlobalEventsStorageRegion registers a new resource with the given unique name, arguments, and options.
func NewGlobalEventsStorageRegion(ctx *pulumi.Context,
	name string, args *GlobalEventsStorageRegionArgs, opts ...pulumi.ResourceOption) (*GlobalEventsStorageRegion, error) {
	if args == nil {
		args = &GlobalEventsStorageRegionArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GlobalEventsStorageRegion
	err := ctx.RegisterResource("alicloud:actiontrail/globalEventsStorageRegion:GlobalEventsStorageRegion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalEventsStorageRegion gets an existing GlobalEventsStorageRegion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalEventsStorageRegion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalEventsStorageRegionState, opts ...pulumi.ResourceOption) (*GlobalEventsStorageRegion, error) {
	var resource GlobalEventsStorageRegion
	err := ctx.ReadResource("alicloud:actiontrail/globalEventsStorageRegion:GlobalEventsStorageRegion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalEventsStorageRegion resources.
type globalEventsStorageRegionState struct {
	// Global Events Storage Region.
	StorageRegion *string `pulumi:"storageRegion"`
}

type GlobalEventsStorageRegionState struct {
	// Global Events Storage Region.
	StorageRegion pulumi.StringPtrInput
}

func (GlobalEventsStorageRegionState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalEventsStorageRegionState)(nil)).Elem()
}

type globalEventsStorageRegionArgs struct {
	// Global Events Storage Region.
	StorageRegion *string `pulumi:"storageRegion"`
}

// The set of arguments for constructing a GlobalEventsStorageRegion resource.
type GlobalEventsStorageRegionArgs struct {
	// Global Events Storage Region.
	StorageRegion pulumi.StringPtrInput
}

func (GlobalEventsStorageRegionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalEventsStorageRegionArgs)(nil)).Elem()
}

type GlobalEventsStorageRegionInput interface {
	pulumi.Input

	ToGlobalEventsStorageRegionOutput() GlobalEventsStorageRegionOutput
	ToGlobalEventsStorageRegionOutputWithContext(ctx context.Context) GlobalEventsStorageRegionOutput
}

func (*GlobalEventsStorageRegion) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalEventsStorageRegion)(nil)).Elem()
}

func (i *GlobalEventsStorageRegion) ToGlobalEventsStorageRegionOutput() GlobalEventsStorageRegionOutput {
	return i.ToGlobalEventsStorageRegionOutputWithContext(context.Background())
}

func (i *GlobalEventsStorageRegion) ToGlobalEventsStorageRegionOutputWithContext(ctx context.Context) GlobalEventsStorageRegionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalEventsStorageRegionOutput)
}

// GlobalEventsStorageRegionArrayInput is an input type that accepts GlobalEventsStorageRegionArray and GlobalEventsStorageRegionArrayOutput values.
// You can construct a concrete instance of `GlobalEventsStorageRegionArrayInput` via:
//
//	GlobalEventsStorageRegionArray{ GlobalEventsStorageRegionArgs{...} }
type GlobalEventsStorageRegionArrayInput interface {
	pulumi.Input

	ToGlobalEventsStorageRegionArrayOutput() GlobalEventsStorageRegionArrayOutput
	ToGlobalEventsStorageRegionArrayOutputWithContext(context.Context) GlobalEventsStorageRegionArrayOutput
}

type GlobalEventsStorageRegionArray []GlobalEventsStorageRegionInput

func (GlobalEventsStorageRegionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalEventsStorageRegion)(nil)).Elem()
}

func (i GlobalEventsStorageRegionArray) ToGlobalEventsStorageRegionArrayOutput() GlobalEventsStorageRegionArrayOutput {
	return i.ToGlobalEventsStorageRegionArrayOutputWithContext(context.Background())
}

func (i GlobalEventsStorageRegionArray) ToGlobalEventsStorageRegionArrayOutputWithContext(ctx context.Context) GlobalEventsStorageRegionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalEventsStorageRegionArrayOutput)
}

// GlobalEventsStorageRegionMapInput is an input type that accepts GlobalEventsStorageRegionMap and GlobalEventsStorageRegionMapOutput values.
// You can construct a concrete instance of `GlobalEventsStorageRegionMapInput` via:
//
//	GlobalEventsStorageRegionMap{ "key": GlobalEventsStorageRegionArgs{...} }
type GlobalEventsStorageRegionMapInput interface {
	pulumi.Input

	ToGlobalEventsStorageRegionMapOutput() GlobalEventsStorageRegionMapOutput
	ToGlobalEventsStorageRegionMapOutputWithContext(context.Context) GlobalEventsStorageRegionMapOutput
}

type GlobalEventsStorageRegionMap map[string]GlobalEventsStorageRegionInput

func (GlobalEventsStorageRegionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalEventsStorageRegion)(nil)).Elem()
}

func (i GlobalEventsStorageRegionMap) ToGlobalEventsStorageRegionMapOutput() GlobalEventsStorageRegionMapOutput {
	return i.ToGlobalEventsStorageRegionMapOutputWithContext(context.Background())
}

func (i GlobalEventsStorageRegionMap) ToGlobalEventsStorageRegionMapOutputWithContext(ctx context.Context) GlobalEventsStorageRegionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalEventsStorageRegionMapOutput)
}

type GlobalEventsStorageRegionOutput struct{ *pulumi.OutputState }

func (GlobalEventsStorageRegionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalEventsStorageRegion)(nil)).Elem()
}

func (o GlobalEventsStorageRegionOutput) ToGlobalEventsStorageRegionOutput() GlobalEventsStorageRegionOutput {
	return o
}

func (o GlobalEventsStorageRegionOutput) ToGlobalEventsStorageRegionOutputWithContext(ctx context.Context) GlobalEventsStorageRegionOutput {
	return o
}

// Global Events Storage Region.
func (o GlobalEventsStorageRegionOutput) StorageRegion() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalEventsStorageRegion) pulumi.StringOutput { return v.StorageRegion }).(pulumi.StringOutput)
}

type GlobalEventsStorageRegionArrayOutput struct{ *pulumi.OutputState }

func (GlobalEventsStorageRegionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalEventsStorageRegion)(nil)).Elem()
}

func (o GlobalEventsStorageRegionArrayOutput) ToGlobalEventsStorageRegionArrayOutput() GlobalEventsStorageRegionArrayOutput {
	return o
}

func (o GlobalEventsStorageRegionArrayOutput) ToGlobalEventsStorageRegionArrayOutputWithContext(ctx context.Context) GlobalEventsStorageRegionArrayOutput {
	return o
}

func (o GlobalEventsStorageRegionArrayOutput) Index(i pulumi.IntInput) GlobalEventsStorageRegionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GlobalEventsStorageRegion {
		return vs[0].([]*GlobalEventsStorageRegion)[vs[1].(int)]
	}).(GlobalEventsStorageRegionOutput)
}

type GlobalEventsStorageRegionMapOutput struct{ *pulumi.OutputState }

func (GlobalEventsStorageRegionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalEventsStorageRegion)(nil)).Elem()
}

func (o GlobalEventsStorageRegionMapOutput) ToGlobalEventsStorageRegionMapOutput() GlobalEventsStorageRegionMapOutput {
	return o
}

func (o GlobalEventsStorageRegionMapOutput) ToGlobalEventsStorageRegionMapOutputWithContext(ctx context.Context) GlobalEventsStorageRegionMapOutput {
	return o
}

func (o GlobalEventsStorageRegionMapOutput) MapIndex(k pulumi.StringInput) GlobalEventsStorageRegionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GlobalEventsStorageRegion {
		return vs[0].(map[string]*GlobalEventsStorageRegion)[vs[1].(string)]
	}).(GlobalEventsStorageRegionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalEventsStorageRegionInput)(nil)).Elem(), &GlobalEventsStorageRegion{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalEventsStorageRegionArrayInput)(nil)).Elem(), GlobalEventsStorageRegionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalEventsStorageRegionMapInput)(nil)).Elem(), GlobalEventsStorageRegionMap{})
	pulumi.RegisterOutputType(GlobalEventsStorageRegionOutput{})
	pulumi.RegisterOutputType(GlobalEventsStorageRegionArrayOutput{})
	pulumi.RegisterOutputType(GlobalEventsStorageRegionMapOutput{})
}
