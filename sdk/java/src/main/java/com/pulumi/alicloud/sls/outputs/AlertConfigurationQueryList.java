// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sls.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertConfigurationQueryList {
    private @Nullable String chartTitle;
    private @Nullable String dashboardId;
    private @Nullable String end;
    private @Nullable String powerSqlMode;
    private @Nullable String project;
    private @Nullable String query;
    private @Nullable String region;
    private @Nullable String roleArn;
    private @Nullable String start;
    private @Nullable String store;
    private @Nullable String storeType;
    private @Nullable String timeSpanType;
    private @Nullable String ui;

    private AlertConfigurationQueryList() {}
    public Optional<String> chartTitle() {
        return Optional.ofNullable(this.chartTitle);
    }
    public Optional<String> dashboardId() {
        return Optional.ofNullable(this.dashboardId);
    }
    public Optional<String> end() {
        return Optional.ofNullable(this.end);
    }
    public Optional<String> powerSqlMode() {
        return Optional.ofNullable(this.powerSqlMode);
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public Optional<String> start() {
        return Optional.ofNullable(this.start);
    }
    public Optional<String> store() {
        return Optional.ofNullable(this.store);
    }
    public Optional<String> storeType() {
        return Optional.ofNullable(this.storeType);
    }
    public Optional<String> timeSpanType() {
        return Optional.ofNullable(this.timeSpanType);
    }
    public Optional<String> ui() {
        return Optional.ofNullable(this.ui);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertConfigurationQueryList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String chartTitle;
        private @Nullable String dashboardId;
        private @Nullable String end;
        private @Nullable String powerSqlMode;
        private @Nullable String project;
        private @Nullable String query;
        private @Nullable String region;
        private @Nullable String roleArn;
        private @Nullable String start;
        private @Nullable String store;
        private @Nullable String storeType;
        private @Nullable String timeSpanType;
        private @Nullable String ui;
        public Builder() {}
        public Builder(AlertConfigurationQueryList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chartTitle = defaults.chartTitle;
    	      this.dashboardId = defaults.dashboardId;
    	      this.end = defaults.end;
    	      this.powerSqlMode = defaults.powerSqlMode;
    	      this.project = defaults.project;
    	      this.query = defaults.query;
    	      this.region = defaults.region;
    	      this.roleArn = defaults.roleArn;
    	      this.start = defaults.start;
    	      this.store = defaults.store;
    	      this.storeType = defaults.storeType;
    	      this.timeSpanType = defaults.timeSpanType;
    	      this.ui = defaults.ui;
        }

        @CustomType.Setter
        public Builder chartTitle(@Nullable String chartTitle) {

            this.chartTitle = chartTitle;
            return this;
        }
        @CustomType.Setter
        public Builder dashboardId(@Nullable String dashboardId) {

            this.dashboardId = dashboardId;
            return this;
        }
        @CustomType.Setter
        public Builder end(@Nullable String end) {

            this.end = end;
            return this;
        }
        @CustomType.Setter
        public Builder powerSqlMode(@Nullable String powerSqlMode) {

            this.powerSqlMode = powerSqlMode;
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder query(@Nullable String query) {

            this.query = query;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(@Nullable String roleArn) {

            this.roleArn = roleArn;
            return this;
        }
        @CustomType.Setter
        public Builder start(@Nullable String start) {

            this.start = start;
            return this;
        }
        @CustomType.Setter
        public Builder store(@Nullable String store) {

            this.store = store;
            return this;
        }
        @CustomType.Setter
        public Builder storeType(@Nullable String storeType) {

            this.storeType = storeType;
            return this;
        }
        @CustomType.Setter
        public Builder timeSpanType(@Nullable String timeSpanType) {

            this.timeSpanType = timeSpanType;
            return this;
        }
        @CustomType.Setter
        public Builder ui(@Nullable String ui) {

            this.ui = ui;
            return this;
        }
        public AlertConfigurationQueryList build() {
            final var _resultValue = new AlertConfigurationQueryList();
            _resultValue.chartTitle = chartTitle;
            _resultValue.dashboardId = dashboardId;
            _resultValue.end = end;
            _resultValue.powerSqlMode = powerSqlMode;
            _resultValue.project = project;
            _resultValue.query = query;
            _resultValue.region = region;
            _resultValue.roleArn = roleArn;
            _resultValue.start = start;
            _resultValue.store = store;
            _resultValue.storeType = storeType;
            _resultValue.timeSpanType = timeSpanType;
            _resultValue.ui = ui;
            return _resultValue;
        }
    }
}