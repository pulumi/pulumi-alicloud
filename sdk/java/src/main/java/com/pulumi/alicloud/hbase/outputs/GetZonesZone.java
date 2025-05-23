// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbase.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetZonesZone {
    /**
     * @return ID of the zone.
     * 
     */
    private String id;
    /**
     * @return A list of zone ids in which the multi zone. Removed from v1.99.0.
     * 
     */
    private List<String> multiZoneIds;

    private GetZonesZone() {}
    /**
     * @return ID of the zone.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of zone ids in which the multi zone. Removed from v1.99.0.
     * 
     */
    public List<String> multiZoneIds() {
        return this.multiZoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZonesZone defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> multiZoneIds;
        public Builder() {}
        public Builder(GetZonesZone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.multiZoneIds = defaults.multiZoneIds;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZonesZone", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder multiZoneIds(List<String> multiZoneIds) {
            if (multiZoneIds == null) {
              throw new MissingRequiredPropertyException("GetZonesZone", "multiZoneIds");
            }
            this.multiZoneIds = multiZoneIds;
            return this;
        }
        public Builder multiZoneIds(String... multiZoneIds) {
            return multiZoneIds(List.of(multiZoneIds));
        }
        public GetZonesZone build() {
            final var _resultValue = new GetZonesZone();
            _resultValue.id = id;
            _resultValue.multiZoneIds = multiZoneIds;
            return _resultValue;
        }
    }
}
