// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceMeshMeshConfigControlPlaneLog {
    /**
     * @return Enable CNI
     * 
     */
    private Boolean enabled;
    /**
     * @return Lifecycle of logs has been collected to Alibaba Cloud SLS
     * 
     */
    private @Nullable Integer logTtlInDay;
    /**
     * @return The name of the SLS Project to which the control plane logs are collected.
     * 
     */
    private @Nullable String project;

    private ServiceMeshMeshConfigControlPlaneLog() {}
    /**
     * @return Enable CNI
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Lifecycle of logs has been collected to Alibaba Cloud SLS
     * 
     */
    public Optional<Integer> logTtlInDay() {
        return Optional.ofNullable(this.logTtlInDay);
    }
    /**
     * @return The name of the SLS Project to which the control plane logs are collected.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMeshMeshConfigControlPlaneLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable Integer logTtlInDay;
        private @Nullable String project;
        public Builder() {}
        public Builder(ServiceMeshMeshConfigControlPlaneLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logTtlInDay = defaults.logTtlInDay;
    	      this.project = defaults.project;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("ServiceMeshMeshConfigControlPlaneLog", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder logTtlInDay(@Nullable Integer logTtlInDay) {

            this.logTtlInDay = logTtlInDay;
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        public ServiceMeshMeshConfigControlPlaneLog build() {
            final var _resultValue = new ServiceMeshMeshConfigControlPlaneLog();
            _resultValue.enabled = enabled;
            _resultValue.logTtlInDay = logTtlInDay;
            _resultValue.project = project;
            return _resultValue;
        }
    }
}
