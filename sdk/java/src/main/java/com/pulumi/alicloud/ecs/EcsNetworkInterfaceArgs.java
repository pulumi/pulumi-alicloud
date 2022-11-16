// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EcsNetworkInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EcsNetworkInterfaceArgs Empty = new EcsNetworkInterfaceArgs();

    /**
     * The description of the ENI. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the ENI. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Field `name` has been deprecated from provider version 1.123.1. New field `network_interface_name` instead
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.123.1. New field &#39;network_interface_name&#39; instead
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.123.1. New field 'network_interface_name' instead */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Field `name` has been deprecated from provider version 1.123.1. New field `network_interface_name` instead
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.123.1. New field &#39;network_interface_name&#39; instead
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.123.1. New field 'network_interface_name' instead */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the ENI. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with http:// or https://.
     * 
     */
    @Import(name="networkInterfaceName")
    private @Nullable Output<String> networkInterfaceName;

    /**
     * @return The name of the ENI. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with http:// or https://.
     * 
     */
    public Optional<Output<String>> networkInterfaceName() {
        return Optional.ofNullable(this.networkInterfaceName);
    }

    /**
     * The primary private IP address of the ENI. The specified IP address must be available within the CIDR block of the VSwitch. If this parameter is not specified, an available IP address is assigned from the VSwitch CIDR block at random.
     * 
     */
    @Import(name="primaryIpAddress")
    private @Nullable Output<String> primaryIpAddress;

    /**
     * @return The primary private IP address of the ENI. The specified IP address must be available within the CIDR block of the VSwitch. If this parameter is not specified, an available IP address is assigned from the VSwitch CIDR block at random.
     * 
     */
    public Optional<Output<String>> primaryIpAddress() {
        return Optional.ofNullable(this.primaryIpAddress);
    }

    /**
     * Field `private_ip` has been deprecated from provider version 1.123.1. New field `primary_ip_address` instead
     * 
     * @deprecated
     * Field &#39;private_ip&#39; has been deprecated from provider version 1.123.1. New field &#39;primary_ip_address&#39; instead
     * 
     */
    @Deprecated /* Field 'private_ip' has been deprecated from provider version 1.123.1. New field 'primary_ip_address' instead */
    @Import(name="privateIp")
    private @Nullable Output<String> privateIp;

    /**
     * @return Field `private_ip` has been deprecated from provider version 1.123.1. New field `primary_ip_address` instead
     * 
     * @deprecated
     * Field &#39;private_ip&#39; has been deprecated from provider version 1.123.1. New field &#39;primary_ip_address&#39; instead
     * 
     */
    @Deprecated /* Field 'private_ip' has been deprecated from provider version 1.123.1. New field 'primary_ip_address' instead */
    public Optional<Output<String>> privateIp() {
        return Optional.ofNullable(this.privateIp);
    }

    /**
     * Specifies secondary private IP address N of the ENI. This IP address must be an available IP address within the CIDR block of the VSwitch to which the ENI belongs.
     * 
     */
    @Import(name="privateIpAddresses")
    private @Nullable Output<List<String>> privateIpAddresses;

    /**
     * @return Specifies secondary private IP address N of the ENI. This IP address must be an available IP address within the CIDR block of the VSwitch to which the ENI belongs.
     * 
     */
    public Optional<Output<List<String>>> privateIpAddresses() {
        return Optional.ofNullable(this.privateIpAddresses);
    }

    /**
     * Field `private_ips` has been deprecated from provider version 1.123.1. New field `private_ip_addresses` instead
     * 
     * @deprecated
     * Field &#39;private_ips&#39; has been deprecated from provider version 1.123.1. New field &#39;private_ip_addresses&#39; instead
     * 
     */
    @Deprecated /* Field 'private_ips' has been deprecated from provider version 1.123.1. New field 'private_ip_addresses' instead */
    @Import(name="privateIps")
    private @Nullable Output<List<String>> privateIps;

    /**
     * @return Field `private_ips` has been deprecated from provider version 1.123.1. New field `private_ip_addresses` instead
     * 
     * @deprecated
     * Field &#39;private_ips&#39; has been deprecated from provider version 1.123.1. New field &#39;private_ip_addresses&#39; instead
     * 
     */
    @Deprecated /* Field 'private_ips' has been deprecated from provider version 1.123.1. New field 'private_ip_addresses' instead */
    public Optional<Output<List<String>>> privateIps() {
        return Optional.ofNullable(this.privateIps);
    }

    /**
     * Field `private_ips_count` has been deprecated from provider version 1.123.1. New field `secondary_private_ip_address_count` instead
     * 
     * @deprecated
     * Field &#39;private_ips_count&#39; has been deprecated from provider version 1.123.1. New field &#39;secondary_private_ip_address_count&#39; instead
     * 
     */
    @Deprecated /* Field 'private_ips_count' has been deprecated from provider version 1.123.1. New field 'secondary_private_ip_address_count' instead */
    @Import(name="privateIpsCount")
    private @Nullable Output<Integer> privateIpsCount;

    /**
     * @return Field `private_ips_count` has been deprecated from provider version 1.123.1. New field `secondary_private_ip_address_count` instead
     * 
     * @deprecated
     * Field &#39;private_ips_count&#39; has been deprecated from provider version 1.123.1. New field &#39;secondary_private_ip_address_count&#39; instead
     * 
     */
    @Deprecated /* Field 'private_ips_count' has been deprecated from provider version 1.123.1. New field 'secondary_private_ip_address_count' instead */
    public Optional<Output<Integer>> privateIpsCount() {
        return Optional.ofNullable(this.privateIpsCount);
    }

    /**
     * The queue number of the ENI.
     * 
     */
    @Import(name="queueNumber")
    private @Nullable Output<Integer> queueNumber;

    /**
     * @return The queue number of the ENI.
     * 
     */
    public Optional<Output<Integer>> queueNumber() {
        return Optional.ofNullable(this.queueNumber);
    }

    /**
     * The resource group id.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The resource group id.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The number of private IP addresses that can be automatically created by ECS.
     * 
     */
    @Import(name="secondaryPrivateIpAddressCount")
    private @Nullable Output<Integer> secondaryPrivateIpAddressCount;

    /**
     * @return The number of private IP addresses that can be automatically created by ECS.
     * 
     */
    public Optional<Output<Integer>> secondaryPrivateIpAddressCount() {
        return Optional.ofNullable(this.secondaryPrivateIpAddressCount);
    }

    /**
     * The ID of security group N. The security groups and the ENI must belong to the same VPC. The valid values of N are based on the maximum number of security groups to which an ENI can be added.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return The ID of security group N. The security groups and the ENI must belong to the same VPC. The valid values of N are based on the maximum number of security groups to which an ENI can be added.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * Field `security_groups` has been deprecated from provider version 1.123.1. New field `security_group_ids` instead
     * 
     * @deprecated
     * Field &#39;security_groups&#39; has been deprecated from provider version 1.123.1. New field &#39;security_group_ids&#39; instead
     * 
     */
    @Deprecated /* Field 'security_groups' has been deprecated from provider version 1.123.1. New field 'security_group_ids' instead */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return Field `security_groups` has been deprecated from provider version 1.123.1. New field `security_group_ids` instead
     * 
     * @deprecated
     * Field &#39;security_groups&#39; has been deprecated from provider version 1.123.1. New field &#39;security_group_ids&#39; instead
     * 
     */
    @Deprecated /* Field 'security_groups' has been deprecated from provider version 1.123.1. New field 'security_group_ids' instead */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the VSwitch in the specified VPC. The private IP addresses assigned to the ENI must be available IP addresses within the CIDR block of the VSwitch.
     * 
     */
    @Import(name="vswitchId", required=true)
    private Output<String> vswitchId;

    /**
     * @return The ID of the VSwitch in the specified VPC. The private IP addresses assigned to the ENI must be available IP addresses within the CIDR block of the VSwitch.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    private EcsNetworkInterfaceArgs() {}

    private EcsNetworkInterfaceArgs(EcsNetworkInterfaceArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.networkInterfaceName = $.networkInterfaceName;
        this.primaryIpAddress = $.primaryIpAddress;
        this.privateIp = $.privateIp;
        this.privateIpAddresses = $.privateIpAddresses;
        this.privateIps = $.privateIps;
        this.privateIpsCount = $.privateIpsCount;
        this.queueNumber = $.queueNumber;
        this.resourceGroupId = $.resourceGroupId;
        this.secondaryPrivateIpAddressCount = $.secondaryPrivateIpAddressCount;
        this.securityGroupIds = $.securityGroupIds;
        this.securityGroups = $.securityGroups;
        this.tags = $.tags;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EcsNetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EcsNetworkInterfaceArgs $;

        public Builder() {
            $ = new EcsNetworkInterfaceArgs();
        }

        public Builder(EcsNetworkInterfaceArgs defaults) {
            $ = new EcsNetworkInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the ENI. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the ENI. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Field `name` has been deprecated from provider version 1.123.1. New field `network_interface_name` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from provider version 1.123.1. New field &#39;network_interface_name&#39; instead
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from provider version 1.123.1. New field 'network_interface_name' instead */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Field `name` has been deprecated from provider version 1.123.1. New field `network_interface_name` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from provider version 1.123.1. New field &#39;network_interface_name&#39; instead
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from provider version 1.123.1. New field 'network_interface_name' instead */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkInterfaceName The name of the ENI. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceName(@Nullable Output<String> networkInterfaceName) {
            $.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * @param networkInterfaceName The name of the ENI. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            return networkInterfaceName(Output.of(networkInterfaceName));
        }

        /**
         * @param primaryIpAddress The primary private IP address of the ENI. The specified IP address must be available within the CIDR block of the VSwitch. If this parameter is not specified, an available IP address is assigned from the VSwitch CIDR block at random.
         * 
         * @return builder
         * 
         */
        public Builder primaryIpAddress(@Nullable Output<String> primaryIpAddress) {
            $.primaryIpAddress = primaryIpAddress;
            return this;
        }

        /**
         * @param primaryIpAddress The primary private IP address of the ENI. The specified IP address must be available within the CIDR block of the VSwitch. If this parameter is not specified, an available IP address is assigned from the VSwitch CIDR block at random.
         * 
         * @return builder
         * 
         */
        public Builder primaryIpAddress(String primaryIpAddress) {
            return primaryIpAddress(Output.of(primaryIpAddress));
        }

        /**
         * @param privateIp Field `private_ip` has been deprecated from provider version 1.123.1. New field `primary_ip_address` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;private_ip&#39; has been deprecated from provider version 1.123.1. New field &#39;primary_ip_address&#39; instead
         * 
         */
        @Deprecated /* Field 'private_ip' has been deprecated from provider version 1.123.1. New field 'primary_ip_address' instead */
        public Builder privateIp(@Nullable Output<String> privateIp) {
            $.privateIp = privateIp;
            return this;
        }

        /**
         * @param privateIp Field `private_ip` has been deprecated from provider version 1.123.1. New field `primary_ip_address` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;private_ip&#39; has been deprecated from provider version 1.123.1. New field &#39;primary_ip_address&#39; instead
         * 
         */
        @Deprecated /* Field 'private_ip' has been deprecated from provider version 1.123.1. New field 'primary_ip_address' instead */
        public Builder privateIp(String privateIp) {
            return privateIp(Output.of(privateIp));
        }

        /**
         * @param privateIpAddresses Specifies secondary private IP address N of the ENI. This IP address must be an available IP address within the CIDR block of the VSwitch to which the ENI belongs.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddresses(@Nullable Output<List<String>> privateIpAddresses) {
            $.privateIpAddresses = privateIpAddresses;
            return this;
        }

        /**
         * @param privateIpAddresses Specifies secondary private IP address N of the ENI. This IP address must be an available IP address within the CIDR block of the VSwitch to which the ENI belongs.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddresses(List<String> privateIpAddresses) {
            return privateIpAddresses(Output.of(privateIpAddresses));
        }

        /**
         * @param privateIpAddresses Specifies secondary private IP address N of the ENI. This IP address must be an available IP address within the CIDR block of the VSwitch to which the ENI belongs.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddresses(String... privateIpAddresses) {
            return privateIpAddresses(List.of(privateIpAddresses));
        }

        /**
         * @param privateIps Field `private_ips` has been deprecated from provider version 1.123.1. New field `private_ip_addresses` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;private_ips&#39; has been deprecated from provider version 1.123.1. New field &#39;private_ip_addresses&#39; instead
         * 
         */
        @Deprecated /* Field 'private_ips' has been deprecated from provider version 1.123.1. New field 'private_ip_addresses' instead */
        public Builder privateIps(@Nullable Output<List<String>> privateIps) {
            $.privateIps = privateIps;
            return this;
        }

        /**
         * @param privateIps Field `private_ips` has been deprecated from provider version 1.123.1. New field `private_ip_addresses` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;private_ips&#39; has been deprecated from provider version 1.123.1. New field &#39;private_ip_addresses&#39; instead
         * 
         */
        @Deprecated /* Field 'private_ips' has been deprecated from provider version 1.123.1. New field 'private_ip_addresses' instead */
        public Builder privateIps(List<String> privateIps) {
            return privateIps(Output.of(privateIps));
        }

        /**
         * @param privateIps Field `private_ips` has been deprecated from provider version 1.123.1. New field `private_ip_addresses` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;private_ips&#39; has been deprecated from provider version 1.123.1. New field &#39;private_ip_addresses&#39; instead
         * 
         */
        @Deprecated /* Field 'private_ips' has been deprecated from provider version 1.123.1. New field 'private_ip_addresses' instead */
        public Builder privateIps(String... privateIps) {
            return privateIps(List.of(privateIps));
        }

        /**
         * @param privateIpsCount Field `private_ips_count` has been deprecated from provider version 1.123.1. New field `secondary_private_ip_address_count` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;private_ips_count&#39; has been deprecated from provider version 1.123.1. New field &#39;secondary_private_ip_address_count&#39; instead
         * 
         */
        @Deprecated /* Field 'private_ips_count' has been deprecated from provider version 1.123.1. New field 'secondary_private_ip_address_count' instead */
        public Builder privateIpsCount(@Nullable Output<Integer> privateIpsCount) {
            $.privateIpsCount = privateIpsCount;
            return this;
        }

        /**
         * @param privateIpsCount Field `private_ips_count` has been deprecated from provider version 1.123.1. New field `secondary_private_ip_address_count` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;private_ips_count&#39; has been deprecated from provider version 1.123.1. New field &#39;secondary_private_ip_address_count&#39; instead
         * 
         */
        @Deprecated /* Field 'private_ips_count' has been deprecated from provider version 1.123.1. New field 'secondary_private_ip_address_count' instead */
        public Builder privateIpsCount(Integer privateIpsCount) {
            return privateIpsCount(Output.of(privateIpsCount));
        }

        /**
         * @param queueNumber The queue number of the ENI.
         * 
         * @return builder
         * 
         */
        public Builder queueNumber(@Nullable Output<Integer> queueNumber) {
            $.queueNumber = queueNumber;
            return this;
        }

        /**
         * @param queueNumber The queue number of the ENI.
         * 
         * @return builder
         * 
         */
        public Builder queueNumber(Integer queueNumber) {
            return queueNumber(Output.of(queueNumber));
        }

        /**
         * @param resourceGroupId The resource group id.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The resource group id.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param secondaryPrivateIpAddressCount The number of private IP addresses that can be automatically created by ECS.
         * 
         * @return builder
         * 
         */
        public Builder secondaryPrivateIpAddressCount(@Nullable Output<Integer> secondaryPrivateIpAddressCount) {
            $.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }

        /**
         * @param secondaryPrivateIpAddressCount The number of private IP addresses that can be automatically created by ECS.
         * 
         * @return builder
         * 
         */
        public Builder secondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
            return secondaryPrivateIpAddressCount(Output.of(secondaryPrivateIpAddressCount));
        }

        /**
         * @param securityGroupIds The ID of security group N. The security groups and the ENI must belong to the same VPC. The valid values of N are based on the maximum number of security groups to which an ENI can be added.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds The ID of security group N. The security groups and the ENI must belong to the same VPC. The valid values of N are based on the maximum number of security groups to which an ENI can be added.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds The ID of security group N. The security groups and the ENI must belong to the same VPC. The valid values of N are based on the maximum number of security groups to which an ENI can be added.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param securityGroups Field `security_groups` has been deprecated from provider version 1.123.1. New field `security_group_ids` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;security_groups&#39; has been deprecated from provider version 1.123.1. New field &#39;security_group_ids&#39; instead
         * 
         */
        @Deprecated /* Field 'security_groups' has been deprecated from provider version 1.123.1. New field 'security_group_ids' instead */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups Field `security_groups` has been deprecated from provider version 1.123.1. New field `security_group_ids` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;security_groups&#39; has been deprecated from provider version 1.123.1. New field &#39;security_group_ids&#39; instead
         * 
         */
        @Deprecated /* Field 'security_groups' has been deprecated from provider version 1.123.1. New field 'security_group_ids' instead */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups Field `security_groups` has been deprecated from provider version 1.123.1. New field `security_group_ids` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;security_groups&#39; has been deprecated from provider version 1.123.1. New field &#39;security_group_ids&#39; instead
         * 
         */
        @Deprecated /* Field 'security_groups' has been deprecated from provider version 1.123.1. New field 'security_group_ids' instead */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vswitchId The ID of the VSwitch in the specified VPC. The private IP addresses assigned to the ENI must be available IP addresses within the CIDR block of the VSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The ID of the VSwitch in the specified VPC. The private IP addresses assigned to the ENI must be available IP addresses within the CIDR block of the VSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public EcsNetworkInterfaceArgs build() {
            $.vswitchId = Objects.requireNonNull($.vswitchId, "expected parameter 'vswitchId' to be non-null");
            return $;
        }
    }

}