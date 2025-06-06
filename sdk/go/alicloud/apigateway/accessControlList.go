// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Api Gateway Access Control List resource. Access control list.
//
// For information about Api Gateway Access Control List and how to use it, see [What is Access Control List](https://www.alibabacloud.com/help/en/api-gateway/developer-reference/api-cloudapi-2016-07-14-createaccesscontrollist).
//
// > **NOTE:** Available since v1.224.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/apigateway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform_example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_, err := apigateway.NewInstance(ctx, "defaultxywS8c", &apigateway.InstanceArgs{
//				InstanceName: pulumi.String(name),
//				InstanceSpec: pulumi.String("api.s1.small"),
//				HttpsPolicy:  pulumi.String("HTTPS2_TLS1_0"),
//				ZoneId:       pulumi.String("cn-hangzhou-MAZ6"),
//				PaymentType:  pulumi.String("PayAsYouGo"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = apigateway.NewAccessControlList(ctx, "default", &apigateway.AccessControlListArgs{
//				AccessControlListName: pulumi.String(name),
//				AddressIpVersion:      pulumi.String("ipv4"),
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
// Api Gateway Access Control List can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:apigateway/accessControlList:AccessControlList example <id>
// ```
type AccessControlList struct {
	pulumi.CustomResourceState

	// Access control list name.
	AccessControlListName pulumi.StringOutput `pulumi:"accessControlListName"`
	// Information list of access control policies. You can add at most 50 IP addresses or CIDR blocks to an ACL in each call. If the IP address or CIDR block that you want to add to an ACL already exists, the IP address or CIDR block is not added. The entries that you add must be CIDR blocks. See `aclEntrys` below.
	// **NOTE:** Field 'acl_entrys' has been deprecated from provider version 1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
	//
	// Deprecated: Field 'acl_entrys' has been deprecated from provider version v1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
	AclEntrys AccessControlListAclEntryArrayOutput `pulumi:"aclEntrys"`
	// The IP version. Valid values: ipv4 and ipv6.
	AddressIpVersion pulumi.StringOutput `pulumi:"addressIpVersion"`
}

