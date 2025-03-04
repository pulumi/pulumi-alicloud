// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetApplicationLoadBalancersSlb {
    /**
     * @return Service address of the SLBs.
     * 
     */
    private String address;
    private String creationTime;
    /**
     * @return ID of the SLB.
     * 
     */
    private String id;
    private Boolean internet;
    private String masterAvailabilityZone;
    private String name;
    /**
     * @return Network type of the SLBs. Valid values: `vpc` and `classic`.
     * 
     */
    private String networkType;
    private String regionId;
    private String slaveAvailabilityZone;
    /**
     * @return SLB current status. Possible values: `inactive`, `active` and `locked`.
     * 
     */
    private String status;
    /**
     * @return A map of tags assigned to the SLB instances. The `tags` can have a maximum of 5 tag. It must be in the format:
     * 
     */
    private Map<String,String> tags;
    /**
     * @return ID of the VPC linked to the SLBs.
     * 
     */
    private String vpcId;
    /**
     * @return ID of the vSwitch linked to the SLBs.
     * 
     */
    private String vswitchId;

    private GetApplicationLoadBalancersSlb() {}
    /**
     * @return Service address of the SLBs.
     * 
     */
    public String address() {
        return this.address;
    }
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return ID of the SLB.
     * 
     */
    public String id() {
        return this.id;
    }
    public Boolean internet() {
        return this.internet;
    }
    public String masterAvailabilityZone() {
        return this.masterAvailabilityZone;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Network type of the SLBs. Valid values: `vpc` and `classic`.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    public String regionId() {
        return this.regionId;
    }
    public String slaveAvailabilityZone() {
        return this.slaveAvailabilityZone;
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
    public Map<String,String> tags() {
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
     * @return ID of the vSwitch linked to the SLBs.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationLoadBalancersSlb defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String creationTime;
        private String id;
        private Boolean internet;
        private String masterAvailabilityZone;
        private String name;
        private String networkType;
        private String regionId;
        private String slaveAvailabilityZone;
        private String status;
        private Map<String,String> tags;
        private String vpcId;
        private String vswitchId;
        public Builder() {}
        public Builder(GetApplicationLoadBalancersSlb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.creationTime = defaults.creationTime;
    	      this.id = defaults.id;
    	      this.internet = defaults.internet;
    	      this.masterAvailabilityZone = defaults.masterAvailabilityZone;
    	      this.name = defaults.name;
    	      this.networkType = defaults.networkType;
    	      this.regionId = defaults.regionId;
    	      this.slaveAvailabilityZone = defaults.slaveAvailabilityZone;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersSlb", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            if (creationTime == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersSlb", "creationTime");
            }
            this.creationTime = creationTime;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersSlb", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder internet(Boolean internet) {
            if (internet == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersSlb", "internet");
            }
            this.internet = internet;
            return this;
        }
        @CustomType.Setter
        public Builder masterAvailabilityZone(String masterAvailabilityZone) {
            if (masterAvailabilityZone == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersSlb", "masterAvailabilityZone");
            }
            this.masterAvailabilityZone = masterAvailabilityZone;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersSlb", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networkType(String networkType) {
            if (networkType == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersSlb", "networkType");
            }
            this.networkType = networkType;
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            if (regionId == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersSlb", "regionId");
            }
            this.regionId = regionId;
            return this;
        }
        @CustomType.Setter
        public Builder slaveAvailabilityZone(String slaveAvailabilityZone) {
            if (slaveAvailabilityZone == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersSlb", "slaveAvailabilityZone");
            }
            this.slaveAvailabilityZone = slaveAvailabilityZone;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersSlb", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersSlb", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersSlb", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            if (vswitchId == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersSlb", "vswitchId");
            }
            this.vswitchId = vswitchId;
            return this;
        }
        public GetApplicationLoadBalancersSlb build() {
            final var _resultValue = new GetApplicationLoadBalancersSlb();
            _resultValue.address = address;
            _resultValue.creationTime = creationTime;
            _resultValue.id = id;
            _resultValue.internet = internet;
            _resultValue.masterAvailabilityZone = masterAvailabilityZone;
            _resultValue.name = name;
            _resultValue.networkType = networkType;
            _resultValue.regionId = regionId;
            _resultValue.slaveAvailabilityZone = slaveAvailabilityZone;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchId = vswitchId;
            return _resultValue;
        }
    }
}
