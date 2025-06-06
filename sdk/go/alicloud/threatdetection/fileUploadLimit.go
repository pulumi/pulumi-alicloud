// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package threatdetection

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Threat Detection File Upload Limit can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:threatdetection/fileUploadLimit:FileUploadLimit example
// ```
type FileUploadLimit struct {
	pulumi.CustomResourceState

	// File Upload Threshold.
	Limit pulumi.IntOutput `pulumi:"limit"`
}

// NewFileUploadLimit registers a new resource with the given unique name, arguments, and options.
func NewFileUploadLimit(ctx *pulumi.Context,
	name string, args *FileUploadLimitArgs, opts ...pulumi.ResourceOption) (*FileUploadLimit, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Limit == nil {
		return nil, errors.New("invalid value for required argument 'Limit'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FileUploadLimit
	err := ctx.RegisterResource("alicloud:threatdetection/fileUploadLimit:FileUploadLimit", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFileUploadLimit gets an existing FileUploadLimit resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFileUploadLimit(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FileUploadLimitState, opts ...pulumi.ResourceOption) (*FileUploadLimit, error) {
	var resource FileUploadLimit
	err := ctx.ReadResource("alicloud:threatdetection/fileUploadLimit:FileUploadLimit", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FileUploadLimit resources.
type fileUploadLimitState struct {
	// File Upload Threshold.
	Limit *int `pulumi:"limit"`
}

type FileUploadLimitState struct {
	// File Upload Threshold.
	Limit pulumi.IntPtrInput
}

func (FileUploadLimitState) ElementType() reflect.Type {
	return reflect.TypeOf((*fileUploadLimitState)(nil)).Elem()
}

type fileUploadLimitArgs struct {
	// File Upload Threshold.
	Limit int `pulumi:"limit"`
}

// The set of arguments for constructing a FileUploadLimit resource.
type FileUploadLimitArgs struct {
	// File Upload Threshold.
	Limit pulumi.IntInput
}

func (FileUploadLimitArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*fileUploadLimitArgs)(nil)).Elem()
}

type FileUploadLimitInput interface {
	pulumi.Input

	ToFileUploadLimitOutput() FileUploadLimitOutput
	ToFileUploadLimitOutputWithContext(ctx context.Context) FileUploadLimitOutput
}

func (*FileUploadLimit) ElementType() reflect.Type {
	return reflect.TypeOf((**FileUploadLimit)(nil)).Elem()
}

func (i *FileUploadLimit) ToFileUploadLimitOutput() FileUploadLimitOutput {
	return i.ToFileUploadLimitOutputWithContext(context.Background())
}

func (i *FileUploadLimit) ToFileUploadLimitOutputWithContext(ctx context.Context) FileUploadLimitOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileUploadLimitOutput)
}

// FileUploadLimitArrayInput is an input type that accepts FileUploadLimitArray and FileUploadLimitArrayOutput values.
// You can construct a concrete instance of `FileUploadLimitArrayInput` via:
//
//	FileUploadLimitArray{ FileUploadLimitArgs{...} }
type FileUploadLimitArrayInput interface {
	pulumi.Input

	ToFileUploadLimitArrayOutput() FileUploadLimitArrayOutput
	ToFileUploadLimitArrayOutputWithContext(context.Context) FileUploadLimitArrayOutput
}

type FileUploadLimitArray []FileUploadLimitInput

func (FileUploadLimitArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FileUploadLimit)(nil)).Elem()
}

func (i FileUploadLimitArray) ToFileUploadLimitArrayOutput() FileUploadLimitArrayOutput {
	return i.ToFileUploadLimitArrayOutputWithContext(context.Background())
}

func (i FileUploadLimitArray) ToFileUploadLimitArrayOutputWithContext(ctx context.Context) FileUploadLimitArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileUploadLimitArrayOutput)
}

// FileUploadLimitMapInput is an input type that accepts FileUploadLimitMap and FileUploadLimitMapOutput values.
// You can construct a concrete instance of `FileUploadLimitMapInput` via:
//
//	FileUploadLimitMap{ "key": FileUploadLimitArgs{...} }
type FileUploadLimitMapInput interface {
	pulumi.Input

	ToFileUploadLimitMapOutput() FileUploadLimitMapOutput
	ToFileUploadLimitMapOutputWithContext(context.Context) FileUploadLimitMapOutput
}

type FileUploadLimitMap map[string]FileUploadLimitInput

func (FileUploadLimitMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FileUploadLimit)(nil)).Elem()
}

func (i FileUploadLimitMap) ToFileUploadLimitMapOutput() FileUploadLimitMapOutput {
	return i.ToFileUploadLimitMapOutputWithContext(context.Background())
}

func (i FileUploadLimitMap) ToFileUploadLimitMapOutputWithContext(ctx context.Context) FileUploadLimitMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileUploadLimitMapOutput)
}

type FileUploadLimitOutput struct{ *pulumi.OutputState }

func (FileUploadLimitOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FileUploadLimit)(nil)).Elem()
}

func (o FileUploadLimitOutput) ToFileUploadLimitOutput() FileUploadLimitOutput {
	return o
}

func (o FileUploadLimitOutput) ToFileUploadLimitOutputWithContext(ctx context.Context) FileUploadLimitOutput {
	return o
}

// File Upload Threshold.
func (o FileUploadLimitOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v *FileUploadLimit) pulumi.IntOutput { return v.Limit }).(pulumi.IntOutput)
}

type FileUploadLimitArrayOutput struct{ *pulumi.OutputState }

func (FileUploadLimitArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FileUploadLimit)(nil)).Elem()
}

func (o FileUploadLimitArrayOutput) ToFileUploadLimitArrayOutput() FileUploadLimitArrayOutput {
	return o
}

func (o FileUploadLimitArrayOutput) ToFileUploadLimitArrayOutputWithContext(ctx context.Context) FileUploadLimitArrayOutput {
	return o
}

func (o FileUploadLimitArrayOutput) Index(i pulumi.IntInput) FileUploadLimitOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FileUploadLimit {
		return vs[0].([]*FileUploadLimit)[vs[1].(int)]
	}).(FileUploadLimitOutput)
}

type FileUploadLimitMapOutput struct{ *pulumi.OutputState }

func (FileUploadLimitMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FileUploadLimit)(nil)).Elem()
}

func (o FileUploadLimitMapOutput) ToFileUploadLimitMapOutput() FileUploadLimitMapOutput {
	return o
}

func (o FileUploadLimitMapOutput) ToFileUploadLimitMapOutputWithContext(ctx context.Context) FileUploadLimitMapOutput {
	return o
}

func (o FileUploadLimitMapOutput) MapIndex(k pulumi.StringInput) FileUploadLimitOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FileUploadLimit {
		return vs[0].(map[string]*FileUploadLimit)[vs[1].(string)]
	}).(FileUploadLimitOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FileUploadLimitInput)(nil)).Elem(), &FileUploadLimit{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileUploadLimitArrayInput)(nil)).Elem(), FileUploadLimitArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileUploadLimitMapInput)(nil)).Elem(), FileUploadLimitMap{})
	pulumi.RegisterOutputType(FileUploadLimitOutput{})
	pulumi.RegisterOutputType(FileUploadLimitArrayOutput{})
	pulumi.RegisterOutputType(FileUploadLimitMapOutput{})
}
