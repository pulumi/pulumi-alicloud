import * as pulumi from "@pulumi/pulumi";
/**
 * Log Service manages all the ECS instances whose logs need to be collected by using the Logtail client in the form of machine groups.
 *  [Refer to details](https://www.alibabacloud.com/help/doc-detail/28966.htm)
 */
export declare class MachineGroup extends pulumi.CustomResource {
    /**
     * Get an existing MachineGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MachineGroupState): MachineGroup;
    /**
     * The machine identification.
     */
    readonly identifyLists: pulumi.Output<string[]>;
    /**
     * The machine identification type, including IP and user-defined identity. Valid values are "ip" and "userdefined". Default to "ip".
     * * `identify_list`-  The specific machine identification, which can be an IP address or user-defined identity.
     */
    readonly identifyType: pulumi.Output<string | undefined>;
    /**
     * The machine group name, which is unique in the same project.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The project name to the machine group belongs.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The topic of a machine group.
     */
    readonly topic: pulumi.Output<string | undefined>;
    /**
     * Create a MachineGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MachineGroupArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering MachineGroup resources.
 */
export interface MachineGroupState {
    /**
     * The machine identification.
     */
    readonly identifyLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The machine identification type, including IP and user-defined identity. Valid values are "ip" and "userdefined". Default to "ip".
     * * `identify_list`-  The specific machine identification, which can be an IP address or user-defined identity.
     */
    readonly identifyType?: pulumi.Input<string>;
    /**
     * The machine group name, which is unique in the same project.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project name to the machine group belongs.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The topic of a machine group.
     */
    readonly topic?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a MachineGroup resource.
 */
export interface MachineGroupArgs {
    /**
     * The machine identification.
     */
    readonly identifyLists: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The machine identification type, including IP and user-defined identity. Valid values are "ip" and "userdefined". Default to "ip".
     * * `identify_list`-  The specific machine identification, which can be an IP address or user-defined identity.
     */
    readonly identifyType?: pulumi.Input<string>;
    /**
     * The machine group name, which is unique in the same project.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project name to the machine group belongs.
     */
    readonly project: pulumi.Input<string>;
    /**
     * The topic of a machine group.
     */
    readonly topic?: pulumi.Input<string>;
}
