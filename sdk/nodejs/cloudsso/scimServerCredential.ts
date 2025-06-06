// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud SSO SCIM Server Credential resource.
 *
 * For information about Cloud SSO SCIM Server Credential and how to use it, see [What is Cloud SSO SCIM Server Credential](https://www.alibabacloud.com/help/en/cloudsso/latest/api-cloudsso-2021-05-15-createscimservercredential).
 *
 * > **NOTE:** Available since v1.138.0.
 *
 * > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
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
 * const _default = alicloud.cloudsso.getDirectories({});
 * const defaultScimServerCredential = new alicloud.cloudsso.ScimServerCredential("default", {
 *     directoryId: _default.then(_default => _default.directories?.[0]?.id),
 *     credentialSecretFile: "./credential_secret_file.txt",
 * });
 * ```
 *
 * ## Import
 *
 * Cloud SSO SCIM Server Credential can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cloudsso/scimServerCredential:ScimServerCredential example <directory_id>:<credential_id>
 * ```
 */
export class ScimServerCredential extends pulumi.CustomResource {
    /**
     * Get an existing ScimServerCredential resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScimServerCredentialState, opts?: pulumi.CustomResourceOptions): ScimServerCredential {
        return new ScimServerCredential(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudsso/scimServerCredential:ScimServerCredential';

    /**
     * Returns true if the given object is an instance of ScimServerCredential.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ScimServerCredential {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ScimServerCredential.__pulumiType;
    }

    /**
     * (Available since v1.245.0) The time when the SCIM credential was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The ID of the SCIM credential.
     */
    public /*out*/ readonly credentialId!: pulumi.Output<string>;
    /**
     * The name of file that can save Credential ID and Credential Secret. Strongly suggest you to specified it when you creating credential, otherwise, you wouldn't get its secret ever.
     */
    public readonly credentialSecretFile!: pulumi.Output<string | undefined>;
    /**
     * (Available since v1.245.0) The type of the SCIM credential.
     */
    public /*out*/ readonly credentialType!: pulumi.Output<string>;
    /**
     * The ID of the Directory.
     */
    public readonly directoryId!: pulumi.Output<string>;
    /**
     * (Available since v1.245.0) The time when the SCIM credential expires.
     */
    public /*out*/ readonly expireTime!: pulumi.Output<string>;
    /**
     * The status of the SCIM Server Credential. Valid values: `Enabled`, `Disabled`.
     */
    public readonly status!: pulumi.Output<string>;

    /**
     * Create a ScimServerCredential resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScimServerCredentialArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ScimServerCredentialArgs | ScimServerCredentialState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ScimServerCredentialState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["credentialId"] = state ? state.credentialId : undefined;
            resourceInputs["credentialSecretFile"] = state ? state.credentialSecretFile : undefined;
            resourceInputs["credentialType"] = state ? state.credentialType : undefined;
            resourceInputs["directoryId"] = state ? state.directoryId : undefined;
            resourceInputs["expireTime"] = state ? state.expireTime : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ScimServerCredentialArgs | undefined;
            if ((!args || args.directoryId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'directoryId'");
            }
            resourceInputs["credentialSecretFile"] = args ? args.credentialSecretFile : undefined;
            resourceInputs["directoryId"] = args ? args.directoryId : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["credentialId"] = undefined /*out*/;
            resourceInputs["credentialType"] = undefined /*out*/;
            resourceInputs["expireTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ScimServerCredential.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ScimServerCredential resources.
 */
export interface ScimServerCredentialState {
    /**
     * (Available since v1.245.0) The time when the SCIM credential was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The ID of the SCIM credential.
     */
    credentialId?: pulumi.Input<string>;
    /**
     * The name of file that can save Credential ID and Credential Secret. Strongly suggest you to specified it when you creating credential, otherwise, you wouldn't get its secret ever.
     */
    credentialSecretFile?: pulumi.Input<string>;
    /**
     * (Available since v1.245.0) The type of the SCIM credential.
     */
    credentialType?: pulumi.Input<string>;
    /**
     * The ID of the Directory.
     */
    directoryId?: pulumi.Input<string>;
    /**
     * (Available since v1.245.0) The time when the SCIM credential expires.
     */
    expireTime?: pulumi.Input<string>;
    /**
     * The status of the SCIM Server Credential. Valid values: `Enabled`, `Disabled`.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ScimServerCredential resource.
 */
export interface ScimServerCredentialArgs {
    /**
     * The name of file that can save Credential ID and Credential Secret. Strongly suggest you to specified it when you creating credential, otherwise, you wouldn't get its secret ever.
     */
    credentialSecretFile?: pulumi.Input<string>;
    /**
     * The ID of the Directory.
     */
    directoryId: pulumi.Input<string>;
    /**
     * The status of the SCIM Server Credential. Valid values: `Enabled`, `Disabled`.
     */
    status?: pulumi.Input<string>;
}
