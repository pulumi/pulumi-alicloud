// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package expressconnect

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Express Connect Router Express Connect Router Vpc Association resource. Bind relationship object between leased line gateway and VPC.
//
// For information about Express Connect Router Express Connect Router Vpc Association and how to use it, see [What is Express Connect Router Vpc Association](https://next.api.alibabacloud.com/api/ExpressConnectRouter/2023-09-01/CreateExpressConnectRouterAssociation).
//
// > **NOTE:** Available since v1.224.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/expressconnect"
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
//			default8qAtD6, err := vpc.NewNetwork(ctx, "default8qAtD6", &vpc.NetworkArgs{
//				CidrBlock: pulumi.String("172.16.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultM9YxGW, err := expressconnect.NewRouterExpressConnectRouter(ctx, "defaultM9YxGW", &expressconnect.RouterExpressConnectRouterArgs{
//				AlibabaSideAsn: pulumi.Int(65533),
//			})
//			if err != nil {
//				return err
//			}
//			current, err := alicloud.GetAccount(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = expressconnect.NewRouterVpcAssociation(ctx, "default", &expressconnect.RouterVpcAssociationArgs{
//				EcrId: defaultM9YxGW.ID(),
//				AllowedPrefixes: pulumi.StringArray{
//					pulumi.String("172.16.4.0/24"),
//					pulumi.String("172.16.3.0/24"),
//					pulumi.String("172.16.2.0/24"),
//					pulumi.String("172.16.1.0/24"),
//				},
//				VpcOwnerId:          pulumi.String(current.Id),
//				AssociationRegionId: pulumi.String("cn-hangzhou"),
//				VpcId:               default8qAtD6.ID(),
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
// Express Connect Router Express Connect Router Vpc Association can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:expressconnect/routerVpcAssociation:RouterVpcAssociation example <ecr_id>:<association_id>:<vpc_id>
// ```
type RouterVpcAssociation struct {
	pulumi.CustomResourceState

	// List of allowed route prefixes.
	AllowedPrefixes pulumi.StringArrayOutput `pulumi:"allowedPrefixes"`
	// The first ID of the resource.
	AssociationId pulumi.StringOutput `pulumi:"associationId"`
	// The region to which the VPC or TR belongs.
	AssociationRegionId pulumi.StringOutput `pulumi:"associationRegionId"`
	// The creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The ID of the leased line gateway instance.
	EcrId pulumi.StringOutput `pulumi:"ecrId"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// The ID of the VPC instance.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
	// The ID of the Alibaba Cloud account to which the VPC belongs.
	VpcOwnerId pulumi.IntOutput `pulumi:"vpcOwnerId"`
}

// NewRouterVpcAssociation registers a new resource with the given unique name, arguments, and options.
func NewRouterVpcAssociation(ctx *pulumi.Context,
	name string, args *RouterVpcAssociationArgs, opts ...pulumi.ResourceOption) (*RouterVpcAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AssociationRegionId == nil {
		return nil, errors.New("invalid value for required argument 'AssociationRegionId'")
	}
	if args.EcrId == nil {
		return nil, errors.New("invalid value for required argument 'EcrId'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RouterVpcAssociation
	err := ctx.RegisterResource("alicloud:expressconnect/routerVpcAssociation:RouterVpcAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouterVpcAssociation gets an existing RouterVpcAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouterVpcAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouterVpcAssociationState, opts ...pulumi.ResourceOption) (*RouterVpcAssociation, error) {
	var resource RouterVpcAssociation
	err := ctx.ReadResource("alicloud:expressconnect/routerVpcAssociation:RouterVpcAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouterVpcAssociation resources.
type routerVpcAssociationState struct {
	// List of allowed route prefixes.
	AllowedPrefixes []string `pulumi:"allowedPrefixes"`
	// The first ID of the resource.
	AssociationId *string `pulumi:"associationId"`
	// The region to which the VPC or TR belongs.
	AssociationRegionId *string `pulumi:"associationRegionId"`
	// The creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// The ID of the leased line gateway instance.
	EcrId *string `pulumi:"ecrId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The ID of the VPC instance.
	VpcId *string `pulumi:"vpcId"`
	// The ID of the Alibaba Cloud account to which the VPC belongs.
	VpcOwnerId *int `pulumi:"vpcOwnerId"`
}

