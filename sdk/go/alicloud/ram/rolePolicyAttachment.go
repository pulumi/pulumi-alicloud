// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a RAM Role Policy Attachment resource.
//
// For information about RAM Role Policy Attachment and how to use it, see [What is Role Policy Attachment](https://next.api.alibabacloud.com/document/Ram/2015-05-01/AttachPolicyToRole).
//
// > **NOTE:** Available since v1.0.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ram"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Create a RAM Role Policy attachment.
//			role, err := ram.NewRole(ctx, "role", &ram.RoleArgs{
//				Name: pulumi.String("roleName"),
//				Document: pulumi.String(`    {
//	      "Statement": [
//	        {
//	          "Action": "sts:AssumeRole",
//	          "Effect": "Allow",
//	          "Principal": {
//	            "Service": [
//	              "apigateway.aliyuncs.com",
//	              "ecs.aliyuncs.com"
//	            ]
//	          }
//	        }
//	      ],
//	      "Version": "1"
//	    }
//
// `),
//
//				Description: pulumi.String("this is a role test."),
//			})
//			if err != nil {
//				return err
//			}
//			_default, err := random.NewInteger(ctx, "default", &random.IntegerArgs{
//				Min: 10000,
//				Max: 99999,
//			})
//			if err != nil {
//				return err
//			}
//			policy, err := ram.NewPolicy(ctx, "policy", &ram.PolicyArgs{
//				PolicyName: pulumi.Sprintf("tf-example-%v", _default.Result),
//				PolicyDocument: pulumi.String(`  {
//	    "Statement": [
//	      {
//	        "Action": [
//	          "oss:ListObjects",
//	          "oss:GetObject"
//	        ],
//	        "Effect": "Allow",
//	        "Resource": [
//	          "acs:oss:*:*:mybucket",
//	          "acs:oss:*:*:mybucket/*"
//	        ]
//	      }
//	    ],
//	      "Version": "1"
//	  }
//
// `),
//
//				Description: pulumi.String("this is a policy test"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ram.NewRolePolicyAttachment(ctx, "attach", &ram.RolePolicyAttachmentArgs{
//				PolicyName: policy.PolicyName,
//				PolicyType: policy.Type,
//				RoleName:   role.Name,
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
// RAM Role Policy Attachment can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ram/rolePolicyAttachment:RolePolicyAttachment example role:<policy_name>:<policy_type>:<role_name>
// ```
type RolePolicyAttachment struct {
	pulumi.CustomResourceState

	// The name of the policy.
	PolicyName pulumi.StringOutput `pulumi:"policyName"`
	// Policy type.
	// - Custom: Custom policy.
	// - System: System policy.
	PolicyType pulumi.StringOutput `pulumi:"policyType"`
	// The RAM role name.
	RoleName pulumi.StringOutput `pulumi:"roleName"`
}

