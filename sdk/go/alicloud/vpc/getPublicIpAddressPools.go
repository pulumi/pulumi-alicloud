// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Vpc Public Ip Address Pools of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.186.0+.
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
//			ids, err := vpc.GetPublicIpAddressPools(ctx, &vpc.GetPublicIpAddressPoolsArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcPublicIpAddressPoolId1", ids.Pools[0].Id)
//			nameRegex, err := vpc.GetPublicIpAddressPools(ctx, &vpc.GetPublicIpAddressPoolsArgs{
//				NameRegex: pulumi.StringRef("example_name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcPublicIpAddressPoolId2", nameRegex.Pools[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetPublicIpAddressPools(ctx *pulumi.Context, args *GetPublicIpAddressPoolsArgs, opts ...pulumi.InvokeOption) (*GetPublicIpAddressPoolsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPublicIpAddressPoolsResult
	err := ctx.Invoke("alicloud:vpc/getPublicIpAddressPools:getPublicIpAddressPools", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPublicIpAddressPools.
type GetPublicIpAddressPoolsArgs struct {
	// A list of Vpc Public Ip Address Pool IDs.
	Ids []string `pulumi:"ids"`
	// The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`.
	Isp *string `pulumi:"isp"`
	// A regex string to filter results by Vpc Public Ip Address Pool name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The IDs of the Vpc Public IP address pools.
	PublicIpAddressPoolIds []string `pulumi:"publicIpAddressPoolIds"`
	// The name of the VPC Public IP address pool.
	PublicIpAddressPoolName *string `pulumi:"publicIpAddressPoolName"`
	// The status of the Vpc Public Ip Address Pool. Valid values: `Created`, `Deleting`, `Modifying`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getPublicIpAddressPools.
type GetPublicIpAddressPoolsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id                      string                        `pulumi:"id"`
	Ids                     []string                      `pulumi:"ids"`
	Isp                     *string                       `pulumi:"isp"`
	NameRegex               *string                       `pulumi:"nameRegex"`
	Names                   []string                      `pulumi:"names"`
	OutputFile              *string                       `pulumi:"outputFile"`
	Pools                   []GetPublicIpAddressPoolsPool `pulumi:"pools"`
	PublicIpAddressPoolIds  []string                      `pulumi:"publicIpAddressPoolIds"`
	PublicIpAddressPoolName *string                       `pulumi:"publicIpAddressPoolName"`
	Status                  *string                       `pulumi:"status"`
}

func GetPublicIpAddressPoolsOutput(ctx *pulumi.Context, args GetPublicIpAddressPoolsOutputArgs, opts ...pulumi.InvokeOption) GetPublicIpAddressPoolsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetPublicIpAddressPoolsResultOutput, error) {
			args := v.(GetPublicIpAddressPoolsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:vpc/getPublicIpAddressPools:getPublicIpAddressPools", args, GetPublicIpAddressPoolsResultOutput{}, options).(GetPublicIpAddressPoolsResultOutput), nil
		}).(GetPublicIpAddressPoolsResultOutput)
}

// A collection of arguments for invoking getPublicIpAddressPools.
type GetPublicIpAddressPoolsOutputArgs struct {
	// A list of Vpc Public Ip Address Pool IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`.
	Isp pulumi.StringPtrInput `pulumi:"isp"`
	// A regex string to filter results by Vpc Public Ip Address Pool name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The IDs of the Vpc Public IP address pools.
	PublicIpAddressPoolIds pulumi.StringArrayInput `pulumi:"publicIpAddressPoolIds"`
	// The name of the VPC Public IP address pool.
	PublicIpAddressPoolName pulumi.StringPtrInput `pulumi:"publicIpAddressPoolName"`
	// The status of the Vpc Public Ip Address Pool. Valid values: `Created`, `Deleting`, `Modifying`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetPublicIpAddressPoolsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPublicIpAddressPoolsArgs)(nil)).Elem()
}

// A collection of values returned by getPublicIpAddressPools.
type GetPublicIpAddressPoolsResultOutput struct{ *pulumi.OutputState }

func (GetPublicIpAddressPoolsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPublicIpAddressPoolsResult)(nil)).Elem()
}

func (o GetPublicIpAddressPoolsResultOutput) ToGetPublicIpAddressPoolsResultOutput() GetPublicIpAddressPoolsResultOutput {
	return o
}

func (o GetPublicIpAddressPoolsResultOutput) ToGetPublicIpAddressPoolsResultOutputWithContext(ctx context.Context) GetPublicIpAddressPoolsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetPublicIpAddressPoolsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPublicIpAddressPoolsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetPublicIpAddressPoolsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPublicIpAddressPoolsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetPublicIpAddressPoolsResultOutput) Isp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPublicIpAddressPoolsResult) *string { return v.Isp }).(pulumi.StringPtrOutput)
}

func (o GetPublicIpAddressPoolsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPublicIpAddressPoolsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetPublicIpAddressPoolsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPublicIpAddressPoolsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetPublicIpAddressPoolsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPublicIpAddressPoolsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetPublicIpAddressPoolsResultOutput) Pools() GetPublicIpAddressPoolsPoolArrayOutput {
	return o.ApplyT(func(v GetPublicIpAddressPoolsResult) []GetPublicIpAddressPoolsPool { return v.Pools }).(GetPublicIpAddressPoolsPoolArrayOutput)
}

func (o GetPublicIpAddressPoolsResultOutput) PublicIpAddressPoolIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPublicIpAddressPoolsResult) []string { return v.PublicIpAddressPoolIds }).(pulumi.StringArrayOutput)
}

func (o GetPublicIpAddressPoolsResultOutput) PublicIpAddressPoolName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPublicIpAddressPoolsResult) *string { return v.PublicIpAddressPoolName }).(pulumi.StringPtrOutput)
}

func (o GetPublicIpAddressPoolsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPublicIpAddressPoolsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPublicIpAddressPoolsResultOutput{})
}
