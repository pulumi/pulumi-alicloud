// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WafRuleRateLimitStatus {
    private @Nullable String code;
    private @Nullable Integer count;
    private @Nullable Integer ratio;

    private WafRuleRateLimitStatus() {}
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    public Optional<Integer> ratio() {
        return Optional.ofNullable(this.ratio);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WafRuleRateLimitStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String code;
        private @Nullable Integer count;
        private @Nullable Integer ratio;
        public Builder() {}
        public Builder(WafRuleRateLimitStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.count = defaults.count;
    	      this.ratio = defaults.ratio;
        }

        @CustomType.Setter
        public Builder code(@Nullable String code) {

            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder count(@Nullable Integer count) {

            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder ratio(@Nullable Integer ratio) {

            this.ratio = ratio;
            return this;
        }
        public WafRuleRateLimitStatus build() {
            final var _resultValue = new WafRuleRateLimitStatus();
            _resultValue.code = code;
            _resultValue.count = count;
            _resultValue.ratio = ratio;
            return _resultValue;
        }
    }
}