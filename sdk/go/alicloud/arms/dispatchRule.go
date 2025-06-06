// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package arms

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Application Real-Time Monitoring Service (ARMS) Alert Dispatch Rule resource.
//
// For information about Application Real-Time Monitoring Service (ARMS) Alert Dispatch Rule and how to use it, see [What is Alert Dispatch_Rule](https://next.api.alibabacloud.com/document/ARMS/2019-08-08/CreateDispatchRule).
//
// > **NOTE:** Available since v1.136.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/arms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := arms.NewAlertContact(ctx, "default", &arms.AlertContactArgs{
//				AlertContactName: pulumi.String("example_value"),
//				Email:            pulumi.String("example_value@aaa.com"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultAlertContactGroup, err := arms.NewAlertContactGroup(ctx, "default", &arms.AlertContactGroupArgs{
//				AlertContactGroupName: pulumi.String("example_value"),
//				ContactIds: pulumi.StringArray{
//					_default.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = arms.NewDispatchRule(ctx, "default", &arms.DispatchRuleArgs{
//				DispatchRuleName: pulumi.String("example_value"),
//				DispatchType:     pulumi.String("CREATE_ALERT"),
//				GroupRules: arms.DispatchRuleGroupRuleArray{
//					&arms.DispatchRuleGroupRuleArgs{
//						GroupWaitTime:  pulumi.Int(5),
//						GroupInterval:  pulumi.Int(15),
//						RepeatInterval: pulumi.Int(100),
//						GroupingFields: pulumi.StringArray{
//							pulumi.String("alertname"),
//						},
//					},
//				},
//				LabelMatchExpressionGrids: arms.DispatchRuleLabelMatchExpressionGridArray{
//					&arms.DispatchRuleLabelMatchExpressionGridArgs{
//						LabelMatchExpressionGroups: arms.DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupArray{
//							&arms.DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupArgs{
//								LabelMatchExpressions: arms.DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupLabelMatchExpressionArray{
//									&arms.DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupLabelMatchExpressionArgs{
//										Key:      pulumi.String("_aliyun_arms_involvedObject_kind"),
//										Value:    pulumi.String("app"),
//										Operator: pulumi.String("eq"),
//									},
//								},
//							},
//						},
//					},
//				},
//				NotifyRules: arms.DispatchRuleNotifyRuleArray{
//					&arms.DispatchRuleNotifyRuleArgs{
//						NotifyObjects: arms.DispatchRuleNotifyRuleNotifyObjectArray{
//							&arms.DispatchRuleNotifyRuleNotifyObjectArgs{
//								NotifyObjectId: _default.ID(),
//								NotifyType:     pulumi.String("ARMS_CONTACT"),
//								Name:           pulumi.String("example_value"),
//							},
//							&arms.DispatchRuleNotifyRuleNotifyObjectArgs{
//								NotifyObjectId: defaultAlertContactGroup.ID(),
//								NotifyType:     pulumi.String("ARMS_CONTACT_GROUP"),
//								Name:           pulumi.String("example_value"),
//							},
//						},
//						NotifyChannels: pulumi.StringArray{
//							pulumi.String("dingTalk"),
//							pulumi.String("wechat"),
//						},
//						NotifyStartTime: pulumi.String("10:00"),
//						NotifyEndTime:   pulumi.String("23:00"),
//					},
//				},
//				NotifyTemplates: arms.DispatchRuleNotifyTemplateArray{
//					&arms.DispatchRuleNotifyTemplateArgs{
//						EmailTitle:          pulumi.String("example_email_title"),
//						EmailContent:        pulumi.String("example_email_content"),
//						EmailRecoverTitle:   pulumi.String("example_email_recover_title"),
//						EmailRecoverContent: pulumi.String("example_email_recover_content"),
//						SmsContent:          pulumi.String("example_sms_content"),
//						SmsRecoverContent:   pulumi.String("example_sms_recover_content"),
//						TtsContent:          pulumi.String("example_tts_content"),
//						TtsRecoverContent:   pulumi.String("example_tts_recover_content"),
//						RobotContent:        pulumi.String("example_robot_content"),
//					},
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
// Application Real-Time Monitoring Service (ARMS) Alert Contact can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:arms/dispatchRule:DispatchRule example <id>
// ```
type DispatchRule struct {
	pulumi.CustomResourceState

	// The name of the dispatch policy.
	DispatchRuleName pulumi.StringOutput `pulumi:"dispatchRuleName"`
	// The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
	DispatchType pulumi.StringPtrOutput `pulumi:"dispatchType"`
	// Sets the event group. See `groupRules` below. It will be ignored  when `dispatchType = "DISCARD_ALERT"`.
	GroupRules DispatchRuleGroupRuleArrayOutput `pulumi:"groupRules"`
	// Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
	IsRecover pulumi.BoolPtrOutput `pulumi:"isRecover"`
	// Sets the dispatch rule. See `labelMatchExpressionGrid` below.
	LabelMatchExpressionGrids DispatchRuleLabelMatchExpressionGridArrayOutput `pulumi:"labelMatchExpressionGrids"`
	// Sets the notification rule. See `notifyRules` below. It will be ignored  when `dispatchType = "DISCARD_ALERT"`.
	NotifyRules DispatchRuleNotifyRuleArrayOutput `pulumi:"notifyRules"`
	// Sets the notification template. See `notifyTemplate` below.
	NotifyTemplates DispatchRuleNotifyTemplateArrayOutput `pulumi:"notifyTemplates"`
	// The resource status of Alert Dispatch Rule.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewDispatchRule registers a new resource with the given unique name, arguments, and options.
func NewDispatchRule(ctx *pulumi.Context,
	name string, args *DispatchRuleArgs, opts ...pulumi.ResourceOption) (*DispatchRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DispatchRuleName == nil {
		return nil, errors.New("invalid value for required argument 'DispatchRuleName'")
	}
	if args.GroupRules == nil {
		return nil, errors.New("invalid value for required argument 'GroupRules'")
	}
	if args.LabelMatchExpressionGrids == nil {
		return nil, errors.New("invalid value for required argument 'LabelMatchExpressionGrids'")
	}
	if args.NotifyRules == nil {
		return nil, errors.New("invalid value for required argument 'NotifyRules'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DispatchRule
	err := ctx.RegisterResource("alicloud:arms/dispatchRule:DispatchRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDispatchRule gets an existing DispatchRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDispatchRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DispatchRuleState, opts ...pulumi.ResourceOption) (*DispatchRule, error) {
	var resource DispatchRule
	err := ctx.ReadResource("alicloud:arms/dispatchRule:DispatchRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DispatchRule resources.
type dispatchRuleState struct {
	// The name of the dispatch policy.
	DispatchRuleName *string `pulumi:"dispatchRuleName"`
	// The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
	DispatchType *string `pulumi:"dispatchType"`
	// Sets the event group. See `groupRules` below. It will be ignored  when `dispatchType = "DISCARD_ALERT"`.
	GroupRules []DispatchRuleGroupRule `pulumi:"groupRules"`
	// Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
	IsRecover *bool `pulumi:"isRecover"`
	// Sets the dispatch rule. See `labelMatchExpressionGrid` below.
	LabelMatchExpressionGrids []DispatchRuleLabelMatchExpressionGrid `pulumi:"labelMatchExpressionGrids"`
	// Sets the notification rule. See `notifyRules` below. It will be ignored  when `dispatchType = "DISCARD_ALERT"`.
	NotifyRules []DispatchRuleNotifyRule `pulumi:"notifyRules"`
	// Sets the notification template. See `notifyTemplate` below.
	NotifyTemplates []DispatchRuleNotifyTemplate `pulumi:"notifyTemplates"`
	// The resource status of Alert Dispatch Rule.
	Status *string `pulumi:"status"`
}

type DispatchRuleState struct {
	// The name of the dispatch policy.
	DispatchRuleName pulumi.StringPtrInput
	// The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
	DispatchType pulumi.StringPtrInput
	// Sets the event group. See `groupRules` below. It will be ignored  when `dispatchType = "DISCARD_ALERT"`.
	GroupRules DispatchRuleGroupRuleArrayInput
	// Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
	IsRecover pulumi.BoolPtrInput
	// Sets the dispatch rule. See `labelMatchExpressionGrid` below.
	LabelMatchExpressionGrids DispatchRuleLabelMatchExpressionGridArrayInput
	// Sets the notification rule. See `notifyRules` below. It will be ignored  when `dispatchType = "DISCARD_ALERT"`.
	NotifyRules DispatchRuleNotifyRuleArrayInput
	// Sets the notification template. See `notifyTemplate` below.
	NotifyTemplates DispatchRuleNotifyTemplateArrayInput
	// The resource status of Alert Dispatch Rule.
	Status pulumi.StringPtrInput
}

func (DispatchRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*dispatchRuleState)(nil)).Elem()
}

type dispatchRuleArgs struct {
	// The name of the dispatch policy.
	DispatchRuleName string `pulumi:"dispatchRuleName"`
	// The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
	DispatchType *string `pulumi:"dispatchType"`
	// Sets the event group. See `groupRules` below. It will be ignored  when `dispatchType = "DISCARD_ALERT"`.
	GroupRules []DispatchRuleGroupRule `pulumi:"groupRules"`
	// Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
	IsRecover *bool `pulumi:"isRecover"`
	// Sets the dispatch rule. See `labelMatchExpressionGrid` below.
	LabelMatchExpressionGrids []DispatchRuleLabelMatchExpressionGrid `pulumi:"labelMatchExpressionGrids"`
	// Sets the notification rule. See `notifyRules` below. It will be ignored  when `dispatchType = "DISCARD_ALERT"`.
	NotifyRules []DispatchRuleNotifyRule `pulumi:"notifyRules"`
	// Sets the notification template. See `notifyTemplate` below.
	NotifyTemplates []DispatchRuleNotifyTemplate `pulumi:"notifyTemplates"`
}

// The set of arguments for constructing a DispatchRule resource.
type DispatchRuleArgs struct {
	// The name of the dispatch policy.
	DispatchRuleName pulumi.StringInput
	// The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
	DispatchType pulumi.StringPtrInput
	// Sets the event group. See `groupRules` below. It will be ignored  when `dispatchType = "DISCARD_ALERT"`.
	GroupRules DispatchRuleGroupRuleArrayInput
	// Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
	IsRecover pulumi.BoolPtrInput
	// Sets the dispatch rule. See `labelMatchExpressionGrid` below.
	LabelMatchExpressionGrids DispatchRuleLabelMatchExpressionGridArrayInput
	// Sets the notification rule. See `notifyRules` below. It will be ignored  when `dispatchType = "DISCARD_ALERT"`.
	NotifyRules DispatchRuleNotifyRuleArrayInput
	// Sets the notification template. See `notifyTemplate` below.
	NotifyTemplates DispatchRuleNotifyTemplateArrayInput
}

func (DispatchRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dispatchRuleArgs)(nil)).Elem()
}

type DispatchRuleInput interface {
	pulumi.Input

	ToDispatchRuleOutput() DispatchRuleOutput
	ToDispatchRuleOutputWithContext(ctx context.Context) DispatchRuleOutput
}

func (*DispatchRule) ElementType() reflect.Type {
	return reflect.TypeOf((**DispatchRule)(nil)).Elem()
}

func (i *DispatchRule) ToDispatchRuleOutput() DispatchRuleOutput {
	return i.ToDispatchRuleOutputWithContext(context.Background())
}

func (i *DispatchRule) ToDispatchRuleOutputWithContext(ctx context.Context) DispatchRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DispatchRuleOutput)
}

