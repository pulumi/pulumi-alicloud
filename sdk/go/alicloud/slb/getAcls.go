// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package slb

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// This data source provides the acls in the region.
// 
// ## Entry Block
// 
// The entry mapping supports the following:
// 
// * `entry`   - An IP addresses or CIDR blocks.
// * `comment` - the comment of the entry.
// 
// ## Listener Block
// 
// The Listener mapping supports the following:
// 
// * `loadBalancerId` - the id of load balancer instance, the listener belongs to.
// * `frontendPort` - the listener port.
// * `protocol`      - the listener protocol (such as tcp/udp/http/https, etc).
// * `aclType`      - the type of acl (such as white/black).
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/slb_acls.html.markdown.
func LookupAcls(ctx *pulumi.Context, args *GetAclsArgs) (*GetAclsResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["ids"] = args.Ids
		inputs["nameRegex"] = args.NameRegex
		inputs["outputFile"] = args.OutputFile
		inputs["resourceGroupId"] = args.ResourceGroupId
		inputs["tags"] = args.Tags
	}
	outputs, err := ctx.Invoke("alicloud:slb/getAcls:getAcls", inputs)
	if err != nil {
		return nil, err
	}
	return &GetAclsResult{
		Acls: outputs["acls"],
		Ids: outputs["ids"],
		NameRegex: outputs["nameRegex"],
		Names: outputs["names"],
		OutputFile: outputs["outputFile"],
		ResourceGroupId: outputs["resourceGroupId"],
		Tags: outputs["tags"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getAcls.
type GetAclsArgs struct {
	// A list of acls IDs to filter results.
	Ids interface{}
	// A regex string to filter results by acl name.
	NameRegex interface{}
	OutputFile interface{}
	// The Id of resource group which acl belongs.
	ResourceGroupId interface{}
	// A mapping of tags to assign to the resource.
	Tags interface{}
}

// A collection of values returned by getAcls.
type GetAclsResult struct {
	// A list of SLB  acls. Each element contains the following attributes:
	Acls interface{}
	// A list of SLB acls IDs.
	Ids interface{}
	NameRegex interface{}
	// A list of SLB acls names.
	Names interface{}
	OutputFile interface{}
	// Resource group ID.
	ResourceGroupId interface{}
	// A mapping of tags to assign to the resource.
	Tags interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}