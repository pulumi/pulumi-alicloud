// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eflo

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Eflo Vpd resource.
//
// For information about Eflo Vpd and how to use it, see [What is Vpd](https://help.aliyun.com/document_detail/604976.html).
//
// > **NOTE:** Available in v1.201.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eflo"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := eflo.NewVpd(ctx, "default", &eflo.VpdArgs{
//				Cidr:    pulumi.String("10.0.0.0/8"),
//				VpdName: pulumi.String("RMC-Terraform-Test"),
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
// Eflo Vpd can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:eflo/vpd:Vpd example <id>
//
// ```
type Vpd struct {
	pulumi.CustomResourceState

	// CIDR network segment
	Cidr pulumi.StringOutput `pulumi:"cidr"`
	// The creation time of the resource
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Modification time
	GmtModified pulumi.StringOutput `pulumi:"gmtModified"`
	// The Resource group id
	ResourceGroupId pulumi.StringPtrOutput `pulumi:"resourceGroupId"`
	// The Vpd status.
	Status pulumi.StringOutput `pulumi:"status"`
	// The Name of the VPD.
	VpdName pulumi.StringOutput `pulumi:"vpdName"`
}

// NewVpd registers a new resource with the given unique name, arguments, and options.
func NewVpd(ctx *pulumi.Context,
	name string, args *VpdArgs, opts ...pulumi.ResourceOption) (*Vpd, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Cidr == nil {
		return nil, errors.New("invalid value for required argument 'Cidr'")
	}
	if args.VpdName == nil {
		return nil, errors.New("invalid value for required argument 'VpdName'")
	}
	var resource Vpd
	err := ctx.RegisterResource("alicloud:eflo/vpd:Vpd", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVpd gets an existing Vpd resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVpd(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VpdState, opts ...pulumi.ResourceOption) (*Vpd, error) {
	var resource Vpd
	err := ctx.ReadResource("alicloud:eflo/vpd:Vpd", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Vpd resources.
type vpdState struct {
	// CIDR network segment
	Cidr *string `pulumi:"cidr"`
	// The creation time of the resource
	CreateTime *string `pulumi:"createTime"`
	// Modification time
	GmtModified *string `pulumi:"gmtModified"`
	// The Resource group id
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The Vpd status.
	Status *string `pulumi:"status"`
	// The Name of the VPD.
	VpdName *string `pulumi:"vpdName"`
}

type VpdState struct {
	// CIDR network segment
	Cidr pulumi.StringPtrInput
	// The creation time of the resource
	CreateTime pulumi.StringPtrInput
	// Modification time
	GmtModified pulumi.StringPtrInput
	// The Resource group id
	ResourceGroupId pulumi.StringPtrInput
	// The Vpd status.
	Status pulumi.StringPtrInput
	// The Name of the VPD.
	VpdName pulumi.StringPtrInput
}

func (VpdState) ElementType() reflect.Type {
	return reflect.TypeOf((*vpdState)(nil)).Elem()
}

type vpdArgs struct {
	// CIDR network segment
	Cidr string `pulumi:"cidr"`
	// The Resource group id
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The Name of the VPD.
	VpdName string `pulumi:"vpdName"`
}

// The set of arguments for constructing a Vpd resource.
type VpdArgs struct {
	// CIDR network segment
	Cidr pulumi.StringInput
	// The Resource group id
	ResourceGroupId pulumi.StringPtrInput
	// The Name of the VPD.
	VpdName pulumi.StringInput
}

func (VpdArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vpdArgs)(nil)).Elem()
}

type VpdInput interface {
	pulumi.Input

	ToVpdOutput() VpdOutput
	ToVpdOutputWithContext(ctx context.Context) VpdOutput
}

func (*Vpd) ElementType() reflect.Type {
	return reflect.TypeOf((**Vpd)(nil)).Elem()
}

func (i *Vpd) ToVpdOutput() VpdOutput {
	return i.ToVpdOutputWithContext(context.Background())
}

func (i *Vpd) ToVpdOutputWithContext(ctx context.Context) VpdOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpdOutput)
}

