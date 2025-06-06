// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Compute Nest Service Instance resource.
//
// For information about Compute Nest Service Instance and how to use it, see [What is Service Instance](https://www.alibabacloud.com/help/zh/compute-nest/developer-reference/api-computenest-2021-06-01-createserviceinstance).
//
// > **NOTE:** Available since v1.205.0.
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
//	"fmt"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/compute"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// cfg := config.New(ctx, "")
// name := "tfexample";
// if param := cfg.Get("name"); param != ""{
// name = param
// }
// _default, err := resourcemanager.GetResourceGroups(ctx, &resourcemanager.GetResourceGroupsArgs{
// }, nil);
// if err != nil {
// return err
// }
// defaultGetZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
// AvailableDiskCategory: pulumi.StringRef("cloud_efficiency"),
// AvailableResourceCreation: pulumi.StringRef("VSwitch"),
// }, nil);
// if err != nil {
// return err
// }
// defaultGetInstanceTypes, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
// AvailabilityZone: pulumi.StringRef(defaultGetZones.Zones[0].Id),
// InstanceTypeFamily: pulumi.StringRef("ecs.sn1ne"),
// }, nil);
// if err != nil {
// return err
// }
// defaultGetImages, err := ecs.GetImages(ctx, &ecs.GetImagesArgs{
// NameRegex: pulumi.StringRef("^ubuntu_[0-9]+_[0-9]+_x64*"),
// Owners: pulumi.StringRef("system"),
// }, nil);
// if err != nil {
// return err
// }
// defaultNetwork, err := vpc.NewNetwork(ctx, "default", &vpc.NetworkArgs{
// VpcName: pulumi.String(name),
// CidrBlock: pulumi.String("10.0.0.0/8"),
// })
// if err != nil {
// return err
// }
// defaultSwitch, err := vpc.NewSwitch(ctx, "default", &vpc.SwitchArgs{
// VswitchName: pulumi.String(name),
// CidrBlock: pulumi.String("10.1.0.0/16"),
// VpcId: defaultNetwork.ID(),
// ZoneId: pulumi.String(defaultGetZones.Zones[0].Id),
// })
// if err != nil {
// return err
// }
// defaultSecurityGroup, err := ecs.NewSecurityGroup(ctx, "default", &ecs.SecurityGroupArgs{
// VpcId: defaultNetwork.ID(),
// })
// if err != nil {
// return err
// }
// var splat0 pulumi.StringArray
// for _, val0 := range %!v(PANIC=Format method: fatal: An assertion has failed: tok: ) {
// splat0 = append(splat0, val0.ID())
// }
// defaultInstance, err := ecs.NewInstance(ctx, "default", &ecs.InstanceArgs{
// ImageId: pulumi.String(defaultGetImages.Images[0].Id),
// InstanceType: pulumi.String(defaultGetInstanceTypes.InstanceTypes[0].Id),
// SecurityGroups: splat0,
// InternetChargeType: pulumi.String("PayByTraffic"),
// InternetMaxBandwidthOut: pulumi.Int(10),
// AvailabilityZone: pulumi.String(defaultGetZones.Zones[0].Id),
// InstanceChargeType: pulumi.String("PostPaid"),
// SystemDiskCategory: pulumi.String("cloud_efficiency"),
// VswitchId: defaultSwitch.ID(),
// })
// if err != nil {
// return err
// }
// _, err = compute.NewNestServiceInstance(ctx, "default", &compute.NestServiceInstanceArgs{
// ServiceId: pulumi.String("service-dd475e6e468348799f0f"),
// ServiceVersion: pulumi.String("1"),
// ServiceInstanceName: pulumi.String(name),
// ResourceGroupId: pulumi.String(_default.Groups[0].Id),
// PaymentType: pulumi.String("Permanent"),
// OperationMetadata: &compute.NestServiceInstanceOperationMetadataArgs{
// OperationStartTime: pulumi.String("1681281179000"),
// OperationEndTime: pulumi.String("1681367579000"),
// Resources: defaultInstance.ID().ApplyT(func(id string) (string, error) {
//
//	return fmt.Sprintf(`    {
//	      "Type": "ResourceIds",
//	      "RegionId": "cn-hangzhou",
//	      "ResourceIds": {
//	      "ALIYUN::ECS::INSTANCE": [
//	        "%v"
//	        ]
//	      }
//	    }
//
// `, id), nil
// }).(pulumi.StringOutput),
// },
// Tags: pulumi.StringMap{
// "Created": pulumi.String("TF"),
// "For": pulumi.String("ServiceInstance"),
// },
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
//
// ## Import
//
// Compute Nest Service Instance can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:compute/nestServiceInstance:NestServiceInstance example <id>
// ```
type NestServiceInstance struct {
	pulumi.CustomResourceState

	// The order information of cloud market. See `commodity` below.
	Commodity NestServiceInstanceCommodityPtrOutput `pulumi:"commodity"`
	// Whether the service instance has the O&M function. Default value: `false`. Valid values:
	EnableInstanceOps pulumi.BoolOutput `pulumi:"enableInstanceOps"`
	// Whether Prometheus monitoring is enabled. Default value: `false`. Valid values:
	EnableUserPrometheus pulumi.BoolOutput `pulumi:"enableUserPrometheus"`
	// The configuration of O&M. See `operationMetadata` below.
	OperationMetadata NestServiceInstanceOperationMetadataOutput `pulumi:"operationMetadata"`
	// The parameters entered by the deployment service instance.
	Parameters pulumi.StringPtrOutput `pulumi:"parameters"`
	// The type of payment. Valid values: `Permanent`, `Subscription`, `PayAsYouGo`, `CustomFixTime`.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The ID of the service.
	ServiceId pulumi.StringOutput `pulumi:"serviceId"`
	// The name of the Service Instance.
	ServiceInstanceName pulumi.StringOutput `pulumi:"serviceInstanceName"`
	// The version of the service.
	ServiceVersion pulumi.StringOutput `pulumi:"serviceVersion"`
	// The name of the specification.
	SpecificationName pulumi.StringPtrOutput `pulumi:"specificationName"`
	// The status of the Service Instance.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The name of the template.
	TemplateName pulumi.StringOutput `pulumi:"templateName"`
}

