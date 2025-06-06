// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of Route Entries owned by an Alibaba Cloud account.
//
// > **NOTE:** Available in 1.37.0+.
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
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetInstanceTypes, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
//				AvailabilityZone: pulumi.StringRef(_default.Zones[0].Id),
//				CpuCoreCount:     pulumi.IntRef(1),
//				MemorySize:       pulumi.Float64Ref(2),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetImages, err := ecs.GetImages(ctx, &ecs.GetImagesArgs{
//				NameRegex:  pulumi.StringRef("^ubuntu_18.*64"),
//				MostRecent: pulumi.BoolRef(true),
//				Owners:     pulumi.StringRef("system"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			cfg := config.New(ctx, "")
//			name := "tf-testAccRouteEntryConfig"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			fooNetwork, err := vpc.NewNetwork(ctx, "foo", &vpc.NetworkArgs{
//				Name:      pulumi.String(name),
//				CidrBlock: pulumi.String("10.1.0.0/21"),
//			})
//			if err != nil {
//				return err
//			}
//			fooSwitch, err := vpc.NewSwitch(ctx, "foo", &vpc.SwitchArgs{
//				VpcId:            fooNetwork.ID(),
//				CidrBlock:        pulumi.String("10.1.1.0/24"),
//				AvailabilityZone: pulumi.String(_default.Zones[0].Id),
//				VswitchName:      pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			tfTestFoo, err := ecs.NewSecurityGroup(ctx, "tf_test_foo", &ecs.SecurityGroupArgs{
//				Name:        pulumi.String(name),
//				Description: pulumi.String("foo"),
//				VpcId:       fooNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			fooInstance, err := ecs.NewInstance(ctx, "foo", &ecs.InstanceArgs{
//				SecurityGroups: pulumi.StringArray{
//					tfTestFoo.ID(),
//				},
//				VswitchId:               fooSwitch.ID(),
//				AllocatePublicIp:        pulumi.Bool(true),
//				InstanceChargeType:      pulumi.String("PostPaid"),
//				InstanceType:            pulumi.String(defaultGetInstanceTypes.InstanceTypes[0].Id),
//				InternetChargeType:      pulumi.String("PayByTraffic"),
//				InternetMaxBandwidthOut: pulumi.Int(5),
//				SystemDiskCategory:      pulumi.String("cloud_efficiency"),
//				ImageId:                 pulumi.String(defaultGetImages.Images[0].Id),
//				InstanceName:            pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			fooRouteEntry, err := vpc.NewRouteEntry(ctx, "foo", &vpc.RouteEntryArgs{
//				RouteTableId:         fooNetwork.RouteTableId,
//				DestinationCidrblock: pulumi.String("172.11.1.1/32"),
//				NexthopType:          pulumi.String("Instance"),
//				NexthopId:            fooInstance.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ecs.NewSecurityGroupRule(ctx, "ingress", &ecs.SecurityGroupRuleArgs{
//				Type:            pulumi.String("ingress"),
//				IpProtocol:      pulumi.String("tcp"),
//				NicType:         pulumi.String("intranet"),
//				Policy:          pulumi.String("accept"),
//				PortRange:       pulumi.String("22/22"),
//				Priority:        pulumi.Int(1),
//				SecurityGroupId: tfTestFoo.ID(),
//				CidrIp:          pulumi.String("0.0.0.0/0"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = vpc.GetRouteEntriesOutput(ctx, vpc.GetRouteEntriesOutputArgs{
//				RouteTableId: fooRouteEntry.RouteTableId,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func GetRouteEntries(ctx *pulumi.Context, args *GetRouteEntriesArgs, opts ...pulumi.InvokeOption) (*GetRouteEntriesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRouteEntriesResult
	err := ctx.Invoke("alicloud:vpc/getRouteEntries:getRouteEntries", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRouteEntries.
type GetRouteEntriesArgs struct {
	// The destination CIDR block of the route entry.
	CidrBlock *string `pulumi:"cidrBlock"`
	// The instance ID of the next hop.
	InstanceId *string `pulumi:"instanceId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the router table to which the route entry belongs.
	RouteTableId string `pulumi:"routeTableId"`
	// The type of the route entry.
	Type *string `pulumi:"type"`
}

// A collection of values returned by getRouteEntries.
type GetRouteEntriesResult struct {
	// The destination CIDR block of the route entry.
	CidrBlock *string `pulumi:"cidrBlock"`
	// A list of Route Entries. Each element contains the following attributes:
	Entries []GetRouteEntriesEntry `pulumi:"entries"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The instance ID of the next hop.
	InstanceId *string `pulumi:"instanceId"`
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the router table to which the route entry belongs.
	RouteTableId string `pulumi:"routeTableId"`
	// The type of the route entry.
	Type *string `pulumi:"type"`
}

func GetRouteEntriesOutput(ctx *pulumi.Context, args GetRouteEntriesOutputArgs, opts ...pulumi.InvokeOption) GetRouteEntriesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetRouteEntriesResultOutput, error) {
			args := v.(GetRouteEntriesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:vpc/getRouteEntries:getRouteEntries", args, GetRouteEntriesResultOutput{}, options).(GetRouteEntriesResultOutput), nil
		}).(GetRouteEntriesResultOutput)
}

// A collection of arguments for invoking getRouteEntries.
type GetRouteEntriesOutputArgs struct {
	// The destination CIDR block of the route entry.
	CidrBlock pulumi.StringPtrInput `pulumi:"cidrBlock"`
	// The instance ID of the next hop.
	InstanceId pulumi.StringPtrInput `pulumi:"instanceId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the router table to which the route entry belongs.
	RouteTableId pulumi.StringInput `pulumi:"routeTableId"`
	// The type of the route entry.
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (GetRouteEntriesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteEntriesArgs)(nil)).Elem()
}

// A collection of values returned by getRouteEntries.
type GetRouteEntriesResultOutput struct{ *pulumi.OutputState }

func (GetRouteEntriesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteEntriesResult)(nil)).Elem()
}

func (o GetRouteEntriesResultOutput) ToGetRouteEntriesResultOutput() GetRouteEntriesResultOutput {
	return o
}

func (o GetRouteEntriesResultOutput) ToGetRouteEntriesResultOutputWithContext(ctx context.Context) GetRouteEntriesResultOutput {
	return o
}

// The destination CIDR block of the route entry.
func (o GetRouteEntriesResultOutput) CidrBlock() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) *string { return v.CidrBlock }).(pulumi.StringPtrOutput)
}

// A list of Route Entries. Each element contains the following attributes:
func (o GetRouteEntriesResultOutput) Entries() GetRouteEntriesEntryArrayOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) []GetRouteEntriesEntry { return v.Entries }).(GetRouteEntriesEntryArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRouteEntriesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) string { return v.Id }).(pulumi.StringOutput)
}

// The instance ID of the next hop.
func (o GetRouteEntriesResultOutput) InstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) *string { return v.InstanceId }).(pulumi.StringPtrOutput)
}

func (o GetRouteEntriesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The ID of the router table to which the route entry belongs.
func (o GetRouteEntriesResultOutput) RouteTableId() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) string { return v.RouteTableId }).(pulumi.StringOutput)
}

// The type of the route entry.
func (o GetRouteEntriesResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRouteEntriesResultOutput{})
}
