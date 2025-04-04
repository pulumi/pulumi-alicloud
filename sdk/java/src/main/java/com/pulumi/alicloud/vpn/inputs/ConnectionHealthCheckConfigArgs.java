// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionHealthCheckConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionHealthCheckConfigArgs Empty = new ConnectionHealthCheckConfigArgs();

    /**
     * the destination IP address configured for health checks.
     * 
     */
    @Import(name="dip")
    private @Nullable Output<String> dip;

    /**
     * @return the destination IP address configured for health checks.
     * 
     */
    public Optional<Output<String>> dip() {
        return Optional.ofNullable(this.dip);
    }

    /**
     * specifies whether to enable health checks. Valid values: true and false. Default value: false.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return specifies whether to enable health checks. Valid values: true and false. Default value: false.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * the time interval of health check retries. Unit: seconds. Default value: 3.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return the time interval of health check retries. Unit: seconds. Default value: 3.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * the maximum number of health check retries. Default value: 3.
     * 
     */
    @Import(name="retry")
    private @Nullable Output<Integer> retry;

    /**
     * @return the maximum number of health check retries. Default value: 3.
     * 
     */
    public Optional<Output<Integer>> retry() {
        return Optional.ofNullable(this.retry);
    }

    /**
     * the source IP address that is used for health checks.
     * 
     */
    @Import(name="sip")
    private @Nullable Output<String> sip;

    /**
     * @return the source IP address that is used for health checks.
     * 
     */
    public Optional<Output<String>> sip() {
        return Optional.ofNullable(this.sip);
    }

    private ConnectionHealthCheckConfigArgs() {}

    private ConnectionHealthCheckConfigArgs(ConnectionHealthCheckConfigArgs $) {
        this.dip = $.dip;
        this.enable = $.enable;
        this.interval = $.interval;
        this.retry = $.retry;
        this.sip = $.sip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionHealthCheckConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionHealthCheckConfigArgs $;

        public Builder() {
            $ = new ConnectionHealthCheckConfigArgs();
        }

        public Builder(ConnectionHealthCheckConfigArgs defaults) {
            $ = new ConnectionHealthCheckConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dip the destination IP address configured for health checks.
         * 
         * @return builder
         * 
         */
        public Builder dip(@Nullable Output<String> dip) {
            $.dip = dip;
            return this;
        }

        /**
         * @param dip the destination IP address configured for health checks.
         * 
         * @return builder
         * 
         */
        public Builder dip(String dip) {
            return dip(Output.of(dip));
        }

        /**
         * @param enable specifies whether to enable health checks. Valid values: true and false. Default value: false.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable specifies whether to enable health checks. Valid values: true and false. Default value: false.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param interval the time interval of health check retries. Unit: seconds. Default value: 3.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval the time interval of health check retries. Unit: seconds. Default value: 3.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param retry the maximum number of health check retries. Default value: 3.
         * 
         * @return builder
         * 
         */
        public Builder retry(@Nullable Output<Integer> retry) {
            $.retry = retry;
            return this;
        }

        /**
         * @param retry the maximum number of health check retries. Default value: 3.
         * 
         * @return builder
         * 
         */
        public Builder retry(Integer retry) {
            return retry(Output.of(retry));
        }

        /**
         * @param sip the source IP address that is used for health checks.
         * 
         * @return builder
         * 
         */
        public Builder sip(@Nullable Output<String> sip) {
            $.sip = sip;
            return this;
        }

        /**
         * @param sip the source IP address that is used for health checks.
         * 
         * @return builder
         * 
         */
        public Builder sip(String sip) {
            return sip(Output.of(sip));
        }

        public ConnectionHealthCheckConfigArgs build() {
            return $;
        }
    }

}
