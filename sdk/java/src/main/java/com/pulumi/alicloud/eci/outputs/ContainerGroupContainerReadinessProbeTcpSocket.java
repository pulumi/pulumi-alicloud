// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerGroupContainerReadinessProbeTcpSocket {
    private @Nullable Integer port;

    private ContainerGroupContainerReadinessProbeTcpSocket() {}
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupContainerReadinessProbeTcpSocket defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer port;
        public Builder() {}
        public Builder(ContainerGroupContainerReadinessProbeTcpSocket defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        public ContainerGroupContainerReadinessProbeTcpSocket build() {
            final var _resultValue = new ContainerGroupContainerReadinessProbeTcpSocket();
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
