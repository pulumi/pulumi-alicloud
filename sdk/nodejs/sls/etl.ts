// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Log Service (SLS) Etl resource.
 *
 * For information about Log Service (SLS) Etl and how to use it, see [What is Etl](https://next.api.alibabacloud.com/document/Sls/2020-12-30/CreateETL).
 *
 * > **NOTE:** Available since v1.248.0.
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
 * const defaulthhAPo6 = new alicloud.log.Project("defaulthhAPo6", {
 *     description: "terraform-etl-example-813",
 *     projectName: "terraform-etl-example-330",
 * });
 * const defaultzWKLkp = new alicloud.log.Store("defaultzWKLkp", {
 *     hotTtl: 8,
 *     retentionPeriod: 30,
 *     shardCount: 2,
 *     projectName: defaulthhAPo6.id,
 *     logstoreName: "example",
 * });
 * const _default = new alicloud.sls.Etl("default", {
 *     project: defaulthhAPo6.id,
 *     description: "etl-1740472705-185721",
 *     configuration: {
 *         script: "* | extend a=1",
 *         lang: "SPL",
 *         roleArn: name,
 *         sinks: [{
 *             name: "11111",
 *             endpoint: "cn-hangzhou-intranet.log.aliyuncs.com",
 *             project: "gy-hangzhou-huolang-1",
 *             logstore: "gy-rm2",
 *             datasets: ["__UNNAMED__"],
 *             roleArn: name,
 *         }],
 *         logstore: defaultzWKLkp.logstoreName,
 *         fromTime: 1706771697,
 *         toTime: 1738394097,
 *     },
 *     jobName: "etl-1740472705-185721",
 *     displayName: "etl-1740472705-185721",
 * });
 * ```
 *
 * ## Import
 *
 * Log Service (SLS) Etl can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:sls/etl:Etl example <project>:<job_name>
 * ```
 */
export class Etl extends pulumi.CustomResource {
    /**
     * Get an existing Etl resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EtlState, opts?: pulumi.CustomResourceOptions): Etl {
        return new Etl(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:sls/etl:Etl';

    /**
     * Returns true if the given object is an instance of Etl.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Etl {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Etl.__pulumiType;
    }

    /**
     * The ETL configuration. See `configuration` below.
     */
    public readonly configuration!: pulumi.Output<outputs.sls.EtlConfiguration>;
    /**
     * The time when the data transformation job was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<number>;
    /**
     * Data Processing Task Description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Data processing task display name.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Unique identification of data processing task.
     */
    public readonly jobName!: pulumi.Output<string>;
    /**
     * Project Name.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The status of the data transformation job.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a Etl resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EtlArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EtlArgs | EtlState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EtlState | undefined;
            resourceInputs["configuration"] = state ? state.configuration : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["jobName"] = state ? state.jobName : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as EtlArgs | undefined;
            if ((!args || args.configuration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configuration'");
            }
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.jobName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'jobName'");
            }
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            resourceInputs["configuration"] = args ? args.configuration : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["jobName"] = args ? args.jobName : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Etl.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Etl resources.
 */
export interface EtlState {
    /**
     * The ETL configuration. See `configuration` below.
     */
    configuration?: pulumi.Input<inputs.sls.EtlConfiguration>;
    /**
     * The time when the data transformation job was created.
     */
    createTime?: pulumi.Input<number>;
    /**
     * Data Processing Task Description.
     */
    description?: pulumi.Input<string>;
    /**
     * Data processing task display name.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Unique identification of data processing task.
     */
    jobName?: pulumi.Input<string>;
    /**
     * Project Name.
     */
    project?: pulumi.Input<string>;
    /**
     * The status of the data transformation job.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Etl resource.
 */
export interface EtlArgs {
    /**
     * The ETL configuration. See `configuration` below.
     */
    configuration: pulumi.Input<inputs.sls.EtlConfiguration>;
    /**
     * Data Processing Task Description.
     */
    description?: pulumi.Input<string>;
    /**
     * Data processing task display name.
     */
    displayName: pulumi.Input<string>;
    /**
     * Unique identification of data processing task.
     */
    jobName: pulumi.Input<string>;
    /**
     * Project Name.
     */
    project: pulumi.Input<string>;
}
