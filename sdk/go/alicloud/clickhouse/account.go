// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package clickhouse

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Click House Account resource.
//
// For information about Click House Account and how to use it, see [What is Account](https://www.alibabacloud.com/help/zh/clickhouse/latest/api-clickhouse-2019-11-11-createaccount).
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
//			name := "tf-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
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
//				ZoneId:      pulumi.String(_default.Regions[0].ZoneIds[1].ZoneId),
//			})
//			if err != nil {
//				return err
//			}
//			defaultDbCluster, err := clickhouse.NewDbCluster(ctx, "default", &clickhouse.DbClusterArgs{
//				DbClusterVersion:     pulumi.String("22.8.5.29"),
//				Category:             pulumi.String("Basic"),
//				DbClusterClass:       pulumi.String("S8"),
//				DbClusterNetworkType: pulumi.String("vpc"),
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
//			_, err = clickhouse.NewAccount(ctx, "default", &clickhouse.AccountArgs{
//				DbClusterId:        defaultDbCluster.ID(),
//				AccountDescription: pulumi.String("tf-example-description"),
//				AccountName:        pulumi.String("examplename"),
//				AccountPassword:    pulumi.String("Example1234"),
//				Type:               pulumi.String(_type),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Click House Account can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:clickhouse/account:Account example <db_cluster_id>:<account_name>
// ```
type Account struct {
	pulumi.CustomResourceState

	// In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
	AccountDescription pulumi.StringPtrOutput `pulumi:"accountDescription"`
	// Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
	AccountName pulumi.StringOutput `pulumi:"accountName"`
	// The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^& author (s):_+-=) in a length of 8-32 bit.
	AccountPassword pulumi.StringOutput `pulumi:"accountPassword"`
	// The list of databases to which you want to grant permissions. Separate databases with commas (,).
	AllowDatabases pulumi.StringOutput `pulumi:"allowDatabases"`
	// The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
	AllowDictionaries pulumi.StringOutput `pulumi:"allowDictionaries"`
	// The db cluster id.
	DbClusterId pulumi.StringOutput `pulumi:"dbClusterId"`
	// Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
	DdlAuthority pulumi.BoolOutput `pulumi:"ddlAuthority"`
	// Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
	DmlAuthority pulumi.StringOutput `pulumi:"dmlAuthority"`
	// The status of the resource. Valid Status: `Creating`,`Available`,`Deleting`.
	Status pulumi.StringOutput `pulumi:"status"`
	// The list of all databases. Separate databases with commas (,). Field 'total_databases' has been deprecated from provider version 1.223.1.
	//
	// Deprecated: Field 'total_databases' has been deprecated from version 1.223.1 and it will be removed in the future version.
	TotalDatabases pulumi.StringOutput `pulumi:"totalDatabases"`
	// The list of all dictionaries. Separate dictionaries with commas (,). Field 'total_dictionaries' has been deprecated from provider version 1.223.1.
	//
	// Deprecated: Field 'total_dictionaries' has been deprecated from version 1.223.1 and it will be removed in the future version.
	TotalDictionaries pulumi.StringOutput `pulumi:"totalDictionaries"`
	// The type of the database account. Valid values: `Normal` or `Super`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewAccount registers a new resource with the given unique name, arguments, and options.
func NewAccount(ctx *pulumi.Context,
	name string, args *AccountArgs, opts ...pulumi.ResourceOption) (*Account, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountName == nil {
		return nil, errors.New("invalid value for required argument 'AccountName'")
	}
	if args.AccountPassword == nil {
		return nil, errors.New("invalid value for required argument 'AccountPassword'")
	}
	if args.DbClusterId == nil {
		return nil, errors.New("invalid value for required argument 'DbClusterId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Account
	err := ctx.RegisterResource("alicloud:clickhouse/account:Account", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccount gets an existing Account resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccountState, opts ...pulumi.ResourceOption) (*Account, error) {
	var resource Account
	err := ctx.ReadResource("alicloud:clickhouse/account:Account", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Account resources.
type accountState struct {
	// In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
	AccountDescription *string `pulumi:"accountDescription"`
	// Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
	AccountName *string `pulumi:"accountName"`
	// The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^& author (s):_+-=) in a length of 8-32 bit.
	AccountPassword *string `pulumi:"accountPassword"`
	// The list of databases to which you want to grant permissions. Separate databases with commas (,).
	AllowDatabases *string `pulumi:"allowDatabases"`
	// The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
	AllowDictionaries *string `pulumi:"allowDictionaries"`
	// The db cluster id.
	DbClusterId *string `pulumi:"dbClusterId"`
	// Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
	DdlAuthority *bool `pulumi:"ddlAuthority"`
	// Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
	DmlAuthority *string `pulumi:"dmlAuthority"`
	// The status of the resource. Valid Status: `Creating`,`Available`,`Deleting`.
	Status *string `pulumi:"status"`
	// The list of all databases. Separate databases with commas (,). Field 'total_databases' has been deprecated from provider version 1.223.1.
	//
	// Deprecated: Field 'total_databases' has been deprecated from version 1.223.1 and it will be removed in the future version.
	TotalDatabases *string `pulumi:"totalDatabases"`
	// The list of all dictionaries. Separate dictionaries with commas (,). Field 'total_dictionaries' has been deprecated from provider version 1.223.1.
	//
	// Deprecated: Field 'total_dictionaries' has been deprecated from version 1.223.1 and it will be removed in the future version.
	TotalDictionaries *string `pulumi:"totalDictionaries"`
	// The type of the database account. Valid values: `Normal` or `Super`.
	Type *string `pulumi:"type"`
}

type AccountState struct {
	// In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
	AccountDescription pulumi.StringPtrInput
	// Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
	AccountName pulumi.StringPtrInput
	// The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^& author (s):_+-=) in a length of 8-32 bit.
	AccountPassword pulumi.StringPtrInput
	// The list of databases to which you want to grant permissions. Separate databases with commas (,).
	AllowDatabases pulumi.StringPtrInput
	// The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
	AllowDictionaries pulumi.StringPtrInput
	// The db cluster id.
	DbClusterId pulumi.StringPtrInput
	// Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
	DdlAuthority pulumi.BoolPtrInput
	// Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
	DmlAuthority pulumi.StringPtrInput
	// The status of the resource. Valid Status: `Creating`,`Available`,`Deleting`.
	Status pulumi.StringPtrInput
	// The list of all databases. Separate databases with commas (,). Field 'total_databases' has been deprecated from provider version 1.223.1.
	//
	// Deprecated: Field 'total_databases' has been deprecated from version 1.223.1 and it will be removed in the future version.
	TotalDatabases pulumi.StringPtrInput
	// The list of all dictionaries. Separate dictionaries with commas (,). Field 'total_dictionaries' has been deprecated from provider version 1.223.1.
	//
	// Deprecated: Field 'total_dictionaries' has been deprecated from version 1.223.1 and it will be removed in the future version.
	TotalDictionaries pulumi.StringPtrInput
	// The type of the database account. Valid values: `Normal` or `Super`.
	Type pulumi.StringPtrInput
}

func (AccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*accountState)(nil)).Elem()
}

type accountArgs struct {
	// In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
	AccountDescription *string `pulumi:"accountDescription"`
	// Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
	AccountName string `pulumi:"accountName"`
	// The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^& author (s):_+-=) in a length of 8-32 bit.
	AccountPassword string `pulumi:"accountPassword"`
	// The list of databases to which you want to grant permissions. Separate databases with commas (,).
	AllowDatabases *string `pulumi:"allowDatabases"`
	// The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
	AllowDictionaries *string `pulumi:"allowDictionaries"`
	// The db cluster id.
	DbClusterId string `pulumi:"dbClusterId"`
	// Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
	DdlAuthority *bool `pulumi:"ddlAuthority"`
	// Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
	DmlAuthority *string `pulumi:"dmlAuthority"`
	// The list of all databases. Separate databases with commas (,). Field 'total_databases' has been deprecated from provider version 1.223.1.
	//
	// Deprecated: Field 'total_databases' has been deprecated from version 1.223.1 and it will be removed in the future version.
	TotalDatabases *string `pulumi:"totalDatabases"`
	// The list of all dictionaries. Separate dictionaries with commas (,). Field 'total_dictionaries' has been deprecated from provider version 1.223.1.
	//
	// Deprecated: Field 'total_dictionaries' has been deprecated from version 1.223.1 and it will be removed in the future version.
	TotalDictionaries *string `pulumi:"totalDictionaries"`
	// The type of the database account. Valid values: `Normal` or `Super`.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a Account resource.
type AccountArgs struct {
	// In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
	AccountDescription pulumi.StringPtrInput
	// Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
	AccountName pulumi.StringInput
	// The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^& author (s):_+-=) in a length of 8-32 bit.
	AccountPassword pulumi.StringInput
	// The list of databases to which you want to grant permissions. Separate databases with commas (,).
	AllowDatabases pulumi.StringPtrInput
	// The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
	AllowDictionaries pulumi.StringPtrInput
	// The db cluster id.
	DbClusterId pulumi.StringInput
	// Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
	DdlAuthority pulumi.BoolPtrInput
	// Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
	DmlAuthority pulumi.StringPtrInput
	// The list of all databases. Separate databases with commas (,). Field 'total_databases' has been deprecated from provider version 1.223.1.
	//
	// Deprecated: Field 'total_databases' has been deprecated from version 1.223.1 and it will be removed in the future version.
	TotalDatabases pulumi.StringPtrInput
	// The list of all dictionaries. Separate dictionaries with commas (,). Field 'total_dictionaries' has been deprecated from provider version 1.223.1.
	//
	// Deprecated: Field 'total_dictionaries' has been deprecated from version 1.223.1 and it will be removed in the future version.
	TotalDictionaries pulumi.StringPtrInput
	// The type of the database account. Valid values: `Normal` or `Super`.
	Type pulumi.StringPtrInput
}

func (AccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accountArgs)(nil)).Elem()
}

type AccountInput interface {
	pulumi.Input

	ToAccountOutput() AccountOutput
	ToAccountOutputWithContext(ctx context.Context) AccountOutput
}

func (*Account) ElementType() reflect.Type {
	return reflect.TypeOf((**Account)(nil)).Elem()
}

func (i *Account) ToAccountOutput() AccountOutput {
	return i.ToAccountOutputWithContext(context.Background())
}

func (i *Account) ToAccountOutputWithContext(ctx context.Context) AccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountOutput)
}

// AccountArrayInput is an input type that accepts AccountArray and AccountArrayOutput values.
// You can construct a concrete instance of `AccountArrayInput` via:
//
//	AccountArray{ AccountArgs{...} }
type AccountArrayInput interface {
	pulumi.Input

	ToAccountArrayOutput() AccountArrayOutput
	ToAccountArrayOutputWithContext(context.Context) AccountArrayOutput
}

type AccountArray []AccountInput

func (AccountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Account)(nil)).Elem()
}

