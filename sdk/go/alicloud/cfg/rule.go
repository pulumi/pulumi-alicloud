// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cfg

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a a Alicloud Config Rule resource. Cloud Config checks the validity of resources based on rules. You can create rules to evaluate resources as needed.
// For information about Alicloud Config Rule and how to use it, see [What is Alicloud Config Rule](https://www.alibabacloud.com/help/en/doc-detail/127388.htm).
//
// > **NOTE:** Available in v1.99.0+.
//
// > **NOTE:** The Cloud Config region only support `cn-shanghai` and `ap-northeast-1`.
//
// > **NOTE:** If you use custom rules, you need to create your own rule functions in advance. Please refer to the link for [Create a custom rule.](https://www.alibabacloud.com/help/en/doc-detail/127405.htm)
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/cfg"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cfg.NewRule(ctx, "example", &cfg.RuleArgs{
// 			Description: pulumi.String("ecs instances in vpc"),
// 			InputParameters: pulumi.StringMap{
// 				"vpcIds": pulumi.String("vpc-uf6gksw4ctjd******"),
// 			},
// 			RiskLevel:                 pulumi.Int(1),
// 			RuleName:                  pulumi.String("instances-in-vpc"),
// 			ScopeComplianceResourceId: pulumi.String("i-uf6j6rl141ps******"),
// 			ScopeComplianceResourceTypes: pulumi.StringArray{
// 				pulumi.String("ACS::ECS::Instance"),
// 			},
// 			SourceDetailMessageType:         pulumi.String("ConfigurationItemChangeNotification"),
// 			SourceIdentifier:                pulumi.String("ecs-instances-in-vpc"),
// 			SourceMaximumExecutionFrequency: pulumi.String("Twelve_Hours"),
// 			SourceOwner:                     pulumi.String("ALIYUN"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Rule struct {
	pulumi.CustomResourceState

	// The description of the Config Rule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Threshold value for managed rule triggering.
	InputParameters pulumi.MapOutput `pulumi:"inputParameters"`
	// The ID of the member account to which the rule to be created or modified belongs. The default is empty. When `multiAccount` is set to true, this parameter is valid.
	MemberId pulumi.IntPtrOutput `pulumi:"memberId"`
	// Whether the enterprise management account is a member account to create or modify rules. Valid values: `true`: Enterprise management accounts create or modify rules for all member accounts in the resource directory. `false`:The enterprise management account creates or modifies rules for this account. Default value is `false`.
	MultiAccount pulumi.BoolPtrOutput `pulumi:"multiAccount"`
	// The risk level of the Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
	RiskLevel pulumi.IntOutput `pulumi:"riskLevel"`
	// The name of the Config Rule.
	RuleName pulumi.StringOutput `pulumi:"ruleName"`
	// The ID of the resource to be evaluated. If not set, all resources are evaluated.
	ScopeComplianceResourceId pulumi.StringPtrOutput `pulumi:"scopeComplianceResourceId"`
	// Resource types to be evaluated. [Alibaba Cloud services that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
	ScopeComplianceResourceTypes pulumi.StringArrayOutput `pulumi:"scopeComplianceResourceTypes"`
	// Trigger mechanism of rules. Valid values: `ConfigurationItemChangeNotification`,`OversizedConfigurationItemChangeNotification` and `ScheduledNotification`.
	SourceDetailMessageType pulumi.StringOutput `pulumi:"sourceDetailMessageType"`
	// The name of the custom rule or managed rules. Using managed rules, refer to [List of Managed rules.](https://www.alibabacloud.com/help/en/doc-detail/127404.htm)
	SourceIdentifier pulumi.StringOutput `pulumi:"sourceIdentifier"`
	// Rule execution cycle. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours` and `TwentyFour_Hours`.
	SourceMaximumExecutionFrequency pulumi.StringPtrOutput `pulumi:"sourceMaximumExecutionFrequency"`
	// The source owner of the Config Rule. Values: `CUSTOM_FC`: Custom rules, `ALIYUN`: Trusteeship rules.
	SourceOwner pulumi.StringOutput `pulumi:"sourceOwner"`
}

