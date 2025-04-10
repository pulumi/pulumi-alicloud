// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SiteDeliveryTaskS3DeliveryArgs extends com.pulumi.resources.ResourceArgs {

    public static final SiteDeliveryTaskS3DeliveryArgs Empty = new SiteDeliveryTaskS3DeliveryArgs();

    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    @Import(name="bucketPath")
    private @Nullable Output<String> bucketPath;

    public Optional<Output<String>> bucketPath() {
        return Optional.ofNullable(this.bucketPath);
    }

    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    @Import(name="prefixPath")
    private @Nullable Output<String> prefixPath;

    public Optional<Output<String>> prefixPath() {
        return Optional.ofNullable(this.prefixPath);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="s3Cmpt")
    private @Nullable Output<Boolean> s3Cmpt;

    public Optional<Output<Boolean>> s3Cmpt() {
        return Optional.ofNullable(this.s3Cmpt);
    }

    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    /**
     * Server-side encryption
     * 
     */
    @Import(name="serverSideEncryption")
    private @Nullable Output<Boolean> serverSideEncryption;

    /**
     * @return Server-side encryption
     * 
     */
    public Optional<Output<Boolean>> serverSideEncryption() {
        return Optional.ofNullable(this.serverSideEncryption);
    }

    /**
     * Authentication Type
     * 
     */
    @Import(name="vertifyType")
    private @Nullable Output<String> vertifyType;

    /**
     * @return Authentication Type
     * 
     */
    public Optional<Output<String>> vertifyType() {
        return Optional.ofNullable(this.vertifyType);
    }

    private SiteDeliveryTaskS3DeliveryArgs() {}

    private SiteDeliveryTaskS3DeliveryArgs(SiteDeliveryTaskS3DeliveryArgs $) {
        this.accessKey = $.accessKey;
        this.bucketPath = $.bucketPath;
        this.endpoint = $.endpoint;
        this.prefixPath = $.prefixPath;
        this.region = $.region;
        this.s3Cmpt = $.s3Cmpt;
        this.secretKey = $.secretKey;
        this.serverSideEncryption = $.serverSideEncryption;
        this.vertifyType = $.vertifyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SiteDeliveryTaskS3DeliveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SiteDeliveryTaskS3DeliveryArgs $;

        public Builder() {
            $ = new SiteDeliveryTaskS3DeliveryArgs();
        }

        public Builder(SiteDeliveryTaskS3DeliveryArgs defaults) {
            $ = new SiteDeliveryTaskS3DeliveryArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        public Builder bucketPath(@Nullable Output<String> bucketPath) {
            $.bucketPath = bucketPath;
            return this;
        }

        public Builder bucketPath(String bucketPath) {
            return bucketPath(Output.of(bucketPath));
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder prefixPath(@Nullable Output<String> prefixPath) {
            $.prefixPath = prefixPath;
            return this;
        }

        public Builder prefixPath(String prefixPath) {
            return prefixPath(Output.of(prefixPath));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder s3Cmpt(@Nullable Output<Boolean> s3Cmpt) {
            $.s3Cmpt = s3Cmpt;
            return this;
        }

        public Builder s3Cmpt(Boolean s3Cmpt) {
            return s3Cmpt(Output.of(s3Cmpt));
        }

        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param serverSideEncryption Server-side encryption
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryption(@Nullable Output<Boolean> serverSideEncryption) {
            $.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * @param serverSideEncryption Server-side encryption
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryption(Boolean serverSideEncryption) {
            return serverSideEncryption(Output.of(serverSideEncryption));
        }

        /**
         * @param vertifyType Authentication Type
         * 
         * @return builder
         * 
         */
        public Builder vertifyType(@Nullable Output<String> vertifyType) {
            $.vertifyType = vertifyType;
            return this;
        }

        /**
         * @param vertifyType Authentication Type
         * 
         * @return builder
         * 
         */
        public Builder vertifyType(String vertifyType) {
            return vertifyType(Output.of(vertifyType));
        }

        public SiteDeliveryTaskS3DeliveryArgs build() {
            return $;
        }
    }

}
