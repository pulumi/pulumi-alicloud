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

// Provides a Container Registry Enterprise Edition Repository resource.
//
// For information about Container Registry Enterprise Edition Repository and how to use it, see [What is Repository](https://www.alibabacloud.com/help/en/acr/developer-reference/api-cr-2018-12-01-createrepository)
//
// > **NOTE:** Available since v1.86.0.
//
// > **NOTE:** You need to set your registry password in Container Registry Enterprise Edition console before use this resource.
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
//	"fmt"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cr"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cs"
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
//			_default, err := random.NewInteger(ctx, "default", &random.IntegerArgs{
//				Min: 10000000,
//				Max: 99999999,
//			})
//			if err != nil {
//				return err
//			}
//			defaultRegistryEnterpriseInstance, err := cr.NewRegistryEnterpriseInstance(ctx, "default", &cr.RegistryEnterpriseInstanceArgs{
//				PaymentType:   pulumi.String("Subscription"),
//				Period:        pulumi.Int(1),
//				RenewPeriod:   pulumi.Int(0),
//				RenewalStatus: pulumi.String("ManualRenewal"),
//				InstanceType:  pulumi.String("Advanced"),
//				InstanceName:  pulumi.Sprintf("%v-%v", name, _default.Result),
//			})
//			if err != nil {
//				return err
//			}
//			defaultRegistryEnterpriseNamespace, err := cs.NewRegistryEnterpriseNamespace(ctx, "default", &cs.RegistryEnterpriseNamespaceArgs{
//				InstanceId:        defaultRegistryEnterpriseInstance.ID(),
//				Name:              pulumi.Sprintf("%v-%v", name, _default.Result),
//				AutoCreate:        pulumi.Bool(false),
//				DefaultVisibility: pulumi.String("PUBLIC"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cs.NewRegistryEnterpriseRepo(ctx, "example", &cs.RegistryEnterpriseRepoArgs{
//				InstanceId: defaultRegistryEnterpriseInstance.ID(),
//				Namespace:  defaultRegistryEnterpriseNamespace.Name,
//				Name:       pulumi.Sprintf("%v-%v", name, _default.Result),
//				RepoType:   pulumi.String("PUBLIC"),
//				Summary:    pulumi.String("this is summary of my new repo"),
//				Detail:     pulumi.String("this is a public repo"),
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
// Container Registry Enterprise Edition Repository can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:cs/registryEnterpriseRepo:RegistryEnterpriseRepo example <instance_id>:<namespace>:<name>
// ```
type RegistryEnterpriseRepo struct {
	pulumi.CustomResourceState

	// The description of the repository.
	Detail pulumi.StringPtrOutput `pulumi:"detail"`
	// The ID of the Container Registry Enterprise Edition instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The name of the image repository.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the namespace to which the image repository belongs.
	Namespace pulumi.StringOutput `pulumi:"namespace"`
	// The ID of the repository.
	RepoId pulumi.StringOutput `pulumi:"repoId"`
	// The type of the repository. Valid values:
	// - `PUBLIC`: The repository is a public repository.
	// - `PRIVATE`: The repository is a private repository.
	RepoType pulumi.StringOutput `pulumi:"repoType"`
	// The summary about the repository.
	Summary pulumi.StringOutput `pulumi:"summary"`
}

