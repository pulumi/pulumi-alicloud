// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Api Gateway Instance resource.
//
// For information about Api Gateway Instance and how to use it, see [What is Instance](https://www.alibabacloud.com/help/en/api-gateway/product-overview/dedicated-instances).
//
// > **NOTE:** Available since v1.218.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/apigateway"
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
//			_, err := apigateway.NewInstance(ctx, "default", &apigateway.InstanceArgs{
//				InstanceName: pulumi.String(name),
//				InstanceSpec: pulumi.String("api.s1.small"),
//				HttpsPolicy:  pulumi.String("HTTPS2_TLS1_0"),
//				ZoneId:       pulumi.String("cn-hangzhou-MAZ6(i,j,k)"),
//				PaymentType:  pulumi.String("PayAsYouGo"),
//				InstanceType: pulumi.String("normal"),
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
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/apigateway"
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
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			vpc, err := vpc.NewNetwork(ctx, "vpc", &vpc.NetworkArgs{
//				CidrBlock: pulumi.String("172.16.0.0/12"),
//				VpcName:   pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			vswitch1, err := vpc.NewSwitch(ctx, "vswitch_1", &vpc.SwitchArgs{
//				VpcId:       vpc.ID(),
//				CidrBlock:   pulumi.String("172.16.0.0/16"),
//				ZoneId:      pulumi.String("cn-hangzhou-j"),
//				VswitchName: pulumi.Sprintf("%v_1", name),
//			})
//			if err != nil {
//				return err
//			}
//			vswitch2, err := vpc.NewSwitch(ctx, "vswitch_2", &vpc.SwitchArgs{
//				VpcId:       vpc.ID(),
//				CidrBlock:   pulumi.String("172.17.0.0/16"),
//				ZoneId:      pulumi.String("cn-hangzhou-k"),
//				VswitchName: pulumi.Sprintf("%v_2", name),
//			})
//			if err != nil {
//				return err
//			}
//			securityGroup, err := ecs.NewSecurityGroup(ctx, "security_group", &ecs.SecurityGroupArgs{
//				VpcId:             vpc.ID(),
//				SecurityGroupName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = apigateway.NewInstance(ctx, "vpc_integration_instance", &apigateway.InstanceArgs{
//				InstanceName: pulumi.String(name),
//				HttpsPolicy:  pulumi.String("HTTPS2_TLS1_0"),
//				InstanceSpec: pulumi.String("api.s1.small"),
//				InstanceType: pulumi.String("vpc_connect"),
//				PaymentType:  pulumi.String("PayAsYouGo"),
//				UserVpcId:    vpc.ID(),
//				InstanceCidr: pulumi.String("192.168.0.0/16"),
//				ZoneVswitchSecurityGroups: apigateway.InstanceZoneVswitchSecurityGroupArray{
//					&apigateway.InstanceZoneVswitchSecurityGroupArgs{
//						ZoneId:        vswitch1.ZoneId,
//						VswitchId:     vswitch1.ID(),
//						CidrBlock:     vswitch1.CidrBlock,
//						SecurityGroup: securityGroup.ID(),
//					},
//					&apigateway.InstanceZoneVswitchSecurityGroupArgs{
//						ZoneId:        vswitch2.ZoneId,
//						VswitchId:     vswitch2.ID(),
//						CidrBlock:     vswitch2.CidrBlock,
//						SecurityGroup: securityGroup.ID(),
//					},
//				},
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
// Api Gateway Instance can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:apigateway/instance:Instance example <id>
// ```
type Instance struct {
	pulumi.CustomResourceState

	// (Available since v1.228.0) The CIDR blocks that can be accessed by the Vpc integration instance.
	ConnectCidrBlocks pulumi.StringOutput `pulumi:"connectCidrBlocks"`
	// Creation time.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Indicates whether to delete the IP block that the VPC can access, conflict with `toConnectVpcIpBlock`.
	DeleteVpcIpBlock pulumi.StringPtrOutput `pulumi:"deleteVpcIpBlock"`
	// The time of the instance package. Valid values:
	// - PricingCycle is **Month**, indicating monthly payment. The value range is **1** to **9**.
	// - PricingCycle is **Year**, indicating annual payment. The value range is **1** to **3**.
	//
	// When the value of> ChargeType is **PrePaid**, this parameter is available and must be passed in.
	Duration pulumi.IntPtrOutput `pulumi:"duration"`
	// Specifies whether IPv6 egress capability is enabled.
	EgressIpv6Enable pulumi.BoolPtrOutput `pulumi:"egressIpv6Enable"`
	// Https policy.
	HttpsPolicy pulumi.StringOutput `pulumi:"httpsPolicy"`
	// The VpcID which the client at.
	IngressVpcId pulumi.StringPtrOutput `pulumi:"ingressVpcId"`
	// The user ID that the VpcID of `ingressVpcId` belongs to.
	IngressVpcOwnerId pulumi.StringPtrOutput `pulumi:"ingressVpcOwnerId"`
	// The VSwitch ID that belongs to the Vpc of `ingressVpcId`. Required when `ingressVpcId` is set.
	IngressVswitchId pulumi.StringPtrOutput `pulumi:"ingressVswitchId"`
	// The CIDR block for the instance deployment. Valid values are:
	// - `192.168.0.0/16`.
	// - `172.16.0.0/12`.
	InstanceCidr pulumi.StringOutput `pulumi:"instanceCidr"`
	// Instance name.
	InstanceName pulumi.StringOutput `pulumi:"instanceName"`
	// Instance spec.
	InstanceSpec pulumi.StringOutput `pulumi:"instanceSpec"`
	// The type of the instance. Valid values are:
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// Specifies whether IPv6 ingress capability is enabled.
	Ipv6Enabled pulumi.BoolPtrOutput `pulumi:"ipv6Enabled"`
	// The payment type of the resource.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// The subscription instance is of the subscription year or month type. This parameter is required when the Payment type is PrePaid. The value range is as follows:
	PricingCycle pulumi.StringPtrOutput `pulumi:"pricingCycle"`
	// Specifies whether to skip the WAIT_SWITCH status of instance when modifying instance spec. Works only when instance spec change.
	SkipWaitSwitch pulumi.BoolPtrOutput `pulumi:"skipWaitSwitch"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// Does ipv6 support.
	SupportIpv6 pulumi.BoolOutput `pulumi:"supportIpv6"`
	// The additional IP block that the VPC integration instance can access, conflict with `deleteVpcIpBlock`. See `toConnectVpcIpBlock` below.
	ToConnectVpcIpBlock InstanceToConnectVpcIpBlockPtrOutput `pulumi:"toConnectVpcIpBlock"`
	// User's VpcID.
	UserVpcId pulumi.StringPtrOutput `pulumi:"userVpcId"`
	// Whether the slb of the Vpc supports.
	VpcSlbIntranetEnable pulumi.BoolPtrOutput `pulumi:"vpcSlbIntranetEnable"`
	// The zone where the instance is deployed.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
	// Network configuration details for Vpc integration instance which includes the availability zone, VSwitch, and security group information. See `zoneVswitchSecurityGroup` below.
	ZoneVswitchSecurityGroups InstanceZoneVswitchSecurityGroupArrayOutput `pulumi:"zoneVswitchSecurityGroups"`
}

// NewInstance registers a new resource with the given unique name, arguments, and options.
func NewInstance(ctx *pulumi.Context,
	name string, args *InstanceArgs, opts ...pulumi.ResourceOption) (*Instance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HttpsPolicy == nil {
		return nil, errors.New("invalid value for required argument 'HttpsPolicy'")
	}
	if args.InstanceName == nil {
		return nil, errors.New("invalid value for required argument 'InstanceName'")
	}
	if args.InstanceSpec == nil {
		return nil, errors.New("invalid value for required argument 'InstanceSpec'")
	}
	if args.PaymentType == nil {
		return nil, errors.New("invalid value for required argument 'PaymentType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Instance
	err := ctx.RegisterResource("alicloud:apigateway/instance:Instance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstance gets an existing Instance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceState, opts ...pulumi.ResourceOption) (*Instance, error) {
	var resource Instance
	err := ctx.ReadResource("alicloud:apigateway/instance:Instance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Instance resources.
type instanceState struct {
	// (Available since v1.228.0) The CIDR blocks that can be accessed by the Vpc integration instance.
	ConnectCidrBlocks *string `pulumi:"connectCidrBlocks"`
	// Creation time.
	CreateTime *string `pulumi:"createTime"`
	// Indicates whether to delete the IP block that the VPC can access, conflict with `toConnectVpcIpBlock`.
	DeleteVpcIpBlock *string `pulumi:"deleteVpcIpBlock"`
	// The time of the instance package. Valid values:
	// - PricingCycle is **Month**, indicating monthly payment. The value range is **1** to **9**.
	// - PricingCycle is **Year**, indicating annual payment. The value range is **1** to **3**.
	//
	// When the value of> ChargeType is **PrePaid**, this parameter is available and must be passed in.
	Duration *int `pulumi:"duration"`
	// Specifies whether IPv6 egress capability is enabled.
	EgressIpv6Enable *bool `pulumi:"egressIpv6Enable"`
	// Https policy.
	HttpsPolicy *string `pulumi:"httpsPolicy"`
	// The VpcID which the client at.
	IngressVpcId *string `pulumi:"ingressVpcId"`
	// The user ID that the VpcID of `ingressVpcId` belongs to.
	IngressVpcOwnerId *string `pulumi:"ingressVpcOwnerId"`
	// The VSwitch ID that belongs to the Vpc of `ingressVpcId`. Required when `ingressVpcId` is set.
	IngressVswitchId *string `pulumi:"ingressVswitchId"`
	// The CIDR block for the instance deployment. Valid values are:
	// - `192.168.0.0/16`.
	// - `172.16.0.0/12`.
	InstanceCidr *string `pulumi:"instanceCidr"`
	// Instance name.
	InstanceName *string `pulumi:"instanceName"`
	// Instance spec.
	InstanceSpec *string `pulumi:"instanceSpec"`
	// The type of the instance. Valid values are:
	InstanceType *string `pulumi:"instanceType"`
	// Specifies whether IPv6 ingress capability is enabled.
	Ipv6Enabled *bool `pulumi:"ipv6Enabled"`
	// The payment type of the resource.
	PaymentType *string `pulumi:"paymentType"`
	// The subscription instance is of the subscription year or month type. This parameter is required when the Payment type is PrePaid. The value range is as follows:
	PricingCycle *string `pulumi:"pricingCycle"`
	// Specifies whether to skip the WAIT_SWITCH status of instance when modifying instance spec. Works only when instance spec change.
	SkipWaitSwitch *bool `pulumi:"skipWaitSwitch"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// Does ipv6 support.
	SupportIpv6 *bool `pulumi:"supportIpv6"`
	// The additional IP block that the VPC integration instance can access, conflict with `deleteVpcIpBlock`. See `toConnectVpcIpBlock` below.
	ToConnectVpcIpBlock *InstanceToConnectVpcIpBlock `pulumi:"toConnectVpcIpBlock"`
	// User's VpcID.
	UserVpcId *string `pulumi:"userVpcId"`
	// Whether the slb of the Vpc supports.
	VpcSlbIntranetEnable *bool `pulumi:"vpcSlbIntranetEnable"`
	// The zone where the instance is deployed.
	ZoneId *string `pulumi:"zoneId"`
	// Network configuration details for Vpc integration instance which includes the availability zone, VSwitch, and security group information. See `zoneVswitchSecurityGroup` below.
	ZoneVswitchSecurityGroups []InstanceZoneVswitchSecurityGroup `pulumi:"zoneVswitchSecurityGroups"`
}

type InstanceState struct {
	// (Available since v1.228.0) The CIDR blocks that can be accessed by the Vpc integration instance.
	ConnectCidrBlocks pulumi.StringPtrInput
	// Creation time.
	CreateTime pulumi.StringPtrInput
	// Indicates whether to delete the IP block that the VPC can access, conflict with `toConnectVpcIpBlock`.
	DeleteVpcIpBlock pulumi.StringPtrInput
	// The time of the instance package. Valid values:
	// - PricingCycle is **Month**, indicating monthly payment. The value range is **1** to **9**.
	// - PricingCycle is **Year**, indicating annual payment. The value range is **1** to **3**.
	//
	// When the value of> ChargeType is **PrePaid**, this parameter is available and must be passed in.
	Duration pulumi.IntPtrInput
	// Specifies whether IPv6 egress capability is enabled.
	EgressIpv6Enable pulumi.BoolPtrInput
	// Https policy.
	HttpsPolicy pulumi.StringPtrInput
	// The VpcID which the client at.
	IngressVpcId pulumi.StringPtrInput
	// The user ID that the VpcID of `ingressVpcId` belongs to.
	IngressVpcOwnerId pulumi.StringPtrInput
	// The VSwitch ID that belongs to the Vpc of `ingressVpcId`. Required when `ingressVpcId` is set.
	IngressVswitchId pulumi.StringPtrInput
	// The CIDR block for the instance deployment. Valid values are:
	// - `192.168.0.0/16`.
	// - `172.16.0.0/12`.
	InstanceCidr pulumi.StringPtrInput
	// Instance name.
	InstanceName pulumi.StringPtrInput
	// Instance spec.
	InstanceSpec pulumi.StringPtrInput
	// The type of the instance. Valid values are:
	InstanceType pulumi.StringPtrInput
	// Specifies whether IPv6 ingress capability is enabled.
	Ipv6Enabled pulumi.BoolPtrInput
	// The payment type of the resource.
	PaymentType pulumi.StringPtrInput
	// The subscription instance is of the subscription year or month type. This parameter is required when the Payment type is PrePaid. The value range is as follows:
	PricingCycle pulumi.StringPtrInput
	// Specifies whether to skip the WAIT_SWITCH status of instance when modifying instance spec. Works only when instance spec change.
	SkipWaitSwitch pulumi.BoolPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// Does ipv6 support.
	SupportIpv6 pulumi.BoolPtrInput
	// The additional IP block that the VPC integration instance can access, conflict with `deleteVpcIpBlock`. See `toConnectVpcIpBlock` below.
	ToConnectVpcIpBlock InstanceToConnectVpcIpBlockPtrInput
	// User's VpcID.
	UserVpcId pulumi.StringPtrInput
	// Whether the slb of the Vpc supports.
	VpcSlbIntranetEnable pulumi.BoolPtrInput
	// The zone where the instance is deployed.
	ZoneId pulumi.StringPtrInput
	// Network configuration details for Vpc integration instance which includes the availability zone, VSwitch, and security group information. See `zoneVswitchSecurityGroup` below.
	ZoneVswitchSecurityGroups InstanceZoneVswitchSecurityGroupArrayInput
}

func (InstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceState)(nil)).Elem()
}

