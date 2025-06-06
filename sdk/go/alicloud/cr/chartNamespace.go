// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cr

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a CR Chart Namespace resource.
//
// For information about CR Chart Namespace and how to use it, see [What is Chart Namespace](https://www.alibabacloud.com/help/en/acr/developer-reference/api-cr-2018-12-01-createchartnamespace).
//
// > **NOTE:** Available since v1.149.0.
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
//	"fmt"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cr"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
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
//			_default, err := random.NewInteger(ctx, "default", &random.IntegerArgs{
//				Min: 10000000,
//				Max: 99999999,
//			})
//			if err != nil {
//				return err
//			}
//			example, err := cr.NewRegistryEnterpriseInstance(ctx, "example", &cr.RegistryEnterpriseInstanceArgs{
//				PaymentType:   pulumi.String("Subscription"),
//				Period:        pulumi.Int(1),
//				RenewPeriod:   pulumi.Int(0),
//				RenewalStatus: pulumi.String("ManualRenewal"),
//				InstanceType:  pulumi.String("Advanced"),
//				InstanceName:  pulumi.Sprintf("%v-%v", name, _default.Result),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cr.NewChartNamespace(ctx, "example", &cr.ChartNamespaceArgs{
//				InstanceId:    example.ID(),
//				NamespaceName: pulumi.Sprintf("%v-%v", name, _default.Result),
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
// CR Chart Namespace can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:cr/chartNamespace:ChartNamespace example <instance_id>:<namespace_name>
// ```
type ChartNamespace struct {
	pulumi.CustomResourceState

	// Specifies whether to automatically create repositories in the namespace. Valid values:
	AutoCreateRepo pulumi.BoolOutput `pulumi:"autoCreateRepo"`
	// DefaultRepoType. Valid values: `PRIVATE`, `PUBLIC`.
	DefaultRepoType pulumi.StringOutput `pulumi:"defaultRepoType"`
	// The ID of the Container Registry instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The name of the namespace that you want to create.
	NamespaceName pulumi.StringOutput `pulumi:"namespaceName"`
}

// NewChartNamespace registers a new resource with the given unique name, arguments, and options.
func NewChartNamespace(ctx *pulumi.Context,
	name string, args *ChartNamespaceArgs, opts ...pulumi.ResourceOption) (*ChartNamespace, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.NamespaceName == nil {
		return nil, errors.New("invalid value for required argument 'NamespaceName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ChartNamespace
	err := ctx.RegisterResource("alicloud:cr/chartNamespace:ChartNamespace", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetChartNamespace gets an existing ChartNamespace resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetChartNamespace(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ChartNamespaceState, opts ...pulumi.ResourceOption) (*ChartNamespace, error) {
	var resource ChartNamespace
	err := ctx.ReadResource("alicloud:cr/chartNamespace:ChartNamespace", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ChartNamespace resources.
type chartNamespaceState struct {
	// Specifies whether to automatically create repositories in the namespace. Valid values:
	AutoCreateRepo *bool `pulumi:"autoCreateRepo"`
	// DefaultRepoType. Valid values: `PRIVATE`, `PUBLIC`.
	DefaultRepoType *string `pulumi:"defaultRepoType"`
	// The ID of the Container Registry instance.
	InstanceId *string `pulumi:"instanceId"`
	// The name of the namespace that you want to create.
	NamespaceName *string `pulumi:"namespaceName"`
}

type ChartNamespaceState struct {
	// Specifies whether to automatically create repositories in the namespace. Valid values:
	AutoCreateRepo pulumi.BoolPtrInput
	// DefaultRepoType. Valid values: `PRIVATE`, `PUBLIC`.
	DefaultRepoType pulumi.StringPtrInput
	// The ID of the Container Registry instance.
	InstanceId pulumi.StringPtrInput
	// The name of the namespace that you want to create.
	NamespaceName pulumi.StringPtrInput
}

func (ChartNamespaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*chartNamespaceState)(nil)).Elem()
}

type chartNamespaceArgs struct {
	// Specifies whether to automatically create repositories in the namespace. Valid values:
	AutoCreateRepo *bool `pulumi:"autoCreateRepo"`
	// DefaultRepoType. Valid values: `PRIVATE`, `PUBLIC`.
	DefaultRepoType *string `pulumi:"defaultRepoType"`
	// The ID of the Container Registry instance.
	InstanceId string `pulumi:"instanceId"`
	// The name of the namespace that you want to create.
	NamespaceName string `pulumi:"namespaceName"`
}

// The set of arguments for constructing a ChartNamespace resource.
type ChartNamespaceArgs struct {
	// Specifies whether to automatically create repositories in the namespace. Valid values:
	AutoCreateRepo pulumi.BoolPtrInput
	// DefaultRepoType. Valid values: `PRIVATE`, `PUBLIC`.
	DefaultRepoType pulumi.StringPtrInput
	// The ID of the Container Registry instance.
	InstanceId pulumi.StringInput
	// The name of the namespace that you want to create.
	NamespaceName pulumi.StringInput
}

func (ChartNamespaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*chartNamespaceArgs)(nil)).Elem()
}

type ChartNamespaceInput interface {
	pulumi.Input

	ToChartNamespaceOutput() ChartNamespaceOutput
	ToChartNamespaceOutputWithContext(ctx context.Context) ChartNamespaceOutput
}

func (*ChartNamespace) ElementType() reflect.Type {
	return reflect.TypeOf((**ChartNamespace)(nil)).Elem()
}

func (i *ChartNamespace) ToChartNamespaceOutput() ChartNamespaceOutput {
	return i.ToChartNamespaceOutputWithContext(context.Background())
}

func (i *ChartNamespace) ToChartNamespaceOutputWithContext(ctx context.Context) ChartNamespaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChartNamespaceOutput)
}

