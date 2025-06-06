// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceMeshMeshConfigSidecarInjectorInitCniConfiguration {
    /**
     * @return Enable CNI
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The excluded namespace
     * 
     */
    private @Nullable String excludeNamespaces;

    private ServiceMeshMeshConfigSidecarInjectorInitCniConfiguration() {}
    /**
     * @return Enable CNI
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The excluded namespace
     * 
     */
    public Optional<String> excludeNamespaces() {
        return Optional.ofNullable(this.excludeNamespaces);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMeshMeshConfigSidecarInjectorInitCniConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String excludeNamespaces;
        public Builder() {}
        public Builder(ServiceMeshMeshConfigSidecarInjectorInitCniConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.excludeNamespaces = defaults.excludeNamespaces;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder excludeNamespaces(@Nullable String excludeNamespaces) {

            this.excludeNamespaces = excludeNamespaces;
            return this;
        }
        public ServiceMeshMeshConfigSidecarInjectorInitCniConfiguration build() {
            final var _resultValue = new ServiceMeshMeshConfigSidecarInjectorInitCniConfiguration();
            _resultValue.enabled = enabled;
            _resultValue.excludeNamespaces = excludeNamespaces;
            return _resultValue;
        }
    }
}
