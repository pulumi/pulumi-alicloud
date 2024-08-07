// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAggregateDeliveriesDelivery {
    /**
     * @return The Aliyun User Id.
     * 
     */
    private String accountId;
    /**
     * @return The ID of the Aggregator.
     * 
     */
    private String aggregatorId;
    /**
     * @return Open or close delivery configuration change history.
     * 
     */
    private Boolean configurationItemChangeNotification;
    /**
     * @return Open or close timed snapshot of shipping resources.
     * 
     */
    private Boolean configurationSnapshot;
    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
     * 
     */
    private String deliveryChannelAssumeRoleArn;
    /**
     * @return The rule attached to the delivery method.
     * 
     */
    private String deliveryChannelCondition;
    /**
     * @return The ID of the delivery method.
     * 
     */
    private String deliveryChannelId;
    /**
     * @return The name of the delivery method.
     * 
     */
    private String deliveryChannelName;
    /**
     * @return The ARN of the delivery destination.
     * 
     */
    private String deliveryChannelTargetArn;
    /**
     * @return The type of the delivery method.
     * 
     */
    private String deliveryChannelType;
    /**
     * @return The description of the delivery method.
     * 
     */
    private String description;
    /**
     * @return The ID of the Aggregate Delivery.
     * 
     */
    private String id;
    /**
     * @return Open or close non-compliance events of delivery resources.
     * 
     */
    private Boolean nonCompliantNotification;
    /**
     * @return The oss ARN of the delivery channel when the value data oversized limit.
     * 
     */
    private String oversizedDataOssTargetArn;
    /**
     * @return The status of the delivery method. Valid values: `0`: The delivery method is disabled. `1`: The delivery destination is enabled.
     * 
     */
    private Integer status;

    private GetAggregateDeliveriesDelivery() {}
    /**
     * @return The Aliyun User Id.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The ID of the Aggregator.
     * 
     */
    public String aggregatorId() {
        return this.aggregatorId;
    }
    /**
     * @return Open or close delivery configuration change history.
     * 
     */
    public Boolean configurationItemChangeNotification() {
        return this.configurationItemChangeNotification;
    }
    /**
     * @return Open or close timed snapshot of shipping resources.
     * 
     */
    public Boolean configurationSnapshot() {
        return this.configurationSnapshot;
    }
    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
     * 
     */
    public String deliveryChannelAssumeRoleArn() {
        return this.deliveryChannelAssumeRoleArn;
    }
    /**
     * @return The rule attached to the delivery method.
     * 
     */
    public String deliveryChannelCondition() {
        return this.deliveryChannelCondition;
    }
    /**
     * @return The ID of the delivery method.
     * 
     */
    public String deliveryChannelId() {
        return this.deliveryChannelId;
    }
    /**
     * @return The name of the delivery method.
     * 
     */
    public String deliveryChannelName() {
        return this.deliveryChannelName;
    }
    /**
     * @return The ARN of the delivery destination.
     * 
     */
    public String deliveryChannelTargetArn() {
        return this.deliveryChannelTargetArn;
    }
    /**
     * @return The type of the delivery method.
     * 
     */
    public String deliveryChannelType() {
        return this.deliveryChannelType;
    }
    /**
     * @return The description of the delivery method.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Aggregate Delivery.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Open or close non-compliance events of delivery resources.
     * 
     */
    public Boolean nonCompliantNotification() {
        return this.nonCompliantNotification;
    }
    /**
     * @return The oss ARN of the delivery channel when the value data oversized limit.
     * 
     */
    public String oversizedDataOssTargetArn() {
        return this.oversizedDataOssTargetArn;
    }
    /**
     * @return The status of the delivery method. Valid values: `0`: The delivery method is disabled. `1`: The delivery destination is enabled.
     * 
     */
    public Integer status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAggregateDeliveriesDelivery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String aggregatorId;
        private Boolean configurationItemChangeNotification;
        private Boolean configurationSnapshot;
        private String deliveryChannelAssumeRoleArn;
        private String deliveryChannelCondition;
        private String deliveryChannelId;
        private String deliveryChannelName;
        private String deliveryChannelTargetArn;
        private String deliveryChannelType;
        private String description;
        private String id;
        private Boolean nonCompliantNotification;
        private String oversizedDataOssTargetArn;
        private Integer status;
        public Builder() {}
        public Builder(GetAggregateDeliveriesDelivery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.aggregatorId = defaults.aggregatorId;
    	      this.configurationItemChangeNotification = defaults.configurationItemChangeNotification;
    	      this.configurationSnapshot = defaults.configurationSnapshot;
    	      this.deliveryChannelAssumeRoleArn = defaults.deliveryChannelAssumeRoleArn;
    	      this.deliveryChannelCondition = defaults.deliveryChannelCondition;
    	      this.deliveryChannelId = defaults.deliveryChannelId;
    	      this.deliveryChannelName = defaults.deliveryChannelName;
    	      this.deliveryChannelTargetArn = defaults.deliveryChannelTargetArn;
    	      this.deliveryChannelType = defaults.deliveryChannelType;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.nonCompliantNotification = defaults.nonCompliantNotification;
    	      this.oversizedDataOssTargetArn = defaults.oversizedDataOssTargetArn;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder aggregatorId(String aggregatorId) {
            if (aggregatorId == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "aggregatorId");
            }
            this.aggregatorId = aggregatorId;
            return this;
        }
        @CustomType.Setter
        public Builder configurationItemChangeNotification(Boolean configurationItemChangeNotification) {
            if (configurationItemChangeNotification == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "configurationItemChangeNotification");
            }
            this.configurationItemChangeNotification = configurationItemChangeNotification;
            return this;
        }
        @CustomType.Setter
        public Builder configurationSnapshot(Boolean configurationSnapshot) {
            if (configurationSnapshot == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "configurationSnapshot");
            }
            this.configurationSnapshot = configurationSnapshot;
            return this;
        }
        @CustomType.Setter
        public Builder deliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
            if (deliveryChannelAssumeRoleArn == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "deliveryChannelAssumeRoleArn");
            }
            this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
            return this;
        }
        @CustomType.Setter
        public Builder deliveryChannelCondition(String deliveryChannelCondition) {
            if (deliveryChannelCondition == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "deliveryChannelCondition");
            }
            this.deliveryChannelCondition = deliveryChannelCondition;
            return this;
        }
        @CustomType.Setter
        public Builder deliveryChannelId(String deliveryChannelId) {
            if (deliveryChannelId == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "deliveryChannelId");
            }
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }
        @CustomType.Setter
        public Builder deliveryChannelName(String deliveryChannelName) {
            if (deliveryChannelName == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "deliveryChannelName");
            }
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }
        @CustomType.Setter
        public Builder deliveryChannelTargetArn(String deliveryChannelTargetArn) {
            if (deliveryChannelTargetArn == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "deliveryChannelTargetArn");
            }
            this.deliveryChannelTargetArn = deliveryChannelTargetArn;
            return this;
        }
        @CustomType.Setter
        public Builder deliveryChannelType(String deliveryChannelType) {
            if (deliveryChannelType == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "deliveryChannelType");
            }
            this.deliveryChannelType = deliveryChannelType;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder nonCompliantNotification(Boolean nonCompliantNotification) {
            if (nonCompliantNotification == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "nonCompliantNotification");
            }
            this.nonCompliantNotification = nonCompliantNotification;
            return this;
        }
        @CustomType.Setter
        public Builder oversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            if (oversizedDataOssTargetArn == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "oversizedDataOssTargetArn");
            }
            this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            return this;
        }
        @CustomType.Setter
        public Builder status(Integer status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetAggregateDeliveriesDelivery", "status");
            }
            this.status = status;
            return this;
        }
        public GetAggregateDeliveriesDelivery build() {
            final var _resultValue = new GetAggregateDeliveriesDelivery();
            _resultValue.accountId = accountId;
            _resultValue.aggregatorId = aggregatorId;
            _resultValue.configurationItemChangeNotification = configurationItemChangeNotification;
            _resultValue.configurationSnapshot = configurationSnapshot;
            _resultValue.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
            _resultValue.deliveryChannelCondition = deliveryChannelCondition;
            _resultValue.deliveryChannelId = deliveryChannelId;
            _resultValue.deliveryChannelName = deliveryChannelName;
            _resultValue.deliveryChannelTargetArn = deliveryChannelTargetArn;
            _resultValue.deliveryChannelType = deliveryChannelType;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.nonCompliantNotification = nonCompliantNotification;
            _resultValue.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
