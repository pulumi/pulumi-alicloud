// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.maxcompute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QuotaPlanQuotaParameter {
    /**
     * @return The value of elastic Reserved CUs.
     * 
     * &gt; **NOTE:**  The total number of elastically reserved CUs in all the level-2 quotas is equal to the number of elastically reserved CUs in the level-1 quota..
     * 
     */
    private Integer elasticReservedCu;
    /**
     * @return The value of maxCU in Reserved CUs.
     * 
     */
    private @Nullable Integer maxCu;
    /**
     * @return The value of minCU in Reserved CUs.
     * 
     */
    private @Nullable Integer minCu;

    private QuotaPlanQuotaParameter() {}
    /**
     * @return The value of elastic Reserved CUs.
     * 
     * &gt; **NOTE:**  The total number of elastically reserved CUs in all the level-2 quotas is equal to the number of elastically reserved CUs in the level-1 quota..
     * 
     */
    public Integer elasticReservedCu() {
        return this.elasticReservedCu;
    }
    /**
     * @return The value of maxCU in Reserved CUs.
     * 
     */
    public Optional<Integer> maxCu() {
        return Optional.ofNullable(this.maxCu);
    }
    /**
     * @return The value of minCU in Reserved CUs.
     * 
     */
    public Optional<Integer> minCu() {
        return Optional.ofNullable(this.minCu);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuotaPlanQuotaParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer elasticReservedCu;
        private @Nullable Integer maxCu;
        private @Nullable Integer minCu;
        public Builder() {}
        public Builder(QuotaPlanQuotaParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elasticReservedCu = defaults.elasticReservedCu;
    	      this.maxCu = defaults.maxCu;
    	      this.minCu = defaults.minCu;
        }

        @CustomType.Setter
        public Builder elasticReservedCu(Integer elasticReservedCu) {
            if (elasticReservedCu == null) {
              throw new MissingRequiredPropertyException("QuotaPlanQuotaParameter", "elasticReservedCu");
            }
            this.elasticReservedCu = elasticReservedCu;
            return this;
        }
        @CustomType.Setter
        public Builder maxCu(@Nullable Integer maxCu) {

            this.maxCu = maxCu;
            return this;
        }
        @CustomType.Setter
        public Builder minCu(@Nullable Integer minCu) {

            this.minCu = minCu;
            return this;
        }
        public QuotaPlanQuotaParameter build() {
            final var _resultValue = new QuotaPlanQuotaParameter();
            _resultValue.elasticReservedCu = elasticReservedCu;
            _resultValue.maxCu = maxCu;
            _resultValue.minCu = minCu;
            return _resultValue;
        }
    }
}
