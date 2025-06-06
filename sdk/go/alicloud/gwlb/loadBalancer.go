// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gwlb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a GWLB Load Balancer resource.
//
// For information about GWLB Load Balancer and how to use it, see [What is Load Balancer](https://www.alibabacloud.com/help/en/slb/gateway-based-load-balancing-gwlb/developer-reference/api-gwlb-2024-04-15-createloadbalancer).
//
// > **NOTE:** Available since v1.234.0.
//
// ## Import
//
// GWLB Load Balancer can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:gwlb/loadBalancer:LoadBalancer example <id>
// ```
type LoadBalancer struct {
	pulumi.CustomResourceState

	// The IP version. Valid values:
	//
	// - `Ipv4`: IPv4 (default)
	AddressIpVersion pulumi.StringOutput `pulumi:"addressIpVersion"`
	// The time when the resource was created. The time follows the ISO 8601 standard in the **yyyy-MM-ddTHH:mm:ssZ** format. The time is displayed in UTC.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Specifies whether to perform a dry run, without performing the actual request. Valid values:
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// The GWLB instance name.
	//
	// The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
	LoadBalancerName pulumi.StringPtrOutput `pulumi:"loadBalancerName"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The GWLB instance status.
	Status pulumi.StringOutput `pulumi:"status"`
	// The tag keys. You can specify at most 20 tags in each call.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The virtual private cloud (VPC) ID.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
	// The mappings between zones and vSwitches. You must specify at least one zone. You can specify at most 20 zones. If the region supports two or more zones, we recommend that you select two or more zones. See `zoneMappings` below.
	ZoneMappings LoadBalancerZoneMappingArrayOutput `pulumi:"zoneMappings"`
}

// NewLoadBalancer registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancer(ctx *pulumi.Context,
	name string, args *LoadBalancerArgs, opts ...pulumi.ResourceOption) (*LoadBalancer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	if args.ZoneMappings == nil {
		return nil, errors.New("invalid value for required argument 'ZoneMappings'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoadBalancer
	err := ctx.RegisterResource("alicloud:gwlb/loadBalancer:LoadBalancer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadBalancer gets an existing LoadBalancer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadBalancerState, opts ...pulumi.ResourceOption) (*LoadBalancer, error) {
	var resource LoadBalancer
	err := ctx.ReadResource("alicloud:gwlb/loadBalancer:LoadBalancer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadBalancer resources.
type loadBalancerState struct {
	// The IP version. Valid values:
	//
	// - `Ipv4`: IPv4 (default)
	AddressIpVersion *string `pulumi:"addressIpVersion"`
	// The time when the resource was created. The time follows the ISO 8601 standard in the **yyyy-MM-ddTHH:mm:ssZ** format. The time is displayed in UTC.
	CreateTime *string `pulumi:"createTime"`
	// Specifies whether to perform a dry run, without performing the actual request. Valid values:
	DryRun *bool `pulumi:"dryRun"`
	// The GWLB instance name.
	//
	// The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
	LoadBalancerName *string `pulumi:"loadBalancerName"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The GWLB instance status.
	Status *string `pulumi:"status"`
	// The tag keys. You can specify at most 20 tags in each call.
	Tags map[string]string `pulumi:"tags"`
	// The virtual private cloud (VPC) ID.
	VpcId *string `pulumi:"vpcId"`
	// The mappings between zones and vSwitches. You must specify at least one zone. You can specify at most 20 zones. If the region supports two or more zones, we recommend that you select two or more zones. See `zoneMappings` below.
	ZoneMappings []LoadBalancerZoneMapping `pulumi:"zoneMappings"`
}

type LoadBalancerState struct {
	// The IP version. Valid values:
	//
	// - `Ipv4`: IPv4 (default)
	AddressIpVersion pulumi.StringPtrInput
	// The time when the resource was created. The time follows the ISO 8601 standard in the **yyyy-MM-ddTHH:mm:ssZ** format. The time is displayed in UTC.
	CreateTime pulumi.StringPtrInput
	// Specifies whether to perform a dry run, without performing the actual request. Valid values:
	DryRun pulumi.BoolPtrInput
	// The GWLB instance name.
	//
	// The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
	LoadBalancerName pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The GWLB instance status.
	Status pulumi.StringPtrInput
	// The tag keys. You can specify at most 20 tags in each call.
	Tags pulumi.StringMapInput
	// The virtual private cloud (VPC) ID.
	VpcId pulumi.StringPtrInput
	// The mappings between zones and vSwitches. You must specify at least one zone. You can specify at most 20 zones. If the region supports two or more zones, we recommend that you select two or more zones. See `zoneMappings` below.
	ZoneMappings LoadBalancerZoneMappingArrayInput
}

