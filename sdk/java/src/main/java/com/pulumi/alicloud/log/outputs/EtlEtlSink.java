// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EtlEtlSink {
    /**
     * @return Delivery target logstore access key id.
     * 
     */
    private @Nullable String accessKeyId;
    /**
     * @return Delivery target logstore access key secret.
     * 
     */
    private @Nullable String accessKeySecret;
    /**
     * @return Delivery target logstore region.
     * 
     */
    private String endpoint;
    /**
     * @return An KMS encrypts access key id used to a log etl job. If the `access_key_id` is filled in, this field will be ignored.
     * 
     */
    private @Nullable String kmsEncryptedAccessKeyId;
    /**
     * @return An KMS encrypts access key secret used to a log etl job. If the `access_key_secret` is filled in, this field will be ignored.
     * 
     */
    private @Nullable String kmsEncryptedAccessKeySecret;
    /**
     * @return Delivery target logstore.
     * 
     */
    private String logstore;
    /**
     * @return Delivery target name.
     * 
     */
    private String name;
    /**
     * @return The project where the target logstore is delivered.
     * 
     */
    private String project;
    /**
     * @return Sts role info under delivery target logstore. `role_arn` and `(access_key_id, access_key_secret)` fill in at most one. If you do not fill in both, then you must fill in `(kms_encrypted_access_key_id, kms_encrypted_access_key_secret, kms_encryption_access_key_id_context, kms_encryption_access_key_secret_context)` to use KMS to get the key pair.
     * 
     */
    private @Nullable String roleArn;
    /**
     * @return ETL sinks type, the default value is AliyunLOG.
     * 
     * &gt; **Note:** `from_time` and `to_time` no modification allowed after successful creation.
     * 
     */
    private @Nullable String type;

    private EtlEtlSink() {}
    /**
     * @return Delivery target logstore access key id.
     * 
     */
    public Optional<String> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }
    /**
     * @return Delivery target logstore access key secret.
     * 
     */
    public Optional<String> accessKeySecret() {
        return Optional.ofNullable(this.accessKeySecret);
    }
    /**
     * @return Delivery target logstore region.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return An KMS encrypts access key id used to a log etl job. If the `access_key_id` is filled in, this field will be ignored.
     * 
     */
    public Optional<String> kmsEncryptedAccessKeyId() {
        return Optional.ofNullable(this.kmsEncryptedAccessKeyId);
    }
    /**
     * @return An KMS encrypts access key secret used to a log etl job. If the `access_key_secret` is filled in, this field will be ignored.
     * 
     */
    public Optional<String> kmsEncryptedAccessKeySecret() {
        return Optional.ofNullable(this.kmsEncryptedAccessKeySecret);
    }
    /**
     * @return Delivery target logstore.
     * 
     */
    public String logstore() {
        return this.logstore;
    }
    /**
     * @return Delivery target name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The project where the target logstore is delivered.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return Sts role info under delivery target logstore. `role_arn` and `(access_key_id, access_key_secret)` fill in at most one. If you do not fill in both, then you must fill in `(kms_encrypted_access_key_id, kms_encrypted_access_key_secret, kms_encryption_access_key_id_context, kms_encryption_access_key_secret_context)` to use KMS to get the key pair.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return ETL sinks type, the default value is AliyunLOG.
     * 
     * &gt; **Note:** `from_time` and `to_time` no modification allowed after successful creation.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EtlEtlSink defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessKeyId;
        private @Nullable String accessKeySecret;
        private String endpoint;
        private @Nullable String kmsEncryptedAccessKeyId;
        private @Nullable String kmsEncryptedAccessKeySecret;
        private String logstore;
        private String name;
        private String project;
        private @Nullable String roleArn;
        private @Nullable String type;
        public Builder() {}
        public Builder(EtlEtlSink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.accessKeySecret = defaults.accessKeySecret;
    	      this.endpoint = defaults.endpoint;
    	      this.kmsEncryptedAccessKeyId = defaults.kmsEncryptedAccessKeyId;
    	      this.kmsEncryptedAccessKeySecret = defaults.kmsEncryptedAccessKeySecret;
    	      this.logstore = defaults.logstore;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.roleArn = defaults.roleArn;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder accessKeyId(@Nullable String accessKeyId) {

            this.accessKeyId = accessKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder accessKeySecret(@Nullable String accessKeySecret) {

            this.accessKeySecret = accessKeySecret;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            if (endpoint == null) {
              throw new MissingRequiredPropertyException("EtlEtlSink", "endpoint");
            }
            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder kmsEncryptedAccessKeyId(@Nullable String kmsEncryptedAccessKeyId) {

            this.kmsEncryptedAccessKeyId = kmsEncryptedAccessKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder kmsEncryptedAccessKeySecret(@Nullable String kmsEncryptedAccessKeySecret) {

            this.kmsEncryptedAccessKeySecret = kmsEncryptedAccessKeySecret;
            return this;
        }
        @CustomType.Setter
        public Builder logstore(String logstore) {
            if (logstore == null) {
              throw new MissingRequiredPropertyException("EtlEtlSink", "logstore");
            }
            this.logstore = logstore;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("EtlEtlSink", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("EtlEtlSink", "project");
            }
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(@Nullable String roleArn) {

            this.roleArn = roleArn;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public EtlEtlSink build() {
            final var _resultValue = new EtlEtlSink();
            _resultValue.accessKeyId = accessKeyId;
            _resultValue.accessKeySecret = accessKeySecret;
            _resultValue.endpoint = endpoint;
            _resultValue.kmsEncryptedAccessKeyId = kmsEncryptedAccessKeyId;
            _resultValue.kmsEncryptedAccessKeySecret = kmsEncryptedAccessKeySecret;
            _resultValue.logstore = logstore;
            _resultValue.name = name;
            _resultValue.project = project;
            _resultValue.roleArn = roleArn;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
