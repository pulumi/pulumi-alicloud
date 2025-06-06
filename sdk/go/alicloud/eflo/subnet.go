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

// Provides a Eflo Subnet resource.
//
// For information about Eflo Subnet and how to use it, see [What is Subnet](https://www.alibabacloud.com/help/en/pai/user-guide/overview-of-intelligent-computing-lingjun).
//
// > **NOTE:** Available since v1.204.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eflo"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
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
//			_default, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetResourceGroups, err := resourcemanager.GetResourceGroups(ctx, &resourcemanager.GetResourceGroupsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			defaultVpd, err := eflo.NewVpd(ctx, "default", &eflo.VpdArgs{
//				Cidr:            pulumi.String("10.0.0.0/8"),
//				VpdName:         pulumi.String(name),
//				ResourceGroupId: pulumi.String(defaultGetResourceGroups.Groups[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = eflo.NewSubnet(ctx, "default", &eflo.SubnetArgs{
//				SubnetName: pulumi.String(name),
//				ZoneId:     pulumi.String(_default.Zones[0].Id),
//				Cidr:       pulumi.String("10.0.0.0/16"),
//				VpdId:      defaultVpd.ID(),
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
// Eflo Subnet can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:eflo/subnet:Subnet example <vpd_id>:<subnet_id>
// ```
type Subnet struct {
	pulumi.CustomResourceState

	// CIDR network segment.
	Cidr pulumi.StringOutput `pulumi:"cidr"`
	// The creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Modification time.
	GmtModified pulumi.StringOutput `pulumi:"gmtModified"`
	// Error message.
	Message pulumi.StringOutput `pulumi:"message"`
	// Resource Group ID.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// The id of the subnet.
	SubnetId pulumi.StringOutput `pulumi:"subnetId"`
	// The Subnet name.
	SubnetName pulumi.StringOutput `pulumi:"subnetName"`
	// Eflo subnet usage type. optional value:
	// - General type is not filled in
	// - OOB:OOB type
	// - LB: LB type
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// The Eflo VPD ID.
	VpdId pulumi.StringOutput `pulumi:"vpdId"`
	// The zone ID  of the resource.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewSubnet registers a new resource with the given unique name, arguments, and options.
func NewSubnet(ctx *pulumi.Context,
	name string, args *SubnetArgs, opts ...pulumi.ResourceOption) (*Subnet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Cidr == nil {
		return nil, errors.New("invalid value for required argument 'Cidr'")
	}
	if args.SubnetName == nil {
		return nil, errors.New("invalid value for required argument 'SubnetName'")
	}
	if args.VpdId == nil {
		return nil, errors.New("invalid value for required argument 'VpdId'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Subnet
	err := ctx.RegisterResource("alicloud:eflo/subnet:Subnet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSubnet gets an existing Subnet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSubnet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SubnetState, opts ...pulumi.ResourceOption) (*Subnet, error) {
	var resource Subnet
	err := ctx.ReadResource("alicloud:eflo/subnet:Subnet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Subnet resources.
type subnetState struct {
	// CIDR network segment.
	Cidr *string `pulumi:"cidr"`
	// The creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// Modification time.
	GmtModified *string `pulumi:"gmtModified"`
	// Error message.
	Message *string `pulumi:"message"`
	// Resource Group ID.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The id of the subnet.
	SubnetId *string `pulumi:"subnetId"`
	// The Subnet name.
	SubnetName *string `pulumi:"subnetName"`
	// Eflo subnet usage type. optional value:
	// - General type is not filled in
	// - OOB:OOB type
	// - LB: LB type
	Type *string `pulumi:"type"`
	// The Eflo VPD ID.
	VpdId *string `pulumi:"vpdId"`
	// The zone ID  of the resource.
	ZoneId *string `pulumi:"zoneId"`
}

type SubnetState struct {
	// CIDR network segment.
	Cidr pulumi.StringPtrInput
	// The creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// Modification time.
	GmtModified pulumi.StringPtrInput
	// Error message.
	Message pulumi.StringPtrInput
	// Resource Group ID.
	ResourceGroupId pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The id of the subnet.
	SubnetId pulumi.StringPtrInput
	// The Subnet name.
	SubnetName pulumi.StringPtrInput
	// Eflo subnet usage type. optional value:
	// - General type is not filled in
	// - OOB:OOB type
	// - LB: LB type
	Type pulumi.StringPtrInput
	// The Eflo VPD ID.
	VpdId pulumi.StringPtrInput
	// The zone ID  of the resource.
	ZoneId pulumi.StringPtrInput
}

func (SubnetState) ElementType() reflect.Type {
	return reflect.TypeOf((*subnetState)(nil)).Elem()
}

type subnetArgs struct {
	// CIDR network segment.
	Cidr string `pulumi:"cidr"`
	// The Subnet name.
	SubnetName string `pulumi:"subnetName"`
	// Eflo subnet usage type. optional value:
	// - General type is not filled in
	// - OOB:OOB type
	// - LB: LB type
	Type *string `pulumi:"type"`
	// The Eflo VPD ID.
	VpdId string `pulumi:"vpdId"`
	// The zone ID  of the resource.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Subnet resource.
type SubnetArgs struct {
	// CIDR network segment.
	Cidr pulumi.StringInput
	// The Subnet name.
	SubnetName pulumi.StringInput
	// Eflo subnet usage type. optional value:
	// - General type is not filled in
	// - OOB:OOB type
	// - LB: LB type
	Type pulumi.StringPtrInput
	// The Eflo VPD ID.
	VpdId pulumi.StringInput
	// The zone ID  of the resource.
	ZoneId pulumi.StringInput
}

func (SubnetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*subnetArgs)(nil)).Elem()
}

type SubnetInput interface {
	pulumi.Input

	ToSubnetOutput() SubnetOutput
	ToSubnetOutputWithContext(ctx context.Context) SubnetOutput
}

func (*Subnet) ElementType() reflect.Type {
	return reflect.TypeOf((**Subnet)(nil)).Elem()
}

func (i *Subnet) ToSubnetOutput() SubnetOutput {
	return i.ToSubnetOutputWithContext(context.Background())
}

func (i *Subnet) ToSubnetOutputWithContext(ctx context.Context) SubnetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubnetOutput)
}

// SubnetArrayInput is an input type that accepts SubnetArray and SubnetArrayOutput values.
// You can construct a concrete instance of `SubnetArrayInput` via:
//
//	SubnetArray{ SubnetArgs{...} }
type SubnetArrayInput interface {
	pulumi.Input

	ToSubnetArrayOutput() SubnetArrayOutput
	ToSubnetArrayOutputWithContext(context.Context) SubnetArrayOutput
}

type SubnetArray []SubnetInput

func (SubnetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Subnet)(nil)).Elem()
}

func (i SubnetArray) ToSubnetArrayOutput() SubnetArrayOutput {
	return i.ToSubnetArrayOutputWithContext(context.Background())
}

func (i SubnetArray) ToSubnetArrayOutputWithContext(ctx context.Context) SubnetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubnetArrayOutput)
}

