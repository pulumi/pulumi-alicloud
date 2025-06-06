// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dts

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DTS Migration Instance resource.
//
// For information about DTS Migration Instance and how to use it, see [What is Synchronization Instance](https://www.alibabacloud.com/help/en/doc-detail/208270.html).
//
// > **NOTE:** Available since v1.157.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dts"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := alicloud.GetRegions(ctx, &alicloud.GetRegionsArgs{
//				Current: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = dts.NewMigrationInstance(ctx, "default", &dts.MigrationInstanceArgs{
//				PaymentType:                   pulumi.String("PayAsYouGo"),
//				SourceEndpointEngineName:      pulumi.String("MySQL"),
//				SourceEndpointRegion:          pulumi.String(_default.Regions[0].Id),
//				DestinationEndpointEngineName: pulumi.String("MySQL"),
//				DestinationEndpointRegion:     pulumi.String(_default.Regions[0].Id),
//				InstanceClass:                 pulumi.String("small"),
//				SyncArchitecture:              pulumi.String("oneway"),
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
// DTS Migration Instance can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:dts/migrationInstance:MigrationInstance example <id>
// ```
type MigrationInstance struct {
	pulumi.CustomResourceState

	// [ETL specifications](https://help.aliyun.com/document_detail/212324.html). The unit is the computing unit ComputeUnit (CU), 1CU=1vCPU+4 GB memory. The value range is an integer greater than or equal to 2.
	ComputeUnit pulumi.IntPtrOutput `pulumi:"computeUnit"`
	// The number of private customized RDS instances under PolarDB-X. The default value is 1. This parameter needs to be passed only when `sourceEndpointEngineName` equals `drds`.
	DatabaseCount pulumi.IntPtrOutput `pulumi:"databaseCount"`
	// The type of destination engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardbO`, `polardbPg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
	DestinationEndpointEngineName pulumi.StringOutput `pulumi:"destinationEndpointEngineName"`
	// The region of destination instance. List of [supported regions](https://help.aliyun.com/document_detail/141033.html).
	DestinationEndpointRegion pulumi.StringOutput `pulumi:"destinationEndpointRegion"`
	// The ID of the Migration Instance.
	DtsInstanceId pulumi.StringOutput `pulumi:"dtsInstanceId"`
	// The instance class. Valid values: `large`, `medium`, `small`, `xlarge`, `xxlarge`. You can only upgrade the configuration, not downgrade the configuration. If you downgrade the instance, you need to [submit a ticket](https://selfservice.console.aliyun.com/ticket/category/dts/today).
	InstanceClass pulumi.StringOutput `pulumi:"instanceClass"`
	// The payment type of the resource. Valid values: `PayAsYouGo`.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// The type of source endpoint engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardbO`, `polardbPg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
	SourceEndpointEngineName pulumi.StringOutput `pulumi:"sourceEndpointEngineName"`
	// The region of source instance.
	SourceEndpointRegion pulumi.StringOutput `pulumi:"sourceEndpointRegion"`
	// The status.
	Status pulumi.StringOutput `pulumi:"status"`
	// The sync architecture. Valid values: `oneway`.
	SyncArchitecture pulumi.StringPtrOutput `pulumi:"syncArchitecture"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewMigrationInstance registers a new resource with the given unique name, arguments, and options.
func NewMigrationInstance(ctx *pulumi.Context,
	name string, args *MigrationInstanceArgs, opts ...pulumi.ResourceOption) (*MigrationInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationEndpointEngineName == nil {
		return nil, errors.New("invalid value for required argument 'DestinationEndpointEngineName'")
	}
	if args.DestinationEndpointRegion == nil {
		return nil, errors.New("invalid value for required argument 'DestinationEndpointRegion'")
	}
	if args.PaymentType == nil {
		return nil, errors.New("invalid value for required argument 'PaymentType'")
	}
	if args.SourceEndpointEngineName == nil {
		return nil, errors.New("invalid value for required argument 'SourceEndpointEngineName'")
	}
	if args.SourceEndpointRegion == nil {
		return nil, errors.New("invalid value for required argument 'SourceEndpointRegion'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MigrationInstance
	err := ctx.RegisterResource("alicloud:dts/migrationInstance:MigrationInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMigrationInstance gets an existing MigrationInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMigrationInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MigrationInstanceState, opts ...pulumi.ResourceOption) (*MigrationInstance, error) {
	var resource MigrationInstance
	err := ctx.ReadResource("alicloud:dts/migrationInstance:MigrationInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MigrationInstance resources.
type migrationInstanceState struct {
	// [ETL specifications](https://help.aliyun.com/document_detail/212324.html). The unit is the computing unit ComputeUnit (CU), 1CU=1vCPU+4 GB memory. The value range is an integer greater than or equal to 2.
	ComputeUnit *int `pulumi:"computeUnit"`
	// The number of private customized RDS instances under PolarDB-X. The default value is 1. This parameter needs to be passed only when `sourceEndpointEngineName` equals `drds`.
	DatabaseCount *int `pulumi:"databaseCount"`
	// The type of destination engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardbO`, `polardbPg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
	DestinationEndpointEngineName *string `pulumi:"destinationEndpointEngineName"`
	// The region of destination instance. List of [supported regions](https://help.aliyun.com/document_detail/141033.html).
	DestinationEndpointRegion *string `pulumi:"destinationEndpointRegion"`
	// The ID of the Migration Instance.
	DtsInstanceId *string `pulumi:"dtsInstanceId"`
	// The instance class. Valid values: `large`, `medium`, `small`, `xlarge`, `xxlarge`. You can only upgrade the configuration, not downgrade the configuration. If you downgrade the instance, you need to [submit a ticket](https://selfservice.console.aliyun.com/ticket/category/dts/today).
	InstanceClass *string `pulumi:"instanceClass"`
	// The payment type of the resource. Valid values: `PayAsYouGo`.
	PaymentType *string `pulumi:"paymentType"`
	// The type of source endpoint engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardbO`, `polardbPg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
	SourceEndpointEngineName *string `pulumi:"sourceEndpointEngineName"`
	// The region of source instance.
	SourceEndpointRegion *string `pulumi:"sourceEndpointRegion"`
	// The status.
	Status *string `pulumi:"status"`
	// The sync architecture. Valid values: `oneway`.
	SyncArchitecture *string `pulumi:"syncArchitecture"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

type MigrationInstanceState struct {
	// [ETL specifications](https://help.aliyun.com/document_detail/212324.html). The unit is the computing unit ComputeUnit (CU), 1CU=1vCPU+4 GB memory. The value range is an integer greater than or equal to 2.
	ComputeUnit pulumi.IntPtrInput
	// The number of private customized RDS instances under PolarDB-X. The default value is 1. This parameter needs to be passed only when `sourceEndpointEngineName` equals `drds`.
	DatabaseCount pulumi.IntPtrInput
	// The type of destination engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardbO`, `polardbPg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
	DestinationEndpointEngineName pulumi.StringPtrInput
	// The region of destination instance. List of [supported regions](https://help.aliyun.com/document_detail/141033.html).
	DestinationEndpointRegion pulumi.StringPtrInput
	// The ID of the Migration Instance.
	DtsInstanceId pulumi.StringPtrInput
	// The instance class. Valid values: `large`, `medium`, `small`, `xlarge`, `xxlarge`. You can only upgrade the configuration, not downgrade the configuration. If you downgrade the instance, you need to [submit a ticket](https://selfservice.console.aliyun.com/ticket/category/dts/today).
	InstanceClass pulumi.StringPtrInput
	// The payment type of the resource. Valid values: `PayAsYouGo`.
	PaymentType pulumi.StringPtrInput
	// The type of source endpoint engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardbO`, `polardbPg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
	SourceEndpointEngineName pulumi.StringPtrInput
	// The region of source instance.
	SourceEndpointRegion pulumi.StringPtrInput
	// The status.
	Status pulumi.StringPtrInput
	// The sync architecture. Valid values: `oneway`.
	SyncArchitecture pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (MigrationInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*migrationInstanceState)(nil)).Elem()
}

