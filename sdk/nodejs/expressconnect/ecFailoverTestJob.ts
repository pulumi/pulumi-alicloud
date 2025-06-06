// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Express Connect Ec Failover Test Job resource. Express Connect Failover Test Job.
 *
 * For information about Express Connect Ec Failover Test Job and how to use it, see [What is Ec Failover Test Job](https://www.alibabacloud.com/help/zh/express-connect/developer-reference/api-vpc-2016-04-28-createfailovertestjob-efficiency-channels).
 *
 * > **NOTE:** Available since v1.215.0.
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
 * const _default = alicloud.expressconnect.getPhysicalConnections({
 *     nameRegex: "preserved-NODELETING",
 * });
 * const defaultEcFailoverTestJob = new alicloud.expressconnect.EcFailoverTestJob("default", {
 *     description: name,
 *     jobType: "StartNow",
 *     resourceIds: [
 *         _default.then(_default => _default.ids?.[0]),
 *         _default.then(_default => _default.ids?.[1]),
 *     ],
 *     jobDuration: 1,
 *     resourceType: "PHYSICALCONNECTION",
 *     ecFailoverTestJobName: name,
 * });
 * ```
 *
 * ## Import
 *
 * Express Connect Ec Failover Test Job can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:expressconnect/ecFailoverTestJob:EcFailoverTestJob example <id>
 * ```
 */
export class EcFailoverTestJob extends pulumi.CustomResource {
    /**
     * Get an existing EcFailoverTestJob resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EcFailoverTestJobState, opts?: pulumi.CustomResourceOptions): EcFailoverTestJob {
        return new EcFailoverTestJob(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:expressconnect/ecFailoverTestJob:EcFailoverTestJob';

    /**
     * Returns true if the given object is an instance of EcFailoverTestJob.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EcFailoverTestJob {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EcFailoverTestJob.__pulumiType;
    }

    /**
     * Job description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Job name.
     */
    public readonly ecFailoverTestJobName!: pulumi.Output<string | undefined>;
    /**
     * Job duration.
     */
    public readonly jobDuration!: pulumi.Output<number>;
    /**
     * Job type.
     */
    public readonly jobType!: pulumi.Output<string>;
    /**
     * Resource id list.
     */
    public readonly resourceIds!: pulumi.Output<string[]>;
    /**
     * Resource type.
     */
    public readonly resourceType!: pulumi.Output<string>;
    /**
     * The status of the resource.
     */
    public readonly status!: pulumi.Output<string>;

    /**
     * Create a EcFailoverTestJob resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EcFailoverTestJobArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EcFailoverTestJobArgs | EcFailoverTestJobState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EcFailoverTestJobState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["ecFailoverTestJobName"] = state ? state.ecFailoverTestJobName : undefined;
            resourceInputs["jobDuration"] = state ? state.jobDuration : undefined;
            resourceInputs["jobType"] = state ? state.jobType : undefined;
            resourceInputs["resourceIds"] = state ? state.resourceIds : undefined;
            resourceInputs["resourceType"] = state ? state.resourceType : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as EcFailoverTestJobArgs | undefined;
            if ((!args || args.jobDuration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'jobDuration'");
            }
            if ((!args || args.jobType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'jobType'");
            }
            if ((!args || args.resourceIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceIds'");
            }
            if ((!args || args.resourceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceType'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["ecFailoverTestJobName"] = args ? args.ecFailoverTestJobName : undefined;
            resourceInputs["jobDuration"] = args ? args.jobDuration : undefined;
            resourceInputs["jobType"] = args ? args.jobType : undefined;
            resourceInputs["resourceIds"] = args ? args.resourceIds : undefined;
            resourceInputs["resourceType"] = args ? args.resourceType : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EcFailoverTestJob.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EcFailoverTestJob resources.
 */
export interface EcFailoverTestJobState {
    /**
     * Job description.
     */
    description?: pulumi.Input<string>;
    /**
     * Job name.
     */
    ecFailoverTestJobName?: pulumi.Input<string>;
    /**
     * Job duration.
     */
    jobDuration?: pulumi.Input<number>;
    /**
     * Job type.
     */
    jobType?: pulumi.Input<string>;
    /**
     * Resource id list.
     */
    resourceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Resource type.
     */
    resourceType?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EcFailoverTestJob resource.
 */
export interface EcFailoverTestJobArgs {
    /**
     * Job description.
     */
    description?: pulumi.Input<string>;
    /**
     * Job name.
     */
    ecFailoverTestJobName?: pulumi.Input<string>;
    /**
     * Job duration.
     */
    jobDuration: pulumi.Input<number>;
    /**
     * Job type.
     */
    jobType: pulumi.Input<string>;
    /**
     * Resource id list.
     */
    resourceIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Resource type.
     */
    resourceType: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
}
