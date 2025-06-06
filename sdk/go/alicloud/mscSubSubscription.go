// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package alicloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Msc Sub Subscription resource.
//
// > **NOTE:** Available since v1.135.0.
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
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := alicloud.NewMscSubSubscription(ctx, "example", &alicloud.MscSubSubscriptionArgs{
//				ItemName:      pulumi.String("Notifications of Product Expiration"),
//				SmsStatus:     pulumi.Int(1),
//				EmailStatus:   pulumi.Int(1),
//				PmsgStatus:    pulumi.Int(1),
//				TtsStatus:     pulumi.Int(1),
//				WebhookStatus: pulumi.Int(0),
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
// Msc Sub Subscription can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:index/mscSubSubscription:MscSubSubscription example <id>
// ```
type MscSubSubscription struct {
	pulumi.CustomResourceState

	// The channel the Subscription.
	Channel pulumi.StringOutput `pulumi:"channel"`
	// The ids of subscribed contacts.
	// **NOTE:** There is a potential diff error because of the order of `contactIds` values indefinite.
	// So, from version 1.161.0, `contactIds` type has been updated as `set` from `list`,
	// and you can use tolist to convert it to a list.
	ContactIds pulumi.StringArrayOutput `pulumi:"contactIds"`
	// The description of the Subscription.
	Description pulumi.StringOutput `pulumi:"description"`
	// The status of email subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	EmailStatus pulumi.IntPtrOutput `pulumi:"emailStatus"`
	// The name of the Subscription. **NOTE:**  You should use the `getMscSubSubscriptions` to query the available subscription item name.
	ItemName pulumi.StringOutput `pulumi:"itemName"`
	// The status of pmsg subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	PmsgStatus pulumi.IntPtrOutput `pulumi:"pmsgStatus"`
	// The status of sms subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	SmsStatus pulumi.IntPtrOutput `pulumi:"smsStatus"`
	// The status of tts subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	TtsStatus pulumi.IntPtrOutput `pulumi:"ttsStatus"`
	// The ids of subscribed webhooks.
	WebhookIds pulumi.StringArrayOutput `pulumi:"webhookIds"`
	// The status of webhook subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	WebhookStatus pulumi.IntPtrOutput `pulumi:"webhookStatus"`
}

// NewMscSubSubscription registers a new resource with the given unique name, arguments, and options.
func NewMscSubSubscription(ctx *pulumi.Context,
	name string, args *MscSubSubscriptionArgs, opts ...pulumi.ResourceOption) (*MscSubSubscription, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ItemName == nil {
		return nil, errors.New("invalid value for required argument 'ItemName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MscSubSubscription
	err := ctx.RegisterResource("alicloud:index/mscSubSubscription:MscSubSubscription", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMscSubSubscription gets an existing MscSubSubscription resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMscSubSubscription(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MscSubSubscriptionState, opts ...pulumi.ResourceOption) (*MscSubSubscription, error) {
	var resource MscSubSubscription
	err := ctx.ReadResource("alicloud:index/mscSubSubscription:MscSubSubscription", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MscSubSubscription resources.
type mscSubSubscriptionState struct {
	// The channel the Subscription.
	Channel *string `pulumi:"channel"`
	// The ids of subscribed contacts.
	// **NOTE:** There is a potential diff error because of the order of `contactIds` values indefinite.
	// So, from version 1.161.0, `contactIds` type has been updated as `set` from `list`,
	// and you can use tolist to convert it to a list.
	ContactIds []string `pulumi:"contactIds"`
	// The description of the Subscription.
	Description *string `pulumi:"description"`
	// The status of email subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	EmailStatus *int `pulumi:"emailStatus"`
	// The name of the Subscription. **NOTE:**  You should use the `getMscSubSubscriptions` to query the available subscription item name.
	ItemName *string `pulumi:"itemName"`
	// The status of pmsg subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	PmsgStatus *int `pulumi:"pmsgStatus"`
	// The status of sms subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	SmsStatus *int `pulumi:"smsStatus"`
	// The status of tts subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	TtsStatus *int `pulumi:"ttsStatus"`
	// The ids of subscribed webhooks.
	WebhookIds []string `pulumi:"webhookIds"`
	// The status of webhook subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	WebhookStatus *int `pulumi:"webhookStatus"`
}

type MscSubSubscriptionState struct {
	// The channel the Subscription.
	Channel pulumi.StringPtrInput
	// The ids of subscribed contacts.
	// **NOTE:** There is a potential diff error because of the order of `contactIds` values indefinite.
	// So, from version 1.161.0, `contactIds` type has been updated as `set` from `list`,
	// and you can use tolist to convert it to a list.
	ContactIds pulumi.StringArrayInput
	// The description of the Subscription.
	Description pulumi.StringPtrInput
	// The status of email subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	EmailStatus pulumi.IntPtrInput
	// The name of the Subscription. **NOTE:**  You should use the `getMscSubSubscriptions` to query the available subscription item name.
	ItemName pulumi.StringPtrInput
	// The status of pmsg subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	PmsgStatus pulumi.IntPtrInput
	// The status of sms subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	SmsStatus pulumi.IntPtrInput
	// The status of tts subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	TtsStatus pulumi.IntPtrInput
	// The ids of subscribed webhooks.
	WebhookIds pulumi.StringArrayInput
	// The status of webhook subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	WebhookStatus pulumi.IntPtrInput
}

func (MscSubSubscriptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*mscSubSubscriptionState)(nil)).Elem()
}

type mscSubSubscriptionArgs struct {
	// The ids of subscribed contacts.
	// **NOTE:** There is a potential diff error because of the order of `contactIds` values indefinite.
	// So, from version 1.161.0, `contactIds` type has been updated as `set` from `list`,
	// and you can use tolist to convert it to a list.
	ContactIds []string `pulumi:"contactIds"`
	// The status of email subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	EmailStatus *int `pulumi:"emailStatus"`
	// The name of the Subscription. **NOTE:**  You should use the `getMscSubSubscriptions` to query the available subscription item name.
	ItemName string `pulumi:"itemName"`
	// The status of pmsg subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	PmsgStatus *int `pulumi:"pmsgStatus"`
	// The status of sms subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	SmsStatus *int `pulumi:"smsStatus"`
	// The status of tts subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	TtsStatus *int `pulumi:"ttsStatus"`
	// The ids of subscribed webhooks.
	WebhookIds []string `pulumi:"webhookIds"`
	// The status of webhook subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	WebhookStatus *int `pulumi:"webhookStatus"`
}

// The set of arguments for constructing a MscSubSubscription resource.
type MscSubSubscriptionArgs struct {
	// The ids of subscribed contacts.
	// **NOTE:** There is a potential diff error because of the order of `contactIds` values indefinite.
	// So, from version 1.161.0, `contactIds` type has been updated as `set` from `list`,
	// and you can use tolist to convert it to a list.
	ContactIds pulumi.StringArrayInput
	// The status of email subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	EmailStatus pulumi.IntPtrInput
	// The name of the Subscription. **NOTE:**  You should use the `getMscSubSubscriptions` to query the available subscription item name.
	ItemName pulumi.StringInput
	// The status of pmsg subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	PmsgStatus pulumi.IntPtrInput
	// The status of sms subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	SmsStatus pulumi.IntPtrInput
	// The status of tts subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	TtsStatus pulumi.IntPtrInput
	// The ids of subscribed webhooks.
	WebhookIds pulumi.StringArrayInput
	// The status of webhook subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
	WebhookStatus pulumi.IntPtrInput
}

func (MscSubSubscriptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mscSubSubscriptionArgs)(nil)).Elem()
}

type MscSubSubscriptionInput interface {
	pulumi.Input

	ToMscSubSubscriptionOutput() MscSubSubscriptionOutput
	ToMscSubSubscriptionOutputWithContext(ctx context.Context) MscSubSubscriptionOutput
}

func (*MscSubSubscription) ElementType() reflect.Type {
	return reflect.TypeOf((**MscSubSubscription)(nil)).Elem()
}

func (i *MscSubSubscription) ToMscSubSubscriptionOutput() MscSubSubscriptionOutput {
	return i.ToMscSubSubscriptionOutputWithContext(context.Background())
}

func (i *MscSubSubscription) ToMscSubSubscriptionOutputWithContext(ctx context.Context) MscSubSubscriptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MscSubSubscriptionOutput)
}

// MscSubSubscriptionArrayInput is an input type that accepts MscSubSubscriptionArray and MscSubSubscriptionArrayOutput values.
// You can construct a concrete instance of `MscSubSubscriptionArrayInput` via:
//
//	MscSubSubscriptionArray{ MscSubSubscriptionArgs{...} }
type MscSubSubscriptionArrayInput interface {
	pulumi.Input

	ToMscSubSubscriptionArrayOutput() MscSubSubscriptionArrayOutput
	ToMscSubSubscriptionArrayOutputWithContext(context.Context) MscSubSubscriptionArrayOutput
}

type MscSubSubscriptionArray []MscSubSubscriptionInput

func (MscSubSubscriptionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MscSubSubscription)(nil)).Elem()
}

