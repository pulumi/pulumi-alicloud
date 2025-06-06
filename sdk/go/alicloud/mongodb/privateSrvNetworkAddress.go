// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Mongo D B Private Srv Network Address resource.
//
// Private network SRV highly available link address.
//
// For information about Mongo D B Private Srv Network Address and how to use it, see [What is Private Srv Network Address](https://www.alibabacloud.com/help/en/).
//
// > **NOTE:** Available since v1.240.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/mongodb"
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
//			zoneId := "cn-shanghai-b"
//			if param := cfg.Get("zoneId"); param != "" {
//				zoneId = param
//			}
//			regionId := "cn-shanghai"
//			if param := cfg.Get("regionId"); param != "" {
//				regionId = param
//			}
//			defaultie35CW, err := vpc.NewNetwork(ctx, "defaultie35CW", &vpc.NetworkArgs{
//				CidrBlock: pulumi.String("10.0.0.0/8"),
//				VpcName:   pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			defaultg0DCAR, err := vpc.NewSwitch(ctx, "defaultg0DCAR", &vpc.SwitchArgs{
//				VpcId:     defaultie35CW.ID(),
//				ZoneId:    pulumi.String(zoneId),
//				CidrBlock: pulumi.String("10.0.0.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultHrZmxC, err := mongodb.NewInstance(ctx, "defaultHrZmxC", &mongodb.InstanceArgs{
//				EngineVersion:     pulumi.String("4.4"),
//				StorageType:       pulumi.String("cloud_essd1"),
//				VswitchId:         defaultg0DCAR.ID(),
//				DbInstanceStorage: pulumi.Int(20),
//				VpcId:             defaultie35CW.ID(),
//				DbInstanceClass:   pulumi.String("mdb.shard.4x.large.d"),
//				StorageEngine:     pulumi.String("WiredTiger"),
//				NetworkType:       pulumi.String("VPC"),
//				ZoneId:            pulumi.String(zoneId),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodb.NewPrivateSrvNetworkAddress(ctx, "default", &mongodb.PrivateSrvNetworkAddressArgs{
//				DbInstanceId: defaultHrZmxC.ID(),
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
// Mongo D B Private Srv Network Address can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:mongodb/privateSrvNetworkAddress:PrivateSrvNetworkAddress example <id>
// ```
type PrivateSrvNetworkAddress struct {
	pulumi.CustomResourceState

	// The instance ID.
	DbInstanceId pulumi.StringOutput `pulumi:"dbInstanceId"`
	// Private network SRV highly available connection address
	PrivateSrvConnectionStringUri pulumi.StringOutput `pulumi:"privateSrvConnectionStringUri"`
}

