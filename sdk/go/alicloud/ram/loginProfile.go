// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a RAM Login Profile resource.
//
// For information about RAM Login Profile and how to use it, see [What is Login Profile](https://www.alibabacloud.com/help/en/ram/developer-reference/api-ram-2015-05-01-createloginprofile).
//
// > **NOTE:** Available since v1.0.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ram"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			user, err := ram.NewUser(ctx, "user", &ram.UserArgs{
//				Name:        pulumi.String("terraform_example"),
//				DisplayName: pulumi.String("terraform_example"),
//				Mobile:      pulumi.String("86-18688888888"),
//				Email:       pulumi.String("hello.uuu@aaa.com"),
//				Comments:    pulumi.String("terraform_example"),
//				Force:       pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ram.NewLoginProfile(ctx, "profile", &ram.LoginProfileArgs{
//				UserName: user.Name,
//				Password: pulumi.String("Example_1234"),
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
// RAM Login Profile can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ram/loginProfile:LoginProfile example <id>
// ```
type LoginProfile struct {
	pulumi.CustomResourceState

	// Creation time.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Specifies whether to forcefully enable multi-factor authentication (MFA) for the RAM user. Valid values:
	// - true: forcefully enables MFA for the RAM user. The RAM user must bind an MFA device upon the next logon.
	// - false (default): does not forcefully enable MFA for the RAM user.
	MfaBindRequired pulumi.BoolOutput `pulumi:"mfaBindRequired"`
	// The password must meet the Password strength requirements. For more information about password strength setting requirements, see [GetPasswordPolicy](https://help.aliyun.com/document_detail/2337691.html).
	Password pulumi.StringOutput `pulumi:"password"`
	// Whether the user must reset the password at the next logon. Value:
	// - true
	// - false (default)
	PasswordResetRequired pulumi.BoolPtrOutput `pulumi:"passwordResetRequired"`
	// The user name.
	UserName pulumi.StringOutput `pulumi:"userName"`
}

