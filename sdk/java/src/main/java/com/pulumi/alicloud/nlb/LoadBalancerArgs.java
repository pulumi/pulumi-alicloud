// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb;

import com.pulumi.alicloud.nlb.inputs.LoadBalancerDeletionProtectionConfigArgs;
import com.pulumi.alicloud.nlb.inputs.LoadBalancerModificationProtectionConfigArgs;
import com.pulumi.alicloud.nlb.inputs.LoadBalancerZoneMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerArgs Empty = new LoadBalancerArgs();

    /**
     * The protocol version. Valid values:
     * 
     * - **ipv4:** IPv4. This is the default value.
     * - **DualStack:** dual stack.
     * 
     */
    @Import(name="addressIpVersion")
    private @Nullable Output<String> addressIpVersion;

    /**
     * @return The protocol version. Valid values:
     * 
     * - **ipv4:** IPv4. This is the default value.
     * - **DualStack:** dual stack.
     * 
     */
    public Optional<Output<String>> addressIpVersion() {
        return Optional.ofNullable(this.addressIpVersion);
    }

    /**
     * The type of IPv4 address used by the NLB instance. Valid values:
     * - `Internet`: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.
     * - `Intranet`: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the virtual private cloud (VPC) where the NLB instance is deployed.
     * 
     * &gt; **NOTE:**   To enable a public IPv6 address for an NLB instance, call the [EnableLoadBalancerIpv6Internet](https://www.alibabacloud.com/help/en/doc-detail/445878.html) operation.
     * 
     */
    @Import(name="addressType", required=true)
    private Output<String> addressType;

    /**
     * @return The type of IPv4 address used by the NLB instance. Valid values:
     * - `Internet`: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.
     * - `Intranet`: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the virtual private cloud (VPC) where the NLB instance is deployed.
     * 
     * &gt; **NOTE:**   To enable a public IPv6 address for an NLB instance, call the [EnableLoadBalancerIpv6Internet](https://www.alibabacloud.com/help/en/doc-detail/445878.html) operation.
     * 
     */
    public Output<String> addressType() {
        return this.addressType;
    }

    /**
     * The ID of the EIP bandwidth plan that is associated with the Internet-facing NLB instance.
     * 
     */
    @Import(name="bandwidthPackageId")
    private @Nullable Output<String> bandwidthPackageId;

    /**
     * @return The ID of the EIP bandwidth plan that is associated with the Internet-facing NLB instance.
     * 
     */
    public Optional<Output<String>> bandwidthPackageId() {
        return Optional.ofNullable(this.bandwidthPackageId);
    }

    /**
     * The speed limit of new connections per second processed by NLB instances in each VIP. Value range: `0` to `1000000`.
     * 
     * - *0** means no speed limit.
     * 
     */
    @Import(name="cps")
    private @Nullable Output<Integer> cps;

    /**
     * @return The speed limit of new connections per second processed by NLB instances in each VIP. Value range: `0` to `1000000`.
     * 
     * - *0** means no speed limit.
     * 
     */
    public Optional<Output<Integer>> cps() {
        return Optional.ofNullable(this.cps);
    }

    /**
     * Specifies whether to enable cross-zone load balancing for the NLB instance. Valid values:
     * 
     */
    @Import(name="crossZoneEnabled")
    private @Nullable Output<Boolean> crossZoneEnabled;

    /**
     * @return Specifies whether to enable cross-zone load balancing for the NLB instance. Valid values:
     * 
     */
    public Optional<Output<Boolean>> crossZoneEnabled() {
        return Optional.ofNullable(this.crossZoneEnabled);
    }

    /**
     * Specifies whether to enable deletion protection. Default value: `false`. See `deletion_protection_config` below.
     * 
     */
    @Import(name="deletionProtectionConfig")
    private @Nullable Output<LoadBalancerDeletionProtectionConfigArgs> deletionProtectionConfig;

    /**
     * @return Specifies whether to enable deletion protection. Default value: `false`. See `deletion_protection_config` below.
     * 
     */
    public Optional<Output<LoadBalancerDeletionProtectionConfigArgs>> deletionProtectionConfig() {
        return Optional.ofNullable(this.deletionProtectionConfig);
    }

    /**
     * Specifies whether to enable deletion protection. Default value: `false`. Valid values:
     * 
     */
    @Import(name="deletionProtectionEnabled")
    private @Nullable Output<Boolean> deletionProtectionEnabled;

    /**
     * @return Specifies whether to enable deletion protection. Default value: `false`. Valid values:
     * 
     */
    public Optional<Output<Boolean>> deletionProtectionEnabled() {
        return Optional.ofNullable(this.deletionProtectionEnabled);
    }

    /**
     * The reason why the deletion protection feature is enabled or disabled. The `deletion_protection_reason` takes effect only when `deletion_protection_enabled` is set to `true`.
     * 
     */
    @Import(name="deletionProtectionReason")
    private @Nullable Output<String> deletionProtectionReason;

    /**
     * @return The reason why the deletion protection feature is enabled or disabled. The `deletion_protection_reason` takes effect only when `deletion_protection_enabled` is set to `true`.
     * 
     */
    public Optional<Output<String>> deletionProtectionReason() {
        return Optional.ofNullable(this.deletionProtectionReason);
    }

    /**
     * The type of IPv6 address used by the NLB instance. Valid values:
     * - `Internet`: a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.
     * - `Intranet`: a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the VPC where the NLB instance is deployed.
     * 
     */
    @Import(name="ipv6AddressType")
    private @Nullable Output<String> ipv6AddressType;

    /**
     * @return The type of IPv6 address used by the NLB instance. Valid values:
     * - `Internet`: a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.
     * - `Intranet`: a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the VPC where the NLB instance is deployed.
     * 
     */
    public Optional<Output<String>> ipv6AddressType() {
        return Optional.ofNullable(this.ipv6AddressType);
    }

    /**
     * The name of the NLB instance.
     * The value must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The value must start with a letter.
     * 
     */
    @Import(name="loadBalancerName")
    private @Nullable Output<String> loadBalancerName;

    /**
     * @return The name of the NLB instance.
     * The value must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The value must start with a letter.
     * 
     */
    public Optional<Output<String>> loadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }

    /**
     * The type of the Server Load Balancer (SLB) instance. Set the value to `network`, which specifies NLB.
     * 
     */
    @Import(name="loadBalancerType")
    private @Nullable Output<String> loadBalancerType;

    /**
     * @return The type of the Server Load Balancer (SLB) instance. Set the value to `network`, which specifies NLB.
     * 
     */
    public Optional<Output<String>> loadBalancerType() {
        return Optional.ofNullable(this.loadBalancerType);
    }

    /**
     * Specifies whether to enable the configuration read-only mode. Default value: `NonProtection`. See `modification_protection_config` below.
     * 
     */
    @Import(name="modificationProtectionConfig")
    private @Nullable Output<LoadBalancerModificationProtectionConfigArgs> modificationProtectionConfig;

    /**
     * @return Specifies whether to enable the configuration read-only mode. Default value: `NonProtection`. See `modification_protection_config` below.
     * 
     */
    public Optional<Output<LoadBalancerModificationProtectionConfigArgs>> modificationProtectionConfig() {
        return Optional.ofNullable(this.modificationProtectionConfig);
    }

    /**
     * The reason why the configuration read-only mode is enabled. The `modification_protection_reason` takes effect only when `modification_protection_status` is set to `ConsoleProtection`.
     * 
     */
    @Import(name="modificationProtectionReason")
    private @Nullable Output<String> modificationProtectionReason;

    /**
     * @return The reason why the configuration read-only mode is enabled. The `modification_protection_reason` takes effect only when `modification_protection_status` is set to `ConsoleProtection`.
     * 
     */
    public Optional<Output<String>> modificationProtectionReason() {
        return Optional.ofNullable(this.modificationProtectionReason);
    }

    /**
     * Specifies whether to enable the configuration read-only mode. Default value: `NonProtection`. Valid values:
     * - `NonProtection`: Does not enable the configuration read-only mode. You cannot set the `modification_protection_reason`. If the `modification_protection_reason` is set, the value is cleared.
     * - `ConsoleProtection`: Enables the configuration read-only mode. You can set the `modification_protection_reason`.
     * 
     */
    @Import(name="modificationProtectionStatus")
    private @Nullable Output<String> modificationProtectionStatus;

    /**
     * @return Specifies whether to enable the configuration read-only mode. Default value: `NonProtection`. Valid values:
     * - `NonProtection`: Does not enable the configuration read-only mode. You cannot set the `modification_protection_reason`. If the `modification_protection_reason` is set, the value is cleared.
     * - `ConsoleProtection`: Enables the configuration read-only mode. You can set the `modification_protection_reason`.
     * 
     */
    public Optional<Output<String>> modificationProtectionStatus() {
        return Optional.ofNullable(this.modificationProtectionStatus);
    }

    /**
     * The payment type of the resource
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return The payment type of the resource
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The ID of the new resource group.
     * You can log on to the [Resource Management console](https://resourcemanager.console.aliyun.com/resource-groups) to view resource group IDs.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the new resource group.
     * You can log on to the [Resource Management console](https://resourcemanager.console.aliyun.com/resource-groups) to view resource group IDs.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The security group to which the network-based SLB instance belongs.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return The security group to which the network-based SLB instance belongs.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * List of labels.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return List of labels.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the VPC where the NLB instance is deployed.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC where the NLB instance is deployed.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     * Available Area Configuration List. You must add at least two zones. You can add a maximum of 10 zones. See `zone_mappings` below.
     * 
     */
    @Import(name="zoneMappings", required=true)
    private Output<List<LoadBalancerZoneMappingArgs>> zoneMappings;

    /**
     * @return Available Area Configuration List. You must add at least two zones. You can add a maximum of 10 zones. See `zone_mappings` below.
     * 
     */
    public Output<List<LoadBalancerZoneMappingArgs>> zoneMappings() {
        return this.zoneMappings;
    }

    private LoadBalancerArgs() {}

    private LoadBalancerArgs(LoadBalancerArgs $) {
        this.addressIpVersion = $.addressIpVersion;
        this.addressType = $.addressType;
        this.bandwidthPackageId = $.bandwidthPackageId;
        this.cps = $.cps;
        this.crossZoneEnabled = $.crossZoneEnabled;
        this.deletionProtectionConfig = $.deletionProtectionConfig;
        this.deletionProtectionEnabled = $.deletionProtectionEnabled;
        this.deletionProtectionReason = $.deletionProtectionReason;
        this.ipv6AddressType = $.ipv6AddressType;
        this.loadBalancerName = $.loadBalancerName;
        this.loadBalancerType = $.loadBalancerType;
        this.modificationProtectionConfig = $.modificationProtectionConfig;
        this.modificationProtectionReason = $.modificationProtectionReason;
        this.modificationProtectionStatus = $.modificationProtectionStatus;
        this.paymentType = $.paymentType;
        this.resourceGroupId = $.resourceGroupId;
        this.securityGroupIds = $.securityGroupIds;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
        this.zoneMappings = $.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerArgs $;

        public Builder() {
            $ = new LoadBalancerArgs();
        }

        public Builder(LoadBalancerArgs defaults) {
            $ = new LoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressIpVersion The protocol version. Valid values:
         * 
         * - **ipv4:** IPv4. This is the default value.
         * - **DualStack:** dual stack.
         * 
         * @return builder
         * 
         */
        public Builder addressIpVersion(@Nullable Output<String> addressIpVersion) {
            $.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * @param addressIpVersion The protocol version. Valid values:
         * 
         * - **ipv4:** IPv4. This is the default value.
         * - **DualStack:** dual stack.
         * 
         * @return builder
         * 
         */
        public Builder addressIpVersion(String addressIpVersion) {
            return addressIpVersion(Output.of(addressIpVersion));
        }

        /**
         * @param addressType The type of IPv4 address used by the NLB instance. Valid values:
         * - `Internet`: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.
         * - `Intranet`: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the virtual private cloud (VPC) where the NLB instance is deployed.
         * 
         * &gt; **NOTE:**   To enable a public IPv6 address for an NLB instance, call the [EnableLoadBalancerIpv6Internet](https://www.alibabacloud.com/help/en/doc-detail/445878.html) operation.
         * 
         * @return builder
         * 
         */
        public Builder addressType(Output<String> addressType) {
            $.addressType = addressType;
            return this;
        }

        /**
         * @param addressType The type of IPv4 address used by the NLB instance. Valid values:
         * - `Internet`: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.
         * - `Intranet`: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the virtual private cloud (VPC) where the NLB instance is deployed.
         * 
         * &gt; **NOTE:**   To enable a public IPv6 address for an NLB instance, call the [EnableLoadBalancerIpv6Internet](https://www.alibabacloud.com/help/en/doc-detail/445878.html) operation.
         * 
         * @return builder
         * 
         */
        public Builder addressType(String addressType) {
            return addressType(Output.of(addressType));
        }

        /**
         * @param bandwidthPackageId The ID of the EIP bandwidth plan that is associated with the Internet-facing NLB instance.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageId(@Nullable Output<String> bandwidthPackageId) {
            $.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * @param bandwidthPackageId The ID of the EIP bandwidth plan that is associated with the Internet-facing NLB instance.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            return bandwidthPackageId(Output.of(bandwidthPackageId));
        }

        /**
         * @param cps The speed limit of new connections per second processed by NLB instances in each VIP. Value range: `0` to `1000000`.
         * 
         * - *0** means no speed limit.
         * 
         * @return builder
         * 
         */
        public Builder cps(@Nullable Output<Integer> cps) {
            $.cps = cps;
            return this;
        }

        /**
         * @param cps The speed limit of new connections per second processed by NLB instances in each VIP. Value range: `0` to `1000000`.
         * 
         * - *0** means no speed limit.
         * 
         * @return builder
         * 
         */
        public Builder cps(Integer cps) {
            return cps(Output.of(cps));
        }

        /**
         * @param crossZoneEnabled Specifies whether to enable cross-zone load balancing for the NLB instance. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder crossZoneEnabled(@Nullable Output<Boolean> crossZoneEnabled) {
            $.crossZoneEnabled = crossZoneEnabled;
            return this;
        }

        /**
         * @param crossZoneEnabled Specifies whether to enable cross-zone load balancing for the NLB instance. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder crossZoneEnabled(Boolean crossZoneEnabled) {
            return crossZoneEnabled(Output.of(crossZoneEnabled));
        }

        /**
         * @param deletionProtectionConfig Specifies whether to enable deletion protection. Default value: `false`. See `deletion_protection_config` below.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtectionConfig(@Nullable Output<LoadBalancerDeletionProtectionConfigArgs> deletionProtectionConfig) {
            $.deletionProtectionConfig = deletionProtectionConfig;
            return this;
        }

        /**
         * @param deletionProtectionConfig Specifies whether to enable deletion protection. Default value: `false`. See `deletion_protection_config` below.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtectionConfig(LoadBalancerDeletionProtectionConfigArgs deletionProtectionConfig) {
            return deletionProtectionConfig(Output.of(deletionProtectionConfig));
        }

        /**
         * @param deletionProtectionEnabled Specifies whether to enable deletion protection. Default value: `false`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder deletionProtectionEnabled(@Nullable Output<Boolean> deletionProtectionEnabled) {
            $.deletionProtectionEnabled = deletionProtectionEnabled;
            return this;
        }

        /**
         * @param deletionProtectionEnabled Specifies whether to enable deletion protection. Default value: `false`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder deletionProtectionEnabled(Boolean deletionProtectionEnabled) {
            return deletionProtectionEnabled(Output.of(deletionProtectionEnabled));
        }

        /**
         * @param deletionProtectionReason The reason why the deletion protection feature is enabled or disabled. The `deletion_protection_reason` takes effect only when `deletion_protection_enabled` is set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtectionReason(@Nullable Output<String> deletionProtectionReason) {
            $.deletionProtectionReason = deletionProtectionReason;
            return this;
        }

        /**
         * @param deletionProtectionReason The reason why the deletion protection feature is enabled or disabled. The `deletion_protection_reason` takes effect only when `deletion_protection_enabled` is set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtectionReason(String deletionProtectionReason) {
            return deletionProtectionReason(Output.of(deletionProtectionReason));
        }

        /**
         * @param ipv6AddressType The type of IPv6 address used by the NLB instance. Valid values:
         * - `Internet`: a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.
         * - `Intranet`: a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the VPC where the NLB instance is deployed.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AddressType(@Nullable Output<String> ipv6AddressType) {
            $.ipv6AddressType = ipv6AddressType;
            return this;
        }

        /**
         * @param ipv6AddressType The type of IPv6 address used by the NLB instance. Valid values:
         * - `Internet`: a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.
         * - `Intranet`: a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the VPC where the NLB instance is deployed.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AddressType(String ipv6AddressType) {
            return ipv6AddressType(Output.of(ipv6AddressType));
        }

        /**
         * @param loadBalancerName The name of the NLB instance.
         * The value must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The value must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * @param loadBalancerName The name of the NLB instance.
         * The value must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The value must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(String loadBalancerName) {
            return loadBalancerName(Output.of(loadBalancerName));
        }

        /**
         * @param loadBalancerType The type of the Server Load Balancer (SLB) instance. Set the value to `network`, which specifies NLB.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerType(@Nullable Output<String> loadBalancerType) {
            $.loadBalancerType = loadBalancerType;
            return this;
        }

        /**
         * @param loadBalancerType The type of the Server Load Balancer (SLB) instance. Set the value to `network`, which specifies NLB.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerType(String loadBalancerType) {
            return loadBalancerType(Output.of(loadBalancerType));
        }

        /**
         * @param modificationProtectionConfig Specifies whether to enable the configuration read-only mode. Default value: `NonProtection`. See `modification_protection_config` below.
         * 
         * @return builder
         * 
         */
        public Builder modificationProtectionConfig(@Nullable Output<LoadBalancerModificationProtectionConfigArgs> modificationProtectionConfig) {
            $.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }

        /**
         * @param modificationProtectionConfig Specifies whether to enable the configuration read-only mode. Default value: `NonProtection`. See `modification_protection_config` below.
         * 
         * @return builder
         * 
         */
        public Builder modificationProtectionConfig(LoadBalancerModificationProtectionConfigArgs modificationProtectionConfig) {
            return modificationProtectionConfig(Output.of(modificationProtectionConfig));
        }

        /**
         * @param modificationProtectionReason The reason why the configuration read-only mode is enabled. The `modification_protection_reason` takes effect only when `modification_protection_status` is set to `ConsoleProtection`.
         * 
         * @return builder
         * 
         */
        public Builder modificationProtectionReason(@Nullable Output<String> modificationProtectionReason) {
            $.modificationProtectionReason = modificationProtectionReason;
            return this;
        }

        /**
         * @param modificationProtectionReason The reason why the configuration read-only mode is enabled. The `modification_protection_reason` takes effect only when `modification_protection_status` is set to `ConsoleProtection`.
         * 
         * @return builder
         * 
         */
        public Builder modificationProtectionReason(String modificationProtectionReason) {
            return modificationProtectionReason(Output.of(modificationProtectionReason));
        }

        /**
         * @param modificationProtectionStatus Specifies whether to enable the configuration read-only mode. Default value: `NonProtection`. Valid values:
         * - `NonProtection`: Does not enable the configuration read-only mode. You cannot set the `modification_protection_reason`. If the `modification_protection_reason` is set, the value is cleared.
         * - `ConsoleProtection`: Enables the configuration read-only mode. You can set the `modification_protection_reason`.
         * 
         * @return builder
         * 
         */
        public Builder modificationProtectionStatus(@Nullable Output<String> modificationProtectionStatus) {
            $.modificationProtectionStatus = modificationProtectionStatus;
            return this;
        }

        /**
         * @param modificationProtectionStatus Specifies whether to enable the configuration read-only mode. Default value: `NonProtection`. Valid values:
         * - `NonProtection`: Does not enable the configuration read-only mode. You cannot set the `modification_protection_reason`. If the `modification_protection_reason` is set, the value is cleared.
         * - `ConsoleProtection`: Enables the configuration read-only mode. You can set the `modification_protection_reason`.
         * 
         * @return builder
         * 
         */
        public Builder modificationProtectionStatus(String modificationProtectionStatus) {
            return modificationProtectionStatus(Output.of(modificationProtectionStatus));
        }

        /**
         * @param paymentType The payment type of the resource
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The payment type of the resource
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param resourceGroupId The ID of the new resource group.
         * You can log on to the [Resource Management console](https://resourcemanager.console.aliyun.com/resource-groups) to view resource group IDs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the new resource group.
         * You can log on to the [Resource Management console](https://resourcemanager.console.aliyun.com/resource-groups) to view resource group IDs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param securityGroupIds The security group to which the network-based SLB instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds The security group to which the network-based SLB instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds The security group to which the network-based SLB instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param tags List of labels.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags List of labels.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId The ID of the VPC where the NLB instance is deployed.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC where the NLB instance is deployed.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param zoneMappings Available Area Configuration List. You must add at least two zones. You can add a maximum of 10 zones. See `zone_mappings` below.
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(Output<List<LoadBalancerZoneMappingArgs>> zoneMappings) {
            $.zoneMappings = zoneMappings;
            return this;
        }

        /**
         * @param zoneMappings Available Area Configuration List. You must add at least two zones. You can add a maximum of 10 zones. See `zone_mappings` below.
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(List<LoadBalancerZoneMappingArgs> zoneMappings) {
            return zoneMappings(Output.of(zoneMappings));
        }

        /**
         * @param zoneMappings Available Area Configuration List. You must add at least two zones. You can add a maximum of 10 zones. See `zone_mappings` below.
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(LoadBalancerZoneMappingArgs... zoneMappings) {
            return zoneMappings(List.of(zoneMappings));
        }

        public LoadBalancerArgs build() {
            if ($.addressType == null) {
                throw new MissingRequiredPropertyException("LoadBalancerArgs", "addressType");
            }
            if ($.vpcId == null) {
                throw new MissingRequiredPropertyException("LoadBalancerArgs", "vpcId");
            }
            if ($.zoneMappings == null) {
                throw new MissingRequiredPropertyException("LoadBalancerArgs", "zoneMappings");
            }
            return $;
        }
    }

}
