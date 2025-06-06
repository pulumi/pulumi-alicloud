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

// Provide RDS cluster instance endpoint public connection resources.
//
// Information about RDS MySQL cluster endpoint address and how to use it, see [What is RDS DB Instance Endpoint Address](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-createdbinstanceendpointaddress).
//
// > **NOTE:** Available since v1.204.0.
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
//			defaultDbInstanceEndpoint, err := rds.NewDbInstanceEndpoint(ctx, "default", &rds.DbInstanceEndpointArgs{
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
//			_, err = rds.NewDbInstanceEndpointAddress(ctx, "default", &rds.DbInstanceEndpointAddressArgs{
//				DbInstanceId:           defaultInstance.ID(),
//				DbInstanceEndpointId:   defaultDbInstanceEndpoint.DbInstanceEndpointId,
//				ConnectionStringPrefix: pulumi.String("tf-example-prefix"),
//				Port:                   pulumi.String("3306"),
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
// RDS database endpoint public address feature can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:rds/dbInstanceEndpointAddress:DbInstanceEndpointAddress example <db_instance_id>:<db_instance_endpoint_id>
// ```
type DbInstanceEndpointAddress struct {
	pulumi.CustomResourceState

	// The endpoint of the instance.
	ConnectionString pulumi.StringOutput `pulumi:"connectionString"`
	// The prefix of the public endpoint.
	ConnectionStringPrefix pulumi.StringOutput `pulumi:"connectionStringPrefix"`
	// The Endpoint ID of the instance.
	DbInstanceEndpointId pulumi.StringOutput `pulumi:"dbInstanceEndpointId"`
	// The ID of the instance.
	DbInstanceId pulumi.StringOutput `pulumi:"dbInstanceId"`
	// The IP address of the endpoint.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// The type of the IP address.
	IpType pulumi.StringOutput `pulumi:"ipType"`
	// The port number of the public endpoint.
	Port pulumi.StringOutput `pulumi:"port"`
}