// NewAccessControlList registers a new resource with the given unique name, arguments, and options.
func NewAccessControlList(ctx *pulumi.Context,
	name string, args *AccessControlListArgs, opts ...pulumi.ResourceOption) (*AccessControlList, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessControlListName == nil {
		return nil, errors.New("invalid value for required argument 'AccessControlListName'")
	}
	if args.AclEntrys != nil {
		args.AclEntrys = pulumi.ToSecret(args.AclEntrys).(AccessControlListAclEntryArrayInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"aclEntrys",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessControlList
	err := ctx.RegisterResource("alicloud:apigateway/accessControlList:AccessControlList", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessControlList gets an existing AccessControlList resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessControlList(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessControlListState, opts ...pulumi.ResourceOption) (*AccessControlList, error) {
	var resource AccessControlList
	err := ctx.ReadResource("alicloud:apigateway/accessControlList:AccessControlList", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessControlList resources.
type accessControlListState struct {
	// Access control list name.
	AccessControlListName *string `pulumi:"accessControlListName"`
	// Information list of access control policies. You can add at most 50 IP addresses or CIDR blocks to an ACL in each call. If the IP address or CIDR block that you want to add to an ACL already exists, the IP address or CIDR block is not added. The entries that you add must be CIDR blocks. See `aclEntrys` below.
	// **NOTE:** Field 'acl_entrys' has been deprecated from provider version 1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
	//
	// Deprecated: Field 'acl_entrys' has been deprecated from provider version v1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
	AclEntrys []AccessControlListAclEntry `pulumi:"aclEntrys"`
	// The IP version. Valid values: ipv4 and ipv6.
	AddressIpVersion *string `pulumi:"addressIpVersion"`
}

type AccessControlListState struct {
	// Access control list name.
	AccessControlListName pulumi.StringPtrInput
	// Information list of access control policies. You can add at most 50 IP addresses or CIDR blocks to an ACL in each call. If the IP address or CIDR block that you want to add to an ACL already exists, the IP address or CIDR block is not added. The entries that you add must be CIDR blocks. See `aclEntrys` below.
	// **NOTE:** Field 'acl_entrys' has been deprecated from provider version 1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
	//
	// Deprecated: Field 'acl_entrys' has been deprecated from provider version v1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
	AclEntrys AccessControlListAclEntryArrayInput
	// The IP version. Valid values: ipv4 and ipv6.
	AddressIpVersion pulumi.StringPtrInput
}

func (AccessControlListState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessControlListState)(nil)).Elem()
}

type accessControlListArgs struct {
	// Access control list name.
	AccessControlListName string `pulumi:"accessControlListName"`
	// Information list of access control policies. You can add at most 50 IP addresses or CIDR blocks to an ACL in each call. If the IP address or CIDR block that you want to add to an ACL already exists, the IP address or CIDR block is not added. The entries that you add must be CIDR blocks. See `aclEntrys` below.
	// **NOTE:** Field 'acl_entrys' has been deprecated from provider version 1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
	//
	// Deprecated: Field 'acl_entrys' has been deprecated from provider version v1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
	AclEntrys []AccessControlListAclEntry `pulumi:"aclEntrys"`
	// The IP version. Valid values: ipv4 and ipv6.
	AddressIpVersion *string `pulumi:"addressIpVersion"`
}

// The set of arguments for constructing a AccessControlList resource.
type AccessControlListArgs struct {
	// Access control list name.
	AccessControlListName pulumi.StringInput
	// Information list of access control policies. You can add at most 50 IP addresses or CIDR blocks to an ACL in each call. If the IP address or CIDR block that you want to add to an ACL already exists, the IP address or CIDR block is not added. The entries that you add must be CIDR blocks. See `aclEntrys` below.
	// **NOTE:** Field 'acl_entrys' has been deprecated from provider version 1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
	//
	// Deprecated: Field 'acl_entrys' has been deprecated from provider version v1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
	AclEntrys AccessControlListAclEntryArrayInput
	// The IP version. Valid values: ipv4 and ipv6.
	AddressIpVersion pulumi.StringPtrInput
}

func (AccessControlListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessControlListArgs)(nil)).Elem()
}

type AccessControlListInput interface {
	pulumi.Input

	ToAccessControlListOutput() AccessControlListOutput
	ToAccessControlListOutputWithContext(ctx context.Context) AccessControlListOutput
}

func (*AccessControlList) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessControlList)(nil)).Elem()
}

func (i *AccessControlList) ToAccessControlListOutput() AccessControlListOutput {
	return i.ToAccessControlListOutputWithContext(context.Background())
}

func (i *AccessControlList) ToAccessControlListOutputWithContext(ctx context.Context) AccessControlListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessControlListOutput)
}

// AccessControlListArrayInput is an input type that accepts AccessControlListArray and AccessControlListArrayOutput values.
// You can construct a concrete instance of `AccessControlListArrayInput` via:
//
//	AccessControlListArray{ AccessControlListArgs{...} }
type AccessControlListArrayInput interface {
	pulumi.Input

	ToAccessControlListArrayOutput() AccessControlListArrayOutput
	ToAccessControlListArrayOutputWithContext(context.Context) AccessControlListArrayOutput
}

type AccessControlListArray []AccessControlListInput

func (AccessControlListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessControlList)(nil)).Elem()
}

func (i AccessControlListArray) ToAccessControlListArrayOutput() AccessControlListArrayOutput {
	return i.ToAccessControlListArrayOutputWithContext(context.Background())
}

func (i AccessControlListArray) ToAccessControlListArrayOutputWithContext(ctx context.Context) AccessControlListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessControlListArrayOutput)
}

