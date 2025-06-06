// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package alb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Application Load Balancer (ALB) Rule resource.
//
// For information about Application Load Balancer (ALB) Rule and how to use it, see [What is Rule](https://www.alibabacloud.com/help/en/slb/application-load-balancer/developer-reference/api-alb-2020-06-16-createrule).
//
// > **NOTE:** Available since v1.133.0.
//
// > **NOTE:** This version only supports forwarding rules in the request direction.
//
// ## Import
//
// Application Load Balancer (ALB) Rule can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:alb/rule:Rule example <id>
// ```
type Rule struct {
	pulumi.CustomResourceState

	// The direction to which the forwarding rule is applied. Default value: `Request`. Valid values:
	// - `Request`: The forwarding rule is applied to the client requests received by ALB.
	// - `Response`: The forwarding rule is applied to the responses returned by backend servers.
	Direction pulumi.StringOutput `pulumi:"direction"`
	// Specifies whether to precheck this request.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// The ID of the listener to which the forwarding rule belongs.
	ListenerId pulumi.StringOutput `pulumi:"listenerId"`
	// The priority of the rule. Valid values: 1 to 10000. A smaller value indicates a higher priority. **Note*:* The priority of each rule within the same listener must be unique.
	Priority pulumi.IntOutput `pulumi:"priority"`
	// The actions of the forwarding rules. See `ruleActions` below.
	RuleActions RuleRuleActionArrayOutput `pulumi:"ruleActions"`
	// The conditions of the forwarding rule. See `ruleConditions` below.
	RuleConditions RuleRuleConditionArrayOutput `pulumi:"ruleConditions"`
	// The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
	RuleName pulumi.StringOutput `pulumi:"ruleName"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewRule registers a new resource with the given unique name, arguments, and options.
func NewRule(ctx *pulumi.Context,
	name string, args *RuleArgs, opts ...pulumi.ResourceOption) (*Rule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ListenerId == nil {
		return nil, errors.New("invalid value for required argument 'ListenerId'")
	}
	if args.Priority == nil {
		return nil, errors.New("invalid value for required argument 'Priority'")
	}
	if args.RuleActions == nil {
		return nil, errors.New("invalid value for required argument 'RuleActions'")
	}
	if args.RuleConditions == nil {
		return nil, errors.New("invalid value for required argument 'RuleConditions'")
	}
	if args.RuleName == nil {
		return nil, errors.New("invalid value for required argument 'RuleName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Rule
	err := ctx.RegisterResource("alicloud:alb/rule:Rule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRule gets an existing Rule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RuleState, opts ...pulumi.ResourceOption) (*Rule, error) {
	var resource Rule
	err := ctx.ReadResource("alicloud:alb/rule:Rule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Rule resources.
type ruleState struct {
	// The direction to which the forwarding rule is applied. Default value: `Request`. Valid values:
	// - `Request`: The forwarding rule is applied to the client requests received by ALB.
	// - `Response`: The forwarding rule is applied to the responses returned by backend servers.
	Direction *string `pulumi:"direction"`
	// Specifies whether to precheck this request.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the listener to which the forwarding rule belongs.
	ListenerId *string `pulumi:"listenerId"`
	// The priority of the rule. Valid values: 1 to 10000. A smaller value indicates a higher priority. **Note*:* The priority of each rule within the same listener must be unique.
	Priority *int `pulumi:"priority"`
	// The actions of the forwarding rules. See `ruleActions` below.
	RuleActions []RuleRuleAction `pulumi:"ruleActions"`
	// The conditions of the forwarding rule. See `ruleConditions` below.
	RuleConditions []RuleRuleCondition `pulumi:"ruleConditions"`
	// The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
	RuleName *string `pulumi:"ruleName"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

type RuleState struct {
	// The direction to which the forwarding rule is applied. Default value: `Request`. Valid values:
	// - `Request`: The forwarding rule is applied to the client requests received by ALB.
	// - `Response`: The forwarding rule is applied to the responses returned by backend servers.
	Direction pulumi.StringPtrInput
	// Specifies whether to precheck this request.
	DryRun pulumi.BoolPtrInput
	// The ID of the listener to which the forwarding rule belongs.
	ListenerId pulumi.StringPtrInput
	// The priority of the rule. Valid values: 1 to 10000. A smaller value indicates a higher priority. **Note*:* The priority of each rule within the same listener must be unique.
	Priority pulumi.IntPtrInput
	// The actions of the forwarding rules. See `ruleActions` below.
	RuleActions RuleRuleActionArrayInput
	// The conditions of the forwarding rule. See `ruleConditions` below.
	RuleConditions RuleRuleConditionArrayInput
	// The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
	RuleName pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
}

func (RuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleState)(nil)).Elem()
}

