// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SyntheticTaskCommonSettingCustomHostHost {
    /**
     * @return Domain Name.
     * 
     */
    private String domain;
    /**
     * @return IpType.
     * 
     */
    private Integer ipType;
    /**
     * @return The IP list.
     * 
     */
    private List<String> ips;

    private SyntheticTaskCommonSettingCustomHostHost() {}
    /**
     * @return Domain Name.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return IpType.
     * 
     */
    public Integer ipType() {
        return this.ipType;
    }
    /**
     * @return The IP list.
     * 
     */
    public List<String> ips() {
        return this.ips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticTaskCommonSettingCustomHostHost defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String domain;
        private Integer ipType;
        private List<String> ips;
        public Builder() {}
        public Builder(SyntheticTaskCommonSettingCustomHostHost defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.ipType = defaults.ipType;
    	      this.ips = defaults.ips;
        }

        @CustomType.Setter
        public Builder domain(String domain) {
            if (domain == null) {
              throw new MissingRequiredPropertyException("SyntheticTaskCommonSettingCustomHostHost", "domain");
            }
            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder ipType(Integer ipType) {
            if (ipType == null) {
              throw new MissingRequiredPropertyException("SyntheticTaskCommonSettingCustomHostHost", "ipType");
            }
            this.ipType = ipType;
            return this;
        }
        @CustomType.Setter
        public Builder ips(List<String> ips) {
            if (ips == null) {
              throw new MissingRequiredPropertyException("SyntheticTaskCommonSettingCustomHostHost", "ips");
            }
            this.ips = ips;
            return this;
        }
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }
        public SyntheticTaskCommonSettingCustomHostHost build() {
            final var _resultValue = new SyntheticTaskCommonSettingCustomHostHost();
            _resultValue.domain = domain;
            _resultValue.ipType = ipType;
            _resultValue.ips = ips;
            return _resultValue;
        }
    }
}