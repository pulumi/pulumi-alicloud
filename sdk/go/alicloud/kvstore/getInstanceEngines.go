// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package kvstore

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// This data source provides the KVStore instance engines resource available info of Alibaba Cloud.
// 
// > **NOTE:** Available in v1.51.0+
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/kvstore_instance_engines.html.markdown.
func LookupInstanceEngines(ctx *pulumi.Context, args *GetInstanceEnginesArgs) (*GetInstanceEnginesResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["engine"] = args.Engine
		inputs["engineVersion"] = args.EngineVersion
		inputs["instanceChargeType"] = args.InstanceChargeType
		inputs["outputFile"] = args.OutputFile
		inputs["zoneId"] = args.ZoneId
	}
	outputs, err := ctx.Invoke("alicloud:kvstore/getInstanceEngines:getInstanceEngines", inputs)
	if err != nil {
		return nil, err
	}
	return &GetInstanceEnginesResult{
		Engine: outputs["engine"],
		EngineVersion: outputs["engineVersion"],
		InstanceChargeType: outputs["instanceChargeType"],
		InstanceEngines: outputs["instanceEngines"],
		OutputFile: outputs["outputFile"],
		ZoneId: outputs["zoneId"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getInstanceEngines.
type GetInstanceEnginesArgs struct {
	// Database type. Options are `Redis`, `Memcache`. If no value is specified, all types are returned.
	Engine interface{}
	// Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
	EngineVersion interface{}
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
	InstanceChargeType interface{}
	OutputFile interface{}
	// The Zone to launch the KVStore instance.
	ZoneId interface{}
}

// A collection of values returned by getInstanceEngines.
type GetInstanceEnginesResult struct {
	// Database type.
	Engine interface{}
	// KVStore Instance version.
	EngineVersion interface{}
	InstanceChargeType interface{}
	// A list of KVStore available instance engines. Each element contains the following attributes:
	InstanceEngines interface{}
	OutputFile interface{}
	// The Zone to launch the KVStore instance.
	ZoneId interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}