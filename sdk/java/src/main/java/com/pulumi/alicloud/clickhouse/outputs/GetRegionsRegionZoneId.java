// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.clickhouse.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionsRegionZoneId {
    /**
     * @return Whether to support vpc network.
     * 
     */
    private Boolean vpcEnabled;
    /**
     * @return The zone ID.
     * 
     */
    private String zoneId;

    private GetRegionsRegionZoneId() {}
    /**
     * @return Whether to support vpc network.
     * 
     */
    public Boolean vpcEnabled() {
        return this.vpcEnabled;
    }
    /**
     * @return The zone ID.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionsRegionZoneId defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean vpcEnabled;
        private String zoneId;
        public Builder() {}
        public Builder(GetRegionsRegionZoneId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcEnabled = defaults.vpcEnabled;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder vpcEnabled(Boolean vpcEnabled) {
            if (vpcEnabled == null) {
              throw new MissingRequiredPropertyException("GetRegionsRegionZoneId", "vpcEnabled");
            }
            this.vpcEnabled = vpcEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetRegionsRegionZoneId", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetRegionsRegionZoneId build() {
            final var _resultValue = new GetRegionsRegionZoneId();
            _resultValue.vpcEnabled = vpcEnabled;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
