// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package message

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Message Notification Service Queues of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.188.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/message"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := message.GetServiceQueues(ctx, &message.GetServiceQueuesArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("queueId1", ids.Queues[0].Id)
//			name, err := message.GetServiceQueues(ctx, &message.GetServiceQueuesArgs{
//				QueueName: pulumi.StringRef("tf-example"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("queueId2", name.Queues[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetServiceQueues(ctx *pulumi.Context, args *GetServiceQueuesArgs, opts ...pulumi.InvokeOption) (*GetServiceQueuesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServiceQueuesResult
	err := ctx.Invoke("alicloud:message/getServiceQueues:getServiceQueues", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceQueues.
type GetServiceQueuesArgs struct {
	// A list of Queue IDs. Its element value is same as Queue Name.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Queue name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// The name of the queue.
	QueueName *string `pulumi:"queueName"`
}

// A collection of values returned by getServiceQueues.
type GetServiceQueuesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string   `pulumi:"id"`
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of Queue names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	PageNumber *int     `pulumi:"pageNumber"`
	PageSize   *int     `pulumi:"pageSize"`
	// The name of the queue.
	QueueName *string `pulumi:"queueName"`
	// A list of Queues. Each element contains the following attributes:
	Queues []GetServiceQueuesQueue `pulumi:"queues"`
}

func GetServiceQueuesOutput(ctx *pulumi.Context, args GetServiceQueuesOutputArgs, opts ...pulumi.InvokeOption) GetServiceQueuesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetServiceQueuesResultOutput, error) {
			args := v.(GetServiceQueuesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:message/getServiceQueues:getServiceQueues", args, GetServiceQueuesResultOutput{}, options).(GetServiceQueuesResultOutput), nil
		}).(GetServiceQueuesResultOutput)
}

// A collection of arguments for invoking getServiceQueues.
type GetServiceQueuesOutputArgs struct {
	// A list of Queue IDs. Its element value is same as Queue Name.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Queue name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// The name of the queue.
	QueueName pulumi.StringPtrInput `pulumi:"queueName"`
}

func (GetServiceQueuesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceQueuesArgs)(nil)).Elem()
}

// A collection of values returned by getServiceQueues.
type GetServiceQueuesResultOutput struct{ *pulumi.OutputState }

func (GetServiceQueuesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceQueuesResult)(nil)).Elem()
}

func (o GetServiceQueuesResultOutput) ToGetServiceQueuesResultOutput() GetServiceQueuesResultOutput {
	return o
}

func (o GetServiceQueuesResultOutput) ToGetServiceQueuesResultOutputWithContext(ctx context.Context) GetServiceQueuesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetServiceQueuesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceQueuesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServiceQueuesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServiceQueuesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetServiceQueuesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceQueuesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of Queue names.
func (o GetServiceQueuesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServiceQueuesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetServiceQueuesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceQueuesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetServiceQueuesResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetServiceQueuesResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetServiceQueuesResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetServiceQueuesResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

// The name of the queue.
func (o GetServiceQueuesResultOutput) QueueName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceQueuesResult) *string { return v.QueueName }).(pulumi.StringPtrOutput)
}

// A list of Queues. Each element contains the following attributes:
func (o GetServiceQueuesResultOutput) Queues() GetServiceQueuesQueueArrayOutput {
	return o.ApplyT(func(v GetServiceQueuesResult) []GetServiceQueuesQueue { return v.Queues }).(GetServiceQueuesQueueArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServiceQueuesResultOutput{})
}
