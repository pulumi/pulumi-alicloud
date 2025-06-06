// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opensearch

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type AppGroupOrder struct {
	// Whether to renew automatically. It only takes effect when the parameter paymentType takes the value `Subscription`.
	AutoRenew *bool `pulumi:"autoRenew"`
	// Order cycle. The minimum value is not less than 0.
	Duration *int `pulumi:"duration"`
	// Order cycle unit. Valid values: `Year` and `Month`.
	PricingCycle *string `pulumi:"pricingCycle"`
}

// AppGroupOrderInput is an input type that accepts AppGroupOrderArgs and AppGroupOrderOutput values.
// You can construct a concrete instance of `AppGroupOrderInput` via:
//
//	AppGroupOrderArgs{...}
type AppGroupOrderInput interface {
	pulumi.Input

	ToAppGroupOrderOutput() AppGroupOrderOutput
	ToAppGroupOrderOutputWithContext(context.Context) AppGroupOrderOutput
}

type AppGroupOrderArgs struct {
	// Whether to renew automatically. It only takes effect when the parameter paymentType takes the value `Subscription`.
	AutoRenew pulumi.BoolPtrInput `pulumi:"autoRenew"`
	// Order cycle. The minimum value is not less than 0.
	Duration pulumi.IntPtrInput `pulumi:"duration"`
	// Order cycle unit. Valid values: `Year` and `Month`.
	PricingCycle pulumi.StringPtrInput `pulumi:"pricingCycle"`
}

func (AppGroupOrderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*AppGroupOrder)(nil)).Elem()
}

func (i AppGroupOrderArgs) ToAppGroupOrderOutput() AppGroupOrderOutput {
	return i.ToAppGroupOrderOutputWithContext(context.Background())
}

func (i AppGroupOrderArgs) ToAppGroupOrderOutputWithContext(ctx context.Context) AppGroupOrderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppGroupOrderOutput)
}

// AppGroupOrderArrayInput is an input type that accepts AppGroupOrderArray and AppGroupOrderArrayOutput values.
// You can construct a concrete instance of `AppGroupOrderArrayInput` via:
//
//	AppGroupOrderArray{ AppGroupOrderArgs{...} }
type AppGroupOrderArrayInput interface {
	pulumi.Input

	ToAppGroupOrderArrayOutput() AppGroupOrderArrayOutput
	ToAppGroupOrderArrayOutputWithContext(context.Context) AppGroupOrderArrayOutput
}

type AppGroupOrderArray []AppGroupOrderInput

func (AppGroupOrderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AppGroupOrder)(nil)).Elem()
}

func (i AppGroupOrderArray) ToAppGroupOrderArrayOutput() AppGroupOrderArrayOutput {
	return i.ToAppGroupOrderArrayOutputWithContext(context.Background())
}

func (i AppGroupOrderArray) ToAppGroupOrderArrayOutputWithContext(ctx context.Context) AppGroupOrderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppGroupOrderArrayOutput)
}

type AppGroupOrderOutput struct{ *pulumi.OutputState }

func (AppGroupOrderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AppGroupOrder)(nil)).Elem()
}

func (o AppGroupOrderOutput) ToAppGroupOrderOutput() AppGroupOrderOutput {
	return o
}

func (o AppGroupOrderOutput) ToAppGroupOrderOutputWithContext(ctx context.Context) AppGroupOrderOutput {
	return o
}

// Whether to renew automatically. It only takes effect when the parameter paymentType takes the value `Subscription`.
func (o AppGroupOrderOutput) AutoRenew() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v AppGroupOrder) *bool { return v.AutoRenew }).(pulumi.BoolPtrOutput)
}

// Order cycle. The minimum value is not less than 0.
func (o AppGroupOrderOutput) Duration() pulumi.IntPtrOutput {
	return o.ApplyT(func(v AppGroupOrder) *int { return v.Duration }).(pulumi.IntPtrOutput)
}

// Order cycle unit. Valid values: `Year` and `Month`.
func (o AppGroupOrderOutput) PricingCycle() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AppGroupOrder) *string { return v.PricingCycle }).(pulumi.StringPtrOutput)
}

type AppGroupOrderArrayOutput struct{ *pulumi.OutputState }

func (AppGroupOrderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AppGroupOrder)(nil)).Elem()
}

func (o AppGroupOrderArrayOutput) ToAppGroupOrderArrayOutput() AppGroupOrderArrayOutput {
	return o
}

