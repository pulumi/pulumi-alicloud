// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataworks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Data Works Di Job resource.
//
// Data Integration Tasks.
//
// For information about Data Works Di Job and how to use it, see [What is Di Job](https://www.alibabacloud.com/help/en/dataworks/developer-reference/api-dataworks-public-2024-05-18-createdijob).
//
// > **NOTE:** Available since v1.241.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dataworks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform_example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultMMHL8U, err := dataworks.NewProject(ctx, "defaultMMHL8U", &dataworks.ProjectArgs{
//				ProjectName:    pulumi.String(name),
//				DisplayName:    pulumi.String(name),
//				Description:    pulumi.String(name),
//				PaiTaskEnabled: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = dataworks.NewDiJob(ctx, "default", &dataworks.DiJobArgs{
//				Description:   pulumi.String(name),
//				ProjectId:     defaultMMHL8U.ID(),
//				JobName:       pulumi.String("zhenyuan_example_case"),
//				MigrationType: pulumi.String("api_FullAndRealtimeIncremental"),
//				SourceDataSourceSettings: dataworks.DiJobSourceDataSourceSettingArray{
//					&dataworks.DiJobSourceDataSourceSettingArgs{
//						DataSourceName: pulumi.String("dw_mysql"),
//						DataSourceProperties: &dataworks.DiJobSourceDataSourceSettingDataSourcePropertiesArgs{
//							Encoding: pulumi.String("utf-8"),
//							Timezone: pulumi.String("Asia/Shanghai"),
//						},
//					},
//				},
//				DestinationDataSourceType: pulumi.String("Hologres"),
//				TableMappings: dataworks.DiJobTableMappingArray{
//					&dataworks.DiJobTableMappingArgs{
//						SourceObjectSelectionRules: dataworks.DiJobTableMappingSourceObjectSelectionRuleArray{
//							&dataworks.DiJobTableMappingSourceObjectSelectionRuleArgs{
//								Action:         pulumi.String("Include"),
//								Expression:     pulumi.String("dw_mysql"),
//								ExpressionType: pulumi.String("Exact"),
//								ObjectType:     pulumi.String("Datasource"),
//							},
//							&dataworks.DiJobTableMappingSourceObjectSelectionRuleArgs{
//								Action:         pulumi.String("Include"),
//								Expression:     pulumi.String("example_db1"),
//								ExpressionType: pulumi.String("Exact"),
//								ObjectType:     pulumi.String("Database"),
//							},
//							&dataworks.DiJobTableMappingSourceObjectSelectionRuleArgs{
//								Action:         pulumi.String("Include"),
//								Expression:     pulumi.String("lsc_example01"),
//								ExpressionType: pulumi.String("Exact"),
//								ObjectType:     pulumi.String("Table"),
//							},
//						},
//						TransformationRules: dataworks.DiJobTableMappingTransformationRuleArray{
//							&dataworks.DiJobTableMappingTransformationRuleArgs{
//								RuleName:       pulumi.String("my_table_rename_rule"),
//								RuleActionType: pulumi.String("Rename"),
//								RuleTargetType: pulumi.String("Table"),
//							},
//						},
//					},
//				},
//				SourceDataSourceType: pulumi.String("MySQL"),
//				ResourceSettings: &dataworks.DiJobResourceSettingsArgs{
//					OfflineResourceSettings: &dataworks.DiJobResourceSettingsOfflineResourceSettingsArgs{
//						RequestedCu:             pulumi.Float64(2),
//						ResourceGroupIdentifier: pulumi.String("S_res_group_524257424564736_1716799673667"),
//					},
//					RealtimeResourceSettings: &dataworks.DiJobResourceSettingsRealtimeResourceSettingsArgs{
//						RequestedCu:             pulumi.Float64(2),
//						ResourceGroupIdentifier: pulumi.String("S_res_group_524257424564736_1716799673667"),
//					},
//					ScheduleResourceSettings: &dataworks.DiJobResourceSettingsScheduleResourceSettingsArgs{
//						RequestedCu:             pulumi.Float64(2),
//						ResourceGroupIdentifier: pulumi.String("S_res_group_524257424564736_1716799673667"),
//					},
//				},
//				TransformationRules: dataworks.DiJobTransformationRuleArray{
//					&dataworks.DiJobTransformationRuleArgs{
//						RuleActionType: pulumi.String("Rename"),
//						RuleExpression: pulumi.String("{\"expression\":\"table2\"}"),
//						RuleName:       pulumi.String("my_table_rename_rule"),
//						RuleTargetType: pulumi.String("Table"),
//					},
//				},
//				DestinationDataSourceSettings: dataworks.DiJobDestinationDataSourceSettingArray{
//					&dataworks.DiJobDestinationDataSourceSettingArgs{
//						DataSourceName: pulumi.String("dw_example_holo"),
//					},
//				},
//				JobSettings: &dataworks.DiJobJobSettingsArgs{
//					ColumnDataTypeSettings: dataworks.DiJobJobSettingsColumnDataTypeSettingArray{
//						&dataworks.DiJobJobSettingsColumnDataTypeSettingArgs{
//							DestinationDataType: pulumi.String("bigint"),
//							SourceDataType:      pulumi.String("longtext"),
//						},
//					},
//					DdlHandlingSettings: dataworks.DiJobJobSettingsDdlHandlingSettingArray{
//						&dataworks.DiJobJobSettingsDdlHandlingSettingArgs{
//							Action: pulumi.String("Ignore"),
//							Type:   pulumi.String("CreateTable"),
//						},
//					},
//					RuntimeSettings: dataworks.DiJobJobSettingsRuntimeSettingArray{
//						&dataworks.DiJobJobSettingsRuntimeSettingArgs{
//							Name:  pulumi.String("runtime.realtime.concurrent"),
//							Value: pulumi.String("1"),
//						},
//					},
//					ChannelSettings: pulumi.String("1"),
//					CycleScheduleSettings: &dataworks.DiJobJobSettingsCycleScheduleSettingsArgs{
//						CycleMigrationType: pulumi.String("2"),
//						ScheduleParameters: pulumi.String("3"),
//					},
//				},
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
// Data Works Di Job can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:dataworks/diJob:DiJob example <project_id>:<di_job_id>
// ```
type DiJob struct {
	pulumi.CustomResourceState

	// Description of the integration task
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Destination data source See `destinationDataSourceSettings` below.
	DestinationDataSourceSettings DiJobDestinationDataSourceSettingArrayOutput `pulumi:"destinationDataSourceSettings"`
	// The type of the target data source. Enumerated values: Hologres and Hive.
	DestinationDataSourceType pulumi.StringOutput `pulumi:"destinationDataSourceType"`
	// Integration Task Id
	DiJobId pulumi.IntOutput `pulumi:"diJobId"`
	// Task Name.
	JobName pulumi.StringOutput `pulumi:"jobName"`
	// The dimension settings of the synchronization task, including the DDL processing policy, the source and destination column data type mapping policy, and the task runtime parameters. See `jobSettings` below.
	JobSettings DiJobJobSettingsPtrOutput `pulumi:"jobSettings"`
	// Synchronization type, optional enumeration values are:
	//
	// Fulllandrealtimeincremental (full and real-time incremental)
	//
	// RealtimeIncremental
	//
	// Full
	//
	// Offflineincremental
	//
	// FullAndOfflineIncremental (full amount + offline increment)
	MigrationType pulumi.StringOutput `pulumi:"migrationType"`
	// Project Id
	ProjectId pulumi.IntOutput `pulumi:"projectId"`
	// Resource Group Properties See `resourceSettings` below.
	ResourceSettings DiJobResourceSettingsOutput `pulumi:"resourceSettings"`
	// Source data source setting List See `sourceDataSourceSettings` below.
	SourceDataSourceSettings DiJobSourceDataSourceSettingArrayOutput `pulumi:"sourceDataSourceSettings"`
	// The type of the source data source. The enumerated value is MySQL.
	SourceDataSourceType pulumi.StringOutput `pulumi:"sourceDataSourceType"`
	// Synchronize object transformation mapping list See `tableMappings` below.
	TableMappings DiJobTableMappingArrayOutput `pulumi:"tableMappings"`
	// Definition list of synchronization object conversion rules See `transformationRules` below.
	TransformationRules DiJobTransformationRuleArrayOutput `pulumi:"transformationRules"`
}

