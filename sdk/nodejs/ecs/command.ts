// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ECS Command resource.
 *
 * For information about ECS Command and how to use it, see [What is Command](https://www.alibabacloud.com/help/en/doc-detail/64844.htm).
 *
 * > **NOTE:** Available in v1.116.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.ecs.Command("example", {
 *     name: "tf-testAcc",
 *     commandContent: "bHMK",
 *     description: "For Terraform Test",
 *     type: "RunShellScript",
 *     workingDir: "/root",
 * });
 * ```
 *
 * ## Import
 *
 * ECS Command can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:ecs/command:Command example <id>
 * ```
 */
export class Command extends pulumi.CustomResource {
    /**
     * Get an existing Command resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CommandState, opts?: pulumi.CustomResourceOptions): Command {
        return new Command(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/command:Command';

    /**
     * Returns true if the given object is an instance of Command.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Command {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Command.__pulumiType;
    }

    /**
     * The Base64-encoded content of the command.
     */
    public readonly commandContent!: pulumi.Output<string>;
    /**
     * The description of command.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether to use custom parameters in the command to be created. Default to: false.
     */
    public readonly enableParameter!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the command, which supports all character sets. It can be up to 128 characters in length.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
     */
    public readonly timeout!: pulumi.Output<number | undefined>;
    /**
     * The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The execution path of the command in the ECS instance.
     */
    public readonly workingDir!: pulumi.Output<string | undefined>;

    /**
     * Create a Command resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CommandArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CommandArgs | CommandState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CommandState | undefined;
            resourceInputs["commandContent"] = state ? state.commandContent : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enableParameter"] = state ? state.enableParameter : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["timeout"] = state ? state.timeout : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["workingDir"] = state ? state.workingDir : undefined;
        } else {
            const args = argsOrState as CommandArgs | undefined;
            if ((!args || args.commandContent === undefined) && !opts.urn) {
                throw new Error("Missing required property 'commandContent'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["commandContent"] = args ? args.commandContent : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enableParameter"] = args ? args.enableParameter : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["workingDir"] = args ? args.workingDir : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Command.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Command resources.
 */
export interface CommandState {
    /**
     * The Base64-encoded content of the command.
     */
    commandContent?: pulumi.Input<string>;
    /**
     * The description of command.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies whether to use custom parameters in the command to be created. Default to: false.
     */
    enableParameter?: pulumi.Input<boolean>;
    /**
     * The name of the command, which supports all character sets. It can be up to 128 characters in length.
     */
    name?: pulumi.Input<string>;
    /**
     * The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
     */
    timeout?: pulumi.Input<number>;
    /**
     * The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
     */
    type?: pulumi.Input<string>;
    /**
     * The execution path of the command in the ECS instance.
     */
    workingDir?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Command resource.
 */
export interface CommandArgs {
    /**
     * The Base64-encoded content of the command.
     */
    commandContent: pulumi.Input<string>;
    /**
     * The description of command.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies whether to use custom parameters in the command to be created. Default to: false.
     */
    enableParameter?: pulumi.Input<boolean>;
    /**
     * The name of the command, which supports all character sets. It can be up to 128 characters in length.
     */
    name?: pulumi.Input<string>;
    /**
     * The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
     */
    timeout?: pulumi.Input<number>;
    /**
     * The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
     */
    type: pulumi.Input<string>;
    /**
     * The execution path of the command in the ECS instance.
     */
    workingDir?: pulumi.Input<string>;
}
