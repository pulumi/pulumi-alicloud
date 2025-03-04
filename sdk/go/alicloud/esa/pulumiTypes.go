// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package esa

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type HttpRequestHeaderModificationRuleRequestHeaderModification struct {
	// Request Header Name.
	Name string `pulumi:"name"`
	// Mode of operation. Value range:
	// add: add.
	// del: delete
	// modify: change.
	Operation string `pulumi:"operation"`
	// Request header value
	Value *string `pulumi:"value"`
}

// HttpRequestHeaderModificationRuleRequestHeaderModificationInput is an input type that accepts HttpRequestHeaderModificationRuleRequestHeaderModificationArgs and HttpRequestHeaderModificationRuleRequestHeaderModificationOutput values.
// You can construct a concrete instance of `HttpRequestHeaderModificationRuleRequestHeaderModificationInput` via:
//
//	HttpRequestHeaderModificationRuleRequestHeaderModificationArgs{...}
type HttpRequestHeaderModificationRuleRequestHeaderModificationInput interface {
	pulumi.Input

	ToHttpRequestHeaderModificationRuleRequestHeaderModificationOutput() HttpRequestHeaderModificationRuleRequestHeaderModificationOutput
	ToHttpRequestHeaderModificationRuleRequestHeaderModificationOutputWithContext(context.Context) HttpRequestHeaderModificationRuleRequestHeaderModificationOutput
}

type HttpRequestHeaderModificationRuleRequestHeaderModificationArgs struct {
	// Request Header Name.
	Name pulumi.StringInput `pulumi:"name"`
	// Mode of operation. Value range:
	// add: add.
	// del: delete
	// modify: change.
	Operation pulumi.StringInput `pulumi:"operation"`
	// Request header value
	Value pulumi.StringPtrInput `pulumi:"value"`
}

func (HttpRequestHeaderModificationRuleRequestHeaderModificationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*HttpRequestHeaderModificationRuleRequestHeaderModification)(nil)).Elem()
}

func (i HttpRequestHeaderModificationRuleRequestHeaderModificationArgs) ToHttpRequestHeaderModificationRuleRequestHeaderModificationOutput() HttpRequestHeaderModificationRuleRequestHeaderModificationOutput {
	return i.ToHttpRequestHeaderModificationRuleRequestHeaderModificationOutputWithContext(context.Background())
}

func (i HttpRequestHeaderModificationRuleRequestHeaderModificationArgs) ToHttpRequestHeaderModificationRuleRequestHeaderModificationOutputWithContext(ctx context.Context) HttpRequestHeaderModificationRuleRequestHeaderModificationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HttpRequestHeaderModificationRuleRequestHeaderModificationOutput)
}

// HttpRequestHeaderModificationRuleRequestHeaderModificationArrayInput is an input type that accepts HttpRequestHeaderModificationRuleRequestHeaderModificationArray and HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput values.
// You can construct a concrete instance of `HttpRequestHeaderModificationRuleRequestHeaderModificationArrayInput` via:
//
//	HttpRequestHeaderModificationRuleRequestHeaderModificationArray{ HttpRequestHeaderModificationRuleRequestHeaderModificationArgs{...} }
type HttpRequestHeaderModificationRuleRequestHeaderModificationArrayInput interface {
	pulumi.Input

	ToHttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput() HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput
	ToHttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutputWithContext(context.Context) HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput
}

type HttpRequestHeaderModificationRuleRequestHeaderModificationArray []HttpRequestHeaderModificationRuleRequestHeaderModificationInput

func (HttpRequestHeaderModificationRuleRequestHeaderModificationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]HttpRequestHeaderModificationRuleRequestHeaderModification)(nil)).Elem()
}

func (i HttpRequestHeaderModificationRuleRequestHeaderModificationArray) ToHttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput() HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput {
	return i.ToHttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutputWithContext(context.Background())
}

func (i HttpRequestHeaderModificationRuleRequestHeaderModificationArray) ToHttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutputWithContext(ctx context.Context) HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput)
}

type HttpRequestHeaderModificationRuleRequestHeaderModificationOutput struct{ *pulumi.OutputState }

