// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketMetaQueryState extends com.pulumi.resources.ResourceArgs {

    public static final BucketMetaQueryState Empty = new BucketMetaQueryState();

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * The creation time of the metadata index database. The format is mm:ss + TIMEZONE in the YYYY-MM-DDTHH format of RFC 3339. Where YYYY-MM-DD indicates the year, month and day, T indicates the beginning of the time element, HH:mm:ss indicates the hour, minute and second, and TIMEZONE indicates the time zone.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation time of the metadata index database. The format is mm:ss + TIMEZONE in the YYYY-MM-DDTHH format of RFC 3339. Where YYYY-MM-DD indicates the year, month and day, T indicates the beginning of the time element, HH:mm:ss indicates the hour, minute and second, and TIMEZONE indicates the time zone.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The status of the resource.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private BucketMetaQueryState() {}

    private BucketMetaQueryState(BucketMetaQueryState $) {
        this.bucket = $.bucket;
        this.createTime = $.createTime;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketMetaQueryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketMetaQueryState $;

        public Builder() {
            $ = new BucketMetaQueryState();
        }

        public Builder(BucketMetaQueryState defaults) {
            $ = new BucketMetaQueryState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param createTime The creation time of the metadata index database. The format is mm:ss + TIMEZONE in the YYYY-MM-DDTHH format of RFC 3339. Where YYYY-MM-DD indicates the year, month and day, T indicates the beginning of the time element, HH:mm:ss indicates the hour, minute and second, and TIMEZONE indicates the time zone.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation time of the metadata index database. The format is mm:ss + TIMEZONE in the YYYY-MM-DDTHH format of RFC 3339. Where YYYY-MM-DD indicates the year, month and day, T indicates the beginning of the time element, HH:mm:ss indicates the hour, minute and second, and TIMEZONE indicates the time zone.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public BucketMetaQueryState build() {
            return $;
        }
    }

}