// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudfirewall

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloud Firewall Vpc Cen Tr Firewall resource.
//
// VPC firewall Cloud Enterprise Network Enterprise Edition.
//
// For information about Cloud Firewall Vpc Cen Tr Firewall and how to use it, see [What is Vpc Cen Tr Firewall](https://www.alibabacloud.com/help/en/cloud-firewall/cloudfirewall/developer-reference/api-cloudfw-2017-12-07-createtrfirewallv2).
//
// > **NOTE:** Available since v1.228.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cloudfirewall"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi-time/sdk/go/time"
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
//			description := "Created by Terraform"
//			if param := cfg.Get("description"); param != "" {
//				description = param
//			}
//			firewallName := "tf-example"
//			if param := cfg.Get("firewallName"); param != "" {
//				firewallName = param
//			}
//			trAttachmentMasterCidr := "192.168.3.192/26"
//			if param := cfg.Get("trAttachmentMasterCidr"); param != "" {
//				trAttachmentMasterCidr = param
//			}
//			firewallSubnetCidr := "192.168.3.0/25"
//			if param := cfg.Get("firewallSubnetCidr"); param != "" {
//				firewallSubnetCidr = param
//			}
//			region := "cn-hangzhou"
//			if param := cfg.Get("region"); param != "" {
//				region = param
//			}
//			trAttachmentSlaveCidr := "192.168.3.128/26"
//			if param := cfg.Get("trAttachmentSlaveCidr"); param != "" {
//				trAttachmentSlaveCidr = param
//			}
//			firewallVpcCidr := "192.168.3.0/24"
//			if param := cfg.Get("firewallVpcCidr"); param != "" {
//				firewallVpcCidr = param
//			}
//			zone1 := "cn-hangzhou-h"
//			if param := cfg.Get("zone1"); param != "" {
//				zone1 = param
//			}
//			firewallNameUpdate := "tf-example-1"
//			if param := cfg.Get("firewallNameUpdate"); param != "" {
//				firewallNameUpdate = param
//			}
//			zone2 := "cn-hangzhou-i"
//			if param := cfg.Get("zone2"); param != "" {
//				zone2 = param
//			}
//			_default, err := cen.GetTransitRouterAvailableResources(ctx, &cen.GetTransitRouterAvailableResourcesArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			cen, err := cen.NewInstance(ctx, "cen", &cen.InstanceArgs{
//				Description:     pulumi.String("terraform example"),
//				CenInstanceName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			tr, err := cen.NewTransitRouter(ctx, "tr", &cen.TransitRouterArgs{
//				TransitRouterName:        pulumi.String(name),
//				TransitRouterDescription: pulumi.String("tr-created-by-terraform"),
//				CenId:                    cen.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			vpc1, err := vpc.NewNetwork(ctx, "vpc1", &vpc.NetworkArgs{
//				Description: pulumi.String("created by terraform"),
//				CidrBlock:   pulumi.String("192.168.1.0/24"),
//				VpcName:     pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			vpc1vsw1, err := vpc.NewSwitch(ctx, "vpc1vsw1", &vpc.SwitchArgs{
//				CidrBlock:   pulumi.String("192.168.1.0/25"),
//				VswitchName: pulumi.String(name),
//				VpcId:       vpc1.ID(),
//				ZoneId:      pulumi.String(_default.Resources[0].MasterZones[1]),
//			})
//			if err != nil {
//				return err
//			}
//			vpc1vsw2, err := vpc.NewSwitch(ctx, "vpc1vsw2", &vpc.SwitchArgs{
//				VpcId:       vpc1.ID(),
//				CidrBlock:   pulumi.String("192.168.1.128/26"),
//				VswitchName: pulumi.String(name),
//				ZoneId:      pulumi.String(_default.Resources[0].MasterZones[2]),
//			})
//			if err != nil {
//				return err
//			}
//			foo, err := vpc.NewRouteTable(ctx, "foo", &vpc.RouteTableArgs{
//				VpcId:          vpc1.ID(),
//				RouteTableName: pulumi.String(name),
//				Description:    pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			tr_vpc1, err := cen.NewTransitRouterVpcAttachment(ctx, "tr-vpc1", &cen.TransitRouterVpcAttachmentArgs{
//				ZoneMappings: cen.TransitRouterVpcAttachmentZoneMappingArray{
//					&cen.TransitRouterVpcAttachmentZoneMappingArgs{
//						VswitchId: vpc1vsw1.ID(),
//						ZoneId:    pulumi.String(_default.Resources[0].MasterZones[1]),
//					},
//					&cen.TransitRouterVpcAttachmentZoneMappingArgs{
//						ZoneId:    pulumi.String(_default.Resources[0].MasterZones[2]),
//						VswitchId: vpc1vsw2.ID(),
//					},
//				},
//				VpcId:           vpc1.ID(),
//				CenId:           cen.ID(),
//				TransitRouterId: tr.TransitRouterId,
//			}, pulumi.DependsOn([]pulumi.Resource{
//				foo,
//			}))
//			if err != nil {
//				return err
//			}
//			wait10Minutes, err := time.NewSleep(ctx, "wait_10_minutes", &time.SleepArgs{
//				CreateDuration: "10m",
//			}, pulumi.DependsOn([]pulumi.Resource{
//				tr_vpc1,
//			}))
//			if err != nil {
//				return err
//			}
//			_, err = cloudfirewall.NewVpcCenTrFirewall(ctx, "default", &cloudfirewall.VpcCenTrFirewallArgs{
//				CenId:                  tr_vpc1.CenId,
//				FirewallName:           pulumi.String(name),
//				FirewallSubnetCidr:     pulumi.String(firewallSubnetCidr),
//				TrAttachmentSlaveCidr:  pulumi.String(trAttachmentSlaveCidr),
//				FirewallDescription:    pulumi.String("VpcCenTrFirewall created by terraform"),
//				RegionNo:               pulumi.String(region),
//				TrAttachmentMasterCidr: pulumi.String(trAttachmentMasterCidr),
//				FirewallVpcCidr:        pulumi.String(firewallVpcCidr),
//				TransitRouterId:        tr.TransitRouterId,
//				RouteMode:              pulumi.String("managed"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				wait10Minutes,
//			}))
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
// Cloud Firewall Vpc Cen Tr Firewall can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:cloudfirewall/vpcCenTrFirewall:VpcCenTrFirewall example <id>
// ```
type VpcCenTrFirewall struct {
	pulumi.CustomResourceState

	// The ID of the CEN instance.
	CenId pulumi.StringOutput `pulumi:"cenId"`
	// Firewall description.
	FirewallDescription pulumi.StringPtrOutput `pulumi:"firewallDescription"`
	// The name of Cloud Firewall.
	FirewallName pulumi.StringOutput `pulumi:"firewallName"`
	// Required in automatic mode, the CIDR of subnet used to store the firewall ENI in the firewall VPC.
	FirewallSubnetCidr pulumi.StringOutput `pulumi:"firewallSubnetCidr"`
	// Required in automatic mode,  th CIDR of firewall VPC.
	FirewallVpcCidr pulumi.StringOutput `pulumi:"firewallVpcCidr"`
	// The region ID of the transit router instance.
	RegionNo pulumi.StringOutput `pulumi:"regionNo"`
	// The routing pattern. Value: managed: indicates automatic mode
	RouteMode pulumi.StringOutput `pulumi:"routeMode"`
	// Firewall status. Value:
	Status pulumi.StringOutput `pulumi:"status"`
	// Required in automatic mode, the primary CIDR of network used to connect to the TR in the firewall VPC.
	TrAttachmentMasterCidr pulumi.StringOutput `pulumi:"trAttachmentMasterCidr"`
	// The primary zone of the switch.
	TrAttachmentMasterZone pulumi.StringPtrOutput `pulumi:"trAttachmentMasterZone"`
	// Required in automatic mode, the the secondary CIDR of the subnet in the firewall VPC used to connect to TR.
	TrAttachmentSlaveCidr pulumi.StringOutput `pulumi:"trAttachmentSlaveCidr"`
	// Switch standby area.
	TrAttachmentSlaveZone pulumi.StringPtrOutput `pulumi:"trAttachmentSlaveZone"`
	// The ID of the transit router instance.
	TransitRouterId pulumi.StringOutput `pulumi:"transitRouterId"`
}