func (HttpRequestHeaderModificationRuleRequestHeaderModificationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*HttpRequestHeaderModificationRuleRequestHeaderModification)(nil)).Elem()
}

func (o HttpRequestHeaderModificationRuleRequestHeaderModificationOutput) ToHttpRequestHeaderModificationRuleRequestHeaderModificationOutput() HttpRequestHeaderModificationRuleRequestHeaderModificationOutput {
	return o
}

func (o HttpRequestHeaderModificationRuleRequestHeaderModificationOutput) ToHttpRequestHeaderModificationRuleRequestHeaderModificationOutputWithContext(ctx context.Context) HttpRequestHeaderModificationRuleRequestHeaderModificationOutput {
	return o
}

// Request Header Name.
func (o HttpRequestHeaderModificationRuleRequestHeaderModificationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v HttpRequestHeaderModificationRuleRequestHeaderModification) string { return v.Name }).(pulumi.StringOutput)
}

// Mode of operation. Value range:
// add: add.
// del: delete
// modify: change.
func (o HttpRequestHeaderModificationRuleRequestHeaderModificationOutput) Operation() pulumi.StringOutput {
	return o.ApplyT(func(v HttpRequestHeaderModificationRuleRequestHeaderModification) string { return v.Operation }).(pulumi.StringOutput)
}

// Request header value
func (o HttpRequestHeaderModificationRuleRequestHeaderModificationOutput) Value() pulumi.StringPtrOutput {
	return o.ApplyT(func(v HttpRequestHeaderModificationRuleRequestHeaderModification) *string { return v.Value }).(pulumi.StringPtrOutput)
}

type HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput struct{ *pulumi.OutputState }

func (HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]HttpRequestHeaderModificationRuleRequestHeaderModification)(nil)).Elem()
}

func (o HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput) ToHttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput() HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput {
	return o
}

func (o HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput) ToHttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutputWithContext(ctx context.Context) HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput {
	return o
}

func (o HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput) Index(i pulumi.IntInput) HttpRequestHeaderModificationRuleRequestHeaderModificationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) HttpRequestHeaderModificationRuleRequestHeaderModification {
		return vs[0].([]HttpRequestHeaderModificationRuleRequestHeaderModification)[vs[1].(int)]
	}).(HttpRequestHeaderModificationRuleRequestHeaderModificationOutput)
}

type RecordAuthConf struct {
	// The access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
	AccessKey *string `pulumi:"accessKey"`
	// The authentication type of the origin server. Different origins support different authentication types. The type of origin refers to the SourceType parameter in this operation. If the type of origin is OSS or S3, you must specify the authentication type of the origin. Valid values:
	AuthType *string `pulumi:"authType"`
	// The version of the signature algorithm. This parameter is required when the origin type is S3 and AuthType is private. The following two types are supported:
	Region *string `pulumi:"region"`
	// The secret access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
	SecretKey *string `pulumi:"secretKey"`
	// The region of the origin. If the origin type is S3, you must specify this value. You can get the region information from the official website of S3.
	Version *string `pulumi:"version"`
}

// RecordAuthConfInput is an input type that accepts RecordAuthConfArgs and RecordAuthConfOutput values.
// You can construct a concrete instance of `RecordAuthConfInput` via:
//
//	RecordAuthConfArgs{...}
type RecordAuthConfInput interface {
	pulumi.Input

	ToRecordAuthConfOutput() RecordAuthConfOutput
	ToRecordAuthConfOutputWithContext(context.Context) RecordAuthConfOutput
}

type RecordAuthConfArgs struct {
	// The access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
	AccessKey pulumi.StringPtrInput `pulumi:"accessKey"`
	// The authentication type of the origin server. Different origins support different authentication types. The type of origin refers to the SourceType parameter in this operation. If the type of origin is OSS or S3, you must specify the authentication type of the origin. Valid values:
	AuthType pulumi.StringPtrInput `pulumi:"authType"`
	// The version of the signature algorithm. This parameter is required when the origin type is S3 and AuthType is private. The following two types are supported:
	Region pulumi.StringPtrInput `pulumi:"region"`
	// The secret access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
	SecretKey pulumi.StringPtrInput `pulumi:"secretKey"`
	// The region of the origin. If the origin type is S3, you must specify this value. You can get the region information from the official website of S3.
	Version pulumi.StringPtrInput `pulumi:"version"`
}

