import * as pulumi from "@pulumi/pulumi";
/**
 * The Instances data source list ECS instance resources according to their ID, name regex, image id, status and other fields.
 */
export declare function getInstances(args?: GetInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstancesResult>;
/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesArgs {
    /**
     * Availability zone where instances are located.
     */
    readonly availabilityZone?: string;
    /**
     * A list of ECS instance IDs.
     */
    readonly ids?: string[];
    /**
     * The image ID of some ECS instance used.
     */
    readonly imageId?: string;
    /**
     * A regex string to filter results by instance name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Instance status. Valid values: "Creating", "Starting", "Running", "Stopping" and "Stopped". If undefined, all statuses are considered.
     */
    readonly status?: string;
    /**
     * A map of tags assigned to the ECS instances. It must be in the format:
     * ```
     * data "alicloud_instances" "taggedInstances" {
     * tags = {
     * tagKey1 = "tagValue1",
     * tagKey2 = "tagValue2"
     * }
     * }
     * ```
     */
    readonly tags?: {
        [key: string]: any;
    };
    /**
     * ID of the VPC linked to the instances.
     */
    readonly vpcId?: string;
    /**
     * ID of the VSwitch linked to the instances.
     */
    readonly vswitchId?: string;
}
/**
 * A collection of values returned by getInstances.
 */
export interface GetInstancesResult {
    /**
     * A list of instances. Each element contains the following attributes:
     */
    readonly instances: {
        availabilityZone: string;
        creationTime: string;
        description: string;
        diskDeviceMappings: {
            category: string;
            device: string;
            size: number;
            type: string;
        }[];
        eip: string;
        id: string;
        imageId: string;
        instanceChargeType: string;
        instanceType: string;
        internetChargeType: string;
        internetMaxBandwidthOut: number;
        keyName: string;
        name: string;
        privateIp: string;
        publicIp: string;
        regionId: string;
        securityGroups: string[];
        spotStrategy: string;
        status: string;
        tags?: {
            [key: string]: any;
        };
        vpcId: string;
        vswitchId: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
