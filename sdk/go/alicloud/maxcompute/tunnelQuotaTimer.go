// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package maxcompute

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Max Compute Tunnel Quota Timer can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:maxcompute/tunnelQuotaTimer:TunnelQuotaTimer example <id>
// ```
type TunnelQuotaTimer struct {
	pulumi.CustomResourceState

	// The nickname of the exclusive Resource Group (Tunnel Quota) for the level - 1 data transmission service.
	Nickname pulumi.StringOutput `pulumi:"nickname"`
	// Time-Sharing configuration
	//
	// > **NOTE:** -- The same reserved Quota resource group supports up to 48 time intervals. The minimum duration of a time interval is 30 minutes. -- After the current data transmission service is configured for time-sharing, if you need to perform a downgrade operation on the data transmission service (package year and month), please reduce the time-sharing concurrency first. -- The effective time of the time-sharing configuration is 0 to 5 minutes, and the billing will be calculated according to the actual effective time. -- Please make sure to set the time range completely from 00:00 to 24:00
	// See `quotaTimer` below.
	QuotaTimers TunnelQuotaTimerQuotaTimerArrayOutput `pulumi:"quotaTimers"`
	// Time zone, reference: Asia/Shanghai
	// In general, the system will automatically generate the time zone according to the region without configuration.
	TimeZone pulumi.StringPtrOutput `pulumi:"timeZone"`
}

