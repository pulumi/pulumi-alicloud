// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SslVpnClientCertState extends com.pulumi.resources.ResourceArgs {

    public static final SslVpnClientCertState Empty = new SslVpnClientCertState();

    /**
     * The client ca cert.
     * 
     */
    @Import(name="caCert")
    private @Nullable Output<String> caCert;

    /**
     * @return The client ca cert.
     * 
     */
    public Optional<Output<String>> caCert() {
        return Optional.ofNullable(this.caCert);
    }

    /**
     * The client cert.
     * 
     */
    @Import(name="clientCert")
    private @Nullable Output<String> clientCert;

    /**
     * @return The client cert.
     * 
     */
    public Optional<Output<String>> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }

    /**
     * The vpn client config.
     * 
     */
    @Import(name="clientConfig")
    private @Nullable Output<String> clientConfig;

    /**
     * @return The vpn client config.
     * 
     */
    public Optional<Output<String>> clientConfig() {
        return Optional.ofNullable(this.clientConfig);
    }

    /**
     * The client key.
     * 
     */
    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    /**
     * @return The client key.
     * 
     */
    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    /**
     * The name of the client certificate.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the client certificate.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the SSL-VPN server.
     * 
     */
    @Import(name="sslVpnServerId")
    private @Nullable Output<String> sslVpnServerId;

    /**
     * @return The ID of the SSL-VPN server.
     * 
     */
    public Optional<Output<String>> sslVpnServerId() {
        return Optional.ofNullable(this.sslVpnServerId);
    }

    /**
     * The status of the client certificate.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the client certificate.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private SslVpnClientCertState() {}

    private SslVpnClientCertState(SslVpnClientCertState $) {
        this.caCert = $.caCert;
        this.clientCert = $.clientCert;
        this.clientConfig = $.clientConfig;
        this.clientKey = $.clientKey;
        this.name = $.name;
        this.sslVpnServerId = $.sslVpnServerId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SslVpnClientCertState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SslVpnClientCertState $;

        public Builder() {
            $ = new SslVpnClientCertState();
        }

        public Builder(SslVpnClientCertState defaults) {
            $ = new SslVpnClientCertState(Objects.requireNonNull(defaults));
        }

        /**
         * @param caCert The client ca cert.
         * 
         * @return builder
         * 
         */
        public Builder caCert(@Nullable Output<String> caCert) {
            $.caCert = caCert;
            return this;
        }

        /**
         * @param caCert The client ca cert.
         * 
         * @return builder
         * 
         */
        public Builder caCert(String caCert) {
            return caCert(Output.of(caCert));
        }

        /**
         * @param clientCert The client cert.
         * 
         * @return builder
         * 
         */
        public Builder clientCert(@Nullable Output<String> clientCert) {
            $.clientCert = clientCert;
            return this;
        }

        /**
         * @param clientCert The client cert.
         * 
         * @return builder
         * 
         */
        public Builder clientCert(String clientCert) {
            return clientCert(Output.of(clientCert));
        }

        /**
         * @param clientConfig The vpn client config.
         * 
         * @return builder
         * 
         */
        public Builder clientConfig(@Nullable Output<String> clientConfig) {
            $.clientConfig = clientConfig;
            return this;
        }

        /**
         * @param clientConfig The vpn client config.
         * 
         * @return builder
         * 
         */
        public Builder clientConfig(String clientConfig) {
            return clientConfig(Output.of(clientConfig));
        }

        /**
         * @param clientKey The client key.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        /**
         * @param clientKey The client key.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        /**
         * @param name The name of the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sslVpnServerId The ID of the SSL-VPN server.
         * 
         * @return builder
         * 
         */
        public Builder sslVpnServerId(@Nullable Output<String> sslVpnServerId) {
            $.sslVpnServerId = sslVpnServerId;
            return this;
        }

        /**
         * @param sslVpnServerId The ID of the SSL-VPN server.
         * 
         * @return builder
         * 
         */
        public Builder sslVpnServerId(String sslVpnServerId) {
            return sslVpnServerId(Output.of(sslVpnServerId));
        }

        /**
         * @param status The status of the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public SslVpnClientCertState build() {
            return $;
        }
    }

}
