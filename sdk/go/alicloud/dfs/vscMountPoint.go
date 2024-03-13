// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dfs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DFS Vsc Mount Point resource. VSC mount point.
//
// For information about DFS Vsc Mount Point and how to use it, see [What is Vsc Mount Point](https://www.alibabacloud.com/help/en/aibaba-cloud-storage-services/latest/apsara-file-storage-for-hdfs).
//
// > **NOTE:** Available since v1.218.0.
//
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
//	"fmt"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dfs"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
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
//			defaultRandomInteger, err := random.NewRandomInteger(ctx, "defaultRandomInteger", &random.RandomIntegerArgs{
//				Min: pulumi.Int(10000),
//				Max: pulumi.Int(99999),
//			})
//			if err != nil {
//				return err
//			}
//			defaultZones, err := dfs.GetZones(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			zoneId := defaultZones.Zones[0].ZoneId
//			storageType := defaultZones.Zones[0].Options[0].StorageType
//			_, err = dfs.NewFileSystem(ctx, "defaultFileSystem", &dfs.FileSystemArgs{
//				ProtocolType: pulumi.String("HDFS"),
//				Description:  pulumi.String(name),
//				FileSystemName: defaultRandomInteger.Result.ApplyT(func(result int) (string, error) {
//					return fmt.Sprintf("%v-%v", name, result), nil
//				}).(pulumi.StringOutput),
//				SpaceCapacity:                pulumi.Int(1024),
//				ThroughputMode:               pulumi.String("Provisioned"),
//				ProvisionedThroughputInMiBps: pulumi.Int(512),
//				StorageType:                  *pulumi.String(storageType),
//				ZoneId:                       *pulumi.String(zoneId),
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
//
// ## Import
//
// DFS Vsc Mount Point can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:dfs/vscMountPoint:VscMountPoint example <file_system_id>:<mount_point_id>
// ```
type VscMountPoint struct {
	pulumi.CustomResourceState

	// Mount point alias prefix, which is used as the prefix for generating VSC mount point aliases.
	AliasPrefix pulumi.StringPtrOutput `pulumi:"aliasPrefix"`
	// The description of the Mount point.  The length is 0 to 100 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the HDFS file system resource associated with the VSC mount point.
	FileSystemId pulumi.StringOutput `pulumi:"fileSystemId"`
	// The collection of ECS instances on which the HDFS file system is mounted.
	Instances VscMountPointInstanceArrayOutput `pulumi:"instances"`
	// VSC mount point ID, which is the unique identifier of the vsc mount point and is used to access the associated HDFS file system.
	MountPointId pulumi.StringOutput `pulumi:"mountPointId"`
}

