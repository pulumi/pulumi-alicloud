// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a File Storage (NAS) Mount Target resource.
//
// File system mount point.
//
// For information about File Storage (NAS) Mount Target and how to use it, see [What is Mount Target](https://www.alibabacloud.com/help/en/doc-detail/27531.htm).
//
// > **NOTE:** Available since v1.34.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/nas"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := nas.GetZones(ctx, &nas.GetZonesArgs{
//				FileSystemType: pulumi.StringRef("extreme"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			countSize := len(_default.Zones)
//			zoneId := countSize.ApplyT(func(countSize int) (nas.GetZonesZone, error) {
//				return nas.GetZonesZone(_default.Zones[countSize-1]), nil
//			}).(nas.GetZonesZoneOutput).ApplyT(func(obj nas.GetZonesZone) (*string, error) {
//				return obj.ZoneId, nil
//			}).(pulumi.StringPtrOutput)
//			example, err := vpc.NewNetwork(ctx, "example", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("terraform-example"),
//				CidrBlock: pulumi.String("172.17.3.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSwitch, err := vpc.NewSwitch(ctx, "example", &vpc.SwitchArgs{
//				VswitchName: example.VpcName,
//				CidrBlock:   example.CidrBlock,
//				VpcId:       example.ID(),
//				ZoneId:      pulumi.String(zoneId),
//			})
//			if err != nil {
//				return err
//			}
//			exampleFileSystem, err := nas.NewFileSystem(ctx, "example", &nas.FileSystemArgs{
//				ProtocolType:   pulumi.String("NFS"),
//				StorageType:    pulumi.String("advance"),
//				FileSystemType: pulumi.String("extreme"),
//				Capacity:       pulumi.Int(100),
//				ZoneId:         pulumi.String(zoneId),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccessGroup, err := nas.NewAccessGroup(ctx, "example", &nas.AccessGroupArgs{
//				AccessGroupName: pulumi.String("access_group_xxx"),
//				AccessGroupType: pulumi.String("Vpc"),
//				Description:     pulumi.String("test_access_group"),
//				FileSystemType:  pulumi.String("extreme"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = nas.NewMountTarget(ctx, "example", &nas.MountTargetArgs{
//				FileSystemId:    exampleFileSystem.ID(),
//				AccessGroupName: exampleAccessGroup.AccessGroupName,
//				VswitchId:       exampleSwitch.ID(),
//				VpcId:           example.ID(),
//				NetworkType:     exampleAccessGroup.AccessGroupType,
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
// File Storage (NAS) Mount Target can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:nas/mountTarget:MountTarget example <file_system_id>:<mount_target_domain>
// ```
type MountTarget struct {
	pulumi.CustomResourceState

	// The name of the permission group.
	AccessGroupName pulumi.StringPtrOutput `pulumi:"accessGroupName"`
	// Whether to create an IPv6 mount point.
	//
	// Value:
	// - true: create
	// - false (default): not created
	//
	// > **NOTE:**  currently, only extreme NAS supports IPv6 function in various regions in mainland China, and IPv6 function needs to be turned on for this file system.
	DualStack pulumi.BoolPtrOutput `pulumi:"dualStack"`
	// The ID of the file system.
	FileSystemId pulumi.StringOutput `pulumi:"fileSystemId"`
	// The domain name of the Mount point.
	MountTargetDomain pulumi.StringOutput `pulumi:"mountTargetDomain"`
	// Network type.
	NetworkType pulumi.StringOutput `pulumi:"networkType"`
	// The ID of the security group.
	SecurityGroupId pulumi.StringPtrOutput `pulumi:"securityGroupId"`
	// The current status of the Mount point, including Active and Inactive, can be used to mount the file system only when the status is Active.
	Status pulumi.StringOutput `pulumi:"status"`
	// VPC ID.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
	// The ID of the switch.
	VswitchId pulumi.StringPtrOutput `pulumi:"vswitchId"`
}

