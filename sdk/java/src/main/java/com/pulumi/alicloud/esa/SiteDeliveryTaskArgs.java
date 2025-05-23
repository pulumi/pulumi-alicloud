// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa;

import com.pulumi.alicloud.esa.inputs.SiteDeliveryTaskHttpDeliveryArgs;
import com.pulumi.alicloud.esa.inputs.SiteDeliveryTaskKafkaDeliveryArgs;
import com.pulumi.alicloud.esa.inputs.SiteDeliveryTaskOssDeliveryArgs;
import com.pulumi.alicloud.esa.inputs.SiteDeliveryTaskS3DeliveryArgs;
import com.pulumi.alicloud.esa.inputs.SiteDeliveryTaskSlsDeliveryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SiteDeliveryTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final SiteDeliveryTaskArgs Empty = new SiteDeliveryTaskArgs();

    /**
     * Real-time log type. Valid values:
     * - `dcdn_log_access_l1 (default)`: access log.
     * 
     */
    @Import(name="businessType", required=true)
    private Output<String> businessType;

    /**
     * @return Real-time log type. Valid values:
     * - `dcdn_log_access_l1 (default)`: access log.
     * 
     */
    public Output<String> businessType() {
        return this.businessType;
    }

    /**
     * Data Center. Values:
     * 
     */
    @Import(name="dataCenter", required=true)
    private Output<String> dataCenter;

    /**
     * @return Data Center. Values:
     * 
     */
    public Output<String> dataCenter() {
        return this.dataCenter;
    }

    /**
     * Delivery Type:
     * 
     */
    @Import(name="deliveryType", required=true)
    private Output<String> deliveryType;

    /**
     * @return Delivery Type:
     * 
     */
    public Output<String> deliveryType() {
        return this.deliveryType;
    }

    /**
     * If the discard rate is not filled, the default value is 0.
     * 
     */
    @Import(name="discardRate")
    private @Nullable Output<Double> discardRate;

    /**
     * @return If the discard rate is not filled, the default value is 0.
     * 
     */
    public Optional<Output<Double>> discardRate() {
        return Optional.ofNullable(this.discardRate);
    }

    /**
     * The list of delivery fields to be modified, separated by commas.
     * 
     */
    @Import(name="fieldName", required=true)
    private Output<String> fieldName;

    /**
     * @return The list of delivery fields to be modified, separated by commas.
     * 
     */
    public Output<String> fieldName() {
        return this.fieldName;
    }

    /**
     * HTTP delivery configuration parameters. See `http_delivery` below.
     * 
     */
    @Import(name="httpDelivery")
    private @Nullable Output<SiteDeliveryTaskHttpDeliveryArgs> httpDelivery;

    /**
     * @return HTTP delivery configuration parameters. See `http_delivery` below.
     * 
     */
    public Optional<Output<SiteDeliveryTaskHttpDeliveryArgs>> httpDelivery() {
        return Optional.ofNullable(this.httpDelivery);
    }

    /**
     * Kafka delivery configuration parameters. See `kafka_delivery` below.
     * 
     */
    @Import(name="kafkaDelivery")
    private @Nullable Output<SiteDeliveryTaskKafkaDeliveryArgs> kafkaDelivery;

    /**
     * @return Kafka delivery configuration parameters. See `kafka_delivery` below.
     * 
     */
    public Optional<Output<SiteDeliveryTaskKafkaDeliveryArgs>> kafkaDelivery() {
        return Optional.ofNullable(this.kafkaDelivery);
    }

    /**
     * OSS delivery configuration. See `oss_delivery` below.
     * 
     */
    @Import(name="ossDelivery")
    private @Nullable Output<SiteDeliveryTaskOssDeliveryArgs> ossDelivery;

    /**
     * @return OSS delivery configuration. See `oss_delivery` below.
     * 
     */
    public Optional<Output<SiteDeliveryTaskOssDeliveryArgs>> ossDelivery() {
        return Optional.ofNullable(this.ossDelivery);
    }

    /**
     * S3/S3 compatible delivery configuration parameters. See `s3_delivery` below.
     * 
     */
    @Import(name="s3Delivery")
    private @Nullable Output<SiteDeliveryTaskS3DeliveryArgs> s3Delivery;

    /**
     * @return S3/S3 compatible delivery configuration parameters. See `s3_delivery` below.
     * 
     */
    public Optional<Output<SiteDeliveryTaskS3DeliveryArgs>> s3Delivery() {
        return Optional.ofNullable(this.s3Delivery);
    }

    /**
     * The site ID, which can be obtained by calling the [ListSites](https://help.aliyun.com/document_detail/2850189.html) interface.
     * 
     */
    @Import(name="siteId", required=true)
    private Output<Integer> siteId;

    /**
     * @return The site ID, which can be obtained by calling the [ListSites](https://help.aliyun.com/document_detail/2850189.html) interface.
     * 
     */
    public Output<Integer> siteId() {
        return this.siteId;
    }

    /**
     * SLS delivery configuration. See `sls_delivery` below.
     * 
     */
    @Import(name="slsDelivery")
    private @Nullable Output<SiteDeliveryTaskSlsDeliveryArgs> slsDelivery;

    /**
     * @return SLS delivery configuration. See `sls_delivery` below.
     * 
     */
    public Optional<Output<SiteDeliveryTaskSlsDeliveryArgs>> slsDelivery() {
        return Optional.ofNullable(this.slsDelivery);
    }

    /**
     * Task status, value:
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Task status, value:
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The task name.
     * 
     */
    @Import(name="taskName", required=true)
    private Output<String> taskName;

    /**
     * @return The task name.
     * 
     */
    public Output<String> taskName() {
        return this.taskName;
    }

    private SiteDeliveryTaskArgs() {}

    private SiteDeliveryTaskArgs(SiteDeliveryTaskArgs $) {
        this.businessType = $.businessType;
        this.dataCenter = $.dataCenter;
        this.deliveryType = $.deliveryType;
        this.discardRate = $.discardRate;
        this.fieldName = $.fieldName;
        this.httpDelivery = $.httpDelivery;
        this.kafkaDelivery = $.kafkaDelivery;
        this.ossDelivery = $.ossDelivery;
        this.s3Delivery = $.s3Delivery;
        this.siteId = $.siteId;
        this.slsDelivery = $.slsDelivery;
        this.status = $.status;
        this.taskName = $.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SiteDeliveryTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SiteDeliveryTaskArgs $;

        public Builder() {
            $ = new SiteDeliveryTaskArgs();
        }

        public Builder(SiteDeliveryTaskArgs defaults) {
            $ = new SiteDeliveryTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param businessType Real-time log type. Valid values:
         * - `dcdn_log_access_l1 (default)`: access log.
         * 
         * @return builder
         * 
         */
        public Builder businessType(Output<String> businessType) {
            $.businessType = businessType;
            return this;
        }

        /**
         * @param businessType Real-time log type. Valid values:
         * - `dcdn_log_access_l1 (default)`: access log.
         * 
         * @return builder
         * 
         */
        public Builder businessType(String businessType) {
            return businessType(Output.of(businessType));
        }

        /**
         * @param dataCenter Data Center. Values:
         * 
         * @return builder
         * 
         */
        public Builder dataCenter(Output<String> dataCenter) {
            $.dataCenter = dataCenter;
            return this;
        }

        /**
         * @param dataCenter Data Center. Values:
         * 
         * @return builder
         * 
         */
        public Builder dataCenter(String dataCenter) {
            return dataCenter(Output.of(dataCenter));
        }

        /**
         * @param deliveryType Delivery Type:
         * 
         * @return builder
         * 
         */
        public Builder deliveryType(Output<String> deliveryType) {
            $.deliveryType = deliveryType;
            return this;
        }

        /**
         * @param deliveryType Delivery Type:
         * 
         * @return builder
         * 
         */
        public Builder deliveryType(String deliveryType) {
            return deliveryType(Output.of(deliveryType));
        }

        /**
         * @param discardRate If the discard rate is not filled, the default value is 0.
         * 
         * @return builder
         * 
         */
        public Builder discardRate(@Nullable Output<Double> discardRate) {
            $.discardRate = discardRate;
            return this;
        }

        /**
         * @param discardRate If the discard rate is not filled, the default value is 0.
         * 
         * @return builder
         * 
         */
        public Builder discardRate(Double discardRate) {
            return discardRate(Output.of(discardRate));
        }

        /**
         * @param fieldName The list of delivery fields to be modified, separated by commas.
         * 
         * @return builder
         * 
         */
        public Builder fieldName(Output<String> fieldName) {
            $.fieldName = fieldName;
            return this;
        }

        /**
         * @param fieldName The list of delivery fields to be modified, separated by commas.
         * 
         * @return builder
         * 
         */
        public Builder fieldName(String fieldName) {
            return fieldName(Output.of(fieldName));
        }

        /**
         * @param httpDelivery HTTP delivery configuration parameters. See `http_delivery` below.
         * 
         * @return builder
         * 
         */
        public Builder httpDelivery(@Nullable Output<SiteDeliveryTaskHttpDeliveryArgs> httpDelivery) {
            $.httpDelivery = httpDelivery;
            return this;
        }

        /**
         * @param httpDelivery HTTP delivery configuration parameters. See `http_delivery` below.
         * 
         * @return builder
         * 
         */
        public Builder httpDelivery(SiteDeliveryTaskHttpDeliveryArgs httpDelivery) {
            return httpDelivery(Output.of(httpDelivery));
        }

        /**
         * @param kafkaDelivery Kafka delivery configuration parameters. See `kafka_delivery` below.
         * 
         * @return builder
         * 
         */
        public Builder kafkaDelivery(@Nullable Output<SiteDeliveryTaskKafkaDeliveryArgs> kafkaDelivery) {
            $.kafkaDelivery = kafkaDelivery;
            return this;
        }

        /**
         * @param kafkaDelivery Kafka delivery configuration parameters. See `kafka_delivery` below.
         * 
         * @return builder
         * 
         */
        public Builder kafkaDelivery(SiteDeliveryTaskKafkaDeliveryArgs kafkaDelivery) {
            return kafkaDelivery(Output.of(kafkaDelivery));
        }

        /**
         * @param ossDelivery OSS delivery configuration. See `oss_delivery` below.
         * 
         * @return builder
         * 
         */
        public Builder ossDelivery(@Nullable Output<SiteDeliveryTaskOssDeliveryArgs> ossDelivery) {
            $.ossDelivery = ossDelivery;
            return this;
        }

        /**
         * @param ossDelivery OSS delivery configuration. See `oss_delivery` below.
         * 
         * @return builder
         * 
         */
        public Builder ossDelivery(SiteDeliveryTaskOssDeliveryArgs ossDelivery) {
            return ossDelivery(Output.of(ossDelivery));
        }

        /**
         * @param s3Delivery S3/S3 compatible delivery configuration parameters. See `s3_delivery` below.
         * 
         * @return builder
         * 
         */
        public Builder s3Delivery(@Nullable Output<SiteDeliveryTaskS3DeliveryArgs> s3Delivery) {
            $.s3Delivery = s3Delivery;
            return this;
        }

        /**
         * @param s3Delivery S3/S3 compatible delivery configuration parameters. See `s3_delivery` below.
         * 
         * @return builder
         * 
         */
        public Builder s3Delivery(SiteDeliveryTaskS3DeliveryArgs s3Delivery) {
            return s3Delivery(Output.of(s3Delivery));
        }

        /**
         * @param siteId The site ID, which can be obtained by calling the [ListSites](https://help.aliyun.com/document_detail/2850189.html) interface.
         * 
         * @return builder
         * 
         */
        public Builder siteId(Output<Integer> siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteId The site ID, which can be obtained by calling the [ListSites](https://help.aliyun.com/document_detail/2850189.html) interface.
         * 
         * @return builder
         * 
         */
        public Builder siteId(Integer siteId) {
            return siteId(Output.of(siteId));
        }

        /**
         * @param slsDelivery SLS delivery configuration. See `sls_delivery` below.
         * 
         * @return builder
         * 
         */
        public Builder slsDelivery(@Nullable Output<SiteDeliveryTaskSlsDeliveryArgs> slsDelivery) {
            $.slsDelivery = slsDelivery;
            return this;
        }

        /**
         * @param slsDelivery SLS delivery configuration. See `sls_delivery` below.
         * 
         * @return builder
         * 
         */
        public Builder slsDelivery(SiteDeliveryTaskSlsDeliveryArgs slsDelivery) {
            return slsDelivery(Output.of(slsDelivery));
        }

        /**
         * @param status Task status, value:
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Task status, value:
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param taskName The task name.
         * 
         * @return builder
         * 
         */
        public Builder taskName(Output<String> taskName) {
            $.taskName = taskName;
            return this;
        }

        /**
         * @param taskName The task name.
         * 
         * @return builder
         * 
         */
        public Builder taskName(String taskName) {
            return taskName(Output.of(taskName));
        }

        public SiteDeliveryTaskArgs build() {
            if ($.businessType == null) {
                throw new MissingRequiredPropertyException("SiteDeliveryTaskArgs", "businessType");
            }
            if ($.dataCenter == null) {
                throw new MissingRequiredPropertyException("SiteDeliveryTaskArgs", "dataCenter");
            }
            if ($.deliveryType == null) {
                throw new MissingRequiredPropertyException("SiteDeliveryTaskArgs", "deliveryType");
            }
            if ($.fieldName == null) {
                throw new MissingRequiredPropertyException("SiteDeliveryTaskArgs", "fieldName");
            }
            if ($.siteId == null) {
                throw new MissingRequiredPropertyException("SiteDeliveryTaskArgs", "siteId");
            }
            if ($.taskName == null) {
                throw new MissingRequiredPropertyException("SiteDeliveryTaskArgs", "taskName");
            }
            return $;
        }
    }

}
