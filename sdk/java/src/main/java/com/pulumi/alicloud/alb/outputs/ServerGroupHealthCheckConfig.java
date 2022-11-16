// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerGroupHealthCheckConfig {
    /**
     * @return The status code for a successful health check. Multiple status codes can be specified as a
     * list. Valid values: `http_2xx`, `http_3xx`, `http_4xx`, and `http_5xx`. Default value: `http_2xx`. **NOTE:** This
     * parameter exists if the `HealthCheckProtocol` parameter is set to `HTTP`.
     * 
     */
    private final @Nullable List<String> healthCheckCodes;
    /**
     * @return The port of the backend server that is used for health checks. Valid values: `0`
     * to `65535`. Default value: `0`. A value of 0 indicates that a backend server port is used for health checks.
     * 
     */
    private final @Nullable Integer healthCheckConnectPort;
    /**
     * @return Indicates whether health checks are enabled. Valid values: `true`, `false`. Default
     * value: `true`.
     * 
     */
    private final @Nullable Boolean healthCheckEnabled;
    /**
     * @return The domain name that is used for health checks.
     * 
     */
    private final @Nullable String healthCheckHost;
    /**
     * @return HTTP protocol version. Valid values: `HTTP1.0` and `HTTP1.1`. Default value: `HTTP1.1`
     * . **NOTE:** This parameter exists if the `HealthCheckProtocol` parameter is set to `HTTP`.
     * 
     */
    private final @Nullable String healthCheckHttpVersion;
    /**
     * @return The time interval between two consecutive health checks. Unit: seconds. Valid values: `1`
     * to `50`. Default value: `2`.
     * 
     */
    private final @Nullable Integer healthCheckInterval;
    /**
     * @return Health check method. Valid values: `GET` and `HEAD`. Default: `GET`. **NOTE:** This parameter
     * exists if the `HealthCheckProtocol` parameter is set to `HTTP`.
     * 
     */
    private final @Nullable String healthCheckMethod;
    /**
     * @return The forwarding rule path of health checks. **NOTE:** This parameter exists if
     * the `HealthCheckProtocol` parameter is set to `HTTP`.
     * 
     */
    private final @Nullable String healthCheckPath;
    /**
     * @return Health check protocol. Valid values: `HTTP` and `TCP`.
     * 
     */
    private final @Nullable String healthCheckProtocol;
    /**
     * @return The timeout period of a health check response. If a backend Elastic Compute Service (ECS)
     * instance does not send an expected response within the specified period of time, the ECS instance is considered
     * unhealthy. Unit: seconds. Valid values: 1 to 300. Default value: 5. **NOTE:** If the value of the `HealthCHeckTimeout`
     * parameter is smaller than that of the `HealthCheckInterval` parameter, the value of the `HealthCHeckTimeout` parameter
     * is ignored and the value of the `HealthCheckInterval` parameter is regarded as the timeout period.
     * 
     */
    private final @Nullable Integer healthCheckTimeout;
    /**
     * @return The number of health checks that an unhealthy backend server must pass consecutively before it
     * is declared healthy. In this case, the health check state is changed from fail to success. Valid values: 2 to 10.
     * Default value: 3.
     * 
     */
    private final @Nullable Integer healthyThreshold;
    /**
     * @return The number of consecutive health checks that a healthy backend server must consecutively fail
     * before it is declared unhealthy. In this case, the health check state is changed from success to fail. Valid
     * values: `2` to `10`. Default value: `3`.
     * 
     */
    private final @Nullable Integer unhealthyThreshold;

    @CustomType.Constructor
    private ServerGroupHealthCheckConfig(
        @CustomType.Parameter("healthCheckCodes") @Nullable List<String> healthCheckCodes,
        @CustomType.Parameter("healthCheckConnectPort") @Nullable Integer healthCheckConnectPort,
        @CustomType.Parameter("healthCheckEnabled") @Nullable Boolean healthCheckEnabled,
        @CustomType.Parameter("healthCheckHost") @Nullable String healthCheckHost,
        @CustomType.Parameter("healthCheckHttpVersion") @Nullable String healthCheckHttpVersion,
        @CustomType.Parameter("healthCheckInterval") @Nullable Integer healthCheckInterval,
        @CustomType.Parameter("healthCheckMethod") @Nullable String healthCheckMethod,
        @CustomType.Parameter("healthCheckPath") @Nullable String healthCheckPath,
        @CustomType.Parameter("healthCheckProtocol") @Nullable String healthCheckProtocol,
        @CustomType.Parameter("healthCheckTimeout") @Nullable Integer healthCheckTimeout,
        @CustomType.Parameter("healthyThreshold") @Nullable Integer healthyThreshold,
        @CustomType.Parameter("unhealthyThreshold") @Nullable Integer unhealthyThreshold) {
        this.healthCheckCodes = healthCheckCodes;
        this.healthCheckConnectPort = healthCheckConnectPort;
        this.healthCheckEnabled = healthCheckEnabled;
        this.healthCheckHost = healthCheckHost;
        this.healthCheckHttpVersion = healthCheckHttpVersion;
        this.healthCheckInterval = healthCheckInterval;
        this.healthCheckMethod = healthCheckMethod;
        this.healthCheckPath = healthCheckPath;
        this.healthCheckProtocol = healthCheckProtocol;
        this.healthCheckTimeout = healthCheckTimeout;
        this.healthyThreshold = healthyThreshold;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * @return The status code for a successful health check. Multiple status codes can be specified as a
     * list. Valid values: `http_2xx`, `http_3xx`, `http_4xx`, and `http_5xx`. Default value: `http_2xx`. **NOTE:** This
     * parameter exists if the `HealthCheckProtocol` parameter is set to `HTTP`.
     * 
     */
    public List<String> healthCheckCodes() {
        return this.healthCheckCodes == null ? List.of() : this.healthCheckCodes;
    }
    /**
     * @return The port of the backend server that is used for health checks. Valid values: `0`
     * to `65535`. Default value: `0`. A value of 0 indicates that a backend server port is used for health checks.
     * 
     */
    public Optional<Integer> healthCheckConnectPort() {
        return Optional.ofNullable(this.healthCheckConnectPort);
    }
    /**
     * @return Indicates whether health checks are enabled. Valid values: `true`, `false`. Default
     * value: `true`.
     * 
     */
    public Optional<Boolean> healthCheckEnabled() {
        return Optional.ofNullable(this.healthCheckEnabled);
    }
    /**
     * @return The domain name that is used for health checks.
     * 
     */
    public Optional<String> healthCheckHost() {
        return Optional.ofNullable(this.healthCheckHost);
    }
    /**
     * @return HTTP protocol version. Valid values: `HTTP1.0` and `HTTP1.1`. Default value: `HTTP1.1`
     * . **NOTE:** This parameter exists if the `HealthCheckProtocol` parameter is set to `HTTP`.
     * 
     */
    public Optional<String> healthCheckHttpVersion() {
        return Optional.ofNullable(this.healthCheckHttpVersion);
    }
    /**
     * @return The time interval between two consecutive health checks. Unit: seconds. Valid values: `1`
     * to `50`. Default value: `2`.
     * 
     */
    public Optional<Integer> healthCheckInterval() {
        return Optional.ofNullable(this.healthCheckInterval);
    }
    /**
     * @return Health check method. Valid values: `GET` and `HEAD`. Default: `GET`. **NOTE:** This parameter
     * exists if the `HealthCheckProtocol` parameter is set to `HTTP`.
     * 
     */
    public Optional<String> healthCheckMethod() {
        return Optional.ofNullable(this.healthCheckMethod);
    }
    /**
     * @return The forwarding rule path of health checks. **NOTE:** This parameter exists if
     * the `HealthCheckProtocol` parameter is set to `HTTP`.
     * 
     */
    public Optional<String> healthCheckPath() {
        return Optional.ofNullable(this.healthCheckPath);
    }
    /**
     * @return Health check protocol. Valid values: `HTTP` and `TCP`.
     * 
     */
    public Optional<String> healthCheckProtocol() {
        return Optional.ofNullable(this.healthCheckProtocol);
    }
    /**
     * @return The timeout period of a health check response. If a backend Elastic Compute Service (ECS)
     * instance does not send an expected response within the specified period of time, the ECS instance is considered
     * unhealthy. Unit: seconds. Valid values: 1 to 300. Default value: 5. **NOTE:** If the value of the `HealthCHeckTimeout`
     * parameter is smaller than that of the `HealthCheckInterval` parameter, the value of the `HealthCHeckTimeout` parameter
     * is ignored and the value of the `HealthCheckInterval` parameter is regarded as the timeout period.
     * 
     */
    public Optional<Integer> healthCheckTimeout() {
        return Optional.ofNullable(this.healthCheckTimeout);
    }
    /**
     * @return The number of health checks that an unhealthy backend server must pass consecutively before it
     * is declared healthy. In this case, the health check state is changed from fail to success. Valid values: 2 to 10.
     * Default value: 3.
     * 
     */
    public Optional<Integer> healthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }
    /**
     * @return The number of consecutive health checks that a healthy backend server must consecutively fail
     * before it is declared unhealthy. In this case, the health check state is changed from success to fail. Valid
     * values: `2` to `10`. Default value: `3`.
     * 
     */
    public Optional<Integer> unhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerGroupHealthCheckConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> healthCheckCodes;
        private @Nullable Integer healthCheckConnectPort;
        private @Nullable Boolean healthCheckEnabled;
        private @Nullable String healthCheckHost;
        private @Nullable String healthCheckHttpVersion;
        private @Nullable Integer healthCheckInterval;
        private @Nullable String healthCheckMethod;
        private @Nullable String healthCheckPath;
        private @Nullable String healthCheckProtocol;
        private @Nullable Integer healthCheckTimeout;
        private @Nullable Integer healthyThreshold;
        private @Nullable Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerGroupHealthCheckConfig defaults) {
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

        public Builder healthCheckCodes(@Nullable List<String> healthCheckCodes) {
            this.healthCheckCodes = healthCheckCodes;
            return this;
        }
        public Builder healthCheckCodes(String... healthCheckCodes) {
            return healthCheckCodes(List.of(healthCheckCodes));
        }
        public Builder healthCheckConnectPort(@Nullable Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Builder healthCheckEnabled(@Nullable Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Builder healthCheckHost(@Nullable String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }
        public Builder healthCheckHttpVersion(@Nullable String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        public Builder healthCheckInterval(@Nullable Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Builder healthCheckMethod(@Nullable String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }
        public Builder healthCheckPath(@Nullable String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public Builder healthCheckProtocol(@Nullable String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public Builder healthCheckTimeout(@Nullable Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Builder healthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }        public ServerGroupHealthCheckConfig build() {
            return new ServerGroupHealthCheckConfig(healthCheckCodes, healthCheckConnectPort, healthCheckEnabled, healthCheckHost, healthCheckHttpVersion, healthCheckInterval, healthCheckMethod, healthCheckPath, healthCheckProtocol, healthCheckTimeout, healthyThreshold, unhealthyThreshold);
        }
    }
}