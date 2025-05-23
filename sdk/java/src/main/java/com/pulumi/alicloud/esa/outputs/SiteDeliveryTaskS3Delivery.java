// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SiteDeliveryTaskS3Delivery {
    private @Nullable String accessKey;
    private @Nullable String bucketPath;
    private @Nullable String endpoint;
    private @Nullable String prefixPath;
    private @Nullable String region;
    private @Nullable Boolean s3Cmpt;
    private @Nullable String secretKey;
    /**
     * @return Server-side encryption
     * 
     */
    private @Nullable Boolean serverSideEncryption;
    /**
     * @return Authentication Type
     * 
     */
    private @Nullable String vertifyType;

    private SiteDeliveryTaskS3Delivery() {}
    public Optional<String> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    public Optional<String> bucketPath() {
        return Optional.ofNullable(this.bucketPath);
    }
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    public Optional<String> prefixPath() {
        return Optional.ofNullable(this.prefixPath);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public Optional<Boolean> s3Cmpt() {
        return Optional.ofNullable(this.s3Cmpt);
    }
    public Optional<String> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }
    /**
     * @return Server-side encryption
     * 
     */
    public Optional<Boolean> serverSideEncryption() {
        return Optional.ofNullable(this.serverSideEncryption);
    }
    /**
     * @return Authentication Type
     * 
     */
    public Optional<String> vertifyType() {
        return Optional.ofNullable(this.vertifyType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteDeliveryTaskS3Delivery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessKey;
        private @Nullable String bucketPath;
        private @Nullable String endpoint;
        private @Nullable String prefixPath;
        private @Nullable String region;
        private @Nullable Boolean s3Cmpt;
        private @Nullable String secretKey;
        private @Nullable Boolean serverSideEncryption;
        private @Nullable String vertifyType;
        public Builder() {}
        public Builder(SiteDeliveryTaskS3Delivery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.bucketPath = defaults.bucketPath;
    	      this.endpoint = defaults.endpoint;
    	      this.prefixPath = defaults.prefixPath;
    	      this.region = defaults.region;
    	      this.s3Cmpt = defaults.s3Cmpt;
    	      this.secretKey = defaults.secretKey;
    	      this.serverSideEncryption = defaults.serverSideEncryption;
    	      this.vertifyType = defaults.vertifyType;
        }

        @CustomType.Setter
        public Builder accessKey(@Nullable String accessKey) {

            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder bucketPath(@Nullable String bucketPath) {

            this.bucketPath = bucketPath;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(@Nullable String endpoint) {

            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder prefixPath(@Nullable String prefixPath) {

            this.prefixPath = prefixPath;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder s3Cmpt(@Nullable Boolean s3Cmpt) {

            this.s3Cmpt = s3Cmpt;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(@Nullable String secretKey) {

            this.secretKey = secretKey;
            return this;
        }
        @CustomType.Setter
        public Builder serverSideEncryption(@Nullable Boolean serverSideEncryption) {

            this.serverSideEncryption = serverSideEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder vertifyType(@Nullable String vertifyType) {

            this.vertifyType = vertifyType;
            return this;
        }
        public SiteDeliveryTaskS3Delivery build() {
            final var _resultValue = new SiteDeliveryTaskS3Delivery();
            _resultValue.accessKey = accessKey;
            _resultValue.bucketPath = bucketPath;
            _resultValue.endpoint = endpoint;
            _resultValue.prefixPath = prefixPath;
            _resultValue.region = region;
            _resultValue.s3Cmpt = s3Cmpt;
            _resultValue.secretKey = secretKey;
            _resultValue.serverSideEncryption = serverSideEncryption;
            _resultValue.vertifyType = vertifyType;
            return _resultValue;
        }
    }
}