func (i MscSubSubscriptionArray) ToMscSubSubscriptionArrayOutput() MscSubSubscriptionArrayOutput {
	return i.ToMscSubSubscriptionArrayOutputWithContext(context.Background())
}

func (i MscSubSubscriptionArray) ToMscSubSubscriptionArrayOutputWithContext(ctx context.Context) MscSubSubscriptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MscSubSubscriptionArrayOutput)
}

// MscSubSubscriptionMapInput is an input type that accepts MscSubSubscriptionMap and MscSubSubscriptionMapOutput values.
// You can construct a concrete instance of `MscSubSubscriptionMapInput` via:
//
//	MscSubSubscriptionMap{ "key": MscSubSubscriptionArgs{...} }
type MscSubSubscriptionMapInput interface {
	pulumi.Input

	ToMscSubSubscriptionMapOutput() MscSubSubscriptionMapOutput
	ToMscSubSubscriptionMapOutputWithContext(context.Context) MscSubSubscriptionMapOutput
}

type MscSubSubscriptionMap map[string]MscSubSubscriptionInput

func (MscSubSubscriptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MscSubSubscription)(nil)).Elem()
}

func (i MscSubSubscriptionMap) ToMscSubSubscriptionMapOutput() MscSubSubscriptionMapOutput {
	return i.ToMscSubSubscriptionMapOutputWithContext(context.Background())
}

