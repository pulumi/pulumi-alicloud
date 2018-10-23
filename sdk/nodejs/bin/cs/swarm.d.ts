import * as pulumi from "@pulumi/pulumi";
/**
 * This resource will help you to manager a Swarm Cluster.
 *
 * -> **NOTE:** Swarm cluster only supports VPC network and you can specify a VPC network by filed `vswitch_id`.
 */
export declare class Swarm extends pulumi.CustomResource {
    /**
     * Get an existing Swarm resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SwarmState): Swarm;
    /**
     * The nodes agent version.
     */
    readonly agentVersion: pulumi.Output<string>;
    /**
     * The CIDR block for the Container. It can not be same as the CIDR used by the VPC.
     * Valid value:
     * - 192.168.0.0/16
     * - 172.19-30.0.0/16
     * - 10.0.0.0/16
     */
    readonly cidrBlock: pulumi.Output<string>;
    /**
     * The data disk category of ECS instance node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
     */
    readonly diskCategory: pulumi.Output<string | undefined>;
    /**
     * The data disk size of ECS instance node. Its valid value is 20~32768 GB. Default to 20.
     */
    readonly diskSize: pulumi.Output<number | undefined>;
    /**
     * The image ID of ECS instance node used. Default to System automate allocated.
     */
    readonly imageId: pulumi.Output<string | undefined>;
    /**
     * The type of ECS instance node.
     */
    readonly instanceType: pulumi.Output<string>;
    /**
     * Whether to use outdated instance type. Default to false.
     */
    readonly isOutdated: pulumi.Output<boolean | undefined>;
    /**
     * The container cluster's name. It is the only in one Alicloud account.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The container cluster name's prefix. It is conflict with `name`. If it is specified, terraform will using it to build the only cluster name. Default to 'Terraform-Creation'.
     */
    readonly namePrefix: pulumi.Output<string | undefined>;
    readonly needSlb: pulumi.Output<boolean | undefined>;
    /**
     * The ECS node number of the container cluster. Its value choices are 1~50, and default to 1.
     */
    readonly nodeNumber: pulumi.Output<number | undefined>;
    /**
     * List of cluster nodes. It contains several attributes to `Block Nodes`.
     */
    readonly nodes: pulumi.Output<{
        eip: string;
        id: string;
        name: string;
        privateIp: string;
        status: string;
    }[]>;
    /**
     * The password of ECS instance node.
     */
    readonly password: pulumi.Output<string>;
    /**
     * Whether to release EIP after creating swarm cluster successfully. Default to false.
     * * `need_slb`- Whether to create the default simple routing Server Load Balancer instance for the cluster. The default value is true.
     */
    readonly releaseEip: pulumi.Output<boolean | undefined>;
    /**
     * The ID of security group where the current cluster worker node is located.
     */
    readonly securityGroupId: pulumi.Output<string>;
    /**
     * Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.
     */
    readonly size: pulumi.Output<number | undefined>;
    /**
     * The ID of load balancer where the current cluster worker node is located.
     */
    readonly slbId: pulumi.Output<string>;
    /**
     * The ID of VPC where the current cluster is located.
     */
    readonly vpcId: pulumi.Output<string>;
    /**
     * The password of ECS instance node. If it is not specified, the container cluster's network mode will be `Classic`.
     */
    readonly vswitchId: pulumi.Output<string>;
    /**
     * Create a Swarm resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SwarmArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Swarm resources.
 */
export interface SwarmState {
    /**
     * The nodes agent version.
     */
    readonly agentVersion?: pulumi.Input<string>;
    /**
     * The CIDR block for the Container. It can not be same as the CIDR used by the VPC.
     * Valid value:
     * - 192.168.0.0/16
     * - 172.19-30.0.0/16
     * - 10.0.0.0/16
     */
    readonly cidrBlock?: pulumi.Input<string>;
    /**
     * The data disk category of ECS instance node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
     */
    readonly diskCategory?: pulumi.Input<string>;
    /**
     * The data disk size of ECS instance node. Its valid value is 20~32768 GB. Default to 20.
     */
    readonly diskSize?: pulumi.Input<number>;
    /**
     * The image ID of ECS instance node used. Default to System automate allocated.
     */
    readonly imageId?: pulumi.Input<string>;
    /**
     * The type of ECS instance node.
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * Whether to use outdated instance type. Default to false.
     */
    readonly isOutdated?: pulumi.Input<boolean>;
    /**
     * The container cluster's name. It is the only in one Alicloud account.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The container cluster name's prefix. It is conflict with `name`. If it is specified, terraform will using it to build the only cluster name. Default to 'Terraform-Creation'.
     */
    readonly namePrefix?: pulumi.Input<string>;
    readonly needSlb?: pulumi.Input<boolean>;
    /**
     * The ECS node number of the container cluster. Its value choices are 1~50, and default to 1.
     */
    readonly nodeNumber?: pulumi.Input<number>;
    /**
     * List of cluster nodes. It contains several attributes to `Block Nodes`.
     */
    readonly nodes?: pulumi.Input<pulumi.Input<{
        eip?: pulumi.Input<string>;
        id?: pulumi.Input<string>;
        name?: pulumi.Input<string>;
        privateIp?: pulumi.Input<string>;
        status?: pulumi.Input<string>;
    }>[]>;
    /**
     * The password of ECS instance node.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * Whether to release EIP after creating swarm cluster successfully. Default to false.
     * * `need_slb`- Whether to create the default simple routing Server Load Balancer instance for the cluster. The default value is true.
     */
    readonly releaseEip?: pulumi.Input<boolean>;
    /**
     * The ID of security group where the current cluster worker node is located.
     */
    readonly securityGroupId?: pulumi.Input<string>;
    /**
     * Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.
     */
    readonly size?: pulumi.Input<number>;
    /**
     * The ID of load balancer where the current cluster worker node is located.
     */
    readonly slbId?: pulumi.Input<string>;
    /**
     * The ID of VPC where the current cluster is located.
     */
    readonly vpcId?: pulumi.Input<string>;
    /**
     * The password of ECS instance node. If it is not specified, the container cluster's network mode will be `Classic`.
     */
    readonly vswitchId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Swarm resource.
 */
export interface SwarmArgs {
    /**
     * The CIDR block for the Container. It can not be same as the CIDR used by the VPC.
     * Valid value:
     * - 192.168.0.0/16
     * - 172.19-30.0.0/16
     * - 10.0.0.0/16
     */
    readonly cidrBlock: pulumi.Input<string>;
    /**
     * The data disk category of ECS instance node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
     */
    readonly diskCategory?: pulumi.Input<string>;
    /**
     * The data disk size of ECS instance node. Its valid value is 20~32768 GB. Default to 20.
     */
    readonly diskSize?: pulumi.Input<number>;
    /**
     * The image ID of ECS instance node used. Default to System automate allocated.
     */
    readonly imageId?: pulumi.Input<string>;
    /**
     * The type of ECS instance node.
     */
    readonly instanceType: pulumi.Input<string>;
    /**
     * Whether to use outdated instance type. Default to false.
     */
    readonly isOutdated?: pulumi.Input<boolean>;
    /**
     * The container cluster's name. It is the only in one Alicloud account.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The container cluster name's prefix. It is conflict with `name`. If it is specified, terraform will using it to build the only cluster name. Default to 'Terraform-Creation'.
     */
    readonly namePrefix?: pulumi.Input<string>;
    readonly needSlb?: pulumi.Input<boolean>;
    /**
     * The ECS node number of the container cluster. Its value choices are 1~50, and default to 1.
     */
    readonly nodeNumber?: pulumi.Input<number>;
    /**
     * The password of ECS instance node.
     */
    readonly password: pulumi.Input<string>;
    /**
     * Whether to release EIP after creating swarm cluster successfully. Default to false.
     * * `need_slb`- Whether to create the default simple routing Server Load Balancer instance for the cluster. The default value is true.
     */
    readonly releaseEip?: pulumi.Input<boolean>;
    /**
     * Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.
     */
    readonly size?: pulumi.Input<number>;
    /**
     * The password of ECS instance node. If it is not specified, the container cluster's network mode will be `Classic`.
     */
    readonly vswitchId: pulumi.Input<string>;
}
