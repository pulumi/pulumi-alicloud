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

// Provides a GPDB Streaming Data Service resource.
//
// For information about GPDB Streaming Data Service and how to use it, see [What is Streaming Data Service](https://www.alibabacloud.com/help/en/analyticdb/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-createstreamingdataservice).
//
// > **NOTE:** Available since v1.227.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/gpdb"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultTXZPBL, err := vpc.NewNetwork(ctx, "defaultTXZPBL", &vpc.NetworkArgs{
//				CidrBlock: pulumi.String("192.168.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultrJ5mmz, err := vpc.NewSwitch(ctx, "defaultrJ5mmz", &vpc.SwitchArgs{
//				VpcId:     defaultTXZPBL.ID(),
//				ZoneId:    pulumi.String("cn-beijing-h"),
//				CidrBlock: pulumi.String("192.168.1.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			default1oSPzX, err := gpdb.NewInstance(ctx, "default1oSPzX", &gpdb.InstanceArgs{
//				InstanceSpec:        pulumi.String("2C8G"),
//				Description:         pulumi.String(name),
//				SegNodeNum:          pulumi.Int(2),
//				SegStorageType:      pulumi.String("cloud_essd"),
//				InstanceNetworkType: pulumi.String("VPC"),
//				DbInstanceCategory:  pulumi.String("Basic"),
//				PaymentType:         pulumi.String("PayAsYouGo"),
//				SslEnabled:          pulumi.Int(0),
//				EngineVersion:       pulumi.String("6.0"),
//				ZoneId:              pulumi.String("cn-beijing-h"),
//				VswitchId:           defaultrJ5mmz.ID(),
//				StorageSize:         pulumi.Int(50),
//				MasterCu:            pulumi.Int(4),
//				VpcId:               defaultTXZPBL.ID(),
//				DbInstanceMode:      pulumi.String("StorageElastic"),
//				Engine:              pulumi.String("gpdb"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = gpdb.NewStreamingDataService(ctx, "default", &gpdb.StreamingDataServiceArgs{
//				ServiceName:        pulumi.String("example"),
//				DbInstanceId:       default1oSPzX.ID(),
//				ServiceDescription: pulumi.String("example"),
//				ServiceSpec:        pulumi.String("8"),
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
// GPDB Streaming Data Service can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:gpdb/streamingDataService:StreamingDataService example <db_instance_id>:<service_id>
// ```
type StreamingDataService struct {
	pulumi.CustomResourceState

	// Create time
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The ID of the associated instance.
	DbInstanceId pulumi.StringOutput `pulumi:"dbInstanceId"`
	// The creation time of the resource
	ServiceDescription pulumi.StringPtrOutput `pulumi:"serviceDescription"`
	// Service ID
	ServiceId pulumi.StringOutput `pulumi:"serviceId"`
	// Service Name
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// Resource Specifications
	ServiceSpec pulumi.StringOutput `pulumi:"serviceSpec"`
	// The status of the resource
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewStreamingDataService registers a new resource with the given unique name, arguments, and options.
func NewStreamingDataService(ctx *pulumi.Context,
	name string, args *StreamingDataServiceArgs, opts ...pulumi.ResourceOption) (*StreamingDataService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DbInstanceId == nil {
		return nil, errors.New("invalid value for required argument 'DbInstanceId'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	if args.ServiceSpec == nil {
		return nil, errors.New("invalid value for required argument 'ServiceSpec'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StreamingDataService
	err := ctx.RegisterResource("alicloud:gpdb/streamingDataService:StreamingDataService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStreamingDataService gets an existing StreamingDataService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStreamingDataService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StreamingDataServiceState, opts ...pulumi.ResourceOption) (*StreamingDataService, error) {
	var resource StreamingDataService
	err := ctx.ReadResource("alicloud:gpdb/streamingDataService:StreamingDataService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StreamingDataService resources.
type streamingDataServiceState struct {
	// Create time
	CreateTime *string `pulumi:"createTime"`
	// The ID of the associated instance.
	DbInstanceId *string `pulumi:"dbInstanceId"`
	// The creation time of the resource
	ServiceDescription *string `pulumi:"serviceDescription"`
	// Service ID
	ServiceId *string `pulumi:"serviceId"`
	// Service Name
	ServiceName *string `pulumi:"serviceName"`
	// Resource Specifications
	ServiceSpec *string `pulumi:"serviceSpec"`
	// The status of the resource
	Status *string `pulumi:"status"`
}

type StreamingDataServiceState struct {
	// Create time
	CreateTime pulumi.StringPtrInput
	// The ID of the associated instance.
	DbInstanceId pulumi.StringPtrInput
	// The creation time of the resource
	ServiceDescription pulumi.StringPtrInput
	// Service ID
	ServiceId pulumi.StringPtrInput
	// Service Name
	ServiceName pulumi.StringPtrInput
	// Resource Specifications
	ServiceSpec pulumi.StringPtrInput
	// The status of the resource
	Status pulumi.StringPtrInput
}

func (StreamingDataServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*streamingDataServiceState)(nil)).Elem()
}

type streamingDataServiceArgs struct {
	// The ID of the associated instance.
	DbInstanceId string `pulumi:"dbInstanceId"`
	// The creation time of the resource
	ServiceDescription *string `pulumi:"serviceDescription"`
	// Service Name
	ServiceName string `pulumi:"serviceName"`
	// Resource Specifications
	ServiceSpec string `pulumi:"serviceSpec"`
}

// The set of arguments for constructing a StreamingDataService resource.
type StreamingDataServiceArgs struct {
	// The ID of the associated instance.
	DbInstanceId pulumi.StringInput
	// The creation time of the resource
	ServiceDescription pulumi.StringPtrInput
	// Service Name
	ServiceName pulumi.StringInput
	// Resource Specifications
	ServiceSpec pulumi.StringInput
}

func (StreamingDataServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*streamingDataServiceArgs)(nil)).Elem()
}

type StreamingDataServiceInput interface {
	pulumi.Input

	ToStreamingDataServiceOutput() StreamingDataServiceOutput
	ToStreamingDataServiceOutputWithContext(ctx context.Context) StreamingDataServiceOutput
}

func (*StreamingDataService) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamingDataService)(nil)).Elem()
}

