// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package expressconnect

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Express Connect Grant Rule To Cen resource.
//
// For information about Express Connect Grant Rule To Cen and how to use it, see [What is Grant Rule To Cen](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/grantinstancetocen).
//
// > **NOTE:** Available in v1.196.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/expressconnect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			defaultAccount, err := alicloud.GetAccount(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			defaultPhysicalConnections, err := expressconnect.GetPhysicalConnections(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			defaultInstance, err := cen.NewInstance(ctx, "defaultInstance", &cen.InstanceArgs{
//				CenInstanceName: pulumi.String("tf-example"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultVirtualBorderRouter, err := expressconnect.NewVirtualBorderRouter(ctx, "defaultVirtualBorderRouter", &expressconnect.VirtualBorderRouterArgs{
//				LocalGatewayIp:       pulumi.String("10.0.0.1"),
//				PeerGatewayIp:        pulumi.String("10.0.0.2"),
//				PeeringSubnetMask:    pulumi.String("255.255.255.252"),
//				PhysicalConnectionId: *pulumi.String(defaultPhysicalConnections.Connections[0].Id),
//				VlanId:               pulumi.Int(1),
//				MinRxInterval:        pulumi.Int(1000),
//				MinTxInterval:        pulumi.Int(1000),
//				DetectMultiplier:     pulumi.Int(10),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = expressconnect.NewGrantRuleToCen(ctx, "defaultGrantRuleToCen", &expressconnect.GrantRuleToCenArgs{
//				CenId:      defaultInstance.ID(),
//				CenOwnerId: *pulumi.String(defaultAccount.Id),
//				InstanceId: defaultVirtualBorderRouter.ID(),
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
// Express Connect Grant Rule To Cen can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:expressconnect/grantRuleToCen:GrantRuleToCen example <cen_id>:<cen_owner_id>:<instance_id>
//
// ```
type GrantRuleToCen struct {
	pulumi.CustomResourceState

	// The ID of the CEN instance to which you want to grant permissions.
	CenId pulumi.StringOutput `pulumi:"cenId"`
	// The user ID (UID) of the Alibaba Cloud account to which the CEN instance belongs.
	CenOwnerId pulumi.IntOutput `pulumi:"cenOwnerId"`
	// The ID of the VBR.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
}

// NewGrantRuleToCen registers a new resource with the given unique name, arguments, and options.
func NewGrantRuleToCen(ctx *pulumi.Context,
	name string, args *GrantRuleToCenArgs, opts ...pulumi.ResourceOption) (*GrantRuleToCen, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CenId == nil {
		return nil, errors.New("invalid value for required argument 'CenId'")
	}
	if args.CenOwnerId == nil {
		return nil, errors.New("invalid value for required argument 'CenOwnerId'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	var resource GrantRuleToCen
	err := ctx.RegisterResource("alicloud:expressconnect/grantRuleToCen:GrantRuleToCen", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGrantRuleToCen gets an existing GrantRuleToCen resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGrantRuleToCen(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GrantRuleToCenState, opts ...pulumi.ResourceOption) (*GrantRuleToCen, error) {
	var resource GrantRuleToCen
	err := ctx.ReadResource("alicloud:expressconnect/grantRuleToCen:GrantRuleToCen", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GrantRuleToCen resources.
type grantRuleToCenState struct {
	// The ID of the CEN instance to which you want to grant permissions.
	CenId *string `pulumi:"cenId"`
	// The user ID (UID) of the Alibaba Cloud account to which the CEN instance belongs.
	CenOwnerId *int `pulumi:"cenOwnerId"`
	// The ID of the VBR.
	InstanceId *string `pulumi:"instanceId"`
}

type GrantRuleToCenState struct {
	// The ID of the CEN instance to which you want to grant permissions.
	CenId pulumi.StringPtrInput
	// The user ID (UID) of the Alibaba Cloud account to which the CEN instance belongs.
	CenOwnerId pulumi.IntPtrInput
	// The ID of the VBR.
	InstanceId pulumi.StringPtrInput
}

func (GrantRuleToCenState) ElementType() reflect.Type {
	return reflect.TypeOf((*grantRuleToCenState)(nil)).Elem()
}

type grantRuleToCenArgs struct {
	// The ID of the CEN instance to which you want to grant permissions.
	CenId string `pulumi:"cenId"`
	// The user ID (UID) of the Alibaba Cloud account to which the CEN instance belongs.
	CenOwnerId int `pulumi:"cenOwnerId"`
	// The ID of the VBR.
	InstanceId string `pulumi:"instanceId"`
}

// The set of arguments for constructing a GrantRuleToCen resource.
type GrantRuleToCenArgs struct {
	// The ID of the CEN instance to which you want to grant permissions.
	CenId pulumi.StringInput
	// The user ID (UID) of the Alibaba Cloud account to which the CEN instance belongs.
	CenOwnerId pulumi.IntInput
	// The ID of the VBR.
	InstanceId pulumi.StringInput
}

func (GrantRuleToCenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*grantRuleToCenArgs)(nil)).Elem()
}

type GrantRuleToCenInput interface {
	pulumi.Input

	ToGrantRuleToCenOutput() GrantRuleToCenOutput
	ToGrantRuleToCenOutputWithContext(ctx context.Context) GrantRuleToCenOutput
}

func (*GrantRuleToCen) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantRuleToCen)(nil)).Elem()
}

func (i *GrantRuleToCen) ToGrantRuleToCenOutput() GrantRuleToCenOutput {
	return i.ToGrantRuleToCenOutputWithContext(context.Background())
}

func (i *GrantRuleToCen) ToGrantRuleToCenOutputWithContext(ctx context.Context) GrantRuleToCenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantRuleToCenOutput)
}

