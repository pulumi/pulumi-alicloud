// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package log

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

type StoreIndexFieldSearch struct {
	// The alias of one field.
	Alias *string `pulumi:"alias"`
	// Whether the case sensitive for the field. Default to false. It is valid when "type" is "text" or "json".
	CaseSensitive *bool `pulumi:"caseSensitive"`
	// Whether to enable field analytics. Default to true.
	EnableAnalytics *bool `pulumi:"enableAnalytics"`
	// Whether includes the chinese for the field. Default to false. It is valid when "type" is "text" or "json".
	IncludeChinese *bool `pulumi:"includeChinese"`
	// Use nested index when type is json
	JsonKeys []StoreIndexFieldSearchJsonKey `pulumi:"jsonKeys"`
	// When using the jsonKeys field, this field is required.
	Name string `pulumi:"name"`
	// The string of several split words, like "\r", "#". It is valid when "type" is "text" or "json".
	Token *string `pulumi:"token"`
	// The type of one field. Valid values: ["long", "text", "double"]. Default to "long"
	Type *string `pulumi:"type"`
}

type StoreIndexFieldSearchInput interface {
	pulumi.Input

	ToStoreIndexFieldSearchOutput() StoreIndexFieldSearchOutput
	ToStoreIndexFieldSearchOutputWithContext(context.Context) StoreIndexFieldSearchOutput
}

type StoreIndexFieldSearchArgs struct {
	// The alias of one field.
	Alias pulumi.StringPtrInput `pulumi:"alias"`
	// Whether the case sensitive for the field. Default to false. It is valid when "type" is "text" or "json".
	CaseSensitive pulumi.BoolPtrInput `pulumi:"caseSensitive"`
	// Whether to enable field analytics. Default to true.
	EnableAnalytics pulumi.BoolPtrInput `pulumi:"enableAnalytics"`
	// Whether includes the chinese for the field. Default to false. It is valid when "type" is "text" or "json".
	IncludeChinese pulumi.BoolPtrInput `pulumi:"includeChinese"`
	// Use nested index when type is json
	JsonKeys StoreIndexFieldSearchJsonKeyArrayInput `pulumi:"jsonKeys"`
	// When using the jsonKeys field, this field is required.
	Name pulumi.StringInput `pulumi:"name"`
	// The string of several split words, like "\r", "#". It is valid when "type" is "text" or "json".
	Token pulumi.StringPtrInput `pulumi:"token"`
	// The type of one field. Valid values: ["long", "text", "double"]. Default to "long"
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (StoreIndexFieldSearchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*StoreIndexFieldSearch)(nil)).Elem()
}

func (i StoreIndexFieldSearchArgs) ToStoreIndexFieldSearchOutput() StoreIndexFieldSearchOutput {
	return i.ToStoreIndexFieldSearchOutputWithContext(context.Background())
}

func (i StoreIndexFieldSearchArgs) ToStoreIndexFieldSearchOutputWithContext(ctx context.Context) StoreIndexFieldSearchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexFieldSearchOutput)
}

type StoreIndexFieldSearchArrayInput interface {
	pulumi.Input

	ToStoreIndexFieldSearchArrayOutput() StoreIndexFieldSearchArrayOutput
	ToStoreIndexFieldSearchArrayOutputWithContext(context.Context) StoreIndexFieldSearchArrayOutput
}

type StoreIndexFieldSearchArray []StoreIndexFieldSearchInput

func (StoreIndexFieldSearchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]StoreIndexFieldSearch)(nil)).Elem()
}

func (i StoreIndexFieldSearchArray) ToStoreIndexFieldSearchArrayOutput() StoreIndexFieldSearchArrayOutput {
	return i.ToStoreIndexFieldSearchArrayOutputWithContext(context.Background())
}

func (i StoreIndexFieldSearchArray) ToStoreIndexFieldSearchArrayOutputWithContext(ctx context.Context) StoreIndexFieldSearchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexFieldSearchArrayOutput)
}

type StoreIndexFieldSearchOutput struct { *pulumi.OutputState }

func (StoreIndexFieldSearchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*StoreIndexFieldSearch)(nil)).Elem()
}