func (i AccountArray) ToAccountArrayOutput() AccountArrayOutput {
	return i.ToAccountArrayOutputWithContext(context.Background())
}

func (i AccountArray) ToAccountArrayOutputWithContext(ctx context.Context) AccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountArrayOutput)
}

// AccountMapInput is an input type that accepts AccountMap and AccountMapOutput values.
// You can construct a concrete instance of `AccountMapInput` via:
//
//	AccountMap{ "key": AccountArgs{...} }
type AccountMapInput interface {
	pulumi.Input

	ToAccountMapOutput() AccountMapOutput
	ToAccountMapOutputWithContext(context.Context) AccountMapOutput
}

type AccountMap map[string]AccountInput

func (AccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Account)(nil)).Elem()
}

func (i AccountMap) ToAccountMapOutput() AccountMapOutput {
	return i.ToAccountMapOutputWithContext(context.Background())
}

func (i AccountMap) ToAccountMapOutputWithContext(ctx context.Context) AccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountMapOutput)
}

type AccountOutput struct{ *pulumi.OutputState }

func (AccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Account)(nil)).Elem()
}

func (o AccountOutput) ToAccountOutput() AccountOutput {
	return o
}

func (o AccountOutput) ToAccountOutputWithContext(ctx context.Context) AccountOutput {
	return o
}

