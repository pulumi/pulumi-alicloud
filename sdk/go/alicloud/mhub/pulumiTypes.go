// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mhub

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type GetAppsApp struct {
	// Application AppKey, which uniquely identifies an application when requested by the interface
	AppKey string `pulumi:"appKey"`
	// The Name of the App.
	AppName string `pulumi:"appName"`
	// iOS application ID. Required when creating an iOS app. **NOTE:** Either `bundleId` or `packageName` must be set.
	BundleId string `pulumi:"bundleId"`
	// The CreateTime of the App.
	CreateTime string `pulumi:"createTime"`
	// Base64 string of picture.
	EncodedIcon string `pulumi:"encodedIcon"`
	// The ID of the App.
	Id string `pulumi:"id"`
	// The Industry ID of the app. For information about Industry and how to use it, MHUB[Industry](https://help.aliyun.com/document_detail/201638.html).
	IndustryId string `pulumi:"industryId"`
	// Android App package name.  **NOTE:** Either `bundleId` or `packageName` must be set.
	PackageName string `pulumi:"packageName"`
	// The ID of the Product.
	ProductId string `pulumi:"productId"`
	// The type of the App. Valid values: `Android` and `iOS`.
	Type string `pulumi:"type"`
}

// GetAppsAppInput is an input type that accepts GetAppsAppArgs and GetAppsAppOutput values.
// You can construct a concrete instance of `GetAppsAppInput` via:
//
//          GetAppsAppArgs{...}
type GetAppsAppInput interface {
	pulumi.Input

	ToGetAppsAppOutput() GetAppsAppOutput
	ToGetAppsAppOutputWithContext(context.Context) GetAppsAppOutput
}

type GetAppsAppArgs struct {
	// Application AppKey, which uniquely identifies an application when requested by the interface
	AppKey pulumi.StringInput `pulumi:"appKey"`
	// The Name of the App.
	AppName pulumi.StringInput `pulumi:"appName"`
	// iOS application ID. Required when creating an iOS app. **NOTE:** Either `bundleId` or `packageName` must be set.
	BundleId pulumi.StringInput `pulumi:"bundleId"`
	// The CreateTime of the App.
	CreateTime pulumi.StringInput `pulumi:"createTime"`
	// Base64 string of picture.
	EncodedIcon pulumi.StringInput `pulumi:"encodedIcon"`
	// The ID of the App.
	Id pulumi.StringInput `pulumi:"id"`
	// The Industry ID of the app. For information about Industry and how to use it, MHUB[Industry](https://help.aliyun.com/document_detail/201638.html).
	IndustryId pulumi.StringInput `pulumi:"industryId"`
	// Android App package name.  **NOTE:** Either `bundleId` or `packageName` must be set.
	PackageName pulumi.StringInput `pulumi:"packageName"`
	// The ID of the Product.
	ProductId pulumi.StringInput `pulumi:"productId"`
	// The type of the App. Valid values: `Android` and `iOS`.
	Type pulumi.StringInput `pulumi:"type"`
}

func (GetAppsAppArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppsApp)(nil)).Elem()
}

func (i GetAppsAppArgs) ToGetAppsAppOutput() GetAppsAppOutput {
	return i.ToGetAppsAppOutputWithContext(context.Background())
}

func (i GetAppsAppArgs) ToGetAppsAppOutputWithContext(ctx context.Context) GetAppsAppOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAppsAppOutput)
}

// GetAppsAppArrayInput is an input type that accepts GetAppsAppArray and GetAppsAppArrayOutput values.
// You can construct a concrete instance of `GetAppsAppArrayInput` via:
//
//          GetAppsAppArray{ GetAppsAppArgs{...} }
type GetAppsAppArrayInput interface {
	pulumi.Input

	ToGetAppsAppArrayOutput() GetAppsAppArrayOutput
	ToGetAppsAppArrayOutputWithContext(context.Context) GetAppsAppArrayOutput
}

type GetAppsAppArray []GetAppsAppInput

