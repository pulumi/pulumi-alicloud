// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package quotas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type ApplicationInfo struct {
	pulumi.CustomResourceState

	ApproveValue     pulumi.StringOutput                 `pulumi:"approveValue"`
	AuditMode        pulumi.StringOutput                 `pulumi:"auditMode"`
	AuditReason      pulumi.StringOutput                 `pulumi:"auditReason"`
	CreateTime       pulumi.StringOutput                 `pulumi:"createTime"`
	DesireValue      pulumi.Float64Output                `pulumi:"desireValue"`
	Dimensions       ApplicationInfoDimensionArrayOutput `pulumi:"dimensions"`
	EffectiveTime    pulumi.StringPtrOutput              `pulumi:"effectiveTime"`
	EnvLanguage      pulumi.StringPtrOutput              `pulumi:"envLanguage"`
	ExpireTime       pulumi.StringPtrOutput              `pulumi:"expireTime"`
	NoticeType       pulumi.IntOutput                    `pulumi:"noticeType"`
	ProductCode      pulumi.StringOutput                 `pulumi:"productCode"`
	QuotaActionCode  pulumi.StringOutput                 `pulumi:"quotaActionCode"`
	QuotaCategory    pulumi.StringPtrOutput              `pulumi:"quotaCategory"`
	QuotaDescription pulumi.StringOutput                 `pulumi:"quotaDescription"`
	QuotaName        pulumi.StringOutput                 `pulumi:"quotaName"`
	QuotaUnit        pulumi.StringOutput                 `pulumi:"quotaUnit"`
	Reason           pulumi.StringOutput                 `pulumi:"reason"`
	Status           pulumi.StringOutput                 `pulumi:"status"`
}

// NewApplicationInfo registers a new resource with the given unique name, arguments, and options.
func NewApplicationInfo(ctx *pulumi.Context,
	name string, args *ApplicationInfoArgs, opts ...pulumi.ResourceOption) (*ApplicationInfo, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DesireValue == nil {
		return nil, errors.New("invalid value for required argument 'DesireValue'")
	}
	if args.ProductCode == nil {
		return nil, errors.New("invalid value for required argument 'ProductCode'")
	}
	if args.QuotaActionCode == nil {
		return nil, errors.New("invalid value for required argument 'QuotaActionCode'")
	}
	if args.Reason == nil {
		return nil, errors.New("invalid value for required argument 'Reason'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplicationInfo
	err := ctx.RegisterResource("alicloud:quotas/applicationInfo:ApplicationInfo", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplicationInfo gets an existing ApplicationInfo resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplicationInfo(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationInfoState, opts ...pulumi.ResourceOption) (*ApplicationInfo, error) {
	var resource ApplicationInfo
	err := ctx.ReadResource("alicloud:quotas/applicationInfo:ApplicationInfo", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplicationInfo resources.
type applicationInfoState struct {
	ApproveValue     *string                    `pulumi:"approveValue"`
	AuditMode        *string                    `pulumi:"auditMode"`
	AuditReason      *string                    `pulumi:"auditReason"`
	CreateTime       *string                    `pulumi:"createTime"`
	DesireValue      *float64                   `pulumi:"desireValue"`
	Dimensions       []ApplicationInfoDimension `pulumi:"dimensions"`
	EffectiveTime    *string                    `pulumi:"effectiveTime"`
	EnvLanguage      *string                    `pulumi:"envLanguage"`
	ExpireTime       *string                    `pulumi:"expireTime"`
	NoticeType       *int                       `pulumi:"noticeType"`
	ProductCode      *string                    `pulumi:"productCode"`
	QuotaActionCode  *string                    `pulumi:"quotaActionCode"`
	QuotaCategory    *string                    `pulumi:"quotaCategory"`
	QuotaDescription *string                    `pulumi:"quotaDescription"`
	QuotaName        *string                    `pulumi:"quotaName"`
	QuotaUnit        *string                    `pulumi:"quotaUnit"`
	Reason           *string                    `pulumi:"reason"`
	Status           *string                    `pulumi:"status"`
}

type ApplicationInfoState struct {
	ApproveValue     pulumi.StringPtrInput
	AuditMode        pulumi.StringPtrInput
	AuditReason      pulumi.StringPtrInput
	CreateTime       pulumi.StringPtrInput
	DesireValue      pulumi.Float64PtrInput
	Dimensions       ApplicationInfoDimensionArrayInput
	EffectiveTime    pulumi.StringPtrInput
	EnvLanguage      pulumi.StringPtrInput
	ExpireTime       pulumi.StringPtrInput
	NoticeType       pulumi.IntPtrInput
	ProductCode      pulumi.StringPtrInput
	QuotaActionCode  pulumi.StringPtrInput
	QuotaCategory    pulumi.StringPtrInput
	QuotaDescription pulumi.StringPtrInput
	QuotaName        pulumi.StringPtrInput
	QuotaUnit        pulumi.StringPtrInput
	Reason           pulumi.StringPtrInput
	Status           pulumi.StringPtrInput
}

func (ApplicationInfoState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationInfoState)(nil)).Elem()
}

type applicationInfoArgs struct {
	AuditMode       *string                    `pulumi:"auditMode"`
	DesireValue     float64                    `pulumi:"desireValue"`
	Dimensions      []ApplicationInfoDimension `pulumi:"dimensions"`
	EffectiveTime   *string                    `pulumi:"effectiveTime"`
	EnvLanguage     *string                    `pulumi:"envLanguage"`
	ExpireTime      *string                    `pulumi:"expireTime"`
	NoticeType      *int                       `pulumi:"noticeType"`
	ProductCode     string                     `pulumi:"productCode"`
	QuotaActionCode string                     `pulumi:"quotaActionCode"`
	QuotaCategory   *string                    `pulumi:"quotaCategory"`
	Reason          string                     `pulumi:"reason"`
}

// The set of arguments for constructing a ApplicationInfo resource.
type ApplicationInfoArgs struct {
	AuditMode       pulumi.StringPtrInput
	DesireValue     pulumi.Float64Input
	Dimensions      ApplicationInfoDimensionArrayInput
	EffectiveTime   pulumi.StringPtrInput
	EnvLanguage     pulumi.StringPtrInput
	ExpireTime      pulumi.StringPtrInput
	NoticeType      pulumi.IntPtrInput
	ProductCode     pulumi.StringInput
	QuotaActionCode pulumi.StringInput
	QuotaCategory   pulumi.StringPtrInput
	Reason          pulumi.StringInput
}

func (ApplicationInfoArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationInfoArgs)(nil)).Elem()
}

type ApplicationInfoInput interface {
	pulumi.Input

	ToApplicationInfoOutput() ApplicationInfoOutput
	ToApplicationInfoOutputWithContext(ctx context.Context) ApplicationInfoOutput
}

func (*ApplicationInfo) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationInfo)(nil)).Elem()
}