// NewVscMountPoint registers a new resource with the given unique name, arguments, and options.
func NewVscMountPoint(ctx *pulumi.Context,
	name string, args *VscMountPointArgs, opts ...pulumi.ResourceOption) (*VscMountPoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FileSystemId == nil {
		return nil, errors.New("invalid value for required argument 'FileSystemId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VscMountPoint
	err := ctx.RegisterResource("alicloud:dfs/vscMountPoint:VscMountPoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVscMountPoint gets an existing VscMountPoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVscMountPoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VscMountPointState, opts ...pulumi.ResourceOption) (*VscMountPoint, error) {
	var resource VscMountPoint
	err := ctx.ReadResource("alicloud:dfs/vscMountPoint:VscMountPoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VscMountPoint resources.
type vscMountPointState struct {
	// Mount point alias prefix, which is used as the prefix for generating VSC mount point aliases.
	AliasPrefix *string `pulumi:"aliasPrefix"`
	// The description of the Mount point.  The length is 0 to 100 characters.
	Description *string `pulumi:"description"`
	// The ID of the HDFS file system resource associated with the VSC mount point.
	FileSystemId *string `pulumi:"fileSystemId"`
	// The collection of ECS instances on which the HDFS file system is mounted.
	Instances []VscMountPointInstance `pulumi:"instances"`
	// VSC mount point ID, which is the unique identifier of the vsc mount point and is used to access the associated HDFS file system.
	MountPointId *string `pulumi:"mountPointId"`
}

type VscMountPointState struct {
	// Mount point alias prefix, which is used as the prefix for generating VSC mount point aliases.
	AliasPrefix pulumi.StringPtrInput
	// The description of the Mount point.  The length is 0 to 100 characters.
	Description pulumi.StringPtrInput
	// The ID of the HDFS file system resource associated with the VSC mount point.
	FileSystemId pulumi.StringPtrInput
	// The collection of ECS instances on which the HDFS file system is mounted.
	Instances VscMountPointInstanceArrayInput
	// VSC mount point ID, which is the unique identifier of the vsc mount point and is used to access the associated HDFS file system.
	MountPointId pulumi.StringPtrInput
}

func (VscMountPointState) ElementType() reflect.Type {
	return reflect.TypeOf((*vscMountPointState)(nil)).Elem()
}

type vscMountPointArgs struct {
	// Mount point alias prefix, which is used as the prefix for generating VSC mount point aliases.
	AliasPrefix *string `pulumi:"aliasPrefix"`
	// The description of the Mount point.  The length is 0 to 100 characters.
	Description *string `pulumi:"description"`
	// The ID of the HDFS file system resource associated with the VSC mount point.
	FileSystemId string `pulumi:"fileSystemId"`
}

// The set of arguments for constructing a VscMountPoint resource.
type VscMountPointArgs struct {
	// Mount point alias prefix, which is used as the prefix for generating VSC mount point aliases.
	AliasPrefix pulumi.StringPtrInput
	// The description of the Mount point.  The length is 0 to 100 characters.
	Description pulumi.StringPtrInput
	// The ID of the HDFS file system resource associated with the VSC mount point.
	FileSystemId pulumi.StringInput
}

func (VscMountPointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vscMountPointArgs)(nil)).Elem()
}

type VscMountPointInput interface {
	pulumi.Input

	ToVscMountPointOutput() VscMountPointOutput
	ToVscMountPointOutputWithContext(ctx context.Context) VscMountPointOutput
}

func (*VscMountPoint) ElementType() reflect.Type {
	return reflect.TypeOf((**VscMountPoint)(nil)).Elem()
}

func (i *VscMountPoint) ToVscMountPointOutput() VscMountPointOutput {
	return i.ToVscMountPointOutputWithContext(context.Background())
}

func (i *VscMountPoint) ToVscMountPointOutputWithContext(ctx context.Context) VscMountPointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VscMountPointOutput)
}

// VscMountPointArrayInput is an input type that accepts VscMountPointArray and VscMountPointArrayOutput values.
// You can construct a concrete instance of `VscMountPointArrayInput` via:
//
//	VscMountPointArray{ VscMountPointArgs{...} }
type VscMountPointArrayInput interface {
	pulumi.Input

	ToVscMountPointArrayOutput() VscMountPointArrayOutput
	ToVscMountPointArrayOutputWithContext(context.Context) VscMountPointArrayOutput
}

type VscMountPointArray []VscMountPointInput

func (VscMountPointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VscMountPoint)(nil)).Elem()
}

func (i VscMountPointArray) ToVscMountPointArrayOutput() VscMountPointArrayOutput {
	return i.ToVscMountPointArrayOutputWithContext(context.Background())
}

func (i VscMountPointArray) ToVscMountPointArrayOutputWithContext(ctx context.Context) VscMountPointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VscMountPointArrayOutput)
}

// VscMountPointMapInput is an input type that accepts VscMountPointMap and VscMountPointMapOutput values.
// You can construct a concrete instance of `VscMountPointMapInput` via:
//
//	VscMountPointMap{ "key": VscMountPointArgs{...} }
type VscMountPointMapInput interface {
	pulumi.Input

	ToVscMountPointMapOutput() VscMountPointMapOutput
	ToVscMountPointMapOutputWithContext(context.Context) VscMountPointMapOutput
}

