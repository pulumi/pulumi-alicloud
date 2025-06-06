// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ECD Command resource.
 *
 * For information about ECD Command and how to use it, see [What is Command](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-ecd-2020-09-30-runcommand).
 *
 * > **NOTE:** Available since v1.146.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const defaultInteger = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const defaultSimpleOfficeSite = new alicloud.eds.SimpleOfficeSite("default", {
 *     cidrBlock: "172.16.0.0/12",
 *     enableAdminAccess: true,
 *     desktopAccessType: "Internet",
 *     officeSiteName: `${name}-${defaultInteger.result}`,
 * });
 * const defaultEcdPolicyGroup = new alicloud.eds.EcdPolicyGroup("default", {
 *     policyGroupName: name,
 *     clipboard: "read",
 *     localDrive: "read",
 *     usbRedirect: "off",
 *     watermark: "off",
 *     authorizeAccessPolicyRules: [{
 *         description: name,
 *         cidrIp: "1.2.3.45/24",
 *     }],
 *     authorizeSecurityPolicyRules: [{
 *         type: "inflow",
 *         policy: "accept",
 *         description: name,
 *         portRange: "80/80",
 *         ipProtocol: "TCP",
 *         priority: "1",
 *         cidrIp: "1.2.3.4/24",
 *     }],
 * });
 * const _default = alicloud.eds.getBundles({
 *     bundleType: "SYSTEM",
 *     bundleIds: [
 *         "bundle_eds_enterprise_office_4c8g_s8d2_win2019_edu",
 *         "bundle_eds_enterprise_office_8c16g_s8d2_win2019_edu",
 *     ],
 * });
 * const defaultDesktop = new alicloud.eds.Desktop("default", {
 *     officeSiteId: defaultSimpleOfficeSite.id,
 *     policyGroupId: defaultEcdPolicyGroup.id,
 *     bundleId: _default.then(_default => _default.bundles?.[0]?.id),
 *     desktopName: name,
 * });
 * const defaultCommand = new alicloud.eds.Command("default", {
 *     commandContent: "ipconfig",
 *     commandType: "RunPowerShellScript",
 *     desktopId: defaultDesktop.id,
 * });
 * ```
 *
 * ## Import
 *
 * ECD Command can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:eds/command:Command example <id>
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
    public static readonly __pulumiType = 'alicloud:eds/command:Command';

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
     * The Contents of the Script to Base64 Encoded Transmission.
     */
    public readonly commandContent!: pulumi.Output<string>;
    /**
     * The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
     */
    public readonly commandType!: pulumi.Output<string>;
    /**
     * That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
     */
    public readonly contentEncoding!: pulumi.Output<string | undefined>;
    /**
     * The desktop id of the Desktop.
     */
    public readonly desktopId!: pulumi.Output<string>;
    /**
     * Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The timeout period for script execution the unit is seconds. Default to: `60`.
     */
    public readonly timeout!: pulumi.Output<string | undefined>;

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
            resourceInputs["commandType"] = state ? state.commandType : undefined;
            resourceInputs["contentEncoding"] = state ? state.contentEncoding : undefined;
            resourceInputs["desktopId"] = state ? state.desktopId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["timeout"] = state ? state.timeout : undefined;
        } else {
            const args = argsOrState as CommandArgs | undefined;
            if ((!args || args.commandContent === undefined) && !opts.urn) {
                throw new Error("Missing required property 'commandContent'");
            }
            if ((!args || args.commandType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'commandType'");
            }
            if ((!args || args.desktopId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'desktopId'");
            }
            resourceInputs["commandContent"] = args ? args.commandContent : undefined;
            resourceInputs["commandType"] = args ? args.commandType : undefined;
            resourceInputs["contentEncoding"] = args ? args.contentEncoding : undefined;
            resourceInputs["desktopId"] = args ? args.desktopId : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
            resourceInputs["status"] = undefined /*out*/;
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
     * The Contents of the Script to Base64 Encoded Transmission.
     */
    commandContent?: pulumi.Input<string>;
    /**
     * The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
     */
    commandType?: pulumi.Input<string>;
    /**
     * That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
     */
    contentEncoding?: pulumi.Input<string>;
    /**
     * The desktop id of the Desktop.
     */
    desktopId?: pulumi.Input<string>;
    /**
     * Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
     */
    status?: pulumi.Input<string>;
    /**
     * The timeout period for script execution the unit is seconds. Default to: `60`.
     */
    timeout?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Command resource.
 */
export interface CommandArgs {
    /**
     * The Contents of the Script to Base64 Encoded Transmission.
     */
    commandContent: pulumi.Input<string>;
    /**
     * The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
     */
    commandType: pulumi.Input<string>;
    /**
     * That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
     */
    contentEncoding?: pulumi.Input<string>;
    /**
     * The desktop id of the Desktop.
     */
    desktopId: pulumi.Input<string>;
    /**
     * The timeout period for script execution the unit is seconds. Default to: `60`.
     */
    timeout?: pulumi.Input<string>;
}
