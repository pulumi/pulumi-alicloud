// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a HBR Ecs Backup Plan resource.
//
// For information about HBR Ecs Backup Plan and how to use it, see [What is Ecs Backup Plan](https://www.alibabacloud.com/help/doc-detail/186574.htm).
//
// > **NOTE:** Available since v1.132.0.
//
// > **NOTE:** Deprecated since v1.249.0.
//
// > **DEPRECATED:** This resource has been deprecated from version `1.249.0`. Please use new resource hbr.Policy and alicloud_hbr_policy_binding.
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
//	"fmt"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/hbr"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("Instance"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGetInstanceTypes, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
//				AvailabilityZone: pulumi.StringRef(example.Zones[0].Id),
//				CpuCoreCount:     pulumi.IntRef(1),
//				MemorySize:       pulumi.Float64Ref(2),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGetImages, err := ecs.GetImages(ctx, &ecs.GetImagesArgs{
//				NameRegex: pulumi.StringRef("^ubuntu_18.*64"),
//				Owners:    pulumi.StringRef("system"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleNetwork, err := vpc.NewNetwork(ctx, "example", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("terraform-example"),
//				CidrBlock: pulumi.String("172.17.3.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSwitch, err := vpc.NewSwitch(ctx, "example", &vpc.SwitchArgs{
//				VswitchName: pulumi.String("terraform-example"),
//				CidrBlock:   pulumi.String("172.17.3.0/24"),
//				VpcId:       exampleNetwork.ID(),
//				ZoneId:      pulumi.String(example.Zones[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSecurityGroup, err := ecs.NewSecurityGroup(ctx, "example", &ecs.SecurityGroupArgs{
//				Name:  pulumi.String("terraform-example"),
//				VpcId: exampleNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleInstance, err := ecs.NewInstance(ctx, "example", &ecs.InstanceArgs{
//				ImageId:          pulumi.String(exampleGetImages.Images[0].Id),
//				InstanceType:     pulumi.String(exampleGetInstanceTypes.InstanceTypes[0].Id),
//				AvailabilityZone: pulumi.String(example.Zones[0].Id),
//				SecurityGroups: pulumi.StringArray{
//					exampleSecurityGroup.ID(),
//				},
//				InstanceName:       pulumi.String("terraform-example"),
//				InternetChargeType: pulumi.String("PayByBandwidth"),
//				VswitchId:          exampleSwitch.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_default, err := random.NewInteger(ctx, "default", &random.IntegerArgs{
//				Min: 10000,
//				Max: 99999,
//			})
//			if err != nil {
//				return err
//			}
//			exampleVault, err := hbr.NewVault(ctx, "example", &hbr.VaultArgs{
//				VaultName: pulumi.Sprintf("terraform-example-%v", _default.Result),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = hbr.NewEcsBackupPlan(ctx, "example", &hbr.EcsBackupPlanArgs{
//				EcsBackupPlanName: pulumi.String("terraform-example"),
//				InstanceId:        exampleInstance.ID(),
//				VaultId:           exampleVault.ID(),
//				Retention:         pulumi.String("1"),
//				Schedule:          pulumi.String("I|1602673264|PT2H"),
//				BackupType:        pulumi.String("COMPLETE"),
//				SpeedLimit:        pulumi.String("0:24:5120"),
//				Paths: pulumi.StringArray{
//					pulumi.String("/home"),
//					pulumi.String("/var"),
//				},
//				Exclude: pulumi.String("  [\"/home/exclude\"]\n"),
//				Include: pulumi.String("  [\"/home/include\"]\n"),
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
// ## Notice
//
// **About Backup path rules:**
// 1. If there is no wildcard `*`, you can enter 8 items of path.
// 2. When using wildcard `*`, only one item of path can be input, and wildcards like `/*/*` are supported.
// 3. Each item of path only supports absolute paths, for example starting with `/`, `\`, `C:\`, `D:\`.
//
// **About Restrictions:**
// 1. When using `VSS`: multiple paths, UNC paths, wildcards, and excluded files not supported.
// 2. When using `UNC`: VSS not supported, wildcards not supported, and files to be excluded are not supported.
//
// **About include/exclude path rules:**
// 1. Supports up to 8 paths, including paths using wildcards `*`.
// 2. If the path does not contain `/`, then `*` matches multiple path names or file names, for example `*abc*` will match `/abc/`, `/d/eabcd/`, `/a/abc`; `*.txt` will match all files with an extension `.txt`.
// 3. If the path contains `/`, each `*` only matches a single-level path or file name. For example, `/a/*/*/` share will match `/a/b/c/share`, but not `/a/d/share`.
// 4. If the path ends with `/`, it means the folder matches. For example, `*tmp/` will match `/a/b/aaatmp/`, `/tmp/` and so on.
// 5. The path separator takes Linux system `/` as an example, if it is Windows system, please replace it with `\`.
//
// ## Import
//
// HBR Ecs Backup Plan can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:hbr/ecsBackupPlan:EcsBackupPlan example <id>
// ```
type EcsBackupPlan struct {
	pulumi.CustomResourceState

	// Backup type. Valid values: `COMPLETE`.
	BackupType pulumi.StringOutput `pulumi:"backupType"`
	// The role name created in the original account RAM backup by the cross account managed by the current account.
	CrossAccountRoleName pulumi.StringPtrOutput `pulumi:"crossAccountRoleName"`
	// The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
	CrossAccountType pulumi.StringOutput `pulumi:"crossAccountType"`
	// The original account ID of the cross account backup managed by the current account.
	CrossAccountUserId pulumi.IntPtrOutput `pulumi:"crossAccountUserId"`
	// The detail of the backup plan.
	Detail pulumi.StringPtrOutput `pulumi:"detail"`
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled pulumi.BoolOutput `pulumi:"disabled"`
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	EcsBackupPlanName pulumi.StringOutput `pulumi:"ecsBackupPlanName"`
	// Exclude path. String of Json list, up to 255 characters. e.g. `"[\"/home/work\"]"`
	Exclude pulumi.StringPtrOutput `pulumi:"exclude"`
	// Include path. String of Json list, up to 255 characters. e.g. `"[\"/var\"]"`
	Include pulumi.StringPtrOutput `pulumi:"include"`
	// The ID of ECS instance. The ecs backup client must have been installed on the host.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// Windows operating system with application consistency using VSS, e.g: `{\"UseVSS\":false}`.
	Options pulumi.StringPtrOutput `pulumi:"options"`
	// List of backup path. e.g. `["/home", "/var"]`. **Note** If `path` is empty, it means that all directories will be backed up.
	Paths pulumi.StringArrayOutput `pulumi:"paths"`
	// Backup retention days, the minimum is 1.
	Retention pulumi.StringOutput `pulumi:"retention"`
	// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
	// * `startTime` Backup start time, UNIX time seconds.
	Schedule pulumi.StringOutput `pulumi:"schedule"`
	// Flow control. The format is: `{start}|{end}|{bandwidth}`. Use `|` to separate multiple flow control configurations, multiple flow control configurations not allowed to have overlapping times.
	SpeedLimit pulumi.StringPtrOutput `pulumi:"speedLimit"`
	// Attribute updatePaths has been deprecated in v1.139.0+, and you do not need to set it anymore.
	//
	// Deprecated: Attribute updatePaths has been deprecated in v1.139.0+ and you do not need to set it anymore.
	UpdatePaths pulumi.BoolPtrOutput `pulumi:"updatePaths"`
	// The ID of Backup vault.
	VaultId pulumi.StringOutput `pulumi:"vaultId"`
}

