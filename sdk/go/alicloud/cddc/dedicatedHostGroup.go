// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cddc

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ApsaraDB for MyBase Dedicated Host Group resource.
//
// For information about ApsaraDB for MyBase Dedicated Host Group and how to use it, see [What is Dedicated Host Group](https://www.alibabacloud.com/help/doc-detail/141455.htm).
//
// > **NOTE:** Available in v1.132.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cddc"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		vpc, err := vpc.NewNetwork(ctx, "vpc", &vpc.NetworkArgs{
// 			VpcName:   pulumi.String("tf_test_foo"),
// 			CidrBlock: pulumi.String("172.16.0.0/12"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cddc.NewDedicatedHostGroup(ctx, "default", &cddc.DedicatedHostGroupArgs{
// 			Engine:                 pulumi.String("MongoDB"),
// 			VpcId:                  vpc.ID(),
// 			CpuAllocationRatio:     pulumi.Int(101),
// 			MemAllocationRatio:     pulumi.Int(50),
// 			DiskAllocationRatio:    pulumi.Int(200),
// 			AllocationPolicy:       pulumi.String("Evenly"),
// 			HostReplacePolicy:      pulumi.String("Manual"),
// 			DedicatedHostGroupDesc: pulumi.String("tf-testaccDesc"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// ApsaraDB for MyBase Dedicated Host Group can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:cddc/dedicatedHostGroup:DedicatedHostGroup example <id>
// ```
type DedicatedHostGroup struct {
	pulumi.CustomResourceState

	// AThe policy that is used to allocate resources in the dedicated cluster. Valid values:`Evenly`,`Intensively`
	AllocationPolicy pulumi.StringOutput `pulumi:"allocationPolicy"`
	// The CPU overcommitment ratio of the dedicated cluster.Valid values: 100 to 300. Default value: 200.
	CpuAllocationRatio pulumi.IntOutput `pulumi:"cpuAllocationRatio"`
	// The name of the dedicated cluster. The name must be 1 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
	DedicatedHostGroupDesc pulumi.StringPtrOutput `pulumi:"dedicatedHostGroupDesc"`
	// The Disk Allocation Ratio of the Dedicated Host Group.
	DiskAllocationRatio pulumi.IntOutput `pulumi:"diskAllocationRatio"`
	// Database Engine Type.The database engine of the dedicated cluster. Valid values:`Redis`, `SQLServer`, `MySQL`, `PostgreSQL`, `MongoDB`
	Engine pulumi.StringOutput `pulumi:"engine"`
	// The policy based on which the system handles host failures. Valid values:`Auto`,`Manual`
	HostReplacePolicy pulumi.StringOutput `pulumi:"hostReplacePolicy"`
	// The Memory Allocation Ratio of the Dedicated Host Group.
	MemAllocationRatio pulumi.IntOutput `pulumi:"memAllocationRatio"`
	// Whether to enable the feature that allows you to have OS permissions on the hosts in the dedicated cluster. Valid values: `true` and `false`.
	OpenPermission pulumi.BoolOutput `pulumi:"openPermission"`
	// The virtual private cloud (VPC) ID of the dedicated cluster.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewDedicatedHostGroup registers a new resource with the given unique name, arguments, and options.
func NewDedicatedHostGroup(ctx *pulumi.Context,
	name string, args *DedicatedHostGroupArgs, opts ...pulumi.ResourceOption) (*DedicatedHostGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Engine == nil {
		return nil, errors.New("invalid value for required argument 'Engine'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	var resource DedicatedHostGroup
	err := ctx.RegisterResource("alicloud:cddc/dedicatedHostGroup:DedicatedHostGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDedicatedHostGroup gets an existing DedicatedHostGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDedicatedHostGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DedicatedHostGroupState, opts ...pulumi.ResourceOption) (*DedicatedHostGroup, error) {
	var resource DedicatedHostGroup
	err := ctx.ReadResource("alicloud:cddc/dedicatedHostGroup:DedicatedHostGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DedicatedHostGroup resources.
type dedicatedHostGroupState struct {
	// AThe policy that is used to allocate resources in the dedicated cluster. Valid values:`Evenly`,`Intensively`
	AllocationPolicy *string `pulumi:"allocationPolicy"`
	// The CPU overcommitment ratio of the dedicated cluster.Valid values: 100 to 300. Default value: 200.
	CpuAllocationRatio *int `pulumi:"cpuAllocationRatio"`
	// The name of the dedicated cluster. The name must be 1 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
	DedicatedHostGroupDesc *string `pulumi:"dedicatedHostGroupDesc"`
	// The Disk Allocation Ratio of the Dedicated Host Group.
	DiskAllocationRatio *int `pulumi:"diskAllocationRatio"`
	// Database Engine Type.The database engine of the dedicated cluster. Valid values:`Redis`, `SQLServer`, `MySQL`, `PostgreSQL`, `MongoDB`
	Engine *string `pulumi:"engine"`
	// The policy based on which the system handles host failures. Valid values:`Auto`,`Manual`
	HostReplacePolicy *string `pulumi:"hostReplacePolicy"`
	// The Memory Allocation Ratio of the Dedicated Host Group.
	MemAllocationRatio *int `pulumi:"memAllocationRatio"`
	// Whether to enable the feature that allows you to have OS permissions on the hosts in the dedicated cluster. Valid values: `true` and `false`.
	OpenPermission *bool `pulumi:"openPermission"`
	// The virtual private cloud (VPC) ID of the dedicated cluster.
	VpcId *string `pulumi:"vpcId"`
}

type DedicatedHostGroupState struct {
	// AThe policy that is used to allocate resources in the dedicated cluster. Valid values:`Evenly`,`Intensively`
	AllocationPolicy pulumi.StringPtrInput
	// The CPU overcommitment ratio of the dedicated cluster.Valid values: 100 to 300. Default value: 200.
	CpuAllocationRatio pulumi.IntPtrInput
	// The name of the dedicated cluster. The name must be 1 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
	DedicatedHostGroupDesc pulumi.StringPtrInput
	// The Disk Allocation Ratio of the Dedicated Host Group.
	DiskAllocationRatio pulumi.IntPtrInput
	// Database Engine Type.The database engine of the dedicated cluster. Valid values:`Redis`, `SQLServer`, `MySQL`, `PostgreSQL`, `MongoDB`
	Engine pulumi.StringPtrInput
	// The policy based on which the system handles host failures. Valid values:`Auto`,`Manual`
	HostReplacePolicy pulumi.StringPtrInput
	// The Memory Allocation Ratio of the Dedicated Host Group.
	MemAllocationRatio pulumi.IntPtrInput
	// Whether to enable the feature that allows you to have OS permissions on the hosts in the dedicated cluster. Valid values: `true` and `false`.
	OpenPermission pulumi.BoolPtrInput
	// The virtual private cloud (VPC) ID of the dedicated cluster.
	VpcId pulumi.StringPtrInput
}

func (DedicatedHostGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*dedicatedHostGroupState)(nil)).Elem()
}

type dedicatedHostGroupArgs struct {
	// AThe policy that is used to allocate resources in the dedicated cluster. Valid values:`Evenly`,`Intensively`
	AllocationPolicy *string `pulumi:"allocationPolicy"`
	// The CPU overcommitment ratio of the dedicated cluster.Valid values: 100 to 300. Default value: 200.
	CpuAllocationRatio *int `pulumi:"cpuAllocationRatio"`
	// The name of the dedicated cluster. The name must be 1 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
	DedicatedHostGroupDesc *string `pulumi:"dedicatedHostGroupDesc"`
	// The Disk Allocation Ratio of the Dedicated Host Group.
	DiskAllocationRatio *int `pulumi:"diskAllocationRatio"`
	// Database Engine Type.The database engine of the dedicated cluster. Valid values:`Redis`, `SQLServer`, `MySQL`, `PostgreSQL`, `MongoDB`
	Engine string `pulumi:"engine"`
	// The policy based on which the system handles host failures. Valid values:`Auto`,`Manual`
	HostReplacePolicy *string `pulumi:"hostReplacePolicy"`
	// The Memory Allocation Ratio of the Dedicated Host Group.
	MemAllocationRatio *int `pulumi:"memAllocationRatio"`
	// Whether to enable the feature that allows you to have OS permissions on the hosts in the dedicated cluster. Valid values: `true` and `false`.
	OpenPermission *bool `pulumi:"openPermission"`
	// The virtual private cloud (VPC) ID of the dedicated cluster.
	VpcId string `pulumi:"vpcId"`
}

// The set of arguments for constructing a DedicatedHostGroup resource.
type DedicatedHostGroupArgs struct {
	// AThe policy that is used to allocate resources in the dedicated cluster. Valid values:`Evenly`,`Intensively`
	AllocationPolicy pulumi.StringPtrInput
	// The CPU overcommitment ratio of the dedicated cluster.Valid values: 100 to 300. Default value: 200.
	CpuAllocationRatio pulumi.IntPtrInput
	// The name of the dedicated cluster. The name must be 1 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
	DedicatedHostGroupDesc pulumi.StringPtrInput
	// The Disk Allocation Ratio of the Dedicated Host Group.
	DiskAllocationRatio pulumi.IntPtrInput
	// Database Engine Type.The database engine of the dedicated cluster. Valid values:`Redis`, `SQLServer`, `MySQL`, `PostgreSQL`, `MongoDB`
	Engine pulumi.StringInput
	// The policy based on which the system handles host failures. Valid values:`Auto`,`Manual`
	HostReplacePolicy pulumi.StringPtrInput
	// The Memory Allocation Ratio of the Dedicated Host Group.
	MemAllocationRatio pulumi.IntPtrInput
	// Whether to enable the feature that allows you to have OS permissions on the hosts in the dedicated cluster. Valid values: `true` and `false`.
	OpenPermission pulumi.BoolPtrInput
	// The virtual private cloud (VPC) ID of the dedicated cluster.
	VpcId pulumi.StringInput
}

func (DedicatedHostGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dedicatedHostGroupArgs)(nil)).Elem()
}

type DedicatedHostGroupInput interface {
	pulumi.Input

	ToDedicatedHostGroupOutput() DedicatedHostGroupOutput
	ToDedicatedHostGroupOutputWithContext(ctx context.Context) DedicatedHostGroupOutput
}

func (*DedicatedHostGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**DedicatedHostGroup)(nil)).Elem()
}

