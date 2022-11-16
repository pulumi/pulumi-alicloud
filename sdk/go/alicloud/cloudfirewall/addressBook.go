// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudfirewall

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloud Firewall Address Book resource.
//
// For information about Cloud Firewall Address Book and how to use it, see [What is Address Book](https://www.alibabacloud.com/help/en/cloud-firewall/latest/describeaddressbook).
//
// > **NOTE:** Available in v1.178.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cloudfirewall"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudfirewall.NewAddressBook(ctx, "example", &cloudfirewall.AddressBookArgs{
//				AutoAddTagEcs: pulumi.Int(0),
//				Description:   pulumi.String("example_value"),
//				EcsTags: cloudfirewall.AddressBookEcsTagArray{
//					&cloudfirewall.AddressBookEcsTagArgs{
//						TagKey:   pulumi.String("created"),
//						TagValue: pulumi.String("tfTestAcc0"),
//					},
//				},
//				GroupName:   pulumi.String("example_value"),
//				GroupType:   pulumi.String("tag"),
//				TagRelation: pulumi.String("and"),
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
// Cloud Firewall Address Book can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cloudfirewall/addressBook:AddressBook example <id>
//
// ```
type AddressBook struct {
	pulumi.CustomResourceState

	// The list of addresses.
	AddressLists pulumi.StringArrayOutput `pulumi:"addressLists"`
	// Whether you want to automatically add new matching tags of the ECS IP address to the Address Book. Valid values: `0`, `1`.
	AutoAddTagEcs pulumi.IntPtrOutput `pulumi:"autoAddTagEcs"`
	// The description of the Address Book.
	Description pulumi.StringOutput `pulumi:"description"`
	// A list of ECS tags. See the following `Block ecsTags`.
	EcsTags AddressBookEcsTagArrayOutput `pulumi:"ecsTags"`
	// The name of the Address Book.
	GroupName pulumi.StringOutput `pulumi:"groupName"`
	// The type of the Address Book. Valid values:  `ip`, `tag`.
	GroupType pulumi.StringOutput `pulumi:"groupType"`
	// The language of the content within the request and response. Valid values: `en`, `zh`.
	Lang pulumi.StringPtrOutput `pulumi:"lang"`
	// The logical relation among the ECS tags that to be matched. Valid values:
	// - **and**: Only the public IP addresses of ECS instances that match all the specified tags can be added to the Address Book. This is the default value.
	// - **or**: The public IP addresses of ECS instances that match one of the specified tags can be added to the Address Book.
	TagRelation pulumi.StringPtrOutput `pulumi:"tagRelation"`
}

