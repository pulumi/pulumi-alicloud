// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayLogConfigSls {
    /**
     * @return Enable Log Service
     * 
     */
    private @Nullable Boolean enable;

    private GatewayLogConfigSls() {}
    /**
     * @return Enable Log Service
     * 
     */
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayLogConfigSls defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enable;
        public Builder() {}
        public Builder(GatewayLogConfigSls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        @CustomType.Setter
        public Builder enable(@Nullable Boolean enable) {

            this.enable = enable;
            return this;
        }
        public GatewayLogConfigSls build() {
            final var _resultValue = new GatewayLogConfigSls();
            _resultValue.enable = enable;
            return _resultValue;
        }
    }
}