func (i *DedicatedHostGroup) ToDedicatedHostGroupOutput() DedicatedHostGroupOutput {
	return i.ToDedicatedHostGroupOutputWithContext(context.Background())
}

func (i *DedicatedHostGroup) ToDedicatedHostGroupOutputWithContext(ctx context.Context) DedicatedHostGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedHostGroupOutput)
}

// DedicatedHostGroupArrayInput is an input type that accepts DedicatedHostGroupArray and DedicatedHostGroupArrayOutput values.
// You can construct a concrete instance of `DedicatedHostGroupArrayInput` via:
//
//          DedicatedHostGroupArray{ DedicatedHostGroupArgs{...} }
type DedicatedHostGroupArrayInput interface {
	pulumi.Input

	ToDedicatedHostGroupArrayOutput() DedicatedHostGroupArrayOutput
	ToDedicatedHostGroupArrayOutputWithContext(context.Context) DedicatedHostGroupArrayOutput
}

type DedicatedHostGroupArray []DedicatedHostGroupInput

func (DedicatedHostGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DedicatedHostGroup)(nil)).Elem()
}

func (i DedicatedHostGroupArray) ToDedicatedHostGroupArrayOutput() DedicatedHostGroupArrayOutput {
	return i.ToDedicatedHostGroupArrayOutputWithContext(context.Background())
}

