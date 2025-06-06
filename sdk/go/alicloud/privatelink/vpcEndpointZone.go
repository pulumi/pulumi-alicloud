// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package privatelink

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Private Link Vpc Endpoint Zone resource.
//
// For information about Private Link Vpc Endpoint Zone and how to use it, see [What is Vpc Endpoint Zone](https://www.alibabacloud.com/help/en/privatelink/latest/api-privatelink-2020-04-15-addzonetovpcendpoint).
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/privatelink"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/slb"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf_example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			example, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleVpcEndpointService, err := privatelink.NewVpcEndpointService(ctx, "example", &privatelink.VpcEndpointServiceArgs{
//				ServiceDescription:   pulumi.String(name),
//				ConnectBandwidth:     pulumi.Int(103),
//				AutoAcceptConnection: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			exampleNetwork, err := vpc.NewNetwork(ctx, "example", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("10.0.0.0/8"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSwitch, err := vpc.NewSwitch(ctx, "example", &vpc.SwitchArgs{
//				VswitchName: pulumi.String(name),
//				CidrBlock:   pulumi.String("10.1.0.0/16"),
//				VpcId:       exampleNetwork.ID(),
//				ZoneId:      pulumi.String(example.Zones[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSecurityGroup, err := ecs.NewSecurityGroup(ctx, "example", &ecs.SecurityGroupArgs{
//				Name:  pulumi.String(name),
//				VpcId: exampleNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleApplicationLoadBalancer, err := slb.NewApplicationLoadBalancer(ctx, "example", &slb.ApplicationLoadBalancerArgs{
//				LoadBalancerName: pulumi.String(name),
//				VswitchId:        exampleSwitch.ID(),
//				LoadBalancerSpec: pulumi.String("slb.s2.small"),
//				AddressType:      pulumi.String("intranet"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleVpcEndpointServiceResource, err := privatelink.NewVpcEndpointServiceResource(ctx, "example", &privatelink.VpcEndpointServiceResourceArgs{
//				ServiceId:    exampleVpcEndpointService.ID(),
//				ResourceId:   exampleApplicationLoadBalancer.ID(),
//				ResourceType: pulumi.String("slb"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleVpcEndpoint, err := privatelink.NewVpcEndpoint(ctx, "example", &privatelink.VpcEndpointArgs{
//				ServiceId: exampleVpcEndpointServiceResource.ServiceId,
//				SecurityGroupIds: pulumi.StringArray{
//					exampleSecurityGroup.ID(),
//				},
//				VpcId:           exampleNetwork.ID(),
//				VpcEndpointName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = privatelink.NewVpcEndpointZone(ctx, "example", &privatelink.VpcEndpointZoneArgs{
//				EndpointId: exampleVpcEndpoint.ID(),
//				VswitchId:  exampleSwitch.ID(),
//				ZoneId:     pulumi.String(example.Zones[0].Id),
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
// Private Link Vpc Endpoint Zone can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:privatelink/vpcEndpointZone:VpcEndpointZone example <endpoint_id>:<zone_id>
// ```
type VpcEndpointZone struct {
	pulumi.CustomResourceState

	// Specifies whether to perform only a dry run, without performing the actual request. Valid values:
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// The endpoint ID.
	EndpointId pulumi.StringOutput `pulumi:"endpointId"`
	// The IP address of the endpoint ENI.
	EniIp pulumi.StringOutput `pulumi:"eniIp"`
	// (Available since v1.235.0) The ID of the region to which the endpoint service belongs.
	RegionId pulumi.StringOutput `pulumi:"regionId"`
	// The state of the zone.
	Status pulumi.StringOutput `pulumi:"status"`
	// The ID of the vSwitch in the zone.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
	// The zone ID.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewVpcEndpointZone registers a new resource with the given unique name, arguments, and options.
func NewVpcEndpointZone(ctx *pulumi.Context,
	name string, args *VpcEndpointZoneArgs, opts ...pulumi.ResourceOption) (*VpcEndpointZone, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EndpointId == nil {
		return nil, errors.New("invalid value for required argument 'EndpointId'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VpcEndpointZone
	err := ctx.RegisterResource("alicloud:privatelink/vpcEndpointZone:VpcEndpointZone", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVpcEndpointZone gets an existing VpcEndpointZone resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVpcEndpointZone(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VpcEndpointZoneState, opts ...pulumi.ResourceOption) (*VpcEndpointZone, error) {
	var resource VpcEndpointZone
	err := ctx.ReadResource("alicloud:privatelink/vpcEndpointZone:VpcEndpointZone", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VpcEndpointZone resources.
type vpcEndpointZoneState struct {
	// Specifies whether to perform only a dry run, without performing the actual request. Valid values:
	DryRun *bool `pulumi:"dryRun"`
	// The endpoint ID.
	EndpointId *string `pulumi:"endpointId"`
	// The IP address of the endpoint ENI.
	EniIp *string `pulumi:"eniIp"`
	// (Available since v1.235.0) The ID of the region to which the endpoint service belongs.
	RegionId *string `pulumi:"regionId"`
	// The state of the zone.
	Status *string `pulumi:"status"`
	// The ID of the vSwitch in the zone.
	VswitchId *string `pulumi:"vswitchId"`
	// The zone ID.
	ZoneId *string `pulumi:"zoneId"`
}

type VpcEndpointZoneState struct {
	// Specifies whether to perform only a dry run, without performing the actual request. Valid values:
	DryRun pulumi.BoolPtrInput
	// The endpoint ID.
	EndpointId pulumi.StringPtrInput
	// The IP address of the endpoint ENI.
	EniIp pulumi.StringPtrInput
	// (Available since v1.235.0) The ID of the region to which the endpoint service belongs.
	RegionId pulumi.StringPtrInput
	// The state of the zone.
	Status pulumi.StringPtrInput
	// The ID of the vSwitch in the zone.
	VswitchId pulumi.StringPtrInput
	// The zone ID.
	ZoneId pulumi.StringPtrInput
}

func (VpcEndpointZoneState) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcEndpointZoneState)(nil)).Elem()
}

type vpcEndpointZoneArgs struct {
	// Specifies whether to perform only a dry run, without performing the actual request. Valid values:
	DryRun *bool `pulumi:"dryRun"`
	// The endpoint ID.
	EndpointId string `pulumi:"endpointId"`
	// The IP address of the endpoint ENI.
	EniIp *string `pulumi:"eniIp"`
	// The ID of the vSwitch in the zone.
	VswitchId string `pulumi:"vswitchId"`
	// The zone ID.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a VpcEndpointZone resource.
type VpcEndpointZoneArgs struct {
	// Specifies whether to perform only a dry run, without performing the actual request. Valid values:
	DryRun pulumi.BoolPtrInput
	// The endpoint ID.
	EndpointId pulumi.StringInput
	// The IP address of the endpoint ENI.
	EniIp pulumi.StringPtrInput
	// The ID of the vSwitch in the zone.
	VswitchId pulumi.StringInput
	// The zone ID.
	ZoneId pulumi.StringPtrInput
}

func (VpcEndpointZoneArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcEndpointZoneArgs)(nil)).Elem()
}

type VpcEndpointZoneInput interface {
	pulumi.Input

	ToVpcEndpointZoneOutput() VpcEndpointZoneOutput
	ToVpcEndpointZoneOutputWithContext(ctx context.Context) VpcEndpointZoneOutput
}

func (*VpcEndpointZone) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcEndpointZone)(nil)).Elem()
}

func (i *VpcEndpointZone) ToVpcEndpointZoneOutput() VpcEndpointZoneOutput {
	return i.ToVpcEndpointZoneOutputWithContext(context.Background())
}

func (i *VpcEndpointZone) ToVpcEndpointZoneOutputWithContext(ctx context.Context) VpcEndpointZoneOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcEndpointZoneOutput)
}

