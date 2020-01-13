// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ddos

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// This data source provides a list of Anti-DDoS Advanced instances in an Alibaba Cloud account according to the specified filters.
// 
// > **NOTE:** Available in 1.57.0+ .
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/ddosbgp_instances.html.markdown.
func LookupDdosBgpInstances(ctx *pulumi.Context, args *GetDdosBgpInstancesArgs) (*GetDdosBgpInstancesResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["ids"] = args.Ids
		inputs["nameRegex"] = args.NameRegex
		inputs["outputFile"] = args.OutputFile
	}
	outputs, err := ctx.Invoke("alicloud:ddos/getDdosBgpInstances:getDdosBgpInstances", inputs)
	if err != nil {
		return nil, err
	}
	return &GetDdosBgpInstancesResult{
		Ids: outputs["ids"],
		Instances: outputs["instances"],
		NameRegex: outputs["nameRegex"],
		Names: outputs["names"],
		OutputFile: outputs["outputFile"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getDdosBgpInstances.
type GetDdosBgpInstancesArgs struct {
	// A list of instance IDs.
	Ids interface{}
	// A regex string to filter results by the instance name.
	NameRegex interface{}
	OutputFile interface{}
}

// A collection of values returned by getDdosBgpInstances.
type GetDdosBgpInstancesResult struct {
	// A list of instance IDs.
	Ids interface{}
	// A list of apis. Each element contains the following attributes:
	Instances interface{}
	NameRegex interface{}
	// A list of instance names.
	Names interface{}
	OutputFile interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}