func (o AppGroupOrderArrayOutput) ToAppGroupOrderArrayOutputWithContext(ctx context.Context) AppGroupOrderArrayOutput {
	return o
}

func (o AppGroupOrderArrayOutput) Index(i pulumi.IntInput) AppGroupOrderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AppGroupOrder {
		return vs[0].([]AppGroupOrder)[vs[1].(int)]
	}).(AppGroupOrderOutput)
}

type AppGroupQuota struct {
	// Computing resources. Unit: LCU.
	ComputeResource int `pulumi:"computeResource"`
	// Storage Size. Unit: GB.
	DocSize int `pulumi:"docSize"`
	// Search request. Unit: times/second.
	Qps *int `pulumi:"qps"`
	// Specification. Valid values:
	// * `opensearch.share.junior`: Entry-level.
	// * `opensearch.share.common`: Shared universal.
	// * `opensearch.share.compute`: Shared computing.
	// * `opensearch.share.storage`: Shared storage type.
	// * `opensearch.private.common`: Exclusive universal type.
	// * `opensearch.private.compute`: Exclusive computing type.
	// * `opensearch.private.storage`: Exclusive storage type
	Spec string `pulumi:"spec"`
}

// AppGroupQuotaInput is an input type that accepts AppGroupQuotaArgs and AppGroupQuotaOutput values.
// You can construct a concrete instance of `AppGroupQuotaInput` via:
//
//	AppGroupQuotaArgs{...}
type AppGroupQuotaInput interface {
	pulumi.Input

	ToAppGroupQuotaOutput() AppGroupQuotaOutput
	ToAppGroupQuotaOutputWithContext(context.Context) AppGroupQuotaOutput
}

type AppGroupQuotaArgs struct {
	// Computing resources. Unit: LCU.
	ComputeResource pulumi.IntInput `pulumi:"computeResource"`
	// Storage Size. Unit: GB.
	DocSize pulumi.IntInput `pulumi:"docSize"`
	// Search request. Unit: times/second.
	Qps pulumi.IntPtrInput `pulumi:"qps"`
	// Specification. Valid values:
	// * `opensearch.share.junior`: Entry-level.
	// * `opensearch.share.common`: Shared universal.
	// * `opensearch.share.compute`: Shared computing.
	// * `opensearch.share.storage`: Shared storage type.
	// * `opensearch.private.common`: Exclusive universal type.
	// * `opensearch.private.compute`: Exclusive computing type.
	// * `opensearch.private.storage`: Exclusive storage type
	Spec pulumi.StringInput `pulumi:"spec"`
}

func (AppGroupQuotaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*AppGroupQuota)(nil)).Elem()
}

func (i AppGroupQuotaArgs) ToAppGroupQuotaOutput() AppGroupQuotaOutput {
	return i.ToAppGroupQuotaOutputWithContext(context.Background())
}

func (i AppGroupQuotaArgs) ToAppGroupQuotaOutputWithContext(ctx context.Context) AppGroupQuotaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppGroupQuotaOutput)
}

func (i AppGroupQuotaArgs) ToAppGroupQuotaPtrOutput() AppGroupQuotaPtrOutput {
	return i.ToAppGroupQuotaPtrOutputWithContext(context.Background())
}

func (i AppGroupQuotaArgs) ToAppGroupQuotaPtrOutputWithContext(ctx context.Context) AppGroupQuotaPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppGroupQuotaOutput).ToAppGroupQuotaPtrOutputWithContext(ctx)
}

// AppGroupQuotaPtrInput is an input type that accepts AppGroupQuotaArgs, AppGroupQuotaPtr and AppGroupQuotaPtrOutput values.
// You can construct a concrete instance of `AppGroupQuotaPtrInput` via:
//
//	        AppGroupQuotaArgs{...}
//
//	or:
//
//	        nil
type AppGroupQuotaPtrInput interface {
	pulumi.Input

	ToAppGroupQuotaPtrOutput() AppGroupQuotaPtrOutput
	ToAppGroupQuotaPtrOutputWithContext(context.Context) AppGroupQuotaPtrOutput
}

type appGroupQuotaPtrType AppGroupQuotaArgs

func AppGroupQuotaPtr(v *AppGroupQuotaArgs) AppGroupQuotaPtrInput {
	return (*appGroupQuotaPtrType)(v)
}

func (*appGroupQuotaPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AppGroupQuota)(nil)).Elem()
}