type instanceArgs struct {
	// Indicates whether to delete the IP block that the VPC can access, conflict with `toConnectVpcIpBlock`.
	DeleteVpcIpBlock *string `pulumi:"deleteVpcIpBlock"`
	// The time of the instance package. Valid values:
	// - PricingCycle is **Month**, indicating monthly payment. The value range is **1** to **9**.
	// - PricingCycle is **Year**, indicating annual payment. The value range is **1** to **3**.
	//
	// When the value of> ChargeType is **PrePaid**, this parameter is available and must be passed in.
	Duration *int `pulumi:"duration"`
	// Specifies whether IPv6 egress capability is enabled.
	EgressIpv6Enable *bool `pulumi:"egressIpv6Enable"`
	// Https policy.
	HttpsPolicy string `pulumi:"httpsPolicy"`
	// The VpcID which the client at.
	IngressVpcId *string `pulumi:"ingressVpcId"`
	// The user ID that the VpcID of `ingressVpcId` belongs to.
	IngressVpcOwnerId *string `pulumi:"ingressVpcOwnerId"`
	// The VSwitch ID that belongs to the Vpc of `ingressVpcId`. Required when `ingressVpcId` is set.
	IngressVswitchId *string `pulumi:"ingressVswitchId"`
	// The CIDR block for the instance deployment. Valid values are:
	// - `192.168.0.0/16`.
	// - `172.16.0.0/12`.
	InstanceCidr *string `pulumi:"instanceCidr"`
	// Instance name.
	InstanceName string `pulumi:"instanceName"`
	// Instance spec.
	InstanceSpec string `pulumi:"instanceSpec"`
	// The type of the instance. Valid values are:
	InstanceType *string `pulumi:"instanceType"`
	// Specifies whether IPv6 ingress capability is enabled.
	Ipv6Enabled *bool `pulumi:"ipv6Enabled"`
	// The payment type of the resource.
	PaymentType string `pulumi:"paymentType"`
	// The subscription instance is of the subscription year or month type. This parameter is required when the Payment type is PrePaid. The value range is as follows:
	PricingCycle *string `pulumi:"pricingCycle"`
	// Specifies whether to skip the WAIT_SWITCH status of instance when modifying instance spec. Works only when instance spec change.
	SkipWaitSwitch *bool `pulumi:"skipWaitSwitch"`
	// The additional IP block that the VPC integration instance can access, conflict with `deleteVpcIpBlock`. See `toConnectVpcIpBlock` below.
	ToConnectVpcIpBlock *InstanceToConnectVpcIpBlock `pulumi:"toConnectVpcIpBlock"`
	// User's VpcID.
	UserVpcId *string `pulumi:"userVpcId"`
	// Whether the slb of the Vpc supports.
	VpcSlbIntranetEnable *bool `pulumi:"vpcSlbIntranetEnable"`
	// The zone where the instance is deployed.
	ZoneId *string `pulumi:"zoneId"`
	// Network configuration details for Vpc integration instance which includes the availability zone, VSwitch, and security group information. See `zoneVswitchSecurityGroup` below.
	ZoneVswitchSecurityGroups []InstanceZoneVswitchSecurityGroup `pulumi:"zoneVswitchSecurityGroups"`
}

