// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.governance.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BaselineBaselineItem {
    /**
     * @return Baseline item configuration. The format is a JSON string.
     * 
     */
    private @Nullable String config;
    /**
     * @return The baseline item name.
     * 
     */
    private @Nullable String name;
    /**
     * @return The baseline item version.
     * 
     */
    private @Nullable String version;

    private BaselineBaselineItem() {}
    /**
     * @return Baseline item configuration. The format is a JSON string.
     * 
     */
    public Optional<String> config() {
        return Optional.ofNullable(this.config);
    }
    /**
     * @return The baseline item name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The baseline item version.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BaselineBaselineItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String config;
        private @Nullable String name;
        private @Nullable String version;
        public Builder() {}
        public Builder(BaselineBaselineItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder config(@Nullable String config) {

            this.config = config;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        public BaselineBaselineItem build() {
            final var _resultValue = new BaselineBaselineItem();
            _resultValue.config = config;
            _resultValue.name = name;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
