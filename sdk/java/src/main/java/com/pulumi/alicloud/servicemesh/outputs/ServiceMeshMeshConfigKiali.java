// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.outputs;

import com.pulumi.alicloud.servicemesh.outputs.ServiceMeshMeshConfigKialiOpenIdConfig;
import com.pulumi.alicloud.servicemesh.outputs.ServiceMeshMeshConfigKialiRamOauthConfig;
import com.pulumi.alicloud.servicemesh.outputs.ServiceMeshMeshConfigKialiServerConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceMeshMeshConfigKiali {
    /**
     * @return When the mesh topology is deployed in managed mode and integrated with CLB to provide external access, the external access address is automatically generated.
     * 
     */
    private @Nullable String aggregatedKialiAddress;
    /**
     * @return The authentication strategy used when logging into the mesh topology. In data plane deployment mode, the mesh topology can use token, openid, or ramoauth authentication strategies; in managed mode, the mesh topology can use openid or ramoauth authentication strategies.
     * 
     */
    private @Nullable String authStrategy;
    /**
     * @return When the mesh topology cannot automatically use the integrated ARMS Prometheus, you need to use this property to specify a custom Prometheus HTTP API Url. The corresponding Prometheus instance needs to have been configured to collect Istio metrics in the cluster within the service mesh.
     * 
     */
    private @Nullable String customPrometheusUrl;
    /**
     * @return The login token provided when the mesh topology is deployed in data plane deployment mode. When the mesh topology authentication strategy is token, this token can be used to log in to the mesh topology service. The key of the property is the Kubernetes cluster id, and the value of the property is the login token of the mesh topology service in the cluster.
     * 
     */
    private @Nullable String distributedKialiAccessTokens;
    /**
     * @return When the mesh topology is deployed in data plane deployment mode and integrated with CLB to provide external access, the external access address is automatically generated. The key of the attribute is the Kubernetes cluster id, and the value is the external access address of the mesh topology service in the cluster.
     * 
     */
    private @Nullable String distributedKialiAddresses;
    /**
     * @return Enable CNI
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Whether to integrate CLB for mesh topology services to provide external access.
     * 
     */
    private @Nullable Boolean integrateClb;
    /**
     * @return When the mesh topology automatically uses the integrated ARMS Prometheus, if the ARMS Prometheus instance in the cluster has token authentication enabled, you need to use this property to provide the corresponding authentication token for the mesh topology. The key of the property is the Kubernetes cluster id, and the value is the authentication token of the ARMS Prometheus instance corresponding to the cluster. (Service mesh instance version 1.15.3.113 or above is required)
     * 
     */
    private @Nullable String kialiArmsAuthTokens;
    /**
     * @return Annotations for the Service corresponding to the mesh topology service. When the mesh topology service integrates CLB, annotations can be used to control the CLB specifications. The attribute type is map, the key is the Kubernetes cluster id, and the value is the mesh topology service annotation map under the corresponding Kubernetes cluster. When using the managed mode mesh topology, the key is the service mesh instance id. For annotation content, refer to [Configuring traditional load balancing CLB through Annotation](https://www.alibabacloud.com/help/en/ack/serverless-kubernetes/user-guide/use-annotations-to-configure-load-balancing).(Service mesh instance version 1.17.2.19 or above is required)
     * 
     */
    private @Nullable String kialiServiceAnnotations;
    /**
     * @return When the mesh topology&#39;s authentication policy is openid, the configuration used when the mesh topology and OIDC application are connected. If the authentication policy is openid, this configuration must be provided. See `open_id_config` below.
     * 
     */
    private @Nullable ServiceMeshMeshConfigKialiOpenIdConfig openIdConfig;
    /**
     * @return When the authentication strategy of the mesh topology is ramoauth, the mesh topology will be connected to the RAM OAuth application to log in with the Alibaba Cloud account. In this case, this attribute must be provided to configure the connection with the RAM OAuth application. See `ram_oauth_config` below.
     * 
     */
    private @Nullable ServiceMeshMeshConfigKialiRamOauthConfig ramOauthConfig;
    /**
     * @return When you need to configure external access to the mesh topology through ASM gateway or other means, and access the mesh topology through a custom domain name or address, you need to specify this property. (The service mesh instance version must be 1.16.4.5 or above) See `server_config` below.
     * 
     */
    private @Nullable ServiceMeshMeshConfigKialiServerConfig serverConfig;
    /**
     * @return Kiali service address
     * 
     */
    private @Nullable String url;
    /**
     * @return Whether the mesh topology automatically uses the integrated ARMS Prometheus. When the integrated ARMS Prometheus is automatically used, there is no need to specify the dependent Prometheus HTTP API Url.
     * 
     */
    private @Nullable Boolean usePopulatedArmsPrometheus;

    private ServiceMeshMeshConfigKiali() {}
    /**
     * @return When the mesh topology is deployed in managed mode and integrated with CLB to provide external access, the external access address is automatically generated.
     * 
     */
    public Optional<String> aggregatedKialiAddress() {
        return Optional.ofNullable(this.aggregatedKialiAddress);
    }
    /**
     * @return The authentication strategy used when logging into the mesh topology. In data plane deployment mode, the mesh topology can use token, openid, or ramoauth authentication strategies; in managed mode, the mesh topology can use openid or ramoauth authentication strategies.
     * 
     */
    public Optional<String> authStrategy() {
        return Optional.ofNullable(this.authStrategy);
    }
    /**
     * @return When the mesh topology cannot automatically use the integrated ARMS Prometheus, you need to use this property to specify a custom Prometheus HTTP API Url. The corresponding Prometheus instance needs to have been configured to collect Istio metrics in the cluster within the service mesh.
     * 
     */
    public Optional<String> customPrometheusUrl() {
        return Optional.ofNullable(this.customPrometheusUrl);
    }
    /**
     * @return The login token provided when the mesh topology is deployed in data plane deployment mode. When the mesh topology authentication strategy is token, this token can be used to log in to the mesh topology service. The key of the property is the Kubernetes cluster id, and the value of the property is the login token of the mesh topology service in the cluster.
     * 
     */
    public Optional<String> distributedKialiAccessTokens() {
        return Optional.ofNullable(this.distributedKialiAccessTokens);
    }
    /**
     * @return When the mesh topology is deployed in data plane deployment mode and integrated with CLB to provide external access, the external access address is automatically generated. The key of the attribute is the Kubernetes cluster id, and the value is the external access address of the mesh topology service in the cluster.
     * 
     */
    public Optional<String> distributedKialiAddresses() {
        return Optional.ofNullable(this.distributedKialiAddresses);
    }
    /**
     * @return Enable CNI
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Whether to integrate CLB for mesh topology services to provide external access.
     * 
     */
    public Optional<Boolean> integrateClb() {
        return Optional.ofNullable(this.integrateClb);
    }
    /**
     * @return When the mesh topology automatically uses the integrated ARMS Prometheus, if the ARMS Prometheus instance in the cluster has token authentication enabled, you need to use this property to provide the corresponding authentication token for the mesh topology. The key of the property is the Kubernetes cluster id, and the value is the authentication token of the ARMS Prometheus instance corresponding to the cluster. (Service mesh instance version 1.15.3.113 or above is required)
     * 
     */
    public Optional<String> kialiArmsAuthTokens() {
        return Optional.ofNullable(this.kialiArmsAuthTokens);
    }
    /**
     * @return Annotations for the Service corresponding to the mesh topology service. When the mesh topology service integrates CLB, annotations can be used to control the CLB specifications. The attribute type is map, the key is the Kubernetes cluster id, and the value is the mesh topology service annotation map under the corresponding Kubernetes cluster. When using the managed mode mesh topology, the key is the service mesh instance id. For annotation content, refer to [Configuring traditional load balancing CLB through Annotation](https://www.alibabacloud.com/help/en/ack/serverless-kubernetes/user-guide/use-annotations-to-configure-load-balancing).(Service mesh instance version 1.17.2.19 or above is required)
     * 
     */
    public Optional<String> kialiServiceAnnotations() {
        return Optional.ofNullable(this.kialiServiceAnnotations);
    }
    /**
     * @return When the mesh topology&#39;s authentication policy is openid, the configuration used when the mesh topology and OIDC application are connected. If the authentication policy is openid, this configuration must be provided. See `open_id_config` below.
     * 
     */
    public Optional<ServiceMeshMeshConfigKialiOpenIdConfig> openIdConfig() {
        return Optional.ofNullable(this.openIdConfig);
    }
    /**
     * @return When the authentication strategy of the mesh topology is ramoauth, the mesh topology will be connected to the RAM OAuth application to log in with the Alibaba Cloud account. In this case, this attribute must be provided to configure the connection with the RAM OAuth application. See `ram_oauth_config` below.
     * 
     */
    public Optional<ServiceMeshMeshConfigKialiRamOauthConfig> ramOauthConfig() {
        return Optional.ofNullable(this.ramOauthConfig);
    }
    /**
     * @return When you need to configure external access to the mesh topology through ASM gateway or other means, and access the mesh topology through a custom domain name or address, you need to specify this property. (The service mesh instance version must be 1.16.4.5 or above) See `server_config` below.
     * 
     */
    public Optional<ServiceMeshMeshConfigKialiServerConfig> serverConfig() {
        return Optional.ofNullable(this.serverConfig);
    }
    /**
     * @return Kiali service address
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }
    /**
     * @return Whether the mesh topology automatically uses the integrated ARMS Prometheus. When the integrated ARMS Prometheus is automatically used, there is no need to specify the dependent Prometheus HTTP API Url.
     * 
     */
    public Optional<Boolean> usePopulatedArmsPrometheus() {
        return Optional.ofNullable(this.usePopulatedArmsPrometheus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMeshMeshConfigKiali defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aggregatedKialiAddress;
        private @Nullable String authStrategy;
        private @Nullable String customPrometheusUrl;
        private @Nullable String distributedKialiAccessTokens;
        private @Nullable String distributedKialiAddresses;
        private @Nullable Boolean enabled;
        private @Nullable Boolean integrateClb;
        private @Nullable String kialiArmsAuthTokens;
        private @Nullable String kialiServiceAnnotations;
        private @Nullable ServiceMeshMeshConfigKialiOpenIdConfig openIdConfig;
        private @Nullable ServiceMeshMeshConfigKialiRamOauthConfig ramOauthConfig;
        private @Nullable ServiceMeshMeshConfigKialiServerConfig serverConfig;
        private @Nullable String url;
        private @Nullable Boolean usePopulatedArmsPrometheus;
        public Builder() {}
        public Builder(ServiceMeshMeshConfigKiali defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregatedKialiAddress = defaults.aggregatedKialiAddress;
    	      this.authStrategy = defaults.authStrategy;
    	      this.customPrometheusUrl = defaults.customPrometheusUrl;
    	      this.distributedKialiAccessTokens = defaults.distributedKialiAccessTokens;
    	      this.distributedKialiAddresses = defaults.distributedKialiAddresses;
    	      this.enabled = defaults.enabled;
    	      this.integrateClb = defaults.integrateClb;
    	      this.kialiArmsAuthTokens = defaults.kialiArmsAuthTokens;
    	      this.kialiServiceAnnotations = defaults.kialiServiceAnnotations;
    	      this.openIdConfig = defaults.openIdConfig;
    	      this.ramOauthConfig = defaults.ramOauthConfig;
    	      this.serverConfig = defaults.serverConfig;
    	      this.url = defaults.url;
    	      this.usePopulatedArmsPrometheus = defaults.usePopulatedArmsPrometheus;
        }

        @CustomType.Setter
        public Builder aggregatedKialiAddress(@Nullable String aggregatedKialiAddress) {

            this.aggregatedKialiAddress = aggregatedKialiAddress;
            return this;
        }
        @CustomType.Setter
        public Builder authStrategy(@Nullable String authStrategy) {

            this.authStrategy = authStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder customPrometheusUrl(@Nullable String customPrometheusUrl) {

            this.customPrometheusUrl = customPrometheusUrl;
            return this;
        }
        @CustomType.Setter
        public Builder distributedKialiAccessTokens(@Nullable String distributedKialiAccessTokens) {

            this.distributedKialiAccessTokens = distributedKialiAccessTokens;
            return this;
        }
        @CustomType.Setter
        public Builder distributedKialiAddresses(@Nullable String distributedKialiAddresses) {

            this.distributedKialiAddresses = distributedKialiAddresses;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder integrateClb(@Nullable Boolean integrateClb) {

            this.integrateClb = integrateClb;
            return this;
        }
        @CustomType.Setter
        public Builder kialiArmsAuthTokens(@Nullable String kialiArmsAuthTokens) {

            this.kialiArmsAuthTokens = kialiArmsAuthTokens;
            return this;
        }
        @CustomType.Setter
        public Builder kialiServiceAnnotations(@Nullable String kialiServiceAnnotations) {

            this.kialiServiceAnnotations = kialiServiceAnnotations;
            return this;
        }
        @CustomType.Setter
        public Builder openIdConfig(@Nullable ServiceMeshMeshConfigKialiOpenIdConfig openIdConfig) {

            this.openIdConfig = openIdConfig;
            return this;
        }
        @CustomType.Setter
        public Builder ramOauthConfig(@Nullable ServiceMeshMeshConfigKialiRamOauthConfig ramOauthConfig) {

            this.ramOauthConfig = ramOauthConfig;
            return this;
        }
        @CustomType.Setter
        public Builder serverConfig(@Nullable ServiceMeshMeshConfigKialiServerConfig serverConfig) {

            this.serverConfig = serverConfig;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder usePopulatedArmsPrometheus(@Nullable Boolean usePopulatedArmsPrometheus) {

            this.usePopulatedArmsPrometheus = usePopulatedArmsPrometheus;
            return this;
        }
        public ServiceMeshMeshConfigKiali build() {
            final var _resultValue = new ServiceMeshMeshConfigKiali();
            _resultValue.aggregatedKialiAddress = aggregatedKialiAddress;
            _resultValue.authStrategy = authStrategy;
            _resultValue.customPrometheusUrl = customPrometheusUrl;
            _resultValue.distributedKialiAccessTokens = distributedKialiAccessTokens;
            _resultValue.distributedKialiAddresses = distributedKialiAddresses;
            _resultValue.enabled = enabled;
            _resultValue.integrateClb = integrateClb;
            _resultValue.kialiArmsAuthTokens = kialiArmsAuthTokens;
            _resultValue.kialiServiceAnnotations = kialiServiceAnnotations;
            _resultValue.openIdConfig = openIdConfig;
            _resultValue.ramOauthConfig = ramOauthConfig;
            _resultValue.serverConfig = serverConfig;
            _resultValue.url = url;
            _resultValue.usePopulatedArmsPrometheus = usePopulatedArmsPrometheus;
            return _resultValue;
        }
    }
}
