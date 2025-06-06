// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of KMS Secrets in an Alibaba Cloud account according to the specified filters.
//
// > **NOTE:** Available since v1.86.0.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/kms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Declare the data source
//			kmsSecretsDs, err := kms.GetSecrets(ctx, &kms.GetSecretsArgs{
//				FetchTags: pulumi.BoolRef(true),
//				NameRegex: pulumi.StringRef("name_regex"),
//				Tags: map[string]interface{}{
//					"k-aa": "v-aa",
//					"k-bb": "v-bb",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstSecretId", kmsSecretsDs.Secrets[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetSecrets(ctx *pulumi.Context, args *GetSecretsArgs, opts ...pulumi.InvokeOption) (*GetSecretsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSecretsResult
	err := ctx.Invoke("alicloud:kms/getSecrets:getSecrets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecrets.
type GetSecretsArgs struct {
	// Default to `false`. Set it to true can output more details.
	EnableDetails *bool `pulumi:"enableDetails"`
	// Whether to include the predetermined resource tag in the return value. Default to `false`.
	FetchTags *bool `pulumi:"fetchTags"`
	// The secret filter. The filter consists of one or more key-value pairs.
	// More details see API [ListSecrets](https://www.alibabacloud.com/help/en/key-management-service/latest/listsecrets).
	Filters *string `pulumi:"filters"`
	// A list of KMS Secret ids. The value is same as KMS secret_name.
	Ids []string `pulumi:"ids"`
	// A regex string to filter the results by the KMS secret_name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// A mapping of tags to assign to the resource, and can be used to filter secrets.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getSecrets.
type GetSecretsResult struct {
	EnableDetails *bool   `pulumi:"enableDetails"`
	FetchTags     *bool   `pulumi:"fetchTags"`
	Filters       *string `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Kms Secret ids. The value is same as KMS secret_name.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of KMS Secret names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of KMS Secrets. Each element contains the following attributes:
	Secrets []GetSecretsSecret `pulumi:"secrets"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

func GetSecretsOutput(ctx *pulumi.Context, args GetSecretsOutputArgs, opts ...pulumi.InvokeOption) GetSecretsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSecretsResultOutput, error) {
			args := v.(GetSecretsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:kms/getSecrets:getSecrets", args, GetSecretsResultOutput{}, options).(GetSecretsResultOutput), nil
		}).(GetSecretsResultOutput)
}

// A collection of arguments for invoking getSecrets.
type GetSecretsOutputArgs struct {
	// Default to `false`. Set it to true can output more details.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// Whether to include the predetermined resource tag in the return value. Default to `false`.
	FetchTags pulumi.BoolPtrInput `pulumi:"fetchTags"`
	// The secret filter. The filter consists of one or more key-value pairs.
	// More details see API [ListSecrets](https://www.alibabacloud.com/help/en/key-management-service/latest/listsecrets).
	Filters pulumi.StringPtrInput `pulumi:"filters"`
	// A list of KMS Secret ids. The value is same as KMS secret_name.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter the results by the KMS secret_name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// A mapping of tags to assign to the resource, and can be used to filter secrets.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (GetSecretsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretsArgs)(nil)).Elem()
}

// A collection of values returned by getSecrets.
type GetSecretsResultOutput struct{ *pulumi.OutputState }

func (GetSecretsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretsResult)(nil)).Elem()
}

func (o GetSecretsResultOutput) ToGetSecretsResultOutput() GetSecretsResultOutput {
	return o
}

func (o GetSecretsResultOutput) ToGetSecretsResultOutputWithContext(ctx context.Context) GetSecretsResultOutput {
	return o
}

func (o GetSecretsResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSecretsResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

func (o GetSecretsResultOutput) FetchTags() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSecretsResult) *bool { return v.FetchTags }).(pulumi.BoolPtrOutput)
}

func (o GetSecretsResultOutput) Filters() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecretsResult) *string { return v.Filters }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSecretsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSecretsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Kms Secret ids. The value is same as KMS secret_name.
func (o GetSecretsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecretsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSecretsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecretsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of KMS Secret names.
func (o GetSecretsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecretsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetSecretsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecretsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of KMS Secrets. Each element contains the following attributes:
func (o GetSecretsResultOutput) Secrets() GetSecretsSecretArrayOutput {
	return o.ApplyT(func(v GetSecretsResult) []GetSecretsSecret { return v.Secrets }).(GetSecretsSecretArrayOutput)
}

// A mapping of tags to assign to the resource.
func (o GetSecretsResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetSecretsResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSecretsResultOutput{})
}
