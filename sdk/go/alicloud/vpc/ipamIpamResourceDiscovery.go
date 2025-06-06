// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Vpc Ipam Ipam Resource Discovery resource.
//
// IP Address Management Resource Discovery.
//
// For information about Vpc Ipam Ipam Resource Discovery and how to use it, see [What is Ipam Resource Discovery](https://next.api.alibabacloud.com/document/VpcIpam/2023-02-28/CreateIpamResourceDiscovery).
//
// > **NOTE:** Available since v1.243.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
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
//			_, err := resourcemanager.GetResourceGroups(ctx, &resourcemanager.GetResourceGroupsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewIpamIpamResourceDiscovery(ctx, "default", &vpc.IpamIpamResourceDiscoveryArgs{
//				OperatingRegionLists: pulumi.StringArray{
//					pulumi.String("cn-hangzhou"),
//				},
//				IpamResourceDiscoveryDescription: pulumi.String("This is a custom IPAM resource discovery."),
//				IpamResourceDiscoveryName:        pulumi.String("example_resource_discovery"),
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
// Vpc Ipam Ipam Resource Discovery can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:vpc/ipamIpamResourceDiscovery:IpamIpamResourceDiscovery example <id>
// ```
type IpamIpamResourceDiscovery struct {
	pulumi.CustomResourceState

	// The time when the resource discovery was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The description of resource discovery.
	IpamResourceDiscoveryDescription pulumi.StringPtrOutput `pulumi:"ipamResourceDiscoveryDescription"`
	// The name of the resource
	IpamResourceDiscoveryName pulumi.StringPtrOutput `pulumi:"ipamResourceDiscoveryName"`
	// The list of operating regions for resource discovery.
	OperatingRegionLists pulumi.StringArrayOutput `pulumi:"operatingRegionLists"`
	// The region ID of the resource
	RegionId pulumi.StringOutput `pulumi:"regionId"`
	// The ID of the resource group
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The status of the resource discovery instance. Value:
	Status pulumi.StringOutput `pulumi:"status"`
	// Label list information.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewIpamIpamResourceDiscovery registers a new resource with the given unique name, arguments, and options.
func NewIpamIpamResourceDiscovery(ctx *pulumi.Context,
	name string, args *IpamIpamResourceDiscoveryArgs, opts ...pulumi.ResourceOption) (*IpamIpamResourceDiscovery, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OperatingRegionLists == nil {
		return nil, errors.New("invalid value for required argument 'OperatingRegionLists'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IpamIpamResourceDiscovery
	err := ctx.RegisterResource("alicloud:vpc/ipamIpamResourceDiscovery:IpamIpamResourceDiscovery", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIpamIpamResourceDiscovery gets an existing IpamIpamResourceDiscovery resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIpamIpamResourceDiscovery(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IpamIpamResourceDiscoveryState, opts ...pulumi.ResourceOption) (*IpamIpamResourceDiscovery, error) {
	var resource IpamIpamResourceDiscovery
	err := ctx.ReadResource("alicloud:vpc/ipamIpamResourceDiscovery:IpamIpamResourceDiscovery", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IpamIpamResourceDiscovery resources.
type ipamIpamResourceDiscoveryState struct {
	// The time when the resource discovery was created.
	CreateTime *string `pulumi:"createTime"`
	// The description of resource discovery.
	IpamResourceDiscoveryDescription *string `pulumi:"ipamResourceDiscoveryDescription"`
	// The name of the resource
	IpamResourceDiscoveryName *string `pulumi:"ipamResourceDiscoveryName"`
	// The list of operating regions for resource discovery.
	OperatingRegionLists []string `pulumi:"operatingRegionLists"`
	// The region ID of the resource
	RegionId *string `pulumi:"regionId"`
	// The ID of the resource group
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource discovery instance. Value:
	Status *string `pulumi:"status"`
	// Label list information.
	Tags map[string]string `pulumi:"tags"`
}

type IpamIpamResourceDiscoveryState struct {
	// The time when the resource discovery was created.
	CreateTime pulumi.StringPtrInput
	// The description of resource discovery.
	IpamResourceDiscoveryDescription pulumi.StringPtrInput
	// The name of the resource
	IpamResourceDiscoveryName pulumi.StringPtrInput
	// The list of operating regions for resource discovery.
	OperatingRegionLists pulumi.StringArrayInput
	// The region ID of the resource
	RegionId pulumi.StringPtrInput
	// The ID of the resource group
	ResourceGroupId pulumi.StringPtrInput
	// The status of the resource discovery instance. Value:
	Status pulumi.StringPtrInput
	// Label list information.
	Tags pulumi.StringMapInput
}

func (IpamIpamResourceDiscoveryState) ElementType() reflect.Type {
	return reflect.TypeOf((*ipamIpamResourceDiscoveryState)(nil)).Elem()
}

type ipamIpamResourceDiscoveryArgs struct {
	// The description of resource discovery.
	IpamResourceDiscoveryDescription *string `pulumi:"ipamResourceDiscoveryDescription"`
	// The name of the resource
	IpamResourceDiscoveryName *string `pulumi:"ipamResourceDiscoveryName"`
	// The list of operating regions for resource discovery.
	OperatingRegionLists []string `pulumi:"operatingRegionLists"`
	// The ID of the resource group
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Label list information.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a IpamIpamResourceDiscovery resource.
type IpamIpamResourceDiscoveryArgs struct {
	// The description of resource discovery.
	IpamResourceDiscoveryDescription pulumi.StringPtrInput
	// The name of the resource
	IpamResourceDiscoveryName pulumi.StringPtrInput
	// The list of operating regions for resource discovery.
	OperatingRegionLists pulumi.StringArrayInput
	// The ID of the resource group
	ResourceGroupId pulumi.StringPtrInput
	// Label list information.
	Tags pulumi.StringMapInput
}

func (IpamIpamResourceDiscoveryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ipamIpamResourceDiscoveryArgs)(nil)).Elem()
}

type IpamIpamResourceDiscoveryInput interface {
	pulumi.Input

	ToIpamIpamResourceDiscoveryOutput() IpamIpamResourceDiscoveryOutput
	ToIpamIpamResourceDiscoveryOutputWithContext(ctx context.Context) IpamIpamResourceDiscoveryOutput
}

func (*IpamIpamResourceDiscovery) ElementType() reflect.Type {
	return reflect.TypeOf((**IpamIpamResourceDiscovery)(nil)).Elem()
}

func (i *IpamIpamResourceDiscovery) ToIpamIpamResourceDiscoveryOutput() IpamIpamResourceDiscoveryOutput {
	return i.ToIpamIpamResourceDiscoveryOutputWithContext(context.Background())
}

func (i *IpamIpamResourceDiscovery) ToIpamIpamResourceDiscoveryOutputWithContext(ctx context.Context) IpamIpamResourceDiscoveryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpamIpamResourceDiscoveryOutput)
}

// IpamIpamResourceDiscoveryArrayInput is an input type that accepts IpamIpamResourceDiscoveryArray and IpamIpamResourceDiscoveryArrayOutput values.
// You can construct a concrete instance of `IpamIpamResourceDiscoveryArrayInput` via:
//
//	IpamIpamResourceDiscoveryArray{ IpamIpamResourceDiscoveryArgs{...} }
type IpamIpamResourceDiscoveryArrayInput interface {
	pulumi.Input

	ToIpamIpamResourceDiscoveryArrayOutput() IpamIpamResourceDiscoveryArrayOutput
	ToIpamIpamResourceDiscoveryArrayOutputWithContext(context.Context) IpamIpamResourceDiscoveryArrayOutput
}

type IpamIpamResourceDiscoveryArray []IpamIpamResourceDiscoveryInput

func (IpamIpamResourceDiscoveryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IpamIpamResourceDiscovery)(nil)).Elem()
}

func (i IpamIpamResourceDiscoveryArray) ToIpamIpamResourceDiscoveryArrayOutput() IpamIpamResourceDiscoveryArrayOutput {
	return i.ToIpamIpamResourceDiscoveryArrayOutputWithContext(context.Background())
}

func (i IpamIpamResourceDiscoveryArray) ToIpamIpamResourceDiscoveryArrayOutputWithContext(ctx context.Context) IpamIpamResourceDiscoveryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpamIpamResourceDiscoveryArrayOutput)
}

