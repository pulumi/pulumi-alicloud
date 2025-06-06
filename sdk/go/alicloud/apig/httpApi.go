// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apig

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a APIG Http Api resource.
//
// For information about APIG Http Api and how to use it, see [What is Http Api](https://next.api.aliyun.com/api/APIG/2024-03-27/CreateHttpApi).
//
// > **NOTE:** Available since v1.240.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/apig"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			protocol := "HTTP"
//			if param := cfg.Get("protocol"); param != "" {
//				protocol = param
//			}
//			protocolHttps := "HTTPS"
//			if param := cfg.Get("protocolHttps"); param != "" {
//				protocolHttps = param
//			}
//			_, err := resourcemanager.GetResourceGroups(ctx, &resourcemanager.GetResourceGroupsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = apig.NewHttpApi(ctx, "default", &apig.HttpApiArgs{
//				HttpApiName: pulumi.String(name),
//				Protocols: pulumi.StringArray{
//					pulumi.String(protocol),
//				},
//				BasePath:    pulumi.String("/v1"),
//				Description: pulumi.String("zhiwei_pop_examplecase"),
//				Type:        pulumi.String("Rest"),
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
// APIG Http Api can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:apig/httpApi:HttpApi example <id>
// ```
type HttpApi struct {
	pulumi.CustomResourceState

	// API path
	BasePath pulumi.StringPtrOutput `pulumi:"basePath"`
	// Description of API
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the resource
	HttpApiName pulumi.StringOutput `pulumi:"httpApiName"`
	// API protocol
	Protocols pulumi.StringArrayOutput `pulumi:"protocols"`
	// The ID of the resource group
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// API type
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewHttpApi registers a new resource with the given unique name, arguments, and options.
func NewHttpApi(ctx *pulumi.Context,
	name string, args *HttpApiArgs, opts ...pulumi.ResourceOption) (*HttpApi, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HttpApiName == nil {
		return nil, errors.New("invalid value for required argument 'HttpApiName'")
	}
	if args.Protocols == nil {
		return nil, errors.New("invalid value for required argument 'Protocols'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HttpApi
	err := ctx.RegisterResource("alicloud:apig/httpApi:HttpApi", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHttpApi gets an existing HttpApi resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHttpApi(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HttpApiState, opts ...pulumi.ResourceOption) (*HttpApi, error) {
	var resource HttpApi
	err := ctx.ReadResource("alicloud:apig/httpApi:HttpApi", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HttpApi resources.
type httpApiState struct {
	// API path
	BasePath *string `pulumi:"basePath"`
	// Description of API
	Description *string `pulumi:"description"`
	// The name of the resource
	HttpApiName *string `pulumi:"httpApiName"`
	// API protocol
	Protocols []string `pulumi:"protocols"`
	// The ID of the resource group
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// API type
	Type *string `pulumi:"type"`
}

type HttpApiState struct {
	// API path
	BasePath pulumi.StringPtrInput
	// Description of API
	Description pulumi.StringPtrInput
	// The name of the resource
	HttpApiName pulumi.StringPtrInput
	// API protocol
	Protocols pulumi.StringArrayInput
	// The ID of the resource group
	ResourceGroupId pulumi.StringPtrInput
	// API type
	Type pulumi.StringPtrInput
}

func (HttpApiState) ElementType() reflect.Type {
	return reflect.TypeOf((*httpApiState)(nil)).Elem()
}

type httpApiArgs struct {
	// API path
	BasePath *string `pulumi:"basePath"`
	// Description of API
	Description *string `pulumi:"description"`
	// The name of the resource
	HttpApiName string `pulumi:"httpApiName"`
	// API protocol
	Protocols []string `pulumi:"protocols"`
	// The ID of the resource group
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// API type
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a HttpApi resource.
type HttpApiArgs struct {
	// API path
	BasePath pulumi.StringPtrInput
	// Description of API
	Description pulumi.StringPtrInput
	// The name of the resource
	HttpApiName pulumi.StringInput
	// API protocol
	Protocols pulumi.StringArrayInput
	// The ID of the resource group
	ResourceGroupId pulumi.StringPtrInput
	// API type
	Type pulumi.StringPtrInput
}

func (HttpApiArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*httpApiArgs)(nil)).Elem()
}

type HttpApiInput interface {
	pulumi.Input

	ToHttpApiOutput() HttpApiOutput
	ToHttpApiOutputWithContext(ctx context.Context) HttpApiOutput
}

func (*HttpApi) ElementType() reflect.Type {
	return reflect.TypeOf((**HttpApi)(nil)).Elem()
}

func (i *HttpApi) ToHttpApiOutput() HttpApiOutput {
	return i.ToHttpApiOutputWithContext(context.Background())
}

func (i *HttpApi) ToHttpApiOutputWithContext(ctx context.Context) HttpApiOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HttpApiOutput)
}

// HttpApiArrayInput is an input type that accepts HttpApiArray and HttpApiArrayOutput values.
// You can construct a concrete instance of `HttpApiArrayInput` via:
//
//	HttpApiArray{ HttpApiArgs{...} }
type HttpApiArrayInput interface {
	pulumi.Input

	ToHttpApiArrayOutput() HttpApiArrayOutput
	ToHttpApiArrayOutputWithContext(context.Context) HttpApiArrayOutput
}

type HttpApiArray []HttpApiInput

func (HttpApiArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HttpApi)(nil)).Elem()
}

func (i HttpApiArray) ToHttpApiArrayOutput() HttpApiArrayOutput {
	return i.ToHttpApiArrayOutputWithContext(context.Background())
}

func (i HttpApiArray) ToHttpApiArrayOutputWithContext(ctx context.Context) HttpApiArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HttpApiArrayOutput)
}