func (i *ApplicationInfo) ToApplicationInfoOutput() ApplicationInfoOutput {
	return i.ToApplicationInfoOutputWithContext(context.Background())
}

func (i *ApplicationInfo) ToApplicationInfoOutputWithContext(ctx context.Context) ApplicationInfoOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationInfoOutput)
}

// ApplicationInfoArrayInput is an input type that accepts ApplicationInfoArray and ApplicationInfoArrayOutput values.
// You can construct a concrete instance of `ApplicationInfoArrayInput` via:
//
//	ApplicationInfoArray{ ApplicationInfoArgs{...} }
type ApplicationInfoArrayInput interface {
	pulumi.Input

	ToApplicationInfoArrayOutput() ApplicationInfoArrayOutput
	ToApplicationInfoArrayOutputWithContext(context.Context) ApplicationInfoArrayOutput
}

type ApplicationInfoArray []ApplicationInfoInput

func (ApplicationInfoArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationInfo)(nil)).Elem()
}

func (i ApplicationInfoArray) ToApplicationInfoArrayOutput() ApplicationInfoArrayOutput {
	return i.ToApplicationInfoArrayOutputWithContext(context.Background())
}

func (i ApplicationInfoArray) ToApplicationInfoArrayOutputWithContext(ctx context.Context) ApplicationInfoArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationInfoArrayOutput)
}

// ApplicationInfoMapInput is an input type that accepts ApplicationInfoMap and ApplicationInfoMapOutput values.
// You can construct a concrete instance of `ApplicationInfoMapInput` via:
//
//	ApplicationInfoMap{ "key": ApplicationInfoArgs{...} }
type ApplicationInfoMapInput interface {
	pulumi.Input

	ToApplicationInfoMapOutput() ApplicationInfoMapOutput
	ToApplicationInfoMapOutputWithContext(context.Context) ApplicationInfoMapOutput
}

type ApplicationInfoMap map[string]ApplicationInfoInput

func (ApplicationInfoMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationInfo)(nil)).Elem()
}

func (i ApplicationInfoMap) ToApplicationInfoMapOutput() ApplicationInfoMapOutput {
	return i.ToApplicationInfoMapOutputWithContext(context.Background())
}

func (i ApplicationInfoMap) ToApplicationInfoMapOutputWithContext(ctx context.Context) ApplicationInfoMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationInfoMapOutput)
}

type ApplicationInfoOutput struct{ *pulumi.OutputState }

func (ApplicationInfoOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationInfo)(nil)).Elem()
}

