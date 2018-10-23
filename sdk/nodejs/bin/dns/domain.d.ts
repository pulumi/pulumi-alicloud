import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a DNS resource.
 *
 * ~> **NOTE:** The domain name which you want to add must be already registered and had not added by another account. Every domain name can only exist in a unique group.
 */
export declare class Domain extends pulumi.CustomResource {
    /**
     * Get an existing Domain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainState): Domain;
    /**
     * A list of the dns server name.
     */
    readonly dnsServers: pulumi.Output<string[]>;
    /**
     * Id of the group in which the domain will add. If not supplied, then use default group.
     */
    readonly groupId: pulumi.Output<string | undefined>;
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Create a Domain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DomainArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Domain resources.
 */
export interface DomainState {
    /**
     * A list of the dns server name.
     */
    readonly dnsServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Id of the group in which the domain will add. If not supplied, then use default group.
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    readonly name?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Domain resource.
 */
export interface DomainArgs {
    /**
     * Id of the group in which the domain will add. If not supplied, then use default group.
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    readonly name?: pulumi.Input<string>;
}
