// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.schedulerx.outputs;

import com.pulumi.alicloud.schedulerx.outputs.JobJobMonitorInfoContactInfo;
import com.pulumi.alicloud.schedulerx.outputs.JobJobMonitorInfoMonitorConfig;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobJobMonitorInfo {
    /**
     * @return Contact information. See `contact_info` below.
     * 
     */
    private @Nullable List<JobJobMonitorInfoContactInfo> contactInfos;
    /**
     * @return Alarm switch and threshold configuration. See `monitor_config` below.
     * 
     */
    private @Nullable JobJobMonitorInfoMonitorConfig monitorConfig;

    private JobJobMonitorInfo() {}
    /**
     * @return Contact information. See `contact_info` below.
     * 
     */
    public List<JobJobMonitorInfoContactInfo> contactInfos() {
        return this.contactInfos == null ? List.of() : this.contactInfos;
    }
    /**
     * @return Alarm switch and threshold configuration. See `monitor_config` below.
     * 
     */
    public Optional<JobJobMonitorInfoMonitorConfig> monitorConfig() {
        return Optional.ofNullable(this.monitorConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobJobMonitorInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<JobJobMonitorInfoContactInfo> contactInfos;
        private @Nullable JobJobMonitorInfoMonitorConfig monitorConfig;
        public Builder() {}
        public Builder(JobJobMonitorInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactInfos = defaults.contactInfos;
    	      this.monitorConfig = defaults.monitorConfig;
        }

        @CustomType.Setter
        public Builder contactInfos(@Nullable List<JobJobMonitorInfoContactInfo> contactInfos) {

            this.contactInfos = contactInfos;
            return this;
        }
        public Builder contactInfos(JobJobMonitorInfoContactInfo... contactInfos) {
            return contactInfos(List.of(contactInfos));
        }
        @CustomType.Setter
        public Builder monitorConfig(@Nullable JobJobMonitorInfoMonitorConfig monitorConfig) {

            this.monitorConfig = monitorConfig;
            return this;
        }
        public JobJobMonitorInfo build() {
            final var _resultValue = new JobJobMonitorInfo();
            _resultValue.contactInfos = contactInfos;
            _resultValue.monitorConfig = monitorConfig;
            return _resultValue;
        }
    }
}