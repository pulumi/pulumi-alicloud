// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesAutoscalerNodepoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesAutoscalerNodepoolArgs Empty = new KubernetesAutoscalerNodepoolArgs();

    /**
     * The scaling group id of the groups configured for cluster-autoscaler.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The scaling group id of the groups configured for cluster-autoscaler.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The labels for the nodes in scaling group.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<String> labels;

    /**
     * @return The labels for the nodes in scaling group.
     * 
     */
    public Optional<Output<String>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The taints for the nodes in scaling group.
     * 
     */
    @Import(name="taints")
    private @Nullable Output<String> taints;

    /**
     * @return The taints for the nodes in scaling group.
     * 
     */
    public Optional<Output<String>> taints() {
        return Optional.ofNullable(this.taints);
    }

    private KubernetesAutoscalerNodepoolArgs() {}

    private KubernetesAutoscalerNodepoolArgs(KubernetesAutoscalerNodepoolArgs $) {
        this.id = $.id;
        this.labels = $.labels;
        this.taints = $.taints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesAutoscalerNodepoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesAutoscalerNodepoolArgs $;

        public Builder() {
            $ = new KubernetesAutoscalerNodepoolArgs();
        }

        public Builder(KubernetesAutoscalerNodepoolArgs defaults) {
            $ = new KubernetesAutoscalerNodepoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The scaling group id of the groups configured for cluster-autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The scaling group id of the groups configured for cluster-autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param labels The labels for the nodes in scaling group.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<String> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels for the nodes in scaling group.
         * 
         * @return builder
         * 
         */
        public Builder labels(String labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param taints The taints for the nodes in scaling group.
         * 
         * @return builder
         * 
         */
        public Builder taints(@Nullable Output<String> taints) {
            $.taints = taints;
            return this;
        }

        /**
         * @param taints The taints for the nodes in scaling group.
         * 
         * @return builder
         * 
         */
        public Builder taints(String taints) {
            return taints(Output.of(taints));
        }

        public KubernetesAutoscalerNodepoolArgs build() {
            return $;
        }
    }

}
