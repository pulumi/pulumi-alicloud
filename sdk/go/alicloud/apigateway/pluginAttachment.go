// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// # Basic Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/apigateway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform_example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			exampleGroup, err := apigateway.NewGroup(ctx, "exampleGroup", &apigateway.GroupArgs{
//				Description: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			exampleApi, err := apigateway.NewApi(ctx, "exampleApi", &apigateway.ApiArgs{
//				GroupId:         exampleGroup.ID(),
//				Description:     pulumi.String(name),
//				AuthType:        pulumi.String("APP"),
//				ForceNonceCheck: pulumi.Bool(false),
//				RequestConfig: &apigateway.ApiRequestConfigArgs{
//					Protocol: pulumi.String("HTTP"),
//					Method:   pulumi.String("GET"),
//					Path:     pulumi.String("/example/path"),
//					Mode:     pulumi.String("MAPPING"),
//				},
//				ServiceType: pulumi.String("HTTP"),
//				HttpServiceConfig: &apigateway.ApiHttpServiceConfigArgs{
//					Address:  pulumi.String("http://apigateway-backend.alicloudapi.com:8080"),
//					Method:   pulumi.String("GET"),
//					Path:     pulumi.String("/web/cloudapi"),
//					Timeout:  pulumi.Int(12),
//					AoneName: pulumi.String("cloudapi-openapi"),
//				},
//				RequestParameters: apigateway.ApiRequestParameterArray{
//					&apigateway.ApiRequestParameterArgs{
//						Name:        pulumi.String("example"),
//						Type:        pulumi.String("STRING"),
//						Required:    pulumi.String("OPTIONAL"),
//						In:          pulumi.String("QUERY"),
//						InService:   pulumi.String("QUERY"),
//						NameService: pulumi.String("exampleservice"),
//					},
//				},
//				StageNames: pulumi.StringArray{
//					pulumi.String("RELEASE"),
//					pulumi.String("TEST"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"allowOrigins":     "api.foo.com",
//				"allowMethods":     "GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH",
//				"allowHeaders":     "Authorization,Accept,Accept-Ranges,Cache-Control,Range,Date,Content-Type,Content-Length,Content-MD5,User-Agent,X-Ca-Signature,X-Ca-Signature-Headers,X-Ca-Signature-Method,X-Ca-Key,X-Ca-Timestamp,X-Ca-Nonce,X-Ca-Stage,X-Ca-Request-Mode,x-ca-deviceid",
//				"exposeHeaders":    "Content-MD5,Server,Date,Latency,X-Ca-Request-Id,X-Ca-Error-Code,X-Ca-Error-Message",
//				"maxAge":           172800,
//				"allowCredentials": true,
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			examplePlugin, err := apigateway.NewPlugin(ctx, "examplePlugin", &apigateway.PluginArgs{
//				Description: pulumi.String("tf_example"),
//				PluginName:  pulumi.String("tf_example"),
//				PluginData:  pulumi.String(json0),
//				PluginType:  pulumi.String("cors"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = apigateway.NewPluginAttachment(ctx, "examplePluginAttachment", &apigateway.PluginAttachmentArgs{
//				ApiId:     exampleApi.ApiId,
//				GroupId:   exampleGroup.ID(),
//				PluginId:  examplePlugin.ID(),
//				StageName: pulumi.String("RELEASE"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
type PluginAttachment struct {
	pulumi.CustomResourceState

	// The apiId that plugin attaches to.
	ApiId pulumi.StringOutput `pulumi:"apiId"`
	// The group that the api belongs to.
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// The plugin that attaches to the api.
	PluginId pulumi.StringOutput `pulumi:"pluginId"`
	// Stage that the plugin attaches to.
	StageName pulumi.StringOutput `pulumi:"stageName"`
}

// NewPluginAttachment registers a new resource with the given unique name, arguments, and options.
func NewPluginAttachment(ctx *pulumi.Context,
	name string, args *PluginAttachmentArgs, opts ...pulumi.ResourceOption) (*PluginAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiId == nil {
		return nil, errors.New("invalid value for required argument 'ApiId'")
	}
	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	if args.PluginId == nil {
		return nil, errors.New("invalid value for required argument 'PluginId'")
	}
	if args.StageName == nil {
		return nil, errors.New("invalid value for required argument 'StageName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PluginAttachment
	err := ctx.RegisterResource("alicloud:apigateway/pluginAttachment:PluginAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPluginAttachment gets an existing PluginAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPluginAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PluginAttachmentState, opts ...pulumi.ResourceOption) (*PluginAttachment, error) {
	var resource PluginAttachment
	err := ctx.ReadResource("alicloud:apigateway/pluginAttachment:PluginAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PluginAttachment resources.
type pluginAttachmentState struct {
	// The apiId that plugin attaches to.
	ApiId *string `pulumi:"apiId"`
	// The group that the api belongs to.
	GroupId *string `pulumi:"groupId"`
	// The plugin that attaches to the api.
	PluginId *string `pulumi:"pluginId"`
	// Stage that the plugin attaches to.
	StageName *string `pulumi:"stageName"`
}

type PluginAttachmentState struct {
	// The apiId that plugin attaches to.
	ApiId pulumi.StringPtrInput
	// The group that the api belongs to.
	GroupId pulumi.StringPtrInput
	// The plugin that attaches to the api.
	PluginId pulumi.StringPtrInput
	// Stage that the plugin attaches to.
	StageName pulumi.StringPtrInput
}

func (PluginAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*pluginAttachmentState)(nil)).Elem()
}

type pluginAttachmentArgs struct {
	// The apiId that plugin attaches to.
	ApiId string `pulumi:"apiId"`
	// The group that the api belongs to.
	GroupId string `pulumi:"groupId"`
	// The plugin that attaches to the api.
	PluginId string `pulumi:"pluginId"`
	// Stage that the plugin attaches to.
	StageName string `pulumi:"stageName"`
}

// The set of arguments for constructing a PluginAttachment resource.
type PluginAttachmentArgs struct {
	// The apiId that plugin attaches to.
	ApiId pulumi.StringInput
	// The group that the api belongs to.
	GroupId pulumi.StringInput
	// The plugin that attaches to the api.
	PluginId pulumi.StringInput
	// Stage that the plugin attaches to.
	StageName pulumi.StringInput
}

func (PluginAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pluginAttachmentArgs)(nil)).Elem()
}

type PluginAttachmentInput interface {
	pulumi.Input

	ToPluginAttachmentOutput() PluginAttachmentOutput
	ToPluginAttachmentOutputWithContext(ctx context.Context) PluginAttachmentOutput
}

func (*PluginAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**PluginAttachment)(nil)).Elem()
}

func (i *PluginAttachment) ToPluginAttachmentOutput() PluginAttachmentOutput {
	return i.ToPluginAttachmentOutputWithContext(context.Background())
}

func (i *PluginAttachment) ToPluginAttachmentOutputWithContext(ctx context.Context) PluginAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PluginAttachmentOutput)
}

