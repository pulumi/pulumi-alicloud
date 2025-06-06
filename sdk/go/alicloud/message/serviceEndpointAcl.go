// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package message

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Message Service Endpoint Acl resource.
//
// For information about Message Service Endpoint Acl and how to use it, see [What is Endpoint Acl](https://www.alibabacloud.com/help/en/mns/developer-reference/api-mns-open-2022-01-19-authorizeendpointacl).
//
// > **NOTE:** Available since v1.243.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/message"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := message.NewServiceEndpoint(ctx, "default", &message.ServiceEndpointArgs{
//				EndpointEnabled: pulumi.Bool(true),
//				EndpointType:    pulumi.String("public"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = message.NewServiceEndpointAcl(ctx, "default", &message.ServiceEndpointAclArgs{
//				Cidr:         pulumi.String("192.168.1.1/23"),
//				EndpointType: _default.ID(),
//				AclStrategy:  pulumi.String("allow"),
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
// Message Service Endpoint Acl can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:message/serviceEndpointAcl:ServiceEndpointAcl example <endpoint_type>:<acl_strategy>:<cidr>
// ```
type ServiceEndpointAcl struct {
	pulumi.CustomResourceState

	// The ACL policy. Valid value:
	// - allow: indicates that the current endpoint allows access from the corresponding CIDR block. (Only allow is supported)
	AclStrategy pulumi.StringOutput `pulumi:"aclStrategy"`
	Cidr        pulumi.StringOutput `pulumi:"cidr"`
	// Access point type. Value:
	// - public: indicates a public access point. (Currently only public is supported)
	EndpointType pulumi.StringOutput `pulumi:"endpointType"`
}

// NewServiceEndpointAcl registers a new resource with the given unique name, arguments, and options.
func NewServiceEndpointAcl(ctx *pulumi.Context,
	name string, args *ServiceEndpointAclArgs, opts ...pulumi.ResourceOption) (*ServiceEndpointAcl, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AclStrategy == nil {
		return nil, errors.New("invalid value for required argument 'AclStrategy'")
	}
	if args.Cidr == nil {
		return nil, errors.New("invalid value for required argument 'Cidr'")
	}
	if args.EndpointType == nil {
		return nil, errors.New("invalid value for required argument 'EndpointType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceEndpointAcl
	err := ctx.RegisterResource("alicloud:message/serviceEndpointAcl:ServiceEndpointAcl", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceEndpointAcl gets an existing ServiceEndpointAcl resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceEndpointAcl(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceEndpointAclState, opts ...pulumi.ResourceOption) (*ServiceEndpointAcl, error) {
	var resource ServiceEndpointAcl
	err := ctx.ReadResource("alicloud:message/serviceEndpointAcl:ServiceEndpointAcl", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceEndpointAcl resources.
type serviceEndpointAclState struct {
	// The ACL policy. Valid value:
	// - allow: indicates that the current endpoint allows access from the corresponding CIDR block. (Only allow is supported)
	AclStrategy *string `pulumi:"aclStrategy"`
	Cidr        *string `pulumi:"cidr"`
	// Access point type. Value:
	// - public: indicates a public access point. (Currently only public is supported)
	EndpointType *string `pulumi:"endpointType"`
}

type ServiceEndpointAclState struct {
	// The ACL policy. Valid value:
	// - allow: indicates that the current endpoint allows access from the corresponding CIDR block. (Only allow is supported)
	AclStrategy pulumi.StringPtrInput
	Cidr        pulumi.StringPtrInput
	// Access point type. Value:
	// - public: indicates a public access point. (Currently only public is supported)
	EndpointType pulumi.StringPtrInput
}

func (ServiceEndpointAclState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceEndpointAclState)(nil)).Elem()
}

type serviceEndpointAclArgs struct {
	// The ACL policy. Valid value:
	// - allow: indicates that the current endpoint allows access from the corresponding CIDR block. (Only allow is supported)
	AclStrategy string `pulumi:"aclStrategy"`
	Cidr        string `pulumi:"cidr"`
	// Access point type. Value:
	// - public: indicates a public access point. (Currently only public is supported)
	EndpointType string `pulumi:"endpointType"`
}

// The set of arguments for constructing a ServiceEndpointAcl resource.
type ServiceEndpointAclArgs struct {
	// The ACL policy. Valid value:
	// - allow: indicates that the current endpoint allows access from the corresponding CIDR block. (Only allow is supported)
	AclStrategy pulumi.StringInput
	Cidr        pulumi.StringInput
	// Access point type. Value:
	// - public: indicates a public access point. (Currently only public is supported)
	EndpointType pulumi.StringInput
}

func (ServiceEndpointAclArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceEndpointAclArgs)(nil)).Elem()
}

type ServiceEndpointAclInput interface {
	pulumi.Input

	ToServiceEndpointAclOutput() ServiceEndpointAclOutput
	ToServiceEndpointAclOutputWithContext(ctx context.Context) ServiceEndpointAclOutput
}

func (*ServiceEndpointAcl) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceEndpointAcl)(nil)).Elem()
}

func (i *ServiceEndpointAcl) ToServiceEndpointAclOutput() ServiceEndpointAclOutput {
	return i.ToServiceEndpointAclOutputWithContext(context.Background())
}

func (i *ServiceEndpointAcl) ToServiceEndpointAclOutputWithContext(ctx context.Context) ServiceEndpointAclOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceEndpointAclOutput)
}