// NewAddressBook registers a new resource with the given unique name, arguments, and options.
func NewAddressBook(ctx *pulumi.Context,
	name string, args *AddressBookArgs, opts ...pulumi.ResourceOption) (*AddressBook, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.GroupName == nil {
		return nil, errors.New("invalid value for required argument 'GroupName'")
	}
	if args.GroupType == nil {
		return nil, errors.New("invalid value for required argument 'GroupType'")
	}
	var resource AddressBook
	err := ctx.RegisterResource("alicloud:cloudfirewall/addressBook:AddressBook", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAddressBook gets an existing AddressBook resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAddressBook(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AddressBookState, opts ...pulumi.ResourceOption) (*AddressBook, error) {
	var resource AddressBook
	err := ctx.ReadResource("alicloud:cloudfirewall/addressBook:AddressBook", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AddressBook resources.
type addressBookState struct {
	// The list of addresses.
	AddressLists []string `pulumi:"addressLists"`
	// Whether you want to automatically add new matching tags of the ECS IP address to the Address Book. Valid values: `0`, `1`.
	AutoAddTagEcs *int `pulumi:"autoAddTagEcs"`
	// The description of the Address Book.
	Description *string `pulumi:"description"`
	// A list of ECS tags. See the following `Block ecsTags`.
	EcsTags []AddressBookEcsTag `pulumi:"ecsTags"`
	// The name of the Address Book.
	GroupName *string `pulumi:"groupName"`
	// The type of the Address Book. Valid values:  `ip`, `tag`.
	GroupType *string `pulumi:"groupType"`
	// The language of the content within the request and response. Valid values: `en`, `zh`.
	Lang *string `pulumi:"lang"`
	// The logical relation among the ECS tags that to be matched. Valid values:
	// - **and**: Only the public IP addresses of ECS instances that match all the specified tags can be added to the Address Book. This is the default value.
	// - **or**: The public IP addresses of ECS instances that match one of the specified tags can be added to the Address Book.
	TagRelation *string `pulumi:"tagRelation"`
}

type AddressBookState struct {
	// The list of addresses.
	AddressLists pulumi.StringArrayInput
	// Whether you want to automatically add new matching tags of the ECS IP address to the Address Book. Valid values: `0`, `1`.
	AutoAddTagEcs pulumi.IntPtrInput
	// The description of the Address Book.
	Description pulumi.StringPtrInput
	// A list of ECS tags. See the following `Block ecsTags`.
	EcsTags AddressBookEcsTagArrayInput
	// The name of the Address Book.
	GroupName pulumi.StringPtrInput
	// The type of the Address Book. Valid values:  `ip`, `tag`.
	GroupType pulumi.StringPtrInput
	// The language of the content within the request and response. Valid values: `en`, `zh`.
	Lang pulumi.StringPtrInput
	// The logical relation among the ECS tags that to be matched. Valid values:
	// - **and**: Only the public IP addresses of ECS instances that match all the specified tags can be added to the Address Book. This is the default value.
	// - **or**: The public IP addresses of ECS instances that match one of the specified tags can be added to the Address Book.
	TagRelation pulumi.StringPtrInput
}

func (AddressBookState) ElementType() reflect.Type {
	return reflect.TypeOf((*addressBookState)(nil)).Elem()
}

type addressBookArgs struct {
	// The list of addresses.
	AddressLists []string `pulumi:"addressLists"`
	// Whether you want to automatically add new matching tags of the ECS IP address to the Address Book. Valid values: `0`, `1`.
	AutoAddTagEcs *int `pulumi:"autoAddTagEcs"`
	// The description of the Address Book.
	Description string `pulumi:"description"`
	// A list of ECS tags. See the following `Block ecsTags`.
	EcsTags []AddressBookEcsTag `pulumi:"ecsTags"`
	// The name of the Address Book.
	GroupName string `pulumi:"groupName"`
	// The type of the Address Book. Valid values:  `ip`, `tag`.
	GroupType string `pulumi:"groupType"`
	// The language of the content within the request and response. Valid values: `en`, `zh`.
	Lang *string `pulumi:"lang"`
	// The logical relation among the ECS tags that to be matched. Valid values:
	// - **and**: Only the public IP addresses of ECS instances that match all the specified tags can be added to the Address Book. This is the default value.
	// - **or**: The public IP addresses of ECS instances that match one of the specified tags can be added to the Address Book.
	TagRelation *string `pulumi:"tagRelation"`
}

// The set of arguments for constructing a AddressBook resource.
type AddressBookArgs struct {
	// The list of addresses.
	AddressLists pulumi.StringArrayInput
	// Whether you want to automatically add new matching tags of the ECS IP address to the Address Book. Valid values: `0`, `1`.
	AutoAddTagEcs pulumi.IntPtrInput
	// The description of the Address Book.
	Description pulumi.StringInput
	// A list of ECS tags. See the following `Block ecsTags`.
	EcsTags AddressBookEcsTagArrayInput
	// The name of the Address Book.
	GroupName pulumi.StringInput
	// The type of the Address Book. Valid values:  `ip`, `tag`.
	GroupType pulumi.StringInput
	// The language of the content within the request and response. Valid values: `en`, `zh`.
	Lang pulumi.StringPtrInput
	// The logical relation among the ECS tags that to be matched. Valid values:
	// - **and**: Only the public IP addresses of ECS instances that match all the specified tags can be added to the Address Book. This is the default value.
	// - **or**: The public IP addresses of ECS instances that match one of the specified tags can be added to the Address Book.
	TagRelation pulumi.StringPtrInput
}

func (AddressBookArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*addressBookArgs)(nil)).Elem()
}

type AddressBookInput interface {
	pulumi.Input

	ToAddressBookOutput() AddressBookOutput
	ToAddressBookOutputWithContext(ctx context.Context) AddressBookOutput
}

func (*AddressBook) ElementType() reflect.Type {
	return reflect.TypeOf((**AddressBook)(nil)).Elem()
}

func (i *AddressBook) ToAddressBookOutput() AddressBookOutput {
	return i.ToAddressBookOutputWithContext(context.Background())
}

func (i *AddressBook) ToAddressBookOutputWithContext(ctx context.Context) AddressBookOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddressBookOutput)
}

// AddressBookArrayInput is an input type that accepts AddressBookArray and AddressBookArrayOutput values.
// You can construct a concrete instance of `AddressBookArrayInput` via:
//
//	AddressBookArray{ AddressBookArgs{...} }
type AddressBookArrayInput interface {
	pulumi.Input

	ToAddressBookArrayOutput() AddressBookArrayOutput
	ToAddressBookArrayOutputWithContext(context.Context) AddressBookArrayOutput
}

type AddressBookArray []AddressBookInput

func (AddressBookArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AddressBook)(nil)).Elem()
}

func (i AddressBookArray) ToAddressBookArrayOutput() AddressBookArrayOutput {
	return i.ToAddressBookArrayOutputWithContext(context.Background())
}

func (i AddressBookArray) ToAddressBookArrayOutputWithContext(ctx context.Context) AddressBookArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddressBookArrayOutput)
}

