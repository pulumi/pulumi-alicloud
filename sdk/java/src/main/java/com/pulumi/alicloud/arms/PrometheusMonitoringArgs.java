// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrometheusMonitoringArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrometheusMonitoringArgs Empty = new PrometheusMonitoringArgs();

    /**
     * The ID of the prometheus instance.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The ID of the prometheus instance.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * Yaml configuration for monitoring.
     * 
     */
    @Import(name="configYaml", required=true)
    private Output<String> configYaml;

    /**
     * @return Yaml configuration for monitoring.
     * 
     */
    public Output<String> configYaml() {
        return this.configYaml;
    }

    /**
     * Valid values: `stop`, `run`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Valid values: `stop`, `run`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private PrometheusMonitoringArgs() {}

    private PrometheusMonitoringArgs(PrometheusMonitoringArgs $) {
        this.clusterId = $.clusterId;
        this.configYaml = $.configYaml;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrometheusMonitoringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrometheusMonitoringArgs $;

        public Builder() {
            $ = new PrometheusMonitoringArgs();
        }

        public Builder(PrometheusMonitoringArgs defaults) {
            $ = new PrometheusMonitoringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The ID of the prometheus instance.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The ID of the prometheus instance.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param configYaml Yaml configuration for monitoring.
         * 
         * @return builder
         * 
         */
        public Builder configYaml(Output<String> configYaml) {
            $.configYaml = configYaml;
            return this;
        }

        /**
         * @param configYaml Yaml configuration for monitoring.
         * 
         * @return builder
         * 
         */
        public Builder configYaml(String configYaml) {
            return configYaml(Output.of(configYaml));
        }

        /**
         * @param status Valid values: `stop`, `run`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Valid values: `stop`, `run`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PrometheusMonitoringArgs build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("PrometheusMonitoringArgs", "clusterId");
            }
            if ($.configYaml == null) {
                throw new MissingRequiredPropertyException("PrometheusMonitoringArgs", "configYaml");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("PrometheusMonitoringArgs", "type");
            }
            return $;
        }
    }

}
