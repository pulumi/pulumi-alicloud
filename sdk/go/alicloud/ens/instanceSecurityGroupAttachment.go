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

// Provides a ENS Instance Security Group Attachment resource.
//
// Bind instance and security group.
//
// For information about ENS Instance Security Group Attachment and how to use it, see [What is Instance Security Group Attachment](https://next.api.alibabacloud.com/document/Ens/2017-11-10/JoinSecurityGroup).
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
//			_default, err := ens.NewInstance(ctx, "default", &ens.InstanceArgs{
//				SystemDisk: &ens.InstanceSystemDiskArgs{
//					Size: pulumi.Int(20),
//				},
//				ScheduleAreaLevel:       pulumi.String("Region"),
//				ImageId:                 pulumi.String("centos_6_08_64_20G_alibase_20171208"),
//				PaymentType:             pulumi.String("Subscription"),
//				InstanceType:            pulumi.String("ens.sn1.stiny"),
//				Password:                pulumi.String("12345678ABCabc"),
//				Amount:                  pulumi.Int(1),
//				Period:                  pulumi.Int(1),
//				InternetMaxBandwidthOut: pulumi.Int(10),
//				PublicIpIdentification:  pulumi.Bool(true),
//				EnsRegionId:             pulumi.String("cn-chenzhou-telecom_unicom_cmcc"),
//				PeriodUnit:              pulumi.String("Month"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSecurityGroup, err := ens.NewSecurityGroup(ctx, "default", &ens.SecurityGroupArgs{
//				Description:       pulumi.String("InstanceSecurityGroupAttachment_Description"),
//				SecurityGroupName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ens.NewInstanceSecurityGroupAttachment(ctx, "default", &ens.InstanceSecurityGroupAttachmentArgs{
//				InstanceId:      _default.ID(),
//				SecurityGroupId: defaultSecurityGroup.ID(),
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
// ENS Instance Security Group Attachment can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ens/instanceSecurityGroupAttachment:InstanceSecurityGroupAttachment example <instance_id>:<security_group_id>
// ```
type InstanceSecurityGroupAttachment struct {
	pulumi.CustomResourceState

	// Instance ID.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// Security group ID.
	SecurityGroupId pulumi.StringOutput `pulumi:"securityGroupId"`
}

// NewInstanceSecurityGroupAttachment registers a new resource with the given unique name, arguments, and options.
func NewInstanceSecurityGroupAttachment(ctx *pulumi.Context,
	name string, args *InstanceSecurityGroupAttachmentArgs, opts ...pulumi.ResourceOption) (*InstanceSecurityGroupAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SecurityGroupId == nil {
		return nil, errors.New("invalid value for required argument 'SecurityGroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstanceSecurityGroupAttachment
	err := ctx.RegisterResource("alicloud:ens/instanceSecurityGroupAttachment:InstanceSecurityGroupAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceSecurityGroupAttachment gets an existing InstanceSecurityGroupAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceSecurityGroupAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceSecurityGroupAttachmentState, opts ...pulumi.ResourceOption) (*InstanceSecurityGroupAttachment, error) {
	var resource InstanceSecurityGroupAttachment
	err := ctx.ReadResource("alicloud:ens/instanceSecurityGroupAttachment:InstanceSecurityGroupAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceSecurityGroupAttachment resources.
type instanceSecurityGroupAttachmentState struct {
	// Instance ID.
	InstanceId *string `pulumi:"instanceId"`
	// Security group ID.
	SecurityGroupId *string `pulumi:"securityGroupId"`
}

type InstanceSecurityGroupAttachmentState struct {
	// Instance ID.
	InstanceId pulumi.StringPtrInput
	// Security group ID.
	SecurityGroupId pulumi.StringPtrInput
}

func (InstanceSecurityGroupAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceSecurityGroupAttachmentState)(nil)).Elem()
}

type instanceSecurityGroupAttachmentArgs struct {
	// Instance ID.
	InstanceId *string `pulumi:"instanceId"`
	// Security group ID.
	SecurityGroupId string `pulumi:"securityGroupId"`
}

// The set of arguments for constructing a InstanceSecurityGroupAttachment resource.
type InstanceSecurityGroupAttachmentArgs struct {
	// Instance ID.
	InstanceId pulumi.StringPtrInput
	// Security group ID.
	SecurityGroupId pulumi.StringInput
}

func (InstanceSecurityGroupAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceSecurityGroupAttachmentArgs)(nil)).Elem()
}

type InstanceSecurityGroupAttachmentInput interface {
	pulumi.Input

	ToInstanceSecurityGroupAttachmentOutput() InstanceSecurityGroupAttachmentOutput
	ToInstanceSecurityGroupAttachmentOutputWithContext(ctx context.Context) InstanceSecurityGroupAttachmentOutput
}

func (*InstanceSecurityGroupAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceSecurityGroupAttachment)(nil)).Elem()
}