// In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
func (o AccountOutput) AccountDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.AccountDescription }).(pulumi.StringPtrOutput)
}

// Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
func (o AccountOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.AccountName }).(pulumi.StringOutput)
}

// The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^& author (s):_+-=) in a length of 8-32 bit.
func (o AccountOutput) AccountPassword() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.AccountPassword }).(pulumi.StringOutput)
}

// The list of databases to which you want to grant permissions. Separate databases with commas (,).
func (o AccountOutput) AllowDatabases() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.AllowDatabases }).(pulumi.StringOutput)
}

// The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
func (o AccountOutput) AllowDictionaries() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.AllowDictionaries }).(pulumi.StringOutput)
}

// The db cluster id.
func (o AccountOutput) DbClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.DbClusterId }).(pulumi.StringOutput)
}

// Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
func (o AccountOutput) DdlAuthority() pulumi.BoolOutput {
	return o.ApplyT(func(v *Account) pulumi.BoolOutput { return v.DdlAuthority }).(pulumi.BoolOutput)
}

// Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
func (o AccountOutput) DmlAuthority() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.DmlAuthority }).(pulumi.StringOutput)
}

// The status of the resource. Valid Status: `Creating`,`Available`,`Deleting`.
func (o AccountOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The list of all databases. Separate databases with commas (,). Field 'total_databases' has been deprecated from provider version 1.223.1.
//
// Deprecated: Field 'total_databases' has been deprecated from version 1.223.1 and it will be removed in the future version.
func (o AccountOutput) TotalDatabases() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.TotalDatabases }).(pulumi.StringOutput)
}

