// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ots.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TunnelChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final TunnelChannelArgs Empty = new TunnelChannelArgs();

    /**
     * The id of the channel.
     * 
     */
    @Import(name="channelId")
    private @Nullable Output<String> channelId;

    /**
     * @return The id of the channel.
     * 
     */
    public Optional<Output<String>> channelId() {
        return Optional.ofNullable(this.channelId);
    }

    /**
     * The latest consumption time of the channel, unix time in nanosecond.
     * 
     */
    @Import(name="channelRpo")
    private @Nullable Output<Integer> channelRpo;

    /**
     * @return The latest consumption time of the channel, unix time in nanosecond.
     * 
     */
    public Optional<Output<Integer>> channelRpo() {
        return Optional.ofNullable(this.channelRpo);
    }

    /**
     * The status of the channel, valid values: `WAIT`, `OPEN`, `CLOSING`, `CLOSE`, `TERMINATED`.
     * 
     */
    @Import(name="channelStatus")
    private @Nullable Output<String> channelStatus;

    /**
     * @return The status of the channel, valid values: `WAIT`, `OPEN`, `CLOSING`, `CLOSE`, `TERMINATED`.
     * 
     */
    public Optional<Output<String>> channelStatus() {
        return Optional.ofNullable(this.channelStatus);
    }

    /**
     * The type of the channel, valid values: `BaseData`, `Stream`.
     * 
     */
    @Import(name="channelType")
    private @Nullable Output<String> channelType;

    /**
     * @return The type of the channel, valid values: `BaseData`, `Stream`.
     * 
     */
    public Optional<Output<String>> channelType() {
        return Optional.ofNullable(this.channelType);
    }

    /**
     * The client id of the channel.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The client id of the channel.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    private TunnelChannelArgs() {}

    private TunnelChannelArgs(TunnelChannelArgs $) {
        this.channelId = $.channelId;
        this.channelRpo = $.channelRpo;
        this.channelStatus = $.channelStatus;
        this.channelType = $.channelType;
        this.clientId = $.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TunnelChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TunnelChannelArgs $;

        public Builder() {
            $ = new TunnelChannelArgs();
        }

        public Builder(TunnelChannelArgs defaults) {
            $ = new TunnelChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param channelId The id of the channel.
         * 
         * @return builder
         * 
         */
        public Builder channelId(@Nullable Output<String> channelId) {
            $.channelId = channelId;
            return this;
        }

        /**
         * @param channelId The id of the channel.
         * 
         * @return builder
         * 
         */
        public Builder channelId(String channelId) {
            return channelId(Output.of(channelId));
        }

        /**
         * @param channelRpo The latest consumption time of the channel, unix time in nanosecond.
         * 
         * @return builder
         * 
         */
        public Builder channelRpo(@Nullable Output<Integer> channelRpo) {
            $.channelRpo = channelRpo;
            return this;
        }

        /**
         * @param channelRpo The latest consumption time of the channel, unix time in nanosecond.
         * 
         * @return builder
         * 
         */
        public Builder channelRpo(Integer channelRpo) {
            return channelRpo(Output.of(channelRpo));
        }

        /**
         * @param channelStatus The status of the channel, valid values: `WAIT`, `OPEN`, `CLOSING`, `CLOSE`, `TERMINATED`.
         * 
         * @return builder
         * 
         */
        public Builder channelStatus(@Nullable Output<String> channelStatus) {
            $.channelStatus = channelStatus;
            return this;
        }

        /**
         * @param channelStatus The status of the channel, valid values: `WAIT`, `OPEN`, `CLOSING`, `CLOSE`, `TERMINATED`.
         * 
         * @return builder
         * 
         */
        public Builder channelStatus(String channelStatus) {
            return channelStatus(Output.of(channelStatus));
        }

        /**
         * @param channelType The type of the channel, valid values: `BaseData`, `Stream`.
         * 
         * @return builder
         * 
         */
        public Builder channelType(@Nullable Output<String> channelType) {
            $.channelType = channelType;
            return this;
        }

        /**
         * @param channelType The type of the channel, valid values: `BaseData`, `Stream`.
         * 
         * @return builder
         * 
         */
        public Builder channelType(String channelType) {
            return channelType(Output.of(channelType));
        }

        /**
         * @param clientId The client id of the channel.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The client id of the channel.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public TunnelChannelArgs build() {
            return $;
        }
    }

}
