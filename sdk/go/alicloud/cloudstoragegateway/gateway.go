// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudstoragegateway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloud Storage Gateway Gateway resource.
//
// For information about Cloud Storage Gateway Gateway and how to use it, see [What is Gateway](https://www.alibabacloud.com/help/en/csg/developer-reference/api-mnz46x).
//
// > **NOTE:** Available since v1.132.0.
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
//	"fmt"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cloudstoragegateway"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
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
//			_default, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			defaultInteger, err := random.NewInteger(ctx, "default", &random.IntegerArgs{
//				Min: 10000,
//				Max: 99999,
//			})
//			if err != nil {
//				return err
//			}
//			defaultStorageBundle, err := cloudstoragegateway.NewStorageBundle(ctx, "default", &cloudstoragegateway.StorageBundleArgs{
//				StorageBundleName: pulumi.Sprintf("%v-%v", name, defaultInteger.Result),
//			})
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "default", &vpc.NetworkArgs{
//				VpcName:   pulumi.Sprintf("%v-%v", name, defaultInteger.Result),
//				CidrBlock: pulumi.String("192.168.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "default", &vpc.SwitchArgs{
//				VswitchName: pulumi.Sprintf("%v-%v", name, defaultInteger.Result),
//				VpcId:       defaultNetwork.ID(),
//				CidrBlock:   pulumi.String("192.168.192.0/24"),
//				ZoneId:      pulumi.String(_default.Zones[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudstoragegateway.NewGateway(ctx, "default", &cloudstoragegateway.GatewayArgs{
//				StorageBundleId:        defaultStorageBundle.ID(),
//				Type:                   pulumi.String("File"),
//				Location:               pulumi.String("Cloud"),
//				GatewayName:            pulumi.String(name),
//				GatewayClass:           pulumi.String("Standard"),
//				VswitchId:              defaultSwitch.ID(),
//				PublicNetworkBandwidth: pulumi.Int(50),
//				PaymentType:            pulumi.String("PayAsYouGo"),
//				Description:            pulumi.String(name),
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
// Cloud Storage Gateway Gateway can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:cloudstoragegateway/gateway:Gateway example <id>
// ```
type Gateway struct {
	pulumi.CustomResourceState

	// The description of the gateway.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The specification of the gateway. Valid values: `Basic`, `Standard`, `Enhanced`, `Advanced`. **NOTE:** If `location` is set to `Cloud`, `gatewayClass` is required. Otherwise, `gatewayClass` will be ignored. If `paymentType` is set to `Subscription`, `gatewayClass` cannot be modified.
	GatewayClass pulumi.StringPtrOutput `pulumi:"gatewayClass"`
	// The name of the gateway. The name must be `1` to `60` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.
	GatewayName pulumi.StringOutput `pulumi:"gatewayName"`
	// The location of the gateway. Valid values: `Cloud`, `On_Premise`.
	Location pulumi.StringOutput `pulumi:"location"`
	// The Payment type of gateway. Valid values: `PayAsYouGo`, `Subscription`. **NOTE:** From version 1.233.0, `paymentType` can be set to `Subscription`.
	PaymentType pulumi.StringPtrOutput `pulumi:"paymentType"`
	// The public bandwidth of the gateway. Default value: `5`. Valid values: `5` to `200`. **NOTE:** `publicNetworkBandwidth` is only valid when `location` is `Cloud`. If `paymentType` is set to `Subscription`, `publicNetworkBandwidth` cannot be modified.
	PublicNetworkBandwidth pulumi.IntOutput `pulumi:"publicNetworkBandwidth"`
	// The detailed reason why you want to delete the gateway.
	ReasonDetail pulumi.StringPtrOutput `pulumi:"reasonDetail"`
	// The type of the reason why you want to delete the gateway.
	ReasonType pulumi.StringPtrOutput `pulumi:"reasonType"`
	// Specifies whether to release the gateway after the subscription expires. Valid values:
	ReleaseAfterExpiration pulumi.BoolPtrOutput `pulumi:"releaseAfterExpiration"`
	// The status of the Gateway.
	Status pulumi.StringOutput `pulumi:"status"`
	// The ID of the gateway cluster.
	StorageBundleId pulumi.StringOutput `pulumi:"storageBundleId"`
	// The type of the gateway. Valid values: `File`, `Iscsi`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The ID of the VSwitch. **NOTE:** If `location` is set to `Cloud`, `vswitchId` is required. Otherwise, `vswitchId` will be ignored.
	VswitchId pulumi.StringPtrOutput `pulumi:"vswitchId"`
}

// NewGateway registers a new resource with the given unique name, arguments, and options.
func NewGateway(ctx *pulumi.Context,
	name string, args *GatewayArgs, opts ...pulumi.ResourceOption) (*Gateway, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GatewayName == nil {
		return nil, errors.New("invalid value for required argument 'GatewayName'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.StorageBundleId == nil {
		return nil, errors.New("invalid value for required argument 'StorageBundleId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Gateway
	err := ctx.RegisterResource("alicloud:cloudstoragegateway/gateway:Gateway", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGateway gets an existing Gateway resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGateway(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewayState, opts ...pulumi.ResourceOption) (*Gateway, error) {
	var resource Gateway
	err := ctx.ReadResource("alicloud:cloudstoragegateway/gateway:Gateway", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Gateway resources.
type gatewayState struct {
	// The description of the gateway.
	Description *string `pulumi:"description"`
	// The specification of the gateway. Valid values: `Basic`, `Standard`, `Enhanced`, `Advanced`. **NOTE:** If `location` is set to `Cloud`, `gatewayClass` is required. Otherwise, `gatewayClass` will be ignored. If `paymentType` is set to `Subscription`, `gatewayClass` cannot be modified.
	GatewayClass *string `pulumi:"gatewayClass"`
	// The name of the gateway. The name must be `1` to `60` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.
	GatewayName *string `pulumi:"gatewayName"`
	// The location of the gateway. Valid values: `Cloud`, `On_Premise`.
	Location *string `pulumi:"location"`
	// The Payment type of gateway. Valid values: `PayAsYouGo`, `Subscription`. **NOTE:** From version 1.233.0, `paymentType` can be set to `Subscription`.
	PaymentType *string `pulumi:"paymentType"`
	// The public bandwidth of the gateway. Default value: `5`. Valid values: `5` to `200`. **NOTE:** `publicNetworkBandwidth` is only valid when `location` is `Cloud`. If `paymentType` is set to `Subscription`, `publicNetworkBandwidth` cannot be modified.
	PublicNetworkBandwidth *int `pulumi:"publicNetworkBandwidth"`
	// The detailed reason why you want to delete the gateway.
	ReasonDetail *string `pulumi:"reasonDetail"`
	// The type of the reason why you want to delete the gateway.
	ReasonType *string `pulumi:"reasonType"`
	// Specifies whether to release the gateway after the subscription expires. Valid values:
	ReleaseAfterExpiration *bool `pulumi:"releaseAfterExpiration"`
	// The status of the Gateway.
	Status *string `pulumi:"status"`
	// The ID of the gateway cluster.
	StorageBundleId *string `pulumi:"storageBundleId"`
	// The type of the gateway. Valid values: `File`, `Iscsi`.
	Type *string `pulumi:"type"`
	// The ID of the VSwitch. **NOTE:** If `location` is set to `Cloud`, `vswitchId` is required. Otherwise, `vswitchId` will be ignored.
	VswitchId *string `pulumi:"vswitchId"`
}

type GatewayState struct {
	// The description of the gateway.
	Description pulumi.StringPtrInput
	// The specification of the gateway. Valid values: `Basic`, `Standard`, `Enhanced`, `Advanced`. **NOTE:** If `location` is set to `Cloud`, `gatewayClass` is required. Otherwise, `gatewayClass` will be ignored. If `paymentType` is set to `Subscription`, `gatewayClass` cannot be modified.
	GatewayClass pulumi.StringPtrInput
	// The name of the gateway. The name must be `1` to `60` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.
	GatewayName pulumi.StringPtrInput
	// The location of the gateway. Valid values: `Cloud`, `On_Premise`.
	Location pulumi.StringPtrInput
	// The Payment type of gateway. Valid values: `PayAsYouGo`, `Subscription`. **NOTE:** From version 1.233.0, `paymentType` can be set to `Subscription`.
	PaymentType pulumi.StringPtrInput
	// The public bandwidth of the gateway. Default value: `5`. Valid values: `5` to `200`. **NOTE:** `publicNetworkBandwidth` is only valid when `location` is `Cloud`. If `paymentType` is set to `Subscription`, `publicNetworkBandwidth` cannot be modified.
	PublicNetworkBandwidth pulumi.IntPtrInput
	// The detailed reason why you want to delete the gateway.
	ReasonDetail pulumi.StringPtrInput
	// The type of the reason why you want to delete the gateway.
	ReasonType pulumi.StringPtrInput
	// Specifies whether to release the gateway after the subscription expires. Valid values:
	ReleaseAfterExpiration pulumi.BoolPtrInput
	// The status of the Gateway.
	Status pulumi.StringPtrInput
	// The ID of the gateway cluster.
	StorageBundleId pulumi.StringPtrInput
	// The type of the gateway. Valid values: `File`, `Iscsi`.
	Type pulumi.StringPtrInput
	// The ID of the VSwitch. **NOTE:** If `location` is set to `Cloud`, `vswitchId` is required. Otherwise, `vswitchId` will be ignored.
	VswitchId pulumi.StringPtrInput
}

func (GatewayState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayState)(nil)).Elem()
}

type gatewayArgs struct {
	// The description of the gateway.
	Description *string `pulumi:"description"`
	// The specification of the gateway. Valid values: `Basic`, `Standard`, `Enhanced`, `Advanced`. **NOTE:** If `location` is set to `Cloud`, `gatewayClass` is required. Otherwise, `gatewayClass` will be ignored. If `paymentType` is set to `Subscription`, `gatewayClass` cannot be modified.
	GatewayClass *string `pulumi:"gatewayClass"`
	// The name of the gateway. The name must be `1` to `60` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.
	GatewayName string `pulumi:"gatewayName"`
	// The location of the gateway. Valid values: `Cloud`, `On_Premise`.
	Location string `pulumi:"location"`
	// The Payment type of gateway. Valid values: `PayAsYouGo`, `Subscription`. **NOTE:** From version 1.233.0, `paymentType` can be set to `Subscription`.
	PaymentType *string `pulumi:"paymentType"`
	// The public bandwidth of the gateway. Default value: `5`. Valid values: `5` to `200`. **NOTE:** `publicNetworkBandwidth` is only valid when `location` is `Cloud`. If `paymentType` is set to `Subscription`, `publicNetworkBandwidth` cannot be modified.
	PublicNetworkBandwidth *int `pulumi:"publicNetworkBandwidth"`
	// The detailed reason why you want to delete the gateway.
	ReasonDetail *string `pulumi:"reasonDetail"`
	// The type of the reason why you want to delete the gateway.
	ReasonType *string `pulumi:"reasonType"`
	// Specifies whether to release the gateway after the subscription expires. Valid values:
	ReleaseAfterExpiration *bool `pulumi:"releaseAfterExpiration"`
	// The ID of the gateway cluster.
	StorageBundleId string `pulumi:"storageBundleId"`
	// The type of the gateway. Valid values: `File`, `Iscsi`.
	Type string `pulumi:"type"`
	// The ID of the VSwitch. **NOTE:** If `location` is set to `Cloud`, `vswitchId` is required. Otherwise, `vswitchId` will be ignored.
	VswitchId *string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a Gateway resource.
type GatewayArgs struct {
	// The description of the gateway.
	Description pulumi.StringPtrInput
	// The specification of the gateway. Valid values: `Basic`, `Standard`, `Enhanced`, `Advanced`. **NOTE:** If `location` is set to `Cloud`, `gatewayClass` is required. Otherwise, `gatewayClass` will be ignored. If `paymentType` is set to `Subscription`, `gatewayClass` cannot be modified.
	GatewayClass pulumi.StringPtrInput
	// The name of the gateway. The name must be `1` to `60` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.
	GatewayName pulumi.StringInput
	// The location of the gateway. Valid values: `Cloud`, `On_Premise`.
	Location pulumi.StringInput
	// The Payment type of gateway. Valid values: `PayAsYouGo`, `Subscription`. **NOTE:** From version 1.233.0, `paymentType` can be set to `Subscription`.
	PaymentType pulumi.StringPtrInput
	// The public bandwidth of the gateway. Default value: `5`. Valid values: `5` to `200`. **NOTE:** `publicNetworkBandwidth` is only valid when `location` is `Cloud`. If `paymentType` is set to `Subscription`, `publicNetworkBandwidth` cannot be modified.
	PublicNetworkBandwidth pulumi.IntPtrInput
	// The detailed reason why you want to delete the gateway.
	ReasonDetail pulumi.StringPtrInput
	// The type of the reason why you want to delete the gateway.
	ReasonType pulumi.StringPtrInput
	// Specifies whether to release the gateway after the subscription expires. Valid values:
	ReleaseAfterExpiration pulumi.BoolPtrInput
	// The ID of the gateway cluster.
	StorageBundleId pulumi.StringInput
	// The type of the gateway. Valid values: `File`, `Iscsi`.
	Type pulumi.StringInput
	// The ID of the VSwitch. **NOTE:** If `location` is set to `Cloud`, `vswitchId` is required. Otherwise, `vswitchId` will be ignored.
	VswitchId pulumi.StringPtrInput
}

func (GatewayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayArgs)(nil)).Elem()
}

type GatewayInput interface {
	pulumi.Input

	ToGatewayOutput() GatewayOutput
	ToGatewayOutputWithContext(ctx context.Context) GatewayOutput
}

func (*Gateway) ElementType() reflect.Type {
	return reflect.TypeOf((**Gateway)(nil)).Elem()
}

func (i *Gateway) ToGatewayOutput() GatewayOutput {
	return i.ToGatewayOutputWithContext(context.Background())
}

func (i *Gateway) ToGatewayOutputWithContext(ctx context.Context) GatewayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayOutput)
}

// GatewayArrayInput is an input type that accepts GatewayArray and GatewayArrayOutput values.
// You can construct a concrete instance of `GatewayArrayInput` via:
//
//	GatewayArray{ GatewayArgs{...} }
type GatewayArrayInput interface {
	pulumi.Input

	ToGatewayArrayOutput() GatewayArrayOutput
	ToGatewayArrayOutputWithContext(context.Context) GatewayArrayOutput
}

type GatewayArray []GatewayInput

func (GatewayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Gateway)(nil)).Elem()
}

func (i GatewayArray) ToGatewayArrayOutput() GatewayArrayOutput {
	return i.ToGatewayArrayOutputWithContext(context.Background())
}

func (i GatewayArray) ToGatewayArrayOutputWithContext(ctx context.Context) GatewayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayArrayOutput)
}

