// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cfg

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Config Aggregate Delivery resource.
//
// Delivery channel of aggregator.
//
// For information about Config Aggregate Delivery and how to use it, see [What is Aggregate Delivery](https://www.alibabacloud.com/help/en/cloud-config/latest/api-config-2020-09-07-createaggregateconfigdeliverychannel).
//
// > **NOTE:** Available since v1.172.0.
//
// ## Import
//
// Config Aggregate Delivery can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:cfg/aggregateDelivery:AggregateDelivery example <aggregator_id>:<delivery_channel_id>
// ```
type AggregateDelivery struct {
	pulumi.CustomResourceState

	// Aggregator ID.
	AggregatorId pulumi.StringOutput `pulumi:"aggregatorId"`
	// Indicates whether the specified destination receives resource change logs. If the value of this parameter is true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:
	// - true: The specified destination receives resource change logs.
	// - false: The specified destination does not receive resource change logs.
	ConfigurationItemChangeNotification pulumi.BoolPtrOutput `pulumi:"configurationItemChangeNotification"`
	// Indicates whether the specified destination receives scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at 04:00Z and 16:00Z to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:
	// - true: The specified destination receives scheduled resource snapshots.
	// - false: The specified destination does not receive scheduled resource snapshots.
	ConfigurationSnapshot pulumi.BoolPtrOutput `pulumi:"configurationSnapshot"`
	// The rule that is attached to the delivery channel.
	//
	// This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.
	//
	// If you specify the risk level or resource types for subscription events, this is as follows:
	//
	// The lowest risk level of the events to which you want to subscribe is in the following format: {"filterType":"RuleRiskLevel","value":"1","multiple":false}, The value field indicates the risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.
	//
	// The setting of the resource types of the events to which you want to subscribe is in the following format: {"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}, The values field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array.
	//
	// Examples:[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}].
	DeliveryChannelCondition pulumi.StringPtrOutput `pulumi:"deliveryChannelCondition"`
	// The ID of the delivery method. This parameter is required when you modify a delivery method.
	DeliveryChannelId pulumi.StringOutput `pulumi:"deliveryChannelId"`
	// The name of the delivery channel.
	DeliveryChannelName pulumi.StringPtrOutput `pulumi:"deliveryChannelName"`
	// The ARN of the delivery destination.
	// - If the value of the DeliveryChannelType parameter is OSS, the value of this parameter is the ARN of the destination OSS bucket.
	// - If the value of the DeliveryChannelType parameter is MNS, the value of this parameter is the ARN of the destination MNS topic.
	// - If the value of the DeliveryChannelType parameter is SLS, the value of this parameter is the ARN of the destination Log Service Logstore.
	DeliveryChannelTargetArn pulumi.StringOutput `pulumi:"deliveryChannelTargetArn"`
	// The type of the delivery channel. Valid values:
	// - OSS: Object Storage Service (OSS)
	// - MNS: Message Service (MNS)
	// - SLS: Log Service
	DeliveryChannelType pulumi.StringOutput `pulumi:"deliveryChannelType"`
	// The description of the delivery method.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Indicates whether the specified destination receives resource non-compliance events. If the value of this parameter is true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:
	// - true: The specified destination receives resource non-compliance events.
	// - false: The specified destination does not receive resource non-compliance events.
	NonCompliantNotification pulumi.BoolPtrOutput `pulumi:"nonCompliantNotification"`
	// The ARN of the OSS bucket to which the delivered data is transferred when the size of the data exceeds the specified upper limit of the delivery channel.
	OversizedDataOssTargetArn pulumi.StringPtrOutput `pulumi:"oversizedDataOssTargetArn"`
	// The status of the delivery method. Valid values:
	// - 0: The delivery method is disabled.
	// - 1: The delivery destination is enabled. This is the default value.
	Status pulumi.IntOutput `pulumi:"status"`
}

