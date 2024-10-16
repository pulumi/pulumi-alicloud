// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Vpc Peer Connection resource.
//
// For information about VPC Peer Connection and how to use it, see [What is Peer Connection](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/createvpcpeer).
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
// Vpc Peer Connection can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:vpc/peerConnection:PeerConnection example <id>
// ```
type PeerConnection struct {
	pulumi.CustomResourceState

	// The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.
	// - Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.
	// - Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.
	//
	// > **NOTE:**  If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
	AcceptingAliUid pulumi.IntPtrOutput `pulumi:"acceptingAliUid"`
	// The region ID of the recipient of the VPC peering connection to be created.
	// - When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.
	// - When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
	AcceptingRegionId pulumi.StringOutput `pulumi:"acceptingRegionId"`
	// The VPC ID of the receiving end of the VPC peer connection.
	AcceptingVpcId pulumi.StringOutput `pulumi:"acceptingVpcId"`
	// The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
	Bandwidth pulumi.IntOutput `pulumi:"bandwidth"`
	// The creation time of the VPC peer connection. Use UTC time in the format' YYYY-MM-DDThh:mm:ssZ '.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The description of the VPC peer connection to be created.
	//
	// It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
	Description pulumi.StringOutput `pulumi:"description"`
	// Whether to PreCheck only this request. Value:
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// Whether to forcibly delete the VPC peering connection. Value:
	ForceDelete pulumi.BoolPtrOutput `pulumi:"forceDelete"`
	// The name of the resource.
	PeerConnectionName pulumi.StringOutput `pulumi:"peerConnectionName"`
	// The ID of resource group.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// The tags of the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// You must create a VPC ID on the initiator of a VPC peer connection.
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
	// The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.
	// - Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.
	// - Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.
	//
	// > **NOTE:**  If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
	AcceptingAliUid *int `pulumi:"acceptingAliUid"`
	// The region ID of the recipient of the VPC peering connection to be created.
	// - When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.
	// - When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
	AcceptingRegionId *string `pulumi:"acceptingRegionId"`
	// The VPC ID of the receiving end of the VPC peer connection.
	AcceptingVpcId *string `pulumi:"acceptingVpcId"`
	// The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
	Bandwidth *int `pulumi:"bandwidth"`
	// The creation time of the VPC peer connection. Use UTC time in the format' YYYY-MM-DDThh:mm:ssZ '.
	CreateTime *string `pulumi:"createTime"`
	// The description of the VPC peer connection to be created.
	//
	// It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
	Description *string `pulumi:"description"`
	// Whether to PreCheck only this request. Value:
	DryRun *bool `pulumi:"dryRun"`
	// Whether to forcibly delete the VPC peering connection. Value:
	ForceDelete *bool `pulumi:"forceDelete"`
	// The name of the resource.
	PeerConnectionName *string `pulumi:"peerConnectionName"`
	// The ID of resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The tags of the resource.
	Tags map[string]string `pulumi:"tags"`
	// You must create a VPC ID on the initiator of a VPC peer connection.
	VpcId *string `pulumi:"vpcId"`
}

type PeerConnectionState struct {
	// The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.
	// - Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.
	// - Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.
	//
	// > **NOTE:**  If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
	AcceptingAliUid pulumi.IntPtrInput
	// The region ID of the recipient of the VPC peering connection to be created.
	// - When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.
	// - When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
	AcceptingRegionId pulumi.StringPtrInput
	// The VPC ID of the receiving end of the VPC peer connection.
	AcceptingVpcId pulumi.StringPtrInput
	// The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
	Bandwidth pulumi.IntPtrInput
	// The creation time of the VPC peer connection. Use UTC time in the format' YYYY-MM-DDThh:mm:ssZ '.
	CreateTime pulumi.StringPtrInput
	// The description of the VPC peer connection to be created.
	//
	// It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
	Description pulumi.StringPtrInput
	// Whether to PreCheck only this request. Value:
	DryRun pulumi.BoolPtrInput
	// Whether to forcibly delete the VPC peering connection. Value:
	ForceDelete pulumi.BoolPtrInput
	// The name of the resource.
	PeerConnectionName pulumi.StringPtrInput
	// The ID of resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The tags of the resource.
	Tags pulumi.StringMapInput
	// You must create a VPC ID on the initiator of a VPC peer connection.
	VpcId pulumi.StringPtrInput
}

