// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Threat Detection Client User Define Rule resource. Malicious Behavior Defense Custom Rules.
 *
 * For information about Threat Detection Client User Define Rule and how to use it, see [What is Client User Define Rule](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-addclientuserdefinerule).
 *
 * > **NOTE:** Available since v1.212.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const _default = new alicloud.threatdetection.ClientUserDefineRule("default", {
 *     actionType: 0,
 *     platform: "windows",
 *     registryContent: "123",
 *     clientUserDefineRuleName: name,
 *     parentProcPath: "/root/bash",
 *     type: 5,
 *     cmdline: "bash",
 *     procPath: "/root/bash",
 *     parentCmdline: "bash",
 *     registryKey: "123",
 * });
 * ```
 *
 * ## Import
 *
 * Threat Detection Client User Define Rule can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:threatdetection/clientUserDefineRule:ClientUserDefineRule example <id>
 * ```
 */
export class ClientUserDefineRule extends pulumi.CustomResource {
    /**
     * Get an existing ClientUserDefineRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClientUserDefineRuleState, opts?: pulumi.CustomResourceOptions): ClientUserDefineRule {
        return new ClientUserDefineRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:threatdetection/clientUserDefineRule:ClientUserDefineRule';

    /**
     * Returns true if the given object is an instance of ClientUserDefineRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClientUserDefineRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClientUserDefineRule.__pulumiType;
    }

    /**
     * The operation type. Value:
     * - **0**: plus White
     * - **1**: Plus Black.
     */
    public readonly actionType!: pulumi.Output<number>;
    /**
     * The custom rule name.
     */
    public readonly clientUserDefineRuleName!: pulumi.Output<string>;
    /**
     * Command line. When the value of the Type attribute is 2, 3, 4, 5, 6, or 7, the command line field is required.
     */
    public readonly cmdline!: pulumi.Output<string | undefined>;
    /**
     * The creation time of the resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<number>;
    /**
     * The file path. When the value of the Type attribute is 4 or 6, 7, the FilePath field is required.
     */
    public readonly filePath!: pulumi.Output<string | undefined>;
    /**
     * Process hash list. When the value of the Type attribute is 1, the Hash attribute is required.
     */
    public readonly hash!: pulumi.Output<string | undefined>;
    /**
     * IP address. When the value of the Type attribute is 3, the Ip attribute is required.
     */
    public readonly ip!: pulumi.Output<string | undefined>;
    /**
     * The new file path to rename the file. When the value of the Type attribute is 7, the NewFilePath attribute is required.
     */
    public readonly newFilePath!: pulumi.Output<string | undefined>;
    /**
     * The parent command line.
     */
    public readonly parentCmdline!: pulumi.Output<string | undefined>;
    /**
     * Parent process path.
     */
    public readonly parentProcPath!: pulumi.Output<string | undefined>;
    /**
     * The operating system type. Value:
     * - **windows**:widows
     * - **linux**:linux
     * - **all**: all.
     */
    public readonly platform!: pulumi.Output<string>;
    /**
     * The port number. When the value of the Type attribute is 3, the PortStr attribute is required. Value range: **1-65535**.
     */
    public readonly portStr!: pulumi.Output<string>;
    /**
     * The process path. When the Type attribute is set to 2, 3, 4, 5, 6, or 7, the ProcPath attribute is required.
     */
    public readonly procPath!: pulumi.Output<string | undefined>;
    /**
     * The registry value. When the value of the Type attribute is 5, the RegistryKey attribute is required.
     */
    public readonly registryContent!: pulumi.Output<string | undefined>;
    /**
     * The registry key. When the value of the Type attribute is 5, the RegistryKey attribute is required.
     */
    public readonly registryKey!: pulumi.Output<string | undefined>;
    /**
     * The rule type. Value:
     * - **1**: Process hash
     * - **2**: command line
     * - **3**: Process network
     * - **4**: File reading and writing
     * - **5**: Operate the registry
     * - **6**: Load Dynamic Link Library
     * - **7**: File Rename.
     */
    public readonly type!: pulumi.Output<number>;