// NewVpcCenTrFirewall registers a new resource with the given unique name, arguments, and options.
func NewVpcCenTrFirewall(ctx *pulumi.Context,
	name string, args *VpcCenTrFirewallArgs, opts ...pulumi.ResourceOption) (*VpcCenTrFirewall, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CenId == nil {
		return nil, errors.New("invalid value for required argument 'CenId'")
	}
	if args.FirewallName == nil {
		return nil, errors.New("invalid value for required argument 'FirewallName'")
	}
	if args.FirewallSubnetCidr == nil {
		return nil, errors.New("invalid value for required argument 'FirewallSubnetCidr'")
	}
	if args.FirewallVpcCidr == nil {
		return nil, errors.New("invalid value for required argument 'FirewallVpcCidr'")
	}
	if args.RegionNo == nil {
		return nil, errors.New("invalid value for required argument 'RegionNo'")
	}
	if args.RouteMode == nil {
		return nil, errors.New("invalid value for required argument 'RouteMode'")
	}
	if args.TrAttachmentMasterCidr == nil {
		return nil, errors.New("invalid value for required argument 'TrAttachmentMasterCidr'")
	}
	if args.TrAttachmentSlaveCidr == nil {
		return nil, errors.New("invalid value for required argument 'TrAttachmentSlaveCidr'")
	}
	if args.TransitRouterId == nil {
		return nil, errors.New("invalid value for required argument 'TransitRouterId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VpcCenTrFirewall
	err := ctx.RegisterResource("alicloud:cloudfirewall/vpcCenTrFirewall:VpcCenTrFirewall", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVpcCenTrFirewall gets an existing VpcCenTrFirewall resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVpcCenTrFirewall(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VpcCenTrFirewallState, opts ...pulumi.ResourceOption) (*VpcCenTrFirewall, error) {
	var resource VpcCenTrFirewall
	err := ctx.ReadResource("alicloud:cloudfirewall/vpcCenTrFirewall:VpcCenTrFirewall", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VpcCenTrFirewall resources.
type vpcCenTrFirewallState struct {
	// The ID of the CEN instance.
	CenId *string `pulumi:"cenId"`
	// Firewall description.
	FirewallDescription *string `pulumi:"firewallDescription"`
	// The name of Cloud Firewall.
	FirewallName *string `pulumi:"firewallName"`
	// Required in automatic mode, the CIDR of subnet used to store the firewall ENI in the firewall VPC.
	FirewallSubnetCidr *string `pulumi:"firewallSubnetCidr"`
	// Required in automatic mode,  th CIDR of firewall VPC.
	FirewallVpcCidr *string `pulumi:"firewallVpcCidr"`
	// The region ID of the transit router instance.
	RegionNo *string `pulumi:"regionNo"`
	// The routing pattern. Value: managed: indicates automatic mode
	RouteMode *string `pulumi:"routeMode"`
	// Firewall status. Value:
	Status *string `pulumi:"status"`
	// Required in automatic mode, the primary CIDR of network used to connect to the TR in the firewall VPC.
	TrAttachmentMasterCidr *string `pulumi:"trAttachmentMasterCidr"`
	// The primary zone of the switch.
	TrAttachmentMasterZone *string `pulumi:"trAttachmentMasterZone"`
	// Required in automatic mode, the the secondary CIDR of the subnet in the firewall VPC used to connect to TR.
	TrAttachmentSlaveCidr *string `pulumi:"trAttachmentSlaveCidr"`
	// Switch standby area.
	TrAttachmentSlaveZone *string `pulumi:"trAttachmentSlaveZone"`
	// The ID of the transit router instance.
	TransitRouterId *string `pulumi:"transitRouterId"`
}

type VpcCenTrFirewallState struct {
	// The ID of the CEN instance.
	CenId pulumi.StringPtrInput
	// Firewall description.
	FirewallDescription pulumi.StringPtrInput
	// The name of Cloud Firewall.
	FirewallName pulumi.StringPtrInput
	// Required in automatic mode, the CIDR of subnet used to store the firewall ENI in the firewall VPC.
	FirewallSubnetCidr pulumi.StringPtrInput
	// Required in automatic mode,  th CIDR of firewall VPC.
	FirewallVpcCidr pulumi.StringPtrInput
	// The region ID of the transit router instance.
	RegionNo pulumi.StringPtrInput
	// The routing pattern. Value: managed: indicates automatic mode
	RouteMode pulumi.StringPtrInput
	// Firewall status. Value:
	Status pulumi.StringPtrInput
	// Required in automatic mode, the primary CIDR of network used to connect to the TR in the firewall VPC.
	TrAttachmentMasterCidr pulumi.StringPtrInput
	// The primary zone of the switch.
	TrAttachmentMasterZone pulumi.StringPtrInput
	// Required in automatic mode, the the secondary CIDR of the subnet in the firewall VPC used to connect to TR.
	TrAttachmentSlaveCidr pulumi.StringPtrInput
	// Switch standby area.
	TrAttachmentSlaveZone pulumi.StringPtrInput
	// The ID of the transit router instance.
	TransitRouterId pulumi.StringPtrInput
}

func (VpcCenTrFirewallState) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcCenTrFirewallState)(nil)).Elem()
}

type vpcCenTrFirewallArgs struct {
	// The ID of the CEN instance.
	CenId string `pulumi:"cenId"`
	// Firewall description.
	FirewallDescription *string `pulumi:"firewallDescription"`
	// The name of Cloud Firewall.
	FirewallName string `pulumi:"firewallName"`
	// Required in automatic mode, the CIDR of subnet used to store the firewall ENI in the firewall VPC.
	FirewallSubnetCidr string `pulumi:"firewallSubnetCidr"`
	// Required in automatic mode,  th CIDR of firewall VPC.
	FirewallVpcCidr string `pulumi:"firewallVpcCidr"`
	// The region ID of the transit router instance.
	RegionNo string `pulumi:"regionNo"`
	// The routing pattern. Value: managed: indicates automatic mode
	RouteMode string `pulumi:"routeMode"`
	// Required in automatic mode, the primary CIDR of network used to connect to the TR in the firewall VPC.
	TrAttachmentMasterCidr string `pulumi:"trAttachmentMasterCidr"`
	// The primary zone of the switch.
	TrAttachmentMasterZone *string `pulumi:"trAttachmentMasterZone"`
	// Required in automatic mode, the the secondary CIDR of the subnet in the firewall VPC used to connect to TR.
	TrAttachmentSlaveCidr string `pulumi:"trAttachmentSlaveCidr"`
	// Switch standby area.
	TrAttachmentSlaveZone *string `pulumi:"trAttachmentSlaveZone"`
	// The ID of the transit router instance.
	TransitRouterId string `pulumi:"transitRouterId"`
}

// The set of arguments for constructing a VpcCenTrFirewall resource.
type VpcCenTrFirewallArgs struct {
	// The ID of the CEN instance.
	CenId pulumi.StringInput
	// Firewall description.
	FirewallDescription pulumi.StringPtrInput
	// The name of Cloud Firewall.
	FirewallName pulumi.StringInput
	// Required in automatic mode, the CIDR of subnet used to store the firewall ENI in the firewall VPC.
	FirewallSubnetCidr pulumi.StringInput
	// Required in automatic mode,  th CIDR of firewall VPC.
	FirewallVpcCidr pulumi.StringInput
	// The region ID of the transit router instance.
	RegionNo pulumi.StringInput
	// The routing pattern. Value: managed: indicates automatic mode
	RouteMode pulumi.StringInput
	// Required in automatic mode, the primary CIDR of network used to connect to the TR in the firewall VPC.
	TrAttachmentMasterCidr pulumi.StringInput
	// The primary zone of the switch.
	TrAttachmentMasterZone pulumi.StringPtrInput
	// Required in automatic mode, the the secondary CIDR of the subnet in the firewall VPC used to connect to TR.
	TrAttachmentSlaveCidr pulumi.StringInput
	// Switch standby area.
	TrAttachmentSlaveZone pulumi.StringPtrInput
	// The ID of the transit router instance.
	TransitRouterId pulumi.StringInput
}

func (VpcCenTrFirewallArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcCenTrFirewallArgs)(nil)).Elem()
}

type VpcCenTrFirewallInput interface {
	pulumi.Input

	ToVpcCenTrFirewallOutput() VpcCenTrFirewallOutput
	ToVpcCenTrFirewallOutputWithContext(ctx context.Context) VpcCenTrFirewallOutput
}

func (*VpcCenTrFirewall) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcCenTrFirewall)(nil)).Elem()
}