func (i MscSubSubscriptionMap) ToMscSubSubscriptionMapOutputWithContext(ctx context.Context) MscSubSubscriptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MscSubSubscriptionMapOutput)
}

type MscSubSubscriptionOutput struct{ *pulumi.OutputState }

func (MscSubSubscriptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MscSubSubscription)(nil)).Elem()
}

func (o MscSubSubscriptionOutput) ToMscSubSubscriptionOutput() MscSubSubscriptionOutput {
	return o
}

func (o MscSubSubscriptionOutput) ToMscSubSubscriptionOutputWithContext(ctx context.Context) MscSubSubscriptionOutput {
	return o
}

// The channel the Subscription.
func (o MscSubSubscriptionOutput) Channel() pulumi.StringOutput {
	return o.ApplyT(func(v *MscSubSubscription) pulumi.StringOutput { return v.Channel }).(pulumi.StringOutput)
}

// The ids of subscribed contacts.
// **NOTE:** There is a potential diff error because of the order of `contactIds` values indefinite.
// So, from version 1.161.0, `contactIds` type has been updated as `set` from `list`,
// and you can use tolist to convert it to a list.
func (o MscSubSubscriptionOutput) ContactIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MscSubSubscription) pulumi.StringArrayOutput { return v.ContactIds }).(pulumi.StringArrayOutput)
}