// NewMountTarget registers a new resource with the given unique name, arguments, and options.
func NewMountTarget(ctx *pulumi.Context,
	name string, args *MountTargetArgs, opts ...pulumi.ResourceOption) (*MountTarget, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FileSystemId == nil {
		return nil, errors.New("invalid value for required argument 'FileSystemId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MountTarget
	err := ctx.RegisterResource("alicloud:nas/mountTarget:MountTarget", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMountTarget gets an existing MountTarget resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMountTarget(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MountTargetState, opts ...pulumi.ResourceOption) (*MountTarget, error) {
	var resource MountTarget
	err := ctx.ReadResource("alicloud:nas/mountTarget:MountTarget", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MountTarget resources.
type mountTargetState struct {
	// The name of the permission group.
	AccessGroupName *string `pulumi:"accessGroupName"`
	// Whether to create an IPv6 mount point.
	//
	// Value:
	// - true: create
	// - false (default): not created
	//
	// > **NOTE:**  currently, only extreme NAS supports IPv6 function in various regions in mainland China, and IPv6 function needs to be turned on for this file system.
	DualStack *bool `pulumi:"dualStack"`
	// The ID of the file system.
	FileSystemId *string `pulumi:"fileSystemId"`
	// The domain name of the Mount point.
	MountTargetDomain *string `pulumi:"mountTargetDomain"`
	// Network type.
	NetworkType *string `pulumi:"networkType"`
	// The ID of the security group.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// The current status of the Mount point, including Active and Inactive, can be used to mount the file system only when the status is Active.
	Status *string `pulumi:"status"`
	// VPC ID.
	VpcId *string `pulumi:"vpcId"`
	// The ID of the switch.
	VswitchId *string `pulumi:"vswitchId"`
}

type MountTargetState struct {
	// The name of the permission group.
	AccessGroupName pulumi.StringPtrInput
	// Whether to create an IPv6 mount point.
	//
	// Value:
	// - true: create
	// - false (default): not created
	//
	// > **NOTE:**  currently, only extreme NAS supports IPv6 function in various regions in mainland China, and IPv6 function needs to be turned on for this file system.
	DualStack pulumi.BoolPtrInput
	// The ID of the file system.
	FileSystemId pulumi.StringPtrInput
	// The domain name of the Mount point.
	MountTargetDomain pulumi.StringPtrInput
	// Network type.
	NetworkType pulumi.StringPtrInput
	// The ID of the security group.
	SecurityGroupId pulumi.StringPtrInput
	// The current status of the Mount point, including Active and Inactive, can be used to mount the file system only when the status is Active.
	Status pulumi.StringPtrInput
	// VPC ID.
	VpcId pulumi.StringPtrInput
	// The ID of the switch.
	VswitchId pulumi.StringPtrInput
}

func (MountTargetState) ElementType() reflect.Type {
	return reflect.TypeOf((*mountTargetState)(nil)).Elem()
}

type mountTargetArgs struct {
	// The name of the permission group.
	AccessGroupName *string `pulumi:"accessGroupName"`
	// Whether to create an IPv6 mount point.
	//
	// Value:
	// - true: create
	// - false (default): not created
	//
	// > **NOTE:**  currently, only extreme NAS supports IPv6 function in various regions in mainland China, and IPv6 function needs to be turned on for this file system.
	DualStack *bool `pulumi:"dualStack"`
	// The ID of the file system.
	FileSystemId string `pulumi:"fileSystemId"`
	// Network type.
	NetworkType *string `pulumi:"networkType"`
	// The ID of the security group.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// The current status of the Mount point, including Active and Inactive, can be used to mount the file system only when the status is Active.
	Status *string `pulumi:"status"`
	// VPC ID.
	VpcId *string `pulumi:"vpcId"`
	// The ID of the switch.
	VswitchId *string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a MountTarget resource.
type MountTargetArgs struct {
	// The name of the permission group.
	AccessGroupName pulumi.StringPtrInput
	// Whether to create an IPv6 mount point.
	//
	// Value:
	// - true: create
	// - false (default): not created
	//
	// > **NOTE:**  currently, only extreme NAS supports IPv6 function in various regions in mainland China, and IPv6 function needs to be turned on for this file system.
	DualStack pulumi.BoolPtrInput
	// The ID of the file system.
	FileSystemId pulumi.StringInput
	// Network type.
	NetworkType pulumi.StringPtrInput
	// The ID of the security group.
	SecurityGroupId pulumi.StringPtrInput
	// The current status of the Mount point, including Active and Inactive, can be used to mount the file system only when the status is Active.
	Status pulumi.StringPtrInput
	// VPC ID.
	VpcId pulumi.StringPtrInput
	// The ID of the switch.
	VswitchId pulumi.StringPtrInput
}

func (MountTargetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mountTargetArgs)(nil)).Elem()
}

type MountTargetInput interface {
	pulumi.Input

	ToMountTargetOutput() MountTargetOutput
	ToMountTargetOutputWithContext(ctx context.Context) MountTargetOutput
}

func (*MountTarget) ElementType() reflect.Type {
	return reflect.TypeOf((**MountTarget)(nil)).Elem()
}

func (i *MountTarget) ToMountTargetOutput() MountTargetOutput {
	return i.ToMountTargetOutputWithContext(context.Background())
}

func (i *MountTarget) ToMountTargetOutputWithContext(ctx context.Context) MountTargetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MountTargetOutput)
}

// MountTargetArrayInput is an input type that accepts MountTargetArray and MountTargetArrayOutput values.
// You can construct a concrete instance of `MountTargetArrayInput` via:
//
//	MountTargetArray{ MountTargetArgs{...} }
type MountTargetArrayInput interface {
	pulumi.Input

	ToMountTargetArrayOutput() MountTargetArrayOutput
	ToMountTargetArrayOutputWithContext(context.Context) MountTargetArrayOutput
}

type MountTargetArray []MountTargetInput

func (MountTargetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MountTarget)(nil)).Elem()
}

func (i MountTargetArray) ToMountTargetArrayOutput() MountTargetArrayOutput {
	return i.ToMountTargetArrayOutputWithContext(context.Background())
}

func (i MountTargetArray) ToMountTargetArrayOutputWithContext(ctx context.Context) MountTargetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MountTargetArrayOutput)
}