func (RecordAuthConfArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*RecordAuthConf)(nil)).Elem()
}

func (i RecordAuthConfArgs) ToRecordAuthConfOutput() RecordAuthConfOutput {
	return i.ToRecordAuthConfOutputWithContext(context.Background())
}

func (i RecordAuthConfArgs) ToRecordAuthConfOutputWithContext(ctx context.Context) RecordAuthConfOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordAuthConfOutput)
}

func (i RecordAuthConfArgs) ToRecordAuthConfPtrOutput() RecordAuthConfPtrOutput {
	return i.ToRecordAuthConfPtrOutputWithContext(context.Background())
}

func (i RecordAuthConfArgs) ToRecordAuthConfPtrOutputWithContext(ctx context.Context) RecordAuthConfPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordAuthConfOutput).ToRecordAuthConfPtrOutputWithContext(ctx)
}

// RecordAuthConfPtrInput is an input type that accepts RecordAuthConfArgs, RecordAuthConfPtr and RecordAuthConfPtrOutput values.
// You can construct a concrete instance of `RecordAuthConfPtrInput` via:
//
//	        RecordAuthConfArgs{...}
//
//	or:
//
//	        nil
type RecordAuthConfPtrInput interface {
	pulumi.Input

	ToRecordAuthConfPtrOutput() RecordAuthConfPtrOutput
	ToRecordAuthConfPtrOutputWithContext(context.Context) RecordAuthConfPtrOutput
}

type recordAuthConfPtrType RecordAuthConfArgs

func RecordAuthConfPtr(v *RecordAuthConfArgs) RecordAuthConfPtrInput {
	return (*recordAuthConfPtrType)(v)
}

func (*recordAuthConfPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**RecordAuthConf)(nil)).Elem()
}

func (i *recordAuthConfPtrType) ToRecordAuthConfPtrOutput() RecordAuthConfPtrOutput {
	return i.ToRecordAuthConfPtrOutputWithContext(context.Background())
}

func (i *recordAuthConfPtrType) ToRecordAuthConfPtrOutputWithContext(ctx context.Context) RecordAuthConfPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordAuthConfPtrOutput)
}

type RecordAuthConfOutput struct{ *pulumi.OutputState }

func (RecordAuthConfOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RecordAuthConf)(nil)).Elem()
}

func (o RecordAuthConfOutput) ToRecordAuthConfOutput() RecordAuthConfOutput {
	return o
}

func (o RecordAuthConfOutput) ToRecordAuthConfOutputWithContext(ctx context.Context) RecordAuthConfOutput {
	return o
}

func (o RecordAuthConfOutput) ToRecordAuthConfPtrOutput() RecordAuthConfPtrOutput {
	return o.ToRecordAuthConfPtrOutputWithContext(context.Background())
}

func (o RecordAuthConfOutput) ToRecordAuthConfPtrOutputWithContext(ctx context.Context) RecordAuthConfPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v RecordAuthConf) *RecordAuthConf {
		return &v
	}).(RecordAuthConfPtrOutput)
}

// The access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
func (o RecordAuthConfOutput) AccessKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RecordAuthConf) *string { return v.AccessKey }).(pulumi.StringPtrOutput)
}

// The authentication type of the origin server. Different origins support different authentication types. The type of origin refers to the SourceType parameter in this operation. If the type of origin is OSS or S3, you must specify the authentication type of the origin. Valid values:
func (o RecordAuthConfOutput) AuthType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RecordAuthConf) *string { return v.AuthType }).(pulumi.StringPtrOutput)
}

// The version of the signature algorithm. This parameter is required when the origin type is S3 and AuthType is private. The following two types are supported:
func (o RecordAuthConfOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RecordAuthConf) *string { return v.Region }).(pulumi.StringPtrOutput)
}

// The secret access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
func (o RecordAuthConfOutput) SecretKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RecordAuthConf) *string { return v.SecretKey }).(pulumi.StringPtrOutput)
}

