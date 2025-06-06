// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a EIP Segment Address resource.
//
// For information about EIP Segment Address and how to use it, see [What is Segment Address](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/allocateeipsegmentaddress).
//
// > **NOTE:** Available since v1.207.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_, err := ecs.NewEipSegmentAddress(ctx, "default", &ecs.EipSegmentAddressArgs{
//				EipMask:            pulumi.String("28"),
//				Bandwidth:          pulumi.String("5"),
//				Isp:                pulumi.String("BGP"),
//				InternetChargeType: pulumi.String("PayByBandwidth"),
//				Netmode:            pulumi.String("public"),
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
// EIP Segment Address can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ecs/eipSegmentAddress:EipSegmentAddress example <id>
// ```
type EipSegmentAddress struct {
	pulumi.CustomResourceState

	// The maximum bandwidth of the contiguous EIP group. Unit: Mbit/s.
	// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByBandwidth`: `1` to `500`.****
	// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByTraffic`: `1` to `200`.****
	// - Valid values when `InstanceChargeType` is set to `PrePaid`: `1` to `1000`.****
	//
	// Default value: `5`. Unit: Mbit/s.
	Bandwidth pulumi.StringPtrOutput `pulumi:"bandwidth"`
	// The time when the contiguous Elastic IP address group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The subnet mask of the contiguous EIP group. Valid values:
	EipMask pulumi.StringOutput `pulumi:"eipMask"`
	// The metering method of the contiguous EIP group. Valid values:
	// - `PayByBandwidth` (default)
	// - `PayByTraffic`
	InternetChargeType pulumi.StringPtrOutput `pulumi:"internetChargeType"`
	// The line type. Valid values:
	// - `BGP` (default): BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.
	// - `BGP_PRO`: BGP (Multi-ISP) Pro line BGP (Multi-ISP) Pro line is supported only in the China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.
	//
	// For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see [EIP line types](https://www.alibabacloud.com/help/en/doc-detail/32321.html).
	//
	// If you are allowed to use single-ISP bandwidth, you can also use one of the following values:
	// - `ChinaTelecom`
	// - `ChinaUnicom`
	// - `ChinaMobile`
	// - `ChinaTelecom_L2`
	// - `ChinaUnicom_L2`
	// - `ChinaMobile_L2`
	//
	// If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to `BGP_FinanceCloud`.
	Isp pulumi.StringPtrOutput `pulumi:"isp"`
	// The network type. Set the value to `public`, which specifies the public network type.
	Netmode pulumi.StringPtrOutput `pulumi:"netmode"`
	// The resource group ID.
	ResourceGroupId pulumi.StringPtrOutput `pulumi:"resourceGroupId"`
	// The name of the contiguous Elastic IP address group.
	SegmentAddressName pulumi.StringOutput `pulumi:"segmentAddressName"`
	// The status of the resource
	Status pulumi.StringOutput `pulumi:"status"`
	// The zone of the contiguous EIP group.
	Zone pulumi.StringOutput `pulumi:"zone"`
}

