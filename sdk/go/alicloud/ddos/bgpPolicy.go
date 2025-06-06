// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ddos

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Ddos Bgp Policy resource.
//
// Ddos protection policy.
//
// For information about Ddos Bgp Policy and how to use it, see [What is Policy](https://www.alibabacloud.com/help/en/anti-ddos/anti-ddos-origin/developer-reference/api-ddosbgp-2018-07-20-createpolicy).
//
// > **NOTE:** Available since v1.226.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ddos"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf_exampleacc_bgp32594"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			policyName := "example_l4_policy"
//			if param := cfg.Get("policyName"); param != "" {
//				policyName = param
//			}
//			_, err := ddos.NewBgpPolicy(ctx, "default", &ddos.BgpPolicyArgs{
//				Content: &ddos.BgpPolicyContentArgs{
//					EnableDefense: pulumi.Bool(false),
//					Layer4RuleLists: ddos.BgpPolicyContentLayer4RuleListArray{
//						&ddos.BgpPolicyContentLayer4RuleListArgs{
//							Method:  pulumi.String("hex"),
//							Match:   pulumi.String("1"),
//							Action:  pulumi.String("1"),
//							Limited: pulumi.Int(0),
//							ConditionLists: ddos.BgpPolicyContentLayer4RuleListConditionListArray{
//								&ddos.BgpPolicyContentLayer4RuleListConditionListArgs{
//									Arg:      pulumi.String("3C"),
//									Position: pulumi.Int(1),
//									Depth:    pulumi.Int(2),
//								},
//							},
//							Name:     pulumi.String("11"),
//							Priority: pulumi.Int(10),
//						},
//					},
//				},
//				Type:       pulumi.String("l4"),
//				PolicyName: pulumi.String("tf_exampleacc_bgp32594"),
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
// Ddos Bgp Policy can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ddos/bgpPolicy:BgpPolicy example <id>
// ```
type BgpPolicy struct {
	pulumi.CustomResourceState

	// Configuration Content See `content` below.
	Content BgpPolicyContentOutput `pulumi:"content"`
	// The name of the resource
	PolicyName pulumi.StringOutput `pulumi:"policyName"`
	// Type
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewBgpPolicy registers a new resource with the given unique name, arguments, and options.
func NewBgpPolicy(ctx *pulumi.Context,
	name string, args *BgpPolicyArgs, opts ...pulumi.ResourceOption) (*BgpPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyName == nil {
		return nil, errors.New("invalid value for required argument 'PolicyName'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BgpPolicy
	err := ctx.RegisterResource("alicloud:ddos/bgpPolicy:BgpPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBgpPolicy gets an existing BgpPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBgpPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BgpPolicyState, opts ...pulumi.ResourceOption) (*BgpPolicy, error) {
	var resource BgpPolicy
	err := ctx.ReadResource("alicloud:ddos/bgpPolicy:BgpPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BgpPolicy resources.
type bgpPolicyState struct {
	// Configuration Content See `content` below.
	Content *BgpPolicyContent `pulumi:"content"`
	// The name of the resource
	PolicyName *string `pulumi:"policyName"`
	// Type
	Type *string `pulumi:"type"`
}

type BgpPolicyState struct {
	// Configuration Content See `content` below.
	Content BgpPolicyContentPtrInput
	// The name of the resource
	PolicyName pulumi.StringPtrInput
	// Type
	Type pulumi.StringPtrInput
}

func (BgpPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*bgpPolicyState)(nil)).Elem()
}

type bgpPolicyArgs struct {
	// Configuration Content See `content` below.
	Content *BgpPolicyContent `pulumi:"content"`
	// The name of the resource
	PolicyName string `pulumi:"policyName"`
	// Type
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a BgpPolicy resource.
type BgpPolicyArgs struct {
	// Configuration Content See `content` below.
	Content BgpPolicyContentPtrInput
	// The name of the resource
	PolicyName pulumi.StringInput
	// Type
	Type pulumi.StringInput
}

func (BgpPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bgpPolicyArgs)(nil)).Elem()
}

type BgpPolicyInput interface {
	pulumi.Input

	ToBgpPolicyOutput() BgpPolicyOutput
	ToBgpPolicyOutputWithContext(ctx context.Context) BgpPolicyOutput
}

func (*BgpPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**BgpPolicy)(nil)).Elem()
}

func (i *BgpPolicy) ToBgpPolicyOutput() BgpPolicyOutput {
	return i.ToBgpPolicyOutputWithContext(context.Background())
}

func (i *BgpPolicy) ToBgpPolicyOutputWithContext(ctx context.Context) BgpPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpPolicyOutput)
}

