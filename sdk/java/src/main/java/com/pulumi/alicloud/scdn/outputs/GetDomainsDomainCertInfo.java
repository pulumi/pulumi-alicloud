// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.scdn.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainsDomainCertInfo {
    /**
     * @return If You Enable HTTPS Here Certificate Name.
     * 
     */
    private String certName;
    /**
     * @return Certificate Type. Value Range: Upload: Certificate. CAS: Certificate Authority Certificate. Free: Free Certificate.
     * 
     */
    private String certType;
    /**
     * @return Whether to Enable SSL Certificate. Valid Values: on, off.
     * 
     */
    private String sslProtocol;
    /**
     * @return If You Enable HTTPS Here Key.
     * 
     */
    private String sslPub;

    private GetDomainsDomainCertInfo() {}
    /**
     * @return If You Enable HTTPS Here Certificate Name.
     * 
     */
    public String certName() {
        return this.certName;
    }
    /**
     * @return Certificate Type. Value Range: Upload: Certificate. CAS: Certificate Authority Certificate. Free: Free Certificate.
     * 
     */
    public String certType() {
        return this.certType;
    }
    /**
     * @return Whether to Enable SSL Certificate. Valid Values: on, off.
     * 
     */
    public String sslProtocol() {
        return this.sslProtocol;
    }
    /**
     * @return If You Enable HTTPS Here Key.
     * 
     */
    public String sslPub() {
        return this.sslPub;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainsDomainCertInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certName;
        private String certType;
        private String sslProtocol;
        private String sslPub;
        public Builder() {}
        public Builder(GetDomainsDomainCertInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certName = defaults.certName;
    	      this.certType = defaults.certType;
    	      this.sslProtocol = defaults.sslProtocol;
    	      this.sslPub = defaults.sslPub;
        }

        @CustomType.Setter
        public Builder certName(String certName) {
            if (certName == null) {
              throw new MissingRequiredPropertyException("GetDomainsDomainCertInfo", "certName");
            }
            this.certName = certName;
            return this;
        }
        @CustomType.Setter
        public Builder certType(String certType) {
            if (certType == null) {
              throw new MissingRequiredPropertyException("GetDomainsDomainCertInfo", "certType");
            }
            this.certType = certType;
            return this;
        }
        @CustomType.Setter
        public Builder sslProtocol(String sslProtocol) {
            if (sslProtocol == null) {
              throw new MissingRequiredPropertyException("GetDomainsDomainCertInfo", "sslProtocol");
            }
            this.sslProtocol = sslProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder sslPub(String sslPub) {
            if (sslPub == null) {
              throw new MissingRequiredPropertyException("GetDomainsDomainCertInfo", "sslPub");
            }
            this.sslPub = sslPub;
            return this;
        }
        public GetDomainsDomainCertInfo build() {
            final var _resultValue = new GetDomainsDomainCertInfo();
            _resultValue.certName = certName;
            _resultValue.certType = certType;
            _resultValue.sslProtocol = sslProtocol;
            _resultValue.sslPub = sslPub;
            return _resultValue;
        }
    }
}