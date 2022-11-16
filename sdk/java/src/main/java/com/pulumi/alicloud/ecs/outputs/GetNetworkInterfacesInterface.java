// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetNetworkInterfacesInterfaceAssociatedPublicIp;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNetworkInterfacesInterface {
    private final List<GetNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps;
    /**
     * @return Creation time of the ENI.
     * 
     */
    private final String creationTime;
    /**
     * @return Description of the ENI.
     * 
     */
    private final String description;
    /**
     * @return ID of the ENI.
     * 
     */
    private final String id;
    /**
     * @return ID of the instance that the ENI is attached to.
     * 
     */
    private final String instanceId;
    /**
     * @return MAC address of the ENI.
     * 
     */
    private final String mac;
    /**
     * @return Name of the ENI.
     * 
     */
    private final String name;
    private final String networkInterfaceId;
    private final String networkInterfaceName;
    private final String networkInterfaceTrafficMode;
    private final String ownerId;
    private final String primaryIpAddress;
    /**
     * @return Primary private IP of the ENI.
     * 
     */
    private final String privateIp;
    private final List<String> privateIpAddresses;
    /**
     * @return A list of secondary private IP address that is assigned to the ENI.
     * 
     */
    private final List<String> privateIps;
    private final Integer queueNumber;
    /**
     * @return The Id of resource group.
     * 
     */
    private final String resourceGroupId;
    private final List<String> securityGroupIds;
    /**
     * @return A list of security group that the ENI belongs to.
     * 
     */
    private final List<String> securityGroups;
    private final Integer serviceId;
    private final Boolean serviceManaged;
    /**
     * @return Current status of the ENI.
     * 
     */
    private final String status;
    /**
     * @return A map of tags assigned to the ENI.
     * 
     */
    private final Map<String,Object> tags;
    private final String type;
    /**
     * @return ID of the VPC that the ENI belongs to.
     * 
     */
    private final String vpcId;
    /**
     * @return ID of the VSwitch that the ENI is linked to.
     * 
     */
    private final String vswitchId;
    /**
     * @return ID of the availability zone that the ENI belongs to.
     * 
     */
    private final String zoneId;

    @CustomType.Constructor
    private GetNetworkInterfacesInterface(
        @CustomType.Parameter("associatedPublicIps") List<GetNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("mac") String mac,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkInterfaceId") String networkInterfaceId,
        @CustomType.Parameter("networkInterfaceName") String networkInterfaceName,
        @CustomType.Parameter("networkInterfaceTrafficMode") String networkInterfaceTrafficMode,
        @CustomType.Parameter("ownerId") String ownerId,
        @CustomType.Parameter("primaryIpAddress") String primaryIpAddress,
        @CustomType.Parameter("privateIp") String privateIp,
        @CustomType.Parameter("privateIpAddresses") List<String> privateIpAddresses,
        @CustomType.Parameter("privateIps") List<String> privateIps,
        @CustomType.Parameter("queueNumber") Integer queueNumber,
        @CustomType.Parameter("resourceGroupId") String resourceGroupId,
        @CustomType.Parameter("securityGroupIds") List<String> securityGroupIds,
        @CustomType.Parameter("securityGroups") List<String> securityGroups,
        @CustomType.Parameter("serviceId") Integer serviceId,
        @CustomType.Parameter("serviceManaged") Boolean serviceManaged,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") Map<String,Object> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("vswitchId") String vswitchId,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.associatedPublicIps = associatedPublicIps;
        this.creationTime = creationTime;
        this.description = description;
        this.id = id;
        this.instanceId = instanceId;
        this.mac = mac;
        this.name = name;
        this.networkInterfaceId = networkInterfaceId;
        this.networkInterfaceName = networkInterfaceName;
        this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
        this.ownerId = ownerId;
        this.primaryIpAddress = primaryIpAddress;
        this.privateIp = privateIp;
        this.privateIpAddresses = privateIpAddresses;
        this.privateIps = privateIps;
        this.queueNumber = queueNumber;
        this.resourceGroupId = resourceGroupId;
        this.securityGroupIds = securityGroupIds;
        this.securityGroups = securityGroups;
        this.serviceId = serviceId;
        this.serviceManaged = serviceManaged;
        this.status = status;
        this.tags = tags;
        this.type = type;
        this.vpcId = vpcId;
        this.vswitchId = vswitchId;
        this.zoneId = zoneId;
    }

    public List<GetNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps() {
        return this.associatedPublicIps;
    }
    /**
     * @return Creation time of the ENI.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return Description of the ENI.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return ID of the ENI.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ID of the instance that the ENI is attached to.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return MAC address of the ENI.
     * 
     */
    public String mac() {
        return this.mac;
    }
    /**
     * @return Name of the ENI.
     * 
     */
    public String name() {
        return this.name;
    }
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    public String networkInterfaceName() {
        return this.networkInterfaceName;
    }
    public String networkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }
    public String ownerId() {
        return this.ownerId;
    }
    public String primaryIpAddress() {
        return this.primaryIpAddress;
    }
    /**
     * @return Primary private IP of the ENI.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }
    public List<String> privateIpAddresses() {
        return this.privateIpAddresses;
    }
    /**
     * @return A list of secondary private IP address that is assigned to the ENI.
     * 
     */
    public List<String> privateIps() {
        return this.privateIps;
    }
    public Integer queueNumber() {
        return this.queueNumber;
    }
    /**
     * @return The Id of resource group.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return A list of security group that the ENI belongs to.
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups;
    }
    public Integer serviceId() {
        return this.serviceId;
    }
    public Boolean serviceManaged() {
        return this.serviceManaged;
    }
    /**
     * @return Current status of the ENI.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A map of tags assigned to the ENI.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    public String type() {
        return this.type;
    }
    /**
     * @return ID of the VPC that the ENI belongs to.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return ID of the VSwitch that the ENI is linked to.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }
    /**
     * @return ID of the availability zone that the ENI belongs to.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfacesInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps;
        private String creationTime;
        private String description;
        private String id;
        private String instanceId;
        private String mac;
        private String name;
        private String networkInterfaceId;
        private String networkInterfaceName;
        private String networkInterfaceTrafficMode;
        private String ownerId;
        private String primaryIpAddress;
        private String privateIp;
        private List<String> privateIpAddresses;
        private List<String> privateIps;
        private Integer queueNumber;
        private String resourceGroupId;
        private List<String> securityGroupIds;
        private List<String> securityGroups;
        private Integer serviceId;
        private Boolean serviceManaged;
        private String status;
        private Map<String,Object> tags;
        private String type;
        private String vpcId;
        private String vswitchId;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInterfacesInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedPublicIps = defaults.associatedPublicIps;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.mac = defaults.mac;
    	      this.name = defaults.name;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.networkInterfaceName = defaults.networkInterfaceName;
    	      this.networkInterfaceTrafficMode = defaults.networkInterfaceTrafficMode;
    	      this.ownerId = defaults.ownerId;
    	      this.primaryIpAddress = defaults.primaryIpAddress;
    	      this.privateIp = defaults.privateIp;
    	      this.privateIpAddresses = defaults.privateIpAddresses;
    	      this.privateIps = defaults.privateIps;
    	      this.queueNumber = defaults.queueNumber;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.securityGroups = defaults.securityGroups;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceManaged = defaults.serviceManaged;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder associatedPublicIps(List<GetNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps) {
            this.associatedPublicIps = Objects.requireNonNull(associatedPublicIps);
            return this;
        }
        public Builder associatedPublicIps(GetNetworkInterfacesInterfaceAssociatedPublicIp... associatedPublicIps) {
            return associatedPublicIps(List.of(associatedPublicIps));
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder mac(String mac) {
            this.mac = Objects.requireNonNull(mac);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = Objects.requireNonNull(networkInterfaceName);
            return this;
        }
        public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = Objects.requireNonNull(networkInterfaceTrafficMode);
            return this;
        }
        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }
        public Builder primaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = Objects.requireNonNull(primaryIpAddress);
            return this;
        }
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        public Builder privateIpAddresses(List<String> privateIpAddresses) {
            this.privateIpAddresses = Objects.requireNonNull(privateIpAddresses);
            return this;
        }
        public Builder privateIpAddresses(String... privateIpAddresses) {
            return privateIpAddresses(List.of(privateIpAddresses));
        }
        public Builder privateIps(List<String> privateIps) {
            this.privateIps = Objects.requireNonNull(privateIps);
            return this;
        }
        public Builder privateIps(String... privateIps) {
            return privateIps(List.of(privateIps));
        }
        public Builder queueNumber(Integer queueNumber) {
            this.queueNumber = Objects.requireNonNull(queueNumber);
            return this;
        }
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder securityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder serviceId(Integer serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = Objects.requireNonNull(serviceManaged);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public GetNetworkInterfacesInterface build() {
            return new GetNetworkInterfacesInterface(associatedPublicIps, creationTime, description, id, instanceId, mac, name, networkInterfaceId, networkInterfaceName, networkInterfaceTrafficMode, ownerId, primaryIpAddress, privateIp, privateIpAddresses, privateIps, queueNumber, resourceGroupId, securityGroupIds, securityGroups, serviceId, serviceManaged, status, tags, type, vpcId, vswitchId, zoneId);
        }
    }
}