// NewRegistryEnterpriseRepo registers a new resource with the given unique name, arguments, and options.
func NewRegistryEnterpriseRepo(ctx *pulumi.Context,
	name string, args *RegistryEnterpriseRepoArgs, opts ...pulumi.ResourceOption) (*RegistryEnterpriseRepo, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.Namespace == nil {
		return nil, errors.New("invalid value for required argument 'Namespace'")
	}
	if args.RepoType == nil {
		return nil, errors.New("invalid value for required argument 'RepoType'")
	}
	if args.Summary == nil {
		return nil, errors.New("invalid value for required argument 'Summary'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RegistryEnterpriseRepo
	err := ctx.RegisterResource("alicloud:cs/registryEnterpriseRepo:RegistryEnterpriseRepo", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRegistryEnterpriseRepo gets an existing RegistryEnterpriseRepo resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRegistryEnterpriseRepo(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RegistryEnterpriseRepoState, opts ...pulumi.ResourceOption) (*RegistryEnterpriseRepo, error) {
	var resource RegistryEnterpriseRepo
	err := ctx.ReadResource("alicloud:cs/registryEnterpriseRepo:RegistryEnterpriseRepo", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RegistryEnterpriseRepo resources.
type registryEnterpriseRepoState struct {
	// The description of the repository.
	Detail *string `pulumi:"detail"`
	// The ID of the Container Registry Enterprise Edition instance.
	InstanceId *string `pulumi:"instanceId"`
	// The name of the image repository.
	Name *string `pulumi:"name"`
	// The name of the namespace to which the image repository belongs.
	Namespace *string `pulumi:"namespace"`
	// The ID of the repository.
	RepoId *string `pulumi:"repoId"`
	// The type of the repository. Valid values:
	// - `PUBLIC`: The repository is a public repository.
	// - `PRIVATE`: The repository is a private repository.
	RepoType *string `pulumi:"repoType"`
	// The summary about the repository.
	Summary *string `pulumi:"summary"`
}

type RegistryEnterpriseRepoState struct {
	// The description of the repository.
	Detail pulumi.StringPtrInput
	// The ID of the Container Registry Enterprise Edition instance.
	InstanceId pulumi.StringPtrInput
	// The name of the image repository.
	Name pulumi.StringPtrInput
	// The name of the namespace to which the image repository belongs.
	Namespace pulumi.StringPtrInput
	// The ID of the repository.
	RepoId pulumi.StringPtrInput
	// The type of the repository. Valid values:
	// - `PUBLIC`: The repository is a public repository.
	// - `PRIVATE`: The repository is a private repository.
	RepoType pulumi.StringPtrInput
	// The summary about the repository.
	Summary pulumi.StringPtrInput
}

func (RegistryEnterpriseRepoState) ElementType() reflect.Type {
	return reflect.TypeOf((*registryEnterpriseRepoState)(nil)).Elem()
}

type registryEnterpriseRepoArgs struct {
	// The description of the repository.
	Detail *string `pulumi:"detail"`
	// The ID of the Container Registry Enterprise Edition instance.
	InstanceId string `pulumi:"instanceId"`
	// The name of the image repository.
	Name *string `pulumi:"name"`
	// The name of the namespace to which the image repository belongs.
	Namespace string `pulumi:"namespace"`
	// The type of the repository. Valid values:
	// - `PUBLIC`: The repository is a public repository.
	// - `PRIVATE`: The repository is a private repository.
	RepoType string `pulumi:"repoType"`
	// The summary about the repository.
	Summary string `pulumi:"summary"`
}

// The set of arguments for constructing a RegistryEnterpriseRepo resource.
type RegistryEnterpriseRepoArgs struct {
	// The description of the repository.
	Detail pulumi.StringPtrInput
	// The ID of the Container Registry Enterprise Edition instance.
	InstanceId pulumi.StringInput
	// The name of the image repository.
	Name pulumi.StringPtrInput
	// The name of the namespace to which the image repository belongs.
	Namespace pulumi.StringInput
	// The type of the repository. Valid values:
	// - `PUBLIC`: The repository is a public repository.
	// - `PRIVATE`: The repository is a private repository.
	RepoType pulumi.StringInput
	// The summary about the repository.
	Summary pulumi.StringInput
}

func (RegistryEnterpriseRepoArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*registryEnterpriseRepoArgs)(nil)).Elem()
}

type RegistryEnterpriseRepoInput interface {
	pulumi.Input

	ToRegistryEnterpriseRepoOutput() RegistryEnterpriseRepoOutput
	ToRegistryEnterpriseRepoOutputWithContext(ctx context.Context) RegistryEnterpriseRepoOutput
}

func (*RegistryEnterpriseRepo) ElementType() reflect.Type {
	return reflect.TypeOf((**RegistryEnterpriseRepo)(nil)).Elem()
}

func (i *RegistryEnterpriseRepo) ToRegistryEnterpriseRepoOutput() RegistryEnterpriseRepoOutput {
	return i.ToRegistryEnterpriseRepoOutputWithContext(context.Background())
}

func (i *RegistryEnterpriseRepo) ToRegistryEnterpriseRepoOutputWithContext(ctx context.Context) RegistryEnterpriseRepoOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryEnterpriseRepoOutput)
}

// RegistryEnterpriseRepoArrayInput is an input type that accepts RegistryEnterpriseRepoArray and RegistryEnterpriseRepoArrayOutput values.
// You can construct a concrete instance of `RegistryEnterpriseRepoArrayInput` via:
//
//	RegistryEnterpriseRepoArray{ RegistryEnterpriseRepoArgs{...} }
type RegistryEnterpriseRepoArrayInput interface {
	pulumi.Input

	ToRegistryEnterpriseRepoArrayOutput() RegistryEnterpriseRepoArrayOutput
	ToRegistryEnterpriseRepoArrayOutputWithContext(context.Context) RegistryEnterpriseRepoArrayOutput
}

type RegistryEnterpriseRepoArray []RegistryEnterpriseRepoInput

func (RegistryEnterpriseRepoArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RegistryEnterpriseRepo)(nil)).Elem()
}

