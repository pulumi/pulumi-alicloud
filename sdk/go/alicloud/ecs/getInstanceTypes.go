// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the ECS instance types of Alibaba Cloud.
//
// > **NOTE:** Available since v1.0.0.
//
// > **NOTE:** By default, only the upgraded instance types are returned. If you want to get outdated instance types, you must set `isOutdated` to true.
//
// > **NOTE:** If one instance type is sold out, it will not be exported.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// cfg := config.New(ctx, "")
// name := "terraform-example";
// if param := cfg.Get("name"); param != ""{
// name = param
// }
// _default, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
// AvailableResourceCreation: pulumi.StringRef("VSwitch"),
// }, nil);
// if err != nil {
// return err
// }
// // Declare the data source
// defaultGetInstanceTypes, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
// AvailabilityZone: pulumi.StringRef(_default.Zones[0].Id),
// InstanceTypeFamily: pulumi.StringRef("ecs.sn1ne"),
// }, nil);
// if err != nil {
// return err
// }
// defaultGetImages, err := ecs.GetImages(ctx, &ecs.GetImagesArgs{
// NameRegex: pulumi.StringRef("^ubuntu_[0-9]+_[0-9]+_x64*"),
// MostRecent: pulumi.BoolRef(true),
// Owners: pulumi.StringRef("system"),
// }, nil);
// if err != nil {
// return err
// }
// defaultNetwork, err := vpc.NewNetwork(ctx, "default", &vpc.NetworkArgs{
// VpcName: pulumi.String(name),
// CidrBlock: pulumi.String("192.168.0.0/16"),
// })
// if err != nil {
// return err
// }
// defaultSwitch, err := vpc.NewSwitch(ctx, "default", &vpc.SwitchArgs{
// VswitchName: pulumi.String(name),
// VpcId: defaultNetwork.ID(),
// CidrBlock: pulumi.String("192.168.192.0/24"),
// ZoneId: pulumi.String(_default.Zones[0].Id),
// })
// if err != nil {
// return err
// }
// defaultSecurityGroup, err := ecs.NewSecurityGroup(ctx, "default", &ecs.SecurityGroupArgs{
// Name: pulumi.String(name),
// VpcId: defaultNetwork.ID(),
// })
// if err != nil {
// return err
// }
// _, err = ecs.NewEcsNetworkInterface(ctx, "default", &ecs.EcsNetworkInterfaceArgs{
// NetworkInterfaceName: pulumi.String(name),
// VswitchId: defaultSwitch.ID(),
// SecurityGroupIds: pulumi.StringArray{
// defaultSecurityGroup.ID(),
// },
// })
// if err != nil {
// return err
// }
// var splat0 pulumi.StringArray
// for _, val0 := range %!v(PANIC=Format method: fatal: An assertion has failed: tok: ) {
// splat0 = append(splat0, val0.ID())
// }
// var defaultInstance []*ecs.Instance
//
//	for index := 0; index < 14; index++ {
//	    key0 := index
//	    _ := index
//
// __res, err := ecs.NewInstance(ctx, fmt.Sprintf("default-%v", key0), &ecs.InstanceArgs{
// ImageId: pulumi.String(defaultGetImages.Images[0].Id),
// InstanceType: pulumi.String(defaultGetInstanceTypes.InstanceTypes[0].Id),
// InstanceName: pulumi.String(name),
// SecurityGroups: splat0,
// InternetChargeType: pulumi.String("PayByTraffic"),
// InternetMaxBandwidthOut: pulumi.Int(10),
// AvailabilityZone: pulumi.String(_default.Zones[0].Id),
// InstanceChargeType: pulumi.String("PostPaid"),
// SystemDiskCategory: pulumi.String("cloud_efficiency"),
// VswitchId: defaultSwitch.ID(),
// })
// if err != nil {
// return err
// }
// defaultInstance = append(defaultInstance, __res)
// }
// return nil
// })
// }
// ```
func GetInstanceTypes(ctx *pulumi.Context, args *GetInstanceTypesArgs, opts ...pulumi.InvokeOption) (*GetInstanceTypesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstanceTypesResult
	err := ctx.Invoke("alicloud:ecs/getInstanceTypes:getInstanceTypes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceTypes.
type GetInstanceTypesArgs struct {
	// The zone where instance types are supported.
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// Filter the results to a specific number of cpu cores.
	CpuCoreCount *int `pulumi:"cpuCoreCount"`
	// Filter the result whose network interface number is no more than `eniAmount`.
	EniAmount *int `pulumi:"eniAmount"`
	// The GPU amount of an instance type.
	GpuAmount *int `pulumi:"gpuAmount"`
	// The GPU spec of an instance type.
	GpuSpec *string `pulumi:"gpuSpec"`
	// The ID of the image.
	ImageId *string `pulumi:"imageId"`
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// Instance specifications. For more information, see instance Specification Family, or you can call the describe instance types interface to get the latest specification table.
	InstanceType *string `pulumi:"instanceType"`
	// Filter the results based on their family name. For example: 'ecs.n4'.
	InstanceTypeFamily *string `pulumi:"instanceTypeFamily"`
	// If true, outdated instance types are included in the results. Default to false.
	IsOutdated *bool `pulumi:"isOutdated"`
	// Filter the result which is used to create a kubernetes cluster
	// and managed kubernetes cluster. Optional Values: `Master` and `Worker`.
	KubernetesNodeRole *string `pulumi:"kubernetesNodeRole"`
	// Filter the results to a specific memory size in GB.
	MemorySize *float64 `pulumi:"memorySize"`
	// The minimum number of IPv6 addresses per ENI. **Note:** If an instance type supports fewer IPv6 addresses per ENI than the specified value, information about the instance type is not queried.
	MinimumEniIpv6AddressQuantity *int `pulumi:"minimumEniIpv6AddressQuantity"`
	// The minimum expected IPv4 address upper limit of a single ENI when querying instance specifications. **Note:** If an instance type supports fewer IPv4 addresses per ENI than the specified value, information about the instance type is not queried.
	MinimumEniPrivateIpAddressQuantity *int `pulumi:"minimumEniPrivateIpAddressQuantity"`
	// Filter the results by network type. Valid values: `Classic` and `Vpc`.
	NetworkType *string `pulumi:"networkType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Sort mode, valid values: `CPU`, `Memory`, `Price`.
	SortedBy *string `pulumi:"sortedBy"`
	// Filter the results by ECS spot type. Valid values: `NoSpot`, `SpotWithPriceLimit` and `SpotAsPriceGo`. Default to `NoSpot`.
	SpotStrategy *string `pulumi:"spotStrategy"`
	// Filter the results by system disk category. Valid values: `cloud`, `ephemeralSsd`, `cloudEssd`, `cloudEfficiency`, `cloudSsd`, `cloudEssdEntry`, `cloudAuto`.
	// **NOTE**: Its default value `cloudEfficiency` has been removed from the version v1.150.0.
	SystemDiskCategory *string `pulumi:"systemDiskCategory"`
}

// A collection of values returned by getInstanceTypes.
type GetInstanceTypesResult struct {
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// Number of CPU cores.
	CpuCoreCount *int `pulumi:"cpuCoreCount"`
	// (Deprecated since v1.239.0) The maximum number of ENIs per instance. It sames as `eniQuantity`.
	EniAmount *int    `pulumi:"eniAmount"`
	GpuAmount *int    `pulumi:"gpuAmount"`
	GpuSpec   *string `pulumi:"gpuSpec"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of instance type IDs.
	Ids                []string `pulumi:"ids"`
	ImageId            *string  `pulumi:"imageId"`
	InstanceChargeType *string  `pulumi:"instanceChargeType"`
	InstanceType       *string  `pulumi:"instanceType"`
	InstanceTypeFamily *string  `pulumi:"instanceTypeFamily"`
	// A list of image types. Each element contains the following attributes:
	InstanceTypes      []GetInstanceTypesInstanceType `pulumi:"instanceTypes"`
	IsOutdated         *bool                          `pulumi:"isOutdated"`
	KubernetesNodeRole *string                        `pulumi:"kubernetesNodeRole"`
	// Size of memory, measured in GB.
	MemorySize                         *float64 `pulumi:"memorySize"`
	MinimumEniIpv6AddressQuantity      *int     `pulumi:"minimumEniIpv6AddressQuantity"`
	MinimumEniPrivateIpAddressQuantity *int     `pulumi:"minimumEniPrivateIpAddressQuantity"`
	NetworkType                        *string  `pulumi:"networkType"`
	OutputFile                         *string  `pulumi:"outputFile"`
	SortedBy                           *string  `pulumi:"sortedBy"`
	SpotStrategy                       *string  `pulumi:"spotStrategy"`
	SystemDiskCategory                 *string  `pulumi:"systemDiskCategory"`
}

func GetInstanceTypesOutput(ctx *pulumi.Context, args GetInstanceTypesOutputArgs, opts ...pulumi.InvokeOption) GetInstanceTypesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetInstanceTypesResultOutput, error) {
			args := v.(GetInstanceTypesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:ecs/getInstanceTypes:getInstanceTypes", args, GetInstanceTypesResultOutput{}, options).(GetInstanceTypesResultOutput), nil
		}).(GetInstanceTypesResultOutput)
}

