// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides CEN Transit Router Route Tables available to the user.[What is Cen Transit Router Route Tables](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-listtransitrouterroutetables)
//
// > **NOTE:** Available since v1.126.0.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// cfg := config.New(ctx, "")
// name := "tf-example";
// if param := cfg.Get("name"); param != ""{
// name = param
// }
// defaultInstance, err := cen.NewInstance(ctx, "default", &cen.InstanceArgs{
// CenInstanceName: pulumi.String(name),
// ProtectionLevel: pulumi.String("REDUCED"),
// })
// if err != nil {
// return err
// }
// defaultTransitRouter, err := cen.NewTransitRouter(ctx, "default", &cen.TransitRouterArgs{
// CenId: defaultInstance.ID(),
// TransitRouterName: pulumi.String(name),
// })
// if err != nil {
// return err
// }
// _, err = cen.NewTransitRouterRouteTable(ctx, "default", &cen.TransitRouterRouteTableArgs{
// TransitRouterId: defaultTransitRouter.TransitRouterId,
// TransitRouterRouteTableDescription: pulumi.String("desp"),
// TransitRouterRouteTableName: pulumi.String(name),
// })
// if err != nil {
// return err
// }
// _default := cen.GetTransitRouterRouteTablesOutput(ctx, cen.GetTransitRouterRouteTablesOutputArgs{
// TransitRouterId: defaultTransitRouter.TransitRouterId,
// }, nil);
// ctx.Export("firstTransitRouterRouteTableType", _default.ApplyT(func(_default cen.GetTransitRouterRouteTablesResult) (*string, error) {
// return &default.Tables[0].TransitRouterRouteTableType, nil
// }).(pulumi.StringPtrOutput))
// return nil
// })
// }
// ```
func GetTransitRouterRouteTables(ctx *pulumi.Context, args *GetTransitRouterRouteTablesArgs, opts ...pulumi.InvokeOption) (*GetTransitRouterRouteTablesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTransitRouterRouteTablesResult
	err := ctx.Invoke("alicloud:cen/getTransitRouterRouteTables:getTransitRouterRouteTables", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransitRouterRouteTables.
type GetTransitRouterRouteTablesArgs struct {
	// A list of CEN Transit Router Route Table IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter CEN Transit Router Route Table by name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the transit router route table to query. Valid values `Creating`, `Active` and `Deleting`..
	Status *string `pulumi:"status"`
	// ID of the CEN Transit Router Route Table.
	TransitRouterId string `pulumi:"transitRouterId"`
	// A list of ID of the CEN Transit Router Route Table.
	TransitRouterRouteTableIds []string `pulumi:"transitRouterRouteTableIds"`
	// A list of name of the CEN Transit Router Route Table.
	TransitRouterRouteTableNames []string `pulumi:"transitRouterRouteTableNames"`
	// The status of the transit router route table to query. Valid values `Creating`, `Active` and `Deleting`..
	TransitRouterRouteTableStatus *string `pulumi:"transitRouterRouteTableStatus"`
	// The type of the transit router route table to query. Valid values `System` and `Custom`.
	TransitRouterRouteTableType *string `pulumi:"transitRouterRouteTableType"`
}

// A collection of values returned by getTransitRouterRouteTables.
type GetTransitRouterRouteTablesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string   `pulumi:"id"`
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of name of CEN Transit Router Route Tables.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the route table.
	Status *string `pulumi:"status"`
	// A list of CEN Route Entries. Each element contains the following attributes:
	Tables                        []GetTransitRouterRouteTablesTable `pulumi:"tables"`
	TransitRouterId               string                             `pulumi:"transitRouterId"`
	TransitRouterRouteTableIds    []string                           `pulumi:"transitRouterRouteTableIds"`
	TransitRouterRouteTableNames  []string                           `pulumi:"transitRouterRouteTableNames"`
	TransitRouterRouteTableStatus *string                            `pulumi:"transitRouterRouteTableStatus"`
	// Type of the transit router route table.
	TransitRouterRouteTableType *string `pulumi:"transitRouterRouteTableType"`
}

func GetTransitRouterRouteTablesOutput(ctx *pulumi.Context, args GetTransitRouterRouteTablesOutputArgs, opts ...pulumi.InvokeOption) GetTransitRouterRouteTablesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetTransitRouterRouteTablesResultOutput, error) {
			args := v.(GetTransitRouterRouteTablesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:cen/getTransitRouterRouteTables:getTransitRouterRouteTables", args, GetTransitRouterRouteTablesResultOutput{}, options).(GetTransitRouterRouteTablesResultOutput), nil
		}).(GetTransitRouterRouteTablesResultOutput)
}

