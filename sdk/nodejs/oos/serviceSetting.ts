// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a OOS Service Setting resource.
 *
 * For information about OOS Service Setting and how to use it, see [What is Service Setting](https://www.alibabacloud.com/help/en/doc-detail/268700.html).
 *
 * > **NOTE:** Available in v1.147.0+.
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
 * const name = config.get("name") || "tf-testaccoossetting";
 * const _default = new alicloud.oss.Bucket("default", {bucket: name});
 * const defaultBucketAcl = new alicloud.oss.BucketAcl("default", {
 *     bucket: _default.bucket,
 *     acl: "public-read-write",
 * });
 * const defaultProject = new alicloud.log.Project("default", {projectName: name});
 * const defaultServiceSetting = new alicloud.oos.ServiceSetting("default", {
 *     deliveryOssEnabled: true,
 *     deliveryOssKeyPrefix: "path1/",
 *     deliveryOssBucketName: _default.bucket,
 *     deliverySlsEnabled: true,
 *     deliverySlsProjectName: defaultProject.projectName,
 * });
 * ```
 *
 * ## Import
 *
 * OOS Service Setting can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:oos/serviceSetting:ServiceSetting example <id>
 * ```
 */
export class ServiceSetting extends pulumi.CustomResource {
    /**
     * Get an existing ServiceSetting resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceSettingState, opts?: pulumi.CustomResourceOptions): ServiceSetting {
        return new ServiceSetting(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:oos/serviceSetting:ServiceSetting';

    /**
     * Returns true if the given object is an instance of ServiceSetting.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceSetting {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceSetting.__pulumiType;
    }

    /**
     * The name of the OSS bucket. **NOTE:** When the `deliveryOssEnabled` is `true`, The `deliveryOssBucketName` is valid.
     */
    public readonly deliveryOssBucketName!: pulumi.Output<string | undefined>;
    /**
     * Is the recording function for the OSS delivery template enabled.
     */
    public readonly deliveryOssEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The Directory of the OSS bucket. **NOTE:** When the `deliveryOssEnabled` is `true`, The `deliveryOssBucketName` is valid.
     */
    public readonly deliveryOssKeyPrefix!: pulumi.Output<string | undefined>;
    /**
     * Is the execution record function to SLS delivery Template turned on.
     */
    public readonly deliverySlsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The name of SLS  Project. **NOTE:** When the `deliverySlsEnabled` is `true`, The `deliverySlsProjectName` is valid.
     */
    public readonly deliverySlsProjectName!: pulumi.Output<string | undefined>;

    /**
     * Create a ServiceSetting resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ServiceSettingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceSettingArgs | ServiceSettingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceSettingState | undefined;
            resourceInputs["deliveryOssBucketName"] = state ? state.deliveryOssBucketName : undefined;
            resourceInputs["deliveryOssEnabled"] = state ? state.deliveryOssEnabled : undefined;
            resourceInputs["deliveryOssKeyPrefix"] = state ? state.deliveryOssKeyPrefix : undefined;
            resourceInputs["deliverySlsEnabled"] = state ? state.deliverySlsEnabled : undefined;
            resourceInputs["deliverySlsProjectName"] = state ? state.deliverySlsProjectName : undefined;
        } else {
            const args = argsOrState as ServiceSettingArgs | undefined;
            resourceInputs["deliveryOssBucketName"] = args ? args.deliveryOssBucketName : undefined;
            resourceInputs["deliveryOssEnabled"] = args ? args.deliveryOssEnabled : undefined;
            resourceInputs["deliveryOssKeyPrefix"] = args ? args.deliveryOssKeyPrefix : undefined;
            resourceInputs["deliverySlsEnabled"] = args ? args.deliverySlsEnabled : undefined;
            resourceInputs["deliverySlsProjectName"] = args ? args.deliverySlsProjectName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceSetting.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceSetting resources.
 */
export interface ServiceSettingState {
    /**
     * The name of the OSS bucket. **NOTE:** When the `deliveryOssEnabled` is `true`, The `deliveryOssBucketName` is valid.
     */
    deliveryOssBucketName?: pulumi.Input<string>;
    /**
     * Is the recording function for the OSS delivery template enabled.
     */
    deliveryOssEnabled?: pulumi.Input<boolean>;
    /**
     * The Directory of the OSS bucket. **NOTE:** When the `deliveryOssEnabled` is `true`, The `deliveryOssBucketName` is valid.
     */
    deliveryOssKeyPrefix?: pulumi.Input<string>;
    /**
     * Is the execution record function to SLS delivery Template turned on.
     */
    deliverySlsEnabled?: pulumi.Input<boolean>;
    /**
     * The name of SLS  Project. **NOTE:** When the `deliverySlsEnabled` is `true`, The `deliverySlsProjectName` is valid.
     */
    deliverySlsProjectName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceSetting resource.
 */
export interface ServiceSettingArgs {
    /**
     * The name of the OSS bucket. **NOTE:** When the `deliveryOssEnabled` is `true`, The `deliveryOssBucketName` is valid.
     */
    deliveryOssBucketName?: pulumi.Input<string>;
    /**
     * Is the recording function for the OSS delivery template enabled.
     */
    deliveryOssEnabled?: pulumi.Input<boolean>;
    /**
     * The Directory of the OSS bucket. **NOTE:** When the `deliveryOssEnabled` is `true`, The `deliveryOssBucketName` is valid.
     */
    deliveryOssKeyPrefix?: pulumi.Input<string>;
    /**
     * Is the execution record function to SLS delivery Template turned on.
     */
    deliverySlsEnabled?: pulumi.Input<boolean>;
    /**
     * The name of SLS  Project. **NOTE:** When the `deliverySlsEnabled` is `true`, The `deliverySlsProjectName` is valid.
     */
    deliverySlsProjectName?: pulumi.Input<string>;
}