// NewEipSegmentAddress registers a new resource with the given unique name, arguments, and options.
func NewEipSegmentAddress(ctx *pulumi.Context,
	name string, args *EipSegmentAddressArgs, opts ...pulumi.ResourceOption) (*EipSegmentAddress, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EipMask == nil {
		return nil, errors.New("invalid value for required argument 'EipMask'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EipSegmentAddress
	err := ctx.RegisterResource("alicloud:ecs/eipSegmentAddress:EipSegmentAddress", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEipSegmentAddress gets an existing EipSegmentAddress resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEipSegmentAddress(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EipSegmentAddressState, opts ...pulumi.ResourceOption) (*EipSegmentAddress, error) {
	var resource EipSegmentAddress
	err := ctx.ReadResource("alicloud:ecs/eipSegmentAddress:EipSegmentAddress", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EipSegmentAddress resources.
type eipSegmentAddressState struct {
	// The maximum bandwidth of the contiguous EIP group. Unit: Mbit/s.
	// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByBandwidth`: `1` to `500`.****
	// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByTraffic`: `1` to `200`.****
	// - Valid values when `InstanceChargeType` is set to `PrePaid`: `1` to `1000`.****
	//
	// Default value: `5`. Unit: Mbit/s.
	Bandwidth *string `pulumi:"bandwidth"`
	// The time when the contiguous Elastic IP address group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	CreateTime *string `pulumi:"createTime"`
	// The subnet mask of the contiguous EIP group. Valid values:
	EipMask *string `pulumi:"eipMask"`
	// The metering method of the contiguous EIP group. Valid values:
	// - `PayByBandwidth` (default)
	// - `PayByTraffic`
	InternetChargeType *string `pulumi:"internetChargeType"`
	// The line type. Valid values:
	// - `BGP` (default): BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.
	// - `BGP_PRO`: BGP (Multi-ISP) Pro line BGP (Multi-ISP) Pro line is supported only in the China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.
	//
	// For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see [EIP line types](https://www.alibabacloud.com/help/en/doc-detail/32321.html).
	//
	// If you are allowed to use single-ISP bandwidth, you can also use one of the following values:
	// - `ChinaTelecom`
	// - `ChinaUnicom`
	// - `ChinaMobile`
	// - `ChinaTelecom_L2`
	// - `ChinaUnicom_L2`
	// - `ChinaMobile_L2`
	//
	// If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to `BGP_FinanceCloud`.
	Isp *string `pulumi:"isp"`
	// The network type. Set the value to `public`, which specifies the public network type.
	Netmode *string `pulumi:"netmode"`
	// The resource group ID.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The name of the contiguous Elastic IP address group.
	SegmentAddressName *string `pulumi:"segmentAddressName"`
	// The status of the resource
	Status *string `pulumi:"status"`
	// The zone of the contiguous EIP group.
	Zone *string `pulumi:"zone"`
}

type EipSegmentAddressState struct {
	// The maximum bandwidth of the contiguous EIP group. Unit: Mbit/s.
	// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByBandwidth`: `1` to `500`.****
	// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByTraffic`: `1` to `200`.****
	// - Valid values when `InstanceChargeType` is set to `PrePaid`: `1` to `1000`.****
	//
	// Default value: `5`. Unit: Mbit/s.
	Bandwidth pulumi.StringPtrInput
	// The time when the contiguous Elastic IP address group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
	CreateTime pulumi.StringPtrInput
	// The subnet mask of the contiguous EIP group. Valid values:
	EipMask pulumi.StringPtrInput
	// The metering method of the contiguous EIP group. Valid values:
	// - `PayByBandwidth` (default)
	// - `PayByTraffic`
	InternetChargeType pulumi.StringPtrInput
	// The line type. Valid values:
	// - `BGP` (default): BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.
	// - `BGP_PRO`: BGP (Multi-ISP) Pro line BGP (Multi-ISP) Pro line is supported only in the China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.
	//
	// For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see [EIP line types](https://www.alibabacloud.com/help/en/doc-detail/32321.html).
	//
	// If you are allowed to use single-ISP bandwidth, you can also use one of the following values:
	// - `ChinaTelecom`
	// - `ChinaUnicom`
	// - `ChinaMobile`
	// - `ChinaTelecom_L2`
	// - `ChinaUnicom_L2`
	// - `ChinaMobile_L2`
	//
	// If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to `BGP_FinanceCloud`.
	Isp pulumi.StringPtrInput
	// The network type. Set the value to `public`, which specifies the public network type.
	Netmode pulumi.StringPtrInput
	// The resource group ID.
	ResourceGroupId pulumi.StringPtrInput
	// The name of the contiguous Elastic IP address group.
	SegmentAddressName pulumi.StringPtrInput
	// The status of the resource
	Status pulumi.StringPtrInput
	// The zone of the contiguous EIP group.
	Zone pulumi.StringPtrInput
}

func (EipSegmentAddressState) ElementType() reflect.Type {
	return reflect.TypeOf((*eipSegmentAddressState)(nil)).Elem()
}

type eipSegmentAddressArgs struct {
	// The maximum bandwidth of the contiguous EIP group. Unit: Mbit/s.
	// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByBandwidth`: `1` to `500`.****
	// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByTraffic`: `1` to `200`.****
	// - Valid values when `InstanceChargeType` is set to `PrePaid`: `1` to `1000`.****
	//
	// Default value: `5`. Unit: Mbit/s.
	Bandwidth *string `pulumi:"bandwidth"`
	// The subnet mask of the contiguous EIP group. Valid values:
	EipMask string `pulumi:"eipMask"`
	// The metering method of the contiguous EIP group. Valid values:
	// - `PayByBandwidth` (default)
	// - `PayByTraffic`
	InternetChargeType *string `pulumi:"internetChargeType"`
	// The line type. Valid values:
	// - `BGP` (default): BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.
	// - `BGP_PRO`: BGP (Multi-ISP) Pro line BGP (Multi-ISP) Pro line is supported only in the China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.
	//
	// For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see [EIP line types](https://www.alibabacloud.com/help/en/doc-detail/32321.html).
	//
	// If you are allowed to use single-ISP bandwidth, you can also use one of the following values:
	// - `ChinaTelecom`
	// - `ChinaUnicom`
	// - `ChinaMobile`
	// - `ChinaTelecom_L2`
	// - `ChinaUnicom_L2`
	// - `ChinaMobile_L2`
	//
	// If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to `BGP_FinanceCloud`.
	Isp *string `pulumi:"isp"`
	// The network type. Set the value to `public`, which specifies the public network type.
	Netmode *string `pulumi:"netmode"`
	// The resource group ID.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The zone of the contiguous EIP group.
	Zone *string `pulumi:"zone"`
}

// The set of arguments for constructing a EipSegmentAddress resource.
type EipSegmentAddressArgs struct {
	// The maximum bandwidth of the contiguous EIP group. Unit: Mbit/s.
	// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByBandwidth`: `1` to `500`.****
	// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByTraffic`: `1` to `200`.****
	// - Valid values when `InstanceChargeType` is set to `PrePaid`: `1` to `1000`.****
	//
	// Default value: `5`. Unit: Mbit/s.
	Bandwidth pulumi.StringPtrInput
	// The subnet mask of the contiguous EIP group. Valid values:
	EipMask pulumi.StringInput
	// The metering method of the contiguous EIP group. Valid values:
	// - `PayByBandwidth` (default)
	// - `PayByTraffic`
	InternetChargeType pulumi.StringPtrInput
	// The line type. Valid values:
	// - `BGP` (default): BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.
	// - `BGP_PRO`: BGP (Multi-ISP) Pro line BGP (Multi-ISP) Pro line is supported only in the China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.
	//
	// For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see [EIP line types](https://www.alibabacloud.com/help/en/doc-detail/32321.html).
	//
	// If you are allowed to use single-ISP bandwidth, you can also use one of the following values:
	// - `ChinaTelecom`
	// - `ChinaUnicom`
	// - `ChinaMobile`
	// - `ChinaTelecom_L2`
	// - `ChinaUnicom_L2`
	// - `ChinaMobile_L2`
	//
	// If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to `BGP_FinanceCloud`.
	Isp pulumi.StringPtrInput
	// The network type. Set the value to `public`, which specifies the public network type.
	Netmode pulumi.StringPtrInput
	// The resource group ID.
	ResourceGroupId pulumi.StringPtrInput
	// The zone of the contiguous EIP group.
	Zone pulumi.StringPtrInput
}

func (EipSegmentAddressArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eipSegmentAddressArgs)(nil)).Elem()
}

type EipSegmentAddressInput interface {
	pulumi.Input

	ToEipSegmentAddressOutput() EipSegmentAddressOutput
	ToEipSegmentAddressOutputWithContext(ctx context.Context) EipSegmentAddressOutput
}

func (*EipSegmentAddress) ElementType() reflect.Type {
	return reflect.TypeOf((**EipSegmentAddress)(nil)).Elem()
}

func (i *EipSegmentAddress) ToEipSegmentAddressOutput() EipSegmentAddressOutput {
	return i.ToEipSegmentAddressOutputWithContext(context.Background())
}

func (i *EipSegmentAddress) ToEipSegmentAddressOutputWithContext(ctx context.Context) EipSegmentAddressOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EipSegmentAddressOutput)
}

// EipSegmentAddressArrayInput is an input type that accepts EipSegmentAddressArray and EipSegmentAddressArrayOutput values.
// You can construct a concrete instance of `EipSegmentAddressArrayInput` via:
//
//	EipSegmentAddressArray{ EipSegmentAddressArgs{...} }
type EipSegmentAddressArrayInput interface {
	pulumi.Input

	ToEipSegmentAddressArrayOutput() EipSegmentAddressArrayOutput
	ToEipSegmentAddressArrayOutputWithContext(context.Context) EipSegmentAddressArrayOutput
}

type EipSegmentAddressArray []EipSegmentAddressInput

func (EipSegmentAddressArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EipSegmentAddress)(nil)).Elem()
}

