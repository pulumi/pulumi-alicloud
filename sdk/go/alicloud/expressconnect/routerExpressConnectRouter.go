// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package expressconnect

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Express Connect Router Express Connect Router can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:expressconnect/routerExpressConnectRouter:RouterExpressConnectRouter example <id>
// ```
type RouterExpressConnectRouter struct {
	pulumi.CustomResourceState

	// ASN representing resources.
	AlibabaSideAsn pulumi.IntOutput `pulumi:"alibabaSideAsn"`
	// Represents the creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Represents the description of the leased line gateway.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of the Gateway representing the leased line.
	EcrName pulumi.StringPtrOutput `pulumi:"ecrName"`
	// List of regions representing leased line gateways. See `regions` below.
	Regions RouterExpressConnectRouterRegionArrayOutput `pulumi:"regions"`
	// The ID of the resource group to which the ECR instance belongs.
	// - A string consisting of letters, numbers, hyphens (-), and underscores (_), and the string length can be 0 to 64 characters.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// The tag of the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewRouterExpressConnectRouter registers a new resource with the given unique name, arguments, and options.
func NewRouterExpressConnectRouter(ctx *pulumi.Context,
	name string, args *RouterExpressConnectRouterArgs, opts ...pulumi.ResourceOption) (*RouterExpressConnectRouter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AlibabaSideAsn == nil {
		return nil, errors.New("invalid value for required argument 'AlibabaSideAsn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RouterExpressConnectRouter
	err := ctx.RegisterResource("alicloud:expressconnect/routerExpressConnectRouter:RouterExpressConnectRouter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouterExpressConnectRouter gets an existing RouterExpressConnectRouter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouterExpressConnectRouter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouterExpressConnectRouterState, opts ...pulumi.ResourceOption) (*RouterExpressConnectRouter, error) {
	var resource RouterExpressConnectRouter
	err := ctx.ReadResource("alicloud:expressconnect/routerExpressConnectRouter:RouterExpressConnectRouter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouterExpressConnectRouter resources.
type routerExpressConnectRouterState struct {
	// ASN representing resources.
	AlibabaSideAsn *int `pulumi:"alibabaSideAsn"`
	// Represents the creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// Represents the description of the leased line gateway.
	Description *string `pulumi:"description"`
	// Name of the Gateway representing the leased line.
	EcrName *string `pulumi:"ecrName"`
	// List of regions representing leased line gateways. See `regions` below.
	Regions []RouterExpressConnectRouterRegion `pulumi:"regions"`
	// The ID of the resource group to which the ECR instance belongs.
	// - A string consisting of letters, numbers, hyphens (-), and underscores (_), and the string length can be 0 to 64 characters.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The tag of the resource.
	Tags map[string]string `pulumi:"tags"`
}

type RouterExpressConnectRouterState struct {
	// ASN representing resources.
	AlibabaSideAsn pulumi.IntPtrInput
	// Represents the creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// Represents the description of the leased line gateway.
	Description pulumi.StringPtrInput
	// Name of the Gateway representing the leased line.
	EcrName pulumi.StringPtrInput
	// List of regions representing leased line gateways. See `regions` below.
	Regions RouterExpressConnectRouterRegionArrayInput
	// The ID of the resource group to which the ECR instance belongs.
	// - A string consisting of letters, numbers, hyphens (-), and underscores (_), and the string length can be 0 to 64 characters.
	ResourceGroupId pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The tag of the resource.
	Tags pulumi.StringMapInput
}

func (RouterExpressConnectRouterState) ElementType() reflect.Type {
	return reflect.TypeOf((*routerExpressConnectRouterState)(nil)).Elem()
}

type routerExpressConnectRouterArgs struct {
	// ASN representing resources.
	AlibabaSideAsn int `pulumi:"alibabaSideAsn"`
	// Represents the description of the leased line gateway.
	Description *string `pulumi:"description"`
	// Name of the Gateway representing the leased line.
	EcrName *string `pulumi:"ecrName"`
	// List of regions representing leased line gateways. See `regions` below.
	Regions []RouterExpressConnectRouterRegion `pulumi:"regions"`
	// The ID of the resource group to which the ECR instance belongs.
	// - A string consisting of letters, numbers, hyphens (-), and underscores (_), and the string length can be 0 to 64 characters.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The tag of the resource.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a RouterExpressConnectRouter resource.
type RouterExpressConnectRouterArgs struct {
	// ASN representing resources.
	AlibabaSideAsn pulumi.IntInput
	// Represents the description of the leased line gateway.
	Description pulumi.StringPtrInput
	// Name of the Gateway representing the leased line.
	EcrName pulumi.StringPtrInput
	// List of regions representing leased line gateways. See `regions` below.
	Regions RouterExpressConnectRouterRegionArrayInput
	// The ID of the resource group to which the ECR instance belongs.
	// - A string consisting of letters, numbers, hyphens (-), and underscores (_), and the string length can be 0 to 64 characters.
	ResourceGroupId pulumi.StringPtrInput
	// The tag of the resource.
	Tags pulumi.StringMapInput
}

func (RouterExpressConnectRouterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routerExpressConnectRouterArgs)(nil)).Elem()
}

type RouterExpressConnectRouterInput interface {
	pulumi.Input

	ToRouterExpressConnectRouterOutput() RouterExpressConnectRouterOutput
	ToRouterExpressConnectRouterOutputWithContext(ctx context.Context) RouterExpressConnectRouterOutput
}

func (*RouterExpressConnectRouter) ElementType() reflect.Type {
	return reflect.TypeOf((**RouterExpressConnectRouter)(nil)).Elem()
}

func (i *RouterExpressConnectRouter) ToRouterExpressConnectRouterOutput() RouterExpressConnectRouterOutput {
	return i.ToRouterExpressConnectRouterOutputWithContext(context.Background())
}

func (i *RouterExpressConnectRouter) ToRouterExpressConnectRouterOutputWithContext(ctx context.Context) RouterExpressConnectRouterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouterExpressConnectRouterOutput)
}

// RouterExpressConnectRouterArrayInput is an input type that accepts RouterExpressConnectRouterArray and RouterExpressConnectRouterArrayOutput values.
// You can construct a concrete instance of `RouterExpressConnectRouterArrayInput` via:
//
//	RouterExpressConnectRouterArray{ RouterExpressConnectRouterArgs{...} }
type RouterExpressConnectRouterArrayInput interface {
	pulumi.Input

	ToRouterExpressConnectRouterArrayOutput() RouterExpressConnectRouterArrayOutput
	ToRouterExpressConnectRouterArrayOutputWithContext(context.Context) RouterExpressConnectRouterArrayOutput
}

type RouterExpressConnectRouterArray []RouterExpressConnectRouterInput

func (RouterExpressConnectRouterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouterExpressConnectRouter)(nil)).Elem()
}

func (i RouterExpressConnectRouterArray) ToRouterExpressConnectRouterArrayOutput() RouterExpressConnectRouterArrayOutput {
	return i.ToRouterExpressConnectRouterArrayOutputWithContext(context.Background())
}

func (i RouterExpressConnectRouterArray) ToRouterExpressConnectRouterArrayOutputWithContext(ctx context.Context) RouterExpressConnectRouterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouterExpressConnectRouterArrayOutput)
}

