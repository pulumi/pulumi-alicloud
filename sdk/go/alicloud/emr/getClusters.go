// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package emr

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Emr Clusters of the current Alibaba Cloud user.
//
// > **DEPRECATED:**  This datasource has been deprecated from version `1.204.0`. Please use new datasource emrv2_clusters.
//
// > **NOTE:** Available in v1.146.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/emr"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ram"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-testAccClusters"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_, err := resourcemanager.GetResourceGroups(ctx, &resourcemanager.GetResourceGroupsArgs{
//				Status: pulumi.StringRef("OK"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetMainVersions, err := emr.GetMainVersions(ctx, &emr.GetMainVersionsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetInstanceTypes, err := emr.GetInstanceTypes(ctx, &emr.GetInstanceTypesArgs{
//				DestinationResource: "InstanceType",
//				ClusterType:         defaultGetMainVersions.MainVersions[0].ClusterTypes[0],
//				SupportLocalStorage: pulumi.BoolRef(false),
//				InstanceChargeType:  "PostPaid",
//				SupportNodeTypes: []string{
//					"MASTER",
//					"CORE",
//					"TASK",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			dataDisk, err := emr.GetDiskTypes(ctx, &emr.GetDiskTypesArgs{
//				DestinationResource: "DataDisk",
//				ClusterType:         defaultGetMainVersions.MainVersions[0].ClusterTypes[0],
//				InstanceChargeType:  "PostPaid",
//				InstanceType:        defaultGetInstanceTypes.Types[0].Id,
//				ZoneId:              pulumi.StringRef(defaultGetInstanceTypes.Types[0].ZoneId),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			systemDisk, err := emr.GetDiskTypes(ctx, &emr.GetDiskTypesArgs{
//				DestinationResource: "SystemDisk",
//				ClusterType:         defaultGetMainVersions.MainVersions[0].ClusterTypes[0],
//				InstanceChargeType:  "PostPaid",
//				InstanceType:        defaultGetInstanceTypes.Types[0].Id,
//				ZoneId:              pulumi.StringRef(defaultGetInstanceTypes.Types[0].ZoneId),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetNetworks, err := vpc.GetNetworks(ctx, &vpc.GetNetworksArgs{
//				NameRegex: pulumi.StringRef("default-NODELETING"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultSecurityGroup, err := ecs.NewSecurityGroup(ctx, "default", &ecs.SecurityGroupArgs{
//				Name:  pulumi.String(name),
//				VpcId: pulumi.String(defaultGetNetworks.Ids[0]),
//			})
//			if err != nil {
//				return err
//			}
//			defaultGetSwitches, err := vpc.GetSwitches(ctx, &vpc.GetSwitchesArgs{
//				VpcId:  pulumi.StringRef(defaultGetNetworks.Ids[0]),
//				ZoneId: pulumi.StringRef(defaultGetInstanceTypes.Types[0].ZoneId),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultRole, err := ram.NewRole(ctx, "default", &ram.RoleArgs{
//				Name: pulumi.String(name),
//				Document: pulumi.String(`    {
//	        "Statement": [
//	        {
//	            "Action": "sts:AssumeRole",
//	            "Effect": "Allow",
//	            "Principal": {
//	            "Service": [
//	                "emr.aliyuncs.com",
//	                "ecs.aliyuncs.com"
//	            ]
//	            }
//	        }
//	        ],
//	        "Version": "1"
//	    }
//
// `),
//
//				Description: pulumi.String("this is a role test."),
//				Force:       pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			var tmp0 pulumi.String
//			if dataDisk.Types[0].Min > 160 {
//				tmp0 = pulumi.Int(dataDisk.Types[0].Min)
//			} else {
//				tmp0 = pulumi.String("160")
//			}
//			var tmp1 pulumi.String
//			if systemDisk.Types[0].Min > 160 {
//				tmp1 = pulumi.Int(systemDisk.Types[0].Min)
//			} else {
//				tmp1 = pulumi.String("160")
//			}
//			var tmp2 pulumi.String
//			if dataDisk.Types[0].Min > 160 {
//				tmp2 = pulumi.Int(dataDisk.Types[0].Min)
//			} else {
//				tmp2 = pulumi.String("160")
//			}
//			var tmp3 pulumi.String
//			if systemDisk.Types[0].Min > 160 {
//				tmp3 = pulumi.Int(systemDisk.Types[0].Min)
//			} else {
//				tmp3 = pulumi.String("160")
//			}
//			var tmp4 pulumi.String
//			if dataDisk.Types[0].Min > 160 {
//				tmp4 = pulumi.Int(dataDisk.Types[0].Min)
//			} else {
//				tmp4 = pulumi.String("160")
//			}
//			var tmp5 pulumi.String
//			if systemDisk.Types[0].Min > 160 {
//				tmp5 = pulumi.Int(systemDisk.Types[0].Min)
//			} else {
//				tmp5 = pulumi.String("160")
//			}
//			defaultCluster, err := emr.NewCluster(ctx, "default", &emr.ClusterArgs{
//				Name:        pulumi.String(name),
//				EmrVer:      pulumi.String(defaultGetMainVersions.MainVersions[0].EmrVersion),
//				ClusterType: pulumi.String(defaultGetMainVersions.MainVersions[0].ClusterTypes[0]),
//				HostGroups: emr.ClusterHostGroupArray{
//					&emr.ClusterHostGroupArgs{
//						HostGroupName:   pulumi.String("master_group"),
//						HostGroupType:   pulumi.String("MASTER"),
//						NodeCount:       pulumi.String("2"),
//						InstanceType:    pulumi.String(defaultGetInstanceTypes.Types[0].Id),
//						DiskType:        pulumi.String(dataDisk.Types[0].Value),
//						DiskCapacity:    pulumi.String(tmp0),
//						DiskCount:       pulumi.String("1"),
//						SysDiskType:     pulumi.String(systemDisk.Types[0].Value),
//						SysDiskCapacity: pulumi.String(tmp1),
//					},
//					&emr.ClusterHostGroupArgs{
//						HostGroupName:   pulumi.String("core_group"),
//						HostGroupType:   pulumi.String("CORE"),
//						NodeCount:       pulumi.String("3"),
//						InstanceType:    pulumi.String(defaultGetInstanceTypes.Types[0].Id),
//						DiskType:        pulumi.String(dataDisk.Types[0].Value),
//						DiskCapacity:    pulumi.String(tmp2),
//						DiskCount:       pulumi.String("4"),
//						SysDiskType:     pulumi.String(systemDisk.Types[0].Value),
//						SysDiskCapacity: pulumi.String(tmp3),
//					},
//					&emr.ClusterHostGroupArgs{
//						HostGroupName:   pulumi.String("task_group"),
//						HostGroupType:   pulumi.String("TASK"),
//						NodeCount:       pulumi.String("2"),
//						InstanceType:    pulumi.String(defaultGetInstanceTypes.Types[0].Id),
//						DiskType:        pulumi.String(dataDisk.Types[0].Value),
//						DiskCapacity:    pulumi.String(tmp4),
//						DiskCount:       pulumi.String("4"),
//						SysDiskType:     pulumi.String(systemDisk.Types[0].Value),
//						SysDiskCapacity: pulumi.String(tmp5),
//					},
//				},
//				HighAvailabilityEnable: pulumi.Bool(true),
//				ZoneId:                 pulumi.String(defaultGetInstanceTypes.Types[0].ZoneId),
//				SecurityGroupId:        defaultSecurityGroup.ID(),
//				IsOpenPublicIp:         pulumi.Bool(true),
//				ChargeType:             pulumi.String("PostPaid"),
//				VswitchId:              pulumi.String(defaultGetSwitches.Ids[0]),
//				UserDefinedEmrEcsRole:  defaultRole.Name,
//				SshEnable:              pulumi.Bool(true),
//				MasterPwd:              pulumi.String("ABCtest1234!"),
//				Tags: pulumi.StringMap{
//					"Created": pulumi.String("TF"),
//					"For":     pulumi.String("acceptance test"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ids, err := emr.GetClusters(ctx, &emr.GetClustersArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("emrClusterId1", ids.Clusters[0].Id)
//			nameRegex := emr.GetClustersOutput(ctx, emr.GetClustersOutputArgs{
//				NameRegex: defaultCluster.Name,
//			}, nil)
//			ctx.Export("emrClusterId2", nameRegex.ApplyT(func(nameRegex emr.GetClustersResult) (*string, error) {
//				return &nameRegex.Clusters[0].Id, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
func GetClusters(ctx *pulumi.Context, args *GetClustersArgs, opts ...pulumi.InvokeOption) (*GetClustersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetClustersResult
	err := ctx.Invoke("alicloud:emr/getClusters:getClusters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusters.
type GetClustersArgs struct {
	// The cluster name.
	ClusterName *string `pulumi:"clusterName"`
	// The cluster type list.
	ClusterTypeLists []string `pulumi:"clusterTypeLists"`
	// How to create a cluster. Valid values: `ON-DEMAND`, `MANUAL`.
	CreateType *string `pulumi:"createType"`
	// The default status.
	DefaultStatus *bool `pulumi:"defaultStatus"`
	// The hosting type of the cluster. Valid values: `HALF_MANAGED`, `MANAGED`.
	DepositType *string `pulumi:"depositType"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Cluster IDs.
	Ids []string `pulumi:"ids"`
	// The is desc.
	IsDesc *bool `pulumi:"isDesc"`
	// The host type of the cluster. The default is ECS. Valid values: `DOCKER`, `ECS`, `PYHSICAL_MACHINE`, `ECS_FROM_ECM_HOSTPOOL`.
	MachineType *string `pulumi:"machineType"`
	// A regex string to filter results by Cluster name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// The Resource Group ID.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status list. Valid values: `ABNORMAL`, `CREATE_FAILED`, `CREATING`, `IDLE`, `RELEASED`, `RELEASE_FAILED`, `RELEASING`, `RUNNING`, `WAIT_FOR_PAY`.
	StatusLists []string `pulumi:"statusLists"`
	// The VPC ID.
	VpcId *string `pulumi:"vpcId"`
}

// A collection of values returned by getClusters.
type GetClustersResult struct {
	ClusterName      *string              `pulumi:"clusterName"`
	ClusterTypeLists []string             `pulumi:"clusterTypeLists"`
	Clusters         []GetClustersCluster `pulumi:"clusters"`
	CreateType       *string              `pulumi:"createType"`
	DefaultStatus    *bool                `pulumi:"defaultStatus"`
	DepositType      *string              `pulumi:"depositType"`
	EnableDetails    *bool                `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id              string   `pulumi:"id"`
	Ids             []string `pulumi:"ids"`
	IsDesc          *bool    `pulumi:"isDesc"`
	MachineType     *string  `pulumi:"machineType"`
	NameRegex       *string  `pulumi:"nameRegex"`
	Names           []string `pulumi:"names"`
	OutputFile      *string  `pulumi:"outputFile"`
	PageNumber      *int     `pulumi:"pageNumber"`
	PageSize        *int     `pulumi:"pageSize"`
	ResourceGroupId *string  `pulumi:"resourceGroupId"`
	StatusLists     []string `pulumi:"statusLists"`
	TotalCount      int      `pulumi:"totalCount"`
	VpcId           *string  `pulumi:"vpcId"`
}

func GetClustersOutput(ctx *pulumi.Context, args GetClustersOutputArgs, opts ...pulumi.InvokeOption) GetClustersResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetClustersResultOutput, error) {
			args := v.(GetClustersArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:emr/getClusters:getClusters", args, GetClustersResultOutput{}, options).(GetClustersResultOutput), nil
		}).(GetClustersResultOutput)
}

