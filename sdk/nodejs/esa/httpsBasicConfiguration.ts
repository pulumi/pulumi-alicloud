// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ESA Https Basic Configuration resource.
 *
 * For information about ESA Https Basic Configuration and how to use it, see [What is Https Basic Configuration](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateHttpsBasicConfiguration).
 *
 * > **NOTE:** Available since v1.243.0.
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
 * const example = new alicloud.esa.RatePlanInstance("example", {
 *     type: "NS",
 *     autoRenew: false,
 *     period: 1,
 *     paymentType: "Subscription",
 *     coverage: "overseas",
 *     autoPay: true,
 *     planName: "high",
 * });
 * const _default = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const resourceHttpBasicConfigurationSetExample = new alicloud.esa.Site("resource_HttpBasicConfiguration_set_example", {
 *     siteName: `gositecdn-${_default.result}.cn`,
 *     instanceId: example.id,
 *     coverage: "overseas",
 *     accessType: "NS",
 * });
 * const defaultHttpsBasicConfiguration = new alicloud.esa.HttpsBasicConfiguration("default", {
 *     https: "on",
 *     rule: "true",
 *     ruleName: "example2",
 *     siteId: resourceHttpBasicConfigurationSetExample.id,
 *     ruleEnable: "on",
 * });
 * ```
 *
 * ## Import
 *
 * ESA Https Basic Configuration can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:esa/httpsBasicConfiguration:HttpsBasicConfiguration example <site_id>:<config_id>
 * ```
 */
export class HttpsBasicConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing HttpsBasicConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HttpsBasicConfigurationState, opts?: pulumi.CustomResourceOptions): HttpsBasicConfiguration {
        return new HttpsBasicConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:esa/httpsBasicConfiguration:HttpsBasicConfiguration';

