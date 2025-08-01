// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a KMS Secret resource.
//
// For information about KMS Secret and how to use it, see [What is Secret](https://www.alibabacloud.com/help/en/kms/developer-reference/api-createsecret).
//
// > **NOTE:** Available since v1.76.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/kms"
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
//			_, err := kms.NewSecret(ctx, "default", &kms.SecretArgs{
//				SecretName:                 pulumi.String(name),
//				SecretData:                 pulumi.String("Secret data"),
//				VersionId:                  pulumi.String("v1"),
//				ForceDeleteWithoutRecovery: pulumi.Bool(true),
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
// KMS Secret can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:kms/secret:Secret example <id>
// ```
type Secret struct {
	pulumi.CustomResourceState

	// The ARN of the secret.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// (Available since v1.224.0) The time when the secret is created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The description of the secret.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the KMS instance.
	DkmsInstanceId pulumi.StringPtrOutput `pulumi:"dkmsInstanceId"`
	// Specifies whether to enable automatic rotation. Default value: `false`. Valid values: `true`, `false`.
	EnableAutomaticRotation pulumi.BoolPtrOutput `pulumi:"enableAutomaticRotation"`
	// The ID of the KMS key.
	EncryptionKeyId pulumi.StringPtrOutput `pulumi:"encryptionKeyId"`
	// The extended configuration of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	ExtendedConfig pulumi.StringPtrOutput `pulumi:"extendedConfig"`
	// Specifies whether to immediately delete a secret. Default value: `false`. Valid values: `true`, `false`.
	ForceDeleteWithoutRecovery pulumi.BoolPtrOutput `pulumi:"forceDeleteWithoutRecovery"`
	// The time when the secret is scheduled to be deleted.
	PlannedDeleteTime pulumi.StringOutput `pulumi:"plannedDeleteTime"`
	// The content of the secret policy. The value is in the JSON format. The value can be up to 32,768 bytes in length. For more information, see [How to use it](https://www.alibabacloud.com/help/en/kms/developer-reference/api-setsecretpolicy).
	Policy pulumi.StringOutput `pulumi:"policy"`
	// Specifies the recovery period of the secret if you do not forcibly delete it. Unit: Days. Default value: `30`. Valid values: `7` to `30`. **NOTE:**  If `forceDeleteWithoutRecovery` is set to `true`, `recoveryWindowInDays` will be ignored.
	RecoveryWindowInDays pulumi.IntPtrOutput `pulumi:"recoveryWindowInDays"`
	// The interval for automatic rotation. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	RotationInterval pulumi.StringPtrOutput `pulumi:"rotationInterval"`
	// The data of the secret. **NOTE:** From version 1.204.1, `secretData` updating diff will be ignored when `secretType` is not `Generic`.
	SecretData pulumi.StringOutput `pulumi:"secretData"`
	// The type of the secret value. Default value: `text`. Valid values: `text`, `binary`.
	SecretDataType pulumi.StringPtrOutput `pulumi:"secretDataType"`
	// The name of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	SecretName pulumi.StringOutput `pulumi:"secretName"`
	// The type of the secret. Valid values:
	// - `Generic`: Generic secret.
	// - `Rds`: ApsaraDB RDS secret.
	// - `Redis`: (Available since v1.253.0) ApsaraDB for Redis secret.
	// - `RAMCredentials`: RAM secret.
	// - `ECS`: ECS secret.
	// - `PolarDB`: (Available since v1.253.0) PolarDB secret.
	SecretType pulumi.StringOutput `pulumi:"secretType"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The version number of the initial version.
	VersionId pulumi.StringOutput `pulumi:"versionId"`
	// The stage label that is used to mark the new version.
	VersionStages pulumi.StringArrayOutput `pulumi:"versionStages"`
}

// NewSecret registers a new resource with the given unique name, arguments, and options.
func NewSecret(ctx *pulumi.Context,
	name string, args *SecretArgs, opts ...pulumi.ResourceOption) (*Secret, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SecretData == nil {
		return nil, errors.New("invalid value for required argument 'SecretData'")
	}
	if args.SecretName == nil {
		return nil, errors.New("invalid value for required argument 'SecretName'")
	}
	if args.VersionId == nil {
		return nil, errors.New("invalid value for required argument 'VersionId'")
	}
	if args.SecretData != nil {
		args.SecretData = pulumi.ToSecret(args.SecretData).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secretData",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Secret
	err := ctx.RegisterResource("alicloud:kms/secret:Secret", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecret gets an existing Secret resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecret(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretState, opts ...pulumi.ResourceOption) (*Secret, error) {
	var resource Secret
	err := ctx.ReadResource("alicloud:kms/secret:Secret", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Secret resources.
type secretState struct {
	// The ARN of the secret.
	Arn *string `pulumi:"arn"`
	// (Available since v1.224.0) The time when the secret is created.
	CreateTime *string `pulumi:"createTime"`
	// The description of the secret.
	Description *string `pulumi:"description"`
	// The ID of the KMS instance.
	DkmsInstanceId *string `pulumi:"dkmsInstanceId"`
	// Specifies whether to enable automatic rotation. Default value: `false`. Valid values: `true`, `false`.
	EnableAutomaticRotation *bool `pulumi:"enableAutomaticRotation"`
	// The ID of the KMS key.
	EncryptionKeyId *string `pulumi:"encryptionKeyId"`
	// The extended configuration of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	ExtendedConfig *string `pulumi:"extendedConfig"`
	// Specifies whether to immediately delete a secret. Default value: `false`. Valid values: `true`, `false`.
	ForceDeleteWithoutRecovery *bool `pulumi:"forceDeleteWithoutRecovery"`
	// The time when the secret is scheduled to be deleted.
	PlannedDeleteTime *string `pulumi:"plannedDeleteTime"`
	// The content of the secret policy. The value is in the JSON format. The value can be up to 32,768 bytes in length. For more information, see [How to use it](https://www.alibabacloud.com/help/en/kms/developer-reference/api-setsecretpolicy).
	Policy *string `pulumi:"policy"`
	// Specifies the recovery period of the secret if you do not forcibly delete it. Unit: Days. Default value: `30`. Valid values: `7` to `30`. **NOTE:**  If `forceDeleteWithoutRecovery` is set to `true`, `recoveryWindowInDays` will be ignored.
	RecoveryWindowInDays *int `pulumi:"recoveryWindowInDays"`
	// The interval for automatic rotation. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	RotationInterval *string `pulumi:"rotationInterval"`
	// The data of the secret. **NOTE:** From version 1.204.1, `secretData` updating diff will be ignored when `secretType` is not `Generic`.
	SecretData *string `pulumi:"secretData"`
	// The type of the secret value. Default value: `text`. Valid values: `text`, `binary`.
	SecretDataType *string `pulumi:"secretDataType"`
	// The name of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	SecretName *string `pulumi:"secretName"`
	// The type of the secret. Valid values:
	// - `Generic`: Generic secret.
	// - `Rds`: ApsaraDB RDS secret.
	// - `Redis`: (Available since v1.253.0) ApsaraDB for Redis secret.
	// - `RAMCredentials`: RAM secret.
	// - `ECS`: ECS secret.
	// - `PolarDB`: (Available since v1.253.0) PolarDB secret.
	SecretType *string `pulumi:"secretType"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The version number of the initial version.
	VersionId *string `pulumi:"versionId"`
	// The stage label that is used to mark the new version.
	VersionStages []string `pulumi:"versionStages"`
}

