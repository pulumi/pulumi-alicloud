// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticTaskMonitorConfStream {
    private @Nullable Map<String,Object> customHeaderContent;
    private @Nullable Integer playerType;
    private @Nullable Integer streamAddressType;
    private @Nullable Integer streamMonitorTimeout;
    private @Nullable Integer streamType;
    private @Nullable String targetUrl;
    private @Nullable String whiteList;

    private SyntheticTaskMonitorConfStream() {}
    public Map<String,Object> customHeaderContent() {
        return this.customHeaderContent == null ? Map.of() : this.customHeaderContent;
    }
    public Optional<Integer> playerType() {
        return Optional.ofNullable(this.playerType);
    }
    public Optional<Integer> streamAddressType() {
        return Optional.ofNullable(this.streamAddressType);
    }
    public Optional<Integer> streamMonitorTimeout() {
        return Optional.ofNullable(this.streamMonitorTimeout);
    }
    public Optional<Integer> streamType() {
        return Optional.ofNullable(this.streamType);
    }
    public Optional<String> targetUrl() {
        return Optional.ofNullable(this.targetUrl);
    }
    public Optional<String> whiteList() {
        return Optional.ofNullable(this.whiteList);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticTaskMonitorConfStream defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> customHeaderContent;
        private @Nullable Integer playerType;
        private @Nullable Integer streamAddressType;
        private @Nullable Integer streamMonitorTimeout;
        private @Nullable Integer streamType;
        private @Nullable String targetUrl;
        private @Nullable String whiteList;
        public Builder() {}
        public Builder(SyntheticTaskMonitorConfStream defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHeaderContent = defaults.customHeaderContent;
    	      this.playerType = defaults.playerType;
    	      this.streamAddressType = defaults.streamAddressType;
    	      this.streamMonitorTimeout = defaults.streamMonitorTimeout;
    	      this.streamType = defaults.streamType;
    	      this.targetUrl = defaults.targetUrl;
    	      this.whiteList = defaults.whiteList;
        }

        @CustomType.Setter
        public Builder customHeaderContent(@Nullable Map<String,Object> customHeaderContent) {

            this.customHeaderContent = customHeaderContent;
            return this;
        }
        @CustomType.Setter
        public Builder playerType(@Nullable Integer playerType) {

            this.playerType = playerType;
            return this;
        }
        @CustomType.Setter
        public Builder streamAddressType(@Nullable Integer streamAddressType) {

            this.streamAddressType = streamAddressType;
            return this;
        }
        @CustomType.Setter
        public Builder streamMonitorTimeout(@Nullable Integer streamMonitorTimeout) {

            this.streamMonitorTimeout = streamMonitorTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder streamType(@Nullable Integer streamType) {

            this.streamType = streamType;
            return this;
        }
        @CustomType.Setter
        public Builder targetUrl(@Nullable String targetUrl) {

            this.targetUrl = targetUrl;
            return this;
        }
        @CustomType.Setter
        public Builder whiteList(@Nullable String whiteList) {

            this.whiteList = whiteList;
            return this;
        }
        public SyntheticTaskMonitorConfStream build() {
            final var _resultValue = new SyntheticTaskMonitorConfStream();
            _resultValue.customHeaderContent = customHeaderContent;
            _resultValue.playerType = playerType;
            _resultValue.streamAddressType = streamAddressType;
            _resultValue.streamMonitorTimeout = streamMonitorTimeout;
            _resultValue.streamType = streamType;
            _resultValue.targetUrl = targetUrl;
            _resultValue.whiteList = whiteList;
            return _resultValue;
        }
    }
}
