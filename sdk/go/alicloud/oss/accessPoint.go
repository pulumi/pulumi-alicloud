// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package oss

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a OSS Access Point resource.
//
// You can create multiple Access points for buckets and configure different Access control permissions and network control policies for different Access points.
//
// For information about OSS Access Point and how to use it, see [What is Access Point](https://www.alibabacloud.com/help/en/).
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/oss"
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
//			createBucket, err := oss.NewBucket(ctx, "CreateBucket", &oss.BucketArgs{
//				StorageClass: pulumi.String("Standard"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = oss.NewAccessPoint(ctx, "default", &oss.AccessPointArgs{
//				AccessPointName: pulumi.String(name),
//				Bucket:          createBucket.Bucket,
//				VpcConfiguration: &oss.AccessPointVpcConfigurationArgs{
//					VpcId: pulumi.String("vpc-abcexample"),
//				},
//				NetworkOrigin: pulumi.String("vpc"),
//				PublicAccessBlockConfiguration: &oss.AccessPointPublicAccessBlockConfigurationArgs{
//					BlockPublicAccess: pulumi.Bool(true),
//				},
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
// OSS Access Point can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:oss/accessPoint:AccessPoint example <bucket>:<access_point_name>
// ```
type AccessPoint struct {
	pulumi.CustomResourceState

	// The name of the access point
	AccessPointName pulumi.StringOutput `pulumi:"accessPointName"`
	// The Bucket to which the current access point belongs.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// Access point network source. The valid values are as follows:
	// - vpc: only the specified VPC ID can be used to access the access point.
	// - internet: the access point can be accessed through both external and internal Endpoint.
	NetworkOrigin pulumi.StringOutput `pulumi:"networkOrigin"`
	// Configuration of Access Point Blocking Public Access See `publicAccessBlockConfiguration` below.
	PublicAccessBlockConfiguration AccessPointPublicAccessBlockConfigurationPtrOutput `pulumi:"publicAccessBlockConfiguration"`
	// The status of the resource
	Status pulumi.StringOutput `pulumi:"status"`
	// If the Network Origin is vpc, the VPC source information is saved here. See `vpcConfiguration` below.
	VpcConfiguration AccessPointVpcConfigurationPtrOutput `pulumi:"vpcConfiguration"`
}