    /**
     * Create a ClientUserDefineRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClientUserDefineRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClientUserDefineRuleArgs | ClientUserDefineRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClientUserDefineRuleState | undefined;
            resourceInputs["actionType"] = state ? state.actionType : undefined;
            resourceInputs["clientUserDefineRuleName"] = state ? state.clientUserDefineRuleName : undefined;
            resourceInputs["cmdline"] = state ? state.cmdline : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["filePath"] = state ? state.filePath : undefined;
            resourceInputs["hash"] = state ? state.hash : undefined;
            resourceInputs["ip"] = state ? state.ip : undefined;
            resourceInputs["newFilePath"] = state ? state.newFilePath : undefined;
            resourceInputs["parentCmdline"] = state ? state.parentCmdline : undefined;
            resourceInputs["parentProcPath"] = state ? state.parentProcPath : undefined;
            resourceInputs["platform"] = state ? state.platform : undefined;
            resourceInputs["portStr"] = state ? state.portStr : undefined;
            resourceInputs["procPath"] = state ? state.procPath : undefined;
            resourceInputs["registryContent"] = state ? state.registryContent : undefined;
            resourceInputs["registryKey"] = state ? state.registryKey : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ClientUserDefineRuleArgs | undefined;
            if ((!args || args.actionType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'actionType'");
            }
            if ((!args || args.clientUserDefineRuleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clientUserDefineRuleName'");
            }
            if ((!args || args.platform === undefined) && !opts.urn) {
                throw new Error("Missing required property 'platform'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["actionType"] = args ? args.actionType : undefined;
            resourceInputs["clientUserDefineRuleName"] = args ? args.clientUserDefineRuleName : undefined;
            resourceInputs["cmdline"] = args ? args.cmdline : undefined;
            resourceInputs["filePath"] = args ? args.filePath : undefined;
            resourceInputs["hash"] = args ? args.hash : undefined;
            resourceInputs["ip"] = args ? args.ip : undefined;
            resourceInputs["newFilePath"] = args ? args.newFilePath : undefined;
            resourceInputs["parentCmdline"] = args ? args.parentCmdline : undefined;
            resourceInputs["parentProcPath"] = args ? args.parentProcPath : undefined;
            resourceInputs["platform"] = args ? args.platform : undefined;
            resourceInputs["portStr"] = args ? args.portStr : undefined;
            resourceInputs["procPath"] = args ? args.procPath : undefined;
            resourceInputs["registryContent"] = args ? args.registryContent : undefined;
            resourceInputs["registryKey"] = args ? args.registryKey : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClientUserDefineRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClientUserDefineRule resources.
 */
export interface ClientUserDefineRuleState {
    /**
     * The operation type. Value:
     * - **0**: plus White
     * - **1**: Plus Black.
     */
    actionType?: pulumi.Input<number>;
    /**
     * The custom rule name.
     */
    clientUserDefineRuleName?: pulumi.Input<string>;
    /**
     * Command line. When the value of the Type attribute is 2, 3, 4, 5, 6, or 7, the command line field is required.
     */
    cmdline?: pulumi.Input<string>;
    /**
     * The creation time of the resource.
     */
    createTime?: pulumi.Input<number>;
    /**
     * The file path. When the value of the Type attribute is 4 or 6, 7, the FilePath field is required.
     */
    filePath?: pulumi.Input<string>;
    /**
     * Process hash list. When the value of the Type attribute is 1, the Hash attribute is required.
     */
    hash?: pulumi.Input<string>;
    /**
     * IP address. When the value of the Type attribute is 3, the Ip attribute is required.
     */
    ip?: pulumi.Input<string>;
    /**
     * The new file path to rename the file. When the value of the Type attribute is 7, the NewFilePath attribute is required.
     */
    newFilePath?: pulumi.Input<string>;
    /**
     * The parent command line.
     */
    parentCmdline?: pulumi.Input<string>;
    /**
     * Parent process path.
     */
    parentProcPath?: pulumi.Input<string>;
    /**
     * The operating system type. Value:
     * - **windows**:widows
     * - **linux**:linux
     * - **all**: all.
     */
    platform?: pulumi.Input<string>;
    /**
     * The port number. When the value of the Type attribute is 3, the PortStr attribute is required. Value range: **1-65535**.
     */
    portStr?: pulumi.Input<string>;
    /**
     * The process path. When the Type attribute is set to 2, 3, 4, 5, 6, or 7, the ProcPath attribute is required.
     */
    procPath?: pulumi.Input<string>;
    /**
     * The registry value. When the value of the Type attribute is 5, the RegistryKey attribute is required.
     */
    registryContent?: pulumi.Input<string>;
    /**
     * The registry key. When the value of the Type attribute is 5, the RegistryKey attribute is required.
     */
    registryKey?: pulumi.Input<string>;
    /**
     * The rule type. Value:
     * - **1**: Process hash
     * - **2**: command line
     * - **3**: Process network
     * - **4**: File reading and writing
     * - **5**: Operate the registry
     * - **6**: Load Dynamic Link Library
     * - **7**: File Rename.
     */
    type?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ClientUserDefineRule resource.
 */
export interface ClientUserDefineRuleArgs {
    /**
     * The operation type. Value:
     * - **0**: plus White
     * - **1**: Plus Black.
     */
    actionType: pulumi.Input<number>;
    /**
     * The custom rule name.
     */
    clientUserDefineRuleName: pulumi.Input<string>;
    /**
     * Command line. When the value of the Type attribute is 2, 3, 4, 5, 6, or 7, the command line field is required.
     */
    cmdline?: pulumi.Input<string>;
    /**
     * The file path. When the value of the Type attribute is 4 or 6, 7, the FilePath field is required.
     */
    filePath?: pulumi.Input<string>;
    /**
     * Process hash list. When the value of the Type attribute is 1, the Hash attribute is required.
     */
    hash?: pulumi.Input<string>;
    /**
     * IP address. When the value of the Type attribute is 3, the Ip attribute is required.
     */
    ip?: pulumi.Input<string>;
    /**
     * The new file path to rename the file. When the value of the Type attribute is 7, the NewFilePath attribute is required.
     */
    newFilePath?: pulumi.Input<string>;
    /**
     * The parent command line.
     */
    parentCmdline?: pulumi.Input<string>;
    /**
     * Parent process path.
     */
    parentProcPath?: pulumi.Input<string>;
    /**
     * The operating system type. Value:
     * - **windows**:widows
     * - **linux**:linux
     * - **all**: all.
     */
    platform: pulumi.Input<string>;
    /**
     * The port number. When the value of the Type attribute is 3, the PortStr attribute is required. Value range: **1-65535**.
     */
    portStr?: pulumi.Input<string>;
    /**
     * The process path. When the Type attribute is set to 2, 3, 4, 5, 6, or 7, the ProcPath attribute is required.
     */
    procPath?: pulumi.Input<string>;
    /**
     * The registry value. When the value of the Type attribute is 5, the RegistryKey attribute is required.
     */
    registryContent?: pulumi.Input<string>;
    /**
     * The registry key. When the value of the Type attribute is 5, the RegistryKey attribute is required.
     */
    registryKey?: pulumi.Input<string>;
    /**
     * The rule type. Value:
     * - **1**: Process hash
     * - **2**: command line
     * - **3**: Process network
     * - **4**: File reading and writing
     * - **5**: Operate the registry
     * - **6**: Load Dynamic Link Library
     * - **7**: File Rename.
     */
    type: pulumi.Input<number>;
}
