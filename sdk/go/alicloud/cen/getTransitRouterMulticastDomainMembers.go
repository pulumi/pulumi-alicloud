// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides Cen Transit Router Multicast Domain Member available to the user. [What is Transit Router Multicast Domain Member](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-registertransitroutermulticastgroupmembers)
//
// > **NOTE:** Available since v1.195.0.
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
//			_default, err := cen.GetTransitRouterMulticastDomainMembers(ctx, &cen.GetTransitRouterMulticastDomainMembersArgs{
//				TransitRouterMulticastDomainId: "tr-mcast-domain-2d9oq455uk533zfr29",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("alicloudCenTransitRouterMulticastDomainMemberExampleId", _default.Members[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetTransitRouterMulticastDomainMembers(ctx *pulumi.Context, args *GetTransitRouterMulticastDomainMembersArgs, opts ...pulumi.InvokeOption) (*GetTransitRouterMulticastDomainMembersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTransitRouterMulticastDomainMembersResult
	err := ctx.Invoke("alicloud:cen/getTransitRouterMulticastDomainMembers:getTransitRouterMulticastDomainMembers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransitRouterMulticastDomainMembers.
type GetTransitRouterMulticastDomainMembersArgs struct {
	// A list of Transit Router Multicast Domain Member IDs.
	Ids []string `pulumi:"ids"`
	// The ID of the ENI.
	NetworkInterfaceId *string `pulumi:"networkInterfaceId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the multicast domain to which the multicast member belongs.
	TransitRouterMulticastDomainId string `pulumi:"transitRouterMulticastDomainId"`
}

// A collection of values returned by getTransitRouterMulticastDomainMembers.
type GetTransitRouterMulticastDomainMembersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
	// A list of Transit Router Multicast Domain Member Entries. Each element contains the following attributes:
	Members []GetTransitRouterMulticastDomainMembersMember `pulumi:"members"`
	// ENI ID of multicast member.
	NetworkInterfaceId *string `pulumi:"networkInterfaceId"`
	OutputFile         *string `pulumi:"outputFile"`
	// The ID of the multicast domain to which the multicast member belongs.
	TransitRouterMulticastDomainId string `pulumi:"transitRouterMulticastDomainId"`
}

func GetTransitRouterMulticastDomainMembersOutput(ctx *pulumi.Context, args GetTransitRouterMulticastDomainMembersOutputArgs, opts ...pulumi.InvokeOption) GetTransitRouterMulticastDomainMembersResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetTransitRouterMulticastDomainMembersResultOutput, error) {
			args := v.(GetTransitRouterMulticastDomainMembersArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:cen/getTransitRouterMulticastDomainMembers:getTransitRouterMulticastDomainMembers", args, GetTransitRouterMulticastDomainMembersResultOutput{}, options).(GetTransitRouterMulticastDomainMembersResultOutput), nil
		}).(GetTransitRouterMulticastDomainMembersResultOutput)
}

// A collection of arguments for invoking getTransitRouterMulticastDomainMembers.
type GetTransitRouterMulticastDomainMembersOutputArgs struct {
	// A list of Transit Router Multicast Domain Member IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The ID of the ENI.
	NetworkInterfaceId pulumi.StringPtrInput `pulumi:"networkInterfaceId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the multicast domain to which the multicast member belongs.
	TransitRouterMulticastDomainId pulumi.StringInput `pulumi:"transitRouterMulticastDomainId"`
}

func (GetTransitRouterMulticastDomainMembersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterMulticastDomainMembersArgs)(nil)).Elem()
}

// A collection of values returned by getTransitRouterMulticastDomainMembers.
type GetTransitRouterMulticastDomainMembersResultOutput struct{ *pulumi.OutputState }

func (GetTransitRouterMulticastDomainMembersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterMulticastDomainMembersResult)(nil)).Elem()
}

func (o GetTransitRouterMulticastDomainMembersResultOutput) ToGetTransitRouterMulticastDomainMembersResultOutput() GetTransitRouterMulticastDomainMembersResultOutput {
	return o
}

func (o GetTransitRouterMulticastDomainMembersResultOutput) ToGetTransitRouterMulticastDomainMembersResultOutputWithContext(ctx context.Context) GetTransitRouterMulticastDomainMembersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetTransitRouterMulticastDomainMembersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterMulticastDomainMembersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTransitRouterMulticastDomainMembersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTransitRouterMulticastDomainMembersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// A list of Transit Router Multicast Domain Member Entries. Each element contains the following attributes:
func (o GetTransitRouterMulticastDomainMembersResultOutput) Members() GetTransitRouterMulticastDomainMembersMemberArrayOutput {
	return o.ApplyT(func(v GetTransitRouterMulticastDomainMembersResult) []GetTransitRouterMulticastDomainMembersMember {
		return v.Members
	}).(GetTransitRouterMulticastDomainMembersMemberArrayOutput)
}

// ENI ID of multicast member.
func (o GetTransitRouterMulticastDomainMembersResultOutput) NetworkInterfaceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterMulticastDomainMembersResult) *string { return v.NetworkInterfaceId }).(pulumi.StringPtrOutput)
}

func (o GetTransitRouterMulticastDomainMembersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterMulticastDomainMembersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The ID of the multicast domain to which the multicast member belongs.
func (o GetTransitRouterMulticastDomainMembersResultOutput) TransitRouterMulticastDomainId() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterMulticastDomainMembersResult) string { return v.TransitRouterMulticastDomainId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTransitRouterMulticastDomainMembersResultOutput{})
}
