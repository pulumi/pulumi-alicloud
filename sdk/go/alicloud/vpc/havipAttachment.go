// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
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
//			_default, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			example, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
//				AvailabilityZone: pulumi.StringRef(_default.Zones[0].Id),
//				CpuCoreCount:     pulumi.IntRef(1),
//				MemorySize:       pulumi.Float64Ref(2),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGetImages, err := ecs.GetImages(ctx, &ecs.GetImagesArgs{
//				NameRegex: pulumi.StringRef("^ubuntu_18.*64"),
//				Owners:    pulumi.StringRef("system"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleNetwork, err := vpc.NewNetwork(ctx, "example", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("10.4.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSwitch, err := vpc.NewSwitch(ctx, "example", &vpc.SwitchArgs{
//				VswitchName: pulumi.String(name),
//				CidrBlock:   pulumi.String("10.4.0.0/24"),
//				VpcId:       exampleNetwork.ID(),
//				ZoneId:      pulumi.String(_default.Zones[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			exampleHAVip, err := vpc.NewHAVip(ctx, "example", &vpc.HAVipArgs{
//				VswitchId:   exampleSwitch.ID(),
//				Description: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSecurityGroup, err := ecs.NewSecurityGroup(ctx, "example", &ecs.SecurityGroupArgs{
//				Name:        pulumi.String(name),
//				Description: pulumi.String(name),
//				VpcId:       exampleNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleInstance, err := ecs.NewInstance(ctx, "example", &ecs.InstanceArgs{
//				AvailabilityZone:        pulumi.String(_default.Zones[0].Id),
//				VswitchId:               exampleSwitch.ID(),
//				ImageId:                 pulumi.String(exampleGetImages.Images[0].Id),
//				InstanceType:            pulumi.String(example.InstanceTypes[0].Id),
//				SystemDiskCategory:      pulumi.String("cloud_efficiency"),
//				InternetChargeType:      pulumi.String("PayByTraffic"),
//				InternetMaxBandwidthOut: pulumi.Int(5),
//				SecurityGroups: pulumi.StringArray{
//					exampleSecurityGroup.ID(),
//				},
//				InstanceName: pulumi.String(name),
//				UserData:     pulumi.String("echo 'net.ipv4.ip_forward=1'>> /etc/sysctl.conf"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewHAVipAttachment(ctx, "example", &vpc.HAVipAttachmentArgs{
//				HaVipId:    exampleHAVip.ID(),
//				InstanceId: exampleInstance.ID(),
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
// VPC Ha Vip Attachment can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:vpc/hAVipAttachment:HAVipAttachment example <ha_vip_id>:<instance_id>
// ```
type HAVipAttachment struct {
	pulumi.CustomResourceState

	// Whether to force the ECS instance or Eni instance bound to AVIP to be unbound. The value is:
	// - **True**: Force unbinding.
	// - **False** (default): unbinding is not forced.
	// > **NOTE:**  If the value of this parameter is **False**, the Master instance bound to HaVip cannot be unbound.
	Force pulumi.BoolPtrOutput `pulumi:"force"`
	// The ID of the HaVip instance.
	HaVipId pulumi.StringOutput `pulumi:"haVipId"`
	// . Field 'havip_id' has been deprecated from provider version 1.211.0. New field 'ha_vip_id' instead.
	//
	// Deprecated: Field 'havip_id' has been deprecated since provider version 1.211.0. New field 'ha_vip_id' instead.
	HavipId pulumi.StringOutput `pulumi:"havipId"`
	// The ID of the ECS instance bound to the HaVip instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The type of the instance associated with the VIIP.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewHAVipAttachment registers a new resource with the given unique name, arguments, and options.
func NewHAVipAttachment(ctx *pulumi.Context,
	name string, args *HAVipAttachmentArgs, opts ...pulumi.ResourceOption) (*HAVipAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HAVipAttachment
	err := ctx.RegisterResource("alicloud:vpc/hAVipAttachment:HAVipAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHAVipAttachment gets an existing HAVipAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHAVipAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HAVipAttachmentState, opts ...pulumi.ResourceOption) (*HAVipAttachment, error) {
	var resource HAVipAttachment
	err := ctx.ReadResource("alicloud:vpc/hAVipAttachment:HAVipAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HAVipAttachment resources.
type havipAttachmentState struct {
	// Whether to force the ECS instance or Eni instance bound to AVIP to be unbound. The value is:
	// - **True**: Force unbinding.
	// - **False** (default): unbinding is not forced.
	// > **NOTE:**  If the value of this parameter is **False**, the Master instance bound to HaVip cannot be unbound.
	Force *bool `pulumi:"force"`
	// The ID of the HaVip instance.
	HaVipId *string `pulumi:"haVipId"`
	// . Field 'havip_id' has been deprecated from provider version 1.211.0. New field 'ha_vip_id' instead.
	//
	// Deprecated: Field 'havip_id' has been deprecated since provider version 1.211.0. New field 'ha_vip_id' instead.
	HavipId *string `pulumi:"havipId"`
	// The ID of the ECS instance bound to the HaVip instance.
	InstanceId *string `pulumi:"instanceId"`
	// The type of the instance associated with the VIIP.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	InstanceType *string `pulumi:"instanceType"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

type HAVipAttachmentState struct {
	// Whether to force the ECS instance or Eni instance bound to AVIP to be unbound. The value is:
	// - **True**: Force unbinding.
	// - **False** (default): unbinding is not forced.
	// > **NOTE:**  If the value of this parameter is **False**, the Master instance bound to HaVip cannot be unbound.
	Force pulumi.BoolPtrInput
	// The ID of the HaVip instance.
	HaVipId pulumi.StringPtrInput
	// . Field 'havip_id' has been deprecated from provider version 1.211.0. New field 'ha_vip_id' instead.
	//
	// Deprecated: Field 'havip_id' has been deprecated since provider version 1.211.0. New field 'ha_vip_id' instead.
	HavipId pulumi.StringPtrInput
	// The ID of the ECS instance bound to the HaVip instance.
	InstanceId pulumi.StringPtrInput
	// The type of the instance associated with the VIIP.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	InstanceType pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
}

func (HAVipAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*havipAttachmentState)(nil)).Elem()
}

type havipAttachmentArgs struct {
	// Whether to force the ECS instance or Eni instance bound to AVIP to be unbound. The value is:
	// - **True**: Force unbinding.
	// - **False** (default): unbinding is not forced.
	// > **NOTE:**  If the value of this parameter is **False**, the Master instance bound to HaVip cannot be unbound.
	Force *bool `pulumi:"force"`
	// The ID of the HaVip instance.
	HaVipId *string `pulumi:"haVipId"`
	// . Field 'havip_id' has been deprecated from provider version 1.211.0. New field 'ha_vip_id' instead.
	//
	// Deprecated: Field 'havip_id' has been deprecated since provider version 1.211.0. New field 'ha_vip_id' instead.
	HavipId *string `pulumi:"havipId"`
	// The ID of the ECS instance bound to the HaVip instance.
	InstanceId string `pulumi:"instanceId"`
	// The type of the instance associated with the VIIP.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	InstanceType *string `pulumi:"instanceType"`
}

// The set of arguments for constructing a HAVipAttachment resource.
type HAVipAttachmentArgs struct {
	// Whether to force the ECS instance or Eni instance bound to AVIP to be unbound. The value is:
	// - **True**: Force unbinding.
	// - **False** (default): unbinding is not forced.
	// > **NOTE:**  If the value of this parameter is **False**, the Master instance bound to HaVip cannot be unbound.
	Force pulumi.BoolPtrInput
	// The ID of the HaVip instance.
	HaVipId pulumi.StringPtrInput
	// . Field 'havip_id' has been deprecated from provider version 1.211.0. New field 'ha_vip_id' instead.
	//
	// Deprecated: Field 'havip_id' has been deprecated since provider version 1.211.0. New field 'ha_vip_id' instead.
	HavipId pulumi.StringPtrInput
	// The ID of the ECS instance bound to the HaVip instance.
	InstanceId pulumi.StringInput
	// The type of the instance associated with the VIIP.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	InstanceType pulumi.StringPtrInput
}

func (HAVipAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*havipAttachmentArgs)(nil)).Elem()
}

type HAVipAttachmentInput interface {
	pulumi.Input

	ToHAVipAttachmentOutput() HAVipAttachmentOutput
	ToHAVipAttachmentOutputWithContext(ctx context.Context) HAVipAttachmentOutput
}

func (*HAVipAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**HAVipAttachment)(nil)).Elem()
}

