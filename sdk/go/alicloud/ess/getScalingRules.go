// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ess

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides available scaling rule resources.
//
// > **NOTE:** Available since v1.39.0
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ess"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-ex"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultInteger, err := random.NewInteger(ctx, "default", &random.IntegerArgs{
//				Min: 10000,
//				Max: 99999,
//			})
//			if err != nil {
//				return err
//			}
//			myName := fmt.Sprintf("%v-%v", name, defaultInteger.Result)
//			_default, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableDiskCategory:     pulumi.StringRef("cloud_efficiency"),
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "default", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(myName),
//				CidrBlock: pulumi.String("172.16.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "default", &vpc.SwitchArgs{
//				VpcId:       defaultNetwork.ID(),
//				CidrBlock:   pulumi.String("172.16.0.0/24"),
//				ZoneId:      pulumi.String(_default.Zones[0].Id),
//				VswitchName: pulumi.String(myName),
//			})
//			if err != nil {
//				return err
//			}
//			defaultScalingGroup, err := ess.NewScalingGroup(ctx, "default", &ess.ScalingGroupArgs{
//				MinSize:          pulumi.Int(1),
//				MaxSize:          pulumi.Int(1),
//				ScalingGroupName: pulumi.String(myName),
//				RemovalPolicies: pulumi.StringArray{
//					pulumi.String("OldestInstance"),
//					pulumi.String("NewestInstance"),
//				},
//				VswitchIds: pulumi.StringArray{
//					defaultSwitch.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			defaultScalingRule, err := ess.NewScalingRule(ctx, "default", &ess.ScalingRuleArgs{
//				ScalingGroupId:  defaultScalingGroup.ID(),
//				ScalingRuleName: pulumi.String(myName),
//				AdjustmentType:  pulumi.String("PercentChangeInCapacity"),
//				AdjustmentValue: pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			scalingrulesDs := ess.GetScalingRulesOutput(ctx, ess.GetScalingRulesOutputArgs{
//				ScalingGroupId: defaultScalingGroup.ID(),
//				Ids: pulumi.StringArray{
//					defaultScalingRule.ID(),
//				},
//				NameRegex: pulumi.String(myName),
//			}, nil)
//			ctx.Export("firstScalingRule", scalingrulesDs.ApplyT(func(scalingrulesDs ess.GetScalingRulesResult) (*string, error) {
//				return &scalingrulesDs.Rules[0].Id, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
func GetScalingRules(ctx *pulumi.Context, args *GetScalingRulesArgs, opts ...pulumi.InvokeOption) (*GetScalingRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetScalingRulesResult
	err := ctx.Invoke("alicloud:ess/getScalingRules:getScalingRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getScalingRules.
type GetScalingRulesArgs struct {
	// A list of scaling rule IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter resulting scaling rules by name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Scaling group id the scaling rules belong to.
	ScalingGroupId *string `pulumi:"scalingGroupId"`
	// Type of scaling rule.
	Type *string `pulumi:"type"`
}

// A collection of values returned by getScalingRules.
type GetScalingRulesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of scaling rule ids.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of scaling rule names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of scaling rules. Each element contains the following attributes:
	Rules []GetScalingRulesRule `pulumi:"rules"`
	// ID of the scaling group.
	ScalingGroupId *string `pulumi:"scalingGroupId"`
	// Type of the scaling rule.
	Type *string `pulumi:"type"`
}

func GetScalingRulesOutput(ctx *pulumi.Context, args GetScalingRulesOutputArgs, opts ...pulumi.InvokeOption) GetScalingRulesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetScalingRulesResultOutput, error) {
			args := v.(GetScalingRulesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:ess/getScalingRules:getScalingRules", args, GetScalingRulesResultOutput{}, options).(GetScalingRulesResultOutput), nil
		}).(GetScalingRulesResultOutput)
}

// A collection of arguments for invoking getScalingRules.
type GetScalingRulesOutputArgs struct {
	// A list of scaling rule IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter resulting scaling rules by name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Scaling group id the scaling rules belong to.
	ScalingGroupId pulumi.StringPtrInput `pulumi:"scalingGroupId"`
	// Type of scaling rule.
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (GetScalingRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetScalingRulesArgs)(nil)).Elem()
}

// A collection of values returned by getScalingRules.
type GetScalingRulesResultOutput struct{ *pulumi.OutputState }

func (GetScalingRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetScalingRulesResult)(nil)).Elem()
}

func (o GetScalingRulesResultOutput) ToGetScalingRulesResultOutput() GetScalingRulesResultOutput {
	return o
}

func (o GetScalingRulesResultOutput) ToGetScalingRulesResultOutputWithContext(ctx context.Context) GetScalingRulesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetScalingRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetScalingRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of scaling rule ids.
func (o GetScalingRulesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetScalingRulesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetScalingRulesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetScalingRulesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of scaling rule names.
func (o GetScalingRulesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetScalingRulesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetScalingRulesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetScalingRulesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of scaling rules. Each element contains the following attributes:
func (o GetScalingRulesResultOutput) Rules() GetScalingRulesRuleArrayOutput {
	return o.ApplyT(func(v GetScalingRulesResult) []GetScalingRulesRule { return v.Rules }).(GetScalingRulesRuleArrayOutput)
}

// ID of the scaling group.
func (o GetScalingRulesResultOutput) ScalingGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetScalingRulesResult) *string { return v.ScalingGroupId }).(pulumi.StringPtrOutput)
}

// Type of the scaling rule.
func (o GetScalingRulesResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetScalingRulesResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetScalingRulesResultOutput{})
}