// GatewayMapInput is an input type that accepts GatewayMap and GatewayMapOutput values.
// You can construct a concrete instance of `GatewayMapInput` via:
//
//	GatewayMap{ "key": GatewayArgs{...} }
type GatewayMapInput interface {
	pulumi.Input

	ToGatewayMapOutput() GatewayMapOutput
	ToGatewayMapOutputWithContext(context.Context) GatewayMapOutput
}

type GatewayMap map[string]GatewayInput

func (GatewayMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Gateway)(nil)).Elem()
}

func (i GatewayMap) ToGatewayMapOutput() GatewayMapOutput {
	return i.ToGatewayMapOutputWithContext(context.Background())
}

func (i GatewayMap) ToGatewayMapOutputWithContext(ctx context.Context) GatewayMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayMapOutput)
}

type GatewayOutput struct{ *pulumi.OutputState }

func (GatewayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Gateway)(nil)).Elem()
}

func (o GatewayOutput) ToGatewayOutput() GatewayOutput {
	return o
}

func (o GatewayOutput) ToGatewayOutputWithContext(ctx context.Context) GatewayOutput {
	return o
}

// The description of the gateway.
func (o GatewayOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The specification of the gateway. Valid values: `Basic`, `Standard`, `Enhanced`, `Advanced`. **NOTE:** If `location` is set to `Cloud`, `gatewayClass` is required. Otherwise, `gatewayClass` will be ignored. If `paymentType` is set to `Subscription`, `gatewayClass` cannot be modified.
func (o GatewayOutput) GatewayClass() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.GatewayClass }).(pulumi.StringPtrOutput)
}

