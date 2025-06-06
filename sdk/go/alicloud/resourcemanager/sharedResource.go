// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Resource Manager Shared Resource resource.
//
// For information about Resource Manager Shared Resource and how to use it, see [What is Shared Resource](https://www.alibabacloud.com/help/en/resource-management/latest/api-resourcesharing-2020-01-10-associateresourceshare).
//
// > **NOTE:** Available since v1.111.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
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
//			name := "tfexample"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			example, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleNetwork, err := vpc.NewNetwork(ctx, "example", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("192.168.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSwitch, err := vpc.NewSwitch(ctx, "example", &vpc.SwitchArgs{
//				ZoneId:      pulumi.String(example.Zones[0].Id),
//				CidrBlock:   pulumi.String("192.168.0.0/16"),
//				VpcId:       exampleNetwork.ID(),
//				VswitchName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			exampleResourceShare, err := resourcemanager.NewResourceShare(ctx, "example", &resourcemanager.ResourceShareArgs{
//				ResourceShareName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = resourcemanager.NewSharedResource(ctx, "example", &resourcemanager.SharedResourceArgs{
//				ResourceId:      exampleSwitch.ID(),
//				ResourceShareId: exampleResourceShare.ID(),
//				ResourceType:    pulumi.String("VSwitch"),
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
// Resource Manager Shared Resource can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:resourcemanager/sharedResource:SharedResource example <resource_share_id>:<resource_id>:<resource_type>
// ```
type SharedResource struct {
	pulumi.CustomResourceState

	// The resource ID need shared.
	ResourceId pulumi.StringOutput `pulumi:"resourceId"`
	// The resource share ID of resource manager.
	ResourceShareId pulumi.StringOutput `pulumi:"resourceShareId"`
	// The resource type of should shared. Valid values:
	// - `VSwitch`.
	// - The following types are added after v1.173.0: `ROSTemplate` and `ServiceCatalogPortfolio`.
	// - The following types are added after v1.192.0: `PrefixList` and `Image`.
	// - The following types are added after v1.194.1: `PublicIpAddressPool`.
	// - The following types are added after v1.208.0: `KMSInstance`.
	// - The following types are added after v1.240.0: `Snapshot`.
	// - For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](https://help.aliyun.com/zh/resource-management/resource-sharing/product-overview/services-that-work-with-resource-sharing?spm=api-workbench.API%20Document.0.0.32fff3cdFveEud)
	ResourceType pulumi.StringOutput `pulumi:"resourceType"`
	// The status of the Shared Resource.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewSharedResource registers a new resource with the given unique name, arguments, and options.
func NewSharedResource(ctx *pulumi.Context,
	name string, args *SharedResourceArgs, opts ...pulumi.ResourceOption) (*SharedResource, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceId == nil {
		return nil, errors.New("invalid value for required argument 'ResourceId'")
	}
	if args.ResourceShareId == nil {
		return nil, errors.New("invalid value for required argument 'ResourceShareId'")
	}
	if args.ResourceType == nil {
		return nil, errors.New("invalid value for required argument 'ResourceType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SharedResource
	err := ctx.RegisterResource("alicloud:resourcemanager/sharedResource:SharedResource", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSharedResource gets an existing SharedResource resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSharedResource(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SharedResourceState, opts ...pulumi.ResourceOption) (*SharedResource, error) {
	var resource SharedResource
	err := ctx.ReadResource("alicloud:resourcemanager/sharedResource:SharedResource", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SharedResource resources.
type sharedResourceState struct {
	// The resource ID need shared.
	ResourceId *string `pulumi:"resourceId"`
	// The resource share ID of resource manager.
	ResourceShareId *string `pulumi:"resourceShareId"`
	// The resource type of should shared. Valid values:
	// - `VSwitch`.
	// - The following types are added after v1.173.0: `ROSTemplate` and `ServiceCatalogPortfolio`.
	// - The following types are added after v1.192.0: `PrefixList` and `Image`.
	// - The following types are added after v1.194.1: `PublicIpAddressPool`.
	// - The following types are added after v1.208.0: `KMSInstance`.
	// - The following types are added after v1.240.0: `Snapshot`.
	// - For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](https://help.aliyun.com/zh/resource-management/resource-sharing/product-overview/services-that-work-with-resource-sharing?spm=api-workbench.API%20Document.0.0.32fff3cdFveEud)
	ResourceType *string `pulumi:"resourceType"`
	// The status of the Shared Resource.
	Status *string `pulumi:"status"`
}

type SharedResourceState struct {
	// The resource ID need shared.
	ResourceId pulumi.StringPtrInput
	// The resource share ID of resource manager.
	ResourceShareId pulumi.StringPtrInput
	// The resource type of should shared. Valid values:
	// - `VSwitch`.
	// - The following types are added after v1.173.0: `ROSTemplate` and `ServiceCatalogPortfolio`.
	// - The following types are added after v1.192.0: `PrefixList` and `Image`.
	// - The following types are added after v1.194.1: `PublicIpAddressPool`.
	// - The following types are added after v1.208.0: `KMSInstance`.
	// - The following types are added after v1.240.0: `Snapshot`.
	// - For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](https://help.aliyun.com/zh/resource-management/resource-sharing/product-overview/services-that-work-with-resource-sharing?spm=api-workbench.API%20Document.0.0.32fff3cdFveEud)
	ResourceType pulumi.StringPtrInput
	// The status of the Shared Resource.
	Status pulumi.StringPtrInput
}

func (SharedResourceState) ElementType() reflect.Type {
	return reflect.TypeOf((*sharedResourceState)(nil)).Elem()
}

type sharedResourceArgs struct {
	// The resource ID need shared.
	ResourceId string `pulumi:"resourceId"`
	// The resource share ID of resource manager.
	ResourceShareId string `pulumi:"resourceShareId"`
	// The resource type of should shared. Valid values:
	// - `VSwitch`.
	// - The following types are added after v1.173.0: `ROSTemplate` and `ServiceCatalogPortfolio`.
	// - The following types are added after v1.192.0: `PrefixList` and `Image`.
	// - The following types are added after v1.194.1: `PublicIpAddressPool`.
	// - The following types are added after v1.208.0: `KMSInstance`.
	// - The following types are added after v1.240.0: `Snapshot`.
	// - For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](https://help.aliyun.com/zh/resource-management/resource-sharing/product-overview/services-that-work-with-resource-sharing?spm=api-workbench.API%20Document.0.0.32fff3cdFveEud)
	ResourceType string `pulumi:"resourceType"`
}

// The set of arguments for constructing a SharedResource resource.
type SharedResourceArgs struct {
	// The resource ID need shared.
	ResourceId pulumi.StringInput
	// The resource share ID of resource manager.
	ResourceShareId pulumi.StringInput
	// The resource type of should shared. Valid values:
	// - `VSwitch`.
	// - The following types are added after v1.173.0: `ROSTemplate` and `ServiceCatalogPortfolio`.
	// - The following types are added after v1.192.0: `PrefixList` and `Image`.
	// - The following types are added after v1.194.1: `PublicIpAddressPool`.
	// - The following types are added after v1.208.0: `KMSInstance`.
	// - The following types are added after v1.240.0: `Snapshot`.
	// - For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](https://help.aliyun.com/zh/resource-management/resource-sharing/product-overview/services-that-work-with-resource-sharing?spm=api-workbench.API%20Document.0.0.32fff3cdFveEud)
	ResourceType pulumi.StringInput
}

func (SharedResourceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sharedResourceArgs)(nil)).Elem()
}

type SharedResourceInput interface {
	pulumi.Input

	ToSharedResourceOutput() SharedResourceOutput
	ToSharedResourceOutputWithContext(ctx context.Context) SharedResourceOutput
}

func (*SharedResource) ElementType() reflect.Type {
	return reflect.TypeOf((**SharedResource)(nil)).Elem()
}

func (i *SharedResource) ToSharedResourceOutput() SharedResourceOutput {
	return i.ToSharedResourceOutputWithContext(context.Background())
}

func (i *SharedResource) ToSharedResourceOutputWithContext(ctx context.Context) SharedResourceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SharedResourceOutput)
}

// SharedResourceArrayInput is an input type that accepts SharedResourceArray and SharedResourceArrayOutput values.
// You can construct a concrete instance of `SharedResourceArrayInput` via:
//
//	SharedResourceArray{ SharedResourceArgs{...} }
type SharedResourceArrayInput interface {
	pulumi.Input

	ToSharedResourceArrayOutput() SharedResourceArrayOutput
	ToSharedResourceArrayOutputWithContext(context.Context) SharedResourceArrayOutput
}

type SharedResourceArray []SharedResourceInput

func (SharedResourceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SharedResource)(nil)).Elem()
}

func (i SharedResourceArray) ToSharedResourceArrayOutput() SharedResourceArrayOutput {
	return i.ToSharedResourceArrayOutputWithContext(context.Background())
}

func (i SharedResourceArray) ToSharedResourceArrayOutputWithContext(ctx context.Context) SharedResourceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SharedResourceArrayOutput)
}

