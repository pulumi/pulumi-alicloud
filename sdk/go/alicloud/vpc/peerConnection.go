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

// Provides a Vpc Peer Peer Connection resource.
//
// Vpc peer connection.
//
// For information about Vpc Peer Peer Connection and how to use it, see [What is Peer Connection](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/createvpcpeer).
//
// > **NOTE:** Available since v1.186.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := alicloud.GetAccount(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			cfg := config.New(ctx, "")
//			acceptingRegion := "cn-beijing"
//			if param := cfg.Get("acceptingRegion"); param != "" {
//				acceptingRegion = param
//			}
//			localVpc, err := vpc.NewNetwork(ctx, "local_vpc", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("terraform-example"),
//				CidrBlock: pulumi.String("172.17.3.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			acceptingVpc, err := vpc.NewNetwork(ctx, "accepting_vpc", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("terraform-example"),
//				CidrBlock: pulumi.String("172.17.3.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewPeerConnection(ctx, "default", &vpc.PeerConnectionArgs{
//				PeerConnectionName: pulumi.String("terraform-example"),
//				VpcId:              localVpc.ID(),
//				AcceptingAliUid:    pulumi.String(_default.Id),
//				AcceptingRegionId:  pulumi.String(acceptingRegion),
//				AcceptingVpcId:     acceptingVpc.ID(),
//				Description:        pulumi.String("terraform-example"),
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
// Vpc Peer Peer Connection can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:vpc/peerConnection:PeerConnection example <id>
// ```
type PeerConnection struct {
	pulumi.CustomResourceState

	// The ID of the Alibaba Cloud account to which the accepter VPC belongs.
	//
	// *   To create a VPC peering connection within your Alibaba Cloud account, enter the ID of your Alibaba Cloud account.
	// *   To create a VPC peering connection between your Alibaba Cloud account and another Alibaba Cloud account, enter the ID of the peer Alibaba Cloud account.
	//
	// > **NOTE:**   If the accepter is a RAM user, set `AcceptingAliUid` to the ID of the Alibaba Cloud account that created the RAM user.
	AcceptingAliUid pulumi.IntPtrOutput `pulumi:"acceptingAliUid"`
	// The region ID of the accepter VPC of the VPC peering connection that you want to create.
	//
	// - To create an intra-region VPC peering connection, enter a region ID that is the same as that of the requester VPC.
	// - To create an inter-region VPC peering connection, enter a region ID that is different from that of the requester VPC.
	AcceptingRegionId pulumi.StringOutput `pulumi:"acceptingRegionId"`
	// The ID of the accepter VPC.
	AcceptingVpcId pulumi.StringOutput `pulumi:"acceptingVpcId"`
	// The bandwidth of the VPC peering connection. Unit: Mbit/s. The value must be an integer greater than 0. Before you specify this parameter, make sure that you create an inter-region VPC peering connection.
	Bandwidth pulumi.IntOutput `pulumi:"bandwidth"`
	// The creation time of the VPC peer connection. Use UTC time in the format' YYYY-MM-DDThh:mm:ssZ '.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The description of the VPC peering connection.
	// The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
	Description pulumi.StringOutput `pulumi:"description"`
	// Specifies whether to perform only a dry run, without performing the actual request. Valid values:
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// Specifies whether to forcefully delete the VPC peering connection. Valid values:
	ForceDelete pulumi.BoolPtrOutput `pulumi:"forceDelete"`
	// The link type of the VPC peering connection that you want to create. Valid values:
	// - Platinum.
	// - Gold: default value.
	//
	// > **NOTE:**
	//
	// > **NOTE:**  - If you need to specify this parameter, ensure that the VPC peering connection is an inter-region connection.
	LinkType pulumi.StringOutput `pulumi:"linkType"`
	// The name of the VPC peering connection.
	// The name must be 2 to 128 characters in length, and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.
	PeerConnectionName pulumi.StringOutput `pulumi:"peerConnectionName"`
	// The region ID of the resource to which you want to create and add tags.
	RegionId pulumi.StringOutput `pulumi:"regionId"`
	// The ID of the new resource group.
	//
	// > **NOTE:**   You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see [What is resource management?](https://www.alibabacloud.com/help/en/doc-detail/94475.html)
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The status of the resource
	Status pulumi.StringOutput `pulumi:"status"`
	// The tags of VpcPeer.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The ID of the requester VPC or accepter VPC of the VPC peering connection that you want to query.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewPeerConnection registers a new resource with the given unique name, arguments, and options.
func NewPeerConnection(ctx *pulumi.Context,
	name string, args *PeerConnectionArgs, opts ...pulumi.ResourceOption) (*PeerConnection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AcceptingRegionId == nil {
		return nil, errors.New("invalid value for required argument 'AcceptingRegionId'")
	}
	if args.AcceptingVpcId == nil {
		return nil, errors.New("invalid value for required argument 'AcceptingVpcId'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PeerConnection
	err := ctx.RegisterResource("alicloud:vpc/peerConnection:PeerConnection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPeerConnection gets an existing PeerConnection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPeerConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PeerConnectionState, opts ...pulumi.ResourceOption) (*PeerConnection, error) {
	var resource PeerConnection
	err := ctx.ReadResource("alicloud:vpc/peerConnection:PeerConnection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PeerConnection resources.
type peerConnectionState struct {
	// The ID of the Alibaba Cloud account to which the accepter VPC belongs.
	//
	// *   To create a VPC peering connection within your Alibaba Cloud account, enter the ID of your Alibaba Cloud account.
	// *   To create a VPC peering connection between your Alibaba Cloud account and another Alibaba Cloud account, enter the ID of the peer Alibaba Cloud account.
	//
	// > **NOTE:**   If the accepter is a RAM user, set `AcceptingAliUid` to the ID of the Alibaba Cloud account that created the RAM user.
	AcceptingAliUid *int `pulumi:"acceptingAliUid"`
	// The region ID of the accepter VPC of the VPC peering connection that you want to create.
	//
	// - To create an intra-region VPC peering connection, enter a region ID that is the same as that of the requester VPC.
	// - To create an inter-region VPC peering connection, enter a region ID that is different from that of the requester VPC.
	AcceptingRegionId *string `pulumi:"acceptingRegionId"`
	// The ID of the accepter VPC.
	AcceptingVpcId *string `pulumi:"acceptingVpcId"`
	// The bandwidth of the VPC peering connection. Unit: Mbit/s. The value must be an integer greater than 0. Before you specify this parameter, make sure that you create an inter-region VPC peering connection.
	Bandwidth *int `pulumi:"bandwidth"`
	// The creation time of the VPC peer connection. Use UTC time in the format' YYYY-MM-DDThh:mm:ssZ '.
	CreateTime *string `pulumi:"createTime"`
	// The description of the VPC peering connection.
	// The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
	Description *string `pulumi:"description"`
	// Specifies whether to perform only a dry run, without performing the actual request. Valid values:
	DryRun *bool `pulumi:"dryRun"`
	// Specifies whether to forcefully delete the VPC peering connection. Valid values:
	ForceDelete *bool `pulumi:"forceDelete"`
	// The link type of the VPC peering connection that you want to create. Valid values:
	// - Platinum.
	// - Gold: default value.
	//
	// > **NOTE:**
	//
	// > **NOTE:**  - If you need to specify this parameter, ensure that the VPC peering connection is an inter-region connection.
	LinkType *string `pulumi:"linkType"`
	// The name of the VPC peering connection.
	// The name must be 2 to 128 characters in length, and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.
	PeerConnectionName *string `pulumi:"peerConnectionName"`
	// The region ID of the resource to which you want to create and add tags.
	RegionId *string `pulumi:"regionId"`
	// The ID of the new resource group.
	//
	// > **NOTE:**   You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see [What is resource management?](https://www.alibabacloud.com/help/en/doc-detail/94475.html)
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource
	Status *string `pulumi:"status"`
	// The tags of VpcPeer.
	Tags map[string]string `pulumi:"tags"`
	// The ID of the requester VPC or accepter VPC of the VPC peering connection that you want to query.
	VpcId *string `pulumi:"vpcId"`
}

type PeerConnectionState struct {
	// The ID of the Alibaba Cloud account to which the accepter VPC belongs.
	//
	// *   To create a VPC peering connection within your Alibaba Cloud account, enter the ID of your Alibaba Cloud account.
	// *   To create a VPC peering connection between your Alibaba Cloud account and another Alibaba Cloud account, enter the ID of the peer Alibaba Cloud account.
	//
	// > **NOTE:**   If the accepter is a RAM user, set `AcceptingAliUid` to the ID of the Alibaba Cloud account that created the RAM user.
	AcceptingAliUid pulumi.IntPtrInput
	// The region ID of the accepter VPC of the VPC peering connection that you want to create.
	//
	// - To create an intra-region VPC peering connection, enter a region ID that is the same as that of the requester VPC.
	// - To create an inter-region VPC peering connection, enter a region ID that is different from that of the requester VPC.
	AcceptingRegionId pulumi.StringPtrInput
	// The ID of the accepter VPC.
	AcceptingVpcId pulumi.StringPtrInput
	// The bandwidth of the VPC peering connection. Unit: Mbit/s. The value must be an integer greater than 0. Before you specify this parameter, make sure that you create an inter-region VPC peering connection.
	Bandwidth pulumi.IntPtrInput
	// The creation time of the VPC peer connection. Use UTC time in the format' YYYY-MM-DDThh:mm:ssZ '.
	CreateTime pulumi.StringPtrInput
	// The description of the VPC peering connection.
	// The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
	Description pulumi.StringPtrInput
	// Specifies whether to perform only a dry run, without performing the actual request. Valid values:
	DryRun pulumi.BoolPtrInput
	// Specifies whether to forcefully delete the VPC peering connection. Valid values:
	ForceDelete pulumi.BoolPtrInput
	// The link type of the VPC peering connection that you want to create. Valid values:
	// - Platinum.
	// - Gold: default value.
	//
	// > **NOTE:**
	//
	// > **NOTE:**  - If you need to specify this parameter, ensure that the VPC peering connection is an inter-region connection.
	LinkType pulumi.StringPtrInput
	// The name of the VPC peering connection.
	// The name must be 2 to 128 characters in length, and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.
	PeerConnectionName pulumi.StringPtrInput
	// The region ID of the resource to which you want to create and add tags.
	RegionId pulumi.StringPtrInput
	// The ID of the new resource group.
	//
	// > **NOTE:**   You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see [What is resource management?](https://www.alibabacloud.com/help/en/doc-detail/94475.html)
	ResourceGroupId pulumi.StringPtrInput
	// The status of the resource
	Status pulumi.StringPtrInput
	// The tags of VpcPeer.
	Tags pulumi.StringMapInput
	// The ID of the requester VPC or accepter VPC of the VPC peering connection that you want to query.
	VpcId pulumi.StringPtrInput
}

func (PeerConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*peerConnectionState)(nil)).Elem()
}

type peerConnectionArgs struct {
	// The ID of the Alibaba Cloud account to which the accepter VPC belongs.
	//
	// *   To create a VPC peering connection within your Alibaba Cloud account, enter the ID of your Alibaba Cloud account.
	// *   To create a VPC peering connection between your Alibaba Cloud account and another Alibaba Cloud account, enter the ID of the peer Alibaba Cloud account.
	//
	// > **NOTE:**   If the accepter is a RAM user, set `AcceptingAliUid` to the ID of the Alibaba Cloud account that created the RAM user.
	AcceptingAliUid *int `pulumi:"acceptingAliUid"`
	// The region ID of the accepter VPC of the VPC peering connection that you want to create.
	//
	// - To create an intra-region VPC peering connection, enter a region ID that is the same as that of the requester VPC.
	// - To create an inter-region VPC peering connection, enter a region ID that is different from that of the requester VPC.
	AcceptingRegionId string `pulumi:"acceptingRegionId"`
	// The ID of the accepter VPC.
	AcceptingVpcId string `pulumi:"acceptingVpcId"`
	// The bandwidth of the VPC peering connection. Unit: Mbit/s. The value must be an integer greater than 0. Before you specify this parameter, make sure that you create an inter-region VPC peering connection.
	Bandwidth *int `pulumi:"bandwidth"`
	// The description of the VPC peering connection.
	// The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
	Description *string `pulumi:"description"`
	// Specifies whether to perform only a dry run, without performing the actual request. Valid values:
	DryRun *bool `pulumi:"dryRun"`
	// Specifies whether to forcefully delete the VPC peering connection. Valid values:
	ForceDelete *bool `pulumi:"forceDelete"`
	// The link type of the VPC peering connection that you want to create. Valid values:
	// - Platinum.
	// - Gold: default value.
	//
	// > **NOTE:**
	//
	// > **NOTE:**  - If you need to specify this parameter, ensure that the VPC peering connection is an inter-region connection.
	LinkType *string `pulumi:"linkType"`
	// The name of the VPC peering connection.
	// The name must be 2 to 128 characters in length, and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.
	PeerConnectionName *string `pulumi:"peerConnectionName"`
	// The ID of the new resource group.
	//
	// > **NOTE:**   You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see [What is resource management?](https://www.alibabacloud.com/help/en/doc-detail/94475.html)
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource
	Status *string `pulumi:"status"`
	// The tags of VpcPeer.
	Tags map[string]string `pulumi:"tags"`
	// The ID of the requester VPC or accepter VPC of the VPC peering connection that you want to query.
	VpcId string `pulumi:"vpcId"`
}

// The set of arguments for constructing a PeerConnection resource.
type PeerConnectionArgs struct {
	// The ID of the Alibaba Cloud account to which the accepter VPC belongs.
	//
	// *   To create a VPC peering connection within your Alibaba Cloud account, enter the ID of your Alibaba Cloud account.
	// *   To create a VPC peering connection between your Alibaba Cloud account and another Alibaba Cloud account, enter the ID of the peer Alibaba Cloud account.
	//
	// > **NOTE:**   If the accepter is a RAM user, set `AcceptingAliUid` to the ID of the Alibaba Cloud account that created the RAM user.
	AcceptingAliUid pulumi.IntPtrInput
	// The region ID of the accepter VPC of the VPC peering connection that you want to create.
	//
	// - To create an intra-region VPC peering connection, enter a region ID that is the same as that of the requester VPC.
	// - To create an inter-region VPC peering connection, enter a region ID that is different from that of the requester VPC.
	AcceptingRegionId pulumi.StringInput
	// The ID of the accepter VPC.
	AcceptingVpcId pulumi.StringInput
	// The bandwidth of the VPC peering connection. Unit: Mbit/s. The value must be an integer greater than 0. Before you specify this parameter, make sure that you create an inter-region VPC peering connection.
	Bandwidth pulumi.IntPtrInput
	// The description of the VPC peering connection.
	// The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
	Description pulumi.StringPtrInput
	// Specifies whether to perform only a dry run, without performing the actual request. Valid values:
	DryRun pulumi.BoolPtrInput
	// Specifies whether to forcefully delete the VPC peering connection. Valid values:
	ForceDelete pulumi.BoolPtrInput
	// The link type of the VPC peering connection that you want to create. Valid values:
	// - Platinum.
	// - Gold: default value.
	//
	// > **NOTE:**
	//
	// > **NOTE:**  - If you need to specify this parameter, ensure that the VPC peering connection is an inter-region connection.
	LinkType pulumi.StringPtrInput
	// The name of the VPC peering connection.
	// The name must be 2 to 128 characters in length, and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.
	PeerConnectionName pulumi.StringPtrInput
	// The ID of the new resource group.
	//
	// > **NOTE:**   You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see [What is resource management?](https://www.alibabacloud.com/help/en/doc-detail/94475.html)
	ResourceGroupId pulumi.StringPtrInput
	// The status of the resource
	Status pulumi.StringPtrInput
	// The tags of VpcPeer.
	Tags pulumi.StringMapInput
	// The ID of the requester VPC or accepter VPC of the VPC peering connection that you want to query.
	VpcId pulumi.StringInput
}

func (PeerConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*peerConnectionArgs)(nil)).Elem()
}

type PeerConnectionInput interface {
	pulumi.Input

	ToPeerConnectionOutput() PeerConnectionOutput
	ToPeerConnectionOutputWithContext(ctx context.Context) PeerConnectionOutput
}

func (*PeerConnection) ElementType() reflect.Type {
	return reflect.TypeOf((**PeerConnection)(nil)).Elem()
}

func (i *PeerConnection) ToPeerConnectionOutput() PeerConnectionOutput {
	return i.ToPeerConnectionOutputWithContext(context.Background())
}

func (i *PeerConnection) ToPeerConnectionOutputWithContext(ctx context.Context) PeerConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PeerConnectionOutput)
}

