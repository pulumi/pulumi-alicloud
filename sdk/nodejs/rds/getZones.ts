// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides availability zones for RDS that can be accessed by an Alibaba Cloud account within the region configured in the provider.
 *
 * > **NOTE:** Available since v1.73.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.rds.getZones({
 *     engine: "MySQL",
 *     engineVersion: "8.0",
 *     instanceChargeType: "PostPaid",
 *     category: "Basic",
 *     dbInstanceStorageType: "cloud_essd",
 * });
 * ```
 */
export function getZones(args?: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:rds/getZones:getZones", {
        "category": args.category,
        "dbInstanceStorageType": args.dbInstanceStorageType,
        "engine": args.engine,
        "engineVersion": args.engineVersion,
        "instanceChargeType": args.instanceChargeType,
        "multi": args.multi,
        "multiZone": args.multiZone,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    /**
     * DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`, `serverlessBasic`, `serverlessStandard`, `serverlessHa`, `cluster`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
     */
    category?: string;
    /**
     * The DB instance storage space required by the user. Valid values: "cloudSsd", "localSsd", "cloudEssd", "cloudEssd2", "cloudEssd3".
     */
    dbInstanceStorageType?: string;
    /**
     * Database type. Valid values: "MySQL", "SQLServer", "PostgreSQL", "MariaDB". If not set, it will match all of engines.
     */
    engine?: string;
    /**
     * Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
     */
    engineVersion?: string;
    /**
     * Filter the results by a specific instance charge type. Valid values: `PrePaid` and `PostPaid` and `Serverless`. Default to `PostPaid`.
     */
    instanceChargeType?: string;
    /**
     * It has been deprecated from version 1.137.0 and using `multiZone` instead.
     *
     * @deprecated It has been deprecated from version 1.137.0 and using `multiZone` instead.
     */
    multi?: boolean;
    /**
     * Indicate whether the zones can be used in a multi AZ configuration. Default to `false`. Multi AZ is usually used to launch RDS instances.
     */
    multiZone?: boolean;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getZones.
 */
export interface GetZonesResult {
    readonly category?: string;
    readonly dbInstanceStorageType?: string;
    readonly engine?: string;
    readonly engineVersion?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of zone IDs.
     */
    readonly ids: string[];
    readonly instanceChargeType?: string;
    /**
     * @deprecated It has been deprecated from version 1.137.0 and using `multiZone` instead.
     */
    readonly multi?: boolean;
    readonly multiZone?: boolean;
    readonly outputFile?: string;
    /**
     * A list of availability zones. Each element contains the following attributes:
     */
    readonly zones: outputs.rds.GetZonesZone[];
}
/**
 * This data source provides availability zones for RDS that can be accessed by an Alibaba Cloud account within the region configured in the provider.
 *
 * > **NOTE:** Available since v1.73.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.rds.getZones({
 *     engine: "MySQL",
 *     engineVersion: "8.0",
 *     instanceChargeType: "PostPaid",
 *     category: "Basic",
 *     dbInstanceStorageType: "cloud_essd",
 * });
 * ```
 */
export function getZonesOutput(args?: GetZonesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetZonesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:rds/getZones:getZones", {
        "category": args.category,
        "dbInstanceStorageType": args.dbInstanceStorageType,
        "engine": args.engine,
        "engineVersion": args.engineVersion,
        "instanceChargeType": args.instanceChargeType,
        "multi": args.multi,
        "multiZone": args.multiZone,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesOutputArgs {
    /**
     * DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`, `serverlessBasic`, `serverlessStandard`, `serverlessHa`, `cluster`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
     */
    category?: pulumi.Input<string>;
    /**
     * The DB instance storage space required by the user. Valid values: "cloudSsd", "localSsd", "cloudEssd", "cloudEssd2", "cloudEssd3".
     */
    dbInstanceStorageType?: pulumi.Input<string>;
    /**
     * Database type. Valid values: "MySQL", "SQLServer", "PostgreSQL", "MariaDB". If not set, it will match all of engines.
     */
    engine?: pulumi.Input<string>;
    /**
     * Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
     */
    engineVersion?: pulumi.Input<string>;
    /**
     * Filter the results by a specific instance charge type. Valid values: `PrePaid` and `PostPaid` and `Serverless`. Default to `PostPaid`.
     */
    instanceChargeType?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.137.0 and using `multiZone` instead.
     *
     * @deprecated It has been deprecated from version 1.137.0 and using `multiZone` instead.
     */
    multi?: pulumi.Input<boolean>;
    /**
     * Indicate whether the zones can be used in a multi AZ configuration. Default to `false`. Multi AZ is usually used to launch RDS instances.
     */
    multiZone?: pulumi.Input<boolean>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
