// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gpdb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a AnalyticDB for PostgreSQL instance resource which storage type is flexible. Compared to the reserved storage ADB PG instance, you can scale up each disk and smoothly scale out nodes online.\
// For more detail product introduction, see [here](https://www.alibabacloud.com/help/doc-detail/141368.htm).
//
// > **NOTE:** Deprecated since v1.147.0.
//
// > **DEPRECATED:**  This resource  has been deprecated from version `1.147.0`. Please use new resource alicloud_gpdb_instance.
//
// ## Example Usage
//
// ### Create a AnalyticDB for PostgreSQL instance
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/gpdb"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("Gpdb"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "default", &vpc.NetworkArgs{
//				Name:      pulumi.String("vpc-123456"),
//				CidrBlock: pulumi.String("172.16.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "default", &vpc.SwitchArgs{
//				ZoneId:      pulumi.String(_default.Zones[0].Id),
//				VpcId:       defaultNetwork.ID(),
//				CidrBlock:   pulumi.String("172.16.0.0/24"),
//				VswitchName: pulumi.String("vpc-123456"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = gpdb.NewElasticInstance(ctx, "adb_pg_instance", &gpdb.ElasticInstanceArgs{
//				Engine:                pulumi.String("gpdb"),
//				EngineVersion:         pulumi.String("6.0"),
//				SegStorageType:        pulumi.String("cloud_essd"),
//				SegNodeNum:            pulumi.Int(4),
//				StorageSize:           pulumi.Int(50),
//				InstanceSpec:          pulumi.String("2C16G"),
//				DbInstanceDescription: pulumi.String("Created by terraform"),
//				InstanceNetworkType:   pulumi.String("VPC"),
//				PaymentType:           pulumi.String("PayAsYouGo"),
//				VswitchId:             defaultSwitch.ID(),
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
// AnalyticDB for PostgreSQL can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:gpdb/elasticInstance:ElasticInstance adb_pg_instance gp-bpxxxxxxxxxxxxxx
// ```
type ElasticInstance struct {
	pulumi.CustomResourceState

	// ADB PG instance connection string.
	ConnectionString pulumi.StringOutput `pulumi:"connectionString"`
	// The edition of the instance. Valid values: `Basic`, `HighAvailability`. Default value: `HighAvailability`.
	DbInstanceCategory pulumi.StringOutput `pulumi:"dbInstanceCategory"`
	// The description of ADB PG instance. It is a string of 2 to 256 characters.
	DbInstanceDescription pulumi.StringPtrOutput `pulumi:"dbInstanceDescription"`
	// The ID of the encryption key. **Note:** If the `encryptionType` parameter is set to `CloudDisk`, you must specify this parameter to the encryption key that is in the same region as the disk that is specified by the EncryptionType parameter. Otherwise, leave this parameter empty.
	EncryptionKey pulumi.StringPtrOutput `pulumi:"encryptionKey"`
	// The type of the encryption. Valid values: `CloudDisk`. **Note:** Disk encryption cannot be disabled after it is enabled.
	EncryptionType pulumi.StringPtrOutput `pulumi:"encryptionType"`
	// Database engine: `gpdb`.
	Engine pulumi.StringOutput `pulumi:"engine"`
	// Database version. Valid value is `6.0`.
	EngineVersion pulumi.StringOutput `pulumi:"engineVersion"`
	// The network type of ADB PG instance. Only `VPC` supported now.
	InstanceNetworkType pulumi.StringPtrOutput `pulumi:"instanceNetworkType"`
	// The specification of segment nodes.
	// * When `dbInstanceCategory` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
	// * When `dbInstanceCategory` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
	InstanceSpec pulumi.StringOutput `pulumi:"instanceSpec"`
	// The subscription period. Valid values: [1~12]. It is valid when paymentType is `Subscription`.\
	// **NOTE:** Will not take effect after modifying `paymentDuration` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
	PaymentDuration pulumi.IntPtrOutput `pulumi:"paymentDuration"`
	// The unit of the subscription period. Valid values: `Month`, `Year`. It is valid when paymentType is `Subscription`.\
	// **NOTE:** Will not take effect after modifying `paymentDurationUnit` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
	PaymentDurationUnit pulumi.StringPtrOutput `pulumi:"paymentDurationUnit"`
	// Valid values are `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
	PaymentType pulumi.StringPtrOutput `pulumi:"paymentType"`
	// (Available since v1.196.0) The connection port of the instance.
	Port pulumi.StringOutput `pulumi:"port"`
	// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIpLists pulumi.StringArrayOutput `pulumi:"securityIpLists"`
	// The number of segment nodes. Minimum is `4`, max is `256`, step is `4`.
	SegNodeNum pulumi.IntOutput `pulumi:"segNodeNum"`
	// The disk type of segment nodes. Valid values: `cloudEssd`, `cloudEfficiency`.
	SegStorageType pulumi.StringOutput `pulumi:"segStorageType"`
	// Instance status.
	Status pulumi.StringOutput `pulumi:"status"`
	// The storage capacity of per segment node. Unit: GB. Minimum is `50`, max is `4000`, step is `50`.
	StorageSize pulumi.IntOutput `pulumi:"storageSize"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The virtual switch ID to launch ADB PG instances in one VPC.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
	// The Zone to launch the ADB PG instance. If specified, must be consistent with the zone where the vswitch is located.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewElasticInstance registers a new resource with the given unique name, arguments, and options.
func NewElasticInstance(ctx *pulumi.Context,
	name string, args *ElasticInstanceArgs, opts ...pulumi.ResourceOption) (*ElasticInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Engine == nil {
		return nil, errors.New("invalid value for required argument 'Engine'")
	}
	if args.EngineVersion == nil {
		return nil, errors.New("invalid value for required argument 'EngineVersion'")
	}
	if args.InstanceSpec == nil {
		return nil, errors.New("invalid value for required argument 'InstanceSpec'")
	}
	if args.SegNodeNum == nil {
		return nil, errors.New("invalid value for required argument 'SegNodeNum'")
	}
	if args.SegStorageType == nil {
		return nil, errors.New("invalid value for required argument 'SegStorageType'")
	}
	if args.StorageSize == nil {
		return nil, errors.New("invalid value for required argument 'StorageSize'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ElasticInstance
	err := ctx.RegisterResource("alicloud:gpdb/elasticInstance:ElasticInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetElasticInstance gets an existing ElasticInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetElasticInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ElasticInstanceState, opts ...pulumi.ResourceOption) (*ElasticInstance, error) {
	var resource ElasticInstance
	err := ctx.ReadResource("alicloud:gpdb/elasticInstance:ElasticInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ElasticInstance resources.
type elasticInstanceState struct {
	// ADB PG instance connection string.
	ConnectionString *string `pulumi:"connectionString"`
	// The edition of the instance. Valid values: `Basic`, `HighAvailability`. Default value: `HighAvailability`.
	DbInstanceCategory *string `pulumi:"dbInstanceCategory"`
	// The description of ADB PG instance. It is a string of 2 to 256 characters.
	DbInstanceDescription *string `pulumi:"dbInstanceDescription"`
	// The ID of the encryption key. **Note:** If the `encryptionType` parameter is set to `CloudDisk`, you must specify this parameter to the encryption key that is in the same region as the disk that is specified by the EncryptionType parameter. Otherwise, leave this parameter empty.
	EncryptionKey *string `pulumi:"encryptionKey"`
	// The type of the encryption. Valid values: `CloudDisk`. **Note:** Disk encryption cannot be disabled after it is enabled.
	EncryptionType *string `pulumi:"encryptionType"`
	// Database engine: `gpdb`.
	Engine *string `pulumi:"engine"`
	// Database version. Valid value is `6.0`.
	EngineVersion *string `pulumi:"engineVersion"`
	// The network type of ADB PG instance. Only `VPC` supported now.
	InstanceNetworkType *string `pulumi:"instanceNetworkType"`
	// The specification of segment nodes.
	// * When `dbInstanceCategory` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
	// * When `dbInstanceCategory` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
	InstanceSpec *string `pulumi:"instanceSpec"`
	// The subscription period. Valid values: [1~12]. It is valid when paymentType is `Subscription`.\
	// **NOTE:** Will not take effect after modifying `paymentDuration` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
	PaymentDuration *int `pulumi:"paymentDuration"`
	// The unit of the subscription period. Valid values: `Month`, `Year`. It is valid when paymentType is `Subscription`.\
	// **NOTE:** Will not take effect after modifying `paymentDurationUnit` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
	PaymentDurationUnit *string `pulumi:"paymentDurationUnit"`
	// Valid values are `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
	PaymentType *string `pulumi:"paymentType"`
	// (Available since v1.196.0) The connection port of the instance.
	Port *string `pulumi:"port"`
	// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIpLists []string `pulumi:"securityIpLists"`
	// The number of segment nodes. Minimum is `4`, max is `256`, step is `4`.
	SegNodeNum *int `pulumi:"segNodeNum"`
	// The disk type of segment nodes. Valid values: `cloudEssd`, `cloudEfficiency`.
	SegStorageType *string `pulumi:"segStorageType"`
	// Instance status.
	Status *string `pulumi:"status"`
	// The storage capacity of per segment node. Unit: GB. Minimum is `50`, max is `4000`, step is `50`.
	StorageSize *int `pulumi:"storageSize"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The virtual switch ID to launch ADB PG instances in one VPC.
	VswitchId *string `pulumi:"vswitchId"`
	// The Zone to launch the ADB PG instance. If specified, must be consistent with the zone where the vswitch is located.
	ZoneId *string `pulumi:"zoneId"`
}

type ElasticInstanceState struct {
	// ADB PG instance connection string.
	ConnectionString pulumi.StringPtrInput
	// The edition of the instance. Valid values: `Basic`, `HighAvailability`. Default value: `HighAvailability`.
	DbInstanceCategory pulumi.StringPtrInput
	// The description of ADB PG instance. It is a string of 2 to 256 characters.
	DbInstanceDescription pulumi.StringPtrInput
	// The ID of the encryption key. **Note:** If the `encryptionType` parameter is set to `CloudDisk`, you must specify this parameter to the encryption key that is in the same region as the disk that is specified by the EncryptionType parameter. Otherwise, leave this parameter empty.
	EncryptionKey pulumi.StringPtrInput
	// The type of the encryption. Valid values: `CloudDisk`. **Note:** Disk encryption cannot be disabled after it is enabled.
	EncryptionType pulumi.StringPtrInput
	// Database engine: `gpdb`.
	Engine pulumi.StringPtrInput
	// Database version. Valid value is `6.0`.
	EngineVersion pulumi.StringPtrInput
	// The network type of ADB PG instance. Only `VPC` supported now.
	InstanceNetworkType pulumi.StringPtrInput
	// The specification of segment nodes.
	// * When `dbInstanceCategory` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
	// * When `dbInstanceCategory` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
	InstanceSpec pulumi.StringPtrInput
	// The subscription period. Valid values: [1~12]. It is valid when paymentType is `Subscription`.\
	// **NOTE:** Will not take effect after modifying `paymentDuration` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
	PaymentDuration pulumi.IntPtrInput
	// The unit of the subscription period. Valid values: `Month`, `Year`. It is valid when paymentType is `Subscription`.\
	// **NOTE:** Will not take effect after modifying `paymentDurationUnit` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
	PaymentDurationUnit pulumi.StringPtrInput
	// Valid values are `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
	PaymentType pulumi.StringPtrInput
	// (Available since v1.196.0) The connection port of the instance.
	Port pulumi.StringPtrInput
	// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIpLists pulumi.StringArrayInput
	// The number of segment nodes. Minimum is `4`, max is `256`, step is `4`.
	SegNodeNum pulumi.IntPtrInput
	// The disk type of segment nodes. Valid values: `cloudEssd`, `cloudEfficiency`.
	SegStorageType pulumi.StringPtrInput
	// Instance status.
	Status pulumi.StringPtrInput
	// The storage capacity of per segment node. Unit: GB. Minimum is `50`, max is `4000`, step is `50`.
	StorageSize pulumi.IntPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// The virtual switch ID to launch ADB PG instances in one VPC.
	VswitchId pulumi.StringPtrInput
	// The Zone to launch the ADB PG instance. If specified, must be consistent with the zone where the vswitch is located.
	ZoneId pulumi.StringPtrInput
}

