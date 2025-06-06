// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package imm

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type GetProjectsProject struct {
	// The billing type. **Note:** This parameter is deprecated from 2021-04-01.
	BillingType string `pulumi:"billingType"`
	// The maximum number of requests that can be processed per second. **Note:** This parameter is deprecated from 2021-04-01.
	ComputeUnit int `pulumi:"computeUnit"`
	// The creation time of project.
	CreateTime string `pulumi:"createTime"`
	// The service address of project.
	Endpoint string `pulumi:"endpoint"`
	// The ID of project.
	Id string `pulumi:"id"`
	// The modification time of project.
	ModifyTime string `pulumi:"modifyTime"`
	// The name of project.
	Project string `pulumi:"project"`
	// The service role authorized to the Intelligent Media Management service to access other cloud resources.
	ServiceRole string `pulumi:"serviceRole"`
	// The type of project.
	Type string `pulumi:"type"`
}

// GetProjectsProjectInput is an input type that accepts GetProjectsProjectArgs and GetProjectsProjectOutput values.
// You can construct a concrete instance of `GetProjectsProjectInput` via:
//
//	GetProjectsProjectArgs{...}
type GetProjectsProjectInput interface {
	pulumi.Input

	ToGetProjectsProjectOutput() GetProjectsProjectOutput
	ToGetProjectsProjectOutputWithContext(context.Context) GetProjectsProjectOutput
}

type GetProjectsProjectArgs struct {
	// The billing type. **Note:** This parameter is deprecated from 2021-04-01.
	BillingType pulumi.StringInput `pulumi:"billingType"`
	// The maximum number of requests that can be processed per second. **Note:** This parameter is deprecated from 2021-04-01.
	ComputeUnit pulumi.IntInput `pulumi:"computeUnit"`
	// The creation time of project.
	CreateTime pulumi.StringInput `pulumi:"createTime"`
	// The service address of project.
	Endpoint pulumi.StringInput `pulumi:"endpoint"`
	// The ID of project.
	Id pulumi.StringInput `pulumi:"id"`
	// The modification time of project.
	ModifyTime pulumi.StringInput `pulumi:"modifyTime"`
	// The name of project.
	Project pulumi.StringInput `pulumi:"project"`
	// The service role authorized to the Intelligent Media Management service to access other cloud resources.
	ServiceRole pulumi.StringInput `pulumi:"serviceRole"`
	// The type of project.
	Type pulumi.StringInput `pulumi:"type"`
}

func (GetProjectsProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProjectsProject)(nil)).Elem()
}

func (i GetProjectsProjectArgs) ToGetProjectsProjectOutput() GetProjectsProjectOutput {
	return i.ToGetProjectsProjectOutputWithContext(context.Background())
}

func (i GetProjectsProjectArgs) ToGetProjectsProjectOutputWithContext(ctx context.Context) GetProjectsProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetProjectsProjectOutput)
}

// GetProjectsProjectArrayInput is an input type that accepts GetProjectsProjectArray and GetProjectsProjectArrayOutput values.
// You can construct a concrete instance of `GetProjectsProjectArrayInput` via:
//
//	GetProjectsProjectArray{ GetProjectsProjectArgs{...} }
type GetProjectsProjectArrayInput interface {
	pulumi.Input

	ToGetProjectsProjectArrayOutput() GetProjectsProjectArrayOutput
	ToGetProjectsProjectArrayOutputWithContext(context.Context) GetProjectsProjectArrayOutput
}

type GetProjectsProjectArray []GetProjectsProjectInput

func (GetProjectsProjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetProjectsProject)(nil)).Elem()
}

func (i GetProjectsProjectArray) ToGetProjectsProjectArrayOutput() GetProjectsProjectArrayOutput {
	return i.ToGetProjectsProjectArrayOutputWithContext(context.Background())
}

func (i GetProjectsProjectArray) ToGetProjectsProjectArrayOutputWithContext(ctx context.Context) GetProjectsProjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetProjectsProjectArrayOutput)
}

type GetProjectsProjectOutput struct{ *pulumi.OutputState }

func (GetProjectsProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProjectsProject)(nil)).Elem()
}

func (o GetProjectsProjectOutput) ToGetProjectsProjectOutput() GetProjectsProjectOutput {
	return o
}

func (o GetProjectsProjectOutput) ToGetProjectsProjectOutputWithContext(ctx context.Context) GetProjectsProjectOutput {
	return o
}

// The billing type. **Note:** This parameter is deprecated from 2021-04-01.
func (o GetProjectsProjectOutput) BillingType() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectsProject) string { return v.BillingType }).(pulumi.StringOutput)
}

// The maximum number of requests that can be processed per second. **Note:** This parameter is deprecated from 2021-04-01.
func (o GetProjectsProjectOutput) ComputeUnit() pulumi.IntOutput {
	return o.ApplyT(func(v GetProjectsProject) int { return v.ComputeUnit }).(pulumi.IntOutput)
}

// The creation time of project.
func (o GetProjectsProjectOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectsProject) string { return v.CreateTime }).(pulumi.StringOutput)
}

// The service address of project.
func (o GetProjectsProjectOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectsProject) string { return v.Endpoint }).(pulumi.StringOutput)
}

// The ID of project.
func (o GetProjectsProjectOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectsProject) string { return v.Id }).(pulumi.StringOutput)
}

// The modification time of project.
func (o GetProjectsProjectOutput) ModifyTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectsProject) string { return v.ModifyTime }).(pulumi.StringOutput)
}

// The name of project.
func (o GetProjectsProjectOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectsProject) string { return v.Project }).(pulumi.StringOutput)
}

// The service role authorized to the Intelligent Media Management service to access other cloud resources.
func (o GetProjectsProjectOutput) ServiceRole() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectsProject) string { return v.ServiceRole }).(pulumi.StringOutput)
}

// The type of project.
func (o GetProjectsProjectOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectsProject) string { return v.Type }).(pulumi.StringOutput)
}

type GetProjectsProjectArrayOutput struct{ *pulumi.OutputState }

func (GetProjectsProjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetProjectsProject)(nil)).Elem()
}

func (o GetProjectsProjectArrayOutput) ToGetProjectsProjectArrayOutput() GetProjectsProjectArrayOutput {
	return o
}

func (o GetProjectsProjectArrayOutput) ToGetProjectsProjectArrayOutputWithContext(ctx context.Context) GetProjectsProjectArrayOutput {
	return o
}

func (o GetProjectsProjectArrayOutput) Index(i pulumi.IntInput) GetProjectsProjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetProjectsProject {
		return vs[0].([]GetProjectsProject)[vs[1].(int)]
	}).(GetProjectsProjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GetProjectsProjectInput)(nil)).Elem(), GetProjectsProjectArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetProjectsProjectArrayInput)(nil)).Elem(), GetProjectsProjectArray{})
	pulumi.RegisterOutputType(GetProjectsProjectOutput{})
	pulumi.RegisterOutputType(GetProjectsProjectArrayOutput{})
}
