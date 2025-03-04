// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerGroupInitContainerPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerGroupInitContainerPortArgs Empty = new ContainerGroupInitContainerPortArgs();

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private ContainerGroupInitContainerPortArgs() {}

    private ContainerGroupInitContainerPortArgs(ContainerGroupInitContainerPortArgs $) {
        this.port = $.port;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerGroupInitContainerPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerGroupInitContainerPortArgs $;

        public Builder() {
            $ = new ContainerGroupInitContainerPortArgs();
        }

        public Builder(ContainerGroupInitContainerPortArgs defaults) {
            $ = new ContainerGroupInitContainerPortArgs(Objects.requireNonNull(defaults));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public ContainerGroupInitContainerPortArgs build() {
            return $;
        }
    }

}
