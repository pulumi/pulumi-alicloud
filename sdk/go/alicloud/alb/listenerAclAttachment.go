// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package alb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ALB Listener Acl Attachment resource. Associating ACL to listening.
//
// For information about ALB Listener Acl Attachment and how to use it, see [What is Listener Acl Attachment](https://www.alibabacloud.com/help/en/slb/application-load-balancer/developer-reference/api-alb-2020-06-16-associateaclswithlistener).
//
// > **NOTE:** Available since v1.163.0.
//
// > **NOTE:** You can associate at most three ACLs with a listener.
//
// > **NOTE:** You can only configure either a whitelist or a blacklist for listener, not at the same time.
//
// ## Import
//
// ALB Listener Acl Attachment can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:alb/listenerAclAttachment:ListenerAclAttachment example <listener_id>:<acl_id>
// ```
type ListenerAclAttachment struct {
	pulumi.CustomResourceState

	// The ID list of the access policy group bound by the listener.
	AclId pulumi.StringOutput `pulumi:"aclId"`
	// Access control type:
	// - **White**: only requests from IP addresses or address segments in the selected access control list are forwarded. The whitelist applies to scenarios where only specific IP addresses are allowed to access. There are certain business risks in setting up a whitelist. Once the whitelist is set, only the IP addresses in the whitelist can access the load balancer listener. If whitelist access is enabled but no IP addresses are added to the access policy group, the server load balancer listener forwards all requests.
	// - **Black**: All requests from IP addresses or address segments in the selected access control list are not forwarded. Blacklists are applicable to scenarios where only certain IP addresses are restricted. If blacklist access is enabled and no IP is added to the access policy group, the server load balancer listener forwards all requests.
	AclType pulumi.StringOutput `pulumi:"aclType"`
	// Listener instance ID.
	ListenerId pulumi.StringOutput `pulumi:"listenerId"`
	// Listener Status.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewListenerAclAttachment registers a new resource with the given unique name, arguments, and options.
func NewListenerAclAttachment(ctx *pulumi.Context,
	name string, args *ListenerAclAttachmentArgs, opts ...pulumi.ResourceOption) (*ListenerAclAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AclId == nil {
		return nil, errors.New("invalid value for required argument 'AclId'")
	}
	if args.AclType == nil {
		return nil, errors.New("invalid value for required argument 'AclType'")
	}
	if args.ListenerId == nil {
		return nil, errors.New("invalid value for required argument 'ListenerId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ListenerAclAttachment
	err := ctx.RegisterResource("alicloud:alb/listenerAclAttachment:ListenerAclAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetListenerAclAttachment gets an existing ListenerAclAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetListenerAclAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ListenerAclAttachmentState, opts ...pulumi.ResourceOption) (*ListenerAclAttachment, error) {
	var resource ListenerAclAttachment
	err := ctx.ReadResource("alicloud:alb/listenerAclAttachment:ListenerAclAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ListenerAclAttachment resources.
type listenerAclAttachmentState struct {
	// The ID list of the access policy group bound by the listener.
	AclId *string `pulumi:"aclId"`
	// Access control type:
	// - **White**: only requests from IP addresses or address segments in the selected access control list are forwarded. The whitelist applies to scenarios where only specific IP addresses are allowed to access. There are certain business risks in setting up a whitelist. Once the whitelist is set, only the IP addresses in the whitelist can access the load balancer listener. If whitelist access is enabled but no IP addresses are added to the access policy group, the server load balancer listener forwards all requests.
	// - **Black**: All requests from IP addresses or address segments in the selected access control list are not forwarded. Blacklists are applicable to scenarios where only certain IP addresses are restricted. If blacklist access is enabled and no IP is added to the access policy group, the server load balancer listener forwards all requests.
	AclType *string `pulumi:"aclType"`
	// Listener instance ID.
	ListenerId *string `pulumi:"listenerId"`
	// Listener Status.
	Status *string `pulumi:"status"`
}

type ListenerAclAttachmentState struct {
	// The ID list of the access policy group bound by the listener.
	AclId pulumi.StringPtrInput
	// Access control type:
	// - **White**: only requests from IP addresses or address segments in the selected access control list are forwarded. The whitelist applies to scenarios where only specific IP addresses are allowed to access. There are certain business risks in setting up a whitelist. Once the whitelist is set, only the IP addresses in the whitelist can access the load balancer listener. If whitelist access is enabled but no IP addresses are added to the access policy group, the server load balancer listener forwards all requests.
	// - **Black**: All requests from IP addresses or address segments in the selected access control list are not forwarded. Blacklists are applicable to scenarios where only certain IP addresses are restricted. If blacklist access is enabled and no IP is added to the access policy group, the server load balancer listener forwards all requests.
	AclType pulumi.StringPtrInput
	// Listener instance ID.
	ListenerId pulumi.StringPtrInput
	// Listener Status.
	Status pulumi.StringPtrInput
}

func (ListenerAclAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*listenerAclAttachmentState)(nil)).Elem()
}

type listenerAclAttachmentArgs struct {
	// The ID list of the access policy group bound by the listener.
	AclId string `pulumi:"aclId"`
	// Access control type:
	// - **White**: only requests from IP addresses or address segments in the selected access control list are forwarded. The whitelist applies to scenarios where only specific IP addresses are allowed to access. There are certain business risks in setting up a whitelist. Once the whitelist is set, only the IP addresses in the whitelist can access the load balancer listener. If whitelist access is enabled but no IP addresses are added to the access policy group, the server load balancer listener forwards all requests.
	// - **Black**: All requests from IP addresses or address segments in the selected access control list are not forwarded. Blacklists are applicable to scenarios where only certain IP addresses are restricted. If blacklist access is enabled and no IP is added to the access policy group, the server load balancer listener forwards all requests.
	AclType string `pulumi:"aclType"`
	// Listener instance ID.
	ListenerId string `pulumi:"listenerId"`
}

// The set of arguments for constructing a ListenerAclAttachment resource.
type ListenerAclAttachmentArgs struct {
	// The ID list of the access policy group bound by the listener.
	AclId pulumi.StringInput
	// Access control type:
	// - **White**: only requests from IP addresses or address segments in the selected access control list are forwarded. The whitelist applies to scenarios where only specific IP addresses are allowed to access. There are certain business risks in setting up a whitelist. Once the whitelist is set, only the IP addresses in the whitelist can access the load balancer listener. If whitelist access is enabled but no IP addresses are added to the access policy group, the server load balancer listener forwards all requests.
	// - **Black**: All requests from IP addresses or address segments in the selected access control list are not forwarded. Blacklists are applicable to scenarios where only certain IP addresses are restricted. If blacklist access is enabled and no IP is added to the access policy group, the server load balancer listener forwards all requests.
	AclType pulumi.StringInput
	// Listener instance ID.
	ListenerId pulumi.StringInput
}

func (ListenerAclAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*listenerAclAttachmentArgs)(nil)).Elem()
}

type ListenerAclAttachmentInput interface {
	pulumi.Input

	ToListenerAclAttachmentOutput() ListenerAclAttachmentOutput
	ToListenerAclAttachmentOutputWithContext(ctx context.Context) ListenerAclAttachmentOutput
}

func (*ListenerAclAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**ListenerAclAttachment)(nil)).Elem()
}

