// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of Alidns Domain Groups in an Alibaba Cloud account according to the specified filters.
//
// > **NOTE:**  Available in 1.85.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := dns.GetAlidnsDomainGroups(ctx, &dns.GetAlidnsDomainGroupsArgs{
//				Ids: []string{
//					"c5ef2bc43064445787adf182af2****",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstDomainGroupId", example.Groups[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetAlidnsDomainGroups(ctx *pulumi.Context, args *GetAlidnsDomainGroupsArgs, opts ...pulumi.InvokeOption) (*GetAlidnsDomainGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAlidnsDomainGroupsResult
	err := ctx.Invoke("alicloud:dns/getAlidnsDomainGroups:getAlidnsDomainGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAlidnsDomainGroups.
type GetAlidnsDomainGroupsArgs struct {
	// A list of instance IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by the domain group name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getAlidnsDomainGroups.
type GetAlidnsDomainGroupsResult struct {
	// A list of instances. Each element contains the following attributes:
	Groups []GetAlidnsDomainGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of instance IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of domain group names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetAlidnsDomainGroupsOutput(ctx *pulumi.Context, args GetAlidnsDomainGroupsOutputArgs, opts ...pulumi.InvokeOption) GetAlidnsDomainGroupsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetAlidnsDomainGroupsResultOutput, error) {
			args := v.(GetAlidnsDomainGroupsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:dns/getAlidnsDomainGroups:getAlidnsDomainGroups", args, GetAlidnsDomainGroupsResultOutput{}, options).(GetAlidnsDomainGroupsResultOutput), nil
		}).(GetAlidnsDomainGroupsResultOutput)
}

// A collection of arguments for invoking getAlidnsDomainGroups.
type GetAlidnsDomainGroupsOutputArgs struct {
	// A list of instance IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by the domain group name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetAlidnsDomainGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAlidnsDomainGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getAlidnsDomainGroups.
type GetAlidnsDomainGroupsResultOutput struct{ *pulumi.OutputState }

func (GetAlidnsDomainGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAlidnsDomainGroupsResult)(nil)).Elem()
}

func (o GetAlidnsDomainGroupsResultOutput) ToGetAlidnsDomainGroupsResultOutput() GetAlidnsDomainGroupsResultOutput {
	return o
}

func (o GetAlidnsDomainGroupsResultOutput) ToGetAlidnsDomainGroupsResultOutputWithContext(ctx context.Context) GetAlidnsDomainGroupsResultOutput {
	return o
}

// A list of instances. Each element contains the following attributes:
func (o GetAlidnsDomainGroupsResultOutput) Groups() GetAlidnsDomainGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetAlidnsDomainGroupsResult) []GetAlidnsDomainGroupsGroup { return v.Groups }).(GetAlidnsDomainGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAlidnsDomainGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAlidnsDomainGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of instance IDs.
func (o GetAlidnsDomainGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAlidnsDomainGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetAlidnsDomainGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAlidnsDomainGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of domain group names.
func (o GetAlidnsDomainGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAlidnsDomainGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetAlidnsDomainGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAlidnsDomainGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAlidnsDomainGroupsResultOutput{})
}
