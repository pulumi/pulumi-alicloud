// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvCustomJobState extends com.pulumi.resources.ResourceArgs {

    public static final EnvCustomJobState Empty = new EnvCustomJobState();

    /**
     * The locale. The default is Chinese zh | en.
     * 
     */
    @Import(name="aliyunLang")
    private @Nullable Output<String> aliyunLang;

    /**
     * @return The locale. The default is Chinese zh | en.
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
     * Custom job name.
     * 
     */
    @Import(name="envCustomJobName")
    private @Nullable Output<String> envCustomJobName;

    /**
     * @return Custom job name.
     * 
     */
    public Optional<Output<String>> envCustomJobName() {
        return Optional.ofNullable(this.envCustomJobName);
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
     * Status: run, stop.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status: run, stop.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private EnvCustomJobState() {}

    private EnvCustomJobState(EnvCustomJobState $) {
        this.aliyunLang = $.aliyunLang;
        this.configYaml = $.configYaml;
        this.envCustomJobName = $.envCustomJobName;
        this.environmentId = $.environmentId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvCustomJobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvCustomJobState $;

        public Builder() {
            $ = new EnvCustomJobState();
        }

        public Builder(EnvCustomJobState defaults) {
            $ = new EnvCustomJobState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliyunLang The locale. The default is Chinese zh | en.
         * 
         * @return builder
         * 
         */
        public Builder aliyunLang(@Nullable Output<String> aliyunLang) {
            $.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * @param aliyunLang The locale. The default is Chinese zh | en.
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
         * @param envCustomJobName Custom job name.
         * 
         * @return builder
         * 
         */
        public Builder envCustomJobName(@Nullable Output<String> envCustomJobName) {
            $.envCustomJobName = envCustomJobName;
            return this;
        }

        /**
         * @param envCustomJobName Custom job name.
         * 
         * @return builder
         * 
         */
        public Builder envCustomJobName(String envCustomJobName) {
            return envCustomJobName(Output.of(envCustomJobName));
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
         * @param status Status: run, stop.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status: run, stop.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public EnvCustomJobState build() {
            return $;
        }
    }

}
