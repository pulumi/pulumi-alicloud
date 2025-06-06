// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eflo.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeGroupIpAllocationPolicyMachineTypePolicyBond {
    /**
     * @return The bond name
     * 
     */
    private @Nullable String name;
    /**
     * @return IP source cluster subnet
     * 
     */
    private @Nullable String subnet;

    private NodeGroupIpAllocationPolicyMachineTypePolicyBond() {}
    /**
     * @return The bond name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return IP source cluster subnet
     * 
     */
    public Optional<String> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupIpAllocationPolicyMachineTypePolicyBond defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String subnet;
        public Builder() {}
        public Builder(NodeGroupIpAllocationPolicyMachineTypePolicyBond defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.subnet = defaults.subnet;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder subnet(@Nullable String subnet) {

            this.subnet = subnet;
            return this;
        }
        public NodeGroupIpAllocationPolicyMachineTypePolicyBond build() {
            final var _resultValue = new NodeGroupIpAllocationPolicyMachineTypePolicyBond();
            _resultValue.name = name;
            _resultValue.subnet = subnet;
            return _resultValue;
        }
    }
}
