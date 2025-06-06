// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Api Gateway Access Control List resource. Access control list.
 *
 * For information about Api Gateway Access Control List and how to use it, see [What is Access Control List](https://www.alibabacloud.com/help/en/api-gateway/developer-reference/api-cloudapi-2016-07-14-createaccesscontrollist).
 *
 * > **NOTE:** Available since v1.224.0.
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
 * const name = config.get("name") || "terraform_example";
 * const defaultxywS8c = new alicloud.apigateway.Instance("defaultxywS8c", {
 *     instanceName: name,
 *     instanceSpec: "api.s1.small",
 *     httpsPolicy: "HTTPS2_TLS1_0",
 *     zoneId: "cn-hangzhou-MAZ6",
 *     paymentType: "PayAsYouGo",
 * });
 * const _default = new alicloud.apigateway.AccessControlList("default", {
 *     accessControlListName: name,
 *     addressIpVersion: "ipv4",
 * });
 * ```
 *
 * ## Import
 *
 * Api Gateway Access Control List can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:apigateway/accessControlList:AccessControlList example <id>
 * ```
 */
export class AccessControlList extends pulumi.CustomResource {
    /**
     * Get an existing AccessControlList resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessControlListState, opts?: pulumi.CustomResourceOptions): AccessControlList {
        return new AccessControlList(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:apigateway/accessControlList:AccessControlList';

    /**
     * Returns true if the given object is an instance of AccessControlList.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessControlList {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessControlList.__pulumiType;
    }

    /**
     * Access control list name.
     */
    public readonly accessControlListName!: pulumi.Output<string>;
    /**
     * Information list of access control policies. You can add at most 50 IP addresses or CIDR blocks to an ACL in each call. If the IP address or CIDR block that you want to add to an ACL already exists, the IP address or CIDR block is not added. The entries that you add must be CIDR blocks. See `aclEntrys` below.
     * **NOTE:** Field 'acl_entrys' has been deprecated from provider version 1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
     *
     * @deprecated Field 'acl_entrys' has been deprecated from provider version v1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
     */
    public readonly aclEntrys!: pulumi.Output<outputs.apigateway.AccessControlListAclEntry[]>;
    /**
     * The IP version. Valid values: ipv4 and ipv6.
     */
    public readonly addressIpVersion!: pulumi.Output<string>;

    /**
     * Create a AccessControlList resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessControlListArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessControlListArgs | AccessControlListState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessControlListState | undefined;
            resourceInputs["accessControlListName"] = state ? state.accessControlListName : undefined;
            resourceInputs["aclEntrys"] = state ? state.aclEntrys : undefined;
            resourceInputs["addressIpVersion"] = state ? state.addressIpVersion : undefined;
        } else {
            const args = argsOrState as AccessControlListArgs | undefined;
            if ((!args || args.accessControlListName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessControlListName'");
            }
            resourceInputs["accessControlListName"] = args ? args.accessControlListName : undefined;
            resourceInputs["aclEntrys"] = args?.aclEntrys ? pulumi.secret(args.aclEntrys) : undefined;
            resourceInputs["addressIpVersion"] = args ? args.addressIpVersion : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["aclEntrys"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(AccessControlList.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessControlList resources.
 */
export interface AccessControlListState {
    /**
     * Access control list name.
     */
    accessControlListName?: pulumi.Input<string>;
    /**
     * Information list of access control policies. You can add at most 50 IP addresses or CIDR blocks to an ACL in each call. If the IP address or CIDR block that you want to add to an ACL already exists, the IP address or CIDR block is not added. The entries that you add must be CIDR blocks. See `aclEntrys` below.
     * **NOTE:** Field 'acl_entrys' has been deprecated from provider version 1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
     *
     * @deprecated Field 'acl_entrys' has been deprecated from provider version v1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
     */
    aclEntrys?: pulumi.Input<pulumi.Input<inputs.apigateway.AccessControlListAclEntry>[]>;
    /**
     * The IP version. Valid values: ipv4 and ipv6.
     */
    addressIpVersion?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessControlList resource.
 */
export interface AccessControlListArgs {
    /**
     * Access control list name.
     */
    accessControlListName: pulumi.Input<string>;
    /**
     * Information list of access control policies. You can add at most 50 IP addresses or CIDR blocks to an ACL in each call. If the IP address or CIDR block that you want to add to an ACL already exists, the IP address or CIDR block is not added. The entries that you add must be CIDR blocks. See `aclEntrys` below.
     * **NOTE:** Field 'acl_entrys' has been deprecated from provider version 1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
     *
     * @deprecated Field 'acl_entrys' has been deprecated from provider version v1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'.
     */
    aclEntrys?: pulumi.Input<pulumi.Input<inputs.apigateway.AccessControlListAclEntry>[]>;
    /**
     * The IP version. Valid values: ipv4 and ipv6.
     */
    addressIpVersion?: pulumi.Input<string>;
}
