// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V3CustomDomainRouteConfigRouteRewriteConfigEqualRule {
    /**
     * @return Matching Rules
     * 
     */
    private @Nullable String match;
    /**
     * @return Replace Rules
     * 
     */
    private @Nullable String replacement;

    private V3CustomDomainRouteConfigRouteRewriteConfigEqualRule() {}
    /**
     * @return Matching Rules
     * 
     */
    public Optional<String> match() {
        return Optional.ofNullable(this.match);
    }
    /**
     * @return Replace Rules
     * 
     */
    public Optional<String> replacement() {
        return Optional.ofNullable(this.replacement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V3CustomDomainRouteConfigRouteRewriteConfigEqualRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String match;
        private @Nullable String replacement;
        public Builder() {}
        public Builder(V3CustomDomainRouteConfigRouteRewriteConfigEqualRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
    	      this.replacement = defaults.replacement;
        }

        @CustomType.Setter
        public Builder match(@Nullable String match) {

            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder replacement(@Nullable String replacement) {

            this.replacement = replacement;
            return this;
        }
        public V3CustomDomainRouteConfigRouteRewriteConfigEqualRule build() {
            final var _resultValue = new V3CustomDomainRouteConfigRouteRewriteConfigEqualRule();
            _resultValue.match = match;
            _resultValue.replacement = replacement;
            return _resultValue;
        }
    }
}
