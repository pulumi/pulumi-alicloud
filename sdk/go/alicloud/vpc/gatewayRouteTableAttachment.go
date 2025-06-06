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

// Provides a VPC Gateway Route Table Attachment resource.
//
// For information about VPC Gateway Route Table Attachment and how to use it, see [What is Gateway Route Table Attachment](https://www.alibabacloud.com/help/doc-detail/174112.htm).
//
// > **NOTE:** Available since v1.194.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := vpc.NewNetwork(ctx, "example", &vpc.NetworkArgs{
//				CidrBlock: pulumi.String("172.16.0.0/12"),
//				VpcName:   pulumi.String("terraform-example"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleRouteTable, err := vpc.NewRouteTable(ctx, "example", &vpc.RouteTableArgs{
//				VpcId:          example.ID(),
//				RouteTableName: pulumi.String("terraform-example"),
//				Description:    pulumi.String("terraform-example"),
//				AssociateType:  pulumi.String("Gateway"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleIpv4Gateway, err := vpc.NewIpv4Gateway(ctx, "example", &vpc.Ipv4GatewayArgs{
//				Ipv4GatewayName: pulumi.String("terraform-example"),
//				VpcId:           example.ID(),
//				Enabled:         pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewGatewayRouteTableAttachment(ctx, "example", &vpc.GatewayRouteTableAttachmentArgs{
//				Ipv4GatewayId: exampleIpv4Gateway.ID(),
//				RouteTableId:  exampleRouteTable.ID(),
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
// VPC Gateway Route Table Attachment can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:vpc/gatewayRouteTableAttachment:GatewayRouteTableAttachment example <route_table_id>:<ipv4_gateway_id>
// ```
type GatewayRouteTableAttachment struct {
	pulumi.CustomResourceState

	// The creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Specifies whether to only precheck this request. Default value: `false`.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// The ID of the IPv4 Gateway instance.
	Ipv4GatewayId pulumi.StringOutput `pulumi:"ipv4GatewayId"`
	// The ID of the Gateway route table to be bound.
	RouteTableId pulumi.StringOutput `pulumi:"routeTableId"`
	// The status of the IPv4 Gateway instance. Value:
	// - **Creating**: The function is being created.
	// - **Created**: Created and available.
	// - **Modifying**: is being modified.
	// - **Deleting**: Deleting.
	// - **Deleted**: Deleted.
	// - **Activating**: enabled.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewGatewayRouteTableAttachment registers a new resource with the given unique name, arguments, and options.
func NewGatewayRouteTableAttachment(ctx *pulumi.Context,
	name string, args *GatewayRouteTableAttachmentArgs, opts ...pulumi.ResourceOption) (*GatewayRouteTableAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Ipv4GatewayId == nil {
		return nil, errors.New("invalid value for required argument 'Ipv4GatewayId'")
	}
	if args.RouteTableId == nil {
		return nil, errors.New("invalid value for required argument 'RouteTableId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GatewayRouteTableAttachment
	err := ctx.RegisterResource("alicloud:vpc/gatewayRouteTableAttachment:GatewayRouteTableAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGatewayRouteTableAttachment gets an existing GatewayRouteTableAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGatewayRouteTableAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewayRouteTableAttachmentState, opts ...pulumi.ResourceOption) (*GatewayRouteTableAttachment, error) {
	var resource GatewayRouteTableAttachment
	err := ctx.ReadResource("alicloud:vpc/gatewayRouteTableAttachment:GatewayRouteTableAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GatewayRouteTableAttachment resources.
type gatewayRouteTableAttachmentState struct {
	// The creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// Specifies whether to only precheck this request. Default value: `false`.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the IPv4 Gateway instance.
	Ipv4GatewayId *string `pulumi:"ipv4GatewayId"`
	// The ID of the Gateway route table to be bound.
	RouteTableId *string `pulumi:"routeTableId"`
	// The status of the IPv4 Gateway instance. Value:
	// - **Creating**: The function is being created.
	// - **Created**: Created and available.
	// - **Modifying**: is being modified.
	// - **Deleting**: Deleting.
	// - **Deleted**: Deleted.
	// - **Activating**: enabled.
	Status *string `pulumi:"status"`
}

type GatewayRouteTableAttachmentState struct {
	// The creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// Specifies whether to only precheck this request. Default value: `false`.
	DryRun pulumi.BoolPtrInput
	// The ID of the IPv4 Gateway instance.
	Ipv4GatewayId pulumi.StringPtrInput
	// The ID of the Gateway route table to be bound.
	RouteTableId pulumi.StringPtrInput
	// The status of the IPv4 Gateway instance. Value:
	// - **Creating**: The function is being created.
	// - **Created**: Created and available.
	// - **Modifying**: is being modified.
	// - **Deleting**: Deleting.
	// - **Deleted**: Deleted.
	// - **Activating**: enabled.
	Status pulumi.StringPtrInput
}

func (GatewayRouteTableAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayRouteTableAttachmentState)(nil)).Elem()
}

type gatewayRouteTableAttachmentArgs struct {
	// Specifies whether to only precheck this request. Default value: `false`.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the IPv4 Gateway instance.
	Ipv4GatewayId string `pulumi:"ipv4GatewayId"`
	// The ID of the Gateway route table to be bound.
	RouteTableId string `pulumi:"routeTableId"`
}

// The set of arguments for constructing a GatewayRouteTableAttachment resource.
type GatewayRouteTableAttachmentArgs struct {
	// Specifies whether to only precheck this request. Default value: `false`.
	DryRun pulumi.BoolPtrInput
	// The ID of the IPv4 Gateway instance.
	Ipv4GatewayId pulumi.StringInput
	// The ID of the Gateway route table to be bound.
	RouteTableId pulumi.StringInput
}

func (GatewayRouteTableAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayRouteTableAttachmentArgs)(nil)).Elem()
}

type GatewayRouteTableAttachmentInput interface {
	pulumi.Input

	ToGatewayRouteTableAttachmentOutput() GatewayRouteTableAttachmentOutput
	ToGatewayRouteTableAttachmentOutputWithContext(ctx context.Context) GatewayRouteTableAttachmentOutput
}

func (*GatewayRouteTableAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayRouteTableAttachment)(nil)).Elem()
}

