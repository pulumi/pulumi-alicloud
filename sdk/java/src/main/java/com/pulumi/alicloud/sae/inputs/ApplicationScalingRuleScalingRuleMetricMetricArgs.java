// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationScalingRuleScalingRuleMetricMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationScalingRuleScalingRuleMetricMetricArgs Empty = new ApplicationScalingRuleScalingRuleMetricMetricArgs();

    /**
     * According to different `metric_type`, set the target value of the corresponding monitoring index.
     * 
     */
    @Import(name="metricTargetAverageUtilization")
    private @Nullable Output<Integer> metricTargetAverageUtilization;

    /**
     * @return According to different `metric_type`, set the target value of the corresponding monitoring index.
     * 
     */
    public Optional<Output<Integer>> metricTargetAverageUtilization() {
        return Optional.ofNullable(this.metricTargetAverageUtilization);
    }

    /**
     * Monitoring indicator trigger condition. Valid values: `CPU`, `MEMORY`, `tcpActiveConn`, `QPS`, `RT`, `SLB_QPS`, `SLB_RT`, `INTRANET_SLB_QPS` and `INTRANET_SLB_RT`. The values are described as follows:
     * - CPU: CPU usage.
     * - MEMORY: MEMORY usage.
     * - tcpActiveConn: The average number of TCP active connections for a single instance in 30 seconds.
     * - QPS: The average QPS of a single instance within 1 minute of JAVA application.
     * - RT: The average response time of all service interfaces within 1 minute of JAVA application.
     * - SLB_QPS: The average public network SLB QPS of a single instance within 15 seconds.
     * - SLB_RT: The average response time of public network SLB within 15 seconds.
     * - INTRANET_SLB_QPS: The average private network SLB QPS of a single instance within 15 seconds.
     * - INTRANET_SLB_RT: The average response time of private network SLB within 15 seconds.
     *   **NOTE:** From version 1.206.0, `metric_type` can be set to `QPS`, `RT`, `INTRANET_SLB_QPS`, `INTRANET_SLB_RT`.
     * 
     */
    @Import(name="metricType")
    private @Nullable Output<String> metricType;

    /**
     * @return Monitoring indicator trigger condition. Valid values: `CPU`, `MEMORY`, `tcpActiveConn`, `QPS`, `RT`, `SLB_QPS`, `SLB_RT`, `INTRANET_SLB_QPS` and `INTRANET_SLB_RT`. The values are described as follows:
     * - CPU: CPU usage.
     * - MEMORY: MEMORY usage.
     * - tcpActiveConn: The average number of TCP active connections for a single instance in 30 seconds.
     * - QPS: The average QPS of a single instance within 1 minute of JAVA application.
     * - RT: The average response time of all service interfaces within 1 minute of JAVA application.
     * - SLB_QPS: The average public network SLB QPS of a single instance within 15 seconds.
     * - SLB_RT: The average response time of public network SLB within 15 seconds.
     * - INTRANET_SLB_QPS: The average private network SLB QPS of a single instance within 15 seconds.
     * - INTRANET_SLB_RT: The average response time of private network SLB within 15 seconds.
     *   **NOTE:** From version 1.206.0, `metric_type` can be set to `QPS`, `RT`, `INTRANET_SLB_QPS`, `INTRANET_SLB_RT`.
     * 
     */
    public Optional<Output<String>> metricType() {
        return Optional.ofNullable(this.metricType);
    }

    /**
     * SLB ID.
     * 
     */
    @Import(name="slbId")
    private @Nullable Output<String> slbId;

    /**
     * @return SLB ID.
     * 
     */
    public Optional<Output<String>> slbId() {
        return Optional.ofNullable(this.slbId);
    }

    /**
     * The log store of the Log Service.
     * 
     */
    @Import(name="slbLogStore")
    private @Nullable Output<String> slbLogStore;

    /**
     * @return The log store of the Log Service.
     * 
     */
    public Optional<Output<String>> slbLogStore() {
        return Optional.ofNullable(this.slbLogStore);
    }

    /**
     * The project of the Log Service.
     * 
     */
    @Import(name="slbProject")
    private @Nullable Output<String> slbProject;

    /**
     * @return The project of the Log Service.
     * 
     */
    public Optional<Output<String>> slbProject() {
        return Optional.ofNullable(this.slbProject);
    }

    /**
     * SLB listening port.
     * 
     */
    @Import(name="vport")
    private @Nullable Output<String> vport;

    /**
     * @return SLB listening port.
     * 
     */
    public Optional<Output<String>> vport() {
        return Optional.ofNullable(this.vport);
    }

    private ApplicationScalingRuleScalingRuleMetricMetricArgs() {}

    private ApplicationScalingRuleScalingRuleMetricMetricArgs(ApplicationScalingRuleScalingRuleMetricMetricArgs $) {
        this.metricTargetAverageUtilization = $.metricTargetAverageUtilization;
        this.metricType = $.metricType;
        this.slbId = $.slbId;
        this.slbLogStore = $.slbLogStore;
        this.slbProject = $.slbProject;
        this.vport = $.vport;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationScalingRuleScalingRuleMetricMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationScalingRuleScalingRuleMetricMetricArgs $;

        public Builder() {
            $ = new ApplicationScalingRuleScalingRuleMetricMetricArgs();
        }

        public Builder(ApplicationScalingRuleScalingRuleMetricMetricArgs defaults) {
            $ = new ApplicationScalingRuleScalingRuleMetricMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricTargetAverageUtilization According to different `metric_type`, set the target value of the corresponding monitoring index.
         * 
         * @return builder
         * 
         */
        public Builder metricTargetAverageUtilization(@Nullable Output<Integer> metricTargetAverageUtilization) {
            $.metricTargetAverageUtilization = metricTargetAverageUtilization;
            return this;
        }

        /**
         * @param metricTargetAverageUtilization According to different `metric_type`, set the target value of the corresponding monitoring index.
         * 
         * @return builder
         * 
         */
        public Builder metricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
            return metricTargetAverageUtilization(Output.of(metricTargetAverageUtilization));
        }

        /**
         * @param metricType Monitoring indicator trigger condition. Valid values: `CPU`, `MEMORY`, `tcpActiveConn`, `QPS`, `RT`, `SLB_QPS`, `SLB_RT`, `INTRANET_SLB_QPS` and `INTRANET_SLB_RT`. The values are described as follows:
         * - CPU: CPU usage.
         * - MEMORY: MEMORY usage.
         * - tcpActiveConn: The average number of TCP active connections for a single instance in 30 seconds.
         * - QPS: The average QPS of a single instance within 1 minute of JAVA application.
         * - RT: The average response time of all service interfaces within 1 minute of JAVA application.
         * - SLB_QPS: The average public network SLB QPS of a single instance within 15 seconds.
         * - SLB_RT: The average response time of public network SLB within 15 seconds.
         * - INTRANET_SLB_QPS: The average private network SLB QPS of a single instance within 15 seconds.
         * - INTRANET_SLB_RT: The average response time of private network SLB within 15 seconds.
         *   **NOTE:** From version 1.206.0, `metric_type` can be set to `QPS`, `RT`, `INTRANET_SLB_QPS`, `INTRANET_SLB_RT`.
         * 
         * @return builder
         * 
         */
        public Builder metricType(@Nullable Output<String> metricType) {
            $.metricType = metricType;
            return this;
        }

        /**
         * @param metricType Monitoring indicator trigger condition. Valid values: `CPU`, `MEMORY`, `tcpActiveConn`, `QPS`, `RT`, `SLB_QPS`, `SLB_RT`, `INTRANET_SLB_QPS` and `INTRANET_SLB_RT`. The values are described as follows:
         * - CPU: CPU usage.
         * - MEMORY: MEMORY usage.
         * - tcpActiveConn: The average number of TCP active connections for a single instance in 30 seconds.
         * - QPS: The average QPS of a single instance within 1 minute of JAVA application.
         * - RT: The average response time of all service interfaces within 1 minute of JAVA application.
         * - SLB_QPS: The average public network SLB QPS of a single instance within 15 seconds.
         * - SLB_RT: The average response time of public network SLB within 15 seconds.
         * - INTRANET_SLB_QPS: The average private network SLB QPS of a single instance within 15 seconds.
         * - INTRANET_SLB_RT: The average response time of private network SLB within 15 seconds.
         *   **NOTE:** From version 1.206.0, `metric_type` can be set to `QPS`, `RT`, `INTRANET_SLB_QPS`, `INTRANET_SLB_RT`.
         * 
         * @return builder
         * 
         */
        public Builder metricType(String metricType) {
            return metricType(Output.of(metricType));
        }

        /**
         * @param slbId SLB ID.
         * 
         * @return builder
         * 
         */
        public Builder slbId(@Nullable Output<String> slbId) {
            $.slbId = slbId;
            return this;
        }

        /**
         * @param slbId SLB ID.
         * 
         * @return builder
         * 
         */
        public Builder slbId(String slbId) {
            return slbId(Output.of(slbId));
        }

        /**
         * @param slbLogStore The log store of the Log Service.
         * 
         * @return builder
         * 
         */
        public Builder slbLogStore(@Nullable Output<String> slbLogStore) {
            $.slbLogStore = slbLogStore;
            return this;
        }

        /**
         * @param slbLogStore The log store of the Log Service.
         * 
         * @return builder
         * 
         */
        public Builder slbLogStore(String slbLogStore) {
            return slbLogStore(Output.of(slbLogStore));
        }

        /**
         * @param slbProject The project of the Log Service.
         * 
         * @return builder
         * 
         */
        public Builder slbProject(@Nullable Output<String> slbProject) {
            $.slbProject = slbProject;
            return this;
        }

        /**
         * @param slbProject The project of the Log Service.
         * 
         * @return builder
         * 
         */
        public Builder slbProject(String slbProject) {
            return slbProject(Output.of(slbProject));
        }

        /**
         * @param vport SLB listening port.
         * 
         * @return builder
         * 
         */
        public Builder vport(@Nullable Output<String> vport) {
            $.vport = vport;
            return this;
        }

        /**
         * @param vport SLB listening port.
         * 
         * @return builder
         * 
         */
        public Builder vport(String vport) {
            return vport(Output.of(vport));
        }

        public ApplicationScalingRuleScalingRuleMetricMetricArgs build() {
            return $;
        }
    }

}
