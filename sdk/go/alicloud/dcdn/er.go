// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dcdn

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DCDN Er resource.
//
// For information about DCDN Er and how to use it, see [What is Er](https://www.alibabacloud.com/help/en/dcdn/developer-reference/api-dcdn-2018-01-15-createroutine).
//
// > **NOTE:** Available since v1.201.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dcdn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_, err := dcdn.NewEr(ctx, "default", &dcdn.ErArgs{
//				ErName:      pulumi.String(name),
//				Description: pulumi.String(name),
//				EnvConf: &dcdn.ErEnvConfArgs{
//					Staging: &dcdn.ErEnvConfStagingArgs{
//						SpecName: pulumi.String("5ms"),
//						AllowedHosts: pulumi.StringArray{
//							pulumi.String("example.com"),
//						},
//					},
//					Production: &dcdn.ErEnvConfProductionArgs{
//						SpecName: pulumi.String("5ms"),
//						AllowedHosts: pulumi.StringArray{
//							pulumi.String("example.com"),
//						},
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
// DCDN Er can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:dcdn/er:Er example <id>
// ```
type Er struct {
	pulumi.CustomResourceState

	// Routine The description of the routine.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The configurations of the specified environment. See `envConf` below.
	EnvConf ErEnvConfOutput `pulumi:"envConf"`
	// The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
	ErName pulumi.StringOutput `pulumi:"erName"`
}

// NewEr registers a new resource with the given unique name, arguments, and options.
func NewEr(ctx *pulumi.Context,
	name string, args *ErArgs, opts ...pulumi.ResourceOption) (*Er, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ErName == nil {
		return nil, errors.New("invalid value for required argument 'ErName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Er
	err := ctx.RegisterResource("alicloud:dcdn/er:Er", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEr gets an existing Er resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEr(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ErState, opts ...pulumi.ResourceOption) (*Er, error) {
	var resource Er
	err := ctx.ReadResource("alicloud:dcdn/er:Er", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Er resources.
type erState struct {
	// Routine The description of the routine.
	Description *string `pulumi:"description"`
	// The configurations of the specified environment. See `envConf` below.
	EnvConf *ErEnvConf `pulumi:"envConf"`
	// The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
	ErName *string `pulumi:"erName"`
}

type ErState struct {
	// Routine The description of the routine.
	Description pulumi.StringPtrInput
	// The configurations of the specified environment. See `envConf` below.
	EnvConf ErEnvConfPtrInput
	// The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
	ErName pulumi.StringPtrInput
}

func (ErState) ElementType() reflect.Type {
	return reflect.TypeOf((*erState)(nil)).Elem()
}

type erArgs struct {
	// Routine The description of the routine.
	Description *string `pulumi:"description"`
	// The configurations of the specified environment. See `envConf` below.
	EnvConf *ErEnvConf `pulumi:"envConf"`
	// The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
	ErName string `pulumi:"erName"`
}

// The set of arguments for constructing a Er resource.
type ErArgs struct {
	// Routine The description of the routine.
	Description pulumi.StringPtrInput
	// The configurations of the specified environment. See `envConf` below.
	EnvConf ErEnvConfPtrInput
	// The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
	ErName pulumi.StringInput
}

func (ErArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*erArgs)(nil)).Elem()
}

type ErInput interface {
	pulumi.Input

	ToErOutput() ErOutput
	ToErOutputWithContext(ctx context.Context) ErOutput
}

func (*Er) ElementType() reflect.Type {
	return reflect.TypeOf((**Er)(nil)).Elem()
}

func (i *Er) ToErOutput() ErOutput {
	return i.ToErOutputWithContext(context.Background())
}

func (i *Er) ToErOutputWithContext(ctx context.Context) ErOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ErOutput)
}

// ErArrayInput is an input type that accepts ErArray and ErArrayOutput values.
// You can construct a concrete instance of `ErArrayInput` via:
//
//	ErArray{ ErArgs{...} }
type ErArrayInput interface {
	pulumi.Input

	ToErArrayOutput() ErArrayOutput
	ToErArrayOutputWithContext(context.Context) ErArrayOutput
}

type ErArray []ErInput

func (ErArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Er)(nil)).Elem()
}

func (i ErArray) ToErArrayOutput() ErArrayOutput {
	return i.ToErArrayOutputWithContext(context.Background())
}

func (i ErArray) ToErArrayOutputWithContext(ctx context.Context) ErArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ErArrayOutput)
}

// ErMapInput is an input type that accepts ErMap and ErMapOutput values.
// You can construct a concrete instance of `ErMapInput` via:
//
//	ErMap{ "key": ErArgs{...} }
type ErMapInput interface {
	pulumi.Input

	ToErMapOutput() ErMapOutput
	ToErMapOutputWithContext(context.Context) ErMapOutput
}

type ErMap map[string]ErInput

func (ErMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Er)(nil)).Elem()
}

func (i ErMap) ToErMapOutput() ErMapOutput {
	return i.ToErMapOutputWithContext(context.Background())
}

func (i ErMap) ToErMapOutputWithContext(ctx context.Context) ErMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ErMapOutput)
}

type ErOutput struct{ *pulumi.OutputState }

func (ErOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Er)(nil)).Elem()
}

func (o ErOutput) ToErOutput() ErOutput {
	return o
}

func (o ErOutput) ToErOutputWithContext(ctx context.Context) ErOutput {
	return o
}

// Routine The description of the routine.
func (o ErOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Er) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The configurations of the specified environment. See `envConf` below.
func (o ErOutput) EnvConf() ErEnvConfOutput {
	return o.ApplyT(func(v *Er) ErEnvConfOutput { return v.EnvConf }).(ErEnvConfOutput)
}

// The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
func (o ErOutput) ErName() pulumi.StringOutput {
	return o.ApplyT(func(v *Er) pulumi.StringOutput { return v.ErName }).(pulumi.StringOutput)
}

type ErArrayOutput struct{ *pulumi.OutputState }

func (ErArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Er)(nil)).Elem()
}

func (o ErArrayOutput) ToErArrayOutput() ErArrayOutput {
	return o
}

func (o ErArrayOutput) ToErArrayOutputWithContext(ctx context.Context) ErArrayOutput {
	return o
}

func (o ErArrayOutput) Index(i pulumi.IntInput) ErOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Er {
		return vs[0].([]*Er)[vs[1].(int)]
	}).(ErOutput)
}

type ErMapOutput struct{ *pulumi.OutputState }

func (ErMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Er)(nil)).Elem()
}

func (o ErMapOutput) ToErMapOutput() ErMapOutput {
	return o
}

func (o ErMapOutput) ToErMapOutputWithContext(ctx context.Context) ErMapOutput {
	return o
}

func (o ErMapOutput) MapIndex(k pulumi.StringInput) ErOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Er {
		return vs[0].(map[string]*Er)[vs[1].(string)]
	}).(ErOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ErInput)(nil)).Elem(), &Er{})
	pulumi.RegisterInputType(reflect.TypeOf((*ErArrayInput)(nil)).Elem(), ErArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ErMapInput)(nil)).Elem(), ErMap{})
	pulumi.RegisterOutputType(ErOutput{})
	pulumi.RegisterOutputType(ErArrayOutput{})
	pulumi.RegisterOutputType(ErMapOutput{})
}