type migrationInstanceArgs struct {
	// [ETL specifications](https://help.aliyun.com/document_detail/212324.html). The unit is the computing unit ComputeUnit (CU), 1CU=1vCPU+4 GB memory. The value range is an integer greater than or equal to 2.
	ComputeUnit *int `pulumi:"computeUnit"`
	// The number of private customized RDS instances under PolarDB-X. The default value is 1. This parameter needs to be passed only when `sourceEndpointEngineName` equals `drds`.
	DatabaseCount *int `pulumi:"databaseCount"`
	// The type of destination engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardbO`, `polardbPg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
	DestinationEndpointEngineName string `pulumi:"destinationEndpointEngineName"`
	// The region of destination instance. List of [supported regions](https://help.aliyun.com/document_detail/141033.html).
	DestinationEndpointRegion string `pulumi:"destinationEndpointRegion"`
	// The instance class. Valid values: `large`, `medium`, `small`, `xlarge`, `xxlarge`. You can only upgrade the configuration, not downgrade the configuration. If you downgrade the instance, you need to [submit a ticket](https://selfservice.console.aliyun.com/ticket/category/dts/today).
	InstanceClass *string `pulumi:"instanceClass"`
	// The payment type of the resource. Valid values: `PayAsYouGo`.
	PaymentType string `pulumi:"paymentType"`
	// The type of source endpoint engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardbO`, `polardbPg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
	SourceEndpointEngineName string `pulumi:"sourceEndpointEngineName"`
	// The region of source instance.
	SourceEndpointRegion string `pulumi:"sourceEndpointRegion"`
	// The sync architecture. Valid values: `oneway`.
	SyncArchitecture *string `pulumi:"syncArchitecture"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a MigrationInstance resource.
type MigrationInstanceArgs struct {
	// [ETL specifications](https://help.aliyun.com/document_detail/212324.html). The unit is the computing unit ComputeUnit (CU), 1CU=1vCPU+4 GB memory. The value range is an integer greater than or equal to 2.
	ComputeUnit pulumi.IntPtrInput
	// The number of private customized RDS instances under PolarDB-X. The default value is 1. This parameter needs to be passed only when `sourceEndpointEngineName` equals `drds`.
	DatabaseCount pulumi.IntPtrInput
	// The type of destination engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardbO`, `polardbPg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
	DestinationEndpointEngineName pulumi.StringInput
	// The region of destination instance. List of [supported regions](https://help.aliyun.com/document_detail/141033.html).
	DestinationEndpointRegion pulumi.StringInput
	// The instance class. Valid values: `large`, `medium`, `small`, `xlarge`, `xxlarge`. You can only upgrade the configuration, not downgrade the configuration. If you downgrade the instance, you need to [submit a ticket](https://selfservice.console.aliyun.com/ticket/category/dts/today).
	InstanceClass pulumi.StringPtrInput
	// The payment type of the resource. Valid values: `PayAsYouGo`.
	PaymentType pulumi.StringInput
	// The type of source endpoint engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardbO`, `polardbPg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
	SourceEndpointEngineName pulumi.StringInput
	// The region of source instance.
	SourceEndpointRegion pulumi.StringInput
	// The sync architecture. Valid values: `oneway`.
	SyncArchitecture pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (MigrationInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*migrationInstanceArgs)(nil)).Elem()
}

type MigrationInstanceInput interface {
	pulumi.Input

	ToMigrationInstanceOutput() MigrationInstanceOutput
	ToMigrationInstanceOutputWithContext(ctx context.Context) MigrationInstanceOutput
}

func (*MigrationInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**MigrationInstance)(nil)).Elem()
}

func (i *MigrationInstance) ToMigrationInstanceOutput() MigrationInstanceOutput {
	return i.ToMigrationInstanceOutputWithContext(context.Background())
}

func (i *MigrationInstance) ToMigrationInstanceOutputWithContext(ctx context.Context) MigrationInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MigrationInstanceOutput)
}

// MigrationInstanceArrayInput is an input type that accepts MigrationInstanceArray and MigrationInstanceArrayOutput values.
// You can construct a concrete instance of `MigrationInstanceArrayInput` via:
//
//	MigrationInstanceArray{ MigrationInstanceArgs{...} }
type MigrationInstanceArrayInput interface {
	pulumi.Input

	ToMigrationInstanceArrayOutput() MigrationInstanceArrayOutput
	ToMigrationInstanceArrayOutputWithContext(context.Context) MigrationInstanceArrayOutput
}

type MigrationInstanceArray []MigrationInstanceInput

func (MigrationInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MigrationInstance)(nil)).Elem()
}

func (i MigrationInstanceArray) ToMigrationInstanceArrayOutput() MigrationInstanceArrayOutput {
	return i.ToMigrationInstanceArrayOutputWithContext(context.Background())
}

func (i MigrationInstanceArray) ToMigrationInstanceArrayOutputWithContext(ctx context.Context) MigrationInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MigrationInstanceArrayOutput)
}

// MigrationInstanceMapInput is an input type that accepts MigrationInstanceMap and MigrationInstanceMapOutput values.
// You can construct a concrete instance of `MigrationInstanceMapInput` via:
//
//	MigrationInstanceMap{ "key": MigrationInstanceArgs{...} }
type MigrationInstanceMapInput interface {
	pulumi.Input

	ToMigrationInstanceMapOutput() MigrationInstanceMapOutput
	ToMigrationInstanceMapOutputWithContext(context.Context) MigrationInstanceMapOutput
}

type MigrationInstanceMap map[string]MigrationInstanceInput

func (MigrationInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MigrationInstance)(nil)).Elem()
}

func (i MigrationInstanceMap) ToMigrationInstanceMapOutput() MigrationInstanceMapOutput {
	return i.ToMigrationInstanceMapOutputWithContext(context.Background())
}

func (i MigrationInstanceMap) ToMigrationInstanceMapOutputWithContext(ctx context.Context) MigrationInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MigrationInstanceMapOutput)
}

type MigrationInstanceOutput struct{ *pulumi.OutputState }

func (MigrationInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MigrationInstance)(nil)).Elem()
}

func (o MigrationInstanceOutput) ToMigrationInstanceOutput() MigrationInstanceOutput {
	return o
}

func (o MigrationInstanceOutput) ToMigrationInstanceOutputWithContext(ctx context.Context) MigrationInstanceOutput {
	return o
}

// [ETL specifications](https://help.aliyun.com/document_detail/212324.html). The unit is the computing unit ComputeUnit (CU), 1CU=1vCPU+4 GB memory. The value range is an integer greater than or equal to 2.
func (o MigrationInstanceOutput) ComputeUnit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MigrationInstance) pulumi.IntPtrOutput { return v.ComputeUnit }).(pulumi.IntPtrOutput)
}

// The number of private customized RDS instances under PolarDB-X. The default value is 1. This parameter needs to be passed only when `sourceEndpointEngineName` equals `drds`.
func (o MigrationInstanceOutput) DatabaseCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MigrationInstance) pulumi.IntPtrOutput { return v.DatabaseCount }).(pulumi.IntPtrOutput)
}

// The type of destination engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardbO`, `polardbPg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
func (o MigrationInstanceOutput) DestinationEndpointEngineName() pulumi.StringOutput {
	return o.ApplyT(func(v *MigrationInstance) pulumi.StringOutput { return v.DestinationEndpointEngineName }).(pulumi.StringOutput)
}

// The region of destination instance. List of [supported regions](https://help.aliyun.com/document_detail/141033.html).
func (o MigrationInstanceOutput) DestinationEndpointRegion() pulumi.StringOutput {
	return o.ApplyT(func(v *MigrationInstance) pulumi.StringOutput { return v.DestinationEndpointRegion }).(pulumi.StringOutput)
}

// The ID of the Migration Instance.
func (o MigrationInstanceOutput) DtsInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *MigrationInstance) pulumi.StringOutput { return v.DtsInstanceId }).(pulumi.StringOutput)
}

// The instance class. Valid values: `large`, `medium`, `small`, `xlarge`, `xxlarge`. You can only upgrade the configuration, not downgrade the configuration. If you downgrade the instance, you need to [submit a ticket](https://selfservice.console.aliyun.com/ticket/category/dts/today).
func (o MigrationInstanceOutput) InstanceClass() pulumi.StringOutput {
	return o.ApplyT(func(v *MigrationInstance) pulumi.StringOutput { return v.InstanceClass }).(pulumi.StringOutput)
}

// The payment type of the resource. Valid values: `PayAsYouGo`.
func (o MigrationInstanceOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *MigrationInstance) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// The type of source endpoint engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardbO`, `polardbPg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
func (o MigrationInstanceOutput) SourceEndpointEngineName() pulumi.StringOutput {
	return o.ApplyT(func(v *MigrationInstance) pulumi.StringOutput { return v.SourceEndpointEngineName }).(pulumi.StringOutput)
}

// The region of source instance.
func (o MigrationInstanceOutput) SourceEndpointRegion() pulumi.StringOutput {
	return o.ApplyT(func(v *MigrationInstance) pulumi.StringOutput { return v.SourceEndpointRegion }).(pulumi.StringOutput)
}

// The status.
func (o MigrationInstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *MigrationInstance) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The sync architecture. Valid values: `oneway`.
func (o MigrationInstanceOutput) SyncArchitecture() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MigrationInstance) pulumi.StringPtrOutput { return v.SyncArchitecture }).(pulumi.StringPtrOutput)
}

// A mapping of tags to assign to the resource.
func (o MigrationInstanceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *MigrationInstance) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type MigrationInstanceArrayOutput struct{ *pulumi.OutputState }

func (MigrationInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MigrationInstance)(nil)).Elem()
}

func (o MigrationInstanceArrayOutput) ToMigrationInstanceArrayOutput() MigrationInstanceArrayOutput {
	return o
}

func (o MigrationInstanceArrayOutput) ToMigrationInstanceArrayOutputWithContext(ctx context.Context) MigrationInstanceArrayOutput {
	return o
}

func (o MigrationInstanceArrayOutput) Index(i pulumi.IntInput) MigrationInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MigrationInstance {
		return vs[0].([]*MigrationInstance)[vs[1].(int)]
	}).(MigrationInstanceOutput)
}

type MigrationInstanceMapOutput struct{ *pulumi.OutputState }

func (MigrationInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MigrationInstance)(nil)).Elem()
}

func (o MigrationInstanceMapOutput) ToMigrationInstanceMapOutput() MigrationInstanceMapOutput {
	return o
}

func (o MigrationInstanceMapOutput) ToMigrationInstanceMapOutputWithContext(ctx context.Context) MigrationInstanceMapOutput {
	return o
}

func (o MigrationInstanceMapOutput) MapIndex(k pulumi.StringInput) MigrationInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MigrationInstance {
		return vs[0].(map[string]*MigrationInstance)[vs[1].(string)]
	}).(MigrationInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MigrationInstanceInput)(nil)).Elem(), &MigrationInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*MigrationInstanceArrayInput)(nil)).Elem(), MigrationInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MigrationInstanceMapInput)(nil)).Elem(), MigrationInstanceMap{})
	pulumi.RegisterOutputType(MigrationInstanceOutput{})
	pulumi.RegisterOutputType(MigrationInstanceArrayOutput{})
	pulumi.RegisterOutputType(MigrationInstanceMapOutput{})
}
