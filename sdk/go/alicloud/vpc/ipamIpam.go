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

// Provides a Vpc Ipam Ipam resource.
//
// IP Address Management.
//
// For information about Vpc Ipam Ipam and how to use it, see [What is Ipam](https://next.api.alibabacloud.com/document/VpcIpam/2023-02-28/CreateIpam).
//
// > **NOTE:** Available since v1.234.0.
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
//			_, err = vpc.NewIpamIpam(ctx, "default", &vpc.IpamIpamArgs{
//				IpamDescription: pulumi.String("This is my first Ipam."),
//				IpamName:        pulumi.String(name),
//				OperatingRegionLists: pulumi.StringArray{
//					pulumi.String("cn-hangzhou"),
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
// Vpc Ipam Ipam can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:vpc/ipamIpam:IpamIpam example <id>
// ```
type IpamIpam struct {
	pulumi.CustomResourceState

	// The creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The description of IPAM.
	// It must be 2 to 256 characters in length and must start with an uppercase letter or a Chinese character, but cannot start with 'http: // 'or 'https. If the description is not filled in, it is blank. The default value is blank.
	IpamDescription pulumi.StringPtrOutput `pulumi:"ipamDescription"`
	// The name of the resource.
	IpamName pulumi.StringPtrOutput `pulumi:"ipamName"`
	// List of IPAM effective regions.
	OperatingRegionLists pulumi.StringArrayOutput `pulumi:"operatingRegionLists"`
	// After an IPAM is created, the scope of the private network IPAM created by the system by default.
	PrivateDefaultScopeId pulumi.StringOutput `pulumi:"privateDefaultScopeId"`
	// The region ID of the resource.
	RegionId pulumi.StringOutput `pulumi:"regionId"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// The tag of the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewIpamIpam registers a new resource with the given unique name, arguments, and options.
func NewIpamIpam(ctx *pulumi.Context,
	name string, args *IpamIpamArgs, opts ...pulumi.ResourceOption) (*IpamIpam, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OperatingRegionLists == nil {
		return nil, errors.New("invalid value for required argument 'OperatingRegionLists'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IpamIpam
	err := ctx.RegisterResource("alicloud:vpc/ipamIpam:IpamIpam", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIpamIpam gets an existing IpamIpam resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIpamIpam(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IpamIpamState, opts ...pulumi.ResourceOption) (*IpamIpam, error) {
	var resource IpamIpam
	err := ctx.ReadResource("alicloud:vpc/ipamIpam:IpamIpam", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IpamIpam resources.
type ipamIpamState struct {
	// The creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// The description of IPAM.
	// It must be 2 to 256 characters in length and must start with an uppercase letter or a Chinese character, but cannot start with 'http: // 'or 'https. If the description is not filled in, it is blank. The default value is blank.
	IpamDescription *string `pulumi:"ipamDescription"`
	// The name of the resource.
	IpamName *string `pulumi:"ipamName"`
	// List of IPAM effective regions.
	OperatingRegionLists []string `pulumi:"operatingRegionLists"`
	// After an IPAM is created, the scope of the private network IPAM created by the system by default.
	PrivateDefaultScopeId *string `pulumi:"privateDefaultScopeId"`
	// The region ID of the resource.
	RegionId *string `pulumi:"regionId"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The tag of the resource.
	Tags map[string]string `pulumi:"tags"`
}

type IpamIpamState struct {
	// The creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// The description of IPAM.
	// It must be 2 to 256 characters in length and must start with an uppercase letter or a Chinese character, but cannot start with 'http: // 'or 'https. If the description is not filled in, it is blank. The default value is blank.
	IpamDescription pulumi.StringPtrInput
	// The name of the resource.
	IpamName pulumi.StringPtrInput
	// List of IPAM effective regions.
	OperatingRegionLists pulumi.StringArrayInput
	// After an IPAM is created, the scope of the private network IPAM created by the system by default.
	PrivateDefaultScopeId pulumi.StringPtrInput
	// The region ID of the resource.
	RegionId pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The tag of the resource.
	Tags pulumi.StringMapInput
}

