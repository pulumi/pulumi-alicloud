// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketTransferAccelerationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketTransferAccelerationArgs Empty = new BucketTransferAccelerationArgs();

    /**
     * The name of the Bucket.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the Bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Specifies whether to enable transfer acceleration for the bucket. Valid values: true: transfer acceleration for the bucket is enabled. false: transfer acceleration for the bucket is disabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies whether to enable transfer acceleration for the bucket. Valid values: true: transfer acceleration for the bucket is enabled. false: transfer acceleration for the bucket is disabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private BucketTransferAccelerationArgs() {}

    private BucketTransferAccelerationArgs(BucketTransferAccelerationArgs $) {
        this.bucket = $.bucket;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketTransferAccelerationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketTransferAccelerationArgs $;

        public Builder() {
            $ = new BucketTransferAccelerationArgs();
        }

        public Builder(BucketTransferAccelerationArgs defaults) {
            $ = new BucketTransferAccelerationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the Bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the Bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param enabled Specifies whether to enable transfer acceleration for the bucket. Valid values: true: transfer acceleration for the bucket is enabled. false: transfer acceleration for the bucket is disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether to enable transfer acceleration for the bucket. Valid values: true: transfer acceleration for the bucket is enabled. false: transfer acceleration for the bucket is disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public BucketTransferAccelerationArgs build() {
            if ($.bucket == null) {
                throw new MissingRequiredPropertyException("BucketTransferAccelerationArgs", "bucket");
            }
            return $;
        }
    }

}