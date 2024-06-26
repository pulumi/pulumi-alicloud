// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterCredentialCertificateAuthority {
    /**
     * @return The base64 encoded client certificate data required to communicate with your cluster. Add this to the client-certificate-data section of the kube config file for your cluster.
     * 
     */
    private String clientCert;
    /**
     * @return The base64 encoded client key data required to communicate with your cluster. Add this to the client-key-data section of the kube config file for your cluster.
     * 
     */
    private String clientKey;
    /**
     * @return The base64 encoded cluster certificate data required to communicate with your cluster. Add this to the certificate-authority-data section of the kube config file for your cluster.
     * 
     */
    private String clusterCert;

    private GetClusterCredentialCertificateAuthority() {}
    /**
     * @return The base64 encoded client certificate data required to communicate with your cluster. Add this to the client-certificate-data section of the kube config file for your cluster.
     * 
     */
    public String clientCert() {
        return this.clientCert;
    }
    /**
     * @return The base64 encoded client key data required to communicate with your cluster. Add this to the client-key-data section of the kube config file for your cluster.
     * 
     */
    public String clientKey() {
        return this.clientKey;
    }
    /**
     * @return The base64 encoded cluster certificate data required to communicate with your cluster. Add this to the certificate-authority-data section of the kube config file for your cluster.
     * 
     */
    public String clusterCert() {
        return this.clusterCert;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterCredentialCertificateAuthority defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientCert;
        private String clientKey;
        private String clusterCert;
        public Builder() {}
        public Builder(GetClusterCredentialCertificateAuthority defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCert = defaults.clientCert;
    	      this.clientKey = defaults.clientKey;
    	      this.clusterCert = defaults.clusterCert;
        }

        @CustomType.Setter
        public Builder clientCert(String clientCert) {
            if (clientCert == null) {
              throw new MissingRequiredPropertyException("GetClusterCredentialCertificateAuthority", "clientCert");
            }
            this.clientCert = clientCert;
            return this;
        }
        @CustomType.Setter
        public Builder clientKey(String clientKey) {
            if (clientKey == null) {
              throw new MissingRequiredPropertyException("GetClusterCredentialCertificateAuthority", "clientKey");
            }
            this.clientKey = clientKey;
            return this;
        }
        @CustomType.Setter
        public Builder clusterCert(String clusterCert) {
            if (clusterCert == null) {
              throw new MissingRequiredPropertyException("GetClusterCredentialCertificateAuthority", "clusterCert");
            }
            this.clusterCert = clusterCert;
            return this;
        }
        public GetClusterCredentialCertificateAuthority build() {
            final var _resultValue = new GetClusterCredentialCertificateAuthority();
            _resultValue.clientCert = clientCert;
            _resultValue.clientKey = clientKey;
            _resultValue.clusterCert = clusterCert;
            return _resultValue;
        }
    }
}