// PeerConnectionArrayInput is an input type that accepts PeerConnectionArray and PeerConnectionArrayOutput values.
// You can construct a concrete instance of `PeerConnectionArrayInput` via:
//
//	PeerConnectionArray{ PeerConnectionArgs{...} }
type PeerConnectionArrayInput interface {
	pulumi.Input

	ToPeerConnectionArrayOutput() PeerConnectionArrayOutput
	ToPeerConnectionArrayOutputWithContext(context.Context) PeerConnectionArrayOutput
}

type PeerConnectionArray []PeerConnectionInput

func (PeerConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PeerConnection)(nil)).Elem()
}

func (i PeerConnectionArray) ToPeerConnectionArrayOutput() PeerConnectionArrayOutput {
	return i.ToPeerConnectionArrayOutputWithContext(context.Background())
}

func (i PeerConnectionArray) ToPeerConnectionArrayOutputWithContext(ctx context.Context) PeerConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PeerConnectionArrayOutput)
}

// PeerConnectionMapInput is an input type that accepts PeerConnectionMap and PeerConnectionMapOutput values.
// You can construct a concrete instance of `PeerConnectionMapInput` via:
//
//	PeerConnectionMap{ "key": PeerConnectionArgs{...} }
type PeerConnectionMapInput interface {
	pulumi.Input

	ToPeerConnectionMapOutput() PeerConnectionMapOutput
	ToPeerConnectionMapOutputWithContext(context.Context) PeerConnectionMapOutput
}

