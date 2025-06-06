// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package servicecatalog

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Service Catalog Provisioned Product resource.
//
// For information about Service Catalog Provisioned Product and how to use it, see [What is Provisioned Product](https://www.alibabacloud.com/help/en/service-catalog/developer-reference/api-servicecatalog-2021-09-01-launchproduct).
//
// > **NOTE:** Available since v1.196.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/servicecatalog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-testAccServiceCatalogProvisionedProduct"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_, err := servicecatalog.NewProvisionedProduct(ctx, "default", &servicecatalog.ProvisionedProductArgs{
//				ProvisionedProductName: pulumi.String(name),
//				StackRegionId:          pulumi.String("cn-hangzhou"),
//				ProductVersionId:       pulumi.String("pv-bp1d7dxy2pcc1g"),
//				ProductId:              pulumi.String("prod-bp1u3dkc282cwd"),
//				PortfolioId:            pulumi.String("port-bp119dvn27jccw"),
//				Tags: pulumi.StringMap{
//					"v1": pulumi.String("tf-test"),
//				},
//				Parameters: servicecatalog.ProvisionedProductParameterArray{
//					&servicecatalog.ProvisionedProductParameterArgs{
//						ParameterKey:   pulumi.String("role_name"),
//						ParameterValue: pulumi.String(name),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Service Catalog Provisioned Product can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:servicecatalog/provisionedProduct:ProvisionedProduct example <id>
// ```
type ProvisionedProduct struct {
	pulumi.CustomResourceState

	// The creation time of the product instance
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The ID of the last instance operation task
	LastProvisioningTaskId pulumi.StringOutput `pulumi:"lastProvisioningTaskId"`
	// The ID of the last successful instance operation task
	LastSuccessfulProvisioningTaskId pulumi.StringOutput `pulumi:"lastSuccessfulProvisioningTaskId"`
	// The ID of the last task
	LastTaskId pulumi.StringOutput `pulumi:"lastTaskId"`
	// The output value of the template.
	Outputs ProvisionedProductOutputTypeArrayOutput `pulumi:"outputs"`
	// The RAM entity ID of the owner
	OwnerPrincipalId pulumi.StringOutput `pulumi:"ownerPrincipalId"`
	// The RAM entity type of the owner
	OwnerPrincipalType pulumi.StringOutput `pulumi:"ownerPrincipalType"`
	// Template parameters entered by the user.The maximum value of N is 200.See the following `Block Parameters`.
	Parameters ProvisionedProductParameterArrayOutput `pulumi:"parameters"`
	// Product mix ID.> When there is a default Startup option, there is no need to fill in the portfolio. When there is no default Startup option, you must fill in the portfolio.
	PortfolioId pulumi.StringPtrOutput `pulumi:"portfolioId"`
	// Product ID.
	ProductId pulumi.StringOutput `pulumi:"productId"`
	// The name of the product
	ProductName pulumi.StringOutput `pulumi:"productName"`
	// Product version ID.
	ProductVersionId pulumi.StringOutput `pulumi:"productVersionId"`
	// The name of the product version
	ProductVersionName pulumi.StringOutput `pulumi:"productVersionName"`
	// The ARN of the product instance
	ProvisionedProductArn pulumi.StringOutput `pulumi:"provisionedProductArn"`
	// The ID of the instance.
	ProvisionedProductId pulumi.StringOutput `pulumi:"provisionedProductId"`
	// The name of the instance.The length is 1~128 characters.
	ProvisionedProductName pulumi.StringOutput `pulumi:"provisionedProductName"`
	// Instance type.The value is RosStack, which indicates the stack of Alibaba Cloud resource orchestration service (ROS).
	ProvisionedProductType pulumi.StringOutput `pulumi:"provisionedProductType"`
	// The ID of the ROS stack
	StackId pulumi.StringOutput `pulumi:"stackId"`
	// The ID of the region to which the resource stack of the Alibaba Cloud resource orchestration service (ROS) belongs.
	StackRegionId pulumi.StringOutput `pulumi:"stackRegionId"`
	// Instance status
	Status pulumi.StringOutput `pulumi:"status"`
	// The status message of the product instance
	StatusMessage pulumi.StringOutput `pulumi:"statusMessage"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewProvisionedProduct registers a new resource with the given unique name, arguments, and options.
func NewProvisionedProduct(ctx *pulumi.Context,
	name string, args *ProvisionedProductArgs, opts ...pulumi.ResourceOption) (*ProvisionedProduct, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProductId == nil {
		return nil, errors.New("invalid value for required argument 'ProductId'")
	}
	if args.ProductVersionId == nil {
		return nil, errors.New("invalid value for required argument 'ProductVersionId'")
	}
	if args.ProvisionedProductName == nil {
		return nil, errors.New("invalid value for required argument 'ProvisionedProductName'")
	}
	if args.StackRegionId == nil {
		return nil, errors.New("invalid value for required argument 'StackRegionId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProvisionedProduct
	err := ctx.RegisterResource("alicloud:servicecatalog/provisionedProduct:ProvisionedProduct", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProvisionedProduct gets an existing ProvisionedProduct resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProvisionedProduct(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProvisionedProductState, opts ...pulumi.ResourceOption) (*ProvisionedProduct, error) {
	var resource ProvisionedProduct
	err := ctx.ReadResource("alicloud:servicecatalog/provisionedProduct:ProvisionedProduct", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProvisionedProduct resources.
type provisionedProductState struct {
	// The creation time of the product instance
	CreateTime *string `pulumi:"createTime"`
	// The ID of the last instance operation task
	LastProvisioningTaskId *string `pulumi:"lastProvisioningTaskId"`
	// The ID of the last successful instance operation task
	LastSuccessfulProvisioningTaskId *string `pulumi:"lastSuccessfulProvisioningTaskId"`
	// The ID of the last task
	LastTaskId *string `pulumi:"lastTaskId"`
	// The output value of the template.
	Outputs []ProvisionedProductOutputType `pulumi:"outputs"`
	// The RAM entity ID of the owner
	OwnerPrincipalId *string `pulumi:"ownerPrincipalId"`
	// The RAM entity type of the owner
	OwnerPrincipalType *string `pulumi:"ownerPrincipalType"`
	// Template parameters entered by the user.The maximum value of N is 200.See the following `Block Parameters`.
	Parameters []ProvisionedProductParameter `pulumi:"parameters"`
	// Product mix ID.> When there is a default Startup option, there is no need to fill in the portfolio. When there is no default Startup option, you must fill in the portfolio.
	PortfolioId *string `pulumi:"portfolioId"`
	// Product ID.
	ProductId *string `pulumi:"productId"`
	// The name of the product
	ProductName *string `pulumi:"productName"`
	// Product version ID.
	ProductVersionId *string `pulumi:"productVersionId"`
	// The name of the product version
	ProductVersionName *string `pulumi:"productVersionName"`
	// The ARN of the product instance
	ProvisionedProductArn *string `pulumi:"provisionedProductArn"`
	// The ID of the instance.
	ProvisionedProductId *string `pulumi:"provisionedProductId"`
	// The name of the instance.The length is 1~128 characters.
	ProvisionedProductName *string `pulumi:"provisionedProductName"`
	// Instance type.The value is RosStack, which indicates the stack of Alibaba Cloud resource orchestration service (ROS).
	ProvisionedProductType *string `pulumi:"provisionedProductType"`
	// The ID of the ROS stack
	StackId *string `pulumi:"stackId"`
	// The ID of the region to which the resource stack of the Alibaba Cloud resource orchestration service (ROS) belongs.
	StackRegionId *string `pulumi:"stackRegionId"`
	// Instance status
	Status *string `pulumi:"status"`
	// The status message of the product instance
	StatusMessage *string `pulumi:"statusMessage"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

type ProvisionedProductState struct {
	// The creation time of the product instance
	CreateTime pulumi.StringPtrInput
	// The ID of the last instance operation task
	LastProvisioningTaskId pulumi.StringPtrInput
	// The ID of the last successful instance operation task
	LastSuccessfulProvisioningTaskId pulumi.StringPtrInput
	// The ID of the last task
	LastTaskId pulumi.StringPtrInput
	// The output value of the template.
	Outputs ProvisionedProductOutputTypeArrayInput
	// The RAM entity ID of the owner
	OwnerPrincipalId pulumi.StringPtrInput
	// The RAM entity type of the owner
	OwnerPrincipalType pulumi.StringPtrInput
	// Template parameters entered by the user.The maximum value of N is 200.See the following `Block Parameters`.
	Parameters ProvisionedProductParameterArrayInput
	// Product mix ID.> When there is a default Startup option, there is no need to fill in the portfolio. When there is no default Startup option, you must fill in the portfolio.
	PortfolioId pulumi.StringPtrInput
	// Product ID.
	ProductId pulumi.StringPtrInput
	// The name of the product
	ProductName pulumi.StringPtrInput
	// Product version ID.
	ProductVersionId pulumi.StringPtrInput
	// The name of the product version
	ProductVersionName pulumi.StringPtrInput
	// The ARN of the product instance
	ProvisionedProductArn pulumi.StringPtrInput
	// The ID of the instance.
	ProvisionedProductId pulumi.StringPtrInput
	// The name of the instance.The length is 1~128 characters.
	ProvisionedProductName pulumi.StringPtrInput
	// Instance type.The value is RosStack, which indicates the stack of Alibaba Cloud resource orchestration service (ROS).
	ProvisionedProductType pulumi.StringPtrInput
	// The ID of the ROS stack
	StackId pulumi.StringPtrInput
	// The ID of the region to which the resource stack of the Alibaba Cloud resource orchestration service (ROS) belongs.
	StackRegionId pulumi.StringPtrInput
	// Instance status
	Status pulumi.StringPtrInput
	// The status message of the product instance
	StatusMessage pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (ProvisionedProductState) ElementType() reflect.Type {
	return reflect.TypeOf((*provisionedProductState)(nil)).Elem()
}

type provisionedProductArgs struct {
	// Template parameters entered by the user.The maximum value of N is 200.See the following `Block Parameters`.
	Parameters []ProvisionedProductParameter `pulumi:"parameters"`
	// Product mix ID.> When there is a default Startup option, there is no need to fill in the portfolio. When there is no default Startup option, you must fill in the portfolio.
	PortfolioId *string `pulumi:"portfolioId"`
	// Product ID.
	ProductId string `pulumi:"productId"`
	// Product version ID.
	ProductVersionId string `pulumi:"productVersionId"`
	// The ID of the instance.
	ProvisionedProductId *string `pulumi:"provisionedProductId"`
	// The name of the instance.The length is 1~128 characters.
	ProvisionedProductName string `pulumi:"provisionedProductName"`
	// The ID of the region to which the resource stack of the Alibaba Cloud resource orchestration service (ROS) belongs.
	StackRegionId string `pulumi:"stackRegionId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ProvisionedProduct resource.
type ProvisionedProductArgs struct {
	// Template parameters entered by the user.The maximum value of N is 200.See the following `Block Parameters`.
	Parameters ProvisionedProductParameterArrayInput
	// Product mix ID.> When there is a default Startup option, there is no need to fill in the portfolio. When there is no default Startup option, you must fill in the portfolio.
	PortfolioId pulumi.StringPtrInput
	// Product ID.
	ProductId pulumi.StringInput
	// Product version ID.
	ProductVersionId pulumi.StringInput
	// The ID of the instance.
	ProvisionedProductId pulumi.StringPtrInput
	// The name of the instance.The length is 1~128 characters.
	ProvisionedProductName pulumi.StringInput
	// The ID of the region to which the resource stack of the Alibaba Cloud resource orchestration service (ROS) belongs.
	StackRegionId pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (ProvisionedProductArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*provisionedProductArgs)(nil)).Elem()
}

type ProvisionedProductInput interface {
	pulumi.Input

	ToProvisionedProductOutput() ProvisionedProductOutput
	ToProvisionedProductOutputWithContext(ctx context.Context) ProvisionedProductOutput
}

func (*ProvisionedProduct) ElementType() reflect.Type {
	return reflect.TypeOf((**ProvisionedProduct)(nil)).Elem()
}

func (i *ProvisionedProduct) ToProvisionedProductOutput() ProvisionedProductOutput {
	return i.ToProvisionedProductOutputWithContext(context.Background())
}

func (i *ProvisionedProduct) ToProvisionedProductOutputWithContext(ctx context.Context) ProvisionedProductOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProvisionedProductOutput)
}

// ProvisionedProductArrayInput is an input type that accepts ProvisionedProductArray and ProvisionedProductArrayOutput values.
// You can construct a concrete instance of `ProvisionedProductArrayInput` via:
//
//	ProvisionedProductArray{ ProvisionedProductArgs{...} }
type ProvisionedProductArrayInput interface {
	pulumi.Input

	ToProvisionedProductArrayOutput() ProvisionedProductArrayOutput
	ToProvisionedProductArrayOutputWithContext(context.Context) ProvisionedProductArrayOutput
}

type ProvisionedProductArray []ProvisionedProductInput

func (ProvisionedProductArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProvisionedProduct)(nil)).Elem()
}

func (i ProvisionedProductArray) ToProvisionedProductArrayOutput() ProvisionedProductArrayOutput {
	return i.ToProvisionedProductArrayOutputWithContext(context.Background())
}

func (i ProvisionedProductArray) ToProvisionedProductArrayOutputWithContext(ctx context.Context) ProvisionedProductArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProvisionedProductArrayOutput)
}

// ProvisionedProductMapInput is an input type that accepts ProvisionedProductMap and ProvisionedProductMapOutput values.
// You can construct a concrete instance of `ProvisionedProductMapInput` via:
//
//	ProvisionedProductMap{ "key": ProvisionedProductArgs{...} }
type ProvisionedProductMapInput interface {
	pulumi.Input

	ToProvisionedProductMapOutput() ProvisionedProductMapOutput
	ToProvisionedProductMapOutputWithContext(context.Context) ProvisionedProductMapOutput
}

type ProvisionedProductMap map[string]ProvisionedProductInput

func (ProvisionedProductMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProvisionedProduct)(nil)).Elem()
}

func (i ProvisionedProductMap) ToProvisionedProductMapOutput() ProvisionedProductMapOutput {
	return i.ToProvisionedProductMapOutputWithContext(context.Background())
}

func (i ProvisionedProductMap) ToProvisionedProductMapOutputWithContext(ctx context.Context) ProvisionedProductMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProvisionedProductMapOutput)
}

type ProvisionedProductOutput struct{ *pulumi.OutputState }

func (ProvisionedProductOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProvisionedProduct)(nil)).Elem()
}

func (o ProvisionedProductOutput) ToProvisionedProductOutput() ProvisionedProductOutput {
	return o
}

func (o ProvisionedProductOutput) ToProvisionedProductOutputWithContext(ctx context.Context) ProvisionedProductOutput {
	return o
}

// The creation time of the product instance
func (o ProvisionedProductOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The ID of the last instance operation task
func (o ProvisionedProductOutput) LastProvisioningTaskId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.LastProvisioningTaskId }).(pulumi.StringOutput)
}

// The ID of the last successful instance operation task
func (o ProvisionedProductOutput) LastSuccessfulProvisioningTaskId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.LastSuccessfulProvisioningTaskId }).(pulumi.StringOutput)
}

// The ID of the last task
func (o ProvisionedProductOutput) LastTaskId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.LastTaskId }).(pulumi.StringOutput)
}

// The output value of the template.
func (o ProvisionedProductOutput) Outputs() ProvisionedProductOutputTypeArrayOutput {
	return o.ApplyT(func(v *ProvisionedProduct) ProvisionedProductOutputTypeArrayOutput { return v.Outputs }).(ProvisionedProductOutputTypeArrayOutput)
}

// The RAM entity ID of the owner
func (o ProvisionedProductOutput) OwnerPrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.OwnerPrincipalId }).(pulumi.StringOutput)
}

// The RAM entity type of the owner
func (o ProvisionedProductOutput) OwnerPrincipalType() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.OwnerPrincipalType }).(pulumi.StringOutput)
}

// Template parameters entered by the user.The maximum value of N is 200.See the following `Block Parameters`.
func (o ProvisionedProductOutput) Parameters() ProvisionedProductParameterArrayOutput {
	return o.ApplyT(func(v *ProvisionedProduct) ProvisionedProductParameterArrayOutput { return v.Parameters }).(ProvisionedProductParameterArrayOutput)
}

// Product mix ID.> When there is a default Startup option, there is no need to fill in the portfolio. When there is no default Startup option, you must fill in the portfolio.
func (o ProvisionedProductOutput) PortfolioId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringPtrOutput { return v.PortfolioId }).(pulumi.StringPtrOutput)
}

// Product ID.
func (o ProvisionedProductOutput) ProductId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.ProductId }).(pulumi.StringOutput)
}

// The name of the product
func (o ProvisionedProductOutput) ProductName() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.ProductName }).(pulumi.StringOutput)
}

// Product version ID.
func (o ProvisionedProductOutput) ProductVersionId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.ProductVersionId }).(pulumi.StringOutput)
}

// The name of the product version
func (o ProvisionedProductOutput) ProductVersionName() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.ProductVersionName }).(pulumi.StringOutput)
}

// The ARN of the product instance
func (o ProvisionedProductOutput) ProvisionedProductArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.ProvisionedProductArn }).(pulumi.StringOutput)
}

// The ID of the instance.
func (o ProvisionedProductOutput) ProvisionedProductId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.ProvisionedProductId }).(pulumi.StringOutput)
}

// The name of the instance.The length is 1~128 characters.
func (o ProvisionedProductOutput) ProvisionedProductName() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.ProvisionedProductName }).(pulumi.StringOutput)
}

// Instance type.The value is RosStack, which indicates the stack of Alibaba Cloud resource orchestration service (ROS).
func (o ProvisionedProductOutput) ProvisionedProductType() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.ProvisionedProductType }).(pulumi.StringOutput)
}

// The ID of the ROS stack
func (o ProvisionedProductOutput) StackId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.StackId }).(pulumi.StringOutput)
}

// The ID of the region to which the resource stack of the Alibaba Cloud resource orchestration service (ROS) belongs.
func (o ProvisionedProductOutput) StackRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.StackRegionId }).(pulumi.StringOutput)
}

// Instance status
func (o ProvisionedProductOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The status message of the product instance
func (o ProvisionedProductOutput) StatusMessage() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringOutput { return v.StatusMessage }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o ProvisionedProductOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ProvisionedProduct) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type ProvisionedProductArrayOutput struct{ *pulumi.OutputState }

func (ProvisionedProductArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProvisionedProduct)(nil)).Elem()
}

func (o ProvisionedProductArrayOutput) ToProvisionedProductArrayOutput() ProvisionedProductArrayOutput {
	return o
}

func (o ProvisionedProductArrayOutput) ToProvisionedProductArrayOutputWithContext(ctx context.Context) ProvisionedProductArrayOutput {
	return o
}

func (o ProvisionedProductArrayOutput) Index(i pulumi.IntInput) ProvisionedProductOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProvisionedProduct {
		return vs[0].([]*ProvisionedProduct)[vs[1].(int)]
	}).(ProvisionedProductOutput)
}

type ProvisionedProductMapOutput struct{ *pulumi.OutputState }

func (ProvisionedProductMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProvisionedProduct)(nil)).Elem()
}

func (o ProvisionedProductMapOutput) ToProvisionedProductMapOutput() ProvisionedProductMapOutput {
	return o
}

func (o ProvisionedProductMapOutput) ToProvisionedProductMapOutputWithContext(ctx context.Context) ProvisionedProductMapOutput {
	return o
}

func (o ProvisionedProductMapOutput) MapIndex(k pulumi.StringInput) ProvisionedProductOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProvisionedProduct {
		return vs[0].(map[string]*ProvisionedProduct)[vs[1].(string)]
	}).(ProvisionedProductOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProvisionedProductInput)(nil)).Elem(), &ProvisionedProduct{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProvisionedProductArrayInput)(nil)).Elem(), ProvisionedProductArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProvisionedProductMapInput)(nil)).Elem(), ProvisionedProductMap{})
	pulumi.RegisterOutputType(ProvisionedProductOutput{})
	pulumi.RegisterOutputType(ProvisionedProductArrayOutput{})
	pulumi.RegisterOutputType(ProvisionedProductMapOutput{})
}
