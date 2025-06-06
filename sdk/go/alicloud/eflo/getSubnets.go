// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eflo

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides Eflo Subnet available to the user.[What is Subnet](https://help.aliyun.com/document_detail/604977.html)
//
// > **NOTE:** Available in 1.204.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eflo"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := eflo.GetSubnets(ctx, &eflo.GetSubnetsArgs{
//				NameRegex:  pulumi.StringRef(defaultAlicloudEfloSubnet.Name),
//				SubnetName: pulumi.StringRef("SubnetTestForTerraform"),
//				VpdId:      pulumi.StringRef(vpdId),
//				ZoneId:     pulumi.StringRef(zoneId),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("alicloudEfloSubnetExampleId", _default.Subnets[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetSubnets(ctx *pulumi.Context, args *GetSubnetsArgs, opts ...pulumi.InvokeOption) (*GetSubnetsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSubnetsResult
	err := ctx.Invoke("alicloud:eflo/getSubnets:getSubnets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSubnets.
type GetSubnetsArgs struct {
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Group Metric Rule name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// Resource Group ID.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// Primary key ID.
	SubnetId *string `pulumi:"subnetId"`
	// The Subnet name.
	SubnetName *string `pulumi:"subnetName"`
	// Eflo subnet usage type, optional value:
	// - General type is not filled in
	// - OOB:OOB type
	// - LB: LB type
	Type *string `pulumi:"type"`
	// The Eflo VPD ID.
	VpdId *string `pulumi:"vpdId"`
	// The zone ID of the resource.
	ZoneId *string `pulumi:"zoneId"`
}

// A collection of values returned by getSubnets.
type GetSubnetsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string   `pulumi:"id"`
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of name of Subnets.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	PageNumber *int     `pulumi:"pageNumber"`
	PageSize   *int     `pulumi:"pageSize"`
	// Resource Group ID.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The Eflo subnet ID.
	SubnetId *string `pulumi:"subnetId"`
	// The Subnet name.
	SubnetName *string `pulumi:"subnetName"`
	// A list of Subnet Entries. Each element contains the following attributes:
	Subnets []GetSubnetsSubnet `pulumi:"subnets"`
	// Eflo subnet usage type.
	Type *string `pulumi:"type"`
	// Eflo VPD ID.
	VpdId *string `pulumi:"vpdId"`
	// The zone ID of the resource.
	ZoneId *string `pulumi:"zoneId"`
}

func GetSubnetsOutput(ctx *pulumi.Context, args GetSubnetsOutputArgs, opts ...pulumi.InvokeOption) GetSubnetsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSubnetsResultOutput, error) {
			args := v.(GetSubnetsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:eflo/getSubnets:getSubnets", args, GetSubnetsResultOutput{}, options).(GetSubnetsResultOutput), nil
		}).(GetSubnetsResultOutput)
}

// A collection of arguments for invoking getSubnets.
type GetSubnetsOutputArgs struct {
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Group Metric Rule name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// Resource Group ID.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// Primary key ID.
	SubnetId pulumi.StringPtrInput `pulumi:"subnetId"`
	// The Subnet name.
	SubnetName pulumi.StringPtrInput `pulumi:"subnetName"`
	// Eflo subnet usage type, optional value:
	// - General type is not filled in
	// - OOB:OOB type
	// - LB: LB type
	Type pulumi.StringPtrInput `pulumi:"type"`
	// The Eflo VPD ID.
	VpdId pulumi.StringPtrInput `pulumi:"vpdId"`
	// The zone ID of the resource.
	ZoneId pulumi.StringPtrInput `pulumi:"zoneId"`
}

func (GetSubnetsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSubnetsArgs)(nil)).Elem()
}

// A collection of values returned by getSubnets.
type GetSubnetsResultOutput struct{ *pulumi.OutputState }

func (GetSubnetsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSubnetsResult)(nil)).Elem()
}

func (o GetSubnetsResultOutput) ToGetSubnetsResultOutput() GetSubnetsResultOutput {
	return o
}

func (o GetSubnetsResultOutput) ToGetSubnetsResultOutputWithContext(ctx context.Context) GetSubnetsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSubnetsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSubnetsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSubnetsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSubnetsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSubnetsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSubnetsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of name of Subnets.
func (o GetSubnetsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSubnetsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetSubnetsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSubnetsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetSubnetsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetSubnetsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetSubnetsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetSubnetsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

// Resource Group ID.
func (o GetSubnetsResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSubnetsResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// The status of the resource.
func (o GetSubnetsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSubnetsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// The Eflo subnet ID.
func (o GetSubnetsResultOutput) SubnetId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSubnetsResult) *string { return v.SubnetId }).(pulumi.StringPtrOutput)
}

// The Subnet name.
func (o GetSubnetsResultOutput) SubnetName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSubnetsResult) *string { return v.SubnetName }).(pulumi.StringPtrOutput)
}

// A list of Subnet Entries. Each element contains the following attributes:
func (o GetSubnetsResultOutput) Subnets() GetSubnetsSubnetArrayOutput {
	return o.ApplyT(func(v GetSubnetsResult) []GetSubnetsSubnet { return v.Subnets }).(GetSubnetsSubnetArrayOutput)
}

// Eflo subnet usage type.
func (o GetSubnetsResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSubnetsResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

// Eflo VPD ID.
func (o GetSubnetsResultOutput) VpdId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSubnetsResult) *string { return v.VpdId }).(pulumi.StringPtrOutput)
}

// The zone ID of the resource.
func (o GetSubnetsResultOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSubnetsResult) *string { return v.ZoneId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSubnetsResultOutput{})
}
