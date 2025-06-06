// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bastionhost

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Bastion Host User Group resource.
//
// For information about Bastion Host User Group and how to use it, see [What is User Group](https://www.alibabacloud.com/help/doc-detail/204596.htm).
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/bastionhost"
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
//			name := "tf_example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_default, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetNetworks, err := vpc.GetNetworks(ctx, &vpc.GetNetworksArgs{
//				NameRegex: pulumi.StringRef("^default-NODELETING$"),
//				CidrBlock: pulumi.StringRef("10.4.0.0/16"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetSwitches, err := vpc.GetSwitches(ctx, &vpc.GetSwitchesArgs{
//				CidrBlock: pulumi.StringRef("10.4.0.0/24"),
//				VpcId:     pulumi.StringRef(defaultGetNetworks.Ids[0]),
//				ZoneId:    pulumi.StringRef(_default.Zones[0].Id),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultSecurityGroup, err := ecs.NewSecurityGroup(ctx, "default", &ecs.SecurityGroupArgs{
//				VpcId: pulumi.String(defaultGetNetworks.Ids[0]),
//			})
//			if err != nil {
//				return err
//			}
//			defaultInstance, err := bastionhost.NewInstance(ctx, "default", &bastionhost.InstanceArgs{
//				Description: pulumi.String(name),
//				LicenseCode: pulumi.String("bhah_ent_50_asset"),
//				PlanCode:    pulumi.String("cloudbastion"),
//				Storage:     pulumi.String("5"),
//				Bandwidth:   pulumi.String("5"),
//				Period:      pulumi.Int(1),
//				VswitchId:   pulumi.String(defaultGetSwitches.Ids[0]),
//				SecurityGroupIds: pulumi.StringArray{
//					defaultSecurityGroup.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = bastionhost.NewUserGroup(ctx, "default", &bastionhost.UserGroupArgs{
//				InstanceId:    defaultInstance.ID(),
//				UserGroupName: pulumi.String(name),
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
// Bastion Host User Group can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:bastionhost/userGroup:UserGroup example <instance_id>:<user_group_id>
// ```
type UserGroup struct {
	pulumi.CustomResourceState

	// Specify the New Group of Remark Information. Supports up to 500 Characters.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Specify the New Group of the Bastion Host of Instance Id.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The User Group self ID.
	UserGroupId pulumi.StringOutput `pulumi:"userGroupId"`
	// Specify the New Group Name. Supports up to 128 Characters.
	UserGroupName pulumi.StringOutput `pulumi:"userGroupName"`
}

// NewUserGroup registers a new resource with the given unique name, arguments, and options.
func NewUserGroup(ctx *pulumi.Context,
	name string, args *UserGroupArgs, opts ...pulumi.ResourceOption) (*UserGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.UserGroupName == nil {
		return nil, errors.New("invalid value for required argument 'UserGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserGroup
	err := ctx.RegisterResource("alicloud:bastionhost/userGroup:UserGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserGroup gets an existing UserGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserGroupState, opts ...pulumi.ResourceOption) (*UserGroup, error) {
	var resource UserGroup
	err := ctx.ReadResource("alicloud:bastionhost/userGroup:UserGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserGroup resources.
type userGroupState struct {
	// Specify the New Group of Remark Information. Supports up to 500 Characters.
	Comment *string `pulumi:"comment"`
	// Specify the New Group of the Bastion Host of Instance Id.
	InstanceId *string `pulumi:"instanceId"`
	// The User Group self ID.
	UserGroupId *string `pulumi:"userGroupId"`
	// Specify the New Group Name. Supports up to 128 Characters.
	UserGroupName *string `pulumi:"userGroupName"`
}

type UserGroupState struct {
	// Specify the New Group of Remark Information. Supports up to 500 Characters.
	Comment pulumi.StringPtrInput
	// Specify the New Group of the Bastion Host of Instance Id.
	InstanceId pulumi.StringPtrInput
	// The User Group self ID.
	UserGroupId pulumi.StringPtrInput
	// Specify the New Group Name. Supports up to 128 Characters.
	UserGroupName pulumi.StringPtrInput
}

func (UserGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*userGroupState)(nil)).Elem()
}

type userGroupArgs struct {
	// Specify the New Group of Remark Information. Supports up to 500 Characters.
	Comment *string `pulumi:"comment"`
	// Specify the New Group of the Bastion Host of Instance Id.
	InstanceId string `pulumi:"instanceId"`
	// Specify the New Group Name. Supports up to 128 Characters.
	UserGroupName string `pulumi:"userGroupName"`
}

// The set of arguments for constructing a UserGroup resource.
type UserGroupArgs struct {
	// Specify the New Group of Remark Information. Supports up to 500 Characters.
	Comment pulumi.StringPtrInput
	// Specify the New Group of the Bastion Host of Instance Id.
	InstanceId pulumi.StringInput
	// Specify the New Group Name. Supports up to 128 Characters.
	UserGroupName pulumi.StringInput
}

func (UserGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userGroupArgs)(nil)).Elem()
}

type UserGroupInput interface {
	pulumi.Input

	ToUserGroupOutput() UserGroupOutput
	ToUserGroupOutputWithContext(ctx context.Context) UserGroupOutput
}

func (*UserGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**UserGroup)(nil)).Elem()
}

