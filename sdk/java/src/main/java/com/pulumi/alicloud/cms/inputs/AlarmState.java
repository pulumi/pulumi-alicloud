// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.alicloud.cms.inputs.AlarmCompositeExpressionArgs;
import com.pulumi.alicloud.cms.inputs.AlarmEscalationsCriticalArgs;
import com.pulumi.alicloud.cms.inputs.AlarmEscalationsInfoArgs;
import com.pulumi.alicloud.cms.inputs.AlarmEscalationsWarnArgs;
import com.pulumi.alicloud.cms.inputs.AlarmPrometheusArgs;
import com.pulumi.alicloud.cms.inputs.AlarmTargetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlarmState extends com.pulumi.resources.ResourceArgs {

    public static final AlarmState Empty = new AlarmState();

    /**
     * The trigger conditions for multiple metrics. See `composite_expression` below.
     * 
     */
    @Import(name="compositeExpression")
    private @Nullable Output<AlarmCompositeExpressionArgs> compositeExpression;

    /**
     * @return The trigger conditions for multiple metrics. See `composite_expression` below.
     * 
     */
    public Optional<Output<AlarmCompositeExpressionArgs>> compositeExpression() {
        return Optional.ofNullable(this.compositeExpression);
    }

    /**
     * List contact groups of the alarm rule, which must have been created on the console.
     * 
     */
    @Import(name="contactGroups")
    private @Nullable Output<List<String>> contactGroups;

    /**
     * @return List contact groups of the alarm rule, which must have been created on the console.
     * 
     */
    public Optional<Output<List<String>>> contactGroups() {
        return Optional.ofNullable(this.contactGroups);
    }

    /**
     * Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead.
     * 
     * @deprecated
     * Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead.
     * 
     */
    @Deprecated /* Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead. */
    @Import(name="dimensions")
    private @Nullable Output<Map<String,String>> dimensions;

    /**
     * @return Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead.
     * 
     * @deprecated
     * Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead.
     * 
     */
    @Deprecated /* Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead. */
    public Optional<Output<Map<String,String>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * The interval of effecting alarm rule. It format as &#34;hh:mm-hh:mm&#34;, like &#34;0:00-4:00&#34;. Default value: `00:00-23:59`.
     * 
     */
    @Import(name="effectiveInterval")
    private @Nullable Output<String> effectiveInterval;

    /**
     * @return The interval of effecting alarm rule. It format as &#34;hh:mm-hh:mm&#34;, like &#34;0:00-4:00&#34;. Default value: `00:00-23:59`.
     * 
     */
    public Optional<Output<String>> effectiveInterval() {
        return Optional.ofNullable(this.effectiveInterval);
    }

    /**
     * Whether to enable alarm rule. Default value: `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to enable alarm rule. Default value: `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     * @deprecated
     * Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     */
    @Deprecated /* Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead. */
    @Import(name="endTime")
    private @Nullable Output<Integer> endTime;

    /**
     * @return Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     * @deprecated
     * Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     */
    @Deprecated /* Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead. */
    public Optional<Output<Integer>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * A configuration of critical alarm. See `escalations_critical` below.
     * 
     */
    @Import(name="escalationsCritical")
    private @Nullable Output<AlarmEscalationsCriticalArgs> escalationsCritical;

    /**
     * @return A configuration of critical alarm. See `escalations_critical` below.
     * 
     */
    public Optional<Output<AlarmEscalationsCriticalArgs>> escalationsCritical() {
        return Optional.ofNullable(this.escalationsCritical);
    }

    /**
     * A configuration of critical info. See `escalations_info` below.
     * 
     */
    @Import(name="escalationsInfo")
    private @Nullable Output<AlarmEscalationsInfoArgs> escalationsInfo;

    /**
     * @return A configuration of critical info. See `escalations_info` below.
     * 
     */
    public Optional<Output<AlarmEscalationsInfoArgs>> escalationsInfo() {
        return Optional.ofNullable(this.escalationsInfo);
    }

    /**
     * A configuration of critical warn. See `escalations_warn` below.
     * 
     */
    @Import(name="escalationsWarn")
    private @Nullable Output<AlarmEscalationsWarnArgs> escalationsWarn;

    /**
     * @return A configuration of critical warn. See `escalations_warn` below.
     * 
     */
    public Optional<Output<AlarmEscalationsWarnArgs>> escalationsWarn() {
        return Optional.ofNullable(this.escalationsWarn);
    }

    /**
     * The name of the metric, such as `CPUUtilization` and `networkin_rate`. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     * 
     */
    @Import(name="metric")
    private @Nullable Output<String> metric;

    /**
     * @return The name of the metric, such as `CPUUtilization` and `networkin_rate`. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     * 
     */
    public Optional<Output<String>> metric() {
        return Optional.ofNullable(this.metric);
    }

    /**
     * Map of the resources associated with the alarm rule, such as &#34;instanceId&#34;, &#34;device&#34; and &#34;port&#34;. Each key&#39;s value is a string, and it uses comma to split multiple items. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     * 
     */
    @Import(name="metricDimensions")
    private @Nullable Output<String> metricDimensions;

    /**
     * @return Map of the resources associated with the alarm rule, such as &#34;instanceId&#34;, &#34;device&#34; and &#34;port&#34;. Each key&#39;s value is a string, and it uses comma to split multiple items. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     * 
     */
    public Optional<Output<String>> metricDimensions() {
        return Optional.ofNullable(this.metricDimensions);
    }

    /**
     * The name of the alert rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the alert rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The statistical period of the metric. Unit: seconds. Default value: `300`.
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return The statistical period of the metric. Unit: seconds. Default value: `300`.
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The namespace of the cloud service, such as `acs_ecs_dashboard` and `acs_rds_dashboard`. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     * **NOTE:** The `dimensions` and `metric_dimensions` must be empty when `project` is `acs_prometheus`, otherwise, one of them must be set.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The namespace of the cloud service, such as `acs_ecs_dashboard` and `acs_rds_dashboard`. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     * **NOTE:** The `dimensions` and `metric_dimensions` must be empty when `project` is `acs_prometheus`, otherwise, one of them must be set.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The Prometheus alert rule. See `prometheus` below. **Note:** This parameter is required only when you create a Prometheus alert rule for Hybrid Cloud Monitoring.
     * 
     */
    @Import(name="prometheuses")
    private @Nullable Output<List<AlarmPrometheusArgs>> prometheuses;

    /**
     * @return The Prometheus alert rule. See `prometheus` below. **Note:** This parameter is required only when you create a Prometheus alert rule for Hybrid Cloud Monitoring.
     * 
     */
    public Optional<Output<List<AlarmPrometheusArgs>>> prometheuses() {
        return Optional.ofNullable(this.prometheuses);
    }

    /**
     * Notification silence period in the alarm state, in seconds. Default value: `86400`. Valid value range: [300, 86400].
     * 
     */
    @Import(name="silenceTime")
    private @Nullable Output<Integer> silenceTime;

    /**
     * @return Notification silence period in the alarm state, in seconds. Default value: `86400`. Valid value range: [300, 86400].
     * 
     */
    public Optional<Output<Integer>> silenceTime() {
        return Optional.ofNullable(this.silenceTime);
    }

    /**
     * Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     * @deprecated
     * Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     */
    @Deprecated /* Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead. */
    @Import(name="startTime")
    private @Nullable Output<Integer> startTime;

    /**
     * @return Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     * @deprecated
     * Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
     * 
     */
    @Deprecated /* Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead. */
    public Optional<Output<Integer>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * The status of the Alarm.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the Alarm.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Adds or modifies the push channels of an alert rule. See `targets` below.
     * 
     */
    @Import(name="targets")
    private @Nullable Output<List<AlarmTargetArgs>> targets;

    /**
     * @return Adds or modifies the push channels of an alert rule. See `targets` below.
     * 
     */
    public Optional<Output<List<AlarmTargetArgs>>> targets() {
        return Optional.ofNullable(this.targets);
    }

    /**
     * The webhook that should be called when the alarm is triggered. Currently, only http protocol is supported. Default is empty string.
     * 
     */
    @Import(name="webhook")
    private @Nullable Output<String> webhook;

    /**
     * @return The webhook that should be called when the alarm is triggered. Currently, only http protocol is supported. Default is empty string.
     * 
     */
    public Optional<Output<String>> webhook() {
        return Optional.ofNullable(this.webhook);
    }

    private AlarmState() {}

    private AlarmState(AlarmState $) {
        this.compositeExpression = $.compositeExpression;
        this.contactGroups = $.contactGroups;
        this.dimensions = $.dimensions;
        this.effectiveInterval = $.effectiveInterval;
        this.enabled = $.enabled;
        this.endTime = $.endTime;
        this.escalationsCritical = $.escalationsCritical;
        this.escalationsInfo = $.escalationsInfo;
        this.escalationsWarn = $.escalationsWarn;
        this.metric = $.metric;
        this.metricDimensions = $.metricDimensions;
        this.name = $.name;
        this.period = $.period;
        this.project = $.project;
        this.prometheuses = $.prometheuses;
        this.silenceTime = $.silenceTime;
        this.startTime = $.startTime;
        this.status = $.status;
        this.tags = $.tags;
        this.targets = $.targets;
        this.webhook = $.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlarmState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlarmState $;

        public Builder() {
            $ = new AlarmState();
        }

        public Builder(AlarmState defaults) {
            $ = new AlarmState(Objects.requireNonNull(defaults));
        }

        /**
         * @param compositeExpression The trigger conditions for multiple metrics. See `composite_expression` below.
         * 
         * @return builder
         * 
         */
        public Builder compositeExpression(@Nullable Output<AlarmCompositeExpressionArgs> compositeExpression) {
            $.compositeExpression = compositeExpression;
            return this;
        }

        /**
         * @param compositeExpression The trigger conditions for multiple metrics. See `composite_expression` below.
         * 
         * @return builder
         * 
         */
        public Builder compositeExpression(AlarmCompositeExpressionArgs compositeExpression) {
            return compositeExpression(Output.of(compositeExpression));
        }

        /**
         * @param contactGroups List contact groups of the alarm rule, which must have been created on the console.
         * 
         * @return builder
         * 
         */
        public Builder contactGroups(@Nullable Output<List<String>> contactGroups) {
            $.contactGroups = contactGroups;
            return this;
        }

        /**
         * @param contactGroups List contact groups of the alarm rule, which must have been created on the console.
         * 
         * @return builder
         * 
         */
        public Builder contactGroups(List<String> contactGroups) {
            return contactGroups(Output.of(contactGroups));
        }

        /**
         * @param contactGroups List contact groups of the alarm rule, which must have been created on the console.
         * 
         * @return builder
         * 
         */
        public Builder contactGroups(String... contactGroups) {
            return contactGroups(List.of(contactGroups));
        }

        /**
         * @param dimensions Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead.
         * 
         */
        @Deprecated /* Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead. */
        public Builder dimensions(@Nullable Output<Map<String,String>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead.
         * 
         */
        @Deprecated /* Field `dimensions` has been deprecated from provider version 1.173.0. New field `metric_dimensions` instead. */
        public Builder dimensions(Map<String,String> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param effectiveInterval The interval of effecting alarm rule. It format as &#34;hh:mm-hh:mm&#34;, like &#34;0:00-4:00&#34;. Default value: `00:00-23:59`.
         * 
         * @return builder
         * 
         */
        public Builder effectiveInterval(@Nullable Output<String> effectiveInterval) {
            $.effectiveInterval = effectiveInterval;
            return this;
        }

        /**
         * @param effectiveInterval The interval of effecting alarm rule. It format as &#34;hh:mm-hh:mm&#34;, like &#34;0:00-4:00&#34;. Default value: `00:00-23:59`.
         * 
         * @return builder
         * 
         */
        public Builder effectiveInterval(String effectiveInterval) {
            return effectiveInterval(Output.of(effectiveInterval));
        }

        /**
         * @param enabled Whether to enable alarm rule. Default value: `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable alarm rule. Default value: `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param endTime Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
         * 
         */
        @Deprecated /* Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead. */
        public Builder endTime(@Nullable Output<Integer> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
         * 
         */
        @Deprecated /* Field `end_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead. */
        public Builder endTime(Integer endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param escalationsCritical A configuration of critical alarm. See `escalations_critical` below.
         * 
         * @return builder
         * 
         */
        public Builder escalationsCritical(@Nullable Output<AlarmEscalationsCriticalArgs> escalationsCritical) {
            $.escalationsCritical = escalationsCritical;
            return this;
        }

        /**
         * @param escalationsCritical A configuration of critical alarm. See `escalations_critical` below.
         * 
         * @return builder
         * 
         */
        public Builder escalationsCritical(AlarmEscalationsCriticalArgs escalationsCritical) {
            return escalationsCritical(Output.of(escalationsCritical));
        }

        /**
         * @param escalationsInfo A configuration of critical info. See `escalations_info` below.
         * 
         * @return builder
         * 
         */
        public Builder escalationsInfo(@Nullable Output<AlarmEscalationsInfoArgs> escalationsInfo) {
            $.escalationsInfo = escalationsInfo;
            return this;
        }

        /**
         * @param escalationsInfo A configuration of critical info. See `escalations_info` below.
         * 
         * @return builder
         * 
         */
        public Builder escalationsInfo(AlarmEscalationsInfoArgs escalationsInfo) {
            return escalationsInfo(Output.of(escalationsInfo));
        }

        /**
         * @param escalationsWarn A configuration of critical warn. See `escalations_warn` below.
         * 
         * @return builder
         * 
         */
        public Builder escalationsWarn(@Nullable Output<AlarmEscalationsWarnArgs> escalationsWarn) {
            $.escalationsWarn = escalationsWarn;
            return this;
        }

        /**
         * @param escalationsWarn A configuration of critical warn. See `escalations_warn` below.
         * 
         * @return builder
         * 
         */
        public Builder escalationsWarn(AlarmEscalationsWarnArgs escalationsWarn) {
            return escalationsWarn(Output.of(escalationsWarn));
        }

        /**
         * @param metric The name of the metric, such as `CPUUtilization` and `networkin_rate`. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
         * 
         * @return builder
         * 
         */
        public Builder metric(@Nullable Output<String> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric The name of the metric, such as `CPUUtilization` and `networkin_rate`. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
         * 
         * @return builder
         * 
         */
        public Builder metric(String metric) {
            return metric(Output.of(metric));
        }

        /**
         * @param metricDimensions Map of the resources associated with the alarm rule, such as &#34;instanceId&#34;, &#34;device&#34; and &#34;port&#34;. Each key&#39;s value is a string, and it uses comma to split multiple items. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
         * 
         * @return builder
         * 
         */
        public Builder metricDimensions(@Nullable Output<String> metricDimensions) {
            $.metricDimensions = metricDimensions;
            return this;
        }

        /**
         * @param metricDimensions Map of the resources associated with the alarm rule, such as &#34;instanceId&#34;, &#34;device&#34; and &#34;port&#34;. Each key&#39;s value is a string, and it uses comma to split multiple items. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
         * 
         * @return builder
         * 
         */
        public Builder metricDimensions(String metricDimensions) {
            return metricDimensions(Output.of(metricDimensions));
        }

        /**
         * @param name The name of the alert rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the alert rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param period The statistical period of the metric. Unit: seconds. Default value: `300`.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The statistical period of the metric. Unit: seconds. Default value: `300`.
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param project The namespace of the cloud service, such as `acs_ecs_dashboard` and `acs_rds_dashboard`. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
         * **NOTE:** The `dimensions` and `metric_dimensions` must be empty when `project` is `acs_prometheus`, otherwise, one of them must be set.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The namespace of the cloud service, such as `acs_ecs_dashboard` and `acs_rds_dashboard`. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
         * **NOTE:** The `dimensions` and `metric_dimensions` must be empty when `project` is `acs_prometheus`, otherwise, one of them must be set.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param prometheuses The Prometheus alert rule. See `prometheus` below. **Note:** This parameter is required only when you create a Prometheus alert rule for Hybrid Cloud Monitoring.
         * 
         * @return builder
         * 
         */
        public Builder prometheuses(@Nullable Output<List<AlarmPrometheusArgs>> prometheuses) {
            $.prometheuses = prometheuses;
            return this;
        }

        /**
         * @param prometheuses The Prometheus alert rule. See `prometheus` below. **Note:** This parameter is required only when you create a Prometheus alert rule for Hybrid Cloud Monitoring.
         * 
         * @return builder
         * 
         */
        public Builder prometheuses(List<AlarmPrometheusArgs> prometheuses) {
            return prometheuses(Output.of(prometheuses));
        }

        /**
         * @param prometheuses The Prometheus alert rule. See `prometheus` below. **Note:** This parameter is required only when you create a Prometheus alert rule for Hybrid Cloud Monitoring.
         * 
         * @return builder
         * 
         */
        public Builder prometheuses(AlarmPrometheusArgs... prometheuses) {
            return prometheuses(List.of(prometheuses));
        }

        /**
         * @param silenceTime Notification silence period in the alarm state, in seconds. Default value: `86400`. Valid value range: [300, 86400].
         * 
         * @return builder
         * 
         */
        public Builder silenceTime(@Nullable Output<Integer> silenceTime) {
            $.silenceTime = silenceTime;
            return this;
        }

        /**
         * @param silenceTime Notification silence period in the alarm state, in seconds. Default value: `86400`. Valid value range: [300, 86400].
         * 
         * @return builder
         * 
         */
        public Builder silenceTime(Integer silenceTime) {
            return silenceTime(Output.of(silenceTime));
        }

        /**
         * @param startTime Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
         * 
         */
        @Deprecated /* Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead. */
        public Builder startTime(@Nullable Output<Integer> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead.
         * 
         */
        @Deprecated /* Field `start_time` has been deprecated from provider version 1.50.0. New field `effective_interval` instead. */
        public Builder startTime(Integer startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param status The status of the Alarm.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the Alarm.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param targets Adds or modifies the push channels of an alert rule. See `targets` below.
         * 
         * @return builder
         * 
         */
        public Builder targets(@Nullable Output<List<AlarmTargetArgs>> targets) {
            $.targets = targets;
            return this;
        }

        /**
         * @param targets Adds or modifies the push channels of an alert rule. See `targets` below.
         * 
         * @return builder
         * 
         */
        public Builder targets(List<AlarmTargetArgs> targets) {
            return targets(Output.of(targets));
        }

        /**
         * @param targets Adds or modifies the push channels of an alert rule. See `targets` below.
         * 
         * @return builder
         * 
         */
        public Builder targets(AlarmTargetArgs... targets) {
            return targets(List.of(targets));
        }

        /**
         * @param webhook The webhook that should be called when the alarm is triggered. Currently, only http protocol is supported. Default is empty string.
         * 
         * @return builder
         * 
         */
        public Builder webhook(@Nullable Output<String> webhook) {
            $.webhook = webhook;
            return this;
        }

        /**
         * @param webhook The webhook that should be called when the alarm is triggered. Currently, only http protocol is supported. Default is empty string.
         * 
         * @return builder
         * 
         */
        public Builder webhook(String webhook) {
            return webhook(Output.of(webhook));
        }

        public AlarmState build() {
            return $;
        }
    }

}
