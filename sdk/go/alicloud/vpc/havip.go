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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
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
//			_default, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			example, err := vpc.NewNetwork(ctx, "example", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("10.4.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSwitch, err := vpc.NewSwitch(ctx, "example", &vpc.SwitchArgs{
//				VswitchName: pulumi.String(name),
//				CidrBlock:   pulumi.String("10.4.0.0/24"),
//				VpcId:       example.ID(),
//				ZoneId:      pulumi.String(_default.Zones[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewHAVip(ctx, "example", &vpc.HAVipArgs{
//				VswitchId:   exampleSwitch.ID(),
//				Description: pulumi.String(name),
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
// The havip can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:vpc/hAVip:HAVip foo havip-abc123456
// ```
type HAVip struct {
	pulumi.CustomResourceState

	// The elastic IP address (EIP) associated with the HAVIP.
	AssociatedEipAddresses pulumi.StringArrayOutput `pulumi:"associatedEipAddresses"`
	// The type of the instance with which the HAVIP is associated. Valid values:
	// - `EcsInstance`: an ECS instance.
	// - `NetworkInterface`: an ENI.
	AssociatedInstanceType pulumi.StringOutput `pulumi:"associatedInstanceType"`
	// The ID of the instance with which the HAVIP is associated.
	AssociatedInstances pulumi.StringArrayOutput `pulumi:"associatedInstances"`
	// The time when the HAVIP was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The description of the HaVip instance.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the HAVIP.
	HaVipId pulumi.StringOutput `pulumi:"haVipId"`
	// The name of the HAVIP.
	HaVipName pulumi.StringOutput `pulumi:"haVipName"`
	// The name of the HaVip instance.
	//
	// Deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.
	HavipName pulumi.StringOutput `pulumi:"havipName"`
	// The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// The ID of the active instance that is associated with the HAVIP.
	MasterInstanceId pulumi.StringOutput `pulumi:"masterInstanceId"`
	// The ID of the resource group to which the HAVIP belongs.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// (Available since v1.120.0) The status of the HaVip instance.
	Status pulumi.StringOutput `pulumi:"status"`
	// The list of tags.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The ID of the VPC to which the HAVIP belongs.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
	// The vswitchId of the HaVip, the field can't be changed.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
}