// NewEcsBackupPlan registers a new resource with the given unique name, arguments, and options.
func NewEcsBackupPlan(ctx *pulumi.Context,
	name string, args *EcsBackupPlanArgs, opts ...pulumi.ResourceOption) (*EcsBackupPlan, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BackupType == nil {
		return nil, errors.New("invalid value for required argument 'BackupType'")
	}
	if args.EcsBackupPlanName == nil {
		return nil, errors.New("invalid value for required argument 'EcsBackupPlanName'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.Retention == nil {
		return nil, errors.New("invalid value for required argument 'Retention'")
	}
	if args.Schedule == nil {
		return nil, errors.New("invalid value for required argument 'Schedule'")
	}
	if args.VaultId == nil {
		return nil, errors.New("invalid value for required argument 'VaultId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EcsBackupPlan
	err := ctx.RegisterResource("alicloud:hbr/ecsBackupPlan:EcsBackupPlan", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEcsBackupPlan gets an existing EcsBackupPlan resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEcsBackupPlan(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EcsBackupPlanState, opts ...pulumi.ResourceOption) (*EcsBackupPlan, error) {
	var resource EcsBackupPlan
	err := ctx.ReadResource("alicloud:hbr/ecsBackupPlan:EcsBackupPlan", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EcsBackupPlan resources.
type ecsBackupPlanState struct {
	// Backup type. Valid values: `COMPLETE`.
	BackupType *string `pulumi:"backupType"`
	// The role name created in the original account RAM backup by the cross account managed by the current account.
	CrossAccountRoleName *string `pulumi:"crossAccountRoleName"`
	// The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
	CrossAccountType *string `pulumi:"crossAccountType"`
	// The original account ID of the cross account backup managed by the current account.
	CrossAccountUserId *int `pulumi:"crossAccountUserId"`
	// The detail of the backup plan.
	Detail *string `pulumi:"detail"`
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled *bool `pulumi:"disabled"`
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	EcsBackupPlanName *string `pulumi:"ecsBackupPlanName"`
	// Exclude path. String of Json list, up to 255 characters. e.g. `"[\"/home/work\"]"`
	Exclude *string `pulumi:"exclude"`
	// Include path. String of Json list, up to 255 characters. e.g. `"[\"/var\"]"`
	Include *string `pulumi:"include"`
	// The ID of ECS instance. The ecs backup client must have been installed on the host.
	InstanceId *string `pulumi:"instanceId"`
	// Windows operating system with application consistency using VSS, e.g: `{\"UseVSS\":false}`.
	Options *string `pulumi:"options"`
	// List of backup path. e.g. `["/home", "/var"]`. **Note** If `path` is empty, it means that all directories will be backed up.
	Paths []string `pulumi:"paths"`
	// Backup retention days, the minimum is 1.
	Retention *string `pulumi:"retention"`
	// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
	// * `startTime` Backup start time, UNIX time seconds.
	Schedule *string `pulumi:"schedule"`
	// Flow control. The format is: `{start}|{end}|{bandwidth}`. Use `|` to separate multiple flow control configurations, multiple flow control configurations not allowed to have overlapping times.
	SpeedLimit *string `pulumi:"speedLimit"`
	// Attribute updatePaths has been deprecated in v1.139.0+, and you do not need to set it anymore.
	//
	// Deprecated: Attribute updatePaths has been deprecated in v1.139.0+ and you do not need to set it anymore.
	UpdatePaths *bool `pulumi:"updatePaths"`
	// The ID of Backup vault.
	VaultId *string `pulumi:"vaultId"`
}

type EcsBackupPlanState struct {
	// Backup type. Valid values: `COMPLETE`.
	BackupType pulumi.StringPtrInput
	// The role name created in the original account RAM backup by the cross account managed by the current account.
	CrossAccountRoleName pulumi.StringPtrInput
	// The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
	CrossAccountType pulumi.StringPtrInput
	// The original account ID of the cross account backup managed by the current account.
	CrossAccountUserId pulumi.IntPtrInput
	// The detail of the backup plan.
	Detail pulumi.StringPtrInput
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled pulumi.BoolPtrInput
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	EcsBackupPlanName pulumi.StringPtrInput
	// Exclude path. String of Json list, up to 255 characters. e.g. `"[\"/home/work\"]"`
	Exclude pulumi.StringPtrInput
	// Include path. String of Json list, up to 255 characters. e.g. `"[\"/var\"]"`
	Include pulumi.StringPtrInput
	// The ID of ECS instance. The ecs backup client must have been installed on the host.
	InstanceId pulumi.StringPtrInput
	// Windows operating system with application consistency using VSS, e.g: `{\"UseVSS\":false}`.
	Options pulumi.StringPtrInput
	// List of backup path. e.g. `["/home", "/var"]`. **Note** If `path` is empty, it means that all directories will be backed up.
	Paths pulumi.StringArrayInput
	// Backup retention days, the minimum is 1.
	Retention pulumi.StringPtrInput
	// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
	// * `startTime` Backup start time, UNIX time seconds.
	Schedule pulumi.StringPtrInput
	// Flow control. The format is: `{start}|{end}|{bandwidth}`. Use `|` to separate multiple flow control configurations, multiple flow control configurations not allowed to have overlapping times.
	SpeedLimit pulumi.StringPtrInput
	// Attribute updatePaths has been deprecated in v1.139.0+, and you do not need to set it anymore.
	//
	// Deprecated: Attribute updatePaths has been deprecated in v1.139.0+ and you do not need to set it anymore.
	UpdatePaths pulumi.BoolPtrInput
	// The ID of Backup vault.
	VaultId pulumi.StringPtrInput
}

func (EcsBackupPlanState) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsBackupPlanState)(nil)).Elem()
}

type ecsBackupPlanArgs struct {
	// Backup type. Valid values: `COMPLETE`.
	BackupType string `pulumi:"backupType"`
	// The role name created in the original account RAM backup by the cross account managed by the current account.
	CrossAccountRoleName *string `pulumi:"crossAccountRoleName"`
	// The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
	CrossAccountType *string `pulumi:"crossAccountType"`
	// The original account ID of the cross account backup managed by the current account.
	CrossAccountUserId *int `pulumi:"crossAccountUserId"`
	// The detail of the backup plan.
	Detail *string `pulumi:"detail"`
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled *bool `pulumi:"disabled"`
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	EcsBackupPlanName string `pulumi:"ecsBackupPlanName"`
	// Exclude path. String of Json list, up to 255 characters. e.g. `"[\"/home/work\"]"`
	Exclude *string `pulumi:"exclude"`
	// Include path. String of Json list, up to 255 characters. e.g. `"[\"/var\"]"`
	Include *string `pulumi:"include"`
	// The ID of ECS instance. The ecs backup client must have been installed on the host.
	InstanceId string `pulumi:"instanceId"`
	// Windows operating system with application consistency using VSS, e.g: `{\"UseVSS\":false}`.
	Options *string `pulumi:"options"`
	// List of backup path. e.g. `["/home", "/var"]`. **Note** If `path` is empty, it means that all directories will be backed up.
	Paths []string `pulumi:"paths"`
	// Backup retention days, the minimum is 1.
	Retention string `pulumi:"retention"`
	// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
	// * `startTime` Backup start time, UNIX time seconds.
	Schedule string `pulumi:"schedule"`
	// Flow control. The format is: `{start}|{end}|{bandwidth}`. Use `|` to separate multiple flow control configurations, multiple flow control configurations not allowed to have overlapping times.
	SpeedLimit *string `pulumi:"speedLimit"`
	// Attribute updatePaths has been deprecated in v1.139.0+, and you do not need to set it anymore.
	//
	// Deprecated: Attribute updatePaths has been deprecated in v1.139.0+ and you do not need to set it anymore.
	UpdatePaths *bool `pulumi:"updatePaths"`
	// The ID of Backup vault.
	VaultId string `pulumi:"vaultId"`
}

// The set of arguments for constructing a EcsBackupPlan resource.
type EcsBackupPlanArgs struct {
	// Backup type. Valid values: `COMPLETE`.
	BackupType pulumi.StringInput
	// The role name created in the original account RAM backup by the cross account managed by the current account.
	CrossAccountRoleName pulumi.StringPtrInput
	// The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
	CrossAccountType pulumi.StringPtrInput
	// The original account ID of the cross account backup managed by the current account.
	CrossAccountUserId pulumi.IntPtrInput
	// The detail of the backup plan.
	Detail pulumi.StringPtrInput
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled pulumi.BoolPtrInput
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	EcsBackupPlanName pulumi.StringInput
	// Exclude path. String of Json list, up to 255 characters. e.g. `"[\"/home/work\"]"`
	Exclude pulumi.StringPtrInput
	// Include path. String of Json list, up to 255 characters. e.g. `"[\"/var\"]"`
	Include pulumi.StringPtrInput
	// The ID of ECS instance. The ecs backup client must have been installed on the host.
	InstanceId pulumi.StringInput
	// Windows operating system with application consistency using VSS, e.g: `{\"UseVSS\":false}`.
	Options pulumi.StringPtrInput
	// List of backup path. e.g. `["/home", "/var"]`. **Note** If `path` is empty, it means that all directories will be backed up.
	Paths pulumi.StringArrayInput
	// Backup retention days, the minimum is 1.
	Retention pulumi.StringInput
	// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
	// * `startTime` Backup start time, UNIX time seconds.
	Schedule pulumi.StringInput
	// Flow control. The format is: `{start}|{end}|{bandwidth}`. Use `|` to separate multiple flow control configurations, multiple flow control configurations not allowed to have overlapping times.
	SpeedLimit pulumi.StringPtrInput
	// Attribute updatePaths has been deprecated in v1.139.0+, and you do not need to set it anymore.
	//
	// Deprecated: Attribute updatePaths has been deprecated in v1.139.0+ and you do not need to set it anymore.
	UpdatePaths pulumi.BoolPtrInput
	// The ID of Backup vault.
	VaultId pulumi.StringInput
}

func (EcsBackupPlanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsBackupPlanArgs)(nil)).Elem()
}

type EcsBackupPlanInput interface {
	pulumi.Input

	ToEcsBackupPlanOutput() EcsBackupPlanOutput
	ToEcsBackupPlanOutputWithContext(ctx context.Context) EcsBackupPlanOutput
}

func (*EcsBackupPlan) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsBackupPlan)(nil)).Elem()
}

