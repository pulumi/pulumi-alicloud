// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ens

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ENS Disk Instance Attachment resource. Disk instance mount.
//
// For information about ENS Disk Instance Attachment and how to use it, see [What is Disk Instance Attachment](https://www.alibabacloud.com/help/en/ens/developer-reference/api-ens-2017-11-10-attachdisk).
//
// > **NOTE:** Available since v1.216.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ens"
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
//			_default, err := ens.NewDisk(ctx, "default", &ens.DiskArgs{
//				Size:        pulumi.Int(20),
//				EnsRegionId: pulumi.String("cn-chenzhou-telecom_unicom_cmcc"),
//				PaymentType: pulumi.String("PayAsYouGo"),
//				Category:    pulumi.String("cloud_efficiency"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultInstance, err := ens.NewInstance(ctx, "default", &ens.InstanceArgs{
//				SystemDisk: &ens.InstanceSystemDiskArgs{
//					Size: pulumi.Int(20),
//				},
//				ImageId:                 pulumi.String("centos_6_08_64_20G_alibase_20171208"),
//				PaymentType:             pulumi.String("Subscription"),
//				InstanceType:            pulumi.String("ens.sn1.stiny"),
//				Password:                pulumi.String("12345678ABCabc"),
//				Amount:                  pulumi.Int(1),
//				InternetMaxBandwidthOut: pulumi.Int(10),
//				UniqueSuffix:            pulumi.Bool(true),
//				PublicIpIdentification:  pulumi.Bool(true),
//				EnsRegionId:             pulumi.String("cn-chenzhou-telecom_unicom_cmcc"),
//				ScheduleAreaLevel:       pulumi.String("Region"),
//				PeriodUnit:              pulumi.String("Month"),
//				Period:                  pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ens.NewDiskInstanceAttachment(ctx, "default", &ens.DiskInstanceAttachmentArgs{
//				InstanceId:         defaultInstance.ID(),
//				DeleteWithInstance: pulumi.String("false"),
//				DiskId:             _default.ID(),
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
// ENS Disk Instance Attachment can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ens/diskInstanceAttachment:DiskInstanceAttachment example <disk_id>:<instance_id>
// ```
type DiskInstanceAttachment struct {
	pulumi.CustomResourceState

	// Whether the cloud disk to be mounted is released with the instance  Value: true: When the instance is released, the cloud disk is released together with the instance. false: When the instance is released, the cloud disk is retained and is not released together with the instance. Empty means false by default.
	DeleteWithInstance pulumi.StringPtrOutput `pulumi:"deleteWithInstance"`
	// The ID of the cloud disk to be mounted. The Cloud Disk (DiskId) and the instance (InstanceId) must be on the same node.
	DiskId pulumi.StringOutput `pulumi:"diskId"`
	// Instance ID.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
}