// The region of the origin. If the origin type is S3, you must specify this value. You can get the region information from the official website of S3.
func (o RecordAuthConfOutput) Version() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RecordAuthConf) *string { return v.Version }).(pulumi.StringPtrOutput)
}

type RecordAuthConfPtrOutput struct{ *pulumi.OutputState }

func (RecordAuthConfPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RecordAuthConf)(nil)).Elem()
}

func (o RecordAuthConfPtrOutput) ToRecordAuthConfPtrOutput() RecordAuthConfPtrOutput {
	return o
}

func (o RecordAuthConfPtrOutput) ToRecordAuthConfPtrOutputWithContext(ctx context.Context) RecordAuthConfPtrOutput {
	return o
}

func (o RecordAuthConfPtrOutput) Elem() RecordAuthConfOutput {
	return o.ApplyT(func(v *RecordAuthConf) RecordAuthConf {
		if v != nil {
			return *v
		}
		var ret RecordAuthConf
		return ret
	}).(RecordAuthConfOutput)
}

// The access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
func (o RecordAuthConfPtrOutput) AccessKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RecordAuthConf) *string {
		if v == nil {
			return nil
		}
		return v.AccessKey
	}).(pulumi.StringPtrOutput)
}

// The authentication type of the origin server. Different origins support different authentication types. The type of origin refers to the SourceType parameter in this operation. If the type of origin is OSS or S3, you must specify the authentication type of the origin. Valid values:
func (o RecordAuthConfPtrOutput) AuthType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RecordAuthConf) *string {
		if v == nil {
			return nil
		}
		return v.AuthType
	}).(pulumi.StringPtrOutput)
}

// The version of the signature algorithm. This parameter is required when the origin type is S3 and AuthType is private. The following two types are supported:
func (o RecordAuthConfPtrOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RecordAuthConf) *string {
		if v == nil {
			return nil
		}
		return v.Region
	}).(pulumi.StringPtrOutput)
}

// The secret access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
func (o RecordAuthConfPtrOutput) SecretKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RecordAuthConf) *string {
		if v == nil {
			return nil
		}
		return v.SecretKey
	}).(pulumi.StringPtrOutput)
}

// The region of the origin. If the origin type is S3, you must specify this value. You can get the region information from the official website of S3.
func (o RecordAuthConfPtrOutput) Version() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RecordAuthConf) *string {
		if v == nil {
			return nil
		}
		return v.Version
	}).(pulumi.StringPtrOutput)
}

type RecordData struct {
	// The encryption algorithm used for the record, specified within the range from 0 to 255. This parameter is required when you add CERT or SSHFP records.
	Algorithm *int `pulumi:"algorithm"`
	// The public key of the certificate. This parameter is required when you add CERT, SMIMEA, or TLSA records.
	Certificate *string `pulumi:"certificate"`
	// The public key fingerprint of the record. This parameter is required when you add a SSHFP record.
	Fingerprint *string `pulumi:"fingerprint"`
	// The flag bit of the record. The Flag for a CAA record indicates its priority and how it is processed, specified within the range of 0 to 255. This parameter is required when you add a CAA record.
	Flag *int `pulumi:"flag"`
	// The public key identification for the record, specified within the range of 0 to 65,535. This parameter is required when you add a CAA record.
	KeyTag *int `pulumi:"keyTag"`
	// The algorithm policy used to match or validate the certificate, specified within the range 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
	MatchingType *int `pulumi:"matchingType"`
	// The port of the record, specified within the range of 0 to 65,535. This parameter is required when you add an SRV record.
	Port *int `pulumi:"port"`
	// The priority of the record, specified within the range of 0 to 65,535. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, and URI records.
	Priority *int `pulumi:"priority"`
	// The type of certificate or public key, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
	Selector *int `pulumi:"selector"`
	// The label of the record. The Tag of a CAA record indicate its specific type and usage. This parameter is required when you add a CAA record.
	Tag *string `pulumi:"tag"`
	// The certificate type of the record (in CERT records), or the public key type (in SSHFP records). This parameter is required when you add CERT or SSHFP records.
	Type *int `pulumi:"type"`
	// The usage identifier of the record, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
	Usage *int `pulumi:"usage"`
	// The record value or part of the record content. This parameter is required when you add A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. It has different meanings based on different types of records:
	//
	// - **A/AAAA**: the IP address(es). Separate multiple IPs with commas (,). You must have at least one IPv4 address.
	// - `CNAME`: the target domain name.
	// - `NS`: the name servers for the domain name.
	// - `MX`: a valid domain name of the target mail server.
	// - `TXT`: a valid text string.
	// - `CAA`: a valid domain name of the certificate authority.
	// - `SRV`: a valid domain name of the target host.
	// - `URI`: a valid URI string.
	Value *string `pulumi:"value"`
	// The weight of the record, specified within the range of 0 to 65,535. This parameter is required when you add SRV or URI records.
	Weight *int `pulumi:"weight"`
}

