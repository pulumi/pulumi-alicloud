// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Cen Transit Router Vpn Attachments of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.183.0+.
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
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := cen.GetTransitRouterVpnAttachments(ctx, &cen.GetTransitRouterVpnAttachmentsArgs{
//				CenId: "example_value",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("cenTransitRouterVpnAttachmentId1", ids.Attachments[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetTransitRouterVpnAttachments(ctx *pulumi.Context, args *GetTransitRouterVpnAttachmentsArgs, opts ...pulumi.InvokeOption) (*GetTransitRouterVpnAttachmentsResult, error) {
	var rv GetTransitRouterVpnAttachmentsResult
	err := ctx.Invoke("alicloud:cen/getTransitRouterVpnAttachments:getTransitRouterVpnAttachments", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransitRouterVpnAttachments.
type GetTransitRouterVpnAttachmentsArgs struct {
	// The id of the cen.
	CenId string `pulumi:"cenId"`
	// A list of Transit Router Vpn Attachment IDs.
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the transit router attachment.
	Status *string `pulumi:"status"`
	// The ID of the forwarding router instance.
	TransitRouterId *string `pulumi:"transitRouterId"`
}

// A collection of values returned by getTransitRouterVpnAttachments.
type GetTransitRouterVpnAttachmentsResult struct {
	Attachments []GetTransitRouterVpnAttachmentsAttachment `pulumi:"attachments"`
	CenId       string                                     `pulumi:"cenId"`
	// The provider-assigned unique ID for this managed resource.
	Id              string   `pulumi:"id"`
	Ids             []string `pulumi:"ids"`
	NameRegex       *string  `pulumi:"nameRegex"`
	Names           []string `pulumi:"names"`
	OutputFile      *string  `pulumi:"outputFile"`
	Status          *string  `pulumi:"status"`
	TransitRouterId *string  `pulumi:"transitRouterId"`
}

func GetTransitRouterVpnAttachmentsOutput(ctx *pulumi.Context, args GetTransitRouterVpnAttachmentsOutputArgs, opts ...pulumi.InvokeOption) GetTransitRouterVpnAttachmentsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTransitRouterVpnAttachmentsResult, error) {
			args := v.(GetTransitRouterVpnAttachmentsArgs)
			r, err := GetTransitRouterVpnAttachments(ctx, &args, opts...)
			var s GetTransitRouterVpnAttachmentsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetTransitRouterVpnAttachmentsResultOutput)
}

// A collection of arguments for invoking getTransitRouterVpnAttachments.
type GetTransitRouterVpnAttachmentsOutputArgs struct {
	// The id of the cen.
	CenId pulumi.StringInput `pulumi:"cenId"`
	// A list of Transit Router Vpn Attachment IDs.
	Ids        pulumi.StringArrayInput `pulumi:"ids"`
	NameRegex  pulumi.StringPtrInput   `pulumi:"nameRegex"`
	OutputFile pulumi.StringPtrInput   `pulumi:"outputFile"`
	// The status of the transit router attachment.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The ID of the forwarding router instance.
	TransitRouterId pulumi.StringPtrInput `pulumi:"transitRouterId"`
}

func (GetTransitRouterVpnAttachmentsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterVpnAttachmentsArgs)(nil)).Elem()
}

// A collection of values returned by getTransitRouterVpnAttachments.
type GetTransitRouterVpnAttachmentsResultOutput struct{ *pulumi.OutputState }

func (GetTransitRouterVpnAttachmentsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterVpnAttachmentsResult)(nil)).Elem()
}

func (o GetTransitRouterVpnAttachmentsResultOutput) ToGetTransitRouterVpnAttachmentsResultOutput() GetTransitRouterVpnAttachmentsResultOutput {
	return o
}

func (o GetTransitRouterVpnAttachmentsResultOutput) ToGetTransitRouterVpnAttachmentsResultOutputWithContext(ctx context.Context) GetTransitRouterVpnAttachmentsResultOutput {
	return o
}

func (o GetTransitRouterVpnAttachmentsResultOutput) Attachments() GetTransitRouterVpnAttachmentsAttachmentArrayOutput {
	return o.ApplyT(func(v GetTransitRouterVpnAttachmentsResult) []GetTransitRouterVpnAttachmentsAttachment {
		return v.Attachments
	}).(GetTransitRouterVpnAttachmentsAttachmentArrayOutput)
}

func (o GetTransitRouterVpnAttachmentsResultOutput) CenId() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterVpnAttachmentsResult) string { return v.CenId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetTransitRouterVpnAttachmentsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterVpnAttachmentsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTransitRouterVpnAttachmentsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTransitRouterVpnAttachmentsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetTransitRouterVpnAttachmentsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterVpnAttachmentsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetTransitRouterVpnAttachmentsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTransitRouterVpnAttachmentsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetTransitRouterVpnAttachmentsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterVpnAttachmentsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetTransitRouterVpnAttachmentsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterVpnAttachmentsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetTransitRouterVpnAttachmentsResultOutput) TransitRouterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterVpnAttachmentsResult) *string { return v.TransitRouterId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTransitRouterVpnAttachmentsResultOutput{})
}