func (LoadBalancerState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerState)(nil)).Elem()
}

type loadBalancerArgs struct {
	// The IP version. Valid values:
	//
	// - `Ipv4`: IPv4 (default)
	AddressIpVersion *string `pulumi:"addressIpVersion"`
	// Specifies whether to perform a dry run, without performing the actual request. Valid values:
	DryRun *bool `pulumi:"dryRun"`
	// The GWLB instance name.
	//
	// The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
	LoadBalancerName *string `pulumi:"loadBalancerName"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The tag keys. You can specify at most 20 tags in each call.
	Tags map[string]string `pulumi:"tags"`
	// The virtual private cloud (VPC) ID.
	VpcId string `pulumi:"vpcId"`
	// The mappings between zones and vSwitches. You must specify at least one zone. You can specify at most 20 zones. If the region supports two or more zones, we recommend that you select two or more zones. See `zoneMappings` below.
	ZoneMappings []LoadBalancerZoneMapping `pulumi:"zoneMappings"`
}

// The set of arguments for constructing a LoadBalancer resource.
type LoadBalancerArgs struct {
	// The IP version. Valid values:
	//
	// - `Ipv4`: IPv4 (default)
	AddressIpVersion pulumi.StringPtrInput
	// Specifies whether to perform a dry run, without performing the actual request. Valid values:
	DryRun pulumi.BoolPtrInput
	// The GWLB instance name.
	//
	// The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
	LoadBalancerName pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The tag keys. You can specify at most 20 tags in each call.
	Tags pulumi.StringMapInput
	// The virtual private cloud (VPC) ID.
	VpcId pulumi.StringInput
	// The mappings between zones and vSwitches. You must specify at least one zone. You can specify at most 20 zones. If the region supports two or more zones, we recommend that you select two or more zones. See `zoneMappings` below.
	ZoneMappings LoadBalancerZoneMappingArrayInput
}

func (LoadBalancerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerArgs)(nil)).Elem()
}

type LoadBalancerInput interface {
	pulumi.Input

	ToLoadBalancerOutput() LoadBalancerOutput
	ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput
}

func (*LoadBalancer) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancer)(nil)).Elem()
}

func (i *LoadBalancer) ToLoadBalancerOutput() LoadBalancerOutput {
	return i.ToLoadBalancerOutputWithContext(context.Background())
}

func (i *LoadBalancer) ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerOutput)
}

// LoadBalancerArrayInput is an input type that accepts LoadBalancerArray and LoadBalancerArrayOutput values.
// You can construct a concrete instance of `LoadBalancerArrayInput` via:
//
//	LoadBalancerArray{ LoadBalancerArgs{...} }
type LoadBalancerArrayInput interface {
	pulumi.Input

	ToLoadBalancerArrayOutput() LoadBalancerArrayOutput
	ToLoadBalancerArrayOutputWithContext(context.Context) LoadBalancerArrayOutput
}

type LoadBalancerArray []LoadBalancerInput

func (LoadBalancerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadBalancer)(nil)).Elem()
}

func (i LoadBalancerArray) ToLoadBalancerArrayOutput() LoadBalancerArrayOutput {
	return i.ToLoadBalancerArrayOutputWithContext(context.Background())
}

func (i LoadBalancerArray) ToLoadBalancerArrayOutputWithContext(ctx context.Context) LoadBalancerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerArrayOutput)
}

// LoadBalancerMapInput is an input type that accepts LoadBalancerMap and LoadBalancerMapOutput values.
// You can construct a concrete instance of `LoadBalancerMapInput` via:
//
//	LoadBalancerMap{ "key": LoadBalancerArgs{...} }
type LoadBalancerMapInput interface {
	pulumi.Input

	ToLoadBalancerMapOutput() LoadBalancerMapOutput
	ToLoadBalancerMapOutputWithContext(context.Context) LoadBalancerMapOutput
}

type LoadBalancerMap map[string]LoadBalancerInput

func (LoadBalancerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadBalancer)(nil)).Elem()
}

func (i LoadBalancerMap) ToLoadBalancerMapOutput() LoadBalancerMapOutput {
	return i.ToLoadBalancerMapOutputWithContext(context.Background())
}

func (i LoadBalancerMap) ToLoadBalancerMapOutputWithContext(ctx context.Context) LoadBalancerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerMapOutput)
}

type LoadBalancerOutput struct{ *pulumi.OutputState }

func (LoadBalancerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancer)(nil)).Elem()
}

func (o LoadBalancerOutput) ToLoadBalancerOutput() LoadBalancerOutput {
	return o
}

func (o LoadBalancerOutput) ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput {
	return o
}

// The IP version. Valid values:
//
// - `Ipv4`: IPv4 (default)
func (o LoadBalancerOutput) AddressIpVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.AddressIpVersion }).(pulumi.StringOutput)
}

// The time when the resource was created. The time follows the ISO 8601 standard in the **yyyy-MM-ddTHH:mm:ssZ** format. The time is displayed in UTC.
func (o LoadBalancerOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Specifies whether to perform a dry run, without performing the actual request. Valid values:
func (o LoadBalancerOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// The GWLB instance name.
//
// The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
func (o LoadBalancerOutput) LoadBalancerName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringPtrOutput { return v.LoadBalancerName }).(pulumi.StringPtrOutput)
}

// The ID of the resource group.
func (o LoadBalancerOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The GWLB instance status.
func (o LoadBalancerOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tag keys. You can specify at most 20 tags in each call.
func (o LoadBalancerOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The virtual private cloud (VPC) ID.
func (o LoadBalancerOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

// The mappings between zones and vSwitches. You must specify at least one zone. You can specify at most 20 zones. If the region supports two or more zones, we recommend that you select two or more zones. See `zoneMappings` below.
func (o LoadBalancerOutput) ZoneMappings() LoadBalancerZoneMappingArrayOutput {
	return o.ApplyT(func(v *LoadBalancer) LoadBalancerZoneMappingArrayOutput { return v.ZoneMappings }).(LoadBalancerZoneMappingArrayOutput)
}

type LoadBalancerArrayOutput struct{ *pulumi.OutputState }

func (LoadBalancerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadBalancer)(nil)).Elem()
}

func (o LoadBalancerArrayOutput) ToLoadBalancerArrayOutput() LoadBalancerArrayOutput {
	return o
}

func (o LoadBalancerArrayOutput) ToLoadBalancerArrayOutputWithContext(ctx context.Context) LoadBalancerArrayOutput {
	return o
}

func (o LoadBalancerArrayOutput) Index(i pulumi.IntInput) LoadBalancerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoadBalancer {
		return vs[0].([]*LoadBalancer)[vs[1].(int)]
	}).(LoadBalancerOutput)
}

type LoadBalancerMapOutput struct{ *pulumi.OutputState }

func (LoadBalancerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadBalancer)(nil)).Elem()
}

func (o LoadBalancerMapOutput) ToLoadBalancerMapOutput() LoadBalancerMapOutput {
	return o
}

func (o LoadBalancerMapOutput) ToLoadBalancerMapOutputWithContext(ctx context.Context) LoadBalancerMapOutput {
	return o
}

func (o LoadBalancerMapOutput) MapIndex(k pulumi.StringInput) LoadBalancerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoadBalancer {
		return vs[0].(map[string]*LoadBalancer)[vs[1].(string)]
	}).(LoadBalancerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerInput)(nil)).Elem(), &LoadBalancer{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerArrayInput)(nil)).Elem(), LoadBalancerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerMapInput)(nil)).Elem(), LoadBalancerMap{})
	pulumi.RegisterOutputType(LoadBalancerOutput{})
	pulumi.RegisterOutputType(LoadBalancerArrayOutput{})
	pulumi.RegisterOutputType(LoadBalancerMapOutput{})
}
