// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvPodMonitorState extends com.pulumi.resources.ResourceArgs {

    public static final EnvPodMonitorState Empty = new EnvPodMonitorState();

    /**
     * Language environment, default is Chinese zh | en.
     * 
     */
    @Import(name="aliyunLang")
    private @Nullable Output<String> aliyunLang;

    /**
     * @return Language environment, default is Chinese zh | en.
     * 
     */
    public Optional<Output<String>> aliyunLang() {
        return Optional.ofNullable(this.aliyunLang);
    }

    /**
     * Yaml configuration string.
     * 
     */
    @Import(name="configYaml")
    private @Nullable Output<String> configYaml;

    /**
     * @return Yaml configuration string.
     * 
     */
    public Optional<Output<String>> configYaml() {
        return Optional.ofNullable(this.configYaml);
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="envPodMonitorName")
    private @Nullable Output<String> envPodMonitorName;

    /**
     * @return The name of the resource.
     * 
     */
    public Optional<Output<String>> envPodMonitorName() {
        return Optional.ofNullable(this.envPodMonitorName);
    }

    /**
     * Environment id.
     * 
     */
    @Import(name="environmentId")
    private @Nullable Output<String> environmentId;

    /**
     * @return Environment id.
     * 
     */
    public Optional<Output<String>> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    /**
     * Resource namespace.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Resource namespace.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * PodMonitor status.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return PodMonitor status.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private EnvPodMonitorState() {}

    private EnvPodMonitorState(EnvPodMonitorState $) {
        this.aliyunLang = $.aliyunLang;
        this.configYaml = $.configYaml;
        this.envPodMonitorName = $.envPodMonitorName;
        this.environmentId = $.environmentId;
        this.namespace = $.namespace;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvPodMonitorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvPodMonitorState $;

        public Builder() {
            $ = new EnvPodMonitorState();
        }

        public Builder(EnvPodMonitorState defaults) {
            $ = new EnvPodMonitorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliyunLang Language environment, default is Chinese zh | en.
         * 
         * @return builder
         * 
         */
        public Builder aliyunLang(@Nullable Output<String> aliyunLang) {
            $.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * @param aliyunLang Language environment, default is Chinese zh | en.
         * 
         * @return builder
         * 
         */
        public Builder aliyunLang(String aliyunLang) {
            return aliyunLang(Output.of(aliyunLang));
        }

        /**
         * @param configYaml Yaml configuration string.
         * 
         * @return builder
         * 
         */
        public Builder configYaml(@Nullable Output<String> configYaml) {
            $.configYaml = configYaml;
            return this;
        }

        /**
         * @param configYaml Yaml configuration string.
         * 
         * @return builder
         * 
         */
        public Builder configYaml(String configYaml) {
            return configYaml(Output.of(configYaml));
        }

        /**
         * @param envPodMonitorName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder envPodMonitorName(@Nullable Output<String> envPodMonitorName) {
            $.envPodMonitorName = envPodMonitorName;
            return this;
        }

        /**
         * @param envPodMonitorName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder envPodMonitorName(String envPodMonitorName) {
            return envPodMonitorName(Output.of(envPodMonitorName));
        }

        /**
         * @param environmentId Environment id.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(@Nullable Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param environmentId Environment id.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param namespace Resource namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Resource namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param status PodMonitor status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status PodMonitor status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public EnvPodMonitorState build() {
            return $;
        }
    }

}