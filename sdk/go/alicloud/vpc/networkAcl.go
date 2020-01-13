// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a network acl resource to add network acls.
// 
// > **NOTE:** Available in 1.43.0+. Currently, the resource are only available in Hongkong(cn-hongkong), India(ap-south-1), and Indonesia(ap-southeast-1) regions.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/network_acl.html.markdown.
type NetworkAcl struct {
	s *pulumi.ResourceState
}

// NewNetworkAcl registers a new resource with the given unique name, arguments, and options.
func NewNetworkAcl(ctx *pulumi.Context,
	name string, args *NetworkAclArgs, opts ...pulumi.ResourceOpt) (*NetworkAcl, error) {
	if args == nil || args.VpcId == nil {
		return nil, errors.New("missing required argument 'VpcId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["description"] = nil
		inputs["name"] = nil
		inputs["vpcId"] = nil
	} else {
		inputs["description"] = args.Description
		inputs["name"] = args.Name
		inputs["vpcId"] = args.VpcId
	}
	s, err := ctx.RegisterResource("alicloud:vpc/networkAcl:NetworkAcl", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &NetworkAcl{s: s}, nil
}

// GetNetworkAcl gets an existing NetworkAcl resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkAcl(ctx *pulumi.Context,
	name string, id pulumi.ID, state *NetworkAclState, opts ...pulumi.ResourceOpt) (*NetworkAcl, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["description"] = state.Description
		inputs["name"] = state.Name
		inputs["vpcId"] = state.VpcId
	}
	s, err := ctx.ReadResource("alicloud:vpc/networkAcl:NetworkAcl", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &NetworkAcl{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *NetworkAcl) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *NetworkAcl) ID() pulumi.IDOutput {
	return r.s.ID()
}

// The description of the network acl instance.
func (r *NetworkAcl) Description() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["description"])
}

// The name of the network acl.
func (r *NetworkAcl) Name() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["name"])
}

// The vpcId of the network acl, the field can't be changed.
func (r *NetworkAcl) VpcId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["vpcId"])
}

// Input properties used for looking up and filtering NetworkAcl resources.
type NetworkAclState struct {
	// The description of the network acl instance.
	Description interface{}
	// The name of the network acl.
	Name interface{}
	// The vpcId of the network acl, the field can't be changed.
	VpcId interface{}
}

// The set of arguments for constructing a NetworkAcl resource.
type NetworkAclArgs struct {
	// The description of the network acl instance.
	Description interface{}
	// The name of the network acl.
	Name interface{}
	// The vpcId of the network acl, the field can't be changed.
	VpcId interface{}
}