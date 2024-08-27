// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.alicloud.fc.outputs.V3FunctionInstanceLifecycleConfigInitializer;
import com.pulumi.alicloud.fc.outputs.V3FunctionInstanceLifecycleConfigPreStop;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V3FunctionInstanceLifecycleConfig {
    /**
     * @return Initializer handler method configuration. See `initializer` below.
     * 
     */
    private @Nullable V3FunctionInstanceLifecycleConfigInitializer initializer;
    /**
     * @return PreStop handler method configuration. See `pre_stop` below.
     * 
     */
    private @Nullable V3FunctionInstanceLifecycleConfigPreStop preStop;

    private V3FunctionInstanceLifecycleConfig() {}
    /**
     * @return Initializer handler method configuration. See `initializer` below.
     * 
     */
    public Optional<V3FunctionInstanceLifecycleConfigInitializer> initializer() {
        return Optional.ofNullable(this.initializer);
    }
    /**
     * @return PreStop handler method configuration. See `pre_stop` below.
     * 
     */
    public Optional<V3FunctionInstanceLifecycleConfigPreStop> preStop() {
        return Optional.ofNullable(this.preStop);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V3FunctionInstanceLifecycleConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable V3FunctionInstanceLifecycleConfigInitializer initializer;
        private @Nullable V3FunctionInstanceLifecycleConfigPreStop preStop;
        public Builder() {}
        public Builder(V3FunctionInstanceLifecycleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initializer = defaults.initializer;
    	      this.preStop = defaults.preStop;
        }

        @CustomType.Setter
        public Builder initializer(@Nullable V3FunctionInstanceLifecycleConfigInitializer initializer) {

            this.initializer = initializer;
            return this;
        }
        @CustomType.Setter
        public Builder preStop(@Nullable V3FunctionInstanceLifecycleConfigPreStop preStop) {

            this.preStop = preStop;
            return this;
        }
        public V3FunctionInstanceLifecycleConfig build() {
            final var _resultValue = new V3FunctionInstanceLifecycleConfig();
            _resultValue.initializer = initializer;
            _resultValue.preStop = preStop;
            return _resultValue;
        }
    }
}