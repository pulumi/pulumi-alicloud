import * as pulumi from "@pulumi/pulumi";
/**
 * The project is the resource management unit in Log Service and is used to isolate and control resources.
 * You can manage all the logs and the related log sources of an application by using projects. [Refer to details](https://www.alibabacloud.com/help/doc-detail/48873.htm).
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
     * Description of the log project. At present, it is not modified by terraform.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The name of the log project. It is the only in one Alicloud account.
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
     * Description of the log project. At present, it is not modified by terraform.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the log project. It is the only in one Alicloud account.
     */
    readonly name?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Project resource.
 */
export interface ProjectArgs {
    /**
     * Description of the log project. At present, it is not modified by terraform.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the log project. It is the only in one Alicloud account.
     */
    readonly name?: pulumi.Input<string>;
}
