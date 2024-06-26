// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pvtz.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZonesZoneBindVpc {
    /**
     * @return Binding the regionId of VPC.
     * 
     */
    private String regionId;
    /**
     * @return Binding the regionName of VPC.
     * 
     */
    private String regionName;
    /**
     * @return Binding the vpcId of VPC.
     * 
     */
    private String vpcId;
    private String vpcName;

    private GetZonesZoneBindVpc() {}
    /**
     * @return Binding the regionId of VPC.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return Binding the regionName of VPC.
     * 
     */
    public String regionName() {
        return this.regionName;
    }
    /**
     * @return Binding the vpcId of VPC.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    public String vpcName() {
        return this.vpcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZonesZoneBindVpc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String regionId;
        private String regionName;
        private String vpcId;
        private String vpcName;
        public Builder() {}
        public Builder(GetZonesZoneBindVpc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionId = defaults.regionId;
    	      this.regionName = defaults.regionName;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcName = defaults.vpcName;
        }

        @CustomType.Setter
        public Builder regionId(String regionId) {
            if (regionId == null) {
              throw new MissingRequiredPropertyException("GetZonesZoneBindVpc", "regionId");
            }
            this.regionId = regionId;
            return this;
        }
        @CustomType.Setter
        public Builder regionName(String regionName) {
            if (regionName == null) {
              throw new MissingRequiredPropertyException("GetZonesZoneBindVpc", "regionName");
            }
            this.regionName = regionName;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetZonesZoneBindVpc", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vpcName(String vpcName) {
            if (vpcName == null) {
              throw new MissingRequiredPropertyException("GetZonesZoneBindVpc", "vpcName");
            }
            this.vpcName = vpcName;
            return this;
        }
        public GetZonesZoneBindVpc build() {
            final var _resultValue = new GetZonesZoneBindVpc();
            _resultValue.regionId = regionId;
            _resultValue.regionName = regionName;
            _resultValue.vpcId = vpcId;
            _resultValue.vpcName = vpcName;
            return _resultValue;
        }
    }
}
