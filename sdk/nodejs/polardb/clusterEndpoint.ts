// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a PolarDB endpoint resource to manage cluster endpoint of PolarDB cluster.
 *
 * > **NOTE:** Available since v1.217.0
 *
 * > **NOTE:** The default cluster endpoint can not be created or deleted manually.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.polardb.getNodeClasses({
 *     dbType: "MySQL",
 *     dbVersion: "8.0",
 *     payType: "PostPaid",
 *     category: "Normal",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: "terraform-example",
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: _default.then(_default => _default.classes?.[0]?.zoneId),
 *     vswitchName: "terraform-example",
 * });
 * const defaultCluster = new alicloud.polardb.Cluster("default", {
 *     dbType: "MySQL",
 *     dbVersion: "8.0",
 *     dbNodeClass: _default.then(_default => _default.classes?.[0]?.supportedEngines?.[0]?.availableResources?.[0]?.dbNodeClass),
 *     payType: "PostPaid",
 *     vswitchId: defaultSwitch.id,
 *     description: "terraform-example",
 * });
 * const defaultClusterEndpoint = new alicloud.polardb.ClusterEndpoint("default", {dbClusterId: defaultCluster.id});
 * ```
 *
 * ## Import
 *
 * PolarDB endpoint can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:polardb/clusterEndpoint:ClusterEndpoint example pc-abc123456:pe-abc123456
 * ```
 */
export class ClusterEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing ClusterEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterEndpointState, opts?: pulumi.CustomResourceOptions): ClusterEndpoint {
        return new ClusterEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:polardb/clusterEndpoint:ClusterEndpoint';

    /**
     * Returns true if the given object is an instance of ClusterEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterEndpoint.__pulumiType;
    }

    /**
     * Whether the new node automatically joins the default cluster address. Valid values are `Enable`, `Disable`. When creating a new custom endpoint, default to `Disable`.
     */
    public readonly autoAddNewNodes!: pulumi.Output<string>;
    /**
     * Prefix of the specified endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter.
     */
    public readonly connectionPrefix!: pulumi.Output<string>;
    /**
     * The Id of cluster that can run database.
     */
    public readonly dbClusterId!: pulumi.Output<string>;
    /**
     * The name of the endpoint.
     */
    public readonly dbEndpointDescription!: pulumi.Output<string | undefined>;
    /**
     * The ID of the cluster endpoint.
     */
    public /*out*/ readonly dbEndpointId!: pulumi.Output<string>;
    /**
     * The advanced settings of the endpoint of Apsara PolarDB clusters are in JSON format. Including the settings of consistency level, transaction splitting, connection pool, and offload reads from primary node. For more details, see the [description of EndpointConfig in the Request parameters table for details](https://www.alibabacloud.com/help/doc-detail/116593.htm).
     */
    public readonly endpointConfig!: pulumi.Output<{[key: string]: string}>;
    /**
     * Type of endpoint.
     */
    public /*out*/ readonly endpointType!: pulumi.Output<string>;
    /**
     * The network type of the endpoint address.
     */
    public readonly netType!: pulumi.Output<string | undefined>;
    /**
     * Node id list for endpoint configuration. At least 2 nodes if specified, or if the cluster has more than 3 nodes, read-only endpoint is allowed to mount only one node. Default is all nodes.
     */
    public readonly nodes!: pulumi.Output<string[]>;
    /**
     * Port of the specified endpoint. Valid values: 3000 to 5999.
     */
    public readonly port!: pulumi.Output<string>;
    /**
     * Read or write mode. Valid values are `ReadWrite`, `ReadOnly`. When creating a new custom endpoint, default to `ReadOnly`.
     */
    public readonly readWriteMode!: pulumi.Output<string>;
    /**
     * Specifies whether automatic rotation of SSL certificates is enabled. Valid values: `Enable`,`Disable`.
     * **NOTE:** For a PolarDB for MySQL cluster, this parameter is required, and only one connection string in each endpoint can enable the ssl, for other notes, see [Configure SSL encryption](https://www.alibabacloud.com/help/doc-detail/153182.htm).
     * For a PolarDB for PostgreSQL cluster or a PolarDB-O cluster, this parameter is not required, by default, SSL encryption is enabled for all endpoints.
     */
    public readonly sslAutoRotate!: pulumi.Output<string | undefined>;
    /**
     * The specifies SSL certificate download link.
     */
    public /*out*/ readonly sslCertificateUrl!: pulumi.Output<string>;
    /**
     * The SSL connection string.
     */
    public /*out*/ readonly sslConnectionString!: pulumi.Output<string>;
    /**
     * Specifies how to modify the SSL encryption status. Valid values: `Disable`, `Enable`, `Update`.
     */
    public readonly sslEnabled!: pulumi.Output<string | undefined>;
    /**
     * The time when the SSL certificate expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     */
    public /*out*/ readonly sslExpireTime!: pulumi.Output<string>;

