// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNetworksVpc {
    /**
     * @return Filter results by a specific CIDR block. For example: &#34;172.16.0.0/12&#34;.
     * 
     */
    private String cidrBlock;
    /**
     * @return Time of creation.
     * 
     */
    private String creationTime;
    /**
     * @return Description of the VPC
     * 
     */
    private String description;
    /**
     * @return ID of the VPC.
     * 
     */
    private String id;
    /**
     * @return The IPv6 CIDR block of the VPC.
     * 
     */
    private String ipv6CidrBlock;
    /**
     * @return Indicate whether the VPC is the default one in the specified region.
     * 
     */
    private Boolean isDefault;
    /**
     * @return ID of the region where the VPC is located.
     * 
     */
    private String regionId;
    /**
     * @return The Id of resource group which VPC belongs.
     * 
     */
    private String resourceGroupId;
    /**
     * @return Route table ID of the VRouter.
     * 
     */
    private String routeTableId;
    /**
     * @return The ID of the VRouter.
     * 
     */
    private String routerId;
    /**
     * @return A list of secondary IPv4 CIDR blocks of the VPC.
     * 
     */
    private List<String> secondaryCidrBlocks;
    /**
     * @return Filter results by a specific status. Valid value are `Pending` and `Available`.
     * 
     */
    private String status;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private Map<String,Object> tags;
    /**
     * @return A list of user CIDRs.
     * 
     */
    private List<String> userCidrs;
    /**
     * @return ID of the VPC.
     * 
     */
    private String vpcId;
    /**
     * @return The name of the VPC.
     * 
     */
    private String vpcName;
    /**
     * @return ID of the VRouter.
     * 
     */
    private String vrouterId;
    /**
     * @return List of VSwitch IDs in the specified VPC
     * 
     */
    private List<String> vswitchIds;

    private GetNetworksVpc() {}
    /**
     * @return Filter results by a specific CIDR block. For example: &#34;172.16.0.0/12&#34;.
     * 
     */
    public String cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * @return Time of creation.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return Description of the VPC
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return ID of the VPC.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The IPv6 CIDR block of the VPC.
     * 
     */
    public String ipv6CidrBlock() {
        return this.ipv6CidrBlock;
    }
    /**
     * @return Indicate whether the VPC is the default one in the specified region.
     * 
     */
    public Boolean isDefault() {
        return this.isDefault;
    }
    /**
     * @return ID of the region where the VPC is located.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return The Id of resource group which VPC belongs.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return Route table ID of the VRouter.
     * 
     */
    public String routeTableId() {
        return this.routeTableId;
    }
    /**
     * @return The ID of the VRouter.
     * 
     */
    public String routerId() {
        return this.routerId;
    }
    /**
     * @return A list of secondary IPv4 CIDR blocks of the VPC.
     * 
     */
    public List<String> secondaryCidrBlocks() {
        return this.secondaryCidrBlocks;
    }
    /**
     * @return Filter results by a specific status. Valid value are `Pending` and `Available`.
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
    /**
     * @return A list of user CIDRs.
     * 
     */
    public List<String> userCidrs() {
        return this.userCidrs;
    }
    /**
     * @return ID of the VPC.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The name of the VPC.
     * 
     */
    public String vpcName() {
        return this.vpcName;
    }
    /**
     * @return ID of the VRouter.
     * 
     */
    public String vrouterId() {
        return this.vrouterId;
    }
    /**
     * @return List of VSwitch IDs in the specified VPC
     * 
     */
    public List<String> vswitchIds() {
        return this.vswitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworksVpc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidrBlock;
        private String creationTime;
        private String description;
        private String id;
        private String ipv6CidrBlock;
        private Boolean isDefault;
        private String regionId;
        private String resourceGroupId;
        private String routeTableId;
        private String routerId;
        private List<String> secondaryCidrBlocks;
        private String status;
        private Map<String,Object> tags;
        private List<String> userCidrs;
        private String vpcId;
        private String vpcName;
        private String vrouterId;
        private List<String> vswitchIds;
        public Builder() {}
        public Builder(GetNetworksVpc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.isDefault = defaults.isDefault;
    	      this.regionId = defaults.regionId;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.routeTableId = defaults.routeTableId;
    	      this.routerId = defaults.routerId;
    	      this.secondaryCidrBlocks = defaults.secondaryCidrBlocks;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.userCidrs = defaults.userCidrs;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcName = defaults.vpcName;
    	      this.vrouterId = defaults.vrouterId;
    	      this.vswitchIds = defaults.vswitchIds;
        }

        @CustomType.Setter
        public Builder cidrBlock(String cidrBlock) {
            if (cidrBlock == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "cidrBlock");
            }
            this.cidrBlock = cidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            if (creationTime == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "creationTime");
            }
            this.creationTime = creationTime;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            if (ipv6CidrBlock == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "ipv6CidrBlock");
            }
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder isDefault(Boolean isDefault) {
            if (isDefault == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "isDefault");
            }
            this.isDefault = isDefault;
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            if (regionId == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "regionId");
            }
            this.regionId = regionId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            if (resourceGroupId == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "resourceGroupId");
            }
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder routeTableId(String routeTableId) {
            if (routeTableId == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "routeTableId");
            }
            this.routeTableId = routeTableId;
            return this;
        }
        @CustomType.Setter
        public Builder routerId(String routerId) {
            if (routerId == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "routerId");
            }
            this.routerId = routerId;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryCidrBlocks(List<String> secondaryCidrBlocks) {
            if (secondaryCidrBlocks == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "secondaryCidrBlocks");
            }
            this.secondaryCidrBlocks = secondaryCidrBlocks;
            return this;
        }
        public Builder secondaryCidrBlocks(String... secondaryCidrBlocks) {
            return secondaryCidrBlocks(List.of(secondaryCidrBlocks));
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder userCidrs(List<String> userCidrs) {
            if (userCidrs == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "userCidrs");
            }
            this.userCidrs = userCidrs;
            return this;
        }
        public Builder userCidrs(String... userCidrs) {
            return userCidrs(List.of(userCidrs));
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vpcName(String vpcName) {
            if (vpcName == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "vpcName");
            }
            this.vpcName = vpcName;
            return this;
        }
        @CustomType.Setter
        public Builder vrouterId(String vrouterId) {
            if (vrouterId == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "vrouterId");
            }
            this.vrouterId = vrouterId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchIds(List<String> vswitchIds) {
            if (vswitchIds == null) {
              throw new MissingRequiredPropertyException("GetNetworksVpc", "vswitchIds");
            }
            this.vswitchIds = vswitchIds;
            return this;
        }
        public Builder vswitchIds(String... vswitchIds) {
            return vswitchIds(List.of(vswitchIds));
        }
        public GetNetworksVpc build() {
            final var _resultValue = new GetNetworksVpc();
            _resultValue.cidrBlock = cidrBlock;
            _resultValue.creationTime = creationTime;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.ipv6CidrBlock = ipv6CidrBlock;
            _resultValue.isDefault = isDefault;
            _resultValue.regionId = regionId;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.routeTableId = routeTableId;
            _resultValue.routerId = routerId;
            _resultValue.secondaryCidrBlocks = secondaryCidrBlocks;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.userCidrs = userCidrs;
            _resultValue.vpcId = vpcId;
            _resultValue.vpcName = vpcName;
            _resultValue.vrouterId = vrouterId;
            _resultValue.vswitchIds = vswitchIds;
            return _resultValue;
        }
    }
}