func (i *InstanceSecurityGroupAttachment) ToInstanceSecurityGroupAttachmentOutput() InstanceSecurityGroupAttachmentOutput {
	return i.ToInstanceSecurityGroupAttachmentOutputWithContext(context.Background())
}

func (i *InstanceSecurityGroupAttachment) ToInstanceSecurityGroupAttachmentOutputWithContext(ctx context.Context) InstanceSecurityGroupAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceSecurityGroupAttachmentOutput)
}

// InstanceSecurityGroupAttachmentArrayInput is an input type that accepts InstanceSecurityGroupAttachmentArray and InstanceSecurityGroupAttachmentArrayOutput values.
// You can construct a concrete instance of `InstanceSecurityGroupAttachmentArrayInput` via:
//
//	InstanceSecurityGroupAttachmentArray{ InstanceSecurityGroupAttachmentArgs{...} }
type InstanceSecurityGroupAttachmentArrayInput interface {
	pulumi.Input

	ToInstanceSecurityGroupAttachmentArrayOutput() InstanceSecurityGroupAttachmentArrayOutput
	ToInstanceSecurityGroupAttachmentArrayOutputWithContext(context.Context) InstanceSecurityGroupAttachmentArrayOutput
}

type InstanceSecurityGroupAttachmentArray []InstanceSecurityGroupAttachmentInput

func (InstanceSecurityGroupAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceSecurityGroupAttachment)(nil)).Elem()
}

func (i InstanceSecurityGroupAttachmentArray) ToInstanceSecurityGroupAttachmentArrayOutput() InstanceSecurityGroupAttachmentArrayOutput {
	return i.ToInstanceSecurityGroupAttachmentArrayOutputWithContext(context.Background())
}

func (i InstanceSecurityGroupAttachmentArray) ToInstanceSecurityGroupAttachmentArrayOutputWithContext(ctx context.Context) InstanceSecurityGroupAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceSecurityGroupAttachmentArrayOutput)
}

// InstanceSecurityGroupAttachmentMapInput is an input type that accepts InstanceSecurityGroupAttachmentMap and InstanceSecurityGroupAttachmentMapOutput values.
// You can construct a concrete instance of `InstanceSecurityGroupAttachmentMapInput` via:
//
//	InstanceSecurityGroupAttachmentMap{ "key": InstanceSecurityGroupAttachmentArgs{...} }
type InstanceSecurityGroupAttachmentMapInput interface {
	pulumi.Input

	ToInstanceSecurityGroupAttachmentMapOutput() InstanceSecurityGroupAttachmentMapOutput
	ToInstanceSecurityGroupAttachmentMapOutputWithContext(context.Context) InstanceSecurityGroupAttachmentMapOutput
}

type InstanceSecurityGroupAttachmentMap map[string]InstanceSecurityGroupAttachmentInput

func (InstanceSecurityGroupAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceSecurityGroupAttachment)(nil)).Elem()
}