func (i *appGroupQuotaPtrType) ToAppGroupQuotaPtrOutput() AppGroupQuotaPtrOutput {
	return i.ToAppGroupQuotaPtrOutputWithContext(context.Background())
}

func (i *appGroupQuotaPtrType) ToAppGroupQuotaPtrOutputWithContext(ctx context.Context) AppGroupQuotaPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppGroupQuotaPtrOutput)
}

type AppGroupQuotaOutput struct{ *pulumi.OutputState }

func (AppGroupQuotaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AppGroupQuota)(nil)).Elem()
}

func (o AppGroupQuotaOutput) ToAppGroupQuotaOutput() AppGroupQuotaOutput {
	return o
}

func (o AppGroupQuotaOutput) ToAppGroupQuotaOutputWithContext(ctx context.Context) AppGroupQuotaOutput {
	return o
}

func (o AppGroupQuotaOutput) ToAppGroupQuotaPtrOutput() AppGroupQuotaPtrOutput {
	return o.ToAppGroupQuotaPtrOutputWithContext(context.Background())
}

func (o AppGroupQuotaOutput) ToAppGroupQuotaPtrOutputWithContext(ctx context.Context) AppGroupQuotaPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v AppGroupQuota) *AppGroupQuota {
		return &v
	}).(AppGroupQuotaPtrOutput)
}

// Computing resources. Unit: LCU.
func (o AppGroupQuotaOutput) ComputeResource() pulumi.IntOutput {
	return o.ApplyT(func(v AppGroupQuota) int { return v.ComputeResource }).(pulumi.IntOutput)
}

// Storage Size. Unit: GB.
func (o AppGroupQuotaOutput) DocSize() pulumi.IntOutput {
	return o.ApplyT(func(v AppGroupQuota) int { return v.DocSize }).(pulumi.IntOutput)
}

// Search request. Unit: times/second.
func (o AppGroupQuotaOutput) Qps() pulumi.IntPtrOutput {
	return o.ApplyT(func(v AppGroupQuota) *int { return v.Qps }).(pulumi.IntPtrOutput)
}

// Specification. Valid values:
// * `opensearch.share.junior`: Entry-level.
// * `opensearch.share.common`: Shared universal.
// * `opensearch.share.compute`: Shared computing.
// * `opensearch.share.storage`: Shared storage type.
// * `opensearch.private.common`: Exclusive universal type.
// * `opensearch.private.compute`: Exclusive computing type.
// * `opensearch.private.storage`: Exclusive storage type
func (o AppGroupQuotaOutput) Spec() pulumi.StringOutput {
	return o.ApplyT(func(v AppGroupQuota) string { return v.Spec }).(pulumi.StringOutput)
}

type AppGroupQuotaPtrOutput struct{ *pulumi.OutputState }

func (AppGroupQuotaPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppGroupQuota)(nil)).Elem()
}

func (o AppGroupQuotaPtrOutput) ToAppGroupQuotaPtrOutput() AppGroupQuotaPtrOutput {
	return o
}

func (o AppGroupQuotaPtrOutput) ToAppGroupQuotaPtrOutputWithContext(ctx context.Context) AppGroupQuotaPtrOutput {
	return o
}

func (o AppGroupQuotaPtrOutput) Elem() AppGroupQuotaOutput {
	return o.ApplyT(func(v *AppGroupQuota) AppGroupQuota {
		if v != nil {
			return *v
		}
		var ret AppGroupQuota
		return ret
	}).(AppGroupQuotaOutput)
}

// Computing resources. Unit: LCU.
func (o AppGroupQuotaPtrOutput) ComputeResource() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AppGroupQuota) *int {
		if v == nil {
			return nil
		}
		return &v.ComputeResource
	}).(pulumi.IntPtrOutput)
}

// Storage Size. Unit: GB.
func (o AppGroupQuotaPtrOutput) DocSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AppGroupQuota) *int {
		if v == nil {
			return nil
		}
		return &v.DocSize
	}).(pulumi.IntPtrOutput)
}

// Search request. Unit: times/second.
func (o AppGroupQuotaPtrOutput) Qps() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AppGroupQuota) *int {
		if v == nil {
			return nil
		}
		return v.Qps
	}).(pulumi.IntPtrOutput)
}

