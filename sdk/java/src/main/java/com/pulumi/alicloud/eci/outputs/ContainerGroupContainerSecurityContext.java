// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.alicloud.eci.outputs.ContainerGroupContainerSecurityContextCapability;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerGroupContainerSecurityContext {
    private @Nullable List<ContainerGroupContainerSecurityContextCapability> capabilities;
    private @Nullable Boolean privileged;
    private @Nullable Integer runAsUser;

    private ContainerGroupContainerSecurityContext() {}
    public List<ContainerGroupContainerSecurityContextCapability> capabilities() {
        return this.capabilities == null ? List.of() : this.capabilities;
    }
    public Optional<Boolean> privileged() {
        return Optional.ofNullable(this.privileged);
    }
    public Optional<Integer> runAsUser() {
        return Optional.ofNullable(this.runAsUser);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupContainerSecurityContext defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ContainerGroupContainerSecurityContextCapability> capabilities;
        private @Nullable Boolean privileged;
        private @Nullable Integer runAsUser;
        public Builder() {}
        public Builder(ContainerGroupContainerSecurityContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.privileged = defaults.privileged;
    	      this.runAsUser = defaults.runAsUser;
        }

        @CustomType.Setter
        public Builder capabilities(@Nullable List<ContainerGroupContainerSecurityContextCapability> capabilities) {

            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(ContainerGroupContainerSecurityContextCapability... capabilities) {
            return capabilities(List.of(capabilities));
        }
        @CustomType.Setter
        public Builder privileged(@Nullable Boolean privileged) {

            this.privileged = privileged;
            return this;
        }
        @CustomType.Setter
        public Builder runAsUser(@Nullable Integer runAsUser) {

            this.runAsUser = runAsUser;
            return this;
        }
        public ContainerGroupContainerSecurityContext build() {
            final var _resultValue = new ContainerGroupContainerSecurityContext();
            _resultValue.capabilities = capabilities;
            _resultValue.privileged = privileged;
            _resultValue.runAsUser = runAsUser;
            return _resultValue;
        }
    }
}