func (GetAppsAppArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAppsApp)(nil)).Elem()
}

func (i GetAppsAppArray) ToGetAppsAppArrayOutput() GetAppsAppArrayOutput {
	return i.ToGetAppsAppArrayOutputWithContext(context.Background())
}

func (i GetAppsAppArray) ToGetAppsAppArrayOutputWithContext(ctx context.Context) GetAppsAppArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAppsAppArrayOutput)
}

type GetAppsAppOutput struct{ *pulumi.OutputState }

func (GetAppsAppOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppsApp)(nil)).Elem()
}

func (o GetAppsAppOutput) ToGetAppsAppOutput() GetAppsAppOutput {
	return o
}

func (o GetAppsAppOutput) ToGetAppsAppOutputWithContext(ctx context.Context) GetAppsAppOutput {
	return o
}

// Application AppKey, which uniquely identifies an application when requested by the interface
func (o GetAppsAppOutput) AppKey() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsApp) string { return v.AppKey }).(pulumi.StringOutput)
}

// The Name of the App.
func (o GetAppsAppOutput) AppName() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsApp) string { return v.AppName }).(pulumi.StringOutput)
}

// iOS application ID. Required when creating an iOS app. **NOTE:** Either `bundleId` or `packageName` must be set.
func (o GetAppsAppOutput) BundleId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsApp) string { return v.BundleId }).(pulumi.StringOutput)
}

// The CreateTime of the App.
func (o GetAppsAppOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsApp) string { return v.CreateTime }).(pulumi.StringOutput)
}

// Base64 string of picture.
func (o GetAppsAppOutput) EncodedIcon() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsApp) string { return v.EncodedIcon }).(pulumi.StringOutput)
}

// The ID of the App.
func (o GetAppsAppOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsApp) string { return v.Id }).(pulumi.StringOutput)
}

// The Industry ID of the app. For information about Industry and how to use it, MHUB[Industry](https://help.aliyun.com/document_detail/201638.html).
func (o GetAppsAppOutput) IndustryId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsApp) string { return v.IndustryId }).(pulumi.StringOutput)
}

// Android App package name.  **NOTE:** Either `bundleId` or `packageName` must be set.
func (o GetAppsAppOutput) PackageName() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsApp) string { return v.PackageName }).(pulumi.StringOutput)
}

// The ID of the Product.
func (o GetAppsAppOutput) ProductId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsApp) string { return v.ProductId }).(pulumi.StringOutput)
}

// The type of the App. Valid values: `Android` and `iOS`.
func (o GetAppsAppOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsApp) string { return v.Type }).(pulumi.StringOutput)
}

type GetAppsAppArrayOutput struct{ *pulumi.OutputState }

func (GetAppsAppArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAppsApp)(nil)).Elem()
}

func (o GetAppsAppArrayOutput) ToGetAppsAppArrayOutput() GetAppsAppArrayOutput {
	return o
}

func (o GetAppsAppArrayOutput) ToGetAppsAppArrayOutputWithContext(ctx context.Context) GetAppsAppArrayOutput {
	return o
}

func (o GetAppsAppArrayOutput) Index(i pulumi.IntInput) GetAppsAppOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetAppsApp {
		return vs[0].([]GetAppsApp)[vs[1].(int)]
	}).(GetAppsAppOutput)
}

type GetProductsProduct struct {
	// The ID of the Product.
	Id string `pulumi:"id"`
	// The ID of the Product.
	ProductId string `pulumi:"productId"`
	// The name of the Product.
	ProductName string `pulumi:"productName"`
}

// GetProductsProductInput is an input type that accepts GetProductsProductArgs and GetProductsProductOutput values.
// You can construct a concrete instance of `GetProductsProductInput` via:
//
//          GetProductsProductArgs{...}
type GetProductsProductInput interface {
	pulumi.Input

	ToGetProductsProductOutput() GetProductsProductOutput
	ToGetProductsProductOutputWithContext(context.Context) GetProductsProductOutput
}

