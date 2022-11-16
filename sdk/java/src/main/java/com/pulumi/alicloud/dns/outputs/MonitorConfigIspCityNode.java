// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MonitorConfigIspCityNode {
    /**
     * @return The code of the city node to monitor.
     * 
     */
    private final String cityCode;
    /**
     * @return The code of the Internet provider service (ISP) node to monitor.
     * 
     */
    private final String ispCode;

    @CustomType.Constructor
    private MonitorConfigIspCityNode(
        @CustomType.Parameter("cityCode") String cityCode,
        @CustomType.Parameter("ispCode") String ispCode) {
        this.cityCode = cityCode;
        this.ispCode = ispCode;
    }

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

    public static final class Builder {
        private String cityCode;
        private String ispCode;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorConfigIspCityNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cityCode = defaults.cityCode;
    	      this.ispCode = defaults.ispCode;
        }

        public Builder cityCode(String cityCode) {
            this.cityCode = Objects.requireNonNull(cityCode);
            return this;
        }
        public Builder ispCode(String ispCode) {
            this.ispCode = Objects.requireNonNull(ispCode);
            return this;
        }        public MonitorConfigIspCityNode build() {
            return new MonitorConfigIspCityNode(cityCode, ispCode);
        }
    }
}