// ChartNamespaceArrayInput is an input type that accepts ChartNamespaceArray and ChartNamespaceArrayOutput values.
// You can construct a concrete instance of `ChartNamespaceArrayInput` via:
//
//	ChartNamespaceArray{ ChartNamespaceArgs{...} }
type ChartNamespaceArrayInput interface {
	pulumi.Input

	ToChartNamespaceArrayOutput() ChartNamespaceArrayOutput
	ToChartNamespaceArrayOutputWithContext(context.Context) ChartNamespaceArrayOutput
}

type ChartNamespaceArray []ChartNamespaceInput

func (ChartNamespaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ChartNamespace)(nil)).Elem()
}

func (i ChartNamespaceArray) ToChartNamespaceArrayOutput() ChartNamespaceArrayOutput {
	return i.ToChartNamespaceArrayOutputWithContext(context.Background())
}

func (i ChartNamespaceArray) ToChartNamespaceArrayOutputWithContext(ctx context.Context) ChartNamespaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChartNamespaceArrayOutput)
}

// ChartNamespaceMapInput is an input type that accepts ChartNamespaceMap and ChartNamespaceMapOutput values.
// You can construct a concrete instance of `ChartNamespaceMapInput` via:
//
//	ChartNamespaceMap{ "key": ChartNamespaceArgs{...} }
type ChartNamespaceMapInput interface {
	pulumi.Input

	ToChartNamespaceMapOutput() ChartNamespaceMapOutput
	ToChartNamespaceMapOutputWithContext(context.Context) ChartNamespaceMapOutput
}

type ChartNamespaceMap map[string]ChartNamespaceInput

func (ChartNamespaceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ChartNamespace)(nil)).Elem()
}

func (i ChartNamespaceMap) ToChartNamespaceMapOutput() ChartNamespaceMapOutput {
	return i.ToChartNamespaceMapOutputWithContext(context.Background())
}

func (i ChartNamespaceMap) ToChartNamespaceMapOutputWithContext(ctx context.Context) ChartNamespaceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChartNamespaceMapOutput)
}

type ChartNamespaceOutput struct{ *pulumi.OutputState }

func (ChartNamespaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ChartNamespace)(nil)).Elem()
}

func (o ChartNamespaceOutput) ToChartNamespaceOutput() ChartNamespaceOutput {
	return o
}

func (o ChartNamespaceOutput) ToChartNamespaceOutputWithContext(ctx context.Context) ChartNamespaceOutput {
	return o
}

// Specifies whether to automatically create repositories in the namespace. Valid values:
func (o ChartNamespaceOutput) AutoCreateRepo() pulumi.BoolOutput {
	return o.ApplyT(func(v *ChartNamespace) pulumi.BoolOutput { return v.AutoCreateRepo }).(pulumi.BoolOutput)
}

// DefaultRepoType. Valid values: `PRIVATE`, `PUBLIC`.
func (o ChartNamespaceOutput) DefaultRepoType() pulumi.StringOutput {
	return o.ApplyT(func(v *ChartNamespace) pulumi.StringOutput { return v.DefaultRepoType }).(pulumi.StringOutput)
}

// The ID of the Container Registry instance.
func (o ChartNamespaceOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ChartNamespace) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The name of the namespace that you want to create.
func (o ChartNamespaceOutput) NamespaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *ChartNamespace) pulumi.StringOutput { return v.NamespaceName }).(pulumi.StringOutput)
}

type ChartNamespaceArrayOutput struct{ *pulumi.OutputState }

func (ChartNamespaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ChartNamespace)(nil)).Elem()
}

func (o ChartNamespaceArrayOutput) ToChartNamespaceArrayOutput() ChartNamespaceArrayOutput {
	return o
}

func (o ChartNamespaceArrayOutput) ToChartNamespaceArrayOutputWithContext(ctx context.Context) ChartNamespaceArrayOutput {
	return o
}

func (o ChartNamespaceArrayOutput) Index(i pulumi.IntInput) ChartNamespaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ChartNamespace {
		return vs[0].([]*ChartNamespace)[vs[1].(int)]
	}).(ChartNamespaceOutput)
}

type ChartNamespaceMapOutput struct{ *pulumi.OutputState }

func (ChartNamespaceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ChartNamespace)(nil)).Elem()
}

func (o ChartNamespaceMapOutput) ToChartNamespaceMapOutput() ChartNamespaceMapOutput {
	return o
}

func (o ChartNamespaceMapOutput) ToChartNamespaceMapOutputWithContext(ctx context.Context) ChartNamespaceMapOutput {
	return o
}

func (o ChartNamespaceMapOutput) MapIndex(k pulumi.StringInput) ChartNamespaceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ChartNamespace {
		return vs[0].(map[string]*ChartNamespace)[vs[1].(string)]
	}).(ChartNamespaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ChartNamespaceInput)(nil)).Elem(), &ChartNamespace{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChartNamespaceArrayInput)(nil)).Elem(), ChartNamespaceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChartNamespaceMapInput)(nil)).Elem(), ChartNamespaceMap{})
	pulumi.RegisterOutputType(ChartNamespaceOutput{})
	pulumi.RegisterOutputType(ChartNamespaceArrayOutput{})
	pulumi.RegisterOutputType(ChartNamespaceMapOutput{})
}