func (i *HAVipAttachment) ToHAVipAttachmentOutput() HAVipAttachmentOutput {
	return i.ToHAVipAttachmentOutputWithContext(context.Background())
}

func (i *HAVipAttachment) ToHAVipAttachmentOutputWithContext(ctx context.Context) HAVipAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HAVipAttachmentOutput)
}

// HAVipAttachmentArrayInput is an input type that accepts HAVipAttachmentArray and HAVipAttachmentArrayOutput values.
// You can construct a concrete instance of `HAVipAttachmentArrayInput` via:
//
//	HAVipAttachmentArray{ HAVipAttachmentArgs{...} }
type HAVipAttachmentArrayInput interface {
	pulumi.Input

	ToHAVipAttachmentArrayOutput() HAVipAttachmentArrayOutput
	ToHAVipAttachmentArrayOutputWithContext(context.Context) HAVipAttachmentArrayOutput
}

type HAVipAttachmentArray []HAVipAttachmentInput

func (HAVipAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HAVipAttachment)(nil)).Elem()
}

func (i HAVipAttachmentArray) ToHAVipAttachmentArrayOutput() HAVipAttachmentArrayOutput {
	return i.ToHAVipAttachmentArrayOutputWithContext(context.Background())
}

func (i HAVipAttachmentArray) ToHAVipAttachmentArrayOutputWithContext(ctx context.Context) HAVipAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HAVipAttachmentArrayOutput)
}