// NewNestServiceInstance registers a new resource with the given unique name, arguments, and options.
func NewNestServiceInstance(ctx *pulumi.Context,
	name string, args *NestServiceInstanceArgs, opts ...pulumi.ResourceOption) (*NestServiceInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServiceId == nil {
		return nil, errors.New("invalid value for required argument 'ServiceId'")
	}
	if args.ServiceVersion == nil {
		return nil, errors.New("invalid value for required argument 'ServiceVersion'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NestServiceInstance
	err := ctx.RegisterResource("alicloud:compute/nestServiceInstance:NestServiceInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNestServiceInstance gets an existing NestServiceInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNestServiceInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NestServiceInstanceState, opts ...pulumi.ResourceOption) (*NestServiceInstance, error) {
	var resource NestServiceInstance
	err := ctx.ReadResource("alicloud:compute/nestServiceInstance:NestServiceInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NestServiceInstance resources.
type nestServiceInstanceState struct {
	// The order information of cloud market. See `commodity` below.
	Commodity *NestServiceInstanceCommodity `pulumi:"commodity"`
	// Whether the service instance has the O&M function. Default value: `false`. Valid values:
	EnableInstanceOps *bool `pulumi:"enableInstanceOps"`
	// Whether Prometheus monitoring is enabled. Default value: `false`. Valid values:
	EnableUserPrometheus *bool `pulumi:"enableUserPrometheus"`
	// The configuration of O&M. See `operationMetadata` below.
	OperationMetadata *NestServiceInstanceOperationMetadata `pulumi:"operationMetadata"`
	// The parameters entered by the deployment service instance.
	Parameters *string `pulumi:"parameters"`
	// The type of payment. Valid values: `Permanent`, `Subscription`, `PayAsYouGo`, `CustomFixTime`.
	PaymentType *string `pulumi:"paymentType"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The ID of the service.
	ServiceId *string `pulumi:"serviceId"`
	// The name of the Service Instance.
	ServiceInstanceName *string `pulumi:"serviceInstanceName"`
	// The version of the service.
	ServiceVersion *string `pulumi:"serviceVersion"`
	// The name of the specification.
	SpecificationName *string `pulumi:"specificationName"`
	// The status of the Service Instance.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The name of the template.
	TemplateName *string `pulumi:"templateName"`
}

type NestServiceInstanceState struct {
	// The order information of cloud market. See `commodity` below.
	Commodity NestServiceInstanceCommodityPtrInput
	// Whether the service instance has the O&M function. Default value: `false`. Valid values:
	EnableInstanceOps pulumi.BoolPtrInput
	// Whether Prometheus monitoring is enabled. Default value: `false`. Valid values:
	EnableUserPrometheus pulumi.BoolPtrInput
	// The configuration of O&M. See `operationMetadata` below.
	OperationMetadata NestServiceInstanceOperationMetadataPtrInput
	// The parameters entered by the deployment service instance.
	Parameters pulumi.StringPtrInput
	// The type of payment. Valid values: `Permanent`, `Subscription`, `PayAsYouGo`, `CustomFixTime`.
	PaymentType pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The ID of the service.
	ServiceId pulumi.StringPtrInput
	// The name of the Service Instance.
	ServiceInstanceName pulumi.StringPtrInput
	// The version of the service.
	ServiceVersion pulumi.StringPtrInput
	// The name of the specification.
	SpecificationName pulumi.StringPtrInput
	// The status of the Service Instance.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// The name of the template.
	TemplateName pulumi.StringPtrInput
}

func (NestServiceInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*nestServiceInstanceState)(nil)).Elem()
}

type nestServiceInstanceArgs struct {
	// The order information of cloud market. See `commodity` below.
	Commodity *NestServiceInstanceCommodity `pulumi:"commodity"`
	// Whether the service instance has the O&M function. Default value: `false`. Valid values:
	EnableInstanceOps *bool `pulumi:"enableInstanceOps"`
	// Whether Prometheus monitoring is enabled. Default value: `false`. Valid values:
	EnableUserPrometheus *bool `pulumi:"enableUserPrometheus"`
	// The configuration of O&M. See `operationMetadata` below.
	OperationMetadata *NestServiceInstanceOperationMetadata `pulumi:"operationMetadata"`
	// The parameters entered by the deployment service instance.
	Parameters *string `pulumi:"parameters"`
	// The type of payment. Valid values: `Permanent`, `Subscription`, `PayAsYouGo`, `CustomFixTime`.
	PaymentType *string `pulumi:"paymentType"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The ID of the service.
	ServiceId string `pulumi:"serviceId"`
	// The name of the Service Instance.
	ServiceInstanceName *string `pulumi:"serviceInstanceName"`
	// The version of the service.
	ServiceVersion string `pulumi:"serviceVersion"`
	// The name of the specification.
	SpecificationName *string `pulumi:"specificationName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The name of the template.
	TemplateName *string `pulumi:"templateName"`
}

// The set of arguments for constructing a NestServiceInstance resource.
type NestServiceInstanceArgs struct {
	// The order information of cloud market. See `commodity` below.
	Commodity NestServiceInstanceCommodityPtrInput
	// Whether the service instance has the O&M function. Default value: `false`. Valid values:
	EnableInstanceOps pulumi.BoolPtrInput
	// Whether Prometheus monitoring is enabled. Default value: `false`. Valid values:
	EnableUserPrometheus pulumi.BoolPtrInput
	// The configuration of O&M. See `operationMetadata` below.
	OperationMetadata NestServiceInstanceOperationMetadataPtrInput
	// The parameters entered by the deployment service instance.
	Parameters pulumi.StringPtrInput
	// The type of payment. Valid values: `Permanent`, `Subscription`, `PayAsYouGo`, `CustomFixTime`.
	PaymentType pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The ID of the service.
	ServiceId pulumi.StringInput
	// The name of the Service Instance.
	ServiceInstanceName pulumi.StringPtrInput
	// The version of the service.
	ServiceVersion pulumi.StringInput
	// The name of the specification.
	SpecificationName pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// The name of the template.
	TemplateName pulumi.StringPtrInput
}

func (NestServiceInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nestServiceInstanceArgs)(nil)).Elem()
}

type NestServiceInstanceInput interface {
	pulumi.Input

	ToNestServiceInstanceOutput() NestServiceInstanceOutput
	ToNestServiceInstanceOutputWithContext(ctx context.Context) NestServiceInstanceOutput
}

func (*NestServiceInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**NestServiceInstance)(nil)).Elem()
}

func (i *NestServiceInstance) ToNestServiceInstanceOutput() NestServiceInstanceOutput {
	return i.ToNestServiceInstanceOutputWithContext(context.Background())
}

func (i *NestServiceInstance) ToNestServiceInstanceOutputWithContext(ctx context.Context) NestServiceInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NestServiceInstanceOutput)
}

// NestServiceInstanceArrayInput is an input type that accepts NestServiceInstanceArray and NestServiceInstanceArrayOutput values.
// You can construct a concrete instance of `NestServiceInstanceArrayInput` via:
//
//	NestServiceInstanceArray{ NestServiceInstanceArgs{...} }
type NestServiceInstanceArrayInput interface {
	pulumi.Input

	ToNestServiceInstanceArrayOutput() NestServiceInstanceArrayOutput
	ToNestServiceInstanceArrayOutputWithContext(context.Context) NestServiceInstanceArrayOutput
}

type NestServiceInstanceArray []NestServiceInstanceInput

func (NestServiceInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NestServiceInstance)(nil)).Elem()
}

func (i NestServiceInstanceArray) ToNestServiceInstanceArrayOutput() NestServiceInstanceArrayOutput {
	return i.ToNestServiceInstanceArrayOutputWithContext(context.Background())
}

func (i NestServiceInstanceArray) ToNestServiceInstanceArrayOutputWithContext(ctx context.Context) NestServiceInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NestServiceInstanceArrayOutput)
}

// NestServiceInstanceMapInput is an input type that accepts NestServiceInstanceMap and NestServiceInstanceMapOutput values.
// You can construct a concrete instance of `NestServiceInstanceMapInput` via:
//
//	NestServiceInstanceMap{ "key": NestServiceInstanceArgs{...} }
type NestServiceInstanceMapInput interface {
	pulumi.Input

	ToNestServiceInstanceMapOutput() NestServiceInstanceMapOutput
	ToNestServiceInstanceMapOutputWithContext(context.Context) NestServiceInstanceMapOutput
}

type NestServiceInstanceMap map[string]NestServiceInstanceInput

func (NestServiceInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NestServiceInstance)(nil)).Elem()
}

func (i NestServiceInstanceMap) ToNestServiceInstanceMapOutput() NestServiceInstanceMapOutput {
	return i.ToNestServiceInstanceMapOutputWithContext(context.Background())
}

func (i NestServiceInstanceMap) ToNestServiceInstanceMapOutputWithContext(ctx context.Context) NestServiceInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NestServiceInstanceMapOutput)
}

type NestServiceInstanceOutput struct{ *pulumi.OutputState }

func (NestServiceInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NestServiceInstance)(nil)).Elem()
}

func (o NestServiceInstanceOutput) ToNestServiceInstanceOutput() NestServiceInstanceOutput {
	return o
}

func (o NestServiceInstanceOutput) ToNestServiceInstanceOutputWithContext(ctx context.Context) NestServiceInstanceOutput {
	return o
}

// The order information of cloud market. See `commodity` below.
func (o NestServiceInstanceOutput) Commodity() NestServiceInstanceCommodityPtrOutput {
	return o.ApplyT(func(v *NestServiceInstance) NestServiceInstanceCommodityPtrOutput { return v.Commodity }).(NestServiceInstanceCommodityPtrOutput)
}

// Whether the service instance has the O&M function. Default value: `false`. Valid values:
func (o NestServiceInstanceOutput) EnableInstanceOps() pulumi.BoolOutput {
	return o.ApplyT(func(v *NestServiceInstance) pulumi.BoolOutput { return v.EnableInstanceOps }).(pulumi.BoolOutput)
}

// Whether Prometheus monitoring is enabled. Default value: `false`. Valid values:
func (o NestServiceInstanceOutput) EnableUserPrometheus() pulumi.BoolOutput {
	return o.ApplyT(func(v *NestServiceInstance) pulumi.BoolOutput { return v.EnableUserPrometheus }).(pulumi.BoolOutput)
}

// The configuration of O&M. See `operationMetadata` below.
func (o NestServiceInstanceOutput) OperationMetadata() NestServiceInstanceOperationMetadataOutput {
	return o.ApplyT(func(v *NestServiceInstance) NestServiceInstanceOperationMetadataOutput { return v.OperationMetadata }).(NestServiceInstanceOperationMetadataOutput)
}

// The parameters entered by the deployment service instance.
func (o NestServiceInstanceOutput) Parameters() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NestServiceInstance) pulumi.StringPtrOutput { return v.Parameters }).(pulumi.StringPtrOutput)
}

// The type of payment. Valid values: `Permanent`, `Subscription`, `PayAsYouGo`, `CustomFixTime`.
func (o NestServiceInstanceOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *NestServiceInstance) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// The ID of the resource group.
func (o NestServiceInstanceOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *NestServiceInstance) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The ID of the service.
func (o NestServiceInstanceOutput) ServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *NestServiceInstance) pulumi.StringOutput { return v.ServiceId }).(pulumi.StringOutput)
}

// The name of the Service Instance.
func (o NestServiceInstanceOutput) ServiceInstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v *NestServiceInstance) pulumi.StringOutput { return v.ServiceInstanceName }).(pulumi.StringOutput)
}

// The version of the service.
func (o NestServiceInstanceOutput) ServiceVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *NestServiceInstance) pulumi.StringOutput { return v.ServiceVersion }).(pulumi.StringOutput)
}

// The name of the specification.
func (o NestServiceInstanceOutput) SpecificationName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NestServiceInstance) pulumi.StringPtrOutput { return v.SpecificationName }).(pulumi.StringPtrOutput)
}

// The status of the Service Instance.
func (o NestServiceInstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *NestServiceInstance) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o NestServiceInstanceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NestServiceInstance) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The name of the template.
func (o NestServiceInstanceOutput) TemplateName() pulumi.StringOutput {
	return o.ApplyT(func(v *NestServiceInstance) pulumi.StringOutput { return v.TemplateName }).(pulumi.StringOutput)
}

type NestServiceInstanceArrayOutput struct{ *pulumi.OutputState }

func (NestServiceInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NestServiceInstance)(nil)).Elem()
}

func (o NestServiceInstanceArrayOutput) ToNestServiceInstanceArrayOutput() NestServiceInstanceArrayOutput {
	return o
}

func (o NestServiceInstanceArrayOutput) ToNestServiceInstanceArrayOutputWithContext(ctx context.Context) NestServiceInstanceArrayOutput {
	return o
}

func (o NestServiceInstanceArrayOutput) Index(i pulumi.IntInput) NestServiceInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NestServiceInstance {
		return vs[0].([]*NestServiceInstance)[vs[1].(int)]
	}).(NestServiceInstanceOutput)
}

type NestServiceInstanceMapOutput struct{ *pulumi.OutputState }

func (NestServiceInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NestServiceInstance)(nil)).Elem()
}

func (o NestServiceInstanceMapOutput) ToNestServiceInstanceMapOutput() NestServiceInstanceMapOutput {
	return o
}

func (o NestServiceInstanceMapOutput) ToNestServiceInstanceMapOutputWithContext(ctx context.Context) NestServiceInstanceMapOutput {
	return o
}

func (o NestServiceInstanceMapOutput) MapIndex(k pulumi.StringInput) NestServiceInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NestServiceInstance {
		return vs[0].(map[string]*NestServiceInstance)[vs[1].(string)]
	}).(NestServiceInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NestServiceInstanceInput)(nil)).Elem(), &NestServiceInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*NestServiceInstanceArrayInput)(nil)).Elem(), NestServiceInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NestServiceInstanceMapInput)(nil)).Elem(), NestServiceInstanceMap{})
	pulumi.RegisterOutputType(NestServiceInstanceOutput{})
	pulumi.RegisterOutputType(NestServiceInstanceArrayOutput{})
	pulumi.RegisterOutputType(NestServiceInstanceMapOutput{})
}