// The set of arguments for constructing a Instance resource.
type InstanceArgs struct {
	// Indicates whether to delete the IP block that the VPC can access, conflict with `toConnectVpcIpBlock`.
	DeleteVpcIpBlock pulumi.StringPtrInput
	// The time of the instance package. Valid values:
	// - PricingCycle is **Month**, indicating monthly payment. The value range is **1** to **9**.
	// - PricingCycle is **Year**, indicating annual payment. The value range is **1** to **3**.
	//
	// When the value of> ChargeType is **PrePaid**, this parameter is available and must be passed in.
	Duration pulumi.IntPtrInput
	// Specifies whether IPv6 egress capability is enabled.
	EgressIpv6Enable pulumi.BoolPtrInput
	// Https policy.
	HttpsPolicy pulumi.StringInput
	// The VpcID which the client at.
	IngressVpcId pulumi.StringPtrInput
	// The user ID that the VpcID of `ingressVpcId` belongs to.
	IngressVpcOwnerId pulumi.StringPtrInput
	// The VSwitch ID that belongs to the Vpc of `ingressVpcId`. Required when `ingressVpcId` is set.
	IngressVswitchId pulumi.StringPtrInput
	// The CIDR block for the instance deployment. Valid values are:
	// - `192.168.0.0/16`.
	// - `172.16.0.0/12`.
	InstanceCidr pulumi.StringPtrInput
	// Instance name.
	InstanceName pulumi.StringInput
	// Instance spec.
	InstanceSpec pulumi.StringInput
	// The type of the instance. Valid values are:
	InstanceType pulumi.StringPtrInput
	// Specifies whether IPv6 ingress capability is enabled.
	Ipv6Enabled pulumi.BoolPtrInput
	// The payment type of the resource.
	PaymentType pulumi.StringInput
	// The subscription instance is of the subscription year or month type. This parameter is required when the Payment type is PrePaid. The value range is as follows:
	PricingCycle pulumi.StringPtrInput
	// Specifies whether to skip the WAIT_SWITCH status of instance when modifying instance spec. Works only when instance spec change.
	SkipWaitSwitch pulumi.BoolPtrInput
	// The additional IP block that the VPC integration instance can access, conflict with `deleteVpcIpBlock`. See `toConnectVpcIpBlock` below.
	ToConnectVpcIpBlock InstanceToConnectVpcIpBlockPtrInput
	// User's VpcID.
	UserVpcId pulumi.StringPtrInput
	// Whether the slb of the Vpc supports.
	VpcSlbIntranetEnable pulumi.BoolPtrInput
	// The zone where the instance is deployed.
	ZoneId pulumi.StringPtrInput
	// Network configuration details for Vpc integration instance which includes the availability zone, VSwitch, and security group information. See `zoneVswitchSecurityGroup` below.
	ZoneVswitchSecurityGroups InstanceZoneVswitchSecurityGroupArrayInput
}

