// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataworks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Data Works Project resource.
//
// For information about Data Works Project and how to use it, see [What is Project](https://www.alibabacloud.com/help/en/dataworks/developer-reference/api-dataworks-public-2020-05-18-createproject).
//
// > **NOTE:** Available since v1.229.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dataworks"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
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
//			_, err := random.NewInteger(ctx, "default", &random.IntegerArgs{
//				Min: 10000,
//				Max: 99999,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = dataworks.NewProject(ctx, "default", &dataworks.ProjectArgs{
//				ProjectName: pulumi.Sprintf("%v_%v", name, _default.Result),
//				ProjectMode: pulumi.Int(2),
//				Description: pulumi.Sprintf("%v_%v", name, _default.Result),
//				DisplayName: pulumi.Sprintf("%v_%v", name, _default.Result),
//				Status:      pulumi.String("0"),
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
// Data Works Project can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:dataworks/project:Project example <id>
// ```
type Project struct {
	pulumi.CustomResourceState

	// The creation time of the resource
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Description of the workspace
	Description pulumi.StringOutput `pulumi:"description"`
	// The display name of the workspace.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The mode of the workspace, with the following values:
	// - 2, indicates the simple workspace mode.
	// - 3, indicating the standard workspace mode.
	ProjectMode pulumi.IntPtrOutput `pulumi:"projectMode"`
	// Immutable Name of the workspace.
	ProjectName pulumi.StringOutput `pulumi:"projectName"`
	// The status of the resource
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewProject registers a new resource with the given unique name, arguments, and options.
func NewProject(ctx *pulumi.Context,
	name string, args *ProjectArgs, opts ...pulumi.ResourceOption) (*Project, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.ProjectName == nil {
		return nil, errors.New("invalid value for required argument 'ProjectName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Project
	err := ctx.RegisterResource("alicloud:dataworks/project:Project", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProject gets an existing Project resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectState, opts ...pulumi.ResourceOption) (*Project, error) {
	var resource Project
	err := ctx.ReadResource("alicloud:dataworks/project:Project", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Project resources.
type projectState struct {
	// The creation time of the resource
	CreateTime *string `pulumi:"createTime"`
	// Description of the workspace
	Description *string `pulumi:"description"`
	// The display name of the workspace.
	DisplayName *string `pulumi:"displayName"`
	// The mode of the workspace, with the following values:
	// - 2, indicates the simple workspace mode.
	// - 3, indicating the standard workspace mode.
	ProjectMode *int `pulumi:"projectMode"`
	// Immutable Name of the workspace.
	ProjectName *string `pulumi:"projectName"`
	// The status of the resource
	Status *string `pulumi:"status"`
}

type ProjectState struct {
	// The creation time of the resource
	CreateTime pulumi.StringPtrInput
	// Description of the workspace
	Description pulumi.StringPtrInput
	// The display name of the workspace.
	DisplayName pulumi.StringPtrInput
	// The mode of the workspace, with the following values:
	// - 2, indicates the simple workspace mode.
	// - 3, indicating the standard workspace mode.
	ProjectMode pulumi.IntPtrInput
	// Immutable Name of the workspace.
	ProjectName pulumi.StringPtrInput
	// The status of the resource
	Status pulumi.StringPtrInput
}

func (ProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectState)(nil)).Elem()
}

type projectArgs struct {
	// Description of the workspace
	Description string `pulumi:"description"`
	// The display name of the workspace.
	DisplayName string `pulumi:"displayName"`
	// The mode of the workspace, with the following values:
	// - 2, indicates the simple workspace mode.
	// - 3, indicating the standard workspace mode.
	ProjectMode *int `pulumi:"projectMode"`
	// Immutable Name of the workspace.
	ProjectName string `pulumi:"projectName"`
	// The status of the resource
	Status *string `pulumi:"status"`
}

// The set of arguments for constructing a Project resource.
type ProjectArgs struct {
	// Description of the workspace
	Description pulumi.StringInput
	// The display name of the workspace.
	DisplayName pulumi.StringInput
	// The mode of the workspace, with the following values:
	// - 2, indicates the simple workspace mode.
	// - 3, indicating the standard workspace mode.
	ProjectMode pulumi.IntPtrInput
	// Immutable Name of the workspace.
	ProjectName pulumi.StringInput
	// The status of the resource
	Status pulumi.StringPtrInput
}

func (ProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectArgs)(nil)).Elem()
}

type ProjectInput interface {
	pulumi.Input

	ToProjectOutput() ProjectOutput
	ToProjectOutputWithContext(ctx context.Context) ProjectOutput
}

func (*Project) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (i *Project) ToProjectOutput() ProjectOutput {
	return i.ToProjectOutputWithContext(context.Background())
}

func (i *Project) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectOutput)
}