// Specification. Valid values:
// * `opensearch.share.junior`: Entry-level.
// * `opensearch.share.common`: Shared universal.
// * `opensearch.share.compute`: Shared computing.
// * `opensearch.share.storage`: Shared storage type.
// * `opensearch.private.common`: Exclusive universal type.
// * `opensearch.private.compute`: Exclusive computing type.
// * `opensearch.private.storage`: Exclusive storage type
func (o AppGroupQuotaPtrOutput) Spec() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppGroupQuota) *string {
		if v == nil {
			return nil
		}
		return &v.Spec
	}).(pulumi.StringPtrOutput)
}

type GetAppGroupsGroup struct {
	// The ID of the App Group.
	AppGroupId string `pulumi:"appGroupId"`
	// Application Group Name.
	AppGroupName string `pulumi:"appGroupName"`
	// Billing model. Valid values:`computeResource` and `qps`.
	ChargeWay int `pulumi:"chargeWay"`
	// The commodity code.
	CommodityCode string `pulumi:"commodityCode"`
	// The time of creation.
	CreateTime int `pulumi:"createTime"`
	// The version of Application Group Name.
	CurrentVersion string `pulumi:"currentVersion"`
	// The description of the resource.
	Description string `pulumi:"description"`
	// Domain name.
	Domain string `pulumi:"domain"`
	// Expiration Time.
	ExpireOn string `pulumi:"expireOn"`
	// Coarse deployment ID.
	FirstRankAlgoDeploymentId int `pulumi:"firstRankAlgoDeploymentId"`
	// Whether the quota status is under approval. Valid status:
	HasPendingQuotaReviewTask int    `pulumi:"hasPendingQuotaReviewTask"`
	Id                        string `pulumi:"id"`
	// The Instance ID.
	InstanceId string `pulumi:"instanceId"`
	// Locked state. Valid status: `Unlock`,`LockByExpiration`,`ManualLock`.
	LockMode string `pulumi:"lockMode"`
	// Instance is automatically locked after expiration.
	LockedByExpiration int `pulumi:"lockedByExpiration"`
	// The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
	PaymentType string `pulumi:"paymentType"`
	// Refine deployment ID in deployment.
	PendingSecondRankAlgoDeploymentId int `pulumi:"pendingSecondRankAlgoDeploymentId"`
	// Unfinished order number.
	ProcessingOrderId string `pulumi:"processingOrderId"`
	// Whether the production is completed. Valid values:
	Produced int `pulumi:"produced"`
	// The Project ID.
	ProjectId string `pulumi:"projectId"`
	// Quota information.
	Quotas []GetAppGroupsGroupQuota `pulumi:"quotas"`
	// The Resource Group ID.
	ResourceGroupId string `pulumi:"resourceGroupId"`
	// Refine deployment ID.
	SecondRankAlgoDeploymentId int `pulumi:"secondRankAlgoDeploymentId"`
	// The status of the resource. Valid values: `producing`,`reviewPending`,`configPending`,`normal`,`frozen`.
	Status string `pulumi:"status"`
	// The Switched time.
	SwitchedTime int `pulumi:"switchedTime"`
	// Application type. Valid Values: `standard`, `enhanced`.
	Type string `pulumi:"type"`
}

// GetAppGroupsGroupInput is an input type that accepts GetAppGroupsGroupArgs and GetAppGroupsGroupOutput values.
// You can construct a concrete instance of `GetAppGroupsGroupInput` via:
//
//	GetAppGroupsGroupArgs{...}
type GetAppGroupsGroupInput interface {
	pulumi.Input

	ToGetAppGroupsGroupOutput() GetAppGroupsGroupOutput
	ToGetAppGroupsGroupOutputWithContext(context.Context) GetAppGroupsGroupOutput
}

