// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package threatdetection

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides Threat Detection Honeypot Probe available to the user.[What is Honeypot Probe](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypotprobe)
//
// > **NOTE:** Available in 1.195.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/threatdetection"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// cfg := config.New(ctx, "")
// name := "tf-testAccThreatDetectionHoneypotProbe";
// if param := cfg.Get("name"); param != ""{
// name = param
// }
// defaultHoneypotProbe, err := threatdetection.NewHoneypotProbe(ctx, "default", &threatdetection.HoneypotProbeArgs{
// Uuid: pulumi.String("e52c7872-29d1-4aa1-9908-0299abd53606"),
// ProbeType: pulumi.String("host_probe"),
// ControlNodeId: pulumi.String("e1397077-4941-4b14-b533-ca2bdebd00a3"),
// Ping: pulumi.Bool(true),
// HoneypotBindLists: threatdetection.HoneypotProbeHoneypotBindListArray{
// &threatdetection.HoneypotProbeHoneypotBindListArgs{
// BindPortLists: threatdetection.HoneypotProbeHoneypotBindListBindPortListArray{
// &threatdetection.HoneypotProbeHoneypotBindListBindPortListArgs{
// StartPort: pulumi.Int(80),
// EndPort: pulumi.Int(80),
// },
// },
// HoneypotId: pulumi.String("4925bf9784de992ecd017ad051528a03b3927ef814eeff76c2ebb3ab9a84bf05"),
// },
// },
// DisplayName: pulumi.String(name),
// Arp: pulumi.Bool(true),
// })
// if err != nil {
// return err
// }
// _default := threatdetection.GetHoneypotProbesOutput(ctx, threatdetection.GetHoneypotProbesOutputArgs{
// Ids: pulumi.StringArray{
// defaultHoneypotProbe.ID(),
// },
// DisplayName: pulumi.String(name),
// ProbeType: pulumi.String("host_probe"),
// EnableDetails: pulumi.Bool(true),
// }, nil);
// ctx.Export("alicloudThreatDetectionHoneypotProbeExampleId", _default.ApplyT(func(_default threatdetection.GetHoneypotProbesResult) (*string, error) {
// return &default.Probes[0].Id, nil
// }).(pulumi.StringPtrOutput))
// return nil
// })
// }
// ```
func GetHoneypotProbes(ctx *pulumi.Context, args *GetHoneypotProbesArgs, opts ...pulumi.InvokeOption) (*GetHoneypotProbesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetHoneypotProbesResult
	err := ctx.Invoke("alicloud:threatdetection/getHoneypotProbes:getHoneypotProbes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHoneypotProbes.
type GetHoneypotProbesArgs struct {
	// Probe name
	DisplayName *string `pulumi:"displayName"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Honeypot Probe IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by display name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile  *string `pulumi:"outputFile"`
	ProbeStatus *string `pulumi:"probeStatus"`
	// Probe type
	ProbeType *string `pulumi:"probeType"`
}

// A collection of values returned by getHoneypotProbes.
type GetHoneypotProbesResult struct {
	// Probe name.
	DisplayName   *string `pulumi:"displayName"`
	EnableDetails *bool   `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Honeypot Probe IDs.
	Ids         []string `pulumi:"ids"`
	NameRegex   *string  `pulumi:"nameRegex"`
	OutputFile  *string  `pulumi:"outputFile"`
	ProbeStatus *string  `pulumi:"probeStatus"`
	// Probe type, support `hostProbe` and `vpcBlackHoleProbe`.
	ProbeType *string `pulumi:"probeType"`
	// A list of Honeypot Probe Entries. Each element contains the following attributes:
	Probes []GetHoneypotProbesProbe `pulumi:"probes"`
}

func GetHoneypotProbesOutput(ctx *pulumi.Context, args GetHoneypotProbesOutputArgs, opts ...pulumi.InvokeOption) GetHoneypotProbesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetHoneypotProbesResultOutput, error) {
			args := v.(GetHoneypotProbesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:threatdetection/getHoneypotProbes:getHoneypotProbes", args, GetHoneypotProbesResultOutput{}, options).(GetHoneypotProbesResultOutput), nil
		}).(GetHoneypotProbesResultOutput)
}

// A collection of arguments for invoking getHoneypotProbes.
type GetHoneypotProbesOutputArgs struct {
	// Probe name
	DisplayName pulumi.StringPtrInput `pulumi:"displayName"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Honeypot Probe IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by display name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile  pulumi.StringPtrInput `pulumi:"outputFile"`
	ProbeStatus pulumi.StringPtrInput `pulumi:"probeStatus"`
	// Probe type
	ProbeType pulumi.StringPtrInput `pulumi:"probeType"`
}

func (GetHoneypotProbesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHoneypotProbesArgs)(nil)).Elem()
}

// A collection of values returned by getHoneypotProbes.
type GetHoneypotProbesResultOutput struct{ *pulumi.OutputState }

func (GetHoneypotProbesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHoneypotProbesResult)(nil)).Elem()
}

func (o GetHoneypotProbesResultOutput) ToGetHoneypotProbesResultOutput() GetHoneypotProbesResultOutput {
	return o
}

func (o GetHoneypotProbesResultOutput) ToGetHoneypotProbesResultOutputWithContext(ctx context.Context) GetHoneypotProbesResultOutput {
	return o
}

// Probe name.
func (o GetHoneypotProbesResultOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneypotProbesResult) *string { return v.DisplayName }).(pulumi.StringPtrOutput)
}

func (o GetHoneypotProbesResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetHoneypotProbesResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetHoneypotProbesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHoneypotProbesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Honeypot Probe IDs.
func (o GetHoneypotProbesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHoneypotProbesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetHoneypotProbesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneypotProbesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetHoneypotProbesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneypotProbesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetHoneypotProbesResultOutput) ProbeStatus() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneypotProbesResult) *string { return v.ProbeStatus }).(pulumi.StringPtrOutput)
}

// Probe type, support `hostProbe` and `vpcBlackHoleProbe`.
func (o GetHoneypotProbesResultOutput) ProbeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneypotProbesResult) *string { return v.ProbeType }).(pulumi.StringPtrOutput)
}

// A list of Honeypot Probe Entries. Each element contains the following attributes:
func (o GetHoneypotProbesResultOutput) Probes() GetHoneypotProbesProbeArrayOutput {
	return o.ApplyT(func(v GetHoneypotProbesResult) []GetHoneypotProbesProbe { return v.Probes }).(GetHoneypotProbesProbeArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHoneypotProbesResultOutput{})
}
