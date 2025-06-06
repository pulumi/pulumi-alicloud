// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Data Works Data Source resource.
 *
 * For information about Data Works Data Source and how to use it, see [What is Data Source](https://www.alibabacloud.com/help/en/dataworks/developer-reference/api-dataworks-public-2024-05-18-createdatasource).
 *
 * > **NOTE:** Available since v1.237.0.
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
 * const name = config.get("name") || "tf_example";
 * const randint = new random.index.Integer("randint", {
 *     max: 999,
 *     min: 1,
 * });
 * const _default = alicloud.resourcemanager.getResourceGroups({});
 * const defaultkguw4R = new alicloud.dataworks.Project("defaultkguw4R", {
 *     status: "Available",
 *     description: "tf_desc",
 *     projectName: `${name}${randint.id}`,
 *     paiTaskEnabled: false,
 *     displayName: "tf_new_api_display",
 *     devRoleDisabled: true,
 *     devEnvironmentEnabled: false,
 *     resourceGroupId: _default.then(_default => _default.ids?.[0]),
 * });
 * const defaultDataSource = new alicloud.dataworks.DataSource("default", {
 *     type: "hive",
 *     dataSourceName: name,
 *     connectionProperties: JSON.stringify({
 *         address: [{
 *             host: "127.0.0.1",
 *             port: "1234",
 *         }],
 *         database: "hive_database",
 *         metaType: "HiveMetastore",
 *         metastoreUris: "thrift://123:123",
 *         version: "2.3.9",
 *         loginMode: "Anonymous",
 *         securityProtocol: "authTypeNone",
 *         envType: "Prod",
 *         properties: {
 *             key1: "value1",
 *         },
 *     }),
 *     connectionPropertiesMode: "UrlMode",
 *     projectId: defaultkguw4R.id,
 *     description: name,
 * });
 * ```
 *
 * ## Import
 *
 * Data Works Data Source can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:dataworks/dataSource:DataSource example <project_id>:<data_source_id>
 * ```
 */
export class DataSource extends pulumi.CustomResource {
    /**
     * Get an existing DataSource resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DataSourceState, opts?: pulumi.CustomResourceOptions): DataSource {
        return new DataSource(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:dataworks/dataSource:DataSource';

    /**
     * Returns true if the given object is an instance of DataSource.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DataSource {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DataSource.__pulumiType;
    }

    /**
     * Data source connection configuration information, including the connection address, access identity, and environment information. The data source environment EnvType information is a member property of this object, including DEV (Development Environment) and PROD (production environment). The value of EnvType is not case-sensitive.
     */
    public readonly connectionProperties!: pulumi.Output<string>;
    /**
     * The configuration mode of the data source. Different types of data sources have different configuration modes. For example, MySQL data sources support UrlMode and InstanceMode.
     */
    public readonly connectionPropertiesMode!: pulumi.Output<string>;
    /**
     * The creation time of the resource
     */
    public /*out*/ readonly createTime!: pulumi.Output<number>;
    /**
     * Creator of the data source
     */
    public /*out*/ readonly createUser!: pulumi.Output<string>;
    /**
     * The first ID of the resource
     */
    public /*out*/ readonly dataSourceId!: pulumi.Output<number>;
    /**
     * The data source name. The name of a data source in a specific environment (development environment or production environment) is unique in a project.
     */
    public readonly dataSourceName!: pulumi.Output<string>;
    /**
     * Description of the data source
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Modification time
     */
    public /*out*/ readonly modifyTime!: pulumi.Output<number>;
    /**
     * Modifier of the data source
     */
    public /*out*/ readonly modifyUser!: pulumi.Output<string>;
    /**
     * The ID of the project to which the data source belongs.
     */
    public readonly projectId!: pulumi.Output<number>;
    /**
     * Business Unique Key of Data Source
     */
    public /*out*/ readonly qualifiedName!: pulumi.Output<string>;
    /**
     * The type of data source. For a list of data source types, see the values listed in the API documentation.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a DataSource resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DataSourceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DataSourceArgs | DataSourceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DataSourceState | undefined;
            resourceInputs["connectionProperties"] = state ? state.connectionProperties : undefined;
            resourceInputs["connectionPropertiesMode"] = state ? state.connectionPropertiesMode : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["createUser"] = state ? state.createUser : undefined;
            resourceInputs["dataSourceId"] = state ? state.dataSourceId : undefined;
            resourceInputs["dataSourceName"] = state ? state.dataSourceName : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["modifyTime"] = state ? state.modifyTime : undefined;
            resourceInputs["modifyUser"] = state ? state.modifyUser : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["qualifiedName"] = state ? state.qualifiedName : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as DataSourceArgs | undefined;
            if ((!args || args.connectionProperties === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionProperties'");
            }
            if ((!args || args.connectionPropertiesMode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionPropertiesMode'");
            }
            if ((!args || args.dataSourceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataSourceName'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["connectionProperties"] = args?.connectionProperties ? pulumi.secret(args.connectionProperties) : undefined;
            resourceInputs["connectionPropertiesMode"] = args ? args.connectionPropertiesMode : undefined;
            resourceInputs["dataSourceName"] = args ? args.dataSourceName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["createUser"] = undefined /*out*/;
            resourceInputs["dataSourceId"] = undefined /*out*/;
            resourceInputs["modifyTime"] = undefined /*out*/;
            resourceInputs["modifyUser"] = undefined /*out*/;
            resourceInputs["qualifiedName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["connectionProperties"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(DataSource.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DataSource resources.
 */
export interface DataSourceState {
    /**
     * Data source connection configuration information, including the connection address, access identity, and environment information. The data source environment EnvType information is a member property of this object, including DEV (Development Environment) and PROD (production environment). The value of EnvType is not case-sensitive.
     */
    connectionProperties?: pulumi.Input<string>;
    /**
     * The configuration mode of the data source. Different types of data sources have different configuration modes. For example, MySQL data sources support UrlMode and InstanceMode.
     */
    connectionPropertiesMode?: pulumi.Input<string>;
    /**
     * The creation time of the resource
     */
    createTime?: pulumi.Input<number>;
    /**
     * Creator of the data source
     */
    createUser?: pulumi.Input<string>;
    /**
     * The first ID of the resource
     */
    dataSourceId?: pulumi.Input<number>;
    /**
     * The data source name. The name of a data source in a specific environment (development environment or production environment) is unique in a project.
     */
    dataSourceName?: pulumi.Input<string>;
    /**
     * Description of the data source
     */
    description?: pulumi.Input<string>;
    /**
     * Modification time
     */
    modifyTime?: pulumi.Input<number>;
    /**
     * Modifier of the data source
     */
    modifyUser?: pulumi.Input<string>;
    /**
     * The ID of the project to which the data source belongs.
     */
    projectId?: pulumi.Input<number>;
    /**
     * Business Unique Key of Data Source
     */
    qualifiedName?: pulumi.Input<string>;
    /**
     * The type of data source. For a list of data source types, see the values listed in the API documentation.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DataSource resource.
 */
export interface DataSourceArgs {
    /**
     * Data source connection configuration information, including the connection address, access identity, and environment information. The data source environment EnvType information is a member property of this object, including DEV (Development Environment) and PROD (production environment). The value of EnvType is not case-sensitive.
     */
    connectionProperties: pulumi.Input<string>;
    /**
     * The configuration mode of the data source. Different types of data sources have different configuration modes. For example, MySQL data sources support UrlMode and InstanceMode.
     */
    connectionPropertiesMode: pulumi.Input<string>;
    /**
     * The data source name. The name of a data source in a specific environment (development environment or production environment) is unique in a project.
     */
    dataSourceName: pulumi.Input<string>;
    /**
     * Description of the data source
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the project to which the data source belongs.
     */
    projectId: pulumi.Input<number>;
    /**
     * The type of data source. For a list of data source types, see the values listed in the API documentation.
     */
    type: pulumi.Input<string>;
}
