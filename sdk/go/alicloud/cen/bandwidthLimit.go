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

// Provides a CEN cross-regional interconnection bandwidth resource. To connect networks in different regions, you must set cross-region interconnection bandwidth after buying a bandwidth package. The total bandwidth set for all the interconnected regions of a bandwidth package cannot exceed the bandwidth of the bandwidth package. By default, 1 Kbps bandwidth is provided for connectivity test. To run normal business, you must buy a bandwidth package and set a proper interconnection bandwidth.
//
// For example, a CEN instance is bound to a bandwidth package of 20 Mbps and  the interconnection areas are Mainland China and North America. You can set the cross-region interconnection bandwidth between US West 1 and China East 1, China East 2, China South 1, and so on. However, the total bandwidth set for all the interconnected regions cannot exceed 20  Mbps.
//
// For information about CEN and how to use it, see [Cross-region interconnection bandwidth](https://www.alibabacloud.com/help/doc-detail/65983.htm)
//
// > **NOTE:** Available since v1.18.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			region1 := "eu-central-1"
//			if param := cfg.Get("region1"); param != "" {
//				region1 = param
//			}
//			region2 := "ap-southeast-1"
//			if param := cfg.Get("region2"); param != "" {
//				region2 = param
//			}
//			vpc1, err := vpc.NewNetwork(ctx, "vpc1", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("tf-example"),
//				CidrBlock: pulumi.String("192.168.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			vpc2, err := vpc.NewNetwork(ctx, "vpc2", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("tf-example"),
//				CidrBlock: pulumi.String("172.16.0.0/12"),
//			})
//			if err != nil {
//				return err
//			}
//			example, err := cen.NewInstance(ctx, "example", &cen.InstanceArgs{
//				CenInstanceName: pulumi.String("tf_example"),
//				Description:     pulumi.String("an example for cen"),
//			})
//			if err != nil {
//				return err
//			}
//			example1, err := cen.NewInstanceAttachment(ctx, "example1", &cen.InstanceAttachmentArgs{
//				InstanceId:            example.ID(),
//				ChildInstanceId:       vpc1.ID(),
//				ChildInstanceType:     pulumi.String("VPC"),
//				ChildInstanceRegionId: pulumi.String(region1),
//			})
//			if err != nil {
//				return err
//			}
//			example2, err := cen.NewInstanceAttachment(ctx, "example2", &cen.InstanceAttachmentArgs{
//				InstanceId:            example.ID(),
//				ChildInstanceId:       vpc2.ID(),
//				ChildInstanceType:     pulumi.String("VPC"),
//				ChildInstanceRegionId: pulumi.String(region2),
//			})
//			if err != nil {
//				return err
//			}
//			exampleBandwidthPackage, err := cen.NewBandwidthPackage(ctx, "example", &cen.BandwidthPackageArgs{
//				Bandwidth:               pulumi.Int(5),
//				CenBandwidthPackageName: pulumi.String("tf_example"),
//				GeographicRegionAId:     pulumi.String("Europe"),
//				GeographicRegionBId:     pulumi.String("Asia-Pacific"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleBandwidthPackageAttachment, err := cen.NewBandwidthPackageAttachment(ctx, "example", &cen.BandwidthPackageAttachmentArgs{
//				InstanceId:         example.ID(),
//				BandwidthPackageId: exampleBandwidthPackage.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cen.NewBandwidthLimit(ctx, "example", &cen.BandwidthLimitArgs{
//				InstanceId: exampleBandwidthPackageAttachment.InstanceId,
//				RegionIds: pulumi.StringArray{
//					example1.ChildInstanceRegionId,
//					example2.ChildInstanceRegionId,
//				},
//				BandwidthLimit: pulumi.Int(4),
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
// CEN bandwidth limit can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:cen/bandwidthLimit:BandwidthLimit example cen-abc123456:cn-beijing:eu-west-1
// ```
type BandwidthLimit struct {
	pulumi.CustomResourceState

	// The bandwidth configured for the interconnected regions communication.
	//
	// ->**NOTE:** The `cen.BandwidthLimit` resource depends on the related "cen.BandwidthPackageAttachment" resource and "cen.InstanceAttachment" resource.
	BandwidthLimit pulumi.IntOutput `pulumi:"bandwidthLimit"`
	// The ID of the CEN.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// List of the two regions to interconnect. Must be two different regions.
	RegionIds pulumi.StringArrayOutput `pulumi:"regionIds"`
}

