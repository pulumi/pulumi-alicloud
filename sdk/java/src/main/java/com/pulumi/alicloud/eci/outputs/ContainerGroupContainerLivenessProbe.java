// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.alicloud.eci.outputs.ContainerGroupContainerLivenessProbeExec;
import com.pulumi.alicloud.eci.outputs.ContainerGroupContainerLivenessProbeHttpGet;
import com.pulumi.alicloud.eci.outputs.ContainerGroupContainerLivenessProbeTcpSocket;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerGroupContainerLivenessProbe {
    /**
     * @return Health check using command line method. See `exec` below.
     * 
     */
    private @Nullable List<ContainerGroupContainerLivenessProbeExec> execs;
    /**
     * @return Threshold for the number of checks that are determined to have failed since the last successful check (must be consecutive failures), default is 3.
     * 
     */
    private @Nullable Integer failureThreshold;
    /**
     * @return Health check using HTTP request method. See `http_get` below.
     * 
     * &gt; **NOTE:** When you configure `readiness_probe`, you can select only one of the `exec`, `tcp_socket`, `http_get`.
     * 
     */
    private @Nullable List<ContainerGroupContainerLivenessProbeHttpGet> httpGets;
    /**
     * @return Check the time to start execution, calculated from the completion of container startup.
     * 
     */
    private @Nullable Integer initialDelaySeconds;
    /**
     * @return Buffer time for the program to handle operations before closing.
     * 
     */
    private @Nullable Integer periodSeconds;
    /**
     * @return The check count threshold for re-identifying successful checks since the last failed check (must be consecutive successes), default is 1. Current must be 1.
     * 
     */
    private @Nullable Integer successThreshold;
    /**
     * @return Health check using TCP socket method. See `tcp_socket` below.
     * 
     */
    private @Nullable List<ContainerGroupContainerLivenessProbeTcpSocket> tcpSockets;
    /**
     * @return Check the timeout, the default is 1 second, the minimum is 1 second.
     * 
     */
    private @Nullable Integer timeoutSeconds;

    private ContainerGroupContainerLivenessProbe() {}
    /**
     * @return Health check using command line method. See `exec` below.
     * 
     */
    public List<ContainerGroupContainerLivenessProbeExec> execs() {
        return this.execs == null ? List.of() : this.execs;
    }
    /**
     * @return Threshold for the number of checks that are determined to have failed since the last successful check (must be consecutive failures), default is 3.
     * 
     */
    public Optional<Integer> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * @return Health check using HTTP request method. See `http_get` below.
     * 
     * &gt; **NOTE:** When you configure `readiness_probe`, you can select only one of the `exec`, `tcp_socket`, `http_get`.
     * 
     */
    public List<ContainerGroupContainerLivenessProbeHttpGet> httpGets() {
        return this.httpGets == null ? List.of() : this.httpGets;
    }
    /**
     * @return Check the time to start execution, calculated from the completion of container startup.
     * 
     */
    public Optional<Integer> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }
    /**
     * @return Buffer time for the program to handle operations before closing.
     * 
     */
    public Optional<Integer> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }
    /**
     * @return The check count threshold for re-identifying successful checks since the last failed check (must be consecutive successes), default is 1. Current must be 1.
     * 
     */
    public Optional<Integer> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * @return Health check using TCP socket method. See `tcp_socket` below.
     * 
     */
    public List<ContainerGroupContainerLivenessProbeTcpSocket> tcpSockets() {
        return this.tcpSockets == null ? List.of() : this.tcpSockets;
    }
    /**
     * @return Check the timeout, the default is 1 second, the minimum is 1 second.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupContainerLivenessProbe defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ContainerGroupContainerLivenessProbeExec> execs;
        private @Nullable Integer failureThreshold;
        private @Nullable List<ContainerGroupContainerLivenessProbeHttpGet> httpGets;
        private @Nullable Integer initialDelaySeconds;
        private @Nullable Integer periodSeconds;
        private @Nullable Integer successThreshold;
        private @Nullable List<ContainerGroupContainerLivenessProbeTcpSocket> tcpSockets;
        private @Nullable Integer timeoutSeconds;
        public Builder() {}
        public Builder(ContainerGroupContainerLivenessProbe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.execs = defaults.execs;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.httpGets = defaults.httpGets;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.tcpSockets = defaults.tcpSockets;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        @CustomType.Setter
        public Builder execs(@Nullable List<ContainerGroupContainerLivenessProbeExec> execs) {

            this.execs = execs;
            return this;
        }
        public Builder execs(ContainerGroupContainerLivenessProbeExec... execs) {
            return execs(List.of(execs));
        }
        @CustomType.Setter
        public Builder failureThreshold(@Nullable Integer failureThreshold) {

            this.failureThreshold = failureThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder httpGets(@Nullable List<ContainerGroupContainerLivenessProbeHttpGet> httpGets) {

            this.httpGets = httpGets;
            return this;
        }
        public Builder httpGets(ContainerGroupContainerLivenessProbeHttpGet... httpGets) {
            return httpGets(List.of(httpGets));
        }
        @CustomType.Setter
        public Builder initialDelaySeconds(@Nullable Integer initialDelaySeconds) {

            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        @CustomType.Setter
        public Builder periodSeconds(@Nullable Integer periodSeconds) {

            this.periodSeconds = periodSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder successThreshold(@Nullable Integer successThreshold) {

            this.successThreshold = successThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder tcpSockets(@Nullable List<ContainerGroupContainerLivenessProbeTcpSocket> tcpSockets) {

            this.tcpSockets = tcpSockets;
            return this;
        }
        public Builder tcpSockets(ContainerGroupContainerLivenessProbeTcpSocket... tcpSockets) {
            return tcpSockets(List.of(tcpSockets));
        }
        @CustomType.Setter
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {

            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public ContainerGroupContainerLivenessProbe build() {
            final var _resultValue = new ContainerGroupContainerLivenessProbe();
            _resultValue.execs = execs;
            _resultValue.failureThreshold = failureThreshold;
            _resultValue.httpGets = httpGets;
            _resultValue.initialDelaySeconds = initialDelaySeconds;
            _resultValue.periodSeconds = periodSeconds;
            _resultValue.successThreshold = successThreshold;
            _resultValue.tcpSockets = tcpSockets;
            _resultValue.timeoutSeconds = timeoutSeconds;
            return _resultValue;
        }
    }
}
