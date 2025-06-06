// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package securitycenter

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type GetGroupsGroup struct {
	// GroupFlag, '0' mean default group(created by system), '1' means customer defined group.
	GroupFlag int `pulumi:"groupFlag"`
	// The ID of Group.
	GroupId string `pulumi:"groupId"`
	// The name of Group.
	GroupName string `pulumi:"groupName"`
	// The ID of the Group(same as the group_id).
	Id string `pulumi:"id"`
}

// GetGroupsGroupInput is an input type that accepts GetGroupsGroupArgs and GetGroupsGroupOutput values.
// You can construct a concrete instance of `GetGroupsGroupInput` via:
//
//	GetGroupsGroupArgs{...}
type GetGroupsGroupInput interface {
	pulumi.Input

	ToGetGroupsGroupOutput() GetGroupsGroupOutput
	ToGetGroupsGroupOutputWithContext(context.Context) GetGroupsGroupOutput
}

type GetGroupsGroupArgs struct {
	// GroupFlag, '0' mean default group(created by system), '1' means customer defined group.
	GroupFlag pulumi.IntInput `pulumi:"groupFlag"`
	// The ID of Group.
	GroupId pulumi.StringInput `pulumi:"groupId"`
	// The name of Group.
	GroupName pulumi.StringInput `pulumi:"groupName"`
	// The ID of the Group(same as the group_id).
	Id pulumi.StringInput `pulumi:"id"`
}

func (GetGroupsGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGroupsGroup)(nil)).Elem()
}

func (i GetGroupsGroupArgs) ToGetGroupsGroupOutput() GetGroupsGroupOutput {
	return i.ToGetGroupsGroupOutputWithContext(context.Background())
}

func (i GetGroupsGroupArgs) ToGetGroupsGroupOutputWithContext(ctx context.Context) GetGroupsGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetGroupsGroupOutput)
}

// GetGroupsGroupArrayInput is an input type that accepts GetGroupsGroupArray and GetGroupsGroupArrayOutput values.
// You can construct a concrete instance of `GetGroupsGroupArrayInput` via:
//
//	GetGroupsGroupArray{ GetGroupsGroupArgs{...} }
type GetGroupsGroupArrayInput interface {
	pulumi.Input

	ToGetGroupsGroupArrayOutput() GetGroupsGroupArrayOutput
	ToGetGroupsGroupArrayOutputWithContext(context.Context) GetGroupsGroupArrayOutput
}

type GetGroupsGroupArray []GetGroupsGroupInput

func (GetGroupsGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetGroupsGroup)(nil)).Elem()
}

func (i GetGroupsGroupArray) ToGetGroupsGroupArrayOutput() GetGroupsGroupArrayOutput {
	return i.ToGetGroupsGroupArrayOutputWithContext(context.Background())
}

func (i GetGroupsGroupArray) ToGetGroupsGroupArrayOutputWithContext(ctx context.Context) GetGroupsGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetGroupsGroupArrayOutput)
}

type GetGroupsGroupOutput struct{ *pulumi.OutputState }

func (GetGroupsGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGroupsGroup)(nil)).Elem()
}

func (o GetGroupsGroupOutput) ToGetGroupsGroupOutput() GetGroupsGroupOutput {
	return o
}

func (o GetGroupsGroupOutput) ToGetGroupsGroupOutputWithContext(ctx context.Context) GetGroupsGroupOutput {
	return o
}

// GroupFlag, '0' mean default group(created by system), '1' means customer defined group.
func (o GetGroupsGroupOutput) GroupFlag() pulumi.IntOutput {
	return o.ApplyT(func(v GetGroupsGroup) int { return v.GroupFlag }).(pulumi.IntOutput)
}

// The ID of Group.
func (o GetGroupsGroupOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGroupsGroup) string { return v.GroupId }).(pulumi.StringOutput)
}

// The name of Group.
func (o GetGroupsGroupOutput) GroupName() pulumi.StringOutput {
	return o.ApplyT(func(v GetGroupsGroup) string { return v.GroupName }).(pulumi.StringOutput)
}

// The ID of the Group(same as the group_id).
func (o GetGroupsGroupOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGroupsGroup) string { return v.Id }).(pulumi.StringOutput)
}

type GetGroupsGroupArrayOutput struct{ *pulumi.OutputState }

func (GetGroupsGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetGroupsGroup)(nil)).Elem()
}

func (o GetGroupsGroupArrayOutput) ToGetGroupsGroupArrayOutput() GetGroupsGroupArrayOutput {
	return o
}

func (o GetGroupsGroupArrayOutput) ToGetGroupsGroupArrayOutputWithContext(ctx context.Context) GetGroupsGroupArrayOutput {
	return o
}

func (o GetGroupsGroupArrayOutput) Index(i pulumi.IntInput) GetGroupsGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetGroupsGroup {
		return vs[0].([]GetGroupsGroup)[vs[1].(int)]
	}).(GetGroupsGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GetGroupsGroupInput)(nil)).Elem(), GetGroupsGroupArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetGroupsGroupArrayInput)(nil)).Elem(), GetGroupsGroupArray{})
	pulumi.RegisterOutputType(GetGroupsGroupOutput{})
	pulumi.RegisterOutputType(GetGroupsGroupArrayOutput{})
}