// NewDiJob registers a new resource with the given unique name, arguments, and options.
func NewDiJob(ctx *pulumi.Context,
	name string, args *DiJobArgs, opts ...pulumi.ResourceOption) (*DiJob, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationDataSourceSettings == nil {
		return nil, errors.New("invalid value for required argument 'DestinationDataSourceSettings'")
	}
	if args.DestinationDataSourceType == nil {
		return nil, errors.New("invalid value for required argument 'DestinationDataSourceType'")
	}
	if args.JobName == nil {
		return nil, errors.New("invalid value for required argument 'JobName'")
	}
	if args.MigrationType == nil {
		return nil, errors.New("invalid value for required argument 'MigrationType'")
	}
	if args.ResourceSettings == nil {
		return nil, errors.New("invalid value for required argument 'ResourceSettings'")
	}
	if args.SourceDataSourceSettings == nil {
		return nil, errors.New("invalid value for required argument 'SourceDataSourceSettings'")
	}
	if args.SourceDataSourceType == nil {
		return nil, errors.New("invalid value for required argument 'SourceDataSourceType'")
	}
	if args.TableMappings == nil {
		return nil, errors.New("invalid value for required argument 'TableMappings'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DiJob
	err := ctx.RegisterResource("alicloud:dataworks/diJob:DiJob", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDiJob gets an existing DiJob resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDiJob(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DiJobState, opts ...pulumi.ResourceOption) (*DiJob, error) {
	var resource DiJob
	err := ctx.ReadResource("alicloud:dataworks/diJob:DiJob", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DiJob resources.
type diJobState struct {
	// Description of the integration task
	Description *string `pulumi:"description"`
	// Destination data source See `destinationDataSourceSettings` below.
	DestinationDataSourceSettings []DiJobDestinationDataSourceSetting `pulumi:"destinationDataSourceSettings"`
	// The type of the target data source. Enumerated values: Hologres and Hive.
	DestinationDataSourceType *string `pulumi:"destinationDataSourceType"`
	// Integration Task Id
	DiJobId *int `pulumi:"diJobId"`
	// Task Name.
	JobName *string `pulumi:"jobName"`
	// The dimension settings of the synchronization task, including the DDL processing policy, the source and destination column data type mapping policy, and the task runtime parameters. See `jobSettings` below.
	JobSettings *DiJobJobSettings `pulumi:"jobSettings"`
	// Synchronization type, optional enumeration values are:
	//
	// Fulllandrealtimeincremental (full and real-time incremental)
	//
	// RealtimeIncremental
	//
	// Full
	//
	// Offflineincremental
	//
	// FullAndOfflineIncremental (full amount + offline increment)
	MigrationType *string `pulumi:"migrationType"`
	// Project Id
	ProjectId *int `pulumi:"projectId"`
	// Resource Group Properties See `resourceSettings` below.
	ResourceSettings *DiJobResourceSettings `pulumi:"resourceSettings"`
	// Source data source setting List See `sourceDataSourceSettings` below.
	SourceDataSourceSettings []DiJobSourceDataSourceSetting `pulumi:"sourceDataSourceSettings"`
	// The type of the source data source. The enumerated value is MySQL.
	SourceDataSourceType *string `pulumi:"sourceDataSourceType"`
	// Synchronize object transformation mapping list See `tableMappings` below.
	TableMappings []DiJobTableMapping `pulumi:"tableMappings"`
	// Definition list of synchronization object conversion rules See `transformationRules` below.
	TransformationRules []DiJobTransformationRule `pulumi:"transformationRules"`
}

type DiJobState struct {
	// Description of the integration task
	Description pulumi.StringPtrInput
	// Destination data source See `destinationDataSourceSettings` below.
	DestinationDataSourceSettings DiJobDestinationDataSourceSettingArrayInput
	// The type of the target data source. Enumerated values: Hologres and Hive.
	DestinationDataSourceType pulumi.StringPtrInput
	// Integration Task Id
	DiJobId pulumi.IntPtrInput
	// Task Name.
	JobName pulumi.StringPtrInput
	// The dimension settings of the synchronization task, including the DDL processing policy, the source and destination column data type mapping policy, and the task runtime parameters. See `jobSettings` below.
	JobSettings DiJobJobSettingsPtrInput
	// Synchronization type, optional enumeration values are:
	//
	// Fulllandrealtimeincremental (full and real-time incremental)
	//
	// RealtimeIncremental
	//
	// Full
	//
	// Offflineincremental
	//
	// FullAndOfflineIncremental (full amount + offline increment)
	MigrationType pulumi.StringPtrInput
	// Project Id
	ProjectId pulumi.IntPtrInput
	// Resource Group Properties See `resourceSettings` below.
	ResourceSettings DiJobResourceSettingsPtrInput
	// Source data source setting List See `sourceDataSourceSettings` below.
	SourceDataSourceSettings DiJobSourceDataSourceSettingArrayInput
	// The type of the source data source. The enumerated value is MySQL.
	SourceDataSourceType pulumi.StringPtrInput
	// Synchronize object transformation mapping list See `tableMappings` below.
	TableMappings DiJobTableMappingArrayInput
	// Definition list of synchronization object conversion rules See `transformationRules` below.
	TransformationRules DiJobTransformationRuleArrayInput
}

func (DiJobState) ElementType() reflect.Type {
	return reflect.TypeOf((*diJobState)(nil)).Elem()
}

type diJobArgs struct {
	// Description of the integration task
	Description *string `pulumi:"description"`
	// Destination data source See `destinationDataSourceSettings` below.
	DestinationDataSourceSettings []DiJobDestinationDataSourceSetting `pulumi:"destinationDataSourceSettings"`
	// The type of the target data source. Enumerated values: Hologres and Hive.
	DestinationDataSourceType string `pulumi:"destinationDataSourceType"`
	// Task Name.
	JobName string `pulumi:"jobName"`
	// The dimension settings of the synchronization task, including the DDL processing policy, the source and destination column data type mapping policy, and the task runtime parameters. See `jobSettings` below.
	JobSettings *DiJobJobSettings `pulumi:"jobSettings"`
	// Synchronization type, optional enumeration values are:
	//
	// Fulllandrealtimeincremental (full and real-time incremental)
	//
	// RealtimeIncremental
	//
	// Full
	//
	// Offflineincremental
	//
	// FullAndOfflineIncremental (full amount + offline increment)
	MigrationType string `pulumi:"migrationType"`
	// Project Id
	ProjectId *int `pulumi:"projectId"`
	// Resource Group Properties See `resourceSettings` below.
	ResourceSettings DiJobResourceSettings `pulumi:"resourceSettings"`
	// Source data source setting List See `sourceDataSourceSettings` below.
	SourceDataSourceSettings []DiJobSourceDataSourceSetting `pulumi:"sourceDataSourceSettings"`
	// The type of the source data source. The enumerated value is MySQL.
	SourceDataSourceType string `pulumi:"sourceDataSourceType"`
	// Synchronize object transformation mapping list See `tableMappings` below.
	TableMappings []DiJobTableMapping `pulumi:"tableMappings"`
	// Definition list of synchronization object conversion rules See `transformationRules` below.
	TransformationRules []DiJobTransformationRule `pulumi:"transformationRules"`
}

// The set of arguments for constructing a DiJob resource.
type DiJobArgs struct {
	// Description of the integration task
	Description pulumi.StringPtrInput
	// Destination data source See `destinationDataSourceSettings` below.
	DestinationDataSourceSettings DiJobDestinationDataSourceSettingArrayInput
	// The type of the target data source. Enumerated values: Hologres and Hive.
	DestinationDataSourceType pulumi.StringInput
	// Task Name.
	JobName pulumi.StringInput
	// The dimension settings of the synchronization task, including the DDL processing policy, the source and destination column data type mapping policy, and the task runtime parameters. See `jobSettings` below.
	JobSettings DiJobJobSettingsPtrInput
	// Synchronization type, optional enumeration values are:
	//
	// Fulllandrealtimeincremental (full and real-time incremental)
	//
	// RealtimeIncremental
	//
	// Full
	//
	// Offflineincremental
	//
	// FullAndOfflineIncremental (full amount + offline increment)
	MigrationType pulumi.StringInput
	// Project Id
	ProjectId pulumi.IntPtrInput
	// Resource Group Properties See `resourceSettings` below.
	ResourceSettings DiJobResourceSettingsInput
	// Source data source setting List See `sourceDataSourceSettings` below.
	SourceDataSourceSettings DiJobSourceDataSourceSettingArrayInput
	// The type of the source data source. The enumerated value is MySQL.
	SourceDataSourceType pulumi.StringInput
	// Synchronize object transformation mapping list See `tableMappings` below.
	TableMappings DiJobTableMappingArrayInput
	// Definition list of synchronization object conversion rules See `transformationRules` below.
	TransformationRules DiJobTransformationRuleArrayInput
}

func (DiJobArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*diJobArgs)(nil)).Elem()
}

type DiJobInput interface {
	pulumi.Input

	ToDiJobOutput() DiJobOutput
	ToDiJobOutputWithContext(ctx context.Context) DiJobOutput
}

func (*DiJob) ElementType() reflect.Type {
	return reflect.TypeOf((**DiJob)(nil)).Elem()
}

func (i *DiJob) ToDiJobOutput() DiJobOutput {
	return i.ToDiJobOutputWithContext(context.Background())
}

func (i *DiJob) ToDiJobOutputWithContext(ctx context.Context) DiJobOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiJobOutput)
}

// DiJobArrayInput is an input type that accepts DiJobArray and DiJobArrayOutput values.
// You can construct a concrete instance of `DiJobArrayInput` via:
//
//	DiJobArray{ DiJobArgs{...} }
type DiJobArrayInput interface {
	pulumi.Input

	ToDiJobArrayOutput() DiJobArrayOutput
	ToDiJobArrayOutputWithContext(context.Context) DiJobArrayOutput
}

type DiJobArray []DiJobInput

func (DiJobArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiJob)(nil)).Elem()
}