// PluginAttachmentArrayInput is an input type that accepts PluginAttachmentArray and PluginAttachmentArrayOutput values.
// You can construct a concrete instance of `PluginAttachmentArrayInput` via:
//
//	PluginAttachmentArray{ PluginAttachmentArgs{...} }
type PluginAttachmentArrayInput interface {
	pulumi.Input

	ToPluginAttachmentArrayOutput() PluginAttachmentArrayOutput
	ToPluginAttachmentArrayOutputWithContext(context.Context) PluginAttachmentArrayOutput
}

type PluginAttachmentArray []PluginAttachmentInput

func (PluginAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PluginAttachment)(nil)).Elem()
}

func (i PluginAttachmentArray) ToPluginAttachmentArrayOutput() PluginAttachmentArrayOutput {
	return i.ToPluginAttachmentArrayOutputWithContext(context.Background())
}

func (i PluginAttachmentArray) ToPluginAttachmentArrayOutputWithContext(ctx context.Context) PluginAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PluginAttachmentArrayOutput)
}

// PluginAttachmentMapInput is an input type that accepts PluginAttachmentMap and PluginAttachmentMapOutput values.
// You can construct a concrete instance of `PluginAttachmentMapInput` via:
//
//	PluginAttachmentMap{ "key": PluginAttachmentArgs{...} }
type PluginAttachmentMapInput interface {
	pulumi.Input

	ToPluginAttachmentMapOutput() PluginAttachmentMapOutput
	ToPluginAttachmentMapOutputWithContext(context.Context) PluginAttachmentMapOutput
}

