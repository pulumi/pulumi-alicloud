// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bastionhost

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Bastion Host Account Share Key Attachment resource.
//
// For information about Bastion Host Host Account Share Key Attachment and how to use it, see [What is Host Account Share Key Attachment](https://www.alibabacloud.com/help/en/bastion-host/latest/attachhostaccountstohostsharekey).
//
// > **NOTE:** Available since v1.165.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/bastionhost"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf_example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_default, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetNetworks, err := vpc.GetNetworks(ctx, &vpc.GetNetworksArgs{
//				NameRegex: pulumi.StringRef("^default-NODELETING$"),
//				CidrBlock: pulumi.StringRef("10.4.0.0/16"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultGetSwitches, err := vpc.GetSwitches(ctx, &vpc.GetSwitchesArgs{
//				CidrBlock: pulumi.StringRef("10.4.0.0/24"),
//				VpcId:     pulumi.StringRef(defaultGetNetworks.Ids[0]),
//				ZoneId:    pulumi.StringRef(_default.Zones[0].Id),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultSecurityGroup, err := ecs.NewSecurityGroup(ctx, "default", &ecs.SecurityGroupArgs{
//				VpcId: pulumi.String(defaultGetNetworks.Ids[0]),
//			})
//			if err != nil {
//				return err
//			}
//			defaultInstance, err := bastionhost.NewInstance(ctx, "default", &bastionhost.InstanceArgs{
//				Description: pulumi.String(name),
//				LicenseCode: pulumi.String("bhah_ent_50_asset"),
//				PlanCode:    pulumi.String("cloudbastion"),
//				Storage:     pulumi.String("5"),
//				Bandwidth:   pulumi.String("5"),
//				Period:      pulumi.Int(1),
//				VswitchId:   pulumi.String(defaultGetSwitches.Ids[0]),
//				SecurityGroupIds: pulumi.StringArray{
//					defaultSecurityGroup.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			defaultHost, err := bastionhost.NewHost(ctx, "default", &bastionhost.HostArgs{
//				InstanceId:         defaultInstance.ID(),
//				HostName:           pulumi.String(name),
//				ActiveAddressType:  pulumi.String("Private"),
//				HostPrivateAddress: pulumi.String("172.16.0.10"),
//				OsType:             pulumi.String("Linux"),
//				Source:             pulumi.String("Local"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultHostAccount, err := bastionhost.NewHostAccount(ctx, "default", &bastionhost.HostAccountArgs{
//				HostAccountName: pulumi.String(name),
//				HostId:          defaultHost.HostId,
//				InstanceId:      defaultHost.InstanceId,
//				ProtocolName:    pulumi.String("SSH"),
//				Password:        pulumi.String("YourPassword12345"),
//			})
//			if err != nil {
//				return err
//			}
//			privateKey := "LS0tLS1CRUdJTiBSU0EgUFJJVkFURSBLRVktLS0tLQpNSUlFcEFJQkFBS0NBUUVBc25oc29SSVVwVXltSG1FVHJXUGxDbkhMa3c3N0JYTm44ZHcvbDg3eG10SUhjd2syCkRybjFDZk5jZkpJV0tSdkFaYkdKMlZTS1RiRDhPTmcyT3JvUHFGUHBLOHJ5QjJRb1NYQVRsaUVHWFhNeW1tRm8KeDBmem12THFscUxpNGZnOExhcTc5UC85aGxLU1djTWhJU0pYVTNHMS9KdEFBUmEyQXc4cXEzSVQvMkZ5NktrdwowMU9MdDdLN2pGUFRPaHhtdmNoSkZ1SVo1YXI0cW5HUlFHQnpCL2hoRHVIWEMwRlhJZ2ozd0NXMDZ4R2V2WjJyCmNCWWwwN1luL2lvZk95MU0wRjZZN0JrMU95N21vYndzM1JsalUyL2FpZlhLMmNOUlk2Qjl5WXNvd1RBZmQ5OTQKQ2YxSlF3TlhsaUZCeTZueEJLQk1YbDhIU1grS1o3L29PUlIwVXdJREFRQUJBb0lCQVFDbU5JSXR5ckhSY3oxdApJMGo0L0FQc295ZE1EL0owRkJMa2FoSUxKWjFaYW1tbmx4ZHh4WHBQUndXRnVXTEw2OTFVbDI5aUoxb1ptazU1Ci9ka2EvZlhnOUN3OUxXWVN2aExLdVlaMEZOTmhxZ3VoUEVBZy9uLytlR1ZCM2ZYZkxaZVZpK0E0L1VHMG15ZFMKVXVlQ2ZRSElZeWh4VkgvWnc3WER5WmNhVFVZVVdMUWlYcVN0Y2JRbnZFOXpwOGc5TWh5UkhBcWYwbEt2UTRqdwphUnNKTnlob3lhZWcvUXlFeHVYNGdBR1lIc1lTSDRFVmtXOHl5WE1aOHpRdk1OSUNiYXhmUkRuSngybUh6a09rCnFHczVXbFp5L3VrQk5jWTQwd2Y0eTY2bEVJaVpKbiswaFhtSTF4Tk5SdHRwMjZnY3ROOXZWbmVicTdLTnpjTDgKeFQrMXZJaEpBb0dCQU9iMVM1YlE4NVRFWDBoZTRmdXc2R3ExbnhRLzJUSU03emZhK2VhZThPQlh2eVNFV3JpdwpPZzM3RFhVUDFNVU1iTEJRenE0STl1dE5YSVZadEFLR0h6ZDR6WmtQeGxORjZPN0FyWnJEWElDNEdKZHdmSEhxCjJZcDkxUDlWekJlOVhkTVdZVGFCNkMzWVdtYzQwM08vYWdyRCtNb2JnL0hqMSt0d2xZR2hjdlV2QW9HQkFNWFMKT2VnWHc5VUF3VEZabFBtZzZKeDI3TzNXUFBHd1E3QzRnYitFZzZkR1pLRnJVR1ZId2VUUG1HaGtwN1BmYU5ESwplaFVoUWFnNm9XOTF4dkE2YldZZ29SQmczUWkxc01MblRWeTExeVN1UEVFSCtMT2s1N3d2akNLSk5XZnM0SjVyCmg1NGw0QXZ6UVhyWWN0UlZkSmYrNjFacGFnTkdZMVBvWVJMTHJMSWRBb0dBTndydzErRzJtNWJ0YW04S2hwU1QKMzVLbmRnajlkM3N6cStrcE03aGZpZWYvcXZGTU9jWHVJQlRjRVRFVHNWNlRyTFdsZkQ2d3NrVitybDFCbEhSbwpqaXpoT3dCU2NOZ3hlbTA3TXE0cXBwYTViYVltVW5QNUlwTjRwdDNJeFVPaFQ4UitxS0h2TnJYZ1hjZGlSYXl4CjFoejhkeFoxckxselpTNHd3M001MVlzQ2dZRUFpUDEwTEUySXg5Q2wrTTdZWTZZU2I0Zkx1MGhKRy9XOGFuemIKSFExZlBrOTVFRytJVlJyRUl2ZS95MHNvOTE4VzdyL0lteWxVbG5ORHFEUWZkK3grSmVNaXBuenRsRUorRGZxdgprQ3c4dUtJUUI5akZXV0l4T0JpVktyVnB6bll6ZG9Gd2dRd3BneDBKazFDZzlIblpMQWpVWUJyUDEwUy9ORFFRClJUdldjK0VDZ1lBeGRIZWxQNG1RdkJaS1oxMlNKbHlLbFVLeW43aHhzSHVkMkphMVNtS3FWeHBERDNlR0w0Y3QKZXA1QTZ5NkF4eGViZkI0aDdYNEZ0QTBBRURPdkZDR0J1QlRvZ3ZBdUNDVUtqK2JIUG1SNG53UVYzcWZ2M3loRAp0TGkwU2FHVElta2wvbUNCUDhZaW9JUys2N0xjby9kbHphUTNGVDlxTnJieFdFWjJlaS9LVlE9PQotLS0tLUVORCBSU0EgUFJJVkFURSBLRVktLS0tLQ=="
//			if param := cfg.Get("privateKey"); param != "" {
//				privateKey = param
//			}
//			defaultHostShareKey, err := bastionhost.NewHostShareKey(ctx, "default", &bastionhost.HostShareKeyArgs{
//				HostShareKeyName: pulumi.String(name),
//				InstanceId:       defaultInstance.ID(),
//				PrivateKey:       pulumi.String(privateKey),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = bastionhost.NewHostAccountShareKeyAttachment(ctx, "default", &bastionhost.HostAccountShareKeyAttachmentArgs{
//				InstanceId:     defaultInstance.ID(),
//				HostShareKeyId: defaultHostShareKey.HostShareKeyId,
//				HostAccountId:  defaultHostAccount.HostAccountId,
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
// Bastion Host Account Share Key Attachment can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:bastionhost/hostAccountShareKeyAttachment:HostAccountShareKeyAttachment example <instance_id>:<host_share_key_id>:<host_account_id>
// ```
type HostAccountShareKeyAttachment struct {
	pulumi.CustomResourceState

	// The ID list of the host account.
	HostAccountId pulumi.StringOutput `pulumi:"hostAccountId"`
	// The ID of the host shared key.
	HostShareKeyId pulumi.StringOutput `pulumi:"hostShareKeyId"`
	// The ID of the Bastion machine instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
}

