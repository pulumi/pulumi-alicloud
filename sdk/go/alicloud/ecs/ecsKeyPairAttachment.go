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

// Provides a ECS Key Pair Attachment resource.
//
// For information about ECS Key Pair Attachment and how to use it, see [What is Key Pair Attachment](https://www.alibabacloud.com/help/en/doc-detail/51775.htm).
//
// > **NOTE:** Available since v1.121.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("Instance"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGetInstanceTypes, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
//				AvailabilityZone: pulumi.StringRef(example.Zones[0].Id),
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
//				VpcName:   pulumi.String("terraform-example"),
//				CidrBlock: pulumi.String("172.17.3.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSwitch, err := vpc.NewSwitch(ctx, "example", &vpc.SwitchArgs{
//				VswitchName: pulumi.String("terraform-example"),
//				CidrBlock:   pulumi.String("172.17.3.0/24"),
//				VpcId:       exampleNetwork.ID(),
//				ZoneId:      pulumi.String(example.Zones[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSecurityGroup, err := ecs.NewSecurityGroup(ctx, "example", &ecs.SecurityGroupArgs{
//				Name:  pulumi.String("terraform-example"),
//				VpcId: exampleNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleInstance, err := ecs.NewInstance(ctx, "example", &ecs.InstanceArgs{
//				ImageId:          pulumi.String(exampleGetImages.Images[0].Id),
//				InstanceType:     pulumi.String(exampleGetInstanceTypes.InstanceTypes[0].Id),
//				AvailabilityZone: pulumi.String(example.Zones[0].Id),
//				SecurityGroups: pulumi.StringArray{
//					exampleSecurityGroup.ID(),
//				},
//				InstanceName:       pulumi.String("terraform-example"),
//				InternetChargeType: pulumi.String("PayByBandwidth"),
//				VswitchId:          exampleSwitch.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_default, err := random.NewInteger(ctx, "default", &random.IntegerArgs{
//				Min: 10000,
//				Max: 99999,
//			})
//			if err != nil {
//				return err
//			}
//			exampleEcsKeyPair, err := ecs.NewEcsKeyPair(ctx, "example", &ecs.EcsKeyPairArgs{
//				KeyPairName: pulumi.Sprintf("tf-example-%v", _default.Result),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ecs.NewEcsKeyPairAttachment(ctx, "example", &ecs.EcsKeyPairAttachmentArgs{
//				KeyPairName: exampleEcsKeyPair.KeyPairName,
//				InstanceIds: pulumi.StringArray{
//					exampleInstance.ID(),
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
// ECS Key Pair Attachment can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ecs/ecsKeyPairAttachment:EcsKeyPairAttachment example <key_pair_name>:<instance_ids>
// ```
type EcsKeyPairAttachment struct {
	pulumi.CustomResourceState

	// Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
	Force pulumi.BoolPtrOutput `pulumi:"force"`
	// The list of ECS instance's IDs.
	InstanceIds pulumi.StringArrayOutput `pulumi:"instanceIds"`
	// New field 'key_pair_name' instead.
	//
	// Deprecated: Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead.
	KeyName pulumi.StringOutput `pulumi:"keyName"`
	// The name of key pair used to bind.
	KeyPairName pulumi.StringOutput `pulumi:"keyPairName"`
}