// NewAggregateDelivery registers a new resource with the given unique name, arguments, and options.
func NewAggregateDelivery(ctx *pulumi.Context,
	name string, args *AggregateDeliveryArgs, opts ...pulumi.ResourceOption) (*AggregateDelivery, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AggregatorId == nil {
		return nil, errors.New("invalid value for required argument 'AggregatorId'")
	}
	if args.DeliveryChannelTargetArn == nil {
		return nil, errors.New("invalid value for required argument 'DeliveryChannelTargetArn'")
	}
	if args.DeliveryChannelType == nil {
		return nil, errors.New("invalid value for required argument 'DeliveryChannelType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AggregateDelivery
	err := ctx.RegisterResource("alicloud:cfg/aggregateDelivery:AggregateDelivery", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAggregateDelivery gets an existing AggregateDelivery resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAggregateDelivery(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AggregateDeliveryState, opts ...pulumi.ResourceOption) (*AggregateDelivery, error) {
	var resource AggregateDelivery
	err := ctx.ReadResource("alicloud:cfg/aggregateDelivery:AggregateDelivery", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AggregateDelivery resources.
type aggregateDeliveryState struct {
	// Aggregator ID.
	AggregatorId *string `pulumi:"aggregatorId"`
	// Indicates whether the specified destination receives resource change logs. If the value of this parameter is true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:
	// - true: The specified destination receives resource change logs.
	// - false: The specified destination does not receive resource change logs.
	ConfigurationItemChangeNotification *bool `pulumi:"configurationItemChangeNotification"`
	// Indicates whether the specified destination receives scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at 04:00Z and 16:00Z to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:
	// - true: The specified destination receives scheduled resource snapshots.
	// - false: The specified destination does not receive scheduled resource snapshots.
	ConfigurationSnapshot *bool `pulumi:"configurationSnapshot"`
	// The rule that is attached to the delivery channel.
	//
	// This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.
	//
	// If you specify the risk level or resource types for subscription events, this is as follows:
	//
	// The lowest risk level of the events to which you want to subscribe is in the following format: {"filterType":"RuleRiskLevel","value":"1","multiple":false}, The value field indicates the risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.
	//
	// The setting of the resource types of the events to which you want to subscribe is in the following format: {"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}, The values field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array.
	//
	// Examples:[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}].
	DeliveryChannelCondition *string `pulumi:"deliveryChannelCondition"`
	// The ID of the delivery method. This parameter is required when you modify a delivery method.
	DeliveryChannelId *string `pulumi:"deliveryChannelId"`
	// The name of the delivery channel.
	DeliveryChannelName *string `pulumi:"deliveryChannelName"`
	// The ARN of the delivery destination.
	// - If the value of the DeliveryChannelType parameter is OSS, the value of this parameter is the ARN of the destination OSS bucket.
	// - If the value of the DeliveryChannelType parameter is MNS, the value of this parameter is the ARN of the destination MNS topic.
	// - If the value of the DeliveryChannelType parameter is SLS, the value of this parameter is the ARN of the destination Log Service Logstore.
	DeliveryChannelTargetArn *string `pulumi:"deliveryChannelTargetArn"`
	// The type of the delivery channel. Valid values:
	// - OSS: Object Storage Service (OSS)
	// - MNS: Message Service (MNS)
	// - SLS: Log Service
	DeliveryChannelType *string `pulumi:"deliveryChannelType"`
	// The description of the delivery method.
	Description *string `pulumi:"description"`
	// Indicates whether the specified destination receives resource non-compliance events. If the value of this parameter is true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:
	// - true: The specified destination receives resource non-compliance events.
	// - false: The specified destination does not receive resource non-compliance events.
	NonCompliantNotification *bool `pulumi:"nonCompliantNotification"`
	// The ARN of the OSS bucket to which the delivered data is transferred when the size of the data exceeds the specified upper limit of the delivery channel.
	OversizedDataOssTargetArn *string `pulumi:"oversizedDataOssTargetArn"`
	// The status of the delivery method. Valid values:
	// - 0: The delivery method is disabled.
	// - 1: The delivery destination is enabled. This is the default value.
	Status *int `pulumi:"status"`
}

type AggregateDeliveryState struct {
	// Aggregator ID.
	AggregatorId pulumi.StringPtrInput
	// Indicates whether the specified destination receives resource change logs. If the value of this parameter is true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:
	// - true: The specified destination receives resource change logs.
	// - false: The specified destination does not receive resource change logs.
	ConfigurationItemChangeNotification pulumi.BoolPtrInput
	// Indicates whether the specified destination receives scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at 04:00Z and 16:00Z to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:
	// - true: The specified destination receives scheduled resource snapshots.
	// - false: The specified destination does not receive scheduled resource snapshots.
	ConfigurationSnapshot pulumi.BoolPtrInput
	// The rule that is attached to the delivery channel.
	//
	// This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.
	//
	// If you specify the risk level or resource types for subscription events, this is as follows:
	//
	// The lowest risk level of the events to which you want to subscribe is in the following format: {"filterType":"RuleRiskLevel","value":"1","multiple":false}, The value field indicates the risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.
	//
	// The setting of the resource types of the events to which you want to subscribe is in the following format: {"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}, The values field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array.
	//
	// Examples:[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}].
	DeliveryChannelCondition pulumi.StringPtrInput
	// The ID of the delivery method. This parameter is required when you modify a delivery method.
	DeliveryChannelId pulumi.StringPtrInput
	// The name of the delivery channel.
	DeliveryChannelName pulumi.StringPtrInput
	// The ARN of the delivery destination.
	// - If the value of the DeliveryChannelType parameter is OSS, the value of this parameter is the ARN of the destination OSS bucket.
	// - If the value of the DeliveryChannelType parameter is MNS, the value of this parameter is the ARN of the destination MNS topic.
	// - If the value of the DeliveryChannelType parameter is SLS, the value of this parameter is the ARN of the destination Log Service Logstore.
	DeliveryChannelTargetArn pulumi.StringPtrInput
	// The type of the delivery channel. Valid values:
	// - OSS: Object Storage Service (OSS)
	// - MNS: Message Service (MNS)
	// - SLS: Log Service
	DeliveryChannelType pulumi.StringPtrInput
	// The description of the delivery method.
	Description pulumi.StringPtrInput
	// Indicates whether the specified destination receives resource non-compliance events. If the value of this parameter is true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:
	// - true: The specified destination receives resource non-compliance events.
	// - false: The specified destination does not receive resource non-compliance events.
	NonCompliantNotification pulumi.BoolPtrInput
	// The ARN of the OSS bucket to which the delivered data is transferred when the size of the data exceeds the specified upper limit of the delivery channel.
	OversizedDataOssTargetArn pulumi.StringPtrInput
	// The status of the delivery method. Valid values:
	// - 0: The delivery method is disabled.
	// - 1: The delivery destination is enabled. This is the default value.
	Status pulumi.IntPtrInput
}

func (AggregateDeliveryState) ElementType() reflect.Type {
	return reflect.TypeOf((*aggregateDeliveryState)(nil)).Elem()
}

type aggregateDeliveryArgs struct {
	// Aggregator ID.
	AggregatorId string `pulumi:"aggregatorId"`
	// Indicates whether the specified destination receives resource change logs. If the value of this parameter is true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:
	// - true: The specified destination receives resource change logs.
	// - false: The specified destination does not receive resource change logs.
	ConfigurationItemChangeNotification *bool `pulumi:"configurationItemChangeNotification"`
	// Indicates whether the specified destination receives scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at 04:00Z and 16:00Z to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:
	// - true: The specified destination receives scheduled resource snapshots.
	// - false: The specified destination does not receive scheduled resource snapshots.
	ConfigurationSnapshot *bool `pulumi:"configurationSnapshot"`
	// The rule that is attached to the delivery channel.
	//
	// This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.
	//
	// If you specify the risk level or resource types for subscription events, this is as follows:
	//
	// The lowest risk level of the events to which you want to subscribe is in the following format: {"filterType":"RuleRiskLevel","value":"1","multiple":false}, The value field indicates the risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.
	//
	// The setting of the resource types of the events to which you want to subscribe is in the following format: {"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}, The values field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array.
	//
	// Examples:[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}].
	DeliveryChannelCondition *string `pulumi:"deliveryChannelCondition"`
	// The name of the delivery channel.
	DeliveryChannelName *string `pulumi:"deliveryChannelName"`
	// The ARN of the delivery destination.
	// - If the value of the DeliveryChannelType parameter is OSS, the value of this parameter is the ARN of the destination OSS bucket.
	// - If the value of the DeliveryChannelType parameter is MNS, the value of this parameter is the ARN of the destination MNS topic.
	// - If the value of the DeliveryChannelType parameter is SLS, the value of this parameter is the ARN of the destination Log Service Logstore.
	DeliveryChannelTargetArn string `pulumi:"deliveryChannelTargetArn"`
	// The type of the delivery channel. Valid values:
	// - OSS: Object Storage Service (OSS)
	// - MNS: Message Service (MNS)
	// - SLS: Log Service
	DeliveryChannelType string `pulumi:"deliveryChannelType"`
	// The description of the delivery method.
	Description *string `pulumi:"description"`
	// Indicates whether the specified destination receives resource non-compliance events. If the value of this parameter is true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:
	// - true: The specified destination receives resource non-compliance events.
	// - false: The specified destination does not receive resource non-compliance events.
	NonCompliantNotification *bool `pulumi:"nonCompliantNotification"`
	// The ARN of the OSS bucket to which the delivered data is transferred when the size of the data exceeds the specified upper limit of the delivery channel.
	OversizedDataOssTargetArn *string `pulumi:"oversizedDataOssTargetArn"`
	// The status of the delivery method. Valid values:
	// - 0: The delivery method is disabled.
	// - 1: The delivery destination is enabled. This is the default value.
	Status *int `pulumi:"status"`
}

// The set of arguments for constructing a AggregateDelivery resource.
type AggregateDeliveryArgs struct {
	// Aggregator ID.
	AggregatorId pulumi.StringInput
	// Indicates whether the specified destination receives resource change logs. If the value of this parameter is true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:
	// - true: The specified destination receives resource change logs.
	// - false: The specified destination does not receive resource change logs.
	ConfigurationItemChangeNotification pulumi.BoolPtrInput
	// Indicates whether the specified destination receives scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at 04:00Z and 16:00Z to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:
	// - true: The specified destination receives scheduled resource snapshots.
	// - false: The specified destination does not receive scheduled resource snapshots.
	ConfigurationSnapshot pulumi.BoolPtrInput
	// The rule that is attached to the delivery channel.
	//
	// This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.
	//
	// If you specify the risk level or resource types for subscription events, this is as follows:
	//
	// The lowest risk level of the events to which you want to subscribe is in the following format: {"filterType":"RuleRiskLevel","value":"1","multiple":false}, The value field indicates the risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.
	//
	// The setting of the resource types of the events to which you want to subscribe is in the following format: {"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}, The values field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array.
	//
	// Examples:[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}].
	DeliveryChannelCondition pulumi.StringPtrInput
	// The name of the delivery channel.
	DeliveryChannelName pulumi.StringPtrInput
	// The ARN of the delivery destination.
	// - If the value of the DeliveryChannelType parameter is OSS, the value of this parameter is the ARN of the destination OSS bucket.
	// - If the value of the DeliveryChannelType parameter is MNS, the value of this parameter is the ARN of the destination MNS topic.
	// - If the value of the DeliveryChannelType parameter is SLS, the value of this parameter is the ARN of the destination Log Service Logstore.
	DeliveryChannelTargetArn pulumi.StringInput
	// The type of the delivery channel. Valid values:
	// - OSS: Object Storage Service (OSS)
	// - MNS: Message Service (MNS)
	// - SLS: Log Service
	DeliveryChannelType pulumi.StringInput
	// The description of the delivery method.
	Description pulumi.StringPtrInput
	// Indicates whether the specified destination receives resource non-compliance events. If the value of this parameter is true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:
	// - true: The specified destination receives resource non-compliance events.
	// - false: The specified destination does not receive resource non-compliance events.
	NonCompliantNotification pulumi.BoolPtrInput
	// The ARN of the OSS bucket to which the delivered data is transferred when the size of the data exceeds the specified upper limit of the delivery channel.
	OversizedDataOssTargetArn pulumi.StringPtrInput
	// The status of the delivery method. Valid values:
	// - 0: The delivery method is disabled.
	// - 1: The delivery destination is enabled. This is the default value.
	Status pulumi.IntPtrInput
}

func (AggregateDeliveryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aggregateDeliveryArgs)(nil)).Elem()
}

type AggregateDeliveryInput interface {
	pulumi.Input

	ToAggregateDeliveryOutput() AggregateDeliveryOutput
	ToAggregateDeliveryOutputWithContext(ctx context.Context) AggregateDeliveryOutput
}

func (*AggregateDelivery) ElementType() reflect.Type {
	return reflect.TypeOf((**AggregateDelivery)(nil)).Elem()
}

func (i *AggregateDelivery) ToAggregateDeliveryOutput() AggregateDeliveryOutput {
	return i.ToAggregateDeliveryOutputWithContext(context.Background())
}

func (i *AggregateDelivery) ToAggregateDeliveryOutputWithContext(ctx context.Context) AggregateDeliveryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AggregateDeliveryOutput)
}

// AggregateDeliveryArrayInput is an input type that accepts AggregateDeliveryArray and AggregateDeliveryArrayOutput values.
// You can construct a concrete instance of `AggregateDeliveryArrayInput` via:
//
//	AggregateDeliveryArray{ AggregateDeliveryArgs{...} }
type AggregateDeliveryArrayInput interface {
	pulumi.Input

	ToAggregateDeliveryArrayOutput() AggregateDeliveryArrayOutput
	ToAggregateDeliveryArrayOutputWithContext(context.Context) AggregateDeliveryArrayOutput
}

type AggregateDeliveryArray []AggregateDeliveryInput

func (AggregateDeliveryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AggregateDelivery)(nil)).Elem()
}

