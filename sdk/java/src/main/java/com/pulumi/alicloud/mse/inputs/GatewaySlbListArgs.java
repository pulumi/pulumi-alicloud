// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaySlbListArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaySlbListArgs Empty = new GatewaySlbListArgs();

    /**
     * The associate id.
     * 
     */
    @Import(name="associateId")
    private @Nullable Output<String> associateId;

    /**
     * @return The associate id.
     * 
     */
    public Optional<Output<String>> associateId() {
        return Optional.ofNullable(this.associateId);
    }

    /**
     * The Mode of the gateway slb.
     * 
     */
    @Import(name="gatewaySlbMode")
    private @Nullable Output<String> gatewaySlbMode;

    /**
     * @return The Mode of the gateway slb.
     * 
     */
    public Optional<Output<String>> gatewaySlbMode() {
        return Optional.ofNullable(this.gatewaySlbMode);
    }

    /**
     * The Status of the gateway slb.
     * 
     */
    @Import(name="gatewaySlbStatus")
    private @Nullable Output<String> gatewaySlbStatus;

    /**
     * @return The Status of the gateway slb.
     * 
     */
    public Optional<Output<String>> gatewaySlbStatus() {
        return Optional.ofNullable(this.gatewaySlbStatus);
    }

    /**
     * The creation time of the gateway slb.
     * 
     */
    @Import(name="gmtCreate")
    private @Nullable Output<String> gmtCreate;

    /**
     * @return The creation time of the gateway slb.
     * 
     */
    public Optional<Output<String>> gmtCreate() {
        return Optional.ofNullable(this.gmtCreate);
    }

    /**
     * The ID of the gateway slb.
     * 
     */
    @Import(name="slbId")
    private @Nullable Output<String> slbId;

    /**
     * @return The ID of the gateway slb.
     * 
     */
    public Optional<Output<String>> slbId() {
        return Optional.ofNullable(this.slbId);
    }

    /**
     * The ip of the gateway slb.
     * 
     */
    @Import(name="slbIp")
    private @Nullable Output<String> slbIp;

    /**
     * @return The ip of the gateway slb.
     * 
     */
    public Optional<Output<String>> slbIp() {
        return Optional.ofNullable(this.slbIp);
    }

    /**
     * The port of the gateway slb.
     * 
     */
    @Import(name="slbPort")
    private @Nullable Output<String> slbPort;

    /**
     * @return The port of the gateway slb.
     * 
     */
    public Optional<Output<String>> slbPort() {
        return Optional.ofNullable(this.slbPort);
    }

    /**
     * The type of the gateway slb.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the gateway slb.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private GatewaySlbListArgs() {}

    private GatewaySlbListArgs(GatewaySlbListArgs $) {
        this.associateId = $.associateId;
        this.gatewaySlbMode = $.gatewaySlbMode;
        this.gatewaySlbStatus = $.gatewaySlbStatus;
        this.gmtCreate = $.gmtCreate;
        this.slbId = $.slbId;
        this.slbIp = $.slbIp;
        this.slbPort = $.slbPort;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaySlbListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaySlbListArgs $;

        public Builder() {
            $ = new GatewaySlbListArgs();
        }

        public Builder(GatewaySlbListArgs defaults) {
            $ = new GatewaySlbListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param associateId The associate id.
         * 
         * @return builder
         * 
         */
        public Builder associateId(@Nullable Output<String> associateId) {
            $.associateId = associateId;
            return this;
        }

        /**
         * @param associateId The associate id.
         * 
         * @return builder
         * 
         */
        public Builder associateId(String associateId) {
            return associateId(Output.of(associateId));
        }

        /**
         * @param gatewaySlbMode The Mode of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder gatewaySlbMode(@Nullable Output<String> gatewaySlbMode) {
            $.gatewaySlbMode = gatewaySlbMode;
            return this;
        }

        /**
         * @param gatewaySlbMode The Mode of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder gatewaySlbMode(String gatewaySlbMode) {
            return gatewaySlbMode(Output.of(gatewaySlbMode));
        }

        /**
         * @param gatewaySlbStatus The Status of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder gatewaySlbStatus(@Nullable Output<String> gatewaySlbStatus) {
            $.gatewaySlbStatus = gatewaySlbStatus;
            return this;
        }

        /**
         * @param gatewaySlbStatus The Status of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder gatewaySlbStatus(String gatewaySlbStatus) {
            return gatewaySlbStatus(Output.of(gatewaySlbStatus));
        }

        /**
         * @param gmtCreate The creation time of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder gmtCreate(@Nullable Output<String> gmtCreate) {
            $.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * @param gmtCreate The creation time of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder gmtCreate(String gmtCreate) {
            return gmtCreate(Output.of(gmtCreate));
        }

        /**
         * @param slbId The ID of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder slbId(@Nullable Output<String> slbId) {
            $.slbId = slbId;
            return this;
        }

        /**
         * @param slbId The ID of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder slbId(String slbId) {
            return slbId(Output.of(slbId));
        }

        /**
         * @param slbIp The ip of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder slbIp(@Nullable Output<String> slbIp) {
            $.slbIp = slbIp;
            return this;
        }

        /**
         * @param slbIp The ip of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder slbIp(String slbIp) {
            return slbIp(Output.of(slbIp));
        }

        /**
         * @param slbPort The port of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder slbPort(@Nullable Output<String> slbPort) {
            $.slbPort = slbPort;
            return this;
        }

        /**
         * @param slbPort The port of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder slbPort(String slbPort) {
            return slbPort(Output.of(slbPort));
        }

        /**
         * @param type The type of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the gateway slb.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GatewaySlbListArgs build() {
            return $;
        }
    }

}