// NewEcsKeyPairAttachment registers a new resource with the given unique name, arguments, and options.
func NewEcsKeyPairAttachment(ctx *pulumi.Context,
	name string, args *EcsKeyPairAttachmentArgs, opts ...pulumi.ResourceOption) (*EcsKeyPairAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceIds == nil {
		return nil, errors.New("invalid value for required argument 'InstanceIds'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EcsKeyPairAttachment
	err := ctx.RegisterResource("alicloud:ecs/ecsKeyPairAttachment:EcsKeyPairAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEcsKeyPairAttachment gets an existing EcsKeyPairAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEcsKeyPairAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EcsKeyPairAttachmentState, opts ...pulumi.ResourceOption) (*EcsKeyPairAttachment, error) {
	var resource EcsKeyPairAttachment
	err := ctx.ReadResource("alicloud:ecs/ecsKeyPairAttachment:EcsKeyPairAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EcsKeyPairAttachment resources.
type ecsKeyPairAttachmentState struct {
	// Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
	Force *bool `pulumi:"force"`
	// The list of ECS instance's IDs.
	InstanceIds []string `pulumi:"instanceIds"`
	// New field 'key_pair_name' instead.
	//
	// Deprecated: Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead.
	KeyName *string `pulumi:"keyName"`
	// The name of key pair used to bind.
	KeyPairName *string `pulumi:"keyPairName"`
}

type EcsKeyPairAttachmentState struct {
	// Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
	Force pulumi.BoolPtrInput
	// The list of ECS instance's IDs.
	InstanceIds pulumi.StringArrayInput
	// New field 'key_pair_name' instead.
	//
	// Deprecated: Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead.
	KeyName pulumi.StringPtrInput
	// The name of key pair used to bind.
	KeyPairName pulumi.StringPtrInput
}

func (EcsKeyPairAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsKeyPairAttachmentState)(nil)).Elem()
}

type ecsKeyPairAttachmentArgs struct {
	// Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
	Force *bool `pulumi:"force"`
	// The list of ECS instance's IDs.
	InstanceIds []string `pulumi:"instanceIds"`
	// New field 'key_pair_name' instead.
	//
	// Deprecated: Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead.
	KeyName *string `pulumi:"keyName"`
	// The name of key pair used to bind.
	KeyPairName *string `pulumi:"keyPairName"`
}

// The set of arguments for constructing a EcsKeyPairAttachment resource.
type EcsKeyPairAttachmentArgs struct {
	// Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
	Force pulumi.BoolPtrInput
	// The list of ECS instance's IDs.
	InstanceIds pulumi.StringArrayInput
	// New field 'key_pair_name' instead.
	//
	// Deprecated: Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead.
	KeyName pulumi.StringPtrInput
	// The name of key pair used to bind.
	KeyPairName pulumi.StringPtrInput
}

func (EcsKeyPairAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsKeyPairAttachmentArgs)(nil)).Elem()
}

type EcsKeyPairAttachmentInput interface {
	pulumi.Input

	ToEcsKeyPairAttachmentOutput() EcsKeyPairAttachmentOutput
	ToEcsKeyPairAttachmentOutputWithContext(ctx context.Context) EcsKeyPairAttachmentOutput
}

func (*EcsKeyPairAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsKeyPairAttachment)(nil)).Elem()
}

func (i *EcsKeyPairAttachment) ToEcsKeyPairAttachmentOutput() EcsKeyPairAttachmentOutput {
	return i.ToEcsKeyPairAttachmentOutputWithContext(context.Background())
}

func (i *EcsKeyPairAttachment) ToEcsKeyPairAttachmentOutputWithContext(ctx context.Context) EcsKeyPairAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsKeyPairAttachmentOutput)
}

// EcsKeyPairAttachmentArrayInput is an input type that accepts EcsKeyPairAttachmentArray and EcsKeyPairAttachmentArrayOutput values.
// You can construct a concrete instance of `EcsKeyPairAttachmentArrayInput` via:
//
//	EcsKeyPairAttachmentArray{ EcsKeyPairAttachmentArgs{...} }
type EcsKeyPairAttachmentArrayInput interface {
	pulumi.Input

	ToEcsKeyPairAttachmentArrayOutput() EcsKeyPairAttachmentArrayOutput
	ToEcsKeyPairAttachmentArrayOutputWithContext(context.Context) EcsKeyPairAttachmentArrayOutput
}

type EcsKeyPairAttachmentArray []EcsKeyPairAttachmentInput

func (EcsKeyPairAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsKeyPairAttachment)(nil)).Elem()
}

func (i EcsKeyPairAttachmentArray) ToEcsKeyPairAttachmentArrayOutput() EcsKeyPairAttachmentArrayOutput {
	return i.ToEcsKeyPairAttachmentArrayOutputWithContext(context.Background())
}

func (i EcsKeyPairAttachmentArray) ToEcsKeyPairAttachmentArrayOutputWithContext(ctx context.Context) EcsKeyPairAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsKeyPairAttachmentArrayOutput)
}

// EcsKeyPairAttachmentMapInput is an input type that accepts EcsKeyPairAttachmentMap and EcsKeyPairAttachmentMapOutput values.
// You can construct a concrete instance of `EcsKeyPairAttachmentMapInput` via:
//
//	EcsKeyPairAttachmentMap{ "key": EcsKeyPairAttachmentArgs{...} }
type EcsKeyPairAttachmentMapInput interface {
	pulumi.Input

	ToEcsKeyPairAttachmentMapOutput() EcsKeyPairAttachmentMapOutput
	ToEcsKeyPairAttachmentMapOutputWithContext(context.Context) EcsKeyPairAttachmentMapOutput
}

