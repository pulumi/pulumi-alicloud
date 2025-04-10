// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ims;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OidcProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final OidcProviderArgs Empty = new OidcProviderArgs();

    /**
     * Client ID.
     * 
     */
    @Import(name="clientIds")
    private @Nullable Output<List<String>> clientIds;

    /**
     * @return Client ID.
     * 
     */
    public Optional<Output<List<String>>> clientIds() {
        return Optional.ofNullable(this.clientIds);
    }

    /**
     * Description of OIDC identity provider.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of OIDC identity provider.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The authentication fingerprint of the HTTPS CA certificate.
     * 
     */
    @Import(name="fingerprints")
    private @Nullable Output<List<String>> fingerprints;

    /**
     * @return The authentication fingerprint of the HTTPS CA certificate.
     * 
     */
    public Optional<Output<List<String>>> fingerprints() {
        return Optional.ofNullable(this.fingerprints);
    }

    /**
     * The earliest time when an external IdP is allowed to issue an ID Token. If the iat field in the ID Token is greater than the current time, the request is rejected.
     * Unit: hours. Value range: 1~168.
     * 
     */
    @Import(name="issuanceLimitTime")
    private @Nullable Output<Integer> issuanceLimitTime;

    /**
     * @return The earliest time when an external IdP is allowed to issue an ID Token. If the iat field in the ID Token is greater than the current time, the request is rejected.
     * Unit: hours. Value range: 1~168.
     * 
     */
    public Optional<Output<Integer>> issuanceLimitTime() {
        return Optional.ofNullable(this.issuanceLimitTime);
    }

    /**
     * The issuer URL of the OIDC identity provider.
     * 
     */
    @Import(name="issuerUrl", required=true)
    private Output<String> issuerUrl;

    /**
     * @return The issuer URL of the OIDC identity provider.
     * 
     */
    public Output<String> issuerUrl() {
        return this.issuerUrl;
    }

    /**
     * The name of the OIDC identity provider.
     * 
     */
    @Import(name="oidcProviderName", required=true)
    private Output<String> oidcProviderName;

    /**
     * @return The name of the OIDC identity provider.
     * 
     */
    public Output<String> oidcProviderName() {
        return this.oidcProviderName;
    }

    private OidcProviderArgs() {}

    private OidcProviderArgs(OidcProviderArgs $) {
        this.clientIds = $.clientIds;
        this.description = $.description;
        this.fingerprints = $.fingerprints;
        this.issuanceLimitTime = $.issuanceLimitTime;
        this.issuerUrl = $.issuerUrl;
        this.oidcProviderName = $.oidcProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OidcProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OidcProviderArgs $;

        public Builder() {
            $ = new OidcProviderArgs();
        }

        public Builder(OidcProviderArgs defaults) {
            $ = new OidcProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientIds Client ID.
         * 
         * @return builder
         * 
         */
        public Builder clientIds(@Nullable Output<List<String>> clientIds) {
            $.clientIds = clientIds;
            return this;
        }

        /**
         * @param clientIds Client ID.
         * 
         * @return builder
         * 
         */
        public Builder clientIds(List<String> clientIds) {
            return clientIds(Output.of(clientIds));
        }

        /**
         * @param clientIds Client ID.
         * 
         * @return builder
         * 
         */
        public Builder clientIds(String... clientIds) {
            return clientIds(List.of(clientIds));
        }

        /**
         * @param description Description of OIDC identity provider.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of OIDC identity provider.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fingerprints The authentication fingerprint of the HTTPS CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder fingerprints(@Nullable Output<List<String>> fingerprints) {
            $.fingerprints = fingerprints;
            return this;
        }

        /**
         * @param fingerprints The authentication fingerprint of the HTTPS CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder fingerprints(List<String> fingerprints) {
            return fingerprints(Output.of(fingerprints));
        }

        /**
         * @param fingerprints The authentication fingerprint of the HTTPS CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder fingerprints(String... fingerprints) {
            return fingerprints(List.of(fingerprints));
        }

        /**
         * @param issuanceLimitTime The earliest time when an external IdP is allowed to issue an ID Token. If the iat field in the ID Token is greater than the current time, the request is rejected.
         * Unit: hours. Value range: 1~168.
         * 
         * @return builder
         * 
         */
        public Builder issuanceLimitTime(@Nullable Output<Integer> issuanceLimitTime) {
            $.issuanceLimitTime = issuanceLimitTime;
            return this;
        }

        /**
         * @param issuanceLimitTime The earliest time when an external IdP is allowed to issue an ID Token. If the iat field in the ID Token is greater than the current time, the request is rejected.
         * Unit: hours. Value range: 1~168.
         * 
         * @return builder
         * 
         */
        public Builder issuanceLimitTime(Integer issuanceLimitTime) {
            return issuanceLimitTime(Output.of(issuanceLimitTime));
        }

        /**
         * @param issuerUrl The issuer URL of the OIDC identity provider.
         * 
         * @return builder
         * 
         */
        public Builder issuerUrl(Output<String> issuerUrl) {
            $.issuerUrl = issuerUrl;
            return this;
        }

        /**
         * @param issuerUrl The issuer URL of the OIDC identity provider.
         * 
         * @return builder
         * 
         */
        public Builder issuerUrl(String issuerUrl) {
            return issuerUrl(Output.of(issuerUrl));
        }

        /**
         * @param oidcProviderName The name of the OIDC identity provider.
         * 
         * @return builder
         * 
         */
        public Builder oidcProviderName(Output<String> oidcProviderName) {
            $.oidcProviderName = oidcProviderName;
            return this;
        }

        /**
         * @param oidcProviderName The name of the OIDC identity provider.
         * 
         * @return builder
         * 
         */
        public Builder oidcProviderName(String oidcProviderName) {
            return oidcProviderName(Output.of(oidcProviderName));
        }

        public OidcProviderArgs build() {
            if ($.issuerUrl == null) {
                throw new MissingRequiredPropertyException("OidcProviderArgs", "issuerUrl");
            }
            if ($.oidcProviderName == null) {
                throw new MissingRequiredPropertyException("OidcProviderArgs", "oidcProviderName");
            }
            return $;
        }
    }

}