// NewAccessPoint registers a new resource with the given unique name, arguments, and options.
func NewAccessPoint(ctx *pulumi.Context,
	name string, args *AccessPointArgs, opts ...pulumi.ResourceOption) (*AccessPoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessPointName == nil {
		return nil, errors.New("invalid value for required argument 'AccessPointName'")
	}
	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.NetworkOrigin == nil {
		return nil, errors.New("invalid value for required argument 'NetworkOrigin'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessPoint
	err := ctx.RegisterResource("alicloud:oss/accessPoint:AccessPoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessPoint gets an existing AccessPoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessPoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessPointState, opts ...pulumi.ResourceOption) (*AccessPoint, error) {
	var resource AccessPoint
	err := ctx.ReadResource("alicloud:oss/accessPoint:AccessPoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessPoint resources.
type accessPointState struct {
	// The name of the access point
	AccessPointName *string `pulumi:"accessPointName"`
	// The Bucket to which the current access point belongs.
	Bucket *string `pulumi:"bucket"`
	// Access point network source. The valid values are as follows:
	// - vpc: only the specified VPC ID can be used to access the access point.
	// - internet: the access point can be accessed through both external and internal Endpoint.
	NetworkOrigin *string `pulumi:"networkOrigin"`
	// Configuration of Access Point Blocking Public Access See `publicAccessBlockConfiguration` below.
	PublicAccessBlockConfiguration *AccessPointPublicAccessBlockConfiguration `pulumi:"publicAccessBlockConfiguration"`
	// The status of the resource
	Status *string `pulumi:"status"`
	// If the Network Origin is vpc, the VPC source information is saved here. See `vpcConfiguration` below.
	VpcConfiguration *AccessPointVpcConfiguration `pulumi:"vpcConfiguration"`
}

type AccessPointState struct {
	// The name of the access point
	AccessPointName pulumi.StringPtrInput
	// The Bucket to which the current access point belongs.
	Bucket pulumi.StringPtrInput
	// Access point network source. The valid values are as follows:
	// - vpc: only the specified VPC ID can be used to access the access point.
	// - internet: the access point can be accessed through both external and internal Endpoint.
	NetworkOrigin pulumi.StringPtrInput
	// Configuration of Access Point Blocking Public Access See `publicAccessBlockConfiguration` below.
	PublicAccessBlockConfiguration AccessPointPublicAccessBlockConfigurationPtrInput
	// The status of the resource
	Status pulumi.StringPtrInput
	// If the Network Origin is vpc, the VPC source information is saved here. See `vpcConfiguration` below.
	VpcConfiguration AccessPointVpcConfigurationPtrInput
}

func (AccessPointState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessPointState)(nil)).Elem()
}

type accessPointArgs struct {
	// The name of the access point
	AccessPointName string `pulumi:"accessPointName"`
	// The Bucket to which the current access point belongs.
	Bucket string `pulumi:"bucket"`
	// Access point network source. The valid values are as follows:
	// - vpc: only the specified VPC ID can be used to access the access point.
	// - internet: the access point can be accessed through both external and internal Endpoint.
	NetworkOrigin string `pulumi:"networkOrigin"`
	// Configuration of Access Point Blocking Public Access See `publicAccessBlockConfiguration` below.
	PublicAccessBlockConfiguration *AccessPointPublicAccessBlockConfiguration `pulumi:"publicAccessBlockConfiguration"`
	// If the Network Origin is vpc, the VPC source information is saved here. See `vpcConfiguration` below.
	VpcConfiguration *AccessPointVpcConfiguration `pulumi:"vpcConfiguration"`
}

// The set of arguments for constructing a AccessPoint resource.
type AccessPointArgs struct {
	// The name of the access point
	AccessPointName pulumi.StringInput
	// The Bucket to which the current access point belongs.
	Bucket pulumi.StringInput
	// Access point network source. The valid values are as follows:
	// - vpc: only the specified VPC ID can be used to access the access point.
	// - internet: the access point can be accessed through both external and internal Endpoint.
	NetworkOrigin pulumi.StringInput
	// Configuration of Access Point Blocking Public Access See `publicAccessBlockConfiguration` below.
	PublicAccessBlockConfiguration AccessPointPublicAccessBlockConfigurationPtrInput
	// If the Network Origin is vpc, the VPC source information is saved here. See `vpcConfiguration` below.
	VpcConfiguration AccessPointVpcConfigurationPtrInput
}

func (AccessPointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessPointArgs)(nil)).Elem()
}

type AccessPointInput interface {
	pulumi.Input

	ToAccessPointOutput() AccessPointOutput
	ToAccessPointOutputWithContext(ctx context.Context) AccessPointOutput
}

func (*AccessPoint) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessPoint)(nil)).Elem()
}

func (i *AccessPoint) ToAccessPointOutput() AccessPointOutput {
	return i.ToAccessPointOutputWithContext(context.Background())
}

func (i *AccessPoint) ToAccessPointOutputWithContext(ctx context.Context) AccessPointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessPointOutput)
}

// AccessPointArrayInput is an input type that accepts AccessPointArray and AccessPointArrayOutput values.
// You can construct a concrete instance of `AccessPointArrayInput` via:
//
//	AccessPointArray{ AccessPointArgs{...} }
type AccessPointArrayInput interface {
	pulumi.Input

	ToAccessPointArrayOutput() AccessPointArrayOutput
	ToAccessPointArrayOutputWithContext(context.Context) AccessPointArrayOutput
}

type AccessPointArray []AccessPointInput

func (AccessPointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessPoint)(nil)).Elem()
}

func (i AccessPointArray) ToAccessPointArrayOutput() AccessPointArrayOutput {
	return i.ToAccessPointArrayOutputWithContext(context.Background())
}

func (i AccessPointArray) ToAccessPointArrayOutputWithContext(ctx context.Context) AccessPointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessPointArrayOutput)
}

