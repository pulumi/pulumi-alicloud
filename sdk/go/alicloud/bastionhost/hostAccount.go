// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package bastionhost

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Bastion Host Host Account resource.
//
// For information about Bastion Host Host Account and how to use it, see [What is Host Account](https://www.alibabacloud.com/help/en/doc-detail/204377.htm).
//
// > **NOTE:** Available in v1.135.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/bastionhost"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := bastionhost.NewHostAccount(ctx, "example", &bastionhost.HostAccountArgs{
// 			HostAccountName: pulumi.String("example_value"),
// 			HostId:          pulumi.String("15"),
// 			InstanceId:      pulumi.String("bastionhost-cn-tl32bh0no30"),
// 			Password:        pulumi.String("YourPassword12345"),
// 			ProtocolName:    pulumi.String("SSH"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Bastion Host Host Account can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:bastionhost/hostAccount:HostAccount example <instance_id>:<host_account_id>
// ```
type HostAccount struct {
	pulumi.CustomResourceState

	// Hosting account ID.
	HostAccountId pulumi.StringOutput `pulumi:"hostAccountId"`
	// The name of the host account. The name can be up to 128 characters in length.
	HostAccountName pulumi.StringOutput `pulumi:"hostAccountName"`
	// The ID of the host for which you want to create an account.
	HostId pulumi.StringOutput `pulumi:"hostId"`
	// The ID of the Bastionhost instance where you want to create an account for the host.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The passphrase of the private key for the host account. **NOTE:** It is valid when the attribute `protocolName` is `SSH`.
	PassPhrase pulumi.StringPtrOutput `pulumi:"passPhrase"`
	// The password of the host account.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// The private key of the host account. The value is a Base64-encoded string. **NOTE:** It is valid when the attribute `protocolName` is `SSH`
	PrivateKey pulumi.StringPtrOutput `pulumi:"privateKey"`
	// The protocol used by the host account. Valid values: SSH,RDP
	ProtocolName pulumi.StringOutput `pulumi:"protocolName"`
}

// NewHostAccount registers a new resource with the given unique name, arguments, and options.
func NewHostAccount(ctx *pulumi.Context,
	name string, args *HostAccountArgs, opts ...pulumi.ResourceOption) (*HostAccount, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HostAccountName == nil {
		return nil, errors.New("invalid value for required argument 'HostAccountName'")
	}
	if args.HostId == nil {
		return nil, errors.New("invalid value for required argument 'HostId'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.ProtocolName == nil {
		return nil, errors.New("invalid value for required argument 'ProtocolName'")
	}
	var resource HostAccount
	err := ctx.RegisterResource("alicloud:bastionhost/hostAccount:HostAccount", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHostAccount gets an existing HostAccount resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHostAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HostAccountState, opts ...pulumi.ResourceOption) (*HostAccount, error) {
	var resource HostAccount
	err := ctx.ReadResource("alicloud:bastionhost/hostAccount:HostAccount", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HostAccount resources.
type hostAccountState struct {
	// Hosting account ID.
	HostAccountId *string `pulumi:"hostAccountId"`
	// The name of the host account. The name can be up to 128 characters in length.
	HostAccountName *string `pulumi:"hostAccountName"`
	// The ID of the host for which you want to create an account.
	HostId *string `pulumi:"hostId"`
	// The ID of the Bastionhost instance where you want to create an account for the host.
	InstanceId *string `pulumi:"instanceId"`
	// The passphrase of the private key for the host account. **NOTE:** It is valid when the attribute `protocolName` is `SSH`.
	PassPhrase *string `pulumi:"passPhrase"`
	// The password of the host account.
	Password *string `pulumi:"password"`
	// The private key of the host account. The value is a Base64-encoded string. **NOTE:** It is valid when the attribute `protocolName` is `SSH`
	PrivateKey *string `pulumi:"privateKey"`
	// The protocol used by the host account. Valid values: SSH,RDP
	ProtocolName *string `pulumi:"protocolName"`
}

type HostAccountState struct {
	// Hosting account ID.
	HostAccountId pulumi.StringPtrInput
	// The name of the host account. The name can be up to 128 characters in length.
	HostAccountName pulumi.StringPtrInput
	// The ID of the host for which you want to create an account.
	HostId pulumi.StringPtrInput
	// The ID of the Bastionhost instance where you want to create an account for the host.
	InstanceId pulumi.StringPtrInput
	// The passphrase of the private key for the host account. **NOTE:** It is valid when the attribute `protocolName` is `SSH`.
	PassPhrase pulumi.StringPtrInput
	// The password of the host account.
	Password pulumi.StringPtrInput
	// The private key of the host account. The value is a Base64-encoded string. **NOTE:** It is valid when the attribute `protocolName` is `SSH`
	PrivateKey pulumi.StringPtrInput
	// The protocol used by the host account. Valid values: SSH,RDP
	ProtocolName pulumi.StringPtrInput
}

func (HostAccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*hostAccountState)(nil)).Elem()
}

type hostAccountArgs struct {
	// The name of the host account. The name can be up to 128 characters in length.
	HostAccountName string `pulumi:"hostAccountName"`
	// The ID of the host for which you want to create an account.
	HostId string `pulumi:"hostId"`
	// The ID of the Bastionhost instance where you want to create an account for the host.
	InstanceId string `pulumi:"instanceId"`
	// The passphrase of the private key for the host account. **NOTE:** It is valid when the attribute `protocolName` is `SSH`.
	PassPhrase *string `pulumi:"passPhrase"`
	// The password of the host account.
	Password *string `pulumi:"password"`
	// The private key of the host account. The value is a Base64-encoded string. **NOTE:** It is valid when the attribute `protocolName` is `SSH`
	PrivateKey *string `pulumi:"privateKey"`
	// The protocol used by the host account. Valid values: SSH,RDP
	ProtocolName string `pulumi:"protocolName"`
}

// The set of arguments for constructing a HostAccount resource.
type HostAccountArgs struct {
	// The name of the host account. The name can be up to 128 characters in length.
	HostAccountName pulumi.StringInput
	// The ID of the host for which you want to create an account.
	HostId pulumi.StringInput
	// The ID of the Bastionhost instance where you want to create an account for the host.
	InstanceId pulumi.StringInput
	// The passphrase of the private key for the host account. **NOTE:** It is valid when the attribute `protocolName` is `SSH`.
	PassPhrase pulumi.StringPtrInput
	// The password of the host account.
	Password pulumi.StringPtrInput
	// The private key of the host account. The value is a Base64-encoded string. **NOTE:** It is valid when the attribute `protocolName` is `SSH`
	PrivateKey pulumi.StringPtrInput
	// The protocol used by the host account. Valid values: SSH,RDP
	ProtocolName pulumi.StringInput
}

func (HostAccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hostAccountArgs)(nil)).Elem()
}