// NewBandwidthLimit registers a new resource with the given unique name, arguments, and options.
func NewBandwidthLimit(ctx *pulumi.Context,
	name string, args *BandwidthLimitArgs, opts ...pulumi.ResourceOption) (*BandwidthLimit, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BandwidthLimit == nil {
		return nil, errors.New("invalid value for required argument 'BandwidthLimit'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.RegionIds == nil {
		return nil, errors.New("invalid value for required argument 'RegionIds'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BandwidthLimit
	err := ctx.RegisterResource("alicloud:cen/bandwidthLimit:BandwidthLimit", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBandwidthLimit gets an existing BandwidthLimit resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBandwidthLimit(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BandwidthLimitState, opts ...pulumi.ResourceOption) (*BandwidthLimit, error) {
	var resource BandwidthLimit
	err := ctx.ReadResource("alicloud:cen/bandwidthLimit:BandwidthLimit", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BandwidthLimit resources.
type bandwidthLimitState struct {
	// The bandwidth configured for the interconnected regions communication.
	//
	// ->**NOTE:** The `cen.BandwidthLimit` resource depends on the related "cen.BandwidthPackageAttachment" resource and "cen.InstanceAttachment" resource.
	BandwidthLimit *int `pulumi:"bandwidthLimit"`
	// The ID of the CEN.
	InstanceId *string `pulumi:"instanceId"`
	// List of the two regions to interconnect. Must be two different regions.
	RegionIds []string `pulumi:"regionIds"`
}

type BandwidthLimitState struct {
	// The bandwidth configured for the interconnected regions communication.
	//
	// ->**NOTE:** The `cen.BandwidthLimit` resource depends on the related "cen.BandwidthPackageAttachment" resource and "cen.InstanceAttachment" resource.
	BandwidthLimit pulumi.IntPtrInput
	// The ID of the CEN.
	InstanceId pulumi.StringPtrInput
	// List of the two regions to interconnect. Must be two different regions.
	RegionIds pulumi.StringArrayInput
}

func (BandwidthLimitState) ElementType() reflect.Type {
	return reflect.TypeOf((*bandwidthLimitState)(nil)).Elem()
}

type bandwidthLimitArgs struct {
	// The bandwidth configured for the interconnected regions communication.
	//
	// ->**NOTE:** The `cen.BandwidthLimit` resource depends on the related "cen.BandwidthPackageAttachment" resource and "cen.InstanceAttachment" resource.
	BandwidthLimit int `pulumi:"bandwidthLimit"`
	// The ID of the CEN.
	InstanceId string `pulumi:"instanceId"`
	// List of the two regions to interconnect. Must be two different regions.
	RegionIds []string `pulumi:"regionIds"`
}

// The set of arguments for constructing a BandwidthLimit resource.
type BandwidthLimitArgs struct {
	// The bandwidth configured for the interconnected regions communication.
	//
	// ->**NOTE:** The `cen.BandwidthLimit` resource depends on the related "cen.BandwidthPackageAttachment" resource and "cen.InstanceAttachment" resource.
	BandwidthLimit pulumi.IntInput
	// The ID of the CEN.
	InstanceId pulumi.StringInput
	// List of the two regions to interconnect. Must be two different regions.
	RegionIds pulumi.StringArrayInput
}

func (BandwidthLimitArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bandwidthLimitArgs)(nil)).Elem()
}

type BandwidthLimitInput interface {
	pulumi.Input

	ToBandwidthLimitOutput() BandwidthLimitOutput
	ToBandwidthLimitOutputWithContext(ctx context.Context) BandwidthLimitOutput
}

func (*BandwidthLimit) ElementType() reflect.Type {
	return reflect.TypeOf((**BandwidthLimit)(nil)).Elem()
}

func (i *BandwidthLimit) ToBandwidthLimitOutput() BandwidthLimitOutput {
	return i.ToBandwidthLimitOutputWithContext(context.Background())
}

func (i *BandwidthLimit) ToBandwidthLimitOutputWithContext(ctx context.Context) BandwidthLimitOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BandwidthLimitOutput)
}

// BandwidthLimitArrayInput is an input type that accepts BandwidthLimitArray and BandwidthLimitArrayOutput values.
// You can construct a concrete instance of `BandwidthLimitArrayInput` via:
//
//	BandwidthLimitArray{ BandwidthLimitArgs{...} }
type BandwidthLimitArrayInput interface {
	pulumi.Input

	ToBandwidthLimitArrayOutput() BandwidthLimitArrayOutput
	ToBandwidthLimitArrayOutputWithContext(context.Context) BandwidthLimitArrayOutput
}

type BandwidthLimitArray []BandwidthLimitInput

func (BandwidthLimitArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BandwidthLimit)(nil)).Elem()
}

func (i BandwidthLimitArray) ToBandwidthLimitArrayOutput() BandwidthLimitArrayOutput {
	return i.ToBandwidthLimitArrayOutputWithContext(context.Background())
}

func (i BandwidthLimitArray) ToBandwidthLimitArrayOutputWithContext(ctx context.Context) BandwidthLimitArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BandwidthLimitArrayOutput)
}