// NewRule registers a new resource with the given unique name, arguments, and options.
func NewRule(ctx *pulumi.Context,
	name string, args *RuleArgs, opts ...pulumi.ResourceOption) (*Rule, error) {
	if args == nil || args.RiskLevel == nil {
		return nil, errors.New("missing required argument 'RiskLevel'")
	}
	if args == nil || args.RuleName == nil {
		return nil, errors.New("missing required argument 'RuleName'")
	}
	if args == nil || args.ScopeComplianceResourceTypes == nil {
		return nil, errors.New("missing required argument 'ScopeComplianceResourceTypes'")
	}
	if args == nil || args.SourceDetailMessageType == nil {
		return nil, errors.New("missing required argument 'SourceDetailMessageType'")
	}
	if args == nil || args.SourceIdentifier == nil {
		return nil, errors.New("missing required argument 'SourceIdentifier'")
	}
	if args == nil || args.SourceOwner == nil {
		return nil, errors.New("missing required argument 'SourceOwner'")
	}
	if args == nil {
		args = &RuleArgs{}
	}
	var resource Rule
	err := ctx.RegisterResource("alicloud:cfg/rule:Rule", name, args, &resource, opts...)
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
	err := ctx.ReadResource("alicloud:cfg/rule:Rule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Rule resources.
type ruleState struct {
	// The description of the Config Rule.
	Description *string `pulumi:"description"`
	// Threshold value for managed rule triggering.
	InputParameters map[string]interface{} `pulumi:"inputParameters"`
	// The ID of the member account to which the rule to be created or modified belongs. The default is empty. When `multiAccount` is set to true, this parameter is valid.
	MemberId *int `pulumi:"memberId"`
	// Whether the enterprise management account is a member account to create or modify rules. Valid values: `true`: Enterprise management accounts create or modify rules for all member accounts in the resource directory. `false`:The enterprise management account creates or modifies rules for this account. Default value is `false`.
	MultiAccount *bool `pulumi:"multiAccount"`
	// The risk level of the Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
	RiskLevel *int `pulumi:"riskLevel"`
	// The name of the Config Rule.
	RuleName *string `pulumi:"ruleName"`
	// The ID of the resource to be evaluated. If not set, all resources are evaluated.
	ScopeComplianceResourceId *string `pulumi:"scopeComplianceResourceId"`
	// Resource types to be evaluated. [Alibaba Cloud services that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
	ScopeComplianceResourceTypes []string `pulumi:"scopeComplianceResourceTypes"`
	// Trigger mechanism of rules. Valid values: `ConfigurationItemChangeNotification`,`OversizedConfigurationItemChangeNotification` and `ScheduledNotification`.
	SourceDetailMessageType *string `pulumi:"sourceDetailMessageType"`
	// The name of the custom rule or managed rules. Using managed rules, refer to [List of Managed rules.](https://www.alibabacloud.com/help/en/doc-detail/127404.htm)
	SourceIdentifier *string `pulumi:"sourceIdentifier"`
	// Rule execution cycle. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours` and `TwentyFour_Hours`.
	SourceMaximumExecutionFrequency *string `pulumi:"sourceMaximumExecutionFrequency"`
	// The source owner of the Config Rule. Values: `CUSTOM_FC`: Custom rules, `ALIYUN`: Trusteeship rules.
	SourceOwner *string `pulumi:"sourceOwner"`
}

type RuleState struct {
	// The description of the Config Rule.
	Description pulumi.StringPtrInput
	// Threshold value for managed rule triggering.
	InputParameters pulumi.MapInput
	// The ID of the member account to which the rule to be created or modified belongs. The default is empty. When `multiAccount` is set to true, this parameter is valid.
	MemberId pulumi.IntPtrInput
	// Whether the enterprise management account is a member account to create or modify rules. Valid values: `true`: Enterprise management accounts create or modify rules for all member accounts in the resource directory. `false`:The enterprise management account creates or modifies rules for this account. Default value is `false`.
	MultiAccount pulumi.BoolPtrInput
	// The risk level of the Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
	RiskLevel pulumi.IntPtrInput
	// The name of the Config Rule.
	RuleName pulumi.StringPtrInput
	// The ID of the resource to be evaluated. If not set, all resources are evaluated.
	ScopeComplianceResourceId pulumi.StringPtrInput
	// Resource types to be evaluated. [Alibaba Cloud services that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
	ScopeComplianceResourceTypes pulumi.StringArrayInput
	// Trigger mechanism of rules. Valid values: `ConfigurationItemChangeNotification`,`OversizedConfigurationItemChangeNotification` and `ScheduledNotification`.
	SourceDetailMessageType pulumi.StringPtrInput
	// The name of the custom rule or managed rules. Using managed rules, refer to [List of Managed rules.](https://www.alibabacloud.com/help/en/doc-detail/127404.htm)
	SourceIdentifier pulumi.StringPtrInput
	// Rule execution cycle. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours` and `TwentyFour_Hours`.
	SourceMaximumExecutionFrequency pulumi.StringPtrInput
	// The source owner of the Config Rule. Values: `CUSTOM_FC`: Custom rules, `ALIYUN`: Trusteeship rules.
	SourceOwner pulumi.StringPtrInput
}

func (RuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleState)(nil)).Elem()
}