func (ElasticInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*elasticInstanceState)(nil)).Elem()
}

type elasticInstanceArgs struct {
	// The edition of the instance. Valid values: `Basic`, `HighAvailability`. Default value: `HighAvailability`.
	DbInstanceCategory *string `pulumi:"dbInstanceCategory"`
	// The description of ADB PG instance. It is a string of 2 to 256 characters.
	DbInstanceDescription *string `pulumi:"dbInstanceDescription"`
	// The ID of the encryption key. **Note:** If the `encryptionType` parameter is set to `CloudDisk`, you must specify this parameter to the encryption key that is in the same region as the disk that is specified by the EncryptionType parameter. Otherwise, leave this parameter empty.
	EncryptionKey *string `pulumi:"encryptionKey"`
	// The type of the encryption. Valid values: `CloudDisk`. **Note:** Disk encryption cannot be disabled after it is enabled.
	EncryptionType *string `pulumi:"encryptionType"`
	// Database engine: `gpdb`.
	Engine string `pulumi:"engine"`
	// Database version. Valid value is `6.0`.
	EngineVersion string `pulumi:"engineVersion"`
	// The network type of ADB PG instance. Only `VPC` supported now.
	InstanceNetworkType *string `pulumi:"instanceNetworkType"`
	// The specification of segment nodes.
	// * When `dbInstanceCategory` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
	// * When `dbInstanceCategory` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
	InstanceSpec string `pulumi:"instanceSpec"`
	// The subscription period. Valid values: [1~12]. It is valid when paymentType is `Subscription`.\
	// **NOTE:** Will not take effect after modifying `paymentDuration` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
	PaymentDuration *int `pulumi:"paymentDuration"`
	// The unit of the subscription period. Valid values: `Month`, `Year`. It is valid when paymentType is `Subscription`.\
	// **NOTE:** Will not take effect after modifying `paymentDurationUnit` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
	PaymentDurationUnit *string `pulumi:"paymentDurationUnit"`
	// Valid values are `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
	PaymentType *string `pulumi:"paymentType"`
	// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIpLists []string `pulumi:"securityIpLists"`
	// The number of segment nodes. Minimum is `4`, max is `256`, step is `4`.
	SegNodeNum int `pulumi:"segNodeNum"`
	// The disk type of segment nodes. Valid values: `cloudEssd`, `cloudEfficiency`.
	SegStorageType string `pulumi:"segStorageType"`
	// The storage capacity of per segment node. Unit: GB. Minimum is `50`, max is `4000`, step is `50`.
	StorageSize int `pulumi:"storageSize"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The virtual switch ID to launch ADB PG instances in one VPC.
	VswitchId string `pulumi:"vswitchId"`
	// The Zone to launch the ADB PG instance. If specified, must be consistent with the zone where the vswitch is located.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a ElasticInstance resource.
type ElasticInstanceArgs struct {
	// The edition of the instance. Valid values: `Basic`, `HighAvailability`. Default value: `HighAvailability`.
	DbInstanceCategory pulumi.StringPtrInput
	// The description of ADB PG instance. It is a string of 2 to 256 characters.
	DbInstanceDescription pulumi.StringPtrInput
	// The ID of the encryption key. **Note:** If the `encryptionType` parameter is set to `CloudDisk`, you must specify this parameter to the encryption key that is in the same region as the disk that is specified by the EncryptionType parameter. Otherwise, leave this parameter empty.
	EncryptionKey pulumi.StringPtrInput
	// The type of the encryption. Valid values: `CloudDisk`. **Note:** Disk encryption cannot be disabled after it is enabled.
	EncryptionType pulumi.StringPtrInput
	// Database engine: `gpdb`.
	Engine pulumi.StringInput
	// Database version. Valid value is `6.0`.
	EngineVersion pulumi.StringInput
	// The network type of ADB PG instance. Only `VPC` supported now.
	InstanceNetworkType pulumi.StringPtrInput
	// The specification of segment nodes.
	// * When `dbInstanceCategory` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
	// * When `dbInstanceCategory` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
	InstanceSpec pulumi.StringInput
	// The subscription period. Valid values: [1~12]. It is valid when paymentType is `Subscription`.\
	// **NOTE:** Will not take effect after modifying `paymentDuration` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
	PaymentDuration pulumi.IntPtrInput
	// The unit of the subscription period. Valid values: `Month`, `Year`. It is valid when paymentType is `Subscription`.\
	// **NOTE:** Will not take effect after modifying `paymentDurationUnit` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
	PaymentDurationUnit pulumi.StringPtrInput
	// Valid values are `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
	PaymentType pulumi.StringPtrInput
	// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIpLists pulumi.StringArrayInput
	// The number of segment nodes. Minimum is `4`, max is `256`, step is `4`.
	SegNodeNum pulumi.IntInput
	// The disk type of segment nodes. Valid values: `cloudEssd`, `cloudEfficiency`.
	SegStorageType pulumi.StringInput
	// The storage capacity of per segment node. Unit: GB. Minimum is `50`, max is `4000`, step is `50`.
	StorageSize pulumi.IntInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// The virtual switch ID to launch ADB PG instances in one VPC.
	VswitchId pulumi.StringInput
	// The Zone to launch the ADB PG instance. If specified, must be consistent with the zone where the vswitch is located.
	ZoneId pulumi.StringPtrInput
}