type ruleArgs struct {
	// The direction to which the forwarding rule is applied. Default value: `Request`. Valid values:
	// - `Request`: The forwarding rule is applied to the client requests received by ALB.
	// - `Response`: The forwarding rule is applied to the responses returned by backend servers.
	Direction *string `pulumi:"direction"`
	// Specifies whether to precheck this request.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the listener to which the forwarding rule belongs.
	ListenerId string `pulumi:"listenerId"`
	// The priority of the rule. Valid values: 1 to 10000. A smaller value indicates a higher priority. **Note*:* The priority of each rule within the same listener must be unique.
	Priority int `pulumi:"priority"`
	// The actions of the forwarding rules. See `ruleActions` below.
	RuleActions []RuleRuleAction `pulumi:"ruleActions"`
	// The conditions of the forwarding rule. See `ruleConditions` below.
	RuleConditions []RuleRuleCondition `pulumi:"ruleConditions"`
	// The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
	RuleName string `pulumi:"ruleName"`
}

// The set of arguments for constructing a Rule resource.
type RuleArgs struct {
	// The direction to which the forwarding rule is applied. Default value: `Request`. Valid values:
	// - `Request`: The forwarding rule is applied to the client requests received by ALB.
	// - `Response`: The forwarding rule is applied to the responses returned by backend servers.
	Direction pulumi.StringPtrInput
	// Specifies whether to precheck this request.
	DryRun pulumi.BoolPtrInput
	// The ID of the listener to which the forwarding rule belongs.
	ListenerId pulumi.StringInput
	// The priority of the rule. Valid values: 1 to 10000. A smaller value indicates a higher priority. **Note*:* The priority of each rule within the same listener must be unique.
	Priority pulumi.IntInput
	// The actions of the forwarding rules. See `ruleActions` below.
	RuleActions RuleRuleActionArrayInput
	// The conditions of the forwarding rule. See `ruleConditions` below.
	RuleConditions RuleRuleConditionArrayInput
	// The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
	RuleName pulumi.StringInput
}

func (RuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleArgs)(nil)).Elem()
}

type RuleInput interface {
	pulumi.Input

	ToRuleOutput() RuleOutput
	ToRuleOutputWithContext(ctx context.Context) RuleOutput
}

func (*Rule) ElementType() reflect.Type {
	return reflect.TypeOf((**Rule)(nil)).Elem()
}

func (i *Rule) ToRuleOutput() RuleOutput {
	return i.ToRuleOutputWithContext(context.Background())
}

func (i *Rule) ToRuleOutputWithContext(ctx context.Context) RuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleOutput)
}

// RuleArrayInput is an input type that accepts RuleArray and RuleArrayOutput values.
// You can construct a concrete instance of `RuleArrayInput` via:
//
//	RuleArray{ RuleArgs{...} }
type RuleArrayInput interface {
	pulumi.Input

	ToRuleArrayOutput() RuleArrayOutput
	ToRuleArrayOutputWithContext(context.Context) RuleArrayOutput
}

type RuleArray []RuleInput

func (RuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rule)(nil)).Elem()
}

func (i RuleArray) ToRuleArrayOutput() RuleArrayOutput {
	return i.ToRuleArrayOutputWithContext(context.Background())
}

func (i RuleArray) ToRuleArrayOutputWithContext(ctx context.Context) RuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleArrayOutput)
}