// BandwidthLimitMapInput is an input type that accepts BandwidthLimitMap and BandwidthLimitMapOutput values.
// You can construct a concrete instance of `BandwidthLimitMapInput` via:
//
//	BandwidthLimitMap{ "key": BandwidthLimitArgs{...} }
type BandwidthLimitMapInput interface {
	pulumi.Input

	ToBandwidthLimitMapOutput() BandwidthLimitMapOutput
	ToBandwidthLimitMapOutputWithContext(context.Context) BandwidthLimitMapOutput
}

type BandwidthLimitMap map[string]BandwidthLimitInput

func (BandwidthLimitMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BandwidthLimit)(nil)).Elem()
}

func (i BandwidthLimitMap) ToBandwidthLimitMapOutput() BandwidthLimitMapOutput {
	return i.ToBandwidthLimitMapOutputWithContext(context.Background())
}

func (i BandwidthLimitMap) ToBandwidthLimitMapOutputWithContext(ctx context.Context) BandwidthLimitMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BandwidthLimitMapOutput)
}

type BandwidthLimitOutput struct{ *pulumi.OutputState }

func (BandwidthLimitOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BandwidthLimit)(nil)).Elem()
}

func (o BandwidthLimitOutput) ToBandwidthLimitOutput() BandwidthLimitOutput {
	return o
}

func (o BandwidthLimitOutput) ToBandwidthLimitOutputWithContext(ctx context.Context) BandwidthLimitOutput {
	return o
}

// The bandwidth configured for the interconnected regions communication.
//
// ->**NOTE:** The `cen.BandwidthLimit` resource depends on the related "cen.BandwidthPackageAttachment" resource and "cen.InstanceAttachment" resource.
func (o BandwidthLimitOutput) BandwidthLimit() pulumi.IntOutput {
	return o.ApplyT(func(v *BandwidthLimit) pulumi.IntOutput { return v.BandwidthLimit }).(pulumi.IntOutput)
}

// The ID of the CEN.
func (o BandwidthLimitOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *BandwidthLimit) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// List of the two regions to interconnect. Must be two different regions.
func (o BandwidthLimitOutput) RegionIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *BandwidthLimit) pulumi.StringArrayOutput { return v.RegionIds }).(pulumi.StringArrayOutput)
}

type BandwidthLimitArrayOutput struct{ *pulumi.OutputState }

func (BandwidthLimitArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BandwidthLimit)(nil)).Elem()
}

func (o BandwidthLimitArrayOutput) ToBandwidthLimitArrayOutput() BandwidthLimitArrayOutput {
	return o
}

func (o BandwidthLimitArrayOutput) ToBandwidthLimitArrayOutputWithContext(ctx context.Context) BandwidthLimitArrayOutput {
	return o
}

func (o BandwidthLimitArrayOutput) Index(i pulumi.IntInput) BandwidthLimitOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BandwidthLimit {
		return vs[0].([]*BandwidthLimit)[vs[1].(int)]
	}).(BandwidthLimitOutput)
}

type BandwidthLimitMapOutput struct{ *pulumi.OutputState }

func (BandwidthLimitMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BandwidthLimit)(nil)).Elem()
}

func (o BandwidthLimitMapOutput) ToBandwidthLimitMapOutput() BandwidthLimitMapOutput {
	return o
}

func (o BandwidthLimitMapOutput) ToBandwidthLimitMapOutputWithContext(ctx context.Context) BandwidthLimitMapOutput {
	return o
}

func (o BandwidthLimitMapOutput) MapIndex(k pulumi.StringInput) BandwidthLimitOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BandwidthLimit {
		return vs[0].(map[string]*BandwidthLimit)[vs[1].(string)]
	}).(BandwidthLimitOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BandwidthLimitInput)(nil)).Elem(), &BandwidthLimit{})
	pulumi.RegisterInputType(reflect.TypeOf((*BandwidthLimitArrayInput)(nil)).Elem(), BandwidthLimitArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BandwidthLimitMapInput)(nil)).Elem(), BandwidthLimitMap{})
	pulumi.RegisterOutputType(BandwidthLimitOutput{})
	pulumi.RegisterOutputType(BandwidthLimitArrayOutput{})
	pulumi.RegisterOutputType(BandwidthLimitMapOutput{})
}
