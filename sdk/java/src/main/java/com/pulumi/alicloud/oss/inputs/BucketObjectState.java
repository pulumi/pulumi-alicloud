// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketObjectState extends com.pulumi.resources.ResourceArgs {

    public static final BucketObjectState Empty = new BucketObjectState();

    /**
     * The [canned ACL](https://www.alibabacloud.com/help/doc-detail/52284.htm) to apply. Defaults to &#34;private&#34;.
     * 
     */
    @Import(name="acl")
    private @Nullable Output<String> acl;

    /**
     * @return The [canned ACL](https://www.alibabacloud.com/help/doc-detail/52284.htm) to apply. Defaults to &#34;private&#34;.
     * 
     */
    public Optional<Output<String>> acl() {
        return Optional.ofNullable(this.acl);
    }

    /**
     * The name of the bucket to put the file in.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the bucket to put the file in.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Specifies caching behavior along the request/reply chain. Read [RFC2616 Cache-Control](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     * 
     */
    @Import(name="cacheControl")
    private @Nullable Output<String> cacheControl;

    /**
     * @return Specifies caching behavior along the request/reply chain. Read [RFC2616 Cache-Control](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     * 
     */
    public Optional<Output<String>> cacheControl() {
        return Optional.ofNullable(this.cacheControl);
    }

    /**
     * The literal content being uploaded to the bucket.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The literal content being uploaded to the bucket.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * Specifies presentational information for the object. Read [RFC2616 Content-Disposition](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     * 
     */
    @Import(name="contentDisposition")
    private @Nullable Output<String> contentDisposition;

    /**
     * @return Specifies presentational information for the object. Read [RFC2616 Content-Disposition](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     * 
     */
    public Optional<Output<String>> contentDisposition() {
        return Optional.ofNullable(this.contentDisposition);
    }

    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [RFC2616 Content-Encoding](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     * 
     */
    @Import(name="contentEncoding")
    private @Nullable Output<String> contentEncoding;

    /**
     * @return Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [RFC2616 Content-Encoding](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     * 
     */
    public Optional<Output<String>> contentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }

    /**
     * the content length of request.
     * 
     */
    @Import(name="contentLength")
    private @Nullable Output<String> contentLength;

    /**
     * @return the content length of request.
     * 
     */
    public Optional<Output<String>> contentLength() {
        return Optional.ofNullable(this.contentLength);
    }

    /**
     * The MD5 value of the content. Read [MD5](https://www.alibabacloud.com/help/doc-detail/31978.htm) for computing method.
     * 
     */
    @Import(name="contentMd5")
    private @Nullable Output<String> contentMd5;

    /**
     * @return The MD5 value of the content. Read [MD5](https://www.alibabacloud.com/help/doc-detail/31978.htm) for computing method.
     * 
     */
    public Optional<Output<String>> contentMd5() {
        return Optional.ofNullable(this.contentMd5);
    }

    /**
     * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * the ETag generated for the object (an MD5 sum of the object content).
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return the ETag generated for the object (an MD5 sum of the object content).
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Specifies expire date for the the request/response. Read [RFC2616 Expires](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     * 
     */
    @Import(name="expires")
    private @Nullable Output<String> expires;

    /**
     * @return Specifies expire date for the the request/response. Read [RFC2616 Expires](https://www.ietf.org/rfc/rfc2616.txt) for further details.
     * 
     */
    public Optional<Output<String>> expires() {
        return Optional.ofNullable(this.expires);
    }

    /**
     * The name of the object once it is in the bucket.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The name of the object once it is in the bucket.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Specifies the primary key managed by KMS. This parameter is valid when the value of `server_side_encryption` is set to KMS.
     * 
     * Either `source` or `content` must be provided to specify the bucket content.
     * These two arguments are mutually-exclusive.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return Specifies the primary key managed by KMS. This parameter is valid when the value of `server_side_encryption` is set to KMS.
     * 
     * Either `source` or `content` must be provided to specify the bucket content.
     * These two arguments are mutually-exclusive.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * Specifies server-side encryption of the object in OSS. Valid values are `AES256`, `KMS`. Default value is `AES256`.
     * 
     */
    @Import(name="serverSideEncryption")
    private @Nullable Output<String> serverSideEncryption;

    /**
     * @return Specifies server-side encryption of the object in OSS. Valid values are `AES256`, `KMS`. Default value is `AES256`.
     * 
     */
    public Optional<Output<String>> serverSideEncryption() {
        return Optional.ofNullable(this.serverSideEncryption);
    }

    /**
     * The path to the source file being uploaded to the bucket.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The path to the source file being uploaded to the bucket.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * A unique version ID value for the object, if bucket versioning is enabled.
     * 
     */
    @Import(name="versionId")
    private @Nullable Output<String> versionId;

    /**
     * @return A unique version ID value for the object, if bucket versioning is enabled.
     * 
     */
    public Optional<Output<String>> versionId() {
        return Optional.ofNullable(this.versionId);
    }

    private BucketObjectState() {}

    private BucketObjectState(BucketObjectState $) {
        this.acl = $.acl;
        this.bucket = $.bucket;
        this.cacheControl = $.cacheControl;
        this.content = $.content;
        this.contentDisposition = $.contentDisposition;
        this.contentEncoding = $.contentEncoding;
        this.contentLength = $.contentLength;
        this.contentMd5 = $.contentMd5;
        this.contentType = $.contentType;
        this.etag = $.etag;
        this.expires = $.expires;
        this.key = $.key;
        this.kmsKeyId = $.kmsKeyId;
        this.serverSideEncryption = $.serverSideEncryption;
        this.source = $.source;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketObjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketObjectState $;

        public Builder() {
            $ = new BucketObjectState();
        }

        public Builder(BucketObjectState defaults) {
            $ = new BucketObjectState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acl The [canned ACL](https://www.alibabacloud.com/help/doc-detail/52284.htm) to apply. Defaults to &#34;private&#34;.
         * 
         * @return builder
         * 
         */
        public Builder acl(@Nullable Output<String> acl) {
            $.acl = acl;
            return this;
        }

        /**
         * @param acl The [canned ACL](https://www.alibabacloud.com/help/doc-detail/52284.htm) to apply. Defaults to &#34;private&#34;.
         * 
         * @return builder
         * 
         */
        public Builder acl(String acl) {
            return acl(Output.of(acl));
        }

        /**
         * @param bucket The name of the bucket to put the file in.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket to put the file in.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param cacheControl Specifies caching behavior along the request/reply chain. Read [RFC2616 Cache-Control](https://www.ietf.org/rfc/rfc2616.txt) for further details.
         * 
         * @return builder
         * 
         */
        public Builder cacheControl(@Nullable Output<String> cacheControl) {
            $.cacheControl = cacheControl;
            return this;
        }

        /**
         * @param cacheControl Specifies caching behavior along the request/reply chain. Read [RFC2616 Cache-Control](https://www.ietf.org/rfc/rfc2616.txt) for further details.
         * 
         * @return builder
         * 
         */
        public Builder cacheControl(String cacheControl) {
            return cacheControl(Output.of(cacheControl));
        }

        /**
         * @param content The literal content being uploaded to the bucket.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The literal content being uploaded to the bucket.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param contentDisposition Specifies presentational information for the object. Read [RFC2616 Content-Disposition](https://www.ietf.org/rfc/rfc2616.txt) for further details.
         * 
         * @return builder
         * 
         */
        public Builder contentDisposition(@Nullable Output<String> contentDisposition) {
            $.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * @param contentDisposition Specifies presentational information for the object. Read [RFC2616 Content-Disposition](https://www.ietf.org/rfc/rfc2616.txt) for further details.
         * 
         * @return builder
         * 
         */
        public Builder contentDisposition(String contentDisposition) {
            return contentDisposition(Output.of(contentDisposition));
        }

        /**
         * @param contentEncoding Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [RFC2616 Content-Encoding](https://www.ietf.org/rfc/rfc2616.txt) for further details.
         * 
         * @return builder
         * 
         */
        public Builder contentEncoding(@Nullable Output<String> contentEncoding) {
            $.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * @param contentEncoding Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [RFC2616 Content-Encoding](https://www.ietf.org/rfc/rfc2616.txt) for further details.
         * 
         * @return builder
         * 
         */
        public Builder contentEncoding(String contentEncoding) {
            return contentEncoding(Output.of(contentEncoding));
        }

        /**
         * @param contentLength the content length of request.
         * 
         * @return builder
         * 
         */
        public Builder contentLength(@Nullable Output<String> contentLength) {
            $.contentLength = contentLength;
            return this;
        }

        /**
         * @param contentLength the content length of request.
         * 
         * @return builder
         * 
         */
        public Builder contentLength(String contentLength) {
            return contentLength(Output.of(contentLength));
        }

        /**
         * @param contentMd5 The MD5 value of the content. Read [MD5](https://www.alibabacloud.com/help/doc-detail/31978.htm) for computing method.
         * 
         * @return builder
         * 
         */
        public Builder contentMd5(@Nullable Output<String> contentMd5) {
            $.contentMd5 = contentMd5;
            return this;
        }

        /**
         * @param contentMd5 The MD5 value of the content. Read [MD5](https://www.alibabacloud.com/help/doc-detail/31978.htm) for computing method.
         * 
         * @return builder
         * 
         */
        public Builder contentMd5(String contentMd5) {
            return contentMd5(Output.of(contentMd5));
        }

        /**
         * @param contentType A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param etag the ETag generated for the object (an MD5 sum of the object content).
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag the ETag generated for the object (an MD5 sum of the object content).
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param expires Specifies expire date for the the request/response. Read [RFC2616 Expires](https://www.ietf.org/rfc/rfc2616.txt) for further details.
         * 
         * @return builder
         * 
         */
        public Builder expires(@Nullable Output<String> expires) {
            $.expires = expires;
            return this;
        }

        /**
         * @param expires Specifies expire date for the the request/response. Read [RFC2616 Expires](https://www.ietf.org/rfc/rfc2616.txt) for further details.
         * 
         * @return builder
         * 
         */
        public Builder expires(String expires) {
            return expires(Output.of(expires));
        }

        /**
         * @param key The name of the object once it is in the bucket.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The name of the object once it is in the bucket.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param kmsKeyId Specifies the primary key managed by KMS. This parameter is valid when the value of `server_side_encryption` is set to KMS.
         * 
         * Either `source` or `content` must be provided to specify the bucket content.
         * These two arguments are mutually-exclusive.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId Specifies the primary key managed by KMS. This parameter is valid when the value of `server_side_encryption` is set to KMS.
         * 
         * Either `source` or `content` must be provided to specify the bucket content.
         * These two arguments are mutually-exclusive.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param serverSideEncryption Specifies server-side encryption of the object in OSS. Valid values are `AES256`, `KMS`. Default value is `AES256`.
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryption(@Nullable Output<String> serverSideEncryption) {
            $.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * @param serverSideEncryption Specifies server-side encryption of the object in OSS. Valid values are `AES256`, `KMS`. Default value is `AES256`.
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryption(String serverSideEncryption) {
            return serverSideEncryption(Output.of(serverSideEncryption));
        }

        /**
         * @param source The path to the source file being uploaded to the bucket.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The path to the source file being uploaded to the bucket.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param versionId A unique version ID value for the object, if bucket versioning is enabled.
         * 
         * @return builder
         * 
         */
        public Builder versionId(@Nullable Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        /**
         * @param versionId A unique version ID value for the object, if bucket versioning is enabled.
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public BucketObjectState build() {
            return $;
        }
    }

}