// HttpApiMapInput is an input type that accepts HttpApiMap and HttpApiMapOutput values.
// You can construct a concrete instance of `HttpApiMapInput` via:
//
//	HttpApiMap{ "key": HttpApiArgs{...} }
type HttpApiMapInput interface {
	pulumi.Input

	ToHttpApiMapOutput() HttpApiMapOutput
	ToHttpApiMapOutputWithContext(context.Context) HttpApiMapOutput
}

type HttpApiMap map[string]HttpApiInput

func (HttpApiMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HttpApi)(nil)).Elem()
}

func (i HttpApiMap) ToHttpApiMapOutput() HttpApiMapOutput {
	return i.ToHttpApiMapOutputWithContext(context.Background())
}

func (i HttpApiMap) ToHttpApiMapOutputWithContext(ctx context.Context) HttpApiMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HttpApiMapOutput)
}

type HttpApiOutput struct{ *pulumi.OutputState }

func (HttpApiOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HttpApi)(nil)).Elem()
}

func (o HttpApiOutput) ToHttpApiOutput() HttpApiOutput {
	return o
}

func (o HttpApiOutput) ToHttpApiOutputWithContext(ctx context.Context) HttpApiOutput {
	return o
}

// API path
func (o HttpApiOutput) BasePath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HttpApi) pulumi.StringPtrOutput { return v.BasePath }).(pulumi.StringPtrOutput)
}

// Description of API
func (o HttpApiOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HttpApi) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the resource
func (o HttpApiOutput) HttpApiName() pulumi.StringOutput {
	return o.ApplyT(func(v *HttpApi) pulumi.StringOutput { return v.HttpApiName }).(pulumi.StringOutput)
}

// API protocol
func (o HttpApiOutput) Protocols() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *HttpApi) pulumi.StringArrayOutput { return v.Protocols }).(pulumi.StringArrayOutput)
}

// The ID of the resource group
func (o HttpApiOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *HttpApi) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// API type
func (o HttpApiOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HttpApi) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type HttpApiArrayOutput struct{ *pulumi.OutputState }

func (HttpApiArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HttpApi)(nil)).Elem()
}

func (o HttpApiArrayOutput) ToHttpApiArrayOutput() HttpApiArrayOutput {
	return o
}

func (o HttpApiArrayOutput) ToHttpApiArrayOutputWithContext(ctx context.Context) HttpApiArrayOutput {
	return o
}

func (o HttpApiArrayOutput) Index(i pulumi.IntInput) HttpApiOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HttpApi {
		return vs[0].([]*HttpApi)[vs[1].(int)]
	}).(HttpApiOutput)
}

type HttpApiMapOutput struct{ *pulumi.OutputState }

func (HttpApiMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HttpApi)(nil)).Elem()
}

func (o HttpApiMapOutput) ToHttpApiMapOutput() HttpApiMapOutput {
	return o
}

func (o HttpApiMapOutput) ToHttpApiMapOutputWithContext(ctx context.Context) HttpApiMapOutput {
	return o
}

func (o HttpApiMapOutput) MapIndex(k pulumi.StringInput) HttpApiOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HttpApi {
		return vs[0].(map[string]*HttpApi)[vs[1].(string)]
	}).(HttpApiOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HttpApiInput)(nil)).Elem(), &HttpApi{})
	pulumi.RegisterInputType(reflect.TypeOf((*HttpApiArrayInput)(nil)).Elem(), HttpApiArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HttpApiMapInput)(nil)).Elem(), HttpApiMap{})
	pulumi.RegisterOutputType(HttpApiOutput{})
	pulumi.RegisterOutputType(HttpApiArrayOutput{})
	pulumi.RegisterOutputType(HttpApiMapOutput{})
}
