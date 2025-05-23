// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eflo.outputs;

import com.pulumi.alicloud.eflo.outputs.ClusterNetworksIpAllocationPolicyMachineTypePolicyBond;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNetworksIpAllocationPolicyMachineTypePolicy {
    /**
     * @return Bond information See `bonds` below.
     * 
     */
    private @Nullable List<ClusterNetworksIpAllocationPolicyMachineTypePolicyBond> bonds;
    private @Nullable String machineType;

    private ClusterNetworksIpAllocationPolicyMachineTypePolicy() {}
    /**
     * @return Bond information See `bonds` below.
     * 
     */
    public List<ClusterNetworksIpAllocationPolicyMachineTypePolicyBond> bonds() {
        return this.bonds == null ? List.of() : this.bonds;
    }
    public Optional<String> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNetworksIpAllocationPolicyMachineTypePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ClusterNetworksIpAllocationPolicyMachineTypePolicyBond> bonds;
        private @Nullable String machineType;
        public Builder() {}
        public Builder(ClusterNetworksIpAllocationPolicyMachineTypePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bonds = defaults.bonds;
    	      this.machineType = defaults.machineType;
        }

        @CustomType.Setter
        public Builder bonds(@Nullable List<ClusterNetworksIpAllocationPolicyMachineTypePolicyBond> bonds) {

            this.bonds = bonds;
            return this;
        }
        public Builder bonds(ClusterNetworksIpAllocationPolicyMachineTypePolicyBond... bonds) {
            return bonds(List.of(bonds));
        }
        @CustomType.Setter
        public Builder machineType(@Nullable String machineType) {

            this.machineType = machineType;
            return this;
        }
        public ClusterNetworksIpAllocationPolicyMachineTypePolicy build() {
            final var _resultValue = new ClusterNetworksIpAllocationPolicyMachineTypePolicy();
            _resultValue.bonds = bonds;
            _resultValue.machineType = machineType;
            return _resultValue;
        }
    }
}
