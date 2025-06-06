// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provide RDS cluster instance endpoint connection resources, see [What is RDS DB Instance Endpoint](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-createdbinstanceendpoint).
//
// > **NOTE:** Available since v1.203.0.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/rds"
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
//			_default, err := rds.GetZones(ctx, &rds.GetZonesArgs{
//				Engine:                pulumi.StringRef("MySQL"),
//				EngineVersion:         pulumi.StringRef("8.0"),
//				InstanceChargeType:    pulumi.StringRef("PostPaid"),
//				Category:              pulumi.StringRef("cluster"),
//				DbInstanceStorageType: pulumi.StringRef("cloud_essd"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetInstanceClasses, err := rds.GetInstanceClasses(ctx, &rds.GetInstanceClassesArgs{
//				ZoneId:                pulumi.StringRef(_default.Ids[0]),
//				Engine:                pulumi.StringRef("MySQL"),
//				EngineVersion:         pulumi.StringRef("8.0"),
//				Category:              pulumi.StringRef("cluster"),
//				DbInstanceStorageType: pulumi.StringRef("cloud_essd"),
//				InstanceChargeType:    pulumi.StringRef("PostPaid"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "default", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("172.16.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "default", &vpc.SwitchArgs{
//				VpcId:       defaultNetwork.ID(),
//				CidrBlock:   pulumi.String("172.16.0.0/24"),
//				ZoneId:      pulumi.String(_default.Ids[0]),
//				VswitchName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSecurityGroup, err := ecs.NewSecurityGroup(ctx, "default", &ecs.SecurityGroupArgs{
//				Name:  pulumi.String(name),
//				VpcId: defaultNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			defaultInstance, err := rds.NewInstance(ctx, "default", &rds.InstanceArgs{
//				Engine:                pulumi.String("MySQL"),
//				EngineVersion:         pulumi.String("8.0"),
//				InstanceType:          pulumi.String(defaultGetInstanceClasses.InstanceClasses[0].InstanceClass),
//				InstanceStorage:       pulumi.String(defaultGetInstanceClasses.InstanceClasses[0].StorageRange.Min),
//				InstanceChargeType:    pulumi.String("Postpaid"),
//				InstanceName:          pulumi.String(name),
//				VswitchId:             defaultSwitch.ID(),
//				MonitoringPeriod:      pulumi.Int(60),
//				DbInstanceStorageType: pulumi.String("cloud_essd"),
//				SecurityGroupIds: pulumi.StringArray{
//					defaultSecurityGroup.ID(),
//				},
//				ZoneId:       pulumi.String(_default.Ids[0]),
//				ZoneIdSlaveA: pulumi.String(_default.Ids[0]),
//			})
//			if err != nil {
//				return err
//			}
//			defaultDbNode, err := rds.NewDbNode(ctx, "default", &rds.DbNodeArgs{
//				DbInstanceId: defaultInstance.ID(),
//				ClassCode:    defaultInstance.InstanceType,
//				ZoneId:       defaultSwitch.ZoneId,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = rds.NewDbInstanceEndpoint(ctx, "default", &rds.DbInstanceEndpointArgs{
//				DbInstanceId:                  defaultDbNode.DbInstanceId,
//				VpcId:                         defaultNetwork.ID(),
//				VswitchId:                     defaultInstance.VswitchId,
//				ConnectionStringPrefix:        pulumi.String("example"),
//				Port:                          pulumi.String("3306"),
//				DbInstanceEndpointDescription: pulumi.String(name),
//				NodeItems: rds.DbInstanceEndpointNodeItemArray{
//					&rds.DbInstanceEndpointNodeItemArgs{
//						NodeId: defaultDbNode.NodeId,
//						Weight: pulumi.Int(25),
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
// RDS database endpoint feature can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:rds/dbInstanceEndpoint:DbInstanceEndpoint example <db_instance_id>:<db_instance_endpoint_id>
// ```
type DbInstanceEndpoint struct {
	pulumi.CustomResourceState

	// The internal endpoint.
	ConnectionString pulumi.StringOutput `pulumi:"connectionString"`
	// The IP address of the internal endpoint.
	ConnectionStringPrefix pulumi.StringOutput `pulumi:"connectionStringPrefix"`
	// The user-defined description of the endpoint.
	DbInstanceEndpointDescription pulumi.StringOutput `pulumi:"dbInstanceEndpointDescription"`
	// The Endpoint ID of the instance.
	DbInstanceEndpointId pulumi.StringOutput `pulumi:"dbInstanceEndpointId"`
	// The type of the endpoint.
	DbInstanceEndpointType pulumi.StringOutput `pulumi:"dbInstanceEndpointType"`
	// The ID of the instance.
	DbInstanceId pulumi.StringOutput `pulumi:"dbInstanceId"`
	// The type of the IP address.
	IpType pulumi.StringOutput `pulumi:"ipType"`
	// The information about the node that is configured for the endpoint.  It contains two sub-fields(node_id and weight). See `nodeItems` below.
	NodeItems DbInstanceEndpointNodeItemArrayOutput `pulumi:"nodeItems"`
	// The port number of the internal endpoint. You can specify the port number for the internal endpoint.Valid values: 3000 to 5999.
	Port pulumi.StringOutput `pulumi:"port"`
	// The IP address of the internal endpoint.
	PrivateIpAddress pulumi.StringOutput `pulumi:"privateIpAddress"`
	// The virtual private cloud (VPC) ID of the internal endpoint.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
	// The vSwitch ID of the internal endpoint.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
}