type SecretState struct {
	// The ARN of the secret.
	Arn pulumi.StringPtrInput
	// (Available since v1.224.0) The time when the secret is created.
	CreateTime pulumi.StringPtrInput
	// The description of the secret.
	Description pulumi.StringPtrInput
	// The ID of the KMS instance.
	DkmsInstanceId pulumi.StringPtrInput
	// Specifies whether to enable automatic rotation. Default value: `false`. Valid values: `true`, `false`.
	EnableAutomaticRotation pulumi.BoolPtrInput
	// The ID of the KMS key.
	EncryptionKeyId pulumi.StringPtrInput
	// The extended configuration of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	ExtendedConfig pulumi.StringPtrInput
	// Specifies whether to immediately delete a secret. Default value: `false`. Valid values: `true`, `false`.
	ForceDeleteWithoutRecovery pulumi.BoolPtrInput
	// The time when the secret is scheduled to be deleted.
	PlannedDeleteTime pulumi.StringPtrInput
	// The content of the secret policy. The value is in the JSON format. The value can be up to 32,768 bytes in length. For more information, see [How to use it](https://www.alibabacloud.com/help/en/kms/developer-reference/api-setsecretpolicy).
	Policy pulumi.StringPtrInput
	// Specifies the recovery period of the secret if you do not forcibly delete it. Unit: Days. Default value: `30`. Valid values: `7` to `30`. **NOTE:**  If `forceDeleteWithoutRecovery` is set to `true`, `recoveryWindowInDays` will be ignored.
	RecoveryWindowInDays pulumi.IntPtrInput
	// The interval for automatic rotation. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	RotationInterval pulumi.StringPtrInput
	// The data of the secret. **NOTE:** From version 1.204.1, `secretData` updating diff will be ignored when `secretType` is not `Generic`.
	SecretData pulumi.StringPtrInput
	// The type of the secret value. Default value: `text`. Valid values: `text`, `binary`.
	SecretDataType pulumi.StringPtrInput
	// The name of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	SecretName pulumi.StringPtrInput
	// The type of the secret. Valid values:
	// - `Generic`: Generic secret.
	// - `Rds`: ApsaraDB RDS secret.
	// - `Redis`: (Available since v1.253.0) ApsaraDB for Redis secret.
	// - `RAMCredentials`: RAM secret.
	// - `ECS`: ECS secret.
	// - `PolarDB`: (Available since v1.253.0) PolarDB secret.
	SecretType pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// The version number of the initial version.
	VersionId pulumi.StringPtrInput
	// The stage label that is used to mark the new version.
	VersionStages pulumi.StringArrayInput
}

