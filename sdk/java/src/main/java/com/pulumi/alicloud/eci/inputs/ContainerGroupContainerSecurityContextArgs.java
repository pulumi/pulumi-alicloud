// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.inputs;

import com.pulumi.alicloud.eci.inputs.ContainerGroupContainerSecurityContextCapabilityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerGroupContainerSecurityContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerGroupContainerSecurityContextArgs Empty = new ContainerGroupContainerSecurityContextArgs();

    @Import(name="capabilities")
    private @Nullable Output<List<ContainerGroupContainerSecurityContextCapabilityArgs>> capabilities;

    public Optional<Output<List<ContainerGroupContainerSecurityContextCapabilityArgs>>> capabilities() {
        return Optional.ofNullable(this.capabilities);
    }

    @Import(name="privileged")
    private @Nullable Output<Boolean> privileged;

    public Optional<Output<Boolean>> privileged() {
        return Optional.ofNullable(this.privileged);
    }

    @Import(name="runAsUser")
    private @Nullable Output<Integer> runAsUser;

    public Optional<Output<Integer>> runAsUser() {
        return Optional.ofNullable(this.runAsUser);
    }

    private ContainerGroupContainerSecurityContextArgs() {}

    private ContainerGroupContainerSecurityContextArgs(ContainerGroupContainerSecurityContextArgs $) {
        this.capabilities = $.capabilities;
        this.privileged = $.privileged;
        this.runAsUser = $.runAsUser;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerGroupContainerSecurityContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerGroupContainerSecurityContextArgs $;

        public Builder() {
            $ = new ContainerGroupContainerSecurityContextArgs();
        }

        public Builder(ContainerGroupContainerSecurityContextArgs defaults) {
            $ = new ContainerGroupContainerSecurityContextArgs(Objects.requireNonNull(defaults));
        }

        public Builder capabilities(@Nullable Output<List<ContainerGroupContainerSecurityContextCapabilityArgs>> capabilities) {
            $.capabilities = capabilities;
            return this;
        }

        public Builder capabilities(List<ContainerGroupContainerSecurityContextCapabilityArgs> capabilities) {
            return capabilities(Output.of(capabilities));
        }

        public Builder capabilities(ContainerGroupContainerSecurityContextCapabilityArgs... capabilities) {
            return capabilities(List.of(capabilities));
        }

        public Builder privileged(@Nullable Output<Boolean> privileged) {
            $.privileged = privileged;
            return this;
        }

        public Builder privileged(Boolean privileged) {
            return privileged(Output.of(privileged));
        }

        public Builder runAsUser(@Nullable Output<Integer> runAsUser) {
            $.runAsUser = runAsUser;
            return this;
        }

        public Builder runAsUser(Integer runAsUser) {
            return runAsUser(Output.of(runAsUser));
        }

        public ContainerGroupContainerSecurityContextArgs build() {
            return $;
        }
    }

}