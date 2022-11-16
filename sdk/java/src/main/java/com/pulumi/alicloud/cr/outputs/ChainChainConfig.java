// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.alicloud.cr.outputs.ChainChainConfigNode;
import com.pulumi.alicloud.cr.outputs.ChainChainConfigRouter;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ChainChainConfig {
    /**
     * @return Each node in the delivery chain.
     * 
     */
    private final @Nullable List<ChainChainConfigNode> nodes;
    /**
     * @return Execution sequence relationship between delivery chain nodes.
     * 
     */
    private final @Nullable List<ChainChainConfigRouter> routers;

    @CustomType.Constructor
    private ChainChainConfig(
        @CustomType.Parameter("nodes") @Nullable List<ChainChainConfigNode> nodes,
        @CustomType.Parameter("routers") @Nullable List<ChainChainConfigRouter> routers) {
        this.nodes = nodes;
        this.routers = routers;
    }

    /**
     * @return Each node in the delivery chain.
     * 
     */
    public List<ChainChainConfigNode> nodes() {
        return this.nodes == null ? List.of() : this.nodes;
    }
    /**
     * @return Execution sequence relationship between delivery chain nodes.
     * 
     */
    public List<ChainChainConfigRouter> routers() {
        return this.routers == null ? List.of() : this.routers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChainChainConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ChainChainConfigNode> nodes;
        private @Nullable List<ChainChainConfigRouter> routers;

        public Builder() {
    	      // Empty
        }

        public Builder(ChainChainConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodes = defaults.nodes;
    	      this.routers = defaults.routers;
        }

        public Builder nodes(@Nullable List<ChainChainConfigNode> nodes) {
            this.nodes = nodes;
            return this;
        }
        public Builder nodes(ChainChainConfigNode... nodes) {
            return nodes(List.of(nodes));
        }
        public Builder routers(@Nullable List<ChainChainConfigRouter> routers) {
            this.routers = routers;
            return this;
        }
        public Builder routers(ChainChainConfigRouter... routers) {
            return routers(List.of(routers));
        }        public ChainChainConfig build() {
            return new ChainChainConfig(nodes, routers);
        }
    }
}