func (i *UserGroup) ToUserGroupOutput() UserGroupOutput {
	return i.ToUserGroupOutputWithContext(context.Background())
}

func (i *UserGroup) ToUserGroupOutputWithContext(ctx context.Context) UserGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGroupOutput)
}

// UserGroupArrayInput is an input type that accepts UserGroupArray and UserGroupArrayOutput values.
// You can construct a concrete instance of `UserGroupArrayInput` via:
//
//	UserGroupArray{ UserGroupArgs{...} }
type UserGroupArrayInput interface {
	pulumi.Input

	ToUserGroupArrayOutput() UserGroupArrayOutput
	ToUserGroupArrayOutputWithContext(context.Context) UserGroupArrayOutput
}

type UserGroupArray []UserGroupInput

func (UserGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserGroup)(nil)).Elem()
}

func (i UserGroupArray) ToUserGroupArrayOutput() UserGroupArrayOutput {
	return i.ToUserGroupArrayOutputWithContext(context.Background())
}

func (i UserGroupArray) ToUserGroupArrayOutputWithContext(ctx context.Context) UserGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGroupArrayOutput)
}

// UserGroupMapInput is an input type that accepts UserGroupMap and UserGroupMapOutput values.
// You can construct a concrete instance of `UserGroupMapInput` via:
//
//	UserGroupMap{ "key": UserGroupArgs{...} }
type UserGroupMapInput interface {
	pulumi.Input

	ToUserGroupMapOutput() UserGroupMapOutput
	ToUserGroupMapOutputWithContext(context.Context) UserGroupMapOutput
}

type UserGroupMap map[string]UserGroupInput

func (UserGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserGroup)(nil)).Elem()
}

func (i UserGroupMap) ToUserGroupMapOutput() UserGroupMapOutput {
	return i.ToUserGroupMapOutputWithContext(context.Background())
}

func (i UserGroupMap) ToUserGroupMapOutputWithContext(ctx context.Context) UserGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGroupMapOutput)
}

type UserGroupOutput struct{ *pulumi.OutputState }

func (UserGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserGroup)(nil)).Elem()
}

func (o UserGroupOutput) ToUserGroupOutput() UserGroupOutput {
	return o
}

func (o UserGroupOutput) ToUserGroupOutputWithContext(ctx context.Context) UserGroupOutput {
	return o
}

// Specify the New Group of Remark Information. Supports up to 500 Characters.
func (o UserGroupOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *UserGroup) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Specify the New Group of the Bastion Host of Instance Id.
func (o UserGroupOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserGroup) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The User Group self ID.
func (o UserGroupOutput) UserGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserGroup) pulumi.StringOutput { return v.UserGroupId }).(pulumi.StringOutput)
}

// Specify the New Group Name. Supports up to 128 Characters.
func (o UserGroupOutput) UserGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *UserGroup) pulumi.StringOutput { return v.UserGroupName }).(pulumi.StringOutput)
}

type UserGroupArrayOutput struct{ *pulumi.OutputState }

func (UserGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserGroup)(nil)).Elem()
}

func (o UserGroupArrayOutput) ToUserGroupArrayOutput() UserGroupArrayOutput {
	return o
}

func (o UserGroupArrayOutput) ToUserGroupArrayOutputWithContext(ctx context.Context) UserGroupArrayOutput {
	return o
}

func (o UserGroupArrayOutput) Index(i pulumi.IntInput) UserGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserGroup {
		return vs[0].([]*UserGroup)[vs[1].(int)]
	}).(UserGroupOutput)
}

type UserGroupMapOutput struct{ *pulumi.OutputState }

func (UserGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserGroup)(nil)).Elem()
}

func (o UserGroupMapOutput) ToUserGroupMapOutput() UserGroupMapOutput {
	return o
}

func (o UserGroupMapOutput) ToUserGroupMapOutputWithContext(ctx context.Context) UserGroupMapOutput {
	return o
}

func (o UserGroupMapOutput) MapIndex(k pulumi.StringInput) UserGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserGroup {
		return vs[0].(map[string]*UserGroup)[vs[1].(string)]
	}).(UserGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserGroupInput)(nil)).Elem(), &UserGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserGroupArrayInput)(nil)).Elem(), UserGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserGroupMapInput)(nil)).Elem(), UserGroupMap{})
	pulumi.RegisterOutputType(UserGroupOutput{})
	pulumi.RegisterOutputType(UserGroupArrayOutput{})
	pulumi.RegisterOutputType(UserGroupMapOutput{})
}
