// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcEndpointState extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointState Empty = new VpcEndpointState();

    /**
     * The IP address version.
     * 
     */
    @Import(name="addressIpVersion")
    private @Nullable Output<String> addressIpVersion;

    /**
     * @return The IP address version.
     * 
     */
    public Optional<Output<String>> addressIpVersion() {
        return Optional.ofNullable(this.addressIpVersion);
    }

    /**
     * The bandwidth of the endpoint connection.  1024 to 10240. Unit: Mbit/s.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<Integer> bandwidth;

    /**
     * @return The bandwidth of the endpoint connection.  1024 to 10240. Unit: Mbit/s.
     * 
     */
    public Optional<Output<Integer>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * The state of the endpoint connection.
     * 
     */
    @Import(name="connectionStatus")
    private @Nullable Output<String> connectionStatus;

    /**
     * @return The state of the endpoint connection.
     * 
     */
    public Optional<Output<String>> connectionStatus() {
        return Optional.ofNullable(this.connectionStatus);
    }

    /**
     * The time when the endpoint was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time when the endpoint was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether to perform only a dry run, without performing the actual request. Valid values:
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The service state of the endpoint.
     * 
     */
    @Import(name="endpointBusinessStatus")
    private @Nullable Output<String> endpointBusinessStatus;

    /**
     * @return The service state of the endpoint.
     * 
     */
    public Optional<Output<String>> endpointBusinessStatus() {
        return Optional.ofNullable(this.endpointBusinessStatus);
    }

    /**
     * The description of the endpoint.
     * 
     */
    @Import(name="endpointDescription")
    private @Nullable Output<String> endpointDescription;

    /**
     * @return The description of the endpoint.
     * 
     */
    public Optional<Output<String>> endpointDescription() {
        return Optional.ofNullable(this.endpointDescription);
    }

    /**
     * The domain name of the endpoint.
     * 
     */
    @Import(name="endpointDomain")
    private @Nullable Output<String> endpointDomain;

    /**
     * @return The domain name of the endpoint.
     * 
     */
    public Optional<Output<String>> endpointDomain() {
        return Optional.ofNullable(this.endpointDomain);
    }

    /**
     * The endpoint type.
     * 
     * Only the value: Interface, indicating the Interface endpoint. You can add the service resource types of Application Load Balancer (ALB), Classic Load Balancer (CLB), and Network Load Balancer (NLB).
     * 
     */
    @Import(name="endpointType")
    private @Nullable Output<String> endpointType;

    /**
     * @return The endpoint type.
     * 
     * Only the value: Interface, indicating the Interface endpoint. You can add the service resource types of Application Load Balancer (ALB), Classic Load Balancer (CLB), and Network Load Balancer (NLB).
     * 
     */
    public Optional<Output<String>> endpointType() {
        return Optional.ofNullable(this.endpointType);
    }

    /**
     * RAM access policies. For more information about policy definitions, see Alibaba Cloud-access control (RAM) official guidance.
     * 
     */
    @Import(name="policyDocument")
    private @Nullable Output<String> policyDocument;

    /**
     * @return RAM access policies. For more information about policy definitions, see Alibaba Cloud-access control (RAM) official guidance.
     * 
     */
    public Optional<Output<String>> policyDocument() {
        return Optional.ofNullable(this.policyDocument);
    }

    /**
     * Specifies whether to enable user authentication. This parameter is available in Security Token Service (STS) mode. Valid values:
     * 
     */
    @Import(name="protectedEnabled")
    private @Nullable Output<Boolean> protectedEnabled;

    /**
     * @return Specifies whether to enable user authentication. This parameter is available in Security Token Service (STS) mode. Valid values:
     * 
     */
    public Optional<Output<Boolean>> protectedEnabled() {
        return Optional.ofNullable(this.protectedEnabled);
    }

    /**
     * (Available since v1.239.0) The region ID of the endpoint.
     * 
     */
    @Import(name="regionId")
    private @Nullable Output<String> regionId;

    /**
     * @return (Available since v1.239.0) The region ID of the endpoint.
     * 
     */
    public Optional<Output<String>> regionId() {
        return Optional.ofNullable(this.regionId);
    }

    /**
     * The resource group ID.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The resource group ID.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The ID of the security group that is associated with the endpoint ENI. The security group can be used to control data transfer between the VPC and the endpoint ENI.
     * 
     * The endpoint can be associated with up to 10 security groups.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return The ID of the security group that is associated with the endpoint ENI. The security group can be used to control data transfer between the VPC and the endpoint ENI.
     * 
     * The endpoint can be associated with up to 10 security groups.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * The ID of the endpoint service with which the endpoint is associated.
     * 
     */
    @Import(name="serviceId")
    private @Nullable Output<String> serviceId;

    /**
     * @return The ID of the endpoint service with which the endpoint is associated.
     * 
     */
    public Optional<Output<String>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    /**
     * The name of the endpoint service with which the endpoint is associated.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The name of the endpoint service with which the endpoint is associated.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * The state of the endpoint.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The state of the endpoint.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The list of tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The list of tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The name of the endpoint.
     * 
     */
    @Import(name="vpcEndpointName")
    private @Nullable Output<String> vpcEndpointName;

    /**
     * @return The name of the endpoint.
     * 
     */
    public Optional<Output<String>> vpcEndpointName() {
        return Optional.ofNullable(this.vpcEndpointName);
    }

    /**
     * The ID of the VPC to which the endpoint belongs.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the VPC to which the endpoint belongs.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The number of private IP addresses that are assigned to an elastic network interface (ENI) in each zone. Only 1 is returned.
     * 
     */
    @Import(name="zonePrivateIpAddressCount")
    private @Nullable Output<Integer> zonePrivateIpAddressCount;

    /**
     * @return The number of private IP addresses that are assigned to an elastic network interface (ENI) in each zone. Only 1 is returned.
     * 
     */
    public Optional<Output<Integer>> zonePrivateIpAddressCount() {
        return Optional.ofNullable(this.zonePrivateIpAddressCount);
    }

    private VpcEndpointState() {}

    private VpcEndpointState(VpcEndpointState $) {
        this.addressIpVersion = $.addressIpVersion;
        this.bandwidth = $.bandwidth;
        this.connectionStatus = $.connectionStatus;
        this.createTime = $.createTime;
        this.dryRun = $.dryRun;
        this.endpointBusinessStatus = $.endpointBusinessStatus;
        this.endpointDescription = $.endpointDescription;
        this.endpointDomain = $.endpointDomain;
        this.endpointType = $.endpointType;
        this.policyDocument = $.policyDocument;
        this.protectedEnabled = $.protectedEnabled;
        this.regionId = $.regionId;
        this.resourceGroupId = $.resourceGroupId;
        this.securityGroupIds = $.securityGroupIds;
        this.serviceId = $.serviceId;
        this.serviceName = $.serviceName;
        this.status = $.status;
        this.tags = $.tags;
        this.vpcEndpointName = $.vpcEndpointName;
        this.vpcId = $.vpcId;
        this.zonePrivateIpAddressCount = $.zonePrivateIpAddressCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcEndpointState $;

        public Builder() {
            $ = new VpcEndpointState();
        }

        public Builder(VpcEndpointState defaults) {
            $ = new VpcEndpointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressIpVersion The IP address version.
         * 
         * @return builder
         * 
         */
        public Builder addressIpVersion(@Nullable Output<String> addressIpVersion) {
            $.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * @param addressIpVersion The IP address version.
         * 
         * @return builder
         * 
         */
        public Builder addressIpVersion(String addressIpVersion) {
            return addressIpVersion(Output.of(addressIpVersion));
        }

        /**
         * @param bandwidth The bandwidth of the endpoint connection.  1024 to 10240. Unit: Mbit/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The bandwidth of the endpoint connection.  1024 to 10240. Unit: Mbit/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param connectionStatus The state of the endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionStatus(@Nullable Output<String> connectionStatus) {
            $.connectionStatus = connectionStatus;
            return this;
        }

        /**
         * @param connectionStatus The state of the endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionStatus(String connectionStatus) {
            return connectionStatus(Output.of(connectionStatus));
        }

        /**
         * @param createTime The time when the endpoint was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time when the endpoint was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param dryRun Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param endpointBusinessStatus The service state of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointBusinessStatus(@Nullable Output<String> endpointBusinessStatus) {
            $.endpointBusinessStatus = endpointBusinessStatus;
            return this;
        }

        /**
         * @param endpointBusinessStatus The service state of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointBusinessStatus(String endpointBusinessStatus) {
            return endpointBusinessStatus(Output.of(endpointBusinessStatus));
        }

        /**
         * @param endpointDescription The description of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointDescription(@Nullable Output<String> endpointDescription) {
            $.endpointDescription = endpointDescription;
            return this;
        }

        /**
         * @param endpointDescription The description of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointDescription(String endpointDescription) {
            return endpointDescription(Output.of(endpointDescription));
        }

        /**
         * @param endpointDomain The domain name of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointDomain(@Nullable Output<String> endpointDomain) {
            $.endpointDomain = endpointDomain;
            return this;
        }

        /**
         * @param endpointDomain The domain name of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointDomain(String endpointDomain) {
            return endpointDomain(Output.of(endpointDomain));
        }

        /**
         * @param endpointType The endpoint type.
         * 
         * Only the value: Interface, indicating the Interface endpoint. You can add the service resource types of Application Load Balancer (ALB), Classic Load Balancer (CLB), and Network Load Balancer (NLB).
         * 
         * @return builder
         * 
         */
        public Builder endpointType(@Nullable Output<String> endpointType) {
            $.endpointType = endpointType;
            return this;
        }

        /**
         * @param endpointType The endpoint type.
         * 
         * Only the value: Interface, indicating the Interface endpoint. You can add the service resource types of Application Load Balancer (ALB), Classic Load Balancer (CLB), and Network Load Balancer (NLB).
         * 
         * @return builder
         * 
         */
        public Builder endpointType(String endpointType) {
            return endpointType(Output.of(endpointType));
        }

        /**
         * @param policyDocument RAM access policies. For more information about policy definitions, see Alibaba Cloud-access control (RAM) official guidance.
         * 
         * @return builder
         * 
         */
        public Builder policyDocument(@Nullable Output<String> policyDocument) {
            $.policyDocument = policyDocument;
            return this;
        }

        /**
         * @param policyDocument RAM access policies. For more information about policy definitions, see Alibaba Cloud-access control (RAM) official guidance.
         * 
         * @return builder
         * 
         */
        public Builder policyDocument(String policyDocument) {
            return policyDocument(Output.of(policyDocument));
        }

        /**
         * @param protectedEnabled Specifies whether to enable user authentication. This parameter is available in Security Token Service (STS) mode. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder protectedEnabled(@Nullable Output<Boolean> protectedEnabled) {
            $.protectedEnabled = protectedEnabled;
            return this;
        }

        /**
         * @param protectedEnabled Specifies whether to enable user authentication. This parameter is available in Security Token Service (STS) mode. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder protectedEnabled(Boolean protectedEnabled) {
            return protectedEnabled(Output.of(protectedEnabled));
        }

        /**
         * @param regionId (Available since v1.239.0) The region ID of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder regionId(@Nullable Output<String> regionId) {
            $.regionId = regionId;
            return this;
        }

        /**
         * @param regionId (Available since v1.239.0) The region ID of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder regionId(String regionId) {
            return regionId(Output.of(regionId));
        }

        /**
         * @param resourceGroupId The resource group ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The resource group ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param securityGroupIds The ID of the security group that is associated with the endpoint ENI. The security group can be used to control data transfer between the VPC and the endpoint ENI.
         * 
         * The endpoint can be associated with up to 10 security groups.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds The ID of the security group that is associated with the endpoint ENI. The security group can be used to control data transfer between the VPC and the endpoint ENI.
         * 
         * The endpoint can be associated with up to 10 security groups.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds The ID of the security group that is associated with the endpoint ENI. The security group can be used to control data transfer between the VPC and the endpoint ENI.
         * 
         * The endpoint can be associated with up to 10 security groups.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param serviceId The ID of the endpoint service with which the endpoint is associated.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(@Nullable Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The ID of the endpoint service with which the endpoint is associated.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param serviceName The name of the endpoint service with which the endpoint is associated.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the endpoint service with which the endpoint is associated.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param status The state of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The state of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags The list of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The list of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcEndpointName The name of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointName(@Nullable Output<String> vpcEndpointName) {
            $.vpcEndpointName = vpcEndpointName;
            return this;
        }

        /**
         * @param vpcEndpointName The name of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointName(String vpcEndpointName) {
            return vpcEndpointName(Output.of(vpcEndpointName));
        }

        /**
         * @param vpcId The ID of the VPC to which the endpoint belongs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC to which the endpoint belongs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param zonePrivateIpAddressCount The number of private IP addresses that are assigned to an elastic network interface (ENI) in each zone. Only 1 is returned.
         * 
         * @return builder
         * 
         */
        public Builder zonePrivateIpAddressCount(@Nullable Output<Integer> zonePrivateIpAddressCount) {
            $.zonePrivateIpAddressCount = zonePrivateIpAddressCount;
            return this;
        }

        /**
         * @param zonePrivateIpAddressCount The number of private IP addresses that are assigned to an elastic network interface (ENI) in each zone. Only 1 is returned.
         * 
         * @return builder
         * 
         */
        public Builder zonePrivateIpAddressCount(Integer zonePrivateIpAddressCount) {
            return zonePrivateIpAddressCount(Output.of(zonePrivateIpAddressCount));
        }

        public VpcEndpointState build() {
            return $;
        }
    }

}
