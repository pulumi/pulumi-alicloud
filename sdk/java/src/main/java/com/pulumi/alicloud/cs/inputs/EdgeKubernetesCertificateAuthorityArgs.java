// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeKubernetesCertificateAuthorityArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeKubernetesCertificateAuthorityArgs Empty = new EdgeKubernetesCertificateAuthorityArgs();

    /**
     * From version 1.248.0, new DataSource `alicloud.cs.getClusterCredential` is recommended to manage cluster&#39;s kubeconfig, you can also save the certificate_authority.client_cert attribute content of new DataSource `alicloud.cs.getClusterCredential` to an appropriate path(like ~/.kube/client-cert.pem) for replace it.
     * 
     */
    @Import(name="clientCert")
    private @Nullable Output<String> clientCert;

    /**
     * @return From version 1.248.0, new DataSource `alicloud.cs.getClusterCredential` is recommended to manage cluster&#39;s kubeconfig, you can also save the certificate_authority.client_cert attribute content of new DataSource `alicloud.cs.getClusterCredential` to an appropriate path(like ~/.kube/client-cert.pem) for replace it.
     * 
     */
    public Optional<Output<String>> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }

    /**
     * From version 1.248.0, new DataSource `alicloud.cs.getClusterCredential` is recommended to manage cluster&#39;s kubeconfig, you can also save the certificate_authority.client_key attribute content of new DataSource `alicloud.cs.getClusterCredential` to an appropriate path(like ~/.kube/client-key.pem) for replace it.
     * 
     */
    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    /**
     * @return From version 1.248.0, new DataSource `alicloud.cs.getClusterCredential` is recommended to manage cluster&#39;s kubeconfig, you can also save the certificate_authority.client_key attribute content of new DataSource `alicloud.cs.getClusterCredential` to an appropriate path(like ~/.kube/client-key.pem) for replace it.
     * 
     */
    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    /**
     * The base64 encoded cluster certificate data required to communicate with your cluster. Add this to the certificate-authority-data section of the kubeconfig file for your cluster.
     * 
     */
    @Import(name="clusterCert")
    private @Nullable Output<String> clusterCert;

    /**
     * @return The base64 encoded cluster certificate data required to communicate with your cluster. Add this to the certificate-authority-data section of the kubeconfig file for your cluster.
     * 
     */
    public Optional<Output<String>> clusterCert() {
        return Optional.ofNullable(this.clusterCert);
    }

    private EdgeKubernetesCertificateAuthorityArgs() {}

    private EdgeKubernetesCertificateAuthorityArgs(EdgeKubernetesCertificateAuthorityArgs $) {
        this.clientCert = $.clientCert;
        this.clientKey = $.clientKey;
        this.clusterCert = $.clusterCert;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeKubernetesCertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeKubernetesCertificateAuthorityArgs $;

        public Builder() {
            $ = new EdgeKubernetesCertificateAuthorityArgs();
        }

        public Builder(EdgeKubernetesCertificateAuthorityArgs defaults) {
            $ = new EdgeKubernetesCertificateAuthorityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientCert From version 1.248.0, new DataSource `alicloud.cs.getClusterCredential` is recommended to manage cluster&#39;s kubeconfig, you can also save the certificate_authority.client_cert attribute content of new DataSource `alicloud.cs.getClusterCredential` to an appropriate path(like ~/.kube/client-cert.pem) for replace it.
         * 
         * @return builder
         * 
         */
        public Builder clientCert(@Nullable Output<String> clientCert) {
            $.clientCert = clientCert;
            return this;
        }

        /**
         * @param clientCert From version 1.248.0, new DataSource `alicloud.cs.getClusterCredential` is recommended to manage cluster&#39;s kubeconfig, you can also save the certificate_authority.client_cert attribute content of new DataSource `alicloud.cs.getClusterCredential` to an appropriate path(like ~/.kube/client-cert.pem) for replace it.
         * 
         * @return builder
         * 
         */
        public Builder clientCert(String clientCert) {
            return clientCert(Output.of(clientCert));
        }

        /**
         * @param clientKey From version 1.248.0, new DataSource `alicloud.cs.getClusterCredential` is recommended to manage cluster&#39;s kubeconfig, you can also save the certificate_authority.client_key attribute content of new DataSource `alicloud.cs.getClusterCredential` to an appropriate path(like ~/.kube/client-key.pem) for replace it.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        /**
         * @param clientKey From version 1.248.0, new DataSource `alicloud.cs.getClusterCredential` is recommended to manage cluster&#39;s kubeconfig, you can also save the certificate_authority.client_key attribute content of new DataSource `alicloud.cs.getClusterCredential` to an appropriate path(like ~/.kube/client-key.pem) for replace it.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        /**
         * @param clusterCert The base64 encoded cluster certificate data required to communicate with your cluster. Add this to the certificate-authority-data section of the kubeconfig file for your cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterCert(@Nullable Output<String> clusterCert) {
            $.clusterCert = clusterCert;
            return this;
        }

        /**
         * @param clusterCert The base64 encoded cluster certificate data required to communicate with your cluster. Add this to the certificate-authority-data section of the kubeconfig file for your cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterCert(String clusterCert) {
            return clusterCert(Output.of(clusterCert));
        }

        public EdgeKubernetesCertificateAuthorityArgs build() {
            return $;
        }
    }

}
