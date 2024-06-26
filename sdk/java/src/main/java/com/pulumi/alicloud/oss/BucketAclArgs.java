// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class BucketAclArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketAclArgs Empty = new BucketAclArgs();

    /**
     * Bucket-level Access Control List (ACL)，Valid values: `private`, `public-read`, `public-read-write`.
     * 
     */
    @Import(name="acl", required=true)
    private Output<String> acl;

    /**
     * @return Bucket-level Access Control List (ACL)，Valid values: `private`, `public-read`, `public-read-write`.
     * 
     */
    public Output<String> acl() {
        return this.acl;
    }

    /**
     * The name of the bucket to which the current ACL configuration belongs.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the bucket to which the current ACL configuration belongs.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    private BucketAclArgs() {}

    private BucketAclArgs(BucketAclArgs $) {
        this.acl = $.acl;
        this.bucket = $.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketAclArgs $;

        public Builder() {
            $ = new BucketAclArgs();
        }

        public Builder(BucketAclArgs defaults) {
            $ = new BucketAclArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acl Bucket-level Access Control List (ACL)，Valid values: `private`, `public-read`, `public-read-write`.
         * 
         * @return builder
         * 
         */
        public Builder acl(Output<String> acl) {
            $.acl = acl;
            return this;
        }

        /**
         * @param acl Bucket-level Access Control List (ACL)，Valid values: `private`, `public-read`, `public-read-write`.
         * 
         * @return builder
         * 
         */
        public Builder acl(String acl) {
            return acl(Output.of(acl));
        }

        /**
         * @param bucket The name of the bucket to which the current ACL configuration belongs.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket to which the current ACL configuration belongs.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public BucketAclArgs build() {
            if ($.acl == null) {
                throw new MissingRequiredPropertyException("BucketAclArgs", "acl");
            }
            if ($.bucket == null) {
                throw new MissingRequiredPropertyException("BucketAclArgs", "bucket");
            }
            return $;
        }
    }

}