// DispatchRuleArrayInput is an input type that accepts DispatchRuleArray and DispatchRuleArrayOutput values.
// You can construct a concrete instance of `DispatchRuleArrayInput` via:
//
//	DispatchRuleArray{ DispatchRuleArgs{...} }
type DispatchRuleArrayInput interface {
	pulumi.Input

	ToDispatchRuleArrayOutput() DispatchRuleArrayOutput
	ToDispatchRuleArrayOutputWithContext(context.Context) DispatchRuleArrayOutput
}

type DispatchRuleArray []DispatchRuleInput

func (DispatchRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DispatchRule)(nil)).Elem()
}

func (i DispatchRuleArray) ToDispatchRuleArrayOutput() DispatchRuleArrayOutput {
	return i.ToDispatchRuleArrayOutputWithContext(context.Background())
}

func (i DispatchRuleArray) ToDispatchRuleArrayOutputWithContext(ctx context.Context) DispatchRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DispatchRuleArrayOutput)
}

// DispatchRuleMapInput is an input type that accepts DispatchRuleMap and DispatchRuleMapOutput values.
// You can construct a concrete instance of `DispatchRuleMapInput` via:
//
//	DispatchRuleMap{ "key": DispatchRuleArgs{...} }
type DispatchRuleMapInput interface {
	pulumi.Input

	ToDispatchRuleMapOutput() DispatchRuleMapOutput
	ToDispatchRuleMapOutputWithContext(context.Context) DispatchRuleMapOutput
}