// MountTargetMapInput is an input type that accepts MountTargetMap and MountTargetMapOutput values.
// You can construct a concrete instance of `MountTargetMapInput` via:
//
//	MountTargetMap{ "key": MountTargetArgs{...} }
type MountTargetMapInput interface {
	pulumi.Input

	ToMountTargetMapOutput() MountTargetMapOutput
	ToMountTargetMapOutputWithContext(context.Context) MountTargetMapOutput
}

type MountTargetMap map[string]MountTargetInput

func (MountTargetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MountTarget)(nil)).Elem()
}

func (i MountTargetMap) ToMountTargetMapOutput() MountTargetMapOutput {
	return i.ToMountTargetMapOutputWithContext(context.Background())
}

func (i MountTargetMap) ToMountTargetMapOutputWithContext(ctx context.Context) MountTargetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MountTargetMapOutput)
}

type MountTargetOutput struct{ *pulumi.OutputState }

func (MountTargetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MountTarget)(nil)).Elem()
}

func (o MountTargetOutput) ToMountTargetOutput() MountTargetOutput {
	return o
}

func (o MountTargetOutput) ToMountTargetOutputWithContext(ctx context.Context) MountTargetOutput {
	return o
}

// The name of the permission group.
func (o MountTargetOutput) AccessGroupName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringPtrOutput { return v.AccessGroupName }).(pulumi.StringPtrOutput)
}

// Whether to create an IPv6 mount point.
//
// Value:
// - true: create
// - false (default): not created
//
// > **NOTE:**  currently, only extreme NAS supports IPv6 function in various regions in mainland China, and IPv6 function needs to be turned on for this file system.
func (o MountTargetOutput) DualStack() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.BoolPtrOutput { return v.DualStack }).(pulumi.BoolPtrOutput)
}

// The ID of the file system.
func (o MountTargetOutput) FileSystemId() pulumi.StringOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringOutput { return v.FileSystemId }).(pulumi.StringOutput)
}

// The domain name of the Mount point.
func (o MountTargetOutput) MountTargetDomain() pulumi.StringOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringOutput { return v.MountTargetDomain }).(pulumi.StringOutput)
}

// Network type.
func (o MountTargetOutput) NetworkType() pulumi.StringOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringOutput { return v.NetworkType }).(pulumi.StringOutput)
}

// The ID of the security group.
func (o MountTargetOutput) SecurityGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringPtrOutput { return v.SecurityGroupId }).(pulumi.StringPtrOutput)
}

// The current status of the Mount point, including Active and Inactive, can be used to mount the file system only when the status is Active.
func (o MountTargetOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// VPC ID.
func (o MountTargetOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

// The ID of the switch.
func (o MountTargetOutput) VswitchId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringPtrOutput { return v.VswitchId }).(pulumi.StringPtrOutput)
}

type MountTargetArrayOutput struct{ *pulumi.OutputState }

func (MountTargetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MountTarget)(nil)).Elem()
}

func (o MountTargetArrayOutput) ToMountTargetArrayOutput() MountTargetArrayOutput {
	return o
}

func (o MountTargetArrayOutput) ToMountTargetArrayOutputWithContext(ctx context.Context) MountTargetArrayOutput {
	return o
}

func (o MountTargetArrayOutput) Index(i pulumi.IntInput) MountTargetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MountTarget {
		return vs[0].([]*MountTarget)[vs[1].(int)]
	}).(MountTargetOutput)
}

type MountTargetMapOutput struct{ *pulumi.OutputState }

func (MountTargetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MountTarget)(nil)).Elem()
}

func (o MountTargetMapOutput) ToMountTargetMapOutput() MountTargetMapOutput {
	return o
}

func (o MountTargetMapOutput) ToMountTargetMapOutputWithContext(ctx context.Context) MountTargetMapOutput {
	return o
}

func (o MountTargetMapOutput) MapIndex(k pulumi.StringInput) MountTargetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MountTarget {
		return vs[0].(map[string]*MountTarget)[vs[1].(string)]
	}).(MountTargetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MountTargetInput)(nil)).Elem(), &MountTarget{})
	pulumi.RegisterInputType(reflect.TypeOf((*MountTargetArrayInput)(nil)).Elem(), MountTargetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MountTargetMapInput)(nil)).Elem(), MountTargetMap{})
	pulumi.RegisterOutputType(MountTargetOutput{})
	pulumi.RegisterOutputType(MountTargetArrayOutput{})
	pulumi.RegisterOutputType(MountTargetMapOutput{})
}