// A collection of arguments for invoking getInstanceTypes.
type GetInstanceTypesOutputArgs struct {
	// The zone where instance types are supported.
	AvailabilityZone pulumi.StringPtrInput `pulumi:"availabilityZone"`
	// Filter the results to a specific number of cpu cores.
	CpuCoreCount pulumi.IntPtrInput `pulumi:"cpuCoreCount"`
	// Filter the result whose network interface number is no more than `eniAmount`.
	EniAmount pulumi.IntPtrInput `pulumi:"eniAmount"`
	// The GPU amount of an instance type.
	GpuAmount pulumi.IntPtrInput `pulumi:"gpuAmount"`
	// The GPU spec of an instance type.
	GpuSpec pulumi.StringPtrInput `pulumi:"gpuSpec"`
	// The ID of the image.
	ImageId pulumi.StringPtrInput `pulumi:"imageId"`
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
	InstanceChargeType pulumi.StringPtrInput `pulumi:"instanceChargeType"`
	// Instance specifications. For more information, see instance Specification Family, or you can call the describe instance types interface to get the latest specification table.
	InstanceType pulumi.StringPtrInput `pulumi:"instanceType"`
	// Filter the results based on their family name. For example: 'ecs.n4'.
	InstanceTypeFamily pulumi.StringPtrInput `pulumi:"instanceTypeFamily"`
	// If true, outdated instance types are included in the results. Default to false.
	IsOutdated pulumi.BoolPtrInput `pulumi:"isOutdated"`
	// Filter the result which is used to create a kubernetes cluster
	// and managed kubernetes cluster. Optional Values: `Master` and `Worker`.
	KubernetesNodeRole pulumi.StringPtrInput `pulumi:"kubernetesNodeRole"`
	// Filter the results to a specific memory size in GB.
	MemorySize pulumi.Float64PtrInput `pulumi:"memorySize"`
	// The minimum number of IPv6 addresses per ENI. **Note:** If an instance type supports fewer IPv6 addresses per ENI than the specified value, information about the instance type is not queried.
	MinimumEniIpv6AddressQuantity pulumi.IntPtrInput `pulumi:"minimumEniIpv6AddressQuantity"`
	// The minimum expected IPv4 address upper limit of a single ENI when querying instance specifications. **Note:** If an instance type supports fewer IPv4 addresses per ENI than the specified value, information about the instance type is not queried.
	MinimumEniPrivateIpAddressQuantity pulumi.IntPtrInput `pulumi:"minimumEniPrivateIpAddressQuantity"`
	// Filter the results by network type. Valid values: `Classic` and `Vpc`.
	NetworkType pulumi.StringPtrInput `pulumi:"networkType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Sort mode, valid values: `CPU`, `Memory`, `Price`.
	SortedBy pulumi.StringPtrInput `pulumi:"sortedBy"`
	// Filter the results by ECS spot type. Valid values: `NoSpot`, `SpotWithPriceLimit` and `SpotAsPriceGo`. Default to `NoSpot`.
	SpotStrategy pulumi.StringPtrInput `pulumi:"spotStrategy"`
	// Filter the results by system disk category. Valid values: `cloud`, `ephemeralSsd`, `cloudEssd`, `cloudEfficiency`, `cloudSsd`, `cloudEssdEntry`, `cloudAuto`.
	// **NOTE**: Its default value `cloudEfficiency` has been removed from the version v1.150.0.
	SystemDiskCategory pulumi.StringPtrInput `pulumi:"systemDiskCategory"`
}

func (GetInstanceTypesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceTypesArgs)(nil)).Elem()
}

// A collection of values returned by getInstanceTypes.
type GetInstanceTypesResultOutput struct{ *pulumi.OutputState }

func (GetInstanceTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceTypesResult)(nil)).Elem()
}

func (o GetInstanceTypesResultOutput) ToGetInstanceTypesResultOutput() GetInstanceTypesResultOutput {
	return o
}

func (o GetInstanceTypesResultOutput) ToGetInstanceTypesResultOutputWithContext(ctx context.Context) GetInstanceTypesResultOutput {
	return o
}

func (o GetInstanceTypesResultOutput) AvailabilityZone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.AvailabilityZone }).(pulumi.StringPtrOutput)
}

// Number of CPU cores.
func (o GetInstanceTypesResultOutput) CpuCoreCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *int { return v.CpuCoreCount }).(pulumi.IntPtrOutput)
}

// (Deprecated since v1.239.0) The maximum number of ENIs per instance. It sames as `eniQuantity`.
func (o GetInstanceTypesResultOutput) EniAmount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *int { return v.EniAmount }).(pulumi.IntPtrOutput)
}

func (o GetInstanceTypesResultOutput) GpuAmount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *int { return v.GpuAmount }).(pulumi.IntPtrOutput)
}

func (o GetInstanceTypesResultOutput) GpuSpec() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.GpuSpec }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetInstanceTypesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of instance type IDs.
func (o GetInstanceTypesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetInstanceTypesResultOutput) ImageId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.ImageId }).(pulumi.StringPtrOutput)
}

func (o GetInstanceTypesResultOutput) InstanceChargeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.InstanceChargeType }).(pulumi.StringPtrOutput)
}

func (o GetInstanceTypesResultOutput) InstanceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.InstanceType }).(pulumi.StringPtrOutput)
}

func (o GetInstanceTypesResultOutput) InstanceTypeFamily() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.InstanceTypeFamily }).(pulumi.StringPtrOutput)
}

// A list of image types. Each element contains the following attributes:
func (o GetInstanceTypesResultOutput) InstanceTypes() GetInstanceTypesInstanceTypeArrayOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) []GetInstanceTypesInstanceType { return v.InstanceTypes }).(GetInstanceTypesInstanceTypeArrayOutput)
}

func (o GetInstanceTypesResultOutput) IsOutdated() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *bool { return v.IsOutdated }).(pulumi.BoolPtrOutput)
}

func (o GetInstanceTypesResultOutput) KubernetesNodeRole() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.KubernetesNodeRole }).(pulumi.StringPtrOutput)
}

// Size of memory, measured in GB.
func (o GetInstanceTypesResultOutput) MemorySize() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *float64 { return v.MemorySize }).(pulumi.Float64PtrOutput)
}

func (o GetInstanceTypesResultOutput) MinimumEniIpv6AddressQuantity() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *int { return v.MinimumEniIpv6AddressQuantity }).(pulumi.IntPtrOutput)
}

func (o GetInstanceTypesResultOutput) MinimumEniPrivateIpAddressQuantity() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *int { return v.MinimumEniPrivateIpAddressQuantity }).(pulumi.IntPtrOutput)
}

func (o GetInstanceTypesResultOutput) NetworkType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.NetworkType }).(pulumi.StringPtrOutput)
}

func (o GetInstanceTypesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetInstanceTypesResultOutput) SortedBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.SortedBy }).(pulumi.StringPtrOutput)
}

func (o GetInstanceTypesResultOutput) SpotStrategy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.SpotStrategy }).(pulumi.StringPtrOutput)
}

func (o GetInstanceTypesResultOutput) SystemDiskCategory() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.SystemDiskCategory }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceTypesResultOutput{})
}