// ServiceEndpointAclArrayInput is an input type that accepts ServiceEndpointAclArray and ServiceEndpointAclArrayOutput values.
// You can construct a concrete instance of `ServiceEndpointAclArrayInput` via:
//
//	ServiceEndpointAclArray{ ServiceEndpointAclArgs{...} }
type ServiceEndpointAclArrayInput interface {
	pulumi.Input

	ToServiceEndpointAclArrayOutput() ServiceEndpointAclArrayOutput
	ToServiceEndpointAclArrayOutputWithContext(context.Context) ServiceEndpointAclArrayOutput
}

type ServiceEndpointAclArray []ServiceEndpointAclInput

func (ServiceEndpointAclArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceEndpointAcl)(nil)).Elem()
}

func (i ServiceEndpointAclArray) ToServiceEndpointAclArrayOutput() ServiceEndpointAclArrayOutput {
	return i.ToServiceEndpointAclArrayOutputWithContext(context.Background())
}

func (i ServiceEndpointAclArray) ToServiceEndpointAclArrayOutputWithContext(ctx context.Context) ServiceEndpointAclArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceEndpointAclArrayOutput)
}

// ServiceEndpointAclMapInput is an input type that accepts ServiceEndpointAclMap and ServiceEndpointAclMapOutput values.
// You can construct a concrete instance of `ServiceEndpointAclMapInput` via:
//
//	ServiceEndpointAclMap{ "key": ServiceEndpointAclArgs{...} }
type ServiceEndpointAclMapInput interface {
	pulumi.Input

	ToServiceEndpointAclMapOutput() ServiceEndpointAclMapOutput
	ToServiceEndpointAclMapOutputWithContext(context.Context) ServiceEndpointAclMapOutput
}

type ServiceEndpointAclMap map[string]ServiceEndpointAclInput

func (ServiceEndpointAclMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceEndpointAcl)(nil)).Elem()
}

func (i ServiceEndpointAclMap) ToServiceEndpointAclMapOutput() ServiceEndpointAclMapOutput {
	return i.ToServiceEndpointAclMapOutputWithContext(context.Background())
}

func (i ServiceEndpointAclMap) ToServiceEndpointAclMapOutputWithContext(ctx context.Context) ServiceEndpointAclMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceEndpointAclMapOutput)
}

type ServiceEndpointAclOutput struct{ *pulumi.OutputState }

func (ServiceEndpointAclOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceEndpointAcl)(nil)).Elem()
}

func (o ServiceEndpointAclOutput) ToServiceEndpointAclOutput() ServiceEndpointAclOutput {
	return o
}

func (o ServiceEndpointAclOutput) ToServiceEndpointAclOutputWithContext(ctx context.Context) ServiceEndpointAclOutput {
	return o
}

// The ACL policy. Valid value:
// - allow: indicates that the current endpoint allows access from the corresponding CIDR block. (Only allow is supported)
func (o ServiceEndpointAclOutput) AclStrategy() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceEndpointAcl) pulumi.StringOutput { return v.AclStrategy }).(pulumi.StringOutput)
}

func (o ServiceEndpointAclOutput) Cidr() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceEndpointAcl) pulumi.StringOutput { return v.Cidr }).(pulumi.StringOutput)
}

// Access point type. Value:
// - public: indicates a public access point. (Currently only public is supported)
func (o ServiceEndpointAclOutput) EndpointType() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceEndpointAcl) pulumi.StringOutput { return v.EndpointType }).(pulumi.StringOutput)
}

type ServiceEndpointAclArrayOutput struct{ *pulumi.OutputState }

func (ServiceEndpointAclArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceEndpointAcl)(nil)).Elem()
}

func (o ServiceEndpointAclArrayOutput) ToServiceEndpointAclArrayOutput() ServiceEndpointAclArrayOutput {
	return o
}

func (o ServiceEndpointAclArrayOutput) ToServiceEndpointAclArrayOutputWithContext(ctx context.Context) ServiceEndpointAclArrayOutput {
	return o
}

func (o ServiceEndpointAclArrayOutput) Index(i pulumi.IntInput) ServiceEndpointAclOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceEndpointAcl {
		return vs[0].([]*ServiceEndpointAcl)[vs[1].(int)]
	}).(ServiceEndpointAclOutput)
}

type ServiceEndpointAclMapOutput struct{ *pulumi.OutputState }

func (ServiceEndpointAclMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceEndpointAcl)(nil)).Elem()
}

func (o ServiceEndpointAclMapOutput) ToServiceEndpointAclMapOutput() ServiceEndpointAclMapOutput {
	return o
}

func (o ServiceEndpointAclMapOutput) ToServiceEndpointAclMapOutputWithContext(ctx context.Context) ServiceEndpointAclMapOutput {
	return o
}

func (o ServiceEndpointAclMapOutput) MapIndex(k pulumi.StringInput) ServiceEndpointAclOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceEndpointAcl {
		return vs[0].(map[string]*ServiceEndpointAcl)[vs[1].(string)]
	}).(ServiceEndpointAclOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceEndpointAclInput)(nil)).Elem(), &ServiceEndpointAcl{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceEndpointAclArrayInput)(nil)).Elem(), ServiceEndpointAclArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceEndpointAclMapInput)(nil)).Elem(), ServiceEndpointAclMap{})
	pulumi.RegisterOutputType(ServiceEndpointAclOutput{})
	pulumi.RegisterOutputType(ServiceEndpointAclArrayOutput{})
	pulumi.RegisterOutputType(ServiceEndpointAclMapOutput{})
}
