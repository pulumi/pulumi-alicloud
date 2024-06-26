// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerDeletionProtectionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerDeletionProtectionConfigArgs Empty = new LoadBalancerDeletionProtectionConfigArgs();

    /**
     * Delete protection enable.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Delete protection enable.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Opening time.
     * 
     */
    @Import(name="enabledTime")
    private @Nullable Output<String> enabledTime;

    /**
     * @return Opening time.
     * 
     */
    public Optional<Output<String>> enabledTime() {
        return Optional.ofNullable(this.enabledTime);
    }

    /**
     * Reason for opening.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return Reason for opening.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    private LoadBalancerDeletionProtectionConfigArgs() {}

    private LoadBalancerDeletionProtectionConfigArgs(LoadBalancerDeletionProtectionConfigArgs $) {
        this.enabled = $.enabled;
        this.enabledTime = $.enabledTime;
        this.reason = $.reason;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerDeletionProtectionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerDeletionProtectionConfigArgs $;

        public Builder() {
            $ = new LoadBalancerDeletionProtectionConfigArgs();
        }

        public Builder(LoadBalancerDeletionProtectionConfigArgs defaults) {
            $ = new LoadBalancerDeletionProtectionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Delete protection enable.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Delete protection enable.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param enabledTime Opening time.
         * 
         * @return builder
         * 
         */
        public Builder enabledTime(@Nullable Output<String> enabledTime) {
            $.enabledTime = enabledTime;
            return this;
        }

        /**
         * @param enabledTime Opening time.
         * 
         * @return builder
         * 
         */
        public Builder enabledTime(String enabledTime) {
            return enabledTime(Output.of(enabledTime));
        }

        /**
         * @param reason Reason for opening.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason Reason for opening.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        public LoadBalancerDeletionProtectionConfigArgs build() {
            return $;
        }
    }

}