type RouterVpcAssociationState struct {
	// List of allowed route prefixes.
	AllowedPrefixes pulumi.StringArrayInput
	// The first ID of the resource.
	AssociationId pulumi.StringPtrInput
	// The region to which the VPC or TR belongs.
	AssociationRegionId pulumi.StringPtrInput
	// The creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// The ID of the leased line gateway instance.
	EcrId pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The ID of the VPC instance.
	VpcId pulumi.StringPtrInput
	// The ID of the Alibaba Cloud account to which the VPC belongs.
	VpcOwnerId pulumi.IntPtrInput
}

func (RouterVpcAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*routerVpcAssociationState)(nil)).Elem()
}

type routerVpcAssociationArgs struct {
	// List of allowed route prefixes.
	AllowedPrefixes []string `pulumi:"allowedPrefixes"`
	// The region to which the VPC or TR belongs.
	AssociationRegionId string `pulumi:"associationRegionId"`
	// The ID of the leased line gateway instance.
	EcrId string `pulumi:"ecrId"`
	// The ID of the VPC instance.
	VpcId string `pulumi:"vpcId"`
	// The ID of the Alibaba Cloud account to which the VPC belongs.
	VpcOwnerId *int `pulumi:"vpcOwnerId"`
}

// The set of arguments for constructing a RouterVpcAssociation resource.
type RouterVpcAssociationArgs struct {
	// List of allowed route prefixes.
	AllowedPrefixes pulumi.StringArrayInput
	// The region to which the VPC or TR belongs.
	AssociationRegionId pulumi.StringInput
	// The ID of the leased line gateway instance.
	EcrId pulumi.StringInput
	// The ID of the VPC instance.
	VpcId pulumi.StringInput
	// The ID of the Alibaba Cloud account to which the VPC belongs.
	VpcOwnerId pulumi.IntPtrInput
}

func (RouterVpcAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routerVpcAssociationArgs)(nil)).Elem()
}

type RouterVpcAssociationInput interface {
	pulumi.Input

	ToRouterVpcAssociationOutput() RouterVpcAssociationOutput
	ToRouterVpcAssociationOutputWithContext(ctx context.Context) RouterVpcAssociationOutput
}

func (*RouterVpcAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**RouterVpcAssociation)(nil)).Elem()
}

func (i *RouterVpcAssociation) ToRouterVpcAssociationOutput() RouterVpcAssociationOutput {
	return i.ToRouterVpcAssociationOutputWithContext(context.Background())
}

func (i *RouterVpcAssociation) ToRouterVpcAssociationOutputWithContext(ctx context.Context) RouterVpcAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouterVpcAssociationOutput)
}

// RouterVpcAssociationArrayInput is an input type that accepts RouterVpcAssociationArray and RouterVpcAssociationArrayOutput values.
// You can construct a concrete instance of `RouterVpcAssociationArrayInput` via:
//
//	RouterVpcAssociationArray{ RouterVpcAssociationArgs{...} }
type RouterVpcAssociationArrayInput interface {
	pulumi.Input

	ToRouterVpcAssociationArrayOutput() RouterVpcAssociationArrayOutput
	ToRouterVpcAssociationArrayOutputWithContext(context.Context) RouterVpcAssociationArrayOutput
}

type RouterVpcAssociationArray []RouterVpcAssociationInput

func (RouterVpcAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouterVpcAssociation)(nil)).Elem()
}

func (i RouterVpcAssociationArray) ToRouterVpcAssociationArrayOutput() RouterVpcAssociationArrayOutput {
	return i.ToRouterVpcAssociationArrayOutputWithContext(context.Background())
}

func (i RouterVpcAssociationArray) ToRouterVpcAssociationArrayOutputWithContext(ctx context.Context) RouterVpcAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouterVpcAssociationArrayOutput)
}

// RouterVpcAssociationMapInput is an input type that accepts RouterVpcAssociationMap and RouterVpcAssociationMapOutput values.
// You can construct a concrete instance of `RouterVpcAssociationMapInput` via:
//
//	RouterVpcAssociationMap{ "key": RouterVpcAssociationArgs{...} }
type RouterVpcAssociationMapInput interface {
	pulumi.Input

	ToRouterVpcAssociationMapOutput() RouterVpcAssociationMapOutput
	ToRouterVpcAssociationMapOutputWithContext(context.Context) RouterVpcAssociationMapOutput
}

type RouterVpcAssociationMap map[string]RouterVpcAssociationInput