func (PeerConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*peerConnectionState)(nil)).Elem()
}

type peerConnectionArgs struct {
	// The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.
	// - Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.
	// - Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.
	//
	// > **NOTE:**  If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
	AcceptingAliUid *int `pulumi:"acceptingAliUid"`
	// The region ID of the recipient of the VPC peering connection to be created.
	// - When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.
	// - When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
	AcceptingRegionId string `pulumi:"acceptingRegionId"`
	// The VPC ID of the receiving end of the VPC peer connection.
	AcceptingVpcId string `pulumi:"acceptingVpcId"`
	// The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
	Bandwidth *int `pulumi:"bandwidth"`
	// The description of the VPC peer connection to be created.
	//
	// It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
	Description *string `pulumi:"description"`
	// Whether to PreCheck only this request. Value:
	DryRun *bool `pulumi:"dryRun"`
	// Whether to forcibly delete the VPC peering connection. Value:
	ForceDelete *bool `pulumi:"forceDelete"`
	// The name of the resource.
	PeerConnectionName *string `pulumi:"peerConnectionName"`
	// The ID of resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The tags of the resource.
	Tags map[string]string `pulumi:"tags"`
	// You must create a VPC ID on the initiator of a VPC peer connection.
	VpcId string `pulumi:"vpcId"`
}

// The set of arguments for constructing a PeerConnection resource.
type PeerConnectionArgs struct {
	// The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.
	// - Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.
	// - Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.
	//
	// > **NOTE:**  If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
	AcceptingAliUid pulumi.IntPtrInput
	// The region ID of the recipient of the VPC peering connection to be created.
	// - When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.
	// - When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
	AcceptingRegionId pulumi.StringInput
	// The VPC ID of the receiving end of the VPC peer connection.
	AcceptingVpcId pulumi.StringInput
	// The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
	Bandwidth pulumi.IntPtrInput
	// The description of the VPC peer connection to be created.
	//
	// It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
	Description pulumi.StringPtrInput
	// Whether to PreCheck only this request. Value:
	DryRun pulumi.BoolPtrInput
	// Whether to forcibly delete the VPC peering connection. Value:
	ForceDelete pulumi.BoolPtrInput
	// The name of the resource.
	PeerConnectionName pulumi.StringPtrInput
	// The ID of resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The tags of the resource.
	Tags pulumi.StringMapInput
	// You must create a VPC ID on the initiator of a VPC peer connection.
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

// The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.
// - Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.
// - Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.
//
// > **NOTE:**  If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
func (o PeerConnectionOutput) AcceptingAliUid() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.IntPtrOutput { return v.AcceptingAliUid }).(pulumi.IntPtrOutput)
}

// The region ID of the recipient of the VPC peering connection to be created.
// - When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.
// - When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
func (o PeerConnectionOutput) AcceptingRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.AcceptingRegionId }).(pulumi.StringOutput)
}

// The VPC ID of the receiving end of the VPC peer connection.
func (o PeerConnectionOutput) AcceptingVpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.AcceptingVpcId }).(pulumi.StringOutput)
}

// The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
func (o PeerConnectionOutput) Bandwidth() pulumi.IntOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.IntOutput { return v.Bandwidth }).(pulumi.IntOutput)
}

// The creation time of the VPC peer connection. Use UTC time in the format' YYYY-MM-DDThh:mm:ssZ '.
func (o PeerConnectionOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The description of the VPC peer connection to be created.
//
// It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
func (o PeerConnectionOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Whether to PreCheck only this request. Value:
func (o PeerConnectionOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// Whether to forcibly delete the VPC peering connection. Value:
func (o PeerConnectionOutput) ForceDelete() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.BoolPtrOutput { return v.ForceDelete }).(pulumi.BoolPtrOutput)
}

// The name of the resource.
func (o PeerConnectionOutput) PeerConnectionName() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.PeerConnectionName }).(pulumi.StringOutput)
}

// The ID of resource group.
func (o PeerConnectionOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The status of the resource.
func (o PeerConnectionOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tags of the resource.
func (o PeerConnectionOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PeerConnection) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// You must create a VPC ID on the initiator of a VPC peer connection.
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
