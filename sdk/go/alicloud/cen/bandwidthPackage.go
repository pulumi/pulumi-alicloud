// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// CEN bandwidth package can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:cen/bandwidthPackage:BandwidthPackage example cenbwp-abc123456
// ```
type BandwidthPackage struct {
	pulumi.CustomResourceState

	// The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
	Bandwidth pulumi.IntOutput `pulumi:"bandwidth"`
	// The name of the bandwidth package. Defaults to null.
	//
	// ->**NOTE:** PrePaid mode will deduct fees from the account directly and the bandwidth package can't be deleted before expired time.
	//
	// ->**NOTE:** The PostPaid mode is only for test. Please open a ticket if you need.
	CenBandwidthPackageName pulumi.StringOutput `pulumi:"cenBandwidthPackageName"`
	// Field `chargeType` has been deprecated from version 1.97.0. Use `paymentType` and instead.
	//
	// Deprecated: Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead.
	ChargeType pulumi.StringOutput `pulumi:"chargeType"`
	// The description of the bandwidth package. Default to null.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The time of the bandwidth package to expire.
	ExpiredTime pulumi.StringOutput `pulumi:"expiredTime"`
	// The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
	GeographicRegionAId pulumi.StringOutput `pulumi:"geographicRegionAId"`
	// The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
	GeographicRegionBId pulumi.StringOutput `pulumi:"geographicRegionBId"`
	// Field `geographicRegionIds` has been deprecated from version 1.97.0. Use `geographicRegionAId` and `geographicRegionBId` instead.
	//
	// Deprecated: Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead.
	GeographicRegionIds pulumi.StringArrayOutput `pulumi:"geographicRegionIds"`
	// Field `name` has been deprecated from version 1.97.0. Use `cenBandwidthPackageName` and instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead.
	Name pulumi.StringOutput `pulumi:"name"`
	// The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can't be deleted before expired time.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// The purchase period in month. Valid value: `1`, `2`, `3`, `6`, `12`.
	// > **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
	Period pulumi.IntPtrOutput `pulumi:"period"`
	// The association status of the bandwidth package.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewBandwidthPackage registers a new resource with the given unique name, arguments, and options.
func NewBandwidthPackage(ctx *pulumi.Context,
	name string, args *BandwidthPackageArgs, opts ...pulumi.ResourceOption) (*BandwidthPackage, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bandwidth == nil {
		return nil, errors.New("invalid value for required argument 'Bandwidth'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BandwidthPackage
	err := ctx.RegisterResource("alicloud:cen/bandwidthPackage:BandwidthPackage", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBandwidthPackage gets an existing BandwidthPackage resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBandwidthPackage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BandwidthPackageState, opts ...pulumi.ResourceOption) (*BandwidthPackage, error) {
	var resource BandwidthPackage
	err := ctx.ReadResource("alicloud:cen/bandwidthPackage:BandwidthPackage", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BandwidthPackage resources.
type bandwidthPackageState struct {
	// The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
	Bandwidth *int `pulumi:"bandwidth"`
	// The name of the bandwidth package. Defaults to null.
	//
	// ->**NOTE:** PrePaid mode will deduct fees from the account directly and the bandwidth package can't be deleted before expired time.
	//
	// ->**NOTE:** The PostPaid mode is only for test. Please open a ticket if you need.
	CenBandwidthPackageName *string `pulumi:"cenBandwidthPackageName"`
	// Field `chargeType` has been deprecated from version 1.97.0. Use `paymentType` and instead.
	//
	// Deprecated: Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead.
	ChargeType *string `pulumi:"chargeType"`
	// The description of the bandwidth package. Default to null.
	Description *string `pulumi:"description"`
	// The time of the bandwidth package to expire.
	ExpiredTime *string `pulumi:"expiredTime"`
	// The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
	GeographicRegionAId *string `pulumi:"geographicRegionAId"`
	// The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
	GeographicRegionBId *string `pulumi:"geographicRegionBId"`
	// Field `geographicRegionIds` has been deprecated from version 1.97.0. Use `geographicRegionAId` and `geographicRegionBId` instead.
	//
	// Deprecated: Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead.
	GeographicRegionIds []string `pulumi:"geographicRegionIds"`
	// Field `name` has been deprecated from version 1.97.0. Use `cenBandwidthPackageName` and instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead.
	Name *string `pulumi:"name"`
	// The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can't be deleted before expired time.
	PaymentType *string `pulumi:"paymentType"`
	// The purchase period in month. Valid value: `1`, `2`, `3`, `6`, `12`.
	// > **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
	Period *int `pulumi:"period"`
	// The association status of the bandwidth package.
	Status *string `pulumi:"status"`
}

type BandwidthPackageState struct {
	// The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
	Bandwidth pulumi.IntPtrInput
	// The name of the bandwidth package. Defaults to null.
	//
	// ->**NOTE:** PrePaid mode will deduct fees from the account directly and the bandwidth package can't be deleted before expired time.
	//
	// ->**NOTE:** The PostPaid mode is only for test. Please open a ticket if you need.
	CenBandwidthPackageName pulumi.StringPtrInput
	// Field `chargeType` has been deprecated from version 1.97.0. Use `paymentType` and instead.
	//
	// Deprecated: Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead.
	ChargeType pulumi.StringPtrInput
	// The description of the bandwidth package. Default to null.
	Description pulumi.StringPtrInput
	// The time of the bandwidth package to expire.
	ExpiredTime pulumi.StringPtrInput
	// The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
	GeographicRegionAId pulumi.StringPtrInput
	// The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
	GeographicRegionBId pulumi.StringPtrInput
	// Field `geographicRegionIds` has been deprecated from version 1.97.0. Use `geographicRegionAId` and `geographicRegionBId` instead.
	//
	// Deprecated: Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead.
	GeographicRegionIds pulumi.StringArrayInput
	// Field `name` has been deprecated from version 1.97.0. Use `cenBandwidthPackageName` and instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead.
	Name pulumi.StringPtrInput
	// The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can't be deleted before expired time.
	PaymentType pulumi.StringPtrInput
	// The purchase period in month. Valid value: `1`, `2`, `3`, `6`, `12`.
	// > **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
	Period pulumi.IntPtrInput
	// The association status of the bandwidth package.
	Status pulumi.StringPtrInput
}

func (BandwidthPackageState) ElementType() reflect.Type {
	return reflect.TypeOf((*bandwidthPackageState)(nil)).Elem()
}

type bandwidthPackageArgs struct {
	// The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
	Bandwidth int `pulumi:"bandwidth"`
	// The name of the bandwidth package. Defaults to null.
	//
	// ->**NOTE:** PrePaid mode will deduct fees from the account directly and the bandwidth package can't be deleted before expired time.
	//
	// ->**NOTE:** The PostPaid mode is only for test. Please open a ticket if you need.
	CenBandwidthPackageName *string `pulumi:"cenBandwidthPackageName"`
	// Field `chargeType` has been deprecated from version 1.97.0. Use `paymentType` and instead.
	//
	// Deprecated: Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead.
	ChargeType *string `pulumi:"chargeType"`
	// The description of the bandwidth package. Default to null.
	Description *string `pulumi:"description"`
	// The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
	GeographicRegionAId *string `pulumi:"geographicRegionAId"`
	// The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
	GeographicRegionBId *string `pulumi:"geographicRegionBId"`
	// Field `geographicRegionIds` has been deprecated from version 1.97.0. Use `geographicRegionAId` and `geographicRegionBId` instead.
	//
	// Deprecated: Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead.
	GeographicRegionIds []string `pulumi:"geographicRegionIds"`
	// Field `name` has been deprecated from version 1.97.0. Use `cenBandwidthPackageName` and instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead.
	Name *string `pulumi:"name"`
	// The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can't be deleted before expired time.
	PaymentType *string `pulumi:"paymentType"`
	// The purchase period in month. Valid value: `1`, `2`, `3`, `6`, `12`.
	// > **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
	Period *int `pulumi:"period"`
}

// The set of arguments for constructing a BandwidthPackage resource.
type BandwidthPackageArgs struct {
	// The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
	Bandwidth pulumi.IntInput
	// The name of the bandwidth package. Defaults to null.
	//
	// ->**NOTE:** PrePaid mode will deduct fees from the account directly and the bandwidth package can't be deleted before expired time.
	//
	// ->**NOTE:** The PostPaid mode is only for test. Please open a ticket if you need.
	CenBandwidthPackageName pulumi.StringPtrInput
	// Field `chargeType` has been deprecated from version 1.97.0. Use `paymentType` and instead.
	//
	// Deprecated: Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead.
	ChargeType pulumi.StringPtrInput
	// The description of the bandwidth package. Default to null.
	Description pulumi.StringPtrInput
	// The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
	GeographicRegionAId pulumi.StringPtrInput
	// The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
	GeographicRegionBId pulumi.StringPtrInput
	// Field `geographicRegionIds` has been deprecated from version 1.97.0. Use `geographicRegionAId` and `geographicRegionBId` instead.
	//
	// Deprecated: Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead.
	GeographicRegionIds pulumi.StringArrayInput
	// Field `name` has been deprecated from version 1.97.0. Use `cenBandwidthPackageName` and instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead.
	Name pulumi.StringPtrInput
	// The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can't be deleted before expired time.
	PaymentType pulumi.StringPtrInput
	// The purchase period in month. Valid value: `1`, `2`, `3`, `6`, `12`.
	// > **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
	Period pulumi.IntPtrInput
}

func (BandwidthPackageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bandwidthPackageArgs)(nil)).Elem()
}

type BandwidthPackageInput interface {
	pulumi.Input

	ToBandwidthPackageOutput() BandwidthPackageOutput
	ToBandwidthPackageOutputWithContext(ctx context.Context) BandwidthPackageOutput
}

func (*BandwidthPackage) ElementType() reflect.Type {
	return reflect.TypeOf((**BandwidthPackage)(nil)).Elem()
}

func (i *BandwidthPackage) ToBandwidthPackageOutput() BandwidthPackageOutput {
	return i.ToBandwidthPackageOutputWithContext(context.Background())
}

func (i *BandwidthPackage) ToBandwidthPackageOutputWithContext(ctx context.Context) BandwidthPackageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BandwidthPackageOutput)
}

// BandwidthPackageArrayInput is an input type that accepts BandwidthPackageArray and BandwidthPackageArrayOutput values.
// You can construct a concrete instance of `BandwidthPackageArrayInput` via:
//
//	BandwidthPackageArray{ BandwidthPackageArgs{...} }
type BandwidthPackageArrayInput interface {
	pulumi.Input

	ToBandwidthPackageArrayOutput() BandwidthPackageArrayOutput
	ToBandwidthPackageArrayOutputWithContext(context.Context) BandwidthPackageArrayOutput
}

type BandwidthPackageArray []BandwidthPackageInput

func (BandwidthPackageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BandwidthPackage)(nil)).Elem()
}

