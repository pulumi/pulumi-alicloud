// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides CEN Transit Router Route Table Associations available to the user.[What is Cen Transit Router Route Table Associations](https://help.aliyun.com/document_detail/261243.html)
//
// > **NOTE:** Available in 1.126.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := cen.GetTransitRouterRouteTableAssociations(ctx, &cen.GetTransitRouterRouteTableAssociationsArgs{
//				TransitRouterRouteTableId: pulumi.StringRef("rtb-id1"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstTransitRouterPeerAttachmentsTransitRouterAttachmentResourceType", _default.Associations[0].ResourceType)
//			return nil
//		})
//	}
//
// ```
func GetTransitRouterRouteTableAssociations(ctx *pulumi.Context, args *GetTransitRouterRouteTableAssociationsArgs, opts ...pulumi.InvokeOption) (*GetTransitRouterRouteTableAssociationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTransitRouterRouteTableAssociationsResult
	err := ctx.Invoke("alicloud:cen/getTransitRouterRouteTableAssociations:getTransitRouterRouteTableAssociations", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransitRouterRouteTableAssociations.
type GetTransitRouterRouteTableAssociationsArgs struct {
	// A list of CEN Transit Router Route Table Association IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the route table, including `Active`, `Associating`, `Dissociating`.
	Status *string `pulumi:"status"`
	// The ID of the network instance connection.
	TransitRouterAttachmentId *string `pulumi:"transitRouterAttachmentId"`
	// The ID of the next hop.
	TransitRouterAttachmentResourceId *string `pulumi:"transitRouterAttachmentResourceId"`
	// The type of next hop. Valid values:
	// * `VPC`: virtual private cloud (VPC)
	// * `VBR`: virtual border router (VBR)
	// * `TR`: transit router
	// * `VPN`: VPN attachment
	TransitRouterAttachmentResourceType *string `pulumi:"transitRouterAttachmentResourceType"`
	// The ID of the route table of the Enterprise Edition transit router.
	TransitRouterRouteTableId *string `pulumi:"transitRouterRouteTableId"`
}

// A collection of values returned by getTransitRouterRouteTableAssociations.
type GetTransitRouterRouteTableAssociationsResult struct {
	// A list of CEN Transit Router Route Table Associations. Each element contains the following attributes:
	Associations []GetTransitRouterRouteTableAssociationsAssociation `pulumi:"associations"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of CEN Transit Router Route Table Association IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the route table.
	Status *string `pulumi:"status"`
	// ID of the transit router attachment.
	TransitRouterAttachmentId           *string `pulumi:"transitRouterAttachmentId"`
	TransitRouterAttachmentResourceId   *string `pulumi:"transitRouterAttachmentResourceId"`
	TransitRouterAttachmentResourceType *string `pulumi:"transitRouterAttachmentResourceType"`
	// ID of the transit router route table.
	TransitRouterRouteTableId *string `pulumi:"transitRouterRouteTableId"`
}

func GetTransitRouterRouteTableAssociationsOutput(ctx *pulumi.Context, args GetTransitRouterRouteTableAssociationsOutputArgs, opts ...pulumi.InvokeOption) GetTransitRouterRouteTableAssociationsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetTransitRouterRouteTableAssociationsResultOutput, error) {
			args := v.(GetTransitRouterRouteTableAssociationsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:cen/getTransitRouterRouteTableAssociations:getTransitRouterRouteTableAssociations", args, GetTransitRouterRouteTableAssociationsResultOutput{}, options).(GetTransitRouterRouteTableAssociationsResultOutput), nil
		}).(GetTransitRouterRouteTableAssociationsResultOutput)
}

// A collection of arguments for invoking getTransitRouterRouteTableAssociations.
type GetTransitRouterRouteTableAssociationsOutputArgs struct {
	// A list of CEN Transit Router Route Table Association IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the route table, including `Active`, `Associating`, `Dissociating`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The ID of the network instance connection.
	TransitRouterAttachmentId pulumi.StringPtrInput `pulumi:"transitRouterAttachmentId"`
	// The ID of the next hop.
	TransitRouterAttachmentResourceId pulumi.StringPtrInput `pulumi:"transitRouterAttachmentResourceId"`
	// The type of next hop. Valid values:
	// * `VPC`: virtual private cloud (VPC)
	// * `VBR`: virtual border router (VBR)
	// * `TR`: transit router
	// * `VPN`: VPN attachment
	TransitRouterAttachmentResourceType pulumi.StringPtrInput `pulumi:"transitRouterAttachmentResourceType"`
	// The ID of the route table of the Enterprise Edition transit router.
	TransitRouterRouteTableId pulumi.StringPtrInput `pulumi:"transitRouterRouteTableId"`
}

func (GetTransitRouterRouteTableAssociationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterRouteTableAssociationsArgs)(nil)).Elem()
}

// A collection of values returned by getTransitRouterRouteTableAssociations.
type GetTransitRouterRouteTableAssociationsResultOutput struct{ *pulumi.OutputState }

func (GetTransitRouterRouteTableAssociationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterRouteTableAssociationsResult)(nil)).Elem()
}

func (o GetTransitRouterRouteTableAssociationsResultOutput) ToGetTransitRouterRouteTableAssociationsResultOutput() GetTransitRouterRouteTableAssociationsResultOutput {
	return o
}

func (o GetTransitRouterRouteTableAssociationsResultOutput) ToGetTransitRouterRouteTableAssociationsResultOutputWithContext(ctx context.Context) GetTransitRouterRouteTableAssociationsResultOutput {
	return o
}

// A list of CEN Transit Router Route Table Associations. Each element contains the following attributes:
func (o GetTransitRouterRouteTableAssociationsResultOutput) Associations() GetTransitRouterRouteTableAssociationsAssociationArrayOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTableAssociationsResult) []GetTransitRouterRouteTableAssociationsAssociation {
		return v.Associations
	}).(GetTransitRouterRouteTableAssociationsAssociationArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetTransitRouterRouteTableAssociationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTableAssociationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of CEN Transit Router Route Table Association IDs.
func (o GetTransitRouterRouteTableAssociationsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTableAssociationsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetTransitRouterRouteTableAssociationsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTableAssociationsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The status of the route table.
func (o GetTransitRouterRouteTableAssociationsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTableAssociationsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// ID of the transit router attachment.
func (o GetTransitRouterRouteTableAssociationsResultOutput) TransitRouterAttachmentId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTableAssociationsResult) *string { return v.TransitRouterAttachmentId }).(pulumi.StringPtrOutput)
}

func (o GetTransitRouterRouteTableAssociationsResultOutput) TransitRouterAttachmentResourceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTableAssociationsResult) *string {
		return v.TransitRouterAttachmentResourceId
	}).(pulumi.StringPtrOutput)
}

func (o GetTransitRouterRouteTableAssociationsResultOutput) TransitRouterAttachmentResourceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTableAssociationsResult) *string {
		return v.TransitRouterAttachmentResourceType
	}).(pulumi.StringPtrOutput)
}

// ID of the transit router route table.
func (o GetTransitRouterRouteTableAssociationsResultOutput) TransitRouterRouteTableId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTableAssociationsResult) *string { return v.TransitRouterRouteTableId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTransitRouterRouteTableAssociationsResultOutput{})
}
