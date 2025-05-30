// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dfs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZonesZoneOption {
    /**
     * @return The protocol type. Valid values: `HDFS`.
     * 
     */
    private String protocolType;
    /**
     * @return The storage specifications of the File system. Valid values: `PERFORMANCE`, `STANDARD`.
     * 
     */
    private String storageType;

    private GetZonesZoneOption() {}
    /**
     * @return The protocol type. Valid values: `HDFS`.
     * 
     */
    public String protocolType() {
        return this.protocolType;
    }
    /**
     * @return The storage specifications of the File system. Valid values: `PERFORMANCE`, `STANDARD`.
     * 
     */
    public String storageType() {
        return this.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZonesZoneOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String protocolType;
        private String storageType;
        public Builder() {}
        public Builder(GetZonesZoneOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocolType = defaults.protocolType;
    	      this.storageType = defaults.storageType;
        }

        @CustomType.Setter
        public Builder protocolType(String protocolType) {
            if (protocolType == null) {
              throw new MissingRequiredPropertyException("GetZonesZoneOption", "protocolType");
            }
            this.protocolType = protocolType;
            return this;
        }
        @CustomType.Setter
        public Builder storageType(String storageType) {
            if (storageType == null) {
              throw new MissingRequiredPropertyException("GetZonesZoneOption", "storageType");
            }
            this.storageType = storageType;
            return this;
        }
        public GetZonesZoneOption build() {
            final var _resultValue = new GetZonesZoneOption();
            _resultValue.protocolType = protocolType;
            _resultValue.storageType = storageType;
            return _resultValue;
        }
    }
}