func (InstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceArgs)(nil)).Elem()
}

type InstanceInput interface {
	pulumi.Input

	ToInstanceOutput() InstanceOutput
	ToInstanceOutputWithContext(ctx context.Context) InstanceOutput
}

func (*Instance) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (i *Instance) ToInstanceOutput() InstanceOutput {
	return i.ToInstanceOutputWithContext(context.Background())
}

func (i *Instance) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceOutput)
}

// InstanceArrayInput is an input type that accepts InstanceArray and InstanceArrayOutput values.
// You can construct a concrete instance of `InstanceArrayInput` via:
//
//	InstanceArray{ InstanceArgs{...} }
type InstanceArrayInput interface {
	pulumi.Input

	ToInstanceArrayOutput() InstanceArrayOutput
	ToInstanceArrayOutputWithContext(context.Context) InstanceArrayOutput
}

type InstanceArray []InstanceInput

func (InstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (i InstanceArray) ToInstanceArrayOutput() InstanceArrayOutput {
	return i.ToInstanceArrayOutputWithContext(context.Background())
}

func (i InstanceArray) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceArrayOutput)
}

// InstanceMapInput is an input type that accepts InstanceMap and InstanceMapOutput values.
// You can construct a concrete instance of `InstanceMapInput` via:
//
//	InstanceMap{ "key": InstanceArgs{...} }
type InstanceMapInput interface {
	pulumi.Input

	ToInstanceMapOutput() InstanceMapOutput
	ToInstanceMapOutputWithContext(context.Context) InstanceMapOutput
}