func (i RegistryEnterpriseRepoArray) ToRegistryEnterpriseRepoArrayOutput() RegistryEnterpriseRepoArrayOutput {
	return i.ToRegistryEnterpriseRepoArrayOutputWithContext(context.Background())
}

func (i RegistryEnterpriseRepoArray) ToRegistryEnterpriseRepoArrayOutputWithContext(ctx context.Context) RegistryEnterpriseRepoArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryEnterpriseRepoArrayOutput)
}

// RegistryEnterpriseRepoMapInput is an input type that accepts RegistryEnterpriseRepoMap and RegistryEnterpriseRepoMapOutput values.
// You can construct a concrete instance of `RegistryEnterpriseRepoMapInput` via:
//
//	RegistryEnterpriseRepoMap{ "key": RegistryEnterpriseRepoArgs{...} }
type RegistryEnterpriseRepoMapInput interface {
	pulumi.Input

	ToRegistryEnterpriseRepoMapOutput() RegistryEnterpriseRepoMapOutput
	ToRegistryEnterpriseRepoMapOutputWithContext(context.Context) RegistryEnterpriseRepoMapOutput
}

type RegistryEnterpriseRepoMap map[string]RegistryEnterpriseRepoInput

func (RegistryEnterpriseRepoMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RegistryEnterpriseRepo)(nil)).Elem()
}

func (i RegistryEnterpriseRepoMap) ToRegistryEnterpriseRepoMapOutput() RegistryEnterpriseRepoMapOutput {
	return i.ToRegistryEnterpriseRepoMapOutputWithContext(context.Background())
}

func (i RegistryEnterpriseRepoMap) ToRegistryEnterpriseRepoMapOutputWithContext(ctx context.Context) RegistryEnterpriseRepoMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryEnterpriseRepoMapOutput)
}

type RegistryEnterpriseRepoOutput struct{ *pulumi.OutputState }

func (RegistryEnterpriseRepoOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RegistryEnterpriseRepo)(nil)).Elem()
}

func (o RegistryEnterpriseRepoOutput) ToRegistryEnterpriseRepoOutput() RegistryEnterpriseRepoOutput {
	return o
}

func (o RegistryEnterpriseRepoOutput) ToRegistryEnterpriseRepoOutputWithContext(ctx context.Context) RegistryEnterpriseRepoOutput {
	return o
}

// The description of the repository.
func (o RegistryEnterpriseRepoOutput) Detail() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RegistryEnterpriseRepo) pulumi.StringPtrOutput { return v.Detail }).(pulumi.StringPtrOutput)
}