type PeerConnectionMap map[string]PeerConnectionInput

func (PeerConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PeerConnection)(nil)).Elem()
}

func (i PeerConnectionMap) ToPeerConnectionMapOutput() PeerConnectionMapOutput {
	return i.ToPeerConnectionMapOutputWithContext(context.Background())
}

func (i PeerConnectionMap) ToPeerConnectionMapOutputWithContext(ctx context.Context) PeerConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PeerConnectionMapOutput)
}

type PeerConnectionOutput struct{ *pulumi.OutputState }

func (PeerConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PeerConnection)(nil)).Elem()
}

func (o PeerConnectionOutput) ToPeerConnectionOutput() PeerConnectionOutput {
	return o
}

func (o PeerConnectionOutput) ToPeerConnectionOutputWithContext(ctx context.Context) PeerConnectionOutput {
	return o
}

// The ID of the Alibaba Cloud account to which the accepter VPC belongs.
//
// *   To create a VPC peering connection within your Alibaba Cloud account, enter the ID of your Alibaba Cloud account.
// *   To create a VPC peering connection between your Alibaba Cloud account and another Alibaba Cloud account, enter the ID of the peer Alibaba Cloud account.
//
// > **NOTE:**   If the accepter is a RAM user, set `AcceptingAliUid` to the ID of the Alibaba Cloud account that created the RAM user.
func (o PeerConnectionOutput) AcceptingAliUid() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.IntPtrOutput { return v.AcceptingAliUid }).(pulumi.IntPtrOutput)
}

