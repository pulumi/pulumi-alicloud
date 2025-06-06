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

// Provides a forward resource.
//
// > **NOTE:** Available since v1.40.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "forward-entry-example-name"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_default, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "default", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("172.16.0.0/12"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "default", &vpc.SwitchArgs{
//				VpcId:       defaultNetwork.ID(),
//				CidrBlock:   pulumi.String("172.16.0.0/21"),
//				ZoneId:      pulumi.String(_default.Zones[0].Id),
//				VswitchName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			defaultNatGateway, err := vpc.NewNatGateway(ctx, "default", &vpc.NatGatewayArgs{
//				VpcId:              defaultNetwork.ID(),
//				InternetChargeType: pulumi.String("PayByLcu"),
//				NatGatewayName:     pulumi.String(name),
//				NatType:            pulumi.String("Enhanced"),
//				VswitchId:          defaultSwitch.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			defaultEipAddress, err := ecs.NewEipAddress(ctx, "default", &ecs.EipAddressArgs{
//				AddressName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ecs.NewEipAssociation(ctx, "default", &ecs.EipAssociationArgs{
//				AllocationId: defaultEipAddress.ID(),
//				InstanceId:   defaultNatGateway.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewForwardEntry(ctx, "default", &vpc.ForwardEntryArgs{
//				ForwardTableId: defaultNatGateway.ForwardTableIds,
//				ExternalIp:     defaultEipAddress.IpAddress,
//				ExternalPort:   pulumi.String("80"),
//				IpProtocol:     pulumi.String("tcp"),
//				InternalIp:     pulumi.String("172.16.0.3"),
//				InternalPort:   pulumi.String("8080"),
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
// Forward Entry can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:vpc/forwardEntry:ForwardEntry foo ftb-1aece3:fwd-232ce2
// ```
type ForwardEntry struct {
	pulumi.CustomResourceState

	// The external ip address, the ip must along bandwidth package public ip which `vpc.NatGateway` argument `bandwidthPackages`.
	ExternalIp pulumi.StringOutput `pulumi:"externalIp"`
	// The external port, valid value is 1~65535|any.
	ExternalPort pulumi.StringOutput `pulumi:"externalPort"`
	// The id of the forward entry on the server.
	ForwardEntryId pulumi.StringOutput `pulumi:"forwardEntryId"`
	// The name of forward entry.
	ForwardEntryName pulumi.StringOutput `pulumi:"forwardEntryName"`
	// The value can get from `vpc.NatGateway` Attributes "forwardTableIds".
	ForwardTableId pulumi.StringOutput `pulumi:"forwardTableId"`
	// The internal ip, must a private ip.
	InternalIp pulumi.StringOutput `pulumi:"internalIp"`
	// The internal port, valid value is 1~65535|any.
	InternalPort pulumi.StringOutput `pulumi:"internalPort"`
	// The ip protocol, valid value is tcp|udp|any.
	IpProtocol pulumi.StringOutput `pulumi:"ipProtocol"`
	// Field `name` has been deprecated from provider version 1.119.1. New field `forwardEntryName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies whether to remove limits on the port range. Default value is `false`.
	//
	// > **NOTE:** A SNAT entry and a DNAT entry may use the same public IP address. If you want to specify a port number greater than 1024 in this case, set `portBreak` to true.
	PortBreak pulumi.BoolPtrOutput `pulumi:"portBreak"`
	// (Available since v1.119.1) The status of forward entry.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewForwardEntry registers a new resource with the given unique name, arguments, and options.
func NewForwardEntry(ctx *pulumi.Context,
	name string, args *ForwardEntryArgs, opts ...pulumi.ResourceOption) (*ForwardEntry, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ExternalIp == nil {
		return nil, errors.New("invalid value for required argument 'ExternalIp'")
	}
	if args.ExternalPort == nil {
		return nil, errors.New("invalid value for required argument 'ExternalPort'")
	}
	if args.ForwardTableId == nil {
		return nil, errors.New("invalid value for required argument 'ForwardTableId'")
	}
	if args.InternalIp == nil {
		return nil, errors.New("invalid value for required argument 'InternalIp'")
	}
	if args.InternalPort == nil {
		return nil, errors.New("invalid value for required argument 'InternalPort'")
	}
	if args.IpProtocol == nil {
		return nil, errors.New("invalid value for required argument 'IpProtocol'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ForwardEntry
	err := ctx.RegisterResource("alicloud:vpc/forwardEntry:ForwardEntry", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetForwardEntry gets an existing ForwardEntry resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetForwardEntry(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ForwardEntryState, opts ...pulumi.ResourceOption) (*ForwardEntry, error) {
	var resource ForwardEntry
	err := ctx.ReadResource("alicloud:vpc/forwardEntry:ForwardEntry", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ForwardEntry resources.
type forwardEntryState struct {
	// The external ip address, the ip must along bandwidth package public ip which `vpc.NatGateway` argument `bandwidthPackages`.
	ExternalIp *string `pulumi:"externalIp"`
	// The external port, valid value is 1~65535|any.
	ExternalPort *string `pulumi:"externalPort"`
	// The id of the forward entry on the server.
	ForwardEntryId *string `pulumi:"forwardEntryId"`
	// The name of forward entry.
	ForwardEntryName *string `pulumi:"forwardEntryName"`
	// The value can get from `vpc.NatGateway` Attributes "forwardTableIds".
	ForwardTableId *string `pulumi:"forwardTableId"`
	// The internal ip, must a private ip.
	InternalIp *string `pulumi:"internalIp"`
	// The internal port, valid value is 1~65535|any.
	InternalPort *string `pulumi:"internalPort"`
	// The ip protocol, valid value is tcp|udp|any.
	IpProtocol *string `pulumi:"ipProtocol"`
	// Field `name` has been deprecated from provider version 1.119.1. New field `forwardEntryName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead.
	Name *string `pulumi:"name"`
	// Specifies whether to remove limits on the port range. Default value is `false`.
	//
	// > **NOTE:** A SNAT entry and a DNAT entry may use the same public IP address. If you want to specify a port number greater than 1024 in this case, set `portBreak` to true.
	PortBreak *bool `pulumi:"portBreak"`
	// (Available since v1.119.1) The status of forward entry.
	Status *string `pulumi:"status"`
}

type ForwardEntryState struct {
	// The external ip address, the ip must along bandwidth package public ip which `vpc.NatGateway` argument `bandwidthPackages`.
	ExternalIp pulumi.StringPtrInput
	// The external port, valid value is 1~65535|any.
	ExternalPort pulumi.StringPtrInput
	// The id of the forward entry on the server.
	ForwardEntryId pulumi.StringPtrInput
	// The name of forward entry.
	ForwardEntryName pulumi.StringPtrInput
	// The value can get from `vpc.NatGateway` Attributes "forwardTableIds".
	ForwardTableId pulumi.StringPtrInput
	// The internal ip, must a private ip.
	InternalIp pulumi.StringPtrInput
	// The internal port, valid value is 1~65535|any.
	InternalPort pulumi.StringPtrInput
	// The ip protocol, valid value is tcp|udp|any.
	IpProtocol pulumi.StringPtrInput
	// Field `name` has been deprecated from provider version 1.119.1. New field `forwardEntryName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead.
	Name pulumi.StringPtrInput
	// Specifies whether to remove limits on the port range. Default value is `false`.
	//
	// > **NOTE:** A SNAT entry and a DNAT entry may use the same public IP address. If you want to specify a port number greater than 1024 in this case, set `portBreak` to true.
	PortBreak pulumi.BoolPtrInput
	// (Available since v1.119.1) The status of forward entry.
	Status pulumi.StringPtrInput
}

func (ForwardEntryState) ElementType() reflect.Type {
	return reflect.TypeOf((*forwardEntryState)(nil)).Elem()
}

type forwardEntryArgs struct {
	// The external ip address, the ip must along bandwidth package public ip which `vpc.NatGateway` argument `bandwidthPackages`.
	ExternalIp string `pulumi:"externalIp"`
	// The external port, valid value is 1~65535|any.
	ExternalPort string `pulumi:"externalPort"`
	// The name of forward entry.
	ForwardEntryName *string `pulumi:"forwardEntryName"`
	// The value can get from `vpc.NatGateway` Attributes "forwardTableIds".
	ForwardTableId string `pulumi:"forwardTableId"`
	// The internal ip, must a private ip.
	InternalIp string `pulumi:"internalIp"`
	// The internal port, valid value is 1~65535|any.
	InternalPort string `pulumi:"internalPort"`
	// The ip protocol, valid value is tcp|udp|any.
	IpProtocol string `pulumi:"ipProtocol"`
	// Field `name` has been deprecated from provider version 1.119.1. New field `forwardEntryName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead.
	Name *string `pulumi:"name"`
	// Specifies whether to remove limits on the port range. Default value is `false`.
	//
	// > **NOTE:** A SNAT entry and a DNAT entry may use the same public IP address. If you want to specify a port number greater than 1024 in this case, set `portBreak` to true.
	PortBreak *bool `pulumi:"portBreak"`
}

// The set of arguments for constructing a ForwardEntry resource.
type ForwardEntryArgs struct {
	// The external ip address, the ip must along bandwidth package public ip which `vpc.NatGateway` argument `bandwidthPackages`.
	ExternalIp pulumi.StringInput
	// The external port, valid value is 1~65535|any.
	ExternalPort pulumi.StringInput
	// The name of forward entry.
	ForwardEntryName pulumi.StringPtrInput
	// The value can get from `vpc.NatGateway` Attributes "forwardTableIds".
	ForwardTableId pulumi.StringInput
	// The internal ip, must a private ip.
	InternalIp pulumi.StringInput
	// The internal port, valid value is 1~65535|any.
	InternalPort pulumi.StringInput
	// The ip protocol, valid value is tcp|udp|any.
	IpProtocol pulumi.StringInput
	// Field `name` has been deprecated from provider version 1.119.1. New field `forwardEntryName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead.
	Name pulumi.StringPtrInput
	// Specifies whether to remove limits on the port range. Default value is `false`.
	//
	// > **NOTE:** A SNAT entry and a DNAT entry may use the same public IP address. If you want to specify a port number greater than 1024 in this case, set `portBreak` to true.
	PortBreak pulumi.BoolPtrInput
}

func (ForwardEntryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*forwardEntryArgs)(nil)).Elem()
}

type ForwardEntryInput interface {
	pulumi.Input

	ToForwardEntryOutput() ForwardEntryOutput
	ToForwardEntryOutputWithContext(ctx context.Context) ForwardEntryOutput
}

func (*ForwardEntry) ElementType() reflect.Type {
	return reflect.TypeOf((**ForwardEntry)(nil)).Elem()
}

func (i *ForwardEntry) ToForwardEntryOutput() ForwardEntryOutput {
	return i.ToForwardEntryOutputWithContext(context.Background())
}

func (i *ForwardEntry) ToForwardEntryOutputWithContext(ctx context.Context) ForwardEntryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ForwardEntryOutput)
}

// ForwardEntryArrayInput is an input type that accepts ForwardEntryArray and ForwardEntryArrayOutput values.
// You can construct a concrete instance of `ForwardEntryArrayInput` via:
//
//	ForwardEntryArray{ ForwardEntryArgs{...} }
type ForwardEntryArrayInput interface {
	pulumi.Input

	ToForwardEntryArrayOutput() ForwardEntryArrayOutput
	ToForwardEntryArrayOutputWithContext(context.Context) ForwardEntryArrayOutput
}

type ForwardEntryArray []ForwardEntryInput

func (ForwardEntryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ForwardEntry)(nil)).Elem()
}

func (i ForwardEntryArray) ToForwardEntryArrayOutput() ForwardEntryArrayOutput {
	return i.ToForwardEntryArrayOutputWithContext(context.Background())
}

func (i ForwardEntryArray) ToForwardEntryArrayOutputWithContext(ctx context.Context) ForwardEntryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ForwardEntryArrayOutput)
}