type InstanceMap map[string]InstanceInput

func (InstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (i InstanceMap) ToInstanceMapOutput() InstanceMapOutput {
	return i.ToInstanceMapOutputWithContext(context.Background())
}

func (i InstanceMap) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceMapOutput)
}

type InstanceOutput struct{ *pulumi.OutputState }

func (InstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (o InstanceOutput) ToInstanceOutput() InstanceOutput {
	return o
}

func (o InstanceOutput) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return o
}

// (Available since v1.228.0) The CIDR blocks that can be accessed by the Vpc integration instance.
func (o InstanceOutput) ConnectCidrBlocks() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.ConnectCidrBlocks }).(pulumi.StringOutput)
}

// Creation time.
func (o InstanceOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Indicates whether to delete the IP block that the VPC can access, conflict with `toConnectVpcIpBlock`.
func (o InstanceOutput) DeleteVpcIpBlock() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.DeleteVpcIpBlock }).(pulumi.StringPtrOutput)
}

// The time of the instance package. Valid values:
// - PricingCycle is **Month**, indicating monthly payment. The value range is **1** to **9**.
// - PricingCycle is **Year**, indicating annual payment. The value range is **1** to **3**.
//
// When the value of> ChargeType is **PrePaid**, this parameter is available and must be passed in.
func (o InstanceOutput) Duration() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntPtrOutput { return v.Duration }).(pulumi.IntPtrOutput)
}