func (i *VpcCenTrFirewall) ToVpcCenTrFirewallOutput() VpcCenTrFirewallOutput {
	return i.ToVpcCenTrFirewallOutputWithContext(context.Background())
}

func (i *VpcCenTrFirewall) ToVpcCenTrFirewallOutputWithContext(ctx context.Context) VpcCenTrFirewallOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcCenTrFirewallOutput)
}

// VpcCenTrFirewallArrayInput is an input type that accepts VpcCenTrFirewallArray and VpcCenTrFirewallArrayOutput values.
// You can construct a concrete instance of `VpcCenTrFirewallArrayInput` via:
//
//	VpcCenTrFirewallArray{ VpcCenTrFirewallArgs{...} }
type VpcCenTrFirewallArrayInput interface {
	pulumi.Input

	ToVpcCenTrFirewallArrayOutput() VpcCenTrFirewallArrayOutput
	ToVpcCenTrFirewallArrayOutputWithContext(context.Context) VpcCenTrFirewallArrayOutput
}

type VpcCenTrFirewallArray []VpcCenTrFirewallInput

func (VpcCenTrFirewallArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VpcCenTrFirewall)(nil)).Elem()
}

func (i VpcCenTrFirewallArray) ToVpcCenTrFirewallArrayOutput() VpcCenTrFirewallArrayOutput {
	return i.ToVpcCenTrFirewallArrayOutputWithContext(context.Background())
}

