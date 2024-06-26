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
public final class ServiceMeshMeshConfigOpa {
    private @Nullable Boolean enabled;
    private @Nullable String limitCpu;
    private @Nullable String limitMemory;
    private @Nullable String logLevel;
    private @Nullable String requestCpu;
    private @Nullable String requestMemory;

    private ServiceMeshMeshConfigOpa() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> limitCpu() {
        return Optional.ofNullable(this.limitCpu);
    }
    public Optional<String> limitMemory() {
        return Optional.ofNullable(this.limitMemory);
    }
    public Optional<String> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }
    public Optional<String> requestCpu() {
        return Optional.ofNullable(this.requestCpu);
    }
    public Optional<String> requestMemory() {
        return Optional.ofNullable(this.requestMemory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMeshMeshConfigOpa defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String limitCpu;
        private @Nullable String limitMemory;
        private @Nullable String logLevel;
        private @Nullable String requestCpu;
        private @Nullable String requestMemory;
        public Builder() {}
        public Builder(ServiceMeshMeshConfigOpa defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.limitCpu = defaults.limitCpu;
    	      this.limitMemory = defaults.limitMemory;
    	      this.logLevel = defaults.logLevel;
    	      this.requestCpu = defaults.requestCpu;
    	      this.requestMemory = defaults.requestMemory;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder limitCpu(@Nullable String limitCpu) {

            this.limitCpu = limitCpu;
            return this;
        }
        @CustomType.Setter
        public Builder limitMemory(@Nullable String limitMemory) {

            this.limitMemory = limitMemory;
            return this;
        }
        @CustomType.Setter
        public Builder logLevel(@Nullable String logLevel) {

            this.logLevel = logLevel;
            return this;
        }
        @CustomType.Setter
        public Builder requestCpu(@Nullable String requestCpu) {

            this.requestCpu = requestCpu;
            return this;
        }
        @CustomType.Setter
        public Builder requestMemory(@Nullable String requestMemory) {

            this.requestMemory = requestMemory;
            return this;
        }
        public ServiceMeshMeshConfigOpa build() {
            final var _resultValue = new ServiceMeshMeshConfigOpa();
            _resultValue.enabled = enabled;
            _resultValue.limitCpu = limitCpu;
            _resultValue.limitMemory = limitMemory;
            _resultValue.logLevel = logLevel;
            _resultValue.requestCpu = requestCpu;
            _resultValue.requestMemory = requestMemory;
            return _resultValue;
        }
    }
}
