// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V3AsyncInvokeConfigDestinationConfigOnFailure {
    /**
     * @return Asynchronous call target Resource Descriptor
     * 
     */
    private @Nullable String destination;

    private V3AsyncInvokeConfigDestinationConfigOnFailure() {}
    /**
     * @return Asynchronous call target Resource Descriptor
     * 
     */
    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V3AsyncInvokeConfigDestinationConfigOnFailure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destination;
        public Builder() {}
        public Builder(V3AsyncInvokeConfigDestinationConfigOnFailure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        @CustomType.Setter
        public Builder destination(@Nullable String destination) {

            this.destination = destination;
            return this;
        }
        public V3AsyncInvokeConfigDestinationConfigOnFailure build() {
            final var _resultValue = new V3AsyncInvokeConfigDestinationConfigOnFailure();
            _resultValue.destination = destination;
            return _resultValue;
        }
    }
}