// NewHostAccountShareKeyAttachment registers a new resource with the given unique name, arguments, and options.
func NewHostAccountShareKeyAttachment(ctx *pulumi.Context,
	name string, args *HostAccountShareKeyAttachmentArgs, opts ...pulumi.ResourceOption) (*HostAccountShareKeyAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HostAccountId == nil {
		return nil, errors.New("invalid value for required argument 'HostAccountId'")
	}
	if args.HostShareKeyId == nil {
		return nil, errors.New("invalid value for required argument 'HostShareKeyId'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HostAccountShareKeyAttachment
	err := ctx.RegisterResource("alicloud:bastionhost/hostAccountShareKeyAttachment:HostAccountShareKeyAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHostAccountShareKeyAttachment gets an existing HostAccountShareKeyAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHostAccountShareKeyAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HostAccountShareKeyAttachmentState, opts ...pulumi.ResourceOption) (*HostAccountShareKeyAttachment, error) {
	var resource HostAccountShareKeyAttachment
	err := ctx.ReadResource("alicloud:bastionhost/hostAccountShareKeyAttachment:HostAccountShareKeyAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HostAccountShareKeyAttachment resources.
type hostAccountShareKeyAttachmentState struct {
	// The ID list of the host account.
	HostAccountId *string `pulumi:"hostAccountId"`
	// The ID of the host shared key.
	HostShareKeyId *string `pulumi:"hostShareKeyId"`
	// The ID of the Bastion machine instance.
	InstanceId *string `pulumi:"instanceId"`
}

type HostAccountShareKeyAttachmentState struct {
	// The ID list of the host account.
	HostAccountId pulumi.StringPtrInput
	// The ID of the host shared key.
	HostShareKeyId pulumi.StringPtrInput
	// The ID of the Bastion machine instance.
	InstanceId pulumi.StringPtrInput
}

func (HostAccountShareKeyAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*hostAccountShareKeyAttachmentState)(nil)).Elem()
}

type hostAccountShareKeyAttachmentArgs struct {
	// The ID list of the host account.
	HostAccountId string `pulumi:"hostAccountId"`
	// The ID of the host shared key.
	HostShareKeyId string `pulumi:"hostShareKeyId"`
	// The ID of the Bastion machine instance.
	InstanceId string `pulumi:"instanceId"`
}

// The set of arguments for constructing a HostAccountShareKeyAttachment resource.
type HostAccountShareKeyAttachmentArgs struct {
	// The ID list of the host account.
	HostAccountId pulumi.StringInput
	// The ID of the host shared key.
	HostShareKeyId pulumi.StringInput
	// The ID of the Bastion machine instance.
	InstanceId pulumi.StringInput
}

func (HostAccountShareKeyAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hostAccountShareKeyAttachmentArgs)(nil)).Elem()
}

type HostAccountShareKeyAttachmentInput interface {
	pulumi.Input

	ToHostAccountShareKeyAttachmentOutput() HostAccountShareKeyAttachmentOutput
	ToHostAccountShareKeyAttachmentOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentOutput
}

func (*HostAccountShareKeyAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**HostAccountShareKeyAttachment)(nil)).Elem()
}