func (i VpcCenTrFirewallArray) ToVpcCenTrFirewallArrayOutputWithContext(ctx context.Context) VpcCenTrFirewallArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcCenTrFirewallArrayOutput)
}

// VpcCenTrFirewallMapInput is an input type that accepts VpcCenTrFirewallMap and VpcCenTrFirewallMapOutput values.
// You can construct a concrete instance of `VpcCenTrFirewallMapInput` via:
//
//	VpcCenTrFirewallMap{ "key": VpcCenTrFirewallArgs{...} }
type VpcCenTrFirewallMapInput interface {
	pulumi.Input

	ToVpcCenTrFirewallMapOutput() VpcCenTrFirewallMapOutput
	ToVpcCenTrFirewallMapOutputWithContext(context.Context) VpcCenTrFirewallMapOutput
}

type VpcCenTrFirewallMap map[string]VpcCenTrFirewallInput

func (VpcCenTrFirewallMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VpcCenTrFirewall)(nil)).Elem()
}

func (i VpcCenTrFirewallMap) ToVpcCenTrFirewallMapOutput() VpcCenTrFirewallMapOutput {
	return i.ToVpcCenTrFirewallMapOutputWithContext(context.Background())
}

func (i VpcCenTrFirewallMap) ToVpcCenTrFirewallMapOutputWithContext(ctx context.Context) VpcCenTrFirewallMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcCenTrFirewallMapOutput)
}

