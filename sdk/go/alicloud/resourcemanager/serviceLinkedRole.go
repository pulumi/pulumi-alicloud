// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Resource Manager Service Linked Role.
//
// For information about Resource Manager Service Linked Role and how to use it, see [What is Service Linked Role.](https://www.alibabacloud.com/help/en/doc-detail/171226.htm).
//
// > **NOTE:** Available since v1.157.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := resourcemanager.NewServiceLinkedRole(ctx, "default", &resourcemanager.ServiceLinkedRoleArgs{
//				ServiceName: pulumi.String("ops.elasticsearch.aliyuncs.com"),
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
// Resource Manager Service Linked Role can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:resourcemanager/serviceLinkedRole:ServiceLinkedRole default <service_name>:<role_name>
// ```
type ServiceLinkedRole struct {
	pulumi.CustomResourceState

	// The Alibaba Cloud Resource Name (ARN) of the role.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
	CustomSuffix pulumi.StringPtrOutput `pulumi:"customSuffix"`
	// The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the role.
	RoleId pulumi.StringOutput `pulumi:"roleId"`
	// The name of the role.
	RoleName pulumi.StringOutput `pulumi:"roleName"`
	// The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
}

// NewServiceLinkedRole registers a new resource with the given unique name, arguments, and options.
func NewServiceLinkedRole(ctx *pulumi.Context,
	name string, args *ServiceLinkedRoleArgs, opts ...pulumi.ResourceOption) (*ServiceLinkedRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceLinkedRole
	err := ctx.RegisterResource("alicloud:resourcemanager/serviceLinkedRole:ServiceLinkedRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceLinkedRole gets an existing ServiceLinkedRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceLinkedRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceLinkedRoleState, opts ...pulumi.ResourceOption) (*ServiceLinkedRole, error) {
	var resource ServiceLinkedRole
	err := ctx.ReadResource("alicloud:resourcemanager/serviceLinkedRole:ServiceLinkedRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceLinkedRole resources.
type serviceLinkedRoleState struct {
	// The Alibaba Cloud Resource Name (ARN) of the role.
	Arn *string `pulumi:"arn"`
	// The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
	CustomSuffix *string `pulumi:"customSuffix"`
	// The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
	Description *string `pulumi:"description"`
	// The ID of the role.
	RoleId *string `pulumi:"roleId"`
	// The name of the role.
	RoleName *string `pulumi:"roleName"`
	// The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
	ServiceName *string `pulumi:"serviceName"`
}

type ServiceLinkedRoleState struct {
	// The Alibaba Cloud Resource Name (ARN) of the role.
	Arn pulumi.StringPtrInput
	// The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
	CustomSuffix pulumi.StringPtrInput
	// The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
	Description pulumi.StringPtrInput
	// The ID of the role.
	RoleId pulumi.StringPtrInput
	// The name of the role.
	RoleName pulumi.StringPtrInput
	// The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
	ServiceName pulumi.StringPtrInput
}

func (ServiceLinkedRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceLinkedRoleState)(nil)).Elem()
}

type serviceLinkedRoleArgs struct {
	// The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
	CustomSuffix *string `pulumi:"customSuffix"`
	// The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
	Description *string `pulumi:"description"`
	// The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
	ServiceName string `pulumi:"serviceName"`
}

// The set of arguments for constructing a ServiceLinkedRole resource.
type ServiceLinkedRoleArgs struct {
	// The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
	CustomSuffix pulumi.StringPtrInput
	// The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
	Description pulumi.StringPtrInput
	// The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
	ServiceName pulumi.StringInput
}

func (ServiceLinkedRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceLinkedRoleArgs)(nil)).Elem()
}

type ServiceLinkedRoleInput interface {
	pulumi.Input

	ToServiceLinkedRoleOutput() ServiceLinkedRoleOutput
	ToServiceLinkedRoleOutputWithContext(ctx context.Context) ServiceLinkedRoleOutput
}

func (*ServiceLinkedRole) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceLinkedRole)(nil)).Elem()
}

func (i *ServiceLinkedRole) ToServiceLinkedRoleOutput() ServiceLinkedRoleOutput {
	return i.ToServiceLinkedRoleOutputWithContext(context.Background())
}

func (i *ServiceLinkedRole) ToServiceLinkedRoleOutputWithContext(ctx context.Context) ServiceLinkedRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLinkedRoleOutput)
}

// ServiceLinkedRoleArrayInput is an input type that accepts ServiceLinkedRoleArray and ServiceLinkedRoleArrayOutput values.
// You can construct a concrete instance of `ServiceLinkedRoleArrayInput` via:
//
//	ServiceLinkedRoleArray{ ServiceLinkedRoleArgs{...} }
type ServiceLinkedRoleArrayInput interface {
	pulumi.Input

	ToServiceLinkedRoleArrayOutput() ServiceLinkedRoleArrayOutput
	ToServiceLinkedRoleArrayOutputWithContext(context.Context) ServiceLinkedRoleArrayOutput
}