// VpcEndpointZoneArrayInput is an input type that accepts VpcEndpointZoneArray and VpcEndpointZoneArrayOutput values.
// You can construct a concrete instance of `VpcEndpointZoneArrayInput` via:
//
//	VpcEndpointZoneArray{ VpcEndpointZoneArgs{...} }
type VpcEndpointZoneArrayInput interface {
	pulumi.Input

	ToVpcEndpointZoneArrayOutput() VpcEndpointZoneArrayOutput
	ToVpcEndpointZoneArrayOutputWithContext(context.Context) VpcEndpointZoneArrayOutput
}

type VpcEndpointZoneArray []VpcEndpointZoneInput

func (VpcEndpointZoneArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VpcEndpointZone)(nil)).Elem()
}

func (i VpcEndpointZoneArray) ToVpcEndpointZoneArrayOutput() VpcEndpointZoneArrayOutput {
	return i.ToVpcEndpointZoneArrayOutputWithContext(context.Background())
}

func (i VpcEndpointZoneArray) ToVpcEndpointZoneArrayOutputWithContext(ctx context.Context) VpcEndpointZoneArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcEndpointZoneArrayOutput)
}

// VpcEndpointZoneMapInput is an input type that accepts VpcEndpointZoneMap and VpcEndpointZoneMapOutput values.
// You can construct a concrete instance of `VpcEndpointZoneMapInput` via:
//
//	VpcEndpointZoneMap{ "key": VpcEndpointZoneArgs{...} }
type VpcEndpointZoneMapInput interface {
	pulumi.Input

	ToVpcEndpointZoneMapOutput() VpcEndpointZoneMapOutput
	ToVpcEndpointZoneMapOutputWithContext(context.Context) VpcEndpointZoneMapOutput
}

