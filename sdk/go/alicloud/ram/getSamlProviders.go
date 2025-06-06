// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Ram Saml Providers of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.114.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ram"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := ram.GetSamlProviders(ctx, &ram.GetSamlProvidersArgs{
//				Ids: []string{
//					"samlProviderName",
//				},
//				NameRegex: pulumi.StringRef("tf-testAcc"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstRamSamlProviderId", example.Providers[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetSamlProviders(ctx *pulumi.Context, args *GetSamlProvidersArgs, opts ...pulumi.InvokeOption) (*GetSamlProvidersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSamlProvidersResult
	err := ctx.Invoke("alicloud:ram/getSamlProviders:getSamlProviders", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSamlProviders.
type GetSamlProvidersArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of SAML Provider IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by SAML Provider name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getSamlProviders.
type GetSamlProvidersResult struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id        string   `pulumi:"id"`
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of SAML Provider names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of Ram Saml Providers. Each element contains the following attributes:
	Providers []GetSamlProvidersProvider `pulumi:"providers"`
}

func GetSamlProvidersOutput(ctx *pulumi.Context, args GetSamlProvidersOutputArgs, opts ...pulumi.InvokeOption) GetSamlProvidersResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSamlProvidersResultOutput, error) {
			args := v.(GetSamlProvidersArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:ram/getSamlProviders:getSamlProviders", args, GetSamlProvidersResultOutput{}, options).(GetSamlProvidersResultOutput), nil
		}).(GetSamlProvidersResultOutput)
}

// A collection of arguments for invoking getSamlProviders.
type GetSamlProvidersOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of SAML Provider IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by SAML Provider name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetSamlProvidersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSamlProvidersArgs)(nil)).Elem()
}

// A collection of values returned by getSamlProviders.
type GetSamlProvidersResultOutput struct{ *pulumi.OutputState }

func (GetSamlProvidersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSamlProvidersResult)(nil)).Elem()
}

func (o GetSamlProvidersResultOutput) ToGetSamlProvidersResultOutput() GetSamlProvidersResultOutput {
	return o
}

func (o GetSamlProvidersResultOutput) ToGetSamlProvidersResultOutputWithContext(ctx context.Context) GetSamlProvidersResultOutput {
	return o
}

func (o GetSamlProvidersResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSamlProvidersResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSamlProvidersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSamlProvidersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSamlProvidersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSamlProvidersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSamlProvidersResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSamlProvidersResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of SAML Provider names.
func (o GetSamlProvidersResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSamlProvidersResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetSamlProvidersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSamlProvidersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of Ram Saml Providers. Each element contains the following attributes:
func (o GetSamlProvidersResultOutput) Providers() GetSamlProvidersProviderArrayOutput {
	return o.ApplyT(func(v GetSamlProvidersResult) []GetSamlProvidersProvider { return v.Providers }).(GetSamlProvidersProviderArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSamlProvidersResultOutput{})
}