type HostAccountInput interface {
	pulumi.Input

	ToHostAccountOutput() HostAccountOutput
	ToHostAccountOutputWithContext(ctx context.Context) HostAccountOutput
}

func (*HostAccount) ElementType() reflect.Type {
	return reflect.TypeOf((**HostAccount)(nil)).Elem()
}

func (i *HostAccount) ToHostAccountOutput() HostAccountOutput {
	return i.ToHostAccountOutputWithContext(context.Background())
}

func (i *HostAccount) ToHostAccountOutputWithContext(ctx context.Context) HostAccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostAccountOutput)
}

// HostAccountArrayInput is an input type that accepts HostAccountArray and HostAccountArrayOutput values.
// You can construct a concrete instance of `HostAccountArrayInput` via:
//
//          HostAccountArray{ HostAccountArgs{...} }
type HostAccountArrayInput interface {
	pulumi.Input

	ToHostAccountArrayOutput() HostAccountArrayOutput
	ToHostAccountArrayOutputWithContext(context.Context) HostAccountArrayOutput
}

type HostAccountArray []HostAccountInput

func (HostAccountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostAccount)(nil)).Elem()
}

func (i HostAccountArray) ToHostAccountArrayOutput() HostAccountArrayOutput {
	return i.ToHostAccountArrayOutputWithContext(context.Background())
}

func (i HostAccountArray) ToHostAccountArrayOutputWithContext(ctx context.Context) HostAccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostAccountArrayOutput)
}

// HostAccountMapInput is an input type that accepts HostAccountMap and HostAccountMapOutput values.
// You can construct a concrete instance of `HostAccountMapInput` via:
//
//          HostAccountMap{ "key": HostAccountArgs{...} }
type HostAccountMapInput interface {
	pulumi.Input

	ToHostAccountMapOutput() HostAccountMapOutput
	ToHostAccountMapOutputWithContext(context.Context) HostAccountMapOutput
}

type HostAccountMap map[string]HostAccountInput

func (HostAccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostAccount)(nil)).Elem()
}

func (i HostAccountMap) ToHostAccountMapOutput() HostAccountMapOutput {
	return i.ToHostAccountMapOutputWithContext(context.Background())
}

func (i HostAccountMap) ToHostAccountMapOutputWithContext(ctx context.Context) HostAccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostAccountMapOutput)
}

type HostAccountOutput struct{ *pulumi.OutputState }

func (HostAccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HostAccount)(nil)).Elem()
}

func (o HostAccountOutput) ToHostAccountOutput() HostAccountOutput {
	return o
}

func (o HostAccountOutput) ToHostAccountOutputWithContext(ctx context.Context) HostAccountOutput {
	return o
}

type HostAccountArrayOutput struct{ *pulumi.OutputState }

func (HostAccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostAccount)(nil)).Elem()
}

func (o HostAccountArrayOutput) ToHostAccountArrayOutput() HostAccountArrayOutput {
	return o
}

func (o HostAccountArrayOutput) ToHostAccountArrayOutputWithContext(ctx context.Context) HostAccountArrayOutput {
	return o
}

func (o HostAccountArrayOutput) Index(i pulumi.IntInput) HostAccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HostAccount {
		return vs[0].([]*HostAccount)[vs[1].(int)]
	}).(HostAccountOutput)
}

type HostAccountMapOutput struct{ *pulumi.OutputState }

func (HostAccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostAccount)(nil)).Elem()
}

func (o HostAccountMapOutput) ToHostAccountMapOutput() HostAccountMapOutput {
	return o
}

func (o HostAccountMapOutput) ToHostAccountMapOutputWithContext(ctx context.Context) HostAccountMapOutput {
	return o
}

func (o HostAccountMapOutput) MapIndex(k pulumi.StringInput) HostAccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HostAccount {
		return vs[0].(map[string]*HostAccount)[vs[1].(string)]
	}).(HostAccountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HostAccountInput)(nil)).Elem(), &HostAccount{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostAccountArrayInput)(nil)).Elem(), HostAccountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostAccountMapInput)(nil)).Elem(), HostAccountMap{})
	pulumi.RegisterOutputType(HostAccountOutput{})
	pulumi.RegisterOutputType(HostAccountArrayOutput{})
	pulumi.RegisterOutputType(HostAccountMapOutput{})
}