// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a KMS Client Key resource. Client key (of Application Access Point).
//
// For information about KMS Client Key and how to use it, see [What is Client Key](https://www.alibabacloud.com/help/zh/key-management-service/latest/api-createclientkey).
//
// > **NOTE:** Available since v1.210.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/kms"
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
//			AAP0, err := kms.NewApplicationAccessPoint(ctx, "AAP0", &kms.ApplicationAccessPointArgs{
//				Policies: pulumi.StringArray{
//					pulumi.String("aa"),
//				},
//				Description:                pulumi.String("aa"),
//				ApplicationAccessPointName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = kms.NewClientKey(ctx, "default", &kms.ClientKeyArgs{
//				AapName:            AAP0.ApplicationAccessPointName,
//				Password:           pulumi.String("YouPassword123!"),
//				NotBefore:          pulumi.String("2023-09-01T14:11:22Z"),
//				NotAfter:           pulumi.String("2028-09-01T14:11:22Z"),
//				PrivateKeyDataFile: pulumi.String("./private_key_data_file.txt"),
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
// KMS Client Key can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:kms/clientKey:ClientKey example <id>
// ```
//
// Resource attributes such as `password`, `private_key_data_file` are not available for imported resources as this information cannot be read from the KMS API.
type ClientKey struct {
	pulumi.CustomResourceState

	// ClientKey's parent Application Access Point name.
	AapName pulumi.StringOutput `pulumi:"aapName"`
	// Create timestamp, e.g. "2022-08-10T08:03:30Z".
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
	NotAfter pulumi.StringPtrOutput `pulumi:"notAfter"`
	// The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
	NotBefore pulumi.StringPtrOutput `pulumi:"notBefore"`
	// To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
	Password pulumi.StringOutput `pulumi:"password"`
	// The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
	PrivateKeyDataFile pulumi.StringPtrOutput `pulumi:"privateKeyDataFile"`
}

// NewClientKey registers a new resource with the given unique name, arguments, and options.
func NewClientKey(ctx *pulumi.Context,
	name string, args *ClientKeyArgs, opts ...pulumi.ResourceOption) (*ClientKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AapName == nil {
		return nil, errors.New("invalid value for required argument 'AapName'")
	}
	if args.Password == nil {
		return nil, errors.New("invalid value for required argument 'Password'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClientKey
	err := ctx.RegisterResource("alicloud:kms/clientKey:ClientKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClientKey gets an existing ClientKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClientKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClientKeyState, opts ...pulumi.ResourceOption) (*ClientKey, error) {
	var resource ClientKey
	err := ctx.ReadResource("alicloud:kms/clientKey:ClientKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClientKey resources.
type clientKeyState struct {
	// ClientKey's parent Application Access Point name.
	AapName *string `pulumi:"aapName"`
	// Create timestamp, e.g. "2022-08-10T08:03:30Z".
	CreateTime *string `pulumi:"createTime"`
	// The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
	NotAfter *string `pulumi:"notAfter"`
	// The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
	NotBefore *string `pulumi:"notBefore"`
	// To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
	Password *string `pulumi:"password"`
	// The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
	PrivateKeyDataFile *string `pulumi:"privateKeyDataFile"`
}

type ClientKeyState struct {
	// ClientKey's parent Application Access Point name.
	AapName pulumi.StringPtrInput
	// Create timestamp, e.g. "2022-08-10T08:03:30Z".
	CreateTime pulumi.StringPtrInput
	// The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
	NotAfter pulumi.StringPtrInput
	// The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
	NotBefore pulumi.StringPtrInput
	// To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
	Password pulumi.StringPtrInput
	// The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
	PrivateKeyDataFile pulumi.StringPtrInput
}

func (ClientKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*clientKeyState)(nil)).Elem()
}

type clientKeyArgs struct {
	// ClientKey's parent Application Access Point name.
	AapName string `pulumi:"aapName"`
	// The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
	NotAfter *string `pulumi:"notAfter"`
	// The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
	NotBefore *string `pulumi:"notBefore"`
	// To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
	Password string `pulumi:"password"`
	// The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
	PrivateKeyDataFile *string `pulumi:"privateKeyDataFile"`
}

// The set of arguments for constructing a ClientKey resource.
type ClientKeyArgs struct {
	// ClientKey's parent Application Access Point name.
	AapName pulumi.StringInput
	// The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
	NotAfter pulumi.StringPtrInput
	// The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
	NotBefore pulumi.StringPtrInput
	// To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
	Password pulumi.StringInput
	// The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
	PrivateKeyDataFile pulumi.StringPtrInput
}

func (ClientKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clientKeyArgs)(nil)).Elem()
}

type ClientKeyInput interface {
	pulumi.Input

	ToClientKeyOutput() ClientKeyOutput
	ToClientKeyOutputWithContext(ctx context.Context) ClientKeyOutput
}

func (*ClientKey) ElementType() reflect.Type {
	return reflect.TypeOf((**ClientKey)(nil)).Elem()
}

func (i *ClientKey) ToClientKeyOutput() ClientKeyOutput {
	return i.ToClientKeyOutputWithContext(context.Background())
}

func (i *ClientKey) ToClientKeyOutputWithContext(ctx context.Context) ClientKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientKeyOutput)
}

