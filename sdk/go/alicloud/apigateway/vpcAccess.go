// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/apigateway"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
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
//			exampleNetwork, err := vpc.NewNetwork(ctx, "example", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("terraform-example"),
//				CidrBlock: pulumi.String("10.4.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSwitch, err := vpc.NewSwitch(ctx, "example", &vpc.SwitchArgs{
//				VswitchName: pulumi.String("terraform-example"),
//				CidrBlock:   pulumi.String("10.4.0.0/24"),
//				VpcId:       exampleNetwork.ID(),
//				ZoneId:      pulumi.String(example.Zones[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSecurityGroup, err := ecs.NewSecurityGroup(ctx, "example", &ecs.SecurityGroupArgs{
//				Name:        pulumi.String("terraform-example"),
//				Description: pulumi.String("New security group"),
//				VpcId:       exampleNetwork.ID(),
//			})
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
//			exampleInstance, err := ecs.NewInstance(ctx, "example", &ecs.InstanceArgs{
//				AvailabilityZone: pulumi.String(example.Zones[0].Id),
//				InstanceName:     pulumi.String("terraform-example"),
//				ImageId:          pulumi.String(exampleGetImages.Images[0].Id),
//				InstanceType:     pulumi.String(exampleGetInstanceTypes.InstanceTypes[0].Id),
//				SecurityGroups: pulumi.StringArray{
//					exampleSecurityGroup.ID(),
//				},
//				VswitchId: exampleSwitch.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = apigateway.NewVpcAccess(ctx, "example", &apigateway.VpcAccessArgs{
//				Name:       pulumi.String("terraform-example"),
//				VpcId:      exampleNetwork.ID(),
//				InstanceId: exampleInstance.ID(),
//				Port:       pulumi.Int(8080),
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
// Api gateway app can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:apigateway/vpcAccess:VpcAccess example "APiGatewayVpc:vpc-aswcj19ajsz:i-ajdjfsdlf:8080"
// ```
type VpcAccess struct {
	pulumi.CustomResourceState

	// ID of the instance in VPC (ECS/Server Load Balance).
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The name of the vpc authorization.
	Name pulumi.StringOutput `pulumi:"name"`
	// ID of the port corresponding to the instance.
	Port pulumi.IntOutput `pulumi:"port"`
	// The vpc id of the vpc authorization.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewVpcAccess registers a new resource with the given unique name, arguments, and options.
func NewVpcAccess(ctx *pulumi.Context,
	name string, args *VpcAccessArgs, opts ...pulumi.ResourceOption) (*VpcAccess, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.Port == nil {
		return nil, errors.New("invalid value for required argument 'Port'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VpcAccess
	err := ctx.RegisterResource("alicloud:apigateway/vpcAccess:VpcAccess", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVpcAccess gets an existing VpcAccess resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVpcAccess(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VpcAccessState, opts ...pulumi.ResourceOption) (*VpcAccess, error) {
	var resource VpcAccess
	err := ctx.ReadResource("alicloud:apigateway/vpcAccess:VpcAccess", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VpcAccess resources.
type vpcAccessState struct {
	// ID of the instance in VPC (ECS/Server Load Balance).
	InstanceId *string `pulumi:"instanceId"`
	// The name of the vpc authorization.
	Name *string `pulumi:"name"`
	// ID of the port corresponding to the instance.
	Port *int `pulumi:"port"`
	// The vpc id of the vpc authorization.
	VpcId *string `pulumi:"vpcId"`
}

type VpcAccessState struct {
	// ID of the instance in VPC (ECS/Server Load Balance).
	InstanceId pulumi.StringPtrInput
	// The name of the vpc authorization.
	Name pulumi.StringPtrInput
	// ID of the port corresponding to the instance.
	Port pulumi.IntPtrInput
	// The vpc id of the vpc authorization.
	VpcId pulumi.StringPtrInput
}

func (VpcAccessState) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcAccessState)(nil)).Elem()
}

type vpcAccessArgs struct {
	// ID of the instance in VPC (ECS/Server Load Balance).
	InstanceId string `pulumi:"instanceId"`
	// The name of the vpc authorization.
	Name *string `pulumi:"name"`
	// ID of the port corresponding to the instance.
	Port int `pulumi:"port"`
	// The vpc id of the vpc authorization.
	VpcId string `pulumi:"vpcId"`
}

// The set of arguments for constructing a VpcAccess resource.
type VpcAccessArgs struct {
	// ID of the instance in VPC (ECS/Server Load Balance).
	InstanceId pulumi.StringInput
	// The name of the vpc authorization.
	Name pulumi.StringPtrInput
	// ID of the port corresponding to the instance.
	Port pulumi.IntInput
	// The vpc id of the vpc authorization.
	VpcId pulumi.StringInput
}

func (VpcAccessArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcAccessArgs)(nil)).Elem()
}

type VpcAccessInput interface {
	pulumi.Input

	ToVpcAccessOutput() VpcAccessOutput
	ToVpcAccessOutputWithContext(ctx context.Context) VpcAccessOutput
}

func (*VpcAccess) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcAccess)(nil)).Elem()
}

