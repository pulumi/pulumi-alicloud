// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupUserLogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupUserLogConfigArgs Empty = new GroupUserLogConfigArgs();

    /**
     * The jwt claims to be record, support multi jwt claims split by `,`. Set `*` to record all.
     * 
     */
    @Import(name="jwtClaims")
    private @Nullable Output<String> jwtClaims;

    /**
     * @return The jwt claims to be record, support multi jwt claims split by `,`. Set `*` to record all.
     * 
     */
    public Optional<Output<String>> jwtClaims() {
        return Optional.ofNullable(this.jwtClaims);
    }

    /**
     * The query params to be record, support multi query params split by `,`. Set `*` to record all.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<String> queryString;

    /**
     * @return The query params to be record, support multi query params split by `,`. Set `*` to record all.
     * 
     */
    public Optional<Output<String>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Whether to record the request body.
     * 
     */
    @Import(name="requestBody")
    private @Nullable Output<Boolean> requestBody;

    /**
     * @return Whether to record the request body.
     * 
     */
    public Optional<Output<Boolean>> requestBody() {
        return Optional.ofNullable(this.requestBody);
    }

    /**
     * The request headers to be record, support multi request headers split by `,`. Set `*` to record all.
     * 
     */
    @Import(name="requestHeaders")
    private @Nullable Output<String> requestHeaders;

    /**
     * @return The request headers to be record, support multi request headers split by `,`. Set `*` to record all.
     * 
     */
    public Optional<Output<String>> requestHeaders() {
        return Optional.ofNullable(this.requestHeaders);
    }

    /**
     * Whether to record the response body.
     * 
     */
    @Import(name="responseBody")
    private @Nullable Output<Boolean> responseBody;

    /**
     * @return Whether to record the response body.
     * 
     */
    public Optional<Output<Boolean>> responseBody() {
        return Optional.ofNullable(this.responseBody);
    }

    /**
     * The response headers to be record, support multi response headers split by `,`. Set `*` to record all.
     * 
     */
    @Import(name="responseHeaders")
    private @Nullable Output<String> responseHeaders;

    /**
     * @return The response headers to be record, support multi response headers split by `,`. Set `*` to record all.
     * 
     */
    public Optional<Output<String>> responseHeaders() {
        return Optional.ofNullable(this.responseHeaders);
    }

    private GroupUserLogConfigArgs() {}

    private GroupUserLogConfigArgs(GroupUserLogConfigArgs $) {
        this.jwtClaims = $.jwtClaims;
        this.queryString = $.queryString;
        this.requestBody = $.requestBody;
        this.requestHeaders = $.requestHeaders;
        this.responseBody = $.responseBody;
        this.responseHeaders = $.responseHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupUserLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupUserLogConfigArgs $;

        public Builder() {
            $ = new GroupUserLogConfigArgs();
        }

        public Builder(GroupUserLogConfigArgs defaults) {
            $ = new GroupUserLogConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jwtClaims The jwt claims to be record, support multi jwt claims split by `,`. Set `*` to record all.
         * 
         * @return builder
         * 
         */
        public Builder jwtClaims(@Nullable Output<String> jwtClaims) {
            $.jwtClaims = jwtClaims;
            return this;
        }

        /**
         * @param jwtClaims The jwt claims to be record, support multi jwt claims split by `,`. Set `*` to record all.
         * 
         * @return builder
         * 
         */
        public Builder jwtClaims(String jwtClaims) {
            return jwtClaims(Output.of(jwtClaims));
        }

        /**
         * @param queryString The query params to be record, support multi query params split by `,`. Set `*` to record all.
         * 
         * @return builder
         * 
         */
        public Builder queryString(@Nullable Output<String> queryString) {
            $.queryString = queryString;
            return this;
        }

        /**
         * @param queryString The query params to be record, support multi query params split by `,`. Set `*` to record all.
         * 
         * @return builder
         * 
         */
        public Builder queryString(String queryString) {
            return queryString(Output.of(queryString));
        }

        /**
         * @param requestBody Whether to record the request body.
         * 
         * @return builder
         * 
         */
        public Builder requestBody(@Nullable Output<Boolean> requestBody) {
            $.requestBody = requestBody;
            return this;
        }

        /**
         * @param requestBody Whether to record the request body.
         * 
         * @return builder
         * 
         */
        public Builder requestBody(Boolean requestBody) {
            return requestBody(Output.of(requestBody));
        }

        /**
         * @param requestHeaders The request headers to be record, support multi request headers split by `,`. Set `*` to record all.
         * 
         * @return builder
         * 
         */
        public Builder requestHeaders(@Nullable Output<String> requestHeaders) {
            $.requestHeaders = requestHeaders;
            return this;
        }

        /**
         * @param requestHeaders The request headers to be record, support multi request headers split by `,`. Set `*` to record all.
         * 
         * @return builder
         * 
         */
        public Builder requestHeaders(String requestHeaders) {
            return requestHeaders(Output.of(requestHeaders));
        }

        /**
         * @param responseBody Whether to record the response body.
         * 
         * @return builder
         * 
         */
        public Builder responseBody(@Nullable Output<Boolean> responseBody) {
            $.responseBody = responseBody;
            return this;
        }

        /**
         * @param responseBody Whether to record the response body.
         * 
         * @return builder
         * 
         */
        public Builder responseBody(Boolean responseBody) {
            return responseBody(Output.of(responseBody));
        }

        /**
         * @param responseHeaders The response headers to be record, support multi response headers split by `,`. Set `*` to record all.
         * 
         * @return builder
         * 
         */
        public Builder responseHeaders(@Nullable Output<String> responseHeaders) {
            $.responseHeaders = responseHeaders;
            return this;
        }

        /**
         * @param responseHeaders The response headers to be record, support multi response headers split by `,`. Set `*` to record all.
         * 
         * @return builder
         * 
         */
        public Builder responseHeaders(String responseHeaders) {
            return responseHeaders(Output.of(responseHeaders));
        }

        public GroupUserLogConfigArgs build() {
            return $;
        }
    }

}