// RouterExpressConnectRouterMapInput is an input type that accepts RouterExpressConnectRouterMap and RouterExpressConnectRouterMapOutput values.
// You can construct a concrete instance of `RouterExpressConnectRouterMapInput` via:
//
//	RouterExpressConnectRouterMap{ "key": RouterExpressConnectRouterArgs{...} }
type RouterExpressConnectRouterMapInput interface {
	pulumi.Input

	ToRouterExpressConnectRouterMapOutput() RouterExpressConnectRouterMapOutput
	ToRouterExpressConnectRouterMapOutputWithContext(context.Context) RouterExpressConnectRouterMapOutput
}

type RouterExpressConnectRouterMap map[string]RouterExpressConnectRouterInput

func (RouterExpressConnectRouterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouterExpressConnectRouter)(nil)).Elem()
}

func (i RouterExpressConnectRouterMap) ToRouterExpressConnectRouterMapOutput() RouterExpressConnectRouterMapOutput {
	return i.ToRouterExpressConnectRouterMapOutputWithContext(context.Background())
}

func (i RouterExpressConnectRouterMap) ToRouterExpressConnectRouterMapOutputWithContext(ctx context.Context) RouterExpressConnectRouterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouterExpressConnectRouterMapOutput)
}

type RouterExpressConnectRouterOutput struct{ *pulumi.OutputState }

