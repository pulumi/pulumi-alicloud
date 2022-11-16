// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRulesRuleCompliance {
    /**
     * @return The compliance evaluation result of the target resources.
     * 
     */
    private final String complianceType;
    /**
     * @return The number of resources with the specified compliance evaluation result.
     * 
     */
    private final Integer count;

    @CustomType.Constructor
    private GetRulesRuleCompliance(
        @CustomType.Parameter("complianceType") String complianceType,
        @CustomType.Parameter("count") Integer count) {
        this.complianceType = complianceType;
        this.count = count;
    }

    /**
     * @return The compliance evaluation result of the target resources.
     * 
     */
    public String complianceType() {
        return this.complianceType;
    }
    /**
     * @return The number of resources with the specified compliance evaluation result.
     * 
     */
    public Integer count() {
        return this.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesRuleCompliance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String complianceType;
        private Integer count;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRulesRuleCompliance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceType = defaults.complianceType;
    	      this.count = defaults.count;
        }

        public Builder complianceType(String complianceType) {
            this.complianceType = Objects.requireNonNull(complianceType);
            return this;
        }
        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }        public GetRulesRuleCompliance build() {
            return new GetRulesRuleCompliance(complianceType, count);
        }
    }
}