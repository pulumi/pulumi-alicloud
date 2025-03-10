// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package esa

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ESA Origin Rule resource.
//
// For information about ESA Origin Rule and how to use it, see [What is Origin Rule](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateOriginRule).
//
// > **NOTE:** Available since v1.244.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/esa"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := esa.GetSites(ctx, &esa.GetSitesArgs{
//				PlanSubscribeType: pulumi.StringRef("enterpriseplan"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = esa.NewOriginRule(ctx, "default", &esa.OriginRuleArgs{
//				OriginSni:       pulumi.String("origin.example.com"),
//				SiteId:          pulumi.Int(_default.Sites[0].Id),
//				OriginHost:      pulumi.String("origin.example.com"),
//				DnsRecord:       pulumi.String("tf.example.com"),
//				SiteVersion:     pulumi.Int(0),
//				RuleName:        pulumi.String("tf"),
//				OriginHttpsPort: pulumi.String("443"),
//				OriginScheme:    pulumi.String("http"),
//				Range:           pulumi.String("on"),
//				OriginHttpPort:  pulumi.String("8080"),
//				Rule:            pulumi.String("(http.host eq \"video.example.com\")"),
//				RuleEnable:      pulumi.String("on"),
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
// ESA Origin Rule can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:esa/originRule:OriginRule example <site_id>:<config_id>
// ```
type OriginRule struct {
	pulumi.CustomResourceState

	// Config Id
	ConfigId pulumi.IntOutput `pulumi:"configId"`
	// Overwrite the DNS resolution record of the origin request.
	DnsRecord pulumi.StringPtrOutput `pulumi:"dnsRecord"`
	// The HOST carried in the back-to-origin request.
	OriginHost pulumi.StringPtrOutput `pulumi:"originHost"`
	// The port of the origin station accessed when the HTTP protocol is used to return to the origin.
	OriginHttpPort pulumi.StringPtrOutput `pulumi:"originHttpPort"`
	// The port of the origin station accessed when the HTTPS protocol is used to return to the origin.
	OriginHttpsPort pulumi.StringPtrOutput `pulumi:"originHttpsPort"`
	// The protocol used by the back-to-origin request. Value range:
	OriginScheme pulumi.StringPtrOutput `pulumi:"originScheme"`
	// SNI carried in the back-to-origin request.
	OriginSni pulumi.StringPtrOutput `pulumi:"originSni"`
	// Use the range sharding method to download the file from the source. Value range:
	Range pulumi.StringPtrOutput `pulumi:"range"`
	// Rule Content.
	Rule pulumi.StringPtrOutput `pulumi:"rule"`
	// Rule switch. Value range:
	RuleEnable pulumi.StringPtrOutput `pulumi:"ruleEnable"`
	// Rule Name.
	RuleName pulumi.StringPtrOutput `pulumi:"ruleName"`
	// The site ID, which can be obtained by calling the ListSites API.
	SiteId pulumi.IntOutput `pulumi:"siteId"`
	// Version number of the site.
	SiteVersion pulumi.IntPtrOutput `pulumi:"siteVersion"`
}

