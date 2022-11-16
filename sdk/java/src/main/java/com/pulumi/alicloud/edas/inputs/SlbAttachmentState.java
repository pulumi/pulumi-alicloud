// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.edas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SlbAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final SlbAttachmentState Empty = new SlbAttachmentState();

    /**
     * The ID of the application to which you want to bind an SLB instance.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The ID of the application to which you want to bind an SLB instance.
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The listening port for the bound SLB instance.
     * 
     */
    @Import(name="listenerPort")
    private @Nullable Output<Integer> listenerPort;

    /**
     * @return The listening port for the bound SLB instance.
     * 
     */
    public Optional<Output<Integer>> listenerPort() {
        return Optional.ofNullable(this.listenerPort);
    }

    /**
     * The ID of the SLB instance that is going to be bound.
     * 
     */
    @Import(name="slbId")
    private @Nullable Output<String> slbId;

    /**
     * @return The ID of the SLB instance that is going to be bound.
     * 
     */
    public Optional<Output<String>> slbId() {
        return Optional.ofNullable(this.slbId);
    }

    /**
     * The IP address that is allocated to the bound SLB instance.
     * 
     */
    @Import(name="slbIp")
    private @Nullable Output<String> slbIp;

    /**
     * @return The IP address that is allocated to the bound SLB instance.
     * 
     */
    public Optional<Output<String>> slbIp() {
        return Optional.ofNullable(this.slbIp);
    }

    /**
     * Running Status of SLB instance. Inactive：The instance is stopped, and listener will not monitor and forward traffic. Active：The instance is running. After the instance is created, the default state is active. Locked：The instance is locked, the instance has been owed or locked by Alibaba Cloud. Expired: The instance has expired.
     * 
     */
    @Import(name="slbStatus")
    private @Nullable Output<String> slbStatus;

    /**
     * @return Running Status of SLB instance. Inactive：The instance is stopped, and listener will not monitor and forward traffic. Active：The instance is running. After the instance is created, the default state is active. Locked：The instance is locked, the instance has been owed or locked by Alibaba Cloud. Expired: The instance has expired.
     * 
     */
    public Optional<Output<String>> slbStatus() {
        return Optional.ofNullable(this.slbStatus);
    }

    /**
     * The type of the bound SLB instance.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the bound SLB instance.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The ID of the virtual server (VServer) group associated with the intranet SLB instance.
     * 
     */
    @Import(name="vserverGroupId")
    private @Nullable Output<String> vserverGroupId;

    /**
     * @return The ID of the virtual server (VServer) group associated with the intranet SLB instance.
     * 
     */
    public Optional<Output<String>> vserverGroupId() {
        return Optional.ofNullable(this.vserverGroupId);
    }

    /**
     * VPC related vswitch ID.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return VPC related vswitch ID.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private SlbAttachmentState() {}

    private SlbAttachmentState(SlbAttachmentState $) {
        this.appId = $.appId;
        this.listenerPort = $.listenerPort;
        this.slbId = $.slbId;
        this.slbIp = $.slbIp;
        this.slbStatus = $.slbStatus;
        this.type = $.type;
        this.vserverGroupId = $.vserverGroupId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlbAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlbAttachmentState $;

        public Builder() {
            $ = new SlbAttachmentState();
        }

        public Builder(SlbAttachmentState defaults) {
            $ = new SlbAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The ID of the application to which you want to bind an SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The ID of the application to which you want to bind an SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param listenerPort The listening port for the bound SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder listenerPort(@Nullable Output<Integer> listenerPort) {
            $.listenerPort = listenerPort;
            return this;
        }

        /**
         * @param listenerPort The listening port for the bound SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder listenerPort(Integer listenerPort) {
            return listenerPort(Output.of(listenerPort));
        }

        /**
         * @param slbId The ID of the SLB instance that is going to be bound.
         * 
         * @return builder
         * 
         */
        public Builder slbId(@Nullable Output<String> slbId) {
            $.slbId = slbId;
            return this;
        }

        /**
         * @param slbId The ID of the SLB instance that is going to be bound.
         * 
         * @return builder
         * 
         */
        public Builder slbId(String slbId) {
            return slbId(Output.of(slbId));
        }

        /**
         * @param slbIp The IP address that is allocated to the bound SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder slbIp(@Nullable Output<String> slbIp) {
            $.slbIp = slbIp;
            return this;
        }

        /**
         * @param slbIp The IP address that is allocated to the bound SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder slbIp(String slbIp) {
            return slbIp(Output.of(slbIp));
        }

        /**
         * @param slbStatus Running Status of SLB instance. Inactive：The instance is stopped, and listener will not monitor and forward traffic. Active：The instance is running. After the instance is created, the default state is active. Locked：The instance is locked, the instance has been owed or locked by Alibaba Cloud. Expired: The instance has expired.
         * 
         * @return builder
         * 
         */
        public Builder slbStatus(@Nullable Output<String> slbStatus) {
            $.slbStatus = slbStatus;
            return this;
        }

        /**
         * @param slbStatus Running Status of SLB instance. Inactive：The instance is stopped, and listener will not monitor and forward traffic. Active：The instance is running. After the instance is created, the default state is active. Locked：The instance is locked, the instance has been owed or locked by Alibaba Cloud. Expired: The instance has expired.
         * 
         * @return builder
         * 
         */
        public Builder slbStatus(String slbStatus) {
            return slbStatus(Output.of(slbStatus));
        }

        /**
         * @param type The type of the bound SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the bound SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vserverGroupId The ID of the virtual server (VServer) group associated with the intranet SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder vserverGroupId(@Nullable Output<String> vserverGroupId) {
            $.vserverGroupId = vserverGroupId;
            return this;
        }

        /**
         * @param vserverGroupId The ID of the virtual server (VServer) group associated with the intranet SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder vserverGroupId(String vserverGroupId) {
            return vserverGroupId(Output.of(vserverGroupId));
        }

        /**
         * @param vswitchId VPC related vswitch ID.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId VPC related vswitch ID.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public SlbAttachmentState build() {
            return $;
        }
    }

}