// RuleMapInput is an input type that accepts RuleMap and RuleMapOutput values.
// You can construct a concrete instance of `RuleMapInput` via:
//
//	RuleMap{ "key": RuleArgs{...} }
type RuleMapInput interface {
	pulumi.Input

	ToRuleMapOutput() RuleMapOutput
	ToRuleMapOutputWithContext(context.Context) RuleMapOutput
}

type RuleMap map[string]RuleInput

func (RuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rule)(nil)).Elem()
}

func (i RuleMap) ToRuleMapOutput() RuleMapOutput {
	return i.ToRuleMapOutputWithContext(context.Background())
}

func (i RuleMap) ToRuleMapOutputWithContext(ctx context.Context) RuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleMapOutput)
}

type RuleOutput struct{ *pulumi.OutputState }

func (RuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Rule)(nil)).Elem()
}

func (o RuleOutput) ToRuleOutput() RuleOutput {
	return o
}

func (o RuleOutput) ToRuleOutputWithContext(ctx context.Context) RuleOutput {
	return o
}

// The direction to which the forwarding rule is applied. Default value: `Request`. Valid values:
// - `Request`: The forwarding rule is applied to the client requests received by ALB.
// - `Response`: The forwarding rule is applied to the responses returned by backend servers.
func (o RuleOutput) Direction() pulumi.StringOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringOutput { return v.Direction }).(pulumi.StringOutput)
}

// Specifies whether to precheck this request.
func (o RuleOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Rule) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// The ID of the listener to which the forwarding rule belongs.
func (o RuleOutput) ListenerId() pulumi.StringOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringOutput { return v.ListenerId }).(pulumi.StringOutput)
}

// The priority of the rule. Valid values: 1 to 10000. A smaller value indicates a higher priority. **Note*:* The priority of each rule within the same listener must be unique.
func (o RuleOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v *Rule) pulumi.IntOutput { return v.Priority }).(pulumi.IntOutput)
}

// The actions of the forwarding rules. See `ruleActions` below.
func (o RuleOutput) RuleActions() RuleRuleActionArrayOutput {
	return o.ApplyT(func(v *Rule) RuleRuleActionArrayOutput { return v.RuleActions }).(RuleRuleActionArrayOutput)
}

// The conditions of the forwarding rule. See `ruleConditions` below.
func (o RuleOutput) RuleConditions() RuleRuleConditionArrayOutput {
	return o.ApplyT(func(v *Rule) RuleRuleConditionArrayOutput { return v.RuleConditions }).(RuleRuleConditionArrayOutput)
}

// The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
func (o RuleOutput) RuleName() pulumi.StringOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringOutput { return v.RuleName }).(pulumi.StringOutput)
}

// The status of the resource.
func (o RuleOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type RuleArrayOutput struct{ *pulumi.OutputState }

func (RuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rule)(nil)).Elem()
}

func (o RuleArrayOutput) ToRuleArrayOutput() RuleArrayOutput {
	return o
}

func (o RuleArrayOutput) ToRuleArrayOutputWithContext(ctx context.Context) RuleArrayOutput {
	return o
}

func (o RuleArrayOutput) Index(i pulumi.IntInput) RuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Rule {
		return vs[0].([]*Rule)[vs[1].(int)]
	}).(RuleOutput)
}

type RuleMapOutput struct{ *pulumi.OutputState }

func (RuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rule)(nil)).Elem()
}

func (o RuleMapOutput) ToRuleMapOutput() RuleMapOutput {
	return o
}

func (o RuleMapOutput) ToRuleMapOutputWithContext(ctx context.Context) RuleMapOutput {
	return o
}

func (o RuleMapOutput) MapIndex(k pulumi.StringInput) RuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Rule {
		return vs[0].(map[string]*Rule)[vs[1].(string)]
	}).(RuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RuleInput)(nil)).Elem(), &Rule{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleArrayInput)(nil)).Elem(), RuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleMapInput)(nil)).Elem(), RuleMap{})
	pulumi.RegisterOutputType(RuleOutput{})
	pulumi.RegisterOutputType(RuleArrayOutput{})
	pulumi.RegisterOutputType(RuleMapOutput{})
}
