// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RocketMQInstanceProductInfo {
    /**
     * @return is open auto scaling.
     * 
     */
    private @Nullable Boolean autoScaling;
    /**
     * @return Duration of message retention. Unit: hours.  For the range of values, please refer to [Usage Limits](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/usage-limits)&gt;Resource Quotas&gt;Limitations on Message Retention.  The message storage in AlibabaCloud RocketMQ is fully implemented in a serverless and elastic manner, with charges based on the actual storage space. You can control the storage capacity of messages by adjusting the duration of message retention. For more information, please see [Storage Fees](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/storage-fees).
     * 
     */
    private @Nullable Integer messageRetentionTime;
    /**
     * @return Message sending and receiving calculation specifications. For details about the upper limit for sending and receiving messages, see [Instance Specifications](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/instance-specifications).
     * 
     */
    private String msgProcessSpec;
    /**
     * @return message send receive ratio.  Value range: [0.2, 0.5].
     * 
     */
    private @Nullable Double sendReceiveRatio;
    /**
     * @return Specifies whether to enable the encryption at rest feature. Valid values: `true`, `false`.
     * 
     */
    private @Nullable Boolean storageEncryption;
    /**
     * @return The key for encryption at rest.
     * 
     */
    private @Nullable String storageSecretKey;
    /**
     * @return is support auto scaling.
     * 
     */
    private @Nullable Boolean supportAutoScaling;
    /**
     * @return Whether to enable the message trace function. Valid values: `true`, `false`.
     * 
     */
    private @Nullable Boolean traceOn;

    private RocketMQInstanceProductInfo() {}
    /**
     * @return is open auto scaling.
     * 
     */
    public Optional<Boolean> autoScaling() {
        return Optional.ofNullable(this.autoScaling);
    }
    /**
     * @return Duration of message retention. Unit: hours.  For the range of values, please refer to [Usage Limits](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/usage-limits)&gt;Resource Quotas&gt;Limitations on Message Retention.  The message storage in AlibabaCloud RocketMQ is fully implemented in a serverless and elastic manner, with charges based on the actual storage space. You can control the storage capacity of messages by adjusting the duration of message retention. For more information, please see [Storage Fees](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/storage-fees).
     * 
     */
    public Optional<Integer> messageRetentionTime() {
        return Optional.ofNullable(this.messageRetentionTime);
    }
    /**
     * @return Message sending and receiving calculation specifications. For details about the upper limit for sending and receiving messages, see [Instance Specifications](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/instance-specifications).
     * 
     */
    public String msgProcessSpec() {
        return this.msgProcessSpec;
    }
    /**
     * @return message send receive ratio.  Value range: [0.2, 0.5].
     * 
     */
    public Optional<Double> sendReceiveRatio() {
        return Optional.ofNullable(this.sendReceiveRatio);
    }
    /**
     * @return Specifies whether to enable the encryption at rest feature. Valid values: `true`, `false`.
     * 
     */
    public Optional<Boolean> storageEncryption() {
        return Optional.ofNullable(this.storageEncryption);
    }
    /**
     * @return The key for encryption at rest.
     * 
     */
    public Optional<String> storageSecretKey() {
        return Optional.ofNullable(this.storageSecretKey);
    }
    /**
     * @return is support auto scaling.
     * 
     */
    public Optional<Boolean> supportAutoScaling() {
        return Optional.ofNullable(this.supportAutoScaling);
    }
    /**
     * @return Whether to enable the message trace function. Valid values: `true`, `false`.
     * 
     */
    public Optional<Boolean> traceOn() {
        return Optional.ofNullable(this.traceOn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RocketMQInstanceProductInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoScaling;
        private @Nullable Integer messageRetentionTime;
        private String msgProcessSpec;
        private @Nullable Double sendReceiveRatio;
        private @Nullable Boolean storageEncryption;
        private @Nullable String storageSecretKey;
        private @Nullable Boolean supportAutoScaling;
        private @Nullable Boolean traceOn;
        public Builder() {}
        public Builder(RocketMQInstanceProductInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScaling = defaults.autoScaling;
    	      this.messageRetentionTime = defaults.messageRetentionTime;
    	      this.msgProcessSpec = defaults.msgProcessSpec;
    	      this.sendReceiveRatio = defaults.sendReceiveRatio;
    	      this.storageEncryption = defaults.storageEncryption;
    	      this.storageSecretKey = defaults.storageSecretKey;
    	      this.supportAutoScaling = defaults.supportAutoScaling;
    	      this.traceOn = defaults.traceOn;
        }

        @CustomType.Setter
        public Builder autoScaling(@Nullable Boolean autoScaling) {

            this.autoScaling = autoScaling;
            return this;
        }
        @CustomType.Setter
        public Builder messageRetentionTime(@Nullable Integer messageRetentionTime) {

            this.messageRetentionTime = messageRetentionTime;
            return this;
        }
        @CustomType.Setter
        public Builder msgProcessSpec(String msgProcessSpec) {
            if (msgProcessSpec == null) {
              throw new MissingRequiredPropertyException("RocketMQInstanceProductInfo", "msgProcessSpec");
            }
            this.msgProcessSpec = msgProcessSpec;
            return this;
        }
        @CustomType.Setter
        public Builder sendReceiveRatio(@Nullable Double sendReceiveRatio) {

            this.sendReceiveRatio = sendReceiveRatio;
            return this;
        }
        @CustomType.Setter
        public Builder storageEncryption(@Nullable Boolean storageEncryption) {

            this.storageEncryption = storageEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder storageSecretKey(@Nullable String storageSecretKey) {

            this.storageSecretKey = storageSecretKey;
            return this;
        }
        @CustomType.Setter
        public Builder supportAutoScaling(@Nullable Boolean supportAutoScaling) {

            this.supportAutoScaling = supportAutoScaling;
            return this;
        }
        @CustomType.Setter
        public Builder traceOn(@Nullable Boolean traceOn) {

            this.traceOn = traceOn;
            return this;
        }
        public RocketMQInstanceProductInfo build() {
            final var _resultValue = new RocketMQInstanceProductInfo();
            _resultValue.autoScaling = autoScaling;
            _resultValue.messageRetentionTime = messageRetentionTime;
            _resultValue.msgProcessSpec = msgProcessSpec;
            _resultValue.sendReceiveRatio = sendReceiveRatio;
            _resultValue.storageEncryption = storageEncryption;
            _resultValue.storageSecretKey = storageSecretKey;
            _resultValue.supportAutoScaling = supportAutoScaling;
            _resultValue.traceOn = traceOn;
            return _resultValue;
        }
    }
}