// RecordDataInput is an input type that accepts RecordDataArgs and RecordDataOutput values.
// You can construct a concrete instance of `RecordDataInput` via:
//
//	RecordDataArgs{...}
type RecordDataInput interface {
	pulumi.Input

	ToRecordDataOutput() RecordDataOutput
	ToRecordDataOutputWithContext(context.Context) RecordDataOutput
}

type RecordDataArgs struct {
	// The encryption algorithm used for the record, specified within the range from 0 to 255. This parameter is required when you add CERT or SSHFP records.
	Algorithm pulumi.IntPtrInput `pulumi:"algorithm"`
	// The public key of the certificate. This parameter is required when you add CERT, SMIMEA, or TLSA records.
	Certificate pulumi.StringPtrInput `pulumi:"certificate"`
	// The public key fingerprint of the record. This parameter is required when you add a SSHFP record.
	Fingerprint pulumi.StringPtrInput `pulumi:"fingerprint"`
	// The flag bit of the record. The Flag for a CAA record indicates its priority and how it is processed, specified within the range of 0 to 255. This parameter is required when you add a CAA record.
	Flag pulumi.IntPtrInput `pulumi:"flag"`
	// The public key identification for the record, specified within the range of 0 to 65,535. This parameter is required when you add a CAA record.
	KeyTag pulumi.IntPtrInput `pulumi:"keyTag"`
	// The algorithm policy used to match or validate the certificate, specified within the range 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
	MatchingType pulumi.IntPtrInput `pulumi:"matchingType"`
	// The port of the record, specified within the range of 0 to 65,535. This parameter is required when you add an SRV record.
	Port pulumi.IntPtrInput `pulumi:"port"`
	// The priority of the record, specified within the range of 0 to 65,535. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, and URI records.
	Priority pulumi.IntPtrInput `pulumi:"priority"`
	// The type of certificate or public key, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
	Selector pulumi.IntPtrInput `pulumi:"selector"`
	// The label of the record. The Tag of a CAA record indicate its specific type and usage. This parameter is required when you add a CAA record.
	Tag pulumi.StringPtrInput `pulumi:"tag"`
	// The certificate type of the record (in CERT records), or the public key type (in SSHFP records). This parameter is required when you add CERT or SSHFP records.
	Type pulumi.IntPtrInput `pulumi:"type"`
	// The usage identifier of the record, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
	Usage pulumi.IntPtrInput `pulumi:"usage"`
	// The record value or part of the record content. This parameter is required when you add A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. It has different meanings based on different types of records:
	//
	// - **A/AAAA**: the IP address(es). Separate multiple IPs with commas (,). You must have at least one IPv4 address.
	// - `CNAME`: the target domain name.
	// - `NS`: the name servers for the domain name.
	// - `MX`: a valid domain name of the target mail server.
	// - `TXT`: a valid text string.
	// - `CAA`: a valid domain name of the certificate authority.
	// - `SRV`: a valid domain name of the target host.
	// - `URI`: a valid URI string.
	Value pulumi.StringPtrInput `pulumi:"value"`
	// The weight of the record, specified within the range of 0 to 65,535. This parameter is required when you add SRV or URI records.
	Weight pulumi.IntPtrInput `pulumi:"weight"`
}

func (RecordDataArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*RecordData)(nil)).Elem()
}

func (i RecordDataArgs) ToRecordDataOutput() RecordDataOutput {
	return i.ToRecordDataOutputWithContext(context.Background())
}