func (i AggregateDeliveryArray) ToAggregateDeliveryArrayOutput() AggregateDeliveryArrayOutput {
	return i.ToAggregateDeliveryArrayOutputWithContext(context.Background())
}

func (i AggregateDeliveryArray) ToAggregateDeliveryArrayOutputWithContext(ctx context.Context) AggregateDeliveryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AggregateDeliveryArrayOutput)
}

// AggregateDeliveryMapInput is an input type that accepts AggregateDeliveryMap and AggregateDeliveryMapOutput values.
// You can construct a concrete instance of `AggregateDeliveryMapInput` via:
//
//	AggregateDeliveryMap{ "key": AggregateDeliveryArgs{...} }
type AggregateDeliveryMapInput interface {
	pulumi.Input

	ToAggregateDeliveryMapOutput() AggregateDeliveryMapOutput
	ToAggregateDeliveryMapOutputWithContext(context.Context) AggregateDeliveryMapOutput
}

type AggregateDeliveryMap map[string]AggregateDeliveryInput

func (AggregateDeliveryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AggregateDelivery)(nil)).Elem()
}

func (i AggregateDeliveryMap) ToAggregateDeliveryMapOutput() AggregateDeliveryMapOutput {
	return i.ToAggregateDeliveryMapOutputWithContext(context.Background())
}

