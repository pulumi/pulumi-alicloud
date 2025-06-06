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

// Provides a Vpc Ipv6 Gateway resource. Gateway Based on Internet Protocol Version 6.
//
// For information about Vpc Ipv6 Gateway and how to use it, see [What is Ipv6 Gateway](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/createipv6gateway).
//
// > **NOTE:** Available since v1.142.0.
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
//			name := "tf-testacc-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultVpc, err := vpc.NewNetwork(ctx, "defaultVpc", &vpc.NetworkArgs{
//				Description: pulumi.String("tf-testacc"),
//				EnableIpv6:  pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			defaultRg, err := resourcemanager.NewResourceGroup(ctx, "defaultRg", &resourcemanager.ResourceGroupArgs{
//				DisplayName:       pulumi.String("tf-testacc-ipv6gateway503"),
//				ResourceGroupName: pulumi.Sprintf("%v1", name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = resourcemanager.NewResourceGroup(ctx, "changeRg", &resourcemanager.ResourceGroupArgs{
//				DisplayName:       pulumi.String("tf-testacc-ipv6gateway311"),
//				ResourceGroupName: pulumi.Sprintf("%v2", name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewIpv6Gateway(ctx, "default", &vpc.Ipv6GatewayArgs{
//				Description:     pulumi.String("test"),
//				Ipv6GatewayName: pulumi.String(name),
//				VpcId:           defaultVpc.ID(),
//				ResourceGroupId: defaultRg.ID(),
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
// Vpc Ipv6 Gateway can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:vpc/ipv6Gateway:Ipv6Gateway example <id>
// ```
type Ipv6Gateway struct {
	pulumi.CustomResourceState

	// The status of the IPv6 gateway.
	BusinessStatus pulumi.StringOutput `pulumi:"businessStatus"`
	// The creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The description of the IPv6 gateway. The description must be 2 to 256 characters in length. It cannot start with http:// or https://.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The expiration time of IPv6 gateway.
	ExpiredTime pulumi.StringOutput `pulumi:"expiredTime"`
	// The charge type of IPv6 gateway.
	InstanceChargeType pulumi.StringOutput `pulumi:"instanceChargeType"`
	// Resource primary key attribute field.
	Ipv6GatewayId pulumi.StringOutput `pulumi:"ipv6GatewayId"`
	// The name of the IPv6 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with http:// or https://.
	Ipv6GatewayName pulumi.StringPtrOutput `pulumi:"ipv6GatewayName"`
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
	//
	// Deprecated: Field 'Spec' has been deprecated from provider version 1.205.0. IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
	Spec pulumi.StringOutput `pulumi:"spec"`
	// The status of the resource. Valid values: Available, Pending and Deleting.
	Status pulumi.StringOutput `pulumi:"status"`
	// The tags for the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The ID of the virtual private cloud (VPC) for which you want to create the IPv6 gateway.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewIpv6Gateway registers a new resource with the given unique name, arguments, and options.
func NewIpv6Gateway(ctx *pulumi.Context,
	name string, args *Ipv6GatewayArgs, opts ...pulumi.ResourceOption) (*Ipv6Gateway, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Ipv6Gateway
	err := ctx.RegisterResource("alicloud:vpc/ipv6Gateway:Ipv6Gateway", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIpv6Gateway gets an existing Ipv6Gateway resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIpv6Gateway(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *Ipv6GatewayState, opts ...pulumi.ResourceOption) (*Ipv6Gateway, error) {
	var resource Ipv6Gateway
	err := ctx.ReadResource("alicloud:vpc/ipv6Gateway:Ipv6Gateway", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ipv6Gateway resources.
type ipv6GatewayState struct {
	// The status of the IPv6 gateway.
	BusinessStatus *string `pulumi:"businessStatus"`
	// The creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// The description of the IPv6 gateway. The description must be 2 to 256 characters in length. It cannot start with http:// or https://.
	Description *string `pulumi:"description"`
	// The expiration time of IPv6 gateway.
	ExpiredTime *string `pulumi:"expiredTime"`
	// The charge type of IPv6 gateway.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// Resource primary key attribute field.
	Ipv6GatewayId *string `pulumi:"ipv6GatewayId"`
	// The name of the IPv6 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with http:// or https://.
	Ipv6GatewayName *string `pulumi:"ipv6GatewayName"`
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
	//
	// Deprecated: Field 'Spec' has been deprecated from provider version 1.205.0. IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
	Spec *string `pulumi:"spec"`
	// The status of the resource. Valid values: Available, Pending and Deleting.
	Status *string `pulumi:"status"`
	// The tags for the resource.
	Tags map[string]string `pulumi:"tags"`
	// The ID of the virtual private cloud (VPC) for which you want to create the IPv6 gateway.
	VpcId *string `pulumi:"vpcId"`
}

type Ipv6GatewayState struct {
	// The status of the IPv6 gateway.
	BusinessStatus pulumi.StringPtrInput
	// The creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// The description of the IPv6 gateway. The description must be 2 to 256 characters in length. It cannot start with http:// or https://.
	Description pulumi.StringPtrInput
	// The expiration time of IPv6 gateway.
	ExpiredTime pulumi.StringPtrInput
	// The charge type of IPv6 gateway.
	InstanceChargeType pulumi.StringPtrInput
	// Resource primary key attribute field.
	Ipv6GatewayId pulumi.StringPtrInput
	// The name of the IPv6 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with http:// or https://.
	Ipv6GatewayName pulumi.StringPtrInput
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId pulumi.StringPtrInput
	// IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
	//
	// Deprecated: Field 'Spec' has been deprecated from provider version 1.205.0. IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
	Spec pulumi.StringPtrInput
	// The status of the resource. Valid values: Available, Pending and Deleting.
	Status pulumi.StringPtrInput
	// The tags for the resource.
	Tags pulumi.StringMapInput
	// The ID of the virtual private cloud (VPC) for which you want to create the IPv6 gateway.
	VpcId pulumi.StringPtrInput
}

func (Ipv6GatewayState) ElementType() reflect.Type {
	return reflect.TypeOf((*ipv6GatewayState)(nil)).Elem()
}

type ipv6GatewayArgs struct {
	// The description of the IPv6 gateway. The description must be 2 to 256 characters in length. It cannot start with http:// or https://.
	Description *string `pulumi:"description"`
	// The name of the IPv6 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with http:// or https://.
	Ipv6GatewayName *string `pulumi:"ipv6GatewayName"`
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
	//
	// Deprecated: Field 'Spec' has been deprecated from provider version 1.205.0. IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
	Spec *string `pulumi:"spec"`
	// The tags for the resource.
	Tags map[string]string `pulumi:"tags"`
	// The ID of the virtual private cloud (VPC) for which you want to create the IPv6 gateway.
	VpcId string `pulumi:"vpcId"`
}

// The set of arguments for constructing a Ipv6Gateway resource.
type Ipv6GatewayArgs struct {
	// The description of the IPv6 gateway. The description must be 2 to 256 characters in length. It cannot start with http:// or https://.
	Description pulumi.StringPtrInput
	// The name of the IPv6 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with http:// or https://.
	Ipv6GatewayName pulumi.StringPtrInput
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId pulumi.StringPtrInput
	// IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
	//
	// Deprecated: Field 'Spec' has been deprecated from provider version 1.205.0. IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
	Spec pulumi.StringPtrInput
	// The tags for the resource.
	Tags pulumi.StringMapInput
	// The ID of the virtual private cloud (VPC) for which you want to create the IPv6 gateway.
	VpcId pulumi.StringInput
}

func (Ipv6GatewayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ipv6GatewayArgs)(nil)).Elem()
}

type Ipv6GatewayInput interface {
	pulumi.Input

	ToIpv6GatewayOutput() Ipv6GatewayOutput
	ToIpv6GatewayOutputWithContext(ctx context.Context) Ipv6GatewayOutput
}

func (*Ipv6Gateway) ElementType() reflect.Type {
	return reflect.TypeOf((**Ipv6Gateway)(nil)).Elem()
}

func (i *Ipv6Gateway) ToIpv6GatewayOutput() Ipv6GatewayOutput {
	return i.ToIpv6GatewayOutputWithContext(context.Background())
}

func (i *Ipv6Gateway) ToIpv6GatewayOutputWithContext(ctx context.Context) Ipv6GatewayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Ipv6GatewayOutput)
}

// Ipv6GatewayArrayInput is an input type that accepts Ipv6GatewayArray and Ipv6GatewayArrayOutput values.
// You can construct a concrete instance of `Ipv6GatewayArrayInput` via:
//
//	Ipv6GatewayArray{ Ipv6GatewayArgs{...} }
type Ipv6GatewayArrayInput interface {
	pulumi.Input

	ToIpv6GatewayArrayOutput() Ipv6GatewayArrayOutput
	ToIpv6GatewayArrayOutputWithContext(context.Context) Ipv6GatewayArrayOutput
}

type Ipv6GatewayArray []Ipv6GatewayInput

func (Ipv6GatewayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ipv6Gateway)(nil)).Elem()
}

