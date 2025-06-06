// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Click House Enterprise Db Cluster Security I P resource.
 *
 * Enterprise Clickhouse instance Security IP.
 *
 * For information about Click House Enterprise Db Cluster Security I P and how to use it, see [What is Enterprise Db Cluster Security I P](https://next.api.alibabacloud.com/document/clickhouse/2023-05-22/ModifySecurityIPList).
 *
 * > **NOTE:** Available since v1.247.0.
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
 * const regionId = config.get("regionId") || "cn-beijing";
 * const vswIpRangeI = config.get("vswIpRangeI") || "172.16.1.0/24";
 * const vpcIpRange = config.get("vpcIpRange") || "172.16.0.0/12";
 * const zoneIdI = config.get("zoneIdI") || "cn-beijing-i";
 * const defaultktKLuM = new alicloud.vpc.Network("defaultktKLuM", {cidrBlock: vpcIpRange});
 * const defaultTQWN3k = new alicloud.vpc.Switch("defaultTQWN3k", {
 *     vpcId: defaultktKLuM.id,
 *     zoneId: zoneIdI,
 *     cidrBlock: vswIpRangeI,
 * });
 * const defaultn0nVrN = new alicloud.clickhouseenterprisedbcluster.ClickHouseEnterpriseDbCluster("defaultn0nVrN", {
 *     zoneId: zoneIdI,
 *     vpcId: defaultktKLuM.id,
 *     scaleMin: "8",
 *     scaleMax: "16",
 *     vswitchId: defaultTQWN3k.id,
 * });
 * const _default = new alicloud.clickhouseenterprisedbcluster.SecurityIp("default", {
 *     groupName: "example_group",
 *     securityIpList: "127.0.0.2",
 *     dbInstanceId: defaultn0nVrN.id,
 * });
 * ```
 *
 * ## Import
 *
 * Click House Enterprise Db Cluster Security I P can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:clickhouseenterprisedbcluster/securityIp:SecurityIp example <db_instance_id>:<group_name>
 * ```
 */
export class SecurityIp extends pulumi.CustomResource {
    /**
     * Get an existing SecurityIp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityIpState, opts?: pulumi.CustomResourceOptions): SecurityIp {
        return new SecurityIp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:clickhouseenterprisedbcluster/securityIp:SecurityIp';

    /**
     * Returns true if the given object is an instance of SecurityIp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecurityIp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecurityIp.__pulumiType;
    }

    /**
     * The cluster ID.
     */
    public readonly dbInstanceId!: pulumi.Output<string>;
    /**
     * The whitelist name.
     */
    public readonly groupName!: pulumi.Output<string>;
    /**
     * The IP address list under the whitelist group.
     */
    public readonly securityIpList!: pulumi.Output<string>;

    /**
     * Create a SecurityIp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecurityIpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecurityIpArgs | SecurityIpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecurityIpState | undefined;
            resourceInputs["dbInstanceId"] = state ? state.dbInstanceId : undefined;
            resourceInputs["groupName"] = state ? state.groupName : undefined;
            resourceInputs["securityIpList"] = state ? state.securityIpList : undefined;
        } else {
            const args = argsOrState as SecurityIpArgs | undefined;
            if ((!args || args.dbInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbInstanceId'");
            }
            if ((!args || args.groupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupName'");
            }
            if ((!args || args.securityIpList === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityIpList'");
            }
            resourceInputs["dbInstanceId"] = args ? args.dbInstanceId : undefined;
            resourceInputs["groupName"] = args ? args.groupName : undefined;
            resourceInputs["securityIpList"] = args ? args.securityIpList : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecurityIp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecurityIp resources.
 */
export interface SecurityIpState {
    /**
     * The cluster ID.
     */
    dbInstanceId?: pulumi.Input<string>;
    /**
     * The whitelist name.
     */
    groupName?: pulumi.Input<string>;
    /**
     * The IP address list under the whitelist group.
     */
    securityIpList?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecurityIp resource.
 */
export interface SecurityIpArgs {
    /**
     * The cluster ID.
     */
    dbInstanceId: pulumi.Input<string>;
    /**
     * The whitelist name.
     */
    groupName: pulumi.Input<string>;
    /**
     * The IP address list under the whitelist group.
     */
    securityIpList: pulumi.Input<string>;
}
