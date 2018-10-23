import * as pulumi from "@pulumi/pulumi";
/**
 * ~> **NOTE:** This resource has been deprecated from [v1.3.2](https://github.com/alibaba/terraform-provider/releases/tag/V1.3.2). New resource `alicloud_ram_account_alias` will replace.
 */
export declare class Alias extends pulumi.CustomResource {
    /**
     * Get an existing Alias resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AliasState): Alias;
    readonly accountAlias: pulumi.Output<string>;
    /**
     * Create a Alias resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AliasArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Alias resources.
 */
export interface AliasState {
    readonly accountAlias?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Alias resource.
 */
export interface AliasArgs {
    readonly accountAlias: pulumi.Input<string>;
}
