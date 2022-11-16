// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetEcsNetworkInterfacesInterfaceAssociatedPublicIp;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetEcsNetworkInterfacesInterface {
    /**
     * @return The EIP associated with the secondary private IP address of the ENI.  **NOTE:** Available in v1.163.0+.
     * 
     */
    private final List<GetEcsNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps;
    /**
     * @return The creation time.
     * 
     */
    private final String creationTime;
    /**
     * @return The description of the ENI.
     * 
     */
    private final String description;
    /**
     * @return The ID of the Network Interface.
     * 
     */
    private final String id;
    /**
     * @return The instance id.
     * 
     */
    private final String instanceId;
    /**
     * @return The MAC address of the ENI.
     * 
     */
    private final String mac;
    /**
     * @return The network interface name.
     * 
     */
    private final String name;
    /**
     * @return The network interface id.
     * 
     */
    private final String networkInterfaceId;
    /**
     * @return The network interface name.
     * 
     */
    private final String networkInterfaceName;
    /**
     * @return The communication mode of the elastic network card.
     * 
     */
    private final String networkInterfaceTrafficMode;
    /**
     * @return The ID of the account to which the ENIC belongs.
     * 
     */
    private final String ownerId;
    /**
     * @return The primary private IP address of the ENI.
     * 
     */
    private final String primaryIpAddress;
    /**
     * @return The primary private IP address of the ENI.
     * 
     */
    private final String privateIp;
    private final List<String> privateIpAddresses;
    /**
     * @return A list of secondary private IP address that is assigned to the ENI.
     * 
     */
    private final List<String> privateIps;
    /**
     * @return Number of network card queues.
     * 
     */
    private final Integer queueNumber;
    /**
     * @return The resource group id.
     * 
     */
    private final String resourceGroupId;
    /**
     * @return The security group ids.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * @return The security groups.
     * 
     */
    private final List<String> securityGroups;
    /**
     * @return The service id.
     * 
     */
    private final Integer serviceId;
    /**
     * @return Whether the user of the elastic network card is a cloud product or a virtual vendor.
     * 
     */
    private final Boolean serviceManaged;
    /**
     * @return The status of the ENI.
     * 
     */
    private final String status;
    /**
     * @return The tags.
     * 
     */
    private final Map<String,Object> tags;
    /**
     * @return The type of the ENI.
     * 
     */
    private final String type;
    /**
     * @return The Vpc Id.
     * 
     */
    private final String vpcId;
    /**
     * @return The vswitch id.
     * 
     */
    private final String vswitchId;
    /**
     * @return The zone id.
     * 
     */
    private final String zoneId;

    @CustomType.Constructor
    private GetEcsNetworkInterfacesInterface(
        @CustomType.Parameter("associatedPublicIps") List<GetEcsNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps,
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

    /**
     * @return The EIP associated with the secondary private IP address of the ENI.  **NOTE:** Available in v1.163.0+.
     * 
     */
    public List<GetEcsNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps() {
        return this.associatedPublicIps;
    }
    /**
     * @return The creation time.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return The description of the ENI.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Network Interface.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The instance id.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The MAC address of the ENI.
     * 
     */
    public String mac() {
        return this.mac;
    }
    /**
     * @return The network interface name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The network interface id.
     * 
     */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * @return The network interface name.
     * 
     */
    public String networkInterfaceName() {
        return this.networkInterfaceName;
    }
    /**
     * @return The communication mode of the elastic network card.
     * 
     */
    public String networkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }
    /**
     * @return The ID of the account to which the ENIC belongs.
     * 
     */
    public String ownerId() {
        return this.ownerId;
    }
    /**
     * @return The primary private IP address of the ENI.
     * 
     */
    public String primaryIpAddress() {
        return this.primaryIpAddress;
    }
    /**
     * @return The primary private IP address of the ENI.
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
    /**
     * @return Number of network card queues.
     * 
     */
    public Integer queueNumber() {
        return this.queueNumber;
    }
    /**
     * @return The resource group id.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The security group ids.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return The security groups.
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups;
    }
    /**
     * @return The service id.
     * 
     */
    public Integer serviceId() {
        return this.serviceId;
    }
    /**
     * @return Whether the user of the elastic network card is a cloud product or a virtual vendor.
     * 
     */
    public Boolean serviceManaged() {
        return this.serviceManaged;
    }
    /**
     * @return The status of the ENI.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The tags.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return The type of the ENI.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The Vpc Id.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The vswitch id.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }
    /**
     * @return The zone id.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsNetworkInterfacesInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetEcsNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps;
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

        public Builder(GetEcsNetworkInterfacesInterface defaults) {
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

        public Builder associatedPublicIps(List<GetEcsNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps) {
            this.associatedPublicIps = Objects.requireNonNull(associatedPublicIps);
            return this;
        }
        public Builder associatedPublicIps(GetEcsNetworkInterfacesInterfaceAssociatedPublicIp... associatedPublicIps) {
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
        }        public GetEcsNetworkInterfacesInterface build() {
            return new GetEcsNetworkInterfacesInterface(associatedPublicIps, creationTime, description, id, instanceId, mac, name, networkInterfaceId, networkInterfaceName, networkInterfaceTrafficMode, ownerId, primaryIpAddress, privateIp, privateIpAddresses, privateIps, queueNumber, resourceGroupId, securityGroupIds, securityGroups, serviceId, serviceManaged, status, tags, type, vpcId, vswitchId, zoneId);
        }
    }
}