func (RouterExpressConnectRouterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RouterExpressConnectRouter)(nil)).Elem()
}

func (o RouterExpressConnectRouterOutput) ToRouterExpressConnectRouterOutput() RouterExpressConnectRouterOutput {
	return o
}

func (o RouterExpressConnectRouterOutput) ToRouterExpressConnectRouterOutputWithContext(ctx context.Context) RouterExpressConnectRouterOutput {
	return o
}

// ASN representing resources.
func (o RouterExpressConnectRouterOutput) AlibabaSideAsn() pulumi.IntOutput {
	return o.ApplyT(func(v *RouterExpressConnectRouter) pulumi.IntOutput { return v.AlibabaSideAsn }).(pulumi.IntOutput)
}

// Represents the creation time of the resource.
func (o RouterExpressConnectRouterOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterExpressConnectRouter) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Represents the description of the leased line gateway.
func (o RouterExpressConnectRouterOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RouterExpressConnectRouter) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Name of the Gateway representing the leased line.
func (o RouterExpressConnectRouterOutput) EcrName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RouterExpressConnectRouter) pulumi.StringPtrOutput { return v.EcrName }).(pulumi.StringPtrOutput)
}

// List of regions representing leased line gateways. See `regions` below.
func (o RouterExpressConnectRouterOutput) Regions() RouterExpressConnectRouterRegionArrayOutput {
	return o.ApplyT(func(v *RouterExpressConnectRouter) RouterExpressConnectRouterRegionArrayOutput { return v.Regions }).(RouterExpressConnectRouterRegionArrayOutput)
}

// The ID of the resource group to which the ECR instance belongs.
// - A string consisting of letters, numbers, hyphens (-), and underscores (_), and the string length can be 0 to 64 characters.
func (o RouterExpressConnectRouterOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterExpressConnectRouter) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The status of the resource.
func (o RouterExpressConnectRouterOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterExpressConnectRouter) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tag of the resource.
func (o RouterExpressConnectRouterOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *RouterExpressConnectRouter) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type RouterExpressConnectRouterArrayOutput struct{ *pulumi.OutputState }

func (RouterExpressConnectRouterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouterExpressConnectRouter)(nil)).Elem()
}

func (o RouterExpressConnectRouterArrayOutput) ToRouterExpressConnectRouterArrayOutput() RouterExpressConnectRouterArrayOutput {
	return o
}

func (o RouterExpressConnectRouterArrayOutput) ToRouterExpressConnectRouterArrayOutputWithContext(ctx context.Context) RouterExpressConnectRouterArrayOutput {
	return o
}

func (o RouterExpressConnectRouterArrayOutput) Index(i pulumi.IntInput) RouterExpressConnectRouterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RouterExpressConnectRouter {
		return vs[0].([]*RouterExpressConnectRouter)[vs[1].(int)]
	}).(RouterExpressConnectRouterOutput)
}

type RouterExpressConnectRouterMapOutput struct{ *pulumi.OutputState }

func (RouterExpressConnectRouterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouterExpressConnectRouter)(nil)).Elem()
}

func (o RouterExpressConnectRouterMapOutput) ToRouterExpressConnectRouterMapOutput() RouterExpressConnectRouterMapOutput {
	return o
}

func (o RouterExpressConnectRouterMapOutput) ToRouterExpressConnectRouterMapOutputWithContext(ctx context.Context) RouterExpressConnectRouterMapOutput {
	return o
}

func (o RouterExpressConnectRouterMapOutput) MapIndex(k pulumi.StringInput) RouterExpressConnectRouterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RouterExpressConnectRouter {
		return vs[0].(map[string]*RouterExpressConnectRouter)[vs[1].(string)]
	}).(RouterExpressConnectRouterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RouterExpressConnectRouterInput)(nil)).Elem(), &RouterExpressConnectRouter{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouterExpressConnectRouterArrayInput)(nil)).Elem(), RouterExpressConnectRouterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouterExpressConnectRouterMapInput)(nil)).Elem(), RouterExpressConnectRouterMap{})
	pulumi.RegisterOutputType(RouterExpressConnectRouterOutput{})
	pulumi.RegisterOutputType(RouterExpressConnectRouterArrayOutput{})
	pulumi.RegisterOutputType(RouterExpressConnectRouterMapOutput{})
}
