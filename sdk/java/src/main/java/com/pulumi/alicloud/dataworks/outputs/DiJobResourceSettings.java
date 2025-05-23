// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks.outputs;

import com.pulumi.alicloud.dataworks.outputs.DiJobResourceSettingsOfflineResourceSettings;
import com.pulumi.alicloud.dataworks.outputs.DiJobResourceSettingsRealtimeResourceSettings;
import com.pulumi.alicloud.dataworks.outputs.DiJobResourceSettingsScheduleResourceSettings;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiJobResourceSettings {
    /**
     * @return Offline Resource Group configuration See `offline_resource_settings` below.
     * 
     */
    private @Nullable DiJobResourceSettingsOfflineResourceSettings offlineResourceSettings;
    /**
     * @return Real-time Resource Group See `realtime_resource_settings` below.
     * 
     */
    private @Nullable DiJobResourceSettingsRealtimeResourceSettings realtimeResourceSettings;
    /**
     * @return Scheduling Resource Groups See `schedule_resource_settings` below.
     * 
     */
    private @Nullable DiJobResourceSettingsScheduleResourceSettings scheduleResourceSettings;

    private DiJobResourceSettings() {}
    /**
     * @return Offline Resource Group configuration See `offline_resource_settings` below.
     * 
     */
    public Optional<DiJobResourceSettingsOfflineResourceSettings> offlineResourceSettings() {
        return Optional.ofNullable(this.offlineResourceSettings);
    }
    /**
     * @return Real-time Resource Group See `realtime_resource_settings` below.
     * 
     */
    public Optional<DiJobResourceSettingsRealtimeResourceSettings> realtimeResourceSettings() {
        return Optional.ofNullable(this.realtimeResourceSettings);
    }
    /**
     * @return Scheduling Resource Groups See `schedule_resource_settings` below.
     * 
     */
    public Optional<DiJobResourceSettingsScheduleResourceSettings> scheduleResourceSettings() {
        return Optional.ofNullable(this.scheduleResourceSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiJobResourceSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DiJobResourceSettingsOfflineResourceSettings offlineResourceSettings;
        private @Nullable DiJobResourceSettingsRealtimeResourceSettings realtimeResourceSettings;
        private @Nullable DiJobResourceSettingsScheduleResourceSettings scheduleResourceSettings;
        public Builder() {}
        public Builder(DiJobResourceSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offlineResourceSettings = defaults.offlineResourceSettings;
    	      this.realtimeResourceSettings = defaults.realtimeResourceSettings;
    	      this.scheduleResourceSettings = defaults.scheduleResourceSettings;
        }

        @CustomType.Setter
        public Builder offlineResourceSettings(@Nullable DiJobResourceSettingsOfflineResourceSettings offlineResourceSettings) {

            this.offlineResourceSettings = offlineResourceSettings;
            return this;
        }
        @CustomType.Setter
        public Builder realtimeResourceSettings(@Nullable DiJobResourceSettingsRealtimeResourceSettings realtimeResourceSettings) {

            this.realtimeResourceSettings = realtimeResourceSettings;
            return this;
        }
        @CustomType.Setter
        public Builder scheduleResourceSettings(@Nullable DiJobResourceSettingsScheduleResourceSettings scheduleResourceSettings) {

            this.scheduleResourceSettings = scheduleResourceSettings;
            return this;
        }
        public DiJobResourceSettings build() {
            final var _resultValue = new DiJobResourceSettings();
            _resultValue.offlineResourceSettings = offlineResourceSettings;
            _resultValue.realtimeResourceSettings = realtimeResourceSettings;
            _resultValue.scheduleResourceSettings = scheduleResourceSettings;
            return _resultValue;
        }
    }
}
