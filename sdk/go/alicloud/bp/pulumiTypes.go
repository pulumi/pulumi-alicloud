// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bp

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type StudioApplicationInstance struct {
	// The id of the instance.
	Id *string `pulumi:"id"`
	// The name of the instance.
	NodeName *string `pulumi:"nodeName"`
	// The type of the instance.
	NodeType *string `pulumi:"nodeType"`
}

// StudioApplicationInstanceInput is an input type that accepts StudioApplicationInstanceArgs and StudioApplicationInstanceOutput values.
// You can construct a concrete instance of `StudioApplicationInstanceInput` via:
//
//	StudioApplicationInstanceArgs{...}
type StudioApplicationInstanceInput interface {
	pulumi.Input

	ToStudioApplicationInstanceOutput() StudioApplicationInstanceOutput
	ToStudioApplicationInstanceOutputWithContext(context.Context) StudioApplicationInstanceOutput
}

type StudioApplicationInstanceArgs struct {
	// The id of the instance.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The name of the instance.
	NodeName pulumi.StringPtrInput `pulumi:"nodeName"`
	// The type of the instance.
	NodeType pulumi.StringPtrInput `pulumi:"nodeType"`
}

func (StudioApplicationInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*StudioApplicationInstance)(nil)).Elem()
}

func (i StudioApplicationInstanceArgs) ToStudioApplicationInstanceOutput() StudioApplicationInstanceOutput {
	return i.ToStudioApplicationInstanceOutputWithContext(context.Background())
}

func (i StudioApplicationInstanceArgs) ToStudioApplicationInstanceOutputWithContext(ctx context.Context) StudioApplicationInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StudioApplicationInstanceOutput)
}

// StudioApplicationInstanceArrayInput is an input type that accepts StudioApplicationInstanceArray and StudioApplicationInstanceArrayOutput values.
// You can construct a concrete instance of `StudioApplicationInstanceArrayInput` via:
//
//	StudioApplicationInstanceArray{ StudioApplicationInstanceArgs{...} }
type StudioApplicationInstanceArrayInput interface {
	pulumi.Input

	ToStudioApplicationInstanceArrayOutput() StudioApplicationInstanceArrayOutput
	ToStudioApplicationInstanceArrayOutputWithContext(context.Context) StudioApplicationInstanceArrayOutput
}

type StudioApplicationInstanceArray []StudioApplicationInstanceInput

func (StudioApplicationInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]StudioApplicationInstance)(nil)).Elem()
}

func (i StudioApplicationInstanceArray) ToStudioApplicationInstanceArrayOutput() StudioApplicationInstanceArrayOutput {
	return i.ToStudioApplicationInstanceArrayOutputWithContext(context.Background())
}

func (i StudioApplicationInstanceArray) ToStudioApplicationInstanceArrayOutputWithContext(ctx context.Context) StudioApplicationInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StudioApplicationInstanceArrayOutput)
}

type StudioApplicationInstanceOutput struct{ *pulumi.OutputState }

func (StudioApplicationInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*StudioApplicationInstance)(nil)).Elem()
}

func (o StudioApplicationInstanceOutput) ToStudioApplicationInstanceOutput() StudioApplicationInstanceOutput {
	return o
}

func (o StudioApplicationInstanceOutput) ToStudioApplicationInstanceOutputWithContext(ctx context.Context) StudioApplicationInstanceOutput {
	return o
}

// The id of the instance.
func (o StudioApplicationInstanceOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v StudioApplicationInstance) *string { return v.Id }).(pulumi.StringPtrOutput)
}

// The name of the instance.
func (o StudioApplicationInstanceOutput) NodeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v StudioApplicationInstance) *string { return v.NodeName }).(pulumi.StringPtrOutput)
}

// The type of the instance.
func (o StudioApplicationInstanceOutput) NodeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v StudioApplicationInstance) *string { return v.NodeType }).(pulumi.StringPtrOutput)
}

type StudioApplicationInstanceArrayOutput struct{ *pulumi.OutputState }

func (StudioApplicationInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]StudioApplicationInstance)(nil)).Elem()
}

func (o StudioApplicationInstanceArrayOutput) ToStudioApplicationInstanceArrayOutput() StudioApplicationInstanceArrayOutput {
	return o
}

