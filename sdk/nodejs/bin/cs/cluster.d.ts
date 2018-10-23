import * as pulumi from "@pulumi/pulumi";
/**
 * ~> **NOTE:** This resource name has been replaced by [`alicloud_cs_swarm`](https://www.terraform.io/docs/providers/alicloud/r/cs_swarm.html) from [version 1.8.2](https://releases.hashicorp.com/terraform-provider-alicloud/1.8.2/).
 * Please update it.
 */
export declare class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState): Cluster;
    readonly agentVersion: pulumi.Output<string>;
    readonly cidrBlock: pulumi.Output<string>;
    readonly diskCategory: pulumi.Output<string | undefined>;
    readonly diskSize: pulumi.Output<number | undefined>;
    readonly imageId: pulumi.Output<string | undefined>;
    readonly instanceType: pulumi.Output<string>;
    readonly isOutdated: pulumi.Output<boolean | undefined>;
    readonly name: pulumi.Output<string>;
    readonly namePrefix: pulumi.Output<string | undefined>;
    readonly needSlb: pulumi.Output<boolean | undefined>;
    readonly nodeNumber: pulumi.Output<number | undefined>;
    readonly nodes: pulumi.Output<{
        eip: string;
        id: string;
        name: string;
        privateIp: string;
        status: string;
    }[]>;
    readonly password: pulumi.Output<string>;
    readonly releaseEip: pulumi.Output<boolean | undefined>;
    readonly securityGroupId: pulumi.Output<string>;
    readonly size: pulumi.Output<number | undefined>;
    readonly slbId: pulumi.Output<string>;
    readonly vpcId: pulumi.Output<string>;
    readonly vswitchId: pulumi.Output<string>;
    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    readonly agentVersion?: pulumi.Input<string>;
    readonly cidrBlock?: pulumi.Input<string>;
    readonly diskCategory?: pulumi.Input<string>;
    readonly diskSize?: pulumi.Input<number>;
    readonly imageId?: pulumi.Input<string>;
    readonly instanceType?: pulumi.Input<string>;
    readonly isOutdated?: pulumi.Input<boolean>;
    readonly name?: pulumi.Input<string>;
    readonly namePrefix?: pulumi.Input<string>;
    readonly needSlb?: pulumi.Input<boolean>;
    readonly nodeNumber?: pulumi.Input<number>;
    readonly nodes?: pulumi.Input<pulumi.Input<{
        eip?: pulumi.Input<string>;
        id?: pulumi.Input<string>;
        name?: pulumi.Input<string>;
        privateIp?: pulumi.Input<string>;
        status?: pulumi.Input<string>;
    }>[]>;
    readonly password?: pulumi.Input<string>;
    readonly releaseEip?: pulumi.Input<boolean>;
    readonly securityGroupId?: pulumi.Input<string>;
    readonly size?: pulumi.Input<number>;
    readonly slbId?: pulumi.Input<string>;
    readonly vpcId?: pulumi.Input<string>;
    readonly vswitchId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    readonly cidrBlock: pulumi.Input<string>;
    readonly diskCategory?: pulumi.Input<string>;
    readonly diskSize?: pulumi.Input<number>;
    readonly imageId?: pulumi.Input<string>;
    readonly instanceType: pulumi.Input<string>;
    readonly isOutdated?: pulumi.Input<boolean>;
    readonly name?: pulumi.Input<string>;
    readonly namePrefix?: pulumi.Input<string>;
    readonly needSlb?: pulumi.Input<boolean>;
    readonly nodeNumber?: pulumi.Input<number>;
    readonly password: pulumi.Input<string>;
    readonly releaseEip?: pulumi.Input<boolean>;
    readonly size?: pulumi.Input<number>;
    readonly vswitchId: pulumi.Input<string>;
}
