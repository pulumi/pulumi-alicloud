// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessKeyState extends com.pulumi.resources.ResourceArgs {

    public static final AccessKeyState Empty = new AccessKeyState();

    /**
     * (Available since v1.246.0) The create time of the AccessKey.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return (Available since v1.246.0) The create time of the AccessKey.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    @Import(name="encryptedSecret")
    private @Nullable Output<String> encryptedSecret;

    public Optional<Output<String>> encryptedSecret() {
        return Optional.ofNullable(this.encryptedSecret);
    }

    /**
     * (Available since v1.47.0) The fingerprint of the PGP key used to encrypt the secret
     * 
     */
    @Import(name="keyFingerprint")
    private @Nullable Output<String> keyFingerprint;

    /**
     * @return (Available since v1.47.0) The fingerprint of the PGP key used to encrypt the secret
     * 
     */
    public Optional<Output<String>> keyFingerprint() {
        return Optional.ofNullable(this.keyFingerprint);
    }

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
     * (Available since v1.98.0) The secret access key. Note that this will be written to the state file.
     * If you use this, please protect your backend state file judiciously.
     * Alternatively, you may supply a `pgp_key` instead, which will prevent the secret from being stored in plaintext,
     * at the cost of preventing the use of the secret key in automation.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return (Available since v1.98.0) The secret access key. Note that this will be written to the state file.
     * If you use this, please protect your backend state file judiciously.
     * Alternatively, you may supply a `pgp_key` instead, which will prevent the secret from being stored in plaintext,
     * at the cost of preventing the use of the secret key in automation.
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
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
     * The status of the AccessKey. Value:
     * - Active: Activated.
     * - Inactive: Disabled.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the AccessKey. Value:
     * - Active: Activated.
     * - Inactive: Disabled.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The RAM user name.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The RAM user name.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private AccessKeyState() {}

    private AccessKeyState(AccessKeyState $) {
        this.createTime = $.createTime;
        this.encryptedSecret = $.encryptedSecret;
        this.keyFingerprint = $.keyFingerprint;
        this.pgpKey = $.pgpKey;
        this.secret = $.secret;
        this.secretFile = $.secretFile;
        this.status = $.status;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessKeyState $;

        public Builder() {
            $ = new AccessKeyState();
        }

        public Builder(AccessKeyState defaults) {
            $ = new AccessKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime (Available since v1.246.0) The create time of the AccessKey.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime (Available since v1.246.0) The create time of the AccessKey.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        public Builder encryptedSecret(@Nullable Output<String> encryptedSecret) {
            $.encryptedSecret = encryptedSecret;
            return this;
        }

        public Builder encryptedSecret(String encryptedSecret) {
            return encryptedSecret(Output.of(encryptedSecret));
        }

        /**
         * @param keyFingerprint (Available since v1.47.0) The fingerprint of the PGP key used to encrypt the secret
         * 
         * @return builder
         * 
         */
        public Builder keyFingerprint(@Nullable Output<String> keyFingerprint) {
            $.keyFingerprint = keyFingerprint;
            return this;
        }

        /**
         * @param keyFingerprint (Available since v1.47.0) The fingerprint of the PGP key used to encrypt the secret
         * 
         * @return builder
         * 
         */
        public Builder keyFingerprint(String keyFingerprint) {
            return keyFingerprint(Output.of(keyFingerprint));
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
         * @param secret (Available since v1.98.0) The secret access key. Note that this will be written to the state file.
         * If you use this, please protect your backend state file judiciously.
         * Alternatively, you may supply a `pgp_key` instead, which will prevent the secret from being stored in plaintext,
         * at the cost of preventing the use of the secret key in automation.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret (Available since v1.98.0) The secret access key. Note that this will be written to the state file.
         * If you use this, please protect your backend state file judiciously.
         * Alternatively, you may supply a `pgp_key` instead, which will prevent the secret from being stored in plaintext,
         * at the cost of preventing the use of the secret key in automation.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
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
         * @param status The status of the AccessKey. Value:
         * - Active: Activated.
         * - Inactive: Disabled.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the AccessKey. Value:
         * - Active: Activated.
         * - Inactive: Disabled.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param userName The RAM user name.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The RAM user name.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public AccessKeyState build() {
            return $;
        }
    }

}