// NewRolePolicyAttachment registers a new resource with the given unique name, arguments, and options.
func NewRolePolicyAttachment(ctx *pulumi.Context,
	name string, args *RolePolicyAttachmentArgs, opts ...pulumi.ResourceOption) (*RolePolicyAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyName == nil {
		return nil, errors.New("invalid value for required argument 'PolicyName'")
	}
	if args.PolicyType == nil {
		return nil, errors.New("invalid value for required argument 'PolicyType'")
	}
	if args.RoleName == nil {
		return nil, errors.New("invalid value for required argument 'RoleName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RolePolicyAttachment
	err := ctx.RegisterResource("alicloud:ram/rolePolicyAttachment:RolePolicyAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRolePolicyAttachment gets an existing RolePolicyAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRolePolicyAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RolePolicyAttachmentState, opts ...pulumi.ResourceOption) (*RolePolicyAttachment, error) {
	var resource RolePolicyAttachment
	err := ctx.ReadResource("alicloud:ram/rolePolicyAttachment:RolePolicyAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RolePolicyAttachment resources.
type rolePolicyAttachmentState struct {
	// The name of the policy.
	PolicyName *string `pulumi:"policyName"`
	// Policy type.
	// - Custom: Custom policy.
	// - System: System policy.
	PolicyType *string `pulumi:"policyType"`
	// The RAM role name.
	RoleName *string `pulumi:"roleName"`
}

type RolePolicyAttachmentState struct {
	// The name of the policy.
	PolicyName pulumi.StringPtrInput
	// Policy type.
	// - Custom: Custom policy.
	// - System: System policy.
	PolicyType pulumi.StringPtrInput
	// The RAM role name.
	RoleName pulumi.StringPtrInput
}

func (RolePolicyAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*rolePolicyAttachmentState)(nil)).Elem()
}

type rolePolicyAttachmentArgs struct {
	// The name of the policy.
	PolicyName string `pulumi:"policyName"`
	// Policy type.
	// - Custom: Custom policy.
	// - System: System policy.
	PolicyType string `pulumi:"policyType"`
	// The RAM role name.
	RoleName string `pulumi:"roleName"`
}

// The set of arguments for constructing a RolePolicyAttachment resource.
type RolePolicyAttachmentArgs struct {
	// The name of the policy.
	PolicyName pulumi.StringInput
	// Policy type.
	// - Custom: Custom policy.
	// - System: System policy.
	PolicyType pulumi.StringInput
	// The RAM role name.
	RoleName pulumi.StringInput
}

func (RolePolicyAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rolePolicyAttachmentArgs)(nil)).Elem()
}

type RolePolicyAttachmentInput interface {
	pulumi.Input

	ToRolePolicyAttachmentOutput() RolePolicyAttachmentOutput
	ToRolePolicyAttachmentOutputWithContext(ctx context.Context) RolePolicyAttachmentOutput
}

func (*RolePolicyAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**RolePolicyAttachment)(nil)).Elem()
}

func (i *RolePolicyAttachment) ToRolePolicyAttachmentOutput() RolePolicyAttachmentOutput {
	return i.ToRolePolicyAttachmentOutputWithContext(context.Background())
}

func (i *RolePolicyAttachment) ToRolePolicyAttachmentOutputWithContext(ctx context.Context) RolePolicyAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RolePolicyAttachmentOutput)
}

// RolePolicyAttachmentArrayInput is an input type that accepts RolePolicyAttachmentArray and RolePolicyAttachmentArrayOutput values.
// You can construct a concrete instance of `RolePolicyAttachmentArrayInput` via:
//
//	RolePolicyAttachmentArray{ RolePolicyAttachmentArgs{...} }
type RolePolicyAttachmentArrayInput interface {
	pulumi.Input

	ToRolePolicyAttachmentArrayOutput() RolePolicyAttachmentArrayOutput
	ToRolePolicyAttachmentArrayOutputWithContext(context.Context) RolePolicyAttachmentArrayOutput
}

type RolePolicyAttachmentArray []RolePolicyAttachmentInput

func (RolePolicyAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RolePolicyAttachment)(nil)).Elem()
}

func (i RolePolicyAttachmentArray) ToRolePolicyAttachmentArrayOutput() RolePolicyAttachmentArrayOutput {
	return i.ToRolePolicyAttachmentArrayOutputWithContext(context.Background())
}

func (i RolePolicyAttachmentArray) ToRolePolicyAttachmentArrayOutputWithContext(ctx context.Context) RolePolicyAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RolePolicyAttachmentArrayOutput)
}

// RolePolicyAttachmentMapInput is an input type that accepts RolePolicyAttachmentMap and RolePolicyAttachmentMapOutput values.
// You can construct a concrete instance of `RolePolicyAttachmentMapInput` via:
//
//	RolePolicyAttachmentMap{ "key": RolePolicyAttachmentArgs{...} }
type RolePolicyAttachmentMapInput interface {
	pulumi.Input

	ToRolePolicyAttachmentMapOutput() RolePolicyAttachmentMapOutput
	ToRolePolicyAttachmentMapOutputWithContext(context.Context) RolePolicyAttachmentMapOutput
}

