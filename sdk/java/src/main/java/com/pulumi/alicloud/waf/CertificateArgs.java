// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.waf;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * Certificate file content.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return Certificate file content.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * The certificate id is automatically generated when you upload your certificate content.**NOTE:** you can also use Certificate ID saved in SSL.
     * 
     */
    @Import(name="certificateId")
    private @Nullable Output<String> certificateId;

    /**
     * @return The certificate id is automatically generated when you upload your certificate content.**NOTE:** you can also use Certificate ID saved in SSL.
     * 
     */
    public Optional<Output<String>> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }

    /**
     * Certificate file name.
     * 
     */
    @Import(name="certificateName")
    private @Nullable Output<String> certificateName;

    /**
     * @return Certificate file name.
     * 
     */
    public Optional<Output<String>> certificateName() {
        return Optional.ofNullable(this.certificateName);
    }

    /**
     * The domain that you want to add to WAF.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The domain that you want to add to WAF.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The ID of the WAF instance.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The ID of the WAF instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * The private key.
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return The private key.
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    private CertificateArgs() {}

    private CertificateArgs(CertificateArgs $) {
        this.certificate = $.certificate;
        this.certificateId = $.certificateId;
        this.certificateName = $.certificateName;
        this.domain = $.domain;
        this.instanceId = $.instanceId;
        this.privateKey = $.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateArgs $;

        public Builder() {
            $ = new CertificateArgs();
        }

        public Builder(CertificateArgs defaults) {
            $ = new CertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate Certificate file content.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate Certificate file content.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param certificateId The certificate id is automatically generated when you upload your certificate content.**NOTE:** you can also use Certificate ID saved in SSL.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(@Nullable Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        /**
         * @param certificateId The certificate id is automatically generated when you upload your certificate content.**NOTE:** you can also use Certificate ID saved in SSL.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        /**
         * @param certificateName Certificate file name.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(@Nullable Output<String> certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param certificateName Certificate file name.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            return certificateName(Output.of(certificateName));
        }

        /**
         * @param domain The domain that you want to add to WAF.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain that you want to add to WAF.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param instanceId The ID of the WAF instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the WAF instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param privateKey The private key.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey The private key.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public CertificateArgs build() {
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("CertificateArgs", "domain");
            }
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("CertificateArgs", "instanceId");
            }
            return $;
        }
    }

}