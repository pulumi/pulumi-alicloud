// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ga

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides Ga Domain available to the user.[What is Domain](https://www.alibabacloud.com/help/en/global-accelerator/latest/createdomain)
//
// > **NOTE:** Available in 1.197.0+
func GetDomains(ctx *pulumi.Context, args *GetDomainsArgs, opts ...pulumi.InvokeOption) (*GetDomainsResult, error) {
	var rv GetDomainsResult
	err := ctx.Invoke("alicloud:ga/getDomains:getDomains", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDomains.
type GetDomainsArgs struct {
	// The ID of the global acceleration instance.
	AcceleratorId *string `pulumi:"acceleratorId"`
	// The accelerated domain name to be added. only top-level domain names are supported, such as 'example.com'.
	Domain *string `pulumi:"domain"`
	// A list of Ga Domain IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	PageNumber *int     `pulumi:"pageNumber"`
	PageSize   *int     `pulumi:"pageSize"`
	// The status of the resource. Valid values: `illegal`, `inactive`, `active`, `unknown`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getDomains.
type GetDomainsResult struct {
	// The ID of the global acceleration instance.
	AcceleratorId *string `pulumi:"acceleratorId"`
	// The accelerated domain name to be added.
	Domain *string `pulumi:"domain"`
	// A list of Domain Entries. Each element contains the following attributes:
	Domains []GetDomainsDomain `pulumi:"domains"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	PageNumber *int     `pulumi:"pageNumber"`
	PageSize   *int     `pulumi:"pageSize"`
	// The status of the resource
	Status *string `pulumi:"status"`
}

func GetDomainsOutput(ctx *pulumi.Context, args GetDomainsOutputArgs, opts ...pulumi.InvokeOption) GetDomainsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDomainsResult, error) {
			args := v.(GetDomainsArgs)
			r, err := GetDomains(ctx, &args, opts...)
			var s GetDomainsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDomainsResultOutput)
}

// A collection of arguments for invoking getDomains.
type GetDomainsOutputArgs struct {
	// The ID of the global acceleration instance.
	AcceleratorId pulumi.StringPtrInput `pulumi:"acceleratorId"`
	// The accelerated domain name to be added. only top-level domain names are supported, such as 'example.com'.
	Domain pulumi.StringPtrInput `pulumi:"domain"`
	// A list of Ga Domain IDs.
	Ids        pulumi.StringArrayInput `pulumi:"ids"`
	OutputFile pulumi.StringPtrInput   `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput      `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput      `pulumi:"pageSize"`
	// The status of the resource. Valid values: `illegal`, `inactive`, `active`, `unknown`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetDomainsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainsArgs)(nil)).Elem()
}

// A collection of values returned by getDomains.
type GetDomainsResultOutput struct{ *pulumi.OutputState }

func (GetDomainsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainsResult)(nil)).Elem()
}

func (o GetDomainsResultOutput) ToGetDomainsResultOutput() GetDomainsResultOutput {
	return o
}

func (o GetDomainsResultOutput) ToGetDomainsResultOutputWithContext(ctx context.Context) GetDomainsResultOutput {
	return o
}

// The ID of the global acceleration instance.
func (o GetDomainsResultOutput) AcceleratorId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDomainsResult) *string { return v.AcceleratorId }).(pulumi.StringPtrOutput)
}

// The accelerated domain name to be added.
func (o GetDomainsResultOutput) Domain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDomainsResult) *string { return v.Domain }).(pulumi.StringPtrOutput)
}

// A list of Domain Entries. Each element contains the following attributes:
func (o GetDomainsResultOutput) Domains() GetDomainsDomainArrayOutput {
	return o.ApplyT(func(v GetDomainsResult) []GetDomainsDomain { return v.Domains }).(GetDomainsDomainArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDomainsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDomainsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDomainsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDomainsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDomainsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetDomainsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetDomainsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetDomainsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetDomainsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

// The status of the resource
func (o GetDomainsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDomainsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDomainsResultOutput{})
}