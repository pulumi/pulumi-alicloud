// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kvstore

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance engines resource available info of Alibaba Cloud.
//
// > **NOTE:** Available since v1.51.0
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/kvstore"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			resources, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("KVStore"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			resourcesGetInstanceEngines, err := kvstore.GetInstanceEngines(ctx, &kvstore.GetInstanceEnginesArgs{
//				ZoneId:             resources.Zones[0].Id,
//				InstanceChargeType: pulumi.StringRef("PrePaid"),
//				Engine:             pulumi.StringRef("Redis"),
//				EngineVersion:      pulumi.StringRef("5.0"),
//				OutputFile:         pulumi.StringRef("./engines.txt"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstKvstoreInstanceClass", resourcesGetInstanceEngines.InstanceEngines[0].Engine)
//			return nil
//		})
//	}
//
// ```
func GetInstanceEngines(ctx *pulumi.Context, args *GetInstanceEnginesArgs, opts ...pulumi.InvokeOption) (*GetInstanceEnginesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstanceEnginesResult
	err := ctx.Invoke("alicloud:kvstore/getInstanceEngines:getInstanceEngines", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceEngines.
type GetInstanceEnginesArgs struct {
	// Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
	Engine *string `pulumi:"engine"`
	// Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-createinstance-redis) `EngineVersion`. Value of Memcache should be empty.
	EngineVersion *string `pulumi:"engineVersion"`
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// File name where to save data source results (after running `pulumi up`).
	OutputFile *string `pulumi:"outputFile"`
	// The Zone to launch the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
	ZoneId string `pulumi:"zoneId"`
}

// A collection of values returned by getInstanceEngines.
type GetInstanceEnginesResult struct {
	// Database type.
	Engine *string `pulumi:"engine"`
	// Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance version.
	EngineVersion *string `pulumi:"engineVersion"`
	// The provider-assigned unique ID for this managed resource.
	Id                 string  `pulumi:"id"`
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// A list of Tair (Redis OSS-Compatible) And Memcache (KVStore) available instance engines. Each element contains the following attributes:
	InstanceEngines []GetInstanceEnginesInstanceEngine `pulumi:"instanceEngines"`
	OutputFile      *string                            `pulumi:"outputFile"`
	// The Zone to launch the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
	ZoneId string `pulumi:"zoneId"`
}

func GetInstanceEnginesOutput(ctx *pulumi.Context, args GetInstanceEnginesOutputArgs, opts ...pulumi.InvokeOption) GetInstanceEnginesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetInstanceEnginesResultOutput, error) {
			args := v.(GetInstanceEnginesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:kvstore/getInstanceEngines:getInstanceEngines", args, GetInstanceEnginesResultOutput{}, options).(GetInstanceEnginesResultOutput), nil
		}).(GetInstanceEnginesResultOutput)
}

// A collection of arguments for invoking getInstanceEngines.
type GetInstanceEnginesOutputArgs struct {
	// Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
	Engine pulumi.StringPtrInput `pulumi:"engine"`
	// Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-createinstance-redis) `EngineVersion`. Value of Memcache should be empty.
	EngineVersion pulumi.StringPtrInput `pulumi:"engineVersion"`
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
	InstanceChargeType pulumi.StringPtrInput `pulumi:"instanceChargeType"`
	// File name where to save data source results (after running `pulumi up`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The Zone to launch the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (GetInstanceEnginesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceEnginesArgs)(nil)).Elem()
}

// A collection of values returned by getInstanceEngines.
type GetInstanceEnginesResultOutput struct{ *pulumi.OutputState }

func (GetInstanceEnginesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceEnginesResult)(nil)).Elem()
}

func (o GetInstanceEnginesResultOutput) ToGetInstanceEnginesResultOutput() GetInstanceEnginesResultOutput {
	return o
}

func (o GetInstanceEnginesResultOutput) ToGetInstanceEnginesResultOutputWithContext(ctx context.Context) GetInstanceEnginesResultOutput {
	return o
}

// Database type.
func (o GetInstanceEnginesResultOutput) Engine() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceEnginesResult) *string { return v.Engine }).(pulumi.StringPtrOutput)
}

// Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance version.
func (o GetInstanceEnginesResultOutput) EngineVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceEnginesResult) *string { return v.EngineVersion }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetInstanceEnginesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceEnginesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetInstanceEnginesResultOutput) InstanceChargeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceEnginesResult) *string { return v.InstanceChargeType }).(pulumi.StringPtrOutput)
}

// A list of Tair (Redis OSS-Compatible) And Memcache (KVStore) available instance engines. Each element contains the following attributes:
func (o GetInstanceEnginesResultOutput) InstanceEngines() GetInstanceEnginesInstanceEngineArrayOutput {
	return o.ApplyT(func(v GetInstanceEnginesResult) []GetInstanceEnginesInstanceEngine { return v.InstanceEngines }).(GetInstanceEnginesInstanceEngineArrayOutput)
}

func (o GetInstanceEnginesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceEnginesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The Zone to launch the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
func (o GetInstanceEnginesResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceEnginesResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceEnginesResultOutput{})
}
