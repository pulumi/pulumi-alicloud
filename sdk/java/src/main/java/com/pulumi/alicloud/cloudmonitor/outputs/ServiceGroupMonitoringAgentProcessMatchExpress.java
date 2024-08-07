// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudmonitor.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceGroupMonitoringAgentProcessMatchExpress {
    /**
     * @return The matching condition. Valid values: `all`, `startWith`, `endWith`, `contains`, `notContains`, `equals`.
     * 
     */
    private @Nullable String function;
    /**
     * @return The criteria based on which the instances are matched.
     * 
     */
    private @Nullable String name;
    /**
     * @return The keyword used to match the instance name.
     * 
     */
    private @Nullable String value;

    private ServiceGroupMonitoringAgentProcessMatchExpress() {}
    /**
     * @return The matching condition. Valid values: `all`, `startWith`, `endWith`, `contains`, `notContains`, `equals`.
     * 
     */
    public Optional<String> function() {
        return Optional.ofNullable(this.function);
    }
    /**
     * @return The criteria based on which the instances are matched.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The keyword used to match the instance name.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceGroupMonitoringAgentProcessMatchExpress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String function;
        private @Nullable String name;
        private @Nullable String value;
        public Builder() {}
        public Builder(ServiceGroupMonitoringAgentProcessMatchExpress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder function(@Nullable String function) {

            this.function = function;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public ServiceGroupMonitoringAgentProcessMatchExpress build() {
            final var _resultValue = new ServiceGroupMonitoringAgentProcessMatchExpress();
            _resultValue.function = function;
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