    /**
     * Returns true if the given object is an instance of HttpsBasicConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is HttpsBasicConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === HttpsBasicConfiguration.__pulumiType;
    }

    /**
     * Custom cipher suite, indicating the specific encryption algorithm selected when CiphersuiteGroup is set to custom.
     */
    public readonly ciphersuite!: pulumi.Output<string | undefined>;
    /**
     * Cipher suite group. Default is all cipher suites. Possible values:
     * - all: All cipher suites.
     * - strict: Strong cipher suites.
     * - custom: Custom cipher suites.
     */
    public readonly ciphersuiteGroup!: pulumi.Output<string | undefined>;
    /**
     * ConfigId of the configuration, which can be obtained by calling the [ListHttpsBasicConfigurations](https://www.alibabacloud.com/help/en/doc-detail/2867470.html) interface.
     */
    public /*out*/ readonly configId!: pulumi.Output<number>;
    /**
     * Indicates whether HTTP2 is enabled. Default is on. Possible values:
     * - on: Enabled.
     * - off: Disabled.
     */
    public readonly http2!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable HTTP3, which is enabled by default. The value can be:
     * - on: Enabled.
     * - off: Disabled.
     */
    public readonly http3!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable HTTPS. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    public readonly https!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether OCSP is enabled. Default is off. Possible values:
     * - on: Enabled.
     * - off: Disabled.
     */
    public readonly ocspStapling!: pulumi.Output<string | undefined>;
    /**
     * Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
     * -  Match all incoming requests: value set to true
     * -  Match specified request: Set the value to a custom expression, for example: (http.host eq \"video.example.com\")
     */
    public readonly rule!: pulumi.Output<string | undefined>;
    /**
     * Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
     * - on: open.
     * - off: close.
     */
    public readonly ruleEnable!: pulumi.Output<string | undefined>;
    /**
     * Rule name. When adding global configuration, this parameter does not need to be set.
     */
    public readonly ruleName!: pulumi.Output<string | undefined>;
    /**
     * Site ID, which can be obtained by calling the [ListSites](https://next.api.alibabacloud.com/document/ESA/2024-09-10/ListSites) interface.
     */
    public readonly siteId!: pulumi.Output<number>;
    /**
     * Whether to enable TLS1.0. Default is disabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    public readonly tls10!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable TLS1.1. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    public readonly tls11!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable TLS1.2. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    public readonly tls12!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable TLS1.3. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    public readonly tls13!: pulumi.Output<string | undefined>;

    /**
     * Create a HttpsBasicConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HttpsBasicConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HttpsBasicConfigurationArgs | HttpsBasicConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HttpsBasicConfigurationState | undefined;
            resourceInputs["ciphersuite"] = state ? state.ciphersuite : undefined;
            resourceInputs["ciphersuiteGroup"] = state ? state.ciphersuiteGroup : undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["http2"] = state ? state.http2 : undefined;
            resourceInputs["http3"] = state ? state.http3 : undefined;
            resourceInputs["https"] = state ? state.https : undefined;
            resourceInputs["ocspStapling"] = state ? state.ocspStapling : undefined;
            resourceInputs["rule"] = state ? state.rule : undefined;
            resourceInputs["ruleEnable"] = state ? state.ruleEnable : undefined;
            resourceInputs["ruleName"] = state ? state.ruleName : undefined;
            resourceInputs["siteId"] = state ? state.siteId : undefined;
            resourceInputs["tls10"] = state ? state.tls10 : undefined;
            resourceInputs["tls11"] = state ? state.tls11 : undefined;
            resourceInputs["tls12"] = state ? state.tls12 : undefined;
            resourceInputs["tls13"] = state ? state.tls13 : undefined;
        } else {
            const args = argsOrState as HttpsBasicConfigurationArgs | undefined;
            if ((!args || args.siteId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'siteId'");
            }
            resourceInputs["ciphersuite"] = args ? args.ciphersuite : undefined;
            resourceInputs["ciphersuiteGroup"] = args ? args.ciphersuiteGroup : undefined;
            resourceInputs["http2"] = args ? args.http2 : undefined;
            resourceInputs["http3"] = args ? args.http3 : undefined;
            resourceInputs["https"] = args ? args.https : undefined;
            resourceInputs["ocspStapling"] = args ? args.ocspStapling : undefined;
            resourceInputs["rule"] = args ? args.rule : undefined;
            resourceInputs["ruleEnable"] = args ? args.ruleEnable : undefined;
            resourceInputs["ruleName"] = args ? args.ruleName : undefined;
            resourceInputs["siteId"] = args ? args.siteId : undefined;
            resourceInputs["tls10"] = args ? args.tls10 : undefined;
            resourceInputs["tls11"] = args ? args.tls11 : undefined;
            resourceInputs["tls12"] = args ? args.tls12 : undefined;
            resourceInputs["tls13"] = args ? args.tls13 : undefined;
            resourceInputs["configId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(HttpsBasicConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering HttpsBasicConfiguration resources.
 */
export interface HttpsBasicConfigurationState {
    /**
     * Custom cipher suite, indicating the specific encryption algorithm selected when CiphersuiteGroup is set to custom.
     */
    ciphersuite?: pulumi.Input<string>;
    /**
     * Cipher suite group. Default is all cipher suites. Possible values:
     * - all: All cipher suites.
     * - strict: Strong cipher suites.
     * - custom: Custom cipher suites.
     */
    ciphersuiteGroup?: pulumi.Input<string>;
    /**
     * ConfigId of the configuration, which can be obtained by calling the [ListHttpsBasicConfigurations](https://www.alibabacloud.com/help/en/doc-detail/2867470.html) interface.
     */
    configId?: pulumi.Input<number>;
    /**
     * Indicates whether HTTP2 is enabled. Default is on. Possible values:
     * - on: Enabled.
     * - off: Disabled.
     */
    http2?: pulumi.Input<string>;
    /**
     * Whether to enable HTTP3, which is enabled by default. The value can be:
     * - on: Enabled.
     * - off: Disabled.
     */
    http3?: pulumi.Input<string>;
    /**
     * Whether to enable HTTPS. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    https?: pulumi.Input<string>;
    /**
     * Indicates whether OCSP is enabled. Default is off. Possible values:
     * - on: Enabled.
     * - off: Disabled.
     */
    ocspStapling?: pulumi.Input<string>;
    /**
     * Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
     * -  Match all incoming requests: value set to true
     * -  Match specified request: Set the value to a custom expression, for example: (http.host eq \"video.example.com\")
     */
    rule?: pulumi.Input<string>;
    /**
     * Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
     * - on: open.
     * - off: close.
     */
    ruleEnable?: pulumi.Input<string>;
    /**
     * Rule name. When adding global configuration, this parameter does not need to be set.
     */
    ruleName?: pulumi.Input<string>;
    /**
     * Site ID, which can be obtained by calling the [ListSites](https://next.api.alibabacloud.com/document/ESA/2024-09-10/ListSites) interface.
     */
    siteId?: pulumi.Input<number>;
    /**
     * Whether to enable TLS1.0. Default is disabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    tls10?: pulumi.Input<string>;
    /**
     * Whether to enable TLS1.1. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    tls11?: pulumi.Input<string>;
    /**
     * Whether to enable TLS1.2. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    tls12?: pulumi.Input<string>;
    /**
     * Whether to enable TLS1.3. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    tls13?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a HttpsBasicConfiguration resource.
 */
export interface HttpsBasicConfigurationArgs {
    /**
     * Custom cipher suite, indicating the specific encryption algorithm selected when CiphersuiteGroup is set to custom.
     */
    ciphersuite?: pulumi.Input<string>;
    /**
     * Cipher suite group. Default is all cipher suites. Possible values:
     * - all: All cipher suites.
     * - strict: Strong cipher suites.
     * - custom: Custom cipher suites.
     */
    ciphersuiteGroup?: pulumi.Input<string>;
    /**
     * Indicates whether HTTP2 is enabled. Default is on. Possible values:
     * - on: Enabled.
     * - off: Disabled.
     */
    http2?: pulumi.Input<string>;
    /**
     * Whether to enable HTTP3, which is enabled by default. The value can be:
     * - on: Enabled.
     * - off: Disabled.
     */
    http3?: pulumi.Input<string>;
    /**
     * Whether to enable HTTPS. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    https?: pulumi.Input<string>;
    /**
     * Indicates whether OCSP is enabled. Default is off. Possible values:
     * - on: Enabled.
     * - off: Disabled.
     */
    ocspStapling?: pulumi.Input<string>;
    /**
     * Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
     * -  Match all incoming requests: value set to true
     * -  Match specified request: Set the value to a custom expression, for example: (http.host eq \"video.example.com\")
     */
    rule?: pulumi.Input<string>;
    /**
     * Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
     * - on: open.
     * - off: close.
     */
    ruleEnable?: pulumi.Input<string>;
    /**
     * Rule name. When adding global configuration, this parameter does not need to be set.
     */
    ruleName?: pulumi.Input<string>;
    /**
     * Site ID, which can be obtained by calling the [ListSites](https://next.api.alibabacloud.com/document/ESA/2024-09-10/ListSites) interface.
     */
    siteId: pulumi.Input<number>;
    /**
     * Whether to enable TLS1.0. Default is disabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    tls10?: pulumi.Input<string>;
    /**
     * Whether to enable TLS1.1. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    tls11?: pulumi.Input<string>;
    /**
     * Whether to enable TLS1.2. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    tls12?: pulumi.Input<string>;
    /**
     * Whether to enable TLS1.3. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     */
    tls13?: pulumi.Input<string>;
}