// NewDbInstanceEndpointAddress registers a new resource with the given unique name, arguments, and options.
func NewDbInstanceEndpointAddress(ctx *pulumi.Context,
	name string, args *DbInstanceEndpointAddressArgs, opts ...pulumi.ResourceOption) (*DbInstanceEndpointAddress, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectionStringPrefix == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionStringPrefix'")
	}
	if args.DbInstanceEndpointId == nil {
		return nil, errors.New("invalid value for required argument 'DbInstanceEndpointId'")
	}
	if args.DbInstanceId == nil {
		return nil, errors.New("invalid value for required argument 'DbInstanceId'")
	}
	if args.Port == nil {
		return nil, errors.New("invalid value for required argument 'Port'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DbInstanceEndpointAddress
	err := ctx.RegisterResource("alicloud:rds/dbInstanceEndpointAddress:DbInstanceEndpointAddress", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDbInstanceEndpointAddress gets an existing DbInstanceEndpointAddress resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDbInstanceEndpointAddress(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DbInstanceEndpointAddressState, opts ...pulumi.ResourceOption) (*DbInstanceEndpointAddress, error) {
	var resource DbInstanceEndpointAddress
	err := ctx.ReadResource("alicloud:rds/dbInstanceEndpointAddress:DbInstanceEndpointAddress", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DbInstanceEndpointAddress resources.
type dbInstanceEndpointAddressState struct {
	// The endpoint of the instance.
	ConnectionString *string `pulumi:"connectionString"`
	// The prefix of the public endpoint.
	ConnectionStringPrefix *string `pulumi:"connectionStringPrefix"`
	// The Endpoint ID of the instance.
	DbInstanceEndpointId *string `pulumi:"dbInstanceEndpointId"`
	// The ID of the instance.
	DbInstanceId *string `pulumi:"dbInstanceId"`
	// The IP address of the endpoint.
	IpAddress *string `pulumi:"ipAddress"`
	// The type of the IP address.
	IpType *string `pulumi:"ipType"`
	// The port number of the public endpoint.
	Port *string `pulumi:"port"`
}

type DbInstanceEndpointAddressState struct {
	// The endpoint of the instance.
	ConnectionString pulumi.StringPtrInput
	// The prefix of the public endpoint.
	ConnectionStringPrefix pulumi.StringPtrInput
	// The Endpoint ID of the instance.
	DbInstanceEndpointId pulumi.StringPtrInput
	// The ID of the instance.
	DbInstanceId pulumi.StringPtrInput
	// The IP address of the endpoint.
	IpAddress pulumi.StringPtrInput
	// The type of the IP address.
	IpType pulumi.StringPtrInput
	// The port number of the public endpoint.
	Port pulumi.StringPtrInput
}

func (DbInstanceEndpointAddressState) ElementType() reflect.Type {
	return reflect.TypeOf((*dbInstanceEndpointAddressState)(nil)).Elem()
}

type dbInstanceEndpointAddressArgs struct {
	// The prefix of the public endpoint.
	ConnectionStringPrefix string `pulumi:"connectionStringPrefix"`
	// The Endpoint ID of the instance.
	DbInstanceEndpointId string `pulumi:"dbInstanceEndpointId"`
	// The ID of the instance.
	DbInstanceId string `pulumi:"dbInstanceId"`
	// The port number of the public endpoint.
	Port string `pulumi:"port"`
}

// The set of arguments for constructing a DbInstanceEndpointAddress resource.
type DbInstanceEndpointAddressArgs struct {
	// The prefix of the public endpoint.
	ConnectionStringPrefix pulumi.StringInput
	// The Endpoint ID of the instance.
	DbInstanceEndpointId pulumi.StringInput
	// The ID of the instance.
	DbInstanceId pulumi.StringInput
	// The port number of the public endpoint.
	Port pulumi.StringInput
}

func (DbInstanceEndpointAddressArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dbInstanceEndpointAddressArgs)(nil)).Elem()
}

type DbInstanceEndpointAddressInput interface {
	pulumi.Input

	ToDbInstanceEndpointAddressOutput() DbInstanceEndpointAddressOutput
	ToDbInstanceEndpointAddressOutputWithContext(ctx context.Context) DbInstanceEndpointAddressOutput
}

func (*DbInstanceEndpointAddress) ElementType() reflect.Type {
	return reflect.TypeOf((**DbInstanceEndpointAddress)(nil)).Elem()
}

func (i *DbInstanceEndpointAddress) ToDbInstanceEndpointAddressOutput() DbInstanceEndpointAddressOutput {
	return i.ToDbInstanceEndpointAddressOutputWithContext(context.Background())
}

func (i *DbInstanceEndpointAddress) ToDbInstanceEndpointAddressOutputWithContext(ctx context.Context) DbInstanceEndpointAddressOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbInstanceEndpointAddressOutput)
}

// DbInstanceEndpointAddressArrayInput is an input type that accepts DbInstanceEndpointAddressArray and DbInstanceEndpointAddressArrayOutput values.
// You can construct a concrete instance of `DbInstanceEndpointAddressArrayInput` via:
//
//	DbInstanceEndpointAddressArray{ DbInstanceEndpointAddressArgs{...} }
type DbInstanceEndpointAddressArrayInput interface {
	pulumi.Input

	ToDbInstanceEndpointAddressArrayOutput() DbInstanceEndpointAddressArrayOutput
	ToDbInstanceEndpointAddressArrayOutputWithContext(context.Context) DbInstanceEndpointAddressArrayOutput
}

type DbInstanceEndpointAddressArray []DbInstanceEndpointAddressInput

func (DbInstanceEndpointAddressArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DbInstanceEndpointAddress)(nil)).Elem()
}

func (i DbInstanceEndpointAddressArray) ToDbInstanceEndpointAddressArrayOutput() DbInstanceEndpointAddressArrayOutput {
	return i.ToDbInstanceEndpointAddressArrayOutputWithContext(context.Background())
}

func (i DbInstanceEndpointAddressArray) ToDbInstanceEndpointAddressArrayOutputWithContext(ctx context.Context) DbInstanceEndpointAddressArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbInstanceEndpointAddressArrayOutput)
}

// DbInstanceEndpointAddressMapInput is an input type that accepts DbInstanceEndpointAddressMap and DbInstanceEndpointAddressMapOutput values.
// You can construct a concrete instance of `DbInstanceEndpointAddressMapInput` via:
//
//	DbInstanceEndpointAddressMap{ "key": DbInstanceEndpointAddressArgs{...} }
type DbInstanceEndpointAddressMapInput interface {
	pulumi.Input

	ToDbInstanceEndpointAddressMapOutput() DbInstanceEndpointAddressMapOutput
	ToDbInstanceEndpointAddressMapOutputWithContext(context.Context) DbInstanceEndpointAddressMapOutput
}

type DbInstanceEndpointAddressMap map[string]DbInstanceEndpointAddressInput

func (DbInstanceEndpointAddressMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DbInstanceEndpointAddress)(nil)).Elem()
}

func (i DbInstanceEndpointAddressMap) ToDbInstanceEndpointAddressMapOutput() DbInstanceEndpointAddressMapOutput {
	return i.ToDbInstanceEndpointAddressMapOutputWithContext(context.Background())
}

