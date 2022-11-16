// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerGroupEciSecurityContextSysctl {
    /**
     * @return The name of the security context that the container group runs.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The variable value of the security context that the container group runs.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private ContainerGroupEciSecurityContextSysctl(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("value") @Nullable String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return The name of the security context that the container group runs.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The variable value of the security context that the container group runs.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupEciSecurityContextSysctl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerGroupEciSecurityContextSysctl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public ContainerGroupEciSecurityContextSysctl build() {
            return new ContainerGroupEciSecurityContextSysctl(name, value);
        }
    }
}