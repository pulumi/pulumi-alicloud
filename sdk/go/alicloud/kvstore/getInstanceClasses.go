// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package kvstore

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// This data source provides the KVStore instance classes resource available info of Alibaba Cloud.
// 
// > **NOTE:** Available in v1.49.0+
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/kvstore_instance_classes.html.markdown.
func LookupInstanceClasses(ctx *pulumi.Context, args *GetInstanceClassesArgs) (*GetInstanceClassesResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["architecture"] = args.Architecture
		inputs["editionType"] = args.EditionType
		inputs["engine"] = args.Engine
		inputs["engineVersion"] = args.EngineVersion
		inputs["instanceChargeType"] = args.InstanceChargeType
		inputs["nodeType"] = args.NodeType
		inputs["outputFile"] = args.OutputFile
		inputs["packageType"] = args.PackageType
		inputs["performanceType"] = args.PerformanceType
		inputs["seriesType"] = args.SeriesType
		inputs["shardNumber"] = args.ShardNumber
		inputs["sortedBy"] = args.SortedBy
		inputs["storageType"] = args.StorageType
		inputs["zoneId"] = args.ZoneId
	}
	outputs, err := ctx.Invoke("alicloud:kvstore/getInstanceClasses:getInstanceClasses", inputs)
	if err != nil {
		return nil, err
	}
	return &GetInstanceClassesResult{
		Architecture: outputs["architecture"],
		Classes: outputs["classes"],
		EditionType: outputs["editionType"],
		Engine: outputs["engine"],
		EngineVersion: outputs["engineVersion"],
		InstanceChargeType: outputs["instanceChargeType"],
		InstanceClasses: outputs["instanceClasses"],
		NodeType: outputs["nodeType"],
		OutputFile: outputs["outputFile"],
		PackageType: outputs["packageType"],
		PerformanceType: outputs["performanceType"],
		SeriesType: outputs["seriesType"],
		ShardNumber: outputs["shardNumber"],
		SortedBy: outputs["sortedBy"],
		StorageType: outputs["storageType"],
		ZoneId: outputs["zoneId"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getInstanceClasses.
type GetInstanceClassesArgs struct {
	// The KVStore instance system architecture required by the user. Valid values: `standard`, `cluster` and `rwsplit`.
	Architecture interface{}
	// The KVStore instance edition type required by the user. Valid values: `Community` and `Enterprise`.
	EditionType interface{}
	// Database type. Options are `Redis`, `Memcache`. If no value is specified, all types are returned.
	Engine interface{}
	// Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
	EngineVersion interface{}
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
	InstanceChargeType interface{}
	// The KVStore instance node type required by the user. Valid values: `double`, `single`, `readone`, `readthree` and `readfive`.
	NodeType interface{}
	OutputFile interface{}
	// It has been deprecated from 1.68.0.
	PackageType interface{}
	// It has been deprecated from 1.68.0. 
	PerformanceType interface{}
	// The KVStore instance series type required by the user. Valid values: `enhancedPerformanceType` and `hybridStorage`.
	SeriesType interface{}
	// The number of shard.Valid values: `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`.
	ShardNumber interface{}
	SortedBy interface{}
	// It has been deprecated from 1.68.0. 
	StorageType interface{}
	// The Zone to launch the KVStore instance.
	ZoneId interface{}
}

// A collection of values returned by getInstanceClasses.
type GetInstanceClassesResult struct {
	Architecture interface{}
	// A list of KVStore available instance classes when the `sortedBy` is "Price". include:
	Classes interface{}
	EditionType interface{}
	Engine interface{}
	EngineVersion interface{}
	InstanceChargeType interface{}
	// A list of KVStore available instance classes.
	InstanceClasses interface{}
	NodeType interface{}
	OutputFile interface{}
	PackageType interface{}
	PerformanceType interface{}
	SeriesType interface{}
	ShardNumber interface{}
	SortedBy interface{}
	StorageType interface{}
	ZoneId interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}