type GetAppGroupsGroupArgs struct {
	// The ID of the App Group.
	AppGroupId pulumi.StringInput `pulumi:"appGroupId"`
	// Application Group Name.
	AppGroupName pulumi.StringInput `pulumi:"appGroupName"`
	// Billing model. Valid values:`computeResource` and `qps`.
	ChargeWay pulumi.IntInput `pulumi:"chargeWay"`
	// The commodity code.
	CommodityCode pulumi.StringInput `pulumi:"commodityCode"`
	// The time of creation.
	CreateTime pulumi.IntInput `pulumi:"createTime"`
	// The version of Application Group Name.
	CurrentVersion pulumi.StringInput `pulumi:"currentVersion"`
	// The description of the resource.
	Description pulumi.StringInput `pulumi:"description"`
	// Domain name.
	Domain pulumi.StringInput `pulumi:"domain"`
	// Expiration Time.
	ExpireOn pulumi.StringInput `pulumi:"expireOn"`
	// Coarse deployment ID.
	FirstRankAlgoDeploymentId pulumi.IntInput `pulumi:"firstRankAlgoDeploymentId"`
	// Whether the quota status is under approval. Valid status:
	HasPendingQuotaReviewTask pulumi.IntInput    `pulumi:"hasPendingQuotaReviewTask"`
	Id                        pulumi.StringInput `pulumi:"id"`
	// The Instance ID.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// Locked state. Valid status: `Unlock`,`LockByExpiration`,`ManualLock`.
	LockMode pulumi.StringInput `pulumi:"lockMode"`
	// Instance is automatically locked after expiration.
	LockedByExpiration pulumi.IntInput `pulumi:"lockedByExpiration"`
	// The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
	PaymentType pulumi.StringInput `pulumi:"paymentType"`
	// Refine deployment ID in deployment.
	PendingSecondRankAlgoDeploymentId pulumi.IntInput `pulumi:"pendingSecondRankAlgoDeploymentId"`
	// Unfinished order number.
	ProcessingOrderId pulumi.StringInput `pulumi:"processingOrderId"`
	// Whether the production is completed. Valid values:
	Produced pulumi.IntInput `pulumi:"produced"`
	// The Project ID.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// Quota information.
	Quotas GetAppGroupsGroupQuotaArrayInput `pulumi:"quotas"`
	// The Resource Group ID.
	ResourceGroupId pulumi.StringInput `pulumi:"resourceGroupId"`
	// Refine deployment ID.
	SecondRankAlgoDeploymentId pulumi.IntInput `pulumi:"secondRankAlgoDeploymentId"`
	// The status of the resource. Valid values: `producing`,`reviewPending`,`configPending`,`normal`,`frozen`.
	Status pulumi.StringInput `pulumi:"status"`
	// The Switched time.
	SwitchedTime pulumi.IntInput `pulumi:"switchedTime"`
	// Application type. Valid Values: `standard`, `enhanced`.
	Type pulumi.StringInput `pulumi:"type"`
}

func (GetAppGroupsGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppGroupsGroup)(nil)).Elem()
}

func (i GetAppGroupsGroupArgs) ToGetAppGroupsGroupOutput() GetAppGroupsGroupOutput {
	return i.ToGetAppGroupsGroupOutputWithContext(context.Background())
}

func (i GetAppGroupsGroupArgs) ToGetAppGroupsGroupOutputWithContext(ctx context.Context) GetAppGroupsGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAppGroupsGroupOutput)
}

// GetAppGroupsGroupArrayInput is an input type that accepts GetAppGroupsGroupArray and GetAppGroupsGroupArrayOutput values.
// You can construct a concrete instance of `GetAppGroupsGroupArrayInput` via:
//
//	GetAppGroupsGroupArray{ GetAppGroupsGroupArgs{...} }
type GetAppGroupsGroupArrayInput interface {
	pulumi.Input

	ToGetAppGroupsGroupArrayOutput() GetAppGroupsGroupArrayOutput
	ToGetAppGroupsGroupArrayOutputWithContext(context.Context) GetAppGroupsGroupArrayOutput
}

type GetAppGroupsGroupArray []GetAppGroupsGroupInput

func (GetAppGroupsGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAppGroupsGroup)(nil)).Elem()
}

func (i GetAppGroupsGroupArray) ToGetAppGroupsGroupArrayOutput() GetAppGroupsGroupArrayOutput {
	return i.ToGetAppGroupsGroupArrayOutputWithContext(context.Background())
}

func (i GetAppGroupsGroupArray) ToGetAppGroupsGroupArrayOutputWithContext(ctx context.Context) GetAppGroupsGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAppGroupsGroupArrayOutput)
}

type GetAppGroupsGroupOutput struct{ *pulumi.OutputState }

func (GetAppGroupsGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppGroupsGroup)(nil)).Elem()
}

func (o GetAppGroupsGroupOutput) ToGetAppGroupsGroupOutput() GetAppGroupsGroupOutput {
	return o
}

func (o GetAppGroupsGroupOutput) ToGetAppGroupsGroupOutputWithContext(ctx context.Context) GetAppGroupsGroupOutput {
	return o
}

