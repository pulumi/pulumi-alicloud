// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a network acl attachment resource to associate network acls to vswitches.
// 
// > **NOTE:** Available in 1.44.0+. Currently, the resource are only available in Hongkong(cn-hongkong), India(ap-south-1), and Indonesia(ap-southeast-1) regions.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/network_acl_attachment.html.markdown.
type NetworkAclAttachment struct {
	s *pulumi.ResourceState
}

// NewNetworkAclAttachment registers a new resource with the given unique name, arguments, and options.
func NewNetworkAclAttachment(ctx *pulumi.Context,
	name string, args *NetworkAclAttachmentArgs, opts ...pulumi.ResourceOpt) (*NetworkAclAttachment, error) {
	if args == nil || args.NetworkAclId == nil {
		return nil, errors.New("missing required argument 'NetworkAclId'")
	}
	if args == nil || args.Resources == nil {
		return nil, errors.New("missing required argument 'Resources'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["networkAclId"] = nil
		inputs["resources"] = nil
	} else {
		inputs["networkAclId"] = args.NetworkAclId
		inputs["resources"] = args.Resources
	}
	s, err := ctx.RegisterResource("alicloud:vpc/networkAclAttachment:NetworkAclAttachment", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &NetworkAclAttachment{s: s}, nil
}

// GetNetworkAclAttachment gets an existing NetworkAclAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkAclAttachment(ctx *pulumi.Context,
	name string, id pulumi.ID, state *NetworkAclAttachmentState, opts ...pulumi.ResourceOpt) (*NetworkAclAttachment, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["networkAclId"] = state.NetworkAclId
		inputs["resources"] = state.Resources
	}
	s, err := ctx.ReadResource("alicloud:vpc/networkAclAttachment:NetworkAclAttachment", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &NetworkAclAttachment{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *NetworkAclAttachment) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *NetworkAclAttachment) ID() pulumi.IDOutput {
	return r.s.ID()
}

// The id of the network acl, the field can't be changed.
func (r *NetworkAclAttachment) NetworkAclId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["networkAclId"])
}

// List of the resources associated with the network acl. The details see Block Resources.
func (r *NetworkAclAttachment) Resources() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["resources"])
}

// Input properties used for looking up and filtering NetworkAclAttachment resources.
type NetworkAclAttachmentState struct {
	// The id of the network acl, the field can't be changed.
	NetworkAclId interface{}
	// List of the resources associated with the network acl. The details see Block Resources.
	Resources interface{}
}

// The set of arguments for constructing a NetworkAclAttachment resource.
type NetworkAclAttachmentArgs struct {
	// The id of the network acl, the field can't be changed.
	NetworkAclId interface{}
	// List of the resources associated with the network acl. The details see Block Resources.
	Resources interface{}
}