func (i *StreamingDataService) ToStreamingDataServiceOutput() StreamingDataServiceOutput {
	return i.ToStreamingDataServiceOutputWithContext(context.Background())
}

func (i *StreamingDataService) ToStreamingDataServiceOutputWithContext(ctx context.Context) StreamingDataServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamingDataServiceOutput)
}

// StreamingDataServiceArrayInput is an input type that accepts StreamingDataServiceArray and StreamingDataServiceArrayOutput values.
// You can construct a concrete instance of `StreamingDataServiceArrayInput` via:
//
//	StreamingDataServiceArray{ StreamingDataServiceArgs{...} }
type StreamingDataServiceArrayInput interface {
	pulumi.Input

	ToStreamingDataServiceArrayOutput() StreamingDataServiceArrayOutput
	ToStreamingDataServiceArrayOutputWithContext(context.Context) StreamingDataServiceArrayOutput
}

type StreamingDataServiceArray []StreamingDataServiceInput

func (StreamingDataServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamingDataService)(nil)).Elem()
}

func (i StreamingDataServiceArray) ToStreamingDataServiceArrayOutput() StreamingDataServiceArrayOutput {
	return i.ToStreamingDataServiceArrayOutputWithContext(context.Background())
}

func (i StreamingDataServiceArray) ToStreamingDataServiceArrayOutputWithContext(ctx context.Context) StreamingDataServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamingDataServiceArrayOutput)
}

// StreamingDataServiceMapInput is an input type that accepts StreamingDataServiceMap and StreamingDataServiceMapOutput values.
// You can construct a concrete instance of `StreamingDataServiceMapInput` via:
//
//	StreamingDataServiceMap{ "key": StreamingDataServiceArgs{...} }
type StreamingDataServiceMapInput interface {
	pulumi.Input

	ToStreamingDataServiceMapOutput() StreamingDataServiceMapOutput
	ToStreamingDataServiceMapOutputWithContext(context.Context) StreamingDataServiceMapOutput
}