// A collection of arguments for invoking getTransitRouterRouteTables.
type GetTransitRouterRouteTablesOutputArgs struct {
	// A list of CEN Transit Router Route Table IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter CEN Transit Router Route Table by name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the transit router route table to query. Valid values `Creating`, `Active` and `Deleting`..
	Status pulumi.StringPtrInput `pulumi:"status"`
	// ID of the CEN Transit Router Route Table.
	TransitRouterId pulumi.StringInput `pulumi:"transitRouterId"`
	// A list of ID of the CEN Transit Router Route Table.
	TransitRouterRouteTableIds pulumi.StringArrayInput `pulumi:"transitRouterRouteTableIds"`
	// A list of name of the CEN Transit Router Route Table.
	TransitRouterRouteTableNames pulumi.StringArrayInput `pulumi:"transitRouterRouteTableNames"`
	// The status of the transit router route table to query. Valid values `Creating`, `Active` and `Deleting`..
	TransitRouterRouteTableStatus pulumi.StringPtrInput `pulumi:"transitRouterRouteTableStatus"`
	// The type of the transit router route table to query. Valid values `System` and `Custom`.
	TransitRouterRouteTableType pulumi.StringPtrInput `pulumi:"transitRouterRouteTableType"`
}

func (GetTransitRouterRouteTablesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterRouteTablesArgs)(nil)).Elem()
}

// A collection of values returned by getTransitRouterRouteTables.
type GetTransitRouterRouteTablesResultOutput struct{ *pulumi.OutputState }

func (GetTransitRouterRouteTablesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterRouteTablesResult)(nil)).Elem()
}

func (o GetTransitRouterRouteTablesResultOutput) ToGetTransitRouterRouteTablesResultOutput() GetTransitRouterRouteTablesResultOutput {
	return o
}

func (o GetTransitRouterRouteTablesResultOutput) ToGetTransitRouterRouteTablesResultOutputWithContext(ctx context.Context) GetTransitRouterRouteTablesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetTransitRouterRouteTablesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTransitRouterRouteTablesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetTransitRouterRouteTablesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of name of CEN Transit Router Route Tables.
func (o GetTransitRouterRouteTablesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetTransitRouterRouteTablesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The status of the route table.
func (o GetTransitRouterRouteTablesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// A list of CEN Route Entries. Each element contains the following attributes:
func (o GetTransitRouterRouteTablesResultOutput) Tables() GetTransitRouterRouteTablesTableArrayOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablesResult) []GetTransitRouterRouteTablesTable { return v.Tables }).(GetTransitRouterRouteTablesTableArrayOutput)
}

func (o GetTransitRouterRouteTablesResultOutput) TransitRouterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablesResult) string { return v.TransitRouterId }).(pulumi.StringOutput)
}

func (o GetTransitRouterRouteTablesResultOutput) TransitRouterRouteTableIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablesResult) []string { return v.TransitRouterRouteTableIds }).(pulumi.StringArrayOutput)
}

func (o GetTransitRouterRouteTablesResultOutput) TransitRouterRouteTableNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablesResult) []string { return v.TransitRouterRouteTableNames }).(pulumi.StringArrayOutput)
}

func (o GetTransitRouterRouteTablesResultOutput) TransitRouterRouteTableStatus() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablesResult) *string { return v.TransitRouterRouteTableStatus }).(pulumi.StringPtrOutput)
}

// Type of the transit router route table.
func (o GetTransitRouterRouteTablesResultOutput) TransitRouterRouteTableType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterRouteTablesResult) *string { return v.TransitRouterRouteTableType }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTransitRouterRouteTablesResultOutput{})
}