func (i *HostAccountShareKeyAttachment) ToHostAccountShareKeyAttachmentOutput() HostAccountShareKeyAttachmentOutput {
	return i.ToHostAccountShareKeyAttachmentOutputWithContext(context.Background())
}

func (i *HostAccountShareKeyAttachment) ToHostAccountShareKeyAttachmentOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostAccountShareKeyAttachmentOutput)
}

// HostAccountShareKeyAttachmentArrayInput is an input type that accepts HostAccountShareKeyAttachmentArray and HostAccountShareKeyAttachmentArrayOutput values.
// You can construct a concrete instance of `HostAccountShareKeyAttachmentArrayInput` via:
//
//	HostAccountShareKeyAttachmentArray{ HostAccountShareKeyAttachmentArgs{...} }
type HostAccountShareKeyAttachmentArrayInput interface {
	pulumi.Input

	ToHostAccountShareKeyAttachmentArrayOutput() HostAccountShareKeyAttachmentArrayOutput
	ToHostAccountShareKeyAttachmentArrayOutputWithContext(context.Context) HostAccountShareKeyAttachmentArrayOutput
}

type HostAccountShareKeyAttachmentArray []HostAccountShareKeyAttachmentInput

func (HostAccountShareKeyAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostAccountShareKeyAttachment)(nil)).Elem()
}

func (i HostAccountShareKeyAttachmentArray) ToHostAccountShareKeyAttachmentArrayOutput() HostAccountShareKeyAttachmentArrayOutput {
	return i.ToHostAccountShareKeyAttachmentArrayOutputWithContext(context.Background())
}

func (i HostAccountShareKeyAttachmentArray) ToHostAccountShareKeyAttachmentArrayOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostAccountShareKeyAttachmentArrayOutput)
}