type ServiceLinkedRoleArray []ServiceLinkedRoleInput

func (ServiceLinkedRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceLinkedRole)(nil)).Elem()
}

func (i ServiceLinkedRoleArray) ToServiceLinkedRoleArrayOutput() ServiceLinkedRoleArrayOutput {
	return i.ToServiceLinkedRoleArrayOutputWithContext(context.Background())
}

func (i ServiceLinkedRoleArray) ToServiceLinkedRoleArrayOutputWithContext(ctx context.Context) ServiceLinkedRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLinkedRoleArrayOutput)
}

// ServiceLinkedRoleMapInput is an input type that accepts ServiceLinkedRoleMap and ServiceLinkedRoleMapOutput values.
// You can construct a concrete instance of `ServiceLinkedRoleMapInput` via:
//
//	ServiceLinkedRoleMap{ "key": ServiceLinkedRoleArgs{...} }
type ServiceLinkedRoleMapInput interface {
	pulumi.Input

	ToServiceLinkedRoleMapOutput() ServiceLinkedRoleMapOutput
	ToServiceLinkedRoleMapOutputWithContext(context.Context) ServiceLinkedRoleMapOutput
}

type ServiceLinkedRoleMap map[string]ServiceLinkedRoleInput

func (ServiceLinkedRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceLinkedRole)(nil)).Elem()
}

func (i ServiceLinkedRoleMap) ToServiceLinkedRoleMapOutput() ServiceLinkedRoleMapOutput {
	return i.ToServiceLinkedRoleMapOutputWithContext(context.Background())
}

func (i ServiceLinkedRoleMap) ToServiceLinkedRoleMapOutputWithContext(ctx context.Context) ServiceLinkedRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLinkedRoleMapOutput)
}

type ServiceLinkedRoleOutput struct{ *pulumi.OutputState }

func (ServiceLinkedRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceLinkedRole)(nil)).Elem()
}

func (o ServiceLinkedRoleOutput) ToServiceLinkedRoleOutput() ServiceLinkedRoleOutput {
	return o
}

func (o ServiceLinkedRoleOutput) ToServiceLinkedRoleOutputWithContext(ctx context.Context) ServiceLinkedRoleOutput {
	return o
}

// The Alibaba Cloud Resource Name (ARN) of the role.
func (o ServiceLinkedRoleOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
func (o ServiceLinkedRoleOutput) CustomSuffix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringPtrOutput { return v.CustomSuffix }).(pulumi.StringPtrOutput)
}

// The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
func (o ServiceLinkedRoleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ID of the role.
func (o ServiceLinkedRoleOutput) RoleId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringOutput { return v.RoleId }).(pulumi.StringOutput)
}

// The name of the role.
func (o ServiceLinkedRoleOutput) RoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringOutput { return v.RoleName }).(pulumi.StringOutput)
}

// The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
func (o ServiceLinkedRoleOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

type ServiceLinkedRoleArrayOutput struct{ *pulumi.OutputState }

func (ServiceLinkedRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceLinkedRole)(nil)).Elem()
}

func (o ServiceLinkedRoleArrayOutput) ToServiceLinkedRoleArrayOutput() ServiceLinkedRoleArrayOutput {
	return o
}

func (o ServiceLinkedRoleArrayOutput) ToServiceLinkedRoleArrayOutputWithContext(ctx context.Context) ServiceLinkedRoleArrayOutput {
	return o
}

func (o ServiceLinkedRoleArrayOutput) Index(i pulumi.IntInput) ServiceLinkedRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceLinkedRole {
		return vs[0].([]*ServiceLinkedRole)[vs[1].(int)]
	}).(ServiceLinkedRoleOutput)
}

type ServiceLinkedRoleMapOutput struct{ *pulumi.OutputState }

func (ServiceLinkedRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceLinkedRole)(nil)).Elem()
}

func (o ServiceLinkedRoleMapOutput) ToServiceLinkedRoleMapOutput() ServiceLinkedRoleMapOutput {
	return o
}

func (o ServiceLinkedRoleMapOutput) ToServiceLinkedRoleMapOutputWithContext(ctx context.Context) ServiceLinkedRoleMapOutput {
	return o
}

func (o ServiceLinkedRoleMapOutput) MapIndex(k pulumi.StringInput) ServiceLinkedRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceLinkedRole {
		return vs[0].(map[string]*ServiceLinkedRole)[vs[1].(string)]
	}).(ServiceLinkedRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceLinkedRoleInput)(nil)).Elem(), &ServiceLinkedRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceLinkedRoleArrayInput)(nil)).Elem(), ServiceLinkedRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceLinkedRoleMapInput)(nil)).Elem(), ServiceLinkedRoleMap{})
	pulumi.RegisterOutputType(ServiceLinkedRoleOutput{})
	pulumi.RegisterOutputType(ServiceLinkedRoleArrayOutput{})
	pulumi.RegisterOutputType(ServiceLinkedRoleMapOutput{})
}