// NewDbInstanceEndpoint registers a new resource with the given unique name, arguments, and options.
func NewDbInstanceEndpoint(ctx *pulumi.Context,
	name string, args *DbInstanceEndpointArgs, opts ...pulumi.ResourceOption) (*DbInstanceEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectionStringPrefix == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionStringPrefix'")
	}
	if args.DbInstanceId == nil {
		return nil, errors.New("invalid value for required argument 'DbInstanceId'")
	}
	if args.NodeItems == nil {
		return nil, errors.New("invalid value for required argument 'NodeItems'")
	}
	if args.Port == nil {
		return nil, errors.New("invalid value for required argument 'Port'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DbInstanceEndpoint
	err := ctx.RegisterResource("alicloud:rds/dbInstanceEndpoint:DbInstanceEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDbInstanceEndpoint gets an existing DbInstanceEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDbInstanceEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DbInstanceEndpointState, opts ...pulumi.ResourceOption) (*DbInstanceEndpoint, error) {
	var resource DbInstanceEndpoint
	err := ctx.ReadResource("alicloud:rds/dbInstanceEndpoint:DbInstanceEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DbInstanceEndpoint resources.
type dbInstanceEndpointState struct {
	// The internal endpoint.
	ConnectionString *string `pulumi:"connectionString"`
	// The IP address of the internal endpoint.
	ConnectionStringPrefix *string `pulumi:"connectionStringPrefix"`
	// The user-defined description of the endpoint.
	DbInstanceEndpointDescription *string `pulumi:"dbInstanceEndpointDescription"`
	// The Endpoint ID of the instance.
	DbInstanceEndpointId *string `pulumi:"dbInstanceEndpointId"`
	// The type of the endpoint.
	DbInstanceEndpointType *string `pulumi:"dbInstanceEndpointType"`
	// The ID of the instance.
	DbInstanceId *string `pulumi:"dbInstanceId"`
	// The type of the IP address.
	IpType *string `pulumi:"ipType"`
	// The information about the node that is configured for the endpoint.  It contains two sub-fields(node_id and weight). See `nodeItems` below.
	NodeItems []DbInstanceEndpointNodeItem `pulumi:"nodeItems"`
	// The port number of the internal endpoint. You can specify the port number for the internal endpoint.Valid values: 3000 to 5999.
	Port *string `pulumi:"port"`
	// The IP address of the internal endpoint.
	PrivateIpAddress *string `pulumi:"privateIpAddress"`
	// The virtual private cloud (VPC) ID of the internal endpoint.
	VpcId *string `pulumi:"vpcId"`
	// The vSwitch ID of the internal endpoint.
	VswitchId *string `pulumi:"vswitchId"`
}

type DbInstanceEndpointState struct {
	// The internal endpoint.
	ConnectionString pulumi.StringPtrInput
	// The IP address of the internal endpoint.
	ConnectionStringPrefix pulumi.StringPtrInput
	// The user-defined description of the endpoint.
	DbInstanceEndpointDescription pulumi.StringPtrInput
	// The Endpoint ID of the instance.
	DbInstanceEndpointId pulumi.StringPtrInput
	// The type of the endpoint.
	DbInstanceEndpointType pulumi.StringPtrInput
	// The ID of the instance.
	DbInstanceId pulumi.StringPtrInput
	// The type of the IP address.
	IpType pulumi.StringPtrInput
	// The information about the node that is configured for the endpoint.  It contains two sub-fields(node_id and weight). See `nodeItems` below.
	NodeItems DbInstanceEndpointNodeItemArrayInput
	// The port number of the internal endpoint. You can specify the port number for the internal endpoint.Valid values: 3000 to 5999.
	Port pulumi.StringPtrInput
	// The IP address of the internal endpoint.
	PrivateIpAddress pulumi.StringPtrInput
	// The virtual private cloud (VPC) ID of the internal endpoint.
	VpcId pulumi.StringPtrInput
	// The vSwitch ID of the internal endpoint.
	VswitchId pulumi.StringPtrInput
}

func (DbInstanceEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*dbInstanceEndpointState)(nil)).Elem()
}

type dbInstanceEndpointArgs struct {
	// The IP address of the internal endpoint.
	ConnectionStringPrefix string `pulumi:"connectionStringPrefix"`
	// The user-defined description of the endpoint.
	DbInstanceEndpointDescription *string `pulumi:"dbInstanceEndpointDescription"`
	// The ID of the instance.
	DbInstanceId string `pulumi:"dbInstanceId"`
	// The information about the node that is configured for the endpoint.  It contains two sub-fields(node_id and weight). See `nodeItems` below.
	NodeItems []DbInstanceEndpointNodeItem `pulumi:"nodeItems"`
	// The port number of the internal endpoint. You can specify the port number for the internal endpoint.Valid values: 3000 to 5999.
	Port string `pulumi:"port"`
	// The virtual private cloud (VPC) ID of the internal endpoint.
	VpcId string `pulumi:"vpcId"`
	// The vSwitch ID of the internal endpoint.
	VswitchId string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a DbInstanceEndpoint resource.
type DbInstanceEndpointArgs struct {
	// The IP address of the internal endpoint.
	ConnectionStringPrefix pulumi.StringInput
	// The user-defined description of the endpoint.
	DbInstanceEndpointDescription pulumi.StringPtrInput
	// The ID of the instance.
	DbInstanceId pulumi.StringInput
	// The information about the node that is configured for the endpoint.  It contains two sub-fields(node_id and weight). See `nodeItems` below.
	NodeItems DbInstanceEndpointNodeItemArrayInput
	// The port number of the internal endpoint. You can specify the port number for the internal endpoint.Valid values: 3000 to 5999.
	Port pulumi.StringInput
	// The virtual private cloud (VPC) ID of the internal endpoint.
	VpcId pulumi.StringInput
	// The vSwitch ID of the internal endpoint.
	VswitchId pulumi.StringInput
}

func (DbInstanceEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dbInstanceEndpointArgs)(nil)).Elem()
}

type DbInstanceEndpointInput interface {
	pulumi.Input

	ToDbInstanceEndpointOutput() DbInstanceEndpointOutput
	ToDbInstanceEndpointOutputWithContext(ctx context.Context) DbInstanceEndpointOutput
}

func (*DbInstanceEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**DbInstanceEndpoint)(nil)).Elem()
}

