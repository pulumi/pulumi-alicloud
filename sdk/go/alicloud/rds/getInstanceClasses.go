// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// This data source provides the RDS instance classes resource available info of Alibaba Cloud.
// 
// > **NOTE:** Available in v1.46.0+
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/db_instance_classes.html.markdown.
func LookupInstanceClasses(ctx *pulumi.Context, args *GetInstanceClassesArgs) (*GetInstanceClassesResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["category"] = args.Category
		inputs["dbInstanceClass"] = args.DbInstanceClass
		inputs["engine"] = args.Engine
		inputs["engineVersion"] = args.EngineVersion
		inputs["instanceChargeType"] = args.InstanceChargeType
		inputs["multiZone"] = args.MultiZone
		inputs["outputFile"] = args.OutputFile
		inputs["sortedBy"] = args.SortedBy
		inputs["storageType"] = args.StorageType
		inputs["zoneId"] = args.ZoneId
	}
	outputs, err := ctx.Invoke("alicloud:rds/getInstanceClasses:getInstanceClasses", inputs)
	if err != nil {
		return nil, err
	}
	return &GetInstanceClassesResult{
		Category: outputs["category"],
		DbInstanceClass: outputs["dbInstanceClass"],
		Engine: outputs["engine"],
		EngineVersion: outputs["engineVersion"],
		Ids: outputs["ids"],
		InstanceChargeType: outputs["instanceChargeType"],
		InstanceClasses: outputs["instanceClasses"],
		MultiZone: outputs["multiZone"],
		OutputFile: outputs["outputFile"],
		SortedBy: outputs["sortedBy"],
		StorageType: outputs["storageType"],
		ZoneId: outputs["zoneId"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getInstanceClasses.
type GetInstanceClassesArgs struct {
	// DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
	Category interface{}
	// The DB instance class type by the user.
	DbInstanceClass interface{}
	// Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL` and `PPAS`. If no value is specified, all types are returned.
	Engine interface{}
	// Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
	EngineVersion interface{}
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
	InstanceChargeType interface{}
	// Whether to show multi available zone. Default false to not show multi availability zone.
	MultiZone interface{}
	OutputFile interface{}
	SortedBy interface{}
	// The DB instance storage space required by the user. Valid values: `cloudSsd` and `localSsd`.
	StorageType interface{}
	// The Zone to launch the DB instance.
	ZoneId interface{}
}

// A collection of values returned by getInstanceClasses.
type GetInstanceClassesResult struct {
	Category interface{}
	DbInstanceClass interface{}
	Engine interface{}
	EngineVersion interface{}
	// (Available in 1.60.0+) A list of Rds instance class codes.
	Ids interface{}
	InstanceChargeType interface{}
	// A list of Rds available resource. Each element contains the following attributes:
	InstanceClasses interface{}
	MultiZone interface{}
	OutputFile interface{}
	SortedBy interface{}
	StorageType interface{}
	ZoneId interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}