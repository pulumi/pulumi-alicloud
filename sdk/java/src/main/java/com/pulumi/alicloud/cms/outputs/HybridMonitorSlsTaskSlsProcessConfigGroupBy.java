// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HybridMonitorSlsTaskSlsProcessConfigGroupBy {
    /**
     * @return The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    private final @Nullable String alias;
    /**
     * @return The name of the key that is used to filter logs imported from Log Service.
     * 
     */
    private final @Nullable String slsKeyName;

    @CustomType.Constructor
    private HybridMonitorSlsTaskSlsProcessConfigGroupBy(
        @CustomType.Parameter("alias") @Nullable String alias,
        @CustomType.Parameter("slsKeyName") @Nullable String slsKeyName) {
        this.alias = alias;
        this.slsKeyName = slsKeyName;
    }

    /**
     * @return The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    public Optional<String> alias() {
        return Optional.ofNullable(this.alias);
    }
    /**
     * @return The name of the key that is used to filter logs imported from Log Service.
     * 
     */
    public Optional<String> slsKeyName() {
        return Optional.ofNullable(this.slsKeyName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridMonitorSlsTaskSlsProcessConfigGroupBy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alias;
        private @Nullable String slsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridMonitorSlsTaskSlsProcessConfigGroupBy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.slsKeyName = defaults.slsKeyName;
        }

        public Builder alias(@Nullable String alias) {
            this.alias = alias;
            return this;
        }
        public Builder slsKeyName(@Nullable String slsKeyName) {
            this.slsKeyName = slsKeyName;
            return this;
        }        public HybridMonitorSlsTaskSlsProcessConfigGroupBy build() {
            return new HybridMonitorSlsTaskSlsProcessConfigGroupBy(alias, slsKeyName);
        }
    }
}