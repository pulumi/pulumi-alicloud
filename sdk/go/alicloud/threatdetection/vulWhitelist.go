// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package threatdetection

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Threat Detection Vul Whitelist resource.
//
// For information about Threat Detection Vul Whitelist and how to use it, see [What is Vul Whitelist](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-modifycreatevulwhitelist).
//
// > **NOTE:** Available since v1.195.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/threatdetection"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := threatdetection.NewVulWhitelist(ctx, "default", &threatdetection.VulWhitelistArgs{
//				Whitelist:  pulumi.String("[{\"aliasName\":\"RHSA-2021:2260: libwebp 安全更新\",\"name\":\"RHSA-2021:2260: libwebp 安全更新\",\"type\":\"cve\"}]"),
//				TargetInfo: pulumi.String("{\"type\":\"GroupId\",\"uuids\":[],\"groupIds\":[10782678]}"),
//				Reason:     pulumi.String("tf-example-reason"),
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
// Threat Detection Vul Whitelist can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:threatdetection/vulWhitelist:VulWhitelist example <id>
// ```
type VulWhitelist struct {
	pulumi.CustomResourceState

	// Reason for adding whitelist.
	Reason pulumi.StringPtrOutput `pulumi:"reason"`
	// Set the effective range of the whitelist. see [how to use it](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-modifycreatevulwhitelist).
	TargetInfo pulumi.StringPtrOutput `pulumi:"targetInfo"`
	// Information about the vulnerability to be added to the whitelist. see [how to use it](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-modifycreatevulwhitelist).
	Whitelist pulumi.StringOutput `pulumi:"whitelist"`
}

// NewVulWhitelist registers a new resource with the given unique name, arguments, and options.
func NewVulWhitelist(ctx *pulumi.Context,
	name string, args *VulWhitelistArgs, opts ...pulumi.ResourceOption) (*VulWhitelist, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Whitelist == nil {
		return nil, errors.New("invalid value for required argument 'Whitelist'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VulWhitelist
	err := ctx.RegisterResource("alicloud:threatdetection/vulWhitelist:VulWhitelist", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVulWhitelist gets an existing VulWhitelist resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVulWhitelist(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VulWhitelistState, opts ...pulumi.ResourceOption) (*VulWhitelist, error) {
	var resource VulWhitelist
	err := ctx.ReadResource("alicloud:threatdetection/vulWhitelist:VulWhitelist", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VulWhitelist resources.
type vulWhitelistState struct {
	// Reason for adding whitelist.
	Reason *string `pulumi:"reason"`
	// Set the effective range of the whitelist. see [how to use it](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-modifycreatevulwhitelist).
	TargetInfo *string `pulumi:"targetInfo"`
	// Information about the vulnerability to be added to the whitelist. see [how to use it](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-modifycreatevulwhitelist).
	Whitelist *string `pulumi:"whitelist"`
}

type VulWhitelistState struct {
	// Reason for adding whitelist.
	Reason pulumi.StringPtrInput
	// Set the effective range of the whitelist. see [how to use it](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-modifycreatevulwhitelist).
	TargetInfo pulumi.StringPtrInput
	// Information about the vulnerability to be added to the whitelist. see [how to use it](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-modifycreatevulwhitelist).
	Whitelist pulumi.StringPtrInput
}

func (VulWhitelistState) ElementType() reflect.Type {
	return reflect.TypeOf((*vulWhitelistState)(nil)).Elem()
}

type vulWhitelistArgs struct {
	// Reason for adding whitelist.
	Reason *string `pulumi:"reason"`
	// Set the effective range of the whitelist. see [how to use it](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-modifycreatevulwhitelist).
	TargetInfo *string `pulumi:"targetInfo"`
	// Information about the vulnerability to be added to the whitelist. see [how to use it](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-modifycreatevulwhitelist).
	Whitelist string `pulumi:"whitelist"`
}

// The set of arguments for constructing a VulWhitelist resource.
type VulWhitelistArgs struct {
	// Reason for adding whitelist.
	Reason pulumi.StringPtrInput
	// Set the effective range of the whitelist. see [how to use it](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-modifycreatevulwhitelist).
	TargetInfo pulumi.StringPtrInput
	// Information about the vulnerability to be added to the whitelist. see [how to use it](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-modifycreatevulwhitelist).
	Whitelist pulumi.StringInput
}

func (VulWhitelistArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vulWhitelistArgs)(nil)).Elem()
}

type VulWhitelistInput interface {
	pulumi.Input

	ToVulWhitelistOutput() VulWhitelistOutput
	ToVulWhitelistOutputWithContext(ctx context.Context) VulWhitelistOutput
}

func (*VulWhitelist) ElementType() reflect.Type {
	return reflect.TypeOf((**VulWhitelist)(nil)).Elem()
}

func (i *VulWhitelist) ToVulWhitelistOutput() VulWhitelistOutput {
	return i.ToVulWhitelistOutputWithContext(context.Background())
}

func (i *VulWhitelist) ToVulWhitelistOutputWithContext(ctx context.Context) VulWhitelistOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VulWhitelistOutput)
}

// VulWhitelistArrayInput is an input type that accepts VulWhitelistArray and VulWhitelistArrayOutput values.
// You can construct a concrete instance of `VulWhitelistArrayInput` via:
//
//	VulWhitelistArray{ VulWhitelistArgs{...} }
type VulWhitelistArrayInput interface {
	pulumi.Input

	ToVulWhitelistArrayOutput() VulWhitelistArrayOutput
	ToVulWhitelistArrayOutputWithContext(context.Context) VulWhitelistArrayOutput
}

type VulWhitelistArray []VulWhitelistInput

func (VulWhitelistArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VulWhitelist)(nil)).Elem()
}