func (i Ipv6GatewayArray) ToIpv6GatewayArrayOutput() Ipv6GatewayArrayOutput {
	return i.ToIpv6GatewayArrayOutputWithContext(context.Background())
}

func (i Ipv6GatewayArray) ToIpv6GatewayArrayOutputWithContext(ctx context.Context) Ipv6GatewayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Ipv6GatewayArrayOutput)
}

// Ipv6GatewayMapInput is an input type that accepts Ipv6GatewayMap and Ipv6GatewayMapOutput values.
// You can construct a concrete instance of `Ipv6GatewayMapInput` via:
//
//	Ipv6GatewayMap{ "key": Ipv6GatewayArgs{...} }
type Ipv6GatewayMapInput interface {
	pulumi.Input

	ToIpv6GatewayMapOutput() Ipv6GatewayMapOutput
	ToIpv6GatewayMapOutputWithContext(context.Context) Ipv6GatewayMapOutput
}

type Ipv6GatewayMap map[string]Ipv6GatewayInput

func (Ipv6GatewayMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ipv6Gateway)(nil)).Elem()
}

func (i Ipv6GatewayMap) ToIpv6GatewayMapOutput() Ipv6GatewayMapOutput {
	return i.ToIpv6GatewayMapOutputWithContext(context.Background())
}

