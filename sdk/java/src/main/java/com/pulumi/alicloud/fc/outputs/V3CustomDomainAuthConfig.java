// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V3CustomDomainAuthConfig {
    /**
     * @return Authentication Information.
     * 
     */
    private @Nullable String authInfo;
    /**
     * @return Authentication type. anonymous, function, or jwt.
     * 
     */
    private @Nullable String authType;

    private V3CustomDomainAuthConfig() {}
    /**
     * @return Authentication Information.
     * 
     */
    public Optional<String> authInfo() {
        return Optional.ofNullable(this.authInfo);
    }
    /**
     * @return Authentication type. anonymous, function, or jwt.
     * 
     */
    public Optional<String> authType() {
        return Optional.ofNullable(this.authType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V3CustomDomainAuthConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authInfo;
        private @Nullable String authType;
        public Builder() {}
        public Builder(V3CustomDomainAuthConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authInfo = defaults.authInfo;
    	      this.authType = defaults.authType;
        }

        @CustomType.Setter
        public Builder authInfo(@Nullable String authInfo) {

            this.authInfo = authInfo;
            return this;
        }
        @CustomType.Setter
        public Builder authType(@Nullable String authType) {

            this.authType = authType;
            return this;
        }
        public V3CustomDomainAuthConfig build() {
            final var _resultValue = new V3CustomDomainAuthConfig();
            _resultValue.authInfo = authInfo;
            _resultValue.authType = authType;
            return _resultValue;
        }
    }
}