// GrantRuleToCenArrayInput is an input type that accepts GrantRuleToCenArray and GrantRuleToCenArrayOutput values.
// You can construct a concrete instance of `GrantRuleToCenArrayInput` via:
//
//	GrantRuleToCenArray{ GrantRuleToCenArgs{...} }
type GrantRuleToCenArrayInput interface {
	pulumi.Input

	ToGrantRuleToCenArrayOutput() GrantRuleToCenArrayOutput
	ToGrantRuleToCenArrayOutputWithContext(context.Context) GrantRuleToCenArrayOutput
}

type GrantRuleToCenArray []GrantRuleToCenInput

func (GrantRuleToCenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantRuleToCen)(nil)).Elem()
}

func (i GrantRuleToCenArray) ToGrantRuleToCenArrayOutput() GrantRuleToCenArrayOutput {
	return i.ToGrantRuleToCenArrayOutputWithContext(context.Background())
}

func (i GrantRuleToCenArray) ToGrantRuleToCenArrayOutputWithContext(ctx context.Context) GrantRuleToCenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantRuleToCenArrayOutput)
}

// GrantRuleToCenMapInput is an input type that accepts GrantRuleToCenMap and GrantRuleToCenMapOutput values.
// You can construct a concrete instance of `GrantRuleToCenMapInput` via:
//
//	GrantRuleToCenMap{ "key": GrantRuleToCenArgs{...} }
type GrantRuleToCenMapInput interface {
	pulumi.Input

	ToGrantRuleToCenMapOutput() GrantRuleToCenMapOutput
	ToGrantRuleToCenMapOutputWithContext(context.Context) GrantRuleToCenMapOutput
}

type GrantRuleToCenMap map[string]GrantRuleToCenInput

func (GrantRuleToCenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantRuleToCen)(nil)).Elem()
}

func (i GrantRuleToCenMap) ToGrantRuleToCenMapOutput() GrantRuleToCenMapOutput {
	return i.ToGrantRuleToCenMapOutputWithContext(context.Background())
}

func (i GrantRuleToCenMap) ToGrantRuleToCenMapOutputWithContext(ctx context.Context) GrantRuleToCenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantRuleToCenMapOutput)
}

type GrantRuleToCenOutput struct{ *pulumi.OutputState }

func (GrantRuleToCenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantRuleToCen)(nil)).Elem()
}

func (o GrantRuleToCenOutput) ToGrantRuleToCenOutput() GrantRuleToCenOutput {
	return o
}

func (o GrantRuleToCenOutput) ToGrantRuleToCenOutputWithContext(ctx context.Context) GrantRuleToCenOutput {
	return o
}

// The ID of the CEN instance to which you want to grant permissions.
func (o GrantRuleToCenOutput) CenId() pulumi.StringOutput {
	return o.ApplyT(func(v *GrantRuleToCen) pulumi.StringOutput { return v.CenId }).(pulumi.StringOutput)
}

// The user ID (UID) of the Alibaba Cloud account to which the CEN instance belongs.
func (o GrantRuleToCenOutput) CenOwnerId() pulumi.IntOutput {
	return o.ApplyT(func(v *GrantRuleToCen) pulumi.IntOutput { return v.CenOwnerId }).(pulumi.IntOutput)
}

// The ID of the VBR.
func (o GrantRuleToCenOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *GrantRuleToCen) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

type GrantRuleToCenArrayOutput struct{ *pulumi.OutputState }

func (GrantRuleToCenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantRuleToCen)(nil)).Elem()
}

func (o GrantRuleToCenArrayOutput) ToGrantRuleToCenArrayOutput() GrantRuleToCenArrayOutput {
	return o
}

func (o GrantRuleToCenArrayOutput) ToGrantRuleToCenArrayOutputWithContext(ctx context.Context) GrantRuleToCenArrayOutput {
	return o
}

func (o GrantRuleToCenArrayOutput) Index(i pulumi.IntInput) GrantRuleToCenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GrantRuleToCen {
		return vs[0].([]*GrantRuleToCen)[vs[1].(int)]
	}).(GrantRuleToCenOutput)
}

type GrantRuleToCenMapOutput struct{ *pulumi.OutputState }

func (GrantRuleToCenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantRuleToCen)(nil)).Elem()
}

func (o GrantRuleToCenMapOutput) ToGrantRuleToCenMapOutput() GrantRuleToCenMapOutput {
	return o
}

func (o GrantRuleToCenMapOutput) ToGrantRuleToCenMapOutputWithContext(ctx context.Context) GrantRuleToCenMapOutput {
	return o
}

func (o GrantRuleToCenMapOutput) MapIndex(k pulumi.StringInput) GrantRuleToCenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GrantRuleToCen {
		return vs[0].(map[string]*GrantRuleToCen)[vs[1].(string)]
	}).(GrantRuleToCenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GrantRuleToCenInput)(nil)).Elem(), &GrantRuleToCen{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantRuleToCenArrayInput)(nil)).Elem(), GrantRuleToCenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantRuleToCenMapInput)(nil)).Elem(), GrantRuleToCenMap{})
	pulumi.RegisterOutputType(GrantRuleToCenOutput{})
	pulumi.RegisterOutputType(GrantRuleToCenArrayOutput{})
	pulumi.RegisterOutputType(GrantRuleToCenMapOutput{})
}