func (SecretState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretState)(nil)).Elem()
}

type secretArgs struct {
	// The description of the secret.
	Description *string `pulumi:"description"`
	// The ID of the KMS instance.
	DkmsInstanceId *string `pulumi:"dkmsInstanceId"`
	// Specifies whether to enable automatic rotation. Default value: `false`. Valid values: `true`, `false`.
	EnableAutomaticRotation *bool `pulumi:"enableAutomaticRotation"`
	// The ID of the KMS key.
	EncryptionKeyId *string `pulumi:"encryptionKeyId"`
	// The extended configuration of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	ExtendedConfig *string `pulumi:"extendedConfig"`
	// Specifies whether to immediately delete a secret. Default value: `false`. Valid values: `true`, `false`.
	ForceDeleteWithoutRecovery *bool `pulumi:"forceDeleteWithoutRecovery"`
	// The content of the secret policy. The value is in the JSON format. The value can be up to 32,768 bytes in length. For more information, see [How to use it](https://www.alibabacloud.com/help/en/kms/developer-reference/api-setsecretpolicy).
	Policy *string `pulumi:"policy"`
	// Specifies the recovery period of the secret if you do not forcibly delete it. Unit: Days. Default value: `30`. Valid values: `7` to `30`. **NOTE:**  If `forceDeleteWithoutRecovery` is set to `true`, `recoveryWindowInDays` will be ignored.
	RecoveryWindowInDays *int `pulumi:"recoveryWindowInDays"`
	// The interval for automatic rotation. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	RotationInterval *string `pulumi:"rotationInterval"`
	// The data of the secret. **NOTE:** From version 1.204.1, `secretData` updating diff will be ignored when `secretType` is not `Generic`.
	SecretData string `pulumi:"secretData"`
	// The type of the secret value. Default value: `text`. Valid values: `text`, `binary`.
	SecretDataType *string `pulumi:"secretDataType"`
	// The name of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	SecretName string `pulumi:"secretName"`
	// The type of the secret. Valid values:
	// - `Generic`: Generic secret.
	// - `Rds`: ApsaraDB RDS secret.
	// - `Redis`: (Available since v1.253.0) ApsaraDB for Redis secret.
	// - `RAMCredentials`: RAM secret.
	// - `ECS`: ECS secret.
	// - `PolarDB`: (Available since v1.253.0) PolarDB secret.
	SecretType *string `pulumi:"secretType"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The version number of the initial version.
	VersionId string `pulumi:"versionId"`
	// The stage label that is used to mark the new version.
	VersionStages []string `pulumi:"versionStages"`
}

// The set of arguments for constructing a Secret resource.
type SecretArgs struct {
	// The description of the secret.
	Description pulumi.StringPtrInput
	// The ID of the KMS instance.
	DkmsInstanceId pulumi.StringPtrInput
	// Specifies whether to enable automatic rotation. Default value: `false`. Valid values: `true`, `false`.
	EnableAutomaticRotation pulumi.BoolPtrInput
	// The ID of the KMS key.
	EncryptionKeyId pulumi.StringPtrInput
	// The extended configuration of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	ExtendedConfig pulumi.StringPtrInput
	// Specifies whether to immediately delete a secret. Default value: `false`. Valid values: `true`, `false`.
	ForceDeleteWithoutRecovery pulumi.BoolPtrInput
	// The content of the secret policy. The value is in the JSON format. The value can be up to 32,768 bytes in length. For more information, see [How to use it](https://www.alibabacloud.com/help/en/kms/developer-reference/api-setsecretpolicy).
	Policy pulumi.StringPtrInput
	// Specifies the recovery period of the secret if you do not forcibly delete it. Unit: Days. Default value: `30`. Valid values: `7` to `30`. **NOTE:**  If `forceDeleteWithoutRecovery` is set to `true`, `recoveryWindowInDays` will be ignored.
	RecoveryWindowInDays pulumi.IntPtrInput
	// The interval for automatic rotation. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	RotationInterval pulumi.StringPtrInput
	// The data of the secret. **NOTE:** From version 1.204.1, `secretData` updating diff will be ignored when `secretType` is not `Generic`.
	SecretData pulumi.StringInput
	// The type of the secret value. Default value: `text`. Valid values: `text`, `binary`.
	SecretDataType pulumi.StringPtrInput
	// The name of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
	SecretName pulumi.StringInput
	// The type of the secret. Valid values:
	// - `Generic`: Generic secret.
	// - `Rds`: ApsaraDB RDS secret.
	// - `Redis`: (Available since v1.253.0) ApsaraDB for Redis secret.
	// - `RAMCredentials`: RAM secret.
	// - `ECS`: ECS secret.
	// - `PolarDB`: (Available since v1.253.0) PolarDB secret.
	SecretType pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// The version number of the initial version.
	VersionId pulumi.StringInput
	// The stage label that is used to mark the new version.
	VersionStages pulumi.StringArrayInput
}

func (SecretArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretArgs)(nil)).Elem()
}

type SecretInput interface {
	pulumi.Input

	ToSecretOutput() SecretOutput
	ToSecretOutputWithContext(ctx context.Context) SecretOutput
}

func (*Secret) ElementType() reflect.Type {
	return reflect.TypeOf((**Secret)(nil)).Elem()
}

func (i *Secret) ToSecretOutput() SecretOutput {
	return i.ToSecretOutputWithContext(context.Background())
}

func (i *Secret) ToSecretOutputWithContext(ctx context.Context) SecretOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretOutput)
}

// SecretArrayInput is an input type that accepts SecretArray and SecretArrayOutput values.
// You can construct a concrete instance of `SecretArrayInput` via:
//
//	SecretArray{ SecretArgs{...} }
type SecretArrayInput interface {
	pulumi.Input

	ToSecretArrayOutput() SecretArrayOutput
	ToSecretArrayOutputWithContext(context.Context) SecretArrayOutput
}

type SecretArray []SecretInput

func (SecretArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Secret)(nil)).Elem()
}

func (i SecretArray) ToSecretArrayOutput() SecretArrayOutput {
	return i.ToSecretArrayOutputWithContext(context.Background())
}

func (i SecretArray) ToSecretArrayOutputWithContext(ctx context.Context) SecretArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretArrayOutput)
}

// SecretMapInput is an input type that accepts SecretMap and SecretMapOutput values.
// You can construct a concrete instance of `SecretMapInput` via:
//
//	SecretMap{ "key": SecretArgs{...} }
type SecretMapInput interface {
	pulumi.Input

	ToSecretMapOutput() SecretMapOutput
	ToSecretMapOutputWithContext(context.Context) SecretMapOutput
}

type SecretMap map[string]SecretInput

func (SecretMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Secret)(nil)).Elem()
}

func (i SecretMap) ToSecretMapOutput() SecretMapOutput {
	return i.ToSecretMapOutputWithContext(context.Background())
}

func (i SecretMap) ToSecretMapOutputWithContext(ctx context.Context) SecretMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretMapOutput)
}

type SecretOutput struct{ *pulumi.OutputState }

func (SecretOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Secret)(nil)).Elem()
}

func (o SecretOutput) ToSecretOutput() SecretOutput {
	return o
}

func (o SecretOutput) ToSecretOutputWithContext(ctx context.Context) SecretOutput {
	return o
}

// The ARN of the secret.
func (o SecretOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// (Available since v1.224.0) The time when the secret is created.
func (o SecretOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The description of the secret.
func (o SecretOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ID of the KMS instance.
func (o SecretOutput) DkmsInstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringPtrOutput { return v.DkmsInstanceId }).(pulumi.StringPtrOutput)
}

// Specifies whether to enable automatic rotation. Default value: `false`. Valid values: `true`, `false`.
func (o SecretOutput) EnableAutomaticRotation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Secret) pulumi.BoolPtrOutput { return v.EnableAutomaticRotation }).(pulumi.BoolPtrOutput)
}

// The ID of the KMS key.
func (o SecretOutput) EncryptionKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringPtrOutput { return v.EncryptionKeyId }).(pulumi.StringPtrOutput)
}

// The extended configuration of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
func (o SecretOutput) ExtendedConfig() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringPtrOutput { return v.ExtendedConfig }).(pulumi.StringPtrOutput)
}

// Specifies whether to immediately delete a secret. Default value: `false`. Valid values: `true`, `false`.
func (o SecretOutput) ForceDeleteWithoutRecovery() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Secret) pulumi.BoolPtrOutput { return v.ForceDeleteWithoutRecovery }).(pulumi.BoolPtrOutput)
}

// The time when the secret is scheduled to be deleted.
func (o SecretOutput) PlannedDeleteTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringOutput { return v.PlannedDeleteTime }).(pulumi.StringOutput)
}

// The content of the secret policy. The value is in the JSON format. The value can be up to 32,768 bytes in length. For more information, see [How to use it](https://www.alibabacloud.com/help/en/kms/developer-reference/api-setsecretpolicy).
func (o SecretOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

// Specifies the recovery period of the secret if you do not forcibly delete it. Unit: Days. Default value: `30`. Valid values: `7` to `30`. **NOTE:**  If `forceDeleteWithoutRecovery` is set to `true`, `recoveryWindowInDays` will be ignored.
func (o SecretOutput) RecoveryWindowInDays() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Secret) pulumi.IntPtrOutput { return v.RecoveryWindowInDays }).(pulumi.IntPtrOutput)
}

// The interval for automatic rotation. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
func (o SecretOutput) RotationInterval() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringPtrOutput { return v.RotationInterval }).(pulumi.StringPtrOutput)
}

// The data of the secret. **NOTE:** From version 1.204.1, `secretData` updating diff will be ignored when `secretType` is not `Generic`.
func (o SecretOutput) SecretData() pulumi.StringOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringOutput { return v.SecretData }).(pulumi.StringOutput)
}

// The type of the secret value. Default value: `text`. Valid values: `text`, `binary`.
func (o SecretOutput) SecretDataType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringPtrOutput { return v.SecretDataType }).(pulumi.StringPtrOutput)
}

// The name of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
func (o SecretOutput) SecretName() pulumi.StringOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringOutput { return v.SecretName }).(pulumi.StringOutput)
}

// The type of the secret. Valid values:
// - `Generic`: Generic secret.
// - `Rds`: ApsaraDB RDS secret.
// - `Redis`: (Available since v1.253.0) ApsaraDB for Redis secret.
// - `RAMCredentials`: RAM secret.
// - `ECS`: ECS secret.
// - `PolarDB`: (Available since v1.253.0) PolarDB secret.
func (o SecretOutput) SecretType() pulumi.StringOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringOutput { return v.SecretType }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o SecretOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The version number of the initial version.
func (o SecretOutput) VersionId() pulumi.StringOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringOutput { return v.VersionId }).(pulumi.StringOutput)
}

// The stage label that is used to mark the new version.
func (o SecretOutput) VersionStages() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Secret) pulumi.StringArrayOutput { return v.VersionStages }).(pulumi.StringArrayOutput)
}

type SecretArrayOutput struct{ *pulumi.OutputState }

func (SecretArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Secret)(nil)).Elem()
}

func (o SecretArrayOutput) ToSecretArrayOutput() SecretArrayOutput {
	return o
}

func (o SecretArrayOutput) ToSecretArrayOutputWithContext(ctx context.Context) SecretArrayOutput {
	return o
}

func (o SecretArrayOutput) Index(i pulumi.IntInput) SecretOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Secret {
		return vs[0].([]*Secret)[vs[1].(int)]
	}).(SecretOutput)
}

type SecretMapOutput struct{ *pulumi.OutputState }

func (SecretMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Secret)(nil)).Elem()
}

func (o SecretMapOutput) ToSecretMapOutput() SecretMapOutput {
	return o
}

func (o SecretMapOutput) ToSecretMapOutputWithContext(ctx context.Context) SecretMapOutput {
	return o
}

func (o SecretMapOutput) MapIndex(k pulumi.StringInput) SecretOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Secret {
		return vs[0].(map[string]*Secret)[vs[1].(string)]
	}).(SecretOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecretInput)(nil)).Elem(), &Secret{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretArrayInput)(nil)).Elem(), SecretArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretMapInput)(nil)).Elem(), SecretMap{})
	pulumi.RegisterOutputType(SecretOutput{})
	pulumi.RegisterOutputType(SecretArrayOutput{})
	pulumi.RegisterOutputType(SecretMapOutput{})
}