// The description of the Subscription.
func (o MscSubSubscriptionOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *MscSubSubscription) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The status of email subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
func (o MscSubSubscriptionOutput) EmailStatus() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MscSubSubscription) pulumi.IntPtrOutput { return v.EmailStatus }).(pulumi.IntPtrOutput)
}

// The name of the Subscription. **NOTE:**  You should use the `getMscSubSubscriptions` to query the available subscription item name.
func (o MscSubSubscriptionOutput) ItemName() pulumi.StringOutput {
	return o.ApplyT(func(v *MscSubSubscription) pulumi.StringOutput { return v.ItemName }).(pulumi.StringOutput)
}

// The status of pmsg subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
func (o MscSubSubscriptionOutput) PmsgStatus() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MscSubSubscription) pulumi.IntPtrOutput { return v.PmsgStatus }).(pulumi.IntPtrOutput)
}

// The status of sms subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
func (o MscSubSubscriptionOutput) SmsStatus() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MscSubSubscription) pulumi.IntPtrOutput { return v.SmsStatus }).(pulumi.IntPtrOutput)
}

// The status of tts subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
func (o MscSubSubscriptionOutput) TtsStatus() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MscSubSubscription) pulumi.IntPtrOutput { return v.TtsStatus }).(pulumi.IntPtrOutput)
}

// The ids of subscribed webhooks.
func (o MscSubSubscriptionOutput) WebhookIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MscSubSubscription) pulumi.StringArrayOutput { return v.WebhookIds }).(pulumi.StringArrayOutput)
}

// The status of webhook subscription. Valid values: `-1`, `-2`, `0`, `1`. `-1` means required, `-2` means banned; `1` means subscribed; `0` means not subscribed.
func (o MscSubSubscriptionOutput) WebhookStatus() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MscSubSubscription) pulumi.IntPtrOutput { return v.WebhookStatus }).(pulumi.IntPtrOutput)
}

type MscSubSubscriptionArrayOutput struct{ *pulumi.OutputState }

func (MscSubSubscriptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MscSubSubscription)(nil)).Elem()
}

func (o MscSubSubscriptionArrayOutput) ToMscSubSubscriptionArrayOutput() MscSubSubscriptionArrayOutput {
	return o
}

func (o MscSubSubscriptionArrayOutput) ToMscSubSubscriptionArrayOutputWithContext(ctx context.Context) MscSubSubscriptionArrayOutput {
	return o
}

func (o MscSubSubscriptionArrayOutput) Index(i pulumi.IntInput) MscSubSubscriptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MscSubSubscription {
		return vs[0].([]*MscSubSubscription)[vs[1].(int)]
	}).(MscSubSubscriptionOutput)
}

type MscSubSubscriptionMapOutput struct{ *pulumi.OutputState }

func (MscSubSubscriptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MscSubSubscription)(nil)).Elem()
}

func (o MscSubSubscriptionMapOutput) ToMscSubSubscriptionMapOutput() MscSubSubscriptionMapOutput {
	return o
}

func (o MscSubSubscriptionMapOutput) ToMscSubSubscriptionMapOutputWithContext(ctx context.Context) MscSubSubscriptionMapOutput {
	return o
}

func (o MscSubSubscriptionMapOutput) MapIndex(k pulumi.StringInput) MscSubSubscriptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MscSubSubscription {
		return vs[0].(map[string]*MscSubSubscription)[vs[1].(string)]
	}).(MscSubSubscriptionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MscSubSubscriptionInput)(nil)).Elem(), &MscSubSubscription{})
	pulumi.RegisterInputType(reflect.TypeOf((*MscSubSubscriptionArrayInput)(nil)).Elem(), MscSubSubscriptionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MscSubSubscriptionMapInput)(nil)).Elem(), MscSubSubscriptionMap{})
	pulumi.RegisterOutputType(MscSubSubscriptionOutput{})
	pulumi.RegisterOutputType(MscSubSubscriptionArrayOutput{})
	pulumi.RegisterOutputType(MscSubSubscriptionMapOutput{})
}
