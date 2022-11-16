// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.alicloud.cr.outputs.ChainChainConfigRouterFrom;
import com.pulumi.alicloud.cr.outputs.ChainChainConfigRouterTo;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ChainChainConfigRouter {
    /**
     * @return Source node.
     * 
     */
    private final @Nullable List<ChainChainConfigRouterFrom> froms;
    /**
     * @return Destination node.
     * 
     */
    private final @Nullable List<ChainChainConfigRouterTo> tos;

    @CustomType.Constructor
    private ChainChainConfigRouter(
        @CustomType.Parameter("froms") @Nullable List<ChainChainConfigRouterFrom> froms,
        @CustomType.Parameter("tos") @Nullable List<ChainChainConfigRouterTo> tos) {
        this.froms = froms;
        this.tos = tos;
    }

    /**
     * @return Source node.
     * 
     */
    public List<ChainChainConfigRouterFrom> froms() {
        return this.froms == null ? List.of() : this.froms;
    }
    /**
     * @return Destination node.
     * 
     */
    public List<ChainChainConfigRouterTo> tos() {
        return this.tos == null ? List.of() : this.tos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChainChainConfigRouter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ChainChainConfigRouterFrom> froms;
        private @Nullable List<ChainChainConfigRouterTo> tos;

        public Builder() {
    	      // Empty
        }

        public Builder(ChainChainConfigRouter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.froms = defaults.froms;
    	      this.tos = defaults.tos;
        }

        public Builder froms(@Nullable List<ChainChainConfigRouterFrom> froms) {
            this.froms = froms;
            return this;
        }
        public Builder froms(ChainChainConfigRouterFrom... froms) {
            return froms(List.of(froms));
        }
        public Builder tos(@Nullable List<ChainChainConfigRouterTo> tos) {
            this.tos = tos;
            return this;
        }
        public Builder tos(ChainChainConfigRouterTo... tos) {
            return tos(List.of(tos));
        }        public ChainChainConfigRouter build() {
            return new ChainChainConfigRouter(froms, tos);
        }
    }
}