func (i BandwidthPackageArray) ToBandwidthPackageArrayOutput() BandwidthPackageArrayOutput {
	return i.ToBandwidthPackageArrayOutputWithContext(context.Background())
}

func (i BandwidthPackageArray) ToBandwidthPackageArrayOutputWithContext(ctx context.Context) BandwidthPackageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BandwidthPackageArrayOutput)
}

// BandwidthPackageMapInput is an input type that accepts BandwidthPackageMap and BandwidthPackageMapOutput values.
// You can construct a concrete instance of `BandwidthPackageMapInput` via:
//
//	BandwidthPackageMap{ "key": BandwidthPackageArgs{...} }
type BandwidthPackageMapInput interface {
	pulumi.Input

	ToBandwidthPackageMapOutput() BandwidthPackageMapOutput
	ToBandwidthPackageMapOutputWithContext(context.Context) BandwidthPackageMapOutput
}

type BandwidthPackageMap map[string]BandwidthPackageInput

func (BandwidthPackageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BandwidthPackage)(nil)).Elem()
}

func (i BandwidthPackageMap) ToBandwidthPackageMapOutput() BandwidthPackageMapOutput {
	return i.ToBandwidthPackageMapOutputWithContext(context.Background())
}

func (i BandwidthPackageMap) ToBandwidthPackageMapOutputWithContext(ctx context.Context) BandwidthPackageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BandwidthPackageMapOutput)
}