type GetProductsProductArgs struct {
	// The ID of the Product.
	Id pulumi.StringInput `pulumi:"id"`
	// The ID of the Product.
	ProductId pulumi.StringInput `pulumi:"productId"`
	// The name of the Product.
	ProductName pulumi.StringInput `pulumi:"productName"`
}

func (GetProductsProductArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductsProduct)(nil)).Elem()
}

func (i GetProductsProductArgs) ToGetProductsProductOutput() GetProductsProductOutput {
	return i.ToGetProductsProductOutputWithContext(context.Background())
}

func (i GetProductsProductArgs) ToGetProductsProductOutputWithContext(ctx context.Context) GetProductsProductOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetProductsProductOutput)
}

// GetProductsProductArrayInput is an input type that accepts GetProductsProductArray and GetProductsProductArrayOutput values.
// You can construct a concrete instance of `GetProductsProductArrayInput` via:
//
//          GetProductsProductArray{ GetProductsProductArgs{...} }
type GetProductsProductArrayInput interface {
	pulumi.Input

	ToGetProductsProductArrayOutput() GetProductsProductArrayOutput
	ToGetProductsProductArrayOutputWithContext(context.Context) GetProductsProductArrayOutput
}

type GetProductsProductArray []GetProductsProductInput

func (GetProductsProductArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetProductsProduct)(nil)).Elem()
}

func (i GetProductsProductArray) ToGetProductsProductArrayOutput() GetProductsProductArrayOutput {
	return i.ToGetProductsProductArrayOutputWithContext(context.Background())
}

func (i GetProductsProductArray) ToGetProductsProductArrayOutputWithContext(ctx context.Context) GetProductsProductArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetProductsProductArrayOutput)
}

type GetProductsProductOutput struct{ *pulumi.OutputState }

func (GetProductsProductOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductsProduct)(nil)).Elem()
}

func (o GetProductsProductOutput) ToGetProductsProductOutput() GetProductsProductOutput {
	return o
}

func (o GetProductsProductOutput) ToGetProductsProductOutputWithContext(ctx context.Context) GetProductsProductOutput {
	return o
}

// The ID of the Product.
func (o GetProductsProductOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProductsProduct) string { return v.Id }).(pulumi.StringOutput)
}

// The ID of the Product.
func (o GetProductsProductOutput) ProductId() pulumi.StringOutput {
	return o.ApplyT(func(v GetProductsProduct) string { return v.ProductId }).(pulumi.StringOutput)
}

// The name of the Product.
func (o GetProductsProductOutput) ProductName() pulumi.StringOutput {
	return o.ApplyT(func(v GetProductsProduct) string { return v.ProductName }).(pulumi.StringOutput)
}

type GetProductsProductArrayOutput struct{ *pulumi.OutputState }

func (GetProductsProductArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetProductsProduct)(nil)).Elem()
}

func (o GetProductsProductArrayOutput) ToGetProductsProductArrayOutput() GetProductsProductArrayOutput {
	return o
}

func (o GetProductsProductArrayOutput) ToGetProductsProductArrayOutputWithContext(ctx context.Context) GetProductsProductArrayOutput {
	return o
}

func (o GetProductsProductArrayOutput) Index(i pulumi.IntInput) GetProductsProductOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetProductsProduct {
		return vs[0].([]GetProductsProduct)[vs[1].(int)]
	}).(GetProductsProductOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GetAppsAppInput)(nil)).Elem(), GetAppsAppArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAppsAppArrayInput)(nil)).Elem(), GetAppsAppArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetProductsProductInput)(nil)).Elem(), GetProductsProductArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetProductsProductArrayInput)(nil)).Elem(), GetProductsProductArray{})
	pulumi.RegisterOutputType(GetAppsAppOutput{})
	pulumi.RegisterOutputType(GetAppsAppArrayOutput{})
	pulumi.RegisterOutputType(GetProductsProductOutput{})
	pulumi.RegisterOutputType(GetProductsProductArrayOutput{})
}