// The ID of the App Group.
func (o GetAppGroupsGroupOutput) AppGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.AppGroupId }).(pulumi.StringOutput)
}

// Application Group Name.
func (o GetAppGroupsGroupOutput) AppGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.AppGroupName }).(pulumi.StringOutput)
}

// Billing model. Valid values:`computeResource` and `qps`.
func (o GetAppGroupsGroupOutput) ChargeWay() pulumi.IntOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) int { return v.ChargeWay }).(pulumi.IntOutput)
}

// The commodity code.
func (o GetAppGroupsGroupOutput) CommodityCode() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.CommodityCode }).(pulumi.StringOutput)
}

// The time of creation.
func (o GetAppGroupsGroupOutput) CreateTime() pulumi.IntOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) int { return v.CreateTime }).(pulumi.IntOutput)
}

// The version of Application Group Name.
func (o GetAppGroupsGroupOutput) CurrentVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.CurrentVersion }).(pulumi.StringOutput)
}

// The description of the resource.
func (o GetAppGroupsGroupOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.Description }).(pulumi.StringOutput)
}

// Domain name.
func (o GetAppGroupsGroupOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.Domain }).(pulumi.StringOutput)
}

// Expiration Time.
func (o GetAppGroupsGroupOutput) ExpireOn() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.ExpireOn }).(pulumi.StringOutput)
}

// Coarse deployment ID.
func (o GetAppGroupsGroupOutput) FirstRankAlgoDeploymentId() pulumi.IntOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) int { return v.FirstRankAlgoDeploymentId }).(pulumi.IntOutput)
}

// Whether the quota status is under approval. Valid status:
func (o GetAppGroupsGroupOutput) HasPendingQuotaReviewTask() pulumi.IntOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) int { return v.HasPendingQuotaReviewTask }).(pulumi.IntOutput)
}

func (o GetAppGroupsGroupOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.Id }).(pulumi.StringOutput)
}

// The Instance ID.
func (o GetAppGroupsGroupOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.InstanceId }).(pulumi.StringOutput)
}

// Locked state. Valid status: `Unlock`,`LockByExpiration`,`ManualLock`.
func (o GetAppGroupsGroupOutput) LockMode() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.LockMode }).(pulumi.StringOutput)
}

// Instance is automatically locked after expiration.
func (o GetAppGroupsGroupOutput) LockedByExpiration() pulumi.IntOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) int { return v.LockedByExpiration }).(pulumi.IntOutput)
}

// The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
func (o GetAppGroupsGroupOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.PaymentType }).(pulumi.StringOutput)
}

// Refine deployment ID in deployment.
func (o GetAppGroupsGroupOutput) PendingSecondRankAlgoDeploymentId() pulumi.IntOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) int { return v.PendingSecondRankAlgoDeploymentId }).(pulumi.IntOutput)
}

// Unfinished order number.
func (o GetAppGroupsGroupOutput) ProcessingOrderId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.ProcessingOrderId }).(pulumi.StringOutput)
}

// Whether the production is completed. Valid values:
func (o GetAppGroupsGroupOutput) Produced() pulumi.IntOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) int { return v.Produced }).(pulumi.IntOutput)
}

// The Project ID.
func (o GetAppGroupsGroupOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Quota information.
func (o GetAppGroupsGroupOutput) Quotas() GetAppGroupsGroupQuotaArrayOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) []GetAppGroupsGroupQuota { return v.Quotas }).(GetAppGroupsGroupQuotaArrayOutput)
}

// The Resource Group ID.
func (o GetAppGroupsGroupOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// Refine deployment ID.
func (o GetAppGroupsGroupOutput) SecondRankAlgoDeploymentId() pulumi.IntOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) int { return v.SecondRankAlgoDeploymentId }).(pulumi.IntOutput)
}

// The status of the resource. Valid values: `producing`,`reviewPending`,`configPending`,`normal`,`frozen`.
func (o GetAppGroupsGroupOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.Status }).(pulumi.StringOutput)
}

// The Switched time.
func (o GetAppGroupsGroupOutput) SwitchedTime() pulumi.IntOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) int { return v.SwitchedTime }).(pulumi.IntOutput)
}

// Application type. Valid Values: `standard`, `enhanced`.
func (o GetAppGroupsGroupOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroup) string { return v.Type }).(pulumi.StringOutput)
}

type GetAppGroupsGroupArrayOutput struct{ *pulumi.OutputState }