// NewDiskInstanceAttachment registers a new resource with the given unique name, arguments, and options.
func NewDiskInstanceAttachment(ctx *pulumi.Context,
	name string, args *DiskInstanceAttachmentArgs, opts ...pulumi.ResourceOption) (*DiskInstanceAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DiskId == nil {
		return nil, errors.New("invalid value for required argument 'DiskId'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DiskInstanceAttachment
	err := ctx.RegisterResource("alicloud:ens/diskInstanceAttachment:DiskInstanceAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDiskInstanceAttachment gets an existing DiskInstanceAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDiskInstanceAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DiskInstanceAttachmentState, opts ...pulumi.ResourceOption) (*DiskInstanceAttachment, error) {
	var resource DiskInstanceAttachment
	err := ctx.ReadResource("alicloud:ens/diskInstanceAttachment:DiskInstanceAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DiskInstanceAttachment resources.
type diskInstanceAttachmentState struct {
	// Whether the cloud disk to be mounted is released with the instance  Value: true: When the instance is released, the cloud disk is released together with the instance. false: When the instance is released, the cloud disk is retained and is not released together with the instance. Empty means false by default.
	DeleteWithInstance *string `pulumi:"deleteWithInstance"`
	// The ID of the cloud disk to be mounted. The Cloud Disk (DiskId) and the instance (InstanceId) must be on the same node.
	DiskId *string `pulumi:"diskId"`
	// Instance ID.
	InstanceId *string `pulumi:"instanceId"`
}

type DiskInstanceAttachmentState struct {
	// Whether the cloud disk to be mounted is released with the instance  Value: true: When the instance is released, the cloud disk is released together with the instance. false: When the instance is released, the cloud disk is retained and is not released together with the instance. Empty means false by default.
	DeleteWithInstance pulumi.StringPtrInput
	// The ID of the cloud disk to be mounted. The Cloud Disk (DiskId) and the instance (InstanceId) must be on the same node.
	DiskId pulumi.StringPtrInput
	// Instance ID.
	InstanceId pulumi.StringPtrInput
}

func (DiskInstanceAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*diskInstanceAttachmentState)(nil)).Elem()
}

type diskInstanceAttachmentArgs struct {
	// Whether the cloud disk to be mounted is released with the instance  Value: true: When the instance is released, the cloud disk is released together with the instance. false: When the instance is released, the cloud disk is retained and is not released together with the instance. Empty means false by default.
	DeleteWithInstance *string `pulumi:"deleteWithInstance"`
	// The ID of the cloud disk to be mounted. The Cloud Disk (DiskId) and the instance (InstanceId) must be on the same node.
	DiskId string `pulumi:"diskId"`
	// Instance ID.
	InstanceId string `pulumi:"instanceId"`
}

// The set of arguments for constructing a DiskInstanceAttachment resource.
type DiskInstanceAttachmentArgs struct {
	// Whether the cloud disk to be mounted is released with the instance  Value: true: When the instance is released, the cloud disk is released together with the instance. false: When the instance is released, the cloud disk is retained and is not released together with the instance. Empty means false by default.
	DeleteWithInstance pulumi.StringPtrInput
	// The ID of the cloud disk to be mounted. The Cloud Disk (DiskId) and the instance (InstanceId) must be on the same node.
	DiskId pulumi.StringInput
	// Instance ID.
	InstanceId pulumi.StringInput
}

func (DiskInstanceAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*diskInstanceAttachmentArgs)(nil)).Elem()
}

type DiskInstanceAttachmentInput interface {
	pulumi.Input

	ToDiskInstanceAttachmentOutput() DiskInstanceAttachmentOutput
	ToDiskInstanceAttachmentOutputWithContext(ctx context.Context) DiskInstanceAttachmentOutput
}

func (*DiskInstanceAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskInstanceAttachment)(nil)).Elem()
}

func (i *DiskInstanceAttachment) ToDiskInstanceAttachmentOutput() DiskInstanceAttachmentOutput {
	return i.ToDiskInstanceAttachmentOutputWithContext(context.Background())
}

func (i *DiskInstanceAttachment) ToDiskInstanceAttachmentOutputWithContext(ctx context.Context) DiskInstanceAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskInstanceAttachmentOutput)
}

// DiskInstanceAttachmentArrayInput is an input type that accepts DiskInstanceAttachmentArray and DiskInstanceAttachmentArrayOutput values.
// You can construct a concrete instance of `DiskInstanceAttachmentArrayInput` via:
//
//	DiskInstanceAttachmentArray{ DiskInstanceAttachmentArgs{...} }
type DiskInstanceAttachmentArrayInput interface {
	pulumi.Input

	ToDiskInstanceAttachmentArrayOutput() DiskInstanceAttachmentArrayOutput
	ToDiskInstanceAttachmentArrayOutputWithContext(context.Context) DiskInstanceAttachmentArrayOutput
}

type DiskInstanceAttachmentArray []DiskInstanceAttachmentInput

func (DiskInstanceAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiskInstanceAttachment)(nil)).Elem()
}

func (i DiskInstanceAttachmentArray) ToDiskInstanceAttachmentArrayOutput() DiskInstanceAttachmentArrayOutput {
	return i.ToDiskInstanceAttachmentArrayOutputWithContext(context.Background())
}

func (i DiskInstanceAttachmentArray) ToDiskInstanceAttachmentArrayOutputWithContext(ctx context.Context) DiskInstanceAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskInstanceAttachmentArrayOutput)
}

// DiskInstanceAttachmentMapInput is an input type that accepts DiskInstanceAttachmentMap and DiskInstanceAttachmentMapOutput values.
// You can construct a concrete instance of `DiskInstanceAttachmentMapInput` via:
//
//	DiskInstanceAttachmentMap{ "key": DiskInstanceAttachmentArgs{...} }
type DiskInstanceAttachmentMapInput interface {
	pulumi.Input

	ToDiskInstanceAttachmentMapOutput() DiskInstanceAttachmentMapOutput
	ToDiskInstanceAttachmentMapOutputWithContext(context.Context) DiskInstanceAttachmentMapOutput
}

