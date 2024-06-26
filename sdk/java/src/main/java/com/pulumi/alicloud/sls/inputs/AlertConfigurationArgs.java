// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sls.inputs;

import com.pulumi.alicloud.sls.inputs.AlertConfigurationAnnotationArgs;
import com.pulumi.alicloud.sls.inputs.AlertConfigurationConditionConfigurationArgs;
import com.pulumi.alicloud.sls.inputs.AlertConfigurationGroupConfigurationArgs;
import com.pulumi.alicloud.sls.inputs.AlertConfigurationJoinConfigurationArgs;
import com.pulumi.alicloud.sls.inputs.AlertConfigurationLabelArgs;
import com.pulumi.alicloud.sls.inputs.AlertConfigurationPolicyConfigurationArgs;
import com.pulumi.alicloud.sls.inputs.AlertConfigurationQueryListArgs;
import com.pulumi.alicloud.sls.inputs.AlertConfigurationSeverityConfigurationArgs;
import com.pulumi.alicloud.sls.inputs.AlertConfigurationSinkAlerthubArgs;
import com.pulumi.alicloud.sls.inputs.AlertConfigurationSinkCmsArgs;
import com.pulumi.alicloud.sls.inputs.AlertConfigurationSinkEventStoreArgs;
import com.pulumi.alicloud.sls.inputs.AlertConfigurationTemplateConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertConfigurationArgs Empty = new AlertConfigurationArgs();

    /**
     * Template Annotations.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<AlertConfigurationAnnotationArgs>> annotations;

    /**
     * @return Template Annotations.
     * 
     */
    public Optional<Output<List<AlertConfigurationAnnotationArgs>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Whether to turn on automatic labeling. true (default): The automatic annotation function is enabled, and the system automatically adds information such as__county__to the alarm. For more information, see Automatic Labeling. false: Turn off the automatic annotation function.
     * 
     */
    @Import(name="autoAnnotation")
    private @Nullable Output<Boolean> autoAnnotation;

    /**
     * @return Whether to turn on automatic labeling. true (default): The automatic annotation function is enabled, and the system automatically adds information such as__county__to the alarm. For more information, see Automatic Labeling. false: Turn off the automatic annotation function.
     * 
     */
    public Optional<Output<Boolean>> autoAnnotation() {
        return Optional.ofNullable(this.autoAnnotation);
    }

    /**
     * Alarm trigger condition. See `condition_configuration` below.
     * 
     */
    @Import(name="conditionConfiguration")
    private @Nullable Output<AlertConfigurationConditionConfigurationArgs> conditionConfiguration;

    /**
     * @return Alarm trigger condition. See `condition_configuration` below.
     * 
     */
    public Optional<Output<AlertConfigurationConditionConfigurationArgs>> conditionConfiguration() {
        return Optional.ofNullable(this.conditionConfiguration);
    }

    /**
     * The instrument cluster associated with the alarm. It is recommended to set to internal-alert-analysis.
     * 
     */
    @Import(name="dashboard")
    private @Nullable Output<String> dashboard;

    /**
     * @return The instrument cluster associated with the alarm. It is recommended to set to internal-alert-analysis.
     * 
     */
    public Optional<Output<String>> dashboard() {
        return Optional.ofNullable(this.dashboard);
    }

    /**
     * Group evaluation configuration. See `group_configuration` below.
     * 
     */
    @Import(name="groupConfiguration")
    private @Nullable Output<AlertConfigurationGroupConfigurationArgs> groupConfiguration;

    /**
     * @return Group evaluation configuration. See `group_configuration` below.
     * 
     */
    public Optional<Output<AlertConfigurationGroupConfigurationArgs>> groupConfiguration() {
        return Optional.ofNullable(this.groupConfiguration);
    }

    /**
     * Set operation configuration. See `join_configurations` below.
     * 
     */
    @Import(name="joinConfigurations")
    private @Nullable Output<List<AlertConfigurationJoinConfigurationArgs>> joinConfigurations;

    /**
     * @return Set operation configuration. See `join_configurations` below.
     * 
     */
    public Optional<Output<List<AlertConfigurationJoinConfigurationArgs>>> joinConfigurations() {
        return Optional.ofNullable(this.joinConfigurations);
    }

    /**
     * Label. See `labels` below.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<AlertConfigurationLabelArgs>> labels;

    /**
     * @return Label. See `labels` below.
     * 
     */
    public Optional<Output<List<AlertConfigurationLabelArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Second-level timestamp representing the temporary shutdown deadline.
     * 
     */
    @Import(name="muteUntil")
    private @Nullable Output<Integer> muteUntil;

    /**
     * @return Second-level timestamp representing the temporary shutdown deadline.
     * 
     */
    public Optional<Output<Integer>> muteUntil() {
        return Optional.ofNullable(this.muteUntil);
    }

    /**
     * Whether no data triggers an alarm. true: If the number of times the query and analysis results (if there are multiple results, the result after the collection operation) is no data exceeds the continuous trigger threshold, an alarm is generated. false (default): Turn off the no data alarm function.
     * 
     */
    @Import(name="noDataFire")
    private @Nullable Output<Boolean> noDataFire;

    /**
     * @return Whether no data triggers an alarm. true: If the number of times the query and analysis results (if there are multiple results, the result after the collection operation) is no data exceeds the continuous trigger threshold, an alarm is generated. false (default): Turn off the no data alarm function.
     * 
     */
    public Optional<Output<Boolean>> noDataFire() {
        return Optional.ofNullable(this.noDataFire);
    }

    /**
     * Alarm severity when no data triggers an alarm.
     * 
     */
    @Import(name="noDataSeverity")
    private @Nullable Output<Integer> noDataSeverity;

    /**
     * @return Alarm severity when no data triggers an alarm.
     * 
     */
    public Optional<Output<Integer>> noDataSeverity() {
        return Optional.ofNullable(this.noDataSeverity);
    }

    /**
     * Alert policy configuration. See `policy_configuration` below.
     * 
     */
    @Import(name="policyConfiguration")
    private @Nullable Output<AlertConfigurationPolicyConfigurationArgs> policyConfiguration;

    /**
     * @return Alert policy configuration. See `policy_configuration` below.
     * 
     */
    public Optional<Output<AlertConfigurationPolicyConfigurationArgs>> policyConfiguration() {
        return Optional.ofNullable(this.policyConfiguration);
    }

    /**
     * Query the statistical list. See `query_list` below.
     * 
     */
    @Import(name="queryLists")
    private @Nullable Output<List<AlertConfigurationQueryListArgs>> queryLists;

    /**
     * @return Query the statistical list. See `query_list` below.
     * 
     */
    public Optional<Output<List<AlertConfigurationQueryListArgs>>> queryLists() {
        return Optional.ofNullable(this.queryLists);
    }

    /**
     * Whether to send a recovery notification. true: A recovery alarm is triggered when the alarm is restored. false (default): Turn off the alarm recovery notification function.
     * 
     */
    @Import(name="sendResolved")
    private @Nullable Output<Boolean> sendResolved;

    /**
     * @return Whether to send a recovery notification. true: A recovery alarm is triggered when the alarm is restored. false (default): Turn off the alarm recovery notification function.
     * 
     */
    public Optional<Output<Boolean>> sendResolved() {
        return Optional.ofNullable(this.sendResolved);
    }

    /**
     * Trigger condition, set at least one trigger condition. See `severity_configurations` below.
     * 
     */
    @Import(name="severityConfigurations")
    private @Nullable Output<List<AlertConfigurationSeverityConfigurationArgs>> severityConfigurations;

    /**
     * @return Trigger condition, set at least one trigger condition. See `severity_configurations` below.
     * 
     */
    public Optional<Output<List<AlertConfigurationSeverityConfigurationArgs>>> severityConfigurations() {
        return Optional.ofNullable(this.severityConfigurations);
    }

    /**
     * Configuration of Alerts Sent to Alerthub. See `sink_alerthub` below.
     * 
     */
    @Import(name="sinkAlerthub")
    private @Nullable Output<AlertConfigurationSinkAlerthubArgs> sinkAlerthub;

    /**
     * @return Configuration of Alerts Sent to Alerthub. See `sink_alerthub` below.
     * 
     */
    public Optional<Output<AlertConfigurationSinkAlerthubArgs>> sinkAlerthub() {
        return Optional.ofNullable(this.sinkAlerthub);
    }

    /**
     * Configure alerts sent to CloudMonitor. See `sink_cms` below.
     * 
     */
    @Import(name="sinkCms")
    private @Nullable Output<AlertConfigurationSinkCmsArgs> sinkCms;

    /**
     * @return Configure alerts sent to CloudMonitor. See `sink_cms` below.
     * 
     */
    public Optional<Output<AlertConfigurationSinkCmsArgs>> sinkCms() {
        return Optional.ofNullable(this.sinkCms);
    }

    /**
     * Configuration of sending alarms to EventStore. See `sink_event_store` below.
     * 
     */
    @Import(name="sinkEventStore")
    private @Nullable Output<AlertConfigurationSinkEventStoreArgs> sinkEventStore;

    /**
     * @return Configuration of sending alarms to EventStore. See `sink_event_store` below.
     * 
     */
    public Optional<Output<AlertConfigurationSinkEventStoreArgs>> sinkEventStore() {
        return Optional.ofNullable(this.sinkEventStore);
    }

    /**
     * Customize the category of alarm monitoring rules.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Customize the category of alarm monitoring rules.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Alarm rule template configuration. See `template_configuration` below.
     * 
     */
    @Import(name="templateConfiguration")
    private @Nullable Output<AlertConfigurationTemplateConfigurationArgs> templateConfiguration;

    /**
     * @return Alarm rule template configuration. See `template_configuration` below.
     * 
     */
    public Optional<Output<AlertConfigurationTemplateConfigurationArgs>> templateConfiguration() {
        return Optional.ofNullable(this.templateConfiguration);
    }

    /**
     * Set the continuous trigger threshold. When the cumulative number of triggers reaches this value, an alarm is generated. The statistics are not counted when the trigger condition is not met.
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<Integer> threshold;

    /**
     * @return Set the continuous trigger threshold. When the cumulative number of triggers reaches this value, an alarm is generated. The statistics are not counted when the trigger condition is not met.
     * 
     */
    public Optional<Output<Integer>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    /**
     * Template Type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Template Type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Template Version.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Template Version.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private AlertConfigurationArgs() {}

    private AlertConfigurationArgs(AlertConfigurationArgs $) {
        this.annotations = $.annotations;
        this.autoAnnotation = $.autoAnnotation;
        this.conditionConfiguration = $.conditionConfiguration;
        this.dashboard = $.dashboard;
        this.groupConfiguration = $.groupConfiguration;
        this.joinConfigurations = $.joinConfigurations;
        this.labels = $.labels;
        this.muteUntil = $.muteUntil;
        this.noDataFire = $.noDataFire;
        this.noDataSeverity = $.noDataSeverity;
        this.policyConfiguration = $.policyConfiguration;
        this.queryLists = $.queryLists;
        this.sendResolved = $.sendResolved;
        this.severityConfigurations = $.severityConfigurations;
        this.sinkAlerthub = $.sinkAlerthub;
        this.sinkCms = $.sinkCms;
        this.sinkEventStore = $.sinkEventStore;
        this.tags = $.tags;
        this.templateConfiguration = $.templateConfiguration;
        this.threshold = $.threshold;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertConfigurationArgs $;

        public Builder() {
            $ = new AlertConfigurationArgs();
        }

        public Builder(AlertConfigurationArgs defaults) {
            $ = new AlertConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Template Annotations.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<AlertConfigurationAnnotationArgs>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Template Annotations.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<AlertConfigurationAnnotationArgs> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations Template Annotations.
         * 
         * @return builder
         * 
         */
        public Builder annotations(AlertConfigurationAnnotationArgs... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param autoAnnotation Whether to turn on automatic labeling. true (default): The automatic annotation function is enabled, and the system automatically adds information such as__county__to the alarm. For more information, see Automatic Labeling. false: Turn off the automatic annotation function.
         * 
         * @return builder
         * 
         */
        public Builder autoAnnotation(@Nullable Output<Boolean> autoAnnotation) {
            $.autoAnnotation = autoAnnotation;
            return this;
        }

        /**
         * @param autoAnnotation Whether to turn on automatic labeling. true (default): The automatic annotation function is enabled, and the system automatically adds information such as__county__to the alarm. For more information, see Automatic Labeling. false: Turn off the automatic annotation function.
         * 
         * @return builder
         * 
         */
        public Builder autoAnnotation(Boolean autoAnnotation) {
            return autoAnnotation(Output.of(autoAnnotation));
        }

        /**
         * @param conditionConfiguration Alarm trigger condition. See `condition_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder conditionConfiguration(@Nullable Output<AlertConfigurationConditionConfigurationArgs> conditionConfiguration) {
            $.conditionConfiguration = conditionConfiguration;
            return this;
        }

        /**
         * @param conditionConfiguration Alarm trigger condition. See `condition_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder conditionConfiguration(AlertConfigurationConditionConfigurationArgs conditionConfiguration) {
            return conditionConfiguration(Output.of(conditionConfiguration));
        }

        /**
         * @param dashboard The instrument cluster associated with the alarm. It is recommended to set to internal-alert-analysis.
         * 
         * @return builder
         * 
         */
        public Builder dashboard(@Nullable Output<String> dashboard) {
            $.dashboard = dashboard;
            return this;
        }

        /**
         * @param dashboard The instrument cluster associated with the alarm. It is recommended to set to internal-alert-analysis.
         * 
         * @return builder
         * 
         */
        public Builder dashboard(String dashboard) {
            return dashboard(Output.of(dashboard));
        }

        /**
         * @param groupConfiguration Group evaluation configuration. See `group_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder groupConfiguration(@Nullable Output<AlertConfigurationGroupConfigurationArgs> groupConfiguration) {
            $.groupConfiguration = groupConfiguration;
            return this;
        }

        /**
         * @param groupConfiguration Group evaluation configuration. See `group_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder groupConfiguration(AlertConfigurationGroupConfigurationArgs groupConfiguration) {
            return groupConfiguration(Output.of(groupConfiguration));
        }

        /**
         * @param joinConfigurations Set operation configuration. See `join_configurations` below.
         * 
         * @return builder
         * 
         */
        public Builder joinConfigurations(@Nullable Output<List<AlertConfigurationJoinConfigurationArgs>> joinConfigurations) {
            $.joinConfigurations = joinConfigurations;
            return this;
        }

        /**
         * @param joinConfigurations Set operation configuration. See `join_configurations` below.
         * 
         * @return builder
         * 
         */
        public Builder joinConfigurations(List<AlertConfigurationJoinConfigurationArgs> joinConfigurations) {
            return joinConfigurations(Output.of(joinConfigurations));
        }

        /**
         * @param joinConfigurations Set operation configuration. See `join_configurations` below.
         * 
         * @return builder
         * 
         */
        public Builder joinConfigurations(AlertConfigurationJoinConfigurationArgs... joinConfigurations) {
            return joinConfigurations(List.of(joinConfigurations));
        }

        /**
         * @param labels Label. See `labels` below.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<AlertConfigurationLabelArgs>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Label. See `labels` below.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<AlertConfigurationLabelArgs> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels Label. See `labels` below.
         * 
         * @return builder
         * 
         */
        public Builder labels(AlertConfigurationLabelArgs... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param muteUntil Second-level timestamp representing the temporary shutdown deadline.
         * 
         * @return builder
         * 
         */
        public Builder muteUntil(@Nullable Output<Integer> muteUntil) {
            $.muteUntil = muteUntil;
            return this;
        }

        /**
         * @param muteUntil Second-level timestamp representing the temporary shutdown deadline.
         * 
         * @return builder
         * 
         */
        public Builder muteUntil(Integer muteUntil) {
            return muteUntil(Output.of(muteUntil));
        }

        /**
         * @param noDataFire Whether no data triggers an alarm. true: If the number of times the query and analysis results (if there are multiple results, the result after the collection operation) is no data exceeds the continuous trigger threshold, an alarm is generated. false (default): Turn off the no data alarm function.
         * 
         * @return builder
         * 
         */
        public Builder noDataFire(@Nullable Output<Boolean> noDataFire) {
            $.noDataFire = noDataFire;
            return this;
        }

        /**
         * @param noDataFire Whether no data triggers an alarm. true: If the number of times the query and analysis results (if there are multiple results, the result after the collection operation) is no data exceeds the continuous trigger threshold, an alarm is generated. false (default): Turn off the no data alarm function.
         * 
         * @return builder
         * 
         */
        public Builder noDataFire(Boolean noDataFire) {
            return noDataFire(Output.of(noDataFire));
        }

        /**
         * @param noDataSeverity Alarm severity when no data triggers an alarm.
         * 
         * @return builder
         * 
         */
        public Builder noDataSeverity(@Nullable Output<Integer> noDataSeverity) {
            $.noDataSeverity = noDataSeverity;
            return this;
        }

        /**
         * @param noDataSeverity Alarm severity when no data triggers an alarm.
         * 
         * @return builder
         * 
         */
        public Builder noDataSeverity(Integer noDataSeverity) {
            return noDataSeverity(Output.of(noDataSeverity));
        }

        /**
         * @param policyConfiguration Alert policy configuration. See `policy_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder policyConfiguration(@Nullable Output<AlertConfigurationPolicyConfigurationArgs> policyConfiguration) {
            $.policyConfiguration = policyConfiguration;
            return this;
        }

        /**
         * @param policyConfiguration Alert policy configuration. See `policy_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder policyConfiguration(AlertConfigurationPolicyConfigurationArgs policyConfiguration) {
            return policyConfiguration(Output.of(policyConfiguration));
        }

        /**
         * @param queryLists Query the statistical list. See `query_list` below.
         * 
         * @return builder
         * 
         */
        public Builder queryLists(@Nullable Output<List<AlertConfigurationQueryListArgs>> queryLists) {
            $.queryLists = queryLists;
            return this;
        }

        /**
         * @param queryLists Query the statistical list. See `query_list` below.
         * 
         * @return builder
         * 
         */
        public Builder queryLists(List<AlertConfigurationQueryListArgs> queryLists) {
            return queryLists(Output.of(queryLists));
        }

        /**
         * @param queryLists Query the statistical list. See `query_list` below.
         * 
         * @return builder
         * 
         */
        public Builder queryLists(AlertConfigurationQueryListArgs... queryLists) {
            return queryLists(List.of(queryLists));
        }

        /**
         * @param sendResolved Whether to send a recovery notification. true: A recovery alarm is triggered when the alarm is restored. false (default): Turn off the alarm recovery notification function.
         * 
         * @return builder
         * 
         */
        public Builder sendResolved(@Nullable Output<Boolean> sendResolved) {
            $.sendResolved = sendResolved;
            return this;
        }

        /**
         * @param sendResolved Whether to send a recovery notification. true: A recovery alarm is triggered when the alarm is restored. false (default): Turn off the alarm recovery notification function.
         * 
         * @return builder
         * 
         */
        public Builder sendResolved(Boolean sendResolved) {
            return sendResolved(Output.of(sendResolved));
        }

        /**
         * @param severityConfigurations Trigger condition, set at least one trigger condition. See `severity_configurations` below.
         * 
         * @return builder
         * 
         */
        public Builder severityConfigurations(@Nullable Output<List<AlertConfigurationSeverityConfigurationArgs>> severityConfigurations) {
            $.severityConfigurations = severityConfigurations;
            return this;
        }

        /**
         * @param severityConfigurations Trigger condition, set at least one trigger condition. See `severity_configurations` below.
         * 
         * @return builder
         * 
         */
        public Builder severityConfigurations(List<AlertConfigurationSeverityConfigurationArgs> severityConfigurations) {
            return severityConfigurations(Output.of(severityConfigurations));
        }

        /**
         * @param severityConfigurations Trigger condition, set at least one trigger condition. See `severity_configurations` below.
         * 
         * @return builder
         * 
         */
        public Builder severityConfigurations(AlertConfigurationSeverityConfigurationArgs... severityConfigurations) {
            return severityConfigurations(List.of(severityConfigurations));
        }

        /**
         * @param sinkAlerthub Configuration of Alerts Sent to Alerthub. See `sink_alerthub` below.
         * 
         * @return builder
         * 
         */
        public Builder sinkAlerthub(@Nullable Output<AlertConfigurationSinkAlerthubArgs> sinkAlerthub) {
            $.sinkAlerthub = sinkAlerthub;
            return this;
        }

        /**
         * @param sinkAlerthub Configuration of Alerts Sent to Alerthub. See `sink_alerthub` below.
         * 
         * @return builder
         * 
         */
        public Builder sinkAlerthub(AlertConfigurationSinkAlerthubArgs sinkAlerthub) {
            return sinkAlerthub(Output.of(sinkAlerthub));
        }

        /**
         * @param sinkCms Configure alerts sent to CloudMonitor. See `sink_cms` below.
         * 
         * @return builder
         * 
         */
        public Builder sinkCms(@Nullable Output<AlertConfigurationSinkCmsArgs> sinkCms) {
            $.sinkCms = sinkCms;
            return this;
        }

        /**
         * @param sinkCms Configure alerts sent to CloudMonitor. See `sink_cms` below.
         * 
         * @return builder
         * 
         */
        public Builder sinkCms(AlertConfigurationSinkCmsArgs sinkCms) {
            return sinkCms(Output.of(sinkCms));
        }

        /**
         * @param sinkEventStore Configuration of sending alarms to EventStore. See `sink_event_store` below.
         * 
         * @return builder
         * 
         */
        public Builder sinkEventStore(@Nullable Output<AlertConfigurationSinkEventStoreArgs> sinkEventStore) {
            $.sinkEventStore = sinkEventStore;
            return this;
        }

        /**
         * @param sinkEventStore Configuration of sending alarms to EventStore. See `sink_event_store` below.
         * 
         * @return builder
         * 
         */
        public Builder sinkEventStore(AlertConfigurationSinkEventStoreArgs sinkEventStore) {
            return sinkEventStore(Output.of(sinkEventStore));
        }

        /**
         * @param tags Customize the category of alarm monitoring rules.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Customize the category of alarm monitoring rules.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Customize the category of alarm monitoring rules.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param templateConfiguration Alarm rule template configuration. See `template_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder templateConfiguration(@Nullable Output<AlertConfigurationTemplateConfigurationArgs> templateConfiguration) {
            $.templateConfiguration = templateConfiguration;
            return this;
        }

        /**
         * @param templateConfiguration Alarm rule template configuration. See `template_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder templateConfiguration(AlertConfigurationTemplateConfigurationArgs templateConfiguration) {
            return templateConfiguration(Output.of(templateConfiguration));
        }

        /**
         * @param threshold Set the continuous trigger threshold. When the cumulative number of triggers reaches this value, an alarm is generated. The statistics are not counted when the trigger condition is not met.
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable Output<Integer> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold Set the continuous trigger threshold. When the cumulative number of triggers reaches this value, an alarm is generated. The statistics are not counted when the trigger condition is not met.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Integer threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param type Template Type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Template Type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param version Template Version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Template Version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public AlertConfigurationArgs build() {
            return $;
        }
    }

}
