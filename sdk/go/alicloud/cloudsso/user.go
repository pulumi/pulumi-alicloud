// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudsso

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloud SSO User resource.
//
// For information about Cloud SSO User and how to use it, see [What is User](https://www.alibabacloud.com/help/en/cloudsso/latest/api-cloudsso-2021-05-15-createuser).
//
// > **NOTE:** Available since v1.140.0.
//
// > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
//
// ## Import
//
// Cloud SSO User can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:cloudsso/user:User example <directory_id>:<user_id>
// ```
type User struct {
	pulumi.CustomResourceState

	// The description of user. The description can be up to `1024` characters long.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the Directory.
	DirectoryId pulumi.StringOutput `pulumi:"directoryId"`
	// The display name of user. The display name can be up to `256` characters long.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// The User's Contact Email Address. The email can be up to `128` characters long.
	Email pulumi.StringPtrOutput `pulumi:"email"`
	// The first name of user. The firstName can be up to `64` characters long.
	FirstName pulumi.StringPtrOutput `pulumi:"firstName"`
	// The last name of user. The lastName can be up to `64` characters long.
	LastName pulumi.StringPtrOutput `pulumi:"lastName"`
	// The status of user. Valid values: `Disabled`, `Enabled`.
	Status pulumi.StringOutput `pulumi:"status"`
	// The User ID of the group.
	UserId pulumi.StringOutput `pulumi:"userId"`
	// The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
	UserName pulumi.StringOutput `pulumi:"userName"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DirectoryId == nil {
		return nil, errors.New("invalid value for required argument 'DirectoryId'")
	}
	if args.UserName == nil {
		return nil, errors.New("invalid value for required argument 'UserName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource User
	err := ctx.RegisterResource("alicloud:cloudsso/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("alicloud:cloudsso/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// The description of user. The description can be up to `1024` characters long.
	Description *string `pulumi:"description"`
	// The ID of the Directory.
	DirectoryId *string `pulumi:"directoryId"`
	// The display name of user. The display name can be up to `256` characters long.
	DisplayName *string `pulumi:"displayName"`
	// The User's Contact Email Address. The email can be up to `128` characters long.
	Email *string `pulumi:"email"`
	// The first name of user. The firstName can be up to `64` characters long.
	FirstName *string `pulumi:"firstName"`
	// The last name of user. The lastName can be up to `64` characters long.
	LastName *string `pulumi:"lastName"`
	// The status of user. Valid values: `Disabled`, `Enabled`.
	Status *string `pulumi:"status"`
	// The User ID of the group.
	UserId *string `pulumi:"userId"`
	// The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
	UserName *string `pulumi:"userName"`
}

type UserState struct {
	// The description of user. The description can be up to `1024` characters long.
	Description pulumi.StringPtrInput
	// The ID of the Directory.
	DirectoryId pulumi.StringPtrInput
	// The display name of user. The display name can be up to `256` characters long.
	DisplayName pulumi.StringPtrInput
	// The User's Contact Email Address. The email can be up to `128` characters long.
	Email pulumi.StringPtrInput
	// The first name of user. The firstName can be up to `64` characters long.
	FirstName pulumi.StringPtrInput
	// The last name of user. The lastName can be up to `64` characters long.
	LastName pulumi.StringPtrInput
	// The status of user. Valid values: `Disabled`, `Enabled`.
	Status pulumi.StringPtrInput
	// The User ID of the group.
	UserId pulumi.StringPtrInput
	// The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
	UserName pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// The description of user. The description can be up to `1024` characters long.
	Description *string `pulumi:"description"`
	// The ID of the Directory.
	DirectoryId string `pulumi:"directoryId"`
	// The display name of user. The display name can be up to `256` characters long.
	DisplayName *string `pulumi:"displayName"`
	// The User's Contact Email Address. The email can be up to `128` characters long.
	Email *string `pulumi:"email"`
	// The first name of user. The firstName can be up to `64` characters long.
	FirstName *string `pulumi:"firstName"`
	// The last name of user. The lastName can be up to `64` characters long.
	LastName *string `pulumi:"lastName"`
	// The status of user. Valid values: `Disabled`, `Enabled`.
	Status *string `pulumi:"status"`
	// The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
	UserName string `pulumi:"userName"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// The description of user. The description can be up to `1024` characters long.
	Description pulumi.StringPtrInput
	// The ID of the Directory.
	DirectoryId pulumi.StringInput
	// The display name of user. The display name can be up to `256` characters long.
	DisplayName pulumi.StringPtrInput
	// The User's Contact Email Address. The email can be up to `128` characters long.
	Email pulumi.StringPtrInput
	// The first name of user. The firstName can be up to `64` characters long.
	FirstName pulumi.StringPtrInput
	// The last name of user. The lastName can be up to `64` characters long.
	LastName pulumi.StringPtrInput
	// The status of user. Valid values: `Disabled`, `Enabled`.
	Status pulumi.StringPtrInput
	// The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
	UserName pulumi.StringInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//	UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//	UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

// The description of user. The description can be up to `1024` characters long.
func (o UserOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ID of the Directory.
func (o UserOutput) DirectoryId() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.DirectoryId }).(pulumi.StringOutput)
}

// The display name of user. The display name can be up to `256` characters long.
func (o UserOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// The User's Contact Email Address. The email can be up to `128` characters long.
func (o UserOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Email }).(pulumi.StringPtrOutput)
}

// The first name of user. The firstName can be up to `64` characters long.
func (o UserOutput) FirstName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.FirstName }).(pulumi.StringPtrOutput)
}

// The last name of user. The lastName can be up to `64` characters long.
func (o UserOutput) LastName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.LastName }).(pulumi.StringPtrOutput)
}

// The status of user. Valid values: `Disabled`, `Enabled`.
func (o UserOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The User ID of the group.
func (o UserOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

// The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
func (o UserOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.UserName }).(pulumi.StringOutput)
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *User {
		return vs[0].([]*User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *User {
		return vs[0].(map[string]*User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
