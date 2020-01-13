// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ess

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// This data source provides available scaling rule resources. 
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/ess_scaling_rules.html.markdown.
func LookupScalingRules(ctx *pulumi.Context, args *GetScalingRulesArgs) (*GetScalingRulesResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["ids"] = args.Ids
		inputs["nameRegex"] = args.NameRegex
		inputs["outputFile"] = args.OutputFile
		inputs["scalingGroupId"] = args.ScalingGroupId
		inputs["type"] = args.Type
	}
	outputs, err := ctx.Invoke("alicloud:ess/getScalingRules:getScalingRules", inputs)
	if err != nil {
		return nil, err
	}
	return &GetScalingRulesResult{
		Ids: outputs["ids"],
		NameRegex: outputs["nameRegex"],
		Names: outputs["names"],
		OutputFile: outputs["outputFile"],
		Rules: outputs["rules"],
		ScalingGroupId: outputs["scalingGroupId"],
		Type: outputs["type"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getScalingRules.
type GetScalingRulesArgs struct {
	// A list of scaling rule IDs.
	Ids interface{}
	// A regex string to filter resulting scaling rules by name.
	NameRegex interface{}
	OutputFile interface{}
	// Scaling group id the scaling rules belong to.
	ScalingGroupId interface{}
	// Type of scaling rule.
	Type interface{}
}

// A collection of values returned by getScalingRules.
type GetScalingRulesResult struct {
	// A list of scaling rule ids.
	Ids interface{}
	NameRegex interface{}
	// A list of scaling rule names.
	Names interface{}
	OutputFile interface{}
	// A list of scaling rules. Each element contains the following attributes:
	Rules interface{}
	// ID of the scaling group.
	ScalingGroupId interface{}
	// Type of the scaling rule.
	Type interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}