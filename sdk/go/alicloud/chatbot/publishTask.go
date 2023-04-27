// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package chatbot

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Chatbot Publish Task resource.
//
// For information about Chatbot Publish Task and how to use it, see [What is Publish Task](https://help.aliyun.com/document_detail/433996.html).
//
// > **NOTE:** Available in v1.203.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/chatbot"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			defaultAgents, err := chatbot.GetAgents(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = chatbot.NewPublishTask(ctx, "defaultPublishTask", &chatbot.PublishTaskArgs{
//				BizType:  pulumi.String("faq"),
//				AgentKey: *pulumi.String(defaultAgents.Agents[0].AgentKey),
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
// Chatbot Publish Task can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:chatbot/publishTask:PublishTask example <id>
//
// ```
type PublishTask struct {
	pulumi.CustomResourceState

	// The business space key. If you do not set it, the default business space is accessed. The key value is obtained on the business management page of the primary account.
	AgentKey pulumi.StringOutput `pulumi:"agentKey"`
	// The type of the publishing unit. Please use the CreateInstancePublishTask API to publish the robot.
	BizType pulumi.StringOutput `pulumi:"bizType"`
	// UTC time of task creation
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Additional release information. Currently supported: If the BizType is faq, enter the category Id in this field to indicate that only the knowledge under these categories is published.
	DataIdLists pulumi.StringArrayOutput `pulumi:"dataIdLists"`
	// UTC time for task modification
	ModifyTime pulumi.StringOutput `pulumi:"modifyTime"`
	// The status of the task.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewPublishTask registers a new resource with the given unique name, arguments, and options.
func NewPublishTask(ctx *pulumi.Context,
	name string, args *PublishTaskArgs, opts ...pulumi.ResourceOption) (*PublishTask, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BizType == nil {
		return nil, errors.New("invalid value for required argument 'BizType'")
	}
	var resource PublishTask
	err := ctx.RegisterResource("alicloud:chatbot/publishTask:PublishTask", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPublishTask gets an existing PublishTask resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPublishTask(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PublishTaskState, opts ...pulumi.ResourceOption) (*PublishTask, error) {
	var resource PublishTask
	err := ctx.ReadResource("alicloud:chatbot/publishTask:PublishTask", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PublishTask resources.
type publishTaskState struct {
	// The business space key. If you do not set it, the default business space is accessed. The key value is obtained on the business management page of the primary account.
	AgentKey *string `pulumi:"agentKey"`
	// The type of the publishing unit. Please use the CreateInstancePublishTask API to publish the robot.
	BizType *string `pulumi:"bizType"`
	// UTC time of task creation
	CreateTime *string `pulumi:"createTime"`
	// Additional release information. Currently supported: If the BizType is faq, enter the category Id in this field to indicate that only the knowledge under these categories is published.
	DataIdLists []string `pulumi:"dataIdLists"`
	// UTC time for task modification
	ModifyTime *string `pulumi:"modifyTime"`
	// The status of the task.
	Status *string `pulumi:"status"`
}

type PublishTaskState struct {
	// The business space key. If you do not set it, the default business space is accessed. The key value is obtained on the business management page of the primary account.
	AgentKey pulumi.StringPtrInput
	// The type of the publishing unit. Please use the CreateInstancePublishTask API to publish the robot.
	BizType pulumi.StringPtrInput
	// UTC time of task creation
	CreateTime pulumi.StringPtrInput
	// Additional release information. Currently supported: If the BizType is faq, enter the category Id in this field to indicate that only the knowledge under these categories is published.
	DataIdLists pulumi.StringArrayInput
	// UTC time for task modification
	ModifyTime pulumi.StringPtrInput
	// The status of the task.
	Status pulumi.StringPtrInput
}

func (PublishTaskState) ElementType() reflect.Type {
	return reflect.TypeOf((*publishTaskState)(nil)).Elem()
}

type publishTaskArgs struct {
	// The business space key. If you do not set it, the default business space is accessed. The key value is obtained on the business management page of the primary account.
	AgentKey *string `pulumi:"agentKey"`
	// The type of the publishing unit. Please use the CreateInstancePublishTask API to publish the robot.
	BizType string `pulumi:"bizType"`
	// Additional release information. Currently supported: If the BizType is faq, enter the category Id in this field to indicate that only the knowledge under these categories is published.
	DataIdLists []string `pulumi:"dataIdLists"`
}

// The set of arguments for constructing a PublishTask resource.
type PublishTaskArgs struct {
	// The business space key. If you do not set it, the default business space is accessed. The key value is obtained on the business management page of the primary account.
	AgentKey pulumi.StringPtrInput
	// The type of the publishing unit. Please use the CreateInstancePublishTask API to publish the robot.
	BizType pulumi.StringInput
	// Additional release information. Currently supported: If the BizType is faq, enter the category Id in this field to indicate that only the knowledge under these categories is published.
	DataIdLists pulumi.StringArrayInput
}

func (PublishTaskArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*publishTaskArgs)(nil)).Elem()
}

type PublishTaskInput interface {
	pulumi.Input

	ToPublishTaskOutput() PublishTaskOutput
	ToPublishTaskOutputWithContext(ctx context.Context) PublishTaskOutput
}

func (*PublishTask) ElementType() reflect.Type {
	return reflect.TypeOf((**PublishTask)(nil)).Elem()
}

func (i *PublishTask) ToPublishTaskOutput() PublishTaskOutput {
	return i.ToPublishTaskOutputWithContext(context.Background())
}

func (i *PublishTask) ToPublishTaskOutputWithContext(ctx context.Context) PublishTaskOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PublishTaskOutput)
}

// PublishTaskArrayInput is an input type that accepts PublishTaskArray and PublishTaskArrayOutput values.
// You can construct a concrete instance of `PublishTaskArrayInput` via:
//
//	PublishTaskArray{ PublishTaskArgs{...} }
type PublishTaskArrayInput interface {
	pulumi.Input

	ToPublishTaskArrayOutput() PublishTaskArrayOutput
	ToPublishTaskArrayOutputWithContext(context.Context) PublishTaskArrayOutput
}

type PublishTaskArray []PublishTaskInput

func (PublishTaskArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PublishTask)(nil)).Elem()
}

