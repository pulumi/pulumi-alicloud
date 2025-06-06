// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Swarm struct {
	pulumi.CustomResourceState

	AgentVersion    pulumi.StringOutput    `pulumi:"agentVersion"`
	CidrBlock       pulumi.StringOutput    `pulumi:"cidrBlock"`
	DiskCategory    pulumi.StringPtrOutput `pulumi:"diskCategory"`
	DiskSize        pulumi.IntPtrOutput    `pulumi:"diskSize"`
	ImageId         pulumi.StringPtrOutput `pulumi:"imageId"`
	InstanceType    pulumi.StringOutput    `pulumi:"instanceType"`
	IsOutdated      pulumi.BoolPtrOutput   `pulumi:"isOutdated"`
	Name            pulumi.StringOutput    `pulumi:"name"`
	NamePrefix      pulumi.StringPtrOutput `pulumi:"namePrefix"`
	NeedSlb         pulumi.BoolPtrOutput   `pulumi:"needSlb"`
	NodeNumber      pulumi.IntPtrOutput    `pulumi:"nodeNumber"`
	Nodes           SwarmNodeArrayOutput   `pulumi:"nodes"`
	Password        pulumi.StringOutput    `pulumi:"password"`
	ReleaseEip      pulumi.BoolPtrOutput   `pulumi:"releaseEip"`
	SecurityGroupId pulumi.StringOutput    `pulumi:"securityGroupId"`
	// Deprecated: Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.
	Size      pulumi.IntPtrOutput `pulumi:"size"`
	SlbId     pulumi.StringOutput `pulumi:"slbId"`
	VpcId     pulumi.StringOutput `pulumi:"vpcId"`
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
}

