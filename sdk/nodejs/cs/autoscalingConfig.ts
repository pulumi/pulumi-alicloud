// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource will help you configure auto scaling for the kubernetes cluster, see [What is autoscaling config](https://www.alibabacloud.com/help/en/ack/ack-managed-and-ack-dedicated/developer-reference/api-configure-auto-scaling).
 *
 * > **NOTE:** Available since v1.127.0.
 *
 * > **NOTE:** From version 1.164.0, support for specifying whether to allow the scale-in of nodes by parameter `scaleDownEnabled`.
 *
 * > **NOTE:** From version 1.164.0, support for selecting the policy for selecting which node pool to scale by parameter `expander`.
 *
 * > **NOTE:** From version 1.237.0, support for selecting the type of autoscaler by parameter `scalerType`.
 */
export class AutoscalingConfig extends pulumi.CustomResource {
    /**
     * Get an existing AutoscalingConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AutoscalingConfigState, opts?: pulumi.CustomResourceOptions): AutoscalingConfig {
        return new AutoscalingConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cs/autoscalingConfig:AutoscalingConfig';

    /**
     * Returns true if the given object is an instance of AutoscalingConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AutoscalingConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AutoscalingConfig.__pulumiType;
    }

    /**
     * The id of kubernetes cluster.
     */
    public readonly clusterId!: pulumi.Output<string | undefined>;
    /**
     * The cool down duration. Default is `10m`. If the delay (cooldown) value is set too long, there could be complaints that the Horizontal Pod Autoscaler is not responsive to workload changes. However, if the delay value is set too short, the scale of the replicas set may keep thrashing as usual.
     */
    public readonly coolDownDuration!: pulumi.Output<string | undefined>;
    /**
     * If true DaemonSet pods will be  terminated from nodes. Default is `false`.
     */
    public readonly daemonsetEvictionForNodes!: pulumi.Output<boolean | undefined>;
    /**
     * The policy for selecting which node pool to scale. Valid values: `least-waste`, `random`, `priority`. For more information on these policies, see [Configure auto scaling](https://www.alibabacloud.com/help/en/container-service-for-kubernetes/latest/auto-scaling-of-nodes#section-3bg-2ko-inl)
     */
    public readonly expander!: pulumi.Output<string | undefined>;
    /**
     * The scale-in threshold for GPU instance. Default is `0.5`.
     */
    public readonly gpuUtilizationThreshold!: pulumi.Output<string | undefined>;
    /**
     * Maximum number of seconds CA waits for pod termination when trying to scale down a node. Default is `14400`.
     */
    public readonly maxGracefulTerminationSec!: pulumi.Output<number | undefined>;
    /**
     * Minimum number of replicas that a replica set or replication controller should have to allow their pods deletion in scale down. Default is `0`.
     */
    public readonly minReplicaCount!: pulumi.Output<number | undefined>;
    /**
     * Should CA delete the K8s node object when recycle node has scaled down successfully. Default is `false`.
     */
    public readonly recycleNodeDeletionEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specify whether to allow the scale-in of nodes. Default is `true`.
     */
    public readonly scaleDownEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Should CA scale up when there 0 ready nodes. Default is `true`.
     */
    public readonly scaleUpFromZero!: pulumi.Output<boolean | undefined>;
    /**
     * The type of autoscaler. Valid values: `cluster-autoscaler`, `goatscaler`. For cluster version 1.22 and below, we only support `cluster-autoscaler`.
     */
    public readonly scalerType!: pulumi.Output<string | undefined>;
    /**
     * The interval at which the cluster is reevaluated for scaling. Default is `30s`.
     */
    public readonly scanInterval!: pulumi.Output<string | undefined>;
    /**
     * If true cluster autoscaler will never delete nodes with pods with local storage, e.g. EmptyDir or HostPath. Default is `false`.
     */
    public readonly skipNodesWithLocalStorage!: pulumi.Output<boolean | undefined>;
    /**
     * If true cluster autoscaler will never delete nodes with pods from kube-system (except for DaemonSet or mirror pods). Default is `true`.
     */
    public readonly skipNodesWithSystemPods!: pulumi.Output<boolean | undefined>;
    /**
     * The unneeded duration. Default is `10m`.
     */
    public readonly unneededDuration!: pulumi.Output<string | undefined>;
    /**
     * The scale-in threshold. Default is `0.5`.
     */
    public readonly utilizationThreshold!: pulumi.Output<string | undefined>;