// ForwardEntryMapInput is an input type that accepts ForwardEntryMap and ForwardEntryMapOutput values.
// You can construct a concrete instance of `ForwardEntryMapInput` via:
//
//	ForwardEntryMap{ "key": ForwardEntryArgs{...} }
type ForwardEntryMapInput interface {
	pulumi.Input

	ToForwardEntryMapOutput() ForwardEntryMapOutput
	ToForwardEntryMapOutputWithContext(context.Context) ForwardEntryMapOutput
}

type ForwardEntryMap map[string]ForwardEntryInput

func (ForwardEntryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ForwardEntry)(nil)).Elem()
}

func (i ForwardEntryMap) ToForwardEntryMapOutput() ForwardEntryMapOutput {
	return i.ToForwardEntryMapOutputWithContext(context.Background())
}

func (i ForwardEntryMap) ToForwardEntryMapOutputWithContext(ctx context.Context) ForwardEntryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ForwardEntryMapOutput)
}

type ForwardEntryOutput struct{ *pulumi.OutputState }

func (ForwardEntryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ForwardEntry)(nil)).Elem()
}

func (o ForwardEntryOutput) ToForwardEntryOutput() ForwardEntryOutput {
	return o
}

func (o ForwardEntryOutput) ToForwardEntryOutputWithContext(ctx context.Context) ForwardEntryOutput {
	return o
}