type VpcEndpointZoneMap map[string]VpcEndpointZoneInput

func (VpcEndpointZoneMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VpcEndpointZone)(nil)).Elem()
}

func (i VpcEndpointZoneMap) ToVpcEndpointZoneMapOutput() VpcEndpointZoneMapOutput {
	return i.ToVpcEndpointZoneMapOutputWithContext(context.Background())
}

func (i VpcEndpointZoneMap) ToVpcEndpointZoneMapOutputWithContext(ctx context.Context) VpcEndpointZoneMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcEndpointZoneMapOutput)
}

type VpcEndpointZoneOutput struct{ *pulumi.OutputState }

func (VpcEndpointZoneOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcEndpointZone)(nil)).Elem()
}

func (o VpcEndpointZoneOutput) ToVpcEndpointZoneOutput() VpcEndpointZoneOutput {
	return o
}

func (o VpcEndpointZoneOutput) ToVpcEndpointZoneOutputWithContext(ctx context.Context) VpcEndpointZoneOutput {
	return o
}

// Specifies whether to perform only a dry run, without performing the actual request. Valid values:
func (o VpcEndpointZoneOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VpcEndpointZone) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// The endpoint ID.
func (o VpcEndpointZoneOutput) EndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcEndpointZone) pulumi.StringOutput { return v.EndpointId }).(pulumi.StringOutput)
}

// The IP address of the endpoint ENI.
func (o VpcEndpointZoneOutput) EniIp() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcEndpointZone) pulumi.StringOutput { return v.EniIp }).(pulumi.StringOutput)
}

// (Available since v1.235.0) The ID of the region to which the endpoint service belongs.
func (o VpcEndpointZoneOutput) RegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcEndpointZone) pulumi.StringOutput { return v.RegionId }).(pulumi.StringOutput)
}

// The state of the zone.
func (o VpcEndpointZoneOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcEndpointZone) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The ID of the vSwitch in the zone.
func (o VpcEndpointZoneOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcEndpointZone) pulumi.StringOutput { return v.VswitchId }).(pulumi.StringOutput)
}

// The zone ID.
func (o VpcEndpointZoneOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcEndpointZone) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type VpcEndpointZoneArrayOutput struct{ *pulumi.OutputState }

func (VpcEndpointZoneArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VpcEndpointZone)(nil)).Elem()
}

func (o VpcEndpointZoneArrayOutput) ToVpcEndpointZoneArrayOutput() VpcEndpointZoneArrayOutput {
	return o
}

func (o VpcEndpointZoneArrayOutput) ToVpcEndpointZoneArrayOutputWithContext(ctx context.Context) VpcEndpointZoneArrayOutput {
	return o
}

func (o VpcEndpointZoneArrayOutput) Index(i pulumi.IntInput) VpcEndpointZoneOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VpcEndpointZone {
		return vs[0].([]*VpcEndpointZone)[vs[1].(int)]
	}).(VpcEndpointZoneOutput)
}

type VpcEndpointZoneMapOutput struct{ *pulumi.OutputState }

func (VpcEndpointZoneMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VpcEndpointZone)(nil)).Elem()
}

func (o VpcEndpointZoneMapOutput) ToVpcEndpointZoneMapOutput() VpcEndpointZoneMapOutput {
	return o
}

func (o VpcEndpointZoneMapOutput) ToVpcEndpointZoneMapOutputWithContext(ctx context.Context) VpcEndpointZoneMapOutput {
	return o
}

func (o VpcEndpointZoneMapOutput) MapIndex(k pulumi.StringInput) VpcEndpointZoneOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VpcEndpointZone {
		return vs[0].(map[string]*VpcEndpointZone)[vs[1].(string)]
	}).(VpcEndpointZoneOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VpcEndpointZoneInput)(nil)).Elem(), &VpcEndpointZone{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcEndpointZoneArrayInput)(nil)).Elem(), VpcEndpointZoneArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcEndpointZoneMapInput)(nil)).Elem(), VpcEndpointZoneMap{})
	pulumi.RegisterOutputType(VpcEndpointZoneOutput{})
	pulumi.RegisterOutputType(VpcEndpointZoneArrayOutput{})
	pulumi.RegisterOutputType(VpcEndpointZoneMapOutput{})
}