func (i DbInstanceEndpointAddressMap) ToDbInstanceEndpointAddressMapOutputWithContext(ctx context.Context) DbInstanceEndpointAddressMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbInstanceEndpointAddressMapOutput)
}

type DbInstanceEndpointAddressOutput struct{ *pulumi.OutputState }

func (DbInstanceEndpointAddressOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DbInstanceEndpointAddress)(nil)).Elem()
}

func (o DbInstanceEndpointAddressOutput) ToDbInstanceEndpointAddressOutput() DbInstanceEndpointAddressOutput {
	return o
}

func (o DbInstanceEndpointAddressOutput) ToDbInstanceEndpointAddressOutputWithContext(ctx context.Context) DbInstanceEndpointAddressOutput {
	return o
}

// The endpoint of the instance.
func (o DbInstanceEndpointAddressOutput) ConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpointAddress) pulumi.StringOutput { return v.ConnectionString }).(pulumi.StringOutput)
}

// The prefix of the public endpoint.
func (o DbInstanceEndpointAddressOutput) ConnectionStringPrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpointAddress) pulumi.StringOutput { return v.ConnectionStringPrefix }).(pulumi.StringOutput)
}

// The Endpoint ID of the instance.
func (o DbInstanceEndpointAddressOutput) DbInstanceEndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpointAddress) pulumi.StringOutput { return v.DbInstanceEndpointId }).(pulumi.StringOutput)
}

// The ID of the instance.
func (o DbInstanceEndpointAddressOutput) DbInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpointAddress) pulumi.StringOutput { return v.DbInstanceId }).(pulumi.StringOutput)
}

// The IP address of the endpoint.
func (o DbInstanceEndpointAddressOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpointAddress) pulumi.StringOutput { return v.IpAddress }).(pulumi.StringOutput)
}

// The type of the IP address.
func (o DbInstanceEndpointAddressOutput) IpType() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpointAddress) pulumi.StringOutput { return v.IpType }).(pulumi.StringOutput)
}

// The port number of the public endpoint.
func (o DbInstanceEndpointAddressOutput) Port() pulumi.StringOutput {
	return o.ApplyT(func(v *DbInstanceEndpointAddress) pulumi.StringOutput { return v.Port }).(pulumi.StringOutput)
}

type DbInstanceEndpointAddressArrayOutput struct{ *pulumi.OutputState }

func (DbInstanceEndpointAddressArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DbInstanceEndpointAddress)(nil)).Elem()
}

func (o DbInstanceEndpointAddressArrayOutput) ToDbInstanceEndpointAddressArrayOutput() DbInstanceEndpointAddressArrayOutput {
	return o
}

func (o DbInstanceEndpointAddressArrayOutput) ToDbInstanceEndpointAddressArrayOutputWithContext(ctx context.Context) DbInstanceEndpointAddressArrayOutput {
	return o
}

func (o DbInstanceEndpointAddressArrayOutput) Index(i pulumi.IntInput) DbInstanceEndpointAddressOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DbInstanceEndpointAddress {
		return vs[0].([]*DbInstanceEndpointAddress)[vs[1].(int)]
	}).(DbInstanceEndpointAddressOutput)
}

type DbInstanceEndpointAddressMapOutput struct{ *pulumi.OutputState }

func (DbInstanceEndpointAddressMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DbInstanceEndpointAddress)(nil)).Elem()
}

func (o DbInstanceEndpointAddressMapOutput) ToDbInstanceEndpointAddressMapOutput() DbInstanceEndpointAddressMapOutput {
	return o
}

func (o DbInstanceEndpointAddressMapOutput) ToDbInstanceEndpointAddressMapOutputWithContext(ctx context.Context) DbInstanceEndpointAddressMapOutput {
	return o
}

func (o DbInstanceEndpointAddressMapOutput) MapIndex(k pulumi.StringInput) DbInstanceEndpointAddressOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DbInstanceEndpointAddress {
		return vs[0].(map[string]*DbInstanceEndpointAddress)[vs[1].(string)]
	}).(DbInstanceEndpointAddressOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DbInstanceEndpointAddressInput)(nil)).Elem(), &DbInstanceEndpointAddress{})
	pulumi.RegisterInputType(reflect.TypeOf((*DbInstanceEndpointAddressArrayInput)(nil)).Elem(), DbInstanceEndpointAddressArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DbInstanceEndpointAddressMapInput)(nil)).Elem(), DbInstanceEndpointAddressMap{})
	pulumi.RegisterOutputType(DbInstanceEndpointAddressOutput{})
	pulumi.RegisterOutputType(DbInstanceEndpointAddressArrayOutput{})
	pulumi.RegisterOutputType(DbInstanceEndpointAddressMapOutput{})
}