// NewSwarm registers a new resource with the given unique name, arguments, and options.
func NewSwarm(ctx *pulumi.Context,
	name string, args *SwarmArgs, opts ...pulumi.ResourceOption) (*Swarm, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CidrBlock == nil {
		return nil, errors.New("invalid value for required argument 'CidrBlock'")
	}
	if args.InstanceType == nil {
		return nil, errors.New("invalid value for required argument 'InstanceType'")
	}
	if args.Password == nil {
		return nil, errors.New("invalid value for required argument 'Password'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Swarm
	err := ctx.RegisterResource("alicloud:cs/swarm:Swarm", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwarm gets an existing Swarm resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwarm(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwarmState, opts ...pulumi.ResourceOption) (*Swarm, error) {
	var resource Swarm
	err := ctx.ReadResource("alicloud:cs/swarm:Swarm", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Swarm resources.
type swarmState struct {
	AgentVersion    *string     `pulumi:"agentVersion"`
	CidrBlock       *string     `pulumi:"cidrBlock"`
	DiskCategory    *string     `pulumi:"diskCategory"`
	DiskSize        *int        `pulumi:"diskSize"`
	ImageId         *string     `pulumi:"imageId"`
	InstanceType    *string     `pulumi:"instanceType"`
	IsOutdated      *bool       `pulumi:"isOutdated"`
	Name            *string     `pulumi:"name"`
	NamePrefix      *string     `pulumi:"namePrefix"`
	NeedSlb         *bool       `pulumi:"needSlb"`
	NodeNumber      *int        `pulumi:"nodeNumber"`
	Nodes           []SwarmNode `pulumi:"nodes"`
	Password        *string     `pulumi:"password"`
	ReleaseEip      *bool       `pulumi:"releaseEip"`
	SecurityGroupId *string     `pulumi:"securityGroupId"`
	// Deprecated: Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.
	Size      *int    `pulumi:"size"`
	SlbId     *string `pulumi:"slbId"`
	VpcId     *string `pulumi:"vpcId"`
	VswitchId *string `pulumi:"vswitchId"`
}

type SwarmState struct {
	AgentVersion    pulumi.StringPtrInput
	CidrBlock       pulumi.StringPtrInput
	DiskCategory    pulumi.StringPtrInput
	DiskSize        pulumi.IntPtrInput
	ImageId         pulumi.StringPtrInput
	InstanceType    pulumi.StringPtrInput
	IsOutdated      pulumi.BoolPtrInput
	Name            pulumi.StringPtrInput
	NamePrefix      pulumi.StringPtrInput
	NeedSlb         pulumi.BoolPtrInput
	NodeNumber      pulumi.IntPtrInput
	Nodes           SwarmNodeArrayInput
	Password        pulumi.StringPtrInput
	ReleaseEip      pulumi.BoolPtrInput
	SecurityGroupId pulumi.StringPtrInput
	// Deprecated: Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.
	Size      pulumi.IntPtrInput
	SlbId     pulumi.StringPtrInput
	VpcId     pulumi.StringPtrInput
	VswitchId pulumi.StringPtrInput
}

func (SwarmState) ElementType() reflect.Type {
	return reflect.TypeOf((*swarmState)(nil)).Elem()
}

type swarmArgs struct {
	CidrBlock    string  `pulumi:"cidrBlock"`
	DiskCategory *string `pulumi:"diskCategory"`
	DiskSize     *int    `pulumi:"diskSize"`
	ImageId      *string `pulumi:"imageId"`
	InstanceType string  `pulumi:"instanceType"`
	IsOutdated   *bool   `pulumi:"isOutdated"`
	Name         *string `pulumi:"name"`
	NamePrefix   *string `pulumi:"namePrefix"`
	NeedSlb      *bool   `pulumi:"needSlb"`
	NodeNumber   *int    `pulumi:"nodeNumber"`
	Password     string  `pulumi:"password"`
	ReleaseEip   *bool   `pulumi:"releaseEip"`
	// Deprecated: Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.
	Size      *int   `pulumi:"size"`
	VswitchId string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a Swarm resource.
type SwarmArgs struct {
	CidrBlock    pulumi.StringInput
	DiskCategory pulumi.StringPtrInput
	DiskSize     pulumi.IntPtrInput
	ImageId      pulumi.StringPtrInput
	InstanceType pulumi.StringInput
	IsOutdated   pulumi.BoolPtrInput
	Name         pulumi.StringPtrInput
	NamePrefix   pulumi.StringPtrInput
	NeedSlb      pulumi.BoolPtrInput
	NodeNumber   pulumi.IntPtrInput
	Password     pulumi.StringInput
	ReleaseEip   pulumi.BoolPtrInput
	// Deprecated: Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.
	Size      pulumi.IntPtrInput
	VswitchId pulumi.StringInput
}

func (SwarmArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*swarmArgs)(nil)).Elem()
}

type SwarmInput interface {
	pulumi.Input

	ToSwarmOutput() SwarmOutput
	ToSwarmOutputWithContext(ctx context.Context) SwarmOutput
}

func (*Swarm) ElementType() reflect.Type {
	return reflect.TypeOf((**Swarm)(nil)).Elem()
}

func (i *Swarm) ToSwarmOutput() SwarmOutput {
	return i.ToSwarmOutputWithContext(context.Background())
}

func (i *Swarm) ToSwarmOutputWithContext(ctx context.Context) SwarmOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwarmOutput)
}

// SwarmArrayInput is an input type that accepts SwarmArray and SwarmArrayOutput values.
// You can construct a concrete instance of `SwarmArrayInput` via:
//
//	SwarmArray{ SwarmArgs{...} }
type SwarmArrayInput interface {
	pulumi.Input

	ToSwarmArrayOutput() SwarmArrayOutput
	ToSwarmArrayOutputWithContext(context.Context) SwarmArrayOutput
}

type SwarmArray []SwarmInput

func (SwarmArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Swarm)(nil)).Elem()
}

func (i SwarmArray) ToSwarmArrayOutput() SwarmArrayOutput {
	return i.ToSwarmArrayOutputWithContext(context.Background())
}

func (i SwarmArray) ToSwarmArrayOutputWithContext(ctx context.Context) SwarmArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwarmArrayOutput)
}

// SwarmMapInput is an input type that accepts SwarmMap and SwarmMapOutput values.
// You can construct a concrete instance of `SwarmMapInput` via:
//
//	SwarmMap{ "key": SwarmArgs{...} }
type SwarmMapInput interface {
	pulumi.Input

	ToSwarmMapOutput() SwarmMapOutput
	ToSwarmMapOutputWithContext(context.Context) SwarmMapOutput
}

type SwarmMap map[string]SwarmInput

func (SwarmMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Swarm)(nil)).Elem()
}

func (i SwarmMap) ToSwarmMapOutput() SwarmMapOutput {
	return i.ToSwarmMapOutputWithContext(context.Background())
}

func (i SwarmMap) ToSwarmMapOutputWithContext(ctx context.Context) SwarmMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwarmMapOutput)
}

type SwarmOutput struct{ *pulumi.OutputState }

func (SwarmOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Swarm)(nil)).Elem()
}