// NewLoginProfile registers a new resource with the given unique name, arguments, and options.
func NewLoginProfile(ctx *pulumi.Context,
	name string, args *LoginProfileArgs, opts ...pulumi.ResourceOption) (*LoginProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Password == nil {
		return nil, errors.New("invalid value for required argument 'Password'")
	}
	if args.UserName == nil {
		return nil, errors.New("invalid value for required argument 'UserName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoginProfile
	err := ctx.RegisterResource("alicloud:ram/loginProfile:LoginProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoginProfile gets an existing LoginProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoginProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoginProfileState, opts ...pulumi.ResourceOption) (*LoginProfile, error) {
	var resource LoginProfile
	err := ctx.ReadResource("alicloud:ram/loginProfile:LoginProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoginProfile resources.
type loginProfileState struct {
	// Creation time.
	CreateTime *string `pulumi:"createTime"`
	// Specifies whether to forcefully enable multi-factor authentication (MFA) for the RAM user. Valid values:
	// - true: forcefully enables MFA for the RAM user. The RAM user must bind an MFA device upon the next logon.
	// - false (default): does not forcefully enable MFA for the RAM user.
	MfaBindRequired *bool `pulumi:"mfaBindRequired"`
	// The password must meet the Password strength requirements. For more information about password strength setting requirements, see [GetPasswordPolicy](https://help.aliyun.com/document_detail/2337691.html).
	Password *string `pulumi:"password"`
	// Whether the user must reset the password at the next logon. Value:
	// - true
	// - false (default)
	PasswordResetRequired *bool `pulumi:"passwordResetRequired"`
	// The user name.
	UserName *string `pulumi:"userName"`
}

type LoginProfileState struct {
	// Creation time.
	CreateTime pulumi.StringPtrInput
	// Specifies whether to forcefully enable multi-factor authentication (MFA) for the RAM user. Valid values:
	// - true: forcefully enables MFA for the RAM user. The RAM user must bind an MFA device upon the next logon.
	// - false (default): does not forcefully enable MFA for the RAM user.
	MfaBindRequired pulumi.BoolPtrInput
	// The password must meet the Password strength requirements. For more information about password strength setting requirements, see [GetPasswordPolicy](https://help.aliyun.com/document_detail/2337691.html).
	Password pulumi.StringPtrInput
	// Whether the user must reset the password at the next logon. Value:
	// - true
	// - false (default)
	PasswordResetRequired pulumi.BoolPtrInput
	// The user name.
	UserName pulumi.StringPtrInput
}

func (LoginProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*loginProfileState)(nil)).Elem()
}

type loginProfileArgs struct {
	// Specifies whether to forcefully enable multi-factor authentication (MFA) for the RAM user. Valid values:
	// - true: forcefully enables MFA for the RAM user. The RAM user must bind an MFA device upon the next logon.
	// - false (default): does not forcefully enable MFA for the RAM user.
	MfaBindRequired *bool `pulumi:"mfaBindRequired"`
	// The password must meet the Password strength requirements. For more information about password strength setting requirements, see [GetPasswordPolicy](https://help.aliyun.com/document_detail/2337691.html).
	Password string `pulumi:"password"`
	// Whether the user must reset the password at the next logon. Value:
	// - true
	// - false (default)
	PasswordResetRequired *bool `pulumi:"passwordResetRequired"`
	// The user name.
	UserName string `pulumi:"userName"`
}

// The set of arguments for constructing a LoginProfile resource.
type LoginProfileArgs struct {
	// Specifies whether to forcefully enable multi-factor authentication (MFA) for the RAM user. Valid values:
	// - true: forcefully enables MFA for the RAM user. The RAM user must bind an MFA device upon the next logon.
	// - false (default): does not forcefully enable MFA for the RAM user.
	MfaBindRequired pulumi.BoolPtrInput
	// The password must meet the Password strength requirements. For more information about password strength setting requirements, see [GetPasswordPolicy](https://help.aliyun.com/document_detail/2337691.html).
	Password pulumi.StringInput
	// Whether the user must reset the password at the next logon. Value:
	// - true
	// - false (default)
	PasswordResetRequired pulumi.BoolPtrInput
	// The user name.
	UserName pulumi.StringInput
}

func (LoginProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loginProfileArgs)(nil)).Elem()
}

type LoginProfileInput interface {
	pulumi.Input

	ToLoginProfileOutput() LoginProfileOutput
	ToLoginProfileOutputWithContext(ctx context.Context) LoginProfileOutput
}

func (*LoginProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**LoginProfile)(nil)).Elem()
}

func (i *LoginProfile) ToLoginProfileOutput() LoginProfileOutput {
	return i.ToLoginProfileOutputWithContext(context.Background())
}

func (i *LoginProfile) ToLoginProfileOutputWithContext(ctx context.Context) LoginProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoginProfileOutput)
}

// LoginProfileArrayInput is an input type that accepts LoginProfileArray and LoginProfileArrayOutput values.
// You can construct a concrete instance of `LoginProfileArrayInput` via:
//
//	LoginProfileArray{ LoginProfileArgs{...} }
type LoginProfileArrayInput interface {
	pulumi.Input

	ToLoginProfileArrayOutput() LoginProfileArrayOutput
	ToLoginProfileArrayOutputWithContext(context.Context) LoginProfileArrayOutput
}

type LoginProfileArray []LoginProfileInput

func (LoginProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoginProfile)(nil)).Elem()
}

func (i LoginProfileArray) ToLoginProfileArrayOutput() LoginProfileArrayOutput {
	return i.ToLoginProfileArrayOutputWithContext(context.Background())
}

func (i LoginProfileArray) ToLoginProfileArrayOutputWithContext(ctx context.Context) LoginProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoginProfileArrayOutput)
}