func (GetAppGroupsGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAppGroupsGroup)(nil)).Elem()
}

func (o GetAppGroupsGroupArrayOutput) ToGetAppGroupsGroupArrayOutput() GetAppGroupsGroupArrayOutput {
	return o
}

func (o GetAppGroupsGroupArrayOutput) ToGetAppGroupsGroupArrayOutputWithContext(ctx context.Context) GetAppGroupsGroupArrayOutput {
	return o
}

func (o GetAppGroupsGroupArrayOutput) Index(i pulumi.IntInput) GetAppGroupsGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetAppGroupsGroup {
		return vs[0].([]GetAppGroupsGroup)[vs[1].(int)]
	}).(GetAppGroupsGroupOutput)
}

type GetAppGroupsGroupQuota struct {
	// Computing resources. Unit: LCU.
	ComputeResource string `pulumi:"computeResource"`
	// Storage Size. Unit: GB.
	DocSize string `pulumi:"docSize"`
	// Specification. Valid values:
	// * `opensearch.share.junior`: Entry-level.
	// * `opensearch.share.common`: Shared universal.
	// * `opensearch.share.compute`: Shared computing.
	// * `opensearch.share.storage`: Shared storage type.
	// * `opensearch.private.common`: Exclusive universal type.
	// * `opensearch.private.compute`: Exclusive computing type.
	// * `opensearch.private.storage`: Exclusive storage type
	Spec string `pulumi:"spec"`
}

// GetAppGroupsGroupQuotaInput is an input type that accepts GetAppGroupsGroupQuotaArgs and GetAppGroupsGroupQuotaOutput values.
// You can construct a concrete instance of `GetAppGroupsGroupQuotaInput` via:
//
//	GetAppGroupsGroupQuotaArgs{...}
type GetAppGroupsGroupQuotaInput interface {
	pulumi.Input

	ToGetAppGroupsGroupQuotaOutput() GetAppGroupsGroupQuotaOutput
	ToGetAppGroupsGroupQuotaOutputWithContext(context.Context) GetAppGroupsGroupQuotaOutput
}

type GetAppGroupsGroupQuotaArgs struct {
	// Computing resources. Unit: LCU.
	ComputeResource pulumi.StringInput `pulumi:"computeResource"`
	// Storage Size. Unit: GB.
	DocSize pulumi.StringInput `pulumi:"docSize"`
	// Specification. Valid values:
	// * `opensearch.share.junior`: Entry-level.
	// * `opensearch.share.common`: Shared universal.
	// * `opensearch.share.compute`: Shared computing.
	// * `opensearch.share.storage`: Shared storage type.
	// * `opensearch.private.common`: Exclusive universal type.
	// * `opensearch.private.compute`: Exclusive computing type.
	// * `opensearch.private.storage`: Exclusive storage type
	Spec pulumi.StringInput `pulumi:"spec"`
}

func (GetAppGroupsGroupQuotaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppGroupsGroupQuota)(nil)).Elem()
}

func (i GetAppGroupsGroupQuotaArgs) ToGetAppGroupsGroupQuotaOutput() GetAppGroupsGroupQuotaOutput {
	return i.ToGetAppGroupsGroupQuotaOutputWithContext(context.Background())
}

func (i GetAppGroupsGroupQuotaArgs) ToGetAppGroupsGroupQuotaOutputWithContext(ctx context.Context) GetAppGroupsGroupQuotaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAppGroupsGroupQuotaOutput)
}

// GetAppGroupsGroupQuotaArrayInput is an input type that accepts GetAppGroupsGroupQuotaArray and GetAppGroupsGroupQuotaArrayOutput values.
// You can construct a concrete instance of `GetAppGroupsGroupQuotaArrayInput` via:
//
//	GetAppGroupsGroupQuotaArray{ GetAppGroupsGroupQuotaArgs{...} }
type GetAppGroupsGroupQuotaArrayInput interface {
	pulumi.Input

	ToGetAppGroupsGroupQuotaArrayOutput() GetAppGroupsGroupQuotaArrayOutput
	ToGetAppGroupsGroupQuotaArrayOutputWithContext(context.Context) GetAppGroupsGroupQuotaArrayOutput
}

type GetAppGroupsGroupQuotaArray []GetAppGroupsGroupQuotaInput

func (GetAppGroupsGroupQuotaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAppGroupsGroupQuota)(nil)).Elem()
}

