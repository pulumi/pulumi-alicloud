import * as pulumi from "@pulumi/pulumi";
/**
 * The project is the basic unit of resource management in Datahub Service and is used to isolate and control resources. It contains a set of Topics. You can manage the datahub sources of an application by using projects. [Refer to details](https://help.aliyun.com/document_detail/47440.html).
 */
export declare class Project extends pulumi.CustomResource {
    /**
     * Get an existing Project resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectState): Project;
    /**
     * Comment of the datahub project. It cannot be longer than 255 characters.
     */
    readonly comment: pulumi.Output<string | undefined>;
    /**
     * Create time of the datahub project. It is a human-readable string rather than 64-bits UTC.
     */
    readonly createTime: pulumi.Output<string>;
    /**
     * Last modify time of the datahub project. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
     */
    readonly lastModifyTime: pulumi.Output<string>;
    /**
     * The name of the datahub project. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Create a Project resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProjectArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Project resources.
 */
export interface ProjectState {
    /**
     * Comment of the datahub project. It cannot be longer than 255 characters.
     */
    readonly comment?: pulumi.Input<string>;
    /**
     * Create time of the datahub project. It is a human-readable string rather than 64-bits UTC.
     */
    readonly createTime?: pulumi.Input<string>;
    /**
     * Last modify time of the datahub project. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
     */
    readonly lastModifyTime?: pulumi.Input<string>;
    /**
     * The name of the datahub project. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    readonly name?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Project resource.
 */
export interface ProjectArgs {
    /**
     * Comment of the datahub project. It cannot be longer than 255 characters.
     */
    readonly comment?: pulumi.Input<string>;
    /**
     * The name of the datahub project. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    readonly name?: pulumi.Input<string>;
}