// LoginProfileMapInput is an input type that accepts LoginProfileMap and LoginProfileMapOutput values.
// You can construct a concrete instance of `LoginProfileMapInput` via:
//
//	LoginProfileMap{ "key": LoginProfileArgs{...} }
type LoginProfileMapInput interface {
	pulumi.Input

	ToLoginProfileMapOutput() LoginProfileMapOutput
	ToLoginProfileMapOutputWithContext(context.Context) LoginProfileMapOutput
}

type LoginProfileMap map[string]LoginProfileInput

func (LoginProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoginProfile)(nil)).Elem()
}

func (i LoginProfileMap) ToLoginProfileMapOutput() LoginProfileMapOutput {
	return i.ToLoginProfileMapOutputWithContext(context.Background())
}

func (i LoginProfileMap) ToLoginProfileMapOutputWithContext(ctx context.Context) LoginProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoginProfileMapOutput)
}

type LoginProfileOutput struct{ *pulumi.OutputState }

func (LoginProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoginProfile)(nil)).Elem()
}

func (o LoginProfileOutput) ToLoginProfileOutput() LoginProfileOutput {
	return o
}

func (o LoginProfileOutput) ToLoginProfileOutputWithContext(ctx context.Context) LoginProfileOutput {
	return o
}

// Creation time.
func (o LoginProfileOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *LoginProfile) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Specifies whether to forcefully enable multi-factor authentication (MFA) for the RAM user. Valid values:
// - true: forcefully enables MFA for the RAM user. The RAM user must bind an MFA device upon the next logon.
// - false (default): does not forcefully enable MFA for the RAM user.
func (o LoginProfileOutput) MfaBindRequired() pulumi.BoolOutput {
	return o.ApplyT(func(v *LoginProfile) pulumi.BoolOutput { return v.MfaBindRequired }).(pulumi.BoolOutput)
}

// The password must meet the Password strength requirements. For more information about password strength setting requirements, see [GetPasswordPolicy](https://help.aliyun.com/document_detail/2337691.html).
func (o LoginProfileOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *LoginProfile) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// Whether the user must reset the password at the next logon. Value:
// - true
// - false (default)
func (o LoginProfileOutput) PasswordResetRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LoginProfile) pulumi.BoolPtrOutput { return v.PasswordResetRequired }).(pulumi.BoolPtrOutput)
}

// The user name.
func (o LoginProfileOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v *LoginProfile) pulumi.StringOutput { return v.UserName }).(pulumi.StringOutput)
}

type LoginProfileArrayOutput struct{ *pulumi.OutputState }

func (LoginProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoginProfile)(nil)).Elem()
}

func (o LoginProfileArrayOutput) ToLoginProfileArrayOutput() LoginProfileArrayOutput {
	return o
}

func (o LoginProfileArrayOutput) ToLoginProfileArrayOutputWithContext(ctx context.Context) LoginProfileArrayOutput {
	return o
}

func (o LoginProfileArrayOutput) Index(i pulumi.IntInput) LoginProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoginProfile {
		return vs[0].([]*LoginProfile)[vs[1].(int)]
	}).(LoginProfileOutput)
}

type LoginProfileMapOutput struct{ *pulumi.OutputState }

func (LoginProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoginProfile)(nil)).Elem()
}

func (o LoginProfileMapOutput) ToLoginProfileMapOutput() LoginProfileMapOutput {
	return o
}

func (o LoginProfileMapOutput) ToLoginProfileMapOutputWithContext(ctx context.Context) LoginProfileMapOutput {
	return o
}

func (o LoginProfileMapOutput) MapIndex(k pulumi.StringInput) LoginProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoginProfile {
		return vs[0].(map[string]*LoginProfile)[vs[1].(string)]
	}).(LoginProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoginProfileInput)(nil)).Elem(), &LoginProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoginProfileArrayInput)(nil)).Elem(), LoginProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoginProfileMapInput)(nil)).Elem(), LoginProfileMap{})
	pulumi.RegisterOutputType(LoginProfileOutput{})
	pulumi.RegisterOutputType(LoginProfileArrayOutput{})
	pulumi.RegisterOutputType(LoginProfileMapOutput{})
}
