// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetVpcCenTrFirewallsFirewallIpsConfig {
    /**
     * @return Basic rule switch. Value:-**1**: On-**0**: Closed state.
     * 
     */
    private Integer basicRules;
    /**
     * @return Virtual patch switch. Value:-**1**: On-**0**: Closed state.
     * 
     */
    private Integer enableAllPatch;
    /**
     * @return IPS defense mode. Value:-**1**: Intercept mode-**0**: Observation mode.
     * 
     */
    private Integer runMode;

    private GetVpcCenTrFirewallsFirewallIpsConfig() {}
    /**
     * @return Basic rule switch. Value:-**1**: On-**0**: Closed state.
     * 
     */
    public Integer basicRules() {
        return this.basicRules;
    }
    /**
     * @return Virtual patch switch. Value:-**1**: On-**0**: Closed state.
     * 
     */
    public Integer enableAllPatch() {
        return this.enableAllPatch;
    }
    /**
     * @return IPS defense mode. Value:-**1**: Intercept mode-**0**: Observation mode.
     * 
     */
    public Integer runMode() {
        return this.runMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcCenTrFirewallsFirewallIpsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer basicRules;
        private Integer enableAllPatch;
        private Integer runMode;
        public Builder() {}
        public Builder(GetVpcCenTrFirewallsFirewallIpsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicRules = defaults.basicRules;
    	      this.enableAllPatch = defaults.enableAllPatch;
    	      this.runMode = defaults.runMode;
        }

        @CustomType.Setter
        public Builder basicRules(Integer basicRules) {
            if (basicRules == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewallIpsConfig", "basicRules");
            }
            this.basicRules = basicRules;
            return this;
        }
        @CustomType.Setter
        public Builder enableAllPatch(Integer enableAllPatch) {
            if (enableAllPatch == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewallIpsConfig", "enableAllPatch");
            }
            this.enableAllPatch = enableAllPatch;
            return this;
        }
        @CustomType.Setter
        public Builder runMode(Integer runMode) {
            if (runMode == null) {
              throw new MissingRequiredPropertyException("GetVpcCenTrFirewallsFirewallIpsConfig", "runMode");
            }
            this.runMode = runMode;
            return this;
        }
        public GetVpcCenTrFirewallsFirewallIpsConfig build() {
            final var _resultValue = new GetVpcCenTrFirewallsFirewallIpsConfig();
            _resultValue.basicRules = basicRules;
            _resultValue.enableAllPatch = enableAllPatch;
            _resultValue.runMode = runMode;
            return _resultValue;
        }
    }
}
