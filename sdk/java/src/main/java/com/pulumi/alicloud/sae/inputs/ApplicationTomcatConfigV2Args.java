// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationTomcatConfigV2Args extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationTomcatConfigV2Args Empty = new ApplicationTomcatConfigV2Args();

    /**
     * The path.
     * 
     */
    @Import(name="contextPath")
    private @Nullable Output<String> contextPath;

    /**
     * @return The path.
     * 
     */
    public Optional<Output<String>> contextPath() {
        return Optional.ofNullable(this.contextPath);
    }

    /**
     * The maximum number of connections in the connection pool.
     * 
     */
    @Import(name="maxThreads")
    private @Nullable Output<Integer> maxThreads;

    /**
     * @return The maximum number of connections in the connection pool.
     * 
     */
    public Optional<Output<Integer>> maxThreads() {
        return Optional.ofNullable(this.maxThreads);
    }

    /**
     * The port.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The URI encoding scheme in the Tomcat container.
     * 
     */
    @Import(name="uriEncoding")
    private @Nullable Output<String> uriEncoding;

    /**
     * @return The URI encoding scheme in the Tomcat container.
     * 
     */
    public Optional<Output<String>> uriEncoding() {
        return Optional.ofNullable(this.uriEncoding);
    }

    /**
     * Specifies whether to use the encoding scheme that is specified by BodyEncoding for URL.
     * 
     */
    @Import(name="useBodyEncodingForUri")
    private @Nullable Output<String> useBodyEncodingForUri;

    /**
     * @return Specifies whether to use the encoding scheme that is specified by BodyEncoding for URL.
     * 
     */
    public Optional<Output<String>> useBodyEncodingForUri() {
        return Optional.ofNullable(this.useBodyEncodingForUri);
    }

    private ApplicationTomcatConfigV2Args() {}

    private ApplicationTomcatConfigV2Args(ApplicationTomcatConfigV2Args $) {
        this.contextPath = $.contextPath;
        this.maxThreads = $.maxThreads;
        this.port = $.port;
        this.uriEncoding = $.uriEncoding;
        this.useBodyEncodingForUri = $.useBodyEncodingForUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationTomcatConfigV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationTomcatConfigV2Args $;

        public Builder() {
            $ = new ApplicationTomcatConfigV2Args();
        }

        public Builder(ApplicationTomcatConfigV2Args defaults) {
            $ = new ApplicationTomcatConfigV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param contextPath The path.
         * 
         * @return builder
         * 
         */
        public Builder contextPath(@Nullable Output<String> contextPath) {
            $.contextPath = contextPath;
            return this;
        }

        /**
         * @param contextPath The path.
         * 
         * @return builder
         * 
         */
        public Builder contextPath(String contextPath) {
            return contextPath(Output.of(contextPath));
        }

        /**
         * @param maxThreads The maximum number of connections in the connection pool.
         * 
         * @return builder
         * 
         */
        public Builder maxThreads(@Nullable Output<Integer> maxThreads) {
            $.maxThreads = maxThreads;
            return this;
        }

        /**
         * @param maxThreads The maximum number of connections in the connection pool.
         * 
         * @return builder
         * 
         */
        public Builder maxThreads(Integer maxThreads) {
            return maxThreads(Output.of(maxThreads));
        }

        /**
         * @param port The port.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param uriEncoding The URI encoding scheme in the Tomcat container.
         * 
         * @return builder
         * 
         */
        public Builder uriEncoding(@Nullable Output<String> uriEncoding) {
            $.uriEncoding = uriEncoding;
            return this;
        }

        /**
         * @param uriEncoding The URI encoding scheme in the Tomcat container.
         * 
         * @return builder
         * 
         */
        public Builder uriEncoding(String uriEncoding) {
            return uriEncoding(Output.of(uriEncoding));
        }

        /**
         * @param useBodyEncodingForUri Specifies whether to use the encoding scheme that is specified by BodyEncoding for URL.
         * 
         * @return builder
         * 
         */
        public Builder useBodyEncodingForUri(@Nullable Output<String> useBodyEncodingForUri) {
            $.useBodyEncodingForUri = useBodyEncodingForUri;
            return this;
        }

        /**
         * @param useBodyEncodingForUri Specifies whether to use the encoding scheme that is specified by BodyEncoding for URL.
         * 
         * @return builder
         * 
         */
        public Builder useBodyEncodingForUri(String useBodyEncodingForUri) {
            return useBodyEncodingForUri(Output.of(useBodyEncodingForUri));
        }

        public ApplicationTomcatConfigV2Args build() {
            return $;
        }
    }

}