func (i PublishTaskArray) ToPublishTaskArrayOutput() PublishTaskArrayOutput {
	return i.ToPublishTaskArrayOutputWithContext(context.Background())
}

func (i PublishTaskArray) ToPublishTaskArrayOutputWithContext(ctx context.Context) PublishTaskArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PublishTaskArrayOutput)
}

// PublishTaskMapInput is an input type that accepts PublishTaskMap and PublishTaskMapOutput values.
// You can construct a concrete instance of `PublishTaskMapInput` via:
//
//	PublishTaskMap{ "key": PublishTaskArgs{...} }
type PublishTaskMapInput interface {
	pulumi.Input

	ToPublishTaskMapOutput() PublishTaskMapOutput
	ToPublishTaskMapOutputWithContext(context.Context) PublishTaskMapOutput
}

type PublishTaskMap map[string]PublishTaskInput

func (PublishTaskMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PublishTask)(nil)).Elem()
}

func (i PublishTaskMap) ToPublishTaskMapOutput() PublishTaskMapOutput {
	return i.ToPublishTaskMapOutputWithContext(context.Background())
}

func (i PublishTaskMap) ToPublishTaskMapOutputWithContext(ctx context.Context) PublishTaskMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PublishTaskMapOutput)
}

type PublishTaskOutput struct{ *pulumi.OutputState }

func (PublishTaskOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PublishTask)(nil)).Elem()
}

func (o PublishTaskOutput) ToPublishTaskOutput() PublishTaskOutput {
	return o
}

func (o PublishTaskOutput) ToPublishTaskOutputWithContext(ctx context.Context) PublishTaskOutput {
	return o
}

// The business space key. If you do not set it, the default business space is accessed. The key value is obtained on the business management page of the primary account.
func (o PublishTaskOutput) AgentKey() pulumi.StringOutput {
	return o.ApplyT(func(v *PublishTask) pulumi.StringOutput { return v.AgentKey }).(pulumi.StringOutput)
}

// The type of the publishing unit. Please use the CreateInstancePublishTask API to publish the robot.
func (o PublishTaskOutput) BizType() pulumi.StringOutput {
	return o.ApplyT(func(v *PublishTask) pulumi.StringOutput { return v.BizType }).(pulumi.StringOutput)
}

// UTC time of task creation
func (o PublishTaskOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *PublishTask) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Additional release information. Currently supported: If the BizType is faq, enter the category Id in this field to indicate that only the knowledge under these categories is published.
func (o PublishTaskOutput) DataIdLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PublishTask) pulumi.StringArrayOutput { return v.DataIdLists }).(pulumi.StringArrayOutput)
}

// UTC time for task modification
func (o PublishTaskOutput) ModifyTime() pulumi.StringOutput {
	return o.ApplyT(func(v *PublishTask) pulumi.StringOutput { return v.ModifyTime }).(pulumi.StringOutput)
}

// The status of the task.
func (o PublishTaskOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *PublishTask) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type PublishTaskArrayOutput struct{ *pulumi.OutputState }

func (PublishTaskArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PublishTask)(nil)).Elem()
}

func (o PublishTaskArrayOutput) ToPublishTaskArrayOutput() PublishTaskArrayOutput {
	return o
}

func (o PublishTaskArrayOutput) ToPublishTaskArrayOutputWithContext(ctx context.Context) PublishTaskArrayOutput {
	return o
}

func (o PublishTaskArrayOutput) Index(i pulumi.IntInput) PublishTaskOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PublishTask {
		return vs[0].([]*PublishTask)[vs[1].(int)]
	}).(PublishTaskOutput)
}

type PublishTaskMapOutput struct{ *pulumi.OutputState }

func (PublishTaskMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PublishTask)(nil)).Elem()
}

func (o PublishTaskMapOutput) ToPublishTaskMapOutput() PublishTaskMapOutput {
	return o
}

func (o PublishTaskMapOutput) ToPublishTaskMapOutputWithContext(ctx context.Context) PublishTaskMapOutput {
	return o
}

func (o PublishTaskMapOutput) MapIndex(k pulumi.StringInput) PublishTaskOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PublishTask {
		return vs[0].(map[string]*PublishTask)[vs[1].(string)]
	}).(PublishTaskOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PublishTaskInput)(nil)).Elem(), &PublishTask{})
	pulumi.RegisterInputType(reflect.TypeOf((*PublishTaskArrayInput)(nil)).Elem(), PublishTaskArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PublishTaskMapInput)(nil)).Elem(), PublishTaskMap{})
	pulumi.RegisterOutputType(PublishTaskOutput{})
	pulumi.RegisterOutputType(PublishTaskArrayOutput{})
	pulumi.RegisterOutputType(PublishTaskMapOutput{})
}