func (i *EcsBackupPlan) ToEcsBackupPlanOutput() EcsBackupPlanOutput {
	return i.ToEcsBackupPlanOutputWithContext(context.Background())
}

func (i *EcsBackupPlan) ToEcsBackupPlanOutputWithContext(ctx context.Context) EcsBackupPlanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsBackupPlanOutput)
}

// EcsBackupPlanArrayInput is an input type that accepts EcsBackupPlanArray and EcsBackupPlanArrayOutput values.
// You can construct a concrete instance of `EcsBackupPlanArrayInput` via:
//
//	EcsBackupPlanArray{ EcsBackupPlanArgs{...} }
type EcsBackupPlanArrayInput interface {
	pulumi.Input

	ToEcsBackupPlanArrayOutput() EcsBackupPlanArrayOutput
	ToEcsBackupPlanArrayOutputWithContext(context.Context) EcsBackupPlanArrayOutput
}

type EcsBackupPlanArray []EcsBackupPlanInput

func (EcsBackupPlanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsBackupPlan)(nil)).Elem()
}

func (i EcsBackupPlanArray) ToEcsBackupPlanArrayOutput() EcsBackupPlanArrayOutput {
	return i.ToEcsBackupPlanArrayOutputWithContext(context.Background())
}

func (i EcsBackupPlanArray) ToEcsBackupPlanArrayOutputWithContext(ctx context.Context) EcsBackupPlanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsBackupPlanArrayOutput)
}

