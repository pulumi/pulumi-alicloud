// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MonitorConfigIspCityNode {
    /**
     * @return The code of the city node to monitor.
     * 
     */
    private String cityCode;
    /**
     * @return The code of the Internet provider service (ISP) node to monitor.
     * 
     */
    private String ispCode;

    private MonitorConfigIspCityNode() {}
    /**
     * @return The code of the city node to monitor.
     * 
     */
    public String cityCode() {
        return this.cityCode;
    }
    /**
     * @return The code of the Internet provider service (ISP) node to monitor.
     * 
     */
    public String ispCode() {
        return this.ispCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorConfigIspCityNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cityCode;
        private String ispCode;
        public Builder() {}
        public Builder(MonitorConfigIspCityNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cityCode = defaults.cityCode;
    	      this.ispCode = defaults.ispCode;
        }

        @CustomType.Setter
        public Builder cityCode(String cityCode) {
            if (cityCode == null) {
              throw new MissingRequiredPropertyException("MonitorConfigIspCityNode", "cityCode");
            }
            this.cityCode = cityCode;
            return this;
        }
        @CustomType.Setter
        public Builder ispCode(String ispCode) {
            if (ispCode == null) {
              throw new MissingRequiredPropertyException("MonitorConfigIspCityNode", "ispCode");
            }
            this.ispCode = ispCode;
            return this;
        }
        public MonitorConfigIspCityNode build() {
            final var _resultValue = new MonitorConfigIspCityNode();
            _resultValue.cityCode = cityCode;
            _resultValue.ispCode = ispCode;
            return _resultValue;
        }
    }
}