// HAVipAttachmentMapInput is an input type that accepts HAVipAttachmentMap and HAVipAttachmentMapOutput values.
// You can construct a concrete instance of `HAVipAttachmentMapInput` via:
//
//	HAVipAttachmentMap{ "key": HAVipAttachmentArgs{...} }
type HAVipAttachmentMapInput interface {
	pulumi.Input

	ToHAVipAttachmentMapOutput() HAVipAttachmentMapOutput
	ToHAVipAttachmentMapOutputWithContext(context.Context) HAVipAttachmentMapOutput
}

type HAVipAttachmentMap map[string]HAVipAttachmentInput

func (HAVipAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HAVipAttachment)(nil)).Elem()
}

func (i HAVipAttachmentMap) ToHAVipAttachmentMapOutput() HAVipAttachmentMapOutput {
	return i.ToHAVipAttachmentMapOutputWithContext(context.Background())
}

func (i HAVipAttachmentMap) ToHAVipAttachmentMapOutputWithContext(ctx context.Context) HAVipAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HAVipAttachmentMapOutput)
}

type HAVipAttachmentOutput struct{ *pulumi.OutputState }

func (HAVipAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HAVipAttachment)(nil)).Elem()
}

func (o HAVipAttachmentOutput) ToHAVipAttachmentOutput() HAVipAttachmentOutput {
	return o
}

func (o HAVipAttachmentOutput) ToHAVipAttachmentOutputWithContext(ctx context.Context) HAVipAttachmentOutput {
	return o
}

// Whether to force the ECS instance or Eni instance bound to AVIP to be unbound. The value is:
// - **True**: Force unbinding.
// - **False** (default): unbinding is not forced.
// > **NOTE:**  If the value of this parameter is **False**, the Master instance bound to HaVip cannot be unbound.
func (o HAVipAttachmentOutput) Force() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *HAVipAttachment) pulumi.BoolPtrOutput { return v.Force }).(pulumi.BoolPtrOutput)
}

// The ID of the HaVip instance.
func (o HAVipAttachmentOutput) HaVipId() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVipAttachment) pulumi.StringOutput { return v.HaVipId }).(pulumi.StringOutput)
}

// . Field 'havip_id' has been deprecated from provider version 1.211.0. New field 'ha_vip_id' instead.
//
// Deprecated: Field 'havip_id' has been deprecated since provider version 1.211.0. New field 'ha_vip_id' instead.
func (o HAVipAttachmentOutput) HavipId() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVipAttachment) pulumi.StringOutput { return v.HavipId }).(pulumi.StringOutput)
}

// The ID of the ECS instance bound to the HaVip instance.
func (o HAVipAttachmentOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVipAttachment) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The type of the instance associated with the VIIP.
//
// The following arguments will be discarded. Please use new fields as soon as possible:
func (o HAVipAttachmentOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVipAttachment) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

// The status of the resource.
func (o HAVipAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *HAVipAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type HAVipAttachmentArrayOutput struct{ *pulumi.OutputState }

func (HAVipAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HAVipAttachment)(nil)).Elem()
}

func (o HAVipAttachmentArrayOutput) ToHAVipAttachmentArrayOutput() HAVipAttachmentArrayOutput {
	return o
}

func (o HAVipAttachmentArrayOutput) ToHAVipAttachmentArrayOutputWithContext(ctx context.Context) HAVipAttachmentArrayOutput {
	return o
}

func (o HAVipAttachmentArrayOutput) Index(i pulumi.IntInput) HAVipAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HAVipAttachment {
		return vs[0].([]*HAVipAttachment)[vs[1].(int)]
	}).(HAVipAttachmentOutput)
}

type HAVipAttachmentMapOutput struct{ *pulumi.OutputState }

func (HAVipAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HAVipAttachment)(nil)).Elem()
}

func (o HAVipAttachmentMapOutput) ToHAVipAttachmentMapOutput() HAVipAttachmentMapOutput {
	return o
}

func (o HAVipAttachmentMapOutput) ToHAVipAttachmentMapOutputWithContext(ctx context.Context) HAVipAttachmentMapOutput {
	return o
}

func (o HAVipAttachmentMapOutput) MapIndex(k pulumi.StringInput) HAVipAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HAVipAttachment {
		return vs[0].(map[string]*HAVipAttachment)[vs[1].(string)]
	}).(HAVipAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HAVipAttachmentInput)(nil)).Elem(), &HAVipAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*HAVipAttachmentArrayInput)(nil)).Elem(), HAVipAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HAVipAttachmentMapInput)(nil)).Elem(), HAVipAttachmentMap{})
	pulumi.RegisterOutputType(HAVipAttachmentOutput{})
	pulumi.RegisterOutputType(HAVipAttachmentArrayOutput{})
	pulumi.RegisterOutputType(HAVipAttachmentMapOutput{})
}
