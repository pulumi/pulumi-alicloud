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
     * @return Each node in the delivery chain. See `nodes` below.
     * 
     * &gt; **NOTE:** The `from` and `to` fields are all fixed, and their structure and the value of `node_name` are fixed. You can refer to the template given in the example for configuration.
     * 
     */
    private @Nullable List<ChainChainConfigNode> nodes;
    /**
     * @return Execution sequence relationship between delivery chain nodes. See `routers` below.
     * 
     */
    private @Nullable List<ChainChainConfigRouter> routers;

    private ChainChainConfig() {}
    /**
     * @return Each node in the delivery chain. See `nodes` below.
     * 
     * &gt; **NOTE:** The `from` and `to` fields are all fixed, and their structure and the value of `node_name` are fixed. You can refer to the template given in the example for configuration.
     * 
     */
    public List<ChainChainConfigNode> nodes() {
        return this.nodes == null ? List.of() : this.nodes;
    }
    /**
     * @return Execution sequence relationship between delivery chain nodes. See `routers` below.
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
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ChainChainConfigNode> nodes;
        private @Nullable List<ChainChainConfigRouter> routers;
        public Builder() {}
        public Builder(ChainChainConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodes = defaults.nodes;
    	      this.routers = defaults.routers;
        }

        @CustomType.Setter
        public Builder nodes(@Nullable List<ChainChainConfigNode> nodes) {

            this.nodes = nodes;
            return this;
        }
        public Builder nodes(ChainChainConfigNode... nodes) {
            return nodes(List.of(nodes));
        }
        @CustomType.Setter
        public Builder routers(@Nullable List<ChainChainConfigRouter> routers) {

            this.routers = routers;
            return this;
        }
        public Builder routers(ChainChainConfigRouter... routers) {
            return routers(List.of(routers));
        }
        public ChainChainConfig build() {
            final var _resultValue = new ChainChainConfig();
            _resultValue.nodes = nodes;
            _resultValue.routers = routers;
            return _resultValue;
        }
    }
}
