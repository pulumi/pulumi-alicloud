// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateState extends com.pulumi.resources.ResourceArgs {

    public static final CertificateState Empty = new CertificateState();

    /**
     * The certificate ID on Certificate Management Service.
     * 
     */
    @Import(name="casId")
    private @Nullable Output<String> casId;

    /**
     * @return The certificate ID on Certificate Management Service.
     * 
     */
    public Optional<Output<String>> casId() {
        return Optional.ofNullable(this.casId);
    }

    /**
     * The certificate ID on ESA.
     * 
     */
    @Import(name="certId")
    private @Nullable Output<String> certId;

    /**
     * @return The certificate ID on ESA.
     * 
     */
    public Optional<Output<String>> certId() {
        return Optional.ofNullable(this.certId);
    }

    /**
     * The certificate name.
     * 
     */
    @Import(name="certName")
    private @Nullable Output<String> certName;

    /**
     * @return The certificate name.
     * 
     */
    public Optional<Output<String>> certName() {
        return Optional.ofNullable(this.certName);
    }

    /**
     * The certificate content.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return The certificate content.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * Creation time.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Creation time.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The certificate ID on Certificate Management Service. Valid values:
     * - free: a free certificate.
     * - cas: a certificate purchased by using Certificate Management Service.
     * - upload: a custom certificate that you upload.
     * 
     */
    @Import(name="createdType")
    private @Nullable Output<String> createdType;

    /**
     * @return The certificate ID on Certificate Management Service. Valid values:
     * - free: a free certificate.
     * - cas: a certificate purchased by using Certificate Management Service.
     * - upload: a custom certificate that you upload.
     * 
     */
    public Optional<Output<String>> createdType() {
        return Optional.ofNullable(this.createdType);
    }

    /**
     * The Subject Alternative Name (SAN) of the certificate.
     * 
     */
    @Import(name="domains")
    private @Nullable Output<String> domains;

    /**
     * @return The Subject Alternative Name (SAN) of the certificate.
     * 
     */
    public Optional<Output<String>> domains() {
        return Optional.ofNullable(this.domains);
    }

    /**
     * The certificate content.
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return The certificate content.
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * The private key of the certificate.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The private key of the certificate.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Site ID, which can be obtained by calling the [ListSites](https://www.alibabacloud.com/help/en/doc-detail/2850189.html) interface.
     * 
     */
    @Import(name="siteId")
    private @Nullable Output<Integer> siteId;

    /**
     * @return Site ID, which can be obtained by calling the [ListSites](https://www.alibabacloud.com/help/en/doc-detail/2850189.html) interface.
     * 
     */
    public Optional<Output<Integer>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    /**
     * Certificate status.(within 30 days).- issued.- applying.- application failed.- canceled.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Certificate status.(within 30 days).- issued.- applying.- application failed.- canceled.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The certificate type. Valid values:
     * - cas: a certificate purchased by using Certificate Management Service.
     * - upload: a custom certificate that you upload.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The certificate type. Valid values:
     * - cas: a certificate purchased by using Certificate Management Service.
     * - upload: a custom certificate that you upload.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private CertificateState() {}

    private CertificateState(CertificateState $) {
        this.casId = $.casId;
        this.certId = $.certId;
        this.certName = $.certName;
        this.certificate = $.certificate;
        this.createTime = $.createTime;
        this.createdType = $.createdType;
        this.domains = $.domains;
        this.privateKey = $.privateKey;
        this.region = $.region;
        this.siteId = $.siteId;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateState $;

        public Builder() {
            $ = new CertificateState();
        }

        public Builder(CertificateState defaults) {
            $ = new CertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param casId The certificate ID on Certificate Management Service.
         * 
         * @return builder
         * 
         */
        public Builder casId(@Nullable Output<String> casId) {
            $.casId = casId;
            return this;
        }

        /**
         * @param casId The certificate ID on Certificate Management Service.
         * 
         * @return builder
         * 
         */
        public Builder casId(String casId) {
            return casId(Output.of(casId));
        }

        /**
         * @param certId The certificate ID on ESA.
         * 
         * @return builder
         * 
         */
        public Builder certId(@Nullable Output<String> certId) {
            $.certId = certId;
            return this;
        }

        /**
         * @param certId The certificate ID on ESA.
         * 
         * @return builder
         * 
         */
        public Builder certId(String certId) {
            return certId(Output.of(certId));
        }

        /**
         * @param certName The certificate name.
         * 
         * @return builder
         * 
         */
        public Builder certName(@Nullable Output<String> certName) {
            $.certName = certName;
            return this;
        }

        /**
         * @param certName The certificate name.
         * 
         * @return builder
         * 
         */
        public Builder certName(String certName) {
            return certName(Output.of(certName));
        }

        /**
         * @param certificate The certificate content.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate The certificate content.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param createTime Creation time.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Creation time.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param createdType The certificate ID on Certificate Management Service. Valid values:
         * - free: a free certificate.
         * - cas: a certificate purchased by using Certificate Management Service.
         * - upload: a custom certificate that you upload.
         * 
         * @return builder
         * 
         */
        public Builder createdType(@Nullable Output<String> createdType) {
            $.createdType = createdType;
            return this;
        }

        /**
         * @param createdType The certificate ID on Certificate Management Service. Valid values:
         * - free: a free certificate.
         * - cas: a certificate purchased by using Certificate Management Service.
         * - upload: a custom certificate that you upload.
         * 
         * @return builder
         * 
         */
        public Builder createdType(String createdType) {
            return createdType(Output.of(createdType));
        }

        /**
         * @param domains The Subject Alternative Name (SAN) of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder domains(@Nullable Output<String> domains) {
            $.domains = domains;
            return this;
        }

        /**
         * @param domains The Subject Alternative Name (SAN) of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder domains(String domains) {
            return domains(Output.of(domains));
        }

        /**
         * @param privateKey The certificate content.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey The certificate content.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param region The private key of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The private key of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param siteId Site ID, which can be obtained by calling the [ListSites](https://www.alibabacloud.com/help/en/doc-detail/2850189.html) interface.
         * 
         * @return builder
         * 
         */
        public Builder siteId(@Nullable Output<Integer> siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteId Site ID, which can be obtained by calling the [ListSites](https://www.alibabacloud.com/help/en/doc-detail/2850189.html) interface.
         * 
         * @return builder
         * 
         */
        public Builder siteId(Integer siteId) {
            return siteId(Output.of(siteId));
        }

        /**
         * @param status Certificate status.(within 30 days).- issued.- applying.- application failed.- canceled.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Certificate status.(within 30 days).- issued.- applying.- application failed.- canceled.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type The certificate type. Valid values:
         * - cas: a certificate purchased by using Certificate Management Service.
         * - upload: a custom certificate that you upload.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The certificate type. Valid values:
         * - cas: a certificate purchased by using Certificate Management Service.
         * - upload: a custom certificate that you upload.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CertificateState build() {
            return $;
        }
    }

}