func (o StoreIndexFieldSearchOutput) ToStoreIndexFieldSearchOutput() StoreIndexFieldSearchOutput {
	return o
}

func (o StoreIndexFieldSearchOutput) ToStoreIndexFieldSearchOutputWithContext(ctx context.Context) StoreIndexFieldSearchOutput {
	return o
}

// The alias of one field.
func (o StoreIndexFieldSearchOutput) Alias() pulumi.StringPtrOutput {
	return o.ApplyT(func (v StoreIndexFieldSearch) *string { return v.Alias }).(pulumi.StringPtrOutput)
}

// Whether the case sensitive for the field. Default to false. It is valid when "type" is "text" or "json".
func (o StoreIndexFieldSearchOutput) CaseSensitive() pulumi.BoolPtrOutput {
	return o.ApplyT(func (v StoreIndexFieldSearch) *bool { return v.CaseSensitive }).(pulumi.BoolPtrOutput)
}

// Whether to enable field analytics. Default to true.
func (o StoreIndexFieldSearchOutput) EnableAnalytics() pulumi.BoolPtrOutput {
	return o.ApplyT(func (v StoreIndexFieldSearch) *bool { return v.EnableAnalytics }).(pulumi.BoolPtrOutput)
}

// Whether includes the chinese for the field. Default to false. It is valid when "type" is "text" or "json".
func (o StoreIndexFieldSearchOutput) IncludeChinese() pulumi.BoolPtrOutput {
	return o.ApplyT(func (v StoreIndexFieldSearch) *bool { return v.IncludeChinese }).(pulumi.BoolPtrOutput)
}

// Use nested index when type is json
func (o StoreIndexFieldSearchOutput) JsonKeys() StoreIndexFieldSearchJsonKeyArrayOutput {
	return o.ApplyT(func (v StoreIndexFieldSearch) []StoreIndexFieldSearchJsonKey { return v.JsonKeys }).(StoreIndexFieldSearchJsonKeyArrayOutput)
}

// When using the jsonKeys field, this field is required.
func (o StoreIndexFieldSearchOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func (v StoreIndexFieldSearch) string { return v.Name }).(pulumi.StringOutput)
}

// The string of several split words, like "\r", "#". It is valid when "type" is "text" or "json".
func (o StoreIndexFieldSearchOutput) Token() pulumi.StringPtrOutput {
	return o.ApplyT(func (v StoreIndexFieldSearch) *string { return v.Token }).(pulumi.StringPtrOutput)
}

// The type of one field. Valid values: ["long", "text", "double"]. Default to "long"
func (o StoreIndexFieldSearchOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func (v StoreIndexFieldSearch) *string { return v.Type }).(pulumi.StringPtrOutput)
}

type StoreIndexFieldSearchArrayOutput struct { *pulumi.OutputState}

func (StoreIndexFieldSearchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]StoreIndexFieldSearch)(nil)).Elem()
}

func (o StoreIndexFieldSearchArrayOutput) ToStoreIndexFieldSearchArrayOutput() StoreIndexFieldSearchArrayOutput {
	return o
}

func (o StoreIndexFieldSearchArrayOutput) ToStoreIndexFieldSearchArrayOutputWithContext(ctx context.Context) StoreIndexFieldSearchArrayOutput {
	return o
}

func (o StoreIndexFieldSearchArrayOutput) Index(i pulumi.IntInput) StoreIndexFieldSearchOutput {
	return pulumi.All(o, i).ApplyT(func (vs []interface{}) StoreIndexFieldSearch {
		return vs[0].([]StoreIndexFieldSearch)[vs[1].(int)]
	}).(StoreIndexFieldSearchOutput)
}

type StoreIndexFieldSearchJsonKey struct {
	// The alias of one field.
	Alias *string `pulumi:"alias"`
	// Whether to enable statistics. default to true.
	DocValue *bool `pulumi:"docValue"`
	// When using the jsonKeys field, this field is required.
	Name string `pulumi:"name"`
	// The type of one field. Valid values: ["long", "text", "double"]. Default to "long"
	Type *string `pulumi:"type"`
}

