// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks;

import com.pulumi.alicloud.dataworks.inputs.DiAlarmRuleNotificationSettingsArgs;
import com.pulumi.alicloud.dataworks.inputs.DiAlarmRuleTriggerConditionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiAlarmRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiAlarmRuleArgs Empty = new DiAlarmRuleArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Data Integration alarm rule name
     * 
     */
    @Import(name="diAlarmRuleName", required=true)
    private Output<String> diAlarmRuleName;

    /**
     * @return Data Integration alarm rule name
     * 
     */
    public Output<String> diAlarmRuleName() {
        return this.diAlarmRuleName;
    }

    /**
     * Task ID: the ID of the task associated with the alert rule.
     * 
     */
    @Import(name="diJobId", required=true)
    private Output<Integer> diJobId;

    /**
     * @return Task ID: the ID of the task associated with the alert rule.
     * 
     */
    public Output<Integer> diJobId() {
        return this.diJobId;
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Alarm indicator type. Optional enumerated values:
     * - Heartbeat (task status alarm)
     * - FailoverCount(failover times alarm)
     * - Delay (task Delay alarm)
     * 
     */
    @Import(name="metricType", required=true)
    private Output<String> metricType;

    /**
     * @return Alarm indicator type. Optional enumerated values:
     * - Heartbeat (task status alarm)
     * - FailoverCount(failover times alarm)
     * - Delay (task Delay alarm)
     * 
     */
    public Output<String> metricType() {
        return this.metricType;
    }

    /**
     * Alarm notification settings See `notification_settings` below.
     * 
     */
    @Import(name="notificationSettings", required=true)
    private Output<DiAlarmRuleNotificationSettingsArgs> notificationSettings;

    /**
     * @return Alarm notification settings See `notification_settings` below.
     * 
     */
    public Output<DiAlarmRuleNotificationSettingsArgs> notificationSettings() {
        return this.notificationSettings;
    }

    /**
     * Alarm trigger condition list, supporting multiple conditions See `trigger_conditions` below.
     * 
     */
    @Import(name="triggerConditions", required=true)
    private Output<List<DiAlarmRuleTriggerConditionArgs>> triggerConditions;

    /**
     * @return Alarm trigger condition list, supporting multiple conditions See `trigger_conditions` below.
     * 
     */
    public Output<List<DiAlarmRuleTriggerConditionArgs>> triggerConditions() {
        return this.triggerConditions;
    }

    private DiAlarmRuleArgs() {}

    private DiAlarmRuleArgs(DiAlarmRuleArgs $) {
        this.description = $.description;
        this.diAlarmRuleName = $.diAlarmRuleName;
        this.diJobId = $.diJobId;
        this.enabled = $.enabled;
        this.metricType = $.metricType;
        this.notificationSettings = $.notificationSettings;
        this.triggerConditions = $.triggerConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiAlarmRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiAlarmRuleArgs $;

        public Builder() {
            $ = new DiAlarmRuleArgs();
        }

        public Builder(DiAlarmRuleArgs defaults) {
            $ = new DiAlarmRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param diAlarmRuleName Data Integration alarm rule name
         * 
         * @return builder
         * 
         */
        public Builder diAlarmRuleName(Output<String> diAlarmRuleName) {
            $.diAlarmRuleName = diAlarmRuleName;
            return this;
        }

        /**
         * @param diAlarmRuleName Data Integration alarm rule name
         * 
         * @return builder
         * 
         */
        public Builder diAlarmRuleName(String diAlarmRuleName) {
            return diAlarmRuleName(Output.of(diAlarmRuleName));
        }

        /**
         * @param diJobId Task ID: the ID of the task associated with the alert rule.
         * 
         * @return builder
         * 
         */
        public Builder diJobId(Output<Integer> diJobId) {
            $.diJobId = diJobId;
            return this;
        }

        /**
         * @param diJobId Task ID: the ID of the task associated with the alert rule.
         * 
         * @return builder
         * 
         */
        public Builder diJobId(Integer diJobId) {
            return diJobId(Output.of(diJobId));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param metricType Alarm indicator type. Optional enumerated values:
         * - Heartbeat (task status alarm)
         * - FailoverCount(failover times alarm)
         * - Delay (task Delay alarm)
         * 
         * @return builder
         * 
         */
        public Builder metricType(Output<String> metricType) {
            $.metricType = metricType;
            return this;
        }

        /**
         * @param metricType Alarm indicator type. Optional enumerated values:
         * - Heartbeat (task status alarm)
         * - FailoverCount(failover times alarm)
         * - Delay (task Delay alarm)
         * 
         * @return builder
         * 
         */
        public Builder metricType(String metricType) {
            return metricType(Output.of(metricType));
        }

        /**
         * @param notificationSettings Alarm notification settings See `notification_settings` below.
         * 
         * @return builder
         * 
         */
        public Builder notificationSettings(Output<DiAlarmRuleNotificationSettingsArgs> notificationSettings) {
            $.notificationSettings = notificationSettings;
            return this;
        }

        /**
         * @param notificationSettings Alarm notification settings See `notification_settings` below.
         * 
         * @return builder
         * 
         */
        public Builder notificationSettings(DiAlarmRuleNotificationSettingsArgs notificationSettings) {
            return notificationSettings(Output.of(notificationSettings));
        }

        /**
         * @param triggerConditions Alarm trigger condition list, supporting multiple conditions See `trigger_conditions` below.
         * 
         * @return builder
         * 
         */
        public Builder triggerConditions(Output<List<DiAlarmRuleTriggerConditionArgs>> triggerConditions) {
            $.triggerConditions = triggerConditions;
            return this;
        }

        /**
         * @param triggerConditions Alarm trigger condition list, supporting multiple conditions See `trigger_conditions` below.
         * 
         * @return builder
         * 
         */
        public Builder triggerConditions(List<DiAlarmRuleTriggerConditionArgs> triggerConditions) {
            return triggerConditions(Output.of(triggerConditions));
        }

        /**
         * @param triggerConditions Alarm trigger condition list, supporting multiple conditions See `trigger_conditions` below.
         * 
         * @return builder
         * 
         */
        public Builder triggerConditions(DiAlarmRuleTriggerConditionArgs... triggerConditions) {
            return triggerConditions(List.of(triggerConditions));
        }

        public DiAlarmRuleArgs build() {
            if ($.diAlarmRuleName == null) {
                throw new MissingRequiredPropertyException("DiAlarmRuleArgs", "diAlarmRuleName");
            }
            if ($.diJobId == null) {
                throw new MissingRequiredPropertyException("DiAlarmRuleArgs", "diJobId");
            }
            if ($.metricType == null) {
                throw new MissingRequiredPropertyException("DiAlarmRuleArgs", "metricType");
            }
            if ($.notificationSettings == null) {
                throw new MissingRequiredPropertyException("DiAlarmRuleArgs", "notificationSettings");
            }
            if ($.triggerConditions == null) {
                throw new MissingRequiredPropertyException("DiAlarmRuleArgs", "triggerConditions");
            }
            return $;
        }
    }

}
