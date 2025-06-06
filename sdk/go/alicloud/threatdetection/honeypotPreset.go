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

// Provides a Threat Detection Honeypot Preset resource.
//
// For information about Threat Detection Honeypot Preset and how to use it, see [What is Honeypot Preset](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypotpreset).
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
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tfexample"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_default, err := threatdetection.GetHoneypotImages(ctx, &threatdetection.GetHoneypotImagesArgs{
//				NameRegex: pulumi.StringRef("^ruoyi"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultHoneypotNode, err := threatdetection.NewHoneypotNode(ctx, "default", &threatdetection.HoneypotNodeArgs{
//				NodeName:          pulumi.String(name),
//				AvailableProbeNum: pulumi.Int(20),
//				SecurityGroupProbeIpLists: pulumi.StringArray{
//					pulumi.String("0.0.0.0/0"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = threatdetection.NewHoneypotPreset(ctx, "default", &threatdetection.HoneypotPresetArgs{
//				PresetName:        pulumi.String(name),
//				NodeId:            defaultHoneypotNode.ID(),
//				HoneypotImageName: pulumi.String(_default.Images[0].HoneypotImageName),
//				Meta: &threatdetection.HoneypotPresetMetaArgs{
//					PortraitOption: pulumi.Bool(true),
//					Burp:           pulumi.String("open"),
//					TrojanGit:      pulumi.String("open"),
//				},
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
// Threat Detection Honeypot Preset can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:threatdetection/honeypotPreset:HoneypotPreset example <id>
// ```
type HoneypotPreset struct {
	pulumi.CustomResourceState

	// Honeypot mirror name
	HoneypotImageName pulumi.StringOutput `pulumi:"honeypotImageName"`
	// Unique ID of honeypot Template
	HoneypotPresetId pulumi.StringOutput `pulumi:"honeypotPresetId"`
	// Honeypot template custom parameters. See `meta` below.
	Meta HoneypotPresetMetaOutput `pulumi:"meta"`
	// Unique id of management node
	NodeId pulumi.StringOutput `pulumi:"nodeId"`
	// Honeypot template custom name
	PresetName pulumi.StringOutput `pulumi:"presetName"`
}

