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


public final class HttpsBasicConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final HttpsBasicConfigurationState Empty = new HttpsBasicConfigurationState();

    /**
     * Custom cipher suite, indicating the specific encryption algorithm selected when CiphersuiteGroup is set to custom.
     * 
     */
    @Import(name="ciphersuite")
    private @Nullable Output<String> ciphersuite;

    /**
     * @return Custom cipher suite, indicating the specific encryption algorithm selected when CiphersuiteGroup is set to custom.
     * 
     */
    public Optional<Output<String>> ciphersuite() {
        return Optional.ofNullable(this.ciphersuite);
    }

    /**
     * Cipher suite group. Default is all cipher suites. Possible values:
     * - all: All cipher suites.
     * - strict: Strong cipher suites.
     * - custom: Custom cipher suites.
     * 
     */
    @Import(name="ciphersuiteGroup")
    private @Nullable Output<String> ciphersuiteGroup;

    /**
     * @return Cipher suite group. Default is all cipher suites. Possible values:
     * - all: All cipher suites.
     * - strict: Strong cipher suites.
     * - custom: Custom cipher suites.
     * 
     */
    public Optional<Output<String>> ciphersuiteGroup() {
        return Optional.ofNullable(this.ciphersuiteGroup);
    }

    /**
     * ConfigId of the configuration, which can be obtained by calling the [ListHttpsBasicConfigurations](https://www.alibabacloud.com/help/en/doc-detail/2867470.html) interface.
     * 
     */
    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    /**
     * @return ConfigId of the configuration, which can be obtained by calling the [ListHttpsBasicConfigurations](https://www.alibabacloud.com/help/en/doc-detail/2867470.html) interface.
     * 
     */
    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    /**
     * Indicates whether HTTP2 is enabled. Default is on. Possible values:
     * - on: Enabled.
     * - off: Disabled.
     * 
     */
    @Import(name="http2")
    private @Nullable Output<String> http2;

    /**
     * @return Indicates whether HTTP2 is enabled. Default is on. Possible values:
     * - on: Enabled.
     * - off: Disabled.
     * 
     */
    public Optional<Output<String>> http2() {
        return Optional.ofNullable(this.http2);
    }

    /**
     * Whether to enable HTTP3, which is enabled by default. The value can be:
     * - on: Enabled.
     * - off: Disabled.
     * 
     */
    @Import(name="http3")
    private @Nullable Output<String> http3;

    /**
     * @return Whether to enable HTTP3, which is enabled by default. The value can be:
     * - on: Enabled.
     * - off: Disabled.
     * 
     */
    public Optional<Output<String>> http3() {
        return Optional.ofNullable(this.http3);
    }

    /**
     * Whether to enable HTTPS. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     * 
     */
    @Import(name="https")
    private @Nullable Output<String> https;

    /**
     * @return Whether to enable HTTPS. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     * 
     */
    public Optional<Output<String>> https() {
        return Optional.ofNullable(this.https);
    }

    /**
     * Indicates whether OCSP is enabled. Default is off. Possible values:
     * - on: Enabled.
     * - off: Disabled.
     * 
     */
    @Import(name="ocspStapling")
    private @Nullable Output<String> ocspStapling;

    /**
     * @return Indicates whether OCSP is enabled. Default is off. Possible values:
     * - on: Enabled.
     * - off: Disabled.
     * 
     */
    public Optional<Output<String>> ocspStapling() {
        return Optional.ofNullable(this.ocspStapling);
    }

    /**
     * Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
     * -  Match all incoming requests: value set to true
     * -  Match specified request: Set the value to a custom expression, for example: (http.host eq \&#34;video.example.com\&#34;)
     * 
     */
    @Import(name="rule")
    private @Nullable Output<String> rule;

    /**
     * @return Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
     * -  Match all incoming requests: value set to true
     * -  Match specified request: Set the value to a custom expression, for example: (http.host eq \&#34;video.example.com\&#34;)
     * 
     */
    public Optional<Output<String>> rule() {
        return Optional.ofNullable(this.rule);
    }

    /**
     * Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
     * - on: open.
     * - off: close.
     * 
     */
    @Import(name="ruleEnable")
    private @Nullable Output<String> ruleEnable;

    /**
     * @return Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
     * - on: open.
     * - off: close.
     * 
     */
    public Optional<Output<String>> ruleEnable() {
        return Optional.ofNullable(this.ruleEnable);
    }

    /**
     * Rule name. When adding global configuration, this parameter does not need to be set.
     * 
     */
    @Import(name="ruleName")
    private @Nullable Output<String> ruleName;

    /**
     * @return Rule name. When adding global configuration, this parameter does not need to be set.
     * 
     */
    public Optional<Output<String>> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }

    /**
     * Site ID, which can be obtained by calling the [ListSites](https://next.api.alibabacloud.com/document/ESA/2024-09-10/ListSites) interface.
     * 
     */
    @Import(name="siteId")
    private @Nullable Output<Integer> siteId;

    /**
     * @return Site ID, which can be obtained by calling the [ListSites](https://next.api.alibabacloud.com/document/ESA/2024-09-10/ListSites) interface.
     * 
     */
    public Optional<Output<Integer>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    /**
     * Whether to enable TLS1.0. Default is disabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     * 
     */
    @Import(name="tls10")
    private @Nullable Output<String> tls10;

    /**
     * @return Whether to enable TLS1.0. Default is disabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     * 
     */
    public Optional<Output<String>> tls10() {
        return Optional.ofNullable(this.tls10);
    }

    /**
     * Whether to enable TLS1.1. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     * 
     */
    @Import(name="tls11")
    private @Nullable Output<String> tls11;

    /**
     * @return Whether to enable TLS1.1. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     * 
     */
    public Optional<Output<String>> tls11() {
        return Optional.ofNullable(this.tls11);
    }

    /**
     * Whether to enable TLS1.2. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     * 
     */
    @Import(name="tls12")
    private @Nullable Output<String> tls12;

    /**
     * @return Whether to enable TLS1.2. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     * 
     */
    public Optional<Output<String>> tls12() {
        return Optional.ofNullable(this.tls12);
    }

    /**
     * Whether to enable TLS1.3. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     * 
     */
    @Import(name="tls13")
    private @Nullable Output<String> tls13;

    /**
     * @return Whether to enable TLS1.3. Default is enabled. Possible values:
     * - on: Enable.
     * - off: Disable.
     * 
     */
    public Optional<Output<String>> tls13() {
        return Optional.ofNullable(this.tls13);
    }

    private HttpsBasicConfigurationState() {}

    private HttpsBasicConfigurationState(HttpsBasicConfigurationState $) {
        this.ciphersuite = $.ciphersuite;
        this.ciphersuiteGroup = $.ciphersuiteGroup;
        this.configId = $.configId;
        this.http2 = $.http2;
        this.http3 = $.http3;
        this.https = $.https;
        this.ocspStapling = $.ocspStapling;
        this.rule = $.rule;
        this.ruleEnable = $.ruleEnable;
        this.ruleName = $.ruleName;
        this.siteId = $.siteId;
        this.tls10 = $.tls10;
        this.tls11 = $.tls11;
        this.tls12 = $.tls12;
        this.tls13 = $.tls13;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpsBasicConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpsBasicConfigurationState $;

        public Builder() {
            $ = new HttpsBasicConfigurationState();
        }

        public Builder(HttpsBasicConfigurationState defaults) {
            $ = new HttpsBasicConfigurationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param ciphersuite Custom cipher suite, indicating the specific encryption algorithm selected when CiphersuiteGroup is set to custom.
         * 
         * @return builder
         * 
         */
        public Builder ciphersuite(@Nullable Output<String> ciphersuite) {
            $.ciphersuite = ciphersuite;
            return this;
        }

        /**
         * @param ciphersuite Custom cipher suite, indicating the specific encryption algorithm selected when CiphersuiteGroup is set to custom.
         * 
         * @return builder
         * 
         */
        public Builder ciphersuite(String ciphersuite) {
            return ciphersuite(Output.of(ciphersuite));
        }

        /**
         * @param ciphersuiteGroup Cipher suite group. Default is all cipher suites. Possible values:
         * - all: All cipher suites.
         * - strict: Strong cipher suites.
         * - custom: Custom cipher suites.
         * 
         * @return builder
         * 
         */
        public Builder ciphersuiteGroup(@Nullable Output<String> ciphersuiteGroup) {
            $.ciphersuiteGroup = ciphersuiteGroup;
            return this;
        }

        /**
         * @param ciphersuiteGroup Cipher suite group. Default is all cipher suites. Possible values:
         * - all: All cipher suites.
         * - strict: Strong cipher suites.
         * - custom: Custom cipher suites.
         * 
         * @return builder
         * 
         */
        public Builder ciphersuiteGroup(String ciphersuiteGroup) {
            return ciphersuiteGroup(Output.of(ciphersuiteGroup));
        }

        /**
         * @param configId ConfigId of the configuration, which can be obtained by calling the [ListHttpsBasicConfigurations](https://www.alibabacloud.com/help/en/doc-detail/2867470.html) interface.
         * 
         * @return builder
         * 
         */
        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId ConfigId of the configuration, which can be obtained by calling the [ListHttpsBasicConfigurations](https://www.alibabacloud.com/help/en/doc-detail/2867470.html) interface.
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param http2 Indicates whether HTTP2 is enabled. Default is on. Possible values:
         * - on: Enabled.
         * - off: Disabled.
         * 
         * @return builder
         * 
         */
        public Builder http2(@Nullable Output<String> http2) {
            $.http2 = http2;
            return this;
        }

        /**
         * @param http2 Indicates whether HTTP2 is enabled. Default is on. Possible values:
         * - on: Enabled.
         * - off: Disabled.
         * 
         * @return builder
         * 
         */
        public Builder http2(String http2) {
            return http2(Output.of(http2));
        }

        /**
         * @param http3 Whether to enable HTTP3, which is enabled by default. The value can be:
         * - on: Enabled.
         * - off: Disabled.
         * 
         * @return builder
         * 
         */
        public Builder http3(@Nullable Output<String> http3) {
            $.http3 = http3;
            return this;
        }

        /**
         * @param http3 Whether to enable HTTP3, which is enabled by default. The value can be:
         * - on: Enabled.
         * - off: Disabled.
         * 
         * @return builder
         * 
         */
        public Builder http3(String http3) {
            return http3(Output.of(http3));
        }

        /**
         * @param https Whether to enable HTTPS. Default is enabled. Possible values:
         * - on: Enable.
         * - off: Disable.
         * 
         * @return builder
         * 
         */
        public Builder https(@Nullable Output<String> https) {
            $.https = https;
            return this;
        }

        /**
         * @param https Whether to enable HTTPS. Default is enabled. Possible values:
         * - on: Enable.
         * - off: Disable.
         * 
         * @return builder
         * 
         */
        public Builder https(String https) {
            return https(Output.of(https));
        }

        /**
         * @param ocspStapling Indicates whether OCSP is enabled. Default is off. Possible values:
         * - on: Enabled.
         * - off: Disabled.
         * 
         * @return builder
         * 
         */
        public Builder ocspStapling(@Nullable Output<String> ocspStapling) {
            $.ocspStapling = ocspStapling;
            return this;
        }

        /**
         * @param ocspStapling Indicates whether OCSP is enabled. Default is off. Possible values:
         * - on: Enabled.
         * - off: Disabled.
         * 
         * @return builder
         * 
         */
        public Builder ocspStapling(String ocspStapling) {
            return ocspStapling(Output.of(ocspStapling));
        }

        /**
         * @param rule Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
         * -  Match all incoming requests: value set to true
         * -  Match specified request: Set the value to a custom expression, for example: (http.host eq \&#34;video.example.com\&#34;)
         * 
         * @return builder
         * 
         */
        public Builder rule(@Nullable Output<String> rule) {
            $.rule = rule;
            return this;
        }

        /**
         * @param rule Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
         * -  Match all incoming requests: value set to true
         * -  Match specified request: Set the value to a custom expression, for example: (http.host eq \&#34;video.example.com\&#34;)
         * 
         * @return builder
         * 
         */
        public Builder rule(String rule) {
            return rule(Output.of(rule));
        }

        /**
         * @param ruleEnable Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
         * - on: open.
         * - off: close.
         * 
         * @return builder
         * 
         */
        public Builder ruleEnable(@Nullable Output<String> ruleEnable) {
            $.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * @param ruleEnable Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
         * - on: open.
         * - off: close.
         * 
         * @return builder
         * 
         */
        public Builder ruleEnable(String ruleEnable) {
            return ruleEnable(Output.of(ruleEnable));
        }

        /**
         * @param ruleName Rule name. When adding global configuration, this parameter does not need to be set.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(@Nullable Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName Rule name. When adding global configuration, this parameter does not need to be set.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        /**
         * @param siteId Site ID, which can be obtained by calling the [ListSites](https://next.api.alibabacloud.com/document/ESA/2024-09-10/ListSites) interface.
         * 
         * @return builder
         * 
         */
        public Builder siteId(@Nullable Output<Integer> siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteId Site ID, which can be obtained by calling the [ListSites](https://next.api.alibabacloud.com/document/ESA/2024-09-10/ListSites) interface.
         * 
         * @return builder
         * 
         */
        public Builder siteId(Integer siteId) {
            return siteId(Output.of(siteId));
        }

        /**
         * @param tls10 Whether to enable TLS1.0. Default is disabled. Possible values:
         * - on: Enable.
         * - off: Disable.
         * 
         * @return builder
         * 
         */
        public Builder tls10(@Nullable Output<String> tls10) {
            $.tls10 = tls10;
            return this;
        }

        /**
         * @param tls10 Whether to enable TLS1.0. Default is disabled. Possible values:
         * - on: Enable.
         * - off: Disable.
         * 
         * @return builder
         * 
         */
        public Builder tls10(String tls10) {
            return tls10(Output.of(tls10));
        }

        /**
         * @param tls11 Whether to enable TLS1.1. Default is enabled. Possible values:
         * - on: Enable.
         * - off: Disable.
         * 
         * @return builder
         * 
         */
        public Builder tls11(@Nullable Output<String> tls11) {
            $.tls11 = tls11;
            return this;
        }

        /**
         * @param tls11 Whether to enable TLS1.1. Default is enabled. Possible values:
         * - on: Enable.
         * - off: Disable.
         * 
         * @return builder
         * 
         */
        public Builder tls11(String tls11) {
            return tls11(Output.of(tls11));
        }

        /**
         * @param tls12 Whether to enable TLS1.2. Default is enabled. Possible values:
         * - on: Enable.
         * - off: Disable.
         * 
         * @return builder
         * 
         */
        public Builder tls12(@Nullable Output<String> tls12) {
            $.tls12 = tls12;
            return this;
        }

        /**
         * @param tls12 Whether to enable TLS1.2. Default is enabled. Possible values:
         * - on: Enable.
         * - off: Disable.
         * 
         * @return builder
         * 
         */
        public Builder tls12(String tls12) {
            return tls12(Output.of(tls12));
        }

        /**
         * @param tls13 Whether to enable TLS1.3. Default is enabled. Possible values:
         * - on: Enable.
         * - off: Disable.
         * 
         * @return builder
         * 
         */
        public Builder tls13(@Nullable Output<String> tls13) {
            $.tls13 = tls13;
            return this;
        }

        /**
         * @param tls13 Whether to enable TLS1.3. Default is enabled. Possible values:
         * - on: Enable.
         * - off: Disable.
         * 
         * @return builder
         * 
         */
        public Builder tls13(String tls13) {
            return tls13(Output.of(tls13));
        }

        public HttpsBasicConfigurationState build() {
            return $;
        }
    }

}