// IpamIpamResourceDiscoveryMapInput is an input type that accepts IpamIpamResourceDiscoveryMap and IpamIpamResourceDiscoveryMapOutput values.
// You can construct a concrete instance of `IpamIpamResourceDiscoveryMapInput` via:
//
//	IpamIpamResourceDiscoveryMap{ "key": IpamIpamResourceDiscoveryArgs{...} }
type IpamIpamResourceDiscoveryMapInput interface {
	pulumi.Input

	ToIpamIpamResourceDiscoveryMapOutput() IpamIpamResourceDiscoveryMapOutput
	ToIpamIpamResourceDiscoveryMapOutputWithContext(context.Context) IpamIpamResourceDiscoveryMapOutput
}

type IpamIpamResourceDiscoveryMap map[string]IpamIpamResourceDiscoveryInput

func (IpamIpamResourceDiscoveryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IpamIpamResourceDiscovery)(nil)).Elem()
}

func (i IpamIpamResourceDiscoveryMap) ToIpamIpamResourceDiscoveryMapOutput() IpamIpamResourceDiscoveryMapOutput {
	return i.ToIpamIpamResourceDiscoveryMapOutputWithContext(context.Background())
}

func (i IpamIpamResourceDiscoveryMap) ToIpamIpamResourceDiscoveryMapOutputWithContext(ctx context.Context) IpamIpamResourceDiscoveryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpamIpamResourceDiscoveryMapOutput)
}

