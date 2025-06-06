// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Alidns domain resource.
 *
 * > **NOTE:** The domain name which you want to add must be already registered and had not added by another account. Every domain name can only exist in a unique group.
 *
 * > **NOTE:** Available since v1.95.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.dns.DomainGroup("default", {domainGroupName: "tf-example"});
 * const defaultAlidnsDomain = new alicloud.dns.AlidnsDomain("default", {
 *     domainName: "starmove.com",
 *     groupId: _default.id,
 *     tags: {
 *         Created: "TF",
 *         For: "example",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Alidns domain can be imported using the id or domain name, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:dns/alidnsDomain:AlidnsDomain example aliyun.com
 * ```
 */
export class AlidnsDomain extends pulumi.CustomResource {
    /**
     * Get an existing AlidnsDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlidnsDomainState, opts?: pulumi.CustomResourceOptions): AlidnsDomain {
        return new AlidnsDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:dns/alidnsDomain:AlidnsDomain';

    /**
     * Returns true if the given object is an instance of AlidnsDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlidnsDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlidnsDomain.__pulumiType;
    }

    /**
     * A list of the dns server name.
     */
    public /*out*/ readonly dnsServers!: pulumi.Output<string[]>;
    /**
     * The domain ID.
     */
    public /*out*/ readonly domainId!: pulumi.Output<string>;
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    public readonly domainName!: pulumi.Output<string>;
    /**
     * Id of the group in which the domain will add. If not supplied, then use default group.
     */
    public readonly groupId!: pulumi.Output<string | undefined>;
    /**
     * Domain name group name.
     */
    public /*out*/ readonly groupName!: pulumi.Output<string>;
    /**
     * User language.
     */
    public readonly lang!: pulumi.Output<string | undefined>;
    /**
     * Only return punycode codes for Chinese domain names.
     */
    public /*out*/ readonly punyCode!: pulumi.Output<string>;
    /**
     * Remarks information for your domain name.
     */
    public readonly remark!: pulumi.Output<string | undefined>;
    /**
     * The Id of resource group which the dns domain belongs.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be [1, 20] characters in length. It can contain A-Z, a-z, numbers, underscores (_), and hyphens (-). It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be [1, 20] characters in length. It can contain A-Z, a-z, numbers, underscores (_), and hyphens (-). It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a AlidnsDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlidnsDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlidnsDomainArgs | AlidnsDomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlidnsDomainState | undefined;
            resourceInputs["dnsServers"] = state ? state.dnsServers : undefined;
            resourceInputs["domainId"] = state ? state.domainId : undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["groupName"] = state ? state.groupName : undefined;
            resourceInputs["lang"] = state ? state.lang : undefined;
            resourceInputs["punyCode"] = state ? state.punyCode : undefined;
            resourceInputs["remark"] = state ? state.remark : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as AlidnsDomainArgs | undefined;
            if ((!args || args.domainName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainName'");
            }
            resourceInputs["domainName"] = args ? args.domainName : undefined;
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["lang"] = args ? args.lang : undefined;
            resourceInputs["remark"] = args ? args.remark : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["dnsServers"] = undefined /*out*/;
            resourceInputs["domainId"] = undefined /*out*/;
            resourceInputs["groupName"] = undefined /*out*/;
            resourceInputs["punyCode"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AlidnsDomain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlidnsDomain resources.
 */
export interface AlidnsDomainState {
    /**
     * A list of the dns server name.
     */
    dnsServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The domain ID.
     */
    domainId?: pulumi.Input<string>;
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    domainName?: pulumi.Input<string>;
    /**
     * Id of the group in which the domain will add. If not supplied, then use default group.
     */
    groupId?: pulumi.Input<string>;
    /**
     * Domain name group name.
     */
    groupName?: pulumi.Input<string>;
    /**
     * User language.
     */
    lang?: pulumi.Input<string>;
    /**
     * Only return punycode codes for Chinese domain names.
     */
    punyCode?: pulumi.Input<string>;
    /**
     * Remarks information for your domain name.
     */
    remark?: pulumi.Input<string>;
    /**
     * The Id of resource group which the dns domain belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be [1, 20] characters in length. It can contain A-Z, a-z, numbers, underscores (_), and hyphens (-). It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be [1, 20] characters in length. It can contain A-Z, a-z, numbers, underscores (_), and hyphens (-). It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a AlidnsDomain resource.
 */
export interface AlidnsDomainArgs {
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    domainName: pulumi.Input<string>;
    /**
     * Id of the group in which the domain will add. If not supplied, then use default group.
     */
    groupId?: pulumi.Input<string>;
    /**
     * User language.
     */
    lang?: pulumi.Input<string>;
    /**
     * Remarks information for your domain name.
     */
    remark?: pulumi.Input<string>;
    /**
     * The Id of resource group which the dns domain belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be [1, 20] characters in length. It can contain A-Z, a-z, numbers, underscores (_), and hyphens (-). It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be [1, 20] characters in length. It can contain A-Z, a-z, numbers, underscores (_), and hyphens (-). It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