type DispatchRuleMap map[string]DispatchRuleInput

func (DispatchRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DispatchRule)(nil)).Elem()
}

func (i DispatchRuleMap) ToDispatchRuleMapOutput() DispatchRuleMapOutput {
	return i.ToDispatchRuleMapOutputWithContext(context.Background())
}

func (i DispatchRuleMap) ToDispatchRuleMapOutputWithContext(ctx context.Context) DispatchRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DispatchRuleMapOutput)
}

type DispatchRuleOutput struct{ *pulumi.OutputState }

func (DispatchRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DispatchRule)(nil)).Elem()
}

func (o DispatchRuleOutput) ToDispatchRuleOutput() DispatchRuleOutput {
	return o
}

func (o DispatchRuleOutput) ToDispatchRuleOutputWithContext(ctx context.Context) DispatchRuleOutput {
	return o
}

// The name of the dispatch policy.
func (o DispatchRuleOutput) DispatchRuleName() pulumi.StringOutput {
	return o.ApplyT(func(v *DispatchRule) pulumi.StringOutput { return v.DispatchRuleName }).(pulumi.StringOutput)
}

// The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
func (o DispatchRuleOutput) DispatchType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DispatchRule) pulumi.StringPtrOutput { return v.DispatchType }).(pulumi.StringPtrOutput)
}