type StreamingDataServiceMap map[string]StreamingDataServiceInput

func (StreamingDataServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamingDataService)(nil)).Elem()
}

func (i StreamingDataServiceMap) ToStreamingDataServiceMapOutput() StreamingDataServiceMapOutput {
	return i.ToStreamingDataServiceMapOutputWithContext(context.Background())
}

func (i StreamingDataServiceMap) ToStreamingDataServiceMapOutputWithContext(ctx context.Context) StreamingDataServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamingDataServiceMapOutput)
}

type StreamingDataServiceOutput struct{ *pulumi.OutputState }

func (StreamingDataServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamingDataService)(nil)).Elem()
}

func (o StreamingDataServiceOutput) ToStreamingDataServiceOutput() StreamingDataServiceOutput {
	return o
}

func (o StreamingDataServiceOutput) ToStreamingDataServiceOutputWithContext(ctx context.Context) StreamingDataServiceOutput {
	return o
}

// Create time
func (o StreamingDataServiceOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamingDataService) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The ID of the associated instance.
func (o StreamingDataServiceOutput) DbInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamingDataService) pulumi.StringOutput { return v.DbInstanceId }).(pulumi.StringOutput)
}

// The creation time of the resource
func (o StreamingDataServiceOutput) ServiceDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StreamingDataService) pulumi.StringPtrOutput { return v.ServiceDescription }).(pulumi.StringPtrOutput)
}

// Service ID
func (o StreamingDataServiceOutput) ServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamingDataService) pulumi.StringOutput { return v.ServiceId }).(pulumi.StringOutput)
}

// Service Name
func (o StreamingDataServiceOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamingDataService) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// Resource Specifications
func (o StreamingDataServiceOutput) ServiceSpec() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamingDataService) pulumi.StringOutput { return v.ServiceSpec }).(pulumi.StringOutput)
}

// The status of the resource
func (o StreamingDataServiceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamingDataService) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type StreamingDataServiceArrayOutput struct{ *pulumi.OutputState }

func (StreamingDataServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamingDataService)(nil)).Elem()
}

func (o StreamingDataServiceArrayOutput) ToStreamingDataServiceArrayOutput() StreamingDataServiceArrayOutput {
	return o
}

func (o StreamingDataServiceArrayOutput) ToStreamingDataServiceArrayOutputWithContext(ctx context.Context) StreamingDataServiceArrayOutput {
	return o
}

func (o StreamingDataServiceArrayOutput) Index(i pulumi.IntInput) StreamingDataServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StreamingDataService {
		return vs[0].([]*StreamingDataService)[vs[1].(int)]
	}).(StreamingDataServiceOutput)
}

type StreamingDataServiceMapOutput struct{ *pulumi.OutputState }

func (StreamingDataServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamingDataService)(nil)).Elem()
}

func (o StreamingDataServiceMapOutput) ToStreamingDataServiceMapOutput() StreamingDataServiceMapOutput {
	return o
}

func (o StreamingDataServiceMapOutput) ToStreamingDataServiceMapOutputWithContext(ctx context.Context) StreamingDataServiceMapOutput {
	return o
}

func (o StreamingDataServiceMapOutput) MapIndex(k pulumi.StringInput) StreamingDataServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StreamingDataService {
		return vs[0].(map[string]*StreamingDataService)[vs[1].(string)]
	}).(StreamingDataServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StreamingDataServiceInput)(nil)).Elem(), &StreamingDataService{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamingDataServiceArrayInput)(nil)).Elem(), StreamingDataServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamingDataServiceMapInput)(nil)).Elem(), StreamingDataServiceMap{})
	pulumi.RegisterOutputType(StreamingDataServiceOutput{})
	pulumi.RegisterOutputType(StreamingDataServiceArrayOutput{})
	pulumi.RegisterOutputType(StreamingDataServiceMapOutput{})
}