// SharedResourceMapInput is an input type that accepts SharedResourceMap and SharedResourceMapOutput values.
// You can construct a concrete instance of `SharedResourceMapInput` via:
//
//	SharedResourceMap{ "key": SharedResourceArgs{...} }
type SharedResourceMapInput interface {
	pulumi.Input

	ToSharedResourceMapOutput() SharedResourceMapOutput
	ToSharedResourceMapOutputWithContext(context.Context) SharedResourceMapOutput
}

type SharedResourceMap map[string]SharedResourceInput

func (SharedResourceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SharedResource)(nil)).Elem()
}

func (i SharedResourceMap) ToSharedResourceMapOutput() SharedResourceMapOutput {
	return i.ToSharedResourceMapOutputWithContext(context.Background())
}

func (i SharedResourceMap) ToSharedResourceMapOutputWithContext(ctx context.Context) SharedResourceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SharedResourceMapOutput)
}

type SharedResourceOutput struct{ *pulumi.OutputState }

func (SharedResourceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SharedResource)(nil)).Elem()
}

func (o SharedResourceOutput) ToSharedResourceOutput() SharedResourceOutput {
	return o
}

func (o SharedResourceOutput) ToSharedResourceOutputWithContext(ctx context.Context) SharedResourceOutput {
	return o
}