// NewOriginRule registers a new resource with the given unique name, arguments, and options.
func NewOriginRule(ctx *pulumi.Context,
	name string, args *OriginRuleArgs, opts ...pulumi.ResourceOption) (*OriginRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SiteId == nil {
		return nil, errors.New("invalid value for required argument 'SiteId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OriginRule
	err := ctx.RegisterResource("alicloud:esa/originRule:OriginRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOriginRule gets an existing OriginRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOriginRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OriginRuleState, opts ...pulumi.ResourceOption) (*OriginRule, error) {
	var resource OriginRule
	err := ctx.ReadResource("alicloud:esa/originRule:OriginRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OriginRule resources.
type originRuleState struct {
	// Config Id
	ConfigId *int `pulumi:"configId"`
	// Overwrite the DNS resolution record of the origin request.
	DnsRecord *string `pulumi:"dnsRecord"`
	// The HOST carried in the back-to-origin request.
	OriginHost *string `pulumi:"originHost"`
	// The port of the origin station accessed when the HTTP protocol is used to return to the origin.
	OriginHttpPort *string `pulumi:"originHttpPort"`
	// The port of the origin station accessed when the HTTPS protocol is used to return to the origin.
	OriginHttpsPort *string `pulumi:"originHttpsPort"`
	// The protocol used by the back-to-origin request. Value range:
	OriginScheme *string `pulumi:"originScheme"`
	// SNI carried in the back-to-origin request.
	OriginSni *string `pulumi:"originSni"`
	// Use the range sharding method to download the file from the source. Value range:
	Range *string `pulumi:"range"`
	// Rule Content.
	Rule *string `pulumi:"rule"`
	// Rule switch. Value range:
	RuleEnable *string `pulumi:"ruleEnable"`
	// Rule Name.
	RuleName *string `pulumi:"ruleName"`
	// The site ID, which can be obtained by calling the ListSites API.
	SiteId *int `pulumi:"siteId"`
	// Version number of the site.
	SiteVersion *int `pulumi:"siteVersion"`
}

type OriginRuleState struct {
	// Config Id
	ConfigId pulumi.IntPtrInput
	// Overwrite the DNS resolution record of the origin request.
	DnsRecord pulumi.StringPtrInput
	// The HOST carried in the back-to-origin request.
	OriginHost pulumi.StringPtrInput
	// The port of the origin station accessed when the HTTP protocol is used to return to the origin.
	OriginHttpPort pulumi.StringPtrInput
	// The port of the origin station accessed when the HTTPS protocol is used to return to the origin.
	OriginHttpsPort pulumi.StringPtrInput
	// The protocol used by the back-to-origin request. Value range:
	OriginScheme pulumi.StringPtrInput
	// SNI carried in the back-to-origin request.
	OriginSni pulumi.StringPtrInput
	// Use the range sharding method to download the file from the source. Value range:
	Range pulumi.StringPtrInput
	// Rule Content.
	Rule pulumi.StringPtrInput
	// Rule switch. Value range:
	RuleEnable pulumi.StringPtrInput
	// Rule Name.
	RuleName pulumi.StringPtrInput
	// The site ID, which can be obtained by calling the ListSites API.
	SiteId pulumi.IntPtrInput
	// Version number of the site.
	SiteVersion pulumi.IntPtrInput
}

func (OriginRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*originRuleState)(nil)).Elem()
}

type originRuleArgs struct {
	// Overwrite the DNS resolution record of the origin request.
	DnsRecord *string `pulumi:"dnsRecord"`
	// The HOST carried in the back-to-origin request.
	OriginHost *string `pulumi:"originHost"`
	// The port of the origin station accessed when the HTTP protocol is used to return to the origin.
	OriginHttpPort *string `pulumi:"originHttpPort"`
	// The port of the origin station accessed when the HTTPS protocol is used to return to the origin.
	OriginHttpsPort *string `pulumi:"originHttpsPort"`
	// The protocol used by the back-to-origin request. Value range:
	OriginScheme *string `pulumi:"originScheme"`
	// SNI carried in the back-to-origin request.
	OriginSni *string `pulumi:"originSni"`
	// Use the range sharding method to download the file from the source. Value range:
	Range *string `pulumi:"range"`
	// Rule Content.
	Rule *string `pulumi:"rule"`
	// Rule switch. Value range:
	RuleEnable *string `pulumi:"ruleEnable"`
	// Rule Name.
	RuleName *string `pulumi:"ruleName"`
	// The site ID, which can be obtained by calling the ListSites API.
	SiteId int `pulumi:"siteId"`
	// Version number of the site.
	SiteVersion *int `pulumi:"siteVersion"`
}

// The set of arguments for constructing a OriginRule resource.
type OriginRuleArgs struct {
	// Overwrite the DNS resolution record of the origin request.
	DnsRecord pulumi.StringPtrInput
	// The HOST carried in the back-to-origin request.
	OriginHost pulumi.StringPtrInput
	// The port of the origin station accessed when the HTTP protocol is used to return to the origin.
	OriginHttpPort pulumi.StringPtrInput
	// The port of the origin station accessed when the HTTPS protocol is used to return to the origin.
	OriginHttpsPort pulumi.StringPtrInput
	// The protocol used by the back-to-origin request. Value range:
	OriginScheme pulumi.StringPtrInput
	// SNI carried in the back-to-origin request.
	OriginSni pulumi.StringPtrInput
	// Use the range sharding method to download the file from the source. Value range:
	Range pulumi.StringPtrInput
	// Rule Content.
	Rule pulumi.StringPtrInput
	// Rule switch. Value range:
	RuleEnable pulumi.StringPtrInput
	// Rule Name.
	RuleName pulumi.StringPtrInput
	// The site ID, which can be obtained by calling the ListSites API.
	SiteId pulumi.IntInput
	// Version number of the site.
	SiteVersion pulumi.IntPtrInput
}

func (OriginRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*originRuleArgs)(nil)).Elem()
}

type OriginRuleInput interface {
	pulumi.Input

	ToOriginRuleOutput() OriginRuleOutput
	ToOriginRuleOutputWithContext(ctx context.Context) OriginRuleOutput
}

func (*OriginRule) ElementType() reflect.Type {
	return reflect.TypeOf((**OriginRule)(nil)).Elem()
}

func (i *OriginRule) ToOriginRuleOutput() OriginRuleOutput {
	return i.ToOriginRuleOutputWithContext(context.Background())
}

func (i *OriginRule) ToOriginRuleOutputWithContext(ctx context.Context) OriginRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OriginRuleOutput)
}