// A collection of arguments for invoking getClusters.
type GetClustersOutputArgs struct {
	// The cluster name.
	ClusterName pulumi.StringPtrInput `pulumi:"clusterName"`
	// The cluster type list.
	ClusterTypeLists pulumi.StringArrayInput `pulumi:"clusterTypeLists"`
	// How to create a cluster. Valid values: `ON-DEMAND`, `MANUAL`.
	CreateType pulumi.StringPtrInput `pulumi:"createType"`
	// The default status.
	DefaultStatus pulumi.BoolPtrInput `pulumi:"defaultStatus"`
	// The hosting type of the cluster. Valid values: `HALF_MANAGED`, `MANAGED`.
	DepositType pulumi.StringPtrInput `pulumi:"depositType"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Cluster IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The is desc.
	IsDesc pulumi.BoolPtrInput `pulumi:"isDesc"`
	// The host type of the cluster. The default is ECS. Valid values: `DOCKER`, `ECS`, `PYHSICAL_MACHINE`, `ECS_FROM_ECM_HOSTPOOL`.
	MachineType pulumi.StringPtrInput `pulumi:"machineType"`
	// A regex string to filter results by Cluster name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// The Resource Group ID.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// The status list. Valid values: `ABNORMAL`, `CREATE_FAILED`, `CREATING`, `IDLE`, `RELEASED`, `RELEASE_FAILED`, `RELEASING`, `RUNNING`, `WAIT_FOR_PAY`.
	StatusLists pulumi.StringArrayInput `pulumi:"statusLists"`
	// The VPC ID.
	VpcId pulumi.StringPtrInput `pulumi:"vpcId"`
}

func (GetClustersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClustersArgs)(nil)).Elem()
}

// A collection of values returned by getClusters.
type GetClustersResultOutput struct{ *pulumi.OutputState }

func (GetClustersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClustersResult)(nil)).Elem()
}

func (o GetClustersResultOutput) ToGetClustersResultOutput() GetClustersResultOutput {
	return o
}

func (o GetClustersResultOutput) ToGetClustersResultOutputWithContext(ctx context.Context) GetClustersResultOutput {
	return o
}

func (o GetClustersResultOutput) ClusterName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.ClusterName }).(pulumi.StringPtrOutput)
}

func (o GetClustersResultOutput) ClusterTypeLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetClustersResult) []string { return v.ClusterTypeLists }).(pulumi.StringArrayOutput)
}

func (o GetClustersResultOutput) Clusters() GetClustersClusterArrayOutput {
	return o.ApplyT(func(v GetClustersResult) []GetClustersCluster { return v.Clusters }).(GetClustersClusterArrayOutput)
}

func (o GetClustersResultOutput) CreateType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.CreateType }).(pulumi.StringPtrOutput)
}

func (o GetClustersResultOutput) DefaultStatus() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *bool { return v.DefaultStatus }).(pulumi.BoolPtrOutput)
}

func (o GetClustersResultOutput) DepositType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.DepositType }).(pulumi.StringPtrOutput)
}

func (o GetClustersResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetClustersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetClustersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetClustersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetClustersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetClustersResultOutput) IsDesc() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *bool { return v.IsDesc }).(pulumi.BoolPtrOutput)
}

func (o GetClustersResultOutput) MachineType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.MachineType }).(pulumi.StringPtrOutput)
}

func (o GetClustersResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetClustersResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetClustersResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetClustersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetClustersResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetClustersResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func (o GetClustersResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

func (o GetClustersResultOutput) StatusLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetClustersResult) []string { return v.StatusLists }).(pulumi.StringArrayOutput)
}

func (o GetClustersResultOutput) TotalCount() pulumi.IntOutput {
	return o.ApplyT(func(v GetClustersResult) int { return v.TotalCount }).(pulumi.IntOutput)
}

func (o GetClustersResultOutput) VpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.VpcId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetClustersResultOutput{})
}
