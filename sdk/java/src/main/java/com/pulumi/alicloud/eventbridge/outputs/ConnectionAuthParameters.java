// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.outputs;

import com.pulumi.alicloud.eventbridge.outputs.ConnectionAuthParametersApiKeyAuthParameters;
import com.pulumi.alicloud.eventbridge.outputs.ConnectionAuthParametersBasicAuthParameters;
import com.pulumi.alicloud.eventbridge.outputs.ConnectionAuthParametersOauthParameters;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionAuthParameters {
    /**
     * @return The parameters that are configured for API key authentication. See `api_key_auth_parameters` below.
     * 
     */
    private @Nullable ConnectionAuthParametersApiKeyAuthParameters apiKeyAuthParameters;
    /**
     * @return The type of the authentication. Valid values: `API_KEY_AUTH`, `BASIC_AUTH`, `OAUTH_AUTH`.
     * 
     */
    private @Nullable String authorizationType;
    /**
     * @return The parameters that are configured for basic authentication. See `basic_auth_parameters` below.
     * 
     */
    private @Nullable ConnectionAuthParametersBasicAuthParameters basicAuthParameters;
    /**
     * @return The parameters that are configured for OAuth authentication. See `oauth_parameters` below.
     * 
     */
    private @Nullable ConnectionAuthParametersOauthParameters oauthParameters;

    private ConnectionAuthParameters() {}
    /**
     * @return The parameters that are configured for API key authentication. See `api_key_auth_parameters` below.
     * 
     */
    public Optional<ConnectionAuthParametersApiKeyAuthParameters> apiKeyAuthParameters() {
        return Optional.ofNullable(this.apiKeyAuthParameters);
    }
    /**
     * @return The type of the authentication. Valid values: `API_KEY_AUTH`, `BASIC_AUTH`, `OAUTH_AUTH`.
     * 
     */
    public Optional<String> authorizationType() {
        return Optional.ofNullable(this.authorizationType);
    }
    /**
     * @return The parameters that are configured for basic authentication. See `basic_auth_parameters` below.
     * 
     */
    public Optional<ConnectionAuthParametersBasicAuthParameters> basicAuthParameters() {
        return Optional.ofNullable(this.basicAuthParameters);
    }
    /**
     * @return The parameters that are configured for OAuth authentication. See `oauth_parameters` below.
     * 
     */
    public Optional<ConnectionAuthParametersOauthParameters> oauthParameters() {
        return Optional.ofNullable(this.oauthParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAuthParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ConnectionAuthParametersApiKeyAuthParameters apiKeyAuthParameters;
        private @Nullable String authorizationType;
        private @Nullable ConnectionAuthParametersBasicAuthParameters basicAuthParameters;
        private @Nullable ConnectionAuthParametersOauthParameters oauthParameters;
        public Builder() {}
        public Builder(ConnectionAuthParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyAuthParameters = defaults.apiKeyAuthParameters;
    	      this.authorizationType = defaults.authorizationType;
    	      this.basicAuthParameters = defaults.basicAuthParameters;
    	      this.oauthParameters = defaults.oauthParameters;
        }

        @CustomType.Setter
        public Builder apiKeyAuthParameters(@Nullable ConnectionAuthParametersApiKeyAuthParameters apiKeyAuthParameters) {

            this.apiKeyAuthParameters = apiKeyAuthParameters;
            return this;
        }
        @CustomType.Setter
        public Builder authorizationType(@Nullable String authorizationType) {

            this.authorizationType = authorizationType;
            return this;
        }
        @CustomType.Setter
        public Builder basicAuthParameters(@Nullable ConnectionAuthParametersBasicAuthParameters basicAuthParameters) {

            this.basicAuthParameters = basicAuthParameters;
            return this;
        }
        @CustomType.Setter
        public Builder oauthParameters(@Nullable ConnectionAuthParametersOauthParameters oauthParameters) {

            this.oauthParameters = oauthParameters;
            return this;
        }
        public ConnectionAuthParameters build() {
            final var _resultValue = new ConnectionAuthParameters();
            _resultValue.apiKeyAuthParameters = apiKeyAuthParameters;
            _resultValue.authorizationType = authorizationType;
            _resultValue.basicAuthParameters = basicAuthParameters;
            _resultValue.oauthParameters = oauthParameters;
            return _resultValue;
        }
    }
}