// The ID of the Container Registry Enterprise Edition instance.
func (o RegistryEnterpriseRepoOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *RegistryEnterpriseRepo) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The name of the image repository.
func (o RegistryEnterpriseRepoOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RegistryEnterpriseRepo) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the namespace to which the image repository belongs.
func (o RegistryEnterpriseRepoOutput) Namespace() pulumi.StringOutput {
	return o.ApplyT(func(v *RegistryEnterpriseRepo) pulumi.StringOutput { return v.Namespace }).(pulumi.StringOutput)
}

// The ID of the repository.
func (o RegistryEnterpriseRepoOutput) RepoId() pulumi.StringOutput {
	return o.ApplyT(func(v *RegistryEnterpriseRepo) pulumi.StringOutput { return v.RepoId }).(pulumi.StringOutput)
}

// The type of the repository. Valid values:
// - `PUBLIC`: The repository is a public repository.
// - `PRIVATE`: The repository is a private repository.
func (o RegistryEnterpriseRepoOutput) RepoType() pulumi.StringOutput {
	return o.ApplyT(func(v *RegistryEnterpriseRepo) pulumi.StringOutput { return v.RepoType }).(pulumi.StringOutput)
}

// The summary about the repository.
func (o RegistryEnterpriseRepoOutput) Summary() pulumi.StringOutput {
	return o.ApplyT(func(v *RegistryEnterpriseRepo) pulumi.StringOutput { return v.Summary }).(pulumi.StringOutput)
}

type RegistryEnterpriseRepoArrayOutput struct{ *pulumi.OutputState }

func (RegistryEnterpriseRepoArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RegistryEnterpriseRepo)(nil)).Elem()
}

func (o RegistryEnterpriseRepoArrayOutput) ToRegistryEnterpriseRepoArrayOutput() RegistryEnterpriseRepoArrayOutput {
	return o
}

func (o RegistryEnterpriseRepoArrayOutput) ToRegistryEnterpriseRepoArrayOutputWithContext(ctx context.Context) RegistryEnterpriseRepoArrayOutput {
	return o
}

func (o RegistryEnterpriseRepoArrayOutput) Index(i pulumi.IntInput) RegistryEnterpriseRepoOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RegistryEnterpriseRepo {
		return vs[0].([]*RegistryEnterpriseRepo)[vs[1].(int)]
	}).(RegistryEnterpriseRepoOutput)
}

type RegistryEnterpriseRepoMapOutput struct{ *pulumi.OutputState }

func (RegistryEnterpriseRepoMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RegistryEnterpriseRepo)(nil)).Elem()
}

func (o RegistryEnterpriseRepoMapOutput) ToRegistryEnterpriseRepoMapOutput() RegistryEnterpriseRepoMapOutput {
	return o
}

func (o RegistryEnterpriseRepoMapOutput) ToRegistryEnterpriseRepoMapOutputWithContext(ctx context.Context) RegistryEnterpriseRepoMapOutput {
	return o
}

func (o RegistryEnterpriseRepoMapOutput) MapIndex(k pulumi.StringInput) RegistryEnterpriseRepoOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RegistryEnterpriseRepo {
		return vs[0].(map[string]*RegistryEnterpriseRepo)[vs[1].(string)]
	}).(RegistryEnterpriseRepoOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RegistryEnterpriseRepoInput)(nil)).Elem(), &RegistryEnterpriseRepo{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegistryEnterpriseRepoArrayInput)(nil)).Elem(), RegistryEnterpriseRepoArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegistryEnterpriseRepoMapInput)(nil)).Elem(), RegistryEnterpriseRepoMap{})
	pulumi.RegisterOutputType(RegistryEnterpriseRepoOutput{})
	pulumi.RegisterOutputType(RegistryEnterpriseRepoArrayOutput{})
	pulumi.RegisterOutputType(RegistryEnterpriseRepoMapOutput{})
}