func (i VulWhitelistArray) ToVulWhitelistArrayOutput() VulWhitelistArrayOutput {
	return i.ToVulWhitelistArrayOutputWithContext(context.Background())
}

func (i VulWhitelistArray) ToVulWhitelistArrayOutputWithContext(ctx context.Context) VulWhitelistArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VulWhitelistArrayOutput)
}

// VulWhitelistMapInput is an input type that accepts VulWhitelistMap and VulWhitelistMapOutput values.
// You can construct a concrete instance of `VulWhitelistMapInput` via:
//
//	VulWhitelistMap{ "key": VulWhitelistArgs{...} }
type VulWhitelistMapInput interface {
	pulumi.Input

	ToVulWhitelistMapOutput() VulWhitelistMapOutput
	ToVulWhitelistMapOutputWithContext(context.Context) VulWhitelistMapOutput
}

type VulWhitelistMap map[string]VulWhitelistInput

func (VulWhitelistMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VulWhitelist)(nil)).Elem()
}

func (i VulWhitelistMap) ToVulWhitelistMapOutput() VulWhitelistMapOutput {
	return i.ToVulWhitelistMapOutputWithContext(context.Background())
}

func (i VulWhitelistMap) ToVulWhitelistMapOutputWithContext(ctx context.Context) VulWhitelistMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VulWhitelistMapOutput)
}

type VulWhitelistOutput struct{ *pulumi.OutputState }

func (VulWhitelistOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VulWhitelist)(nil)).Elem()
}

func (o VulWhitelistOutput) ToVulWhitelistOutput() VulWhitelistOutput {
	return o
}

func (o VulWhitelistOutput) ToVulWhitelistOutputWithContext(ctx context.Context) VulWhitelistOutput {
	return o
}

// Reason for adding whitelist.
func (o VulWhitelistOutput) Reason() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VulWhitelist) pulumi.StringPtrOutput { return v.Reason }).(pulumi.StringPtrOutput)
}

// Set the effective range of the whitelist. see [how to use it](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-modifycreatevulwhitelist).
func (o VulWhitelistOutput) TargetInfo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VulWhitelist) pulumi.StringPtrOutput { return v.TargetInfo }).(pulumi.StringPtrOutput)
}

// Information about the vulnerability to be added to the whitelist. see [how to use it](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-modifycreatevulwhitelist).
func (o VulWhitelistOutput) Whitelist() pulumi.StringOutput {
	return o.ApplyT(func(v *VulWhitelist) pulumi.StringOutput { return v.Whitelist }).(pulumi.StringOutput)
}

type VulWhitelistArrayOutput struct{ *pulumi.OutputState }

func (VulWhitelistArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VulWhitelist)(nil)).Elem()
}

func (o VulWhitelistArrayOutput) ToVulWhitelistArrayOutput() VulWhitelistArrayOutput {
	return o
}

func (o VulWhitelistArrayOutput) ToVulWhitelistArrayOutputWithContext(ctx context.Context) VulWhitelistArrayOutput {
	return o
}

func (o VulWhitelistArrayOutput) Index(i pulumi.IntInput) VulWhitelistOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VulWhitelist {
		return vs[0].([]*VulWhitelist)[vs[1].(int)]
	}).(VulWhitelistOutput)
}

type VulWhitelistMapOutput struct{ *pulumi.OutputState }

func (VulWhitelistMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VulWhitelist)(nil)).Elem()
}

func (o VulWhitelistMapOutput) ToVulWhitelistMapOutput() VulWhitelistMapOutput {
	return o
}

func (o VulWhitelistMapOutput) ToVulWhitelistMapOutputWithContext(ctx context.Context) VulWhitelistMapOutput {
	return o
}

func (o VulWhitelistMapOutput) MapIndex(k pulumi.StringInput) VulWhitelistOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VulWhitelist {
		return vs[0].(map[string]*VulWhitelist)[vs[1].(string)]
	}).(VulWhitelistOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VulWhitelistInput)(nil)).Elem(), &VulWhitelist{})
	pulumi.RegisterInputType(reflect.TypeOf((*VulWhitelistArrayInput)(nil)).Elem(), VulWhitelistArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VulWhitelistMapInput)(nil)).Elem(), VulWhitelistMap{})
	pulumi.RegisterOutputType(VulWhitelistOutput{})
	pulumi.RegisterOutputType(VulWhitelistArrayOutput{})
	pulumi.RegisterOutputType(VulWhitelistMapOutput{})
}