// The region ID of the accepter VPC of the VPC peering connection that you want to create.
//
// - To create an intra-region VPC peering connection, enter a region ID that is the same as that of the requester VPC.
// - To create an inter-region VPC peering connection, enter a region ID that is different from that of the requester VPC.
func (o PeerConnectionOutput) AcceptingRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.AcceptingRegionId }).(pulumi.StringOutput)
}

// The ID of the accepter VPC.
func (o PeerConnectionOutput) AcceptingVpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.AcceptingVpcId }).(pulumi.StringOutput)
}

// The bandwidth of the VPC peering connection. Unit: Mbit/s. The value must be an integer greater than 0. Before you specify this parameter, make sure that you create an inter-region VPC peering connection.
func (o PeerConnectionOutput) Bandwidth() pulumi.IntOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.IntOutput { return v.Bandwidth }).(pulumi.IntOutput)
}

// The creation time of the VPC peer connection. Use UTC time in the format' YYYY-MM-DDThh:mm:ssZ '.
func (o PeerConnectionOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The description of the VPC peering connection.
// The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
func (o PeerConnectionOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Specifies whether to perform only a dry run, without performing the actual request. Valid values:
func (o PeerConnectionOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// Specifies whether to forcefully delete the VPC peering connection. Valid values:
func (o PeerConnectionOutput) ForceDelete() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.BoolPtrOutput { return v.ForceDelete }).(pulumi.BoolPtrOutput)
}

// The link type of the VPC peering connection that you want to create. Valid values:
// - Platinum.
// - Gold: default value.
//
// > **NOTE:**
//
// > **NOTE:**  - If you need to specify this parameter, ensure that the VPC peering connection is an inter-region connection.
func (o PeerConnectionOutput) LinkType() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.LinkType }).(pulumi.StringOutput)
}