// Specifies whether IPv6 egress capability is enabled.
func (o InstanceOutput) EgressIpv6Enable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.BoolPtrOutput { return v.EgressIpv6Enable }).(pulumi.BoolPtrOutput)
}

// Https policy.
func (o InstanceOutput) HttpsPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.HttpsPolicy }).(pulumi.StringOutput)
}

// The VpcID which the client at.
func (o InstanceOutput) IngressVpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.IngressVpcId }).(pulumi.StringPtrOutput)
}

// The user ID that the VpcID of `ingressVpcId` belongs to.
func (o InstanceOutput) IngressVpcOwnerId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.IngressVpcOwnerId }).(pulumi.StringPtrOutput)
}

// The VSwitch ID that belongs to the Vpc of `ingressVpcId`. Required when `ingressVpcId` is set.
func (o InstanceOutput) IngressVswitchId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.IngressVswitchId }).(pulumi.StringPtrOutput)
}

// The CIDR block for the instance deployment. Valid values are:
// - `192.168.0.0/16`.
// - `172.16.0.0/12`.
func (o InstanceOutput) InstanceCidr() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.InstanceCidr }).(pulumi.StringOutput)
}

// Instance name.
func (o InstanceOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.InstanceName }).(pulumi.StringOutput)
}

// Instance spec.
func (o InstanceOutput) InstanceSpec() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.InstanceSpec }).(pulumi.StringOutput)
}

