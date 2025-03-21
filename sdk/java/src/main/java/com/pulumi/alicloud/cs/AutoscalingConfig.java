// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cs.AutoscalingConfigArgs;
import com.pulumi.alicloud.cs.inputs.AutoscalingConfigState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource will help you configure auto scaling for the kubernetes cluster, see [What is autoscaling config](https://www.alibabacloud.com/help/en/ack/ack-managed-and-ack-dedicated/developer-reference/api-configure-auto-scaling).
 * 
 * &gt; **NOTE:** Available since v1.127.0.
 * 
 * &gt; **NOTE:** From version 1.164.0, support for specifying whether to allow the scale-in of nodes by parameter `scale_down_enabled`.
 * 
 * &gt; **NOTE:** From version 1.164.0, support for selecting the policy for selecting which node pool to scale by parameter `expander`.
 * 
 * &gt; **NOTE:** From version 1.237.0, support for selecting the type of autoscaler by parameter `scaler_type`.
 * 
 */
@ResourceType(type="alicloud:cs/autoscalingConfig:AutoscalingConfig")
public class AutoscalingConfig extends com.pulumi.resources.CustomResource {
    /**
     * The id of kubernetes cluster.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clusterId;

    /**
     * @return The id of kubernetes cluster.
     * 
     */
    public Output<Optional<String>> clusterId() {
        return Codegen.optional(this.clusterId);
    }
    /**
     * The cool down duration. Default is `10m`. If the delay (cooldown) value is set too long, there could be complaints that the Horizontal Pod Autoscaler is not responsive to workload changes. However, if the delay value is set too short, the scale of the replicas set may keep thrashing as usual.
     * 
     */
    @Export(name="coolDownDuration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> coolDownDuration;

    /**
     * @return The cool down duration. Default is `10m`. If the delay (cooldown) value is set too long, there could be complaints that the Horizontal Pod Autoscaler is not responsive to workload changes. However, if the delay value is set too short, the scale of the replicas set may keep thrashing as usual.
     * 
     */
    public Output<Optional<String>> coolDownDuration() {
        return Codegen.optional(this.coolDownDuration);
    }
    /**
     * If true DaemonSet pods will be  terminated from nodes. Default is `false`.
     * 
     */
    @Export(name="daemonsetEvictionForNodes", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> daemonsetEvictionForNodes;

    /**
     * @return If true DaemonSet pods will be  terminated from nodes. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> daemonsetEvictionForNodes() {
        return Codegen.optional(this.daemonsetEvictionForNodes);
    }
    /**
     * The policy for selecting which node pool to scale. Valid values: `least-waste`, `random`, `priority`. For more information on these policies, see [Configure auto scaling](https://www.alibabacloud.com/help/en/container-service-for-kubernetes/latest/auto-scaling-of-nodes#section-3bg-2ko-inl)
     * 
     */
    @Export(name="expander", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expander;

    /**
     * @return The policy for selecting which node pool to scale. Valid values: `least-waste`, `random`, `priority`. For more information on these policies, see [Configure auto scaling](https://www.alibabacloud.com/help/en/container-service-for-kubernetes/latest/auto-scaling-of-nodes#section-3bg-2ko-inl)
     * 
     */
    public Output<Optional<String>> expander() {
        return Codegen.optional(this.expander);
    }
    /**
     * The scale-in threshold for GPU instance. Default is `0.5`.
     * 
     */
    @Export(name="gpuUtilizationThreshold", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> gpuUtilizationThreshold;

    /**
     * @return The scale-in threshold for GPU instance. Default is `0.5`.
     * 
     */
    public Output<Optional<String>> gpuUtilizationThreshold() {
        return Codegen.optional(this.gpuUtilizationThreshold);
    }
    /**
     * Maximum number of seconds CA waits for pod termination when trying to scale down a node. Default is `14400`.
     * 
     */
    @Export(name="maxGracefulTerminationSec", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxGracefulTerminationSec;

    /**
     * @return Maximum number of seconds CA waits for pod termination when trying to scale down a node. Default is `14400`.
     * 
     */
    public Output<Optional<Integer>> maxGracefulTerminationSec() {
        return Codegen.optional(this.maxGracefulTerminationSec);
    }
    /**
     * Minimum number of replicas that a replica set or replication controller should have to allow their pods deletion in scale down. Default is `0`.
     * 
     */
    @Export(name="minReplicaCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minReplicaCount;

    /**
     * @return Minimum number of replicas that a replica set or replication controller should have to allow their pods deletion in scale down. Default is `0`.
     * 
     */
    public Output<Optional<Integer>> minReplicaCount() {
        return Codegen.optional(this.minReplicaCount);
    }
    /**
     * Should CA delete the K8s node object when recycle node has scaled down successfully. Default is `false`.
     * 
     */
    @Export(name="recycleNodeDeletionEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> recycleNodeDeletionEnabled;

    /**
     * @return Should CA delete the K8s node object when recycle node has scaled down successfully. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> recycleNodeDeletionEnabled() {
        return Codegen.optional(this.recycleNodeDeletionEnabled);
    }
    /**
     * Specify whether to allow the scale-in of nodes. Default is `true`.
     * 
     */
    @Export(name="scaleDownEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> scaleDownEnabled;

    /**
     * @return Specify whether to allow the scale-in of nodes. Default is `true`.
     * 
     */
    public Output<Optional<Boolean>> scaleDownEnabled() {
        return Codegen.optional(this.scaleDownEnabled);
    }
    /**
     * Should CA scale up when there 0 ready nodes. Default is `true`.
     * 
     */
    @Export(name="scaleUpFromZero", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> scaleUpFromZero;

    /**
     * @return Should CA scale up when there 0 ready nodes. Default is `true`.
     * 
     */
    public Output<Optional<Boolean>> scaleUpFromZero() {
        return Codegen.optional(this.scaleUpFromZero);
    }
    /**
     * The type of autoscaler. Valid values: `cluster-autoscaler`, `goatscaler`. For cluster version 1.22 and below, we only support `cluster-autoscaler`.
     * 
     */
    @Export(name="scalerType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scalerType;

    /**
     * @return The type of autoscaler. Valid values: `cluster-autoscaler`, `goatscaler`. For cluster version 1.22 and below, we only support `cluster-autoscaler`.
     * 
     */
    public Output<Optional<String>> scalerType() {
        return Codegen.optional(this.scalerType);
    }
    /**
     * The interval at which the cluster is reevaluated for scaling. Default is `30s`.
     * 
     */
    @Export(name="scanInterval", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scanInterval;

    /**
     * @return The interval at which the cluster is reevaluated for scaling. Default is `30s`.
     * 
     */
    public Output<Optional<String>> scanInterval() {
        return Codegen.optional(this.scanInterval);
    }
    /**
     * If true cluster autoscaler will never delete nodes with pods with local storage, e.g. EmptyDir or HostPath. Default is `false`.
     * 
     */
    @Export(name="skipNodesWithLocalStorage", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipNodesWithLocalStorage;

    /**
     * @return If true cluster autoscaler will never delete nodes with pods with local storage, e.g. EmptyDir or HostPath. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> skipNodesWithLocalStorage() {
        return Codegen.optional(this.skipNodesWithLocalStorage);
    }
    /**
     * If true cluster autoscaler will never delete nodes with pods from kube-system (except for DaemonSet or mirror pods). Default is `true`.
     * 
     */
    @Export(name="skipNodesWithSystemPods", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipNodesWithSystemPods;

    /**
     * @return If true cluster autoscaler will never delete nodes with pods from kube-system (except for DaemonSet or mirror pods). Default is `true`.
     * 
     */
    public Output<Optional<Boolean>> skipNodesWithSystemPods() {
        return Codegen.optional(this.skipNodesWithSystemPods);
    }
    /**
     * The unneeded duration. Default is `10m`.
     * 
     */
    @Export(name="unneededDuration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> unneededDuration;

    /**
     * @return The unneeded duration. Default is `10m`.
     * 
     */
    public Output<Optional<String>> unneededDuration() {
        return Codegen.optional(this.unneededDuration);
    }
    /**
     * The scale-in threshold. Default is `0.5`.
     * 
     */
    @Export(name="utilizationThreshold", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> utilizationThreshold;

    /**
     * @return The scale-in threshold. Default is `0.5`.
     * 
     */
    public Output<Optional<String>> utilizationThreshold() {
        return Codegen.optional(this.utilizationThreshold);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutoscalingConfig(java.lang.String name) {
        this(name, AutoscalingConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutoscalingConfig(java.lang.String name, @Nullable AutoscalingConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoscalingConfig(java.lang.String name, @Nullable AutoscalingConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cs/autoscalingConfig:AutoscalingConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AutoscalingConfig(java.lang.String name, Output<java.lang.String> id, @Nullable AutoscalingConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cs/autoscalingConfig:AutoscalingConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static AutoscalingConfigArgs makeArgs(@Nullable AutoscalingConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AutoscalingConfigArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AutoscalingConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable AutoscalingConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutoscalingConfig(name, id, state, options);
    }
}