// The list of all dictionaries. Separate dictionaries with commas (,). Field 'total_dictionaries' has been deprecated from provider version 1.223.1.
//
// Deprecated: Field 'total_dictionaries' has been deprecated from version 1.223.1 and it will be removed in the future version.
func (o AccountOutput) TotalDictionaries() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.TotalDictionaries }).(pulumi.StringOutput)
}

// The type of the database account. Valid values: `Normal` or `Super`.
func (o AccountOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type AccountArrayOutput struct{ *pulumi.OutputState }

func (AccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Account)(nil)).Elem()
}

func (o AccountArrayOutput) ToAccountArrayOutput() AccountArrayOutput {
	return o
}

func (o AccountArrayOutput) ToAccountArrayOutputWithContext(ctx context.Context) AccountArrayOutput {
	return o
}

func (o AccountArrayOutput) Index(i pulumi.IntInput) AccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Account {
		return vs[0].([]*Account)[vs[1].(int)]
	}).(AccountOutput)
}

type AccountMapOutput struct{ *pulumi.OutputState }

func (AccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Account)(nil)).Elem()
}

func (o AccountMapOutput) ToAccountMapOutput() AccountMapOutput {
	return o
}

func (o AccountMapOutput) ToAccountMapOutputWithContext(ctx context.Context) AccountMapOutput {
	return o
}

func (o AccountMapOutput) MapIndex(k pulumi.StringInput) AccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Account {
		return vs[0].(map[string]*Account)[vs[1].(string)]
	}).(AccountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccountInput)(nil)).Elem(), &Account{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountArrayInput)(nil)).Elem(), AccountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountMapInput)(nil)).Elem(), AccountMap{})
	pulumi.RegisterOutputType(AccountOutput{})
	pulumi.RegisterOutputType(AccountArrayOutput{})
	pulumi.RegisterOutputType(AccountMapOutput{})
}