func (i RecordDataArgs) ToRecordDataOutputWithContext(ctx context.Context) RecordDataOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordDataOutput)
}

func (i RecordDataArgs) ToRecordDataPtrOutput() RecordDataPtrOutput {
	return i.ToRecordDataPtrOutputWithContext(context.Background())
}

func (i RecordDataArgs) ToRecordDataPtrOutputWithContext(ctx context.Context) RecordDataPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordDataOutput).ToRecordDataPtrOutputWithContext(ctx)
}

// RecordDataPtrInput is an input type that accepts RecordDataArgs, RecordDataPtr and RecordDataPtrOutput values.
// You can construct a concrete instance of `RecordDataPtrInput` via:
//
//	        RecordDataArgs{...}
//
//	or:
//
//	        nil
type RecordDataPtrInput interface {
	pulumi.Input

	ToRecordDataPtrOutput() RecordDataPtrOutput
	ToRecordDataPtrOutputWithContext(context.Context) RecordDataPtrOutput
}

type recordDataPtrType RecordDataArgs

func RecordDataPtr(v *RecordDataArgs) RecordDataPtrInput {
	return (*recordDataPtrType)(v)
}

func (*recordDataPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**RecordData)(nil)).Elem()
}

func (i *recordDataPtrType) ToRecordDataPtrOutput() RecordDataPtrOutput {
	return i.ToRecordDataPtrOutputWithContext(context.Background())
}

func (i *recordDataPtrType) ToRecordDataPtrOutputWithContext(ctx context.Context) RecordDataPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordDataPtrOutput)
}

type RecordDataOutput struct{ *pulumi.OutputState }

func (RecordDataOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RecordData)(nil)).Elem()
}

func (o RecordDataOutput) ToRecordDataOutput() RecordDataOutput {
	return o
}

func (o RecordDataOutput) ToRecordDataOutputWithContext(ctx context.Context) RecordDataOutput {
	return o
}

func (o RecordDataOutput) ToRecordDataPtrOutput() RecordDataPtrOutput {
	return o.ToRecordDataPtrOutputWithContext(context.Background())
}

func (o RecordDataOutput) ToRecordDataPtrOutputWithContext(ctx context.Context) RecordDataPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v RecordData) *RecordData {
		return &v
	}).(RecordDataPtrOutput)
}

// The encryption algorithm used for the record, specified within the range from 0 to 255. This parameter is required when you add CERT or SSHFP records.
func (o RecordDataOutput) Algorithm() pulumi.IntPtrOutput {
	return o.ApplyT(func(v RecordData) *int { return v.Algorithm }).(pulumi.IntPtrOutput)
}

// The public key of the certificate. This parameter is required when you add CERT, SMIMEA, or TLSA records.
func (o RecordDataOutput) Certificate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RecordData) *string { return v.Certificate }).(pulumi.StringPtrOutput)
}

// The public key fingerprint of the record. This parameter is required when you add a SSHFP record.
func (o RecordDataOutput) Fingerprint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RecordData) *string { return v.Fingerprint }).(pulumi.StringPtrOutput)
}

// The flag bit of the record. The Flag for a CAA record indicates its priority and how it is processed, specified within the range of 0 to 255. This parameter is required when you add a CAA record.
func (o RecordDataOutput) Flag() pulumi.IntPtrOutput {
	return o.ApplyT(func(v RecordData) *int { return v.Flag }).(pulumi.IntPtrOutput)
}

// The public key identification for the record, specified within the range of 0 to 65,535. This parameter is required when you add a CAA record.
func (o RecordDataOutput) KeyTag() pulumi.IntPtrOutput {
	return o.ApplyT(func(v RecordData) *int { return v.KeyTag }).(pulumi.IntPtrOutput)
}

// The algorithm policy used to match or validate the certificate, specified within the range 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
func (o RecordDataOutput) MatchingType() pulumi.IntPtrOutput {
	return o.ApplyT(func(v RecordData) *int { return v.MatchingType }).(pulumi.IntPtrOutput)
}

// The port of the record, specified within the range of 0 to 65,535. This parameter is required when you add an SRV record.
func (o RecordDataOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v RecordData) *int { return v.Port }).(pulumi.IntPtrOutput)
}

