// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiJobJobSettingsRuntimeSetting {
    /**
     * @return Set name, optional ENUM value:
     * 
     * runtime.offline.speed.limit.mb (valid when runtime.offline.speed.limit.enable = true)
     * 
     * runtime.offline.speed.limit.enable
     * 
     * dst.offline.connection.max (the maximum number of write connections for offline batch tasks)
     * 
     * runtime.offline.concurrent (offline batch synchronization task concurrency)
     * 
     * dst.realtime.connection.max (maximum number of write connections for real-time tasks)
     * 
     * runtime.enable.auto.create.schema (whether to automatically create a schema on the target side)
     * 
     * src.offline.datasource.max.connection (maximum number of source connections for offline batch tasks)
     * 
     * runtime.realtime.concurrent (real-time task concurrency)
     * 
     */
    private @Nullable String name;
    /**
     * @return Runtime setting value
     * 
     */
    private @Nullable String value;

    private DiJobJobSettingsRuntimeSetting() {}
    /**
     * @return Set name, optional ENUM value:
     * 
     * runtime.offline.speed.limit.mb (valid when runtime.offline.speed.limit.enable = true)
     * 
     * runtime.offline.speed.limit.enable
     * 
     * dst.offline.connection.max (the maximum number of write connections for offline batch tasks)
     * 
     * runtime.offline.concurrent (offline batch synchronization task concurrency)
     * 
     * dst.realtime.connection.max (maximum number of write connections for real-time tasks)
     * 
     * runtime.enable.auto.create.schema (whether to automatically create a schema on the target side)
     * 
     * src.offline.datasource.max.connection (maximum number of source connections for offline batch tasks)
     * 
     * runtime.realtime.concurrent (real-time task concurrency)
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Runtime setting value
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiJobJobSettingsRuntimeSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;
        public Builder() {}
        public Builder(DiJobJobSettingsRuntimeSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public DiJobJobSettingsRuntimeSetting build() {
            final var _resultValue = new DiJobJobSettingsRuntimeSetting();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
