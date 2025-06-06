// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocketMQInstanceNetworkInfoInternetInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final RocketMQInstanceNetworkInfoInternetInfoArgs Empty = new RocketMQInstanceNetworkInfoInternetInfoArgs();

    /**
     * Public network bandwidth specification. Unit: Mb/s.  This field should only be filled when the public network billing type is set to payByBandwidth.  The value range is [1 - 1000].
     * 
     */
    @Import(name="flowOutBandwidth")
    private @Nullable Output<Integer> flowOutBandwidth;

    /**
     * @return Public network bandwidth specification. Unit: Mb/s.  This field should only be filled when the public network billing type is set to payByBandwidth.  The value range is [1 - 1000].
     * 
     */
    public Optional<Output<Integer>> flowOutBandwidth() {
        return Optional.ofNullable(this.flowOutBandwidth);
    }

    /**
     * Public network billing type.  Parameter values are as follows:
     * - payByBandwidth: Fixed bandwidth billing. This parameter must be set to the value when public network access is enabled.
     * - uninvolved: Not involved. This parameter must be set to the value when public network access is disabled.
     * 
     */
    @Import(name="flowOutType", required=true)
    private Output<String> flowOutType;

    /**
     * @return Public network billing type.  Parameter values are as follows:
     * - payByBandwidth: Fixed bandwidth billing. This parameter must be set to the value when public network access is enabled.
     * - uninvolved: Not involved. This parameter must be set to the value when public network access is disabled.
     * 
     */
    public Output<String> flowOutType() {
        return this.flowOutType;
    }

    /**
     * Whether to enable public network access.  The parameter values are as follows:
     * - enable: Enable public network access
     * - disable: Disable public network access   Instances by default support VPC access. If public network access is enabled, Alibaba Cloud Message Queue RocketMQ version will incur charges for public network outbound bandwidth. For specific billing information, please refer to [Public Network Access Fees](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/internet-access-fee).
     * 
     */
    @Import(name="internetSpec", required=true)
    private Output<String> internetSpec;

    /**
     * @return Whether to enable public network access.  The parameter values are as follows:
     * - enable: Enable public network access
     * - disable: Disable public network access   Instances by default support VPC access. If public network access is enabled, Alibaba Cloud Message Queue RocketMQ version will incur charges for public network outbound bandwidth. For specific billing information, please refer to [Public Network Access Fees](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/internet-access-fee).
     * 
     */
    public Output<String> internetSpec() {
        return this.internetSpec;
    }

    /**
     * Field `ip_whitelist` has been deprecated from provider version 1.245.0. New field `ip_whitelists` instead.
     * 
     * @deprecated
     * Field &#39;ip_whitelist&#39; has been deprecated from provider version 1.245.0. New field &#39;ip_whitelists&#39; instead.
     * 
     */
    @Deprecated /* Field 'ip_whitelist' has been deprecated from provider version 1.245.0. New field 'ip_whitelists' instead. */
    @Import(name="ipWhitelists")
    private @Nullable Output<List<String>> ipWhitelists;

    /**
     * @return Field `ip_whitelist` has been deprecated from provider version 1.245.0. New field `ip_whitelists` instead.
     * 
     * @deprecated
     * Field &#39;ip_whitelist&#39; has been deprecated from provider version 1.245.0. New field &#39;ip_whitelists&#39; instead.
     * 
     */
    @Deprecated /* Field 'ip_whitelist' has been deprecated from provider version 1.245.0. New field 'ip_whitelists' instead. */
    public Optional<Output<List<String>>> ipWhitelists() {
        return Optional.ofNullable(this.ipWhitelists);
    }

    private RocketMQInstanceNetworkInfoInternetInfoArgs() {}

    private RocketMQInstanceNetworkInfoInternetInfoArgs(RocketMQInstanceNetworkInfoInternetInfoArgs $) {
        this.flowOutBandwidth = $.flowOutBandwidth;
        this.flowOutType = $.flowOutType;
        this.internetSpec = $.internetSpec;
        this.ipWhitelists = $.ipWhitelists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocketMQInstanceNetworkInfoInternetInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocketMQInstanceNetworkInfoInternetInfoArgs $;

        public Builder() {
            $ = new RocketMQInstanceNetworkInfoInternetInfoArgs();
        }

        public Builder(RocketMQInstanceNetworkInfoInternetInfoArgs defaults) {
            $ = new RocketMQInstanceNetworkInfoInternetInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param flowOutBandwidth Public network bandwidth specification. Unit: Mb/s.  This field should only be filled when the public network billing type is set to payByBandwidth.  The value range is [1 - 1000].
         * 
         * @return builder
         * 
         */
        public Builder flowOutBandwidth(@Nullable Output<Integer> flowOutBandwidth) {
            $.flowOutBandwidth = flowOutBandwidth;
            return this;
        }

        /**
         * @param flowOutBandwidth Public network bandwidth specification. Unit: Mb/s.  This field should only be filled when the public network billing type is set to payByBandwidth.  The value range is [1 - 1000].
         * 
         * @return builder
         * 
         */
        public Builder flowOutBandwidth(Integer flowOutBandwidth) {
            return flowOutBandwidth(Output.of(flowOutBandwidth));
        }

        /**
         * @param flowOutType Public network billing type.  Parameter values are as follows:
         * - payByBandwidth: Fixed bandwidth billing. This parameter must be set to the value when public network access is enabled.
         * - uninvolved: Not involved. This parameter must be set to the value when public network access is disabled.
         * 
         * @return builder
         * 
         */
        public Builder flowOutType(Output<String> flowOutType) {
            $.flowOutType = flowOutType;
            return this;
        }

        /**
         * @param flowOutType Public network billing type.  Parameter values are as follows:
         * - payByBandwidth: Fixed bandwidth billing. This parameter must be set to the value when public network access is enabled.
         * - uninvolved: Not involved. This parameter must be set to the value when public network access is disabled.
         * 
         * @return builder
         * 
         */
        public Builder flowOutType(String flowOutType) {
            return flowOutType(Output.of(flowOutType));
        }

        /**
         * @param internetSpec Whether to enable public network access.  The parameter values are as follows:
         * - enable: Enable public network access
         * - disable: Disable public network access   Instances by default support VPC access. If public network access is enabled, Alibaba Cloud Message Queue RocketMQ version will incur charges for public network outbound bandwidth. For specific billing information, please refer to [Public Network Access Fees](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/internet-access-fee).
         * 
         * @return builder
         * 
         */
        public Builder internetSpec(Output<String> internetSpec) {
            $.internetSpec = internetSpec;
            return this;
        }

        /**
         * @param internetSpec Whether to enable public network access.  The parameter values are as follows:
         * - enable: Enable public network access
         * - disable: Disable public network access   Instances by default support VPC access. If public network access is enabled, Alibaba Cloud Message Queue RocketMQ version will incur charges for public network outbound bandwidth. For specific billing information, please refer to [Public Network Access Fees](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/internet-access-fee).
         * 
         * @return builder
         * 
         */
        public Builder internetSpec(String internetSpec) {
            return internetSpec(Output.of(internetSpec));
        }

        /**
         * @param ipWhitelists Field `ip_whitelist` has been deprecated from provider version 1.245.0. New field `ip_whitelists` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;ip_whitelist&#39; has been deprecated from provider version 1.245.0. New field &#39;ip_whitelists&#39; instead.
         * 
         */
        @Deprecated /* Field 'ip_whitelist' has been deprecated from provider version 1.245.0. New field 'ip_whitelists' instead. */
        public Builder ipWhitelists(@Nullable Output<List<String>> ipWhitelists) {
            $.ipWhitelists = ipWhitelists;
            return this;
        }

        /**
         * @param ipWhitelists Field `ip_whitelist` has been deprecated from provider version 1.245.0. New field `ip_whitelists` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;ip_whitelist&#39; has been deprecated from provider version 1.245.0. New field &#39;ip_whitelists&#39; instead.
         * 
         */
        @Deprecated /* Field 'ip_whitelist' has been deprecated from provider version 1.245.0. New field 'ip_whitelists' instead. */
        public Builder ipWhitelists(List<String> ipWhitelists) {
            return ipWhitelists(Output.of(ipWhitelists));
        }

        /**
         * @param ipWhitelists Field `ip_whitelist` has been deprecated from provider version 1.245.0. New field `ip_whitelists` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;ip_whitelist&#39; has been deprecated from provider version 1.245.0. New field &#39;ip_whitelists&#39; instead.
         * 
         */
        @Deprecated /* Field 'ip_whitelist' has been deprecated from provider version 1.245.0. New field 'ip_whitelists' instead. */
        public Builder ipWhitelists(String... ipWhitelists) {
            return ipWhitelists(List.of(ipWhitelists));
        }

        public RocketMQInstanceNetworkInfoInternetInfoArgs build() {
            if ($.flowOutType == null) {
                throw new MissingRequiredPropertyException("RocketMQInstanceNetworkInfoInternetInfoArgs", "flowOutType");
            }
            if ($.internetSpec == null) {
                throw new MissingRequiredPropertyException("RocketMQInstanceNetworkInfoInternetInfoArgs", "internetSpec");
            }
            return $;
        }
    }

}