// SubnetMapInput is an input type that accepts SubnetMap and SubnetMapOutput values.
// You can construct a concrete instance of `SubnetMapInput` via:
//
//	SubnetMap{ "key": SubnetArgs{...} }
type SubnetMapInput interface {
	pulumi.Input

	ToSubnetMapOutput() SubnetMapOutput
	ToSubnetMapOutputWithContext(context.Context) SubnetMapOutput
}

type SubnetMap map[string]SubnetInput

func (SubnetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Subnet)(nil)).Elem()
}

func (i SubnetMap) ToSubnetMapOutput() SubnetMapOutput {
	return i.ToSubnetMapOutputWithContext(context.Background())
}

func (i SubnetMap) ToSubnetMapOutputWithContext(ctx context.Context) SubnetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubnetMapOutput)
}

type SubnetOutput struct{ *pulumi.OutputState }

func (SubnetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Subnet)(nil)).Elem()
}

func (o SubnetOutput) ToSubnetOutput() SubnetOutput {
	return o
}

func (o SubnetOutput) ToSubnetOutputWithContext(ctx context.Context) SubnetOutput {
	return o
}

// CIDR network segment.
func (o SubnetOutput) Cidr() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.Cidr }).(pulumi.StringOutput)
}

// The creation time of the resource.
func (o SubnetOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Modification time.
func (o SubnetOutput) GmtModified() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.GmtModified }).(pulumi.StringOutput)
}

// Error message.
func (o SubnetOutput) Message() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.Message }).(pulumi.StringOutput)
}

// Resource Group ID.
func (o SubnetOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The status of the resource.
func (o SubnetOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The id of the subnet.
func (o SubnetOutput) SubnetId() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.SubnetId }).(pulumi.StringOutput)
}

// The Subnet name.
func (o SubnetOutput) SubnetName() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.SubnetName }).(pulumi.StringOutput)
}

// Eflo subnet usage type. optional value:
// - General type is not filled in
// - OOB:OOB type
// - LB: LB type
func (o SubnetOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

// The Eflo VPD ID.
func (o SubnetOutput) VpdId() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.VpdId }).(pulumi.StringOutput)
}

// The zone ID  of the resource.
func (o SubnetOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type SubnetArrayOutput struct{ *pulumi.OutputState }

func (SubnetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Subnet)(nil)).Elem()
}

func (o SubnetArrayOutput) ToSubnetArrayOutput() SubnetArrayOutput {
	return o
}

func (o SubnetArrayOutput) ToSubnetArrayOutputWithContext(ctx context.Context) SubnetArrayOutput {
	return o
}

func (o SubnetArrayOutput) Index(i pulumi.IntInput) SubnetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Subnet {
		return vs[0].([]*Subnet)[vs[1].(int)]
	}).(SubnetOutput)
}

type SubnetMapOutput struct{ *pulumi.OutputState }

func (SubnetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Subnet)(nil)).Elem()
}

func (o SubnetMapOutput) ToSubnetMapOutput() SubnetMapOutput {
	return o
}

func (o SubnetMapOutput) ToSubnetMapOutputWithContext(ctx context.Context) SubnetMapOutput {
	return o
}

func (o SubnetMapOutput) MapIndex(k pulumi.StringInput) SubnetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Subnet {
		return vs[0].(map[string]*Subnet)[vs[1].(string)]
	}).(SubnetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SubnetInput)(nil)).Elem(), &Subnet{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubnetArrayInput)(nil)).Elem(), SubnetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubnetMapInput)(nil)).Elem(), SubnetMap{})
	pulumi.RegisterOutputType(SubnetOutput{})
	pulumi.RegisterOutputType(SubnetArrayOutput{})
	pulumi.RegisterOutputType(SubnetMapOutput{})
}
