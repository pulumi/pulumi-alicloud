// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Hybrid Backup Recovery (HBR) Hana Backup Clients of the current Alibaba Cloud user.
//
// > **NOTE:** Available in 1.198.0+
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/hbr"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := hbr.GetHanaBackupClients(ctx, &hbr.GetHanaBackupClientsArgs{
//				Ids: []string{
//					"example_id",
//				},
//				VaultId: "your_vault_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("hbrHanaBackupClientsId1", ids.HanaBackupClients[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetHanaBackupClients(ctx *pulumi.Context, args *GetHanaBackupClientsArgs, opts ...pulumi.InvokeOption) (*GetHanaBackupClientsResult, error) {
	var rv GetHanaBackupClientsResult
	err := ctx.Invoke("alicloud:hbr/getHanaBackupClients:getHanaBackupClients", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHanaBackupClients.
type GetHanaBackupClientsArgs struct {
	// The ID of the backup client.
	ClientId *string `pulumi:"clientId"`
	// The ID of the SAP HANA instance.
	ClusterId *string `pulumi:"clusterId"`
	// A list of Hana Backup Client IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	PageNumber *int     `pulumi:"pageNumber"`
	PageSize   *int     `pulumi:"pageSize"`
	// The status of the Hana Backup Client. Valid Values: `REGISTERED`, `ACTIVATED`, `DEACTIVATED`, `INSTALLING`, `INSTALL_FAILED`, `NOT_INSTALLED`, `UPGRADING`, `UPGRADE_FAILED`, `UNINSTALLING`, `UNINSTALL_FAILED`, `STOPPED`, `UNKNOWN`.
	Status *string `pulumi:"status"`
	// The ID of the backup vault.
	VaultId string `pulumi:"vaultId"`
}

// A collection of values returned by getHanaBackupClients.
type GetHanaBackupClientsResult struct {
	// The ID of the backup client.
	ClientId *string `pulumi:"clientId"`
	// The ID of the SAP HANA instance.
	ClusterId *string `pulumi:"clusterId"`
	// A list of Hana Backup Clients. Each element contains the following attributes:
	HanaBackupClients []GetHanaBackupClientsHanaBackupClient `pulumi:"hanaBackupClients"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	PageNumber *int     `pulumi:"pageNumber"`
	PageSize   *int     `pulumi:"pageSize"`
	// The status of the backup client.
	Status *string `pulumi:"status"`
	// The ID of the backup vault.
	VaultId string `pulumi:"vaultId"`
}

func GetHanaBackupClientsOutput(ctx *pulumi.Context, args GetHanaBackupClientsOutputArgs, opts ...pulumi.InvokeOption) GetHanaBackupClientsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetHanaBackupClientsResult, error) {
			args := v.(GetHanaBackupClientsArgs)
			r, err := GetHanaBackupClients(ctx, &args, opts...)
			var s GetHanaBackupClientsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetHanaBackupClientsResultOutput)
}

// A collection of arguments for invoking getHanaBackupClients.
type GetHanaBackupClientsOutputArgs struct {
	// The ID of the backup client.
	ClientId pulumi.StringPtrInput `pulumi:"clientId"`
	// The ID of the SAP HANA instance.
	ClusterId pulumi.StringPtrInput `pulumi:"clusterId"`
	// A list of Hana Backup Client IDs.
	Ids        pulumi.StringArrayInput `pulumi:"ids"`
	OutputFile pulumi.StringPtrInput   `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput      `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput      `pulumi:"pageSize"`
	// The status of the Hana Backup Client. Valid Values: `REGISTERED`, `ACTIVATED`, `DEACTIVATED`, `INSTALLING`, `INSTALL_FAILED`, `NOT_INSTALLED`, `UPGRADING`, `UPGRADE_FAILED`, `UNINSTALLING`, `UNINSTALL_FAILED`, `STOPPED`, `UNKNOWN`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The ID of the backup vault.
	VaultId pulumi.StringInput `pulumi:"vaultId"`
}

func (GetHanaBackupClientsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHanaBackupClientsArgs)(nil)).Elem()
}

// A collection of values returned by getHanaBackupClients.
type GetHanaBackupClientsResultOutput struct{ *pulumi.OutputState }

func (GetHanaBackupClientsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHanaBackupClientsResult)(nil)).Elem()
}

func (o GetHanaBackupClientsResultOutput) ToGetHanaBackupClientsResultOutput() GetHanaBackupClientsResultOutput {
	return o
}

func (o GetHanaBackupClientsResultOutput) ToGetHanaBackupClientsResultOutputWithContext(ctx context.Context) GetHanaBackupClientsResultOutput {
	return o
}

// The ID of the backup client.
func (o GetHanaBackupClientsResultOutput) ClientId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHanaBackupClientsResult) *string { return v.ClientId }).(pulumi.StringPtrOutput)
}

// The ID of the SAP HANA instance.
func (o GetHanaBackupClientsResultOutput) ClusterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHanaBackupClientsResult) *string { return v.ClusterId }).(pulumi.StringPtrOutput)
}

// A list of Hana Backup Clients. Each element contains the following attributes:
func (o GetHanaBackupClientsResultOutput) HanaBackupClients() GetHanaBackupClientsHanaBackupClientArrayOutput {
	return o.ApplyT(func(v GetHanaBackupClientsResult) []GetHanaBackupClientsHanaBackupClient { return v.HanaBackupClients }).(GetHanaBackupClientsHanaBackupClientArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetHanaBackupClientsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHanaBackupClientsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetHanaBackupClientsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHanaBackupClientsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetHanaBackupClientsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHanaBackupClientsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetHanaBackupClientsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetHanaBackupClientsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetHanaBackupClientsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetHanaBackupClientsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

// The status of the backup client.
func (o GetHanaBackupClientsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHanaBackupClientsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// The ID of the backup vault.
func (o GetHanaBackupClientsResultOutput) VaultId() pulumi.StringOutput {
	return o.ApplyT(func(v GetHanaBackupClientsResult) string { return v.VaultId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHanaBackupClientsResultOutput{})
}