// The external ip address, the ip must along bandwidth package public ip which `vpc.NatGateway` argument `bandwidthPackages`.
func (o ForwardEntryOutput) ExternalIp() pulumi.StringOutput {
	return o.ApplyT(func(v *ForwardEntry) pulumi.StringOutput { return v.ExternalIp }).(pulumi.StringOutput)
}

// The external port, valid value is 1~65535|any.
func (o ForwardEntryOutput) ExternalPort() pulumi.StringOutput {
	return o.ApplyT(func(v *ForwardEntry) pulumi.StringOutput { return v.ExternalPort }).(pulumi.StringOutput)
}

// The id of the forward entry on the server.
func (o ForwardEntryOutput) ForwardEntryId() pulumi.StringOutput {
	return o.ApplyT(func(v *ForwardEntry) pulumi.StringOutput { return v.ForwardEntryId }).(pulumi.StringOutput)
}

// The name of forward entry.
func (o ForwardEntryOutput) ForwardEntryName() pulumi.StringOutput {
	return o.ApplyT(func(v *ForwardEntry) pulumi.StringOutput { return v.ForwardEntryName }).(pulumi.StringOutput)
}

// The value can get from `vpc.NatGateway` Attributes "forwardTableIds".
func (o ForwardEntryOutput) ForwardTableId() pulumi.StringOutput {
	return o.ApplyT(func(v *ForwardEntry) pulumi.StringOutput { return v.ForwardTableId }).(pulumi.StringOutput)
}