func (i *DbInstanceEndpoint) ToDbInstanceEndpointOutput() DbInstanceEndpointOutput {
	return i.ToDbInstanceEndpointOutputWithContext(context.Background())
}

func (i *DbInstanceEndpoint) ToDbInstanceEndpointOutputWithContext(ctx context.Context) DbInstanceEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbInstanceEndpointOutput)
}

// DbInstanceEndpointArrayInput is an input type that accepts DbInstanceEndpointArray and DbInstanceEndpointArrayOutput values.
// You can construct a concrete instance of `DbInstanceEndpointArrayInput` via:
//
//	DbInstanceEndpointArray{ DbInstanceEndpointArgs{...} }
type DbInstanceEndpointArrayInput interface {
	pulumi.Input

	ToDbInstanceEndpointArrayOutput() DbInstanceEndpointArrayOutput
	ToDbInstanceEndpointArrayOutputWithContext(context.Context) DbInstanceEndpointArrayOutput
}

type DbInstanceEndpointArray []DbInstanceEndpointInput

func (DbInstanceEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DbInstanceEndpoint)(nil)).Elem()
}

func (i DbInstanceEndpointArray) ToDbInstanceEndpointArrayOutput() DbInstanceEndpointArrayOutput {
	return i.ToDbInstanceEndpointArrayOutputWithContext(context.Background())
}