func (i *ListenerAclAttachment) ToListenerAclAttachmentOutput() ListenerAclAttachmentOutput {
	return i.ToListenerAclAttachmentOutputWithContext(context.Background())
}

func (i *ListenerAclAttachment) ToListenerAclAttachmentOutputWithContext(ctx context.Context) ListenerAclAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerAclAttachmentOutput)
}

// ListenerAclAttachmentArrayInput is an input type that accepts ListenerAclAttachmentArray and ListenerAclAttachmentArrayOutput values.
// You can construct a concrete instance of `ListenerAclAttachmentArrayInput` via:
//
//	ListenerAclAttachmentArray{ ListenerAclAttachmentArgs{...} }
type ListenerAclAttachmentArrayInput interface {
	pulumi.Input

	ToListenerAclAttachmentArrayOutput() ListenerAclAttachmentArrayOutput
	ToListenerAclAttachmentArrayOutputWithContext(context.Context) ListenerAclAttachmentArrayOutput
}

type ListenerAclAttachmentArray []ListenerAclAttachmentInput

func (ListenerAclAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ListenerAclAttachment)(nil)).Elem()
}

func (i ListenerAclAttachmentArray) ToListenerAclAttachmentArrayOutput() ListenerAclAttachmentArrayOutput {
	return i.ToListenerAclAttachmentArrayOutputWithContext(context.Background())
}

func (i ListenerAclAttachmentArray) ToListenerAclAttachmentArrayOutputWithContext(ctx context.Context) ListenerAclAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerAclAttachmentArrayOutput)
}

// ListenerAclAttachmentMapInput is an input type that accepts ListenerAclAttachmentMap and ListenerAclAttachmentMapOutput values.
// You can construct a concrete instance of `ListenerAclAttachmentMapInput` via:
//
//	ListenerAclAttachmentMap{ "key": ListenerAclAttachmentArgs{...} }
type ListenerAclAttachmentMapInput interface {
	pulumi.Input

	ToListenerAclAttachmentMapOutput() ListenerAclAttachmentMapOutput
	ToListenerAclAttachmentMapOutputWithContext(context.Context) ListenerAclAttachmentMapOutput
}

