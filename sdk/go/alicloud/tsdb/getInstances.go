// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package tsdb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Time Series Database (TSDB) Instances of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.112.0+.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/tsdb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := tsdb.GetInstances(ctx, &tsdb.GetInstancesArgs{
//				Ids: []string{
//					"example_value",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstTsdbInstanceId", example.Instances[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetInstances(ctx *pulumi.Context, args *GetInstancesArgs, opts ...pulumi.InvokeOption) (*GetInstancesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstancesResult
	err := ctx.Invoke("alicloud:tsdb/getInstances:getInstances", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstances.
type GetInstancesArgs struct {
	// The app key.
	AppKey *string `pulumi:"appKey"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// The engine type of instance. Enumerative: `tsdbTsdb` refers to TSDB, `tsdbInfluxdb` refers to TSDB for InfluxDB️.
	EngineType *string `pulumi:"engineType"`
	// A list of Instance IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The query str.
	QueryStr *string `pulumi:"queryStr"`
	// Instance status, enumerative: `ACTIVATION`, `DELETED`, `CREATING`, `CLASS_CHANGING`, `LOCKED`.
	Status *string `pulumi:"status"`
	// The status list.
	StatusList *string `pulumi:"statusList"`
}

// A collection of values returned by getInstances.
type GetInstancesResult struct {
	AppKey        *string `pulumi:"appKey"`
	EnableDetails *bool   `pulumi:"enableDetails"`
	EngineType    *string `pulumi:"engineType"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                 `pulumi:"id"`
	Ids        []string               `pulumi:"ids"`
	Instances  []GetInstancesInstance `pulumi:"instances"`
	OutputFile *string                `pulumi:"outputFile"`
	QueryStr   *string                `pulumi:"queryStr"`
	Status     *string                `pulumi:"status"`
	StatusList *string                `pulumi:"statusList"`
}

func GetInstancesOutput(ctx *pulumi.Context, args GetInstancesOutputArgs, opts ...pulumi.InvokeOption) GetInstancesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetInstancesResultOutput, error) {
			args := v.(GetInstancesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:tsdb/getInstances:getInstances", args, GetInstancesResultOutput{}, options).(GetInstancesResultOutput), nil
		}).(GetInstancesResultOutput)
}

// A collection of arguments for invoking getInstances.
type GetInstancesOutputArgs struct {
	// The app key.
	AppKey pulumi.StringPtrInput `pulumi:"appKey"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// The engine type of instance. Enumerative: `tsdbTsdb` refers to TSDB, `tsdbInfluxdb` refers to TSDB for InfluxDB️.
	EngineType pulumi.StringPtrInput `pulumi:"engineType"`
	// A list of Instance IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The query str.
	QueryStr pulumi.StringPtrInput `pulumi:"queryStr"`
	// Instance status, enumerative: `ACTIVATION`, `DELETED`, `CREATING`, `CLASS_CHANGING`, `LOCKED`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The status list.
	StatusList pulumi.StringPtrInput `pulumi:"statusList"`
}

func (GetInstancesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesArgs)(nil)).Elem()
}

// A collection of values returned by getInstances.
type GetInstancesResultOutput struct{ *pulumi.OutputState }

func (GetInstancesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesResult)(nil)).Elem()
}

func (o GetInstancesResultOutput) ToGetInstancesResultOutput() GetInstancesResultOutput {
	return o
}

func (o GetInstancesResultOutput) ToGetInstancesResultOutputWithContext(ctx context.Context) GetInstancesResultOutput {
	return o
}

func (o GetInstancesResultOutput) AppKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstancesResult) *string { return v.AppKey }).(pulumi.StringPtrOutput)
}

func (o GetInstancesResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetInstancesResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

func (o GetInstancesResultOutput) EngineType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstancesResult) *string { return v.EngineType }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetInstancesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetInstancesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetInstancesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetInstancesResultOutput) Instances() GetInstancesInstanceArrayOutput {
	return o.ApplyT(func(v GetInstancesResult) []GetInstancesInstance { return v.Instances }).(GetInstancesInstanceArrayOutput)
}

func (o GetInstancesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstancesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetInstancesResultOutput) QueryStr() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstancesResult) *string { return v.QueryStr }).(pulumi.StringPtrOutput)
}

func (o GetInstancesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstancesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetInstancesResultOutput) StatusList() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstancesResult) *string { return v.StatusList }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstancesResultOutput{})
}