// The name of the VPC peering connection.
// The name must be 2 to 128 characters in length, and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.
func (o PeerConnectionOutput) PeerConnectionName() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.PeerConnectionName }).(pulumi.StringOutput)
}

// The region ID of the resource to which you want to create and add tags.
func (o PeerConnectionOutput) RegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.RegionId }).(pulumi.StringOutput)
}

// The ID of the new resource group.
//
// > **NOTE:**   You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see [What is resource management?](https://www.alibabacloud.com/help/en/doc-detail/94475.html)
func (o PeerConnectionOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The status of the resource
func (o PeerConnectionOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tags of VpcPeer.
func (o PeerConnectionOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The ID of the requester VPC or accepter VPC of the VPC peering connection that you want to query.
func (o PeerConnectionOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type PeerConnectionArrayOutput struct{ *pulumi.OutputState }

func (PeerConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PeerConnection)(nil)).Elem()
}

func (o PeerConnectionArrayOutput) ToPeerConnectionArrayOutput() PeerConnectionArrayOutput {
	return o
}

func (o PeerConnectionArrayOutput) ToPeerConnectionArrayOutputWithContext(ctx context.Context) PeerConnectionArrayOutput {
	return o
}

func (o PeerConnectionArrayOutput) Index(i pulumi.IntInput) PeerConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PeerConnection {
		return vs[0].([]*PeerConnection)[vs[1].(int)]
	}).(PeerConnectionOutput)
}

type PeerConnectionMapOutput struct{ *pulumi.OutputState }

func (PeerConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PeerConnection)(nil)).Elem()
}

func (o PeerConnectionMapOutput) ToPeerConnectionMapOutput() PeerConnectionMapOutput {
	return o
}

func (o PeerConnectionMapOutput) ToPeerConnectionMapOutputWithContext(ctx context.Context) PeerConnectionMapOutput {
	return o
}

func (o PeerConnectionMapOutput) MapIndex(k pulumi.StringInput) PeerConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PeerConnection {
		return vs[0].(map[string]*PeerConnection)[vs[1].(string)]
	}).(PeerConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PeerConnectionInput)(nil)).Elem(), &PeerConnection{})
	pulumi.RegisterInputType(reflect.TypeOf((*PeerConnectionArrayInput)(nil)).Elem(), PeerConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PeerConnectionMapInput)(nil)).Elem(), PeerConnectionMap{})
	pulumi.RegisterOutputType(PeerConnectionOutput{})
	pulumi.RegisterOutputType(PeerConnectionArrayOutput{})
	pulumi.RegisterOutputType(PeerConnectionMapOutput{})
}
