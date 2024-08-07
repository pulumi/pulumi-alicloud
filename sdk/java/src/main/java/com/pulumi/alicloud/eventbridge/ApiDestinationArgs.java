// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge;

import com.pulumi.alicloud.eventbridge.inputs.ApiDestinationHttpApiParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiDestinationArgs Empty = new ApiDestinationArgs();

    /**
     * The name of the API destination.
     * 
     */
    @Import(name="apiDestinationName", required=true)
    private Output<String> apiDestinationName;

    /**
     * @return The name of the API destination.
     * 
     */
    public Output<String> apiDestinationName() {
        return this.apiDestinationName;
    }

    /**
     * The name of the connection.
     * 
     */
    @Import(name="connectionName", required=true)
    private Output<String> connectionName;

    /**
     * @return The name of the connection.
     * 
     */
    public Output<String> connectionName() {
        return this.connectionName;
    }

    /**
     * The description of the API destination.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the API destination.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The parameters that are configured for the API destination. See `http_api_parameters` below.
     * 
     */
    @Import(name="httpApiParameters", required=true)
    private Output<ApiDestinationHttpApiParametersArgs> httpApiParameters;

    /**
     * @return The parameters that are configured for the API destination. See `http_api_parameters` below.
     * 
     */
    public Output<ApiDestinationHttpApiParametersArgs> httpApiParameters() {
        return this.httpApiParameters;
    }

    private ApiDestinationArgs() {}

    private ApiDestinationArgs(ApiDestinationArgs $) {
        this.apiDestinationName = $.apiDestinationName;
        this.connectionName = $.connectionName;
        this.description = $.description;
        this.httpApiParameters = $.httpApiParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiDestinationArgs $;

        public Builder() {
            $ = new ApiDestinationArgs();
        }

        public Builder(ApiDestinationArgs defaults) {
            $ = new ApiDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiDestinationName The name of the API destination.
         * 
         * @return builder
         * 
         */
        public Builder apiDestinationName(Output<String> apiDestinationName) {
            $.apiDestinationName = apiDestinationName;
            return this;
        }

        /**
         * @param apiDestinationName The name of the API destination.
         * 
         * @return builder
         * 
         */
        public Builder apiDestinationName(String apiDestinationName) {
            return apiDestinationName(Output.of(apiDestinationName));
        }

        /**
         * @param connectionName The name of the connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(Output<String> connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param connectionName The name of the connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            return connectionName(Output.of(connectionName));
        }

        /**
         * @param description The description of the API destination.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the API destination.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param httpApiParameters The parameters that are configured for the API destination. See `http_api_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder httpApiParameters(Output<ApiDestinationHttpApiParametersArgs> httpApiParameters) {
            $.httpApiParameters = httpApiParameters;
            return this;
        }

        /**
         * @param httpApiParameters The parameters that are configured for the API destination. See `http_api_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder httpApiParameters(ApiDestinationHttpApiParametersArgs httpApiParameters) {
            return httpApiParameters(Output.of(httpApiParameters));
        }

        public ApiDestinationArgs build() {
            if ($.apiDestinationName == null) {
                throw new MissingRequiredPropertyException("ApiDestinationArgs", "apiDestinationName");
            }
            if ($.connectionName == null) {
                throw new MissingRequiredPropertyException("ApiDestinationArgs", "connectionName");
            }
            if ($.httpApiParameters == null) {
                throw new MissingRequiredPropertyException("ApiDestinationArgs", "httpApiParameters");
            }
            return $;
        }
    }

}
