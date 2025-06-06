// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RecordData {
    /**
     * @return The encryption algorithm used for the record, specified within the range from 0 to 255. This parameter is required when you add CERT or SSHFP records.
     * 
     */
    private @Nullable Integer algorithm;
    /**
     * @return The public key of the certificate. This parameter is required when you add CERT, SMIMEA, or TLSA records.
     * 
     */
    private @Nullable String certificate;
    /**
     * @return The public key fingerprint of the record. This parameter is required when you add a SSHFP record.
     * 
     */
    private @Nullable String fingerprint;
    /**
     * @return The flag bit of the record. The Flag for a CAA record indicates its priority and how it is processed, specified within the range of 0 to 255. This parameter is required when you add a CAA record.
     * 
     */
    private @Nullable Integer flag;
    /**
     * @return The public key identification for the record, specified within the range of 0 to 65,535. This parameter is required when you add a CAA record.
     * 
     */
    private @Nullable Integer keyTag;
    /**
     * @return The algorithm policy used to match or validate the certificate, specified within the range 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
     * 
     */
    private @Nullable Integer matchingType;
    /**
     * @return The port of the record, specified within the range of 0 to 65,535. This parameter is required when you add an SRV record.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return The priority of the record, specified within the range of 0 to 65,535. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, and URI records.
     * 
     */
    private @Nullable Integer priority;
    /**
     * @return The type of certificate or public key, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
     * 
     */
    private @Nullable Integer selector;
    /**
     * @return The label of the record. The Tag of a CAA record indicate its specific type and usage. This parameter is required when you add a CAA record.
     * 
     */
    private @Nullable String tag;
    /**
     * @return The certificate type of the record (in CERT records), or the public key type (in SSHFP records). This parameter is required when you add CERT or SSHFP records.
     * 
     */
    private @Nullable Integer type;
    /**
     * @return The usage identifier of the record, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
     * 
     */
    private @Nullable Integer usage;
    /**
     * @return The record value or part of the record content. This parameter is required when you add A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. It has different meanings based on different types of records:
     * 
     * - **A/AAAA**: the IP address(es). Separate multiple IPs with commas (,). You must have at least one IPv4 address.
     * - `CNAME`: the target domain name.
     * - `NS`: the name servers for the domain name.
     * - `MX`: a valid domain name of the target mail server.
     * - `TXT`: a valid text string.
     * - `CAA`: a valid domain name of the certificate authority.
     * - `SRV`: a valid domain name of the target host.
     * - `URI`: a valid URI string.
     * 
     */
    private @Nullable String value;
    /**
     * @return The weight of the record, specified within the range of 0 to 65,535. This parameter is required when you add SRV or URI records.
     * 
     */
    private @Nullable Integer weight;

    private RecordData() {}
    /**
     * @return The encryption algorithm used for the record, specified within the range from 0 to 255. This parameter is required when you add CERT or SSHFP records.
     * 
     */
    public Optional<Integer> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    /**
     * @return The public key of the certificate. This parameter is required when you add CERT, SMIMEA, or TLSA records.
     * 
     */
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * @return The public key fingerprint of the record. This parameter is required when you add a SSHFP record.
     * 
     */
    public Optional<String> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }
    /**
     * @return The flag bit of the record. The Flag for a CAA record indicates its priority and how it is processed, specified within the range of 0 to 255. This parameter is required when you add a CAA record.
     * 
     */
    public Optional<Integer> flag() {
        return Optional.ofNullable(this.flag);
    }
    /**
     * @return The public key identification for the record, specified within the range of 0 to 65,535. This parameter is required when you add a CAA record.
     * 
     */
    public Optional<Integer> keyTag() {
        return Optional.ofNullable(this.keyTag);
    }
    /**
     * @return The algorithm policy used to match or validate the certificate, specified within the range 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
     * 
     */
    public Optional<Integer> matchingType() {
        return Optional.ofNullable(this.matchingType);
    }
    /**
     * @return The port of the record, specified within the range of 0 to 65,535. This parameter is required when you add an SRV record.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The priority of the record, specified within the range of 0 to 65,535. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, and URI records.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return The type of certificate or public key, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
     * 
     */
    public Optional<Integer> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return The label of the record. The Tag of a CAA record indicate its specific type and usage. This parameter is required when you add a CAA record.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }
    /**
     * @return The certificate type of the record (in CERT records), or the public key type (in SSHFP records). This parameter is required when you add CERT or SSHFP records.
     * 
     */
    public Optional<Integer> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The usage identifier of the record, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
     * 
     */
    public Optional<Integer> usage() {
        return Optional.ofNullable(this.usage);
    }
    /**
     * @return The record value or part of the record content. This parameter is required when you add A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. It has different meanings based on different types of records:
     * 
     * - **A/AAAA**: the IP address(es). Separate multiple IPs with commas (,). You must have at least one IPv4 address.
     * - `CNAME`: the target domain name.
     * - `NS`: the name servers for the domain name.
     * - `MX`: a valid domain name of the target mail server.
     * - `TXT`: a valid text string.
     * - `CAA`: a valid domain name of the certificate authority.
     * - `SRV`: a valid domain name of the target host.
     * - `URI`: a valid URI string.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }
    /**
     * @return The weight of the record, specified within the range of 0 to 65,535. This parameter is required when you add SRV or URI records.
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer algorithm;
        private @Nullable String certificate;
        private @Nullable String fingerprint;
        private @Nullable Integer flag;
        private @Nullable Integer keyTag;
        private @Nullable Integer matchingType;
        private @Nullable Integer port;
        private @Nullable Integer priority;
        private @Nullable Integer selector;
        private @Nullable String tag;
        private @Nullable Integer type;
        private @Nullable Integer usage;
        private @Nullable String value;
        private @Nullable Integer weight;
        public Builder() {}
        public Builder(RecordData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.certificate = defaults.certificate;
    	      this.fingerprint = defaults.fingerprint;
    	      this.flag = defaults.flag;
    	      this.keyTag = defaults.keyTag;
    	      this.matchingType = defaults.matchingType;
    	      this.port = defaults.port;
    	      this.priority = defaults.priority;
    	      this.selector = defaults.selector;
    	      this.tag = defaults.tag;
    	      this.type = defaults.type;
    	      this.usage = defaults.usage;
    	      this.value = defaults.value;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder algorithm(@Nullable Integer algorithm) {

            this.algorithm = algorithm;
            return this;
        }
        @CustomType.Setter
        public Builder certificate(@Nullable String certificate) {

            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder fingerprint(@Nullable String fingerprint) {

            this.fingerprint = fingerprint;
            return this;
        }
        @CustomType.Setter
        public Builder flag(@Nullable Integer flag) {

            this.flag = flag;
            return this;
        }
        @CustomType.Setter
        public Builder keyTag(@Nullable Integer keyTag) {

            this.keyTag = keyTag;
            return this;
        }
        @CustomType.Setter
        public Builder matchingType(@Nullable Integer matchingType) {

            this.matchingType = matchingType;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable Integer priority) {

            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable Integer selector) {

            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder tag(@Nullable String tag) {

            this.tag = tag;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable Integer type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder usage(@Nullable Integer usage) {

            this.usage = usage;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder weight(@Nullable Integer weight) {

            this.weight = weight;
            return this;
        }
        public RecordData build() {
            final var _resultValue = new RecordData();
            _resultValue.algorithm = algorithm;
            _resultValue.certificate = certificate;
            _resultValue.fingerprint = fingerprint;
            _resultValue.flag = flag;
            _resultValue.keyTag = keyTag;
            _resultValue.matchingType = matchingType;
            _resultValue.port = port;
            _resultValue.priority = priority;
            _resultValue.selector = selector;
            _resultValue.tag = tag;
            _resultValue.type = type;
            _resultValue.usage = usage;
            _resultValue.value = value;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