// The internal ip, must a private ip.
func (o ForwardEntryOutput) InternalIp() pulumi.StringOutput {
	return o.ApplyT(func(v *ForwardEntry) pulumi.StringOutput { return v.InternalIp }).(pulumi.StringOutput)
}

// The internal port, valid value is 1~65535|any.
func (o ForwardEntryOutput) InternalPort() pulumi.StringOutput {
	return o.ApplyT(func(v *ForwardEntry) pulumi.StringOutput { return v.InternalPort }).(pulumi.StringOutput)
}

// The ip protocol, valid value is tcp|udp|any.
func (o ForwardEntryOutput) IpProtocol() pulumi.StringOutput {
	return o.ApplyT(func(v *ForwardEntry) pulumi.StringOutput { return v.IpProtocol }).(pulumi.StringOutput)
}

// Field `name` has been deprecated from provider version 1.119.1. New field `forwardEntryName` instead.
//
// Deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead.
func (o ForwardEntryOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ForwardEntry) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies whether to remove limits on the port range. Default value is `false`.
//
// > **NOTE:** A SNAT entry and a DNAT entry may use the same public IP address. If you want to specify a port number greater than 1024 in this case, set `portBreak` to true.
func (o ForwardEntryOutput) PortBreak() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ForwardEntry) pulumi.BoolPtrOutput { return v.PortBreak }).(pulumi.BoolPtrOutput)
}

// (Available since v1.119.1) The status of forward entry.
func (o ForwardEntryOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ForwardEntry) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type ForwardEntryArrayOutput struct{ *pulumi.OutputState }

func (ForwardEntryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ForwardEntry)(nil)).Elem()
}

func (o ForwardEntryArrayOutput) ToForwardEntryArrayOutput() ForwardEntryArrayOutput {
	return o
}

func (o ForwardEntryArrayOutput) ToForwardEntryArrayOutputWithContext(ctx context.Context) ForwardEntryArrayOutput {
	return o
}

func (o ForwardEntryArrayOutput) Index(i pulumi.IntInput) ForwardEntryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ForwardEntry {
		return vs[0].([]*ForwardEntry)[vs[1].(int)]
	}).(ForwardEntryOutput)
}

type ForwardEntryMapOutput struct{ *pulumi.OutputState }

func (ForwardEntryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ForwardEntry)(nil)).Elem()
}

func (o ForwardEntryMapOutput) ToForwardEntryMapOutput() ForwardEntryMapOutput {
	return o
}

func (o ForwardEntryMapOutput) ToForwardEntryMapOutputWithContext(ctx context.Context) ForwardEntryMapOutput {
	return o
}

func (o ForwardEntryMapOutput) MapIndex(k pulumi.StringInput) ForwardEntryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ForwardEntry {
		return vs[0].(map[string]*ForwardEntry)[vs[1].(string)]
	}).(ForwardEntryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ForwardEntryInput)(nil)).Elem(), &ForwardEntry{})
	pulumi.RegisterInputType(reflect.TypeOf((*ForwardEntryArrayInput)(nil)).Elem(), ForwardEntryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ForwardEntryMapInput)(nil)).Elem(), ForwardEntryMap{})
	pulumi.RegisterOutputType(ForwardEntryOutput{})
	pulumi.RegisterOutputType(ForwardEntryArrayOutput{})
	pulumi.RegisterOutputType(ForwardEntryMapOutput{})
}