func (i DbInstanceEndpointArray) ToDbInstanceEndpointArrayOutputWithContext(ctx context.Context) DbInstanceEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbInstanceEndpointArrayOutput)
}

// DbInstanceEndpointMapInput is an input type that accepts DbInstanceEndpointMap and DbInstanceEndpointMapOutput values.
// You can construct a concrete instance of `DbInstanceEndpointMapInput` via:
//
//	DbInstanceEndpointMap{ "key": DbInstanceEndpointArgs{...} }
type DbInstanceEndpointMapInput interface {
	pulumi.Input

	ToDbInstanceEndpointMapOutput() DbInstanceEndpointMapOutput
	ToDbInstanceEndpointMapOutputWithContext(context.Context) DbInstanceEndpointMapOutput
}

type DbInstanceEndpointMap map[string]DbInstanceEndpointInput

func (DbInstanceEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DbInstanceEndpoint)(nil)).Elem()
}

func (i DbInstanceEndpointMap) ToDbInstanceEndpointMapOutput() DbInstanceEndpointMapOutput {
	return i.ToDbInstanceEndpointMapOutputWithContext(context.Background())
}

func (i DbInstanceEndpointMap) ToDbInstanceEndpointMapOutputWithContext(ctx context.Context) DbInstanceEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbInstanceEndpointMapOutput)
}

type DbInstanceEndpointOutput struct{ *pulumi.OutputState }

func (DbInstanceEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DbInstanceEndpoint)(nil)).Elem()
}

func (o DbInstanceEndpointOutput) ToDbInstanceEndpointOutput() DbInstanceEndpointOutput {
	return o
}

func (o DbInstanceEndpointOutput) ToDbInstanceEndpointOutputWithContext(ctx context.Context) DbInstanceEndpointOutput {
	return o
}

// The internal endpoint.
func (o DbInstanceEndpointOutput) ConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpoint) pulumi.StringOutput { return v.ConnectionString }).(pulumi.StringOutput)
}

// The IP address of the internal endpoint.
func (o DbInstanceEndpointOutput) ConnectionStringPrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpoint) pulumi.StringOutput { return v.ConnectionStringPrefix }).(pulumi.StringOutput)
}

// The user-defined description of the endpoint.
func (o DbInstanceEndpointOutput) DbInstanceEndpointDescription() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpoint) pulumi.StringOutput { return v.DbInstanceEndpointDescription }).(pulumi.StringOutput)
}