func (i *GatewayRouteTableAttachment) ToGatewayRouteTableAttachmentOutput() GatewayRouteTableAttachmentOutput {
	return i.ToGatewayRouteTableAttachmentOutputWithContext(context.Background())
}

func (i *GatewayRouteTableAttachment) ToGatewayRouteTableAttachmentOutputWithContext(ctx context.Context) GatewayRouteTableAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayRouteTableAttachmentOutput)
}

// GatewayRouteTableAttachmentArrayInput is an input type that accepts GatewayRouteTableAttachmentArray and GatewayRouteTableAttachmentArrayOutput values.
// You can construct a concrete instance of `GatewayRouteTableAttachmentArrayInput` via:
//
//	GatewayRouteTableAttachmentArray{ GatewayRouteTableAttachmentArgs{...} }
type GatewayRouteTableAttachmentArrayInput interface {
	pulumi.Input

	ToGatewayRouteTableAttachmentArrayOutput() GatewayRouteTableAttachmentArrayOutput
	ToGatewayRouteTableAttachmentArrayOutputWithContext(context.Context) GatewayRouteTableAttachmentArrayOutput
}

type GatewayRouteTableAttachmentArray []GatewayRouteTableAttachmentInput

func (GatewayRouteTableAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewayRouteTableAttachment)(nil)).Elem()
}

func (i GatewayRouteTableAttachmentArray) ToGatewayRouteTableAttachmentArrayOutput() GatewayRouteTableAttachmentArrayOutput {
	return i.ToGatewayRouteTableAttachmentArrayOutputWithContext(context.Background())
}

func (i GatewayRouteTableAttachmentArray) ToGatewayRouteTableAttachmentArrayOutputWithContext(ctx context.Context) GatewayRouteTableAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayRouteTableAttachmentArrayOutput)
}

// GatewayRouteTableAttachmentMapInput is an input type that accepts GatewayRouteTableAttachmentMap and GatewayRouteTableAttachmentMapOutput values.
// You can construct a concrete instance of `GatewayRouteTableAttachmentMapInput` via:
//
//	GatewayRouteTableAttachmentMap{ "key": GatewayRouteTableAttachmentArgs{...} }
type GatewayRouteTableAttachmentMapInput interface {
	pulumi.Input

	ToGatewayRouteTableAttachmentMapOutput() GatewayRouteTableAttachmentMapOutput
	ToGatewayRouteTableAttachmentMapOutputWithContext(context.Context) GatewayRouteTableAttachmentMapOutput
}

type GatewayRouteTableAttachmentMap map[string]GatewayRouteTableAttachmentInput

func (GatewayRouteTableAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewayRouteTableAttachment)(nil)).Elem()
}

