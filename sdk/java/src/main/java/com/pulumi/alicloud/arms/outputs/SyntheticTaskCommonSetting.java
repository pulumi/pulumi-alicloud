// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.outputs;

import com.pulumi.alicloud.arms.outputs.SyntheticTaskCommonSettingCustomHost;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticTaskCommonSetting {
    /**
     * @return Custom host. See `custom_host` below.
     * 
     */
    private @Nullable SyntheticTaskCommonSettingCustomHost customHost;
    /**
     * @return IpType.
     * 
     */
    private @Nullable Integer ipType;
    /**
     * @return Whether to enable link tracking.
     * 
     */
    private @Nullable Boolean isOpenTrace;
    /**
     * @return Whether the monitoring samples are evenly distributed:
     * - 0: No
     *   1: Yes.
     * 
     */
    private @Nullable Integer monitorSamples;
    /**
     * @return Link trace client type:
     * - 0:ARMS Agent
     * - 1:OpenTelemetry
     * - 2:Jaeger.
     * 
     */
    private @Nullable Integer traceClientType;
    /**
     * @return The link data is reported to the region.
     * 
     */
    private @Nullable String xtraceRegion;

    private SyntheticTaskCommonSetting() {}
    /**
     * @return Custom host. See `custom_host` below.
     * 
     */
    public Optional<SyntheticTaskCommonSettingCustomHost> customHost() {
        return Optional.ofNullable(this.customHost);
    }
    /**
     * @return IpType.
     * 
     */
    public Optional<Integer> ipType() {
        return Optional.ofNullable(this.ipType);
    }
    /**
     * @return Whether to enable link tracking.
     * 
     */
    public Optional<Boolean> isOpenTrace() {
        return Optional.ofNullable(this.isOpenTrace);
    }
    /**
     * @return Whether the monitoring samples are evenly distributed:
     * - 0: No
     *   1: Yes.
     * 
     */
    public Optional<Integer> monitorSamples() {
        return Optional.ofNullable(this.monitorSamples);
    }
    /**
     * @return Link trace client type:
     * - 0:ARMS Agent
     * - 1:OpenTelemetry
     * - 2:Jaeger.
     * 
     */
    public Optional<Integer> traceClientType() {
        return Optional.ofNullable(this.traceClientType);
    }
    /**
     * @return The link data is reported to the region.
     * 
     */
    public Optional<String> xtraceRegion() {
        return Optional.ofNullable(this.xtraceRegion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticTaskCommonSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SyntheticTaskCommonSettingCustomHost customHost;
        private @Nullable Integer ipType;
        private @Nullable Boolean isOpenTrace;
        private @Nullable Integer monitorSamples;
        private @Nullable Integer traceClientType;
        private @Nullable String xtraceRegion;
        public Builder() {}
        public Builder(SyntheticTaskCommonSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHost = defaults.customHost;
    	      this.ipType = defaults.ipType;
    	      this.isOpenTrace = defaults.isOpenTrace;
    	      this.monitorSamples = defaults.monitorSamples;
    	      this.traceClientType = defaults.traceClientType;
    	      this.xtraceRegion = defaults.xtraceRegion;
        }

        @CustomType.Setter
        public Builder customHost(@Nullable SyntheticTaskCommonSettingCustomHost customHost) {

            this.customHost = customHost;
            return this;
        }
        @CustomType.Setter
        public Builder ipType(@Nullable Integer ipType) {

            this.ipType = ipType;
            return this;
        }
        @CustomType.Setter
        public Builder isOpenTrace(@Nullable Boolean isOpenTrace) {

            this.isOpenTrace = isOpenTrace;
            return this;
        }
        @CustomType.Setter
        public Builder monitorSamples(@Nullable Integer monitorSamples) {

            this.monitorSamples = monitorSamples;
            return this;
        }
        @CustomType.Setter
        public Builder traceClientType(@Nullable Integer traceClientType) {

            this.traceClientType = traceClientType;
            return this;
        }
        @CustomType.Setter
        public Builder xtraceRegion(@Nullable String xtraceRegion) {

            this.xtraceRegion = xtraceRegion;
            return this;
        }
        public SyntheticTaskCommonSetting build() {
            final var _resultValue = new SyntheticTaskCommonSetting();
            _resultValue.customHost = customHost;
            _resultValue.ipType = ipType;
            _resultValue.isOpenTrace = isOpenTrace;
            _resultValue.monitorSamples = monitorSamples;
            _resultValue.traceClientType = traceClientType;
            _resultValue.xtraceRegion = xtraceRegion;
            return _resultValue;
        }
    }
}
