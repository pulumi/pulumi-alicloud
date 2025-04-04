// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V3AsyncInvokeConfigDestinationConfigOnFailureArgs extends com.pulumi.resources.ResourceArgs {

    public static final V3AsyncInvokeConfigDestinationConfigOnFailureArgs Empty = new V3AsyncInvokeConfigDestinationConfigOnFailureArgs();

    /**
     * Asynchronous call target Resource Descriptor
     * 
     */
    @Import(name="destination")
    private @Nullable Output<String> destination;

    /**
     * @return Asynchronous call target Resource Descriptor
     * 
     */
    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    private V3AsyncInvokeConfigDestinationConfigOnFailureArgs() {}

    private V3AsyncInvokeConfigDestinationConfigOnFailureArgs(V3AsyncInvokeConfigDestinationConfigOnFailureArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V3AsyncInvokeConfigDestinationConfigOnFailureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V3AsyncInvokeConfigDestinationConfigOnFailureArgs $;

        public Builder() {
            $ = new V3AsyncInvokeConfigDestinationConfigOnFailureArgs();
        }

        public Builder(V3AsyncInvokeConfigDestinationConfigOnFailureArgs defaults) {
            $ = new V3AsyncInvokeConfigDestinationConfigOnFailureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination Asynchronous call target Resource Descriptor
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination Asynchronous call target Resource Descriptor
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public V3AsyncInvokeConfigDestinationConfigOnFailureArgs build() {
            return $;
        }
    }

}