func (ElasticInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*elasticInstanceArgs)(nil)).Elem()
}

type ElasticInstanceInput interface {
	pulumi.Input

	ToElasticInstanceOutput() ElasticInstanceOutput
	ToElasticInstanceOutputWithContext(ctx context.Context) ElasticInstanceOutput
}

func (*ElasticInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**ElasticInstance)(nil)).Elem()
}

func (i *ElasticInstance) ToElasticInstanceOutput() ElasticInstanceOutput {
	return i.ToElasticInstanceOutputWithContext(context.Background())
}

func (i *ElasticInstance) ToElasticInstanceOutputWithContext(ctx context.Context) ElasticInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElasticInstanceOutput)
}

// ElasticInstanceArrayInput is an input type that accepts ElasticInstanceArray and ElasticInstanceArrayOutput values.
// You can construct a concrete instance of `ElasticInstanceArrayInput` via:
//
//	ElasticInstanceArray{ ElasticInstanceArgs{...} }
type ElasticInstanceArrayInput interface {
	pulumi.Input

	ToElasticInstanceArrayOutput() ElasticInstanceArrayOutput
	ToElasticInstanceArrayOutputWithContext(context.Context) ElasticInstanceArrayOutput
}

type ElasticInstanceArray []ElasticInstanceInput