type RolePolicyAttachmentMap map[string]RolePolicyAttachmentInput

func (RolePolicyAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RolePolicyAttachment)(nil)).Elem()
}

func (i RolePolicyAttachmentMap) ToRolePolicyAttachmentMapOutput() RolePolicyAttachmentMapOutput {
	return i.ToRolePolicyAttachmentMapOutputWithContext(context.Background())
}

func (i RolePolicyAttachmentMap) ToRolePolicyAttachmentMapOutputWithContext(ctx context.Context) RolePolicyAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RolePolicyAttachmentMapOutput)
}

type RolePolicyAttachmentOutput struct{ *pulumi.OutputState }

func (RolePolicyAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RolePolicyAttachment)(nil)).Elem()
}

func (o RolePolicyAttachmentOutput) ToRolePolicyAttachmentOutput() RolePolicyAttachmentOutput {
	return o
}

func (o RolePolicyAttachmentOutput) ToRolePolicyAttachmentOutputWithContext(ctx context.Context) RolePolicyAttachmentOutput {
	return o
}

// The name of the policy.
func (o RolePolicyAttachmentOutput) PolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v *RolePolicyAttachment) pulumi.StringOutput { return v.PolicyName }).(pulumi.StringOutput)
}

// Policy type.
// - Custom: Custom policy.
// - System: System policy.
func (o RolePolicyAttachmentOutput) PolicyType() pulumi.StringOutput {
	return o.ApplyT(func(v *RolePolicyAttachment) pulumi.StringOutput { return v.PolicyType }).(pulumi.StringOutput)
}

// The RAM role name.
func (o RolePolicyAttachmentOutput) RoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *RolePolicyAttachment) pulumi.StringOutput { return v.RoleName }).(pulumi.StringOutput)
}

type RolePolicyAttachmentArrayOutput struct{ *pulumi.OutputState }

func (RolePolicyAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RolePolicyAttachment)(nil)).Elem()
}

func (o RolePolicyAttachmentArrayOutput) ToRolePolicyAttachmentArrayOutput() RolePolicyAttachmentArrayOutput {
	return o
}

func (o RolePolicyAttachmentArrayOutput) ToRolePolicyAttachmentArrayOutputWithContext(ctx context.Context) RolePolicyAttachmentArrayOutput {
	return o
}

func (o RolePolicyAttachmentArrayOutput) Index(i pulumi.IntInput) RolePolicyAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RolePolicyAttachment {
		return vs[0].([]*RolePolicyAttachment)[vs[1].(int)]
	}).(RolePolicyAttachmentOutput)
}

type RolePolicyAttachmentMapOutput struct{ *pulumi.OutputState }

func (RolePolicyAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RolePolicyAttachment)(nil)).Elem()
}

func (o RolePolicyAttachmentMapOutput) ToRolePolicyAttachmentMapOutput() RolePolicyAttachmentMapOutput {
	return o
}

func (o RolePolicyAttachmentMapOutput) ToRolePolicyAttachmentMapOutputWithContext(ctx context.Context) RolePolicyAttachmentMapOutput {
	return o
}

func (o RolePolicyAttachmentMapOutput) MapIndex(k pulumi.StringInput) RolePolicyAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RolePolicyAttachment {
		return vs[0].(map[string]*RolePolicyAttachment)[vs[1].(string)]
	}).(RolePolicyAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RolePolicyAttachmentInput)(nil)).Elem(), &RolePolicyAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*RolePolicyAttachmentArrayInput)(nil)).Elem(), RolePolicyAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RolePolicyAttachmentMapInput)(nil)).Elem(), RolePolicyAttachmentMap{})
	pulumi.RegisterOutputType(RolePolicyAttachmentOutput{})
	pulumi.RegisterOutputType(RolePolicyAttachmentArrayOutput{})
	pulumi.RegisterOutputType(RolePolicyAttachmentMapOutput{})
}
