// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBucketsBucketCorsRule {
    /**
     * @return Control whether the headers specified by Access-Control-Request-Headers in the OPTIONS prefetch command are allowed. Each header specified by Access-Control-Request-Headers must match a value in AllowedHeader. Each rule allows up to one wildcard “*” .
     * 
     */
    private List<String> allowedHeaders;
    /**
     * @return Specify the allowed methods for cross-domain requests. Possible values: `GET`, `PUT`, `DELETE`, `POST` and `HEAD`.
     * 
     */
    private List<String> allowedMethods;
    /**
     * @return The origins allowed for cross-domain requests. Multiple elements can be used to specify multiple allowed origins. Each rule allows up to one wildcard &#34;\*&#34;. If &#34;\*&#34; is specified, cross-domain requests of all origins are allowed.
     * 
     */
    private List<String> allowedOrigins;
    /**
     * @return Specify the response headers allowing users to access from an application (for example, a Javascript XMLHttpRequest object). The wildcard &#34;\*&#34; is not allowed.
     * 
     */
    private List<String> exposeHeaders;
    /**
     * @return Specify the cache time for the returned result of a browser prefetch (OPTIONS) request to a specific resource.
     * 
     */
    private Integer maxAgeSeconds;

    private GetBucketsBucketCorsRule() {}
    /**
     * @return Control whether the headers specified by Access-Control-Request-Headers in the OPTIONS prefetch command are allowed. Each header specified by Access-Control-Request-Headers must match a value in AllowedHeader. Each rule allows up to one wildcard “*” .
     * 
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders;
    }
    /**
     * @return Specify the allowed methods for cross-domain requests. Possible values: `GET`, `PUT`, `DELETE`, `POST` and `HEAD`.
     * 
     */
    public List<String> allowedMethods() {
        return this.allowedMethods;
    }
    /**
     * @return The origins allowed for cross-domain requests. Multiple elements can be used to specify multiple allowed origins. Each rule allows up to one wildcard &#34;\*&#34;. If &#34;\*&#34; is specified, cross-domain requests of all origins are allowed.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * @return Specify the response headers allowing users to access from an application (for example, a Javascript XMLHttpRequest object). The wildcard &#34;\*&#34; is not allowed.
     * 
     */
    public List<String> exposeHeaders() {
        return this.exposeHeaders;
    }
    /**
     * @return Specify the cache time for the returned result of a browser prefetch (OPTIONS) request to a specific resource.
     * 
     */
    public Integer maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketsBucketCorsRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedHeaders;
        private List<String> allowedMethods;
        private List<String> allowedOrigins;
        private List<String> exposeHeaders;
        private Integer maxAgeSeconds;
        public Builder() {}
        public Builder(GetBucketsBucketCorsRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAgeSeconds = defaults.maxAgeSeconds;
        }

        @CustomType.Setter
        public Builder allowedHeaders(List<String> allowedHeaders) {
            if (allowedHeaders == null) {
              throw new MissingRequiredPropertyException("GetBucketsBucketCorsRule", "allowedHeaders");
            }
            this.allowedHeaders = allowedHeaders;
            return this;
        }
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }
        @CustomType.Setter
        public Builder allowedMethods(List<String> allowedMethods) {
            if (allowedMethods == null) {
              throw new MissingRequiredPropertyException("GetBucketsBucketCorsRule", "allowedMethods");
            }
            this.allowedMethods = allowedMethods;
            return this;
        }
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }
        @CustomType.Setter
        public Builder allowedOrigins(List<String> allowedOrigins) {
            if (allowedOrigins == null) {
              throw new MissingRequiredPropertyException("GetBucketsBucketCorsRule", "allowedOrigins");
            }
            this.allowedOrigins = allowedOrigins;
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        @CustomType.Setter
        public Builder exposeHeaders(List<String> exposeHeaders) {
            if (exposeHeaders == null) {
              throw new MissingRequiredPropertyException("GetBucketsBucketCorsRule", "exposeHeaders");
            }
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }
        @CustomType.Setter
        public Builder maxAgeSeconds(Integer maxAgeSeconds) {
            if (maxAgeSeconds == null) {
              throw new MissingRequiredPropertyException("GetBucketsBucketCorsRule", "maxAgeSeconds");
            }
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }
        public GetBucketsBucketCorsRule build() {
            final var _resultValue = new GetBucketsBucketCorsRule();
            _resultValue.allowedHeaders = allowedHeaders;
            _resultValue.allowedMethods = allowedMethods;
            _resultValue.allowedOrigins = allowedOrigins;
            _resultValue.exposeHeaders = exposeHeaders;
            _resultValue.maxAgeSeconds = maxAgeSeconds;
            return _resultValue;
        }
    }
}