// ProjectArrayInput is an input type that accepts ProjectArray and ProjectArrayOutput values.
// You can construct a concrete instance of `ProjectArrayInput` via:
//
//	ProjectArray{ ProjectArgs{...} }
type ProjectArrayInput interface {
	pulumi.Input

	ToProjectArrayOutput() ProjectArrayOutput
	ToProjectArrayOutputWithContext(context.Context) ProjectArrayOutput
}

type ProjectArray []ProjectInput

func (ProjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (i ProjectArray) ToProjectArrayOutput() ProjectArrayOutput {
	return i.ToProjectArrayOutputWithContext(context.Background())
}

func (i ProjectArray) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectArrayOutput)
}

// ProjectMapInput is an input type that accepts ProjectMap and ProjectMapOutput values.
// You can construct a concrete instance of `ProjectMapInput` via:
//
//	ProjectMap{ "key": ProjectArgs{...} }
type ProjectMapInput interface {
	pulumi.Input

	ToProjectMapOutput() ProjectMapOutput
	ToProjectMapOutputWithContext(context.Context) ProjectMapOutput
}

type ProjectMap map[string]ProjectInput

func (ProjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (i ProjectMap) ToProjectMapOutput() ProjectMapOutput {
	return i.ToProjectMapOutputWithContext(context.Background())
}

func (i ProjectMap) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectMapOutput)
}

type ProjectOutput struct{ *pulumi.OutputState }

func (ProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (o ProjectOutput) ToProjectOutput() ProjectOutput {
	return o
}

func (o ProjectOutput) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return o
}

// The creation time of the resource
func (o ProjectOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Description of the workspace
func (o ProjectOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The display name of the workspace.
func (o ProjectOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The mode of the workspace, with the following values:
// - 2, indicates the simple workspace mode.
// - 3, indicating the standard workspace mode.
func (o ProjectOutput) ProjectMode() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.IntPtrOutput { return v.ProjectMode }).(pulumi.IntPtrOutput)
}

// Immutable Name of the workspace.
func (o ProjectOutput) ProjectName() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.ProjectName }).(pulumi.StringOutput)
}

// The status of the resource
func (o ProjectOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type ProjectArrayOutput struct{ *pulumi.OutputState }

func (ProjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (o ProjectArrayOutput) ToProjectArrayOutput() ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) Index(i pulumi.IntInput) ProjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Project {
		return vs[0].([]*Project)[vs[1].(int)]
	}).(ProjectOutput)
}

type ProjectMapOutput struct{ *pulumi.OutputState }

func (ProjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (o ProjectMapOutput) ToProjectMapOutput() ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) MapIndex(k pulumi.StringInput) ProjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Project {
		return vs[0].(map[string]*Project)[vs[1].(string)]
	}).(ProjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectInput)(nil)).Elem(), &Project{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectArrayInput)(nil)).Elem(), ProjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectMapInput)(nil)).Elem(), ProjectMap{})
	pulumi.RegisterOutputType(ProjectOutput{})
	pulumi.RegisterOutputType(ProjectArrayOutput{})
	pulumi.RegisterOutputType(ProjectMapOutput{})
}