type EcsKeyPairAttachmentMap map[string]EcsKeyPairAttachmentInput

func (EcsKeyPairAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsKeyPairAttachment)(nil)).Elem()
}

func (i EcsKeyPairAttachmentMap) ToEcsKeyPairAttachmentMapOutput() EcsKeyPairAttachmentMapOutput {
	return i.ToEcsKeyPairAttachmentMapOutputWithContext(context.Background())
}

func (i EcsKeyPairAttachmentMap) ToEcsKeyPairAttachmentMapOutputWithContext(ctx context.Context) EcsKeyPairAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsKeyPairAttachmentMapOutput)
}

type EcsKeyPairAttachmentOutput struct{ *pulumi.OutputState }

func (EcsKeyPairAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsKeyPairAttachment)(nil)).Elem()
}

func (o EcsKeyPairAttachmentOutput) ToEcsKeyPairAttachmentOutput() EcsKeyPairAttachmentOutput {
	return o
}

func (o EcsKeyPairAttachmentOutput) ToEcsKeyPairAttachmentOutputWithContext(ctx context.Context) EcsKeyPairAttachmentOutput {
	return o
}

// Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
func (o EcsKeyPairAttachmentOutput) Force() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EcsKeyPairAttachment) pulumi.BoolPtrOutput { return v.Force }).(pulumi.BoolPtrOutput)
}

// The list of ECS instance's IDs.
func (o EcsKeyPairAttachmentOutput) InstanceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *EcsKeyPairAttachment) pulumi.StringArrayOutput { return v.InstanceIds }).(pulumi.StringArrayOutput)
}

// New field 'key_pair_name' instead.
//
// Deprecated: Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead.
func (o EcsKeyPairAttachmentOutput) KeyName() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsKeyPairAttachment) pulumi.StringOutput { return v.KeyName }).(pulumi.StringOutput)
}

// The name of key pair used to bind.
func (o EcsKeyPairAttachmentOutput) KeyPairName() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsKeyPairAttachment) pulumi.StringOutput { return v.KeyPairName }).(pulumi.StringOutput)
}

type EcsKeyPairAttachmentArrayOutput struct{ *pulumi.OutputState }

func (EcsKeyPairAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsKeyPairAttachment)(nil)).Elem()
}

func (o EcsKeyPairAttachmentArrayOutput) ToEcsKeyPairAttachmentArrayOutput() EcsKeyPairAttachmentArrayOutput {
	return o
}

func (o EcsKeyPairAttachmentArrayOutput) ToEcsKeyPairAttachmentArrayOutputWithContext(ctx context.Context) EcsKeyPairAttachmentArrayOutput {
	return o
}

func (o EcsKeyPairAttachmentArrayOutput) Index(i pulumi.IntInput) EcsKeyPairAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EcsKeyPairAttachment {
		return vs[0].([]*EcsKeyPairAttachment)[vs[1].(int)]
	}).(EcsKeyPairAttachmentOutput)
}

type EcsKeyPairAttachmentMapOutput struct{ *pulumi.OutputState }

func (EcsKeyPairAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsKeyPairAttachment)(nil)).Elem()
}

func (o EcsKeyPairAttachmentMapOutput) ToEcsKeyPairAttachmentMapOutput() EcsKeyPairAttachmentMapOutput {
	return o
}

func (o EcsKeyPairAttachmentMapOutput) ToEcsKeyPairAttachmentMapOutputWithContext(ctx context.Context) EcsKeyPairAttachmentMapOutput {
	return o
}

func (o EcsKeyPairAttachmentMapOutput) MapIndex(k pulumi.StringInput) EcsKeyPairAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EcsKeyPairAttachment {
		return vs[0].(map[string]*EcsKeyPairAttachment)[vs[1].(string)]
	}).(EcsKeyPairAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EcsKeyPairAttachmentInput)(nil)).Elem(), &EcsKeyPairAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsKeyPairAttachmentArrayInput)(nil)).Elem(), EcsKeyPairAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsKeyPairAttachmentMapInput)(nil)).Elem(), EcsKeyPairAttachmentMap{})
	pulumi.RegisterOutputType(EcsKeyPairAttachmentOutput{})
	pulumi.RegisterOutputType(EcsKeyPairAttachmentArrayOutput{})
	pulumi.RegisterOutputType(EcsKeyPairAttachmentMapOutput{})
}