    /**
     * Create a AutoscalingConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AutoscalingConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AutoscalingConfigArgs | AutoscalingConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AutoscalingConfigState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["coolDownDuration"] = state ? state.coolDownDuration : undefined;
            resourceInputs["daemonsetEvictionForNodes"] = state ? state.daemonsetEvictionForNodes : undefined;
            resourceInputs["expander"] = state ? state.expander : undefined;
            resourceInputs["gpuUtilizationThreshold"] = state ? state.gpuUtilizationThreshold : undefined;
            resourceInputs["maxGracefulTerminationSec"] = state ? state.maxGracefulTerminationSec : undefined;
            resourceInputs["minReplicaCount"] = state ? state.minReplicaCount : undefined;
            resourceInputs["recycleNodeDeletionEnabled"] = state ? state.recycleNodeDeletionEnabled : undefined;
            resourceInputs["scaleDownEnabled"] = state ? state.scaleDownEnabled : undefined;
            resourceInputs["scaleUpFromZero"] = state ? state.scaleUpFromZero : undefined;
            resourceInputs["scalerType"] = state ? state.scalerType : undefined;
            resourceInputs["scanInterval"] = state ? state.scanInterval : undefined;
            resourceInputs["skipNodesWithLocalStorage"] = state ? state.skipNodesWithLocalStorage : undefined;
            resourceInputs["skipNodesWithSystemPods"] = state ? state.skipNodesWithSystemPods : undefined;
            resourceInputs["unneededDuration"] = state ? state.unneededDuration : undefined;
            resourceInputs["utilizationThreshold"] = state ? state.utilizationThreshold : undefined;
        } else {
            const args = argsOrState as AutoscalingConfigArgs | undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["coolDownDuration"] = args ? args.coolDownDuration : undefined;
            resourceInputs["daemonsetEvictionForNodes"] = args ? args.daemonsetEvictionForNodes : undefined;
            resourceInputs["expander"] = args ? args.expander : undefined;
            resourceInputs["gpuUtilizationThreshold"] = args ? args.gpuUtilizationThreshold : undefined;
            resourceInputs["maxGracefulTerminationSec"] = args ? args.maxGracefulTerminationSec : undefined;
            resourceInputs["minReplicaCount"] = args ? args.minReplicaCount : undefined;
            resourceInputs["recycleNodeDeletionEnabled"] = args ? args.recycleNodeDeletionEnabled : undefined;
            resourceInputs["scaleDownEnabled"] = args ? args.scaleDownEnabled : undefined;
            resourceInputs["scaleUpFromZero"] = args ? args.scaleUpFromZero : undefined;
            resourceInputs["scalerType"] = args ? args.scalerType : undefined;
            resourceInputs["scanInterval"] = args ? args.scanInterval : undefined;
            resourceInputs["skipNodesWithLocalStorage"] = args ? args.skipNodesWithLocalStorage : undefined;
            resourceInputs["skipNodesWithSystemPods"] = args ? args.skipNodesWithSystemPods : undefined;
            resourceInputs["unneededDuration"] = args ? args.unneededDuration : undefined;
            resourceInputs["utilizationThreshold"] = args ? args.utilizationThreshold : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AutoscalingConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AutoscalingConfig resources.
 */
export interface AutoscalingConfigState {
    /**
     * The id of kubernetes cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The cool down duration. Default is `10m`. If the delay (cooldown) value is set too long, there could be complaints that the Horizontal Pod Autoscaler is not responsive to workload changes. However, if the delay value is set too short, the scale of the replicas set may keep thrashing as usual.
     */
    coolDownDuration?: pulumi.Input<string>;
    /**
     * If true DaemonSet pods will be  terminated from nodes. Default is `false`.
     */
    daemonsetEvictionForNodes?: pulumi.Input<boolean>;
    /**
     * The policy for selecting which node pool to scale. Valid values: `least-waste`, `random`, `priority`. For more information on these policies, see [Configure auto scaling](https://www.alibabacloud.com/help/en/container-service-for-kubernetes/latest/auto-scaling-of-nodes#section-3bg-2ko-inl)
     */
    expander?: pulumi.Input<string>;
    /**
     * The scale-in threshold for GPU instance. Default is `0.5`.
     */
    gpuUtilizationThreshold?: pulumi.Input<string>;
    /**
     * Maximum number of seconds CA waits for pod termination when trying to scale down a node. Default is `14400`.
     */
    maxGracefulTerminationSec?: pulumi.Input<number>;
    /**
     * Minimum number of replicas that a replica set or replication controller should have to allow their pods deletion in scale down. Default is `0`.
     */
    minReplicaCount?: pulumi.Input<number>;
    /**
     * Should CA delete the K8s node object when recycle node has scaled down successfully. Default is `false`.
     */
    recycleNodeDeletionEnabled?: pulumi.Input<boolean>;
    /**
     * Specify whether to allow the scale-in of nodes. Default is `true`.
     */
    scaleDownEnabled?: pulumi.Input<boolean>;
    /**
     * Should CA scale up when there 0 ready nodes. Default is `true`.
     */
    scaleUpFromZero?: pulumi.Input<boolean>;
    /**
     * The type of autoscaler. Valid values: `cluster-autoscaler`, `goatscaler`. For cluster version 1.22 and below, we only support `cluster-autoscaler`.
     */
    scalerType?: pulumi.Input<string>;
    /**
     * The interval at which the cluster is reevaluated for scaling. Default is `30s`.
     */
    scanInterval?: pulumi.Input<string>;
    /**
     * If true cluster autoscaler will never delete nodes with pods with local storage, e.g. EmptyDir or HostPath. Default is `false`.
     */
    skipNodesWithLocalStorage?: pulumi.Input<boolean>;
    /**
     * If true cluster autoscaler will never delete nodes with pods from kube-system (except for DaemonSet or mirror pods). Default is `true`.
     */
    skipNodesWithSystemPods?: pulumi.Input<boolean>;
    /**
     * The unneeded duration. Default is `10m`.
     */
    unneededDuration?: pulumi.Input<string>;
    /**
     * The scale-in threshold. Default is `0.5`.
     */
    utilizationThreshold?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AutoscalingConfig resource.
 */
export interface AutoscalingConfigArgs {
    /**
     * The id of kubernetes cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The cool down duration. Default is `10m`. If the delay (cooldown) value is set too long, there could be complaints that the Horizontal Pod Autoscaler is not responsive to workload changes. However, if the delay value is set too short, the scale of the replicas set may keep thrashing as usual.
     */
    coolDownDuration?: pulumi.Input<string>;
    /**
     * If true DaemonSet pods will be  terminated from nodes. Default is `false`.
     */
    daemonsetEvictionForNodes?: pulumi.Input<boolean>;
    /**
     * The policy for selecting which node pool to scale. Valid values: `least-waste`, `random`, `priority`. For more information on these policies, see [Configure auto scaling](https://www.alibabacloud.com/help/en/container-service-for-kubernetes/latest/auto-scaling-of-nodes#section-3bg-2ko-inl)
     */
    expander?: pulumi.Input<string>;
    /**
     * The scale-in threshold for GPU instance. Default is `0.5`.
     */
    gpuUtilizationThreshold?: pulumi.Input<string>;
    /**
     * Maximum number of seconds CA waits for pod termination when trying to scale down a node. Default is `14400`.
     */
    maxGracefulTerminationSec?: pulumi.Input<number>;
    /**
     * Minimum number of replicas that a replica set or replication controller should have to allow their pods deletion in scale down. Default is `0`.
     */
    minReplicaCount?: pulumi.Input<number>;
    /**
     * Should CA delete the K8s node object when recycle node has scaled down successfully. Default is `false`.
     */
    recycleNodeDeletionEnabled?: pulumi.Input<boolean>;
    /**
     * Specify whether to allow the scale-in of nodes. Default is `true`.
     */
    scaleDownEnabled?: pulumi.Input<boolean>;
    /**
     * Should CA scale up when there 0 ready nodes. Default is `true`.
     */
    scaleUpFromZero?: pulumi.Input<boolean>;
    /**
     * The type of autoscaler. Valid values: `cluster-autoscaler`, `goatscaler`. For cluster version 1.22 and below, we only support `cluster-autoscaler`.
     */
    scalerType?: pulumi.Input<string>;
    /**
     * The interval at which the cluster is reevaluated for scaling. Default is `30s`.
     */
    scanInterval?: pulumi.Input<string>;
    /**
     * If true cluster autoscaler will never delete nodes with pods with local storage, e.g. EmptyDir or HostPath. Default is `false`.
     */
    skipNodesWithLocalStorage?: pulumi.Input<boolean>;
    /**
     * If true cluster autoscaler will never delete nodes with pods from kube-system (except for DaemonSet or mirror pods). Default is `true`.
     */
    skipNodesWithSystemPods?: pulumi.Input<boolean>;
    /**
     * The unneeded duration. Default is `10m`.
     */
    unneededDuration?: pulumi.Input<string>;
    /**
     * The scale-in threshold. Default is `0.5`.
     */
    utilizationThreshold?: pulumi.Input<string>;
}
