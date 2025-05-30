// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZonesZoneSupportedResource {
    /**
     * @return The type of IP address.
     * 
     */
    private String addressIpVersion;
    /**
     * @return The type of network.
     * 
     */
    private String addressType;

    private GetZonesZoneSupportedResource() {}
    /**
     * @return The type of IP address.
     * 
     */
    public String addressIpVersion() {
        return this.addressIpVersion;
    }
    /**
     * @return The type of network.
     * 
     */
    public String addressType() {
        return this.addressType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZonesZoneSupportedResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String addressIpVersion;
        private String addressType;
        public Builder() {}
        public Builder(GetZonesZoneSupportedResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressIpVersion = defaults.addressIpVersion;
    	      this.addressType = defaults.addressType;
        }

        @CustomType.Setter
        public Builder addressIpVersion(String addressIpVersion) {
            if (addressIpVersion == null) {
              throw new MissingRequiredPropertyException("GetZonesZoneSupportedResource", "addressIpVersion");
            }
            this.addressIpVersion = addressIpVersion;
            return this;
        }
        @CustomType.Setter
        public Builder addressType(String addressType) {
            if (addressType == null) {
              throw new MissingRequiredPropertyException("GetZonesZoneSupportedResource", "addressType");
            }
            this.addressType = addressType;
            return this;
        }
        public GetZonesZoneSupportedResource build() {
            final var _resultValue = new GetZonesZoneSupportedResource();
            _resultValue.addressIpVersion = addressIpVersion;
            _resultValue.addressType = addressType;
            return _resultValue;
        }
    }
}
