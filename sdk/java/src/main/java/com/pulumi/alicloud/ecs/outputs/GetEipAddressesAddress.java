// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetEipAddressesAddress {
    /**
     * @return The name of the EIP.
     * 
     */
    private String addressName;
    /**
     * @return The ID of the EIP.
     * 
     */
    private String allocationId;
    /**
     * @return The ID of the region to which the EIP belongs.
     * 
     */
    private List<String> availableRegions;
    /**
     * @return The maximum bandwidth of the EIP. Unit: Mbit/s.
     * 
     */
    private String bandwidth;
    /**
     * @return The bandwidth value of the EIP bandwidth plan with which the EIP is associated.
     * 
     */
    private String bandwidthPackageBandwidth;
    /**
     * @return The ID of the EIP bandwidth plan.
     * 
     */
    private String bandwidthPackageId;
    /**
     * @return The type of the bandwidth. Only CommonBandwidthPackage (an EIP bandwidth plan) is returned.
     * 
     */
    private String bandwidthPackageType;
    /**
     * @return The time when the EIP was created.
     * 
     */
    private String createTime;
    /**
     * @return Indicates whether deletion protection is enabled.
     * 
     */
    private Boolean deletionProtection;
    /**
     * @return The description of the EIP.
     * 
     */
    private String description;
    /**
     * @return The expiration date. The time follows the ISO 8601 standard and is displayed in UTC. Format: YYYY-MM-DDThh:mmZ.
     * 
     */
    private String expiredTime;
    /**
     * @return Indicates whether renewal data is included. This parameter returns true only when the parameter IncludeReservationData is set to true, and some orders have not taken effect.
     * 
     */
    private String hasReservationData;
    /**
     * @return Indicates whether fine-grained monitoring is enabled for the EIP.
     * 
     */
    private String hdMonitorStatus;
    /**
     * @return The ID of the Address.
     * 
     */
    private String id;
    /**
     * @return The ID of the instance with which the EIP is associated.
     * 
     */
    private String instanceId;
    /**
     * @return The region ID of the associated resource.
     * 
     */
    private String instanceRegionId;
    /**
     * @return The type of the instance with which the EIP is associated.
     * 
     */
    private String instanceType;
    /**
     * @return The metering method of the EIP.
     * 
     */
    private String internetChargeType;
    /**
     * @return The IP address of the EIP.
     * 
     */
    private String ipAddress;
    /**
     * @return The Internet service provider (ISP).
     * 
     */
    private String isp;
    /**
     * @return The details about the locked EIP.
     * 
     */
    private List<String> operationLocks;
    /**
     * @return The billing method of the EIP.
     * 
     */
    private String paymentType;
    /**
     * @return The time when the renewal takes effect.
     * 
     */
    private String reservationActiveTime;
    /**
     * @return The bandwidth after the renewal takes effect.
     * 
     */
    private String reservationBandwidth;
    /**
     * @return The metering method of the renewal.
     * 
     */
    private String reservationInternetChargeType;
    /**
     * @return The type of the renewal order.
     * 
     */
    private String reservationOrderType;
    /**
     * @return The ID of the resource group.
     * 
     */
    private String resourceGroupId;
    /**
     * @return Indicates whether level-2 throttling is configured.
     * 
     */
    private Boolean secondLimited;
    /**
     * @return The IDs of the contiguous EIPs.
     * 
     */
    private String segmentInstanceId;
    /**
     * @return The status of the EIP.
     * 
     */
    private String status;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private Map<String,Object> tags;

    private GetEipAddressesAddress() {}
    /**
     * @return The name of the EIP.
     * 
     */
    public String addressName() {
        return this.addressName;
    }
    /**
     * @return The ID of the EIP.
     * 
     */
    public String allocationId() {
        return this.allocationId;
    }
    /**
     * @return The ID of the region to which the EIP belongs.
     * 
     */
    public List<String> availableRegions() {
        return this.availableRegions;
    }
    /**
     * @return The maximum bandwidth of the EIP. Unit: Mbit/s.
     * 
     */
    public String bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return The bandwidth value of the EIP bandwidth plan with which the EIP is associated.
     * 
     */
    public String bandwidthPackageBandwidth() {
        return this.bandwidthPackageBandwidth;
    }
    /**
     * @return The ID of the EIP bandwidth plan.
     * 
     */
    public String bandwidthPackageId() {
        return this.bandwidthPackageId;
    }
    /**
     * @return The type of the bandwidth. Only CommonBandwidthPackage (an EIP bandwidth plan) is returned.
     * 
     */
    public String bandwidthPackageType() {
        return this.bandwidthPackageType;
    }
    /**
     * @return The time when the EIP was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Indicates whether deletion protection is enabled.
     * 
     */
    public Boolean deletionProtection() {
        return this.deletionProtection;
    }
    /**
     * @return The description of the EIP.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The expiration date. The time follows the ISO 8601 standard and is displayed in UTC. Format: YYYY-MM-DDThh:mmZ.
     * 
     */
    public String expiredTime() {
        return this.expiredTime;
    }
    /**
     * @return Indicates whether renewal data is included. This parameter returns true only when the parameter IncludeReservationData is set to true, and some orders have not taken effect.
     * 
     */
    public String hasReservationData() {
        return this.hasReservationData;
    }
    /**
     * @return Indicates whether fine-grained monitoring is enabled for the EIP.
     * 
     */
    public String hdMonitorStatus() {
        return this.hdMonitorStatus;
    }
    /**
     * @return The ID of the Address.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the instance with which the EIP is associated.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The region ID of the associated resource.
     * 
     */
    public String instanceRegionId() {
        return this.instanceRegionId;
    }
    /**
     * @return The type of the instance with which the EIP is associated.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The metering method of the EIP.
     * 
     */
    public String internetChargeType() {
        return this.internetChargeType;
    }
    /**
     * @return The IP address of the EIP.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return The Internet service provider (ISP).
     * 
     */
    public String isp() {
        return this.isp;
    }
    /**
     * @return The details about the locked EIP.
     * 
     */
    public List<String> operationLocks() {
        return this.operationLocks;
    }
    /**
     * @return The billing method of the EIP.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return The time when the renewal takes effect.
     * 
     */
    public String reservationActiveTime() {
        return this.reservationActiveTime;
    }
    /**
     * @return The bandwidth after the renewal takes effect.
     * 
     */
    public String reservationBandwidth() {
        return this.reservationBandwidth;
    }
    /**
     * @return The metering method of the renewal.
     * 
     */
    public String reservationInternetChargeType() {
        return this.reservationInternetChargeType;
    }
    /**
     * @return The type of the renewal order.
     * 
     */
    public String reservationOrderType() {
        return this.reservationOrderType;
    }
    /**
     * @return The ID of the resource group.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return Indicates whether level-2 throttling is configured.
     * 
     */
    public Boolean secondLimited() {
        return this.secondLimited;
    }
    /**
     * @return The IDs of the contiguous EIPs.
     * 
     */
    public String segmentInstanceId() {
        return this.segmentInstanceId;
    }
    /**
     * @return The status of the EIP.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEipAddressesAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String addressName;
        private String allocationId;
        private List<String> availableRegions;
        private String bandwidth;
        private String bandwidthPackageBandwidth;
        private String bandwidthPackageId;
        private String bandwidthPackageType;
        private String createTime;
        private Boolean deletionProtection;
        private String description;
        private String expiredTime;
        private String hasReservationData;
        private String hdMonitorStatus;
        private String id;
        private String instanceId;
        private String instanceRegionId;
        private String instanceType;
        private String internetChargeType;
        private String ipAddress;
        private String isp;
        private List<String> operationLocks;
        private String paymentType;
        private String reservationActiveTime;
        private String reservationBandwidth;
        private String reservationInternetChargeType;
        private String reservationOrderType;
        private String resourceGroupId;
        private Boolean secondLimited;
        private String segmentInstanceId;
        private String status;
        private Map<String,Object> tags;
        public Builder() {}
        public Builder(GetEipAddressesAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressName = defaults.addressName;
    	      this.allocationId = defaults.allocationId;
    	      this.availableRegions = defaults.availableRegions;
    	      this.bandwidth = defaults.bandwidth;
    	      this.bandwidthPackageBandwidth = defaults.bandwidthPackageBandwidth;
    	      this.bandwidthPackageId = defaults.bandwidthPackageId;
    	      this.bandwidthPackageType = defaults.bandwidthPackageType;
    	      this.createTime = defaults.createTime;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.description = defaults.description;
    	      this.expiredTime = defaults.expiredTime;
    	      this.hasReservationData = defaults.hasReservationData;
    	      this.hdMonitorStatus = defaults.hdMonitorStatus;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceRegionId = defaults.instanceRegionId;
    	      this.instanceType = defaults.instanceType;
    	      this.internetChargeType = defaults.internetChargeType;
    	      this.ipAddress = defaults.ipAddress;
    	      this.isp = defaults.isp;
    	      this.operationLocks = defaults.operationLocks;
    	      this.paymentType = defaults.paymentType;
    	      this.reservationActiveTime = defaults.reservationActiveTime;
    	      this.reservationBandwidth = defaults.reservationBandwidth;
    	      this.reservationInternetChargeType = defaults.reservationInternetChargeType;
    	      this.reservationOrderType = defaults.reservationOrderType;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.secondLimited = defaults.secondLimited;
    	      this.segmentInstanceId = defaults.segmentInstanceId;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder addressName(String addressName) {
            if (addressName == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "addressName");
            }
            this.addressName = addressName;
            return this;
        }
        @CustomType.Setter
        public Builder allocationId(String allocationId) {
            if (allocationId == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "allocationId");
            }
            this.allocationId = allocationId;
            return this;
        }
        @CustomType.Setter
        public Builder availableRegions(List<String> availableRegions) {
            if (availableRegions == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "availableRegions");
            }
            this.availableRegions = availableRegions;
            return this;
        }
        public Builder availableRegions(String... availableRegions) {
            return availableRegions(List.of(availableRegions));
        }
        @CustomType.Setter
        public Builder bandwidth(String bandwidth) {
            if (bandwidth == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "bandwidth");
            }
            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder bandwidthPackageBandwidth(String bandwidthPackageBandwidth) {
            if (bandwidthPackageBandwidth == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "bandwidthPackageBandwidth");
            }
            this.bandwidthPackageBandwidth = bandwidthPackageBandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            if (bandwidthPackageId == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "bandwidthPackageId");
            }
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        @CustomType.Setter
        public Builder bandwidthPackageType(String bandwidthPackageType) {
            if (bandwidthPackageType == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "bandwidthPackageType");
            }
            this.bandwidthPackageType = bandwidthPackageType;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder deletionProtection(Boolean deletionProtection) {
            if (deletionProtection == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "deletionProtection");
            }
            this.deletionProtection = deletionProtection;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder expiredTime(String expiredTime) {
            if (expiredTime == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "expiredTime");
            }
            this.expiredTime = expiredTime;
            return this;
        }
        @CustomType.Setter
        public Builder hasReservationData(String hasReservationData) {
            if (hasReservationData == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "hasReservationData");
            }
            this.hasReservationData = hasReservationData;
            return this;
        }
        @CustomType.Setter
        public Builder hdMonitorStatus(String hdMonitorStatus) {
            if (hdMonitorStatus == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "hdMonitorStatus");
            }
            this.hdMonitorStatus = hdMonitorStatus;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder instanceRegionId(String instanceRegionId) {
            if (instanceRegionId == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "instanceRegionId");
            }
            this.instanceRegionId = instanceRegionId;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            if (instanceType == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "instanceType");
            }
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder internetChargeType(String internetChargeType) {
            if (internetChargeType == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "internetChargeType");
            }
            this.internetChargeType = internetChargeType;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            if (ipAddress == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "ipAddress");
            }
            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder isp(String isp) {
            if (isp == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "isp");
            }
            this.isp = isp;
            return this;
        }
        @CustomType.Setter
        public Builder operationLocks(List<String> operationLocks) {
            if (operationLocks == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "operationLocks");
            }
            this.operationLocks = operationLocks;
            return this;
        }
        public Builder operationLocks(String... operationLocks) {
            return operationLocks(List.of(operationLocks));
        }
        @CustomType.Setter
        public Builder paymentType(String paymentType) {
            if (paymentType == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "paymentType");
            }
            this.paymentType = paymentType;
            return this;
        }
        @CustomType.Setter
        public Builder reservationActiveTime(String reservationActiveTime) {
            if (reservationActiveTime == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "reservationActiveTime");
            }
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        @CustomType.Setter
        public Builder reservationBandwidth(String reservationBandwidth) {
            if (reservationBandwidth == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "reservationBandwidth");
            }
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder reservationInternetChargeType(String reservationInternetChargeType) {
            if (reservationInternetChargeType == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "reservationInternetChargeType");
            }
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        @CustomType.Setter
        public Builder reservationOrderType(String reservationOrderType) {
            if (reservationOrderType == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "reservationOrderType");
            }
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            if (resourceGroupId == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "resourceGroupId");
            }
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder secondLimited(Boolean secondLimited) {
            if (secondLimited == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "secondLimited");
            }
            this.secondLimited = secondLimited;
            return this;
        }
        @CustomType.Setter
        public Builder segmentInstanceId(String segmentInstanceId) {
            if (segmentInstanceId == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "segmentInstanceId");
            }
            this.segmentInstanceId = segmentInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetEipAddressesAddress", "tags");
            }
            this.tags = tags;
            return this;
        }
        public GetEipAddressesAddress build() {
            final var _resultValue = new GetEipAddressesAddress();
            _resultValue.addressName = addressName;
            _resultValue.allocationId = allocationId;
            _resultValue.availableRegions = availableRegions;
            _resultValue.bandwidth = bandwidth;
            _resultValue.bandwidthPackageBandwidth = bandwidthPackageBandwidth;
            _resultValue.bandwidthPackageId = bandwidthPackageId;
            _resultValue.bandwidthPackageType = bandwidthPackageType;
            _resultValue.createTime = createTime;
            _resultValue.deletionProtection = deletionProtection;
            _resultValue.description = description;
            _resultValue.expiredTime = expiredTime;
            _resultValue.hasReservationData = hasReservationData;
            _resultValue.hdMonitorStatus = hdMonitorStatus;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.instanceRegionId = instanceRegionId;
            _resultValue.instanceType = instanceType;
            _resultValue.internetChargeType = internetChargeType;
            _resultValue.ipAddress = ipAddress;
            _resultValue.isp = isp;
            _resultValue.operationLocks = operationLocks;
            _resultValue.paymentType = paymentType;
            _resultValue.reservationActiveTime = reservationActiveTime;
            _resultValue.reservationBandwidth = reservationBandwidth;
            _resultValue.reservationInternetChargeType = reservationInternetChargeType;
            _resultValue.reservationOrderType = reservationOrderType;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.secondLimited = secondLimited;
            _resultValue.segmentInstanceId = segmentInstanceId;
            _resultValue.status = status;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}