// BgpPolicyArrayInput is an input type that accepts BgpPolicyArray and BgpPolicyArrayOutput values.
// You can construct a concrete instance of `BgpPolicyArrayInput` via:
//
//	BgpPolicyArray{ BgpPolicyArgs{...} }
type BgpPolicyArrayInput interface {
	pulumi.Input

	ToBgpPolicyArrayOutput() BgpPolicyArrayOutput
	ToBgpPolicyArrayOutputWithContext(context.Context) BgpPolicyArrayOutput
}

type BgpPolicyArray []BgpPolicyInput

func (BgpPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BgpPolicy)(nil)).Elem()
}

func (i BgpPolicyArray) ToBgpPolicyArrayOutput() BgpPolicyArrayOutput {
	return i.ToBgpPolicyArrayOutputWithContext(context.Background())
}

func (i BgpPolicyArray) ToBgpPolicyArrayOutputWithContext(ctx context.Context) BgpPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpPolicyArrayOutput)
}

// BgpPolicyMapInput is an input type that accepts BgpPolicyMap and BgpPolicyMapOutput values.
// You can construct a concrete instance of `BgpPolicyMapInput` via:
//
//	BgpPolicyMap{ "key": BgpPolicyArgs{...} }
type BgpPolicyMapInput interface {
	pulumi.Input

	ToBgpPolicyMapOutput() BgpPolicyMapOutput
	ToBgpPolicyMapOutputWithContext(context.Context) BgpPolicyMapOutput
}

type BgpPolicyMap map[string]BgpPolicyInput

func (BgpPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BgpPolicy)(nil)).Elem()
}

func (i BgpPolicyMap) ToBgpPolicyMapOutput() BgpPolicyMapOutput {
	return i.ToBgpPolicyMapOutputWithContext(context.Background())
}

func (i BgpPolicyMap) ToBgpPolicyMapOutputWithContext(ctx context.Context) BgpPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpPolicyMapOutput)
}

type BgpPolicyOutput struct{ *pulumi.OutputState }

func (BgpPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BgpPolicy)(nil)).Elem()
}

func (o BgpPolicyOutput) ToBgpPolicyOutput() BgpPolicyOutput {
	return o
}

func (o BgpPolicyOutput) ToBgpPolicyOutputWithContext(ctx context.Context) BgpPolicyOutput {
	return o
}

// Configuration Content See `content` below.
func (o BgpPolicyOutput) Content() BgpPolicyContentOutput {
	return o.ApplyT(func(v *BgpPolicy) BgpPolicyContentOutput { return v.Content }).(BgpPolicyContentOutput)
}

// The name of the resource
func (o BgpPolicyOutput) PolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v *BgpPolicy) pulumi.StringOutput { return v.PolicyName }).(pulumi.StringOutput)
}

// Type
func (o BgpPolicyOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *BgpPolicy) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type BgpPolicyArrayOutput struct{ *pulumi.OutputState }

func (BgpPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BgpPolicy)(nil)).Elem()
}

func (o BgpPolicyArrayOutput) ToBgpPolicyArrayOutput() BgpPolicyArrayOutput {
	return o
}

func (o BgpPolicyArrayOutput) ToBgpPolicyArrayOutputWithContext(ctx context.Context) BgpPolicyArrayOutput {
	return o
}

func (o BgpPolicyArrayOutput) Index(i pulumi.IntInput) BgpPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BgpPolicy {
		return vs[0].([]*BgpPolicy)[vs[1].(int)]
	}).(BgpPolicyOutput)
}

type BgpPolicyMapOutput struct{ *pulumi.OutputState }

func (BgpPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BgpPolicy)(nil)).Elem()
}

func (o BgpPolicyMapOutput) ToBgpPolicyMapOutput() BgpPolicyMapOutput {
	return o
}

func (o BgpPolicyMapOutput) ToBgpPolicyMapOutputWithContext(ctx context.Context) BgpPolicyMapOutput {
	return o
}

func (o BgpPolicyMapOutput) MapIndex(k pulumi.StringInput) BgpPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BgpPolicy {
		return vs[0].(map[string]*BgpPolicy)[vs[1].(string)]
	}).(BgpPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BgpPolicyInput)(nil)).Elem(), &BgpPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*BgpPolicyArrayInput)(nil)).Elem(), BgpPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BgpPolicyMapInput)(nil)).Elem(), BgpPolicyMap{})
	pulumi.RegisterOutputType(BgpPolicyOutput{})
	pulumi.RegisterOutputType(BgpPolicyArrayOutput{})
	pulumi.RegisterOutputType(BgpPolicyMapOutput{})
}
