// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.inputs;

import com.pulumi.alicloud.fc.inputs.V3AsyncInvokeConfigDestinationConfigOnFailureArgs;
import com.pulumi.alicloud.fc.inputs.V3AsyncInvokeConfigDestinationConfigOnSuccessArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V3AsyncInvokeConfigDestinationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final V3AsyncInvokeConfigDestinationConfigArgs Empty = new V3AsyncInvokeConfigDestinationConfigArgs();

    /**
     * Failed callback target structure See `on_failure` below.
     * 
     */
    @Import(name="onFailure")
    private @Nullable Output<V3AsyncInvokeConfigDestinationConfigOnFailureArgs> onFailure;

    /**
     * @return Failed callback target structure See `on_failure` below.
     * 
     */
    public Optional<Output<V3AsyncInvokeConfigDestinationConfigOnFailureArgs>> onFailure() {
        return Optional.ofNullable(this.onFailure);
    }

    /**
     * Successful callback target structure See `on_success` below.
     * 
     */
    @Import(name="onSuccess")
    private @Nullable Output<V3AsyncInvokeConfigDestinationConfigOnSuccessArgs> onSuccess;

    /**
     * @return Successful callback target structure See `on_success` below.
     * 
     */
    public Optional<Output<V3AsyncInvokeConfigDestinationConfigOnSuccessArgs>> onSuccess() {
        return Optional.ofNullable(this.onSuccess);
    }

    private V3AsyncInvokeConfigDestinationConfigArgs() {}

    private V3AsyncInvokeConfigDestinationConfigArgs(V3AsyncInvokeConfigDestinationConfigArgs $) {
        this.onFailure = $.onFailure;
        this.onSuccess = $.onSuccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V3AsyncInvokeConfigDestinationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V3AsyncInvokeConfigDestinationConfigArgs $;

        public Builder() {
            $ = new V3AsyncInvokeConfigDestinationConfigArgs();
        }

        public Builder(V3AsyncInvokeConfigDestinationConfigArgs defaults) {
            $ = new V3AsyncInvokeConfigDestinationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param onFailure Failed callback target structure See `on_failure` below.
         * 
         * @return builder
         * 
         */
        public Builder onFailure(@Nullable Output<V3AsyncInvokeConfigDestinationConfigOnFailureArgs> onFailure) {
            $.onFailure = onFailure;
            return this;
        }

        /**
         * @param onFailure Failed callback target structure See `on_failure` below.
         * 
         * @return builder
         * 
         */
        public Builder onFailure(V3AsyncInvokeConfigDestinationConfigOnFailureArgs onFailure) {
            return onFailure(Output.of(onFailure));
        }

        /**
         * @param onSuccess Successful callback target structure See `on_success` below.
         * 
         * @return builder
         * 
         */
        public Builder onSuccess(@Nullable Output<V3AsyncInvokeConfigDestinationConfigOnSuccessArgs> onSuccess) {
            $.onSuccess = onSuccess;
            return this;
        }

        /**
         * @param onSuccess Successful callback target structure See `on_success` below.
         * 
         * @return builder
         * 
         */
        public Builder onSuccess(V3AsyncInvokeConfigDestinationConfigOnSuccessArgs onSuccess) {
            return onSuccess(Output.of(onSuccess));
        }

        public V3AsyncInvokeConfigDestinationConfigArgs build() {
            return $;
        }
    }

}