func (o StudioApplicationInstanceArrayOutput) ToStudioApplicationInstanceArrayOutputWithContext(ctx context.Context) StudioApplicationInstanceArrayOutput {
	return o
}

func (o StudioApplicationInstanceArrayOutput) Index(i pulumi.IntInput) StudioApplicationInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) StudioApplicationInstance {
		return vs[0].([]StudioApplicationInstance)[vs[1].(int)]
	}).(StudioApplicationInstanceOutput)
}

type GetStudioApplicationsApplication struct {
	// The ID of the Application.
	ApplicationId string `pulumi:"applicationId"`
	// The name of the Application.
	ApplicationName string `pulumi:"applicationName"`
	// The creation time of the Application.
	CreateTime string `pulumi:"createTime"`
	// The ID of the Application.
	Id string `pulumi:"id"`
	// The image url of the Application.
	ImageUrl string `pulumi:"imageUrl"`
	// The ID of the resource group.
	ResourceGroupId string `pulumi:"resourceGroupId"`
	// The status of the Application. Valid values: `success`, `release`.
	Status string `pulumi:"status"`
	// The topo url of the Application.
	TopoUrl string `pulumi:"topoUrl"`
}

// GetStudioApplicationsApplicationInput is an input type that accepts GetStudioApplicationsApplicationArgs and GetStudioApplicationsApplicationOutput values.
// You can construct a concrete instance of `GetStudioApplicationsApplicationInput` via:
//
//	GetStudioApplicationsApplicationArgs{...}
type GetStudioApplicationsApplicationInput interface {
	pulumi.Input

	ToGetStudioApplicationsApplicationOutput() GetStudioApplicationsApplicationOutput
	ToGetStudioApplicationsApplicationOutputWithContext(context.Context) GetStudioApplicationsApplicationOutput
}