func (i DedicatedHostGroupArray) ToDedicatedHostGroupArrayOutputWithContext(ctx context.Context) DedicatedHostGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedHostGroupArrayOutput)
}

// DedicatedHostGroupMapInput is an input type that accepts DedicatedHostGroupMap and DedicatedHostGroupMapOutput values.
// You can construct a concrete instance of `DedicatedHostGroupMapInput` via:
//
//          DedicatedHostGroupMap{ "key": DedicatedHostGroupArgs{...} }
type DedicatedHostGroupMapInput interface {
	pulumi.Input

	ToDedicatedHostGroupMapOutput() DedicatedHostGroupMapOutput
	ToDedicatedHostGroupMapOutputWithContext(context.Context) DedicatedHostGroupMapOutput
}

type DedicatedHostGroupMap map[string]DedicatedHostGroupInput

func (DedicatedHostGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DedicatedHostGroup)(nil)).Elem()
}

func (i DedicatedHostGroupMap) ToDedicatedHostGroupMapOutput() DedicatedHostGroupMapOutput {
	return i.ToDedicatedHostGroupMapOutputWithContext(context.Background())
}

func (i DedicatedHostGroupMap) ToDedicatedHostGroupMapOutputWithContext(ctx context.Context) DedicatedHostGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedHostGroupMapOutput)
}

