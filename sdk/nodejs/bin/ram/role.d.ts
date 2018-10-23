import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a RAM Role resource.
 *
 * ~> **NOTE:** When you want to destroy this resource forcefully(means remove all the relationships associated with it automatically and then destroy it) without set `force`  with `true` at beginning, you need add `force = true` to configuration file and run `terraform plan`, then you can delete resource forcefully.
 */
export declare class Role extends pulumi.CustomResource {
    /**
     * Get an existing Role resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoleState): Role;
    /**
     * The role arn.
     */
    readonly arn: pulumi.Output<string>;
    /**
     * Description of the RAM role. This name can have a string of 1 to 1024 characters.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * Authorization strategy of the RAM role. It is required when the `services` and `ram_users` are not specified.
     */
    readonly document: pulumi.Output<string>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    readonly force: pulumi.Output<boolean | undefined>;
    /**
     * Name of the RAM role. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
     */
    readonly name: pulumi.Output<string>;
    /**
     * List of ram users who can assume the RAM role. The format of each item in this list is `acs:ram::${account_id}:root` or `acs:ram::${account_id}:user/${user_name}`, such as `acs:ram::1234567890000:root` and `acs:ram::1234567890001:user/Mary`. The `${user_name}` is the name of a RAM user which must exists in the Alicloud account indicated by the `${account_id}`.
     */
    readonly ramUsers: pulumi.Output<string[]>;
    /**
     * List of services which can assume the RAM role. The format of each item in this list is `${service}.aliyuncs.com` or `${account_id}@${service}.aliyuncs.com`, such as `ecs.aliyuncs.com` and `1234567890000@ots.aliyuncs.com`. The `${service}` can be `ecs`, `log`, `apigateway` and so on, the `${account_id}` refers to someone's Alicloud account id.
     */
    readonly services: pulumi.Output<string[]>;
    /**
     * Version of the RAM role policy document. Valid value is `1`. Default value is `1`.
     */
    readonly version: pulumi.Output<string | undefined>;
    /**
     * Create a Role resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RoleArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Role resources.
 */
export interface RoleState {
    /**
     * The role arn.
     */
    readonly arn?: pulumi.Input<string>;
    /**
     * Description of the RAM role. This name can have a string of 1 to 1024 characters.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Authorization strategy of the RAM role. It is required when the `services` and `ram_users` are not specified.
     */
    readonly document?: pulumi.Input<string>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * Name of the RAM role. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * List of ram users who can assume the RAM role. The format of each item in this list is `acs:ram::${account_id}:root` or `acs:ram::${account_id}:user/${user_name}`, such as `acs:ram::1234567890000:root` and `acs:ram::1234567890001:user/Mary`. The `${user_name}` is the name of a RAM user which must exists in the Alicloud account indicated by the `${account_id}`.
     */
    readonly ramUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of services which can assume the RAM role. The format of each item in this list is `${service}.aliyuncs.com` or `${account_id}@${service}.aliyuncs.com`, such as `ecs.aliyuncs.com` and `1234567890000@ots.aliyuncs.com`. The `${service}` can be `ecs`, `log`, `apigateway` and so on, the `${account_id}` refers to someone's Alicloud account id.
     */
    readonly services?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Version of the RAM role policy document. Valid value is `1`. Default value is `1`.
     */
    readonly version?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Role resource.
 */
export interface RoleArgs {
    /**
     * Description of the RAM role. This name can have a string of 1 to 1024 characters.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Authorization strategy of the RAM role. It is required when the `services` and `ram_users` are not specified.
     */
    readonly document?: pulumi.Input<string>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * Name of the RAM role. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * List of ram users who can assume the RAM role. The format of each item in this list is `acs:ram::${account_id}:root` or `acs:ram::${account_id}:user/${user_name}`, such as `acs:ram::1234567890000:root` and `acs:ram::1234567890001:user/Mary`. The `${user_name}` is the name of a RAM user which must exists in the Alicloud account indicated by the `${account_id}`.
     */
    readonly ramUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of services which can assume the RAM role. The format of each item in this list is `${service}.aliyuncs.com` or `${account_id}@${service}.aliyuncs.com`, such as `ecs.aliyuncs.com` and `1234567890000@ots.aliyuncs.com`. The `${service}` can be `ecs`, `log`, `apigateway` and so on, the `${account_id}` refers to someone's Alicloud account id.
     */
    readonly services?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Version of the RAM role policy document. Valid value is `1`. Default value is `1`.
     */
    readonly version?: pulumi.Input<string>;
}
