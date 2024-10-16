// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PortConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PortConfigArgs Empty = new PortConfigArgs();

    /**
     * The timeout period for session retention. Value range: 30~3600, unit: second. The default is 0, which means off.
     * 
     */
    @Import(name="persistenceTimeout")
    private @Nullable Output<Integer> persistenceTimeout;

    /**
     * @return The timeout period for session retention. Value range: 30~3600, unit: second. The default is 0, which means off.
     * 
     */
    public Optional<Output<Integer>> persistenceTimeout() {
        return Optional.ofNullable(this.persistenceTimeout);
    }

    private PortConfigArgs() {}

    private PortConfigArgs(PortConfigArgs $) {
        this.persistenceTimeout = $.persistenceTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PortConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PortConfigArgs $;

        public Builder() {
            $ = new PortConfigArgs();
        }

        public Builder(PortConfigArgs defaults) {
            $ = new PortConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param persistenceTimeout The timeout period for session retention. Value range: 30~3600, unit: second. The default is 0, which means off.
         * 
         * @return builder
         * 
         */
        public Builder persistenceTimeout(@Nullable Output<Integer> persistenceTimeout) {
            $.persistenceTimeout = persistenceTimeout;
            return this;
        }

        /**
         * @param persistenceTimeout The timeout period for session retention. Value range: 30~3600, unit: second. The default is 0, which means off.
         * 
         * @return builder
         * 
         */
        public Builder persistenceTimeout(Integer persistenceTimeout) {
            return persistenceTimeout(Output.of(persistenceTimeout));
        }

        public PortConfigArgs build() {
            return $;
        }
    }

}