type GetStudioApplicationsApplicationArgs struct {
	// The ID of the Application.
	ApplicationId pulumi.StringInput `pulumi:"applicationId"`
	// The name of the Application.
	ApplicationName pulumi.StringInput `pulumi:"applicationName"`
	// The creation time of the Application.
	CreateTime pulumi.StringInput `pulumi:"createTime"`
	// The ID of the Application.
	Id pulumi.StringInput `pulumi:"id"`
	// The image url of the Application.
	ImageUrl pulumi.StringInput `pulumi:"imageUrl"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringInput `pulumi:"resourceGroupId"`
	// The status of the Application. Valid values: `success`, `release`.
	Status pulumi.StringInput `pulumi:"status"`
	// The topo url of the Application.
	TopoUrl pulumi.StringInput `pulumi:"topoUrl"`
}

func (GetStudioApplicationsApplicationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStudioApplicationsApplication)(nil)).Elem()
}

func (i GetStudioApplicationsApplicationArgs) ToGetStudioApplicationsApplicationOutput() GetStudioApplicationsApplicationOutput {
	return i.ToGetStudioApplicationsApplicationOutputWithContext(context.Background())
}

func (i GetStudioApplicationsApplicationArgs) ToGetStudioApplicationsApplicationOutputWithContext(ctx context.Context) GetStudioApplicationsApplicationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetStudioApplicationsApplicationOutput)
}

// GetStudioApplicationsApplicationArrayInput is an input type that accepts GetStudioApplicationsApplicationArray and GetStudioApplicationsApplicationArrayOutput values.
// You can construct a concrete instance of `GetStudioApplicationsApplicationArrayInput` via:
//
//	GetStudioApplicationsApplicationArray{ GetStudioApplicationsApplicationArgs{...} }
type GetStudioApplicationsApplicationArrayInput interface {
	pulumi.Input

	ToGetStudioApplicationsApplicationArrayOutput() GetStudioApplicationsApplicationArrayOutput
	ToGetStudioApplicationsApplicationArrayOutputWithContext(context.Context) GetStudioApplicationsApplicationArrayOutput
}

type GetStudioApplicationsApplicationArray []GetStudioApplicationsApplicationInput

func (GetStudioApplicationsApplicationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetStudioApplicationsApplication)(nil)).Elem()
}

func (i GetStudioApplicationsApplicationArray) ToGetStudioApplicationsApplicationArrayOutput() GetStudioApplicationsApplicationArrayOutput {
	return i.ToGetStudioApplicationsApplicationArrayOutputWithContext(context.Background())
}

func (i GetStudioApplicationsApplicationArray) ToGetStudioApplicationsApplicationArrayOutputWithContext(ctx context.Context) GetStudioApplicationsApplicationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetStudioApplicationsApplicationArrayOutput)
}

type GetStudioApplicationsApplicationOutput struct{ *pulumi.OutputState }

func (GetStudioApplicationsApplicationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStudioApplicationsApplication)(nil)).Elem()
}

func (o GetStudioApplicationsApplicationOutput) ToGetStudioApplicationsApplicationOutput() GetStudioApplicationsApplicationOutput {
	return o
}

func (o GetStudioApplicationsApplicationOutput) ToGetStudioApplicationsApplicationOutputWithContext(ctx context.Context) GetStudioApplicationsApplicationOutput {
	return o
}

// The ID of the Application.
func (o GetStudioApplicationsApplicationOutput) ApplicationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetStudioApplicationsApplication) string { return v.ApplicationId }).(pulumi.StringOutput)
}

// The name of the Application.
func (o GetStudioApplicationsApplicationOutput) ApplicationName() pulumi.StringOutput {
	return o.ApplyT(func(v GetStudioApplicationsApplication) string { return v.ApplicationName }).(pulumi.StringOutput)
}

// The creation time of the Application.
func (o GetStudioApplicationsApplicationOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetStudioApplicationsApplication) string { return v.CreateTime }).(pulumi.StringOutput)
}

// The ID of the Application.
func (o GetStudioApplicationsApplicationOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStudioApplicationsApplication) string { return v.Id }).(pulumi.StringOutput)
}

// The image url of the Application.
func (o GetStudioApplicationsApplicationOutput) ImageUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetStudioApplicationsApplication) string { return v.ImageUrl }).(pulumi.StringOutput)
}

// The ID of the resource group.
func (o GetStudioApplicationsApplicationOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v GetStudioApplicationsApplication) string { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The status of the Application. Valid values: `success`, `release`.
func (o GetStudioApplicationsApplicationOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetStudioApplicationsApplication) string { return v.Status }).(pulumi.StringOutput)
}

// The topo url of the Application.
func (o GetStudioApplicationsApplicationOutput) TopoUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetStudioApplicationsApplication) string { return v.TopoUrl }).(pulumi.StringOutput)
}

type GetStudioApplicationsApplicationArrayOutput struct{ *pulumi.OutputState }

func (GetStudioApplicationsApplicationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetStudioApplicationsApplication)(nil)).Elem()
}

func (o GetStudioApplicationsApplicationArrayOutput) ToGetStudioApplicationsApplicationArrayOutput() GetStudioApplicationsApplicationArrayOutput {
	return o
}

func (o GetStudioApplicationsApplicationArrayOutput) ToGetStudioApplicationsApplicationArrayOutputWithContext(ctx context.Context) GetStudioApplicationsApplicationArrayOutput {
	return o
}

func (o GetStudioApplicationsApplicationArrayOutput) Index(i pulumi.IntInput) GetStudioApplicationsApplicationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetStudioApplicationsApplication {
		return vs[0].([]GetStudioApplicationsApplication)[vs[1].(int)]
	}).(GetStudioApplicationsApplicationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StudioApplicationInstanceInput)(nil)).Elem(), StudioApplicationInstanceArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*StudioApplicationInstanceArrayInput)(nil)).Elem(), StudioApplicationInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetStudioApplicationsApplicationInput)(nil)).Elem(), GetStudioApplicationsApplicationArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetStudioApplicationsApplicationArrayInput)(nil)).Elem(), GetStudioApplicationsApplicationArray{})
	pulumi.RegisterOutputType(StudioApplicationInstanceOutput{})
	pulumi.RegisterOutputType(StudioApplicationInstanceArrayOutput{})
	pulumi.RegisterOutputType(GetStudioApplicationsApplicationOutput{})
	pulumi.RegisterOutputType(GetStudioApplicationsApplicationArrayOutput{})
}