type ruleArgs struct {
	// The description of the Config Rule.
	Description *string `pulumi:"description"`
	// Threshold value for managed rule triggering.
	InputParameters map[string]interface{} `pulumi:"inputParameters"`
	// The ID of the member account to which the rule to be created or modified belongs. The default is empty. When `multiAccount` is set to true, this parameter is valid.
	MemberId *int `pulumi:"memberId"`
	// Whether the enterprise management account is a member account to create or modify rules. Valid values: `true`: Enterprise management accounts create or modify rules for all member accounts in the resource directory. `false`:The enterprise management account creates or modifies rules for this account. Default value is `false`.
	MultiAccount *bool `pulumi:"multiAccount"`
	// The risk level of the Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
	RiskLevel int `pulumi:"riskLevel"`
	// The name of the Config Rule.
	RuleName string `pulumi:"ruleName"`
	// The ID of the resource to be evaluated. If not set, all resources are evaluated.
	ScopeComplianceResourceId *string `pulumi:"scopeComplianceResourceId"`
	// Resource types to be evaluated. [Alibaba Cloud services that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
	ScopeComplianceResourceTypes []string `pulumi:"scopeComplianceResourceTypes"`
	// Trigger mechanism of rules. Valid values: `ConfigurationItemChangeNotification`,`OversizedConfigurationItemChangeNotification` and `ScheduledNotification`.
	SourceDetailMessageType string `pulumi:"sourceDetailMessageType"`
	// The name of the custom rule or managed rules. Using managed rules, refer to [List of Managed rules.](https://www.alibabacloud.com/help/en/doc-detail/127404.htm)
	SourceIdentifier string `pulumi:"sourceIdentifier"`
	// Rule execution cycle. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours` and `TwentyFour_Hours`.
	SourceMaximumExecutionFrequency *string `pulumi:"sourceMaximumExecutionFrequency"`
	// The source owner of the Config Rule. Values: `CUSTOM_FC`: Custom rules, `ALIYUN`: Trusteeship rules.
	SourceOwner string `pulumi:"sourceOwner"`
}

// The set of arguments for constructing a Rule resource.
type RuleArgs struct {
	// The description of the Config Rule.
	Description pulumi.StringPtrInput
	// Threshold value for managed rule triggering.
	InputParameters pulumi.MapInput
	// The ID of the member account to which the rule to be created or modified belongs. The default is empty. When `multiAccount` is set to true, this parameter is valid.
	MemberId pulumi.IntPtrInput
	// Whether the enterprise management account is a member account to create or modify rules. Valid values: `true`: Enterprise management accounts create or modify rules for all member accounts in the resource directory. `false`:The enterprise management account creates or modifies rules for this account. Default value is `false`.
	MultiAccount pulumi.BoolPtrInput
	// The risk level of the Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
	RiskLevel pulumi.IntInput
	// The name of the Config Rule.
	RuleName pulumi.StringInput
	// The ID of the resource to be evaluated. If not set, all resources are evaluated.
	ScopeComplianceResourceId pulumi.StringPtrInput
	// Resource types to be evaluated. [Alibaba Cloud services that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
	ScopeComplianceResourceTypes pulumi.StringArrayInput
	// Trigger mechanism of rules. Valid values: `ConfigurationItemChangeNotification`,`OversizedConfigurationItemChangeNotification` and `ScheduledNotification`.
	SourceDetailMessageType pulumi.StringInput
	// The name of the custom rule or managed rules. Using managed rules, refer to [List of Managed rules.](https://www.alibabacloud.com/help/en/doc-detail/127404.htm)
	SourceIdentifier pulumi.StringInput
	// Rule execution cycle. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours` and `TwentyFour_Hours`.
	SourceMaximumExecutionFrequency pulumi.StringPtrInput
	// The source owner of the Config Rule. Values: `CUSTOM_FC`: Custom rules, `ALIYUN`: Trusteeship rules.
	SourceOwner pulumi.StringInput
}

func (RuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleArgs)(nil)).Elem()
}