func (o SwarmOutput) ToSwarmOutput() SwarmOutput {
	return o
}

func (o SwarmOutput) ToSwarmOutputWithContext(ctx context.Context) SwarmOutput {
	return o
}

func (o SwarmOutput) AgentVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Swarm) pulumi.StringOutput { return v.AgentVersion }).(pulumi.StringOutput)
}

func (o SwarmOutput) CidrBlock() pulumi.StringOutput {
	return o.ApplyT(func(v *Swarm) pulumi.StringOutput { return v.CidrBlock }).(pulumi.StringOutput)
}

func (o SwarmOutput) DiskCategory() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swarm) pulumi.StringPtrOutput { return v.DiskCategory }).(pulumi.StringPtrOutput)
}

func (o SwarmOutput) DiskSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Swarm) pulumi.IntPtrOutput { return v.DiskSize }).(pulumi.IntPtrOutput)
}

func (o SwarmOutput) ImageId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swarm) pulumi.StringPtrOutput { return v.ImageId }).(pulumi.StringPtrOutput)
}

func (o SwarmOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *Swarm) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

func (o SwarmOutput) IsOutdated() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Swarm) pulumi.BoolPtrOutput { return v.IsOutdated }).(pulumi.BoolPtrOutput)
}

func (o SwarmOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Swarm) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o SwarmOutput) NamePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swarm) pulumi.StringPtrOutput { return v.NamePrefix }).(pulumi.StringPtrOutput)
}

func (o SwarmOutput) NeedSlb() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Swarm) pulumi.BoolPtrOutput { return v.NeedSlb }).(pulumi.BoolPtrOutput)
}

func (o SwarmOutput) NodeNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Swarm) pulumi.IntPtrOutput { return v.NodeNumber }).(pulumi.IntPtrOutput)
}

func (o SwarmOutput) Nodes() SwarmNodeArrayOutput {
	return o.ApplyT(func(v *Swarm) SwarmNodeArrayOutput { return v.Nodes }).(SwarmNodeArrayOutput)
}

func (o SwarmOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *Swarm) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

func (o SwarmOutput) ReleaseEip() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Swarm) pulumi.BoolPtrOutput { return v.ReleaseEip }).(pulumi.BoolPtrOutput)
}

func (o SwarmOutput) SecurityGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Swarm) pulumi.StringOutput { return v.SecurityGroupId }).(pulumi.StringOutput)
}

// Deprecated: Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.
func (o SwarmOutput) Size() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Swarm) pulumi.IntPtrOutput { return v.Size }).(pulumi.IntPtrOutput)
}

func (o SwarmOutput) SlbId() pulumi.StringOutput {
	return o.ApplyT(func(v *Swarm) pulumi.StringOutput { return v.SlbId }).(pulumi.StringOutput)
}

func (o SwarmOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *Swarm) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

func (o SwarmOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v *Swarm) pulumi.StringOutput { return v.VswitchId }).(pulumi.StringOutput)
}

type SwarmArrayOutput struct{ *pulumi.OutputState }

func (SwarmArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Swarm)(nil)).Elem()
}

func (o SwarmArrayOutput) ToSwarmArrayOutput() SwarmArrayOutput {
	return o
}

func (o SwarmArrayOutput) ToSwarmArrayOutputWithContext(ctx context.Context) SwarmArrayOutput {
	return o
}

func (o SwarmArrayOutput) Index(i pulumi.IntInput) SwarmOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Swarm {
		return vs[0].([]*Swarm)[vs[1].(int)]
	}).(SwarmOutput)
}

type SwarmMapOutput struct{ *pulumi.OutputState }

func (SwarmMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Swarm)(nil)).Elem()
}

func (o SwarmMapOutput) ToSwarmMapOutput() SwarmMapOutput {
	return o
}

func (o SwarmMapOutput) ToSwarmMapOutputWithContext(ctx context.Context) SwarmMapOutput {
	return o
}

func (o SwarmMapOutput) MapIndex(k pulumi.StringInput) SwarmOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Swarm {
		return vs[0].(map[string]*Swarm)[vs[1].(string)]
	}).(SwarmOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwarmInput)(nil)).Elem(), &Swarm{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwarmArrayInput)(nil)).Elem(), SwarmArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwarmMapInput)(nil)).Elem(), SwarmMap{})
	pulumi.RegisterOutputType(SwarmOutput{})
	pulumi.RegisterOutputType(SwarmArrayOutput{})
	pulumi.RegisterOutputType(SwarmMapOutput{})
}
