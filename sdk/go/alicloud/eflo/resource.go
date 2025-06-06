// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eflo

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Eflo Resource can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:eflo/resource:Resource example <id>
// ```
type Resource struct {
	pulumi.CustomResourceState

	// Used to provide a description or comment on the compute cluster.
	ClusterDesc pulumi.StringPtrOutput `pulumi:"clusterDesc"`
	// Used to uniquely identify a computing cluster.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// Represents the name of the compute cluster, usually including the model number.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// Generally refers to the type or instance type of a computing resource. See `machineTypes` below.
	MachineTypes ResourceMachineTypesOutput `pulumi:"machineTypes"`
	// The ID of the Resource.
	ResourceId pulumi.StringOutput `pulumi:"resourceId"`
	// Used to define the access parameters for the user. See `userAccessParam` below.
	UserAccessParam ResourceUserAccessParamOutput `pulumi:"userAccessParam"`
}

// NewResource registers a new resource with the given unique name, arguments, and options.
func NewResource(ctx *pulumi.Context,
	name string, args *ResourceArgs, opts ...pulumi.ResourceOption) (*Resource, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.MachineTypes == nil {
		return nil, errors.New("invalid value for required argument 'MachineTypes'")
	}
	if args.UserAccessParam == nil {
		return nil, errors.New("invalid value for required argument 'UserAccessParam'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Resource
	err := ctx.RegisterResource("alicloud:eflo/resource:Resource", name, args, &resource, opts...)
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
	err := ctx.ReadResource("alicloud:eflo/resource:Resource", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Resource resources.
type resourceState struct {
	// Used to provide a description or comment on the compute cluster.
	ClusterDesc *string `pulumi:"clusterDesc"`
	// Used to uniquely identify a computing cluster.
	ClusterId *string `pulumi:"clusterId"`
	// Represents the name of the compute cluster, usually including the model number.
	ClusterName *string `pulumi:"clusterName"`
	// Generally refers to the type or instance type of a computing resource. See `machineTypes` below.
	MachineTypes *ResourceMachineTypes `pulumi:"machineTypes"`
	// The ID of the Resource.
	ResourceId *string `pulumi:"resourceId"`
	// Used to define the access parameters for the user. See `userAccessParam` below.
	UserAccessParam *ResourceUserAccessParam `pulumi:"userAccessParam"`
}

type ResourceState struct {
	// Used to provide a description or comment on the compute cluster.
	ClusterDesc pulumi.StringPtrInput
	// Used to uniquely identify a computing cluster.
	ClusterId pulumi.StringPtrInput
	// Represents the name of the compute cluster, usually including the model number.
	ClusterName pulumi.StringPtrInput
	// Generally refers to the type or instance type of a computing resource. See `machineTypes` below.
	MachineTypes ResourceMachineTypesPtrInput
	// The ID of the Resource.
	ResourceId pulumi.StringPtrInput
	// Used to define the access parameters for the user. See `userAccessParam` below.
	UserAccessParam ResourceUserAccessParamPtrInput
}

func (ResourceState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceState)(nil)).Elem()
}

type resourceArgs struct {
	// Used to provide a description or comment on the compute cluster.
	ClusterDesc *string `pulumi:"clusterDesc"`
	// Used to uniquely identify a computing cluster.
	ClusterId string `pulumi:"clusterId"`
	// Represents the name of the compute cluster, usually including the model number.
	ClusterName string `pulumi:"clusterName"`
	// Generally refers to the type or instance type of a computing resource. See `machineTypes` below.
	MachineTypes ResourceMachineTypes `pulumi:"machineTypes"`
	// Used to define the access parameters for the user. See `userAccessParam` below.
	UserAccessParam ResourceUserAccessParam `pulumi:"userAccessParam"`
}

// The set of arguments for constructing a Resource resource.
type ResourceArgs struct {
	// Used to provide a description or comment on the compute cluster.
	ClusterDesc pulumi.StringPtrInput
	// Used to uniquely identify a computing cluster.
	ClusterId pulumi.StringInput
	// Represents the name of the compute cluster, usually including the model number.
	ClusterName pulumi.StringInput
	// Generally refers to the type or instance type of a computing resource. See `machineTypes` below.
	MachineTypes ResourceMachineTypesInput
	// Used to define the access parameters for the user. See `userAccessParam` below.
	UserAccessParam ResourceUserAccessParamInput
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

// Used to provide a description or comment on the compute cluster.
func (o ResourceOutput) ClusterDesc() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Resource) pulumi.StringPtrOutput { return v.ClusterDesc }).(pulumi.StringPtrOutput)
}

// Used to uniquely identify a computing cluster.
func (o ResourceOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *Resource) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// Represents the name of the compute cluster, usually including the model number.
func (o ResourceOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *Resource) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

// Generally refers to the type or instance type of a computing resource. See `machineTypes` below.
func (o ResourceOutput) MachineTypes() ResourceMachineTypesOutput {
	return o.ApplyT(func(v *Resource) ResourceMachineTypesOutput { return v.MachineTypes }).(ResourceMachineTypesOutput)
}

// The ID of the Resource.
func (o ResourceOutput) ResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Resource) pulumi.StringOutput { return v.ResourceId }).(pulumi.StringOutput)
}

// Used to define the access parameters for the user. See `userAccessParam` below.
func (o ResourceOutput) UserAccessParam() ResourceUserAccessParamOutput {
	return o.ApplyT(func(v *Resource) ResourceUserAccessParamOutput { return v.UserAccessParam }).(ResourceUserAccessParamOutput)
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