func (i Ipv6GatewayMap) ToIpv6GatewayMapOutputWithContext(ctx context.Context) Ipv6GatewayMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Ipv6GatewayMapOutput)
}

type Ipv6GatewayOutput struct{ *pulumi.OutputState }

func (Ipv6GatewayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Ipv6Gateway)(nil)).Elem()
}

func (o Ipv6GatewayOutput) ToIpv6GatewayOutput() Ipv6GatewayOutput {
	return o
}

func (o Ipv6GatewayOutput) ToIpv6GatewayOutputWithContext(ctx context.Context) Ipv6GatewayOutput {
	return o
}

// The status of the IPv6 gateway.
func (o Ipv6GatewayOutput) BusinessStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *Ipv6Gateway) pulumi.StringOutput { return v.BusinessStatus }).(pulumi.StringOutput)
}

// The creation time of the resource.
func (o Ipv6GatewayOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Ipv6Gateway) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The description of the IPv6 gateway. The description must be 2 to 256 characters in length. It cannot start with http:// or https://.
func (o Ipv6GatewayOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ipv6Gateway) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The expiration time of IPv6 gateway.
func (o Ipv6GatewayOutput) ExpiredTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Ipv6Gateway) pulumi.StringOutput { return v.ExpiredTime }).(pulumi.StringOutput)
}

// The charge type of IPv6 gateway.
func (o Ipv6GatewayOutput) InstanceChargeType() pulumi.StringOutput {
	return o.ApplyT(func(v *Ipv6Gateway) pulumi.StringOutput { return v.InstanceChargeType }).(pulumi.StringOutput)
}

// Resource primary key attribute field.
func (o Ipv6GatewayOutput) Ipv6GatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v *Ipv6Gateway) pulumi.StringOutput { return v.Ipv6GatewayId }).(pulumi.StringOutput)
}

// The name of the IPv6 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with http:// or https://.
func (o Ipv6GatewayOutput) Ipv6GatewayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ipv6Gateway) pulumi.StringPtrOutput { return v.Ipv6GatewayName }).(pulumi.StringPtrOutput)
}

// The ID of the resource group to which the instance belongs.
func (o Ipv6GatewayOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Ipv6Gateway) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
//
// Deprecated: Field 'Spec' has been deprecated from provider version 1.205.0. IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
func (o Ipv6GatewayOutput) Spec() pulumi.StringOutput {
	return o.ApplyT(func(v *Ipv6Gateway) pulumi.StringOutput { return v.Spec }).(pulumi.StringOutput)
}

// The status of the resource. Valid values: Available, Pending and Deleting.
func (o Ipv6GatewayOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Ipv6Gateway) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tags for the resource.
func (o Ipv6GatewayOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Ipv6Gateway) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The ID of the virtual private cloud (VPC) for which you want to create the IPv6 gateway.
func (o Ipv6GatewayOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *Ipv6Gateway) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type Ipv6GatewayArrayOutput struct{ *pulumi.OutputState }

func (Ipv6GatewayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ipv6Gateway)(nil)).Elem()
}

func (o Ipv6GatewayArrayOutput) ToIpv6GatewayArrayOutput() Ipv6GatewayArrayOutput {
	return o
}

func (o Ipv6GatewayArrayOutput) ToIpv6GatewayArrayOutputWithContext(ctx context.Context) Ipv6GatewayArrayOutput {
	return o
}

func (o Ipv6GatewayArrayOutput) Index(i pulumi.IntInput) Ipv6GatewayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Ipv6Gateway {
		return vs[0].([]*Ipv6Gateway)[vs[1].(int)]
	}).(Ipv6GatewayOutput)
}

type Ipv6GatewayMapOutput struct{ *pulumi.OutputState }

func (Ipv6GatewayMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ipv6Gateway)(nil)).Elem()
}

func (o Ipv6GatewayMapOutput) ToIpv6GatewayMapOutput() Ipv6GatewayMapOutput {
	return o
}

func (o Ipv6GatewayMapOutput) ToIpv6GatewayMapOutputWithContext(ctx context.Context) Ipv6GatewayMapOutput {
	return o
}

func (o Ipv6GatewayMapOutput) MapIndex(k pulumi.StringInput) Ipv6GatewayOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Ipv6Gateway {
		return vs[0].(map[string]*Ipv6Gateway)[vs[1].(string)]
	}).(Ipv6GatewayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*Ipv6GatewayInput)(nil)).Elem(), &Ipv6Gateway{})
	pulumi.RegisterInputType(reflect.TypeOf((*Ipv6GatewayArrayInput)(nil)).Elem(), Ipv6GatewayArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*Ipv6GatewayMapInput)(nil)).Elem(), Ipv6GatewayMap{})
	pulumi.RegisterOutputType(Ipv6GatewayOutput{})
	pulumi.RegisterOutputType(Ipv6GatewayArrayOutput{})
	pulumi.RegisterOutputType(Ipv6GatewayMapOutput{})
}
