// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V3CustomDomainCertConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final V3CustomDomainCertConfigArgs Empty = new V3CustomDomainCertConfigArgs();

    /**
     * Certificate Name.
     * 
     */
    @Import(name="certName")
    private @Nullable Output<String> certName;

    /**
     * @return Certificate Name.
     * 
     */
    public Optional<Output<String>> certName() {
        return Optional.ofNullable(this.certName);
    }

    /**
     * PEM format certificate.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return PEM format certificate.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * Private Key in PEM format.
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return Private Key in PEM format.
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    private V3CustomDomainCertConfigArgs() {}

    private V3CustomDomainCertConfigArgs(V3CustomDomainCertConfigArgs $) {
        this.certName = $.certName;
        this.certificate = $.certificate;
        this.privateKey = $.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V3CustomDomainCertConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V3CustomDomainCertConfigArgs $;

        public Builder() {
            $ = new V3CustomDomainCertConfigArgs();
        }

        public Builder(V3CustomDomainCertConfigArgs defaults) {
            $ = new V3CustomDomainCertConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certName Certificate Name.
         * 
         * @return builder
         * 
         */
        public Builder certName(@Nullable Output<String> certName) {
            $.certName = certName;
            return this;
        }

        /**
         * @param certName Certificate Name.
         * 
         * @return builder
         * 
         */
        public Builder certName(String certName) {
            return certName(Output.of(certName));
        }

        /**
         * @param certificate PEM format certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate PEM format certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param privateKey Private Key in PEM format.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey Private Key in PEM format.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public V3CustomDomainCertConfigArgs build() {
            return $;
        }
    }

}