// VpdArrayInput is an input type that accepts VpdArray and VpdArrayOutput values.
// You can construct a concrete instance of `VpdArrayInput` via:
//
//	VpdArray{ VpdArgs{...} }
type VpdArrayInput interface {
	pulumi.Input

	ToVpdArrayOutput() VpdArrayOutput
	ToVpdArrayOutputWithContext(context.Context) VpdArrayOutput
}

type VpdArray []VpdInput

func (VpdArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Vpd)(nil)).Elem()
}

func (i VpdArray) ToVpdArrayOutput() VpdArrayOutput {
	return i.ToVpdArrayOutputWithContext(context.Background())
}

func (i VpdArray) ToVpdArrayOutputWithContext(ctx context.Context) VpdArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpdArrayOutput)
}

// VpdMapInput is an input type that accepts VpdMap and VpdMapOutput values.
// You can construct a concrete instance of `VpdMapInput` via:
//
//	VpdMap{ "key": VpdArgs{...} }
type VpdMapInput interface {
	pulumi.Input

	ToVpdMapOutput() VpdMapOutput
	ToVpdMapOutputWithContext(context.Context) VpdMapOutput
}

type VpdMap map[string]VpdInput

func (VpdMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Vpd)(nil)).Elem()
}

func (i VpdMap) ToVpdMapOutput() VpdMapOutput {
	return i.ToVpdMapOutputWithContext(context.Background())
}

func (i VpdMap) ToVpdMapOutputWithContext(ctx context.Context) VpdMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpdMapOutput)
}

type VpdOutput struct{ *pulumi.OutputState }

func (VpdOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Vpd)(nil)).Elem()
}

func (o VpdOutput) ToVpdOutput() VpdOutput {
	return o
}

func (o VpdOutput) ToVpdOutputWithContext(ctx context.Context) VpdOutput {
	return o
}

// CIDR network segment
func (o VpdOutput) Cidr() pulumi.StringOutput {
	return o.ApplyT(func(v *Vpd) pulumi.StringOutput { return v.Cidr }).(pulumi.StringOutput)
}

// The creation time of the resource
func (o VpdOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Vpd) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Modification time
func (o VpdOutput) GmtModified() pulumi.StringOutput {
	return o.ApplyT(func(v *Vpd) pulumi.StringOutput { return v.GmtModified }).(pulumi.StringOutput)
}

// The Resource group id
func (o VpdOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Vpd) pulumi.StringPtrOutput { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// The Vpd status.
func (o VpdOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Vpd) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The Name of the VPD.
func (o VpdOutput) VpdName() pulumi.StringOutput {
	return o.ApplyT(func(v *Vpd) pulumi.StringOutput { return v.VpdName }).(pulumi.StringOutput)
}

type VpdArrayOutput struct{ *pulumi.OutputState }

func (VpdArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Vpd)(nil)).Elem()
}

func (o VpdArrayOutput) ToVpdArrayOutput() VpdArrayOutput {
	return o
}

func (o VpdArrayOutput) ToVpdArrayOutputWithContext(ctx context.Context) VpdArrayOutput {
	return o
}

func (o VpdArrayOutput) Index(i pulumi.IntInput) VpdOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Vpd {
		return vs[0].([]*Vpd)[vs[1].(int)]
	}).(VpdOutput)
}

type VpdMapOutput struct{ *pulumi.OutputState }

func (VpdMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Vpd)(nil)).Elem()
}

func (o VpdMapOutput) ToVpdMapOutput() VpdMapOutput {
	return o
}

func (o VpdMapOutput) ToVpdMapOutputWithContext(ctx context.Context) VpdMapOutput {
	return o
}

func (o VpdMapOutput) MapIndex(k pulumi.StringInput) VpdOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Vpd {
		return vs[0].(map[string]*Vpd)[vs[1].(string)]
	}).(VpdOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VpdInput)(nil)).Elem(), &Vpd{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpdArrayInput)(nil)).Elem(), VpdArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpdMapInput)(nil)).Elem(), VpdMap{})
	pulumi.RegisterOutputType(VpdOutput{})
	pulumi.RegisterOutputType(VpdArrayOutput{})
	pulumi.RegisterOutputType(VpdMapOutput{})
}