func (i DiJobArray) ToDiJobArrayOutput() DiJobArrayOutput {
	return i.ToDiJobArrayOutputWithContext(context.Background())
}

func (i DiJobArray) ToDiJobArrayOutputWithContext(ctx context.Context) DiJobArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiJobArrayOutput)
}

// DiJobMapInput is an input type that accepts DiJobMap and DiJobMapOutput values.
// You can construct a concrete instance of `DiJobMapInput` via:
//
//	DiJobMap{ "key": DiJobArgs{...} }
type DiJobMapInput interface {
	pulumi.Input

	ToDiJobMapOutput() DiJobMapOutput
	ToDiJobMapOutputWithContext(context.Context) DiJobMapOutput
}

type DiJobMap map[string]DiJobInput

func (DiJobMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiJob)(nil)).Elem()
}

func (i DiJobMap) ToDiJobMapOutput() DiJobMapOutput {
	return i.ToDiJobMapOutputWithContext(context.Background())
}

func (i DiJobMap) ToDiJobMapOutputWithContext(ctx context.Context) DiJobMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiJobMapOutput)
}

type DiJobOutput struct{ *pulumi.OutputState }

func (DiJobOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DiJob)(nil)).Elem()
}

func (o DiJobOutput) ToDiJobOutput() DiJobOutput {
	return o
}

