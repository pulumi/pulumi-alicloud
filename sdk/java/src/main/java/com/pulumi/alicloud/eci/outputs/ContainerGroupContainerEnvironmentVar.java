// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.alicloud.eci.outputs.ContainerGroupContainerEnvironmentVarFieldRef;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerGroupContainerEnvironmentVar {
    private @Nullable List<ContainerGroupContainerEnvironmentVarFieldRef> fieldReves;
    private @Nullable String key;
    private @Nullable String value;

    private ContainerGroupContainerEnvironmentVar() {}
    public List<ContainerGroupContainerEnvironmentVarFieldRef> fieldReves() {
        return this.fieldReves == null ? List.of() : this.fieldReves;
    }
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupContainerEnvironmentVar defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ContainerGroupContainerEnvironmentVarFieldRef> fieldReves;
        private @Nullable String key;
        private @Nullable String value;
        public Builder() {}
        public Builder(ContainerGroupContainerEnvironmentVar defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldReves = defaults.fieldReves;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder fieldReves(@Nullable List<ContainerGroupContainerEnvironmentVarFieldRef> fieldReves) {

            this.fieldReves = fieldReves;
            return this;
        }
        public Builder fieldReves(ContainerGroupContainerEnvironmentVarFieldRef... fieldReves) {
            return fieldReves(List.of(fieldReves));
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public ContainerGroupContainerEnvironmentVar build() {
            final var _resultValue = new ContainerGroupContainerEnvironmentVar();
            _resultValue.fieldReves = fieldReves;
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