type StoreIndexFieldSearchJsonKeyInput interface {
	pulumi.Input

	ToStoreIndexFieldSearchJsonKeyOutput() StoreIndexFieldSearchJsonKeyOutput
	ToStoreIndexFieldSearchJsonKeyOutputWithContext(context.Context) StoreIndexFieldSearchJsonKeyOutput
}

type StoreIndexFieldSearchJsonKeyArgs struct {
	// The alias of one field.
	Alias pulumi.StringPtrInput `pulumi:"alias"`
	// Whether to enable statistics. default to true.
	DocValue pulumi.BoolPtrInput `pulumi:"docValue"`
	// When using the jsonKeys field, this field is required.
	Name pulumi.StringInput `pulumi:"name"`
	// The type of one field. Valid values: ["long", "text", "double"]. Default to "long"
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (StoreIndexFieldSearchJsonKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*StoreIndexFieldSearchJsonKey)(nil)).Elem()
}

func (i StoreIndexFieldSearchJsonKeyArgs) ToStoreIndexFieldSearchJsonKeyOutput() StoreIndexFieldSearchJsonKeyOutput {
	return i.ToStoreIndexFieldSearchJsonKeyOutputWithContext(context.Background())
}

func (i StoreIndexFieldSearchJsonKeyArgs) ToStoreIndexFieldSearchJsonKeyOutputWithContext(ctx context.Context) StoreIndexFieldSearchJsonKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexFieldSearchJsonKeyOutput)
}

type StoreIndexFieldSearchJsonKeyArrayInput interface {
	pulumi.Input

	ToStoreIndexFieldSearchJsonKeyArrayOutput() StoreIndexFieldSearchJsonKeyArrayOutput
	ToStoreIndexFieldSearchJsonKeyArrayOutputWithContext(context.Context) StoreIndexFieldSearchJsonKeyArrayOutput
}

type StoreIndexFieldSearchJsonKeyArray []StoreIndexFieldSearchJsonKeyInput

func (StoreIndexFieldSearchJsonKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]StoreIndexFieldSearchJsonKey)(nil)).Elem()
}

func (i StoreIndexFieldSearchJsonKeyArray) ToStoreIndexFieldSearchJsonKeyArrayOutput() StoreIndexFieldSearchJsonKeyArrayOutput {
	return i.ToStoreIndexFieldSearchJsonKeyArrayOutputWithContext(context.Background())
}

func (i StoreIndexFieldSearchJsonKeyArray) ToStoreIndexFieldSearchJsonKeyArrayOutputWithContext(ctx context.Context) StoreIndexFieldSearchJsonKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexFieldSearchJsonKeyArrayOutput)
}

type StoreIndexFieldSearchJsonKeyOutput struct { *pulumi.OutputState }

func (StoreIndexFieldSearchJsonKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*StoreIndexFieldSearchJsonKey)(nil)).Elem()
}

func (o StoreIndexFieldSearchJsonKeyOutput) ToStoreIndexFieldSearchJsonKeyOutput() StoreIndexFieldSearchJsonKeyOutput {
	return o
}

func (o StoreIndexFieldSearchJsonKeyOutput) ToStoreIndexFieldSearchJsonKeyOutputWithContext(ctx context.Context) StoreIndexFieldSearchJsonKeyOutput {
	return o
}

// The alias of one field.
func (o StoreIndexFieldSearchJsonKeyOutput) Alias() pulumi.StringPtrOutput {
	return o.ApplyT(func (v StoreIndexFieldSearchJsonKey) *string { return v.Alias }).(pulumi.StringPtrOutput)
}

// Whether to enable statistics. default to true.
func (o StoreIndexFieldSearchJsonKeyOutput) DocValue() pulumi.BoolPtrOutput {
	return o.ApplyT(func (v StoreIndexFieldSearchJsonKey) *bool { return v.DocValue }).(pulumi.BoolPtrOutput)
}

// When using the jsonKeys field, this field is required.
func (o StoreIndexFieldSearchJsonKeyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func (v StoreIndexFieldSearchJsonKey) string { return v.Name }).(pulumi.StringOutput)
}

// The type of one field. Valid values: ["long", "text", "double"]. Default to "long"
func (o StoreIndexFieldSearchJsonKeyOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func (v StoreIndexFieldSearchJsonKey) *string { return v.Type }).(pulumi.StringPtrOutput)
}

