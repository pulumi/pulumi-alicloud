// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a AnalyticDB for PostgreSQL (GPDB) DB Instance Plan resource.
 *
 * For information about AnalyticDB for PostgreSQL (GPDB) DB Instance Plan and how to use it, see [What is DB Instance Plan](https://www.alibabacloud.com/help/en/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-createdbinstanceplan).
 *
 * > **NOTE:** Available since v1.189.0.
 *
 * ## Import
 *
 * GPDB DB Instance Plan can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:gpdb/dbInstancePlan:DbInstancePlan example <db_instance_id>:<plan_id>
 * ```
 */
export class DbInstancePlan extends pulumi.CustomResource {
    /**
     * Get an existing DbInstancePlan resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DbInstancePlanState, opts?: pulumi.CustomResourceOptions): DbInstancePlan {
        return new DbInstancePlan(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:gpdb/dbInstancePlan:DbInstancePlan';

    /**
     * Returns true if the given object is an instance of DbInstancePlan.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DbInstancePlan {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DbInstancePlan.__pulumiType;
    }

    /**
     * The ID of the GPDB instance.
     */
    public readonly dbInstanceId!: pulumi.Output<string>;
    /**
     * The name of the Plan.
     */
    public readonly dbInstancePlanName!: pulumi.Output<string>;
    /**
     * The execution information of the plan. See `planConfig` below.
     */
    public readonly planConfigs!: pulumi.Output<outputs.gpdb.DbInstancePlanPlanConfig[]>;
    /**
     * The description of the Plan.
     */
    public readonly planDesc!: pulumi.Output<string | undefined>;
    /**
     * The end time of the Plan.
     */
    public readonly planEndDate!: pulumi.Output<string | undefined>;
    /**
     * The ID of the plan.
     */
    public /*out*/ readonly planId!: pulumi.Output<string>;
    /**
     * The execution mode of the plan. Valid values: `Postpone`, `Regular`.
     */
    public readonly planScheduleType!: pulumi.Output<string>;
    /**
     * The start time of the Plan.
     */
    public readonly planStartDate!: pulumi.Output<string>;
    /**
     * The type of the Plan. Valid values: `PauseResume`, `Resize`.
     */
    public readonly planType!: pulumi.Output<string>;
    /**
     * The Status of the Plan. Valid values: `active`, `cancel`.
     */
    public readonly status!: pulumi.Output<string>;

    /**
     * Create a DbInstancePlan resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DbInstancePlanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DbInstancePlanArgs | DbInstancePlanState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DbInstancePlanState | undefined;
            resourceInputs["dbInstanceId"] = state ? state.dbInstanceId : undefined;
            resourceInputs["dbInstancePlanName"] = state ? state.dbInstancePlanName : undefined;
            resourceInputs["planConfigs"] = state ? state.planConfigs : undefined;
            resourceInputs["planDesc"] = state ? state.planDesc : undefined;
            resourceInputs["planEndDate"] = state ? state.planEndDate : undefined;
            resourceInputs["planId"] = state ? state.planId : undefined;
            resourceInputs["planScheduleType"] = state ? state.planScheduleType : undefined;
            resourceInputs["planStartDate"] = state ? state.planStartDate : undefined;
            resourceInputs["planType"] = state ? state.planType : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as DbInstancePlanArgs | undefined;
            if ((!args || args.dbInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbInstanceId'");
            }
            if ((!args || args.dbInstancePlanName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbInstancePlanName'");
            }
            if ((!args || args.planConfigs === undefined) && !opts.urn) {
                throw new Error("Missing required property 'planConfigs'");
            }
            if ((!args || args.planScheduleType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'planScheduleType'");
            }
            if ((!args || args.planType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'planType'");
            }
            resourceInputs["dbInstanceId"] = args ? args.dbInstanceId : undefined;
            resourceInputs["dbInstancePlanName"] = args ? args.dbInstancePlanName : undefined;
            resourceInputs["planConfigs"] = args ? args.planConfigs : undefined;
            resourceInputs["planDesc"] = args ? args.planDesc : undefined;
            resourceInputs["planEndDate"] = args ? args.planEndDate : undefined;
            resourceInputs["planScheduleType"] = args ? args.planScheduleType : undefined;
            resourceInputs["planStartDate"] = args ? args.planStartDate : undefined;
            resourceInputs["planType"] = args ? args.planType : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["planId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DbInstancePlan.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DbInstancePlan resources.
 */
export interface DbInstancePlanState {
    /**
     * The ID of the GPDB instance.
     */
    dbInstanceId?: pulumi.Input<string>;
    /**
     * The name of the Plan.
     */
    dbInstancePlanName?: pulumi.Input<string>;
    /**
     * The execution information of the plan. See `planConfig` below.
     */
    planConfigs?: pulumi.Input<pulumi.Input<inputs.gpdb.DbInstancePlanPlanConfig>[]>;
    /**
     * The description of the Plan.
     */
    planDesc?: pulumi.Input<string>;
    /**
     * The end time of the Plan.
     */
    planEndDate?: pulumi.Input<string>;
    /**
     * The ID of the plan.
     */
    planId?: pulumi.Input<string>;
    /**
     * The execution mode of the plan. Valid values: `Postpone`, `Regular`.
     */
    planScheduleType?: pulumi.Input<string>;
    /**
     * The start time of the Plan.
     */
    planStartDate?: pulumi.Input<string>;
    /**
     * The type of the Plan. Valid values: `PauseResume`, `Resize`.
     */
    planType?: pulumi.Input<string>;
    /**
     * The Status of the Plan. Valid values: `active`, `cancel`.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DbInstancePlan resource.
 */
export interface DbInstancePlanArgs {
    /**
     * The ID of the GPDB instance.
     */
    dbInstanceId: pulumi.Input<string>;
    /**
     * The name of the Plan.
     */
    dbInstancePlanName: pulumi.Input<string>;
    /**
     * The execution information of the plan. See `planConfig` below.
     */
    planConfigs: pulumi.Input<pulumi.Input<inputs.gpdb.DbInstancePlanPlanConfig>[]>;
    /**
     * The description of the Plan.
     */
    planDesc?: pulumi.Input<string>;
    /**
     * The end time of the Plan.
     */
    planEndDate?: pulumi.Input<string>;
    /**
     * The execution mode of the plan. Valid values: `Postpone`, `Regular`.
     */
    planScheduleType: pulumi.Input<string>;
    /**
     * The start time of the Plan.
     */
    planStartDate?: pulumi.Input<string>;
    /**
     * The type of the Plan. Valid values: `PauseResume`, `Resize`.
     */
    planType: pulumi.Input<string>;
    /**
     * The Status of the Plan. Valid values: `active`, `cancel`.
     */
    status?: pulumi.Input<string>;
}
