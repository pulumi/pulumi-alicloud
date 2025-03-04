// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServerGroupsGroupHealthCheckConfig {
    /**
     * @return The status code for a successful health check. Multiple status codes can be specified as a list.
     * 
     */
    private List<String> healthCheckCodes;
    /**
     * @return The port of the backend server that is used for health checks.
     * 
     */
    private Integer healthCheckConnectPort;
    /**
     * @return Indicates whether health checks are enabled.
     * 
     */
    private Boolean healthCheckEnabled;
    /**
     * @return The domain name that is used for health checks.
     * 
     */
    private String healthCheckHost;
    /**
     * @return HTTP protocol version.
     * 
     */
    private String healthCheckHttpVersion;
    /**
     * @return The time interval between two consecutive health checks.
     * 
     */
    private Integer healthCheckInterval;
    /**
     * @return Health check method.
     * 
     */
    private String healthCheckMethod;
    /**
     * @return The forwarding rule path of health checks.
     * 
     */
    private String healthCheckPath;
    /**
     * @return Health check protocol.
     * 
     */
    private String healthCheckProtocol;
    /**
     * @return The timeout period of a health check response. If a backend Elastic Compute Service (ECS) instance does not send an expected response within the specified period of time, the ECS instance is considered unhealthy.
     * 
     */
    private Integer healthCheckTimeout;
    /**
     * @return The number of health checks that an unhealthy backend server must pass consecutively before it is declared healthy. In this case, the health check state is changed from fail to success.
     * 
     */
    private Integer healthyThreshold;
    /**
     * @return The number of consecutive health checks that a healthy backend server must consecutively fail before it is declared unhealthy. In this case, the health check state is changed from success to fail.
     * 
     */
    private Integer unhealthyThreshold;

    private GetServerGroupsGroupHealthCheckConfig() {}
    /**
     * @return The status code for a successful health check. Multiple status codes can be specified as a list.
     * 
     */
    public List<String> healthCheckCodes() {
        return this.healthCheckCodes;
    }
    /**
     * @return The port of the backend server that is used for health checks.
     * 
     */
    public Integer healthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }
    /**
     * @return Indicates whether health checks are enabled.
     * 
     */
    public Boolean healthCheckEnabled() {
        return this.healthCheckEnabled;
    }
    /**
     * @return The domain name that is used for health checks.
     * 
     */
    public String healthCheckHost() {
        return this.healthCheckHost;
    }
    /**
     * @return HTTP protocol version.
     * 
     */
    public String healthCheckHttpVersion() {
        return this.healthCheckHttpVersion;
    }
    /**
     * @return The time interval between two consecutive health checks.
     * 
     */
    public Integer healthCheckInterval() {
        return this.healthCheckInterval;
    }
    /**
     * @return Health check method.
     * 
     */
    public String healthCheckMethod() {
        return this.healthCheckMethod;
    }
    /**
     * @return The forwarding rule path of health checks.
     * 
     */
    public String healthCheckPath() {
        return this.healthCheckPath;
    }
    /**
     * @return Health check protocol.
     * 
     */
    public String healthCheckProtocol() {
        return this.healthCheckProtocol;
    }
    /**
     * @return The timeout period of a health check response. If a backend Elastic Compute Service (ECS) instance does not send an expected response within the specified period of time, the ECS instance is considered unhealthy.
     * 
     */
    public Integer healthCheckTimeout() {
        return this.healthCheckTimeout;
    }
    /**
     * @return The number of health checks that an unhealthy backend server must pass consecutively before it is declared healthy. In this case, the health check state is changed from fail to success.
     * 
     */
    public Integer healthyThreshold() {
        return this.healthyThreshold;
    }
    /**
     * @return The number of consecutive health checks that a healthy backend server must consecutively fail before it is declared unhealthy. In this case, the health check state is changed from success to fail.
     * 
     */
    public Integer unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerGroupsGroupHealthCheckConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> healthCheckCodes;
        private Integer healthCheckConnectPort;
        private Boolean healthCheckEnabled;
        private String healthCheckHost;
        private String healthCheckHttpVersion;
        private Integer healthCheckInterval;
        private String healthCheckMethod;
        private String healthCheckPath;
        private String healthCheckProtocol;
        private Integer healthCheckTimeout;
        private Integer healthyThreshold;
        private Integer unhealthyThreshold;
        public Builder() {}
        public Builder(GetServerGroupsGroupHealthCheckConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheckCodes = defaults.healthCheckCodes;
    	      this.healthCheckConnectPort = defaults.healthCheckConnectPort;
    	      this.healthCheckEnabled = defaults.healthCheckEnabled;
    	      this.healthCheckHost = defaults.healthCheckHost;
    	      this.healthCheckHttpVersion = defaults.healthCheckHttpVersion;
    	      this.healthCheckInterval = defaults.healthCheckInterval;
    	      this.healthCheckMethod = defaults.healthCheckMethod;
    	      this.healthCheckPath = defaults.healthCheckPath;
    	      this.healthCheckProtocol = defaults.healthCheckProtocol;
    	      this.healthCheckTimeout = defaults.healthCheckTimeout;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        @CustomType.Setter
        public Builder healthCheckCodes(List<String> healthCheckCodes) {
            if (healthCheckCodes == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsGroupHealthCheckConfig", "healthCheckCodes");
            }
            this.healthCheckCodes = healthCheckCodes;
            return this;
        }
        public Builder healthCheckCodes(String... healthCheckCodes) {
            return healthCheckCodes(List.of(healthCheckCodes));
        }
        @CustomType.Setter
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            if (healthCheckConnectPort == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsGroupHealthCheckConfig", "healthCheckConnectPort");
            }
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
            if (healthCheckEnabled == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsGroupHealthCheckConfig", "healthCheckEnabled");
            }
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckHost(String healthCheckHost) {
            if (healthCheckHost == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsGroupHealthCheckConfig", "healthCheckHost");
            }
            this.healthCheckHost = healthCheckHost;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
            if (healthCheckHttpVersion == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsGroupHealthCheckConfig", "healthCheckHttpVersion");
            }
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            if (healthCheckInterval == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsGroupHealthCheckConfig", "healthCheckInterval");
            }
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckMethod(String healthCheckMethod) {
            if (healthCheckMethod == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsGroupHealthCheckConfig", "healthCheckMethod");
            }
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckPath(String healthCheckPath) {
            if (healthCheckPath == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsGroupHealthCheckConfig", "healthCheckPath");
            }
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckProtocol(String healthCheckProtocol) {
            if (healthCheckProtocol == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsGroupHealthCheckConfig", "healthCheckProtocol");
            }
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            if (healthCheckTimeout == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsGroupHealthCheckConfig", "healthCheckTimeout");
            }
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder healthyThreshold(Integer healthyThreshold) {
            if (healthyThreshold == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsGroupHealthCheckConfig", "healthyThreshold");
            }
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            if (unhealthyThreshold == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsGroupHealthCheckConfig", "unhealthyThreshold");
            }
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public GetServerGroupsGroupHealthCheckConfig build() {
            final var _resultValue = new GetServerGroupsGroupHealthCheckConfig();
            _resultValue.healthCheckCodes = healthCheckCodes;
            _resultValue.healthCheckConnectPort = healthCheckConnectPort;
            _resultValue.healthCheckEnabled = healthCheckEnabled;
            _resultValue.healthCheckHost = healthCheckHost;
            _resultValue.healthCheckHttpVersion = healthCheckHttpVersion;
            _resultValue.healthCheckInterval = healthCheckInterval;
            _resultValue.healthCheckMethod = healthCheckMethod;
            _resultValue.healthCheckPath = healthCheckPath;
            _resultValue.healthCheckProtocol = healthCheckProtocol;
            _resultValue.healthCheckTimeout = healthCheckTimeout;
            _resultValue.healthyThreshold = healthyThreshold;
            _resultValue.unhealthyThreshold = unhealthyThreshold;
            return _resultValue;
        }
    }
}