type StoreIndexFieldSearchJsonKeyArrayOutput struct { *pulumi.OutputState}

func (StoreIndexFieldSearchJsonKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]StoreIndexFieldSearchJsonKey)(nil)).Elem()
}

func (o StoreIndexFieldSearchJsonKeyArrayOutput) ToStoreIndexFieldSearchJsonKeyArrayOutput() StoreIndexFieldSearchJsonKeyArrayOutput {
	return o
}

func (o StoreIndexFieldSearchJsonKeyArrayOutput) ToStoreIndexFieldSearchJsonKeyArrayOutputWithContext(ctx context.Context) StoreIndexFieldSearchJsonKeyArrayOutput {
	return o
}

func (o StoreIndexFieldSearchJsonKeyArrayOutput) Index(i pulumi.IntInput) StoreIndexFieldSearchJsonKeyOutput {
	return pulumi.All(o, i).ApplyT(func (vs []interface{}) StoreIndexFieldSearchJsonKey {
		return vs[0].([]StoreIndexFieldSearchJsonKey)[vs[1].(int)]
	}).(StoreIndexFieldSearchJsonKeyOutput)
}

type StoreIndexFullText struct {
	// Whether the case sensitive for the field. Default to false. It is valid when "type" is "text" or "json".
	CaseSensitive *bool `pulumi:"caseSensitive"`
	// Whether includes the chinese for the field. Default to false. It is valid when "type" is "text" or "json".
	IncludeChinese *bool `pulumi:"includeChinese"`
	// The string of several split words, like "\r", "#". It is valid when "type" is "text" or "json".
	Token *string `pulumi:"token"`
}

type StoreIndexFullTextInput interface {
	pulumi.Input

	ToStoreIndexFullTextOutput() StoreIndexFullTextOutput
	ToStoreIndexFullTextOutputWithContext(context.Context) StoreIndexFullTextOutput
}

type StoreIndexFullTextArgs struct {
	// Whether the case sensitive for the field. Default to false. It is valid when "type" is "text" or "json".
	CaseSensitive pulumi.BoolPtrInput `pulumi:"caseSensitive"`
	// Whether includes the chinese for the field. Default to false. It is valid when "type" is "text" or "json".
	IncludeChinese pulumi.BoolPtrInput `pulumi:"includeChinese"`
	// The string of several split words, like "\r", "#". It is valid when "type" is "text" or "json".
	Token pulumi.StringPtrInput `pulumi:"token"`
}

func (StoreIndexFullTextArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*StoreIndexFullText)(nil)).Elem()
}

func (i StoreIndexFullTextArgs) ToStoreIndexFullTextOutput() StoreIndexFullTextOutput {
	return i.ToStoreIndexFullTextOutputWithContext(context.Background())
}

func (i StoreIndexFullTextArgs) ToStoreIndexFullTextOutputWithContext(ctx context.Context) StoreIndexFullTextOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexFullTextOutput)
}

func (i StoreIndexFullTextArgs) ToStoreIndexFullTextPtrOutput() StoreIndexFullTextPtrOutput {
	return i.ToStoreIndexFullTextPtrOutputWithContext(context.Background())
}

func (i StoreIndexFullTextArgs) ToStoreIndexFullTextPtrOutputWithContext(ctx context.Context) StoreIndexFullTextPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexFullTextOutput).ToStoreIndexFullTextPtrOutputWithContext(ctx)
}

type StoreIndexFullTextPtrInput interface {
	pulumi.Input

	ToStoreIndexFullTextPtrOutput() StoreIndexFullTextPtrOutput
	ToStoreIndexFullTextPtrOutputWithContext(context.Context) StoreIndexFullTextPtrOutput
}

type storeIndexFullTextPtrType StoreIndexFullTextArgs

func StoreIndexFullTextPtr(v *StoreIndexFullTextArgs) StoreIndexFullTextPtrInput {	return (*storeIndexFullTextPtrType)(v)
}

func (*storeIndexFullTextPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**StoreIndexFullText)(nil)).Elem()
}

func (i *storeIndexFullTextPtrType) ToStoreIndexFullTextPtrOutput() StoreIndexFullTextPtrOutput {
	return i.ToStoreIndexFullTextPtrOutputWithContext(context.Background())
}