// The name of the gateway. The name must be `1` to `60` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.
func (o GatewayOutput) GatewayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.GatewayName }).(pulumi.StringOutput)
}

// The location of the gateway. Valid values: `Cloud`, `On_Premise`.
func (o GatewayOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The Payment type of gateway. Valid values: `PayAsYouGo`, `Subscription`. **NOTE:** From version 1.233.0, `paymentType` can be set to `Subscription`.
func (o GatewayOutput) PaymentType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.PaymentType }).(pulumi.StringPtrOutput)
}

// The public bandwidth of the gateway. Default value: `5`. Valid values: `5` to `200`. **NOTE:** `publicNetworkBandwidth` is only valid when `location` is `Cloud`. If `paymentType` is set to `Subscription`, `publicNetworkBandwidth` cannot be modified.
func (o GatewayOutput) PublicNetworkBandwidth() pulumi.IntOutput {
	return o.ApplyT(func(v *Gateway) pulumi.IntOutput { return v.PublicNetworkBandwidth }).(pulumi.IntOutput)
}

// The detailed reason why you want to delete the gateway.
func (o GatewayOutput) ReasonDetail() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.ReasonDetail }).(pulumi.StringPtrOutput)
}

// The type of the reason why you want to delete the gateway.
func (o GatewayOutput) ReasonType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.ReasonType }).(pulumi.StringPtrOutput)
}

