// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the CEN Transit Router Route Table Propagations of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.126.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/expressconnect"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
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
//			_default, err := expressconnect.GetPhysicalConnections(ctx, &expressconnect.GetPhysicalConnectionsArgs{
//				NameRegex: pulumi.StringRef("^preserved-NODELETING"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultInteger, err := random.NewInteger(ctx, "default", &random.IntegerArgs{
//				Min: 1,
//				Max: 2999,
//			})
//			if err != nil {
//				return err
//			}
//			defaultInstance, err := cen.NewInstance(ctx, "default", &cen.InstanceArgs{
//				CenInstanceName: pulumi.String(name),
//				ProtectionLevel: pulumi.String("REDUCED"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultTransitRouter, err := cen.NewTransitRouter(ctx, "default", &cen.TransitRouterArgs{
//				CenId: defaultInstance.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			defaultVirtualBorderRouter, err := expressconnect.NewVirtualBorderRouter(ctx, "default", &expressconnect.VirtualBorderRouterArgs{
//				LocalGatewayIp:          pulumi.String("10.0.0.1"),
//				PeerGatewayIp:           pulumi.String("10.0.0.2"),
//				PeeringSubnetMask:       pulumi.String("255.255.255.252"),
//				PhysicalConnectionId:    pulumi.String(_default.Connections[0].Id),
//				VirtualBorderRouterName: pulumi.String(name),
//				VlanId:                  defaultInteger.Id,
//				MinRxInterval:           pulumi.Int(1000),
//				MinTxInterval:           pulumi.Int(1000),
//				DetectMultiplier:        pulumi.Int(10),
//			})
//			if err != nil {
//				return err
//			}
//			defaultTransitRouterVbrAttachment, err := cen.NewTransitRouterVbrAttachment(ctx, "default", &cen.TransitRouterVbrAttachmentArgs{
//				CenId:                              defaultInstance.ID(),
//				TransitRouterId:                    defaultTransitRouter.TransitRouterId,
//				VbrId:                              defaultVirtualBorderRouter.ID(),
//				AutoPublishRouteEnabled:            pulumi.Bool(true),
//				TransitRouterAttachmentName:        pulumi.String(name),
//				TransitRouterAttachmentDescription: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			defaultTransitRouterRouteTable, err := cen.NewTransitRouterRouteTable(ctx, "default", &cen.TransitRouterRouteTableArgs{
//				TransitRouterId:             defaultTransitRouter.TransitRouterId,
//				TransitRouterRouteTableName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			defaultTransitRouterRouteTablePropagation, err := cen.NewTransitRouterRouteTablePropagation(ctx, "default", &cen.TransitRouterRouteTablePropagationArgs{
//				TransitRouterAttachmentId: defaultTransitRouterVbrAttachment.TransitRouterAttachmentId,
//				TransitRouterRouteTableId: defaultTransitRouterRouteTable.TransitRouterRouteTableId,
//			})
//			if err != nil {
//				return err
//			}
//			ids := cen.GetTransitRouterRouteTablePropagationsOutput(ctx, cen.GetTransitRouterRouteTablePropagationsOutputArgs{
//				TransitRouterRouteTableId: defaultTransitRouterRouteTablePropagation.TransitRouterRouteTableId,
//				Ids: pulumi.StringArray{
//					defaultTransitRouterRouteTablePropagation.TransitRouterAttachmentId,
//				},
//			}, nil)
//			ctx.Export("cenTransitRouterRouteTablePropagationId0", ids.ApplyT(func(ids cen.GetTransitRouterRouteTablePropagationsResult) (*string, error) {
//				return &ids.Propagations[0].Id, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
func GetTransitRouterRouteTablePropagations(ctx *pulumi.Context, args *GetTransitRouterRouteTablePropagationsArgs, opts ...pulumi.InvokeOption) (*GetTransitRouterRouteTablePropagationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTransitRouterRouteTablePropagationsResult
	err := ctx.Invoke("alicloud:cen/getTransitRouterRouteTablePropagations:getTransitRouterRouteTablePropagations", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransitRouterRouteTablePropagations.
type GetTransitRouterRouteTablePropagationsArgs struct {
	// A list of Transit Router Route Table Propagation IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the route learning correlation. Valid values: `Active`, `Enabling`, `Disabling`.
	Status *string `pulumi:"status"`
	// The ID of the network instance connection.
	TransitRouterAttachmentId *string `pulumi:"transitRouterAttachmentId"`
	// The ID of the route table of the Enterprise Edition transit router.
	TransitRouterRouteTableId string `pulumi:"transitRouterRouteTableId"`
}

// A collection of values returned by getTransitRouterRouteTablePropagations.
type GetTransitRouterRouteTablePropagationsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of Transit Router Route Table Propagations. Each element contains the following attributes:
	Propagations []GetTransitRouterRouteTablePropagationsPropagation `pulumi:"propagations"`
	// The status of the route learning correlation.
	Status *string `pulumi:"status"`
	// The ID of the network instance connection.
	TransitRouterAttachmentId *string `pulumi:"transitRouterAttachmentId"`
	// The ID of the route table of the Enterprise Edition transit router.
	TransitRouterRouteTableId string `pulumi:"transitRouterRouteTableId"`
}

func GetTransitRouterRouteTablePropagationsOutput(ctx *pulumi.Context, args GetTransitRouterRouteTablePropagationsOutputArgs, opts ...pulumi.InvokeOption) GetTransitRouterRouteTablePropagationsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetTransitRouterRouteTablePropagationsResultOutput, error) {
			args := v.(GetTransitRouterRouteTablePropagationsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:cen/getTransitRouterRouteTablePropagations:getTransitRouterRouteTablePropagations", args, GetTransitRouterRouteTablePropagationsResultOutput{}, options).(GetTransitRouterRouteTablePropagationsResultOutput), nil
		}).(GetTransitRouterRouteTablePropagationsResultOutput)
}