type PluginAttachmentMap map[string]PluginAttachmentInput

func (PluginAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PluginAttachment)(nil)).Elem()
}

func (i PluginAttachmentMap) ToPluginAttachmentMapOutput() PluginAttachmentMapOutput {
	return i.ToPluginAttachmentMapOutputWithContext(context.Background())
}

func (i PluginAttachmentMap) ToPluginAttachmentMapOutputWithContext(ctx context.Context) PluginAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PluginAttachmentMapOutput)
}

type PluginAttachmentOutput struct{ *pulumi.OutputState }

func (PluginAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PluginAttachment)(nil)).Elem()
}

func (o PluginAttachmentOutput) ToPluginAttachmentOutput() PluginAttachmentOutput {
	return o
}

func (o PluginAttachmentOutput) ToPluginAttachmentOutputWithContext(ctx context.Context) PluginAttachmentOutput {
	return o
}

// The apiId that plugin attaches to.
func (o PluginAttachmentOutput) ApiId() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginAttachment) pulumi.StringOutput { return v.ApiId }).(pulumi.StringOutput)
}

// The group that the api belongs to.
func (o PluginAttachmentOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginAttachment) pulumi.StringOutput { return v.GroupId }).(pulumi.StringOutput)
}

// The plugin that attaches to the api.
func (o PluginAttachmentOutput) PluginId() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginAttachment) pulumi.StringOutput { return v.PluginId }).(pulumi.StringOutput)
}

// Stage that the plugin attaches to.
func (o PluginAttachmentOutput) StageName() pulumi.StringOutput {
	return o.ApplyT(func(v *PluginAttachment) pulumi.StringOutput { return v.StageName }).(pulumi.StringOutput)
}

type PluginAttachmentArrayOutput struct{ *pulumi.OutputState }

func (PluginAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PluginAttachment)(nil)).Elem()
}

func (o PluginAttachmentArrayOutput) ToPluginAttachmentArrayOutput() PluginAttachmentArrayOutput {
	return o
}

func (o PluginAttachmentArrayOutput) ToPluginAttachmentArrayOutputWithContext(ctx context.Context) PluginAttachmentArrayOutput {
	return o
}

func (o PluginAttachmentArrayOutput) Index(i pulumi.IntInput) PluginAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PluginAttachment {
		return vs[0].([]*PluginAttachment)[vs[1].(int)]
	}).(PluginAttachmentOutput)
}

type PluginAttachmentMapOutput struct{ *pulumi.OutputState }

func (PluginAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PluginAttachment)(nil)).Elem()
}

func (o PluginAttachmentMapOutput) ToPluginAttachmentMapOutput() PluginAttachmentMapOutput {
	return o
}

func (o PluginAttachmentMapOutput) ToPluginAttachmentMapOutputWithContext(ctx context.Context) PluginAttachmentMapOutput {
	return o
}

func (o PluginAttachmentMapOutput) MapIndex(k pulumi.StringInput) PluginAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PluginAttachment {
		return vs[0].(map[string]*PluginAttachment)[vs[1].(string)]
	}).(PluginAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PluginAttachmentInput)(nil)).Elem(), &PluginAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*PluginAttachmentArrayInput)(nil)).Elem(), PluginAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PluginAttachmentMapInput)(nil)).Elem(), PluginAttachmentMap{})
	pulumi.RegisterOutputType(PluginAttachmentOutput{})
	pulumi.RegisterOutputType(PluginAttachmentArrayOutput{})
	pulumi.RegisterOutputType(PluginAttachmentMapOutput{})
}