// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.maxcompute.inputs;

import com.pulumi.alicloud.maxcompute.inputs.TunnelQuotaTimerQuotaTimerTunnelQuotaParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TunnelQuotaTimerQuotaTimerArgs extends com.pulumi.resources.ResourceArgs {

    public static final TunnelQuotaTimerQuotaTimerArgs Empty = new TunnelQuotaTimerQuotaTimerArgs();

    /**
     * The time-sharing configuration start time. Reference value: 00:00
     * 
     */
    @Import(name="beginTime", required=true)
    private Output<String> beginTime;

    /**
     * @return The time-sharing configuration start time. Reference value: 00:00
     * 
     */
    public Output<String> beginTime() {
        return this.beginTime;
    }

    /**
     * The end time of the timesharing configuration. Reference value: 24:00
     * 
     */
    @Import(name="endTime", required=true)
    private Output<String> endTime;

    /**
     * @return The end time of the timesharing configuration. Reference value: 24:00
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }

    /**
     * Time-sharing configuration parameters. See `tunnel_quota_parameter` below.
     * 
     */
    @Import(name="tunnelQuotaParameter")
    private @Nullable Output<TunnelQuotaTimerQuotaTimerTunnelQuotaParameterArgs> tunnelQuotaParameter;

    /**
     * @return Time-sharing configuration parameters. See `tunnel_quota_parameter` below.
     * 
     */
    public Optional<Output<TunnelQuotaTimerQuotaTimerTunnelQuotaParameterArgs>> tunnelQuotaParameter() {
        return Optional.ofNullable(this.tunnelQuotaParameter);
    }

    private TunnelQuotaTimerQuotaTimerArgs() {}

    private TunnelQuotaTimerQuotaTimerArgs(TunnelQuotaTimerQuotaTimerArgs $) {
        this.beginTime = $.beginTime;
        this.endTime = $.endTime;
        this.tunnelQuotaParameter = $.tunnelQuotaParameter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TunnelQuotaTimerQuotaTimerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TunnelQuotaTimerQuotaTimerArgs $;

        public Builder() {
            $ = new TunnelQuotaTimerQuotaTimerArgs();
        }

        public Builder(TunnelQuotaTimerQuotaTimerArgs defaults) {
            $ = new TunnelQuotaTimerQuotaTimerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param beginTime The time-sharing configuration start time. Reference value: 00:00
         * 
         * @return builder
         * 
         */
        public Builder beginTime(Output<String> beginTime) {
            $.beginTime = beginTime;
            return this;
        }

        /**
         * @param beginTime The time-sharing configuration start time. Reference value: 00:00
         * 
         * @return builder
         * 
         */
        public Builder beginTime(String beginTime) {
            return beginTime(Output.of(beginTime));
        }

        /**
         * @param endTime The end time of the timesharing configuration. Reference value: 24:00
         * 
         * @return builder
         * 
         */
        public Builder endTime(Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The end time of the timesharing configuration. Reference value: 24:00
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param tunnelQuotaParameter Time-sharing configuration parameters. See `tunnel_quota_parameter` below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelQuotaParameter(@Nullable Output<TunnelQuotaTimerQuotaTimerTunnelQuotaParameterArgs> tunnelQuotaParameter) {
            $.tunnelQuotaParameter = tunnelQuotaParameter;
            return this;
        }

        /**
         * @param tunnelQuotaParameter Time-sharing configuration parameters. See `tunnel_quota_parameter` below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelQuotaParameter(TunnelQuotaTimerQuotaTimerTunnelQuotaParameterArgs tunnelQuotaParameter) {
            return tunnelQuotaParameter(Output.of(tunnelQuotaParameter));
        }

        public TunnelQuotaTimerQuotaTimerArgs build() {
            if ($.beginTime == null) {
                throw new MissingRequiredPropertyException("TunnelQuotaTimerQuotaTimerArgs", "beginTime");
            }
            if ($.endTime == null) {
                throw new MissingRequiredPropertyException("TunnelQuotaTimerQuotaTimerArgs", "endTime");
            }
            return $;
        }
    }

}
