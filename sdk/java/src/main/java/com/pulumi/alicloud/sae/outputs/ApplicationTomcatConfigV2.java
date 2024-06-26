// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationTomcatConfigV2 {
    /**
     * @return The path.
     * 
     */
    private @Nullable String contextPath;
    /**
     * @return The maximum number of connections in the connection pool.
     * 
     */
    private @Nullable Integer maxThreads;
    /**
     * @return The port.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return The URI encoding scheme in the Tomcat container.
     * 
     */
    private @Nullable String uriEncoding;
    /**
     * @return Specifies whether to use the encoding scheme that is specified by BodyEncoding for URL.
     * 
     */
    private @Nullable String useBodyEncodingForUri;

    private ApplicationTomcatConfigV2() {}
    /**
     * @return The path.
     * 
     */
    public Optional<String> contextPath() {
        return Optional.ofNullable(this.contextPath);
    }
    /**
     * @return The maximum number of connections in the connection pool.
     * 
     */
    public Optional<Integer> maxThreads() {
        return Optional.ofNullable(this.maxThreads);
    }
    /**
     * @return The port.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The URI encoding scheme in the Tomcat container.
     * 
     */
    public Optional<String> uriEncoding() {
        return Optional.ofNullable(this.uriEncoding);
    }
    /**
     * @return Specifies whether to use the encoding scheme that is specified by BodyEncoding for URL.
     * 
     */
    public Optional<String> useBodyEncodingForUri() {
        return Optional.ofNullable(this.useBodyEncodingForUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationTomcatConfigV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String contextPath;
        private @Nullable Integer maxThreads;
        private @Nullable Integer port;
        private @Nullable String uriEncoding;
        private @Nullable String useBodyEncodingForUri;
        public Builder() {}
        public Builder(ApplicationTomcatConfigV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contextPath = defaults.contextPath;
    	      this.maxThreads = defaults.maxThreads;
    	      this.port = defaults.port;
    	      this.uriEncoding = defaults.uriEncoding;
    	      this.useBodyEncodingForUri = defaults.useBodyEncodingForUri;
        }

        @CustomType.Setter
        public Builder contextPath(@Nullable String contextPath) {

            this.contextPath = contextPath;
            return this;
        }
        @CustomType.Setter
        public Builder maxThreads(@Nullable Integer maxThreads) {

            this.maxThreads = maxThreads;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder uriEncoding(@Nullable String uriEncoding) {

            this.uriEncoding = uriEncoding;
            return this;
        }
        @CustomType.Setter
        public Builder useBodyEncodingForUri(@Nullable String useBodyEncodingForUri) {

            this.useBodyEncodingForUri = useBodyEncodingForUri;
            return this;
        }
        public ApplicationTomcatConfigV2 build() {
            final var _resultValue = new ApplicationTomcatConfigV2();
            _resultValue.contextPath = contextPath;
            _resultValue.maxThreads = maxThreads;
            _resultValue.port = port;
            _resultValue.uriEncoding = uriEncoding;
            _resultValue.useBodyEncodingForUri = useBodyEncodingForUri;
            return _resultValue;
        }
    }
}