// ClientKeyArrayInput is an input type that accepts ClientKeyArray and ClientKeyArrayOutput values.
// You can construct a concrete instance of `ClientKeyArrayInput` via:
//
//	ClientKeyArray{ ClientKeyArgs{...} }
type ClientKeyArrayInput interface {
	pulumi.Input

	ToClientKeyArrayOutput() ClientKeyArrayOutput
	ToClientKeyArrayOutputWithContext(context.Context) ClientKeyArrayOutput
}

type ClientKeyArray []ClientKeyInput

func (ClientKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClientKey)(nil)).Elem()
}

func (i ClientKeyArray) ToClientKeyArrayOutput() ClientKeyArrayOutput {
	return i.ToClientKeyArrayOutputWithContext(context.Background())
}

func (i ClientKeyArray) ToClientKeyArrayOutputWithContext(ctx context.Context) ClientKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientKeyArrayOutput)
}

// ClientKeyMapInput is an input type that accepts ClientKeyMap and ClientKeyMapOutput values.
// You can construct a concrete instance of `ClientKeyMapInput` via:
//
//	ClientKeyMap{ "key": ClientKeyArgs{...} }
type ClientKeyMapInput interface {
	pulumi.Input

	ToClientKeyMapOutput() ClientKeyMapOutput
	ToClientKeyMapOutputWithContext(context.Context) ClientKeyMapOutput
}

type ClientKeyMap map[string]ClientKeyInput

func (ClientKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClientKey)(nil)).Elem()
}

func (i ClientKeyMap) ToClientKeyMapOutput() ClientKeyMapOutput {
	return i.ToClientKeyMapOutputWithContext(context.Background())
}

func (i ClientKeyMap) ToClientKeyMapOutputWithContext(ctx context.Context) ClientKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientKeyMapOutput)
}

type ClientKeyOutput struct{ *pulumi.OutputState }

func (ClientKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClientKey)(nil)).Elem()
}

func (o ClientKeyOutput) ToClientKeyOutput() ClientKeyOutput {
	return o
}

func (o ClientKeyOutput) ToClientKeyOutputWithContext(ctx context.Context) ClientKeyOutput {
	return o
}

// ClientKey's parent Application Access Point name.
func (o ClientKeyOutput) AapName() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientKey) pulumi.StringOutput { return v.AapName }).(pulumi.StringOutput)
}

// Create timestamp, e.g. "2022-08-10T08:03:30Z".
func (o ClientKeyOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientKey) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
func (o ClientKeyOutput) NotAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientKey) pulumi.StringPtrOutput { return v.NotAfter }).(pulumi.StringPtrOutput)
}

// The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
func (o ClientKeyOutput) NotBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientKey) pulumi.StringPtrOutput { return v.NotBefore }).(pulumi.StringPtrOutput)
}

// To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
func (o ClientKeyOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientKey) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
func (o ClientKeyOutput) PrivateKeyDataFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientKey) pulumi.StringPtrOutput { return v.PrivateKeyDataFile }).(pulumi.StringPtrOutput)
}

type ClientKeyArrayOutput struct{ *pulumi.OutputState }

func (ClientKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClientKey)(nil)).Elem()
}

func (o ClientKeyArrayOutput) ToClientKeyArrayOutput() ClientKeyArrayOutput {
	return o
}

func (o ClientKeyArrayOutput) ToClientKeyArrayOutputWithContext(ctx context.Context) ClientKeyArrayOutput {
	return o
}

func (o ClientKeyArrayOutput) Index(i pulumi.IntInput) ClientKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClientKey {
		return vs[0].([]*ClientKey)[vs[1].(int)]
	}).(ClientKeyOutput)
}

type ClientKeyMapOutput struct{ *pulumi.OutputState }

func (ClientKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClientKey)(nil)).Elem()
}

func (o ClientKeyMapOutput) ToClientKeyMapOutput() ClientKeyMapOutput {
	return o
}

func (o ClientKeyMapOutput) ToClientKeyMapOutputWithContext(ctx context.Context) ClientKeyMapOutput {
	return o
}

func (o ClientKeyMapOutput) MapIndex(k pulumi.StringInput) ClientKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClientKey {
		return vs[0].(map[string]*ClientKey)[vs[1].(string)]
	}).(ClientKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClientKeyInput)(nil)).Elem(), &ClientKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClientKeyArrayInput)(nil)).Elem(), ClientKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClientKeyMapInput)(nil)).Elem(), ClientKeyMap{})
	pulumi.RegisterOutputType(ClientKeyOutput{})
	pulumi.RegisterOutputType(ClientKeyArrayOutput{})
	pulumi.RegisterOutputType(ClientKeyMapOutput{})
}
