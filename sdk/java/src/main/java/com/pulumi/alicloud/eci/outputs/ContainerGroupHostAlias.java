// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerGroupHostAlias {
    /**
     * @return The information about the host.
     * 
     */
    private @Nullable List<String> hostnames;
    /**
     * @return The IP address of the host.
     * 
     */
    private @Nullable String ip;

    private ContainerGroupHostAlias() {}
    /**
     * @return The information about the host.
     * 
     */
    public List<String> hostnames() {
        return this.hostnames == null ? List.of() : this.hostnames;
    }
    /**
     * @return The IP address of the host.
     * 
     */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupHostAlias defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> hostnames;
        private @Nullable String ip;
        public Builder() {}
        public Builder(ContainerGroupHostAlias defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostnames = defaults.hostnames;
    	      this.ip = defaults.ip;
        }

        @CustomType.Setter
        public Builder hostnames(@Nullable List<String> hostnames) {

            this.hostnames = hostnames;
            return this;
        }
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {

            this.ip = ip;
            return this;
        }
        public ContainerGroupHostAlias build() {
            final var _resultValue = new ContainerGroupHostAlias();
            _resultValue.hostnames = hostnames;
            _resultValue.ip = ip;
            return _resultValue;
        }
    }
}
