// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ots

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the ots tunnels of the current Alibaba Cloud user.
//
// For information about OTS tunnel and how to use it, see [Tunnel overview](https://www.alibabacloud.com/help/en/tablestore/latest/tunnel-service-overview).
//
// > **NOTE:** Available in v1.172.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ots"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tunnelsDs, err := ots.GetTunnels(ctx, &ots.GetTunnelsArgs{
//				InstanceName: "sample-instance",
//				NameRegex:    pulumi.StringRef("sample-tunnel"),
//				OutputFile:   pulumi.StringRef("tunnels.txt"),
//				TableName:    "sample-table",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstTunnelId", tunnelsDs.Tunnels[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetTunnels(ctx *pulumi.Context, args *GetTunnelsArgs, opts ...pulumi.InvokeOption) (*GetTunnelsResult, error) {
	var rv GetTunnelsResult
	err := ctx.Invoke("alicloud:ots/getTunnels:getTunnels", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTunnels.
type GetTunnelsArgs struct {
	// A list of tunnel IDs.
	Ids []string `pulumi:"ids"`
	// The name of OTS instance.
	InstanceName string `pulumi:"instanceName"`
	// A regex string to filter results by tunnel name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The name of OTS table.
	TableName string `pulumi:"tableName"`
}

// A collection of values returned by getTunnels.
type GetTunnelsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of tunnel IDs.
	Ids []string `pulumi:"ids"`
	// The OTS instance name.
	InstanceName string  `pulumi:"instanceName"`
	NameRegex    *string `pulumi:"nameRegex"`
	// A list of tunnel names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// The table name of the OTS which could not be changed.
	TableName string `pulumi:"tableName"`
	// A list of tunnels. Each element contains the following attributes:
	Tunnels []GetTunnelsTunnel `pulumi:"tunnels"`
}

func GetTunnelsOutput(ctx *pulumi.Context, args GetTunnelsOutputArgs, opts ...pulumi.InvokeOption) GetTunnelsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTunnelsResult, error) {
			args := v.(GetTunnelsArgs)
			r, err := GetTunnels(ctx, &args, opts...)
			var s GetTunnelsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetTunnelsResultOutput)
}

// A collection of arguments for invoking getTunnels.
type GetTunnelsOutputArgs struct {
	// A list of tunnel IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The name of OTS instance.
	InstanceName pulumi.StringInput `pulumi:"instanceName"`
	// A regex string to filter results by tunnel name.
	NameRegex  pulumi.StringPtrInput `pulumi:"nameRegex"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The name of OTS table.
	TableName pulumi.StringInput `pulumi:"tableName"`
}

func (GetTunnelsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTunnelsArgs)(nil)).Elem()
}

// A collection of values returned by getTunnels.
type GetTunnelsResultOutput struct{ *pulumi.OutputState }

func (GetTunnelsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTunnelsResult)(nil)).Elem()
}

func (o GetTunnelsResultOutput) ToGetTunnelsResultOutput() GetTunnelsResultOutput {
	return o
}

func (o GetTunnelsResultOutput) ToGetTunnelsResultOutputWithContext(ctx context.Context) GetTunnelsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetTunnelsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTunnelsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of tunnel IDs.
func (o GetTunnelsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTunnelsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// The OTS instance name.
func (o GetTunnelsResultOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v GetTunnelsResult) string { return v.InstanceName }).(pulumi.StringOutput)
}

func (o GetTunnelsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTunnelsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of tunnel names.
func (o GetTunnelsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTunnelsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetTunnelsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTunnelsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The table name of the OTS which could not be changed.
func (o GetTunnelsResultOutput) TableName() pulumi.StringOutput {
	return o.ApplyT(func(v GetTunnelsResult) string { return v.TableName }).(pulumi.StringOutput)
}

// A list of tunnels. Each element contains the following attributes:
func (o GetTunnelsResultOutput) Tunnels() GetTunnelsTunnelArrayOutput {
	return o.ApplyT(func(v GetTunnelsResult) []GetTunnelsTunnel { return v.Tunnels }).(GetTunnelsTunnelArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTunnelsResultOutput{})
}