// AddressBookMapInput is an input type that accepts AddressBookMap and AddressBookMapOutput values.
// You can construct a concrete instance of `AddressBookMapInput` via:
//
//	AddressBookMap{ "key": AddressBookArgs{...} }
type AddressBookMapInput interface {
	pulumi.Input

	ToAddressBookMapOutput() AddressBookMapOutput
	ToAddressBookMapOutputWithContext(context.Context) AddressBookMapOutput
}

type AddressBookMap map[string]AddressBookInput

func (AddressBookMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AddressBook)(nil)).Elem()
}

func (i AddressBookMap) ToAddressBookMapOutput() AddressBookMapOutput {
	return i.ToAddressBookMapOutputWithContext(context.Background())
}

func (i AddressBookMap) ToAddressBookMapOutputWithContext(ctx context.Context) AddressBookMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddressBookMapOutput)
}

type AddressBookOutput struct{ *pulumi.OutputState }

func (AddressBookOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AddressBook)(nil)).Elem()
}

func (o AddressBookOutput) ToAddressBookOutput() AddressBookOutput {
	return o
}

func (o AddressBookOutput) ToAddressBookOutputWithContext(ctx context.Context) AddressBookOutput {
	return o
}

// The list of addresses.
func (o AddressBookOutput) AddressLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AddressBook) pulumi.StringArrayOutput { return v.AddressLists }).(pulumi.StringArrayOutput)
}

// Whether you want to automatically add new matching tags of the ECS IP address to the Address Book. Valid values: `0`, `1`.
func (o AddressBookOutput) AutoAddTagEcs() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AddressBook) pulumi.IntPtrOutput { return v.AutoAddTagEcs }).(pulumi.IntPtrOutput)
}

// The description of the Address Book.
func (o AddressBookOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *AddressBook) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// A list of ECS tags. See the following `Block ecsTags`.
func (o AddressBookOutput) EcsTags() AddressBookEcsTagArrayOutput {
	return o.ApplyT(func(v *AddressBook) AddressBookEcsTagArrayOutput { return v.EcsTags }).(AddressBookEcsTagArrayOutput)
}

// The name of the Address Book.
func (o AddressBookOutput) GroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *AddressBook) pulumi.StringOutput { return v.GroupName }).(pulumi.StringOutput)
}

// The type of the Address Book. Valid values:  `ip`, `tag`.
func (o AddressBookOutput) GroupType() pulumi.StringOutput {
	return o.ApplyT(func(v *AddressBook) pulumi.StringOutput { return v.GroupType }).(pulumi.StringOutput)
}

// The language of the content within the request and response. Valid values: `en`, `zh`.
func (o AddressBookOutput) Lang() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AddressBook) pulumi.StringPtrOutput { return v.Lang }).(pulumi.StringPtrOutput)
}

// The logical relation among the ECS tags that to be matched. Valid values:
// - **and**: Only the public IP addresses of ECS instances that match all the specified tags can be added to the Address Book. This is the default value.
// - **or**: The public IP addresses of ECS instances that match one of the specified tags can be added to the Address Book.
func (o AddressBookOutput) TagRelation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AddressBook) pulumi.StringPtrOutput { return v.TagRelation }).(pulumi.StringPtrOutput)
}

type AddressBookArrayOutput struct{ *pulumi.OutputState }

func (AddressBookArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AddressBook)(nil)).Elem()
}

func (o AddressBookArrayOutput) ToAddressBookArrayOutput() AddressBookArrayOutput {
	return o
}

func (o AddressBookArrayOutput) ToAddressBookArrayOutputWithContext(ctx context.Context) AddressBookArrayOutput {
	return o
}

func (o AddressBookArrayOutput) Index(i pulumi.IntInput) AddressBookOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AddressBook {
		return vs[0].([]*AddressBook)[vs[1].(int)]
	}).(AddressBookOutput)
}

type AddressBookMapOutput struct{ *pulumi.OutputState }

func (AddressBookMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AddressBook)(nil)).Elem()
}

func (o AddressBookMapOutput) ToAddressBookMapOutput() AddressBookMapOutput {
	return o
}

func (o AddressBookMapOutput) ToAddressBookMapOutputWithContext(ctx context.Context) AddressBookMapOutput {
	return o
}

func (o AddressBookMapOutput) MapIndex(k pulumi.StringInput) AddressBookOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AddressBook {
		return vs[0].(map[string]*AddressBook)[vs[1].(string)]
	}).(AddressBookOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AddressBookInput)(nil)).Elem(), &AddressBook{})
	pulumi.RegisterInputType(reflect.TypeOf((*AddressBookArrayInput)(nil)).Elem(), AddressBookArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AddressBookMapInput)(nil)).Elem(), AddressBookMap{})
	pulumi.RegisterOutputType(AddressBookOutput{})
	pulumi.RegisterOutputType(AddressBookArrayOutput{})
	pulumi.RegisterOutputType(AddressBookMapOutput{})
}