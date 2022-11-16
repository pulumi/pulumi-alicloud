// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetApplicationLoadBalancersSlb {
    /**
     * @return Service address of the SLBs.
     * 
     */
    private final String address;
    private final String creationTime;
    /**
     * @return ID of the SLB.
     * 
     */
    private final String id;
    private final Boolean internet;
    private final String masterAvailabilityZone;
    private final String name;
    /**
     * @return Network type of the SLBs. Valid values: `vpc` and `classic`.
     * 
     */
    private final String networkType;
    private final String regionId;
    private final String slaveAvailabilityZone;
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
    private GetApplicationLoadBalancersSlb(
        @CustomType.Parameter("address") String address,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("internet") Boolean internet,
        @CustomType.Parameter("masterAvailabilityZone") String masterAvailabilityZone,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkType") String networkType,
        @CustomType.Parameter("regionId") String regionId,
        @CustomType.Parameter("slaveAvailabilityZone") String slaveAvailabilityZone,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") Map<String,Object> tags,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("vswitchId") String vswitchId) {
        this.address = address;
        this.creationTime = creationTime;
        this.id = id;
        this.internet = internet;
        this.masterAvailabilityZone = masterAvailabilityZone;
        this.name = name;
        this.networkType = networkType;
        this.regionId = regionId;
        this.slaveAvailabilityZone = slaveAvailabilityZone;
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

    public static Builder builder(GetApplicationLoadBalancersSlb defaults) {
        return new Builder(defaults);
    }

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
        private Map<String,Object> tags;
        private String vpcId;
        private String vswitchId;

        public Builder() {
    	      // Empty
        }

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

        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder internet(Boolean internet) {
            this.internet = Objects.requireNonNull(internet);
            return this;
        }
        public Builder masterAvailabilityZone(String masterAvailabilityZone) {
            this.masterAvailabilityZone = Objects.requireNonNull(masterAvailabilityZone);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        public Builder slaveAvailabilityZone(String slaveAvailabilityZone) {
            this.slaveAvailabilityZone = Objects.requireNonNull(slaveAvailabilityZone);
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
        }        public GetApplicationLoadBalancersSlb build() {
            return new GetApplicationLoadBalancersSlb(address, creationTime, id, internet, masterAvailabilityZone, name, networkType, regionId, slaveAvailabilityZone, status, tags, vpcId, vswitchId);
        }
    }
}