// NewPrivateSrvNetworkAddress registers a new resource with the given unique name, arguments, and options.
func NewPrivateSrvNetworkAddress(ctx *pulumi.Context,
	name string, args *PrivateSrvNetworkAddressArgs, opts ...pulumi.ResourceOption) (*PrivateSrvNetworkAddress, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DbInstanceId == nil {
		return nil, errors.New("invalid value for required argument 'DbInstanceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PrivateSrvNetworkAddress
	err := ctx.RegisterResource("alicloud:mongodb/privateSrvNetworkAddress:PrivateSrvNetworkAddress", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrivateSrvNetworkAddress gets an existing PrivateSrvNetworkAddress resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrivateSrvNetworkAddress(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrivateSrvNetworkAddressState, opts ...pulumi.ResourceOption) (*PrivateSrvNetworkAddress, error) {
	var resource PrivateSrvNetworkAddress
	err := ctx.ReadResource("alicloud:mongodb/privateSrvNetworkAddress:PrivateSrvNetworkAddress", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrivateSrvNetworkAddress resources.
type privateSrvNetworkAddressState struct {
	// The instance ID.
	DbInstanceId *string `pulumi:"dbInstanceId"`
	// Private network SRV highly available connection address
	PrivateSrvConnectionStringUri *string `pulumi:"privateSrvConnectionStringUri"`
}

type PrivateSrvNetworkAddressState struct {
	// The instance ID.
	DbInstanceId pulumi.StringPtrInput
	// Private network SRV highly available connection address
	PrivateSrvConnectionStringUri pulumi.StringPtrInput
}

func (PrivateSrvNetworkAddressState) ElementType() reflect.Type {
	return reflect.TypeOf((*privateSrvNetworkAddressState)(nil)).Elem()
}

type privateSrvNetworkAddressArgs struct {
	// The instance ID.
	DbInstanceId string `pulumi:"dbInstanceId"`
}

// The set of arguments for constructing a PrivateSrvNetworkAddress resource.
type PrivateSrvNetworkAddressArgs struct {
	// The instance ID.
	DbInstanceId pulumi.StringInput
}

func (PrivateSrvNetworkAddressArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*privateSrvNetworkAddressArgs)(nil)).Elem()
}

type PrivateSrvNetworkAddressInput interface {
	pulumi.Input

	ToPrivateSrvNetworkAddressOutput() PrivateSrvNetworkAddressOutput
	ToPrivateSrvNetworkAddressOutputWithContext(ctx context.Context) PrivateSrvNetworkAddressOutput
}

func (*PrivateSrvNetworkAddress) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateSrvNetworkAddress)(nil)).Elem()
}

func (i *PrivateSrvNetworkAddress) ToPrivateSrvNetworkAddressOutput() PrivateSrvNetworkAddressOutput {
	return i.ToPrivateSrvNetworkAddressOutputWithContext(context.Background())
}

func (i *PrivateSrvNetworkAddress) ToPrivateSrvNetworkAddressOutputWithContext(ctx context.Context) PrivateSrvNetworkAddressOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateSrvNetworkAddressOutput)
}

// PrivateSrvNetworkAddressArrayInput is an input type that accepts PrivateSrvNetworkAddressArray and PrivateSrvNetworkAddressArrayOutput values.
// You can construct a concrete instance of `PrivateSrvNetworkAddressArrayInput` via:
//
//	PrivateSrvNetworkAddressArray{ PrivateSrvNetworkAddressArgs{...} }
type PrivateSrvNetworkAddressArrayInput interface {
	pulumi.Input

	ToPrivateSrvNetworkAddressArrayOutput() PrivateSrvNetworkAddressArrayOutput
	ToPrivateSrvNetworkAddressArrayOutputWithContext(context.Context) PrivateSrvNetworkAddressArrayOutput
}

type PrivateSrvNetworkAddressArray []PrivateSrvNetworkAddressInput

func (PrivateSrvNetworkAddressArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateSrvNetworkAddress)(nil)).Elem()
}

func (i PrivateSrvNetworkAddressArray) ToPrivateSrvNetworkAddressArrayOutput() PrivateSrvNetworkAddressArrayOutput {
	return i.ToPrivateSrvNetworkAddressArrayOutputWithContext(context.Background())
}

func (i PrivateSrvNetworkAddressArray) ToPrivateSrvNetworkAddressArrayOutputWithContext(ctx context.Context) PrivateSrvNetworkAddressArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateSrvNetworkAddressArrayOutput)
}

// PrivateSrvNetworkAddressMapInput is an input type that accepts PrivateSrvNetworkAddressMap and PrivateSrvNetworkAddressMapOutput values.
// You can construct a concrete instance of `PrivateSrvNetworkAddressMapInput` via:
//
//	PrivateSrvNetworkAddressMap{ "key": PrivateSrvNetworkAddressArgs{...} }
type PrivateSrvNetworkAddressMapInput interface {
	pulumi.Input

	ToPrivateSrvNetworkAddressMapOutput() PrivateSrvNetworkAddressMapOutput
	ToPrivateSrvNetworkAddressMapOutputWithContext(context.Context) PrivateSrvNetworkAddressMapOutput
}

type PrivateSrvNetworkAddressMap map[string]PrivateSrvNetworkAddressInput

func (PrivateSrvNetworkAddressMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateSrvNetworkAddress)(nil)).Elem()
}