func (i EipSegmentAddressArray) ToEipSegmentAddressArrayOutput() EipSegmentAddressArrayOutput {
	return i.ToEipSegmentAddressArrayOutputWithContext(context.Background())
}

func (i EipSegmentAddressArray) ToEipSegmentAddressArrayOutputWithContext(ctx context.Context) EipSegmentAddressArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EipSegmentAddressArrayOutput)
}

// EipSegmentAddressMapInput is an input type that accepts EipSegmentAddressMap and EipSegmentAddressMapOutput values.
// You can construct a concrete instance of `EipSegmentAddressMapInput` via:
//
//	EipSegmentAddressMap{ "key": EipSegmentAddressArgs{...} }
type EipSegmentAddressMapInput interface {
	pulumi.Input

	ToEipSegmentAddressMapOutput() EipSegmentAddressMapOutput
	ToEipSegmentAddressMapOutputWithContext(context.Context) EipSegmentAddressMapOutput
}

type EipSegmentAddressMap map[string]EipSegmentAddressInput

func (EipSegmentAddressMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EipSegmentAddress)(nil)).Elem()
}

func (i EipSegmentAddressMap) ToEipSegmentAddressMapOutput() EipSegmentAddressMapOutput {
	return i.ToEipSegmentAddressMapOutputWithContext(context.Background())
}