// OriginRuleArrayInput is an input type that accepts OriginRuleArray and OriginRuleArrayOutput values.
// You can construct a concrete instance of `OriginRuleArrayInput` via:
//
//	OriginRuleArray{ OriginRuleArgs{...} }
type OriginRuleArrayInput interface {
	pulumi.Input

	ToOriginRuleArrayOutput() OriginRuleArrayOutput
	ToOriginRuleArrayOutputWithContext(context.Context) OriginRuleArrayOutput
}

type OriginRuleArray []OriginRuleInput

func (OriginRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OriginRule)(nil)).Elem()
}

func (i OriginRuleArray) ToOriginRuleArrayOutput() OriginRuleArrayOutput {
	return i.ToOriginRuleArrayOutputWithContext(context.Background())
}

func (i OriginRuleArray) ToOriginRuleArrayOutputWithContext(ctx context.Context) OriginRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OriginRuleArrayOutput)
}

// OriginRuleMapInput is an input type that accepts OriginRuleMap and OriginRuleMapOutput values.
// You can construct a concrete instance of `OriginRuleMapInput` via:
//
//	OriginRuleMap{ "key": OriginRuleArgs{...} }
type OriginRuleMapInput interface {
	pulumi.Input

	ToOriginRuleMapOutput() OriginRuleMapOutput
	ToOriginRuleMapOutputWithContext(context.Context) OriginRuleMapOutput
}

type OriginRuleMap map[string]OriginRuleInput

func (OriginRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OriginRule)(nil)).Elem()
}

func (i OriginRuleMap) ToOriginRuleMapOutput() OriginRuleMapOutput {
	return i.ToOriginRuleMapOutputWithContext(context.Background())
}

func (i OriginRuleMap) ToOriginRuleMapOutputWithContext(ctx context.Context) OriginRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OriginRuleMapOutput)
}

type OriginRuleOutput struct{ *pulumi.OutputState }

func (OriginRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OriginRule)(nil)).Elem()
}

func (o OriginRuleOutput) ToOriginRuleOutput() OriginRuleOutput {
	return o
}

func (o OriginRuleOutput) ToOriginRuleOutputWithContext(ctx context.Context) OriginRuleOutput {
	return o
}

// Config Id
func (o OriginRuleOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v *OriginRule) pulumi.IntOutput { return v.ConfigId }).(pulumi.IntOutput)
}

// Overwrite the DNS resolution record of the origin request.
func (o OriginRuleOutput) DnsRecord() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OriginRule) pulumi.StringPtrOutput { return v.DnsRecord }).(pulumi.StringPtrOutput)
}

