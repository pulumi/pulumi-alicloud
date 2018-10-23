import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a Alicloud Function Compute Service resource. The resource is the base of launching Function and Trigger configuration.
 *  For information about Service and how to use it, see [What is Function Compute](https://www.alibabacloud.com/help/doc-detail/52895.htm).
 *
 * -> **NOTE:** The resource requires a provider field 'account_id'. [See account_id](https://www.terraform.io/docs/providers/alicloud/index.html#account_id).
 *
 * -> **NOTE:** If you happen the error "Argument 'internetAccess' is not supported", you need to log on web console and click button "Apply VPC Function"
 * which is in the upper of [Function Service Web Console](https://fc.console.aliyun.com/) page.
 */
export declare class Service extends pulumi.CustomResource {
    /**
     * Get an existing Service resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceState): Service;
    /**
     * The function compute service description.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * Whether to allow the service to access Internet. Default to "true".
     */
    readonly internetAccess: pulumi.Output<boolean | undefined>;
    /**
     * The date this resource was last modified.
     */
    readonly lastModified: pulumi.Output<string>;
    /**
     * Provide this to store your FC service logs. Fields documented below. See [Create a Service](https://www.alibabacloud.com/help/doc-detail/51924.htm).
     */
    readonly logConfig: pulumi.Output<{
        logstore: string;
        project: string;
    } | undefined>;
    /**
     * The Function Compute service name. It is the only in one Alicloud account and is conflict with "name_prefix".
     */
    readonly name: pulumi.Output<string>;
    /**
     * Setting a prefix to get a only name. It is conflict with "name".
     */
    readonly namePrefix: pulumi.Output<string | undefined>;
    /**
     * RAM role arn attached to the Function Compute service. This governs both who / what can invoke your Function, as well as what resources our Function has access to. See [User Permissions](https://www.alibabacloud.com/help/doc-detail/52885.htm) for more details.
     */
    readonly role: pulumi.Output<string | undefined>;
    /**
     * Provide this to allow your FC service to access your VPC. Fields documented below. See [Function Compute Service in VPC](https://www.alibabacloud.com/help/faq-detail/72959.htm).
     */
    readonly vpcConfig: pulumi.Output<{
        securityGroupId: string;
        vpcId: string;
        vswitchIds: string[];
    } | undefined>;
    /**
     * Create a Service resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ServiceArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Service resources.
 */
export interface ServiceState {
    /**
     * The function compute service description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether to allow the service to access Internet. Default to "true".
     */
    readonly internetAccess?: pulumi.Input<boolean>;
    /**
     * The date this resource was last modified.
     */
    readonly lastModified?: pulumi.Input<string>;
    /**
     * Provide this to store your FC service logs. Fields documented below. See [Create a Service](https://www.alibabacloud.com/help/doc-detail/51924.htm).
     */
    readonly logConfig?: pulumi.Input<{
        logstore: pulumi.Input<string>;
        project: pulumi.Input<string>;
    }>;
    /**
     * The Function Compute service name. It is the only in one Alicloud account and is conflict with "name_prefix".
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Setting a prefix to get a only name. It is conflict with "name".
     */
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * RAM role arn attached to the Function Compute service. This governs both who / what can invoke your Function, as well as what resources our Function has access to. See [User Permissions](https://www.alibabacloud.com/help/doc-detail/52885.htm) for more details.
     */
    readonly role?: pulumi.Input<string>;
    /**
     * Provide this to allow your FC service to access your VPC. Fields documented below. See [Function Compute Service in VPC](https://www.alibabacloud.com/help/faq-detail/72959.htm).
     */
    readonly vpcConfig?: pulumi.Input<{
        securityGroupId: pulumi.Input<string>;
        vpcId?: pulumi.Input<string>;
        vswitchIds: pulumi.Input<pulumi.Input<string>[]>;
    }>;
}
/**
 * The set of arguments for constructing a Service resource.
 */
export interface ServiceArgs {
    /**
     * The function compute service description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether to allow the service to access Internet. Default to "true".
     */
    readonly internetAccess?: pulumi.Input<boolean>;
    /**
     * Provide this to store your FC service logs. Fields documented below. See [Create a Service](https://www.alibabacloud.com/help/doc-detail/51924.htm).
     */
    readonly logConfig?: pulumi.Input<{
        logstore: pulumi.Input<string>;
        project: pulumi.Input<string>;
    }>;
    /**
     * The Function Compute service name. It is the only in one Alicloud account and is conflict with "name_prefix".
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Setting a prefix to get a only name. It is conflict with "name".
     */
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * RAM role arn attached to the Function Compute service. This governs both who / what can invoke your Function, as well as what resources our Function has access to. See [User Permissions](https://www.alibabacloud.com/help/doc-detail/52885.htm) for more details.
     */
    readonly role?: pulumi.Input<string>;
    /**
     * Provide this to allow your FC service to access your VPC. Fields documented below. See [Function Compute Service in VPC](https://www.alibabacloud.com/help/faq-detail/72959.htm).
     */
    readonly vpcConfig?: pulumi.Input<{
        securityGroupId: pulumi.Input<string>;
        vpcId?: pulumi.Input<string>;
        vswitchIds: pulumi.Input<pulumi.Input<string>[]>;
    }>;
}