func (RouterVpcAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouterVpcAssociation)(nil)).Elem()
}

func (i RouterVpcAssociationMap) ToRouterVpcAssociationMapOutput() RouterVpcAssociationMapOutput {
	return i.ToRouterVpcAssociationMapOutputWithContext(context.Background())
}

func (i RouterVpcAssociationMap) ToRouterVpcAssociationMapOutputWithContext(ctx context.Context) RouterVpcAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouterVpcAssociationMapOutput)
}

type RouterVpcAssociationOutput struct{ *pulumi.OutputState }

func (RouterVpcAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RouterVpcAssociation)(nil)).Elem()
}

func (o RouterVpcAssociationOutput) ToRouterVpcAssociationOutput() RouterVpcAssociationOutput {
	return o
}

func (o RouterVpcAssociationOutput) ToRouterVpcAssociationOutputWithContext(ctx context.Context) RouterVpcAssociationOutput {
	return o
}

// List of allowed route prefixes.
func (o RouterVpcAssociationOutput) AllowedPrefixes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RouterVpcAssociation) pulumi.StringArrayOutput { return v.AllowedPrefixes }).(pulumi.StringArrayOutput)
}

// The first ID of the resource.
func (o RouterVpcAssociationOutput) AssociationId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterVpcAssociation) pulumi.StringOutput { return v.AssociationId }).(pulumi.StringOutput)
}

// The region to which the VPC or TR belongs.
func (o RouterVpcAssociationOutput) AssociationRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterVpcAssociation) pulumi.StringOutput { return v.AssociationRegionId }).(pulumi.StringOutput)
}

// The creation time of the resource.
func (o RouterVpcAssociationOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterVpcAssociation) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The ID of the leased line gateway instance.
func (o RouterVpcAssociationOutput) EcrId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterVpcAssociation) pulumi.StringOutput { return v.EcrId }).(pulumi.StringOutput)
}

// The status of the resource.
func (o RouterVpcAssociationOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterVpcAssociation) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The ID of the VPC instance.
func (o RouterVpcAssociationOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterVpcAssociation) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

// The ID of the Alibaba Cloud account to which the VPC belongs.
func (o RouterVpcAssociationOutput) VpcOwnerId() pulumi.IntOutput {
	return o.ApplyT(func(v *RouterVpcAssociation) pulumi.IntOutput { return v.VpcOwnerId }).(pulumi.IntOutput)
}

type RouterVpcAssociationArrayOutput struct{ *pulumi.OutputState }

func (RouterVpcAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouterVpcAssociation)(nil)).Elem()
}

func (o RouterVpcAssociationArrayOutput) ToRouterVpcAssociationArrayOutput() RouterVpcAssociationArrayOutput {
	return o
}

func (o RouterVpcAssociationArrayOutput) ToRouterVpcAssociationArrayOutputWithContext(ctx context.Context) RouterVpcAssociationArrayOutput {
	return o
}

func (o RouterVpcAssociationArrayOutput) Index(i pulumi.IntInput) RouterVpcAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RouterVpcAssociation {
		return vs[0].([]*RouterVpcAssociation)[vs[1].(int)]
	}).(RouterVpcAssociationOutput)
}

type RouterVpcAssociationMapOutput struct{ *pulumi.OutputState }

func (RouterVpcAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouterVpcAssociation)(nil)).Elem()
}

func (o RouterVpcAssociationMapOutput) ToRouterVpcAssociationMapOutput() RouterVpcAssociationMapOutput {
	return o
}

func (o RouterVpcAssociationMapOutput) ToRouterVpcAssociationMapOutputWithContext(ctx context.Context) RouterVpcAssociationMapOutput {
	return o
}

func (o RouterVpcAssociationMapOutput) MapIndex(k pulumi.StringInput) RouterVpcAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RouterVpcAssociation {
		return vs[0].(map[string]*RouterVpcAssociation)[vs[1].(string)]
	}).(RouterVpcAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RouterVpcAssociationInput)(nil)).Elem(), &RouterVpcAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouterVpcAssociationArrayInput)(nil)).Elem(), RouterVpcAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouterVpcAssociationMapInput)(nil)).Elem(), RouterVpcAssociationMap{})
	pulumi.RegisterOutputType(RouterVpcAssociationOutput{})
	pulumi.RegisterOutputType(RouterVpcAssociationArrayOutput{})
	pulumi.RegisterOutputType(RouterVpcAssociationMapOutput{})
}