func (i GatewayRouteTableAttachmentMap) ToGatewayRouteTableAttachmentMapOutput() GatewayRouteTableAttachmentMapOutput {
	return i.ToGatewayRouteTableAttachmentMapOutputWithContext(context.Background())
}

func (i GatewayRouteTableAttachmentMap) ToGatewayRouteTableAttachmentMapOutputWithContext(ctx context.Context) GatewayRouteTableAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayRouteTableAttachmentMapOutput)
}

type GatewayRouteTableAttachmentOutput struct{ *pulumi.OutputState }

func (GatewayRouteTableAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayRouteTableAttachment)(nil)).Elem()
}

func (o GatewayRouteTableAttachmentOutput) ToGatewayRouteTableAttachmentOutput() GatewayRouteTableAttachmentOutput {
	return o
}

func (o GatewayRouteTableAttachmentOutput) ToGatewayRouteTableAttachmentOutputWithContext(ctx context.Context) GatewayRouteTableAttachmentOutput {
	return o
}

// The creation time of the resource.
func (o GatewayRouteTableAttachmentOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayRouteTableAttachment) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Specifies whether to only precheck this request. Default value: `false`.
func (o GatewayRouteTableAttachmentOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GatewayRouteTableAttachment) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// The ID of the IPv4 Gateway instance.
func (o GatewayRouteTableAttachmentOutput) Ipv4GatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayRouteTableAttachment) pulumi.StringOutput { return v.Ipv4GatewayId }).(pulumi.StringOutput)
}

// The ID of the Gateway route table to be bound.
func (o GatewayRouteTableAttachmentOutput) RouteTableId() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayRouteTableAttachment) pulumi.StringOutput { return v.RouteTableId }).(pulumi.StringOutput)
}

// The status of the IPv4 Gateway instance. Value:
// - **Creating**: The function is being created.
// - **Created**: Created and available.
// - **Modifying**: is being modified.
// - **Deleting**: Deleting.
// - **Deleted**: Deleted.
// - **Activating**: enabled.
func (o GatewayRouteTableAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayRouteTableAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type GatewayRouteTableAttachmentArrayOutput struct{ *pulumi.OutputState }

func (GatewayRouteTableAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewayRouteTableAttachment)(nil)).Elem()
}

func (o GatewayRouteTableAttachmentArrayOutput) ToGatewayRouteTableAttachmentArrayOutput() GatewayRouteTableAttachmentArrayOutput {
	return o
}

func (o GatewayRouteTableAttachmentArrayOutput) ToGatewayRouteTableAttachmentArrayOutputWithContext(ctx context.Context) GatewayRouteTableAttachmentArrayOutput {
	return o
}

func (o GatewayRouteTableAttachmentArrayOutput) Index(i pulumi.IntInput) GatewayRouteTableAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GatewayRouteTableAttachment {
		return vs[0].([]*GatewayRouteTableAttachment)[vs[1].(int)]
	}).(GatewayRouteTableAttachmentOutput)
}

type GatewayRouteTableAttachmentMapOutput struct{ *pulumi.OutputState }

func (GatewayRouteTableAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewayRouteTableAttachment)(nil)).Elem()
}

func (o GatewayRouteTableAttachmentMapOutput) ToGatewayRouteTableAttachmentMapOutput() GatewayRouteTableAttachmentMapOutput {
	return o
}

func (o GatewayRouteTableAttachmentMapOutput) ToGatewayRouteTableAttachmentMapOutputWithContext(ctx context.Context) GatewayRouteTableAttachmentMapOutput {
	return o
}

func (o GatewayRouteTableAttachmentMapOutput) MapIndex(k pulumi.StringInput) GatewayRouteTableAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GatewayRouteTableAttachment {
		return vs[0].(map[string]*GatewayRouteTableAttachment)[vs[1].(string)]
	}).(GatewayRouteTableAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayRouteTableAttachmentInput)(nil)).Elem(), &GatewayRouteTableAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayRouteTableAttachmentArrayInput)(nil)).Elem(), GatewayRouteTableAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayRouteTableAttachmentMapInput)(nil)).Elem(), GatewayRouteTableAttachmentMap{})
	pulumi.RegisterOutputType(GatewayRouteTableAttachmentOutput{})
	pulumi.RegisterOutputType(GatewayRouteTableAttachmentArrayOutput{})
	pulumi.RegisterOutputType(GatewayRouteTableAttachmentMapOutput{})
}