func (i *VpcAccess) ToVpcAccessOutput() VpcAccessOutput {
	return i.ToVpcAccessOutputWithContext(context.Background())
}

func (i *VpcAccess) ToVpcAccessOutputWithContext(ctx context.Context) VpcAccessOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcAccessOutput)
}

// VpcAccessArrayInput is an input type that accepts VpcAccessArray and VpcAccessArrayOutput values.
// You can construct a concrete instance of `VpcAccessArrayInput` via:
//
//	VpcAccessArray{ VpcAccessArgs{...} }
type VpcAccessArrayInput interface {
	pulumi.Input

	ToVpcAccessArrayOutput() VpcAccessArrayOutput
	ToVpcAccessArrayOutputWithContext(context.Context) VpcAccessArrayOutput
}

type VpcAccessArray []VpcAccessInput

func (VpcAccessArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VpcAccess)(nil)).Elem()
}

func (i VpcAccessArray) ToVpcAccessArrayOutput() VpcAccessArrayOutput {
	return i.ToVpcAccessArrayOutputWithContext(context.Background())
}

func (i VpcAccessArray) ToVpcAccessArrayOutputWithContext(ctx context.Context) VpcAccessArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcAccessArrayOutput)
}

// VpcAccessMapInput is an input type that accepts VpcAccessMap and VpcAccessMapOutput values.
// You can construct a concrete instance of `VpcAccessMapInput` via:
//
//	VpcAccessMap{ "key": VpcAccessArgs{...} }
type VpcAccessMapInput interface {
	pulumi.Input

	ToVpcAccessMapOutput() VpcAccessMapOutput
	ToVpcAccessMapOutputWithContext(context.Context) VpcAccessMapOutput
}

type VpcAccessMap map[string]VpcAccessInput

func (VpcAccessMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VpcAccess)(nil)).Elem()
}

func (i VpcAccessMap) ToVpcAccessMapOutput() VpcAccessMapOutput {
	return i.ToVpcAccessMapOutputWithContext(context.Background())
}

func (i VpcAccessMap) ToVpcAccessMapOutputWithContext(ctx context.Context) VpcAccessMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcAccessMapOutput)
}

type VpcAccessOutput struct{ *pulumi.OutputState }

func (VpcAccessOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcAccess)(nil)).Elem()
}

func (o VpcAccessOutput) ToVpcAccessOutput() VpcAccessOutput {
	return o
}

func (o VpcAccessOutput) ToVpcAccessOutputWithContext(ctx context.Context) VpcAccessOutput {
	return o
}

// ID of the instance in VPC (ECS/Server Load Balance).
func (o VpcAccessOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcAccess) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The name of the vpc authorization.
func (o VpcAccessOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcAccess) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// ID of the port corresponding to the instance.
func (o VpcAccessOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v *VpcAccess) pulumi.IntOutput { return v.Port }).(pulumi.IntOutput)
}

// The vpc id of the vpc authorization.
func (o VpcAccessOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcAccess) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type VpcAccessArrayOutput struct{ *pulumi.OutputState }

func (VpcAccessArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VpcAccess)(nil)).Elem()
}

func (o VpcAccessArrayOutput) ToVpcAccessArrayOutput() VpcAccessArrayOutput {
	return o
}

func (o VpcAccessArrayOutput) ToVpcAccessArrayOutputWithContext(ctx context.Context) VpcAccessArrayOutput {
	return o
}

func (o VpcAccessArrayOutput) Index(i pulumi.IntInput) VpcAccessOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VpcAccess {
		return vs[0].([]*VpcAccess)[vs[1].(int)]
	}).(VpcAccessOutput)
}

type VpcAccessMapOutput struct{ *pulumi.OutputState }

func (VpcAccessMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VpcAccess)(nil)).Elem()
}

func (o VpcAccessMapOutput) ToVpcAccessMapOutput() VpcAccessMapOutput {
	return o
}

func (o VpcAccessMapOutput) ToVpcAccessMapOutputWithContext(ctx context.Context) VpcAccessMapOutput {
	return o
}

func (o VpcAccessMapOutput) MapIndex(k pulumi.StringInput) VpcAccessOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VpcAccess {
		return vs[0].(map[string]*VpcAccess)[vs[1].(string)]
	}).(VpcAccessOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VpcAccessInput)(nil)).Elem(), &VpcAccess{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcAccessArrayInput)(nil)).Elem(), VpcAccessArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcAccessMapInput)(nil)).Elem(), VpcAccessMap{})
	pulumi.RegisterOutputType(VpcAccessOutput{})
	pulumi.RegisterOutputType(VpcAccessArrayOutput{})
	pulumi.RegisterOutputType(VpcAccessMapOutput{})
}