func (ElasticInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ElasticInstance)(nil)).Elem()
}

func (i ElasticInstanceArray) ToElasticInstanceArrayOutput() ElasticInstanceArrayOutput {
	return i.ToElasticInstanceArrayOutputWithContext(context.Background())
}

func (i ElasticInstanceArray) ToElasticInstanceArrayOutputWithContext(ctx context.Context) ElasticInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElasticInstanceArrayOutput)
}

// ElasticInstanceMapInput is an input type that accepts ElasticInstanceMap and ElasticInstanceMapOutput values.
// You can construct a concrete instance of `ElasticInstanceMapInput` via:
//
//	ElasticInstanceMap{ "key": ElasticInstanceArgs{...} }
type ElasticInstanceMapInput interface {
	pulumi.Input

	ToElasticInstanceMapOutput() ElasticInstanceMapOutput
	ToElasticInstanceMapOutputWithContext(context.Context) ElasticInstanceMapOutput
}

type ElasticInstanceMap map[string]ElasticInstanceInput

func (ElasticInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ElasticInstance)(nil)).Elem()
}

func (i ElasticInstanceMap) ToElasticInstanceMapOutput() ElasticInstanceMapOutput {
	return i.ToElasticInstanceMapOutputWithContext(context.Background())
}