// NewHAVip registers a new resource with the given unique name, arguments, and options.
func NewHAVip(ctx *pulumi.Context,
	name string, args *HAVipArgs, opts ...pulumi.ResourceOption) (*HAVip, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HAVip
	err := ctx.RegisterResource("alicloud:vpc/hAVip:HAVip", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHAVip gets an existing HAVip resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHAVip(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HAVipState, opts ...pulumi.ResourceOption) (*HAVip, error) {
	var resource HAVip
	err := ctx.ReadResource("alicloud:vpc/hAVip:HAVip", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HAVip resources.
type havipState struct {
	// The elastic IP address (EIP) associated with the HAVIP.
	AssociatedEipAddresses []string `pulumi:"associatedEipAddresses"`
	// The type of the instance with which the HAVIP is associated. Valid values:
	// - `EcsInstance`: an ECS instance.
	// - `NetworkInterface`: an ENI.
	AssociatedInstanceType *string `pulumi:"associatedInstanceType"`
	// The ID of the instance with which the HAVIP is associated.
	AssociatedInstances []string `pulumi:"associatedInstances"`
	// The time when the HAVIP was created.
	CreateTime *string `pulumi:"createTime"`
	// The description of the HaVip instance.
	Description *string `pulumi:"description"`
	// The ID of the HAVIP.
	HaVipId *string `pulumi:"haVipId"`
	// The name of the HAVIP.
	HaVipName *string `pulumi:"haVipName"`
	// The name of the HaVip instance.
	//
	// Deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.
	HavipName *string `pulumi:"havipName"`
	// The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
	IpAddress *string `pulumi:"ipAddress"`
	// The ID of the active instance that is associated with the HAVIP.
	MasterInstanceId *string `pulumi:"masterInstanceId"`
	// The ID of the resource group to which the HAVIP belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// (Available since v1.120.0) The status of the HaVip instance.
	Status *string `pulumi:"status"`
	// The list of tags.
	Tags map[string]string `pulumi:"tags"`
	// The ID of the VPC to which the HAVIP belongs.
	VpcId *string `pulumi:"vpcId"`
	// The vswitchId of the HaVip, the field can't be changed.
	VswitchId *string `pulumi:"vswitchId"`
}

type HAVipState struct {
	// The elastic IP address (EIP) associated with the HAVIP.
	AssociatedEipAddresses pulumi.StringArrayInput
	// The type of the instance with which the HAVIP is associated. Valid values:
	// - `EcsInstance`: an ECS instance.
	// - `NetworkInterface`: an ENI.
	AssociatedInstanceType pulumi.StringPtrInput
	// The ID of the instance with which the HAVIP is associated.
	AssociatedInstances pulumi.StringArrayInput
	// The time when the HAVIP was created.
	CreateTime pulumi.StringPtrInput
	// The description of the HaVip instance.
	Description pulumi.StringPtrInput
	// The ID of the HAVIP.
	HaVipId pulumi.StringPtrInput
	// The name of the HAVIP.
	HaVipName pulumi.StringPtrInput
	// The name of the HaVip instance.
	//
	// Deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.
	HavipName pulumi.StringPtrInput
	// The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
	IpAddress pulumi.StringPtrInput
	// The ID of the active instance that is associated with the HAVIP.
	MasterInstanceId pulumi.StringPtrInput
	// The ID of the resource group to which the HAVIP belongs.
	ResourceGroupId pulumi.StringPtrInput
	// (Available since v1.120.0) The status of the HaVip instance.
	Status pulumi.StringPtrInput
	// The list of tags.
	Tags pulumi.StringMapInput
	// The ID of the VPC to which the HAVIP belongs.
	VpcId pulumi.StringPtrInput
	// The vswitchId of the HaVip, the field can't be changed.
	VswitchId pulumi.StringPtrInput
}

func (HAVipState) ElementType() reflect.Type {
	return reflect.TypeOf((*havipState)(nil)).Elem()
}

type havipArgs struct {
	// The description of the HaVip instance.
	Description *string `pulumi:"description"`
	// The name of the HAVIP.
	HaVipName *string `pulumi:"haVipName"`
	// The name of the HaVip instance.
	//
	// Deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.
	HavipName *string `pulumi:"havipName"`
	// The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
	IpAddress *string `pulumi:"ipAddress"`
	// The ID of the resource group to which the HAVIP belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The list of tags.
	Tags map[string]string `pulumi:"tags"`
	// The vswitchId of the HaVip, the field can't be changed.
	VswitchId string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a HAVip resource.
type HAVipArgs struct {
	// The description of the HaVip instance.
	Description pulumi.StringPtrInput
	// The name of the HAVIP.
	HaVipName pulumi.StringPtrInput
	// The name of the HaVip instance.
	//
	// Deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.
	HavipName pulumi.StringPtrInput
	// The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
	IpAddress pulumi.StringPtrInput
	// The ID of the resource group to which the HAVIP belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The list of tags.
	Tags pulumi.StringMapInput
	// The vswitchId of the HaVip, the field can't be changed.
	VswitchId pulumi.StringInput
}

func (HAVipArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*havipArgs)(nil)).Elem()
}

type HAVipInput interface {
	pulumi.Input

	ToHAVipOutput() HAVipOutput
	ToHAVipOutputWithContext(ctx context.Context) HAVipOutput
}

func (*HAVip) ElementType() reflect.Type {
	return reflect.TypeOf((**HAVip)(nil)).Elem()
}

func (i *HAVip) ToHAVipOutput() HAVipOutput {
	return i.ToHAVipOutputWithContext(context.Background())
}

func (i *HAVip) ToHAVipOutputWithContext(ctx context.Context) HAVipOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HAVipOutput)
}

// HAVipArrayInput is an input type that accepts HAVipArray and HAVipArrayOutput values.
// You can construct a concrete instance of `HAVipArrayInput` via:
//
//	HAVipArray{ HAVipArgs{...} }
type HAVipArrayInput interface {
	pulumi.Input

	ToHAVipArrayOutput() HAVipArrayOutput
	ToHAVipArrayOutputWithContext(context.Context) HAVipArrayOutput
}

type HAVipArray []HAVipInput

func (HAVipArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HAVip)(nil)).Elem()
}

func (i HAVipArray) ToHAVipArrayOutput() HAVipArrayOutput {
	return i.ToHAVipArrayOutputWithContext(context.Background())
}

func (i HAVipArray) ToHAVipArrayOutputWithContext(ctx context.Context) HAVipArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HAVipArrayOutput)
}

// HAVipMapInput is an input type that accepts HAVipMap and HAVipMapOutput values.
// You can construct a concrete instance of `HAVipMapInput` via:
//
//	HAVipMap{ "key": HAVipArgs{...} }
type HAVipMapInput interface {
	pulumi.Input

	ToHAVipMapOutput() HAVipMapOutput
	ToHAVipMapOutputWithContext(context.Context) HAVipMapOutput
}

