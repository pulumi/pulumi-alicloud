// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScalingConfigurationNetworkInterface {
    /**
     * @return The ENI type. If you specify NetworkInterfaces.N, specify at least one primary ENI. You cannot specify SecurityGroupId or SecurityGroupIds.N. Valid values: Primary, Secondary.
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return The number of randomly generated IPv6 addresses that you want to assign to primary ENI N.
     * 
     */
    private @Nullable Integer ipv6AddressCount;
    /**
     * @return The communication mode of the ENI. Valid values: Standard, HighPerformance.
     * 
     */
    private @Nullable String networkInterfaceTrafficMode;
    /**
     * @return The ID of security group N to which ENI N belongs.
     * 
     */
    private @Nullable List<String> securityGroupIds;

    private ScalingConfigurationNetworkInterface() {}
    /**
     * @return The ENI type. If you specify NetworkInterfaces.N, specify at least one primary ENI. You cannot specify SecurityGroupId or SecurityGroupIds.N. Valid values: Primary, Secondary.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return The number of randomly generated IPv6 addresses that you want to assign to primary ENI N.
     * 
     */
    public Optional<Integer> ipv6AddressCount() {
        return Optional.ofNullable(this.ipv6AddressCount);
    }
    /**
     * @return The communication mode of the ENI. Valid values: Standard, HighPerformance.
     * 
     */
    public Optional<String> networkInterfaceTrafficMode() {
        return Optional.ofNullable(this.networkInterfaceTrafficMode);
    }
    /**
     * @return The ID of security group N to which ENI N belongs.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingConfigurationNetworkInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String instanceType;
        private @Nullable Integer ipv6AddressCount;
        private @Nullable String networkInterfaceTrafficMode;
        private @Nullable List<String> securityGroupIds;
        public Builder() {}
        public Builder(ScalingConfigurationNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.ipv6AddressCount = defaults.ipv6AddressCount;
    	      this.networkInterfaceTrafficMode = defaults.networkInterfaceTrafficMode;
    	      this.securityGroupIds = defaults.securityGroupIds;
        }

        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {

            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6AddressCount(@Nullable Integer ipv6AddressCount) {

            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceTrafficMode(@Nullable String networkInterfaceTrafficMode) {

            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {

            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public ScalingConfigurationNetworkInterface build() {
            final var _resultValue = new ScalingConfigurationNetworkInterface();
            _resultValue.instanceType = instanceType;
            _resultValue.ipv6AddressCount = ipv6AddressCount;
            _resultValue.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            _resultValue.securityGroupIds = securityGroupIds;
            return _resultValue;
        }
    }
}
