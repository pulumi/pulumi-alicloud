// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.maxcompute.outputs;

import com.pulumi.alicloud.maxcompute.outputs.QuotaPlanQuotaSubQuotaInfoListParameter;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QuotaPlanQuotaSubQuotaInfoList {
    /**
     * @return The nickname of the level-2 quota.
     * 
     */
    private String nickName;
    /**
     * @return The parameters of level-1 quota.
     * 
     */
    private @Nullable QuotaPlanQuotaSubQuotaInfoListParameter parameter;

    private QuotaPlanQuotaSubQuotaInfoList() {}
    /**
     * @return The nickname of the level-2 quota.
     * 
     */
    public String nickName() {
        return this.nickName;
    }
    /**
     * @return The parameters of level-1 quota.
     * 
     */
    public Optional<QuotaPlanQuotaSubQuotaInfoListParameter> parameter() {
        return Optional.ofNullable(this.parameter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuotaPlanQuotaSubQuotaInfoList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String nickName;
        private @Nullable QuotaPlanQuotaSubQuotaInfoListParameter parameter;
        public Builder() {}
        public Builder(QuotaPlanQuotaSubQuotaInfoList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nickName = defaults.nickName;
    	      this.parameter = defaults.parameter;
        }

        @CustomType.Setter
        public Builder nickName(String nickName) {
            if (nickName == null) {
              throw new MissingRequiredPropertyException("QuotaPlanQuotaSubQuotaInfoList", "nickName");
            }
            this.nickName = nickName;
            return this;
        }
        @CustomType.Setter
        public Builder parameter(@Nullable QuotaPlanQuotaSubQuotaInfoListParameter parameter) {

            this.parameter = parameter;
            return this;
        }
        public QuotaPlanQuotaSubQuotaInfoList build() {
            final var _resultValue = new QuotaPlanQuotaSubQuotaInfoList();
            _resultValue.nickName = nickName;
            _resultValue.parameter = parameter;
            return _resultValue;
        }
    }
}