// EcsBackupPlanMapInput is an input type that accepts EcsBackupPlanMap and EcsBackupPlanMapOutput values.
// You can construct a concrete instance of `EcsBackupPlanMapInput` via:
//
//	EcsBackupPlanMap{ "key": EcsBackupPlanArgs{...} }
type EcsBackupPlanMapInput interface {
	pulumi.Input

	ToEcsBackupPlanMapOutput() EcsBackupPlanMapOutput
	ToEcsBackupPlanMapOutputWithContext(context.Context) EcsBackupPlanMapOutput
}

type EcsBackupPlanMap map[string]EcsBackupPlanInput

func (EcsBackupPlanMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsBackupPlan)(nil)).Elem()
}

func (i EcsBackupPlanMap) ToEcsBackupPlanMapOutput() EcsBackupPlanMapOutput {
	return i.ToEcsBackupPlanMapOutputWithContext(context.Background())
}

func (i EcsBackupPlanMap) ToEcsBackupPlanMapOutputWithContext(ctx context.Context) EcsBackupPlanMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsBackupPlanMapOutput)
}

type EcsBackupPlanOutput struct{ *pulumi.OutputState }

func (EcsBackupPlanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsBackupPlan)(nil)).Elem()
}

func (o EcsBackupPlanOutput) ToEcsBackupPlanOutput() EcsBackupPlanOutput {
	return o
}