func (i GetAppGroupsGroupQuotaArray) ToGetAppGroupsGroupQuotaArrayOutput() GetAppGroupsGroupQuotaArrayOutput {
	return i.ToGetAppGroupsGroupQuotaArrayOutputWithContext(context.Background())
}

func (i GetAppGroupsGroupQuotaArray) ToGetAppGroupsGroupQuotaArrayOutputWithContext(ctx context.Context) GetAppGroupsGroupQuotaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAppGroupsGroupQuotaArrayOutput)
}

type GetAppGroupsGroupQuotaOutput struct{ *pulumi.OutputState }

func (GetAppGroupsGroupQuotaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppGroupsGroupQuota)(nil)).Elem()
}

func (o GetAppGroupsGroupQuotaOutput) ToGetAppGroupsGroupQuotaOutput() GetAppGroupsGroupQuotaOutput {
	return o
}

func (o GetAppGroupsGroupQuotaOutput) ToGetAppGroupsGroupQuotaOutputWithContext(ctx context.Context) GetAppGroupsGroupQuotaOutput {
	return o
}

// Computing resources. Unit: LCU.
func (o GetAppGroupsGroupQuotaOutput) ComputeResource() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroupQuota) string { return v.ComputeResource }).(pulumi.StringOutput)
}

// Storage Size. Unit: GB.
func (o GetAppGroupsGroupQuotaOutput) DocSize() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroupQuota) string { return v.DocSize }).(pulumi.StringOutput)
}

// Specification. Valid values:
// * `opensearch.share.junior`: Entry-level.
// * `opensearch.share.common`: Shared universal.
// * `opensearch.share.compute`: Shared computing.
// * `opensearch.share.storage`: Shared storage type.
// * `opensearch.private.common`: Exclusive universal type.
// * `opensearch.private.compute`: Exclusive computing type.
// * `opensearch.private.storage`: Exclusive storage type
func (o GetAppGroupsGroupQuotaOutput) Spec() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppGroupsGroupQuota) string { return v.Spec }).(pulumi.StringOutput)
}

type GetAppGroupsGroupQuotaArrayOutput struct{ *pulumi.OutputState }

func (GetAppGroupsGroupQuotaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAppGroupsGroupQuota)(nil)).Elem()
}

func (o GetAppGroupsGroupQuotaArrayOutput) ToGetAppGroupsGroupQuotaArrayOutput() GetAppGroupsGroupQuotaArrayOutput {
	return o
}

func (o GetAppGroupsGroupQuotaArrayOutput) ToGetAppGroupsGroupQuotaArrayOutputWithContext(ctx context.Context) GetAppGroupsGroupQuotaArrayOutput {
	return o
}

func (o GetAppGroupsGroupQuotaArrayOutput) Index(i pulumi.IntInput) GetAppGroupsGroupQuotaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetAppGroupsGroupQuota {
		return vs[0].([]GetAppGroupsGroupQuota)[vs[1].(int)]
	}).(GetAppGroupsGroupQuotaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppGroupOrderInput)(nil)).Elem(), AppGroupOrderArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppGroupOrderArrayInput)(nil)).Elem(), AppGroupOrderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppGroupQuotaInput)(nil)).Elem(), AppGroupQuotaArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppGroupQuotaPtrInput)(nil)).Elem(), AppGroupQuotaArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAppGroupsGroupInput)(nil)).Elem(), GetAppGroupsGroupArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAppGroupsGroupArrayInput)(nil)).Elem(), GetAppGroupsGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAppGroupsGroupQuotaInput)(nil)).Elem(), GetAppGroupsGroupQuotaArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAppGroupsGroupQuotaArrayInput)(nil)).Elem(), GetAppGroupsGroupQuotaArray{})
	pulumi.RegisterOutputType(AppGroupOrderOutput{})
	pulumi.RegisterOutputType(AppGroupOrderArrayOutput{})
	pulumi.RegisterOutputType(AppGroupQuotaOutput{})
	pulumi.RegisterOutputType(AppGroupQuotaPtrOutput{})
	pulumi.RegisterOutputType(GetAppGroupsGroupOutput{})
	pulumi.RegisterOutputType(GetAppGroupsGroupArrayOutput{})
	pulumi.RegisterOutputType(GetAppGroupsGroupQuotaOutput{})
	pulumi.RegisterOutputType(GetAppGroupsGroupQuotaArrayOutput{})
}