type ListenerAclAttachmentMap map[string]ListenerAclAttachmentInput

func (ListenerAclAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ListenerAclAttachment)(nil)).Elem()
}

func (i ListenerAclAttachmentMap) ToListenerAclAttachmentMapOutput() ListenerAclAttachmentMapOutput {
	return i.ToListenerAclAttachmentMapOutputWithContext(context.Background())
}

func (i ListenerAclAttachmentMap) ToListenerAclAttachmentMapOutputWithContext(ctx context.Context) ListenerAclAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerAclAttachmentMapOutput)
}

type ListenerAclAttachmentOutput struct{ *pulumi.OutputState }

func (ListenerAclAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ListenerAclAttachment)(nil)).Elem()
}

func (o ListenerAclAttachmentOutput) ToListenerAclAttachmentOutput() ListenerAclAttachmentOutput {
	return o
}

func (o ListenerAclAttachmentOutput) ToListenerAclAttachmentOutputWithContext(ctx context.Context) ListenerAclAttachmentOutput {
	return o
}

// The ID list of the access policy group bound by the listener.
func (o ListenerAclAttachmentOutput) AclId() pulumi.StringOutput {
	return o.ApplyT(func(v *ListenerAclAttachment) pulumi.StringOutput { return v.AclId }).(pulumi.StringOutput)
}

// Access control type:
// - **White**: only requests from IP addresses or address segments in the selected access control list are forwarded. The whitelist applies to scenarios where only specific IP addresses are allowed to access. There are certain business risks in setting up a whitelist. Once the whitelist is set, only the IP addresses in the whitelist can access the load balancer listener. If whitelist access is enabled but no IP addresses are added to the access policy group, the server load balancer listener forwards all requests.
// - **Black**: All requests from IP addresses or address segments in the selected access control list are not forwarded. Blacklists are applicable to scenarios where only certain IP addresses are restricted. If blacklist access is enabled and no IP is added to the access policy group, the server load balancer listener forwards all requests.
func (o ListenerAclAttachmentOutput) AclType() pulumi.StringOutput {
	return o.ApplyT(func(v *ListenerAclAttachment) pulumi.StringOutput { return v.AclType }).(pulumi.StringOutput)
}

// Listener instance ID.
func (o ListenerAclAttachmentOutput) ListenerId() pulumi.StringOutput {
	return o.ApplyT(func(v *ListenerAclAttachment) pulumi.StringOutput { return v.ListenerId }).(pulumi.StringOutput)
}

// Listener Status.
func (o ListenerAclAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ListenerAclAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type ListenerAclAttachmentArrayOutput struct{ *pulumi.OutputState }

func (ListenerAclAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ListenerAclAttachment)(nil)).Elem()
}

func (o ListenerAclAttachmentArrayOutput) ToListenerAclAttachmentArrayOutput() ListenerAclAttachmentArrayOutput {
	return o
}

func (o ListenerAclAttachmentArrayOutput) ToListenerAclAttachmentArrayOutputWithContext(ctx context.Context) ListenerAclAttachmentArrayOutput {
	return o
}

func (o ListenerAclAttachmentArrayOutput) Index(i pulumi.IntInput) ListenerAclAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ListenerAclAttachment {
		return vs[0].([]*ListenerAclAttachment)[vs[1].(int)]
	}).(ListenerAclAttachmentOutput)
}

type ListenerAclAttachmentMapOutput struct{ *pulumi.OutputState }

func (ListenerAclAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ListenerAclAttachment)(nil)).Elem()
}

func (o ListenerAclAttachmentMapOutput) ToListenerAclAttachmentMapOutput() ListenerAclAttachmentMapOutput {
	return o
}

func (o ListenerAclAttachmentMapOutput) ToListenerAclAttachmentMapOutputWithContext(ctx context.Context) ListenerAclAttachmentMapOutput {
	return o
}

func (o ListenerAclAttachmentMapOutput) MapIndex(k pulumi.StringInput) ListenerAclAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ListenerAclAttachment {
		return vs[0].(map[string]*ListenerAclAttachment)[vs[1].(string)]
	}).(ListenerAclAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerAclAttachmentInput)(nil)).Elem(), &ListenerAclAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerAclAttachmentArrayInput)(nil)).Elem(), ListenerAclAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerAclAttachmentMapInput)(nil)).Elem(), ListenerAclAttachmentMap{})
	pulumi.RegisterOutputType(ListenerAclAttachmentOutput{})
	pulumi.RegisterOutputType(ListenerAclAttachmentArrayOutput{})
	pulumi.RegisterOutputType(ListenerAclAttachmentMapOutput{})
}