func (o DiJobOutput) ToDiJobOutputWithContext(ctx context.Context) DiJobOutput {
	return o
}

// Description of the integration task
func (o DiJobOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DiJob) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Destination data source See `destinationDataSourceSettings` below.
func (o DiJobOutput) DestinationDataSourceSettings() DiJobDestinationDataSourceSettingArrayOutput {
	return o.ApplyT(func(v *DiJob) DiJobDestinationDataSourceSettingArrayOutput { return v.DestinationDataSourceSettings }).(DiJobDestinationDataSourceSettingArrayOutput)
}

// The type of the target data source. Enumerated values: Hologres and Hive.
func (o DiJobOutput) DestinationDataSourceType() pulumi.StringOutput {
	return o.ApplyT(func(v *DiJob) pulumi.StringOutput { return v.DestinationDataSourceType }).(pulumi.StringOutput)
}

// Integration Task Id
func (o DiJobOutput) DiJobId() pulumi.IntOutput {
	return o.ApplyT(func(v *DiJob) pulumi.IntOutput { return v.DiJobId }).(pulumi.IntOutput)
}

// Task Name.
func (o DiJobOutput) JobName() pulumi.StringOutput {
	return o.ApplyT(func(v *DiJob) pulumi.StringOutput { return v.JobName }).(pulumi.StringOutput)
}