type BandwidthPackageOutput struct{ *pulumi.OutputState }

func (BandwidthPackageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BandwidthPackage)(nil)).Elem()
}

func (o BandwidthPackageOutput) ToBandwidthPackageOutput() BandwidthPackageOutput {
	return o
}

func (o BandwidthPackageOutput) ToBandwidthPackageOutputWithContext(ctx context.Context) BandwidthPackageOutput {
	return o
}

// The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
func (o BandwidthPackageOutput) Bandwidth() pulumi.IntOutput {
	return o.ApplyT(func(v *BandwidthPackage) pulumi.IntOutput { return v.Bandwidth }).(pulumi.IntOutput)
}

// The name of the bandwidth package. Defaults to null.
//
// ->**NOTE:** PrePaid mode will deduct fees from the account directly and the bandwidth package can't be deleted before expired time.
//
// ->**NOTE:** The PostPaid mode is only for test. Please open a ticket if you need.
func (o BandwidthPackageOutput) CenBandwidthPackageName() pulumi.StringOutput {
	return o.ApplyT(func(v *BandwidthPackage) pulumi.StringOutput { return v.CenBandwidthPackageName }).(pulumi.StringOutput)
}

// Field `chargeType` has been deprecated from version 1.97.0. Use `paymentType` and instead.
//
// Deprecated: Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead.
func (o BandwidthPackageOutput) ChargeType() pulumi.StringOutput {
	return o.ApplyT(func(v *BandwidthPackage) pulumi.StringOutput { return v.ChargeType }).(pulumi.StringOutput)
}

