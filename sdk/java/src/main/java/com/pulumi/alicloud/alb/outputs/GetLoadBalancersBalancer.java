// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.alicloud.alb.outputs.GetLoadBalancersBalancerAccessLogConfig;
import com.pulumi.alicloud.alb.outputs.GetLoadBalancersBalancerDeletionProtectionConfig;
import com.pulumi.alicloud.alb.outputs.GetLoadBalancersBalancerLoadBalancerBillingConfig;
import com.pulumi.alicloud.alb.outputs.GetLoadBalancersBalancerLoadBalancerOperationLock;
import com.pulumi.alicloud.alb.outputs.GetLoadBalancersBalancerModificationProtectionConfig;
import com.pulumi.alicloud.alb.outputs.GetLoadBalancersBalancerZoneMapping;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetLoadBalancersBalancer {
    /**
     * @return The Access Logging Configuration Structure.
     * 
     */
    private List<GetLoadBalancersBalancerAccessLogConfig> accessLogConfigs;
    /**
     * @return The method in which IP addresses are assigned. Valid values:  Fixed: The ALB instance
     * uses a fixed IP address. Dynamic (default): An IP address is dynamically assigned to each zone of the ALB
     * instance.
     * 
     */
    private String addressAllocatedMode;
    /**
     * @return The type of IP address that the ALB instance uses to provide services.
     * 
     */
    private String addressType;
    /**
     * @return The ID of the EIP bandwidth plan which is associated with an ALB instance that uses a
     * public IP address.
     * 
     */
    private String bandwidthPackageId;
    /**
     * @return The creation time of the resource.
     * 
     */
    private String createTime;
    /**
     * @return Remove the Protection Configuration.
     * 
     */
    private List<GetLoadBalancersBalancerDeletionProtectionConfig> deletionProtectionConfigs;
    /**
     * @return DNS Domain Name.
     * 
     */
    private String dnsName;
    /**
     * @return The ID of the Load Balancer.
     * 
     */
    private String id;
    /**
     * @return The configuration of the billing method.
     * 
     */
    private List<GetLoadBalancersBalancerLoadBalancerBillingConfig> loadBalancerBillingConfigs;
    /**
     * @return Load Balancing of the Service Status. Valid Values: `Abnormal` and `Normal`. **NOTE:** Available in 1.142.0+
     * 
     */
    private String loadBalancerBusinessStatus;
    /**
     * @return Load Balancing of the Service Status. Valid Values: `Abnormal` and `Normal`.  **NOTE:** Field &#39;load_balancer_bussiness_status&#39; has been deprecated from provider version 1.142.0.
     * 
     * @deprecated
     * Field &#39;load_balancer_bussiness_status&#39; has been deprecated from provider version 1.142.0 and it will be removed in the future version. Please use the new parameter &#39;load_balancer_business_status&#39; instead.
     * 
     */
    @Deprecated /* Field 'load_balancer_bussiness_status' has been deprecated from provider version 1.142.0 and it will be removed in the future version. Please use the new parameter 'load_balancer_business_status' instead. */
    private String loadBalancerBussinessStatus;
    /**
     * @return The edition of the ALB instance.
     * 
     */
    private String loadBalancerEdition;
    /**
     * @return The first ID of the resource.
     * 
     */
    private String loadBalancerId;
    /**
     * @return The name of the resource.
     * 
     */
    private String loadBalancerName;
    /**
     * @return The Load Balancing Operations Lock Configuration.
     * 
     */
    private List<GetLoadBalancersBalancerLoadBalancerOperationLock> loadBalancerOperationLocks;
    /**
     * @return Modify the Protection Configuration.
     * 
     */
    private List<GetLoadBalancersBalancerModificationProtectionConfig> modificationProtectionConfigs;
    /**
     * @return The ID of the resource group.
     * 
     */
    private String resourceGroupId;
    /**
     * @return The The load balancer status. Valid values: `Active`, `Configuring`, `CreateFailed`, `Inactive` and `Provisioning`.
     * 
     */
    private String status;
    /**
     * @return The tag of the resource.
     * 
     */
    private Map<String,Object> tags;
    /**
     * @return The ID of the virtual private cloud (VPC) where the ALB instance is deployed.
     * 
     */
    private String vpcId;
    /**
     * @return The zones and vSwitches. You must specify at least two zones.
     * 
     */
    private List<GetLoadBalancersBalancerZoneMapping> zoneMappings;

    private GetLoadBalancersBalancer() {}
    /**
     * @return The Access Logging Configuration Structure.
     * 
     */
    public List<GetLoadBalancersBalancerAccessLogConfig> accessLogConfigs() {
        return this.accessLogConfigs;
    }
    /**
     * @return The method in which IP addresses are assigned. Valid values:  Fixed: The ALB instance
     * uses a fixed IP address. Dynamic (default): An IP address is dynamically assigned to each zone of the ALB
     * instance.
     * 
     */
    public String addressAllocatedMode() {
        return this.addressAllocatedMode;
    }
    /**
     * @return The type of IP address that the ALB instance uses to provide services.
     * 
     */
    public String addressType() {
        return this.addressType;
    }
    /**
     * @return The ID of the EIP bandwidth plan which is associated with an ALB instance that uses a
     * public IP address.
     * 
     */
    public String bandwidthPackageId() {
        return this.bandwidthPackageId;
    }
    /**
     * @return The creation time of the resource.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Remove the Protection Configuration.
     * 
     */
    public List<GetLoadBalancersBalancerDeletionProtectionConfig> deletionProtectionConfigs() {
        return this.deletionProtectionConfigs;
    }
    /**
     * @return DNS Domain Name.
     * 
     */
    public String dnsName() {
        return this.dnsName;
    }
    /**
     * @return The ID of the Load Balancer.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The configuration of the billing method.
     * 
     */
    public List<GetLoadBalancersBalancerLoadBalancerBillingConfig> loadBalancerBillingConfigs() {
        return this.loadBalancerBillingConfigs;
    }
    /**
     * @return Load Balancing of the Service Status. Valid Values: `Abnormal` and `Normal`. **NOTE:** Available in 1.142.0+
     * 
     */
    public String loadBalancerBusinessStatus() {
        return this.loadBalancerBusinessStatus;
    }
    /**
     * @return Load Balancing of the Service Status. Valid Values: `Abnormal` and `Normal`.  **NOTE:** Field &#39;load_balancer_bussiness_status&#39; has been deprecated from provider version 1.142.0.
     * 
     * @deprecated
     * Field &#39;load_balancer_bussiness_status&#39; has been deprecated from provider version 1.142.0 and it will be removed in the future version. Please use the new parameter &#39;load_balancer_business_status&#39; instead.
     * 
     */
    @Deprecated /* Field 'load_balancer_bussiness_status' has been deprecated from provider version 1.142.0 and it will be removed in the future version. Please use the new parameter 'load_balancer_business_status' instead. */
    public String loadBalancerBussinessStatus() {
        return this.loadBalancerBussinessStatus;
    }
    /**
     * @return The edition of the ALB instance.
     * 
     */
    public String loadBalancerEdition() {
        return this.loadBalancerEdition;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String loadBalancerName() {
        return this.loadBalancerName;
    }
    /**
     * @return The Load Balancing Operations Lock Configuration.
     * 
     */
    public List<GetLoadBalancersBalancerLoadBalancerOperationLock> loadBalancerOperationLocks() {
        return this.loadBalancerOperationLocks;
    }
    /**
     * @return Modify the Protection Configuration.
     * 
     */
    public List<GetLoadBalancersBalancerModificationProtectionConfig> modificationProtectionConfigs() {
        return this.modificationProtectionConfigs;
    }
    /**
     * @return The ID of the resource group.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The The load balancer status. Valid values: `Active`, `Configuring`, `CreateFailed`, `Inactive` and `Provisioning`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The tag of the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return The ID of the virtual private cloud (VPC) where the ALB instance is deployed.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The zones and vSwitches. You must specify at least two zones.
     * 
     */
    public List<GetLoadBalancersBalancerZoneMapping> zoneMappings() {
        return this.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersBalancer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetLoadBalancersBalancerAccessLogConfig> accessLogConfigs;
        private String addressAllocatedMode;
        private String addressType;
        private String bandwidthPackageId;
        private String createTime;
        private List<GetLoadBalancersBalancerDeletionProtectionConfig> deletionProtectionConfigs;
        private String dnsName;
        private String id;
        private List<GetLoadBalancersBalancerLoadBalancerBillingConfig> loadBalancerBillingConfigs;
        private String loadBalancerBusinessStatus;
        private String loadBalancerBussinessStatus;
        private String loadBalancerEdition;
        private String loadBalancerId;
        private String loadBalancerName;
        private List<GetLoadBalancersBalancerLoadBalancerOperationLock> loadBalancerOperationLocks;
        private List<GetLoadBalancersBalancerModificationProtectionConfig> modificationProtectionConfigs;
        private String resourceGroupId;
        private String status;
        private Map<String,Object> tags;
        private String vpcId;
        private List<GetLoadBalancersBalancerZoneMapping> zoneMappings;
        public Builder() {}
        public Builder(GetLoadBalancersBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogConfigs = defaults.accessLogConfigs;
    	      this.addressAllocatedMode = defaults.addressAllocatedMode;
    	      this.addressType = defaults.addressType;
    	      this.bandwidthPackageId = defaults.bandwidthPackageId;
    	      this.createTime = defaults.createTime;
    	      this.deletionProtectionConfigs = defaults.deletionProtectionConfigs;
    	      this.dnsName = defaults.dnsName;
    	      this.id = defaults.id;
    	      this.loadBalancerBillingConfigs = defaults.loadBalancerBillingConfigs;
    	      this.loadBalancerBusinessStatus = defaults.loadBalancerBusinessStatus;
    	      this.loadBalancerBussinessStatus = defaults.loadBalancerBussinessStatus;
    	      this.loadBalancerEdition = defaults.loadBalancerEdition;
    	      this.loadBalancerId = defaults.loadBalancerId;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.loadBalancerOperationLocks = defaults.loadBalancerOperationLocks;
    	      this.modificationProtectionConfigs = defaults.modificationProtectionConfigs;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.zoneMappings = defaults.zoneMappings;
        }

        @CustomType.Setter
        public Builder accessLogConfigs(List<GetLoadBalancersBalancerAccessLogConfig> accessLogConfigs) {
            if (accessLogConfigs == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "accessLogConfigs");
            }
            this.accessLogConfigs = accessLogConfigs;
            return this;
        }
        public Builder accessLogConfigs(GetLoadBalancersBalancerAccessLogConfig... accessLogConfigs) {
            return accessLogConfigs(List.of(accessLogConfigs));
        }
        @CustomType.Setter
        public Builder addressAllocatedMode(String addressAllocatedMode) {
            if (addressAllocatedMode == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "addressAllocatedMode");
            }
            this.addressAllocatedMode = addressAllocatedMode;
            return this;
        }
        @CustomType.Setter
        public Builder addressType(String addressType) {
            if (addressType == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "addressType");
            }
            this.addressType = addressType;
            return this;
        }
        @CustomType.Setter
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            if (bandwidthPackageId == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "bandwidthPackageId");
            }
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder deletionProtectionConfigs(List<GetLoadBalancersBalancerDeletionProtectionConfig> deletionProtectionConfigs) {
            if (deletionProtectionConfigs == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "deletionProtectionConfigs");
            }
            this.deletionProtectionConfigs = deletionProtectionConfigs;
            return this;
        }
        public Builder deletionProtectionConfigs(GetLoadBalancersBalancerDeletionProtectionConfig... deletionProtectionConfigs) {
            return deletionProtectionConfigs(List.of(deletionProtectionConfigs));
        }
        @CustomType.Setter
        public Builder dnsName(String dnsName) {
            if (dnsName == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "dnsName");
            }
            this.dnsName = dnsName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerBillingConfigs(List<GetLoadBalancersBalancerLoadBalancerBillingConfig> loadBalancerBillingConfigs) {
            if (loadBalancerBillingConfigs == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "loadBalancerBillingConfigs");
            }
            this.loadBalancerBillingConfigs = loadBalancerBillingConfigs;
            return this;
        }
        public Builder loadBalancerBillingConfigs(GetLoadBalancersBalancerLoadBalancerBillingConfig... loadBalancerBillingConfigs) {
            return loadBalancerBillingConfigs(List.of(loadBalancerBillingConfigs));
        }
        @CustomType.Setter
        public Builder loadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
            if (loadBalancerBusinessStatus == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "loadBalancerBusinessStatus");
            }
            this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerBussinessStatus(String loadBalancerBussinessStatus) {
            if (loadBalancerBussinessStatus == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "loadBalancerBussinessStatus");
            }
            this.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerEdition(String loadBalancerEdition) {
            if (loadBalancerEdition == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "loadBalancerEdition");
            }
            this.loadBalancerEdition = loadBalancerEdition;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerId(String loadBalancerId) {
            if (loadBalancerId == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "loadBalancerId");
            }
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerName(String loadBalancerName) {
            if (loadBalancerName == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "loadBalancerName");
            }
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerOperationLocks(List<GetLoadBalancersBalancerLoadBalancerOperationLock> loadBalancerOperationLocks) {
            if (loadBalancerOperationLocks == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "loadBalancerOperationLocks");
            }
            this.loadBalancerOperationLocks = loadBalancerOperationLocks;
            return this;
        }
        public Builder loadBalancerOperationLocks(GetLoadBalancersBalancerLoadBalancerOperationLock... loadBalancerOperationLocks) {
            return loadBalancerOperationLocks(List.of(loadBalancerOperationLocks));
        }
        @CustomType.Setter
        public Builder modificationProtectionConfigs(List<GetLoadBalancersBalancerModificationProtectionConfig> modificationProtectionConfigs) {
            if (modificationProtectionConfigs == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "modificationProtectionConfigs");
            }
            this.modificationProtectionConfigs = modificationProtectionConfigs;
            return this;
        }
        public Builder modificationProtectionConfigs(GetLoadBalancersBalancerModificationProtectionConfig... modificationProtectionConfigs) {
            return modificationProtectionConfigs(List.of(modificationProtectionConfigs));
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            if (resourceGroupId == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "resourceGroupId");
            }
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder zoneMappings(List<GetLoadBalancersBalancerZoneMapping> zoneMappings) {
            if (zoneMappings == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancer", "zoneMappings");
            }
            this.zoneMappings = zoneMappings;
            return this;
        }
        public Builder zoneMappings(GetLoadBalancersBalancerZoneMapping... zoneMappings) {
            return zoneMappings(List.of(zoneMappings));
        }
        public GetLoadBalancersBalancer build() {
            final var _resultValue = new GetLoadBalancersBalancer();
            _resultValue.accessLogConfigs = accessLogConfigs;
            _resultValue.addressAllocatedMode = addressAllocatedMode;
            _resultValue.addressType = addressType;
            _resultValue.bandwidthPackageId = bandwidthPackageId;
            _resultValue.createTime = createTime;
            _resultValue.deletionProtectionConfigs = deletionProtectionConfigs;
            _resultValue.dnsName = dnsName;
            _resultValue.id = id;
            _resultValue.loadBalancerBillingConfigs = loadBalancerBillingConfigs;
            _resultValue.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
            _resultValue.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
            _resultValue.loadBalancerEdition = loadBalancerEdition;
            _resultValue.loadBalancerId = loadBalancerId;
            _resultValue.loadBalancerName = loadBalancerName;
            _resultValue.loadBalancerOperationLocks = loadBalancerOperationLocks;
            _resultValue.modificationProtectionConfigs = modificationProtectionConfigs;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.vpcId = vpcId;
            _resultValue.zoneMappings = zoneMappings;
            return _resultValue;
        }
    }
}