func (i EipSegmentAddressMap) ToEipSegmentAddressMapOutputWithContext(ctx context.Context) EipSegmentAddressMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EipSegmentAddressMapOutput)
}

type EipSegmentAddressOutput struct{ *pulumi.OutputState }

func (EipSegmentAddressOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EipSegmentAddress)(nil)).Elem()
}

func (o EipSegmentAddressOutput) ToEipSegmentAddressOutput() EipSegmentAddressOutput {
	return o
}

func (o EipSegmentAddressOutput) ToEipSegmentAddressOutputWithContext(ctx context.Context) EipSegmentAddressOutput {
	return o
}

// The maximum bandwidth of the contiguous EIP group. Unit: Mbit/s.
// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByBandwidth`: `1` to `500`.****
// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByTraffic`: `1` to `200`.****
// - Valid values when `InstanceChargeType` is set to `PrePaid`: `1` to `1000`.****
//
// Default value: `5`. Unit: Mbit/s.
func (o EipSegmentAddressOutput) Bandwidth() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EipSegmentAddress) pulumi.StringPtrOutput { return v.Bandwidth }).(pulumi.StringPtrOutput)
}

// The time when the contiguous Elastic IP address group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
func (o EipSegmentAddressOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *EipSegmentAddress) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The subnet mask of the contiguous EIP group. Valid values:
func (o EipSegmentAddressOutput) EipMask() pulumi.StringOutput {
	return o.ApplyT(func(v *EipSegmentAddress) pulumi.StringOutput { return v.EipMask }).(pulumi.StringOutput)
}