// The dimension settings of the synchronization task, including the DDL processing policy, the source and destination column data type mapping policy, and the task runtime parameters. See `jobSettings` below.
func (o DiJobOutput) JobSettings() DiJobJobSettingsPtrOutput {
	return o.ApplyT(func(v *DiJob) DiJobJobSettingsPtrOutput { return v.JobSettings }).(DiJobJobSettingsPtrOutput)
}

// Synchronization type, optional enumeration values are:
//
// Fulllandrealtimeincremental (full and real-time incremental)
//
// # RealtimeIncremental
//
// # Full
//
// # Offflineincremental
//
// FullAndOfflineIncremental (full amount + offline increment)
func (o DiJobOutput) MigrationType() pulumi.StringOutput {
	return o.ApplyT(func(v *DiJob) pulumi.StringOutput { return v.MigrationType }).(pulumi.StringOutput)
}

// Project Id
func (o DiJobOutput) ProjectId() pulumi.IntOutput {
	return o.ApplyT(func(v *DiJob) pulumi.IntOutput { return v.ProjectId }).(pulumi.IntOutput)
}

// Resource Group Properties See `resourceSettings` below.
func (o DiJobOutput) ResourceSettings() DiJobResourceSettingsOutput {
	return o.ApplyT(func(v *DiJob) DiJobResourceSettingsOutput { return v.ResourceSettings }).(DiJobResourceSettingsOutput)
}

