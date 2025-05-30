// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway;

import com.pulumi.alicloud.apigateway.inputs.ApiConstantParameterArgs;
import com.pulumi.alicloud.apigateway.inputs.ApiFcServiceConfigArgs;
import com.pulumi.alicloud.apigateway.inputs.ApiHttpServiceConfigArgs;
import com.pulumi.alicloud.apigateway.inputs.ApiHttpVpcServiceConfigArgs;
import com.pulumi.alicloud.apigateway.inputs.ApiMockServiceConfigArgs;
import com.pulumi.alicloud.apigateway.inputs.ApiRequestConfigArgs;
import com.pulumi.alicloud.apigateway.inputs.ApiRequestParameterArgs;
import com.pulumi.alicloud.apigateway.inputs.ApiSystemParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiArgs Empty = new ApiArgs();

    /**
     * The authorization Type including APP and ANONYMOUS. Defaults to null.
     * 
     */
    @Import(name="authType", required=true)
    private Output<String> authType;

    /**
     * @return The authorization Type including APP and ANONYMOUS. Defaults to null.
     * 
     */
    public Output<String> authType() {
        return this.authType;
    }

    /**
     * constant_parameters defines the constant parameters of the api. See `constant_parameters` below.
     * 
     */
    @Import(name="constantParameters")
    private @Nullable Output<List<ApiConstantParameterArgs>> constantParameters;

    /**
     * @return constant_parameters defines the constant parameters of the api. See `constant_parameters` below.
     * 
     */
    public Optional<Output<List<ApiConstantParameterArgs>>> constantParameters() {
        return Optional.ofNullable(this.constantParameters);
    }

    /**
     * The description of the api. Defaults to null.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the api. Defaults to null.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * fc_service_config defines the config when service_type selected &#39;FunctionCompute&#39;. See `fc_service_config` below.
     * 
     */
    @Import(name="fcServiceConfig")
    private @Nullable Output<ApiFcServiceConfigArgs> fcServiceConfig;

    /**
     * @return fc_service_config defines the config when service_type selected &#39;FunctionCompute&#39;. See `fc_service_config` below.
     * 
     */
    public Optional<Output<ApiFcServiceConfigArgs>> fcServiceConfig() {
        return Optional.ofNullable(this.fcServiceConfig);
    }

    /**
     * Whether to prevent API replay attack. Default value: `false`.
     * 
     */
    @Import(name="forceNonceCheck")
    private @Nullable Output<Boolean> forceNonceCheck;

    /**
     * @return Whether to prevent API replay attack. Default value: `false`.
     * 
     */
    public Optional<Output<Boolean>> forceNonceCheck() {
        return Optional.ofNullable(this.forceNonceCheck);
    }

    /**
     * The api gateway that the api belongs to. Defaults to null.
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return The api gateway that the api belongs to. Defaults to null.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * http_service_config defines the config when service_type selected &#39;HTTP&#39;. See `http_service_config` below.
     * 
     */
    @Import(name="httpServiceConfig")
    private @Nullable Output<ApiHttpServiceConfigArgs> httpServiceConfig;

    /**
     * @return http_service_config defines the config when service_type selected &#39;HTTP&#39;. See `http_service_config` below.
     * 
     */
    public Optional<Output<ApiHttpServiceConfigArgs>> httpServiceConfig() {
        return Optional.ofNullable(this.httpServiceConfig);
    }

    /**
     * http_vpc_service_config defines the config when service_type selected &#39;HTTP-VPC&#39;. See `http_vpc_service_config` below.
     * 
     */
    @Import(name="httpVpcServiceConfig")
    private @Nullable Output<ApiHttpVpcServiceConfigArgs> httpVpcServiceConfig;

    /**
     * @return http_vpc_service_config defines the config when service_type selected &#39;HTTP-VPC&#39;. See `http_vpc_service_config` below.
     * 
     */
    public Optional<Output<ApiHttpVpcServiceConfigArgs>> httpVpcServiceConfig() {
        return Optional.ofNullable(this.httpVpcServiceConfig);
    }

    /**
     * http_service_config defines the config when service_type selected &#39;MOCK&#39;. See `mock_service_config` below.
     * 
     */
    @Import(name="mockServiceConfig")
    private @Nullable Output<ApiMockServiceConfigArgs> mockServiceConfig;

    /**
     * @return http_service_config defines the config when service_type selected &#39;MOCK&#39;. See `mock_service_config` below.
     * 
     */
    public Optional<Output<ApiMockServiceConfigArgs>> mockServiceConfig() {
        return Optional.ofNullable(this.mockServiceConfig);
    }

    /**
     * The name of the api gateway api. Defaults to null.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the api gateway api. Defaults to null.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Request_config defines how users can send requests to your API. See `request_config` below.
     * 
     */
    @Import(name="requestConfig", required=true)
    private Output<ApiRequestConfigArgs> requestConfig;

    /**
     * @return Request_config defines how users can send requests to your API. See `request_config` below.
     * 
     */
    public Output<ApiRequestConfigArgs> requestConfig() {
        return this.requestConfig;
    }

    /**
     * request_parameters defines the request parameters of the api. See `request_parameters` below.
     * 
     */
    @Import(name="requestParameters")
    private @Nullable Output<List<ApiRequestParameterArgs>> requestParameters;

    /**
     * @return request_parameters defines the request parameters of the api. See `request_parameters` below.
     * 
     */
    public Optional<Output<List<ApiRequestParameterArgs>>> requestParameters() {
        return Optional.ofNullable(this.requestParameters);
    }

    /**
     * The type of backend service. Type including HTTP, VPC, FunctionCompute and MOCK. Defaults to null.
     * 
     */
    @Import(name="serviceType", required=true)
    private Output<String> serviceType;

    /**
     * @return The type of backend service. Type including HTTP, VPC, FunctionCompute and MOCK. Defaults to null.
     * 
     */
    public Output<String> serviceType() {
        return this.serviceType;
    }

    /**
     * Stages that the api need to be deployed. Valid value: `RELEASE`,`PRE`,`TEST`.
     * 
     */
    @Import(name="stageNames")
    private @Nullable Output<List<String>> stageNames;

    /**
     * @return Stages that the api need to be deployed. Valid value: `RELEASE`,`PRE`,`TEST`.
     * 
     */
    public Optional<Output<List<String>>> stageNames() {
        return Optional.ofNullable(this.stageNames);
    }

    /**
     * system_parameters defines the system parameters of the api. See `system_parameters` below.
     * 
     */
    @Import(name="systemParameters")
    private @Nullable Output<List<ApiSystemParameterArgs>> systemParameters;

    /**
     * @return system_parameters defines the system parameters of the api. See `system_parameters` below.
     * 
     */
    public Optional<Output<List<ApiSystemParameterArgs>>> systemParameters() {
        return Optional.ofNullable(this.systemParameters);
    }

    private ApiArgs() {}

    private ApiArgs(ApiArgs $) {
        this.authType = $.authType;
        this.constantParameters = $.constantParameters;
        this.description = $.description;
        this.fcServiceConfig = $.fcServiceConfig;
        this.forceNonceCheck = $.forceNonceCheck;
        this.groupId = $.groupId;
        this.httpServiceConfig = $.httpServiceConfig;
        this.httpVpcServiceConfig = $.httpVpcServiceConfig;
        this.mockServiceConfig = $.mockServiceConfig;
        this.name = $.name;
        this.requestConfig = $.requestConfig;
        this.requestParameters = $.requestParameters;
        this.serviceType = $.serviceType;
        this.stageNames = $.stageNames;
        this.systemParameters = $.systemParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiArgs $;

        public Builder() {
            $ = new ApiArgs();
        }

        public Builder(ApiArgs defaults) {
            $ = new ApiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authType The authorization Type including APP and ANONYMOUS. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder authType(Output<String> authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param authType The authorization Type including APP and ANONYMOUS. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        /**
         * @param constantParameters constant_parameters defines the constant parameters of the api. See `constant_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder constantParameters(@Nullable Output<List<ApiConstantParameterArgs>> constantParameters) {
            $.constantParameters = constantParameters;
            return this;
        }

        /**
         * @param constantParameters constant_parameters defines the constant parameters of the api. See `constant_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder constantParameters(List<ApiConstantParameterArgs> constantParameters) {
            return constantParameters(Output.of(constantParameters));
        }

        /**
         * @param constantParameters constant_parameters defines the constant parameters of the api. See `constant_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder constantParameters(ApiConstantParameterArgs... constantParameters) {
            return constantParameters(List.of(constantParameters));
        }

        /**
         * @param description The description of the api. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the api. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fcServiceConfig fc_service_config defines the config when service_type selected &#39;FunctionCompute&#39;. See `fc_service_config` below.
         * 
         * @return builder
         * 
         */
        public Builder fcServiceConfig(@Nullable Output<ApiFcServiceConfigArgs> fcServiceConfig) {
            $.fcServiceConfig = fcServiceConfig;
            return this;
        }

        /**
         * @param fcServiceConfig fc_service_config defines the config when service_type selected &#39;FunctionCompute&#39;. See `fc_service_config` below.
         * 
         * @return builder
         * 
         */
        public Builder fcServiceConfig(ApiFcServiceConfigArgs fcServiceConfig) {
            return fcServiceConfig(Output.of(fcServiceConfig));
        }

        /**
         * @param forceNonceCheck Whether to prevent API replay attack. Default value: `false`.
         * 
         * @return builder
         * 
         */
        public Builder forceNonceCheck(@Nullable Output<Boolean> forceNonceCheck) {
            $.forceNonceCheck = forceNonceCheck;
            return this;
        }

        /**
         * @param forceNonceCheck Whether to prevent API replay attack. Default value: `false`.
         * 
         * @return builder
         * 
         */
        public Builder forceNonceCheck(Boolean forceNonceCheck) {
            return forceNonceCheck(Output.of(forceNonceCheck));
        }

        /**
         * @param groupId The api gateway that the api belongs to. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The api gateway that the api belongs to. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param httpServiceConfig http_service_config defines the config when service_type selected &#39;HTTP&#39;. See `http_service_config` below.
         * 
         * @return builder
         * 
         */
        public Builder httpServiceConfig(@Nullable Output<ApiHttpServiceConfigArgs> httpServiceConfig) {
            $.httpServiceConfig = httpServiceConfig;
            return this;
        }

        /**
         * @param httpServiceConfig http_service_config defines the config when service_type selected &#39;HTTP&#39;. See `http_service_config` below.
         * 
         * @return builder
         * 
         */
        public Builder httpServiceConfig(ApiHttpServiceConfigArgs httpServiceConfig) {
            return httpServiceConfig(Output.of(httpServiceConfig));
        }

        /**
         * @param httpVpcServiceConfig http_vpc_service_config defines the config when service_type selected &#39;HTTP-VPC&#39;. See `http_vpc_service_config` below.
         * 
         * @return builder
         * 
         */
        public Builder httpVpcServiceConfig(@Nullable Output<ApiHttpVpcServiceConfigArgs> httpVpcServiceConfig) {
            $.httpVpcServiceConfig = httpVpcServiceConfig;
            return this;
        }

        /**
         * @param httpVpcServiceConfig http_vpc_service_config defines the config when service_type selected &#39;HTTP-VPC&#39;. See `http_vpc_service_config` below.
         * 
         * @return builder
         * 
         */
        public Builder httpVpcServiceConfig(ApiHttpVpcServiceConfigArgs httpVpcServiceConfig) {
            return httpVpcServiceConfig(Output.of(httpVpcServiceConfig));
        }

        /**
         * @param mockServiceConfig http_service_config defines the config when service_type selected &#39;MOCK&#39;. See `mock_service_config` below.
         * 
         * @return builder
         * 
         */
        public Builder mockServiceConfig(@Nullable Output<ApiMockServiceConfigArgs> mockServiceConfig) {
            $.mockServiceConfig = mockServiceConfig;
            return this;
        }

        /**
         * @param mockServiceConfig http_service_config defines the config when service_type selected &#39;MOCK&#39;. See `mock_service_config` below.
         * 
         * @return builder
         * 
         */
        public Builder mockServiceConfig(ApiMockServiceConfigArgs mockServiceConfig) {
            return mockServiceConfig(Output.of(mockServiceConfig));
        }

        /**
         * @param name The name of the api gateway api. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the api gateway api. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param requestConfig Request_config defines how users can send requests to your API. See `request_config` below.
         * 
         * @return builder
         * 
         */
        public Builder requestConfig(Output<ApiRequestConfigArgs> requestConfig) {
            $.requestConfig = requestConfig;
            return this;
        }

        /**
         * @param requestConfig Request_config defines how users can send requests to your API. See `request_config` below.
         * 
         * @return builder
         * 
         */
        public Builder requestConfig(ApiRequestConfigArgs requestConfig) {
            return requestConfig(Output.of(requestConfig));
        }

        /**
         * @param requestParameters request_parameters defines the request parameters of the api. See `request_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder requestParameters(@Nullable Output<List<ApiRequestParameterArgs>> requestParameters) {
            $.requestParameters = requestParameters;
            return this;
        }

        /**
         * @param requestParameters request_parameters defines the request parameters of the api. See `request_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder requestParameters(List<ApiRequestParameterArgs> requestParameters) {
            return requestParameters(Output.of(requestParameters));
        }

        /**
         * @param requestParameters request_parameters defines the request parameters of the api. See `request_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder requestParameters(ApiRequestParameterArgs... requestParameters) {
            return requestParameters(List.of(requestParameters));
        }

        /**
         * @param serviceType The type of backend service. Type including HTTP, VPC, FunctionCompute and MOCK. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder serviceType(Output<String> serviceType) {
            $.serviceType = serviceType;
            return this;
        }

        /**
         * @param serviceType The type of backend service. Type including HTTP, VPC, FunctionCompute and MOCK. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder serviceType(String serviceType) {
            return serviceType(Output.of(serviceType));
        }

        /**
         * @param stageNames Stages that the api need to be deployed. Valid value: `RELEASE`,`PRE`,`TEST`.
         * 
         * @return builder
         * 
         */
        public Builder stageNames(@Nullable Output<List<String>> stageNames) {
            $.stageNames = stageNames;
            return this;
        }

        /**
         * @param stageNames Stages that the api need to be deployed. Valid value: `RELEASE`,`PRE`,`TEST`.
         * 
         * @return builder
         * 
         */
        public Builder stageNames(List<String> stageNames) {
            return stageNames(Output.of(stageNames));
        }

        /**
         * @param stageNames Stages that the api need to be deployed. Valid value: `RELEASE`,`PRE`,`TEST`.
         * 
         * @return builder
         * 
         */
        public Builder stageNames(String... stageNames) {
            return stageNames(List.of(stageNames));
        }

        /**
         * @param systemParameters system_parameters defines the system parameters of the api. See `system_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder systemParameters(@Nullable Output<List<ApiSystemParameterArgs>> systemParameters) {
            $.systemParameters = systemParameters;
            return this;
        }

        /**
         * @param systemParameters system_parameters defines the system parameters of the api. See `system_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder systemParameters(List<ApiSystemParameterArgs> systemParameters) {
            return systemParameters(Output.of(systemParameters));
        }

        /**
         * @param systemParameters system_parameters defines the system parameters of the api. See `system_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder systemParameters(ApiSystemParameterArgs... systemParameters) {
            return systemParameters(List.of(systemParameters));
        }

        public ApiArgs build() {
            if ($.authType == null) {
                throw new MissingRequiredPropertyException("ApiArgs", "authType");
            }
            if ($.description == null) {
                throw new MissingRequiredPropertyException("ApiArgs", "description");
            }
            if ($.groupId == null) {
                throw new MissingRequiredPropertyException("ApiArgs", "groupId");
            }
            if ($.requestConfig == null) {
                throw new MissingRequiredPropertyException("ApiArgs", "requestConfig");
            }
            if ($.serviceType == null) {
                throw new MissingRequiredPropertyException("ApiArgs", "serviceType");
            }
            return $;
        }
    }

}
