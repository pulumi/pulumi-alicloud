// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiJobResourceSettingsOfflineResourceSettings {
    /**
     * @return Scheduling resource group cu
     * 
     */
    private @Nullable Double requestedCu;
    /**
     * @return Scheduling resource group name
     * 
     */
    private @Nullable String resourceGroupIdentifier;

    private DiJobResourceSettingsOfflineResourceSettings() {}
    /**
     * @return Scheduling resource group cu
     * 
     */
    public Optional<Double> requestedCu() {
        return Optional.ofNullable(this.requestedCu);
    }
    /**
     * @return Scheduling resource group name
     * 
     */
    public Optional<String> resourceGroupIdentifier() {
        return Optional.ofNullable(this.resourceGroupIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiJobResourceSettingsOfflineResourceSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double requestedCu;
        private @Nullable String resourceGroupIdentifier;
        public Builder() {}
        public Builder(DiJobResourceSettingsOfflineResourceSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestedCu = defaults.requestedCu;
    	      this.resourceGroupIdentifier = defaults.resourceGroupIdentifier;
        }

        @CustomType.Setter
        public Builder requestedCu(@Nullable Double requestedCu) {

            this.requestedCu = requestedCu;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupIdentifier(@Nullable String resourceGroupIdentifier) {

            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public DiJobResourceSettingsOfflineResourceSettings build() {
            final var _resultValue = new DiJobResourceSettingsOfflineResourceSettings();
            _resultValue.requestedCu = requestedCu;
            _resultValue.resourceGroupIdentifier = resourceGroupIdentifier;
            return _resultValue;
        }
    }
}