type DiskInstanceAttachmentMap map[string]DiskInstanceAttachmentInput

func (DiskInstanceAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiskInstanceAttachment)(nil)).Elem()
}

func (i DiskInstanceAttachmentMap) ToDiskInstanceAttachmentMapOutput() DiskInstanceAttachmentMapOutput {
	return i.ToDiskInstanceAttachmentMapOutputWithContext(context.Background())
}

func (i DiskInstanceAttachmentMap) ToDiskInstanceAttachmentMapOutputWithContext(ctx context.Context) DiskInstanceAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskInstanceAttachmentMapOutput)
}

type DiskInstanceAttachmentOutput struct{ *pulumi.OutputState }

func (DiskInstanceAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskInstanceAttachment)(nil)).Elem()
}

func (o DiskInstanceAttachmentOutput) ToDiskInstanceAttachmentOutput() DiskInstanceAttachmentOutput {
	return o
}

func (o DiskInstanceAttachmentOutput) ToDiskInstanceAttachmentOutputWithContext(ctx context.Context) DiskInstanceAttachmentOutput {
	return o
}

// Whether the cloud disk to be mounted is released with the instance  Value: true: When the instance is released, the cloud disk is released together with the instance. false: When the instance is released, the cloud disk is retained and is not released together with the instance. Empty means false by default.
func (o DiskInstanceAttachmentOutput) DeleteWithInstance() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DiskInstanceAttachment) pulumi.StringPtrOutput { return v.DeleteWithInstance }).(pulumi.StringPtrOutput)
}

// The ID of the cloud disk to be mounted. The Cloud Disk (DiskId) and the instance (InstanceId) must be on the same node.
func (o DiskInstanceAttachmentOutput) DiskId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskInstanceAttachment) pulumi.StringOutput { return v.DiskId }).(pulumi.StringOutput)
}

// Instance ID.
func (o DiskInstanceAttachmentOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskInstanceAttachment) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

type DiskInstanceAttachmentArrayOutput struct{ *pulumi.OutputState }

func (DiskInstanceAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiskInstanceAttachment)(nil)).Elem()
}

func (o DiskInstanceAttachmentArrayOutput) ToDiskInstanceAttachmentArrayOutput() DiskInstanceAttachmentArrayOutput {
	return o
}

func (o DiskInstanceAttachmentArrayOutput) ToDiskInstanceAttachmentArrayOutputWithContext(ctx context.Context) DiskInstanceAttachmentArrayOutput {
	return o
}

func (o DiskInstanceAttachmentArrayOutput) Index(i pulumi.IntInput) DiskInstanceAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DiskInstanceAttachment {
		return vs[0].([]*DiskInstanceAttachment)[vs[1].(int)]
	}).(DiskInstanceAttachmentOutput)
}

type DiskInstanceAttachmentMapOutput struct{ *pulumi.OutputState }

func (DiskInstanceAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiskInstanceAttachment)(nil)).Elem()
}

func (o DiskInstanceAttachmentMapOutput) ToDiskInstanceAttachmentMapOutput() DiskInstanceAttachmentMapOutput {
	return o
}

func (o DiskInstanceAttachmentMapOutput) ToDiskInstanceAttachmentMapOutputWithContext(ctx context.Context) DiskInstanceAttachmentMapOutput {
	return o
}

func (o DiskInstanceAttachmentMapOutput) MapIndex(k pulumi.StringInput) DiskInstanceAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DiskInstanceAttachment {
		return vs[0].(map[string]*DiskInstanceAttachment)[vs[1].(string)]
	}).(DiskInstanceAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DiskInstanceAttachmentInput)(nil)).Elem(), &DiskInstanceAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskInstanceAttachmentArrayInput)(nil)).Elem(), DiskInstanceAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskInstanceAttachmentMapInput)(nil)).Elem(), DiskInstanceAttachmentMap{})
	pulumi.RegisterOutputType(DiskInstanceAttachmentOutput{})
	pulumi.RegisterOutputType(DiskInstanceAttachmentArrayOutput{})
	pulumi.RegisterOutputType(DiskInstanceAttachmentMapOutput{})
}
