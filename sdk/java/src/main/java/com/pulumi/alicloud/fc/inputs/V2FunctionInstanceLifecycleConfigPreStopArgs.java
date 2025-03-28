// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2FunctionInstanceLifecycleConfigPreStopArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2FunctionInstanceLifecycleConfigPreStopArgs Empty = new V2FunctionInstanceLifecycleConfigPreStopArgs();

    /**
     * entry point of function.
     * 
     */
    @Import(name="handler")
    private @Nullable Output<String> handler;

    /**
     * @return entry point of function.
     * 
     */
    public Optional<Output<String>> handler() {
        return Optional.ofNullable(this.handler);
    }

    /**
     * max running time of function.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return max running time of function.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private V2FunctionInstanceLifecycleConfigPreStopArgs() {}

    private V2FunctionInstanceLifecycleConfigPreStopArgs(V2FunctionInstanceLifecycleConfigPreStopArgs $) {
        this.handler = $.handler;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2FunctionInstanceLifecycleConfigPreStopArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2FunctionInstanceLifecycleConfigPreStopArgs $;

        public Builder() {
            $ = new V2FunctionInstanceLifecycleConfigPreStopArgs();
        }

        public Builder(V2FunctionInstanceLifecycleConfigPreStopArgs defaults) {
            $ = new V2FunctionInstanceLifecycleConfigPreStopArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param handler entry point of function.
         * 
         * @return builder
         * 
         */
        public Builder handler(@Nullable Output<String> handler) {
            $.handler = handler;
            return this;
        }

        /**
         * @param handler entry point of function.
         * 
         * @return builder
         * 
         */
        public Builder handler(String handler) {
            return handler(Output.of(handler));
        }

        /**
         * @param timeout max running time of function.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout max running time of function.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public V2FunctionInstanceLifecycleConfigPreStopArgs build() {
            return $;
        }
    }

}
