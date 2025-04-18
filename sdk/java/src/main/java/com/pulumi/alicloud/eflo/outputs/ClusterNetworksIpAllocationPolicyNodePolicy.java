// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eflo.outputs;

import com.pulumi.alicloud.eflo.outputs.ClusterNetworksIpAllocationPolicyNodePolicyBond;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNetworksIpAllocationPolicyNodePolicy {
    /**
     * @return Bond information See `bonds` below.
     * 
     */
    private @Nullable List<ClusterNetworksIpAllocationPolicyNodePolicyBond> bonds;
    private @Nullable String nodeId;

    private ClusterNetworksIpAllocationPolicyNodePolicy() {}
    /**
     * @return Bond information See `bonds` below.
     * 
     */
    public List<ClusterNetworksIpAllocationPolicyNodePolicyBond> bonds() {
        return this.bonds == null ? List.of() : this.bonds;
    }
    public Optional<String> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNetworksIpAllocationPolicyNodePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ClusterNetworksIpAllocationPolicyNodePolicyBond> bonds;
        private @Nullable String nodeId;
        public Builder() {}
        public Builder(ClusterNetworksIpAllocationPolicyNodePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bonds = defaults.bonds;
    	      this.nodeId = defaults.nodeId;
        }

        @CustomType.Setter
        public Builder bonds(@Nullable List<ClusterNetworksIpAllocationPolicyNodePolicyBond> bonds) {

            this.bonds = bonds;
            return this;
        }
        public Builder bonds(ClusterNetworksIpAllocationPolicyNodePolicyBond... bonds) {
            return bonds(List.of(bonds));
        }
        @CustomType.Setter
        public Builder nodeId(@Nullable String nodeId) {

            this.nodeId = nodeId;
            return this;
        }
        public ClusterNetworksIpAllocationPolicyNodePolicy build() {
            final var _resultValue = new ClusterNetworksIpAllocationPolicyNodePolicy();
            _resultValue.bonds = bonds;
            _resultValue.nodeId = nodeId;
            return _resultValue;
        }
    }
}