// Specifies whether to release the gateway after the subscription expires. Valid values:
func (o GatewayOutput) ReleaseAfterExpiration() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.BoolPtrOutput { return v.ReleaseAfterExpiration }).(pulumi.BoolPtrOutput)
}

// The status of the Gateway.
func (o GatewayOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The ID of the gateway cluster.
func (o GatewayOutput) StorageBundleId() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.StorageBundleId }).(pulumi.StringOutput)
}

// The type of the gateway. Valid values: `File`, `Iscsi`.
func (o GatewayOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The ID of the VSwitch. **NOTE:** If `location` is set to `Cloud`, `vswitchId` is required. Otherwise, `vswitchId` will be ignored.
func (o GatewayOutput) VswitchId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.VswitchId }).(pulumi.StringPtrOutput)
}

type GatewayArrayOutput struct{ *pulumi.OutputState }

func (GatewayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Gateway)(nil)).Elem()
}

func (o GatewayArrayOutput) ToGatewayArrayOutput() GatewayArrayOutput {
	return o
}

func (o GatewayArrayOutput) ToGatewayArrayOutputWithContext(ctx context.Context) GatewayArrayOutput {
	return o
}

func (o GatewayArrayOutput) Index(i pulumi.IntInput) GatewayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Gateway {
		return vs[0].([]*Gateway)[vs[1].(int)]
	}).(GatewayOutput)
}

type GatewayMapOutput struct{ *pulumi.OutputState }

func (GatewayMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Gateway)(nil)).Elem()
}

func (o GatewayMapOutput) ToGatewayMapOutput() GatewayMapOutput {
	return o
}

func (o GatewayMapOutput) ToGatewayMapOutputWithContext(ctx context.Context) GatewayMapOutput {
	return o
}

func (o GatewayMapOutput) MapIndex(k pulumi.StringInput) GatewayOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Gateway {
		return vs[0].(map[string]*Gateway)[vs[1].(string)]
	}).(GatewayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayInput)(nil)).Elem(), &Gateway{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayArrayInput)(nil)).Elem(), GatewayArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayMapInput)(nil)).Elem(), GatewayMap{})
	pulumi.RegisterOutputType(GatewayOutput{})
	pulumi.RegisterOutputType(GatewayArrayOutput{})
	pulumi.RegisterOutputType(GatewayMapOutput{})
}