func (IpamIpamState) ElementType() reflect.Type {
	return reflect.TypeOf((*ipamIpamState)(nil)).Elem()
}

type ipamIpamArgs struct {
	// The description of IPAM.
	// It must be 2 to 256 characters in length and must start with an uppercase letter or a Chinese character, but cannot start with 'http: // 'or 'https. If the description is not filled in, it is blank. The default value is blank.
	IpamDescription *string `pulumi:"ipamDescription"`
	// The name of the resource.
	IpamName *string `pulumi:"ipamName"`
	// List of IPAM effective regions.
	OperatingRegionLists []string `pulumi:"operatingRegionLists"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The tag of the resource.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a IpamIpam resource.
type IpamIpamArgs struct {
	// The description of IPAM.
	// It must be 2 to 256 characters in length and must start with an uppercase letter or a Chinese character, but cannot start with 'http: // 'or 'https. If the description is not filled in, it is blank. The default value is blank.
	IpamDescription pulumi.StringPtrInput
	// The name of the resource.
	IpamName pulumi.StringPtrInput
	// List of IPAM effective regions.
	OperatingRegionLists pulumi.StringArrayInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The tag of the resource.
	Tags pulumi.StringMapInput
}

func (IpamIpamArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ipamIpamArgs)(nil)).Elem()
}

type IpamIpamInput interface {
	pulumi.Input

	ToIpamIpamOutput() IpamIpamOutput
	ToIpamIpamOutputWithContext(ctx context.Context) IpamIpamOutput
}

func (*IpamIpam) ElementType() reflect.Type {
	return reflect.TypeOf((**IpamIpam)(nil)).Elem()
}

func (i *IpamIpam) ToIpamIpamOutput() IpamIpamOutput {
	return i.ToIpamIpamOutputWithContext(context.Background())
}

func (i *IpamIpam) ToIpamIpamOutputWithContext(ctx context.Context) IpamIpamOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpamIpamOutput)
}

// IpamIpamArrayInput is an input type that accepts IpamIpamArray and IpamIpamArrayOutput values.
// You can construct a concrete instance of `IpamIpamArrayInput` via:
//
//	IpamIpamArray{ IpamIpamArgs{...} }
type IpamIpamArrayInput interface {
	pulumi.Input

	ToIpamIpamArrayOutput() IpamIpamArrayOutput
	ToIpamIpamArrayOutputWithContext(context.Context) IpamIpamArrayOutput
}

type IpamIpamArray []IpamIpamInput

func (IpamIpamArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IpamIpam)(nil)).Elem()
}

func (i IpamIpamArray) ToIpamIpamArrayOutput() IpamIpamArrayOutput {
	return i.ToIpamIpamArrayOutputWithContext(context.Background())
}

func (i IpamIpamArray) ToIpamIpamArrayOutputWithContext(ctx context.Context) IpamIpamArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpamIpamArrayOutput)
}

// IpamIpamMapInput is an input type that accepts IpamIpamMap and IpamIpamMapOutput values.
// You can construct a concrete instance of `IpamIpamMapInput` via:
//
//	IpamIpamMap{ "key": IpamIpamArgs{...} }
type IpamIpamMapInput interface {
	pulumi.Input

	ToIpamIpamMapOutput() IpamIpamMapOutput
	ToIpamIpamMapOutputWithContext(context.Context) IpamIpamMapOutput
}

type IpamIpamMap map[string]IpamIpamInput

func (IpamIpamMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IpamIpam)(nil)).Elem()
}

func (i IpamIpamMap) ToIpamIpamMapOutput() IpamIpamMapOutput {
	return i.ToIpamIpamMapOutputWithContext(context.Background())
}

func (i IpamIpamMap) ToIpamIpamMapOutputWithContext(ctx context.Context) IpamIpamMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpamIpamMapOutput)
}

type IpamIpamOutput struct{ *pulumi.OutputState }

func (IpamIpamOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IpamIpam)(nil)).Elem()
}

func (o IpamIpamOutput) ToIpamIpamOutput() IpamIpamOutput {
	return o
}

func (o IpamIpamOutput) ToIpamIpamOutputWithContext(ctx context.Context) IpamIpamOutput {
	return o
}

// The creation time of the resource.
func (o IpamIpamOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *IpamIpam) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The description of IPAM.
// It must be 2 to 256 characters in length and must start with an uppercase letter or a Chinese character, but cannot start with 'http: // 'or 'https. If the description is not filled in, it is blank. The default value is blank.
func (o IpamIpamOutput) IpamDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IpamIpam) pulumi.StringPtrOutput { return v.IpamDescription }).(pulumi.StringPtrOutput)
}

// The name of the resource.
func (o IpamIpamOutput) IpamName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IpamIpam) pulumi.StringPtrOutput { return v.IpamName }).(pulumi.StringPtrOutput)
}

// List of IPAM effective regions.
func (o IpamIpamOutput) OperatingRegionLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IpamIpam) pulumi.StringArrayOutput { return v.OperatingRegionLists }).(pulumi.StringArrayOutput)
}

// After an IPAM is created, the scope of the private network IPAM created by the system by default.
func (o IpamIpamOutput) PrivateDefaultScopeId() pulumi.StringOutput {
	return o.ApplyT(func(v *IpamIpam) pulumi.StringOutput { return v.PrivateDefaultScopeId }).(pulumi.StringOutput)
}

// The region ID of the resource.
func (o IpamIpamOutput) RegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *IpamIpam) pulumi.StringOutput { return v.RegionId }).(pulumi.StringOutput)
}

// The ID of the resource group.
func (o IpamIpamOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *IpamIpam) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The status of the resource.
func (o IpamIpamOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *IpamIpam) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tag of the resource.
func (o IpamIpamOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *IpamIpam) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type IpamIpamArrayOutput struct{ *pulumi.OutputState }

func (IpamIpamArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IpamIpam)(nil)).Elem()
}

func (o IpamIpamArrayOutput) ToIpamIpamArrayOutput() IpamIpamArrayOutput {
	return o
}

func (o IpamIpamArrayOutput) ToIpamIpamArrayOutputWithContext(ctx context.Context) IpamIpamArrayOutput {
	return o
}

func (o IpamIpamArrayOutput) Index(i pulumi.IntInput) IpamIpamOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IpamIpam {
		return vs[0].([]*IpamIpam)[vs[1].(int)]
	}).(IpamIpamOutput)
}

type IpamIpamMapOutput struct{ *pulumi.OutputState }

func (IpamIpamMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IpamIpam)(nil)).Elem()
}

func (o IpamIpamMapOutput) ToIpamIpamMapOutput() IpamIpamMapOutput {
	return o
}

func (o IpamIpamMapOutput) ToIpamIpamMapOutputWithContext(ctx context.Context) IpamIpamMapOutput {
	return o
}

func (o IpamIpamMapOutput) MapIndex(k pulumi.StringInput) IpamIpamOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IpamIpam {
		return vs[0].(map[string]*IpamIpam)[vs[1].(string)]
	}).(IpamIpamOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IpamIpamInput)(nil)).Elem(), &IpamIpam{})
	pulumi.RegisterInputType(reflect.TypeOf((*IpamIpamArrayInput)(nil)).Elem(), IpamIpamArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IpamIpamMapInput)(nil)).Elem(), IpamIpamMap{})
	pulumi.RegisterOutputType(IpamIpamOutput{})
	pulumi.RegisterOutputType(IpamIpamArrayOutput{})
	pulumi.RegisterOutputType(IpamIpamMapOutput{})
}