func (i ElasticInstanceMap) ToElasticInstanceMapOutputWithContext(ctx context.Context) ElasticInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElasticInstanceMapOutput)
}

type ElasticInstanceOutput struct{ *pulumi.OutputState }

func (ElasticInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ElasticInstance)(nil)).Elem()
}

func (o ElasticInstanceOutput) ToElasticInstanceOutput() ElasticInstanceOutput {
	return o
}

func (o ElasticInstanceOutput) ToElasticInstanceOutputWithContext(ctx context.Context) ElasticInstanceOutput {
	return o
}

// ADB PG instance connection string.
func (o ElasticInstanceOutput) ConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringOutput { return v.ConnectionString }).(pulumi.StringOutput)
}

// The edition of the instance. Valid values: `Basic`, `HighAvailability`. Default value: `HighAvailability`.
func (o ElasticInstanceOutput) DbInstanceCategory() pulumi.StringOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringOutput { return v.DbInstanceCategory }).(pulumi.StringOutput)
}

// The description of ADB PG instance. It is a string of 2 to 256 characters.
func (o ElasticInstanceOutput) DbInstanceDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringPtrOutput { return v.DbInstanceDescription }).(pulumi.StringPtrOutput)
}

// The ID of the encryption key. **Note:** If the `encryptionType` parameter is set to `CloudDisk`, you must specify this parameter to the encryption key that is in the same region as the disk that is specified by the EncryptionType parameter. Otherwise, leave this parameter empty.
func (o ElasticInstanceOutput) EncryptionKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringPtrOutput { return v.EncryptionKey }).(pulumi.StringPtrOutput)
}

