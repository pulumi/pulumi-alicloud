// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package waf

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a WAF datasource to retrieve instances.
//
// For information about WAF and how to use it, see [What is Alibaba Cloud WAF](https://www.alibabacloud.com/help/doc-detail/28517.htm).
//
// > **NOTE:** Available in 1.90.0+ .
func GetInstances(ctx *pulumi.Context, args *GetInstancesArgs, opts ...pulumi.InvokeOption) (*GetInstancesResult, error) {
	var rv GetInstancesResult
	err := ctx.Invoke("alicloud:waf/getInstances:getInstances", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstances.
type GetInstancesArgs struct {
	// A list of WAF instance IDs.
	Ids []string `pulumi:"ids"`
	// The source of the WAF instance.
	InstanceSource *string `pulumi:"instanceSource"`
	OutputFile     *string `pulumi:"outputFile"`
	// The ID of resource group to which WAF instance belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of WAF instance to filter results. Optional value: `0`: The instance has expired, `1` : The instance has not expired and is working properly.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getInstances.
type GetInstancesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Optional) A list of WAF instance IDs.
	Ids            []string `pulumi:"ids"`
	InstanceSource *string  `pulumi:"instanceSource"`
	// A list of WAF instances. Each element contains the following attributes:
	Instances       []GetInstancesInstance `pulumi:"instances"`
	OutputFile      *string                `pulumi:"outputFile"`
	ResourceGroupId *string                `pulumi:"resourceGroupId"`
	// Indicates whether the WAF instance has expired.
	Status *string `pulumi:"status"`
}