// AccessPointMapInput is an input type that accepts AccessPointMap and AccessPointMapOutput values.
// You can construct a concrete instance of `AccessPointMapInput` via:
//
//	AccessPointMap{ "key": AccessPointArgs{...} }
type AccessPointMapInput interface {
	pulumi.Input

	ToAccessPointMapOutput() AccessPointMapOutput
	ToAccessPointMapOutputWithContext(context.Context) AccessPointMapOutput
}

type AccessPointMap map[string]AccessPointInput

func (AccessPointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessPoint)(nil)).Elem()
}

func (i AccessPointMap) ToAccessPointMapOutput() AccessPointMapOutput {
	return i.ToAccessPointMapOutputWithContext(context.Background())
}

func (i AccessPointMap) ToAccessPointMapOutputWithContext(ctx context.Context) AccessPointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessPointMapOutput)
}

type AccessPointOutput struct{ *pulumi.OutputState }

func (AccessPointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessPoint)(nil)).Elem()
}

func (o AccessPointOutput) ToAccessPointOutput() AccessPointOutput {
	return o
}

func (o AccessPointOutput) ToAccessPointOutputWithContext(ctx context.Context) AccessPointOutput {
	return o
}

// The name of the access point
func (o AccessPointOutput) AccessPointName() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPoint) pulumi.StringOutput { return v.AccessPointName }).(pulumi.StringOutput)
}

// The Bucket to which the current access point belongs.
func (o AccessPointOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPoint) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// Access point network source. The valid values are as follows:
// - vpc: only the specified VPC ID can be used to access the access point.
// - internet: the access point can be accessed through both external and internal Endpoint.
func (o AccessPointOutput) NetworkOrigin() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPoint) pulumi.StringOutput { return v.NetworkOrigin }).(pulumi.StringOutput)
}

// Configuration of Access Point Blocking Public Access See `publicAccessBlockConfiguration` below.
func (o AccessPointOutput) PublicAccessBlockConfiguration() AccessPointPublicAccessBlockConfigurationPtrOutput {
	return o.ApplyT(func(v *AccessPoint) AccessPointPublicAccessBlockConfigurationPtrOutput {
		return v.PublicAccessBlockConfiguration
	}).(AccessPointPublicAccessBlockConfigurationPtrOutput)
}

// The status of the resource
func (o AccessPointOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPoint) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// If the Network Origin is vpc, the VPC source information is saved here. See `vpcConfiguration` below.
func (o AccessPointOutput) VpcConfiguration() AccessPointVpcConfigurationPtrOutput {
	return o.ApplyT(func(v *AccessPoint) AccessPointVpcConfigurationPtrOutput { return v.VpcConfiguration }).(AccessPointVpcConfigurationPtrOutput)
}

type AccessPointArrayOutput struct{ *pulumi.OutputState }

func (AccessPointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessPoint)(nil)).Elem()
}

func (o AccessPointArrayOutput) ToAccessPointArrayOutput() AccessPointArrayOutput {
	return o
}

func (o AccessPointArrayOutput) ToAccessPointArrayOutputWithContext(ctx context.Context) AccessPointArrayOutput {
	return o
}

func (o AccessPointArrayOutput) Index(i pulumi.IntInput) AccessPointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessPoint {
		return vs[0].([]*AccessPoint)[vs[1].(int)]
	}).(AccessPointOutput)
}

type AccessPointMapOutput struct{ *pulumi.OutputState }

func (AccessPointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessPoint)(nil)).Elem()
}

func (o AccessPointMapOutput) ToAccessPointMapOutput() AccessPointMapOutput {
	return o
}

func (o AccessPointMapOutput) ToAccessPointMapOutputWithContext(ctx context.Context) AccessPointMapOutput {
	return o
}

func (o AccessPointMapOutput) MapIndex(k pulumi.StringInput) AccessPointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessPoint {
		return vs[0].(map[string]*AccessPoint)[vs[1].(string)]
	}).(AccessPointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessPointInput)(nil)).Elem(), &AccessPoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessPointArrayInput)(nil)).Elem(), AccessPointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessPointMapInput)(nil)).Elem(), AccessPointMap{})
	pulumi.RegisterOutputType(AccessPointOutput{})
	pulumi.RegisterOutputType(AccessPointArrayOutput{})
	pulumi.RegisterOutputType(AccessPointMapOutput{})
}