func (o ApplicationInfoOutput) ToApplicationInfoOutput() ApplicationInfoOutput {
	return o
}

func (o ApplicationInfoOutput) ToApplicationInfoOutputWithContext(ctx context.Context) ApplicationInfoOutput {
	return o
}

func (o ApplicationInfoOutput) ApproveValue() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringOutput { return v.ApproveValue }).(pulumi.StringOutput)
}

func (o ApplicationInfoOutput) AuditMode() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringOutput { return v.AuditMode }).(pulumi.StringOutput)
}

func (o ApplicationInfoOutput) AuditReason() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringOutput { return v.AuditReason }).(pulumi.StringOutput)
}

func (o ApplicationInfoOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

func (o ApplicationInfoOutput) DesireValue() pulumi.Float64Output {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.Float64Output { return v.DesireValue }).(pulumi.Float64Output)
}

func (o ApplicationInfoOutput) Dimensions() ApplicationInfoDimensionArrayOutput {
	return o.ApplyT(func(v *ApplicationInfo) ApplicationInfoDimensionArrayOutput { return v.Dimensions }).(ApplicationInfoDimensionArrayOutput)
}

func (o ApplicationInfoOutput) EffectiveTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringPtrOutput { return v.EffectiveTime }).(pulumi.StringPtrOutput)
}

func (o ApplicationInfoOutput) EnvLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringPtrOutput { return v.EnvLanguage }).(pulumi.StringPtrOutput)
}

func (o ApplicationInfoOutput) ExpireTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringPtrOutput { return v.ExpireTime }).(pulumi.StringPtrOutput)
}

func (o ApplicationInfoOutput) NoticeType() pulumi.IntOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.IntOutput { return v.NoticeType }).(pulumi.IntOutput)
}

func (o ApplicationInfoOutput) ProductCode() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringOutput { return v.ProductCode }).(pulumi.StringOutput)
}

func (o ApplicationInfoOutput) QuotaActionCode() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringOutput { return v.QuotaActionCode }).(pulumi.StringOutput)
}

func (o ApplicationInfoOutput) QuotaCategory() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringPtrOutput { return v.QuotaCategory }).(pulumi.StringPtrOutput)
}

func (o ApplicationInfoOutput) QuotaDescription() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringOutput { return v.QuotaDescription }).(pulumi.StringOutput)
}

func (o ApplicationInfoOutput) QuotaName() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringOutput { return v.QuotaName }).(pulumi.StringOutput)
}

func (o ApplicationInfoOutput) QuotaUnit() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringOutput { return v.QuotaUnit }).(pulumi.StringOutput)
}

func (o ApplicationInfoOutput) Reason() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringOutput { return v.Reason }).(pulumi.StringOutput)
}

func (o ApplicationInfoOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationInfo) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type ApplicationInfoArrayOutput struct{ *pulumi.OutputState }

func (ApplicationInfoArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationInfo)(nil)).Elem()
}

func (o ApplicationInfoArrayOutput) ToApplicationInfoArrayOutput() ApplicationInfoArrayOutput {
	return o
}

func (o ApplicationInfoArrayOutput) ToApplicationInfoArrayOutputWithContext(ctx context.Context) ApplicationInfoArrayOutput {
	return o
}

func (o ApplicationInfoArrayOutput) Index(i pulumi.IntInput) ApplicationInfoOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplicationInfo {
		return vs[0].([]*ApplicationInfo)[vs[1].(int)]
	}).(ApplicationInfoOutput)
}

type ApplicationInfoMapOutput struct{ *pulumi.OutputState }

func (ApplicationInfoMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationInfo)(nil)).Elem()
}

func (o ApplicationInfoMapOutput) ToApplicationInfoMapOutput() ApplicationInfoMapOutput {
	return o
}

func (o ApplicationInfoMapOutput) ToApplicationInfoMapOutputWithContext(ctx context.Context) ApplicationInfoMapOutput {
	return o
}

func (o ApplicationInfoMapOutput) MapIndex(k pulumi.StringInput) ApplicationInfoOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplicationInfo {
		return vs[0].(map[string]*ApplicationInfo)[vs[1].(string)]
	}).(ApplicationInfoOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationInfoInput)(nil)).Elem(), &ApplicationInfo{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationInfoArrayInput)(nil)).Elem(), ApplicationInfoArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationInfoMapInput)(nil)).Elem(), ApplicationInfoMap{})
	pulumi.RegisterOutputType(ApplicationInfoOutput{})
	pulumi.RegisterOutputType(ApplicationInfoArrayOutput{})
	pulumi.RegisterOutputType(ApplicationInfoMapOutput{})
}