// NewHoneypotPreset registers a new resource with the given unique name, arguments, and options.
func NewHoneypotPreset(ctx *pulumi.Context,
	name string, args *HoneypotPresetArgs, opts ...pulumi.ResourceOption) (*HoneypotPreset, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HoneypotImageName == nil {
		return nil, errors.New("invalid value for required argument 'HoneypotImageName'")
	}
	if args.Meta == nil {
		return nil, errors.New("invalid value for required argument 'Meta'")
	}
	if args.NodeId == nil {
		return nil, errors.New("invalid value for required argument 'NodeId'")
	}
	if args.PresetName == nil {
		return nil, errors.New("invalid value for required argument 'PresetName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HoneypotPreset
	err := ctx.RegisterResource("alicloud:threatdetection/honeypotPreset:HoneypotPreset", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHoneypotPreset gets an existing HoneypotPreset resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHoneypotPreset(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HoneypotPresetState, opts ...pulumi.ResourceOption) (*HoneypotPreset, error) {
	var resource HoneypotPreset
	err := ctx.ReadResource("alicloud:threatdetection/honeypotPreset:HoneypotPreset", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HoneypotPreset resources.
type honeypotPresetState struct {
	// Honeypot mirror name
	HoneypotImageName *string `pulumi:"honeypotImageName"`
	// Unique ID of honeypot Template
	HoneypotPresetId *string `pulumi:"honeypotPresetId"`
	// Honeypot template custom parameters. See `meta` below.
	Meta *HoneypotPresetMeta `pulumi:"meta"`
	// Unique id of management node
	NodeId *string `pulumi:"nodeId"`
	// Honeypot template custom name
	PresetName *string `pulumi:"presetName"`
}

type HoneypotPresetState struct {
	// Honeypot mirror name
	HoneypotImageName pulumi.StringPtrInput
	// Unique ID of honeypot Template
	HoneypotPresetId pulumi.StringPtrInput
	// Honeypot template custom parameters. See `meta` below.
	Meta HoneypotPresetMetaPtrInput
	// Unique id of management node
	NodeId pulumi.StringPtrInput
	// Honeypot template custom name
	PresetName pulumi.StringPtrInput
}

func (HoneypotPresetState) ElementType() reflect.Type {
	return reflect.TypeOf((*honeypotPresetState)(nil)).Elem()
}

type honeypotPresetArgs struct {
	// Honeypot mirror name
	HoneypotImageName string `pulumi:"honeypotImageName"`
	// Honeypot template custom parameters. See `meta` below.
	Meta HoneypotPresetMeta `pulumi:"meta"`
	// Unique id of management node
	NodeId string `pulumi:"nodeId"`
	// Honeypot template custom name
	PresetName string `pulumi:"presetName"`
}

// The set of arguments for constructing a HoneypotPreset resource.
type HoneypotPresetArgs struct {
	// Honeypot mirror name
	HoneypotImageName pulumi.StringInput
	// Honeypot template custom parameters. See `meta` below.
	Meta HoneypotPresetMetaInput
	// Unique id of management node
	NodeId pulumi.StringInput
	// Honeypot template custom name
	PresetName pulumi.StringInput
}

func (HoneypotPresetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*honeypotPresetArgs)(nil)).Elem()
}

type HoneypotPresetInput interface {
	pulumi.Input

	ToHoneypotPresetOutput() HoneypotPresetOutput
	ToHoneypotPresetOutputWithContext(ctx context.Context) HoneypotPresetOutput
}

func (*HoneypotPreset) ElementType() reflect.Type {
	return reflect.TypeOf((**HoneypotPreset)(nil)).Elem()
}

func (i *HoneypotPreset) ToHoneypotPresetOutput() HoneypotPresetOutput {
	return i.ToHoneypotPresetOutputWithContext(context.Background())
}

func (i *HoneypotPreset) ToHoneypotPresetOutputWithContext(ctx context.Context) HoneypotPresetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HoneypotPresetOutput)
}

// HoneypotPresetArrayInput is an input type that accepts HoneypotPresetArray and HoneypotPresetArrayOutput values.
// You can construct a concrete instance of `HoneypotPresetArrayInput` via:
//
//	HoneypotPresetArray{ HoneypotPresetArgs{...} }
type HoneypotPresetArrayInput interface {
	pulumi.Input

	ToHoneypotPresetArrayOutput() HoneypotPresetArrayOutput
	ToHoneypotPresetArrayOutputWithContext(context.Context) HoneypotPresetArrayOutput
}

type HoneypotPresetArray []HoneypotPresetInput

func (HoneypotPresetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HoneypotPreset)(nil)).Elem()
}

func (i HoneypotPresetArray) ToHoneypotPresetArrayOutput() HoneypotPresetArrayOutput {
	return i.ToHoneypotPresetArrayOutputWithContext(context.Background())
}

func (i HoneypotPresetArray) ToHoneypotPresetArrayOutputWithContext(ctx context.Context) HoneypotPresetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HoneypotPresetArrayOutput)
}

// HoneypotPresetMapInput is an input type that accepts HoneypotPresetMap and HoneypotPresetMapOutput values.
// You can construct a concrete instance of `HoneypotPresetMapInput` via:
//
//	HoneypotPresetMap{ "key": HoneypotPresetArgs{...} }
type HoneypotPresetMapInput interface {
	pulumi.Input

	ToHoneypotPresetMapOutput() HoneypotPresetMapOutput
	ToHoneypotPresetMapOutputWithContext(context.Context) HoneypotPresetMapOutput
}

type HoneypotPresetMap map[string]HoneypotPresetInput

func (HoneypotPresetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HoneypotPreset)(nil)).Elem()
}

func (i HoneypotPresetMap) ToHoneypotPresetMapOutput() HoneypotPresetMapOutput {
	return i.ToHoneypotPresetMapOutputWithContext(context.Background())
}