// The HOST carried in the back-to-origin request.
func (o OriginRuleOutput) OriginHost() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OriginRule) pulumi.StringPtrOutput { return v.OriginHost }).(pulumi.StringPtrOutput)
}

// The port of the origin station accessed when the HTTP protocol is used to return to the origin.
func (o OriginRuleOutput) OriginHttpPort() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OriginRule) pulumi.StringPtrOutput { return v.OriginHttpPort }).(pulumi.StringPtrOutput)
}

// The port of the origin station accessed when the HTTPS protocol is used to return to the origin.
func (o OriginRuleOutput) OriginHttpsPort() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OriginRule) pulumi.StringPtrOutput { return v.OriginHttpsPort }).(pulumi.StringPtrOutput)
}

// The protocol used by the back-to-origin request. Value range:
func (o OriginRuleOutput) OriginScheme() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OriginRule) pulumi.StringPtrOutput { return v.OriginScheme }).(pulumi.StringPtrOutput)
}

// SNI carried in the back-to-origin request.
func (o OriginRuleOutput) OriginSni() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OriginRule) pulumi.StringPtrOutput { return v.OriginSni }).(pulumi.StringPtrOutput)
}

// Use the range sharding method to download the file from the source. Value range:
func (o OriginRuleOutput) Range() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OriginRule) pulumi.StringPtrOutput { return v.Range }).(pulumi.StringPtrOutput)
}

// Rule Content.
func (o OriginRuleOutput) Rule() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OriginRule) pulumi.StringPtrOutput { return v.Rule }).(pulumi.StringPtrOutput)
}

// Rule switch. Value range:
func (o OriginRuleOutput) RuleEnable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OriginRule) pulumi.StringPtrOutput { return v.RuleEnable }).(pulumi.StringPtrOutput)
}

// Rule Name.
func (o OriginRuleOutput) RuleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OriginRule) pulumi.StringPtrOutput { return v.RuleName }).(pulumi.StringPtrOutput)
}

// The site ID, which can be obtained by calling the ListSites API.
func (o OriginRuleOutput) SiteId() pulumi.IntOutput {
	return o.ApplyT(func(v *OriginRule) pulumi.IntOutput { return v.SiteId }).(pulumi.IntOutput)
}

// Version number of the site.
func (o OriginRuleOutput) SiteVersion() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OriginRule) pulumi.IntPtrOutput { return v.SiteVersion }).(pulumi.IntPtrOutput)
}

type OriginRuleArrayOutput struct{ *pulumi.OutputState }

func (OriginRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OriginRule)(nil)).Elem()
}

func (o OriginRuleArrayOutput) ToOriginRuleArrayOutput() OriginRuleArrayOutput {
	return o
}

func (o OriginRuleArrayOutput) ToOriginRuleArrayOutputWithContext(ctx context.Context) OriginRuleArrayOutput {
	return o
}

func (o OriginRuleArrayOutput) Index(i pulumi.IntInput) OriginRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OriginRule {
		return vs[0].([]*OriginRule)[vs[1].(int)]
	}).(OriginRuleOutput)
}

type OriginRuleMapOutput struct{ *pulumi.OutputState }

func (OriginRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OriginRule)(nil)).Elem()
}

func (o OriginRuleMapOutput) ToOriginRuleMapOutput() OriginRuleMapOutput {
	return o
}

func (o OriginRuleMapOutput) ToOriginRuleMapOutputWithContext(ctx context.Context) OriginRuleMapOutput {
	return o
}

func (o OriginRuleMapOutput) MapIndex(k pulumi.StringInput) OriginRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OriginRule {
		return vs[0].(map[string]*OriginRule)[vs[1].(string)]
	}).(OriginRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OriginRuleInput)(nil)).Elem(), &OriginRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*OriginRuleArrayInput)(nil)).Elem(), OriginRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OriginRuleMapInput)(nil)).Elem(), OriginRuleMap{})
	pulumi.RegisterOutputType(OriginRuleOutput{})
	pulumi.RegisterOutputType(OriginRuleArrayOutput{})
	pulumi.RegisterOutputType(OriginRuleMapOutput{})
}