// The type of the encryption. Valid values: `CloudDisk`. **Note:** Disk encryption cannot be disabled after it is enabled.
func (o ElasticInstanceOutput) EncryptionType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringPtrOutput { return v.EncryptionType }).(pulumi.StringPtrOutput)
}

// Database engine: `gpdb`.
func (o ElasticInstanceOutput) Engine() pulumi.StringOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringOutput { return v.Engine }).(pulumi.StringOutput)
}

// Database version. Valid value is `6.0`.
func (o ElasticInstanceOutput) EngineVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringOutput { return v.EngineVersion }).(pulumi.StringOutput)
}

// The network type of ADB PG instance. Only `VPC` supported now.
func (o ElasticInstanceOutput) InstanceNetworkType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringPtrOutput { return v.InstanceNetworkType }).(pulumi.StringPtrOutput)
}

// The specification of segment nodes.
// * When `dbInstanceCategory` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
// * When `dbInstanceCategory` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
func (o ElasticInstanceOutput) InstanceSpec() pulumi.StringOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringOutput { return v.InstanceSpec }).(pulumi.StringOutput)
}

// The subscription period. Valid values: [1~12]. It is valid when paymentType is `Subscription`.\
// **NOTE:** Will not take effect after modifying `paymentDuration` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
func (o ElasticInstanceOutput) PaymentDuration() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.IntPtrOutput { return v.PaymentDuration }).(pulumi.IntPtrOutput)
}