// The priority of the record, specified within the range of 0 to 65,535. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, and URI records.
func (o RecordDataOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v RecordData) *int { return v.Priority }).(pulumi.IntPtrOutput)
}

// The type of certificate or public key, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
func (o RecordDataOutput) Selector() pulumi.IntPtrOutput {
	return o.ApplyT(func(v RecordData) *int { return v.Selector }).(pulumi.IntPtrOutput)
}

// The label of the record. The Tag of a CAA record indicate its specific type and usage. This parameter is required when you add a CAA record.
func (o RecordDataOutput) Tag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RecordData) *string { return v.Tag }).(pulumi.StringPtrOutput)
}

// The certificate type of the record (in CERT records), or the public key type (in SSHFP records). This parameter is required when you add CERT or SSHFP records.
func (o RecordDataOutput) Type() pulumi.IntPtrOutput {
	return o.ApplyT(func(v RecordData) *int { return v.Type }).(pulumi.IntPtrOutput)
}

// The usage identifier of the record, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
func (o RecordDataOutput) Usage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v RecordData) *int { return v.Usage }).(pulumi.IntPtrOutput)
}

// The record value or part of the record content. This parameter is required when you add A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. It has different meanings based on different types of records:
//
// - **A/AAAA**: the IP address(es). Separate multiple IPs with commas (,). You must have at least one IPv4 address.
// - `CNAME`: the target domain name.
// - `NS`: the name servers for the domain name.
// - `MX`: a valid domain name of the target mail server.
// - `TXT`: a valid text string.
// - `CAA`: a valid domain name of the certificate authority.
// - `SRV`: a valid domain name of the target host.
// - `URI`: a valid URI string.
func (o RecordDataOutput) Value() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RecordData) *string { return v.Value }).(pulumi.StringPtrOutput)
}

// The weight of the record, specified within the range of 0 to 65,535. This parameter is required when you add SRV or URI records.
func (o RecordDataOutput) Weight() pulumi.IntPtrOutput {
	return o.ApplyT(func(v RecordData) *int { return v.Weight }).(pulumi.IntPtrOutput)
}

type RecordDataPtrOutput struct{ *pulumi.OutputState }

func (RecordDataPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RecordData)(nil)).Elem()
}

func (o RecordDataPtrOutput) ToRecordDataPtrOutput() RecordDataPtrOutput {
	return o
}

func (o RecordDataPtrOutput) ToRecordDataPtrOutputWithContext(ctx context.Context) RecordDataPtrOutput {
	return o
}

func (o RecordDataPtrOutput) Elem() RecordDataOutput {
	return o.ApplyT(func(v *RecordData) RecordData {
		if v != nil {
			return *v
		}
		var ret RecordData
		return ret
	}).(RecordDataOutput)
}

// The encryption algorithm used for the record, specified within the range from 0 to 255. This parameter is required when you add CERT or SSHFP records.
func (o RecordDataPtrOutput) Algorithm() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RecordData) *int {
		if v == nil {
			return nil
		}
		return v.Algorithm
	}).(pulumi.IntPtrOutput)
}

// The public key of the certificate. This parameter is required when you add CERT, SMIMEA, or TLSA records.
func (o RecordDataPtrOutput) Certificate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RecordData) *string {
		if v == nil {
			return nil
		}
		return v.Certificate
	}).(pulumi.StringPtrOutput)
}

// The public key fingerprint of the record. This parameter is required when you add a SSHFP record.
func (o RecordDataPtrOutput) Fingerprint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RecordData) *string {
		if v == nil {
			return nil
		}
		return v.Fingerprint
	}).(pulumi.StringPtrOutput)
}

// The flag bit of the record. The Flag for a CAA record indicates its priority and how it is processed, specified within the range of 0 to 255. This parameter is required when you add a CAA record.
func (o RecordDataPtrOutput) Flag() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RecordData) *int {
		if v == nil {
			return nil
		}
		return v.Flag
	}).(pulumi.IntPtrOutput)
}

