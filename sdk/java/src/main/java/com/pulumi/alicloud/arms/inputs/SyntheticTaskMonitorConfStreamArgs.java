// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticTaskMonitorConfStreamArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticTaskMonitorConfStreamArgs Empty = new SyntheticTaskMonitorConfStreamArgs();

    /**
     * Custom header, in JSON Map format.
     * 
     */
    @Import(name="customHeaderContent")
    private @Nullable Output<Map<String,Object>> customHeaderContent;

    /**
     * @return Custom header, in JSON Map format.
     * 
     */
    public Optional<Output<Map<String,Object>>> customHeaderContent() {
        return Optional.ofNullable(this.customHeaderContent);
    }

    /**
     * Player, do not pass the default 12.
     * - 12:VLC
     * - 2:FlashPlayer.
     * 
     */
    @Import(name="playerType")
    private @Nullable Output<Integer> playerType;

    /**
     * @return Player, do not pass the default 12.
     * - 12:VLC
     * - 2:FlashPlayer.
     * 
     */
    public Optional<Output<Integer>> playerType() {
        return Optional.ofNullable(this.playerType);
    }

    /**
     * Resource address type:
     * - 1: Resource address.
     * - 0: page address, not 0 by default.
     * 
     */
    @Import(name="streamAddressType")
    private @Nullable Output<Integer> streamAddressType;

    /**
     * @return Resource address type:
     * - 1: Resource address.
     * - 0: page address, not 0 by default.
     * 
     */
    public Optional<Output<Integer>> streamAddressType() {
        return Optional.ofNullable(this.streamAddressType);
    }

    /**
     * Monitoring duration, in seconds, up to 60s, not 60 by default.
     * 
     */
    @Import(name="streamMonitorTimeout")
    private @Nullable Output<Integer> streamMonitorTimeout;

    /**
     * @return Monitoring duration, in seconds, up to 60s, not 60 by default.
     * 
     */
    public Optional<Output<Integer>> streamMonitorTimeout() {
        return Optional.ofNullable(this.streamMonitorTimeout);
    }

    /**
     * Audio and video flags: 0-video, 1-audio.
     * 
     */
    @Import(name="streamType")
    private @Nullable Output<Integer> streamType;

    /**
     * @return Audio and video flags: 0-video, 1-audio.
     * 
     */
    public Optional<Output<Integer>> streamType() {
        return Optional.ofNullable(this.streamType);
    }

    /**
     * The target URL.
     * 
     */
    @Import(name="targetUrl")
    private @Nullable Output<String> targetUrl;

    /**
     * @return The target URL.
     * 
     */
    public Optional<Output<String>> targetUrl() {
        return Optional.ofNullable(this.targetUrl);
    }

    /**
     * DNS hijack whitelist. Match rules support IP, IP wildcard, subnet mask, and CNAME. Multiple match rules can be filled in. Multiple match rules are separated by vertical bars (|). For example, www.aliyun.com:203.0.3.55 | 203.3.44.67 indicates that all other IP addresses under the www.aliyun.com domain except 203.0.3.55 and 203.3.44.67 are hijacked.
     * 
     */
    @Import(name="whiteList")
    private @Nullable Output<String> whiteList;

    /**
     * @return DNS hijack whitelist. Match rules support IP, IP wildcard, subnet mask, and CNAME. Multiple match rules can be filled in. Multiple match rules are separated by vertical bars (|). For example, www.aliyun.com:203.0.3.55 | 203.3.44.67 indicates that all other IP addresses under the www.aliyun.com domain except 203.0.3.55 and 203.3.44.67 are hijacked.
     * 
     */
    public Optional<Output<String>> whiteList() {
        return Optional.ofNullable(this.whiteList);
    }

    private SyntheticTaskMonitorConfStreamArgs() {}

    private SyntheticTaskMonitorConfStreamArgs(SyntheticTaskMonitorConfStreamArgs $) {
        this.customHeaderContent = $.customHeaderContent;
        this.playerType = $.playerType;
        this.streamAddressType = $.streamAddressType;
        this.streamMonitorTimeout = $.streamMonitorTimeout;
        this.streamType = $.streamType;
        this.targetUrl = $.targetUrl;
        this.whiteList = $.whiteList;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticTaskMonitorConfStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticTaskMonitorConfStreamArgs $;

        public Builder() {
            $ = new SyntheticTaskMonitorConfStreamArgs();
        }

        public Builder(SyntheticTaskMonitorConfStreamArgs defaults) {
            $ = new SyntheticTaskMonitorConfStreamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customHeaderContent Custom header, in JSON Map format.
         * 
         * @return builder
         * 
         */
        public Builder customHeaderContent(@Nullable Output<Map<String,Object>> customHeaderContent) {
            $.customHeaderContent = customHeaderContent;
            return this;
        }

        /**
         * @param customHeaderContent Custom header, in JSON Map format.
         * 
         * @return builder
         * 
         */
        public Builder customHeaderContent(Map<String,Object> customHeaderContent) {
            return customHeaderContent(Output.of(customHeaderContent));
        }

        /**
         * @param playerType Player, do not pass the default 12.
         * - 12:VLC
         * - 2:FlashPlayer.
         * 
         * @return builder
         * 
         */
        public Builder playerType(@Nullable Output<Integer> playerType) {
            $.playerType = playerType;
            return this;
        }

        /**
         * @param playerType Player, do not pass the default 12.
         * - 12:VLC
         * - 2:FlashPlayer.
         * 
         * @return builder
         * 
         */
        public Builder playerType(Integer playerType) {
            return playerType(Output.of(playerType));
        }

        /**
         * @param streamAddressType Resource address type:
         * - 1: Resource address.
         * - 0: page address, not 0 by default.
         * 
         * @return builder
         * 
         */
        public Builder streamAddressType(@Nullable Output<Integer> streamAddressType) {
            $.streamAddressType = streamAddressType;
            return this;
        }

        /**
         * @param streamAddressType Resource address type:
         * - 1: Resource address.
         * - 0: page address, not 0 by default.
         * 
         * @return builder
         * 
         */
        public Builder streamAddressType(Integer streamAddressType) {
            return streamAddressType(Output.of(streamAddressType));
        }

        /**
         * @param streamMonitorTimeout Monitoring duration, in seconds, up to 60s, not 60 by default.
         * 
         * @return builder
         * 
         */
        public Builder streamMonitorTimeout(@Nullable Output<Integer> streamMonitorTimeout) {
            $.streamMonitorTimeout = streamMonitorTimeout;
            return this;
        }

        /**
         * @param streamMonitorTimeout Monitoring duration, in seconds, up to 60s, not 60 by default.
         * 
         * @return builder
         * 
         */
        public Builder streamMonitorTimeout(Integer streamMonitorTimeout) {
            return streamMonitorTimeout(Output.of(streamMonitorTimeout));
        }

        /**
         * @param streamType Audio and video flags: 0-video, 1-audio.
         * 
         * @return builder
         * 
         */
        public Builder streamType(@Nullable Output<Integer> streamType) {
            $.streamType = streamType;
            return this;
        }

        /**
         * @param streamType Audio and video flags: 0-video, 1-audio.
         * 
         * @return builder
         * 
         */
        public Builder streamType(Integer streamType) {
            return streamType(Output.of(streamType));
        }

        /**
         * @param targetUrl The target URL.
         * 
         * @return builder
         * 
         */
        public Builder targetUrl(@Nullable Output<String> targetUrl) {
            $.targetUrl = targetUrl;
            return this;
        }

        /**
         * @param targetUrl The target URL.
         * 
         * @return builder
         * 
         */
        public Builder targetUrl(String targetUrl) {
            return targetUrl(Output.of(targetUrl));
        }

        /**
         * @param whiteList DNS hijack whitelist. Match rules support IP, IP wildcard, subnet mask, and CNAME. Multiple match rules can be filled in. Multiple match rules are separated by vertical bars (|). For example, www.aliyun.com:203.0.3.55 | 203.3.44.67 indicates that all other IP addresses under the www.aliyun.com domain except 203.0.3.55 and 203.3.44.67 are hijacked.
         * 
         * @return builder
         * 
         */
        public Builder whiteList(@Nullable Output<String> whiteList) {
            $.whiteList = whiteList;
            return this;
        }

        /**
         * @param whiteList DNS hijack whitelist. Match rules support IP, IP wildcard, subnet mask, and CNAME. Multiple match rules can be filled in. Multiple match rules are separated by vertical bars (|). For example, www.aliyun.com:203.0.3.55 | 203.3.44.67 indicates that all other IP addresses under the www.aliyun.com domain except 203.0.3.55 and 203.3.44.67 are hijacked.
         * 
         * @return builder
         * 
         */
        public Builder whiteList(String whiteList) {
            return whiteList(Output.of(whiteList));
        }

        public SyntheticTaskMonitorConfStreamArgs build() {
            return $;
        }
    }

}