// The Endpoint ID of the instance.
func (o DbInstanceEndpointOutput) DbInstanceEndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpoint) pulumi.StringOutput { return v.DbInstanceEndpointId }).(pulumi.StringOutput)
}

// The type of the endpoint.
func (o DbInstanceEndpointOutput) DbInstanceEndpointType() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpoint) pulumi.StringOutput { return v.DbInstanceEndpointType }).(pulumi.StringOutput)
}

// The ID of the instance.
func (o DbInstanceEndpointOutput) DbInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpoint) pulumi.StringOutput { return v.DbInstanceId }).(pulumi.StringOutput)
}

// The type of the IP address.
func (o DbInstanceEndpointOutput) IpType() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpoint) pulumi.StringOutput { return v.IpType }).(pulumi.StringOutput)
}

// The information about the node that is configured for the endpoint.  It contains two sub-fields(node_id and weight). See `nodeItems` below.
func (o DbInstanceEndpointOutput) NodeItems() DbInstanceEndpointNodeItemArrayOutput {
	return o.ApplyT(func(v *DbInstanceEndpoint) DbInstanceEndpointNodeItemArrayOutput { return v.NodeItems }).(DbInstanceEndpointNodeItemArrayOutput)
}

// The port number of the internal endpoint. You can specify the port number for the internal endpoint.Valid values: 3000 to 5999.
func (o DbInstanceEndpointOutput) Port() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpoint) pulumi.StringOutput { return v.Port }).(pulumi.StringOutput)
}

// The IP address of the internal endpoint.
func (o DbInstanceEndpointOutput) PrivateIpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpoint) pulumi.StringOutput { return v.PrivateIpAddress }).(pulumi.StringOutput)
}

// The virtual private cloud (VPC) ID of the internal endpoint.
func (o DbInstanceEndpointOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpoint) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

// The vSwitch ID of the internal endpoint.
func (o DbInstanceEndpointOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpoint) pulumi.StringOutput { return v.VswitchId }).(pulumi.StringOutput)
}

type DbInstanceEndpointArrayOutput struct{ *pulumi.OutputState }

func (DbInstanceEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DbInstanceEndpoint)(nil)).Elem()
}

func (o DbInstanceEndpointArrayOutput) ToDbInstanceEndpointArrayOutput() DbInstanceEndpointArrayOutput {
	return o
}

func (o DbInstanceEndpointArrayOutput) ToDbInstanceEndpointArrayOutputWithContext(ctx context.Context) DbInstanceEndpointArrayOutput {
	return o
}

func (o DbInstanceEndpointArrayOutput) Index(i pulumi.IntInput) DbInstanceEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DbInstanceEndpoint {
		return vs[0].([]*DbInstanceEndpoint)[vs[1].(int)]
	}).(DbInstanceEndpointOutput)
}

type DbInstanceEndpointMapOutput struct{ *pulumi.OutputState }

func (DbInstanceEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DbInstanceEndpoint)(nil)).Elem()
}

func (o DbInstanceEndpointMapOutput) ToDbInstanceEndpointMapOutput() DbInstanceEndpointMapOutput {
	return o
}

func (o DbInstanceEndpointMapOutput) ToDbInstanceEndpointMapOutputWithContext(ctx context.Context) DbInstanceEndpointMapOutput {
	return o
}

func (o DbInstanceEndpointMapOutput) MapIndex(k pulumi.StringInput) DbInstanceEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DbInstanceEndpoint {
		return vs[0].(map[string]*DbInstanceEndpoint)[vs[1].(string)]
	}).(DbInstanceEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DbInstanceEndpointInput)(nil)).Elem(), &DbInstanceEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*DbInstanceEndpointArrayInput)(nil)).Elem(), DbInstanceEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DbInstanceEndpointMapInput)(nil)).Elem(), DbInstanceEndpointMap{})
	pulumi.RegisterOutputType(DbInstanceEndpointOutput{})
	pulumi.RegisterOutputType(DbInstanceEndpointArrayOutput{})
	pulumi.RegisterOutputType(DbInstanceEndpointMapOutput{})
}