func (o EcsBackupPlanOutput) ToEcsBackupPlanOutputWithContext(ctx context.Context) EcsBackupPlanOutput {
	return o
}

// Backup type. Valid values: `COMPLETE`.
func (o EcsBackupPlanOutput) BackupType() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringOutput { return v.BackupType }).(pulumi.StringOutput)
}

// The role name created in the original account RAM backup by the cross account managed by the current account.
func (o EcsBackupPlanOutput) CrossAccountRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringPtrOutput { return v.CrossAccountRoleName }).(pulumi.StringPtrOutput)
}

// The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
func (o EcsBackupPlanOutput) CrossAccountType() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringOutput { return v.CrossAccountType }).(pulumi.StringOutput)
}

// The original account ID of the cross account backup managed by the current account.
func (o EcsBackupPlanOutput) CrossAccountUserId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.IntPtrOutput { return v.CrossAccountUserId }).(pulumi.IntPtrOutput)
}

// The detail of the backup plan.
func (o EcsBackupPlanOutput) Detail() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringPtrOutput { return v.Detail }).(pulumi.StringPtrOutput)
}

// Whether to disable the backup task. Valid values: `true`, `false`.
func (o EcsBackupPlanOutput) Disabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.BoolOutput { return v.Disabled }).(pulumi.BoolOutput)
}

// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
func (o EcsBackupPlanOutput) EcsBackupPlanName() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringOutput { return v.EcsBackupPlanName }).(pulumi.StringOutput)
}

// Exclude path. String of Json list, up to 255 characters. e.g. `"[\"/home/work\"]"`
func (o EcsBackupPlanOutput) Exclude() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringPtrOutput { return v.Exclude }).(pulumi.StringPtrOutput)
}

// Include path. String of Json list, up to 255 characters. e.g. `"[\"/var\"]"`
func (o EcsBackupPlanOutput) Include() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringPtrOutput { return v.Include }).(pulumi.StringPtrOutput)
}

// The ID of ECS instance. The ecs backup client must have been installed on the host.
func (o EcsBackupPlanOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// Windows operating system with application consistency using VSS, e.g: `{\"UseVSS\":false}`.
func (o EcsBackupPlanOutput) Options() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringPtrOutput { return v.Options }).(pulumi.StringPtrOutput)
}

// List of backup path. e.g. `["/home", "/var"]`. **Note** If `path` is empty, it means that all directories will be backed up.
func (o EcsBackupPlanOutput) Paths() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringArrayOutput { return v.Paths }).(pulumi.StringArrayOutput)
}

// Backup retention days, the minimum is 1.
func (o EcsBackupPlanOutput) Retention() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringOutput { return v.Retention }).(pulumi.StringOutput)
}

// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
// * `startTime` Backup start time, UNIX time seconds.
func (o EcsBackupPlanOutput) Schedule() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringOutput { return v.Schedule }).(pulumi.StringOutput)
}

// Flow control. The format is: `{start}|{end}|{bandwidth}`. Use `|` to separate multiple flow control configurations, multiple flow control configurations not allowed to have overlapping times.
func (o EcsBackupPlanOutput) SpeedLimit() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringPtrOutput { return v.SpeedLimit }).(pulumi.StringPtrOutput)
}

// Attribute updatePaths has been deprecated in v1.139.0+, and you do not need to set it anymore.
//
// Deprecated: Attribute updatePaths has been deprecated in v1.139.0+ and you do not need to set it anymore.
func (o EcsBackupPlanOutput) UpdatePaths() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.BoolPtrOutput { return v.UpdatePaths }).(pulumi.BoolPtrOutput)
}

// The ID of Backup vault.
func (o EcsBackupPlanOutput) VaultId() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsBackupPlan) pulumi.StringOutput { return v.VaultId }).(pulumi.StringOutput)
}

type EcsBackupPlanArrayOutput struct{ *pulumi.OutputState }

func (EcsBackupPlanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsBackupPlan)(nil)).Elem()
}

func (o EcsBackupPlanArrayOutput) ToEcsBackupPlanArrayOutput() EcsBackupPlanArrayOutput {
	return o
}

func (o EcsBackupPlanArrayOutput) ToEcsBackupPlanArrayOutputWithContext(ctx context.Context) EcsBackupPlanArrayOutput {
	return o
}

func (o EcsBackupPlanArrayOutput) Index(i pulumi.IntInput) EcsBackupPlanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EcsBackupPlan {
		return vs[0].([]*EcsBackupPlan)[vs[1].(int)]
	}).(EcsBackupPlanOutput)
}

type EcsBackupPlanMapOutput struct{ *pulumi.OutputState }

func (EcsBackupPlanMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsBackupPlan)(nil)).Elem()
}

func (o EcsBackupPlanMapOutput) ToEcsBackupPlanMapOutput() EcsBackupPlanMapOutput {
	return o
}

func (o EcsBackupPlanMapOutput) ToEcsBackupPlanMapOutputWithContext(ctx context.Context) EcsBackupPlanMapOutput {
	return o
}

func (o EcsBackupPlanMapOutput) MapIndex(k pulumi.StringInput) EcsBackupPlanOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EcsBackupPlan {
		return vs[0].(map[string]*EcsBackupPlan)[vs[1].(string)]
	}).(EcsBackupPlanOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EcsBackupPlanInput)(nil)).Elem(), &EcsBackupPlan{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsBackupPlanArrayInput)(nil)).Elem(), EcsBackupPlanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsBackupPlanMapInput)(nil)).Elem(), EcsBackupPlanMap{})
	pulumi.RegisterOutputType(EcsBackupPlanOutput{})
	pulumi.RegisterOutputType(EcsBackupPlanArrayOutput{})
	pulumi.RegisterOutputType(EcsBackupPlanMapOutput{})
}