// A collection of arguments for invoking getTransitRouterRouteTablePropagations.
type GetTransitRouterRouteTablePropagationsOutputArgs struct {
	// A list of Transit Router Route Table Propagation IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the route learning correlation. Valid values: `Active`, `Enabling`, `Disabling`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The ID of the network instance connection.
	TransitRouterAttachmentId pulumi.StringPtrInput `pulumi:"transitRouterAttachmentId"`
	// The ID of the route table of the Enterprise Edition transit router.
	TransitRouterRouteTableId pulumi.StringInput `pulumi:"transitRouterRouteTableId"`
}

func (GetTransitRouterRouteTablePropagationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterRouteTablePropagationsArgs)(nil)).Elem()
}

// A collection of values returned by getTransitRouterRouteTablePropagations.
type GetTransitRouterRouteTablePropagationsResultOutput struct{ *pulumi.OutputState }

func (GetTransitRouterRouteTablePropagationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterRouteTablePropagationsResult)(nil)).Elem()
}

func (o GetTransitRouterRouteTablePropagationsResultOutput) ToGetTransitRouterRouteTablePropagationsResultOutput() GetTransitRouterRouteTablePropagationsResultOutput {
	return o
}

func (o GetTransitRouterRouteTablePropagationsResultOutput) ToGetTransitRouterRouteTablePropagationsResultOutputWithContext(ctx context.Context) GetTransitRouterRouteTablePropagationsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetTransitRouterRouteTablePropagationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablePropagationsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTransitRouterRouteTablePropagationsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablePropagationsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetTransitRouterRouteTablePropagationsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablePropagationsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of Transit Router Route Table Propagations. Each element contains the following attributes:
func (o GetTransitRouterRouteTablePropagationsResultOutput) Propagations() GetTransitRouterRouteTablePropagationsPropagationArrayOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablePropagationsResult) []GetTransitRouterRouteTablePropagationsPropagation {
		return v.Propagations
	}).(GetTransitRouterRouteTablePropagationsPropagationArrayOutput)
}

// The status of the route learning correlation.
func (o GetTransitRouterRouteTablePropagationsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablePropagationsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// The ID of the network instance connection.
func (o GetTransitRouterRouteTablePropagationsResultOutput) TransitRouterAttachmentId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablePropagationsResult) *string { return v.TransitRouterAttachmentId }).(pulumi.StringPtrOutput)
}

// The ID of the route table of the Enterprise Edition transit router.
func (o GetTransitRouterRouteTablePropagationsResultOutput) TransitRouterRouteTableId() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablePropagationsResult) string { return v.TransitRouterRouteTableId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTransitRouterRouteTablePropagationsResultOutput{})
}
