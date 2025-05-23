// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceMeshMeshConfigOpaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceMeshMeshConfigOpaArgs Empty = new ServiceMeshMeshConfigOpaArgs();

    /**
     * Enable CNI
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable CNI
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Sidecar injector Pods on the throttle
     * 
     */
    @Import(name="limitCpu")
    private @Nullable Output<String> limitCpu;

    /**
     * @return Sidecar injector Pods on the throttle
     * 
     */
    public Optional<Output<String>> limitCpu() {
        return Optional.ofNullable(this.limitCpu);
    }

    /**
     * Sidecar injector Pods on the throttle
     * 
     */
    @Import(name="limitMemory")
    private @Nullable Output<String> limitMemory;

    /**
     * @return Sidecar injector Pods on the throttle
     * 
     */
    public Optional<Output<String>> limitMemory() {
        return Optional.ofNullable(this.limitMemory);
    }

    /**
     * OPA proxy container log level
     * 
     */
    @Import(name="logLevel")
    private @Nullable Output<String> logLevel;

    /**
     * @return OPA proxy container log level
     * 
     */
    public Optional<Output<String>> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    /**
     * Sidecar injector Pods on the requested resource
     * 
     */
    @Import(name="requestCpu")
    private @Nullable Output<String> requestCpu;

    /**
     * @return Sidecar injector Pods on the requested resource
     * 
     */
    public Optional<Output<String>> requestCpu() {
        return Optional.ofNullable(this.requestCpu);
    }

    /**
     * Sidecar injector Pods on the requested resource
     * 
     */
    @Import(name="requestMemory")
    private @Nullable Output<String> requestMemory;

    /**
     * @return Sidecar injector Pods on the requested resource
     * 
     */
    public Optional<Output<String>> requestMemory() {
        return Optional.ofNullable(this.requestMemory);
    }

    private ServiceMeshMeshConfigOpaArgs() {}

    private ServiceMeshMeshConfigOpaArgs(ServiceMeshMeshConfigOpaArgs $) {
        this.enabled = $.enabled;
        this.limitCpu = $.limitCpu;
        this.limitMemory = $.limitMemory;
        this.logLevel = $.logLevel;
        this.requestCpu = $.requestCpu;
        this.requestMemory = $.requestMemory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceMeshMeshConfigOpaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceMeshMeshConfigOpaArgs $;

        public Builder() {
            $ = new ServiceMeshMeshConfigOpaArgs();
        }

        public Builder(ServiceMeshMeshConfigOpaArgs defaults) {
            $ = new ServiceMeshMeshConfigOpaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable CNI
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable CNI
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param limitCpu Sidecar injector Pods on the throttle
         * 
         * @return builder
         * 
         */
        public Builder limitCpu(@Nullable Output<String> limitCpu) {
            $.limitCpu = limitCpu;
            return this;
        }

        /**
         * @param limitCpu Sidecar injector Pods on the throttle
         * 
         * @return builder
         * 
         */
        public Builder limitCpu(String limitCpu) {
            return limitCpu(Output.of(limitCpu));
        }

        /**
         * @param limitMemory Sidecar injector Pods on the throttle
         * 
         * @return builder
         * 
         */
        public Builder limitMemory(@Nullable Output<String> limitMemory) {
            $.limitMemory = limitMemory;
            return this;
        }

        /**
         * @param limitMemory Sidecar injector Pods on the throttle
         * 
         * @return builder
         * 
         */
        public Builder limitMemory(String limitMemory) {
            return limitMemory(Output.of(limitMemory));
        }

        /**
         * @param logLevel OPA proxy container log level
         * 
         * @return builder
         * 
         */
        public Builder logLevel(@Nullable Output<String> logLevel) {
            $.logLevel = logLevel;
            return this;
        }

        /**
         * @param logLevel OPA proxy container log level
         * 
         * @return builder
         * 
         */
        public Builder logLevel(String logLevel) {
            return logLevel(Output.of(logLevel));
        }

        /**
         * @param requestCpu Sidecar injector Pods on the requested resource
         * 
         * @return builder
         * 
         */
        public Builder requestCpu(@Nullable Output<String> requestCpu) {
            $.requestCpu = requestCpu;
            return this;
        }

        /**
         * @param requestCpu Sidecar injector Pods on the requested resource
         * 
         * @return builder
         * 
         */
        public Builder requestCpu(String requestCpu) {
            return requestCpu(Output.of(requestCpu));
        }

        /**
         * @param requestMemory Sidecar injector Pods on the requested resource
         * 
         * @return builder
         * 
         */
        public Builder requestMemory(@Nullable Output<String> requestMemory) {
            $.requestMemory = requestMemory;
            return this;
        }

        /**
         * @param requestMemory Sidecar injector Pods on the requested resource
         * 
         * @return builder
         * 
         */
        public Builder requestMemory(String requestMemory) {
            return requestMemory(Output.of(requestMemory));
        }

        public ServiceMeshMeshConfigOpaArgs build() {
            return $;
        }
    }

}
