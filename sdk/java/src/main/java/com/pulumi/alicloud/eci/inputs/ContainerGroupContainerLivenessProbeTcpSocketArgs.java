// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerGroupContainerLivenessProbeTcpSocketArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerGroupContainerLivenessProbeTcpSocketArgs Empty = new ContainerGroupContainerLivenessProbeTcpSocketArgs();

    /**
     * The port number. Valid values: 1 to 65535.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number. Valid values: 1 to 65535.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    private ContainerGroupContainerLivenessProbeTcpSocketArgs() {}

    private ContainerGroupContainerLivenessProbeTcpSocketArgs(ContainerGroupContainerLivenessProbeTcpSocketArgs $) {
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerGroupContainerLivenessProbeTcpSocketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerGroupContainerLivenessProbeTcpSocketArgs $;

        public Builder() {
            $ = new ContainerGroupContainerLivenessProbeTcpSocketArgs();
        }

        public Builder(ContainerGroupContainerLivenessProbeTcpSocketArgs defaults) {
            $ = new ContainerGroupContainerLivenessProbeTcpSocketArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port The port number. Valid values: 1 to 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number. Valid values: 1 to 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public ContainerGroupContainerLivenessProbeTcpSocketArgs build() {
            return $;
        }
    }

}