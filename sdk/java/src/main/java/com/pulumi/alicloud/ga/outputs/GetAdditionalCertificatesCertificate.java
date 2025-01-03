// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAdditionalCertificatesCertificate {
    /**
     * @return The ID of the GA instance.
     * 
     */
    private String acceleratorId;
    /**
     * @return The Certificate ID.
     * 
     */
    private String certificateId;
    /**
     * @return The domain name specified by the certificate.
     * 
     */
    private String domain;
    /**
     * @return The ID of the Additional Certificate. The value formats as `&lt;accelerator_id&gt;:&lt;listener_id&gt;:&lt;domain&gt;`.
     * 
     */
    private String id;
    /**
     * @return The ID of the listener. Only HTTPS listeners support this parameter.
     * 
     */
    private String listenerId;

    private GetAdditionalCertificatesCertificate() {}
    /**
     * @return The ID of the GA instance.
     * 
     */
    public String acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * @return The Certificate ID.
     * 
     */
    public String certificateId() {
        return this.certificateId;
    }
    /**
     * @return The domain name specified by the certificate.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return The ID of the Additional Certificate. The value formats as `&lt;accelerator_id&gt;:&lt;listener_id&gt;:&lt;domain&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the listener. Only HTTPS listeners support this parameter.
     * 
     */
    public String listenerId() {
        return this.listenerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdditionalCertificatesCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acceleratorId;
        private String certificateId;
        private String domain;
        private String id;
        private String listenerId;
        public Builder() {}
        public Builder(GetAdditionalCertificatesCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorId = defaults.acceleratorId;
    	      this.certificateId = defaults.certificateId;
    	      this.domain = defaults.domain;
    	      this.id = defaults.id;
    	      this.listenerId = defaults.listenerId;
        }

        @CustomType.Setter
        public Builder acceleratorId(String acceleratorId) {
            if (acceleratorId == null) {
              throw new MissingRequiredPropertyException("GetAdditionalCertificatesCertificate", "acceleratorId");
            }
            this.acceleratorId = acceleratorId;
            return this;
        }
        @CustomType.Setter
        public Builder certificateId(String certificateId) {
            if (certificateId == null) {
              throw new MissingRequiredPropertyException("GetAdditionalCertificatesCertificate", "certificateId");
            }
            this.certificateId = certificateId;
            return this;
        }
        @CustomType.Setter
        public Builder domain(String domain) {
            if (domain == null) {
              throw new MissingRequiredPropertyException("GetAdditionalCertificatesCertificate", "domain");
            }
            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAdditionalCertificatesCertificate", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder listenerId(String listenerId) {
            if (listenerId == null) {
              throw new MissingRequiredPropertyException("GetAdditionalCertificatesCertificate", "listenerId");
            }
            this.listenerId = listenerId;
            return this;
        }
        public GetAdditionalCertificatesCertificate build() {
            final var _resultValue = new GetAdditionalCertificatesCertificate();
            _resultValue.acceleratorId = acceleratorId;
            _resultValue.certificateId = certificateId;
            _resultValue.domain = domain;
            _resultValue.id = id;
            _resultValue.listenerId = listenerId;
            return _resultValue;
        }
    }
}