func (i *storeIndexFullTextPtrType) ToStoreIndexFullTextPtrOutputWithContext(ctx context.Context) StoreIndexFullTextPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexFullTextPtrOutput)
}

type StoreIndexFullTextOutput struct { *pulumi.OutputState }

func (StoreIndexFullTextOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*StoreIndexFullText)(nil)).Elem()
}

func (o StoreIndexFullTextOutput) ToStoreIndexFullTextOutput() StoreIndexFullTextOutput {
	return o
}

func (o StoreIndexFullTextOutput) ToStoreIndexFullTextOutputWithContext(ctx context.Context) StoreIndexFullTextOutput {
	return o
}

func (o StoreIndexFullTextOutput) ToStoreIndexFullTextPtrOutput() StoreIndexFullTextPtrOutput {
	return o.ToStoreIndexFullTextPtrOutputWithContext(context.Background())
}

func (o StoreIndexFullTextOutput) ToStoreIndexFullTextPtrOutputWithContext(ctx context.Context) StoreIndexFullTextPtrOutput {
	return o.ApplyT(func(v StoreIndexFullText) *StoreIndexFullText {
		return &v
	}).(StoreIndexFullTextPtrOutput)
}
// Whether the case sensitive for the field. Default to false. It is valid when "type" is "text" or "json".
func (o StoreIndexFullTextOutput) CaseSensitive() pulumi.BoolPtrOutput {
	return o.ApplyT(func (v StoreIndexFullText) *bool { return v.CaseSensitive }).(pulumi.BoolPtrOutput)
}

// Whether includes the chinese for the field. Default to false. It is valid when "type" is "text" or "json".
func (o StoreIndexFullTextOutput) IncludeChinese() pulumi.BoolPtrOutput {
	return o.ApplyT(func (v StoreIndexFullText) *bool { return v.IncludeChinese }).(pulumi.BoolPtrOutput)
}

// The string of several split words, like "\r", "#". It is valid when "type" is "text" or "json".
func (o StoreIndexFullTextOutput) Token() pulumi.StringPtrOutput {
	return o.ApplyT(func (v StoreIndexFullText) *string { return v.Token }).(pulumi.StringPtrOutput)
}

type StoreIndexFullTextPtrOutput struct { *pulumi.OutputState}

func (StoreIndexFullTextPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StoreIndexFullText)(nil)).Elem()
}

func (o StoreIndexFullTextPtrOutput) ToStoreIndexFullTextPtrOutput() StoreIndexFullTextPtrOutput {
	return o
}

func (o StoreIndexFullTextPtrOutput) ToStoreIndexFullTextPtrOutputWithContext(ctx context.Context) StoreIndexFullTextPtrOutput {
	return o
}

func (o StoreIndexFullTextPtrOutput) Elem() StoreIndexFullTextOutput {
	return o.ApplyT(func (v *StoreIndexFullText) StoreIndexFullText { return *v }).(StoreIndexFullTextOutput)
}

// Whether the case sensitive for the field. Default to false. It is valid when "type" is "text" or "json".
func (o StoreIndexFullTextPtrOutput) CaseSensitive() pulumi.BoolPtrOutput {
	return o.ApplyT(func (v StoreIndexFullText) *bool { return v.CaseSensitive }).(pulumi.BoolPtrOutput)
}

// Whether includes the chinese for the field. Default to false. It is valid when "type" is "text" or "json".
func (o StoreIndexFullTextPtrOutput) IncludeChinese() pulumi.BoolPtrOutput {
	return o.ApplyT(func (v StoreIndexFullText) *bool { return v.IncludeChinese }).(pulumi.BoolPtrOutput)
}

// The string of several split words, like "\r", "#". It is valid when "type" is "text" or "json".
func (o StoreIndexFullTextPtrOutput) Token() pulumi.StringPtrOutput {
	return o.ApplyT(func (v StoreIndexFullText) *string { return v.Token }).(pulumi.StringPtrOutput)
}

type StoreShard struct {
	BeginKey *string `pulumi:"beginKey"`
	EndKey *string `pulumi:"endKey"`
	// The ID of the log project. It formats of `<project>:<name>`.
	Id *int `pulumi:"id"`
	Status *string `pulumi:"status"`
}