// The resource ID need shared.
func (o SharedResourceOutput) ResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SharedResource) pulumi.StringOutput { return v.ResourceId }).(pulumi.StringOutput)
}

// The resource share ID of resource manager.
func (o SharedResourceOutput) ResourceShareId() pulumi.StringOutput {
	return o.ApplyT(func(v *SharedResource) pulumi.StringOutput { return v.ResourceShareId }).(pulumi.StringOutput)
}

// The resource type of should shared. Valid values:
// - `VSwitch`.
// - The following types are added after v1.173.0: `ROSTemplate` and `ServiceCatalogPortfolio`.
// - The following types are added after v1.192.0: `PrefixList` and `Image`.
// - The following types are added after v1.194.1: `PublicIpAddressPool`.
// - The following types are added after v1.208.0: `KMSInstance`.
// - The following types are added after v1.240.0: `Snapshot`.
// - For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](https://help.aliyun.com/zh/resource-management/resource-sharing/product-overview/services-that-work-with-resource-sharing?spm=api-workbench.API%20Document.0.0.32fff3cdFveEud)
func (o SharedResourceOutput) ResourceType() pulumi.StringOutput {
	return o.ApplyT(func(v *SharedResource) pulumi.StringOutput { return v.ResourceType }).(pulumi.StringOutput)
}

// The status of the Shared Resource.
func (o SharedResourceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *SharedResource) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type SharedResourceArrayOutput struct{ *pulumi.OutputState }

func (SharedResourceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SharedResource)(nil)).Elem()
}

func (o SharedResourceArrayOutput) ToSharedResourceArrayOutput() SharedResourceArrayOutput {
	return o
}

func (o SharedResourceArrayOutput) ToSharedResourceArrayOutputWithContext(ctx context.Context) SharedResourceArrayOutput {
	return o
}

func (o SharedResourceArrayOutput) Index(i pulumi.IntInput) SharedResourceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SharedResource {
		return vs[0].([]*SharedResource)[vs[1].(int)]
	}).(SharedResourceOutput)
}

type SharedResourceMapOutput struct{ *pulumi.OutputState }

func (SharedResourceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SharedResource)(nil)).Elem()
}

func (o SharedResourceMapOutput) ToSharedResourceMapOutput() SharedResourceMapOutput {
	return o
}

func (o SharedResourceMapOutput) ToSharedResourceMapOutputWithContext(ctx context.Context) SharedResourceMapOutput {
	return o
}

func (o SharedResourceMapOutput) MapIndex(k pulumi.StringInput) SharedResourceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SharedResource {
		return vs[0].(map[string]*SharedResource)[vs[1].(string)]
	}).(SharedResourceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SharedResourceInput)(nil)).Elem(), &SharedResource{})
	pulumi.RegisterInputType(reflect.TypeOf((*SharedResourceArrayInput)(nil)).Elem(), SharedResourceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SharedResourceMapInput)(nil)).Elem(), SharedResourceMap{})
	pulumi.RegisterOutputType(SharedResourceOutput{})
	pulumi.RegisterOutputType(SharedResourceArrayOutput{})
	pulumi.RegisterOutputType(SharedResourceMapOutput{})
}
