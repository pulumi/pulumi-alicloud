// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CustomDomainCertConfig {
    /**
     * @return The name of the certificate, used to distinguish different certificates.
     * 
     */
    private String certName;
    /**
     * @return Certificate data of the HTTPS certificates, follow the &#39;pem&#39; format.
     * 
     */
    private String certificate;
    /**
     * @return Private key of the HTTPS certificates, follow the &#39;pem&#39; format.
     * 
     */
    private String privateKey;

    private CustomDomainCertConfig() {}
    /**
     * @return The name of the certificate, used to distinguish different certificates.
     * 
     */
    public String certName() {
        return this.certName;
    }
    /**
     * @return Certificate data of the HTTPS certificates, follow the &#39;pem&#39; format.
     * 
     */
    public String certificate() {
        return this.certificate;
    }
    /**
     * @return Private key of the HTTPS certificates, follow the &#39;pem&#39; format.
     * 
     */
    public String privateKey() {
        return this.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDomainCertConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certName;
        private String certificate;
        private String privateKey;
        public Builder() {}
        public Builder(CustomDomainCertConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certName = defaults.certName;
    	      this.certificate = defaults.certificate;
    	      this.privateKey = defaults.privateKey;
        }

        @CustomType.Setter
        public Builder certName(String certName) {
            if (certName == null) {
              throw new MissingRequiredPropertyException("CustomDomainCertConfig", "certName");
            }
            this.certName = certName;
            return this;
        }
        @CustomType.Setter
        public Builder certificate(String certificate) {
            if (certificate == null) {
              throw new MissingRequiredPropertyException("CustomDomainCertConfig", "certificate");
            }
            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder privateKey(String privateKey) {
            if (privateKey == null) {
              throw new MissingRequiredPropertyException("CustomDomainCertConfig", "privateKey");
            }
            this.privateKey = privateKey;
            return this;
        }
        public CustomDomainCertConfig build() {
            final var _resultValue = new CustomDomainCertConfig();
            _resultValue.certName = certName;
            _resultValue.certificate = certificate;
            _resultValue.privateKey = privateKey;
            return _resultValue;
        }
    }
}