type StoreShardInput interface {
	pulumi.Input

	ToStoreShardOutput() StoreShardOutput
	ToStoreShardOutputWithContext(context.Context) StoreShardOutput
}

type StoreShardArgs struct {
	BeginKey pulumi.StringPtrInput `pulumi:"beginKey"`
	EndKey pulumi.StringPtrInput `pulumi:"endKey"`
	// The ID of the log project. It formats of `<project>:<name>`.
	Id pulumi.IntPtrInput `pulumi:"id"`
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (StoreShardArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*StoreShard)(nil)).Elem()
}

func (i StoreShardArgs) ToStoreShardOutput() StoreShardOutput {
	return i.ToStoreShardOutputWithContext(context.Background())
}

func (i StoreShardArgs) ToStoreShardOutputWithContext(ctx context.Context) StoreShardOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreShardOutput)
}

type StoreShardArrayInput interface {
	pulumi.Input

	ToStoreShardArrayOutput() StoreShardArrayOutput
	ToStoreShardArrayOutputWithContext(context.Context) StoreShardArrayOutput
}

type StoreShardArray []StoreShardInput

func (StoreShardArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]StoreShard)(nil)).Elem()
}

func (i StoreShardArray) ToStoreShardArrayOutput() StoreShardArrayOutput {
	return i.ToStoreShardArrayOutputWithContext(context.Background())
}

func (i StoreShardArray) ToStoreShardArrayOutputWithContext(ctx context.Context) StoreShardArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreShardArrayOutput)
}

type StoreShardOutput struct { *pulumi.OutputState }

func (StoreShardOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*StoreShard)(nil)).Elem()
}

func (o StoreShardOutput) ToStoreShardOutput() StoreShardOutput {
	return o
}

func (o StoreShardOutput) ToStoreShardOutputWithContext(ctx context.Context) StoreShardOutput {
	return o
}

func (o StoreShardOutput) BeginKey() pulumi.StringPtrOutput {
	return o.ApplyT(func (v StoreShard) *string { return v.BeginKey }).(pulumi.StringPtrOutput)
}

func (o StoreShardOutput) EndKey() pulumi.StringPtrOutput {
	return o.ApplyT(func (v StoreShard) *string { return v.EndKey }).(pulumi.StringPtrOutput)
}

// The ID of the log project. It formats of `<project>:<name>`.
func (o StoreShardOutput) Id() pulumi.IntPtrOutput {
	return o.ApplyT(func (v StoreShard) *int { return v.Id }).(pulumi.IntPtrOutput)
}

func (o StoreShardOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func (v StoreShard) *string { return v.Status }).(pulumi.StringPtrOutput)
}

type StoreShardArrayOutput struct { *pulumi.OutputState}

func (StoreShardArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]StoreShard)(nil)).Elem()
}

func (o StoreShardArrayOutput) ToStoreShardArrayOutput() StoreShardArrayOutput {
	return o
}

func (o StoreShardArrayOutput) ToStoreShardArrayOutputWithContext(ctx context.Context) StoreShardArrayOutput {
	return o
}

func (o StoreShardArrayOutput) Index(i pulumi.IntInput) StoreShardOutput {
	return pulumi.All(o, i).ApplyT(func (vs []interface{}) StoreShard {
		return vs[0].([]StoreShard)[vs[1].(int)]
	}).(StoreShardOutput)
}

func init() {
	pulumi.RegisterOutputType(StoreIndexFieldSearchOutput{})
	pulumi.RegisterOutputType(StoreIndexFieldSearchArrayOutput{})
	pulumi.RegisterOutputType(StoreIndexFieldSearchJsonKeyOutput{})
	pulumi.RegisterOutputType(StoreIndexFieldSearchJsonKeyArrayOutput{})
	pulumi.RegisterOutputType(StoreIndexFullTextOutput{})
	pulumi.RegisterOutputType(StoreIndexFullTextPtrOutput{})
	pulumi.RegisterOutputType(StoreShardOutput{})
	pulumi.RegisterOutputType(StoreShardArrayOutput{})
}