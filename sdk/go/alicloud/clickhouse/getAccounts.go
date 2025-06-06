// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package clickhouse

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Click House Accounts of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.134.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/clickhouse"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "oneaccountname"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			pwd := "Tf-onepwd"
//			if param := cfg.Get("pwd"); param != "" {
//				pwd = param
//			}
//			_type := "Normal"
//			if param := cfg.Get("type"); param != "" {
//				_type = param
//			}
//			_default, err := clickhouse.GetRegions(ctx, &clickhouse.GetRegionsArgs{
//				Current: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "default", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("10.4.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "default", &vpc.SwitchArgs{
//				VswitchName: pulumi.String(name),
//				CidrBlock:   pulumi.String("10.4.0.0/24"),
//				VpcId:       defaultNetwork.ID(),
//				ZoneId:      pulumi.String(_default.Regions[0].ZoneIds[0].ZoneId),
//			})
//			if err != nil {
//				return err
//			}
//			defaultDbCluster, err := clickhouse.NewDbCluster(ctx, "default", &clickhouse.DbClusterArgs{
//				DbClusterVersion:     pulumi.String("22.8.5.29"),
//				Category:             pulumi.String("Basic"),
//				DbClusterClass:       pulumi.String("S8"),
//				DbClusterNetworkType: pulumi.String("vpc"),
//				DbClusterDescription: pulumi.String(name),
//				DbNodeGroupCount:     pulumi.Int(1),
//				PaymentType:          pulumi.String("PayAsYouGo"),
//				DbNodeStorage:        pulumi.String("500"),
//				StorageType:          pulumi.String("cloud_essd"),
//				VswitchId:            defaultSwitch.ID(),
//				VpcId:                defaultNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			defaultAccount, err := clickhouse.NewAccount(ctx, "default", &clickhouse.AccountArgs{
//				DbClusterId:        defaultDbCluster.ID(),
//				AccountDescription: pulumi.String("your_description"),
//				AccountName:        pulumi.String(name),
//				AccountPassword:    pulumi.String(pwd),
//				Type:               pulumi.String(_type),
//			})
//			if err != nil {
//				return err
//			}
//			defaultGetAccounts := clickhouse.GetAccountsOutput(ctx, clickhouse.GetAccountsOutputArgs{
//				Ids: pulumi.StringArray{
//					defaultAccount.ID(),
//				},
//				DbClusterId: defaultDbCluster.ID(),
//			}, nil)
//			ctx.Export("accountId", defaultGetAccounts.ApplyT(func(defaultGetAccounts clickhouse.GetAccountsResult) (*string, error) {
//				return &defaultGetAccounts.Ids[0], nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
func GetAccounts(ctx *pulumi.Context, args *GetAccountsArgs, opts ...pulumi.InvokeOption) (*GetAccountsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAccountsResult
	err := ctx.Invoke("alicloud:clickhouse/getAccounts:getAccounts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccounts.
type GetAccountsArgs struct {
	// The DBCluster id.
	DbClusterId string `pulumi:"dbClusterId"`
	// A list of Account IDs. Its element value is same as Account Name.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Account name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the resource. Valid Status: `Creating`,`Available`,`Deleting`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getAccounts.
type GetAccountsResult struct {
	// A list of Click House Accounts. Each element contains the following attributes:
	Accounts []GetAccountsAccount `pulumi:"accounts"`
	// The DBCluster id.
	DbClusterId string `pulumi:"dbClusterId"`
	// The provider-assigned unique ID for this managed resource.
	Id        string   `pulumi:"id"`
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of Account names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

func GetAccountsOutput(ctx *pulumi.Context, args GetAccountsOutputArgs, opts ...pulumi.InvokeOption) GetAccountsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetAccountsResultOutput, error) {
			args := v.(GetAccountsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:clickhouse/getAccounts:getAccounts", args, GetAccountsResultOutput{}, options).(GetAccountsResultOutput), nil
		}).(GetAccountsResultOutput)
}

// A collection of arguments for invoking getAccounts.
type GetAccountsOutputArgs struct {
	// The DBCluster id.
	DbClusterId pulumi.StringInput `pulumi:"dbClusterId"`
	// A list of Account IDs. Its element value is same as Account Name.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Account name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the resource. Valid Status: `Creating`,`Available`,`Deleting`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetAccountsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountsArgs)(nil)).Elem()
}

// A collection of values returned by getAccounts.
type GetAccountsResultOutput struct{ *pulumi.OutputState }

func (GetAccountsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountsResult)(nil)).Elem()
}

func (o GetAccountsResultOutput) ToGetAccountsResultOutput() GetAccountsResultOutput {
	return o
}

func (o GetAccountsResultOutput) ToGetAccountsResultOutputWithContext(ctx context.Context) GetAccountsResultOutput {
	return o
}

// A list of Click House Accounts. Each element contains the following attributes:
func (o GetAccountsResultOutput) Accounts() GetAccountsAccountArrayOutput {
	return o.ApplyT(func(v GetAccountsResult) []GetAccountsAccount { return v.Accounts }).(GetAccountsAccountArrayOutput)
}

// The DBCluster id.
func (o GetAccountsResultOutput) DbClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountsResult) string { return v.DbClusterId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAccountsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAccountsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAccountsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetAccountsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccountsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of Account names.
func (o GetAccountsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAccountsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetAccountsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccountsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The status of the resource.
func (o GetAccountsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccountsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccountsResultOutput{})
}
