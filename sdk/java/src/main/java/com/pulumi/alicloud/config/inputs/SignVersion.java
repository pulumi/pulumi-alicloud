// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.config.inputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SignVersion {
    private @Nullable String oss;
    private @Nullable String sls;

    private SignVersion() {}
    public Optional<String> oss() {
        return Optional.ofNullable(this.oss);
    }
    public Optional<String> sls() {
        return Optional.ofNullable(this.sls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String oss;
        private @Nullable String sls;
        public Builder() {}
        public Builder(SignVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oss = defaults.oss;
    	      this.sls = defaults.sls;
        }

        @CustomType.Setter
        public Builder oss(@Nullable String oss) {

            this.oss = oss;
            return this;
        }
        @CustomType.Setter
        public Builder sls(@Nullable String sls) {

            this.sls = sls;
            return this;
        }
        public SignVersion build() {
            final var _resultValue = new SignVersion();
            _resultValue.oss = oss;
            _resultValue.sls = sls;
            return _resultValue;
        }
    }
}