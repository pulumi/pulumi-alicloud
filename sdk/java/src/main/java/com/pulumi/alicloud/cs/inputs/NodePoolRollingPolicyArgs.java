// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolRollingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolRollingPolicyArgs Empty = new NodePoolRollingPolicyArgs();

    /**
     * The maximum number of unusable nodes.
     * 
     */
    @Import(name="maxParallelism")
    private @Nullable Output<Integer> maxParallelism;

    /**
     * @return The maximum number of unusable nodes.
     * 
     */
    public Optional<Output<Integer>> maxParallelism() {
        return Optional.ofNullable(this.maxParallelism);
    }

    private NodePoolRollingPolicyArgs() {}

    private NodePoolRollingPolicyArgs(NodePoolRollingPolicyArgs $) {
        this.maxParallelism = $.maxParallelism;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolRollingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolRollingPolicyArgs $;

        public Builder() {
            $ = new NodePoolRollingPolicyArgs();
        }

        public Builder(NodePoolRollingPolicyArgs defaults) {
            $ = new NodePoolRollingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxParallelism The maximum number of unusable nodes.
         * 
         * @return builder
         * 
         */
        public Builder maxParallelism(@Nullable Output<Integer> maxParallelism) {
            $.maxParallelism = maxParallelism;
            return this;
        }

        /**
         * @param maxParallelism The maximum number of unusable nodes.
         * 
         * @return builder
         * 
         */
        public Builder maxParallelism(Integer maxParallelism) {
            return maxParallelism(Output.of(maxParallelism));
        }

        public NodePoolRollingPolicyArgs build() {
            return $;
        }
    }

}