// The type of the instance. Valid values are:
func (o InstanceOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

// Specifies whether IPv6 ingress capability is enabled.
func (o InstanceOutput) Ipv6Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.BoolPtrOutput { return v.Ipv6Enabled }).(pulumi.BoolPtrOutput)
}

// The payment type of the resource.
func (o InstanceOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// The subscription instance is of the subscription year or month type. This parameter is required when the Payment type is PrePaid. The value range is as follows:
func (o InstanceOutput) PricingCycle() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.PricingCycle }).(pulumi.StringPtrOutput)
}

// Specifies whether to skip the WAIT_SWITCH status of instance when modifying instance spec. Works only when instance spec change.
func (o InstanceOutput) SkipWaitSwitch() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.BoolPtrOutput { return v.SkipWaitSwitch }).(pulumi.BoolPtrOutput)
}

// The status of the resource.
func (o InstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Does ipv6 support.
func (o InstanceOutput) SupportIpv6() pulumi.BoolOutput {
	return o.ApplyT(func(v *Instance) pulumi.BoolOutput { return v.SupportIpv6 }).(pulumi.BoolOutput)
}

// The additional IP block that the VPC integration instance can access, conflict with `deleteVpcIpBlock`. See `toConnectVpcIpBlock` below.
func (o InstanceOutput) ToConnectVpcIpBlock() InstanceToConnectVpcIpBlockPtrOutput {
	return o.ApplyT(func(v *Instance) InstanceToConnectVpcIpBlockPtrOutput { return v.ToConnectVpcIpBlock }).(InstanceToConnectVpcIpBlockPtrOutput)
}

// User's VpcID.
func (o InstanceOutput) UserVpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.UserVpcId }).(pulumi.StringPtrOutput)
}

// Whether the slb of the Vpc supports.
func (o InstanceOutput) VpcSlbIntranetEnable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.BoolPtrOutput { return v.VpcSlbIntranetEnable }).(pulumi.BoolPtrOutput)
}

// The zone where the instance is deployed.
func (o InstanceOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

// Network configuration details for Vpc integration instance which includes the availability zone, VSwitch, and security group information. See `zoneVswitchSecurityGroup` below.
func (o InstanceOutput) ZoneVswitchSecurityGroups() InstanceZoneVswitchSecurityGroupArrayOutput {
	return o.ApplyT(func(v *Instance) InstanceZoneVswitchSecurityGroupArrayOutput { return v.ZoneVswitchSecurityGroups }).(InstanceZoneVswitchSecurityGroupArrayOutput)
}

type InstanceArrayOutput struct{ *pulumi.OutputState }

func (InstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (o InstanceArrayOutput) ToInstanceArrayOutput() InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) Index(i pulumi.IntInput) InstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].([]*Instance)[vs[1].(int)]
	}).(InstanceOutput)
}

type InstanceMapOutput struct{ *pulumi.OutputState }

func (InstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (o InstanceMapOutput) ToInstanceMapOutput() InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) MapIndex(k pulumi.StringInput) InstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].(map[string]*Instance)[vs[1].(string)]
	}).(InstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceInput)(nil)).Elem(), &Instance{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceArrayInput)(nil)).Elem(), InstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceMapInput)(nil)).Elem(), InstanceMap{})
	pulumi.RegisterOutputType(InstanceOutput{})
	pulumi.RegisterOutputType(InstanceArrayOutput{})
	pulumi.RegisterOutputType(InstanceMapOutput{})
}