func (i PrivateSrvNetworkAddressMap) ToPrivateSrvNetworkAddressMapOutput() PrivateSrvNetworkAddressMapOutput {
	return i.ToPrivateSrvNetworkAddressMapOutputWithContext(context.Background())
}

func (i PrivateSrvNetworkAddressMap) ToPrivateSrvNetworkAddressMapOutputWithContext(ctx context.Context) PrivateSrvNetworkAddressMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateSrvNetworkAddressMapOutput)
}

type PrivateSrvNetworkAddressOutput struct{ *pulumi.OutputState }

func (PrivateSrvNetworkAddressOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateSrvNetworkAddress)(nil)).Elem()
}

func (o PrivateSrvNetworkAddressOutput) ToPrivateSrvNetworkAddressOutput() PrivateSrvNetworkAddressOutput {
	return o
}

func (o PrivateSrvNetworkAddressOutput) ToPrivateSrvNetworkAddressOutputWithContext(ctx context.Context) PrivateSrvNetworkAddressOutput {
	return o
}

// The instance ID.
func (o PrivateSrvNetworkAddressOutput) DbInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateSrvNetworkAddress) pulumi.StringOutput { return v.DbInstanceId }).(pulumi.StringOutput)
}

// Private network SRV highly available connection address
func (o PrivateSrvNetworkAddressOutput) PrivateSrvConnectionStringUri() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateSrvNetworkAddress) pulumi.StringOutput { return v.PrivateSrvConnectionStringUri }).(pulumi.StringOutput)
}

type PrivateSrvNetworkAddressArrayOutput struct{ *pulumi.OutputState }

func (PrivateSrvNetworkAddressArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateSrvNetworkAddress)(nil)).Elem()
}

func (o PrivateSrvNetworkAddressArrayOutput) ToPrivateSrvNetworkAddressArrayOutput() PrivateSrvNetworkAddressArrayOutput {
	return o
}

func (o PrivateSrvNetworkAddressArrayOutput) ToPrivateSrvNetworkAddressArrayOutputWithContext(ctx context.Context) PrivateSrvNetworkAddressArrayOutput {
	return o
}

func (o PrivateSrvNetworkAddressArrayOutput) Index(i pulumi.IntInput) PrivateSrvNetworkAddressOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PrivateSrvNetworkAddress {
		return vs[0].([]*PrivateSrvNetworkAddress)[vs[1].(int)]
	}).(PrivateSrvNetworkAddressOutput)
}

type PrivateSrvNetworkAddressMapOutput struct{ *pulumi.OutputState }

func (PrivateSrvNetworkAddressMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateSrvNetworkAddress)(nil)).Elem()
}

func (o PrivateSrvNetworkAddressMapOutput) ToPrivateSrvNetworkAddressMapOutput() PrivateSrvNetworkAddressMapOutput {
	return o
}

func (o PrivateSrvNetworkAddressMapOutput) ToPrivateSrvNetworkAddressMapOutputWithContext(ctx context.Context) PrivateSrvNetworkAddressMapOutput {
	return o
}

func (o PrivateSrvNetworkAddressMapOutput) MapIndex(k pulumi.StringInput) PrivateSrvNetworkAddressOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PrivateSrvNetworkAddress {
		return vs[0].(map[string]*PrivateSrvNetworkAddress)[vs[1].(string)]
	}).(PrivateSrvNetworkAddressOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateSrvNetworkAddressInput)(nil)).Elem(), &PrivateSrvNetworkAddress{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateSrvNetworkAddressArrayInput)(nil)).Elem(), PrivateSrvNetworkAddressArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateSrvNetworkAddressMapInput)(nil)).Elem(), PrivateSrvNetworkAddressMap{})
	pulumi.RegisterOutputType(PrivateSrvNetworkAddressOutput{})
	pulumi.RegisterOutputType(PrivateSrvNetworkAddressArrayOutput{})
	pulumi.RegisterOutputType(PrivateSrvNetworkAddressMapOutput{})
}
