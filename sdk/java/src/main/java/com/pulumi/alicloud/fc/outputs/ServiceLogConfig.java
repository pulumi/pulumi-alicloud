// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceLogConfig {
    /**
     * @return The log store name of Alicloud Simple Log Service.
     * 
     */
    private final String logstore;
    /**
     * @return The project name of the Alicloud Simple Log Service.
     * 
     */
    private final String project;

    @CustomType.Constructor
    private ServiceLogConfig(
        @CustomType.Parameter("logstore") String logstore,
        @CustomType.Parameter("project") String project) {
        this.logstore = logstore;
        this.project = project;
    }

    /**
     * @return The log store name of Alicloud Simple Log Service.
     * 
     */
    public String logstore() {
        return this.logstore;
    }
    /**
     * @return The project name of the Alicloud Simple Log Service.
     * 
     */
    public String project() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logstore;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logstore = defaults.logstore;
    	      this.project = defaults.project;
        }

        public Builder logstore(String logstore) {
            this.logstore = Objects.requireNonNull(logstore);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }        public ServiceLogConfig build() {
            return new ServiceLogConfig(logstore, project);
        }
    }
}