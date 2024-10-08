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
    /**
     * @return Chart Name.
     * 
     */
    private @Nullable String chartTitle;
    /**
     * @return Dashboard ID.
     * 
     */
    private @Nullable String dashboardId;
    /**
     * @return End time. When storeType is set to log or metric, end must be set.
     * 
     */
    private @Nullable String end;
    /**
     * @return Whether to use exclusive SQL. The value is as follows: auto: automatic switching. enable: Starts. disable: disable.
     * 
     */
    private @Nullable String powerSqlMode;
    /**
     * @return Project Name.
     * 
     */
    private @Nullable String project;
    /**
     * @return Query and analysis statements. When storeType is set to log or metric, query is set to the query analysis statement. When storeType is set to meta, set query to an empty string.
     * 
     */
    private @Nullable String query;
    /**
     * @return Region of the target Project.
     * 
     */
    private @Nullable String region;
    /**
     * @return Roles used to write alarm data to the event Library.
     * 
     */
    private @Nullable String roleArn;
    /**
     * @return Start time. When storeType is set to log or metric, start must be set.
     * 
     */
    private @Nullable String start;
    /**
     * @return Query the Logstore, Metricstore, or resource data associated with the statistics. When storeType is set to log, store is set to the target Logstore. When storeType is set to metric, store is set to the target Metricstore. When storeType is set to meta, store is set to the target resource data name.
     * 
     */
    private @Nullable String store;
    /**
     * @return Query the data source type. The value is as follows: log: Logstore. metric: Time series Library. meta: resource data.
     * 
     */
    private @Nullable String storeType;
    /**
     * @return Time Type.
     * 
     */
    private @Nullable String timeSpanType;
    /**
     * @return Use of specific scene alarm front end.
     * 
     */
    private @Nullable String ui;

    private AlertConfigurationQueryList() {}
    /**
     * @return Chart Name.
     * 
     */
    public Optional<String> chartTitle() {
        return Optional.ofNullable(this.chartTitle);
    }
    /**
     * @return Dashboard ID.
     * 
     */
    public Optional<String> dashboardId() {
        return Optional.ofNullable(this.dashboardId);
    }
    /**
     * @return End time. When storeType is set to log or metric, end must be set.
     * 
     */
    public Optional<String> end() {
        return Optional.ofNullable(this.end);
    }
    /**
     * @return Whether to use exclusive SQL. The value is as follows: auto: automatic switching. enable: Starts. disable: disable.
     * 
     */
    public Optional<String> powerSqlMode() {
        return Optional.ofNullable(this.powerSqlMode);
    }
    /**
     * @return Project Name.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    /**
     * @return Query and analysis statements. When storeType is set to log or metric, query is set to the query analysis statement. When storeType is set to meta, set query to an empty string.
     * 
     */
    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }
    /**
     * @return Region of the target Project.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Roles used to write alarm data to the event Library.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return Start time. When storeType is set to log or metric, start must be set.
     * 
     */
    public Optional<String> start() {
        return Optional.ofNullable(this.start);
    }
    /**
     * @return Query the Logstore, Metricstore, or resource data associated with the statistics. When storeType is set to log, store is set to the target Logstore. When storeType is set to metric, store is set to the target Metricstore. When storeType is set to meta, store is set to the target resource data name.
     * 
     */
    public Optional<String> store() {
        return Optional.ofNullable(this.store);
    }
    /**
     * @return Query the data source type. The value is as follows: log: Logstore. metric: Time series Library. meta: resource data.
     * 
     */
    public Optional<String> storeType() {
        return Optional.ofNullable(this.storeType);
    }
    /**
     * @return Time Type.
     * 
     */
    public Optional<String> timeSpanType() {
        return Optional.ofNullable(this.timeSpanType);
    }
    /**
     * @return Use of specific scene alarm front end.
     * 
     */
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