type IpamIpamResourceDiscoveryOutput struct{ *pulumi.OutputState }

func (IpamIpamResourceDiscoveryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IpamIpamResourceDiscovery)(nil)).Elem()
}

func (o IpamIpamResourceDiscoveryOutput) ToIpamIpamResourceDiscoveryOutput() IpamIpamResourceDiscoveryOutput {
	return o
}

func (o IpamIpamResourceDiscoveryOutput) ToIpamIpamResourceDiscoveryOutputWithContext(ctx context.Context) IpamIpamResourceDiscoveryOutput {
	return o
}

// The time when the resource discovery was created.
func (o IpamIpamResourceDiscoveryOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *IpamIpamResourceDiscovery) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The description of resource discovery.
func (o IpamIpamResourceDiscoveryOutput) IpamResourceDiscoveryDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IpamIpamResourceDiscovery) pulumi.StringPtrOutput { return v.IpamResourceDiscoveryDescription }).(pulumi.StringPtrOutput)
}

// The name of the resource
func (o IpamIpamResourceDiscoveryOutput) IpamResourceDiscoveryName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IpamIpamResourceDiscovery) pulumi.StringPtrOutput { return v.IpamResourceDiscoveryName }).(pulumi.StringPtrOutput)
}

// The list of operating regions for resource discovery.
func (o IpamIpamResourceDiscoveryOutput) OperatingRegionLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IpamIpamResourceDiscovery) pulumi.StringArrayOutput { return v.OperatingRegionLists }).(pulumi.StringArrayOutput)
}

// The region ID of the resource
func (o IpamIpamResourceDiscoveryOutput) RegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *IpamIpamResourceDiscovery) pulumi.StringOutput { return v.RegionId }).(pulumi.StringOutput)
}

// The ID of the resource group
func (o IpamIpamResourceDiscoveryOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *IpamIpamResourceDiscovery) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The status of the resource discovery instance. Value:
func (o IpamIpamResourceDiscoveryOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *IpamIpamResourceDiscovery) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Label list information.
func (o IpamIpamResourceDiscoveryOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *IpamIpamResourceDiscovery) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type IpamIpamResourceDiscoveryArrayOutput struct{ *pulumi.OutputState }

func (IpamIpamResourceDiscoveryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IpamIpamResourceDiscovery)(nil)).Elem()
}

func (o IpamIpamResourceDiscoveryArrayOutput) ToIpamIpamResourceDiscoveryArrayOutput() IpamIpamResourceDiscoveryArrayOutput {
	return o
}

func (o IpamIpamResourceDiscoveryArrayOutput) ToIpamIpamResourceDiscoveryArrayOutputWithContext(ctx context.Context) IpamIpamResourceDiscoveryArrayOutput {
	return o
}

func (o IpamIpamResourceDiscoveryArrayOutput) Index(i pulumi.IntInput) IpamIpamResourceDiscoveryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IpamIpamResourceDiscovery {
		return vs[0].([]*IpamIpamResourceDiscovery)[vs[1].(int)]
	}).(IpamIpamResourceDiscoveryOutput)
}

type IpamIpamResourceDiscoveryMapOutput struct{ *pulumi.OutputState }

func (IpamIpamResourceDiscoveryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IpamIpamResourceDiscovery)(nil)).Elem()
}

func (o IpamIpamResourceDiscoveryMapOutput) ToIpamIpamResourceDiscoveryMapOutput() IpamIpamResourceDiscoveryMapOutput {
	return o
}

func (o IpamIpamResourceDiscoveryMapOutput) ToIpamIpamResourceDiscoveryMapOutputWithContext(ctx context.Context) IpamIpamResourceDiscoveryMapOutput {
	return o
}

func (o IpamIpamResourceDiscoveryMapOutput) MapIndex(k pulumi.StringInput) IpamIpamResourceDiscoveryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IpamIpamResourceDiscovery {
		return vs[0].(map[string]*IpamIpamResourceDiscovery)[vs[1].(string)]
	}).(IpamIpamResourceDiscoveryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IpamIpamResourceDiscoveryInput)(nil)).Elem(), &IpamIpamResourceDiscovery{})
	pulumi.RegisterInputType(reflect.TypeOf((*IpamIpamResourceDiscoveryArrayInput)(nil)).Elem(), IpamIpamResourceDiscoveryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IpamIpamResourceDiscoveryMapInput)(nil)).Elem(), IpamIpamResourceDiscoveryMap{})
	pulumi.RegisterOutputType(IpamIpamResourceDiscoveryOutput{})
	pulumi.RegisterOutputType(IpamIpamResourceDiscoveryArrayOutput{})
	pulumi.RegisterOutputType(IpamIpamResourceDiscoveryMapOutput{})
}
