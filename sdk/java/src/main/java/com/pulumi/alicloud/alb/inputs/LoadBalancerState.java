// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.alicloud.alb.inputs.LoadBalancerAccessLogConfigArgs;
import com.pulumi.alicloud.alb.inputs.LoadBalancerDeletionProtectionConfigArgs;
import com.pulumi.alicloud.alb.inputs.LoadBalancerLoadBalancerBillingConfigArgs;
import com.pulumi.alicloud.alb.inputs.LoadBalancerModificationProtectionConfigArgs;
import com.pulumi.alicloud.alb.inputs.LoadBalancerZoneMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerState extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerState Empty = new LoadBalancerState();

    /**
     * The configuration of the access log. See `access_log_config` below.
     * 
     */
    @Import(name="accessLogConfig")
    private @Nullable Output<LoadBalancerAccessLogConfigArgs> accessLogConfig;

    /**
     * @return The configuration of the access log. See `access_log_config` below.
     * 
     */
    public Optional<Output<LoadBalancerAccessLogConfigArgs>> accessLogConfig() {
        return Optional.ofNullable(this.accessLogConfig);
    }

    /**
     * The method in which IP addresses are assigned. Valid values:  Fixed: The ALB instance uses a fixed IP address. Dynamic (default): An IP address is dynamically assigned to each zone of the ALB instance.
     * 
     */
    @Import(name="addressAllocatedMode")
    private @Nullable Output<String> addressAllocatedMode;

    /**
     * @return The method in which IP addresses are assigned. Valid values:  Fixed: The ALB instance uses a fixed IP address. Dynamic (default): An IP address is dynamically assigned to each zone of the ALB instance.
     * 
     */
    public Optional<Output<String>> addressAllocatedMode() {
        return Optional.ofNullable(this.addressAllocatedMode);
    }

    /**
     * The protocol version. Value:
     * - `IPv4`:IPv4 type.
     * - `DualStack`: the dual-stack type.
     * 
     */
    @Import(name="addressIpVersion")
    private @Nullable Output<String> addressIpVersion;

    /**
     * @return The protocol version. Value:
     * - `IPv4`:IPv4 type.
     * - `DualStack`: the dual-stack type.
     * 
     */
    public Optional<Output<String>> addressIpVersion() {
        return Optional.ofNullable(this.addressIpVersion);
    }

    /**
     * The type of IP address that the SLB instance uses to provide services.
     * 
     */
    @Import(name="addressType")
    private @Nullable Output<String> addressType;

    /**
     * @return The type of IP address that the SLB instance uses to provide services.
     * 
     */
    public Optional<Output<String>> addressType() {
        return Optional.ofNullable(this.addressType);
    }

    /**
     * The ID of the EIP bandwidth plan which is associated with an ALB instance that uses a public IP address.
     * 
     */
    @Import(name="bandwidthPackageId")
    private @Nullable Output<String> bandwidthPackageId;

    /**
     * @return The ID of the EIP bandwidth plan which is associated with an ALB instance that uses a public IP address.
     * 
     */
    public Optional<Output<String>> bandwidthPackageId() {
        return Optional.ofNullable(this.bandwidthPackageId);
    }

    /**
     * The creation time of the resource
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation time of the resource
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The Protection Configuration See `deletion_protection_config` below.
     * 
     */
    @Import(name="deletionProtectionConfig")
    private @Nullable Output<LoadBalancerDeletionProtectionConfigArgs> deletionProtectionConfig;

    /**
     * @return The Protection Configuration See `deletion_protection_config` below.
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
     * DNS Domain Name
     * 
     */
    @Import(name="dnsName")
    private @Nullable Output<String> dnsName;

    /**
     * @return DNS Domain Name
     * 
     */
    public Optional<Output<String>> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }

    /**
     * Whether to PreCheck only this request, value:
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Whether to PreCheck only this request, value:
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The address type of Ipv6
     * 
     */
    @Import(name="ipv6AddressType")
    private @Nullable Output<String> ipv6AddressType;

    /**
     * @return The address type of Ipv6
     * 
     */
    public Optional<Output<String>> ipv6AddressType() {
        return Optional.ofNullable(this.ipv6AddressType);
    }

    /**
     * The configuration of the billing method. See `load_balancer_billing_config` below.
     * 
     */
    @Import(name="loadBalancerBillingConfig")
    private @Nullable Output<LoadBalancerLoadBalancerBillingConfigArgs> loadBalancerBillingConfig;

    /**
     * @return The configuration of the billing method. See `load_balancer_billing_config` below.
     * 
     */
    public Optional<Output<LoadBalancerLoadBalancerBillingConfigArgs>> loadBalancerBillingConfig() {
        return Optional.ofNullable(this.loadBalancerBillingConfig);
    }

    /**
     * The edition of the ALB instance.
     * 
     */
    @Import(name="loadBalancerEdition")
    private @Nullable Output<String> loadBalancerEdition;

    /**
     * @return The edition of the ALB instance.
     * 
     */
    public Optional<Output<String>> loadBalancerEdition() {
        return Optional.ofNullable(this.loadBalancerEdition);
    }

    /**
     * The name of the resource
     * 
     */
    @Import(name="loadBalancerName")
    private @Nullable Output<String> loadBalancerName;

    /**
     * @return The name of the resource
     * 
     */
    public Optional<Output<String>> loadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }

    /**
     * Modify the Protection Configuration See `modification_protection_config` below.
     * 
     */
    @Import(name="modificationProtectionConfig")
    private @Nullable Output<LoadBalancerModificationProtectionConfigArgs> modificationProtectionConfig;

    /**
     * @return Modify the Protection Configuration See `modification_protection_config` below.
     * 
     */
    public Optional<Output<LoadBalancerModificationProtectionConfigArgs>> modificationProtectionConfig() {
        return Optional.ofNullable(this.modificationProtectionConfig);
    }

    /**
     * The region ID of the resource
     * 
     */
    @Import(name="regionId")
    private @Nullable Output<String> regionId;

    /**
     * @return The region ID of the resource
     * 
     */
    public Optional<Output<String>> regionId() {
        return Optional.ofNullable(this.regionId);
    }

    /**
     * The ID of the resource group
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * Server Load Balancer Instance Status:, indicating that the instance listener will no longer forward traffic.(default).
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Server Load Balancer Instance Status:, indicating that the instance listener will no longer forward traffic.(default).
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tag of the resource
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tag of the resource
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the virtual private cloud (VPC) where the SLB instance is deployed.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the virtual private cloud (VPC) where the SLB instance is deployed.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The zones and vSwitches. You must specify at least two zones. See `zone_mappings` below.
     * 
     */
    @Import(name="zoneMappings")
    private @Nullable Output<List<LoadBalancerZoneMappingArgs>> zoneMappings;

    /**
     * @return The zones and vSwitches. You must specify at least two zones. See `zone_mappings` below.
     * 
     */
    public Optional<Output<List<LoadBalancerZoneMappingArgs>>> zoneMappings() {
        return Optional.ofNullable(this.zoneMappings);
    }

    private LoadBalancerState() {}

    private LoadBalancerState(LoadBalancerState $) {
        this.accessLogConfig = $.accessLogConfig;
        this.addressAllocatedMode = $.addressAllocatedMode;
        this.addressIpVersion = $.addressIpVersion;
        this.addressType = $.addressType;
        this.bandwidthPackageId = $.bandwidthPackageId;
        this.createTime = $.createTime;
        this.deletionProtectionConfig = $.deletionProtectionConfig;
        this.deletionProtectionEnabled = $.deletionProtectionEnabled;
        this.dnsName = $.dnsName;
        this.dryRun = $.dryRun;
        this.ipv6AddressType = $.ipv6AddressType;
        this.loadBalancerBillingConfig = $.loadBalancerBillingConfig;
        this.loadBalancerEdition = $.loadBalancerEdition;
        this.loadBalancerName = $.loadBalancerName;
        this.modificationProtectionConfig = $.modificationProtectionConfig;
        this.regionId = $.regionId;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
        this.zoneMappings = $.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerState $;

        public Builder() {
            $ = new LoadBalancerState();
        }

        public Builder(LoadBalancerState defaults) {
            $ = new LoadBalancerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLogConfig The configuration of the access log. See `access_log_config` below.
         * 
         * @return builder
         * 
         */
        public Builder accessLogConfig(@Nullable Output<LoadBalancerAccessLogConfigArgs> accessLogConfig) {
            $.accessLogConfig = accessLogConfig;
            return this;
        }

        /**
         * @param accessLogConfig The configuration of the access log. See `access_log_config` below.
         * 
         * @return builder
         * 
         */
        public Builder accessLogConfig(LoadBalancerAccessLogConfigArgs accessLogConfig) {
            return accessLogConfig(Output.of(accessLogConfig));
        }

        /**
         * @param addressAllocatedMode The method in which IP addresses are assigned. Valid values:  Fixed: The ALB instance uses a fixed IP address. Dynamic (default): An IP address is dynamically assigned to each zone of the ALB instance.
         * 
         * @return builder
         * 
         */
        public Builder addressAllocatedMode(@Nullable Output<String> addressAllocatedMode) {
            $.addressAllocatedMode = addressAllocatedMode;
            return this;
        }

        /**
         * @param addressAllocatedMode The method in which IP addresses are assigned. Valid values:  Fixed: The ALB instance uses a fixed IP address. Dynamic (default): An IP address is dynamically assigned to each zone of the ALB instance.
         * 
         * @return builder
         * 
         */
        public Builder addressAllocatedMode(String addressAllocatedMode) {
            return addressAllocatedMode(Output.of(addressAllocatedMode));
        }

        /**
         * @param addressIpVersion The protocol version. Value:
         * - `IPv4`:IPv4 type.
         * - `DualStack`: the dual-stack type.
         * 
         * @return builder
         * 
         */
        public Builder addressIpVersion(@Nullable Output<String> addressIpVersion) {
            $.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * @param addressIpVersion The protocol version. Value:
         * - `IPv4`:IPv4 type.
         * - `DualStack`: the dual-stack type.
         * 
         * @return builder
         * 
         */
        public Builder addressIpVersion(String addressIpVersion) {
            return addressIpVersion(Output.of(addressIpVersion));
        }

        /**
         * @param addressType The type of IP address that the SLB instance uses to provide services.
         * 
         * @return builder
         * 
         */
        public Builder addressType(@Nullable Output<String> addressType) {
            $.addressType = addressType;
            return this;
        }

        /**
         * @param addressType The type of IP address that the SLB instance uses to provide services.
         * 
         * @return builder
         * 
         */
        public Builder addressType(String addressType) {
            return addressType(Output.of(addressType));
        }

        /**
         * @param bandwidthPackageId The ID of the EIP bandwidth plan which is associated with an ALB instance that uses a public IP address.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageId(@Nullable Output<String> bandwidthPackageId) {
            $.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * @param bandwidthPackageId The ID of the EIP bandwidth plan which is associated with an ALB instance that uses a public IP address.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            return bandwidthPackageId(Output.of(bandwidthPackageId));
        }

        /**
         * @param createTime The creation time of the resource
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation time of the resource
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param deletionProtectionConfig The Protection Configuration See `deletion_protection_config` below.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtectionConfig(@Nullable Output<LoadBalancerDeletionProtectionConfigArgs> deletionProtectionConfig) {
            $.deletionProtectionConfig = deletionProtectionConfig;
            return this;
        }

        /**
         * @param deletionProtectionConfig The Protection Configuration See `deletion_protection_config` below.
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
         * @param dnsName DNS Domain Name
         * 
         * @return builder
         * 
         */
        public Builder dnsName(@Nullable Output<String> dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        /**
         * @param dnsName DNS Domain Name
         * 
         * @return builder
         * 
         */
        public Builder dnsName(String dnsName) {
            return dnsName(Output.of(dnsName));
        }

        /**
         * @param dryRun Whether to PreCheck only this request, value:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Whether to PreCheck only this request, value:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param ipv6AddressType The address type of Ipv6
         * 
         * @return builder
         * 
         */
        public Builder ipv6AddressType(@Nullable Output<String> ipv6AddressType) {
            $.ipv6AddressType = ipv6AddressType;
            return this;
        }

        /**
         * @param ipv6AddressType The address type of Ipv6
         * 
         * @return builder
         * 
         */
        public Builder ipv6AddressType(String ipv6AddressType) {
            return ipv6AddressType(Output.of(ipv6AddressType));
        }

        /**
         * @param loadBalancerBillingConfig The configuration of the billing method. See `load_balancer_billing_config` below.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBillingConfig(@Nullable Output<LoadBalancerLoadBalancerBillingConfigArgs> loadBalancerBillingConfig) {
            $.loadBalancerBillingConfig = loadBalancerBillingConfig;
            return this;
        }

        /**
         * @param loadBalancerBillingConfig The configuration of the billing method. See `load_balancer_billing_config` below.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBillingConfig(LoadBalancerLoadBalancerBillingConfigArgs loadBalancerBillingConfig) {
            return loadBalancerBillingConfig(Output.of(loadBalancerBillingConfig));
        }

        /**
         * @param loadBalancerEdition The edition of the ALB instance.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerEdition(@Nullable Output<String> loadBalancerEdition) {
            $.loadBalancerEdition = loadBalancerEdition;
            return this;
        }

        /**
         * @param loadBalancerEdition The edition of the ALB instance.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerEdition(String loadBalancerEdition) {
            return loadBalancerEdition(Output.of(loadBalancerEdition));
        }

        /**
         * @param loadBalancerName The name of the resource
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * @param loadBalancerName The name of the resource
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(String loadBalancerName) {
            return loadBalancerName(Output.of(loadBalancerName));
        }

        /**
         * @param modificationProtectionConfig Modify the Protection Configuration See `modification_protection_config` below.
         * 
         * @return builder
         * 
         */
        public Builder modificationProtectionConfig(@Nullable Output<LoadBalancerModificationProtectionConfigArgs> modificationProtectionConfig) {
            $.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }

        /**
         * @param modificationProtectionConfig Modify the Protection Configuration See `modification_protection_config` below.
         * 
         * @return builder
         * 
         */
        public Builder modificationProtectionConfig(LoadBalancerModificationProtectionConfigArgs modificationProtectionConfig) {
            return modificationProtectionConfig(Output.of(modificationProtectionConfig));
        }

        /**
         * @param regionId The region ID of the resource
         * 
         * @return builder
         * 
         */
        public Builder regionId(@Nullable Output<String> regionId) {
            $.regionId = regionId;
            return this;
        }

        /**
         * @param regionId The region ID of the resource
         * 
         * @return builder
         * 
         */
        public Builder regionId(String regionId) {
            return regionId(Output.of(regionId));
        }

        /**
         * @param resourceGroupId The ID of the resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param status Server Load Balancer Instance Status:, indicating that the instance listener will no longer forward traffic.(default).
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Server Load Balancer Instance Status:, indicating that the instance listener will no longer forward traffic.(default).
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags The tag of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tag of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId The ID of the virtual private cloud (VPC) where the SLB instance is deployed.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the virtual private cloud (VPC) where the SLB instance is deployed.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param zoneMappings The zones and vSwitches. You must specify at least two zones. See `zone_mappings` below.
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(@Nullable Output<List<LoadBalancerZoneMappingArgs>> zoneMappings) {
            $.zoneMappings = zoneMappings;
            return this;
        }

        /**
         * @param zoneMappings The zones and vSwitches. You must specify at least two zones. See `zone_mappings` below.
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(List<LoadBalancerZoneMappingArgs> zoneMappings) {
            return zoneMappings(Output.of(zoneMappings));
        }

        /**
         * @param zoneMappings The zones and vSwitches. You must specify at least two zones. See `zone_mappings` below.
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(LoadBalancerZoneMappingArgs... zoneMappings) {
            return zoneMappings(List.of(zoneMappings));
        }

        public LoadBalancerState build() {
            return $;
        }
    }

}