// The description of the bandwidth package. Default to null.
func (o BandwidthPackageOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BandwidthPackage) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The time of the bandwidth package to expire.
func (o BandwidthPackageOutput) ExpiredTime() pulumi.StringOutput {
	return o.ApplyT(func(v *BandwidthPackage) pulumi.StringOutput { return v.ExpiredTime }).(pulumi.StringOutput)
}

// The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
func (o BandwidthPackageOutput) GeographicRegionAId() pulumi.StringOutput {
	return o.ApplyT(func(v *BandwidthPackage) pulumi.StringOutput { return v.GeographicRegionAId }).(pulumi.StringOutput)
}

// The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
func (o BandwidthPackageOutput) GeographicRegionBId() pulumi.StringOutput {
	return o.ApplyT(func(v *BandwidthPackage) pulumi.StringOutput { return v.GeographicRegionBId }).(pulumi.StringOutput)
}

// Field `geographicRegionIds` has been deprecated from version 1.97.0. Use `geographicRegionAId` and `geographicRegionBId` instead.
//
// Deprecated: Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead.
func (o BandwidthPackageOutput) GeographicRegionIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *BandwidthPackage) pulumi.StringArrayOutput { return v.GeographicRegionIds }).(pulumi.StringArrayOutput)
}

// Field `name` has been deprecated from version 1.97.0. Use `cenBandwidthPackageName` and instead.
//
// Deprecated: Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead.
func (o BandwidthPackageOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *BandwidthPackage) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can't be deleted before expired time.
func (o BandwidthPackageOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *BandwidthPackage) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// The purchase period in month. Valid value: `1`, `2`, `3`, `6`, `12`.
// > **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
func (o BandwidthPackageOutput) Period() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BandwidthPackage) pulumi.IntPtrOutput { return v.Period }).(pulumi.IntPtrOutput)
}

// The association status of the bandwidth package.
func (o BandwidthPackageOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *BandwidthPackage) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type BandwidthPackageArrayOutput struct{ *pulumi.OutputState }

func (BandwidthPackageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BandwidthPackage)(nil)).Elem()
}

func (o BandwidthPackageArrayOutput) ToBandwidthPackageArrayOutput() BandwidthPackageArrayOutput {
	return o
}

func (o BandwidthPackageArrayOutput) ToBandwidthPackageArrayOutputWithContext(ctx context.Context) BandwidthPackageArrayOutput {
	return o
}

func (o BandwidthPackageArrayOutput) Index(i pulumi.IntInput) BandwidthPackageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BandwidthPackage {
		return vs[0].([]*BandwidthPackage)[vs[1].(int)]
	}).(BandwidthPackageOutput)
}

type BandwidthPackageMapOutput struct{ *pulumi.OutputState }

func (BandwidthPackageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BandwidthPackage)(nil)).Elem()
}

func (o BandwidthPackageMapOutput) ToBandwidthPackageMapOutput() BandwidthPackageMapOutput {
	return o
}

func (o BandwidthPackageMapOutput) ToBandwidthPackageMapOutputWithContext(ctx context.Context) BandwidthPackageMapOutput {
	return o
}

func (o BandwidthPackageMapOutput) MapIndex(k pulumi.StringInput) BandwidthPackageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BandwidthPackage {
		return vs[0].(map[string]*BandwidthPackage)[vs[1].(string)]
	}).(BandwidthPackageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BandwidthPackageInput)(nil)).Elem(), &BandwidthPackage{})
	pulumi.RegisterInputType(reflect.TypeOf((*BandwidthPackageArrayInput)(nil)).Elem(), BandwidthPackageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BandwidthPackageMapInput)(nil)).Elem(), BandwidthPackageMap{})
	pulumi.RegisterOutputType(BandwidthPackageOutput{})
	pulumi.RegisterOutputType(BandwidthPackageArrayOutput{})
	pulumi.RegisterOutputType(BandwidthPackageMapOutput{})
}