type VscMountPointMap map[string]VscMountPointInput

func (VscMountPointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VscMountPoint)(nil)).Elem()
}

func (i VscMountPointMap) ToVscMountPointMapOutput() VscMountPointMapOutput {
	return i.ToVscMountPointMapOutputWithContext(context.Background())
}

func (i VscMountPointMap) ToVscMountPointMapOutputWithContext(ctx context.Context) VscMountPointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VscMountPointMapOutput)
}

type VscMountPointOutput struct{ *pulumi.OutputState }

func (VscMountPointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VscMountPoint)(nil)).Elem()
}

func (o VscMountPointOutput) ToVscMountPointOutput() VscMountPointOutput {
	return o
}

func (o VscMountPointOutput) ToVscMountPointOutputWithContext(ctx context.Context) VscMountPointOutput {
	return o
}

// Mount point alias prefix, which is used as the prefix for generating VSC mount point aliases.
func (o VscMountPointOutput) AliasPrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VscMountPoint) pulumi.StringPtrOutput { return v.AliasPrefix }).(pulumi.StringPtrOutput)
}

// The description of the Mount point.  The length is 0 to 100 characters.
func (o VscMountPointOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VscMountPoint) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ID of the HDFS file system resource associated with the VSC mount point.
func (o VscMountPointOutput) FileSystemId() pulumi.StringOutput {
	return o.ApplyT(func(v *VscMountPoint) pulumi.StringOutput { return v.FileSystemId }).(pulumi.StringOutput)
}

// The collection of ECS instances on which the HDFS file system is mounted.
func (o VscMountPointOutput) Instances() VscMountPointInstanceArrayOutput {
	return o.ApplyT(func(v *VscMountPoint) VscMountPointInstanceArrayOutput { return v.Instances }).(VscMountPointInstanceArrayOutput)
}

// VSC mount point ID, which is the unique identifier of the vsc mount point and is used to access the associated HDFS file system.
func (o VscMountPointOutput) MountPointId() pulumi.StringOutput {
	return o.ApplyT(func(v *VscMountPoint) pulumi.StringOutput { return v.MountPointId }).(pulumi.StringOutput)
}

type VscMountPointArrayOutput struct{ *pulumi.OutputState }

func (VscMountPointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VscMountPoint)(nil)).Elem()
}

func (o VscMountPointArrayOutput) ToVscMountPointArrayOutput() VscMountPointArrayOutput {
	return o
}

func (o VscMountPointArrayOutput) ToVscMountPointArrayOutputWithContext(ctx context.Context) VscMountPointArrayOutput {
	return o
}

func (o VscMountPointArrayOutput) Index(i pulumi.IntInput) VscMountPointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VscMountPoint {
		return vs[0].([]*VscMountPoint)[vs[1].(int)]
	}).(VscMountPointOutput)
}

type VscMountPointMapOutput struct{ *pulumi.OutputState }

func (VscMountPointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VscMountPoint)(nil)).Elem()
}

func (o VscMountPointMapOutput) ToVscMountPointMapOutput() VscMountPointMapOutput {
	return o
}

func (o VscMountPointMapOutput) ToVscMountPointMapOutputWithContext(ctx context.Context) VscMountPointMapOutput {
	return o
}

func (o VscMountPointMapOutput) MapIndex(k pulumi.StringInput) VscMountPointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VscMountPoint {
		return vs[0].(map[string]*VscMountPoint)[vs[1].(string)]
	}).(VscMountPointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VscMountPointInput)(nil)).Elem(), &VscMountPoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*VscMountPointArrayInput)(nil)).Elem(), VscMountPointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VscMountPointMapInput)(nil)).Elem(), VscMountPointMap{})
	pulumi.RegisterOutputType(VscMountPointOutput{})
	pulumi.RegisterOutputType(VscMountPointArrayOutput{})
	pulumi.RegisterOutputType(VscMountPointMapOutput{})
}