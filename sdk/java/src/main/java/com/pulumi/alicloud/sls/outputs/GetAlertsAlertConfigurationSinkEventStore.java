// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sls.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAlertsAlertConfigurationSinkEventStore {
    /**
     * @return Open.
     * 
     */
    private Boolean enabled;
    /**
     * @return SLS service endpoint.
     * 
     */
    private String endpoint;
    /**
     * @return Event Library Name.
     * 
     */
    private String eventStore;
    /**
     * @return Project Name.
     * 
     */
    private String project;
    /**
     * @return Roles used to write alarm data to the event Library.
     * 
     */
    private String roleArn;

    private GetAlertsAlertConfigurationSinkEventStore() {}
    /**
     * @return Open.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return SLS service endpoint.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return Event Library Name.
     * 
     */
    public String eventStore() {
        return this.eventStore;
    }
    /**
     * @return Project Name.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return Roles used to write alarm data to the event Library.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertsAlertConfigurationSinkEventStore defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String endpoint;
        private String eventStore;
        private String project;
        private String roleArn;
        public Builder() {}
        public Builder(GetAlertsAlertConfigurationSinkEventStore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.endpoint = defaults.endpoint;
    	      this.eventStore = defaults.eventStore;
    	      this.project = defaults.project;
    	      this.roleArn = defaults.roleArn;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetAlertsAlertConfigurationSinkEventStore", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            if (endpoint == null) {
              throw new MissingRequiredPropertyException("GetAlertsAlertConfigurationSinkEventStore", "endpoint");
            }
            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder eventStore(String eventStore) {
            if (eventStore == null) {
              throw new MissingRequiredPropertyException("GetAlertsAlertConfigurationSinkEventStore", "eventStore");
            }
            this.eventStore = eventStore;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetAlertsAlertConfigurationSinkEventStore", "project");
            }
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            if (roleArn == null) {
              throw new MissingRequiredPropertyException("GetAlertsAlertConfigurationSinkEventStore", "roleArn");
            }
            this.roleArn = roleArn;
            return this;
        }
        public GetAlertsAlertConfigurationSinkEventStore build() {
            final var _resultValue = new GetAlertsAlertConfigurationSinkEventStore();
            _resultValue.enabled = enabled;
            _resultValue.endpoint = endpoint;
            _resultValue.eventStore = eventStore;
            _resultValue.project = project;
            _resultValue.roleArn = roleArn;
            return _resultValue;
        }
    }
}