type DedicatedHostGroupOutput struct{ *pulumi.OutputState }

func (DedicatedHostGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DedicatedHostGroup)(nil)).Elem()
}

func (o DedicatedHostGroupOutput) ToDedicatedHostGroupOutput() DedicatedHostGroupOutput {
	return o
}

func (o DedicatedHostGroupOutput) ToDedicatedHostGroupOutputWithContext(ctx context.Context) DedicatedHostGroupOutput {
	return o
}

type DedicatedHostGroupArrayOutput struct{ *pulumi.OutputState }

func (DedicatedHostGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DedicatedHostGroup)(nil)).Elem()
}

func (o DedicatedHostGroupArrayOutput) ToDedicatedHostGroupArrayOutput() DedicatedHostGroupArrayOutput {
	return o
}

func (o DedicatedHostGroupArrayOutput) ToDedicatedHostGroupArrayOutputWithContext(ctx context.Context) DedicatedHostGroupArrayOutput {
	return o
}

func (o DedicatedHostGroupArrayOutput) Index(i pulumi.IntInput) DedicatedHostGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DedicatedHostGroup {
		return vs[0].([]*DedicatedHostGroup)[vs[1].(int)]
	}).(DedicatedHostGroupOutput)
}

type DedicatedHostGroupMapOutput struct{ *pulumi.OutputState }

func (DedicatedHostGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DedicatedHostGroup)(nil)).Elem()
}

func (o DedicatedHostGroupMapOutput) ToDedicatedHostGroupMapOutput() DedicatedHostGroupMapOutput {
	return o
}

func (o DedicatedHostGroupMapOutput) ToDedicatedHostGroupMapOutputWithContext(ctx context.Context) DedicatedHostGroupMapOutput {
	return o
}

func (o DedicatedHostGroupMapOutput) MapIndex(k pulumi.StringInput) DedicatedHostGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DedicatedHostGroup {
		return vs[0].(map[string]*DedicatedHostGroup)[vs[1].(string)]
	}).(DedicatedHostGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DedicatedHostGroupInput)(nil)).Elem(), &DedicatedHostGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*DedicatedHostGroupArrayInput)(nil)).Elem(), DedicatedHostGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DedicatedHostGroupMapInput)(nil)).Elem(), DedicatedHostGroupMap{})
	pulumi.RegisterOutputType(DedicatedHostGroupOutput{})
	pulumi.RegisterOutputType(DedicatedHostGroupArrayOutput{})
	pulumi.RegisterOutputType(DedicatedHostGroupMapOutput{})
}