// Source data source setting List See `sourceDataSourceSettings` below.
func (o DiJobOutput) SourceDataSourceSettings() DiJobSourceDataSourceSettingArrayOutput {
	return o.ApplyT(func(v *DiJob) DiJobSourceDataSourceSettingArrayOutput { return v.SourceDataSourceSettings }).(DiJobSourceDataSourceSettingArrayOutput)
}

// The type of the source data source. The enumerated value is MySQL.
func (o DiJobOutput) SourceDataSourceType() pulumi.StringOutput {
	return o.ApplyT(func(v *DiJob) pulumi.StringOutput { return v.SourceDataSourceType }).(pulumi.StringOutput)
}

// Synchronize object transformation mapping list See `tableMappings` below.
func (o DiJobOutput) TableMappings() DiJobTableMappingArrayOutput {
	return o.ApplyT(func(v *DiJob) DiJobTableMappingArrayOutput { return v.TableMappings }).(DiJobTableMappingArrayOutput)
}

// Definition list of synchronization object conversion rules See `transformationRules` below.
func (o DiJobOutput) TransformationRules() DiJobTransformationRuleArrayOutput {
	return o.ApplyT(func(v *DiJob) DiJobTransformationRuleArrayOutput { return v.TransformationRules }).(DiJobTransformationRuleArrayOutput)
}

type DiJobArrayOutput struct{ *pulumi.OutputState }

func (DiJobArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiJob)(nil)).Elem()
}

func (o DiJobArrayOutput) ToDiJobArrayOutput() DiJobArrayOutput {
	return o
}

func (o DiJobArrayOutput) ToDiJobArrayOutputWithContext(ctx context.Context) DiJobArrayOutput {
	return o
}

func (o DiJobArrayOutput) Index(i pulumi.IntInput) DiJobOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DiJob {
		return vs[0].([]*DiJob)[vs[1].(int)]
	}).(DiJobOutput)
}

type DiJobMapOutput struct{ *pulumi.OutputState }

func (DiJobMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiJob)(nil)).Elem()
}

func (o DiJobMapOutput) ToDiJobMapOutput() DiJobMapOutput {
	return o
}

func (o DiJobMapOutput) ToDiJobMapOutputWithContext(ctx context.Context) DiJobMapOutput {
	return o
}

func (o DiJobMapOutput) MapIndex(k pulumi.StringInput) DiJobOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DiJob {
		return vs[0].(map[string]*DiJob)[vs[1].(string)]
	}).(DiJobOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DiJobInput)(nil)).Elem(), &DiJob{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiJobArrayInput)(nil)).Elem(), DiJobArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiJobMapInput)(nil)).Elem(), DiJobMap{})
	pulumi.RegisterOutputType(DiJobOutput{})
	pulumi.RegisterOutputType(DiJobArrayOutput{})
	pulumi.RegisterOutputType(DiJobMapOutput{})
}
