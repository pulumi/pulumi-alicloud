// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayNetworkAccessConfig {
    /**
     * @return Network Access Type
     * 
     */
    private @Nullable String type;

    private GatewayNetworkAccessConfig() {}
    /**
     * @return Network Access Type
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayNetworkAccessConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String type;
        public Builder() {}
        public Builder(GatewayNetworkAccessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public GatewayNetworkAccessConfig build() {
            final var _resultValue = new GatewayNetworkAccessConfig();
            _resultValue.type = type;
            return _resultValue;
        }
    }
}