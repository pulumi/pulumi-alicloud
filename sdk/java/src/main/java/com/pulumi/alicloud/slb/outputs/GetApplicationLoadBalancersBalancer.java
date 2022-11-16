// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.alicloud.slb.outputs.GetApplicationLoadBalancersBalancerBackendServer;
import com.pulumi.alicloud.slb.outputs.GetApplicationLoadBalancersBalancerListenerPortsAndProtocal;
import com.pulumi.alicloud.slb.outputs.GetApplicationLoadBalancersBalancerListenerPortsAndProtocol;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetApplicationLoadBalancersBalancer {
    /**
     * @return Service address of the SLBs.
     * 
     */
    private final String address;
    /**
     * @return The address ip version. Valid values `ipv4` and `ipv6`.
     * 
     */
    private final String addressIpVersion;
    /**
     * @return The address type of the SLB. Valid values `internet` and `intranet`.
     * 
     */
    private final String addressType;
    /**
     * @return The auto release time.
     * 
     */
    private final Integer autoReleaseTime;
    /**
     * @return The backend servers of the SLB.
     * 
     */
    private final List<GetApplicationLoadBalancersBalancerBackendServer> backendServers;
    /**
     * @return The bandwidth of the SLB.
     * 
     */
    private final Integer bandwidth;
    /**
     * @return The create time stamp of the SLB.
     * 
     */
    private final Integer createTimeStamp;
    /**
     * @return Whether the SLB should delete protection.
     * 
     */
    private final String deleteProtection;
    /**
     * @return The end time of the SLB.
     * 
     */
    private final String endTime;
    /**
     * @return The end time stamp of the SLB.
     * 
     */
    private final Integer endTimeStamp;
    /**
     * @return ID of the SLB.
     * 
     */
    private final String id;
    /**
     * @return The internet charge type. Valid values `PayByBandwidth` and `PayByTraffic`.
     * 
     */
    private final String internetChargeType;
    /**
     * @return The listener ports and protocal of the SLB.
     * 
     */
    private final List<GetApplicationLoadBalancersBalancerListenerPortsAndProtocal> listenerPortsAndProtocals;
    /**
     * @return The listener ports and protocol of the SLB.
     * 
     */
    private final List<GetApplicationLoadBalancersBalancerListenerPortsAndProtocol> listenerPortsAndProtocols;
    /**
     * @return Thd ID of the SLB.
     * 
     */
    private final String loadBalancerId;
    /**
     * @return The name of the SLB.
     * 
     */
    private final String loadBalancerName;
    /**
     * @return The specification of the SLB.
     * 
     */
    private final String loadBalancerSpec;
    /**
     * @return The master zone id of the SLB.
     * 
     */
    private final String masterZoneId;
    /**
     * @return The reason of modification protection.
     * 
     */
    private final String modificationProtectionReason;
    /**
     * @return The status of modification protection.
     * 
     */
    private final String modificationProtectionStatus;
    /**
     * @return Network type of the SLBs. Valid values: `vpc` and `classic`.
     * 
     */
    private final String networkType;
    /**
     * @return The payment type of SLB. Valid values `PayAsYouGo` and `Subscription`.
     * 
     */
    private final String paymentType;
    /**
     * @return Region ID the SLB belongs to.
     * 
     */
    private final String regionIdAlias;
    /**
     * @return The renewal cyc unit of the SLB.
     * 
     */
    private final String renewalCycUnit;
    /**
     * @return The renewal duration of the SLB.
     * 
     */
    private final Integer renewalDuration;
    /**
     * @return The renewal status of the SLB.
     * 
     */
    private final String renewalStatus;
    /**
     * @return The Id of resource group which SLB belongs.
     * 
     */
    private final String resourceGroupId;
    /**
     * @return The slave zone id of the SLB.
     * 
     */
    private final String slaveZoneId;
    /**
     * @return SLB current status. Possible values: `inactive`, `active` and `locked`.
     * 
     */
    private final String status;
    /**
     * @return A map of tags assigned to the SLB instances. The `tags` can have a maximum of 5 tag. It must be in the format:
     * 
     */
    private final Map<String,Object> tags;
    /**
     * @return ID of the VPC linked to the SLBs.
     * 
     */
    private final String vpcId;
    /**
     * @return ID of the VSwitch linked to the SLBs.
     * 
     */
    private final String vswitchId;

    @CustomType.Constructor
    private GetApplicationLoadBalancersBalancer(
        @CustomType.Parameter("address") String address,
        @CustomType.Parameter("addressIpVersion") String addressIpVersion,
        @CustomType.Parameter("addressType") String addressType,
        @CustomType.Parameter("autoReleaseTime") Integer autoReleaseTime,
        @CustomType.Parameter("backendServers") List<GetApplicationLoadBalancersBalancerBackendServer> backendServers,
        @CustomType.Parameter("bandwidth") Integer bandwidth,
        @CustomType.Parameter("createTimeStamp") Integer createTimeStamp,
        @CustomType.Parameter("deleteProtection") String deleteProtection,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("endTimeStamp") Integer endTimeStamp,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("internetChargeType") String internetChargeType,
        @CustomType.Parameter("listenerPortsAndProtocals") List<GetApplicationLoadBalancersBalancerListenerPortsAndProtocal> listenerPortsAndProtocals,
        @CustomType.Parameter("listenerPortsAndProtocols") List<GetApplicationLoadBalancersBalancerListenerPortsAndProtocol> listenerPortsAndProtocols,
        @CustomType.Parameter("loadBalancerId") String loadBalancerId,
        @CustomType.Parameter("loadBalancerName") String loadBalancerName,
        @CustomType.Parameter("loadBalancerSpec") String loadBalancerSpec,
        @CustomType.Parameter("masterZoneId") String masterZoneId,
        @CustomType.Parameter("modificationProtectionReason") String modificationProtectionReason,
        @CustomType.Parameter("modificationProtectionStatus") String modificationProtectionStatus,
        @CustomType.Parameter("networkType") String networkType,
        @CustomType.Parameter("paymentType") String paymentType,
        @CustomType.Parameter("regionIdAlias") String regionIdAlias,
        @CustomType.Parameter("renewalCycUnit") String renewalCycUnit,
        @CustomType.Parameter("renewalDuration") Integer renewalDuration,
        @CustomType.Parameter("renewalStatus") String renewalStatus,
        @CustomType.Parameter("resourceGroupId") String resourceGroupId,
        @CustomType.Parameter("slaveZoneId") String slaveZoneId,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") Map<String,Object> tags,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("vswitchId") String vswitchId) {
        this.address = address;
        this.addressIpVersion = addressIpVersion;
        this.addressType = addressType;
        this.autoReleaseTime = autoReleaseTime;
        this.backendServers = backendServers;
        this.bandwidth = bandwidth;
        this.createTimeStamp = createTimeStamp;
        this.deleteProtection = deleteProtection;
        this.endTime = endTime;
        this.endTimeStamp = endTimeStamp;
        this.id = id;
        this.internetChargeType = internetChargeType;
        this.listenerPortsAndProtocals = listenerPortsAndProtocals;
        this.listenerPortsAndProtocols = listenerPortsAndProtocols;
        this.loadBalancerId = loadBalancerId;
        this.loadBalancerName = loadBalancerName;
        this.loadBalancerSpec = loadBalancerSpec;
        this.masterZoneId = masterZoneId;
        this.modificationProtectionReason = modificationProtectionReason;
        this.modificationProtectionStatus = modificationProtectionStatus;
        this.networkType = networkType;
        this.paymentType = paymentType;
        this.regionIdAlias = regionIdAlias;
        this.renewalCycUnit = renewalCycUnit;
        this.renewalDuration = renewalDuration;
        this.renewalStatus = renewalStatus;
        this.resourceGroupId = resourceGroupId;
        this.slaveZoneId = slaveZoneId;
        this.status = status;
        this.tags = tags;
        this.vpcId = vpcId;
        this.vswitchId = vswitchId;
    }

    /**
     * @return Service address of the SLBs.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return The address ip version. Valid values `ipv4` and `ipv6`.
     * 
     */
    public String addressIpVersion() {
        return this.addressIpVersion;
    }
    /**
     * @return The address type of the SLB. Valid values `internet` and `intranet`.
     * 
     */
    public String addressType() {
        return this.addressType;
    }
    /**
     * @return The auto release time.
     * 
     */
    public Integer autoReleaseTime() {
        return this.autoReleaseTime;
    }
    /**
     * @return The backend servers of the SLB.
     * 
     */
    public List<GetApplicationLoadBalancersBalancerBackendServer> backendServers() {
        return this.backendServers;
    }
    /**
     * @return The bandwidth of the SLB.
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return The create time stamp of the SLB.
     * 
     */
    public Integer createTimeStamp() {
        return this.createTimeStamp;
    }
    /**
     * @return Whether the SLB should delete protection.
     * 
     */
    public String deleteProtection() {
        return this.deleteProtection;
    }
    /**
     * @return The end time of the SLB.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return The end time stamp of the SLB.
     * 
     */
    public Integer endTimeStamp() {
        return this.endTimeStamp;
    }
    /**
     * @return ID of the SLB.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The internet charge type. Valid values `PayByBandwidth` and `PayByTraffic`.
     * 
     */
    public String internetChargeType() {
        return this.internetChargeType;
    }
    /**
     * @return The listener ports and protocal of the SLB.
     * 
     */
    public List<GetApplicationLoadBalancersBalancerListenerPortsAndProtocal> listenerPortsAndProtocals() {
        return this.listenerPortsAndProtocals;
    }
    /**
     * @return The listener ports and protocol of the SLB.
     * 
     */
    public List<GetApplicationLoadBalancersBalancerListenerPortsAndProtocol> listenerPortsAndProtocols() {
        return this.listenerPortsAndProtocols;
    }
    /**
     * @return Thd ID of the SLB.
     * 
     */
    public String loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * @return The name of the SLB.
     * 
     */
    public String loadBalancerName() {
        return this.loadBalancerName;
    }
    /**
     * @return The specification of the SLB.
     * 
     */
    public String loadBalancerSpec() {
        return this.loadBalancerSpec;
    }
    /**
     * @return The master zone id of the SLB.
     * 
     */
    public String masterZoneId() {
        return this.masterZoneId;
    }
    /**
     * @return The reason of modification protection.
     * 
     */
    public String modificationProtectionReason() {
        return this.modificationProtectionReason;
    }
    /**
     * @return The status of modification protection.
     * 
     */
    public String modificationProtectionStatus() {
        return this.modificationProtectionStatus;
    }
    /**
     * @return Network type of the SLBs. Valid values: `vpc` and `classic`.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return The payment type of SLB. Valid values `PayAsYouGo` and `Subscription`.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return Region ID the SLB belongs to.
     * 
     */
    public String regionIdAlias() {
        return this.regionIdAlias;
    }
    /**
     * @return The renewal cyc unit of the SLB.
     * 
     */
    public String renewalCycUnit() {
        return this.renewalCycUnit;
    }
    /**
     * @return The renewal duration of the SLB.
     * 
     */
    public Integer renewalDuration() {
        return this.renewalDuration;
    }
    /**
     * @return The renewal status of the SLB.
     * 
     */
    public String renewalStatus() {
        return this.renewalStatus;
    }
    /**
     * @return The Id of resource group which SLB belongs.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The slave zone id of the SLB.
     * 
     */
    public String slaveZoneId() {
        return this.slaveZoneId;
    }
    /**
     * @return SLB current status. Possible values: `inactive`, `active` and `locked`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A map of tags assigned to the SLB instances. The `tags` can have a maximum of 5 tag. It must be in the format:
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return ID of the VPC linked to the SLBs.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return ID of the VSwitch linked to the SLBs.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationLoadBalancersBalancer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private String addressIpVersion;
        private String addressType;
        private Integer autoReleaseTime;
        private List<GetApplicationLoadBalancersBalancerBackendServer> backendServers;
        private Integer bandwidth;
        private Integer createTimeStamp;
        private String deleteProtection;
        private String endTime;
        private Integer endTimeStamp;
        private String id;
        private String internetChargeType;
        private List<GetApplicationLoadBalancersBalancerListenerPortsAndProtocal> listenerPortsAndProtocals;
        private List<GetApplicationLoadBalancersBalancerListenerPortsAndProtocol> listenerPortsAndProtocols;
        private String loadBalancerId;
        private String loadBalancerName;
        private String loadBalancerSpec;
        private String masterZoneId;
        private String modificationProtectionReason;
        private String modificationProtectionStatus;
        private String networkType;
        private String paymentType;
        private String regionIdAlias;
        private String renewalCycUnit;
        private Integer renewalDuration;
        private String renewalStatus;
        private String resourceGroupId;
        private String slaveZoneId;
        private String status;
        private Map<String,Object> tags;
        private String vpcId;
        private String vswitchId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationLoadBalancersBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressIpVersion = defaults.addressIpVersion;
    	      this.addressType = defaults.addressType;
    	      this.autoReleaseTime = defaults.autoReleaseTime;
    	      this.backendServers = defaults.backendServers;
    	      this.bandwidth = defaults.bandwidth;
    	      this.createTimeStamp = defaults.createTimeStamp;
    	      this.deleteProtection = defaults.deleteProtection;
    	      this.endTime = defaults.endTime;
    	      this.endTimeStamp = defaults.endTimeStamp;
    	      this.id = defaults.id;
    	      this.internetChargeType = defaults.internetChargeType;
    	      this.listenerPortsAndProtocals = defaults.listenerPortsAndProtocals;
    	      this.listenerPortsAndProtocols = defaults.listenerPortsAndProtocols;
    	      this.loadBalancerId = defaults.loadBalancerId;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.loadBalancerSpec = defaults.loadBalancerSpec;
    	      this.masterZoneId = defaults.masterZoneId;
    	      this.modificationProtectionReason = defaults.modificationProtectionReason;
    	      this.modificationProtectionStatus = defaults.modificationProtectionStatus;
    	      this.networkType = defaults.networkType;
    	      this.paymentType = defaults.paymentType;
    	      this.regionIdAlias = defaults.regionIdAlias;
    	      this.renewalCycUnit = defaults.renewalCycUnit;
    	      this.renewalDuration = defaults.renewalDuration;
    	      this.renewalStatus = defaults.renewalStatus;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.slaveZoneId = defaults.slaveZoneId;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
        }

        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        public Builder addressIpVersion(String addressIpVersion) {
            this.addressIpVersion = Objects.requireNonNull(addressIpVersion);
            return this;
        }
        public Builder addressType(String addressType) {
            this.addressType = Objects.requireNonNull(addressType);
            return this;
        }
        public Builder autoReleaseTime(Integer autoReleaseTime) {
            this.autoReleaseTime = Objects.requireNonNull(autoReleaseTime);
            return this;
        }
        public Builder backendServers(List<GetApplicationLoadBalancersBalancerBackendServer> backendServers) {
            this.backendServers = Objects.requireNonNull(backendServers);
            return this;
        }
        public Builder backendServers(GetApplicationLoadBalancersBalancerBackendServer... backendServers) {
            return backendServers(List.of(backendServers));
        }
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        public Builder createTimeStamp(Integer createTimeStamp) {
            this.createTimeStamp = Objects.requireNonNull(createTimeStamp);
            return this;
        }
        public Builder deleteProtection(String deleteProtection) {
            this.deleteProtection = Objects.requireNonNull(deleteProtection);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder endTimeStamp(Integer endTimeStamp) {
            this.endTimeStamp = Objects.requireNonNull(endTimeStamp);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = Objects.requireNonNull(internetChargeType);
            return this;
        }
        public Builder listenerPortsAndProtocals(List<GetApplicationLoadBalancersBalancerListenerPortsAndProtocal> listenerPortsAndProtocals) {
            this.listenerPortsAndProtocals = Objects.requireNonNull(listenerPortsAndProtocals);
            return this;
        }
        public Builder listenerPortsAndProtocals(GetApplicationLoadBalancersBalancerListenerPortsAndProtocal... listenerPortsAndProtocals) {
            return listenerPortsAndProtocals(List.of(listenerPortsAndProtocals));
        }
        public Builder listenerPortsAndProtocols(List<GetApplicationLoadBalancersBalancerListenerPortsAndProtocol> listenerPortsAndProtocols) {
            this.listenerPortsAndProtocols = Objects.requireNonNull(listenerPortsAndProtocols);
            return this;
        }
        public Builder listenerPortsAndProtocols(GetApplicationLoadBalancersBalancerListenerPortsAndProtocol... listenerPortsAndProtocols) {
            return listenerPortsAndProtocols(List.of(listenerPortsAndProtocols));
        }
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = Objects.requireNonNull(loadBalancerId);
            return this;
        }
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = Objects.requireNonNull(loadBalancerName);
            return this;
        }
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.loadBalancerSpec = Objects.requireNonNull(loadBalancerSpec);
            return this;
        }
        public Builder masterZoneId(String masterZoneId) {
            this.masterZoneId = Objects.requireNonNull(masterZoneId);
            return this;
        }
        public Builder modificationProtectionReason(String modificationProtectionReason) {
            this.modificationProtectionReason = Objects.requireNonNull(modificationProtectionReason);
            return this;
        }
        public Builder modificationProtectionStatus(String modificationProtectionStatus) {
            this.modificationProtectionStatus = Objects.requireNonNull(modificationProtectionStatus);
            return this;
        }
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        public Builder paymentType(String paymentType) {
            this.paymentType = Objects.requireNonNull(paymentType);
            return this;
        }
        public Builder regionIdAlias(String regionIdAlias) {
            this.regionIdAlias = Objects.requireNonNull(regionIdAlias);
            return this;
        }
        public Builder renewalCycUnit(String renewalCycUnit) {
            this.renewalCycUnit = Objects.requireNonNull(renewalCycUnit);
            return this;
        }
        public Builder renewalDuration(Integer renewalDuration) {
            this.renewalDuration = Objects.requireNonNull(renewalDuration);
            return this;
        }
        public Builder renewalStatus(String renewalStatus) {
            this.renewalStatus = Objects.requireNonNull(renewalStatus);
            return this;
        }
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        public Builder slaveZoneId(String slaveZoneId) {
            this.slaveZoneId = Objects.requireNonNull(slaveZoneId);
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
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }        public GetApplicationLoadBalancersBalancer build() {
            return new GetApplicationLoadBalancersBalancer(address, addressIpVersion, addressType, autoReleaseTime, backendServers, bandwidth, createTimeStamp, deleteProtection, endTime, endTimeStamp, id, internetChargeType, listenerPortsAndProtocals, listenerPortsAndProtocols, loadBalancerId, loadBalancerName, loadBalancerSpec, masterZoneId, modificationProtectionReason, modificationProtectionStatus, networkType, paymentType, regionIdAlias, renewalCycUnit, renewalDuration, renewalStatus, resourceGroupId, slaveZoneId, status, tags, vpcId, vswitchId);
        }
    }
}