// NewTunnelQuotaTimer registers a new resource with the given unique name, arguments, and options.
func NewTunnelQuotaTimer(ctx *pulumi.Context,
	name string, args *TunnelQuotaTimerArgs, opts ...pulumi.ResourceOption) (*TunnelQuotaTimer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Nickname == nil {
		return nil, errors.New("invalid value for required argument 'Nickname'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TunnelQuotaTimer
	err := ctx.RegisterResource("alicloud:maxcompute/tunnelQuotaTimer:TunnelQuotaTimer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTunnelQuotaTimer gets an existing TunnelQuotaTimer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTunnelQuotaTimer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TunnelQuotaTimerState, opts ...pulumi.ResourceOption) (*TunnelQuotaTimer, error) {
	var resource TunnelQuotaTimer
	err := ctx.ReadResource("alicloud:maxcompute/tunnelQuotaTimer:TunnelQuotaTimer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TunnelQuotaTimer resources.
type tunnelQuotaTimerState struct {
	// The nickname of the exclusive Resource Group (Tunnel Quota) for the level - 1 data transmission service.
	Nickname *string `pulumi:"nickname"`
	// Time-Sharing configuration
	//
	// > **NOTE:** -- The same reserved Quota resource group supports up to 48 time intervals. The minimum duration of a time interval is 30 minutes. -- After the current data transmission service is configured for time-sharing, if you need to perform a downgrade operation on the data transmission service (package year and month), please reduce the time-sharing concurrency first. -- The effective time of the time-sharing configuration is 0 to 5 minutes, and the billing will be calculated according to the actual effective time. -- Please make sure to set the time range completely from 00:00 to 24:00
	// See `quotaTimer` below.
	QuotaTimers []TunnelQuotaTimerQuotaTimer `pulumi:"quotaTimers"`
	// Time zone, reference: Asia/Shanghai
	// In general, the system will automatically generate the time zone according to the region without configuration.
	TimeZone *string `pulumi:"timeZone"`
}

type TunnelQuotaTimerState struct {
	// The nickname of the exclusive Resource Group (Tunnel Quota) for the level - 1 data transmission service.
	Nickname pulumi.StringPtrInput
	// Time-Sharing configuration
	//
	// > **NOTE:** -- The same reserved Quota resource group supports up to 48 time intervals. The minimum duration of a time interval is 30 minutes. -- After the current data transmission service is configured for time-sharing, if you need to perform a downgrade operation on the data transmission service (package year and month), please reduce the time-sharing concurrency first. -- The effective time of the time-sharing configuration is 0 to 5 minutes, and the billing will be calculated according to the actual effective time. -- Please make sure to set the time range completely from 00:00 to 24:00
	// See `quotaTimer` below.
	QuotaTimers TunnelQuotaTimerQuotaTimerArrayInput
	// Time zone, reference: Asia/Shanghai
	// In general, the system will automatically generate the time zone according to the region without configuration.
	TimeZone pulumi.StringPtrInput
}

func (TunnelQuotaTimerState) ElementType() reflect.Type {
	return reflect.TypeOf((*tunnelQuotaTimerState)(nil)).Elem()
}

type tunnelQuotaTimerArgs struct {
	// The nickname of the exclusive Resource Group (Tunnel Quota) for the level - 1 data transmission service.
	Nickname string `pulumi:"nickname"`
	// Time-Sharing configuration
	//
	// > **NOTE:** -- The same reserved Quota resource group supports up to 48 time intervals. The minimum duration of a time interval is 30 minutes. -- After the current data transmission service is configured for time-sharing, if you need to perform a downgrade operation on the data transmission service (package year and month), please reduce the time-sharing concurrency first. -- The effective time of the time-sharing configuration is 0 to 5 minutes, and the billing will be calculated according to the actual effective time. -- Please make sure to set the time range completely from 00:00 to 24:00
	// See `quotaTimer` below.
	QuotaTimers []TunnelQuotaTimerQuotaTimer `pulumi:"quotaTimers"`
	// Time zone, reference: Asia/Shanghai
	// In general, the system will automatically generate the time zone according to the region without configuration.
	TimeZone *string `pulumi:"timeZone"`
}

// The set of arguments for constructing a TunnelQuotaTimer resource.
type TunnelQuotaTimerArgs struct {
	// The nickname of the exclusive Resource Group (Tunnel Quota) for the level - 1 data transmission service.
	Nickname pulumi.StringInput
	// Time-Sharing configuration
	//
	// > **NOTE:** -- The same reserved Quota resource group supports up to 48 time intervals. The minimum duration of a time interval is 30 minutes. -- After the current data transmission service is configured for time-sharing, if you need to perform a downgrade operation on the data transmission service (package year and month), please reduce the time-sharing concurrency first. -- The effective time of the time-sharing configuration is 0 to 5 minutes, and the billing will be calculated according to the actual effective time. -- Please make sure to set the time range completely from 00:00 to 24:00
	// See `quotaTimer` below.
	QuotaTimers TunnelQuotaTimerQuotaTimerArrayInput
	// Time zone, reference: Asia/Shanghai
	// In general, the system will automatically generate the time zone according to the region without configuration.
	TimeZone pulumi.StringPtrInput
}

func (TunnelQuotaTimerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tunnelQuotaTimerArgs)(nil)).Elem()
}

type TunnelQuotaTimerInput interface {
	pulumi.Input

	ToTunnelQuotaTimerOutput() TunnelQuotaTimerOutput
	ToTunnelQuotaTimerOutputWithContext(ctx context.Context) TunnelQuotaTimerOutput
}

func (*TunnelQuotaTimer) ElementType() reflect.Type {
	return reflect.TypeOf((**TunnelQuotaTimer)(nil)).Elem()
}

func (i *TunnelQuotaTimer) ToTunnelQuotaTimerOutput() TunnelQuotaTimerOutput {
	return i.ToTunnelQuotaTimerOutputWithContext(context.Background())
}

func (i *TunnelQuotaTimer) ToTunnelQuotaTimerOutputWithContext(ctx context.Context) TunnelQuotaTimerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TunnelQuotaTimerOutput)
}

// TunnelQuotaTimerArrayInput is an input type that accepts TunnelQuotaTimerArray and TunnelQuotaTimerArrayOutput values.
// You can construct a concrete instance of `TunnelQuotaTimerArrayInput` via:
//
//	TunnelQuotaTimerArray{ TunnelQuotaTimerArgs{...} }
type TunnelQuotaTimerArrayInput interface {
	pulumi.Input

	ToTunnelQuotaTimerArrayOutput() TunnelQuotaTimerArrayOutput
	ToTunnelQuotaTimerArrayOutputWithContext(context.Context) TunnelQuotaTimerArrayOutput
}

type TunnelQuotaTimerArray []TunnelQuotaTimerInput

func (TunnelQuotaTimerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TunnelQuotaTimer)(nil)).Elem()
}

func (i TunnelQuotaTimerArray) ToTunnelQuotaTimerArrayOutput() TunnelQuotaTimerArrayOutput {
	return i.ToTunnelQuotaTimerArrayOutputWithContext(context.Background())
}

func (i TunnelQuotaTimerArray) ToTunnelQuotaTimerArrayOutputWithContext(ctx context.Context) TunnelQuotaTimerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TunnelQuotaTimerArrayOutput)
}

// TunnelQuotaTimerMapInput is an input type that accepts TunnelQuotaTimerMap and TunnelQuotaTimerMapOutput values.
// You can construct a concrete instance of `TunnelQuotaTimerMapInput` via:
//
//	TunnelQuotaTimerMap{ "key": TunnelQuotaTimerArgs{...} }
type TunnelQuotaTimerMapInput interface {
	pulumi.Input

	ToTunnelQuotaTimerMapOutput() TunnelQuotaTimerMapOutput
	ToTunnelQuotaTimerMapOutputWithContext(context.Context) TunnelQuotaTimerMapOutput
}

type TunnelQuotaTimerMap map[string]TunnelQuotaTimerInput

func (TunnelQuotaTimerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TunnelQuotaTimer)(nil)).Elem()
}