type VpcCenTrFirewallOutput struct{ *pulumi.OutputState }

func (VpcCenTrFirewallOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcCenTrFirewall)(nil)).Elem()
}

func (o VpcCenTrFirewallOutput) ToVpcCenTrFirewallOutput() VpcCenTrFirewallOutput {
	return o
}

func (o VpcCenTrFirewallOutput) ToVpcCenTrFirewallOutputWithContext(ctx context.Context) VpcCenTrFirewallOutput {
	return o
}

// The ID of the CEN instance.
func (o VpcCenTrFirewallOutput) CenId() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcCenTrFirewall) pulumi.StringOutput { return v.CenId }).(pulumi.StringOutput)
}

// Firewall description.
func (o VpcCenTrFirewallOutput) FirewallDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VpcCenTrFirewall) pulumi.StringPtrOutput { return v.FirewallDescription }).(pulumi.StringPtrOutput)
}

// The name of Cloud Firewall.
func (o VpcCenTrFirewallOutput) FirewallName() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcCenTrFirewall) pulumi.StringOutput { return v.FirewallName }).(pulumi.StringOutput)
}

// Required in automatic mode, the CIDR of subnet used to store the firewall ENI in the firewall VPC.
func (o VpcCenTrFirewallOutput) FirewallSubnetCidr() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcCenTrFirewall) pulumi.StringOutput { return v.FirewallSubnetCidr }).(pulumi.StringOutput)
}

