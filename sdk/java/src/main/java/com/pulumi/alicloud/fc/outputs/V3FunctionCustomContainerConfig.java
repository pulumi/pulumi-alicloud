// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.alicloud.fc.outputs.V3FunctionCustomContainerConfigAccelerationInfo;
import com.pulumi.alicloud.fc.outputs.V3FunctionCustomContainerConfigHealthCheckConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V3FunctionCustomContainerConfig {
    /**
     * @return (Deprecated since v1.228.0) - Image Acceleration Information (Obsolete).
     * 
     * @deprecated
     * Field &#39;acceleration_info&#39; has been deprecated from provider version 1.228.0. Image Acceleration Information (Obsolete)
     * 
     */
    @Deprecated /* Field 'acceleration_info' has been deprecated from provider version 1.228.0. Image Acceleration Information (Obsolete) */
    private @Nullable V3FunctionCustomContainerConfigAccelerationInfo accelerationInfo;
    /**
     * @return Whether to enable Image acceleration. Default: The Default value, indicating that image acceleration is enabled. None: indicates that image acceleration is disabled. (Obsolete).
     * 
     * @deprecated
     * Field &#39;acceleration_type&#39; has been deprecated from provider version 1.228.0. Whether to enable Image acceleration. Default: The Default value, indicating that image acceleration is enabled. None: indicates that image acceleration is disabled. (Obsolete)
     * 
     */
    @Deprecated /* Field 'acceleration_type' has been deprecated from provider version 1.228.0. Whether to enable Image acceleration. Default: The Default value, indicating that image acceleration is enabled. None: indicates that image acceleration is disabled. (Obsolete) */
    private @Nullable String accelerationType;
    /**
     * @return ACR Enterprise version Image Repository ID, which must be entered when using ACR Enterprise version image. (Obsolete).
     * 
     * @deprecated
     * Field &#39;acr_instance_id&#39; has been deprecated from provider version 1.228.0. ACR Enterprise version Image Repository ID, which must be entered when using ACR Enterprise version image. (Obsolete)
     * 
     */
    @Deprecated /* Field 'acr_instance_id' has been deprecated from provider version 1.228.0. ACR Enterprise version Image Repository ID, which must be entered when using ACR Enterprise version image. (Obsolete) */
    private @Nullable String acrInstanceId;
    /**
     * @return Container startup parameters.
     * 
     */
    private @Nullable List<String> commands;
    /**
     * @return Container start command.
     * 
     */
    private @Nullable List<String> entrypoints;
    /**
     * @return Function custom health check configuration. See `health_check_config` below.
     * 
     */
    private @Nullable V3FunctionCustomContainerConfigHealthCheckConfig healthCheckConfig;
    /**
     * @return The container Image address.
     * 
     */
    private @Nullable String image;
    /**
     * @return The listening port of the HTTP Server when the custom container runs.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return The actual digest version of the deployed Image. The code version specified by this digest is used when the function starts.
     * 
     */
    private @Nullable String resolvedImageUri;

    private V3FunctionCustomContainerConfig() {}
    /**
     * @return (Deprecated since v1.228.0) - Image Acceleration Information (Obsolete).
     * 
     * @deprecated
     * Field &#39;acceleration_info&#39; has been deprecated from provider version 1.228.0. Image Acceleration Information (Obsolete)
     * 
     */
    @Deprecated /* Field 'acceleration_info' has been deprecated from provider version 1.228.0. Image Acceleration Information (Obsolete) */
    public Optional<V3FunctionCustomContainerConfigAccelerationInfo> accelerationInfo() {
        return Optional.ofNullable(this.accelerationInfo);
    }
    /**
     * @return Whether to enable Image acceleration. Default: The Default value, indicating that image acceleration is enabled. None: indicates that image acceleration is disabled. (Obsolete).
     * 
     * @deprecated
     * Field &#39;acceleration_type&#39; has been deprecated from provider version 1.228.0. Whether to enable Image acceleration. Default: The Default value, indicating that image acceleration is enabled. None: indicates that image acceleration is disabled. (Obsolete)
     * 
     */
    @Deprecated /* Field 'acceleration_type' has been deprecated from provider version 1.228.0. Whether to enable Image acceleration. Default: The Default value, indicating that image acceleration is enabled. None: indicates that image acceleration is disabled. (Obsolete) */
    public Optional<String> accelerationType() {
        return Optional.ofNullable(this.accelerationType);
    }
    /**
     * @return ACR Enterprise version Image Repository ID, which must be entered when using ACR Enterprise version image. (Obsolete).
     * 
     * @deprecated
     * Field &#39;acr_instance_id&#39; has been deprecated from provider version 1.228.0. ACR Enterprise version Image Repository ID, which must be entered when using ACR Enterprise version image. (Obsolete)
     * 
     */
    @Deprecated /* Field 'acr_instance_id' has been deprecated from provider version 1.228.0. ACR Enterprise version Image Repository ID, which must be entered when using ACR Enterprise version image. (Obsolete) */
    public Optional<String> acrInstanceId() {
        return Optional.ofNullable(this.acrInstanceId);
    }
    /**
     * @return Container startup parameters.
     * 
     */
    public List<String> commands() {
        return this.commands == null ? List.of() : this.commands;
    }
    /**
     * @return Container start command.
     * 
     */
    public List<String> entrypoints() {
        return this.entrypoints == null ? List.of() : this.entrypoints;
    }
    /**
     * @return Function custom health check configuration. See `health_check_config` below.
     * 
     */
    public Optional<V3FunctionCustomContainerConfigHealthCheckConfig> healthCheckConfig() {
        return Optional.ofNullable(this.healthCheckConfig);
    }
    /**
     * @return The container Image address.
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return The listening port of the HTTP Server when the custom container runs.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The actual digest version of the deployed Image. The code version specified by this digest is used when the function starts.
     * 
     */
    public Optional<String> resolvedImageUri() {
        return Optional.ofNullable(this.resolvedImageUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V3FunctionCustomContainerConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable V3FunctionCustomContainerConfigAccelerationInfo accelerationInfo;
        private @Nullable String accelerationType;
        private @Nullable String acrInstanceId;
        private @Nullable List<String> commands;
        private @Nullable List<String> entrypoints;
        private @Nullable V3FunctionCustomContainerConfigHealthCheckConfig healthCheckConfig;
        private @Nullable String image;
        private @Nullable Integer port;
        private @Nullable String resolvedImageUri;
        public Builder() {}
        public Builder(V3FunctionCustomContainerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerationInfo = defaults.accelerationInfo;
    	      this.accelerationType = defaults.accelerationType;
    	      this.acrInstanceId = defaults.acrInstanceId;
    	      this.commands = defaults.commands;
    	      this.entrypoints = defaults.entrypoints;
    	      this.healthCheckConfig = defaults.healthCheckConfig;
    	      this.image = defaults.image;
    	      this.port = defaults.port;
    	      this.resolvedImageUri = defaults.resolvedImageUri;
        }

        @CustomType.Setter
        public Builder accelerationInfo(@Nullable V3FunctionCustomContainerConfigAccelerationInfo accelerationInfo) {

            this.accelerationInfo = accelerationInfo;
            return this;
        }
        @CustomType.Setter
        public Builder accelerationType(@Nullable String accelerationType) {

            this.accelerationType = accelerationType;
            return this;
        }
        @CustomType.Setter
        public Builder acrInstanceId(@Nullable String acrInstanceId) {

            this.acrInstanceId = acrInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder commands(@Nullable List<String> commands) {

            this.commands = commands;
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        @CustomType.Setter
        public Builder entrypoints(@Nullable List<String> entrypoints) {

            this.entrypoints = entrypoints;
            return this;
        }
        public Builder entrypoints(String... entrypoints) {
            return entrypoints(List.of(entrypoints));
        }
        @CustomType.Setter
        public Builder healthCheckConfig(@Nullable V3FunctionCustomContainerConfigHealthCheckConfig healthCheckConfig) {

            this.healthCheckConfig = healthCheckConfig;
            return this;
        }
        @CustomType.Setter
        public Builder image(@Nullable String image) {

            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder resolvedImageUri(@Nullable String resolvedImageUri) {

            this.resolvedImageUri = resolvedImageUri;
            return this;
        }
        public V3FunctionCustomContainerConfig build() {
            final var _resultValue = new V3FunctionCustomContainerConfig();
            _resultValue.accelerationInfo = accelerationInfo;
            _resultValue.accelerationType = accelerationType;
            _resultValue.acrInstanceId = acrInstanceId;
            _resultValue.commands = commands;
            _resultValue.entrypoints = entrypoints;
            _resultValue.healthCheckConfig = healthCheckConfig;
            _resultValue.image = image;
            _resultValue.port = port;
            _resultValue.resolvedImageUri = resolvedImageUri;
            return _resultValue;
        }
    }
}