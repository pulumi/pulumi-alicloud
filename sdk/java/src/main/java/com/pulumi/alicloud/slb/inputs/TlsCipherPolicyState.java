// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TlsCipherPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final TlsCipherPolicyState Empty = new TlsCipherPolicyState();

    /**
     * The encryption algorithms supported. It depends on the value of `tls_versions`.
     * 
     */
    @Import(name="ciphers")
    private @Nullable Output<List<String>> ciphers;

    /**
     * @return The encryption algorithms supported. It depends on the value of `tls_versions`.
     * 
     */
    public Optional<Output<List<String>>> ciphers() {
        return Optional.ofNullable(this.ciphers);
    }

    /**
     * TLS policy instance state.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return TLS policy instance state.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * TLS policy name. Length is from 2 to 128, or in both the English and Chinese characters must be with an uppercase/lowercase letter or a Chinese character and the beginning, may contain numbers, in dot `.`, underscore `_` or dash `-`.
     * 
     */
    @Import(name="tlsCipherPolicyName")
    private @Nullable Output<String> tlsCipherPolicyName;

    /**
     * @return TLS policy name. Length is from 2 to 128, or in both the English and Chinese characters must be with an uppercase/lowercase letter or a Chinese character and the beginning, may contain numbers, in dot `.`, underscore `_` or dash `-`.
     * 
     */
    public Optional<Output<String>> tlsCipherPolicyName() {
        return Optional.ofNullable(this.tlsCipherPolicyName);
    }

    /**
     * The version of TLS protocol. You can find the corresponding value description in the document center [What is Tls Cipher Policy](https://www.alibabacloud.com/help/doc-detail/196714.htm).
     * 
     */
    @Import(name="tlsVersions")
    private @Nullable Output<List<String>> tlsVersions;

    /**
     * @return The version of TLS protocol. You can find the corresponding value description in the document center [What is Tls Cipher Policy](https://www.alibabacloud.com/help/doc-detail/196714.htm).
     * 
     */
    public Optional<Output<List<String>>> tlsVersions() {
        return Optional.ofNullable(this.tlsVersions);
    }

    private TlsCipherPolicyState() {}

    private TlsCipherPolicyState(TlsCipherPolicyState $) {
        this.ciphers = $.ciphers;
        this.status = $.status;
        this.tlsCipherPolicyName = $.tlsCipherPolicyName;
        this.tlsVersions = $.tlsVersions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsCipherPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsCipherPolicyState $;

        public Builder() {
            $ = new TlsCipherPolicyState();
        }

        public Builder(TlsCipherPolicyState defaults) {
            $ = new TlsCipherPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param ciphers The encryption algorithms supported. It depends on the value of `tls_versions`.
         * 
         * @return builder
         * 
         */
        public Builder ciphers(@Nullable Output<List<String>> ciphers) {
            $.ciphers = ciphers;
            return this;
        }

        /**
         * @param ciphers The encryption algorithms supported. It depends on the value of `tls_versions`.
         * 
         * @return builder
         * 
         */
        public Builder ciphers(List<String> ciphers) {
            return ciphers(Output.of(ciphers));
        }

        /**
         * @param ciphers The encryption algorithms supported. It depends on the value of `tls_versions`.
         * 
         * @return builder
         * 
         */
        public Builder ciphers(String... ciphers) {
            return ciphers(List.of(ciphers));
        }

        /**
         * @param status TLS policy instance state.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status TLS policy instance state.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tlsCipherPolicyName TLS policy name. Length is from 2 to 128, or in both the English and Chinese characters must be with an uppercase/lowercase letter or a Chinese character and the beginning, may contain numbers, in dot `.`, underscore `_` or dash `-`.
         * 
         * @return builder
         * 
         */
        public Builder tlsCipherPolicyName(@Nullable Output<String> tlsCipherPolicyName) {
            $.tlsCipherPolicyName = tlsCipherPolicyName;
            return this;
        }

        /**
         * @param tlsCipherPolicyName TLS policy name. Length is from 2 to 128, or in both the English and Chinese characters must be with an uppercase/lowercase letter or a Chinese character and the beginning, may contain numbers, in dot `.`, underscore `_` or dash `-`.
         * 
         * @return builder
         * 
         */
        public Builder tlsCipherPolicyName(String tlsCipherPolicyName) {
            return tlsCipherPolicyName(Output.of(tlsCipherPolicyName));
        }

        /**
         * @param tlsVersions The version of TLS protocol. You can find the corresponding value description in the document center [What is Tls Cipher Policy](https://www.alibabacloud.com/help/doc-detail/196714.htm).
         * 
         * @return builder
         * 
         */
        public Builder tlsVersions(@Nullable Output<List<String>> tlsVersions) {
            $.tlsVersions = tlsVersions;
            return this;
        }

        /**
         * @param tlsVersions The version of TLS protocol. You can find the corresponding value description in the document center [What is Tls Cipher Policy](https://www.alibabacloud.com/help/doc-detail/196714.htm).
         * 
         * @return builder
         * 
         */
        public Builder tlsVersions(List<String> tlsVersions) {
            return tlsVersions(Output.of(tlsVersions));
        }

        /**
         * @param tlsVersions The version of TLS protocol. You can find the corresponding value description in the document center [What is Tls Cipher Policy](https://www.alibabacloud.com/help/doc-detail/196714.htm).
         * 
         * @return builder
         * 
         */
        public Builder tlsVersions(String... tlsVersions) {
            return tlsVersions(List.of(tlsVersions));
        }

        public TlsCipherPolicyState build() {
            return $;
        }
    }

}