type HAVipMap map[string]HAVipInput

func (HAVipMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HAVip)(nil)).Elem()
}

func (i HAVipMap) ToHAVipMapOutput() HAVipMapOutput {
	return i.ToHAVipMapOutputWithContext(context.Background())
}

func (i HAVipMap) ToHAVipMapOutputWithContext(ctx context.Context) HAVipMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HAVipMapOutput)
}

type HAVipOutput struct{ *pulumi.OutputState }

func (HAVipOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HAVip)(nil)).Elem()
}

func (o HAVipOutput) ToHAVipOutput() HAVipOutput {
	return o
}

func (o HAVipOutput) ToHAVipOutputWithContext(ctx context.Context) HAVipOutput {
	return o
}

// The elastic IP address (EIP) associated with the HAVIP.
func (o HAVipOutput) AssociatedEipAddresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringArrayOutput { return v.AssociatedEipAddresses }).(pulumi.StringArrayOutput)
}

// The type of the instance with which the HAVIP is associated. Valid values:
// - `EcsInstance`: an ECS instance.
// - `NetworkInterface`: an ENI.
func (o HAVipOutput) AssociatedInstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringOutput { return v.AssociatedInstanceType }).(pulumi.StringOutput)
}

// The ID of the instance with which the HAVIP is associated.
func (o HAVipOutput) AssociatedInstances() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringArrayOutput { return v.AssociatedInstances }).(pulumi.StringArrayOutput)
}

// The time when the HAVIP was created.
func (o HAVipOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The description of the HaVip instance.
func (o HAVipOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ID of the HAVIP.
func (o HAVipOutput) HaVipId() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringOutput { return v.HaVipId }).(pulumi.StringOutput)
}

// The name of the HAVIP.
func (o HAVipOutput) HaVipName() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringOutput { return v.HaVipName }).(pulumi.StringOutput)
}

// The name of the HaVip instance.
//
// Deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.
func (o HAVipOutput) HavipName() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringOutput { return v.HavipName }).(pulumi.StringOutput)
}

// The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
func (o HAVipOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringOutput { return v.IpAddress }).(pulumi.StringOutput)
}

// The ID of the active instance that is associated with the HAVIP.
func (o HAVipOutput) MasterInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringOutput { return v.MasterInstanceId }).(pulumi.StringOutput)
}

// The ID of the resource group to which the HAVIP belongs.
func (o HAVipOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// (Available since v1.120.0) The status of the HaVip instance.
func (o HAVipOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The list of tags.
func (o HAVipOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The ID of the VPC to which the HAVIP belongs.
func (o HAVipOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

// The vswitchId of the HaVip, the field can't be changed.
func (o HAVipOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVip) pulumi.StringOutput { return v.VswitchId }).(pulumi.StringOutput)
}

type HAVipArrayOutput struct{ *pulumi.OutputState }

func (HAVipArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HAVip)(nil)).Elem()
}

func (o HAVipArrayOutput) ToHAVipArrayOutput() HAVipArrayOutput {
	return o
}

func (o HAVipArrayOutput) ToHAVipArrayOutputWithContext(ctx context.Context) HAVipArrayOutput {
	return o
}

func (o HAVipArrayOutput) Index(i pulumi.IntInput) HAVipOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HAVip {
		return vs[0].([]*HAVip)[vs[1].(int)]
	}).(HAVipOutput)
}

type HAVipMapOutput struct{ *pulumi.OutputState }

func (HAVipMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HAVip)(nil)).Elem()
}

func (o HAVipMapOutput) ToHAVipMapOutput() HAVipMapOutput {
	return o
}

func (o HAVipMapOutput) ToHAVipMapOutputWithContext(ctx context.Context) HAVipMapOutput {
	return o
}

func (o HAVipMapOutput) MapIndex(k pulumi.StringInput) HAVipOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HAVip {
		return vs[0].(map[string]*HAVip)[vs[1].(string)]
	}).(HAVipOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HAVipInput)(nil)).Elem(), &HAVip{})
	pulumi.RegisterInputType(reflect.TypeOf((*HAVipArrayInput)(nil)).Elem(), HAVipArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HAVipMapInput)(nil)).Elem(), HAVipMap{})
	pulumi.RegisterOutputType(HAVipOutput{})
	pulumi.RegisterOutputType(HAVipArrayOutput{})
	pulumi.RegisterOutputType(HAVipMapOutput{})
}