// The public key identification for the record, specified within the range of 0 to 65,535. This parameter is required when you add a CAA record.
func (o RecordDataPtrOutput) KeyTag() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RecordData) *int {
		if v == nil {
			return nil
		}
		return v.KeyTag
	}).(pulumi.IntPtrOutput)
}

// The algorithm policy used to match or validate the certificate, specified within the range 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
func (o RecordDataPtrOutput) MatchingType() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RecordData) *int {
		if v == nil {
			return nil
		}
		return v.MatchingType
	}).(pulumi.IntPtrOutput)
}

// The port of the record, specified within the range of 0 to 65,535. This parameter is required when you add an SRV record.
func (o RecordDataPtrOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RecordData) *int {
		if v == nil {
			return nil
		}
		return v.Port
	}).(pulumi.IntPtrOutput)
}

// The priority of the record, specified within the range of 0 to 65,535. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, and URI records.
func (o RecordDataPtrOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RecordData) *int {
		if v == nil {
			return nil
		}
		return v.Priority
	}).(pulumi.IntPtrOutput)
}

// The type of certificate or public key, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
func (o RecordDataPtrOutput) Selector() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RecordData) *int {
		if v == nil {
			return nil
		}
		return v.Selector
	}).(pulumi.IntPtrOutput)
}

// The label of the record. The Tag of a CAA record indicate its specific type and usage. This parameter is required when you add a CAA record.
func (o RecordDataPtrOutput) Tag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RecordData) *string {
		if v == nil {
			return nil
		}
		return v.Tag
	}).(pulumi.StringPtrOutput)
}

// The certificate type of the record (in CERT records), or the public key type (in SSHFP records). This parameter is required when you add CERT or SSHFP records.
func (o RecordDataPtrOutput) Type() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RecordData) *int {
		if v == nil {
			return nil
		}
		return v.Type
	}).(pulumi.IntPtrOutput)
}

// The usage identifier of the record, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
func (o RecordDataPtrOutput) Usage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RecordData) *int {
		if v == nil {
			return nil
		}
		return v.Usage
	}).(pulumi.IntPtrOutput)
}

// The record value or part of the record content. This parameter is required when you add A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. It has different meanings based on different types of records:
//
// - **A/AAAA**: the IP address(es). Separate multiple IPs with commas (,). You must have at least one IPv4 address.
// - `CNAME`: the target domain name.
// - `NS`: the name servers for the domain name.
// - `MX`: a valid domain name of the target mail server.
// - `TXT`: a valid text string.
// - `CAA`: a valid domain name of the certificate authority.
// - `SRV`: a valid domain name of the target host.
// - `URI`: a valid URI string.
func (o RecordDataPtrOutput) Value() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RecordData) *string {
		if v == nil {
			return nil
		}
		return v.Value
	}).(pulumi.StringPtrOutput)
}

// The weight of the record, specified within the range of 0 to 65,535. This parameter is required when you add SRV or URI records.
func (o RecordDataPtrOutput) Weight() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RecordData) *int {
		if v == nil {
			return nil
		}
		return v.Weight
	}).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HttpRequestHeaderModificationRuleRequestHeaderModificationInput)(nil)).Elem(), HttpRequestHeaderModificationRuleRequestHeaderModificationArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*HttpRequestHeaderModificationRuleRequestHeaderModificationArrayInput)(nil)).Elem(), HttpRequestHeaderModificationRuleRequestHeaderModificationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecordAuthConfInput)(nil)).Elem(), RecordAuthConfArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecordAuthConfPtrInput)(nil)).Elem(), RecordAuthConfArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecordDataInput)(nil)).Elem(), RecordDataArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecordDataPtrInput)(nil)).Elem(), RecordDataArgs{})
	pulumi.RegisterOutputType(HttpRequestHeaderModificationRuleRequestHeaderModificationOutput{})
	pulumi.RegisterOutputType(HttpRequestHeaderModificationRuleRequestHeaderModificationArrayOutput{})
	pulumi.RegisterOutputType(RecordAuthConfOutput{})
	pulumi.RegisterOutputType(RecordAuthConfPtrOutput{})
	pulumi.RegisterOutputType(RecordDataOutput{})
	pulumi.RegisterOutputType(RecordDataPtrOutput{})
}
