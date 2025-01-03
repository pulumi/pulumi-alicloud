// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.schedulerx.inputs;

import com.pulumi.alicloud.schedulerx.inputs.JobJobMonitorInfoContactInfoArgs;
import com.pulumi.alicloud.schedulerx.inputs.JobJobMonitorInfoMonitorConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobJobMonitorInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobJobMonitorInfoArgs Empty = new JobJobMonitorInfoArgs();

    /**
     * Contact information. See `contact_info` below.
     * 
     */
    @Import(name="contactInfos")
    private @Nullable Output<List<JobJobMonitorInfoContactInfoArgs>> contactInfos;

    /**
     * @return Contact information. See `contact_info` below.
     * 
     */
    public Optional<Output<List<JobJobMonitorInfoContactInfoArgs>>> contactInfos() {
        return Optional.ofNullable(this.contactInfos);
    }

    /**
     * Alarm switch and threshold configuration. See `monitor_config` below.
     * 
     */
    @Import(name="monitorConfig")
    private @Nullable Output<JobJobMonitorInfoMonitorConfigArgs> monitorConfig;

    /**
     * @return Alarm switch and threshold configuration. See `monitor_config` below.
     * 
     */
    public Optional<Output<JobJobMonitorInfoMonitorConfigArgs>> monitorConfig() {
        return Optional.ofNullable(this.monitorConfig);
    }

    private JobJobMonitorInfoArgs() {}

    private JobJobMonitorInfoArgs(JobJobMonitorInfoArgs $) {
        this.contactInfos = $.contactInfos;
        this.monitorConfig = $.monitorConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobJobMonitorInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobJobMonitorInfoArgs $;

        public Builder() {
            $ = new JobJobMonitorInfoArgs();
        }

        public Builder(JobJobMonitorInfoArgs defaults) {
            $ = new JobJobMonitorInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contactInfos Contact information. See `contact_info` below.
         * 
         * @return builder
         * 
         */
        public Builder contactInfos(@Nullable Output<List<JobJobMonitorInfoContactInfoArgs>> contactInfos) {
            $.contactInfos = contactInfos;
            return this;
        }

        /**
         * @param contactInfos Contact information. See `contact_info` below.
         * 
         * @return builder
         * 
         */
        public Builder contactInfos(List<JobJobMonitorInfoContactInfoArgs> contactInfos) {
            return contactInfos(Output.of(contactInfos));
        }

        /**
         * @param contactInfos Contact information. See `contact_info` below.
         * 
         * @return builder
         * 
         */
        public Builder contactInfos(JobJobMonitorInfoContactInfoArgs... contactInfos) {
            return contactInfos(List.of(contactInfos));
        }

        /**
         * @param monitorConfig Alarm switch and threshold configuration. See `monitor_config` below.
         * 
         * @return builder
         * 
         */
        public Builder monitorConfig(@Nullable Output<JobJobMonitorInfoMonitorConfigArgs> monitorConfig) {
            $.monitorConfig = monitorConfig;
            return this;
        }

        /**
         * @param monitorConfig Alarm switch and threshold configuration. See `monitor_config` below.
         * 
         * @return builder
         * 
         */
        public Builder monitorConfig(JobJobMonitorInfoMonitorConfigArgs monitorConfig) {
            return monitorConfig(Output.of(monitorConfig));
        }

        public JobJobMonitorInfoArgs build() {
            return $;
        }
    }

}
