// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessKeyArgs Empty = new AccessKeyArgs();

    /**
     * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`
     * 
     */
    @Import(name="pgpKey")
    private @Nullable Output<String> pgpKey;

    /**
     * @return Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`
     * 
     */
    public Optional<Output<String>> pgpKey() {
        return Optional.ofNullable(this.pgpKey);
    }

    /**
     * The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn&#39;t get its secret ever.
     * 
     */
    @Import(name="secretFile")
    private @Nullable Output<String> secretFile;

    /**
     * @return The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn&#39;t get its secret ever.
     * 
     */
    public Optional<Output<String>> secretFile() {
        return Optional.ofNullable(this.secretFile);
    }

    /**
     * Status of access key. It must be `Active` or `Inactive`. Default value is `Active`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of access key. It must be `Active` or `Inactive`. Default value is `Active`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private AccessKeyArgs() {}

    private AccessKeyArgs(AccessKeyArgs $) {
        this.pgpKey = $.pgpKey;
        this.secretFile = $.secretFile;
        this.status = $.status;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessKeyArgs $;

        public Builder() {
            $ = new AccessKeyArgs();
        }

        public Builder(AccessKeyArgs defaults) {
            $ = new AccessKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pgpKey Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`
         * 
         * @return builder
         * 
         */
        public Builder pgpKey(@Nullable Output<String> pgpKey) {
            $.pgpKey = pgpKey;
            return this;
        }

        /**
         * @param pgpKey Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`
         * 
         * @return builder
         * 
         */
        public Builder pgpKey(String pgpKey) {
            return pgpKey(Output.of(pgpKey));
        }

        /**
         * @param secretFile The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn&#39;t get its secret ever.
         * 
         * @return builder
         * 
         */
        public Builder secretFile(@Nullable Output<String> secretFile) {
            $.secretFile = secretFile;
            return this;
        }

        /**
         * @param secretFile The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn&#39;t get its secret ever.
         * 
         * @return builder
         * 
         */
        public Builder secretFile(String secretFile) {
            return secretFile(Output.of(secretFile));
        }

        /**
         * @param status Status of access key. It must be `Active` or `Inactive`. Default value is `Active`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of access key. It must be `Active` or `Inactive`. Default value is `Active`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param userName Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public AccessKeyArgs build() {
            return $;
        }
    }

}