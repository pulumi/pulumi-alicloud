// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceMeshMeshConfigAccessLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceMeshMeshConfigAccessLogArgs Empty = new ServiceMeshMeshConfigAccessLogArgs();

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
     * Whether collect AccessLog of ASM Gateway to Alibaba Cloud SLS
     * 
     */
    @Import(name="gatewayEnabled")
    private @Nullable Output<Boolean> gatewayEnabled;

    /**
     * @return Whether collect AccessLog of ASM Gateway to Alibaba Cloud SLS
     * 
     */
    public Optional<Output<Boolean>> gatewayEnabled() {
        return Optional.ofNullable(this.gatewayEnabled);
    }

    /**
     * Lifecycle of AccessLog of ASM Gateways which have been collected to Alibaba Cloud SLS
     * 
     */
    @Import(name="gatewayLifecycle")
    private @Nullable Output<Integer> gatewayLifecycle;

    /**
     * @return Lifecycle of AccessLog of ASM Gateways which have been collected to Alibaba Cloud SLS
     * 
     */
    public Optional<Output<Integer>> gatewayLifecycle() {
        return Optional.ofNullable(this.gatewayLifecycle);
    }

    /**
     * The name of the SLS Project to which the control plane logs are collected.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The name of the SLS Project to which the control plane logs are collected.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Whether collect AccessLog of ASM Gateway to Alibaba Cloud SLS
     * 
     */
    @Import(name="sidecarEnabled")
    private @Nullable Output<Boolean> sidecarEnabled;

    /**
     * @return Whether collect AccessLog of ASM Gateway to Alibaba Cloud SLS
     * 
     */
    public Optional<Output<Boolean>> sidecarEnabled() {
        return Optional.ofNullable(this.sidecarEnabled);
    }

    /**
     * Lifecycle of AccessLog of ASM Sidecars which have been collected to Alibaba Cloud SLS
     * 
     */
    @Import(name="sidecarLifecycle")
    private @Nullable Output<Integer> sidecarLifecycle;

    /**
     * @return Lifecycle of AccessLog of ASM Sidecars which have been collected to Alibaba Cloud SLS
     * 
     */
    public Optional<Output<Integer>> sidecarLifecycle() {
        return Optional.ofNullable(this.sidecarLifecycle);
    }

    private ServiceMeshMeshConfigAccessLogArgs() {}

    private ServiceMeshMeshConfigAccessLogArgs(ServiceMeshMeshConfigAccessLogArgs $) {
        this.enabled = $.enabled;
        this.gatewayEnabled = $.gatewayEnabled;
        this.gatewayLifecycle = $.gatewayLifecycle;
        this.project = $.project;
        this.sidecarEnabled = $.sidecarEnabled;
        this.sidecarLifecycle = $.sidecarLifecycle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceMeshMeshConfigAccessLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceMeshMeshConfigAccessLogArgs $;

        public Builder() {
            $ = new ServiceMeshMeshConfigAccessLogArgs();
        }

        public Builder(ServiceMeshMeshConfigAccessLogArgs defaults) {
            $ = new ServiceMeshMeshConfigAccessLogArgs(Objects.requireNonNull(defaults));
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
         * @param gatewayEnabled Whether collect AccessLog of ASM Gateway to Alibaba Cloud SLS
         * 
         * @return builder
         * 
         */
        public Builder gatewayEnabled(@Nullable Output<Boolean> gatewayEnabled) {
            $.gatewayEnabled = gatewayEnabled;
            return this;
        }

        /**
         * @param gatewayEnabled Whether collect AccessLog of ASM Gateway to Alibaba Cloud SLS
         * 
         * @return builder
         * 
         */
        public Builder gatewayEnabled(Boolean gatewayEnabled) {
            return gatewayEnabled(Output.of(gatewayEnabled));
        }

        /**
         * @param gatewayLifecycle Lifecycle of AccessLog of ASM Gateways which have been collected to Alibaba Cloud SLS
         * 
         * @return builder
         * 
         */
        public Builder gatewayLifecycle(@Nullable Output<Integer> gatewayLifecycle) {
            $.gatewayLifecycle = gatewayLifecycle;
            return this;
        }

        /**
         * @param gatewayLifecycle Lifecycle of AccessLog of ASM Gateways which have been collected to Alibaba Cloud SLS
         * 
         * @return builder
         * 
         */
        public Builder gatewayLifecycle(Integer gatewayLifecycle) {
            return gatewayLifecycle(Output.of(gatewayLifecycle));
        }

        /**
         * @param project The name of the SLS Project to which the control plane logs are collected.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The name of the SLS Project to which the control plane logs are collected.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param sidecarEnabled Whether collect AccessLog of ASM Gateway to Alibaba Cloud SLS
         * 
         * @return builder
         * 
         */
        public Builder sidecarEnabled(@Nullable Output<Boolean> sidecarEnabled) {
            $.sidecarEnabled = sidecarEnabled;
            return this;
        }

        /**
         * @param sidecarEnabled Whether collect AccessLog of ASM Gateway to Alibaba Cloud SLS
         * 
         * @return builder
         * 
         */
        public Builder sidecarEnabled(Boolean sidecarEnabled) {
            return sidecarEnabled(Output.of(sidecarEnabled));
        }

        /**
         * @param sidecarLifecycle Lifecycle of AccessLog of ASM Sidecars which have been collected to Alibaba Cloud SLS
         * 
         * @return builder
         * 
         */
        public Builder sidecarLifecycle(@Nullable Output<Integer> sidecarLifecycle) {
            $.sidecarLifecycle = sidecarLifecycle;
            return this;
        }

        /**
         * @param sidecarLifecycle Lifecycle of AccessLog of ASM Sidecars which have been collected to Alibaba Cloud SLS
         * 
         * @return builder
         * 
         */
        public Builder sidecarLifecycle(Integer sidecarLifecycle) {
            return sidecarLifecycle(Output.of(sidecarLifecycle));
        }

        public ServiceMeshMeshConfigAccessLogArgs build() {
            return $;
        }
    }

}
