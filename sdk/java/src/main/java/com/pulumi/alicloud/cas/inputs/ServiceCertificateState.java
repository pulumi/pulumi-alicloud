// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceCertificateState Empty = new ServiceCertificateState();

    /**
     * Cert of the Certificate in which the Certificate will add.
     * 
     */
    @Import(name="cert")
    private @Nullable Output<String> cert;

    /**
     * @return Cert of the Certificate in which the Certificate will add.
     * 
     */
    public Optional<Output<String>> cert() {
        return Optional.ofNullable(this.cert);
    }

    /**
     * Name of the Certificate. `certificate_name` must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix .sh and .tel are not supported.
     * **NOTE:** One of `certificate_name` and `name` must be specified.
     * 
     */
    @Import(name="certificateName")
    private @Nullable Output<String> certificateName;

    /**
     * @return Name of the Certificate. `certificate_name` must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix .sh and .tel are not supported.
     * **NOTE:** One of `certificate_name` and `name` must be specified.
     * 
     */
    public Optional<Output<String>> certificateName() {
        return Optional.ofNullable(this.certificateName);
    }

    /**
     * Key of the Certificate in which the Certificate will add.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Key of the Certificate in which the Certificate will add.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The lang.
     * 
     */
    @Import(name="lang")
    private @Nullable Output<String> lang;

    /**
     * @return The lang.
     * 
     */
    public Optional<Output<String>> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * It has been deprecated from version 1.129.0 and using `certificate_name` instead.
     * 
     * @deprecated
     * attribute &#39;name&#39; has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute &#39;certificate_name&#39; instead.
     * 
     */
    @Deprecated /* attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead. */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return It has been deprecated from version 1.129.0 and using `certificate_name` instead.
     * 
     * @deprecated
     * attribute &#39;name&#39; has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute &#39;certificate_name&#39; instead.
     * 
     */
    @Deprecated /* attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead. */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ServiceCertificateState() {}

    private ServiceCertificateState(ServiceCertificateState $) {
        this.cert = $.cert;
        this.certificateName = $.certificateName;
        this.key = $.key;
        this.lang = $.lang;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceCertificateState $;

        public Builder() {
            $ = new ServiceCertificateState();
        }

        public Builder(ServiceCertificateState defaults) {
            $ = new ServiceCertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cert Cert of the Certificate in which the Certificate will add.
         * 
         * @return builder
         * 
         */
        public Builder cert(@Nullable Output<String> cert) {
            $.cert = cert;
            return this;
        }

        /**
         * @param cert Cert of the Certificate in which the Certificate will add.
         * 
         * @return builder
         * 
         */
        public Builder cert(String cert) {
            return cert(Output.of(cert));
        }

        /**
         * @param certificateName Name of the Certificate. `certificate_name` must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix .sh and .tel are not supported.
         * **NOTE:** One of `certificate_name` and `name` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(@Nullable Output<String> certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param certificateName Name of the Certificate. `certificate_name` must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix .sh and .tel are not supported.
         * **NOTE:** One of `certificate_name` and `name` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            return certificateName(Output.of(certificateName));
        }

        /**
         * @param key Key of the Certificate in which the Certificate will add.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key of the Certificate in which the Certificate will add.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param lang The lang.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable Output<String> lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param lang The lang.
         * 
         * @return builder
         * 
         */
        public Builder lang(String lang) {
            return lang(Output.of(lang));
        }

        /**
         * @param name It has been deprecated from version 1.129.0 and using `certificate_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * attribute &#39;name&#39; has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute &#39;certificate_name&#39; instead.
         * 
         */
        @Deprecated /* attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead. */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name It has been deprecated from version 1.129.0 and using `certificate_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * attribute &#39;name&#39; has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute &#39;certificate_name&#39; instead.
         * 
         */
        @Deprecated /* attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead. */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ServiceCertificateState build() {
            return $;
        }
    }

}