    /**
     * Create a ClusterEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterEndpointArgs | ClusterEndpointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterEndpointState | undefined;
            resourceInputs["autoAddNewNodes"] = state ? state.autoAddNewNodes : undefined;
            resourceInputs["connectionPrefix"] = state ? state.connectionPrefix : undefined;
            resourceInputs["dbClusterId"] = state ? state.dbClusterId : undefined;
            resourceInputs["dbEndpointDescription"] = state ? state.dbEndpointDescription : undefined;
            resourceInputs["dbEndpointId"] = state ? state.dbEndpointId : undefined;
            resourceInputs["endpointConfig"] = state ? state.endpointConfig : undefined;
            resourceInputs["endpointType"] = state ? state.endpointType : undefined;
            resourceInputs["netType"] = state ? state.netType : undefined;
            resourceInputs["nodes"] = state ? state.nodes : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["readWriteMode"] = state ? state.readWriteMode : undefined;
            resourceInputs["sslAutoRotate"] = state ? state.sslAutoRotate : undefined;
            resourceInputs["sslCertificateUrl"] = state ? state.sslCertificateUrl : undefined;
            resourceInputs["sslConnectionString"] = state ? state.sslConnectionString : undefined;
            resourceInputs["sslEnabled"] = state ? state.sslEnabled : undefined;
            resourceInputs["sslExpireTime"] = state ? state.sslExpireTime : undefined;
        } else {
            const args = argsOrState as ClusterEndpointArgs | undefined;
            if ((!args || args.dbClusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbClusterId'");
            }
            resourceInputs["autoAddNewNodes"] = args ? args.autoAddNewNodes : undefined;
            resourceInputs["connectionPrefix"] = args ? args.connectionPrefix : undefined;
            resourceInputs["dbClusterId"] = args ? args.dbClusterId : undefined;
            resourceInputs["dbEndpointDescription"] = args ? args.dbEndpointDescription : undefined;
            resourceInputs["endpointConfig"] = args ? args.endpointConfig : undefined;
            resourceInputs["netType"] = args ? args.netType : undefined;
            resourceInputs["nodes"] = args ? args.nodes : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["readWriteMode"] = args ? args.readWriteMode : undefined;
            resourceInputs["sslAutoRotate"] = args ? args.sslAutoRotate : undefined;
            resourceInputs["sslEnabled"] = args ? args.sslEnabled : undefined;
            resourceInputs["dbEndpointId"] = undefined /*out*/;
            resourceInputs["endpointType"] = undefined /*out*/;
            resourceInputs["sslCertificateUrl"] = undefined /*out*/;
            resourceInputs["sslConnectionString"] = undefined /*out*/;
            resourceInputs["sslExpireTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClusterEndpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterEndpoint resources.
 */
export interface ClusterEndpointState {
    /**
     * Whether the new node automatically joins the default cluster address. Valid values are `Enable`, `Disable`. When creating a new custom endpoint, default to `Disable`.
     */
    autoAddNewNodes?: pulumi.Input<string>;
    /**
     * Prefix of the specified endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter.
     */
    connectionPrefix?: pulumi.Input<string>;
    /**
     * The Id of cluster that can run database.
     */
    dbClusterId?: pulumi.Input<string>;
    /**
     * The name of the endpoint.
     */
    dbEndpointDescription?: pulumi.Input<string>;
    /**
     * The ID of the cluster endpoint.
     */
    dbEndpointId?: pulumi.Input<string>;
    /**
     * The advanced settings of the endpoint of Apsara PolarDB clusters are in JSON format. Including the settings of consistency level, transaction splitting, connection pool, and offload reads from primary node. For more details, see the [description of EndpointConfig in the Request parameters table for details](https://www.alibabacloud.com/help/doc-detail/116593.htm).
     */
    endpointConfig?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of endpoint.
     */
    endpointType?: pulumi.Input<string>;
    /**
     * The network type of the endpoint address.
     */
    netType?: pulumi.Input<string>;
    /**
     * Node id list for endpoint configuration. At least 2 nodes if specified, or if the cluster has more than 3 nodes, read-only endpoint is allowed to mount only one node. Default is all nodes.
     */
    nodes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Port of the specified endpoint. Valid values: 3000 to 5999.
     */
    port?: pulumi.Input<string>;
    /**
     * Read or write mode. Valid values are `ReadWrite`, `ReadOnly`. When creating a new custom endpoint, default to `ReadOnly`.
     */
    readWriteMode?: pulumi.Input<string>;
    /**
     * Specifies whether automatic rotation of SSL certificates is enabled. Valid values: `Enable`,`Disable`.
     * **NOTE:** For a PolarDB for MySQL cluster, this parameter is required, and only one connection string in each endpoint can enable the ssl, for other notes, see [Configure SSL encryption](https://www.alibabacloud.com/help/doc-detail/153182.htm).
     * For a PolarDB for PostgreSQL cluster or a PolarDB-O cluster, this parameter is not required, by default, SSL encryption is enabled for all endpoints.
     */
    sslAutoRotate?: pulumi.Input<string>;
    /**
     * The specifies SSL certificate download link.
     */
    sslCertificateUrl?: pulumi.Input<string>;
    /**
     * The SSL connection string.
     */
    sslConnectionString?: pulumi.Input<string>;
    /**
     * Specifies how to modify the SSL encryption status. Valid values: `Disable`, `Enable`, `Update`.
     */
    sslEnabled?: pulumi.Input<string>;
    /**
     * The time when the SSL certificate expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     */
    sslExpireTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ClusterEndpoint resource.
 */
export interface ClusterEndpointArgs {
    /**
     * Whether the new node automatically joins the default cluster address. Valid values are `Enable`, `Disable`. When creating a new custom endpoint, default to `Disable`.
     */
    autoAddNewNodes?: pulumi.Input<string>;
    /**
     * Prefix of the specified endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter.
     */
    connectionPrefix?: pulumi.Input<string>;
    /**
     * The Id of cluster that can run database.
     */
    dbClusterId: pulumi.Input<string>;
    /**
     * The name of the endpoint.
     */
    dbEndpointDescription?: pulumi.Input<string>;
    /**
     * The advanced settings of the endpoint of Apsara PolarDB clusters are in JSON format. Including the settings of consistency level, transaction splitting, connection pool, and offload reads from primary node. For more details, see the [description of EndpointConfig in the Request parameters table for details](https://www.alibabacloud.com/help/doc-detail/116593.htm).
     */
    endpointConfig?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The network type of the endpoint address.
     */
    netType?: pulumi.Input<string>;
    /**
     * Node id list for endpoint configuration. At least 2 nodes if specified, or if the cluster has more than 3 nodes, read-only endpoint is allowed to mount only one node. Default is all nodes.
     */
    nodes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Port of the specified endpoint. Valid values: 3000 to 5999.
     */
    port?: pulumi.Input<string>;
    /**
     * Read or write mode. Valid values are `ReadWrite`, `ReadOnly`. When creating a new custom endpoint, default to `ReadOnly`.
     */
    readWriteMode?: pulumi.Input<string>;
    /**
     * Specifies whether automatic rotation of SSL certificates is enabled. Valid values: `Enable`,`Disable`.
     * **NOTE:** For a PolarDB for MySQL cluster, this parameter is required, and only one connection string in each endpoint can enable the ssl, for other notes, see [Configure SSL encryption](https://www.alibabacloud.com/help/doc-detail/153182.htm).
     * For a PolarDB for PostgreSQL cluster or a PolarDB-O cluster, this parameter is not required, by default, SSL encryption is enabled for all endpoints.
     */
    sslAutoRotate?: pulumi.Input<string>;
    /**
     * Specifies how to modify the SSL encryption status. Valid values: `Disable`, `Enable`, `Update`.
     */
    sslEnabled?: pulumi.Input<string>;
}
