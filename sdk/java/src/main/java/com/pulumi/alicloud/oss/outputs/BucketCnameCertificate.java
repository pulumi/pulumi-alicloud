// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketCnameCertificate {
    /**
     * @return Certificate Identifier
     * 
     */
    private @Nullable String certId;
    /**
     * @return The certificate public key.
     * 
     */
    private @Nullable String certificate;
    /**
     * @return Certificate creation time
     * 
     */
    private @Nullable String creationDate;
    /**
     * @return Certificate Fingerprint
     * 
     */
    private @Nullable String fingerprint;
    /**
     * @return The certificate private key.
     * 
     */
    private @Nullable String privateKey;
    /**
     * @return Cname status
     * 
     */
    private @Nullable String status;
    /**
     * @return Certificate Type
     * 
     */
    private @Nullable String type;
    /**
     * @return Certificate validity period end time
     * 
     */
    private @Nullable String validEndDate;
    /**
     * @return Certificate validity period start time
     * 
     */
    private @Nullable String validStartDate;

    private BucketCnameCertificate() {}
    /**
     * @return Certificate Identifier
     * 
     */
    public Optional<String> certId() {
        return Optional.ofNullable(this.certId);
    }
    /**
     * @return The certificate public key.
     * 
     */
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * @return Certificate creation time
     * 
     */
    public Optional<String> creationDate() {
        return Optional.ofNullable(this.creationDate);
    }
    /**
     * @return Certificate Fingerprint
     * 
     */
    public Optional<String> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }
    /**
     * @return The certificate private key.
     * 
     */
    public Optional<String> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }
    /**
     * @return Cname status
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Certificate Type
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Certificate validity period end time
     * 
     */
    public Optional<String> validEndDate() {
        return Optional.ofNullable(this.validEndDate);
    }
    /**
     * @return Certificate validity period start time
     * 
     */
    public Optional<String> validStartDate() {
        return Optional.ofNullable(this.validStartDate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCnameCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certId;
        private @Nullable String certificate;
        private @Nullable String creationDate;
        private @Nullable String fingerprint;
        private @Nullable String privateKey;
        private @Nullable String status;
        private @Nullable String type;
        private @Nullable String validEndDate;
        private @Nullable String validStartDate;
        public Builder() {}
        public Builder(BucketCnameCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certId = defaults.certId;
    	      this.certificate = defaults.certificate;
    	      this.creationDate = defaults.creationDate;
    	      this.fingerprint = defaults.fingerprint;
    	      this.privateKey = defaults.privateKey;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.validEndDate = defaults.validEndDate;
    	      this.validStartDate = defaults.validStartDate;
        }

        @CustomType.Setter
        public Builder certId(@Nullable String certId) {

            this.certId = certId;
            return this;
        }
        @CustomType.Setter
        public Builder certificate(@Nullable String certificate) {

            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder creationDate(@Nullable String creationDate) {

            this.creationDate = creationDate;
            return this;
        }
        @CustomType.Setter
        public Builder fingerprint(@Nullable String fingerprint) {

            this.fingerprint = fingerprint;
            return this;
        }
        @CustomType.Setter
        public Builder privateKey(@Nullable String privateKey) {

            this.privateKey = privateKey;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder validEndDate(@Nullable String validEndDate) {

            this.validEndDate = validEndDate;
            return this;
        }
        @CustomType.Setter
        public Builder validStartDate(@Nullable String validStartDate) {

            this.validStartDate = validStartDate;
            return this;
        }
        public BucketCnameCertificate build() {
            final var _resultValue = new BucketCnameCertificate();
            _resultValue.certId = certId;
            _resultValue.certificate = certificate;
            _resultValue.creationDate = creationDate;
            _resultValue.fingerprint = fingerprint;
            _resultValue.privateKey = privateKey;
            _resultValue.status = status;
            _resultValue.type = type;
            _resultValue.validEndDate = validEndDate;
            _resultValue.validStartDate = validStartDate;
            return _resultValue;
        }
    }
}