func (i HoneypotPresetMap) ToHoneypotPresetMapOutputWithContext(ctx context.Context) HoneypotPresetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HoneypotPresetMapOutput)
}

type HoneypotPresetOutput struct{ *pulumi.OutputState }

func (HoneypotPresetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HoneypotPreset)(nil)).Elem()
}

func (o HoneypotPresetOutput) ToHoneypotPresetOutput() HoneypotPresetOutput {
	return o
}

func (o HoneypotPresetOutput) ToHoneypotPresetOutputWithContext(ctx context.Context) HoneypotPresetOutput {
	return o
}

// Honeypot mirror name
func (o HoneypotPresetOutput) HoneypotImageName() pulumi.StringOutput {
	return o.ApplyT(func(v *HoneypotPreset) pulumi.StringOutput { return v.HoneypotImageName }).(pulumi.StringOutput)
}

// Unique ID of honeypot Template
func (o HoneypotPresetOutput) HoneypotPresetId() pulumi.StringOutput {
	return o.ApplyT(func(v *HoneypotPreset) pulumi.StringOutput { return v.HoneypotPresetId }).(pulumi.StringOutput)
}

// Honeypot template custom parameters. See `meta` below.
func (o HoneypotPresetOutput) Meta() HoneypotPresetMetaOutput {
	return o.ApplyT(func(v *HoneypotPreset) HoneypotPresetMetaOutput { return v.Meta }).(HoneypotPresetMetaOutput)
}

// Unique id of management node
func (o HoneypotPresetOutput) NodeId() pulumi.StringOutput {
	return o.ApplyT(func(v *HoneypotPreset) pulumi.StringOutput { return v.NodeId }).(pulumi.StringOutput)
}

// Honeypot template custom name
func (o HoneypotPresetOutput) PresetName() pulumi.StringOutput {
	return o.ApplyT(func(v *HoneypotPreset) pulumi.StringOutput { return v.PresetName }).(pulumi.StringOutput)
}

type HoneypotPresetArrayOutput struct{ *pulumi.OutputState }

func (HoneypotPresetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HoneypotPreset)(nil)).Elem()
}

func (o HoneypotPresetArrayOutput) ToHoneypotPresetArrayOutput() HoneypotPresetArrayOutput {
	return o
}

func (o HoneypotPresetArrayOutput) ToHoneypotPresetArrayOutputWithContext(ctx context.Context) HoneypotPresetArrayOutput {
	return o
}

func (o HoneypotPresetArrayOutput) Index(i pulumi.IntInput) HoneypotPresetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HoneypotPreset {
		return vs[0].([]*HoneypotPreset)[vs[1].(int)]
	}).(HoneypotPresetOutput)
}

type HoneypotPresetMapOutput struct{ *pulumi.OutputState }

func (HoneypotPresetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HoneypotPreset)(nil)).Elem()
}

func (o HoneypotPresetMapOutput) ToHoneypotPresetMapOutput() HoneypotPresetMapOutput {
	return o
}

func (o HoneypotPresetMapOutput) ToHoneypotPresetMapOutputWithContext(ctx context.Context) HoneypotPresetMapOutput {
	return o
}

func (o HoneypotPresetMapOutput) MapIndex(k pulumi.StringInput) HoneypotPresetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HoneypotPreset {
		return vs[0].(map[string]*HoneypotPreset)[vs[1].(string)]
	}).(HoneypotPresetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HoneypotPresetInput)(nil)).Elem(), &HoneypotPreset{})
	pulumi.RegisterInputType(reflect.TypeOf((*HoneypotPresetArrayInput)(nil)).Elem(), HoneypotPresetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HoneypotPresetMapInput)(nil)).Elem(), HoneypotPresetMap{})
	pulumi.RegisterOutputType(HoneypotPresetOutput{})
	pulumi.RegisterOutputType(HoneypotPresetArrayOutput{})
	pulumi.RegisterOutputType(HoneypotPresetMapOutput{})
}
