// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dcdn

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Dcdn Waf Policies of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.184.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dcdn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := dcdn.GetWafPolicies(ctx, &dcdn.GetWafPoliciesArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("dcdnWafPolicyId1", ids.Policies[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetWafPolicies(ctx *pulumi.Context, args *GetWafPoliciesArgs, opts ...pulumi.InvokeOption) (*GetWafPoliciesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWafPoliciesResult
	err := ctx.Invoke("alicloud:dcdn/getWafPolicies:getWafPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWafPolicies.
type GetWafPoliciesArgs struct {
	// A list of Waf Policy IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The query conditions. The value is a string in the JSON format. Format: `{"PolicyIds":"The ID of the proteuleIds":"Thection policy","R range of protection rule IDs","PolicyNameLike":"The name of the protection policy","DomainNames":"The protected domain names","PolicyType":"default","DefenseScenes":"wafGroup","PolicyStatus":"on","OrderBy":"GmtModified","Desc":"false"}`.
	QueryArgs *string `pulumi:"queryArgs"`
	// The status of the resource. Valid values: `on`, `off`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getWafPolicies.
type GetWafPoliciesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of Dcdn Waf Policies. Each element contains the following attributes:
	Policies  []GetWafPoliciesPolicy `pulumi:"policies"`
	QueryArgs *string                `pulumi:"queryArgs"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

func GetWafPoliciesOutput(ctx *pulumi.Context, args GetWafPoliciesOutputArgs, opts ...pulumi.InvokeOption) GetWafPoliciesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetWafPoliciesResultOutput, error) {
			args := v.(GetWafPoliciesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:dcdn/getWafPolicies:getWafPolicies", args, GetWafPoliciesResultOutput{}, options).(GetWafPoliciesResultOutput), nil
		}).(GetWafPoliciesResultOutput)
}

// A collection of arguments for invoking getWafPolicies.
type GetWafPoliciesOutputArgs struct {
	// A list of Waf Policy IDs.
	Ids       pulumi.StringArrayInput `pulumi:"ids"`
	NameRegex pulumi.StringPtrInput   `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The query conditions. The value is a string in the JSON format. Format: `{"PolicyIds":"The ID of the proteuleIds":"Thection policy","R range of protection rule IDs","PolicyNameLike":"The name of the protection policy","DomainNames":"The protected domain names","PolicyType":"default","DefenseScenes":"wafGroup","PolicyStatus":"on","OrderBy":"GmtModified","Desc":"false"}`.
	QueryArgs pulumi.StringPtrInput `pulumi:"queryArgs"`
	// The status of the resource. Valid values: `on`, `off`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetWafPoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWafPoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getWafPolicies.
type GetWafPoliciesResultOutput struct{ *pulumi.OutputState }

func (GetWafPoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWafPoliciesResult)(nil)).Elem()
}

func (o GetWafPoliciesResultOutput) ToGetWafPoliciesResultOutput() GetWafPoliciesResultOutput {
	return o
}

func (o GetWafPoliciesResultOutput) ToGetWafPoliciesResultOutputWithContext(ctx context.Context) GetWafPoliciesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetWafPoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWafPoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetWafPoliciesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWafPoliciesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetWafPoliciesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWafPoliciesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetWafPoliciesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWafPoliciesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetWafPoliciesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWafPoliciesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of Dcdn Waf Policies. Each element contains the following attributes:
func (o GetWafPoliciesResultOutput) Policies() GetWafPoliciesPolicyArrayOutput {
	return o.ApplyT(func(v GetWafPoliciesResult) []GetWafPoliciesPolicy { return v.Policies }).(GetWafPoliciesPolicyArrayOutput)
}

func (o GetWafPoliciesResultOutput) QueryArgs() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWafPoliciesResult) *string { return v.QueryArgs }).(pulumi.StringPtrOutput)
}

// The status of the resource.
func (o GetWafPoliciesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWafPoliciesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWafPoliciesResultOutput{})
}
