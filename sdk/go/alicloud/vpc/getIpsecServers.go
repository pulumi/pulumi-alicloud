// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Vpn Ipsec Servers of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.161.0+.
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
//			ids, err := vpc.GetIpsecServers(ctx, &vpc.GetIpsecServersArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpnIpsecServerId1", ids.Servers[0].Id)
//			nameRegex, err := vpc.GetIpsecServers(ctx, &vpc.GetIpsecServersArgs{
//				NameRegex: pulumi.StringRef("^my-IpsecServer"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpnIpsecServerId2", nameRegex.Servers[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetIpsecServers(ctx *pulumi.Context, args *GetIpsecServersArgs, opts ...pulumi.InvokeOption) (*GetIpsecServersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetIpsecServersResult
	err := ctx.Invoke("alicloud:vpc/getIpsecServers:getIpsecServers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIpsecServers.
type GetIpsecServersArgs struct {
	// A list of Ipsec Server IDs.
	Ids []string `pulumi:"ids"`
	// The name of the IPsec server.
	IpsecServerName *string `pulumi:"ipsecServerName"`
	// A regex string to filter results by Ipsec Server name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the VPN gateway.
	VpnGatewayId *string `pulumi:"vpnGatewayId"`
}

// A collection of values returned by getIpsecServers.
type GetIpsecServersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
	// The name of the IPsec server.
	IpsecServerName *string `pulumi:"ipsecServerName"`
	NameRegex       *string `pulumi:"nameRegex"`
	// A list of Ipsec Server names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of Vpn Ipsec Servers. Each element contains the following attributes:
	Servers []GetIpsecServersServer `pulumi:"servers"`
	// The ID of the VPN gateway.
	VpnGatewayId *string `pulumi:"vpnGatewayId"`
}

func GetIpsecServersOutput(ctx *pulumi.Context, args GetIpsecServersOutputArgs, opts ...pulumi.InvokeOption) GetIpsecServersResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetIpsecServersResultOutput, error) {
			args := v.(GetIpsecServersArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:vpc/getIpsecServers:getIpsecServers", args, GetIpsecServersResultOutput{}, options).(GetIpsecServersResultOutput), nil
		}).(GetIpsecServersResultOutput)
}

// A collection of arguments for invoking getIpsecServers.
type GetIpsecServersOutputArgs struct {
	// A list of Ipsec Server IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The name of the IPsec server.
	IpsecServerName pulumi.StringPtrInput `pulumi:"ipsecServerName"`
	// A regex string to filter results by Ipsec Server name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the VPN gateway.
	VpnGatewayId pulumi.StringPtrInput `pulumi:"vpnGatewayId"`
}

func (GetIpsecServersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIpsecServersArgs)(nil)).Elem()
}

// A collection of values returned by getIpsecServers.
type GetIpsecServersResultOutput struct{ *pulumi.OutputState }

func (GetIpsecServersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIpsecServersResult)(nil)).Elem()
}

func (o GetIpsecServersResultOutput) ToGetIpsecServersResultOutput() GetIpsecServersResultOutput {
	return o
}

func (o GetIpsecServersResultOutput) ToGetIpsecServersResultOutputWithContext(ctx context.Context) GetIpsecServersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetIpsecServersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetIpsecServersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetIpsecServersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetIpsecServersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// The name of the IPsec server.
func (o GetIpsecServersResultOutput) IpsecServerName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetIpsecServersResult) *string { return v.IpsecServerName }).(pulumi.StringPtrOutput)
}

func (o GetIpsecServersResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetIpsecServersResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of Ipsec Server names.
func (o GetIpsecServersResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetIpsecServersResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetIpsecServersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetIpsecServersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of Vpn Ipsec Servers. Each element contains the following attributes:
func (o GetIpsecServersResultOutput) Servers() GetIpsecServersServerArrayOutput {
	return o.ApplyT(func(v GetIpsecServersResult) []GetIpsecServersServer { return v.Servers }).(GetIpsecServersServerArrayOutput)
}

// The ID of the VPN gateway.
func (o GetIpsecServersResultOutput) VpnGatewayId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetIpsecServersResult) *string { return v.VpnGatewayId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetIpsecServersResultOutput{})
}