// Sets the event group. See `groupRules` below. It will be ignored  when `dispatchType = "DISCARD_ALERT"`.
func (o DispatchRuleOutput) GroupRules() DispatchRuleGroupRuleArrayOutput {
	return o.ApplyT(func(v *DispatchRule) DispatchRuleGroupRuleArrayOutput { return v.GroupRules }).(DispatchRuleGroupRuleArrayOutput)
}

// Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
func (o DispatchRuleOutput) IsRecover() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *DispatchRule) pulumi.BoolPtrOutput { return v.IsRecover }).(pulumi.BoolPtrOutput)
}

// Sets the dispatch rule. See `labelMatchExpressionGrid` below.
func (o DispatchRuleOutput) LabelMatchExpressionGrids() DispatchRuleLabelMatchExpressionGridArrayOutput {
	return o.ApplyT(func(v *DispatchRule) DispatchRuleLabelMatchExpressionGridArrayOutput {
		return v.LabelMatchExpressionGrids
	}).(DispatchRuleLabelMatchExpressionGridArrayOutput)
}

// Sets the notification rule. See `notifyRules` below. It will be ignored  when `dispatchType = "DISCARD_ALERT"`.
func (o DispatchRuleOutput) NotifyRules() DispatchRuleNotifyRuleArrayOutput {
	return o.ApplyT(func(v *DispatchRule) DispatchRuleNotifyRuleArrayOutput { return v.NotifyRules }).(DispatchRuleNotifyRuleArrayOutput)
}

// Sets the notification template. See `notifyTemplate` below.
func (o DispatchRuleOutput) NotifyTemplates() DispatchRuleNotifyTemplateArrayOutput {
	return o.ApplyT(func(v *DispatchRule) DispatchRuleNotifyTemplateArrayOutput { return v.NotifyTemplates }).(DispatchRuleNotifyTemplateArrayOutput)
}

// The resource status of Alert Dispatch Rule.
func (o DispatchRuleOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *DispatchRule) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type DispatchRuleArrayOutput struct{ *pulumi.OutputState }

func (DispatchRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DispatchRule)(nil)).Elem()
}

func (o DispatchRuleArrayOutput) ToDispatchRuleArrayOutput() DispatchRuleArrayOutput {
	return o
}

func (o DispatchRuleArrayOutput) ToDispatchRuleArrayOutputWithContext(ctx context.Context) DispatchRuleArrayOutput {
	return o
}

func (o DispatchRuleArrayOutput) Index(i pulumi.IntInput) DispatchRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DispatchRule {
		return vs[0].([]*DispatchRule)[vs[1].(int)]
	}).(DispatchRuleOutput)
}

type DispatchRuleMapOutput struct{ *pulumi.OutputState }

func (DispatchRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DispatchRule)(nil)).Elem()
}

func (o DispatchRuleMapOutput) ToDispatchRuleMapOutput() DispatchRuleMapOutput {
	return o
}

func (o DispatchRuleMapOutput) ToDispatchRuleMapOutputWithContext(ctx context.Context) DispatchRuleMapOutput {
	return o
}

func (o DispatchRuleMapOutput) MapIndex(k pulumi.StringInput) DispatchRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DispatchRule {
		return vs[0].(map[string]*DispatchRule)[vs[1].(string)]
	}).(DispatchRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DispatchRuleInput)(nil)).Elem(), &DispatchRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*DispatchRuleArrayInput)(nil)).Elem(), DispatchRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DispatchRuleMapInput)(nil)).Elem(), DispatchRuleMap{})
	pulumi.RegisterOutputType(DispatchRuleOutput{})
	pulumi.RegisterOutputType(DispatchRuleArrayOutput{})
	pulumi.RegisterOutputType(DispatchRuleMapOutput{})
}
