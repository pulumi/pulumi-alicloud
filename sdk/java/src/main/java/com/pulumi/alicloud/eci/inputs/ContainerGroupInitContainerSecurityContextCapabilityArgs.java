// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerGroupInitContainerSecurityContextCapabilityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerGroupInitContainerSecurityContextCapabilityArgs Empty = new ContainerGroupInitContainerSecurityContextCapabilityArgs();

    @Import(name="adds")
    private @Nullable Output<List<String>> adds;

    public Optional<Output<List<String>>> adds() {
        return Optional.ofNullable(this.adds);
    }

    private ContainerGroupInitContainerSecurityContextCapabilityArgs() {}

    private ContainerGroupInitContainerSecurityContextCapabilityArgs(ContainerGroupInitContainerSecurityContextCapabilityArgs $) {
        this.adds = $.adds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerGroupInitContainerSecurityContextCapabilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerGroupInitContainerSecurityContextCapabilityArgs $;

        public Builder() {
            $ = new ContainerGroupInitContainerSecurityContextCapabilityArgs();
        }

        public Builder(ContainerGroupInitContainerSecurityContextCapabilityArgs defaults) {
            $ = new ContainerGroupInitContainerSecurityContextCapabilityArgs(Objects.requireNonNull(defaults));
        }

        public Builder adds(@Nullable Output<List<String>> adds) {
            $.adds = adds;
            return this;
        }

        public Builder adds(List<String> adds) {
            return adds(Output.of(adds));
        }

        public Builder adds(String... adds) {
            return adds(List.of(adds));
        }

        public ContainerGroupInitContainerSecurityContextCapabilityArgs build() {
            return $;
        }
    }

}