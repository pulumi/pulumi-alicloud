// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bastionhost

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Bastionhost Hosts of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.135.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/bastionhost"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := bastionhost.GetHosts(ctx, &bastionhost.GetHostsArgs{
//				InstanceId: "example_value",
//				Ids: []string{
//					"1",
//					"2",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("bastionhostHostId1", ids.Hosts[0].Id)
//			nameRegex, err := bastionhost.GetHosts(ctx, &bastionhost.GetHostsArgs{
//				InstanceId: "example_value",
//				NameRegex:  pulumi.StringRef("^my-Host"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("bastionhostHostId2", nameRegex.Hosts[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetHosts(ctx *pulumi.Context, args *GetHostsArgs, opts ...pulumi.InvokeOption) (*GetHostsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetHostsResult
	err := ctx.Invoke("alicloud:bastionhost/getHosts:getHosts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHosts.
type GetHostsArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// The host address.
	HostAddress *string `pulumi:"hostAddress"`
	// Specify the new create a host name of the supports up to 128 characters.
	HostName *string `pulumi:"hostName"`
	// A list of Host IDs.
	Ids []string `pulumi:"ids"`
	// Specify the new create a host where the Bastion host ID of.
	InstanceId string `pulumi:"instanceId"`
	// A regex string to filter results by Host name.
	NameRegex *string `pulumi:"nameRegex"`
	// Specify the new create the host's operating system. Valid values: Linux Windows.
	OsType *string `pulumi:"osType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Specify the new create a host of source. Valid values: Local: localhost Ecs:ECS instance Rds:RDS exclusive cluster host.
	Source *string `pulumi:"source"`
	// Specify the newly created ECS instance ID or dedicated cluster host ID.
	SourceInstanceId *string `pulumi:"sourceInstanceId"`
	// The source instance state.
	SourceInstanceState *string `pulumi:"sourceInstanceState"`
}

// A collection of values returned by getHosts.
type GetHostsResult struct {
	EnableDetails *bool          `pulumi:"enableDetails"`
	HostAddress   *string        `pulumi:"hostAddress"`
	HostName      *string        `pulumi:"hostName"`
	Hosts         []GetHostsHost `pulumi:"hosts"`
	// The provider-assigned unique ID for this managed resource.
	Id                  string   `pulumi:"id"`
	Ids                 []string `pulumi:"ids"`
	InstanceId          string   `pulumi:"instanceId"`
	NameRegex           *string  `pulumi:"nameRegex"`
	Names               []string `pulumi:"names"`
	OsType              *string  `pulumi:"osType"`
	OutputFile          *string  `pulumi:"outputFile"`
	Source              *string  `pulumi:"source"`
	SourceInstanceId    *string  `pulumi:"sourceInstanceId"`
	SourceInstanceState *string  `pulumi:"sourceInstanceState"`
}

func GetHostsOutput(ctx *pulumi.Context, args GetHostsOutputArgs, opts ...pulumi.InvokeOption) GetHostsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetHostsResultOutput, error) {
			args := v.(GetHostsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:bastionhost/getHosts:getHosts", args, GetHostsResultOutput{}, options).(GetHostsResultOutput), nil
		}).(GetHostsResultOutput)
}

// A collection of arguments for invoking getHosts.
type GetHostsOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// The host address.
	HostAddress pulumi.StringPtrInput `pulumi:"hostAddress"`
	// Specify the new create a host name of the supports up to 128 characters.
	HostName pulumi.StringPtrInput `pulumi:"hostName"`
	// A list of Host IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// Specify the new create a host where the Bastion host ID of.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// A regex string to filter results by Host name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// Specify the new create the host's operating system. Valid values: Linux Windows.
	OsType pulumi.StringPtrInput `pulumi:"osType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Specify the new create a host of source. Valid values: Local: localhost Ecs:ECS instance Rds:RDS exclusive cluster host.
	Source pulumi.StringPtrInput `pulumi:"source"`
	// Specify the newly created ECS instance ID or dedicated cluster host ID.
	SourceInstanceId pulumi.StringPtrInput `pulumi:"sourceInstanceId"`
	// The source instance state.
	SourceInstanceState pulumi.StringPtrInput `pulumi:"sourceInstanceState"`
}

func (GetHostsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostsArgs)(nil)).Elem()
}

// A collection of values returned by getHosts.
type GetHostsResultOutput struct{ *pulumi.OutputState }

func (GetHostsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostsResult)(nil)).Elem()
}

func (o GetHostsResultOutput) ToGetHostsResultOutput() GetHostsResultOutput {
	return o
}

func (o GetHostsResultOutput) ToGetHostsResultOutputWithContext(ctx context.Context) GetHostsResultOutput {
	return o
}

func (o GetHostsResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetHostsResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

func (o GetHostsResultOutput) HostAddress() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostsResult) *string { return v.HostAddress }).(pulumi.StringPtrOutput)
}

func (o GetHostsResultOutput) HostName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostsResult) *string { return v.HostName }).(pulumi.StringPtrOutput)
}

func (o GetHostsResultOutput) Hosts() GetHostsHostArrayOutput {
	return o.ApplyT(func(v GetHostsResult) []GetHostsHost { return v.Hosts }).(GetHostsHostArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetHostsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetHostsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHostsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetHostsResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostsResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

func (o GetHostsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetHostsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHostsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetHostsResultOutput) OsType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostsResult) *string { return v.OsType }).(pulumi.StringPtrOutput)
}

func (o GetHostsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetHostsResultOutput) Source() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostsResult) *string { return v.Source }).(pulumi.StringPtrOutput)
}

func (o GetHostsResultOutput) SourceInstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostsResult) *string { return v.SourceInstanceId }).(pulumi.StringPtrOutput)
}

func (o GetHostsResultOutput) SourceInstanceState() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostsResult) *string { return v.SourceInstanceState }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHostsResultOutput{})
}