// HostAccountShareKeyAttachmentMapInput is an input type that accepts HostAccountShareKeyAttachmentMap and HostAccountShareKeyAttachmentMapOutput values.
// You can construct a concrete instance of `HostAccountShareKeyAttachmentMapInput` via:
//
//	HostAccountShareKeyAttachmentMap{ "key": HostAccountShareKeyAttachmentArgs{...} }
type HostAccountShareKeyAttachmentMapInput interface {
	pulumi.Input

	ToHostAccountShareKeyAttachmentMapOutput() HostAccountShareKeyAttachmentMapOutput
	ToHostAccountShareKeyAttachmentMapOutputWithContext(context.Context) HostAccountShareKeyAttachmentMapOutput
}

type HostAccountShareKeyAttachmentMap map[string]HostAccountShareKeyAttachmentInput

func (HostAccountShareKeyAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostAccountShareKeyAttachment)(nil)).Elem()
}

func (i HostAccountShareKeyAttachmentMap) ToHostAccountShareKeyAttachmentMapOutput() HostAccountShareKeyAttachmentMapOutput {
	return i.ToHostAccountShareKeyAttachmentMapOutputWithContext(context.Background())
}

func (i HostAccountShareKeyAttachmentMap) ToHostAccountShareKeyAttachmentMapOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostAccountShareKeyAttachmentMapOutput)
}

type HostAccountShareKeyAttachmentOutput struct{ *pulumi.OutputState }

func (HostAccountShareKeyAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HostAccountShareKeyAttachment)(nil)).Elem()
}

func (o HostAccountShareKeyAttachmentOutput) ToHostAccountShareKeyAttachmentOutput() HostAccountShareKeyAttachmentOutput {
	return o
}

func (o HostAccountShareKeyAttachmentOutput) ToHostAccountShareKeyAttachmentOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentOutput {
	return o
}

// The ID list of the host account.
func (o HostAccountShareKeyAttachmentOutput) HostAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostAccountShareKeyAttachment) pulumi.StringOutput { return v.HostAccountId }).(pulumi.StringOutput)
}

// The ID of the host shared key.
func (o HostAccountShareKeyAttachmentOutput) HostShareKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostAccountShareKeyAttachment) pulumi.StringOutput { return v.HostShareKeyId }).(pulumi.StringOutput)
}

// The ID of the Bastion machine instance.
func (o HostAccountShareKeyAttachmentOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostAccountShareKeyAttachment) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

type HostAccountShareKeyAttachmentArrayOutput struct{ *pulumi.OutputState }

func (HostAccountShareKeyAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostAccountShareKeyAttachment)(nil)).Elem()
}

func (o HostAccountShareKeyAttachmentArrayOutput) ToHostAccountShareKeyAttachmentArrayOutput() HostAccountShareKeyAttachmentArrayOutput {
	return o
}

func (o HostAccountShareKeyAttachmentArrayOutput) ToHostAccountShareKeyAttachmentArrayOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentArrayOutput {
	return o
}

func (o HostAccountShareKeyAttachmentArrayOutput) Index(i pulumi.IntInput) HostAccountShareKeyAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HostAccountShareKeyAttachment {
		return vs[0].([]*HostAccountShareKeyAttachment)[vs[1].(int)]
	}).(HostAccountShareKeyAttachmentOutput)
}

type HostAccountShareKeyAttachmentMapOutput struct{ *pulumi.OutputState }

func (HostAccountShareKeyAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostAccountShareKeyAttachment)(nil)).Elem()
}

func (o HostAccountShareKeyAttachmentMapOutput) ToHostAccountShareKeyAttachmentMapOutput() HostAccountShareKeyAttachmentMapOutput {
	return o
}

func (o HostAccountShareKeyAttachmentMapOutput) ToHostAccountShareKeyAttachmentMapOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentMapOutput {
	return o
}

func (o HostAccountShareKeyAttachmentMapOutput) MapIndex(k pulumi.StringInput) HostAccountShareKeyAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HostAccountShareKeyAttachment {
		return vs[0].(map[string]*HostAccountShareKeyAttachment)[vs[1].(string)]
	}).(HostAccountShareKeyAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HostAccountShareKeyAttachmentInput)(nil)).Elem(), &HostAccountShareKeyAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostAccountShareKeyAttachmentArrayInput)(nil)).Elem(), HostAccountShareKeyAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostAccountShareKeyAttachmentMapInput)(nil)).Elem(), HostAccountShareKeyAttachmentMap{})
	pulumi.RegisterOutputType(HostAccountShareKeyAttachmentOutput{})
	pulumi.RegisterOutputType(HostAccountShareKeyAttachmentArrayOutput{})
	pulumi.RegisterOutputType(HostAccountShareKeyAttachmentMapOutput{})
}
