// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Ecs Capacity Reservation available to the user.
 *
 * > **NOTE:** Available in 1.195.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.ecs.getCapacityReservations({
 *     ids: [alicloud_ecs_capacity_reservation["default"].id],
 *     nameRegex: alicloud_ecs_capacity_reservation["default"].name,
 *     instanceType: "ecs.c6.large",
 *     platform: "linux",
 * });
 * export const alicloudEcsCapacityReservationExampleId = _default.then(_default => _default.reservations?.[0]?.id);
 * ```
 */
export function getCapacityReservations(args?: GetCapacityReservationsArgs, opts?: pulumi.InvokeOptions): Promise<GetCapacityReservationsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecs/getCapacityReservations:getCapacityReservations", {
        "capacityReservationIds": args.capacityReservationIds,
        "ids": args.ids,
        "instanceType": args.instanceType,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "paymentType": args.paymentType,
        "platform": args.platform,
        "resourceGroupId": args.resourceGroupId,
        "status": args.status,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getCapacityReservations.
 */
export interface GetCapacityReservationsArgs {
    capacityReservationIds?: string[];
    /**
     * A list of Capacity Reservation IDs.
     */
    ids?: string[];
    /**
     * Instance type. Currently, you can only set the capacity reservation service for one instance type.
     */
    instanceType?: string;
    /**
     * A regex string to filter results by Group Metric Rule name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The payment type of the resource. value range `PostPaid`, `PrePaid`.
     */
    paymentType?: string;
    /**
     * platform of the capacity reservation , value range `windows`, `linux`, `all`.
     */
    platform?: string;
    /**
     * The resource group id.
     */
    resourceGroupId?: string;
    /**
     * The status of the capacity reservation. value range `All`, `Pending`, `Preparing`, `Prepared`, `Active`, `Released`.
     */
    status?: string;
    /**
     * The tag of the resource.
     */
    tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getCapacityReservations.
 */
export interface GetCapacityReservationsResult {
    readonly capacityReservationIds?: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Capacity Reservation IDs.
     */
    readonly ids: string[];
    /**
     * Instance type. Currently, you can only set the capacity reservation service for one instance type.
     */
    readonly instanceType?: string;
    readonly nameRegex?: string;
    /**
     * A list of name of Capacity Reservations.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The payment type of the resource
     */
    readonly paymentType?: string;
    /**
     * platform of the capacity reservation.
     */
    readonly platform?: string;
    /**
     * A list of Capacity Reservation Entries. Each element contains the following attributes:
     */
    readonly reservations: outputs.ecs.GetCapacityReservationsReservation[];
    /**
     * The resource group id
     */
    readonly resourceGroupId?: string;
    /**
     * The status of the capacity reservation.
     */
    readonly status?: string;
    /**
     * A mapping of tags to assign to the Capacity Reservation.
     */
    readonly tags?: {[key: string]: any};
}
/**
 * This data source provides Ecs Capacity Reservation available to the user.
 *
 * > **NOTE:** Available in 1.195.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.ecs.getCapacityReservations({
 *     ids: [alicloud_ecs_capacity_reservation["default"].id],
 *     nameRegex: alicloud_ecs_capacity_reservation["default"].name,
 *     instanceType: "ecs.c6.large",
 *     platform: "linux",
 * });
 * export const alicloudEcsCapacityReservationExampleId = _default.then(_default => _default.reservations?.[0]?.id);
 * ```
 */
export function getCapacityReservationsOutput(args?: GetCapacityReservationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCapacityReservationsResult> {
    return pulumi.output(args).apply((a: any) => getCapacityReservations(a, opts))
}

/**
 * A collection of arguments for invoking getCapacityReservations.
 */
export interface GetCapacityReservationsOutputArgs {
    capacityReservationIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of Capacity Reservation IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Instance type. Currently, you can only set the capacity reservation service for one instance type.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Group Metric Rule name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The payment type of the resource. value range `PostPaid`, `PrePaid`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * platform of the capacity reservation , value range `windows`, `linux`, `all`.
     */
    platform?: pulumi.Input<string>;
    /**
     * The resource group id.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The status of the capacity reservation. value range `All`, `Pending`, `Preparing`, `Prepared`, `Active`, `Released`.
     */
    status?: pulumi.Input<string>;
    /**
     * The tag of the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}