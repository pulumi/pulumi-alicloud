// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of Ram user permissions.
//
// > **NOTE:** Available in v1.122.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cs"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ram"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "your_user_name"
// 		usersDs, err := ram.GetUsers(ctx, &ram.GetUsersArgs{
// 			NameRegex: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_default, err := cs.LookupKubernetesPermission(ctx, &cs.LookupKubernetesPermissionArgs{
// 			Uid: usersDs.Users[0].Id,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("permissions", _default.Permissions)
// 		return nil
// 	})
// }
// ```
func LookupKubernetesPermission(ctx *pulumi.Context, args *LookupKubernetesPermissionArgs, opts ...pulumi.InvokeOption) (*LookupKubernetesPermissionResult, error) {
	var rv LookupKubernetesPermissionResult
	err := ctx.Invoke("alicloud:cs/getKubernetesPermission:getKubernetesPermission", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKubernetesPermission.
type LookupKubernetesPermissionArgs struct {
	// A list of user permission.
	Permissions []GetKubernetesPermissionPermission `pulumi:"permissions"`
	// The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
	Uid string `pulumi:"uid"`
}

// A collection of values returned by getKubernetesPermission.
type LookupKubernetesPermissionResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of user permission.
	Permissions []GetKubernetesPermissionPermission `pulumi:"permissions"`
	// The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
	Uid string `pulumi:"uid"`
}

func LookupKubernetesPermissionOutput(ctx *pulumi.Context, args LookupKubernetesPermissionOutputArgs, opts ...pulumi.InvokeOption) LookupKubernetesPermissionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupKubernetesPermissionResult, error) {
			args := v.(LookupKubernetesPermissionArgs)
			r, err := LookupKubernetesPermission(ctx, &args, opts...)
			return *r, err
		}).(LookupKubernetesPermissionResultOutput)
}

// A collection of arguments for invoking getKubernetesPermission.
type LookupKubernetesPermissionOutputArgs struct {
	// A list of user permission.
	Permissions GetKubernetesPermissionPermissionArrayInput `pulumi:"permissions"`
	// The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
	Uid pulumi.StringInput `pulumi:"uid"`
}

func (LookupKubernetesPermissionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKubernetesPermissionArgs)(nil)).Elem()
}

// A collection of values returned by getKubernetesPermission.
type LookupKubernetesPermissionResultOutput struct{ *pulumi.OutputState }

func (LookupKubernetesPermissionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKubernetesPermissionResult)(nil)).Elem()
}

func (o LookupKubernetesPermissionResultOutput) ToLookupKubernetesPermissionResultOutput() LookupKubernetesPermissionResultOutput {
	return o
}

func (o LookupKubernetesPermissionResultOutput) ToLookupKubernetesPermissionResultOutputWithContext(ctx context.Context) LookupKubernetesPermissionResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupKubernetesPermissionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKubernetesPermissionResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of user permission.
func (o LookupKubernetesPermissionResultOutput) Permissions() GetKubernetesPermissionPermissionArrayOutput {
	return o.ApplyT(func(v LookupKubernetesPermissionResult) []GetKubernetesPermissionPermission { return v.Permissions }).(GetKubernetesPermissionPermissionArrayOutput)
}

// The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
func (o LookupKubernetesPermissionResultOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKubernetesPermissionResult) string { return v.Uid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupKubernetesPermissionResultOutput{})
}