// AccessControlListMapInput is an input type that accepts AccessControlListMap and AccessControlListMapOutput values.
// You can construct a concrete instance of `AccessControlListMapInput` via:
//
//	AccessControlListMap{ "key": AccessControlListArgs{...} }
type AccessControlListMapInput interface {
	pulumi.Input

	ToAccessControlListMapOutput() AccessControlListMapOutput
	ToAccessControlListMapOutputWithContext(context.Context) AccessControlListMapOutput
}

type AccessControlListMap map[string]AccessControlListInput

func (AccessControlListMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessControlList)(nil)).Elem()
}

func (i AccessControlListMap) ToAccessControlListMapOutput() AccessControlListMapOutput {
	return i.ToAccessControlListMapOutputWithContext(context.Background())
}

func (i AccessControlListMap) ToAccessControlListMapOutputWithContext(ctx context.Context) AccessControlListMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessControlListMapOutput)
}

type AccessControlListOutput struct{ *pulumi.OutputState }

func (AccessControlListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessControlList)(nil)).Elem()
}

func (o AccessControlListOutput) ToAccessControlListOutput() AccessControlListOutput {
	return o
}

func (o AccessControlListOutput) ToAccessControlListOutputWithContext(ctx context.Context) AccessControlListOutput {
	return o
}

// Access control list name.
func (o AccessControlListOutput) AccessControlListName() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessControlList) pulumi.StringOutput { return v.AccessControlListName }).(pulumi.StringOutput)
}

// Information list of access control policies. You can add at most 50 IP addresses or CIDR blocks to an ACL in each call. If the IP address or CIDR block that you want to add to an ACL already exists, the IP address or CIDR block is not added. The entries that you add must be CIDR blocks. See `aclEntrys` below.
// **NOTE:** Field 'acl_entrys' has been deprecated from provider version 1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
//
// Deprecated: Field 'acl_entrys' has been deprecated from provider version v1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
func (o AccessControlListOutput) AclEntrys() AccessControlListAclEntryArrayOutput {
	return o.ApplyT(func(v *AccessControlList) AccessControlListAclEntryArrayOutput { return v.AclEntrys }).(AccessControlListAclEntryArrayOutput)
}

// The IP version. Valid values: ipv4 and ipv6.
func (o AccessControlListOutput) AddressIpVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessControlList) pulumi.StringOutput { return v.AddressIpVersion }).(pulumi.StringOutput)
}

type AccessControlListArrayOutput struct{ *pulumi.OutputState }

func (AccessControlListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessControlList)(nil)).Elem()
}

func (o AccessControlListArrayOutput) ToAccessControlListArrayOutput() AccessControlListArrayOutput {
	return o
}

func (o AccessControlListArrayOutput) ToAccessControlListArrayOutputWithContext(ctx context.Context) AccessControlListArrayOutput {
	return o
}

func (o AccessControlListArrayOutput) Index(i pulumi.IntInput) AccessControlListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessControlList {
		return vs[0].([]*AccessControlList)[vs[1].(int)]
	}).(AccessControlListOutput)
}

type AccessControlListMapOutput struct{ *pulumi.OutputState }

func (AccessControlListMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessControlList)(nil)).Elem()
}

func (o AccessControlListMapOutput) ToAccessControlListMapOutput() AccessControlListMapOutput {
	return o
}

func (o AccessControlListMapOutput) ToAccessControlListMapOutputWithContext(ctx context.Context) AccessControlListMapOutput {
	return o
}

func (o AccessControlListMapOutput) MapIndex(k pulumi.StringInput) AccessControlListOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessControlList {
		return vs[0].(map[string]*AccessControlList)[vs[1].(string)]
	}).(AccessControlListOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessControlListInput)(nil)).Elem(), &AccessControlList{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessControlListArrayInput)(nil)).Elem(), AccessControlListArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessControlListMapInput)(nil)).Elem(), AccessControlListMap{})
	pulumi.RegisterOutputType(AccessControlListOutput{})
	pulumi.RegisterOutputType(AccessControlListArrayOutput{})
	pulumi.RegisterOutputType(AccessControlListMapOutput{})
}