func (i InstanceSecurityGroupAttachmentMap) ToInstanceSecurityGroupAttachmentMapOutput() InstanceSecurityGroupAttachmentMapOutput {
	return i.ToInstanceSecurityGroupAttachmentMapOutputWithContext(context.Background())
}

func (i InstanceSecurityGroupAttachmentMap) ToInstanceSecurityGroupAttachmentMapOutputWithContext(ctx context.Context) InstanceSecurityGroupAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceSecurityGroupAttachmentMapOutput)
}

type InstanceSecurityGroupAttachmentOutput struct{ *pulumi.OutputState }

func (InstanceSecurityGroupAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceSecurityGroupAttachment)(nil)).Elem()
}

func (o InstanceSecurityGroupAttachmentOutput) ToInstanceSecurityGroupAttachmentOutput() InstanceSecurityGroupAttachmentOutput {
	return o
}

func (o InstanceSecurityGroupAttachmentOutput) ToInstanceSecurityGroupAttachmentOutputWithContext(ctx context.Context) InstanceSecurityGroupAttachmentOutput {
	return o
}

// Instance ID.
func (o InstanceSecurityGroupAttachmentOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceSecurityGroupAttachment) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// Security group ID.
func (o InstanceSecurityGroupAttachmentOutput) SecurityGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceSecurityGroupAttachment) pulumi.StringOutput { return v.SecurityGroupId }).(pulumi.StringOutput)
}

type InstanceSecurityGroupAttachmentArrayOutput struct{ *pulumi.OutputState }

func (InstanceSecurityGroupAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceSecurityGroupAttachment)(nil)).Elem()
}

func (o InstanceSecurityGroupAttachmentArrayOutput) ToInstanceSecurityGroupAttachmentArrayOutput() InstanceSecurityGroupAttachmentArrayOutput {
	return o
}

func (o InstanceSecurityGroupAttachmentArrayOutput) ToInstanceSecurityGroupAttachmentArrayOutputWithContext(ctx context.Context) InstanceSecurityGroupAttachmentArrayOutput {
	return o
}

func (o InstanceSecurityGroupAttachmentArrayOutput) Index(i pulumi.IntInput) InstanceSecurityGroupAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceSecurityGroupAttachment {
		return vs[0].([]*InstanceSecurityGroupAttachment)[vs[1].(int)]
	}).(InstanceSecurityGroupAttachmentOutput)
}

type InstanceSecurityGroupAttachmentMapOutput struct{ *pulumi.OutputState }

func (InstanceSecurityGroupAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceSecurityGroupAttachment)(nil)).Elem()
}

func (o InstanceSecurityGroupAttachmentMapOutput) ToInstanceSecurityGroupAttachmentMapOutput() InstanceSecurityGroupAttachmentMapOutput {
	return o
}

func (o InstanceSecurityGroupAttachmentMapOutput) ToInstanceSecurityGroupAttachmentMapOutputWithContext(ctx context.Context) InstanceSecurityGroupAttachmentMapOutput {
	return o
}

func (o InstanceSecurityGroupAttachmentMapOutput) MapIndex(k pulumi.StringInput) InstanceSecurityGroupAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceSecurityGroupAttachment {
		return vs[0].(map[string]*InstanceSecurityGroupAttachment)[vs[1].(string)]
	}).(InstanceSecurityGroupAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceSecurityGroupAttachmentInput)(nil)).Elem(), &InstanceSecurityGroupAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceSecurityGroupAttachmentArrayInput)(nil)).Elem(), InstanceSecurityGroupAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceSecurityGroupAttachmentMapInput)(nil)).Elem(), InstanceSecurityGroupAttachmentMap{})
	pulumi.RegisterOutputType(InstanceSecurityGroupAttachmentOutput{})
	pulumi.RegisterOutputType(InstanceSecurityGroupAttachmentArrayOutput{})
	pulumi.RegisterOutputType(InstanceSecurityGroupAttachmentMapOutput{})
}
