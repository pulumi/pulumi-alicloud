// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Hbr Server Backup Plans of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.142.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/hbr"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// _default, err := ecs.GetInstances(ctx, &ecs.GetInstancesArgs{
// NameRegex: pulumi.StringRef("no-deleteing-hbr-ecs-server-backup-plan"),
// Status: pulumi.StringRef("Running"),
// }, nil);
// if err != nil {
// return err
// }
// ids, err := hbr.GetServerBackupPlans(ctx, &hbr.GetServerBackupPlansArgs{
// Filters: []hbr.GetServerBackupPlansFilter{
// {
// Key: pulumi.StringRef("instanceId"),
// Values: interface{}{
// _default.Instances[0].Id,
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// ctx.Export("hbrServerBackupPlanId1", ids.Plans[0].Id)
// return nil
// })
// }
// ```
func GetServerBackupPlans(ctx *pulumi.Context, args *GetServerBackupPlansArgs, opts ...pulumi.InvokeOption) (*GetServerBackupPlansResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServerBackupPlansResult
	err := ctx.Invoke("alicloud:hbr/getServerBackupPlans:getServerBackupPlans", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServerBackupPlans.
type GetServerBackupPlansArgs struct {
	// The filters.
	Filters []GetServerBackupPlansFilter `pulumi:"filters"`
	// A list of Server Backup Plan IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getServerBackupPlans.
type GetServerBackupPlansResult struct {
	Filters []GetServerBackupPlansFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                     `pulumi:"id"`
	Ids        []string                   `pulumi:"ids"`
	OutputFile *string                    `pulumi:"outputFile"`
	Plans      []GetServerBackupPlansPlan `pulumi:"plans"`
}

func GetServerBackupPlansOutput(ctx *pulumi.Context, args GetServerBackupPlansOutputArgs, opts ...pulumi.InvokeOption) GetServerBackupPlansResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetServerBackupPlansResultOutput, error) {
			args := v.(GetServerBackupPlansArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:hbr/getServerBackupPlans:getServerBackupPlans", args, GetServerBackupPlansResultOutput{}, options).(GetServerBackupPlansResultOutput), nil
		}).(GetServerBackupPlansResultOutput)
}

// A collection of arguments for invoking getServerBackupPlans.
type GetServerBackupPlansOutputArgs struct {
	// The filters.
	Filters GetServerBackupPlansFilterArrayInput `pulumi:"filters"`
	// A list of Server Backup Plan IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetServerBackupPlansOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerBackupPlansArgs)(nil)).Elem()
}

// A collection of values returned by getServerBackupPlans.
type GetServerBackupPlansResultOutput struct{ *pulumi.OutputState }

func (GetServerBackupPlansResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerBackupPlansResult)(nil)).Elem()
}

func (o GetServerBackupPlansResultOutput) ToGetServerBackupPlansResultOutput() GetServerBackupPlansResultOutput {
	return o
}

func (o GetServerBackupPlansResultOutput) ToGetServerBackupPlansResultOutputWithContext(ctx context.Context) GetServerBackupPlansResultOutput {
	return o
}

func (o GetServerBackupPlansResultOutput) Filters() GetServerBackupPlansFilterArrayOutput {
	return o.ApplyT(func(v GetServerBackupPlansResult) []GetServerBackupPlansFilter { return v.Filters }).(GetServerBackupPlansFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServerBackupPlansResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServerBackupPlansResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServerBackupPlansResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServerBackupPlansResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetServerBackupPlansResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerBackupPlansResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetServerBackupPlansResultOutput) Plans() GetServerBackupPlansPlanArrayOutput {
	return o.ApplyT(func(v GetServerBackupPlansResult) []GetServerBackupPlansPlan { return v.Plans }).(GetServerBackupPlansPlanArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServerBackupPlansResultOutput{})
}
