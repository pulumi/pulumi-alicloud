// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.alicloud.cr.outputs.GetChainsChainChainConfigNodeNodeConfig;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetChainsChainChainConfigNode {
    /**
     * @return Whether to enable the delivery chain node. Valid values: `true`, `false`.
     * 
     */
    private Boolean enable;
    /**
     * @return The configuration of delivery chain node.
     * 
     */
    private List<GetChainsChainChainConfigNodeNodeConfig> nodeConfigs;
    /**
     * @return The name of delivery chain node.
     * 
     */
    private String nodeName;

    private GetChainsChainChainConfigNode() {}
    /**
     * @return Whether to enable the delivery chain node. Valid values: `true`, `false`.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return The configuration of delivery chain node.
     * 
     */
    public List<GetChainsChainChainConfigNodeNodeConfig> nodeConfigs() {
        return this.nodeConfigs;
    }
    /**
     * @return The name of delivery chain node.
     * 
     */
    public String nodeName() {
        return this.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChainsChainChainConfigNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enable;
        private List<GetChainsChainChainConfigNodeNodeConfig> nodeConfigs;
        private String nodeName;
        public Builder() {}
        public Builder(GetChainsChainChainConfigNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.nodeConfigs = defaults.nodeConfigs;
    	      this.nodeName = defaults.nodeName;
        }

        @CustomType.Setter
        public Builder enable(Boolean enable) {
            if (enable == null) {
              throw new MissingRequiredPropertyException("GetChainsChainChainConfigNode", "enable");
            }
            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder nodeConfigs(List<GetChainsChainChainConfigNodeNodeConfig> nodeConfigs) {
            if (nodeConfigs == null) {
              throw new MissingRequiredPropertyException("GetChainsChainChainConfigNode", "nodeConfigs");
            }
            this.nodeConfigs = nodeConfigs;
            return this;
        }
        public Builder nodeConfigs(GetChainsChainChainConfigNodeNodeConfig... nodeConfigs) {
            return nodeConfigs(List.of(nodeConfigs));
        }
        @CustomType.Setter
        public Builder nodeName(String nodeName) {
            if (nodeName == null) {
              throw new MissingRequiredPropertyException("GetChainsChainChainConfigNode", "nodeName");
            }
            this.nodeName = nodeName;
            return this;
        }
        public GetChainsChainChainConfigNode build() {
            final var _resultValue = new GetChainsChainChainConfigNode();
            _resultValue.enable = enable;
            _resultValue.nodeConfigs = nodeConfigs;
            _resultValue.nodeName = nodeName;
            return _resultValue;
        }
    }
}