func (i AggregateDeliveryMap) ToAggregateDeliveryMapOutputWithContext(ctx context.Context) AggregateDeliveryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AggregateDeliveryMapOutput)
}

type AggregateDeliveryOutput struct{ *pulumi.OutputState }

func (AggregateDeliveryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AggregateDelivery)(nil)).Elem()
}

func (o AggregateDeliveryOutput) ToAggregateDeliveryOutput() AggregateDeliveryOutput {
	return o
}

func (o AggregateDeliveryOutput) ToAggregateDeliveryOutputWithContext(ctx context.Context) AggregateDeliveryOutput {
	return o
}

// Aggregator ID.
func (o AggregateDeliveryOutput) AggregatorId() pulumi.StringOutput {
	return o.ApplyT(func(v *AggregateDelivery) pulumi.StringOutput { return v.AggregatorId }).(pulumi.StringOutput)
}

// Indicates whether the specified destination receives resource change logs. If the value of this parameter is true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:
// - true: The specified destination receives resource change logs.
// - false: The specified destination does not receive resource change logs.
func (o AggregateDeliveryOutput) ConfigurationItemChangeNotification() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AggregateDelivery) pulumi.BoolPtrOutput { return v.ConfigurationItemChangeNotification }).(pulumi.BoolPtrOutput)
}