// The unit of the subscription period. Valid values: `Month`, `Year`. It is valid when paymentType is `Subscription`.\
// **NOTE:** Will not take effect after modifying `paymentDurationUnit` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
func (o ElasticInstanceOutput) PaymentDurationUnit() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringPtrOutput { return v.PaymentDurationUnit }).(pulumi.StringPtrOutput)
}

// Valid values are `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
func (o ElasticInstanceOutput) PaymentType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringPtrOutput { return v.PaymentType }).(pulumi.StringPtrOutput)
}

// (Available since v1.196.0) The connection port of the instance.
func (o ElasticInstanceOutput) Port() pulumi.StringOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringOutput { return v.Port }).(pulumi.StringOutput)
}

// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
func (o ElasticInstanceOutput) SecurityIpLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringArrayOutput { return v.SecurityIpLists }).(pulumi.StringArrayOutput)
}

// The number of segment nodes. Minimum is `4`, max is `256`, step is `4`.
func (o ElasticInstanceOutput) SegNodeNum() pulumi.IntOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.IntOutput { return v.SegNodeNum }).(pulumi.IntOutput)
}

// The disk type of segment nodes. Valid values: `cloudEssd`, `cloudEfficiency`.
func (o ElasticInstanceOutput) SegStorageType() pulumi.StringOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringOutput { return v.SegStorageType }).(pulumi.StringOutput)
}

// Instance status.
func (o ElasticInstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The storage capacity of per segment node. Unit: GB. Minimum is `50`, max is `4000`, step is `50`.
func (o ElasticInstanceOutput) StorageSize() pulumi.IntOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.IntOutput { return v.StorageSize }).(pulumi.IntOutput)
}

// A mapping of tags to assign to the resource.
func (o ElasticInstanceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The virtual switch ID to launch ADB PG instances in one VPC.
func (o ElasticInstanceOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringOutput { return v.VswitchId }).(pulumi.StringOutput)
}

// The Zone to launch the ADB PG instance. If specified, must be consistent with the zone where the vswitch is located.
func (o ElasticInstanceOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *ElasticInstance) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type ElasticInstanceArrayOutput struct{ *pulumi.OutputState }

func (ElasticInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ElasticInstance)(nil)).Elem()
}

func (o ElasticInstanceArrayOutput) ToElasticInstanceArrayOutput() ElasticInstanceArrayOutput {
	return o
}

func (o ElasticInstanceArrayOutput) ToElasticInstanceArrayOutputWithContext(ctx context.Context) ElasticInstanceArrayOutput {
	return o
}

func (o ElasticInstanceArrayOutput) Index(i pulumi.IntInput) ElasticInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ElasticInstance {
		return vs[0].([]*ElasticInstance)[vs[1].(int)]
	}).(ElasticInstanceOutput)
}

type ElasticInstanceMapOutput struct{ *pulumi.OutputState }

func (ElasticInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ElasticInstance)(nil)).Elem()
}

func (o ElasticInstanceMapOutput) ToElasticInstanceMapOutput() ElasticInstanceMapOutput {
	return o
}

func (o ElasticInstanceMapOutput) ToElasticInstanceMapOutputWithContext(ctx context.Context) ElasticInstanceMapOutput {
	return o
}

func (o ElasticInstanceMapOutput) MapIndex(k pulumi.StringInput) ElasticInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ElasticInstance {
		return vs[0].(map[string]*ElasticInstance)[vs[1].(string)]
	}).(ElasticInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ElasticInstanceInput)(nil)).Elem(), &ElasticInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*ElasticInstanceArrayInput)(nil)).Elem(), ElasticInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ElasticInstanceMapInput)(nil)).Elem(), ElasticInstanceMap{})
	pulumi.RegisterOutputType(ElasticInstanceOutput{})
	pulumi.RegisterOutputType(ElasticInstanceArrayOutput{})
	pulumi.RegisterOutputType(ElasticInstanceMapOutput{})
}
