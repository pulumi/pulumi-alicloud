// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package eci

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ECI Virtual Node resource.
//
// For information about ECI Virtual Node and how to use it, see [What is Virtual Node](https://www.alibabacloud.com/help/en/doc-detail/89129.html).
//
// > **NOTE:** Available in v1.145.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eci"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		name := "tf-testaccvirtualnode"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		defaultZones, err := eci.GetZones(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt0 := "default-NODELETING"
// 		defaultNetworks, err := vpc.GetNetworks(ctx, &vpc.GetNetworksArgs{
// 			NameRegex: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt1 := defaultNetworks.Ids[0]
// 		opt2 := defaultZones.Zones[0].ZoneIds[1]
// 		defaultSwitches, err := vpc.GetSwitches(ctx, &vpc.GetSwitchesArgs{
// 			VpcId:  &opt1,
// 			ZoneId: &opt2,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultSecurityGroup, err := ecs.NewSecurityGroup(ctx, "defaultSecurityGroup", &ecs.SecurityGroupArgs{
// 			VpcId: pulumi.String(defaultNetworks.Ids[0]),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultEipAddress, err := ecs.NewEipAddress(ctx, "defaultEipAddress", &ecs.EipAddressArgs{
// 			AddressName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultResourceGroups, err := resourcemanager.GetResourceGroups(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = eci.NewVirtualNode(ctx, "defaultVirtualNode", &eci.VirtualNodeArgs{
// 			SecurityGroupId:     defaultSecurityGroup.ID(),
// 			VirtualNodeName:     pulumi.String(name),
// 			VswitchId:           pulumi.String(defaultSwitches.Ids[1]),
// 			EnablePublicNetwork: pulumi.Bool(false),
// 			EipInstanceId:       defaultEipAddress.ID(),
// 			ResourceGroupId:     pulumi.String(defaultResourceGroups.Groups[0].Id),
// 			KubeConfig:          pulumi.String("kube config"),
// 			Tags: pulumi.AnyMap{
// 				"Created": pulumi.Any("TF"),
// 			},
// 			Taints: eci.VirtualNodeTaintArray{
// 				&eci.VirtualNodeTaintArgs{
// 					Effect: pulumi.String("NoSchedule"),
// 					Key:    pulumi.String("Tf1"),
// 					Value:  pulumi.String("Test1"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// ECI Virtual Node can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:eci/virtualNode:VirtualNode example <id>
// ```
type VirtualNode struct {
	pulumi.CustomResourceState

	// The Id of eip.
	EipInstanceId pulumi.StringOutput `pulumi:"eipInstanceId"`
	// Whether to enable public network. **NOTE:** If `eipInstanceId` is not configured and `enablePublicNetwork` is true, the system will create an elastic public network IP.
	EnablePublicNetwork pulumi.BoolPtrOutput `pulumi:"enablePublicNetwork"`
	// The kube config for the k8s cluster. It needs to be connected after Base64 encoding.
	KubeConfig pulumi.StringOutput `pulumi:"kubeConfig"`
	// The resource group ID.
	ResourceGroupId pulumi.StringPtrOutput `pulumi:"resourceGroupId"`
	// The security group ID.
	SecurityGroupId pulumi.StringOutput `pulumi:"securityGroupId"`
	// The Status of the virtual node. Valid values: `Cleaned`, `Failed`, `Pending`, `Ready`.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The taint. See the following `Block taints`.
	Taints VirtualNodeTaintArrayOutput `pulumi:"taints"`
	// The name of the virtual node. The length of the name is limited to `2` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, half-width colon (:), underscores (_), or hyphens (-), and must start with letters.
	VirtualNodeName pulumi.StringPtrOutput `pulumi:"virtualNodeName"`
	// The vswitch id.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
	// The Zone.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewVirtualNode registers a new resource with the given unique name, arguments, and options.
func NewVirtualNode(ctx *pulumi.Context,
	name string, args *VirtualNodeArgs, opts ...pulumi.ResourceOption) (*VirtualNode, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KubeConfig == nil {
		return nil, errors.New("invalid value for required argument 'KubeConfig'")
	}
	if args.SecurityGroupId == nil {
		return nil, errors.New("invalid value for required argument 'SecurityGroupId'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	var resource VirtualNode
	err := ctx.RegisterResource("alicloud:eci/virtualNode:VirtualNode", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualNode gets an existing VirtualNode resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualNode(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualNodeState, opts ...pulumi.ResourceOption) (*VirtualNode, error) {
	var resource VirtualNode
	err := ctx.ReadResource("alicloud:eci/virtualNode:VirtualNode", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualNode resources.
type virtualNodeState struct {
	// The Id of eip.
	EipInstanceId *string `pulumi:"eipInstanceId"`
	// Whether to enable public network. **NOTE:** If `eipInstanceId` is not configured and `enablePublicNetwork` is true, the system will create an elastic public network IP.
	EnablePublicNetwork *bool `pulumi:"enablePublicNetwork"`
	// The kube config for the k8s cluster. It needs to be connected after Base64 encoding.
	KubeConfig *string `pulumi:"kubeConfig"`
	// The resource group ID.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The security group ID.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// The Status of the virtual node. Valid values: `Cleaned`, `Failed`, `Pending`, `Ready`.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The taint. See the following `Block taints`.
	Taints []VirtualNodeTaint `pulumi:"taints"`
	// The name of the virtual node. The length of the name is limited to `2` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, half-width colon (:), underscores (_), or hyphens (-), and must start with letters.
	VirtualNodeName *string `pulumi:"virtualNodeName"`
	// The vswitch id.
	VswitchId *string `pulumi:"vswitchId"`
	// The Zone.
	ZoneId *string `pulumi:"zoneId"`
}

type VirtualNodeState struct {
	// The Id of eip.
	EipInstanceId pulumi.StringPtrInput
	// Whether to enable public network. **NOTE:** If `eipInstanceId` is not configured and `enablePublicNetwork` is true, the system will create an elastic public network IP.
	EnablePublicNetwork pulumi.BoolPtrInput
	// The kube config for the k8s cluster. It needs to be connected after Base64 encoding.
	KubeConfig pulumi.StringPtrInput
	// The resource group ID.
	ResourceGroupId pulumi.StringPtrInput
	// The security group ID.
	SecurityGroupId pulumi.StringPtrInput
	// The Status of the virtual node. Valid values: `Cleaned`, `Failed`, `Pending`, `Ready`.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The taint. See the following `Block taints`.
	Taints VirtualNodeTaintArrayInput
	// The name of the virtual node. The length of the name is limited to `2` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, half-width colon (:), underscores (_), or hyphens (-), and must start with letters.
	VirtualNodeName pulumi.StringPtrInput
	// The vswitch id.
	VswitchId pulumi.StringPtrInput
	// The Zone.
	ZoneId pulumi.StringPtrInput
}

func (VirtualNodeState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualNodeState)(nil)).Elem()
}

type virtualNodeArgs struct {
	// The Id of eip.
	EipInstanceId *string `pulumi:"eipInstanceId"`
	// Whether to enable public network. **NOTE:** If `eipInstanceId` is not configured and `enablePublicNetwork` is true, the system will create an elastic public network IP.
	EnablePublicNetwork *bool `pulumi:"enablePublicNetwork"`
	// The kube config for the k8s cluster. It needs to be connected after Base64 encoding.
	KubeConfig string `pulumi:"kubeConfig"`
	// The resource group ID.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The security group ID.
	SecurityGroupId string `pulumi:"securityGroupId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The taint. See the following `Block taints`.
	Taints []VirtualNodeTaint `pulumi:"taints"`
	// The name of the virtual node. The length of the name is limited to `2` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, half-width colon (:), underscores (_), or hyphens (-), and must start with letters.
	VirtualNodeName *string `pulumi:"virtualNodeName"`
	// The vswitch id.
	VswitchId string `pulumi:"vswitchId"`
	// The Zone.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a VirtualNode resource.
type VirtualNodeArgs struct {
	// The Id of eip.
	EipInstanceId pulumi.StringPtrInput
	// Whether to enable public network. **NOTE:** If `eipInstanceId` is not configured and `enablePublicNetwork` is true, the system will create an elastic public network IP.
	EnablePublicNetwork pulumi.BoolPtrInput
	// The kube config for the k8s cluster. It needs to be connected after Base64 encoding.
	KubeConfig pulumi.StringInput
	// The resource group ID.
	ResourceGroupId pulumi.StringPtrInput
	// The security group ID.
	SecurityGroupId pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The taint. See the following `Block taints`.
	Taints VirtualNodeTaintArrayInput
	// The name of the virtual node. The length of the name is limited to `2` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, half-width colon (:), underscores (_), or hyphens (-), and must start with letters.
	VirtualNodeName pulumi.StringPtrInput
	// The vswitch id.
	VswitchId pulumi.StringInput
	// The Zone.
	ZoneId pulumi.StringPtrInput
}

func (VirtualNodeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualNodeArgs)(nil)).Elem()
}

type VirtualNodeInput interface {
	pulumi.Input

	ToVirtualNodeOutput() VirtualNodeOutput
	ToVirtualNodeOutputWithContext(ctx context.Context) VirtualNodeOutput
}

func (*VirtualNode) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualNode)(nil)).Elem()
}

func (i *VirtualNode) ToVirtualNodeOutput() VirtualNodeOutput {
	return i.ToVirtualNodeOutputWithContext(context.Background())
}

func (i *VirtualNode) ToVirtualNodeOutputWithContext(ctx context.Context) VirtualNodeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNodeOutput)
}

// VirtualNodeArrayInput is an input type that accepts VirtualNodeArray and VirtualNodeArrayOutput values.
// You can construct a concrete instance of `VirtualNodeArrayInput` via:
//
//          VirtualNodeArray{ VirtualNodeArgs{...} }
type VirtualNodeArrayInput interface {
	pulumi.Input

	ToVirtualNodeArrayOutput() VirtualNodeArrayOutput
	ToVirtualNodeArrayOutputWithContext(context.Context) VirtualNodeArrayOutput
}

type VirtualNodeArray []VirtualNodeInput

func (VirtualNodeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualNode)(nil)).Elem()
}

func (i VirtualNodeArray) ToVirtualNodeArrayOutput() VirtualNodeArrayOutput {
	return i.ToVirtualNodeArrayOutputWithContext(context.Background())
}

func (i VirtualNodeArray) ToVirtualNodeArrayOutputWithContext(ctx context.Context) VirtualNodeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNodeArrayOutput)
}

// VirtualNodeMapInput is an input type that accepts VirtualNodeMap and VirtualNodeMapOutput values.
// You can construct a concrete instance of `VirtualNodeMapInput` via:
//
//          VirtualNodeMap{ "key": VirtualNodeArgs{...} }
type VirtualNodeMapInput interface {
	pulumi.Input

	ToVirtualNodeMapOutput() VirtualNodeMapOutput
	ToVirtualNodeMapOutputWithContext(context.Context) VirtualNodeMapOutput
}

type VirtualNodeMap map[string]VirtualNodeInput

func (VirtualNodeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualNode)(nil)).Elem()
}

func (i VirtualNodeMap) ToVirtualNodeMapOutput() VirtualNodeMapOutput {
	return i.ToVirtualNodeMapOutputWithContext(context.Background())
}

func (i VirtualNodeMap) ToVirtualNodeMapOutputWithContext(ctx context.Context) VirtualNodeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNodeMapOutput)
}

type VirtualNodeOutput struct{ *pulumi.OutputState }

func (VirtualNodeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualNode)(nil)).Elem()
}

func (o VirtualNodeOutput) ToVirtualNodeOutput() VirtualNodeOutput {
	return o
}

func (o VirtualNodeOutput) ToVirtualNodeOutputWithContext(ctx context.Context) VirtualNodeOutput {
	return o
}

type VirtualNodeArrayOutput struct{ *pulumi.OutputState }

func (VirtualNodeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualNode)(nil)).Elem()
}

func (o VirtualNodeArrayOutput) ToVirtualNodeArrayOutput() VirtualNodeArrayOutput {
	return o
}

func (o VirtualNodeArrayOutput) ToVirtualNodeArrayOutputWithContext(ctx context.Context) VirtualNodeArrayOutput {
	return o
}

func (o VirtualNodeArrayOutput) Index(i pulumi.IntInput) VirtualNodeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VirtualNode {
		return vs[0].([]*VirtualNode)[vs[1].(int)]
	}).(VirtualNodeOutput)
}

type VirtualNodeMapOutput struct{ *pulumi.OutputState }

func (VirtualNodeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualNode)(nil)).Elem()
}

func (o VirtualNodeMapOutput) ToVirtualNodeMapOutput() VirtualNodeMapOutput {
	return o
}

func (o VirtualNodeMapOutput) ToVirtualNodeMapOutputWithContext(ctx context.Context) VirtualNodeMapOutput {
	return o
}

func (o VirtualNodeMapOutput) MapIndex(k pulumi.StringInput) VirtualNodeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VirtualNode {
		return vs[0].(map[string]*VirtualNode)[vs[1].(string)]
	}).(VirtualNodeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNodeInput)(nil)).Elem(), &VirtualNode{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNodeArrayInput)(nil)).Elem(), VirtualNodeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNodeMapInput)(nil)).Elem(), VirtualNodeMap{})
	pulumi.RegisterOutputType(VirtualNodeOutput{})
	pulumi.RegisterOutputType(VirtualNodeArrayOutput{})
	pulumi.RegisterOutputType(VirtualNodeMapOutput{})
}