// Indicates whether the specified destination receives scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at 04:00Z and 16:00Z to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:
// - true: The specified destination receives scheduled resource snapshots.
// - false: The specified destination does not receive scheduled resource snapshots.
func (o AggregateDeliveryOutput) ConfigurationSnapshot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AggregateDelivery) pulumi.BoolPtrOutput { return v.ConfigurationSnapshot }).(pulumi.BoolPtrOutput)
}

// The rule that is attached to the delivery channel.
//
// This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.
//
// If you specify the risk level or resource types for subscription events, this is as follows:
//
// The lowest risk level of the events to which you want to subscribe is in the following format: {"filterType":"RuleRiskLevel","value":"1","multiple":false}, The value field indicates the risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.
//
// The setting of the resource types of the events to which you want to subscribe is in the following format: {"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}, The values field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array.
//
// Examples:[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}].
func (o AggregateDeliveryOutput) DeliveryChannelCondition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AggregateDelivery) pulumi.StringPtrOutput { return v.DeliveryChannelCondition }).(pulumi.StringPtrOutput)
}

// The ID of the delivery method. This parameter is required when you modify a delivery method.
func (o AggregateDeliveryOutput) DeliveryChannelId() pulumi.StringOutput {
	return o.ApplyT(func(v *AggregateDelivery) pulumi.StringOutput { return v.DeliveryChannelId }).(pulumi.StringOutput)
}