func (i TunnelQuotaTimerMap) ToTunnelQuotaTimerMapOutput() TunnelQuotaTimerMapOutput {
	return i.ToTunnelQuotaTimerMapOutputWithContext(context.Background())
}

func (i TunnelQuotaTimerMap) ToTunnelQuotaTimerMapOutputWithContext(ctx context.Context) TunnelQuotaTimerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TunnelQuotaTimerMapOutput)
}

type TunnelQuotaTimerOutput struct{ *pulumi.OutputState }

func (TunnelQuotaTimerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TunnelQuotaTimer)(nil)).Elem()
}

func (o TunnelQuotaTimerOutput) ToTunnelQuotaTimerOutput() TunnelQuotaTimerOutput {
	return o
}

func (o TunnelQuotaTimerOutput) ToTunnelQuotaTimerOutputWithContext(ctx context.Context) TunnelQuotaTimerOutput {
	return o
}

// The nickname of the exclusive Resource Group (Tunnel Quota) for the level - 1 data transmission service.
func (o TunnelQuotaTimerOutput) Nickname() pulumi.StringOutput {
	return o.ApplyT(func(v *TunnelQuotaTimer) pulumi.StringOutput { return v.Nickname }).(pulumi.StringOutput)
}

// Time-Sharing configuration
//
// > **NOTE:** -- The same reserved Quota resource group supports up to 48 time intervals. The minimum duration of a time interval is 30 minutes. -- After the current data transmission service is configured for time-sharing, if you need to perform a downgrade operation on the data transmission service (package year and month), please reduce the time-sharing concurrency first. -- The effective time of the time-sharing configuration is 0 to 5 minutes, and the billing will be calculated according to the actual effective time. -- Please make sure to set the time range completely from 00:00 to 24:00
// See `quotaTimer` below.
func (o TunnelQuotaTimerOutput) QuotaTimers() TunnelQuotaTimerQuotaTimerArrayOutput {
	return o.ApplyT(func(v *TunnelQuotaTimer) TunnelQuotaTimerQuotaTimerArrayOutput { return v.QuotaTimers }).(TunnelQuotaTimerQuotaTimerArrayOutput)
}

// Time zone, reference: Asia/Shanghai
// In general, the system will automatically generate the time zone according to the region without configuration.
func (o TunnelQuotaTimerOutput) TimeZone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TunnelQuotaTimer) pulumi.StringPtrOutput { return v.TimeZone }).(pulumi.StringPtrOutput)
}

type TunnelQuotaTimerArrayOutput struct{ *pulumi.OutputState }

func (TunnelQuotaTimerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TunnelQuotaTimer)(nil)).Elem()
}

func (o TunnelQuotaTimerArrayOutput) ToTunnelQuotaTimerArrayOutput() TunnelQuotaTimerArrayOutput {
	return o
}

func (o TunnelQuotaTimerArrayOutput) ToTunnelQuotaTimerArrayOutputWithContext(ctx context.Context) TunnelQuotaTimerArrayOutput {
	return o
}

func (o TunnelQuotaTimerArrayOutput) Index(i pulumi.IntInput) TunnelQuotaTimerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TunnelQuotaTimer {
		return vs[0].([]*TunnelQuotaTimer)[vs[1].(int)]
	}).(TunnelQuotaTimerOutput)
}

type TunnelQuotaTimerMapOutput struct{ *pulumi.OutputState }

func (TunnelQuotaTimerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TunnelQuotaTimer)(nil)).Elem()
}

func (o TunnelQuotaTimerMapOutput) ToTunnelQuotaTimerMapOutput() TunnelQuotaTimerMapOutput {
	return o
}

func (o TunnelQuotaTimerMapOutput) ToTunnelQuotaTimerMapOutputWithContext(ctx context.Context) TunnelQuotaTimerMapOutput {
	return o
}

func (o TunnelQuotaTimerMapOutput) MapIndex(k pulumi.StringInput) TunnelQuotaTimerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TunnelQuotaTimer {
		return vs[0].(map[string]*TunnelQuotaTimer)[vs[1].(string)]
	}).(TunnelQuotaTimerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TunnelQuotaTimerInput)(nil)).Elem(), &TunnelQuotaTimer{})
	pulumi.RegisterInputType(reflect.TypeOf((*TunnelQuotaTimerArrayInput)(nil)).Elem(), TunnelQuotaTimerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TunnelQuotaTimerMapInput)(nil)).Elem(), TunnelQuotaTimerMap{})
	pulumi.RegisterOutputType(TunnelQuotaTimerOutput{})
	pulumi.RegisterOutputType(TunnelQuotaTimerArrayOutput{})
	pulumi.RegisterOutputType(TunnelQuotaTimerMapOutput{})
}