// The metering method of the contiguous EIP group. Valid values:
// - `PayByBandwidth` (default)
// - `PayByTraffic`
func (o EipSegmentAddressOutput) InternetChargeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EipSegmentAddress) pulumi.StringPtrOutput { return v.InternetChargeType }).(pulumi.StringPtrOutput)
}

// The line type. Valid values:
// - `BGP` (default): BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.
// - `BGP_PRO`: BGP (Multi-ISP) Pro line BGP (Multi-ISP) Pro line is supported only in the China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.
//
// For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see [EIP line types](https://www.alibabacloud.com/help/en/doc-detail/32321.html).
//
// If you are allowed to use single-ISP bandwidth, you can also use one of the following values:
// - `ChinaTelecom`
// - `ChinaUnicom`
// - `ChinaMobile`
// - `ChinaTelecom_L2`
// - `ChinaUnicom_L2`
// - `ChinaMobile_L2`
//
// If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to `BGP_FinanceCloud`.
func (o EipSegmentAddressOutput) Isp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EipSegmentAddress) pulumi.StringPtrOutput { return v.Isp }).(pulumi.StringPtrOutput)
}

// The network type. Set the value to `public`, which specifies the public network type.
func (o EipSegmentAddressOutput) Netmode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EipSegmentAddress) pulumi.StringPtrOutput { return v.Netmode }).(pulumi.StringPtrOutput)
}

// The resource group ID.
func (o EipSegmentAddressOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EipSegmentAddress) pulumi.StringPtrOutput { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// The name of the contiguous Elastic IP address group.
func (o EipSegmentAddressOutput) SegmentAddressName() pulumi.StringOutput {
	return o.ApplyT(func(v *EipSegmentAddress) pulumi.StringOutput { return v.SegmentAddressName }).(pulumi.StringOutput)
}

// The status of the resource
func (o EipSegmentAddressOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *EipSegmentAddress) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The zone of the contiguous EIP group.
func (o EipSegmentAddressOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v *EipSegmentAddress) pulumi.StringOutput { return v.Zone }).(pulumi.StringOutput)
}

type EipSegmentAddressArrayOutput struct{ *pulumi.OutputState }

func (EipSegmentAddressArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EipSegmentAddress)(nil)).Elem()
}

func (o EipSegmentAddressArrayOutput) ToEipSegmentAddressArrayOutput() EipSegmentAddressArrayOutput {
	return o
}

func (o EipSegmentAddressArrayOutput) ToEipSegmentAddressArrayOutputWithContext(ctx context.Context) EipSegmentAddressArrayOutput {
	return o
}

func (o EipSegmentAddressArrayOutput) Index(i pulumi.IntInput) EipSegmentAddressOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EipSegmentAddress {
		return vs[0].([]*EipSegmentAddress)[vs[1].(int)]
	}).(EipSegmentAddressOutput)
}

type EipSegmentAddressMapOutput struct{ *pulumi.OutputState }

func (EipSegmentAddressMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EipSegmentAddress)(nil)).Elem()
}

func (o EipSegmentAddressMapOutput) ToEipSegmentAddressMapOutput() EipSegmentAddressMapOutput {
	return o
}

func (o EipSegmentAddressMapOutput) ToEipSegmentAddressMapOutputWithContext(ctx context.Context) EipSegmentAddressMapOutput {
	return o
}

func (o EipSegmentAddressMapOutput) MapIndex(k pulumi.StringInput) EipSegmentAddressOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EipSegmentAddress {
		return vs[0].(map[string]*EipSegmentAddress)[vs[1].(string)]
	}).(EipSegmentAddressOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EipSegmentAddressInput)(nil)).Elem(), &EipSegmentAddress{})
	pulumi.RegisterInputType(reflect.TypeOf((*EipSegmentAddressArrayInput)(nil)).Elem(), EipSegmentAddressArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EipSegmentAddressMapInput)(nil)).Elem(), EipSegmentAddressMap{})
	pulumi.RegisterOutputType(EipSegmentAddressOutput{})
	pulumi.RegisterOutputType(EipSegmentAddressArrayOutput{})
	pulumi.RegisterOutputType(EipSegmentAddressMapOutput{})
}