// The name of the delivery channel.
func (o AggregateDeliveryOutput) DeliveryChannelName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AggregateDelivery) pulumi.StringPtrOutput { return v.DeliveryChannelName }).(pulumi.StringPtrOutput)
}

// The ARN of the delivery destination.
// - If the value of the DeliveryChannelType parameter is OSS, the value of this parameter is the ARN of the destination OSS bucket.
// - If the value of the DeliveryChannelType parameter is MNS, the value of this parameter is the ARN of the destination MNS topic.
// - If the value of the DeliveryChannelType parameter is SLS, the value of this parameter is the ARN of the destination Log Service Logstore.
func (o AggregateDeliveryOutput) DeliveryChannelTargetArn() pulumi.StringOutput {
	return o.ApplyT(func(v *AggregateDelivery) pulumi.StringOutput { return v.DeliveryChannelTargetArn }).(pulumi.StringOutput)
}

// The type of the delivery channel. Valid values:
// - OSS: Object Storage Service (OSS)
// - MNS: Message Service (MNS)
// - SLS: Log Service
func (o AggregateDeliveryOutput) DeliveryChannelType() pulumi.StringOutput {
	return o.ApplyT(func(v *AggregateDelivery) pulumi.StringOutput { return v.DeliveryChannelType }).(pulumi.StringOutput)
}

// The description of the delivery method.
func (o AggregateDeliveryOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AggregateDelivery) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Indicates whether the specified destination receives resource non-compliance events. If the value of this parameter is true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:
// - true: The specified destination receives resource non-compliance events.
// - false: The specified destination does not receive resource non-compliance events.
func (o AggregateDeliveryOutput) NonCompliantNotification() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AggregateDelivery) pulumi.BoolPtrOutput { return v.NonCompliantNotification }).(pulumi.BoolPtrOutput)
}

// The ARN of the OSS bucket to which the delivered data is transferred when the size of the data exceeds the specified upper limit of the delivery channel.
func (o AggregateDeliveryOutput) OversizedDataOssTargetArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AggregateDelivery) pulumi.StringPtrOutput { return v.OversizedDataOssTargetArn }).(pulumi.StringPtrOutput)
}

// The status of the delivery method. Valid values:
// - 0: The delivery method is disabled.
// - 1: The delivery destination is enabled. This is the default value.
func (o AggregateDeliveryOutput) Status() pulumi.IntOutput {
	return o.ApplyT(func(v *AggregateDelivery) pulumi.IntOutput { return v.Status }).(pulumi.IntOutput)
}

type AggregateDeliveryArrayOutput struct{ *pulumi.OutputState }

func (AggregateDeliveryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AggregateDelivery)(nil)).Elem()
}

func (o AggregateDeliveryArrayOutput) ToAggregateDeliveryArrayOutput() AggregateDeliveryArrayOutput {
	return o
}

func (o AggregateDeliveryArrayOutput) ToAggregateDeliveryArrayOutputWithContext(ctx context.Context) AggregateDeliveryArrayOutput {
	return o
}

func (o AggregateDeliveryArrayOutput) Index(i pulumi.IntInput) AggregateDeliveryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AggregateDelivery {
		return vs[0].([]*AggregateDelivery)[vs[1].(int)]
	}).(AggregateDeliveryOutput)
}

type AggregateDeliveryMapOutput struct{ *pulumi.OutputState }

func (AggregateDeliveryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AggregateDelivery)(nil)).Elem()
}

func (o AggregateDeliveryMapOutput) ToAggregateDeliveryMapOutput() AggregateDeliveryMapOutput {
	return o
}

func (o AggregateDeliveryMapOutput) ToAggregateDeliveryMapOutputWithContext(ctx context.Context) AggregateDeliveryMapOutput {
	return o
}

func (o AggregateDeliveryMapOutput) MapIndex(k pulumi.StringInput) AggregateDeliveryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AggregateDelivery {
		return vs[0].(map[string]*AggregateDelivery)[vs[1].(string)]
	}).(AggregateDeliveryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AggregateDeliveryInput)(nil)).Elem(), &AggregateDelivery{})
	pulumi.RegisterInputType(reflect.TypeOf((*AggregateDeliveryArrayInput)(nil)).Elem(), AggregateDeliveryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AggregateDeliveryMapInput)(nil)).Elem(), AggregateDeliveryMap{})
	pulumi.RegisterOutputType(AggregateDeliveryOutput{})
	pulumi.RegisterOutputType(AggregateDeliveryArrayOutput{})
	pulumi.RegisterOutputType(AggregateDeliveryMapOutput{})
}