// Required in automatic mode,  th CIDR of firewall VPC.
func (o VpcCenTrFirewallOutput) FirewallVpcCidr() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcCenTrFirewall) pulumi.StringOutput { return v.FirewallVpcCidr }).(pulumi.StringOutput)
}

// The region ID of the transit router instance.
func (o VpcCenTrFirewallOutput) RegionNo() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcCenTrFirewall) pulumi.StringOutput { return v.RegionNo }).(pulumi.StringOutput)
}

// The routing pattern. Value: managed: indicates automatic mode
func (o VpcCenTrFirewallOutput) RouteMode() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcCenTrFirewall) pulumi.StringOutput { return v.RouteMode }).(pulumi.StringOutput)
}

// Firewall status. Value:
func (o VpcCenTrFirewallOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcCenTrFirewall) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Required in automatic mode, the primary CIDR of network used to connect to the TR in the firewall VPC.
func (o VpcCenTrFirewallOutput) TrAttachmentMasterCidr() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcCenTrFirewall) pulumi.StringOutput { return v.TrAttachmentMasterCidr }).(pulumi.StringOutput)
}

// The primary zone of the switch.
func (o VpcCenTrFirewallOutput) TrAttachmentMasterZone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VpcCenTrFirewall) pulumi.StringPtrOutput { return v.TrAttachmentMasterZone }).(pulumi.StringPtrOutput)
}

// Required in automatic mode, the the secondary CIDR of the subnet in the firewall VPC used to connect to TR.
func (o VpcCenTrFirewallOutput) TrAttachmentSlaveCidr() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcCenTrFirewall) pulumi.StringOutput { return v.TrAttachmentSlaveCidr }).(pulumi.StringOutput)
}

// Switch standby area.
func (o VpcCenTrFirewallOutput) TrAttachmentSlaveZone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VpcCenTrFirewall) pulumi.StringPtrOutput { return v.TrAttachmentSlaveZone }).(pulumi.StringPtrOutput)
}

// The ID of the transit router instance.
func (o VpcCenTrFirewallOutput) TransitRouterId() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcCenTrFirewall) pulumi.StringOutput { return v.TransitRouterId }).(pulumi.StringOutput)
}

type VpcCenTrFirewallArrayOutput struct{ *pulumi.OutputState }

func (VpcCenTrFirewallArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VpcCenTrFirewall)(nil)).Elem()
}

func (o VpcCenTrFirewallArrayOutput) ToVpcCenTrFirewallArrayOutput() VpcCenTrFirewallArrayOutput {
	return o
}

func (o VpcCenTrFirewallArrayOutput) ToVpcCenTrFirewallArrayOutputWithContext(ctx context.Context) VpcCenTrFirewallArrayOutput {
	return o
}

func (o VpcCenTrFirewallArrayOutput) Index(i pulumi.IntInput) VpcCenTrFirewallOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VpcCenTrFirewall {
		return vs[0].([]*VpcCenTrFirewall)[vs[1].(int)]
	}).(VpcCenTrFirewallOutput)
}

type VpcCenTrFirewallMapOutput struct{ *pulumi.OutputState }

func (VpcCenTrFirewallMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VpcCenTrFirewall)(nil)).Elem()
}

func (o VpcCenTrFirewallMapOutput) ToVpcCenTrFirewallMapOutput() VpcCenTrFirewallMapOutput {
	return o
}

func (o VpcCenTrFirewallMapOutput) ToVpcCenTrFirewallMapOutputWithContext(ctx context.Context) VpcCenTrFirewallMapOutput {
	return o
}

func (o VpcCenTrFirewallMapOutput) MapIndex(k pulumi.StringInput) VpcCenTrFirewallOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VpcCenTrFirewall {
		return vs[0].(map[string]*VpcCenTrFirewall)[vs[1].(string)]
	}).(VpcCenTrFirewallOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VpcCenTrFirewallInput)(nil)).Elem(), &VpcCenTrFirewall{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcCenTrFirewallArrayInput)(nil)).Elem(), VpcCenTrFirewallArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcCenTrFirewallMapInput)(nil)).Elem(), VpcCenTrFirewallMap{})
	pulumi.RegisterOutputType(VpcCenTrFirewallOutput{})
	pulumi.RegisterOutputType(VpcCenTrFirewallArrayOutput{})
	pulumi.RegisterOutputType(VpcCenTrFirewallMapOutput{})
}
